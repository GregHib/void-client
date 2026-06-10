import Applet_Sub1.Companion.method94
import Class14_Sub2.Companion.method243
import Class239_Sub14.Companion.method1781
import Class239_Sub17.Companion.method1795
import Class239_Sub2.Companion.method1725
import Class239_Sub24.Companion.method1821
import Class239_Sub5.Companion.method1742
import Class272.Companion.method2049
import Class286_Sub3.Companion.method2148
import Class299_Sub2_Sub1.Companion.method2271
import Class318_Sub1_Sub2.Companion.method2405
import Class318_Sub1_Sub4.Companion.method2478
import Class348.Companion.method2710
import Class348_Sub23_Sub1.Companion.method2972
import Class348_Sub40_Sub23.Companion.method3113
import Class367_Sub10.Companion.method3553
import Class367_Sub4.Companion.method3544
import Class46.Companion.method427
import Class50_Sub2.Companion.method464
import Class62.method599
import Class66.method706
import Class66.method715
import jagex3.jagmisc.jagmisc.availablePhysicalMemory
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream

class Class82 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass45_1436: Class45?
    @JvmField
    var anInt1439: Int = 0

    init {
        Class60(64)
        try {
            aClass45_1436 = class45
            this.anInt1439 = aClass45_1436!!.method407(0, 15)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("lba.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var aClass45_1434: Class45? = null
        @JvmField
        var anInt1435: Int = 0
        @JvmField
        var anInt1437: Int = 0
        @JvmField
        var anInt1438: Int = 0
        @JvmStatic
        fun method811(i: Byte) {
            if (i > -109) anInt1435 = 69
            aClass45_1434 = null
        }

        @JvmStatic
        fun method812(string: String?, bool: Boolean, bool_0_: Boolean, i: Byte) {
            try {
                if (i.toInt() != -79) Companion.method814((-79).toByte(), 126L)
                anInt1437++
                try {
                    if (Class240.anInt4674 != 10 && (string.equals("commands", ignoreCase = true) || string.equals("help", ignoreCase = true))) {
                        method94("commands - This command", i.toInt() xor 0x1)
                        method94("cls - Clear console", -54)
                        method94("displayfps - Toggle FPS and other information", -89)
                        method94("renderer - Print graphics renderer information", 122)
                        method94("heap - Print java memory information", -88)
                        return
                    }
                    if (string.equals("cls", ignoreCase = true)) {
                        Class284.anInt3676 = 0
                        Class369_Sub2.anInt8587 = 0
                        return
                    }
                    if (string.equals("displayfps", ignoreCase = true)) {
                        Class298.aBoolean3811 = !Class298.aBoolean3811
                        if (Class298.aBoolean3811) method94("FPS on", 83)
                        else {
                            method94("FPS off", -69)
                            return
                        }
                        return
                    }
                    if (string == "renderer") {
                        val class365 = Class348_Sub8.aHa6654!!.c()
                        method94("Vendor: " + class365.anInt4476, 89)
                        method94("Name: " + (class365.aString4470), 71)
                        method94(("Version: " + (class365.anInt4475)), -110)
                        method94(("Device: " + (class365.aString4472)), i + 146)
                        method94(("Driver Version: " + (class365.aLong4471)), i + -32)
                        return
                    }
                    if (string == "heap") {
                        method94(("Heap: " + Class226.anInt2964 + "MB"), 69)
                        return
                    }
                } catch (exception: Exception) {
                    method94((Class274.aClass274_3485!!.method2063(Class348_Sub33.anInt6967, 544)!!), -99)
                    return
                }
                if (Class8.aClass364_165 != Class55_Sub1.aClass364_5271 || Class192.anInt2581 >= 2) {
                    if (string.equals("errortest", ignoreCase = true)) throw RuntimeException()
                    if (string == "nativememerror") throw OutOfMemoryError("native(MPR")
                    try {
                        if (string.equals("printfps", ignoreCase = true)) {
                            method94(("FPS: " + Class239_Sub5.anInt5891), -58)
                            return
                        }
                        if (string.equals("occlude", ignoreCase = true)) {
                            Class348_Sub40_Sub23.aBoolean9307 = !Class348_Sub40_Sub23.aBoolean9307
                            if (Class348_Sub40_Sub23.aBoolean9307) {
                                method94("Occlsion now on!", -102)
                                return
                            } else method94("Occlsion now off!", -106)
                            return
                        }
                        if (string.equals("fpson", ignoreCase = true)) {
                            Class298.aBoolean3811 = true
                            method94("fps debug enabled", -115)
                            return
                        }
                        if (string.equals("fpsoff", ignoreCase = true)) {
                            Class298.aBoolean3811 = false
                            method94("fps debug disabled", 125)
                            return
                        }
                        if (string == "systemmem") {
                            try {
                                method94(("System memory: " + (availablePhysicalMemory / 1048576L) + "/" + Class348_Sub40_Sub20.aClass348_Sub4_9264!!.anInt6609 + "Mb"), i + 26)
                            } catch (throwable: Throwable) {
                                /* empty */
                            }
                            return
                        }
                        if (string.equals("cleartext", ignoreCase = true)) {
                            Class225.aClass243_2957!!.method1876((-45).toByte())
                            method94("Text coords cleared", i + 21)
                            return
                        }
                        if (string.equals("gc", ignoreCase = true)) {
                            method427(i + 180)
                            for (i_1_ in 0..9) System.gc()
                            val runtime = Runtime.getRuntime()
                            val i_2_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
                            method94("mem=" + i_2_ + "k", 110)
                            return
                        }
                        if (string.equals("compact", ignoreCase = true)) {
                            method427(-41)
                            for (i_3_ in 0..9) System.gc()
                            val runtime = Runtime.getRuntime()
                            var i_4_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
                            method94(("Memory before cleanup=" + i_4_ + "k"), 115)
                            method2271(31268)
                            method427(96)
                            for (i_5_ in 0..9) System.gc()
                            i_4_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
                            method94(("Memory after cleanup=" + i_4_ + "k"), -110)
                            return
                        }
                        if (string.equals("unloadnatives", ignoreCase = true)) {
                            method94((if (Class228.method1629(true)) "Libraries unloaded" else "Library unloading failed!"), 63)
                            return
                        }
                        if (string.equals("clientdrop", ignoreCase = true)) {
                            method94("Dropped client connection", -119)
                            if (Class240.anInt4674 == 10) method2049(105)
                            else {
                                if (Class240.anInt4674 == 11) Class110.aBoolean1712 = true
                                return
                            }
                            return
                        }
                        if (string.equals("rotateconnectmethods", ignoreCase = true)) {
                            Class3.aClass161_125!!.method1259(0)
                            method94("Rotated connection methods", i.toInt() xor 0x13.inv())
                            return
                        }
                        if (string.equals("clientjs5drop", ignoreCase = true)) {
                            Class348_Sub4.aClass248_6601!!.method1901(-83)
                            method94("Dropped client js5 net queue", -116)
                            return
                        }
                        if (string.equals("serverjs5drop", ignoreCase = true)) {
                            Class348_Sub4.aClass248_6601!!.method1905(0)
                            method94("Dropped server js5 net queue", -100)
                            return
                        }
                        if (string.equals("breakcon", ignoreCase = true)) {
                            Class348_Sub23_Sub1.aClass297_8992!!.method2239(-95)
                            Class348_Sub40_Sub8.aClass238_9165!!.method1702(i + 123)
                            Class348_Sub4.aClass248_6601!!.method1898(true)
                            method94("Breaking new connections for 5 seconds", i + -4)
                            return
                        }
                        if (string.equals("rebuild", ignoreCase = true)) {
                            Class348_Sub20.method2953((-117).toByte())
                            method464(-1)
                            method94("Rebuilding map", -113)
                            return
                        }
                        if (string.equals("rebuildprofile", ignoreCase = true)) {
                            Class90.aLong1516 = method599(-75)
                            Class258_Sub4.aBoolean8558 = true
                            Class348_Sub20.method2953((-114).toByte())
                            method464(-1)
                            method94("Rebuilding map (with profiling)", -117)
                            return
                        }
                        if (string.equals("wm1", ignoreCase = true)) {
                            Class85.Companion.method830(1, -1, 102.toByte(), false, -1)
                            if (Class348_Sub42_Sub12.method3229(-61) == 1) {
                                method94("wm1 succeeded", -65)
                                return
                            } else method94("wm1 failed", i.toInt() xor 0x17.inv())
                            return
                        }
                        if (string.equals("wm2", ignoreCase = true)) {
                            Class85.Companion.method830(2, -1, 102.toByte(), false, -1)
                            if (Class348_Sub42_Sub12.method3229(-119) == 2) method94("wm2 succeeded", -109)
                            else {
                                method94("wm2 failed", i + 154)
                                return
                            }
                            return
                        }
                        if (string.equals("wm3", ignoreCase = true)) {
                            Class85.Companion.method830(3, 1024, 102.toByte(), false, 768)
                            if (Class348_Sub42_Sub12.method3229(i.toInt() xor 0x3d) == 3) method94("wm3 succeeded", 111)
                            else {
                                method94("wm3 failed", 83)
                                return
                            }
                            return
                        }
                        if (string.equals("tk0", ignoreCase = true)) {
                            method3553(false, 104.toByte(), 0)
                            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 0) {
                                method94("Entered tk0", 101)
                                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
                                method243(37)
                                r.aBoolean9719 = false
                                return
                            } else method94("Failed to enter tk0", 69)
                            return
                        }
                        if (string.equals("tk1", ignoreCase = true)) {
                            method3553(false, 109.toByte(), 1)
                            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 1) {
                                method94("Entered tk1", -65)
                                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 1)
                                method243(i.toInt() xor 0x6b.inv())
                                r.aBoolean9719 = false
                                return
                            } else method94("Failed to enter tk1", -56)
                            return
                        }
                        if (string.equals("tk2", ignoreCase = true)) {
                            method3553(false, 115.toByte(), 2)
                            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 2) {
                                method94("Entered tk2", i + 151)
                                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 2)
                                method243(37)
                                r.aBoolean9719 = false
                            } else {
                                method94("Failed to enter tk2", i.toInt() xor 0x22)
                                return
                            }
                            return
                        }
                        if (string.equals("tk3", ignoreCase = true)) {
                            method3553(false, 107.toByte(), 3)
                            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 3) {
                                method94("Entered tk3", 78)
                                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 3)
                                method243(37)
                                r.aBoolean9719 = false
                                return
                            } else method94("Failed to enter tk3", 54)
                            return
                        }
                        if (string.equals("tk5", ignoreCase = true)) {
                            method3553(false, 113.toByte(), 5)
                            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(i.toInt() xor 0x7e13) == 5) {
                                method94("Entered tk5", -108)
                                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 5)
                                method243(37)
                                r.aBoolean9719 = false
                            } else {
                                method94("Failed to enter tk5", 63)
                                return
                            }
                            return
                        }
                        if (string!!.startsWith("setba")) {
                            if (string.length < 6) method94("Invalid buildarea value", i + -36)
                            else {
                                val i_6_ = (Class348_Sub41.method3156(true, string.substring(6)))
                                if (i_6_ < 0 || (method2710(-126, Class226.anInt2964) < i_6_)) method94("Invalid buildarea value", 53)
                                else {
                                    Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub6_7226), i_6_)
                                    method243(37)
                                    r.aBoolean9719 = false
                                    method94(("maxbuildarea=" + Class316.aClass348_Sub51_3959!!.aClass239_Sub6_7226!!.method1743(-32350)), 98)
                                    return
                                }
                                return
                            }
                            return
                        }
                        if (string.startsWith("rect_debug")) {
                            if (string.length < 10) method94("Invalid rect_debug value", -94)
                            else {
                                ha_Sub3.anInt8045 = Class348_Sub41.method3156(true, string.substring(10).trim { it <= ' ' })
                                method94(("rect_debug=" + ha_Sub3.anInt8045), -124)
                                return
                            }
                            return
                        }
                        if (string.equals("qa_op_test", ignoreCase = true)) {
                            Class299_Sub2.aBoolean6327 = true
                            method94(("qa_op_test=" + (Class299_Sub2.aBoolean6327)), -114)
                            return
                        }
                        if (string.equals("clipcomponents", ignoreCase = true)) {
                            Class318_Sub1_Sub3_Sub2.aBoolean10046 = !Class318_Sub1_Sub3_Sub2.aBoolean10046
                            method94(("clipcomponents=" + (Class318_Sub1_Sub3_Sub2.aBoolean10046)), 88)
                            return
                        }
                        if (string.startsWith("bloom")) {
                            val bool_7_ = Class348_Sub8.aHa6654!!.method3666()
                            if (Class348_Sub40_Sub33.method3137(!bool_7_, (-24).toByte())) {
                                if (bool_7_) {
                                    method94("Bloom disabled", i + -49)
                                    return
                                } else method94("Bloom enabled", 71)
                                return
                            } else method94("Failed to enable bloom", 52)
                            return
                        }
                        if (string.equals("tween", ignoreCase = true)) {
                            if (Class28.aBoolean5002) {
                                Class28.aBoolean5002 = false
                                method94("Forced tweening disabled.", i.toInt() xor 0x71.inv())
                                return
                            } else {
                                Class28.aBoolean5002 = true
                                method94("Forced tweening ENABLED!", -89)
                            }
                            return
                        }
                        if (string.equals("shiftclick", ignoreCase = true)) {
                            if (Class116.shiftClick) {
                                method94("Shift-click disabled.", i.toInt() xor 0x24.inv())
                                Class116.shiftClick = false
                            } else {
                                method94("Shift-click ENABLED!", 106)
                                Class116.shiftClick = true
                                return
                            }
                            return
                        }
                        if (string.equals("getcgcoord", ignoreCase = true)) {
                            method94(("x:" + ((Class132.aPlayer_1907!!.x) shr 9) + " z:" + ((Class132.aPlayer_1907!!.y) shr 9)), -117)
                            return
                        }
                        if (string.equals("getheight", ignoreCase = true)) {
                            method94(("Height: " + (aa_Sub1.aSArray5191!![(Class132.aPlayer_1907!!.plane).toInt()]!!.method3982((-86).toByte(), (Class132.aPlayer_1907!!.y) shr 9, (Class132.aPlayer_1907!!.x) shr 9))), i.toInt() xor 0x1)
                            return
                        }
                        if (string.equals("resetminimap", ignoreCase = true)) {
                            Class21.aClass45_322!!.method405(i.toInt() xor 0x4e.inv())
                            Class21.aClass45_322!!.method412(127.toByte())
                            Class2.aClass141_117!!.method1175(125.toByte())
                            Class348_Sub23_Sub2.aClass153_9031!!.method1219(7851)
                            method464(-1)
                            method94("Minimap reset", 70)
                            return
                        }
                        if (string.startsWith("mc")) {
                            if (Class348_Sub8.aHa6654!!.method3708()) {
                                var i_8_ = string.substring(3).toInt()
                                if (i_8_ >= 1) {
                                    if (i_8_ > 4) i_8_ = 4
                                } else i_8_ = 1
                                Class239_Sub16.anInt6012 = i_8_
                                Class348_Sub20.method2953((-128).toByte())
                                method94(("Render cores now: " + (Class239_Sub16.anInt6012)), -77)
                            } else {
                                method94("Current toolkit doesn't support multiple cores", i + 138)
                                return
                            }
                            return
                        }
                        if (string.startsWith("cachespace")) {
                            method94(("I(s): " + Class351.aClass60_4327!!.method581(-18529) + "/" + Class351.aClass60_4327!!.method577(-4)), -101)
                            method94(("I(m): " + Class358.aClass60_4417!!.method581(-18529) + "/" + Class358.aClass60_4417!!.method577(i.toInt() xor 0x4d)), 127)
                            method94(("O(s): " + Exception_Sub1.aClass255_112!!.aClass175_3288.method1350(126.toByte()) + "/" + Exception_Sub1.aClass255_112!!.aClass175_3288.method1339(100)), i + 203)
                            return
                        }
                        if (string.equals("getcamerapos", ignoreCase = true)) {
                            method94(
                                ("Pos: " + (Class132.aPlayer_1907!!.plane) + "," + (((Class286_Sub4.anInt6246 shr 9) - -za_Sub2.regionTileX) shr 6) + "," + ((Class59_Sub2_Sub2.anInt8685 shr 9) + Class90.regionTileY shr 6) + "," + (((Class286_Sub4.anInt6246 shr 9) - -za_Sub2.regionTileX) and 0x3f) + "," + ((Class59_Sub2_Sub2.anInt8685 shr 9) - -Class90.regionTileY and 0x3f) + " Height: " + ((Class275.method2064(
                                    Class286_Sub4.anInt6246,
                                    (Class132.aPlayer_1907!!.plane).toInt(),
                                    11219,
                                    Class59_Sub2_Sub2.anInt8685
                                )) - Class305.anInt3855)), 126
                            )
                            method94(
                                ("Look: " + (Class132.aPlayer_1907!!.plane) + "," + (Class352.anInt4336 - -za_Sub2.regionTileX shr 6) + "," + (Class90.regionTileY + Class281.anInt3647 shr 6) + "," + (0x3f and Class352.anInt4336 - -za_Sub2.regionTileX) + "," + (0x3f and Class281.anInt3647 - -Class90.regionTileY) + " Height: " + ((Class275.method2064(
                                    Class352.anInt4336,
                                    (Class132.aPlayer_1907!!.plane).toInt(),
                                    11219,
                                    Class281.anInt3647
                                )) - Class121.anInt1797)), -90
                            )
                            return
                        }
                        if (string == "renderprofile" || string == "rp") {
                            Class188.aBoolean2514 = !Class188.aBoolean2514
                            Class348_Sub8.aHa6654!!.method3647(Class188.aBoolean2514)
                            Class110_Sub1.method1042(23.toByte())
                            method94(("showprofiling=" + Class188.aBoolean2514), 106)
                            return
                        }
                        if (string.startsWith("performancetest")) {
                            var i_9_ = -1
                            var i_10_ = 1000
                            if (string.length > 15) {
                                val strings = Class348_Sub40_Sub23.method3113(' ', true, string)
                                try {
                                    if (strings.size > 1) i_10_ = strings[1]!!.toInt()
                                } catch (throwable: Throwable) {
                                    /* empty */
                                }
                                try {
                                    if (strings.size > 2) i_9_ = strings[2]!!.toInt()
                                } catch (throwable: Throwable) {
                                    /* empty */
                                }
                            }
                            if (i_9_ == -1) {
                                method94(("Java toolkit: " + method1781(0, -85, i_10_)), i + -32)
                                method94(("SSE toolkit:  " + method1781(2, -73, i_10_)), 60)
                                method94(("D3D toolkit:  " + method1781(3, i + -24, i_10_)), i.toInt() xor 0x11.inv())
                                method94(("GL toolkit:   " + method1781(1, -84, i_10_)), -121)
                                method94(("GLX toolkit:  " + method1781(5, -77, i_10_)), -101)
                                return
                            } else method94(("Performance: " + method1781(i_9_, -69, i_10_)), -84)
                            return
                        }
                        if (string == "nonpcs") {
                            Class373_Sub2.aBoolean7444 = !Class373_Sub2.aBoolean7444
                            method94("nonpcs=" + (Class373_Sub2.aBoolean7444), -120)
                            return
                        }
                        if (string == "autoworld") {
                            Class348_Sub42_Sub20.method3283(127)
                            method94("auto world selected", -59)
                            return
                        }
                        if (string.startsWith("switchworld")) {
                            val i_11_ = string.substring(12).toInt()
                            method2972((method1742(false, i_11_)!!.aString5794), i_11_, -93)
                            method94("switched", 70)
                            return
                        }
                        if (string == "getworld") {
                            method94(("w: " + (Class3.aClass161_125!!.anInt2143)), -120)
                            return
                        }
                        if (string.startsWith("pc")) {
                            val class348_sub47 = (method2148(Class348_Sub40_Sub22.aClass351_9304, Class348_Sub23_Sub2.aClass77_9029, -97))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                            val i_12_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                            val i_13_ = string.indexOf(" ", 4)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string.substring(3, i_13_))
                            method3544((class348_sub47.aClass348_Sub49_Sub2_7116!!), i + -12, string.substring(i_13_))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(114, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 + -i_12_))
                            Class348_Sub42_Sub14.method3243(i.toInt() xor 0x49.inv(), class348_sub47)
                            return
                        }
                        if (string == "savevarcs") {
                            method2405(119)
                            method94("perm varcs saved", -103)
                            return
                        }
                        if (string == "scramblevarcs") {
                            var i_14_ = 0
                            while ((i_14_ < Class77.Companion.anIntArray1303!!.size)) {
                                if (Class286_Sub6.aBooleanArray6270!![i_14_]) {
                                    Class77.Companion.anIntArray1303!![i_14_] = (Math.random() * 99999.0).toInt()
                                    if (Math.random() > 0.5) Class77.Companion.anIntArray1303!![i_14_] *= -1
                                }
                                i_14_++
                            }
                            method2405(-61)
                            method94("perm varcs scrambled", -74)
                            return
                        }
                        if (string == "showcolmap") {
                            Class375.aBoolean4542 = true
                            method464(-1)
                            method94("colmap is shown", 53)
                            return
                        }
                        if (string == "hidecolmap") {
                            Class375.aBoolean4542 = false
                            method464(i.toInt() xor 0x4e)
                            method94("colmap is hidden", 61)
                            return
                        }
                        if (string == "resetcache") {
                            Class348_Sub18.method2938(122.toByte())
                            method94("Caches reset", -113)
                            return
                        }
                        if (string == "profilecpu") {
                            method94((Class284.method2116(-26584).toString() + "ms"), 87)
                            return
                        }
                        if (string.startsWith("getclientvarpbit")) {
                            val i_15_ = string.substring(17).toInt()
                            method94("varpbit=" + Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method62(i_15_, i.toInt() xor 0xffb1), i + 198)
                            return
                        }
                        if (string.startsWith("getclientvarp")) {
                            val i_16_ = string.substring(14).toInt()
                            method94("varp=" + Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method61(i_16_, (-16).toByte()), -68)
                            return
                        }
                        if (string.startsWith("directlogin")) {
                            val strings = (method3113(' ', true, string.substring(12)))
                            if (strings.size >= 2) {
                                val i_17_ = (if (strings.size > 2) strings[2]!!.toInt() else 0)
                                Class253.method1922(strings[1], i_17_, strings[0], true)
                                return
                            }
                        }
                        if (string.startsWith("csprofileclear")) {
                            method706()
                            return
                        }
                        if (string.startsWith("csprofileoutputc")) {
                            method715(100, false)
                            return
                        }
                        if (string.startsWith("csprofileoutputt")) {
                            method715(10, true)
                            return
                        }
                        if (string.startsWith("texsize")) {
                            val i_18_ = string.substring(8).toInt()
                            Class348_Sub8.aHa6654!!.method3696(i_18_)
                            return
                        }
                        if (string == "soundstreamcount") {
                            method94(("Active streams: " + Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2887()), 84)
                            return
                        }
                        if (string == "autosetup") {
                            method2478(1000)
                            method94(("Complete. Toolkit now: " + Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(i + -32271)), -97)
                            return
                        }
                        if (string == "errormessage") {
                            method94(Class79.Companion.aClient1367!!.method81(102.toByte())!!, 102)
                            return
                        }
                        if (string == "heapdump") {
                            if (!Class297.aString3803.startsWith("win")) Class158.method1247(File("/tmp/heap.dump"), false, false)
                            else Class158.method1247(File("C:\\Temp\\heap.dump"), false, false)
                            method94("Done", 74)
                            return
                        }
                        if (string == "os") {
                            method94("Name: " + Class297.aString3803, 59)
                            method94(("Arch: " + Class297.aString3780), i.toInt() xor 0x1.inv())
                            method94("Ver: " + Class297.aString3778, 79)
                            return
                        }
                        if (string.startsWith("w2debug")) {
                            val i_19_ = string.substring(8, 9).toInt()
                            Class318_Sub1_Sub4_Sub2.anInt10096 = i_19_
                            Class348_Sub20.method2953((-103).toByte())
                            method94("Toggled!", -99)
                            return
                        }
                        if (string.startsWith("ortho ")) {
                            val i_20_ = string.indexOf(' ')
                            if (i_20_ < 0) method94("Syntax: ortho <n>", 66)
                            else {
                                val i_21_ = (Class348_Sub41.method3156(true, string.substring(1 + i_20_)))
                                Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub3_7222), i_21_)
                                method243(37)
                                r.aBoolean9719 = false
                                Class348_Sub42_Sub3.method3179(i + 79)
                                if (Class316.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(-32350) == i_21_) {
                                    method94("Successfully changed ortho mode", -82)
                                    return
                                } else method94("Failed to change ortho mode", -112)
                                return
                            }
                            return
                        }
                        if (string.startsWith("orthozoom ")) {
                            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub3_7222!!.method1727(i + -32271) == 0) method94("enable ortho mode first (use 'ortho <n>')", i + 182)
                            else {
                                val i_22_ = (Class348_Sub41.method3156(true, string.substring(string.indexOf(' ') - -1)))
                                Class132.anInt1911 = i_22_
                                method94(("orthozoom=" + Class132.anInt1911), 68)
                                return
                            }
                            return
                        }
                        if (string.startsWith("orthotilesize ")) {
                            val i_23_ = (Class348_Sub41.method3156(true, string.substring(1 + string.indexOf(' '))))
                            Class45.anInt666 = i_23_
                            Class186_Sub1.anInt5812 = Class45.anInt666
                            method94("ortho tile size=" + i_23_, -70)
                            Class348_Sub42_Sub3.method3179(0)
                            return
                        }
                        if (string == "orthocamlock") {
                            Class348_Sub49_Sub1.aBoolean9746 = !Class348_Sub49_Sub1.aBoolean9746
                            method94(("ortho camera lock is " + (if (!(Class348_Sub49_Sub1.aBoolean9746)) "off" else "on")), -92)
                            return
                        }
                        if (string.startsWith("setoutput ")) {
                            var file = File(string.substring(10))
                            if (file.exists()) {
                                file = File(string.substring(10) + "." + method599(-76) + ".log")
                                if (file.exists()) {
                                    method94("file already exists!", 80)
                                    return
                                }
                            }
                            if (Class299_Sub1.aFileOutputStream6323 != null) {
                                Class299_Sub1.aFileOutputStream6323!!.close()
                                Class299_Sub1.aFileOutputStream6323 = null
                            }
                            try {
                                Class299_Sub1.aFileOutputStream6323 = FileOutputStream(file)
                            } catch (filenotfoundexception: FileNotFoundException) {
                                method94(("Could not create " + file.getName()), 81)
                            } catch (securityexception: SecurityException) {
                                method94(("Cannot write to " + file.getName()), i.toInt() xor 0x22.inv())
                            }
                            return
                        }
                        if (string == "closeoutput") {
                            if (Class299_Sub1.aFileOutputStream6323 != null) Class299_Sub1.aFileOutputStream6323!!.close()
                            Class299_Sub1.aFileOutputStream6323 = null
                            return
                        }
                        if (string.startsWith("runscript ")) {
                            val file = File(string.substring(10))
                            if (!file.exists()) {
                                method94("No such file", 120)
                                return
                            }
                            val `is` = method1821(i.toInt() xor 0x41, file)
                            if (`is` == null) {
                                method94("Failed to read file", 119)
                                return
                            }
                            val strings = (method3113('\n', true, (Class261.method1981(method1795(`is`, true), (-89).toByte(), '\r', ""))!!))
                            Class348_Sub42_Sub6.method3189(0, strings)
                        }
                        if (string.startsWith("zoom ")) {
                            val i_24_ = (Class348_Sub41.method3156(true, string.substring(5))).toShort()
                            if (i_24_ > 0) Class320.aShort3992 = i_24_
                            return
                        }
                        if (string.startsWith("fps ") && (Class8.aClass364_165 != Class55_Sub1.aClass364_5271)) {
                            Class295.method2222((Class348_Sub41.method3156(true, string.substring(4))), (-124).toByte())
                            return
                        }
                    } catch (exception: Exception) {
                        method94(Class274.aClass274_3485!!.method2063(Class348_Sub33.anInt6967, 544)!!, -92)
                        return
                    }
                }
                if (Class240.anInt4674 == 10) {
                    Class292.anInt4799++
                    val class348_sub47 = method2148((Class101_Sub2.aClass351_5699), (Class348_Sub23_Sub2.aClass77_9029), i.toInt() xor 0x24)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, string!!.length + 3)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (bool) 1 else 0)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (bool_0_) 1 else 0)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                    Class348_Sub42_Sub14.method3243(120, class348_sub47)
                }
                if (Class240.anInt4674 == 10) {
                    return
                }
                method94(Class274.aClass274_3486!!.method2063(Class348_Sub33.anInt6967, 544) + string, 57)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("lba.B(" + (if (string != null) "{...}" else "null") + ',' + bool + ',' + bool_0_ + ',' + i + ')'))
            }
        }

        fun method813(i: Int, i_25_: Int, i_26_: Int): Class318_Sub1_Sub4? {
            val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_25_]!![i_26_]
            if (class357 == null) return null
            return class357.aClass318_Sub1_Sub4_4403
        }

        @JvmStatic
        fun method814(i: Byte, l: Long) {
            try {
                anInt1438++
                val i_27_ = Class348_Sub6.anInt6633
                if (i > 106) {
                    if (Class130_Sub1.anInt5799 != i_27_) {
                        val i_28_ = i_27_ - Class130_Sub1.anInt5799
                        var i_29_ = (i_28_.toLong() * l / 320L).toInt()
                        if (i_28_ <= 0) {
                            if (i_29_ != 0) {
                                if (i_29_ < i_28_) i_29_ = i_28_
                            } else i_29_ = -1
                        } else if (i_29_ == 0) i_29_ = 1
                        else if (i_28_ < i_29_) i_29_ = i_28_
                        Class130_Sub1.anInt5799 += i_29_
                    }
                    val i_30_ = Class348_Sub7.anInt6652
                    Class76.Companion.aFloat1287 += Class348_Sub27.aFloat6898 * l.toFloat() / 40.0f * 8.0f
                    Class314.aFloat3938 += Class205.aFloat2687 * l.toFloat() / 40.0f * 8.0f
                    if (Class192.anInt2578 != i_30_) {
                        val i_31_ = -Class192.anInt2578 + i_30_
                        var i_32_ = (l * i_31_.toLong() / 320L).toInt()
                        if (i_31_ <= 0) {
                            if (i_32_ == 0) i_32_ = -1
                            else if (i_32_ < i_31_) i_32_ = i_31_
                        } else if (i_32_ != 0) {
                            if (i_31_ < i_32_) i_32_ = i_31_
                        } else i_32_ = 1
                        Class192.anInt2578 += i_32_
                    }
                    method1725(262144)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "lba.A(" + i + ',' + l + ')')
            }
        }
    }
}
