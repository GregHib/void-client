/* Class348_Sub23_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

final class Class348_Sub23_Sub2 extends Class348_Sub23 {
    private TheoraInfo aTheoraInfo9007;
    private boolean aBoolean9008;
    private int anInt9009;
    private TheoraComment aTheoraComment9010;
    static Class229 aClass229_9011 = new Class229();
    static int anInt9012;
    static int anInt9013;
    private boolean aBoolean9014;
    private double aDouble9015;
    private boolean aBoolean9016;
    static int anInt9017;
    private long aLong9018;
    private GranulePos aGranulePos9019;
    private Class105 aClass105_9020;
    static int anInt9021;
    static int anInt9022;
    static double aDouble9023;
    private Frame aFrame9024;
    static int anInt9025;
    static int anInt9026;
    private int anInt9027;
    private boolean aBoolean9028;
    static Class77 aClass77_9029;
    static int anInt9030;
    static Class153 aClass153_9031;
    private DecoderContext aDecoderContext9032;
    static Class45 aClass45_9033;
    static Class351 aClass351_9034 = new Class351(30, 4);
    private SetupInfo aSetupInfo9035 = new SetupInfo();
    static Class187 aClass187_9036;
    static int anInt9037;
    static boolean aBoolean9038 = false;
    static int anInt9039;

    public static void method2974(int i) {
        aClass351_9034 = null;
        if (i != 1)
            aClass229_9011 = null;
        aClass45_9033 = null;
        aClass229_9011 = null;
        aClass77_9029 = null;
        aClass153_9031 = null;
        aClass187_9036 = null;
    }

    final Class105 method2975(ha var_ha, int i) {
        anInt9026++;
        if (aFrame9024 == null)
            return null;
        if (!aBoolean9014 && aClass105_9020 != null)
            return aClass105_9020;
        aClass105_9020 = var_ha.method3711(aFrame9024.pixels, i, aFrame9024.a,
                aFrame9024.a, aFrame9024.b, false);
        aBoolean9014 = false;
        return aClass105_9020;
    }

    Class348_Sub23_Sub2(OggStreamState oggstreamstate) {
        super(oggstreamstate);
        aTheoraInfo9007 = new TheoraInfo();
        aTheoraComment9010 = new TheoraComment();
    }

    final void method2961(byte i) {
        if (aFrame9024 != null)
            aFrame9024.a();
        anInt9021++;
        if (aDecoderContext9032 != null) {
            aDecoderContext9032.a();
            aDecoderContext9032 = null;
        }
        if (i != 13)
            method2979(115);
        if (aGranulePos9019 != null) {
            aGranulePos9019.a();
            aGranulePos9019 = null;
        }
        aTheoraInfo9007.a();
        aTheoraComment9010.a();
        aSetupInfo9035.a();
    }

    final boolean method2976(int i) {
        anInt9012++;
        if (i != -1)
            aTheoraInfo9007 = null;
        return aBoolean9016;
    }

    final float method2977(int i) {
        anInt9022++;
        if (!aBoolean9016 || aTheoraInfo9007.b())
            return 0.0F;
        if (i != 0)
            anInt9027 = -65;
        return ((float) aTheoraInfo9007.fpsNumerator
                / (float) aTheoraInfo9007.fpsDenominator);
    }

    private final void method2978(int i, byte i_0_) {
        anInt9030++;
        anInt9009 = i;
        if (aBoolean9016) {
            if (anInt9009 > anInt9027)
                anInt9009 = anInt9027;
            if (anInt9009 < 0)
                anInt9009 = 0;
            aDecoderContext9032.setPostProcessingLevel(anInt9009);
        }
        if (i_0_ > -127)
            aClass105_9020 = null;
    }

    final long method2979(int i) {
        anInt9025++;
        if (i != 30)
            method2978(-126, (byte) -43);
        return aLong9018;
    }

    final double method2980(byte i) {
        anInt9013++;
        if (i != 100)
            method2974(102);
        return aDouble9015;
    }

    final void method2964(byte i, OggPacket oggpacket) {
        anInt9017++;
        if (i < -91) {
            if (aBoolean9016) {
                aLong9018 = Class62.method599(-102);
                int i_1_ = aDecoderContext9032.decodePacketIn(oggpacket,
                        aGranulePos9019);
                if (i_1_ < 0)
                    throw new IllegalStateException(String.valueOf(i_1_));
                aDecoderContext9032.granuleFrame(aGranulePos9019);
                aDouble9015 = aDecoderContext9032.granuleTime(aGranulePos9019);
                if (aBoolean9008) {
                    boolean bool = oggpacket.isKeyFrame() == 1;
                    if (bool)
                        aBoolean9008 = false;
                    else
                        return;
                }
                if (!aBoolean9028 || oggpacket.isKeyFrame() == 1) {
                    if ((aDecoderContext9032.decodeFrame(aFrame9024)
                            ^ 0xffffffff)
                            != -1)
                        throw new IllegalStateException(String.valueOf(i_1_));
                    aBoolean9014 = true;
                }
            } else {
                int i_2_ = aSetupInfo9035.decodeHeader(aTheoraInfo9007,
                        aTheoraComment9010,
                        oggpacket);
                if (i_2_ == 0) {
                    aBoolean9016 = true;
                    if (aTheoraInfo9007.frameWidth > 2048
                            || aTheoraInfo9007.frameHeight > 1024)
                        throw new IllegalStateException();
                    aDecoderContext9032
                            = new DecoderContext(aTheoraInfo9007, aSetupInfo9035);
                    aGranulePos9019 = new GranulePos();
                    aFrame9024 = new Frame(aTheoraInfo9007.frameWidth,
                            aTheoraInfo9007.frameHeight);
                    anInt9027
                            = aDecoderContext9032.getMaxPostProcessingLevel();
                    method2978(anInt9009, (byte) -128);
                } else if (i_2_ < 0)
                    throw new IllegalStateException(String.valueOf(i_2_));
            }
        }
    }
}
