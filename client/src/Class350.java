/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class350 {
    int anInt4307;
    int anInt4308;
    int anInt4309;
    int anInt4310;
    int anInt4311 = 128;
    int anInt4312;
    int anInt4313;
    int anInt4314 = 128;
    static int anInt4315;
    int anInt4316;
    int anInt4317;
    static int anInt4318;
    static int anInt4319;
    int anInt4320;
    static int anInt4321;

    static final int method3452(int i, byte i_0_, int i_1_) {
        if (i_0_ != -15)
            method3452(80, (byte) 123, -88);
        anInt4315++;
        int i_2_ = i_1_ + -1 & i >> 1328912127;
        return (i + (i >>> -1222530561)) % i_1_ + i_2_;
    }

    final Class350 method3453(boolean bool) {
        anInt4318++;
        if (bool != true)
            method3453(false);
        return new Class350(this.anInt4313,
                this.anInt4314,
                this.anInt4311,
                this.anInt4316,
                this.anInt4317,
                this.anInt4308);
    }

    final void method3454(Class350 class350_3_, boolean bool) {
        this.anInt4308 = class350_3_.anInt4308;
        this.anInt4314 = class350_3_.anInt4314;
        if (bool == true) {
            this.anInt4316 = class350_3_.anInt4316;
            this.anInt4317 = class350_3_.anInt4317;
            anInt4321++;
            this.anInt4313 = class350_3_.anInt4313;
            this.anInt4311 = class350_3_.anInt4311;
        }
    }

    Class350(int i) {
        this.anInt4313 = i;
    }

    private Class350(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        this.anInt4317 = i_7_;
        this.anInt4313 = i;
        this.anInt4316 = i_6_;
        this.anInt4311 = i_5_;
        this.anInt4308 = i_8_;
        this.anInt4314 = i_4_;
    }
}
