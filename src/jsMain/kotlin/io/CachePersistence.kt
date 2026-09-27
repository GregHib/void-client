package io

import kotlinx.browser.window
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.Int8Array
import kotlin.js.unsafeCast

/**
 * Bridges the volatile [MemFs] to [IndexedDbStore] so the ~200MB JS5 cache survives a reload
 * instead of re-streaming over the socket every session.
 *
 * Reads stay synchronous: [hydrate] is the one async step, run once before the game boots, that
 * fills MemFs from IndexedDB. Writes also stay synchronous against MemFile - only the periodic
 * flush talks to IndexedDB, so sector-sized writes into a streaming dat2 don't each pay for an
 * async round trip.
 *
 * Files are stored as [CHUNK_SIZE] chunk records (`path#index`) plus a `path` record holding the
 * size, and a flush writes only the chunks written since the last one. Writing whole files froze
 * the game for ~350ms every flush while the cache downloaded, as dat2 was copied and
 * structured-cloned in full each time; one chunk per step keeps each task to a couple of ms.
 */
object CachePersistence {

    suspend fun hydrate() {
        val stored = try {
            IndexedDbStore.getAll()
        } catch (e: Throwable) {
            console.error("CachePersistence: hydrate failed, starting with an empty cache", e)
            return
        }
        val chunks = HashMap<String, MutableList<dynamic>>()
        for (record in stored) {
            val path = record.path as String
            if (record.file != undefined) {
                chunks.getOrPut(record.file as String) { mutableListOf() }.add(record)
                continue
            }
            val file = MemFile()
            if (record.size != undefined) {
                file.size = record.size as Int
                file.data = ByteArray(file.size)
            } else {
                // Whole-file record from before chunking: rewrite it as chunks on the next flush.
                file.data = Int8Array(record.bytes as ArrayBuffer).unsafeCast<ByteArray>()
                file.size = file.data.size
                file.markDirty(0, file.size)
                MemFs.dirtyPaths.add(path)
            }
            MemFs.files[path] = file
            MemFs.mkdirs(MemFs.parentOf(path))
        }
        for ((path, records) in chunks) {
            val file = MemFs.files[path] ?: continue
            val target = file.data.unsafeCast<Int8Array>()
            for (record in records) {
                val start = (record.chunk as Int) * CHUNK_SIZE
                val length = minOf((record.bytes as ArrayBuffer).byteLength, file.size - start)
                if (length > 0) target.set(Int8Array(record.bytes as ArrayBuffer, 0, length), start)
            }
        }
        requestPersistentStorage()
    }

    fun startAutoFlush(intervalMs: Int = 5000) {
        GlobalScope.launch {
            while (true) {
                delay(intervalMs.toLong())
                flushDirty()
            }
        }
    }

    /**
     * Flushes a single path immediately instead of waiting for the next periodic [flushDirty].
     * Used for small, latency-sensitive writes (e.g. the graphics-options file) that would
     * otherwise be lost if the tab closes before the next 5s tick.
     */
    suspend fun flushPath(path: String) {
        val key = MemFs.normalise(path)
        // A pending delete must run first, which only flushDirty orders correctly.
        if (key in MemFs.pendingDeletes) return
        if (!MemFs.dirtyPaths.remove(key)) return
        val file = MemFs.files[key] ?: return
        persist(key, file)
    }

    private suspend fun flushDirty() {
        // Deletes go first so a path deleted and recreated since the last flush loses its old chunks.
        val deletes = MemFs.pendingDeletes.toList()
        MemFs.pendingDeletes.removeAll(deletes)
        for (path in deletes) {
            try {
                IndexedDbStore.delete(path)
                IndexedDbStore.delete(chunkKey(path, ""), chunkKey(path, "￿"))
            } catch (e: Throwable) {
                console.error("CachePersistence: failed to delete $path", e)
                MemFs.pendingDeletes.add(path)
            }
        }

        val dirty = MemFs.dirtyPaths.toList()
        MemFs.dirtyPaths.removeAll(dirty)
        for (path in dirty) {
            val file = MemFs.files[path] ?: continue
            persist(path, file)
        }
    }

    /** Writes [file]'s dirty chunks, each copied just before its put so it can't be stale. */
    private suspend fun persist(path: String, file: MemFile) {
        val chunks = file.dirtyChunks.sorted()
        file.dirtyChunks.clear()
        try {
            for (chunk in chunks) {
                val start = chunk * CHUNK_SIZE
                if (start >= file.size) {
                    IndexedDbStore.delete(chunkKey(path, chunk.toString()))
                    continue
                }
                val end = minOf(start + CHUNK_SIZE, file.size)
                val record = js("({})")
                record.path = chunkKey(path, chunk.toString())
                record.file = path
                record.chunk = chunk
                record.bytes = file.data.unsafeCast<Int8Array>().asDynamic().slice(start, end).buffer
                IndexedDbStore.put(record)
            }
            val record = js("({})")
            record.path = path
            record.size = file.size
            IndexedDbStore.put(record)
        } catch (e: Throwable) {
            console.error("CachePersistence: failed to persist $path", e)
            file.dirtyChunks.addAll(chunks)
            MemFs.dirtyPaths.add(path)
        }
    }

    private fun chunkKey(path: String, chunk: String) = "$path#$chunk"

    private fun requestPersistentStorage() {
        try {
            val storage = window.navigator.asDynamic().storage
            storage?.persist()
        } catch (e: Throwable) {
            // Best-effort: quota persistence isn't supported everywhere.
        }
    }
}
