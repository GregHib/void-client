/* AbstractGlTextureSub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class AbstractGlTextureSub1
/**
 * RENAMED from `Class258_Sub1` (JODE-obfuscated).
 * Evidence: subclass of AbstractGlTexture (hierarchy)
 */ extends AbstractGlTexture {
    int anInt8522;
    int anInt8523;
    static int anInt8524;
    private int anInt8525 = -1;
    static int anInt8526;
    static Component184 aClass143_8527;
    private int anInt8528 = -1;
    int anInt8529;

    final void method1958(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        this.aHa_Sub2_4851.bindTexture((byte) -110, this);
        anInt8526++;
        OpenGL.glCopyTexSubImage3D(this.anInt4849, 0, i_2_, i_6_, i_4_, i_3_, i_0_, i_1_, i_5_);
        OpenGL.glFlush();
        if (i != -26823) aClass143_8527 = null;
    }

    public final void method37(int i) {
        anInt8524++;
        OpenGL.glFramebufferTexture3DEXT(anInt8528, anInt8525, this.anInt4849, 0, 0, 0);
        anInt8525 = -1;
        if (i != -3022) method1960(112, -107, -46, -98, null, null, null, null, null, null, -114, (byte) 75, -105, 62, true, false, 110, -31, true);
        anInt8528 = -1;
    }

    AbstractGlTextureSub1(GlToolkitSub2 var_ha_Sub2, int i, int i_7_, int i_8_, int i_9_, byte[] is, int i_10_) {
        super(var_ha_Sub2, 32879, i, i_7_ * (i_8_ * i_9_), false);
        try {
            this.anInt8523 = i_7_;
            this.anInt8522 = i_9_;
            this.anInt8529 = i_8_;
            this.aHa_Sub2_4851.bindTexture((byte) -84, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, i_10_, 5121, is, 0);
            OpenGL.glPixelStorei(3317, 4);
            this.method1957(9728, true);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("gj.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (is != null ? "{...}" : "null") + ',' + i_10_ + ')'));
        }
    }

    public static void method1959(int i) {
        int i_11_ = -121 / ((-52 - i) / 60);
        aClass143_8527 = null;
    }

    static final void method1960(int i, int i_12_, int i_13_, int i_14_, byte[][][] is, int[] is_15_, int[] is_16_, int[] is_17_, int[] is_18_, int[] is_19_, int i_20_, byte i_21_, int i_22_, int i_23_, boolean bool, boolean bool_24_, int i_25_, int i_26_, boolean bool_27_) {
        Component234.aBoolean351 = true;
        DisplayModeManagerContainer58.aBoolean10221 = JaclibLoader.toolkit.method3704() > 0;
        DefinitionSub17.aBoolean9242 = bool_24_;
        Component256.anInt6111 = i_12_ >> Component149.anInt4459;
        DebugPanicSub2.anInt8502 = i_14_ >> Component149.anInt4459;
        Component258.anInt1974 = i_12_;
        DefinitionSub27.anInt9360 = i_14_;
        Component228.anInt3006 = i_13_;
        NameFormatter.anInt492 = Component256.anInt6111 - Component197.anInt10084;
        if (NameFormatter.anInt492 < 0) {
            SpriteSub1.anInt8412 = -NameFormatter.anInt492;
            NameFormatter.anInt492 = 0;
        } else SpriteSub1.anInt8412 = 0;
        NodeSub34.anInt6974 = DebugPanicSub2.anInt8502 - Component197.anInt10084;
        if (NodeSub34.anInt6974 < 0) {
            Component49.anInt4686 = -NodeSub34.anInt6974;
            NodeSub34.anInt6974 = 0;
        } else Component49.anInt4686 = 0;
        DisplayModeManagerContainer91.anInt387 = Component256.anInt6111 + Component197.anInt10084;
        if (DisplayModeManagerContainer91.anInt387 > StaticElementRenderer.anInt6451) DisplayModeManagerContainer91.anInt387 = StaticElementRenderer.anInt6451;
        Component210.anInt5293 = DebugPanicSub2.anInt8502 + Component197.anInt10084;
        if (Component210.anInt5293 > NodeSub41.anInt7054) Component210.anInt5293 = NodeSub41.anInt7054;
        boolean[][] bools = DisplayModeManagerContainer153.aBooleanArrayArray1572;
        boolean[][] bools_28_ = NodeSub8.aBooleanArrayArray6656;
        if (DefinitionSub17.aBoolean9242) {
            for (int i_29_ = 0; i_29_ < (Component197.anInt10084 + Component197.anInt10084 + 2); i_29_++) {
                int i_30_ = 0;
                int i_31_ = 0;
                for (int i_32_ = 0; i_32_ < (Component197.anInt10084 + Component197.anInt10084 + 2); i_32_++) {
                    if (i_32_ > 1) Component382.anIntArray2272[i_32_ - 2] = i_30_;
                    i_30_ = i_31_;
                    int i_33_ = (Component256.anInt6111 - Component197.anInt10084 + i_29_);
                    int i_34_ = (DebugPanicSub2.anInt8502 - Component197.anInt10084 + i_32_);
                    if (i_33_ >= 0 && i_34_ >= 0 && i_33_ < StaticElementRenderer.anInt6451 && i_34_ < NodeSub41.anInt7054) {
                        int i_35_ = i_33_ << Component149.anInt4459;
                        int i_36_ = i_34_ << Component149.anInt4459;
                        int i_37_ = (NodeSub1Sub1.aSArray8801[NodeSub1Sub1.aSArray8801.length - 1].getHeight((byte) -86, i_34_, i_33_) - (1000 << Component149.anInt4459 - 7));
                        int i_38_ = (Component9.aSArray4142 != null ? (Component9.aSArray4142[0].getHeight((byte) -86, i_34_, i_33_) + Component148.anInt3465) : (NodeSub1Sub1.aSArray8801[0].getHeight((byte) -86, i_34_, i_33_) + Component148.anInt3465));
                        i_31_ = (i_25_ >= 0 ? JaclibLoader.toolkit.r(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_, i_25_) : JaclibLoader.toolkit.JA(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_));
                        NodeSub8.aBooleanArrayArray6656[i_29_][i_32_] = i_31_ == 0;
                    } else {
                        i_31_ = -1;
                        NodeSub8.aBooleanArrayArray6656[i_29_][i_32_] = false;
                    }
                    if (i_29_ > 0 && i_32_ > 0) {
                        int i_39_ = (Component382.anIntArray2272[i_32_ - 1] & Component382.anIntArray2272[i_32_] & i_30_ & i_31_);
                        DisplayModeManagerContainer153.aBooleanArrayArray1572[i_29_ - 1][i_32_ - 1] = i_39_ == 0;
                    }
                }
                Component382.anIntArray2272[(Component197.anInt10084 + Component197.anInt10084)] = i_30_;
                Component382.anIntArray2272[(Component197.anInt10084 + Component197.anInt10084 + 1)] = i_31_;
            }
            if (i_25_ >= 0) Component234.aBoolean351 = false;
            else {
                Player.anIntArray10566 = is_15_;
                AudioMixer.anIntArray3220 = is_16_;
                DisplayModeManagerContainer34.anIntArray8666 = is_17_;
                Component201.anIntArray8712 = is_18_;
                client.anIntArray5176 = is_19_;
                HashNodeSub14.method3241(i_20_, (byte) 39, JaclibLoader.toolkit);
            }
        } else {
            if (Component76.aBooleanArrayArray8596 == null) Component76.aBooleanArrayArray8596 = (new boolean
                    [StaticElementRenderer.anInt6451 + StaticElementRenderer.anInt6451 + 1]
                    [(NodeSub41.anInt7054 + StaticElementRenderer.anInt6451 + 1)]);
            for (int i_40_ = 0; i_40_ < Component76.aBooleanArrayArray8596.length; i_40_++) {
                for (int i_41_ = 0; i_41_ < Component76.aBooleanArrayArray8596[0].length; i_41_++)
                    Component76.aBooleanArrayArray8596[i_40_][i_41_] = true;
            }
            NodeSub8.aBooleanArrayArray6656 = Component76.aBooleanArrayArray8596;
            DisplayModeManagerContainer153.aBooleanArrayArray1572 = Component76.aBooleanArrayArray8596;
            NameFormatter.anInt492 = 0;
            NodeSub34.anInt6974 = 0;
            DisplayModeManagerContainer91.anInt387 = StaticElementRenderer.anInt6451;
            Component210.anInt5293 = NodeSub41.anInt7054;
            Component234.aBoolean351 = false;
        }
        Component315.method1877(JaclibLoader.toolkit, -69);
        if (!DisplayModeManagerContainer5.aClass76_1208.aBoolean1283) {
            Component315 class243 = DisplayModeManagerContainer5.aClass76_1208.aClass243_1282;
            for (RenderableSub4 class318_sub4 = (RenderableSub4) class243.method1872(8); class318_sub4 != null; class318_sub4 = (RenderableSub4) class243.method1878((byte) 125)) {
                class318_sub4.unlink(false);
                Component350.method560(class318_sub4, 6);
            }
        }
        if (DisplayModeManagerContainer58.aBoolean10221) {
            for (int i_42_ = 0; i_42_ < Component374.anInt4135; i_42_++)
                Component329.aClass211Array5993[i_42_].method1544(8688, bool, i);
        }
        if (DefinitionSub5.aBoolean9121) {
            RSACipher.anIntArray4906 = JaclibLoader.toolkit.Y();
            JaclibLoader.toolkit.K(DefinitionSub10.anIntArray9183);
            int i_43_ = ((DefinitionSub10.anIntArray9183[2] - DefinitionSub10.anIntArray9183[0]) / DisplayModeManagerContainer216.anInt5652);
            for (int i_44_ = 0; i_44_ < DisplayModeManagerContainer216.anInt5652 - 1; i_44_++)
                DisplayModeManagerContainer167.anIntArray256[i_44_] = i_43_ * (i_44_ + 1) + Component35.anIntArray4271[i_44_];
            for (int i_45_ = 0; i_45_ < LoggedOutDefinition.aClass293Array9432.length; i_45_++)
                LoggedOutDefinition.aClass293Array9432[i_45_].method2209();
        }
        if (ImageProducerSprite.aClass357ArrayArrayArray9082 != null) {
            if (DefinitionSub5.aBoolean9121) DebugPanicSub1.method2131(0);
            Component315.method1879(true);
            JaclibLoader.toolkit.ra(-1, 1583160, 40, 127);
            Component182.renderScene(true, is, i_20_, i_21_, i_25_, i_26_, bool_27_);
            if (DefinitionSub5.aBoolean9121) DisplayModeManagerContainer42.method2290();
            JaclibLoader.toolkit.pa();
            Component315.method1879(false);
        }
        Component182.renderScene(false, is, i_20_, i_21_, i_25_, i_26_, bool_27_);
        if (DefinitionSub5.aBoolean9121) {
            for (int i_46_ = 0; i_46_ < Component291.anInt2524; i_46_++)
                Component2.aBooleanArrayArrayArray8361[i_46_] = Component95.aBooleanArrayArrayArray1751[i_46_];
            DebugPanicSub1.method2131(0);
            for (int i_47_ = 0; i_47_ < LoggedOutDefinition.aClass293Array9432.length; i_47_++)
                LoggedOutDefinition.aClass293Array9432[i_47_].method2209();
        }
        if (DefinitionSub5.aBoolean9121) {
            DisplayModeManagerContainer42.method2290();
            for (int i_48_ = 0; i_48_ < Component291.anInt2524; i_48_++)
                Component95.aBooleanArrayArrayArray1751[i_48_] = Component2.aBooleanArrayArrayArray8361[i_48_];
            if (Npc.anInt10503 == 2) {
                if (Component334.aLongArray2013[0] < Component334.aLongArray2013[1]) {
                    if (DisplayModeManagerContainer167.anIntArray256[0] + Component35.anIntArray4271[0] > DefinitionSub10.anIntArray9183[0]) Component35.anIntArray4271[0]++;
                } else if ((Component334.aLongArray2013[0] > Component334.aLongArray2013[1]) && ((DisplayModeManagerContainer167.anIntArray256[0] + Component35.anIntArray4271[0]) < DefinitionSub10.anIntArray9183[2])) Component35.anIntArray4271[0]--;
            }
        }
        if (!DefinitionSub17.aBoolean9242) {
            DisplayModeManagerContainer153.aBooleanArrayArray1572 = bools;
            NodeSub8.aBooleanArrayArray6656 = bools_28_;
        }
        DebugOverlay.drawStats();
    }

    AbstractGlTextureSub1(GlToolkitSub2 var_ha_Sub2, int i, int i_49_, int i_50_, int i_51_) {
        super(var_ha_Sub2, 32879, i, i_51_ * i_49_ * i_50_, false);
        this.anInt8523 = i_49_;
        this.anInt8529 = i_50_;
        this.anInt8522 = i_51_;
        this.aHa_Sub2_4851.bindTexture((byte) -123, this);
        OpenGL.glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, SceneNode.method2779(true, (this.anInt4858)), 5121, null, 0);
        this.method1957(9728, true);
    }
}
