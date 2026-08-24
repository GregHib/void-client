package jaclib.peer


open class uda(arg0: hb?) : Peer() {
    init {
        this.reference = NativeHeapPeerReference(this, arg0)
    }
}
