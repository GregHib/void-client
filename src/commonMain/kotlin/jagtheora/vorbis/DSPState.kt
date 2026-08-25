package jagtheora.vorbis

import jagtheora.misc.SimplePeer

expect class DSPState(arg0: VorbisInfo?) : SimplePeer {

    fun pcmOut(arg0: Int): Array<FloatArray?>?

    fun init(arg0: VorbisInfo?)

    fun read(arg0: Int)

    fun blockIn(arg0: VorbisBlock?)

    override fun clear()

    fun granuleTime(): Double
}
