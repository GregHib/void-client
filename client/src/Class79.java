/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class79 {
    byte aByte1325;
    static int anInt1326;
    int anInt1327;
    private short[] aShortArray1328;
    int anInt1329;
    private byte aByte1330;
    boolean aBoolean1331;
    static int anInt1332;
    int anInt1333 = -1;
    static int anInt1334;
    int anInt1335;
    int anInt1336;
    int anInt1337;
    int anInt1338;
    short aShort1339;
    int anInt1340;
    static int anInt1341;
    int[] anIntArray1342;
    int anInt1343;
    int anInt1344;
    boolean aBoolean1345;
    private int anInt1346;
    byte aByte1347;
    Class278 aClass278_1348;
    String[] aStringArray1349;
    short aShort1350 = 0;
    static int anInt1351;
    private short[] aShortArray1352;
    byte aByte1353;
    private int anInt1354;
    byte aByte1355;
    int anInt1356;
    static int anInt1357;
    private int anInt1358;
    static int anInt1359 = 0;
    private byte aByte1360;
    int anInt1361;
    boolean aBoolean1362;
    int anInt1363;
    int anInt1364;
    static Sprite aSprite_1365;
    int anInt1366;
    static client aClient1367;
    private int anInt1368;
    boolean aBoolean1369;
    boolean aBoolean1370;
    int anInt1371;
    String aString1372;
    int anInt1373;
    private byte[] aByteArray1374;
    int anInt1375;
    private byte aByte1376;
    int[] anIntArray1377;
    static int anInt1378;
    static int anInt1379;
    private int[] anIntArray1380;
    boolean aBoolean1381;
    int anInt1382;
    int anInt1383;
    byte aByte1384;
    int anInt1385;
    private Class356 aClass356_1386;
    static int anInt1387;
    private int[][] anIntArrayArray1388;
    static int anInt1389;
    int anInt1390;
    private short[] aShortArray1391;
    int anInt1392;
    private short[] aShortArray1393;
    static int anInt1394;
    int anInt1395;
    boolean aBoolean1396;
    boolean aBoolean1397;
    private int anInt1398;
    int anInt1399;
    static int anInt1400;
    int anInt1401;
    private int[] anIntArray1402;
    static int anInt1403;
    static int anInt1404;
    private byte aByte1405;
    private int anInt1406;

    final boolean method793(int i) {
        anInt1403++;
        if (this.anIntArray1377 == null) {
            return this.anInt1343 != -1 || this.anInt1364 != -1 || this.anInt1327 != -1;
        }
        for (int i_0_ = i; this.anIntArray1377.length > i_0_; i_0_++) {
            if (this.anIntArray1377[i_0_] != -1) {
                Class79 class79_1_ = (this.aClass278_1348.method2079(this.anIntArray1377[i_0_], -1));
                if (class79_1_.anInt1343 != -1 || class79_1_.anInt1364 != -1 || class79_1_.anInt1327 != -1) return true;
            }
        }
        return false;
    }

    final Class79 method794(Interface17 interface17, int i) {
        anInt1394++;
        int i_2_ = i;
        if (anInt1368 == -1) {
            if (anInt1354 != -1) i_2_ = interface17.method61(anInt1354, (byte) -16);
        } else i_2_ = interface17.method62(anInt1368, -65536);
        if (i_2_ < 0 || (-1 + this.anIntArray1377.length <= i_2_) || this.anIntArray1377[i_2_] == -1) {
            int i_3_ = (this.anIntArray1377[this.anIntArray1377.length - 1]);
            if (i_3_ == -1) return null;
            return this.aClass278_1348.method2079(i_3_, i);
        }
        return this.aClass278_1348.method2079(this.anIntArray1377[i_2_], -1);
    }

    private final void method795(Class348_Sub49 class348_sub49, int i, int i_4_) {
        if (i_4_ != 127) this.aBoolean1381 = true;
        if (i == 1) {
            int i_5_ = class348_sub49.readUnsignedByte(255);
            anIntArray1402 = new int[i_5_];
            for (int i_6_ = 0; i_5_ > i_6_; i_6_++) {
                anIntArray1402[i_6_] = class348_sub49.readUnsignedShort(842397944);
                if (anIntArray1402[i_6_] == 65535) anIntArray1402[i_6_] = -1;
            }
        } else if (i != 2) {
            if (i != 12) {
                if (i < 30 || i >= 35) {
                    if (i == 40) {
                        int i_25_ = class348_sub49.readUnsignedByte(255);
                        aShortArray1328 = new short[i_25_];
                        aShortArray1352 = new short[i_25_];
                        for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
                            aShortArray1328[i_26_] = (short) class348_sub49.readUnsignedShort(842397944);
                            aShortArray1352[i_26_] = (short) class348_sub49.readUnsignedShort(842397944);
                        }
                    } else if (i == 41) {
                        int i_23_ = class348_sub49.readUnsignedByte(255);
                        aShortArray1393 = new short[i_23_];
                        aShortArray1391 = new short[i_23_];
                        for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
                            aShortArray1393[i_24_] = (short) class348_sub49.readUnsignedShort(842397944);
                            aShortArray1391[i_24_] = (short) class348_sub49.readUnsignedShort(842397944);
                        }
                    } else if (i == 42) {
                        int i_7_ = class348_sub49.readUnsignedByte(i_4_ ^ 0x80);
                        aByteArray1374 = new byte[i_7_];
                        for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
                            aByteArray1374[i_8_] = class348_sub49.readByte(-88);
                    } else if (i == 60) {
                        int i_9_ = class348_sub49.readUnsignedByte(255);
                        anIntArray1380 = new int[i_9_];
                        for (int i_10_ = 0; i_9_ > i_10_; i_10_++)
                            anIntArray1380[i_10_] = class348_sub49.readUnsignedShort(842397944);
                    } else if (i != 93) {
                        if (i != 95) {
                            if (i != 97) {
                                if (i != 98) {
                                    if (i == 99) this.aBoolean1345 = true;
                                    else if (i != 100) {
                                        if (i == 101) anInt1406 = 5 * (class348_sub49.readByte(i_4_ ^ ~0x27));
                                        else if (i == 102) this.anInt1375 = (class348_sub49.readUnsignedShort(i_4_ + 842397817));
                                        else if (i == 103) this.anInt1329 = (class348_sub49.readUnsignedShort(842397944));
                                        else if ((i == 106) || i == 118) {
                                            anInt1368 = (class348_sub49.readUnsignedShort(842397944));
                                            if (anInt1368 == 65535) anInt1368 = -1;
                                            anInt1354 = (class348_sub49.readUnsignedShort(842397944));
                                            if (anInt1354 == 65535) anInt1354 = -1;
                                            int i_11_ = -1;
                                            if (i == 118) {
                                                i_11_ = (class348_sub49.readUnsignedShort(842397944));
                                                if (i_11_ == 65535) i_11_ = -1;
                                            }
                                            int i_12_ = class348_sub49.readUnsignedByte(255);
                                            this.anIntArray1377 = new int[2 + i_12_];
                                            for (int i_13_ = 0; i_13_ <= i_12_; i_13_++) {
                                                this.anIntArray1377[i_13_] = (class348_sub49.readUnsignedShort(842397944));
                                                if ((this.anIntArray1377[i_13_]) == 65535) this.anIntArray1377[i_13_] = -1;
                                            }
                                            this.anIntArray1377[1 + i_12_] = i_11_;
                                        } else if (i == 107) this.aBoolean1396 = false;
                                        else if (i != 109) {
                                            if (i == 111) this.aBoolean1369 = false;
                                            else if (i == 113) {
                                                this.aShort1339 = (short) (class348_sub49.readUnsignedShort(842397944));
                                                this.aShort1350 = (short) (class348_sub49.readUnsignedShort(842397944));
                                            } else if (i == 114) {
                                                this.aByte1353 = (class348_sub49.readByte(-110));
                                                this.aByte1347 = (class348_sub49.readByte(-85));
                                            } else if (i != 119) {
                                                if (i == 121) {
                                                    anIntArrayArray1388 = (new int
                                                            [anIntArray1402.length]
                                                            []);
                                                    int i_14_ = (class348_sub49.readUnsignedByte(255));
                                                    for (int i_15_ = 0; (i_14_ > i_15_); i_15_++) {
                                                        int i_16_ = (class348_sub49.readUnsignedByte(255));
                                                        int[] is = (anIntArrayArray1388[i_16_] = new int[3]);
                                                        is[0] = (class348_sub49.readByte(Class348_Sub21.method2955(i_4_, -50)));
                                                        is[1] = (class348_sub49.readByte(-113));
                                                        is[2] = (class348_sub49.readByte(-84));
                                                    }
                                                } else if (i == 122) this.anInt1373 = (class348_sub49.readUnsignedShort(842397944));
                                                else if (i != 123) {
                                                    if (i == 125) this.aByte1355 = (class348_sub49.readByte(-95));
                                                    else if (i == 127) this.anInt1366 = (class348_sub49.readUnsignedShort(i_4_ + 842397817));
                                                    else if (i != 128) {
                                                        if (i == 134) {
                                                            this.anInt1343 = class348_sub49.readUnsignedShort(842397944);
                                                            if (this.anInt1343 == 65535) this.anInt1343 = -1;
                                                            this.anInt1395 = class348_sub49.readUnsignedShort(842397944);
                                                            if (this.anInt1395 == 65535) this.anInt1395 = -1;
                                                            this.anInt1364 = class348_sub49.readUnsignedShort(842397944);
                                                            if (this.anInt1364 == 65535) this.anInt1364 = -1;
                                                            this.anInt1327 = class348_sub49.readUnsignedShort(i_4_ ^ 0x3235f887);
                                                            if (this.anInt1327 == 65535) this.anInt1327 = -1;
                                                            this.anInt1392 = class348_sub49.readUnsignedByte(255);
                                                        } else if (i == 135) {
                                                            this.anInt1335 = class348_sub49.readUnsignedByte(255);
                                                            this.anInt1371 = class348_sub49.readUnsignedShort(842397944);
                                                        } else if (i == 136) {
                                                            this.anInt1385 = class348_sub49.readUnsignedByte(255);
                                                            this.anInt1338 = class348_sub49.readUnsignedShort(842397944);
                                                        } else if (i != 137) {
                                                            if (i != 138) {
                                                                if (i != 139) {
                                                                    if (i != 140) {
                                                                        if (i == 141) this.aBoolean1362 = true;
                                                                        else if (i == 142) this.anInt1383 = class348_sub49.readUnsignedShort(842397944);
                                                                        else if (i != 143) {
                                                                            if (i >= 150 && i < 155) {
                                                                                this.aStringArray1349[-150 + i] = class348_sub49.readString((byte) -73);
                                                                                if (!this.aClass278_1348.aBoolean3583) this.aStringArray1349[i + -150] = null;
                                                                            } else if (i == 155) {
                                                                                aByte1376 = class348_sub49.readByte(i_4_ ^ ~0x16);
                                                                                aByte1360 = class348_sub49.readByte(-113);
                                                                                aByte1330 = class348_sub49.readByte(-112);
                                                                                aByte1405 = class348_sub49.readByte(-87);
                                                                            } else if (i == 158) this.aByte1384 = (byte) 1;
                                                                            else if (i != 159) {
                                                                                if (i == 160) {
                                                                                    int i_21_ = class348_sub49.readUnsignedByte(255);
                                                                                    this.anIntArray1342 = new int[i_21_];
                                                                                    for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
                                                                                        this.anIntArray1342[i_22_] = class348_sub49.readUnsignedShort(i_4_ + 842397817);
                                                                                } else if (i == 162) this.aBoolean1370 = true;
                                                                                else if (i != 163) {
                                                                                    if (i == 164) {
                                                                                        this.anInt1340 = class348_sub49.readUnsignedShort(842397944);
                                                                                        this.anInt1363 = class348_sub49.readUnsignedShort(842397944);
                                                                                    } else if (i != 165) {
                                                                                        if (i == 249) {
                                                                                            int i_17_ = class348_sub49.readUnsignedByte(255);
                                                                                            if (aClass356_1386 == null) {
                                                                                                int i_18_ = Class33.method340(i_17_, (byte) 108);
                                                                                                aClass356_1386 = new Class356(i_18_);
                                                                                            }
                                                                                            for (int i_19_ = 0; i_17_ > i_19_; i_19_++) {
                                                                                                boolean bool = class348_sub49.readUnsignedByte(255) == 1;
                                                                                                int i_20_ = class348_sub49.readMedium(-1);
                                                                                                Class348 class348;
                                                                                                if (!bool) class348 = new Class348_Sub35(class348_sub49.readInt((byte) -126));
                                                                                                else class348 = new Class348_Sub50(class348_sub49.readString((byte) -120));
                                                                                                aClass356_1386.method3483((byte) 61, i_20_, class348);
                                                                                            }
                                                                                        }
                                                                                    } else this.anInt1337 = class348_sub49.readUnsignedByte(255);
                                                                                } else this.anInt1333 = class348_sub49.readUnsignedByte(i_4_ + 128);
                                                                            } else this.aByte1384 = (byte) 0;
                                                                        } else this.aBoolean1381 = true;
                                                                    } else this.anInt1356 = class348_sub49.readUnsignedByte(i_4_ + 128);
                                                                } else this.anInt1382 = class348_sub49.readUnsignedShort(i_4_ + 842397817);
                                                            } else this.anInt1336 = class348_sub49.readUnsignedShort(842397944);
                                                        } else this.anInt1401 = class348_sub49.readUnsignedShort(842397944);
                                                    } else class348_sub49.readUnsignedByte(255);
                                                } else this.anInt1390 = (class348_sub49.readUnsignedShort(i_4_ ^ 0x3235f887));
                                            } else this.aByte1325 = (class348_sub49.readByte(i_4_ + -245));
                                        } else this.aBoolean1331 = false;
                                    } else anInt1398 = class348_sub49.readByte(-123);
                                } else anInt1358 = (class348_sub49.readUnsignedShort(i_4_ + 842397817));
                            } else anInt1346 = class348_sub49.readUnsignedShort(842397944);
                        } else this.anInt1361 = class348_sub49.readUnsignedShort(842397944);
                    } else this.aBoolean1397 = false;
                } else this.aStringArray1349[-30 + i] = class348_sub49.readString((byte) 124);
            } else this.anInt1399 = class348_sub49.readUnsignedByte(i_4_ + 128);
        } else this.aString1372 = class348_sub49.readString((byte) 122);
        anInt1357++;
    }

    final boolean method796(Interface17 interface17, int i) {
        anInt1351++;
        if (this.anIntArray1377 == null) return true;
        int i_27_ = -1;
        if (anInt1368 != -1) i_27_ = interface17.method62(anInt1368, -65536);
        else if (anInt1354 != -1) i_27_ = interface17.method61(anInt1354, (byte) -16);
        if (i_27_ < 0 || (this.anIntArray1377.length - 1 <= i_27_) || this.anIntArray1377[i_27_] == -1) {
            int i_28_ = (this.anIntArray1377[this.anIntArray1377.length - 1]);
            return i_28_ != -1;
        }
        return i == 18627;
    }

    static final void method797(int i, int i_29_, byte i_30_) {
        anInt1379++;
        if (Class348_Sub40_Sub6.anInt9139 != i_29_) {
            Class318_Sub6.anIntArray6432 = new int[i_29_];
            for (int i_31_ = 0; i_31_ < i_29_; i_31_++)
                Class318_Sub6.anIntArray6432[i_31_] = (i_31_ << 12) / i_29_;
            Class239_Sub22.anInt6076 = i_29_ + -1;
            Class348_Sub40_Sub6.anInt9139 = i_29_;
            Class248.anInt3201 = 32 * i_29_;
        }
        if (i_30_ <= 108) aClient1367 = null;
        if (Class286_Sub2.anInt6212 != i) {
            if (Class348_Sub40_Sub6.anInt9139 != i) {
                Class239_Sub18.anIntArray6035 = new int[i];
                for (int i_32_ = 0; i_32_ < i; i_32_++)
                    Class239_Sub18.anIntArray6035[i_32_] = (i_32_ << 12) / i;
            } else Class239_Sub18.anIntArray6035 = Class318_Sub6.anIntArray6432;
            Class286_Sub2.anInt6212 = i;
            Class299_Sub2.anInt6325 = -1 + i;
        }
    }

    final void method798(int i, Class348_Sub49 class348_sub49) {
        for (; ; ) {
            int i_33_ = class348_sub49.readUnsignedByte(255);
            if (i_33_ == 0) break;
            method795(class348_sub49, i_33_, 127);
        }
        anInt1400++;
        if (i <= 35) method798(-16, null);
    }

    final void method799(int i) {
        if (anIntArray1402 == null) anIntArray1402 = new int[0];
        if (i >= -75) aByte1376 = (byte) 102;
        anInt1334++;
        if (this.aByte1384 == -1) {
            if (Class10.aClass230_186 == this.aClass278_1348.aClass230_3578) this.aByte1384 = (byte) 1;
            else this.aByte1384 = (byte) 0;
        }
    }

    final Class64 method800(int i, Class182[] class182s, Class87 class87, boolean bool, Class17 class17, int i_34_, Class261 class261, int i_35_, Class17 class17_36_, Interface17 interface17, ha var_ha, int i_37_, int[] is, int i_38_, int i_39_, int i_40_, int i_41_) {
        try {
            anInt1341++;
            if (this.anIntArray1377 != null) {
                Class79 class79_42_ = method794(interface17, -1);
                if (class79_42_ == null) return null;
                return class79_42_.method800(i, class182s, class87, false, class17, i_34_, class261, i_35_, class17_36_, interface17, var_ha, i_37_, is, i_38_, i_39_, i_40_, i_41_);
            }
            int i_43_ = i_40_;
            if (anInt1358 != 128) i_43_ |= 0x2;
            if (anInt1346 != 128) i_43_ |= 0x5;
            boolean bool_44_ = class17_36_ != null || class17 != null;
            boolean bool_45_ = false;
            boolean bool_46_ = false;
            boolean bool_47_ = false;
            boolean bool_48_ = bool;
            int i_49_ = class182s == null ? 0 : class182s.length;
            for (int i_50_ = 0; i_50_ < i_49_; i_50_++) {
                Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010[i_50_] = null;
                if (class182s[i_50_] != null) {
                    Class17 class17_51_ = class87.method835((class182s[i_50_].anInt2454), 7);
                    if (class17_51_.anIntArray237 != null) {
                        bool_44_ = true;
                        Class163.aClass17Array2169[i_50_] = class17_51_;
                        int i_52_ = class182s[i_50_].anInt2451;
                        int i_53_ = class182s[i_50_].anInt2455;
                        int i_54_ = class17_51_.anIntArray237[i_52_];
                        Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010[i_50_] = class87.method839(i_54_ >>> 16, 3);
                        i_54_ &= 0xffff;
                        Class90.anIntArray1518[i_50_] = i_54_;
                        if ((Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010[i_50_]) != null) {
                            bool_46_ |= Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010[i_50_].method3272(i_54_, 0);
                            bool_45_ |= Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010[i_50_].method3271(i_54_, 14);
                            bool_48_ |= Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010[i_50_].method3267((byte) -92, i_54_);
                            bool_47_ |= class17_51_.aBoolean242;
                        }
                        if ((class17_51_.aBoolean241 || Class28.aBoolean5002) && i_53_ != -1 && i_53_ < (class17_51_.anIntArray237).length) {
                            Class348_Sub23_Sub4.anIntArray9050[i_50_] = class17_51_.anIntArray267[i_52_];
                            Class67.anIntArray4648[i_50_] = class182s[i_50_].anInt2456;
                            int i_55_ = class17_51_.anIntArray237[i_53_];
                            Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672[i_50_] = class87.method839(i_55_ >>> 16, 3);
                            i_55_ &= 0xffff;
                            Class183.anIntArray2466[i_50_] = i_55_;
                            if ((Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672[i_50_]) != null) {
                                bool_46_ |= Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672[i_50_].method3272(i_55_, 0);
                                bool_45_ |= Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672[i_50_].method3271(i_55_, 14);
                                bool_48_ |= Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672[i_50_].method3267((byte) -99, i_55_);
                            }
                        } else {
                            Class348_Sub23_Sub4.anIntArray9050[i_50_] = 0;
                            Class67.anIntArray4648[i_50_] = 0;
                            Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672[i_50_] = null;
                            Class183.anIntArray2466[i_50_] = -1;
                        }
                    }
                }
            }
            int i_56_ = -1;
            int i_57_ = -1;
            int i_58_ = 0;
            Class348_Sub42_Sub17 class348_sub42_sub17 = null;
            Class348_Sub42_Sub17 class348_sub42_sub17_59_ = null;
            int i_60_ = -1;
            int i_61_ = -1;
            int i_62_ = 0;
            Class348_Sub42_Sub17 class348_sub42_sub17_63_ = null;
            Class348_Sub42_Sub17 class348_sub42_sub17_64_ = null;
            if (bool_44_) {
                i_43_ |= 0x20;
                if (class17_36_ != null) {
                    i_56_ = class17_36_.anIntArray237[i_35_];
                    int i_65_ = i_56_ >>> 16;
                    i_56_ &= 0xffff;
                    class348_sub42_sub17 = class87.method839(i_65_, 3);
                    if (class348_sub42_sub17 != null) {
                        bool_46_ |= class348_sub42_sub17.method3272(i_56_, 0);
                        bool_45_ |= class348_sub42_sub17.method3271(i_56_, 14);
                        bool_48_ |= class348_sub42_sub17.method3267((byte) -125, i_56_);
                        bool_47_ |= class17_36_.aBoolean242;
                    }
                    if ((class17_36_.aBoolean241 || Class28.aBoolean5002) && i_38_ != -1 && (class17_36_.anIntArray237.length > i_38_)) {
                        i_57_ = class17_36_.anIntArray237[i_38_];
                        i_58_ = class17_36_.anIntArray267[i_35_];
                        int i_66_ = i_57_ >>> 16;
                        if (i_65_ == i_66_) class348_sub42_sub17_59_ = class348_sub42_sub17;
                        else class348_sub42_sub17_59_ = class87.method839(i_66_, 3);
                        i_57_ &= 0xffff;
                        if (class348_sub42_sub17_59_ != null) {
                            bool_46_ |= class348_sub42_sub17_59_.method3272(i_57_, 0);
                            bool_45_ |= class348_sub42_sub17_59_.method3271(i_57_, 14);
                            bool_48_ |= class348_sub42_sub17_59_.method3267((byte) -122, i_57_);
                        }
                    }
                }
                if (class17 != null) {
                    i_60_ = class17.anIntArray237[i_39_];
                    int i_67_ = i_60_ >>> 16;
                    class348_sub42_sub17_63_ = class87.method839(i_67_, 3);
                    i_60_ &= 0xffff;
                    if (class348_sub42_sub17_63_ != null) {
                        bool_46_ |= class348_sub42_sub17_63_.method3272(i_60_, 0);
                        bool_45_ |= class348_sub42_sub17_63_.method3271(i_60_, 14);
                        bool_48_ |= class348_sub42_sub17_63_.method3267((byte) -102, i_60_);
                        bool_47_ |= class17.aBoolean242;
                    }
                    if ((class17.aBoolean241 || Class28.aBoolean5002) && i_37_ != -1 && class17.anIntArray237.length > i_37_) {
                        i_62_ = class17.anIntArray267[i_39_];
                        i_61_ = class17.anIntArray237[i_37_];
                        int i_68_ = i_61_ >>> 16;
                        if (i_68_ == i_67_) class348_sub42_sub17_64_ = class348_sub42_sub17_63_;
                        else class348_sub42_sub17_64_ = class87.method839(i_68_, 3);
                        i_61_ &= 0xffff;
                        if (class348_sub42_sub17_64_ != null) {
                            bool_46_ |= class348_sub42_sub17_64_.method3272(i_61_, 0);
                            bool_45_ |= class348_sub42_sub17_64_.method3271(i_61_, 14);
                            bool_48_ |= class348_sub42_sub17_64_.method3267((byte) -104, i_61_);
                        }
                    }
                }
                if (bool_46_) i_43_ |= 0x80;
                if (bool_45_) i_43_ |= 0x100;
                if (bool_47_) i_43_ |= 0x200;
                if (bool_48_) i_43_ |= 0x400;
            }
            long l = var_ha.anInt4567 << 16 | this.anInt1344;
            Class64 class64;
            synchronized (this.aClass278_1348.aClass60_3590) {
                class64 = (Class64) this.aClass278_1348.aClass60_3590.method583(l, 80);
            }
            Class225 class225 = null;
            if (this.anInt1366 != -1) class225 = class261.method1983(this.anInt1366, 32);
            if (class64 == null || i_43_ != (i_43_ & class64.ua())) {
                if (class64 != null) i_43_ |= class64.ua();
                int i_69_ = i_43_;
                boolean bool_70_ = false;
                synchronized (this.aClass278_1348.aIndex_3576) {
                    for (int i_71_ = 0; (anIntArray1402.length > i_71_); i_71_++) {
                        if (anIntArray1402[i_71_] != -1 && !(this.aClass278_1348.aIndex_3576.method420(-10499, anIntArray1402[i_71_], 0))) bool_70_ = true;
                    }
                }
                if (bool_70_) return null;
                Class124[] class124s = new Class124[anIntArray1402.length];
                for (int i_72_ = 0; i_72_ < anIntArray1402.length; i_72_++) {
                    if (anIntArray1402[i_72_] != -1) {
                        synchronized (this.aClass278_1348.aIndex_3576) {
                            class124s[i_72_] = Class300.method2277(0, (this.aClass278_1348.aIndex_3576), anIntArray1402[i_72_], -1);
                        }
                        if (class124s[i_72_] != null) {
                            if (class124s[i_72_].anInt1830 < 13) class124s[i_72_].method1092(2, 115);
                            if (anIntArrayArray1388 != null && anIntArrayArray1388[i_72_] != null) class124s[i_72_].method1099((byte) 44, anIntArrayArray1388[i_72_][2], anIntArrayArray1388[i_72_][0], anIntArrayArray1388[i_72_][1]);
                        }
                    }
                }
                if (class225 != null && class225.anIntArrayArray2939 != null) {
                    for (int i_73_ = 0; (i_73_ < class225.anIntArrayArray2939.length); i_73_++) {
                        if (class124s.length > i_73_ && class124s[i_73_] != null) {
                            int i_74_ = 0;
                            int i_75_ = 0;
                            int i_76_ = 0;
                            int i_77_ = 0;
                            int i_78_ = 0;
                            int i_79_ = 0;
                            if ((class225.anIntArrayArray2939[i_73_]) != null) {
                                i_78_ = ((class225.anIntArrayArray2939[i_73_][4]) << 3);
                                i_79_ = ((class225.anIntArrayArray2939[i_73_][5]) << 3);
                                i_75_ = (class225.anIntArrayArray2939[i_73_][1]);
                                i_76_ = (class225.anIntArrayArray2939[i_73_][2]);
                                i_77_ = ((class225.anIntArrayArray2939[i_73_][3]) << 3);
                                i_74_ = (class225.anIntArrayArray2939[i_73_][0]);
                            }
                            if (i_77_ != 0 || i_78_ != 0 || i_79_ != 0) class124s[i_73_].method1107(6875, i_78_, i_79_, i_77_);
                            if (i_74_ != 0 || i_75_ != 0 || i_76_ != 0) class124s[i_73_].method1099((byte) 93, i_76_, i_74_, i_75_);
                        }
                    }
                }
                Class124 class124;
                if (class124s.length == 1) class124 = class124s[0];
                else class124 = new Class124(class124s, class124s.length);
                if (aShortArray1328 != null) i_69_ |= 0x4000;
                if (aShortArray1393 != null) i_69_ |= 0x8000;
                if (aByte1405 != 0) i_69_ |= 0x80000;
                class64 = var_ha.method3625(class124, i_69_, (this.aClass278_1348.anInt3593), 64 + anInt1398, 850 + anInt1406);
                if (aShortArray1328 != null) {
                    for (int i_80_ = 0; (i_80_ < aShortArray1328.length); i_80_++) {
                        if (aByteArray1374 == null || aByteArray1374.length <= i_80_) class64.ia(aShortArray1328[i_80_], aShortArray1352[i_80_]);
                        else class64.ia(aShortArray1328[i_80_], (Class348_Sub42_Sub3.aShortArray9502[aByteArray1374[i_80_] & 0xff]));
                    }
                }
                if (aShortArray1393 != null) {
                    for (int i_81_ = 0; aShortArray1393.length > i_81_; i_81_++)
                        class64.aa(aShortArray1393[i_81_], aShortArray1391[i_81_]);
                }
                if (aByte1405 != 0) class64.method624(aByte1376, aByte1360, aByte1330, aByte1405 & 0xff);
                class64.s(i_43_);
                synchronized (this.aClass278_1348.aClass60_3590) {
                    this.aClass278_1348.aClass60_3590.method582(class64, this.anInt1344 | var_ha.anInt4567 << 16, (byte) -125);
                }
            }
            Class64 class64_82_ = class64.method614((byte) 4, i_43_, true);
            boolean bool_83_ = false;
            if (is != null) {
                for (int i_84_ = 0; i_84_ < 12; i_84_++) {
                    if (is[i_84_] != -1) bool_83_ = true;
                }
            }
            if (!bool_44_ && !bool_83_) return class64_82_;
            Class101[] class101s = null;
            if (class225 != null) class101s = class225.method1618(var_ha, 0);
            if (bool_83_ && class101s != null) {
                for (int i_85_ = 0; i_85_ < 12; i_85_++) {
                    if (class101s[i_85_] != null) class64_82_.method610(class101s[i_85_], 1 << i_85_, true);
                }
            }
            int i_86_ = 0;
            int i_87_ = 1;
            while (i_86_ < i_49_) {
                if ((Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010[i_86_]) != null)
                    class64_82_.method603((byte) -55, -1 + Class67.anIntArray4648[i_86_], null, i_87_, Class90.anIntArray1518[i_86_], Class183.anIntArray2466[i_86_], (Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672[i_86_]), 0, (Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010[i_86_]), (Class163.aClass17Array2169[i_86_].aBoolean242), Class348_Sub23_Sub4.anIntArray9050[i_86_]);
                i_86_++;
                i_87_ <<= 1;
            }
            if (bool_83_) {
                for (int i_88_ = 0; i_88_ < 12; i_88_++) {
                    if (is[i_88_] != -1) {
                        int i_89_ = -i + is[i_88_];
                        i_89_ &= 0x3fff;
                        Class101 class101 = var_ha.method3654();
                        class101.method895(i_89_);
                        class64_82_.method610(class101, 1 << i_88_, false);
                    }
                }
            }
            if (bool_83_ && class101s != null) {
                for (int i_90_ = 0; i_90_ < 12; i_90_++) {
                    if (class101s[i_90_] != null) class64_82_.method610(class101s[i_90_], 1 << i_90_, false);
                }
            }
            if (class348_sub42_sub17 != null && class348_sub42_sub17_63_ != null)
                class64_82_.method625(class348_sub42_sub17_59_, i_58_, (byte) 122, i_62_, class348_sub42_sub17_63_, i_56_, i_60_, -1 + i_41_, class348_sub42_sub17, (class17_36_.aBoolean242 | class17.aBoolean242), i_57_, class348_sub42_sub17_64_, -1 + i_34_, class17_36_.aBooleanArray263, i_61_);
            else if (class348_sub42_sub17 != null) class64_82_.method617(i_56_, i_58_, class348_sub42_sub17_59_, 0, class348_sub42_sub17, bool, class17_36_.aBoolean242, i_57_, i_41_ + -1);
            else if (class348_sub42_sub17_63_ != null) class64_82_.method617(i_60_, i_62_, class348_sub42_sub17_64_, 0, class348_sub42_sub17_63_, false, class17.aBoolean242, i_61_, i_34_ - 1);
            for (int i_91_ = 0; i_49_ > i_91_; i_91_++) {
                Class318_Sub1_Sub3_Sub1.aClass348_Sub42_Sub17Array10010[i_91_] = null;
                Class348_Sub42_Sub17.aClass348_Sub42_Sub17Array9672[i_91_] = null;
                Class163.aClass17Array2169[i_91_] = null;
            }
            if (anInt1346 != 128 || anInt1358 != 128) class64_82_.O(anInt1346, anInt1358, anInt1346);
            class64_82_.s(i_40_);
            return class64_82_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("bb.F(" + i + ',' + (class182s != null ? "{...}" : "null") + ',' + (class87 != null ? "{...}" : "null") + ',' + bool + ',' + (class17 != null ? "{...}" : "null") + ',' + i_34_ + ',' + (class261 != null ? "{...}" : "null") + ',' + i_35_ + ',' + (class17_36_ != null ? "{...}" : "null") + ',' + (interface17 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_37_ + ',' + (is != null ? "{...}" : "null") + ',' + i_38_ + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ')'));
        }
    }

    final String method801(byte i, int i_92_, String string) {
        anInt1378++;
        if (aClass356_1386 == null) return string;
        if (i != 17) method801((byte) -115, -68, null);
        Class348_Sub50 class348_sub50 = ((Class348_Sub50) aClass356_1386.method3480(i_92_, i + -6025));
        if (class348_sub50 == null) return string;
        return class348_sub50.aString7211;
    }

    static final boolean method802(int i, int i_93_, boolean bool) {
        if (bool != true) return false;
        anInt1332++;
        if (i_93_ < 0 || i < 0 || i_93_ >= Class348_Sub33.aByteArrayArrayArray6962[1].length || i >= Class348_Sub33.aByteArrayArrayArray6962[1][i_93_].length) return false;
        return (Class348_Sub33.aByteArrayArrayArray6962[1][i_93_][i] & 0x2) != 0;
    }

    final Class64 method803(Interface17 interface17, ha var_ha, int i, int i_94_, Class17 class17, Class87 class87, int i_95_, int i_96_, int i_97_) {
        try {
            anInt1389++;
            if (this.anIntArray1377 != null) {
                Class79 class79_98_ = method794(interface17, -1);
                if (class79_98_ == null) return null;
                return class79_98_.method803(interface17, var_ha, i, i_94_, class17, class87, i_95_, 104, i_97_);
            }
            if (i_96_ <= 98) method796(null, -10);
            if (anIntArray1380 == null) return null;
            int i_99_ = i_97_;
            if (class17 != null && i_95_ != -1) i_99_ |= class17.method263(i_94_, 97, i_95_, true);
            Class64 class64;
            synchronized (this.aClass278_1348.aClass60_3592) {
                class64 = ((Class64) (this.aClass278_1348.aClass60_3592.method583(var_ha.anInt4567 << 16 | this.anInt1344, 64)));
            }
            if (class64 == null || i_99_ != (class64.ua() & i_99_)) {
                if (class64 != null) i_99_ |= class64.ua();
                int i_100_ = i_99_;
                boolean bool = false;
                synchronized (this.aClass278_1348.aIndex_3576) {
                    for (int i_101_ = 0; (anIntArray1380.length > i_101_); i_101_++) {
                        if (!this.aClass278_1348.aIndex_3576.method420(-10499, anIntArray1380[i_101_], 0)) bool = true;
                    }
                }
                if (bool) return null;
                Class124[] class124s = new Class124[anIntArray1380.length];
                synchronized (this.aClass278_1348.aIndex_3576) {
                    for (int i_102_ = 0; (anIntArray1380.length > i_102_); i_102_++)
                        class124s[i_102_] = Class300.method2277(0, (this.aClass278_1348.aIndex_3576), anIntArray1380[i_102_], -1);
                }
                for (int i_103_ = 0; (i_103_ < anIntArray1380.length); i_103_++) {
                    if (class124s[i_103_] != null && class124s[i_103_].anInt1830 < 13) class124s[i_103_].method1092(2, 66);
                }
                Class124 class124;
                if (class124s.length == 1) class124 = class124s[0];
                else class124 = new Class124(class124s, class124s.length);
                if (aShortArray1328 != null) i_100_ |= 0x4000;
                if (aShortArray1393 != null) i_100_ |= 0x8000;
                if (aByte1405 != 0) i_100_ |= 0x80000;
                class64 = var_ha.method3625(class124, i_100_, (this.aClass278_1348.anInt3593), 64, 768);
                if (aShortArray1328 != null) {
                    for (int i_104_ = 0; (aShortArray1328.length > i_104_); i_104_++) {
                        if (aByteArray1374 != null && aByteArray1374.length > i_104_) class64.ia(aShortArray1328[i_104_], (Class348_Sub42_Sub3.aShortArray9502[0xff & aByteArray1374[i_104_]]));
                        else class64.ia(aShortArray1328[i_104_], aShortArray1352[i_104_]);
                    }
                }
                if (aShortArray1393 != null) {
                    for (int i_105_ = 0; aShortArray1393.length > i_105_; i_105_++)
                        class64.aa(aShortArray1393[i_105_], aShortArray1391[i_105_]);
                }
                if (aByte1405 != 0) class64.method624(aByte1376, aByte1360, aByte1330, aByte1405 & 0xff);
                class64.s(i_99_);
                synchronized (this.aClass278_1348.aClass60_3592) {
                    this.aClass278_1348.aClass60_3592.method582(class64, var_ha.anInt4567 << 16 | this.anInt1344, (byte) -96);
                }
            }
            if (class17 != null && i_95_ != -1) class64 = class17.method269(-9, class64, i_94_, i, i_99_, i_95_);
            class64.s(i_97_);
            return class64;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("bb.H(" + (interface17 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_94_ + ',' + (class17 != null ? "{...}" : "null") + ',' + (class87 != null ? "{...}" : "null") + ',' + i_95_ + ',' + i_96_ + ',' + i_97_ + ')'));
        }
    }

    public static void method804(int i) {
        aSprite_1365 = null;
        aClient1367 = null;
        if (i != -3752) anInt1387 = 14;
    }

    final int method805(int i, int i_106_, int i_107_) {
        anInt1326++;
        if (aClass356_1386 == null) return i;
        if (i_107_ <= 12) method805(46, 116, 126);
        Class348_Sub35 class348_sub35 = (Class348_Sub35) aClass356_1386.method3480(i_106_, -6008);
        if (class348_sub35 == null) return i;
        return class348_sub35.anInt6976;
    }

    public Class79() {
        anInt1346 = 128;
        this.anInt1335 = -1;
        this.anInt1337 = 0;
        anInt1354 = -1;
        this.aBoolean1345 = false;
        this.anInt1336 = -1;
        this.aByte1355 = (byte) 4;
        this.anInt1356 = 255;
        this.anInt1340 = 256;
        this.anInt1373 = -1;
        this.anInt1375 = -1;
        this.anInt1338 = -1;
        this.anInt1363 = 256;
        this.aShort1339 = (short) 0;
        this.aStringArray1349 = new String[5];
        anInt1358 = 128;
        this.aByte1353 = (byte) -96;
        this.aBoolean1362 = false;
        this.anInt1343 = -1;
        this.aByte1384 = (byte) -1;
        this.aBoolean1381 = false;
        this.anInt1383 = -1;
        this.aString1372 = "null";
        this.anInt1382 = -1;
        this.anInt1371 = -1;
        this.aByte1325 = (byte) 0;
        anInt1368 = -1;
        this.anInt1390 = -1;
        this.aBoolean1331 = true;
        this.aByte1347 = (byte) -16;
        this.anInt1366 = -1;
        anInt1398 = 0;
        this.anInt1392 = 0;
        this.anInt1364 = -1;
        this.anInt1327 = -1;
        this.anInt1361 = -1;
        this.anInt1329 = 32;
        aByte1405 = (byte) 0;
        this.anInt1385 = -1;
        this.anInt1395 = -1;
        this.aBoolean1369 = true;
        this.anInt1399 = 1;
        this.anInt1401 = -1;
        this.aBoolean1396 = true;
        this.aBoolean1397 = true;
        anInt1406 = 0;
    }
}
