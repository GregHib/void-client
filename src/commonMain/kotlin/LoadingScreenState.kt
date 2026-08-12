/*
 * Class199
 */
class LoadingScreenState internal constructor(private val aBoolean2629: Boolean, private val anInt2635: Int, private var anInt2626: Int, private val aBoolean2625: Boolean) {
    fun method1456(i: Byte): Boolean {
        if (i < 49) return true
        anInt2634++
        return aBoolean2625
    }

    fun method1458(i: Int): Int {
        if (i != -23688) return -22
        anInt2628++
        return anInt2635
    }

    fun method1460(i: Int): Boolean {
        anInt2630++
        if (i >= -27) anInt2626 = 107
        return aBoolean2629
    }

    fun method1462(i: Int): Int {
        anInt2624++
        return anInt2626
    }

    companion object {
        var anInt2624: Int = 0
        var anInt2628: Int = 0
        var anInt2630: Int = 0
        var anInt2634: Int = 0
    }
}