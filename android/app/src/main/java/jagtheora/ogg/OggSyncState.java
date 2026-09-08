package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public final class OggSyncState extends SimplePeer {

    public OggSyncState() {
        this.init();
        if (this.b()) {
            throw new IllegalStateException();
        }
    }

    protected void clear() {}

    protected void init() {}

    public long pageSeek(OggPage arg0) { return 0L; }

    public int pageOut(OggPage arg0) { return 0; }

    public boolean write(byte[] arg0, int arg1) { return false; }

    public boolean reset() { return false; }
}
