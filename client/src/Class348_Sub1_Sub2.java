/* Class348_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub1_Sub2 extends Class348_Sub1 {
    static Class262 aClass262_8810 = new Class262();
    static int anInt8811;
    static int anInt8812;
    static int anInt8813;
    static int anInt8814;
    static Class308 aClass308_8815 = new Class308(16);
    static byte[][] aByteArrayArray8816;
    static Class114 aClass114_8817 = new Class114(83, 2);

    final void method2725(int i, byte i_0_, int i_1_, int i_2_) {
        ((Class348_Sub1) this).anInt6553 = i_1_;
        ((Class348_Sub1) this).anInt6548 = i_2_;
        anInt8812++;
        if (i_0_ == 70)
            ((Class348_Sub1) this).anInt6562 = i;
    }

    static final int method2729(int i, int i_3_) {
        anInt8813++;
        if (i_3_ != 16)
            return 23;
        return 0xff & i;
    }

    static final byte[] method2730(int i, int i_4_, byte[] is, int i_5_) {
        if (i != 4567)
            method2730(-48, 112, null, -45);
        anInt8811++;
        byte[] is_6_;
        if ((i_4_ ^ 0xffffffff) < -1) {
            is_6_ = new byte[i_5_];
            for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i_5_ ^ 0xffffffff);
                 i_7_++)
                is_6_[i_7_] = is[i_4_ + i_7_];
        } else
            is_6_ = is;
        Class85 class85 = new Class85();
        class85.method829(i + -4682);
        class85.method832((long) (i_5_ * 8), is_6_, -69);
        byte[] is_8_ = new byte[64];
        class85.method833(true, 0, is_8_);
        return is_8_;
    }

    Class348_Sub1_Sub2(int i, int i_9_, int i_10_, int i_11_, int i_12_,
                       float f) {
        super(i, i_9_, i_10_, i_11_, i_12_, f);
    }

    public static void method2731(byte i) {
        aByteArrayArray8816 = null;
        if (i != -23)
            method2730(14, 86, null, -106);
        aClass262_8810 = null;
        aClass308_8815 = null;
        aClass114_8817 = null;
    }

    final void method2716(int i, float f) {
        ((Class348_Sub1) this).aFloat6550 = f;
        if (i == -1)
            anInt8814++;
    }
}
