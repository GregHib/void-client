/* Component245 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component245
/**
 * RENAMED from `Class2` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt116;
    static Component258 aClass141_117;
    r aR118;
    DisplayModeManagerContainer370 aClass64_119;
    static int anInt120;
    static int anInt121;
    static int anInt122;

    static final Component362 method170(boolean bool) {
        if (bool != true) method174(-106, -36);
        anInt122++;
        if (NodeSub36.anInt6985 < Component304.aClass110_Sub1Array1146.length) return Component304.aClass110_Sub1Array1146[NodeSub36.anInt6985++];
        return null;
    }

    public static void method171(byte i) {
        aClass141_117 = null;
        if (i != 72) method173(39, null, null);
    }

    static final void method172(int i, CacheStore class45) {
        if (i != 30284) method170(true);
        anInt116++;
        Component54.aClass45_8670 = class45;
    }

    static final void method173(int i, DisplayModeManagerContainer57 class46, DisplayModeManagerContainer57 class46_0_) {
        try {
            anInt120++;
            NodeSub38.anInt7009++;
            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component379.aClass351_5934, DisplayModeManagerContainer64.aClass77_9029, -104);
            class348_sub47.particleBuffer.writeInt((byte) 112, class46.packedId);
            class348_sub47.particleBuffer.writeShortLittle(class46_0_.childIndex, (byte) 3);
            class348_sub47.particleBuffer.writeIntMiddle(class46_0_.packedId, (byte) 44);
            class348_sub47.particleBuffer.writeShort((byte) 107, class46_0_.itemId);
            class348_sub47.particleBuffer.writeShortAddLittle(4325, class46.childIndex);
            class348_sub47.particleBuffer.writeShortAddLittle(4325, class46.itemId);
            if (i > -50) aClass141_117 = null;
            HashNodeSub14.enqueueOutboundPacket(-100, class348_sub47);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ak.E(" + i + ',' + (class46 != null ? "{...}" : "null") + ',' + (class46_0_ != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method174(int i, int i_1_) {
        if (i_1_ != -30742) aClass141_117 = null;
        anInt121++;
        Component9.aClass60_4139.processSoftEntries(2, i);
    }

    public Component245() {
        /* empty */
    }
}
