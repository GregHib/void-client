import Class54.Companion.method500

/* Class255 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class255 internal constructor(class230: Class230?, i: Int, bool: Boolean, class326: Class326?, class45: Class45?, class45_22_: Class45?) {
    private val aClass45_3267: Class45?
    var aClass45_3268: Class45? = null
    private var aBoolean3269 = false
    var anInt3271: Int = 0
    private val aClass60_3278 = Class60(64)
    var anInt3286: Int = 0
    var aClass60_3287: Class60 = Class60(50)
    var aClass175_3288: Class175 = Class175(250)
    private var aClass126_3289: Class126? = Class126()
    private val aStringArray3290: Array<String?>
    var anInt3291: Int = 0
    private var aClass326_3292: Class326? = null
    private val aStringArray3293: Array<String?>

    fun method1930(i: Int) {
        synchronized(this.aClass60_3287) {
            this.aClass60_3287.method590(0)
            if (i != -21804) method1930(-35)
        }
        anInt3275++
    }

    fun method1932(var_ha: ha?, i: Int, i_0_: Int, class324: Class324?, class154: Class154?, i_1_: Int, bool: Boolean, i_2_: Byte, var_ha_3_: ha?, i_4_: Int, bool_5_: Boolean, i_6_: Int): Class105? {
        try {
            anInt3266++
            val class105 = method1941(i_6_, (-74).toByte(), i_4_, i_0_, i, i_1_, var_ha_3_, class154)
            if (class105 != null) return class105
            var class213 = method1940(90, i_4_)
            if (i_0_ > 1 && class213.anIntArray2762 != null) {
                var i_7_ = -1
                for (i_8_ in 0..9) {
                    if ((class213.anIntArray2831[i_8_] <= i_0_) && class213.anIntArray2831[i_8_] != 0) i_7_ = class213.anIntArray2762!![i_8_]
                }
                if (i_7_ != -1) class213 = method1940(127, i_7_)
            }
            if (i_2_.toInt() != 83) method1935(-83, -37, null, null, false, -49)
            val `is` = class213.method1562(i_0_, bool_5_, i, var_ha_3_, var_ha, class324, class154, i_1_, (-102).toByte(), i_6_)
            if (`is` == null) return null
            val class105_9_: Class105?
            if (bool) class105_9_ = var_ha!!.method3662(36, `is`, 94.toByte(), 0, 36, 32)
            else class105_9_ = var_ha_3_!!.method3662(36, `is`, 94.toByte(), 0, 36, 32)
            if (!bool) {
                val class126 = Class126()
                class126.anInt4982 = i
                class126.aBoolean4990 = class154 != null
                class126.anInt4989 = i_0_
                class126.anInt4992 = i_4_
                class126.anInt4981 = i_1_
                class126.anInt4991 = var_ha_3_!!.anInt4567
                class126.anInt4993 = i_6_
                this.aClass175_3288.method1348(70, class105_9_, class126)
            }
            return class105_9_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ub.C(" + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + (if (class324 != null) "{...}" else "null") + ',' + (if (class154 != null) "{...}" else "null") + ',' + i_1_ + ',' + bool + ',' + i_2_ + ',' + (if (var_ha_3_ != null) "{...}" else "null") + ',' + i_4_ + ',' + bool_5_ + ',' + i_6_ + ')'))
        }
    }

    fun method1934(i: Byte, bool: Boolean) {
        if (i.toInt() != 11) method1935(97, -31, null, null, false, 53)
        anInt3276++
        if (!aBoolean3269 != !bool) {
            aBoolean3269 = bool
            method1939(i.toInt() xor 0x14.inv())
        }
    }

    fun method1936(i: Int) {
        anInt3281++
        synchronized(this.aClass175_3288) {
            this.aClass175_3288.method1345((-126).toByte())
            val i_12_ = -63 / ((21 - i) / 50)
        }
    }

    fun method1937(i: Int, bool: Boolean) {
        anInt3274++
        synchronized(aClass60_3278) {
            aClass60_3278.method578(2, i)
        }
        synchronized(this.aClass60_3287) {
            if (bool != false) method1939(-11)
            this.aClass60_3287.method578(2, i)
        }
        synchronized(this.aClass175_3288) {
            this.aClass175_3288.method1346(-1491, i)
        }
    }

    fun method1938(i: Int) {
        anInt3272++
        synchronized(aClass60_3278) {
            aClass60_3278.method587(-88)
        }
        synchronized(this.aClass60_3287) {
            this.aClass60_3287.method587(-85)
        }
        synchronized(this.aClass175_3288) {
            this.aClass175_3288.method1344((-124).toByte())
        }
        if (i < 105) this.aClass45_3268 = null
    }

    fun method1939(i: Int) {
        synchronized(aClass60_3278) {
            if (i > -28) aClass326_3292 = null
            aClass60_3278.method590(0)
        }
        anInt3277++
        synchronized(this.aClass60_3287) {
            this.aClass60_3287.method590(0)
        }
        synchronized(this.aClass175_3288) {
            this.aClass175_3288.method1345(47.toByte())
        }
    }

    fun method1940(i: Int, i_13_: Int): Class213 {
        anInt3283++
        var class213: Class213?
        synchronized(aClass60_3278) {
            class213 = aClass60_3278.method583(i_13_.toLong(), 90) as Class213?
        }
        if (class213 != null) return class213
        val `is`: ByteArray?
        synchronized(aClass45_3267!!) {
            `is` = aClass45_3267.method410(-1860, method500(7, i_13_), Class251.Companion.method1914(-23590, i_13_))
        }
        class213 = Class213()
        class213.aClass255_2761 = this
        class213.anInt2769 = i_13_
        class213.aStringArray2811 = arrayOf<String?>(null, null, Class274.aClass274_3490!!.method2063(this.anInt3286, 544), null, null)
        class213.aStringArray2763 = (arrayOf<String?>(null, null, null, null, Class274.aClass274_3491!!.method2063(this.anInt3286, 544)))
        if (`is` != null) class213.method1569(768, Class348_Sub49(`is`))
        class213.method1563(92.toByte())
        val i_14_ = 4 / ((i - 13) / 59)
        if (class213.anInt2833 != -1) class213.method1570(1, method1940(90, class213.anInt2758), method1940(101, class213.anInt2833))
        if (class213.anInt2812 != -1) class213.method1556(method1940(-58, class213.anInt2778), (-29).toByte(), method1940(-82, class213.anInt2812))
        if (!aBoolean3269 && class213.aBoolean2783) {
            class213.aString2795 = Class274.aClass274_3488!!.method2063(this.anInt3286, 544)
            class213.anInt2827 = 0
            class213.aStringArray2811 = aStringArray3290
            class213.aStringArray2763 = aStringArray3293
            class213.aBoolean2755 = false
            class213.anIntArray2772 = null
            if (class213.aClass356_2757 != null) {
                var bool = false
                var class348 = class213.aClass356_2757!!.method3484(0)
                while (class348 != null) {
                    val class254 = aClass326_3292!!.method2600(class348.aLong4291.toInt(), 28364)
                    if (class254.aBoolean3261) class348.method2715(60.toByte())
                    else bool = true
                    class348 = class213.aClass356_2757!!.method3482(0)
                }
                if (!bool) class213.aClass356_2757 = null
            }
        }
        synchronized(aClass60_3278) {
            aClass60_3278.method582(class213, i_13_.toLong(), (-118).toByte())
        }
        return class213
    }

    fun method1941(i: Int, i_15_: Byte, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, var_ha: ha?, class154: Class154?): Class105? {
        try {
            aClass126_3289!!.anInt4992 = i_16_
            aClass126_3289!!.anInt4989 = i_17_
            aClass126_3289!!.anInt4991 = var_ha!!.anInt4567
            aClass126_3289!!.anInt4981 = i_19_
            if (i_15_.toInt() != -74) aClass126_3289 = null
            aClass126_3289!!.aBoolean4990 = class154 != null
            aClass126_3289!!.anInt4982 = i_18_
            anInt3282++
            aClass126_3289!!.anInt4993 = i
            return this.aClass175_3288.method1340(123, aClass126_3289!!) as Class105?
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ub.D(" + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + (if (class154 != null) "{...}" else "null") + ')'))
        }
    }

    fun method1942(i: Int, i_20_: Byte) {
        this.anInt3291 = i
        anInt3284++
        synchronized(this.aClass60_3287) {
            this.aClass60_3287.method590(0)
            val i_21_ = 89 % ((-65 - i_20_) / 60)
        }
    }

    init {
        try {
            aBoolean3269 = bool
            aClass326_3292 = class326
            this.aClass45_3268 = class45_22_
            this.anInt3286 = i
            aClass45_3267 = class45
            if (aClass45_3267 != null) {
                val i_23_ = -1 + aClass45_3267.method414(-1)
                this.anInt3271 = aClass45_3267.method407(0, i_23_) + i_23_ * 256
            } else this.anInt3271 = 0
            aStringArray3290 = (arrayOf<String?>(null, null, Class274.aClass274_3490!!.method2063(this.anInt3286, 544), null, null))
            aStringArray3293 = (arrayOf<String?>(null, null, null, null, Class274.aClass274_3491!!.method2063(this.anInt3286, 544)))
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ub.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class326 != null) "{...}" else "null") + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class45_22_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var aClass114_3265: Class114?
        var anInt3266: Int = 0
        var anInt3270: Int = 0
        var anInt3272: Int = 0
        @JvmField
        var anIntArray3273: IntArray? = IntArray(5)
        var anInt3274: Int = 0
        var anInt3275: Int = 0
        var anInt3276: Int = 0
        var anInt3277: Int = 0
        var anInt3279: Int = 0
        var anInt3280: Int = 0
        var anInt3281: Int = 0
        var anInt3282: Int = 0
        var anInt3283: Int = 0
        var anInt3284: Int = 0
        @JvmField
        var aClass161_3285: Class161? = null
        fun method1929(i: Byte): Array<Class74?> {
            if (i.toInt() != -19) method1933(null, null, false)
            anInt3280++
            return (arrayOf<Class74?>(Class348_Sub42_Sub8_Sub2.aClass74_10437, Class348_Sub26.aClass74_6891, Class265.aClass74_4689, Class374.aClass74_4537, Class327.aClass74_4098, Class162.aClass74_2157, Class59_Sub1_Sub2.aClass74_8662, Class39.aClass74_515, Class348_Sub35.aClass74_6977, Class286_Sub1.aClass74_6201, Class91.aClass74_1519, Class348_Sub16_Sub1.aClass74_8853, Class348_Sub40_Sub38.aClass74_9475, Class186.aClass74_2491))
        }

        @JvmStatic
        fun method1931(bool: Boolean) {
            anIntArray3273 = null
            if (bool != true) aClass114_3265 = null
            aClass114_3265 = null
            aClass161_3285 = null
        }

        fun method1933(class45: Class45?, var_ha: ha?, bool: Boolean) {
            try {
                anInt3279++
                var class207s: Array<Class207>? = Class207.method1519(class45!!, Class348_Sub22.anInt6862, 0)
                Class169.aClass105Array2260 = arrayOfNulls<Class105>(class207s!!.size)
                run {
                    var i = 0
                    while (class207s.size > i) {
                        Class169.aClass105Array2260!![i] = var_ha!!.method3691(class207s[i], true)
                        i++
                    }
                }
                class207s = Class207.method1519(class45, Class106.anInt1639, 0)
                Class348_Sub45.aClass105Array7107 = arrayOfNulls<Class105>(class207s!!.size)
                run {
                    var i = 0
                    while (class207s.size > i) {
                        Class348_Sub45.aClass105Array7107!![i] = var_ha!!.method3691(class207s[i], true)
                        i++
                    }
                }
                class207s = Class207.method1519(class45, Class373_Sub2.anInt7429, 0)
                Class239_Sub2.aClass105Array5857 = arrayOfNulls<Class105>(class207s!!.size)
                run {
                    var i = 0
                    while (class207s.size > i) {
                        Class239_Sub2.aClass105Array5857!![i] = var_ha!!.method3691(class207s[i], true)
                        i++
                    }
                }
                class207s = Class207.method1519(class45, ha.anInt4562, 0)
                Class318_Sub1_Sub1_Sub1.aClass105Array9959 = arrayOfNulls<Class105>(class207s!!.size)
                run {
                    var i = 0
                    while (class207s.size > i) {
                        Class318_Sub1_Sub1_Sub1.aClass105Array9959!![i] = var_ha!!.method3691(class207s[i], true)
                        i++
                    }
                }
                class207s = Class207.method1519(class45, Class82.anInt1435, 0)
                Class264.aClass105Array3378 = arrayOfNulls<Class105>(class207s!!.size)
                run {
                    var i = 0
                    while (class207s.size > i) {
                        Class264.aClass105Array3378!![i] = var_ha!!.method3691(class207s[i], true)
                        i++
                    }
                }
                class207s = Class207.method1519(class45, Class115.anInt1756, 0)
                Class239_Sub9.aClass105Array5933 = arrayOfNulls<Class105>(class207s!!.size)
                for (i in class207s.indices) Class239_Sub9.aClass105Array5933!![i] = var_ha!!.method3691(class207s[i], true)
                class207s = Class207.method1519(class45, Class291.anInt3739, 0)
                Class59_Sub1.aClass105Array5294 = arrayOfNulls<Class105>(class207s!!.size)
                run {
                    var i = 0
                    while (class207s.size > i) {
                        Class59_Sub1.aClass105Array5294!![i] = var_ha!!.method3691(class207s[i], true)
                        i++
                    }
                }
                class207s = Class207.method1519(class45, Class86.anInt1481, 0)
                Class25.aClass105Array367 = arrayOfNulls<Class105>(class207s!!.size)
                run {
                    var i = 0
                    while (class207s.size > i) {
                        Class25.aClass105Array367!![i] = var_ha!!.method3691(class207s[i], true)
                        i++
                    }
                }
                class207s = Class207.method1519(class45, Class239_Sub10.anInt5948, 0)
                Class348_Sub40_Sub37.aClass105Array9467 = arrayOfNulls<Class105>(class207s!!.size)
                for (i in class207s.indices) Class348_Sub40_Sub37.aClass105Array9467!![i] = var_ha!!.method3691(class207s[i], true)
                class207s = Class207.method1519(class45, Class113.anInt1742, 0)
                Class348_Sub12.aClass105Array6742 = arrayOfNulls<Class105>(class207s!!.size)
                run {
                    var i = 0
                    while (class207s.size > i) {
                        Class348_Sub12.aClass105Array6742!![i] = var_ha!!.method3691(class207s[i], true)
                        i++
                    }
                }
                class207s = Class207.method1519(class45, Class364.anInt4469, 0)
                Class240.aClass105Array4679 = arrayOfNulls<Class105>(class207s!!.size)
                for (i in class207s.indices) Class240.aClass105Array4679!![i] = var_ha!!.method3691(class207s[i], true)
                class207s = Class207.method1519(class45, Class348_Sub40_Sub38.anInt9473, 0)
                Class113.aClass105Array1744 = arrayOfNulls<Class105>(class207s!!.size)
                run {
                    var i = 0
                    while (class207s.size > i) {
                        Class113.aClass105Array1744!![i] = var_ha!!.method3691(class207s[i], true)
                        i++
                    }
                }
                Class79.aClass105_1365 = var_ha!!.method3691(Class207.method1521(class45, Class52.anInt4895, 0), bool)
                Class239_Sub24.aClass105_6097 = var_ha.method3691(Class207.method1521(class45, (Class186_Sub1.anInt5814), 0), true)
                class207s = Class207.method1519(class45, Class5_Sub3.anInt8370, 0)
                Class200.aClass105Array2640 = arrayOfNulls<Class105>(class207s!!.size)
                for (i in class207s.indices) Class200.aClass105Array2640!![i] = var_ha.method3691(class207s[i], true)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ub.N(" + (if (class45 != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + bool + ')'))
            }
        }

        @JvmStatic
        fun method1935(i: Int, i_10_: Int, class30: Class30?, class64: Class64?, bool: Boolean, i_11_: Int) {
            try {
                anInt3270++
                if (class64 != null) {
                    if (bool != false) method1929(106.toByte())
                    class30!!.method320(class64.EA(), class64.fa(), (-4).toByte(), i_11_, class64.na(), i, class64.V(), class64.G(), class64.HA(), i_10_, class64.RA())
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ub.H(" + i + ',' + i_10_ + ',' + (if (class30 != null) "{...}" else "null") + ',' + (if (class64 != null) "{...}" else "null") + ',' + bool + ',' + i_11_ + ')'))
            }
        }

        init {
            aClass114_3265 = Class114(48, -2)
        }
    }
}
