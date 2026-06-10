import Applet_Sub1.Companion.method94
import Class10.Companion.method217
import Class11.method222
import Class130.Companion.method1129
import Class135.Companion.method1148
import Class14_Sub2.Companion.method243
import Class14_Sub2.Companion.method244
import Class16.method259
import Class16.method262
import Class2.Companion.method170
import Class239_Sub1.Companion.method1719
import Class239_Sub14.Companion.method1781
import Class239_Sub15.Companion.method1787
import Class239_Sub21.Companion.method1811
import Class239_Sub23.Companion.method1819
import Class239_Sub28.Companion.method1844
import Class239_Sub29.Companion.method1851
import Class239_Sub5.Companion.method1742
import Class239_Sub6.Companion.method1745
import Class239_Sub8.Companion.method1754
import Class24.method298
import Class27.method312
import Class27.method317
import Class272.Companion.method2051
import Class286_Sub3.Companion.method2148
import Class286_Sub3.Companion.method2153
import Class286_Sub6.Companion.method2162
import Class286_Sub7.Companion.method2165
import Class286_Sub8.Companion.method2172
import Class31.Companion.method326
import Class318_Sub1_Sub1.Companion.method2396
import Class318_Sub1_Sub2.Companion.method2405
import Class318_Sub1_Sub4.Companion.method2478
import Class318_Sub1_Sub5.Companion.method2487
import Class324.Companion.method2570
import Class348_Sub16_Sub3.Companion.method2839
import Class348_Sub1_Sub3.Companion.method2732
import Class348_Sub23_Sub1.Companion.method2972
import Class348_Sub4.Companion.method2749
import Class348_Sub40.Companion.method3038
import Class348_Sub40_Sub12.Companion.method3076
import Class348_Sub40_Sub17_Sub1.Companion.method3093
import Class348_Sub40_Sub30.Companion.method3128
import Class348_Sub40_Sub31.Companion.method3131
import Class348_Sub40_Sub34.Companion.method3141
import Class348_Sub40_Sub9.Companion.method3072
import Class348_Sub45_Sub2.Companion.method3316
import Class348_Sub9.Companion.method2780
import Class35.method352
import Class367_Sub10.Companion.method3553
import Class367_Sub2.Companion.method3538
import Class367_Sub4.Companion.method3544
import Class369.Companion.method3569
import Class48.Companion.method449
import Class50_Sub3.Companion.method468
import Class55_Sub1.Companion.method524
import Class57.Companion.method529
import Class58.Companion.method532
import Class59.Companion.method544
import Class59_Sub2_Sub2.Companion.method572
import Class5_Sub2.Companion.method197
import Class5_Sub3.Companion.method199
import Class5_Sub3.Companion.method201
import Class62.method596
import Class62.method599
import Class64.Companion.method606
import Class64_Sub3.Companion.method690
import aa.Companion.method160
import s.Companion.method3985
import java.awt.datatransfer.DataFlavor
import java.util.*
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow

object Class66 {
    private var anIntArray1149: IntArray? = IntArray(1000)
    private var aClass46_1150: Class46? = null
    private var aClass43_1151: Class43? = null
    private var aStringArray1152: Array<String?>? = arrayOfNulls<String>(1000)
    @JvmField
    var anInt1153: Int = 0
    private var anInt1154 = 0
    private var aStringArray1155: Array<String?>? = null
    @JvmField
    var anInt1156: Int = 0
    @JvmField
    var anInt1157: Int = 0
    @JvmField
    var anInt1158: Int = 0
    @JvmField
    var anInt1159: Int = 0
    private var aCalendar1160: Calendar?
    private var anIntArrayArray1161: Array<IntArray?>? = Array<IntArray?>(5) { IntArray(5000) }
    @JvmField
    var anInt1162: Int = 0
    @JvmField
    var anInt1163: Int = 0
    private var anIntArray1164: IntArray? = null
    @JvmField
    var anInt1165: Int = 0
    @JvmField
    var anInt1166: Int = 0
    @JvmField
    var anInt1167: Int = 0
    private var aClass184Array1168: Array<Class184?>?
    private var aClass46_1169: Class46? = null
    private var anInt1170 = 0
    @JvmField
    var anInt1171: Int = 0
    private var anIntArray1172: IntArray? = IntArray(5)
    private var anInt1173 = 0
    @JvmField
    var aClass60_1174: Class60?
    private var anIntArray1175: IntArray?
    private var aStringArray1176: Array<String>?
    private var anInt1177: Int

    @JvmStatic
    fun method701(class273: Class273, i: Int, i_0_: Int) {
        val class348_sub42_sub19 = Class153.method1223(i, i_0_, 96837648, class273)
        if (class348_sub42_sub19 != null) {
            anIntArray1164 = (IntArray(class348_sub42_sub19.anInt9688))
            aStringArray1155 = (arrayOfNulls<String>(class348_sub42_sub19.anInt9689))
            if ((class348_sub42_sub19.aClass273_9691 == Class90.aClass273_1512) || (class348_sub42_sub19.aClass273_9691) == Class59_Sub1_Sub2.aClass273_8664 || (class348_sub42_sub19.aClass273_9691) == Class77.aClass273_1298) {
                var i_1_ = 0
                var i_2_ = 0
                if (Class168.aClass46_2249 != null) {
                    i_1_ = Class168.aClass46_2249!!.anInt800
                    i_2_ = Class168.aClass46_2249!!.anInt750
                }
                anIntArray1164!![0] = Class258_Sub4.aClass373_8552!!.method3597(true) - i_1_
                anIntArray1164!![1] = (Class258_Sub4.aClass373_8552!!.method3594(80.toByte()) - i_2_)
            }
            method711(class348_sub42_sub19, 200000)
        }
    }

    private fun method702(i: Int) {
        val class46 = method2570(1512932720, i)
        if (class46 != null) {
            val i_3_ = i ushr 16
            var class46s = Class369_Sub2.aClass46ArrayArray8584!![i_3_]
            if (class46s == null) {
                val class46s_4_: Array<Class46?> = Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_3_]!!
                val i_5_ = class46s_4_.size
                Class369_Sub2.aClass46ArrayArray8584!![i_3_] = arrayOfNulls<Class46>(i_5_)
                class46s = Class369_Sub2.aClass46ArrayArray8584!![i_3_]!!
                Class214.method1575(class46s_4_, 0, class46s, 0, class46s_4_.size)
            }
            var i_6_: Int
            i_6_ = 0
            while (i_6_ < class46s!!.size) {
                if (class46s[i_6_] == class46) break
                i_6_++
            }
            if (i_6_ < class46s.size) {
                Class214.method1575(class46s, 0, class46s, 1, i_6_)
                class46s[0] = class46
            }
        }
    }

    @JvmStatic
    fun method703(i: Int) {
        if (i != -1 && Class320.method2547(i, 84.toByte())) {
            val class46s: Array<Class46?> = Class348_Sub40_Sub33.aClass46ArrayArray9427!![i]!!
            for (i_7_ in class46s.indices) {
                val class46 = class46s[i_7_]!!
                if (class46.anObjectArray815 != null) {
                    val class348_sub36 = Class348_Sub36()
                    class348_sub36.aClass46_6989 = class46
                    class348_sub36.anObjectArray6987 = class46.anObjectArray815
                    method712(class348_sub36, 2000000)
                }
            }
        }
    }

    private fun method704(i: Int, bool: Boolean) {
        if (i < 5100) {
            if (i == 5000) {
                anIntArray1149!![anInt1173++] = za.anInt7276
                return
            }
            if (i == 5001) {
                anInt1173 -= 3
                za.anInt7276 = anIntArray1149!![anInt1173]
                Class57.aClass227_1055 = Class38.method360((-57).toByte(), anIntArray1149!![anInt1173 + 1])
                if (Class57.aClass227_1055 == null) Class57.aClass227_1055 = Class100.aClass227_1591
                Class290.anInt3713 = anIntArray1149!![anInt1173 + 2]
                anInt1156++
                val class348_sub47 = method2148(Class348_Sub14.aClass351_6766, (Class348_Sub23_Sub2.aClass77_9029), -111)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, za.anInt7276)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, Class57.aClass227_1055!!.anInt2970)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, Class290.anInt3713)
                Class348_Sub42_Sub14.method3243(-77, class348_sub47)
                return
            }
            if (i == 5002) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                var string_8_ = aStringArray1152!![anInt1170 + 1]
                anInt1173 -= 2
                val i_9_ = anIntArray1149!![anInt1173]
                val i_10_ = anIntArray1149!![anInt1173 + 1]
                if (string_8_ == null) string_8_ = ""
                if (string_8_.length > 80) string_8_ = string_8_.substring(0, 80)
                anInt1157++
                val class348_sub47 = method2148(Class143.aClass351_1987, (Class348_Sub23_Sub2.aClass77_9029), -117)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, (method1745(string, -65) + 2 + method1745(string_8_, -65)))
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeString((-5).toByte(), string)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, i_9_ - 1)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeByte(false, i_10_)
                class348_sub47.aClass348_Sub49_Sub2_7116!!!!.writeString((-5).toByte(), string_8_)
                Class348_Sub42_Sub14.method3243(-85, class348_sub47)
                return
            }
            if (i == 5003) {
                val i_11_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_11_)
                var string = ""
                if (class147 != null && class147.aString2028 != null) string = class147.aString2028!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5004) {
                val i_12_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_12_)
                var i_13_ = -1
                if (class147 != null) i_13_ = class147.anInt2032
                anIntArray1149!![anInt1173++] = i_13_
                return
            }
            if (i == 5005) {
                if (Class57.aClass227_1055 == null) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = Class57.aClass227_1055!!.anInt2970
                    return
                }
                return
            }
            if (i == 5006) {
                val i_14_ = anIntArray1149!![--anInt1173]
                val class348_sub47 = method2148(Class348_Sub31.aClass351_6925, (Class348_Sub23_Sub2.aClass77_9029), -100)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i_14_)
                Class348_Sub42_Sub14.method3243(-70, class348_sub47)
                return
            }
            if (i == 5008) {
                val string = aStringArray1152!![--anInt1170]!!
                method707(string, i)
                return
            }
            if (i == 5009) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]
                val string_15_ = aStringArray1152!![anInt1170 + 1]
                if (Class192.anInt2581 != 0 || ((!Class348_Sub40_Sub3.aBoolean9103 || Class133.aBoolean1915) && !Class50_Sub2.aBoolean5233)) {
                    anInt1159++
                    val class348_sub47 = method2148((Class348_Sub40_Sub22.aClass351_9304), (Class348_Sub23_Sub2.aClass77_9029), -116)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                    val i_16_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string!!)
                    method3544((class348_sub47.aClass348_Sub49_Sub2_7116!!), -70, string_15_)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(109, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_16_)
                    Class348_Sub42_Sub14.method3243(2, class348_sub47)
                    return
                }
                return
            }
            if (i == 5010) {
                val i_17_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_17_)
                var string = ""
                if (class147 != null && class147.aString2024 != null) string = class147.aString2024!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5011) {
                val i_18_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_18_)
                var string = ""
                if (class147 != null && class147.aString2022 != null) string = class147.aString2022!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5012) {
                val i_19_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_19_)
                var i_20_ = -1
                if (class147 != null) i_20_ = class147.anInt2026
                anIntArray1149!![anInt1173++] = i_20_
                return
            }
            if (i == 5015) {
                val string: String?
                if (Class132.aPlayer_1907 != null && (Class132.aPlayer_1907!!.aString10537) != null) string = Class132.aPlayer_1907!!.method2456(true, 255)
                else string = ""
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5016) {
                anIntArray1149!![anInt1173++] = Class290.anInt3713
                return
            }
            if (i == 5017) {
                anIntArray1149!![anInt1173++] = method2749(-1)
                return
            }
            if (i == 5018) {
                val i_21_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_21_)
                var i_22_ = 0
                if (class147 != null) i_22_ = class147.anInt2027
                anIntArray1149!![anInt1173++] = i_22_
                return
            }
            if (i == 5019) {
                val i_23_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_23_)
                var string = ""
                if (class147 != null && class147.aString2033 != null) string = class147.aString2033!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5020) {
                val string: String?
                if (Class132.aPlayer_1907 != null && (Class132.aPlayer_1907!!.aString10537) != null) string = Class132.aPlayer_1907!!.method2450(false, -78)
                else string = ""
                aStringArray1152!![anInt1170++] = string!!
                return
            }
            if (i == 5023) {
                val i_24_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_24_)
                var i_25_ = -1
                if (class147 != null) i_25_ = class147.anInt2031
                anIntArray1149!![anInt1173++] = i_25_
                return
            }
            if (i == 5024) {
                val i_26_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_26_)
                var i_27_ = -1
                if (class147 != null) i_27_ = class147.anInt2030
                anIntArray1149!![anInt1173++] = i_27_
                return
            }
            if (i == 5025) {
                val i_28_ = anIntArray1149!![--anInt1173]
                val class147 = method3985(-101, i_28_)
                var string = ""
                if (class147 != null && class147.aString2025 != null) string = class147.aString2025!!
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5050) {
                val i_29_ = anIntArray1149!![--anInt1173]
                aStringArray1152!![anInt1170++] = (Class200.aClass226_2639!!.method1625(0, i_29_).aString9587)
                return
            }
            if (i == 5051) {
                val i_30_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub11 = Class200.aClass226_2639!!.method1625(0, i_30_)
                if ((class348_sub42_sub11.anIntArray9592) == null) anIntArray1149!![anInt1173++] = 0
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub11!!.anIntArray9592!!).size
                    return
                }
                return
            }
            if (i == 5052) {
                anInt1173 -= 2
                val i_31_ = anIntArray1149!![anInt1173]
                val i_32_ = anIntArray1149!![anInt1173 + 1]
                val class348_sub42_sub11 = Class200.aClass226_2639!!.method1625(0, i_31_)
                val i_33_ = (class348_sub42_sub11.anIntArray9592!![i_32_])
                anIntArray1149!![anInt1173++] = i_33_
                return
            }
            if (i == 5053) {
                val i_34_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub11 = Class200.aClass226_2639!!.method1625(0, i_34_)
                if ((class348_sub42_sub11.anIntArray9580) == null) anIntArray1149!![anInt1173++] = 0
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub11!!.anIntArray9580!!).size
                    return
                }
                return
            }
            if (i == 5054) {
                anInt1173 -= 2
                val i_35_ = anIntArray1149!![anInt1173]
                val i_36_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = (Class200.aClass226_2639!!.method1625(0, i_35_).anIntArray9580!![i_36_]!!)
                return
            }
            if (i == 5055) {
                val i_37_ = anIntArray1149!![--anInt1173]
                aStringArray1152!![anInt1170++] = Class239_Sub6.aClass355_5900!!.method3471(i_37_, (-112).toByte()).method3219(127)
                return
            }
            if (i == 5056) {
                val i_38_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub10 = Class239_Sub6.aClass355_5900!!.method3471(i_38_, (-125).toByte())
                if ((class348_sub42_sub10.anIntArray9566) == null) anIntArray1149!![anInt1173++] = 0
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub10.anIntArray9566!!).size
                    return
                }
                return
            }
            if (i == 5057) {
                anInt1173 -= 2
                val i_39_ = anIntArray1149!![anInt1173]
                val i_40_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = (Class239_Sub6.aClass355_5900!!.method3471(i_39_, (-126).toByte()).anIntArray9566!![i_40_])
                return
            }
            if (i == 5058) {
                aClass43_1151 = Class43()
                aClass43_1151!!.anInt615 = anIntArray1149!![--anInt1173]
                aClass43_1151!!.aClass348_Sub42_Sub10_614 = Class239_Sub6.aClass355_5900!!.method3471((aClass43_1151!!.anInt615), (-87).toByte())
                aClass43_1151!!.anIntArray617 = IntArray(aClass43_1151!!.aClass348_Sub42_Sub10_614!!.method3215((-48).toByte()))
                return
            }
            if (i == 5059) {
                anInt1165++
                val class348_sub47 = method2148(Class45.aClass351_643, (Class348_Sub23_Sub2.aClass77_9029), -93)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                val i_41_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), aClass43_1151!!.anInt615)
                aClass43_1151!!.aClass348_Sub42_Sub10_614!!.method3210(12.toByte(), aClass43_1151!!.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116!!))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(115, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_41_)
                Class348_Sub42_Sub14.method3243(127, class348_sub47)
                return
            }
            if (i == 5060) {
                val string = aStringArray1152!![--anInt1170]
                anInt1166++
                val class348_sub47 = method2148(Class155.aClass351_2109, (Class348_Sub23_Sub2.aClass77_9029), -89)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                val i_42_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string!!)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), aClass43_1151!!.anInt615)
                aClass43_1151!!.aClass348_Sub42_Sub10_614!!.method3210((-125).toByte(), aClass43_1151!!.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116!!))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(102, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_42_)
                Class348_Sub42_Sub14.method3243(127, class348_sub47)
                return
            }
            if (i == 5061) {
                anInt1165++
                val class348_sub47 = method2148(Class45.aClass351_643, (Class348_Sub23_Sub2.aClass77_9029), -104)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                val i_43_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 1)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), aClass43_1151!!.anInt615)
                aClass43_1151!!.aClass348_Sub42_Sub10_614!!.method3210((-126).toByte(), aClass43_1151!!.anIntArray617, (class348_sub47.aClass348_Sub49_Sub2_7116!!))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(92, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_43_)
                Class348_Sub42_Sub14.method3243(-111, class348_sub47)
                return
            }
            if (i == 5062) {
                anInt1173 -= 2
                val i_44_ = anIntArray1149!![anInt1173]
                val i_45_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = (Class200.aClass226_2639!!.method1625(0, i_44_).aCharArray9588[i_45_]).code
                return
            }
            if (i == 5063) {
                anInt1173 -= 2
                val i_46_ = anIntArray1149!![anInt1173]
                val i_47_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = (Class200.aClass226_2639!!.method1625(0, i_46_).aCharArray9582[i_47_]).code
                return
            }
            if (i == 5064) {
                anInt1173 -= 2
                val i_48_ = anIntArray1149!![anInt1173]
                val i_49_ = anIntArray1149!![anInt1173 + 1]
                if (i_49_ == -1) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = Class200.aClass226_2639!!.method1625(0, i_48_).method3226(i_49_.toChar(), 57249897)
                    return
                }
                return
            }
            if (i == 5065) {
                anInt1173 -= 2
                val i_50_ = anIntArray1149!![anInt1173]
                val i_51_ = anIntArray1149!![anInt1173 + 1]
                if (i_51_ == -1) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = Class200.aClass226_2639!!.method1625(0, i_50_).method3222((-122).toByte(), i_51_.toChar())
                    return
                }
                return
            }
            if (i == 5066) {
                val i_52_ = anIntArray1149!![--anInt1173]
                anIntArray1149!![anInt1173++] = Class239_Sub6.aClass355_5900!!.method3471(i_52_, (-123).toByte()).method3215((-127).toByte())
                return
            }
            if (i == 5067) {
                anInt1173 -= 2
                val i_53_ = anIntArray1149!![anInt1173]
                val i_54_ = anIntArray1149!![anInt1173 + 1]
                val i_55_ = Class239_Sub6.aClass355_5900!!.method3471(i_53_, (-127).toByte()).method3212(0, i_54_)!!.anInt1941
                anIntArray1149!![anInt1173++] = i_55_
                return
            }
            if (i == 5068) {
                anInt1173 -= 2
                val i_56_ = anIntArray1149!![anInt1173]
                val i_57_ = anIntArray1149!![anInt1173 + 1]
                aClass43_1151!!.anIntArray617!![i_56_] = i_57_
                return
            }
            if (i == 5069) {
                anInt1173 -= 2
                val i_58_ = anIntArray1149!![anInt1173]
                val i_59_ = anIntArray1149!![anInt1173 + 1]
                aClass43_1151!!.anIntArray617!![i_58_] = i_59_
                return
            }
            if (i == 5070) {
                anInt1173 -= 3
                val i_60_ = anIntArray1149!![anInt1173]
                val i_61_ = anIntArray1149!![anInt1173 + 1]
                val i_62_ = anIntArray1149!![anInt1173 + 2]
                val class348_sub42_sub10 = Class239_Sub6.aClass355_5900!!.method3471(i_60_, (-127).toByte())
                if ((class348_sub42_sub10.method3212(0, i_61_)!!.anInt1941) != 0) throw RuntimeException("bad command")
                anIntArray1149!![anInt1173++] = class348_sub42_sub10.method3213(i_62_, i_61_, true)
                return
            }
            if (i == 5071) {
                val string = aStringArray1152!![--anInt1170]!!
                val bool_63_ = anIntArray1149!![--anInt1173] == 1
                method606(0, bool_63_, string)
                anIntArray1149!![anInt1173++] = Class76.anInt1285
                return
            }
            if (i == 5072) {
                if (Class192.aShortArray2579 == null || Class148.anInt2037 >= Class76.anInt1285) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = (Class192.aShortArray2579!![Class148.anInt2037++].toInt() and 0xffff)
                    return
                }
                return
            }
            if (i == 5073) {
                Class148.anInt2037 = 0
                return
            }
        } else if (i < 5200) {
            if (i == 5100) {
                if (Class182.aClass346_2449!!.method2696(86, -121)) anIntArray1149!![anInt1173++] = 1
                else {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                return
            }
            if (i == 5101) {
                if (Class182.aClass346_2449!!.method2696(82, -126)) anIntArray1149!![anInt1173++] = 1
                else {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                return
            }
            if (i == 5102) {
                if (Class182.aClass346_2449!!.method2696(81, -128)) anIntArray1149!![anInt1173++] = 1
                else {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                return
            }
        } else if (i < 5300) {
            if (i == 5200) {
                method312(anIntArray1149!![--anInt1173], 56.toByte())
                return
            }
            if (i == 5201) {
                anIntArray1149!![anInt1173++] = method244(37)
                return
            }
            if (i == 5205) {
                method298(false, -1, -1, anIntArray1149!![--anInt1173], -53)
                return
            }
            if (i == 5206) {
                val i_64_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class75.method766(i_64_ shr 14 and 0x3fff, i_64_ and 0x3fff)
                if (class348_sub42_sub14 == null) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub14.anInt9628)
                    return
                }
                return
            }
            if (i == 5207) {
                val class348_sub42_sub14 = Class75.method757(anIntArray1149!![--anInt1173])
                if (class348_sub42_sub14 == null || (class348_sub42_sub14.aString9632) == null) aStringArray1152!![anInt1170++] = ""
                else {
                    aStringArray1152!![anInt1170++] = (class348_sub42_sub14.aString9632)
                    return
                }
                return
            }
            if (i == 5208) {
                anIntArray1149!![anInt1173++] = Class25.anInt370
                anIntArray1149!![anInt1173++] = Class182.anInt2446
                return
            }
            if (i == 5209) {
                anIntArray1149!![anInt1173++] = Class348_Sub36.anInt6992 + Class75.anInt1266
                anIntArray1149!![anInt1173++] = Class245.anInt3170 + Class75.anInt1263
                return
            }
            if (i == 5210) {
                val i_65_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class75.method757(i_65_)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                } else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub14.anInt9640) shr 14 and 0x3fff
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub14.anInt9640) and 0x3fff
                    return
                }
                return
            }
            if (i == 5211) {
                val i_66_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class75.method757(i_66_)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                } else {
                    anIntArray1149!![anInt1173++] = ((class348_sub42_sub14.anInt9635) - (class348_sub42_sub14.anInt9644))
                    anIntArray1149!![anInt1173++] = ((class348_sub42_sub14.anInt9627) - (class348_sub42_sub14.anInt9643))
                    return
                }
                return
            }
            if (i == 5212) {
                val class348_sub21 = method199(1)
                if (class348_sub21 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                } else {
                    anIntArray1149!![anInt1173++] = class348_sub21.anInt6847
                    val i_67_ = (class348_sub21.anInt6850 shl 28 or ((class348_sub21.anInt6852 + Class75.anInt1266) shl 14) or (class348_sub21.anInt6851 + Class75.anInt1263))
                    anIntArray1149!![anInt1173++] = i_67_
                    return
                }
                return
            }
            if (i == 5213) {
                val class348_sub21 = Class356.method3479(-1)
                if (class348_sub21 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                } else {
                    anIntArray1149!![anInt1173++] = class348_sub21.anInt6847
                    val i_68_ = (class348_sub21.anInt6850 shl 28 or ((class348_sub21.anInt6852 + Class75.anInt1266) shl 14) or (class348_sub21.anInt6851 + Class75.anInt1263))
                    anIntArray1149!![anInt1173++] = i_68_
                    return
                }
                return
            }
            if (i == 5214) {
                val i_69_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class163.method1269(-17096)
                if (class348_sub42_sub14 != null) {
                    val bool_70_ = class348_sub42_sub14.method3236(anIntArray1175!!, i_69_ shr 14 and 0x3fff, i_69_ and 0x3fff, i_69_ shr 28 and 0x3, (-28).toByte())
                    if (bool_70_) method2839(anIntArray1175!![1], -17, anIntArray1175!![2])
                }
                return
            }
            if (i == 5215) {
                anInt1173 -= 2
                val i_71_ = anIntArray1149!![anInt1173]
                val i_72_ = anIntArray1149!![anInt1173 + 1]
                val class107 = Class75.method767(i_71_ shr 14 and 0x3fff, i_71_ and 0x3fff)
                var bool_73_ = false
                var class348_sub42_sub14 = class107.method1011(-48) as? Class348_Sub42_Sub14?
                while (class348_sub42_sub14 != null) {
                    if (class348_sub42_sub14.anInt9628 == i_72_) {
                        bool_73_ = true
                        break
                    }
                    class348_sub42_sub14 = (class107.method1003(113.toByte()) as? Class348_Sub42_Sub14?)
                }
                if (bool_73_) anIntArray1149!![anInt1173++] = 1
                else {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                return
            }
            if (i == 5218) {
                val i_74_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class75.method757(i_74_)
                if (class348_sub42_sub14 == null) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = (class348_sub42_sub14.anInt9631)
                    return
                }
                return
            }
            if (i == 5220) {
                anIntArray1149!![anInt1173++] = if (Class348.anInt4290 == 100) 1 else 0
                return
            }
            if (i == 5221) {
                val i_75_ = anIntArray1149!![--anInt1173]
                method2839(i_75_ shr 14 and 0x3fff, -17, i_75_ and 0x3fff)
                return
            }
            if (i == 5222) {
                val class348_sub42_sub14 = Class163.method1269(-17096)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                    return
                } else {
                    val bool_76_ = (class348_sub42_sub14.method3239(true, Class245.anInt3170 + Class75.anInt1263, Class348_Sub36.anInt6992 + Class75.anInt1266, anIntArray1175!!))
                    if (bool_76_) {
                        anIntArray1149!![anInt1173++] = anIntArray1175!![1]
                        anIntArray1149!![anInt1173++] = anIntArray1175!![2]
                    } else {
                        anIntArray1149!![anInt1173++] = -1
                        anIntArray1149!![anInt1173++] = -1
                    }
                }
                return
            }
            if (i == 5223) {
                anInt1173 -= 2
                val i_77_ = anIntArray1149!![anInt1173]
                val i_78_ = anIntArray1149!![anInt1173 + 1]
                method298(false, i_78_ and 0x3fff, i_78_ shr 14 and 0x3fff, i_77_, -53)
                return
            }
            if (i == 5224) {
                val i_79_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class163.method1269(-17096)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                    return
                } else {
                    val bool_80_ = class348_sub42_sub14.method3236(anIntArray1175!!, i_79_ shr 14 and 0x3fff, i_79_ and 0x3fff, i_79_ shr 28 and 0x3, (-28).toByte())
                    if (bool_80_) {
                        anIntArray1149!![anInt1173++] = anIntArray1175!![1]
                        anIntArray1149!![anInt1173++] = anIntArray1175!![2]
                    } else {
                        anIntArray1149!![anInt1173++] = -1
                        anIntArray1149!![anInt1173++] = -1
                    }
                }
                return
            }
            if (i == 5225) {
                val i_81_ = anIntArray1149!![--anInt1173]
                val class348_sub42_sub14 = Class163.method1269(-17096)
                if (class348_sub42_sub14 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = -1
                    return
                } else {
                    val bool_82_ = class348_sub42_sub14.method3239(true, i_81_ and 0x3fff, i_81_ shr 14 and 0x3fff, anIntArray1175!!)
                    if (bool_82_) {
                        anIntArray1149!![anInt1173++] = anIntArray1175!![1]
                        anIntArray1149!![anInt1173++] = anIntArray1175!![2]
                    } else {
                        anIntArray1149!![anInt1173++] = -1
                        anIntArray1149!![anInt1173++] = -1
                    }
                }
                return
            }
            if (i == 5226) {
                method1129(anIntArray1149!![--anInt1173], 100)
                return
            }
            if (i == 5227) {
                anInt1173 -= 2
                val i_83_ = anIntArray1149!![anInt1173]
                val i_84_ = anIntArray1149!![anInt1173 + 1]
                method298(true, i_84_ and 0x3fff, i_84_ shr 14 and 0x3fff, i_83_, -62)
                return
            }
            if (i == 5228) {
                Class348_Sub1_Sub1.aBoolean8805 = anIntArray1149!![--anInt1173] == 1
                return
            }
            if (i == 5229) {
                anIntArray1149!![anInt1173++] = if (Class348_Sub1_Sub1.aBoolean8805) 1 else 0
                return
            }
            if (i == 5230) {
                val i_85_ = anIntArray1149!![--anInt1173]
                Class27.method314((-74).toByte(), i_85_)
                return
            }
            if (i == 5231) {
                anInt1173 -= 2
                val i_86_ = anIntArray1149!![anInt1173]
                val bool_87_ = anIntArray1149!![anInt1173 + 1] == 1
                if (Class348_Sub42_Sub9_Sub1.aClass356_10442 != null) {
                    var class348 = Class348_Sub42_Sub9_Sub1.aClass356_10442!!.method3480(i_86_.toLong(), -6008)
                    if (class348 != null && !bool_87_) class348.method2715(48.toByte())
                    else if (class348 == null && bool_87_) {
                        class348 = Class348()
                        Class348_Sub42_Sub9_Sub1.aClass356_10442!!.method3483(29.toByte(), i_86_.toLong(), class348)
                    }
                }
                return
            }
            if (i == 5232) {
                val i_88_ = anIntArray1149!![--anInt1173]
                if (Class348_Sub42_Sub9_Sub1.aClass356_10442 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else {
                    val class348 = Class348_Sub42_Sub9_Sub1.aClass356_10442!!.method3480(i_88_.toLong(), -6008)
                    anIntArray1149!![anInt1173++] = if (class348 != null) 1 else 0
                }
                return
            }
            if (i == 5233) {
                anInt1173 -= 2
                val i_89_ = anIntArray1149!![anInt1173]
                val bool_90_ = anIntArray1149!![anInt1173 + 1] == 1
                if (Class158.aClass356_4934 != null) {
                    var class348 = Class158.aClass356_4934!!.method3480(i_89_.toLong(), -6008)
                    if (class348 != null && !bool_90_) class348.method2715(83.toByte())
                    else if (class348 == null && bool_90_) {
                        class348 = Class348()
                        Class158.aClass356_4934!!.method3483(112.toByte(), i_89_.toLong(), class348)
                    }
                }
                return
            }
            if (i == 5234) {
                val i_91_ = anIntArray1149!![--anInt1173]
                if (Class158.aClass356_4934 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else {
                    val class348 = Class158.aClass356_4934!!.method3480(i_91_.toLong(), -6008)
                    anIntArray1149!![anInt1173++] = if (class348 != null) 1 else 0
                }
                return
            }
            if (i == 5235) {
                anIntArray1149!![anInt1173++] = (if (Class75.aClass348_Sub42_Sub14_1243 != null) Class75.aClass348_Sub42_Sub14_1243!!.anInt9628 else -1)
                return
            }
            if (i == 5236) {
                anInt1173 -= 2
                val i_92_ = anIntArray1149!![anInt1173]
                val i_93_ = anIntArray1149!![anInt1173 + 1]
                val i_94_ = i_93_ shr 14 and 0x3fff
                val i_95_ = i_93_ and 0x3fff
                val i_96_ = method1754(true, i_92_, i_94_, i_95_)
                if (i_96_ < 0) anIntArray1149!![anInt1173++] = -1
                else {
                    anIntArray1149!![anInt1173++] = i_96_
                    return
                }
                return
            }
            if (i == 5237) {
                Class130_Sub1.method1134(86)
                return
            }
        } else if (i < 5400) {
            if (i == 5300) {
                anInt1173 -= 2
                val i_97_ = anIntArray1149!![anInt1173]
                val i_98_ = anIntArray1149!![anInt1173 + 1]
                Class85.method830(3, i_97_, 102.toByte(), false, i_98_)
                anIntArray1149!![anInt1173++] = if (Class34.aFrame476 != null) 1 else 0
                return
            }
            if (i == 5301) {
                if (Class34.aFrame476 != null) Class85.method830(Class316.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
                return
            }
            if (i == 5302) {
                val class57s = Class318_Sub9_Sub1.method2515(1494)!!
                anIntArray1149!![anInt1173++] = class57s.size
                return
            }
            if (i == 5303) {
                val i_99_ = anIntArray1149!![--anInt1173]
                val class57s = Class318_Sub9_Sub1.method2515(1494)!!
                anIntArray1149!![anInt1173++] = class57s[i_99_]!!.anInt1047
                anIntArray1149!![anInt1173++] = class57s[i_99_]!!.anInt1054
                return
            }
            if (i == 5305) {
                val i_100_ = Class346.anInt4276
                val i_101_ = Class239_Sub8.anInt5911
                var i_102_ = -1
                val class57s = Class318_Sub9_Sub1.method2515(1494)!!
                for (i_103_ in class57s.indices) {
                    val class57 = class57s[i_103_]!!
                    if (class57.anInt1047 == i_100_ && class57.anInt1054 == i_101_) {
                        i_102_ = i_103_
                        break
                    }
                }
                anIntArray1149!![anInt1173++] = i_102_
                return
            }
            if (i == 5306) {
                anIntArray1149!![anInt1173++] = Class348_Sub42_Sub12.method3229(-126)
                return
            }
            if (i == 5307) {
                val i_104_ = anIntArray1149!![--anInt1173]
                if (i_104_ >= 1 && i_104_ <= 2) {
                    Class85.method830(i_104_, -1, 102.toByte(), false, -1)
                    return
                }
                return
            }
            if (i == 5308) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350)
                return
            }
            if (i == 5309) {
                val i_105_ = anIntArray1149!![--anInt1173]
                if (i_105_ >= 1 && i_105_ <= 2) {
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!), i_105_)
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub8_7254), i_105_)
                    method243(37)
                    return
                }
                return
            }
        } else if (i < 5500) {
            if (i == 5400) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                val string_106_ = aStringArray1152!![anInt1170 + 1]!!
                val i_107_ = anIntArray1149!![--anInt1173]
                anInt1171++
                val class348_sub47 = method2148((Class348_Sub40_Sub17.aClass351_9234), (Class348_Sub23_Sub2.aClass77_9029), -101)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, (method1745(string, -65) + method1745(string_106_, -65) + 1))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string_106_)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i_107_)
                Class348_Sub42_Sub14.method3243(-66, class348_sub47)
                return
            }
            if (i == 5401) {
                anInt1173 -= 2
                Class318_Sub6.aShortArray6428!![anIntArray1149!![anInt1173]] = method160(27076, anIntArray1149!![anInt1173 + 1]).toShort()
                Exception_Sub1.aClass255_112!!.method1930(-21804)
                Exception_Sub1.aClass255_112!!.method1936(-71)
                Class189.aClass278_2529!!.method2074(-118)
                Class354.method3466(125)
                return
            }
            if (i == 5405) {
                anInt1173 -= 2
                val i_108_ = anIntArray1149!![anInt1173]
                val i_109_ = anIntArray1149!![anInt1173 + 1]
                if (i_108_ >= 0 && i_108_ < 2) Class348_Sub43.anIntArrayArrayArray7079!![i_108_] = Array<IntArray?>(i_109_ shl 1) { IntArray(4) }
                return
            }
            if (i == 5406) {
                anInt1173 -= 7
                val i_110_ = anIntArray1149!![anInt1173]
                val i_111_ = anIntArray1149!![anInt1173 + 1] shl 1
                val i_112_ = anIntArray1149!![anInt1173 + 2]
                val i_113_ = anIntArray1149!![anInt1173 + 3]
                val i_114_ = anIntArray1149!![anInt1173 + 4]
                val i_115_ = anIntArray1149!![anInt1173 + 5]
                val i_116_ = anIntArray1149!![anInt1173 + 6]
                if (i_110_ >= 0 && i_110_ < 2 && Class348_Sub43.anIntArrayArrayArray7079!![i_110_] != null && i_111_ >= 0 && i_111_ < (Class348_Sub43.anIntArrayArrayArray7079!![i_110_]!!).size) {
                    Class348_Sub43.anIntArrayArrayArray7079!![i_110_]!![i_111_] = intArrayOf((i_112_ shr 14 and 0x3fff) shl 9, i_113_ shl 2, (i_112_ and 0x3fff) shl 9, i_116_)
                    Class348_Sub43.anIntArrayArrayArray7079!![i_110_]!![i_111_ + 1] = intArrayOf((i_114_ shr 14 and 0x3fff) shl 9, i_115_ shl 2, (i_114_ and 0x3fff) shl 9)
                }
                return
            }
            if (i == 5407) {
                val i_117_ = ((Class348_Sub43.anIntArrayArrayArray7079!![anIntArray1149!![--anInt1173]]!!).size shr 1)
                anIntArray1149!![anInt1173++] = i_117_
                return
            }
            if (i == 5411) {
                if (Class34.aFrame476 != null) Class85.method830(Class316.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
                if (Class52.aFrame4904 == null) {
                    val string = (if (Class116.aString1761 != null) Class116.aString1761 else method2162(false))
                    Class179.method1360(string, Class348_Sub23_Sub1.aClass297_8992, Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 1, false, -47)
                    return
                } else {
                    method2405(97)
                    System.exit(0)
                }
                return
            }
            if (i == 5419) {
                var string: String? = ""
                if (Class348_Sub42_Sub6.aClass144_9536 != null) {
                    if (Class348_Sub42_Sub6.aClass144_9536!!.anObject1998 != null) string = (Class348_Sub42_Sub6.aClass144_9536!!.anObject1998) as String?
                    else string = Class235.method1669(-19918, (Class348_Sub42_Sub6.aClass144_9536!!.anInt2000))
                }
                aStringArray1152!![anInt1170++] = string!!
                return
            }
            if (i == 5420) {
                anIntArray1149!![anInt1173++] = if (Class348_Sub23_Sub1.aClass297_8992!!.aBoolean3777) 0 else 1
                return
            }
            if (i == 5421) {
                if (Class34.aFrame476 != null) Class85.method830(Class316.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
                val string = aStringArray1152!![--anInt1170]
                val bool_118_ = anIntArray1149!![--anInt1173] == 1
                val string_119_ = method2162(false) + string
                Class179.method1360(string_119_, Class348_Sub23_Sub1.aClass297_8992, Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 1, bool_118_, 104)
                return
            }
            if (i == 5422) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                val string_120_ = aStringArray1152!![anInt1170 + 1]!!
                val i_121_ = anIntArray1149!![--anInt1173]
                if (string.length > 0) {
                    if (Class367_Sub9.aStringArray7378 == null) Class367_Sub9.aStringArray7378 = arrayOfNulls<String>((Class272.anIntArray3475!![Class348_Sub42_Sub8_Sub2.aClass230_10434!!.anInt2987]))
                    Class367_Sub9.aStringArray7378!![i_121_] = string
                }
                if (string_120_.length > 0) {
                    if (Class54.aStringArray974 == null) Class54.aStringArray974 = arrayOfNulls<String>((Class272.anIntArray3475!![Class348_Sub42_Sub8_Sub2.aClass230_10434!!.anInt2987]))
                    Class54.aStringArray974!![i_121_] = string_120_
                }
                return
            }
            if (i == 5423) {
                println(aStringArray1152!![--anInt1170])
                return
            }
            if (i == 5424) {
                anInt1173 -= 11
                Class264.anInt3376 = anIntArray1149!![anInt1173]
                Class51.anInt948 = anIntArray1149!![anInt1173 + 1]
                Class264.anInt3374 = anIntArray1149!![anInt1173 + 2]
                Class348_Sub42_Sub4.anInt9511 = anIntArray1149!![anInt1173 + 3]
                Class231.anInt2996 = anIntArray1149!![anInt1173 + 4]
                Class348_Sub40_Sub16.anInt9231 = anIntArray1149!![anInt1173 + 5]
                Class318_Sub1_Sub3_Sub3.anInt10257 = anIntArray1149!![anInt1173 + 6]
                Class313.anInt3937 = anIntArray1149!![anInt1173 + 7]
                Class79.anInt1387 = anIntArray1149!![anInt1173 + 8]
                Class348_Sub42_Sub11.anInt9586 = anIntArray1149!![anInt1173 + 9]
                Class5_Sub2.anInt8363 = anIntArray1149!![anInt1173 + 10]
                Class21.aClass45_322!!.method421(false, Class231.anInt2996)
                Class21.aClass45_322!!.method421(false, Class348_Sub40_Sub16.anInt9231)
                Class21.aClass45_322!!.method421(false, Class318_Sub1_Sub3_Sub3.anInt10257)
                Class21.aClass45_322!!.method421(false, Class313.anInt3937)
                Class21.aClass45_322!!.method421(false, Class79.anInt1387)
                Class174.aClass105_2309 = null
                Class110.aClass105_1706 = Class174.aClass105_2309
                Class348_Sub42_Sub15.aClass105_9659 = Class110.aClass105_1706
                Class348_Sub5.aClass105_6627 = null
                Class121.aClass105_1800 = Class348_Sub5.aClass105_6627
                OutputStream_Sub2.aClass105_106 = Class121.aClass105_1800
                Class309.aClass105_4808 = null
                Class348_Sub42_Sub15.aClass105_9658 = Class309.aClass105_4808
                Class71.aBoolean1211 = true
                return
            }
            if (i == 5425) {
                Class274.method2061(12)
                Class71.aBoolean1211 = false
                return
            }
            if (i == 5426) {
                anInt1173 -= 2
                Class348_Sub42_Sub16_Sub1.anInt10447 = anIntArray1149!![anInt1173]
                Class38.anInt506 = anIntArray1149!![anInt1173 + 1]
                return
            }
            if (i == 5427) {
                anInt1173 -= 2
                Class286_Sub8.anInt6299 = anIntArray1149!![anInt1173 + 1]
                return
            }
            if (i == 5428) {
                anInt1173 -= 2
                val i_122_ = anIntArray1149!![anInt1173]
                val i_123_ = anIntArray1149!![anInt1173 + 1]
                anIntArray1149!![anInt1173++] = if (Class318_Sub1_Sub3.method2410((-49).toByte(), i_123_, i_122_)) 1 else 0
                return
            }
            if (i == 5429) {
                Class82.method812(aStringArray1152!![--anInt1170], false, false, (-79).toByte())
                return
            }
            if (i == 5430) {
                try {
                    Class224.method1617(125.toByte(), Class93.anApplet1530, "accountcreated")
                } catch (throwable: Throwable) {
                    /* empty */
                }
                return
            }
            if (i == 5431) {
                try {
                    Class224.method1617(125.toByte(), Class93.anApplet1530, "accountcreatestarted")
                } catch (throwable: Throwable) {
                    /* empty */
                }
                return
            }
            if (i == 5432) {
                var string = ""
                if (Class348_Sub40_Sub27.aClipboard9357 != null) {
                    val transferable = Class348_Sub40_Sub27.aClipboard9357!!.getContents(null)
                    if (transferable != null) {
                        try {
                            string = (transferable.getTransferData(DataFlavor.stringFlavor)) as String
                            if (string == null) string = ""
                        } catch (exception: Exception) {
                            /* empty */
                        }
                    }
                }
                aStringArray1152!![anInt1170++] = string
                return
            }
            if (i == 5433) {
                Class332.anInt4143 = anIntArray1149!![--anInt1173]
                return
            }
        } else if (i < 5600) {
            if (i == 5500) {
                anInt1173 -= 4
                val i_124_ = anIntArray1149!![anInt1173]
                val i_125_ = anIntArray1149!![anInt1173 + 1]
                val i_126_ = anIntArray1149!![anInt1173 + 2]
                val i_127_ = anIntArray1149!![anInt1173 + 3]
                method1844(i_126_, ((i_124_ shr 14 and 0x3fff) - za_Sub2.regionTileX), false, i_125_ shl 2, false, i_127_, ((i_124_ and 0x3fff) - Class90.regionTileY))
                return
            }
            if (i == 5501) {
                anInt1173 -= 4
                val i_128_ = anIntArray1149!![anInt1173]
                val i_129_ = anIntArray1149!![anInt1173 + 1]
                val i_130_ = anIntArray1149!![anInt1173 + 2]
                val i_131_ = anIntArray1149!![anInt1173 + 3]
                Class348_Sub42_Sub12.method3231(((i_128_ and 0x3fff) - Class90.regionTileY), ((i_128_ shr 14 and 0x3fff) - za_Sub2.regionTileX), i_129_ shl 2, i_131_, i_130_, -128)
                return
            }
            if (i == 5502) {
                anInt1173 -= 6
                val i_132_ = anIntArray1149!![anInt1173]
                if (i_132_ >= 2) throw RuntimeException()
                za_Sub1.anInt9775 = i_132_
                val i_133_ = anIntArray1149!![anInt1173 + 1]
                if (i_133_ + 1 >= (Class348_Sub43.anIntArrayArrayArray7079!![za_Sub1.anInt9775])!!.size shr 1) throw RuntimeException()
                Class213.anInt2798 = i_133_
                Class117.anInt1780 = 0
                Class195.anInt5019 = anIntArray1149!![anInt1173 + 2]
                Class331.anInt4133 = anIntArray1149!![anInt1173 + 3]
                val i_134_ = anIntArray1149!![anInt1173 + 4]
                if (i_134_ >= 2) throw RuntimeException()
                Class292.anInt4803 = i_134_
                val i_135_ = anIntArray1149!![anInt1173 + 5]
                if (i_135_ + 1 >= (Class348_Sub43.anIntArrayArrayArray7079!![Class292.anInt4803]!!).size shr 1) throw RuntimeException()
                Class264.anInt3373 = i_135_
                Class348_Sub40_Sub21.anInt9282 = 3
                Class318_Sub1_Sub5_Sub2.anInt10163 = -1
                Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163
                return
            }
            if (i == 5503) {
                Class128.method1122(0)
                return
            }
            if (i == 5504) {
                anInt1173 -= 2
                method2396(anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1], 0, 3)
                return
            }
            if (i == 5505) {
                anIntArray1149!![anInt1173++] = Class76.aFloat1287.toInt() shr 3
                return
            }
            if (i == 5506) {
                anIntArray1149!![anInt1173++] = Class314.aFloat3938.toInt() shr 3
                return
            }
            if (i == 5507) {
                method326(68.toByte())
                return
            }
            if (i == 5508) {
                Class355.method3470(1)
                return
            }
            if (i == 5509) {
                method2153(-77)
                return
            }
            if (i == 5510) {
                method262(0)
                return
            }
            if (i == 5511) {
                val i_136_ = anIntArray1149!![--anInt1173]
                var i_137_ = i_136_ shr 14 and 0x3fff
                var i_138_ = i_136_ and 0x3fff
                i_137_ -= za_Sub2.regionTileX
                if (i_137_ < 0) i_137_ = 0
                else if (i_137_ >= Class367_Sub4.anInt7319) i_137_ = Class367_Sub4.anInt7319
                i_138_ -= Class90.regionTileY
                if (i_138_ < 0) i_138_ = 0
                else if (i_138_ >= Class348_Sub40_Sub3.anInt9109) i_138_ = Class348_Sub40_Sub3.anInt9109
                Class348_Sub6.anInt6633 = (i_137_ shl 9) + 256
                Class348_Sub7.anInt6652 = (i_138_ shl 9) + 256
                Class348_Sub40_Sub21.anInt9282 = 4
                Class318_Sub1_Sub5_Sub2.anInt10163 = -1
                Class9.anInt167 = Class318_Sub1_Sub5_Sub2.anInt10163
                return
            }
            if (i == 5512) {
                method1851(121.toByte())
                return
            }
            if (i == 5514) {
                Class132.anInt1911 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 5516) {
                anIntArray1149!![anInt1173++] = Class132.anInt1911
                return
            }
            if (i == 5517) {
                val i_139_ = anIntArray1149!![--anInt1173]
                if (i_139_ == -1) {
                    var i_140_ = i_139_ shr 14 and 0x3fff
                    var i_141_ = i_139_ and 0x3fff
                    i_140_ -= za_Sub2.regionTileX
                    if (i_140_ < 0) i_140_ = 0
                    else if (i_140_ >= Class367_Sub4.anInt7319) i_140_ = Class367_Sub4.anInt7319
                    i_141_ -= Class90.regionTileY
                    if (i_141_ < 0) i_141_ = 0
                    else if (i_141_ >= Class348_Sub40_Sub3.anInt9109) i_141_ = Class348_Sub40_Sub3.anInt9109
                    Class9.anInt167 = (i_140_ shl 9) + 256
                    Class318_Sub1_Sub5_Sub2.anInt10163 = (i_141_ shl 9) + 256
                } else {
                    Class9.anInt167 = -1
                    Class318_Sub1_Sub5_Sub2.anInt10163 = -1
                    return
                }
                return
            }
            if (i == 5547) {
                anIntArray1149!![anInt1173++] = if (Class348_Sub40_Sub21.anInt9282 == 1) 1 else 0
                return
            }
        } else if (i < 5700) {
            if (i == 5600) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                val string_142_ = aStringArray1152!![anInt1170 + 1]
                val i_143_ = anIntArray1149!![--anInt1173]
                if (string.length <= 320 && Class240.anInt4674 == 3 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    Class64_Sub3.aString5600 = string
                    Class186.aString2496 = string_142_
                    RuntimeException_Sub1.anInt4596 = i_143_
                    Class348_Sub49.method3379(2, 6)
                    return
                }
                return
            }
            if (i == 5601) {
                Class90.method854((-76).toByte())
                return
            }
            if (i == 5602) {
                if (Class225.anInt2955 == 0) {
                    Class107.anInt1645 = -2
                    Class348_Sub6.anInt6634 = -2
                }
                return
            }
            if (i == 5604) {
                anInt1170--
                if (Class240.anInt4674 == 3 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    Class281.method2106(aStringArray1152!![anInt1170], 101)
                    return
                }
                return
            }
            if (i == 5605) {
                anInt1170 -= 2
                anInt1173 -= 2
                if (Class240.anInt4674 == 3 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    method449(aStringArray1152!![anInt1170 + 1], aStringArray1152!![anInt1170], false, anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1] == 1)
                    return
                }
                return
            }
            if (i == 5606) {
                if (Class367_Sub2.anInt7297 == 0) Class352.anInt4337 = -2
                return
            }
            if (i == 5607) {
                anIntArray1149!![anInt1173++] = Class348_Sub6.anInt6634
                return
            }
            if (i == 5608) {
                anIntArray1149!![anInt1173++] = Class63.anInt1121
                return
            }
            if (i == 5609) {
                anIntArray1149!![anInt1173++] = Class352.anInt4337
                return
            }
            if (i == 5611) {
                anIntArray1149!![anInt1173++] = Class348_Sub42_Sub7.anInt9541
                return
            }
            if (i == 5612) {
                val i_144_ = anIntArray1149!![--anInt1173]
                if (Class240.anInt4674 == 7 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                        Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                        Class348_Sub40_Sub8.aClass238_9165 = null
                    }
                    RuntimeException_Sub1.anInt4596 = i_144_
                    Class348_Sub49.method3379(2, 9)
                    return
                }
                return
            }
            if (i == 5613) {
                anIntArray1149!![anInt1173++] = Class348_Sub6.anInt6634
                return
            }
            if (i == 5615) {
                anInt1170 -= 2
                val string = aStringArray1152!![anInt1170]!!
                val string_145_ = aStringArray1152!![anInt1170 + 1]
                if (string.length <= 320 && Class240.anInt4674 == 3 && (Class225.anInt2955 == 0 && Class367_Sub2.anInt7297 == 0)) {
                    if (Class348_Sub40_Sub8.aClass238_9165 != null) {
                        Class348_Sub40_Sub8.aClass238_9165!!.method1700(36.toByte())
                        Class348_Sub40_Sub8.aClass238_9165 = null
                    }
                    Class64_Sub3.aString5600 = string
                    Class186.aString2496 = string_145_
                    Class348_Sub49.method3379(2, 5)
                    return
                }
                return
            }
            if (i == 5616) {
                method3141(false, 11.toByte())
                return
            }
            if (i == 5617) {
                anIntArray1149!![anInt1173++] = Class107.anInt1645
                return
            }
            if (i == 5618) {
                anInt1173--
                return
            }
            if (i == 5619) {
                anInt1173--
                return
            }
            if (i == 5620) {
                anIntArray1149!![anInt1173++] = 0
                return
            }
            if (i == 5621) {
                anInt1170 -= 2
                anInt1173 -= 2
                return
            }
            if (i == 5622) return
            if (i == 5623) {
                if (Class348_Sub23_Sub3.aString9043 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else anIntArray1149!![anInt1173++] = 1
                return
            }
            if (i == 5624) {
                anIntArray1149!![anInt1173++] = (Class244.aLong4615 shr 32).toInt()
                anIntArray1149!![anInt1173++] = (Class244.aLong4615 and 0xffffL).toInt()
                return
            }
            if (i == 5625) {
                anIntArray1149!![anInt1173++] = if (Class330.aBoolean4127) 1 else 0
                return
            }
            if (i == 5626) {
                Class330.aBoolean4127 = true
                method2172(84)
                return
            }
        } else if (i < 6100) {
            if (i == 6001) {
                val i_146_ = anIntArray1149!![--anInt1173]
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!), i_146_)
                Class348_Sub20.method2953((-126).toByte())
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6002) {
                val bool_147_ = anIntArray1149!![--anInt1173] == 1
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7255), if (bool_147_) 1 else 0)
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261), if (bool_147_) 1 else 0)
                Class348_Sub20.method2953((-122).toByte())
                method3072(32.toByte())
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6003) {
                val bool_148_ = anIntArray1149!![--anInt1173] == 1
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7250), if (bool_148_) 2 else 1)
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7264), if (bool_148_) 2 else 1)
                Class348_Sub40_Sub9.method3072((-106).toByte())
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6005) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                Class348_Sub20.method2953((-111).toByte())
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6007) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub13_7236), anIntArray1149!![--anInt1173])
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6008) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub1_7246), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6010) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub21_7270), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6011) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238), anIntArray1149!![--anInt1173])
                Class348_Sub20.method2953((-116).toByte())
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6012) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub28_7230), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method3038(-1)
                Class76.method773(true)
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6014) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub18_7259), if (anIntArray1149!![--anInt1173] == 1) 2 else 0)
                Class348_Sub20.method2953((-112).toByte())
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6015) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub16_7247), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                Class348_Sub20.method2953((-127).toByte())
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6016) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7248), anIntArray1149!![--anInt1173])
                method3553(false, 112.toByte(), Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350))
                method243(37)
                return
            }
            if (i == 6017) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub5_7240), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method352(1)
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6018) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7272), anIntArray1149!![--anInt1173])
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6019) {
                val i_149_ = anIntArray1149!![--anInt1173]
                val i_150_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!!!.method1838(-32350)
                if (i_149_ != i_150_) {
                    if (Class334.method2653(true, Class240.anInt4674)) {
                        if (i_150_ == 0 && Class267.anInt3428 != -1) {
                            method2732(0, Class267.anInt3428, false, 94, (Class59_Sub2_Sub1.aClass45_8667), i_149_)
                            method3093(87)
                            Class74.Companion.aBoolean1236 = false
                        } else if (i_149_ == 0) {
                            Class104.method960(1)
                            Class74.Companion.aBoolean1236 = false
                        } else Class34.method345(i_149_, (-49).toByte())
                    }
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7260), i_149_)
                    method243(37)
                    r.aBoolean9719 = false
                }
                return
            }
            if (i == 6020) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7234), anIntArray1149!![--anInt1173])
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6021) {
                val i_151_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7250!!.method1778(-32350)
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7264), if (anIntArray1149!![--anInt1173] == 1) 0 else i_151_)
                Class348_Sub40_Sub9.method3072((-118).toByte())
                return
            }
            if (i == 6023) {
                val i_152_ = anIntArray1149!![--anInt1173]
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub15_7224), i_152_)
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6024) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7216), anIntArray1149!![--anInt1173])
                method243(37)
                return
            }
            if (i == 6025) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub6_7226), anIntArray1149!![--anInt1173])
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6027) {
                var i_153_ = anIntArray1149!![--anInt1173]
                if (i_153_ < 0 || i_153_ > 1) i_153_ = 0
                Class348_Sub40_Sub33.method3137(i_153_ == 1, (-24).toByte())
                return
            }
            if (i == 6028) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub22_7253), if (anIntArray1149!![--anInt1173] != 0) 1 else 0)
                method243(37)
                return
            }
            if (i == 6029) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub13_7236), anIntArray1149!![--anInt1173])
                method243(37)
                return
            }
            if (i == 6030) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub9_7256), if (anIntArray1149!![--anInt1173] != 0) 1 else 0)
                method243(37)
                Class348_Sub20.method2953((-116).toByte())
                return
            }
            if (i == 6031) {
                var i_154_ = anIntArray1149!![--anInt1173]
                if (i_154_ < 0 || i_154_ > 5) i_154_ = 2
                method3553(false, 101.toByte(), i_154_)
                return
            }
            if (i == 6032) {
                anInt1173 -= 2
                val i_155_ = anIntArray1149!![anInt1173]
                val bool_156_ = anIntArray1149!![anInt1173 + 1] == 1
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), i_155_)
                if (!bool_156_) Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub29_7229), 0)
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6033) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub17_7263), anIntArray1149!![--anInt1173])
                method243(37)
                return
            }
            if (i == 6034) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub24_7235), if (anIntArray1149!![--anInt1173] == 1) 1 else 0)
                method243(37)
                method3038(-1)
                r.aBoolean9719 = false
                return
            }
            if (i == 6035) {
                val i_157_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7255!!.method1840(-32350)
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261), if (anIntArray1149!![--anInt1173] == 1) 1 else i_157_)
                Class348_Sub20.method2953((-110).toByte())
                method3072(125.toByte())
                return
            }
            if (i == 6036) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub23_7231), anIntArray1149!![--anInt1173])
                method243(37)
                RuntimeException_Sub1.aBoolean4604 = true
                return
            }
            if (i == 6037) {
                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7215), anIntArray1149!![--anInt1173])
                method243(37)
                r.aBoolean9719 = false
                return
            }
            if (i == 6038) {
                val i_158_ = anIntArray1149!![--anInt1173]
                val i_159_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350)
                if (i_158_ != i_159_ && Class267.anInt3428 == Class345.anInt4270) {
                    if (!Class334.method2653(true, Class240.anInt4674)) {
                        if (i_159_ == 0) {
                            method2732(0, Class267.anInt3428, false, 127, (Class59_Sub2_Sub1.aClass45_8667), i_158_)
                            method3093(118)
                            Class74.Companion.aBoolean1236 = false
                        } else if (i_158_ == 0) {
                            Class104.method960(1)
                            Class74.Companion.aBoolean1236 = false
                        } else Class34.method345(i_158_, (-52).toByte())
                    }
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7245), i_158_)
                    method243(37)
                    r.aBoolean9719 = false
                }
                return
            }
            if (i == 6039) {
                var i_160_ = anIntArray1149!![--anInt1173]
                if (i_160_ > 255 || i_160_ < 0) i_160_ = 0
                if (i_160_ != Class316.aClass348_Sub51_3959!!.aClass239_Sub19_7257!!.method1805(-32350)) {
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub19_7257), i_160_)
                    method243(37)
                    r.aBoolean9719 = false
                }
                return
            }
            if (i == 6040) {
                val i_161_ = anIntArray1149!![--anInt1173]
                if (i_161_ != Class316.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350)) {
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub3_7222), i_161_)
                    method243(37)
                    r.aBoolean9719 = false
                    Class348_Sub42_Sub3.method3179(0)
                }
                return
            }
        } else if (i < 6200) {
            if (i == 6101) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!.method1764(-32350)
                return
            }
            if (i == 6102) {
                anIntArray1149!![anInt1173++] = (if (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7255!!.method1840(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6103) {
                anIntArray1149!![anInt1173++] = (if (Class316.aClass348_Sub51_3959!!.aClass239_Sub14_7250!!.method1778(-32350) == 2) 1 else 0)
                return
            }
            if (i == 6105) {
                anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1737(-32350) == 1) 1 else 0
                return
            }
            if (i == 6107) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub13_7236!!.method1776(-32350)
                return
            }
            if (i == 6108) {
                anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub1_7246!!.method1720(-32350) == 1) 1 else 0
                return
            }
            if (i == 6110) {
                anIntArray1149!![anInt1173++] = (if (Class316.aClass348_Sub51_3959!!.aClass239_Sub21_7270!!.method1812(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6111) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350)
                return
            }
            if (i == 6112) {
                anIntArray1149!![anInt1173++] = (if (Class316.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6114) {
                anIntArray1149!![anInt1173++] = (if (Class316.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1800(-32350) == 2) 1 else 0)
                return
            }
            if (i == 6115) {
                anIntArray1149!![anInt1173++] = (if (Class316.aClass348_Sub51_3959!!.aClass239_Sub16_7247!!.method1789(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6116) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(-32350)
                return
            }
            if (i == 6117) {
                anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub5_7240!!.method1739(-32350) == 1) 1 else 0
                return
            }
            if (i == 6118) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7272!!.method1838(-32350)
                return
            }
            if (i == 6119) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350)
                return
            }
            if (i == 6120) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7234!!.method1838(-32350)
                return
            }
            if (i == 6123) {
                anIntArray1149!![anInt1173++] = method197(false)
                return
            }
            if (i == 6124) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7216!!.method1808(-32350)
                return
            }
            if (i == 6125) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1743(-32350)
                return
            }
            if (i == 6127) {
                anIntArray1149!![anInt1173++] = (if (Class316.aClass348_Sub51_3959!!.aClass239_Sub12_7243!!!!.method1771(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6128) {
                anIntArray1149!![anInt1173++] = (if (Class316.aClass348_Sub51_3959!!.aClass239_Sub22_7253!!.method1815(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6129) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub13_7236!!.method1776(-32350)
                return
            }
            if (i == 6130) {
                anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub9_7256!!.method1759(-32350) == 1) 1 else 0
                return
            }
            if (i == 6131) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)
                return
            }
            if (i == 6132) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.method1829(-32350)
                return
            }
            if (i == 6133) {
                anIntArray1149!![anInt1173++] = if ((Class348_Sub23_Sub1.aClass297_8992!!.aBoolean3777) && !(Class348_Sub23_Sub1.aClass297_8992!!.aBoolean3794)) 1 else 0
                return
            }
            if (i == 6135) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub17_7263!!.method1798(-32350)
                return
            }
            if (i == 6136) {
                anIntArray1149!![anInt1173++] = (if (Class316.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1820(-32350) == 1) 1 else 0)
                return
            }
            if (i == 6138) {
                anIntArray1149!![anInt1173++] = method1781(Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350), -84, 200)
                return
            }
            if (i == 6139) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1818(-32350)
                return
            }
            if (i == 6142) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7215!!.method1838(-32350)
                return
            }
            if (i == 6143) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350)
                return
            }
            if (i == 6144) {
                anIntArray1149!![anInt1173++] = if (Class348_Sub23_Sub2.aBoolean9038) 1 else 0
                return
            }
            if (i == 6145) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub19_7257!!.method1805(-32350)
                return
            }
            if (i == 6146) {
                anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350)
                return
            }
            if (i == 6147) {
                anIntArray1149!![anInt1173++] = if (Class348_Sub40_Sub20.aClass348_Sub4_9264!!.anInt6609 < 512 || Class348_Sub23_Sub2.aBoolean9038 || Class139.aBoolean1952) 1 else 0
                return
            }
            if (i == 6148) {
                anIntArray1149!![anInt1173++] = if (Class304.aBoolean3847) 1 else 0
                return
            }
        } else if (i < 6300) {
            if (i == 6200) {
                anInt1173 -= 2
                Class110.aShort1700 = anIntArray1149!![anInt1173].toShort()
                if (Class110.aShort1700 <= 0) Class110.aShort1700 = 256.toShort()
                Class168.aShort2250 = anIntArray1149!![anInt1173 + 1].toShort()
                if (Class168.aShort2250 <= 0) Class168.aShort2250 = 205.toShort()
                return
            }
            if (i == 6201) {
                anInt1173 -= 2
                Class348_Sub23_Sub3.aShort9044 = anIntArray1149!![anInt1173].toShort()
                if (Class348_Sub23_Sub3.aShort9044 <= 0) Class348_Sub23_Sub3.aShort9044 = 256.toShort()
                Class320.aShort3992 = anIntArray1149!![anInt1173 + 1].toShort()
                if (Class320.aShort3992 <= 0) Class320.aShort3992 = 320.toShort()
                return
            }
            if (i == 6202) {
                anInt1173 -= 4
                Class348_Sub42_Sub8.aShort9555 = anIntArray1149!![anInt1173].toShort()
                if (Class348_Sub42_Sub8.aShort9555 <= 0) Class348_Sub42_Sub8.aShort9555 = 1.toShort()
                Class48.aShort851 = anIntArray1149!![anInt1173 + 1].toShort()
                if (Class48.aShort851 <= 0) Class48.aShort851 = 32767.toShort()
                else if (Class48.aShort851 < Class348_Sub42_Sub8.aShort9555) Class48.aShort851 = Class348_Sub42_Sub8.aShort9555
                Class367_Sub8.aShort7355 = anIntArray1149!![anInt1173 + 2].toShort()
                if (Class367_Sub8.aShort7355 <= 0) Class367_Sub8.aShort7355 = 1.toShort()
                Class171.aShort2269 = anIntArray1149!![anInt1173 + 3].toShort()
                if (Class171.aShort2269 <= 0) Class171.aShort2269 = 32767.toShort()
                else {
                    if (Class171.aShort2269 < Class367_Sub8.aShort7355) Class171.aShort2269 = Class367_Sub8.aShort7355
                    return
                }
                return
            }
            if (i == 6203) {
                Class348_Sub42_Sub3.method3174(0, 0, Class348_Sub1.aClass46_6561!!.anInt709, false, 74.toByte(), Class348_Sub1.aClass46_6561!!.anInt789)
                anIntArray1149!![anInt1173++] = Class127.anInt4656
                anIntArray1149!![anInt1173++] = Class280.anInt3643
                return
            }
            if (i == 6204) {
                anIntArray1149!![anInt1173++] = Class348_Sub23_Sub3.aShort9044.toInt()
                anIntArray1149!![anInt1173++] = Class320.aShort3992.toInt()
                return
            }
            if (i == 6205) {
                anIntArray1149!![anInt1173++] = Class110.aShort1700.toInt()
                anIntArray1149!![anInt1173++] = Class168.aShort2250.toInt()
                return
            }
        } else if (i < 6400) {
            if (i == 6300) {
                anIntArray1149!![anInt1173++] = (method599(-76) / 60000L).toInt()
                return
            }
            if (i == 6301) {
                anIntArray1149!![anInt1173++] = (method599(-77) / 86400000L).toInt() - 11745
                return
            }
            if (i == 6302) {
                anInt1173 -= 3
                val i_162_ = anIntArray1149!![anInt1173]
                val i_163_ = anIntArray1149!![anInt1173 + 1]
                val i_164_ = anIntArray1149!![anInt1173 + 2]
                aCalendar1160!!.clear()
                aCalendar1160!!.set(11, 12)
                aCalendar1160!!.set(i_164_, i_163_, i_162_)
                var i_165_ = ((aCalendar1160!!.getTime().getTime() / 86400000L).toInt() - 11745)
                if (i_164_ < 1970) i_165_--
                anIntArray1149!![anInt1173++] = i_165_
                return
            }
            if (i == 6303) {
                aCalendar1160!!.clear()
                aCalendar1160!!.setTime(Date(method599(-59)))
                anIntArray1149!![anInt1173++] = aCalendar1160!!.get(1)
                return
            }
            if (i == 6304) {
                val i_166_ = anIntArray1149!![--anInt1173]
                var bool_167_ = true
                if (i_166_ < 0) bool_167_ = (i_166_ + 1) % 4 == 0
                else if (i_166_ < 1582) bool_167_ = i_166_ % 4 == 0
                else if (i_166_ % 4 != 0) bool_167_ = false
                else if (i_166_ % 100 != 0) bool_167_ = true
                else if (i_166_ % 400 != 0) bool_167_ = false
                anIntArray1149!![anInt1173++] = if (bool_167_) 1 else 0
                return
            }
        } else if (i < 6500) {
            if (i == 6405) {
                anIntArray1149!![anInt1173++] = if (Class67.Companion.method717(-2511)) 1 else 0
                return
            }
            if (i == 6406) {
                anIntArray1149!![anInt1173++] = if (Class247.method1891(314376967)) 1 else 0
                return
            }
        } else if (i < 6600) {
            if (i == 6500) {
                if (Class240.anInt4674 != 7 || Class225.anInt2955 != 0 || Class367_Sub2.anInt7297 != 0) anIntArray1149!![anInt1173++] = 1
                else {
                    if (Class130.aBoolean1899) anIntArray1149!![anInt1173++] = 0
                    else {
                        if (Class240.aLong4683 > method599(-126) - 1000L) anIntArray1149!![anInt1173++] = 1
                        else {
                            Class130.aBoolean1899 = true
                            val class348_sub47 = method2148((Class348_Sub23_Sub2.aClass351_9034), (Class348_Sub23_Sub2.aClass77_9029), -115)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(101.toByte(), Class5_Sub1.anInt8349)
                            Class348_Sub42_Sub14.method3243(118, class348_sub47)
                            anIntArray1149!![anInt1173++] = 0
                            return
                        }
                        return
                    }
                    return
                }
                return
            }
            if (i == 6501) {
                val class110_sub1 = method2487(-97)
                if (class110_sub1 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    return
                } else {
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5786
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1708
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5787
                    val class283 = class110_sub1.method1038(false)
                    anIntArray1149!![anInt1173++] = class283.anInt3657
                    aStringArray1152!![anInt1170++] = class283.aString3663
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1704
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5788
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5794
                }
                return
            }
            if (i == 6502) {
                val class110_sub1 = method170(true)
                if (class110_sub1 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    return
                } else {
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5786
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1708
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5787
                    val class283 = class110_sub1.method1038(false)
                    anIntArray1149!![anInt1173++] = class283.anInt3657
                    aStringArray1152!![anInt1170++] = class283.aString3663
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1704
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5788
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5794
                }
                return
            }
            if (i == 6503) {
                val i_168_ = anIntArray1149!![--anInt1173]
                val string = aStringArray1152!![--anInt1170]
                if (Class240.anInt4674 != 7 || Class225.anInt2955 != 0 || Class367_Sub2.anInt7297 != 0) anIntArray1149!![anInt1173++] = 0
                else {
                    anIntArray1149!![anInt1173++] = (if (method2972(string, i_168_, -42)) 1 else 0)
                    return
                }
                return
            }
            if (i == 6506) {
                val i_169_ = anIntArray1149!![--anInt1173]
                val class110_sub1 = method1742(false, i_169_)
                if (class110_sub1 == null) {
                    anIntArray1149!![anInt1173++] = -1
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    anIntArray1149!![anInt1173++] = 0
                    anIntArray1149!![anInt1173++] = 0
                    aStringArray1152!![anInt1170++] = ""
                    return
                } else {
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1708
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5787
                    val class283 = class110_sub1.method1038(false)
                    anIntArray1149!![anInt1173++] = class283.anInt3657
                    aStringArray1152!![anInt1170++] = class283.aString3663
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt1704
                    anIntArray1149!![anInt1173++] = class110_sub1.anInt5788
                    aStringArray1152!![anInt1170++] = class110_sub1.aString5794
                }
                return
            }
            if (i == 6507) {
                anInt1173 -= 4
                val i_170_ = anIntArray1149!![anInt1173]
                val bool_171_ = anIntArray1149!![anInt1173 + 1] == 1
                val i_172_ = anIntArray1149!![anInt1173 + 2]
                val bool_173_ = anIntArray1149!![anInt1173 + 3] == 1
                Class302.method2283(bool_173_, 0, i_172_, i_170_, bool_171_)
                return
            }
            if (i == 6508) {
                Class348_Sub42_Sub20.method3283(-47)
                return
            }
            if (i == 6509) {
                if (Class240.anInt4674 == 7) {
                    Class348_Sub40_Sub30.aBoolean9403 = anIntArray1149!![--anInt1173] == 1
                    return
                }
                return
            }
            if (i == 6510) {
                anIntArray1149!![anInt1173++] = Class251.anInt3234
                return
            }
        } else if (i >= 6700) {
            if (i < 6800 && Class11.aClass231_196 == Class288.aClass231_4953) {
                if (i == 6700) {
                    var i_174_ = Class125.aClass356_4915!!.method3474(1)
                    if (r.anInt9721 != -1) i_174_++
                    anIntArray1149!![anInt1173++] = i_174_
                    return
                }
                if (i == 6701) {
                    var i_175_ = anIntArray1149!![--anInt1173]
                    if (r.anInt9721 != -1) {
                        if (i_175_ == 0) {
                            anIntArray1149!![anInt1173++] = r.anInt9721
                            return
                        }
                        i_175_--
                    }
                    var class348_sub41 = (Class125.aClass356_4915!!.method3484(0) as Class348_Sub41?)
                    while (i_175_-- > 0) class348_sub41 = (Class125.aClass356_4915!!.method3482(0) as Class348_Sub41?)
                    anIntArray1149!![anInt1173++] = class348_sub41!!.anInt7050
                    return
                }
                if (i == 6702) {
                    val i_176_ = anIntArray1149!![--anInt1173]
                    if (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_176_] == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        val string = (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_176_]!![0]!!.aString721)
                        if (string == null) aStringArray1152!![anInt1170++] = ""
                        else {
                            aStringArray1152!![anInt1170++] = string.substring(0, string.indexOf(':'))
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 6703) {
                    val i_177_ = anIntArray1149!![--anInt1173]
                    if (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_177_] == null) anIntArray1149!![anInt1173++] = 0
                    else {
                        anIntArray1149!![anInt1173++] = (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_177_])!!.size
                        return
                    }
                    return
                }
                if (i == 6704) {
                    anInt1173 -= 2
                    val i_178_ = anIntArray1149!![anInt1173]
                    val i_179_ = anIntArray1149!![anInt1173 + 1]
                    if (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_178_] == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        val string = (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_178_]!![i_179_]!!.aString721)
                        if (string == null) aStringArray1152!![anInt1170++] = ""
                        else {
                            aStringArray1152!![anInt1170++] = string
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 6705) {
                    anInt1173 -= 2
                    val i_180_ = anIntArray1149!![anInt1173]
                    val i_181_ = anIntArray1149!![anInt1173 + 1]
                    if (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_180_] == null) anIntArray1149!![anInt1173++] = 0
                    else {
                        anIntArray1149!![anInt1173++] = Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_180_]!![i_181_]!!.anInt732
                        return
                    }
                    return
                }
                if (i == 6706) return
                if (i == 6707) {
                    anInt1173 -= 3
                    val i_182_ = anIntArray1149!![anInt1173]
                    val i_183_ = anIntArray1149!![anInt1173 + 1]
                    val i_184_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_184_, "", 111.toByte(), 1, i_182_ shl 16 or i_183_)
                    return
                }
                if (i == 6708) {
                    anInt1173 -= 3
                    val i_185_ = anIntArray1149!![anInt1173]
                    val i_186_ = anIntArray1149!![anInt1173 + 1]
                    val i_187_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_187_, "", 127.toByte(), 2, i_185_ shl 16 or i_186_)
                    return
                }
                if (i == 6709) {
                    anInt1173 -= 3
                    val i_188_ = anIntArray1149!![anInt1173]
                    val i_189_ = anIntArray1149!![anInt1173 + 1]
                    val i_190_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_190_, "", 118.toByte(), 3, i_188_ shl 16 or i_189_)
                    return
                }
                if (i == 6710) {
                    anInt1173 -= 3
                    val i_191_ = anIntArray1149!![anInt1173]
                    val i_192_ = anIntArray1149!![anInt1173 + 1]
                    val i_193_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_193_, "", 8.toByte(), 4, i_191_ shl 16 or i_192_)
                    return
                }
                if (i == 6711) {
                    anInt1173 -= 3
                    val i_194_ = anIntArray1149!![anInt1173]
                    val i_195_ = anIntArray1149!![anInt1173 + 1]
                    val i_196_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_196_, "", 125.toByte(), 5, i_194_ shl 16 or i_195_)
                    return
                }
                if (i == 6712) {
                    anInt1173 -= 3
                    val i_197_ = anIntArray1149!![anInt1173]
                    val i_198_ = anIntArray1149!![anInt1173 + 1]
                    val i_199_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_199_, "", 108.toByte(), 6, i_197_ shl 16 or i_198_)
                    return
                }
                if (i == 6713) {
                    anInt1173 -= 3
                    val i_200_ = anIntArray1149!![anInt1173]
                    val i_201_ = anIntArray1149!![anInt1173 + 1]
                    val i_202_ = anIntArray1149!![anInt1173 + 2]
                    Class348_Sub9.method2780(i_202_, "", (-106).toByte(), 7, i_200_ shl 16 or i_201_)
                    return
                }
                if (i == 6714) {
                    anInt1173 -= 3
                    val i_203_ = anIntArray1149!![anInt1173]
                    val i_204_ = anIntArray1149!![anInt1173 + 1]
                    val i_205_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_205_, "", 117.toByte(), 8, i_203_ shl 16 or i_204_)
                    return
                }
                if (i == 6715) {
                    anInt1173 -= 3
                    val i_206_ = anIntArray1149!![anInt1173]
                    val i_207_ = anIntArray1149!![anInt1173 + 1]
                    val i_208_ = anIntArray1149!![anInt1173 + 2]
                    Class348_Sub9.method2780(i_208_, "", (-35).toByte(), 9, i_206_ shl 16 or i_207_)
                    return
                }
                if (i == 6716) {
                    anInt1173 -= 3
                    val i_209_ = anIntArray1149!![anInt1173]
                    val i_210_ = anIntArray1149!![anInt1173 + 1]
                    val i_211_ = anIntArray1149!![anInt1173 + 2]
                    method2780(i_211_, "", 107.toByte(), 10, i_209_ shl 16 or i_210_)
                    return
                }
                if (i == 6717) {
                    anInt1173 -= 3
                    val i_212_ = anIntArray1149!![anInt1173]
                    val i_213_ = anIntArray1149!![anInt1173 + 1]
                    val i_214_ = anIntArray1149!![anInt1173 + 2]
                    val class46 = Class348_Sub22.method2957(i_214_, (-54).toByte(), i_212_ shl 16 or i_213_)
                    Class341.method2678(-2049)
                    val class348_sub44 = Client.method105(class46!!)!!
                    Class339.method2666((class348_sub44.anInt7093), class348_sub44.method3307(100), class46, 21.toByte())
                    return
                }
            } else if (i < 6900) {
                if (i == 6800) {
                    val i_215_ = anIntArray1149!![--anInt1173]
                    val class42 = Class348_Sub23_Sub2.aClass153_9031!!.method1225(i_215_, 96.toByte())
                    if (class42!!.aString597 == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class42.aString597!!
                        return
                    }
                    return
                }
                if (i == 6801) {
                    val i_216_ = anIntArray1149!![--anInt1173]
                    val class42 = Class348_Sub23_Sub2.aClass153_9031!!.method1225(i_216_, 111.toByte())
                    anIntArray1149!![anInt1173++] = class42!!.anInt578
                    return
                }
                if (i == 6802) {
                    val i_217_ = anIntArray1149!![--anInt1173]
                    val class42 = Class348_Sub23_Sub2.aClass153_9031!!.method1225(i_217_, 91.toByte())
                    anIntArray1149!![anInt1173++] = class42!!.anInt576
                    return
                }
                if (i == 6803) {
                    val i_218_ = anIntArray1149!![--anInt1173]
                    val class42 = Class348_Sub23_Sub2.aClass153_9031!!.method1225(i_218_, 44.toByte())
                    anIntArray1149!![anInt1173++] = class42!!.anInt596
                    return
                }
                if (i == 6804) {
                    anInt1173 -= 2
                    val i_219_ = anIntArray1149!![anInt1173]
                    val i_220_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = Class101_Sub3.aClass326_5764!!.method2600(i_220_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (Class348_Sub23_Sub2.aClass153_9031!!.method1225(i_219_, 79.toByte())!!.method376(class254.aString3258, i_220_, 126.toByte())!!)
                    else {
                        anIntArray1149!![anInt1173++] = (Class348_Sub23_Sub2.aClass153_9031!!.method1225(i_219_, 50.toByte())!!.method378(class254.anInt3256, i_220_, false))
                        return
                    }
                    return
                }
            } else if (i < 7000) {
                if (i == 6900) {
                    anIntArray1149!![anInt1173++] = if (Class348_Sub40_Sub3.aBoolean9103 && !Class133.aBoolean1915) 1 else 0
                    return
                }
                if (i == 6901) {
                    anIntArray1149!![anInt1173++] = Class116.anInt1758
                    return
                }
                if (i == 6902) {
                    anIntArray1149!![anInt1173++] = Class135_Sub1.anInt4716
                    return
                }
                if (i == 6903) {
                    anIntArray1149!![anInt1173++] = Class322.anInt4026
                    return
                }
                if (i == 6904) {
                    anIntArray1149!![anInt1173++] = Class206.anInt4870
                    return
                }
                if (i == 6905) {
                    var string: String? = ""
                    if (Class348_Sub42_Sub6.aClass144_9536 != null) {
                        if (Class348_Sub42_Sub6.aClass144_9536!!.anObject1998 != null) string = (Class348_Sub42_Sub6.aClass144_9536!!.anObject1998) as String?
                        else string = Class235.method1669(-19918, (Class348_Sub42_Sub6.aClass144_9536!!.anInt2000))
                    }
                    aStringArray1152!![anInt1170++] = string!!
                    return
                }
                if (i == 6906) {
                    anIntArray1149!![anInt1173++] = Class216.anInt4976
                    return
                }
                if (i == 6907) {
                    anIntArray1149!![anInt1173++] = Class130_Sub1.anInt5797
                    return
                }
                if (i == 6908) {
                    anIntArray1149!![anInt1173++] = Class348_Sub6.anInt6632
                    return
                }
                if (i == 6909) {
                    anIntArray1149!![anInt1173++] = if (Class290.aBoolean3706) 1 else 0
                    return
                }
                if (i == 6910) {
                    anIntArray1149!![anInt1173++] = Class24.anInt359
                    return
                }
                if (i == 6911) {
                    anIntArray1149!![anInt1173++] = Applet_Sub1.anInt37
                    return
                }
                if (i == 6912) {
                    anIntArray1149!![anInt1173++] = Class348_Sub1.anInt6551
                    return
                }
            } else if (i < 7100) {
                if (i == 7000) {
                    val i_221_ = method2478(1000)
                    Class64_Sub3.anInt5584 = Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)
                    anIntArray1149!![anInt1173++] = Class64_Sub3.anInt5584
                    anIntArray1149!![anInt1173++] = i_221_
                    Class348_Sub20.method2953((-113).toByte())
                    method243(37)
                    r.aBoolean9719 = false
                    return
                }
                if (i == 7001) {
                    Class133.method1140(47)
                    Class348_Sub20.method2953((-126).toByte())
                    method243(37)
                    r.aBoolean9719 = false
                    return
                }
                if (i == 7002) {
                    Class47.method447((-59).toByte())
                    Class348_Sub20.method2953((-124).toByte())
                    method243(37)
                    r.aBoolean9719 = false
                    return
                }
                if (i == 7003) {
                    Class161.method1263(true)
                    Class348_Sub20.method2953((-106).toByte())
                    method243(37)
                    r.aBoolean9719 = false
                    return
                }
                if (i == 7004) {
                    method3076(0, true)
                    Class348_Sub20.method2953((-107).toByte())
                    method243(37)
                    r.aBoolean9719 = false
                    return
                }
                if (i == 7005) {
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub29_7229), 0)
                    method243(37)
                    r.aBoolean9719 = false
                    return
                }
                if (i == 7006) {
                    if (Class64_Sub3.anInt5584 == 2) Class221.aBoolean2881 = true
                    else {
                        if (Class64_Sub3.anInt5584 == 1) Class330.aBoolean4117 = true
                        else {
                            if (Class64_Sub3.anInt5584 == 3) Class348_Sub1.aBoolean6558 = true
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 7007) {
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub29_7229!!.method1848(-32350)
                    return
                }
            } else if (i < 7200) {
                if (i == 7100) {
                    anInt1173 -= 2
                    val i_222_ = anIntArray1149!![anInt1173]
                    var i_223_ = anIntArray1149!![anInt1173 + 1]
                    if (i_222_ != -1) {
                        if (i_223_ > 255) i_223_ = 255
                        else if (i_223_ < 0) i_223_ = 0
                        method524(i_223_, false, i_222_, -122)
                    }
                    return
                }
                if (i == 7101) {
                    val i_224_ = anIntArray1149!![--anInt1173]
                    if (i_224_ != -1) method690(17.toByte(), i_224_)
                    return
                }
                if (i == 7102) {
                    val i_225_ = anIntArray1149!![--anInt1173]
                    if (i_225_ != -1) Class143.method1189(-1, i_225_)
                    return
                }
                if (i == 7103) {
                    anIntArray1149!![anInt1173++] = if (method3131(50.toByte(), "jagtheora")) 1 else 0
                    return
                }
            } else if (i < 7300) {
                if (i == 7201) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1736(123)) 1 else 0
                    return
                }
                if (i == 7202) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub21_7270!!.method1809(117)) 1 else 0
                    return
                }
                if (i == 7203) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1747(111)) 1 else 0
                    return
                }
                if (i == 7204) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1801(125)) 1 else 0
                    return
                }
                if (i == 7205) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7216!!.method1806(108) && Class348_Sub8.aHa6654!!.method3699()) 1 else 0
                    return
                }
                if (i == 7206) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub15_7224!!.method1786(93)) 1 else 0
                    return
                }
                if (i == 7207) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1744(103)) 1 else 0
                    return
                }
                if (i == 7208) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub12_7243!!.method1774(120) && Class348_Sub8.aHa6654!!.method3627()) 1 else 0
                    return
                }
                if (i == 7209) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub9_7256!!.method1757(115)) 1 else 0
                    return
                }
                if (i == 7210) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1824(124)) 1 else 0
                    return
                }
                if (i == 7211) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1817(108)) 1 else 0
                    return
                }
                if (i == 7212) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub16_7247!!.method1790(94)) 1 else 0
                    return
                }
                if (i == 7213) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1729(91)) 1 else 0
                    return
                }
                if (i == 7214) {
                    anIntArray1149!![anInt1173++] = if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.method1831(95)) 1 else 0
                    return
                }
            } else if (i < 7400) {
                if (i == 7301) {
                    val i_226_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1714(3, i_226_)
                    return
                }
                if (i == 7302) {
                    val i_227_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub21_7270!!.method1714(3, i_227_)
                    return
                }
                if (i == 7303) {
                    val i_228_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1714(3, i_228_)
                    return
                }
                if (i == 7304) {
                    val i_229_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1714(3, i_229_)
                    return
                }
                if (i == 7305) {
                    val i_230_ = anIntArray1149!![--anInt1173]
                    if (Class348_Sub8.aHa6654!!.method3699()) {
                        anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub20_7216!!.method1714(3, i_230_)
                        return
                    } else anIntArray1149!![anInt1173++] = 3
                    return
                }
                if (i == 7306) {
                    val i_231_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub15_7224!!.method1714(3, i_231_)
                    return
                }
                if (i == 7307) {
                    val i_232_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1714(3, i_232_)
                    return
                }
                if (i == 7308) {
                    val i_233_ = anIntArray1149!![--anInt1173]
                    if (Class348_Sub8.aHa6654!!.method3627()) {
                        anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub12_7243!!.method1714(3, i_233_)
                        return
                    } else anIntArray1149!![anInt1173++] = 3
                    return
                }
                if (i == 7309) {
                    val i_234_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub9_7256!!.method1714(3, i_234_)
                    return
                }
                if (i == 7310) {
                    val i_235_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1714(3, i_235_)
                    return
                }
                if (i == 7311) {
                    val i_236_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub23_7231!!.method1714(3, i_236_)
                    return
                }
                if (i == 7312) {
                    val i_237_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub16_7247!!.method1714(3, i_237_)
                    return
                }
                if (i == 7313) {
                    val i_238_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!!!.method1714(3, i_238_)
                    return
                }
                if (i == 7314) {
                    val i_239_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.method1714(3, i_239_)
                    return
                }
            }
        }
        throw IllegalStateException(i.toString())
    }

    @JvmStatic
    fun method705(class348_sub36: Class348_Sub36) {
        method712(class348_sub36, 200000)
    }

    @JvmStatic
    fun method706() {
        /* empty */
    }

    private fun method707(string: String, i: Int) {
        var string = string
        if (Class192.anInt2581 != 0 || ((!Class348_Sub40_Sub3.aBoolean9103 || Class133.aBoolean1915) && !Class50_Sub2.aBoolean5233)) {
            var string_240_ = string.lowercase(Locale.getDefault())
            var i_241_ = 0
            if (string_240_.startsWith(Class274.aClass274_3530!!.method2063(0, 544)!!)) {
                i_241_ = 0
                string = string.substring(Class274.aClass274_3530!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3531!!.method2063(0, 544)!!)) {
                i_241_ = 1
                string = string.substring(Class274.aClass274_3531!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3532!!.method2063(0, 544)!!)) {
                i_241_ = 2
                string = string.substring(Class274.aClass274_3532!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3533!!.method2063(0, 544)!!)) {
                i_241_ = 3
                string = string.substring(Class274.aClass274_3533!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3534!!.method2063(0, 544)!!)) {
                i_241_ = 4
                string = string.substring(Class274.aClass274_3534!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3535!!.method2063(0, 544)!!)) {
                i_241_ = 5
                string = string.substring(Class274.aClass274_3535!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3536!!.method2063(0, 544)!!)) {
                i_241_ = 6
                string = string.substring(Class274.aClass274_3536!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3537!!.method2063(0, 544)!!)) {
                i_241_ = 7
                string = string.substring(Class274.aClass274_3537!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3538!!.method2063(0, 544)!!)) {
                i_241_ = 8
                string = string.substring(Class274.aClass274_3538!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3539!!.method2063(0, 544)!!)) {
                i_241_ = 9
                string = string.substring(Class274.aClass274_3539!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3540!!.method2063(0, 544)!!)) {
                i_241_ = 10
                string = string.substring(Class274.aClass274_3540!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3541!!.method2063(0, 544)!!)) {
                i_241_ = 11
                string = string.substring(Class274.aClass274_3541!!.method2063(0, 544)!!.length)
            } else if (Class348_Sub33.anInt6967 != 0) {
                if (string_240_.startsWith(Class274.aClass274_3530!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 0
                    string = string.substring(Class274.aClass274_3530!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3531!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 1
                    string = string.substring(Class274.aClass274_3531!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3532!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 2
                    string = string.substring(Class274.aClass274_3532!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3533!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 3
                    string = string.substring(Class274.aClass274_3533!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3534!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 4
                    string = string.substring(Class274.aClass274_3534!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3535!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 5
                    string = string.substring(Class274.aClass274_3535!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3536!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 6
                    string = string.substring(Class274.aClass274_3536!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3537!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 7
                    string = string.substring(Class274.aClass274_3537!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3538!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 8
                    string = string.substring(Class274.aClass274_3538!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3539!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 9
                    string = string.substring(Class274.aClass274_3539!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3540!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 10
                    string = string.substring(Class274.aClass274_3540!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3541!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_241_ = 11
                    string = string.substring(Class274.aClass274_3541!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                }
            }
            string_240_ = string.lowercase(Locale.getDefault())
            var i_242_ = 0
            if (string_240_.startsWith(Class274.aClass274_3542!!.method2063(0, 544)!!)) {
                i_242_ = 1
                string = string.substring(Class274.aClass274_3542!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3543!!.method2063(0, 544)!!)) {
                i_242_ = 2
                string = string.substring(Class274.aClass274_3543!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3544!!.method2063(0, 544)!!)) {
                i_242_ = 3
                string = string.substring(Class274.aClass274_3544!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3545!!.method2063(0, 544)!!)) {
                i_242_ = 4
                string = string.substring(Class274.aClass274_3545!!.method2063(0, 544)!!.length)
            } else if (string_240_.startsWith(Class274.aClass274_3546!!.method2063(0, 544)!!)) {
                i_242_ = 5
                string = string.substring(Class274.aClass274_3546!!.method2063(0, 544)!!.length)
            } else if (Class348_Sub33.anInt6967 != 0) {
                if (string_240_.startsWith(Class274.aClass274_3542!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_242_ = 1
                    string = string.substring(Class274.aClass274_3542!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3543!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_242_ = 2
                    string = string.substring(Class274.aClass274_3543!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3544!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_242_ = 3
                    string = string.substring(Class274.aClass274_3544!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3545!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_242_ = 4
                    string = string.substring(Class274.aClass274_3545!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                } else if (string_240_.startsWith(Class274.aClass274_3546!!.method2063(Class348_Sub33.anInt6967, 544)!!)) {
                    i_242_ = 5
                    string = string.substring(Class274.aClass274_3546!!.method2063(Class348_Sub33.anInt6967, 544)!!.length)
                }
            }
            anInt1158++
            val class348_sub47 = method2148(Class205.aClass351_2686, Class348_Sub23_Sub2.aClass77_9029, -88)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
            val i_243_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i_241_)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, i_242_)
            method3544((class348_sub47.aClass348_Sub49_Sub2_7116!!), -101, string)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(119, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) - i_243_)
            Class348_Sub42_Sub14.method3243(124, class348_sub47)
        }
    }

    private fun method708(c: Char): Int {
        if (Class237_Sub1.method1693(c, -114)) return 1
        return 0
    }

    private fun method709(i: Int): String {
        val l = (i.toLong() + 11745L) * 86400000L
        aCalendar1160!!.setTime(Date(l))
        val i_244_ = aCalendar1160!!.get(5)
        val i_245_ = aCalendar1160!!.get(2)
        val i_246_ = aCalendar1160!!.get(1)
        return (i_244_.toString() + "-" + aStringArray1176!![i_245_] + "-" + i_246_)
    }

    private fun method710(i: Int, bool: Boolean) {
        var i = i
        if (i < 300) {
            if (i == 100) {
                anInt1173 -= 3
                val i_247_ = anIntArray1149!![anInt1173]
                val i_248_ = anIntArray1149!![anInt1173 + 1]
                val i_249_ = anIntArray1149!![anInt1173 + 2]
                if (i_248_ == 0) throw RuntimeException()
                val class46 = method2570(1512932720, i_247_)
                if (class46!!.aClass46Array798 == null) class46.aClass46Array798 = arrayOfNulls<Class46>(i_249_ + 1)
                if (class46.aClass46Array798!!.size <= i_249_) {
                    val class46s = arrayOfNulls<Class46>(i_249_ + 1)
                    for (i_250_ in class46.aClass46Array798!!.indices) class46s[i_250_] = class46.aClass46Array798!![i_250_]
                    class46.aClass46Array798 = class46s
                }
                if (i_249_ > 0 && (class46.aClass46Array798!![i_249_ - 1] == null)) throw RuntimeException("Gap at:" + (i_249_ - 1))
                val class46_251_ = Class46()
                class46_251_.anInt774 = i_248_
                class46_251_.anInt830 = class46.anInt830
                class46_251_.anInt834 = class46_251_.anInt830
                class46_251_.anInt704 = i_249_
                class46.aClass46Array798!![i_249_] = class46_251_
                if (bool) aClass46_1169 = class46_251_
                else aClass46_1150 = class46_251_
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 101) {
                val class46 = (if (bool) Class66.aClass46_1169 else Class66.aClass46_1150)!!
                if (class46.anInt704 == -1) {
                    if (bool) throw RuntimeException("Tried to .cc_delete static .active-component!")
                    throw RuntimeException("Tried to cc_delete static active-component!")
                }
                val class46_252_ = method2570(1512932720, class46.anInt830)
                class46_252_!!.aClass46Array798!![(class46.anInt704)] = null
                Class251.method1916(-9343, class46_252_)
                return
            }
            if (i == 102) {
                val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                class46!!.aClass46Array798 = null
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 200) {
                anInt1173 -= 2
                val i_253_ = anIntArray1149!![anInt1173]
                val i_254_ = anIntArray1149!![anInt1173 + 1]
                val class46 = Class348_Sub22.method2957(i_254_, (-54).toByte(), i_253_)
                if (class46 == null || i_254_ == -1) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else {
                    anIntArray1149!![anInt1173++] = 1
                    if (bool) aClass46_1169 = class46
                    else aClass46_1150 = class46
                }
                return
            }
            if (i == 201) {
                val i_255_ = anIntArray1149!![--anInt1173]
                val class46 = method2570(1512932720, i_255_)
                if (class46 == null) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                } else {
                    anIntArray1149!![anInt1173++] = 1
                    if (bool) aClass46_1169 = class46
                    else aClass46_1150 = class46
                }
                return
            }
            if (i == 202) {
                val i_256_ = anIntArray1149!![--anInt1173]
                method714(i_256_)
                return
            }
            if (i == 203) {
                val i_257_ = anIntArray1149!![--anInt1173]
                method702(i_257_)
                return
            }
        } else if (i < 500) {
            if (i == 403) {
                anInt1173 -= 2
                val i_258_ = anIntArray1149!![anInt1173]
                val i_259_ = anIntArray1149!![anInt1173 + 1]
                if ((Class132.aPlayer_1907!!.aClass154_10536) != null) {
                    for (i_260_ in Class141.anIntArray1973!!.indices) {
                        if (Class141.anIntArray1973!![i_260_] == i_258_) {
                            Class132.aPlayer_1907!!.aClass154_10536!!.method1233(Class348_Sub40_Sub25.aClass150_9342, i_259_, -1, i_260_)
                            return
                        }
                    }
                    for (i_261_ in Class91.anIntArray1521!!.indices) {
                        if (Class91.anIntArray1521!![i_261_] == i_258_) {
                            Class132.aPlayer_1907!!.aClass154_10536!!.method1233(Class348_Sub40_Sub25.aClass150_9342, i_259_, -1, i_261_)
                            break
                        }
                    }
                    return
                }
                return
            }
            if (i == 404) {
                anInt1173 -= 2
                val i_262_ = anIntArray1149!![anInt1173]
                val i_263_ = anIntArray1149!![anInt1173 + 1]
                if ((Class132.aPlayer_1907!!.aClass154_10536) != null) {
                    Class132.aPlayer_1907!!.aClass154_10536!!.method1231(i_262_, 0, i_263_)
                    return
                }
                return
            }
            if (i == 410) {
                val bool_264_ = anIntArray1149!![--anInt1173] != 0
                if ((Class132.aPlayer_1907!!.aClass154_10536) != null) {
                    Class132.aPlayer_1907!!.aClass154_10536!!.method1229((-17).toByte(), bool_264_)
                    return
                }
                return
            }
            if (i == 411) {
                anInt1173 -= 2
                val i_265_ = anIntArray1149!![anInt1173]
                val i_266_ = anIntArray1149!![anInt1173 + 1]
                if ((Class132.aPlayer_1907!!.aClass154_10536) != null) {
                    Class132.aPlayer_1907!!.aClass154_10536!!.method1227(42.toByte(), i_265_, i_266_, Exception_Sub1.aClass255_112)
                    return
                }
                return
            }
        } else if (i >= 1000 && i < 1100 || i >= 2000 && i < 2100) {
            val class46: Class46?
            if (i >= 2000) {
                i -= 1000
                class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
            } else class46 = if (bool) aClass46_1169 else aClass46_1150
            if (i == 1000) {
                anInt1173 -= 4
                class46!!.anInt788 = anIntArray1149!![anInt1173]
                class46.anInt739 = anIntArray1149!![anInt1173 + 1]
                var i_267_ = anIntArray1149!![anInt1173 + 2]
                if (i_267_ < 0) i_267_ = 0
                else if (i_267_ > 5) i_267_ = 5
                var i_268_ = anIntArray1149!![anInt1173 + 3]
                if (i_268_ < 0) i_268_ = 0
                else if (i_268_ > 5) i_268_ = 5
                class46.aByte817 = i_267_.toByte()
                class46.aByte681 = i_268_.toByte()
                Class251.method1916(-9343, class46)
                Class111.method1048(class46, 50)
                if (class46.anInt704 == -1) Class239_Sub3.method1733((-78).toByte(), class46.anInt830)
                return
            }
            if (i == 1001) {
                anInt1173 -= 4
                class46!!.anInt842 = anIntArray1149!![anInt1173]
                class46.anInt728 = anIntArray1149!![anInt1173 + 1]
                class46.anInt796 = 0
                class46.anInt826 = 0
                var i_269_ = anIntArray1149!![anInt1173 + 2]
                if (i_269_ < 0) i_269_ = 0
                else if (i_269_ > 4) i_269_ = 4
                var i_270_ = anIntArray1149!![anInt1173 + 3]
                if (i_270_ < 0) i_270_ = 0
                else if (i_270_ > 4) i_270_ = 4
                class46.aByte778 = i_269_.toByte()
                class46.aByte724 = i_270_.toByte()
                Class251.method1916(-9343, class46)
                Class111.method1048(class46, 62)
                if (class46.anInt774 == 0) Class251.method1913(false, 36, class46)
                return
            }
            if (i == 1003) {
                val bool_271_ = anIntArray1149!![--anInt1173] == 1
                if (class46!!.aBoolean813 != bool_271_) {
                    class46.aBoolean813 = bool_271_
                    Class251.method1916(-9343, class46)
                }
                if (class46.anInt704 == -1) Class348_Sub26.method2999(90.toByte(), class46.anInt830)
                return
            }
            if (i == 1004) {
                anInt1173 -= 2
                class46!!.anInt710 = anIntArray1149!![anInt1173]
                class46.anInt775 = anIntArray1149!![anInt1173 + 1]
                Class251.method1916(-9343, class46)
                Class111.method1048(class46, 59)
                if (class46.anInt774 == 0) Class251.method1913(false, 49, class46)
                return
            }
            if (i == 1005) {
                class46!!.aBoolean776 = anIntArray1149!![--anInt1173] == 1
                return
            }
        } else if (i >= 1100 && i < 1200 || i >= 2100 && i < 2200) {
            val class46: Class46?
            if (i >= 2000) {
                i -= 1000
                class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
            } else class46 = if (bool) aClass46_1169 else aClass46_1150
            if (i == 1100) {
                anInt1173 -= 2
                class46!!.anInt747 = anIntArray1149!![anInt1173]
                if (class46.anInt747 > (class46.anInt698 - class46.anInt709)) class46.anInt747 = (class46.anInt698 - class46.anInt709)
                if (class46.anInt747 < 0) class46.anInt747 = 0
                class46.anInt755 = anIntArray1149!![anInt1173 + 1]
                if (class46.anInt755 > (class46.anInt791 - class46.anInt789)) class46.anInt755 = (class46.anInt791 - class46.anInt789)
                if (class46.anInt755 < 0) class46.anInt755 = 0
                Class251.method1916(-9343, class46)
                if (class46.anInt704 == -1) Class328_Sub3.method2615(-91, class46.anInt830)
                return
            }
            if (i == 1101) {
                class46!!.anInt749 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                if (class46.anInt704 == -1) method1148(class46.anInt830, 6)
                return
            }
            if (i == 1102) {
                class46!!.aBoolean810 = anIntArray1149!![--anInt1173] == 1
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1103) {
                class46!!.anInt696 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1104) {
                class46!!.anInt690 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1105) {
                val i_272_ = anIntArray1149!![--anInt1173]
                if (class46!!.anInt756 != i_272_) {
                    class46.anInt756 = i_272_
                    Class251.method1916(-9343, class46)
                }
                if (class46.anInt704 == -1) Class203.method1477(class46.anInt830, 14)
                return
            }
            if (i == 1106) {
                class46!!.anInt828 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1107) {
                class46!!.aBoolean697 = anIntArray1149!![--anInt1173] == 1
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1108) {
                class46!!.anInt770 = 1
                class46.anInt753 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                if (class46.anInt704 == -1) method3569(class46.anInt830, -125)
                return
            }
            if (i == 1109) {
                anInt1173 -= 6
                class46!!.anInt808 = anIntArray1149!![anInt1173]
                class46.anInt786 = anIntArray1149!![anInt1173 + 1]
                class46.anInt757 = anIntArray1149!![anInt1173 + 2]
                class46.anInt675 = anIntArray1149!![anInt1173 + 3]
                class46.anInt717 = anIntArray1149!![anInt1173 + 4]
                class46.anInt716 = anIntArray1149!![anInt1173 + 5]
                Class251.method1916(-9343, class46)
                if (class46.anInt704 == -1) {
                    method1787(class46.anInt830, 8)
                    Class199.method1459(class46.anInt830, 2)
                }
                return
            }
            if (i == 1110) {
                val i_273_ = anIntArray1149!![--anInt1173]
                if (class46!!.anInt699 != i_273_) {
                    class46.anInt699 = i_273_
                    class46.anInt795 = 0
                    class46.anInt730 = 1
                    class46.anInt841 = 0
                    val class17 = (if (class46.anInt699 == -1) null else Class10.aClass87_191!!.method835(class46.anInt699, 7))
                    if (class17 != null) Class264.method2017(class46.anInt795, class17, 46)
                    Class251.method1916(-9343, class46)
                }
                if (class46.anInt704 == -1) Class64_Sub3.method687((-117).toByte(), class46.anInt830)
                return
            }
            if (i == 1111) {
                class46!!.aBoolean689 = anIntArray1149!![--anInt1173] == 1
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1112) {
                val string = aStringArray1152!![--anInt1170]
                if (string != class46!!.aString792) {
                    class46.aString792 = string
                    Class251.method1916(-9343, class46)
                }
                if (class46.anInt704 == -1) method3316(121, class46.anInt830)
                return
            }
            if (i == 1113) {
                class46!!.anInt702 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                if (class46.anInt704 == -1) Class309.method2311((-109).toByte(), class46.anInt830)
                return
            }
            if (i == 1114) {
                anInt1173 -= 3
                class46!!.anInt762 = anIntArray1149!![anInt1173]
                class46.anInt700 = anIntArray1149!![anInt1173 + 1]
                class46.anInt673 = anIntArray1149!![anInt1173 + 2]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1115) {
                class46!!.aBoolean769 = anIntArray1149!![--anInt1173] == 1
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1116) {
                class46!!.anInt672 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1117) {
                class46!!.anInt809 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1118) {
                class46!!.aBoolean790 = anIntArray1149!![--anInt1173] == 1
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1119) {
                class46!!.aBoolean735 = anIntArray1149!![--anInt1173] == 1
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1120) {
                anInt1173 -= 2
                class46!!.anInt698 = anIntArray1149!![anInt1173]
                class46.anInt791 = anIntArray1149!![anInt1173 + 1]
                Class251.method1916(-9343, class46)
                if (class46.anInt774 == 0) Class251.method1913(false, 62, class46)
                return
            }
            if (i == 1122) {
                class46!!.aBoolean745 = anIntArray1149!![--anInt1173] == 1
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1123) {
                class46!!.anInt716 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                if (class46.anInt704 == -1) method1787(class46.anInt830, 8)
                return
            }
            if (i == 1124) {
                val i_274_ = anIntArray1149!![--anInt1173]
                class46!!.aBoolean744 = i_274_ == 1
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1125) {
                anInt1173 -= 2
                class46!!.anInt688 = anIntArray1149!![anInt1173]
                class46.anInt799 = anIntArray1149!![anInt1173 + 1]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1126) {
                class46!!.anInt773 = anIntArray1149!![--anInt1173]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1127) {
                anInt1173 -= 2
                val i_275_ = anIntArray1149!![anInt1173]
                val i_276_ = anIntArray1149!![anInt1173 + 1]
                val class254 = Class101_Sub3.aClass326_5764!!.method2600(i_275_, 28364)
                if (i_276_ == class254.anInt3256) {
                    class46!!.method435(i_275_, -3437)
                    return
                } else class46!!.method436(-70, i_275_, i_276_)
                return
            }
            if (i == 1128) {
                val i_277_ = anIntArray1149!![--anInt1173]
                val string = aStringArray1152!![--anInt1170]
                val class254 = Class101_Sub3.aClass326_5764!!.method2600(i_277_, 28364)
                if (class254.aString3258 == string) {
                    class46!!.method435(i_277_, -3437)
                    return
                } else class46!!.method439(0, i_277_, string)
                return
            }
            if (i == 1129 || i == 1130) {
                val i_278_ = anIntArray1149!![--anInt1173]
                if ((class46!!.anInt774 == 5 || i != 1129) && (class46.anInt774 == 4 || i != 1130)) {
                    if (class46.anInt806 != i_278_) {
                        class46.anInt806 = i_278_
                        Class251.method1916(-9343, class46)
                    }
                    if (class46.anInt704 == -1) Class188.method1415(class46.anInt830, 117)
                    return
                }
                return
            }
        } else if (i >= 1200 && i < 1300 || i >= 2200 && i < 2300) {
            val class46: Class46?
            if (i >= 2000) {
                i -= 1000
                class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
            } else class46 = if (bool) aClass46_1169 else aClass46_1150
            Class251.method1916(-9343, class46!!)
            if (i == 1200 || i == 1205 || i == 1208 || i == 1209 || i == 1212 || i == 1213) {
                anInt1173 -= 2
                val i_279_ = anIntArray1149!![anInt1173]
                val i_280_ = anIntArray1149!![anInt1173 + 1]
                if (class46!!.anInt704 == -1) {
                    Class73.Companion.method743(9, class46.anInt830)
                    method1787(class46.anInt830, 8)
                    Class199.method1459(class46.anInt830, 2)
                }
                if (i_279_ == -1) {
                    class46.anInt770 = 1
                    class46.anInt753 = -1
                    class46.anInt812 = -1
                } else {
                    class46.anInt812 = i_279_
                    class46.anInt781 = i_280_
                    class46.aBoolean720 = i == 1208 || i == 1209
                    val class213 = Exception_Sub1.aClass255_112!!.method1940(74, i_279_)
                    class46.anInt757 = class213.anInt2787
                    class46.anInt675 = class213.anInt2781
                    class46.anInt717 = class213.anInt2810
                    class46.anInt808 = class213.anInt2779
                    class46.anInt786 = class213.anInt2826
                    class46.anInt716 = class213.anInt2825
                    if (i == 1205 || i == 1209) class46.anInt678 = 0
                    else if (i == 1212 || i == 1213) class46.anInt678 = 1
                    else class46.anInt678 = 2
                    if (class46.anInt796 > 0) class46.anInt716 = (class46.anInt716 * 32 / class46.anInt796)
                    else {
                        if (class46.anInt842 > 0) class46.anInt716 = (class46.anInt716 * 32 / class46.anInt842)
                        return
                    }
                    return
                }
                return
            }
            if (i == 1201) {
                class46!!.anInt770 = 2
                class46.anInt753 = anIntArray1149!![--anInt1173]
                if (class46.anInt704 == -1) method3569(class46.anInt830, -124)
                return
            }
            if (i == 1202) {
                class46!!.anInt770 = 3
                class46.anInt753 = -1
                if (class46.anInt704 == -1) method3569(class46.anInt830, 94)
                return
            }
            if (i == 1203) {
                class46!!.anInt770 = 6
                class46.anInt753 = anIntArray1149!![--anInt1173]
                if (class46.anInt704 == -1) method3569(class46.anInt830, -26)
                return
            }
            if (i == 1204) {
                class46!!.anInt770 = 5
                class46.anInt753 = anIntArray1149!![--anInt1173]
                if (class46.anInt704 == -1) method3569(class46.anInt830, -127)
                return
            }
            if (i == 1206) {
                anInt1173 -= 4
                class46!!.anInt705 = anIntArray1149!![anInt1173]
                class46.anInt674 = anIntArray1149!![anInt1173 + 1]
                class46.anInt733 = anIntArray1149!![anInt1173 + 2]
                class46.anInt693 = anIntArray1149!![anInt1173 + 3]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1207) {
                anInt1173 -= 2
                class46!!.anInt759 = anIntArray1149!![anInt1173]
                class46.anInt835 = anIntArray1149!![anInt1173 + 1]
                Class251.method1916(-9343, class46)
                return
            }
            if (i == 1210) {
                anInt1173 -= 4
                class46!!.anInt753 = anIntArray1149!![anInt1173]
                class46.anInt779 = anIntArray1149!![anInt1173 + 1]
                if (anIntArray1149!![anInt1173 + 2] == 1) class46.anInt770 = 9
                else class46.anInt770 = 8
                class46.aBoolean720 = anIntArray1149!![anInt1173 + 3] == 1
                if (class46.anInt704 == -1) method3569(class46.anInt830, 8)
                return
            }
            if (i == 1211) {
                class46!!.anInt770 = 5
                class46.anInt753 = Class348_Sub42_Sub11.anInt9591
                class46.anInt779 = 0
                if (class46.anInt704 == -1) method3569(class46.anInt830, 66)
                return
            }
        } else if (i >= 1300 && i < 1400 || i >= 2300 && i < 2400) {
            val class46: Class46?
            if (i >= 2000) {
                i -= 1000
                class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
            } else class46 = if (bool) aClass46_1169 else aClass46_1150
            if (i == 1300) {
                val i_281_ = anIntArray1149!![--anInt1173] - 1
                if (i_281_ >= 0 && i_281_ <= 9) {
                    class46!!.method438(i_281_, 124, aStringArray1152!![--anInt1170])
                    return
                } else anInt1170--
                return
            }
            if (i == 1301) {
                anInt1173 -= 2
                val i_282_ = anIntArray1149!![anInt1173]
                val i_283_ = anIntArray1149!![anInt1173 + 1]
                if (i_282_ == -1 && i_283_ == -1) class46!!.aClass46_782 = null
                else {
                    class46!!.aClass46_782 = Class348_Sub22.method2957(i_283_, (-54).toByte(), i_282_)
                    return
                }
                return
            }
            if (i == 1302) {
                val i_284_ = anIntArray1149!![--anInt1173]
                if (i_284_ == InputStream_Sub1.anInt78 || i_284_ == Class179.anInt2361 || i_284_ == Class312.anInt3930) {
                    class46!!.anInt797 = i_284_
                    return
                }
                return
            }
            if (i == 1303) {
                class46!!.anInt729 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 1304) {
                class46!!.anInt703 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 1305) {
                class46!!.aString752 = aStringArray1152!![--anInt1170]
                return
            }
            if (i == 1306) {
                class46!!.aString780 = aStringArray1152!![--anInt1170]
                return
            }
            if (i == 1307) {
                class46!!.aStringArray833 = null
                return
            }
            if (i == 1308) {
                class46!!.anInt695 = anIntArray1149!![--anInt1173]
                class46.anInt824 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 1309) {
                val i_285_ = anIntArray1149!![--anInt1173]
                val i_286_ = anIntArray1149!![--anInt1173]
                if (i_286_ >= 1 && i_286_ <= 10) class46!!.method431(i_286_ - 1, i_285_, (-119).toByte())
                return
            }
            if (i == 1310) {
                class46!!.aString816 = aStringArray1152!![--anInt1170]
                return
            }
            if (i == 1311) {
                class46!!.anInt713 = anIntArray1149!![--anInt1173]
                return
            }
            if (i == 1312 || i == 1313) {
                val i_287_: Int
                val i_288_: Int
                val i_289_: Int
                if (i == 1312) {
                    anInt1173 -= 3
                    i_287_ = anIntArray1149!![anInt1173] - 1
                    i_288_ = anIntArray1149!![anInt1173 + 1]
                    i_289_ = anIntArray1149!![anInt1173 + 2]
                    if (i_287_ < 0 || i_287_ > 9) throw RuntimeException("IOR13121313")
                } else {
                    anInt1173 -= 2
                    i_287_ = 10
                    i_288_ = anIntArray1149!![anInt1173]
                    i_289_ = anIntArray1149!![anInt1173 + 1]
                }
                if (class46!!.aByteArray746 == null) {
                    if (i_288_ != 0) {
                        class46.aByteArray746 = ByteArray(11)
                        class46.aByteArray832 = ByteArray(11)
                        class46.anIntArray707 = IntArray(11)
                    } else return
                }
                class46.aByteArray746[i_287_] = i_288_.toByte()
                if (i_288_ == 0) {
                    class46.aBoolean676 = false
                    for (i_290_ in class46.aByteArray746.indices) {
                        if (class46.aByteArray746[i_290_].toInt() != 0) {
                            class46.aBoolean676 = true
                            break
                        }
                    }
                } else class46.aBoolean676 = true
                class46.aByteArray832[i_287_] = i_289_.toByte()
                return
            }
            if (i == 1314) {
                class46!!.anInt719 = anIntArray1149!![--anInt1173]
                return
            }
        } else {
            if (i >= 1400 && i < 1500 || i >= 2400 && i < 2500) {
                val class46: Class46?
                if (i >= 2000) {
                    i -= 1000
                    class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                } else class46 = if (bool) aClass46_1169 else aClass46_1150
                if (i == 1499) class46!!.method434(false)
                else {
                    var string = aStringArray1152!![--anInt1170]!!
                    var `is`: IntArray? = null
                    if (string.length > 0 && string.get(string.length - 1) == 'Y') {
                        var i_291_ = anIntArray1149!![--anInt1173]
                        if (i_291_ > 0) {
                            `is` = IntArray(i_291_)
                            while (i_291_-- > 0) `is`[i_291_] = anIntArray1149!![--anInt1173]
                        }
                        string = string.substring(0, string.length - 1)
                    }
                    var objects: Array<Any?>? = arrayOfNulls<Any>(string.length + 1)
                    for (i_292_ in objects!!.size - 1 downTo 1) {
                        if (string.get(i_292_ - 1) == 's') objects[i_292_] = aStringArray1152!![--anInt1170]
                        else objects[i_292_] = anIntArray1149!![--anInt1173]
                    }
                    val i_293_ = anIntArray1149!![--anInt1173]
                    if (i_293_ != -1) objects[0] = i_293_
                    else objects = null
                    if (i == 1400) class46!!.anObjectArray763 = objects
                    else if (i == 1401) class46!!.anObjectArray805 = objects
                    else if (i == 1402) class46!!.anObjectArray742 = objects
                    else if (i == 1403) class46!!.anObjectArray811 = objects
                    else if (i == 1404) class46!!.anObjectArray683 = objects
                    else if (i == 1405) class46!!.anObjectArray823 = objects
                    else if (i == 1406) class46!!.anObjectArray680 = objects
                    else if (i == 1407) {
                        class46!!.anObjectArray777 = objects
                        class46.anIntArray686 = `is`
                    } else if (i == 1408) class46!!.anObjectArray764 = objects
                    else if (i == 1409) class46!!.anObjectArray741 = objects
                    else if (i == 1410) class46!!.anObjectArray692 = objects
                    else if (i == 1411) class46!!.anObjectArray785 = objects
                    else if (i == 1412) class46!!.anObjectArray839 = objects
                    else if (i == 1414) {
                        class46!!.anObjectArray751 = objects
                        class46.anIntArray771 = `is`
                    } else if (i == 1415) {
                        class46!!.anObjectArray671 = objects
                        class46.anIntArray731 = `is`
                    } else if (i == 1416) class46!!.anObjectArray714 = objects
                    else if (i == 1417) class46!!.anObjectArray803 = objects
                    else if (i == 1418) class46!!.anObjectArray820 = objects
                    else if (i == 1419) class46!!.anObjectArray822 = objects
                    else if (i == 1420) class46!!.anObjectArray734 = objects
                    else if (i == 1421) class46!!.anObjectArray761 = objects
                    else if (i == 1422) class46!!.anObjectArray836 = objects
                    else if (i == 1423) class46!!.anObjectArray840 = objects
                    else if (i == 1424) class46!!.anObjectArray701 = objects
                    else if (i == 1425) class46!!.anObjectArray807 = objects
                    else if (i == 1426) class46!!.anObjectArray687 = objects
                    else if (i == 1427) class46!!.anObjectArray727 = objects
                    else if (i == 1428) {
                        class46!!.anObjectArray685 = objects
                        class46.anIntArray818 = `is`
                    } else if (i == 1429) {
                        class46!!.anObjectArray708 = objects
                        class46.anIntArray831 = `is`
                    } else if (i == 1430) class46!!.anObjectArray679 = objects
                    class46!!.aBoolean682 = true
                    return
                }
                return
            }
            if (i < 1600) {
                val class46 = (if (bool) Class66.aClass46_1169 else Class66.aClass46_1150)!!
                if (i == 1500) {
                    anIntArray1149!![anInt1173++] = class46.anInt800
                    return
                }
                if (i == 1501) {
                    anIntArray1149!![anInt1173++] = class46.anInt750
                    return
                }
                if (i == 1502) {
                    anIntArray1149!![anInt1173++] = class46.anInt709
                    return
                }
                if (i == 1503) {
                    anIntArray1149!![anInt1173++] = class46.anInt789
                    return
                }
                if (i == 1504) {
                    anIntArray1149!![anInt1173++] = if (class46.aBoolean813) 1 else 0
                    return
                }
                if (i == 1505) {
                    anIntArray1149!![anInt1173++] = class46.anInt834
                    return
                }
                if (i == 1506) {
                    val class46_294_ = Class237.method1687(class46, 3)
                    anIntArray1149!![anInt1173++] = (if (class46_294_ == null) -1 else class46_294_.anInt830)
                    return
                }
            } else if (i < 1700) {
                val class46 = (if (bool) Class66.aClass46_1169 else Class66.aClass46_1150)!!
                if (i == 1600) {
                    anIntArray1149!![anInt1173++] = class46.anInt747
                    return
                }
                if (i == 1601) {
                    anIntArray1149!![anInt1173++] = class46.anInt755
                    return
                }
                if (i == 1602) {
                    aStringArray1152!![anInt1170++] = class46.aString792!!
                    return
                }
                if (i == 1603) {
                    anIntArray1149!![anInt1173++] = class46.anInt698
                    return
                }
                if (i == 1604) {
                    anIntArray1149!![anInt1173++] = class46.anInt791
                    return
                }
                if (i == 1605) {
                    anIntArray1149!![anInt1173++] = class46.anInt716
                    return
                }
                if (i == 1606) {
                    anIntArray1149!![anInt1173++] = class46.anInt757
                    return
                }
                if (i == 1607) {
                    anIntArray1149!![anInt1173++] = class46.anInt717
                    return
                }
                if (i == 1608) {
                    anIntArray1149!![anInt1173++] = class46.anInt675
                    return
                }
                if (i == 1609) {
                    anIntArray1149!![anInt1173++] = class46.anInt696
                    return
                }
                if (i == 1610) {
                    anIntArray1149!![anInt1173++] = class46.anInt808
                    return
                }
                if (i == 1611) {
                    anIntArray1149!![anInt1173++] = class46.anInt786
                    return
                }
                if (i == 1612) {
                    anIntArray1149!![anInt1173++] = class46.anInt756
                    return
                }
                if (i == 1613) {
                    val i_295_ = anIntArray1149!![--anInt1173]
                    val class254 = Class101_Sub3.aClass326_5764!!.method2600(i_295_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = class46.method429(i_295_, (class254.aString3258), -1)!!
                    else {
                        anIntArray1149!![anInt1173++] = class46.method428((class254.anInt3256), i_295_, -126)
                        return
                    }
                    return
                }
                if (i == 1614) {
                    anIntArray1149!![anInt1173++] = class46.anInt828
                    return
                }
                if (i == 2614) {
                    anIntArray1149!![anInt1173++] = (if (class46.anInt770 == 1) class46.anInt753 else -1)
                    return
                }
            } else if (i < 1800) {
                val class46 = (if (bool) Class66.aClass46_1169 else Class66.aClass46_1150)!!
                if (i == 1700) {
                    anIntArray1149!![anInt1173++] = class46.anInt812
                    return
                }
                if (i == 1701) {
                    if (class46.anInt812 == -1) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = class46.anInt781
                    return
                }
                if (i == 1702) {
                    anIntArray1149!![anInt1173++] = class46.anInt704
                    return
                }
            } else if (i < 1900) {
                val class46 = (if (bool) Class66.aClass46_1169 else Class66.aClass46_1150)!!
                if (i == 1800) {
                    anIntArray1149!![anInt1173++] = Client.method105(class46)!!.method3307(83)
                    return
                }
                if (i == 1801) {
                    var i_296_ = anIntArray1149!![--anInt1173]
                    i_296_--
                    if (class46.aStringArray833 == null || i_296_ >= class46.aStringArray833!!.size || class46.aStringArray833!![i_296_] == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class46.aStringArray833!![i_296_]!!
                        return
                    }
                    return
                }
                if (i == 1802) {
                    if (class46.aString752 == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class46.aString752!!
                        return
                    }
                    return
                }
            } else if (i < 2000 || i >= 2900 && i < 3000) {
                val class46: Class46?
                if (i >= 2000) {
                    class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                    i -= 1000
                } else class46 = if (bool) aClass46_1169 else aClass46_1150
                if (anInt1177 >= 10) throw RuntimeException("C29xx-1")
                if (i == 1927) {
                    if (class46!!.anObjectArray727 != null) {
                        val class348_sub36 = Class348_Sub36()
                        class348_sub36.aClass46_6989 = class46
                        class348_sub36.anObjectArray6987 = class46.anObjectArray727
                        class348_sub36.anInt6988 = anInt1177 + 1
                        Class348_Sub1_Sub2.aClass262_8810!!.method1999(class348_sub36, -20180)
                        return
                    }
                    return
                }
            } else if (i < 2600) {
                val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                if (i == 2500) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt800
                    return
                }
                if (i == 2501) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt750
                    return
                }
                if (i == 2502) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt709
                    return
                }
                if (i == 2503) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt789
                    return
                }
                if (i == 2504) {
                    anIntArray1149!![anInt1173++] = if (class46!!.aBoolean813) 1 else 0
                    return
                }
                if (i == 2505) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt834
                    return
                }
                if (i == 1506) {
                    val class46_297_ = Class237.method1687(class46!!, 3)
                    anIntArray1149!![anInt1173++] = (if (class46_297_ == null) -1 else class46_297_.anInt830)
                    return
                }
            } else if (i < 2700) {
                val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                if (i == 2600) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt747
                    return
                }
                if (i == 2601) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt755
                    return
                }
                if (i == 2602) {
                    aStringArray1152!![anInt1170++] = class46!!.aString792!!
                    return
                }
                if (i == 2603) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt698
                    return
                }
                if (i == 2604) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt791
                    return
                }
                if (i == 2605) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt716
                    return
                }
                if (i == 2606) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt757
                    return
                }
                if (i == 2607) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt717
                    return
                }
                if (i == 2608) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt675
                    return
                }
                if (i == 2609) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt696
                    return
                }
                if (i == 2610) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt808
                    return
                }
                if (i == 2611) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt786
                    return
                }
                if (i == 2612) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt756
                    return
                }
                if (i == 2613) {
                    anIntArray1149!![anInt1173++] = class46!!.anInt828
                    return
                }
                if (i == 2614) {
                    anIntArray1149!![anInt1173++] = (if (class46!!.anInt770 == 1) class46.anInt753 else -1)
                    return
                }
            } else if (i < 2800) {
                if (i == 2700) {
                    val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                    anIntArray1149!![anInt1173++] = class46!!.anInt812
                    return
                }
                if (i == 2701) {
                    val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                    if (class46!!.anInt812 == -1) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = class46.anInt781
                    return
                }
                if (i == 2702) {
                    val i_298_ = anIntArray1149!![--anInt1173]
                    val class348_sub41 = (Class125.aClass356_4915!!.method3480(i_298_.toLong(), -6008) as Class348_Sub41?)
                    if (class348_sub41 == null) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = 1
                    return
                }
                if (i == 2703) {
                    val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                    if (class46!!.aClass46Array798 == null) anIntArray1149!![anInt1173++] = 0
                    else {
                        var i_299_ = class46.aClass46Array798!!.size
                        var i_300_ = 0
                        while ((i_300_ < class46.aClass46Array798!!.size)) {
                            if (class46.aClass46Array798!![i_300_] == null) {
                                i_299_ = i_300_
                                break
                            }
                            i_300_++
                        }
                        anIntArray1149!![anInt1173++] = i_299_
                        return
                    }
                    return
                }
                if (i == 2704 || i == 2705) {
                    anInt1173 -= 2
                    val i_301_ = anIntArray1149!![anInt1173]
                    val i_302_ = anIntArray1149!![anInt1173 + 1]
                    val class348_sub41 = (Class125.aClass356_4915!!.method3480(i_301_.toLong(), -6008) as Class348_Sub41?)
                    if (class348_sub41 != null && (class348_sub41.anInt7050 == i_302_)) anIntArray1149!![anInt1173++] = 1
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
            } else if (i < 2900) {
                val class46 = method2570(1512932720, anIntArray1149!![--anInt1173])
                if (i == 2800) {
                    anIntArray1149!![anInt1173++] = Client.method105(class46!!)!!.method3307(11)
                    return
                }
                if (i == 2801) {
                    var i_303_ = anIntArray1149!![--anInt1173]
                    i_303_--
                    if (class46!!.aStringArray833 == null || i_303_ >= class46.aStringArray833!!.size || class46.aStringArray833!![i_303_] == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class46.aStringArray833!![i_303_]!!
                        return
                    }
                    return
                }
                if (i == 2802) {
                    if (class46!!.aString752 == null) aStringArray1152!![anInt1170++] = ""
                    else {
                        aStringArray1152!![anInt1170++] = class46.aString752!!
                        return
                    }
                    return
                }
            } else if (i < 3200) {
                if (i == 3100) {
                    val string = aStringArray1152!![--anInt1170]
                    Class191.method1429(string, 0)
                    return
                }
                if (i == 3101) {
                    anInt1173 -= 2
                    method222((Class132.aPlayer_1907), anIntArray1149!![anInt1173], 4.toByte(), anIntArray1149!![anInt1173 + 1])
                    return
                }
                if (i == 3103) {
                    Class274.method2060((-101).toByte(), true)
                    return
                }
                if (i == 3104) {
                    val string = aStringArray1152!![--anInt1170]!!
                    var i_304_ = 0
                    if (method468(string, 73)) i_304_ = Class348_Sub41.method3156(true, string)
                    anInt1163++
                    val class348_sub47 = method2148((Class348_Sub14.aClass351_6764), (Class348_Sub23_Sub2.aClass77_9029), -112)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(102.toByte(), i_304_)
                    Class348_Sub42_Sub14.method3243(116, class348_sub47)
                    return
                }
                if (i == 3105) {
                    val string = aStringArray1152!![--anInt1170]!!
                    anInt1162++
                    val class348_sub47 = method2148(Class340.aClass351_4225, (Class348_Sub23_Sub2.aClass77_9029), -96)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, string.length + 1)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                    Class348_Sub42_Sub14.method3243(-81, class348_sub47)
                    return
                }
                if (i == 3106) {
                    val string = aStringArray1152!![--anInt1170]!!
                    anInt1153++
                    val class348_sub47 = method2148((Class348_Sub40_Sub5.aClass351_9130), (Class348_Sub23_Sub2.aClass77_9029), -93)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, string.length + 1)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                    Class348_Sub42_Sub14.method3243(35, class348_sub47)
                    return
                }
                if (i == 3107) {
                    val i_305_ = anIntArray1149!![--anInt1173]
                    val string = aStringArray1152!![--anInt1170]
                    method201(i_305_, -7257, string)
                    return
                }
                if (i == 3108) {
                    anInt1173 -= 3
                    val i_306_ = anIntArray1149!![anInt1173]
                    val i_307_ = anIntArray1149!![anInt1173 + 1]
                    val i_308_ = anIntArray1149!![anInt1173 + 2]
                    val class46 = method2570(1512932720, i_308_)
                    Class100.method887(class46, i_306_, i_307_, 2147483647)
                    return
                }
                if (i == 3109) {
                    anInt1173 -= 2
                    val i_309_ = anIntArray1149!![anInt1173]
                    val i_310_ = anIntArray1149!![anInt1173 + 1]
                    val class46 = if (bool) aClass46_1169 else aClass46_1150
                    Class100.method887(class46, i_309_, i_310_, 2147483647)
                    return
                }
                if (i == 3110) {
                    val i_311_ = anIntArray1149!![--anInt1173]
                    anInt1167++
                    val class348_sub47 = method2148((Class348_Sub40_Sub12.aClass351_9189), (Class348_Sub23_Sub2.aClass77_9029), -121)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_311_)
                    Class348_Sub42_Sub14.method3243(122, class348_sub47)
                    return
                }
                if (i == 3111) {
                    anInt1173 -= 2
                    val i_312_ = anIntArray1149!![anInt1173]
                    val i_313_ = anIntArray1149!![anInt1173 + 1]
                    val class348_sub41 = (Class125.aClass356_4915!!.method3480(i_312_.toLong(), -6008) as Class348_Sub41?)
                    if (class348_sub41 != null) Class127_Sub1.method1118((class348_sub41.anInt7050 != i_313_), true, class348_sub41, 2533)
                    Class338.method2661(i_313_, i_312_, 3, true, 2)
                    return
                }
                if (i == 3112) {
                    anInt1173--
                    val i_314_ = anIntArray1149!![anInt1173]
                    val class348_sub41 = (Class125.aClass356_4915!!.method3480(i_314_.toLong(), -6008) as Class348_Sub41?)
                    if (class348_sub41 != null && class348_sub41.anInt7053 == 3) Class127_Sub1.method1118(true, true, class348_sub41, 2533)
                    return
                }
                if (i == 3113) {
                    Class239_Sub1.method1721(aStringArray1152!![--anInt1170], (-70).toByte())
                    return
                }
                if (i == 3114) {
                    anInt1173 -= 2
                    val i_315_ = anIntArray1149!![anInt1173]
                    val i_316_ = anIntArray1149!![anInt1173 + 1]
                    val string = aStringArray1152!![--anInt1170]
                    Class286_Sub2.method2144("", i_315_, (-87).toByte(), i_316_, string, "", "")
                    return
                }
                if (i == 3115) {
                    anInt1173 -= 11
                    val class221s = Class158.method1248(20)
                    val class341s = method596(20000)
                    method2051(anIntArray1149!![anInt1173 + 9], anIntArray1149!![anInt1173 + 5], class221s[anIntArray1149!![anInt1173]], (class341s[anIntArray1149!![anInt1173 + 1]]), anIntArray1149!![anInt1173 + 7], anIntArray1149!![anInt1173 + 6], anIntArray1149!![anInt1173 + 4], 111.toByte(), anIntArray1149!![anInt1173 + 10], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173 + 8])
                    return
                }
            } else if (i < 3300) {
                if (i == 3200) {
                    anInt1173 -= 3
                    Class348_Sub20.method2947(true, 255, anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173 + 2], 256)
                    return
                }
                if (i == 3201) {
                    Class151.method1212(255, anIntArray1149!![--anInt1173], -1, 50)
                    return
                }
                if (i == 3202) {
                    anInt1173 -= 2
                    Class177.method1352(anIntArray1149!![anInt1173], 255, anIntArray1149!![anInt1173 + 1], (-98).toByte())
                    return
                }
                if (i == 3203) {
                    anInt1173 -= 4
                    Class348_Sub20.method2947(true, anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173 + 2], 256)
                    return
                }
                if (i == 3204) {
                    anInt1173 -= 3
                    Class151.method1212(anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173], -1, anIntArray1149!![anInt1173 + 2])
                    return
                }
                if (i == 3205) {
                    anInt1173 -= 3
                    Class177.method1352(anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173 + 1], (-98).toByte())
                    return
                }
                if (i == 3206) {
                    anInt1173 -= 4
                    Class279.method2090(anIntArray1149!![anInt1173 + 1], 256, false, (-35).toByte(), anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173])
                    return
                }
                if (i == 3207) {
                    anInt1173 -= 4
                    Class279.method2090(anIntArray1149!![anInt1173 + 1], 256, true, (-35).toByte(), anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173])
                    return
                }
                if (i == 3208) {
                    anInt1173 -= 5
                    Class348_Sub20.method2947(true, anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173], anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173 + 4])
                    return
                }
                if (i == 3209) {
                    anInt1173 -= 5
                    Class279.method2090(anIntArray1149!![anInt1173 + 1], anIntArray1149!![anInt1173 + 4], false, (-35).toByte(), anIntArray1149!![anInt1173 + 3], anIntArray1149!![anInt1173 + 2], anIntArray1149!![anInt1173])
                    return
                }
            } else if (i < 3400) {
                if (i == 3300) {
                    anIntArray1149!![anInt1173++] = Class367_Sub11.anInt7396
                    return
                }
                if (i == 3301) {
                    anInt1173 -= 2
                    val i_317_ = anIntArray1149!![anInt1173]
                    val i_318_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = Class322.method2552(false, i_317_, i_318_, -24667)
                    return
                }
                if (i == 3302) {
                    anInt1173 -= 2
                    val i_319_ = anIntArray1149!![anInt1173]
                    val i_320_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = Class240.method1854(71, i_319_, false, i_320_)
                    return
                }
                if (i == 3303) {
                    anInt1173 -= 2
                    val i_321_ = anIntArray1149!![anInt1173]
                    val i_322_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = method532(i_322_, i_321_, false, -126)
                    return
                }
                if (i == 3304) {
                    val i_323_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Class127_Sub1.aClass271_8378!!.method2044(106, i_323_).anInt9542)
                    return
                }
                if (i == 3305) {
                    val i_324_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class161.anIntArray2145!![i_324_]
                    return
                }
                if (i == 3306) {
                    val i_325_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class256.anIntArray3295!![i_325_]
                    return
                }
                if (i == 3307) {
                    val i_326_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class186.anIntArray2497!![i_326_]
                    return
                }
                if (i == 3308) {
                    val i_327_ = (Class132.aPlayer_1907!!.plane).toInt()
                    val i_328_ = (((Class132.aPlayer_1907!!.x) shr 9) + za_Sub2.regionTileX)
                    val i_329_ = (((Class132.aPlayer_1907!!.y) shr 9) + Class90.regionTileY)
                    anIntArray1149!![anInt1173++] = (i_327_ shl 28) + (i_328_ shl 14) + i_329_
                    return
                }
                if (i == 3309) {
                    val i_330_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_330_ shr 14 and 0x3fff
                    return
                }
                if (i == 3310) {
                    val i_331_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_331_ shr 28
                    return
                }
                if (i == 3311) {
                    val i_332_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_332_ and 0x3fff
                    return
                }
                if (i == 3312) {
                    anIntArray1149!![anInt1173++] = if (Class130.aBoolean1900) 1 else 0
                    return
                }
                if (i == 3313) {
                    anInt1173 -= 2
                    val i_333_ = anIntArray1149!![anInt1173]
                    val i_334_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = Class322.method2552(true, i_333_, i_334_, -24667)
                    return
                }
                if (i == 3314) {
                    anInt1173 -= 2
                    val i_335_ = anIntArray1149!![anInt1173]
                    val i_336_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = Class240.method1854(103, i_335_, true, i_336_)
                    return
                }
                if (i == 3315) {
                    anInt1173 -= 2
                    val i_337_ = anIntArray1149!![anInt1173]
                    val i_338_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = method532(i_338_, i_337_, true, 126)
                    return
                }
                if (i == 3316) {
                    if (Class192.anInt2581 >= 2) anIntArray1149!![anInt1173++] = Class192.anInt2581
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3317) {
                    anIntArray1149!![anInt1173++] = Class289.anInt3699
                    return
                }
                if (i == 3318) {
                    anIntArray1149!![anInt1173++] = Class3.aClass161_125!!.anInt2143
                    return
                }
                if (i == 3321) {
                    anIntArray1149!![anInt1173++] = Class309.anInt4816
                    return
                }
                if (i == 3322) {
                    anIntArray1149!![anInt1173++] = Class128.anInt1872
                    return
                }
                if (i == 3323) {
                    if (Class125.anInt4919 >= 5 && Class125.anInt4919 <= 9) anIntArray1149!![anInt1173++] = 1
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3324) {
                    if (Class125.anInt4919 >= 5 && Class125.anInt4919 <= 9) anIntArray1149!![anInt1173++] = Class125.anInt4919
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3325) {
                    anIntArray1149!![anInt1173++] = if (Class206.aBoolean4888) 1 else 0
                    return
                }
                if (i == 3326) {
                    anIntArray1149!![anInt1173++] = (Class132.aPlayer_1907!!.anInt10516)
                    return
                }
                if (i == 3327) {
                    anIntArray1149!![anInt1173++] = if ((Class132.aPlayer_1907!!.aClass154_10536) != null && Class132.aPlayer_1907!!.aClass154_10536!!.aBoolean2100) 1 else 0
                    return
                }
                if (i == 3329) {
                    anIntArray1149!![anInt1173++] = if (Class50_Sub2.aBoolean5233) 1 else 0
                    return
                }
                if (i == 3330) {
                    val i_339_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class307.method2301(35.toByte(), i_339_, false)
                    return
                }
                if (i == 3331) {
                    anInt1173 -= 2
                    val i_340_ = anIntArray1149!![anInt1173]
                    val i_341_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = Class61.method592(false, (-128).toByte(), false, i_340_, i_341_)
                    return
                }
                if (i == 3332) {
                    anInt1173 -= 2
                    val i_342_ = anIntArray1149!![anInt1173]
                    val i_343_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = Class61.method592(true, (-128).toByte(), false, i_342_, i_343_)
                    return
                }
                if (i == 3333) {
                    anIntArray1149!![anInt1173++] = RuntimeException_Sub1.anInt4596
                    return
                }
                if (i == 3335) {
                    anIntArray1149!![anInt1173++] = Class348_Sub33.anInt6967
                    return
                }
                if (i == 3336) {
                    anInt1173 -= 4
                    var i_344_ = anIntArray1149!![anInt1173]
                    val i_345_ = anIntArray1149!![anInt1173 + 1]
                    val i_346_ = anIntArray1149!![anInt1173 + 2]
                    val i_347_ = anIntArray1149!![anInt1173 + 3]
                    i_344_ += i_345_ shl 14
                    i_344_ += i_346_ shl 28
                    i_344_ += i_347_
                    anIntArray1149!![anInt1173++] = i_344_
                    return
                }
                if (i == 3337) {
                    anIntArray1149!![anInt1173++] = Class202.anInt2670
                    return
                }
                if (i == 3338) {
                    anIntArray1149!![anInt1173++] = Class284.method2116(-26584)
                    return
                }
                if (i == 3339) {
                    anIntArray1149!![anInt1173++] = 0
                    return
                }
                if (i == 3340) {
                    anIntArray1149!![anInt1173++] = if (Class175.aBoolean2329) 1 else 0
                    return
                }
                if (i == 3341) {
                    anIntArray1149!![anInt1173++] = if (Class375.aBoolean4540) 1 else 0
                    return
                }
                if (i == 3342) {
                    anIntArray1149!![anInt1173++] = Class258_Sub4.aClass373_8552!!.method3597(true)
                    return
                }
                if (i == 3343) {
                    anIntArray1149!![anInt1173++] = Class258_Sub4.aClass373_8552!!.method3594(127.toByte())
                    return
                }
                if (i == 3344) {
                    aStringArray1152!![anInt1170++] = Class314_Sub1.method2347((-119).toByte())!!
                    return
                }
                if (i == 3345) {
                    aStringArray1152!![anInt1170++] = method217(112.toByte())!!
                    return
                }
                if (i == 3346) {
                    anIntArray1149!![anInt1173++] = Class318_Sub1_Sub5_Sub1.method2489((-106).toByte())
                    return
                }
                if (i == 3347) {
                    anIntArray1149!![anInt1173++] = Class337.anInt4179
                    return
                }
                if (i == 3349) {
                    anIntArray1149!![anInt1173++] = Class132.aPlayer_1907!!.aClass264_10217.method2019((-31).toByte()) shr 3
                    return
                }
                if (i == 3351) {
                    anIntArray1149!![anInt1173++] = if (Class258_Sub4.aClass373_8552!!.method3595(-83)) 1 else 0
                    anIntArray1149!![anInt1173++] = if (Class258_Sub4.aClass373_8552!!.method3588(-121)) 1 else 0
                    anIntArray1149!![anInt1173++] = if (Class258_Sub4.aClass373_8552!!.method3590(125.toByte())) 1 else 0
                    return
                }
            } else if (i < 3500) {
                if (i == 3400) {
                    anInt1173 -= 2
                    val i_348_ = anIntArray1149!![anInt1173]
                    val i_349_ = anIntArray1149!![anInt1173 + 1]
                    val class117 = Class348_Sub7.aClass33_6653!!.method337(true, i_348_)
                    aStringArray1152!![anInt1170++] = class117.method1074(i_349_, 124)
                    return
                }
                if (i == 3408) {
                    anInt1173 -= 4
                    val i_350_ = anIntArray1149!![anInt1173]
                    val i_351_ = anIntArray1149!![anInt1173 + 1]
                    val i_352_ = anIntArray1149!![anInt1173 + 2]
                    val i_353_ = anIntArray1149!![anInt1173 + 3]
                    val class117 = Class348_Sub7.aClass33_6653!!.method337(true, i_352_)
                    if (class117.aChar1778.code != i_350_ || class117.aChar1779.code != i_351_) throw RuntimeException("C3408-1 " + i_352_ + "-" + i_353_)
                    if (i_351_ == 115) aStringArray1152!![anInt1170++] = class117.method1074(i_353_, 119)
                    else {
                        anIntArray1149!![anInt1173++] = class117.method1073(false, i_353_)
                        return
                    }
                    return
                }
                if (i == 3409) {
                    anInt1173 -= 3
                    val i_354_ = anIntArray1149!![anInt1173]
                    val i_355_ = anIntArray1149!![anInt1173 + 1]
                    val i_356_ = anIntArray1149!![anInt1173 + 2]
                    if (i_355_ == -1) throw RuntimeException("C3409-2")
                    val class117 = Class348_Sub7.aClass33_6653!!.method337(true, i_355_)
                    if (class117.aChar1779.code != i_354_) throw RuntimeException("C3409-1")
                    anIntArray1149!![anInt1173++] = if (class117.method1067(true, i_356_)) 1 else 0
                    return
                }
                if (i == 3410) {
                    val i_357_ = anIntArray1149!![--anInt1173]
                    val string = aStringArray1152!![--anInt1170]!!
                    if (i_357_ == -1) throw RuntimeException("C3410-2")
                    val class117 = Class348_Sub7.aClass33_6653!!.method337(true, i_357_)
                    if (class117.aChar1779 != 's') throw RuntimeException("C3410-1")
                    anIntArray1149!![anInt1173++] = if (class117.method1066(false, string)) 1 else 0
                    return
                }
                if (i == 3411) {
                    val i_358_ = anIntArray1149!![--anInt1173]
                    val class117 = Class348_Sub7.aClass33_6653!!.method337(true, i_358_)
                    anIntArray1149!![anInt1173++] = class117.aClass356_1767!!.method3474(1)
                    return
                }
            } else if (i < 3700) {
                if (i == 3600) {
                    if (Class125.anInt4930 == 0) anIntArray1149!![anInt1173++] = -2
                    else {
                        if (Class125.anInt4930 == 1) anIntArray1149!![anInt1173++] = -1
                        else {
                            anIntArray1149!![anInt1173++] = Class348_Sub40_Sub30.anInt9383
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 3601) {
                    val i_359_ = anIntArray1149!![--anInt1173]
                    if (Class125.anInt4930 == 2 && i_359_ < Class348_Sub40_Sub30.anInt9383) {
                        aStringArray1152!![anInt1170++] = Class83.aStringArray1441!![i_359_]
                        if (Class286_Sub2.aStringArray6205!![i_359_] != null) aStringArray1152!![anInt1170++] = Class286_Sub2.aStringArray6205!![i_359_]!!
                        else aStringArray1152!![anInt1170++] = ""
                    } else {
                        aStringArray1152!![anInt1170++] = ""
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3602) {
                    val i_360_ = anIntArray1149!![--anInt1173]
                    if (Class125.anInt4930 == 2 && i_360_ < Class348_Sub40_Sub30.anInt9383) anIntArray1149!![anInt1173++] = ha.anIntArray4578!![i_360_]
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3603) {
                    val i_361_ = anIntArray1149!![--anInt1173]
                    if (Class125.anInt4930 == 2 && i_361_ < Class348_Sub40_Sub30.anInt9383) anIntArray1149!![anInt1173++] = Class172.anIntArray2280!![i_361_]
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3604) {
                    val string = aStringArray1152!![--anInt1170]!!
                    val i_362_ = anIntArray1149!![--anInt1173]
                    Class261.method1982(16, i_362_, string)
                    return
                }
                if (i == 3605) {
                    val string = aStringArray1152!![--anInt1170]
                    method3128(-81, string)
                    return
                }
                if (i == 3606) {
                    val string = aStringArray1152!![--anInt1170]
                    method2165(true, string)
                    return
                }
                if (i == 3607) {
                    val string = aStringArray1152!![--anInt1170]
                    method317(string, 117, false)
                    return
                }
                if (i == 3608) {
                    val string = aStringArray1152!![--anInt1170]
                    method3538(true, string)
                    return
                }
                if (i == 3609) {
                    var string = aStringArray1152!![--anInt1170]!!
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7)
                    anIntArray1149!![anInt1173++] = (if (Class348_Sub11.method2797(string, (-63).toByte())) 1 else 0)
                    return
                }
                if (i == 3610) {
                    val i_363_ = anIntArray1149!![--anInt1173]
                    if (Class125.anInt4930 == 2 && i_363_ < Class348_Sub40_Sub30.anInt9383) aStringArray1152!![anInt1170++] = Class285.aStringArray4744!![i_363_]!!
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3611) {
                    if (Class50.aString863 == null) {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    } else aStringArray1152!![anInt1170++] = Class157.method1245(Class50.aString863!!, false)
                    return
                }
                if (i == 3612) {
                    if (Class50.aString863 == null) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = Class37.anInt496
                    return
                }
                if (i == 3613) {
                    val i_364_ = anIntArray1149!![--anInt1173]
                    if (Class50.aString863 != null && i_364_ < Class37.anInt496) aStringArray1152!![anInt1170++] = (Class169.aClass19Array2261!![i_364_]!!.aString314!!)
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3614) {
                    val i_365_ = anIntArray1149!![--anInt1173]
                    if (Class50.aString863 != null && i_365_ < Class37.anInt496) anIntArray1149!![anInt1173++] = (Class169.aClass19Array2261!![i_365_]!!.anInt308)
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3615) {
                    val i_366_ = anIntArray1149!![--anInt1173]
                    if (Class50.aString863 != null && i_366_ < Class37.anInt496) anIntArray1149!![anInt1173++] = (Class169.aClass19Array2261!![i_366_]!!.aByte310).toInt()
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3616) {
                    anIntArray1149!![anInt1173++] = Class219.aByte2871.toInt()
                    return
                }
                if (i == 3617) {
                    val string = aStringArray1152!![--anInt1170]!!
                    Class306.method2298((-117).toByte(), string)
                    return
                }
                if (i == 3618) {
                    anIntArray1149!![anInt1173++] = Class119_Sub1.aByte4702.toInt()
                    return
                }
                if (i == 3619) {
                    val string = aStringArray1152!![--anInt1170]!!
                    Class318_Sub1_Sub1_Sub1.method2399(string, -117)
                    return
                }
                if (i == 3620) {
                    Class242.method1867(77)
                    return
                }
                if (i == 3621) {
                    if (Class125.anInt4930 == 0) anIntArray1149!![anInt1173++] = -1
                    else {
                        anIntArray1149!![anInt1173++] = Class348_Sub42_Sub12.anInt9604
                        return
                    }
                    return
                }
                if (i == 3622) {
                    val i_367_ = anIntArray1149!![--anInt1173]
                    if (Class125.anInt4930 != 0 && i_367_ < Class348_Sub42_Sub12.anInt9604) {
                        aStringArray1152!![anInt1170++] = Class51.aStringArray932!![i_367_]!!
                        if (Class348_Sub40_Sub21.aStringArray9275!![i_367_] != null) aStringArray1152!![anInt1170++] = (Class348_Sub40_Sub21.aStringArray9275!![i_367_]!!)
                        else aStringArray1152!![anInt1170++] = ""
                    } else {
                        aStringArray1152!![anInt1170++] = ""
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3623) {
                    var string = aStringArray1152!![--anInt1170]!!
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7)
                    anIntArray1149!![anInt1173++] = if (Class351.method3455(string, 28280)) 1 else 0
                    return
                }
                if (i == 3624) {
                    val i_368_ = anIntArray1149!![--anInt1173]
                    if (Class169.aClass19Array2261 != null && i_368_ < Class37.anInt496 && (Class169.aClass19Array2261!![i_368_]!!.aString306.equals(Class132.aPlayer_1907!!.aString10544, ignoreCase = true))) anIntArray1149!![anInt1173++] = 1
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3625) {
                    if (Class348_Sub21.aString6854 == null) {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    } else aStringArray1152!![anInt1170++] = Class348_Sub21.aString6854
                    return
                }
                if (i == 3626) {
                    val i_369_ = anIntArray1149!![--anInt1173]
                    if (Class50.aString863 != null && i_369_ < Class37.anInt496) aStringArray1152!![anInt1170++] = (Class169.aClass19Array2261!![i_369_]!!.aString313!!)
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3627) {
                    val i_370_ = anIntArray1149!![--anInt1173]
                    if (Class125.anInt4930 == 2 && i_370_ >= 0 && i_370_ < Class348_Sub40_Sub30.anInt9383) anIntArray1149!![anInt1173++] = if (Class122.aBooleanArray1806!![i_370_]) 1 else 0
                    else {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    }
                    return
                }
                if (i == 3628) {
                    var string = aStringArray1152!![--anInt1170]!!
                    if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) string = string.substring(7)
                    anIntArray1149!![anInt1173++] = Class300.method2274(string, -91)
                    return
                }
                if (i == 3629) {
                    anIntArray1149!![anInt1173++] = ha.anInt4583
                    return
                }
                if (i == 3630) {
                    val string = aStringArray1152!![--anInt1170]
                    method317(string, 119, true)
                    return
                }
                if (i == 3631) {
                    val i_371_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Class367_Sub3.aBooleanArray7304!![i_371_]) 1 else 0
                    return
                }
                if (i == 3632) {
                    val i_372_ = anIntArray1149!![--anInt1173]
                    if (Class50.aString863 != null && i_372_ < Class37.anInt496) aStringArray1152!![anInt1170++] = (Class169.aClass19Array2261!![i_372_]!!.aString306!!)
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 3633) {
                    val i_373_ = anIntArray1149!![--anInt1173]
                    if (Class125.anInt4930 != 0 && i_373_ < Class348_Sub42_Sub12.anInt9604) aStringArray1152!![anInt1170++] = Class122.aStringArray1808!![i_373_]
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
            } else if (i < 4000) {
                if (i == 3903) {
                    val i_374_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Class239_Sub26.aClass54Array6114!![i_374_]!!.method499(21110)
                    return
                }
                if (i == 3904) {
                    val i_375_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Class239_Sub26.aClass54Array6114!![i_375_]!!.anInt969)
                    return
                }
                if (i == 3905) {
                    val i_376_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Class239_Sub26.aClass54Array6114!![i_376_]!!.anInt976)
                    return
                }
                if (i == 3906) {
                    val i_377_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Class239_Sub26.aClass54Array6114!![i_377_]!!.anInt967)
                    return
                }
                if (i == 3907) {
                    val i_378_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Class239_Sub26.aClass54Array6114!![i_378_]!!.anInt977)
                    return
                }
                if (i == 3908) {
                    val i_379_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Class239_Sub26.aClass54Array6114!![i_379_]!!.anInt973)
                    return
                }
                if (i == 3910) {
                    val i_380_ = anIntArray1149!![--anInt1173]
                    val i_381_ = Class239_Sub26.aClass54Array6114!![i_380_]!!.method502(100.toByte())
                    anIntArray1149!![anInt1173++] = if (i_381_ == 0) 1 else 0
                    return
                }
                if (i == 3911) {
                    val i_382_ = anIntArray1149!![--anInt1173]
                    val i_383_ = Class239_Sub26.aClass54Array6114!![i_382_]!!.method502(118.toByte())
                    anIntArray1149!![anInt1173++] = if (i_383_ == 2) 1 else 0
                    return
                }
                if (i == 3912) {
                    val i_384_ = anIntArray1149!![--anInt1173]
                    val i_385_ = Class239_Sub26.aClass54Array6114!![i_384_]!!.method502((-100).toByte())
                    anIntArray1149!![anInt1173++] = if (i_385_ == 5) 1 else 0
                    return
                }
                if (i == 3913) {
                    val i_386_ = anIntArray1149!![--anInt1173]
                    val i_387_ = Class239_Sub26.aClass54Array6114!![i_386_]!!.method502(55.toByte())
                    anIntArray1149!![anInt1173++] = if (i_387_ == 1) 1 else 0
                    return
                }
            } else if (i < 4100) {
                if (i == 4000) {
                    anInt1173 -= 2
                    val i_388_ = anIntArray1149!![anInt1173]
                    val i_389_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_388_ + i_389_
                    return
                }
                if (i == 4001) {
                    anInt1173 -= 2
                    val i_390_ = anIntArray1149!![anInt1173]
                    val i_391_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_390_ - i_391_
                    return
                }
                if (i == 4002) {
                    anInt1173 -= 2
                    val i_392_ = anIntArray1149!![anInt1173]
                    val i_393_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_392_ * i_393_
                    return
                }
                if (i == 4003) {
                    anInt1173 -= 2
                    val i_394_ = anIntArray1149!![anInt1173]
                    val i_395_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_394_ / i_395_
                    return
                }
                if (i == 4004) {
                    val i_396_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Math.random() * i_396_.toDouble()).toInt()
                    return
                }
                if (i == 4005) {
                    val i_397_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = (Math.random() * (i_397_ + 1).toDouble()).toInt()
                    return
                }
                if (i == 4006) {
                    anInt1173 -= 5
                    val i_398_ = anIntArray1149!![anInt1173]
                    val i_399_ = anIntArray1149!![anInt1173 + 1]
                    val i_400_ = anIntArray1149!![anInt1173 + 2]
                    val i_401_ = anIntArray1149!![anInt1173 + 3]
                    val i_402_ = anIntArray1149!![anInt1173 + 4]
                    anIntArray1149!![anInt1173++] = i_398_ + ((i_399_ - i_398_) * (i_402_ - i_400_) / (i_401_ - i_400_))
                    return
                }
                if (i == 4007) {
                    anInt1173 -= 2
                    val l = anIntArray1149!![anInt1173].toLong()
                    val l_403_ = anIntArray1149!![anInt1173 + 1].toLong()
                    anIntArray1149!![anInt1173++] = (l + l * l_403_ / 100L).toInt()
                    return
                }
                if (i == 4008) {
                    anInt1173 -= 2
                    val i_404_ = anIntArray1149!![anInt1173]
                    val i_405_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_404_ or (1 shl i_405_)
                    return
                }
                if (i == 4009) {
                    anInt1173 -= 2
                    val i_406_ = anIntArray1149!![anInt1173]
                    val i_407_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_406_ and -1 - (1 shl i_407_)
                    return
                }
                if (i == 4010) {
                    anInt1173 -= 2
                    val i_408_ = anIntArray1149!![anInt1173]
                    val i_409_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = if ((i_408_ and (1 shl i_409_)) != 0) 1 else 0
                    return
                }
                if (i == 4011) {
                    anInt1173 -= 2
                    val i_410_ = anIntArray1149!![anInt1173]
                    val i_411_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_410_ % i_411_
                    return
                }
                if (i == 4012) {
                    anInt1173 -= 2
                    val i_412_ = anIntArray1149!![anInt1173]
                    val i_413_ = anIntArray1149!![anInt1173 + 1]
                    if (i_412_ == 0) anIntArray1149!![anInt1173++] = 0
                    else {
                        anIntArray1149!![anInt1173++] = i_412_.toDouble().pow(i_413_.toDouble()).toInt()
                        return
                    }
                    return
                }
                if (i == 4013) {
                    anInt1173 -= 2
                    val i_414_ = anIntArray1149!![anInt1173]
                    val i_415_ = anIntArray1149!![anInt1173 + 1]
                    if (i_414_ == 0) anIntArray1149!![anInt1173++] = 0
                    else {
                        if (i_415_ == 0) anIntArray1149!![anInt1173++] = 2147483647
                        else {
                            anIntArray1149!![anInt1173++] = i_414_.toDouble().pow(1.0 / i_415_.toDouble()).toInt()
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 4014) {
                    anInt1173 -= 2
                    val i_416_ = anIntArray1149!![anInt1173]
                    val i_417_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_416_ and i_417_
                    return
                }
                if (i == 4015) {
                    anInt1173 -= 2
                    val i_418_ = anIntArray1149!![anInt1173]
                    val i_419_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = i_418_ or i_419_
                    return
                }
                if (i == 4016) {
                    anInt1173 -= 2
                    val i_420_ = anIntArray1149!![anInt1173]
                    val i_421_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = min(i_420_, i_421_)
                    return
                }
                if (i == 4017) {
                    anInt1173 -= 2
                    val i_422_ = anIntArray1149!![anInt1173]
                    val i_423_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = max(i_422_, i_423_)
                    return
                }
                if (i == 4018) {
                    anInt1173 -= 3
                    val l = anIntArray1149!![anInt1173].toLong()
                    val l_424_ = anIntArray1149!![anInt1173 + 1].toLong()
                    val l_425_ = anIntArray1149!![anInt1173 + 2].toLong()
                    anIntArray1149!![anInt1173++] = (l * l_425_ / l_424_).toInt()
                    return
                }
                if (i == 4019) {
                    anInt1173 -= 2
                    val i_426_ = anIntArray1149!![anInt1173]
                    val i_427_ = anIntArray1149!![anInt1173 + 1]
                    if (i_426_ > 700 || i_427_ > 700) anIntArray1149!![anInt1173++] = 256
                    val d = ((Math.random() * (i_427_ + i_426_).toDouble() - i_426_.toDouble() + 800.0) / 100.0)
                    anIntArray1149!![anInt1173++] = (2.0.pow(d) + 0.5).toInt()
                    return
                }
            } else if (i < 4200) {
                if (i == 4100) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_428_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = string + i_428_
                    return
                }
                if (i == 4101) {
                    anInt1170 -= 2
                    val string = aStringArray1152!![anInt1170]
                    val string_429_ = aStringArray1152!![anInt1170 + 1]
                    aStringArray1152!![anInt1170++] = string + string_429_
                    return
                }
                if (i == 4102) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_430_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = string + Class140.method1171(i_430_, 76, true)
                    return
                }
                if (i == 4103) {
                    val string = aStringArray1152!![--anInt1170]!!
                    aStringArray1152!![anInt1170++] = string.lowercase(Locale.getDefault())
                    return
                }
                if (i == 4104) {
                    aStringArray1152!![anInt1170++] = method709(anIntArray1149!![--anInt1173])
                    return
                }
                if (i == 4105) {
                    anInt1170 -= 2
                    val string = aStringArray1152!![anInt1170]
                    val string_431_ = aStringArray1152!![anInt1170 + 1]
                    if ((Class132.aPlayer_1907!!.aClass154_10536) != null && Class132.aPlayer_1907!!.aClass154_10536!!.aBoolean2100) aStringArray1152!![anInt1170++] = string_431_
                    else {
                        aStringArray1152!![anInt1170++] = string
                        return
                    }
                    return
                }
                if (i == 4106) {
                    val i_432_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = i_432_.toString()
                    return
                }
                if (i == 4107) {
                    anInt1170 -= 2
                    anIntArray1149!![anInt1173++] = method1811(9152, (aStringArray1152!![anInt1170 + 1]), Class348_Sub33.anInt6967, (aStringArray1152!![anInt1170]))
                    return
                }
                if (i == 4108) {
                    val string = aStringArray1152!![--anInt1170]
                    anInt1173 -= 2
                    val i_433_ = anIntArray1149!![anInt1173]
                    val i_434_ = anIntArray1149!![anInt1173 + 1]
                    val class143 = method1819(i_434_, 0, -123, Class104.aClass45_1627!!)
                    anIntArray1149!![anInt1173++] = class143!!.method1190(Class113.aClass105Array1744, 1, string, i_433_)
                    return
                }
                if (i == 4109) {
                    val string = aStringArray1152!![--anInt1170]
                    anInt1173 -= 2
                    val i_435_ = anIntArray1149!![anInt1173]
                    val i_436_ = anIntArray1149!![anInt1173 + 1]
                    val class143 = method1819(i_436_, 0, -79, Class104.aClass45_1627!!)
                    anIntArray1149!![anInt1173++] = class143!!.method1187(string, false, i_435_, Class113.aClass105Array1744)
                    return
                }
                if (i == 4110) {
                    anInt1170 -= 2
                    val string = aStringArray1152!![anInt1170]
                    val string_437_ = aStringArray1152!![anInt1170 + 1]
                    if (anIntArray1149!![--anInt1173] == 1) aStringArray1152!![anInt1170++] = string
                    else {
                        aStringArray1152!![anInt1170++] = string_437_
                        return
                    }
                    return
                }
                if (i == 4111) {
                    val string = aStringArray1152!![--anInt1170]!!
                    aStringArray1152!![anInt1170++] = method572(string, 23034)
                    return
                }
                if (i == 4112) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_438_ = anIntArray1149!![--anInt1173]
                    if (i_438_ == -1) throw RuntimeException("null char")
                    aStringArray1152!![anInt1170++] = string + i_438_.toChar()
                    return
                }
                if (i == 4113) {
                    val i_439_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = method708(i_439_.toChar())
                    return
                }
                if (i == 4114) {
                    val i_440_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Npc.method2446(i_440_.toChar(), 105.toByte())) 1 else 0
                    return
                }
                if (i == 4115) {
                    val i_441_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Class215.method1581(-93, i_441_.toChar())) 1 else 0
                    return
                }
                if (i == 4116) {
                    val i_442_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Class334.method2647(true, i_442_.toChar())) 1 else 0
                    return
                }
                if (i == 4117) {
                    val string = aStringArray1152!![--anInt1170]
                    if (string == null) {
                        anIntArray1149!![anInt1173++] = 0
                        return
                    } else anIntArray1149!![anInt1173++] = string.length
                    return
                }
                if (i == 4118) {
                    val string = aStringArray1152!![--anInt1170]!!
                    anInt1173 -= 2
                    val i_443_ = anIntArray1149!![anInt1173]
                    val i_444_ = anIntArray1149!![anInt1173 + 1]
                    aStringArray1152!![anInt1170++] = string.substring(i_443_, i_444_)
                    return
                }
                if (i == 4119) {
                    val string = aStringArray1152!![--anInt1170]!!
                    val stringbuffer = StringBuffer(string.length)
                    var bool_445_ = false
                    for (i_446_ in 0..<string.length) {
                        val c = string.get(i_446_)
                        if (c == '<') bool_445_ = true
                        else if (c == '>') bool_445_ = false
                        else if (!bool_445_) stringbuffer.append(c)
                    }
                    aStringArray1152!![anInt1170++] = stringbuffer.toString()
                    return
                }
                if (i == 4120) {
                    val string = aStringArray1152!![--anInt1170]!!
                    anInt1173 -= 2
                    val i_447_ = anIntArray1149!![anInt1173]
                    val i_448_ = anIntArray1149!![anInt1173 + 1]
                    anIntArray1149!![anInt1173++] = string.indexOf(i_447_.toChar(), i_448_)
                    return
                }
                if (i == 4121) {
                    anInt1170 -= 2
                    val string = aStringArray1152!![anInt1170]!!
                    val string_449_ = aStringArray1152!![anInt1170 + 1]!!
                    val i_450_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = string.indexOf(string_449_, i_450_)
                    return
                }
                if (i == 4122) {
                    val i_451_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_451_.toChar().lowercaseChar().code
                    return
                }
                if (i == 4123) {
                    val i_452_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = i_452_.toChar().uppercaseChar().code
                    return
                }
                if (i == 4124) {
                    val bool_453_ = anIntArray1149!![--anInt1173] != 0
                    val i_454_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = Class357.method3486(0, bool_453_, Class348_Sub33.anInt6967, i_454_.toLong(), 16980)
                    return
                }
                if (i == 4125) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_455_ = anIntArray1149!![--anInt1173]
                    val class143 = method1819(i_455_, 0, -114, Class104.aClass45_1627!!)
                    anIntArray1149!![anInt1173++] = class143!!.method1186(string, Class113.aClass105Array1744, false)
                    return
                }
            } else if (i < 4300) {
                if (i == 4200) {
                    val i_456_ = anIntArray1149!![--anInt1173]
                    aStringArray1152!![anInt1170++] = (Exception_Sub1.aClass255_112!!.method1940(-52, i_456_).aString2795) + Loader.getDebug(i_456_)
                    return
                }
                if (i == 4201) {
                    anInt1173 -= 2
                    val i_457_ = anIntArray1149!![anInt1173]
                    val i_458_ = anIntArray1149!![anInt1173 + 1]
                    val class213 = Exception_Sub1.aClass255_112!!.method1940(-79, i_457_)
                    if (i_458_ >= 1 && i_458_ <= 5 && (class213.aStringArray2811[i_458_ - 1] != null)) aStringArray1152!![anInt1170++] = (class213.aStringArray2811[i_458_ - 1])
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 4202) {
                    anInt1173 -= 2
                    val i_459_ = anIntArray1149!![anInt1173]
                    val i_460_ = anIntArray1149!![anInt1173 + 1]
                    val class213 = Exception_Sub1.aClass255_112!!.method1940(112, i_459_)
                    if (i_460_ >= 1 && i_460_ <= 5 && (class213.aStringArray2763!![i_460_ - 1] != null)) aStringArray1152!![anInt1170++] = (class213.aStringArray2763!![i_460_ - 1])
                    else {
                        aStringArray1152!![anInt1170++] = ""
                        return
                    }
                    return
                }
                if (i == 4203) {
                    val i_461_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Exception_Sub1.aClass255_112!!.method1940(-52, i_461_).anInt2819
                    return
                }
                if (i == 4204) {
                    val i_462_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Exception_Sub1.aClass255_112!!.method1940(82, i_462_).anInt2820 == 1) 1 else 0
                    return
                }
                if (i == 4205) {
                    val i_463_ = anIntArray1149!![--anInt1173]
                    val class213 = Exception_Sub1.aClass255_112!!.method1940(80, i_463_)
                    if (class213.anInt2833 == -1 && class213.anInt2758 >= 0) anIntArray1149!![anInt1173++] = class213.anInt2758
                    else {
                        anIntArray1149!![anInt1173++] = i_463_
                        return
                    }
                    return
                }
                if (i == 4206) {
                    val i_464_ = anIntArray1149!![--anInt1173]
                    val class213 = Exception_Sub1.aClass255_112!!.method1940(-56, i_464_)
                    if (class213.anInt2833 >= 0 && class213.anInt2758 >= 0) anIntArray1149!![anInt1173++] = class213.anInt2758
                    else {
                        anIntArray1149!![anInt1173++] = i_464_
                        return
                    }
                    return
                }
                if (i == 4207) {
                    val i_465_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = if (Exception_Sub1.aClass255_112!!.method1940(87, i_465_).aBoolean2783) 1 else 0
                    return
                }
                if (i == 4208) {
                    anInt1173 -= 2
                    val i_466_ = anIntArray1149!![anInt1173]
                    val i_467_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = Class101_Sub3.aClass326_5764!!.method2600(i_467_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (Exception_Sub1.aClass255_112!!.method1940(-96, i_466_).method1561(class254.aString3258, i_467_, -1511086397))
                    else {
                        anIntArray1149!![anInt1173++] = (Exception_Sub1.aClass255_112!!.method1940(-82, i_466_).method1567(class254.anInt3256, -106, i_467_))
                        return
                    }
                    return
                }
                if (i == 4209) {
                    anInt1173 -= 2
                    val i_468_ = anIntArray1149!![anInt1173]
                    val i_469_ = anIntArray1149!![anInt1173 + 1] - 1
                    val class213 = Exception_Sub1.aClass255_112!!.method1940(108, i_468_)
                    if (class213.anInt2766 == i_469_) anIntArray1149!![anInt1173++] = class213.anInt2818
                    else {
                        if (class213.anInt2774 == i_469_) anIntArray1149!![anInt1173++] = class213.anInt2817
                        else {
                            anIntArray1149!![anInt1173++] = -1
                            return
                        }
                        return
                    }
                    return
                }
                if (i == 4210) {
                    val string = aStringArray1152!![--anInt1170]
                    val i_470_ = anIntArray1149!![--anInt1173]
                    Class217.method1586(i_470_ == 1, (-108).toByte(), string)
                    anIntArray1149!![anInt1173++] = Class76.anInt1285
                    return
                }
                if (i == 4211) {
                    if (Class192.aShortArray2579 == null || Class148.anInt2037 >= Class76.anInt1285) anIntArray1149!![anInt1173++] = -1
                    else {
                        anIntArray1149!![anInt1173++] = (Class192.aShortArray2579!![Class148.anInt2037++].toInt() and 0xffff)
                        return
                    }
                    return
                }
                if (i == 4212) {
                    Class148.anInt2037 = 0
                    return
                }
                if (i == 4213) {
                    val i_471_ = anIntArray1149!![--anInt1173]
                    anIntArray1149!![anInt1173++] = Exception_Sub1.aClass255_112!!.method1940(-115, i_471_).anInt2802
                    return
                }
                if (i == 4214) {
                    val string = aStringArray1152!![--anInt1170]
                    anInt1173 -= 3
                    val i_472_ = anIntArray1149!![anInt1173]
                    val i_473_ = anIntArray1149!![anInt1173 + 1]
                    val i_474_ = anIntArray1149!![anInt1173 + 2]
                    method259(i_474_, -125, i_472_ == 1, string, i_473_)
                    anIntArray1149!![anInt1173++] = Class76.anInt1285
                    return
                }
                if (i == 4215) {
                    anInt1170 -= 2
                    anInt1173 -= 2
                    val string = aStringArray1152!![anInt1170]
                    val i_475_ = anIntArray1149!![anInt1173]
                    val i_476_ = anIntArray1149!![anInt1173 + 1]
                    val string_477_ = aStringArray1152!![anInt1170 + 1]
                    method1719(i_475_ == 1, string, string_477_, i_476_, -1)
                    anIntArray1149!![anInt1173++] = Class76.anInt1285
                    return
                }
            } else if (i < 4400) {
                if (i == 4300) {
                    anInt1173 -= 2
                    val i_478_ = anIntArray1149!![anInt1173]
                    val i_479_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = Class101_Sub3.aClass326_5764!!.method2600(i_479_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (Class189.aClass278_2529!!.method2079(i_478_, -1).method801(17.toByte(), i_479_, class254.aString3258))
                    else {
                        anIntArray1149!![anInt1173++] = (Class189.aClass278_2529!!.method2079(i_478_, -1).method805(class254.anInt3256, i_479_, 48))
                        return
                    }
                    return
                }
            } else if (i < 4500) {
                if (i == 4400) {
                    anInt1173 -= 2
                    val i_480_ = anIntArray1149!![anInt1173]
                    val i_481_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = Class101_Sub3.aClass326_5764!!.method2600(i_481_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, i_480_).method475(class254.aString3258, i_481_, -16)!!)
                    else {
                        anIntArray1149!![anInt1173++] = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, i_480_).method487(i_481_, class254.anInt3256, 81))
                        return
                    }
                    return
                }
            } else if (i < 4600) {
                if (i == 4500) {
                    anInt1173 -= 2
                    val i_482_ = anIntArray1149!![anInt1173]
                    val i_483_ = anIntArray1149!![anInt1173 + 1]
                    val class254 = Class101_Sub3.aClass326_5764!!.method2600(i_483_, 28364)
                    if (class254.method1925(false)) aStringArray1152!![anInt1170++] = (Class136.aClass65_4787!!.method700(i_482_, -121).method3170(-250, class254.aString3258, i_483_))
                    else {
                        anIntArray1149!![anInt1173++] = (Class136.aClass65_4787!!.method700(i_482_, 81).method3166(i_483_, class254.anInt3256, 124.toByte()))
                        return
                    }
                    return
                }
            } else if (i < 4700 && i == 4600) {
                val i_484_ = anIntArray1149!![--anInt1173]
                val class225 = Class64_Sub3.aClass261_5558!!.method1983(i_484_, 32)
                if (class225.anIntArray2915 != null && class225.anIntArray2915!!.size > 0) {
                    var i_485_ = 0
                    var i_486_ = class225.anIntArray2929!![0]
                    for (i_487_ in 1..<class225.anIntArray2915!!.size) {
                        if (class225.anIntArray2929!![i_487_] > i_486_) {
                            i_485_ = i_487_
                            i_486_ = class225.anIntArray2929!![i_487_]
                        }
                    }
                    anIntArray1149!![anInt1173++] = class225.anIntArray2915!![i_485_]
                } else {
                    anIntArray1149!![anInt1173++] = class225.anInt2918
                    return
                }
                return
            }
        }
        throw IllegalStateException(i.toString())
    }

    private fun method711(class348_sub42_sub19: Class348_Sub42_Sub19, i: Int) {
        var class348_sub42_sub19 = class348_sub42_sub19
        anInt1173 = 0
        anInt1170 = 0
        var i_488_ = -1
        var `is` = class348_sub42_sub19.anIntArray9696!!
        var is_489_ = class348_sub42_sub19.anIntArray9694!!
        var i_490_ = -1
        anInt1154 = 0
        try {
            var i_491_ = 0
            while (true) {
                if (++i_491_ > i) throw RuntimeException("slow")
                i_490_ = `is`[++i_488_]
                if (i_490_ < 100) {
                    if (i_490_ == 0) anIntArray1149!![anInt1173++] = is_489_[i_488_]
                    else if (i_490_ == 1) {
                        val i_492_ = is_489_[i_488_]
                        anIntArray1149!![anInt1173++] = (Class318_Sub1_Sub3_Sub3.aClass170_10209!!.anIntArray5063[i_492_])
                    } else if (i_490_ == 2) {
                        val i_493_ = is_489_[i_488_]
                        Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1306((-78).toByte(), anIntArray1149!![--anInt1173], i_493_)
                    } else if (i_490_ == 3) aStringArray1152!![anInt1170++] = (class348_sub42_sub19.aStringArray9692!![i_488_])
                    else if (i_490_ == 6) i_488_ += is_489_[i_488_]
                    else if (i_490_ == 7) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] != anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 8) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] == anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 9) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] < anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 10) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] > anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 21) {
                        if (anInt1154 == 0) return
                        val class184 = aClass184Array1168!![--anInt1154]!!
                        class348_sub42_sub19 = class184.aClass348_Sub42_Sub19_2474!!
                        `is` = (class348_sub42_sub19.anIntArray9696!!)
                        is_489_ = (class348_sub42_sub19.anIntArray9694!!)
                        i_488_ = class184.anInt2477
                        anIntArray1164 = class184.anIntArray2468
                        aStringArray1155 = class184.aStringArray2473
                    } else if (i_490_ == 25) {
                        val i_494_ = is_489_[i_488_]
                        anIntArray1149!![anInt1173++] = Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method62(i_494_, -65536)
                    } else if (i_490_ == 27) {
                        val i_495_ = is_489_[i_488_]
                        Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1307(i_495_, -1, anIntArray1149!![--anInt1173])
                    } else if (i_490_ == 31) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] <= anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 32) {
                        anInt1173 -= 2
                        if (anIntArray1149!![anInt1173] >= anIntArray1149!![anInt1173 + 1]) i_488_ += is_489_[i_488_]
                    } else if (i_490_ == 33) anIntArray1149!![anInt1173++] = anIntArray1164!![is_489_[i_488_]]
                    else if (i_490_ == 34) anIntArray1164!![is_489_[i_488_]] = anIntArray1149!![--anInt1173]
                    else if (i_490_ == 35) aStringArray1152!![anInt1170++] = aStringArray1155!![is_489_[i_488_]]!!
                    else if (i_490_ == 36) aStringArray1155!![is_489_[i_488_]] = aStringArray1152!![--anInt1170]
                    else if (i_490_ == 37) {
                        val i_496_ = is_489_[i_488_]
                        anInt1170 -= i_496_
                        val string = Class164.method1279(true, i_496_, aStringArray1152, anInt1170)
                        aStringArray1152!![anInt1170++] = string
                    } else if (i_490_ == 38) anInt1173--
                    else if (i_490_ == 39) anInt1170--
                    else if (i_490_ == 40) {
                        val i_497_ = is_489_[i_488_]
                        val class348_sub42_sub19_498_ = Class328.method2609(-114, i_497_)
                        if (class348_sub42_sub19_498_ == null) throw RuntimeException()
                        val is_499_ = IntArray(class348_sub42_sub19_498_.anInt9688)
                        val strings = (arrayOfNulls<String>(class348_sub42_sub19_498_.anInt9689))
                        for (i_500_ in 0..<class348_sub42_sub19_498_.anInt9697) is_499_[i_500_] = (anIntArray1149!![anInt1173 - (class348_sub42_sub19_498_.anInt9697) + i_500_])
                        for (i_501_ in 0..<class348_sub42_sub19_498_.anInt9695) strings[i_501_] = (aStringArray1152!![anInt1170 - (class348_sub42_sub19_498_.anInt9695) + i_501_])
                        anInt1173 -= class348_sub42_sub19_498_.anInt9697
                        anInt1170 -= class348_sub42_sub19_498_.anInt9695
                        val class184 = Class184()
                        class184.aClass348_Sub42_Sub19_2474 = class348_sub42_sub19
                        class184.anInt2477 = i_488_
                        class184.anIntArray2468 = anIntArray1164
                        class184.aStringArray2473 = aStringArray1155
                        if (anInt1154 >= aClass184Array1168!!.size) throw RuntimeException()
                        aClass184Array1168!![anInt1154++] = class184
                        class348_sub42_sub19 = class348_sub42_sub19_498_
                        `is` = (class348_sub42_sub19.anIntArray9696!!)
                        is_489_ = (class348_sub42_sub19.anIntArray9694!!)
                        i_488_ = -1
                        anIntArray1164 = is_499_
                        aStringArray1155 = strings
                    } else if (i_490_ == 42) anIntArray1149!![anInt1173++] = Class77.anIntArray1303!![is_489_[i_488_]]
                    else if (i_490_ == 43) {
                        val i_502_ = is_489_[i_488_]
                        Class77.anIntArray1303!![i_502_] = anIntArray1149!![--anInt1173]
                        Class232.method1647(-128, i_502_)
                        Class184.aBoolean2469 = Class184.aBoolean2469 or Class286_Sub6.aBooleanArray6270!![i_502_]
                    } else if (i_490_ == 44) {
                        val i_503_ = is_489_[i_488_] shr 16
                        val i_504_ = is_489_[i_488_] and 0xffff
                        val i_505_ = anIntArray1149!![--anInt1173]
                        if (i_505_ < 0 || i_505_ > 5000) throw RuntimeException()
                        anIntArray1172!![i_503_] = i_505_
                        var i_506_ = -1
                        if (i_504_ == 105) i_506_ = 0
                        for (i_507_ in 0..<i_505_) anIntArrayArray1161!![i_503_]!![i_507_] = i_506_
                    } else if (i_490_ == 45) {
                        val i_508_ = is_489_[i_488_]
                        val i_509_ = anIntArray1149!![--anInt1173]
                        if (i_509_ < 0 || i_509_ >= anIntArray1172!![i_508_]) throw RuntimeException()
                        anIntArray1149!![anInt1173++] = anIntArrayArray1161!![i_508_]!![i_509_]
                    } else if (i_490_ == 46) {
                        val i_510_ = is_489_[i_488_]
                        anInt1173 -= 2
                        val i_511_ = anIntArray1149!![anInt1173]
                        if (i_511_ < 0 || i_511_ >= anIntArray1172!![i_510_]) throw RuntimeException()
                        anIntArrayArray1161!![i_510_]!![i_511_] = anIntArray1149!![anInt1173 + 1]
                    } else if (i_490_ == 47) {
                        var string = Class258_Sub2.aStringArray8532!![is_489_[i_488_]]
                        if (string == null) string = "null"
                        aStringArray1152!![anInt1170++] = string
                    } else if (i_490_ == 48) {
                        val i_512_ = is_489_[i_488_]
                        Class258_Sub2.aStringArray8532!![i_512_] = aStringArray1152!![--anInt1170]
                        method529(i_512_, true)
                    } else if (i_490_ == 51) {
                        val class356 = (class348_sub42_sub19.aClass356Array9693!![is_489_[i_488_]]!!)
                        val class348_sub35 = (class356.method3480(anIntArray1149!![--anInt1173].toLong(), -6008) as Class348_Sub35?)
                        if (class348_sub35 != null) i_488_ += class348_sub35.anInt6976
                    } else if (i_490_ == 86) {
                        if (anIntArray1149!![--anInt1173] == 1) {
                            i_488_ += is_489_[i_488_]
                        }
                    }
                } else {
                    val bool: Boolean
                    bool = is_489_[i_488_] == 1
                    if (i_490_ >= 100 && i_490_ < 5000) method710(i_490_, bool)
                    else {
                        if (i_490_ < 5000 || i_490_ >= 10000) break
                        method704(i_490_, bool)
                    }
                }
            }
            throw IllegalStateException("Command: " + i_490_)
        } catch (exception: Exception) {
            if (class348_sub42_sub19.aString9690 == null) {
                val stringbuffer = StringBuffer(30)
                stringbuffer.append("CS2: ").append(class348_sub42_sub19.aLong4291).append(" ")
                var i_514_ = anInt1154 - 1
                while (i_514_ >= 0) {
                    stringbuffer.append("v: ").append(aClass184Array1168!![i_514_]!!.aClass348_Sub42_Sub19_2474!!.aLong4291).append(" ")
                    i_514_--
                }
                stringbuffer.append("op: ").append(i_490_)
                Class156.method1242(stringbuffer.toString(), exception, 15004)
            } else {
                method544(("Clientscript error in: " + class348_sub42_sub19.aString9690), false, 4)
                val stringbuffer = StringBuffer(30)
                stringbuffer.append("Clientscript error in: ").append(class348_sub42_sub19.aString9690).append("\n")
                var i_513_ = anInt1154 - 1
                while (i_513_ >= 0) {
                    stringbuffer.append("via: ").append(aClass184Array1168!![i_513_]!!.aClass348_Sub42_Sub19_2474!!.aString9690).append("\n")
                    i_513_--
                }
                stringbuffer.append("Op: ").append(i_490_).append("\n")
                val string = exception.message
                if (string != null && string.length > 0) stringbuffer.append("Message: ").append(string).append("\n")
                Class156.method1242(stringbuffer.toString(), exception, 15004)
                method94(stringbuffer.toString(), 90)
            }
        }
    }

    private fun method712(class348_sub36: Class348_Sub36, i: Int) {
        val objects = class348_sub36.anObjectArray6987!!
        val i_515_ = (objects[0] as Int)
        val class348_sub42_sub19 = Class328.method2609(-122, i_515_)
        if (class348_sub42_sub19 != null) {
            anIntArray1164 = (IntArray(class348_sub42_sub19.anInt9688))
            var i_516_ = 0
            aStringArray1155 = (arrayOfNulls<String>(class348_sub42_sub19.anInt9689))
            var i_517_ = 0
            for (i_518_ in 1..<objects.size) {
                if (objects[i_518_] is Int) {
                    var i_519_ = (objects[i_518_] as Int)
                    if (i_519_ == -2147483647) i_519_ = class348_sub36.anInt6984
                    if (i_519_ == -2147483646) i_519_ = class348_sub36.anInt6995
                    if (i_519_ == -2147483645) i_519_ = (if (class348_sub36.aClass46_6989 != null) class348_sub36.aClass46_6989!!.anInt830 else -1)
                    if (i_519_ == -2147483644) i_519_ = class348_sub36.anInt6986
                    if (i_519_ == -2147483643) i_519_ = (if (class348_sub36.aClass46_6989 != null) class348_sub36.aClass46_6989!!.anInt704 else -1)
                    if (i_519_ == -2147483642) i_519_ = (if (class348_sub36.aClass46_6983 != null) class348_sub36.aClass46_6983!!.anInt830 else -1)
                    if (i_519_ == -2147483641) i_519_ = (if (class348_sub36.aClass46_6983 != null) class348_sub36.aClass46_6983!!.anInt704 else -1)
                    if (i_519_ == -2147483640) i_519_ = class348_sub36.anInt6991
                    if (i_519_ == -2147483639) i_519_ = class348_sub36.anInt6982
                    anIntArray1164!![i_516_++] = i_519_
                } else if (objects[i_518_] is String) {
                    var string = objects[i_518_] as String
                    if (string == "event_opbase") string = class348_sub36.aString6994!!
                    aStringArray1155!![i_517_++] = string
                }
            }
            anInt1177 = class348_sub36.anInt6988
            method711(class348_sub42_sub19, i)
        }
    }

    @JvmStatic
    fun method713() {
        anIntArray1164 = null
        aStringArray1155 = null
        anIntArray1172 = null
        anIntArrayArray1161 = null
        anIntArray1149 = null
        aStringArray1152 = null
        aClass184Array1168 = null
        aClass46_1150 = null
        aClass46_1169 = null
        aClass43_1151 = null
        aCalendar1160 = null
        aStringArray1176 = null
        anIntArray1175 = null
        aClass60_1174 = null
    }

    private fun method714(i: Int) {
        val class46 = method2570(1512932720, i)
        if (class46 != null) {
            val i_520_ = i ushr 16
            var class46s = Class369_Sub2.aClass46ArrayArray8584!![i_520_]
            if (class46s == null) {
                val class46s_521_: Array<Class46?> = Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_520_]!!
                val i_522_ = class46s_521_.size
                Class369_Sub2.aClass46ArrayArray8584!![i_520_] = arrayOfNulls<Class46>(i_522_)
                class46s = Class369_Sub2.aClass46ArrayArray8584!![i_520_]!!
                Class214.method1575(class46s_521_, 0, class46s, 0, class46s_521_.size)
            }
            var i_523_: Int
            i_523_ = 0
            while (i_523_ < class46s!!.size) {
                if (class46s[i_523_] == class46) break
                i_523_++
            }
            if (i_523_ < class46s.size) {
                Class214.method1575(class46s, i_523_ + 1, class46s, i_523_, class46s.size - i_523_ - 1)
                class46s[class46s.size - 1] = class46
            }
        }
    }

    @JvmStatic
    fun method715(i: Int, bool: Boolean) {
        /* empty */
    }

    init {
        aClass184Array1168 = arrayOfNulls<Class184>(50)
        aCalendar1160 = Calendar.getInstance()
        anIntArray1175 = IntArray(3)
        aStringArray1176 = arrayOf<String>("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
        aClass60_1174 = Class60(4)
        anInt1177 = 0
    }
}
