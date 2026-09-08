/* NodeSub46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NodeSub46
/**
 * RENAMED from `Class348_Sub46` (JODE-obfuscated).
 * Evidence: subclass of Node (hierarchy)
 */ extends Node {
    static int anInt7109;
    static int anInt7110;
    /** Identity string for this node (equals-matched by callers). */
    String name;
    static int anInt7112;
    static Component183 aClass114_7113 = new Component183(97, 0);
    static int anInt7114;
    static int anInt7115 = 1;

    /** Close and clear {@link Component40#consoleLogStream}. */
    static final void closeConsoleLogStream(byte i) {
        if (Component40.consoleLogStream != null) {
            try {
                Component40.consoleLogStream.close();
            } catch (java.io.IOException ioexception) {
                /* empty */
            }
        }
        if (i > -33) method3321(-73, 3, 6);
        anInt7110++;
        Component40.consoleLogStream = null;
    }

    public static void method3318(byte i) {
        if (i != -80) method3322(-26, null);
        aClass114_7113 = null;
    }

    static final void method3319(GraphicsToolkit var_ha, byte i) {
        if (i > -108) method3321(19, 60, 108);
        anInt7114++;
        if (((Component72.localPlayer.plane) != NativeLibLoader.anInt4155) && Component335.aClass357ArrayArrayArray2029 != null) {
            if (NodeSub14.method2808((Component72.localPlayer.plane), var_ha, true)) NativeLibLoader.anInt4155 = Component72.localPlayer.plane;
        }
    }

    static final void method3320(Component327 class318_sub1_sub3, boolean bool) {
        for (int i = class318_sub1_sub3.aShort8743; i <= class318_sub1_sub3.aShort8751; i++) {
            for (int i_0_ = class318_sub1_sub3.aShort8750; i_0_ <= class318_sub1_sub3.aShort8747; i_0_++) {
                Component186 class357 = (Component335.aClass357ArrayArrayArray2029[class318_sub1_sub3.plane][i][i_0_]);
                if (class357 != null) {
                    Component3 class148 = class357.aClass148_4396;
                    Component3 class148_1_ = null;
                    for (/**/; class148 != null; class148 = class148.aClass148_2038) {
                        if (class148.aClass318_Sub1_Sub3_2040 == class318_sub1_sub3) {
                            if (class148_1_ != null) class148_1_.aClass148_2038 = class148.aClass148_2038;
                            else class357.aClass148_4396 = class148.aClass148_2038;
                            class148.method1199((byte) -106);
                            break;
                        }
                        class148_1_ = class148;
                    }
                }
            }
        }
        if (!bool) Component191.method1376(class318_sub1_sub3);
    }

    static final Component186 method3321(int i, int i_2_, int i_3_) {
        if (Component335.aClass357ArrayArrayArray2029[i][i_2_][i_3_] == null) {
            boolean bool = (Component335.aClass357ArrayArrayArray2029[0][i_2_][i_3_] != null && Component335.aClass357ArrayArrayArray2029[0][i_2_][i_3_].aClass357_4400 != null);
            if (bool && i >= Component291.anInt2524 - 1) return null;
            Component316.method1394(i, i_2_, i_3_);
        }
        return Component335.aClass357ArrayArrayArray2029[i][i_2_][i_3_];
    }

    static final Component76 method3322(int i, Buffer class348_sub49) {
        anInt7109++;
        Component27 class369 = NodeSub16Sub2.method2834((byte) -125, class348_sub49);
        int i_4_ = class348_sub49.readUnsignedShort(i ^ 0x3235f8f8);
        int i_5_ = class348_sub49.readUnsignedShort(842397944);
        if (i != 0) aClass114_7113 = null;
        int i_6_ = class348_sub49.readUnsignedShort(842397944);
        int i_7_ = class348_sub49.readUnsignedShort(i + 842397944);
        int i_8_ = class348_sub49.readUnsignedShort(842397944);
        int i_9_ = class348_sub49.readUnsignedShort(842397944);
        return new Component76(class369.aClass221_4968, class369.aClass341_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_);
    }

    public NodeSub46() {
        /* empty */
    }

    NodeSub46(String string, int i) {
        this.name = string;
    }
}
