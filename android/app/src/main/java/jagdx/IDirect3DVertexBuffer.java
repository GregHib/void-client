package jagdx;

import jaclib.memory.Source;
import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public final class IDirect3DVertexBuffer extends IUnknown {

    public int b;

    public IDirect3DVertexBuffer(ti arg0) {
        super(arg0);
    }

    public boolean a(Source arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null || arg1 < 0 || arg3 > arg1 + arg0.getSize()) {
            throw new sja("");
        } else if (this.b + arg2 < arg3) {
            throw new sja("");
        } else {
            return this._Update((long) arg1 + arg0.getAddress(), arg2, arg3, arg4);
        }
    }

    public boolean _Update(long arg0, int arg1, int arg2, int arg3) { return false; }

    @Override
    protected long a() {
        this.b = 0;
        return super.a();
    }

    public int Lock(int arg0, int arg1, int arg2, GeometryBuffer arg3) { return 0; }

    public int Unlock() { return 0; }
}
