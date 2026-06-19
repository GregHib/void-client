object TooltipComponentRendererStatics {
    @JvmField
            var anInt4642: Int = 0
            @JvmField
            var aAbstractModelRenderer_4643: AbstractModelRenderer? = null
            @JvmField
            var anInt4644: Int = 0
            @JvmField
            var anInt4645: Int = 0
            @JvmField
            var anInt4647: Int = 0
            @JvmField
            var anIntArray4648: IntArray? = IntArray(14)
            @JvmStatic
            fun method716(i: Int) {
                if (i == 1) {
                    aAbstractModelRenderer_4643 = null
                    anIntArray4648 = null
                }
            }
    
            fun method717(i: Int): Boolean {
                anInt4645++
                if (RegionSceneLoader.aBoolean3697) {
                    try {
                        JavaScriptBridge.method1617(125.toByte(), JagGlToolkitFactory.anApplet1530, "showVideoAd")
                        return true
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                }
                if (i != -2511) method716(-67)
                return false
            }
    
            @JvmStatic
            fun method718(class318_sub1s: Array<SceneEntity?>, i: Int, i_4_: Int) {
                if (i < i_4_) {
                    val i_5_ = (i + i_4_) / 2
                    var i_6_ = i
                    val class318_sub1 = class318_sub1s[i_5_]!!
                    class318_sub1s[i_5_] = class318_sub1s[i_4_]
                    class318_sub1s[i_4_] = class318_sub1
                    val i_7_ = class318_sub1.anInt6389
                    for (i_8_ in i..<i_4_) {
                        if (class318_sub1s[i_8_]!!.anInt6389 > i_7_ + (i_8_ and 0x1)) {
                            val class318_sub1_9_: SceneEntity? = class318_sub1s[i_8_]
                            class318_sub1s[i_8_] = class318_sub1s[i_6_]
                            class318_sub1s[i_6_++] = class318_sub1_9_!!
                        }
                    }
                    class318_sub1s[i_4_] = class318_sub1s[i_6_]
                    class318_sub1s[i_6_] = class318_sub1
                    method718(class318_sub1s, i, i_6_ - 1)
                    method718(class318_sub1s, i_6_ + 1, i_4_)
                }
            }
}
