/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class84 {
    private final Class60 aClass60_1449 = new Class60(16);
    static int[] anIntArray1450 = {1, 2, 4, 8};
    static int anInt1451;
    static int anInt1452;
    static int anInt1453;
    static int anInt1454;
    static int anInt1455;
    static int anInt1456;
    static int anInt1457;
    static int anInt1458;
    static int anInt1459;
    private final Class45 aClass45_1460;

    final void method816(boolean bool) {
        anInt1455++;
        synchronized (aClass60_1449) {
            if (bool != false) method819((byte) 107, 46);
            aClass60_1449.method587(-119);
        }
    }

    static final Class318_Sub1_Sub3_Sub3 method817(int i, int i_0_, int i_1_, int i_2_) {
        anInt1456++;
        Class357 class357 = Class147.aClass357ArrayArrayArray2029[i_1_][i_0_][i_2_];
        if (class357 == null) return null;
        if (i != 252) return null;
        Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3 = null;
        int i_3_ = -1;
        for (Class148 class148 = class357.aClass148_4396; class148 != null; class148 = class148.aClass148_2038) {
            Class318_Sub1_Sub3 class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040;
            if (class318_sub1_sub3 instanceof Class318_Sub1_Sub3_Sub3) {
                Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3_4_ = (Class318_Sub1_Sub3_Sub3) class318_sub1_sub3;
                int i_5_ = 252 + (-1 + class318_sub1_sub3_sub3_4_.method2436((byte) 88)) * 256;
                int i_6_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.x) >> 9);
                int i_7_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.y) >> 9);
                int i_8_ = i_5_ + (class318_sub1_sub3_sub3_4_.x) >> 9;
                int i_9_ = ((class318_sub1_sub3_sub3_4_.y + i_5_) >> 9);
                if (i_0_ >= i_6_ && i_7_ <= i_2_ && i_0_ <= i_8_ && i_2_ <= i_9_) {
                    int i_10_ = (1 + i_9_ - i_2_) * (-i_0_ + (1 + i_8_));
                    if (i_3_ < i_10_) {
                        i_3_ = i_10_;
                        class318_sub1_sub3_sub3 = class318_sub1_sub3_sub3_4_;
                    }
                }
            }
        }
        return class318_sub1_sub3_sub3;
    }

    static final int method818(int i, int i_11_, int i_12_) {
        anInt1451++;
        int i_13_ = i_11_;
        while (i > 0) {
            i_13_ = i_12_ & 0x1 | i_13_ << 1;
            i--;
            i_12_ >>>= 1;
        }
        return i_13_;
    }

    final void method819(byte i, int i_14_) {
        synchronized (aClass60_1449) {
            aClass60_1449.method578(2, i_14_);
            if (i <= 8) method826(91, -94, 117, 24, 39, -100, null);
        }
        anInt1457++;
    }

    private final Class300 method820(int i, int i_15_) {
        anInt1458++;
        Class300 class300;
        synchronized (aClass60_1449) {
            class300 = (Class300) aClass60_1449.method583(i, 116);
        }
        if (class300 != null) return class300;
        byte[] is;
        synchronized (aClass45_1460) {
            is = aClass45_1460.method410(-1860, i_15_, i);
        }
        class300 = new Class300();
        if (is != null) class300.method2275(new Class348_Sub49(is), (byte) -123);
        synchronized (aClass60_1449) {
            aClass60_1449.method582(class300, i, (byte) -106);
        }
        return class300;
    }

    static final void method821(int i) {
        Class332.aClass60_4139.method590(0);
        int i_16_ = -67 / ((i - 39) / 33);
        anInt1459++;
    }

    final void method822(byte i) {
        synchronized (aClass60_1449) {
            aClass60_1449.method590(0);
        }
        if (i >= -13) method825(14);
        anInt1452++;
    }

    final Class305 method823(int i, int i_17_, int i_18_, int i_19_, Class25 class25, int i_20_) {
        anInt1453++;
        Class72[] class72s = null;
        Class300 class300 = method820(i_20_, 29);
        if (i_19_ > -36) return null;
        if (class300.anIntArray3821 != null) {
            class72s = new Class72[class300.anIntArray3821.length];
            for (int i_21_ = 0; class72s.length > i_21_; i_21_++) {
                Class38 class38 = class25.method301((class300.anIntArray3821[i_21_]), 29);
                class72s[i_21_] = new Class72(class38.anInt498, class38.anInt504, class38.anInt499, class38.anInt502, class38.anInt508, class38.anInt501, class38.anInt503, class38.aBoolean507);
            }
        }
        return new Class305(class300.anInt3817, class72s, class300.anInt3823, i_18_, i, i_17_);
    }

    static final void method824(int i) {
        Canvas_Sub1.anInt67 = i;
        for (int i_22_ = 0; i_22_ < Class318_Sub7.anInt6451; i_22_++) {
            for (int i_23_ = 0; i_23_ < Class348_Sub41.anInt7054; i_23_++) {
                if (Class147.aClass357ArrayArrayArray2029[i][i_22_][i_23_] == null) Class147.aClass357ArrayArrayArray2029[i][i_22_][i_23_] = new Class357(i);
            }
        }
    }

    public static void method825(int i) {
        anIntArray1450 = null;
        if (i > -73) anIntArray1450 = null;
    }

    static final void method826(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, ha var_ha) {
        if ((Class174.aSprite_2309 == null || Class348_Sub42_Sub15.aSprite_9658 == null || Class348_Sub42_Sub15.aSprite_9659 == null) && Class21.aClass45_322.method421(false, Class318_Sub1_Sub3_Sub3.anInt10257) && Class21.aClass45_322.method421(false, Class313.anInt3937) && Class21.aClass45_322.method421(false, Class79.anInt1387)) {
            Class207 class207 = Class207.method1521(Class21.aClass45_322, Class313.anInt3937, 0);
            Class348_Sub42_Sub15.aSprite_9658 = var_ha.method3691(class207, true);
            class207.method1518();
            Class309.aSprite_4808 = var_ha.method3691(class207, true);
            Class174.aSprite_2309 = (var_ha.method3691(Class207.method1521(Class21.aClass45_322, Class318_Sub1_Sub3_Sub3.anInt10257, 0), true));
            Class207 class207_29_ = Class207.method1521(Class21.aClass45_322, Class79.anInt1387, 0);
            Class348_Sub42_Sub15.aSprite_9659 = var_ha.method3691(class207_29_, true);
            class207_29_.method1518();
            Class110.aSprite_1706 = var_ha.method3691(class207_29_, true);
        }
        anInt1454++;
        if (Class174.aSprite_2309 != null && Class348_Sub42_Sub15.aSprite_9658 != null && Class348_Sub42_Sub15.aSprite_9659 != null) {
            int i_30_ = (-(Class348_Sub42_Sub15.aSprite_9659.method971() * 2) + i_25_) / Class174.aSprite_2309.method971();
            for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
                Class174.aSprite_2309.method974(i_24_ + (Class348_Sub42_Sub15.aSprite_9659.method971() - -(i_31_ * Class174.aSprite_2309.method971())), -Class174.aSprite_2309.method969() + (i_28_ + i_26_));
            int i_32_ = ((i_26_ - (i + Class348_Sub42_Sub15.aSprite_9659.method969())) / Class348_Sub42_Sub15.aSprite_9658.method969());
            for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
                Class348_Sub42_Sub15.aSprite_9658.method974(i_24_, (Class348_Sub42_Sub15.aSprite_9658.method969() * i_33_ + (i_28_ + i)));
                Class309.aSprite_4808.method974(-Class309.aSprite_4808.method971() + i_25_ + i_24_, (Class348_Sub42_Sub15.aSprite_9658.method969() * i_33_ + i + i_28_));
            }
            Class348_Sub42_Sub15.aSprite_9659.method974(i_24_, (-Class348_Sub42_Sub15.aSprite_9659.method969() + i_28_ + i_26_));
            Class110.aSprite_1706.method974(i_24_ + (i_25_ + -Class348_Sub42_Sub15.aSprite_9659.method971()), i_28_ - (-i_26_ + Class348_Sub42_Sub15.aSprite_9659.method969()));
        }
        int i_34_ = -24 % ((i_27_ - 85) / 35);
    }

    Class84(Class230 class230, int i, Class45 class45) {
        try {
            aClass45_1460 = class45;
            aClass45_1460.method407(0, 29);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("lca.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ')'));
        }
    }
}
