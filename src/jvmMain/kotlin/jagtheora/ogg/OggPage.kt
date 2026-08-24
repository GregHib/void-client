package jagtheora.ogg

import jagtheora.misc.SimplePeer

class OggPage : SimplePeer() {
    private val version: Int
        external get

    private val isContinued: Boolean
        external get

    val serialNumber: Int
        external get

    private val isEOS: Boolean
        external get

    private val granulePos: Long
        external get

    val isBOS: Boolean
        external get

    external override fun clear()

    private val pageNumber: Long
        external get

    private val completedPackets: Int
        external get
}
