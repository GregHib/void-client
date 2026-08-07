import LinkedListIterator.Companion.method1242
import NormalMapTextureNode.Companion.method3141
import SocketFactory.Companion.method2049
import java.io.IOException

object MapArchiveSourceStatics {
    var anInt4797: Int = 0
    var anInt4799: Int = 0
    var anInt4802: Int = 0

    var anInt4803: Int = -1
    var anInt4805: Int = 0

    fun method2201(i: Int): Int {
        anInt4805++
        withLock(ModelDataCache.aLruByteCache_355!!) {
            if (i != 2121) method2202(-113)
            return ModelDataCache.aLruByteCache_355!!.method575(0)
        }
    }

    @JvmStatic
    fun method2202(i: Int) {
        InboundPacketHeader.aInboundPacketHeader_4798 = null
        if (i != -17902) anInt4803 = 78
    }

    @JvmStatic
    fun method2203(i: Byte): Boolean {
        val i_1_ = 11 % ((12 - i) / 53)
        anInt4802++
        try {
            return Client.method3201(true)
        } catch (ioexception: IOException) {
            method2049(106)
            return true
        } catch (exception: Exception) {
            var string =
                ("T2 - " + (if (InboundPacketHeader.aInboundPacketHeader_6584 != null) InboundPacketHeader.aInboundPacketHeader_6584!!.method1058(119.toByte()) else -1) + "," + (if (InboundPacketHeader.aInboundPacketHeader_3145 != null) InboundPacketHeader.aInboundPacketHeader_3145!!.method1058(119.toByte()) else -1) + "," + (if (InboundPacketHeader.aInboundPacketHeader_9456 == null) -1 else InboundPacketHeader.aInboundPacketHeader_9456!!.method1058(
                    113.toByte()
                )) + " - " + RadialTextureNode.anInt9341 + "," + ((LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) + ArbVertexProgram.regionTileX) + "," + (RegionMapDecoder.regionTileY - -(LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0])) + " - ")
            var i_2_ = 0
            while (RadialTextureNode.anInt9341 > i_2_ && i_2_ < 50) {
                string += (CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![i_2_]).toString() + ","
                i_2_++
            }
            method1242(string, exception, 15004)
            method3141(false, 11.toByte())
            return true
        }
    }

    var anInt2355: Int = 0
    fun method1365(i: Int, i_11_: Byte, class348_sub49: ByteBuffer) {
        if (BufferedFileReader.aBufferedRandomAccessFile_4538 != null) {
            try {
                BufferedFileReader.aBufferedRandomAccessFile_4538!!.method789(0L, 59.toByte())
                BufferedFileReader.aBufferedRandomAccessFile_4538!!.method783(i, 24, true, (class348_sub49.aByteArray7154))
            } catch (exception: Exception) {
                /* empty */
            }
        }
        anInt2355++
    }
}
