import LinkedListIteratorStatics.method1242
import SocketFactoryStatics.method2049
import NormalMapTextureNodeStatics.method3141
import HardCacheEntryReferenceStatics.method3201
import java.io.IOException

object MapArchiveSourceStatics {
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
                        ("T2 - " + (if (ModelVertexColorBufferStatics.aIntRange_6584 != null) ModelVertexColorBufferStatics.aIntRange_6584!!.method1058(119.toByte()) else -1) + "," + (if (GraphicsOptionStateStatics.aIntRange_3145 != null) GraphicsOptionStateStatics.aIntRange_3145!!.method1058(119.toByte()) else -1) + "," + (if (SineWaveTextureNodeStatics.aIntRange_9456 == null) -1 else SineWaveTextureNodeStatics.aIntRange_9456!!.method1058(113.toByte())) + " - " + RadialTextureNodeStatics.anInt9341 + "," + ((LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) + ArbVertexProgramStatics.regionTileX) + "," + (RegionMapDecoder.regionTileY - -(LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0])) + " - ")
                    var i_2_ = 0
                    while (RadialTextureNodeStatics.anInt9341 > i_2_ && i_2_ < 50) {
                        string += (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![i_2_]).toString() + ","
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
