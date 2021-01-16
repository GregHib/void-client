/* Class356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class356 {
    Class348[] aClass348Array4374;
    static int anInt4375;
    static int anInt4376;
    int anInt4377;
    static int anInt4378;
    static int anInt4379;
    static int anInt4380;
    static int anInt4381;
    static int anInt4382;
    public static int anInt4383;
    static int anInt4384;
    private long aLong4385;
    static int anInt4386;
    static int anInt4387;
    static Class114 aClass114_4388 = new Class114(3, 3);
    private Class348 aClass348_4389;
    private Class348 aClass348_4390;
    private int anInt4391 = 0;

    final int method3474(int i) {
        if (i != 1) method3479(20);
        anInt4387++;
        int i_0_ = 0;
        for (int i_1_ = 0; this.anInt4377 > i_1_; i_1_++) {
            Class348 class348 = this.aClass348Array4374[i_1_];
            for (Class348 class348_2_ = class348.aClass348_4294; class348 != class348_2_; class348_2_ = class348_2_.aClass348_4294)
                i_0_++;
        }
        return i_0_;
    }

    final int method3475(boolean bool) {
        anInt4376++;
        if (bool != true) method3478(false);
        return this.anInt4377;
    }

    final Class348 method3476(boolean bool) {
        anInt4384++;
        if (aClass348_4389 == null) return null;
        Class348 class348 = (this.aClass348Array4374[(int) ((long) (this.anInt4377 - 1) & aLong4385)]);
        if (bool != true) method3479(4);
        for (/**/; aClass348_4389 != class348; aClass348_4389 = aClass348_4389.aClass348_4294) {
            if (aClass348_4389.aLong4291 == aLong4385) {
                Class348 class348_3_ = aClass348_4389;
                aClass348_4389 = aClass348_4389.aClass348_4294;
                return class348_3_;
            }
        }
        aClass348_4389 = null;
        return null;
    }

    final int method3477(int i, Class348[] class348s) {
        if (i != 3) anInt4383 = -76;
        anInt4380++;
        int i_4_ = 0;
        for (int i_5_ = 0; this.anInt4377 > i_5_; i_5_++) {
            Class348 class348 = this.aClass348Array4374[i_5_];
            for (Class348 class348_6_ = class348.aClass348_4294; class348 != class348_6_; class348_6_ = class348_6_.aClass348_4294)
                class348s[i_4_++] = class348_6_;
        }
        return i_4_;
    }

    public static void method3478(boolean bool) {
        aClass114_4388 = null;
        if (bool != false) anInt4383 = 67;
    }

    static final Class348_Sub21 method3479(int i) {
        anInt4378++;
        if (i != -1) anInt4383 = 43;
        if (Class75.aClass262_1254 == null || r.aClass312_9716 == null) return null;
        for (Class348_Sub21 class348_sub21 = (Class348_Sub21) r.aClass312_9716.method2329(10); class348_sub21 != null; class348_sub21 = (Class348_Sub21) r.aClass312_9716.method2329(i ^ ~0xa)) {
            Class42 class42 = Class75.aClass153_1238.method1225(class348_sub21.anInt6847, (byte) 92);
            if (class42 != null && class42.aBoolean609 && class42.method373(Class75.anInterface17_1244, 127)) return class348_sub21;
        }
        return null;
    }

    final Class348 method3480(long l, int i) {
        try {
            aLong4385 = l;
            anInt4379++;
            Class348 class348 = (this.aClass348Array4374[(int) (l & (long) (this.anInt4377 + -1))]);
            if (i != -6008) method3484(80);
            for (aClass348_4389 = class348.aClass348_4294; aClass348_4389 != class348; aClass348_4389 = aClass348_4389.aClass348_4294) {
                if (l == aClass348_4389.aLong4291) {
                    Class348 class348_7_ = aClass348_4389;
                    aClass348_4389 = aClass348_4389.aClass348_4294;
                    return class348_7_;
                }
            }
            aClass348_4389 = null;
            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "eq.C(" + l + ',' + i + ')');
        }
    }

    final void method3481(int i) {
        anInt4375++;
        for (int i_8_ = i; this.anInt4377 > i_8_; i_8_++) {
            Class348 class348 = this.aClass348Array4374[i_8_];
            for (; ; ) {
                Class348 class348_9_ = class348.aClass348_4294;
                if (class348_9_ == class348) break;
                class348_9_.method2715((byte) 54);
            }
        }
        aClass348_4389 = null;
        aClass348_4390 = null;
    }

    final Class348 method3482(int i) {
        anInt4381++;
        if (anInt4391 > i && (aClass348_4390 != this.aClass348Array4374[-1 + anInt4391])) {
            Class348 class348 = aClass348_4390;
            aClass348_4390 = class348.aClass348_4294;
            return class348;
        }
        while (this.anInt4377 > anInt4391) {
            Class348 class348 = (this.aClass348Array4374[anInt4391++].aClass348_4294);
            if (this.aClass348Array4374[-1 + anInt4391] != class348) {
                aClass348_4390 = class348.aClass348_4294;
                return class348;
            }
        }
        return null;
    }

    final void method3483(byte i, long l, Class348 class348) {
        try {
            anInt4382++;
            if (i < 18) method3481(71);
            if (class348.aClass348_4295 != null) class348.method2715((byte) 57);
            Class348 class348_10_ = (this.aClass348Array4374[(int) (l & (long) (-1 + this.anInt4377))]);
            class348.aClass348_4294 = class348_10_;
            class348.aClass348_4295 = class348_10_.aClass348_4295;
            class348.aClass348_4295.aClass348_4294 = class348;
            class348.aClass348_4294.aClass348_4295 = class348;
            class348.aLong4291 = l;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("eq.K(" + i + ',' + l + ',' + (class348 != null ? "{...}" : "null") + ')'));
        }
    }

    final Class348 method3484(int i) {
        anInt4391 = i;
        anInt4386++;
        return method3482(0);
    }

    Class356(int i) {
        this.anInt4377 = i;
        this.aClass348Array4374 = new Class348[i];
        for (int i_11_ = 0; i > i_11_; i_11_++) {
            Class348 class348 = this.aClass348Array4374[i_11_] = new Class348();
            class348.aClass348_4294 = class348;
            class348.aClass348_4295 = class348;
        }
    }
}
