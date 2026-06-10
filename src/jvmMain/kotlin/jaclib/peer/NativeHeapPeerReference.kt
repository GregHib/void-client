package jaclib.peer


class NativeHeapPeerReference(arg0: uda?, arg1: hb?) : PeerReference(arg0, arg1) {
    external override fun releasePeer(arg0: Long): Long
}
