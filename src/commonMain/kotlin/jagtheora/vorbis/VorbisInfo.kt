package jagtheora.vorbis

import jagtheora.misc.SimplePeer
import jagtheora.ogg.OggPacket

expect class VorbisInfo() : SimplePeer {

    var rate: Int

    var channels: Int

    fun headerIn(arg0: VorbisComment?, arg1: OggPacket?): Int

    override fun clear()

    companion object {

        fun initFields()

        fun init()
    }
}
