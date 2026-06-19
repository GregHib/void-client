/*
 * Class351
 */
class FontMetaRef internal constructor(private var anInt4326: Int, var anInt4323: Int) {
    override fun toString(): String {
        anInt4325++
        throw IllegalStateException()
    }

    fun method3456(i: Int): Int {
        anInt4322++
        if (i != 200) anInt4326 = -78
        return anInt4326
    }

    companion object {
        var anInt4322: Int = 0
        var anInt4324: Int = 0
        var anInt4325: Int = 0
        var aLruByteCache_4327: LruByteCache? = LruByteCache(3000000, 200)
        var aBoolean4328: Boolean = false
    }
}