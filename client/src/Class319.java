/* Class319 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class319 {
    static int anInt3978;
    private final Class45 aClass45_3979;
    static double aDouble3980;
    Class45 aClass45_3981;
    static Class315[] aClass315Array3982;
    static int anInt3983;
    static int anInt3984;
    static Object anObject3985;
    static int anInt3986;
    static int anInt3987;
    static boolean aBoolean3988 = false;
    private final Class60 aClass60_3989 = new Class60(64);
    Class60 aClass60_3990 = new Class60(60);
    int anInt3991;

    final void method2541(int i, int i_0_) {
        anInt3978++;
        this.anInt3991 = i_0_;
        synchronized (this.aClass60_3990) {
            this.aClass60_3990.method590(0);
        }
        if (i < 72)
            aClass315Array3982 = null;
    }

    final void method2542(int i) {
        synchronized (aClass60_3989) {
            aClass60_3989.method587(-126);
        }
        if (i >= -99)
            aDouble3980 = 0.5896741197263589;
        anInt3986++;
        synchronized (this.aClass60_3990) {
            this.aClass60_3990.method587(-106);
        }
    }

    final Class368 method2543(byte i, int i_1_) {
        if (i <= 38)
            method2542(-73);
        anInt3983++;
        Class368 class368;
        synchronized (aClass60_3989) {
            class368 = (Class368) aClass60_3989.method583(i_1_, 101);
        }
        if (class368 != null)
            return class368;
        byte[] is;
        synchronized (aClass45_3979) {
            is = aClass45_3979.method410(-1860,
                    Class318_Sub1_Sub3_Sub1
                            .method2419((byte) 127, i_1_),
                    Class348_Sub1_Sub2.method2729(i_1_,
                            16));
        }
        class368 = new Class368();
        class368.aClass319_4513 = this;
        class368.anInt4501 = i_1_;
        if (is != null)
            class368.method3559(28105, new Class348_Sub49(is));
        synchronized (aClass60_3989) {
            aClass60_3989.method582(class368, i_1_, (byte) -127);
        }
        return class368;
    }

    final void method2544(int i, byte i_2_) {
        synchronized (aClass60_3989) {
            aClass60_3989.method578(2, i);
            if (i_2_ >= -11)
                this.aClass45_3981 = null;
        }
        anInt3987++;
        synchronized (this.aClass60_3990) {
            this.aClass60_3990.method578(2, i);
        }
    }

    public static void method2545(boolean bool) {
        if (bool == true) {
            aClass315Array3982 = null;
            anObject3985 = null;
        }
    }

    final void method2546(int i) {
        anInt3984++;
        synchronized (aClass60_3989) {
            aClass60_3989.method590(i ^ i);
        }
        synchronized (this.aClass60_3990) {
            this.aClass60_3990.method590(0);
        }
    }

    Class319(Class230 class230, int i, Class45 class45, Class45 class45_3_) {
        try {
            this.aClass45_3981 = class45_3_;
            aClass45_3979 = class45;
            int i_4_ = -1 + aClass45_3979.method414(-1);
            aClass45_3979.method407(0, i_4_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("cn.<init>(" + (class230 != null ? "{...}" : "null")
                                    + ',' + i + ',' + (class45 != null ? "{...}" : "null")
                                    + ',' + (class45_3_ != null ? "{...}" : "null")
                                    + ')'));
        }
    }
}
