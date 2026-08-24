import kotlin.jvm.JvmStatic
import MinimapRectClipper.method226
import RemoveRoofsOptionState.Companion.method1813
import FixedFunctionWaterPass.Companion.method3549
import jaclib.memory.Buffer

class NativeIndexBuffer : NativeBufferWrapper, ByteBufferReader {
    private var anInt4697 = 0

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, `is`: ByteArray?, i_0_: Int) : super(var_ha_Sub2, `is`, i_0_) {
        try {
            anInt4697 = i
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("cw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_0_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, buffer: Buffer?) : super(var_ha_Sub2, buffer) {
        try {
            anInt4697 = i
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("cw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (buffer != null) "{...}" else "null") + ')'))
        }
    }

    override fun method12(i: Byte): Long {
        if (i.toInt() != 42) Companion.method1077(null, (-124).toByte())
        anInt4704++
        return this.aBuffer1792!!.getAddress()
    }

    override fun method13(i: Byte): Int {
        anInt4699++
        if (i.toInt() != -97) return -87
        return anInt4697
    }

    override fun method11(i: Int, i_2_: Int, `is`: ByteArray?, i_3_: Int) {
        anInt4705++
        this.method1076(`is`, i_2_)
        anInt4697 = i
        if (i_3_ != -9894) method10(false)
    }

    override fun method10(bool: Boolean): Int {
        anInt4701++
        if (bool != true) method11(126, 120, null, -73)
        return 0
    }

    companion object {

        var anInt4698: Int = 0

        var anInt4699: Int = 0

        var anInt4700: Int = 0

        var anInt4701: Int = 0
        var aByte4702: Byte = 0

        var anInt4703: Int = 0

        var anInt4704: Int = 0

        var anInt4705: Int = 0

        @JvmStatic
        fun method1077(var_renderer: Renderer?, i: Byte) {
            anInt4700++
            if ((FileExistsCondition.anInt4776 >= 2 || RenderNodeStatics.aBoolean9722) && RegionSceneLoader.aWidgetComponent_3701 == null) {
                if (i >= -71) method1077(null, (-41).toByte())
                var string: String?
                if (RenderNodeStatics.aBoolean9722 && FileExistsCondition.anInt4776 < 2) string = (ItemNameResolver.aString5001 + LocalizedText.aLocalizedText_3515!!.method2063(ChatCommandProcessor.anInt6967, 544) + ItemNameResolver.aString5000 + " ->")
                else if (!InputSettingsState.shiftClick || !LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(81, -121) || FileExistsCondition.anInt4776 <= 2) {
                    val class348_sub42_sub12 = IntHashSetStatics.aClass348_Sub42_Sub12_3963
                    if (class348_sub42_sub12 == null) return
                    string = IntHashSetStatics.method2367((-52).toByte(), class348_sub42_sub12)
                    var `is`: IntArray? = null
                    if (!WidgetNodeLink.method1197(-12081, class348_sub42_sub12.anInt9608)) {
                        if (class348_sub42_sub12.anInt9599 != -1) `is` = ClientException.aModelHeaderCache_112!!.method1940(98, (class348_sub42_sub12.anInt9599)).anIntArray2772
                        else if (method3549((class348_sub42_sub12.anInt9608), 107.toByte())) {
                            val class348_sub22 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(class348_sub42_sub12.aLong9605.toInt().toLong(), -6008)) as? NpcReference?)
                            if (class348_sub22 != null) {
                                val npc = (class348_sub22.aNpc_6859)!!
                                var class79 = (npc.aNpcType_10505)
                                if (class79!!.anIntArray1377 != null) class79 = (class79.method794((ProjectedGroundDecor.aVarpStore_10209!!), -1))
                                if (class79 != null) `is` = class79.anIntArray1342
                            }
                        } else if (method1813(8806, (class348_sub42_sub12.anInt9608))) {
                            val `object`: Any? = null
                            var npcConfig: NpcConfig?
                            if ((class348_sub42_sub12.anInt9608) != 1001) npcConfig = (GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, ((class348_sub42_sub12.aLong9605) ushr 32 and 0x7fffffffL).toInt()))
                            else npcConfig = (GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, (class348_sub42_sub12.aLong9605).toInt()))
                            if (npcConfig.anIntArray945 != null) npcConfig = npcConfig.method480((ProjectedGroundDecor.aVarpStore_10209!!), 47.toByte())
                            if (npcConfig != null) `is` = npcConfig.anIntArray917
                        }
                    } else `is` = (ClientException.aModelHeaderCache_112!!.method1940(-73, (class348_sub42_sub12.aLong9605).toInt()).anIntArray2772)
                    if (`is` != null) string += AudioResampler.method1273(`is`, true)
                } else string = IntHashSetStatics.method2367(125.toByte(), IntHashSetStatics.aClass348_Sub42_Sub12_3963!!)
                if (FileExistsCondition.anInt4776 > 2) string += ("<col=ffffff> / " + (FileExistsCondition.anInt4776 - 2) + LocalizedText.aLocalizedText_3508!!.method2063(ChatCommandProcessor.anInt6967, 544))
                if (WidgetActionEntry.aWidgetComponent_6990 != null) {
                    var class324 = WidgetActionEntry.aWidgetComponent_6990!!.method426(var_renderer, 68.toByte())
                    if (class324 == null) class324 = NodeDequeStatics.aRSFont_3326!!
                    class324.method2585(
                        SizeBoundedSoftCache.anIntArray2330,
                        WidgetActionEntry.aWidgetComponent_6990!!.anInt709,
                        TileRenderState.aAbstractModelRendererArray4234!!,
                        WidgetActionEntry.aWidgetComponent_6990!!.anInt700,
                        WidgetActionEntry.aWidgetComponent_6990!!.anInt749,
                        WidgetActionEntry.aWidgetComponent_6990!!.anInt789,
                        WidgetActionEntry.aWidgetComponent_6990!!.anInt809,
                        FireParticleStream.aRandom93,
                        WidgetActionEntry.aWidgetComponent_6990!!.anInt762,
                        LongHashTable.anInt451,
                        SpriteRenderEntry.anInt4383,
                        -33,
                        SoundCacheState.anInt4141,
                        string,
                        RenderableGroup.anIntArray5007
                    )
                    method226(RenderableGroup.anIntArray5007!![0], RenderableGroup.anIntArray5007!![2], RenderableGroup.anIntArray5007!![1], 0, RenderableGroup.anIntArray5007!![3])
                } else if (CameraRotationStub.aWidgetComponent_323 != null && (Client.aSceneProjector_10434 == ParticleEmitterNode.aSceneProjector_186)) {
                    val i_1_ = (NodeDequeStatics.aRSFont_3326!!.method2571(-1, SpriteRenderEntry.anInt4383, SizeBoundedSoftCache.anIntArray2330, string, 16777215, 0, TileRenderState.aAbstractModelRendererArray4234, 16 + SocketGameConnection.anInt5832, 4 + ConfigValueProvider.Companion.anInt4911, FireParticleStream.aRandom93))
                    method226(ConfigValueProvider.Companion.anInt4911 - -4, (WorldMapLabel.aFontDefinition_4962!!.method1183(true, string) + i_1_), SocketGameConnection.anInt5832, 0, 16)
                }
            }
        }
    }
}
