/* Class348_Sub42_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub19 extends Class348_Sub42 {
    static Class351 aClass351_9687 = new Class351(14, -1);
    int anInt9688;
    int anInt9689;
    String aString9690;
    Class273 aClass273_9691;
    String[] aStringArray9692;
    Class356[] aClass356Array9693;
    int[] anIntArray9694;
    int anInt9695;
    int[] anIntArray9696;
    int anInt9697;
    static int anInt9698;
    static int anInt9699 = 0;
    static Class338[] aClass338Array9700;
    static int anInt9701;

    static final void method3276(Class211 class211) {
        if (Class331.anInt4135 < 65535) {
            Class348_Sub1 class348_sub1
                    = class211.aClass348_Sub1_2745;
            Class239_Sub14.aClass211Array5993[Class331.anInt4135] = class211;
            r.aBooleanArray9718[Class331.anInt4135] = false;
            Class331.anInt4135++;
            int i = class211.anInt2731;
            if (class211.aBoolean2749)
                i = 0;
            int i_0_ = class211.anInt2731;
            if (class211.aBoolean2737)
                i_0_ = Class189.anInt2524 - 1;
            for (int i_1_ = i; i_1_ <= i_0_; i_1_++) {
                int i_2_ = 0;
                int i_3_ = ((class348_sub1.method2717((byte) 89)
                        - class348_sub1.method2723(-1)
                        + Class348_Sub23_Sub2.anInt9037)
                        >> Class362.anInt4459);
                if (i_3_ < 0) {
                    i_2_ -= i_3_;
                    i_3_ = 0;
                }
                int i_4_ = ((class348_sub1.method2717((byte) 122)
                        + class348_sub1.method2723(-1)
                        - Class348_Sub23_Sub2.anInt9037)
                        >> Class362.anInt4459);
                if (i_4_ >= Class348_Sub41.anInt7054)
                    i_4_ = Class348_Sub41.anInt7054 - 1;
                for (int i_5_ = i_3_; i_5_ <= i_4_; i_5_++) {
                    int i_6_ = class211.aShortArray2742[i_2_++];
                    int i_7_ = (((class348_sub1.method2724(-1)
                            - class348_sub1.method2723(-1)
                            + Class348_Sub23_Sub2.anInt9037)
                            >> Class362.anInt4459)
                            + (i_6_ >>> 8));
                    int i_8_ = i_7_ + (i_6_ & 0xff) - 1;
                    if (i_7_ < 0)
                        i_7_ = 0;
                    if (i_8_ >= Class318_Sub7.anInt6451)
                        i_8_ = Class318_Sub7.anInt6451 - 1;
                    for (int i_9_ = i_7_; i_9_ <= i_8_; i_9_++) {
                        long l
                                = (Class348_Sub42_Sub8_Sub2
                                .aLongArrayArrayArray10431[i_1_][i_9_][i_5_]);
                        if ((l & 0xffffL) == 0L)
                            Class348_Sub42_Sub8_Sub2
                                    .aLongArrayArrayArray10431[i_1_][i_9_][i_5_]
                                    = l | (long) Class331.anInt4135;
                        else if ((l & 0xffff0000L) == 0L)
                            Class348_Sub42_Sub8_Sub2
                                    .aLongArrayArrayArray10431[i_1_][i_9_][i_5_]
                                    = l | (long) Class331.anInt4135 << 16;
                        else if ((l & 0xffff00000000L) == 0L)
                            Class348_Sub42_Sub8_Sub2
                                    .aLongArrayArrayArray10431[i_1_][i_9_][i_5_]
                                    = l | (long) Class331.anInt4135 << 32;
                        else if ((l & ~0xffffffffffffL) == 0L)
                            Class348_Sub42_Sub8_Sub2
                                    .aLongArrayArrayArray10431[i_1_][i_9_][i_5_]
                                    = l | (long) Class331.anInt4135 << 48;
                    }
                }
            }
        }
    }

    static final void method3277(byte i) {
        anInt9698++;
        if (i != -48)
            method3276(null);
        if (Class242.aClass348_Sub42_Sub13_3152 != null) {
            Class242.aClass348_Sub42_Sub13_3152 = null;
            Class13.method226(Class50_Sub3.anInt5252,
                    Class348_Sub1_Sub1.anInt8806, Class373.anInt4534,
                    0, Class177.anInt4669);
        }
    }

    public static void method3278(int i) {
        aClass351_9687 = null;
        if (i != 1)
            anInt9699 = -66;
        aClass338Array9700 = null;
    }

    public Class348_Sub42_Sub19() {
        /* empty */
    }
}
