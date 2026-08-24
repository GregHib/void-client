package jagtheora.ogg

import jagtheora.misc.SimplePeer

class OggSyncState : SimplePeer() {
    init {
        init()
        check(!this.b())
    }

    private external fun reset(): Boolean

    external override fun clear()

    external fun write(arg0: ByteArray?, arg1: Int): Boolean

    external fun pageOut(arg0: OggPage?): Int

    private external fun pageSeek(arg0: OggPage?): Long

    companion object {
        protected external fun init()
    }
}
