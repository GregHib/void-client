package jaclib.peer


abstract class Peer protected constructor() {
    protected var reference: PeerReference? = null

    protected fun a(arg0: Boolean): Boolean {
        return this.reference!!.a((-67).toByte())
    }

    protected open fun a(): Long {
        return this.reference!!.a(false)
    }

    companion object {
        init {
            init(PeerReference::class.java)
        }

        private external fun init(arg0: Class<*>?)
    }
}
