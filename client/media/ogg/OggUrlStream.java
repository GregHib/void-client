/* OggUrlStream - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub23_Sub1` (JODE-obfuscated).
 * URL-backed Ogg audio stream. extends OggStream; reads Ogg data from a java.net.URL (method2967 builds the stream from a DisplayModeManagerContainer370 resource).
 */

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;

import java.net.URL;

final class OggUrlStream extends OggStream {
    static int anInt8989;
    static int anInt8990;
    static int anInt8991;
    static ReflectionInvoker aClass297_8992;
    private DSPState aDSPState8993;
    private ImageTagText aClass163_8994;
    private NodeSub16Sub2 aClass348_Sub16_Sub2_8995;
    static byte[][] aByteArrayArray8996;
    static int anInt8997;
    static int anInt8998;
    static int anInt8999;
    private VorbisBlock aVorbisBlock9000;
    private int anInt9001;
    private VorbisComment aVorbisComment9002;
    static int anInt9003;
    static int anInt9004;
    private double aDouble9005;
    private final VorbisInfo aVorbisInfo9006 = new VorbisInfo();

    static final ComponentDownloader method2967(int i, DisplayModeManagerContainer370 class64, int i_0_, int i_1_, int i_2_) {
        anInt8991++;
        if (i_2_ != 2) aByteArrayArray8996 = null;
        if (class64 == null) return null;
        ComponentDownloader class30 = new ComponentDownloader(i, i_1_, i_0_, class64.ShaderImpl(), class64.V(), class64.RA(), class64.fa(), class64.EA(), class64.HA(), class64.G());
        return class30;
    }

    OggUrlStream(OggStreamState oggstreamstate) {
        super(oggstreamstate);
        aVorbisComment9002 = new VorbisComment();
    }

    public static void method2968(byte i) {
        aClass297_8992 = null;
        aByteArrayArray8996 = null;
        if (i > -114) method2968((byte) -12);
    }

    final int method2969(int i) {
        if (i != -11020) aVorbisComment9002 = null;
        anInt8989++;
        if (aClass348_Sub16_Sub2_8995 != null) return aClass348_Sub16_Sub2_8995.method2829(i + 10949);
        return 0;
    }

    static final DisplayModeManagerContainer368 method2970(int i, Buffer class348_sub49) {
        anInt8998++;
        if (i != 2) method2972(null, -114, 15);
        return new DisplayModeManagerContainer368(class348_sub49.readShort(13638), class348_sub49.readShort(i + 13636), class348_sub49.readShort(13638), class348_sub49.readShort(i ^ 0x3544), class348_sub49.readShort(13638), class348_sub49.readShort(i + 13636), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255));
    }

    final NodeSub16Sub2 method2971(int i) {
        if (i > -6) return null;
        anInt8997++;
        return aClass348_Sub16_Sub2_8995;
    }

    static final boolean method2972(String string, int i, int i_3_) {
        anInt9004++;
        if (aClass297_8992.signed) {
            Component223.aClass161_125 = new DisplayModeManagerContainer254();
            Component223.aClass161_125.anInt2143 = i;
            Component223.aClass161_125.aString2147 = string;
            if (DisplayModeManagerContainer345.aClass364_165 != Component326.LIVE) {
                Component223.aClass161_125.anInt2138 = 50000 - -Component223.aClass161_125.anInt2143;
                Component223.aClass161_125.anInt2148 = 40000 - -Component223.aClass161_125.anInt2143;
            }
            if (i < Component304.aClass110_Sub1Array1146.length && Component304.aClass110_Sub1Array1146[i] != null) Component111.anInt3234 = (Component304.aClass110_Sub1Array1146[i].anInt1708);
            return true;
        }
        String string_4_ = "";
        if (Component326.LIVE != DisplayModeManagerContainer345.aClass364_165) string_4_ = ":" + (7000 + i);
        String string_5_ = "";
        if (Component205.settingsCookie != null) string_5_ = "/p=" + Component205.settingsCookie;
        String string_6_ = ("http://" + string + string_4_ + "/l=" + ObjectDeserializer.languageId + "/a=" + Connection.affiliateId + string_5_ + "/j" + (!Component156.aBoolean3697 ? "0" : "1") + ",o" + (NodeSub37.aBoolean6997 ? "1" : "0") + ",a2");
        try {
            NpcComposition.aClient1367.getAppletContext().showDocument(new URL(string_6_), "_self");
            if (i_3_ >= -17) aClass297_8992 = null;
        } catch (Exception exception) {
            return false;
        }
        return true;
    }

    final double method2973(byte i) {
        anInt8999++;
        double d = aDouble9005;
        if (i != 123) return 0.20418061173976032;
        if (aClass348_Sub16_Sub2_8995 != null) {
            d = aClass348_Sub16_Sub2_8995.method2837(i ^ ~0x5599);
            if (d < 0.0) d = aDouble9005;
        }
        return (double) -(256.0F / (float) Component231.sampleRate) + d;
    }

    final void shutdown(byte i) {
        if (aVorbisBlock9000 != null) aVorbisBlock9000.a();
        anInt9003++;
        if (aDSPState8993 != null) aDSPState8993.a();
        aVorbisComment9002.a();
        if (i != 13) method2967(-99, null, -83, -13, 63);
        aVorbisInfo9006.a();
        if (aClass348_Sub16_Sub2_8995 != null) aClass348_Sub16_Sub2_8995.method2836(-1);
    }

    final void handlePacket(byte i, OggPacket oggpacket) {
        anInt8990++;
        if (this.anInt6868 < 3) {
            int i_7_ = aVorbisInfo9006.headerIn(aVorbisComment9002, oggpacket);
            if (i_7_ < 0) throw new IllegalStateException(String.valueOf(i_7_));
            if (this.anInt6868 == 2) {
                if (aVorbisInfo9006.channels > 2 || aVorbisInfo9006.channels < 1) throw new RuntimeException(String.valueOf(aVorbisInfo9006.channels));
                aDSPState8993 = new DSPState(aVorbisInfo9006);
                aVorbisBlock9000 = new VorbisBlock(aDSPState8993);
                aClass163_8994 = new ImageTagText(aVorbisInfo9006.rate, Component231.sampleRate);
                aClass348_Sub16_Sub2_8995 = new NodeSub16Sub2(aVorbisInfo9006.channels);
            }
        } else {
            if (aVorbisBlock9000.synthesis(oggpacket) == 0) aDSPState8993.blockIn(aVorbisBlock9000);
            float[][] fs = aDSPState8993.pcmOut(aVorbisInfo9006.channels);
            aDouble9005 = aDSPState8993.granuleTime();
            if (aDouble9005 == -1.0) aDouble9005 = (float) anInt9001 / (float) aVorbisInfo9006.rate;
            aDSPState8993.read(fs[0].length);
            anInt9001 += fs[0].length;
            HashNodeSub4 class348_sub42_sub4 = aClass348_Sub16_Sub2_8995.method2838(fs[0].length, aDouble9005, 1401320384);
            InputHandler.quantizeFloatsToShorts(16383, (class348_sub42_sub4.aShortArrayArray9518), fs);
            for (int i_8_ = 0; i_8_ < aVorbisInfo9006.channels; i_8_++)
                class348_sub42_sub4.aShortArrayArray9518[i_8_] = aClass163_8994.method1268(-56, (class348_sub42_sub4.aShortArrayArray9518[i_8_]));
            aClass348_Sub16_Sub2_8995.method2835(class348_sub42_sub4, 30700);
        }
        if (i > -91) shutdown((byte) -106);
    }
}
