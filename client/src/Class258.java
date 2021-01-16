/* Class258 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

abstract class Class258 implements Interface9 {
    private int anInt4847;
    static int anInt4848 = 0;
    int anInt4849;
    static int anInt4850;
    ha_Sub2 aHa_Sub2_4851;
    static int anInt4852;
    static int anInt4853;
    static int anInt4854;
    static int anInt4855;
    private boolean aBoolean4856 = false;
    static int anInt4857;
    int anInt4858;
    int anInt4859;
    private boolean aBoolean4860;
    static int anInt4861;
    static int anInt4862;
    static int anInt4863;

    final boolean method1950(int i) {
        anInt4852++;
        int i_0_ = 22 / ((i - -31) / 50);
        if (this.aHa_Sub2_4851.aBoolean7820) {
            int i_1_ = method1951(-120);
            this.aHa_Sub2_4851.method3771((byte) -102, this);
            OpenGL.glGenerateMipmapEXT(this.anInt4849);
            aBoolean4860 = true;
            method1956(true);
            method1954(i_1_, 121);
            return true;
        }
        return false;
    }

    private final int method1951(int i) {
        anInt4861++;
        if (i >= -96)
            anInt4847 = -92;
        int i_2_ = (this.aHa_Sub2_4851
                .method3798(this.anInt4858, 2)
                * anInt4847);
        if (aBoolean4860)
            return i_2_ * 4 / 3;
        return i_2_;
    }

    final void method1952(int i) {
        anInt4863++;
        if (this.anInt4859 > 0) {
            this.aHa_Sub2_4851.method3737((this
                            .anInt4859),
                    (byte) 121,
                    method1951(i + 19838));
            this.anInt4859 = 0;
        }
        if (i != -19948)
            this.anInt4859 = -40;
    }

    final int method1953(int i) {
        anInt4853++;
        if (i < 29)
            method1956(true);
        return this.anInt4859;
    }

    private final void method1954(int i, int i_3_) {
        anInt4854++;
        if (i_3_ < 17)
            aBoolean4856 = true;
        this.aHa_Sub2_4851.anInt7748 -= i;
        this.aHa_Sub2_4851.anInt7748
                += method1951(-106);
    }

    final void method1955(boolean bool, byte i) {
        if (i != -123)
            method1953(50);
        if (aBoolean4860 == !bool) {
            int i_4_ = method1951(-119);
            aBoolean4860 = true;
            method1956(true);
            method1954(i_4_, 115);
        }
        anInt4850++;
    }

    private final void method1956(boolean bool) {
        anInt4857++;
        if (bool != true)
            this.anInt4849 = -74;
        this.aHa_Sub2_4851.method3771((byte) -87, this);
        if (!aBoolean4856) {
            OpenGL.glTexParameteri(this.anInt4849, 10241,
                    aBoolean4860 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.anInt4849, 10240, 9728);
        } else {
            OpenGL.glTexParameteri(this.anInt4849, 10241,
                    aBoolean4860 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.anInt4849, 10240, 9729);
        }
    }

    final void method1957(int i, boolean bool) {
        if (!aBoolean4856 == bool) {
            aBoolean4856 = bool;
            method1956(true);
        }
        anInt4855++;
        if (i != 9728)
            method1956(false);
    }

    protected final void finalize() throws Throwable {
        anInt4862++;
        method1952(-19948);
        super.finalize();
    }

    Class258(ha_Sub2 var_ha_Sub2, int i, int i_5_, int i_6_, boolean bool) {
        aBoolean4860 = bool;
        this.anInt4849 = i;
        anInt4847 = i_6_;
        this.anInt4858 = i_5_;
        this.aHa_Sub2_4851 = var_ha_Sub2;
        OpenGL.glGenTextures(1, Class286_Sub5.anIntArray6260, 0);
        this.anInt4859 = Class286_Sub5.anIntArray6260[0];
        method1954(0, 94);
    }

    public abstract void method37(int i);
}
