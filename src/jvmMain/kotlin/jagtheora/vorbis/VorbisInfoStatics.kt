package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

object VorbisInfoStatics {
    init {
        initFields()
    }

    private external fun initFields()

    external fun init()
}
