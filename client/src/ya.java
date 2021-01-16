/* ya - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ya extends za implements Interface19 {
    long nativeid;

    public final native void w(boolean bool);

    final native void ga();

    protected final void finalize() {
        if (((ya) this).nativeid != 0L)
            Class257.method1947(0, this);
    }

    private final native void aa(oa var_oa, int i);

    final native void r();

    ya(oa var_oa, int i) {
        aa(var_oa, i);
    }
}
