import CollisionMapAccessor.method2064
import SoundBankPatchStatics.method2929
import kotlin.math.atan2
import kotlin.math.sqrt

object ContactEntryStatics {
    var anInt9594: Int = 0
            var anInt9596: Int = 0
            var anInt9598: Int = 0
            var aHashtable_9603: Hashtable?
            @JvmField
            var anInt9604: Int = 0
            var anInt9606: Int = 0
            var anIntArray9612: IntArray?
    
            @JvmStatic
            fun method3228(i: Int) {
                anIntArray9612 = null
                val i_0_ = 29 / ((31 - i) / 43)
                aHashtable_9603 = null
            }
    
            @JvmStatic
            fun method3229(i: Int): Int {
                anInt9596++
                if (SkeletalAnimFrameLoaderStatics.aFrame476 != null) return 3
                if (i >= -59) anInt9604 = 79
                if (!MinimapSquareDrawerStatics.aBoolean5219) return 1
                return 2
            }
    
            @JvmStatic
            fun method3230(`is`: IntArray?, is_1_: IntArray?, i: Int) {
                try {
                    anInt9606++
                    if (`is` == null || is_1_ == null) {
                        DisplaceTextureNodeStatics.aByteArrayArrayArray9134 = null
                        ModelLightingConfigStatics.anIntArray2552 = null
                        CompositeRgbNoiseTextureStatics.anIntArray8684 = null
                    } else {
                        CompositeRgbNoiseTextureStatics.anIntArray8684 = `is`
                        ModelLightingConfigStatics.anIntArray2552 = IntArray(`is`.size)
                        DisplaceTextureNodeStatics.aByteArrayArrayArray9134 = arrayOfNulls<Array<ByteArray?>>(`is`.size)
                        for (i_2_ in i..<CompositeRgbNoiseTextureStatics.anIntArray8684!!.size) DisplaceTextureNodeStatics.aByteArrayArrayArray9134!![i_2_] = arrayOfNulls<ByteArray>(is_1_[i_2_])
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw method2929(runtimeexception, ("db.D(" + (if (`is` != null) "{...}" else "null") + ',' + (if (is_1_ != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
    
            fun method3231(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int) {
                if (i_7_ > -123) method3229(14)
                BloomGraphicsOptionStateStatics.anInt5973 = i_5_
                MinimapFlagRenderer.anInt1797 = i_4_
                RenderableEntryStatics.anInt4336 = i_3_
                GlGroundShaderPassStatics.anInt7403 = i_6_
                anInt9598++
                ClanChatRequestSender.anInt3647 = i
                if (BloomGraphicsOptionStateStatics.anInt5973 >= 100) {
                    val i_8_ = RenderableEntryStatics.anInt4336 * 512 - -256
                    val i_9_ = ClanChatRequestSender.anInt3647 * 512 - -256
                    val i_10_ = (method2064(i_8_, CompiledScriptCacheStatics.anInt4372, 11219, i_9_) + -MinimapFlagRenderer.anInt1797)
                    val i_11_ = i_8_ - GlslMaterialPassStatics.anInt6246
                    val i_12_ = -ParticleSystemRendererStatics.anInt3855 + i_10_
                    val i_13_ = i_9_ - CompositeRgbNoiseTextureStatics.anInt8685
                    val i_14_ = sqrt((i_11_ * i_11_ + i_13_ * i_13_).toDouble()).toInt()
                    MinimapAreaMarkerNodeStatics.anInt9701 = (atan2(i_12_.toDouble(), i_14_.toDouble()) * 2607.5945876176133).toInt() and 0x3fff
                    WorldMapElementStatics.anInt4638 = (-2607.5945876176133 * atan2(i_11_.toDouble(), i_13_.toDouble())).toInt() and 0x3fff
                    if (MinimapAreaMarkerNodeStatics.anInt9701 < 1024) MinimapAreaMarkerNodeStatics.anInt9701 = 1024
                    MapTileShapeStatics.anInt4186 = 0
                    if (MinimapAreaMarkerNodeStatics.anInt9701 > 3072) MinimapAreaMarkerNodeStatics.anInt9701 = 3072
                }
                WeaveTextureNodeStatics.anInt9282 = 2
                SequencedWallEntityStatics.anInt10163 = -1
                NativeLibraryState.anInt167 = SequencedWallEntityStatics.anInt10163
            }
    
            init {
                aHashtable_9603 = Hashtable(16)
                anIntArray9612 = IntArray(8)
            }
}
