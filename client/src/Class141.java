/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class141 {
    private Class60 aClass60_1963 = new Class60(64);
    static int anInt1964;
    Class45 aClass45_1965;
    static Class273 aClass273_1966;
    static int anInt1967;
    static int anInt1968;
    static int anInt1969;
    static int anInt1970;
    private final Class45 aClass45_1971;
    static int anInt1972;
    static int[] anIntArray1973 = {0, 1, 2, 3, 4, 5, 6, 14};
    static int anInt1974;
    static int[] anIntArray1975;
    Class60 aClass60_1976 = new Class60(64);
    static Class26 aClass26_1977;

    final Class218 method1173(byte i, int i_0_) {
        anInt1964++;
        Class218 class218;
        synchronized (aClass60_1963) {
            class218 = (Class218) aClass60_1963.method583(i_0_, 118);
        }
        if (class218 != null) return class218;
        byte[] is;
        synchronized (aClass45_1971) {
            is = aClass45_1971.method410(i + -1891, 34, i_0_);
        }
        class218 = new Class218();
        if (i != 31) return null;
        class218.aClass141_2851 = this;
        if (is != null) class218.method1597((byte) -114, new Class348_Sub49(is));
        synchronized (aClass60_1963) {
            aClass60_1963.method582(class218, i_0_, (byte) -108);
        }
        return class218;
    }

    final void method1174(byte i) {
        synchronized (aClass60_1963) {
            aClass60_1963.method587(-87);
        }
        anInt1969++;
        synchronized (this.aClass60_1976) {
            if (i > -89) {
                /* empty */
            } else this.aClass60_1976.method587(-79);
        }
    }

    final void method1175(byte i) {
        synchronized (aClass60_1963) {
            aClass60_1963.method590(i + -125);
        }
        anInt1967++;
        if (i == 125) {
            synchronized (this.aClass60_1976) {
                this.aClass60_1976.method590(0);
            }
        }
    }

    final void method1176(int i, byte i_1_) {
        if (i_1_ < 31) method1177((byte) -119);
        synchronized (aClass60_1963) {
            aClass60_1963.method578(2, i);
        }
        anInt1968++;
        synchronized (this.aClass60_1976) {
            this.aClass60_1976.method578(2, i);
        }
    }

    static final void method1177(byte i) {
        Class291.anIntArray3726 = Class367_Sub1.method3533((byte) 127, 2048, 4, 8, 0.4F, 35, true, 8);
        if (i == 122) anInt1970++;
    }

    final void method1178(int i, int i_2_, int i_3_) {
        anInt1972++;
        if (i_2_ != 1) aClass273_1966 = null;
        aClass60_1963 = new Class60(i_3_);
        this.aClass60_1976 = new Class60(i);
    }

    public static void method1179(byte i) {
        anIntArray1975 = null;
        aClass26_1977 = null;
        anIntArray1973 = null;
        aClass273_1966 = null;
        if (i >= -111) method1177((byte) 47);
    }

    Class141(Game game, int i, Class45 class45, Class45 class45_4_) {
        try {
            this.aClass45_1965 = class45_4_;
            aClass45_1971 = class45;
            aClass45_1971.method407(0, 34);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("oda.<init>(" + (game != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_4_ != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aClass273_1966 = new Class273("", 18);
        anIntArray1975 = new int[1];
    }
}
