import java.util.*
import kotlin.math.atan2
import kotlin.math.min

object AbstractModelStatics {
    @JvmField
            var anInt1125: Int = 0
            @JvmField
            var anInt1126: Int = 0
            @JvmField
            var anIntArray1127: IntArray? = IntArray(2)
            @JvmField
            var anInt1128: Int = 0
            @JvmField
            var anInt1129: Int = 0
            @JvmField
            var anInt1130: Int = 0
            @JvmField
            var aHuffmanCodec_1131: HuffmanCodec? = null
            @JvmField
            var anInt1132: Int = 0
            @JvmField
            var anInt1133: Int = 0
            @JvmField
            var anInt1134: Int = 0
            @JvmField
            var anInt1135: Int = 0
            @JvmField
            var aFloat1136: Float = 0f
            @JvmField
            var anInt1137: Int = 0
    
            @JvmStatic
            fun method606(i: Int, bool: Boolean, string: String) {
                var string = string
                anInt1128++
                string = string.lowercase(Locale.getDefault())
                var `is` = ShortArray(16)
                var i_52_ = i
                val i_53_ = if (bool) 32768 else 0
                val i_54_ = ((if (!bool) BrightnessOptionStateStatics.aCompiledScriptCache_5900!!.anInt4365 else BrightnessOptionStateStatics.aCompiledScriptCache_5900!!.anInt4364) + i_53_)
                for (i_55_ in i_53_..<i_54_) {
                    val class348_sub42_sub10 = BrightnessOptionStateStatics.aCompiledScriptCache_5900!!.method3471(i_55_, (-102).toByte())
                    if (class348_sub42_sub10.aBoolean9562 && class348_sub42_sub10.method3219(98).lowercase(Locale.getDefault()).indexOf(string) != -1) {
                        if (i_52_ >= 50) {
                            AsyncTaskHandleStatics.aShortArray2579 = null
                            SceneObjectSpawnerStatics.anInt1285 = -1
                            return
                        }
                        if (`is`.size <= i_52_) {
                            val is_56_ = ShortArray(`is`.size * 2)
                            var i_57_ = 0
                            while (i_52_ > i_57_) {
                                is_56_[i_57_] = `is`[i_57_]
                                i_57_++
                            }
                            `is` = is_56_
                        }
                        `is`[i_52_++] = i_55_.toShort()
                    }
                }
                SceneObjectSpawnerStatics.anInt1285 = i_52_
                WidgetNodeLinkStatics.anInt2037 = 0
                AsyncTaskHandleStatics.aShortArray2579 = `is`
                val strings = arrayOfNulls<String>(SceneObjectSpawnerStatics.anInt1285)
                var i_58_ = 0
                while (SceneObjectSpawnerStatics.anInt1285 > i_58_) {
                    strings[i_58_] = BrightnessOptionStateStatics.aCompiledScriptCache_5900!!.method3471(`is`[i_58_].toInt(), (-91).toByte()).method3219(CameraSplineNodeStatics.method2955(i, 81))
                    i_58_++
                }
                SpotAnimVectorStatics.method1333(AsyncTaskHandleStatics.aShortArray2579, i + 26073, strings)
            }
    
            @JvmStatic
            fun method607(i: Int, strings: Array<String?>?, `is`: ShortArray?, i_64_: Int, bool: Boolean) {
                try {
                    if (bool != false) aFloat1136 = 0.5791872f
                    if (i > i_64_) {
                        val i_65_ = (i_64_ - -i) / 2
                        var i_66_ = i_64_
                        val string = strings!![i_65_]
                        strings[i_65_] = strings[i]
                        strings[i] = string
                        val i_67_ = `is`!![i_65_]
                        `is`[i_65_] = `is`[i]
                        `is`[i] = i_67_
                        for (i_68_ in i_64_..<i) {
                            if (string == null || (strings[i_68_] != null && (strings[i_68_]!!.compareTo(string) < (i_68_ and 0x1)))) {
                                val string_69_ = strings[i_68_]
                                strings[i_68_] = strings[i_66_]
                                strings[i_66_] = string_69_
                                val i_70_ = `is`[i_68_]
                                `is`[i_68_] = `is`[i_66_]
                                `is`[i_66_++] = i_70_
                            }
                        }
                        strings[i] = strings[i_66_]
                        strings[i_66_] = string
                        `is`[i] = `is`[i_66_]
                        `is`[i_66_] = i_67_
                        method607(i_66_ + -1, strings, `is`, i_64_, false)
                        method607(i, strings, `is`, 1 + i_66_, bool)
                    }
                    anInt1134++
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("ka.UB(" + i + ',' + (if (strings != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_64_ + ',' + bool + ')'))
                }
            }
    
            @JvmStatic
            fun method609(i: Byte) {
                if (i <= -7) {
                    aHuffmanCodec_1131 = null
                    anIntArray1127 = null
                }
            }
    
            @JvmStatic
            fun method616(i: Int, i_81_: Int, i_82_: Int): Boolean {
                anInt1129++
                if (i != 2) return false
                return (i_81_ and 0x800) != 0
            }
}
