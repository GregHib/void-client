/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class191 {
    static int anInt2556;
    private int anInt2557 = 0;
    static int anInt2558;
    private final int anInt2559;
    static int anInt2560;
    private Class262 aClass262_2561;
    private int anInt2562 = -1;
    private Class348_Sub6[] aClass348_Sub6Array2563;
    private int[][] anIntArrayArray2564;
    private int anInt2565;
    static int anInt2566;
    static int anInt2567;
    static Class227 aClass227_2568 = new Class227(0);
    static int anInt2569;
    boolean aBoolean2570;
    static Class304 aClass304_2571 = new Class304(2);

    final int[][] method1427(byte i) {
        anInt2558++;
        if (anInt2559 != anInt2565) throw new RuntimeException("Can only retrieve a full image cache");
        for (int i_0_ = 0; anInt2559 > i_0_; i_0_++)
            aClass348_Sub6Array2563[i_0_] = aa_Sub3.aClass348_Sub6_5206;
        if (i != 16) method1427((byte) -42);
        return anIntArrayArray2564;
    }

    static final void method1428(boolean bool) {
        Class342.anImage4249 = null;
        anInt2569++;
        Class351.aFont4329 = null;
        if (bool != true) method1431(-122);
    }

    static final void method1429(String string, int i) {
        Class286_Sub2.method2144("", i, (byte) -125, 0, string, "", "");
        anInt2560++;
    }

    static final void method1430(int i, byte i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3, Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3_8_) {
        try {
            anInt2567++;
            int i_9_ = class318_sub1_sub3_sub3.method2425(-1);
            if (i_9_ != -1) {
                Object object = null;
                Class105 class105 = ((Class105) Class348_Sub1_Sub1.aClass60_8807.method583(i_9_, 118));
                if (class105 == null) {
                    Class207[] class207s = Class207.method1519(Class21.aClass45_322, i_9_, 0);
                    if (class207s == null) return;
                    class105 = Class348_Sub8.aHa6654.method3691(class207s[0], true);
                    Class348_Sub1_Sub1.aClass60_8807.method582(class105, i_9_, (byte) -115);
                }
                aa_Sub2.method165(class318_sub1_sub3_sub3_8_.plane, i_5_, 0, i_3_ >> 1, class318_sub1_sub3_sub3_8_.x, class318_sub1_sub3_sub3_8_.method2436((byte) 126) * 256, class318_sub1_sub3_sub3_8_.y, (byte) 92, i_6_ >> 1, i_2_);
                int i_10_ = i_7_ + (Class239_Sub21.anIntArray6062[0] + -18);
                int i_11_ = -54 + (Class239_Sub21.anIntArray6062[1] + i_4_) - 16;
                i_10_ += i / 4 * 18;
                i_11_ += 18 * (i % 4);
                int i_12_ = -76 / ((i_1_ - 3) / 38);
                class105.method974(i_10_, i_11_);
                if (class318_sub1_sub3_sub3 == class318_sub1_sub3_sub3_8_) Class348_Sub8.aHa6654.method3668(18, -1 + i_11_, -256, i_10_ - 1, 18, 57);
                Class338.method2663(-5590, i_10_ + -1, 18 + i_10_, i_11_ + -1, i_11_ - -18);
                Class318_Sub6 class318_sub6 = Class367.method3529(32564);
                class318_sub6.anInt6426 = 16 + i_10_;
                class318_sub6.anInt6427 = i_11_;
                class318_sub6.aClass318_Sub1_Sub3_Sub3_6431 = class318_sub1_sub3_sub3;
                class318_sub6.anInt6425 = i_11_ - -16;
                class318_sub6.anInt6429 = i_10_;
                InputStream_Sub2.aClass243_83.method1869(-87, class318_sub6);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qk.G(" + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + (class318_sub1_sub3_sub3 != null ? "{...}" : "null") + ',' + ((class318_sub1_sub3_sub3_8_ != null) ? "{...}" : "null") + ')'));
        }
    }

    public static void method1431(int i) {
        aClass304_2571 = null;
        aClass227_2568 = null;
        if (i != 0) aClass227_2568 = null;
    }

    final void method1432(byte i) {
        for (int i_13_ = 0; i_13_ < anInt2559; i_13_++)
            anIntArrayArray2564[i_13_] = null;
        anInt2556++;
        aClass348_Sub6Array2563 = null;
        anIntArrayArray2564 = null;
        aClass262_2561.method1996(112);
        if (i != 124) anInt2565 = -126;
        aClass262_2561 = null;
    }

    final int[] method1433(int i, int i_14_) {
        if (i != 0) method1427((byte) 108);
        anInt2566++;
        if (anInt2559 == anInt2565) {
            this.aBoolean2570 = aClass348_Sub6Array2563[i_14_] == null;
            aClass348_Sub6Array2563[i_14_] = aa_Sub3.aClass348_Sub6_5206;
            return anIntArrayArray2564[i_14_];
        }
        if (anInt2559 != 1) {
            Class348_Sub6 class348_sub6 = aClass348_Sub6Array2563[i_14_];
            if (class348_sub6 == null) {
                this.aBoolean2570 = true;
                if (anInt2557 < anInt2559) {
                    class348_sub6 = new Class348_Sub6(i_14_, anInt2557);
                    anInt2557++;
                } else {
                    Class348_Sub6 class348_sub6_15_ = (Class348_Sub6) aClass262_2561.method1993(i + -123);
                    class348_sub6 = new Class348_Sub6(i_14_, class348_sub6_15_.anInt6636);
                    aClass348_Sub6Array2563[class348_sub6_15_.anInt6630] = null;
                    class348_sub6_15_.method2715((byte) 80);
                }
                aClass348_Sub6Array2563[i_14_] = class348_sub6;
            } else this.aBoolean2570 = false;
            aClass262_2561.method2001(class348_sub6, -90);
            return (anIntArrayArray2564[class348_sub6.anInt6636]);
        }
        this.aBoolean2570 = i_14_ != anInt2562;
        anInt2562 = i_14_;
        return anIntArrayArray2564[0];
    }

    Class191(int i, int i_16_, int i_17_) {
        aClass262_2561 = new Class262();
        this.aBoolean2570 = false;
        anInt2559 = i;
        anInt2565 = i_16_;
        aClass348_Sub6Array2563 = new Class348_Sub6[anInt2565];
        anIntArrayArray2564 = new int[anInt2559][i_17_];
    }
}
