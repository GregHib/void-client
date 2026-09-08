/* Component177 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component177
/**
 * RENAMED from `Class155` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2108;
    static StringCache aClass351_2109 = new StringCache(19, -1);
    static boolean aBoolean2110 = false;

    public static void method1236(byte i) {
        aClass351_2109 = null;
        if (i >= -78) method1237((byte) 54, null);
    }

    static final void method1237(byte i, DisplayModeManagerContainer57 class46) {
        anInt2108++;
        if (i < 69) method1236((byte) -52);
        if (r.aBoolean9722) {
            HuffmanDecoder.anInt3775++;
            if (class46.anObjectArray679 != null) {
                DisplayModeManagerContainer57 class46_0_ = NpcNode.getChildComponent(JaclibLoader.anInt169, (byte) -54, Component90.anInt2046);
                if (class46_0_ != null) {
                    NodeSub36 class348_sub36 = new NodeSub36();
                    class348_sub36.aClass46_6989 = class46;
                    class348_sub36.aClass46_6983 = class46_0_;
                    class348_sub36.anObjectArray6987 = class46.anObjectArray679;
                    ClientScriptExecutor.runHook(class348_sub36);
                }
            }
            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(AbstractBuffer.aClass351_4266, DisplayModeManagerContainer64.aClass77_9029, -120);
            class348_sub47.particleBuffer.writeInt((byte) 100, class46.packedId);
            class348_sub47.particleBuffer.writeIntInverseMiddle(Component90.anInt2046, -4086);
            class348_sub47.particleBuffer.writeShortAdd(-123, JaclibLoader.anInt169);
            class348_sub47.particleBuffer.writeShort((byte) 107, Component281.anInt3829);
            class348_sub47.particleBuffer.writeShortAdd(92, class46.childIndex);
            class348_sub47.particleBuffer.writeShort((byte) 107, class46.itemId);
            HashNodeSub14.enqueueOutboundPacket(-89, class348_sub47);
        }
    }
}
