package jaclib.peer;


import java.lang.ref.WeakReference;

public abstract class PeerReference extends WeakReference {

    public PeerReference b;

    public PeerReference a;

    public long peer;

    protected PeerReference(Peer arg0, ti arg1) {
        super(arg0, arg1.b);
        arg1.a(this, (byte) 92);
    }

    public void setPeer(long arg0) {
        this.b(0);
        this.peer = arg0;
    }

    public final boolean a(int arg0) {
        return this.peer != 0L;
    }

    public final long b(int arg0) {
        long local12;
        if (this.peer == 0L) {
            local12 = 0L;
        } else {
            local12 = this.releasePeer(this.peer);
            this.peer = 0L;
        }
        return local12;
    }

    protected abstract long releasePeer(long arg0);
}
