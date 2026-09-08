/* InputHandler - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class346` (JODE-obfuscated).
 * Abstract base for input handlers. Declares sync/2696/2697(->Interface6)/2698; subclass KeyFocusHandler implements KeyListener + FocusListener.
 */

abstract class InputHandler {
    static int anInt4274;
    static boolean aBoolean4275;
    static int canvasWidth;
    static int anInt4277;

    abstract void sync(int i);

    abstract boolean isKeyDown(int i, int i_0_);

    public InputHandler() {
        /* empty */
    }

    abstract Interface6 popKeyEvent(int i);

    abstract void reset(int i);

    /** Quantize {@code fs} into {@code is} as {@code (short)(fs * 16383)}. */
    static final short[][] quantizeFloatsToShorts(int i, short[][] is, float[][] fs) {
        try {
            if (i != 16383) return null;
            for (int i_1_ = 0; fs.length > i_1_; i_1_++) {
                for (int i_2_ = 0; i_2_ < is[i_1_].length; i_2_++)
                    is[i_1_][i_2_] = (short) (int) (16383.0F * fs[i_1_][i_2_]);
            }
            anInt4277++;
            return is;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("efa.L(" + i + ',' + (is != null ? "{...}" : "null") + ',' + (fs != null ? "{...}" : "null") + ')'));
        }
    }
}
