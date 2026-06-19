import ConfigFlagUtilStatics.method1913
import ConfigFlagUtilStatics.method1916
import FontStatics.method2570
import RegionTileNodeStatics.method2772
import ChatCommandProcessor.method703

object MapTileShapeStatics {
    @JvmField
            var anInt4186: Int = 0
            var anInt4189: Int = 0
            var anInt4195: Int = 0
            var anIntArray4196: IntArray? = IntArray(5)
            var aClass237_Sub1_4197: WorldMapSceneSoftware? = null
    
            fun method2661(i: Int, i_0_: Int, i_1_: Int, bool: Boolean, i_2_: Int): RegionSceneShifter {
                if (i_2_ != 2) method2661(31, -43, 32, true, -110)
                anInt4189++
                val class348_sub41 = RegionSceneShifter()
                class348_sub41.anInt7050 = i
                class348_sub41.anInt7053 = i_1_
                MinimapSpriteRendererStatics.aHashtable_4915!!.method3483(109.toByte(), i_0_.toLong(), class348_sub41)
                method2772(i, 110.toByte())
                val class46 = method2570(i_2_ + 1512932718, i_0_)
                if (class46 != null) method1916(-9343, class46)
                if (SpriteRenderableStatics.aWidgetComponent_4730 != null) {
                    ConfigFlagUtilStatics.method1916(-9343, SpriteRenderableStatics.aWidgetComponent_4730!!)
                    SpriteRenderableStatics.aWidgetComponent_4730 = null
                }
                TextureMaterialGroupStatics.method3270(120.toByte())
                if (class46 != null) method1913(!bool, i_2_ + -104, class46)
                if (!bool) method703(i)
                if (!bool && RenderNodeStatics.anInt9721 != -1) BloomGraphicsOptionStateStatics.method1775((-8).toByte(), RenderNodeStatics.anInt9721, 1)
                return class348_sub41
            }
    
            @JvmStatic
            fun method2662(i: Int) {
                aClass237_Sub1_4197 = null
                anIntArray4196 = null
                if (i != 4) method2663(91, -57, -85, 14, 6)
            }
    
            fun method2663(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
                anInt4195++
                if (ByteBufferStatics.anInt7207 == 1) {
                    var i_7_ = i_3_ / DirectionPathStatics.anInt1067
                    var i_8_ = i_4_ / DirectionPathStatics.anInt1067
                    var i_9_ = i_5_ / ByteStoreStatics.anInt4267
                    var i_10_ = i_6_ / ByteStoreStatics.anInt4267
                    if (i_7_ < ItemModelDefinitionStatics.anInt425 && i_8_ >= 0 && BackgroundWorkerThreadStatics.anInt3225 > i_9_ && i_10_ >= 0 && i == -5590) {
                        if (i_8_ >= ItemModelDefinitionStatics.anInt425) i_8_ = -1 + ItemModelDefinitionStatics.anInt425
                        if (i_9_ < 0) i_9_ = 0
                        if (i_10_ >= BackgroundWorkerThreadStatics.anInt3225) i_10_ = BackgroundWorkerThreadStatics.anInt3225 + -1
                        if (i_7_ < 0) i_7_ = 0
                        for (i_11_ in i_9_..i_10_) {
                            val i_12_ = (ModelTransformParamsStatics.method3452(i_11_ + MaterialPassStatics.anInt3682, (-15).toByte(), BackgroundWorkerThreadStatics.anInt3225) * ItemModelDefinitionStatics.anInt425)
                            var i_13_ = i_7_
                            while (i_8_ >= i_13_) {
                                val i_14_ = (i_12_ + ModelTransformParamsStatics.method3452((SceneryDetailOptionStateStatics.anInt6095 + i_13_), (-15).toByte(), ItemModelDefinitionStatics.anInt425))
                                LocalPlayerState.anIntArray1909!![i_14_] = GroundDecorSceneEntityStatics.anInt9997
                                i_13_++
                            }
                        }
                    }
                }
            }
}
