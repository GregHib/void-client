/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class Class327 {
    static int anInt4090;
    static Class273 aClass273_4091 = new Class273("", 10);
    static int anInt4092;
    static int anInt4093;
    static Class351 aClass351_4094 = new Class351(47, 4);
    static int anInt4095;
    static int[] anIntArray4096 = new int[32];
    static int[] anIntArray4097 = new int[2];
    static Class74 aClass74_4098 = new Class74(4, 7);

    public static void method2604(byte i) {
        aClass273_4091 = null;
        if (i >= -49)
            method2606(31, -15L);
        aClass74_4098 = null;
        aClass351_4094 = null;
        anIntArray4096 = null;
        anIntArray4097 = null;
    }

    static final boolean method2605(byte i) {
        anInt4092++;
        if (i != -99)
            anIntArray4097 = null;
        if ((Class348_Sub43.anInt7068 ^ 0xffffffff) == -1)
            return false;
        return true;
    }

    static final void method2606(int i, long l) {
        try {
            anInt4090++;
            try {
                Thread.sleep(l);
                int i_0_ = 107 % ((-80 - i) / 35);
            } catch (InterruptedException interruptedexception) {
                /* empty */
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "de.A(" + i + ',' + l + ')');
        }
    }

    static final byte[] method2607(int i, File file, int i_1_) {
        anInt4093++;
        try {
            int i_2_ = -87 / ((28 - i_1_) / 54);
            byte[] is = new byte[i];
            Class374.method3610(is, (byte) 7, i, file);
            return is;
        } catch (java.io.IOException ioexception) {
            return null;
        }
    }
}
