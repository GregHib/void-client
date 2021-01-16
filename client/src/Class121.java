/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class121 {
    static int anInt1794;
    static int anInt1795;
    static int anInt1796 = 0;
    static int anInt1797;
    static int anInt1798;
    static int anInt1799;
    static Class105 aClass105_1800;

    public static void method1081(byte i) {
        int i_0_ = -38 % ((i - 57) / 62);
        aClass105_1800 = null;
    }

    static final int method1082(int i, boolean bool) {
        anInt1795++;
        int i_1_ = Class348_Sub49.anInt7207;
        while_44_:
        do {
            do {
                if (i_1_ == 0) {
                    if (bool)
                        return 0;
                    return Class339.anInt4211;
                } else if (i_1_ != 1) {
					if (i_1_ == 2)
						break;
					break while_44_;
				}
				return Class339.anInt4211;
            } while (false);
            return 0;
        } while (false);
        i_1_ = -103 / ((i - -37) / 39);
        return 0;
    }

    static final void method1083(ha var_ha, int i, byte i_2_, int i_3_,
                                 int i_4_, int i_5_) {
        anInt1798++;
        Class21.aHa326 = var_ha;
        Class51.aClass101_905 = Class21.aHa326.method3654();
        Class44.aClass101_624 = Class21.aHa326.method3654();
        r.aClass101_9720 = Class21.aHa326.method3654();
        Class348_Sub42_Sub9_Sub1.anInt10444 = i_4_;
        Class348_Sub49.anInt7207 = 0;
        Class211.anInt2747 = i;
        Class132.anIntArray1909 = null;
        Class92.anInterface4Array1525 = null;
        Class85.method828((byte) 38, i_3_, i_5_);
        Class27.anInt396 = -1;
        Class295.anInt3760 = -1;
        Class369_Sub1.anInt8583 = -1;
        int i_6_ = 90 % ((70 - i_2_) / 33);
    }

    static final boolean method1084(int i, int i_7_, int i_8_, int i_9_,
                                    int i_10_, int i_11_, int i_12_) {
        anInt1799++;
        int i_13_ = i_9_ - -i_7_;
        int i_14_ = i + i_10_;
        int i_15_ = i_8_ + i_11_;
        if (!Class286_Sub7.method2169(i_9_, i_13_, i_8_, i_9_, i_15_, i_14_,
                i_14_, i_14_, i_15_, false))
            return false;
        if (i_12_ != 18507)
            method1082(-107, false);
        if (!Class286_Sub7.method2169(i_9_, i_13_, i_8_, i_13_, i_15_, i_14_,
                i_14_, i_14_, i_8_, false))
            return false;
        if (Class141.anInt1974 > i_9_) {
            if (!Class286_Sub7.method2169(i_9_, i_9_, i_15_, i_9_, i_15_,
                    i_14_, i_14_, i_10_, i_8_, false))
                return false;
            if (!Class286_Sub7.method2169(i_9_, i_9_, i_15_, i_9_, i_8_, i_14_,
                    i_10_, i_10_, i_8_, false))
                return false;
        } else {
            if (!Class286_Sub7.method2169(i_13_, i_13_, i_15_, i_13_, i_15_,
                    i_14_, i_14_, i_10_, i_8_, false))
                return false;
            if (!Class286_Sub7.method2169(i_13_, i_13_, i_15_, i_13_, i_8_,
                    i_14_, i_10_, i_10_, i_8_, false))
                return false;
        }
        if (i_8_ >= Class348_Sub40_Sub27.anInt9360) {
            if (!Class286_Sub7.method2169(i_9_, i_13_, i_15_, i_9_, i_15_,
                    i_14_, i_14_, i_10_, i_15_, false))
                return false;
			return Class286_Sub7.method2169(i_9_, i_13_, i_15_, i_13_, i_15_,
					i_14_, i_10_, i_10_, i_15_, false);
        } else {
            if (!Class286_Sub7.method2169(i_9_, i_13_, i_8_, i_9_, i_8_, i_14_,
                    i_14_, i_10_, i_8_, false))
                return false;
			return Class286_Sub7.method2169(i_9_, i_13_, i_8_, i_13_, i_8_,
					i_14_, i_10_, i_10_, i_8_, false);
        }
	}

    static {
        anInt1794 = -1;
    }
}
