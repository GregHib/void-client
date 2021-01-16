/* Class285_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;
import jaclib.memory.Source;

final class Class285_Sub1 extends Class285 implements Interface5_Impl1 {
    static int anInt8483;
    static int anInt8484;
    static int anInt8485;
    static int anInt8486;
    static int anInt8487;
    static int anInt8488;
    static int anInt8489;
    static int anInt8490;
    private byte aByte8491;
    static int anInt8492 = 0;
    static int anInt8493;
    static int anInt8494;
    static int anInt8495;

    static final String method2127(int i, String string) {
        if (i != 2)
            return null;
        anInt8483++;
        if (string == null)
            return null;
        int i_0_ = 0;
        int i_1_;
        for (i_1_ = string.length(); i_1_ > i_0_; i_0_++) {
            if (!Class26.method311((byte) 113, string.charAt(i_0_)))
                break;
        }
        for (/**/;
                 ((i_1_ ^ 0xffffffff) < (i_0_ ^ 0xffffffff)
                         && Class26.method311((byte) 104, string.charAt(i_1_ + -1)));
                 i_1_--) {
            /* empty */
        }
        int i_2_ = i_1_ + -i_0_;
        if ((i_2_ ^ 0xffffffff) > -2 || i_2_ > 12)
            return null;
        StringBuffer stringbuffer = new StringBuffer(i_2_);
        for (int i_3_ = i_0_; (i_3_ ^ 0xffffffff) > (i_1_ ^ 0xffffffff);
             i_3_++) {
            char c = string.charAt(i_3_);
            if (Class239_Sub29.method1849(c, i + 108)) {
                char c_4_ = Class287.method2184(c, -10072);
                if ((c_4_ ^ 0xffffffff) != -1)
                    stringbuffer.append(c_4_);
            }
        }
        if (stringbuffer.length() == 0)
            return null;
        return stringbuffer.toString();
    }

    static final Class369_Sub3_Sub1 method2128(int i,
                                               Class348_Sub49 class348_sub49) {
        anInt8495++;
        Class369_Sub3 class369_sub3
                = Class348_Sub46.method3322(i ^ i, class348_sub49);
        int i_5_ = class348_sub49.method3372(13638);
        return (new Class369_Sub3_Sub1
                (class369_sub3.aClass221_4968,
                        class369_sub3.aClass341_4973,
                        class369_sub3.anInt4970,
                        class369_sub3.anInt4959,
                        class369_sub3.anInt4971,
                        class369_sub3.anInt4963,
                        class369_sub3.anInt4966,
                        class369_sub3.anInt4965,
                        class369_sub3.anInt4961,
                        class369_sub3.anInt8599,
                        class369_sub3.anInt8595,
                        class369_sub3.anInt8603,
                        class369_sub3.anInt8602,
                        class369_sub3.anInt8600,
                        class369_sub3.anInt8597, i_5_));
    }

    static final void method2129(byte i) {
        anInt8494++;
        Class21.aHa326.method3638(r.aClass101_9720);
        if (i < 9)
            anInt8492 = -40;
        Class21.aHa326.DA(Class248.anInt3202, Class239_Sub5.anInt5886,
                Class14_Sub3.anInt8630, Class27.anInt394);
    }

    public final void method21(int i) {
        super.method21(i);
        anInt8485++;
    }

    public final boolean method18(int i) {
        if (i != 6331)
            anInt8492 = -14;
        anInt8489++;
        return super.method2123((this.aClass377_4759
                        .aMapBuffer9915),
                i ^ 0x18bb);
    }

    final int method2130(int i) {
        if (i != 3545)
            return -18;
        anInt8487++;
        return aByte8491;
    }

    public final Buffer method19(boolean bool, int i) {
        anInt8490++;
        if (i != 26775)
            aByte8491 = (byte) 7;
        return super.method2120(0,
                (this.aClass377_4759
                        .aMapBuffer9915),
                bool);
    }

    public final int method16(boolean bool) {
        anInt8486++;
        if (bool != false)
            method18(-20);
        return super.method16(bool);
    }

    public final boolean method17(Source source, int i, int i_6_, byte i_7_) {
        anInt8484++;
        aByte8491 = (byte) i;
        if (i_7_ >= -15)
            aByte8491 = (byte) 62;
        super.method2121(25625, source, i_6_);
        return true;
    }

    Class285_Sub1(Class377 class377, boolean bool) {
        super(class377, 34962, bool);
    }

    public final boolean method20(int i, byte i_8_, int i_9_) {
        anInt8488++;
        aByte8491 = (byte) i_9_;
        super.method23(15959, i);
        if (i_8_ <= 122)
            method18(-86);
        return true;
    }

    static final void method2131(int i) {
        if (i == 0) {
            if (Class318_Sub1_Sub3_Sub3_Sub1.anInt10503 == 2) {
                Class348_Sub40_Sub34.aClass293Array9432[0]
                        .method2206(Class319.aClass315Array3982[0]);
                Class348_Sub40_Sub34.aClass293Array9432[1]
                        .method2206(Class319.aClass315Array3982[1]);
            } else if (Class318_Sub1_Sub3_Sub3_Sub1.anInt10503 == 3) {
                Class348_Sub40_Sub34.aClass293Array9432[0]
                        .method2206(Class319.aClass315Array3982[0]);
                Class348_Sub40_Sub34.aClass293Array9432[1]
                        .method2206(Class319.aClass315Array3982[1]);
                Class348_Sub40_Sub34.aClass293Array9432[2]
                        .method2206(Class319.aClass315Array3982[2]);
            } else {
                Class348_Sub40_Sub34.aClass293Array9432[0]
                        .method2206(Class319.aClass315Array3982[0]);
                Class348_Sub40_Sub34.aClass293Array9432[1]
                        .method2206(Class319.aClass315Array3982[1]);
                Class348_Sub40_Sub34.aClass293Array9432[2]
                        .method2206(Class319.aClass315Array3982[2]);
                Class348_Sub40_Sub34.aClass293Array9432[3]
                        .method2206(Class319.aClass315Array3982[3]);
            }
        } else if (i == 1) {
            if (Class318_Sub1_Sub3_Sub3_Sub1.anInt10503 == 2)
                Class348_Sub40_Sub34.aClass293Array9432[0]
                        .method2206(Class319.aClass315Array3982[2]);
            else if (Class318_Sub1_Sub3_Sub3_Sub1.anInt10503 == 3) {
                Class348_Sub40_Sub34.aClass293Array9432[0]
                        .method2206(Class319.aClass315Array3982[3]);
                Class348_Sub40_Sub34.aClass293Array9432[1]
                        .method2206(Class319.aClass315Array3982[4]);
            } else {
                Class348_Sub40_Sub34.aClass293Array9432[0]
                        .method2206(Class319.aClass315Array3982[4]);
                Class348_Sub40_Sub34.aClass293Array9432[1]
                        .method2206(Class319.aClass315Array3982[5]);
                Class348_Sub40_Sub34.aClass293Array9432[2]
                        .method2206(Class319.aClass315Array3982[6]);
            }
        } else if (i == 2) {
            if (Class318_Sub1_Sub3_Sub3_Sub1.anInt10503 == 2)
                Class348_Sub40_Sub34.aClass293Array9432[0]
                        .method2206(Class319.aClass315Array3982[3]);
            else if (Class318_Sub1_Sub3_Sub3_Sub1.anInt10503 == 3)
                Class348_Sub40_Sub34.aClass293Array9432[0]
                        .method2206(Class319.aClass315Array3982[5]);
            else
                Class348_Sub40_Sub34.aClass293Array9432[0]
                        .method2206(Class319.aClass315Array3982[7]);
        }
    }
}
