package jagtheora.vorbis;

import jagtheora.misc.SimplePeer;

public final class DSPState extends SimplePeer {

    public DSPState(VorbisInfo arg0) {
        this.init(arg0);
        if (this.b()) {
            throw new IllegalStateException();
        }
    }

    public float[][] pcmOut(int arg0) { return null; }

    public void init(VorbisInfo arg0) {}

    public double granuleTime() { return 0d; }

    protected void clear() {}

    public void blockIn(VorbisBlock arg0) {}

    public void read(int arg0) {}
}
