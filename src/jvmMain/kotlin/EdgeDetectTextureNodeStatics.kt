import kotlin.math.sqrt

object EdgeDetectTextureNodeStatics {
    @JvmField
            var anInt9166: Int = 0
            @JvmField
            var anInt9168: Int = 0
            @JvmField
            var anGameApplet_Frame_9169: GameAppletFrame? = null
            @JvmField
            var anInt9170: Int = 0
            @JvmField
            var aLruByteCache_9171: LruByteCache? = LruByteCache(4)
            @JvmField
            var anInt9172: Int = 0
            @JvmField
            var aFont_9173: Font? = null
    
            @JvmStatic
            fun method3071(i: Byte) {
                if (i.toInt() != 59) anGameApplet_Frame_9169 = null
                aLruByteCache_9171 = null
                aFont_9173 = null
            }
    
            @JvmStatic
            fun method3072(i: Byte) {
                anInt9168++
                val i_0_ = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub14_7264!!.method1778(-32350)
                val i_1_ = 14 / ((i - -34) / 61)
                if (i_0_ == 0) {
                    RegionSceneLoader.aByteArrayArrayArray3700 = null
                    WidgetComponentStatics.method440(0, (-61).toByte())
                } else if (i_0_ == 1) {
                    HeightMapNoise.method2280(0.toByte(), 28587)
                    WidgetComponentStatics.method440(512, (-61).toByte())
                    if (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962 != null) MapElementDecorStatics.method2468(3613)
                } else {
                    HeightMapNoise.method2280((-4 + TextureQualityOptionStateStatics.anInt6006 and 0xff).toByte(), 28587)
                    WidgetComponentStatics.method440(2, (-61).toByte())
                }
                TrackedGroundDecorStatics.anInt10395 = CompiledScriptCacheStatics.anInt4372
            }
    
            @JvmStatic
            fun method3073(i: Int, i_3_: Int, i_4_: Byte): Boolean {
                anInt9172++
                if (i_4_.toInt() != 50) return false
                return (0x34 and i_3_) != 0
            }
}
