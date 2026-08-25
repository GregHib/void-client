package jagtheora.misc


expect abstract class SimplePeer {
    var peer: Long

    abstract fun clear()

    fun a() 

    @Throws(Throwable::class)
    fun finalize() 

    fun b(): Boolean

    companion object {
        fun init()
    }
}
