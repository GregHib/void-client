package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public final class Frame extends SimplePeer {

    public final int b;

    public final int a;

    public final int[] pixels;

    protected void init() {}

    public Frame(int arg0, int arg1) {
        this.b = arg0;
        this.a = arg1;
        this.pixels = new int[this.a * this.b];
    }

    protected void clear() {}
}
