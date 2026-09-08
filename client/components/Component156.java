/* Component156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component156
/**
 * RENAMED from `Class289` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3696;
    static boolean aBoolean3697 = false;
    static int anInt3698;
    static int anInt3699;
    static byte[][][] aByteArrayArrayArray3700;
    static DisplayModeManagerContainer57 aClass46_3701 = null;
    static int anInt3702;
    static int anInt3703;
    static int anInt3704;
    static NodeList aClass262_3705;

    public static void method2191(int i) {
        if (i != 0) method2192((byte) -74);
        aClass46_3701 = null;
        aByteArrayArrayArray3700 = null;
        aClass262_3705 = null;
    }

    static final void method2192(byte i) {
        AudioMixer.anInt3227 = 0;
        anInt3702++;
        int i_0_ = (((Component72.localPlayer.x) >> 9) - -NodeBaseSub2.regionTileX);
        int i_1_ = (Component330.regionTileY + (Component72.localPlayer.y >> 9));
        if (i != 80) method2192((byte) -34);
        if (i_0_ >= 3053 && i_0_ <= 3156 && i_1_ >= 3056 && i_1_ <= 3136) AudioMixer.anInt3227 = 1;
        if (i_0_ >= 3072 && i_0_ <= 3118 && i_1_ >= 9492 && i_1_ <= 9535) AudioMixer.anInt3227 = 1;
        if (AudioMixer.anInt3227 == 1 && i_0_ >= 3139 && i_0_ <= 3199 && i_1_ >= 3008 && i_1_ <= 3062) AudioMixer.anInt3227 = 0;
    }

    static final void method2193(boolean bool, byte i) {
        anInt3698++;
        Component381.method3570(false);
        if (NativeLibLoader.isPostLoginState(true, Component49.clientState)) {
            Component53.anInt193++;
            if (i < -118 && (Component53.anInt193 >= 50 || bool)) {
                Component53.anInt193 = 0;
                if (!Component338.aBoolean1712 && DefinitionSub8.aClass238_9165 != null) {
                    IOException_Sub1.anInt88++;
                    ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket((Component98.aClass351_5938), (DisplayModeManagerContainer64.aClass77_9029), -106);
                    HashNodeSub14.enqueueOutboundPacket(122, class348_sub47);
                    try {
                        Component302.method1802(0);
                    } catch (java.io.IOException ioexception) {
                        Component338.aBoolean1712 = true;
                    }
                }
                Component381.method3570(false);
            }
        }
    }

    static final int method2194(int i, HashNodeSub13 class348_sub42_sub13) {
        anInt3696++;
        if (i != -1) return -42;
        String string = ColorTagNode.method2812(i + -43, class348_sub42_sub13);
        return Component27.aClass143_4962.method1186(string, DisplayModeManagerContainer196.aClass105Array4234, false);
    }

    static {
        anInt3699 = 0;
    }
}
