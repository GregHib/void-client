package jagtheora.ogg

import jagtheora.misc.SimplePeer

expect class OggSyncState : SimplePeer {
    fun reset(): Boolean

    override fun clear()

    fun write(arg0: ByteArray?, arg1: Int): Boolean

    fun pageOut(arg0: OggPage?): Int

    fun pageSeek(arg0: OggPage?): Long

    companion object {
        /*protected*/ fun init()
    }
}
