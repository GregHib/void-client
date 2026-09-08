package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.os;
import jaclib.peer.ti;

public final class PixelBuffer extends os implements Buffer {

    public PixelBuffer(ti arg0) {
        super(arg0);
        this.init();
    }

    public void b(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg0.length < arg1 + arg3 | arg1 < 0 | arg0 == null | arg2 < 0 || this.getSize() < arg3 * 4 + arg2) {
            throw new sja();
        }
        this.puti(arg0, arg1, arg2, arg3);
    }

    public void getub(byte[] arg0, int arg1, int arg2, int arg3) {}

    public int getSlicePitch() { return 0; }

    public void geti(int[] arg0, int arg1, int arg2, int arg3) {}

    public void a(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 0 | arg0 == null | arg0.length < arg3 + arg1 | arg2 < 0 || this.getSize() < arg3 * 4 + arg2) {
            throw new sja();
        }
        this.geti(arg0, arg1, arg2, arg3);
    }

    public void putub(byte[] arg0, int arg1, int arg2, int arg3) {}

    @Override
    public long getAddress() {
        return 0L;
    }

    public void puti(int[] arg0, int arg1, int arg2, int arg3) {}

    @Override
    public void a(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 0 | arg3 + arg1 > arg0.length | arg0 == null | arg1 < 0 || arg3 + arg2 > this.getSize()) {
            throw new sja();
        }
        this.putub(arg0, arg1, arg2, arg3);
    }

    public int getRowPitch() { return 0; }

    public void init() {}

    public int getSize() { return 0; }
}
