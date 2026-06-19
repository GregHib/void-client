/* Class299_Sub2_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CubemapTextureImplSource internal constructor(private val aHa_Sub3_8718: NativeRenderer, private val anInt8716: Int, private val anInt8717: Int, private val anInt8715: Int, private val anInt8711: Int, private val anInt8708: Int, private val anInt8714: Int) : TextureCubeProvider() {
    private var anInterface18_Impl2_8719: RenderableCubeTexture? = null
    override fun method2266(bool: Boolean): RenderableCubeTexture? {
        if (bool != true) return null
        anInt8720++
        if (anInterface18_Impl2_8719 == null) {
            ArchiveFileConditionWrapper.anIntArray3464!![3] = anInt8711
            ArchiveFileConditionWrapper.anIntArray3464!![1] = anInt8717
            ArchiveFileConditionWrapper.anIntArray3464!![4] = anInt8708
            val var_d = aHa_Sub3_8718.aRenderConfig4579!!
            ArchiveFileConditionWrapper.anIntArray3464!![5] = anInt8714
            ArchiveFileConditionWrapper.anIntArray3464!![2] = anInt8715
            ArchiveFileConditionWrapper.anIntArray3464!![0] = anInt8716
            var bool_0_ = false
            var i = 0
            for (i_1_ in 0..5) {
                if (!var_d.method4(-7953, ArchiveFileConditionWrapper.anIntArray3464!![i_1_])) return null
                val class12 = var_d.method3(ArchiveFileConditionWrapper.anIntArray3464!![i_1_], -6662)
                val i_2_ = if (class12!!.aBoolean199) 64 else 128
                if (i < i_2_) i = i_2_
                if (class12.aByte205 > 0) bool_0_ = true
            }
            for (i_3_ in 0..5) WaterDetailOptionState.anIntArrayArray5991!![i_3_] = var_d.method5(false, ArchiveFileConditionWrapper.anIntArray3464!![i_3_], 1.0f, i, i, 81)
            anInterface18_Impl2_8719 = aHa_Sub3_8718.method3900(WaterDetailOptionState.anIntArrayArray5991, bool_0_, 61, i)
        }
        return anInterface18_Impl2_8719
    }

    companion object {
        @JvmField
        var anInt8709: Int = 0
        @JvmField
        var anInt8710: Int = 0
        @JvmField
        var anIntArray8712: IntArray? = null
        @JvmField
        var aDouble8713: Double = -1.0
        @JvmField
        var anInt8720: Int = 0

        @JvmStatic
        fun method2270(i: Int, i_4_: Int, var_renderer: Renderer?, string: String?, bool: Boolean, i_5_: Int, i_6_: Int, i_7_: Int) {
            try {
                if (ChatMessageStream.aAbstractModelRenderer_106 == null || MinimapFlagRenderer.aAbstractModelRenderer_1800 == null) {
                    if (CameraRotationStub.aJs5Archive_322!!.method421(false, HudTabPanel.anInt2996) && CameraRotationStub.aJs5Archive_322!!.method421(false, CombineTextureNode.anInt9231)) {
                        ChatMessageStream.aAbstractModelRenderer_106 = (var_renderer!!.method3691(SpriteImage.method1521(CameraRotationStub.aJs5Archive_322!!, HudTabPanel.anInt2996, 0), true))
                        val spriteImage = SpriteImage.method1521(CameraRotationStub.aJs5Archive_322!!, CombineTextureNode.anInt9231, 0)
                        MinimapFlagRenderer.aAbstractModelRenderer_1800 = var_renderer.method3691(spriteImage, true)
                        spriteImage!!.method1518()
                        AbstractBloomEffect.aAbstractModelRenderer_6627 = var_renderer.method3691(spriteImage, true)
                    } else var_renderer!!.aa(i_4_, i_5_, i, i_7_, (255 + -NpcConfig.anInt948 shl 24 or CompassSmoother.anInt3376), 1)
                }
                anInt8709++
                if (ChatMessageStream.aAbstractModelRenderer_106 != null && MinimapFlagRenderer.aAbstractModelRenderer_1800 != null) {
                    val i_8_ = ((i - 2 * MinimapFlagRenderer.aAbstractModelRenderer_1800!!.method971()) / ChatMessageStream.aAbstractModelRenderer_106!!.method971())
                    for (i_9_ in 0..<i_8_) ChatMessageStream.aAbstractModelRenderer_106!!.method974((MinimapFlagRenderer.aAbstractModelRenderer_1800!!.method971() + i_4_ + (ChatMessageStream.aAbstractModelRenderer_106!!.method971() * i_9_)), i_5_)
                    MinimapFlagRenderer.aAbstractModelRenderer_1800!!.method974(i_4_, i_5_)
                    AbstractBloomEffect.aAbstractModelRenderer_6627!!.method974((-AbstractBloomEffect.aAbstractModelRenderer_6627!!.method971() + i_4_ - -i), i_5_)
                }
                if (bool == false) {
                    NodeDequeStatics.aFont_3326!!.method2576(string, (CharCodeMap.anInt9586) or 0xffffff.inv(), 14 + i_5_, 3 + i_4_, -1, -127)
                    var_renderer!!.aa(i_4_, i_7_ + i_5_, i, i_6_ + -i_7_, (CompassSmoother.anInt3376 or (255 + -NpcConfig.anInt948 shl 24)), 1)
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("kv.G(" + i + ',' + i_4_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'))
            }
        }

        @JvmStatic
        fun method2271(i: Int) {
            anInt8710++
            if (!OggCacheStream.aBoolean5265) {
                method1217(0, WorldMapImageBuilder.aSceneCollisionEntryArrayArrayArray1148!!)
                if (ProducerImageSurface.aSceneCollisionEntryArrayArrayArray9082 != null) method1217(0, (ProducerImageSurface.aSceneCollisionEntryArrayArrayArray9082!!))
                OggCacheStream.aBoolean5265 = true
            }
        }

        @JvmStatic
        fun method2272(i: Int) {
            if (i < 85) method2271(-124)
            anIntArray8712 = null
        }

        var anInt2070: Int = 0
        fun method1217(i: Int, sceneCollisionEntries: Array<Array<Array<SceneCollisionEntry?>?>?>) {
            anInt2070++
            for (i_2_ in i..<sceneCollisionEntries.size) {
                val sceneCollisionEntryS_3_: Array<Array<SceneCollisionEntry?>?> = sceneCollisionEntries[i_2_]!!
                for (i_4_ in sceneCollisionEntryS_3_.indices) {
                    var i_5_ = 0
                    while ((sceneCollisionEntryS_3_[i_4_]!!.size > i_5_)) {
                        val class357 = sceneCollisionEntryS_3_[i_4_]!![i_5_]
                        if (class357 != null) {
                            if (class357.aClass318_Sub1_Sub1_4402 is RenderTarget) (class357.aClass318_Sub1_Sub1_4402 as RenderTarget).method40(-12031)
                            if (class357.aClass318_Sub1_Sub5_4395 is RenderTarget) (class357.aClass318_Sub1_Sub5_4395 as RenderTarget).method40(-12031)
                            if (class357.aClass318_Sub1_Sub5_4407 is RenderTarget) (class357.aClass318_Sub1_Sub5_4407 as RenderTarget).method40(-12031)
                            if (class357.aClass318_Sub1_Sub4_4406 is RenderTarget) (class357.aClass318_Sub1_Sub4_4406 as RenderTarget).method40(-12031)
                            if (class357.aClass318_Sub1_Sub4_4403 is RenderTarget) (class357.aClass318_Sub1_Sub4_4403 as RenderTarget).method40(-12031)
                            var class148 = class357.aWidgetNodeLink_4396
                            while (class148 != null) {
                                val class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040)
                                if (class318_sub1_sub3 is RenderTarget) (class318_sub1_sub3 as RenderTarget).method40(i xor 0x2efe.inv())
                                class148 = class148.aWidgetNodeLink_2038
                            }
                        }
                        i_5_++
                    }
                }
            }
        }
    }
}
