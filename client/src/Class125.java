/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class125 implements Interface12 {
    int anInt4913;
    boolean aBoolean4914;
    static Class356 aClass356_4915;
    static int anInt4916;
    int anInt4917;
    int anInt4918;
    static int anInt4919 = 0;
    int anInt4920;
    static Class323 aClass323_4921;
    Class221 aClass221_4922;
    int anInt4923;
    int anInt4924;
    Class341 aClass341_4925;
    static int anInt4926;
    static int anInt4927;
    int anInt4928;
    int anInt4929;
    static int anInt4930 = 0;

    public static void method1109(byte i) {
        aClass323_4921 = null;
        if (i != -22)
            method1111(127, -73, -7, -77, -85, 79);
        aClass356_4915 = null;
    }

    public final Class223 method51(byte i) {
        if (i <= 116)
            return null;
        anInt4927++;
        return Class101_Sub1.aClass223_5689;
    }

    static final boolean method1110(int i, int i_0_, int i_1_, byte i_2_,
                                    int i_3_) {
        anInt4916++;
        if (!Class348_Sub40_Sub23.aBoolean9307 || !Class23.aBoolean351)
            return false;
        if (Class225.anInt2946 < 100)
            return false;
        if (!aa_Sub2.method164(i_1_, i_3_, (byte) -97, i))
            return false;
        int i_4_ = i_3_ << Class362.anInt4459;
        int i_5_ = i << Class362.anInt4459;
        if (i_2_ != -79)
            anInt4919 = 64;
        if (Class121.method1084(i_0_, Class270.anInt3465, i_5_, i_4_,
                aa_Sub1.aSArray5191[i_1_]
                        .method3982((byte) -86, i, i_3_),
                Class270.anInt3465, 18507)) {
            Class348_Sub40_Sub4.anInt9112++;
            return true;
        }
        return false;
    }

    static final void method1111(int i, int i_6_, int i_7_, int i_8_, int i_9_,
                                 int i_10_) {
        for (int i_11_ = i_9_; i >= i_11_; i_11_++)
            Class135_Sub2.method1156(-27, i_7_,
                    Class17.anIntArrayArray255[i_11_], i_8_,
                    i_10_);
        if (i_6_ != 0)
            anInt4930 = 29;
        anInt4926++;
    }

    Class125(int i, Class221 class221, Class341 class341, int i_12_, int i_13_,
             int i_14_, int i_15_, int i_16_, int i_17_, int i_18_,
             boolean bool) {
        try {
            this.aBoolean4914 = bool;
            this.anInt4923 = i_15_;
            this.anInt4918 = i;
            this.anInt4924 = i_12_;
            this.anInt4913 = i_16_;
            this.anInt4929 = i_14_;
            this.anInt4920 = i_13_;
            this.anInt4917 = i_18_;
            this.aClass341_4925 = class341;
            this.anInt4928 = i_17_;
            this.aClass221_4922 = class221;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("nha.<init>(" + i + ','
                            + (class221 != null ? "{...}"
                            : "null")
                            + ','
                            + (class341 != null ? "{...}"
                            : "null")
                            + ',' + i_12_ + ',' + i_13_ + ','
                            + i_14_ + ',' + i_15_ + ','
                            + i_16_ + ',' + i_17_ + ','
                            + i_18_ + ',' + bool + ')'));
        }
    }

    static {
        aClass356_4915 = new Class356(8);
    }
}
