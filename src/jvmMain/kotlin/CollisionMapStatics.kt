import NpcSummaryDefinitionStatics.method1166
import TwoStateOptionStateStatics.method1842
import BoundsConstraintEntryStatics.method2057
import SoundBankPatchStatics.method2929
import LruByteCacheStatics.method589
import MapRegionLoaderStatics.method751
import kotlin.math.max
import kotlin.math.min

object CollisionMapStatics {
    var anInt4431: Int = 0
            var anInt4432: Int = 0
            var aIntRange_4433: IntRange? = IntRange(22, 0)
            var anInt4434: Int = 0
            var anInt4435: Int = 0
            var anInt4436: Int = 0
            var anInt4439: Int = 0
            var anInt4440: Int = 0
            var anInt4442: Int = 0
            var anInt4444: Int = 0
            var anInt4445: Int = 0
            var anInt4446: Int = 0
            var anInt4447: Int = 0
            var anInt4448: Int = 0
            var anInt4449: Int = 0
            var anInt4450: Int = 0
            var anInt4451: Int = 0
            var anInt4452: Int = 0
            var anInt4454: Int = 0
            var aFloat4455: Float = 0f
    
            fun method3498(i: Int, var_renderer: Renderer?, i_39_: Int, i_40_: Int, bool: Boolean, i_41_: Int) {
                var i_39_ = i_39_
                var i_41_ = i_41_
                do {
                    try {
                        anInt4442++
                        var_renderer!!.KA(i_39_, i_41_, i_40_ + i_39_, i_41_ + i)
                        var_renderer.method3675(i_40_, (-125).toByte(), i_39_, i_41_, i, -16777216)
                        if (LinkedListNodeStatics.anInt4290 >= 100) {
                            val f = (MapRegionLoaderStatics.anInt1267.toFloat() / MapRegionLoaderStatics.anInt1259.toFloat())
                            var i_42_ = i_40_
                            var i_43_ = i
                            if (!(f < 1.0f)) i_42_ = (i.toFloat() / f).toInt()
                            else i_43_ = (i_40_.toFloat() * f).toInt()
                            i_41_ += (-i_43_ + i) / 2
                            i_39_ += (i_40_ + -i_42_) / 2
                            if (TooltipComponentRendererStatics.aAbstractModelRenderer_4643 == null || i_40_ != TooltipComponentRendererStatics.aAbstractModelRenderer_4643!!.method971() || (TooltipComponentRendererStatics.aAbstractModelRenderer_4643!!.method969() != i)) {
                                method751(MapRegionLoaderStatics.anInt1266, (MapRegionLoaderStatics.anInt1267 + MapRegionLoaderStatics.anInt1263), (MapRegionLoaderStatics.anInt1266 - -MapRegionLoaderStatics.anInt1259), MapRegionLoaderStatics.anInt1263, i_39_, i_41_, i_42_ + i_39_, i_43_ + i_41_)
                                MapRegionLoaderStatics.method748(var_renderer)
                                TooltipComponentRendererStatics.aAbstractModelRenderer_4643 = var_renderer.method3683(i_39_, i_41_, i_42_, i_43_, false)
                            }
                            TooltipComponentRendererStatics.aAbstractModelRenderer_4643!!.method974(i_39_, i_41_)
                            val i_44_ = SpriteStoreStatics.anInt370 * i_42_ / MapRegionLoaderStatics.anInt1259
                            val i_45_ = i_43_ * LoadProgressCountersStatics.anInt2446 / MapRegionLoaderStatics.anInt1267
                            val i_46_ = i_39_ - -(i_42_ * LocConfigModelBuilderStatics.anInt4509 / MapRegionLoaderStatics.anInt1259)
                            if (bool != true) method3498(44, null, -27, -91, true, -26)
                            val i_47_ = (-i_45_ + i_41_ - (-i_43_ + (i_43_ * StaticNoiseTextureStatics.anInt8665 / MapRegionLoaderStatics.anInt1267)))
                            var i_48_ = -1996554240
                            if (GlRectangleTextureStatics.aSceneProjector_8638 == HardCacheEntryReferenceStatics.aSceneProjector_10434) i_48_ = -1996488705
                            var_renderer.aa(i_46_, i_47_, i_44_, i_45_, i_48_, 1)
                            var_renderer.method3628(i_46_, i_47_, i_44_, i_45_, i_48_, 0)
                            if (GlEnvMappedWaterPassStatics.anInt7379 <= 0) break
                            val i_49_: Int
                            if (ClientLoadStateMachine.anInt2173 <= 50) i_49_ = ClientLoadStateMachine.anInt2173 * 5
                            else i_49_ = -(5 * ClientLoadStateMachine.anInt2173) + 500
                            var class348_sub21 = (MapRegionLoaderStatics.aNodeDeque_1254!!.method1995(4) as CameraSplineNode?)
                            while (class348_sub21 != null) {
                                val class42 = (MapRegionLoaderStatics.aConfigDefinitionLoader_1238!!.method1225(class348_sub21.anInt6847, 71.toByte()))
                                if (method589(class42, -4)) {
                                    if (HslAdjustTextureNodeStatics.anInt9399 == (class348_sub21.anInt6847)) {
                                        val i_50_ = (i_39_ + (i_42_ * (class348_sub21.anInt6852) / MapRegionLoaderStatics.anInt1259))
                                        val i_51_ = (((MapRegionLoaderStatics.anInt1267 - (class348_sub21.anInt6851)) * i_43_ / MapRegionLoaderStatics.anInt1267) + i_41_)
                                        var_renderer.method3675(4, (-125).toByte(), i_50_ - 2, -2 + i_51_, 4, (i_49_ shl 24 or 0xffff00))
                                    } else if (SkeletalAnimFrameLoaderStatics.anInt481 != -1 && (class42!!.anInt596 == SkeletalAnimFrameLoaderStatics.anInt481)) {
                                        val i_52_ = (i_39_ - -((class348_sub21.anInt6852) * i_42_ / MapRegionLoaderStatics.anInt1259))
                                        val i_53_ = i_41_ - -(i_43_ * (MapRegionLoaderStatics.anInt1267 + -(class348_sub21.anInt6851)) / MapRegionLoaderStatics.anInt1267)
                                        var_renderer.method3675(4, (-125).toByte(), i_52_ + -2, -2 + i_53_, 4, (i_49_ shl 24 or 0xffff00))
                                    }
                                }
                                class348_sub21 = MapRegionLoaderStatics.aNodeDeque_1254!!.method1990(126.toByte()) as CameraSplineNode?
                            }
                        }
                    } catch (runtimeexception: RuntimeException) {
                        throw method2929(runtimeexception, ("fe.E(" + i + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_39_ + ',' + i_40_ + ',' + bool + ',' + i_41_ + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method3502(i: Int, i_61_: Int, i_62_: Int, i_63_: Int) {
                anInt4439++
                val string = ("tele " + i_62_ + "," + (i_63_ shr 6) + "," + (i shr 6) + "," + (0x3f and i_63_) + "," + (0x3f and i))
                if (i_61_ != 2) method3502(-25, -23, 24, 63)
                ConfigArchiveLoaderStatics.method812(string, true, false, (-79).toByte())
            }
    
            @JvmStatic
            fun method3508(i: Int) {
                aIntRange_4433 = null
                if (i != 2) aFloat4455 = 0.7198636f
            }
}
