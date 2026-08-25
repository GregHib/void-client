package jagtheora.vorbis

import jagtheora.misc.SimplePeer

actual class DSPState actual constructor(arg0: VorbisInfo?) : SimplePeer() {
    init {
        this.init(arg0)
        check(!this.b())
    }

    actual external fun pcmOut(arg0: Int): Array<FloatArray?>?

    /*private*/ actual external fun init(arg0: VorbisInfo?)

    actual external fun read(arg0: Int)

    actual external fun blockIn(arg0: VorbisBlock?)

    actual external override fun clear()

    actual external fun granuleTime(): Double
}
