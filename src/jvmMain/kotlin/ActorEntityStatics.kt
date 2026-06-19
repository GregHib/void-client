import WaterDetailOptionStateStatics.method1781
import ArchiveResourceProviderStatics.method2348
import InputStream_Sub1Statics.method125
import java.math.BigInteger

object ActorEntityStatics {
    @JvmField
            var anInt8757: Int = 0
            @JvmField
            var anInt8758: Int = 0
            @JvmField
            var anInt8760: Int = 0
            @JvmField
            var anInt8761: Int = 0
            @JvmField
            var aBigInteger8762: BigInteger? = BigInteger("10001", 16)
            @JvmField
            var anInt8763: Int = 0
            @JvmField
            var aSoundChannelMixer_8764: SoundChannelMixer? = null
            @JvmField
            var anInt8765: Int = 0
    
            @JvmStatic
            fun method2478(i: Int): Int {
                if (i != 1000) return -103
                anInt8763++
                var bool = false
                var bool_5_ = false
                var bool_6_ = false
                if (VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.aBoolean3777 && !VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.aBoolean3794) {
                    bool = (NoiseTextureNodeStatics.aClass348_Sub4_9264!!.anInt6609) >= 512 || (NoiseTextureNodeStatics.aClass348_Sub4_9264!!.anInt6609) == 0
                    if (PrivilegedOperationWorkerStatics.aString3803.startsWith("win")) {
                        bool_6_ = true
                        bool_5_ = true
                    } else bool_5_ = true
                }
                if (ScreenAnchorAlignmentStatics.aBoolean2881) bool = false
                if (VideoStreamDecoderStatics.aBoolean4117) bool_5_ = false
                if (AbstractTileShapeStatics.aBoolean6558) bool_6_ = false
                if (!bool && !bool_5_ && !bool_6_) return method2348(-8454)
                var i_7_ = -1
                var i_8_ = -1
                var i_9_ = -1
                if (bool) {
                    try {
                        i_7_ = method1781(2, -126, 1000)
                    } catch (exception: Exception) {
                        /* empty */
                    }
                }
                do {
                    if (bool_6_) {
                        try {
                            i_9_ = method1781(3, -70, 1000)
                            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(i + -33350) == 3) {
                                val class365 = FacingDirectionNodeStatics.aRenderer6654!!.c()
                                val l = (0xffffffffffffL and class365.aLong4471)
                                val i_10_ = class365.anInt4476
                                if (i_10_ == 4318) {
                                    bool_5_ = bool_5_ and (l >= 64425238954L)
                                    break
                                } else if (i_10_ != 4098) break
                                bool_5_ = bool_5_ and (l >= 60129613779L)
                            }
                        } catch (exception: Exception) {
                            /* empty */
                        }
                    }
                } while (false)
                if (bool_5_) {
                    try {
                        i_8_ = method1781(1, i xor 0x3ab.inv(), 1000)
                    } catch (exception: Exception) {
                        /* empty */
                    }
                }
                if (i_7_ == -1 && i_8_ == -1 && i_9_ == -1) return method2348(i + -9454)
                i_9_ = (i_9_ * 1.1f).toInt()
                i_8_ = (i_8_ * 1.1f).toInt()
                if (i_7_ > i_9_ && i_8_ < i_7_) return SpriteRenderableStatics.method454(i_7_, (-116).toByte())
                if (i_9_ <= i_8_) return GameClock.method600((-59).toByte(), 1, i_8_)
                return GameClock.method600((-80).toByte(), 3, i_9_)
            }
    
            @JvmStatic
            fun method2479(i: Int) {
                if (i == 19424) {
                    aBigInteger8762 = null
                    aSoundChannelMixer_8764 = null
                }
            }
    
            @JvmStatic
            fun method2480(i: Int) {
                if (i == -1) {
                    anInt8761++
                    IntKeyNodeStatics.aNodeDeque_6978 = NodeDeque()
                }
            }
}
