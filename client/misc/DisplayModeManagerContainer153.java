/* DisplayModeManagerContainer153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer153
/**
 * RENAMED from `Class99` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static boolean[][] aBooleanArrayArray1572;
    static int anInt1573;
    static int[] anIntArray1574 = new int[3];
    static int anInt1575;
    static int anInt1576;

    static final void method880(int i, byte[] is, byte[] is_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        try {
            anInt1575++;
            int i_7_ = -(i >> 2);
            i = -(i & 0x3);
            if (i_2_ != 13880) method880(9, null, null, -128, 85, -75, 62, 85, -51);
            for (int i_8_ = -i_3_; i_8_ < 0; i_8_++) {
                for (int i_9_ = i_7_; i_9_ < 0; i_9_++) {
                    is[i_4_++] += is_0_[i_1_++];
                    is[i_4_++] += is_0_[i_1_++];
                    is[i_4_++] += is_0_[i_1_++];
                    is[i_4_++] += is_0_[i_1_++];
                }
                for (int i_10_ = i; i_10_ < 0; i_10_++)
                    is[i_4_++] += is_0_[i_1_++];
                i_4_ += i_5_;
                i_1_ += i_6_;
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("me.D(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (is_0_ != null ? "{...}" : "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
        }
    }

    static final void method881(HashNodeSub13 class348_sub42_sub13, int i, boolean bool, int i_11_) {
        anInt1576++;
        if (Component364.aBoolean8335) {
            int i_12_ = 0;
            for (MenuEntry class348_sub42_sub12 = ((MenuEntry) class348_sub42_sub13.aClass107_9621.first(-59)); class348_sub42_sub12 != null; class348_sub42_sub12 = ((MenuEntry) class348_sub42_sub13.aClass107_9621.next((byte) 108))) {
                int i_13_ = OutputStream_Sub2.method138(class348_sub42_sub12, false);
                if (i_13_ > i_12_) i_12_ = i_13_;
            }
            i_12_ += 8;
            if (bool == true) {
                DisplayModeManagerContainer249.anInt4669 = 16 * (class348_sub42_sub13.anInt9615) + (!DisplayModeManagerContainer5.aBoolean1211 ? 22 : 26);
                int i_14_ = 21 + (class348_sub42_sub13.anInt9615) * 16;
                int i_15_ = Component227.anInt1117 + DisplayModeManagerContainer136.anInt4717;
                if (i_12_ + i_15_ > Component236.canvasWidth) i_15_ = -i_12_ + DisplayModeManagerContainer136.anInt4717;
                if (i_15_ < 0) i_15_ = 0;
                int i_16_ = !DisplayModeManagerContainer5.aBoolean1211 ? 31 : 33;
                int i_17_ = 13 + i_11_ + -i_16_;
                if (i_17_ + i_14_ > PacketReader.canvasHeight) i_17_ = PacketReader.canvasHeight - i_14_;
                DisplayModeManagerContainer368.anInt5252 = i_15_;
                if (i_17_ < 0) i_17_ = 0;
                Component359.aClass348_Sub42_Sub13_3152 = class348_sub42_sub13;
                NodeSub1Sub1.anInt8806 = i_12_;
                MouseHandler.menuOriginY = i_17_;
            }
        }
    }

    static final void method882(byte i) {
        if (i != 11) method882((byte) -62);
        DefinitionSub33.openInterfaces = new DisplayModeManagerContainer57[Component267.aClass45_2978.getGroupCapacity(-1)][];
        anInt1573++;
        Component14.aClass46ArrayArray8584 = new DisplayModeManagerContainer57[Component267.aClass45_2978.getGroupCapacity(-1)][];
        ImageTagText.aBooleanArray2162 = new boolean[Component267.aClass45_2978.getGroupCapacity(-1)];
    }

    public static void method883(byte i) {
        aBooleanArrayArray1572 = null;
        anIntArray1574 = null;
        int i_18_ = -74 / ((i - 17) / 46);
    }
}
