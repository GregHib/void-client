/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Hashtable;

final class Class275 {
    static Hashtable aHashtable3548 = new Hashtable();
    static int anInt3549;
    static int anInt3550;
    static int[] anIntArray3551;
    static int[] anIntArray3552 = new int[5];
    static int anInt3553;

    static final int method2064(int i, int i_0_, int i_1_, int i_2_) {
        anInt3549++;
        if (aa_Sub1.aSArray5191 == null) return 0;
        int i_3_ = i >> 937361225;
        int i_4_ = i_2_ >> -1589419447;
        if (i_3_ < 0 || i_4_ < 0 || i_3_ > -1 + Class367_Sub4.anInt7319 || (i_4_ > Class348_Sub40_Sub3.anInt9109 + -1)) return 0;
        int i_5_ = i_0_;
        if (i_5_ < 3 && (Class348_Sub33.aByteArrayArrayArray6962[1][i_3_][i_4_] & 0x2) != 0) i_5_++;
        if (i_1_ != 11219) aHashtable3548 = null;
        return aa_Sub1.aSArray5191[i_5_].method3986(i, i_2_, (byte) -113);
    }

    public static void method2065(int i) {
        anIntArray3552 = null;
        anIntArray3551 = null;
        aHashtable3548 = null;
        if (i != 31913) anInt3550 = 52;
    }

    static final boolean method2066(byte i) {
        anInt3553++;
        if (Class240.anInt4674 < 1) return false;
        if (i < 101) method2065(66);
        return true;
    }

    static {
        anIntArray3551 = new int[]{2047, 16383, 65535};
    }
}
