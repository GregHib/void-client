package jagtheora.ogg

import jagtheora.misc.SimplePeer

expect class OggPacket : SimplePeer {
    val isTheora: Boolean

    override fun clear()

    val data: ByteArray?

    val isHeader: Int

    val isKeyFrame: Int

    val isVorbis: Boolean
}
