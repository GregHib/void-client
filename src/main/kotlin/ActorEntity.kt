import WaterDetailOptionState.Companion.method1781
import ArchiveResourceProvider.Companion.method2348
import InputStream_Sub1.Companion.method125
import java.math.BigInteger

abstract class ActorEntity internal constructor(i: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int) : SceneEntity() {
    var aShort8759: Short
    override fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int {
        anInt8758++
        val i_0_ = this.x shr Tooltip.anInt4459
        val i_1_ = this.y shr Tooltip.anInt4459
        val i_2_ = -103 / ((i - -14) / 61)
        var i_3_ = 0
        if (DisplayModeOptionState.anInt6111 == i_0_) i_3_++
        else if (DisplayModeOptionState.anInt6111 < i_0_) i_3_ += 2
        if (i_1_ == GlIndexBufferArb.anInt8502) i_3_ += 3
        else if (i_1_ < GlIndexBufferArb.anInt8502) i_3_ += 6
        val i_4_ = PositionedSceneNode.anIntArray8797!![i_3_]
        if ((this.aShort8759.toInt() and i_4_) != 0) return this.method2390(class348_sub1s!!, i_0_, -2, i_1_)
        if (this.aShort8759.toInt() == 1 && i_0_ > 0) return this.method2390(class348_sub1s!!, -1 + i_0_, -2, i_1_)
        if (this.aShort8759.toInt() == 4 && i_0_ <= SpotAnimEntity.anInt6451) return this.method2390(class348_sub1s!!, 1 + i_0_, -2, i_1_)
        if (this.aShort8759.toInt() == 8 && i_1_ > 0) return this.method2390(class348_sub1s!!, i_0_, -2, -1 + i_1_)
        if (this.aShort8759.toInt() == 2 && i_1_ <= RegionSceneShifter.anInt7054) return this.method2390(class348_sub1s!!, i_0_, -2, i_1_ + 1)
        if (this.aShort8759.toInt() == 16 && i_0_ > 0 && i_1_ <= RegionSceneShifter.anInt7054) return this.method2390(class348_sub1s!!, -1 + i_0_, -2, i_1_ + 1)
        if (this.aShort8759.toInt() == 32 && SpotAnimEntity.anInt6451 >= i_0_ && RegionSceneShifter.anInt7054 >= i_1_) return this.method2390(class348_sub1s!!, i_0_ + 1, -2, i_1_ + 1)
        if (this.aShort8759.toInt() == 128 && i_0_ > 0 && i_1_ > 0) return this.method2390(class348_sub1s!!, i_0_ - 1, -2, i_1_ - 1)
        if (this.aShort8759.toInt() == 64 && i_0_ <= SpotAnimEntity.anInt6451 && i_1_ > 0) return this.method2390(class348_sub1s!!, 1 + i_0_, -2, -1 + i_1_)
        throw RuntimeException("")
    }

    override fun method2382(i: Byte): Boolean {
        if (i >= -51) return false
        anInt8760++
        return method125((this.y shr Tooltip.anInt4459), (this.x shr Tooltip.anInt4459), this.aByte6376.toInt(), this, 120.toByte())
    }

    init {
        this.x = i
        this.anInt6382 = i_11_
        this.aByte6376 = i_14_.toByte()
        this.y = i_12_
        this.plane = i_13_.toByte()
        this.aShort8759 = i_15_.toShort()
    }

    override fun method2378(i: Int): Boolean {
        anInt8757++
        if (i != 0) method2378(-104)
        return (Class99.aBooleanArrayArray1572!![(-DisplayModeOptionState.anInt6111 + (this.x shr Tooltip.anInt4459) + NpcActorEntity.anInt10084)]!![(NpcActorEntity.anInt10084 + -GlIndexBufferArb.anInt8502 + (this.y shr Tooltip.anInt4459))])
    }

    companion object {
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
            if (VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3777 && !VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3794) {
                bool = (NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609) >= 512 || (NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609) == 0
                if (PrivilegedOperationWorker.aString3803.startsWith("win")) {
                    bool_6_ = true
                    bool_5_ = true
                } else bool_5_ = true
            }
            if (ScreenAnchorAlignment.aBoolean2881) bool = false
            if (VideoStreamDecoder.aBoolean4117) bool_5_ = false
            if (AbstractTileShape.aBoolean6558) bool_6_ = false
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
                        if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(i + -33350) == 3) {
                            val class365 = FacingDirectionNode.aRenderer6654!!.c()
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
            if (i_7_ > i_9_ && i_8_ < i_7_) return SpriteRenderable.method454(i_7_, (-116).toByte())
            if (i_9_ <= i_8_) return Class62.method600((-59).toByte(), 1, i_8_)
            return Class62.method600((-80).toByte(), 3, i_9_)
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
                IntKeyNode.aNodeDeque_6978 = NodeDeque()
            }
        }
    }
}
