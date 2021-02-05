/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class6 {
    short aShort143;
    int anInt144;
    boolean aBoolean145;
    short aShort146;
    static int anInt147;
    byte aByte148;
    static int anInt149;
    short aShort150;
    static Class227 aClass227_151 = new Class227(2);
    static int anInt152;
    static int anInt153;
    int anInt154;
    static int anInt155;
    byte aByte156;

    static final void method203(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt149++;
        int i_4_ = 0;
        if (i > -92) aClass227_151 = null;
        int i_5_ = i_3_;
        int i_6_ = -i_3_;
        int i_7_ = -1;
        int i_8_ = Class85.method831(Class113.anInt1745, i_3_ + i_0_, Class369.anInt4960, -108);
        int i_9_ = Class85.method831(Class113.anInt1745, -i_3_ + i_0_, Class369.anInt4960, 81);
        Class135_Sub2.method1156(-27, i_8_, Class17.anIntArrayArray255[i_2_], i_9_, i_1_);
        while (i_5_ > i_4_) {
            i_7_ += 2;
            i_6_ += i_7_;
            if (i_6_ > 0) {
                i_5_--;
                i_6_ -= i_5_ << 1;
                int i_10_ = -i_5_ + i_2_;
                int i_11_ = i_5_ + i_2_;
                if (i_11_ >= Class132.anInt1910 && Class38.anInt513 >= i_10_) {
                    int i_12_ = Class85.method831(Class113.anInt1745, i_4_ + i_0_, Class369.anInt4960, 74);
                    int i_13_ = Class85.method831(Class113.anInt1745, i_0_ + -i_4_, Class369.anInt4960, 98);
                    if (i_11_ <= Class38.anInt513) Class135_Sub2.method1156(-27, i_12_, (Class17.anIntArrayArray255[i_11_]), i_13_, i_1_);
                    if (Class132.anInt1910 <= i_10_) Class135_Sub2.method1156(-27, i_12_, (Class17.anIntArrayArray255[i_10_]), i_13_, i_1_);
                }
            }
            int i_14_ = -++i_4_ + i_2_;
            int i_15_ = i_2_ - -i_4_;
            if (Class132.anInt1910 <= i_15_ && Class38.anInt513 >= i_14_) {
                int i_16_ = Class85.method831(Class113.anInt1745, i_0_ + i_5_, Class369.anInt4960, 52);
                int i_17_ = Class85.method831(Class113.anInt1745, i_0_ + -i_5_, Class369.anInt4960, -106);
                if (i_15_ <= Class38.anInt513) Class135_Sub2.method1156(-27, i_16_, Class17.anIntArrayArray255[i_15_], i_17_, i_1_);
                if (i_14_ >= Class132.anInt1910) Class135_Sub2.method1156(-27, i_16_, Class17.anIntArrayArray255[i_14_], i_17_, i_1_);
            }
        }
    }

    static final void method204(int i) {
        anInt155++;
        while (Class299.aClass348_Sub49_Sub2_3813.method3415(-62, Class348_Sub40_Sub25.anInt9341) >= 15) {
            int i_18_ = Class299.aClass348_Sub49_Sub2_3813.readBits((byte) -24, 15);
            if (i_18_ == 32767) break;
            boolean bool = false;
            Class348_Sub22 class348_sub22 = ((Class348_Sub22) Class282.aClass356_3654.method3480(i_18_, -6008));
            if (class348_sub22 == null) {
                Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = new Class318_Sub1_Sub3_Sub3_Sub1();
                class318_sub1_sub3_sub3_sub1.anInt10290 = i_18_;
                class348_sub22 = new Class348_Sub22(class318_sub1_sub3_sub3_sub1);
                Class282.aClass356_3654.method3483((byte) 57, i_18_, class348_sub22);
                bool = true;
                Class348_Sub40_Sub23.aClass348_Sub22Array9319[Class348_Sub32.anInt6930++] = class348_sub22;
            }
            Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1 = (class348_sub22.aClass318_Sub1_Sub3_Sub3_Sub1_6859);
            Class74.anIntArray1233[Class150.anInt2057++] = i_18_;
            class318_sub1_sub3_sub3_sub1.anInt10306 = Class348_Sub23_Sub3.anInt9041;
            if ((class318_sub1_sub3_sub3_sub1.aClass79_10505) != null && class318_sub1_sub3_sub3_sub1.aClass79_10505.method793(0)) Class5.method181(true, class318_sub1_sub3_sub3_sub1);
            int i_19_ = Class299.aClass348_Sub49_Sub2_3813.readBits((byte) -24, 2);
            int i_20_ = Class299.aClass348_Sub49_Sub2_3813.readBits((byte) -24, 1);
            int i_21_ = Class299.aClass348_Sub49_Sub2_3813.readBits((byte) -24, 5);
            if (i_21_ > 15) i_21_ -= 32;
            int i_22_ = Class299.aClass348_Sub49_Sub2_3813.readBits((byte) -24, 5);
            if (i_22_ > 15) i_22_ -= 32;
            int i_23_ = 0x3d01 & 4 + Class299.aClass348_Sub49_Sub2_3813.readBits((byte) -24, 3) << 11;
            int i_24_ = Class299.aClass348_Sub49_Sub2_3813.readBits((byte) -24, 1);
            if (i_24_ == 1) Class13.anIntArray224[Class101.anInt1597++] = i_18_;
            class318_sub1_sub3_sub3_sub1.method2448((Class189.aClass278_2529.method2079(Class299.aClass348_Sub49_Sub2_3813.readBits((byte) -24, 14), -1)), i ^ 0x2b297815);
            class318_sub1_sub3_sub3_sub1.method2434((byte) 111, class318_sub1_sub3_sub3_sub1.aClass79_10505.anInt1399);
            class318_sub1_sub3_sub3_sub1.anInt10310 = (class318_sub1_sub3_sub3_sub1.aClass79_10505.anInt1329) << 3;
            if (bool) class318_sub1_sub3_sub3_sub1.method2435((byte) -108, i_23_, true);
            class318_sub1_sub3_sub3_sub1.method2444((Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anIntArray10317[0]) - -i_21_, i_20_ == 1, (Class132.aClass318_Sub1_Sub3_Sub3_Sub2_1907.anIntArray10320[0]) + i_22_, i + 724138125, class318_sub1_sub3_sub3_sub1.method2436((byte) 50), i_19_);
            if (class318_sub1_sub3_sub3_sub1.aClass79_10505.method793(0)) Class223.method1614(979190089, class318_sub1_sub3_sub3_sub1, class318_sub1_sub3_sub3_sub1.aByte6381, (class318_sub1_sub3_sub3_sub1.anIntArray10317[0]), (class318_sub1_sub3_sub3_sub1.anIntArray10320[0]), null, null, 0);
        }
        if (i == -724138005) Class299.aClass348_Sub49_Sub2_3813.stopBitAccess(false);
    }

    static final void method205(int i, int i_25_, int i_26_, String string, int i_27_, int i_28_, int i_29_, int i_30_) {
        try {
            anInt147++;
            Class318_Sub5 class318_sub5 = new Class318_Sub5();
            class318_sub5.anInt6419 = i_25_;
            class318_sub5.anInt6418 = i_30_;
            class318_sub5.anInt6422 = i_29_;
            class318_sub5.anInt6421 = i + Class367_Sub11.anInt7396;
            if (i_28_ >= -48) method206(-90, -126, -8);
            class318_sub5.aString6416 = string;
            class318_sub5.anInt6415 = i_26_;
            class318_sub5.anInt6420 = i_27_;
            Class225.aClass243_2957.method1869(-103, class318_sub5);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("go.F(" + i + ',' + i_25_ + ',' + i_26_ + ',' + (string != null ? "{...}" : "null") + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ')'));
        }
    }

    static final int method206(int i, int i_31_, int i_32_) {
        anInt152++;
        int i_33_ = i_31_ >>> 24;
        int i_34_ = -i_33_ + i_32_;
        i_31_ = (0xff0000 & (i_31_ & 0xff00) * i_33_ | (0xff00ff & i_31_) * i_33_ & ~0xff00ff) >>> 8;
        return i_31_ + (((i & 0xff00) * i_34_ & 0xff0000 | ~0xff00ff & (0xff00ff & i) * i_34_) >>> 8);
    }

    static final void method207(ha var_ha, byte i) {
        do {
            try {
                anInt153++;
                int i_35_ = 0;
                int i_36_ = 0;
                if (i < 113) aClass227_151 = null;
                if (Class59_Sub1.aBoolean5300) {
                    i_35_ = s_Sub3.method4008((byte) -127);
                    i_36_ = Class16.method260(false);
                }
                var_ha.KA(i_35_, i_36_, Class321.anInt4017 + i_35_, i_36_ + 350);
                var_ha.aa(i_35_, i_36_, Class321.anInt4017, 350, 0x332277 | Class168.anInt2254 << 24, 1);
                Class338.method2663(-5590, i_35_, Class321.anInt4017 + i_35_, i_36_, i_36_ + 350);
                int i_37_ = 350 / Class68.anInt1188;
                if (Class369_Sub2.anInt8587 > 0) {
                    int i_38_ = 342 + -Class68.anInt1188;
                    int i_39_ = (i_37_ * i_38_ / (-1 + (i_37_ - -Class369_Sub2.anInt8587)));
                    int i_40_ = 4;
                    if (Class369_Sub2.anInt8587 > 1) i_40_ += ((Class369_Sub2.anInt8587 + (-1 + -Class284.anInt3676)) * (i_38_ - i_39_) / (Class369_Sub2.anInt8587 + -1));
                    var_ha.aa(-16 + (Class321.anInt4017 + i_35_), i_36_ + i_40_, 12, i_39_, 0x332277 | Class168.anInt2254 << 24, 2);
                    for (int i_41_ = Class284.anInt3676; ((i_41_ < i_37_ + Class284.anInt3676) && Class369_Sub2.anInt8587 > i_41_); i_41_++) {
                        String[] strings = (Class348_Sub40_Sub23.method3113('\010', true, Class286_Sub1.aStringArray6200[i_41_]));
                        int i_42_ = (-16 + Class321.anInt4017 + -8) / strings.length;
                        for (int i_43_ = 0; i_43_ < strings.length; i_43_++) {
                            int i_44_ = i_42_ * i_43_ + 8;
                            var_ha.KA(i_35_ + i_44_, i_36_, i_42_ + i_35_ - (-i_44_ - -8), i_36_ + 350);
                            Applet_Sub1.aClass324_20.method2576(Class250.method1909((byte) 31, strings[i_43_]), -1, (-((-Class284.anInt3676 + i_41_) * Class68.anInt1188) + (-Class348_Sub31_Sub2.anInt9077 + i_36_ - (-350 - (-2 + -(Class246.aClass143_3179.anInt1993))))), i_35_ + i_44_, -16777216, -110);
                        }
                    }
                }
                Class240.aClass324_4684.method2569("Build: 634", 350 + (i_36_ + -20), -1, (Class321.anInt4017 + i_35_ + -25), -121, -16777216);
                var_ha.KA(i_35_, i_36_, i_35_ - -Class321.anInt4017, i_36_ - -350);
                var_ha.method3649((byte) -80, Class321.anInt4017, -Class348_Sub31_Sub2.anInt9077 + (350 + i_36_), -1, i_35_);
                Class262.aClass324_3326.method2576("--> " + Class250.method1909((byte) 31, Class363.aString4461), -1, (i_36_ - (-350 + Class369.aClass143_4962.anInt1993) - 1), 10 + i_35_, -16777216, -127);
                if (!Class175.aBoolean2329) break;
                int i_45_ = -1;
                if (Class367_Sub11.anInt7396 % 30 > 15) i_45_ = 16777215;
                var_ha.method3660(10 + (i_35_ - -(Class369.aClass143_4962.method1183(true, "--> " + (Class250.method1909((byte) 31, Class363.aString4461).substring(0, Class348_Sub38.anInt7006))))), i_45_, 12, 350 + (i_36_ + -Class369.aClass143_4962.anInt1993 - 11), true);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("go.B(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    public static void method208(byte i) {
        if (i != 0) method204(29);
        aClass227_151 = null;
    }

    Class6(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, boolean bool, int i_54_) {
        this.aBoolean145 = bool;
        this.aByte156 = (byte) i_53_;
        this.anInt154 = i_54_;
        this.aShort143 = (short) i_50_;
        this.aByte148 = (byte) i_52_;
        this.aShort146 = (short) i_51_;
        this.aShort150 = (short) i_49_;
        this.anInt144 = i;
    }
}
