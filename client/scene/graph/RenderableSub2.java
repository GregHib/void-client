/* RenderableSub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RenderableSub2
/**
 * RENAMED from `Class318_Sub2` (JODE-obfuscated).
 * Evidence: subclass of Renderable (hierarchy)
 */ extends Renderable {
    static int[] anIntArray6393 = new int[8];
    int anInt6394;
    static int anInt6395;
    static int anInt6396;
    static int anInt6397;
    static int anInt6398;
    static int anInt6399;
    static Component335[] aClass147Array6400 = new Component335[100];

    static final void method2494(int i, int i_0_, int i_1_, GraphicsToolkit var_ha, MenuEntry class348_sub42_sub12, int i_2_, int i_3_, int i_4_, byte i_5_, int i_6_, int i_7_, int i_8_) {
        do {
            try {
                anInt6397++;
                if (i_5_ < 123) method2499(27, -8, -96, 71, 72, (byte) 72, -82);
                if (i_8_ > i_7_ && i_7_ + i_2_ > i_8_ && i_3_ > -13 + i_1_ && i_1_ + 3 > i_3_ && (class348_sub42_sub12.aBoolean9610)) i_4_ = i_0_;
                int[] is = null;
                if (!Component3.method1197(-12081, class348_sub42_sub12.opcode)) {
                    if ((class348_sub42_sub12.itemId) == -1) {
                        if (WaterShaderSub8.method3549((class348_sub42_sub12.opcode), (byte) -119)) {
                            NpcNode class348_sub22 = ((NpcNode) (Component21.aClass356_3654.get((int) (class348_sub42_sub12.identifier), -6008)));
                            if (class348_sub22 != null) {
                                Npc npc = (class348_sub22.npc);
                                NpcComposition class79 = (npc.definition);
                                if (class79.anIntArray1377 != null) class79 = (class79.method794((DisplayModeManagerContainer58.aClass170_10209), -1));
                                if (class79 != null) is = class79.anIntArray1342;
                            }
                        } else if (Component71.method1813(8806, (class348_sub42_sub12.opcode))) {
                            Object object = null;
                            ObjectDefinition class51;
                            if (class348_sub42_sub12.opcode != 1001) class51 = (GradientPreset.aClass263_9195.getObjectDefinition(0, (int) (0x7fffffffL & ((class348_sub42_sub12.identifier) >>> 32))));
                            else class51 = (GradientPreset.aClass263_9195.getObjectDefinition(0, (int) (class348_sub42_sub12.identifier)));
                            if (class51.anIntArray945 != null) class51 = (class51.getTransformedDefinition((DisplayModeManagerContainer58.aClass170_10209), (byte) 47));
                            if (class51 != null) is = class51.anIntArray917;
                        }
                    } else is = Exception_Sub1.itemDefinitions.getItemDefinition(113, (class348_sub42_sub12.itemId)).anIntArray2772;
                } else is = (Exception_Sub1.itemDefinitions.getItemDefinition(-67, (int) (class348_sub42_sub12.identifier)).anIntArray2772);
                String string = Component192.formatMenuEntry((byte) 125, class348_sub42_sub12);
                if (is != null) string += ImageTagText.method1273(is, true);
                NodeList.aClass324_3326.method2567(i_1_, string, (byte) 116, i_4_, 0, i_7_ - -3, DisplayModeManagerContainer196.aClass105Array4234, Component143.anIntArray2330);
                if (!class348_sub42_sub12.aBoolean9597) break;
                ColoredText.aClass105_6097.drawAt(Component27.aClass143_4962.stringWidth(true, string) + (i_7_ - -5), -12 + i_1_);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("vo.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + (class348_sub42_sub12 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'));
            }
            break;
        } while (false);
    }

    public static void method2495(byte i) {
        if (i <= 110) anIntArray6393 = null;
        anIntArray6393 = null;
        aClass147Array6400 = null;
    }

    static final boolean method2496(int i, int i_9_, boolean bool) {
        if (bool != true) method2497(null, (byte) -29, null, 73);
        anInt6396++;
        if (i >= 1000 && i_9_ < 1000) return true;
        if (i < 1000 && i_9_ < 1000) {
            if (DisplayModeManagerContainer74.method2308((byte) 26, i_9_)) return true;
            return !DisplayModeManagerContainer74.method2308((byte) 26, i);
        }
        return i >= 1000 && i_9_ >= 1000;
    }

    RenderableSub2(int i) {
        this.anInt6394 = i;
    }

    static final int method2497(byte[] is, byte i, String string, int i_10_) {
        try {
            anInt6399++;
            int i_11_ = i_10_;
            int i_12_ = string.length();
            int i_13_ = 0;
            if (i != 0) method2496(21, -5, true);
            for (/**/; i_12_ > i_13_; i_13_ += 4) {
                int i_14_ = Component134.method1399(7, string.charAt(i_13_));
                int i_15_ = (i_12_ > i_13_ - -1 ? Component134.method1399(7, string.charAt(1 + i_13_)) : -1);
                int i_16_ = (2 + i_13_ < i_12_ ? Component134.method1399(7, string.charAt(i_13_ + 2)) : -1);
                int i_17_ = (i_12_ <= 3 + i_13_ ? -1 : Component134.method1399(7, string.charAt(i_13_ + 3)));
                is[i_10_++] = (byte) Component224.bitwiseOr(i_14_ << 2, i_15_ >>> 4);
                if (i_16_ == -1) break;
                is[i_10_++] = (byte) Component224.bitwiseOr((GpsOverlay.bitwiseAnd(15, i_15_) << 4), i_16_ >>> 2);
                if (i_17_ == -1) break;
                is[i_10_++] = (byte) Component224.bitwiseOr((GpsOverlay.bitwiseAnd(3, i_16_) << 6), i_17_);
            }
            return -i_11_ + i_10_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("vo.B(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (string != null ? "{...}" : "null") + ',' + i_10_ + ')'));
        }
    }

    static final void method2498(Component103 class338, GraphicsToolkit var_ha, byte i, int i_18_) {
        try {
            anInt6395++;
            if (i > -101) anIntArray6393 = null;
            if (Player.anIntArray10566 != null && class338.aByte4181 >= i_18_) {
                for (int i_19_ = 0; (i_19_ < Player.anIntArray10566.length); i_19_++) {
                    if ((Player.anIntArray10566[i_19_] != -1000000) && (((Player.anIntArray10566[i_19_]) >= class338.anIntArray4191[0]) || (class338.anIntArray4191[1] <= (Player.anIntArray10566[i_19_])) || (class338.anIntArray4191[2] <= (Player.anIntArray10566[i_19_])) || ((Player.anIntArray10566[i_19_]) >= class338.anIntArray4191[3])) && ((class338.anIntArray4187[0] <= DisplayModeManagerContainer34.anIntArray8666[i_19_]) || (class338.anIntArray4187[1] <= DisplayModeManagerContainer34.anIntArray8666[i_19_]) || (class338.anIntArray4187[2] <= DisplayModeManagerContainer34.anIntArray8666[i_19_]) || (DisplayModeManagerContainer34.anIntArray8666[i_19_] >= class338.anIntArray4187[3])) && ((class338.anIntArray4187[0] >= AudioMixer.anIntArray3220[i_19_]) || (AudioMixer.anIntArray3220[i_19_] <= class338.anIntArray4187[1]) || (class338.anIntArray4187[2] >= AudioMixer.anIntArray3220[i_19_]) || (AudioMixer.anIntArray3220[i_19_] <= class338.anIntArray4187[3])) && ((Component201.anIntArray8712[i_19_] >= class338.anIntArray4184[0]) || (Component201.anIntArray8712[i_19_] >= class338.anIntArray4184[1]) || (class338.anIntArray4184[2] <= Component201.anIntArray8712[i_19_]) || (Component201.anIntArray8712[i_19_] >= class338.anIntArray4184[3])) && ((class338.anIntArray4184[0] >= client.anIntArray5176[i_19_]) || (class338.anIntArray4184[1] >= client.anIntArray5176[i_19_]) || (class338.anIntArray4184[2] >= client.anIntArray5176[i_19_]) || (class338.anIntArray4184[3] >= client.anIntArray5176[i_19_])))
                        return;
                }
            }
            if (class338.aByte4192 == 1) {
                int i_20_ = (Component197.anInt10084 + (-Component256.anInt6111 + class338.aShort4185));
                if (i_20_ >= 0 && i_20_ <= (Component197.anInt10084 + Component197.anInt10084)) {
                    int i_21_ = (Component197.anInt10084 + class338.aShort4193 - DebugPanicSub2.anInt8502);
                    if (i_21_ < 0) i_21_ = 0;
                    else if ((Component197.anInt10084 + Component197.anInt10084) < i_21_) return;
                    int i_22_ = (-DebugPanicSub2.anInt8502 + (class338.aShort4190 - -Component197.anInt10084));
                    if ((Component197.anInt10084 - -Component197.anInt10084) < i_22_) i_22_ = (Component197.anInt10084 - -Component197.anInt10084);
                    else if (i_22_ < 0) return;
                    boolean bool = false;
                    while (i_22_ >= i_21_) {
                        if (DisplayModeManagerContainer153.aBooleanArrayArray1572[i_20_][i_21_++]) {
                            bool = true;
                            break;
                        }
                    }
                    if (bool) {
                        float f = (float) (Component258.anInt1974 - (class338.anIntArray4187[0]));
                        if (f < 0.0F) f *= -1.0F;
                        if (!(f < (float) Component53.anInt194) && Component160.method3465(0, 1, class338) && Component160.method3465(1, 1, class338) && Component160.method3465(2, 1, class338) && Component160.method3465(3, 1, class338))
                            HashNodeSub19.aClass338Array9700[HashNodeSub10.activeOccluderCount++] = class338;
                    }
                }
            } else if (class338.aByte4192 == 2) {
                int i_23_ = (Component197.anInt10084 + (class338.aShort4193 - DebugPanicSub2.anInt8502));
                if (i_23_ >= 0 && i_23_ <= (Component197.anInt10084 + Component197.anInt10084)) {
                    int i_24_ = (class338.aShort4185 + (-Component256.anInt6111 + Component197.anInt10084));
                    if (i_24_ >= 0) {
                        if (i_24_ > (Component197.anInt10084 + Component197.anInt10084)) return;
                    } else i_24_ = 0;
                    int i_25_ = (-Component256.anInt6111 + (class338.aShort4182 - -Component197.anInt10084));
                    if ((Component197.anInt10084 + Component197.anInt10084) >= i_25_) {
                        if (i_25_ < 0) return;
                    } else i_25_ = (Component197.anInt10084 + Component197.anInt10084);
                    boolean bool = false;
                    while (i_24_ <= i_25_) {
                        if (DisplayModeManagerContainer153.aBooleanArrayArray1572[i_24_++][i_23_]) {
                            bool = true;
                            break;
                        }
                    }
                    if (bool) {
                        float f = (float) (DefinitionSub27.anInt9360 - (class338.anIntArray4184[0]));
                        if (f < 0.0F) f *= -1.0F;
                        if (!(f < (float) Component53.anInt194) && Component160.method3465(0, 1, class338) && Component160.method3465(1, 1, class338) && Component160.method3465(2, 1, class338) && Component160.method3465(3, 1, class338))
                            HashNodeSub19.aClass338Array9700[HashNodeSub10.activeOccluderCount++] = class338;
                    }
                }
            } else if (class338.aByte4192 == 16 || class338.aByte4192 == 8) {
                int i_26_ = (Component197.anInt10084 + (-Component256.anInt6111 + class338.aShort4185));
                if (i_26_ >= 0 && i_26_ <= (Component197.anInt10084 - -Component197.anInt10084)) {
                    int i_27_ = (class338.aShort4193 + (-DebugPanicSub2.anInt8502 - -Component197.anInt10084));
                    if (i_27_ >= 0 && ((Component197.anInt10084 - -Component197.anInt10084) >= i_27_) && DisplayModeManagerContainer153.aBooleanArrayArray1572[i_26_][i_27_]) {
                        float f = (float) (Component258.anInt1974 - (class338.anIntArray4187[0]));
                        if (f < 0.0F) f *= -1.0F;
                        float f_28_ = (float) (DefinitionSub27.anInt9360 + -(class338.anIntArray4184[0]));
                        if (f_28_ < 0.0F) f_28_ *= -1.0F;
                        if ((!(f < (float) Component53.anInt194) || !((float) Component53.anInt194 > f_28_)) && Component160.method3465(0, 1, class338) && Component160.method3465(1, 1, class338) && Component160.method3465(2, 1, class338) && Component160.method3465(3, 1, class338))
                            HashNodeSub19.aClass338Array9700[HashNodeSub10.activeOccluderCount++] = class338;
                    }
                }
            } else if (class338.aByte4192 == 4) {
                float f = (float) (-Component228.anInt3006 + class338.anIntArray4191[0]);
                if (!(f <= (float) GlToolkitSub2.anInt7714)) {
                    int i_29_ = (Component197.anInt10084 + -DebugPanicSub2.anInt8502 + class338.aShort4193);
                    if (i_29_ >= 0) {
                        if ((Component197.anInt10084 + Component197.anInt10084) < i_29_) return;
                    } else i_29_ = 0;
                    int i_30_ = (Component197.anInt10084 + -DebugPanicSub2.anInt8502 + class338.aShort4190);
                    if (i_30_ <= (Component197.anInt10084 + Component197.anInt10084)) {
                        if (i_30_ < 0) return;
                    } else i_30_ = (Component197.anInt10084 - -Component197.anInt10084);
                    int i_31_ = (-Component256.anInt6111 + (class338.aShort4185 + Component197.anInt10084));
                    if (i_31_ < 0) i_31_ = 0;
                    else if (i_31_ > (Component197.anInt10084 + Component197.anInt10084)) return;
                    int i_32_ = (Component197.anInt10084 + class338.aShort4182 - Component256.anInt6111);
                    if ((Component197.anInt10084 - -Component197.anInt10084) < i_32_) i_32_ = (Component197.anInt10084 + Component197.anInt10084);
                    else if (i_32_ < 0) return;
                    boolean bool = false;
                    while_102_:
                    for (int i_33_ = i_31_; i_33_ <= i_32_; i_33_++) {
                        for (int i_34_ = i_29_; i_30_ >= i_34_; i_34_++) {
                            if (DisplayModeManagerContainer153.aBooleanArrayArray1572[i_33_][i_34_]) {
                                bool = true;
                                break while_102_;
                            }
                        }
                    }
                    if (bool && Component160.method3465(0, 1, class338) && Component160.method3465(1, 1, class338) && Component160.method3465(2, 1, class338) && Component160.method3465(3, 1, class338)) HashNodeSub19.aClass338Array9700[HashNodeSub10.activeOccluderCount++] = class338;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("vo.A(" + (class338 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + i_18_ + ')'));
        }
    }

    static final boolean method2499(int i, int i_35_, int i_36_, int i_37_, int i_38_, byte i_39_, int i_40_) {
        anInt6398++;
        if (!DefinitionSub23.aBoolean9307 || !Component234.aBoolean351) return false;
        if (Component241.occludedPixelCount < 100) return false;
        if (i_38_ == i_40_ && i_36_ == i_35_) {
            if (!ShaderSub2.method164(i, i_38_, (byte) -97, i_36_)) return false;
            int i_41_ = i_38_ << Component149.anInt4459;
            int i_42_ = i_36_ << Component149.anInt4459;
            if (Component221.method1084(i_37_, Component148.anInt3465, i_42_, i_41_, ShaderSub1.aSArray5191[i].getHeight((byte) -86, i_36_, i_38_), Component148.anInt3465, 18507)) {
                DefinitionSub4.occludedCpCount++;
                return true;
            }
            return false;
        }
        if (i_39_ <= 101) method2499(66, -39, -55, 105, 96, (byte) 114, -44);
        for (int i_43_ = i_38_; i_43_ <= i_40_; i_43_++) {
            for (int i_44_ = i_36_; i_44_ <= i_35_; i_44_++) {
                if (Component160.anIntArrayArrayArray4356[i][i_43_][i_44_] == -RandomAccessFileReader.anInt3049) return false;
            }
        }
        int i_45_ = (i_38_ << Component149.anInt4459) + 1;
        int i_46_ = (i_36_ << Component149.anInt4459) + 2;
        if (!Component221.method1084(i_37_, (1 + -i_38_ + i_40_) * Component148.anInt3465, i_46_, i_45_, ShaderSub1.aSArray5191[i].getHeight((byte) -86, i_36_, i_38_), Component148.anInt3465 * (i_35_ + -i_36_ + 1), 18507)) return false;
        DefinitionSub4.occludedCpCount++;
        return true;
    }
}
