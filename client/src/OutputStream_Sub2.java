/* OutputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub2 extends OutputStream {
    static int anInt101;
    static int anInt102;
    static int anInt103;
    static int anInt104;
    static int anInt105;
    static Class105 aClass105_106;
    static int anInt107;
    static long aLong108 = (long) (Math.random() * 9.999999999E9);

    static final byte[] method135(byte i, byte[] is, int i_0_) {
        anInt103++;
        if (i < 101)
            method139(34);
        byte[] is_1_ = new byte[i_0_];
        Class214.method1577(is, 0, is_1_, 0, i_0_);
        return is_1_;
    }

    static final Class318_Sub4 method136(int i, boolean bool,
                                         boolean bool_2_) {
        anInt105++;
        synchronized (Class318.aClass243Array3974) {
            Class318_Sub4 class318_sub4;
            if (Class318.aClass243Array3974.length > i
                    && !Class318.aClass243Array3974[i].method1871((byte) 111)) {
                class318_sub4 = (Class318_Sub4) Class318.aClass243Array3974
                        [i].method1870(-104);
                class318_sub4.method2373(false);
                Class331.anIntArray4128[i]--;
            } else {
                class318_sub4 = new Class318_Sub4();
                class318_sub4.aClass318_Sub3Array6414
                        = new Class318_Sub3[i];
                for (int i_3_ = 0; i > i_3_;
                     i_3_++)
                    class318_sub4.aClass318_Sub3Array6414
                            [i_3_]
                            = new Class318_Sub3();
            }
            class318_sub4.aBoolean6409 = bool;
            if (bool_2_ != false)
                aLong108 = 43L;
            return class318_sub4;
        }
    }

    static final boolean method137(int i, int i_4_, int i_5_) {
        anInt102++;
        int i_6_ = -114 / ((i_4_ - 36) / 55);
        return (0x70000 & i_5_) != 0
                | Class348_Sub40_Sub9.method3073(i, i_5_, (byte) 50)
                || Class264.method2015(i_5_, i, 7);
    }

    static final int method138(Class348_Sub42_Sub12 class348_sub42_sub12,
                               boolean bool) {
        anInt107++;
        String string = Class316.method2367((byte) -126, class348_sub42_sub12);
        int[] is = null;
        if (!Class148.method1197(-12081,
                (class348_sub42_sub12
                        .anInt9608))) {
            if (class348_sub42_sub12.anInt9599
                    == -1) {
                if (Class367_Sub8.method3549(class348_sub42_sub12.anInt9608,
                        (byte) -44)) {
                            Class348_Sub22 class348_sub22
                                    = ((Class348_Sub22)
                                    (Class282.aClass356_3654.method3480
                                            ((int) class348_sub42_sub12.aLong9605,
                                                    -6008)));
                            if (class348_sub22 != null) {
                                Class318_Sub1_Sub3_Sub3_Sub1 class318_sub1_sub3_sub3_sub1
                                        = (class348_sub22
                                        .aClass318_Sub1_Sub3_Sub3_Sub1_6859);
                                Class79 class79 = (class318_sub1_sub3_sub3_sub1
                                        .aClass79_10505);
                                if (class79.anIntArray1377 != null)
                                    class79
                                            = class79.method794((Class318_Sub1_Sub3_Sub3
                                                    .aClass170_10209),
                                            -1);
                                if (class79 != null)
                                    is = class79.anIntArray1342;
                            }
                        } else if (Class239_Sub21.method1813(8806,
                        (class348_sub42_sub12
                                .anInt9608))) {
                    Object object = null;
                    Class51 class51;
                    if ((class348_sub42_sub12
                            .anInt9608) == 1001)
                        class51 = (Class348_Sub40_Sub12.aClass263_9195
                                .method2005
                                        (0, (int) (class348_sub42_sub12
                                                .aLong9605)));
                    else
                        class51
                                = (Class348_Sub40_Sub12.aClass263_9195
                                .method2005
                                        (0, (int) (0x7fffffffL
                                                & (class348_sub42_sub12
                                                .aLong9605) >>> -273616224)));
                    if (class51.anIntArray945 != null)
                        class51
                                = class51.method480((Class318_Sub1_Sub3_Sub3
                                        .aClass170_10209),
                                (byte) 47);
                    if (class51 != null)
                        is = class51.anIntArray917;
                }
            } else
                is = (Exception_Sub1.aClass255_112.method1940
                        (-76, class348_sub42_sub12.anInt9599)
                        .anIntArray2772);
        } else
            is = (Exception_Sub1.aClass255_112.method1940
                    (-115, (int) class348_sub42_sub12.aLong9605)
                    .anIntArray2772);
        if (is != null)
            string += Class163.method1273(is, true);
        int i = Class369.aClass143_4962
                .method1186(string, Class341.aClass105Array4234, bool);
        if (class348_sub42_sub12.aBoolean9597)
            i += Class239_Sub24.aClass105_6097.method971() + 4;
        return i;
    }

    public final void write(int i) throws IOException {
        anInt104++;
        throw new IOException();
    }

    public static void method139(int i) {
        if (i > 53)
            aClass105_106 = null;
    }

    static {
        anInt101 = -1;
    }
}
