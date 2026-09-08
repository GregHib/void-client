/* DisplayModeManagerContainer165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer165
/**
 * RENAMED from `Class303` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static Component183 aClass114_3842;
    static int anInt3843;
    static int anInt3844 = 1;
    static int anInt3845;
    static int anInt3846;

    static final void method2285(boolean bool, byte i, int i_0_) {
        if (i > -61) aClass114_3842 = null;
        anInt3843++;
        if (bool) {
            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component41.aClass351_3150, DisplayModeManagerContainer64.aClass77_9029, -126);
            class348_sub47.particleBuffer.writeShort((byte) 107, i_0_);
            HashNodeSub14.enqueueOutboundPacket(42, class348_sub47);
        } else ClientScriptExecutor.runScript(Component258.aClass273_1966, i_0_, -1);
    }

    public static void method2286(int i) {
        aClass114_3842 = null;
        if (i != 114) anInt3844 = 87;
    }

    static final Component15 method2287(Buffer class348_sub49, byte i) {
        anInt3846++;
        int i_1_ = class348_sub49.readUnsignedByte(255);
        Component85 class221 = HeapDumpHelper.method1248(87)[class348_sub49.readUnsignedByte(255)];
        DisplayModeManagerContainer196 class341 = Component240.method596(20000)[class348_sub49.readUnsignedByte(255)];
        int i_2_ = class348_sub49.readShort(13638);
        int i_3_ = class348_sub49.readShort(13638);
        int i_4_ = class348_sub49.readUnsignedShort(842397944);
        int i_5_ = class348_sub49.readUnsignedShort(842397944);
        int i_6_ = class348_sub49.readInt((byte) -126);
        int i_7_ = class348_sub49.readInt((byte) -126);
        int i_8_ = class348_sub49.readInt((byte) -126);
        int i_9_ = -54 / ((i - -45) / 61);
        boolean bool = class348_sub49.readUnsignedByte(255) == 1;
        return new Component15(i_1_, class221, class341, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, bool);
    }

    static final void method2288(boolean bool, GraphicsToolkit var_ha) {
        anInt3845++;
        if (!DisplayModeManagerContainer5.aBoolean1211) BuildType.method1642((byte) 108, var_ha);
        else DisplayModeManagerContainer136.method1153(var_ha, 16);
        if (bool != false) anInt3844 = -97;
    }

    static {
        aClass114_3842 = new Component183(114, 4);
    }
}
