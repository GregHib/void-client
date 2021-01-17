/* Class348_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub1_Sub1 extends Class348_Sub1 {
    static s[] aSArray8801;
    static int anInt8802;
    static int anInt8803;
    static int anInt8804;
    static boolean aBoolean8805 = false;
    static int anInt8806;
    static Class60 aClass60_8807;
    static int anInt8808 = 0;
    static int anInt8809;

    Class348_Sub1_Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f) {
        super(i, i_0_, i_1_, i_2_, i_3_, f);
    }

    final void method2725(int i, byte i_4_, int i_5_, int i_6_) {
        this.anInt6553 = i_5_;
        this.anInt6548 = i_6_;
        if (i_4_ == 70) {
            anInt8809++;
            this.anInt6562 = i;
        }
    }

    static final int method2726(int i, int i_7_, int i_8_) {
        if (i_8_ > i_7_) {
            int i_9_ = i_7_;
            i_7_ = i_8_;
            i_8_ = i_9_;
        }
        if (i != -21806) method2727((byte) -128, null, null);
        anInt8804++;
        int i_10_;
        for (/**/; i_8_ != 0; i_8_ = i_10_) {
            i_10_ = i_7_ % i_8_;
            i_7_ = i_8_;
        }
        return i_7_;
    }

    static final void method2727(byte i, Class237_Sub1 class237_sub1, byte[][] is) {
        try {
            anInt8802++;
            int[] is_11_ = {-1, 0, 0, 0, 0};
            int i_12_ = 67 % ((i - 14) / 47);
            int i_13_ = is.length;
            for (int i_14_ = 0; i_13_ > i_14_; i_14_++) {
                byte[] is_15_ = is[i_14_];
                if (is_15_ != null) {
                    Class348_Sub49 class348_sub49 = new Class348_Sub49(is_15_);
                    int i_16_ = (Class348_Sub23_Sub3.anIntArray9042[i_14_] >> 8);
                    int i_17_ = 0xff & Class348_Sub23_Sub3.anIntArray9042[i_14_];
                    int i_18_ = -za_Sub2.anInt9780 + i_16_ * 64;
                    int i_19_ = -Class90.anInt1517 + i_17_ * 64;
                    Class369_Sub1.method3570(false);
                    class237_sub1.method1681(class348_sub49, i_18_, Class348_Sub45.aClass361Array7108, Class90.anInt1517, za_Sub2.anInt9780, i_19_, (byte) 110);
                    class237_sub1.method1691(i_19_, Class348_Sub8.aHa6654, class348_sub49, is_11_, i_18_, (byte) -126);
                    if (!class237_sub1.aBoolean3109 && i_16_ == ha.anInt4581 / 8 && (i_17_ == Class327.anInt4095 / 8) && is_11_[0] != -1) {
                        Class259.aClass305_3304 = Class30.aClass84_413.method823(is_11_[2], is_11_[3], is_11_[1], -66, (Class123.aClass25_1813), is_11_[0]);
                        Class185.anInt2481 = is_11_[4];
                    }
                }
            }
            for (int i_20_ = 0; i_20_ < i_13_; i_20_++) {
                int i_21_ = ((Class348_Sub23_Sub3.anIntArray9042[i_20_] >> 8) * 64 - za_Sub2.anInt9780);
                int i_22_ = (-Class90.anInt1517 + ((0xff & Class348_Sub23_Sub3.anIntArray9042[i_20_]) * 64));
                byte[] is_23_ = is[i_20_];
                if (is_23_ == null && Class327.anInt4095 < 800) {
                    Class369_Sub1.method3570(false);
                    class237_sub1.method1688(i_22_, 64, 64, 125, i_21_);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("bg.E(" + i + ',' + (class237_sub1 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method2728(byte i) {
        if (i != 9) aClass60_8807 = null;
        aClass60_8807 = null;
        aSArray8801 = null;
    }

    final void method2716(int i, float f) {
        this.aFloat6550 = f;
        if (i != -1) aClass60_8807 = null;
        anInt8803++;
    }

    static {
        aClass60_8807 = new Class60(8);
    }
}
