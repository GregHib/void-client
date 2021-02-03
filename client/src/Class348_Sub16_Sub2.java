/* Class348_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub16_Sub2 extends Class348_Sub16 {
    static int anInt8860;
    private Class262 aClass262_8861 = new Class262();
    static int[] anIntArray8862;
    static int anInt8863;
    static int anInt8864;
    static int anInt8865;
    static long aLong8866;
    static int anInt8867;
    static int anInt8868;
    static double aDouble8869;
    static boolean aBoolean8870 = true;
    static int anInt8871;
    static int anInt8872;
    static int anInt8873;
    static boolean aBoolean8874;
    static int anInt8875;
    static int anInt8876;
    static int anInt8877;
    static int anInt8878;
    private final int anInt8879;
    static int anInt8880;
    static int anInt8881;
    static int anInt8882;
    private int anInt8883;
    private boolean aBoolean8884;
    private int anInt8885 = 256;
    private boolean aBoolean8886;
    private int anInt8887 = 256;
    private int anInt8888 = 0;

    final void method2827(int i, int i_0_) {
        anInt8885 = i_0_;
        anInt8887 = i_0_;
        if (i != -17708) method2830(-93);
        anInt8880++;
    }

    private final synchronized Class348_Sub42_Sub4 method2828(int i) {
        if (i != -23076) method2817(null, 71, 78);
        anInt8872++;
        return (Class348_Sub42_Sub4) aClass262_8861.method1995(i + 23080);
    }

    final Class348_Sub16 method2818() {
        anInt8877++;
        return null;
    }

    final synchronized int method2829(int i) {
        anInt8871++;
        if (i >= -33) method2831((byte) 84);
        return anInt8888;
    }

    public static void method2830(int i) {
        if (i != 0) method2834((byte) 68, null);
        anIntArray8862 = null;
    }

    private final synchronized void method2831(byte i) {
        anInt8875++;
        int i_1_ = -13 / ((-66 - i) / 49);
        Class348_Sub42_Sub4 class348_sub42_sub4 = method2828(-23076);
        if (class348_sub42_sub4 != null) {
            class348_sub42_sub4.method2715((byte) 71);
            anInt8888--;
            anInt8883 = 0;
            Class348_Sub40_Sub10.aClass308_9180.method2305(class348_sub42_sub4.method3182(90), class348_sub42_sub4, -1);
        }
    }

    static final void method2832(int[] is, long[] ls, int i) {
        try {
            IOException_Sub1.method129(i, i + -107, ls, ls.length - 1, is);
            anInt8882++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("iha.I(" + (is != null ? "{...}" : "null") + ',' + (ls != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    final synchronized void method2817(int[] is, int i, int i_2_) {
        anInt8863++;
        if (!aBoolean8886) {
            if (method2828(-23076) == null) {
                if (aBoolean8884) {
                    this.method2715((byte) 23);
                    Class348_Sub40_Sub10.aClass308_9180.method2303(true);
                }
            } else {
                int i_3_ = i - -i_2_;
                if (Class282.aBoolean3652) i_3_ <<= 1;
                int i_4_ = 0;
                int i_5_ = 0;
                if (anInt8879 == 2) i_5_ = 1;
                while (i_3_ > i) {
                    Class348_Sub42_Sub4 class348_sub42_sub4 = method2828(-23076);
                    if (class348_sub42_sub4 == null) break;
                    short[][] is_6_;
                    for (is_6_ = (class348_sub42_sub4.aShortArrayArray9518); i < i_3_ && anInt8883 < is_6_[0].length; anInt8883++) {
                        if (Class282.aBoolean3652) {
                            is[i++] = anInt8885 * is_6_[i_4_][anInt8883];
                            is[i++] = is_6_[i_5_][anInt8883] * anInt8887;
                        } else is[i++] += (is_6_[i_5_][anInt8883] * anInt8887 + anInt8885 * is_6_[i_4_][anInt8883]);
                    }
                    if (anInt8883 >= is_6_[0].length) method2831((byte) -126);
                }
            }
        }
    }

    final synchronized void method2833(int i, boolean bool) {
        if (i != 1) aDouble8869 = -2.8743710633758983;
        aBoolean8886 = bool;
        anInt8878++;
    }

    static final Class369 method2834(byte i, Class348_Sub49 class348_sub49) {
        anInt8876++;
        Class221 class221 = Class158.method1248(15)[class348_sub49.readUnsignedByte(255)];
        if (i > -113) aDouble8869 = -1.5911312034627048;
        Class341 class341 = Class62.method596(20000)[class348_sub49.readUnsignedByte(255)];
        int i_7_ = class348_sub49.readShort(13638);
        int i_8_ = class348_sub49.readShort(13638);
        int i_9_ = class348_sub49.readUnsignedShort(842397944);
        int i_10_ = class348_sub49.readUnsignedShort(842397944);
        int i_11_ = class348_sub49.readShort(13638);
        int i_12_ = class348_sub49.readInt((byte) -126);
        int i_13_ = class348_sub49.readInt((byte) -126);
        return new Class369(class221, class341, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_);
    }

    final synchronized void method2835(Class348_Sub42_Sub4 class348_sub42_sub4, int i) {
        for (/**/; anInt8888 >= 100; anInt8888--)
            aClass262_8861.method1997(8);
        if (i == 30700) {
            anInt8881++;
            aClass262_8861.method1999(class348_sub42_sub4, -20180);
            anInt8888++;
        }
    }

    final Class348_Sub16 method2816() {
        anInt8867++;
        return null;
    }

    final synchronized void method2836(int i) {
        aBoolean8884 = true;
        if (i != -1) aClass262_8861 = null;
        anInt8865++;
    }

    final synchronized double method2837(int i) {
        anInt8868++;
        if (anInt8888 < 1) return -1.0;
        if (i != -21987) method2818();
        Class348_Sub42_Sub4 class348_sub42_sub4 = (Class348_Sub42_Sub4) aClass262_8861.method1995(4);
        if (class348_sub42_sub4 == null) return -1.0;
        return ((double) -((float) (class348_sub42_sub4.aShortArrayArray9518[0]).length / (float) Class22.anInt339) + class348_sub42_sub4.aDouble9512);
    }

    final Class348_Sub42_Sub4 method2838(int i, double d, int i_14_) {
        anInt8860++;
        long l = i | anInt8879 << 0;
        Class348_Sub42_Sub4 class348_sub42_sub4 = ((Class348_Sub42_Sub4) Class348_Sub40_Sub10.aClass308_9180.method2302(l, (byte) -31));
        if (i_14_ != 1401320384) return null;
        if (class348_sub42_sub4 == null) class348_sub42_sub4 = new Class348_Sub42_Sub4(new short[anInt8879][i], d);
        else {
            class348_sub42_sub4.aDouble9512 = d;
            Class348_Sub40_Sub10.aClass308_9180.method2304(-121, l);
        }
        return class348_sub42_sub4;
    }

    final synchronized void method2819(int i) {
        anInt8864++;
        if (!aBoolean8886) {
            for (; ; ) {
                Class348_Sub42_Sub4 class348_sub42_sub4 = method2828(-23076);
                if (class348_sub42_sub4 == null) {
                    if (aBoolean8884) {
                        this.method2715((byte) 108);
                        Class348_Sub40_Sub10.aClass308_9180.method2303(true);
                    }
                    break;
                }
                if ((class348_sub42_sub4.aShortArrayArray9518[0]).length - anInt8883 > i) {
                    anInt8883 += i;
                    break;
                }
                i -= -anInt8883 + (class348_sub42_sub4.aShortArrayArray9518[0]).length;
                method2831((byte) 111);
            }
        }
    }

    final int method2821() {
        anInt8873++;
        return 1;
    }

    Class348_Sub16_Sub2(int i) {
        anInt8879 = i;
    }

    static {
        anIntArray8862 = new int[4096];
        aBoolean8874 = false;
        aLong8866 = 0L;
    }
}
