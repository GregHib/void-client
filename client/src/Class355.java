/* Class355 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class355 {
    private final Class60 aClass60_4362;
    static int anInt4363;
    int anInt4364;
    int anInt4365 = 0;
    static Object anObject4366;
    static long aLong4367 = -1L;
    private Class45 aClass45_4368;
    private final Class45 aClass45_4369;
    static int anInt4370;
    static int anInt4371;
    static int anInt4372;
    private Interface15 anInterface15_4373;

    static final void method3470(int i) {
        if (i == 1) {
            anInt4371++;
            if (!Class50_Sub1.aBoolean5224) {
                Class50_Sub1.aBoolean5224 = true;
                Class369_Sub3_Sub1.aBoolean10174 = true;
                Class348_Sub27.aFloat6898
                        += (-12.0F - Class348_Sub27.aFloat6898) / 2.0F;
            }
        }
    }

    final Class348_Sub42_Sub10 method3471(int i, byte i_0_) {
        anInt4363++;
        Class348_Sub42_Sub10 class348_sub42_sub10
                = (Class348_Sub42_Sub10) aClass60_4362.method583(i, 70);
        if (class348_sub42_sub10 != null)
            return class348_sub42_sub10;
        byte[] is;
        if ((i ^ 0xffffffff) <= -32769)
            is = aClass45_4369.method410(-1860, 1, 0x7fff & i);
        else
            is = aClass45_4368.method410(-1860, 1, i);
        class348_sub42_sub10 = new Class348_Sub42_Sub10();
        class348_sub42_sub10.aClass355_9567 = this;
        if (is != null)
            class348_sub42_sub10.method3218(new Class348_Sub49(is), 0);
        if (i_0_ >= -86)
            method3473(-12);
        if ((i ^ 0xffffffff) <= -32769)
            class348_sub42_sub10.method3209(false);
        aClass60_4362.method582(class348_sub42_sub10, i, (byte) -125);
        return class348_sub42_sub10;
    }

    final String method3472(long l, int[] is, int i, Class138 class138) {
        try {
            if (i != -1)
                aClass45_4368 = null;
            anInt4370++;
            if (anInterface15_4373 != null) {
                String string
                        = anInterface15_4373.method54(1, l, class138, is);
                if (string != null)
                    return string;
            }
            return Long.toString(l);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("aha.D(" + l + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i + ','
                            + (class138 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public static void method3473(int i) {
        if (i != 12949)
            anInt4372 = -30;
        anObject4366 = null;
    }

    Class355(int i, Class45 class45, Class45 class45_1_,
             Interface15 interface15) {
        this.anInt4364 = 0;
        aClass60_4362 = new Class60(64);
        anInterface15_4373 = null;
        do {
            try {
                anInterface15_4373 = interface15;
                aClass45_4368 = class45;
                aClass45_4369 = class45_1_;
                if (aClass45_4368 != null)
                    this.anInt4365
                            = aClass45_4368.method407(0, 1);
                if (aClass45_4369 == null)
                    break;
                this.anInt4364 = aClass45_4369.method407(0, 1);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929
                        (runtimeexception,
                                ("aha.<init>(" + i + ','
                                        + (class45 != null ? "{...}" : "null") + ','
                                        + (class45_1_ != null ? "{...}" : "null") + ','
                                        + (interface15 != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
