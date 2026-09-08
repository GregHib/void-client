/* DisplayModeManagerContainer130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer130
/**
 * RENAMED from `Class271` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private final NodeCache aClass60_3466 = new NodeCache(64);
    static Component183 aClass114_3467 = new Component183(45, 8);
    private final CacheStore aClass45_3468;
    static int anInt3469;

    final HashNodeSub7 method2044(int i, int i_0_) {
        anInt3469++;
        HashNodeSub7 class348_sub42_sub7;
        synchronized (aClass60_3466) {
            class348_sub42_sub7 = (HashNodeSub7) aClass60_3466.get(i_0_, -85);
        }
        if (class348_sub42_sub7 != null) return class348_sub42_sub7;
        byte[] is;
        synchronized (aClass45_3468) {
            is = aClass45_3468.getFile(-1860, 5, i_0_);
        }
        class348_sub42_sub7 = new HashNodeSub7();
        if (i < 78) method2046();
        if (is != null) class348_sub42_sub7.method3192((byte) 16, new Buffer(is));
        synchronized (aClass60_3466) {
            aClass60_3466.putOne(class348_sub42_sub7, i_0_, (byte) -93);
        }
        return class348_sub42_sub7;
    }

    public static void method2045(byte i) {
        aClass114_3467 = null;
        if (i != 62) method2046();
    }

    static final void method2046() {
        DisplayModeManagerContainer5.aClass76_1208 = DisplayModeManagerContainer5.aClass76_1210;
    }

    DisplayModeManagerContainer130(GameType class230, int i, CacheStore class45) {
        try {
            aClass45_3468 = class45;
            aClass45_3468.getFileCount(0, 5);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ut.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }
}
