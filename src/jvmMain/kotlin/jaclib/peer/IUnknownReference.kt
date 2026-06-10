package jaclib.peer


class IUnknownReference(arg0: IUnknown?, arg1: hb?) : PeerReference(arg0, arg1) {
    external override fun releasePeer(arg0: Long): Long
}
