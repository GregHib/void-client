import SphereMapMaterialPass.Companion.method2177
import GroundDecorEntity.Companion.method2413
import NpcType.Companion.method802

/* Class348_Sub40_Sub18 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ConstantColourTextureNode private constructor(i: Int) : AbstractProceduralTextureNode(0, false) {
    private var anInt9244 = 0
    private var anInt9250 = 0
    private var anInt9252 = 0

    init {
        method3095(-104, i)
    }

    override fun method3047(i: Int, i_14_: Int): Array<IntArray?>? {
        anInt9246++
        val `is` = this.aImageFrameCache_7033!!.method2557(i_14_ xor 0x5d41e2b0, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_15_ = `is`[0]!!
            val is_16_ = `is`[1]!!
            val is_17_ = `is`[2]!!
            for (i_18_ in 0..<PerlinNoiseTextureNode.Companion.anInt9139) {
                is_15_[i_18_] = anInt9244
                is_16_[i_18_] = anInt9252
                is_17_[i_18_] = anInt9250
            }
        }
        if (i_14_ != -1564599039) method3095(102, 6)
        return `is`
    }

    private fun method3095(i: Int, i_19_: Int) {
        anInt9244 = 0xff0 and (i_19_ shr 12)
        anInt9252 = i_19_ shr 4 and 0xff0
        anInt9248++
        anInt9250 = (i_19_ and 0xff) shl 4
        if (i >= -54) anInt9250 = -42
    }

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_20_: Int) {
        val i_21_ = i
        if (i_21_ == 0) method3095(-124, class348_sub49.readMedium(-1))
        anInt9251++
        if (i_20_ != 31015) anInt9250 = 105
    }

    constructor() : this(0)

    companion object {

        var aMapElementDefinitionCache_9245: MapElementDefinitionCache? = null

        var anInt9246: Int = 0

        var anInt9247: Int = 0

        var anInt9248: Int = 0

        var anIntArray9249: IntArray? = intArrayOf(2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0)

        var anInt9251: Int = 0

        var anInt2732: Int = 0
        fun method1538(i: Int, i_0_: Byte, class348_sub49_sub2: CipheredPacketBuffer): Boolean {
            anInt2732++
            val i_1_ = class348_sub49_sub2.readBits((-24).toByte(), 2)
            if (i_1_ == 0) {
                if (class348_sub49_sub2.readBits((-24).toByte(), 1) != 0) method1538(i, 105.toByte(), class348_sub49_sub2)
                val i_2_ = class348_sub49_sub2.readBits((-24).toByte(), 6)
                val i_3_ = class348_sub49_sub2.readBits((-24).toByte(), 6)
                val bool = (class348_sub49_sub2.readBits((-24).toByte(), 1) == 1)
                if (bool) GlFramebufferBlitter.anIntArray279!![ProjectionCameraTransform.anInt5768++] = i
                if (LoadingBarRenderer.aPlayerArray5058!![i] != null) throw RuntimeException("hr:lr")
                val class359 = SoundBankPatch.aTextureAtlasStateArray6802s!![i]!!
                val player = (Player().also { LoadingBarRenderer.aPlayerArray5058!![i] = it })
                player.anInt10290 = i
                if (CompositeNpcModelBuilder.aClass348_Sub49Array2105!![i] != null) player.method2452(84.toByte(), CompositeNpcModelBuilder.aClass348_Sub49Array2105!![i]!!)
                player.method2435((-108).toByte(), (class359.anInt4423), true)
                player.anInt10275 = class359.anInt4425
                val i_4_ = class359.anInt4420
                val i_5_ = i_4_ shr 28
                val i_6_ = (0x3fcd8e and i_4_) shr 14
                val i_7_ = 0xff and i_4_
                val i_8_ = -ArbVertexProgram.regionTileX + i_2_ + (i_6_ shl 6)
                player.aBoolean10554 = class359.aBoolean4426
                val i_9_ = -RegionMapDecoder.regionTileY + i_3_ + (i_7_ shl 6)
                player.aByteArray10321!![0] = KeyboardLayoutCache.aByteArray3300!![i]
                player.aByte6376 = i_5_.toByte()
                player.plane = player.aByte6376
                if (method802(i_9_, i_8_, true)) player.aByte6376++
                player.method2449(i_9_, i_8_, 102.toByte())
                player.aBoolean10539 = false
                SoundBankPatch.aTextureAtlasStateArray6802s!![i] = null
                return true
            }
            if (i_1_ == 1) {
                val i_10_ = class348_sub49_sub2.readBits((-24).toByte(), 2)
                val i_11_ = SoundBankPatch.aTextureAtlasStateArray6802s!![i]!!.anInt4420
                SoundBankPatch.aTextureAtlasStateArray6802s!![i]!!.anInt4420 = (0xfffffff and i_11_) + (((i_11_ shr 28) + i_10_ and 0x3) shl 28)
                return false
            }
            if (i_1_ == 2) {
                val i_12_ = class348_sub49_sub2.readBits((-24).toByte(), 5)
                val i_13_ = i_12_ shr 3
                val i_14_ = 0x7 and i_12_
                val i_15_ = SoundBankPatch.aTextureAtlasStateArray6802s!![i]!!.anInt4420
                val i_16_ = 0x3 and i_13_ + (i_15_ shr 28)
                var i_17_ = (i_15_ and 0x3fd366) shr 14
                var i_18_ = 0xff and i_15_
                if (i_14_ == 0) {
                    i_17_--
                    i_18_--
                }
                if (i_14_ == 1) i_18_--
                if (i_14_ == 2) {
                    i_18_--
                    i_17_++
                }
                if (i_14_ == 3) i_17_--
                if (i_14_ == 4) i_17_++
                if (i_14_ == 5) {
                    i_17_--
                    i_18_++
                }
                if (i_14_ == 6) i_18_++
                if (i_14_ == 7) {
                    i_17_++
                    i_18_++
                }
                SoundBankPatch.aTextureAtlasStateArray6802s!![i]!!.anInt4420 = i_18_ + ((i_16_ shl 28) + (i_17_ shl 14))
                return false
            }
            val i_19_ = class348_sub49_sub2.readBits((-24).toByte(), 18)
            val i_20_ = i_19_ shr 16
            val i_21_ = 0xff and (i_19_ shr 8)
            val i_22_ = 0xff and i_19_
            val i_23_ = SoundBankPatch.aTextureAtlasStateArray6802s!![i]!!.anInt4420
            val i_24_ = 0x3 and (i_23_ shr 28) - -i_20_
            val i_25_ = i_21_ + (i_23_ shr 14) and 0xff
            val i_26_ = 0xff and i_23_ + i_22_
            SoundBankPatch.aTextureAtlasStateArray6802s!![i]!!.anInt4420 = i_26_ + (i_24_ shl 28) - -(i_25_ shl 14)
            return false
        }

        fun method3094(i: Int, class348_sub49_sub2: CipheredPacketBuffer) {
            anInt9247++
            var i_0_ = 0
            class348_sub49_sub2.startBitAccess(-87)
            for (i_1_ in 0..<ShaderState.anInt6513) {
                val i_2_ = ScrollTexMaterialPass.anIntArray6290!![i_1_]
                if ((0x1 and AbstractBloomEffect.aByteArray6624!![i_2_].toInt()) == 0) {
                    if (i_0_ > 0) {
                        AbstractBloomEffect.aByteArray6624!![i_2_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_2_]).toInt(), 2).toByte()
                        i_0_--
                    } else {
                        val i_3_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                        if (i_3_ == 0) {
                            i_0_ = method2413(1, class348_sub49_sub2)
                            AbstractBloomEffect.aByteArray6624!![i_2_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_2_]).toInt(), 2).toByte()
                        } else {
                            method2177(1, i_2_, class348_sub49_sub2)
                        }
                    }
                }
            }
            class348_sub49_sub2.stopBitAccess(false)
            if (i_0_ != 0) throw RuntimeException("nsn0")
            class348_sub49_sub2.startBitAccess(-65)
            for (i_4_ in 0..<ShaderState.anInt6513) {
                val i_5_ = ScrollTexMaterialPass.anIntArray6290!![i_4_]
                if ((0x1 and AbstractBloomEffect.aByteArray6624!![i_5_].toInt()) != 0) {
                    if (i_0_ > 0) {
                        AbstractBloomEffect.aByteArray6624!![i_5_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_5_]).toInt(), 2).toByte()
                        i_0_--
                    } else {
                        val i_6_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                        if (i_6_ == 0) {
                            i_0_ = method2413(1, class348_sub49_sub2)
                            AbstractBloomEffect.aByteArray6624!![i_5_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_5_]).toInt(), 2).toByte()
                        } else method2177(i xor 0x53e4.inv(), i_5_, class348_sub49_sub2)
                    }
                }
            }
            class348_sub49_sub2.stopBitAccess(false)
            if (i_0_ != 0) throw RuntimeException("nsn1")
            class348_sub49_sub2.startBitAccess(i xor 0x5398.inv())
            var i_7_ = 0
            while ((i_7_ < ShortMatrixNodeStatics.anInt9513)) {
                val i_8_ = GlArrayBufferObject.anIntArray4709!![i_7_]
                if ((0x1 and AbstractBloomEffect.aByteArray6624!![i_8_].toInt()) != 0) {
                    if (i_0_ > 0) {
                        AbstractBloomEffect.aByteArray6624!![i_8_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_8_]).toInt(), 2).toByte()
                        i_0_--
                    } else {
                        val i_9_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                        if (i_9_ == 0) {
                            i_0_ = method2413(i + 21479, class348_sub49_sub2)
                            AbstractBloomEffect.aByteArray6624!![i_8_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_8_]).toInt(), 2).toByte()
                        } else if (ConstantColourTextureNode.method1538(i_8_, 105.toByte(), class348_sub49_sub2)) AbstractBloomEffect.aByteArray6624!![i_8_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_8_]).toInt(), 2).toByte()
                    }
                }
                i_7_++
            }
            class348_sub49_sub2.stopBitAccess(false)
            if (i == -21478) {
                if (i_0_ != 0) throw RuntimeException("nsn2")
                class348_sub49_sub2.startBitAccess(36)
                var i_10_ = 0
                while ((ShortMatrixNodeStatics.anInt9513 > i_10_)) {
                    val i_11_ = GlArrayBufferObject.anIntArray4709!![i_10_]
                    if ((AbstractBloomEffect.aByteArray6624!![i_11_].toInt() and 0x1) == 0) {
                        if (i_0_ > 0) {
                            AbstractBloomEffect.aByteArray6624!![i_11_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_11_]).toInt(), 2).toByte()
                            i_0_--
                        } else {
                            val i_12_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                            if (i_12_ == 0) {
                                i_0_ = method2413(1, class348_sub49_sub2)
                                AbstractBloomEffect.aByteArray6624!![i_11_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_11_]).toInt(), 2).toByte()
                            } else if (ConstantColourTextureNode.method1538(i_11_, 105.toByte(), class348_sub49_sub2)) AbstractBloomEffect.aByteArray6624!![i_11_] = WhirlpoolHash.method2057((AbstractBloomEffect.aByteArray6624!![i_11_]).toInt(), 2).toByte()
                        }
                    }
                    i_10_++
                }
                class348_sub49_sub2.stopBitAccess(false)
                if (i_0_ != 0) throw RuntimeException("nsn3")
                ShaderState.anInt6513 = 0
                ShortMatrixNodeStatics.anInt9513 = 0
                for (i_13_ in 1..2047) {
                    AbstractBloomEffect.aByteArray6624!![i_13_] = (AbstractBloomEffect.aByteArray6624!![i_13_].toInt() shr 1).toByte()
                    val player = LoadingBarRenderer.aPlayerArray5058!![i_13_]
                    if (player == null) GlArrayBufferObject.anIntArray4709!![ShortMatrixNodeStatics.anInt9513++] = i_13_
                    else ScrollTexMaterialPass.anIntArray6290!![ShaderState.anInt6513++] = i_13_
                }
            }
        }

        @JvmStatic
        fun method3096(i: Int) {
            anIntArray9249 = null
            aMapElementDefinitionCache_9245 = null
            if (i != 32462) aMapElementDefinitionCache_9245 = null
        }
    }
}
