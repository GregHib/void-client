package jaclib.peer


actual class NativeHeapPeerReference actual constructor(arg0: uda, arg1: hb?) : PeerReference(arg0, arg1) {
    actual external override fun releasePeer(arg0: Long): Long
}
