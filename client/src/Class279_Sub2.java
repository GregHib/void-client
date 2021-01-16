/* Class279_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.Component;

final class Class279_Sub2 extends Class279 {
    private int anInt6181;
    private static Interface20 anInterface20_6182;

    final void method2083() {
        anInterface20_6182.method77((byte) 98, anInt6181);
    }

    final int method2081() {
        return anInterface20_6182.method75((byte) -93, anInt6181);
    }

    public static void method2097() {
        anInterface20_6182 = null;
    }

    final void method2091() {
        anInterface20_6182.method74(anInt6181, (byte) 122);
    }

    final void method2095(Component component) throws Exception {
        anInterface20_6182.method78(Class22.anInt339, Class282.aBoolean3652,
                component, 27929);
    }

    final void method2094() {
        anInterface20_6182.method76(anInt6181,
                ((Class279) this).anIntArray3603);
    }

    Class279_Sub2(Class297 class297, int i) {
        anInterface20_6182 = (Interface20) class297.method2244(21);
        anInt6181 = i;
    }

    final void method2082(int i) throws Exception {
        if (i > 32768)
            throw new IllegalArgumentException();
        anInterface20_6182.method79(i, anInt6181, (byte) 112);
    }
}
