/* Component377 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component377
/**
 * RENAMED from `Class48` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    int anInt847;
    static int anInt848;
    static int anInt849;
    static int anInt850;
    static short aShort851;
    static char[] aCharArray852 = {'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    int anInt853;
    int anInt854;
    static int anInt855;
    int anInt856;
    int anInt857 = 128;
    int anInt858;
    static int anInt859;
    static int[] anIntArray860;

    public static void method448(byte i) {
        aCharArray852 = null;
        anIntArray860 = null;
        int i_0_ = -50 % ((37 - i) / 40);
    }

    static final void method449(String string, String string_1_, boolean bool, int i, boolean bool_2_) {
        do {
            try {
                anInt849++;
                ParticleSystem class348_sub47 = DisplayModeManagerContainer351.method1478(true);
                class348_sub47.particleBuffer.writeByte(bool, DisplayModeManagerContainer109.aClass29_2348.anInt400);
                class348_sub47.particleBuffer.writeShort((byte) 107, 0);
                int i_3_ = (class348_sub47.particleBuffer.offset);
                class348_sub47.particleBuffer.writeShort((byte) 107, 634);
                int[] is = Cp1252Decoder.method463(class348_sub47, false);
                int i_4_ = (class348_sub47.particleBuffer.offset);
                class348_sub47.particleBuffer.writeString((byte) -5, string_1_);
                class348_sub47.particleBuffer.writeShort((byte) 107, Connection.affiliateId);
                class348_sub47.particleBuffer.writeString((byte) -5, string);
                class348_sub47.particleBuffer.writeLong(ModelStore.aLong4615, (byte) 104);
                class348_sub47.particleBuffer.writeByte(bool, ObjectDeserializer.languageId);
                class348_sub47.particleBuffer.writeByte(bool, (PacketReader.currentGameType.id));
                BufferCacheSub2.method4002((class348_sub47.particleBuffer), (byte) 55);
                String string_5_ = Component19.aString8605;
                class348_sub47.particleBuffer.writeByte(false, string_5_ == null ? 0 : 1);
                if (string_5_ != null) class348_sub47.particleBuffer.writeString((byte) -5, string_5_);
                class348_sub47.particleBuffer.writeByte(false, i);
                class348_sub47.particleBuffer.writeByte(false, !bool_2_ ? 0 : 1);
                class348_sub47.particleBuffer.offset += 7;
                class348_sub47.particleBuffer.xteaEncrypt(i_4_, true, is, (class348_sub47.particleBuffer.offset));
                class348_sub47.particleBuffer.writeLengthShort(1809639944, (class348_sub47.particleBuffer.offset + -i_3_));
                HashNodeSub14.enqueueOutboundPacket(2, class348_sub47);
                Component48.anInt4337 = -3;
                AbstractShaderSub2.anInt7297 = 1;
                RequestProcessor.anInt2264 = 0;
                SpriteSub1.anInt8398 = 0;
                if (i >= 13) break;
                Component301.aBoolean4127 = true;
                CookieManager.method2172(60);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("iq.D(" + (string != null ? "{...}" : "null") + ',' + (string_1_ != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + bool_2_ + ')'));
            }
            break;
        } while (false);
    }

    static final int method450(int i, String string, int i_6_) {
        if (i != -20188) return 88;
        anInt850++;
        return RadixText.parseIntRadix(-123, i_6_, true, string);
    }

    final void method451(Component377 class48_7_, byte i) {
        this.anInt857 = class48_7_.anInt857;
        this.anInt858 = class48_7_.anInt858;
        this.anInt856 = class48_7_.anInt856;
        this.anInt854 = class48_7_.anInt854;
        anInt855++;
        this.anInt847 = class48_7_.anInt847;
        this.anInt853 = class48_7_.anInt853;
        if (i != -110) method448((byte) -93);
    }

    final Component377 method452(boolean bool) {
        anInt848++;
        if (bool != true) method448((byte) -81);
        return new Component377(this.anInt858, this.anInt856, this.anInt857, this.anInt854, this.anInt847, this.anInt853);
    }

    Component377(int i) {
        this.anInt856 = 128;
        this.anInt858 = i;
    }

    private Component377(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        this.anInt856 = 128;
        this.anInt847 = i_11_;
        this.anInt854 = i_10_;
        this.anInt853 = i_12_;
        this.anInt858 = i;
        this.anInt856 = i_8_;
        this.anInt857 = i_9_;
    }

    static {
        aShort851 = (short) 32767;
        anInt859 = -1;
        anIntArray860 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
    }
}
