/* NodeSub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.lang.reflect.Constructor;

final class NodeSub18
/**
 * RENAMED from `Class348_Sub18` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    static int anInt6804;
    static int anInt6805;
    private final int anInt6806;
    static int anInt6807;
    static int anInt6808;
    int anInt6809;
    private int anInt6810;
    private int anInt6811;
    int anInt6812;
    int anInt6813;
    static StringCache aClass351_6814 = new StringCache(63, 3);
    private final int anInt6815;
    static int anInt6816;
    static int anInt6817;
    static int anInt6818 = 0;
    int anInt6819;
    private final int anInt6820;
    static int anInt6821;
    static int anInt6822;
    /*synthetic*/ static Class aClass6823;

    final boolean method2934(int i, int i_0_, int i_1_) {
        anInt6822++;
        if (i != 3589) createMouseHandler(null, 70, false);
        return i_0_ >= anInt6820 && i_0_ <= anInt6806 && i_1_ >= anInt6811 && anInt6810 >= i_1_;
    }

    final boolean method2935(int i, int i_2_, int i_3_, boolean bool) {
        anInt6821++;
        if (bool != true) anInt6811 = -84;
        return i_3_ == anInt6815 && i_2_ >= anInt6820 && anInt6806 >= i_2_ && i >= anInt6811 && anInt6810 >= i;
    }

    public static void method2936(byte i) {
        if (i == -25) aClass351_6814 = null;
    }

    final void method2937(int i, int i_4_, int i_5_, int[] is) {
        anInt6816++;
        is[0] = anInt6815;
        is[1] = -this.anInt6809 - -anInt6820 + i;
        is[2] = i_4_ + (-this.anInt6812 + anInt6811);
        if (i_5_ != -3069) anInt6810 = -14;
    }

    static final void method2938(byte i) {
        anInt6804++;
        Component267.aClass268_2979.method2037(10205);
        Component149.aClass183_4460.method1381(true);
        DefinitionSub25.aClass150_9342.method1206((byte) -37);
        GradientPreset.aClass263_9195.method2012(-23828);
        Component291.aClass278_2529.method2078(-6080);
        Exception_Sub1.itemDefinitions.method1939(-110);
        RunescapeInfo.aClass87_191.method834((byte) -116);
        NsnDefinition.aClass319_9245.method2546(60);
        Component267.aClass194_2981.method1445(64);
        Component209.aClass217_3453.method1589((byte) 127);
        DisplayModeManagerContainer282.aClass261_5558.clearCache(0);
        Component245.aClass141_117.method1175((byte) 125);
        DisplayModeManagerContainer64.aClass153_9031.method1219(7851);
        DisplayModeManagerContainer64.aClass187_9036.method1404((byte) -82);
        MatrixSub3.aClass326_5764.method2601((byte) -44);
        ComponentDownloader.aClass84_413.method822((byte) -120);
        Component132.aClass25_1813.method300((byte) -123);
        NodeSub1.aClass185_6559.method1393((byte) -13);
        Component339.cursorDefinitions.method1290(-8);
        Component257.aClass65_4787.method695(true);
        DisplayModeManagerContainer306.aClass219_4782.method1602(0);
        Component76.method3573(-15326);
        LoadingManager.clearDefinitionCaches((byte) 62);
        DisplayModeManagerContainer26.method821(-126);
        Renderable.method2375(16127);
        if (Component326.LIVE != DisplayModeManagerContainer345.aClass364_165) {
            for (int i_6_ = 0; Component17.aByteArrayArray3882.length > i_6_; i_6_++)
                Component17.aByteArrayArray3882[i_6_] = null;
            Component162.anInt8388 = 0;
        }
        NamedInteger.clearCaches(83);
        Component192.clearSoftCache(-1);
        Component256.method1828(87);
        if (i > 53) {
            DisplayModeManagerContainer310.method297(false);
            Component134.method1402(1);
            ClientScriptExecutor.aClass60_1174.clear(0);
            NodeSub8.toolkit.method3663();
            TcpSocketStream.method1707(26469);
            Buffer.disposeActiveToolkit(-52);
            NodeSub29.aClass45_6909.clearUnpacked((byte) -124);
            DisplayModeManagerContainer51.aClass45_2490.clearUnpacked((byte) -119);
            Component181.aClass45_1541.clearUnpacked((byte) 37);
            NodeSub35.aClass45_6980.clearUnpacked((byte) -113);
            Component30.aClass45_1878.clearUnpacked((byte) -116);
            SoftwareFallbackShader.aClass45_7382.clearUnpacked((byte) -110);
            Component54.aClass45_8667.clearUnpacked((byte) 64);
            ShaderSub3.aClass45_5207.clearUnpacked((byte) 120);
            Component158.aClass45_322.clearUnpacked((byte) 98);
            Component14.aClass45_8589.clearUnpacked((byte) 43);
            Component110.aClass45_233.clearUnpacked((byte) 20);
            DisplayModeManagerContainer64.aClass45_9033.clearUnpacked((byte) 89);
            Component22.aClass45_1743.clearUnpacked((byte) -125);
            Component65.aClass45_1627.clearUnpacked((byte) -117);
            Component323.aClass45_5878.clearUnpacked((byte) 29);
            Component132.aClass45_1815.clearUnpacked((byte) 80);
            Component97.aClass45_1538.clearUnpacked((byte) 34);
            VideoAdDisplay.aClass45_3183.clearUnpacked((byte) -116);
            Component43.aClass45_4975.clearUnpacked((byte) 28);
            RadixParser.aClass45_2306.clearUnpacked((byte) -115);
            CacheNodeSub2.aClass45_10480.clearUnpacked((byte) 22);
            SeekableFile.aClass45_1322.clearUnpacked((byte) 36);
            BrowserUrlOpener.aClass45_8926.clearUnpacked((byte) -114);
            NodeSub32.aClass45_6950.clearUnpacked((byte) 36);
            Component387.aClass45_1897.clearUnpacked((byte) -114);
            CommandHandler.aClass45_1434.clearUnpacked((byte) -117);
            NodeSub11.aClass45_4770.clearUnpacked((byte) 78);
            Component339.aClass45_3146.clearUnpacked((byte) 88);
            WaterShaderSub8.aClass45_7362.clearUnpacked((byte) -109);
            NodeList.aClass45_3323.clearUnpacked((byte) 112);
            Component380.aClass45_4984.clearUnpacked((byte) 85);
            Component257.aClass45_4796.clearUnpacked((byte) 93);
            Component334.aClass45_2015.clearUnpacked((byte) -122);
            Component45.aClass60_4346.clear(0);
            ShaderCompilerSub2.aClass60_6517.clear(0);
            NodeSub1Sub1.aClass60_8807.clear(0);
            Component225.aClass60_463.clear(0);
        }
    }

    final boolean method2939(int i, int i_7_, int i_8_) {
        anInt6807++;
        if (i_7_ != 2) return true;
        return this.anInt6809 <= i && this.anInt6819 >= i && (i_8_ >= this.anInt6812) && this.anInt6813 >= i_8_;
    }

    final void method2940(int i, boolean bool, int[] is, int i_9_) {
        anInt6817++;
        is[0] = 0;
        is[2] = i + -anInt6811 + this.anInt6812;
        is[1] = i_9_ - anInt6820 - -this.anInt6809;
        if (bool != true) this.anInt6812 = -26;
    }

    static final MouseHandler createMouseHandler(Component component, int i, boolean bool) {
        anInt6808++;
        try {
            Constructor constructor = (AwtMouseHandler.class.getDeclaredConstructor((aClass6823 != null ? aClass6823 : (aClass6823 = Component.class)), Boolean.TYPE));
            return ((MouseHandler) constructor.newInstance(new Object[]{component, new Boolean(bool)}));
        } catch (Throwable throwable) {
            if (i != 0) return null;
            return new BasicMouseHandler(component, bool);
        }
    }

    static final void method2942(DisplayModeManagerContainer57 class46, byte i) {
        anInt6805++;
        if (class46.contentType == ModelStore.anInt4610) {
            if (Component72.localPlayer.username == null) {
                class46.anInt779 = 0;
                class46.anInt753 = 0;
            } else {
                class46.anInt757 = 150;
                class46.anInt675 = 0x7ff & (int) (256.0 * Math.sin((double) (OpenGlShader.clientCycle) / 40.0));
                class46.anInt770 = 5;
                class46.anInt753 = StringDefinition.anInt9591;
                class46.anInt779 = (Component349.method2418((Component72.localPlayer.username), (byte) -41));
                class46.anInt699 = Component72.localPlayer.anInt10268;
                class46.anInt841 = 0;
                class46.anInt730 = Component72.localPlayer.anInt10312;
                class46.anInt795 = Component72.localPlayer.anInt10245;
                DisplayModeManagerContainer167 class17 = (class46.anInt699 != -1 ? RunescapeInfo.aClass87_191.getSequence(class46.anInt699, 7) : null);
                if (class17 != null) Component235.method2017(class46.anInt795, class17, 50);
            }
        } else {
            int i_10_ = -14 % ((27 - i) / 59);
        }
    }

    NodeSub18(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
        this.anInt6809 = i_15_;
        this.anInt6819 = i_17_;
        anInt6820 = i_11_;
        anInt6811 = i_12_;
        anInt6815 = i;
        this.anInt6812 = i_16_;
        anInt6806 = i_13_;
        anInt6810 = i_14_;
        this.anInt6813 = i_18_;
    }

}
