/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class256 {
    static int anInt3294;
    static int[] anIntArray3295 = new int[25];

    static final Class174 method1943(boolean bool, int i) {
        anInt3294++;
        Class174 class174 = ((Class174) Class318_Sub1_Sub2.aClass60_8732.method583(i, -78));
        if (class174 != null) return class174;
        byte[] is = Class59_Sub2_Sub1.aClass45_8670.method410(-1860, 1, i);
        class174 = new Class174();
        if (bool != false) method1944(64);
        class174.anInt2303 = i;
        if (is != null) class174.method1336(83, new Class348_Sub49(is));
        class174.method1337(-1);
        if (class174.anInt2296 == 2 && (Class59_Sub2_Sub2.aClass356_8679.method3480(i, -6008) == null)) {
            Class59_Sub2_Sub2.aClass356_8679.method3483((byte) 87, i, new Class348_Sub35(Class285_Sub1.anInt8492));
            Class19.aClass174Array311[Class285_Sub1.anInt8492++] = class174;
        }
        Class318_Sub1_Sub2.aClass60_8732.method582(class174, i, (byte) -109);
        return class174;
    }

    public static void method1944(int i) {
        anIntArray3295 = null;
        if (i != 1) method1944(-45);
    }
}
