package jagtheora.ogg

import jagtheora.misc.SimplePeer

actual class OggPage : SimplePeer() {
    actual val version: Int
        get() = TODO("Not yet implemented")
    actual val isContinued: Boolean
        get() = TODO("Not yet implemented")
    actual val serialNumber: Int
        get() = TODO("Not yet implemented")
    actual val isEOS: Boolean
        get() = TODO("Not yet implemented")
    actual val granulePos: Long
        get() = TODO("Not yet implemented")
    actual val isBOS: Boolean
        get() = TODO("Not yet implemented")

    actual override fun clear() {
    }

    actual val pageNumber: Long
        get() = TODO("Not yet implemented")
    actual val completedPackets: Int
        get() = TODO("Not yet implemented")
}