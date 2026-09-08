/* Npc - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class318_Sub1_Sub3_Sub3_Sub1` (JODE-obfuscated).
 * Evidence: JODE header recorded original obfuscated name
 */
final class Npc extends DisplayModeManagerContainer58 {
    static int anInt10493;
    static int anInt10494;
    static int anInt10495;
    static int anInt10496;
    static int anInt10497;
    static int anInt10498;
    int anInt10499 = -1;
    static int anInt10500;
    static int anInt10501;
    static int anInt10502;
    static int anInt10503;
    static int anInt10504;
    NpcComposition definition;
    static int anInt10506;
    static int anInt10507;
    static int anInt10508;
    static int anInt10509;
    static int anInt10510;
    static int anInt10511;
    int anInt10512 = -1;
    static int anInt10513;
    static int anInt10514;
    static int anInt10515;

    static final void method2441(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        if (i_2_ != -22728) anInt10503 = 121;
        if (i_5_ - i_0_ >= Component27.anInt4960 && Component22.anInt1745 >= i_0_ + i_5_ && -i_0_ + i_3_ >= Component72.anInt1910 && i_3_ + i_0_ <= PauseTimer.anInt513) Component80.method2255(i_0_, i_5_, (byte) -68, i_1_, i_3_, i_4_, i);
        else Component275.method1496(i, i_3_, i_4_, i_0_, 2, i_1_, i_5_);
        anInt10498++;
    }

    private final boolean method2442(int i) {
        if (i != 1810797122) this.anInt10499 = -103;
        anInt10510++;
        return (this.definition.interactive);
    }

    final void method2380(GraphicsToolkit var_ha, int i, boolean bool, RenderableObject class318_sub1, int i_6_, byte i_7_, int i_8_) {
        try {
            if (i_7_ > -106) this.definition = null;
            anInt10513++;
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ff.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
        }
    }

    final void method2392(boolean bool) {
        anInt10507++;
        if (bool != true) this.anInt10499 = -13;
        throw new IllegalStateException();
    }

    final boolean method2391(GraphicsToolkit var_ha, int i, int i_9_, int i_10_) {
        anInt10514++;
        if (this.definition == null || !method2447(97, 131072, var_ha)) return false;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        int i_11_ = this.aClass264_10217.method2019((byte) -78);
        class101.method895(i_11_);
        class101.method891(this.x, this.anInt6382, this.y);
        boolean bool = false;
        for (int i_12_ = i_10_; (this.aClass64Array10323.length > i_12_); i_12_++) {
            if (this.aClass64Array10323[i_12_] != null) {
                boolean bool_13_ = (this.definition.anInt1337 > 0 || (this.definition.anInt1333 != -1 ? this.definition.anInt1333 == 1 : this.definition.anInt1399 == 1));
                boolean bool_14_;
                if (DisplayModeManagerContainer50.aBoolean3870) bool_14_ = (this.aClass64Array10323[i_12_].isInFrustumExt(i_9_, i, class101, bool_13_, this.definition.anInt1337, Component72.anInt1906));
                else bool_14_ = (this.aClass64Array10323[i_12_].isInFrustumExtended(i_9_, i, class101, bool_13_, this.definition.anInt1337));
                if (bool_14_) {
                    bool = true;
                    break;
                }
            }
        }
        this.aClass64Array10323[0] = this.aClass64Array10323[1] = this.aClass64Array10323[2] = null;
        return bool;
    }

    final void method2443(int i, int i_15_, int i_16_) {
        anInt10497++;
        int i_17_ = this.anIntArray10320[0];
        int i_18_ = this.anIntArray10317[0];
        if (i == 0) i_18_++;
        if (i == 1) {
            i_17_++;
            i_18_++;
        }
        if (i == 2) i_17_++;
        if (i == 3) {
            i_17_++;
            i_18_--;
        }
        if (i == 4) i_18_--;
        if (i == 5) {
            i_17_--;
            i_18_--;
        }
        if (i == 6) i_17_--;
        if (i == 7) {
            i_17_--;
            i_18_++;
        }
        if (this.anInt10286 != -1 && RunescapeInfo.aClass87_191.getSequence(this.anInt10286, 7).anInt245 == 1) {
            this.anInt10286 = -1;
            this.anIntArray10236 = null;
        }
        if (this.anInt10269 != -1) {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 118, this.anInt10269));
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (RunescapeInfo.aClass87_191.getSequence(class368.anInt4503, 7).anInt245) == 1) this.anInt10269 = -1;
        }
        if (this.anInt10291 != -1) {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 77, this.anInt10291));
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (RunescapeInfo.aClass87_191.getSequence(class368.anInt4503, 7).anInt245) == 1) this.anInt10291 = -1;
        }
        if ((~this.anInt10319) > i_16_) this.anInt10319++;
        for (int i_19_ = this.anInt10319; i_19_ > 0; i_19_--) {
            this.anIntArray10320[i_19_] = this.anIntArray10320[-1 + i_19_];
            this.anIntArray10317[i_19_] = this.anIntArray10317[-1 + i_19_];
            this.aByteArray10321[i_19_] = this.aByteArray10321[i_19_ + -1];
        }
        this.anIntArray10320[0] = i_17_;
        this.anIntArray10317[0] = i_18_;
        this.aByteArray10321[0] = (byte) i_15_;
    }

    final RenderableSub4 method2386(int i, GraphicsToolkit var_ha) {
        anInt10501++;
        if (this.definition == null || !method2447(i + 114, 2048, var_ha)) return null;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        int i_20_ = this.aClass264_10217.method2019((byte) -69);
        class101.method895(i_20_);
        Component186 class357 = (Component335.aClass357ArrayArrayArray2029[this.plane][this.x >> Component149.anInt4459][this.y >> Component149.anInt4459]);
        if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null) {
            int i_21_ = (-class357.aClass318_Sub1_Sub1_4402.aShort8727 + this.anInt10274);
            this.anInt10274 -= (float) i_21_ / 10.0F;
        } else this.anInt10274 -= (float) this.anInt10274 / 10.0F;
        class101.method891(this.x, (-this.anInt10274 + this.anInt6382 + -20), this.y);
        Component241 class225 = this.getDefinition((byte) 72);
        NpcComposition class79 = (this.definition.anIntArray1377 != null ? this.definition.method794(DisplayModeManagerContainer58.aClass170_10209, -1) : this.definition);
        this.aBoolean10324 = false;
        RenderableSub4 class318_sub4 = null;
        if (Component192.preferences.aClass239_Sub21_7270.method1812(-32350) == i && class79.aBoolean1369 && class225.aBoolean2913) {
            DisplayModeManagerContainer167 class17 = ((this.anInt10286 == -1 || this.anInt10218 != 0) ? null : RunescapeInfo.aClass87_191.getSequence(this.anInt10286, 7));
            DisplayModeManagerContainer167 class17_22_ = ((this.anInt10268 == -1 || (this.aBoolean10213 && class17 != null)) ? null : RunescapeInfo.aClass87_191.getSequence(this.anInt10268, 7));
            DisplayModeManagerContainer370 class64 = (Node.method2711(this.anInt10302, i_20_, this.aClass64Array10323[0], this.anInt10208, false, (class17_22_ == null ? this.anInt10267 : this.anInt10245), 0xffff & this.definition.aShort1339, this.definition.anInt1399, this.anInt10252, var_ha, 0xff & this.definition.aByte1353, this.definition.aShort1350 & 0xffff, this.definition.aByte1347 & 0xff, class17_22_ == null ? class17 : class17_22_));
            if (class64 != null) {
                class318_sub4 = (OutputStream_Sub2.method136(1 + (this.aClass64Array10323).length, method2442(1810797122), false));
                this.aBoolean10324 = true;
                var_ha.C(false);
                if (!DisplayModeManagerContainer50.aBoolean3870) class64.render(class101, (class318_sub4.aClass318_Sub3Array6414[(this.aClass64Array10323).length]), 0);
                else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[(this.aClass64Array10323).length]), Component72.anInt1906, 0);
                var_ha.C(true);
            }
        }
        class101.method895(i_20_);
        class101.method891(this.x, (-this.anInt10274 + (-5 + this.anInt6382)), this.y);
        if (class318_sub4 == null) class318_sub4 = OutputStream_Sub2.method136((this.aClass64Array10323).length, method2442(1810797122), false);
        this.method2432(var_ha, -15074, class101, false, this.aClass64Array10323);
        if (DisplayModeManagerContainer50.aBoolean3870) {
            for (int i_24_ = 0; (this.aClass64Array10323.length > i_24_); i_24_++) {
                if (this.aClass64Array10323[i_24_] != null) this.aClass64Array10323[i_24_].method608(class101, (class318_sub4.aClass318_Sub3Array6414[i_24_]), Component72.anInt1906, 0);
            }
        } else {
            for (int i_23_ = 0; (this.aClass64Array10323.length > i_23_); i_23_++) {
                if (this.aClass64Array10323[i_23_] != null) this.aClass64Array10323[i_23_].render(class101, (class318_sub4.aClass318_Sub3Array6414[i_23_]), 0);
            }
        }
        if (this.aClass318_Sub10_10327 != null) {
            Component122 class98 = this.aClass318_Sub10_10327.method2525();
            if (DisplayModeManagerContainer50.aBoolean3870) var_ha.renderModelEx(class98, Component72.anInt1906);
            else var_ha.renderModel(class98);
        }
        for (int i_25_ = 0; (this.aClass64Array10323.length > i_25_); i_25_++) {
            if (this.aClass64Array10323[i_25_] != null) this.aBoolean10324 |= this.aClass64Array10323[i_25_].F();
        }
        this.anInt10301 = DisplayModeManagerContainer341.anInt6006;
        this.aClass64Array10323[0] = this.aClass64Array10323[1] = this.aClass64Array10323[2] = null;
        return class318_sub4;
    }

    final int method2421(byte i) {
        anInt10495++;
        if ((this.definition.anIntArray1377) != null) {
            NpcComposition class79 = this.definition.method794(DisplayModeManagerContainer58.aClass170_10209, -1);
            if (class79 != null && class79.anInt1366 != -1) return class79.anInt1366;
        }
        if (i < 113) method2448(null, 88);
        return (this.definition.anInt1366);
    }

    final int method2393(int i) {
        anInt10506++;
        if (i >= -109) this.anInt10499 = -47;
        if (this.definition == null) return 0;
        return (this.definition.anInt1337);
    }

    final void method2444(int i, boolean bool, int i_26_, int i_27_, int i_28_, int i_29_) {
        this.plane = this.aByte6376 = (byte) i_29_;
        anInt10515++;
        if (NpcComposition.method802(i, i_26_, true)) this.aByte6376++;
        if (this.anInt10286 != -1 && RunescapeInfo.aClass87_191.getSequence(this.anInt10286, 7).anInt245 == 1) {
            this.anIntArray10236 = null;
            this.anInt10286 = -1;
        }
        if (this.anInt10269 != -1) {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 117, this.anInt10269));
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (RunescapeInfo.aClass87_191.getSequence(class368.anInt4503, 7).anInt245) == 1) this.anInt10269 = -1;
        }
        if (this.anInt10291 != -1) {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 56, this.anInt10291));
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (RunescapeInfo.aClass87_191.getSequence(class368.anInt4503, 7).anInt245) == 1) this.anInt10291 = -1;
        }
        if (!bool) {
            int i_30_ = i_26_ - this.anIntArray10320[0];
            int i_31_ = i + -this.anIntArray10317[0];
            if (i_30_ >= -8 && i_30_ <= 8 && i_31_ >= -8 && i_31_ <= 8) {
                if (this.anInt10319 < 9) this.anInt10319++;
                for (int i_32_ = this.anInt10319; i_32_ > 0; i_32_--) {
                    this.anIntArray10320[i_32_] = (this.anIntArray10320[i_32_ - 1]);
                    this.anIntArray10317[i_32_] = (this.anIntArray10317[i_32_ + -1]);
                    this.aByteArray10321[i_32_] = (this.aByteArray10321[i_32_ + -1]);
                }
                this.anIntArray10320[0] = i_26_;
                this.anIntArray10317[0] = i;
                this.aByteArray10321[0] = (byte) 1;
                return;
            }
        }
        this.anInt10322 = 0;
        this.anInt10319 = 0;
        this.anIntArray10320[0] = i_26_;
        if (i_27_ >= 91) {
            this.anInt10326 = 0;
            this.anIntArray10317[0] = i;
            this.x = (this.anIntArray10320[0] << 9) + (i_28_ << 8);
            this.y = (this.anIntArray10317[0] << 9) + (i_28_ << 8);
            if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327.method2529();
        }
    }

    final ComponentDownloader method2381(GraphicsToolkit var_ha, int i) {
        if (i != 7) this.anInt10512 = 102;
        anInt10493++;
        return null;
    }

    final boolean method2445(byte i) {
        anInt10500++;
        if (this.definition == null) return false;
        int i_33_ = 116 % ((-44 - i) / 38);
        return true;
    }

    final int method2425(int i) {
        anInt10496++;
        if ((this.definition.anIntArray1377) != null) {
            NpcComposition class79 = this.definition.method794(DisplayModeManagerContainer58.aClass170_10209, -1);
            if (class79 != null && class79.anInt1336 != -1) return class79.anInt1336;
        }
        if (i != -1) this.anInt10499 = -69;
        return (this.definition.anInt1336);
    }

    final boolean method2388(int i) {
        anInt10502++;
        return i > -65;
    }

    final int method2426(int i) {
        anInt10504++;
        if (i != 200) return 115;
        if ((this.definition.anIntArray1377) != null) {
            NpcComposition class79 = this.definition.method794(DisplayModeManagerContainer58.aClass170_10209, -1);
            if (class79 != null && class79.anInt1390 != -1) return class79.anInt1390;
        }
        if ((this.definition.anInt1390) == -1) return super.method2426(200);
        return (this.definition.anInt1390);
    }

    final void method2387(GraphicsToolkit var_ha, int i) {
        anInt10509++;
        if (this.definition != null && (this.aBoolean10318 || method2447(123, 0, var_ha))) {
            if (i > -125) method2391(null, -2, -103, 34);
            DisplayModeManagerContainer204 class101 = var_ha.method3705();
            class101.method895(this.aClass264_10217.method2019((byte) -118));
            class101.method891(this.x, -20 + this.anInt6382, this.y);
            this.method2432(var_ha, -15074, class101, this.aBoolean10318, (this.aClass64Array10323));
            this.aClass64Array10323[0] = this.aClass64Array10323[1] = this.aClass64Array10323[2] = null;
        }
    }

    public Npc() {
        /* empty */
    }

    static final boolean method2446(char c, byte i) {
        if (i != 105) anInt10503 = 124;
        anInt10508++;
        return (c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }

    private final boolean method2447(int i, int i_34_, GraphicsToolkit var_ha) {
        if (i <= 84) this.definition = null;
        anInt10494++;
        int i_35_ = i_34_;
        Component241 class225 = this.getDefinition((byte) 72);
        DisplayModeManagerContainer167 class17 = ((this.anInt10286 == -1 || this.anInt10218 != 0) ? null : RunescapeInfo.aClass87_191.getSequence(this.anInt10286, 7));
        DisplayModeManagerContainer167 class17_36_ = ((this.anInt10268 != -1 && (!this.aBoolean10213 || class17 == null)) ? RunescapeInfo.aClass87_191.getSequence(this.anInt10268, 7) : null);
        int i_37_ = class225.anInt2932;
        int i_38_ = class225.anInt2941;
        if (i_37_ != 0 || i_38_ != 0 || class225.anInt2950 != 0 || class225.anInt2926 != 0) i_34_ |= 0x7;
        boolean bool = (this.aByte10279 != 0 && (OpenGlShader.clientCycle >= this.anInt10248) && (OpenGlShader.clientCycle < this.anInt10250));
        if (bool) i_34_ |= 0x80000;
        int i_39_ = this.aClass264_10217.method2019((byte) -25);
        DisplayModeManagerContainer370 class64 = (this.aClass64Array10323[0] = (this.definition.method800(i_39_, this.aClass182Array10308, RunescapeInfo.aClass87_191, false, class17_36_, this.anInt10203, DisplayModeManagerContainer282.aClass261_5558, this.anInt10267, class17, DisplayModeManagerContainer58.aClass170_10209, var_ha, this.anInt10312, this.anIntArray10296, this.anInt10244, this.anInt10245, i_34_, this.anInt10232)));
        if (class64 == null) return false;
        this.anInt10207 = class64.fa();
        this.anInt10230 = class64.ma();
        this.method2439(-125, class64);
        if (i_37_ != 0 || i_38_ != 0) {
            this.updateRenderPosition(i_39_, i_37_, class225.anInt2943, i_38_, (byte) 78, class225.anInt2912);
            if (this.anInt10302 != 0) this.aClass64Array10323[0].FA(this.anInt10302);
            if (this.anInt10208 != 0) this.aClass64Array10323[0].VA(this.anInt10208);
            if (this.anInt10252 != 0) this.aClass64Array10323[0].H(0, this.anInt10252, 0);
        } else this.updateRenderPosition(i_39_, this.getSize((byte) 78) << 9, 0, this.getSize((byte) 108) << 9, (byte) 92, 0);
        if (bool) class64.animateColors(this.aByte10255, this.aByte10206, this.aByte10270, (0xff & this.aByte10279));
        if (this.anInt10269 == -1 || this.anInt10240 == -1) this.aClass64Array10323[1] = null;
        else {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 56, this.anInt10269));
            boolean bool_40_ = (class368.aByte4488 == 3 && (i_37_ != 0 || i_38_ != 0));
            int i_41_ = i_35_;
            if (!bool_40_) {
                if (this.anInt10237 != 0) i_41_ |= 0x5;
                if (this.anInt10220 != 0) i_41_ |= 0x2;
                if (this.anInt10278 >= 0) i_41_ |= 0x7;
            } else i_41_ |= 0x7;
            DisplayModeManagerContainer370 class64_42_ = (this.aClass64Array10323[1] = (class368.method3562(this.anInt10240, var_ha, this.anInt10243, i_41_, this.anInt10283, RunescapeInfo.aClass87_191, (byte) 78)));
            if (class64_42_ != null) {
                if (this.anInt10278 < 0) {
                    if (this.anInt10237 != 0) class64_42_.a(2048 * (this.anInt10237));
                } else {
                    int i_43_ = 0;
                    int i_44_ = 0;
                    int i_45_ = 0;
                    if (class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939[this.anInt10278]) != null)) {
                        i_45_ += (class225.anIntArrayArray2939[this.anInt10278][2]);
                        i_43_ += (class225.anIntArrayArray2939[this.anInt10278][0]);
                        i_44_ += (class225.anIntArrayArray2939[this.anInt10278][1]);
                    }
                    if (class225.anIntArrayArray2910 != null && ((class225.anIntArrayArray2910[this.anInt10278]) != null)) {
                        i_44_ += (class225.anIntArrayArray2910[this.anInt10278][1]);
                        i_43_ += (class225.anIntArrayArray2910[this.anInt10278][0]);
                        i_45_ += (class225.anIntArrayArray2910[this.anInt10278][2]);
                    }
                    if (i_45_ != 0 || i_43_ != 0) {
                        int i_46_ = i_39_;
                        if ((this.anIntArray10296 != null) && ((this.anIntArray10296[this.anInt10278]) != -1)) i_46_ = (this.anIntArray10296[(this.anInt10278)]);
                        int i_47_ = (-i_39_ + (i_46_ + 2048 * this.anInt10237) & 0x3fff);
                        if (i_47_ != 0) class64_42_.a(i_47_);
                        int i_48_ = DisplayModeManagerContainer88.anIntArray1207[i_47_];
                        int i_49_ = DisplayModeManagerContainer88.anIntArray1204[i_47_];
                        int i_50_ = i_45_ * i_48_ - -(i_43_ * i_49_) >> 14;
                        i_45_ = i_45_ * i_49_ + -(i_43_ * i_48_) >> 14;
                        i_43_ = i_50_;
                    }
                    class64_42_.H(i_43_, i_44_, i_45_);
                }
                if (this.anInt10220 != 0) class64_42_.H(0, (-this.anInt10220 << 2), 0);
                if (bool_40_) {
                    if (this.anInt10302 != 0) class64_42_.FA(this.anInt10302);
                    if (this.anInt10208 != 0) class64_42_.VA(this.anInt10208);
                    if (this.anInt10252 != 0) class64_42_.H(0, (this.anInt10252), 0);
                }
            }
        }
        if (this.anInt10291 == -1 || this.anInt10224 == -1) this.aClass64Array10323[2] = null;
        else {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 98, this.anInt10291));
            boolean bool_51_ = (class368.aByte4488 == 3 && (i_37_ != 0 || i_38_ != 0));
            int i_52_ = i_35_;
            if (!bool_51_) {
                if (this.anInt10202 != 0) i_52_ |= 0x5;
                if (this.anInt10260 != 0) i_52_ |= 0x2;
                if (this.anInt10289 >= 0) i_52_ |= 0x7;
            } else i_52_ |= 0x7;
            DisplayModeManagerContainer370 class64_53_ = (this.aClass64Array10323[2] = (class368.method3558(this.anInt10273, this.anInt10276, var_ha, i_52_, 3172, RunescapeInfo.aClass87_191, this.anInt10224)));
            if (class64_53_ != null) {
                if (this.anInt10289 >= 0 && class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939[this.anInt10289]) != null)) {
                    int i_54_ = 0;
                    int i_55_ = 0;
                    int i_56_ = 0;
                    if (class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939[this.anInt10289]) != null)) {
                        i_55_ += (class225.anIntArrayArray2939[this.anInt10289][1]);
                        i_54_ += (class225.anIntArrayArray2939[this.anInt10289][0]);
                        i_56_ += (class225.anIntArrayArray2939[this.anInt10289][2]);
                    }
                    if (class225.anIntArrayArray2910 != null && ((class225.anIntArrayArray2910[this.anInt10289]) != null)) {
                        i_55_ += (class225.anIntArrayArray2910[this.anInt10289][1]);
                        i_54_ += (class225.anIntArrayArray2910[this.anInt10289][0]);
                        i_56_ += (class225.anIntArrayArray2910[this.anInt10289][2]);
                    }
                    if (i_56_ != 0 || i_54_ != 0) {
                        int i_57_ = i_39_;
                        if ((this.anIntArray10296 != null) && ((this.anIntArray10296[this.anInt10289]) != -1)) i_57_ = (this.anIntArray10296[(this.anInt10289)]);
                        int i_58_ = (0x3fff & -i_39_ + (i_57_ + 2048 * this.anInt10202));
                        if (i_58_ != 0) class64_53_.a(i_58_);
                        int i_59_ = DisplayModeManagerContainer88.anIntArray1207[i_58_];
                        int i_60_ = DisplayModeManagerContainer88.anIntArray1204[i_58_];
                        int i_61_ = i_56_ * i_59_ - -(i_60_ * i_54_) >> 14;
                        i_56_ = i_60_ * i_56_ - i_59_ * i_54_ >> 14;
                        i_54_ = i_61_;
                    }
                    class64_53_.H(i_54_, i_55_, i_56_);
                } else if (this.anInt10202 != 0) class64_53_.a(2048 * this.anInt10202);
                if (this.anInt10260 != 0) class64_53_.H(0, (-this.anInt10260 << 2), 0);
                if (bool_51_) {
                    if (this.anInt10302 != 0) class64_53_.FA(this.anInt10302);
                    if (this.anInt10208 != 0) class64_53_.VA(this.anInt10208);
                    if (this.anInt10252 != 0) class64_53_.H(0, (this.anInt10252), 0);
                }
            }
        }
        return true;
    }

    final void method2448(NpcComposition class79, int i) {
        anInt10511++;
        this.definition = class79;
        if (i != -2) this.anInt10512 = 69;
        if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327.method2529();
    }
}
