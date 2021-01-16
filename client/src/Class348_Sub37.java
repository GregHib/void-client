/* Class348_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub37 extends Class348 {
    static int anInt6996;
    static boolean aBoolean6997 = false;
    Class262 aClass262_6998 = new Class262();
    static int anInt6999;

    static final void method3030(int i, ha_Sub2 var_ha_Sub2) {
        anInt6999++;
        if (Class337.anObject4177 == null) {
            Class59_Sub1_Sub2 class59_sub1_sub2 = new Class59_Sub1_Sub2();
            byte[] is = class59_sub1_sub2.method562(128, 128, (byte) 121, 16);
            Class337.anObject4177 = Class179.method1357(is, false, (byte) 81);
        }
        if (Class319.anObject3985 == null) {
            Class59_Sub2_Sub1 class59_sub2_sub1 = new Class59_Sub2_Sub1();
            byte[] is = class59_sub2_sub1.method567(128, (byte) 111, 16, 128);
            Class319.anObject3985 = Class179.method1357(is, false, (byte) 103);
        }
        if (i != 8)
            method3031(-39, null);
        Class188 class188 = ((ha_Sub2) var_ha_Sub2).aClass188_7736;
        if (class188.method1414(35632) && Class369_Sub2.anObject8592 == null) {
            byte[] is = Class5_Sub2.method194(128, -1922, 8, 0.6F, 128, 4.0F,
                    4.0F, 0.5F, 16.0F,
                    new Class186_Sub1(419684), 16);
            Class369_Sub2.anObject8592
                    = Class179.method1357(is, false, (byte) 78);
        }
    }

    static final Class348_Sub40 method3031(int i,
                                           Class348_Sub49 class348_sub49) {
        anInt6996++;
        class348_sub49.method3387(255);
        int i_0_ = class348_sub49.method3387(255);
        Class348_Sub40 class348_sub40
                = Class59_Sub1_Sub1.method557(i_0_, (byte) -84);
        ((Class348_Sub40) class348_sub40).anInt7036
                = class348_sub49.method3387(255);
        int i_1_ = class348_sub49.method3387(255);
        if (i < 123)
            return null;
        for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
            int i_3_ = class348_sub49.method3387(255);
            class348_sub40.method3049(class348_sub49, i_3_, 31015);
        }
        class348_sub40.method3044(120);
        return class348_sub40;
    }

    public Class348_Sub37() {
        /* empty */
    }
}
