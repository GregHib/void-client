/* Class348_Sub42_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub13 extends Class348_Sub42 {
    static int anInt9613;
    static int anInt9614;
    int anInt9615;
    static boolean aBoolean9616 = false;
    String aString9617;
    static int anInt9618;
    static int anInt9619;
    static int anInt9620;
    Class107 aClass107_9621;

    static final void method3232(double d, byte i) {
        if (i <= -54) {
            if (d != Class299_Sub2_Sub1.aDouble8713) {
                for (int i_0_ = 0; i_0_ < 256; i_0_++) {
                    int i_1_
                            = (int) (255.0 * Math.pow((double) i_0_ / 255.0, d));
                    Class318_Sub1_Sub3_Sub3.anIntArray10266[i_0_]
                            = Math.min(i_1_, 255);
                }
                Class299_Sub2_Sub1.aDouble8713 = d;
            }
            anInt9618++;
        }
    }

    final boolean method3233(Class348_Sub42_Sub12 class348_sub42_sub12,
                             int i) {
        anInt9613++;
        boolean bool = true;
        class348_sub42_sub12.method3162(true);
        Class348_Sub42_Sub12 class348_sub42_sub12_2_
                = ((Class348_Sub42_Sub12)
                this.aClass107_9621.method1011(-74));
        while (class348_sub42_sub12_2_ != null) {
            if (Class318_Sub2.method2496
                    (class348_sub42_sub12_2_.anInt9608,
                            class348_sub42_sub12.anInt9608,
                            true)) {
                Class69.method721(class348_sub42_sub12_2_,
                        class348_sub42_sub12, -1);
                this.anInt9615++;
                return !bool;
            }
            class348_sub42_sub12_2_
                    = (Class348_Sub42_Sub12) this
                    .aClass107_9621
                    .method1003((byte) 48);
            bool = false;
        }
        this.aClass107_9621
                .method1005(true, class348_sub42_sub12);
        int i_3_ = 80 % ((i - -81) / 33);
        this.anInt9615++;
        return bool;
    }

    final boolean method3234(byte i,
                             Class348_Sub42_Sub12 class348_sub42_sub12) {
        anInt9614++;
        int i_4_ = 41 % ((-30 - i) / 39);
        int i_5_ = method3235(-17937);
        class348_sub42_sub12.method3162(true);
        this.anInt9615--;
        if (this.anInt9615 == 0) {
            this.method2715((byte) 112);
            this.method3162(true);
            Class8.anInt166--;
            Class259.aClass60_3301.method582(this,
                    class348_sub42_sub12.aLong9600,
                    (byte) -128);
            return false;
        }
        return i_5_ != method3235(-17937);
    }

    Class348_Sub42_Sub13(String string) {
        this.aString9617 = string;
        this.aClass107_9621 = new Class107();
    }

    final int method3235(int i) {
        if (i != -17937)
            return 104;
        anInt9619++;
        if ((this.aClass107_9621
                .aClass348_Sub42_1647)
                != this.aClass107_9621
                        .aClass348_Sub42_1647.aClass348_Sub42_7063)
            return ((Class348_Sub42_Sub12) this.aClass107_9621
                    .aClass348_Sub42_1647.aClass348_Sub42_7063).anInt9608;
        return -1;
    }
}
