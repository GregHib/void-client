/* ParticleSystem - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub47` (JODE-obfuscated).
 * Particle system. extends Node; logs 'Particle system count: ' from the particle/InflaterDecompressor state.
 */

import java.awt.*;

final class ParticleSystem extends Node {
    DisplayModeManagerContainer207 particleBuffer;
    static int anInt7117;
    StringCache aClass351_7118;
    int anInt7119;
    static int anInt7120;
    static int anInt7121;
    int anInt7122;
    static int anInt7123;
    static Component183 aClass114_7124 = new Component183(62, 4);
    static int anInt7125 = 1406;

    public static void method3323(int i) {
        int i_0_ = -14 / ((73 - i) / 51);
        aClass114_7124 = null;
    }

    static final void method3324(GraphicsToolkit var_ha, byte i, long l) {
        do {
            try {
                DisplayModeManagerContainer145.anInt1803 = 0;
                Component102.anInt4797 = Component55.anInt3936;
                Component203.anInt8780 = 0;
                anInt7120++;
                Component55.anInt3936 = 0;
                long l_1_ = Component240.currentTimeMillis(-53);
                RenderableSub10 class318_sub10 = (RenderableSub10) InflaterDecompressor.aClass243_2077.method1872(8);
                if (i > 40) {
                    for (/**/; class318_sub10 != null; class318_sub10 = (RenderableSub10) InflaterDecompressor.aClass243_2077.method1878((byte) -64)) {
                        if (class318_sub10.method2535(var_ha, l)) Component203.anInt8780++;
                    }
                    if (!NodeSub16Sub2.aBoolean8874 || l % 100L != 0) break;
                    System.out.println("Particle system count: " + InflaterDecompressor.aClass243_2077.method1874(0) + ", running: " + Component203.anInt8780);
                    System.out.println("Emitters: " + DisplayModeManagerContainer145.anInt1803 + " Particles: " + Component55.anInt3936 + ". Time taken: " + (-l_1_ + Component240.currentTimeMillis(-112)) + "ms");
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("wm.A(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + l + ')'));
            }
            break;
        } while (false);
    }

    static final boolean method3325(int i, int i_2_, boolean bool) {
        if (bool != true) return false;
        anInt7121++;
        return (((0x2000 & i) != 0 | ClientErrorReporter.hasCollisionBlockFlags(i_2_, i, -118) | Component175.method1722(i, i_2_, (byte) 94)) & ShaderSub3.method166((byte) 105, i_2_, i));
    }

    final void method3326(byte i) {
        anInt7117++;
        if (Component218.aClass348_Sub47Array2334.length > Component266.anInt5980 && i == -45) Component218.aClass348_Sub47Array2334[Component266.anInt5980++] = this;
    }

    static final void method3327(int i) {
        if (i == 1406) {
            if (NodeSub8.toolkit.method3694()) {
                NodeSub8.toolkit.method3701(DisplayModeManagerContainer50.gameCanvas);
                NpcNode.method2959(-1);
                if (!Component210.gameCanvasAttached) {
                    Dimension dimension = DisplayModeManagerContainer50.gameCanvas.getSize();
                    NodeSub8.toolkit.method3643(DisplayModeManagerContainer50.gameCanvas, dimension.width, dimension.height);
                } else DisplayModeManagerContainer77.method1108((byte) -99, DisplayModeManagerContainer50.gameCanvas);
                NodeSub8.toolkit.method3677(DisplayModeManagerContainer50.gameCanvas);
            } else SoftwareFallbackShader.method3553(false, (byte) 100, Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350));
            anInt7123++;
            Component160.method3466(i + -1347);
            NodeSub16Sub2.aBoolean8870 = true;
        }
    }
}
