/* xa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class xa implements Interface13, Interface19 {
    long nativeid = 0L;

    private final native void r(int i, int i_0_);

    private final native void va(long l, boolean bool);

    public final void w(boolean bool) {
        va(this.nativeid, bool);
    }

    protected final void finalize() {
        if (this.nativeid != 0L)
            Class257.method1947(0, this);
    }

    xa(int i, int i_1_) {
        r(i, i_1_);
    }
}
