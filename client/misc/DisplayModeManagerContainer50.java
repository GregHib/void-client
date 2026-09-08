/* DisplayModeManagerContainer50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class DisplayModeManagerContainer50
/**
 * RENAMED from `Class305` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    private int anInt3852;
    private int anInt3853;
    private final int anInt3854;
    static int anInt3855;
    static int anInt3856;
    private boolean aBoolean3857 = true;
    private final int anInt3858;
    private int anInt3859 = -1;
    static int anInt3860;
    static int anInt3861;
    private final DisplayModeManagerContainer365[] aClass72Array3862;
    private int anInt3863;
    static int anInt3864;
    private final DisplayModeManagerContainer365[] aClass72Array3865;
    private final int anInt3866;
    private Component24 aClass105_3867;
    static int anInt3868;
    /** AWT / voidawt canvas the game paints to and receives mouse/key on. */
    static Canvas gameCanvas;
    static boolean aBoolean3870 = false;
    private final DisplayModeManagerContainer365 aClass72_3871;

    final boolean method2292(int i, GraphicsToolkit var_ha, int i_0_) {
        if (anInt3859 != i_0_) {
            anInt3859 = i_0_;
            int i_1_ = PrimitiveTypeDefinition.method3051(i_0_, 4096);
            if (i_1_ > 512) i_1_ = 512;
            if (i_1_ <= 0) i_1_ = 1;
            if (i_1_ != anInt3863) {
                aClass105_3867 = null;
                anInt3863 = i_1_;
            }
            if (aClass72Array3862 != null) {
                anInt3852 = 0;
                int[] is = new int[aClass72Array3862.length];
                for (int i_2_ = 0; aClass72Array3862.length > i_2_; i_2_++) {
                    DisplayModeManagerContainer365 class72 = aClass72Array3862[i_2_];
                    if (class72.method733(anInt3866, anInt3854, anInt3853, anInt3859)) {
                        is[anInt3852] = class72.anInt1232;
                        aClass72Array3865[anInt3852++] = class72;
                    }
                }
                AudioLine.method2092(-1 + anInt3852, 0, is, -120, aClass72Array3865);
            }
            aBoolean3857 = true;
        }
        anInt3856++;
        if (i <= 27) anInt3853 = -98;
        boolean bool = false;
        if (aBoolean3857) {
            aBoolean3857 = false;
            for (int i_3_ = -1 + anInt3852; i_3_ >= 0; i_3_--) {
                boolean bool_4_ = aClass72Array3865[i_3_].method736(var_ha, aClass72_3871);
                bool |= bool_4_;
                DisplayModeManagerContainer50 class305_5_ = this;
                class305_5_.aBoolean3857 = class305_5_.aBoolean3857 | !bool_4_;
            }
        }
        return bool;
    }

    final void method2293(int i, GraphicsToolkit var_ha, byte i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
        i_10_ = 0x3fff & i + i_10_;
        anInt3860++;
        if (anInt3858 != -1 && anInt3863 != 0) {
            Model class12 = MatrixSub1.modelProvider.getModel(anInt3858, -6662);
            if (aClass105_3867 == null && MatrixSub1.modelProvider.isModelLoaded(-7953, anInt3858)) {
                int[] is = (class12.anInt200 == 2 ? MatrixSub1.modelProvider.getIndices(-21540, anInt3863, 0.7F, anInt3858, false, anInt3863) : MatrixSub1.modelProvider.getTriangles(false, anInt3858, 0.7F, anInt3863, anInt3863, -119));
                aClass105_3867 = var_ha.method3662(anInt3863, is, (byte) 94, 0, anInt3863, anInt3863);
            }
            if (class12.anInt200 == 2) var_ha.fillRect2D(i_7_, i_9_, i_8_, i_13_, i_12_, 0);
            if (aClass105_3867 != null) {
                int i_14_ = class12.anInt200 == 2 ? 1 : 0;
                int i_15_ = i_13_ * i_11_ / -4096;
                int i_16_;
                for (i_16_ = (-i_13_ + i_8_) / 2 + i_13_ * i_10_ / 4096; i_13_ < i_16_; i_16_ -= i_13_) {
                    /* empty */
                }
                for (/**/; i_16_ < 0; i_16_ += i_13_) {
                    /* empty */
                }
                for (/**/; i_13_ < i_15_; i_15_ -= i_13_) {
                    /* empty */
                }
                for (/**/; i_15_ < 0; i_15_ += i_13_) {
                    /* empty */
                }
                for (int i_17_ = -i_13_ + i_16_; i_8_ > i_17_; i_17_ += i_13_) {
                    for (int i_18_ = i_15_ + -i_13_; i_18_ < i_13_; i_18_ += i_13_)
                        aClass105_3867.method970(i_7_ + i_17_, i_18_ + i_9_, i_13_, i_13_, 1, 0, i_14_);
                }
            }
        } else var_ha.fillRect2D(i_7_, i_9_, i_8_, i_13_, i_12_, 0);
        for (int i_19_ = -1 + anInt3852; i_19_ >= 0; i_19_--)
            aClass72Array3865[i_19_].method737(var_ha, i_7_, i_9_, i_8_, i_13_, i_11_, i_10_);
        int i_20_ = 103 % ((i_6_ - 14) / 32);
    }

    public static void method2294(int i) {
        gameCanvas = null;
        if (i <= 94) method2296(-107);
    }

    final void method2295(byte i) {
        anInt3864++;
        if (aClass72Array3862 != null) {
            for (int i_21_ = 0; aClass72Array3862.length > i_21_; i_21_++)
                aClass72Array3862[i_21_].method734();
        }
        aClass105_3867 = null;
        if (i != 96) method2292(-84, null, 73);
    }

    static final void method2296(int i) {
        anInt3868++;
        if (i < -46) {
            for (int i_22_ = 0; i_22_ < 100; i_22_++)
                RenderableSub2.aClass147Array6400[i_22_] = null;
            NodeBaseSub1.anInt9774 = 0;
        }
    }

    DisplayModeManagerContainer50(int i, DisplayModeManagerContainer365[] class72s, int i_23_, int i_24_, int i_25_, int i_26_) {
        anInt3853 = i_26_;
        anInt3858 = i;
        aClass72Array3862 = class72s;
        anInt3854 = i_25_;
        anInt3866 = i_24_;
        if (class72s == null) {
            aClass72Array3865 = null;
            aClass72_3871 = null;
        } else {
            aClass72Array3865 = new DisplayModeManagerContainer365[class72s.length];
            aClass72_3871 = i_23_ < 0 ? null : class72s[i_23_];
        }
    }
}
