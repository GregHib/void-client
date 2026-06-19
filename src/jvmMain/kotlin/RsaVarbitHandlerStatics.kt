import java.awt.Frame
import java.math.BigInteger

object RsaVarbitHandlerStatics {
    @JvmField
            var anInt4894: Int = 0
            @JvmField
            var anInt4895: Int = 0
            @JvmField
            var aBigInteger4896: BigInteger? = BigInteger("10001", 16)
            @JvmField
            var anInt4897: Int = 0
            @JvmField
            var anInt4898: Int = 0
            @JvmField
            var anInt4900: Int = 0
            @JvmField
            var aRectangleRegion_4901: RectangleRegion?
            @JvmField
            var anInt4902: Int = 0
            @JvmField
            var aBoolean4903: Boolean = false
            @JvmField
            var aFrame4904: Frame? = null
            @JvmField
            var aFontMetaRef_4905: FontMetaRef?
            var anIntArray4906: IntArray?
            @JvmField
            var aFontMetaRef_4907: FontMetaRef?
    
            fun method490(i: Byte, class348_sub49: ByteBuffer): MinimapTileEntry {
                anInt4897++
                val minimapTileEntry = MinimapTileEntry()
                minimapTileEntry.anInt615 = class348_sub49.readUnsignedShort(842397944)
                minimapTileEntry.aClass348_Sub42_Sub10_614 = BrightnessOptionStateStatics.aCompiledScriptCache_5900!!.method3471(minimapTileEntry.anInt615, (-90).toByte())
                val i_0_ = -91 / ((9 - i) / 54)
                return minimapTileEntry
            }
    
            fun method491(i: Byte) {
                var i_1_ = 0
                while ((AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!!.size > i_1_)) {
                    for (i_2_ in AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![0]!!.indices) {
                        var i_3_ = 0
                        while ((AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![0]!![0]!!.size > i_3_)) {
                            AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![i_1_]!![i_2_]!![i_3_] = 0.toByte()
                            i_3_++
                        }
                    }
                    i_1_++
                }
                val i_4_ = 119 / ((i - 47) / 34)
                anInt4902++
            }
    
            @JvmStatic
            fun method492(i: Int) {
                aFontMetaRef_4905 = null
                aFontMetaRef_4907 = null
                aFrame4904 = null
                if (i < -17) {
                    aBigInteger4896 = null
                    anIntArray4906 = null
                    aRectangleRegion_4901 = null
                }
            }
    
            @JvmStatic
            fun method493(bool: Boolean) {
                if (MaterialTypeMarkerStatics.aConnectionStateTypeArray6515 == null) {
                    MaterialTypeMarkerStatics.aConnectionStateTypeArray6515 = ConnectionStateTypeStatics.method528(-91)
                    TimedTileQueueEntryStatics.aConnectionStateType_9660 = MaterialTypeMarkerStatics.aConnectionStateTypeArray6515!![0]
                    DataHolderStatics.aLong3660 = GameClock.method599(-119)
                }
                anInt4900++
                if (NpcConfigStatics.aResourceLoaderThread_897 == null) TrigLookupTablesStatics.method726(116)
                val class56 = TimedTileQueueEntryStatics.aConnectionStateType_9660!!
                val i = ClientLoadStateMachine.method1278(-28660)
                if (class56 == TimedTileQueueEntryStatics.aConnectionStateType_9660) {
                    Direct3dModelStatics.aString5420 = TimedTileQueueEntryStatics.aConnectionStateType_9660!!.aLocalizedText_1012!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)
                    if (TimedTileQueueEntryStatics.aConnectionStateType_9660!!.aBoolean1016) ConfigFlagUtilStatics.anInt3236 = (i * ((TimedTileQueueEntryStatics.aConnectionStateType_9660!!.anInt1021) + -(TimedTileQueueEntryStatics.aConnectionStateType_9660!!.anInt1025)) / 100 + (TimedTileQueueEntryStatics.aConnectionStateType_9660!!.anInt1025))
                    if (TimedTileQueueEntryStatics.aConnectionStateType_9660!!.aBoolean1013) Direct3dModelStatics.aString5420 += ConfigFlagUtilStatics.anInt3236.toString() + "%"
                } else if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1043) {
                    NpcConfigStatics.aResourceLoaderThread_897 = null
                    ByteBufferStatics.method3379(2, 3)
                } else {
                    Direct3dModelStatics.aString5420 = class56.aLocalizedText_1015!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)
                    if (TimedTileQueueEntryStatics.aConnectionStateType_9660!!.aBoolean1013) Direct3dModelStatics.aString5420 += class56.anInt1021.toString() + "%"
                    ConfigFlagUtilStatics.anInt3236 = class56.anInt1021
                    if (TimedTileQueueEntryStatics.aConnectionStateType_9660!!.aBoolean1016 || class56.aBoolean1016) DataHolderStatics.aLong3660 = GameClock.method599(-128)
                }
                if (bool == true) {
                    if (NpcConfigStatics.aResourceLoaderThread_897 != null) {
                        NpcConfigStatics.aResourceLoaderThread_897!!.method2316((TimedTileQueueEntryStatics.aConnectionStateType_9660), Direct3dModelStatics.aString5420, ConfigFlagUtilStatics.anInt3236, DataHolderStatics.aLong3660, false)
                        if (LoadProgressCountersStatics.anCursorControllerArray2447 != null) {
                            var i_5_ = PlayerAppearanceUpdateDecoder.anInt4544 - -1
                            while ((LoadProgressCountersStatics.anCursorControllerArray2447!!.size > i_5_)) {
                                if (LoadProgressCountersStatics.anCursorControllerArray2447!![i_5_]!!.method60(-19079) >= 100 && PlayerAppearanceUpdateDecoder.anInt4544 == -1 + i_5_ && WorldMapRendererStatics.anInt4674 >= 1 && NpcConfigStatics.aResourceLoaderThread_897!!.method2322(0)) {
                                    try {
                                        LoadProgressCountersStatics.anCursorControllerArray2447!![i_5_]!!.method57(117)
                                    } catch (exception: Exception) {
                                        LoadProgressCountersStatics.anCursorControllerArray2447 = null
                                        break
                                    }
                                    NpcConfigStatics.aResourceLoaderThread_897!!.method2321(10559, LoadProgressCountersStatics.anCursorControllerArray2447!![i_5_]!!)
                                    PlayerAppearanceUpdateDecoder.anInt4544++
                                    if ((PlayerAppearanceUpdateDecoder.anInt4544 >= (-1 + LoadProgressCountersStatics.anCursorControllerArray2447!!.size)) && LoadProgressCountersStatics.anCursorControllerArray2447!!.size > 1) PlayerAppearanceUpdateDecoder.anInt4544 = if (!PerlinTextureProviderStatics.aCollisionMapRegion_5813!!.method1044(26)) -1 else 0
                                }
                                i_5_++
                            }
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method494(i: Int, i_6_: Int): Int {
                if (i <= 78) aBigInteger4896 = null
                anInt4898++
                return 0x7f and i_6_
            }
    
            init {
                aRectangleRegion_4901 = RectangleRegion(12, 0, 1, 0)
                anIntArray4906 = IntArray(4)
                aFontMetaRef_4905 = FontMetaRef(44, 3)
                aFontMetaRef_4907 = FontMetaRef(48, 11)
            }
}
