/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class60 {
    private final int anInt1084;
    static int anInt1085;
    private int anInt1086;
    static int anInt1087;
    static int anInt1088;
    private Class107 aClass107_1089 = new Class107();
    static int anInt1090;
    static int anInt1091;
    static int anInt1092;
    static int anInt1093;
    static int anInt1094;
    static int anInt1095;
    static int anInt1096;
    static int anInt1097;
    static ha aHa1098;
    static int anInt1099;
    private final Class356 aClass356_1100;
    static int anInt1101;
    static int anInt1102;
    static int anInt1103;

    final int method575(int i) {
        anInt1101++;
        int i_0_ = i;
        for (Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) aClass107_1089.method1011(-84); class348_sub42_sub8 != null; class348_sub42_sub8 = ((Class348_Sub42_Sub8) aClass107_1089.method1003((byte) 79))) {
            if (!class348_sub42_sub8.method3195(-4)) i_0_++;
        }
        return i_0_;
    }

    static final boolean method576(int i, int i_1_) {
        if (i_1_ <= 21) method589(null, -21);
        anInt1088++;
        return i == 2 || i == 3;
    }

    final int method577(int i) {
        if (i != -4) method577(19);
        anInt1097++;
        return anInt1084;
    }

    final void method578(int i, int i_2_) {
        if (i == 2) {
            anInt1093++;
            if (Class101_Sub1.aClass246_5675 != null) {
                for (Class348_Sub42_Sub8 class348_sub42_sub8 = ((Class348_Sub42_Sub8) aClass107_1089.method1011(-59)); class348_sub42_sub8 != null; class348_sub42_sub8 = ((Class348_Sub42_Sub8) aClass107_1089.method1003((byte) 97))) {
                    if (!class348_sub42_sub8.method3195(-4)) {
                        if ((long) i_2_ < ++class348_sub42_sub8.aLong7057) {
                            Class348_Sub42_Sub8 class348_sub42_sub8_3_ = Class101_Sub1.aClass246_5675.method1888(3, class348_sub42_sub8);
                            aClass356_1100.method3483((byte) 86, (class348_sub42_sub8.aLong4291), class348_sub42_sub8_3_);
                            Class59_Sub2_Sub2.method573(class348_sub42_sub8_3_, class348_sub42_sub8, (byte) 63);
                            class348_sub42_sub8.method2715((byte) 116);
                            class348_sub42_sub8.method3162(true);
                        }
                    } else if (class348_sub42_sub8.method3193(100) == null) {
                        class348_sub42_sub8.method2715((byte) 60);
                        class348_sub42_sub8.method3162(true);
                        anInt1086 += (class348_sub42_sub8.anInt9545);
                    }
                }
            }
        }
    }

    Class60(int i) {
        this(i, i);
    }

    final Object method579(int i) {
        anInt1094++;
        Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) aClass356_1100.method3482(0);
        while (class348_sub42_sub8 != null) {
            Object object = class348_sub42_sub8.method3193(114);
            if (object != null) return object;
            Class348_Sub42_Sub8 class348_sub42_sub8_4_ = class348_sub42_sub8;
            class348_sub42_sub8 = (Class348_Sub42_Sub8) aClass356_1100.method3482(0);
            class348_sub42_sub8_4_.method2715((byte) 92);
            class348_sub42_sub8_4_.method3162(true);
            anInt1086 += class348_sub42_sub8_4_.anInt9545;
        }
        if (i > -67) aHa1098 = null;
        return null;
    }

    final void method580(int i, Object object, long l, int i_5_) {
        try {
            anInt1092++;
            if (i_5_ > anInt1084) throw new IllegalStateException("s>cs");
            method586(l, 0);
            anInt1086 -= i_5_;
            while (anInt1086 < 0) {
                Class348_Sub42_Sub8 class348_sub42_sub8 = ((Class348_Sub42_Sub8) aClass107_1089.method1008(i ^ 0x7c8a));
                method585(class348_sub42_sub8, i ^ ~0x7cfa);
            }
            Class348_Sub42_Sub8_Sub2 class348_sub42_sub8_sub2 = new Class348_Sub42_Sub8_Sub2(object, i_5_);
            aClass356_1100.method3483((byte) 54, l, class348_sub42_sub8_sub2);
            if (i != 31902) anInt1086 = -106;
            aClass107_1089.method1005(true, class348_sub42_sub8_sub2);
            class348_sub42_sub8_sub2.aLong7057 = 0L;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("jr.E(" + i + ',' + (object != null ? "{...}" : "null") + ',' + l + ',' + i_5_ + ')'));
        }
    }

    final int method581(int i) {
        if (i != -18529) method583(-64L, 37);
        anInt1099++;
        return anInt1086;
    }

    final void method582(Object object, long l, byte i) {
        try {
            if (i >= -92) method589(null, -7);
            anInt1095++;
            method580(31902, object, l, 1);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("jr.B(" + (object != null ? "{...}" : "null") + ',' + l + ',' + i + ')'));
        }
    }

    final Object method583(long l, int i) {
        try {
            int i_6_ = -59 % ((i - 2) / 47);
            anInt1085++;
            Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) aClass356_1100.method3480(l, -6008);
            if (class348_sub42_sub8 == null) return null;
            Object object = class348_sub42_sub8.method3193(86);
            if (object == null) {
                class348_sub42_sub8.method2715((byte) 102);
                class348_sub42_sub8.method3162(true);
                anInt1086 += class348_sub42_sub8.anInt9545;
                return null;
            }
            if (class348_sub42_sub8.method3195(-4)) {
                Class348_Sub42_Sub8_Sub2 class348_sub42_sub8_sub2 = new Class348_Sub42_Sub8_Sub2(object, (class348_sub42_sub8.anInt9545));
                aClass356_1100.method3483((byte) 90, (class348_sub42_sub8.aLong4291), class348_sub42_sub8_sub2);
                aClass107_1089.method1005(true, class348_sub42_sub8_sub2);
                class348_sub42_sub8_sub2.aLong7057 = 0L;
                class348_sub42_sub8.method2715((byte) 112);
                class348_sub42_sub8.method3162(true);
            } else {
                aClass107_1089.method1005(true, class348_sub42_sub8);
                class348_sub42_sub8.aLong7057 = 0L;
            }
            return object;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "jr.K(" + l + ',' + i + ')');
        }
    }

    public static void method584(byte i) {
        aHa1098 = null;
        int i_7_ = -19 % ((i - 59) / 55);
    }

    private final void method585(Class348_Sub42_Sub8 class348_sub42_sub8, int i) {
        int i_8_ = 80 / ((i - 6) / 36);
        anInt1102++;
        if (class348_sub42_sub8 != null) {
            class348_sub42_sub8.method2715((byte) 117);
            class348_sub42_sub8.method3162(true);
            anInt1086 += class348_sub42_sub8.anInt9545;
        }
    }

    private final void method586(long l, int i) {
        try {
            if (i != 0) aClass107_1089 = null;
            anInt1090++;
            Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) aClass356_1100.method3480(l, -6008);
            method585(class348_sub42_sub8, -57);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "jr.J(" + l + ',' + i + ')');
        }
    }

    final void method587(int i) {
        anInt1096++;
        for (Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) aClass107_1089.method1011(-71); class348_sub42_sub8 != null; class348_sub42_sub8 = ((Class348_Sub42_Sub8) aClass107_1089.method1003((byte) 50))) {
            if (class348_sub42_sub8.method3195(-4)) {
                class348_sub42_sub8.method2715((byte) 118);
                class348_sub42_sub8.method3162(true);
                anInt1086 += class348_sub42_sub8.anInt9545;
            }
        }
        if (i >= -75) method587(-97);
    }

    final Object method588(int i) {
        anInt1087++;
        Class348_Sub42_Sub8 class348_sub42_sub8 = (Class348_Sub42_Sub8) aClass356_1100.method3484(0);
        if (i != -5052) method577(77);
        while (class348_sub42_sub8 != null) {
            Object object = class348_sub42_sub8.method3193(119);
            if (object == null) {
                Class348_Sub42_Sub8 class348_sub42_sub8_9_ = class348_sub42_sub8;
                class348_sub42_sub8 = (Class348_Sub42_Sub8) aClass356_1100.method3482(0);
                class348_sub42_sub8_9_.method2715((byte) 41);
                class348_sub42_sub8_9_.method3162(true);
                anInt1086 += (class348_sub42_sub8_9_.anInt9545);
            } else return object;
        }
        return null;
    }

    static final boolean method589(Class42 class42, int i) {
        anInt1103++;
        if (class42 == null) return false;
        if (i != -4) return false;
        if (!class42.aBoolean574) return false;
        if (!class42.method373(Class75.anInterface17_1244, i ^ ~0x2d)) return false;
        if (Class158.aClass356_4934.method3480(class42.anInt581, i ^ 0x1774) != null) return false;
        return Class348_Sub42_Sub9_Sub1.aClass356_10442.method3480(class42.anInt596, i + -6004) == null;
    }

    final void method590(int i) {
        anInt1091++;
        aClass107_1089.method1009(i + 2110355138);
        aClass356_1100.method3481(i);
        anInt1086 = anInt1084;
    }

    Class60(int i, int i_10_) {
        anInt1086 = i;
        anInt1084 = i;
        int i_11_;
        for (i_11_ = 1; i > i_11_ + i_11_ && i_10_ > i_11_; i_11_ += i_11_) {
            /* empty */
        }
        aClass356_1100 = new Class356(i_11_);
    }
}
