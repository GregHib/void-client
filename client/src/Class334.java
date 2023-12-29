/* Class334 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class334 {
    int anInt4151;
    static int[] anIntArray4152 = {4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
    static int anInt4153;
    int anInt4154;
    static int anInt4155 = -1;
    int anInt4156;
    static int anInt4157;
    int anInt4158;
    static int anInt4159;
    static int anInt4160;
    static int anInt4161;
    int anInt4162 = 128;
    static int anInt4163;
    static int anInt4164;
    int anInt4165 = 128;

    static final boolean method2647(boolean bool, char c) {
        anInt4161++;
        if (bool != true) method2653(true, 83);
        return c >= '0' && c <= '9';
    }

    final void method2648(Class334 class334_0_, byte i) {
        this.anInt4158 = class334_0_.anInt4158;
        this.anInt4151 = class334_0_.anInt4151;
        if (i != 118) method2647(true, '\uffe5');
        anInt4159++;
        this.anInt4156 = class334_0_.anInt4156;
        this.anInt4165 = class334_0_.anInt4165;
        this.anInt4154 = class334_0_.anInt4154;
        this.anInt4162 = class334_0_.anInt4162;
    }

    final Class334 method2649(int i) {
        if (i != 2) method2648(null, (byte) -10);
        anInt4163++;
        return new Class334(this.anInt4156, this.anInt4165, this.anInt4162, this.anInt4158, this.anInt4154, this.anInt4151);
    }

    static final void method2650(FontMetrics fontMetrics, int i, aa var_aa, int i_1_, int i_2_, String string, int i_3_, FontRenderer fontRenderer, int i_4_, Class46 class46, int i_5_, int i_6_) {
        try {
            anInt4153++;
            int i_7_;
            if (Class348_Sub40_Sub21.anInt9282 == 4) i_7_ = (int) Class314.aFloat3938 & 0x3fff;
            else i_7_ = 0x3fff & r_Sub2.anInt10483 + (int) Class314.aFloat3938;
            int i_8_ = (Math.max(class46.anInt709 / 2, class46.anInt789 / 2) + 10);
            int i_9_ = i_5_ * i_5_ - -(i_1_ * i_1_);
            if (i_9_ <= i_8_ * i_8_) {
                int i_10_ = Class70.anIntArray1207[i_7_];
                int i_11_ = Class70.anIntArray1204[i_7_];
                if (Class348_Sub40_Sub21.anInt9282 != 4) {
                    i_11_ = 256 * i_11_ / (Class348_Sub49_Sub1.anInt9750 + 256);
                    i_10_ = 256 * i_10_ / (256 + Class348_Sub49_Sub1.anInt9750);
                }
                int i_12_ = i_10_ * i_1_ + i_5_ * i_11_ >> 14;
                int i_13_ = -(i_5_ * i_10_) + i_11_ * i_1_ >> 14;
                int i_14_ = fontMetrics.lineWidth(string, false, 100, null);
                int i_15_ = fontMetrics.method1185(null, 0, 0, i_6_, string);
                i_12_ -= i_14_ / 2;
                if (-class46.anInt709 <= i_12_ && class46.anInt709 >= i_12_ && (i_13_ >= -class46.anInt789) && class46.anInt789 >= i_13_)
                    fontRenderer.method2584(null, 0, 0, null, i, 0, 50, var_aa, (-i_4_ + (i_3_ + (class46.anInt789 / 2 + (-i_13_ - i_15_)))), i_2_, i_3_, i_14_, (class46.anInt709 / 2 + (i_2_ + i_12_)), false, 1, string);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("dk.H(" + (fontMetrics != null ? "{...}" : "null") + ',' + i + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + (string != null ? "{...}" : "null") + ',' + i_3_ + ',' + (fontRenderer != null ? "{...}" : "null") + ',' + i_4_ + ',' + (class46 != null ? "{...}" : "null") + ',' + i_5_ + ',' + i_6_ + ')'));
        }
    }

    static final String method2651(String string, int i) {
        if (i != 3) method2650(null, -94, null, 2, -110, null, -7, null, -71, null, -47, 104);
        anInt4160++;
        if (!Class348_Sub24.aString6877.startsWith("win")) {
            if (Class348_Sub24.aString6877.startsWith("linux")) return "lib" + string + ".so";
            if (Class348_Sub24.aString6877.startsWith("mac")) return "lib" + string + ".dylib";
        } else return string + ".dll";
        return null;
    }

    static final int method2652(int i, int i_16_, int i_17_, int i_18_) {
        anInt4157++;
        if (i == i_16_) return i;
        int i_19_ = 128 + -i_18_;
        if (i_17_ != 1) return -53;
        int i_20_ = (0x7f & i_16_) * i_18_ + i_19_ * (i & 0x7f) >> 7;
        int i_21_ = (0x380 & i_16_) * i_18_ + (i & 0x380) * i_19_ >> 7;
        int i_22_ = (0xfc00 & i_16_) * i_18_ + i_19_ * (i & 0xfc00) >> 7;
        return i_22_ & 0xfc00 | 0x380 & i_21_ | i_20_ & 0x7f;
    }

    static final boolean method2653(boolean bool, int i) {
        if (bool != true) anIntArray4152 = null;
        anInt4164++;
        return i == 10 || i == 11 || i == 12;
    }

    public static void method2654(int i) {
        if (i != -6896) anInt4155 = -7;
        anIntArray4152 = null;
    }

    Class334(int i) {
        this.anInt4156 = i;
    }

    private Class334(int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
        this.anInt4156 = i;
        this.anInt4165 = i_23_;
        this.anInt4154 = i_26_;
        this.anInt4158 = i_25_;
        this.anInt4162 = i_24_;
        this.anInt4151 = i_27_;
    }
}
