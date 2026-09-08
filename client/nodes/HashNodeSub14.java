/* HashNodeSub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashNodeSub14
/**
 * RENAMED from `Class348_Sub42_Sub14` (JODE-obfuscated).
 * Evidence: subclass of HashNode (hierarchy)
 */ extends HashNode {
    static byte[] aByteArray9622 = {31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0};
    static int anInt9623;
    static int anInt9624;
    String aString9625;
    static int[] anIntArray9626 = new int[50];
    int anInt9627;
    int anInt9628;
    NodeList aClass262_9629;
    static int anInt9630;
    int anInt9631;
    String aString9632;
    static int anInt9633;
    int anInt9634 = -1;
    int anInt9635;
    static int anInt9636;
    static int anInt9637;
    static int anInt9638;
    boolean aBoolean9639 = true;
    int anInt9640;
    static int anInt9641;
    /** Queue of pending {@link FriendLoginMessage} chat tips. */
    static Component315 friendLoginMessages = new Component315();
    int anInt9643;
    int anInt9644;
    static int anInt9645 = 1;

    final boolean method3236(int[] is, int i, int i_0_, int i_1_, byte i_2_) {
        anInt9623++;
        for (NodeSub18 class348_sub18 = (NodeSub18) this.aClass262_9629.first(4); class348_sub18 != null; class348_sub18 = (NodeSub18) this.aClass262_9629.next((byte) 117)) {
            if (class348_sub18.method2935(i_0_, i, i_1_, true)) {
                class348_sub18.method2940(i_0_, true, is, i);
                return true;
            }
        }
        if (i_2_ != -28) method3244(123, -16, 116);
        return false;
    }

    public static void method3237(byte i) {
        friendLoginMessages = null;
        anIntArray9626 = null;
        aByteArray9622 = null;
        if (i != 42) anInt9645 = -112;
    }

    final boolean method3238(byte i, int i_3_, int i_4_) {
        int i_5_ = 113 % ((-26 - i) / 46);
        anInt9641++;
        for (NodeSub18 class348_sub18 = (NodeSub18) this.aClass262_9629.first(4); class348_sub18 != null; class348_sub18 = (NodeSub18) this.aClass262_9629.next((byte) 117)) {
            if (class348_sub18.method2934(3589, i_3_, i_4_)) return true;
        }
        return false;
    }

    final boolean method3239(boolean bool, int i, int i_6_, int[] is) {
        anInt9638++;
        if (bool != true) method3238((byte) 9, -26, -68);
        for (NodeSub18 class348_sub18 = (NodeSub18) this.aClass262_9629.first(4); class348_sub18 != null; class348_sub18 = (NodeSub18) this.aClass262_9629.next((byte) 126)) {
            if (class348_sub18.method2939(i_6_, 2, i)) {
                class348_sub18.method2937(i_6_, i, -3069, is);
                return true;
            }
        }
        return false;
    }

    final void method3240(byte i) {
        this.anInt9643 = 12800;
        this.anInt9644 = 12800;
        this.anInt9627 = 0;
        anInt9636++;
        this.anInt9635 = 0;
        if (i != 37) method3244(30, -85, -43);
        for (NodeSub18 class348_sub18 = (NodeSub18) this.aClass262_9629.first(i + -33); class348_sub18 != null; class348_sub18 = (NodeSub18) this.aClass262_9629.next((byte) 52)) {
            if (this.anInt9643 > class348_sub18.anInt6812) this.anInt9643 = class348_sub18.anInt6812;
            if (class348_sub18.anInt6813 > this.anInt9627) this.anInt9627 = class348_sub18.anInt6813;
            if (this.anInt9635 < class348_sub18.anInt6819) this.anInt9635 = class348_sub18.anInt6819;
            if (class348_sub18.anInt6809 < this.anInt9644) this.anInt9644 = class348_sub18.anInt6809;
        }
    }

    static final void method3241(int i, byte i_7_, GraphicsToolkit var_ha) {
        anInt9637++;
        if (!DefinitionSub23.aBoolean9307 || !Component234.aBoolean351) HashNodeSub10.activeOccluderCount = 0;
        else {
            if (DefinitionSub26.aBoolean9352) ItemDefinition.aLong2789 = Component230.aClass47_5262.method446(1);
            Component274.occludedWallCount = 0;
            DisplayModeManagerContainer64.occludedGroundCount = 0;
            DefinitionSub4.occludedCpCount = 0;
            int[] is = var_ha.Y();
            DebugPanicSub2.anInt8498 = (int) ((float) is[3] / 3.0F);
            Component211.anInt1962 = (int) ((float) is[2] / 3.0F);
            var_ha.method3632(LoggedOutDefinition.anIntArray9436);
            if ((Component314.anInt3872 != (int) ((float) LoggedOutDefinition.anIntArray9436[0] / 3.0F)) || Component328.anInt1480 != (int) ((float) LoggedOutDefinition.anIntArray9436[1] / 3.0F)) {
                Component328.anInt1480 = (int) ((float) LoggedOutDefinition.anIntArray9436[1] / 3.0F);
                Component314.anInt3872 = (int) ((float) LoggedOutDefinition.anIntArray9436[0] / 3.0F);
                DisplayModeManagerContainer207.anInt9759 = Component328.anInt1480 >> 1;
                DisplayModeManagerContainer194.anIntArray5091 = new int[Component328.anInt1480 * Component314.anInt3872];
                Component325.anInt1202 = Component314.anInt3872 >> 1;
            }
            DefinitionSub4.aClass101_9114 = var_ha.method3640();
            HashNodeSub10.activeOccluderCount = 0;
            int i_8_ = 0;
            if (i_7_ < 37) method3241(-25, (byte) 65, null);
            for (/**/; RadixText.occluderCountA > i_8_; i_8_++)
                RenderableSub2.method2498(Component335.aClass338Array2034[i_8_], var_ha, (byte) -112, i);
            for (int i_9_ = 0; i_9_ < Component325.occluderCountB; i_9_++)
                RenderableSub2.method2498((DisplayModeManagerContainer104.aClass338Array10330[i_9_]), var_ha, (byte) -127, i);
            for (int i_10_ = 0; i_10_ < ComponentSettings.anInt7101; i_10_++)
                RenderableSub2.method2498(InterfaceRenderer.aClass338Array5060[i_10_], var_ha, (byte) -128, i);
            Component241.occludedPixelCount = 0;
            if (HashNodeSub10.activeOccluderCount > 0) {
                int i_11_ = DisplayModeManagerContainer194.anIntArray5091.length;
                int i_12_ = i_11_ + -i_11_ & 0x7;
                int i_13_ = 0;
                while (i_13_ < i_12_) {
                    DisplayModeManagerContainer194.anIntArray5091[i_13_++] = 2147483647;
                    DisplayModeManagerContainer194.anIntArray5091[i_13_++] = 2147483647;
                    DisplayModeManagerContainer194.anIntArray5091[i_13_++] = 2147483647;
                    DisplayModeManagerContainer194.anIntArray5091[i_13_++] = 2147483647;
                    DisplayModeManagerContainer194.anIntArray5091[i_13_++] = 2147483647;
                    DisplayModeManagerContainer194.anIntArray5091[i_13_++] = 2147483647;
                    DisplayModeManagerContainer194.anIntArray5091[i_13_++] = 2147483647;
                    DisplayModeManagerContainer194.anIntArray5091[i_13_++] = 2147483647;
                }
                while (i_11_ > i_13_) DisplayModeManagerContainer194.anIntArray5091[i_13_++] = 2147483647;
                Component360.anInt4319 = 1;
                for (int i_14_ = 0; (i_14_ < HashNodeSub10.activeOccluderCount); i_14_++) {
                    Component103 class338 = HashNodeSub19.aClass338Array9700[i_14_];
                    DefinitionSub29.method3125(class338.aShortArray4194[3], class338.aShortArray4183[0], class338.aShortArray4194[1], class338.aShortArray4188[3], class338.aShortArray4188[1], (byte) -105, class338.aShortArray4183[1], class338.aShortArray4188[0], class338.aShortArray4194[0], class338.aShortArray4183[3]);
                    DefinitionSub29.method3125(class338.aShortArray4194[3], class338.aShortArray4183[1], class338.aShortArray4194[2], class338.aShortArray4188[3], class338.aShortArray4188[2], (byte) -118, class338.aShortArray4183[2], class338.aShortArray4188[1], class338.aShortArray4194[1], class338.aShortArray4183[3]);
                }
                Component360.anInt4319 = 2;
            }
            if (DefinitionSub26.aBoolean9352) WaterShaderProgram.occludeCalcNanos = (Component230.aClass47_5262.method446(1) + -ItemDefinition.aLong2789);
        }
    }

    final boolean method3242(int[] is, int i, int i_15_, int i_16_) {
        anInt9624++;
        for (NodeSub18 class348_sub18 = (NodeSub18) this.aClass262_9629.first(4); class348_sub18 != null; class348_sub18 = (NodeSub18) this.aClass262_9629.next((byte) 115)) {
            if (class348_sub18.method2934(3589, i_16_, i_15_)) {
                class348_sub18.method2940(i_15_, true, is, i_16_);
                return true;
            }
        }
        if (i <= 59) method3242(null, -121, 72, 68);
        return false;
    }

    /**
     * Queue an outbound game packet (type still named {@code ParticleSystem} —
     * it is a write buffer + opcode, not FX). Records byte length, resets the
     * write cursor, and accumulates pending send size.
     */
    static final void enqueueOutboundPacket(int i, ParticleSystem class348_sub47) {
        anInt9630++;
        DefinitionSub13.aClass262_9201.addTail(class348_sub47, -20180);
        class348_sub47.anInt7119 = class348_sub47.particleBuffer.offset;
        class348_sub47.particleBuffer.offset = 0;
        NodeSub34.anInt6969 += class348_sub47.anInt7119;
        int i_17_ = -41 / ((i - 79) / 37);
    }

    static final void method3244(int i, int i_18_, int i_19_) {
        NodeSub5.method2755(-1, i_18_, i);
        anInt9633++;
        if (i_19_ <= 108) enqueueOutboundPacket(-47, null);
    }

    HashNodeSub14(int i, String string, String string_20_, int i_21_, int i_22_, boolean bool, int i_23_, int i_24_) {
        this.anInt9627 = 0;
        this.anInt9631 = -1;
        this.anInt9643 = 12800;
        this.anInt9635 = 0;
        this.anInt9644 = 12800;
        try {
            this.anInt9631 = i_23_;
            this.anInt9640 = i_21_;
            this.aString9625 = string;
            this.aString9632 = string_20_;
            this.anInt9634 = i_22_;
            this.anInt9628 = i;
            this.aBoolean9639 = bool;
            if (this.anInt9631 == 255) this.anInt9631 = 0;
            this.aClass262_9629 = new NodeList();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("dfa.<init>(" + i + ',' + (string != null ? "{...}" : "null") + ',' + (string_20_ != null ? "{...}" : "null") + ',' + i_21_ + ',' + i_22_ + ',' + bool + ',' + i_23_ + ',' + i_24_ + ')'));
        }
    }
}
