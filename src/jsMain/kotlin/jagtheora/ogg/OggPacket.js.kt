package jagtheora.ogg

import jagtheora.misc.SimplePeer

actual class OggPacket : SimplePeer() {
    actual val isTheora: Boolean
        get() = TODO("Not yet implemented")

    actual override fun clear() {
    }

    actual val data: ByteArray?
        get() = TODO("Not yet implemented")
    actual val isHeader: Int
        get() = TODO("Not yet implemented")
    actual val isKeyFrame: Int
        get() = TODO("Not yet implemented")
    actual val isVorbis: Boolean
        get() = TODO("Not yet implemented")
}