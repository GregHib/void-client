package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public final class VorbisBlock extends SimplePeer {

    public VorbisBlock(DSPState arg0) {
        this.init(arg0);
        if (this.b()) {
            throw new IllegalStateException();
        }
    }

    public int synthesis(OggPacket arg0) { return 0; }

    public void init(DSPState arg0) {}

    protected void clear() {}
}
