package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

actual class VorbisInfo : SimplePeer() {

    actual var rate: Int = 0


    actual var channels: Int = 0

    init {
        init()
        check(!this.b())
    }

    actual external fun headerIn(arg0: VorbisComment?, arg1: OggPacket?): Int

    actual external override fun clear()

    actual companion object {
        init {
            initFields()
        }

        /*private*/ actual external fun initFields()

        /*protected*/ actual external fun init()
    }
}
