package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public final class IDirect3DSurface extends IUnknown {

    public IDirect3DSurface(ti arg0) {
        super(arg0);
    }

    public int LockRect(int arg0, int arg1, int arg2, int arg3, int arg4, PixelBuffer arg5) { return 0; }

    public boolean UnlockRect() { return false; }
}
