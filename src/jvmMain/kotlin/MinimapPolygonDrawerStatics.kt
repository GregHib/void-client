import BasicGlRenderPassStatics.method3540
import OpenGlRendererStatics.method3743
import java.awt.Color

object MinimapPolygonDrawerStatics {
    @JvmField
            var anInt5238: Int = 0
            @JvmField
            var anInt5239: Int = 0
            @JvmField
            var anInt5240: Int = 0
            @JvmField
            var anIntArray5241: IntArray? = IntArray(14)
            @JvmField
            var aColorArray5242: Array<Color?>? = arrayOf<Color?>(Color(16777215), Color(16777215), Color(16741381), Color(16741381))
            @JvmField
            var anInt5244: Int = 0
            @JvmField
            var anInt5248: Int = 0
            @JvmField
            var anInt5251: Int = 0
            @JvmField
            var anInt5252: Int = 0
            @JvmField
            var anInt5253: Int = 0
            @JvmField
            var anInt5254: Int = 0
    
            fun method465(i: Int) {
                if (i != -1636518164) anInt5252 = -40
                HeapInfoRecordStatics.aHashtable_4934!!.method3481(0)
                anInt5251++
                HardKeyedCacheEntryReferenceStatics.aHashtable_10442!!.method3481(0)
            }
    
            @JvmStatic
            fun method466(bool: Boolean, string: String?, i: Int, i_0_: Byte, bool_1_: Boolean, i_2_: Int, i_3_: Int, bool_4_: Boolean, i_5_: Int, l: Long, string_6_: String?, l_7_: Long, i_8_: Int) {
                var i_8_ = i_8_
                try {
                    anInt5238++
                    if (!ScrollbarComponentStatics.aBoolean8335 && FileExistsConditionStatics.anInt4776 < 500) {
                        i_8_ = if (i_8_ != -1) i_8_ else Tooltip.anInt4458
                        if (i_0_ >= -65) method469(19.toByte())
                        val class348_sub42_sub12 = ContactEntry(string_6_, string, i_8_, i_5_, i_3_, l_7_, i_2_, i, bool_4_, bool, l, bool_1_)
                        method3743(6.toByte(), class348_sub42_sub12)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("hc.B(" + bool + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + bool_1_ + ',' + i_2_ + ',' + i_3_ + ',' + bool_4_ + ',' + i_5_ + ',' + l + ',' + (if (string_6_ != null) "{...}" else "null") + ',' + l_7_ + ',' + i_8_ + ')'))
                }
            }
    
            fun method467(i: Int, i_9_: Int, i_10_: Int) {
                if (i_9_ == -18075) {
                    anInt5248++
                    val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i, 105.toByte(), 1)
                    class348_sub42_sub15.method3246(-25490)
                    class348_sub42_sub15.anInt9652 = i_10_
                }
            }
    
            @JvmStatic
            fun method468(string: String?, i: Int): Boolean {
                val i_11_ = -91 % ((-35 - i) / 52)
                anInt5239++
                return SpotAnimVectorStatics.method1332(true, true, 10, string!!)
            }
    
            @JvmStatic
            fun method469(i: Byte) {
                val i_33_ = -24 / ((i - -12) / 41)
                aColorArray5242 = null
                anIntArray5241 = null
            }
    
            @JvmStatic
            fun method470(`is`: ShortArray?, i: Byte): ShortArray? {
                anInt5253++
                if (`is` == null) return null
                val is_34_ = ShortArray(`is`.size)
                ArrayCopyUtil.method1576(`is`, 0, is_34_, 0, `is`.size)
                if (i >= -103) method470(null, (-35).toByte())
                return is_34_
            }
}
