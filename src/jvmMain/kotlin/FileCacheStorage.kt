/**
 * JVM [CacheStorageFactory] over the local filesystem. Wraps the historic path-search (Class201) and
 * opens each bulk cache store as a [Class234] (RandomAccessFile). Behaviour is byte-identical to the
 * old inline construction in Class297.
 */
class FileCacheStorage : CacheStorageFactory {
    private var cacheId = -1

    override fun init(baseName: String?, cacheId: Int) {
        this.cacheId = cacheId
        Class201.method1465((-121).toByte(), baseName, cacheId)
    }

    override fun openMainStore(name: String, maxLen: Long): CacheStore {
        return Class234(Class201.method1466(-2, name), "rw", maxLen)
    }

    override fun openRandomStore(maxLen: Long): CacheStore {
        return Class234(Class201.method1464(0, cacheId, "random.dat", null), "rw", maxLen)
    }
}
