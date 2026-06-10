import Class348_Sub17.Companion.method2929

/* Class357 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class357 internal constructor(i: Int) {
    var aClass318_Sub1_Sub5_4395: Class318_Sub1_Sub5? = null
    var aClass148_4396: Class148? = null
    var aShort4397: Short = 0
    var aShort4398: Short = 0
    var aByte4399: Byte
    var aClass357_4400: Class357? = null
    var aShort4401: Short = 0
    @JvmField
    var aClass318_Sub1_Sub1_4402: Class318_Sub1_Sub1? = null
    var aClass318_Sub1_Sub4_4403: Class318_Sub1_Sub4? = null
    var aClass318_Sub1_Sub4_4406: Class318_Sub1_Sub4? = null
    var aClass318_Sub1_Sub5_4407: Class318_Sub1_Sub5? = null
    var aClass318_Sub1_Sub2_4408: Class318_Sub1_Sub2? = null
    var aShort4409: Short = 0
    fun method3485(bool: Boolean) {
        var class148: Class148?
        while ( /**/this.aClass148_4396 != null) {
            class148 = this.aClass148_4396!!.aClass148_2038
            this.aClass148_4396!!.method1199((-106).toByte())
            this.aClass148_4396 = class148
        }
        anInt4393++
        if (bool != true) method3486(41, false, -64, 33L, -50)
    }

    init {
        this.aByte4399 = i.toByte()
    }

    companion object {
        var anInt4392: Int = 0
        var anInt4393: Int = 0
        var aClass351_4394: Class351? = Class351(6, -1)
        var aDouble4404: Double = 0.0
        var aClass351_4405: Class351? = Class351(64, -1)
        var aLongArray4410: LongArray? = LongArray(100)

        fun method3486(i: Int, bool: Boolean, i_0_: Int, l: Long, i_1_: Int): String {
            var l = l
            try {
                anInt4392++
                var c = ','
                var c_2_ = '.'
                if (i_0_ == 0) {
                    c = '.'
                    c_2_ = ','
                }
                if (i_0_ == 2) c_2_ = '\u00a0'
                var bool_3_ = false
                if (l < 0) {
                    l = -l
                    bool_3_ = true
                }
                val stringbuffer = StringBuffer(26)
                if (i > 0) {
                    var i_4_ = 0
                    while (i > i_4_) {
                        val i_5_ = l.toInt()
                        l /= 10L
                        stringbuffer.append((i_5_ + (48 + -(l.toInt() * 10))).toChar())
                        i_4_++
                    }
                    stringbuffer.append(c)
                }
                var i_6_ = 0
                while (true) {
                    val i_7_ = l.toInt()
                    l /= 10L
                    stringbuffer.append((i_7_ + (48 - l.toInt() * 10)).toChar())
                    if (l == 0L) break
                    if (bool && ++i_6_ % 3 == 0) stringbuffer.append(c_2_)
                }
                if (bool_3_) stringbuffer.append('-')
                if (i_1_ != 16980) aLongArray4410 = null
                return stringbuffer.reverse().toString()
            } catch (runtimeexception: RuntimeException) {
                throw method2929(runtimeexception, ("es.C(" + i + ',' + bool + ',' + i_0_ + ',' + l + ',' + i_1_ + ')'))
            }
        }

        @JvmStatic
        fun method3487(i: Int) {
            aLongArray4410 = null
            aClass351_4394 = null
            if (i >= -45) aClass351_4405 = null
            aClass351_4405 = null
        }
    }
}
