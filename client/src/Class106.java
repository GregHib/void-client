/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class106 {
    static int anInt1631;
    static int anInt1632;
    private Class339 aClass339_1633;
    static int anInt1634;
    static int[] anIntArray1635 = new int[16];
    static int[] anIntArray1636 = null;
    private final Class45 aClass45_1637;
    static int[][] anIntArrayArray1638 = {{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
    static int anInt1639;
    static int anInt1640;
    private final Class45 aClass45_1641;

    private final Class339 method998(int i) {
        anInt1632++;
        if (aClass339_1633 == null) aClass339_1633 = new Class339();
        if (i > -71) method1001(null, -15);
        return aClass339_1633;
    }

    public static void method999(int i) {
        anIntArray1636 = null;
        anIntArray1635 = null;
        anIntArrayArray1638 = null;
        if (i != 21745) method1001(null, -51);
    }

    final Interface1 method1000(boolean bool, Interface12 interface12) {
        anInt1640++;
        if (interface12 == null) return null;
        Class223 class223 = interface12.method51((byte) 120);
        if (Class219.aClass223_2868 == class223) return new Class177((Class52) interface12);
        if (Class101_Sub1.aClass223_5689 == class223) return new Class240(method998(-107), (Class125) interface12);
        if (class223 == Class348_Sub40_Sub21.aClass223_9274) return new Class127(aClass45_1637, (Class288) interface12);
        if (class223 == Class28.aClass223_4997) return new Class127_Sub1(aClass45_1637, (Class288_Sub1) interface12);
        if (class223 == Class348_Sub49.aClass223_7175) return new Class5_Sub2(aClass45_1637, aClass45_1641, (Class369_Sub2) interface12);
        if (class223 == Class313.aClass223_3934) return new Class5_Sub3(aClass45_1637, aClass45_1641, (Class369_Sub1) interface12);
        if (class223 == Class185.aClass223_2489) return new Class5_Sub1(aClass45_1637, aClass45_1641, (Class369_Sub3) interface12);
        if (class223 == Class174.aClass223_2307) return new Class67(aClass45_1637, aClass45_1641, (Class158) interface12);
        if (bool != true) anIntArray1636 = null;
        if (Class149.aClass223_2045 == class223) return new Class265(aClass45_1637, (Class120) interface12);
        if (Class187.aClass223_2507 == class223) return new Class5_Sub1_Sub1(aClass45_1637, aClass45_1641, (Class369_Sub3_Sub1) interface12);
        return null;
    }

    static final void method1001(Class45 class45, int i) {
        anInt1634++;
        Class56.anInt1044 = class45.method417("p11_full", i);
        Class17.anInt235 = class45.method417("p12_full", i);
        Class291.anInt3736 = class45.method417("b12_full", 0);
    }

    Class106(Class45 class45, Class45 class45_0_) {
        try {
            aClass45_1637 = class45;
            aClass45_1641 = class45_0_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("mia.<init>(" + (class45 != null ? "{...}" : "null") + ',' + (class45_0_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        anInt1631 = 0;
    }
}
