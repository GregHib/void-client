package jaclib.peer;


public class os extends Peer {

    public os(ti arg0) {
        this.reference = new NativeHeapPeerReference(this, arg0);
    }
}
