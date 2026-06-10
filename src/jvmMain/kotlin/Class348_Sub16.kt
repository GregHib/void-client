import kotlin.concurrent.Volatile

/* Class348_Sub16 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class348_Sub16 : Class348() {
    @JvmField
    @Volatile
    var aBoolean6784: Boolean = true
    @JvmField
    var aClass348_Sub16_6785: Class348_Sub16? = null
    @JvmField
    var anInt6786: Int = 0
    @JvmField
    var aClass348_Sub19_6787: Class348_Sub19? = null

    fun method2815(`is`: IntArray, i: Int, i_0_: Int) {
        if (this.aBoolean6784) method2817(`is`, i, i_0_)
        else method2819(i_0_)
    }

    abstract fun method2816(): Class348_Sub16?

    abstract fun method2817(`is`: IntArray, i: Int, i_1_: Int)

    abstract fun method2818(): Class348_Sub16?

    abstract fun method2819(i: Int)

    open fun method2820(): Int {
        return 255
    }

    abstract fun method2821(): Int
}
