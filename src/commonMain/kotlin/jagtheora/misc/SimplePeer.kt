package jagtheora.misc


abstract class SimplePeer {
    private var peer: Long = 0

    protected abstract fun clear()

    fun a() {
        if (!this.b()) {
            this.clear()
        }
    }

    @Throws(Throwable::class)
    fun finalize() {
        if (!this.b()) {
            this.a()
        }
//        super.finalize()
    }

    fun b(): Boolean {
        return this.peer == 0L
    }

    private fun setPeer(arg0: Long) {
        this.peer = arg0
    }

    companion object {
        init {
            init()
        }

        protected external fun init()
    }
}
