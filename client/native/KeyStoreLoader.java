/* KeyStoreLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from {@code Class106} (JODE-obfuscated).
 * Interface1 provider factory backed by two {@link CacheStore}s, plus resolver for the
 * classic bitmap-font JS5 groups ({@code p11_full}, {@code p12_full}, {@code b12_full}).
 * Historical name is misleading — this is not PKCS#12 keystore loading.
 */
final class KeyStoreLoader {
    static int anInt1631;
    static int anInt1632;
    /** Lazily created news/ticker fetcher used by one provider branch. */
    private NewsFetcher newsFetcher;
    static int anInt1634;
    static int[] anIntArray1635 = new int[16];
    static int[] anIntArray1636 = null;
    /** Primary JS5/cache store passed into most {@link Interface1} providers. */
    private final CacheStore primaryCacheStore;
    static int[][] anIntArrayArray1638 = {{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
    static int anInt1639;
    static int anInt1640;
    /** Secondary cache store (sprites/extra) for providers that need two indices. */
    private final CacheStore secondaryCacheStore;

    /** Lazy getter for {@link #newsFetcher}. */
    private final NewsFetcher getNewsFetcher(int i) {
        anInt1632++;
        if (newsFetcher == null) newsFetcher = new NewsFetcher();
        if (i > -71) resolveFontGroupIds(null, -15);
        return newsFetcher;
    }

    /** Nulls static scratch arrays at shutdown. */
    public static void clearStatics(int i) {
        anIntArray1636 = null;
        anIntArray1635 = null;
        anIntArrayArray1638 = null;
        if (i != 21745) resolveFontGroupIds(null, -51);
    }

    /**
     * Builds an {@link Interface1} implementation for {@code interface12} based on its
     * {@link DisplayModeManagerContainer369} type tag (fonts, video, RSA, etc.).
     */
    final Interface1 createProvider(boolean bool, Interface12 interface12) {
        anInt1640++;
        if (interface12 == null) return null;
        DisplayModeManagerContainer369 class223 = interface12.method51((byte) 120);
        if (Component386.aClass223_2868 == class223) return new DisplayModeManagerContainer249((RSACipher) interface12);
        if (MatrixSub1.aClass223_5689 == class223) return new Component49(getNewsFetcher(-107), (Component15) interface12);
        if (class223 == DefinitionSub21.aClass223_9274) return new Component296(primaryCacheStore, (Component118) interface12);
        if (class223 == DisplayModeManagerContainer332.aClass223_4997) return new Component162(primaryCacheStore, (Component383) interface12);
        if (class223 == Buffer.aClass223_7175) return new Component2(primaryCacheStore, secondaryCacheStore, (Component14) interface12);
        if (class223 == Component55.aClass223_3934) return new DisplayModeManagerContainer89(primaryCacheStore, secondaryCacheStore, (Component381) interface12);
        if (class223 == Component316.aClass223_2489) return new Component364(primaryCacheStore, secondaryCacheStore, (Component76) interface12);
        if (class223 == RadixParser.aClass223_2307) return new VideoAdPlayer(primaryCacheStore, secondaryCacheStore, (HeapDumpHelper) interface12);
        if (bool != true) anIntArray1636 = null;
        if (Component90.aClass223_2045 == class223) return new DisplayModeManagerContainer232(primaryCacheStore, (Component247) interface12);
        if (Component38.aClass223_2507 == class223) return new Component305(primaryCacheStore, secondaryCacheStore, (DummyClass) interface12);
        return null;
    }

    /**
     * Resolves JS5 group ids for the three standard bitmap fonts into statics
     * ({@link LoadingState#p11FullGroupId}, {@link DisplayModeManagerContainer167#p12FullGroupId},
     * {@link ReferenceTable#b12FullGroupId}).
     */
    static final void resolveFontGroupIds(CacheStore class45, int i) {
        anInt1634++;
        LoadingState.p11FullGroupId = class45.getGroupId("p11_full", i);
        DisplayModeManagerContainer167.p12FullGroupId = class45.getGroupId("p12_full", i);
        ReferenceTable.b12FullGroupId = class45.getGroupId("b12_full", 0);
    }

    KeyStoreLoader(CacheStore class45, CacheStore class45_0_) {
        try {
            primaryCacheStore = class45;
            secondaryCacheStore = class45_0_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("mia.<init>(" + (class45 != null ? "{...}" : "null") + ',' + (class45_0_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        anInt1631 = 0;
    }
}
