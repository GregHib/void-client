/* Class239_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub20 extends Class239 {
    static int anInt6048 = 0;
    static int anInt6049;
    static int anInt6050;
    static int anInt6051;
    static int anInt6052;
    static int anInt6053;
    static int[][] anIntArrayArray6054
            = {{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5},
            {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12},
            {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9},
            {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10},
            {12, 12, 12, 12}};
    static int anInt6055;
    static Class114 aClass114_6056 = new Class114(26, 11);

    final int method1710(int i) {
        if (i != 20014)
            return -9;
        anInt6055++;
        return 0;
    }

    final int method1714(int i, int i_0_) {
        anInt6051++;
        if (!Class348.method2714(7351,
                this.aClass348_Sub51_3136
                        .aClass239_Sub25_7271.method1829(-32350)))
            return 3;
        if (i != 3)
            method1807((byte) 64);
        return 1;
    }

    Class239_Sub20(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final boolean method1806(int i) {
        if (i < 85)
            method1714(-53, -119);
        anInt6049++;
        return Class348.method2714(7351,
                this.aClass348_Sub51_3136
                        .aClass239_Sub25_7271.method1829(-32350));
    }

    public static void method1807(byte i) {
        anIntArrayArray6054 = null;
        if (i != -121)
            anIntArrayArray6054 = null;
        aClass114_6056 = null;
    }

    Class239_Sub20(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    final int method1808(int i) {
        anInt6053++;
        if (i != -32350)
            anInt6048 = -97;
        return this.anInt3138;
    }

    final void method1712(int i, int i_1_) {
        int i_2_ = 38 / ((82 - i) / 35);
        anInt6052++;
        this.anInt3138 = i_1_;
    }

    final void method1716(boolean bool) {
        anInt6050++;
        if (bool != false)
            method1714(-51, -128);
        if (this.aClass348_Sub51_3136
                .aClass239_Sub25_7271.method1830((byte) -123)
                && !Class348.method2714(7351,
                this.aClass348_Sub51_3136
                        .aClass239_Sub25_7271
                        .method1829(-32350)))
            this.anInt3138 = 0;
        if (this.anInt3138 < 0
                || this.anInt3138 > 2)
            this.anInt3138 = method1710(20014);
    }
}
