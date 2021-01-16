/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class187 {
    private Class45 aClass45_2498;
    static int anInt2499;
    static int anInt2500;
    private Class60 aClass60_2501 = new Class60(64);
    static int anInt2502;
    static int anInt2503;
    static int anInt2504;
    static int anInt2505;
    static int anInt2506;
    static Class223 aClass223_2507 = new Class223(9, 2);
    static int anInt2508;
    static int[] anIntArray2509 = new int[2];
    static int anInt2510;

    final void method1404(byte i) {
        synchronized (aClass60_2501) {
            aClass60_2501.method590(0);
            if (i >= -20)
                method1407((byte) -33);
        }
        anInt2508++;
    }

    static final void method1405(int i, boolean bool, boolean bool_0_) {
        anInt2506++;
        Class348_Sub13 class348_sub13
                = Class258_Sub4.method1974((byte) 42, i, bool);
        if (class348_sub13 != null && bool_0_ == true) {
            for (int i_1_ = 0;
                 ((i_1_ ^ 0xffffffff)
                         > (class348_sub13.anIntArray6757.length
                         ^ 0xffffffff));
                 i_1_++) {
                class348_sub13.anIntArray6757[i_1_] = -1;
                class348_sub13.anIntArray6758[i_1_] = 0;
            }
        }
    }

    static final void method1406(boolean bool) {
        if (bool == true) {
            Class3.method175((byte) -6);
            anInt2505++;
            Class59_Sub1.aBoolean5300 = false;
        }
    }

    public static void method1407(byte i) {
        int i_2_ = 92 / ((-3 - i) / 60);
        anIntArray2509 = null;
        aClass223_2507 = null;
    }

    final Class321 method1408(int i, int i_3_) {
        anInt2504++;
        Class321 class321;
        synchronized (aClass60_2501) {
            class321 = (Class321) aClass60_2501.method583(i_3_, 76);
        }
        if (class321 != null)
            return class321;
        byte[] is;
        synchronized (aClass45_2498) {
            is = aClass45_2498.method410(-1860, 35, i_3_);
        }
        class321 = new Class321();
        if (is != null)
            class321.method2551(-125, new Class348_Sub49(is));
        if (i != -12637)
            aClass60_2501 = null;
        class321.method2548((byte) 127);
        synchronized (aClass60_2501) {
            aClass60_2501.method582(class321, i_3_, (byte) -99);
        }
        return class321;
    }

    final void method1409(int i, int i_4_) {
        synchronized (aClass60_2501) {
            if (i_4_ != -20721)
                aClass45_2498 = null;
            aClass60_2501.method578(i_4_ + 20723, i);
        }
        anInt2503++;
    }

    final void method1410(int i) {
        synchronized (aClass60_2501) {
            if (i != -27995)
                method1409(-42, 23);
            aClass60_2501.method587(-85);
        }
        anInt2502++;
    }

    Class187(Class230 class230, int i, Class45 class45) {
        do {
            try {
                aClass45_2498 = class45;
                if (aClass45_2498 == null)
                    break;
                aClass45_2498.method407(0, 35);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception,
                        ("qga.<init>("
                                + (class230 != null ? "{...}"
                                : "null")
                                + ',' + i + ','
                                + (class45 != null ? "{...}"
                                : "null")
                                + ')'));
            }
            break;
        } while (false);
    }
}
