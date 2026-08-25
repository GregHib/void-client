package jagtheora.ogg

import jagtheora.misc.SimplePeer

actual class OggSyncState : SimplePeer() {
    init {
        init()
        check(!this.b())
    }

    /*private*/ actual external fun reset(): Boolean

    actual external override fun clear()

    actual external fun write(arg0: ByteArray?, arg1: Int): Boolean

    actual external fun pageOut(arg0: OggPage?): Int

    /*private*/ actual external fun pageSeek(arg0: OggPage?): Long

    companion object {
        /*protected*/ actual external fun init()
    }
}
