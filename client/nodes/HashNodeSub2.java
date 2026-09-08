/* HashNodeSub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class HashNodeSub2
/**
 * RENAMED from `Class348_Sub42_Sub2` (JODE-obfuscated).
 * Evidence: subclass of HashNode (hierarchy)
 */ extends HashNode implements Interface9 {
    static int anInt8561;
    private int anInt8562 = -1;
    private int anInt8563 = -1;
    private final GlToolkitSub2 aHa_Sub2_8564;
    int anInt8565;
    static int anInt8566;
    private final int anInt8567;
    static int anInt8568;
    private int anInt8569;
    static int anInt8570;
    private final int anInt8571;
    int anInt8572;
    static long aLong8573 = 0L;

    protected final void finalize() throws Throwable {
        anInt8570++;
        method3172(4);
        super.finalize();
    }

    static final void method3171(GraphicsToolkit var_ha, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
        JaclibLoader.toolkit = var_ha;
        Npc.anInt10503 = i;
        DefinitionSub5.aBoolean9121 = (Npc.anInt10503 > 1 && JaclibLoader.toolkit.method3708());
        Component149.anInt4459 = i_0_;
        Component148.anInt3465 = 1 << Component149.anInt4459;
        DisplayModeManagerContainer64.anInt9037 = Component148.anInt3465 >> 1;
        Math.sqrt((DisplayModeManagerContainer64.anInt9037 * DisplayModeManagerContainer64.anInt9037) + (DisplayModeManagerContainer64.anInt9037 * DisplayModeManagerContainer64.anInt9037));
        Component291.anInt2524 = i_1_;
        StaticElementRenderer.anInt6451 = i_2_;
        NodeSub41.anInt7054 = i_3_;
        Component197.anInt10084 = i_4_;
        Component230.aClass47_5262 = GpiLogger.method2826(15);
        NodeSub45.method3309(-124);
        Component304.aClass357ArrayArrayArray1148 = (new Component186[i_1_][StaticElementRenderer.anInt6451]
                [NodeSub41.anInt7054]);
        NodeSub1Sub1.aSArray8801 = new s[i_1_];
        if (bool) {
            DisplayModeManagerContainer173.anIntArrayArray4253 = new int[StaticElementRenderer.anInt6451][NodeSub41.anInt7054];
            NodeSub1Sub2.aByteArrayArray8816 = new byte[StaticElementRenderer.anInt6451][NodeSub41.anInt7054];
            Component175.aShortArrayArray5847 = new short[StaticElementRenderer.anInt6451][NodeSub41.anInt7054];
            ImageProducerSprite.aClass357ArrayArrayArray9082 = (new Component186[1][StaticElementRenderer.anInt6451]
                    [NodeSub41.anInt7054]);
            Component9.aSArray4142 = new s[1];
        } else {
            DisplayModeManagerContainer173.anIntArrayArray4253 = null;
            NodeSub1Sub2.aByteArrayArray8816 = null;
            Component175.aShortArrayArray5847 = null;
            ImageProducerSprite.aClass357ArrayArrayArray9082 = null;
            Component9.aSArray4142 = null;
        }
        if (bool_5_) {
            PacketReader.aLongArrayArrayArray10431 = new long[i_1_][i_2_][i_3_];
            Component329.aClass211Array5993 = new DisplayModeManagerContainer159[65535];
            r.aBooleanArray9718 = new boolean[65535];
            Component374.anInt4135 = 0;
        } else {
            PacketReader.aLongArrayArrayArray10431 = null;
            Component329.aClass211Array5993 = null;
            r.aBooleanArray9718 = null;
            Component374.anInt4135 = 0;
        }
        Component315.method1879(false);
        Node.aClass318_Sub1Array4293 = new RenderableObject[2];
        AudioMixer.aClass318_Sub1Array3226 = new RenderableObject[2];
        Component95.aClass318_Sub1Array1754 = new RenderableObject[2];
        Component71.aClass318_Sub1Array6066 = new RenderableObject[10000];
        Component305.opaqueOnscreenCount = 0;
        ReferenceTable.aClass318_Sub1Array3737 = new RenderableObject[5000];
        HashNodeSub3.translucentOnscreenCount = 0;
        DisplayModeManagerContainer310.aClass318_Sub1_Sub3Array357 = new Component327[5000];
        Component328.dynamicOnscreenCount = 0;
        DisplayModeManagerContainer153.aBooleanArrayArray1572 = (new boolean
                [(Component197.anInt10084 + Component197.anInt10084 + 1)]
                [(Component197.anInt10084 + Component197.anInt10084 + 1)]);
        NodeSub8.aBooleanArrayArray6656 = (new boolean
                [(Component197.anInt10084 + Component197.anInt10084 + 2)]
                [(Component197.anInt10084 + Component197.anInt10084 + 2)]);
        Component382.anIntArray2272 = new int[(Component197.anInt10084 + Component197.anInt10084 + 2)];
        DisplayModeManagerContainer5.aClass76_1208 = DisplayModeManagerContainer5.aClass76_1210;
        if (DefinitionSub5.aBoolean9121) {
            Component95.aBooleanArrayArrayArray1751 = (new boolean[i_1_]
                    [(Component197.anInt10084 + Component197.anInt10084 + 1)]
                    [(Component197.anInt10084 + Component197.anInt10084 + 1)]);
            Component2.aBooleanArrayArrayArray8361 = new boolean[i_1_][][];
            if (LoggedOutDefinition.aClass293Array9432 != null) Component92.method1978();
            LoggedOutDefinition.aClass293Array9432 = new Component176[Npc.anInt10503];
            JaclibLoader.toolkit.setTextureUnitCount((LoggedOutDefinition.aClass293Array9432).length + 1);
            JaclibLoader.toolkit.resetTextureState(0);
            for (int i_6_ = 0; i_6_ < LoggedOutDefinition.aClass293Array9432.length; i_6_++) {
                LoggedOutDefinition.aClass293Array9432[i_6_] = new Component176(i_6_ + 1, JaclibLoader.toolkit);
                new Thread(LoggedOutDefinition.aClass293Array9432[i_6_], "wr" + i_6_).start();
            }
            int i_7_;
            if (Npc.anInt10503 == 2) {
                i_7_ = 4;
                DisplayModeManagerContainer216.anInt5652 = 2;
            } else if (Npc.anInt10503 == 3) {
                i_7_ = 6;
                DisplayModeManagerContainer216.anInt5652 = 3;
            } else {
                i_7_ = 8;
                DisplayModeManagerContainer216.anInt5652 = 4;
            }
            Component144.aClass315Array3982 = new Component168[i_7_];
            for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
                Component144.aClass315Array3982[i_8_] = new Component168(ColoredText.aStringArrayArray6093[(Npc.anInt10503 - 2)][i_8_]);
        } else DisplayModeManagerContainer216.anInt5652 = 1;
        DisplayModeManagerContainer167.anIntArray256 = new int[DisplayModeManagerContainer216.anInt5652 - 1];
        Component35.anIntArray4271 = new int[DisplayModeManagerContainer216.anInt5652 - 1];
    }

    final void method3172(int i) {
        anInt8566++;
        if (anInt8569 > 0) {
            aHa_Sub2_8564.clearBuffers(anInt8569, anInt8571, -101);
            anInt8569 = 0;
        }
        if (i != 4) method3171(null, 57, 49, -22, 43, -43, -45, true, true);
    }

    final void method3173(int i, int i_9_, int i_10_) {
        OpenGL.glFramebufferRenderbufferEXT(i_10_, i_9_, i, anInt8569);
        anInt8568++;
        anInt8562 = i_10_;
        anInt8563 = i_9_;
    }

    public final void method37(int i) {
        anInt8561++;
        if (i != -3022) this.anInt8572 = 15;
        OpenGL.glFramebufferRenderbufferEXT(anInt8562, anInt8563, 36161, 0);
        anInt8562 = -1;
        anInt8563 = -1;
    }

    HashNodeSub2(GlToolkitSub2 var_ha_Sub2, int i, int i_11_, int i_12_) {
        try {
            this.anInt8572 = i_11_;
            aHa_Sub2_8564 = var_ha_Sub2;
            this.anInt8565 = i_12_;
            anInt8567 = i;
            OpenGL.glGenRenderbuffersEXT(1, LoggedOutDefinition.anIntArray9431, 0);
            anInt8569 = LoggedOutDefinition.anIntArray9431[0];
            OpenGL.glBindRenderbufferEXT(36161, anInt8569);
            OpenGL.glRenderbufferStorageEXT(36161, anInt8567, (this.anInt8572), (this.anInt8565));
            anInt8571 = (this.anInt8565 * this.anInt8572 * aHa_Sub2_8564.createSurface(anInt8567, 2));
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("kw.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_11_ + ',' + i_12_ + ')'));
        }
    }

    HashNodeSub2(GlToolkitSub2 var_ha_Sub2, int i, int i_13_, int i_14_, int i_15_) {
        try {
            this.anInt8572 = i_13_;
            anInt8567 = i;
            this.anInt8565 = i_14_;
            aHa_Sub2_8564 = var_ha_Sub2;
            OpenGL.glGenRenderbuffersEXT(1, LoggedOutDefinition.anIntArray9431, 0);
            anInt8569 = LoggedOutDefinition.anIntArray9431[0];
            OpenGL.glBindRenderbufferEXT(36161, anInt8569);
            OpenGL.glRenderbufferStorageMultisampleEXT(36161, i_15_, anInt8567, this.anInt8572, this.anInt8565);
            anInt8571 = (this.anInt8565 * this.anInt8572 * aHa_Sub2_8564.createSurface(anInt8567, 2));
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("kw.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'));
        }
    }
}
