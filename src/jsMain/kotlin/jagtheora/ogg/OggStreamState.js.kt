package jagtheora.ogg

import jagtheora.misc.SimplePeer

actual class OggStreamState actual constructor(arg0: Int) : SimplePeer() {
    actual fun packetPeek(arg0: OggPacket?): Int {
        TODO("Not yet implemented")
    }

    actual fun packetPeek(): Int {
        TODO("Not yet implemented")
    }

    actual fun init(arg0: Int): Boolean {
        TODO("Not yet implemented")
    }

    actual val isEOS: Boolean
        get() = TODO("Not yet implemented")

    actual override fun clear() {
    }

    actual fun pageIn(arg0: OggPage?): Boolean {
        TODO("Not yet implemented")
    }

    actual fun reset(): Boolean {
        TODO("Not yet implemented")
    }

    actual fun packetOut(): Int {
        TODO("Not yet implemented")
    }

    actual fun packetOut(arg0: OggPacket?): Int {
        TODO("Not yet implemented")
    }

    actual fun resetSerialNo(arg0: Int): Boolean {
        TODO("Not yet implemented")
    }
}