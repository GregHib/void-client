/* Component354 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Component354
/**
 * RENAMED from `Class13` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt219;
    static Component183 aClass114_220 = new Component183(40, -1);
    static int anInt221;
    static int[] anIntArray222;
    static Component219[] aClass314_Sub1Array223 = new Component219[37];
    static int[] anIntArray224;

    public static void method225(byte i) {
        if (i > 54) {
            aClass114_220 = null;
            anIntArray224 = null;
            anIntArray222 = null;
            aClass314_Sub1Array223 = null;
        }
    }

    static final void method226(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        for (int i_4_ = i_2_; NodeSub38.anInt7008 > i_4_; i_4_++) {
            Rectangle rectangle = Component166.aRectangleArray2371[i_4_];
            if (i < rectangle.width + rectangle.x && i_0_ + i > rectangle.x && (i_1_ < rectangle.y - -rectangle.height) && rectangle.y < i_1_ + i_3_) InflaterDecompressor.aBooleanArray2076[i_4_] = true;
        }
        anInt219++;
        Component103.method2663(i_2_ + -5590, i, i - -i_0_, i_1_, i_3_ + i_1_);
    }

    static final void method227(RenderableObject class318_sub1, boolean bool, boolean bool_5_) {
        class318_sub1.aBoolean6391 = bool_5_;
        if (DefinitionSub5.aBoolean9121) {
            if (bool) Component144.aClass315Array3982[Component144.aClass315Array3982.length - 1].method2353(class318_sub1, false);
            else {
                int i = WaterSurfaceShader.method2154(class318_sub1.anInt6386);
                int i_6_ = (RSACipher.anIntArray4906[2] * class318_sub1.method2379(-25675) / class318_sub1.anInt6389);
                int i_7_ = WaterSurfaceShader.method2154((class318_sub1.anInt6386) - i_6_);
                int i_8_ = WaterSurfaceShader.method2154((class318_sub1.anInt6386) + i_6_);
                if (i_7_ == i_8_) Component144.aClass315Array3982[i].method2353(class318_sub1, false);
                else if (i_8_ - i_7_ == 1) Component144.aClass315Array3982[DisplayModeManagerContainer216.anInt5652 + i_7_].method2353(class318_sub1, false);
                else Component144.aClass315Array3982[Component144.aClass315Array3982.length - 1].method2353(class318_sub1, false);
            }
        } else PauseTimer.method365(class318_sub1, Component95.aClass348_Sub1Array1752);
    }

    static {
        anIntArray222 = new int[3];
        anIntArray224 = new int[250];
    }
}
