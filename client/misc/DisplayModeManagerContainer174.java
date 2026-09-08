/* DisplayModeManagerContainer174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer174
/**
 * RENAMED from `Class318_Sub1_Sub3_Sub5` (JODE-obfuscated).
 * Evidence: subclass of Component327 (hierarchy)
 */ extends Component327 {
    private int anInt10365;
    int anInt10366;
    private final int anInt10367;
    private int anInt10368;
    private int anInt10369 = -1;
    static int anInt10370;
    private double aDouble10371;
    static int anInt10372;
    static int anInt10373;
    static int anInt10374;
    private final DisplayModeManagerContainer167 aClass17_10375;
    static int anInt10376;
    static int anInt10377;
    private RenderableSub10 aClass318_Sub10_10378;
    static int anInt10379;
    static int anInt10380;
    private int anInt10381;
    static int anInt10382;
    private double aDouble10383;
    private double aDouble10384;
    static int anInt10385;
    private int anInt10386;
    private final int anInt10387;
    static int anInt10388;
    static int anInt10389;
    static int anInt10390;
    private final int anInt10391;
    int anInt10392;
    private final int anInt10393;
    static int anInt10394;
    static int anInt10395 = -1;
    private int anInt10396;
    static int anInt10397;
    private final boolean aBoolean10398;
    private boolean aBoolean10399;
    private double aDouble10400;
    private double aDouble10401;
    static int anInt10402;
    private int anInt10403;
    static int anInt10404;
    static int anInt10405;
    static int anInt10406;
    private boolean aBoolean10407;
    private double aDouble10408;
    private double aDouble10409;
    private int anInt10410;
    int anInt10411;
    int anInt10412;
    private final int anInt10413;
    private double aDouble10414;
    static int anInt10415;

    final void method2387(GraphicsToolkit var_ha, int i) {
        anInt10379++;
        DisplayModeManagerContainer370 class64 = method2476(0, var_ha, (byte) 127);
        if (class64 != null) {
            if (i >= -125) this.anInt10366 = 56;
            DisplayModeManagerContainer204 class101 = var_ha.method3705();
            class101.method899(anInt10396);
            class101.method896(anInt10386);
            class101.method891((int) aDouble10408, (int) aDouble10384, (int) aDouble10371);
            anInt10410 = class64.fa();
            anInt10368 = class64.ma();
            method2473(class101, class64, var_ha, -2393);
        }
    }

    final void method2471(byte i, int i_0_, int i_1_, int i_2_, int i_3_) {
        if (!aBoolean10407) {
            double d = i_3_ + -this.x;
            double d_4_ = i_1_ + -this.y;
            double d_5_ = Math.sqrt(d * d + d_4_ * d_4_);
            aDouble10408 = ((double) this.x + (double) anInt10393 * d / d_5_);
            aDouble10371 = ((double) anInt10393 * d_4_ / d_5_ + (double) this.y);
            if (!aBoolean10398) aDouble10384 = this.anInt6382;
            else aDouble10384 = Component300.method2064((int) aDouble10408, (this.plane), 11219, (int) aDouble10371) - anInt10413;
        }
        anInt10405++;
        if (i != -103) anInt10381 = 104;
        double d = -i_2_ + (1 + this.anInt10392);
        aDouble10414 = ((double) i_1_ - aDouble10371) / d;
        aDouble10401 = ((double) i_3_ - aDouble10408) / d;
        aDouble10400 = Math.sqrt(aDouble10401 * aDouble10401 + aDouble10414 * aDouble10414);
        if (anInt10381 != -1) {
            if (!aBoolean10407) aDouble10409 = (-aDouble10400 * Math.tan(0.02454369 * (double) anInt10381));
            aDouble10383 = 2.0 * ((double) i_0_ - aDouble10384 - d * aDouble10409) / (d * d);
        } else aDouble10409 = ((double) i_0_ - aDouble10384) / d;
    }

    final void method2380(GraphicsToolkit var_ha, int i, boolean bool, RenderableObject class318_sub1, int i_6_, byte i_7_, int i_8_) {
        try {
            if (i_7_ > -106) method2474((byte) 11);
            anInt10415++;
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("to.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
        }
    }

    protected final void finalize() {
        anInt10390++;
        if (aClass318_Sub10_10378 != null) aClass318_Sub10_10378.method2534();
    }

    final void method2472(int i) {
        if (aClass318_Sub10_10378 != null) aClass318_Sub10_10378.method2534();
        anInt10404++;
        if (i != -2159) aBoolean10399 = false;
    }

    final boolean method2388(int i) {
        anInt10374++;
        if (i >= -65) aDouble10401 = -1.299791202228721;
        return false;
    }

    private final void method2473(DisplayModeManagerContainer204 class101, DisplayModeManagerContainer370 class64, GraphicsToolkit var_ha, int i) {
        do {
            try {
                anInt10406++;
                class64.transformVertices(class101);
                Component30[] class129s = class64.method619();
                DisplayModeManagerContainer173[] class342s = class64.method604();
                if ((aClass318_Sub10_10378 == null || aClass318_Sub10_10378.aBoolean6470) && (class129s != null || class342s != null)) aClass318_Sub10_10378 = RenderableSub10.method2526(OpenGlShader.clientCycle, true);
                if (aClass318_Sub10_10378 != null) {
                    aClass318_Sub10_10378.method2536(var_ha, OpenGlShader.clientCycle, class129s, class342s, false);
                    aClass318_Sub10_10378.method2533(this.plane, this.aShort8743, this.aShort8751, this.aShort8750, this.aShort8747);
                }
                if (i == -2393) break;
                finalize();
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("to.L(" + (class101 != null ? "{...}" : "null") + ',' + (class64 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    final int method2379(int i) {
        if (i != -25675) return -92;
        anInt10385++;
        return anInt10368;
    }

    final int method2394(boolean bool) {
        anInt10372++;
        if (bool != true) return 99;
        return anInt10410;
    }

    final void method2474(byte i) {
        anInt10394++;
        if (!aBoolean10407 && i == 121) {
            if (anInt10387 != 0) {
                DisplayModeManagerContainer58 class318_sub1_sub3_sub3 = null;
                if (anInt10387 < 0) {
                    int i_9_ = -1 + -anInt10387;
                    if (i_9_ == StringDefinition.anInt9591) class318_sub1_sub3_sub3 = Component72.localPlayer;
                    else class318_sub1_sub3_sub3 = (InterfaceRenderer.players[i_9_]);
                } else {
                    int i_10_ = -1 + anInt10387;
                    NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_10_, -6008));
                    if (class348_sub22 != null) class318_sub1_sub3_sub3 = (class348_sub22.npc);
                }
                if (class318_sub1_sub3_sub3 != null) {
                    this.y = class318_sub1_sub3_sub3.y;
                    this.x = class318_sub1_sub3_sub3.x;
                    this.anInt6382 = Component300.method2064((class318_sub1_sub3_sub3.x), this.plane, 11219, (class318_sub1_sub3_sub3.y)) + -anInt10413;
                    if (anInt10367 >= 0) {
                        Component241 class225 = class318_sub1_sub3_sub3.getDefinition((byte) 72);
                        int i_11_ = 0;
                        int i_12_ = 0;
                        if (class225.anIntArrayArray2939 != null && (class225.anIntArrayArray2939[anInt10367]) != null) {
                            i_11_ += (class225.anIntArrayArray2939[anInt10367][0]);
                            i_12_ += (class225.anIntArrayArray2939[anInt10367][2]);
                        }
                        if (class225.anIntArrayArray2910 != null && (class225.anIntArrayArray2910[anInt10367]) != null) {
                            i_12_ += (class225.anIntArrayArray2910[anInt10367][2]);
                            i_11_ += (class225.anIntArrayArray2910[anInt10367][0]);
                        }
                        if (i_11_ != 0 || i_12_ != 0) {
                            int i_13_ = class318_sub1_sub3_sub3.aClass264_10217.method2019((byte) -91);
                            int i_14_ = i_13_;
                            if ((class318_sub1_sub3_sub3.anIntArray10296 != null) && (class318_sub1_sub3_sub3.anIntArray10296[anInt10367]) != -1) i_14_ = (class318_sub1_sub3_sub3.anIntArray10296[anInt10367]);
                            int i_15_ = 0x3fff & -i_13_ + i_14_;
                            int i_16_ = DisplayModeManagerContainer88.anIntArray1207[i_15_];
                            int i_17_ = DisplayModeManagerContainer88.anIntArray1204[i_15_];
                            int i_18_ = i_12_ * i_16_ + i_11_ * i_17_ >> 14;
                            i_12_ = (-(i_11_ * i_16_) + i_12_ * i_17_ >> 14);
                            i_11_ = i_18_;
                            this.x += i_11_;
                            this.y += i_12_;
                        }
                    }
                }
            }
        }
    }

    final ComponentDownloader method2381(GraphicsToolkit var_ha, int i) {
        if (i != 7) aBoolean10407 = true;
        anInt10376++;
        return null;
    }

    final RenderableSub4 method2386(int i, GraphicsToolkit var_ha) {
        anInt10397++;
        DisplayModeManagerContainer370 class64 = method2476(2048, var_ha, (byte) 127);
        if (class64 == null) return null;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        class101.method899(anInt10396);
        class101.method896(anInt10386);
        class101.method891((int) aDouble10408, (int) aDouble10384, (int) aDouble10371);
        method2473(class101, class64, var_ha, -2393);
        RenderableSub4 class318_sub4 = OutputStream_Sub2.method136(i, false, false);
        if (!DisplayModeManagerContainer50.aBoolean3870) class64.render(class101, (class318_sub4.aClass318_Sub3Array6414[0]), 0);
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[0]), Component72.anInt1906, 0);
        if (aClass318_Sub10_10378 != null) {
            Component122 class98 = aClass318_Sub10_10378.method2525();
            if (DisplayModeManagerContainer50.aBoolean3870) var_ha.renderModelEx(class98, Component72.anInt1906);
            else var_ha.renderModel(class98);
        }
        aBoolean10399 = class64.F();
        anInt10410 = class64.fa();
        anInt10368 = class64.ma();
        return class318_sub4;
    }

    final boolean method2391(GraphicsToolkit var_ha, int i, int i_19_, int i_20_) {
        if (i_20_ != 0) return true;
        anInt10380++;
        return false;
    }

    final void method2475(byte i, int i_21_) {
        aBoolean10407 = true;
        anInt10388++;
        aDouble10408 += (double) i_21_ * aDouble10401;
        aDouble10371 += (double) i_21_ * aDouble10414;
        if (aBoolean10398) aDouble10384 = Component300.method2064((int) aDouble10408, (this.plane), 11219, (int) aDouble10371) + -anInt10413;
        else if (anInt10381 == -1) aDouble10384 += aDouble10409 * (double) i_21_;
        else {
            aDouble10384 += ((double) i_21_ * (aDouble10383 * 0.5) * (double) i_21_ + (double) i_21_ * aDouble10409);
            aDouble10409 += aDouble10383 * (double) i_21_;
        }
        anInt10386 = 0x3fff & 8192 + (int) (Math.atan2(aDouble10401, aDouble10414) * 2607.5945876176133);
        anInt10396 = (int) (Math.atan2(aDouble10409, aDouble10400) * 2607.5945876176133) & 0x3fff;
        if (i <= 33) method2379(-27);
        if (aClass17_10375 != null) {
            anInt10403 += i_21_;
            while (aClass17_10375.anIntArray267[anInt10365] < anInt10403) {
                anInt10403 -= aClass17_10375.anIntArray267[anInt10365];
                anInt10365++;
                if (anInt10365 >= aClass17_10375.anIntArray237.length) {
                    anInt10365 -= aClass17_10375.anInt238;
                    if (anInt10365 < 0 || anInt10365 >= (aClass17_10375.anIntArray237).length) anInt10365 = 0;
                }
                anInt10369 = anInt10365 - -1;
                if (aClass17_10375.anIntArray237.length <= anInt10369) {
                    anInt10369 -= aClass17_10375.anInt238;
                    if (anInt10369 < 0 || anInt10369 >= aClass17_10375.anIntArray237.length) anInt10369 = -1;
                }
            }
        }
    }

    final void method2392(boolean bool) {
        if (bool != true) this.anInt10411 = -29;
        anInt10402++;
        throw new IllegalStateException();
    }

    DisplayModeManagerContainer174(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, boolean bool, int i_34_) {
        super(i_22_, i_23_, i_24_, Component300.method2064(i_24_, i_22_, 11219, i_25_) + -i_26_, i_25_, i_24_ >> 9, i_24_ >> 9, i_25_ >> 9, i_25_ >> 9, false, (byte) 0);
        anInt10365 = 0;
        anInt10403 = 0;
        aBoolean10407 = false;
        aBoolean10399 = false;
        anInt10410 = 0;
        anInt10368 = 0;
        anInt10393 = i_30_;
        anInt10367 = i_34_;
        this.anInt10412 = i_32_;
        aBoolean10398 = bool;
        aBoolean10407 = false;
        this.anInt10366 = i_33_;
        anInt10391 = i;
        this.anInt10392 = i_28_;
        anInt10413 = i_26_;
        anInt10381 = i_29_;
        this.anInt10411 = i_27_;
        anInt10387 = i_31_;
        int i_35_ = (NsnDefinition.aClass319_9245.method2543((byte) 72, anInt10391).anInt4503);
        if (i_35_ != -1) aClass17_10375 = RunescapeInfo.aClass87_191.getSequence(i_35_, 7);
        else aClass17_10375 = null;
    }

    final boolean method2376(int i) {
        if (i >= -12) return false;
        anInt10373++;
        return false;
    }

    final void method2409(byte i) {
        this.aShort8743 = this.aShort8751 = (short) (int) (aDouble10408 / 512.0);
        this.aShort8750 = this.aShort8747 = (short) (int) (aDouble10371 / 512.0);
        if (i > -109) method2386(47, null);
        anInt10370++;
    }

    private final DisplayModeManagerContainer370 method2476(int i, GraphicsToolkit var_ha, byte i_36_) {
        anInt10377++;
        Component63 class368 = NsnDefinition.aClass319_9245.method2543((byte) 75, anInt10391);
        if (i_36_ < 126) aClass318_Sub10_10378 = null;
        return class368.method3562(anInt10365, var_ha, anInt10403, i, anInt10369, RunescapeInfo.aClass87_191, (byte) 121);
    }

    static final void method2477(String string, String string_37_, byte i, int i_38_, String string_39_, String string_40_, int i_41_, int i_42_, String string_43_) {
        try {
            anInt10382++;
            Component335 class147 = RenderableSub2.aClass147Array6400[99];
            for (int i_44_ = 99; i_44_ > 0; i_44_--)
                RenderableSub2.aClass147Array6400[i_44_] = RenderableSub2.aClass147Array6400[i_44_ + -1];
            if (class147 == null) class147 = new Component335(i_41_, i_42_, string_39_, string, string_43_, string_40_, i_38_, string_37_);
            else class147.method1196(i_41_, i_42_, string_43_, string, string_40_, -18691, i_38_, string_39_, string_37_);
            RenderableSub2.aClass147Array6400[0] = class147;
            HashNodeSub3.anInt9501 = ResourceLoader.anInt3918;
            if (i <= -109) NodeBaseSub1.anInt9774++;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("to.K(" + (string != null ? "{...}" : "null") + ',' + (string_37_ != null ? "{...}" : "null") + ',' + i + ',' + i_38_ + ',' + (string_39_ != null ? "{...}" : "null") + ',' + (string_40_ != null ? "{...}" : "null") + ',' + i_41_ + ',' + i_42_ + ',' + (string_43_ != null ? "{...}" : "null") + ')'));
        }
    }

    final boolean method2377(byte i) {
        anInt10389++;
        if (i != 122) aClass318_Sub10_10378 = null;
        return aBoolean10399;
    }
}
