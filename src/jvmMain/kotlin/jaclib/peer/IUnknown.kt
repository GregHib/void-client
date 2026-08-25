package jaclib.peer


open actual class IUnknown actual constructor(arg0: hb?) : Peer() {
    init {
        this.reference = IUnknownReference(this, arg0)
    }

    /*private*/ actual external fun AddRef(): Long

    actual fun a(arg0: Int): Long {
        return super.a()
    }
}
