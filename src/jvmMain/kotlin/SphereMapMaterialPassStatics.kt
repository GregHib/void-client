import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glRotatef
import jaggl.OpenGLStatics.glTexGeni
import kotlin.math.pow
import kotlin.math.sqrt

object SphereMapMaterialPassStatics {
    @JvmField
            var anInt6306: Int = 0
            @JvmField
            var anInt6307: Int = 0
            @JvmField
            var anInt6309: Int = 0
            @JvmField
            var anInt6311: Int = 0
            @JvmField
            var anInt6312: Int = 0
            @JvmField
            var anInt6313: Int = 0
            @JvmField
            var anInt6314: Int = 0
            @JvmField
            var anInt6315: Int = 0
            @JvmField
            var anInt6318: Int = 0
            @JvmField
            var anInt6319: Int = 0
    
            @JvmStatic
            fun method2174(i: Byte, i_0_: Int, i_1_: Int): Boolean {
                anInt6313++
                val i_2_ = 52 % ((i - 68) / 41)
                return false
            }
    
            @JvmStatic
            fun method2175(i: Int, i_3_: Byte, i_4_: Int): Int {
                anInt6319++
                if (i_3_ >= -14) return 64
                if (i_4_ == 1 || i_4_ == 3) return TextureTileRendererStatics.anIntArray6830!![i and 0x3]
                return MapSceneCacheStatics.anIntArray1450!![0x3 and i]
            }
    
            @JvmStatic
            fun method2177(i: Int, i_22_: Int, class348_sub49_sub2: CipheredPacketBuffer) {
                anInt6311++
                val bool = (class348_sub49_sub2.readBits((-24).toByte(), i) == 1)
                if (bool) GlFramebufferBlitterStatics.anIntArray279!![ProjectionCameraTransformStatics.anInt5768++] = i_22_
                val i_23_ = class348_sub49_sub2.readBits((-24).toByte(), 2)
                val player = LoadingBarRendererStatics.aPlayerArray5058!![i_22_]!!
                if (i_23_ == 0) {
                    if (bool) player.aBoolean10539 = false
                    else {
                        if (CharCodeMapStatics.anInt9591 == i_22_) throw RuntimeException("s:lr")
                        val textureAtlasState = (TextureAtlasState().also { SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i_22_] = it })
                        textureAtlasState.anInt4420 = ((RegionMapDecoder.regionTileY - -(player.anIntArray10317!![0]) shr 6) + ((player.anIntArray10320!![0] + ArbVertexProgramStatics.regionTileX) shr 6 shl 14) + ((player.plane).toInt() shl 28))
                        if (player.anInt10524 != -1) textureAtlasState.anInt4423 = player.anInt10524
                        else textureAtlasState.anInt4423 = player.aCompassSmoother_10217.method2019((-91).toByte())
                        textureAtlasState.aBoolean4426 = player.aBoolean10554
                        textureAtlasState.anInt4425 = (player.anInt10275)
                        if (player.anInt10553 > 0) LocalizedTextTripleStatics.method2221(player, -28482)
                        LoadingBarRendererStatics.aPlayerArray5058!![i_22_] = null
                        if (class348_sub49_sub2.readBits((-24).toByte(), 1) != 0) SoundEnvelopeStatics.method1538(i_22_, 105.toByte(), class348_sub49_sub2)
                    }
                } else if (i_23_ == 1) {
                    val i_24_ = class348_sub49_sub2.readBits((-24).toByte(), 3)
                    var i_25_ = (player.anIntArray10320!![0])
                    var i_26_ = (player.anIntArray10317!![0])
                    if (i_24_ == 0) {
                        i_26_--
                        i_25_--
                    } else if (i_24_ != 1) {
                        if (i_24_ == 2) {
                            i_25_++
                            i_26_--
                        } else if (i_24_ == 3) i_25_--
                        else if (i_24_ != 4) {
                            if (i_24_ == 5) {
                                i_26_++
                                i_25_--
                            } else if (i_24_ != 6) {
                                if (i_24_ == 7) {
                                    i_26_++
                                    i_25_++
                                }
                            } else i_26_++
                        } else i_25_++
                    } else i_26_--
                    if (bool) {
                        player.anInt10531 = i_26_
                        player.aBoolean10539 = true
                        player.anInt10549 = i_25_
                    } else player.method2455(i_26_, -26443, (KeyboardLayoutCacheStatics.aByteArray3300!![i_22_]), i_25_)
                } else if (i_23_ == 2) {
                    val i_27_ = class348_sub49_sub2.readBits((-24).toByte(), 4)
                    var i_28_ = (player.anIntArray10320!![0])
                    var i_29_ = (player.anIntArray10317!![0])
                    if (i_27_ == 0) {
                        i_28_ -= 2
                        i_29_ -= 2
                    } else if (i_27_ == 1) {
                        i_29_ -= 2
                        i_28_--
                    } else if (i_27_ != 2) {
                        if (i_27_ == 3) {
                            i_29_ -= 2
                            i_28_++
                        } else if (i_27_ == 4) {
                            i_28_ += 2
                            i_29_ -= 2
                        } else if (i_27_ == 5) {
                            i_28_ -= 2
                            i_29_--
                        } else if (i_27_ == 6) {
                            i_29_--
                            i_28_ += 2
                        } else if (i_27_ == 7) i_28_ -= 2
                        else if (i_27_ == 8) i_28_ += 2
                        else if (i_27_ == 9) {
                            i_29_++
                            i_28_ -= 2
                        } else if (i_27_ == 10) {
                            i_29_++
                            i_28_ += 2
                        } else if (i_27_ == 11) {
                            i_29_ += 2
                            i_28_ -= 2
                        } else if (i_27_ == 12) {
                            i_29_ += 2
                            i_28_--
                        } else if (i_27_ != 13) {
                            if (i_27_ == 14) {
                                i_29_ += 2
                                i_28_++
                            } else if (i_27_ == 15) {
                                i_28_ += 2
                                i_29_ += 2
                            }
                        } else i_29_ += 2
                    } else i_29_ -= 2
                    if (bool) {
                        player.aBoolean10539 = true
                        player.anInt10549 = i_28_
                        player.anInt10531 = i_29_
                    } else player.method2455(i_29_, -26443, (KeyboardLayoutCacheStatics.aByteArray3300!![i_22_]), i_28_)
                } else {
                    val i_30_ = class348_sub49_sub2.readBits((-24).toByte(), 1)
                    if (i_30_ == 0) {
                        val i_31_ = class348_sub49_sub2.readBits((-24).toByte(), 12)
                        val i_32_ = i_31_ shr 10
                        var i_33_ = 0x1f and (i_31_ shr 5)
                        if (i_33_ > 15) i_33_ -= 32
                        var i_34_ = 0x1f and i_31_
                        if (i_34_ > 15) i_34_ -= 32
                        val i_35_ = i_33_ + (player.anIntArray10320!![0])
                        val i_36_ = i_34_ + (player.anIntArray10317!![0])
                        if (bool) {
                            player.anInt10531 = i_36_
                            player.anInt10549 = i_35_
                            player.aBoolean10539 = true
                        } else player.method2455(i_36_, -26443, (KeyboardLayoutCacheStatics.aByteArray3300!![i_22_]), i_35_)
                        player.aByte6376 = (0x3 and (player.plane) + i_32_).toByte()
                        player.plane = player.aByte6376
                        if (NpcTypeStatics.method802(i_36_, i_35_, true)) player.aByte6376++
                        if (CharCodeMapStatics.anInt9591 == i_22_) {
                            if ((player.plane).toInt() != CompiledScriptCacheStatics.anInt4372) PcmStreamBufferStatics.aBoolean8870 = true
                            CompiledScriptCacheStatics.anInt4372 = (player.plane).toInt()
                        }
                    } else {
                        val i_37_ = class348_sub49_sub2.readBits((-24).toByte(), 30)
                        val i_38_ = i_37_ shr 28
                        val i_39_ = 0x3fff and (i_37_ shr 14)
                        val i_40_ = 0x3fff and i_37_
                        val i_41_ = ((i_39_ + ((player.anIntArray10320!![0]) + ArbVertexProgramStatics.regionTileX) and 0x3fff) - ArbVertexProgramStatics.regionTileX)
                        val i_42_ = (-RegionMapDecoder.regionTileY + (0x3fff and (i_40_ + RegionMapDecoder.regionTileY + (player.anIntArray10317!![0]))))
                        if (bool) {
                            player.aBoolean10539 = true
                            player.anInt10531 = i_42_
                            player.anInt10549 = i_41_
                        } else player.method2455(i_42_, -26443, (KeyboardLayoutCacheStatics.aByteArray3300!![i_22_]), i_41_)
                        player.aByte6376 = ((player.plane) + i_38_ and 0x3).toByte()
                        player.plane = player.aByte6376
                        if (NpcTypeStatics.method802(i_42_, i_41_, true)) player.aByte6376++
                        if (CharCodeMapStatics.anInt9591 == i_22_) CompiledScriptCacheStatics.anInt4372 = (player.plane).toInt()
                    }
                }
            }
}
