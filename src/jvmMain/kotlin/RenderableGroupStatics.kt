import GameClock.method599

object RenderableGroupStatics {
    var anInt5003: Int = 0
            var anInt5004: Int = 0
            var anInt5005: Int = 0
            var anIntArray5007: IntArray? = IntArray(4)
            var anInt5008: Int = 0
            var anInt5009: Int = 0
            var aBoolean5013: Boolean = false
            var anInt5014: Int = 0
            @JvmField
            var aFontMetaRef_5015: FontMetaRef?
            @JvmField
            var anInt5016: Int = 0
            var aPrivilegedOperationWorker_5017: PrivilegedOperationWorker? = null
            var anInt5018: Int = 0
            @JvmField
            var anInt5019: Int
    
            @JvmStatic
            fun method1447(i: Int) {
                if (i == 76) {
                    anIntArray5007 = null
                    aPrivilegedOperationWorker_5017 = null
                    aFontMetaRef_5015 = null
                }
            }
    
            fun method1448(i: Int) {
                anInt5003++
                if (i <= -55) FlipTextureNodeStatics.aClass348_Sub42_Sub12_9144 = ContactEntry((LocalizedTextStatics.aLocalizedText_3487!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)), "", Tooltip.anInt4458, 1004, -1, 0L, 0, 0, true, false, 0L, true)
            }
    
            @JvmStatic
            fun method1449(i: Int, i_2_: Int, i_3_: Int): WidgetNodeLink? {
                val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_2_]!![i_3_]
                if (class357 == null) return null
                return class357.aWidgetNodeLink_4396
            }
    
            init {
                aFontMetaRef_5015 = FontMetaRef(76, 4)
                anInt5019 = 0
            }
}
