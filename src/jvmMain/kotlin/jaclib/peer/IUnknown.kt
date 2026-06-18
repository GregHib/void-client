package jaclib.peer


open class IUnknown(arg0: hb?) : Peer() {
    init {
        this.reference = IUnknownReference(this, arg0)
    }

    private external fun AddRef(): Long

    fun a(arg0: Int): Long {
        return super.a()
    }
}
