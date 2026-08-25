package jagtheora.misc

actual abstract class SimplePeer {
    actual var peer: Long
        get() = TODO("Not yet implemented")
        set(value) {}

    actual abstract fun clear()
    actual fun a() {
    }

//    @Throws(exceptionClasses = [Throwable::class])
    actual fun finalize() {
    }

    actual fun b(): Boolean {
        TODO("Not yet implemented")
    }

    actual companion object {
        actual fun init() {
        }
    }
}