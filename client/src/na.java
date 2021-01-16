/* na - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class na extends aa implements Interface19 {
    long nativeid;

    public final native void w(boolean bool);

    protected final void finalize() {
        if (((na) this).nativeid != 0L)
            Class257.method1947(0, this);
    }

    private final native void ma(oa var_oa, ya var_ya, int i, int i_0_,
                                 int[] is, int[] is_1_);

    na(oa var_oa, ya var_ya, int i, int i_2_, int[] is, int[] is_3_) {
        ma(var_oa, var_ya, i, i_2_, is, is_3_);
    }
}
