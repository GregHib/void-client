package jaclib.peer;


public final class IUnknownReference extends PeerReference {

    public IUnknownReference(IUnknown arg0, ti arg1) {
        super(arg0, arg1);
    }

    protected long releasePeer(long arg0) { return 0L; }
}
