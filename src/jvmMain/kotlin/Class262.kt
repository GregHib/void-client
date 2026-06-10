import java.awt.Canvas

class Class262 {
    @JvmField
    var aClass348_3334: Class348 = Class348()
    private var aClass348_3342: Class348? = null

    fun method1988(class262_0_: Class262?, i: Byte) {
        if (i.toInt() != -115) method1995(-53)
        method1989((this.aClass348_3334.aClass348_4294), false, class262_0_)
        anInt3340++
    }

    private fun method1989(class348: Class348?, bool: Boolean, class262_1_: Class262?) {
        do {
            try {
                anInt3325++
                val class348_2_ = (this.aClass348_3334.aClass348_4295)
                this.aClass348_3334.aClass348_4295 = class348!!.aClass348_4295
                class348.aClass348_4295!!.aClass348_4294 = this.aClass348_3334
                if (this.aClass348_3334 !== class348) {
                    class348.aClass348_4295 = (class262_1_!!.aClass348_3334.aClass348_4295)
                    class348.aClass348_4295!!.aClass348_4294 = class348
                    class262_1_.aClass348_3334.aClass348_4295 = class348_2_
                    class348_2_!!.aClass348_4294 = class262_1_.aClass348_3334
                }
                if (bool == false) break
                aClass45_3323 = null
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("uh.K(" + (if (class348 != null) "{...}" else "null") + ',' + bool + ',' + (if (class262_1_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    fun method1990(i: Byte): Class348? {
        anInt3329++
        if (i < 29) aClass348_3342 = null
        val class348 = aClass348_3342
        if (this.aClass348_3334 === class348) {
            aClass348_3342 = null
            return null
        }
        aClass348_3342 = class348!!.aClass348_4294
        return class348
    }

    fun method1993(i: Int): Class348? {
        anInt3336++
        val class348 = this.aClass348_3334.aClass348_4295
        if (this.aClass348_3334 === class348) {
            aClass348_3342 = null
            return null
        }
        aClass348_3342 = class348!!.aClass348_4295
        if (i > -65) method1993(67)
        return class348
    }

    fun method1995(i: Int): Class348? {
        anInt3332++
        val class348 = this.aClass348_3334.aClass348_4294
        if (class348 === this.aClass348_3334) {
            aClass348_3342 = null
            return null
        }
        aClass348_3342 = class348!!.aClass348_4294
        return class348
    }

    fun method1996(i: Int) {
        if (i > 97) {
            anInt3339++
            while (true) {
                val class348 = (this.aClass348_3334.aClass348_4294)
                if (this.aClass348_3334 === class348) break
                class348!!.method2715(24.toByte())
            }
            aClass348_3342 = null
        }
    }

    fun method1997(i: Int): Class348? {
        anInt3341++
        if (i != 8) aClass190ArrayArray3335 = null
        val class348 = this.aClass348_3334.aClass348_4294
        if (this.aClass348_3334 === class348) return null
        class348!!.method2715(114.toByte())
        return class348
    }

    fun method1998(i: Int): Int {
        anInt3333++
        var i_22_ = i
        var class348 = this.aClass348_3334.aClass348_4294
        while (class348 !== this.aClass348_3334) {
            class348 = class348!!.aClass348_4294
            i_22_++
        }
        return i_22_
    }

    fun method1999(class348: Class348, i: Int) {
        if (class348.aClass348_4295 != null) class348.method2715(91.toByte())
        anInt3328++
        class348.aClass348_4294 = this.aClass348_3334
        class348.aClass348_4295 = this.aClass348_3334.aClass348_4295
        class348.aClass348_4295!!.aClass348_4294 = class348
        class348.aClass348_4294!!.aClass348_4295 = class348
    }

    fun method2001(class348: Class348, i: Int) {
        anInt3330++
        if (class348.aClass348_4295 != null) class348.method2715(63.toByte())
        class348.aClass348_4295 = this.aClass348_3334
        class348.aClass348_4294 = this.aClass348_3334.aClass348_4294
        if (i > -89) aClass324_3326 = null
        class348.aClass348_4295!!.aClass348_4294 = class348
        class348.aClass348_4294!!.aClass348_4295 = class348
    }

    fun method2002(i: Byte): Boolean {
        if (i.toInt() != 18) aClass190ArrayArray3335 = null
        anInt3327++
        return this.aClass348_3334 === this.aClass348_3334.aClass348_4294
    }

    fun method2003(i: Int): Class348? {
        anInt3337++
        val class348 = aClass348_3342
        if (class348 === this.aClass348_3334) {
            aClass348_3342 = null
            return null
        }
        val i_24_ = -111 / ((i - -88) / 38)
        aClass348_3342 = class348!!.aClass348_4295
        return class348
    }

    init {
        this.aClass348_3334.aClass348_4295 = this.aClass348_3334
        this.aClass348_3334.aClass348_4294 = this.aClass348_3334
    }

    companion object {
        @JvmField
        var aClass45_3323: Class45? = null
        var anInt3324: Int = 0
        var anInt3325: Int = 0
        @JvmField
        var aClass324_3326: Class324? = null
        var anInt3327: Int = 0
        var anInt3328: Int = 0
        var anInt3329: Int = 0
        var anInt3330: Int = 0
        var anObject3331: Any? = null
        var anInt3332: Int = 0
        var anInt3333: Int = 0
        var aClass190ArrayArray3335: Array<Array<Class190?>?>? = null
        var anInt3336: Int = 0
        var anInt3337: Int = 0
        var anInt3338: Int = 0
        var anInt3339: Int = 0
        var anInt3340: Int = 0
        var anInt3341: Int = 0
        fun method1991(f: Float, f_3_: Float, fs: FloatArray?, i: Int, i_4_: Int, bool: Boolean, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, f_9_: Float, fs_10_: FloatArray?, i_11_: Int, i_12_: Int) {
            var i = i
            var i_7_ = i_7_
            var i_8_ = i_8_
            do {
                try {
                    anInt3338++
                    i_7_ -= i_6_
                    i -= i_4_
                    i_8_ -= i_11_
                    val f_13_ = fs!![2] * i.toFloat() + (fs[1] * i_8_.toFloat() + fs[0] * i_7_.toFloat())
                    val f_14_ = (i_7_.toFloat() * fs[3] + i_8_.toFloat() * fs[4] + i.toFloat() * fs[5])
                    val f_15_ = fs[8] * i.toFloat() + (fs[6] * i_7_.toFloat() + i_8_.toFloat() * fs[7])
                    var f_16_: Float
                    var f_17_: Float
                    if (i_12_ == 0) {
                        f_16_ = 0.5f + (f_3_ + f_13_)
                        f_17_ = -f_15_ + f + 0.5f
                    } else if (i_12_ == 1) {
                        f_17_ = 0.5f + (f_15_ + f)
                        f_16_ = 0.5f + (f_3_ + f_13_)
                    } else if (i_12_ == 2) {
                        f_16_ = 0.5f + (-f_13_ + f_3_)
                        f_17_ = -f_14_ + f_9_ + 0.5f
                    } else if (i_12_ == 3) {
                        f_17_ = -f_14_ + f_9_ + 0.5f
                        f_16_ = f_13_ + f_3_ + 0.5f
                    } else if (i_12_ == 4) {
                        f_16_ = f_15_ + f + 0.5f
                        f_17_ = -f_14_ + f_9_ + 0.5f
                    } else {
                        f_16_ = 0.5f + (f + -f_15_)
                        f_17_ = -f_14_ + f_9_ + 0.5f
                    }
                    if (i_5_ == 1) {
                        val f_18_ = f_16_
                        f_16_ = -f_17_
                        f_17_ = f_18_
                    } else if (i_5_ == 2) {
                        f_17_ = -f_17_
                        f_16_ = -f_16_
                    } else if (i_5_ == 3) {
                        val f_19_ = f_16_
                        f_16_ = f_17_
                        f_17_ = -f_19_
                    }
                    fs_10_!![1] = f_17_
                    fs_10_[0] = f_16_
                    if (bool == false) break
                    method1991(0.31271333f, 1.5829445f, null, -17, 88, true, -70, -107, 8, 5, -0.347415f, null, -24, -19)
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("uh.B(" + f + ',' + f_3_ + ',' + (if (fs != null) "{...}" else "null") + ',' + i + ',' + i_4_ + ',' + bool + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + f_9_ + ',' + (if (fs_10_ != null) "{...}" else "null") + ',' + i_11_ + ',' + i_12_ + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method1992(class318_sub1: Class318_Sub1, i: Int, i_20_: Int, i_21_: Int) {
            if (i_20_ < Class318_Sub7.anInt6451) {
                val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_20_ + 1]!![i_21_]
                if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402!!.method2388(-107)) class318_sub1.method2380(Class9.aHa171, 0, true, (class357.aClass318_Sub1_Sub1_4402), 0, (-116).toByte(), Class270.anInt3465)
            }
            if (i_21_ < Class318_Sub7.anInt6451) {
                val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_20_]!![i_21_ + 1]
                if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402!!.method2388(-92)) class318_sub1.method2380(Class9.aHa171, 0, true, (class357.aClass318_Sub1_Sub1_4402), Class270.anInt3465, (-128).toByte(), 0)
            }
            if (i_20_ < Class318_Sub7.anInt6451 && i_21_ < Class348_Sub41.anInt7054) {
                val class357 = (Class147.aClass357ArrayArrayArray2029!![i]!![i_20_ + 1]!![i_21_ + 1])
                if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402!!.method2388(-107)) class318_sub1.method2380(Class9.aHa171, 0, true, (class357.aClass318_Sub1_Sub1_4402), Class270.anInt3465, (-117).toByte(), Class270.anInt3465)
            }
            if (i_20_ < Class318_Sub7.anInt6451 && i_21_ > 0) {
                val class357 = (Class147.aClass357ArrayArrayArray2029!![i]!![i_20_ + 1]!![i_21_ - 1])
                if (class357 != null && class357.aClass318_Sub1_Sub1_4402 != null && class357.aClass318_Sub1_Sub1_4402!!.method2388(-90)) class318_sub1.method2380(Class9.aHa171, 0, true, (class357.aClass318_Sub1_Sub1_4402), -Class270.anInt3465, (-116).toByte(), Class270.anInt3465)
            }
        }

        @JvmStatic
        fun method1994(i: Int) {
            aClass190ArrayArray3335 = null
            anObject3331 = null
            if (i != -13722) method2000(-104, 106, null, null)
            aClass45_3323 = null
            aClass324_3326 = null
        }

        fun method2000(i: Int, i_23_: Int, canvas: Canvas?, var_d: d?): ha {
            try {
                anInt3324++
                return ha_Sub2(canvas, var_d, i_23_)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("uh.D(" + i + ',' + i_23_ + ',' + (if (canvas != null) "{...}" else "null") + ',' + (if (var_d != null) "{...}" else "null") + ')'))
            }
        }
    }
}
