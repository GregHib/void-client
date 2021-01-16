/* Class239_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub29 extends Class239 {
    static int anInt6144;
    static int anInt6145;
    static int anInt6146;
    static boolean aBoolean6147 = false;
    static int anInt6148;
    static int anInt6149;
    static int anInt6150;
    static int anInt6151;
    static int anInt6152;
    static int anInt6153;

    final int method1848(int i) {
        if (i != -32350) method1714(100, 29);
        anInt6145++;
        return this.anInt3138;
    }

    Class239_Sub29(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    final int method1710(int i) {
        anInt6153++;
        if (i != 20014) method1716(true);
        return 0;
    }

    Class239_Sub29(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void method1712(int i, int i_0_) {
        int i_1_ = -10 / ((i - 82) / 35);
        this.anInt3138 = i_0_;
        anInt6148++;
    }

    static final boolean method1849(char c, int i) {
        anInt6149++;
        if (Character.isISOControl(c)) return false;
        if (Class318_Sub1_Sub3_Sub3_Sub1.method2446(c, (byte) 105)) return true;
        char[] cs = Class185.aCharArray2488;
        for (int i_2_ = 0; cs.length > i_2_; i_2_++) {
            int i_3_ = cs[i_2_];
            if (c == i_3_) return true;
        }
        int i_4_ = -127 / ((i - 44) / 45);
        char[] cs_5_ = Class131.aCharArray1903;
        for (int i_6_ = 0; cs_5_.length > i_6_; i_6_++) {
            int i_7_ = cs_5_[i_6_];
            if (i_7_ == c) return true;
        }
        return false;
    }

    static final int method1850(int i, int i_8_) {
        anInt6144++;
        int i_9_ = 101 % ((-20 - i_8_) / 37);
        return i >>> -1456438840;
    }

    final int method1714(int i, int i_10_) {
        anInt6146++;
        if (i != 3) aBoolean6147 = false;
        return 1;
    }

    static final void method1851(byte i) {
        anInt6152++;
        for (int i_11_ = 0; i_11_ < 5; i_11_++)
            Class181.aBooleanArray2374[i_11_] = false;
        Class359.anInt4424 = Class59_Sub2_Sub2.anInt8685;
        Class283.anInt3662 = Class348_Sub42_Sub19.anInt9701;
        Class5_Sub3.anInt8368 = Class305.anInt3855;
        Class348_Sub49_Sub1.anInt9751 = Class367_Sub11.anInt7396;
        Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163 = -1;
        Class318_Sub1_Sub3_Sub2.anInt10047 = Class286_Sub4.anInt6246;
        int i_12_ = -99 % ((i - 11) / 56);
        Class239_Sub12.anInt5973 = 0;
        Class253.anInt3253 = Class5.anInt4638;
        Class367_Sub11.anInt7403 = 0;
        Class348_Sub40_Sub21.anInt9282 = 5;
        za_Sub1.anInt9775 = -1;
        Class292.anInt4803 = -1;
    }

    final void method1716(boolean bool) {
        if (this.anInt3138 < 0 || this.anInt3138 > 4) this.anInt3138 = method1710(20014);
        anInt6150++;
        if (bool != false) anInt6151 = 62;
    }
}
