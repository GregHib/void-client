package jagtheora.theora;

import jagtheora.misc.SimplePeer;
import jagtheora.ogg.OggPacket;

public final class DecoderContext extends SimplePeer {

    public DecoderContext(TheoraInfo arg0, SetupInfo arg1) {
        this.init(arg0, arg1);
        if (this.b()) {
            throw new IllegalArgumentException("");
        }
    }

    public double granuleTime(GranulePos arg0) { return 0d; }

    public int decodePacketIn(OggPacket arg0, GranulePos arg1) { return 0; }

    public int getMaxPostProcessingLevel() { return 0; }

    public long granuleFrame(GranulePos arg0) { return 0L; }

    public int setPostProcessingLevel(int arg0) { return 0; }

    public int setGranulePosition(long arg0) { return 0; }

    public int decodeFrame(Frame arg0) { return 0; }

    public void init(TheoraInfo arg0, SetupInfo arg1) {}

    protected void clear() {}
}
