/* Component55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component55
/**
 * RENAMED from `Class313` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3933;
    static DisplayModeManagerContainer369 aClass223_3934 = new DisplayModeManagerContainer369(2, 2);
    static float aFloat3935;
    static int anInt3936 = 0;
    static int anInt3937;

    public static void method2333(boolean bool) {
        if (bool == false) aClass223_3934 = null;
    }

    static final void method2334(int i) {
        DisplayModeManagerContainer104.anInt10340++;
        if (i != 0) method2333(true);
        anInt3933++;
        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(ShaderSub3.aClass351_5200, DisplayModeManagerContainer64.aClass77_9029, i ^ ~0x53);
        class348_sub47.particleBuffer.writeShort((byte) 107, DisplayModeManagerContainer136.anInt4718);
        HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
    }
}
