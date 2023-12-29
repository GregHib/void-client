/* ha_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

import java.awt.*;
import java.util.Enumeration;
import java.util.Hashtable;

final class ha_Sub2 extends ha {
    static int anInt7514;
    static int anInt7515;
    static int anInt7516;
    static int anInt7517;
    static int anInt7518;
    static int anInt7519;
    static int anInt7520;
    static int anInt7521;
    static int anInt7522;
    private int anInt7523;
    static int anInt7524;
    static int anInt7525;
    static int anInt7526;
    static int anInt7527;
    static int anInt7528;
    static int anInt7529;
    static int anInt7530;
    static int anInt7531;
    static int anInt7532;
    static int anInt7533;
    static int anInt7534;
    static int anInt7535;
    static int anInt7536;
    static int anInt7537;
    static int anInt7538;
    static int anInt7539;
    static int anInt7540;
    static int anInt7541;
    static int anInt7542;
    static int anInt7543;
    static int anInt7544;
    static int anInt7545;
    static int anInt7546;
    static int anInt7547;
    static int anInt7548;
    static int anInt7549;
    static int anInt7550;
    static int anInt7551;
    static int anInt7552;
    private final long aLong7553;
    static Class351 aClass351_7554;
    static int anInt7555;
    static int anInt7556;
    static int anInt7557;
    static int anInt7558;
    static int anInt7559;
    static int anInt7560;
    static int anInt7561;
    static int anInt7562;
    static int anInt7563;
    static int anInt7564;
    static int anInt7565;
    static int anInt7566;
    static int anInt7567;
    static int anInt7568;
    static int anInt7569;
    static int anInt7570;
    static int anInt7571;
    static int anInt7572;
    static int anInt7573;
    static int anInt7574;
    private Canvas aCanvas7575;
    static int anInt7576;
    private final Hashtable aHashtable7577 = new Hashtable();
    static int anInt7578;
    static int anInt7579;
    static int anInt7580;
    static int anInt7581;
    static int anInt7582;
    static int anInt7583;
    static int anInt7584;
    static int anInt7585;
    static int anInt7586;
    static int anInt7587;
    static int anInt7588;
    static int anInt7589;
    static int anInt7590;
    static int anInt7591;
    static int anInt7592;
    static int anInt7593;
    static int anInt7594;
    static int anInt7595;
    static int anInt7596;
    static int anInt7597;
    static int anInt7598;
    static int anInt7599;
    static int anInt7600;
    static int anInt7601;
    static int anInt7602;
    static int anInt7603;
    static int anInt7604;
    static int anInt7605;
    static int anInt7606;
    static int anInt7607;
    static int anInt7608;
    static int anInt7609;
    static int anInt7610;
    static int anInt7611;
    static int anInt7612;
    static int anInt7613;
    static int anInt7614;
    static int anInt7615;
    static int anInt7616;
    static int anInt7617;
    static int anInt7618;
    static int anInt7619;
    static int anInt7620;
    static int anInt7621;
    static int anInt7622;
    static int anInt7623;
    static int anInt7624;
    static int anInt7625;
    private Canvas aCanvas7626;
    static int anInt7627;
    static int anInt7628;
    static int anInt7629;
    static int anInt7630;
    static int anInt7631;
    static int anInt7632;
    static int anInt7633;
    static int anInt7634;
    static int anInt7635;
    private long aLong7636;
    static int anInt7637;
    static int anInt7638;
    static int anInt7639;
    static int anInt7640;
    int anInt7641;
    static int anInt7642;
    static int anInt7643;
    static int anInt7644;
    private int anInt7645;
    static int anInt7646;
    static int anInt7647;
    static int anInt7648;
    static int anInt7649;
    static int anInt7650;
    static int anInt7651;
    static int anInt7652;
    static int anInt7653;
    static int anInt7654;
    static int anInt7655;
    static int anInt7656;
    static int anInt7657;
    static int anInt7658;
    static int anInt7659;
    static int anInt7660;
    static int anInt7661;
    static int anInt7662;
    static int anInt7663;
    private OpenGL anOpenGL7664;
    static int anInt7665;
    static int anInt7666 = 503;
    static int anInt7667;
    static int anInt7668;
    static int anInt7669;
    static int anInt7670;
    static int anInt7671;
    static int anInt7672;
    static int anInt7673;
    static int anInt7674;
    static int anInt7675;
    static int anInt7676;
    static int anInt7677;
    static int anInt7678;
    static int anInt7679;
    static int anInt7680;
    static int anInt7681;
    static int anInt7682;
    static int anInt7683;
    static int anInt7684;
    static int anInt7685;
    static int anInt7686;
    static int anInt7687;
    int anInt7688;
    static int anInt7689;
    static int anInt7690;
    static int anInt7691;
    static int anInt7692;
    static int anInt7693;
    static int anInt7694;
    static int anInt7695;
    static int anInt7696;
    static int anInt7697;
    static int anInt7698;
    static int anInt7699;
    static int anInt7700;
    static int anInt7701;
    static int anInt7702;
    static int anInt7703;
    static int anInt7704;
    static int anInt7705;
    static int anInt7706;
    private Class100 aClass100_7707;
    static int anInt7708;
    static int anInt7709;
    static int anInt7710;
    private final Class233 aClass233_7711;
    int anInt7712 = 128;
    int anInt7713;
    static int anInt7714;
    static Class351 aClass351_7715;
    static int anInt7716;
    static int anInt7717;
    static int anInt7718;
    static int anInt7719;
    private final Class18 aClass18_7720;
    private Class348_Sub5_Sub1 aClass348_Sub5_Sub1_7721;
    static int anInt7722;
    private final Class354 aClass354_7723;
    static int anInt7724;
    private final Class101_Sub3 aClass101_Sub3_7725;
    static int anInt7726;
    static int anInt7727;
    static int anInt7728;
    Class101_Sub3 aClass101_Sub3_7729;
    NativeHeap aNativeHeap7730;
    int anInt7731;
    private final Class262 aClass262_7732;
    int anInt7733;
    private boolean aBoolean7734;
    int anInt7735;
    Class188 aClass188_7736;
    private final Interface11[] anInterface11Array7737;
    private int anInt7738;
    private Class206 aClass206_7739;
    private Interface11 anInterface11_7740;
    private final Interface11[] anInterface11Array7741;
    private int anInt7742;
    private final Interface11[] anInterface11Array7743;
    private Sprite_Sub2 aClass105_Sub2_7744;
    private Interface11 anInterface11_7745;
    private int anInt7746;
    int anInt7747;
    int anInt7748;
    private final Class262 aClass262_7749;
    private int anInt7750;
    private Class262 aClass262_7751;
    private final Class262 aClass262_7752;
    private final Class262 aClass262_7753;
    private final Class262 aClass262_7754;
    private final Class262 aClass262_7755;
    private final Class262 aClass262_7756;
    private long aLong7757;
    private boolean aBoolean7758;
    private boolean aBoolean7759;
    Class101_Sub3 aClass101_Sub3_7760;
    private boolean aBoolean7761;
    private int anInt7762;
    private boolean aBoolean7763;
    private int anInt7764;
    private int anInt7765;
    Class101_Sub3 aClass101_Sub3_7766;
    Class101_Sub3 aClass101_Sub3_7767;
    float aFloat7768;
    private Class299_Sub1 aClass299_Sub1_7769;
    private int anInt7770;
    int anInt7771;
    int anInt7772;
    private int anInt7773;
    private final boolean aBoolean7774;
    boolean aBoolean7775;
    private Class258_Sub3_Sub1 aClass258_Sub3_Sub1_7776;
    int anInt7777;
    Class206 aClass206_7778;
    private final float[] aFloatArray7779;
    Class64_Sub3 aClass64_Sub3_7780;
    float aFloat7781;
    int anInt7782;
    boolean aBoolean7783;
    private boolean aBoolean7784;
    Class64_Sub3 aClass64_Sub3_7785;
    private float aFloat7786;
    private int anInt7787;
    int anInt7788;
    private int anInt7789;
    private String aString7790;
    boolean aBoolean7791;
    float aFloat7792;
    boolean aBoolean7793;
    int anInt7794;
    int anInt7795;
    private int anInt7796;
    private Interface2 anInterface2_7797;
    Class348_Sub49_Sub1 aClass348_Sub49_Sub1_7798;
    private int anInt7799;
    private float aFloat7800;
    private boolean aBoolean7801;
    Class64_Sub3 aClass64_Sub3_7802;
    Class64_Sub3 aClass64_Sub3_7803;
    private int anInt7804;
    private boolean aBoolean7805;
    int anInt7806;
    boolean aBoolean7807;
    private int anInt7808;
    int anInt7809;
    int anInt7810;
    private final float[] aFloatArray7811;
    int anInt7812;
    int anInt7813;
    private int anInt7814;
    boolean aBoolean7815;
    float aFloat7816;
    private Interface8 anInterface8_7817;
    boolean aBoolean7818;
    private int anInt7819;
    boolean aBoolean7820;
    Class64_Sub3 aClass64_Sub3_7821;
    private boolean aBoolean7822;
    float aFloat7823;
    private float aFloat7824;
    float[] aFloatArray7825;
    int anInt7826;
    Class258_Sub3 aClass258_Sub3_7827;
    private Class258[] aClass258Array7828;
    private float aFloat7829;
    float aFloat7830;
    boolean aBoolean7831;
    float aFloat7832;
    Class123 aClass123_7833;
    Class64_Sub3 aClass64_Sub3_7834;
    float aFloat7835;
    float aFloat7836;
    boolean aBoolean7837;
    Class64_Sub3 aClass64_Sub3_7838;
    private int anInt7839;
    Class64_Sub3 aClass64_Sub3_7840;
    boolean aBoolean7841;
    private float aFloat7842;
    private boolean aBoolean7843;
    Class64_Sub3 aClass64_Sub3_7844;
    private String aString7845;
    boolean aBoolean7846;
    boolean aBoolean7847;
    int anInt7848;
    Class123 aClass123_7849;
    private final float[] aFloatArray7850;
    private float aFloat7851;
    private Interface2 anInterface2_7852;
    int anInt7853;
    private float aFloat7854;
    private int anInt7855;
    int anInt7856;
    private float aFloat7857;
    private final Class348_Sub1[] aClass348_Sub1Array7858;
    private boolean aBoolean7859;
    private boolean aBoolean7860;
    private int anInt7861;
    private int anInt7862;
    boolean aBoolean7863;
    Class64_Sub3 aClass64_Sub3_7864;
    private int anInt7865;
    private boolean aBoolean7866;
    private int anInt7867;
    private int anInt7868;
    private boolean aBoolean7869;
    private boolean aBoolean7870;
    float aFloat7871;
    float aFloat7872;
    private boolean aBoolean7873;
    float aFloat7874;
    float aFloat7875;
    private int anInt7876;
    private final float[] aFloatArray7877;
    private int anInt7878;
    byte[] aByteArray7879;
    int[] anIntArray7880;
    private int anInt7881;
    int[] anIntArray7882;
    int[] anIntArray7883;

    final void L(int i, int i_0_, int i_1_) {
        if (i != this.anInt7856 || i_0_ != this.anInt7782 || this.anInt7813 != i_1_) {
            this.anInt7782 = i_0_;
            this.anInt7856 = i;
            this.anInt7813 = i_1_;
            method3803(16711680);
            method3732(92);
        }
        anInt7694++;
    }

    final void method3728(boolean bool, int i) {
        if (aBoolean7784 != bool) {
            aBoolean7784 = bool;
            method3768((byte) -121);
            anInt7765 &= ~0x7;
        }
        if (i < 18) anInt7804 = -98;
        anInt7683++;
    }

    final Class64 method3625(Class124 class124, int i, int i_2_, int i_3_, int i_4_) {
        try {
            anInt7579++;
            return new Class64_Sub3(this, class124, i, i_3_, i_4_, i_2_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.EG(" + (class124 != null ? "{...}" : "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
        }
    }

    final void method3729(int i, byte i_5_, int i_6_) {
        if (anInt7876 == 0) {
            boolean bool = false;
            if (anInt7804 != i) {
                OpenGL.glTexEnvi(8960, 34161, i);
                bool = true;
                anInt7804 = i;
            }
            if (i_6_ != anInt7861) {
                OpenGL.glTexEnvi(8960, 34162, i_6_);
                anInt7861 = i_6_;
                bool = true;
            }
            if (bool) anInt7765 &= ~0x1d;
        } else {
            OpenGL.glTexEnvi(8960, 34161, i);
            OpenGL.glTexEnvi(8960, 34162, i_6_);
        }
        int i_7_ = -14 / ((i_5_ - 46) / 46);
        anInt7655++;
    }

    private final void method3730(byte i) {
        OpenGL.glMatrixMode(5889);
        anInt7693++;
        OpenGL.glLoadMatrixf(aFloatArray7779, 0);
        OpenGL.glMatrixMode(5888);
        if (i <= 113) method3659(-64);
    }

    final void method3653(Class299 class299) {
        try {
            anInt7550++;
            aClass299_Sub1_7769 = (Class299_Sub1) class299;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.DF(" + (class299 != null ? "{...}" : "null") + ')');
        }
    }

    final Interface2 method3731(int i, boolean bool, int i_8_, byte[] is, int i_9_) {
        try {
            if (i != 2) method3781((byte) -13, 54);
            anInt7530++;
            if (aBoolean7873 && (!bool || aBoolean7869)) return new Class135_Sub1(this, i_8_, is, i_9_, bool);
            return new Class119_Sub1(this, i_8_, is, i_9_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.VB(" + i + ',' + bool + ',' + i_8_ + ',' + (is != null ? "{...}" : "null") + ',' + i_9_ + ')'));
        }
    }

    final void DA(int i, int i_10_, int i_11_, int i_12_) {
        this.anInt7771 = i_11_;
        this.anInt7794 = i_12_;
        this.anInt7810 = i_10_;
        this.anInt7853 = i;
        anInt7558++;
        method3806(96);
        method3772((byte) 124);
        if (anInt7865 == 3) method3747((byte) -63);
        else if (anInt7865 == 2) method3730((byte) 119);
    }

    private final void method3732(int i) {
        if (!aBoolean7801 || this.anInt7782 < 0) OpenGL.glDisable(2912);
        else OpenGL.glEnable(2912);
        int i_13_ = 96 % (i / 63);
        anInt7629++;
    }

    final Interface8 method3733(int i, int i_14_, int i_15_, byte[] is, boolean bool) {
        try {
            anInt7565++;
            if (i_14_ >= -2) method3644();
            if (aBoolean7873 && (!bool || aBoolean7869)) return new Class135_Sub2(this, i, is, i_15_, bool);
            return new Class119_Sub2(this, i, is, i_15_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.G(" + i + ',' + i_14_ + ',' + i_15_ + ',' + (is != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    final void method3734(boolean bool) {
        OpenGL.glPopMatrix();
        anInt7696++;
        if (bool != true) this.anInt7772 = 37;
    }

    final Class348_Sub1 method3690(int i, int i_16_, int i_17_, int i_18_, int i_19_, float f) {
        anInt7559++;
        return new Class348_Sub1_Sub1(i, i_16_, i_17_, i_18_, i_19_, f);
    }

    final void method3735(int i) {
        if (i != 9473) method3661(-10, -73, null, null);
        if (anInt7765 != 4) {
            method3763(i ^ 0x3201);
            method3807(false, 2);
            method3728(false, 79);
            method3752(i ^ 0x257a, false);
            method3748(0, false);
            method3757(-2, -111);
            method3753(1, 1);
            anInt7765 = 4;
        }
        anInt7514++;
    }

    public static void method3736(byte i) {
        aClass351_7554 = null;
        aClass351_7715 = null;
        if (i < 27) aClass351_7715 = null;
    }

    final int XA() {
        anInt7706++;
        return anInt7814;
    }

    final void method3636(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, aa var_aa, int i_25_, int i_26_) {
        try {
            anInt7727++;
            aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
            Class258_Sub3_Sub1 class258_sub3_sub1 = var_aa_Sub1.aClass258_Sub3_Sub1_5193;
            method3792(110);
            method3771((byte) -88, var_aa_Sub1.aClass258_Sub3_Sub1_5193);
            method3753(i_24_, 1);
            method3729(7681, (byte) 97, 8448);
            method3762(34167, 768, (byte) -87, 0);
            float f = (class258_sub3_sub1.aFloat9937 / (float) (class258_sub3_sub1.anInt9940));
            float f_27_ = (class258_sub3_sub1.aFloat9938 / (float) (class258_sub3_sub1.anInt9939));
            float f_28_ = (float) i_21_ - (float) i;
            float f_29_ = (float) i_22_ - (float) i_20_;
            float f_30_ = (float) (1.0 / Math.sqrt(f_29_ * f_29_ + f_28_ * f_28_));
            f_28_ *= f_30_;
            OpenGL.glColor4ub((byte) (i_23_ >> 16), (byte) (i_23_ >> 8), (byte) i_23_, (byte) (i_23_ >> 24));
            f_29_ *= f_30_;
            OpenGL.glBegin(1);
            OpenGL.glTexCoord2f((float) (-i_25_ + i) * f, f_27_ * (float) (i_20_ + -i_26_));
            OpenGL.glVertex2f((float) i + 0.35F, 0.35F + (float) i_20_);
            OpenGL.glTexCoord2f(f * (float) (i_21_ + -i_25_), (float) (-i_26_ + i_22_) * f_27_);
            OpenGL.glVertex2f(0.35F + (f_28_ + (float) i_21_), 0.35F + ((float) i_22_ + f_29_));
            OpenGL.glEnd();
            method3762(5890, 768, (byte) -87, 0);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.ME(" + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_25_ + ',' + i_26_ + ')'));
        }
    }

    final int[] Y() {
        anInt7704++;
        return (new int[]{this.anInt7853, this.anInt7810, this.anInt7771, this.anInt7794});
    }

    final synchronized void method3737(int i, byte i_31_, int i_32_) {
        anInt7676++;
        Class348_Sub35 class348_sub35 = new Class348_Sub35(i_32_);
        class348_sub35.aLong4291 = i;
        int i_33_ = -124 / ((i_31_ - 79) / 39);
        aClass262_7752.method1999(class348_sub35, -20180);
    }

    final void method3738(int i, int i_34_) {
        if (i != -15039) aClass258Array7828 = null;
        if (i_34_ != anInt7876) {
            OpenGL.glActiveTexture(33984 + i_34_);
            anInt7876 = i_34_;
        }
        anInt7526++;
    }

    final Interface2 method3739(int i, Buffer buffer, boolean bool, int i_35_, int i_36_) {
        try {
            if (i != 8448) this.aClass64_Sub3_7844 = null;
            anInt7605++;
            if (aBoolean7873 && (!bool || aBoolean7869)) return new Class135_Sub1(this, i_35_, buffer, i_36_, bool);
            return new Class119_Sub1(this, i_35_, buffer);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.OG(" + i + ',' + (buffer != null ? "{...}" : "null") + ',' + bool + ',' + i_35_ + ',' + i_36_ + ')'));
        }
    }

    private final void method3740(int i) {
        if (anInt7865 != 2) {
            anInt7865 = 2;
            method3730((byte) 125);
            method3754((byte) 90);
            anInt7765 &= ~0x7;
        }
        if (i != -14388) this.anInt7735 = -85;
        anInt7678++;
    }

    final boolean method3644() {
        anInt7556++;
        return true;
    }

    final Class258_Sub2 method3741(int i) {
        anInt7581++;
        if (i != 444720536) this.aFloat7823 = 0.28610376F;
        if (aClass299_Sub1_7769 != null) return aClass299_Sub1_7769.method2256((byte) -121);
        return null;
    }

    final void HA(int i, int i_37_, int i_38_, int i_39_, int[] is) {
        try {
            anInt7681++;
            float f = (((float) i_38_ * (this.aClass101_Sub3_7760.aFloat5784)) + ((float) i_37_ * (this.aClass101_Sub3_7760.aFloat5754) + (this.aClass101_Sub3_7760.aFloat5756) * (float) i) + (this.aClass101_Sub3_7760.aFloat5751));
            if ((float) this.anInt7826 <= f && (float) anInt7814 >= f) {
                int i_40_ = (int) ((this.aClass101_Sub3_7760.aFloat5747 + ((this.aClass101_Sub3_7760.aFloat5750) * (float) i_37_ + ((float) i * (this.aClass101_Sub3_7760.aFloat5770)) + (this.aClass101_Sub3_7760.aFloat5781) * (float) i_38_)) * (float) this.anInt7771 / (float) i_39_);
                int i_41_ = (int) ((float) this.anInt7794 * ((this.aClass101_Sub3_7760.aFloat5772) + ((this.aClass101_Sub3_7760.aFloat5761) * (float) i + ((float) i_37_ * (this.aClass101_Sub3_7760.aFloat5769)) + ((float) i_38_ * (this.aClass101_Sub3_7760.aFloat5762)))) / (float) i_39_);
                if ((float) i_40_ >= this.aFloat7872 && this.aFloat7835 >= (float) i_40_ && this.aFloat7836 <= (float) i_41_ && this.aFloat7830 >= (float) i_41_) {
                    is[2] = (int) f;
                    is[1] = (int) (-this.aFloat7836 + (float) i_41_);
                    is[0] = (int) (-this.aFloat7872 + (float) i_40_);
                } else is[0] = is[1] = is[2] = -1;
            } else is[0] = is[1] = is[2] = -1;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.HA(" + i + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    final void EA(int i, int i_42_, int i_43_, int i_44_) {
        anInt7532++;
        if (!this.aBoolean7846) throw new RuntimeException("");
        this.anInt7788 = i;
        this.anInt7806 = i_42_;
        this.anInt7848 = i_43_;
        this.anInt7809 = i_44_;
        if (aBoolean7859) {
            aClass100_7707.aClass286_Sub1_1586.method2141(false);
            aClass100_7707.aClass286_Sub1_1586.method2143(34336);
        }
    }

    private final void method3742(int i) {
        anInt7638++;
        if (anInt7865 != 3) {
            anInt7865 = 3;
            method3747((byte) -63);
            method3754((byte) 89);
            anInt7765 &= ~0x7;
        }
        if (i != 3) anInt7799 = -50;
    }

    static final void method3743(byte i, Class348_Sub42_Sub12 class348_sub42_sub12) {
        do {
            try {
                anInt7686++;
                if (i != 6) aClass351_7715 = null;
                if (class348_sub42_sub12 != null) {
                    Class348_Sub40_Sub4.aClass262_9111.method1999(class348_sub42_sub12, -20180);
                    Class73.anInt4776++;
                    Object object = null;
                    Class348_Sub42_Sub13 class348_sub42_sub13;
                    if ((class348_sub42_sub12.aBoolean9611) || "".equals(class348_sub42_sub12.aString9601)) {
                        class348_sub42_sub13 = new Class348_Sub42_Sub13(class348_sub42_sub12.aString9601);
                        Class8.anInt166++;
                    } else {
                        long l = (class348_sub42_sub12.aLong9600);
                        for (class348_sub42_sub13 = ((Class348_Sub42_Sub13) Class348_Sub42_Sub12.aClass356_9603.method3480(l, -6008)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((Class348_Sub42_Sub13) Class348_Sub42_Sub12.aClass356_9603.method3476(true))) {
                            if (class348_sub42_sub13.aString9617.equals(class348_sub42_sub12.aString9601)) break;
                        }
                        if (class348_sub42_sub13 == null) {
                            class348_sub42_sub13 = ((Class348_Sub42_Sub13) Class259.aClass60_3301.method583(l, i ^ 0x3a));
                            if (class348_sub42_sub13 != null && !(class348_sub42_sub13.aString9617.equals(class348_sub42_sub12.aString9601))) class348_sub42_sub13 = null;
                            if (class348_sub42_sub13 == null) class348_sub42_sub13 = (new Class348_Sub42_Sub13(class348_sub42_sub12.aString9601));
                            Class348_Sub42_Sub12.aClass356_9603.method3483((byte) 71, l, class348_sub42_sub13);
                            Class8.anInt166++;
                        }
                    }
                    if (!class348_sub42_sub13.method3233(class348_sub42_sub12, -21)) break;
                    Class242.method1868((byte) -39, class348_sub42_sub13);
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.VC(" + i + ',' + ((class348_sub42_sub12 != null) ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final boolean method3655() {
        anInt7703++;
        return true;
    }

    final void method3744(float f, int i, float f_45_) {
        if (i != 770) this.aFloat7792 = 0.31055084F;
        anInt7571++;
        aFloat7786 = f;
        aFloat7857 = f_45_;
        method3803(16711680);
    }

    private final void method3745(byte i) {
        anInt7680++;
        if (aCanvas7575 != null) {
            Dimension dimension = aCanvas7575.getSize();
            anInt7645 = dimension.width;
            anInt7523 = dimension.height;
        } else anInt7645 = anInt7523 = 0;
        if (i > 61) {
            if (anInterface11_7740 == null) {
                this.anInt7688 = anInt7645;
                this.anInt7641 = anInt7523;
                method3809(true);
            }
            method3755(-32);
            la();
        }
    }

    final void method3746(boolean bool, int i, boolean bool_46_, int i_47_) {
        anInt7631++;
        if (anInt7796 != i || aBoolean7859 == !this.aBoolean7846) {
            Class258_Sub3 class258_sub3 = null;
            int i_48_ = 0;
            byte i_49_ = 0;
            int i_50_ = 0;
            byte i_51_ = !this.aBoolean7846 ? (byte) 0 : (byte) 3;
            if (i >= 0) {
                class258_sub3 = aClass354_7723.method3467(i, 256);
                Class12 class12 = this.aD4579.method3(i, -6662);
                if (class12.aByte198 != 0 || class12.aByte211 != 0) {
                    int i_52_ = class12.aBoolean199 ? 64 : 128;
                    int i_53_ = i_52_ * 50;
                    method3799(((float) (this.anInt7735 % i_53_ * class12.aByte211) / (float) i_53_), 0.0F, (float) (class12.aByte198 * (this.anInt7735 % i_53_)) / (float) i_53_, (byte) 126);
                } else method3767(-21974);
                if (!this.aBoolean7846) {
                    i_51_ = class12.aByte213;
                    i_50_ = class12.anInt206;
                    i_49_ = class12.aByte202;
                }
                i_48_ = class12.anInt203;
            } else method3767(-21974);
            aClass100_7707.method884(i_49_, bool, i_51_, i_50_, (byte) 12, bool_46_);
            if (!aClass100_7707.method885(i_48_, (byte) -124, class258_sub3)) {
                method3771((byte) -86, class258_sub3);
                method3761(0, i_48_);
            }
            aBoolean7859 = this.aBoolean7846;
            anInt7796 = i;
        }
        if (i_47_ <= 111) KA(59, -107, -128, -14);
        anInt7765 &= ~0x7;
    }

    private final void method3747(byte i) {
        anInt7597++;
        float f = ((float) -this.anInt7853 * aFloat7851 / (float) this.anInt7771);
        float f_54_ = (aFloat7851 * (float) -this.anInt7810 / (float) this.anInt7794);
        float f_55_ = (aFloat7851 * (float) (-this.anInt7853 + this.anInt7688) / (float) this.anInt7771);
        float f_56_ = (aFloat7851 * (float) (this.anInt7641 - this.anInt7810) / (float) this.anInt7794);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        if (f != f_55_ && f_54_ != f_56_) OpenGL.glOrtho(f, f_55_, -f_56_, -f_54_, this.anInt7826, anInt7814);
        OpenGL.glMatrixMode(5888);
        if (i != -63) this.anInt7795 = 67;
    }

    final boolean method3627() {
        anInt7542++;
        return aClass348_Sub5_Sub1_7721 != null && (this.anInt7713 <= 1 || aBoolean7822);
    }

    final void method3748(int i, boolean bool) {
        anInt7710++;
        if (aBoolean7759 != bool) {
            aBoolean7759 = bool;
            method3795(-30199);
            anInt7765 &= ~0x1f;
        }
        if (i != 0) method3773(-58, null);
    }

    final void K(int[] is) {
        try {
            is[1] = anInt7773;
            is[3] = anInt7787;
            is[0] = anInt7868;
            anInt7580++;
            is[2] = anInt7855;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.K(" + (is != null ? "{...}" : "null") + ')');
        }
    }

    final void Q(int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, byte[] is, int i_62_, int i_63_) {
        try {
            anInt7540++;
            float f;
            float f_64_;
            if (aClass258_Sub3_Sub1_7776 == null || i_58_ > aClass258_Sub3_Sub1_7776.anInt8547 || i_59_ > aClass258_Sub3_Sub1_7776.anInt8551) {
                aClass258_Sub3_Sub1_7776 = Class371.method3583(false, is, 6406, i_59_, this, -45, 6406, i_58_);
                aClass258_Sub3_Sub1_7776.method1965(false, false, 10243);
                f = aClass258_Sub3_Sub1_7776.aFloat9938;
                f_64_ = (aClass258_Sub3_Sub1_7776.aFloat9937);
            } else {
                aClass258_Sub3_Sub1_7776.method1970(0, 0, i_58_, false, 0, i_59_, 6406, 123, is, 0);
                f = ((float) i_59_ * (aClass258_Sub3_Sub1_7776.aFloat9938) / (float) (aClass258_Sub3_Sub1_7776.anInt8551));
                f_64_ = ((float) i_58_ * (aClass258_Sub3_Sub1_7776.aFloat9937) / (float) (aClass258_Sub3_Sub1_7776.anInt8547));
            }
            method3792(58);
            method3771((byte) -117, aClass258_Sub3_Sub1_7776);
            method3753(i_63_, 1);
            OpenGL.glColor4ub((byte) (i_60_ >> 16), (byte) (i_60_ >> 8), (byte) i_60_, (byte) (i_60_ >> 24));
            method3808(i_61_, 120);
            method3729(34165, (byte) 101, 34165);
            method3762(34166, 768, (byte) -87, 0);
            method3762(5890, 770, (byte) -87, 2);
            method3775(false, 0, 770, 34166);
            method3775(false, 2, 770, 5890);
            float f_65_ = (float) i;
            float f_66_ = (float) i_57_;
            float f_67_ = (float) i_58_ + f_65_;
            float f_68_ = (float) i_59_ + f_66_;
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2f(f_65_, f_66_);
            OpenGL.glTexCoord2f(0.0F, f_64_);
            OpenGL.glVertex2f(f_65_, f_68_);
            OpenGL.glTexCoord2f(f, f_64_);
            OpenGL.glVertex2f(f_67_, f_68_);
            OpenGL.glTexCoord2f(f, 0.0F);
            OpenGL.glVertex2f(f_67_, f_66_);
            OpenGL.glEnd();
            method3762(5890, 768, (byte) -87, 0);
            method3762(34166, 770, (byte) -87, 2);
            method3775(false, 0, 770, 5890);
            method3775(false, 2, 770, 34166);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.Q(" + i + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ',' + i_61_ + ',' + (is != null ? "{...}" : "null") + ',' + i_62_ + ',' + i_63_ + ')'));
        }
    }

    final void method3684(Class98 class98) {
        try {
            aClass233_7711.method1651(this, (byte) -119, -1, class98);
            anInt7569++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.EF(" + (class98 != null ? "{...}" : "null") + ')');
        }
    }

    final void method3749(float f, float f_69_, float f_70_, byte i, float f_71_) {
        InputStream_Sub2.aFloatArray84[2] = f_70_;
        if (i <= 45) method3769(-35L, false);
        anInt7576++;
        InputStream_Sub2.aFloatArray84[0] = f_69_;
        InputStream_Sub2.aFloatArray84[1] = f_71_;
        InputStream_Sub2.aFloatArray84[3] = f;
        OpenGL.glTexEnvfv(8960, 8705, InputStream_Sub2.aFloatArray84, 0);
    }

    final void method3638(Class101 class101) {
        do {
            try {
                anInt7549++;
                this.aClass101_Sub3_7760.method898(class101);
                this.aClass101_Sub3_7766.method898(this.aClass101_Sub3_7760);
                this.aClass101_Sub3_7766.method942(3128);
                this.aClass101_Sub3_7767.method946(this.aClass101_Sub3_7766, -7929);
                if (anInt7865 == 1) break;
                method3754((byte) 89);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, "qo.DE(" + (class101 != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }

    final void method3750(int i, Interface2 interface2) {
        try {
            if (i <= 39) this.anInt7782 = 120;
            if (interface2 != anInterface2_7852) {
                if (aBoolean7873) OpenGL.glBindBufferARB(34962, interface2.method10(true));
                anInterface2_7852 = interface2;
            }
            anInt7552++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.D(" + i + ',' + (interface2 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method3676(int i, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_) {
        method3778((byte) -123);
        anInt7567++;
        method3753(i_83_, 1);
        OpenGL.glBegin(4);
        OpenGL.glColor4ub((byte) (i_80_ >> 16), (byte) (i_80_ >> 8), (byte) i_80_, (byte) (i_80_ >> 24));
        OpenGL.glVertex3f((float) i + 0.35F, (float) i_72_ + 0.35F, (float) i_73_);
        OpenGL.glColor4ub((byte) (i_81_ >> 16), (byte) (i_81_ >> 8), (byte) i_81_, (byte) (i_81_ >> 24));
        OpenGL.glVertex3f((float) i_74_ + 0.35F, (float) i_75_ + 0.35F, (float) i_76_);
        OpenGL.glColor4ub((byte) (i_82_ >> 16), (byte) (i_82_ >> 8), (byte) i_82_, (byte) (i_82_ >> 24));
        OpenGL.glVertex3f(0.35F + (float) i_77_, (float) i_78_ + 0.35F, (float) i_79_);
        OpenGL.glEnd();
    }

    final void method3672() {
        anInt7702++;
        if (this.aBoolean7820) {
            if (anInterface11_7740 != aClass206_7739) throw new RuntimeException();
            aClass206_7739.method1500(2983, 0);
            aClass206_7739.method1500(2983, 8);
            method3770(-422613672, aClass206_7739);
        } else {
            if (!aBoolean7866) throw new RuntimeException("");
            aClass105_Sub2_7744.method979(0, 0, this.anInt7688, this.anInt7641, 0, 0);
            anOpenGL7664.setSurface(aLong7636);
        }
        this.anInt7688 = anInt7645;
        aClass105_Sub2_7744 = null;
        this.anInt7641 = anInt7523;
        method3755(-32);
        method3809(true);
        la();
    }

    final void method3751(Interface11 interface11, int i) {
        try {
            anInt7548++;
            if (anInt7742 >= 3) throw new RuntimeException();
            int i_84_ = 67 % ((-4 - i) / 46);
            if (anInt7742 >= 0) anInterface11Array7737[anInt7742].method50(-32502);
            anInterface11_7740 = anInterface11Array7737[++anInt7742] = interface11;
            anInterface11_7740.method47(-11421);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.NG(" + (interface11 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final void method3752(int i, boolean bool) {
        if (!bool != !aBoolean7763) {
            if (!bool) OpenGL.glDisable(2929);
            else OpenGL.glEnable(2929);
            aBoolean7763 = bool;
            anInt7765 &= ~0x1f;
        }
        if (i <= 106) method3765((byte) 118, 75);
        anInt7726++;
    }

    final FontRenderer method3686(FontMetrics fontMetrics, Class207[] class207s, boolean bool) {
        try {
            anInt7574++;
            return new FontRenderer_Sub5(this, fontMetrics, class207s, bool);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.JE(" + (fontMetrics != null ? "{...}" : "null") + ',' + (class207s != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    final void aa(int i, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_) {
        anInt7601++;
        float f = (float) i + 0.35F;
        float f_90_ = (float) i_85_ + 0.35F;
        float f_91_ = (float) i_86_ + f;
        method3778((byte) -127);
        float f_92_ = f_90_ + (float) i_87_;
        method3753(i_89_, 1);
        OpenGL.glColor4ub((byte) (i_88_ >> 16), (byte) (i_88_ >> 8), (byte) i_88_, (byte) (i_88_ >> 24));
        if (aBoolean7843) OpenGL.glDisable(32925);
        OpenGL.glBegin(7);
        OpenGL.glVertex2f(f, f_90_);
        OpenGL.glVertex2f(f, f_92_);
        OpenGL.glVertex2f(f_91_, f_92_);
        OpenGL.glVertex2f(f_91_, f_90_);
        OpenGL.glEnd();
        if (aBoolean7843) OpenGL.glEnable(32925);
    }

    final void ZA(int i, float f, float f_93_, float f_94_, float f_95_, float f_96_) {
        anInt7633++;
        boolean bool = i != anInt7808;
        if (bool || this.aFloat7832 != f || f_93_ != this.aFloat7871) {
            this.aFloat7832 = f;
            anInt7808 = i;
            this.aFloat7871 = f_93_;
            if (bool) {
                this.aFloat7823 = (float) (anInt7808 & 0xff) / 255.0F;
                this.aFloat7781 = (float) (0xff0000 & anInt7808) / 1.671168E7F;
                this.aFloat7816 = (float) (0xff00 & anInt7808) / 65280.0F;
                method3787(-93);
            }
            method3779(29890);
        }
        if (f_94_ != aFloatArray7850[0] || aFloatArray7850[1] != f_95_ || aFloatArray7850[2] != f_96_) {
            aFloatArray7850[2] = f_96_;
            aFloatArray7850[1] = f_95_;
            aFloatArray7850[0] = f_94_;
            aFloatArray7877[0] = -f_94_;
            aFloatArray7877[2] = -f_96_;
            aFloatArray7877[1] = -f_95_;
            float f_97_ = (float) (1.0 / Math.sqrt(f_96_ * f_96_ + (f_95_ * f_95_ + f_94_ * f_94_)));
            this.aFloatArray7825[0] = f_97_ * f_94_;
            this.aFloatArray7825[2] = f_96_ * f_97_;
            this.aFloatArray7825[1] = f_97_ * f_95_;
            aFloatArray7811[2] = -this.aFloatArray7825[2];
            aFloatArray7811[1] = -this.aFloatArray7825[1];
            aFloatArray7811[0] = -this.aFloatArray7825[0];
            method3796(16384);
            this.anInt7777 = (int) (256.0F * f_96_ / f_95_);
            this.anInt7772 = (int) (256.0F * f_94_ / f_95_);
        }
    }

    final int method3679(int i, int i_98_) {
        anInt7634++;
        return i | i_98_;
    }

    final void GA(int i) {
        anInt7592++;
        method3753(0, 1);
        OpenGL.glClearColor((float) (i & 0xff0000) / 1.671168E7F, (float) (0xff00 & i) / 65280.0F, (float) (0xff & i) / 255.0F, (float) (i >>> 24) / 255.0F);
        OpenGL.glClear(16384);
    }

    final void method3650(int i) {
        anInt7646++;
    }

    ha_Sub2(Canvas canvas, d var_d, int i) {
        super(var_d);
        aClass233_7711 = new Class233();
        aClass101_Sub3_7725 = new Class101_Sub3();
        this.aClass101_Sub3_7729 = new Class101_Sub3();
        this.anInt7731 = 3;
        aBoolean7734 = false;
        this.anInt7733 = 8;
        aClass262_7732 = new Class262();
        anInterface11Array7737 = new Interface11[4];
        anInt7738 = -1;
        anInt7742 = -1;
        anInterface11Array7741 = new Interface11[4];
        anInterface11Array7743 = new Interface11[4];
        anInt7746 = -1;
        new Class107();
        new Class356(16);
        aClass262_7749 = new Class262();
        aClass262_7751 = new Class262();
        aClass262_7752 = new Class262();
        aClass262_7753 = new Class262();
        aClass262_7754 = new Class262();
        aClass262_7755 = new Class262();
        aClass262_7756 = new Class262();
        this.aClass101_Sub3_7760 = new Class101_Sub3();
        this.aClass101_Sub3_7766 = new Class101_Sub3();
        this.aClass101_Sub3_7767 = new Class101_Sub3();
        anInt7770 = 0;
        aFloat7786 = 0.0F;
        anInt7773 = 0;
        this.aFloat7781 = 1.0F;
        this.anInt7806 = -1;
        this.anInt7771 = 512;
        aFloat7800 = -1.0F;
        anInt7808 = -1;
        this.aFloat7816 = 1.0F;
        anInt7804 = 8448;
        aFloat7829 = -1.0F;
        this.anInt7810 = 0;
        this.aFloat7832 = -1.0F;
        this.aFloatArray7825 = new float[4];
        this.anInt7809 = 0;
        aFloatArray7811 = new float[4];
        this.aFloat7823 = 1.0F;
        this.anInt7794 = 512;
        anInt7814 = 3584;
        anInt7855 = 0;
        aFloat7857 = 1.0F;
        anInt7787 = 0;
        aBoolean7859 = false;
        aFloatArray7850 = new float[4];
        aFloat7851 = 1.0F;
        this.anInt7826 = 50;
        anInt7861 = 8448;
        this.anInt7813 = 0;
        this.anInt7856 = -1;
        anInt7868 = 0;
        aFloatArray7779 = new float[16];
        aBoolean7870 = true;
        this.aFloat7871 = -1.0F;
        aClass348_Sub1Array7858 = new Class348_Sub1[Class55.anInt984];
        this.anInt7853 = 0;
        anInt7867 = 0;
        this.aFloat7875 = 3584.0F;
        this.aFloat7874 = 3584.0F;
        this.anInt7848 = -1;
        aFloatArray7877 = new float[4];
        this.anInt7782 = -1;
        this.aClass348_Sub49_Sub1_7798 = new Class348_Sub49_Sub1(8192);
        this.aByteArray7879 = new byte[16384];
        this.anIntArray7880 = new int[1];
        this.anIntArray7883 = new int[1];
        this.anIntArray7882 = new int[1];
        try {
            aCanvas7575 = aCanvas7626 = canvas;
            this.anInt7713 = i;
            if (!Class348_Sub40_Sub19.method3098(-30282, "jaclib")) throw new RuntimeException("");
            if (!Class348_Sub40_Sub19.method3098(-30282, "jaggl")) throw new RuntimeException("");
            try {
                anOpenGL7664 = new OpenGL();
                aLong7636 = aLong7553 = anOpenGL7664.init(canvas, 8, 8, 8, 24, 0, this.anInt7713);
                if (aLong7553 == 0) throw new RuntimeException("");
                method3776(22544);
                int i_99_ = method3774((byte) -62);
                if (i_99_ != 0) throw new RuntimeException("");
                this.anInt7812 = this.aBoolean7775 ? 33639 : 5121;
                if (aString7790.indexOf("radeon") != -1) {
                    int i_100_ = 0;
                    boolean bool = false;
                    boolean bool_101_ = false;
                    String[] strings = (Class348_Sub40_Sub23.method3113(' ', true, aString7790.replace('/', ' ')));
                    for (int i_102_ = 0; i_102_ < strings.length; i_102_++) {
                        String string = strings[i_102_];
                        try {
                            if (string.length() > 0) {
                                if (string.charAt(0) == 'x' && string.length() >= 3 && (Class50_Sub3.method468(string.substring(1, 3), 111))) {
                                    string = string.substring(1);
                                    bool_101_ = true;
                                }
                                if (string.equals("hd")) bool = true;
                                else {
                                    if (string.startsWith("hd")) {
                                        bool = true;
                                        string = string.substring(2);
                                    }
                                    if (string.length() >= 4 && (Class50_Sub3.method468(string.substring(0, 4), 47))) {
                                        i_100_ = (Class348_Sub41.parseInt(true, string.substring(0, 4)));
                                        break;
                                    }
                                }
                            }
                        } catch (Exception exception) {
                            /* empty */
                        }
                    }
                    if (!bool_101_ && !bool) {
                        if (i_100_ >= 7000 && i_100_ <= 7999) aBoolean7873 = false;
                        if (i_100_ >= 7000 && i_100_ <= 9250) this.aBoolean7831 = false;
                    }
                    if (!bool || i_100_ < 4000) this.aBoolean7818 = false;
                    this.aBoolean7837 &= anOpenGL7664.a("GL_ARB_half_float_pixel");
                    this.aBoolean7847 = true;
                    aBoolean7869 = aBoolean7873;
                }
                if (aString7845.indexOf("intel") != -1) this.aBoolean7820 = false;
                aBoolean7774 = !aString7845.equals("s3 graphics");
                if (aBoolean7873) {
                    try {
                        int[] is = new int[1];
                        OpenGL.glGenBuffersARB(1, is, 0);
                    } catch (Throwable throwable) {
                        throw new RuntimeException("");
                    }
                }
                Class59_Sub2_Sub1.method566(false, true, (byte) -128);
                aBoolean7734 = true;
                aClass354_7723 = new Class354(this, this.aD4579);
                method3786(false);
                this.aClass188_7736 = new Class188(this);
                aClass18_7720 = new Class18(this);
                if (aClass18_7720.method280(1)) {
                    aClass348_Sub5_Sub1_7721 = new Class348_Sub5_Sub1(this);
                    if (!aClass348_Sub5_Sub1_7721.method2767((byte) 104)) {
                        aClass348_Sub5_Sub1_7721.method2763((byte) -124);
                        aClass348_Sub5_Sub1_7721 = null;
                    }
                }
                aClass100_7707 = new Class100(this);
                method3791(25858);
                method3745((byte) 123);
                method3673();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                method3652();
                throw new RuntimeException("");
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.<init>(" + (canvas != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final void method3753(int i, int i_103_) {
        if (i_103_ != 1) this.aBoolean7837 = false;
        if (i != anInt7764) {
            boolean bool;
            int i_104_;
            boolean bool_105_;
            if (i == 1) {
                bool_105_ = true;
                i_104_ = 1;
                bool = true;
            } else if (i == 2) {
                bool_105_ = true;
                i_104_ = 2;
                bool = false;
            } else if (i == 128) {
                i_104_ = 3;
                bool_105_ = true;
                bool = true;
            } else {
                bool = false;
                i_104_ = 0;
                bool_105_ = true;
            }
            if (!aBoolean7758 != !bool_105_) {
                OpenGL.glColorMask(bool_105_, bool_105_, bool_105_, true);
                aBoolean7758 = bool_105_;
            }
            if (!bool != !aBoolean7761) {
                if (!bool) OpenGL.glDisable(3008);
                else OpenGL.glEnable(3008);
                aBoolean7761 = bool;
            }
            if (anInt7762 != i_104_) {
                if (i_104_ == 1) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(770, 771);
                } else if (i_104_ == 2) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(1, 1);
                } else if (i_104_ == 3) {
                    OpenGL.glEnable(3042);
                    OpenGL.glBlendFunc(774, 1);
                } else OpenGL.glDisable(3042);
                anInt7762 = i_104_;
            }
            anInt7764 = i;
            anInt7765 &= ~0x1c;
        }
        anInt7591++;
    }

    private final void method3754(byte i) {
        anInt7689++;
        if (i > 77) {
            OpenGL.glLoadIdentity();
            OpenGL.glMultMatrixf(this.aClass101_Sub3_7766.method940(1), 0);
            if (aBoolean7859) aClass100_7707.aClass286_Sub1_1586.method2141(false);
            method3796(16384);
            method3783(0);
        }
    }

    final void method3755(int i) {
        if (anInt7865 != 0) {
            anInt7765 &= ~0x1f;
            anInt7865 = 0;
        }
        if (i == -32) anInt7708++;
    }

    final void method3756(int i, int i_106_, int i_107_, int i_108_) {
        if (i_108_ <= 32) aFloat7857 = -0.7407605F;
        anInt7555++;
        OpenGL.glDrawArrays(i_106_, i_107_, i);
    }

    final void U(int i, int i_109_, int i_110_, int i_111_, int i_112_) {
        method3778((byte) -119);
        anInt7525++;
        method3753(i_112_, 1);
        float f = (float) i + 0.35F;
        OpenGL.glColor4ub((byte) (i_111_ >> 16), (byte) (i_111_ >> 8), (byte) i_111_, (byte) (i_111_ >> 24));
        float f_113_ = (float) i_109_ + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(f, f_113_);
        OpenGL.glVertex2f((float) i_110_ + f, f_113_);
        OpenGL.glEnd();
    }

    final void method3696(int i) {
        anInt7635++;
        if (i < 128 || i > 1024) throw new IllegalArgumentException();
        this.anInt7712 = i;
        aClass354_7723.method3463((byte) -110);
    }

    final void xa(float f) {
        if (this.aFloat7768 != f) {
            this.aFloat7768 = f;
            method3787(-105);
        }
        anInt7668++;
    }

    final void method3757(int i, int i_114_) {
        method3801(true, i, -104);
        anInt7649++;
        if (i_114_ > -43) method3768((byte) 85);
    }

    final void method3758(boolean bool, Class101_Sub3 class101_sub3) {
        try {
            OpenGL.glPushMatrix();
            if (bool != false) method3650(51);
            anInt7653++;
            OpenGL.glMultMatrixf(class101_sub3.method940(1), 0);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.WC(" + bool + ',' + (class101_sub3 != null ? "{...}" : "null") + ')'));
        }
    }

    final Sprite method3683(int i, int i_115_, int i_116_, int i_117_, boolean bool) {
        anInt7582++;
        return new Sprite_Sub2(this, i, i_115_, i_116_, i_117_);
    }

    final void method3759(int i, int i_118_, int i_119_, Interface8 interface8, int i_120_) {
        try {
            anInt7619++;
            int i_121_ = interface8.method34(-5711);
            if (i_118_ >= -127) aClass100_7707 = null;
            i_120_ *= method3785(i_121_, 4);
            method3793(1, interface8);
            OpenGL.glDrawElements(i_119_, i, i_121_, (interface8.method36((byte) 78) + (long) i_120_));
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.MA(" + i + ',' + i_118_ + ',' + i_119_ + ',' + (interface8 != null ? "{...}" : "null") + ',' + i_120_ + ')'));
        }
    }

    final synchronized void method3646(int i) {
        anInt7699++;
        int i_122_ = 0;
        i &= 0x7fffffff;
        while (!aClass262_7751.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35 = (Class348_Sub35) aClass262_7751.method1997(8);
            Class328_Sub3.anIntArray6522[i_122_++] = (int) class348_sub35.aLong4291;
            this.anInt7747 -= class348_sub35.anInt6976;
            if (i_122_ == 1000) {
                OpenGL.glDeleteBuffersARB(i_122_, Class328_Sub3.anIntArray6522, 0);
                i_122_ = 0;
            }
        }
        if (i_122_ > 0) {
            OpenGL.glDeleteBuffersARB(i_122_, Class328_Sub3.anIntArray6522, 0);
            i_122_ = 0;
        }
        while (!aClass262_7752.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35 = (Class348_Sub35) aClass262_7752.method1997(8);
            Class328_Sub3.anIntArray6522[i_122_++] = (int) class348_sub35.aLong4291;
            this.anInt7748 -= class348_sub35.anInt6976;
            if (i_122_ == 1000) {
                OpenGL.glDeleteTextures(i_122_, Class328_Sub3.anIntArray6522, 0);
                i_122_ = 0;
            }
        }
        if (i_122_ > 0) {
            OpenGL.glDeleteTextures(i_122_, Class328_Sub3.anIntArray6522, 0);
            i_122_ = 0;
        }
        while (!aClass262_7753.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35 = (Class348_Sub35) aClass262_7753.method1997(8);
            Class328_Sub3.anIntArray6522[i_122_++] = class348_sub35.anInt6976;
            if (i_122_ == 1000) {
                OpenGL.glDeleteFramebuffersEXT(i_122_, Class328_Sub3.anIntArray6522, 0);
                i_122_ = 0;
            }
        }
        if (i_122_ > 0) {
            OpenGL.glDeleteFramebuffersEXT(i_122_, Class328_Sub3.anIntArray6522, 0);
            i_122_ = 0;
        }
        while (!aClass262_7754.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35 = (Class348_Sub35) aClass262_7754.method1997(8);
            Class328_Sub3.anIntArray6522[i_122_++] = (int) class348_sub35.aLong4291;
            anInt7750 -= class348_sub35.anInt6976;
            if (i_122_ == 1000) {
                OpenGL.glDeleteRenderbuffersEXT(i_122_, Class328_Sub3.anIntArray6522, 0);
                i_122_ = 0;
            }
        }
        if (i_122_ > 0) {
            OpenGL.glDeleteRenderbuffersEXT(i_122_, Class328_Sub3.anIntArray6522, 0);
            boolean bool = false;
        }
        while (!aClass262_7749.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35 = (Class348_Sub35) aClass262_7749.method1997(8);
            OpenGL.glDeleteLists((int) class348_sub35.aLong4291, class348_sub35.anInt6976);
        }
        while (!aClass262_7755.method2002((byte) 18)) {
            Class348 class348 = aClass262_7755.method1997(8);
            OpenGL.glDeleteProgramARB((int) class348.aLong4291);
        }
        while (!aClass262_7756.method2002((byte) 18)) {
            Class348 class348 = aClass262_7756.method1997(8);
            OpenGL.glDeleteObjectARB(class348.aLong4291);
        }
        while (!aClass262_7749.method2002((byte) 18)) {
            Class348_Sub35 class348_sub35 = (Class348_Sub35) aClass262_7749.method1997(8);
            OpenGL.glDeleteLists((int) class348_sub35.aLong4291, class348_sub35.anInt6976);
        }
        aClass354_7723.method3469(8218);
        if (E() > 100663296 && 60000L + aLong7757 < Class62.method599(-96)) {
            System.gc();
            aLong7757 = Class62.method599(-91);
        }
        this.anInt7735 = i;
    }

    final void method3709(int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_) {
        method3778((byte) -124);
        anInt7611++;
        method3753(i_127_, 1);
        float f = (float) i_124_ - (float) i;
        float f_128_ = (float) -i_123_ + (float) i_125_;
        if (f == 0.0F && f_128_ == 0.0F) f = 1.0F;
        else {
            float f_129_ = (float) (1.0 / Math.sqrt(f * f + f_128_ * f_128_));
            f *= f_129_;
            f_128_ *= f_129_;
        }
        OpenGL.glColor4ub((byte) (i_126_ >> 16), (byte) (i_126_ >> 8), (byte) i_126_, (byte) (i_126_ >> 24));
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(0.35F + (float) i, (float) i_123_ + 0.35F);
        OpenGL.glVertex2f(0.35F + (f + (float) i_124_), 0.35F + (f_128_ + (float) i_125_));
        OpenGL.glEnd();
    }

    final void b(int i, int i_130_, int i_131_, int i_132_, double d) {
        anInt7535++;
    }

    final void method3760(int i) {
        if (i != 1) method3759(65, 117, -33, null, -33);
        anInt7643++;
        if (anInt7765 != 16) {
            method3742(3);
            method3807(true, 2);
            method3752(122, true);
            method3748(0, true);
            method3753(1, i);
            anInt7765 = 16;
        }
    }

    final void method3761(int i, int i_133_) {
        if (i != 0) aClass262_7751 = null;
        anInt7654++;
        if (i_133_ == 1) method3729(7681, (byte) 114, 7681);
        else if (i_133_ == 0) method3729(8448, (byte) 107, 8448);
        else if (i_133_ != 2) {
            if (i_133_ != 3) {
                if (i_133_ == 4) method3729(34023, (byte) 123, 34023);
            } else method3729(260, (byte) 97, 8448);
        } else method3729(34165, (byte) 126, 7681);
    }

    final boolean method3695() {
        anInt7547++;
        return true;
    }

    final void method3762(int i, int i_134_, byte i_135_, int i_136_) {
        anInt7671++;
        OpenGL.glTexEnvi(8960, 34176 - -i_136_, i);
        OpenGL.glTexEnvi(8960, i_136_ + 34192, i_134_);
        if (i_135_ != -87) r(48, 67, -20, 106, -89, 67, 104);
    }

    private final void method3763(int i) {
        anInt7516++;
        if (anInt7865 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.anInt7688 > 0 && this.anInt7641 > 0) OpenGL.glOrtho(0.0, this.anInt7688, this.anInt7641, 0.0, -1.0, 1.0);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            anInt7865 = 1;
            anInt7765 &= ~0x18;
        }
        if (i != 5888) method3763(-122);
    }

    final void method3764(int i, Interface11 interface11) {
        try {
            anInt7586++;
            if (anInt7742 < 0 || anInterface11Array7737[anInt7742] != interface11) throw new RuntimeException();
            anInterface11Array7737[anInt7742--] = null;
            if (i != -17083) aClass105_Sub2_7744 = null;
            interface11.method50(-32502);
            if (anInt7742 < 0) anInterface11_7740 = null;
            else {
                anInterface11_7740 = anInterface11Array7737[anInt7742];
                anInterface11_7740.method47(-11421);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.FA(" + i + ',' + (interface11 != null ? "{...}" : "null") + ')'));
        }
    }

    final synchronized void method3765(byte i, int i_137_) {
        anInt7566++;
        Class348 class348 = new Class348();
        class348.aLong4291 = i_137_;
        if (i <= 64) method3685(null, -38);
        aClass262_7755.method1999(class348, -20180);
    }

    final void method3766(byte i, Class101_Sub3 class101_sub3) {
        do {
            try {
                anInt7623++;
                OpenGL.glLoadMatrixf(class101_sub3.method940(i + -54), 0);
                if (i == 55) break;
                method3782(null, -47);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.GC(" + i + ',' + (class101_sub3 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final void method3700(float f, float f_138_, float f_139_) {
        Class348_Sub40_Sub13.aFloat9204 = f_139_;
        Class75_Sub1.aFloat5654 = f;
        anInt7685++;
        Class239_Sub26.aFloat6120 = f_138_;
    }

    final void method3701(Canvas canvas) {
        do {
            try {
                anInt7674++;
                if (canvas == aCanvas7626) throw new RuntimeException();
                if (!aHashtable7577.containsKey(canvas)) break;
                Long var_long = (Long) aHashtable7577.get(canvas);
                anOpenGL7664.releaseSurface(canvas, var_long.longValue());
                aHashtable7577.remove(canvas);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, "qo.AG(" + (canvas != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }

    private final void method3767(int i) {
        if (i != -21974) aClass105_Sub2_7744 = null;
        anInt7599++;
        if (aBoolean7860) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            aBoolean7860 = false;
        }
    }

    final boolean method3670() {
        anInt7557++;
        return true;
    }

    final void za(int i, int i_140_, int i_141_, int i_142_, int i_143_) {
        if (i_141_ < 0) i_141_ = -i_141_;
        anInt7728++;
        if (anInt7868 <= i + i_141_ && anInt7855 >= -i_141_ + i && anInt7773 <= i_140_ + i_141_ && i_140_ + -i_141_ <= anInt7787) {
            method3778((byte) -117);
            method3753(i_143_, 1);
            OpenGL.glColor4ub((byte) (i_142_ >> 16), (byte) (i_142_ >> 8), (byte) i_142_, (byte) (i_142_ >> 24));
            float f = (float) i + 0.35F;
            float f_144_ = (float) i_140_ + 0.35F;
            int i_145_ = i_141_ << 1;
            if (aFloat7829 > (float) i_145_) {
                OpenGL.glBegin(7);
                OpenGL.glVertex2f(1.0F + f, 1.0F + f_144_);
                OpenGL.glVertex2f(f + 1.0F, -1.0F + f_144_);
                OpenGL.glVertex2f(-1.0F + f, f_144_ - 1.0F);
                OpenGL.glVertex2f(-1.0F + f, f_144_ + 1.0F);
                OpenGL.glEnd();
            } else if (aFloat7800 >= (float) i_145_) {
                OpenGL.glEnable(2832);
                OpenGL.glPointSize((float) i_145_);
                OpenGL.glBegin(0);
                OpenGL.glVertex2f(f, f_144_);
                OpenGL.glEnd();
                OpenGL.glDisable(2832);
            } else {
                OpenGL.glBegin(6);
                OpenGL.glVertex2f(f, f_144_);
                int i_146_ = 262144 / (6 * i_141_);
                if (i_146_ > 64) {
                    if (i_146_ > 512) i_146_ = 512;
                } else i_146_ = 64;
                i_146_ = Class348_Sub40_Sub1.method3051(i_146_, 4096);
                OpenGL.glVertex2f((float) i_141_ + f, f_144_);
                for (int i_147_ = 16384 + -i_146_; i_147_ > 0; i_147_ -= i_146_)
                    OpenGL.glVertex2f((float) i_141_ * (Class348_Sub23.aFloatArray6867[i_147_]) + f, (float) i_141_ * (Class348_Sub23.aFloatArray6865[i_147_]) + f_144_);
                OpenGL.glVertex2f(f + (float) i_141_, f_144_);
                OpenGL.glEnd();
            }
        }
    }

    final void method3659(int i) {
        method3776(22544);
        anInt7541++;
    }

    private final void method3768(byte i) {
        anInt7519++;
        if (i >= -69) this.aClass64_Sub3_7802 = null;
        if (!aBoolean7784 || aBoolean7805) OpenGL.glDisable(2896);
        else OpenGL.glEnable(2896);
    }

    final void method3652() {
        for (Class348 class348 = aClass262_7732.method1995(4); class348 != null; class348 = aClass262_7732.method1990((byte) 55))
            ((za_Sub1) class348).method3440(-82);
        anInt7563++;
        if (aClass18_7720 != null) aClass18_7720.method279((byte) -126);
        if (anOpenGL7664 != null) {
            method3797(0);
            Enumeration enumeration = aHashtable7577.keys();
            while (enumeration.hasMoreElements()) {
                Canvas canvas = (Canvas) enumeration.nextElement();
                Long var_long = (Long) aHashtable7577.get(canvas);
                anOpenGL7664.releaseSurface(canvas, var_long.longValue());
            }
            anOpenGL7664.release();
            anOpenGL7664 = null;
        }
        if (aBoolean7734) {
            Class286_Sub8.method2173(true, 12, false);
            aBoolean7734 = false;
        }
    }

    final void method3673() {
        anInt7568++;
        if (aBoolean7774 && this.anInt7688 > 0 && this.anInt7641 > 0) {
            int i = anInt7868;
            int i_148_ = anInt7855;
            int i_149_ = anInt7773;
            int i_150_ = anInt7787;
            la();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            method3755(-32);
            method3807(false, 2);
            method3728(false, 86);
            method3752(112, false);
            method3748(0, false);
            method3771((byte) -91, null);
            method3757(-2, -88);
            method3761(0, 1);
            method3753(0, 1);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.anInt7688, this.anInt7641, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            KA(i, i_149_, i_148_, i_150_);
        }
    }

    final Class299 method3697(int i, int i_151_, int i_152_, int i_153_, int i_154_, int i_155_) {
        anInt7515++;
        if (this.aBoolean7863) return new Class299_Sub1_Sub1(this, i, i_151_, i_152_, i_153_, i_154_, i_155_);
        return null;
    }

    final synchronized void method3769(long l, boolean bool) {
        try {
            if (bool != false) aClass262_7751 = null;
            anInt7533++;
            Class348 class348 = new Class348();
            class348.aLong4291 = l;
            aClass262_7756.method1999(class348, -20180);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.CD(" + l + ',' + bool + ')');
        }
    }

    final void method3770(int i, Interface11 interface11) {
        do {
            try {
                anInt7598++;
                if (this.aBoolean7815) {
                    method3805(8387, interface11);
                    method3764(-17083, interface11);
                } else {
                    if (anInt7746 < 0 || anInterface11Array7743[anInt7746] != interface11) throw new RuntimeException();
                    anInterface11Array7743[anInt7746--] = null;
                    interface11.method48(46);
                    if (anInt7746 < 0) anInterface11_7745 = anInterface11_7740 = null;
                    else {
                        anInterface11_7745 = anInterface11_7740 = anInterface11Array7743[anInt7746];
                        anInterface11_7745.method46(-11762);
                    }
                }
                if (i == -422613672) break;
                this.anInt7788 = 30;
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.FD(" + i + ',' + (interface11 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final void method3771(byte i, Class258 class258) {
        try {
            anInt7673++;
            if (i > -74) A(38, null, 4, -3);
            Class258 class258_156_ = aClass258Array7828[anInt7876];
            if (class258_156_ != class258) {
                if (class258 == null) OpenGL.glDisable(class258_156_.anInt4849);
                else {
                    if (class258_156_ != null) {
                        if (class258_156_.anInt4849 != class258.anInt4849) {
                            OpenGL.glDisable(class258_156_.anInt4849);
                            OpenGL.glEnable(class258.anInt4849);
                        }
                    } else OpenGL.glEnable(class258.anInt4849);
                    OpenGL.glBindTexture(class258.anInt4849, class258.method1953(41));
                }
                aClass258Array7828[anInt7876] = class258;
            }
            anInt7765 &= ~0x1;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.VA(" + i + ',' + (class258 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method3710() {
        if (aClass348_Sub5_Sub1_7721 != null && aClass348_Sub5_Sub1_7721.method2760((byte) 1)) {
            aClass18_7720.method278(aClass348_Sub5_Sub1_7721, true);
            aClass354_7723.method3463((byte) -110);
        }
        anInt7612++;
    }

    final void method3674(int i, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, int i_164_) {
        anInt7656++;
        if (i_158_ != i || i_157_ != i_159_) {
            method3778((byte) -119);
            method3753(i_161_, 1);
            float f = (float) i_158_ - (float) i;
            float f_165_ = (float) i_159_ - (float) i_157_;
            float f_166_ = (float) (1.0 / Math.sqrt(f_165_ * f_165_ + f * f));
            f *= f_166_;
            f_165_ *= f_166_;
            OpenGL.glColor4ub((byte) (i_160_ >> 16), (byte) (i_160_ >> 8), (byte) i_160_, (byte) (i_160_ >> 24));
            i_164_ %= i_162_ + i_163_;
            float f_167_ = (float) i_162_ * f;
            float f_168_ = f_165_ * (float) i_162_;
            float f_169_ = 0.0F;
            float f_170_ = 0.0F;
            float f_171_ = f_167_;
            float f_172_ = f_168_;
            if (i_164_ <= i_162_) {
                f_172_ = (float) (-i_164_ + i_162_) * f_165_;
                f_171_ = f * (float) (-i_164_ + i_162_);
            } else {
                f_170_ = (float) (i_163_ + i_162_ - i_164_) * f_165_;
                f_169_ = (float) (i_163_ + i_162_ - i_164_) * f;
            }
            float f_173_ = f_169_ + (0.35F + (float) i);
            float f_174_ = 0.35F + (float) i_157_ + f_170_;
            float f_175_ = f * (float) i_163_;
            float f_176_ = f_165_ * (float) i_163_;
            for (; ; ) {
                if (i >= i_158_) {
                    if ((float) i_158_ + 0.35F > f_173_) break;
                    if (f_173_ + f_171_ < (float) i_158_) f_171_ = -f_173_ + (float) i_158_;
                } else {
                    if (f_173_ > (float) i_158_ + 0.35F) break;
                    if (f_173_ + f_171_ > (float) i_158_) f_171_ = -f_173_ + (float) i_158_;
                }
                if (i_157_ >= i_159_) {
                    if ((float) i_159_ + 0.35F > f_174_) break;
                    if (f_172_ + f_174_ < (float) i_159_) f_172_ = (float) i_159_ - f_174_;
                } else {
                    if ((float) i_159_ + 0.35F < f_174_) break;
                    if (f_172_ + f_174_ > (float) i_159_) f_172_ = -f_174_ + (float) i_159_;
                }
                OpenGL.glBegin(1);
                OpenGL.glVertex2f(f_173_, f_174_);
                OpenGL.glVertex2f(f_173_ + f_171_, f_172_ + f_174_);
                OpenGL.glEnd();
                f_174_ += f_172_ + f_176_;
                f_173_ += f_175_ + f_171_;
                f_171_ = f_167_;
                f_172_ = f_168_;
            }
        }
    }

    final void method3643(Canvas canvas, int i, int i_177_) {
        do {
            try {
                anInt7544++;
                if (aCanvas7626 == canvas) throw new RuntimeException();
                if (aHashtable7577.containsKey(canvas)) break;
                if (!canvas.isShowing()) throw new RuntimeException();
                canvas.setIgnoreRepaint(true);
                long l = anOpenGL7664.prepareSurface(canvas);
                if (l == -1L) throw new RuntimeException();
                aHashtable7577.put(canvas, new Long(l));
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.VF(" + (canvas != null ? "{...}" : "null") + ',' + i + ',' + i_177_ + ')'));
            }
            break;
        } while (false);
    }

    private final void method3772(byte i) {
        this.aFloat7835 = (float) (-this.anInt7853 + anInt7855);
        anInt7709++;
        this.aFloat7872 = (float) (-this.anInt7853 + anInt7868);
        this.aFloat7836 = (float) (-this.anInt7810 + anInt7773);
        if (i < 123) X(-79);
        this.aFloat7830 = (float) (anInt7787 + -this.anInt7810);
    }

    final za method3702(int i) {
        anInt7538++;
        za_Sub1 var_za_Sub1 = new za_Sub1(i);
        aClass262_7732.method1999(var_za_Sub1, -20180);
        return var_za_Sub1;
    }

    final s method3648(int i, int i_178_, int[][] is, int[][] is_179_, int i_180_, int i_181_, int i_182_) {
        try {
            anInt7600++;
            return new s_Sub2(this, i_181_, i_182_, i, i_178_, is, is_179_, i_180_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.VE(" + i + ',' + i_178_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_179_ != null ? "{...}" : "null") + ',' + i_180_ + ',' + i_181_ + ',' + i_182_ + ')'));
        }
    }

    final boolean method3682() {
        anInt7705++;
        return true;
    }

    final void method3773(int i, Interface11 interface11) {
        try {
            anInt7617++;
            if (i != -1) aString7845 = null;
            if (this.aBoolean7815) {
                method3782(interface11, 327685);
                method3751(interface11, i ^ ~0x4f);
            } else {
                if (anInt7746 >= 3) throw new RuntimeException();
                if (anInt7746 >= 0) anInterface11Array7743[anInt7746].method48(-76);
                anInterface11_7745 = anInterface11_7740 = anInterface11Array7743[++anInt7746] = interface11;
                anInterface11_7745.method46(-11762);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.JB(" + i + ',' + (interface11 != null ? "{...}" : "null") + ')'));
        }
    }

    private final int method3774(byte i) {
        anInt7518++;
        int i_183_ = 0;
        aString7845 = OpenGL.glGetString(7936).toLowerCase();
        aString7790 = OpenGL.glGetString(7937).toLowerCase();
        if (aString7845.indexOf("microsoft") != -1) i_183_ |= 0x1;
        if (aString7845.indexOf("brian paul") != -1 || aString7845.indexOf("mesa") != -1) i_183_ |= 0x1;
        String string = OpenGL.glGetString(7938);
        String[] strings = Class348_Sub40_Sub23.method3113(' ', true, string.replace('.', ' '));
        if (strings.length >= 2) {
            try {
                int i_184_ = Class348_Sub41.parseInt(true, strings[0]);
                int i_185_ = Class348_Sub41.parseInt(true, strings[1]);
                anInt7789 = i_184_ * 10 - -i_185_;
            } catch (NumberFormatException numberformatexception) {
                i_183_ |= 0x4;
            }
        } else i_183_ |= 0x4;
        if (anInt7789 < 12) i_183_ |= 0x2;
        if (!anOpenGL7664.a("GL_ARB_multitexture")) i_183_ |= 0x8;
        if (!anOpenGL7664.a("GL_ARB_texture_env_combine")) i_183_ |= 0x20;
        if (i > -58) return 48;
        int[] is = new int[1];
        OpenGL.glGetIntegerv(34018, is, 0);
        this.anInt7795 = is[0];
        OpenGL.glGetIntegerv(34929, is, 0);
        anInt7799 = is[0];
        OpenGL.glGetIntegerv(34930, is, 0);
        anInt7819 = is[0];
        if (this.anInt7795 < 2 || anInt7799 < 2 || anInt7819 < 2) i_183_ |= 0x10;
        this.aBoolean7775 = Stream.c();
        aBoolean7866 = anOpenGL7664.arePbuffersAvailable();
        aBoolean7873 = anOpenGL7664.a("GL_ARB_vertex_buffer_object");
        aBoolean7843 = anOpenGL7664.a("GL_ARB_multisample");
        this.aBoolean7841 = anOpenGL7664.a("GL_ARB_vertex_program");
        anOpenGL7664.a("GL_ARB_fragment_program");
        this.aBoolean7791 = anOpenGL7664.a("GL_ARB_vertex_shader");
        this.aBoolean7783 = anOpenGL7664.a("GL_ARB_fragment_shader");
        this.aBoolean7831 = anOpenGL7664.a("GL_EXT_texture3D");
        this.aBoolean7837 = anOpenGL7664.a("GL_ARB_texture_rectangle");
        this.aBoolean7863 = anOpenGL7664.a("GL_ARB_texture_cube_map");
        this.aBoolean7818 = anOpenGL7664.a("GL_ARB_texture_float");
        this.aBoolean7793 = false;
        this.aBoolean7820 = anOpenGL7664.a("GL_EXT_framebuffer_object");
        this.aBoolean7815 = anOpenGL7664.a("GL_EXT_framebuffer_blit");
        this.aBoolean7807 = anOpenGL7664.a("GL_EXT_framebuffer_multisample");
        aBoolean7822 = this.aBoolean7807 & this.aBoolean7815;
        OpenGL.glGetFloatv(2834, InputStream_Sub2.aFloatArray84, 0);
        aFloat7829 = InputStream_Sub2.aFloatArray84[0];
        aFloat7800 = InputStream_Sub2.aFloatArray84[1];
        return i_183_;
    }

    final void method3703(int i, int i_186_, int i_187_, int i_188_, int i_189_, int i_190_, aa var_aa, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_) {
        try {
            anInt7618++;
            if (i_187_ != i || i_188_ != i_186_) {
                aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
                Class258_Sub3_Sub1 class258_sub3_sub1 = var_aa_Sub1.aClass258_Sub3_Sub1_5193;
                method3792(90);
                method3771((byte) -122, var_aa_Sub1.aClass258_Sub3_Sub1_5193);
                method3753(i_190_, 1);
                method3729(7681, (byte) -61, 8448);
                method3762(34167, 768, (byte) -87, 0);
                float f = (class258_sub3_sub1.aFloat9937 / (float) (class258_sub3_sub1.anInt9940));
                float f_196_ = (class258_sub3_sub1.aFloat9938 / (float) (class258_sub3_sub1.anInt9939));
                float f_197_ = (float) -i + (float) i_187_;
                float f_198_ = (float) i_188_ - (float) i_186_;
                float f_199_ = (float) (1.0 / Math.sqrt(f_197_ * f_197_ + f_198_ * f_198_));
                OpenGL.glColor4ub((byte) (i_189_ >> 16), (byte) (i_189_ >> 8), (byte) i_189_, (byte) (i_189_ >> 24));
                f_197_ *= f_199_;
                f_198_ *= f_199_;
                i_195_ %= i_194_ + i_193_;
                float f_200_ = (float) i_193_ * f_197_;
                float f_201_ = f_198_ * (float) i_193_;
                float f_202_ = 0.0F;
                float f_203_ = 0.0F;
                float f_204_ = f_200_;
                float f_205_ = f_201_;
                if (i_195_ <= i_193_) {
                    f_204_ = f_197_ * (float) (-i_195_ + i_193_);
                    f_205_ = f_198_ * (float) (i_193_ + -i_195_);
                } else {
                    f_203_ = (float) (-i_195_ + (i_193_ - -i_194_)) * f_198_;
                    f_202_ = (float) (i_193_ - -i_194_ - i_195_) * f_197_;
                }
                float f_206_ = f_202_ + ((float) i + 0.35F);
                float f_207_ = (float) i_186_ + 0.35F + f_203_;
                float f_208_ = (float) i_194_ * f_197_;
                float f_209_ = (float) i_194_ * f_198_;
                for (; ; ) {
                    if (i < i_187_) {
                        if (f_206_ > 0.35F + (float) i_187_) break;
                        if ((float) i_187_ < f_206_ + f_204_) f_204_ = (float) i_187_ - f_206_;
                    } else {
                        if ((float) i_187_ + 0.35F > f_206_) break;
                        if ((float) i_187_ > f_206_ + f_204_) f_204_ = -f_206_ + (float) i_187_;
                    }
                    if (i_188_ <= i_186_) {
                        if (0.35F + (float) i_188_ > f_207_) break;
                        if ((float) i_188_ > f_207_ + f_205_) f_205_ = (float) i_188_ - f_207_;
                    } else {
                        if (f_207_ > 0.35F + (float) i_188_) break;
                        if ((float) i_188_ < f_205_ + f_207_) f_205_ = (float) i_188_ - f_207_;
                    }
                    OpenGL.glBegin(1);
                    OpenGL.glTexCoord2f(f * ((float) -i_191_ + f_206_), f_196_ * ((float) -i_192_ + f_207_));
                    OpenGL.glVertex2f(f_206_, f_207_);
                    OpenGL.glTexCoord2f((f_206_ + f_204_ - (float) i_191_) * f, (((float) -i_192_ + (f_207_ + f_205_)) * f_196_));
                    OpenGL.glVertex2f(f_204_ + f_206_, f_207_ + f_205_);
                    OpenGL.glEnd();
                    f_206_ += f_204_ + f_208_;
                    f_207_ += f_205_ + f_209_;
                    f_205_ = f_201_;
                    f_204_ = f_200_;
                }
                method3762(5890, 768, (byte) -87, 0);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.IF(" + i + ',' + i_186_ + ',' + i_187_ + ',' + i_188_ + ',' + i_189_ + ',' + i_190_ + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_191_ + ',' + i_192_ + ',' + i_193_ + ',' + i_194_ + ',' + i_195_ + ')'));
        }
    }

    final void X(int i) {
        this.anInt7731 = 0;
        anInt7521++;
        for (/**/; i > 1; i >>= 1)
            this.anInt7731++;
        this.anInt7733 = 1 << this.anInt7731;
    }

    final aa method3661(int i, int i_210_, int[] is, int[] is_211_) {
        try {
            anInt7589++;
            return RuntimeException_Sub1.method4009(i, is, is_211_, 0, this, i_210_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.RF(" + i + ',' + i_210_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_211_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method3632(int[] is) {
        try {
            is[0] = this.anInt7688;
            anInt7675++;
            is[1] = this.anInt7641;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.KE(" + (is != null ? "{...}" : "null") + ')');
        }
    }

    final void method3651(za var_za) {
        do {
            try {
                this.aNativeHeap7730 = ((za_Sub1) var_za).aNativeHeap9770;
                anInt7573++;
                if (anInterface2_7797 != null) break;
                Class348_Sub49_Sub1 class348_sub49_sub1 = new Class348_Sub49_Sub1(80);
                if (this.aBoolean7775) {
                    class348_sub49_sub1.method3400(-1.0F, (byte) -122);
                    class348_sub49_sub1.method3400(-1.0F, (byte) -103);
                    class348_sub49_sub1.method3400(0.0F, (byte) -113);
                    class348_sub49_sub1.method3400(0.0F, (byte) -112);
                    class348_sub49_sub1.method3400(1.0F, (byte) -124);
                    class348_sub49_sub1.method3400(1.0F, (byte) -99);
                    class348_sub49_sub1.method3400(-1.0F, (byte) -95);
                    class348_sub49_sub1.method3400(0.0F, (byte) -94);
                    class348_sub49_sub1.method3400(1.0F, (byte) -118);
                    class348_sub49_sub1.method3400(1.0F, (byte) -112);
                    class348_sub49_sub1.method3400(1.0F, (byte) -89);
                    class348_sub49_sub1.method3400(1.0F, (byte) -102);
                    class348_sub49_sub1.method3400(0.0F, (byte) -109);
                    class348_sub49_sub1.method3400(1.0F, (byte) -109);
                    class348_sub49_sub1.method3400(0.0F, (byte) -112);
                    class348_sub49_sub1.method3400(-1.0F, (byte) -101);
                    class348_sub49_sub1.method3400(1.0F, (byte) -93);
                    class348_sub49_sub1.method3400(0.0F, (byte) -123);
                    class348_sub49_sub1.method3400(0.0F, (byte) -110);
                    class348_sub49_sub1.method3400(0.0F, (byte) -113);
                } else {
                    class348_sub49_sub1.method3399(18291, -1.0F);
                    class348_sub49_sub1.method3399(18291, -1.0F);
                    class348_sub49_sub1.method3399(18291, 0.0F);
                    class348_sub49_sub1.method3399(18291, 0.0F);
                    class348_sub49_sub1.method3399(18291, 1.0F);
                    class348_sub49_sub1.method3399(18291, 1.0F);
                    class348_sub49_sub1.method3399(18291, -1.0F);
                    class348_sub49_sub1.method3399(18291, 0.0F);
                    class348_sub49_sub1.method3399(18291, 1.0F);
                    class348_sub49_sub1.method3399(18291, 1.0F);
                    class348_sub49_sub1.method3399(18291, 1.0F);
                    class348_sub49_sub1.method3399(18291, 1.0F);
                    class348_sub49_sub1.method3399(18291, 0.0F);
                    class348_sub49_sub1.method3399(18291, 1.0F);
                    class348_sub49_sub1.method3399(18291, 0.0F);
                    class348_sub49_sub1.method3399(18291, -1.0F);
                    class348_sub49_sub1.method3399(18291, 1.0F);
                    class348_sub49_sub1.method3399(18291, 0.0F);
                    class348_sub49_sub1.method3399(18291, 0.0F);
                    class348_sub49_sub1.method3399(18291, 0.0F);
                }
                anInterface2_7797 = method3731(2, false, 20, (class348_sub49_sub1.aByteArray7154), (class348_sub49_sub1.anInt7197));
                this.aClass123_7849 = new Class123(anInterface2_7797, 5126, 3, 0);
                this.aClass123_7833 = new Class123(anInterface2_7797, 5126, 2, 12);
                aClass233_7711.method1654(643267468, this);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, "qo.PF(" + (var_za != null ? "{...}" : "null") + ')');
            }
            break;
        } while (false);
    }

    final void A(int i, aa var_aa, int i_212_, int i_213_) {
        try {
            anInt7695++;
            aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
            Class258_Sub3_Sub1 class258_sub3_sub1 = var_aa_Sub1.aClass258_Sub3_Sub1_5193;
            method3792(119);
            method3771((byte) -88, var_aa_Sub1.aClass258_Sub3_Sub1_5193);
            method3753(1, 1);
            method3729(7681, (byte) -103, 8448);
            method3762(34167, 768, (byte) -87, 0);
            float f = (class258_sub3_sub1.aFloat9937 / (float) (class258_sub3_sub1.anInt9940));
            float f_214_ = (class258_sub3_sub1.aFloat9938 / (float) (class258_sub3_sub1.anInt9939));
            OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i >> 24));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(f * (float) (anInt7868 + -i_212_), (float) (anInt7773 + -i_213_) * f_214_);
            OpenGL.glVertex2i(anInt7868, anInt7773);
            OpenGL.glTexCoord2f(f * (float) (-i_212_ + anInt7868), f_214_ * (float) (-i_213_ + anInt7787));
            OpenGL.glVertex2i(anInt7868, anInt7787);
            OpenGL.glTexCoord2f((float) (-i_212_ + anInt7855) * f, (float) (anInt7787 + -i_213_) * f_214_);
            OpenGL.glVertex2i(anInt7855, anInt7787);
            OpenGL.glTexCoord2f(f * (float) (-i_212_ + anInt7855), f_214_ * (float) (-i_213_ + anInt7773));
            OpenGL.glVertex2i(anInt7855, anInt7773);
            OpenGL.glEnd();
            method3762(5890, 768, (byte) -87, 0);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.A(" + i + ',' + (var_aa != null ? "{...}" : "null") + ',' + i_212_ + ',' + i_213_ + ')'));
        }
    }

    final boolean method3694() {
        anInt7593++;
        return false;
    }

    final Interface13 method3624(int i, int i_215_) {
        anInt7679++;
        return null;
    }

    final void method3775(boolean bool, int i, int i_216_, int i_217_) {
        anInt7531++;
        if (bool != false) method3644();
        OpenGL.glTexEnvi(8960, 34184 + i, i_217_);
        OpenGL.glTexEnvi(8960, 34200 + i, i_216_);
    }

    private final void method3776(int i) {
        anInt7609++;
        if (i != 22544) this.aNativeHeap7730 = null;
        int i_218_ = 0;
        while (!anOpenGL7664.b()) {
            if (i_218_++ > 5) throw new RuntimeException("");
            Class286_Sub5.method2161((byte) -3, 1000L);
        }
    }

    final void method3688(int i, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_, int i_224_) {
        anInt7662++;
        OpenGL.glLineWidth((float) i_223_);
        method3709(i, i_219_, i_220_, i_221_, i_222_, i_224_);
        OpenGL.glLineWidth(1.0F);
    }

    final void ra(int i, int i_225_, int i_226_, int i_227_) {
        anInt7660++;
        this.anInt7788 = i;
        this.anInt7848 = i_226_;
        this.anInt7806 = i_225_;
        this.aBoolean7846 = true;
        this.anInt7809 = i_227_;
    }

    private final void method3777(int i) {
        anInt7632++;
        aFloatArray7779[10] = aFloat7854;
        aFloatArray7779[14] = aFloat7842;
        this.aFloat7875 = (float) anInt7814;
        if (i != -24051) this.aClass64_Sub3_7821 = null;
        this.aFloat7874 = (aFloatArray7779[14] - (float) anInt7814) / aFloatArray7779[10];
    }

    final void T(int i, int i_228_, int i_229_, int i_230_) {
        if (i_228_ > anInt7773) anInt7773 = i_228_;
        anInt7648++;
        if (anInt7787 > i_230_) anInt7787 = i_230_;
        if (i > anInt7868) anInt7868 = i;
        if (i_229_ < anInt7855) anInt7855 = i_229_;
        OpenGL.glEnable(3089);
        method3772((byte) 125);
        method3811((byte) 11);
    }

    final void method3669(Canvas canvas, int i, int i_231_) {
        do {
            try {
                anInt7701++;
                long l = 0L;
                if (canvas != null && aCanvas7626 != canvas) {
                    if (aHashtable7577.containsKey(canvas)) {
                        Long var_long = (Long) aHashtable7577.get(canvas);
                        l = var_long.longValue();
                    }
                } else l = aLong7553;
                if (l == 0L) throw new RuntimeException();
                anOpenGL7664.surfaceResized(l);
                if (aCanvas7575 != canvas) break;
                method3745((byte) 117);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.HF(" + (canvas != null ? "{...}" : "null") + ',' + i + ',' + i_231_ + ')'));
            }
            break;
        } while (false);
    }

    final Sprite method3711(int[] is, int i, int i_232_, int i_233_, int i_234_, boolean bool) {
        try {
            anInt7522++;
            return new Sprite_Sub2(this, i_233_, i_234_, is, i, i_232_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.BE(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_232_ + ',' + i_233_ + ',' + i_234_ + ',' + bool + ')'));
        }
    }

    private final void method3778(byte i) {
        if (anInt7765 != 1) {
            method3763(5888);
            method3807(false, 2);
            method3728(false, 48);
            method3752(107, false);
            method3748(0, false);
            method3771((byte) -122, null);
            method3757(-2, -45);
            method3761(0, 1);
            anInt7765 = 1;
        }
        if (i <= -115) anInt7594++;
    }

    private final void method3779(int i) {
        InputStream_Sub2.aFloatArray84[3] = 1.0F;
        anInt7588++;
        InputStream_Sub2.aFloatArray84[0] = this.aFloat7832 * this.aFloat7781;
        InputStream_Sub2.aFloatArray84[1] = this.aFloat7816 * this.aFloat7832;
        if (i == 29890) {
            InputStream_Sub2.aFloatArray84[2] = this.aFloat7823 * this.aFloat7832;
            OpenGL.glLightfv(16384, 4609, InputStream_Sub2.aFloatArray84, 0);
            InputStream_Sub2.aFloatArray84[2] = this.aFloat7823 * -this.aFloat7871;
            InputStream_Sub2.aFloatArray84[3] = 1.0F;
            InputStream_Sub2.aFloatArray84[1] = this.aFloat7816 * -this.aFloat7871;
            InputStream_Sub2.aFloatArray84[0] = this.aFloat7781 * -this.aFloat7871;
            OpenGL.glLightfv(16385, 4609, InputStream_Sub2.aFloatArray84, 0);
        }
    }

    final synchronized void method3780(int i, int i_235_, int i_236_) {
        anInt7616++;
        Class348_Sub35 class348_sub35 = new Class348_Sub35(i);
        class348_sub35.aLong4291 = i_236_;
        aClass262_7751.method1999(class348_sub35, -20180);
        if (i_235_ != -1) method3733(-17, -42, -40, null, true);
    }

    final int M() {
        anInt7562++;
        int i = anInt7881;
        anInt7881 = 0;
        return i;
    }

    final int method3781(byte i, int i_237_) {
        anInt7613++;
        if (i_237_ == 1) return 7681;
        if (i_237_ == 0) return 8448;
        if (i_237_ != 2) {
            if (i_237_ != 3) {
                if (i_237_ == 4) return 34023;
            } else return 260;
        } else return 34165;
        if (i != 17) anInt7814 = -39;
        throw new IllegalArgumentException();
    }

    final void method3782(Interface11 interface11, int i) {
        try {
            anInt7640++;
            if (anInt7738 >= 3) throw new RuntimeException();
            if (i != 327685) method3688(-94, -9, -90, -108, 41, -52, 70);
            if (anInt7738 >= 0) anInterface11Array7741[anInt7738].method45((byte) -47);
            anInterface11_7745 = anInterface11Array7741[++anInt7738] = interface11;
            anInterface11_7745.method49(-27141);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.HD(" + (interface11 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final void method3628(int i, int i_238_, int i_239_, int i_240_, int i_241_, int i_242_) {
        anInt7615++;
        float f = 0.35F + (float) i;
        float f_243_ = 0.35F + (float) i_238_;
        float f_244_ = f + (float) i_239_ - 1.0F;
        method3778((byte) -119);
        float f_245_ = -1.0F + (f_243_ + (float) i_240_);
        method3753(i_242_, 1);
        OpenGL.glColor4ub((byte) (i_241_ >> 16), (byte) (i_241_ >> 8), (byte) i_241_, (byte) (i_241_ >> 24));
        if (aBoolean7843) OpenGL.glDisable(32925);
        OpenGL.glBegin(2);
        OpenGL.glVertex2f(f, f_243_);
        OpenGL.glVertex2f(f, f_245_);
        OpenGL.glVertex2f(f_244_, f_245_);
        OpenGL.glVertex2f(f_244_, f_243_);
        OpenGL.glEnd();
        if (aBoolean7843) OpenGL.glEnable(32925);
    }

    final void H(int i, int i_246_, int i_247_, int[] is) {
        try {
            anInt7637++;
            float f = ((this.aClass101_Sub3_7760.aFloat5751) + ((float) i * (this.aClass101_Sub3_7760.aFloat5756) + (this.aClass101_Sub3_7760.aFloat5754) * (float) i_246_ + (this.aClass101_Sub3_7760.aFloat5784) * (float) i_247_));
            if (f == 0.0F) is[0] = is[1] = is[2] = -1;
            else {
                int i_248_ = (int) ((this.aClass101_Sub3_7760.aFloat5747 + ((this.aClass101_Sub3_7760.aFloat5781) * (float) i_247_ + ((this.aClass101_Sub3_7760.aFloat5750) * (float) i_246_ + (this.aClass101_Sub3_7760.aFloat5770) * (float) i))) * (float) this.anInt7771 / f);
                int i_249_ = (int) (((float) i * this.aClass101_Sub3_7760.aFloat5761 + (this.aClass101_Sub3_7760.aFloat5769) * (float) i_246_ + (this.aClass101_Sub3_7760.aFloat5762) * (float) i_247_ + (this.aClass101_Sub3_7760.aFloat5772)) * (float) this.anInt7794 / f);
                is[0] = (int) (-this.aFloat7872 + (float) i_248_);
                is[2] = (int) f;
                is[1] = (int) (-this.aFloat7836 + (float) i_249_);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.H(" + i + ',' + i_246_ + ',' + i_247_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    final Class101 method3654() {
        anInt7716++;
        return new Class101_Sub3();
    }

    final boolean method3671() {
        anInt7670++;
        if (aClass348_Sub5_Sub1_7721 != null) {
            if (!aClass348_Sub5_Sub1_7721.method2760((byte) 1)) {
                if (!aClass18_7720.method274(aClass348_Sub5_Sub1_7721, true)) return false;
                aClass354_7723.method3463((byte) -110);
            }
            return true;
        }
        return false;
    }

    private final void method3783(int i) {
        anInt7527++;
        int i_250_;
        for (i_250_ = i; anInt7862 > i_250_; i_250_++) {
            Class348_Sub1 class348_sub1 = aClass348_Sub1Array7858[i_250_];
            Class328_Sub1.aFloatArray6514[0] = (float) class348_sub1.method2724(-1);
            int i_251_ = i_250_ + 16386;
            Class328_Sub1.aFloatArray6514[1] = (float) class348_sub1.method2722(127);
            Class328_Sub1.aFloatArray6514[2] = (float) class348_sub1.method2717((byte) 77);
            Class328_Sub1.aFloatArray6514[3] = 1.0F;
            OpenGL.glLightfv(i_251_, 4611, Class328_Sub1.aFloatArray6514, 0);
            int i_252_ = class348_sub1.method2720(-1);
            float f = class348_sub1.method2721(-76) / 255.0F;
            Class328_Sub1.aFloatArray6514[2] = (float) Class139.method1166(i_252_, 255) * f;
            Class328_Sub1.aFloatArray6514[0] = ((float) (Class139.method1166(16762087, i_252_) >> 16) * f);
            Class328_Sub1.aFloatArray6514[1] = ((float) (Class139.method1166(i_252_, 65533) >> 8) * f);
            OpenGL.glLightfv(i_251_, 4609, Class328_Sub1.aFloatArray6514, 0);
            OpenGL.glLightf(i_251_, 4617, 1.0F / (float) (class348_sub1.method2723(-1) * class348_sub1.method2723(-1)));
            OpenGL.glEnable(i_251_);
        }
        for (/**/; anInt7839 > i_250_; i_250_++)
            OpenGL.glDisable(i_250_ + 16386);
        anInt7839 = anInt7862;
    }

    final void method3784(byte i) {
        if (anInt7765 != 8) {
            method3740(-14388);
            method3807(true, 2);
            method3752(114, true);
            method3748(i + 62, true);
            method3753(1, 1);
            anInt7765 = 8;
        }
        anInt7665++;
        if (i != -62) aCanvas7626 = null;
    }

    final int method3785(int i, int i_253_) {
        anInt7682++;
        if (i == 5121 || i == 5120) return 1;
        if (i_253_ != 4) this.aBoolean7793 = false;
        if (i == 5123 || i == 5122) return 2;
        if (i == 5125 || i == 5124 || i == 5126) return 4;
        throw new IllegalArgumentException("");
    }

    final void method3685(Class98 class98, int i) {
        try {
            aClass233_7711.method1651(this, (byte) -116, i, class98);
            anInt7687++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.FG(" + (class98 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    private final void method3786(boolean bool) {
        anInt7630++;
        aClass258Array7828 = new Class258[this.anInt7795];
        this.aClass258_Sub3_7827 = new Class258_Sub3(this, 3553, 6408, 1, 1);
        new Class258_Sub3(this, 3553, 6408, 1, 1);
        new Class258_Sub3(this, 3553, 6408, 1, 1);
        this.aClass64_Sub3_7864 = new Class64_Sub3(this);
        this.aClass64_Sub3_7838 = new Class64_Sub3(this);
        this.aClass64_Sub3_7803 = new Class64_Sub3(this);
        this.aClass64_Sub3_7834 = new Class64_Sub3(this);
        this.aClass64_Sub3_7840 = new Class64_Sub3(this);
        this.aClass64_Sub3_7780 = new Class64_Sub3(this);
        this.aClass64_Sub3_7802 = new Class64_Sub3(this);
        this.aClass64_Sub3_7821 = new Class64_Sub3(this);
        if (bool == false) {
            this.aClass64_Sub3_7844 = new Class64_Sub3(this);
            this.aClass64_Sub3_7785 = new Class64_Sub3(this);
            if (this.aBoolean7820) {
                this.aClass206_7778 = new Class206(this);
                new Class206(this);
            }
        }
    }

    private final void method3787(int i) {
        InputStream_Sub2.aFloatArray84[3] = 1.0F;
        anInt7661++;
        InputStream_Sub2.aFloatArray84[0] = this.aFloat7768 * this.aFloat7781;
        InputStream_Sub2.aFloatArray84[2] = this.aFloat7823 * this.aFloat7768;
        InputStream_Sub2.aFloatArray84[1] = this.aFloat7816 * this.aFloat7768;
        OpenGL.glLightModelfv(2899, InputStream_Sub2.aFloatArray84, 0);
        if (i >= -13) anInt7742 = 102;
    }

    final Class365 c() {
        anInt7607++;
        int i = -1;
        if (aString7845.indexOf("nvidia") == -1) {
            if (aString7845.indexOf("intel") != -1) i = 32902;
            else if (aString7845.indexOf("ati") != -1) i = 4098;
        } else i = 4318;
        return new Class365(i, "OpenGL", anInt7789, aString7790, 0L);
    }

    final void da(int i, int i_254_, int i_255_, int[] is) {
        try {
            anInt7528++;
            float f = (((float) i_254_ * (this.aClass101_Sub3_7760.aFloat5754)) + (this.aClass101_Sub3_7760.aFloat5756) * (float) i + (this.aClass101_Sub3_7760.aFloat5784) * (float) i_255_ + (this.aClass101_Sub3_7760.aFloat5751));
            if (f >= (float) this.anInt7826 && f <= (float) anInt7814) {
                int i_256_ = (int) ((float) this.anInt7771 * (((float) i_254_ * (this.aClass101_Sub3_7760.aFloat5750)) + (this.aClass101_Sub3_7760.aFloat5770) * (float) i + (this.aClass101_Sub3_7760.aFloat5781) * (float) i_255_ + (this.aClass101_Sub3_7760.aFloat5747)) / f);
                int i_257_ = (int) ((this.aClass101_Sub3_7760.aFloat5772 + (((float) i * (this.aClass101_Sub3_7760.aFloat5761)) + (this.aClass101_Sub3_7760.aFloat5769) * (float) i_254_ + (this.aClass101_Sub3_7760.aFloat5762) * (float) i_255_)) * (float) this.anInt7794 / f);
                if (!(this.aFloat7872 <= (float) i_256_) || !((float) i_256_ <= this.aFloat7835) || !(this.aFloat7836 <= (float) i_257_) || !(this.aFloat7830 >= (float) i_257_)) is[0] = is[1] = is[2] = -1;
                else {
                    is[2] = (int) f;
                    is[0] = (int) (-this.aFloat7872 + (float) i_256_);
                    is[1] = (int) (-this.aFloat7836 + (float) i_257_);
                }
            } else is[0] = is[1] = is[2] = -1;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.da(" + i + ',' + i_254_ + ',' + i_255_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    final void method3788(int i) {
        anInt7647++;
        if (i == -18516) OpenGL.glPushMatrix();
    }

    final void F(int i, int i_258_) {
        anInt7719++;
    }

    final void method3687(Interface4 interface4) {
        try {
            anInt7590++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.IA(" + (interface4 != null ? "{...}" : "null") + ')');
        }
    }

    final void KA(int i, int i_259_, int i_260_, int i_261_) {
        if (i_259_ < 0) i_259_ = 0;
        anInt7717++;
        if (i_260_ > this.anInt7688) i_260_ = this.anInt7688;
        if (i < 0) i = 0;
        if (i_261_ > this.anInt7641) i_261_ = this.anInt7641;
        anInt7855 = i_260_;
        anInt7787 = i_261_;
        anInt7773 = i_259_;
        anInt7868 = i;
        OpenGL.glEnable(3089);
        method3772((byte) 126);
        method3811((byte) 11);
    }

    final void method3789(byte i, float f) {
        if (aFloat7851 != f) {
            aFloat7851 = f;
            if (anInt7865 == 3) method3747((byte) -63);
        }
        if (i <= -101) anInt7545++;
    }

    final void la() {
        anInt7773 = 0;
        anInt7642++;
        anInt7787 = this.anInt7641;
        anInt7855 = this.anInt7688;
        anInt7868 = 0;
        OpenGL.glDisable(3089);
        method3772((byte) 125);
    }

    final void C(boolean bool) {
        aBoolean7870 = bool;
        anInt7602++;
        method3795(-30199);
    }

    final void method3663() {
        anInt7604++;
    }

    final void method3790(int i, int i_262_, int i_263_) {
        if (i > 94) {
            anInt7724++;
            anInt7867 = i_262_;
            anInt7770 = i_263_;
            method3809(true);
            method3811((byte) 11);
        }
    }

    final int JA(int i, int i_264_, int i_265_, int i_266_, int i_267_, int i_268_) {
        anInt7652++;
        int i_269_ = 0;
        float f = (((float) i_265_ * (this.aClass101_Sub3_7760.aFloat5784)) + ((float) i * this.aClass101_Sub3_7760.aFloat5756 + ((float) i_264_ * (this.aClass101_Sub3_7760.aFloat5754))) + (this.aClass101_Sub3_7760.aFloat5751));
        if (f < 1.0F) f = 1.0F;
        float f_270_ = (((float) i_268_ * (this.aClass101_Sub3_7760.aFloat5784)) + (((float) i_267_ * (this.aClass101_Sub3_7760.aFloat5754)) + (this.aClass101_Sub3_7760.aFloat5756) * (float) i_266_) + (this.aClass101_Sub3_7760.aFloat5751));
        if (f_270_ < 1.0F) f_270_ = 1.0F;
        if (!((float) this.anInt7826 > f) || !((float) this.anInt7826 > f_270_)) {
            if (f > (float) anInt7814 && f_270_ > (float) anInt7814) i_269_ |= 0x20;
        } else i_269_ |= 0x10;
        int i_271_ = (int) (((this.aClass101_Sub3_7760.aFloat5781) * (float) i_265_ + ((this.aClass101_Sub3_7760.aFloat5750 * (float) i_264_) + (this.aClass101_Sub3_7760.aFloat5770 * (float) i)) + (this.aClass101_Sub3_7760.aFloat5747)) * (float) this.anInt7771 / f);
        int i_272_ = (int) ((float) this.anInt7771 * (((float) i_268_ * this.aClass101_Sub3_7760.aFloat5781) + ((this.aClass101_Sub3_7760.aFloat5770 * (float) i_266_) + (this.aClass101_Sub3_7760.aFloat5750 * (float) i_267_)) + this.aClass101_Sub3_7760.aFloat5747) / f_270_);
        if (!((float) i_271_ < this.aFloat7872) || !(this.aFloat7872 > (float) i_272_)) {
            if ((float) i_271_ > this.aFloat7835 && (float) i_272_ > this.aFloat7835) i_269_ |= 0x2;
        } else i_269_ |= 0x1;
        int i_273_ = (int) ((float) this.anInt7794 * ((this.aClass101_Sub3_7760.aFloat5762) * (float) i_265_ + ((float) i_264_ * this.aClass101_Sub3_7760.aFloat5769 + (float) i * this.aClass101_Sub3_7760.aFloat5761) + this.aClass101_Sub3_7760.aFloat5772) / f);
        int i_274_ = (int) (((this.aClass101_Sub3_7760.aFloat5772) + (((float) i_266_ * this.aClass101_Sub3_7760.aFloat5761) + (float) i_267_ * this.aClass101_Sub3_7760.aFloat5769 + (this.aClass101_Sub3_7760.aFloat5762 * (float) i_268_))) * (float) this.anInt7794 / f_270_);
        if (!((float) i_273_ < this.aFloat7836) || !(this.aFloat7836 > (float) i_274_)) {
            if ((float) i_273_ > this.aFloat7830 && (float) i_274_ > this.aFloat7830) i_269_ |= 0x8;
        } else i_269_ |= 0x4;
        return i_269_;
    }

    final boolean method3693() {
        anInt7684++;
        return true;
    }

    final Sprite method3629(int i, int i_275_, boolean bool) {
        anInt7625++;
        return new Sprite_Sub2(this, i, i_275_, bool);
    }

    final void method3678(int i) {
        anInt7663++;
        method3797(0);
    }

    private final void method3791(int i) {
        anInt7543++;
        method3757(-2, -69);
        for (int i_276_ = this.anInt7795 - 1; i_276_ >= 0; i_276_--) {
            method3738(-15039, i_276_);
            method3771((byte) -88, null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
        }
        method3729(8448, (byte) 119, 8448);
        method3762(34168, 770, (byte) -87, 2);
        method3767(-21974);
        anInt7764 = 1;
        OpenGL.glEnable(3042);
        OpenGL.glBlendFunc(770, 771);
        anInt7762 = 1;
        OpenGL.glEnable(3008);
        OpenGL.glAlphaFunc(516, 0.0F);
        aBoolean7761 = true;
        OpenGL.glColorMask(true, true, true, true);
        aBoolean7758 = true;
        method3807(true, 2);
        method3728(true, 71);
        method3752(124, true);
        method3748(0, true);
        method3755(i ^ ~0x651d);
        anOpenGL7664.setSwapInterval(0);
        OpenGL.glShadeModel(7425);
        OpenGL.glClearDepth(1.0F);
        OpenGL.glDepthFunc(515);
        OpenGL.glPolygonMode(1028, 6914);
        OpenGL.glEnable(2884);
        OpenGL.glCullFace(1029);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glColorMaterial(1028, 5634);
        OpenGL.glEnable(2903);
        float[] fs = {0.0F, 0.0F, 0.0F, 1.0F};
        for (int i_277_ = 0; i_277_ < 8; i_277_++) {
            int i_278_ = 16384 + i_277_;
            OpenGL.glLightfv(i_278_, 4608, fs, 0);
            OpenGL.glLightf(i_278_, 4615, 0.0F);
            OpenGL.glLightf(i_278_, 4616, 0.0F);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        OpenGL.glFogf(2914, 0.95F);
        OpenGL.glFogi(2917, 9729);
        if (i != 25858) this.aClass64_Sub3_7864 = null;
        OpenGL.glHint(3156, 4353);
        anInt7808 = this.anInt7856 = -1;
        la();
    }

    final void method3792(int i) {
        if (i < 45) method3777(-72);
        if (anInt7765 != 2) {
            method3763(5888);
            method3807(false, 2);
            method3728(false, 66);
            method3752(115, false);
            method3748(0, false);
            method3757(-2, -67);
            anInt7765 = 2;
        }
        anInt7608++;
    }

    final int I() {
        anInt7551++;
        int i = anInt7878;
        anInt7878 = 0;
        return i;
    }

    final void method3793(int i, Interface8 interface8) {
        do {
            try {
                if (i == 1) {
                    anInt7560++;
                    if (anInterface8_7817 == interface8) break;
                    if (aBoolean7873) OpenGL.glBindBufferARB(34963, interface8.method33(-23923));
                    anInterface8_7817 = interface8;
                }
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.OE(" + i + ',' + (interface8 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final void method3794(Class123 class123, Class123 class123_279_, int i, Class123 class123_280_, Class123 class123_281_) {
        try {
            if (class123 != null) {
                method3750(i + 26493, class123.anInterface2_1811);
                OpenGL.glVertexPointer(class123.aByte1814, class123.aShort1810, anInterface2_7852.method13((byte) -97), (anInterface2_7852.method12((byte) 42) - -(long) (class123.aByte1812)));
                OpenGL.glEnableClientState(32884);
            } else OpenGL.glDisableClientState(32884);
            anInt7529++;
            if (class123_281_ != null) {
                method3750(56, class123_281_.anInterface2_1811);
                OpenGL.glNormalPointer(class123_281_.aShort1810, anInterface2_7852.method13((byte) -97), (anInterface2_7852.method12((byte) 42) - -(long) (class123_281_.aByte1812)));
                OpenGL.glEnableClientState(32885);
            } else OpenGL.glDisableClientState(32885);
            if (class123_279_ != null) {
                method3750(67, class123_279_.anInterface2_1811);
                OpenGL.glColorPointer(class123_279_.aByte1814, class123_279_.aShort1810, anInterface2_7852.method13((byte) -97), (anInterface2_7852.method12((byte) 42) + (long) (class123_279_.aByte1812)));
                OpenGL.glEnableClientState(32886);
            } else OpenGL.glDisableClientState(32886);
            if (i == -26411) {
                if (class123_280_ != null) {
                    method3750(119, class123_280_.anInterface2_1811);
                    OpenGL.glTexCoordPointer(class123_280_.aByte1814, class123_280_.aShort1810, anInterface2_7852.method13((byte) -97), (anInterface2_7852.method12((byte) 42) - -(long) class123_280_.aByte1812));
                    OpenGL.glEnableClientState(32888);
                } else OpenGL.glDisableClientState(32888);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.KB(" + (class123 != null ? "{...}" : "null") + ',' + (class123_279_ != null ? "{...}" : "null") + ',' + i + ',' + (class123_280_ != null ? "{...}" : "null") + ',' + (class123_281_ != null ? "{...}" : "null") + ')'));
        }
    }

    final int method3704() {
        anInt7672++;
        return 4;
    }

    final Interface4 method3634(Interface3 interface3, Interface13 interface13) {
        try {
            anInt7596++;
            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.NB(" + (interface3 != null ? "{...}" : "null") + ',' + (interface13 != null ? "{...}" : "null") + ')'));
        }
    }

    final Class101 method3640() {
        anInt7650++;
        return this.aClass101_Sub3_7760;
    }

    private final void method3795(int i) {
        OpenGL.glDepthMask(aBoolean7759 && aBoolean7870);
        anInt7578++;
        if (i != -30199) K(null);
    }

    final Class101 method3705() {
        anInt7587++;
        return aClass101_Sub3_7725;
    }

    final int i() {
        anInt7628++;
        return this.anInt7826;
    }

    final void ya() {
        anInt7534++;
        method3748(0, true);
        OpenGL.glClear(256);
    }

    final void method3647(boolean bool) {
        anInt7691++;
    }

    final void method3796(int i) {
        OpenGL.glLightfv(i, 4611, this.aFloatArray7825, 0);
        anInt7536++;
        OpenGL.glLightfv(16385, 4611, aFloatArray7811, 0);
    }

    final boolean method3639() {
        anInt7667++;
        return aClass100_7707.method889((byte) -91, 3);
    }

    final boolean method3666() {
        anInt7537++;
        return aClass348_Sub5_Sub1_7721 != null && aClass348_Sub5_Sub1_7721.method2760((byte) 1);
    }

    final void method3642(int i, Class348_Sub1[] class348_sub1s) {
        do {
            try {
                for (int i_282_ = 0; i_282_ < i; i_282_++)
                    aClass348_Sub1Array7858[i_282_] = class348_sub1s[i_282_];
                anInt7610++;
                anInt7862 = i;
                if (anInt7865 == 1) break;
                method3783(0);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.FF(" + i + ',' + (class348_sub1s != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    final void method3630(boolean bool) {
        anInt7620++;
    }

    private final void method3797(int i) {
        if (i != 0) this.anIntArray7883 = null;
        anInt7546++;
        anOpenGL7664.a();
    }

    final void pa() {
        anInt7524++;
        this.aBoolean7846 = false;
    }

    final int r(int i, int i_283_, int i_284_, int i_285_, int i_286_, int i_287_, int i_288_) {
        anInt7669++;
        float f = (((float) i_284_ * (this.aClass101_Sub3_7760.aFloat5784)) + ((float) i_283_ * (this.aClass101_Sub3_7760.aFloat5754) + (float) i * (this.aClass101_Sub3_7760.aFloat5756)) + (this.aClass101_Sub3_7760.aFloat5751));
        float f_289_ = (((float) i_287_ * (this.aClass101_Sub3_7760.aFloat5784)) + ((this.aClass101_Sub3_7760.aFloat5756) * (float) i_285_ + ((float) i_286_ * (this.aClass101_Sub3_7760.aFloat5754))) + (this.aClass101_Sub3_7760.aFloat5751));
        int i_290_ = 0;
        if (!(f < (float) this.anInt7826) || !((float) this.anInt7826 > f_289_)) {
            if ((float) anInt7814 < f && f_289_ > (float) anInt7814) i_290_ |= 0x20;
        } else i_290_ |= 0x10;
        int i_291_ = (int) ((float) this.anInt7771 * ((this.aClass101_Sub3_7760.aFloat5781) * (float) i_284_ + ((this.aClass101_Sub3_7760.aFloat5750 * (float) i_283_) + (this.aClass101_Sub3_7760.aFloat5770 * (float) i)) + this.aClass101_Sub3_7760.aFloat5747) / (float) i_288_);
        int i_292_ = (int) ((float) this.anInt7771 * ((this.aClass101_Sub3_7760.aFloat5747) + ((this.aClass101_Sub3_7760.aFloat5781 * (float) i_287_) + (((float) i_285_ * (this.aClass101_Sub3_7760.aFloat5770)) + (this.aClass101_Sub3_7760.aFloat5750) * (float) i_286_))) / (float) i_288_);
        if (!(this.aFloat7872 > (float) i_291_) || !(this.aFloat7872 > (float) i_292_)) {
            if (this.aFloat7835 < (float) i_291_ && (float) i_292_ > this.aFloat7835) i_290_ |= 0x2;
        } else i_290_ |= 0x1;
        int i_293_ = (int) (((this.aClass101_Sub3_7760.aFloat5772) + ((this.aClass101_Sub3_7760.aFloat5762 * (float) i_284_) + ((this.aClass101_Sub3_7760.aFloat5761 * (float) i) + ((float) i_283_ * (this.aClass101_Sub3_7760.aFloat5769))))) * (float) this.anInt7794 / (float) i_288_);
        int i_294_ = (int) ((float) this.anInt7794 * (((float) i_287_ * this.aClass101_Sub3_7760.aFloat5762) + ((float) i_286_ * this.aClass101_Sub3_7760.aFloat5769 + (this.aClass101_Sub3_7760.aFloat5761 * (float) i_285_)) + this.aClass101_Sub3_7760.aFloat5772) / (float) i_288_);
        if (!(this.aFloat7836 > (float) i_293_) || !((float) i_294_ < this.aFloat7836)) {
            if ((float) i_293_ > this.aFloat7830 && this.aFloat7830 < (float) i_294_) i_290_ |= 0x8;
        } else i_290_ |= 0x4;
        return i_290_;
    }

    final int method3798(int i, int i_295_) {
        anInt7698++;
        if (i_295_ != 2) this.aFloat7872 = -1.3399854F;
        if (i != 6406 && i != 6409) {
            if (i != 6410 && i != 34846 && i != 34844) {
                if (i == 6407) return 3;
                if (i == 6408 || i == 34847) return 4;
                if (i == 34843) return 6;
                if (i == 34842) return 8;
                if (i == 6402) return 3;
                if (i == 6401) return 1;
            } else return 2;
        } else return 1;
        throw new IllegalArgumentException("");
    }

    private final void method3799(float f, float f_296_, float f_297_, byte i) {
        OpenGL.glMatrixMode(5890);
        anInt7585++;
        if (aBoolean7860) OpenGL.glLoadIdentity();
        OpenGL.glTranslatef(f_297_, f, f_296_);
        int i_298_ = -9 / ((81 - i) / 44);
        OpenGL.glMatrixMode(5888);
        aBoolean7860 = true;
    }

    final synchronized void method3800(int i, int i_299_) {
        anInt7570++;
        Class348_Sub35 class348_sub35 = new Class348_Sub35(i_299_);
        if (i > 71) aClass262_7753.method1999(class348_sub35, -20180);
    }

    final void method3698() {
        aClass18_7720.method272(-53);
        anInt7595++;
    }

    final void P(int i, int i_300_, int i_301_, int i_302_, int i_303_) {
        method3778((byte) -124);
        anInt7583++;
        method3753(i_303_, 1);
        float f = 0.35F + (float) i;
        OpenGL.glColor4ub((byte) (i_302_ >> 16), (byte) (i_302_ >> 8), (byte) i_302_, (byte) (i_302_ >> 24));
        float f_304_ = (float) i_300_ + 0.35F;
        OpenGL.glBegin(1);
        OpenGL.glVertex2f(f, f_304_);
        OpenGL.glVertex2f(f, (float) i_301_ + f_304_);
        OpenGL.glEnd();
    }

    final int E() {
        anInt7539++;
        return (anInt7750 + this.anInt7748 + this.anInt7747);
    }

    final Class299 method3706(Class299 class299, Class299 class299_305_, float f, Class299 class299_306_) {
        try {
            anInt7658++;
            if (class299 != null && class299_305_ != null && this.aBoolean7863 && this.aBoolean7820) {
                Class299_Sub1_Sub2 class299_sub1_sub2 = null;
                Class299_Sub1 class299_sub1 = (Class299_Sub1) class299;
                Class299_Sub1 class299_sub1_307_ = (Class299_Sub1) class299_305_;
                Class258_Sub2 class258_sub2 = class299_sub1.method2256((byte) -121);
                Class258_Sub2 class258_sub2_308_ = class299_sub1_307_.method2256((byte) -121);
                if (class258_sub2 != null && class258_sub2_308_ != null) {
                    int i = (Math.max(class258_sub2_308_.anInt8538, class258_sub2.anInt8538));
                    if (class299_306_ != class299 && class299_305_ != class299_306_ && class299_306_ instanceof Class299_Sub1_Sub2) {
                        Class299_Sub1_Sub2 class299_sub1_sub2_309_ = (Class299_Sub1_Sub2) class299_306_;
                        if (i == class299_sub1_sub2_309_.method2262(65534)) class299_sub1_sub2 = class299_sub1_sub2_309_;
                    }
                    if (class299_sub1_sub2 == null) class299_sub1_sub2 = new Class299_Sub1_Sub2(this, i);
                    if (class299_sub1_sub2.method2261(class258_sub2, f, 65534, class258_sub2_308_)) return class299_sub1_sub2;
                }
            }
            if (f < 0.5F) return class299;
            return class299_305_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.SD(" + (class299 != null ? "{...}" : "null") + ',' + (class299_305_ != null ? "{...}" : "null") + ',' + f + ',' + (class299_306_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method3677(Canvas canvas) {
        try {
            aCanvas7575 = null;
            anInt7621++;
            aLong7636 = 0L;
            if (canvas == null || canvas == aCanvas7626) {
                aCanvas7575 = aCanvas7626;
                aLong7636 = aLong7553;
            } else if (aHashtable7577.containsKey(canvas)) {
                Long var_long = (Long) aHashtable7577.get(canvas);
                aLong7636 = var_long.longValue();
                aCanvas7575 = canvas;
            }
            if (aCanvas7575 == null || aLong7636 == 0L) throw new RuntimeException();
            anOpenGL7664.setSurface(aLong7636);
            method3745((byte) 92);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.MF(" + (canvas != null ? "{...}" : "null") + ')');
        }
    }

    final void method3801(boolean bool, int i, int i_310_) {
        int i_311_ = 57 / ((39 - i_310_) / 52);
        anInt7644++;
        method3746(bool, i, true, 115);
    }

    final int method3667(int i, int i_312_) {
        anInt7627++;
        return i_312_ ^ i & i_312_;
    }

    final void method3707(Rectangle[] rectangles, int i, int i_313_, int i_314_) throws Exception_Sub1 {
        try {
            method3626(i_313_, i_314_);
            anInt7584++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.UA(" + (rectangles != null ? "{...}" : "null") + ',' + i + ',' + i_313_ + ',' + i_314_ + ')'));
        }
    }

    static final void method3802(int i, int i_315_, int i_316_, int i_317_, int i_318_, int i_319_, int i_320_) {
        anInt7572++;
        int i_321_ = Class328_Sub1.anInt6513;
        Class88.anInt1497 = 0;
        int[] is = Class286_Sub7.anIntArray6290;
        for (int i_322_ = 0; (i_322_ < Class150.anInt2057 + i_321_); i_322_++) {
            Class79 class79 = null;
            Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3;
            if (i_321_ > i_322_) class318_sub1_sub3_sub3 = (Class294.aPlayerArray5058[is[i_322_]]);
            else {
                class318_sub1_sub3_sub3 = (((Class348_Sub22) Class282.aClass356_3654.method3480(Class74.anIntArray1233[i_322_ + -i_321_], i_316_ ^ ~0x1775)).aNpc_6859);
                class79 = ((Npc) class318_sub1_sub3_sub3).aClass79_10505;
                if (class79.anIntArray1377 != null) {
                    class79 = class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209), i_316_ + -3);
                    if (class79 == null) continue;
                }
            }
            if ((class318_sub1_sub3_sub3.anInt10285 >= 0) && (((class318_sub1_sub3_sub3.anInt10301) == Class239_Sub15.anInt6006) || ((Class132.aPlayer_1907.plane) == class318_sub1_sub3_sub3.plane))) {
                Class348_Sub13.method2801(class318_sub1_sub3_sub3.method2426(200), i_318_ >> 1, i_320_, i_319_, i_315_ >> 1, class318_sub1_sub3_sub3, (byte) 100);
                if (Class239_Sub21.anIntArray6062[0] >= 0) {
                    if ((class318_sub1_sub3_sub3.aString10292) != null && (i_321_ <= i_322_ || za.anInt7276 == 0 || za.anInt7276 == 3 || (za.anInt7276 == 1 && (Class348_Sub11.method2797(((Player) class318_sub1_sub3_sub3).aString10544, (byte) -63)))) && Class88.anInt1497 < Class309.anInt4814) {
                        Class309.anIntArray4819[Class88.anInt1497] = ((Class369.aFontMetrics_4962.width(true, class318_sub1_sub3_sub3.aString10292)) / 2);
                        Class309.anIntArray4822[Class88.anInt1497] = Class239_Sub21.anIntArray6062[0];
                        Class309.anIntArray4813[Class88.anInt1497] = Class239_Sub21.anIntArray6062[1];
                        Class309.anIntArray4817[Class88.anInt1497] = class318_sub1_sub3_sub3.anInt10201;
                        Class309.anIntArray4806[Class88.anInt1497] = class318_sub1_sub3_sub3.anInt10234;
                        Class309.anIntArray4812[Class88.anInt1497] = class318_sub1_sub3_sub3.anInt10264;
                        Class309.aStringArray4818[Class88.anInt1497] = class318_sub1_sub3_sub3.aString10292;
                        Class88.anInt1497++;
                    }
                    int i_323_ = Class239_Sub21.anIntArray6062[1] + i;
                    if (!(class318_sub1_sub3_sub3.aBoolean10309) && (Class367_Sub11.anInt7396 < class318_sub1_sub3_sub3.anInt10223)) {
                        int i_324_ = -1;
                        int i_325_ = 1;
                        if (i_321_ <= i_322_) {
                            i_324_ = class79.anInt1373;
                            if (i_324_ == -1) i_324_ = (class318_sub1_sub3_sub3.method2422((byte) 72).anInt2909);
                        } else {
                            Player player = (Class294.aPlayerArray5058[is[i_322_]]);
                            i_324_ = (class318_sub1_sub3_sub3.method2422((byte) 72).anInt2909);
                            if (player.aBoolean10554) i_325_ = 2;
                        }
                        Sprite[] sprites = Class348_Sub45.aSpriteArray7107;
                        if (i_324_ != -1) {
                            Sprite[] spriteS_326_ = ((Sprite[]) (Class353.aClass60_4346.method583(i_324_, i_316_ ^ ~0x79)));
                            if (spriteS_326_ == null) {
                                Class207[] class207s = Class207.method1519(Class21.aClass45_322, i_324_, 0);
                                if (class207s != null) {
                                    spriteS_326_ = new Sprite[class207s.length];
                                    for (int i_327_ = 0; class207s.length > i_327_; i_327_++)
                                        spriteS_326_[i_327_] = (Class348_Sub8.aHa6654.method3691(class207s[i_327_], true));
                                    Class353.aClass60_4346.method582(spriteS_326_, i_324_, (byte) -94);
                                }
                            }
                            if (spriteS_326_ != null && spriteS_326_.length >= 2) sprites = spriteS_326_;
                        }
                        if (sprites.length <= i_325_) i_325_ = 1;
                        Sprite sprite = sprites[0];
                        Sprite sprite_328_ = sprites[i_325_];
                        i_323_ -= Math.max((Class369.aFontMetrics_4962.topPadding), sprite.method969());
                        int i_329_ = (Class239_Sub21.anIntArray6062[0] + (i_317_ + -(sprite.method971() >> 1)));
                        int i_330_ = (sprite.method971() * class318_sub1_sub3_sub3.anInt10295 / 255);
                        int i_331_ = sprite.method969();
                        if (class318_sub1_sub3_sub3.anInt10295 > 0 && i_330_ < 2) i_330_ = 2;
                        sprite.method974(i_329_, i_323_);
                        Class348_Sub8.aHa6654.T(i_329_, i_323_, i_330_ + i_329_, i_331_ + i_323_);
                        sprite_328_.method974(i_329_, i_323_);
                        Class348_Sub8.aHa6654.KA(i_317_, i, i_317_ - -i_318_, i_315_ + i);
                        Class338.method2663(-5590, i_329_, i_329_ + sprite.scaleWidth(), i_323_, i_323_ + i_331_);
                    } else i_323_ -= Math.max((Class369.aFontMetrics_4962.topPadding), Class348_Sub45.aSpriteArray7107[0].method969());
                    i_323_ -= 2;
                    if (!class318_sub1_sub3_sub3.aBoolean10309) {
                        if (class318_sub1_sub3_sub3.anInt10287 > Class367_Sub11.anInt7396) {
                            Sprite sprite = (Class239_Sub2.aSpriteArray5857[(class318_sub1_sub3_sub3.aBoolean10226 ? 2 : 0)]);
                            Sprite sprite_332_ = (Class239_Sub2.aSpriteArray5857[(!class318_sub1_sub3_sub3.aBoolean10226 ? 1 : 3)]);
                            int i_333_ = -1;
                            if (class318_sub1_sub3_sub3 instanceof Npc) {
                                i_333_ = class79.anInt1382;
                                if (i_333_ == -1) i_333_ = (class318_sub1_sub3_sub3.method2422((byte) 72).anInt2923);
                            } else i_333_ = (class318_sub1_sub3_sub3.method2422((byte) 72).anInt2923);
                            if (i_333_ != -1) {
                                Sprite[] sprites = ((Sprite[]) Class328_Sub2.aClass60_6517.method583(i_333_, -45));
                                if (sprites == null) {
                                    Class207[] class207s = Class207.method1519((Class21.aClass45_322), i_333_, 0);
                                    if (class207s != null) {
                                        sprites = new Sprite[class207s.length];
                                        for (int i_334_ = 0; (class207s.length > i_334_); i_334_++)
                                            sprites[i_334_] = (Class348_Sub8.aHa6654.method3691(class207s[i_334_], true));
                                        Class328_Sub2.aClass60_6517.method582(sprites, i_333_, (byte) -101);
                                    }
                                }
                                if (sprites != null && sprites.length == 4) {
                                    sprite_332_ = (sprites[!(class318_sub1_sub3_sub3.aBoolean10226) ? 1 : 3]);
                                    sprite = (sprites[!(class318_sub1_sub3_sub3.aBoolean10226) ? 0 : 2]);
                                }
                            }
                            int i_335_ = (-Class367_Sub11.anInt7396 + class318_sub1_sub3_sub3.anInt10287);
                            int i_336_;
                            if (i_335_ > class318_sub1_sub3_sub3.anInt10227) {
                                i_335_ -= class318_sub1_sub3_sub3.anInt10227;
                                int i_337_ = (class318_sub1_sub3_sub3.anInt10271 != 0 ? (class318_sub1_sub3_sub3.anInt10271 * (((class318_sub1_sub3_sub3.anInt10210) - i_335_) / (class318_sub1_sub3_sub3.anInt10271))) : 0);
                                i_336_ = (sprite.method971() * i_337_ / class318_sub1_sub3_sub3.anInt10210);
                            } else i_336_ = sprite.method971();
                            int i_338_ = sprite.method969();
                            i_323_ -= i_338_;
                            int i_339_ = (Class239_Sub21.anIntArray6062[0] + (i_317_ + -(sprite.method971() >> 1)));
                            sprite.method974(i_339_, i_323_);
                            Class348_Sub8.aHa6654.T(i_339_, i_323_, i_339_ - -i_336_, i_323_ - -i_338_);
                            sprite_332_.method974(i_339_, i_323_);
                            Class348_Sub8.aHa6654.KA(i_317_, i, i_318_ + i_317_, i - -i_315_);
                            Class338.method2663(-5590, i_339_, sprite.scaleWidth() + i_339_, i_323_, i_338_ + i_323_);
                            i_323_ -= 2;
                        }
                        if (i_322_ < i_321_) {
                            Player player = ((Player) class318_sub1_sub3_sub3);
                            if (player.anInt10540 != -1) {
                                i_323_ -= 25;
                                Sprite sprite = (Class318_Sub1_Sub1_Sub1.aSpriteArray9959[(player.anInt10540)]);
                                sprite.method974((-12 + i_317_ + (Class239_Sub21.anIntArray6062[0])), i_323_);
                                Class338.method2663(-5590, i_317_ + (Class239_Sub21.anIntArray6062[0] + -12), (i_317_ - -Class239_Sub21.anIntArray6062[0] + (-12 + sprite.scaleWidth())), i_323_, i_323_ + sprite.method980());
                                i_323_ -= 2;
                            }
                            if (player.anInt10522 != -1) {
                                i_323_ -= 25;
                                Sprite sprite = (Class264.aSpriteArray3378[(player.anInt10522)]);
                                sprite.method974((-12 + i_317_ + (Class239_Sub21.anIntArray6062[0])), i_323_);
                                Class338.method2663(-5590, (-12 + Class239_Sub21.anIntArray6062[0] + i_317_), (Class239_Sub21.anIntArray6062[0] + i_317_ - (12 + -sprite.scaleWidth())), i_323_, i_323_ - -sprite.method980());
                                i_323_ -= 2;
                            }
                        } else if (class79.anInt1375 >= 0 && (class79.anInt1375 < Class264.aSpriteArray3378.length)) {
                            Sprite sprite = (Class264.aSpriteArray3378[class79.anInt1375]);
                            i_323_ -= 25;
                            sprite.method974((i_317_ + (Class239_Sub21.anIntArray6062[0]) + -(sprite.method971() >> 1)), i_323_);
                            Class338.method2663(-5590, (Class239_Sub21.anIntArray6062[0] + (i_317_ - (sprite.method971() >> 1))), (Class239_Sub21.anIntArray6062[0] + (i_317_ - (sprite.method971() >> 1)) + sprite.scaleWidth()), i_323_, sprite.method980() + i_323_);
                            i_323_ -= 2;
                        }
                    }
                    if (class318_sub1_sub3_sub3 instanceof Player) {
                        if (i_322_ >= 0) {
                            int i_340_ = 0;
                            Class302[] class302s = Class348_Sub27.aClass302Array6897;
                            for (int i_341_ = 0; (i_341_ < class302s.length); i_341_++) {
                                Class302 class302 = class302s[i_341_];
                                if (class302 != null && class302.anInt3840 == 10 && (is[i_322_] == class302.anInt3833)) {
                                    Sprite sprite = (Class239_Sub9.aSpriteArray5933[class302.anInt3831]);
                                    if (i_340_ < sprite.method969()) i_340_ = sprite.method969();
                                    sprite.method974(-12 + ((Class239_Sub21.anIntArray6062[0]) + i_317_), (i_323_ + -sprite.method969()));
                                    Class338.method2663(-5590, -12 + (i_317_ - -(Class239_Sub21.anIntArray6062[0])), (i_317_ + (Class239_Sub21.anIntArray6062[0] + -12 - -sprite.scaleWidth())), -sprite.method969() + i_323_, (i_323_ + -sprite.method969() - -sprite.method980()));
                                }
                            }
                            if (i_340_ > 0) i_323_ -= 2 + i_340_;
                        }
                    } else {
                        int i_342_ = 0;
                        Class302[] class302s = Class348_Sub27.aClass302Array6897;
                        for (int i_343_ = 0; class302s.length > i_343_; i_343_++) {
                            Class302 class302 = class302s[i_343_];
                            if (class302 != null && class302.anInt3840 == 1 && (class302.anInt3833 == Class74.anIntArray1233[i_322_ - i_321_])) {
                                Sprite sprite = (Class239_Sub9.aSpriteArray5933[class302.anInt3831]);
                                if (sprite.method969() > i_342_) i_342_ = sprite.method969();
                                if (Class367_Sub11.anInt7396 % 20 < 10) {
                                    sprite.method974((-12 + i_317_ + Class239_Sub21.anIntArray6062[0]), i_323_ + -sprite.method969());
                                    Class338.method2663(-5590, (-12 + i_317_ - -Class239_Sub21.anIntArray6062[0]), (Class239_Sub21.anIntArray6062[0] + (i_317_ + -12) - -sprite.scaleWidth()), -sprite.method969() + i_323_, (-sprite.method969() + (i_323_ - -sprite.method980())));
                                }
                            }
                        }
                        if (i_342_ > 0) i_323_ -= 2 + i_342_;
                    }
                    int i_344_ = 0;
                    for (/**/; i_344_ < Class132.anInt1905; i_344_++) {
                        int i_345_ = (class318_sub1_sub3_sub3.anIntArray10219[i_344_]);
                        int i_346_ = (class318_sub1_sub3_sub3.anIntArray10259[i_344_]);
                        Class31 class31 = null;
                        int i_347_ = 0;
                        if (i_346_ >= 0) {
                            if (i_345_ <= Class367_Sub11.anInt7396) continue;
                            class31 = (Class73.aClass219_4782.method1601(46, (class318_sub1_sub3_sub3.anIntArray10259[i_344_])));
                            i_347_ = class31.anInt434;
                        } else if (i_345_ < 0) continue;
                        int i_348_ = (class318_sub1_sub3_sub3.anIntArray10304[i_344_]);
                        Class31 class31_349_ = null;
                        if (i_348_ >= 0) class31_349_ = Class73.aClass219_4782.method1601(46, i_348_);
                        if (-i_347_ + i_345_ <= Class367_Sub11.anInt7396) {
                            int i_350_ = (class318_sub1_sub3_sub3.anIntArray10303[i_344_]);
                            if (i_350_ >= 0) {
                                class318_sub1_sub3_sub3.anInt10223 = 300 + Class367_Sub11.anInt7396;
                                class318_sub1_sub3_sub3.anInt10295 = i_350_;
                                class318_sub1_sub3_sub3.anIntArray10303[i_344_] = -1;
                            }
                            if (class31 == null) class318_sub1_sub3_sub3.anIntArray10219[i_344_] = -1;
                            else {
                                int i_351_ = (class318_sub1_sub3_sub3.method2426(200) / 2);
                                Class348_Sub13.method2801(i_351_, i_318_ >> 1, i_320_, i_319_, i_315_ >> 1, class318_sub1_sub3_sub3, (byte) -107);
                                if (Class239_Sub21.anIntArray6062[0] > -1) {
                                    Class239_Sub21.anIntArray6062[0] += Class118.anIntArray1786[i_344_];
                                    Class239_Sub21.anIntArray6062[1] += Class106.anIntArray1636[i_344_];
                                    Object object = null;
                                    Object object_352_ = null;
                                    Object object_353_ = null;
                                    Object object_354_ = null;
                                    int i_355_ = 0;
                                    int i_356_ = 0;
                                    int i_357_ = 0;
                                    int i_358_ = 0;
                                    int i_359_ = 0;
                                    int i_360_ = 0;
                                    int i_361_ = 0;
                                    int i_362_ = 0;
                                    Sprite sprite = null;
                                    Sprite sprite_363_ = null;
                                    Sprite sprite_364_ = null;
                                    Sprite sprite_365_ = null;
                                    int i_366_ = 0;
                                    int i_367_ = 0;
                                    int i_368_ = 0;
                                    int i_369_ = 0;
                                    int i_370_ = 0;
                                    int i_371_ = 0;
                                    int i_372_ = 0;
                                    int i_373_ = 0;
                                    int i_374_ = 0;
                                    Sprite sprite_375_ = class31.method327((Class348_Sub8.aHa6654), (byte) -96);
                                    if (sprite_375_ != null) {
                                        i_355_ = sprite_375_.method971();
                                        int i_376_ = sprite_375_.method969();
                                        sprite_375_.method984(Class151.anIntArray2062);
                                        if (i_374_ < i_376_) i_374_ = i_376_;
                                        i_359_ = Class151.anIntArray2062[0];
                                    }
                                    Sprite sprite_377_ = class31.method331((Class348_Sub8.aHa6654), (byte) -75);
                                    if (sprite_377_ != null) {
                                        i_356_ = sprite_377_.method971();
                                        int i_378_ = sprite_377_.method969();
                                        sprite_377_.method984(Class151.anIntArray2062);
                                        if (i_378_ > i_374_) i_374_ = i_378_;
                                        i_360_ = Class151.anIntArray2062[0];
                                    }
                                    Sprite sprite_379_ = class31.method324((Class348_Sub8.aHa6654), true);
                                    if (sprite_379_ != null) {
                                        i_357_ = sprite_379_.method971();
                                        int i_380_ = sprite_379_.method969();
                                        if (i_374_ < i_380_) i_374_ = i_380_;
                                        sprite_379_.method984(Class151.anIntArray2062);
                                        i_361_ = Class151.anIntArray2062[0];
                                    }
                                    Sprite sprite_381_ = class31.method325((Class348_Sub8.aHa6654), 105);
                                    if (sprite_381_ != null) {
                                        i_358_ = sprite_381_.method971();
                                        int i_382_ = sprite_381_.method969();
                                        sprite_381_.method984(Class151.anIntArray2062);
                                        if (i_374_ < i_382_) i_374_ = i_382_;
                                        i_362_ = Class151.anIntArray2062[0];
                                    }
                                    if (class31_349_ != null) {
                                        sprite = (class31_349_.method327(Class348_Sub8.aHa6654, (byte) 110));
                                        if (sprite != null) {
                                            i_366_ = sprite.method971();
                                            int i_383_ = sprite.method969();
                                            if (i_383_ > i_374_) i_374_ = i_383_;
                                            sprite.method984(Class151.anIntArray2062);
                                            i_370_ = Class151.anIntArray2062[0];
                                        }
                                        sprite_363_ = (class31_349_.method331(Class348_Sub8.aHa6654, (byte) -80));
                                        if (sprite_363_ != null) {
                                            i_367_ = sprite_363_.method971();
                                            int i_384_ = sprite_363_.method969();
                                            if (i_384_ > i_374_) i_374_ = i_384_;
                                            sprite_363_.method984(Class151.anIntArray2062);
                                            i_371_ = Class151.anIntArray2062[0];
                                        }
                                        sprite_364_ = (class31_349_.method324(Class348_Sub8.aHa6654, true));
                                        if (sprite_364_ != null) {
                                            i_368_ = sprite_364_.method971();
                                            int i_385_ = sprite_364_.method969();
                                            sprite_364_.method984(Class151.anIntArray2062);
                                            if (i_385_ > i_374_) i_374_ = i_385_;
                                            i_372_ = Class151.anIntArray2062[0];
                                        }
                                        sprite_365_ = (class31_349_.method325(Class348_Sub8.aHa6654, i_316_ ^ 0x35));
                                        if (sprite_365_ != null) {
                                            i_369_ = sprite_365_.method971();
                                            int i_386_ = sprite_365_.method969();
                                            if (i_386_ > i_374_) i_374_ = i_386_;
                                            sprite_365_.method984(Class151.anIntArray2062);
                                            i_373_ = Class151.anIntArray2062[0];
                                        }
                                    }
                                    FontRenderer fontRenderer = Class240.aFontRenderer_4684;
                                    FontRenderer fontRenderer_387_ = Class240.aFontRenderer_4684;
                                    FontMetrics fontMetrics = Class258_Sub1.aFontMetrics_8527;
                                    int i_388_ = class31.anInt435;
                                    FontMetrics fontMetrics_389_ = Class258_Sub1.aFontMetrics_8527;
                                    if (i_388_ >= 0) {
                                        FontRenderer fontRenderer_390_ = Class14.method232((Class348_Sub8.aHa6654), (byte) -53, true, i_388_);
                                        FontMetrics fontMetrics_391_ = (Class135.method1151(-25411, Class348_Sub8.aHa6654, i_388_));
                                        if (fontRenderer_390_ != null && fontMetrics_391_ != null) {
                                            fontRenderer = fontRenderer_390_;
                                            fontMetrics = fontMetrics_391_;
                                        }
                                    }
                                    if (class31_349_ != null) {
                                        i_388_ = (class31_349_.anInt435);
                                        if (i_388_ >= 0) {
                                            FontRenderer fontRenderer_392_ = (Class14.method232(Class348_Sub8.aHa6654, (byte) -53, true, i_388_));
                                            FontMetrics fontMetrics_393_ = (Class135.method1151(-25411, Class348_Sub8.aHa6654, i_388_));
                                            if (fontRenderer_392_ != null && fontMetrics_393_ != null) {
                                                fontMetrics_389_ = fontMetrics_393_;
                                                fontRenderer_387_ = fontRenderer_392_;
                                            }
                                        }
                                    }
                                    Object object_394_ = null;
                                    String string = null;
                                    boolean bool = false;
                                    int i_395_ = 0;
                                    String string_396_ = (class31.method333((class318_sub1_sub3_sub3.anIntArray10229[i_344_]), 0));
                                    int i_397_ = fontMetrics.width(true, string_396_);
                                    if (class31_349_ != null) {
                                        string = (class31_349_.method333((class318_sub1_sub3_sub3.anIntArray10284[i_344_]), 0));
                                        i_395_ = fontMetrics_389_.width(true, string);
                                    }
                                    int i_398_ = 0;
                                    if (i_356_ > 0) i_398_ = i_397_ / i_356_ + 1;
                                    int i_399_ = 0;
                                    if (class31_349_ != null && i_367_ > 0) i_399_ = i_395_ / i_367_ - -1;
                                    int i_400_ = 0;
                                    int i_401_ = i_400_;
                                    if (i_355_ > 0) i_400_ += i_355_;
                                    i_400_ += 2;
                                    int i_402_ = i_400_;
                                    if (i_357_ > 0) i_400_ += i_357_;
                                    int i_403_ = i_400_;
                                    int i_404_ = i_400_;
                                    if (i_356_ <= 0) i_400_ += i_397_;
                                    else {
                                        int i_405_ = i_356_ * i_398_;
                                        i_404_ += (i_405_ + -i_397_) / 2;
                                        i_400_ += i_405_;
                                    }
                                    int i_406_ = i_400_;
                                    if (i_358_ > 0) i_400_ += i_358_;
                                    int i_407_ = 0;
                                    int i_408_ = 0;
                                    int i_409_ = 0;
                                    int i_410_ = 0;
                                    int i_411_ = 0;
                                    if (class31_349_ != null) {
                                        i_400_ += 2;
                                        i_407_ = i_400_;
                                        if (i_366_ > 0) i_400_ += i_366_;
                                        i_400_ += 2;
                                        i_408_ = i_400_;
                                        if (i_368_ > 0) i_400_ += i_368_;
                                        i_411_ = i_400_;
                                        i_409_ = i_400_;
                                        if (i_367_ > 0) {
                                            int i_412_ = i_399_ * i_367_;
                                            i_411_ += (i_412_ - i_395_) / 2;
                                            i_400_ += i_412_;
                                        } else i_400_ += i_395_;
                                        i_410_ = i_400_;
                                        if (i_369_ > 0) i_400_ += i_369_;
                                    }
                                    int i_413_ = (-Class367_Sub11.anInt7396 + (class318_sub1_sub3_sub3.anIntArray10219[i_344_]));
                                    int i_414_ = (-(class31.anInt424 * i_413_ / class31.anInt434) + class31.anInt424);
                                    int i_415_ = (-class31.anInt422 + (class31.anInt422 * i_413_ / class31.anInt434));
                                    int i_416_ = (i_317_ + Class239_Sub21.anIntArray6062[0] + -(i_400_ >> 1) - -i_414_);
                                    int i_417_ = -12 + (i + ((Class239_Sub21.anIntArray6062[1]) - -i_415_));
                                    int i_418_ = i_417_;
                                    int i_419_ = i_417_ + i_374_;
                                    int i_420_ = 15 + (i_417_ - -(class31.anInt420));
                                    int i_421_ = (i_420_ + -fontMetrics.topPadding);
                                    int i_422_ = (i_420_ - -fontMetrics.bottomPadding);
                                    if (i_418_ > i_421_) i_418_ = i_421_;
                                    if (i_419_ < i_422_) i_419_ = i_422_;
                                    int i_423_ = 0;
                                    if (class31_349_ != null) {
                                        i_423_ = 15 + (i_417_ - -(class31_349_.anInt420));
                                        int i_424_ = (-(fontMetrics_389_.topPadding) + i_423_);
                                        if (i_424_ < i_418_) i_418_ = i_424_;
                                        int i_425_ = ((fontMetrics_389_.bottomPadding) + i_423_);
                                        if (i_419_ < i_425_) i_419_ = i_425_;
                                    }
                                    int i_426_ = 255;
                                    if (class31.anInt426 >= 0) i_426_ = ((i_413_ << 8) / (-class31.anInt426 + (class31.anInt434)));
                                    if (i_426_ >= 0 && i_426_ < 255) {
                                        int i_427_ = i_426_ << 24;
                                        int i_428_ = 0xffffff | i_427_;
                                        if (sprite_375_ != null) sprite_375_.method964((-i_359_ + i_401_ + i_416_), i_417_, 0, i_428_, 1);
                                        if (sprite_379_ != null) sprite_379_.method964((-i_361_ + i_402_ + i_416_), i_417_, 0, i_428_, 1);
                                        if (sprite_377_ != null) {
                                            for (int i_429_ = 0; (i_398_ > i_429_); i_429_++)
                                                sprite_377_.method964((i_403_ + (i_416_ + (-i_360_ - -(i_356_ * i_429_)))), i_417_, 0, i_428_, 1);
                                        }
                                        if (sprite_381_ != null) sprite_381_.method964(i_406_ + i_416_ + -i_362_, i_417_, 0, i_428_, 1);
                                        fontRenderer.method2576(string_396_, (class31.anInt444 | i_427_), i_420_, i_404_ + i_416_, 0, -124);
                                        if (class31_349_ != null) {
                                            if (sprite != null) sprite.method964((i_416_ + i_407_ - i_370_), i_417_, 0, i_428_, 1);
                                            if (sprite_364_ != null) sprite_364_.method964(-i_372_ + (i_408_ + i_416_), i_417_, 0, i_428_, 1);
                                            if (sprite_363_ != null) {
                                                for (int i_430_ = 0; i_430_ < i_399_; i_430_++)
                                                    sprite_363_.method964((i_430_ * i_367_ + i_416_ + (i_409_ + -i_371_)), i_417_, 0, i_428_, 1);
                                            }
                                            if (sprite_365_ != null) sprite_365_.method964((i_416_ - -i_410_ + -i_373_), i_417_, 0, i_428_, 1);
                                            fontRenderer_387_.method2576(string, (i_427_ | (class31_349_.anInt444)), i_423_, i_416_ + i_411_, 0, -125);
                                        }
                                    } else {
                                        if (sprite_375_ != null) sprite_375_.method974(i_416_ - (-i_401_ + i_359_), i_417_);
                                        if (sprite_379_ != null) sprite_379_.method974(i_416_ - (-i_402_ - -i_361_), i_417_);
                                        if (sprite_377_ != null) {
                                            for (int i_431_ = 0; i_431_ < i_398_; i_431_++)
                                                sprite_377_.method974((i_403_ + i_416_ - (i_360_ - i_431_ * i_356_)), i_417_);
                                        }
                                        if (sprite_381_ != null) sprite_381_.method974(i_406_ + (i_416_ + -i_362_), i_417_);
                                        fontRenderer.method2576(string_396_, (class31.anInt444 | ~0xffffff), i_420_, i_416_ + i_404_, 0, i_316_ ^ ~0x74);
                                        if (class31_349_ != null) {
                                            if (sprite != null) sprite.method974((-i_370_ + i_416_ + i_407_), i_417_);
                                            if (sprite_364_ != null) sprite_364_.method974(i_408_ + (i_416_ + -i_372_), i_417_);
                                            if (sprite_363_ != null) {
                                                for (int i_432_ = 0; i_399_ > i_432_; i_432_++)
                                                    sprite_363_.method974((i_432_ * i_367_ + (-i_371_ + i_416_ + i_409_)), i_417_);
                                            }
                                            if (sprite_365_ != null) sprite_365_.method974(i_410_ + i_416_ - i_373_, i_417_);
                                            fontRenderer_387_.method2576(string, (class31_349_.anInt444) | ~0xffffff, i_423_, i_411_ + i_416_, 0, -119);
                                        }
                                    }
                                    Class338.method2663(-5590, i_416_, i_416_ + i_400_, i_418_, 1 + i_419_);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i_433_ = 0; i_433_ < Class45.anInt669; i_433_++) {
            int i_434_ = Class258_Sub4.anIntArray8557[i_433_];
            Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3;
            if (i_434_ >= 2048) class318_sub1_sub3_sub3 = (((Class348_Sub22) Class282.aClass356_3654.method3480(-2048 + i_434_, -6008)).aNpc_6859);
            else class318_sub1_sub3_sub3 = Class294.aPlayerArray5058[i_434_];
            int i_435_ = Class268.anIntArray3432[i_433_];
            Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3_436_;
            if (i_435_ >= 2048) class318_sub1_sub3_sub3_436_ = (((Class348_Sub22) Class282.aClass356_3654.method3480(-2048 + i_435_, -6008)).aNpc_6859);
            else class318_sub1_sub3_sub3_436_ = Class294.aPlayerArray5058[i_435_];
            Class191.method1430(--class318_sub1_sub3_sub3.anInt10261, (byte) 119, i_320_, i_315_, i, i_319_, i_318_, i_317_, class318_sub1_sub3_sub3_436_, class318_sub1_sub3_sub3);
        }
        int i_437_ = i_316_ + (Class369.aFontMetrics_4962.bottomPadding + Class369.aFontMetrics_4962.topPadding);
        for (int i_438_ = 0; i_438_ < Class88.anInt1497; i_438_++) {
            int i_439_ = Class309.anIntArray4822[i_438_];
            int i_440_ = Class309.anIntArray4813[i_438_];
            int i_441_ = Class309.anIntArray4819[i_438_];
            boolean bool = true;
            while (bool) {
                bool = false;
                for (int i_442_ = 0; i_438_ > i_442_; i_442_++) {
                    if (i_440_ - -2 > Class309.anIntArray4813[i_442_] + -i_437_ && (-i_437_ + i_440_ < 2 + Class309.anIntArray4813[i_442_]) && ((Class309.anIntArray4822[i_442_] - -Class309.anIntArray4819[i_442_]) > i_439_ + -i_441_) && ((-Class309.anIntArray4819[i_442_] + Class309.anIntArray4822[i_442_]) < i_439_ + i_441_) && (-i_437_ + Class309.anIntArray4813[i_442_] < i_440_)) {
                        i_440_ = -i_437_ + Class309.anIntArray4813[i_442_];
                        bool = true;
                    }
                }
            }
            Class309.anIntArray4813[i_438_] = i_440_;
            String string = Class309.aStringArray4818[i_438_];
            int i_443_ = Class369.aFontMetrics_4962.width(true, string);
            int i_444_ = i_439_ + i_317_;
            int i_445_ = -Class369.aFontMetrics_4962.topPadding + i_440_ + i;
            int i_446_ = i_444_ - -i_443_;
            int i_447_ = i_440_ + i - -Class369.aFontMetrics_4962.bottomPadding;
            if (Class348_Sub40_Sub31.anInt9408 == 0) {
                int i_448_ = 16776960;
                if (Class309.anIntArray4817[i_438_] < 6) i_448_ = (Class115.anIntArray1757[Class309.anIntArray4817[i_438_]]);
                if (Class309.anIntArray4817[i_438_] == 6) i_448_ = (Class239_Sub15.anInt6006 % 20 >= 10 ? 16776960 : 16711680);
                if (Class309.anIntArray4817[i_438_] == 7) i_448_ = Class239_Sub15.anInt6006 % 20 < 10 ? 255 : 65535;
                if (Class309.anIntArray4817[i_438_] == 8) i_448_ = (Class239_Sub15.anInt6006 % 20 >= 10 ? 8454016 : 45056);
                if (Class309.anIntArray4817[i_438_] == 9) {
                    int i_449_ = -Class309.anIntArray4812[i_438_] + 150;
                    if (i_449_ < 50) i_448_ = 1280 * i_449_ + 16711680;
                    else if (i_449_ < 100) i_448_ = -(327680 * i_449_) + 16384000 + 16776960;
                    else if (i_449_ < 150) i_448_ = 5 * (-100 + i_449_) + 65280;
                }
                if (Class309.anIntArray4817[i_438_] == 10) {
                    int i_450_ = 150 - Class309.anIntArray4812[i_438_];
                    if (i_450_ >= 50) {
                        if (i_450_ >= 100) {
                            if (i_450_ < 150) i_448_ = (-(5 * i_450_) - -500 + 327680 * i_450_ - 32767745);
                        } else i_448_ = 33095935 + -(327680 * i_450_);
                    } else i_448_ = 16711680 + 5 * i_450_;
                }
                if (Class309.anIntArray4817[i_438_] == 11) {
                    int i_451_ = 150 - Class309.anIntArray4812[i_438_];
                    if (i_451_ >= 50) {
                        if (i_451_ < 100) i_448_ = 327685 * (-50 + i_451_) + 65280;
                        else if (i_451_ < 150) i_448_ = 16777215 + -(327680 * (i_451_ - 100));
                    } else i_448_ = 16777215 + -(i_451_ * 327685);
                }
                int i_452_ = ~0xffffff | i_448_;
                if (Class309.anIntArray4806[i_438_] == 0) {
                    Class262.aFontRenderer_3326.method2575((byte) 115, i_439_ + i_317_, i_452_, string, -16777216, i_440_ + i);
                    i_444_ -= i_443_ >> 1;
                    i_446_ -= i_443_ >> 1;
                }
                if (Class309.anIntArray4806[i_438_] == 1) {
                    i_446_ -= i_443_ >> 1;
                    i_444_ -= i_443_ >> 1;
                    Class262.aFontRenderer_3326.method2574(i_452_, i_440_ + i, string, i_317_ - -i_439_, -16777216, Class239_Sub15.anInt6006, false);
                    i_447_ += 5;
                    i_445_ -= 5;
                }
                if (Class309.anIntArray4806[i_438_] == 2) {
                    i_447_ += 5;
                    i_446_ -= -5 + (i_443_ >> 1);
                    Class262.aFontRenderer_3326.method2581(string, i_452_, (Class239_Sub15.anInt6006), i_440_ + i, (byte) -112, -16777216, i_317_ - -i_439_);
                    i_445_ -= 5;
                    i_444_ -= (i_443_ >> 1) - -5;
                }
                if (Class309.anIntArray4806[i_438_] == 3) {
                    i_446_ -= i_443_ >> 1;
                    i_444_ -= i_443_ >> 1;
                    i_447_ += 7;
                    Class262.aFontRenderer_3326.method2577(Class239_Sub15.anInt6006, i + i_440_, string, i_452_, -16777216, 150 + -Class309.anIntArray4812[i_438_], i_439_ + i_317_, -20509);
                    i_445_ -= 7;
                }
                if (Class309.anIntArray4806[i_438_] == 4) {
                    int i_453_ = ((150 + -Class309.anIntArray4812[i_438_]) * (Class369.aFontMetrics_4962.width(true, string) + 100) / 150);
                    Class348_Sub8.aHa6654.T(i_317_ - (-i_439_ - -50), i, 50 + (i_439_ + i_317_), i - -i_315_);
                    i_444_ += 50 - i_453_;
                    i_446_ += -i_453_ + 50;
                    Class262.aFontRenderer_3326.method2576(string, i_452_, i + i_440_, (i_317_ - (-i_439_ - 50) - i_453_), -16777216, i_316_ + -125);
                    Class348_Sub8.aHa6654.KA(i_317_, i, i_318_ + i_317_, i + i_315_);
                }
                if (Class309.anIntArray4806[i_438_] == 5) {
                    int i_454_ = 150 + -Class309.anIntArray4812[i_438_];
                    int i_455_ = 0;
                    if (i_454_ >= 25) {
                        if (i_454_ > 125) i_455_ = i_454_ + -125;
                    } else i_455_ = i_454_ - 25;
                    int i_456_ = (Class369.aFontMetrics_4962.bottomPadding + Class369.aFontMetrics_4962.topPadding);
                    Class348_Sub8.aHa6654.T(i_317_, i_440_ + i - (i_456_ - -1), i_318_ + i_317_, 5 + i_440_ + i);
                    i_444_ -= i_443_ >> 1;
                    i_447_ += i_455_;
                    Class262.aFontRenderer_3326.method2575((byte) -105, i_439_ + i_317_, i_452_, string, -16777216, i_455_ + (i + i_440_));
                    i_445_ += i_455_;
                    i_446_ -= i_443_ >> 1;
                    Class348_Sub8.aHa6654.KA(i_317_, i, i_318_ + i_317_, i_315_ + i);
                }
            } else {
                i_444_ -= i_443_ >> 1;
                i_446_ -= i_443_ >> 1;
                Class262.aFontRenderer_3326.method2575((byte) 118, i_439_ + i_317_, -256, string, -16777216, i_440_ + i);
            }
            Class338.method2663(i_316_ + -5592, i_444_, 1 + i_446_, i_445_, 1 + i_447_);
        }
    }

    private final void method3803(int i) {
        aFloat7824 = -aFloat7786 + (float) (anInt7814 - this.anInt7813);
        anInt7639++;
        this.aFloat7792 = aFloat7824 - aFloat7857 * (float) this.anInt7782;
        if ((float) this.anInt7826 > this.aFloat7792) this.aFloat7792 = (float) this.anInt7826;
        OpenGL.glFogf(2915, this.aFloat7792);
        OpenGL.glFogf(2916, aFloat7824);
        InputStream_Sub2.aFloatArray84[0] = ((float) Class139.method1166(i, this.anInt7856) / 1.671168E7F);
        InputStream_Sub2.aFloatArray84[1] = ((float) Class139.method1166(this.anInt7856, 65280) / 65280.0F);
        InputStream_Sub2.aFloatArray84[2] = ((float) Class139.method1166(this.anInt7856, 255) / 255.0F);
        OpenGL.glFogfv(2918, InputStream_Sub2.aFloatArray84, 0);
    }

    final void method3804(boolean bool, byte i) {
        if (!bool == aBoolean7805) {
            aBoolean7805 = bool;
            method3768((byte) -117);
        }
        if (i < -56) anInt7564++;
    }

    final void method3626(int i, int i_457_) throws Exception_Sub1 {
        try {
            anOpenGL7664.swapBuffers();
        } catch (Exception exception) {
            /* empty */
        }
        anInt7624++;
    }

    final void f(int i, int i_458_) {
        anInt7606++;
        if (i != this.anInt7826 || anInt7814 != i_458_) {
            this.anInt7826 = i;
            anInt7814 = i_458_;
            method3806(98);
            method3803(16711680);
            if (anInt7865 == 3) method3747((byte) -63);
            else if (anInt7865 == 2) method3730((byte) 121);
        }
    }

    final void method3658(int i, int i_459_, int i_460_, int i_461_) {
        aClass18_7720.method275(i_460_, i, i_461_, i_459_, -1);
        anInt7651++;
    }

    final void method3805(int i, Interface11 interface11) {
        try {
            anInt7697++;
            if (anInt7738 < 0 || interface11 != anInterface11Array7741[anInt7738]) throw new RuntimeException();
            anInterface11Array7741[anInt7738--] = null;
            interface11.method45((byte) -47);
            if (i == 8387) {
                if (anInt7738 < 0) anInterface11_7745 = null;
                else {
                    anInterface11_7745 = anInterface11Array7741[anInt7738];
                    anInterface11_7745.method49(-27141);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.CA(" + i + ',' + (interface11 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method3631(int i) {
        anInt7520++;
        if (i != 1) throw new IllegalArgumentException("");
    }

    final Interface3 method3665(int i, int i_462_) {
        anInt7561++;
        return null;
    }

    private final void method3806(int i) {
        anInt7614++;
        float[] fs = aFloatArray7779;
        float f = ((float) (this.anInt7826 * -this.anInt7853) / (float) this.anInt7771);
        float f_463_ = ((float) ((this.anInt7688 - this.anInt7853) * this.anInt7826) / (float) this.anInt7771);
        if (i < 28) aClass258_Sub3_Sub1_7776 = null;
        float f_464_ = ((float) (this.anInt7826 * this.anInt7810) / (float) this.anInt7794);
        float f_465_ = ((float) ((this.anInt7810 + -this.anInt7641) * this.anInt7826) / (float) this.anInt7794);
        if (f_463_ == f || f_465_ == f_464_) {
            fs[13] = 0.0F;
            fs[15] = 1.0F;
            fs[3] = 0.0F;
            fs[11] = 0.0F;
            fs[12] = 0.0F;
            fs[4] = 0.0F;
            fs[6] = 0.0F;
            fs[8] = 0.0F;
            fs[7] = 0.0F;
            fs[1] = 0.0F;
            fs[10] = 1.0F;
            fs[14] = 0.0F;
            fs[5] = 1.0F;
            fs[0] = 1.0F;
            fs[9] = 0.0F;
            fs[2] = 0.0F;
        } else {
            float f_466_ = 2.0F * (float) this.anInt7826;
            fs[1] = 0.0F;
            fs[5] = f_466_ / (f_464_ - f_465_);
            fs[9] = (f_464_ + f_465_) / (-f_465_ + f_464_);
            fs[3] = 0.0F;
            fs[4] = 0.0F;
            fs[8] = (f_463_ + f) / (f_463_ - f);
            fs[7] = 0.0F;
            fs[14] = aFloat7842 = (-((float) anInt7814 * f_466_) / (float) (-this.anInt7826 + anInt7814));
            fs[2] = 0.0F;
            fs[11] = -1.0F;
            fs[15] = 0.0F;
            fs[10] = aFloat7854 = ((float) -(anInt7814 - -this.anInt7826) / (float) (-this.anInt7826 + anInt7814));
            fs[12] = 0.0F;
            fs[0] = f_466_ / (-f + f_463_);
            fs[13] = 0.0F;
            fs[6] = 0.0F;
        }
        method3777(-24051);
    }

    final void method3633() {
        anInt7692++;
        OpenGL.glFinish();
    }

    final Sprite method3691(Class207 class207, boolean bool) {
        try {
            anInt7657++;
            int[] is = new int[(class207.anInt2702 * class207.anInt2696)];
            int i = 0;
            int i_467_ = 0;
            if (class207.aByteArray2695 == null) {
                for (int i_470_ = 0; class207.anInt2696 > i_470_; i_470_++) {
                    for (int i_471_ = 0; (class207.anInt2702 > i_471_); i_471_++) {
                        int i_472_ = (class207.anIntArray2697[0xff & (class207.aByteArray2699[i++])]);
                        is[i_467_++] = i_472_ == 0 ? 0 : Class273.method2057(-16777216, i_472_);
                    }
                }
            } else {
                for (int i_468_ = 0; class207.anInt2696 > i_468_; i_468_++) {
                    for (int i_469_ = 0; (i_469_ < class207.anInt2702); i_469_++) {
                        is[i_467_++] = (Class273.method2057((class207.aByteArray2695[i] << 24), (class207.anIntArray2697[Class139.method1166((class207.aByteArray2699[i]), 255)])));
                        i++;
                    }
                }
            }
            Sprite sprite = this.method3662(class207.anInt2702, is, (byte) 94, 0, class207.anInt2702, class207.anInt2696);
            sprite.method985(class207.anInt2703, class207.anInt2700, class207.anInt2698, class207.anInt2701);
            return sprite;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.GF(" + (class207 != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    final void method3807(boolean bool, int i) {
        if (i != 2) anInt7814 = -59;
        anInt7517++;
        if (!bool != !aBoolean7801) {
            aBoolean7801 = bool;
            method3732(-87);
            anInt7765 &= ~0x1f;
        }
    }

    final void method3808(int i, int i_473_) {
        InputStream_Sub2.aFloatArray84[2] = (float) Class139.method1166(i, 255) / 255.0F;
        if (i_473_ <= 116) this.anInt7771 = 76;
        InputStream_Sub2.aFloatArray84[3] = (float) (i >>> 24) / 255.0F;
        InputStream_Sub2.aFloatArray84[1] = (float) Class139.method1166(i, 65280) / 65280.0F;
        anInt7659++;
        InputStream_Sub2.aFloatArray84[0] = (float) Class139.method1166(16711680, i) / 1.671168E7F;
        OpenGL.glTexEnvfv(8960, 8705, InputStream_Sub2.aFloatArray84, 0);
    }

    final int[] na(int i, int i_474_, int i_475_, int i_476_) {
        anInt7622++;
        int[] is = new int[i_475_ * i_476_];
        for (int i_477_ = 0; i_476_ > i_477_; i_477_++)
            OpenGL.glReadPixelsi(i, (-i_474_ + this.anInt7641 + -i_477_), i_475_, 1, 32993, this.anInt7812, is, i_475_ * i_477_);
        return is;
    }

    private final void method3809(boolean bool) {
        OpenGL.glViewport(anInt7770, anInt7867, this.anInt7688, this.anInt7641);
        anInt7718++;
        if (bool != true) this.aClass64_Sub3_7780 = null;
    }

    final boolean method3699() {
        anInt7700++;
        return aBoolean7843 && (!method3666() || aBoolean7822);
    }

    final synchronized void method3810(int i, int i_478_, int i_479_) {
        if (i_479_ < -57) {
            anInt7677++;
            Class348_Sub35 class348_sub35 = new Class348_Sub35(i_478_);
            class348_sub35.aLong4291 = i;
            aClass262_7754.method1999(class348_sub35, -20180);
        }
    }

    private final void method3811(byte i) {
        anInt7690++;
        if (i == 11) {
            if (anInt7855 >= anInt7868 && anInt7773 <= anInt7787) OpenGL.glScissor(anInt7770 + anInt7868, (anInt7867 + this.anInt7641 - anInt7787), -anInt7868 + anInt7855, -anInt7773 + anInt7787);
            else OpenGL.glScissor(0, 0, 0, 0);
        }
    }

    final boolean method3708() {
        anInt7603++;
        return false;
    }

    static {
        aClass351_7554 = new Class351(52, 4);
        aClass351_7715 = new Class351(58, 4);
        anInt7722 = 0;
    }
}
