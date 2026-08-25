package jagtheora.ogg

import jagtheora.misc.SimplePeer

actual class OggSyncState : SimplePeer() {
    actual fun reset(): Boolean {
        TODO("Not yet implemented")
    }

    actual override fun clear() {
    }

    actual fun write(arg0: ByteArray?, arg1: Int): Boolean {
        TODO("Not yet implemented")
    }

    actual fun pageOut(arg0: OggPage?): Int {
        TODO("Not yet implemented")
    }

    actual fun pageSeek(arg0: OggPage?): Long {
        TODO("Not yet implemented")
    }

    actual companion object {
        actual fun init() {
        }
    }
}