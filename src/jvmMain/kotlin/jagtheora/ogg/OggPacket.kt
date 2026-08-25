package jagtheora.ogg

import jagtheora.misc.SimplePeer

actual class OggPacket : SimplePeer() {
    actual val isTheora: Boolean
        external get

    actual external override fun clear()

    actual val data: ByteArray?
        external get

    /*private*/ actual val isHeader: Int
        external get

    actual val isKeyFrame: Int
        external get

    actual val isVorbis: Boolean
        external get
}
