/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class30 {
    private int anInt404;
    private int anInt405;
    private int anInt406;
    static int[] anIntArray407 = new int[1];
    private int anInt408;
    private int anInt409;
    static int anInt410;
    static int anInt411;
    private int anInt412;
    static Class84 aClass84_413;
    static int anInt414;
    static int anInt415;
    private int anInt416;
    private int anInt417;
    private int anInt418;
    private int anInt419;

    static final void method319(int i, int i_0_, byte i_1_, int i_2_,
                                int i_3_) {
        if (i_1_ != -18)
            method322(73);
        anInt414++;
        Class336.anInt4171 = i_2_;
        Class305.anInt3861 = i_0_;
        Class18.anInt282 = i;
        Class205.anInt2688 = i_3_;
    }

    final void method320(int i, int i_4_, byte i_5_, int i_6_, int i_7_,
                         int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
                         int i_13_) {
        anInt415++;
        anInt409 = i_6_;
        anInt417 = i_12_;
        anInt405 = i_7_ * i_7_;
        anInt408 = i_8_;
        anInt404 = i_10_ + anInt408;
        anInt412 = anInt408 + i_11_;
        anInt419 = anInt409 + i_13_;
        anInt418 = i_9_ + anInt409;
        anInt416 = i_4_ + anInt417;
        anInt406 = anInt417 - -i;
        if (i_5_ != -4)
            aClass84_413 = null;
    }

    final boolean method321(int i, int i_14_, int i_15_, int i_16_) {
        anInt411++;
        if (anInt418 > i_16_ || (anInt419 ^ 0xffffffff) > (i_16_ ^ 0xffffffff))
            return false;
        if ((i_15_ ^ 0xffffffff) > (anInt416 ^ 0xffffffff) || i_15_ > anInt406)
            return false;
        if (i_14_ < anInt412 || (i_14_ ^ 0xffffffff) < (anInt404 ^ 0xffffffff))
            return false;
        if (i != -14735)
            method323(null, null, (byte) 29);
        int i_17_ = -anInt409 + i_16_;
        int i_18_ = i_14_ + -anInt408;
        return anInt405 > i_17_ * i_17_ + i_18_ * i_18_;
    }

    public static void method322(int i) {
        anIntArray407 = null;
        aClass84_413 = null;
        if (i != 1)
            method322(-112);
    }

    static final void method323(Class45 class45, Class297 class297, byte i) {
        try {
            Class348_Sub41.aString7048 = "";
            Class59_Sub1.aClass297_5297 = class297;
            anInt410++;
            Class167.aClass45_2208 = class45;
            if (!Class348_Sub24.aString6877.startsWith("win")) {
                if (!Class348_Sub24.aString6877.startsWith("linux")) {
                    if (Class348_Sub24.aString6877.startsWith("mac"))
                        Class348_Sub41.aString7048 += "macos/";
                } else
                    Class348_Sub41.aString7048 += "linux/";
            } else
                Class348_Sub41.aString7048 += "windows/";
            if (i != 95)
                anIntArray407 = null;
            if (!Class59_Sub1.aClass297_5297.aBoolean3794) {
                if (!Class348_Sub24.aString6876.startsWith("amd64")
                        && !Class348_Sub24.aString6876.startsWith("x86_64")) {
                    if (!Class348_Sub24.aString6876.startsWith("i386")
                            && !Class348_Sub24.aString6876.startsWith("i486")
                            && !Class348_Sub24.aString6876.startsWith("i586")
                            && !Class348_Sub24.aString6876.startsWith("x86")) {
                        if (!Class348_Sub24.aString6876.startsWith("ppc"))
                            Class348_Sub41.aString7048 += "universal/";
                        else
                            Class348_Sub41.aString7048 += "ppc/";
                    } else
                        Class348_Sub41.aString7048 += "x86/";
                } else
                    Class348_Sub41.aString7048 += "x86_64/";
            } else
                Class348_Sub41.aString7048 += "msjava/";
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("hw.A("
                            + (class45 != null ? "{...}"
                            : "null")
                            + ','
                            + (class297 != null ? "{...}"
                            : "null")
                            + ',' + i + ')'));
        }
    }

    Class30(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_,
            int i_24_, int i_25_, int i_26_, int i_27_) {
        anInt408 = i_20_;
        anInt417 = i_19_;
        anInt405 = i_21_ * i_21_;
        anInt409 = i;
        anInt412 = anInt408 + i_26_;
        anInt406 = i_25_ + anInt417;
        anInt416 = i_24_ + anInt417;
        anInt404 = i_27_ + anInt408;
        anInt419 = i_23_ + anInt409;
        anInt418 = anInt409 - -i_22_;
    }
}
