object CubemapTextureImplSourceStatics {
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
                    if (ChatMessageStreamStatics.aAbstractModelRenderer_106 == null || MinimapFlagRenderer.aAbstractModelRenderer_1800 == null) {
                        if (CameraRotationStubStatics.aJs5Archive_322!!.method421(false, HudTabPanelStatics.anInt2996) && CameraRotationStubStatics.aJs5Archive_322!!.method421(false, CombineTextureNodeStatics.anInt9231)) {
                            ChatMessageStreamStatics.aAbstractModelRenderer_106 = (var_renderer!!.method3691(SpriteImageStatics.method1521(CameraRotationStubStatics.aJs5Archive_322!!, HudTabPanelStatics.anInt2996, 0), true))
                            val spriteImage = SpriteImageStatics.method1521(CameraRotationStubStatics.aJs5Archive_322!!, CombineTextureNodeStatics.anInt9231, 0)
                            MinimapFlagRenderer.aAbstractModelRenderer_1800 = var_renderer.method3691(spriteImage, true)
                            spriteImage!!.method1518()
                            AbstractBloomEffectStatics.aAbstractModelRenderer_6627 = var_renderer.method3691(spriteImage, true)
                        } else var_renderer!!.aa(i_4_, i_5_, i, i_7_, (255 + -NpcConfigStatics.anInt948 shl 24 or CompassSmootherStatics.anInt3376), 1)
                    }
                    anInt8709++
                    if (ChatMessageStreamStatics.aAbstractModelRenderer_106 != null && MinimapFlagRenderer.aAbstractModelRenderer_1800 != null) {
                        val i_8_ = ((i - 2 * MinimapFlagRenderer.aAbstractModelRenderer_1800!!.method971()) / ChatMessageStreamStatics.aAbstractModelRenderer_106!!.method971())
                        for (i_9_ in 0..<i_8_) ChatMessageStreamStatics.aAbstractModelRenderer_106!!.method974((MinimapFlagRenderer.aAbstractModelRenderer_1800!!.method971() + i_4_ + (ChatMessageStreamStatics.aAbstractModelRenderer_106!!.method971() * i_9_)), i_5_)
                        MinimapFlagRenderer.aAbstractModelRenderer_1800!!.method974(i_4_, i_5_)
                        AbstractBloomEffectStatics.aAbstractModelRenderer_6627!!.method974((-AbstractBloomEffectStatics.aAbstractModelRenderer_6627!!.method971() + i_4_ - -i), i_5_)
                    }
                    if (bool == false) {
                        NodeDequeStatics.aFont_3326!!.method2576(string, (CharCodeMapStatics.anInt9586) or 0xffffff.inv(), 14 + i_5_, 3 + i_4_, -1, -127)
                        var_renderer!!.aa(i_4_, i_7_ + i_5_, i, i_6_ + -i_7_, (CompassSmootherStatics.anInt3376 or (255 + -NpcConfigStatics.anInt948 shl 24)), 1)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("kv.G(" + i + ',' + i_4_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ')'))
                }
            }
    
            @JvmStatic
            fun method2271(i: Int) {
                anInt8710++
                if (!OggCacheStreamStatics.aBoolean5265) {
                    GzipDecompressorStatics.method1217(0, WorldMapImageBuilderStatics.aSceneCollisionEntryArrayArrayArray1148!!)
                    if (ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082 != null) GzipDecompressorStatics.method1217(0, (ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082!!))
                    OggCacheStreamStatics.aBoolean5265 = true
                }
            }
    
            @JvmStatic
            fun method2272(i: Int) {
                if (i < 85) method2271(-124)
                anIntArray8712 = null
            }
}
