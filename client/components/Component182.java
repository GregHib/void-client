/* Component182 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Stream;

final class Component182
/**
 * RENAMED from `Class348_Sub49_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Buffer (hierarchy)
 */ extends Buffer {
    static int anInt9741;
    static int anInt9742;
    static StringCache aClass351_9743 = new StringCache(84, -1);
    static int anInt9744;
    static int anInt9745;
    static boolean aBoolean9746 = true;
    static int anInt9747;
    static Component161 aClass138_9748 = new Component161(7, 0, 1, 1);
    static StringCache aClass351_9749;
    static int anInt9750;
    static int anInt9751 = 0;

    static final void renderScene(boolean isPrimary, byte[][][] is, int i, byte i_0_, int i_1_, int i_2_, boolean bool_3_) {
        int i_4_ = isPrimary ? 1 : 0;
        Component305.opaqueOnscreenCount = 0;
        HashNodeSub3.translucentOnscreenCount = 0;
        RandomAccessFileReader.anInt3049++;
        if ((i_2_ & 0x2) == 0) {
            for (RenderableObject class318_sub1 = Node.aClass318_Sub1Array4293[i_4_]; class318_sub1 != null; class318_sub1 = class318_sub1.aClass318_Sub1_6379) {
                if (!SceneNode.method2778(class318_sub1, isPrimary, is, i, i_0_)) {
                    BufferCacheSub2.method4001(class318_sub1);
                    if (class318_sub1.anInt6389 != -1) Component71.aClass318_Sub1Array6066[Component305.opaqueOnscreenCount++] = class318_sub1;
                }
            }
        }
        if ((i_2_ & 0x1) == 0) {
            for (RenderableObject class318_sub1 = AudioMixer.aClass318_Sub1Array3226[i_4_]; class318_sub1 != null; class318_sub1 = class318_sub1.aClass318_Sub1_6379) {
                if (!SceneNode.method2778(class318_sub1, isPrimary, is, i, i_0_)) {
                    BufferCacheSub2.method4001(class318_sub1);
                    if (class318_sub1.anInt6389 != -1) ReferenceTable.aClass318_Sub1Array3737[HashNodeSub3.translucentOnscreenCount++] = class318_sub1;
                }
            }
            for (RenderableObject class318_sub1 = Component95.aClass318_Sub1Array1754[i_4_]; class318_sub1 != null; class318_sub1 = class318_sub1.aClass318_Sub1_6379) {
                if (!SceneNode.method2778(class318_sub1, isPrimary, is, i, i_0_)) {
                    if (class318_sub1.method2377((byte) 122)) {
                        BufferCacheSub2.method4001(class318_sub1);
                        if (class318_sub1.anInt6389 != -1) ReferenceTable.aClass318_Sub1Array3737[HashNodeSub3.translucentOnscreenCount++] = class318_sub1;
                    } else {
                        BufferCacheSub2.method4001(class318_sub1);
                        if (class318_sub1.anInt6389 != -1) Component71.aClass318_Sub1Array6066[Component305.opaqueOnscreenCount++] = class318_sub1;
                    }
                }
            }
            if (!isPrimary) {
                for (int i_5_ = 0; i_5_ < Component328.dynamicOnscreenCount; i_5_++) {
                    if (!SceneNode.method2778((DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357[i_5_]), isPrimary, is, i, i_0_)) {
                        BufferCacheSub2.method4001(DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357[i_5_]);
                        if ((DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357[i_5_].anInt6389) != -1) {
                            if (DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357[i_5_].method2377((byte) 122)) ReferenceTable.aClass318_Sub1Array3737[HashNodeSub3.translucentOnscreenCount++] = (DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357[i_5_]);
                            else Component71.aClass318_Sub1Array6066[Component305.opaqueOnscreenCount++] = (DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357[i_5_]);
                        }
                    }
                }
            }
        }
        if (Component305.opaqueOnscreenCount > 0) {
            Component385.method1295(Component71.aClass318_Sub1Array6066, 0, Component305.opaqueOnscreenCount - 1);
            for (int i_6_ = 0; i_6_ < Component305.opaqueOnscreenCount; i_6_++)
                Component354.method227(Component71.aClass318_Sub1Array6066[i_6_], true, bool_3_);
        }
        if (DisplayModeManagerContainer58.aBoolean10221) JaclibLoader.toolkit.method3642(0, null);
        if ((i_2_ & 0x2) == 0) {
            for (int i_7_ = Canvas_Sub1.anInt67; i_7_ < Component291.anInt2524; i_7_++) {
                if (i_7_ >= i && is != null) {
                    int i_8_ = DisplayModeManagerContainer153.aBooleanArrayArray1572.length;
                    if ((NameFormatter.anInt492 + DisplayModeManagerContainer153.aBooleanArrayArray1572.length) > StaticElementRenderer.anInt6451) i_8_ -= (NameFormatter.anInt492 + DisplayModeManagerContainer153.aBooleanArrayArray1572.length - StaticElementRenderer.anInt6451);
                    int i_9_ = DisplayModeManagerContainer153.aBooleanArrayArray1572[0].length;
                    if ((NodeSub34.anInt6974 + DisplayModeManagerContainer153.aBooleanArrayArray1572[0].length) > NodeSub41.anInt7054) i_9_ -= (NodeSub34.anInt6974 + DisplayModeManagerContainer153.aBooleanArrayArray1572[0].length - NodeSub41.anInt7054);
                    boolean[][] bools = NodeSub8.aBooleanArrayArray6656;
                    if (DefinitionSub17.aBoolean9242) {
                        if (DefinitionSub5.aBoolean9121) bools = Component95.aBooleanArrayArrayArray1751[i_7_];
                        for (int i_10_ = SpriteSub1.anInt8412; i_10_ < i_8_; i_10_++) {
                            int i_11_ = (i_10_ + NameFormatter.anInt492 - SpriteSub1.anInt8412);
                            for (int i_12_ = Component49.anInt4686; i_12_ < i_9_; i_12_++) {
                                bools[i_10_][i_12_] = false;
                                if (DisplayModeManagerContainer153.aBooleanArrayArray1572[i_10_][i_12_]) {
                                    int i_13_ = (i_12_ + NodeSub34.anInt6974 - Component49.anInt4686);
                                    for (int i_14_ = i_7_; i_14_ >= 0; i_14_--) {
                                        if ((Component335.aClass357ArrayArrayArray2029[i_14_][i_11_][i_13_]) != null && (Component335.aClass357ArrayArrayArray2029[i_14_][i_11_][i_13_].aByte4399) == i_7_) {
                                            bools[i_10_][i_12_] = (i_14_ < i || (is[i_14_][i_11_][i_13_]) != i_0_) && (!ShaderSub2.method164(i_7_, i_11_, (byte) -97, i_13_));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (DefinitionSub5.aBoolean9121) {
                        if (i_1_ >= 0) ShaderSub1.aSArray5191[i_7_].method3984(0, 0, 0, null, false, i_1_, i_2_);
                        else ShaderSub1.aSArray5191[i_7_].method3983(0, 0, 0, null, false, i_2_);
                        for (int i_15_ = 0; i_15_ < Npc.anInt10503; i_15_++)
                            Component144.aClass315Array3982[i_15_].method2359(new RenderableSub2(i_7_ + 1), -1);
                    } else if (i_1_ >= 0) ShaderSub1.aSArray5191[i_7_].method3984(Component256.anInt6111, DebugPanicSub2.anInt8502, Component197.anInt10084, NodeSub8.aBooleanArrayArray6656, false, i_1_, i_2_);
                    else ShaderSub1.aSArray5191[i_7_].method3983(Component256.anInt6111, DebugPanicSub2.anInt8502, Component197.anInt10084, NodeSub8.aBooleanArrayArray6656, false, i_2_);
                } else {
                    int i_16_ = DisplayModeManagerContainer153.aBooleanArrayArray1572.length;
                    if ((NameFormatter.anInt492 + DisplayModeManagerContainer153.aBooleanArrayArray1572.length) > StaticElementRenderer.anInt6451) i_16_ -= (NameFormatter.anInt492 + DisplayModeManagerContainer153.aBooleanArrayArray1572.length - StaticElementRenderer.anInt6451);
                    int i_17_ = DisplayModeManagerContainer153.aBooleanArrayArray1572[0].length;
                    if ((NodeSub34.anInt6974 + DisplayModeManagerContainer153.aBooleanArrayArray1572[0].length) > NodeSub41.anInt7054) i_17_ -= (NodeSub34.anInt6974 + DisplayModeManagerContainer153.aBooleanArrayArray1572[0].length - NodeSub41.anInt7054);
                    boolean[][] bools = NodeSub8.aBooleanArrayArray6656;
                    if (DefinitionSub17.aBoolean9242) {
                        if (DefinitionSub5.aBoolean9121) bools = Component95.aBooleanArrayArrayArray1751[i_7_];
                        for (int i_18_ = SpriteSub1.anInt8412; i_18_ < i_16_; i_18_++) {
                            int i_19_ = (i_18_ + NameFormatter.anInt492 - SpriteSub1.anInt8412);
                            for (int i_20_ = Component49.anInt4686; i_20_ < i_17_; i_20_++) {
                                bools[i_18_][i_20_] = (DisplayModeManagerContainer153.aBooleanArrayArray1572[i_18_][i_20_]) && !ShaderSub2.method164(i_7_, i_19_, (byte) -97, (i_20_ + (NodeSub34.anInt6974) - (Component49.anInt4686)));
                            }
                        }
                    }
                    if (DefinitionSub5.aBoolean9121) {
                        if (i_1_ >= 0) ShaderSub1.aSArray5191[i_7_].method3984(0, 0, 0, null, false, i_1_, i_2_);
                        else ShaderSub1.aSArray5191[i_7_].method3983(0, 0, 0, null, false, i_2_);
                        for (int i_21_ = 0; i_21_ < Npc.anInt10503; i_21_++)
                            Component144.aClass315Array3982[i_21_].method2359(new RenderableSub2(i_7_ + 1), -1);
                    } else if (i_1_ >= 0) ShaderSub1.aSArray5191[i_7_].method3984(Component256.anInt6111, DebugPanicSub2.anInt8502, Component197.anInt10084, NodeSub8.aBooleanArrayArray6656, true, i_1_, i_2_);
                    else ShaderSub1.aSArray5191[i_7_].method3983(Component256.anInt6111, DebugPanicSub2.anInt8502, Component197.anInt10084, NodeSub8.aBooleanArrayArray6656, true, i_2_);
                }
            }
        }
        if (HashNodeSub3.translucentOnscreenCount > 0) {
            VideoAdPlayer.method718(ReferenceTable.aClass318_Sub1Array3737, 0, HashNodeSub3.translucentOnscreenCount - 1);
            for (int i_22_ = 0; i_22_ < HashNodeSub3.translucentOnscreenCount; i_22_++)
                Component354.method227(ReferenceTable.aClass318_Sub1Array3737[i_22_], true, bool_3_);
        }
    }

    final void writeFloatLE(int i, float f) {
        anInt9741++;
        int i_23_ = Stream.floatToRawIntBits(f);
        this.payload[this.offset++] = (byte) i_23_;
        this.payload[this.offset++] = (byte) (i_23_ >> 8);
        if (i != 18291) aBoolean9746 = true;
        this.payload[this.offset++] = (byte) (i_23_ >> 16);
        this.payload[this.offset++] = (byte) (i_23_ >> 24);
    }

    Component182(int i) {
        super(i);
    }

    final void writeFloatBE(float f, byte i) {
        anInt9744++;
        int i_24_ = Stream.floatToRawIntBits(f);
        this.payload[this.offset++] = (byte) (i_24_ >> 24);
        this.payload[this.offset++] = (byte) (i_24_ >> 16);
        if (i >= -76) aBoolean9746 = true;
        this.payload[this.offset++] = (byte) (i_24_ >> 8);
        this.payload[this.offset++] = (byte) i_24_;
    }

    static final int method3401(int i, int i_25_, byte i_26_) {
        anInt9745++;
        if (i_26_ <= 10) return -118;
        if (i == -1) return 12345678;
        i_25_ = (i & 0x7f) * i_25_ >> 7;
        if (i_25_ < 2) i_25_ = 2;
        else if (i_25_ > 126) i_25_ = 126;
        return i_25_ + (i & 0xff80);
    }

    static final void method3402(byte i) {
        if (ReflectionInvoker.javaVendor.toLowerCase().indexOf("microsoft") == -1) {
            DebugPanicSub2.anIntArray8507[46] = 72;
            DebugPanicSub2.anIntArray8507[92] = 74;
            DebugPanicSub2.anIntArray8507[44] = 71;
            DebugPanicSub2.anIntArray8507[61] = 27;
            DebugPanicSub2.anIntArray8507[91] = 42;
            if (ReflectionInvoker.aMethod3783 == null) {
                DebugPanicSub2.anIntArray8507[192] = 58;
                DebugPanicSub2.anIntArray8507[222] = 59;
            } else {
                DebugPanicSub2.anIntArray8507[520] = 59;
                DebugPanicSub2.anIntArray8507[192] = 28;
                DebugPanicSub2.anIntArray8507[222] = 58;
            }
            DebugPanicSub2.anIntArray8507[45] = 26;
            DebugPanicSub2.anIntArray8507[47] = 73;
            DebugPanicSub2.anIntArray8507[59] = 57;
            DebugPanicSub2.anIntArray8507[93] = 43;
        } else {
            DebugPanicSub2.anIntArray8507[222] = 59;
            DebugPanicSub2.anIntArray8507[187] = 27;
            DebugPanicSub2.anIntArray8507[186] = 57;
            DebugPanicSub2.anIntArray8507[221] = 43;
            DebugPanicSub2.anIntArray8507[219] = 42;
            DebugPanicSub2.anIntArray8507[191] = 73;
            DebugPanicSub2.anIntArray8507[190] = 72;
            DebugPanicSub2.anIntArray8507[220] = 74;
            DebugPanicSub2.anIntArray8507[188] = 71;
            DebugPanicSub2.anIntArray8507[189] = 26;
            DebugPanicSub2.anIntArray8507[192] = 58;
            DebugPanicSub2.anIntArray8507[223] = 28;
        }
        anInt9742++;
        if (i > -20) aBoolean9746 = false;
    }

    public static void method3403(int i) {
        if (i >= 58) {
            aClass138_9748 = null;
            aClass351_9749 = null;
            aClass351_9743 = null;
        }
    }

    static {
        anInt9750 = 0;
        aClass351_9749 = new StringCache(45, 7);
    }
}
