/* Component315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component315
/**
 * RENAMED from `Class243` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3157;
    static int anInt3158;
    static int anInt3159;
    static int anInt3160;
    static int anInt3161;
    static int anInt3162;
    static int anInt3163;
    static int anInt3164;
    static StringCache aClass351_3165 = new StringCache(60, 8);
    private final Renderable aClass318_3166 = new Renderable();
    private Renderable aClass318_3167;
    static int anInt3168;

    final void method1869(int i, Renderable class318) {
        if (class318.previous != null) class318.unlink(false);
        anInt3158++;
        class318.previous = aClass318_3166.previous;
        if (i > -81) aClass318_3167 = null;
        class318.next = aClass318_3166;
        class318.previous.next = class318;
        class318.next.previous = class318;
    }

    final Renderable method1870(int i) {
        if (i > -103) aClass318_3167 = null;
        anInt3162++;
        Renderable class318 = aClass318_3166.previous;
        if (aClass318_3166 == class318) {
            aClass318_3167 = null;
            return null;
        }
        aClass318_3167 = class318.previous;
        return class318;
    }

    final boolean method1871(byte i) {
        anInt3157++;
        if (i <= 98) method1879(true);
        return aClass318_3166 == aClass318_3166.next;
    }

    final Renderable method1872(int i) {
        anInt3163++;
        Renderable class318 = aClass318_3166.next;
        if (i != 8) method1878((byte) 126);
        if (class318 == aClass318_3166) {
            aClass318_3167 = null;
            return null;
        }
        aClass318_3167 = class318.next;
        return class318;
    }

    public static void method1873(byte i) {
        if (i > -111) aClass351_3165 = null;
        aClass351_3165 = null;
    }

    final int method1874(int i) {
        anInt3161++;
        int i_0_ = i;
        for (Renderable class318 = aClass318_3166.next; aClass318_3166 != class318; class318 = class318.next)
            i_0_++;
        return i_0_;
    }

    final Renderable method1875(int i) {
        anInt3160++;
        Renderable class318 = aClass318_3166.next;
        if (class318 == aClass318_3166) return null;
        class318.unlink(false);
        if (i != 60) method1878((byte) 16);
        return class318;
    }

    final void method1876(byte i) {
        if (i == -45) {
            anInt3168++;
            for (; ; ) {
                Renderable class318 = aClass318_3166.next;
                if (class318 == aClass318_3166) break;
                class318.unlink(false);
            }
            aClass318_3167 = null;
        }
    }

    static final void method1877(GraphicsToolkit var_ha, int i) {
        anInt3164++;
        if (i >= -20) method1877(null, -112);
        for (RenderableSub10 class318_sub10 = (RenderableSub10) InflaterDecompressor.aClass243_2077.method1872(8); class318_sub10 != null; class318_sub10 = (RenderableSub10) InflaterDecompressor.aClass243_2077.method1878((byte) 124)) {
            if (class318_sub10.aBoolean6482) class318_sub10.method2528(var_ha);
        }
    }

    final Renderable method1878(byte i) {
        anInt3159++;
        Renderable class318 = aClass318_3167;
        int i_1_ = -59 % ((67 - i) / 55);
        if (class318 == aClass318_3166) {
            aClass318_3167 = null;
            return null;
        }
        aClass318_3167 = class318.next;
        return class318;
    }

    static final void method1879(boolean bool) {
        if (bool) {
            Component335.aClass357ArrayArrayArray2029 = ImageProducerSprite.aClass357ArrayArrayArray9082;
            ShaderSub1.aSArray5191 = Component9.aSArray4142;
        } else {
            Component335.aClass357ArrayArrayArray2029 = Component304.aClass357ArrayArrayArray1148;
            ShaderSub1.aSArray5191 = NodeSub1Sub1.aSArray8801;
        }
        Component291.anInt2524 = Component335.aClass357ArrayArrayArray2029.length;
    }

    public Component315() {
        aClass318_3166.previous = aClass318_3166;
        aClass318_3166.next = aClass318_3166;
    }
}
