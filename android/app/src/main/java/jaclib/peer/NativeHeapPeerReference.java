package jaclib.peer;


public final class NativeHeapPeerReference extends PeerReference {

    public NativeHeapPeerReference(os arg0, ti arg1) {
        super(arg0, arg1);
    }

    protected long releasePeer(long arg0) { return 0L; }
}
