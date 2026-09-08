/* Component126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component126
/**
 * RENAMED from `Class363` (JODE-obfuscated).
 * Holds the developer-console prompt buffer ({@link #consoleInput}).
 */ {
    /** Current text in the developer-console prompt (before Enter). */
    static String consoleInput = "";
    static int anInt4462;
    static int[] anIntArray4463 = new int[8];
    static int anInt4464;
    static int anInt4465;

    static final void method3513(int i) {
        synchronized (Renderable.aClass243Array3974) {
            for (int i_0_ = 0; (i_0_ < Renderable.aClass243Array3974.length); i_0_++) {
                Renderable.aClass243Array3974[i_0_] = new Component315();
                Component374.anIntArray4128[i_0_] = 0;
            }
        }
        anInt4462++;
        int i_1_ = 60 / ((-36 - i) / 57);
    }

    static final void method3514(byte i) {
        anInt4465++;
        for (NodeSub27 class348_sub27 = ((NodeSub27) HashNodeSub20.aClass262_9711.first(4)); class348_sub27 != null; class348_sub27 = (NodeSub27) HashNodeSub20.aClass262_9711.next((byte) 57)) {
            if (class348_sub27.anInt6893 == -1) {
                class348_sub27.anInt6894 = 0;
                if ((class348_sub27.anInt6905 >= 0) && class348_sub27.anInt6896 >= 0 && (class348_sub27.anInt6905 < AbstractShaderSub4.anInt7319) && (class348_sub27.anInt6896 < ParametricDefinition.anInt9109)) Component357.method1387(i + 26, class348_sub27);
            } else class348_sub27.unlink((byte) 39);
        }
        if (i != -105) method3516(-128);
    }

    static final void method3515(int i) {
        int i_2_ = 52 / ((33 - i) / 40);
        Definition.containers.clear(0);
        anInt4464++;
    }

    public static void method3516(int i) {
        consoleInput = null;
        if (i <= 123) anIntArray4463 = null;
        anIntArray4463 = null;
    }
}
