/* Class348_Sub23_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

final class Class348_Sub23_Sub4 extends Class348_Sub23 {
    static int anInt9047;
    private float aFloat9048;
    static int anInt9049;
    static int[] anIntArray9050 = new int[14];
    private String aString9051;
    static int anInt9052;
    static int anInt9053;
    private int anInt9054;
    private int anInt9055;
    static int anInt9056;
    private String aString9057;
    private String aString9058;
    static int anInt9059;
    static int anInt9060;
    static int anInt9061;
    private float aFloat9062;
    static int anInt9063;

    Class348_Sub23_Sub4(OggStreamState oggstreamstate) {
        super(oggstreamstate);
    }

    final void method2961(byte i) {
        anInt9056++;
        if (i != 13)
            aString9058 = null;
    }

    final float method2983(byte i) {
        if (i <= 61)
            return -0.49539495F;
        anInt9052++;
        return aFloat9062;
    }

    final float method2984(byte i) {
        anInt9060++;
        if (i != 97)
            aFloat9048 = -0.6790166F;
        return aFloat9048;
    }

    static final boolean method2985(int i, int i_0_, int i_1_) {
        if (i != -31735)
            method2990((byte) -62);
        anInt9059++;
        return (0x100 & i_1_ ^ 0xffffffff) != -1;
    }

    final void method2964(byte i, OggPacket oggpacket) {
        anInt9063++;
        if ((this.anInt6868 ^ 0xffffffff) >= -1
                || "SUB".equals(aString9057)) {
            Class348_Sub49 class348_sub49
                    = new Class348_Sub49(oggpacket.getData());
            int i_2_ = class348_sub49.method3387(255);
            if (this.anInt6868 <= 8) {
                if (((i_2_ | 0x80) ^ 0xffffffff) == -1)
                    throw new IllegalStateException();
                if (this.anInt6868 == 0) {
                    class348_sub49.anInt7197 += 23;
                    anInt9055 = class348_sub49.method3359(-89);
                    anInt9054 = class348_sub49.method3359(-41);
                    if ((anInt9055 ^ 0xffffffff) == -1 || anInt9054 == 0)
                        throw new IllegalStateException();
                    Class348_Sub49 class348_sub49_3_ = new Class348_Sub49(16);
                    class348_sub49.method3389(2147483647, 0, 16,
                            (class348_sub49_3_
                                    .aByteArray7154));
                    aString9051 = class348_sub49_3_.method3377((byte) -91);
                    class348_sub49_3_.anInt7197 = 0;
                    class348_sub49.method3389(2147483647, 0, 16,
                            (class348_sub49_3_
                                    .aByteArray7154));
                    aString9057 = class348_sub49_3_.method3377((byte) -40);
                }
            } else {
                if (i_2_ == 0) {
                    long l = class348_sub49.method3332((byte) 109);
                    long l_4_ = class348_sub49.method3332((byte) 90);
                    long l_5_ = class348_sub49.method3332((byte) 122);
                    if ((l ^ 0xffffffffffffffffL) > -1L
                            || (l_4_ ^ 0xffffffffffffffffL) > -1L
                            || (l_5_ ^ 0xffffffffffffffffL) > -1L || l_5_ > l)
                        throw new IllegalStateException();
                    aFloat9062
                            = (float) ((long) anInt9054 * l) / (float) anInt9055;
                    aFloat9048 = ((float) ((l - -l_4_) * (long) anInt9054)
                            / (float) anInt9055);
                    int i_6_ = class348_sub49.method3359(-93);
                    if (i_6_ < 0
                            || ((-class348_sub49.anInt7197
                            + (class348_sub49
                            .aByteArray7154).length)
                            ^ 0xffffffff) > (i_6_ ^ 0xffffffff))
                        throw new IllegalStateException();
                    aString9058
                            = (Class239_Sub17.method1793
                            (class348_sub49.aByteArray7154,
                                    class348_sub49.anInt7197, -123,
                                    i_6_));
                }
                if ((i_2_ | 0x80) != 0)
                    return;
            }
            if (i >= -91)
                anInt9055 = 88;
        }
    }

    final String method2986(int i) {
        anInt9053++;
        if (i < 26)
            method2986(-122);
        return aString9051;
    }

    static final void method2987(int i, int i_7_, int i_8_, int i_9_,
                                 int i_10_) {
        anInt9047++;
        if (i_7_ != 8 && (i_7_ ^ 0xffffffff) != -17) {
            Class357 class357
                    = Class147.aClass357ArrayArrayArray2029[i][i_10_][i_8_];
            if (class357 != null) {
                if (i_7_ != 1) {
                    if ((i_7_ ^ 0xffffffff) == -3)
                        class357.aShort4398 = (short) 0;
                } else
                    class357.aShort4409 = (short) 0;
            }
            Class286_Sub3.method2152(false);
        } else {
            for (int i_11_ = 0;
                 ((i_11_ ^ 0xffffffff)
                         > (Class348_Sub44.anInt7101 ^ 0xffffffff));
                 i_11_++) {
                Class338 class338 = Class294.aClass338Array5060[i_11_];
                if ((class338.aByte4192 == i_7_
                        && i_10_ == class338.aShort4185
                        && i_8_ == class338.aShort4193)
                        || (((i_10_ ^ 0xffffffff)
                        == (class338.aShort4182 ^ 0xffffffff))
                        && ((i_8_ ^ 0xffffffff)
                        == (class338.aShort4193
                        ^ 0xffffffff)))) {
                    if ((Class348_Sub44.anInt7101 ^ 0xffffffff)
                            != (i_11_ ^ 0xffffffff))
                        Class214.method1575(Class294.aClass338Array5060,
                                1 + i_11_,
                                Class294.aClass338Array5060, i_11_,
                                (Class294.aClass338Array5060.length
                                        + -i_11_ - 1));
                    Class348_Sub44.anInt7101--;
                    return;
                }
            }
        }
        if (i_9_ != -3951)
            anIntArray9050 = null;
    }

    static final void method2988(boolean bool) {
        Class60.aHa1098.xa(((float) Class316.aClass348_Sub51_3959
                .aClass239_Sub10_7232
                .method1764(-32350) * 0.1F
                + 0.7F) * Class160.aFloat2137);
        anInt9049++;
        Class60.aHa1098.ZA(Class119_Sub1.anInt4703, Class244.aFloat4626,
                Class361.aFloat4455,
                (float) (Class21.anInt325 << -1467252254),
                (float) (Class318_Sub1_Sub3_Sub1.anInt10023
                        << 1007991618),
                (float) (Class196.anInt2601 << -2056140414));
        Class60.aHa1098.method3653(Class158.aClass299_4938);
        if (bool != true)
            anIntArray9050 = null;
    }

    final String method2989(int i) {
        int i_12_ = 4 / ((i - -63) / 50);
        anInt9061++;
        return aString9058;
    }

    public static void method2990(byte i) {
        anIntArray9050 = null;
        if (i <= 101)
            anIntArray9050 = null;
    }
}
