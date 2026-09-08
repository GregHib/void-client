/* Component99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component99
/**
 * RENAMED from `Class103` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static Component35 aClass345_1607 = Component350.method558(96);
    static int anInt1608;
    static int anInt1609;

    public static void method948(boolean bool) {
        aClass345_1607 = null;
        if (bool != false) aClass345_1607 = null;
    }

    static final boolean method949(int i, int i_0_, int i_1_, byte i_2_, int i_3_, int i_4_) {
        if (i_2_ < 117) aClass345_1607 = null;
        anInt1609++;
        for (int i_5_ = i_3_; i_0_ >= i_5_; i_5_++) {
            for (int i_6_ = i; i_4_ >= i_6_; i_6_++) {
                if ((HashNodeSub17.anIntArrayArray9678[i_5_][i_6_] == i_1_) && DisplayModeManagerContainer295.anIntArrayArray5921[i_5_][i_6_] <= 1) return true;
            }
        }
        return false;
    }

    static final void method950(int i, int i_7_, int i_8_, boolean bool, byte i_9_, int i_10_, boolean bool_11_) {
        int i_12_ = 73 % ((i_9_ - -31) / 40);
        if (i_8_ > i_7_) {
            int i_13_ = (i_8_ + i_7_) / 2;
            int i_14_ = i_7_;
            Component362 class110_sub1 = Component304.aClass110_Sub1Array1146[i_13_];
            Component304.aClass110_Sub1Array1146[i_13_] = Component304.aClass110_Sub1Array1146[i_8_];
            Component304.aClass110_Sub1Array1146[i_8_] = class110_sub1;
            for (int i_15_ = i_7_; i_15_ < i_8_; i_15_++) {
                if (Component230.method473((byte) -122, i_10_, class110_sub1, i, bool_11_, bool, (Component304.aClass110_Sub1Array1146[i_15_])) <= 0) {
                    Component362 class110_sub1_16_ = Component304.aClass110_Sub1Array1146[i_15_];
                    Component304.aClass110_Sub1Array1146[i_15_] = Component304.aClass110_Sub1Array1146[i_14_];
                    Component304.aClass110_Sub1Array1146[i_14_++] = class110_sub1_16_;
                }
            }
            Component304.aClass110_Sub1Array1146[i_8_] = Component304.aClass110_Sub1Array1146[i_14_];
            Component304.aClass110_Sub1Array1146[i_14_] = class110_sub1;
            method950(i, i_7_, i_14_ + -1, bool, (byte) 114, i_10_, bool_11_);
            method950(i, i_14_ - -1, i_8_, bool, (byte) 50, i_10_, bool_11_);
        }
        anInt1608++;
    }
}
