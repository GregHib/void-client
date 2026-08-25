package jagtheora.ogg

import jagtheora.misc.SimplePeer

actual class OggStreamState actual constructor(arg0: Int) : SimplePeer() {
    init {
        check(this.init(arg0))
    }

    actual external fun packetPeek(arg0: OggPacket?): Int

    /*private*/ actual external fun packetPeek(): Int

    /*private*/ actual external fun init(arg0: Int): Boolean

    /*private*/ actual val isEOS: Boolean
        external get

    actual external override fun clear()

    actual external fun pageIn(arg0: OggPage?): Boolean

    /*private*/ actual external fun reset(): Boolean

    actual external fun packetOut(): Int

    actual external fun packetOut(arg0: OggPacket?): Int

    /*private*/ actual external fun resetSerialNo(arg0: Int): Boolean
}
