package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public final class OggStreamState extends SimplePeer {

    public OggStreamState(int arg0) {
        if (!this.init(arg0)) {
            throw new IllegalStateException();
        }
    }

    public boolean init(int arg0) { return false; }

    public int packetOut() { return 0; }

    public boolean isEOS() { return false; }

    public int packetPeek(OggPacket arg0) { return 0; }

    protected void clear() {}

    public boolean reset() { return false; }

    public int packetOut(OggPacket arg0) { return 0; }

    public int packetPeek() { return 0; }

    public boolean resetSerialNo(int arg0) { return false; }

    public boolean pageIn(OggPage arg0) { return false; }
}
