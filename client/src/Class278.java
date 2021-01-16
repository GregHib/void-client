/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class278 {
    Class45 aClass45_3576;
    private Class60 aClass60_3577 = new Class60(64);
    Class230 aClass230_3578;
    static int anInt3579;
    static int anInt3580;
    static int anInt3581;
    static int anInt3582;
    boolean aBoolean3583;
    static int anInt3584;
    private final Class45 aClass45_3585;
    static int anInt3586;
    static int anInt3587;
    static int anInt3588;
    static int anInt3589;
    Class60 aClass60_3590 = new Class60(50);
    static int anInt3591;
    Class60 aClass60_3592 = new Class60(5);
    int anInt3593;

    final void method2072(byte i, boolean bool) {
        if (i >= 22) {
            anInt3580++;
            if (this.aBoolean3583 != bool) {
                this.aBoolean3583 = bool;
                method2078(-6080);
            }
        }
    }

    final void method2073(int i, int i_0_) {
        this.anInt3593 = i_0_;
        anInt3591++;
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.method590(0);
        }
        synchronized (this.aClass60_3592) {
            this.aClass60_3592.method590(0);
        }
        if (i != -25032) method2079(-66, 101);
    }

    final void method2074(int i) {
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.method590(0);
        }
        if (i < -94) {
            anInt3582++;
            synchronized (this.aClass60_3592) {
                this.aClass60_3592.method590(0);
            }
        }
    }

    static final boolean method2075(int i, int i_1_, int i_2_) {
        anInt3584++;
        if (i_1_ > -125) anInt3581 = -110;
        return (i & 0x100100) != 0;
    }

    final void method2076(int i, boolean bool) {
        anInt3589++;
        synchronized (aClass60_3577) {
            aClass60_3577.method578(2, i);
        }
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.method578(2, i);
        }
        if (bool != true) method2072((byte) 120, true);
        synchronized (this.aClass60_3592) {
            this.aClass60_3592.method578(2, i);
        }
    }

    static final boolean method2077(int i, int i_3_, int i_4_) {
        int i_5_ = -75 % ((-43 - i) / 40);
        anInt3588++;
        return (i_4_ & 0x8000) != 0;
    }

    final void method2078(int i) {
        anInt3579++;
        synchronized (aClass60_3577) {
            if (i != -6080) this.aClass60_3590 = null;
            aClass60_3577.method590(i + 6080);
        }
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.method590(i + 6080);
        }
        synchronized (this.aClass60_3592) {
            this.aClass60_3592.method590(0);
        }
    }

    final Class79 method2079(int i, int i_6_) {
        anInt3586++;
        Class79 class79;
        synchronized (aClass60_3577) {
            class79 = (Class79) aClass60_3577.method583(i, -104);
        }
        if (class79 != null) return class79;
        byte[] is;
        synchronized (aClass45_3585) {
            is = aClass45_3585.method410(i_6_ + -1859, Class115.method1060(i, (byte) 69), Class253.method1920(127, i));
        }
        class79 = new Class79();
        class79.anInt1344 = i;
        class79.aClass278_1348 = this;
        if (is != null) class79.method798(111, new Class348_Sub49(is));
        class79.method799(-117);
        synchronized (aClass60_3577) {
            aClass60_3577.method582(class79, i, (byte) -102);
            if (i_6_ != -1) aClass60_3577 = null;
        }
        return class79;
    }

    final void method2080(int i) {
        anInt3587++;
        synchronized (aClass60_3577) {
            aClass60_3577.method587(-118);
        }
        synchronized (this.aClass60_3590) {
            this.aClass60_3590.method587(-100);
        }
        synchronized (this.aClass60_3592) {
            this.aClass60_3592.method587(-107);
        }
        if (i <= 122) method2075(-125, -46, 9);
    }

    Class278(Class230 class230, int i, boolean bool, Class45 class45, Class45 class45_7_) {
        do {
            try {
                this.aBoolean3583 = bool;
                aClass45_3585 = class45;
                this.aClass45_3576 = class45_7_;
                this.aClass230_3578 = class230;
                if (aClass45_3585 == null) break;
                int i_8_ = aClass45_3585.method414(-1) + -1;
                aClass45_3585.method407(0, i_8_);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("vda.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_7_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }
}
