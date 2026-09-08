/* BufferedToolkit - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class BufferedToolkit
/**
 * RENAMED from `BufferedToolkit` (JODE-obfuscated).
 * Evidence: extends r (r); implements Interface19; 1 native method
 */ extends r implements Interface19 {
    long nativeid;

    BufferedToolkit(OpenGLToolkit var_oa) {
        /* empty */
    }

    protected final void finalize() {
        if (this.nativeid != 0L) Component36.method1947(0, this);
    }

    public final native void w(boolean bool);
}
