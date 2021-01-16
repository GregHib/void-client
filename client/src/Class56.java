/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class56 {
    Class274 aClass274_1012;
    boolean aBoolean1013;
    static int anInt1014;
    Class274 aClass274_1015;
    boolean aBoolean1016;
    private final int anInt1017;
    static Class56 aClass56_1018 = new Class56(0, Class274.aClass274_3499, Class274.aClass274_3499, 0, 1);
    static int anInt1019;
    static int anInt1020;
    int anInt1021;
    static int anInt1022;
    static Class56 aClass56_1023 = new Class56(1, Class274.aClass274_3499, 2);
    static Class56 aClass56_1024 = new Class56(2, Class274.aClass274_3499, Class274.aClass274_3499, 2, 3);
    int anInt1025;
    static Class56 aClass56_1026 = new Class56(3, Class274.aClass274_3499, 3);
    static Class56 aClass56_1027 = new Class56(4, Class274.aClass274_3499, Class274.aClass274_3499, 3, 4);
    static Class56 aClass56_1028 = new Class56(5, Class274.aClass274_3499, 4);
    static Class56 aClass56_1029 = new Class56(6, Class274.aClass274_3499, 4);
    static Class56 aClass56_1030 = new Class56(7, Class274.aClass274_3499, Class274.aClass274_3499, 4, 5);
    static Class56 aClass56_1031 = new Class56(8, Class274.aClass274_3499, Class274.aClass274_3499, 5, 98, true, true);//
    static Class56 aClass56_1032 = new Class56(9, Class274.aClass274_3499, 99);
    static Class56 aClass56_1033 = new Class56(10, Class274.aClass274_3499, 100);
    static Class56 aClass56_1034 = new Class56(11, Class274.aClass274_3500, Class274.aClass274_3500, 0, 92, true, true);
    static Class56 aClass56_1035 = new Class56(12, Class274.aClass274_3500, Class274.aClass274_3500, 92, 92);
    private static Class56 aClass56_1036 = new Class56(13, Class274.aClass274_3500, Class274.aClass274_3500, 92, 93);
    static Class56 aClass56_1037 = new Class56(14, Class274.aClass274_3500, Class274.aClass274_3500, 94, 95);
    static Class56 aClass56_1038 = new Class56(15, Class274.aClass274_3500, Class274.aClass274_3500, 96, 97);
    static Class56 aClass56_1039 = new Class56(16, Class274.aClass274_3500, 97);
    static Class56 aClass56_1040 = new Class56(17, Class274.aClass274_3500, 97);
    static Class56 aClass56_1041 = new Class56(18, Class274.aClass274_3500, 100);
    static Class56 aClass56_1042 = new Class56(19, Class274.aClass274_3500, 100);
    static Class56 aClass56_1043 = new Class56(20, Class274.aClass274_3500, 100);
    static int anInt1044;
    static int[] anIntArray1045 = new int[2];

    private Class56(int i, Class274 class274, int i_0_) {
        this(i, class274, class274, i_0_, i_0_, true, false);
    }

    final int method525(int i) {
        if (i >= -109) aClass56_1039 = null;
        anInt1019++;
        return anInt1017;
    }

    public final String toString() {
        anInt1022++;
        throw new IllegalStateException();
    }

    public static void method526(int i) {
        aClass56_1040 = null;
        aClass56_1032 = null;
        aClass56_1042 = null;
        aClass56_1038 = null;
        aClass56_1034 = null;
        aClass56_1027 = null;
        aClass56_1018 = null;
        aClass56_1026 = null;
        if (i > 42) {
            aClass56_1039 = null;
            aClass56_1031 = null;
            aClass56_1043 = null;
            aClass56_1033 = null;
            aClass56_1024 = null;
            aClass56_1029 = null;
            aClass56_1023 = null;
            aClass56_1036 = null;
            anIntArray1045 = null;
            aClass56_1041 = null;
            aClass56_1030 = null;
            aClass56_1037 = null;
            aClass56_1028 = null;
            aClass56_1035 = null;
        }
    }

    static final void method527(Frame frame, Class297 class297, boolean bool) {
        try {
            anInt1020++;
            for (; ; ) {
                Class144 class144 = class297.method2248((byte) 89, frame);
                while (class144.anInt1997 == 0) Class286_Sub5.method2161((byte) -124, 10L);
                if (class144.anInt1997 == 1) break;
                Class286_Sub5.method2161((byte) 33, 100L);
            }
            frame.setVisible(bool);
            frame.dispose();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("jj.D(" + (frame != null ? "{...}" : "null") + ',' + (class297 != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    private Class56(int i, Class274 class274, Class274 class274_1_, int i_2_, int i_3_) {
        this(i, class274, class274_1_, i_2_, i_3_, true, false);
    }

    static final Class56[] method528(int i) {
        anInt1014++;
        int i_4_ = 108 / ((i - 34) / 55);
        return (new Class56[]{aClass56_1018, aClass56_1023, aClass56_1024, aClass56_1026, aClass56_1027, aClass56_1028, aClass56_1029, aClass56_1030, aClass56_1031, aClass56_1032, aClass56_1033, aClass56_1034, aClass56_1035, aClass56_1036, aClass56_1037, aClass56_1038, aClass56_1039, aClass56_1040, aClass56_1041, aClass56_1042, aClass56_1043});
    }

    private Class56(int i, Class274 class274, Class274 class274_5_, int i_6_, int i_7_, boolean bool, boolean bool_8_) {
        try {
            this.aClass274_1012 = class274;
            this.anInt1021 = i_7_;
            anInt1017 = i;
            this.anInt1025 = i_6_;
            this.aClass274_1015 = class274_5_;
            this.aBoolean1016 = bool_8_;
            this.aBoolean1013 = bool;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("jj.<init>(" + i + ',' + (class274 != null ? "{...}" : "null") + ',' + (class274_5_ != null ? "{...}" : "null") + ',' + i_6_ + ',' + i_7_ + ',' + bool + ',' + bool_8_ + ')'));
        }
    }
}
