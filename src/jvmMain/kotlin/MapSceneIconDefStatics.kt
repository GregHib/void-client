import DirectionPathStatics.method536
import CompositeRgbNoiseTextureStatics.method574
import NpcTypeStatics.method802

object MapSceneIconDefStatics {
    var anInt2849: Int = 0
            var anInt2850: Int = 0
            var anInt2852: Int = 0
            var anInt2855: Int = 0
            var anInt2857: Int = 0
            var anInt2858: Int = 0
            @JvmField
            var aNodeDeque_2859: NodeDeque? = NodeDeque()
            var aIntRange_2860: IntRange?
            @JvmField
            var anInt2861: Int = 1401
    
            fun method1591(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int) {
                anInt2855++
                if (i >= 1 && i_5_ >= 1 && -2 + GlCubemapLightPassStatics.anInt7319 >= i && i_5_ <= -2 + RangeThresholdTextureNodeStatics.anInt9109) {
                    var i_8_ = i_7_
                    if (i_8_ < 3 && method802(i_5_, i, true)) i_8_++
                    if ((IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 0 && !method536(i_5_, false, i, ParticleSystemStateStatics.anInt2204, i_8_)) || HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029 == null) return
                    MapTileShapeStatics.aClass237_Sub1_4197!!.method1694((TimedRecordAccessorStatics.aCollisionMapArray7108s!![i_7_]), i_1_, i_7_, FacingDirectionNodeStatics.aRenderer6654, i, i_5_, 106.toByte())
                    if (i_3_ >= 0) {
                        val i_9_ = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1737(-32350)
                        IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub4_7220), 1)
                        MapTileShapeStatics.aClass237_Sub1_4197!!.method1689(i, i_7_, i_3_, FacingDirectionNodeStatics.aRenderer6654, i_8_, 50, i_4_, i_5_, i_2_, i_6_, (TimedRecordAccessorStatics.aCollisionMapArray7108s!![i_7_]))
                        IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub4_7220), i_9_)
                    }
                }
                if (i_0_ < 12) aNodeDeque_2859 = null
            }
    
            fun method1592(i: Byte, i_10_: Int, i_11_: Int, i_12_: Int, player: Player) {
                anInt2849++
                val i_13_ = (player.anIntArray10320!![0])
                val i_14_ = (player.anIntArray10317!![0])
                if (i_13_ >= 0 && GlCubemapLightPassStatics.anInt7319 > i_13_ && i_14_ >= 0 && i_14_ < RangeThresholdTextureNodeStatics.anInt9109 && (i_12_ >= 0 && i_12_ < GlCubemapLightPassStatics.anInt7319 && i_10_ >= 0 && RangeThresholdTextureNodeStatics.anInt9109 > i_10_)) {
                    val i_15_ = (method574(i_12_, player.method2436(62.toByte()), 0, RadialGradientMaskEffectStatics.anIntArray9185, true, 120.toByte(), -4, i_13_, i_14_, InterfaceComponentGroupStatics.anIntArray9626, i_10_, (TimedRecordAccessorStatics.aCollisionMapArray7108s!![(player.plane).toInt()]), 0, 0, 0))
                    if (i_15_ >= 1) {
                        if (i_11_ != 4) aNodeDeque_2859 = null
                        if (i_15_ <= 3) {
                            for (i_16_ in 0..<-1 + i_15_) player.method2451(i, InterfaceComponentGroupStatics.anIntArray9626!![i_16_], i_11_ + -29038, RadialGradientMaskEffectStatics.anIntArray9185!![i_16_])
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method1594(i: Int) {
                aNodeDeque_2859 = null
                if (i != -1966608624) aNodeDeque_2859 = null
                aIntRange_2860 = null
            }
    
            init {
                aIntRange_2860 = IntRange(106, 8)
            }
}
