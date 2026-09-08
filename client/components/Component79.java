/* Component79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component79
/**
 * RENAMED from `Class333` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt4144 = -1;
    static int anInt4145;
    private LruCache aClass356_4146;
    static CacheStore aClass45_4147;
    private int anInt4148 = 0;
    static int anInt4149;
    private Node aClass348_4150;

    static final void method2643(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        if (DisplayModeManagerContainer173.anIntArrayArray4253 != null) DisplayModeManagerContainer173.anIntArrayArray4253[i][i_0_] = ~0xffffff | i_1_;
        if (Component175.aShortArrayArray5847 != null) Component175.aShortArrayArray5847[i][i_0_] = (short) i_2_;
        if (NodeSub1Sub2.aByteArrayArray8816 != null) NodeSub1Sub2.aByteArrayArray8816[i][i_0_] = (byte) i_3_;
    }

    final Node method2644(byte i) {
        anInt4148 = 0;
        if (i != 123) method2643(-115, 5, -49, 81, 25);
        anInt4145++;
        return method2646((byte) 117);
    }

    public static void method2645(int i) {
        if (i != -16777216) method2643(-59, 61, -83, 34, -32);
        aClass45_4147 = null;
    }

    final Node method2646(byte i) {
        anInt4149++;
        int i_4_ = -49 / ((i - 44) / 40);
        if (anInt4148 > 0 && (aClass356_4146.buckets[-1 + anInt4148] != aClass348_4150)) {
            Node class348 = aClass348_4150;
            aClass348_4150 = class348.next;
            return class348;
        }
        while (aClass356_4146.capacity > anInt4148) {
            Node class348 = (aClass356_4146.buckets[anInt4148++].next);
            if (aClass356_4146.buckets[anInt4148 + -1] != class348) {
                aClass348_4150 = class348.next;
                return class348;
            }
        }
        return null;
    }

    public Component79() {
        /* empty */
    }

    Component79(LruCache class356) {
        aClass356_4146 = class356;
    }
}
