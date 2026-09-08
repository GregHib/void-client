package jaclib.peer;


public class IUnknown extends Peer {

    public IUnknown(ti arg0) {
        this.reference = new IUnknownReference(this, arg0);
    }

    public long AddRef() { return 0L; }

    public final long a(int arg0) {
        return super.a();
    }
}
