/* Component135 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component135
/**
 * RENAMED from `Class359` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt4419;
    int anInt4420;
    static Component183 aClass114_4421 = new Component183(13, -2);
    static int anInt4422;
    int anInt4423;
    static int anInt4424;
    int anInt4425;
    boolean aBoolean4426;

    static final boolean method3490(boolean bool) {
        anInt4419++;
        boolean bool_0_ = bool;
        if (PrimitiveTypeDefinition.aClass207_9090 == null) {
            if (!Component158.aClass45_322.isSingletonFileReady(false, OutputStream_Sub1.anInt98)) bool_0_ = false;
            else PrimitiveTypeDefinition.aClass207_9090 = Component170.method1512(Component158.aClass45_322, OutputStream_Sub1.anInt98);
        }
        if (NodeSub7.aClass207_6643 == null) {
            if (Component158.aClass45_322.isSingletonFileReady(!bool, NodeSub32.anInt6938)) NodeSub7.aClass207_6643 = Component170.method1512(Component158.aClass45_322, NodeSub32.anInt6938);
            else bool_0_ = false;
        }
        if (DisplayModeManagerContainer67.aClass207_1727 == null) {
            if (!Component158.aClass45_322.isSingletonFileReady(false, DisplayModeManagerContainer61.anInt3762)) bool_0_ = false;
            else DisplayModeManagerContainer67.aClass207_1727 = Component170.method1512(Component158.aClass45_322, DisplayModeManagerContainer61.anInt3762);
        }
        if (Component337.aClass143_3649 == null) {
            if (Component65.aClass45_1627.isSingletonFileReady(false, Component120.anInt317)) Component337.aClass143_3649 = Component98.method1766((byte) -89, Component120.anInt317, Component65.aClass45_1627);
            else bool_0_ = false;
        }
        if (Component305.aClass207Array9929 == null) {
            if (Component158.aClass45_322.isSingletonFileReady(false, Component120.anInt317)) Component305.aClass207Array9929 = Component170.method1523(Component158.aClass45_322, Component120.anInt317);
            else bool_0_ = false;
        }
        return bool_0_;
    }

    public static void method3491(int i) {
        aClass114_4421 = null;
        if (i != 1) method3491(-30);
    }

    static final int method3492(int i, int i_1_) {
        anInt4422++;
        int i_2_ = 0x3f & i;
        int i_3_ = (i_1_ & i) >> 6;
        if (i_2_ == 18) {
            if (i_3_ == 0) return 1;
            if (i_3_ == 1) return 2;
            if (i_3_ == 2) return 4;
            if (i_3_ == 3) return 8;
        } else if (i_2_ == 19 || i_2_ == 21) {
            if (i_3_ == 0) return 16;
            if (i_3_ == 1) return 32;
            if (i_3_ == 2) return 64;
            if (i_3_ == 3) return 128;
        }
        return 0;
    }

    public Component135() {
        /* empty */
    }
}
