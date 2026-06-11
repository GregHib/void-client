import java.io.File
import java.io.RandomAccessFile

/**
 * JVM [CacheStorageFactory] over the local filesystem. Inlines the historic path-search
 * (formerly Class201) and owns the [RandomAccessFile]-backed [CacheStore] implementation
 * (formerly Class234). Behaviour is byte-identical to the original code.
 */
class FileCacheStorage : CacheStorageFactory {
    private var cacheId = -1
    private var baseName: String? = null
    private var userHome: String? = null
    private var subDir: String? = null

    // ── CacheStorageFactory ────────────────────────────────────────────────

    override fun init(baseName: String?, cacheId: Int) {
        this.cacheId = cacheId
        this.baseName = baseName
        this.subDir = baseName
        userHome = try {
            val h = System.getProperty("user.home")
            if (h != null) "$h/" else null
        } catch (e: Exception) { null } ?: "~/"
    }

    override fun openMainStore(name: String, maxLen: Long): CacheStore =
        RandomAccessFileStore(locate(name, null), "rw", maxLen)

    override fun openRandomStore(maxLen: Long): CacheStore =
        RandomAccessFileStore(locate("random.dat", null), "rw", maxLen)

    override fun openPreferences(suffix: String?, variant: Int): CacheStore? {
        val ext = when (variant) {
            33   -> "_rc.dat"
            34   -> "_wip.dat"
            else -> ".dat"
        }
        val filename = "jagex_${baseName}_preferences$suffix$ext"
        for (path in searchPaths()) {
            if (path.isEmpty() || File(path).exists()) {
                try {
                    return RandomAccessFileStore(File(path, filename), "rw", 10000L)
                } catch (e: Exception) { /* try next */ }
            }
        }
        return null
    }

    // ── Path-search (formerly Class201) ───────────────────────────────────

    /**
     * Locate [name] under the cache directory, creating it if absent.
     * Searches the historic path list; mirrors Class201.method1464/1466.
     */
    fun locate(name: String, subDirOverride: String? = subDir): File {
        val dirs = arrayOf(".jagex_cache_$cacheId", ".file_store_$cacheId")
        for (pass in 0..1) {
            for (dir in dirs) {
                for (base in searchPaths()) {
                    val path = base + dir + "/" +
                            (if (subDirOverride != null) "$subDirOverride/" else "") + name
                    var raf: RandomAccessFile? = null
                    try {
                        val f = File(path)
                        if (pass != 0 || f.exists()) {
                            if (pass != 1 || base.isEmpty() || File(base).exists()) {
                                File(base + dir).mkdir()
                                if (subDirOverride != null) File(base + dir + "/" + subDirOverride).mkdir()
                                raf = RandomAccessFile(f, "rw")
                                val b = raf.read()
                                raf.seek(0L)
                                raf.write(b)
                                raf.seek(0L)
                                raf.close()
                                return f
                            }
                        }
                    } catch (e: Exception) {
                        try { raf?.close() } catch (_: Exception) {}
                    }
                }
            }
        }
        throw RuntimeException("Could not locate cache file: $name")
    }

    private fun searchPaths(): Array<String> = arrayOf(
        "c:/rscache/", "/rscache/", userHome ?: "~/",
        "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""
    )

    // ── CacheStore implementation (formerly Class234) ──────────────────────

    private inner class RandomAccessFileStore(file: File, mode: String, maxLen: Long) : CacheStore {
        private var raf: RandomAccessFile? = RandomAccessFile(file, mode).also { r ->
            val b = r.read()
            if (b != -1 && mode != "r") { r.seek(0L); r.write(b) }
            r.seek(0L)
        }
        private val cap: Long = if (maxLen == -1L) Long.MAX_VALUE else maxLen
        private val backingFile: File = file
        private var pos: Long = 0L

        init {
            Class234Statics.anInt3040++
            if (cap < file.length()) file.delete()
        }

        @Throws(IOException::class)
        override fun method1656(`is`: ByteArray?, i: Int, i_0_: Byte, i_1_: Int): Int {
            Class234Statics.anInt3040++
            val n = raf!!.read(`is`, i, i_1_)
            val dummy = 39 % ((75 - i_0_) / 39)
            if (n > 0) pos += n.toLong()
            return n
        }

        @Throws(IOException::class)
        override fun method1657(bool: Boolean) {
            Class234Statics.anInt3045++
            if (bool != false) method1660(-27)
            if (raf != null) { raf!!.close(); raf = null }
        }

        @Throws(IOException::class)
        override fun method1658(i: Byte, i_4_: Int, i_5_: Int, `is`: ByteArray?) {
            Class234Statics.anInt3043++
            if (cap < i_5_.toLong() - -pos) {
                raf!!.seek(cap); raf!!.write(1)
                throw EOFException()
            }
            if (i < 108) pos = 124L
            raf!!.write(`is`, i_4_, i_5_)
            pos += i_5_.toLong()
        }

        override fun method1660(i: Int): Any? {
            Class234Statics.anInt3042++
            if (i <= 64) Class234Statics.method1659((-48).toByte())
            return backingFile
        }

        @Throws(IOException::class)
        override fun method1661(i: Int, l: Long) {
            try {
                Class234Statics.anInt3048++
                if (i != -18968) raf = null
                raf!!.seek(l); pos = l
            } catch (e: RuntimeException) {
                throw Class348_Sub17.method2929(e, "so.B($i,$l)")
            }
        }

        @Throws(IOException::class)
        override fun method1662(i: Byte): Long {
            Class234Statics.anInt3038++
            if (i.toInt() != -46) return 97L
            return raf!!.length()
        }

        @Throws(Throwable::class)
        protected fun finalize() {
            if (raf != null) {
                println("Warning! fileondisk $backingFile not closed correctly using close(). Auto-closing instead. ")
                method1657(false)
            }
            Class234Statics.anInt3041++
        }
    }
}
