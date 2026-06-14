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

    /**
     * Open a per-user preferences store.  Mirrors Class297.method2241:
     *  - filename = "jagex_{baseName}_preferences{suffix}{ext}"
     *  - [variant] 33 → "_rc.dat", 34 → "_wip.dat", else → ".dat"
     * Returns null if no writable location is found.
     */
    fun openPreferences(suffix: String?, variant: Int): CacheStore?
}

/**
 * Platform factory for [CacheStorageFactory] instances.
 *
 * Holds a constructor lambda so each signlink ([Class297] on JVM, or a future common
 * equivalent) gets its own independent [CacheStorageFactory] — sharing one instance
 * across multiple signlink lifetimes would cause store-reopen collisions.
 *
 * JVM: registered by [ClientBootstrap.installCommon] with `{ FileCacheStorage() }`.
 * JS:  registered by [ClientBootstrap.installCommon] with `{ OPFSCacheStorage() }`.
 */
object CacheStorageFactories {
    private lateinit var ctor: () -> CacheStorageFactory

    fun install(factory: () -> CacheStorageFactory) {
        ctor = factory
    }

    /** Create a new [CacheStorageFactory] instance for one signlink lifetime. */
    fun create(): CacheStorageFactory = ctor()
}
