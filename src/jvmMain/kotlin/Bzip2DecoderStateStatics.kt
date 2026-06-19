import ParticleTileShapeStatics.method2732

object Bzip2DecoderStateStatics {
    @JvmField
            var anInt542: Int = 0
            @JvmField
            var anIntArray543: IntArray? = null
            @JvmField
            var anInt547: Int = 0
            @JvmField
            var anInt551: Int = 0
            @JvmField
            var anInt558: Int = -1
    
            @JvmStatic
            fun method368(i: Int, i_0_: Int, bool: Boolean, i_1_: Int, js5Archive: Js5Archive?, i_2_: Int, i_3_: Int) {
                if (i_0_ != 18002) anInt558 = 41
                anInt551++
                if (i_3_ > 0) {
                    KeyboardInputSourceStatics.aBoolean4275 = bool
                    SpriteDefinitionStatics.anInt7068 = 1
                    ModelDefinitionStatics.aJs5Archive_1848 = js5Archive
                    NpcActorEntityStatics.anInt10074 = i_1_
                    GlBufferObjectStatics.aClass348_Sub16_Sub3_4743 = null
                    SceneLinkedListNodeStatics.anInt3971 = i_2_
                    DirectionPathStatics.anInt1059 = i
                    WaterDetailOptionStateStatics.anInt5994 = (NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2844(103.toByte()) / i_3_)
                    if (WaterDetailOptionStateStatics.anInt5994 < 1) WaterDetailOptionStateStatics.anInt5994 = 1
                } else method2732(i_2_, i_1_, bool, 123, js5Archive, i)
            }
    
            @JvmStatic
            fun method369(i: Int) {
                TimedRecordAccessorStatics.aAbstractModelRendererArray7107 = null
                CameraDistanceOptionStateStatics.aAbstractModelRendererArray5857 = null
                BoundingBoxNodeStatics.aAbstractModelRendererArray6742 = null
                WorldMapRendererStatics.aAbstractModelRendererArray4679 = null
                if (i != -29776) method370(true)
                NpcTypeStatics.aAbstractModelRenderer_1365 = null
                SpriteStoreStatics.aAbstractModelRendererArray367 = null
                CustomCursorsOptionStateStatics.aAbstractModelRendererArray5933 = null
                ScriptResources.aAbstractModelRendererArray2640 = null
                BoxBlurTextureNodeStatics.aAbstractModelRendererArray9467 = null
                NodeDequeStatics.aFont_3326 = null
                SceneryDetailOptionStateStatics.aAbstractModelRenderer_6097 = null
                GameAppletFrameStatics.aFont_20 = null
                WorldMapRendererStatics.aFont_4684 = null
                HostPingThreadStatics.aAbstractModelRendererArray2260 = null
                CameraNodeListStatics.aAbstractModelRendererArray1744 = null
                CompassSmootherStatics.aAbstractModelRendererArray3378 = null
                GrayscaleNoiseTextureStatics.aAbstractModelRendererArray5294 = null
                WallSceneEntityStatics.aAbstractModelRendererArray9959 = null
                anInt542++
            }
    
            @JvmStatic
            fun method370(bool: Boolean) {
                if (bool != true) anIntArray543 = null
                anIntArray543 = null
            }
    
            @JvmStatic
            fun method371(i: Int, i_4_: Int, i_5_: Int): Boolean {
                if (i_4_ != 256) return true
                anInt547++
                return (i and 0x180) != 0
            }
}
