/* Component203 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Component203
/**
 * RENAMED from `Class318_Sub1_Sub5` (JODE-obfuscated).
 * Evidence: subclass of RenderableObject (hierarchy)
 */ extends RenderableObject {
    static Task aClass144_8766;
    static int anInt8767;
    static int anInt8768;
    short aShort8769;
    static int anInt8770 = 0;
    static int anInt8771;
    static int anInt8772;
    static boolean aBoolean8773 = false;
    static int anInt8774;
    static int anInt8775 = 2;
    static int anInt8776;
    static int anInt8777;
    static int anInt8778;
    static int anInt8779;
    static int anInt8780 = 0;
    short aShort8781;

    static final int method2483(int i, int i_0_) {
        if (Component175.aShortArrayArray5847 != null) return Component175.aShortArrayArray5847[i][i_0_] & 0xffff;
        return 0;
    }

    final boolean method2378(int i) {
        if (i != 0) method2378(29);
        anInt8767++;
        return (DisplayModeManagerContainer153.aBooleanArrayArray1572[(-Component256.anInt6111 + ((this.x >> Component149.anInt4459) - -Component197.anInt10084))][(Component197.anInt10084 + (-DebugPanicSub2.anInt8502 + (this.y >> Component149.anInt4459)))]);
    }

    public static void method2484(int i) {
        if (i != 0) method2487(-24);
        aClass144_8766 = null;
    }

    static final boolean method2485(int i) {
        anInt8776++;
        if (MenuOpener.menuTipSecondary == null) return false;
        if ((MenuOpener.menuTipSecondary.opcode) >= 2000) MenuOpener.menuTipSecondary.opcode -= 2000;
        int i_1_ = -53 % ((-41 - i) / 54);
        return (MenuOpener.menuTipSecondary.opcode) == 1011;
    }

    final boolean method2382(byte i) {
        anInt8774++;
        if (i >= -51) method2486(-102, 81, -103, -31, -95, -90);
        return Component15.method1110((this.y >> Component149.anInt4459), this.method2394(true), this.aByte6376, (byte) -79, (this.x >> Component149.anInt4459));
    }

    final void method2380(GraphicsToolkit var_ha, int i, boolean bool, RenderableObject class318_sub1, int i_2_, byte i_3_, int i_4_) {
        try {
            anInt8768++;
            if (i_3_ >= -106) method2384(null, 52);
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("un.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'));
        }
    }

    final boolean method2388(int i) {
        if (i >= -65) return false;
        anInt8772++;
        return false;
    }

    final void method2392(boolean bool) {
        if (bool == true) {
            anInt8779++;
            throw new IllegalStateException();
        }
    }

    static final void method2486(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        if (i_8_ >= Component27.anInt4960 && i_5_ <= Component22.anInt1745 && Component72.anInt1910 <= i_9_ && PauseTimer.anInt513 >= i_7_) Component15.method1111(i_7_, i, i_5_, i_8_, i_9_, i_6_);
        else Component25.method1792(i_9_, i_8_, i_7_, i_5_, (byte) -114, i_6_);
        if (i != 0) anInt8780 = 42;
        anInt8777++;
    }

    final int method2384(NodeSub1[] class348_sub1s, int i) {
        anInt8771++;
        int i_10_ = 122 % ((-14 - i) / 61);
        return this.method2390(class348_sub1s, (this.x >> Component149.anInt4459), -2, (this.y >> Component149.anInt4459));
    }

    Component203(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
        this.aShort8769 = (short) i_16_;
        this.aByte6376 = (byte) i_14_;
        this.anInt6382 = i_11_;
        this.x = i;
        this.aShort8781 = (short) i_15_;
        this.y = i_12_;
        this.plane = (byte) i_13_;
    }

    static final Component362 method2487(int i) {
        anInt8778++;
        NodeSub36.anInt6985 = 0;
        if (i >= -91) anInt8775 = -63;
        return Component245.method170(true);
    }
}
