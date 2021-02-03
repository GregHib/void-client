/* Class318_Sub1_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class318_Sub1_Sub1_Sub1 extends Class318_Sub1_Sub1 implements Interface10 {
    static int anInt9943;
    static int anInt9944;
    private boolean aBoolean9945 = false;
    static int anInt9946;
    static int anInt9947;
    static int anInt9948;
    static int[] anIntArray9949 = new int[1];
    private Class30 aClass30_9950;
    static int anInt9951;
    static int anInt9952;
    static int anInt9953;
    static int anInt9954;
    Class235 aClass235_9955;
    static int anInt9956;
    static int anInt9957;
    static int anInt9958;
    static Class105[] aClass105Array9959;
    static int anInt9960;
    static int anInt9961;
    static int anInt9962;
    static int anInt9963;
    static int anInt9964;
    static int anInt9965;
    private boolean aBoolean9966;
    static int anInt9967;
    static int anInt9968;

    public final int method42(int i) {
        anInt9943++;
        if (i > -62) aClass30_9950 = null;
        return (this.aClass235_9955.anInt3063);
    }

    final void method2387(ha var_ha, int i) {
        if (i > -125) method2399(null, -65);
        anInt9962++;
        Class64 class64 = this.aClass235_9955.method1668(true, true, -128, 262144, var_ha);
        if (class64 != null) {
            int i_0_ = this.anInt6377 >> 9;
            int i_1_ = this.anInt6388 >> 9;
            Class101 class101 = var_ha.method3705();
            class101.method894(this.anInt6377, this.anInt6382, this.anInt6388);
            this.aClass235_9955.method1670(i_0_, class101, i_1_, var_ha, i_0_, class64, false, (byte) -73, i_1_);
        }
    }

    final int method2394(boolean bool) {
        if (bool != true) return -82;
        anInt9963++;
        return this.aClass235_9955.method1663(109);
    }

    public final void method40(int i) {
        if (i != -12031) method2399(null, -125);
        anInt9954++;
    }

    public final int method41(int i) {
        anInt9957++;
        if (i != -32228) return -36;
        return (this.aClass235_9955.anInt3052);
    }

    static final boolean method2397(byte i) {
        Class135_Sub1.anInt4718++;
        Class239_Sub29.aBoolean6147 = true;
        if (i > -123) anIntArray9949 = null;
        anInt9967++;
        return true;
    }

    public static void method2398(byte i) {
        if (i != -83) anIntArray9949 = null;
        aClass105Array9959 = null;
        anIntArray9949 = null;
    }

    final Class318_Sub4 method2386(int i, ha var_ha) {
        anInt9968++;
        Class64 class64 = this.aClass235_9955.method1668(false, true, -128, 2048, var_ha);
        if (class64 == null) return null;
        Class101 class101 = var_ha.method3705();
        class101.method894(this.anInt6377, this.anInt6382, this.anInt6388);
        Class318_Sub4 class318_sub4 = OutputStream_Sub2.method136(i, aBoolean9966, false);
        int i_2_ = this.anInt6377 >> 9;
        int i_3_ = this.anInt6388 >> 9;
        this.aClass235_9955.method1670(i_2_, class101, i_3_, var_ha, i_2_, class64, true, (byte) -73, i_3_);
        if (!Class305.aBoolean3870) class64.method615(class101, (class318_sub4.aClass318_Sub3Array6414[0]), 0);
        else class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[0]), Class132.anInt1906, 0);
        if ((this.aClass235_9955.aClass318_Sub10_3081) != null) {
            Class98 class98 = this.aClass235_9955.aClass318_Sub10_3081.method2525();
            if (Class305.aBoolean3870) var_ha.method3685(class98, Class132.anInt1906);
            else var_ha.method3684(class98);
        }
        aBoolean9945 = (class64.F() || (this.aClass235_9955.aClass318_Sub10_3081) != null);
        if (aClass30_9950 != null) Class255.method1935(this.anInt6388, this.anInt6382, aClass30_9950, class64, false, this.anInt6377);
        else aClass30_9950 = (Class348_Sub23_Sub1.method2967(this.anInt6377, class64, this.anInt6388, this.anInt6382, 2));
        return class318_sub4;
    }

    final void method2380(ha var_ha, int i, boolean bool, Class318_Sub1 class318_sub1, int i_4_, byte i_5_, int i_6_) {
        try {
            anInt9946++;
            if (i_5_ > -106) this.aClass235_9955 = null;
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("saa.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
        }
    }

    Class318_Sub1_Sub1_Sub1(ha var_ha, Class51 class51, int i, int i_7_, int i_8_, int i_9_, int i_10_, boolean bool, int i_11_, int i_12_) {
        super(i_8_, i_9_, i_10_, i, i_7_, class51.anInt930);
        try {
            this.aClass235_9955 = new Class235(var_ha, class51, 22, i_11_, i, i_7_, this, bool, i_12_);
            aBoolean9966 = class51.anInt874 != 0 && !bool;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("saa.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class51 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + bool + ',' + i_11_ + ',' + i_12_ + ')'));
        }
    }

    final boolean method2377(byte i) {
        anInt9964++;
        if (i != 122) this.aClass235_9955 = null;
        return aBoolean9945;
    }

    final int method2379(int i) {
        if (i != -25675) aClass105Array9959 = null;
        anInt9965++;
        return this.aClass235_9955.method1664(i ^ 0x647d);
    }

    final void method2392(boolean bool) {
        if (bool != true) this.aClass235_9955 = null;
        anInt9953++;
        throw new IllegalStateException();
    }

    final boolean method2391(ha var_ha, int i, int i_13_, int i_14_) {
        anInt9952++;
        Class64 class64 = this.aClass235_9955.method1668(false, false, -128, 131072, var_ha);
        if (class64 == null) return false;
        Class101 class101 = var_ha.method3705();
        if (i_14_ != 0) return true;
        class101.method894(this.anInt6377, this.anInt6382, this.anInt6388);
        if (Class305.aBoolean3870) return class64.method623(i_13_, i, class101, false, 0, Class132.anInt1906);
        return class64.method628(i_13_, i, class101, false, 0);
    }

    static final void method2399(String string, int i) {
        int i_15_ = 87 / ((i - -7) / 56);
        anInt9958++;
        if (!string.equals("")) {
            Class88.anInt1498++;
            Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class318_Sub1_Sub1.aClass351_8724, Class348_Sub23_Sub2.aClass77_9029, -124);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, Class239_Sub6.method1745(string, -65));
            class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
            Class348_Sub42_Sub14.method3243(121, class348_sub47);
        }
    }

    final Class30 method2381(ha var_ha, int i) {
        if (i != 7) return null;
        anInt9960++;
        return aClass30_9950;
    }

    final boolean method2388(int i) {
        anInt9944++;
        return i >= -65;
    }

    public final boolean method38(int i) {
        anInt9948++;
        if (i != -18443) method2381(null, -3);
        return this.aClass235_9955.method1665(2);
    }

    public final void method43(ha var_ha, int i) {
        if (i == -14218) {
            this.aClass235_9955.method1674(-1, var_ha);
            anInt9951++;
        }
    }

    final boolean method2376(int i) {
        anInt9956++;
        if (i >= -12) aClass30_9950 = null;
        return false;
    }

    public final int method39(int i) {
        int i_16_ = 7 / ((-91 - i) / 35);
        anInt9947++;
        return (this.aClass235_9955.anInt3079);
    }

    public final void method44(int i, ha var_ha) {
        if (i != 836) aBoolean9966 = true;
        this.aClass235_9955.method1667((byte) 116, var_ha);
        anInt9961++;
    }
}
