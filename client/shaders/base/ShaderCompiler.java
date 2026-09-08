/* ShaderCompiler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
/**
 * RENAMED from `Class328` (JODE-obfuscated).
 * Shader compiler. Reports 'aa compile failed:' on GLSL/ARB shader compilation errors and coordinates with GlExtensionManager (GL extension availability).
 */

import jaggl.OpenGL;

class ShaderCompiler {
    static int anInt4099;
    static int anInt4100;
    static int anInt4101;

    /** Compile ARB shader object from {@code is}; logs {@code aa compile failed:} on error. */
    static final DisplayModeManagerContainer271 compileShader(GlExtensionManager class377, byte[] is, int i, int i_0_) {
        try {
            anInt4099++;
            if (is == null || is.length == 0) return null;
            long l = OpenGL.glCreateShaderObjectARB(i_0_);
            OpenGL.glShaderSourceRawARB(l, is);
            OpenGL.glCompileShaderARB(l);
            if (i > -95) compileShader(null, null, -27, 75);
            OpenGL.glGetObjectParameterivARB(l, 35713, (DefinitionSub2.anIntArray9096), 0);
            if (DefinitionSub2.anIntArray9096[0] == 0) {
                if (DefinitionSub2.anIntArray9096[0] == 0) System.out.println("aa compile failed:");
                OpenGL.glGetObjectParameterivARB(l, 35716, (DefinitionSub2.anIntArray9096), 1);
                if (DefinitionSub2.anIntArray9096[1] > 1) {
                    byte[] is_1_ = new byte[DefinitionSub2.anIntArray9096[1]];
                    OpenGL.glGetInfoLogARB(l, (DefinitionSub2.anIntArray9096[1]), DefinitionSub2.anIntArray9096, 0, is_1_, 0);
                    System.out.println(new String(is_1_));
                }
                if (DefinitionSub2.anIntArray9096[0] == 0) {
                    OpenGL.glDeleteObjectARB(l);
                    return null;
                }
            }
            return new DisplayModeManagerContainer271(class377, l, i_0_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("dea.E(" + (class377 != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ')'));
        }
    }

    static final HashNodeSub19 method2609(int i, int i_2_) {
        anInt4101++;
        HashNodeSub19 class348_sub42_sub19 = ((HashNodeSub19) ImageCacheStore.aClass308_4036.method2302(i_2_, (byte) -68));
        if (class348_sub42_sub19 != null) return class348_sub42_sub19;
        byte[] is = Component22.aClass45_1743.getFile(-1860, i_2_, 0);
        if (is == null || is.length <= 1) return null;
        try {
            class348_sub42_sub19 = RenderableSub4.method2502(is, -104);
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage() + " S: " + i_2_);
        }
        if (i > -103) return null;
        ImageCacheStore.aClass308_4036.method2305(i_2_, class348_sub42_sub19, -1);
        return class348_sub42_sub19;
    }
}
