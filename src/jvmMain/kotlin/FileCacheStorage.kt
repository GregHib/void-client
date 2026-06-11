import java.io.File

/**
 * JVM [CacheStorageFactory] over the local filesystem. Wraps the historic path-search (Class201) and
 * opens each bulk cache store as a [Class234] (RandomAccessFile). Behaviour is byte-identical to the
 * old inline construction in Class297.
 */
class FileCacheStorage : CacheStorageFactory {
    private var cacheId = -1
    private var baseName: String? = null
    private var userHome: String? = null

    override fun init(baseName: String?, cacheId: Int) {
        this.cacheId = cacheId
        this.baseName = baseName
        userHome = try {
            val h = System.getProperty("user.home")
            if (h != null) "$h/" else null
        } catch (e: Exception) { null } ?: "~/"
        Class201.method1465((-121).toByte(), baseName, cacheId)
    }

    override fun openMainStore(name: String, maxLen: Long): CacheStore {
        return Class234(Class201.method1466(-2, name), "rw", maxLen)
    }

    override fun openRandomStore(maxLen: Long): CacheStore {
        return Class234(Class201.method1464(0, cacheId, "random.dat", null), "rw", maxLen)
    }

    override fun openPreferences(suffix: String?, variant: Int): CacheStore? {
        val ext = when (variant) {
            33   -> "_rc.dat"
            34   -> "_wip.dat"
            else -> ".dat"
        }
        val filename = "jagex_${baseName}_preferences$suffix$ext"
        val searchPaths = arrayOf("c:/rscache/", "/rscache/", userHome!!, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "")
        for (path in searchPaths) {
            if (path.isEmpty() || File(path).exists()) {
                try {
                    return Class234(File(path, filename), "rw", 10000L)
                } catch (e: Exception) {
                    /* try next */
                }
            }
        }
        return null
    }
}
