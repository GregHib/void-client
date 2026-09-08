/* Component352 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component352
/**
 * RENAMED from `Class44` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt621;
    static int anInt622;
    static int anInt623;
    static DisplayModeManagerContainer204 aClass101_624;
    /** CP1252 mapping for bytes 0x80–0x9F (nul = unmapped → '?'). */
    static char[] cp1252HighChars = {'\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\0', '\u017e', '\u0178'};

    static final int method384(int i, int i_0_, int i_1_) {
        anInt623++;
        int i_2_ = (Component296.method1115(i - 1, i_1_ - 1, (byte) 91) - (-Component296.method1115(i - -1, i_1_ + -1, (byte) -53) + -Component296.method1115(-1 + i, 1 + i_1_, (byte) -90)) + Component296.method1115(i - -1, i_1_ - -1, (byte) -82));
        int i_3_ = (Component296.method1115(i + -1, i_1_, (byte) -118) + (Component296.method1115(i - i_0_, i_1_, (byte) 118) - (-Component296.method1115(i, -1 + i_1_, (byte) 109) + -Component296.method1115(i, 1 + i_1_, (byte) 89))));
        int i_4_ = Component296.method1115(i, i_1_, (byte) -59);
        return i_4_ / 4 + i_3_ / 8 + i_2_ / 16;
    }

    static final void method385(boolean bool, Component251 class237_sub1, byte[][] is) {
        do {
            try {
                anInt622++;
                int[] is_5_ = {-1, 0, 0, 0, 0};
                for (int i = 0; i < class237_sub1.anInt3130; i++) {
                    Component381.method3570(false);
                    for (int i_6_ = 0; (AbstractShaderSub4.anInt7319 >> 3 > i_6_); i_6_++) {
                        for (int i_7_ = 0; i_7_ < ParametricDefinition.anInt9109 >> 3; i_7_++) {
                            int i_8_ = (Component240.anIntArrayArrayArray1116[i][i_6_][i_7_]);
                            if (i_8_ != -1) {
                                int i_9_ = i_8_ >> 24 & 0x3;
                                if (!class237_sub1.aBoolean3109 || i_9_ == 0) {
                                    int i_10_ = (i_8_ & 0x6) >> 1;
                                    int i_11_ = (i_8_ & 0xffd064) >> 14;
                                    int i_12_ = i_8_ >> 3 & 0x7ff;
                                    int i_13_ = ((i_11_ / 8 << 8) - -(i_12_ / 8));
                                    for (int i_14_ = 0; i_14_ < (OggStreamReader.anIntArray9042).length; i_14_++) {
                                        if ((i_13_ == (OggStreamReader.anIntArray9042[i_14_])) && is[i_14_] != null) {
                                            Buffer class348_sub49 = new Buffer(is[i_14_]);
                                            class237_sub1.method1684(i_6_ * 8, i, -1, class348_sub49, i_12_, 8 * i_7_, i_11_, (NodeSub45.aClass361Array7108), i_10_, i_9_);
                                            class237_sub1.method1696(class348_sub49, false, i_12_, i_11_, 8 * i_6_, i, i_10_, 8 * i_7_, NodeSub8.toolkit, is_5_[0] != -1 ? null : is_5_, i_9_);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                for (int i = 0; class237_sub1.anInt3130 > i; i++) {
                    Component381.method3570(false);
                    for (int i_15_ = 0; (i_15_ < AbstractShaderSub4.anInt7319 >> 3); i_15_++) {
                        for (int i_16_ = 0; (i_16_ < ParametricDefinition.anInt9109 >> 3); i_16_++) {
                            int i_17_ = (Component240.anIntArrayArrayArray1116[i][i_15_][i_16_]);
                            if (i_17_ == -1) class237_sub1.method1678(i_15_ * 8, 8, i_16_ * 8, -100, 8, i);
                        }
                    }
                }
                if (is_5_[0] != -1) {
                    Component293.aClass305_3304 = ComponentDownloader.aClass84_413.method823(is_5_[2], is_5_[3], is_5_[1], -109, (Component132.aClass25_1813), is_5_[0]);
                    Component316.anInt2481 = is_5_[4];
                }
                if (bool == false) break;
                method387(26);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("ik.D(" + bool + ',' + (class237_sub1 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    static final void method386(byte i) {
        anInt621++;
        if (i != -106) method386((byte) 21);
        Component279.aClass60_225.purgeSoftReferences(i + 9);
    }

    public static void method387(int i) {
        aClass101_624 = null;
        cp1252HighChars = null;
        if (i < 33) cp1252HighChars = null;
    }

    static final void method388(int i, int i_18_, int i_19_, Component203 class318_sub1_sub5, Component203 class318_sub1_sub5_20_) {
        Component186 class357 = NodeSub46.method3321(i, i_18_, i_19_);
        if (class357 != null) {
            class357.aClass318_Sub1_Sub5_4395 = class318_sub1_sub5;
            class357.aClass318_Sub1_Sub5_4407 = class318_sub1_sub5_20_;
            int i_21_ = ShaderSub1.aSArray5191 == Component9.aSArray4142 ? 1 : 0;
            if (class318_sub1_sub5.method2376(-62)) {
                if (class318_sub1_sub5.method2377((byte) 122)) {
                    class318_sub1_sub5.aClass318_Sub1_6379 = AudioMixer.aClass318_Sub1Array3226[i_21_];
                    AudioMixer.aClass318_Sub1Array3226[i_21_] = class318_sub1_sub5;
                } else {
                    class318_sub1_sub5.aClass318_Sub1_6379 = Node.aClass318_Sub1Array4293[i_21_];
                    Node.aClass318_Sub1Array4293[i_21_] = class318_sub1_sub5;
                    NodeSub16Sub2.aBoolean8870 = true;
                }
            } else {
                class318_sub1_sub5.aClass318_Sub1_6379 = Component95.aClass318_Sub1Array1754[i_21_];
                Component95.aClass318_Sub1Array1754[i_21_] = class318_sub1_sub5;
            }
            if (class318_sub1_sub5_20_ != null) {
                if (class318_sub1_sub5_20_.method2376(-110)) {
                    if (class318_sub1_sub5_20_.method2377((byte) 122)) {
                        class318_sub1_sub5_20_.aClass318_Sub1_6379 = AudioMixer.aClass318_Sub1Array3226[i_21_];
                        AudioMixer.aClass318_Sub1Array3226[i_21_] = class318_sub1_sub5_20_;
                    } else {
                        class318_sub1_sub5_20_.aClass318_Sub1_6379 = Node.aClass318_Sub1Array4293[i_21_];
                        Node.aClass318_Sub1Array4293[i_21_] = class318_sub1_sub5_20_;
                        NodeSub16Sub2.aBoolean8870 = true;
                    }
                } else {
                    class318_sub1_sub5_20_.aClass318_Sub1_6379 = Component95.aClass318_Sub1Array1754[i_21_];
                    Component95.aClass318_Sub1Array1754[i_21_] = class318_sub1_sub5_20_;
                }
            }
        }
    }
}
