package jagtheora.vorbis

import jagtheora.misc.SimplePeer

class DSPState(arg0: VorbisInfo?) : SimplePeer() {
    init {
        this.init(arg0)
        check(!this.b())
    }

    external fun pcmOut(arg0: Int): Array<FloatArray?>?

    private external fun init(arg0: VorbisInfo?)

    external fun read(arg0: Int)

    external fun blockIn(arg0: VorbisBlock?)

    external override fun clear()

    external fun granuleTime(): Double
}
