package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public final class OggPacket extends SimplePeer {

    public boolean isTheora() { return false; }

    public int isHeader() { return 0; }

    protected void clear() {}

    public byte[] getData() { return null; }

    public int isKeyFrame() { return 0; }

    public boolean isVorbis() { return false; }
}
