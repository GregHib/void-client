/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class162 {
    static int anInt2152;
    int anInt2153;
    static int anInt2154;
    int anInt2155;
    int anInt2156;
    static Class74 aClass74_2157 = new Class74(5, 16);
    int anInt2158;

    static final void method1265(int i) {
        anInt2152++;
        if (i != 16)
            aClass74_2157 = null;
        if (Class348_Sub40.aClass279_7042 != null)
            Class348_Sub40.aClass279_7042.method2093(true);
        if (Class194.aClass279_2596 != null)
            Class194.aClass279_2596.method2093(true);
    }

    final Class162 method1266(int i, int i_0_) {
        if (i != 5)
            method1266(82, -25);
        anInt2154++;
        return new Class162(this.anInt2153, i_0_,
                this.anInt2156,
                this.anInt2158);
    }

    Class162(int i, int i_1_, int i_2_, int i_3_) {
        this.anInt2156 = i_2_;
        this.anInt2155 = i_1_;
        this.anInt2158 = i_3_;
        this.anInt2153 = i;
    }

    public static void method1267(byte i) {
        aClass74_2157 = null;
        if (i != 85)
            method1267((byte) 121);
    }
}
