/* AbstractShaderSub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class AbstractShaderSub3
/**
 * RENAMED from `Class367_Sub3` (JODE-obfuscated).
 * Evidence: subclass of AbstractShader (hierarchy)
 */ extends AbstractShader {
    static int anInt7298;
    static int[] anIntArray7299;
    static int anInt7300;
    static Component183 aClass114_7301 = new Component183(21, -1);
    static int anInt7302;
    static int anInt7303;
    /** Per-entry temporary-ignore flag (packet bit 2). */
    static boolean[] ignoreTemporary = new boolean[100];
    static int anInt7305;
    static int anInt7306;
    static int anInt7307;

    final void method3525(int i, boolean bool) {
        this.aHa_Sub3_4479.setWindowPos(true, i + -47145);
        anInt7306++;
        if (i != 15192) method3540(26, 92, -76, -90, 76, -7, -18, -119, 33, false);
    }

    public static void method3539(byte i) {
        int i_0_ = 74 % ((72 - i) / 37);
        ignoreTemporary = null;
        aClass114_7301 = null;
        anIntArray7299 = null;
    }

    final void method3527(int i, Interface18 interface18, int i_1_) {
        if (i_1_ != -16776) aClass114_7301 = null;
        this.aHa_Sub3_4479.setActiveTexture((byte) -105, interface18);
        anInt7300++;
        this.aHa_Sub3_4479.swapInterval2(true, i);
    }

    final void method3520(byte i) {
        anInt7305++;
        if (i != 87) method3530(71);
        this.aHa_Sub3_4479.setWindowPos(false, i + -32040);
    }

    final void method3521(boolean bool, byte i) {
        anInt7303++;
        if (i != -103) method3527(-78, null, -100);
    }

    AbstractShaderSub3(GlToolkitSub3 var_ha_Sub3) {
        super(var_ha_Sub3);
    }

    final boolean method3530(int i) {
        if (i >= -57) return true;
        anInt7307++;
        return true;
    }

    static final void method3540(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool) {
        if (i_6_ >= Component27.anInt4960 && Component22.anInt1745 >= i_6_ && Component27.anInt4960 <= i_5_ && Component22.anInt1745 >= i_5_ && i_7_ >= Component27.anInt4960 && i_7_ <= Component22.anInt1745 && Component27.anInt4960 <= i_9_ && Component22.anInt1745 >= i_9_ && i >= Component72.anInt1910 && PauseTimer.anInt513 >= i && i_2_ >= Component72.anInt1910 && PauseTimer.anInt513 >= i_2_ && Component72.anInt1910 <= i_8_ && i_8_ <= PauseTimer.anInt513 && Component72.anInt1910 <= i_4_ && i_4_ <= PauseTimer.anInt513)
            Sprite.method3009(i_2_, i_8_, i_5_, i_9_, i_4_, (byte) -1, i_7_, i, i_3_, i_6_);
        else Component192.drawBezier(i_3_, i_7_, i_6_, i_2_, i_5_, i_8_, i_9_, i, 3, i_4_);
        if (bool != true) method3540(37, -122, 69, -89, -8, -19, 89, 112, 12, false);
        anInt7302++;
    }

    final void method3526(int i, int i_10_, int i_11_) {
        if (i != 10756) aClass114_7301 = null;
        anInt7298++;
    }
}
