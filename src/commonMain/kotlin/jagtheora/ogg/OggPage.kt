package jagtheora.ogg

import jagtheora.misc.SimplePeer

expect class OggPage : SimplePeer {
    val version: Int

    val isContinued: Boolean

    val serialNumber: Int

    val isEOS: Boolean

    val granulePos: Long

    val isBOS: Boolean

    override fun clear()

    val pageNumber: Long

    val completedPackets: Int
}
