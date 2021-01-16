/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class37 {
    static int anInt490;
    static int anInt491;
    static int anInt492;
    static int anInt493;
    static int anInt494;
    static int anInt495 = 0;
    static int anInt496;

    static final String method356(int i, int i_0_) {
        anInt494++;
        String string = Integer.toString(i_0_);
        if (i >= -109)
            return null;
        for (int i_1_ = -3 + string.length(); (i_1_ ^ 0xffffffff) < -1;
             i_1_ -= 3)
            string = string.substring(0, i_1_) + "," + string.substring(i_1_);
        if ((string.length() ^ 0xffffffff) < -10)
            return (" <col=00ff80>" + string.substring(0, string.length() + -8)
                    + Class274.aClass274_3516
                    .method2063(Class348_Sub33.anInt6967, 544)
                    + " (" + string + ")</col>");
        if ((string.length() ^ 0xffffffff) < -7)
            return (" <col=ffffff>" + string.substring(0, -4 + string.length())
                    + Class274.aClass274_3518
                    .method2063(Class348_Sub33.anInt6967, 544)
                    + " (" + string + ")</col>");
        return " <col=ffff00>" + string + "</col>";
    }

    static final synchronized void method357(int i, byte[] is) {
        anInt491++;
        if (is.length == 100
                && (Class348_Sub40_Sub31.anInt9412 ^ 0xffffffff) > -1001)
            Class24.aByteArrayArray358[Class348_Sub40_Sub31.anInt9412++] = is;
        else {
            if (i != 0)
                method359(-119, -101);
            if (is.length == 5000 && Class348_Sub40_Sub21.anInt9280 < 250)
                Class133.aByteArrayArray1918[Class348_Sub40_Sub21.anInt9280++]
                        = is;
            else if (is.length == 30000 && Class348_Sub31.anInt6913 < 50)
                Class285_Sub2.aByteArrayArray8505[Class348_Sub31.anInt6913++]
                        = is;
            else if (Class348_Sub40_Sub6.aByteArrayArrayArray9134 != null) {
                for (int i_2_ = 0;
                     Class59_Sub2_Sub2.anIntArray8684.length > i_2_; i_2_++) {
                    if (((Class59_Sub2_Sub2.anIntArray8684[i_2_] ^ 0xffffffff)
                            == (is.length ^ 0xffffffff))
                            && (Class348_Sub40_Sub6.aByteArrayArrayArray9134
                            [i_2_]).length > Class190.anIntArray2552[i_2_]) {
                        Class348_Sub40_Sub6.aByteArrayArrayArray9134[i_2_]
                                [Class190.anIntArray2552[i_2_]++]
                                = is;
                        break;
                    }
                }
            }
        }
    }

    static final void method358(int i, int i_3_, int i_4_, int i_5_, int i_6_,
                                int i_7_, int i_8_) {
        if (i_8_ != -29494)
            anInt496 = 32;
        if (Class316.aClass348_Sub51_3959
                .aClass239_Sub26_7272.method1838(-32350) != 0
                && i != 0 && Class147.anInt2021 < 50 && (i_7_ ^ 0xffffffff) != 0)
            Class258_Sub2.aClass10Array8531[Class147.anInt2021++]
                    = new Class10((byte) 1, i_7_, i, i_4_, i_5_, i_3_, i_6_, null);
        anInt490++;
    }

    static final synchronized byte[] method359(int i, int i_9_) {
        anInt493++;
        if ((i ^ 0xffffffff) == -101
                && (Class348_Sub40_Sub31.anInt9412 ^ 0xffffffff) < -1) {
            byte[] is
                    = Class24.aByteArrayArray358[--Class348_Sub40_Sub31.anInt9412];
            Class24.aByteArrayArray358[Class348_Sub40_Sub31.anInt9412] = null;
            return is;
        }
        if (i == 5000 && Class348_Sub40_Sub21.anInt9280 > 0) {
            byte[] is = (Class133.aByteArrayArray1918
                    [--Class348_Sub40_Sub21.anInt9280]);
            Class133.aByteArrayArray1918[Class348_Sub40_Sub21.anInt9280]
                    = null;
            return is;
        }
        if (i_9_ != -1)
            method359(-88, -45);
        if (i == 30000 && (Class348_Sub31.anInt6913 ^ 0xffffffff) < -1) {
            byte[] is = (Class285_Sub2.aByteArrayArray8505
                    [--Class348_Sub31.anInt6913]);
            Class285_Sub2.aByteArrayArray8505[Class348_Sub31.anInt6913] = null;
            return is;
        }
        if (Class348_Sub40_Sub6.aByteArrayArrayArray9134 != null) {
            for (int i_10_ = 0;
                 Class59_Sub2_Sub2.anIntArray8684.length > i_10_; i_10_++) {
                if (((Class59_Sub2_Sub2.anIntArray8684[i_10_] ^ 0xffffffff)
                        == (i ^ 0xffffffff))
                        && (Class190.anIntArray2552[i_10_] ^ 0xffffffff) < -1) {
                    byte[] is = (Class348_Sub40_Sub6.aByteArrayArrayArray9134
                            [i_10_][--Class190.anIntArray2552[i_10_]]);
                    Class348_Sub40_Sub6.aByteArrayArrayArray9134[i_10_]
                            [Class190.anIntArray2552[i_10_]]
                            = null;
                    return is;
                }
            }
        }
        return new byte[i];
    }
}
