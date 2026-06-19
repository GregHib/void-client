import MinimapRectClipper.method226
import RemoveRoofsOptionStateStatics.method1813
import FixedFunctionWaterPassStatics.method3549
import jaclib.memory.Buffer

object NativeIndexBufferStatics {
    @JvmField
            var anInt4698: Int = 0
            @JvmField
            var anInt4699: Int = 0
            @JvmField
            var anInt4700: Int = 0
            @JvmField
            var anInt4701: Int = 0
            var aByte4702: Byte = 0
            @JvmField
            var anInt4703: Int = 0
            @JvmField
            var anInt4704: Int = 0
            @JvmField
            var anInt4705: Int = 0
    
            @JvmStatic
            fun method1077(var_renderer: Renderer?, i: Byte) {
                anInt4700++
                if ((FileExistsConditionStatics.anInt4776 >= 2 || RenderNodeStatics.aBoolean9722) && RegionSceneLoader.aWidgetComponent_3701 == null) {
                    if (i >= -71) method1077(null, (-41).toByte())
                    var string: String?
                    if (RenderNodeStatics.aBoolean9722 && FileExistsConditionStatics.anInt4776 < 2) string = (ItemNameResolverStatics.aString5001 + LocalizedTextStatics.aLocalizedText_3515!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544) + ItemNameResolverStatics.aString5000 + " ->")
                    else if (!InputSettingsState.shiftClick || !LoadProgressCountersStatics.aKeyboardInputSource_2449!!.method2696(81, -121) || FileExistsConditionStatics.anInt4776 <= 2) {
                        val class348_sub42_sub12 = IntHashSetStatics.aClass348_Sub42_Sub12_3963
                        if (class348_sub42_sub12 == null) return
                        string = IntHashSetStatics.method2367((-52).toByte(), class348_sub42_sub12)
                        var `is`: IntArray? = null
                        if (!WidgetNodeLinkStatics.method1197(-12081, class348_sub42_sub12.anInt9608)) {
                            if (class348_sub42_sub12.anInt9599 != -1) `is` = ClientExceptionStatics.aModelHeaderCache_112!!.method1940(98, (class348_sub42_sub12.anInt9599)).anIntArray2772
                            else if (method3549((class348_sub42_sub12.anInt9608), 107.toByte())) {
                                val class348_sub22 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(class348_sub42_sub12.aLong9605.toInt().toLong(), -6008)) as? NpcReference?)
                                if (class348_sub22 != null) {
                                    val npc = (class348_sub22.aNpc_6859)!!
                                    var class79 = (npc.aNpcType_10505)
                                    if (class79!!.anIntArray1377 != null) class79 = (class79.method794((ProjectedGroundDecorStatics.aVarpStore_10209!!), -1))
                                    if (class79 != null) `is` = class79.anIntArray1342
                                }
                            } else if (method1813(8806, (class348_sub42_sub12.anInt9608))) {
                                val `object`: Any? = null
                                var npcConfig: NpcConfig?
                                if ((class348_sub42_sub12.anInt9608) != 1001) npcConfig = (GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2005(0, ((class348_sub42_sub12.aLong9605) ushr 32 and 0x7fffffffL).toInt()))
                                else npcConfig = (GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2005(0, (class348_sub42_sub12.aLong9605).toInt()))
                                if (npcConfig.anIntArray945 != null) npcConfig = npcConfig.method480((ProjectedGroundDecorStatics.aVarpStore_10209!!), 47.toByte())
                                if (npcConfig != null) `is` = npcConfig.anIntArray917
                            }
                        } else `is` = (ClientExceptionStatics.aModelHeaderCache_112!!.method1940(-73, (class348_sub42_sub12.aLong9605).toInt()).anIntArray2772)
                        if (`is` != null) string += AudioResamplerStatics.method1273(`is`, true)
                    } else string = IntHashSetStatics.method2367(125.toByte(), IntHashSetStatics.aClass348_Sub42_Sub12_3963!!)
                    if (FileExistsConditionStatics.anInt4776 > 2) string += ("<col=ffffff> / " + (FileExistsConditionStatics.anInt4776 - 2) + LocalizedTextStatics.aLocalizedText_3508!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544))
                    if (WidgetActionEntryStatics.aWidgetComponent_6990 != null) {
                        var class324 = WidgetActionEntryStatics.aWidgetComponent_6990!!.method426(var_renderer, 68.toByte())
                        if (class324 == null) class324 = NodeDequeStatics.aFont_3326!!
                        class324.method2585(
                            SizeBoundedSoftCacheStatics.anIntArray2330,
                            WidgetActionEntryStatics.aWidgetComponent_6990!!.anInt709,
                            TileRenderStateStatics.aAbstractModelRendererArray4234!!,
                            WidgetActionEntryStatics.aWidgetComponent_6990!!.anInt700,
                            WidgetActionEntryStatics.aWidgetComponent_6990!!.anInt749,
                            WidgetActionEntryStatics.aWidgetComponent_6990!!.anInt789,
                            WidgetActionEntryStatics.aWidgetComponent_6990!!.anInt809,
                            FireParticleStreamStatics.aRandom93,
                            WidgetActionEntryStatics.aWidgetComponent_6990!!.anInt762,
                            LongHashTableStatics.anInt451,
                            HashtableStatics.anInt4383,
                            -33,
                            SoundCacheState.anInt4141,
                            string,
                            RenderableGroupStatics.anIntArray5007
                        )
                        method226(RenderableGroupStatics.anIntArray5007!![0], RenderableGroupStatics.anIntArray5007!![2], RenderableGroupStatics.anIntArray5007!![1], 0, RenderableGroupStatics.anIntArray5007!![3])
                    } else if (CameraRotationStubStatics.aWidgetComponent_323 != null && (HardCacheEntryReferenceStatics.aSceneProjector_10434 == ParticleEmitterNodeStatics.aSceneProjector_186)) {
                        val i_1_ = (NodeDequeStatics.aFont_3326!!.method2571(-1, HashtableStatics.anInt4383, SizeBoundedSoftCacheStatics.anIntArray2330, string, 16777215, 0, TileRenderStateStatics.aAbstractModelRendererArray4234, 16 + SocketGameConnectionStatics.anInt5832, 4 + ConfigValueProviderStatics.anInt4911, FireParticleStreamStatics.aRandom93))
                        method226(ConfigValueProviderStatics.anInt4911 - -4, (WorldMapLabelStatics.aFontDefinition_4962!!.method1183(true, string) + i_1_), SocketGameConnectionStatics.anInt5832, 0, 16)
                    }
                }
            }
}
