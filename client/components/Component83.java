/* Component83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component83
/**
 * RENAMED from `Class108` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1656 = 0;
    /** World-test WIP channel. */
    static NamedInteger WTWIP = new NamedInteger("WTWIP", 3);
    static int anInt1658;
    static int anInt1659;
    static int anInt1660;
    static boolean aBoolean1661 = true;
    static DisplayModeManagerContainer42 aClass304_1662 = new DisplayModeManagerContainer42(4);
    static int anInt1663;
    static Component24 aClass105_1664;

    static final float method1012(float f, float f_0_, float f_1_, float f_2_, int i, float f_3_, byte i_4_, float f_5_) {
        anInt1659++;
        float f_6_ = 0.0F;
        float f_7_ = -f_3_ + f_0_;
        float f_8_ = -f + f_5_;
        float f_9_ = -f_1_ + f_2_;
        if (i_4_ < 99) method1015(-13, -42, false);
        float f_10_ = 0.0F;
        float f_11_ = 0.0F;
        float f_12_ = 0.0F;
        while (f_6_ < 1.1F) {
            float f_13_ = f_7_ * f_6_ + f_3_;
            float f_14_ = f + f_6_ * f_8_;
            float f_15_ = f_1_ + f_9_ * f_6_;
            int i_16_ = (int) f_13_ >> 9;
            int i_17_ = (int) f_15_ >> 9;
            if (i_16_ > 0 && i_17_ > 0 && AbstractShaderSub4.anInt7319 > i_16_ && (i_17_ < ParametricDefinition.anInt9109)) {
                int i_18_ = (Component72.localPlayer.plane);
                if (i_18_ < 3 && ((ObjectDeserializer.aByteArrayArrayArray6962[1][i_16_][i_17_]) & 0x2) != 0) i_18_++;
                int i_19_ = NodeSub1Sub1.aSArray8801[i_18_].getInterpolatedHeight((int) f_13_, (int) f_15_, (byte) 109);
                if (f_14_ > (float) i_19_) {
                    if (i < 2) return f_6_;
                    return (f_6_ - 0.1F + method1012(f_11_, f_13_, f_12_, f_15_, i - 1, f_10_, (byte) 122, f_14_) * 0.1F);
                }
            }
            f_10_ = f_13_;
            f_11_ = f_14_;
            f_6_ += 0.1F;
            f_12_ = f_15_;
        }
        return -1.0F;
    }

    public static void method1013(byte i) {
        WTWIP = null;
        if (i < 111) method1013((byte) 17);
        aClass304_1662 = null;
        aClass105_1664 = null;
    }

    static final void method1014(int i) {
        anInt1660++;
        for (PauseHandler class348_sub42_sub6 = (PauseHandler) CacheNodeSub2.aClass262_10492.first(4); class348_sub42_sub6 != null; class348_sub42_sub6 = ((PauseHandler) CacheNodeSub2.aClass262_10492.next((byte) 55))) {
            DisplayModeManagerContainer104 class318_sub1_sub3_sub4 = (class348_sub42_sub6.aClass318_Sub1_Sub3_Sub4_9538);
            if (class318_sub1_sub3_sub4.aBoolean10345) {
                class348_sub42_sub6.unlink((byte) 76);
                class318_sub1_sub3_sub4.unload(false);
            } else if (OpenGlShader.clientCycle >= (class318_sub1_sub3_sub4.anInt10349)) {
                class318_sub1_sub3_sub4.method2470(NodeSub51.anInt7267, (byte) -16);
                if (class318_sub1_sub3_sub4.aBoolean10345) class348_sub42_sub6.unlink((byte) 42);
                else Component84.method850(class318_sub1_sub3_sub4, true);
            }
        }
        if (i != -4) aBoolean1661 = false;
    }

    static final void method1015(int i, int i_20_, boolean bool) {
        anInt1658++;
        DisplayModeManagerContainer56 class190 = NodeList.aClass190ArrayArray3335[i][i_20_];
        if (class190 != null) {
            Component169.anInt2601 = class190.anInt2535;
            Component158.anInt325 = class190.anInt2538;
            Component349.anInt10023 = class190.anInt2548;
        }
        Component179.method2988(bool);
    }
}
