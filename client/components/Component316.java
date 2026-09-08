/* Component316 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component316
/**
 * RENAMED from `Class185` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private final NodeCache aClass60_2479 = new NodeCache(64);
    private final CacheStore aClass45_2480;
    static int anInt2481;
    static int anInt2482;
    static Component183 aClass114_2483;
    static int anInt2484;
    static int anInt2485;
    static int anInt2486;
    static int anInt2487;
    static char[] aCharArray2488 = {' ', '\u00a0', '_', '-', '\u00e0', '\u00e1', '\u00e2', '\u00e4', '\u00e3', '\u00c0', '\u00c1', '\u00c2', '\u00c4', '\u00c3', '\u00e8', '\u00e9', '\u00ea', '\u00eb', '\u00c8', '\u00c9', '\u00ca', '\u00cb', '\u00ed', '\u00ee', '\u00ef', '\u00cd', '\u00ce', '\u00cf', '\u00f2', '\u00f3', '\u00f4', '\u00f6', '\u00f5', '\u00d2', '\u00d3', '\u00d4', '\u00d6', '\u00d5', '\u00f9', '\u00fa', '\u00fb', '\u00fc', '\u00d9', '\u00da', '\u00db', '\u00dc', '\u00e7', '\u00c7', '\u00ff', '\u0178', '\u00f1', '\u00d1', '\u00df'};
    static DisplayModeManagerContainer369 aClass223_2489;

    final void method1390(int i) {
        synchronized (aClass60_2479) {
            int i_0_ = 25 / ((i - 69) / 33);
            aClass60_2479.purgeSoftReferences(-98);
        }
        anInt2486++;
    }

    final Component193 method1391(byte i, int i_1_) {
        anInt2485++;
        Component193 class253;
        synchronized (aClass60_2479) {
            class253 = (Component193) aClass60_2479.get(i_1_, 96);
        }
        if (class253 != null) return class253;
        byte[] is;
        synchronized (aClass45_2480) {
            is = aClass45_2480.getFile(-1860, 31, i_1_);
        }
        class253 = new Component193();
        int i_2_ = 50 / ((i - -63) / 56);
        if (is != null) class253.method1921((byte) -69, new Buffer(is));
        synchronized (aClass60_2479) {
            aClass60_2479.putOne(class253, i_1_, (byte) -108);
        }
        return class253;
    }

    final void method1392(int i, int i_3_) {
        synchronized (aClass60_2479) {
            aClass60_2479.processSoftEntries(2, i_3_);
        }
        if (i >= 12) anInt2484++;
    }

    final void method1393(byte i) {
        synchronized (aClass60_2479) {
            aClass60_2479.clear(0);
            int i_4_ = -89 % ((42 - i) / 50);
        }
        anInt2487++;
    }

    static final void method1394(int i, int i_5_, int i_6_) {
        boolean bool = (Component335.aClass357ArrayArrayArray2029[0][i_5_][i_6_] != null && Component335.aClass357ArrayArrayArray2029[0][i_5_][i_6_].aClass357_4400 != null);
        for (int i_7_ = i; i_7_ >= 0; i_7_--) {
            if (Component335.aClass357ArrayArrayArray2029[i_7_][i_5_][i_6_] == null) {
                Component186 class357 = (Component335.aClass357ArrayArrayArray2029[i_7_][i_5_][i_6_] = new Component186(i_7_));
                if (bool) class357.aByte4399++;
            }
        }
    }

    Component316(GameType class230, int i, CacheStore class45) {
        try {
            aClass45_2480 = class45;
            aClass45_2480.getFileCount(0, 31);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("qf.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1395(byte i) {
        aClass114_2483 = null;
        aCharArray2488 = null;
        aClass223_2489 = null;
        if (i != 82) method1394(120, -36, -100);
    }

    static {
        aClass114_2483 = new Component183(47, 6);
        aClass223_2489 = new DisplayModeManagerContainer369(3, 2);
    }
}
