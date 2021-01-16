/* Class239_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub23 extends Class239 {
    static int anInt6077;
    static int anInt6078;
    static int anInt6079;
    static int anInt6080;
    static int anInt6081;
    static int anInt6082;
    static int anInt6083;

    final int method1710(int i) {
        anInt6077++;
        if (i != 20014)
            return -71;
        if (!this.aClass348_Sub51_3136.method3425(-109)) {
            if (this.aClass348_Sub51_3136
                    .aClass239_Sub25_7271.method1830((byte) -107)
                    && Class14_Sub4.method252(this
                            .aClass348_Sub51_3136
                            .aClass239_Sub25_7271
                            .method1829(-32350),
                    5126))
                return 1;
            return 0;
        }
        return 2;
    }

    Class239_Sub23(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void method1716(boolean bool) {
        if (bool == false) {
            if (this.aClass348_Sub51_3136.method3425(-68))
                this.anInt3138 = 2;
            anInt6079++;
            if ((this.anInt3138 ^ 0xffffffff) > -1
                    || this.anInt3138 > 2)
                this.anInt3138 = method1710(20014);
        }
    }

    final boolean method1817(int i) {
        if (i < 85)
            return false;
        anInt6078++;
        return !this.aClass348_Sub51_3136.method3425(-108);
    }

    final int method1818(int i) {
        if (i != -32350)
            return 29;
        anInt6082++;
        return this.anInt3138;
    }

    final int method1714(int i, int i_0_) {
        if (i != 3)
            method1716(true);
        anInt6080++;
        if (this.aClass348_Sub51_3136.method3425(-109))
            return 3;
        return 1;
    }

    static final Class143 method1819(int i, int i_1_, int i_2_,
                                     Class45 class45) {
        anInt6081++;
        byte[] is = class45.method410(-1860, i, i_1_);
        if (i_2_ >= -31)
            method1819(65, -4, -97, null);
        if (is == null)
            return null;
        return new Class143(is);
    }

    final void method1712(int i, int i_3_) {
        anInt6083++;
        this.anInt3138 = i_3_;
        int i_4_ = 7 % ((82 - i) / 35);
    }

    Class239_Sub23(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }
}
