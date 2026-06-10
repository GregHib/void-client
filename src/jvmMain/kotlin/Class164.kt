import Applet_Sub1.Companion.method85
import Class101.Companion.method901
import Class105_Sub1.Companion.method988
import Class116.method1063
import Class14_Sub2.Companion.method243
import Class150.Companion.method1202
import Class30.Companion.method323
import Class348_Sub23.Companion.method2965
import Class348_Sub40.Companion.method3038
import Class348_Sub40_Sub6.Companion.method3063
import Class348_Sub42_Sub16.Companion.method3256
import Class367_Sub10.Companion.method3553
import Class369.Companion.method3568
import Class5_Sub1.Companion.method184
import Class62.method599
import Class75.Companion.method752
import Class85.Companion.method830
import RuntimeException_Sub1.Companion.method4011
import ha_Sub3.Companion.method3886
import ha_Sub3.Companion.method3896
import jagex3.jagmisc.jagmisc.init
import r_Sub1.Companion.method3290

object Class164 {
    var anInt2172: Int = 0
    @JvmField
    var anInt2173: Int = 0
    var anInt2174: Int = 0
    var anInt2175: Int = 0

    @JvmStatic
    fun method1277(i: Byte) {
        anInt2175++
        Class351.aClass60_4327!!.method590(i + -62)
        Class358.aClass60_4417!!.method590(0)
        Class239_Sub24.aClass60_6096!!.method590(0)
        if (i.toInt() != 62) method1277(43.toByte())
        Class348_Sub40_Sub9.aClass60_9171!!.method590(0)
    }

    fun method1278(i: Int): Int {
        if (Class316.aClass348_Sub51_3959!!.aClass239_Sub11_7265!!.method1768(i + -3690) == 0) {
            var i_0_ = 0
            while ((i_0_ < Class348_Sub42_Sub19.anInt9699)) {
                if (Class348_Sub42_Sub5.anInterface6Array9534!![i_0_]!!.method28(31.toByte()).code == 115 || Class348_Sub42_Sub5.anInterface6Array9534!![i_0_]!!.method28(71.toByte()).code == 83) {
                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub11_7265), 1)
                    Class304.aBoolean3847 = true
                    break
                }
                i_0_++
            }
        }
        anInt2174++
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1018) {
            val runtime = Runtime.getRuntime()
            val i_1_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
            val l = method599(i + 28559)
            if (Class348_Sub17.aLong6791 == 0L) Class348_Sub17.aLong6791 = l
            if (i_1_ > 16384 && -Class348_Sub17.aLong6791 + l < 5000) {
                if (-Class173.aLong2286 + l > 1000L) {
                    System.gc()
                    Class173.aLong2286 = l
                }
                return 0
            }
        }
        if (Class56.aClass56_1023 == Class348_Sub42_Sub15.aClass56_9660) {
            if (Class175.aClass340_2327 == null) Class175.aClass340_2327 = Class340(Class348_Sub4.aClass248_6601, Class39.aClass112_520, Class52.aBigInteger4896, Class348_Sub42_Sub15.aBigInteger9657)
            if (!Class175.aClass340_2327!!.method2674(7)) return 0
            method2965(null, 0, true, 0)
            Class286_Sub7.aBoolean6289 = !Class348_Sub14.method2804((-63).toByte())
            Class286_Sub7.aClass45_6277 = Class369_Sub2.method3571(false, (if (Class286_Sub7.aBoolean6289) 34 else 32), (-23).toByte(), 1)
            Class348_Sub40_Sub17_Sub1.aClass45_10426 = Class369_Sub2.method3571(false, 33, (-23).toByte(), 1)
            Class104.aClass45_1627 = Class369_Sub2.method3571(false, 13, (-23).toByte(), 1)
        }
        if (Class56.aClass56_1024 == Class348_Sub42_Sub15.aClass56_9660) {
            val bool = Class348_Sub40_Sub17_Sub1.aClass45_10426!!.method401(89)
            var i_2_ = Class13.aClass314_Sub1Array223!![33]!!.method2349(1)
            i_2_ = i_2_ + Class13.aClass314_Sub1Array223!![if (!Class286_Sub7.aBoolean6289) 32 else 34]!!.method2349(1)
            i_2_ += Class13.aClass314_Sub1Array223!![13]!!.method2349(1)
            i_2_ = i_2_ + (if (!bool) Class348_Sub40_Sub17_Sub1.aClass45_10426!!.method398((-31).toByte()) else 100)
            if (i_2_ != 400) return i_2_ / 4
            Class348_Sub31.anInt6924 = Class286_Sub7.aClass45_6277!!.method389(77)
            Class108.anInt1663 = Class348_Sub40_Sub17_Sub1.aClass45_10426!!.method389(i + 28561)
            Class106.method1001(Class286_Sub7.aClass45_6277!!, 0)
            val i_3_ = Class316.aClass348_Sub51_3959!!.aClass239_Sub19_7257!!.method1805(i xor 0x11ae)
            Class186_Sub1.aClass111_5813 = Class111(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class348_Sub40_Sub17_Sub1.aClass45_10426)
            var `is` = Class186_Sub1.aClass111_5813!!.method1046(i_3_, 0)
            if (`is`!!.size == 0) `is` = Class186_Sub1.aClass111_5813!!.method1046(0, 0)
            val class106 = Class106(Class286_Sub7.aClass45_6277, Class104.aClass45_1627)
            if (`is`!!.size > 0) {
                Class182.anInterface16Array2447 = arrayOfNulls<Interface16>(`is`.size)
                var i_4_ = 0
                while ((Class182.anInterface16Array2447!!.size > i_4_)) {
                    Class182.anInterface16Array2447!![i_4_] = Class195(Class186_Sub1.aClass111_5813!!.method1043(`is`[i_4_], 102.toByte()), class106)
                    i_4_++
                }
            }
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1026) Class348_Sub42_Sub3.method3178(Class104.aClass45_1627, -81, method184(1084489728), Class286_Sub7.aClass45_6277)
        if (Class56.aClass56_1027 == Class348_Sub42_Sub15.aClass56_9660) {
            val i_5_ = Class348_Sub50.method3420(0)
            val i_6_ = method3256(2)
            if (i_6_ > i_5_) return 100 * i_5_ / i_6_
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1028) {
            if (Class182.anInterface16Array2447 != null && (Class182.anInterface16Array2447!!.size > 0)) {
                if (Class182.anInterface16Array2447!![0]!!.method60(-19079) < 100) return 0
                if (Class182.anInterface16Array2447!!.size > 1 && Class186_Sub1.aClass111_5813!!.method1044(86) && (Class182.anInterface16Array2447!![1]!!.method60(i + 9581) < 100)) return 0
            }
            Class170.method1311(5139, Class348_Sub8.aHa6654!!)
            method3568(Class348_Sub8.aHa6654, 4)
            Class348_Sub49.method3379(2, 1)
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1029) {
            for (i_7_ in 0..3) Class348_Sub45.aClass361Array7108!![i_7_] = method988(Class348_Sub40_Sub3.anInt9109, 1, Class367_Sub4.anInt7319)
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1030) {
            Class21.aClass45_322 = Class369_Sub2.method3571(false, 8, (-23).toByte(), 1)
            Class348_Sub29.aClass45_6909 = Class369_Sub2.method3571(false, 0, (-23).toByte(), 1)
            Class186.aClass45_2490 = Class369_Sub2.method3571(false, 1, (-23).toByte(), 1)
            Class95.aClass45_1541 = Class369_Sub2.method3571(false, 2, (-23).toByte(), 1)
            Class348_Sub35.aClass45_6980 = Class369_Sub2.method3571(false, 3, (-23).toByte(), 1)
            Class129.aClass45_1878 = Class369_Sub2.method3571(false, 4, (-23).toByte(), 1)
            Class367_Sub10.aClass45_7382 = Class369_Sub2.method3571(true, 5, (-23).toByte(), 1)
            Class59_Sub2_Sub1.aClass45_8667 = Class369_Sub2.method3571(true, 6, (-23).toByte(), 1)
            aa_Sub3.aClass45_5207 = Class369_Sub2.method3571(false, 7, (-23).toByte(), 1)
            Class369_Sub2.aClass45_8589 = Class369_Sub2.method3571(false, 9, (-23).toByte(), 1)
            Class16.aClass45_233 = Class369_Sub2.method3571(false, 10, (-23).toByte(), 1)
            Class348_Sub23_Sub2.aClass45_9033 = Class369_Sub2.method3571(false, 11, (-23).toByte(), 1)
            Class113.aClass45_1743 = Class369_Sub2.method3571(false, 12, (-23).toByte(), 1)
            Class239_Sub4.aClass45_5878 = Class369_Sub2.method3571(false, 14, (-23).toByte(), 1)
            Class123.aClass45_1815 = Class369_Sub2.method3571(false, 15, (-23).toByte(), 1)
            Class94.aClass45_1538 = Class369_Sub2.method3571(false, 16, (-23).toByte(), 1)
            Class247.aClass45_3183 = Class369_Sub2.method3571(false, 17, (-23).toByte(), 1)
            Class216.aClass45_4975 = Class369_Sub2.method3571(false, 18, (-23).toByte(), 1)
            Class174.aClass45_2306 = Class369_Sub2.method3571(false, 19, (-23).toByte(), 1)
            r_Sub2.aClass45_10480 = Class369_Sub2.method3571(false, 20, (-23).toByte(), 1)
            Class78.aClass45_1322 = Class369_Sub2.method3571(false, 21, (-23).toByte(), 1)
            Class348_Sub16_Sub3.aClass45_8926 = Class369_Sub2.method3571(false, 22, (-23).toByte(), 1)
            Class348_Sub32.aClass45_6950 = Class369_Sub2.method3571(true, 23, (-23).toByte(), 1)
            Class130.aClass45_1897 = Class369_Sub2.method3571(false, 24, (-23).toByte(), 1)
            Class82.aClass45_1434 = Class369_Sub2.method3571(false, 25, (-23).toByte(), 1)
            Class348_Sub11.aClass45_4770 = Class369_Sub2.method3571(true, 26, (-23).toByte(), 1)
            Class239.aClass45_3146 = Class369_Sub2.method3571(false, 27, (-23).toByte(), 1)
            Class367_Sub8.aClass45_7362 = Class369_Sub2.method3571(true, 28, (-23).toByte(), 1)
            Class262.aClass45_3323 = Class369_Sub2.method3571(false, 29, (-23).toByte(), 1)
            Class126.aClass45_4984 = Class369_Sub2.method3571(true, 30, (-23).toByte(), 1)
            Class136.aClass45_4796 = Class369_Sub2.method3571(true, 31, (-23).toByte(), 1)
            Class146.aClass45_2015 = Class369_Sub2.method3571(true, 36, (-23).toByte(), 2)
        }
        if (Class56.aClass56_1031 == Class348_Sub42_Sub15.aClass56_9660) {
            var i_8_ = 0
            for (i_9_ in 0..36) {
                if (Class13.aClass314_Sub1Array223!![i_9_] != null) i_8_ += (Class13.aClass314_Sub1Array223!![i_9_]!!.method2349(i + 28661) * Class8.anIntArray164!![i_9_] / 100)
            }
            if (i_8_ != 100) {
                if (Class268.anInt3435 < 0) Class268.anInt3435 = i_8_
                return ((i_8_ + -Class268.anInt3435) * 100 / (-Class268.anInt3435 + 100))
            }
            Class286_Sub5.method2159((-109).toByte(), Class21.aClass45_322!!)
            Class348_Sub42_Sub3.method3178(Class104.aClass45_1627, -124, method184(i xor 0x40a46ff3.inv()), Class21.aClass45_322)
        }
        if (Class56.aClass56_1032 == Class348_Sub42_Sub15.aClass56_9660) {
            if (Class345.anInt4270 == -1) Class345.anInt4270 = Class59_Sub2_Sub1.aClass45_8667!!.method417("scape main", 0)
            method3290(56)
            Class348_Sub49.method3379(2, 2)
        }
        if (Class56.aClass56_1033 == Class348_Sub42_Sub15.aClass56_9660) method323(Class126.aClass45_4984, Class348_Sub23_Sub1.aClass297_8992, 95.toByte())
        if (Class56.aClass56_1034 == Class348_Sub42_Sub15.aClass56_9660) {
            val i_10_ = Class239_Sub11.method1770((-25).toByte())
            if (i_10_ < 100) return i_10_
            Class263.method2013(Class367_Sub8.aClass45_7362!!.method415(73.toByte(), 1), 112.toByte())
            RuntimeException_Sub1.method4012(Class367_Sub8.aClass45_7362!!.method415(73.toByte(), 3), (-111).toByte())
        }
        if (i != -28660) return 2
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1035) {
            if (Class348_Sub31.anInt6923 != -1 && !aa_Sub3.aClass45_5207!!.method420(-10499, Class348_Sub31.anInt6923, 0)) return 99
            Class348_Sub40_Sub4.aD9113 = Class244(Class348_Sub11.aClass45_4770, Class369_Sub2.aClass45_8589, Class21.aClass45_322)
            Class101_Sub3.aClass326_5764 = Class326(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class64_Sub3.aClass261_5558 = Class261(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class239.aClass166_3147 = Class166(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541, Class21.aClass45_322)
            Class348_Sub7.aClass33_6653 = Class33(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class247.aClass45_3183)
            Class229.aClass268_2979 = Class268(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class362.aClass183_4460 = Class183(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class73.aClass219_4782 = Class219(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541, Class21.aClass45_322)
            Class348_Sub40_Sub25.aClass150_9342 = Class150(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541, aa_Sub3.aClass45_5207)
            Class127_Sub1.aClass271_8378 = Class271(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class348_Sub1.aClass185_6559 = Class185(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class348_Sub40_Sub12.aClass263_9195 = Class263(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, true, Class94.aClass45_1538, aa_Sub3.aClass45_5207)
            Class348_Sub23_Sub2.aClass153_9031 = Class153(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541, Class21.aClass45_322)
            Class2.aClass141_117 = Class141(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541, Class21.aClass45_322)
            Class189.aClass278_2529 = Class278(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, true, Class216.aClass45_4975, aa_Sub3.aClass45_5207)
            Exception_Sub1.aClass255_112 = Class255(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, true, Class101_Sub3.aClass326_5764, Class174.aClass45_2306, aa_Sub3.aClass45_5207)
            Class348_Sub23_Sub2.aClass187_9036 = Class187(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class10.aClass87_191 = Class87(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, r_Sub2.aClass45_10480, Class348_Sub29.aClass45_6909, Class186.aClass45_2490)
            Class30.aClass84_413 = Class84(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class123.aClass25_1813 = Class25(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class348_Sub40_Sub18.aClass319_9245 = Class319(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class78.aClass45_1322, aa_Sub3.aClass45_5207)
            Class136.aClass65_4787 = Class65(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class91.aClass82_1523 = Class82(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class239_Sub14.aClass259_5995 = Class259(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class229.aClass194_2981 = Class194(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class348_Sub16_Sub3.aClass45_8926)
            Class269.aClass217_3453 = Class217(Class348_Sub42_Sub8_Sub2.aClass230_10434, Class348_Sub33.anInt6967, Class95.aClass45_1541)
            Class65.method699(Class104.aClass45_1627, (-100).toByte(), Class348_Sub35.aClass45_6980, Class21.aClass45_322, aa_Sub3.aClass45_5207)
            method85(0, Class262.aClass45_3323)
            Class200.aClass226_2639 = Class226(Class348_Sub33.anInt6967, Class130.aClass45_1897, Class82.aClass45_1434)
            Class239_Sub6.aClass355_5900 = Class355(Class348_Sub33.anInt6967, Class130.aClass45_1897, Class82.aClass45_1434, Class28())
            method1202(0)
            Class348_Sub40_Sub12.aClass263_9195!!.method2008(i + 28539, Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(i + -3690) == 0)
            Class318_Sub1_Sub3_Sub3.aClass170_10209 = Class170()
            method3038(-1)
            method4011(i + 29684, Class239.aClass45_3146)
            Class348_Sub29.method3004(aa_Sub3.aClass45_5207, false, Class348_Sub40_Sub4.aD9113)
            val class296 = Class296(Class16.aClass45_233!!.method391("huffman", "", -29832)!!)
            method3896(class296, 13.toByte())
            try {
                init()
            } catch (throwable: Throwable) {
                /* empty */
            }
            Class348_Sub8.aClass241_6660 = Class229.method1631(false)
            Class348_Sub40_Sub20.aClass348_Sub4_9264 = Class348_Sub4(true, Class348_Sub23_Sub1.aClass297_8992!!)
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1037) {
            val i_11_ = (Class348_Sub22.method2958(22388, Class21.aClass45_322!!) + Class348_Sub49_Sub2.method3405(2012104999, true))
            val i_12_ = (Class288_Sub1.method2188(-30477) - -method3256(2))
            if (i_11_ < i_12_) return i_11_ * 100 / i_12_
        }
        if (Class56.aClass56_1038 == Class348_Sub42_Sub15.aClass56_9660) method752(Class348_Sub32.aClass45_6950, Class229.aClass268_2979, Class362.aClass183_4460, Class348_Sub40_Sub12.aClass263_9195, Class348_Sub23_Sub2.aClass153_9031, Class2.aClass141_117, Class318_Sub1_Sub3_Sub3.aClass170_10209)
        if (Class56.aClass56_1039 == Class348_Sub42_Sub15.aClass56_9660) {
            // TODO make cache edit to extend these or change id's
            Class77.anIntArray1303 = (IntArray(Class239_Sub14.aClass259_5995!!.anInt3305 + 1000))
            Class286_Sub6.aBooleanArray6270 = (BooleanArray(Class239_Sub14.aClass259_5995!!.anInt3305 + 1000))
            Class258_Sub2.aStringArray8532 = arrayOfNulls<String>(Class91.aClass82_1523!!.anInt1439)
            var i_13_ = 0
            while (Class239_Sub14.aClass259_5995!!.anInt3305 + 1000 > i_13_) {
                if (Class239_Sub14.aClass259_5995!!.method1976(i_13_, i xor 0x6fc0.inv()).anInt2135 == 0) {
                    Class286_Sub6.aBooleanArray6270!![i_13_] = true
                    Class335.anInt4168++
                }
                Class77.anIntArray1303!![i_13_] = -1
                i_13_++
            }
            method1063(1)
            Class285.anInt4737 = Class348_Sub35.aClass45_6980!!.method417("loginscreen", i xor 0x6ff3.inv())
            Class54.anInt970 = Class348_Sub35.aClass45_6980!!.method417("lobbyscreen", 0)
            Class367_Sub10.aClass45_7382!!.method404(0, true, false)
            Class59_Sub2_Sub1.aClass45_8667!!.method404(0, true, true)
            Class21.aClass45_322!!.method404(i + 28660, true, true)
            Class104.aClass45_1627!!.method404(0, true, true)
            Class16.aClass45_233!!.method404(0, true, true)
            Class348_Sub35.aClass45_6980!!.method404(0, true, true)
            Class95.aClass45_1541!!.anInt634 = 2
            Class319.aBoolean3988 = true
            Class247.aClass45_3183!!.anInt634 = 2
            Class94.aClass45_1538!!.anInt634 = 2
            Class216.aClass45_4975!!.anInt634 = 2
            Class174.aClass45_2306!!.anInt634 = 2
            r_Sub2.aClass45_10480!!.anInt634 = 2
            Class78.aClass45_1322!!.anInt634 = 2
        }
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1040) {
            if (!Class320.method2547(Class285.anInt4737, 84.toByte())) return 0
            var bool = true
            for (i_14_ in (Class348_Sub40_Sub33.aClass46ArrayArray9427!![Class285.anInt4737])!!.indices) {
                val class46: Class46 = (Class348_Sub40_Sub33.aClass46ArrayArray9427!![Class285.anInt4737]!![i_14_])!!
                if (class46.anInt774 == 5 && class46.anInt756 != -1 && !Class21.aClass45_322!!.method420(-10499, (class46.anInt756), 0)) bool = false
            }
            if (!bool) return 0
        }
        if (Class56.aClass56_1041 == Class348_Sub42_Sub15.aClass56_9660) Class348_Sub42_Sub8.method3198(true, (-45).toByte())
        if (Class348_Sub42_Sub15.aClass56_9660 == Class56.aClass56_1042) {
            Class51.aClass311_897!!.method2319((-56).toByte())
            try {
                Class348_Sub32.aThread6946!!.join()
            } catch (interruptedexception: InterruptedException) {
                return 0
            }
            Class186_Sub1.aClass111_5813 = null
            Class348_Sub40_Sub17_Sub1.aClass45_10426 = null
            Class51.aClass311_897 = null
            Class182.anInterface16Array2447 = null
            Class348_Sub32.aThread6946 = null
            Class286_Sub7.aClass45_6277 = null
            method3886(i + 28556)
            Class348_Sub23_Sub2.aBoolean9038 = Class316.aClass348_Sub51_3959!!.aClass239_Sub11_7265!!.method1768(-32350) == 1
            Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub11_7265), 1)
            if (Class348_Sub23_Sub2.aBoolean9038) Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
            else if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.aBoolean6113 && Class348_Sub40_Sub20.aClass348_Sub4_9264!!.anInt6609 < 512 && Class348_Sub40_Sub20.aClass348_Sub4_9264!!.anInt6609 != 0) Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
            method243(i xor 0x6fd6.inv())
            if (Class348_Sub23_Sub2.aBoolean9038) method3553(false, 108.toByte(), 0)
            else method3553(false, 102.toByte(), Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.method1829(-32350))
            method830(Class316.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
            Class170.method1311(5139, Class348_Sub8.aHa6654!!)
            method3568(Class348_Sub8.aHa6654, i xor 0x6ff7.inv())
            Class255.method1933(Class21.aClass45_322, Class348_Sub8.aHa6654, true)
            method901(Class113.aClass105Array1744, 515880227)
        }
        return method3063(false)
    }

    fun method1279(bool: Boolean, i: Int, strings: Array<String?>?, i_15_: Int): String {
        try {
            anInt2172++
            if (i == 0) return ""
            if (i == 1) {
                val string = strings!![i_15_]
                if (string == null) return "null"
                return string
            }
            val i_16_ = i + i_15_
            var i_17_ = 0
            var i_18_ = i_15_
            while (i_16_ > i_18_) {
                val string = strings!![i_18_]
                if (string == null) i_17_ += 4
                else i_17_ += string.length
                i_18_++
            }
            val stringbuffer = StringBuffer(i_17_)
            for (i_19_ in i_15_..<i_16_) {
                val string = strings!![i_19_]
                if (string == null) stringbuffer.append("null")
                else stringbuffer.append(string)
            }
            if (bool != true) Class164.method1277((-20).toByte())
            return stringbuffer.toString()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("pea.C(" + bool + ',' + i + ',' + (if (strings != null) "{...}" else "null") + ',' + i_15_ + ')'))
        }
    }
}
