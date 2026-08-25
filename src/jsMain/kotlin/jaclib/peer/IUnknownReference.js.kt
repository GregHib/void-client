package jaclib.peer

actual class IUnknownReference actual constructor(arg0: IUnknown?, arg1: hb?) : PeerReference(arg0, arg1) {
    actual override fun releasePeer(arg0: Long): Long {
        TODO("Not yet implemented")
    }
}