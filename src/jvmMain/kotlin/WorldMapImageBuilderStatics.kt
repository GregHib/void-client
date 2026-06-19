object WorldMapImageBuilderStatics {
    @JvmField
            var anInt1138: Int = 0
            @JvmField
            var anInt1139: Int = 0
            @JvmField
            var anInt1140: Int = 0
            @JvmField
            var anInt1142: Int = 0
            @JvmField
            var anInt1143: Int = 0
            @JvmField
            var aFontMetaRef_1144: FontMetaRef?
            @JvmField
            var aClass110_Sub1Array1146: Array<MapLabelMenuEntry?>? = arrayOfNulls<MapLabelMenuEntry>(0)
            @JvmField
            var anInt1147: Int = 0
            @JvmField
            var aSceneCollisionEntryArrayArrayArray1148: Array<Array<Array<SceneCollisionEntry?>?>?>? = null
    
            @JvmStatic
            fun method696(i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
                if (i_2_ == -1007) {
                    if (i == 1009) ChatCommandProcessor.method701(FileIoUtil.aBoundsConstraintEntry_4091!!, i_1_, i_0_)
                    else if (i != 1012) {
                        if (i == 1002) ChatCommandProcessor.method701(InvertTextureNodeStatics.aBoundsConstraintEntry_9415!!, i_1_, i_0_)
                        else if (i == 1003) ChatCommandProcessor.method701(BoundingBoxNodeStatics.aBoundsConstraintEntry_6743!!, i_1_, i_0_)
                        else if (i == 1006) ChatCommandProcessor.method701(ParticleDetailOptionStateStatics.aBoundsConstraintEntry_6018!!, i_1_, i_0_)
                    } else ChatCommandProcessor.method701(SolidFillComponentStatics.aBoundsConstraintEntry_8356!!, i_1_, i_0_)
                    anInt1138++
                }
            }
    
            @JvmStatic
            fun method698(i: Int) {
                aFontMetaRef_1144 = null
                if (i != 2) aSceneCollisionEntryArrayArrayArray1148 = null
                aSceneCollisionEntryArrayArrayArray1148 = null
                aClass110_Sub1Array1146 = null
            }
    
            @JvmStatic
            fun method699(js5Archive: Js5Archive?, i: Byte, js5Archive_4_: Js5Archive?, js5Archive_5_: Js5Archive?, js5Archive_6_: Js5Archive?) {
                try {
                    ScatterTextureNodeStatics.aJs5Archive_9365 = js5Archive_6_
                    anInt1147++
                    GroundDecorEntityStatics.aJs5Archive_8755 = js5Archive_5_
                    RenderConfigFactoryStatics.aJs5Archive_2978 = js5Archive_4_
                    WarpTextureNodeStatics.aWidgetComponentArrayArray9427 = arrayOfNulls<Array<WidgetComponent?>>(RenderConfigFactoryStatics.aJs5Archive_2978!!.method414(-1))
                    AudioResamplerStatics.aBooleanArray2162 = BooleanArray(RenderConfigFactoryStatics.aJs5Archive_2978!!.method414(-1))
                    val i_7_ = -72 % ((35 - i) / 41)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("kb.F(" + (if (js5Archive != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive_4_ != null) "{...}" else "null") + ',' + (if (js5Archive_5_ != null) "{...}" else "null") + ',' + (if (js5Archive_6_ != null) "{...}" else "null") + ')'))
                }
            }
    
            init {
                aFontMetaRef_1144 = FontMetaRef(37, 2)
            }
}
