/* Class348_Sub40_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub3 extends Class348_Sub40 {
    static int anInt9102;
    static boolean aBoolean9103 = false;
    private int anInt9104;
    static int anInt9105;
    static int anInt9106;
    private int anInt9107 = 4096;
    static int anInt9108;
    static int anInt9109 = 104;
    static int anInt9110;

    final void method3049(Class348_Sub49 class348_sub49, int i, int i_0_) {
        int i_1_ = i;
        do {
            if (i_1_ == 0) {
                anInt9104 = class348_sub49.readUnsignedShort(842397944);
                break;
            } else if (i_1_ != 1) break;
            anInt9107 = class348_sub49.readUnsignedShort(842397944);
        } while (false);
        anInt9102++;
        if (i_0_ != 31015) method3056(-75, 18, 53);
    }

    static final void method3054(boolean bool, int i, int i_2_) {
        anInt9105++;
        if (i_2_ < -127) {
            Class348_Sub13 class348_sub13 = Class258_Sub4.method1974((byte) -122, i, bool);
            if (class348_sub13 != null) class348_sub13.method2715((byte) 97);
        }
    }

    public Class348_Sub40_Sub3() {
        super(1, true);
        anInt9104 = 0;
    }

    static final int method3055(int i, Class304 class304) {
        anInt9106++;
        if (i < 94) method3054(false, -98, -116);
        if (class304 != Class348_Sub45.aClass304_7103) {
            if (Class108.aClass304_1662 == class304) return 6408;
            if (class304 == Class348_Sub40_Sub38.aClass304_9471) return 6406;
            if (Class348_Sub40_Sub22.aClass304_9303 != class304) {
                if (class304 == Class191.aClass304_2571) return 6410;
                if (class304 == Class318.aClass304_3977) return 6145;
            } else return 6409;
        } else return 6407;
        throw new IllegalStateException();
    }

    final int[] method3042(int i, int i_3_) {
        anInt9110++;
        if (i_3_ != 255) anInt9107 = -121;
        int[] is = this.aClass191_7032.method1433(i_3_ + -255, i);
        if (this.aClass191_7032.aBoolean2570) {
            int[] is_4_ = this.method3048(i, 633706337, 0);
            for (int i_5_ = 0; (Class348_Sub40_Sub6.anInt9139 > i_5_); i_5_++) {
                int i_6_ = is_4_[i_5_];
                is[i_5_] = i_6_ >= anInt9104 && (i_6_ <= anInt9107) ? 4096 : 0;
            }
        }
        return is;
    }

    static final boolean method3056(int i, int i_7_, int i_8_) {
        if (i < 0) anInt9109 = 114;
        anInt9108++;
        return (0x22 & i_7_) != 0;
    }
}
