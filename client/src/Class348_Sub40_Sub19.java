/* Class348_Sub40_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub40_Sub19 extends Class348_Sub40 {
    static int anInt9253;
    static Class114 aClass114_9254 = new Class114(73, 3);
    static int anInt9255;
    static int anInt9256;
    static Class114 aClass114_9257;
    static int anInt9258;
    static int[] anIntArray9259 = new int[2];
    /*synthetic*/ static Class aClass9260;

    static final void method3097(Class46[] class46s, int i, int i_0_) {
        if (i_0_ >= 116) {
            for (int i_1_ = 0; class46s.length > i_1_; i_1_++) {
                Class46 class46 = class46s[i_1_];
                if (class46 != null) {
                    if (class46.anInt774 == 0) {
                        if (class46.aClass46Array798 != null) method3097(class46.aClass46Array798, i, 125);
                        Class348_Sub41 class348_sub41 = ((Class348_Sub41) (Class125.aClass356_4915.method3480(class46.anInt830, -6008)));
                        if (class348_sub41 != null) Class239_Sub12.method1775((byte) -8, (class348_sub41.anInt7050), i);
                    }
                    if (i == 0 && class46.anObjectArray840 != null) {
                        Class348_Sub36 class348_sub36 = new Class348_Sub36();
                        class348_sub36.aClass46_6989 = class46;
                        class348_sub36.anObjectArray6987 = class46.anObjectArray840;
                        Class66.method705(class348_sub36);
                    }
                    if (i == 1 && class46.anObjectArray701 != null) {
                        if (class46.anInt704 >= 0) {
                            Class46 class46_2_ = Class324.method2570(1512932720, (class46.anInt830));
                            if (class46_2_ == null || (class46_2_.aClass46Array798 == null) || (class46.anInt704 >= (class46_2_.aClass46Array798).length) || class46 != (class46_2_.aClass46Array798[class46.anInt704])) continue;
                        }
                        Class348_Sub36 class348_sub36 = new Class348_Sub36();
                        class348_sub36.aClass46_6989 = class46;
                        class348_sub36.anObjectArray6987 = class46.anObjectArray701;
                        Class66.method705(class348_sub36);
                    }
                }
            }
            anInt9258++;
        }
    }

    final int[] method3042(int i, int i_3_) {
        if (i_3_ != 255) aClass114_9254 = null;
        anInt9256++;
        return Class318_Sub6.anIntArray6432;
    }

    public Class348_Sub40_Sub19() {
        super(0, true);
    }

    static final boolean method3098(int i, String string) {
        if (i != -30282) return true;
        anInt9255++;
        return Class348_Sub6.method2769((aClass9260 != null ? aClass9260 : (aClass9260 = method3101("Class90"))), (byte) 20, string);
    }

    public static void method3099(byte i) {
        aClass114_9254 = null;
        aClass114_9257 = null;
        anIntArray9259 = null;
        if (i >= -63) anIntArray9259 = null;
    }

    static final boolean method3100(int i, boolean bool, int i_4_) {
        anInt9253++;
        if (bool != false) anIntArray9259 = null;
        return Class230.method1637(i, 32768, i_4_) | (0x800 & i_4_) != 0 || Class273.method2056(i_4_, 86, i);
    }

    /*synthetic*/
    static Class method3101(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static {
        aClass114_9257 = new Class114(102, 3);
    }
}
