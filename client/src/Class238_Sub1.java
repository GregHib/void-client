/* Class238_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.net.Socket;

final class Class238_Sub1 extends Class238 {
    static int anInt5828;
    static int anInt5829;
    static int anInt5830;
    static int anInt5831;
    static int anInt5832 = -1;
    static int anInt5833;
    private Class376 aClass376_5834;
    static int anInt5835;
    private final Socket aSocket5836;
    private final Class208 aClass208_5837;
    static int anInt5838;
    static int anInt5839;
    static boolean aBoolean5840 = true;

    static final void method1707(int i) {
        if (i != 26469) method1708(20, 93, 118, 24, (byte) -1, null);
        Class322.aClass308_4036.method2303(true);
        anInt5829++;
    }

    final void method1706(int i, int i_0_, int i_1_, byte[] is) throws IOException {
        anInt5833++;
        aClass208_5837.method1528((byte) 5, i_1_, i, is);
        if (i_0_ < 89) method1708(-99, 31, -13, 83, (byte) 112, null);
    }

    final void method1702(int i) {
        anInt5828++;
        aClass376_5834.method3618(0);
        int i_2_ = 29 / ((-25 - i) / 38);
        aClass208_5837.method1527(-21179);
    }

    static final void method1708(int i, int i_3_, int i_4_, int i_5_, byte i_6_, Class348_Sub9 class348_sub9) {
        anInt5830++;
        if (class348_sub9.anInt6685 != -1 || class348_sub9.anIntArray6697 != null) {
            int i_7_ = 0;
            int i_8_ = ((class348_sub9.anInt6677 * Class316.aClass348_Sub51_3959.aClass239_Sub26_7234.method1838(-32350)) >> 8);
            if (class348_sub9.anInt6698 >= i_3_) {
                if (class348_sub9.anInt6678 > i_3_) i_7_ += -i_3_ + class348_sub9.anInt6678;
            } else i_7_ += -class348_sub9.anInt6698 + i_3_;
            if (i_5_ <= class348_sub9.anInt6687) {
                if (class348_sub9.anInt6689 > i_5_) i_7_ += -i_5_ + class348_sub9.anInt6689;
            } else i_7_ += -class348_sub9.anInt6687 + i_5_;
            if (class348_sub9.anInt6694 == 0 || (-256 + i_7_ > class348_sub9.anInt6694) || Class316.aClass348_Sub51_3959.aClass239_Sub26_7234.method1838(-32350) == 0 || class348_sub9.anInt6693 != i_4_) {
                if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880(class348_sub9.aClass348_Sub16_Sub5_6676);
                    class348_sub9.aClass348_Sub19_Sub1_6686 = null;
                    class348_sub9.aClass348_Sub16_Sub5_6676 = null;
                    class348_sub9.aClass348_Sub10_6688 = null;
                }
                if (class348_sub9.aClass348_Sub16_Sub5_6673 != null) {
                    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880(class348_sub9.aClass348_Sub16_Sub5_6673);
                    class348_sub9.aClass348_Sub16_Sub5_6673 = null;
                    class348_sub9.aClass348_Sub10_6683 = null;
                    class348_sub9.aClass348_Sub19_Sub1_6692 = null;
                }
            } else {
                i_7_ -= 256;
                if (i_7_ < 0) i_7_ = 0;
                int i_9_ = ((class348_sub9.anInt6694 + -i_7_) * i_8_ / class348_sub9.anInt6694);
                Class132.aPlayer_1907.method2436((byte) 100);
                if (i_6_ == -78) {
                    int i_10_ = 8192;
                    int i_11_ = (-i_3_ + ((class348_sub9.anInt6678 + class348_sub9.anInt6698) / 2));
                    int i_12_ = (-i_5_ + ((class348_sub9.anInt6687 - -class348_sub9.anInt6689) / 2));
                    if (i_11_ != 0 || i_12_ != 0) {
                        int i_13_ = ((-Class5.anInt4638 + -(int) (Math.atan2(i_11_, i_12_) * 2607.5945876176133) + -4096) & 0x3fff);
                        if (i_13_ > 8192) i_13_ = 16384 - i_13_;
                        int i_14_;
                        if (i_7_ <= 0) i_14_ = 8192;
                        else if (i_7_ < 4096) i_14_ = 8192 + 8192 * i_7_ / 4096;
                        else i_14_ = 16384;
                        i_10_ = ((16384 - i_14_ >> 1) + i_14_ * i_13_ / 8192);
                    }
                    if ((class348_sub9.aClass348_Sub16_Sub5_6676) != null) {
                        class348_sub9.aClass348_Sub16_Sub5_6676.method2915(i_9_);
                        class348_sub9.aClass348_Sub16_Sub5_6676.method2909(i_10_);
                    } else if (class348_sub9.anInt6685 >= 0) {
                        int i_15_ = ((class348_sub9.anInt6681 == 256 && (class348_sub9.anInt6696 == 256)) ? 256 : (Class299_Sub1.method2257(class348_sub9.anInt6681, class348_sub9.anInt6696, (byte) -120)));
                        if (class348_sub9.aBoolean6674) {
                            if ((class348_sub9.aClass348_Sub10_6688) == null) class348_sub9.aClass348_Sub10_6688 = (Class348_Sub10.method2793(Class239_Sub4.MIDI_INSTRUMENTS, (class348_sub9.anInt6685)));
                            if ((class348_sub9.aClass348_Sub10_6688) != null) {
                                if ((class348_sub9.aClass348_Sub19_Sub1_6686) == null) class348_sub9.aClass348_Sub19_Sub1_6686 = class348_sub9.aClass348_Sub10_6688.method2791(new int[]{22050});
                                if ((class348_sub9.aClass348_Sub19_Sub1_6686) != null) {
                                    Class348_Sub16_Sub5 class348_sub16_sub5 = (Class348_Sub16_Sub5.method2911((class348_sub9.aClass348_Sub19_Sub1_6686), i_15_, i_9_ << 6, i_10_));
                                    class348_sub16_sub5.method2917(-1);
                                    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2883(class348_sub16_sub5);
                                    class348_sub9.aClass348_Sub16_Sub5_6676 = class348_sub16_sub5;
                                }
                            }
                        } else {
                            Class317 class317 = Class317.method2372(Class129.SOUND_EFFECTS, (class348_sub9.anInt6685), 0);
                            if (class317 != null) {
                                Class348_Sub19_Sub1 class348_sub19_sub1 = class317.method2369().method2944(Class57.aClass163_1050);
                                Class348_Sub16_Sub5 class348_sub16_sub5 = (Class348_Sub16_Sub5.method2911(class348_sub19_sub1, i_15_, i_9_ << 6, i_10_));
                                class348_sub16_sub5.method2917(-1);
                                Class348_Sub43.aClass348_Sub16_Sub4_7065.method2883(class348_sub16_sub5);
                                class348_sub9.aClass348_Sub16_Sub5_6676 = class348_sub16_sub5;
                            }
                        }
                    }
                    do {
                        if ((class348_sub9.aClass348_Sub16_Sub5_6673) == null) {
                            if ((class348_sub9.anIntArray6697 != null) && (class348_sub9.anInt6670 -= i) <= 0) {
                                int i_16_ = (((class348_sub9.anInt6681) == 256 && (class348_sub9.anInt6696) == 256) ? 256 : ((class348_sub9.anInt6696) + (int) (Math.random() * (double) (-(class348_sub9.anInt6696) + (class348_sub9.anInt6681)))));
                                if (class348_sub9.aBoolean6699) {
                                    if ((class348_sub9.aClass348_Sub10_6683) == null) {
                                        int i_17_ = (int) ((double) (class348_sub9.anIntArray6697).length * Math.random());
                                        class348_sub9.aClass348_Sub10_6683 = (Class348_Sub10.method2793(Class239_Sub4.MIDI_INSTRUMENTS, (class348_sub9.anIntArray6697[i_17_])));
                                    }
                                    if ((class348_sub9.aClass348_Sub10_6683) != null) {
                                        if ((class348_sub9.aClass348_Sub19_Sub1_6692) == null) class348_sub9.aClass348_Sub19_Sub1_6692 = (class348_sub9.aClass348_Sub10_6683.method2791(new int[]{22050}));
                                        if ((class348_sub9.aClass348_Sub19_Sub1_6692) != null) {
                                            Class348_Sub16_Sub5 class348_sub16_sub5 = (Class348_Sub16_Sub5.method2911((class348_sub9.aClass348_Sub19_Sub1_6692), i_16_, i_9_ << 6, i_10_));
                                            class348_sub16_sub5.method2917(0);
                                            Class348_Sub43.aClass348_Sub16_Sub4_7065.method2883(class348_sub16_sub5);
                                            class348_sub9.aClass348_Sub16_Sub5_6673 = class348_sub16_sub5;
                                            class348_sub9.anInt6670 = ((int) ((double) ((class348_sub9.anInt6668) - (class348_sub9.anInt6680)) * Math.random()) + (class348_sub9.anInt6680));
                                        }
                                    }
                                } else {
                                    int i_18_ = (int) (Math.random() * (double) (class348_sub9.anIntArray6697).length);
                                    Class317 class317 = Class317.method2372((Class129.SOUND_EFFECTS), (class348_sub9.anIntArray6697[i_18_]), 0);
                                    if (class317 == null) break;
                                    Class348_Sub19_Sub1 class348_sub19_sub1 = (class317.method2369().method2944(Class57.aClass163_1050));
                                    Class348_Sub16_Sub5 class348_sub16_sub5 = (Class348_Sub16_Sub5.method2911(class348_sub19_sub1, i_16_, i_9_ << 6, i_10_));
                                    class348_sub16_sub5.method2917(0);
                                    Class348_Sub43.aClass348_Sub16_Sub4_7065.method2883(class348_sub16_sub5);
                                    class348_sub9.anInt6670 = ((int) ((double) (-(class348_sub9.anInt6680) + (class348_sub9.anInt6668)) * Math.random()) + (class348_sub9.anInt6680));
                                    class348_sub9.aClass348_Sub16_Sub5_6673 = class348_sub16_sub5;
                                }
                                break;
                            }
                        } else {
                            class348_sub9.aClass348_Sub16_Sub5_6673.method2915(i_9_);
                            class348_sub9.aClass348_Sub16_Sub5_6673.method2909(i_10_);
                            if (!class348_sub9.aClass348_Sub16_Sub5_6673.method2712((byte) 4)) {
                                class348_sub9.aClass348_Sub10_6683 = null;
                                class348_sub9.aClass348_Sub19_Sub1_6692 = null;
                                class348_sub9.aClass348_Sub16_Sub5_6673 = null;
                            }
                        }
                    } while (false);
                }
            }
        }
    }

    final void method1700(byte i) {
        anInt5839++;
        try {
            aSocket5836.close();
        } catch (IOException ioexception) {
            /* empty */
        }
        aClass376_5834.method3615(15984);
        if (i == 36) aClass208_5837.method1526((byte) -99);
    }

    final int method1701(int i, int i_19_, byte i_20_, byte[] is) throws IOException {
        int i_21_ = 84 / ((-56 - i_20_) / 47);
        anInt5831++;
        return aClass376_5834.method3617(i, i_19_, 0, is);
    }

    final boolean method1705(int i, int i_22_) throws IOException {
        if (i_22_ <= 91) aClass376_5834 = null;
        anInt5838++;
        return aClass376_5834.method3619(i, false);
    }

    Class238_Sub1(Socket socket, int i) throws IOException {
        aSocket5836 = socket;
        aSocket5836.setSoTimeout(30000);
        aSocket5836.setTcpNoDelay(true);
        aClass376_5834 = new Class376(aSocket5836.getInputStream(), i);
        aClass208_5837 = new Class208(aSocket5836.getOutputStream(), i);
    }

    protected final void finalize() {
        anInt5835++;
        method1700((byte) 36);
    }
}
