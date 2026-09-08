package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public final class VorbisInfo extends SimplePeer {

    public int rate;

    public int channels;

    static {
        initFields();
    }

    public static void initFields() {}

    public VorbisInfo() {
        this.init();
        if (this.b()) {
            throw new IllegalStateException();
        }
    }

    protected void clear() {}

    public int headerIn(VorbisComment arg0, OggPacket arg1) { return 0; }

    protected void init() {}
}
