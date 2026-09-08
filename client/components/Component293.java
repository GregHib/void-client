/* Component293 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component293
/**
 * RENAMED from `Class259` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private final CacheStore aClass45_3299;
    static byte[] aByteArray3300 = new byte[2048];
    static NodeCache aClass60_3301 = new NodeCache(30);
    static int anInt3302;
    private final NodeCache aClass60_3303 = new NodeCache(64);
    static DisplayModeManagerContainer50 aClass305_3304;
    int anInt3305;
    static int anInt3306 = 0;

    public static void method1975(byte i) {
        aClass60_3301 = null;
        int i_0_ = -54 / ((i - 77) / 37);
        aClass305_3304 = null;
        aByteArray3300 = null;
    }

    final Component214 method1976(int i, int i_1_) {
        anInt3302++;
        Component214 class160;
        synchronized (aClass60_3303) {
            class160 = (Component214) aClass60_3303.get(i, -51);
        }
        if (class160 != null) return class160;
        int i_2_ = 44 % ((-41 - i_1_) / 33);
        byte[] is;
        synchronized (aClass45_3299) {
            is = aClass45_3299.getFile(-1860, 19, i);
        }
        class160 = new Component214();
        if (is != null) class160.method1255(new Buffer(is), -1);
        synchronized (aClass60_3303) {
            aClass60_3303.putOne(class160, i, (byte) -120);
        }
        return class160;
    }

    Component293(GameType class230, int i, CacheStore class45) {
        try {
            aClass45_3299 = class45;
            this.anInt3305 = aClass45_3299.getFileCount(0, 19);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("uea.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }
}
