/* Class346 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class346 {
    abstract fun method2695(i: Int)

    abstract fun method2696(i: Int, i_0_: Int): Boolean

    abstract fun method2697(i: Int): Interface6?

    abstract fun method2698(i: Int)

    companion object {
        @JvmField
        var anInt4274: Int = 0
        @JvmField
        var aBoolean4275: Boolean = false
        @JvmField
        var anInt4276: Int = 0
        @JvmField
        var anInt4277: Int = 0

        @JvmStatic
        fun method2699(i: Int, `is`: Array<ShortArray?>?, fs: Array<FloatArray?>?): Array<ShortArray?>? {
            try {
                if (i != 16383) return null
                var i_1_ = 0
                while (fs!!.size > i_1_) {
                    for (i_2_ in `is`!![i_1_]!!.indices) `is`[i_1_]!![i_2_] = (16383.0f * fs[i_1_]!![i_2_]).toInt().toShort()
                    i_1_++
                }
                anInt4277++
                return `is`
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("efa.L(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (fs != null) "{...}" else "null") + ')'))
            }
        }
    }
}
