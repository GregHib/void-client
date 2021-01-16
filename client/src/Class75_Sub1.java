/* Class75_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class75_Sub1 extends Class75 {
    static int anInt5652 = 1;
    static int anInt5653;
    static float aFloat5654 = 1.0F;

    static final void method769(int i, byte i_0_) {
        anInt5653++;
        if (i_0_ > 109 && Class320.method2547(i, (byte) 84)) Class348_Sub42_Sub4.method3180(-1, (Class348_Sub40_Sub33.aClass46ArrayArray9427[i]), 24235);
    }

    static final void method770(int i, int i_1_, int i_2_, Class318_Sub1_Sub1 class318_sub1_sub1) {
        Class357 class357 = Class348_Sub46.method3321(i, i_1_, i_2_);
        if (class357 != null) {
            class357.aClass318_Sub1_Sub1_4402 = class318_sub1_sub1;
            int i_3_ = aa_Sub1.aSArray5191 == Class332.aSArray4142 ? 1 : 0;
            if (class318_sub1_sub1.method2376(-93)) {
                if (class318_sub1_sub1.method2377((byte) 122)) {
                    class318_sub1_sub1.aClass318_Sub1_6379 = Class250.aClass318_Sub1Array3226[i_3_];
                    Class250.aClass318_Sub1Array3226[i_3_] = class318_sub1_sub1;
                } else {
                    class318_sub1_sub1.aClass318_Sub1_6379 = Class348.aClass318_Sub1Array4293[i_3_];
                    Class348.aClass318_Sub1Array4293[i_3_] = class318_sub1_sub1;
                    Class348_Sub16_Sub2.aBoolean8870 = true;
                }
            } else {
                class318_sub1_sub1.aClass318_Sub1_6379 = Class115.aClass318_Sub1Array1754[i_3_];
                Class115.aClass318_Sub1Array1754[i_3_] = class318_sub1_sub1;
            }
        }
    }
}
