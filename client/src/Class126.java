/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class126 implements Interface14 {
    int anInt4981;
    int anInt4982;
    static int[] anIntArray4983;
    static Class45 aClass45_4984;
    static int anInt4985 = 0;
    static int anInt4986;
    static Class267[] aClass267Array4987;
    static int anInt4988;
    int anInt4989;
    boolean aBoolean4990;
    int anInt4991;
    int anInt4992;
    int anInt4993;
    static int anInt4994;
    static int anInt4995;

    public static void method1112(int i) {
        if (i != 1) aClass267Array4987 = null;
        aClass45_4984 = null;
        anIntArray4983 = null;
        aClass267Array4987 = null;
    }

    static final boolean method1113(int i, int i_0_, int i_1_) {
        anInt4995++;
        if (i_1_ >= -3) aClass45_4984 = null;
        return (Class188.method1412((byte) -35, i_0_, i) & (Class274.method2058(i, i_0_, 72) | (i & 0x2000) != 0 | Class348_Sub42_Sub9.method3203(i_0_, (byte) 114, i)));
    }

    public final long method52(byte i) {
        anInt4988++;
        long[] ls = Class348_Sub40_Sub21.aLongArray9283;
        long l = -1L;
        l = (ls[(int) ((l ^ (long) this.anInt4991) & 0xffL)] ^ l >>> -912339384);
        l = (l >>> -1815341496 ^ ls[(int) (0xffL & ((long) (this.anInt4992 >> -1724957784) ^ l))]);
        l = (l >>> 541427656 ^ ls[(int) ((l ^ (long) this.anInt4992) & 0xffL)]);
        l = (l >>> -1073243512 ^ ls[(int) (0xffL & (l ^ (long) (this.anInt4989 >> -112708680)))]);
        l = ls[(int) (0xffL & ((long) (this.anInt4989 >> 1783360016) ^ l))] ^ l >>> -1647611832;
        l = (l >>> -924450232 ^ ls[(int) (0xffL & (l ^ (long) (this.anInt4989 >> 1295609864)))]);
        l = (l >>> -455753976 ^ ls[(int) ((l ^ (long) this.anInt4989) & 0xffL)]);
        l = (l >>> 926476232 ^ ls[(int) (0xffL & ((long) this.anInt4993 ^ l))]);
        l = ls[(int) ((l ^ (long) (this.anInt4982 >> -1449545672)) & 0xffL)] ^ l >>> -1904788408;
        l = (l >>> -1886860152 ^ ls[(int) ((l ^ (long) (this.anInt4982 >> -1179242768)) & 0xffL)]);
        if (i < 46) return -94L;
        l = ls[(int) ((l ^ (long) (this.anInt4982 >> -365755512)) & 0xffL)] ^ l >>> -1299525048;
        l = (l >>> 930759944 ^ ls[(int) (0xffL & ((long) this.anInt4982 ^ l))]);
        l = (ls[(int) (0xffL & (l ^ (long) this.anInt4981))] ^ l >>> 1555250760);
        l = (l >>> -496446648 ^ ls[(int) (0xffL & ((long) (this.aBoolean4990 ? 1 : 0) ^ l))]);
        return l;
    }

    static final void method1114(int i, int i_2_) {
        anInt4986++;
        if (i < 0 || i > 2) i = 0;
        Class348_Sub6.anInt6637 = i;
        Class348_Sub51.aClass318_Sub10Array7249 = new Class318_Sub10[1 + (Class348_Sub42_Sub9.anIntArray9558[Class348_Sub6.anInt6637])];
        Class258_Sub3.anInt8550 = 0;
        if (i_2_ >= -118) method1114(-43, -71);
        Class376.anInt4559 = 0;
    }

    public final boolean method53(int i, Interface14 interface14) {
        anInt4994++;
        if (!(interface14 instanceof Class126)) return false;
        Class126 class126_3_ = (Class126) interface14;
        if (this.anInt4991 != class126_3_.anInt4991) return false;
        if (i <= 50) return true;
        if (this.anInt4992 != class126_3_.anInt4992) return false;
        if (this.anInt4989 != class126_3_.anInt4989) return false;
        if (this.anInt4993 != class126_3_.anInt4993) return false;
        if (class126_3_.anInt4982 != this.anInt4982) return false;
        if (this.anInt4981 != class126_3_.anInt4981) return false;
        return !class126_3_.aBoolean4990 == !this.aBoolean4990;
    }
}
