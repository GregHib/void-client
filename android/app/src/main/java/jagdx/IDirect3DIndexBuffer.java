package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public final class IDirect3DIndexBuffer extends IUnknown {

    public IDirect3DIndexBuffer(ti arg0) {
        super(arg0);
    }

    @Override
    protected long a() {
        return super.a();
    }

    public boolean _Update(long arg0, int arg1, int arg2) { return false; }

    public int Lock(int arg0, int arg1, int arg2, GeometryBuffer arg3) { return 0; }

    public int Unlock() { return 0; }
}
