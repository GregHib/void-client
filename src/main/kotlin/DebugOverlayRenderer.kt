/* Class245 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object DebugOverlayRenderer {
    private var anIntArray3169: IntArray? = IntArray(3)
    @JvmField
    var anInt3170: Int = 0
    var anInt3171: Int = 0
    var aFloat3172: Float = 0f

    @JvmStatic
    fun method1882(i: Int) {
        if (i != 25365) anInt3170 = 100
        anIntArray3169 = null
    }

    fun method1883(sceneLinkedListNode: SceneLinkedListNode?, sceneLinkedListNode_0_: SceneLinkedListNode?, bool: Boolean) {
        try {
            anInt3171++
            if (sceneLinkedListNode_0_!!.aSceneLinkedListNode_3976 != null) sceneLinkedListNode_0_.method2373(false)
            sceneLinkedListNode_0_.aSceneLinkedListNode_3970 = sceneLinkedListNode
            if (bool != true) anIntArray3169 = null
            sceneLinkedListNode_0_.aSceneLinkedListNode_3976 = sceneLinkedListNode!!.aSceneLinkedListNode_3976
            sceneLinkedListNode_0_.aSceneLinkedListNode_3976!!.aSceneLinkedListNode_3970 = sceneLinkedListNode_0_
            sceneLinkedListNode_0_.aSceneLinkedListNode_3970!!.aSceneLinkedListNode_3976 = sceneLinkedListNode_0_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("te.B(" + (if (sceneLinkedListNode != null) "{...}" else "null") + ',' + (if (sceneLinkedListNode_0_ != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    fun method1884() {
        val i = 10
        val i_1_ = 30
        if (InterfaceBounds.anInt6818 != 0 && Tooltip.aFont_4456 != null) {
            Class9.aRenderer171!!.K(BrightnessContrastEffect.anIntArray9183)
            for (i_2_ in WidgetDefinition.anIntArray256!!.indices) Class9.aRenderer171!!.method3660((WidgetDefinition.anIntArray256!![i_2_] + ParticleProcessor.anIntArray4271!![i_2_]), -256, (BrightnessContrastEffect.anIntArray9183!![3] - BrightnessContrastEffect.anIntArray9183!![1]), BrightnessContrastEffect.anIntArray9183!![1], true)
            for (i_3_ in 0..<ParameterizedText.anInt9577) {
                val class338 = MinimapAreaMarkerNode.aMapTileShapeArray9700!![i_3_]!!
                Class9.aRenderer171!!.H(class338.anIntArray4187!![0], class338.anIntArray4191[0], class338.anIntArray4184[0], ClickFeedbackTask.anIntArray4670)
                Class9.aRenderer171!!.H(class338.anIntArray4187!![1], class338.anIntArray4191[1], class338.anIntArray4184[1], MinimapRectClipper.anIntArray222)
                Class9.aRenderer171!!.H(class338.anIntArray4187!![2], class338.anIntArray4191[2], class338.anIntArray4184[2], anIntArray3169)
                Class9.aRenderer171!!.H(class338.anIntArray4187!![3], class338.anIntArray4191[3], class338.anIntArray4184[3], Class99.anIntArray1574)
                if (ClickFeedbackTask.anIntArray4670!![2] != -1 && MinimapRectClipper.anIntArray222!![2] != -1 && anIntArray3169!![2] != -1 && Class99.anIntArray1574!![2] != -1) {
                    var i_4_ = -65536
                    if (class338.aByte4192.toInt() == 4) i_4_ = -16776961
                    Class9.aRenderer171!!.method3645(ClickFeedbackTask.anIntArray4670!![1], ClickFeedbackTask.anIntArray4670!![0], MinimapRectClipper.anIntArray222!![0], -8003, i_4_, MinimapRectClipper.anIntArray222!![1])
                    Class9.aRenderer171!!.method3645(MinimapRectClipper.anIntArray222!![1], MinimapRectClipper.anIntArray222!![0], anIntArray3169!![0], -8003, i_4_, anIntArray3169!![1])
                    Class9.aRenderer171!!.method3645(anIntArray3169!![1], anIntArray3169!![0], Class99.anIntArray1574!![0], -8003, i_4_, Class99.anIntArray1574!![1])
                    Class9.aRenderer171!!.method3645(Class99.anIntArray1574!![1], Class99.anIntArray1574!![0], ClickFeedbackTask.anIntArray4670!![0], -8003, i_4_, ClickFeedbackTask.anIntArray4670!![1])
                    Class9.aRenderer171!!.method3645(ClickFeedbackTask.anIntArray4670!![1], ClickFeedbackTask.anIntArray4670!![0], anIntArray3169!![0], -8003, i_4_, anIntArray3169!![1])
                }
            }
            Tooltip.aFont_4456!!.method2576(("Dynamic: " + Class86.anInt1477 + "/" + 5000), -256, i_1_ + 45, i, -16777216, -120)
            Tooltip.aFont_4456!!.method2576(("Total Opaque Onscreen: " + Class5_Sub1_Sub1.anInt9930 + "/" + 10000), -256, i_1_ + 60, i, -16777216, -124)
            Tooltip.aFont_4456!!.method2576(("Total Trans Onscreen: " + LoadingScreenImageNode.anInt9504 + "/" + 5000), -256, i_1_ + 75, i, -16777216, -111)
            Tooltip.aFont_4456!!.method2576(("Occluders: " + (DetailLevelOptionState.anInt6115 + Class69.anInt1200) + " Active: " + (ParameterizedText.anInt9577)), -256, i_1_ + 90, i, -16777216, -111)
            Tooltip.aFont_4456!!.method2576(("Occluded: Ground:" + TheoraVideoStream.anInt9039 + " Walls: " + Class42.anInt562 + " CPs: " + SourceRowTextureNode.anInt9112 + " Pixels: " + NpcDefinition.anInt2946), -256, i_1_ + 105, i, -16777216, -115)
            Tooltip.aFont_4456!!.method2576(("Occlude Calc Took: " + (GlslEnvMaterialPass.aLong6276 / 1000L) + "us"), -256, i_1_ + 120, i, -16777216, -123)
            if (InterfaceBounds.anInt6818 == 2 && GlTextureBase.anIntArray5091 != null) {
                for (i_5_ in GlTextureBase.anIntArray5091!!.indices) {
                    var f = GlTextureBase.anIntArray5091!![i_5_].toFloat()
                    f /= 4194304.0f
                    if (f > 1.0f) f = 1.0f
                    f *= 255.0f
                    f = 255.0f - f
                    val i_6_ = f.toInt()
                    GlTextureBase.anIntArray5091!![i_5_] = i_6_ or (i_6_ shl 8) or (i_6_ shl 16) or 0xffffff.inv()
                }
                val class105 = Class9.aRenderer171!!.method3662(WorldMapToggle.anInt3872, GlTextureBase.anIntArray5091, 94.toByte(), 0, WorldMapToggle.anInt3872, Class86.anInt1480)
                class105.method964(i, 170, 1, 0, 0)
            }
        }
    }
}
