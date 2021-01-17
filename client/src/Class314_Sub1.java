/* Class314_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class314_Sub1 extends Class314 {
    static Class114 aClass114_6340 = new Class114(74, 28);
    static int anInt6341;
    private Class291 aClass291_6342;
    static int anInt6343;
    private final int anInt6344;
    static int anInt6345;
    private final byte[] aByteArray6346;
    private final Class248 aClass248_6347;
    static int anInt6348;
    static int anInt6349;
    private final int anInt6350;
    private byte[] aByteArray6351;
    private int anInt6352;
    static int anInt6353;
    private final Class112 aClass112_6354;
    private Class348_Sub42_Sub16 aClass348_Sub42_Sub16_6355;
    static int anInt6356;
    static int anInt6357;
    static int anInt6358;
    static int anInt6359;
    private final Class356 aClass356_6360;
    private int anInt6361 = 0;
    static int anInt6362;
    static int anInt6363;
    private final Class137 aClass137_6364;
    private final Class137 aClass137_6365;
    static int anInt6366;
    static int anInt6367;
    private boolean aBoolean6368;
    private final Class262 aClass262_6369;
    static int anInt6370;
    private boolean aBoolean6371;
    private Class262 aClass262_6372;
    private int anInt6373;
    private long aLong6374;
    private boolean aBoolean6375;

    final int method2341(int i) {
        anInt6370++;
        if (aClass291_6342 == null) return 0;
        if (!aBoolean6368) return aClass291_6342.anInt3727;
        if (i != 24940) method2345(-32);
        Class348 class348 = aClass262_6372.method1995(i ^ 0x6168);
        if (class348 == null) return 0;
        return (int) class348.aLong4291;
    }

    final void method2342(int i) {
        anInt6349++;
        if (i != 0) aBoolean6375 = false;
        if (aClass262_6372 != null && method2340((byte) 56) != null) {
            for (Class348 class348 = aClass262_6369.method1995(4); class348 != null; class348 = aClass262_6369.method1990((byte) 112)) {
                int i_0_ = (int) class348.aLong4291;
                if (i_0_ < 0 || (aClass291_6342.anInt3734 <= i_0_) || aClass291_6342.anIntArray3725[i_0_] == 0) class348.method2715((byte) 37);
                else {
                    if (aByteArray6351[i_0_] == 0) method2350(i_0_, (byte) 65, 1);
                    if (aByteArray6351[i_0_] == -1) method2350(i_0_, (byte) 65, 2);
                    if (aByteArray6351[i_0_] == 1) class348.method2715((byte) 29);
                }
            }
        }
    }

    final void method2343(int i) {
        anInt6356++;
        if (aClass262_6372 != null) {
            if (method2340((byte) 56) == null) return;
            if (aBoolean6368) {
                boolean bool = true;
                for (Class348 class348 = aClass262_6372.method1995(4); class348 != null; class348 = aClass262_6372.method1990((byte) 106)) {
                    int i_1_ = (int) class348.aLong4291;
                    if (aByteArray6351[i_1_] == 0) method2350(i_1_, (byte) 65, 1);
                    if (aByteArray6351[i_1_] != 0) class348.method2715((byte) 22);
                    else bool = false;
                }
                while (aClass291_6342.anIntArray3725.length > anInt6373) {
                    if (aClass291_6342.anIntArray3725[anInt6373] == 0) anInt6373++;
                    else {
                        if (aClass112_6354.anInt1734 >= 250) {
                            bool = false;
                            break;
                        }
                        if (aByteArray6351[anInt6373] == 0) method2350(anInt6373, (byte) 65, 1);
                        if (aByteArray6351[anInt6373] == 0) {
                            Class348 class348 = new Class348();
                            class348.aLong4291 = anInt6373;
                            aClass262_6372.method1999(class348, -20180);
                            bool = false;
                        }
                        anInt6373++;
                    }
                }
                if (bool) {
                    anInt6373 = 0;
                    aBoolean6368 = false;
                }
            } else if (aBoolean6371) {
                boolean bool = true;
                for (Class348 class348 = aClass262_6372.method1995(4); class348 != null; class348 = aClass262_6372.method1990((byte) 43)) {
                    int i_2_ = (int) class348.aLong4291;
                    if (aByteArray6351[i_2_] != 1) method2350(i_2_, (byte) 65, 2);
                    if (aByteArray6351[i_2_] != 1) bool = false;
                    else class348.method2715((byte) 60);
                }
                while (aClass291_6342.anIntArray3725.length > anInt6373) {
                    if (aClass291_6342.anIntArray3725[anInt6373] == 0) anInt6373++;
                    else {
                        if (aClass248_6347.method1899(-124)) {
                            bool = false;
                            break;
                        }
                        if (aByteArray6351[anInt6373] != 1) method2350(anInt6373, (byte) 65, 2);
                        if (aByteArray6351[anInt6373] != 1) {
                            Class348 class348 = new Class348();
                            class348.aLong4291 = anInt6373;
                            bool = false;
                            aClass262_6372.method1999(class348, i + -20179);
                        }
                        anInt6373++;
                    }
                }
                if (bool) {
                    anInt6373 = 0;
                    aBoolean6371 = false;
                }
            } else aClass262_6372 = null;
        }
        if (i == -1) {
            if (aBoolean6375 && Class62.method599(-94) >= aLong6374) {
                for (Class348_Sub42_Sub16 class348_sub42_sub16 = (Class348_Sub42_Sub16) aClass356_6360.method3484(0); class348_sub42_sub16 != null; class348_sub42_sub16 = ((Class348_Sub42_Sub16) aClass356_6360.method3482(0))) {
                    if (!class348_sub42_sub16.aBoolean9664) {
                        if (class348_sub42_sub16.aBoolean9667) {
                            if (!class348_sub42_sub16.aBoolean9663) throw new RuntimeException();
                            class348_sub42_sub16.method2715((byte) 116);
                        } else class348_sub42_sub16.aBoolean9667 = true;
                    }
                }
                aLong6374 = Class62.method599(-82) - -1000L;
            }
        }
    }

    public static void method2344(int i) {
        if (i == 0) aClass114_6340 = null;
    }

    final int method2345(int i) {
        anInt6357++;
        if (aClass291_6342 == null) return 0;
        if (i != 0) method2338((byte) -34, 120);
        return aClass291_6342.anInt3727;
    }

    final byte[] method2339(int i, byte i_3_) {
        int i_4_ = -16 / ((i_3_ - -44) / 37);
        anInt6363++;
        Class348_Sub42_Sub16 class348_sub42_sub16 = method2350(i, (byte) 65, 0);
        if (class348_sub42_sub16 == null) return null;
        byte[] is = class348_sub42_sub16.method3259(16);
        class348_sub42_sub16.method2715((byte) 33);
        return is;
    }

    final void method2346(int i) {
        if (i == 27872) {
            anInt6366++;
            if (aClass137_6365 != null) {
                aBoolean6371 = true;
                if (aClass262_6372 == null) aClass262_6372 = new Class262();
            }
        }
    }

    final void method2338(byte i, int i_5_) {
        anInt6345++;
        if (i != -52) aClass291_6342 = null;
        if (aClass137_6365 != null) {
            for (Class348 class348 = aClass262_6369.method1995(i ^ ~0x37); class348 != null; class348 = aClass262_6369.method1990((byte) 124)) {
                if ((long) i_5_ == class348.aLong4291) return;
            }
            Class348 class348 = new Class348();
            class348.aLong4291 = i_5_;
            aClass262_6369.method1999(class348, -20180);
        }
    }

    static final String method2347(byte i) {
        if (i != -119) return null;
        anInt6343++;
        if (Class5_Sub1.aBoolean8335 || Class316.aClass348_Sub42_Sub12_3963 == null) return "";
        if (((Class316.aClass348_Sub42_Sub12_3963.aString9601) == null || Class316.aClass348_Sub42_Sub12_3963.aString9601.length() == 0) && (Class316.aClass348_Sub42_Sub12_3963.aString9595) != null && Class316.aClass348_Sub42_Sub12_3963.aString9595.length() > 0)
            return (Class316.aClass348_Sub42_Sub12_3963.aString9595);
        return (Class316.aClass348_Sub42_Sub12_3963.aString9601);
    }

    static final int method2348(int i) {
        anInt6353++;
        if (i != -8454) method2352(44, -11, 126);
        int i_6_;
        if (Class226.anInt2964 < 96) {
            Class348_Sub40_Sub12.method3076(0, true);
            i_6_ = 1;
        } else {
            int i_7_ = Class284.method2116(-26584);
            if (i_7_ > 100) {
                if (i_7_ <= 500) {
                    i_6_ = 3;
                    Class47.method447((byte) -59);
                } else if (i_7_ <= 1000) {
                    i_6_ = 2;
                    Class161.method1263(true);
                } else {
                    Class348_Sub40_Sub12.method3076(0, true);
                    i_6_ = 1;
                }
            } else {
                i_6_ = 4;
                Class133.method1140(58);
            }
        }
        if (Class316.aClass348_Sub51_3959.aClass239_Sub25_7271.method1829(-32350) != 0) {
            Class316.aClass348_Sub51_3959.method3429((byte) 74, (Class316.aClass348_Sub51_3959.aClass239_Sub25_7251), 0);
            Class367_Sub10.method3553(false, (byte) 120, 0);
        }
        Class14_Sub2.method243(37);
        return i_6_;
    }

    final int method2349(int i) {
        if (i != 1) method2335(11, -116);
        anInt6367++;
        if (method2340((byte) 56) == null) {
            if (aClass348_Sub42_Sub16_6355 == null) return 0;
            return aClass348_Sub42_Sub16_6355.method3257(16);
        }
        return 100;
    }

    final int method2335(int i, int i_8_) {
        anInt6341++;
        Class348_Sub42_Sub16 class348_sub42_sub16 = ((Class348_Sub42_Sub16) aClass356_6360.method3480(i, -6008));
        if (i_8_ != -22197) anInt6352 = 21;
        if (class348_sub42_sub16 != null) return class348_sub42_sub16.method3257(16);
        return 0;
    }

    private final Class348_Sub42_Sub16 method2350(int i, byte i_9_, int i_10_) {
        if (i_9_ != 65) aByteArray6351 = null;
        anInt6362++;
        Class348_Sub42_Sub16 class348_sub42_sub16 = ((Class348_Sub42_Sub16) aClass356_6360.method3480(i, -6008));
        if (class348_sub42_sub16 != null && i_10_ == 0 && !class348_sub42_sub16.aBoolean9663 && class348_sub42_sub16.aBoolean9664) {
            class348_sub42_sub16.method2715((byte) 66);
            class348_sub42_sub16 = null;
        }
        if (class348_sub42_sub16 == null) {
            if (i_10_ == 0) {
                if (aClass137_6365 == null || aByteArray6351[i] == -1) {
                    if (aClass248_6347.method1900(-9)) return null;
                    class348_sub42_sub16 = aClass248_6347.method1906((byte) -125, (byte) 2, true, i, anInt6350);
                } else class348_sub42_sub16 = aClass112_6354.method1055(aClass137_6365, i, (byte) -110);
            } else if (i_10_ == 1) {
                if (aClass137_6365 == null) throw new RuntimeException();
                class348_sub42_sub16 = aClass112_6354.method1054(aClass137_6365, i, (byte) -112);
            } else {
                if (i_10_ != 2) throw new RuntimeException();
                if (aClass137_6365 == null) throw new RuntimeException();
                if (aByteArray6351[i] != -1) throw new RuntimeException();
                if (aClass248_6347.method1899(-120)) return null;
                class348_sub42_sub16 = aClass248_6347.method1906((byte) 97, (byte) 2, false, i, anInt6350);
            }
            aClass356_6360.method3483((byte) 73, i, class348_sub42_sub16);
        }
        if (class348_sub42_sub16.aBoolean9664) return null;
        byte[] is = class348_sub42_sub16.method3259(16);
        if (!(class348_sub42_sub16 instanceof Class348_Sub42_Sub16_Sub2)) {
            try {
                if (is == null || is.length <= 2) throw new RuntimeException();
                Class287.aCRC32_3691.reset();
                Class287.aCRC32_3691.update(is, 0, -2 + is.length);
                int i_11_ = (int) Class287.aCRC32_3691.getValue();
                if (aClass291_6342.anIntArray3729[i] != i_11_) throw new RuntimeException();
                if (aClass291_6342.aByteArrayArray3730 != null && (aClass291_6342.aByteArrayArray3730[i] != null)) {
                    byte[] is_12_ = aClass291_6342.aByteArrayArray3730[i];
                    byte[] is_13_ = Class348_Sub1_Sub2.method2730(i_9_ ^ 0x1196, 0, is, is.length + -2);
                    for (int i_14_ = 0; i_14_ < 64; i_14_++) {
                        if (is_12_[i_14_] != is_13_[i_14_]) throw new RuntimeException();
                    }
                }
                aClass248_6347.anInt3213 = 0;
                aClass248_6347.anInt3214 = 0;
            } catch (RuntimeException runtimeexception) {
                aClass248_6347.method1904(-1);
                class348_sub42_sub16.method2715((byte) 44);
                if (class348_sub42_sub16.aBoolean9663 && !aClass248_6347.method1900(i_9_ ^ 0x1f)) {
                    Class348_Sub42_Sub16_Sub1 class348_sub42_sub16_sub1 = aClass248_6347.method1906((byte) 111, (byte) 2, true, i, anInt6350);
                    aClass356_6360.method3483((byte) 84, i, class348_sub42_sub16_sub1);
                }
                return null;
            }
            is[is.length - 2] = (byte) (aClass291_6342.anIntArray3722[i] >>> 8);
            is[is.length - 1] = (byte) aClass291_6342.anIntArray3722[i];
            if (aClass137_6365 != null) {
                aClass112_6354.method1049(is, aClass137_6365, (byte) 10, i);
                if (aByteArray6351[i] != 1) {
                    anInt6361++;
                    aByteArray6351[i] = (byte) 1;
                }
            }
            if (!class348_sub42_sub16.aBoolean9663) class348_sub42_sub16.method2715((byte) 110);
            return class348_sub42_sub16;
        }
        try {
            if (is == null || is.length <= 2) throw new RuntimeException();
            Class287.aCRC32_3691.reset();
            Class287.aCRC32_3691.update(is, 0, is.length + -2);
            int i_15_ = (int) Class287.aCRC32_3691.getValue();
            if (i_15_ != aClass291_6342.anIntArray3729[i]) throw new RuntimeException();
            if (aClass291_6342.aByteArrayArray3730 != null && (aClass291_6342.aByteArrayArray3730[i] != null)) {
                byte[] is_16_ = aClass291_6342.aByteArrayArray3730[i];
                byte[] is_17_ = Class348_Sub1_Sub2.method2730(i_9_ + 4502, 0, is, is.length - 2);
                for (int i_18_ = 0; i_18_ < 64; i_18_++) {
                    if (is_17_[i_18_] != is_16_[i_18_]) throw new RuntimeException();
                }
            }
            int i_19_ = ((0xff00 & is[-2 + is.length] << 8) + (0xff & is[is.length + -1]));
            if ((aClass291_6342.anIntArray3722[i] & 0xffff) != i_19_) throw new RuntimeException();
            if (aByteArray6351[i] != 1) {
                anInt6361++;
                aByteArray6351[i] = (byte) 1;
            }
            if (!class348_sub42_sub16.aBoolean9663) class348_sub42_sub16.method2715((byte) 115);
            return class348_sub42_sub16;
        } catch (Exception exception) {
            aByteArray6351[i] = (byte) -1;
            class348_sub42_sub16.method2715((byte) 121);
            if (class348_sub42_sub16.aBoolean9663 && !aClass248_6347.method1900(-30)) {
                Class348_Sub42_Sub16_Sub1 class348_sub42_sub16_sub1 = aClass248_6347.method1906((byte) 99, (byte) 2, true, i, anInt6350);
                aClass356_6360.method3483((byte) 66, i, class348_sub42_sub16_sub1);
            }
            return null;
        }
    }

    final int method2351(int i) {
        if (i != 0) return -19;
        anInt6359++;
        return anInt6361;
    }

    final Class291 method2340(byte i) {
        anInt6348++;
        if (aClass291_6342 != null) return aClass291_6342;
        if (i != 56) return null;
        if (aClass348_Sub42_Sub16_6355 == null) {
            if (aClass248_6347.method1900(-14)) return null;
            aClass348_Sub42_Sub16_6355 = aClass248_6347.method1906((byte) -114, (byte) 0, true, anInt6350, 255);
        }
        if (aClass348_Sub42_Sub16_6355.aBoolean9664) return null;
        byte[] is = aClass348_Sub42_Sub16_6355.method3259(16);
        do {
            if (aClass348_Sub42_Sub16_6355 instanceof Class348_Sub42_Sub16_Sub2) {
                try {
                    if (is == null) throw new RuntimeException();
                    aClass291_6342 = new Class291(is, anInt6344, aByteArray6346);
                    if (anInt6352 != aClass291_6342.anInt3732) throw new RuntimeException();
                    break;
                } catch (RuntimeException runtimeexception) {
                    aClass291_6342 = null;
                    if (aClass248_6347.method1900(i + 66)) aClass348_Sub42_Sub16_6355 = null;
                    else aClass348_Sub42_Sub16_6355 = aClass248_6347.method1906((byte) -95, (byte) 0, true, anInt6350, 255);
                    return null;
                }
            }
            try {
                if (is == null) throw new RuntimeException();
                aClass291_6342 = new Class291(is, anInt6344, aByteArray6346);
            } catch (RuntimeException runtimeexception) {
                aClass248_6347.method1904(i + -57);
                aClass291_6342 = null;
                if (aClass248_6347.method1900(i ^ ~0x16)) aClass348_Sub42_Sub16_6355 = null;
                else aClass348_Sub42_Sub16_6355 = aClass248_6347.method1906((byte) 47, (byte) 0, true, anInt6350, 255);
                return null;
            }
            if (aClass137_6364 != null) aClass112_6354.method1049(is, aClass137_6364, (byte) 10, anInt6350);
        } while (false);
        aClass348_Sub42_Sub16_6355 = null;
        if (aClass137_6365 != null) {
            anInt6361 = 0;
            aByteArray6351 = new byte[aClass291_6342.anInt3734];
        }
        return aClass291_6342;
    }

    static final boolean method2352(int i, int i_20_, int i_21_) {
        anInt6358++;
        int i_22_ = -38 / ((60 - i) / 40);
        return (0x10 & i_21_) != 0;
    }

    Class314_Sub1(int i, Class137 class137, Class137 class137_23_, Class248 class248, Class112 class112, int i_24_, byte[] is, int i_25_, boolean bool) {
        aClass356_6360 = new Class356(16);
        anInt6373 = 0;
        aClass262_6369 = new Class262();
        aLong6374 = 0L;
        do {
            try {
                anInt6350 = i;
                aClass137_6365 = class137;
                if (aClass137_6365 != null) {
                    aBoolean6368 = true;
                    aClass262_6372 = new Class262();
                } else aBoolean6368 = false;
                anInt6344 = i_24_;
                aByteArray6346 = is;
                anInt6352 = i_25_;
                aClass137_6364 = class137_23_;
                aBoolean6375 = bool;
                aClass248_6347 = class248;
                aClass112_6354 = class112;
                if (aClass137_6364 == null) break;
                aClass348_Sub42_Sub16_6355 = aClass112_6354.method1055(aClass137_6364, anInt6350, (byte) -112);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("bja.<init>(" + i + ',' + (class137 != null ? "{...}" : "null") + ',' + (class137_23_ != null ? "{...}" : "null") + ',' + (class248 != null ? "{...}" : "null") + ',' + (class112 != null ? "{...}" : "null") + ',' + i_24_ + ',' + (is != null ? "{...}" : "null") + ',' + i_25_ + ',' + bool + ')'));
            }
            break;
        } while (false);
    }
}
