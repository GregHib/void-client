package jagtheora.vorbis

import jagtheora.misc.SimplePeer

actual class DSPState actual constructor(arg0: VorbisInfo?) : SimplePeer() {
    actual fun pcmOut(arg0: Int): Array<FloatArray?>? {
        TODO("Not yet implemented")
    }

    actual fun init(arg0: VorbisInfo?) {
    }

    actual fun read(arg0: Int) {
    }

    actual fun blockIn(arg0: VorbisBlock?) {
    }

    actual override fun clear() {
    }

    actual fun granuleTime(): Double {
        TODO("Not yet implemented")
    }
}