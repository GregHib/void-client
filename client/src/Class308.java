/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class308 {
    static int anInt3879;
    static int anInt3880;
    static int anInt3881;
    static byte[][] aByteArrayArray3882;
    static int[] anIntArray3883;
    static Interface6[] anInterface6Array3884 = new Interface6[75];
    static int anInt3885;
    static int anInt3886;
    private Class348_Sub42 aClass348_Sub42_3887 = new Class348_Sub42();
    private final Class356 aClass356_3888;
    private Class107 aClass107_3889 = new Class107();
    private final int anInt3890;
    private int anInt3891;

    final Class348_Sub42 method2302(long l, byte i) {
        try {
            if (i > -25) aClass107_3889 = null;
            anInt3885++;
            Class348_Sub42 class348_sub42 = (Class348_Sub42) aClass356_3888.method3480(l, -6008);
            if (class348_sub42 != null) aClass107_3889.method1005(true, class348_sub42);
            return class348_sub42;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "wu.D(" + l + ',' + i + ')');
        }
    }

    final void method2303(boolean bool) {
        anInt3879++;
        if (bool != true) method2305(-121L, null, -1);
        aClass107_3889.method1009(2110355138);
        aClass356_3888.method3481(0);
        aClass348_Sub42_3887 = new Class348_Sub42();
        anInt3891 = anInt3890;
    }

    final void method2304(int i, long l) {
        do {
            try {
                anInt3880++;
                Class348_Sub42 class348_sub42 = (Class348_Sub42) aClass356_3888.method3480(l, -6008);
                if (class348_sub42 != null) {
                    class348_sub42.method2715((byte) 73);
                    class348_sub42.method3162(true);
                    anInt3891++;
                }
                if (i <= -110) break;
                method2304(36, -86L);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, "wu.C(" + i + ',' + l + ')');
            }
            break;
        } while (false);
    }

    final void method2305(long l, Class348_Sub42 class348_sub42, int i) {
        try {
            anInt3881++;
            if ((~anInt3891) == i) {
                Class348_Sub42 class348_sub42_0_ = aClass107_3889.method1008(20);
                class348_sub42_0_.method2715((byte) 113);
                class348_sub42_0_.method3162(true);
                if (class348_sub42_0_ == aClass348_Sub42_3887) {
                    class348_sub42_0_ = aClass107_3889.method1008(20);
                    class348_sub42_0_.method2715((byte) 79);
                    class348_sub42_0_.method3162(true);
                }
            } else anInt3891--;
            aClass356_3888.method3483((byte) 37, l, class348_sub42);
            aClass107_3889.method1005(true, class348_sub42);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("wu.E(" + l + ',' + (class348_sub42 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    public static void method2306(byte i) {
        if (i != -90) method2306((byte) -74);
        anIntArray3883 = null;
        anInterface6Array3884 = null;
        aByteArrayArray3882 = null;
    }

    Class308(int i) {
        anInt3891 = i;
        anInt3890 = i;
        int i_1_;
        for (i_1_ = 1; i_1_ + i_1_ < i; i_1_ += i_1_) {
            /* empty */
        }
        aClass356_3888 = new Class356(i_1_);
    }

    static {
        anIntArray3883 = new int[6];
    }
}
