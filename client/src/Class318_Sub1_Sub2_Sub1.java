/* Class318_Sub1_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub1_Sub2_Sub1 extends Class318_Sub1_Sub2 {
    static int anInt10179;
    int anInt10180 = -1;
    int anInt10181;
    static int anInt10182;
    static int anInt10183;
    private int anInt10184 = 0;
    int anInt10185;
    int anInt10186;
    static int anInt10187;
    static int anInt10188;
    int anInt10189;
    int anInt10190;
    private boolean aBoolean10191 = false;
    static int anInt10192;
    static int anInt10193;
    static Class138 aClass138_10194;
    static String[] aStringArray10195 = new String[8];
    int anInt10196;
    static int anInt10197;
    static int anInt10198;
    static float aFloat10199;

    final int method2393(int i) {
        anInt10197++;
        if (i > -109) aStringArray10195 = null;
        ItemDefinition itemDefinition = (Exception_Sub1.aClass255_112.method1940(-115, this.anInt10181));
        int i_0_ = itemDefinition.anInt2784;
        if (this.anInt10189 != -1) {
            ItemDefinition itemDefinition_1_ = (Exception_Sub1.aClass255_112.method1940(74, this.anInt10189));
            if (itemDefinition_1_.anInt2784 > i_0_) i_0_ = itemDefinition_1_.anInt2784;
        }
        if (this.anInt10180 != -1) {
            ItemDefinition itemDefinition_2_ = (Exception_Sub1.aClass255_112.method1940(-88, this.anInt10180));
            if (i_0_ < itemDefinition_2_.anInt2784) i_0_ = itemDefinition_2_.anInt2784;
        }
        return i_0_;
    }

    final Class30 method2381(ha var_ha, int i) {
        if (i != 7) method2386(-74, null);
        anInt10182++;
        return null;
    }

    Class318_Sub1_Sub2_Sub1(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
        super(i, i_3_, i_4_, i_5_, i_6_);
        this.anInt10189 = -1;
        this.anInt10196 = 0;
    }

    final int method2394(boolean bool) {
        if (bool != true) this.anInt10196 = 68;
        anInt10183++;
        return -10;
    }

    final void method2387(ha var_ha, int i) {
        anInt10198++;
        if (i > -125) this.anInt10196 = 71;
    }

    final boolean method2391(ha var_ha, int i, int i_7_, int i_8_) {
        anInt10188++;
        Class101 class101 = var_ha.method3705();
        class101.method894(this.x, -10 + this.anInt6382, this.y);
        ItemDefinition itemDefinition = (Exception_Sub1.aClass255_112.method1940(i_8_ ^ 0x6b, this.anInt10181));
        Class64 class64 = itemDefinition.method1559(null, null, var_ha, 131072, 0, this.anInt10185, 0, (byte) 88, -1);
        if (class64 != null && (Class305.aBoolean3870 ? class64.method623(i_7_, i, class101, true, itemDefinition.anInt2784, Class132.anInt1906) : class64.method628(i_7_, i, class101, true, itemDefinition.anInt2784))) return true;
        if ((~this.anInt10189) != i_8_) {
            ItemDefinition itemDefinition_9_ = (Exception_Sub1.aClass255_112.method1940(-88, this.anInt10189));
            class64 = itemDefinition_9_.method1559(null, null, var_ha, 131072, 0, (this.anInt10190), 0, (byte) 88, -1);
            if (class64 != null && (Class305.aBoolean3870 ? class64.method623(i_7_, i, class101, true, itemDefinition_9_.anInt2784, Class132.anInt1906) : class64.method628(i_7_, i, class101, true, itemDefinition_9_.anInt2784))) return true;
        }
        if (this.anInt10180 != -1) {
            ItemDefinition itemDefinition_10_ = (Exception_Sub1.aClass255_112.method1940(-99, this.anInt10180));
            class64 = itemDefinition_10_.method1559(null, null, var_ha, 131072, 0, (this.anInt10186), 0, (byte) 88, -1);
            return class64 != null && (!Class305.aBoolean3870 ? class64.method628(i_7_, i, class101, true, itemDefinition_10_.anInt2784) : class64.method623(i_7_, i, class101, true, itemDefinition_10_.anInt2784, Class132.anInt1906));
        }
        return false;
    }

    public static void method2407(boolean bool) {
        aStringArray10195 = null;
        aClass138_10194 = null;
        if (bool != false) method2407(true);
    }

    final Class318_Sub4 method2386(int i, ha var_ha) {
        if (i != 1) method2386(60, null);
        anInt10179++;
        Class148 class148 = Class195.method1449(this.plane, (this.x >> Class362.anInt4459), (this.y >> Class362.anInt4459));
        if (class148 != null && class148.aClass318_Sub1_Sub3_2040.aBoolean8741) {
            int i_11_ = class148.aClass318_Sub1_Sub3_2040.method2394(true);
            if (this.anInt10196 != i_11_) {
                this.anInt6382 -= this.anInt10196;
                this.anInt10196 = i_11_;
                this.anInt6382 += i_11_;
            }
        }
        Class101 class101 = var_ha.method3705();
        class101.method910();
        if (class148 == null || !(class148.aClass318_Sub1_Sub3_2040.aBoolean8741)) {
            boolean bool = false;
            boolean bool_12_ = false;
            boolean bool_13_ = false;
            s var_s = aa_Sub1.aSArray5191[this.aByte6376];
            int i_14_ = anInt10184 << 1;
            int i_15_ = i_14_;
            int i_16_ = -i_14_ / 2;
            int i_17_ = -i_15_ / 2;
            int i_18_ = var_s.method3986(this.x + i_16_, this.y + i_17_, (byte) -102);
            int i_19_ = i_14_ / 2;
            int i_20_ = -i_15_ / 2;
            int i_21_ = var_s.method3986(i_19_ + this.x, this.y - -i_20_, (byte) 94);
            int i_22_ = -i_14_ / 2;
            int i_23_ = i_15_ / 2;
            int i_24_ = var_s.method3986(this.x + i_22_, i_23_ + this.y, (byte) -102);
            int i_25_ = i_14_ / 2;
            int i_26_ = i_15_ / 2;
            int i_27_ = var_s.method3986(this.x + i_25_, this.y + i_26_, (byte) 5);
            int i_28_ = Math.min(i_18_, i_21_);
            int i_29_ = Math.min(i_24_, i_27_);
            int i_30_ = Math.min(i_27_, i_21_);
            if (i_15_ != 0) {
                int i_31_ = ((int) (2607.5945876176133 * Math.atan2(i_28_ + -i_29_, i_15_)) & 0x3fff);
                if (i_31_ != 0) class101.method900(i_31_);
            }
            int i_32_ = Math.min(i_24_, i_18_);
            int i_33_ = i_18_ - -i_27_;
            if (i_14_ != 0) {
                int i_34_ = ((int) (2607.5945876176133 * Math.atan2(i_32_ - i_30_, i_14_)) & 0x3fff);
                if (i_34_ != 0) class101.method908(-i_34_);
            }
            if (i_24_ + i_21_ < i_33_) i_33_ = i_24_ + i_21_;
            i_33_ = (i_33_ >> 1) + -this.anInt6382;
            if (i_33_ != 0) class101.method891(0, i_33_, 0);
        }
        class101.method891(this.x, -10 + this.anInt6382, this.y);
        Class318_Sub4 class318_sub4 = OutputStream_Sub2.method136(3, true, false);
        aBoolean10191 = false;
        anInt10184 = 0;
        if (this.anInt10180 != -1) {
            Class64 class64 = (Exception_Sub1.aClass255_112.method1940(i ^ 0x6c, this.anInt10180).method1559(null, null, var_ha, 2048, 0, this.anInt10186, 0, (byte) 88, -1));
            if (class64 != null) {
                if (Class305.aBoolean3870) class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[2]), Class132.anInt1906, 0);
                else class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414[2]), 0);
                aBoolean10191 |= class64.F();
                anInt10184 = class64.ma();
            }
        }
        if (this.anInt10189 != -1) {
            Class64 class64 = (Exception_Sub1.aClass255_112.method1940(i ^ ~0x3b, this.anInt10189).method1559(null, null, var_ha, 2048, 0, this.anInt10190, 0, (byte) 88, -1));
            if (class64 != null) {
                if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414[1]), 0);
                else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[1]), Class132.anInt1906, 0);
                aBoolean10191 |= class64.F();
                if (anInt10184 < class64.ma()) anInt10184 = class64.ma();
            }
        }
        Class64 class64 = (Exception_Sub1.aClass255_112.method1940(-48, this.anInt10181).method1559(null, null, var_ha, 2048, 0, this.anInt10185, 0, (byte) 88, -1));
        if (class64 != null) {
            if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414[0]), 0);
            else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[0]), Class132.anInt1906, 0);
            aBoolean10191 |= class64.F();
            if (anInt10184 < class64.ma()) anInt10184 = class64.ma();
        }
        return class318_sub4;
    }

    final int method2379(int i) {
        anInt10193++;
        if (i != -25675) aClass138_10194 = null;
        return anInt10184;
    }

    final boolean method2377(byte i) {
        anInt10192++;
        if (i != 122) method2394(true);
        return aBoolean10191;
    }

    final boolean method2376(int i) {
        if (i >= -12) this.anInt10180 = -23;
        anInt10187++;
        return false;
    }

    static {
        aClass138_10194 = new Class138(13, 0, 1, 0);
    }
}
