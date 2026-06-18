import java.awt.Frame
import java.math.BigInteger

class Class52 internal constructor(@JvmField var anInt4899: Int) : Interface12 {
    override fun method51(i: Byte): ProjectileFactory? {
        anInt4894++
        if (i < 116) return null
        return ModelDefinitionCache.aProjectileFactory_2868
    }

    companion object {
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

        fun method490(i: Byte, class348_sub49: Buffer): MinimapTileEntry {
            anInt4897++
            val minimapTileEntry = MinimapTileEntry()
            minimapTileEntry.anInt615 = class348_sub49.readUnsignedShort(842397944)
            minimapTileEntry.aClass348_Sub42_Sub10_614 = BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(minimapTileEntry.anInt615, (-90).toByte())
            val i_0_ = -91 / ((9 - i) / 54)
            return minimapTileEntry
        }

        fun method491(i: Byte) {
            var i_1_ = 0
            while ((AnimationFrameDefinition.aByteArrayArrayArray6962!!.size > i_1_)) {
                for (i_2_ in AnimationFrameDefinition.aByteArrayArrayArray6962!![0]!!.indices) {
                    var i_3_ = 0
                    while ((AnimationFrameDefinition.aByteArrayArrayArray6962!![0]!![0]!!.size > i_3_)) {
                        AnimationFrameDefinition.aByteArrayArrayArray6962!![i_1_]!![i_2_]!![i_3_] = 0.toByte()
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
            if (MaterialTypeMarker.aClass56Array6515 == null) {
                MaterialTypeMarker.aClass56Array6515 = Class56.Companion.method528(-91)
                TimedTileQueueEntry.aClass56_9660 = MaterialTypeMarker.aClass56Array6515!![0]
                DataHolder.aLong3660 = Class62.method599(-119)
            }
            anInt4900++
            if (NpcConfig.Companion.aResourceLoaderThread_897 == null) Class70.method726(116)
            val class56 = TimedTileQueueEntry.aClass56_9660!!
            val i = ClientLoadStateMachine.method1278(-28660)
            if (class56 == TimedTileQueueEntry.aClass56_9660) {
                Class64_Sub2.aString5420 = TimedTileQueueEntry.aClass56_9660!!.aLocalizedText_1012!!.method2063(AnimationFrameDefinition.anInt6967, 544)
                if (TimedTileQueueEntry.aClass56_9660!!.aBoolean1016) ConfigFlagUtil.anInt3236 = (i * ((TimedTileQueueEntry.aClass56_9660!!.anInt1021) + -(TimedTileQueueEntry.aClass56_9660!!.anInt1025)) / 100 + (TimedTileQueueEntry.aClass56_9660!!.anInt1025))
                if (TimedTileQueueEntry.aClass56_9660!!.aBoolean1013) Class64_Sub2.aString5420 += ConfigFlagUtil.anInt3236.toString() + "%"
            } else if (TimedTileQueueEntry.aClass56_9660 == Class56.Companion.aClass56_1043) {
                NpcConfig.Companion.aResourceLoaderThread_897 = null
                Buffer.method3379(2, 3)
            } else {
                Class64_Sub2.aString5420 = class56.aLocalizedText_1015!!.method2063(AnimationFrameDefinition.anInt6967, 544)
                if (TimedTileQueueEntry.aClass56_9660!!.aBoolean1013) Class64_Sub2.aString5420 += class56.anInt1021.toString() + "%"
                ConfigFlagUtil.anInt3236 = class56.anInt1021
                if (TimedTileQueueEntry.aClass56_9660!!.aBoolean1016 || class56.aBoolean1016) DataHolder.aLong3660 = Class62.method599(-128)
            }
            if (bool == true) {
                if (NpcConfig.Companion.aResourceLoaderThread_897 != null) {
                    NpcConfig.Companion.aResourceLoaderThread_897!!.method2316((TimedTileQueueEntry.aClass56_9660), Class64_Sub2.aString5420, ConfigFlagUtil.anInt3236, DataHolder.aLong3660, false)
                    if (LoadProgressCounters.anInterface16Array2447 != null) {
                        var i_5_ = PlayerAppearanceUpdateDecoder.anInt4544 - -1
                        while ((LoadProgressCounters.anInterface16Array2447!!.size > i_5_)) {
                            if (LoadProgressCounters.anInterface16Array2447!![i_5_]!!.method60(-19079) >= 100 && PlayerAppearanceUpdateDecoder.anInt4544 == -1 + i_5_ && WorldMapRenderer.anInt4674 >= 1 && NpcConfig.Companion.aResourceLoaderThread_897!!.method2322(0)) {
                                try {
                                    LoadProgressCounters.anInterface16Array2447!![i_5_]!!.method57(117)
                                } catch (exception: Exception) {
                                    LoadProgressCounters.anInterface16Array2447 = null
                                    break
                                }
                                NpcConfig.Companion.aResourceLoaderThread_897!!.method2321(10559, LoadProgressCounters.anInterface16Array2447!![i_5_]!!)
                                PlayerAppearanceUpdateDecoder.anInt4544++
                                if ((PlayerAppearanceUpdateDecoder.anInt4544 >= (-1 + LoadProgressCounters.anInterface16Array2447!!.size)) && LoadProgressCounters.anInterface16Array2447!!.size > 1) PlayerAppearanceUpdateDecoder.anInt4544 = if (!PerlinTextureProvider.aCollisionMapRegion_5813!!.method1044(26)) -1 else 0
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
}
