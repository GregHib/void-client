/* ShaderProgramSub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ShaderProgramSub2
/**
 * RENAMED from `Class286_Sub2` (JODE-obfuscated).
 * Evidence: subclass of ShaderProgram (hierarchy)
 */ extends ShaderProgram {
    static int anInt6203;
    static int anInt6204;
    /** Previous names (for rename updates in the friend packet). */
    static String[] friendFormerNames = new String[200];
    static int anInt6206;
    static int anInt6207;
    static int anInt6208;
    static int anInt6209;
    static int anInt6210;
    static int anInt6211;
    static int anInt6212;
    static int anInt6213;

    final void method2133(int i) {
        if (i < -75) {
            this.aHa_Sub2_3684.getIntegerv(false, (byte) -61);
            anInt6211++;
        }
    }

    /**
     * Push a line into the game chatbox (type 5 = filterable game message).
     * Used by Void overlays ({@link JoystickAlias}, {@link DefaultClickSwapper}) and
     * stock packets / friend login tips.
     *
     * @param string   optional speaker / channel prefix (often empty)
     * @param i        chat type (5 = game)
     * @param i_0_     opaque anti-deob byte
     * @param i_1_     world / filter id (0 for local tips)
     * @param string_2_ message body
     * @param string_3_ optional clan / display fragment
     * @param string_4_ optional second name fragment
     */
    static final void addChatMessage(String string, int i, byte i_0_, int i_1_, String string_2_, String string_3_, String string_4_) {
        do {
            try {
                DisplayModeManagerContainer174.method2477(string, string_2_, (byte) -110, -1, string_3_, null, i, i_1_, string_4_);
                anInt6203++;
                if (i_0_ < -86) break;
                friendFormerNames = null;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("di.G(" + (string != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (string_2_ != null ? "{...}" : "null") + ',' + (string_3_ != null ? "{...}" : "null") + ',' + (string_4_ != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    ShaderProgramSub2(GlToolkitSub2 var_ha_Sub2) {
        super(var_ha_Sub2);
    }

    static final void method2145(int i) {
        anInt6210++;
        Component63.anInt4494++;
        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component210.aClass351_5288, DisplayModeManagerContainer64.aClass77_9029, -124);
        class348_sub47.particleBuffer.writeByte(false, MenuEntry.getWindowMode(-96));
        class348_sub47.particleBuffer.writeShort((byte) 107, Component236.canvasWidth);
        class348_sub47.particleBuffer.writeShort((byte) 107, PacketReader.canvasHeight);
        if (i != -24498) friendFormerNames = null;
        class348_sub47.particleBuffer.writeByte(false, Component192.preferences.aClass239_Sub20_7248.method1808(-32350));
        HashNodeSub14.enqueueOutboundPacket(-101, class348_sub47);
    }

    final void method2140(AbstractGlTexture class258, byte i, int i_5_) {
        anInt6206++;
        this.aHa_Sub2_3684.bindTexture((byte) -80, class258);
        if (i >= -89) method2136(-67, -39, (byte) 18);
        this.aHa_Sub2_3684.setTextureEnvMode(0, i_5_);
    }

    static final void method2146(byte i) {
        int i_6_ = 34 % ((i - 32) / 38);
        anInt6213++;
        HashNodeSub19.method3277((byte) -48);
        Component364.aBoolean8335 = false;
        Component354.method226(DisplayModeManagerContainer136.anInt4717, Component227.anInt1117, DefinitionGroup.anInt9532, 0, Component251.anInt5819);
    }

    final void method2136(int i, int i_7_, byte i_8_) {
        anInt6209++;
        if (i_8_ > -42) method2133(35);
    }

    final boolean method2137(int i) {
        anInt6208++;
        if (i > -5) anInt6212 = 1;
        return true;
    }

    public static void method2147(int i) {
        if (i != -1) anInt6212 = -79;
        friendFormerNames = null;
    }

    final void method2134(boolean bool, boolean bool_9_) {
        this.aHa_Sub2_3684.getIntegerv(true, (byte) -83);
        if (bool_9_ != false) method2136(-78, 73, (byte) 12);
        anInt6204++;
    }

    final void method2139(boolean bool, byte i) {
        int i_10_ = 23 / ((-60 - i) / 38);
        anInt6207++;
    }
}
