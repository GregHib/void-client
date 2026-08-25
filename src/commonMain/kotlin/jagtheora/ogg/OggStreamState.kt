package jagtheora.ogg

import jagtheora.misc.SimplePeer

expect class OggStreamState(arg0: Int) : SimplePeer {
    fun packetPeek(arg0: OggPacket?): Int

    fun packetPeek(): Int

    fun init(arg0: Int): Boolean

    val isEOS: Boolean
        get

    override fun clear()

    fun pageIn(arg0: OggPage?): Boolean

    fun reset(): Boolean

    fun packetOut(): Int

    fun packetOut(arg0: OggPacket?): Int

    fun resetSerialNo(arg0: Int): Boolean
}
