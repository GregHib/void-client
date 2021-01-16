/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class193 {
    static int anInt2583;
    int anInt2584;
    private final Class377 aClass377_2585;
    static int anInt2586;
    static Class351 aClass351_2587 = new Class351(38, 7);
    static int anInt2588;
    static Class202 aClass202_2589;
    static int anInt2590;

    static final Class279 method1439(int i, Class297 class297,
                                     Component component, int i_0_, int i_1_) {
        try {
            anInt2583++;
            if (Class22.anInt339 == 0)
                throw new IllegalStateException();
            if (i_0_ < 0 || i_0_ >= 2)
                throw new IllegalArgumentException();
            if (i < 256)
                i = 256;
            try {
                Class279 class279
                        = (Class279) Class.forName("Class279_Sub1").newInstance();
                class279.anInt3620 = i;
                class279.anIntArray3603
                        = new int[(Class282.aBoolean3652 ? 2 : 1) * 256];
                class279.method2095(component);
                class279.anInt3613 = (i & ~0x3ff) + 1024;
                if (class279.anInt3613 > 16384)
                    class279.anInt3613 = 16384;
                class279.method2082(class279.anInt3613);
                if ((Class253.anInt3248 ^ 0xffffffff) < -1
                        && Class183.aClass250_2462 == null) {
                    Class183.aClass250_2462 = new Class250();
                    Class183.aClass250_2462.aClass297_3228
                            = class297;
                    class297.method2236(Class183.aClass250_2462, -10240,
                            Class253.anInt3248);
                }
                if (Class183.aClass250_2462 != null) {
                    if ((Class183.aClass250_2462
                            .aClass279Array3218[i_0_])
                            != null)
                        throw new IllegalArgumentException();
                    Class183.aClass250_2462.aClass279Array3218
                            [i_0_]
                            = class279;
                }
                if (i_1_ != 7)
                    method1440(107);
                return class279;
            } catch (Throwable throwable) {
                try {
                    Class279_Sub2 class279_sub2
                            = new Class279_Sub2(class297, i_0_);
                    class279_sub2.anInt3620 = i;
                    class279_sub2.anIntArray3603
                            = new int[(!Class282.aBoolean3652 ? 1 : 2) * 256];
                    class279_sub2.method2095(component);
                    class279_sub2.anInt3613 = 16384;
                    class279_sub2
                            .method2082(class279_sub2.anInt3613);
                    if (Class253.anInt3248 > 0
                            && Class183.aClass250_2462 == null) {
                        Class183.aClass250_2462 = new Class250();
                        Class183.aClass250_2462.aClass297_3228
                                = class297;
                        class297.method2236(Class183.aClass250_2462, -10240,
                                Class253.anInt3248);
                    }
                    if (Class183.aClass250_2462 != null) {
                        if ((Class183.aClass250_2462
                                .aClass279Array3218[i_0_])
                                != null)
                            throw new IllegalArgumentException();
                        Class183.aClass250_2462
                                .aClass279Array3218[i_0_]
                                = class279_sub2;
                    }
                    return class279_sub2;
                } catch (Throwable throwable_2_) {
                    return new Class279();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("qr.A(" + i + ','
                            + (class297 != null ? "{...}"
                            : "null")
                            + ','
                            + (component != null ? "{...}"
                            : "null")
                            + ',' + i_0_ + ',' + i_1_ + ')'));
        }
    }

    protected final void finalize() throws Throwable {
        anInt2588++;
        aClass377_2585.method3971(16386, this.anInt2584);
        super.finalize();
    }

    Class193(Class377 class377, int i, int i_3_) {
        aClass377_2585 = class377;
        this.anInt2584 = i_3_;
    }

    public static void method1440(int i) {
        aClass202_2589 = null;
        int i_4_ = -79 / ((i - -45) / 46);
        aClass351_2587 = null;
    }
}
