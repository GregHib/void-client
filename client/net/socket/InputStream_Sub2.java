/* InputStream_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.InputStream;

final class InputStream_Sub2 extends InputStream {
    static int anInt80;
    static int anInt81;
    static Component183 aClass114_82 = new Component183(71, 7);
    static Component315 aClass243_83 = new Component315();
    static float[] aFloatArray84 = new float[4];
    static int anInt85;

    public static void method127(byte i) {
        if (i != 118) method128(null, (byte) -48);
        aFloatArray84 = null;
        aClass243_83 = null;
        aClass114_82 = null;
    }

    static final void method128(DisplayModeManagerContainer238 class74, byte i) {
        try {
            anInt81++;
            if (class74 == Request.aClass74_6891) {
                int i_0_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) -124);
                int i_1_ = i_0_ >> 2;
                int i_2_ = 0x3 & i_0_;
                int i_3_ = Component129.anIntArray487[i_1_];
                int i_4_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_5_ = Component80.aClass348_Sub49_Sub2_3813.readByteAdd((byte) 65);
                int i_6_ = DisplayModeManagerContainer347.anInt3581 + (0x7 & i_5_ >> 4);
                int i_7_ = DisplayModeManagerContainer306.anInt4786 - -(i_5_ & 0x7);
                if (Component21.method2112(126, Component37.anInt3931) || (i_6_ >= 0 && i_7_ >= 0 && AbstractShaderSub4.anInt7319 > i_6_ && (i_7_ < ParametricDefinition.anInt9109))) NodeSub12.method2800(GradientPreset.anInt9200, 0, i_7_, -1, i_1_, i_3_, i_2_, i_4_, (byte) 121, i_6_);
            } else if (class74 == DefinitionSub38.aClass74_9475) {
                int i_8_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                int i_9_ = DisplayModeManagerContainer347.anInt3581 + ((0x7a & i_8_) >> 4);
                int i_10_ = DisplayModeManagerContainer306.anInt4786 - -(i_8_ & 0x7);
                int i_11_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_12_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_13_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_14_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i ^ 0xf7);
                if (i_9_ >= 0 && i_10_ >= 0 && i_9_ < AbstractShaderSub4.anInt7319 && ParametricDefinition.anInt9109 > i_10_) {
                    int i_15_ = 512 * i_9_ - -256;
                    int i_16_ = 256 + 512 * i_10_;
                    int i_17_ = GradientPreset.anInt9200;
                    if (i_17_ < 3 && NpcComposition.method802(i_10_, i_9_, true)) i_17_++;
                    DisplayModeManagerContainer104 class318_sub1_sub3_sub4 = (new DisplayModeManagerContainer104(i_11_, i_13_, OpenGlShader.clientCycle, GradientPreset.anInt9200, i_17_, i_15_, Component300.method2064(i_15_, GradientPreset.anInt9200, 11219, i_16_) + -i_12_, i_16_, i_9_, i_9_, i_10_, i_10_, i_14_));
                    CacheNodeSub2.aClass262_10492.addTail(new PauseHandler(class318_sub1_sub3_sub4), -20180);
                }
            } else if (class74 == GnpPositionLogger.aClass74_1519) {
                int i_18_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_19_ = DisplayModeManagerContainer347.anInt3581 - -(i_18_ >> 4 & 0x7);
                int i_20_ = (0x7 & i_18_) + DisplayModeManagerContainer306.anInt4786;
                int i_21_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                if (i_21_ == 65535) i_21_ = -1;
                int i_22_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                int i_23_ = i_22_ >> 4 & 0xf;
                int i_24_ = 0x7 & i_22_;
                int i_25_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_26_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_27_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                if (i_19_ >= 0 && i_20_ >= 0 && i_19_ < AbstractShaderSub4.anInt7319 && (i_20_ < ParametricDefinition.anInt9109)) {
                    int i_28_ = 1 + i_23_;
                    if (((Component72.localPlayer.anIntArray10320[0]) >= i_19_ + -i_28_) && i_28_ + i_19_ >= (Component72.localPlayer.anIntArray10320[0]) && ((Component72.localPlayer.anIntArray10317[0]) >= -i_28_ + i_20_) && i_20_ + i_28_ >= (Component72.localPlayer.anIntArray10317[0]))
                        Component98.queueAreaSound(i_21_, i_26_, false, ((i_20_ << 8) + (((GradientPreset.anInt9200) << 24) + ((i_19_ << 16) - -i_23_))), (byte) -98, i_24_, i_27_, i_25_);
                }
            } else if (class74 == NodeSub35.aClass74_6977) {
                int i_29_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_30_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                GradientPreset.aClass263_9195.getObjectDefinition(0, i_29_).method478(i_30_, -31076);
            } else if (GpiLogger.aClass74_8853 == class74) {
                int i_31_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                int i_32_ = DisplayModeManagerContainer347.anInt3581 + ((i_31_ & 0x7b) >> 4);
                int i_33_ = (i_31_ & 0x7) + DisplayModeManagerContainer306.anInt4786;
                int i_34_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                if (i_34_ == 65535) i_34_ = -1;
                int i_35_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                int i_36_ = 0xf & i_35_ >> 4;
                int i_37_ = 0x7 & i_35_;
                int i_38_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_39_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i ^ 0xf7);
                int i_40_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                if (i_32_ >= 0 && i_33_ >= 0 && i_32_ < AbstractShaderSub4.anInt7319 && i_33_ < ParametricDefinition.anInt9109) {
                    int i_41_ = i_36_ + 1;
                    if ((Component72.localPlayer.anIntArray10320[0]) >= i_32_ - i_41_ && (Component72.localPlayer.anIntArray10320[0]) <= i_41_ + i_32_ && ((Component72.localPlayer.anIntArray10317[0]) >= -i_41_ + i_33_) && (i_33_ - -i_41_ >= (Component72.localPlayer.anIntArray10317[0])))
                        NameFormatter.queueSoundEffect(i_37_, (i_36_ + (i_33_ << 8) + ((GradientPreset.anInt9200 << 24) + (i_32_ << 16))), i_38_, i_39_, i_40_, i_34_, -29494);
                }
            } else if (DisplayModeManagerContainer232.aClass74_4689 == class74) {
                int i_42_ = Component80.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                if (i_42_ == 65535) i_42_ = -1;
                int i_43_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 65);
                int i_44_ = ((i_43_ & 0x71) >> 4) + DisplayModeManagerContainer347.anInt3581;
                int i_45_ = DisplayModeManagerContainer306.anInt4786 + (i_43_ & 0x7);
                int i_46_ = Component80.aClass348_Sub49_Sub2_3813.readByteInverse((byte) 21);
                int i_47_ = i_46_ >> 2;
                int i_48_ = i_46_ & 0x3;
                int i_49_ = Component129.anIntArray487[i_47_];
                GlToolkitSub3.method3824(i_45_, i_42_, i_47_, i_44_, i_48_, 115, GradientPreset.anInt9200, i_49_);
            } else if (class74 == ArbShaderProgram.aClass74_6201) {
                int i_50_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_51_ = (i_50_ >> 4 & 0xf) + DisplayModeManagerContainer347.anInt3581 * 2;
                int i_52_ = (i_50_ & 0xf) + DisplayModeManagerContainer306.anInt4786 * 2;
                int i_53_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                boolean bool = (0x1 & i_53_) != 0;
                boolean bool_54_ = (i_53_ & 0x2) != 0;
                int i_55_ = bool_54_ ? i_53_ >> 2 : -1;
                int i_56_ = (Component80.aClass348_Sub49_Sub2_3813.readByte(-77) + i_51_);
                int i_57_ = (Component80.aClass348_Sub49_Sub2_3813.readByte(-88) + i_52_);
                int i_58_ = Component80.aClass348_Sub49_Sub2_3813.readShort(13638);
                int i_59_ = Component80.aClass348_Sub49_Sub2_3813.readShort(13638);
                int i_60_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                int i_61_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                if (!bool_54_) i_61_ *= 4;
                else i_61_ = (byte) i_61_;
                int i_62_ = (Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i ^ 0xf7) * 4);
                int i_63_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                int i_64_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                int i_65_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_66_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                if (i_65_ == 255) i_65_ = -1;
                if (i_51_ >= 0 && i_52_ >= 0 && (i_51_ < 2 * AbstractShaderSub4.anInt7319) && (i_52_ < AbstractShaderSub4.anInt7319 * 2) && i_56_ >= 0 && i_57_ >= 0 && (i_56_ < ParametricDefinition.anInt9109 * 2) && 2 * ParametricDefinition.anInt9109 > i_57_ && i_60_ != 65535) {
                    i_57_ *= 256;
                    i_56_ = 256 * i_56_;
                    i_62_ <<= 2;
                    i_51_ = 256 * i_51_;
                    i_66_ <<= 2;
                    i_61_ <<= 2;
                    i_52_ *= 256;
                    if (i_58_ != 0 && i_55_ != -1) {
                        DisplayModeManagerContainer58 class318_sub1_sub3_sub3 = null;
                        if (i_58_ < 0) {
                            int i_67_ = -i_58_ + -1;
                            if (StringDefinition.anInt9591 != i_67_) class318_sub1_sub3_sub3 = (InterfaceRenderer.players[i_67_]);
                            else class318_sub1_sub3_sub3 = (Component72.localPlayer);
                        } else {
                            int i_68_ = i_58_ + -1;
                            NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_68_, -6008));
                            if (class348_sub22 != null) class318_sub1_sub3_sub3 = (class348_sub22.npc);
                        }
                        if (class318_sub1_sub3_sub3 != null) {
                            Component241 class225 = class318_sub1_sub3_sub3.getDefinition((byte) 72);
                            if ((class225.anIntArrayArray2939 != null) && (class225.anIntArrayArray2939[i_55_]) != null) i_61_ -= (class225.anIntArrayArray2939[i_55_][1]);
                            if ((class225.anIntArrayArray2910 != null) && (class225.anIntArrayArray2910[i_55_]) != null) i_61_ -= (class225.anIntArrayArray2910[i_55_][1]);
                        }
                    }
                    DisplayModeManagerContainer174 class318_sub1_sub3_sub5 = (new DisplayModeManagerContainer174(i_60_, GradientPreset.anInt9200, GradientPreset.anInt9200, i_51_, i_52_, i_61_, i_63_ - -OpenGlShader.clientCycle, i_64_ + OpenGlShader.clientCycle, i_65_, i_66_, i_58_, i_59_, i_62_, bool, i_55_));
                    class318_sub1_sub3_sub5.method2471((byte) -103, (-i_62_ + Component300.method2064(i_56_, GradientPreset.anInt9200, 11219, i_57_)), i_57_, i_63_ + OpenGlShader.clientCycle, i_56_);
                    DefinitionSub17.aClass262_9240.addTail(new HashNodeSub18(class318_sub1_sub3_sub5), -20180);
                }
            } else if (class74 == PacketReader.aClass74_10437) {
                int i_69_ = Component80.aClass348_Sub49_Sub2_3813.readShortAddLittle(-128);
                int i_70_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByteSubtract((byte) 31);
                int i_71_ = DisplayModeManagerContainer306.anInt4786 + (i_70_ & 0x7);
                int i_72_ = Component330.regionTileY + i_71_;
                int i_73_ = DisplayModeManagerContainer347.anInt3581 + (i_70_ >> 4 & 0x7);
                int i_74_ = NodeBaseSub2.regionTileX + i_73_;
                NodeSub37 class348_sub37 = ((NodeSub37) (Component387.aClass356_1895.get(i_72_ << 14 | GradientPreset.anInt9200 << 28 | i_74_, -6008)));
                if (class348_sub37 != null) {
                    for (NodeSub34 class348_sub34 = ((NodeSub34) class348_sub37.aClass262_6998.first(4)); class348_sub34 != null; class348_sub34 = ((NodeSub34) class348_sub37.aClass262_6998.next((byte) 49))) {
                        if ((0x7fff & i_69_) == class348_sub34.anInt6973) {
                            class348_sub34.unlink((byte) 127);
                            break;
                        }
                    }
                    if (class348_sub37.aClass262_6998.isEmpty((byte) 18)) class348_sub37.unlink((byte) 62);
                    if (i_73_ >= 0 && i_71_ >= 0 && AbstractShaderSub4.anInt7319 > i_73_ && ParametricDefinition.anInt9109 > i_71_) DisplayModeManagerContainer351.method1479(i_71_, (byte) -125, i_73_, GradientPreset.anInt9200);
                }
            } else if (DisplayModeManagerContainer34.aClass74_8662 == class74) {
                int i_75_ = Component80.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                int i_76_ = Component80.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                int i_77_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                int i_78_ = DisplayModeManagerContainer306.anInt4786 - -(0x7 & i_77_);
                int i_79_ = i_78_ + Component330.regionTileY;
                int i_80_ = DisplayModeManagerContainer347.anInt3581 - -((i_77_ & 0x79) >> 4);
                int i_81_ = NodeBaseSub2.regionTileX - -i_80_;
                boolean bool = (i_80_ >= 0 && i_78_ >= 0 && AbstractShaderSub4.anInt7319 > i_80_ && ParametricDefinition.anInt9109 > i_78_);
                if (bool || Component21.method2112(124, Component37.anInt3931)) {
                    Component48.method3459(new NodeSub34(i_76_, i_75_), GradientPreset.anInt9200, i_79_, i_81_, -2);
                    if (bool) DisplayModeManagerContainer351.method1479(i_78_, (byte) -124, i_80_, GradientPreset.anInt9200);
                }
            } else if (class74 == DisplayModeManagerContainer152.aClass74_4537) {
                int i_82_ = Component80.aClass348_Sub49_Sub2_3813.readByteAdd((byte) 83);
                int i_83_ = i_82_ >> 2;
                int i_84_ = 0x3 & i_82_;
                int i_85_ = Component129.anIntArray487[i_83_];
                int i_86_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i ^ 0xf7);
                int i_87_ = DisplayModeManagerContainer347.anInt3581 + (i_86_ >> 4 & 0x7);
                int i_88_ = DisplayModeManagerContainer306.anInt4786 - -(0x7 & i_86_);
                if (Component21.method2112(i ^ 0x73, Component37.anInt3931) || (i_87_ >= 0 && i_88_ >= 0 && AbstractShaderSub4.anInt7319 > i_87_ && (i_88_ < ParametricDefinition.anInt9109))) NodeSub12.method2800(GradientPreset.anInt9200, 0, i_88_, -1, i_83_, i_85_, i_84_, -1, (byte) 125, i_87_);
            } else {
                if (i != 8) aClass114_82 = null;
                if (DisplayModeManagerContainer271.aClass74_515 == class74) {
                    int i_89_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    int i_90_ = DisplayModeManagerContainer306.anInt4786 + (0x7 & i_89_);
                    int i_91_ = i_90_ + Component330.regionTileY;
                    int i_92_ = (DisplayModeManagerContainer347.anInt3581 - -((i_89_ & 0x7a) >> 4));
                    int i_93_ = NodeBaseSub2.regionTileX + i_92_;
                    int i_94_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                    int i_95_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                    int i_96_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                    if (Component387.aClass356_1895 != null) {
                        NodeSub37 class348_sub37 = ((NodeSub37) (Component387.aClass356_1895.get(i_93_ | ((GradientPreset.anInt9200 << 28) | i_91_ << 14), -6008)));
                        if (class348_sub37 != null) {
                            for (NodeSub34 class348_sub34 = ((NodeSub34) class348_sub37.aClass262_6998.first(4)); class348_sub34 != null; class348_sub34 = ((NodeSub34) class348_sub37.aClass262_6998.next((byte) 34))) {
                                if ((class348_sub34.anInt6973) == (0x7fff & i_94_) && i_95_ == class348_sub34.anInt6971) {
                                    class348_sub34.unlink((byte) 32);
                                    class348_sub34.anInt6971 = i_96_;
                                    Component48.method3459(class348_sub34, (GradientPreset.anInt9200), i_91_, i_93_, i ^ ~0x9);
                                    break;
                                }
                            }
                            if (i_92_ >= 0 && i_90_ >= 0 && (i_92_ < AbstractShaderSub4.anInt7319) && (ParametricDefinition.anInt9109 > i_90_)) DisplayModeManagerContainer351.method1479(i_90_, (byte) -125, i_92_, (GradientPreset.anInt9200));
                        }
                    }
                } else if (class74 == DisplayModeManagerContainer363.aClass74_4098) {
                    int i_97_ = Component80.aClass348_Sub49_Sub2_3813.readShortLittle(false);
                    int i_98_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    int i_99_ = (0x7 & i_98_) + DisplayModeManagerContainer306.anInt4786;
                    int i_100_ = Component330.regionTileY + i_99_;
                    int i_101_ = DisplayModeManagerContainer347.anInt3581 - -((i_98_ & 0x7b) >> 4);
                    int i_102_ = NodeBaseSub2.regionTileX + i_101_;
                    int i_103_ = Component80.aClass348_Sub49_Sub2_3813.readShortAdd(-25);
                    int i_104_ = Component80.aClass348_Sub49_Sub2_3813.readShortAdd(123);
                    if (i_104_ != StringDefinition.anInt9591) {
                        boolean bool = (i_101_ >= 0 && i_99_ >= 0 && (i_101_ < AbstractShaderSub4.anInt7319) && (i_99_ < ParametricDefinition.anInt9109));
                        if (bool || Component21.method2112(122, Component37.anInt3931)) {
                            Component48.method3459(new NodeSub34(i_103_, i_97_), GradientPreset.anInt9200, i_100_, i_102_, i + -10);
                            if (bool) DisplayModeManagerContainer351.method1479(i_99_, (byte) -120, i_101_, (GradientPreset.anInt9200));
                        }
                    }
                } else if (class74 == DisplayModeManagerContainer133.aClass74_2157) {
                    int i_105_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                    boolean bool = (0x80 & i_105_) != 0;
                    int i_106_ = DisplayModeManagerContainer347.anInt3581 - -(i_105_ >> 3 & 0x7);
                    int i_107_ = (0x7 & i_105_) + DisplayModeManagerContainer306.anInt4786;
                    int i_108_ = i_106_ - -Component80.aClass348_Sub49_Sub2_3813.readByte(-94);
                    int i_109_ = (Component80.aClass348_Sub49_Sub2_3813.readByte(-87) + i_107_);
                    int i_110_ = Component80.aClass348_Sub49_Sub2_3813.readShort(13638);
                    int i_111_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                    int i_112_ = (Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) * 4);
                    int i_113_ = (Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255) * 4);
                    int i_114_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                    int i_115_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(i + 842397936);
                    int i_116_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    if (i_116_ == 255) i_116_ = -1;
                    int i_117_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(842397944);
                    if (i_106_ >= 0 && i_107_ >= 0 && (i_106_ < AbstractShaderSub4.anInt7319) && i_107_ < ParametricDefinition.anInt9109 && i_108_ >= 0 && i_109_ >= 0 && AbstractShaderSub4.anInt7319 > i_108_ && (ParametricDefinition.anInt9109 > i_109_) && i_111_ != 65535) {
                        i_117_ <<= 2;
                        i_109_ = 256 + i_109_ * 512;
                        i_113_ <<= 2;
                        i_108_ = 256 + 512 * i_108_;
                        i_107_ = i_107_ * 512 + 256;
                        i_106_ = i_106_ * 512 + 256;
                        i_112_ <<= 2;
                        DisplayModeManagerContainer174 class318_sub1_sub3_sub5 = (new DisplayModeManagerContainer174(i_111_, GradientPreset.anInt9200, GradientPreset.anInt9200, i_106_, i_107_, i_112_, i_114_ + OpenGlShader.clientCycle, OpenGlShader.clientCycle + i_115_, i_116_, i_117_, 0, i_110_, i_113_, bool, -1));
                        class318_sub1_sub3_sub5.method2471((byte) -103, Component300.method2064(i_108_, (GradientPreset.anInt9200), 11219, i_109_) + -i_113_, i_109_, i_114_ + OpenGlShader.clientCycle, i_108_);
                        DefinitionSub17.aClass262_9240.addTail(new HashNodeSub18(class318_sub1_sub3_sub5), -20180);
                    }
                } else if (DisplayModeManagerContainer51.aClass74_2491 == class74) {
                    Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    int i_118_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(i + 247);
                    int i_119_ = (i_118_ >> 4 & 0x7) + DisplayModeManagerContainer347.anInt3581;
                    int i_120_ = (0x7 & i_118_) + DisplayModeManagerContainer306.anInt4786;
                    int i_121_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedShort(i ^ 0x3235f8f0);
                    int i_122_ = Component80.aClass348_Sub49_Sub2_3813.readUnsignedByte(255);
                    int i_123_ = Component80.aClass348_Sub49_Sub2_3813.readMedium(-1);
                    String string = Component80.aClass348_Sub49_Sub2_3813.readString((byte) -126);
                    BuildInfo.method205(i_121_, i_119_, i_123_, string, i_122_, -109, i_120_, GradientPreset.anInt9200);
                } else {
                    ClientErrorReporter.reportError("T3 - " + class74, null, 15004);
                    LoggedOutDefinition.disconnectAndReset(false, (byte) 11);
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("sfa.A(" + (class74 != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }

    public final int read() {
        SpriteAtlasShader.sleep((byte) -118, 30000L);
        anInt80++;
        return -1;
    }
}
