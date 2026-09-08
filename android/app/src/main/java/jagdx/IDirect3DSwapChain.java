package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public final class IDirect3DSwapChain extends IUnknown {

    public final ti b;

    public IDirect3DSwapChain(ti arg0) {
        super(arg0);
        this.b = arg0;
    }

    public int Present(int arg0) { return 0; }

    public int _GetBackBuffer(int arg0, int arg1, IDirect3DSurface arg2) { return 0; }

    public IDirect3DSurface a(int arg0, int arg1) {
        IDirect3DSurface local5 = new IDirect3DSurface(this.b);
        int local11 = this._GetBackBuffer(arg0, arg1, local5);
        if (lh.a(local11, true)) {
            throw new sja(String.valueOf(local11));
        }
        return local5;
    }
}
