import ScrollbarComponent.Companion.method188
import java.util.*

/* Class178 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ScriptOpcodeHolder {
    @JvmField
    var anInt2336: Int = 0
    var anInt2337: Int = 0
    var aIntRange_2338: IntRange? = IntRange(92, -1)
    var aConfigIdPair_2339: ConfigIdPair? = ConfigIdPair(14, 0)
    var anInt2340: Int = 0
    @JvmField
    var aConfigIdPair_2341: ConfigIdPair? = ConfigIdPair(15, 4)
    var aConfigIdPair_2342: ConfigIdPair? = ConfigIdPair(16, -2)
    var aConfigIdPair_2343: ConfigIdPair? = ConfigIdPair(17, 0)
    var aConfigIdPair_2344: ConfigIdPair? = ConfigIdPair(18, -2)
    var aConfigIdPair_2345: ConfigIdPair? = ConfigIdPair(19, -2)
    var aConfigIdPair_2346: ConfigIdPair? = ConfigIdPair(20, 6)
    var aConfigIdPair_2347: ConfigIdPair? = ConfigIdPair(21, 9)
    var aConfigIdPair_2348: ConfigIdPair? = ConfigIdPair(22, -2)
    var aConfigIdPair_2349: ConfigIdPair? = ConfigIdPair(23, 4)
    var aConfigIdPair_2350: ConfigIdPair? = ConfigIdPair(24, -1)
    var aConfigIdPair_2351: ConfigIdPair? = ConfigIdPair(26, 0)
    var aConfigIdPair_2352: ConfigIdPair? = ConfigIdPair(27, 0)
    @JvmField
    var aConfigIdPair_2353: ConfigIdPair? = ConfigIdPair(28, -2)
    private var aConfigIdPairArray2354s: Array<ConfigIdPair?>? = arrayOfNulls<ConfigIdPair>(32)

    @JvmStatic
    fun method1355(i: Int) {
        aConfigIdPair_2346 = null
        aConfigIdPair_2349 = null
        aConfigIdPair_2344 = null
        aConfigIdPair_2352 = null
        aIntRange_2338 = null
        if (i > -74) method1356(true, null, -116, -47, true, null, true)
        aConfigIdPair_2350 = null
        aConfigIdPairArray2354s = null
        aConfigIdPair_2353 = null
        aConfigIdPair_2351 = null
        aConfigIdPair_2339 = null
        aConfigIdPair_2343 = null
        aConfigIdPair_2341 = null
        aConfigIdPair_2345 = null
        aConfigIdPair_2342 = null
        aConfigIdPair_2348 = null
        aConfigIdPair_2347 = null
    }

    fun method1356(bool: Boolean, string: String?, i: Int, i_0_: Int, bool_1_: Boolean, string_2_: String?, bool_3_: Boolean) {
        var string_2_ = string_2_
        try {
            anInt2337++
            SpotAnimVector.Companion.aJs5Archive_2306!!.anInt634 = 1
            string_2_ = string_2_!!.lowercase(Locale.getDefault())
            var `is` = ShortArray(16)
            var i_4_ = -1
            var string_5_: String? = null
            if (i_0_ != -1) {
                val class254 = ProjectionCameraTransform.aEmoteDefCache_5764!!.method2600(i_0_, 28364)
                if (class254 == null || bool != class254.method1925(!bool_3_)) return
                if (class254.method1925(!bool_3_)) string_5_ = class254.aString3258
                else i_4_ = class254.anInt3256
            }
            var i_6_ = 0
            var i_7_ = 0
            if (bool_3_ != true) aConfigIdPair_2352 = null
            while ( /**/i_7_ < ClientException.aModelHeaderCache_112!!.anInt3271) {
                val class213 = ClientException.aModelHeaderCache_112!!.method1940(-74, i_7_)
                if ((!bool_1_ || class213.aBoolean2755) && class213.anInt2833 == -1 && class213.anInt2812 == -1 && class213.anInt2799 == 0 && class213.aString2795!!.lowercase(Locale.getDefault()).indexOf(string_2_) != -1) {
                    if (i_0_ != -1) {
                        if (bool) {
                            if (string != class213.method1561(string_5_, i_0_, -1511086397)) {
                                i_7_++
                                continue
                            }
                        } else if (class213.method1567(i_4_, -116, i_0_) != i) {
                            i_7_++
                            continue
                        }
                    }
                    if (i_6_ >= 250) {
                        AsyncTaskHandle.aShortArray2579 = null
                        SceneObjectSpawner.anInt1285 = -1
                        return
                    }
                    if (`is`.size <= i_6_) {
                        val is_8_ = ShortArray(2 * `is`.size)
                        for (i_9_ in 0..<i_6_) is_8_[i_9_] = `is`[i_9_]
                        `is` = is_8_
                    }
                    `is`[i_6_++] = i_7_.toShort()
                }
                i_7_++
            }
            AsyncTaskHandle.aShortArray2579 = `is`
            SceneObjectSpawner.anInt1285 = i_6_
            WidgetNodeLink.anInt2037 = 0
            val strings = arrayOfNulls<String>(SceneObjectSpawner.anInt1285)
            var i_10_ = 0
            while (SceneObjectSpawner.anInt1285 > i_10_) {
                strings[i_10_] = ClientException.aModelHeaderCache_112!!.method1940(123, `is`[i_10_].toInt()).aString2795
                i_10_++
            }
            SpotAnimVector.Companion.method1333(AsyncTaskHandle.aShortArray2579, 26073, strings)
            SpotAnimVector.Companion.aJs5Archive_2306!!.method412(116.toByte())
            SpotAnimVector.Companion.aJs5Archive_2306!!.anInt634 = 2
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("qa.A(" + bool + ',' + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + bool_1_ + ',' + (if (string_2_ != null) "{...}" else "null") + ',' + bool_3_ + ')'))
        }
    }

    init {
        val class29s = method188(59.toByte())
        for (i in class29s.indices) aConfigIdPairArray2354s!![class29s[i]!!.anInt400] = class29s[i]
    }
}
