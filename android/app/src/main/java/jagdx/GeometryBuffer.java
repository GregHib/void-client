package jagdx;

import jaclib.memory.Buffer;
import jaclib.peer.os;
import jaclib.peer.ti;

public final class GeometryBuffer extends os implements Buffer {

    public GeometryBuffer(ti arg0) {
        super(arg0);
        this.init();
    }

    public void putub(byte[] arg0, int arg1, int arg2, int arg3) {}

    public void getub(byte[] arg0, int arg1, int arg2, int arg3) {}

    @Override
    public void a(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0.length < arg1 + arg3 | arg1 < 0 | arg0 == null | arg2 < 0 || arg3 + arg2 > this.getSize()) {
            throw new sja();
        }
        this.putub(arg0, arg1, arg2, arg3);
    }

    public long getAddress() { return 0L; }

    public void init() {}

    public int getSize() { return 0; }
}
