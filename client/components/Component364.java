/* Component364 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Component364
/**
 * RENAMED from `Class5_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component298 (hierarchy)
 */ extends Component298 {
    static int anInt8334;
    static boolean aBoolean8335 = false;
    static int anInt8336;
    static int anInt8337;
    private Component24 aClass105_8338;
    private Component24 aClass105_8339;
    static int anInt8340;
    static int anInt8341;
    private Component24 aClass105_8342;
    private Component24 aClass105_8343;
    static Component85 aClass221_8344;
    static int anInt8345;
    static int anInt8346;
    private Component24 aClass105_8347;
    static int anInt8348;
    static int anInt8349;
    Component24 aClass105_8350;
    static int anInt8351;
    static int anInt8352 = 0;

    Component364(CacheStore class45, CacheStore class45_0_, Component76 class369_sub3) {
        super(class45, class45_0_, class369_sub3);
    }

    static final int[] method184(int i) {
        anInt8346++;
        if (i != 1084489728) method189((byte) 33);
        return (new int[]{LoadingState.p11FullGroupId, DisplayModeManagerContainer167.p12FullGroupId, ReferenceTable.b12FullGroupId});
    }

    public final boolean method8(byte i) {
        anInt8351++;
        if (!super.method8((byte) -125)) return false;
        Component76 class369_sub3 = (Component76) this.aClass369_4635;
        if (!this.aClass45_4632.isSingletonFileReady(false, class369_sub3.anInt8599)) return false;
        if (!this.aClass45_4632.isSingletonFileReady(false, class369_sub3.anInt8595)) return false;
        if (!this.aClass45_4632.isSingletonFileReady(false, class369_sub3.anInt8603)) return false;
        if (!this.aClass45_4632.isSingletonFileReady(false, class369_sub3.anInt8602)) return false;
        int i_1_ = 47 / ((25 - i) / 52);
        if (!this.aClass45_4632.isSingletonFileReady(false, class369_sub3.anInt8600)) return false;
        return this.aClass45_4632.isSingletonFileReady(false, class369_sub3.anInt8597);
    }

    static final int method185(int i, byte i_2_) {
        if (i_2_ > 0) anInt8352 = 48;
        anInt8340++;
        return 0xff & i;
    }

    void method186(int i, int i_3_, byte i_4_, int i_5_, int i_6_) {
        this.aClass105_8350.method972(i_5_, i, i_6_, i_3_);
        anInt8341++;
        if (i_4_ <= 21) method8((byte) 68);
    }

    static final boolean method187(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, CollisionMap class361, int i_12_, int i_13_, int i_14_, int i_15_) {
        anInt8348++;
        int i_16_ = i_14_;
        int i_17_ = i_8_;
        int i_18_ = 64;
        int i_19_ = 64;
        int i_20_ = i_14_ + -i_18_;
        r.anIntArrayArray9723[i_18_][i_19_] = 99;
        int i_21_ = -i_19_ + i_8_;
        DisplayModeManagerContainer369.anIntArrayArray2900[i_18_][i_19_] = 0;
        int i_22_ = 0;
        int i_23_ = 0;
        OpenGlShader.anIntArray7397[i_22_] = i_16_;
        Component275.anIntArray2694[i_22_++] = i_17_;
        int[][] is = class361.collisionFlags;
        while (i_22_ != i_23_) {
            i_17_ = Component275.anIntArray2694[i_23_];
            i_16_ = OpenGlShader.anIntArray7397[i_23_];
            int i_24_ = -class361.offsetY + i_17_;
            i_18_ = -i_20_ + i_16_;
            i_19_ = i_17_ - i_21_;
            int i_25_ = i_16_ + -class361.offsetX;
            i_23_ = 0xfff & 1 + i_23_;
            int i_26_ = i_12_;
            while_3_:
            do {
                while_2_:
                do {
                    while_1_:
                    do {
                        while_0_:
                        do {
                            do {
                                if (i_26_ == -4) {
                                    if (i_16_ == i && (i_17_ == i_7_)) {
                                        DefinitionSub30.anInt9388 = i_16_;
                                        Component95.anInt1753 = i_17_;
                                        return true;
                                    }
                                    break while_3_;
                                } else if (i_26_ != -3) {
                                    if (i_26_ != -2) {
                                        if (i_26_ != -1) {
                                            if (i_26_ == 0 || (i_26_ == 1) || (i_26_ == 2) || (i_26_ == 3) || i_26_ == 9) break while_1_;
                                            break while_2_;
                                        }
                                    } else break;
                                    break while_0_;
                                }
                                if (Component188.method1842(i_11_, i_7_, -1, 1, i_16_, i_17_, i, 1, i_13_)) {
                                    Component95.anInt1753 = i_17_;
                                    DefinitionSub30.anInt9388 = i_16_;
                                    return true;
                                }
                                break while_3_;
                            } while (false);
                            if (class361.method3497(-28388, i, i_10_, 1, i_13_, i_16_, 1, i_17_, i_7_, i_11_)) {
                                Component95.anInt1753 = i_17_;
                                DefinitionSub30.anInt9388 = i_16_;
                                return true;
                            }
                            break while_3_;
                        } while (false);
                        if (class361.method3503(i_16_, (byte) 110, i_7_, 1, i_13_, i_11_, i_10_, i_17_, i)) {
                            DefinitionSub30.anInt9388 = i_16_;
                            Component95.anInt1753 = i_17_;
                            return true;
                        }
                        break while_3_;
                    } while (false);
                    if (class361.reachedWall(i, i_17_, 1, i_9_, i_16_, i_7_, i_12_, 91)) {
                        Component95.anInt1753 = i_17_;
                        DefinitionSub30.anInt9388 = i_16_;
                        return true;
                    }
                    break while_3_;
                } while (false);
                if (class361.method3504(i_7_, i_17_, i, i_16_, i_12_, 1, i_9_, 1)) {
                    DefinitionSub30.anInt9388 = i_16_;
                    Component95.anInt1753 = i_17_;
                    return true;
                }
            } while (false);
            i_26_ = 1 + DisplayModeManagerContainer369.anIntArrayArray2900[i_18_][i_19_];
            if (i_18_ > 0 && (r.anIntArrayArray9723[i_18_ + -1][i_19_] == 0) && (is[-1 + i_25_][i_24_] & 0x42240000) == 0) {
                OpenGlShader.anIntArray7397[i_22_] = -1 + i_16_;
                Component275.anIntArray2694[i_22_] = i_17_;
                i_22_ = 0xfff & i_22_ - -1;
                r.anIntArrayArray9723[i_18_ + -1][i_19_] = 2;
                DisplayModeManagerContainer369.anIntArrayArray2900[-1 + i_18_][i_19_] = i_26_;
            }
            if (i_18_ < 127 && r.anIntArrayArray9723[1 + i_18_][i_19_] == 0 && (0x60240000 & is[1 + i_25_][i_24_]) == 0) {
                OpenGlShader.anIntArray7397[i_22_] = i_16_ + 1;
                Component275.anIntArray2694[i_22_] = i_17_;
                r.anIntArrayArray9723[1 + i_18_][i_19_] = 8;
                i_22_ = 0xfff & i_22_ - -1;
                DisplayModeManagerContainer369.anIntArrayArray2900[1 + i_18_][i_19_] = i_26_;
            }
            if (i_19_ > 0 && (r.anIntArrayArray9723[i_18_][i_19_ + -1] == 0) && (is[i_25_][i_24_ - 1] & 0x40a40000) == 0) {
                OpenGlShader.anIntArray7397[i_22_] = i_16_;
                Component275.anIntArray2694[i_22_] = -1 + i_17_;
                r.anIntArrayArray9723[i_18_][-1 + i_19_] = 1;
                i_22_ = 0xfff & 1 + i_22_;
                DisplayModeManagerContainer369.anIntArrayArray2900[i_18_][-1 + i_19_] = i_26_;
            }
            if (i_19_ < 127 && r.anIntArrayArray9723[i_18_][1 + i_19_] == 0 && (0x48240000 & is[i_25_][i_24_ - -1]) == 0) {
                OpenGlShader.anIntArray7397[i_22_] = i_16_;
                Component275.anIntArray2694[i_22_] = i_17_ + 1;
                r.anIntArrayArray9723[i_18_][i_19_ - -1] = 4;
                i_22_ = 0xfff & i_22_ + 1;
                DisplayModeManagerContainer369.anIntArrayArray2900[i_18_][i_19_ + 1] = i_26_;
            }
            if (i_18_ > 0 && i_19_ > 0 && r.anIntArrayArray9723[-1 + i_18_][i_19_ + -1] == 0 && (is[-1 + i_25_][i_24_ - 1] & 0x43a40000) == 0 && (is[-1 + i_25_][i_24_] & 0x42240000) == 0 && (0x40a40000 & is[i_25_][i_24_ - 1]) == 0) {
                OpenGlShader.anIntArray7397[i_22_] = -1 + i_16_;
                Component275.anIntArray2694[i_22_] = i_17_ - 1;
                i_22_ = 1 + i_22_ & 0xfff;
                r.anIntArrayArray9723[i_18_ + -1][-1 + i_19_] = 3;
                DisplayModeManagerContainer369.anIntArrayArray2900[i_18_ + -1][-1 + i_19_] = i_26_;
            }
            if (i_18_ < 127 && i_19_ > 0 && (r.anIntArrayArray9723[i_18_ + 1][i_19_ - 1] == 0) && (0x60e40000 & is[i_25_ - -1][i_24_ + -1]) == 0 && (is[1 + i_25_][i_24_] & 0x60240000) == 0 && (is[i_25_][-1 + i_24_] & 0x40a40000) == 0) {
                OpenGlShader.anIntArray7397[i_22_] = i_16_ + 1;
                Component275.anIntArray2694[i_22_] = i_17_ - 1;
                i_22_ = 0xfff & 1 + i_22_;
                r.anIntArrayArray9723[1 + i_18_][-1 + i_19_] = 9;
                DisplayModeManagerContainer369.anIntArrayArray2900[1 + i_18_][i_19_ + -1] = i_26_;
            }
            if (i_18_ > 0 && i_19_ < 127 && r.anIntArrayArray9723[-1 + i_18_][i_19_ - -1] == 0 && (is[i_25_ + -1][i_24_ - -1] & 0x4e240000) == 0 && (0x42240000 & is[i_25_ - 1][i_24_]) == 0 && (0x48240000 & is[i_25_][1 + i_24_]) == 0) {
                OpenGlShader.anIntArray7397[i_22_] = i_16_ - 1;
                Component275.anIntArray2694[i_22_] = i_17_ + 1;
                r.anIntArrayArray9723[i_18_ + -1][i_19_ - -1] = 6;
                i_22_ = 1 + i_22_ & 0xfff;
                DisplayModeManagerContainer369.anIntArrayArray2900[-1 + i_18_][1 + i_19_] = i_26_;
            }
            if (i_18_ < 127 && i_19_ < 127 && (r.anIntArrayArray9723[1 + i_18_][1 + i_19_] == 0) && (0x78240000 & is[i_25_ - -1][1 + i_24_]) == 0 && (0x60240000 & is[1 + i_25_][i_24_]) == 0 && (0x48240000 & is[i_25_][i_24_ - -1]) == 0) {
                OpenGlShader.anIntArray7397[i_22_] = i_16_ - -1;
                Component275.anIntArray2694[i_22_] = 1 + i_17_;
                r.anIntArrayArray9723[1 + i_18_][i_19_ + 1] = 12;
                i_22_ = 0xfff & 1 + i_22_;
                DisplayModeManagerContainer369.anIntArrayArray2900[1 + i_18_][1 + i_19_] = i_26_;
            }
        }
        if (i_15_ != 1109655552) aBoolean8335 = false;
        DefinitionSub30.anInt9388 = i_16_;
        Component95.anInt1753 = i_17_;
        return false;
    }

    final void method178(int i, boolean bool, byte i_27_, int i_28_) {
        if (bool) {
            int[] is = new int[4];
            NodeSub8.toolkit.K(is);
            NodeSub8.toolkit.KA(i, i_28_, i - -this.aClass369_4635.anInt4971, (i_28_ + this.aClass369_4635.anInt4963));
            int i_29_ = aClass105_8342.method966();
            int i_30_ = aClass105_8342.method980();
            int i_31_ = aClass105_8339.method966();
            int i_32_ = aClass105_8339.method980();
            aClass105_8342.drawAt(i, i_28_ - -(((this.aClass369_4635.anInt4963) + -i_30_) / 2));
            aClass105_8339.drawAt((this.aClass369_4635.anInt4971 + (i + -i_31_)), i_28_ + (this.aClass369_4635.anInt4963 + -i_32_) / 2);
            NodeSub8.toolkit.KA(i, i_28_, (this.aClass369_4635.anInt4971 + i), i_28_ - -aClass105_8343.method980());
            aClass105_8343.method972(i + i_29_, i_28_, -i_29_ + (this.aClass369_4635.anInt4971) - i_31_, this.aClass369_4635.anInt4963);
            int i_33_ = aClass105_8338.method980();
            NodeSub8.toolkit.KA(i, (-i_33_ + i_28_ - -this.aClass369_4635.anInt4963), this.aClass369_4635.anInt4971 + i, (i_28_ + this.aClass369_4635.anInt4963));
            aClass105_8338.method972(i_29_ + i, (-i_33_ + i_28_ + this.aClass369_4635.anInt4963), (-i_29_ + this.aClass369_4635.anInt4971 + -i_31_), this.aClass369_4635.anInt4963);
            NodeSub8.toolkit.KA(is[0], is[1], is[2], is[3]);
        }
        anInt8334++;
        if (i_27_ > -6) aClass105_8347 = null;
    }

    static final Component336[] method188(byte i) {
        anInt8345++;
        int i_34_ = -7 / ((-67 - i) / 44);
        return (new Component336[]{DisplayModeManagerContainer109.aClass29_2339, DisplayModeManagerContainer109.aClass29_2341, DisplayModeManagerContainer109.aClass29_2342, DisplayModeManagerContainer109.aClass29_2343, DisplayModeManagerContainer109.aClass29_2344, DisplayModeManagerContainer109.aClass29_2345, DisplayModeManagerContainer109.aClass29_2346, DisplayModeManagerContainer109.aClass29_2347, DisplayModeManagerContainer109.aClass29_2348, DisplayModeManagerContainer109.aClass29_2349, DisplayModeManagerContainer109.aClass29_2350, DisplayModeManagerContainer109.aClass29_2351, DisplayModeManagerContainer109.aClass29_2352, DisplayModeManagerContainer109.aClass29_2353});
    }

    public static void method189(byte i) {
        if (i < 112) anInt8352 = -87;
        aClass221_8344 = null;
    }

    final void method182(int i, int i_35_, int i_36_, boolean bool) {
        int i_37_ = -45 / ((-20 - i) / 57);
        anInt8336++;
        int i_38_ = aClass105_8342.method966() + i_36_;
        int i_39_ = (this.aClass369_4635.anInt4971 + (i_36_ + -aClass105_8339.method966()));
        int i_40_ = i_35_ - -aClass105_8343.method980();
        int i_41_ = (i_35_ + this.aClass369_4635.anInt4963 - aClass105_8338.method980());
        int i_42_ = -i_38_ + i_39_;
        int i_43_ = -i_40_ + i_41_;
        int i_44_ = this.method183(124) * i_42_ / 10000;
        int[] is = new int[4];
        NodeSub8.toolkit.K(is);
        NodeSub8.toolkit.KA(i_38_, i_40_, i_44_ + i_38_, i_41_);
        method186(i_40_, i_43_, (byte) 33, i_38_, i_42_);
        NodeSub8.toolkit.KA(i_44_ + i_38_, i_40_, i_39_, i_41_);
        aClass105_8347.method972(i_38_, i_40_, i_42_, i_43_);
        NodeSub8.toolkit.KA(is[0], is[1], is[2], is[3]);
    }

    public final void method7(int i) {
        super.method7(i);
        anInt8337++;
        Component76 class369_sub3 = (Component76) this.aClass369_4635;
        this.aClass105_8350 = DummyClass.method3577((class369_sub3.anInt8599), (byte) -19, this.aClass45_4632);
        aClass105_8347 = DummyClass.method3577((class369_sub3.anInt8595), (byte) 106, this.aClass45_4632);
        aClass105_8342 = DummyClass.method3577((class369_sub3.anInt8603), (byte) -19, this.aClass45_4632);
        aClass105_8339 = DummyClass.method3577((class369_sub3.anInt8602), (byte) -121, this.aClass45_4632);
        aClass105_8343 = DummyClass.method3577((class369_sub3.anInt8600), (byte) 124, this.aClass45_4632);
        aClass105_8338 = DummyClass.method3577((class369_sub3.anInt8597), (byte) 115, this.aClass45_4632);
    }

    static {
        aClass221_8344 = new Component85();
    }
}
