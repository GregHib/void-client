/* Component359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component359
/**
 * RENAMED from `Class242` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3151;
    static HashNodeSub13 aClass348_Sub42_Sub13_3152 = null;
    private final GlToolkitSub2 aHa_Sub2_3153;
    static int anInt3154;
    static int anInt3155;
    long aLong3156;

    public static void method1866(int i) {
        if (i != 0) aClass348_Sub42_Sub13_3152 = null;
        aClass348_Sub42_Sub13_3152 = null;
    }

    static final void method1867(int i) {
        if (i < 44) method1868((byte) -81, null);
        anInt3155++;
        TheoraVideoPlayer.anInt1498++;
        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(DisplayModeManagerContainer28.aClass351_8724, DisplayModeManagerContainer64.aClass77_9029, -99);
        class348_sub47.particleBuffer.writeByte(false, 0);
        HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
    }

    protected final void finalize() throws Throwable {
        anInt3151++;
        aHa_Sub2_3153.method3769(this.aLong3156, false);
        super.finalize();
    }

    static final void method1868(byte i, HashNodeSub13 class348_sub42_sub13) {
        int i_0_ = -104 / ((i - 38) / 54);
        anInt3154++;
        class348_sub42_sub13.unlink(true);
        boolean bool = false;
        for (HashNodeSub13 class348_sub42_sub13_1_ = ((HashNodeSub13) Component237.aClass107_3022.first(-85)); class348_sub42_sub13_1_ != null; class348_sub42_sub13_1_ = ((HashNodeSub13) Component237.aClass107_3022.next((byte) 84))) {
            if (RenderableSub2.method2496(class348_sub42_sub13_1_.method3235(-17937), class348_sub42_sub13.method3235(-17937), true)) {
                Component325.method721(class348_sub42_sub13_1_, class348_sub42_sub13, -1);
                bool = true;
                break;
            }
        }
        if (!bool) Component237.aClass107_3022.add(true, class348_sub42_sub13);
    }

    Component359(GlToolkitSub2 var_ha_Sub2, long l, int i) {
        try {
            aHa_Sub2_3153 = var_ha_Sub2;
            this.aLong3156 = l;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("tba.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + l + ',' + i + ')'));
        }
    }
}
