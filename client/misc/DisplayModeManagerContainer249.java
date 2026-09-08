/* DisplayModeManagerContainer249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer249
/**
 * RENAMED from `Class177` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ implements Interface1 {
    static int anInt4663;
    static int anInt4664;
    static int anInt4665;
    static int anInt4666 = 0;
    static int anInt4667;
    static int anInt4668;
    static int anInt4669;
    static int[] anIntArray4670 = new int[3];
    private final RSACipher aClass52_4671;

    public final void method9(byte i, boolean bool) {
        if (bool) NodeSub8.toolkit.fillRect2D(0, 0, Component236.canvasWidth, PacketReader.canvasHeight, aClass52_4671.anInt4899, 0);
        anInt4668++;
        if (i != -49) anInt4666 = -20;
    }

    static final void method1352(int i, int i_0_, int i_1_, byte i_2_) {
        anInt4664++;
        if (i_2_ != -98) method1354((byte) 69);
        i_0_ = (i_0_ * Component192.preferences.aClass239_Sub26_7260.method1838(-32350) >> 8);
        if (i_0_ != 0 && i != -1) {
            if (!DisplayModeManagerContainer238.aBoolean1236 && Component119.anInt3428 != -1 && Component385.method1296(true) && !DisplayModeManagerContainer363.method2605((byte) -99)) {
                Component246.aClass348_Sub16_Sub3_2718 = MatrixSub3.method943(false);
                BrowserUrlOpener class348_sub16_sub3 = Component16.method1326(Component246.aClass348_Sub16_Sub3_2718, i_2_ ^ ~0x68);
                HashNodeSub18.method3273(true, -95, class348_sub16_sub3);
            }
            NodeSub1Sub3.method2732(0, i, false, 102, DisplayModeManagerContainer64.aClass45_9033, i_0_);
            NodeSub5.method2755(-1, 255, -1);
            DisplayModeManagerContainer238.aBoolean1236 = true;
        }
    }

    public final void method7(int i) {
        anInt4667++;
        if (i != 10286) method1354((byte) 42);
    }

    public final boolean method8(byte i) {
        anInt4663++;
        int i_3_ = 35 / ((i - 25) / 52);
        return true;
    }

    static final Component327 method1353(int i, int i_4_, int i_5_, Class var_class) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_4_][i_5_];
        if (class357 == null) return null;
        for (Component3 class148 = class357.aClass148_4396; class148 != null; class148 = class148.aClass148_2038) {
            Component327 class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040;
            if (var_class.isAssignableFrom(class318_sub1_sub3.getClass()) && class318_sub1_sub3.aShort8743 == i_4_ && (class318_sub1_sub3.aShort8750 == i_5_)) return class318_sub1_sub3;
        }
        return null;
    }

    public static void method1354(byte i) {
        if (i == -22) anIntArray4670 = null;
    }

    DisplayModeManagerContainer249(RSACipher class52) {
        aClass52_4671 = class52;
    }
}
