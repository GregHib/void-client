import jaggl.OpenGLStatics.glTexImage2Dub
import java.util.*
import kotlin.math.min

object PerlinTextureProviderStatics {
    @JvmField
            var anInt5805: Int = 0
            @JvmField
            var anInt5806: Int = 0
            @JvmField
            var anInt5807: Int = 0
            @JvmField
            var aTileRenderState_5808: TileRenderState? = TileRenderState()
            @JvmField
            var anInt5809: Int = 0
            @JvmField
            var anInt5810: Int = 0
            @JvmField
            var anInt5811: Int = 0
            @JvmField
            var anInt5812: Int = 100
            @JvmField
            var aCollisionMapRegion_5813: CollisionMapRegion? = null
            @JvmField
            var anInt5814: Int = 0
    
            @JvmStatic
            fun method1399(i: Int, c: Char): Int {
                anInt5805++
                if (i != 7) method1400(-22)
                if (c.code >= 0 && BrightnessOptionStateStatics.anIntArray5902!!.size > c.code) return BrightnessOptionStateStatics.anIntArray5902!![c.code]
                return -1
            }
    
            @JvmStatic
            fun method1400(i: Int) {
                aTileRenderState_5808 = null
                aCollisionMapRegion_5813 = null
            }
    
            @JvmStatic
            fun method1401(var_ha_Sub2: OpenGlRenderer, i: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int): GlTexture2DRegion {
                anInt5809++
                if (i_37_ != 34037) aTileRenderState_5808 = null
                if (var_ha_Sub2.aBoolean7793 || AsyncTaskHandleStatics.method1436(-20, i_38_) && AsyncTaskHandleStatics.method1436(-119, i_40_)) return GlTexture2DRegion(var_ha_Sub2, 3553, i, i_39_, i_38_, i_40_, true)
                if (!var_ha_Sub2.aBoolean7837) return GlTexture2DRegion(var_ha_Sub2, i, i_39_, i_38_, i_40_, CacheArchiveIndexLoaderStatics.method340(i_38_, 108.toByte()), CacheArchiveIndexLoaderStatics.method340(i_40_, 108.toByte()), true)
                return GlTexture2DRegion(var_ha_Sub2, 34037, i, i_39_, i_38_, i_40_, true)
            }
    
            @JvmStatic
            fun method1402(i: Int) {
                if (i == 1) {
                    SceneObjectEntityStatics.aLruByteCache_8732!!.method590(0)
                    anInt5811++
                }
            }
    
            @JvmStatic
            fun method1403(i: Int, i_45_: Int, `is`: ByteArray, bool: Boolean, i_46_: Int, i_47_: Int, i_48_: Int) {
                var i = i
                var i_45_ = i_45_
                anInt5806++
                require(!(i_45_ > 0 && !AsyncTaskHandleStatics.method1436(69, i_45_))) { "" }
                require(!(i > 0 && !AsyncTaskHandleStatics.method1436(100, i))) { "" }
                val i_49_ = ParticleDefLoaderStatics.method1382(i_46_, -6409)
                var i_50_ = 0
                var i_51_ = min(i_45_, i)
                if (bool != false) anInt5807 = -127
                var i_52_ = i_45_ shr 1
                var i_53_ = i shr 1
                var is_54_ = `is`
                var is_55_ = ByteArray(i_52_ * (i_53_ * i_49_))
                while (true) {
                    glTexImage2Dub(i_47_, i_50_, i_48_, i_45_, i, 0, i_46_, 5121, is_54_, 0)
                    if (i_51_ <= 1) break
                    val i_56_ = i_45_ * i_49_
                    val is_57_ = is_55_
                    var i_58_ = 0
                    while (i_49_ > i_58_) {
                        var i_59_ = i_58_
                        var i_60_ = i_58_
                        var i_61_ = i_56_ + i_60_
                        for (i_62_ in 0..<i_53_) {
                            for (i_63_ in 0..<i_52_) {
                                var i_64_ = is_54_[i_60_].toInt()
                                i_60_ += i_49_
                                i_64_ += is_54_[i_60_].toInt()
                                i_64_ += is_54_[i_61_].toInt()
                                i_60_ += i_49_
                                i_61_ += i_49_
                                i_64_ += is_54_[i_61_].toInt()
                                is_55_[i_59_] = (i_64_ shr 2).toByte()
                                i_61_ += i_49_
                                i_59_ += i_49_
                            }
                            i_61_ += i_56_
                            i_60_ += i_56_
                        }
                        i_58_++
                    }
                    is_55_ = is_54_
                    is_54_ = is_57_
                    i = i_53_
                    i_45_ = i_52_
                    i_53_ = i_53_ shr 1
                    i_50_++
                    i_51_ = i_51_ shr 1
                    i_52_ = i_52_ shr 1
                }
            }
}
