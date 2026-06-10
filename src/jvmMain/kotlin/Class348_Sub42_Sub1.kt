import Class33.Companion.method340

/* Class348_Sub42_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub1 : Class348_Sub42() {
    private var aClass356_9494: Class356? = null
    fun method3166(i: Int, i_0_: Int, i_1_: Byte): Int {
        anInt9490++
        if (aClass356_9494 == null) return i_0_
        val class348_sub35 = aClass356_9494!!.method3480(i.toLong(), -6008) as Class348_Sub35?
        if (i_1_ < 91) return 72
        if (class348_sub35 == null) return i_0_
        return class348_sub35.anInt6976
    }

    private fun method3167(i: Int, class348_sub49: Class348_Sub49, i_2_: Byte) {
        if (i_2_.toInt() == -86) {
            anInt9489++
            if (i == 249) {
                val i_3_ = class348_sub49.readUnsignedByte(255)
                if (aClass356_9494 == null) {
                    val i_4_ = method340(i_3_, 108.toByte())
                    aClass356_9494 = Class356(i_4_)
                }
                for (i_5_ in 0..<i_3_) {
                    val bool = class348_sub49.readUnsignedByte(i_2_ + 341) == 1
                    val i_6_ = class348_sub49.readMedium(-1)
                    val class348: Class348?
                    if (bool) class348 = Class348_Sub50(class348_sub49.readString((-39).toByte()))
                    else class348 = Class348_Sub35(class348_sub49.readInt((-126).toByte()))
                    aClass356_9494!!.method3483(29.toByte(), i_6_.toLong(), class348)
                }
            }
        }
    }

    fun method3168(class348_sub49: Class348_Sub49, i: Byte) {
        while (true) {
            val i_7_ = class348_sub49.readUnsignedByte(255)
            if (i_7_ == 0) break
            method3167(i_7_, class348_sub49, (-86).toByte())
        }
        anInt9497++
        if (i >= -59) method3169(-56, -67)
    }

    fun method3170(i: Int, string: String?, i_9_: Int): String? {
        anInt9493++
        if (aClass356_9494 == null) return string
        if (i != -250) method3165(0.toByte())
        val class348_sub50 = aClass356_9494!!.method3480(i_9_.toLong(), -6008) as Class348_Sub50?
        if (class348_sub50 == null) return string
        return class348_sub50.aString7211
    }

    companion object {
        var anInt9488: Int = 0
        var anInt9489: Int = 0
        var anInt9490: Int = 0
        var aFloatArray9491: FloatArray?
        var anInt9492: Int = 0
        var anInt9493: Int = 0
        var aBooleanArrayArray9495: Array<BooleanArray?>?
        var anInt9496: Int = 0
        var anInt9497: Int = 0

        @JvmStatic
        fun method3165(i: Byte) {
            if (i > 39) {
                aFloatArray9491 = null
                aBooleanArrayArray9495 = null
            }
        }

        fun method3169(i: Int, i_8_: Int): Boolean {
            if (i_8_ != 0) return true
            anInt9496++
            var class348_sub42_sub12 = (Class348_Sub40_Sub4.aClass262_9111!!.method1995(4) as Class348_Sub42_Sub12?)
            while (class348_sub42_sub12 != null) {
                if (Class367_Sub8.method3549(class348_sub42_sub12.anInt9608, (-28).toByte()) && i.toLong() == (class348_sub42_sub12.aLong9605)) return true
                class348_sub42_sub12 = Class348_Sub40_Sub4.aClass262_9111!!.method1990(99.toByte()) as Class348_Sub42_Sub12?
            }
            return false
        }

        init {
            aFloatArray9491 = FloatArray(4)
            aBooleanArrayArray9495 = arrayOf<BooleanArray?>(
                BooleanArray(13),
                booleanArrayOf(false, false, true, true, true, true, true, false, false, false, false, false, true),
                booleanArrayOf(true, true, true, true, true, true, false, false, false, false, false, false, false),
                booleanArrayOf(true, true, true, false, false, true, true, true, false, false, false, false, false),
                booleanArrayOf(true, false, false, false, false, true, true, true, false, false, false, false, false),
                booleanArrayOf(false, false, true, true, true, true, false, false, false, false, false, false, false),
                booleanArrayOf(false, true, true, true, true, true, false, false, false, false, false, false, true),
                booleanArrayOf(false, true, true, true, true, true, true, true, false, false, false, false, true),
                booleanArrayOf(true, true, false, false, false, false, false, true, false, false, false, false, false),
                booleanArrayOf(true, true, true, true, true, false, false, false, true, true, false, false, false),
                booleanArrayOf(true, false, false, false, true, true, true, true, true, true, false, false, false),
                booleanArrayOf(true, false, true, true, true, true, true, true, false, false, true, true, false),
                booleanArrayOf(true, true, true, true, true, true, true, true, true, true, true, true, true),
                BooleanArray(13),
                booleanArrayOf(true, true, true, true, true, true, true, true, true, true, true, true, true)
            )
        }
    }
}
