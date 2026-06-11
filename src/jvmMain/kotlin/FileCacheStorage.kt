import java.io.File
import java.io.RandomAccessFile
import java.util.Hashtable

/**
 * JVM [CacheStorageFactory] over the local filesystem. Inlines the historic path-search
 * (formerly Class201) and owns the [RandomAccessFile]-backed [CacheStore] implementation
 * (formerly Class234). Behaviour is byte-identical to the original code.
 */
class FileCacheStorage : CacheStorageFactory {
    private var cacheId = -1
    private var baseName: String? = null
    private var userHome: String? = null
    internal var subDir: String? = null
    // Mirrors Class201.aHashtable2642 — caches located files to avoid repeated path-search
    private val locationCache: Hashtable<Any?, Any?> = Hashtable(16)

    // ── CacheStorageFactory ────────────────────────────────────────────────

    override fun init(baseName: String?, cacheId: Int) {
        this.cacheId = cacheId
        this.baseName = baseName
        this.subDir = baseName
        userHome = try {
            val h = systemGetProperty("user.home")
            if (h != null) "$h/" else null
        } catch (e: Exception) { null } ?: "~/"
    }

    override fun openMainStore(name: String, maxLen: Long): CacheStore =
        RandomAccessFileStore(locate(name, subDir), "rw", maxLen)

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

    // ── Path-search (formerly Class201.method1464/1466) ────────────────────

    /**
     * Locate [name] under the cache directory, creating dirs if absent.
     * Mirrors Class201.method1464(0, cacheId, name, subDirOverride).
     */
    fun locate(name: String, subDirOverride: String?): File {
        val cached = locationCache[name] as File?
        if (cached != null) return cached
        val dirs = arrayOf(".jagex_cache_$cacheId", ".file_store_$cacheId")
        val paths = searchPaths()
        for (pass in 0..1) {
            for (dir in dirs) {
                for (base in paths) {
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
                                locationCache[name] = f
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

    // Original order from Class201: c:/rscache, /rscache, c:/windows, c:/winnt, c:/, userHome, /tmp/, ""
    private fun searchPaths(): Array<String> = arrayOf(
        "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/",
        userHome ?: "~/", "/tmp/", ""
    )

    // ── CacheStore implementation (formerly Class234) ──────────────────────

    private inner class RandomAccessFileStore(file: File, mode: String, maxLen: Long) : CacheStore {
        private var aRandomAccessFile3036: RandomAccessFile?
        private val aLong3037: Long
        private var aLong3039: Long
        private val aFile3046: File

        init {
            Class234Statics.anInt3040++
            var cap = maxLen
            try {
                if (cap == -1L) cap = Long.MAX_VALUE
                if (cap < file.length()) file.delete()
                aRandomAccessFile3036 = RandomAccessFile(file, mode)
                aLong3037 = cap
                aLong3039 = 0L
                aFile3046 = file
                val b = aRandomAccessFile3036!!.read()
                if (b != -1 && mode != "r") {
                    aRandomAccessFile3036!!.seek(0L)
                    aRandomAccessFile3036!!.write(b)
                }
                aRandomAccessFile3036!!.seek(0L)
            } catch (e: RuntimeException) {
                throw Class348_Sub17.method2929(e,
                    "so.<init>(${if (file != null) "{...}" else "null"},$mode,$maxLen)")
            }
        }

        @Throws(IOException::class)
        override fun method1656(`is`: ByteArray?, i: Int, i_0_: Byte, i_1_: Int): Int {
            Class234Statics.anInt3040++
            val i_2_ = aRandomAccessFile3036!!.read(`is`, i, i_1_)
            val i_3_ = 39 % ((75 - i_0_) / 39)
            if (i_2_ > 0) aLong3039 += i_2_.toLong()
            return i_2_
        }

        @Throws(IOException::class)
        override fun method1657(bool: Boolean) {
            Class234Statics.anInt3045++
            if (bool != false) method1660(-27)
            if (aRandomAccessFile3036 != null) {
                aRandomAccessFile3036!!.close()
                aRandomAccessFile3036 = null
            }
        }

        @Throws(IOException::class)
        override fun method1658(i: Byte, i_4_: Int, i_5_: Int, `is`: ByteArray?) {
            Class234Statics.anInt3043++
            if (aLong3037 < i_5_.toLong() - -aLong3039) {
                aRandomAccessFile3036!!.seek(aLong3037)
                aRandomAccessFile3036!!.write(1)
                throw EOFException()
            }
            if (i < 108) aLong3039 = 124L
            aRandomAccessFile3036!!.write(`is`, i_4_, i_5_)
            aLong3039 += i_5_.toLong()
        }

        override fun method1660(i: Int): Any? {
            Class234Statics.anInt3042++
            if (i <= 64) Class234Statics.method1659((-48).toByte())
            return aFile3046
        }

        @Throws(IOException::class)
        override fun method1661(i: Int, l: Long) {
            try {
                Class234Statics.anInt3048++
                if (i != -18968) aRandomAccessFile3036 = null
                aRandomAccessFile3036!!.seek(l)
                aLong3039 = l
            } catch (e: RuntimeException) {
                throw Class348_Sub17.method2929(e, "so.B($i,$l)")
            }
        }

        @Throws(IOException::class)
        override fun method1662(i: Byte): Long {
            Class234Statics.anInt3038++
            if (i.toInt() != -46) return 97L
            return aRandomAccessFile3036!!.length()
        }

        @Throws(Throwable::class)
        protected fun finalize() {
            if (aRandomAccessFile3036 != null) {
                println("Warning! fileondisk $aFile3046 not closed correctly using close(). Auto-closing instead. ")
                method1657(false)
            }
            Class234Statics.anInt3041++
        }
    }
}
