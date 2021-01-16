/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

import java.io.IOException;

abstract class Class55 {
    static int anInt978;
    static boolean aBoolean979;
    static int anInt980;
    private OggPage anOggPage981;
    static int anInt982;
    private boolean aBoolean983;
    static int anInt984 = 4;
    static int anInt985;
    static int anInt986;
    private final OggSyncState anOggSyncState987;
    static int anInt988;
    static int anInt989;
    static int anInt990;
    private boolean aBoolean991;
    static int anInt992;
    private final OggPacket anOggPacket993;
    static int anInt994;
    private byte[] aByteArray995;
    static int anInt996;
    static int anInt997;
    static int anInt998;
    private Class348_Sub23_Sub4 aClass348_Sub23_Sub4_999;
    static int anInt1000;
    private Class348_Sub23_Sub2 aClass348_Sub23_Sub2_1001;
    static int anInt1002;
    static int anInt1003;
    static int anInt1004;
    static int anInt1005;
    private boolean aBoolean1006;
    private boolean aBoolean1007;
    private Class348_Sub23_Sub1 aClass348_Sub23_Sub1_1008;
    private String aString1009;
    static float aFloat1010;
    private final Class356 aClass356_1011;

    private final void method504(int i) {
        if (i != 1999)
            aByteArray995 = null;
        anInt982++;
        for (Class348_Sub23 class348_sub23
             = (Class348_Sub23) aClass356_1011.method3484(0);
             class348_sub23 != null;
             class348_sub23 = (Class348_Sub23) aClass356_1011.method3482(0)) {
            if (class348_sub23 instanceof Class348_Sub23_Sub4) {
                Class348_Sub23_Sub4 class348_sub23_sub4
                        = (Class348_Sub23_Sub4) class348_sub23;
                while (class348_sub23_sub4.anInt6868 <= 8
                        || (method519(i ^ 0x7b2)
                        > (double) class348_sub23_sub4
                        .method2984((byte) 97))) {
                    if (class348_sub23_sub4
                            .anOggStreamState6869.packetOut(anOggPacket993)
                            != 1)
                        break;
                    class348_sub23_sub4.method2963(anOggPacket993, i + 14385);
                }
            }
        }
        method509(i + -2012, aString1009);
    }

    private final void method505(byte i) throws IOException {
        anInt996++;
        while (aClass348_Sub23_Sub2_1001
                .anOggStreamState6869.packetOut(anOggPacket993)
                != 1) {
            Class348_Sub23 class348_sub23 = method521(1);
            if (class348_sub23 == null) {
                if (aBoolean991)
                    method511(-2);
                return;
            } else {
                if (class348_sub23 == aClass348_Sub23_Sub4_999)
                    method504(1999);
            }
		}
        aClass348_Sub23_Sub2_1001.method2963(anOggPacket993, 16384);
        if (i < 58)
            anOggPage981 = null;
    }

    final Class348_Sub23_Sub2 method506(boolean bool) {
        anInt1002++;
        if (bool != false)
            return null;
        return aClass348_Sub23_Sub2_1001;
    }

    private final boolean method507(boolean bool) {
        if (bool != false)
            method511(-113);
        anInt986++;
        if (aClass348_Sub23_Sub1_1008 != null) {
			return !aClass348_Sub23_Sub2_1001.method2976(-1)
					|| method519(126)
					> aClass348_Sub23_Sub2_1001.method2980((byte) 100);
		}
        double d = aClass348_Sub23_Sub2_1001.method2977(0);
		return d == 0.0 || (double) Class62.method599(-74)
				>= 1000.0 / d + (double) aClass348_Sub23_Sub2_1001
				.method2979(30);
	}

    final void method508(int i) {
        anInt989++;
        if (!aBoolean1007) {
            Class348_Sub23 class348_sub23
                    = (Class348_Sub23) aClass356_1011.method3484(0);
            if (i != 1)
                aBoolean991 = true;
            for (/**/; class348_sub23 != null;
                     class348_sub23
                             = (Class348_Sub23) aClass356_1011.method3482(i ^ 0x1)) {
                class348_sub23.method2961((byte) 13);
                class348_sub23.anOggStreamState6869.a();
            }
            anOggPacket993.a();
            anOggPage981.a();
            anOggSyncState987.a();
            aBoolean1007 = true;
        }
    }

    final void method509(int i, String string) {
        anInt980++;
        aString1009 = string;
        if (aString1009 == null)
            aClass348_Sub23_Sub4_999 = null;
        else {
            if (i > -4)
                anInt984 = -61;
            if (aClass348_Sub23_Sub4_999 != null
                    && !aString1009
                    .equals(aClass348_Sub23_Sub4_999.method2986(52)))
                aClass348_Sub23_Sub4_999 = null;
            if (aClass348_Sub23_Sub4_999 == null) {
                for (Class348_Sub23 class348_sub23
                     = (Class348_Sub23) aClass356_1011.method3484(0);
                     class348_sub23 != null;
                     class348_sub23
                             = (Class348_Sub23) aClass356_1011.method3482(0)) {
                    if (class348_sub23 instanceof Class348_Sub23_Sub4) {
                        Class348_Sub23_Sub4 class348_sub23_sub4
                                = (Class348_Sub23_Sub4) class348_sub23;
                        if (aString1009
                                .equals(class348_sub23_sub4.method2986(41))) {
                            aClass348_Sub23_Sub4_999 = class348_sub23_sub4;
                            break;
                        }
                    }
                }
            }
        }
    }

    final boolean method510(byte i) {
        anInt1004++;
        int i_0_ = 65 / ((i - -74) / 47);
        if (!aBoolean1007 && !aBoolean991)
            return false;
		return aClass348_Sub23_Sub1_1008 == null
				|| aClass348_Sub23_Sub1_1008.method2969(-11020) <= 0;
	}

    private final void method511(int i) {
        anInt1003++;
        for (Class348_Sub23 class348_sub23
             = (Class348_Sub23) aClass356_1011.method3484(0);
             class348_sub23 != null;
             class348_sub23
                     = (Class348_Sub23) aClass356_1011.method3482(i + 2)) {
            if (class348_sub23 != aClass348_Sub23_Sub2_1001) {
                while (class348_sub23
                        .anOggStreamState6869.packetOut()
                        == 1)
                    class348_sub23.method2963(anOggPacket993, i ^ ~0x4001);
            }
        }
        if (aClass348_Sub23_Sub2_1001 != null) {
            if (i != -2)
                method518(null, (byte) 10);
            for (int i_1_ = 0; i_1_ < 10 && method507(false);
				 i_1_++) {
                if (aClass348_Sub23_Sub2_1001
						.anOggStreamState6869.packetOut() != 1) {
                    method508(1);
                    break;
                }
                aClass348_Sub23_Sub2_1001.method2963(anOggPacket993, 16384);
            }
        }
    }

    final Class348_Sub23_Sub1 method512(int i) {
        if (i != 0)
            method512(120);
        anInt1005++;
        return aClass348_Sub23_Sub1_1008;
    }

    final Class348_Sub23_Sub4 method513(int i) {
        anInt978++;
        if (i != 50)
            aClass348_Sub23_Sub1_1008 = null;
        return aClass348_Sub23_Sub4_999;
    }

    final void method514(byte i, boolean bool) {
        anInt985++;
        if (aClass348_Sub23_Sub1_1008 != null) {
            Class348_Sub16_Sub2 class348_sub16_sub2
                    = aClass348_Sub23_Sub1_1008.method2971(-96);
            if (class348_sub16_sub2 != null)
                class348_sub16_sub2.method2833(1, bool);
        }
        if (i <= 114)
            aBoolean991 = true;
        aBoolean1006 = !aBoolean1006;
    }

    static final void method515(int i, int i_2_, int i_3_, int i_4_, int i_5_,
                                int i_6_) {
        anInt990++;
        int i_7_ = 0;
        int i_8_ = i_4_;
        int i_9_ = i_5_ * i_5_;
        int i_10_ = i_4_ * i_4_;
        int i_11_ = i_10_ << 1237264353;
        int i_12_ = i_9_ << 2004530433;
        int i_13_ = -27 / ((38 - i_6_) / 62);
        int i_14_ = i_4_ << -1804115295;
        int i_15_ = i_11_ + i_9_ * (1 + -i_14_);
        int i_16_ = -(i_12_ * (i_14_ - 1)) + i_10_;
        int i_17_ = i_9_ << -1249481022;
        int i_18_ = i_10_ << -612028542;
        int i_19_ = (3 + (i_7_ << 1297663521)) * i_11_;
        int i_20_ = i_12_ * ((i_8_ << 341415297) - 3);
        int i_21_ = i_18_ * (i_7_ + 1);
        Class135_Sub2.method1156(-27, i_2_ + i_5_,
                Class17.anIntArrayArray255[i_3_],
                -i_5_ + i_2_, i);
        int i_22_ = i_17_ * (-1 + i_8_);
        while (i_8_ > 0) {
            if (i_15_ < 0) {
                while (i_15_ < 0) {
                    i_16_ += i_21_;
                    i_15_ += i_19_;
                    i_7_++;
                    i_21_ += i_18_;
                    i_19_ += i_18_;
                }
            }
            if (i_16_ < 0) {
                i_16_ += i_21_;
                i_15_ += i_19_;
                i_7_++;
                i_21_ += i_18_;
                i_19_ += i_18_;
            }
            i_16_ += -i_20_;
            i_15_ += -i_22_;
            i_22_ -= i_17_;
            i_20_ -= i_17_;
            int i_23_ = /*---*/i_8_ + i_3_;
            int i_24_ = i_3_ - -i_8_;
            int i_25_ = i_2_ - -i_7_;
            int i_26_ = i_2_ + -i_7_;
            Class135_Sub2.method1156(-27, i_25_,
                    Class17.anIntArrayArray255[i_23_], i_26_,
                    i);
            Class135_Sub2.method1156(-27, i_25_,
                    Class17.anIntArrayArray255[i_24_], i_26_,
                    i);
        }
    }

    abstract int method516(byte i, byte[] is) throws IOException;

    final void method517(int i) throws IOException {
        if (i == -2) {
            anInt988++;
            if (!aBoolean1006) {
                while (!aBoolean1007) {
                    Class348_Sub23 class348_sub23;
                    if (!aBoolean983) {
                        class348_sub23 = method521(1);
                        if (class348_sub23 == null) {
                            if (aBoolean991)
                                method511(i);
                            break;
                        }
                        if (class348_sub23 == null)
                            throw new IllegalStateException();
                        aBoolean983 = true;
                    } else
                        class348_sub23
                                = ((Class348_Sub23)
                                (aClass356_1011.method3480
                                        (anOggPage981.getSerialNumber(),
                                                -6008)));
                    if (aClass348_Sub23_Sub1_1008 == class348_sub23) {
                        if (aClass348_Sub23_Sub1_1008.method2969(-11020) >= 50)
                            break;
                        while (aClass348_Sub23_Sub1_1008
								.anOggStreamState6869
								.packetOut(anOggPacket993) == 1) {
                            aClass348_Sub23_Sub1_1008
                                    .method2963(anOggPacket993, i + 16386);
                            method504(1999);
                            if (aClass348_Sub23_Sub2_1001 != null) {
                                double d = aClass348_Sub23_Sub2_1001
                                        .method2980((byte) 100);
                                for (int i_27_ = 0;
                                     i_27_ < 10 && method507(false); i_27_++) {
                                    method505((byte) 98);
                                    if (aBoolean1007)
                                        return;
                                }
                                if (aClass348_Sub23_Sub2_1001
                                        .method2980((byte) 100)
                                        > d)
                                    return;
                            }
                            if (aClass348_Sub23_Sub1_1008.method2969(-11020) >= 50)
                                return;
                        }
                    } else if (!(class348_sub23
                            instanceof Class348_Sub23_Sub4)) {
                        if (class348_sub23 == aClass348_Sub23_Sub2_1001) {
                            if (aClass348_Sub23_Sub1_1008 == null
                                    && !aBoolean1006) {
                                for (int i_28_ = 0;
                                     i_28_ < 10 && method507(false); i_28_++) {
                                    method505((byte) 80);
                                    if (aBoolean1007)
                                        break;
                                }
                                break;
                            }
                        } else {
                            while (class348_sub23
									.anOggStreamState6869
									.packetOut(anOggPacket993) == 1) {
                                if ((class348_sub23
										.anInt6868) == 1
                                        && (class348_sub23
                                        instanceof Class348_Sub23_Sub4))
                                    method509(-22, aString1009);
                                class348_sub23.method2963(anOggPacket993,
                                        16384);
                            }
                        }
                    } else
                        method504(1999);
                    aBoolean983 = false;
                }
            }
        }
    }

    static final void method518(String string, byte i) {
        System.exit(1);
        anInt997++;
        int i_29_ = 97 % ((-66 - i) / 54);
    }

    final double method519(int i) {
        int i_30_ = 6 % ((i - 89) / 35);
        anInt992++;
        if (aClass348_Sub23_Sub1_1008 != null)
            return aClass348_Sub23_Sub1_1008.method2973((byte) 123);
        if (aClass348_Sub23_Sub2_1001 != null)
            return aClass348_Sub23_Sub2_1001.method2980((byte) 100);
        return 0.0;
    }

    static final boolean method520(Interface10 interface10, int i) {
        anInt1000++;
        Class51 class51 = Class348_Sub40_Sub12.aClass263_9195
                .method2005(0, interface10.method42(-94));
        if (class51.anInt875 == -1)
            return true;
        Class218 class218
                = Class2.aClass141_117.method1173((byte) 31,
                class51.anInt875);
        if (i == class218.anInt2853)
            return true;
        return class218.method1593(106);
    }

    private final Class348_Sub23 method521(int i) throws IOException {
        anInt998++;
        if (aBoolean1007)
            throw new IllegalStateException();
        if (aBoolean991)
            return null;
        while (anOggSyncState987.pageOut(anOggPage981) <= 0) {
            int i_31_ = method516((byte) 21, aByteArray995);
            if (i_31_ == -1) {
                aBoolean991 = true;
                return null;
            }
            if (i_31_ == 0)
                return null;
            if (!anOggSyncState987.write(aByteArray995, i_31_))
                throw new RuntimeException("");
        }
        int i_32_ = anOggPage981.getSerialNumber();
        if (i != 1)
            aClass348_Sub23_Sub1_1008 = null;
        if (!anOggPage981.isBOS()) {
            Class348_Sub23 class348_sub23
                    = ((Class348_Sub23)
                    aClass356_1011.method3480(i_32_, -6008));
            if (!class348_sub23.anOggStreamState6869
                    .pageIn(anOggPage981))
                throw new IllegalStateException();
            return class348_sub23;
        }
        OggStreamState oggstreamstate = new OggStreamState(i_32_);
        if (!oggstreamstate.pageIn(anOggPage981))
            throw new IllegalStateException();
        if (oggstreamstate.packetPeek(anOggPacket993) != 1)
            throw new IllegalStateException();
        Class348_Sub23 class348_sub23;
        if (aClass348_Sub23_Sub2_1001 == null && anOggPacket993.isTheora()) {
            aClass348_Sub23_Sub2_1001
                    = new Class348_Sub23_Sub2(oggstreamstate);
            class348_sub23 = aClass348_Sub23_Sub2_1001;
        } else if (aClass348_Sub23_Sub1_1008 == null
                && anOggPacket993.isVorbis()) {
            aClass348_Sub23_Sub1_1008
                    = new Class348_Sub23_Sub1(oggstreamstate);
            class348_sub23 = aClass348_Sub23_Sub1_1008;
        } else {
            byte[] is = anOggPacket993.getData();
            StringBuffer stringbuffer = new StringBuffer();
            for (int i_33_ = 1; is.length > i_33_; i_33_++) {
                if (!Character.isLetterOrDigit((char) is[i_33_]))
                    break;
                stringbuffer.append((char) is[i_33_]);
            }
            String string = stringbuffer.toString();
            if (string.equals("kate"))
                class348_sub23 = new Class348_Sub23_Sub4(oggstreamstate);
            else
                class348_sub23 = new Class348_Sub23_Sub3(oggstreamstate);
        }
        aClass356_1011.method3483((byte) 92, i_32_, class348_sub23);
        return class348_sub23;
    }

    Class55(int i) {
        if (!Class348_Sub40_Sub19.method3098(-30282, "jagtheora"))
            throw new RuntimeException("Failed to load jagtheora library");
        aByteArray995 = new byte[i];
        anOggSyncState987 = new OggSyncState();
        anOggPage981 = new OggPage();
        anOggPacket993 = new OggPacket();
        aClass356_1011 = new Class356(8);
    }

    static {
        aBoolean979 = false;
    }
}
