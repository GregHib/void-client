/* Component258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component258
/**
 * RENAMED from `Class141` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private NodeCache aClass60_1963 = new NodeCache(64);
    static int anInt1964;
    CacheStore aClass45_1965;
    static Component224 aClass273_1966;
    static int anInt1967;
    static int anInt1968;
    static int anInt1969;
    static int anInt1970;
    private final CacheStore aClass45_1971;
    static int anInt1972;
    static int[] anIntArray1973 = {0, 1, 2, 3, 4, 5, 6, 14};
    static int anInt1974;
    static int[] anIntArray1975;
    NodeCache aClass60_1976 = new NodeCache(64);
    static AssetCacheLoader aClass26_1977;

    final SceneManager method1173(byte i, int i_0_) {
        anInt1964++;
        SceneManager class218;
        synchronized (aClass60_1963) {
            class218 = (SceneManager) aClass60_1963.get(i_0_, 118);
        }
        if (class218 != null) return class218;
        byte[] is;
        synchronized (aClass45_1971) {
            is = aClass45_1971.getFile(i + -1891, 34, i_0_);
        }
        class218 = new SceneManager();
        if (i != 31) return null;
        class218.aClass141_2851 = this;
        if (is != null) class218.method1597((byte) -114, new Buffer(is));
        synchronized (aClass60_1963) {
            aClass60_1963.putOne(class218, i_0_, (byte) -108);
        }
        return class218;
    }

    final void method1174(byte i) {
        synchronized (aClass60_1963) {
            aClass60_1963.purgeSoftReferences(-87);
        }
        anInt1969++;
        synchronized (this.aClass60_1976) {
            if (i > -89) {
                /* empty */
            } else this.aClass60_1976.purgeSoftReferences(-79);
        }
    }

    final void method1175(byte i) {
        synchronized (aClass60_1963) {
            aClass60_1963.clear(i + -125);
        }
        anInt1967++;
        if (i == 125) {
            synchronized (this.aClass60_1976) {
                this.aClass60_1976.clear(0);
            }
        }
    }

    final void method1176(int i, byte i_1_) {
        if (i_1_ < 31) method1177((byte) -119);
        synchronized (aClass60_1963) {
            aClass60_1963.processSoftEntries(2, i);
        }
        anInt1968++;
        synchronized (this.aClass60_1976) {
            this.aClass60_1976.processSoftEntries(2, i);
        }
    }

    static final void method1177(byte i) {
        ReferenceTable.anIntArray3726 = AbstractShaderSub1.method3533((byte) 127, 2048, 4, 8, 0.4F, 35, true, 8);
        if (i == 122) anInt1970++;
    }

    final void method1178(int i, int i_2_, int i_3_) {
        anInt1972++;
        if (i_2_ != 1) aClass273_1966 = null;
        aClass60_1963 = new NodeCache(i_3_);
        this.aClass60_1976 = new NodeCache(i);
    }

    public static void method1179(byte i) {
        anIntArray1975 = null;
        aClass26_1977 = null;
        anIntArray1973 = null;
        aClass273_1966 = null;
        if (i >= -111) method1177((byte) 47);
    }

    Component258(GameType class230, int i, CacheStore class45, CacheStore class45_4_) {
        try {
            this.aClass45_1965 = class45_4_;
            aClass45_1971 = class45;
            aClass45_1971.getFileCount(0, 34);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("oda.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_4_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aClass273_1966 = new Component224("", 18);
        anIntArray1975 = new int[1];
    }
}
