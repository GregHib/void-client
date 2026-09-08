/* NodeSub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub21
/**
 * RENAMED from `Class348_Sub21` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    int anInt6847;
    boolean aBoolean6848 = false;
    static int anInt6849;
    int anInt6850; // World-map element plane.
    int anInt6851; // Relative world-map Y.
    int anInt6852; // Relative world-map X.
    int anInt6853;
    static String aString6854 = null;
    int anInt6855;
    static int anInt6856;

    static final void method2954(byte i) {
        anInt6856++;
        if (NodeBaseSub1.anInt9775 != -1 && Component102.anInt4803 != -1) {
            int i_0_ = ((Component208.anInt1780 * (Component374.anInt4133 + -Component195.anInt5019) >> 16) + Component195.anInt5019);
            Component208.anInt1780 += i_0_;
            if (Component208.anInt1780 < 65535) {
                DisplayModeManagerContainer322.aBoolean4284 = false;
                Component361.aBoolean368 = false;
            } else {
                DisplayModeManagerContainer322.aBoolean4284 = !Component361.aBoolean368;
                Component208.anInt1780 = 65535;
                Component361.aBoolean368 = true;
            }
            float f = (float) Component208.anInt1780 / 65535.0F;
            float[] fs = new float[3];
            int i_1_ = 2 * ItemDefinition.anInt2798;
            for (int i_2_ = 0; i_2_ < 3; i_2_++) {
                int i_3_ = 3 * (PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][i_1_][i_2_]);
                int i_4_ = ((PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][1 + i_1_][i_2_]) * 3);
                int i_5_ = 3 * ((PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][2 + i_1_][i_2_]) + ((PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][2 + i_1_][i_2_]) + -(PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][i_1_ - -3][i_2_])));
                int i_6_ = (PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][i_1_][i_2_]);
                int i_7_ = i_4_ - i_3_;
                int i_8_ = -(2 * i_4_) + i_3_ - -i_5_;
                int i_9_ = -i_6_ + ((PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][i_1_ - -2][i_2_]) + i_4_) + -i_5_;
                fs[i_2_] = (float) i_6_ + f * ((float) i_7_ + f * (f * (float) i_9_ + (float) i_8_));
            }
            WaterSurfaceShader.anInt6246 = (int) fs[0] - 512 * NodeBaseSub2.regionTileX;
            DisplayModeManagerContainer50.anInt3855 = -1 * (int) fs[1];
            Component317.anInt8685 = (int) fs[2] + -(Component330.regionTileY * 512);
            float[] fs_10_ = new float[3];
            int i_11_ = 2 * Component235.anInt3373;
            int i_12_ = -88 % ((-64 - i) / 57);
            for (int i_13_ = 0; i_13_ < 3; i_13_++) {
                int i_14_ = 3 * (PlayerState.anIntArrayArrayArray7079[Component102.anInt4803][i_11_][i_13_]);
                int i_15_ = 3 * (PlayerState.anIntArrayArrayArray7079[Component102.anInt4803][i_11_ + 1][i_13_]);
                int i_16_ = (((PlayerState.anIntArrayArrayArray7079[Component102.anInt4803][2 + i_11_][i_13_]) + (-(PlayerState.anIntArrayArrayArray7079[Component102.anInt4803][3 + i_11_][i_13_]) + (PlayerState.anIntArrayArrayArray7079[Component102.anInt4803][i_11_ - -2][i_13_]))) * 3);
                int i_17_ = (PlayerState.anIntArrayArrayArray7079[Component102.anInt4803][i_11_][i_13_]);
                int i_18_ = -i_14_ + i_15_;
                int i_19_ = -(i_15_ * 2) + i_14_ + i_16_;
                int i_20_ = (-i_16_ + i_15_ + (-i_17_ + (PlayerState.anIntArrayArrayArray7079[Component102.anInt4803][2 + i_11_][i_13_])));
                fs_10_[i_13_] = (f * ((float) i_18_ + f * ((float) i_20_ * f + (float) i_19_)) + (float) i_17_);
            }
            float f_21_ = -fs[0] + fs_10_[0];
            float f_22_ = -1.0F * (-fs[1] + fs_10_[1]);
            float f_23_ = -fs[2] + fs_10_[2];
            double d = Math.sqrt(f_21_ * f_21_ + f_23_ * f_23_);
            HashNodeSub19.anInt9701 = 0x3fff & (int) (2607.5945876176133 * Math.atan2(f_22_, d));
            Component298.anInt4638 = 0x3fff & (int) (2607.5945876176133 * -Math.atan2(f_21_, f_23_));
            Component103.anInt4186 = ((PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][i_1_][3]) + (((-(PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][i_1_][3]) + (PlayerState.anIntArrayArrayArray7079[NodeBaseSub1.anInt9775][2 + i_1_][3])) * Component208.anInt1780) >> 16));
        }
    }

    /** {@code i ^ i_24_}. */
    static int bitwiseXor(int i, int i_24_) {
        return i ^ i_24_;
    }

    public static void method2956(byte i) {
        aString6854 = null;
        if (i != 53) method2954((byte) -100);
    }

    NodeSub21(int i) {
        this.anInt6847 = -1;
        this.anInt6847 = i;
    }
}
