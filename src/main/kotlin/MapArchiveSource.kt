import LinkedListIterator.Companion.method1242
import SocketFactory.Companion.method2049
import NormalMapTextureNode.Companion.method3141
import HardCacheEntryReference.Companion.method3201
import java.io.IOException

/* Class292 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapArchiveSource internal constructor(private val aJs5Archive_4804: Js5Archive) : Interface7 {
    override fun method31(i: Int): Int {
        anInt4801++
        val i_0_ = 16 / ((i - -43) / 62)
        if (aJs5Archive_4804.method401(125)) return 100
        return aJs5Archive_4804.method398((-31).toByte())
    }

    override fun method32(i: Int): Class69? {
        if (i != -15004) return null
        anInt4800++
        return Class69.aClass69_1195
    }

    companion object {
        @JvmField
        var anInt4797: Int = 0
        var aIntRange_4798: IntRange?
        var anInt4799: Int = 0
        var anInt4800: Int = 0
        var anInt4801: Int = 0
        var anInt4802: Int = 0
        @JvmField
        var anInt4803: Int = -1
        var anInt4805: Int = 0

        fun method2201(i: Int): Int {
            anInt4805++
            synchronized(ModelDataCache.aLruByteCache_355!!) {
                if (i != 2121) method2202(-113)
                return ModelDataCache.aLruByteCache_355!!.method575(0)
            }
        }

        @JvmStatic
        fun method2202(i: Int) {
            aIntRange_4798 = null
            if (i != -17902) anInt4803 = 78
        }

        @JvmStatic
        fun method2203(i: Byte): Boolean {
            val i_1_ = 11 % ((12 - i) / 53)
            anInt4802++
            try {
                return method3201(true)
            } catch (ioexception: IOException) {
                method2049(106)
                return true
            } catch (exception: Exception) {
                var string =
                    ("T2 - " + (if (ModelVertexColorBuffer.aIntRange_6584 != null) ModelVertexColorBuffer.aIntRange_6584!!.method1058(119.toByte()) else -1) + "," + (if (GraphicsOptionState.aIntRange_3145 != null) GraphicsOptionState.aIntRange_3145!!.method1058(119.toByte()) else -1) + "," + (if (SineWaveTextureNode.aIntRange_9456 == null) -1 else SineWaveTextureNode.aIntRange_9456!!.method1058(113.toByte())) + " - " + RadialTextureNode.anInt9341 + "," + ((LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) + ArbVertexProgram.regionTileX) + "," + (Class90.regionTileY - -(LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0])) + " - ")
                var i_2_ = 0
                while (RadialTextureNode.anInt9341 > i_2_ && i_2_ < 50) {
                    string += (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![i_2_]).toString() + ","
                    i_2_++
                }
                method1242(string, exception, 15004)
                method3141(false, 11.toByte())
                return true
            }
        }

        init {
            aIntRange_4798 = IntRange(29, 7)
        }
    }
}
