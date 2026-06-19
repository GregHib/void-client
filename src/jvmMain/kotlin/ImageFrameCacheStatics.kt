import MapLabelMenuEntryStatics.method1041
import ModelDefinitionCacheStatics.method1600
import SceneProjectorStatics.method1635
import GlTexture1DStatics.method1974
import HardKeyedCacheEntryReferenceStatics.method3208
import FacingDirectionNodeStatics.method2774
import PlayerSequenceSelector.method729
import ArbVertexProgramStatics.method3443

object ImageFrameCacheStatics {
    var anInt4018: Int = 0
            var anInt4019: Int = 0
            var anInt4023: Int = 0
            var anInt4026: Int = 0
            var aIntRange_4027: IntRange?
            var anInt4028: Int = 0
            var anInt4030: Int = 0
            var anIntArray4031: IntArray? = null
            @JvmField
            var anInt4032: Int = -1
            var anInt4034: Int = 0
            @JvmField
            var aCacheLruCache_4036: CacheLruCache?
    
            fun method2552(bool: Boolean, i: Int, i_0_: Int, i_1_: Int): Int {
                if (i_1_ != -24667) method2554(95.toByte())
                anInt4023++
                val class348_sub13 = method1974(4.toByte(), i, bool)
                if (class348_sub13 == null) return -1
                if (i_0_ < 0 || i_0_ >= class348_sub13.anIntArray6757!!.size) return -1
                return class348_sub13.anIntArray6757!![i_0_]
            }
    
            fun method2554(i: Byte) {
                if (i.toInt() != -45) anInt4032 = 61
                anInt4030++
                if (WidgetRedrawTrackerStatics.anInt3931 == 1 || WidgetRedrawTrackerStatics.anInt3931 == 3 || (WidgetRedrawTrackerStatics.anInt3931 != WaterTextureSetStatics.anInt1447 && (WidgetRedrawTrackerStatics.anInt3931 == 0 || WaterTextureSetStatics.anInt1447 == 0))) {
                    TerrainShadowBuilderGl2Statics.anInt6930 = 0
                    ModelDefinitionLoaderStatics.anInt2057 = 0
                    NpcEntityUpdater.aHashtable_3654!!.method3481(0)
                }
                WaterTextureSetStatics.anInt1447 = WidgetRedrawTrackerStatics.anInt3931
            }
    
            @JvmStatic
            fun method2555(i: Byte) {
                if (i.toInt() != 28) method2554(21.toByte())
                anIntArray4031 = null
                aIntRange_4027 = null
                aCacheLruCache_4036 = null
            }
    
            fun method2556(bool: Boolean, i: Int, class318_sub1_sub3_sub3: ProjectedGroundDecor) {
                anInt4028++
                var i_3_ = -1
                var i_4_ = 0
                if (GlGroundShaderPassStatics.anInt7396 < class318_sub1_sub3_sub3.anInt10239) DetailLevelOptionStateStatics.method1834(class318_sub1_sub3_sub3, (-16).toByte())
                else if (GlGroundShaderPassStatics.anInt7396 <= (class318_sub1_sub3_sub3.anInt10300)) method1041(-1, class318_sub1_sub3_sub3)
                else {
                    method1600(false, 0, class318_sub1_sub3_sub3)
                    i_3_ = SceneObjectAnimatorStatics.anInt3062
                    i_4_ = ScrollingWidgetComponentNodeStatics.anInt8387
                }
                if (bool != false) aIntRange_4027 = null
                if ((class318_sub1_sub3_sub3.x < 512) || class318_sub1_sub3_sub3.y < 512 || (-512 + GlCubemapLightPassStatics.anInt7319 * 512 <= class318_sub1_sub3_sub3.x) || (-512 + RangeThresholdTextureNodeStatics.anInt9109 * 512 <= class318_sub1_sub3_sub3.y)) {
                    class318_sub1_sub3_sub3.anInt10291 = -1
                    class318_sub1_sub3_sub3.anInt10300 = 0
                    i_4_ = 0
                    i_3_ = -1
                    class318_sub1_sub3_sub3.anIntArray10236 = null
                    class318_sub1_sub3_sub3.anInt10269 = -1
                    class318_sub1_sub3_sub3.anInt10286 = -1
                    class318_sub1_sub3_sub3.anInt10239 = 0
                    class318_sub1_sub3_sub3.x = (512 * (class318_sub1_sub3_sub3.anIntArray10320!![0]) + 256 * class318_sub1_sub3_sub3.method2436(120.toByte()))
                    class318_sub1_sub3_sub3.y = (512 * (class318_sub1_sub3_sub3.anIntArray10317!![0]) + class318_sub1_sub3_sub3.method2436(88.toByte()) * 256)
                    class318_sub1_sub3_sub3.method2427(70)
                }
                if ((LocalPlayerState.aPlayer_1907 == class318_sub1_sub3_sub3) && (class318_sub1_sub3_sub3.x < 6144 || class318_sub1_sub3_sub3.y < 6144 || (class318_sub1_sub3_sub3.x >= 512 * (GlCubemapLightPassStatics.anInt7319 + -12)) || (512 * (RangeThresholdTextureNodeStatics.anInt9109 - 12) <= class318_sub1_sub3_sub3.y))) {
                    class318_sub1_sub3_sub3.anInt10291 = -1
                    i_3_ = -1
                    class318_sub1_sub3_sub3.anInt10300 = 0
                    class318_sub1_sub3_sub3.anInt10269 = -1
                    class318_sub1_sub3_sub3.anInt10239 = 0
                    i_4_ = 0
                    class318_sub1_sub3_sub3.anIntArray10236 = null
                    class318_sub1_sub3_sub3.anInt10286 = -1
                    class318_sub1_sub3_sub3.x = (512 * (class318_sub1_sub3_sub3.anIntArray10320!![0]) + 256 * class318_sub1_sub3_sub3.method2436(115.toByte()))
                    class318_sub1_sub3_sub3.y = (512 * (class318_sub1_sub3_sub3.anIntArray10317!![0]) + 256 * class318_sub1_sub3_sub3.method2436(115.toByte()))
                    class318_sub1_sub3_sub3.method2427(54)
                }
                val i_5_ = method2774(108.toByte(), class318_sub1_sub3_sub3)
                method3443(true, class318_sub1_sub3_sub3)
                method729(i_3_, i_5_, 67.toByte(), class318_sub1_sub3_sub3, i_4_)
                method3208(class318_sub1_sub3_sub3, i_3_, -98)
                method1635(-69, class318_sub1_sub3_sub3)
            }
    
            init {
                aIntRange_4027 = IntRange(90, 10)
                aCacheLruCache_4036 = CacheLruCache(128)
            }
}
