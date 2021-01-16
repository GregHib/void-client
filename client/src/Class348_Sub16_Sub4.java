/* Class348_Sub16_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub16_Sub4 extends Class348_Sub16 {
    private final Class262 aClass262_8965 = new Class262();
    private final Class262 aClass262_8966 = new Class262();
    private int anInt8967 = -1;
    private int anInt8968 = 0;

    final synchronized void method2880(Class348_Sub16 class348_sub16) {
        class348_sub16.method2715((byte) 94);
    }

    final synchronized void method2819(int i) {
        do {
            if (anInt8967 < 0) {
                method2884(i);
                break;
            }
            if (anInt8968 + i < anInt8967) {
                anInt8968 += i;
                method2884(i);
                break;
            }
            int i_0_ = anInt8967 - anInt8968;
            method2884(i_0_);
            i -= i_0_;
            anInt8968 += i_0_;
            method2885();
            Class348_Sub30 class348_sub30 = (Class348_Sub30) aClass262_8966.method1995(4);
            synchronized (class348_sub30) {
                int i_1_ = class348_sub30.method3005(this);
                if (i_1_ < 0) {
                    class348_sub30.anInt6912 = 0;
                    method2882(class348_sub30);
                } else {
                    class348_sub30.anInt6912 = i_1_;
                    method2881(class348_sub30.aClass348_4294, class348_sub30);
                }
            }
        } while (i != 0);
    }

    final Class348_Sub16 method2816() {
        return (Class348_Sub16) aClass262_8965.method1995(4);
    }

    private final void method2881(Class348 class348, Class348_Sub30 class348_sub30) {
        for (/**/; (class348 != aClass262_8966.aClass348_3334 && (((Class348_Sub30) class348).anInt6912 <= class348_sub30.anInt6912)); class348 = class348.aClass348_4294) {
            /* empty */
        }
        Class348_Sub42_Sub16_Sub2.method3265(-106, class348_sub30, class348);
        anInt8967 = ((Class348_Sub30) aClass262_8966.aClass348_3334.aClass348_4294).anInt6912;
    }

    private final void method2882(Class348_Sub30 class348_sub30) {
        class348_sub30.method2715((byte) 105);
        class348_sub30.method3006();
        Class348 class348 = (aClass262_8966.aClass348_3334.aClass348_4294);
        if (class348 == aClass262_8966.aClass348_3334) anInt8967 = -1;
        else anInt8967 = ((Class348_Sub30) class348).anInt6912;
    }

    final synchronized void method2883(Class348_Sub16 class348_sub16) {
        aClass262_8965.method2001(class348_sub16, -109);
    }

    private final void method2884(int i) {
        for (Class348_Sub16 class348_sub16 = (Class348_Sub16) aClass262_8965.method1995(4); class348_sub16 != null; class348_sub16 = (Class348_Sub16) aClass262_8965.method1990((byte) 104))
            class348_sub16.method2819(i);
    }

    private final void method2885() {
        if (anInt8968 > 0) {
            for (Class348_Sub30 class348_sub30 = (Class348_Sub30) aClass262_8966.method1995(4); class348_sub30 != null; class348_sub30 = (Class348_Sub30) aClass262_8966.method1990((byte) 115))
                class348_sub30.anInt6912 -= anInt8968;
            anInt8967 -= anInt8968;
            anInt8968 = 0;
        }
    }

    private final void method2886(int[] is, int i, int i_2_) {
        for (Class348_Sub16 class348_sub16 = (Class348_Sub16) aClass262_8965.method1995(4); class348_sub16 != null; class348_sub16 = (Class348_Sub16) aClass262_8965.method1990((byte) 41))
            class348_sub16.method2815(is, i, i_2_);
    }

    final synchronized int method2887() {
        return aClass262_8965.method1998(0);
    }

    final Class348_Sub16 method2818() {
        return (Class348_Sub16) aClass262_8965.method1990((byte) 95);
    }

    final int method2821() {
        return 0;
    }

    final synchronized void method2817(int[] is, int i, int i_3_) {
        do {
            if (anInt8967 < 0) {
                method2886(is, i, i_3_);
                break;
            }
            if (anInt8968 + i_3_ < anInt8967) {
                anInt8968 += i_3_;
                method2886(is, i, i_3_);
                break;
            }
            int i_4_ = anInt8967 - anInt8968;
            method2886(is, i, i_4_);
            i += i_4_;
            i_3_ -= i_4_;
            anInt8968 += i_4_;
            method2885();
            Class348_Sub30 class348_sub30 = (Class348_Sub30) aClass262_8966.method1995(4);
            synchronized (class348_sub30) {
                int i_5_ = class348_sub30.method3005(this);
                if (i_5_ < 0) {
                    class348_sub30.anInt6912 = 0;
                    method2882(class348_sub30);
                } else {
                    class348_sub30.anInt6912 = i_5_;
                    method2881(class348_sub30.aClass348_4294, class348_sub30);
                }
            }
        } while (i_3_ != 0);
    }

    public Class348_Sub16_Sub4() {
        /* empty */
    }
}
