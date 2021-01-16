/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class153 {
    static int anInt2079;
    static int anInt2080;
    static int anInt2081;
    static int anInt2082;
    private Class60 aClass60_2083 = new Class60(128);
    private final Class45 aClass45_2084;
    static int anInt2085;
    static int anInt2086;
    Class45 aClass45_2087;
    static int anInt2088;
    Class60 aClass60_2089 = new Class60(64);

    final void method1219(int i) {
        anInt2080++;
        synchronized (aClass60_2083) {
            aClass60_2083.method590(0);
        }
        synchronized (this.aClass60_2089) {
            if (i != 7851) {
                /* empty */
            } else
                this.aClass60_2089.method590(i + -7851);
        }
    }

    final void method1220(byte i, int i_0_, int i_1_) {
        anInt2081++;
        aClass60_2083 = new Class60(i_1_);
        this.aClass60_2089 = new Class60(i_0_);
        int i_2_ = 11 / ((i - -46) / 43);
    }

    static final boolean method1221(int i, int i_3_, int i_4_) {
        if (i != -3157)
            return false;
        anInt2088++;
        return Class299_Sub1.method2259(0, i_4_, i_3_)
                | (i_3_ & 0x70000) != 0
                || Class288.method2187(i_3_, -79, i_4_);
    }

    final void method1222(boolean bool) {
        if (bool != true)
            method1222(false);
        synchronized (aClass60_2083) {
            aClass60_2083.method587(-99);
        }
        anInt2082++;
        synchronized (this.aClass60_2089) {
            this.aClass60_2089.method587(-78);
        }
    }

    static final Class348_Sub42_Sub19 method1223(int i, int i_5_, int i_6_,
                                                 Class273 class273) {
        anInt2086++;
        int i_7_ = class273.anInt5167 | i << 660374826;
        Class348_Sub42_Sub19 class348_sub42_sub19
                = ((Class348_Sub42_Sub19)
                Class322.aClass308_4036.method2302((long) i_7_ << 1795487952,
                        (byte) -91));
        if (class348_sub42_sub19 != null)
            return class348_sub42_sub19;
        byte[] is = (Class113.aClass45_1743.method415
                ((byte) 73,
                        Class113.aClass45_1743.method423(i_7_, (byte) -90)));
        if (is != null) {
            if (is.length <= 1)
                return null;
            try {
                class348_sub42_sub19 = Class318_Sub4.method2502(is, -85);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: "
                        + i_7_);
            }
            class348_sub42_sub19.aClass273_9691
                    = class273;
            Class322.aClass308_4036.method2305((long) i_7_ << -1557989360,
                    class348_sub42_sub19, -1);
            return class348_sub42_sub19;
        }
        i_7_ = class273.anInt5167 | 65536 + i_5_ << 2087345450;
        class348_sub42_sub19
                = ((Class348_Sub42_Sub19)
                Class322.aClass308_4036.method2302((long) i_7_ << -1741106544,
                        (byte) -31));
        if (class348_sub42_sub19 != null)
            return class348_sub42_sub19;
        is = (Class113.aClass45_1743.method415
                ((byte) 73,
                        Class113.aClass45_1743.method423(i_7_, (byte) -107)));
        if (is != null) {
            if (is.length <= 1)
                return null;
            try {
                class348_sub42_sub19 = Class318_Sub4.method2502(is, -101);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: "
                        + i_7_);
            }
            class348_sub42_sub19.aClass273_9691
                    = class273;
            Class322.aClass308_4036.method2305((long) i_7_ << -1141322992,
                    class348_sub42_sub19, -1);
            return class348_sub42_sub19;
        }
        i_7_ = class273.anInt5167 | 0x3fffc00;
        class348_sub42_sub19
                = ((Class348_Sub42_Sub19)
                Class322.aClass308_4036.method2302((long) i_7_ << 96837648,
                        (byte) -107));
        if (class348_sub42_sub19 != null)
            return class348_sub42_sub19;
        is = (Class113.aClass45_1743.method415
                ((byte) 73, Class113.aClass45_1743.method423(i_7_, (byte) 104)));
        if (is != null) {
            if (is.length <= 1)
                return null;
            try {
                class348_sub42_sub19 = Class318_Sub4.method2502(is, -110);
            } catch (Exception exception) {
                throw new RuntimeException(exception.getMessage() + " S: "
                        + i_7_);
            }
            class348_sub42_sub19.aClass273_9691
                    = class273;
            Class322.aClass308_4036.method2305((long) i_7_ << 1563421904,
                    class348_sub42_sub19, -1);
            return class348_sub42_sub19;
        }
        if (i_6_ != 96837648)
            return null;
        return null;
    }

    final void method1224(int i, byte i_8_) {
        synchronized (aClass60_2083) {
            if (i_8_ > -95)
                method1225(-75, (byte) -61);
            aClass60_2083.method578(2, i);
        }
        anInt2079++;
        synchronized (this.aClass60_2089) {
            this.aClass60_2089.method578(2, i);
        }
    }

    final Class42 method1225(int i, byte i_9_) {
        anInt2085++;
        Class42 class42;
        synchronized (aClass60_2083) {
            class42 = (Class42) aClass60_2083.method583(i, 91);
        }
        if (class42 != null)
            return class42;
        if (i_9_ < 36)
            return null;
        byte[] is;
        synchronized (aClass45_2084) {
            is = aClass45_2084.method410(-1860, 36, i);
        }
        class42 = new Class42();
        class42.aClass153_593 = this;
        class42.anInt581 = i;
        if (is != null)
            class42.method379(new Class348_Sub49(is), 109);
        class42.method372(-25359);
        synchronized (aClass60_2083) {
            aClass60_2083.method582(class42, i, (byte) -106);
        }
        return class42;
    }

    Class153(Class230 class230, int i, Class45 class45, Class45 class45_10_) {
        try {
            aClass45_2084 = class45;
            this.aClass45_2087 = class45_10_;
            aClass45_2084.method407(0, 36);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929
                    (runtimeexception,
                            ("on.<init>(" + (class230 != null ? "{...}" : "null")
                                    + ',' + i + ',' + (class45 != null ? "{...}" : "null")
                                    + ',' + (class45_10_ != null ? "{...}" : "null")
                                    + ')'));
        }
    }
}
