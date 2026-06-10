import java.awt.Font

class Class351 internal constructor(private var anInt4326: Int, var anInt4323: Int) {
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
        var aClass60_4327: Class60? = Class60(3000000, 200)
        var aBoolean4328: Boolean = false
        var aFont4329: Font? = null

        fun method3455(string: String?, i: Int): Boolean {
            anInt4324++
            if (string == null) return false
            var i_0_ = 0
            while ((i_0_ < Class348_Sub42_Sub12.anInt9604)) {
                if (string.equals(Class122.aStringArray1808!![i_0_], ignoreCase = true)) return true
                if (string.equals(aa_Sub2.aStringArray5197!![i_0_], ignoreCase = true)) return true
                i_0_++
            }
            if (i != 28280) aBoolean4328 = false
            return false
        }

        @JvmStatic
        fun method3457(bool: Boolean) {
            aFont4329 = null
            aClass60_4327 = null
            if (bool != true) method3455(null, -16)
        }
    }
}
