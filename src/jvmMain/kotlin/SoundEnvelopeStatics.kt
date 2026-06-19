import TextureDefinitionLoaderStatics.method1177
import SpriteStoreStatics.method303
import NpcTypeStatics.method802

object SoundEnvelopeStatics {
    var anInt2732: Int = 0
            var anInt2733: Int = 0
            var anInt2736: Int = 0
            var anInt2741: Int = 0
            var anIntArray2744: IntArray? = IntArray(2)
            var anInt2746: Int = 0
            @JvmField
            var anInt2747: Int = 0
            var anInt2748: Int = 0
            fun method1538(i: Int, i_0_: Byte, class348_sub49_sub2: CipheredPacketBuffer): Boolean {
                anInt2732++
                val i_1_ = class348_sub49_sub2.readBits((-24).toByte(), 2)
                if (i_1_ == 0) {
                    if (class348_sub49_sub2.readBits((-24).toByte(), 1) != 0) method1538(i, 105.toByte(), class348_sub49_sub2)
                    val i_2_ = class348_sub49_sub2.readBits((-24).toByte(), 6)
                    val i_3_ = class348_sub49_sub2.readBits((-24).toByte(), 6)
                    val bool = (class348_sub49_sub2.readBits((-24).toByte(), 1) == 1)
                    if (bool) GlFramebufferBlitterStatics.anIntArray279!![ProjectionCameraTransformStatics.anInt5768++] = i
                    if (LoadingBarRendererStatics.aPlayerArray5058!![i] != null) throw RuntimeException("hr:lr")
                    val class359 = SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i]!!
                    val player = (Player().also { LoadingBarRendererStatics.aPlayerArray5058!![i] = it })
                    player.anInt10290 = i
                    if (CompositeNpcModelBuilderStatics.aClass348_Sub49Array2105!![i] != null) player.method2452(84.toByte(), CompositeNpcModelBuilderStatics.aClass348_Sub49Array2105!![i]!!)
                    player.method2435((-108).toByte(), (class359.anInt4423), true)
                    player.anInt10275 = class359.anInt4425
                    val i_4_ = class359.anInt4420
                    val i_5_ = i_4_ shr 28
                    val i_6_ = (0x3fcd8e and i_4_) shr 14
                    val i_7_ = 0xff and i_4_
                    val i_8_ = -ArbVertexProgramStatics.regionTileX + i_2_ + (i_6_ shl 6)
                    player.aBoolean10554 = class359.aBoolean4426
                    val i_9_ = -RegionMapDecoder.regionTileY + i_3_ + (i_7_ shl 6)
                    player.aByteArray10321!![0] = KeyboardLayoutCacheStatics.aByteArray3300!![i]
                    player.aByte6376 = i_5_.toByte()
                    player.plane = player.aByte6376
                    if (method802(i_9_, i_8_, true)) player.aByte6376++
                    player.method2449(i_9_, i_8_, 102.toByte())
                    player.aBoolean10539 = false
                    SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i] = null
                    return true
                }
                if (i_1_ == 1) {
                    val i_10_ = class348_sub49_sub2.readBits((-24).toByte(), 2)
                    val i_11_ = SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i]!!.anInt4420
                    SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i]!!.anInt4420 = (0xfffffff and i_11_) + (((i_11_ shr 28) + i_10_ and 0x3) shl 28)
                    return false
                }
                if (i_1_ == 2) {
                    val i_12_ = class348_sub49_sub2.readBits((-24).toByte(), 5)
                    val i_13_ = i_12_ shr 3
                    val i_14_ = 0x7 and i_12_
                    val i_15_ = SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i]!!.anInt4420
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
                    SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i]!!.anInt4420 = i_18_ + ((i_16_ shl 28) + (i_17_ shl 14))
                    return false
                }
                val i_19_ = class348_sub49_sub2.readBits((-24).toByte(), 18)
                val i_20_ = i_19_ shr 16
                val i_21_ = 0xff and (i_19_ shr 8)
                val i_22_ = 0xff and i_19_
                val i_23_ = SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i]!!.anInt4420
                val i_24_ = 0x3 and (i_23_ shr 28) - -i_20_
                val i_25_ = i_21_ + (i_23_ shr 14) and 0xff
                if (i_0_.toInt() != 105) anIntArray2744 = null
                val i_26_ = 0xff and i_23_ + i_22_
                SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i]!!.anInt4420 = i_26_ + (i_24_ shl 28) - -(i_25_ shl 14)
                return false
            }
    
            fun method1540(i: Int, i_31_: Int, i_32_: Int) {
                anInt2746++
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i_31_, 105.toByte(), 13)
                class348_sub42_sub15.method3246(-25490)
                class348_sub42_sub15.anInt9652 = i_32_
                if (i >= -84) anIntArray2744 = null
            }
    
            @JvmStatic
            fun method1543(i: Int) {
                anIntArray2744 = null
                if (i != -4524) anInt2747 = 24
            }
}
