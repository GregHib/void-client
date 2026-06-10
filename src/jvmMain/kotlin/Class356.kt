import Class348_Sub17.Companion.method2929

/* Class356 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class356 internal constructor(var anInt4377: Int) {
    var aClass348Array4374: Array<Class348>
    private var aLong4385: Long = 0
    private var aClass348_4389: Class348? = null
    private var aClass348_4390: Class348? = null
    private var anInt4391 = 0

    fun method3474(i: Int): Int {
        if (i != 1) method3479(20)
        anInt4387++
        var i_0_ = 0
        var i_1_ = 0
        while (this.anInt4377 > i_1_) {
            val class348 = this.aClass348Array4374[i_1_]
            var class348_2_ = class348.aClass348_4294
            while (class348 !== class348_2_) {
                i_0_++
                class348_2_ = class348_2_!!.aClass348_4294
            }
            i_1_++
        }
        return i_0_
    }

    fun method3475(bool: Boolean): Int {
        anInt4376++
        if (bool != true) method3478(false)
        return this.anInt4377
    }

    fun method3476(bool: Boolean): Class348? {
        anInt4384++
        if (aClass348_4389 == null) return null
        val class348 = (this.aClass348Array4374[((this.anInt4377 - 1).toLong() and aLong4385).toInt()])
        if (bool != true) method3479(4)
        while ( /**/aClass348_4389 !== class348) {
            if (aClass348_4389!!.aLong4291 == aLong4385) {
                val class348_3_ = aClass348_4389
                aClass348_4389 = aClass348_4389!!.aClass348_4294
                return class348_3_
            }
            aClass348_4389 = aClass348_4389!!.aClass348_4294
        }
        aClass348_4389 = null
        return null
    }

    fun method3477(i: Int, class348s: Array<Class348?>): Int {
        if (i != 3) anInt4383 = -76
        anInt4380++
        var i_4_ = 0
        var i_5_ = 0
        while (this.anInt4377 > i_5_) {
            val class348 = this.aClass348Array4374[i_5_]
            var class348_6_ = class348.aClass348_4294
            while (class348 !== class348_6_) {
                class348s[i_4_++] = class348_6_
                class348_6_ = class348_6_!!.aClass348_4294
            }
            i_5_++
        }
        return i_4_
    }

    fun method3480(l: Long, i: Int): Class348? {
        try {
            aLong4385 = l
            anInt4379++
            val class348 = (this.aClass348Array4374[(l and (this.anInt4377 + -1).toLong()).toInt()])
            if (i != -6008) method3484(80)
            aClass348_4389 = class348.aClass348_4294
            while (aClass348_4389 !== class348) {
                if (l == aClass348_4389!!.aLong4291) {
                    val class348_7_ = aClass348_4389
                    aClass348_4389 = aClass348_4389!!.aClass348_4294
                    return class348_7_
                }
                aClass348_4389 = aClass348_4389!!.aClass348_4294
            }
            aClass348_4389 = null
            return null
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, "eq.C(" + l + ',' + i + ')')
        }
    }

    fun method3481(i: Int) {
        anInt4375++
        var i_8_ = i
        while (this.anInt4377 > i_8_) {
            val class348 = this.aClass348Array4374[i_8_]
            while (true) {
                val class348_9_ = class348.aClass348_4294
                if (class348_9_ === class348) break
                class348_9_!!.method2715(54.toByte())
            }
            i_8_++
        }
        aClass348_4389 = null
        aClass348_4390 = null
    }

    fun method3482(i: Int): Class348? {
        anInt4381++
        if (anInt4391 > i && (aClass348_4390 !== this.aClass348Array4374[-1 + anInt4391])) {
            val class348 = aClass348_4390
            aClass348_4390 = class348!!.aClass348_4294
            return class348
        }
        while (this.anInt4377 > anInt4391) {
            val class348 = (this.aClass348Array4374[anInt4391++].aClass348_4294)
            if (this.aClass348Array4374[-1 + anInt4391] !== class348) {
                aClass348_4390 = class348!!.aClass348_4294
                return class348
            }
        }
        return null
    }

    fun method3483(i: Byte, l: Long, class348: Class348?) {
        try {
            anInt4382++
            if (i < 18) method3481(71)
            if (class348!!.aClass348_4295 != null) class348.method2715(57.toByte())
            val class348_10_ = (this.aClass348Array4374[(l and (-1 + this.anInt4377).toLong()).toInt()])
            class348.aClass348_4294 = class348_10_
            class348.aClass348_4295 = class348_10_.aClass348_4295
            class348.aClass348_4295!!.aClass348_4294 = class348
            class348.aClass348_4294!!.aClass348_4295 = class348
            class348.aLong4291 = l
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("eq.K(" + i + ',' + l + ',' + (if (class348 != null) "{...}" else "null") + ')'))
        }
    }

    fun method3484(i: Int): Class348? {
        anInt4391 = i
        anInt4386++
        return method3482(0)
    }

    init {
        this.aClass348Array4374 = Array<Class348>(anInt4377) {
            val class348 = Class348()
            class348.aClass348_4294 = class348
            class348.aClass348_4295 = class348
            class348
        }
    }

    companion object {
        var anInt4375: Int = 0
        var anInt4376: Int = 0
        var anInt4378: Int = 0
        var anInt4379: Int = 0
        var anInt4380: Int = 0
        var anInt4381: Int = 0
        var anInt4382: Int = 0
        @JvmField
        var anInt4383: Int = 0
        var anInt4384: Int = 0
        var anInt4386: Int = 0
        var anInt4387: Int = 0
        var aClass114_4388: Class114? = Class114(3, 3)
        @JvmStatic
        fun method3478(bool: Boolean) {
            aClass114_4388 = null
            if (bool != false) anInt4383 = 67
        }

        fun method3479(i: Int): Class348_Sub21? {
            anInt4378++
            if (i != -1) anInt4383 = 43
            if (Class75.aClass262_1254 == null || r.aClass312_9716 == null) return null
            var class348_sub21 = r.aClass312_9716!!.method2329(10) as Class348_Sub21?
            while (class348_sub21 != null) {
                val class42 = Class75.aClass153_1238!!.method1225(class348_sub21.anInt6847, 92.toByte())
                if (class42 != null && class42.aBoolean609 && class42.method373(Class75.anInterface17_1244!!, 127)) return class348_sub21
                class348_sub21 = r.aClass312_9716!!.method2329(i xor 0xa.inv()) as Class348_Sub21?
            }
            return null
        }
    }
}
