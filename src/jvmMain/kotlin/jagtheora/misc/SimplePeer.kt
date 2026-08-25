package jagtheora.misc


abstract actual class SimplePeer {
    /*private*/ actual var peer: Long = 0

    /*protected*/ actual abstract fun clear()

    actual fun a() {
        if (!this.b()) {
            this.clear()
        }
    }

    @Throws(Throwable::class)
    actual fun finalize() {
        if (!this.b()) {
            this.a()
        }
//        super.finalize()
    }

    actual fun b(): Boolean {
        return this.peer == 0L
    }

    companion actual object {
        init {
            init()
        }

        /*protected*/ actual external fun init()
    }
}
