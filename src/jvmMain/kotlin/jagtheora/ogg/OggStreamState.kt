package jagtheora.ogg

import jagtheora.misc.SimplePeer

class OggStreamState(arg0: Int) : SimplePeer() {
    init {
        check(this.init(arg0))
    }

    external fun packetPeek(arg0: OggPacket?): Int

    private external fun packetPeek(): Int

    private external fun init(arg0: Int): Boolean

    private val isEOS: Boolean
        external get

    external override fun clear()

    external fun pageIn(arg0: OggPage?): Boolean

    private external fun reset(): Boolean

    external fun packetOut(): Int

    external fun packetOut(arg0: OggPacket?): Int

    private external fun resetSerialNo(arg0: Int): Boolean
}
