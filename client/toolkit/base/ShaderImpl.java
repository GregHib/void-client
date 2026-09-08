/* ShaderImpl - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ShaderImpl
/**
 * RENAMED from `ShaderImpl` (JODE-obfuscated).
 * Evidence: extends Shader (Shader); implements Interface19; 2 native methods
 */ extends Shader implements Interface19 {
    long nativeid;

    public final native void w(boolean bool);

    protected final void finalize() {
        if (this.nativeid != 0L) Component36.method1947(0, this);
    }

    private final native void ma(OpenGLToolkit var_oa, NativeHandle var_ya, int i, int i_0_, int[] is, int[] is_1_);

    ShaderImpl(OpenGLToolkit var_oa, NativeHandle var_ya, int i, int i_2_, int[] is, int[] is_3_) {
        ma(var_oa, var_ya, i, i_2_, is, is_3_);
    }
}
