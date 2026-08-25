package jaclib.peer


expect class IUnknownReference(arg0: IUnknown, arg1: hb?) : PeerReference {
    override fun releasePeer(arg0: Long): Long
}
