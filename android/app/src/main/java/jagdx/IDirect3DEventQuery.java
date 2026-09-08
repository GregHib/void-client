package jagdx;

import jaclib.peer.IUnknown;
import jaclib.peer.ti;

public final class IDirect3DEventQuery extends IUnknown {

    public IDirect3DEventQuery(ti arg0) {
        super(arg0);
    }

    public int Issue() { return 0; }

    public int IsSignaled() { return 0; }
}
