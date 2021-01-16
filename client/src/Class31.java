/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class31 {
    int anInt420;
    private int anInt421;
    int anInt422;
    private String aString423;
    int anInt424;
    static int anInt425;
    int anInt426 = -1;
    static int anInt427;
    static int anInt428;
    private int anInt429 = -1;
    static Class113 aClass113_430;
    int anInt431;
    static int anInt432;
    private int anInt433;
    int anInt434;
    int anInt435;
    static int anInt436;
    static int anInt437;
    Class219 aClass219_438;
    private int anInt439;
    static int anInt440;
    static int anInt441;
    static int anInt442;
    static int anInt443 = 1;
    int anInt444;
    static int anInt445;
    static int anInt446;

    final Class105 method324(ha var_ha, boolean bool) {
        anInt440++;
        if (bool != true)
            return null;
        if (anInt429 < 0)
            return null;
        Class105 class105
                = (Class105) ((Class219) ((Class31) this).aClass219_438)
                .aClass60_2862.method583((long) anInt429, -62);
        if (class105 == null) {
            method330(var_ha, -41);
            class105
                    = (Class105) ((Class219) ((Class31) this).aClass219_438)
                    .aClass60_2862.method583((long) anInt429, 53);
        }
        return class105;
    }

    final Class105 method325(ha var_ha, int i) {
        anInt428++;
        if (anInt439 < 0)
            return null;
        Class105 class105
                = (Class105) ((Class219) ((Class31) this).aClass219_438)
                .aClass60_2862.method583((long) anInt439, -59);
        if (i < 23)
            return null;
        if (class105 == null) {
            method330(var_ha, -118);
            class105 = (Class105) ((Class219) ((Class31) this).aClass219_438)
                    .aClass60_2862
                    .method583((long) anInt439, 123);
        }
        return class105;
    }

    static final void method326(byte i) {
        anInt442++;
        if (!Class50_Sub1.aBoolean5224) {
            Class369_Sub3_Sub1.aBoolean10174 = true;
            Class348_Sub27.aFloat6898
                    += (12.0F - Class348_Sub27.aFloat6898) / 2.0F;
            Class50_Sub1.aBoolean5224 = true;
            if (i != 68)
                aClass113_430 = null;
        }
    }

    final Class105 method327(ha var_ha, byte i) {
        anInt432++;
        if (anInt421 < 0)
            return null;
        Class105 class105
                = (Class105) ((Class219) ((Class31) this).aClass219_438)
                .aClass60_2862.method583((long) anInt421, 118);
        if (class105 == null) {
            method330(var_ha, -66);
            class105 = (Class105) ((Class219) ((Class31) this).aClass219_438)
                    .aClass60_2862
                    .method583((long) anInt421, 119);
        }
        int i_0_ = 20 % ((i - 19) / 51);
        return class105;
    }

    public static void method328(int i) {
        if (i != 0)
            anInt425 = -128;
        aClass113_430 = null;
    }

    private final void method329(Class348_Sub49 class348_sub49, int i,
                                 int i_1_) {
        if (i_1_ != 1) {
            if (i_1_ != 2) {
                if ((i_1_ ^ 0xffffffff) == -4)
                    anInt421 = class348_sub49.method3330(842397944);
                else if ((i_1_ ^ 0xffffffff) != -5) {
                    if ((i_1_ ^ 0xffffffff) == -6)
                        anInt433 = class348_sub49.method3330(842397944);
                    else if (i_1_ == 6)
                        anInt439 = class348_sub49.method3330(842397944);
                    else if (i_1_ != 7) {
                        if ((i_1_ ^ 0xffffffff) != -9) {
                            if ((i_1_ ^ 0xffffffff) != -10) {
                                if (i_1_ != 10) {
                                    if ((i_1_ ^ 0xffffffff) == -12)
                                        ((Class31) this).anInt426 = 0;
                                    else if (i_1_ == 12)
                                        ((Class31) this).anInt431
                                                = class348_sub49.method3387(255);
                                    else if ((i_1_ ^ 0xffffffff) == -14)
                                        ((Class31) this).anInt420
                                                = class348_sub49
                                                .method3372(i ^ ~0x3547);
                                    else if ((i_1_ ^ 0xffffffff) == -15)
                                        ((Class31) this).anInt426
                                                = class348_sub49
                                                .method3330(842397944);
                                } else
                                    ((Class31) this).anInt422
                                            = class348_sub49.method3372(13638);
                            } else
                                ((Class31) this).anInt434
                                        = class348_sub49.method3330(842397944);
                        } else
                            aString423 = class348_sub49.method3371(i ^ 0x34af);
                    } else
                        ((Class31) this).anInt424
                                = class348_sub49.method3372(13638);
                } else
                    anInt429 = class348_sub49.method3330(842397944);
            } else
                ((Class31) this).anInt444 = class348_sub49.method3351(-1);
        } else
            ((Class31) this).anInt435 = class348_sub49.method3330(842397944);
        if (i != -2)
            method333(-112, 38);
        anInt437++;
    }

    private final void method330(ha var_ha, int i) {
        anInt446++;
        Class45 class45
                = ((Class219) ((Class31) this).aClass219_438).aClass45_2873;
        if (anInt421 >= 0
                && ((Class219) ((Class31) this).aClass219_438).aClass60_2862
                .method583((long) anInt421, 121) == null
                && class45.method421(false, anInt421)) {
            Class207 class207 = Class207.method1512(class45, anInt421);
            ((Class219) ((Class31) this).aClass219_438).aClass60_2862.method582
                    (var_ha.method3691(class207, true), (long) anInt421,
                            (byte) -112);
        }
        if (anInt433 >= 0
                && ((Class219) ((Class31) this).aClass219_438).aClass60_2862
                .method583((long) anInt433, -99) == null
                && class45.method421(false, anInt433)) {
            Class207 class207 = Class207.method1512(class45, anInt433);
            ((Class219) ((Class31) this).aClass219_438).aClass60_2862.method582
                    (var_ha.method3691(class207, true), (long) anInt433,
                            (byte) -128);
        }
        if (anInt429 >= 0
                && ((Class219) ((Class31) this).aClass219_438).aClass60_2862
                .method583((long) anInt429, 86) == null
                && class45.method421(false, anInt429)) {
            Class207 class207 = Class207.method1512(class45, anInt429);
            ((Class219) ((Class31) this).aClass219_438).aClass60_2862.method582
                    (var_ha.method3691(class207, true), (long) anInt429,
                            (byte) -108);
        }
        if (i > -7)
            ((Class31) this).anInt434 = -14;
        if ((anInt439 ^ 0xffffffff) <= -1
                && ((Class219) ((Class31) this).aClass219_438).aClass60_2862
                .method583((long) anInt439, -83) == null
                && class45.method421(false, anInt439)) {
            Class207 class207 = Class207.method1512(class45, anInt439);
            ((Class219) ((Class31) this).aClass219_438).aClass60_2862.method582
                    (var_ha.method3691(class207, true), (long) anInt439,
                            (byte) -101);
        }
    }

    final Class105 method331(ha var_ha, byte i) {
        anInt441++;
        if ((anInt433 ^ 0xffffffff) > -1)
            return null;
        int i_2_ = -84 % ((i - 32) / 35);
        Class105 class105
                = (Class105) ((Class219) ((Class31) this).aClass219_438)
                .aClass60_2862.method583((long) anInt433, -50);
        if (class105 == null) {
            method330(var_ha, -89);
            class105 = (Class105) ((Class219) ((Class31) this).aClass219_438)
                    .aClass60_2862
                    .method583((long) anInt433, -117);
        }
        return class105;
    }

    final void method332(int i, Class348_Sub49 class348_sub49) {
        if (i > -119)
            method333(119, -71);
        for (; ; ) {
            int i_3_ = class348_sub49.method3387(255);
            if ((i_3_ ^ 0xffffffff) == -1)
                break;
            method329(class348_sub49, -2, i_3_);
        }
        anInt427++;
    }

    final String method333(int i, int i_4_) {
        anInt445++;
        String string = aString423;
        if (i_4_ != 0)
            return null;
        for (; ; ) {
            int i_5_ = string.indexOf("%1");
            if (i_5_ < 0)
                break;
            string = (string.substring(0, i_5_)
                    + Class140.method1171(i, 55, false)
                    + string.substring(i_5_ - -2));
        }
        return string;
    }

    public Class31() {
        aString423 = "";
        ((Class31) this).anInt424 = 0;
        anInt433 = -1;
        ((Class31) this).anInt422 = 0;
        anInt439 = -1;
        ((Class31) this).anInt431 = -1;
        ((Class31) this).anInt434 = 70;
        ((Class31) this).anInt435 = -1;
        anInt421 = -1;
        ((Class31) this).anInt420 = 0;
        ((Class31) this).anInt444 = 16777215;
    }

    static {
        aClass113_430 = new Class113();
    }
}
