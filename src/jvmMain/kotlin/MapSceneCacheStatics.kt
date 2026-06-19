object MapSceneCacheStatics {
    var anIntArray1450: IntArray? = intArrayOf(1, 2, 4, 8)
            @JvmField
            var anInt1451: Int = 0
            @JvmField
            var anInt1452: Int = 0
            @JvmField
            var anInt1453: Int = 0
            @JvmField
            var anInt1454: Int = 0
            @JvmField
            var anInt1455: Int = 0
            @JvmField
            var anInt1456: Int = 0
            @JvmField
            var anInt1457: Int = 0
            @JvmField
            var anInt1458: Int = 0
            @JvmField
            var anInt1459: Int = 0
            @JvmStatic
            fun method817(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): ProjectedGroundDecor? {
                anInt1456++
                val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i_1_]!![i_0_]!![i_2_]
                if (class357 == null) return null
                if (i != 252) return null
                var class318_sub1_sub3_sub3: ProjectedGroundDecor? = null
                var i_3_ = -1
                var class148 = class357.aWidgetNodeLink_4396
                while (class148 != null) {
                    val class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040
                    if (class318_sub1_sub3 is ProjectedGroundDecor) {
                        val class318_sub1_sub3_sub3_4_ = class318_sub1_sub3
                        val i_5_ = 252 + (-1 + class318_sub1_sub3_sub3_4_.method2436(88.toByte())) * 256
                        val i_6_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.x) shr 9)
                        val i_7_ = (-i_5_ + (class318_sub1_sub3_sub3_4_.y) shr 9)
                        val i_8_ = i_5_ + (class318_sub1_sub3_sub3_4_.x) shr 9
                        val i_9_ = ((class318_sub1_sub3_sub3_4_.y + i_5_) shr 9)
                        if (i_0_ >= i_6_ && i_7_ <= i_2_ && i_0_ <= i_8_ && i_2_ <= i_9_) {
                            val i_10_ = (1 + i_9_ - i_2_) * (-i_0_ + (1 + i_8_))
                            if (i_3_ < i_10_) {
                                i_3_ = i_10_
                                class318_sub1_sub3_sub3 = class318_sub1_sub3_sub3_4_
                            }
                        }
                    }
                    class148 = class148.aWidgetNodeLink_2038
                }
                return class318_sub1_sub3_sub3
            }
    
            fun method818(i: Int, i_11_: Int, i_12_: Int): Int {
                var i = i
                var i_12_ = i_12_
                anInt1451++
                var i_13_ = i_11_
                while (i > 0) {
                    i_13_ = i_12_ and 0x1 or (i_13_ shl 1)
                    i--
                    i_12_ = i_12_ ushr 1
                }
                return i_13_
            }
    
            @JvmStatic
            fun method821(i: Int) {
                SoundCacheState.aLruByteCache_4139!!.method590(0)
                val i_16_ = -67 / ((i - 39) / 33)
                anInt1459++
            }
    
            fun method824(i: Int) {
                DelegatingRenderCanvasStatics.anInt67 = i
                for (i_22_ in 0..<SpotAnimEntityStatics.anInt6451) {
                    for (i_23_ in 0..<RegionSceneShifterStatics.anInt7054) {
                        if (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_22_]!![i_23_] == null) HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_22_]!![i_23_] = SceneCollisionEntry(i)
                    }
                }
            }
    
            @JvmStatic
            fun method825(i: Int) {
                anIntArray1450 = null
                if (i > -73) anIntArray1450 = null
            }
    
            @JvmStatic
            fun method826(i: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int, i_28_: Int, var_renderer: Renderer) {
                if ((SpotAnimVectorStatics.aAbstractModelRenderer_2309 == null || TimedTileQueueEntryStatics.aAbstractModelRenderer_9658 == null || TimedTileQueueEntryStatics.aAbstractModelRenderer_9659 == null) && CameraRotationStubStatics.aJs5Archive_322!!.method421(false, ProjectedGroundDecorStatics.anInt10257) && CameraRotationStubStatics.aJs5Archive_322!!.method421(false, SkyboxGradient.anInt3937) && CameraRotationStubStatics.aJs5Archive_322!!.method421(false, NpcTypeStatics.anInt1387)) {
                    val spriteImage = SpriteImageStatics.method1521(CameraRotationStubStatics.aJs5Archive_322!!, SkyboxGradient.anInt3937, 0)
                    TimedTileQueueEntryStatics.aAbstractModelRenderer_9658 = var_renderer.method3691(spriteImage, true)
                    spriteImage!!.method1518()
                    ConfigVarProgressStatics.aAbstractModelRenderer_4808 = var_renderer.method3691(spriteImage, true)
                    SpotAnimVectorStatics.aAbstractModelRenderer_2309 = (var_renderer.method3691(SpriteImageStatics.method1521(CameraRotationStubStatics.aJs5Archive_322!!, ProjectedGroundDecorStatics.anInt10257, 0), true))
                    val spriteImage_29_ = SpriteImageStatics.method1521(CameraRotationStubStatics.aJs5Archive_322!!, NpcTypeStatics.anInt1387, 0)
                    TimedTileQueueEntryStatics.aAbstractModelRenderer_9659 = var_renderer.method3691(spriteImage_29_, true)
                    spriteImage_29_!!.method1518()
                    AbstractMenuEntryStatics.aAbstractModelRenderer_1706 = var_renderer.method3691(spriteImage_29_, true)
                }
                anInt1454++
                if (SpotAnimVectorStatics.aAbstractModelRenderer_2309 != null && TimedTileQueueEntryStatics.aAbstractModelRenderer_9658 != null && TimedTileQueueEntryStatics.aAbstractModelRenderer_9659 != null) {
                    val i_30_ = (-(TimedTileQueueEntryStatics.aAbstractModelRenderer_9659!!.method971() * 2) + i_25_) / SpotAnimVectorStatics.aAbstractModelRenderer_2309!!.method971()
                    for (i_31_ in 0..<i_30_) SpotAnimVectorStatics.aAbstractModelRenderer_2309!!.method974(i_24_ + (TimedTileQueueEntryStatics.aAbstractModelRenderer_9659!!.method971() - -(i_31_ * SpotAnimVectorStatics.aAbstractModelRenderer_2309!!.method971())), -SpotAnimVectorStatics.aAbstractModelRenderer_2309!!.method969() + (i_28_ + i_26_))
                    val i_32_ = ((i_26_ - (i + TimedTileQueueEntryStatics.aAbstractModelRenderer_9659!!.method969())) / TimedTileQueueEntryStatics.aAbstractModelRenderer_9658!!.method969())
                    for (i_33_ in 0..<i_32_) {
                        TimedTileQueueEntryStatics.aAbstractModelRenderer_9658!!.method974(i_24_, (TimedTileQueueEntryStatics.aAbstractModelRenderer_9658!!.method969() * i_33_ + (i_28_ + i)))
                        ConfigVarProgressStatics.aAbstractModelRenderer_4808!!.method974(-ConfigVarProgressStatics.aAbstractModelRenderer_4808!!.method971() + i_25_ + i_24_, (TimedTileQueueEntryStatics.aAbstractModelRenderer_9658!!.method969() * i_33_ + i + i_28_))
                    }
                    TimedTileQueueEntryStatics.aAbstractModelRenderer_9659!!.method974(i_24_, (-TimedTileQueueEntryStatics.aAbstractModelRenderer_9659!!.method969() + i_28_ + i_26_))
                    AbstractMenuEntryStatics.aAbstractModelRenderer_1706!!.method974(i_24_ + (i_25_ + -TimedTileQueueEntryStatics.aAbstractModelRenderer_9659!!.method971()), i_28_ - (-i_26_ + TimedTileQueueEntryStatics.aAbstractModelRenderer_9659!!.method969()))
                }
                val i_34_ = -24 % ((i_27_ - 85) / 35)
            }
}
