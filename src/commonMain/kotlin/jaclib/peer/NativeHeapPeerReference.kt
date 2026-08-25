package jaclib.peer


expect class NativeHeapPeerReference(arg0: uda, arg1: hb?) : PeerReference {
    override fun releasePeer(arg0: Long): Long
}
