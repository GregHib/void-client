package jagtheora.ogg

import jagtheora.misc.SimplePeer

actual class OggPage : SimplePeer() {
    /*private*/ actual val version: Int
        external get

    /*private*/ actual val isContinued: Boolean
        external get

    actual val serialNumber: Int
        external get

    /*private*/ actual val isEOS: Boolean
        external get

    /*private*/ actual val granulePos: Long
        external get

    actual val isBOS: Boolean
        external get

    actual external override fun clear()

    /*private*/ actual val pageNumber: Long
        external get

    /*private*/ actual val completedPackets: Int
        external get
}
