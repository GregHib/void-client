package jagtheora.ogg

import jagtheora.misc.SimplePeer

class OggPacket : SimplePeer() {
    val isTheora: Boolean
        external get

    external override fun clear()

    val data: ByteArray?
        external get

    private val isHeader: Int
        external get

    val isKeyFrame: Int
        external get

    val isVorbis: Boolean
        external get
}
