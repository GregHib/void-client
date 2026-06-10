import Class50_Sub1.Companion.method462

/* Class160 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class160 {
    var aChar2132: Char = 0.toChar()
    var anInt2135: Int = 1
    fun method1255(class348_sub49: Class348_Sub49, i: Int) {
        while (true) {
            val i_0_ = class348_sub49.readUnsignedByte(255)
            if (i_0_ == 0) break
            method1256(-90, i_0_, class348_sub49)
        }
        if (i != -1) aBoolean2130 = false
        anInt2129++
    }

    private fun method1256(i: Int, i_1_: Int, class348_sub49: Class348_Sub49) {
        anInt2136++
        if (i_1_ != 1) {
            if (i_1_ == 2) this.anInt2135 = 0
        } else this.aChar2132 = method462(class348_sub49.readByte(-119), -128)
    }

    companion object {
        var anInt2129: Int = 0
        @JvmField
        var aBoolean2130: Boolean
        var aFloatArray2131: FloatArray?
        @JvmField
        var aBooleanArrayArray2133: Array<BooleanArray?>? = arrayOf<BooleanArray?>(
            booleanArrayOf(true, true, true, true, true, true, true, true, true, true, true, true, true),
            booleanArrayOf(true, true, true, false, false, false, true, true, false, false, false, false, true),
            booleanArrayOf(true, false, false, false, false, true, true, true, false, false, false, false, false),
            booleanArrayOf(false, false, true, true, true, true, false, false, false, false, false, false, false),
            booleanArrayOf(true, true, true, true, true, true, false, false, false, false, false, false, false),
            booleanArrayOf(true, true, true, false, false, true, true, true, false, false, false, false, false),
            booleanArrayOf(true, true, false, false, false, true, true, true, false, false, false, false, true),
            booleanArrayOf(true, true, false, false, false, false, false, true, false, false, false, false, false),
            booleanArrayOf(false, true, true, true, true, true, true, true, false, false, false, false, false),
            booleanArrayOf(true, false, false, false, true, true, true, true, true, true, false, false, false),
            booleanArrayOf(true, true, true, true, true, false, false, false, true, true, false, false, false),
            booleanArrayOf(true, true, true, false, false, false, false, false, false, false, true, true, false),
            BooleanArray(13),
            booleanArrayOf(true, true, true, true, true, true, true, true, true, true, true, true, true),
            BooleanArray(13)
        )
        var anInt2134: Int = 0
        var anInt2136: Int = 0
        var aFloat2137: Float = 0f

        @JvmStatic
        fun method1254(i: Byte) {
            aBooleanArrayArray2133 = null
            aFloatArray2131 = null
            if (i <= 11) aBooleanArrayArray2133 = null
        }

        fun method1257(i: Int, i_2_: Int, i_3_: Int): Boolean {
            if (i > -23) aBooleanArrayArray2133 = null
            anInt2134++
            return (0x20 and i_3_) != 0
        }

        init {
            aFloatArray2131 = FloatArray(4)
            aBoolean2130 = false
        }
    }
}
