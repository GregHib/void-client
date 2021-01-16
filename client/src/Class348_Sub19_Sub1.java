/* Class348_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub19_Sub1 extends Class348_Sub19 {
    byte[] aByteArray8984;
    int anInt8985;
    int anInt8986;
    boolean aBoolean8987;
    int anInt8988;

    final Class348_Sub19_Sub1 method2944(Class163 class163) {
        this.aByteArray8984
                = class163.method1272(this.aByteArray8984,
                1);
        this.anInt8988
                = class163.method1270(this.anInt8988,
                (byte) -85);
        if (this.anInt8986
                == this.anInt8985)
            this.anInt8986
                    = this.anInt8985
                    = class163.method1275(-114,
                    this.anInt8986);
        else {
            this.anInt8986
                    = class163.method1275(-83,
                    this.anInt8986);
            this.anInt8985
                    = class163.method1275(-80,
                    this.anInt8985);
            if (this.anInt8986
                    == this.anInt8985)
                this.anInt8986--;
        }
        return this;
    }

    Class348_Sub19_Sub1(int i, byte[] is, int i_0_, int i_1_) {
        this.anInt8988 = i;
        this.aByteArray8984 = is;
        this.anInt8986 = i_0_;
        this.anInt8985 = i_1_;
    }

    Class348_Sub19_Sub1(int i, byte[] is, int i_2_, int i_3_, boolean bool) {
        this.anInt8988 = i;
        this.aByteArray8984 = is;
        this.anInt8986 = i_2_;
        this.anInt8985 = i_3_;
        this.aBoolean8987 = bool;
    }
}
