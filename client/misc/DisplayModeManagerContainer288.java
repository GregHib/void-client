/* DisplayModeManagerContainer288 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.io.IOException;

final class DisplayModeManagerContainer288
/**
 * RENAMED from `Class14_Sub3` (JODE-obfuscated).
 * Evidence: subclass of DisplayModeManagerContainer194 (hierarchy)
 */ extends DisplayModeManagerContainer194 implements Interface18_Impl1 {
    static int anInt8624;
    static int anInt8625;
    private final int anInt8626;
    static int anInt8627;
    static int anInt8628;
    private final int anInt8629;
    static int anInt8630;
    private final int anInt8631;
    static int anInt8632;

    DisplayModeManagerContainer288(GlExtensionManager class377, DisplayModeManagerContainer42 class304, int i, int i_0_, int i_1_, byte[] is) {
        super(class377, 32879, class304, Component342.aClass68_1183, i_0_ * (i * i_1_), false);
        try {
            anInt8626 = i_1_;
            anInt8631 = i;
            anInt8629 = i_0_;
            this.aClass377_5082.setActiveTexture((byte) 86, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(this.anInt5093, 0, this.method228(105), anInt8631, anInt8629, anInt8626, 0, ParametricDefinition.method3055(109, this.aClass304_5084), 5121, is, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("qba.<init>(" + (class377 != null ? "{...}" : "null") + ',' + (class304 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    static final NodeSub51 method247(int i) {
        anInt8632++;
        RandomAccessFileReader class234 = null;
        NodeSub51 class348_sub51 = new NodeSub51(PacketReader.currentGameType, 0);
        try {
            Task class144 = OggUrlStream.aClass297_8992.openCacheFile((byte) -46, "", true);
            while (class144.status == 0) SpriteAtlasShader.sleep((byte) -85, 1L);
            if (class144.status == 1) {
                class234 = (RandomAccessFileReader) class144.result;
                byte[] is = new byte[(int) class234.length((byte) -46)];
                int i_2_;
                for (int i_3_ = 0; is.length > i_3_; i_3_ += i_2_) {
                    i_2_ = class234.read(is, i_3_, (byte) -49, -i_3_ + is.length);
                    if (i_2_ == -1) throw new IOException("EOF");
                }
                class348_sub51 = new NodeSub51(new Buffer(is), (PacketReader.currentGameType), 0);
            }
        } catch (Exception exception) {
            /* empty */
        }
        if (i != 24916) return null;
        try {
            if (class234 != null) class234.close(false);
        } catch (Exception exception) {
            /* empty */
        }
        return class348_sub51;
    }

    /** All registered inbound packet opcode descriptors. */
    static final Component183[] allPacketTypes(int i) {
        anInt8624++;
        if (i != -11271) initDevConsole(39);
        return (new Component183[]{CursorDefinitionCache.aClass114_2183, DisplayModeManagerContainer61.aClass114_3751, ShaderLinker.aClass114_10168, LruCache.aClass114_4388, DisplayModeManagerContainer167.aClass114_250, Component301.aClass114_4126, Component355.aClass114_3264, Component339.aClass114_3143, Component331.aClass114_1722, HashNodeSub3.aClass114_9503, Component162.aClass114_8385, RenderableObject.aClass114_6383, Connection.aClass114_2665, Component135.aClass114_4421, KeyFocusHandler.aClass114_6528, Component248.aClass114_315, OpenGlShader.aClass114_7398, Component329.aClass114_5992, Component162.aClass114_8384, Component120.aClass114_318, HeapDumper.aClass114_1917, AbstractShaderSub3.aClass114_7301, CollisionMap.aClass114_4433, ShaderLinker.aClass114_10149, Component338.aClass114_1702, Component39.aClass114_2248, Component20.aClass114_6056, Component37.aClass114_3925, ToolbarRefreshDefinition.aClass114_9225, Component102.aClass114_4798, Component2.aClass114_8365, Component48.aClass114_4331, RadixText.aClass114_6121, NodeSub38.aClass114_7015, Component323.aClass114_5883, DisplayModeManagerContainer213.aClass114_1068, NodeSub45.aClass114_7106, WaterShader.aClass114_7367, Component286.aClass114_1901, DisplayModeManagerContainer136.aClass114_4707, Component354.aClass114_220, ColoredText.aClass114_6089, IOException_Sub1.aClass114_90, Component278.aClass114_3240, Component10.aClass114_3809, DisplayModeManagerContainer130.aClass114_3467, Component71.aClass114_6058, Component316.aClass114_2483, ItemDefinitionProvider.aClass114_3265, NativeLibraryLoader.aClass114_2972, Component262.aClass114_1762, Component279.aClass114_229, Component59.aClass114_1871, Component227.aClass114_1120, DisplayModeManagerContainer238.aClass114_1234, HuffmanDecoder.aClass114_3773, Component92.aClass114_3307, RadixParser.aClass114_2305, Component14.aClass114_8590, DisplayModeManagerContainer332.aClass114_4998, Component16.aClass114_2279, GradientPreset.aClass114_9197, ParticleSystem.aClass114_7124, Component235.aClass114_3371, LibraryCreditsText.aClass114_5950, Component231.aClass114_330, DisplayModeManagerContainer32.aClass114_843, Component35.aClass114_4272, DisplayModeManagerContainer346.aClass114_2068, LibraryCreditsText.aClass114_5949, Component248.aClass114_304, InputStream_Sub2.aClass114_82, CacheNode.aClass114_9552, DefinitionSub19.aClass114_9254, Component219.aClass114_6340, InputStream_Sub1.aClass114_79, DisplayModeManagerContainer306.aClass114_4779, Component75.aClass114_2285, Component227.aClass114_1123, Component333.aClass114_3641, Component218.aClass114_2335, Component211.aClass114_1959, RenderableSub6.aClass114_6424, NodeSub1Sub2.aClass114_8817, HeapDumper.aClass114_1914, DefinitionSub24.aClass114_9324, NodeSub41.aClass114_7052, Component35.aClass114_4269, Component6.aClass114_4477, CustomCursorSetting.aClass114_6075, ImageCacheStore.aClass114_4027, DefinitionSub15.aClass114_9216, DisplayModeManagerContainer109.aClass114_2338, Component119.aClass114_3427, Component275.aClass114_2693, Component120.aClass114_316, AbstractShaderSub4.aClass114_7324, NodeSub46.aClass114_7113, Component291.aClass114_2527, Component39.aClass114_2255, Component317.aClass114_8683, NodeSub45.aClass114_7105, DefinitionSub19.aClass114_9257, WaterShaderSub8.aClass114_7363, DefinitionSub22.aClass114_9285, AbstractShaderSub4.aClass114_7323, SceneManager.aClass114_2860, Component327.aClass114_8756, Component339.aClass114_3135, CacheNode.aClass114_9550, Component223.aClass114_123, Component385.aClass114_2196, Component235.aClass114_3368, Component181.aClass114_1540, DisplayModeManagerContainer165.aClass114_3842, DisplayModeManagerContainer341.aClass114_5997, Component236.aClass114_4015, Component63.aClass114_4500, Component246.aClass114_2717, MatrixSub2.aClass114_5742, Component218.aClass114_2331});
    }

    /** Allocate console line buffer and print the developer-console banner. */
    static final void initDevConsole(int i) {
        anInt8627++;
        ArbShaderProgram.consoleLines = new String[500];
        ImageProducerSprite.consolePromptHeight = 2 + (Component27.aClass143_4962.descent + Component27.aClass143_4962.maxAscent);
        Component342.consoleLineHeight = (Component163.aClass143_3179.maxAscent - (-Component163.aClass143_3179.descent - i));
        for (int i_4_ = 0; (i_4_ < ArbShaderProgram.consoleLines.length); i_4_++)
            ArbShaderProgram.consoleLines[i_4_] = "";
        Applet_Sub1.printConsole(FriendsIgnoreList.aClass274_3483.getLocalized(ObjectDeserializer.languageId, 544), 67);
    }
}
