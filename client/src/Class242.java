/* Class242 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class242 {
    static int anInt3151;
    static Class348_Sub42_Sub13 aClass348_Sub42_Sub13_3152 = null;
    private final ha_Sub2 aHa_Sub2_3153;
    static int anInt3154;
    static int anInt3155;
    long aLong3156;

    public static void method1866(int i) {
        if (i != 0) aClass348_Sub42_Sub13_3152 = null;
        aClass348_Sub42_Sub13_3152 = null;
    }

    static final void method1867(int i) {
        if (i < 44) method1868((byte) -81, null);
        anInt3155++;
        Class88.anInt1498++;
        Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class318_Sub1_Sub1.aClass351_8724, Class348_Sub23_Sub2.aClass77_9029, -99);
        class348_sub47.aClass348_Sub49_Sub2_7116.method3378(false, 0);
        Class348_Sub42_Sub14.method3243(118, class348_sub47);
    }

    protected final void finalize() throws Throwable {
        anInt3151++;
        aHa_Sub2_3153.method3769(this.aLong3156, false);
        super.finalize();
    }

    static final void method1868(byte i, Class348_Sub42_Sub13 class348_sub42_sub13) {
        int i_0_ = -104 / ((i - 38) / 54);
        anInt3154++;
        class348_sub42_sub13.method3162(true);
        boolean bool = false;
        for (Class348_Sub42_Sub13 class348_sub42_sub13_1_ = ((Class348_Sub42_Sub13) Class233.aClass107_3022.method1011(-85)); class348_sub42_sub13_1_ != null; class348_sub42_sub13_1_ = ((Class348_Sub42_Sub13) Class233.aClass107_3022.method1003((byte) 84))) {
            if (Class318_Sub2.method2496(class348_sub42_sub13_1_.method3235(-17937), class348_sub42_sub13.method3235(-17937), true)) {
                Class69.method721(class348_sub42_sub13_1_, class348_sub42_sub13, -1);
                bool = true;
                break;
            }
        }
        if (!bool) Class233.aClass107_3022.method1005(true, class348_sub42_sub13);
    }

    Class242(ha_Sub2 var_ha_Sub2, long l, int i) {
        try {
            aHa_Sub2_3153 = var_ha_Sub2;
            this.aLong3156 = l;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("tba.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + l + ',' + i + ')'));
        }
    }
}
