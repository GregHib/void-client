import kotlin.js.Promise

/**
 * JS [CacheStorageFactory] backed by the Origin Private File System (OPFS).
 *
 * ## Access model
 * OPFS synchronous handles (`FileSystemSyncAccessHandle`) are only available inside a
 * dedicated Worker, which the single-threaded JS game client does not use.  We therefore
 * use the **async** OPFS API and materialise each store as an in-memory [ByteArray]:
 *
 *  1. [openMainStore] / [openRandomStore] / [openPreferences] create an [OPFSCacheStore]
 *     immediately (the game already checks cache consistency via its own block headers).
 *  2. Call [loadAll] (a suspend function) from the JS bootstrap **before** starting the
 *     game loop.  It reads every pending store from OPFS into memory.
 *  3. Writes go to the in-memory buffer and schedule an async flush back to OPFS.  A
 *     dirty flag prevents redundant write-back calls.
 *
 * ## Directory layout
 * All files are placed under a single OPFS sub-directory named after the cache id:
 *   `jagex_cache_<cacheId>/<subDir>/<name>`   (main stores)
 *   `jagex_cache_<cacheId>/<name>`             (random.dat + preferences)
 *
 * This mirrors the `.jagex_cache_NN` convention used by [FileCacheStorage] on JVM.
 */
class OPFSCacheStorage : CacheStorageFactory {

    private var cacheId: Int = -1
    private var baseName: String? = null
    private var subDir: String? = null

    /** All stores opened so far — iterated by [loadAll]. */
    private val stores: MutableList<OPFSCacheStore> = mutableListOf()

    // ── CacheStorageFactory ────────────────────────────────────────────────

    override fun init(baseName: String?, cacheId: Int) {
        this.cacheId = cacheId
        this.baseName = baseName
        this.subDir = baseName
    }

    override fun openMainStore(name: String, maxLen: Long): CacheStore {
        val path = "jagex_cache_$cacheId/${subDir ?: ""}/$name"
        return register(OPFSCacheStore(path, maxLen))
    }

    override fun openRandomStore(maxLen: Long): CacheStore {
        val path = "jagex_cache_$cacheId/random.dat"
        return register(OPFSCacheStore(path, maxLen))
    }

    override fun openPreferences(suffix: String?, variant: Int): CacheStore? {
        val ext = when (variant) {
            33   -> "_rc.dat"
            34   -> "_wip.dat"
            else -> ".dat"
        }
        val filename = "jagex_${baseName}_preferences${suffix ?: ""}$ext"
        val path = "jagex_cache_$cacheId/$filename"
        return register(OPFSCacheStore(path, 10_000L))
    }

    // ── Bootstrap helper ───────────────────────────────────────────────────

    /**
     * Load every opened store from OPFS into memory.  Call this once from the JS
     * bootstrap (as a `Promise` or inside a coroutine) before starting the game loop.
     *
     * Returns a [Promise] that resolves when all stores have been loaded (or created
     * fresh if they do not yet exist in OPFS).
     */
    fun loadAll(): Promise<Unit> {
        val root: dynamic = js("navigator.storage.getDirectory()")
        return root.then { rootDir: dynamic ->
            val dirName = "jagex_cache_$cacheId"
            rootDir.getDirectoryHandle(dirName, js("({ create: true })"))
        }.then { cacheDir: dynamic ->
            // Chain all store loads sequentially to avoid concurrent OPFS contention
            var chain: Promise<dynamic> = Promise.resolve<dynamic>(cacheDir)
            for (store in stores) {
                chain = chain.then { _: dynamic ->
                    store.loadFromOPFS(cacheDir)
                }
            }
            chain
        }.then { _: dynamic -> Unit }
    }

    // ── Internal ───────────────────────────────────────────────────────────

    private fun register(store: OPFSCacheStore): OPFSCacheStore {
        stores.add(store)
        return store
    }

    // ── CacheStore implementation ──────────────────────────────────────────

    /**
     * An in-memory random-access store whose backing [ByteArray] is loaded from /
     * flushed to OPFS asynchronously.
     *
     * [maxLen] == -1 means unbounded (backed by a growable [ByteArray]; flushed in full).
     * Non-negative [maxLen] means a fixed-capacity store (mirrors [FileCacheStorage]
     * behaviour: writes past the cap trigger [EOFException]).
     */
    inner class OPFSCacheStore(
        /** OPFS path relative to the root directory (used as the file name inside [loadAll]). */
        val opfsPath: String,
        private val maxLen: Long,
    ) : CacheStore {

        /** True if the buffer has been modified since the last OPFS flush. */
        private var dirty = false

        /** Position of the next read/write (mirrors RandomAccessFile.seek). */
        private var position = 0L

        /**
         * In-memory content.  Pre-allocated to [maxLen] bytes (or 0 bytes for unbounded
         * stores) before OPFS load; grown on write for unbounded stores.
         */
        private var buf: ByteArray = if (maxLen > 0L) ByteArray(maxLen.toInt()) else ByteArray(0)

        /** Logical size of valid data in [buf] (separate from buf.size for unbounded stores). */
        private var length = 0L

        // ── OPFS I/O ───────────────────────────────────────────────────────

        /**
         * Called by [loadAll].  Reads the OPFS file into [buf] if it exists; otherwise
         * leaves [buf] as zeroes (new cache).  [cacheDir] is the OPFS directory handle.
         */
        fun loadFromOPFS(cacheDir: dynamic): Promise<dynamic> {
            // Derive the leaf filename from opfsPath (everything after last '/')
            val leafName = opfsPath.substringAfterLast('/')
            // Ensure parent subdirectory exists if opfsPath has a subdir component
            val parts = opfsPath.split("/")
            val subDirName = if (parts.size > 2) parts[parts.size - 2] else null

            val dirPromise: Promise<dynamic> = if (subDirName != null) {
                cacheDir.getDirectoryHandle(subDirName, js("({ create: true })"))
            } else {
                Promise.resolve<dynamic>(cacheDir)
            }

            return dirPromise.then { dir: dynamic ->
                dir.getFileHandle(leafName, js("({ create: true })"))
            }.then { fileHandle: dynamic ->
                fileHandle.getFile()
            }.then { file: dynamic ->
                file.arrayBuffer()
            }.then { arrayBuf: dynamic ->
                val jsBytes: dynamic = js("new Uint8Array(arrayBuf)")
                val len: Int = jsBytes.length as Int
                if (len > 0) {
                    val cap = if (maxLen > 0L) maxLen.toInt() else len
                    if (buf.size < cap) buf = ByteArray(cap)
                    val copyLen = minOf(len, cap)
                    for (i in 0 until copyLen) {
                        buf[i] = (jsBytes[i] as Int).toByte()
                    }
                    length = copyLen.toLong()
                }
                Unit.asDynamic()
            }
        }

        /** Flush [buf] back to OPFS.  Fire-and-forget; called after every write. */
        private fun flushToOPFS() {
            if (!dirty) return
            dirty = false
            val root: dynamic = js("navigator.storage.getDirectory()")
            val leafName = opfsPath.substringAfterLast('/')
            val parts = opfsPath.split("/")
            val subDirName = if (parts.size > 2) parts[parts.size - 2] else null
            val snapshot = buf.copyOfRange(0, length.toInt())

            root.then { rootDir: dynamic ->
                rootDir.getDirectoryHandle("jagex_cache_$cacheId", js("({ create: true })"))
            }.then { cacheDir: dynamic ->
                if (subDirName != null) {
                    cacheDir.getDirectoryHandle(subDirName, js("({ create: true })"))
                } else {
                    Promise.resolve<dynamic>(cacheDir)
                }
            }.then { dir: dynamic ->
                dir.getFileHandle(leafName, js("({ create: true })"))
            }.then { fileHandle: dynamic ->
                fileHandle.createWritable()
            }.then { writable: dynamic ->
                val jsArray: dynamic = js("new Uint8Array(snapshot.length)")
                for (i in snapshot.indices) jsArray[i] = snapshot[i].toInt() and 0xFF
                writable.write(jsArray).then { _: dynamic -> writable.close() }
            }
        }

        // ── CacheStore ─────────────────────────────────────────────────────

        @Throws(IOException::class)
        override fun method1656(`is`: ByteArray?, i: Int, i_0_: Byte, i_1_: Int): Int {
            if (`is` == null || i_1_ == 0) return 0
            val available = (length - position).toInt().coerceAtLeast(0)
            if (available == 0) return -1
            val toRead = minOf(i_1_, available)
            for (k in 0 until toRead) {
                `is`[i + k] = buf[(position + k).toInt()]
            }
            position += toRead
            return toRead
        }

        @Throws(IOException::class)
        override fun method1657(bool: Boolean) {
            if (dirty) flushToOPFS()
            // No handle to close for an in-memory store
        }

        @Throws(IOException::class)
        override fun method1658(i: Byte, i_4_: Int, i_5_: Int, `is`: ByteArray?) {
            if (`is` == null || i_5_ == 0) return
            val end = position + i_5_
            if (maxLen > 0L && end > maxLen) {
                // Mirror Class234: seek to cap, write 1 byte, then throw
                position = maxLen
                throw EOFException()
            }
            // Grow buffer if unbounded
            if (end > buf.size) {
                buf = buf.copyOf(end.toInt().coerceAtLeast(buf.size * 2))
            }
            for (k in 0 until i_5_) {
                buf[(position + k).toInt()] = `is`[i_4_ + k]
            }
            position = end
            if (position > length) length = position
            dirty = true
            flushToOPFS()
        }

        override fun method1660(i: Int): Any? = opfsPath  // opaque identity for diagnostics

        @Throws(IOException::class)
        override fun method1661(i: Int, l: Long) {
            position = l
        }

        @Throws(IOException::class)
        override fun method1662(i: Byte): Long = length
    }
}
