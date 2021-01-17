/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class154 {
    static int anInt2090;
    static int anInt2091;
    private int[] anIntArray2092;
    int anInt2093 = -1;
    private long aLong2094;
    int[] anIntArray2095;
    static int anInt2096;
    static int anInt2097;
    static int anInt2098;
    static int anInt2099;
    boolean aBoolean2100;
    static int anInt2101 = 0;
    private long aLong2102;
    private int anInt2103;
    static int anInt2104;
    static Class348_Sub49[] aClass348_Sub49Array2105 = new Class348_Sub49[2048];
    static int anInt2106;
    static int anInt2107;

    final Class64 method1226(Interface17 interface17, Class17 class17, Class182[] class182s, boolean bool, Class255 class255, int i, Class17 class17_0_, int i_1_, boolean bool_2_, int i_3_, int[] is, int i_4_, Class150 class150, int i_5_, ha var_ha, Class278 class278, Class87 class87, int i_6_, int i_7_, int i_8_, Class261 class261) {
        try {
            anInt2097++;
            if (this.anInt2093 != -1) return (class278.method2079(this.anInt2093, -1).method800(i, class182s, class87, !bool_2_, class17, i_8_, class261, i_7_, class17_0_, interface17, var_ha, i_3_, is, i_1_, i_6_, i_4_, i_5_));
            int i_9_ = i_4_;
            long l = aLong2102;
            int[] is_10_ = anIntArray2092;
            if (class17_0_ != null && (class17_0_.anInt249 >= 0 || class17_0_.anInt261 >= 0)) {
                is_10_ = new int[12];
                for (int i_11_ = 0; i_11_ < 12; i_11_++)
                    is_10_[i_11_] = anIntArray2092[i_11_];
                if (class17_0_.anInt249 >= 0) {
                    if (class17_0_.anInt249 == 65535) {
                        is_10_[5] = 0;
                        l ^= ~0xffffffffL;
                    } else {
                        is_10_[5] = Class273.method2057((class17_0_.anInt249), 1073741824);
                        l ^= (long) is_10_[5] << 32;
                    }
                }
                if (class17_0_.anInt261 >= 0) {
                    if (class17_0_.anInt261 == 65535) {
                        is_10_[3] = 0;
                        l ^= 0xffffffffL;
                    } else {
                        is_10_[3] = Class273.method2057((class17_0_.anInt261), 1073741824);
                        l ^= is_10_[3];
                    }
                }
            }
            boolean bool_12_ = false;
            boolean bool_13_ = false;
            boolean bool_14_ = false;
            boolean bool_15_ = class17_0_ != null || class17 != null;
            int i_16_ = class182s != null ? class182s.length : 0;
            for (int i_17_ = 0; i_16_ > i_17_; i_17_++) {
                Class95.aClass348_Sub42_Sub17Array1543[i_17_] = null;
                if (class182s[i_17_] != null) {
                    Class17 class17_18_ = class87.method835((class182s[i_17_].anInt2454), 7);
                    if (class17_18_.anIntArray237 != null) {
                        bool_15_ = true;
                        Class57.aClass17Array1048[i_17_] = class17_18_;
                        int i_19_ = class182s[i_17_].anInt2451;
                        int i_20_ = class182s[i_17_].anInt2455;
                        int i_21_ = class17_18_.anIntArray237[i_19_];
                        Class95.aClass348_Sub42_Sub17Array1543[i_17_] = class87.method839(i_21_ >>> 16, 3);
                        i_21_ &= 0xffff;
                        Class184.anIntArray2471[i_17_] = i_21_;
                        if (Class95.aClass348_Sub42_Sub17Array1543[i_17_] != null) {
                            bool_13_ |= Class95.aClass348_Sub42_Sub17Array1543[i_17_].method3272(i_21_, 0);
                            bool_12_ |= Class95.aClass348_Sub42_Sub17Array1543[i_17_].method3271(i_21_, 14);
                            bool_14_ |= Class95.aClass348_Sub42_Sub17Array1543[i_17_].method3267((byte) -109, i_21_);
                        }
                        if ((class17_18_.aBoolean241 || Class28.aBoolean5002) && i_20_ != -1 && (class17_18_.anIntArray237.length > i_20_)) {
                            Class100.anIntArray1583[i_17_] = class17_18_.anIntArray267[i_19_];
                            Class50_Sub3.anIntArray5241[i_17_] = class182s[i_17_].anInt2456;
                            int i_22_ = class17_18_.anIntArray237[i_20_];
                            Class295.aClass348_Sub42_Sub17Array3753[i_17_] = class87.method839(i_22_ >>> 16, 3);
                            i_22_ &= 0xffff;
                            Class227.anIntArray2967[i_17_] = i_22_;
                            if (Class295.aClass348_Sub42_Sub17Array3753[i_17_] != null) {
                                bool_13_ |= Class295.aClass348_Sub42_Sub17Array3753[i_17_].method3272(i_22_, 0);
                                bool_12_ |= Class295.aClass348_Sub42_Sub17Array3753[i_17_].method3271(i_22_, 14);
                                bool_14_ |= Class295.aClass348_Sub42_Sub17Array3753[i_17_].method3267((byte) -115, i_22_);
                            }
                        } else {
                            Class100.anIntArray1583[i_17_] = 0;
                            Class50_Sub3.anIntArray5241[i_17_] = 0;
                            Class295.aClass348_Sub42_Sub17Array3753[i_17_] = null;
                            Class227.anIntArray2967[i_17_] = -1;
                        }
                    }
                }
            }
            int i_23_ = -1;
            int i_24_ = -1;
            int i_25_ = 0;
            Class348_Sub42_Sub17 class348_sub42_sub17 = null;
            Class348_Sub42_Sub17 class348_sub42_sub17_26_ = null;
            int i_27_ = -1;
            int i_28_ = -1;
            int i_29_ = 0;
            Class348_Sub42_Sub17 class348_sub42_sub17_30_ = null;
            Class348_Sub42_Sub17 class348_sub42_sub17_31_ = null;
            if (bool_15_) {
                if (class17_0_ != null) {
                    i_23_ = class17_0_.anIntArray237[i_7_];
                    int i_32_ = i_23_ >>> 16;
                    class348_sub42_sub17 = class87.method839(i_32_, 3);
                    i_23_ &= 0xffff;
                    if (class348_sub42_sub17 != null) {
                        bool_13_ |= class348_sub42_sub17.method3272(i_23_, 0);
                        bool_12_ |= class348_sub42_sub17.method3271(i_23_, 14);
                        bool_14_ |= class348_sub42_sub17.method3267((byte) -110, i_23_);
                    }
                    if ((class17_0_.aBoolean241 || Class28.aBoolean5002) && i_1_ != -1 && i_1_ < class17_0_.anIntArray237.length) {
                        i_24_ = class17_0_.anIntArray237[i_1_];
                        i_25_ = class17_0_.anIntArray267[i_7_];
                        int i_33_ = i_24_ >>> 16;
                        class348_sub42_sub17_26_ = (i_32_ == i_33_ ? class348_sub42_sub17 : class87.method839(i_33_, 3));
                        i_24_ &= 0xffff;
                        if (class348_sub42_sub17_26_ != null) {
                            bool_13_ |= class348_sub42_sub17_26_.method3272(i_24_, 0);
                            bool_12_ |= class348_sub42_sub17_26_.method3271(i_24_, 14);
                            bool_14_ |= class348_sub42_sub17_26_.method3267((byte) -106, i_24_);
                        }
                    }
                }
                i_9_ |= 0x20;
                if (class17 != null) {
                    i_27_ = class17.anIntArray237[i_6_];
                    int i_34_ = i_27_ >>> 16;
                    i_27_ &= 0xffff;
                    class348_sub42_sub17_30_ = class87.method839(i_34_, 3);
                    if (class348_sub42_sub17_30_ != null) {
                        bool_13_ |= class348_sub42_sub17_30_.method3272(i_27_, 0);
                        bool_12_ |= class348_sub42_sub17_30_.method3271(i_27_, 14);
                        bool_14_ |= class348_sub42_sub17_30_.method3267((byte) -123, i_27_);
                    }
                    if ((class17.aBoolean241 || Class28.aBoolean5002) && i_3_ != -1 && i_3_ < class17.anIntArray237.length) {
                        i_28_ = class17.anIntArray237[i_3_];
                        i_29_ = class17.anIntArray267[i_6_];
                        int i_35_ = i_28_ >>> 16;
                        i_28_ &= 0xffff;
                        class348_sub42_sub17_31_ = (i_35_ == i_34_ ? class348_sub42_sub17_30_ : class87.method839(i_35_, 3));
                        if (class348_sub42_sub17_31_ != null) {
                            bool_13_ |= class348_sub42_sub17_31_.method3272(i_28_, 0);
                            bool_12_ |= class348_sub42_sub17_31_.method3271(i_28_, 14);
                            bool_14_ |= class348_sub42_sub17_31_.method3267((byte) -96, i_28_);
                        }
                    }
                }
                if (bool_13_) i_9_ |= 0x80;
                if (bool_12_) i_9_ |= 0x100;
                if (bool_14_) i_9_ |= 0x400;
            }
            Class64 class64;
            synchronized (Class24.aClass60_355) {
                class64 = (Class64) Class24.aClass60_355.method583(l, -47);
            }
            Class225 class225 = null;
            if (anInt2103 != -1) class225 = class261.method1983(anInt2103, 32);
            if (class64 == null || var_ha.method3667(class64.ua(), i_9_) != 0) {
                if (class64 != null) i_9_ = var_ha.method3679(i_9_, class64.ua());
                int i_36_ = i_9_;
                boolean bool_37_ = false;
                for (int i_38_ = 0; i_38_ < 12; i_38_++) {
                    int i_39_ = is_10_[i_38_];
                    if ((0x40000000 & i_39_) == 0) {
                        if ((~0x7fffffff & i_39_) != 0 && !class150.method1203((byte) 33, i_39_ & 0x3fffffff).method348((byte) 34)) bool_37_ = true;
                    } else if (!class255.method1940(94, 0x3fffffff & i_39_).method1565(this.aBoolean2100, -1)) bool_37_ = true;
                }
                if (bool_37_) {
                    if (aLong2094 != -1) {
                        synchronized (Class24.aClass60_355) {
                            class64 = (Class64) Class24.aClass60_355.method583(aLong2094, -92);
                        }
                    }
                    if (class64 == null || var_ha.method3667(class64.ua(), i_9_) != 0) return null;
                } else {
                    Class124[] class124s = new Class124[12];
                    for (int i_40_ = 0; i_40_ < 12; i_40_++) {
                        int i_41_ = is_10_[i_40_];
                        if ((0x40000000 & i_41_) == 0) {
                            if ((~0x7fffffff & i_41_) != 0) {
                                Class124 class124 = class150.method1203((byte) 33, i_41_ & 0x3fffffff).method341(91);
                                if (class124 != null) class124s[i_40_] = class124;
                            }
                        } else {
                            Class124 class124 = (class255.method1940(104, i_41_ & 0x3fffffff).method1558(this.aBoolean2100, !bool_2_));
                            if (class124 != null) class124s[i_40_] = class124;
                        }
                    }
                    if (class225 != null && class225.anIntArrayArray2939 != null) {
                        for (int i_42_ = 0; ((class225.anIntArrayArray2939).length > i_42_); i_42_++) {
                            if (class124s[i_42_] != null) {
                                int i_43_ = 0;
                                int i_44_ = 0;
                                int i_45_ = 0;
                                int i_46_ = 0;
                                int i_47_ = 0;
                                int i_48_ = 0;
                                if ((class225.anIntArrayArray2939[i_42_]) != null) {
                                    i_47_ = ((class225.anIntArrayArray2939[i_42_][4]) << 3);
                                    i_44_ = (class225.anIntArrayArray2939[i_42_][1]);
                                    i_48_ = ((class225.anIntArrayArray2939[i_42_][5]) << 3);
                                    i_43_ = (class225.anIntArrayArray2939[i_42_][0]);
                                    i_46_ = ((class225.anIntArrayArray2939[i_42_][3]) << 3);
                                    i_45_ = (class225.anIntArrayArray2939[i_42_][2]);
                                }
                                if (i_46_ != 0 || i_47_ != 0 || i_48_ != 0) class124s[i_42_].method1107(6875, i_47_, i_48_, i_46_);
                                if (i_43_ != 0 || i_44_ != 0 || i_45_ != 0) class124s[i_42_].method1099((byte) -82, i_45_, i_43_, i_44_);
                            }
                        }
                    }
                    Class124 class124 = new Class124(class124s, class124s.length);
                    i_36_ |= 0x4000;
                    class64 = var_ha.method3625(class124, i_36_, Class168.anInt2251, 64, 850);
                    for (int i_49_ = 0; i_49_ < 5; i_49_++) {
                        for (int i_50_ = 0; (Class367_Sub2.aShortArrayArrayArray7290.length > i_50_); i_50_++) {
                            if ((Class367_Sub2.aShortArrayArrayArray7290[i_50_][i_49_]).length > this.anIntArray2095[i_49_]) class64.ia((Class136.aShortArrayArray4791[i_50_][i_49_]), (Class367_Sub2.aShortArrayArrayArray7290[i_50_][i_49_][(this.anIntArray2095[i_49_])]));
                        }
                    }
                    if (bool) {
                        class64.s(i_9_);
                        synchronized (Class24.aClass60_355) {
                            Class24.aClass60_355.method582(class64, l, (byte) -98);
                        }
                        aLong2094 = l;
                    }
                }
            }
            Class64 class64_51_ = class64.method614((byte) 4, i_9_, bool_2_);
            boolean bool_52_ = false;
            if (is != null) {
                for (int i_53_ = 0; i_53_ < 12; i_53_++) {
                    if (is[i_53_] != -1) bool_52_ = true;
                }
            }
            if (!bool_15_ && !bool_52_) return class64_51_;
            Class101[] class101s = null;
            if (class225 != null) class101s = class225.method1618(var_ha, 0);
            if (bool_52_ && class101s != null) {
                for (int i_54_ = 0; i_54_ < 12; i_54_++) {
                    if (class101s[i_54_] != null) class64_51_.method610(class101s[i_54_], 1 << i_54_, true);
                }
            }
            int i_55_ = 0;
            int i_56_ = 1;
            for (/**/; i_16_ > i_55_; i_55_++) {
                if (Class95.aClass348_Sub42_Sub17Array1543[i_55_] != null)
                    class64_51_.method603((byte) -55, -1 + Class50_Sub3.anIntArray5241[i_55_], null, i_56_, Class184.anIntArray2471[i_55_], Class227.anIntArray2967[i_55_], Class295.aClass348_Sub42_Sub17Array3753[i_55_], 0, Class95.aClass348_Sub42_Sub17Array1543[i_55_], false, Class100.anIntArray1583[i_55_]);
                i_56_ <<= 1;
            }
            if (bool_52_) {
                for (int i_57_ = 0; i_57_ < 12; i_57_++) {
                    if (is[i_57_] != -1) {
                        int i_58_ = is[i_57_] - i;
                        i_58_ &= 0x3fff;
                        Class101 class101 = var_ha.method3654();
                        class101.method895(i_58_);
                        class64_51_.method610(class101, 1 << i_57_, false);
                    }
                }
            }
            if (bool_52_ && class101s != null) {
                for (int i_59_ = 0; i_59_ < 12; i_59_++) {
                    if (class101s[i_59_] != null) class64_51_.method610(class101s[i_59_], 1 << i_59_, false);
                }
            }
            if (class348_sub42_sub17 != null && class348_sub42_sub17_30_ != null)
                class64_51_.method625(class348_sub42_sub17_26_, i_25_, (byte) 121, i_29_, class348_sub42_sub17_30_, i_23_, i_27_, i_5_ - 1, class348_sub42_sub17, false, i_24_, class348_sub42_sub17_31_, i_8_ + -1, class17_0_.aBooleanArray263, i_28_);
            else if (class348_sub42_sub17 != null) class64_51_.method617(i_23_, i_25_, class348_sub42_sub17_26_, 0, class348_sub42_sub17, false, false, i_24_, i_5_ + -1);
            else if (class348_sub42_sub17_30_ != null) class64_51_.method617(i_27_, i_29_, class348_sub42_sub17_31_, 0, class348_sub42_sub17_30_, false, false, i_28_, i_8_ + -1);
            for (int i_60_ = 0; i_16_ > i_60_; i_60_++) {
                Class95.aClass348_Sub42_Sub17Array1543[i_60_] = null;
                Class295.aClass348_Sub42_Sub17Array3753[i_60_] = null;
                Class57.aClass17Array1048[i_60_] = null;
            }
            return class64_51_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.C(" + (interface17 != null ? "{...}" : "null") + ',' + (class17 != null ? "{...}" : "null") + ',' + (class182s != null ? "{...}" : "null") + ',' + bool + ',' + (class255 != null ? "{...}" : "null") + ',' + i + ',' + (class17_0_ != null ? "{...}" : "null") + ',' + i_1_ + ',' + bool_2_ + ',' + i_3_ + ',' + (is != null ? "{...}" : "null") + ',' + i_4_ + ',' + (class150 != null ? "{...}" : "null") + ',' + i_5_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class278 != null ? "{...}" : "null") + ',' + (class87 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + (class261 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1227(byte i, int i_61_, int i_62_, Class255 class255) {
        try {
            if (i == 42) {
                anInt2099++;
                if (i_62_ == -1) anIntArray2092[i_61_] = 0;
                else if (class255.method1940(-125, i_62_) != null) {
                    anIntArray2092[i_61_] = Class273.method2057(1073741824, i_62_);
                    method1234(-100);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.H(" + i + ',' + i_61_ + ',' + i_62_ + ',' + (class255 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1228(int i, int i_63_, int i_64_, int[] is, boolean bool, int[] is_65_) {
        try {
            if (i_64_ != anInt2103) anInt2103 = i_64_;
            anIntArray2092 = is;
            if (i_63_ <= 54) anIntArray2092 = null;
            this.anIntArray2095 = is_65_;
            anInt2090++;
            this.anInt2093 = i;
            this.aBoolean2100 = bool;
            method1234(-25);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.F(" + i + ',' + i_63_ + ',' + i_64_ + ',' + (is != null ? "{...}" : "null") + ',' + bool + ',' + (is_65_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1229(byte i, boolean bool) {
        anInt2104++;
        this.aBoolean2100 = bool;
        if (i != -17) this.aBoolean2100 = false;
        method1234(-78);
    }

    final Class64 method1230(Class255 class255, int i, Class87 class87, Class150 class150, Interface17 interface17, Class278 class278, int i_66_, int i_67_, int i_68_, Class17 class17, int i_69_, ha var_ha) {
        try {
            anInt2107++;
            if (this.anInt2093 != -1) return (class278.method2079(this.anInt2093, -1).method803(interface17, var_ha, i_69_, i_67_, class17, class87, i_66_, 121, i_68_));
            int i_70_ = i_68_;
            if (class17 != null) {
                boolean bool = false;
                boolean bool_71_ = false;
                boolean bool_72_ = false;
                boolean bool_73_ = false;
                int i_74_ = -1;
                int i_75_ = -1;
                Object object = null;
                i_70_ |= 0x20;
                Object object_76_ = null;
                i_74_ = class17.anIntArray237[i_66_];
                int i_77_ = i_74_ >>> 16;
                i_74_ &= 0xffff;
                Class348_Sub42_Sub17 class348_sub42_sub17 = class87.method839(i_77_, 3);
                if (class348_sub42_sub17 != null) {
                    bool_71_ |= class348_sub42_sub17.method3272(i_74_, 0);
                    bool |= class348_sub42_sub17.method3271(i_74_, 14);
                    bool_73_ |= class348_sub42_sub17.method3267((byte) -125, i_74_);
                    bool_72_ |= class17.aBoolean242;
                }
                if ((class17.aBoolean241 || Class28.aBoolean5002) && i_67_ != -1 && i_67_ < class17.anIntArray237.length) {
                    i_75_ = class17.anIntArray237[i_67_];
                    int i_78_ = i_75_ >>> 16;
                    Class348_Sub42_Sub17 class348_sub42_sub17_79_ = (i_78_ != i_77_ ? class87.method839(i_78_, i ^ ~0x17f6eb54) : class348_sub42_sub17);
                    i_75_ &= 0xffff;
                    if (class348_sub42_sub17_79_ != null) {
                        bool_71_ |= class348_sub42_sub17_79_.method3272(i_75_, 0);
                        bool |= class348_sub42_sub17_79_.method3271(i_75_, 14);
                        bool_73_ |= class348_sub42_sub17_79_.method3267((byte) -127, i_75_);
                    }
                }
                if (bool_71_) i_70_ |= 0x80;
                if (bool) i_70_ |= 0x100;
                if (bool_72_) i_70_ |= 0x200;
                if (bool_73_) i_70_ |= 0x400;
            }
            if (i != -402058072) aLong2094 = -101L;
            Class64 class64;
            synchronized (Class130.aClass60_1894) {
                class64 = (Class64) Class130.aClass60_1894.method583(aLong2102, i ^ ~0x17f6eb29);
            }
            if (class64 == null || var_ha.method3667(class64.ua(), i_70_) != 0) {
                if (class64 != null) i_70_ = var_ha.method3679(i_70_, class64.ua());
                int i_80_ = i_70_;
                boolean bool = false;
                for (int i_81_ = 0; i_81_ < 12; i_81_++) {
                    int i_82_ = anIntArray2092[i_81_];
                    if ((i_82_ & 0x40000000) != 0) {
                        if (!class255.method1940(i ^ 0x17f6eb2c, 0x3fffffff & i_82_).method1555((byte) 97, this.aBoolean2100)) bool = true;
                    } else if ((~0x7fffffff & i_82_) != 0 && !class150.method1203((byte) 33, i_82_ & 0x3fffffff).method342((byte) 110)) bool = true;
                }
                if (bool) return null;
                Class124[] class124s = new Class124[12];
                int i_83_ = 0;
                for (int i_84_ = 0; i_84_ < 12; i_84_++) {
                    int i_85_ = anIntArray2092[i_84_];
                    if ((i_85_ & 0x40000000) == 0) {
                        if ((i_85_ & ~0x7fffffff) != 0) {
                            Class124 class124 = class150.method1203((byte) 33, i_85_ & 0x3fffffff).method343((byte) -73);
                            if (class124 != null) class124s[i_83_++] = class124;
                        }
                    } else {
                        Class124 class124 = (class255.method1940(-107, i_85_ & 0x3fffffff).method1554(this.aBoolean2100, -14));
                        if (class124 != null) class124s[i_83_++] = class124;
                    }
                }
                i_80_ |= 0x4000;
                Class124 class124 = new Class124(class124s, i_83_);
                class64 = var_ha.method3625(class124, i_80_, Class168.anInt2251, 64, 768);
                for (int i_86_ = 0; i_86_ < 5; i_86_++) {
                    for (int i_87_ = 0; (Class367_Sub2.aShortArrayArrayArray7290.length > i_87_); i_87_++) {
                        if (this.anIntArray2095[i_86_] < (Class367_Sub2.aShortArrayArrayArray7290[i_87_][i_86_]).length) class64.ia((Class136.aShortArrayArray4791[i_87_][i_86_]), (Class367_Sub2.aShortArrayArrayArray7290[i_87_][i_86_][(this.anIntArray2095[i_86_])]));
                    }
                }
                class64.s(i_70_);
                synchronized (Class130.aClass60_1894) {
                    Class130.aClass60_1894.method582(class64, aLong2102, (byte) -97);
                }
            }
            if (class17 == null) return class64;
            Class64 class64_88_ = class64.method614((byte) 4, i_70_, true);
            class64_88_ = class17.method269(123, class64, i_67_, i_69_, i_68_, i_66_);
            return class64_88_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.J(" + (class255 != null ? "{...}" : "null") + ',' + i + ',' + (class87 != null ? "{...}" : "null") + ',' + (class150 != null ? "{...}" : "null") + ',' + (interface17 != null ? "{...}" : "null") + ',' + (class278 != null ? "{...}" : "null") + ',' + i_66_ + ',' + i_67_ + ',' + i_68_ + ',' + (class17 != null ? "{...}" : "null") + ',' + i_69_ + ',' + (var_ha != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1231(int i, int i_89_, int i_90_) {
        this.anIntArray2095[i] = i_90_;
        if (i_89_ == 0) {
            anInt2091++;
            method1234(-48);
        }
    }

    final Class64 method1232(int i, int i_91_, int i_92_, int i_93_, Class87 class87, Class150 class150, int i_94_, int i_95_, int i_96_, ha var_ha, int i_97_, Class17 class17) {
        try {
            anInt2106++;
            int i_98_ = i_91_;
            if (class17 != null) {
                boolean bool = false;
                boolean bool_99_ = false;
                boolean bool_100_ = false;
                boolean bool_101_ = false;
                int i_102_ = -1;
                int i_103_ = -1;
                Object object = null;
                Object object_104_ = null;
                i_98_ |= 0x20;
                i_102_ = class17.anIntArray237[i_97_];
                int i_105_ = i_102_ >>> 16;
                Class348_Sub42_Sub17 class348_sub42_sub17 = class87.method839(i_105_, 3);
                i_102_ &= 0xffff;
                if (class348_sub42_sub17 != null) {
                    bool_99_ |= class348_sub42_sub17.method3272(i_102_, i_94_ ^ ~0x3be2);
                    bool |= class348_sub42_sub17.method3271(i_102_, 14);
                    bool_101_ |= class348_sub42_sub17.method3267((byte) -125, i_102_);
                    bool_100_ |= class17.aBoolean242;
                }
                if ((class17.aBoolean241 || Class28.aBoolean5002) && i != -1 && i < class17.anIntArray237.length) {
                    i_103_ = class17.anIntArray237[i];
                    int i_106_ = i_103_ >>> 16;
                    i_103_ &= 0xffff;
                    Class348_Sub42_Sub17 class348_sub42_sub17_107_;
                    if (i_105_ != i_106_) class348_sub42_sub17_107_ = class87.method839(i_103_ >>> 16, 3);
                    else class348_sub42_sub17_107_ = class348_sub42_sub17;
                    if (class348_sub42_sub17_107_ != null) {
                        bool_99_ |= class348_sub42_sub17_107_.method3272(i_103_, 0);
                        bool |= class348_sub42_sub17_107_.method3271(i_103_, 14);
                        bool_101_ |= class348_sub42_sub17_107_.method3267((byte) -123, i_103_);
                    }
                }
                if (bool_99_) i_98_ |= 0x80;
                if (bool) i_98_ |= 0x100;
                if (bool_100_) i_98_ |= 0x200;
                if (bool_101_) i_98_ |= 0x400;
            }
            long l = (long) i_95_ | ((long) (i_93_ << 16) | (long) i_92_ << 32);
            Class64 class64;
            synchronized (Class130.aClass60_1894) {
                class64 = (Class64) Class130.aClass60_1894.method583(l, i_94_ ^ ~0x3bd4);
            }
            if (class64 == null || var_ha.method3667(class64.ua(), i_98_) != 0) {
                if (class64 != null) i_98_ = var_ha.method3679(i_98_, class64.ua());
                int i_108_ = i_98_;
                Class124[] class124s = new Class124[3];
                int i_109_ = 0;
                if (!class150.method1203((byte) 33, i_95_).method342((byte) 114) || !class150.method1203((byte) 33, i_93_).method342((byte) 102) || !class150.method1203((byte) 33, i_92_).method342((byte) 94)) return null;
                Class124 class124 = class150.method1203((byte) 33, i_95_).method343((byte) -50);
                if (class124 != null) class124s[i_109_++] = class124;
                class124 = class150.method1203((byte) 33, i_93_).method343((byte) -105);
                if (class124 != null) class124s[i_109_++] = class124;
                class124 = class150.method1203((byte) 33, i_92_).method343((byte) -30);
                if (class124 != null) class124s[i_109_++] = class124;
                class124 = new Class124(class124s, i_109_);
                i_108_ |= 0x4000;
                class64 = var_ha.method3625(class124, i_108_, Class168.anInt2251, 64, 768);
                for (int i_110_ = 0; i_110_ < 5; i_110_++) {
                    for (int i_111_ = 0; (i_111_ < Class367_Sub2.aShortArrayArrayArray7290.length); i_111_++) {
                        if (this.anIntArray2095[i_110_] < (Class367_Sub2.aShortArrayArrayArray7290[i_111_][i_110_]).length) class64.ia((Class136.aShortArrayArray4791[i_111_][i_110_]), (Class367_Sub2.aShortArrayArrayArray7290[i_111_][i_110_][(this.anIntArray2095[i_110_])]));
                    }
                }
                class64.s(i_98_);
                synchronized (Class130.aClass60_1894) {
                    Class130.aClass60_1894.method582(class64, l, (byte) -109);
                }
            }
            if (class17 == null) return class64;
            if (i_94_ != -15331) return null;
            class64 = class64.method614((byte) 4, i_98_, true);
            class64 = class17.method269(-32, class64, i, i_96_, i_91_, i_97_);
            return class64;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.G(" + i + ',' + i_91_ + ',' + i_92_ + ',' + i_93_ + ',' + (class87 != null ? "{...}" : "null") + ',' + (class150 != null ? "{...}" : "null") + ',' + i_94_ + ',' + i_95_ + ',' + i_96_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_97_ + ',' + (class17 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1233(Class150 class150, int i, int i_112_, int i_113_) {
        try {
            anInt2098++;
            int i_114_ = Class283.anIntArray3661[i_113_];
            if (class150.method1203((byte) 33, i) != null) {
                if (i_112_ != -1) aLong2094 = -53L;
                anIntArray2092[i_114_] = Class273.method2057(i, -2147483648);
                method1234(-54);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oo.D(" + (class150 != null ? "{...}" : "null") + ',' + i + ',' + i_112_ + ',' + i_113_ + ')'));
        }
    }

    private final void method1234(int i) {
        anInt2096++;
        aLong2102 = -1L;
        long[] ls = Class348_Sub40_Sub21.aLongArray9283;
        aLong2102 = ls[(int) (((long) (anInt2103 >> 8) ^ aLong2102) & 0xffL)] ^ aLong2102 >>> 8;
        if (i > -6) aLong2094 = 43L;
        aLong2102 = aLong2102 >>> 8 ^ ls[(int) (0xffL & ((long) anInt2103 ^ aLong2102))];
        for (int i_115_ = 0; i_115_ < 12; i_115_++) {
            aLong2102 = (aLong2102 >>> 8 ^ ls[(int) (((long) (anIntArray2092[i_115_] >> 24) ^ aLong2102) & 0xffL)]);
            aLong2102 = ls[(int) (0xffL & ((long) (anIntArray2092[i_115_] >> 16) ^ aLong2102))] ^ aLong2102 >>> 8;
            aLong2102 = (aLong2102 >>> 8 ^ ls[(int) (0xffL & (aLong2102 ^ (long) (anIntArray2092[i_115_] >> 8)))]);
            aLong2102 = (ls[(int) (0xffL & (aLong2102 ^ (long) anIntArray2092[i_115_]))] ^ aLong2102 >>> 8);
        }
        for (int i_116_ = 0; i_116_ < 5; i_116_++)
            aLong2102 = (ls[(int) (0xffL & (aLong2102 ^ (long) (this.anIntArray2095[i_116_])))] ^ aLong2102 >>> 8);
        aLong2102 = (aLong2102 >>> 8 ^ ls[(int) (0xffL & (aLong2102 ^ (long) (!this.aBoolean2100 ? 0 : 1)))]);
    }

    public static void method1235(byte i) {
        if (i != 7) anInt2101 = -42;
        aClass348_Sub49Array2105 = null;
    }

    public Class154() {
        /* empty */
    }
}
