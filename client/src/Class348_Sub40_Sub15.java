/* Class348_Sub40_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub15 extends Class348_Sub40 {
    static Class114 aClass114_9216 = new Class114(91, 2);
    static int anInt9217;
    static int anInt9218;
    static int anInt9219;
    private int anInt9220 = 4096;
    static int anInt9221;

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_0_) {
        int i_1_ = i;
        if (i_1_ == 0) anInt9220 = (class348_sub49.readUnsignedByte(255) << 12) / 255;
        if (i_0_ == 31015) anInt9217++;
    }

    static final void method3084(int i, byte i_2_, int i_3_) {
        anInt9218++;
        Class348_Sub42_Sub15 class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_3_, (byte) 105, 17);
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9652 = i;
        int i_4_ = 59 / ((i_2_ - -7) / 49);
    }

    public static void method3085(int i) {
        aClass114_9216 = null;
        if (i != 0) aClass114_9216 = null;
    }

    Class348_Sub40_Sub15(int i) {
        super(0, true);
        anInt9220 = i;
    }

    static final void method3086(int i, Class348_Sub16_Sub3 class348_sub16_sub3, int i_5_, Class45 class45, boolean bool, int i_6_, int i_7_) {
        try {
            anInt9219++;
            if (i != 2) aClass114_9216 = null;
            Class348_Sub1_Sub3.method2732(i_6_, i_7_, bool, 96, class45, i_5_);
            Class285.aClass348_Sub16_Sub3_4743 = class348_sub16_sub3;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("pba.D(" + i + ',' + (class348_sub16_sub3 != null ? "{...}" : "null") + ',' + i_5_ + ',' + (class45 != null ? "{...}" : "null") + ',' + bool + ',' + i_6_ + ',' + i_7_ + ')'));
        }
    }

    final int[] method3042(int i, int i_8_) {
        anInt9221++;
        int[] is = this.aClass191_7032.method1433(0, i);
        if (this.aClass191_7032.aBoolean2570) Class214.method1579(is, 0, Class348_Sub40_Sub6.anInt9139, anInt9220);
        if (i_8_ != 255) method3085(63);
        return is;
    }

    public Class348_Sub40_Sub15() {
        this(4096);
    }
}
