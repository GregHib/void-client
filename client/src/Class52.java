/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.math.BigInteger;

final class Class52 implements Interface12 {
    static int anInt4894;
    static int anInt4895;
    static BigInteger aBigInteger4896 = new BigInteger("10001", 16);
    static int anInt4897;
    static int anInt4898;
    int anInt4899;
    static int anInt4900;
    static Class138 aClass138_4901;
    static int anInt4902;
    static boolean aBoolean4903 = false;
    static Frame aFrame4904;
    static Class351 aClass351_4905;
    static int[] anIntArray4906;
    static Class351 aClass351_4907;

    static final Class43 method490(byte i, Class348_Sub49 class348_sub49) {
        anInt4897++;
        Class43 class43 = new Class43();
        class43.anInt615 = class348_sub49.readUnsignedShort(842397944);
        class43.aClass348_Sub42_Sub10_614 = Class239_Sub6.aClass355_5900.method3471(class43.anInt615, (byte) -90);
        int i_0_ = -91 / ((9 - i) / 54);
        return class43;
    }

    public final Class223 method51(byte i) {
        anInt4894++;
        if (i < 116) return null;
        return Class219.aClass223_2868;
    }

    static final void method491(byte i) {
        for (int i_1_ = 0; (Class348_Sub33.aByteArrayArrayArray6962.length > i_1_); i_1_++) {
            for (int i_2_ = 0; i_2_ < Class348_Sub33.aByteArrayArrayArray6962[0].length; i_2_++) {
                for (int i_3_ = 0; (Class348_Sub33.aByteArrayArrayArray6962[0][0].length > i_3_); i_3_++)
                    Class348_Sub33.aByteArrayArrayArray6962[i_1_][i_2_][i_3_] = (byte) 0;
            }
        }
        int i_4_ = 119 / ((i - 47) / 34);
        anInt4902++;
    }

    public static void method492(int i) {
        aClass351_4905 = null;
        aClass351_4907 = null;
        aFrame4904 = null;
        if (i < -17) {
            aBigInteger4896 = null;
            anIntArray4906 = null;
            aClass138_4901 = null;
        }
    }

    Class52(int i) {
        this.anInt4899 = i;
    }

    static final void method493(boolean bool) {
        if (Class328_Sub2.aClass56Array6515 == null) {
            Class328_Sub2.aClass56Array6515 = Class56.method528(-91);
            Class348_Sub42_Sub15.aClass56_9660 = Class328_Sub2.aClass56Array6515[0];
            Class283.aLong3660 = Class62.method599(-119);
        }
        anInt4900++;
        if (Class51.aClass311_897 == null) Class70.method726(116);
        Class56 class56 = Class348_Sub42_Sub15.aClass56_9660;
        int i = Class164.method1278(-28660);
        if (class56 == Class348_Sub42_Sub15.aClass56_9660) {
            Class64_Sub2.aString5420 = Class348_Sub42_Sub15.aClass56_9660.aClass274_1012.method2063(Class348_Sub33.anInt6967, 544);
            if (Class348_Sub42_Sub15.aClass56_9660.aBoolean1016) Class251.anInt3236 = (i * ((Class348_Sub42_Sub15.aClass56_9660.anInt1021) + -(Class348_Sub42_Sub15.aClass56_9660.anInt1025)) / 100 + (Class348_Sub42_Sub15.aClass56_9660.anInt1025));
            if (Class348_Sub42_Sub15.aClass56_9660.aBoolean1013) Class64_Sub2.aString5420 += Class251.anInt3236 + "%";
        } else if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1043) {
            Class51.aClass311_897 = null;
            Class348_Sub49.method3379(2, 3);
        } else {
            Class64_Sub2.aString5420 = class56.aClass274_1015.method2063(Class348_Sub33.anInt6967, 544);
            if (Class348_Sub42_Sub15.aClass56_9660.aBoolean1013) Class64_Sub2.aString5420 += class56.anInt1021 + "%";
            Class251.anInt3236 = class56.anInt1021;
            if (Class348_Sub42_Sub15.aClass56_9660.aBoolean1016 || class56.aBoolean1016) Class283.aLong3660 = Class62.method599(-128);
        }
        if (bool == true) {
            if (Class51.aClass311_897 != null) {
                Class51.aClass311_897.method2316((Class348_Sub42_Sub15.aClass56_9660), Class64_Sub2.aString5420, Class251.anInt3236, Class283.aLong3660, false);
                if (Class182.anInterface16Array2447 != null) {
                    for (int i_5_ = Class375.anInt4544 - -1; (Class182.anInterface16Array2447.length > i_5_); i_5_++) {
                        if (Class182.anInterface16Array2447[i_5_].method60(-19079) >= 100 && Class375.anInt4544 == -1 + i_5_ && Class240.anInt4674 >= 1 && Class51.aClass311_897.method2322(0)) {
                            try {
                                Class182.anInterface16Array2447[i_5_].method57(117);
                            } catch (Exception exception) {
                                Class182.anInterface16Array2447 = null;
                                break;
                            }
                            Class51.aClass311_897.method2321(10559, Class182.anInterface16Array2447[i_5_]);
                            Class375.anInt4544++;
                            if ((Class375.anInt4544 >= (-1 + Class182.anInterface16Array2447.length)) && Class182.anInterface16Array2447.length > 1) Class375.anInt4544 = !Class186_Sub1.aClass111_5813.method1044(26) ? -1 : 0;
                        }
                    }
                }
            }
        }
    }

    static final int method494(int i, int i_6_) {
        if (i <= 78) aBigInteger4896 = null;
        anInt4898++;
        return 0x7f & i_6_;
    }

    static {
        aClass138_4901 = new Class138(12, 0, 1, 0);
        anIntArray4906 = new int[4];
        aClass351_4905 = new Class351(44, 3);
        aClass351_4907 = new Class351(48, 11);
    }
}
