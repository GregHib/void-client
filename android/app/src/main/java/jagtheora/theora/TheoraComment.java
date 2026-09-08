package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public final class TheoraComment extends SimplePeer {

    public TheoraComment() {
        this.init();
        if (this.b()) {
            throw new IllegalStateException();
        }
    }

    protected void init() {}

    protected void clear() {}
}
