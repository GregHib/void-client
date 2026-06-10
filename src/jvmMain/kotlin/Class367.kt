/* Class367 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class367 internal constructor(var aHa_Sub3_4479: ha_Sub3) {
    abstract fun method3520(i: Byte)

    abstract fun method3521(bool: Boolean, i: Byte)

    open fun method3522(i: Int) {
        anInt4484++
        if (i != -16252) method3531(false)
    }

    open fun method3523(i: Byte) {
        if (i.toInt() != 12) method3528(5)
        anInt4482++
    }

    open fun method3524(i: Int) {
        anInt4483++
    }

    abstract fun method3525(i: Int, bool: Boolean)

    abstract fun method3526(i: Int, i_0_: Int, i_1_: Int)

    abstract fun method3527(i: Int, interface18: Interface18?, i_2_: Int)

    open fun method3528(i: Int) {
        anInt4481++
    }

    abstract fun method3530(i: Int): Boolean

    open fun method3531(bool: Boolean) {
        anInt4480++
    }

    open fun method3532(i: Int) {
        if (i == 10425) anInt4485++
    }

    companion object {
        @JvmField
        var anInt4478: Int = 0
        @JvmField
        var anInt4480: Int = 0
        @JvmField
        var anInt4481: Int = 0
        @JvmField
        var anInt4482: Int = 0
        @JvmField
        var anInt4483: Int = 0
        @JvmField
        var anInt4484: Int = 0
        @JvmField
        var anInt4485: Int = 0

        @JvmStatic
        fun method3529(i: Int): Class318_Sub6 {
            anInt4478++
            val class318_sub6 = Class62.aClass243_1114!!.method1875(60) as Class318_Sub6?
            if (i != 32564) method3529(-38)
            if (class318_sub6 != null) {
                Class365.anInt4474--
                return class318_sub6
            }
            return Class318_Sub6()
        }
    }
}
