/* Class348_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.hardware_info.HardwareInfo;

final class Class348_Sub4 extends Class348 {
    private int anInt6591;
    private int anInt6592;
    static int anInt6593;
    private int anInt6594;
    private int anInt6595;
    private int anInt6596;
    private String aString6597;
    private int anInt6598;
    private int anInt6599;
    static int anInt6600;
    static Class248 aClass248_6601;
    static Class173 aClass173_6602 = new Class173();
    private int anInt6603;
    private String aString6604;
    private int anInt6605;
    private int anInt6606;
    private boolean aBoolean6607;
    private boolean aBoolean6608;
    int anInt6609;
    private String aString6610;
    static int anInt6611;
    private int anInt6612;
    private int anInt6613;
    private String aString6614;
    static int anInt6615;
    private int anInt6616;
    private int anInt6617;

    private final void method2745(int i) {
        if (aString6604.length() > 40)
            aString6604 = aString6604.substring(0, 40);
        anInt6615++;
        if (aString6614.length() > 40)
            aString6614 = aString6614.substring(0, 40);
        if (aString6610.length() > i)
            aString6610 = aString6610.substring(0, 10);
        if ((aString6597.length() ^ 0xffffffff) < -11)
            aString6597 = aString6597.substring(0, 10);
    }

    final int method2746(byte i) {
        anInt6600++;
        int i_0_ = 23;
        i_0_ += Class288.method2186((byte) -114, aString6604);
        i_0_ += Class288.method2186((byte) -114, aString6614);
        i_0_ += Class288.method2186((byte) -114, aString6610);
        int i_1_ = 42 % ((44 - i) / 49);
        i_0_ += Class288.method2186((byte) -114, aString6597);
        return i_0_;
    }

    final void method2747(int i, Class348_Sub49 class348_sub49) {
        class348_sub49.method3378(false, 5);
        anInt6611++;
        class348_sub49.method3378(false, anInt6613);
        class348_sub49.method3378(false, aBoolean6608 ? 1 : 0);
        class348_sub49.method3378(false, anInt6595);
        class348_sub49.method3378(false, anInt6594);
        class348_sub49.method3378(false, anInt6616);
        class348_sub49.method3378(false, anInt6605);
        class348_sub49.method3378(false, anInt6612);
        class348_sub49.method3378(false, !aBoolean6607 ? 0 : 1);
        class348_sub49.method3337((byte) 107, anInt6592);
        class348_sub49.method3378(false, anInt6599);
        class348_sub49.method3340(i ^ ~0x26b6,
                ((Class348_Sub4) this).anInt6609);
        class348_sub49.method3337((byte) 107, anInt6591);
        class348_sub49.method3378(false, anInt6598);
        class348_sub49.method3378(false, anInt6596);
        class348_sub49.method3378(false, anInt6603);
        class348_sub49.method3386(aString6604, 123);
        class348_sub49.method3386(aString6614, -45);
        class348_sub49.method3386(aString6610, 100);
        if (i == 1) {
            class348_sub49.method3386(aString6597, -14);
            class348_sub49.method3378(false, anInt6606);
            class348_sub49.method3337((byte) 107, anInt6617);
        }
    }

    public static void method2748(int i) {
        int i_2_ = 80 / ((52 - i) / 57);
        aClass173_6602 = null;
        aClass248_6601 = null;
    }

    static final int method2749(int i) {
        if (i != -1)
            method2749(20);
        anInt6593++;
        return za_Sub1.anInt9774;
    }

    public Class348_Sub4() {
        /* empty */
    }

    Class348_Sub4(boolean bool, Class297 class297) {
        if (bool) {
            if (Class297.aString3803.startsWith("win"))
                anInt6613 = 1;
            else if (Class297.aString3803.startsWith("mac"))
                anInt6613 = 2;
            else if (Class297.aString3803.startsWith("linux"))
                anInt6613 = 3;
            else
                anInt6613 = 4;
            if (!Class297.aString3780.startsWith("amd64")
                    && !Class297.aString3780.startsWith("x86_64"))
                aBoolean6608 = false;
            else
                aBoolean6608 = true;
            if (anInt6613 != 1) {
                if ((anInt6613 ^ 0xffffffff) == -3) {
                    if ((Class297.aString3778.indexOf("10.4") ^ 0xffffffff)
                            == 0) {
                        if (Class297.aString3778.indexOf("10.5") == -1) {
                            if ((Class297.aString3778.indexOf("10.6")
                                    ^ 0xffffffff)
                                    != 0)
                                anInt6595 = 22;
                        } else
                            anInt6595 = 21;
                    } else
                        anInt6595 = 20;
                }
            } else if (Class297.aString3778.indexOf("4.0") != -1)
                anInt6595 = 1;
            else if (Class297.aString3778.indexOf("4.1") == -1) {
                if ((Class297.aString3778.indexOf("4.9") ^ 0xffffffff) == 0) {
                    if ((Class297.aString3778.indexOf("5.0") ^ 0xffffffff)
                            != 0)
                        anInt6595 = 4;
                    else if ((Class297.aString3778.indexOf("5.1") ^ 0xffffffff)
                            == 0) {
                        if ((Class297.aString3778.indexOf("6.0") ^ 0xffffffff)
                                != 0)
                            anInt6595 = 6;
                        else if (Class297.aString3778.indexOf("6.1") != -1)
                            anInt6595 = 7;
                    } else
                        anInt6595 = 5;
                } else
                    anInt6595 = 3;
            } else
                anInt6595 = 2;
            if ((Class297.aString3782.toLowerCase().indexOf("sun")
                    ^ 0xffffffff)
                    != 0)
                anInt6594 = 1;
            else if ((Class297.aString3782.toLowerCase().indexOf("microsoft")
                    ^ 0xffffffff)
                    == 0) {
                if ((Class297.aString3782.toLowerCase().indexOf("apple")
                        ^ 0xffffffff)
                        != 0)
                    anInt6594 = 3;
                else
                    anInt6594 = 4;
            } else
                anInt6594 = 2;
            int i = 2;
            int i_3_ = 0;
            try {
                while ((i ^ 0xffffffff)
                        > (Class297.aString3796.length() ^ 0xffffffff)) {
                    int i_4_ = Class297.aString3796.charAt(i);
                    if ((i_4_ ^ 0xffffffff) > -49 || (i_4_ ^ 0xffffffff) < -58)
                        break;
                    i++;
                    i_3_ = i_3_ * 10 - -i_4_ + -48;
                }
            } catch (Exception exception) {
                /* empty */
            }
            anInt6616 = i_3_;
            i = Class297.aString3796.indexOf('.', 2) - -1;
            i_3_ = 0;
            try {
                for (/**/; ((Class297.aString3796.length() ^ 0xffffffff)
                        < (i ^ 0xffffffff)); i++) {
                    int i_5_ = Class297.aString3796.charAt(i);
                    if ((i_5_ ^ 0xffffffff) > -49 || i_5_ > 57)
                        break;
                    i_3_ = i_3_ * 10 + i_5_ + -48;
                }
            } catch (Exception exception) {
                /* empty */
            }
            anInt6605 = i_3_;
            i_3_ = 0;
            i = 1 + Class297.aString3796.indexOf('_', 4);
            try {
                for (/**/; Class297.aString3796.length() > i; i++) {
                    int i_6_ = Class297.aString3796.charAt(i);
                    if (i_6_ < 48 || i_6_ > 57)
                        break;
                    i_3_ = i_6_ + -48 + i_3_ * 10;
                }
            } catch (Exception exception) {
                /* empty */
            }
            if (((Class297) class297).aBoolean3777)
                aBoolean6607 = false;
            else
                aBoolean6607 = true;
            anInt6612 = i_3_;
            anInt6592 = Class226.anInt2964;
            if (anInt6616 <= 3)
                anInt6599 = 0;
            else
                anInt6599 = Class348_Sub40_Sub29.anInt9372;
            try {
                int[] is = HardwareInfo.getCPUInfo();
                if (is != null && is.length == 7) {
                    anInt6598 = is[3];
                    anInt6596 = is[4];
                    anInt6591 = is[2];
                    anInt6603 = is[5];
                    ((Class348_Sub4) this).anInt6609 = is[6];
                }
            } catch (Throwable throwable) {
                ((Class348_Sub4) this).anInt6609 = 0;
            }
        }
        if (aString6610 == null)
            aString6610 = "";
        if (aString6604 == null)
            aString6604 = "";
        if (aString6597 == null)
            aString6597 = "";
        if (aString6614 == null)
            aString6614 = "";
        method2745(10);
    }
}
