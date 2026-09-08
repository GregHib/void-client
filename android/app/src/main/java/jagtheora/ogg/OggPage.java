package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public final class OggPage extends SimplePeer {

    public long getGranulePos() { return 0L; }

    public boolean isBOS() { return false; }

    public int getVersion() { return 0; }

    public int getCompletedPackets() { return 0; }

    public int getSerialNumber() { return 0; }

    public boolean isEOS() { return false; }

    protected void clear() {}

    public boolean isContinued() { return false; }

    public long getPageNumber() { return 0L; }
}
