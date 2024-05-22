/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class17 {
    static int anInt235;
    int[] anIntArray236;
    int[] anIntArray237;
    int anInt238;
    int anInt239;
    static int anInt240;
    boolean aBoolean241;
    boolean aBoolean242 = false;
    static int anInt243;
    int anInt244;
    int anInt245;
    static int anInt246;
    static boolean aBoolean247 = false;
    int anInt248;
    int anInt249;
    static Class114 aClass114_250 = new Class114(4, 1);
    Class87 aClass87_251;
    static Interface4 anInterface4_252;
    int[] anIntArray253;
    boolean aBoolean254;
    static int[][] anIntArrayArray255;
    static int[] anIntArray256;
    static int anInt257;
    static int anInt258;
    static int anInt259;
    private int[] anIntArray260;
    int anInt261;
    int anInt262;
    boolean[] aBooleanArray263;
    int[][] anIntArrayArray264;
    int[] anIntArray265;
    static int anInt266;
    int[] anIntArray267;
    boolean aBoolean268;
    int anInt269;

    final int method263(int i, int i_0_, int i_1_, boolean bool) {
        anInt240++;
        int i_2_ = 0;
        int i_3_ = 0;
        int i_4_ = this.anIntArray237[i_1_];
        Class348_Sub42_Sub17 class348_sub42_sub17 = null;
        Class348_Sub42_Sub17 class348_sub42_sub17_5_ = this.aClass87_251.method839(i_4_ >> 16, 3);
        i_4_ &= 0xffff;
        if (class348_sub42_sub17_5_ == null) return i_2_;
        if ((this.aBoolean241 || Class28.aBoolean5002) && i != -1 && i < this.anIntArray237.length) {
            i_3_ = this.anIntArray237[i];
            class348_sub42_sub17 = this.aClass87_251.method839(i_3_ >> 16, 3);
            i_3_ &= 0xffff;
        }
        if (i_0_ <= 96) return 11;
        if (this.aBoolean242) i_2_ |= 0x200;
        if (class348_sub42_sub17_5_.method3272(i_4_, 0)) i_2_ |= 0x80;
        if (class348_sub42_sub17_5_.method3271(i_4_, 14)) i_2_ |= 0x100;
        if (class348_sub42_sub17_5_.method3267((byte) -110, i_4_)) i_2_ |= 0x400;
        if (class348_sub42_sub17 != null) {
            if (class348_sub42_sub17.method3272(i_3_, 0)) i_2_ |= 0x80;
            if (class348_sub42_sub17.method3271(i_3_, 14)) i_2_ |= 0x100;
            if (class348_sub42_sub17.method3267((byte) -127, i_3_)) i_2_ |= 0x400;
        }
        if (anIntArray260 != null && bool) {
            if (anIntArray260.length > i_1_) {
                int i_6_ = anIntArray260[i_1_];
                if (i_6_ != 65535) {
                    Class348_Sub42_Sub17 class348_sub42_sub17_7_ = this.aClass87_251.method839(i_6_ >> 16, 3);
                    i_6_ &= 0xffff;
                    if (class348_sub42_sub17_7_ != null) {
                        if (class348_sub42_sub17_7_.method3272(i_6_, 0)) i_2_ |= 0x80;
                        if (class348_sub42_sub17_7_.method3271(i_6_, 14)) i_2_ |= 0x100;
                        if (class348_sub42_sub17_7_.method3267((byte) -103, i_6_)) i_2_ |= 0x400;
                    }
                }
            }
            if ((this.aBoolean241 || Class28.aBoolean5002) && i != -1 && anIntArray260.length > i) {
                int i_8_ = anIntArray260[i];
                if (i_8_ != 65535) {
                    Class348_Sub42_Sub17 class348_sub42_sub17_9_ = this.aClass87_251.method839(i_8_ >> 16, 3);
                    i_8_ &= 0xffff;
                    if (class348_sub42_sub17_9_ != null) {
                        if (class348_sub42_sub17_9_.method3272(i_8_, 0)) i_2_ |= 0x80;
                        if (class348_sub42_sub17_9_.method3271(i_8_, 14)) i_2_ |= 0x100;
                        if (class348_sub42_sub17_9_.method3267((byte) -93, i_8_)) i_2_ |= 0x400;
                    }
                }
            }
        }
        return 0x20 | i_2_;
    }

    private final void method264(Class348_Sub49 class348_sub49, int i, int i_10_) {
        if (i_10_ == -14861) {
            if (i == 1) {
                int i_11_ = class348_sub49.readUnsignedShort(842397944);//short
                this.anIntArray267 = new int[i_11_];
                this.anIntArray237 = new int[i_11_];
                for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
                    this.anIntArray267[i_12_] = class348_sub49.readUnsignedShort(842397944);
                for (int i_13_ = 0; i_13_ < i_11_; i_13_++)
                    this.anIntArray237[i_13_] = class348_sub49.readUnsignedShort(842397944);
                for (int i_14_ = 0; i_14_ < i_11_; i_14_++)
                    this.anIntArray237[i_14_] = ((class348_sub49.readUnsignedShort(842397944) << 16) + this.anIntArray237[i_14_]);
            } else if (i != 2) {
                if (i == 3) {
                    this.aBooleanArray263 = new boolean[256];
                    int i_15_ = class348_sub49.readUnsignedByte(255);//byte
                    for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
                        this.aBooleanArray263[class348_sub49.readUnsignedByte(255)] = true;
                } else if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i == 9) this.anInt262 = class348_sub49.readUnsignedByte(i_10_ + 15116);
                                else if (i == 10) this.anInt245 = class348_sub49.readUnsignedByte(i_10_ ^ ~0x3af3);
                                else if (i != 11) {
                                    if (i == 12) {
                                        int i_17_ = class348_sub49.readUnsignedByte(i_10_ ^ ~0x3af3);
                                        anIntArray260 = new int[i_17_];
                                        for (int i_18_ = 0; (i_18_ < i_17_); i_18_++)
                                            anIntArray260[i_18_] = class348_sub49.readUnsignedShort(842397944);
                                        for (int i_19_ = 0; (i_17_ > i_19_); i_19_++)
                                            anIntArray260[i_19_] = ((class348_sub49.readUnsignedShort(842397944) << 16) - -anIntArray260[i_19_]);
                                    } else if (i == 13) {
                                        int i_20_ = class348_sub49.readUnsignedShort(842397944);
                                        this.anIntArrayArray264 = new int[i_20_][];
                                        for (int i_21_ = 0; (i_21_ < i_20_); i_21_++) {
                                            int i_22_ = class348_sub49.readUnsignedByte(255);
                                            if (i_22_ > 0) {
                                                this.anIntArrayArray264[i_21_] = new int[i_22_];
                                                this.anIntArrayArray264[i_21_][0] = class348_sub49.readMedium(-1);
                                                for (int i_23_ = 1; (i_22_ > i_23_); i_23_++)
                                                    this.anIntArrayArray264[i_21_][i_23_] = (class348_sub49.readUnsignedShort(842397944));
                                            }
                                        }
                                    } else if (i != 14) {
                                        if (i == 15) this.aBoolean241 = true;
                                        else if (i == 16) this.aBoolean254 = true;
                                        else if (i == 18) this.aBoolean268 = true;
                                        else if (i == 19) {
                                            if (this.anIntArray253 == null) {
                                                this.anIntArray253 = (new int[(this.anIntArrayArray264).length]);
                                                for (int i_24_ = 0; ((this.anIntArrayArray264).length > i_24_); i_24_++)
                                                    this.anIntArray253[i_24_] = 255;
                                            }
                                            this.anIntArray253[class348_sub49.readUnsignedByte(255)] = (class348_sub49.readUnsignedByte(Class348_Sub21.method2955(i_10_, -15092)));
                                        } else if (i == 20) {
                                            if ((this.anIntArray236 == null) || (this.anIntArray265) == null) {
                                                this.anIntArray236 = (new int[(this.anIntArrayArray264).length]);
                                                this.anIntArray265 = (new int[(this.anIntArrayArray264).length]);
                                                for (int i_25_ = 0; ((this.anIntArrayArray264).length > i_25_); i_25_++) {
                                                    this.anIntArray236[i_25_] = 256;
                                                    this.anIntArray265[i_25_] = 256;
                                                }
                                            }
                                            int i_26_ = class348_sub49.readUnsignedByte(255);
                                            this.anIntArray236[i_26_] = class348_sub49.readUnsignedShort(842397944);
                                            this.anIntArray265[i_26_] = class348_sub49.readUnsignedShort(842397944);
                                        }
                                    } else this.aBoolean242 = true;
                                } else this.anInt248 = class348_sub49.readUnsignedByte(255);
                            } else this.anInt244 = class348_sub49.readUnsignedByte(255);
                        } else this.anInt261 = class348_sub49.readUnsignedShort(842397944);
                    } else this.anInt249 = class348_sub49.readUnsignedShort(842397944);
                } else this.anInt239 = class348_sub49.readUnsignedByte(i_10_ + 15116);
            } else this.anInt238 = class348_sub49.readUnsignedShort(i_10_ ^ ~0x3235c2f4);
            anInt257++;
        }
    }

    public static void method265(boolean bool) {
        anIntArray256 = null;
        aClass114_250 = null;
        anIntArrayArray255 = null;
        if (bool != false) method268(-22, -54, -101, -115, -107, 90, 13, -47);
        anInterface4_252 = null;
    }

    final Class64 method266(Class64 class64, int i, int i_27_, byte i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
        anInt266++;
        int i_33_ = this.anIntArray267[i_29_];
        i_29_ = this.anIntArray237[i_29_];
        Class348_Sub42_Sub17 class348_sub42_sub17 = this.aClass87_251.method839(i_29_ >> 16, 3);
        i_29_ &= 0xffff;
        if (class348_sub42_sub17 == null) return class64.method614(i_28_, i_32_, true);
        Class348_Sub42_Sub17 class348_sub42_sub17_34_ = null;
        if ((this.aBoolean241 || Class28.aBoolean5002) && i_27_ != -1 && this.anIntArray237.length > i_27_) {
            i_27_ = this.anIntArray237[i_27_];
            class348_sub42_sub17_34_ = this.aClass87_251.method839(i_27_ >> 16, 3);
            i_27_ &= 0xffff;
        }
        if (this.aBoolean242) i_32_ |= 0x200;
        if (class348_sub42_sub17.method3272(i_29_, i_31_ + -663780816)) i_32_ |= 0x80;
        if (class348_sub42_sub17.method3271(i_29_, i_31_ ^ 0x27907dde)) i_32_ |= 0x100;
        if (class348_sub42_sub17.method3267((byte) -126, i_29_)) i_32_ |= 0x400;
        if (class348_sub42_sub17_34_ != null) {
            if (class348_sub42_sub17_34_.method3272(i_27_, 0)) i_32_ |= 0x80;
            if (class348_sub42_sub17_34_.method3271(i_27_, 14)) i_32_ |= 0x100;
            if (class348_sub42_sub17_34_.method3267((byte) -125, i_27_)) i_32_ |= 0x400;
        }
        i_32_ |= 0x20;
        if (i_31_ != 663780816) this.anInt261 = -72;
        Class64 class64_35_ = class64.method614(i_28_, i_32_, true);
        class64_35_.method617(i_29_, i_33_, class348_sub42_sub17_34_, i, class348_sub42_sub17, false, this.aBoolean242, i_27_, i_30_ + -1);
        return class64_35_;
    }

    final void method267(Class348_Sub49 class348_sub49, boolean bool) {
        anInt243++;
        for (; ; ) {
            int i = class348_sub49.readUnsignedByte(255);
            if (i == 0) break;
            method264(class348_sub49, i, -14861);
        }
        if (bool != false) this.anIntArray267 = null;
    }

    static final void method268(int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_) {
        anInt259++;
        int i_43_ = -334 + i_39_;
        if (i_43_ < 0) i_43_ = 0;
        else if (i_43_ > 100) i_43_ = 100;
        int i_44_ = (i_43_ * (-Class348_Sub23_Sub3.aShort9044 + Class320.aShort3992) / 100 + Class348_Sub23_Sub3.aShort9044);
        i_42_ = i_42_ * i_44_ >> 8;
        Class132.anInt1906 = Class132.anInt1911 * i_44_ >> 8;
        int i_45_ = 16384 - i & 0x3fff;
        int i_46_ = 0x3fff & 16384 - i_37_;
        if (i_40_ != -19360) anInterface4_252 = null;
        int i_47_ = 0;
        int i_48_ = 0;
        int i_49_ = i_42_;
        if (i_45_ != 0) {
            i_48_ = -i_49_ * Class70.anIntArray1207[i_45_] >> 14;
            i_49_ = Class70.anIntArray1204[i_45_] * i_49_ >> 14;
        }
        if (i_46_ != 0) {
            i_47_ = Class70.anIntArray1207[i_46_] * i_49_ >> 14;
            i_49_ = i_49_ * Class70.anIntArray1204[i_46_] >> 14;
        }
        Class5.anInt4638 = i_37_;
        Class338.anInt4186 = 0;
        Class59_Sub2_Sub2.anInt8685 = i_38_ - i_49_;
        Class305.anInt3855 = -i_48_ + i_36_;
        Class286_Sub4.anInt6246 = -i_47_ + i_41_;
        ClientScript.anInt9701 = i;
    }

    final Class64 method269(int i, Class64 class64, int i_50_, int i_51_, int i_52_, int i_53_) {
        anInt246++;
        int i_54_ = this.anIntArray267[i_53_];
        int i_55_ = this.anIntArray237[i_53_];
        Class348_Sub42_Sub17 class348_sub42_sub17 = this.aClass87_251.method839(i_55_ >> 16, 3);
        i_55_ &= 0xffff;
        if (class348_sub42_sub17 == null) return class64.method614((byte) 1, i_52_, true);
        Class348_Sub42_Sub17 class348_sub42_sub17_56_ = null;
        if ((this.aBoolean241 || Class28.aBoolean5002) && i_50_ != -1 && this.anIntArray237.length > i_50_) {
            i_50_ = this.anIntArray237[i_50_];
            class348_sub42_sub17_56_ = this.aClass87_251.method839(i_50_ >> 16, 3);
            i_50_ &= 0xffff;
        }
        Class348_Sub42_Sub17 class348_sub42_sub17_57_ = null;
        Class348_Sub42_Sub17 class348_sub42_sub17_58_ = null;
        int i_59_ = 0;
        int i_60_ = 0;
        if (anIntArray260 != null) {
            if (anIntArray260.length > i_53_) {
                i_59_ = anIntArray260[i_53_];
                if (i_59_ != 65535) {
                    class348_sub42_sub17_57_ = this.aClass87_251.method839(i_59_ >> 16, 3);
                    i_59_ &= 0xffff;
                }
            }
            if ((this.aBoolean241 || Class28.aBoolean5002) && i_50_ != -1 && i_50_ < anIntArray260.length) {
                i_60_ = anIntArray260[i_50_];
                if (i_60_ != 65535) {
                    class348_sub42_sub17_58_ = this.aClass87_251.method839(i_60_ >> 16, 3);
                    i_60_ &= 0xffff;
                }
            }
        }
        if (this.aBoolean242) i_52_ |= 0x200;
        if (class348_sub42_sub17.method3272(i_55_, 0)) i_52_ |= 0x80;
        if (class348_sub42_sub17.method3271(i_55_, 14)) i_52_ |= 0x100;
        if (class348_sub42_sub17.method3267((byte) -102, i_55_)) i_52_ |= 0x400;
        if (class348_sub42_sub17_57_ != null) {
            if (class348_sub42_sub17_57_.method3272(i_59_, 0)) i_52_ |= 0x80;
            if (class348_sub42_sub17_57_.method3271(i_59_, 14)) i_52_ |= 0x100;
            if (class348_sub42_sub17_57_.method3267((byte) -109, i_59_)) i_52_ |= 0x400;
        }
        if (class348_sub42_sub17_56_ != null) {
            if (class348_sub42_sub17_56_.method3272(i_50_, 0)) i_52_ |= 0x80;
            if (class348_sub42_sub17_56_.method3271(i_50_, 14)) i_52_ |= 0x100;
            if (class348_sub42_sub17_56_.method3267((byte) -114, i_50_)) i_52_ |= 0x400;
        }
        if (class348_sub42_sub17_58_ != null) {
            if (class348_sub42_sub17_58_.method3272(i_60_, 0)) i_52_ |= 0x80;
            if (class348_sub42_sub17_58_.method3271(i_60_, 14)) i_52_ |= 0x100;
            if (class348_sub42_sub17_58_.method3267((byte) -109, i_60_)) i_52_ |= 0x400;
        }
        i_52_ |= 0x20;
        Class64 class64_61_ = class64.method614((byte) 1, i_52_, true);
        int i_62_ = -33 / ((49 - i) / 45);
        class64_61_.method617(i_55_, i_54_, class348_sub42_sub17_56_, 0, class348_sub42_sub17, false, this.aBoolean242, i_50_, -1 + i_51_);
        if (class348_sub42_sub17_57_ != null) class64_61_.method617(i_59_, i_54_, class348_sub42_sub17_58_, 0, class348_sub42_sub17_57_, false, this.aBoolean242, i_60_, -1 + i_51_);
        return class64_61_;
    }

    final void method270(byte i) {
        anInt258++;
        if (this.anInt262 == -1) {
            if (this.aBooleanArray263 == null) this.anInt262 = 0;
            else this.anInt262 = 2;
        }
        if (this.anInt245 == -1) {
            if (this.aBooleanArray263 != null) this.anInt245 = 2;
            else this.anInt245 = 0;
        }
        int i_63_ = -41 / ((i - 45) / 49);
    }

    public Class17() {
        this.anInt238 = -1;
        this.aBoolean241 = false;
        this.anInt245 = -1;
        this.anInt239 = 5;
        this.aBoolean254 = false;
        this.anInt262 = -1;
        this.anInt249 = -1;
        this.anInt248 = 2;
        this.anInt261 = -1;
        this.anInt244 = 99;
        this.aBoolean268 = false;
    }
}
