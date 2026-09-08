/* Component337 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component337
/**
 * RENAMED from `Class281` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static StringCache aClass351_3644 = new StringCache(42, 8);
    static int anInt3645;
    static int anInt3646;
    static int anInt3647;
    static StringCache aClass351_3648 = new StringCache(55, 4);
    static Component184 aClass143_3649;
    static int anInt3650;

    static final void method2106(String string, int i) {
        anInt3645++;
        ParticleSystem class348_sub47 = DisplayModeManagerContainer351.method1478(true);
        class348_sub47.particleBuffer.writeByte(false, DisplayModeManagerContainer109.aClass29_2353.anInt400);
        class348_sub47.particleBuffer.writeShort((byte) 107, 0);
        int i_0_ = (class348_sub47.particleBuffer.offset);
        class348_sub47.particleBuffer.writeShort((byte) 107, 634);
        int[] is = Cp1252Decoder.method463(class348_sub47, false);
        int i_1_ = (class348_sub47.particleBuffer.offset);
        class348_sub47.particleBuffer.writeString((byte) -5, string);
        class348_sub47.particleBuffer.writeByte(false, ObjectDeserializer.languageId);
        class348_sub47.particleBuffer.offset += 7;
        class348_sub47.particleBuffer.xteaEncrypt(i_1_, true, is, class348_sub47.particleBuffer.offset);
        class348_sub47.particleBuffer.writeLengthShort(1809639944, -i_0_ + (class348_sub47.particleBuffer.offset));
        HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
        if (i <= 99) hashString(null, 70);
        AbstractShaderSub2.anInt7297 = 1;
        Component48.anInt4337 = -3;
        RequestProcessor.anInt2264 = 0;
        SpriteSub1.anInt8398 = 0;
    }

    public static void method2107(byte i) {
        aClass351_3648 = null;
        aClass143_3649 = null;
        aClass351_3644 = null;
        if (i != 77) method2107((byte) -107);
    }

    /** Jagex string hash used for archive name tables. */
    static final int hashString(String string, int i) {
        anInt3646++;
        int i_2_ = string.length();
        int i_3_ = 0;
        for (int i_4_ = 0; i_2_ > i_4_; i_4_++)
            i_3_ = (Component160.method3464(string.charAt(i_4_), false) + ((i_3_ << 5) - i_3_));
        if (i != -29286) return 0;
        return i_3_;
    }
}
