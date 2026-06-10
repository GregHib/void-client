/* Class267 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class267 private constructor(private val aClass69_3392: Class69?) {
    private var anInt3394 = 1
    private var anInterface7_3398: Interface7? = null
    fun method2024(i: Int): Int {
        if (i != -1) return 41
        anInt3390++
        return anInt3394
    }

    fun method2025(interface7: Interface7, bool: Boolean) {
        anInt3399++
        if (bool != false) toString()
        require(interface7.method32(-15004) == aClass69_3392)
        anInterface7_3398 = interface7
    }

    override fun toString(): String {
        anInt3400++
        throw IllegalStateException()
    }

    fun method2027(i: Int): Interface7? {
        anInt3391++
        if (i <= 68) return null
        return anInterface7_3398
    }

    fun method2030(i: Int, i_8_: Int) {
        anInt3394 = i_8_
        anInt3397++
        if (i != 1) method2026(34)
    }

    companion object {
        var anInt3390: Int = 0
        var anInt3391: Int = 0
        var anInt3393: Int = 0
        var anInt3395: Int = 0
        var aClass267_3396: Class267? = Class267(Class69.aClass69_1195)
        var anInt3397: Int = 0
        var anInt3399: Int = 0
        var anInt3400: Int = 0
        var aClass267_3401: Class267? = Class267(Class69.aClass69_1199)
        var aClass267_3402: Class267? = Class267(Class69.aClass69_1199)
        var aClass267_3403: Class267? = Class267(Class69.aClass69_1199)
        var aClass267_3404: Class267? = Class267(Class69.aClass69_1199)
        var aClass267_3405: Class267? = Class267(Class69.aClass69_1199)
        var aClass267_3406: Class267? = Class267(Class69.aClass69_1199)
        var aClass267_3407: Class267? = Class267(Class69.aClass69_1199)
        var aClass267_3408: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3409: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3410: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3411: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3412: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3413: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3414: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3415: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3416: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3417: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3418: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3419: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3420: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3421: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3422: Class267? = Class267(Class69.aClass69_1197)
        var aClass267_3423: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3424: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3425: Class267? = Class267(Class69.aClass69_1195)
        var aClass267_3426: Class267? = Class267(Class69.aClass69_1198)
        var aClass114_3427: Class114? = Class114(93, -2)
        @JvmField
        var anInt3428: Int = -1

        @JvmStatic
        fun method2026(i: Int) {
            aClass267_3421 = null
            aClass267_3413 = null
            aClass267_3404 = null
            aClass267_3405 = null
            aClass267_3403 = null
            aClass267_3411 = null
            if (i == 23377) {
                aClass267_3410 = null
                aClass267_3420 = null
                aClass267_3414 = null
                aClass267_3409 = null
                aClass267_3418 = null
                aClass267_3426 = null
                aClass267_3412 = null
                aClass267_3423 = null
                aClass267_3424 = null
                aClass267_3408 = null
                aClass267_3416 = null
                aClass267_3407 = null
                aClass267_3406 = null
                aClass267_3419 = null
                aClass267_3401 = null
                aClass267_3425 = null
                aClass267_3402 = null
                aClass267_3415 = null
                aClass267_3396 = null
                aClass114_3427 = null
                aClass267_3422 = null
                aClass267_3417 = null
            }
        }

        @JvmStatic
        fun method2028(i: Int, class51: Class51?, i_0_: Int, var_ha: ha?, i_1_: Int, i_2_: Int) {
            var i_1_ = i_1_
            try {
                anInt3395++
                val class218 = Class2.aClass141_117!!.method1173(31.toByte(), class51!!.anInt875)
                if (class218!!.anInt2853 != -1) {
                    if (class51.aBoolean912) {
                        i_1_ += class51.anInt923
                        i_1_ = i_1_ and 0x3
                    } else i_1_ = 0
                    val class105 = class218.method1596(i_1_, class51.aBoolean925, 82, var_ha!!)
                    if (class105 != null) {
                        var i_3_ = class51.anInt961
                        var i_4_ = class51.anInt926
                        val i_5_ = 60 % ((52 - i_2_) / 56)
                        if ((0x1 and i_1_) == 1) {
                            i_3_ = class51.anInt926
                            i_4_ = class51.anInt961
                        }
                        var i_6_ = class105.method966()
                        var i_7_ = class105.method980()
                        if (class218.aBoolean2854) {
                            i_7_ = i_4_ * 4
                            i_6_ = i_3_ * 4
                        }
                        if (class218.anInt2856 == 0) class105.method973(i, -((i_4_ + -1) * 4) + i_0_, i_6_, i_7_)
                        else class105.method970(i, i_0_ - 4 * (-1 + i_4_), i_6_, i_7_, 0, (class218.anInt2856 or 0xffffff.inv()), 1)
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("up.C(" + i + ',' + (if (class51 != null) "{...}" else "null") + ',' + i_0_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ')'))
            }
        }

        @JvmStatic
        fun method2029(i: Int): Array<Class267?>? {
            if (i <= 99) return null
            anInt3393++
            return (arrayOf<Class267?>(
                aClass267_3396,
                aClass267_3401,
                aClass267_3402,
                aClass267_3403,
                aClass267_3404,
                aClass267_3405,
                aClass267_3406,
                aClass267_3407,
                aClass267_3408,
                aClass267_3409,
                aClass267_3410,
                aClass267_3411,
                aClass267_3412,
                aClass267_3413,
                aClass267_3414,
                aClass267_3415,
                aClass267_3416,
                aClass267_3417,
                aClass267_3418,
                aClass267_3419,
                aClass267_3420,
                aClass267_3421,
                aClass267_3422,
                aClass267_3423,
                aClass267_3424,
                aClass267_3425,
                aClass267_3426
            ))
        }
    }
}
