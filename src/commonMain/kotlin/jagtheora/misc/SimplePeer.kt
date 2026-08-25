package jagtheora.misc


expect abstract class SimplePeer {
    var peer: Long

    abstract fun clear()

    fun a() 

    @Throws(Throwable::class)
    fun finalize() 

    fun b(): Boolean 

    fun setPeer(arg0: Long) 

    companion object {
        fun init()
    }
}
