/* ShaderProgram - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class286` (JODE-obfuscated).
 * Abstract GLSL/ARB shader program base. Parent of ArbShaderProgram..Sub9 which embed ARBvp1.0 vertex programs and GLSL fragment shaders (water/fog).
 */

abstract class ShaderProgram {
    static int anInt3681;
    static int anInt3682;
    static NodeSub2 aClass348_Sub2_3683;
    GlToolkitSub2 aHa_Sub2_3684;

    abstract void method2133(int i);

    abstract void method2134(boolean bool, boolean bool_0_);

    public static void method2135(int i) {
        if (i == 0) aClass348_Sub2_3683 = null;
    }

    abstract void method2136(int i, int i_1_, byte i_2_);

    abstract boolean method2137(int i);

    static final boolean method2138(int i) {
        anInt3681++;
        NodeSub48 class348_sub48 = (NodeSub48) NodeSub35.aClass262_6978.first(4);
        if (class348_sub48 == null) return false;
        int i_3_ = 118 % ((-40 - i) / 50);
        for (int i_4_ = 0; (class348_sub48.anInt7126 > i_4_); i_4_++) {
            if ((class348_sub48.aClass144Array7135[i_4_] != null) && (class348_sub48.aClass144Array7135[i_4_].status) == 0) return false;
            if ((class348_sub48.aClass144Array7127[i_4_] != null) && (class348_sub48.aClass144Array7127[i_4_].status) == 0) return false;
        }
        return true;
    }

    abstract void method2139(boolean bool, byte i);

    abstract void method2140(AbstractGlTexture class258, byte i, int i_5_);

    ShaderProgram(GlToolkitSub2 var_ha_Sub2) {
        this.aHa_Sub2_3684 = var_ha_Sub2;
    }
}
