/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class83 {
    Class258_Sub1 aClass258_Sub1_1440;
    static String[] aStringArray1441 = new String[200];
    boolean aBoolean1442;
    Class258_Sub1 aClass258_Sub1_1443 = null;
    Class258_Sub3[] aClass258_Sub3Array1444 = null;
    static int anInt1445;
    Class258_Sub1 aClass258_Sub1_1446 = null;
    static int anInt1447 = 0;
    Class258_Sub3[] aClass258_Sub3Array1448;

    public static void method815(boolean bool) {
        if (bool != false)
            method815(true);
        aStringArray1441 = null;
    }

    Class83(ha_Sub2 var_ha_Sub2) {
        ((Class83) this).aClass258_Sub1_1440 = null;
        ((Class83) this).aClass258_Sub3Array1448 = null;
        ((Class83) this).aBoolean1442 = ((ha_Sub2) var_ha_Sub2).aBoolean7831;
        Class348_Sub37.method3030(8, var_ha_Sub2);
        if (((Class83) this).aBoolean1442) {
            byte[] is = Class50_Sub1.method461(false, Class337.anObject4177,
                    53146732);
            ((Class83) this).aClass258_Sub1_1440
                    = new Class258_Sub1(var_ha_Sub2, 6410, 128, 128, 16, is, 6410);
            is = Class50_Sub1.method461(false, Class319.anObject3985,
                    53146732);
            ((Class83) this).aClass258_Sub1_1446
                    = new Class258_Sub1(var_ha_Sub2, 6410, 128, 128, 16, is, 6410);
            Class188 class188 = ((ha_Sub2) var_ha_Sub2).aClass188_7736;
            if (class188.method1414(35632)) {
                is = Class50_Sub1.method461(false, Class369_Sub2.anObject8592,
                        53146732);
                ((Class83) this).aClass258_Sub1_1443
                        = new Class258_Sub1(var_ha_Sub2, 6408, 128, 128, 16);
                Class258_Sub1 class258_sub1
                        = new Class258_Sub1(var_ha_Sub2, 6409, 128, 128, 16, is,
                        6409);
                if (!class188.method1413(((Class83) this).aClass258_Sub1_1443,
                        class258_sub1, -114, 2.0F)) {
                    ((Class83) this).aClass258_Sub1_1443.method1952(-19948);
                    ((Class83) this).aClass258_Sub1_1443 = null;
                } else
                    ((Class83) this).aClass258_Sub1_1443.method1950(-82);
                class258_sub1.method1952(-19948);
            }
        } else {
            ((Class83) this).aClass258_Sub3Array1444 = new Class258_Sub3[16];
            for (int i = 0; i < 16; i++) {
                byte[] is
                        = Class173.method1331((byte) 97, Class337.anObject4177,
                        2 * (128 * i) * 128, 32768);
                ((Class83) this).aClass258_Sub3Array1444[i]
                        = new Class258_Sub3(var_ha_Sub2, 3553, 6410, 128, 128,
                        true, is, 6410, false);
            }
            ((Class83) this).aClass258_Sub3Array1448 = new Class258_Sub3[16];
            for (int i = 0; (i ^ 0xffffffff) > -17; i++) {
                byte[] is
                        = Class173.method1331((byte) 110, Class319.anObject3985,
                        2 * i * 16384, 32768);
                ((Class83) this).aClass258_Sub3Array1448[i]
                        = new Class258_Sub3(var_ha_Sub2, 3553, 6410, 128, 128,
                        true, is, 6410, false);
            }
        }
    }
}
