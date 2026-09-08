/* DefinitionSub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub26
/**
 * RENAMED from `Class348_Sub40_Sub26` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    private int anInt9344 = 4096;
    static int anInt9345;
    static int anInt9346 = 0;
    private int anInt9347 = 4096;
    static int anInt9348;
    static int anInt9349;
    static int anInt9350;
    static boolean[] aBooleanArray9351;
    static boolean aBoolean9352 = true;
    static int anInt9353;
    private int anInt9354 = 4096;
    static int anInt9355;

    public static void method3118(byte i) {
        aBooleanArray9351 = null;
        int i_0_ = 37 / ((28 - i) / 61);
    }

    static final boolean method3119(int i, int i_1_, int i_2_) {
        if (i_1_ <= 39) method3119(-106, 118, -21);
        anInt9355++;
        return (i & 0xc580) != 0;
    }

    final int[][] getColourOutput(int i, int i_3_) {
        if (i_3_ != -1564599039) return null;
        anInt9353++;
        int[][] is = this.imageCacheStore.getPixels(i_3_ + 1564598957, i);
        if (this.imageCacheStore.cacheMiss) {
            int[][] is_4_ = this.method3039((byte) -60, i, 0);
            int[] is_5_ = is_4_[0];
            int[] is_6_ = is_4_[1];
            int[] is_7_ = is_4_[2];
            int[] is_8_ = is[0];
            int[] is_9_ = is[1];
            int[] is_10_ = is[2];
            for (int i_11_ = 0; (i_11_ < DefinitionSub6.anInt9139); i_11_++) {
                int i_12_ = is_5_[i_11_];
                int i_13_ = is_7_[i_11_];
                int i_14_ = is_6_[i_11_];
                if (i_13_ != i_12_ || i_13_ != i_14_) {
                    is_8_[i_11_] = anInt9344;
                    is_9_[i_11_] = anInt9354;
                    is_10_[i_11_] = anInt9347;
                } else {
                    is_8_[i_11_] = i_12_ * anInt9344 >> 12;
                    is_9_[i_11_] = anInt9354 * i_13_ >> 12;
                    is_10_[i_11_] = anInt9347 * i_14_ >> 12;
                }
            }
        }
        return is;
    }

    static final void method3120(int i) {
        Component37.anInt3931 = 0;
        anInt9345++;
        int i_15_ = Component80.packetBuffer.readUnsignedByteSubtract((byte) -118);
        int i_16_ = Component80.packetBuffer.readShortAddLittle(-117);
        int i_17_ = Component80.packetBuffer.readShortLittle(false);
        boolean bool = (Component80.packetBuffer.readByteInverse((byte) 21) == 1);

        ImageCacheStore.method2554((byte) -45);
        DefinitionSub22.method3111(111, i_15_);
        int i_18_ = (-Component80.packetBuffer.offset + DefinitionSub25.anInt9341) / 16;
        Component31.anIntArrayArray5894 = new int[i_18_][4];
        for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
            for (int i_20_ = 0; i_20_ < 4; i_20_++)
                Component31.anIntArrayArray5894[i_19_][i_20_] = Component80.packetBuffer.readInt((byte) -126);
        }
        OggUrlStream.aByteArrayArray8996 = new byte[i_18_][];
        Component30.aByteArrayArray1887 = new byte[i_18_][];
        ShaderSub1.anIntArray5192 = new int[i_18_];
        WorldNameText.aByteArrayArray8642 = new byte[i_18_][];
        Applet_Sub1.anIntArray38 = new int[i_18_];
        NodeSub50.aByteArrayArray7212 = null;
        r.anIntArray9724 = new int[i_18_];
        ImageCacheStore.anIntArray4031 = null;
        DisplayModeManagerContainer322.aByteArrayArray4281 = new byte[i_18_][];
        if (i >= -47) anInt9349 = -54;
        DisplayModeManagerContainer61.anIntArray3759 = new int[i_18_];
        OggStreamReader.anIntArray9042 = new int[i_18_];
        i_18_ = 0;
        for (int i_21_ = (-(AbstractShaderSub4.anInt7319 >> 4) + i_17_) / 8; i_21_ <= (i_17_ + (AbstractShaderSub4.anInt7319 >> 4)) / 8; i_21_++) {
            for (int i_22_ = (i_16_ - (ParametricDefinition.anInt9109 >> 4)) / 8; (i_22_ <= ((ParametricDefinition.anInt9109 >> 4) + i_16_) / 8); i_22_++) {
                OggStreamReader.anIntArray9042[i_18_] = i_22_ + (i_21_ << 8);
                ShaderSub1.anIntArray5192[i_18_] = SoftwareFallbackShader.aClass45_7382.getGroupId("m" + i_21_ + "_" + i_22_, 0);
                Applet_Sub1.anIntArray38[i_18_] = SoftwareFallbackShader.aClass45_7382.getGroupId("l" + i_21_ + "_" + i_22_, 0);
                DisplayModeManagerContainer61.anIntArray3759[i_18_] = SoftwareFallbackShader.aClass45_7382.getGroupId("um" + i_21_ + "_" + i_22_, 0);
                r.anIntArray9724[i_18_] = SoftwareFallbackShader.aClass45_7382.getGroupId("ul" + i_21_ + "_" + i_22_, 0);
                i_18_++;
            }
        }
        NodeSub41.method3157(i_16_, (byte) 123, i_17_, 11, bool);
    }

    final void method3049(Buffer class348_sub49, int i, int i_23_) {
        do {
            try {
                int i_24_ = i;
                while_201_:
                do {
                    do {
                        if (i_24_ == 0) {
                            anInt9344 = class348_sub49.readUnsignedShort(i_23_ + 842366929);
                            break while_201_;
                        } else if (i_24_ != 1) {
                            if (i_24_ == 2) break;
                            break while_201_;
                        }
                        anInt9354 = class348_sub49.readUnsignedShort(842397944);
                        break while_201_;
                    } while (false);
                    anInt9347 = class348_sub49.readUnsignedShort(842397944);
                } while (false);
                anInt9350++;
                if (i_23_ == 31015) break;
                method3118((byte) 96);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("uf.F(" + (class348_sub49 != null ? "{...}" : "null") + ',' + i + ',' + i_23_ + ')'));
            }
            break;
        } while (false);
    }

    public DefinitionSub26() {
        super(1, false);
    }

    static {
        aBooleanArray9351 = new boolean[8];
    }
}
