package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

class VorbisInfo : SimplePeer() {
    @JvmField
    var rate: Int = 0

    @JvmField
    var channels: Int = 0

    init {
        init()
        check(!this.b())
    }

    external fun headerIn(arg0: VorbisComment?, arg1: OggPacket?): Int

    external override fun clear()

    companion object {
        init {
            initFields()
        }

        private external fun initFields()

        protected external fun init()
    }
}
