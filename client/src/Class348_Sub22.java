/* Class348_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Class348_Sub22 extends Class348 {
    static int anInt6857;
    static int anInt6858;
    Npc aNpc_6859;
    static int anInt6860;
    static int anInt6861;
    static int anInt6862;

    static final Class46 method2957(int i, byte i_0_, int i_1_) {
        anInt6858++;
        Class46 class46 = FontRenderer.method2570(i_0_ + 1512932774, i_1_);
        if (i_0_ != -54) method2958(-23, null);
        if (i == -1) return class46;
        if (class46 == null || class46.aClass46Array798 == null || (i >= class46.aClass46Array798.length)) return null;
        return class46.aClass46Array798[i];
    }

    static final int method2958(int i, Index index) {
        anInt6861++;
        int i_2_ = 0;
        if (index.method421(false, anInt6862)) i_2_++;
        if (index.method421(false, Class106.anInt1639)) i_2_++;
        if (index.method421(false, Class373_Sub2.anInt7429)) i_2_++;
        if (index.method421(false, ha.anInt4562)) i_2_++;
        if (index.method421(false, Class82.anInt1435)) i_2_++;
        if (index.method421(false, Class115.anInt1756)) i_2_++;
        if (index.method421(false, Class291.anInt3739)) i_2_++;
        if (index.method421(false, Class86.anInt1481)) i_2_++;
        if (index.method421(false, Class239_Sub10.anInt5948)) i_2_++;
        if (index.method421(false, Class113.anInt1742)) i_2_++;
        if (index.method421(false, Class364.anInt4469)) i_2_++;
        if (i != 22388) return 8;
        if (index.method421(false, Class348_Sub40_Sub38.anInt9473)) i_2_++;
        if (index.method421(false, Class187.anInt2510)) i_2_++;
        if (index.method421(false, Class52.anInt4895)) i_2_++;
        if (index.method421(false, Class186_Sub1.anInt5814)) i_2_++;
        if (index.method421(false, Class5_Sub3.anInt8370)) i_2_++;
        return i_2_;
    }

    static final void method2959(int i) {
        Class182.aClass346_2449.method2698(14174);
        anInt6860++;
        Class258_Sub4.aClass373_8552.method3592(0);
        NPCDefinition.aClient1367.method87((byte) -49);
        Class305.aCanvas3869.setBackground(Color.black);
        Class337.anInt4179 = i;
        Class182.aClass346_2449 = Class348_Sub3.method2743(Class305.aCanvas3869, (byte) 84);
        Class258_Sub4.aClass373_8552 = Class348_Sub18.method2941(Class305.aCanvas3869, 0, true);
    }

    Class348_Sub22(Npc npc) {
        this.aNpc_6859 = npc;
    }
}
