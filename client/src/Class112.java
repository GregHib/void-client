/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class112 implements Runnable {
    static int anInt1726;
    static Class207 aClass207_1727;
    static int anInt1728;
    static int anInt1729;
    private final Class107 aClass107_1730 = new Class107();
    static int anInt1731;
    static int anInt1732;
    private Thread aThread1733;
    int anInt1734;
    static int anInt1735;
    static int anInt1736;
    static int anInt1737;
    private boolean aBoolean1738 = false;

    final Class348_Sub42_Sub16_Sub2 method1049(byte[] is, Class137 class137,
                                               byte i, int i_0_) {
        try {
            if (i != 10)
                aBoolean1738 = false;
            anInt1732++;
            Class348_Sub42_Sub16_Sub2 class348_sub42_sub16_sub2
                    = new Class348_Sub42_Sub16_Sub2();
            class348_sub42_sub16_sub2
                    .aByteArray10461
                    = is;
            class348_sub42_sub16_sub2.aBoolean9663
                    = false;
            class348_sub42_sub16_sub2
                    .aClass137_10458
                    = class137;
            class348_sub42_sub16_sub2.aLong7057
                    = i_0_;
            class348_sub42_sub16_sub2.anInt10457
                    = 2;
            method1050(class348_sub42_sub16_sub2, i + -123);
            return class348_sub42_sub16_sub2;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("aca.G("
                            + (is != null ? "{...}" : "null")
                            + ','
                            + (class137 != null ? "{...}"
                            : "null")
                            + ',' + i + ',' + i_0_ + ')'));
        }
    }

    private final void method1050
            (Class348_Sub42_Sub16_Sub2 class348_sub42_sub16_sub2, int i) {
        anInt1735++;
        synchronized (aClass107_1730) {
            aClass107_1730.method1005(true, class348_sub42_sub16_sub2);
            this.anInt1734++;
            if (i > -100)
                aClass207_1727 = null;
            aClass107_1730.notifyAll();
        }
    }

    final void method1051(boolean bool) {
        aBoolean1738 = bool;
        anInt1731++;
        synchronized (aClass107_1730) {
            aClass107_1730.notifyAll();
        }
        try {
            aThread1733.join();
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        aThread1733 = null;
    }

    public static void method1052(byte i) {
        aClass207_1727 = null;
        int i_1_ = 107 % ((i - -20) / 50);
    }

    static final int method1053(int i) {
        anInt1728++;
        if (i != 3112)
            method1052((byte) 121);
        if (Class289.aClass46_3701 == null) {
            if (!Class5_Sub1.aBoolean8335
                    && Class316.aClass348_Sub42_Sub12_3963 != null)
                return (Class316.aClass348_Sub42_Sub12_3963
                        .anInt9609);
            int i_2_ = Class258_Sub4.aClass373_8552.method3597(true);
            int i_3_ = Class258_Sub4.aClass373_8552.method3594((byte) 81);
            if (Class348_Sub42_Sub6.aBoolean9535) {
                if (i_2_ > Class135_Sub1.anInt4717 && i_2_ < Class63.anInt1117 + Class135_Sub1.anInt4717) {
                    int i_9_ = -1;
                    for (int i_10_ = 0; Class8.anInt166 > i_10_; i_10_++) {
                        if (Class71.aBoolean1211) {
                            int i_11_ = (Class348_Sub42_Sub5.anInt9532 - -33
                                    - -(i_10_ * 16));
                            if (i_3_ > -13 + i_11_
                                    && i_3_ <= i_11_ + 3)
                                i_9_ = i_10_;
                        } else {
                            int i_12_ = (i_10_ * 16 + 31
                                    + Class348_Sub42_Sub5.anInt9532);
                            if (i_3_ > -13 + i_12_
                                    && i_3_ <= i_12_ + 3)
                                i_9_ = i_10_;
                        }
                    }
                    if (i_9_ != -1) {
                        int i_13_ = 0;
                        Class156 class156
                                = new Class156(Class233.aClass107_3022);
                        for (Class348_Sub42_Sub13 class348_sub42_sub13
                             = ((Class348_Sub42_Sub13)
                                class156.method1240(110));
                             class348_sub42_sub13 != null;
                             class348_sub42_sub13
                                     = ((Class348_Sub42_Sub13)
                                     class156.method1243((byte) 77))) {
                            if (i_9_ == i_13_++)
                                return ((Class348_Sub42_Sub12)
                                        class348_sub42_sub13
                                                .aClass107_9621
                                                .aClass348_Sub42_1647
                                                .aClass348_Sub42_7063).anInt9609;
                        }
                    }
                } else if (Class242.aClass348_Sub42_Sub13_3152 != null
                        && Class50_Sub3.anInt5252 < i_2_
                        && (Class348_Sub1_Sub1.anInt8806
                        + Class50_Sub3.anInt5252) > i_2_) {
                    int i_4_ = -1;
                    for (int i_5_ = 0;
                         ((Class242.aClass348_Sub42_Sub13_3152
                                 .anInt9615) > i_5_);
                         i_5_++) {
                        if (Class71.aBoolean1211) {
                            int i_7_
                                    = Class373.anInt4534 + (33 + 16 * i_5_);
                            if (-13 + i_7_ < i_3_
                                    && 3 + i_7_ >= i_3_)
                                i_4_ = i_5_;
                        } else {
                            int i_6_ = i_5_ * 16 + 31 + Class373.anInt4534;
                            if (-13 + i_6_ < i_3_
                                    && i_6_ - -3 >= i_3_)
                                i_4_ = i_5_;
                        }
                    }
                    if (i_4_ != -1) {
                        int i_8_ = 0;
                        Class156 class156
                                = new Class156(Class242
                                .aClass348_Sub42_Sub13_3152
                                .aClass107_9621);
                        for (Class348_Sub42_Sub12 class348_sub42_sub12
                             = ((Class348_Sub42_Sub12)
                                class156.method1240(9));
                             class348_sub42_sub12 != null;
                             class348_sub42_sub12
                                     = ((Class348_Sub42_Sub12)
                                     class156.method1243((byte) 90))) {
                            if (i_8_++ == i_4_)
                                return (class348_sub42_sub12
                                        .anInt9609);
                        }
                    }
                }
            } else if (i_2_ > Class135_Sub1.anInt4717
                    && (i_2_
                    < Class135_Sub1.anInt4717 - -Class63.anInt1117)) {
                int i_14_ = -1;
                for (int i_15_ = 0; Class73.anInt4776 > i_15_; i_15_++) {
                    if (Class71.aBoolean1211) {
                        int i_17_ = ((-i_15_ + (-1 + Class73.anInt4776)) * 16
                                + Class348_Sub42_Sub5.anInt9532 + 33);
                        if (i_3_ > i_17_ - 13
                                && i_17_ + 3 >= i_3_)
                            i_14_ = i_15_;
                    } else {
                        int i_16_
                                = 31 + (Class348_Sub42_Sub5.anInt9532
                                + (-i_15_ + (Class73.anInt4776 - 1)) * 16);
                        if (-13 + i_16_ < i_3_
                                && i_16_ + 3 >= i_3_)
                            i_14_ = i_15_;
                    }
                }
                if (i_14_ != -1) {
                    int i_18_ = 0;
                    Class312 class312
                            = new Class312(Class348_Sub40_Sub4.aClass262_9111);
                    for (Class348_Sub42_Sub12 class348_sub42_sub12
                         = ((Class348_Sub42_Sub12)
                            class312.method2327((byte) -53));
                         class348_sub42_sub12 != null;
                         class348_sub42_sub12
                                 = ((Class348_Sub42_Sub12)
                                 class312.method2329(i + -3102))) {
                        if (i_14_ == i_18_++)
                            return (class348_sub42_sub12
                                    .anInt9609);
                    }
                }
            }
        }
        return -1;
    }

    final Class348_Sub42_Sub16_Sub2 method1054(Class137 class137, int i,
                                               byte i_19_) {
        anInt1729++;
        Class348_Sub42_Sub16_Sub2 class348_sub42_sub16_sub2
                = new Class348_Sub42_Sub16_Sub2();
        if (i_19_ != -112)
            return null;
        class348_sub42_sub16_sub2.aBoolean9663
                = false;
        class348_sub42_sub16_sub2.anInt10457 = 3;
        class348_sub42_sub16_sub2.aLong7057 = i;
        class348_sub42_sub16_sub2.aClass137_10458
                = class137;
        method1050(class348_sub42_sub16_sub2, -101);
        return class348_sub42_sub16_sub2;
    }

    public final void run() {
        while (!aBoolean1738) {
            Class348_Sub42_Sub16_Sub2 class348_sub42_sub16_sub2;
            synchronized (aClass107_1730) {
                class348_sub42_sub16_sub2 = ((Class348_Sub42_Sub16_Sub2)
                        aClass107_1730.method1008(20));
                if (class348_sub42_sub16_sub2 == null) {
                    try {
                        aClass107_1730.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                    continue;
                } else this.anInt1734--;
            }
            try {
                if ((class348_sub42_sub16_sub2
                        .anInt10457) != 2) {
                    if (class348_sub42_sub16_sub2.anInt10457 == 3)
                        class348_sub42_sub16_sub2
                                .aByteArray10461
                                = (class348_sub42_sub16_sub2
                                .aClass137_10458.method1161
                                        ((byte) -4,
                                                (int) class348_sub42_sub16_sub2.aLong7057));
                } else
                    class348_sub42_sub16_sub2
                            .aClass137_10458.method1160
                            (class348_sub42_sub16_sub2.aByteArray10461.length,
                                    (int) (class348_sub42_sub16_sub2
                                            .aLong7057),
                                    class348_sub42_sub16_sub2.aByteArray10461,
                                    -7305);
            } catch (Exception exception) {
                Class156.method1242(null, exception, 15004);
            }
            class348_sub42_sub16_sub2.aBoolean9664
                    = false;
        }
        anInt1736++;
    }

    final Class348_Sub42_Sub16_Sub2 method1055(Class137 class137, int i,
                                               byte i_20_) {
        if (i_20_ >= -98)
            method1052((byte) 110);
        anInt1737++;
        Class348_Sub42_Sub16_Sub2 class348_sub42_sub16_sub2
                = new Class348_Sub42_Sub16_Sub2();
        class348_sub42_sub16_sub2.anInt10457 = 1;
        synchronized (aClass107_1730) {
            for (Class348_Sub42_Sub16_Sub2 class348_sub42_sub16_sub2_21_
                 = ((Class348_Sub42_Sub16_Sub2)
                    aClass107_1730.method1011(-95));
                 class348_sub42_sub16_sub2_21_ != null;
                 class348_sub42_sub16_sub2_21_
                         = ((Class348_Sub42_Sub16_Sub2)
                         aClass107_1730.method1003((byte) 73))) {
                if ((class348_sub42_sub16_sub2_21_.aLong7057
                        == (long) i)
                        && (class348_sub42_sub16_sub2_21_.aClass137_10458
                        == class137)
                        && class348_sub42_sub16_sub2_21_.anInt10457 == 2) {
                    class348_sub42_sub16_sub2
                            .aByteArray10461
                            = class348_sub42_sub16_sub2_21_.aByteArray10461;
                    class348_sub42_sub16_sub2
                            .aBoolean9664
                            = false;
                    return class348_sub42_sub16_sub2;
                }
            }
        }
        class348_sub42_sub16_sub2.aByteArray10461
                = class137.method1161((byte) -4, i);
        class348_sub42_sub16_sub2.aBoolean9663 = true;
        class348_sub42_sub16_sub2.aBoolean9664
                = false;
        return class348_sub42_sub16_sub2;
    }

    Class112(Class297 class297) {
        this.anInt1734 = 0;
        Class144 class144 = class297.method2236(this, -10240, 5);
        while (class144.anInt1997 == 0)
            Class286_Sub5.method2161((byte) 43, 10L);
        if (class144.anInt1997 == 2)
            throw new RuntimeException();
        aThread1733 = (Thread) class144.anObject1998;
    }
}
