/**
 * Opens the bulk cache stores (the plan's "CacheStorage" factory, replacing the java.io.File path
 * search in Class201 and the File-based Class234 constructor).
 *
 *  - [openMainStore] for the named cache files (main_file_cache.*), located via the historic search
 *    list (c:/rscache/, user.home, ...).
 *  - [openRandomStore] for the random-seed store ("random.dat").
 *
 * JVM impl: FileCacheStorage (RandomAccessFile + the original path search). Web/native impls open
 * over OPFS / a native filesystem.
 *
 * NOTE: the per-user preferences stores (jagex_*_preferences*.dat) are still opened inside the
 * signlink (Class297.method2241) because that path-search reads Class297's private locator state;
 * folding it in here is a later slice. Those still flow as [CacheStore] handles.
 */
interface CacheStorageFactory {
    /** Initialise the locator (reads user.home etc.) with the cache id and base name. */
    fun init(baseName: String?, cacheId: Int)

    /**
     * Open a bulk cache store named [name] (located via the historic search list), capacity [maxLen]
     * (-1 = unbounded), creating it if absent. Throws if no writable location is found.
     */
    fun openMainStore(name: String, maxLen: Long): CacheStore

    /**
     * Open the random-seed store ("random.dat") under the cache directory, capacity [maxLen].
     */
    fun openRandomStore(maxLen: Long): CacheStore
}
