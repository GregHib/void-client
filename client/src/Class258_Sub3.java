/* Class258_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.awt.*;
import java.awt.image.PixelGrabber;

class Class258_Sub3 extends Class258 {
    static int anInt8539;
    static int anInt8540;
    static int anInt8541;
    static int anInt8542;
    static int anInt8543;
    static int anInt8544;
    private int anInt8545;
    static int anInt8546;
    int anInt8547;
    static int anInt8548;
    private int anInt8549 = -1;
    static int anInt8550 = 0;
    int anInt8551;

    Class258_Sub3(ha_Sub2 var_ha_Sub2, int i, int i_0_, int i_1_, int i_2_) {
        super(var_ha_Sub2, i, i_0_, i_1_ * i_2_, false);
        anInt8545 = -1;
        this.anInt8547 = i_1_;
        this.anInt8551 = i_2_;
        this.aHa_Sub2_4851.method3771((byte) -111, this);
        OpenGL.glTexImage2Dub(this.anInt4849, 0, this.anInt4858, i_1_, i_2_, 0, Class348_Sub9.method2779(true, (this.anInt4858)), 5121, null, 0);
        this.method1957(9728, true);
    }

    final void method1963(int i, int i_3_, int i_4_, int i_5_) {
        anInt8541++;
        if (i_4_ != 0) anInt8550 = -125;
        OpenGL.glFramebufferTexture2DEXT(i, i_5_, this.anInt4849, this.anInt4859, i_3_);
        anInt8549 = i;
        anInt8545 = i_5_;
    }

    Class258_Sub3(ha_Sub2 var_ha_Sub2, int i, int i_6_, int i_7_, int i_8_, boolean bool, float[] fs, int i_9_) {
        super(var_ha_Sub2, i, i_6_, i_8_ * i_7_, bool);
        anInt8545 = -1;
        try {
            this.anInt8547 = i_7_;
            this.anInt8551 = i_8_;
            this.aHa_Sub2_4851.method3771((byte) -91, this);
            if (bool && this.anInt4849 != 34037) {
                Class59_Sub1.method551(i_7_, i_9_, i, fs, 0, i_8_, i_6_);
                this.method1955(true, (byte) -123);
            } else {
                OpenGL.glTexImage2Df(this.anInt4849, 0, this.anInt4858, this.anInt8547, this.anInt8551, 0, i_9_, 5126, fs, 0);
                this.method1955(false, (byte) -123);
            }
            this.method1957(9728, true);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("tp.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + (fs != null ? "{...}" : "null") + ',' + i_9_ + ')'));
        }
    }

    final void method1964(boolean bool, int i, int i_10_, int[] is, int i_11_, byte i_12_, int i_13_, int i_14_, int i_15_) {
        anInt8543++;
        if (i_15_ == 0) i_15_ = i_13_;
        if (bool) {
            int[] is_16_ = new int[i_13_ * i];
            for (int i_17_ = 0; i_17_ < i; i_17_++) {
                int i_18_ = i_13_ * i_17_;
                int i_19_ = (-1 + i - i_17_) * i_15_ + i_11_;
                for (int i_20_ = 0; i_20_ < i_13_; i_20_++)
                    is_16_[i_18_++] = is[i_19_++];
            }
            is = is_16_;
        }
        this.aHa_Sub2_4851.method3771((byte) -80, this);
        if (i_13_ != i_15_) OpenGL.glPixelStorei(3314, i_15_);
        OpenGL.glTexSubImage2Di(this.anInt4849, 0, i_14_, i_10_, i_13_, i, 32993, (this.aHa_Sub2_4851.anInt7812), is, i_11_);
        if (i_13_ != i_15_) OpenGL.glPixelStorei(3314, 0);
        if (i_12_ > -65) this.anInt8547 = 101;
    }

    Class258_Sub3(ha_Sub2 var_ha_Sub2, int i, int i_21_, int i_22_, int i_23_, boolean bool, int[] is, int i_24_, int i_25_, boolean bool_26_) {
        super(var_ha_Sub2, i, i_21_, i_23_ * i_22_, bool);
        anInt8545 = -1;
        try {
            this.anInt8547 = i_22_;
            this.anInt8551 = i_23_;
            if (bool_26_) {
                int[] is_27_ = new int[is.length];
                for (int i_28_ = 0; i_23_ > i_28_; i_28_++) {
                    int i_29_ = i_28_ * i_22_;
                    int i_30_ = i_22_ * (-1 + -i_28_ + i_23_);
                    for (int i_31_ = 0; i_31_ < i_22_; i_31_++)
                        is_27_[i_29_++] = is[i_30_++];
                }
                is = is_27_;
            }
            this.aHa_Sub2_4851.method3771((byte) -79, this);
            if (this.anInt4849 == 34037 || !bool || i_24_ != 0 || i_25_ != 0) {
                OpenGL.glPixelStorei(3314, i_24_);
                OpenGL.glTexImage2Di(this.anInt4849, 0, this.anInt4858, this.anInt8547, this.anInt8551, 0, 32993, this.aHa_Sub2_4851.anInt7812, is, 4 * i_25_);
                OpenGL.glPixelStorei(3314, 0);
                this.method1955(false, (byte) -123);
            } else {
                Class353.method3460(this.anInt4849, this.anInt4858, this.anInt8551, this.aHa_Sub2_4851.anInt7812, this.anInt8547, is, 32993, -103);
                this.method1955(true, (byte) -123);
            }
            this.method1957(9728, true);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("tp.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_24_ + ',' + i_25_ + ',' + bool_26_ + ')'));
        }
    }

    Class258_Sub3(ha_Sub2 var_ha_Sub2, int i, int i_32_, int i_33_, int i_34_, boolean bool, byte[] is, int i_35_, boolean bool_36_) {
        super(var_ha_Sub2, i, i_32_, i_33_ * i_34_, bool);
        anInt8545 = -1;
        try {
            this.anInt8547 = i_33_;
            this.anInt8551 = i_34_;
            if (bool_36_) {
                byte[] is_37_ = new byte[is.length];
                for (int i_38_ = 0; i_34_ > i_38_; i_38_++) {
                    int i_39_ = i_33_ * i_38_;
                    int i_40_ = i_33_ * (-i_38_ + (i_34_ + -1));
                    for (int i_41_ = 0; i_33_ > i_41_; i_41_++)
                        is_37_[i_39_++] = is[i_40_++];
                }
                is = is_37_;
            }
            this.aHa_Sub2_4851.method3771((byte) -84, this);
            OpenGL.glPixelStorei(3317, 1);
            if (!bool || this.anInt4849 == 34037) {
                OpenGL.glTexImage2Dub(this.anInt4849, 0, this.anInt4858, this.anInt8547, this.anInt8551, 0, i_35_, 5121, is, 0);
                this.method1955(false, (byte) -123);
            } else {
                Class186_Sub1.method1403(i_34_, i_33_, is, false, i_35_, i, i_32_);
                this.method1955(true, (byte) -123);
            }
            OpenGL.glPixelStorei(3317, 4);
            this.method1957(9728, true);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("tp.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + bool + ',' + (is != null ? "{...}" : "null") + ',' + i_35_ + ',' + bool_36_ + ')'));
        }
    }

    final void method1965(boolean bool, boolean bool_42_, int i) {
        anInt8540++;
        if (i != 10243) method1966(-20, 83, 1, -22, (byte) -31, 74, -57, 109, -102);
        if (this.anInt4849 == 3553) {
            this.aHa_Sub2_4851.method3771((byte) -102, this);
            OpenGL.glTexParameteri(this.anInt4849, 10242, bool_42_ ? 10497 : 33071);
            OpenGL.glTexParameteri(this.anInt4849, 10243, !bool ? 33071 : 10497);
        }
    }

    static final void method1966(int i, int i_43_, int i_44_, int i_45_, byte i_46_, int i_47_, int i_48_, int i_49_, int i_50_) {
        Class147.aClass338Array2034[Class239_Sub26.anInt6115++] = new Class338(i_47_, i_49_, i_50_, i, i, i_50_, i_45_, i_43_, i_43_, i_45_, i_44_, i_44_, i_48_, i_48_);
        anInt8548++;
        if (i_46_ != 0) method1968();
    }

    final void method1967(int i, int i_51_, int i_52_, int i_53_, int i_54_, byte i_55_, int i_56_) {
        anInt8544++;
        int i_57_ = (this.aHa_Sub2_4851.anInt7641 + (-i_52_ - i_51_));
        this.aHa_Sub2_4851.method3771((byte) -100, this);
        OpenGL.glCopyTexSubImage2D(this.anInt4849, 0, i, -i_51_ - (i_53_ - (this.anInt8551)), i_54_, i_57_, i_56_, i_51_);
        if (i_55_ != -120) method1965(true, true, -57);
        OpenGL.glFlush();
    }

    static final void method1968() {
        za.method3437(1, Class189.anInt2524);
    }

    public final void method37(int i) {
        if (i != -3022) this.anInt8547 = 75;
        OpenGL.glFramebufferTexture2DEXT(anInt8549, anInt8545, this.anInt4849, 0, 0);
        anInt8542++;
        anInt8545 = -1;
        anInt8549 = -1;
    }

    static final Sprite method1969(byte[] is, int i) {
        anInt8546++;
        if (i != -5901) anInt8550 = 83;
        if (is == null) throw new RuntimeException("");
        for (; ; ) {
            try {
                Image image = Toolkit.getDefaultToolkit().createImage(is);
                MediaTracker mediatracker = new MediaTracker(NPCDefinition.aClient1367);
                mediatracker.addImage(image, 0);
                mediatracker.waitForAll();
                int i_58_ = image.getWidth(NPCDefinition.aClient1367);
                int i_59_ = image.getHeight(NPCDefinition.aClient1367);
                if (mediatracker.isErrorAny() || i_58_ < 0 || i_59_ < 0) throw new RuntimeException("");
                int[] is_60_ = new int[i_59_ * i_58_];
                PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_58_, i_59_, is_60_, 0, i_58_);
                pixelgrabber.grabPixels();
                return Class348_Sub8.aHa6654.method3662(i_58_, is_60_, (byte) 94, 0, i_58_, i_59_);
            } catch (InterruptedException interruptedexception) {
                /* empty */
            }
        }
    }

    final void method1970(int i, int i_61_, int i_62_, boolean bool, int i_63_, int i_64_, int i_65_, int i_66_, byte[] is, int i_67_) {
        if (i_63_ == 0) i_63_ = i_62_;
        anInt8539++;
        if (bool) {
            int i_68_ = Class183.method1382(i_65_, -6409);
            int i_69_ = i_68_ * i_62_;
            int i_70_ = i_63_ * i_68_;
            byte[] is_71_ = new byte[i_64_ * i_69_];
            for (int i_72_ = 0; i_64_ > i_72_; i_72_++) {
                int i_73_ = i_69_ * i_72_;
                int i_74_ = (-1 + i_64_ - i_72_) * i_70_ + i_67_;
                for (int i_75_ = 0; i_75_ < i_69_; i_75_++)
                    is_71_[i_73_++] = is[i_74_++];
            }
            is = is_71_;
        }
        this.aHa_Sub2_4851.method3771((byte) -102, this);
        OpenGL.glPixelStorei(3317, 1);
        if (i_62_ != i_63_) OpenGL.glPixelStorei(3314, i_63_);
        OpenGL.glTexSubImage2Dub(this.anInt4849, 0, i, i_61_, i_62_, i_64_, i_65_, 5121, is, i_67_);
        if (i_63_ != i_62_) OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
        int i_76_ = -17 % ((46 - i_66_) / 59);
    }

    Class258_Sub3(ha_Sub2 var_ha_Sub2, int i, int i_77_, int i_78_, int i_79_, int i_80_) {
        super(var_ha_Sub2, i, 6407, i_80_ * i_79_, false);
        anInt8545 = -1;
        this.anInt8547 = i_79_;
        this.anInt8551 = i_80_;
        int i_81_ = (this.aHa_Sub2_4851.anInt7641 + (-i_78_ + -i_80_));
        this.aHa_Sub2_4851.method3771((byte) -111, this);
        OpenGL.glCopyTexImage2D(this.anInt4849, 0, this.anInt4858, i_77_, i_81_, i_79_, i_80_, 0);
        this.method1957(9728, true);
    }
}
