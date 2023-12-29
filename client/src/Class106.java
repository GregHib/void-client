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
    private final Index aIndex_1637;
    static int[][] anIntArrayArray1638 = {{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
    static int anInt1639;
    static int anInt1640;
    private final Index aIndex_1641;

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
        if (class223 == Class348_Sub40_Sub21.aClass223_9274) return new Class127(aIndex_1637, (Class288) interface12);
        if (class223 == Class28.aClass223_4997) return new Class127_Sub1(aIndex_1637, (Class288_Sub1) interface12);
        if (class223 == Class348_Sub49.aClass223_7175) return new Class5_Sub2(aIndex_1637, aIndex_1641, (Class369_Sub2) interface12);
        if (class223 == Class313.aClass223_3934) return new Class5_Sub3(aIndex_1637, aIndex_1641, (Class369_Sub1) interface12);
        if (class223 == Class185.aClass223_2489) return new Class5_Sub1(aIndex_1637, aIndex_1641, (Class369_Sub3) interface12);
        if (class223 == Class174.aClass223_2307) return new Class67(aIndex_1637, aIndex_1641, (Class158) interface12);
        if (bool != true) anIntArray1636 = null;
        if (Class149.aClass223_2045 == class223) return new Class265(aIndex_1637, (Class120) interface12);
        if (Class187.aClass223_2507 == class223) return new Class5_Sub1_Sub1(aIndex_1637, aIndex_1641, (Class369_Sub3_Sub1) interface12);
        return null;
    }

    static final void method1001(Index index, int i) {
        anInt1634++;
        Class56.anInt1044 = index.method417("p11_full", i);
        Class17.anInt235 = index.method417("p12_full", i);
        Class291.anInt3736 = index.method417("b12_full", 0);
    }

    Class106(Index index, Index index_0_) {
        try {
            aIndex_1637 = index;
            aIndex_1641 = index_0_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("mia.<init>(" + (index != null ? "{...}" : "null") + ',' + (index_0_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        anInt1631 = 0;
    }
}
