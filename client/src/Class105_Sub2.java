/* Class105_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class105_Sub2 extends Class105 {
    static int anInt8424;
    static int anInt8425;
    static int anInt8426;
    private boolean aBoolean8427;
    static int anInt8428;
    private int anInt8429 = 0;
    private ha_Sub2 aHa_Sub2_8430;
    private Class258_Sub3_Sub1 aClass258_Sub3_Sub1_8431;
    private int anInt8432 = 0;
    static int anInt8433;
    private Class258_Sub3_Sub1 aClass258_Sub3_Sub1_8434;
    static int anInt8435;
    static int anInt8436;
    static int anInt8437;
    static int anInt8438;
    static int anInt8439;
    static int anInt8440;
    static int anInt8441;
    static int anInt8442;
    static int anInt8443;
    static int anInt8444;
    static int anInt8445;
    private int anInt8446;
    private int anInt8447;
    static int anInt8448;
    private int anInt8449;

    static final char method990(char c, byte i) {
        anInt8444++;
        if ((c ^ 0xffffffff) == -199)
            return 'E';
        if ((c ^ 0xffffffff) == -231)
            return 'e';
        if (c == 223)
            return 's';
        if ((c ^ 0xffffffff) == -339)
            return 'E';
        if (c == 339)
            return 'e';
        if (i >= -18)
            return 'M';
        return '\0';
    }

    final void method962(float f, float f_0_, float f_1_, float f_2_,
                         float f_3_, float f_4_, int i, int i_5_, int i_6_,
                         int i_7_) {
        anInt8435++;
        if (aBoolean8427) {
            float f_8_ = (float) method966();
            float f_9_ = (float) method980();
            float f_10_ = (f_1_ - f) / f_8_;
            float f_11_ = (f_2_ - f_0_) / f_8_;
            float f_12_ = (-f + f_3_) / f_9_;
            float f_13_ = (-f_0_ + f_4_) / f_9_;
            float f_14_ = (float) anInt8446 * f_12_;
            float f_15_ = (float) anInt8446 * f_13_;
            float f_16_ = (float) anInt8447 * f_10_;
            float f_17_ = (float) anInt8447 * f_11_;
            float f_18_ = -f_10_ * (float) anInt8449;
            float f_19_ = (float) anInt8449 * -f_11_;
            float f_20_ = -f_12_ * (float) anInt8432;
            f_3_ = f_20_ + (f_3_ + f_16_);
            f_1_ = f_1_ + f_18_ + f_14_;
            float f_21_ = (float) anInt8432 * -f_13_;
            f_2_ = f_2_ + f_19_ + f_15_;
            f = f + f_16_ + f_14_;
            f_0_ = f_15_ + (f_17_ + f_0_);
            f_4_ = f_21_ + (f_4_ + f_17_);
        }
        float f_22_ = f_1_ - f + f_3_;
        float f_23_ = -f_0_ + f_4_ + f_2_;
        aClass258_Sub3_Sub1_8434.method1957(9728, (i_7_ & 0x1) != 0);
        aHa_Sub2_8430.method3792(59);
        aHa_Sub2_8430.method3771((byte) -93, aClass258_Sub3_Sub1_8434);
        aHa_Sub2_8430.method3753(i_6_, 1);
        aHa_Sub2_8430.method3761(0, i);
        OpenGL.glColor4ub((byte) (i_5_ >> 1922769168),
                (byte) (i_5_ >> -2091244728), (byte) i_5_,
                (byte) (i_5_ >> 1938750680));
        OpenGL.glBegin(7);
        OpenGL.glTexCoord2f(0.0F,
                (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .aFloat9938));
        OpenGL.glVertex2f(f, f_0_);
        OpenGL.glTexCoord2f(0.0F, 0.0F);
        OpenGL.glVertex2f(f_3_, f_4_);
        OpenGL.glTexCoord2f((((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .aFloat9937),
                0.0F);
        OpenGL.glVertex2f(f_22_, f_23_);
        OpenGL.glTexCoord2f((((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .aFloat9937),
                (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .aFloat9938));
        OpenGL.glVertex2f(f_1_, f_2_);
        OpenGL.glEnd();
    }

    final int method969() {
        anInt8439++;
        return ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).anInt9939;
    }

    final void method968(int i, int i_24_, int i_25_) {
        anInt8438++;
        OpenGL.glPixelTransferf(3348, 0.5F);
        OpenGL.glPixelTransferf(3349, 0.499F);
        OpenGL.glPixelTransferf(3352, 0.5F);
        OpenGL.glPixelTransferf(3353, 0.499F);
        OpenGL.glPixelTransferf(3354, 0.5F);
        OpenGL.glPixelTransferf(3355, 0.499F);
        aClass258_Sub3_Sub1_8431
                = Class186_Sub1.method1401(aHa_Sub2_8430, i, 34037,
                ((Class258_Sub3_Sub1)
                        aClass258_Sub3_Sub1_8434).anInt9940,
                i_24_,
                ((Class258_Sub3_Sub1)
                        aClass258_Sub3_Sub1_8434).anInt9939);
        anInt8429 = i_25_;
        OpenGL.glPixelTransferf(3348, 1.0F);
        OpenGL.glPixelTransferf(3349, 0.0F);
        OpenGL.glPixelTransferf(3352, 1.0F);
        OpenGL.glPixelTransferf(3353, 0.0F);
        OpenGL.glPixelTransferf(3354, 1.0F);
        OpenGL.glPixelTransferf(3355, 0.0F);
    }

    final void method984(int[] is) {
        is[1] = anInt8446;
        anInt8445++;
        is[3] = anInt8432;
        is[0] = anInt8447;
        is[2] = anInt8449;
    }

    final int method980() {
        anInt8433++;
        return (anInt8446
                + ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).anInt9939
                + anInt8432);
    }

    final void method979(int i, int i_26_, int i_27_, int i_28_, int i_29_,
                         int i_30_) {
        anInt8436++;
        aClass258_Sub3_Sub1_8434.method1967(i, i_28_, i_30_, i_26_, i_29_,
                (byte) -120, i_27_);
    }

    final void method963(int i, int i_31_, aa var_aa, int i_32_, int i_33_) {
        anInt8424++;
        aa_Sub1 var_aa_Sub1 = (aa_Sub1) var_aa;
        Class258_Sub3_Sub1 class258_sub3_sub1
                = ((aa_Sub1) var_aa_Sub1).aClass258_Sub3_Sub1_5193;
        aClass258_Sub3_Sub1_8434.method1957(9728, false);
        aHa_Sub2_8430.method3792(75);
        aHa_Sub2_8430.method3771((byte) -99, aClass258_Sub3_Sub1_8434);
        aHa_Sub2_8430.method3761(0, 1);
        aHa_Sub2_8430.method3738(-15039, 1);
        aHa_Sub2_8430.method3771((byte) -123, class258_sub3_sub1);
        aHa_Sub2_8430.method3729(7681, (byte) -101, 8448);
        aHa_Sub2_8430.method3762(34168, 768, (byte) -87, 0);
        aHa_Sub2_8430.method3753(1, 1);
        i += anInt8447;
        i_31_ += anInt8446;
        int i_34_
                = ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).anInt9940 + i;
        int i_35_
                = (i_31_
                - -((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).anInt9939);
        float f
                = (((Class258_Sub3_Sub1) class258_sub3_sub1).aFloat9937
                / (float) ((Class258_Sub3_Sub1) class258_sub3_sub1).anInt9940);
        float f_36_
                = (((Class258_Sub3_Sub1) class258_sub3_sub1).aFloat9938
                / (float) ((Class258_Sub3_Sub1) class258_sub3_sub1).anInt9939);
        float f_37_ = f * (float) (-i_32_ + i);
        float f_38_ = f * (float) (i_34_ - i_32_);
        float f_39_ = (((Class258_Sub3_Sub1) class258_sub3_sub1).aFloat9938
                - f_36_ * (float) (i_31_ - i_33_));
        float f_40_ = (-((float) (i_35_ + -i_33_) * f_36_)
                + ((Class258_Sub3_Sub1) class258_sub3_sub1).aFloat9938);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F,
                ((Class258_Sub3_Sub1)
                        aClass258_Sub3_Sub1_8434).aFloat9938);
        OpenGL.glMultiTexCoord2f(33985, f_37_, f_39_);
        OpenGL.glVertex2i(i, i_31_);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, f_37_, f_40_);
        OpenGL.glVertex2i(i, i_31_ - -((Class258_Sub3_Sub1)
                aClass258_Sub3_Sub1_8434).anInt9939);
        OpenGL.glMultiTexCoord2f(33984,
                ((Class258_Sub3_Sub1)
                        aClass258_Sub3_Sub1_8434).aFloat9937,
                0.0F);
        OpenGL.glMultiTexCoord2f(33985, f_38_, f_40_);
        OpenGL.glVertex2i(i - -(((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .anInt9940),
                (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .anInt9939) + i_31_);
        OpenGL.glMultiTexCoord2f
                (33984, ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9937,
                        ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9938);
        OpenGL.glMultiTexCoord2f(33985, f_38_, f_39_);
        OpenGL.glVertex2i((((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .anInt9940) + i,
                i_31_);
        OpenGL.glEnd();
        aHa_Sub2_8430.method3762(5890, 768, (byte) -87, 0);
        aHa_Sub2_8430.method3761(0, 0);
        aHa_Sub2_8430.method3771((byte) -105, null);
        aHa_Sub2_8430.method3738(-15039, 0);
    }

    final void method985(int i, int i_41_, int i_42_, int i_43_) {
        anInt8447 = i;
        anInt8449 = i_42_;
        anInt8446 = i_41_;
        anInt8426++;
        anInt8432 = i_43_;
        aBoolean8427 = (anInt8447 != 0 || (anInt8446 ^ 0xffffffff) != -1
                || (anInt8449 ^ 0xffffffff) != -1 || anInt8432 != 0);
    }

    private final void method991(byte i) {
        anInt8428++;
        if (i == 9) {
            aHa_Sub2_8430.method3738(-15039, 1);
            aHa_Sub2_8430.method3771((byte) -78, null);
            aHa_Sub2_8430.method3729(8448, (byte) -79, 8448);
            aHa_Sub2_8430.method3762(34168, 768, (byte) -87, 1);
            aHa_Sub2_8430.method3775(false, 0, 770, 5890);
            aHa_Sub2_8430.method3738(-15039, 0);
            aHa_Sub2_8430.method3762(34168, 768, (byte) -87, 1);
        }
    }

    final void method983(float f, float f_44_, float f_45_, float f_46_,
                         float f_47_, float f_48_, int i, aa var_aa, int i_49_,
                         int i_50_) {
        anInt8448++;
        Class258_Sub3_Sub1 class258_sub3_sub1
                = ((aa_Sub1) (aa_Sub1) var_aa).aClass258_Sub3_Sub1_5193;
        if (aBoolean8427) {
            float f_51_ = (float) method966();
            float f_52_ = (float) method980();
            float f_53_ = (-f + f_45_) / f_51_;
            float f_54_ = (-f_44_ + f_46_) / f_51_;
            float f_55_ = (-f + f_47_) / f_52_;
            float f_56_ = (-f_44_ + f_48_) / f_52_;
            float f_57_ = f_55_ * (float) anInt8446;
            float f_58_ = f_56_ * (float) anInt8446;
            float f_59_ = (float) anInt8447 * f_53_;
            float f_60_ = (float) anInt8447 * f_54_;
            float f_61_ = -f_53_ * (float) anInt8449;
            float f_62_ = -f_54_ * (float) anInt8449;
            float f_63_ = -f_55_ * (float) anInt8432;
            f_46_ = f_46_ + f_62_ + f_58_;
            f_45_ = f_61_ + f_45_ + f_57_;
            f_47_ = f_63_ + (f_59_ + f_47_);
            f = f_59_ + f + f_57_;
            f_44_ = f_58_ + (f_44_ + f_60_);
            float f_64_ = -f_56_ * (float) anInt8432;
            f_48_ = f_60_ + f_48_ + f_64_;
        }
        float f_65_ = -f + f_45_ + f_47_;
        aClass258_Sub3_Sub1_8434.method1957(9728, (0x1 & i) != 0);
        float f_66_ = f_48_ - f_44_ + f_46_;
        aHa_Sub2_8430.method3792(106);
        aHa_Sub2_8430.method3771((byte) -123, aClass258_Sub3_Sub1_8434);
        aHa_Sub2_8430.method3761(0, 1);
        aHa_Sub2_8430.method3738(-15039, 1);
        aHa_Sub2_8430.method3771((byte) -98, class258_sub3_sub1);
        aHa_Sub2_8430.method3729(7681, (byte) -17, 8448);
        aHa_Sub2_8430.method3762(34168, 768, (byte) -87, 0);
        aHa_Sub2_8430.method3753(1, 1);
        float f_67_
                = (((Class258_Sub3_Sub1) class258_sub3_sub1).aFloat9937
                / (float) ((Class258_Sub3_Sub1) class258_sub3_sub1).anInt9940);
        float f_68_
                = (((Class258_Sub3_Sub1) class258_sub3_sub1).aFloat9938
                / (float) ((Class258_Sub3_Sub1) class258_sub3_sub1).anInt9939);
        OpenGL.glBegin(7);
        OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
        OpenGL.glMultiTexCoord2f(33984, 0.0F,
                ((Class258_Sub3_Sub1)
                        aClass258_Sub3_Sub1_8434).aFloat9938);
        OpenGL.glMultiTexCoord2f(33985, f_67_ * (f - (float) i_49_),
                ((((Class258_Sub3_Sub1) class258_sub3_sub1)
                        .aFloat9938)
                        - f_68_ * ((float) -i_50_ + f_44_)));
        OpenGL.glVertex2f(f, f_44_);
        OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
        OpenGL.glMultiTexCoord2f(33985, ((float) -i_49_ + f_47_) * f_67_,
                (-(f_68_ * (f_48_ - (float) i_50_))
                        + (((Class258_Sub3_Sub1) class258_sub3_sub1)
                        .aFloat9938)));
        OpenGL.glVertex2f(f_47_, f_48_);
        OpenGL.glMultiTexCoord2f(33984,
                ((Class258_Sub3_Sub1)
                        aClass258_Sub3_Sub1_8434).aFloat9937,
                0.0F);
        OpenGL.glMultiTexCoord2f(33985, (f_65_ - (float) i_49_) * f_67_,
                (-(f_68_ * (f_66_ - (float) i_50_))
                        + (((Class258_Sub3_Sub1) class258_sub3_sub1)
                        .aFloat9938)));
        OpenGL.glVertex2f(f_65_, f_66_);
        OpenGL.glMultiTexCoord2f
                (33984, ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9937,
                        ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9938);
        OpenGL.glMultiTexCoord2f(33985, f_67_ * ((float) -i_49_ + f_45_),
                ((((Class258_Sub3_Sub1) class258_sub3_sub1)
                        .aFloat9938)
                        - f_68_ * (f_46_ - (float) i_50_)));
        OpenGL.glVertex2f(f_45_, f_46_);
        OpenGL.glEnd();
        aHa_Sub2_8430.method3762(5890, 768, (byte) -87, 0);
        aHa_Sub2_8430.method3761(0, 0);
        aHa_Sub2_8430.method3771((byte) -84, null);
        aHa_Sub2_8430.method3738(-15039, 0);
    }

    final int method966() {
        anInt8440++;
        return (anInt8447
                + ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).anInt9940
                - -anInt8449);
    }

    final void method964(int i, int i_69_, int i_70_, int i_71_, int i_72_) {
        aClass258_Sub3_Sub1_8434.method1957(9728, false);
        anInt8425++;
        aHa_Sub2_8430.method3792(121);
        aHa_Sub2_8430.method3753(i_72_, 1);
        OpenGL.glColor4ub((byte) (i_71_ >> 1876827600),
                (byte) (i_71_ >> 1157707368), (byte) i_71_,
                (byte) (i_71_ >> -1725228616));
        i += anInt8447;
        i_69_ += anInt8446;
        if (aClass258_Sub3_Sub1_8431 == null) {
            aHa_Sub2_8430.method3771((byte) -127, aClass258_Sub3_Sub1_8434);
            aHa_Sub2_8430.method3761(0, i_70_);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, ((Class258_Sub3_Sub1)
                    aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glVertex2i(i, i_69_);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(i,
                    i_69_ - -((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).anInt9939);
            OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).aFloat9937,
                    0.0F);
            OpenGL.glVertex2i((((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                            .anInt9940) + i,
                    (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                            .anInt9939) + i_69_);
            OpenGL.glTexCoord2f
                    (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9937,
                            ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glVertex2i((((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                            .anInt9940) + i,
                    i_69_);
            OpenGL.glEnd();
        } else {
            method992(i_70_, 3);
            aClass258_Sub3_Sub1_8431.method1957(9728, false);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F,
                    ((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glTexCoord2f(0.0F, ((Class258_Sub3_Sub1)
                    aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glVertex2i(i, i_69_);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(i, i_69_ + ((Class258_Sub3_Sub1)
                    aClass258_Sub3_Sub1_8434).anInt9939);
            OpenGL.glMultiTexCoord2f(33985,
                    ((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).aFloat9937,
                    0.0F);
            OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).aFloat9937,
                    0.0F);
            OpenGL.glVertex2i((((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                            .anInt9940) + i,
                    (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                            .anInt9939) + i_69_);
            OpenGL.glMultiTexCoord2f
                    (33985,
                            ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9937,
                            ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glTexCoord2f
                    (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9937,
                            ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glVertex2i(i + ((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).anInt9940,
                    i_69_);
            OpenGL.glEnd();
            method991((byte) 9);
        }
    }

    private final void method992(int i, int i_73_) {
        aHa_Sub2_8430.method3738(-15039, 1);
        anInt8441++;
        aHa_Sub2_8430.method3771((byte) -82, aClass258_Sub3_Sub1_8434);
        aHa_Sub2_8430.method3729(aHa_Sub2_8430.method3781((byte) 17, i),
                (byte) -61, 7681);
        aHa_Sub2_8430.method3762(34167, 768, (byte) -87, 1);
        if (i_73_ != 3)
            method964(46, -15, -58, 122, 11);
        aHa_Sub2_8430.method3775(false, 0, 770, 34168);
        aHa_Sub2_8430.method3738(-15039, 0);
        aHa_Sub2_8430.method3771((byte) -108, aClass258_Sub3_Sub1_8431);
        aHa_Sub2_8430.method3729(34479, (byte) -47, 7681);
        aHa_Sub2_8430.method3762(34166, 768, (byte) -87, 1);
        if (anInt8429 != 0) {
            if ((anInt8429 ^ 0xffffffff) == -2)
                aHa_Sub2_8430.method3749(0.0F, 0.5F, 0.5F, (byte) 64, 1.0F);
            else if ((anInt8429 ^ 0xffffffff) != -3) {
                if (anInt8429 == 3)
                    aHa_Sub2_8430.method3749(0.0F, 128.5F, 128.5F, (byte) 63,
                            128.5F);
            } else
                aHa_Sub2_8430.method3749(0.0F, 0.5F, 1.0F, (byte) 95, 0.5F);
        } else
            aHa_Sub2_8430.method3749(0.0F, 1.0F, 0.5F, (byte) 50, 0.5F);
    }

    final void method965(int i, int i_74_, int i_75_, int i_76_, int i_77_,
                         int i_78_, int i_79_) {
        anInt8442++;
        int i_80_ = i_75_ + i;
        int i_81_ = i_76_ + i_74_;
        aClass258_Sub3_Sub1_8434.method1957(9728, false);
        aHa_Sub2_8430.method3792(54);
        aHa_Sub2_8430.method3771((byte) -88, aClass258_Sub3_Sub1_8434);
        aHa_Sub2_8430.method3753(i_79_, 1);
        aHa_Sub2_8430.method3761(0, i_77_);
        OpenGL.glColor4ub((byte) (i_78_ >> -696243888),
                (byte) (i_78_ >> 1448891336), (byte) i_78_,
                (byte) (i_78_ >> -293809640));
        if (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aBoolean9941
                && !aBoolean8427) {
            float f
                    = (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9938
                    * (float) i_76_
                    / (float) (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                    .anInt9939));
            float f_82_
                    = ((float) i_75_
                    * ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9937
                    / (float) (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                    .anInt9940));
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, f);
            OpenGL.glVertex2i(i, i_74_);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(i, i_81_);
            OpenGL.glTexCoord2f(f_82_, 0.0F);
            OpenGL.glVertex2i(i_80_, i_81_);
            OpenGL.glTexCoord2f(f_82_, f);
            OpenGL.glVertex2i(i_80_, i_74_);
            OpenGL.glEnd();
        } else {
            OpenGL.glPushMatrix();
            OpenGL.glTranslatef((float) anInt8447, (float) anInt8446, 0.0F);
            int i_83_ = method966();
            int i_84_ = method980();
            int i_85_
                    = i_74_ - -(((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                    .anInt9939);
            OpenGL.glBegin(7);
            int i_86_ = i_74_;
            for (/**/; i_85_ <= i_81_; i_85_ += i_84_) {
                int i_87_
                        = i + (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .anInt9940);
                int i_88_ = i;
                for (/**/; i_80_ >= i_87_; i_87_ += i_83_) {
                    OpenGL.glTexCoord2f(0.0F,
                            ((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9938);
                    OpenGL.glVertex2i(i_88_, i_86_);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(i_88_, i_85_);
                    OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9937,
                            0.0F);
                    OpenGL.glVertex2i(i_87_, i_85_);
                    OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9937,
                            ((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9938);
                    OpenGL.glVertex2i(i_87_, i_86_);
                    i_88_ += i_83_;
                }
                if (i_88_ < i_80_) {
                    float f
                            = ((float) (i_80_ + -i_88_)
                            * (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                            .aFloat9937)
                            / (float) ((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).anInt9940);
                    OpenGL.glTexCoord2f(0.0F,
                            ((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9938);
                    OpenGL.glVertex2i(i_88_, i_86_);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glVertex2i(i_88_, i_85_);
                    OpenGL.glTexCoord2f(f, 0.0F);
                    OpenGL.glVertex2i(i_80_, i_85_);
                    OpenGL.glTexCoord2f(f,
                            ((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9938);
                    OpenGL.glVertex2i(i_80_, i_86_);
                }
                i_86_ += i_84_;
            }
            if ((i_81_ ^ 0xffffffff) < (i_86_ ^ 0xffffffff)) {
                float f = ((((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .aFloat9938)
                        * (float) (((Class258_Sub3_Sub1)
                        aClass258_Sub3_Sub1_8434).anInt9939
                        + (-i_81_ + i_86_))
                        / (float) ((Class258_Sub3_Sub1)
                        aClass258_Sub3_Sub1_8434).anInt9939);
                int i_89_
                        = i + (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                        .anInt9940);
                int i_90_ = i;
                while ((i_89_ ^ 0xffffffff) >= (i_80_ ^ 0xffffffff)) {
                    OpenGL.glTexCoord2f(0.0F,
                            ((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9938);
                    OpenGL.glVertex2i(i_90_, i_86_);
                    OpenGL.glTexCoord2f(0.0F, f);
                    OpenGL.glVertex2i(i_90_, i_81_);
                    OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9937,
                            f);
                    OpenGL.glVertex2i(i_89_, i_81_);
                    OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9937,
                            ((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9938);
                    OpenGL.glVertex2i(i_89_, i_86_);
                    i_89_ += i_83_;
                    i_90_ += i_83_;
                }
                if (i_80_ > i_90_) {
                    float f_91_
                            = ((float) (i_80_ - i_90_)
                            * (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                            .aFloat9937)
                            / (float) ((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).anInt9940);
                    OpenGL.glTexCoord2f(0.0F,
                            ((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9938);
                    OpenGL.glVertex2i(i_90_, i_86_);
                    OpenGL.glTexCoord2f(0.0F, f);
                    OpenGL.glVertex2i(i_90_, i_81_);
                    OpenGL.glTexCoord2f(f_91_, f);
                    OpenGL.glVertex2i(i_80_, i_81_);
                    OpenGL.glTexCoord2f(f_91_,
                            ((Class258_Sub3_Sub1)
                                    aClass258_Sub3_Sub1_8434).aFloat9938);
                    OpenGL.glVertex2i(i_80_, i_86_);
                }
            }
            OpenGL.glEnd();
            OpenGL.glPopMatrix();
        }
    }

    final int method971() {
        anInt8437++;
        return ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).anInt9940;
    }

    final void method982(int i, int i_92_, int i_93_, int i_94_, int i_95_,
                         int i_96_, int i_97_, int i_98_) {
        anInt8443++;
        aClass258_Sub3_Sub1_8434.method1957(9728, (0x1 & i_98_) != 0);
        aHa_Sub2_8430.method3792(103);
        aHa_Sub2_8430.method3753(i_97_, 1);
        OpenGL.glColor4ub((byte) (i_96_ >> 218257456),
                (byte) (i_96_ >> 237122376), (byte) i_96_,
                (byte) (i_96_ >> -858895688));
        if (aBoolean8427) {
            float f = (float) i_93_ / (float) method966();
            float f_99_ = (float) i_94_ / (float) method980();
            float f_100_ = (float) i + f * (float) anInt8447;
            float f_101_ = (float) anInt8446 * f_99_ + (float) i_92_;
            float f_102_
                    = f_100_ + f * (float) ((Class258_Sub3_Sub1)
                    aClass258_Sub3_Sub1_8434).anInt9940;
            float f_103_
                    = (f_101_
                    + (float) (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434)
                    .anInt9939) * f_99_);
            if (aClass258_Sub3_Sub1_8431 == null) {
                aHa_Sub2_8430.method3771((byte) -85, aClass258_Sub3_Sub1_8434);
                aHa_Sub2_8430.method3761(0, i_95_);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F,
                        ((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9938);
                OpenGL.glVertex2f(f_100_, f_101_);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(f_100_, f_103_);
                OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9937,
                        0.0F);
                OpenGL.glVertex2f(f_102_, f_103_);
                OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9937,
                        ((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9938);
                OpenGL.glVertex2f(f_102_, f_101_);
                OpenGL.glEnd();
            } else {
                method992(i_95_, 3);
                aClass258_Sub3_Sub1_8431.method1957(9728, true);
                OpenGL.glBegin(7);
                OpenGL.glMultiTexCoord2f(33985, 0.0F,
                        (((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434)
                                .aFloat9938));
                OpenGL.glTexCoord2f(0.0F,
                        ((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9938);
                OpenGL.glVertex2f(f_100_, f_101_);
                OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2f(f_100_, f_103_);
                OpenGL.glMultiTexCoord2f(33985,
                        ((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9937,
                        0.0F);
                OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9937,
                        0.0F);
                OpenGL.glVertex2f(f_102_, f_103_);
                OpenGL.glMultiTexCoord2f(33985,
                        ((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9937,
                        (((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434)
                                .aFloat9938));
                OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9937,
                        ((Class258_Sub3_Sub1)
                                aClass258_Sub3_Sub1_8434).aFloat9938);
                OpenGL.glVertex2f(f_102_, f_101_);
                OpenGL.glEnd();
                method991((byte) 9);
            }
        } else if (aClass258_Sub3_Sub1_8431 == null) {
            aHa_Sub2_8430.method3771((byte) -101, aClass258_Sub3_Sub1_8434);
            aHa_Sub2_8430.method3761(0, i_95_);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, ((Class258_Sub3_Sub1)
                    aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glVertex2i(i, i_92_);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(i, i_92_ - -i_94_);
            OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).aFloat9937,
                    0.0F);
            OpenGL.glVertex2i(i_93_ + i, i_94_ + i_92_);
            OpenGL.glTexCoord2f
                    (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9937,
                            ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glVertex2i(i - -i_93_, i_92_);
            OpenGL.glEnd();
        } else {
            method992(i_95_, 3);
            aClass258_Sub3_Sub1_8431.method1957(9728, true);
            OpenGL.glBegin(7);
            OpenGL.glMultiTexCoord2f(33985, 0.0F,
                    ((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glTexCoord2f(0.0F, ((Class258_Sub3_Sub1)
                    aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glVertex2i(i, i_92_);
            OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(i, i_94_ + i_92_);
            OpenGL.glMultiTexCoord2f(33985,
                    ((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).aFloat9937,
                    0.0F);
            OpenGL.glTexCoord2f(((Class258_Sub3_Sub1)
                            aClass258_Sub3_Sub1_8434).aFloat9937,
                    0.0F);
            OpenGL.glVertex2i(i - -i_93_, i_92_ + i_94_);
            OpenGL.glMultiTexCoord2f
                    (33985,
                            ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9937,
                            ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glTexCoord2f
                    (((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9937,
                            ((Class258_Sub3_Sub1) aClass258_Sub3_Sub1_8434).aFloat9938);
            OpenGL.glVertex2i(i_93_ + i, i_92_);
            OpenGL.glEnd();
            method991((byte) 9);
        }
    }

    static long method993(long l, long l_104_) {
        try {
            return l ^ l_104_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "nda.Q(" + l + ',' + l_104_ + ')');
        }
    }

    Class105_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_105_, boolean bool) {
        aBoolean8427 = false;
        anInt8446 = 0;
        anInt8447 = 0;
        anInt8449 = 0;
        aHa_Sub2_8430 = var_ha_Sub2;
        aClass258_Sub3_Sub1_8434
                = Class101.method904(81, var_ha_Sub2, bool ? 6408 : 6407, i,
                i_105_);
    }

    Class105_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_106_, int i_107_,
                  int i_108_) {
        aBoolean8427 = false;
        anInt8446 = 0;
        anInt8447 = 0;
        anInt8449 = 0;
        aHa_Sub2_8430 = var_ha_Sub2;
        aClass258_Sub3_Sub1_8434
                = Class186_Sub1.method1401(var_ha_Sub2, i, 34037, i_107_, i_106_,
                i_108_);
    }

    Class105_Sub2(ha_Sub2 var_ha_Sub2, int i, int i_109_, int[] is, int i_110_,
                  int i_111_) {
        aBoolean8427 = false;
        anInt8446 = 0;
        anInt8447 = 0;
        anInt8449 = 0;
        try {
            aHa_Sub2_8430 = var_ha_Sub2;
            aClass258_Sub3_Sub1_8434
                    = Class348_Sub40_Sub32.method3132(is, i_110_, i_111_, i_109_,
                    i, var_ha_Sub2, false,
                    (byte) 12);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("nda.<init>("
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_109_ + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i_110_ + ',' + i_111_
                            + ')'));
        }
    }
}
