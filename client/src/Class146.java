/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class146 {
    static int anInt2012;
    static long[] aLongArray2013 = new long[10];
    static int anInt2014;
    static Class45 aClass45_2015;
    int anInt2016;
    static int anInt2017;
    static int anInt2018;
    int anInt2019;
    int anInt2020;

    final void method1191(int i, Class348_Sub49 class348_sub49) {
        if (i == 2048) {
            anInt2018++;
            for (; ; ) {
                int i_0_ = class348_sub49.method3387(255);
                if (i_0_ == 0) break;
                method1192(i_0_, class348_sub49, (byte) 17);
            }
        }
    }

    private final void method1192(int i, Class348_Sub49 class348_sub49, byte i_1_) {
        anInt2014++;
        if (i_1_ != 17) method1194(-80);
        if (i == 1) {
            this.anInt2019 = class348_sub49.method3330(842397944);
            this.anInt2016 = class348_sub49.method3387(255);
            this.anInt2020 = class348_sub49.method3387(i_1_ ^ 0xee);
        }
    }

    static final boolean method1193(int i, int i_2_, boolean bool) {
        if (bool != true) return true;
        anInt2017++;
        return (i_2_ & 0x800) != 0;
    }

    public static void method1194(int i) {
        if (i != 10) method1193(91, -68, true);
        aLongArray2013 = null;
        aClass45_2015 = null;
    }

    public Class146() {
        /* empty */
    }
}
