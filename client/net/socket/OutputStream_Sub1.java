/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

final class OutputStream_Sub1 extends OutputStream {
    static int anInt92;
    static Random aRandom93 = new Random();
    static int anInt94;
    static int anInt95;
    static int anInt96;
    static Component362[] aClass110_Sub1Array97;
    static int anInt98;
    static int[] anIntArray99;
    static int[] anIntArray100 = {99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};

    static final void method132(int i, boolean bool, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt94++;
        if (Component335.aClass357ArrayArrayArray2029 == null) NodeSub8.toolkit.method3675(i_0_, (byte) -125, i_1_, i_3_, i_2_, -16777216);
        else if (Component72.localPlayer.x < 0 || (Component72.localPlayer.x >= AbstractShaderSub4.anInt7319 * 512) || Component72.localPlayer.y < 0 || (512 * ParametricDefinition.anInt9109 <= Component72.localPlayer.y))
            NodeSub8.toolkit.method3675(i_0_, (byte) -125, i_1_, i_3_, i_2_, -16777216);
        else {
            DisplayModeManagerContainer341.anInt6006++;
            if (Component72.localPlayer != null && Component253.anInt3203 == (Component72.localPlayer.x + -(256 * Component72.localPlayer.getSize((byte) 90)) - -256) >> 9 && Component263.anInt1548 == (Component72.localPlayer.y + 256 + -(256 * Component72.localPlayer.getSize((byte) 112))) >> 9) {
                Component263.anInt1548 = -1;
                Component253.anInt3203 = -1;
                Component264.method2264(false);
            }
            Component353.method1434(-14988);
            if (!bool) Component21.method2109(512);
            Component83.method1014(-4);
            HashNodeSub3.method3174(i_1_, i_3_, i_0_, true, (byte) -82, i_2_);
            i_3_ = RandomAccessFileReader.anInt3047;
            i_1_ = DisplayModeManagerContainer61.anInt3764;
            i_2_ = Component333.anInt3643;
            Component72.anInt1906 = Component72.anInt1911;
            i_0_ = Component296.anInt4656;
            if (DefinitionSub21.cameraMode == 1) {
                int i_4_ = (int) DisplayModeManagerContainer154.cameraPitch;
                if (NodeSub35.anInt6979 >> 8 > i_4_) i_4_ = NodeSub35.anInt6979 >> 8;
                if (Component113.aBooleanArray2374[4] && ItemDefinitionProvider.anIntArray3273[4] + 128 > i_4_) i_4_ = ItemDefinitionProvider.anIntArray3273[4] + 128;
                int i_5_ = (int) Component112.cameraYaw + Component195.anInt5016 & 0x3fff;
                DisplayModeManagerContainer167.method268(i_4_, -200 + (Component300.method2064((Component72.localPlayer.x), Component117.anInt4372, 11219, (Component72.localPlayer.y))), i_5_, Component353.cameraFocusZ, i_2_, -19360, DisplayModeManagerContainer273.cameraFocusX, (i_4_ >> 3) * 3 + 600 << 2);
            } else if (DefinitionSub21.cameraMode == 4) {
                int i_6_ = (int) DisplayModeManagerContainer154.cameraPitch;
                if (i_6_ < NodeSub35.anInt6979 >> 8) i_6_ = NodeSub35.anInt6979 >> 8;
                if (Component113.aBooleanArray2374[4] && (i_6_ < ItemDefinitionProvider.anIntArray3273[4] + 128)) i_6_ = 128 + ItemDefinitionProvider.anIntArray3273[4];
                int i_7_ = (int) Component112.cameraYaw & 0x3fff;
                DisplayModeManagerContainer167.method268(i_6_, -200 + Component300.method2064(NodederUtil.anInt6633, Component117.anInt4372, 11219, NodeSub7.anInt6652), i_7_, Component353.cameraFocusZ, i_2_, -19360, DisplayModeManagerContainer273.cameraFocusX, 600 - -((i_6_ >> 3) * 3) << 2);
            } else if (DefinitionSub21.cameraMode == 5) DisplayModeManagerContainer259.method2035(i_2_, 0);
            int i_8_ = WaterSurfaceShader.anInt6246;
            int i_9_ = DisplayModeManagerContainer50.anInt3855;
            int i_10_ = Component317.anInt8685;
            int i_11_ = HashNodeSub19.anInt9701;
            int i_12_ = Component298.anInt4638;
            for (int i_13_ = 0; i_13_ < 5; i_13_++) {
                if (Component113.aBooleanArray2374[i_13_]) {
                    int i_14_ = (int) ((Math.random() * (double) ((Component300.anIntArray3552[i_13_] * 2) - -1)) - (double) Component300.anIntArray3552[i_13_] + (Math.sin((double) (Component212.anIntArray9981[i_13_]) * ((double) (Component103.anIntArray4196[i_13_]) / 100.0)) * (double) (ItemDefinitionProvider.anIntArray3273[i_13_])));
                    if (i_13_ == 4) {
                        HashNodeSub19.anInt9701 += i_14_;
                        if (HashNodeSub19.anInt9701 >= 1024) {
                            if (HashNodeSub19.anInt9701 > 3072) HashNodeSub19.anInt9701 = 3072;
                        } else HashNodeSub19.anInt9701 = 1024;
                    }
                    if (i_13_ == 0) WaterSurfaceShader.anInt6246 += i_14_ << 2;
                    if (i_13_ == 3) Component298.anInt4638 = 0x3fff & i_14_ + Component298.anInt4638;
                    if (i_13_ == 1) DisplayModeManagerContainer50.anInt3855 += i_14_ << 2;
                    if (i_13_ == 2) Component317.anInt8685 += i_14_ << 2;
                }
            }
            if (WaterSurfaceShader.anInt6246 < 0) WaterSurfaceShader.anInt6246 = 0;
            if (-1 + (StaticElementRenderer.anInt6451 << 9) < WaterSurfaceShader.anInt6246) WaterSurfaceShader.anInt6246 = -1 + (StaticElementRenderer.anInt6451 << 9);
            if (Component317.anInt8685 < 0) Component317.anInt8685 = 0;
            if (Component317.anInt8685 > (NodeSub41.anInt7054 << 9) + -1) Component317.anInt8685 = (NodeSub41.anInt7054 << 9) - 1;
            StringDefinition.method3225(114);
            HashNodeSub3.method3175((byte) -107);
            NodeSub8.toolkit.KA(i_1_, i_3_, i_1_ - -i_0_, i_3_ + i_2_);
            Component127.method1626(1, true);
            if (Component210.gameCanvasAttached) {
                MatrixSub3.method941(124, Component38.anInt2500);
                if (Component72.anInt1906 != Component121.anInt4545) NodeSub16Sub2.aBoolean8870 = true;
                Component121.anInt4545 = Component72.anInt1906;
            } else {
                NodeSub8.toolkit.NativeHandle();
                int i_15_ = Component38.anInt2500;
                if (Component293.aClass305_3304 != null) Component293.aClass305_3304.method2293(Component316.anInt2481 << 3, NodeSub8.toolkit, (byte) -72, i_1_, i_0_, i_3_, Component298.anInt4638, HashNodeSub19.anInt9701, i_15_, i_2_);
                else NodeSub8.toolkit.GA(i_15_);
            }
            Component381.method3570(false);
            if (i >= 80) {
                Component270.aClass101_2123.method903(WaterSurfaceShader.anInt6246, DisplayModeManagerContainer50.anInt3855, Component317.anInt8685, -HashNodeSub19.anInt9701 & 0x3fff, -Component298.anInt4638 & 0x3fff, 0x3fff & -Component103.anInt4186);
                NodeSub8.toolkit.loadModelviewMatrix(Component270.aClass101_2123);
                NodeSub8.toolkit.DA(i_0_ / 2 + i_1_, i_3_ + i_2_ / 2, Component263.anInt1550 << 1, Component263.anInt1550 << 1);
                ComponentDownloader.method319(Component263.anInt1550 << 1, Component263.anInt1550 << 1, (byte) -18, i_1_ + i_0_ / 2, i_3_ + i_2_ / 2);
                HashNodeSub20.method3282(0x3fff & -(HashNodeSub19.anInt9701), Component317.anInt8685, DisplayModeManagerContainer50.anInt3855, 0, -Component298.anInt4638 & 0x3fff, WaterSurfaceShader.anInt6246, -Component103.anInt4186 & 0x3fff);
                byte i_16_ = (Component192.preferences.aClass239_Sub14_7264.method1778(-32350) != 2 ? (byte) 1 : (byte) DisplayModeManagerContainer341.anInt6006);
                if (Component210.gameCanvasAttached) {
                    Component158.method289(-15902, 0x3fff & -Component298.anInt4638, -Component103.anInt4186 & 0x3fff, (-HashNodeSub19.anInt9701 & 0x3fff));
                    GameType.method1634(DisplayModeManagerContainer370.anIntArray1127, -2, Component156.aByteArrayArrayArray3700, (Component72.localPlayer.y) >> 9, (Component72.localPlayer.plane) - -1, DisplayModeManagerContainer363.anIntArray4097, WaterSurfaceShader.anInt6246, Component317.anInt8685, Component192.preferences.aClass239_Sub1_7246.method1720(-32350) == 0, DisplayModeManagerContainer50.anInt3855, (Component72.localPlayer.x) >> 9, ClientErrorReporter.anIntArray2117, DefinitionSub19.anIntArray9259, i_16_, LoadingState.anIntArray1045, OpenGlShader.clientCycle, true, Component72.anInt1906);
                } else
                    AbstractGlTextureSub1.method1960(OpenGlShader.clientCycle, WaterSurfaceShader.anInt6246, DisplayModeManagerContainer50.anInt3855, Component317.anInt8685, Component156.aByteArrayArrayArray3700, DisplayModeManagerContainer363.anIntArray4097, ClientErrorReporter.anIntArray2117, DefinitionSub19.anIntArray9259, LoadingState.anIntArray1045, DisplayModeManagerContainer370.anIntArray1127, (Component72.localPlayer.plane) - -1, i_16_, (Component72.localPlayer.x) >> 9, (Component72.localPlayer.y) >> 9, Component192.preferences.aClass239_Sub1_7246.method1720(-32350) == 0, true, !DisplayModeManagerContainer50.aBoolean3870 ? -1 : Component72.anInt1906, 0, false);
                Component381.method3570(false);
                if (Component49.clientState == 10) {
                    Component248.method283(-127, i_0_, 256, i_2_, i_1_, i_3_, 256);
                    GlToolkitSub2.getString(i_3_, i_2_, 2, i_1_, i_0_, 256, 256);
                    Component212.method2403(i_1_, 256, i_3_, i_0_, 19206, i_2_, 256);
                    CursorDefinitionCache.method1289(i_2_, i_0_, i_3_, 8, i_1_);
                }
                StringDefinition.method3223();
                WaterSurfaceShader.anInt6246 = i_8_;
                HashNodeSub19.anInt9701 = i_11_;
                Component298.anInt4638 = i_12_;
                DisplayModeManagerContainer50.anInt3855 = i_9_;
                Component317.anInt8685 = i_10_;
                if (TcpSocketStream.aBoolean5840 && HardwareProbe.aClass248_6601.priorityQueueSize(4) == 0) TcpSocketStream.aBoolean5840 = false;
                if (TcpSocketStream.aBoolean5840) {
                    NodeSub8.toolkit.method3675(i_0_, (byte) -125, i_1_, i_3_, i_2_, -16777216);
                    Component149.method3511(false, Applet_Sub1.aClass324_20, Component163.aClass143_3179, (FriendsIgnoreList.aClass274_3495.getLocalized(ObjectDeserializer.languageId, 544)), 2, NodeSub8.toolkit);
                }
                Component127.method1626(1, false);
            }
        }
    }

    public final void write(int i) throws IOException {
        anInt96++;
        throw new IOException();
    }

    public static void method133(byte i) {
        anIntArray100 = null;
        anIntArray99 = null;
        aClass110_Sub1Array97 = null;
        if (i != -41) anIntArray99 = null;
        aRandom93 = null;
    }

    static final void method134(byte i) {
        if (i != -126) method132(-95, true, 10, 28, 45, 100);
        if (Component117.anObject4366 == null) {
            Component350 class59_sub1_sub1 = new Component350();
            byte[] is = class59_sub1_sub1.method559(128, 128, (byte) 106, 16);
            Component117.anObject4366 = BrowserDetector.wrapSoft(is, false, (byte) 111);
        }
        anInt92++;
        if (Component150.anObject2969 == null) {
            Component317 class59_sub2_sub2 = new Component317();
            byte[] is = class59_sub2_sub2.method571(128, (byte) -38, 16, 128);
            Component150.anObject2969 = BrowserDetector.wrapSoft(is, false, (byte) 106);
        }
    }

    static {
        anIntArray99 = new int[]{1, -1, -1, 1};
    }
}
