package io

import kotlinx.browser.window
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Bridges the volatile [MemFs] to [IndexedDbStore] so the ~200MB JS5 cache survives a reload
 * instead of re-streaming over the socket every session.
 *
 * Reads stay synchronous: [hydrate] is the one async step, run once before the game boots, that
 * fills MemFs from IndexedDB. Writes also stay synchronous against MemFile - only the periodic
 * flush talks to IndexedDB, so sector-sized writes into a streaming dat2 don't each pay for an
 * async round trip.
 */
object CachePersistence {

    suspend fun hydrate() {
        val stored = try {
            IndexedDbStore.getAll()
        } catch (e: Throwable) {
            console.error("CachePersistence: hydrate failed, starting with an empty cache", e)
            return
        }
        for ((path, bytes) in stored) {
            val file = MemFile()
            file.data = bytes
            file.size = bytes.size
            MemFs.files[path] = file
            MemFs.mkdirs(MemFs.parentOf(path))
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
        if (!MemFs.dirtyPaths.remove(key)) return
        val file = MemFs.files[key] ?: return
        try {
            IndexedDbStore.put(key, file.data.copyOf(file.size))
        } catch (e: Throwable) {
            console.error("CachePersistence: failed to persist $key", e)
            MemFs.dirtyPaths.add(key)
        }
    }

    private suspend fun flushDirty() {
        val dirty = MemFs.dirtyPaths.toList()
        MemFs.dirtyPaths.removeAll(dirty)
        for (path in dirty) {
            val file = MemFs.files[path] ?: continue
            try {
                IndexedDbStore.put(path, file.data.copyOf(file.size))
            } catch (e: Throwable) {
                console.error("CachePersistence: failed to persist $path", e)
                MemFs.dirtyPaths.add(path)
            }
        }

        val deletes = MemFs.pendingDeletes.toList()
        MemFs.pendingDeletes.removeAll(deletes)
        for (path in deletes) {
            try {
                IndexedDbStore.delete(path)
            } catch (e: Throwable) {
                console.error("CachePersistence: failed to delete $path", e)
                MemFs.pendingDeletes.add(path)
            }
        }
    }

    private fun requestPersistentStorage() {
        try {
            val storage = window.navigator.asDynamic().storage
            storage?.persist()
        } catch (e: Throwable) {
            // Best-effort: quota persistence isn't supported everywhere.
        }
    }
}
