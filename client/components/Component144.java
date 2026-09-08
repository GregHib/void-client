/* Component144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component144
/**
 * RENAMED from `Class319` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3978;
    private final CacheStore aClass45_3979;
    static double aDouble3980;
    CacheStore aClass45_3981;
    static Component168[] aClass315Array3982;
    static int anInt3983;
    static int anInt3984;
    static Object anObject3985;
    static int anInt3986;
    static int anInt3987;
    static boolean aBoolean3988 = false;
    private final NodeCache aClass60_3989 = new NodeCache(64);
    NodeCache aClass60_3990 = new NodeCache(60);
    int anInt3991;

    final void method2541(int i, int i_0_) {
        anInt3978++;
        this.anInt3991 = i_0_;
        synchronized (this.aClass60_3990) {
            this.aClass60_3990.clear(0);
        }
        if (i < 72) aClass315Array3982 = null;
    }

    final void method2542(int i) {
        synchronized (aClass60_3989) {
            aClass60_3989.purgeSoftReferences(-126);
        }
        if (i >= -99) aDouble3980 = 0.5896741197263589;
        anInt3986++;
        synchronized (this.aClass60_3990) {
            this.aClass60_3990.purgeSoftReferences(-106);
        }
    }

    final Component63 method2543(byte i, int i_1_) {
        if (i <= 38) method2542(-73);
        anInt3983++;
        Component63 class368;
        synchronized (aClass60_3989) {
            class368 = (Component63) aClass60_3989.get(i_1_, 101);
        }
        if (class368 != null) return class368;
        byte[] is;
        synchronized (aClass45_3979) {
            is = aClass45_3979.getFile(-1860, Component349.method2419((byte) 127, i_1_), NodeSub1Sub2.method2729(i_1_, 16));
        }
        class368 = new Component63();
        class368.aClass319_4513 = this;
        class368.anInt4501 = i_1_;
        if (is != null) class368.method3559(28105, new Buffer(is));
        synchronized (aClass60_3989) {
            aClass60_3989.putOne(class368, i_1_, (byte) -127);
        }
        return class368;
    }

    final void method2544(int i, byte i_2_) {
        synchronized (aClass60_3989) {
            aClass60_3989.processSoftEntries(2, i);
            if (i_2_ >= -11) this.aClass45_3981 = null;
        }
        anInt3987++;
        synchronized (this.aClass60_3990) {
            this.aClass60_3990.processSoftEntries(2, i);
        }
    }

    public static void method2545(boolean bool) {
        if (bool == true) {
            aClass315Array3982 = null;
            anObject3985 = null;
        }
    }

    final void method2546(int i) {
        anInt3984++;
        synchronized (aClass60_3989) {
            aClass60_3989.clear(0);
        }
        synchronized (this.aClass60_3990) {
            this.aClass60_3990.clear(0);
        }
    }

    Component144(GameType class230, int i, CacheStore class45, CacheStore class45_3_) {
        try {
            this.aClass45_3981 = class45_3_;
            aClass45_3979 = class45;
            int i_4_ = -1 + aClass45_3979.getGroupCapacity(-1);
            aClass45_3979.getFileCount(0, i_4_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("cn.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_3_ != null ? "{...}" : "null") + ')'));
        }
    }
}
