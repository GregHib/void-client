import Player.Companion.method2460

/* Class253 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class253 {
    var anInt3244: Int = 2048
    var anInt3245: Int = 0
    var anInt3249: Int = 2048
    var anInt3251: Int = 0
    fun method1921(i: Byte, class348_sub49: Class348_Sub49) {
        anInt3255++
        while (true) {
            val i_11_ = class348_sub49.readUnsignedByte(255)
            if (i_11_ == 0) break
            method1923(i_11_, 4, class348_sub49)
        }
    }

    private fun method1923(i: Int, i_13_: Int, class348_sub49: Class348_Sub49) {
        anInt3254++
        if (i_13_ == 4) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) this.anInt3244 = class348_sub49.readUnsignedShort(i_13_ xor 0x3235f8fc)
                    else if (i == 4) this.anInt3251 = class348_sub49.readShort(13638)
                } else this.anInt3249 = class348_sub49.readUnsignedShort(i_13_ + 842397940)
            } else this.anInt3245 = class348_sub49.readUnsignedByte(255)
        }
    }

    companion object {
        @JvmField
        var anInt3246: Int = 0
        var anInt3247: Int = 0
        var anInt3248: Int = 0
        var anInt3250: Int = 0
        var anInt3252: Int = 0
        @JvmField
        var anInt3253: Int = 0
        var anInt3254: Int = 0
        var anInt3255: Int = 0

        fun method1919(i: Int, f: Float, `is`: ByteArray?, f_0_: Float, i_1_: Int, f_2_: Float, class186: Class186?, f_3_: Float, i_4_: Int, i_5_: Byte, i_6_: Int, f_7_: Float, i_8_: Int) {
            var i_1_ = i_1_
            try {
                var i_9_ = 0
                if (i_5_ < 11) Companion.method1919(97, -1.4756906f, null, 0.7518226f, 93, -0.33127537f, null, -0.6670833f, 25, (-96).toByte(), 123, -1.8054857f, 43)
                while ( /**/i_9_ < i_6_) {
                    method2460(f, i_1_, f_0_, i_4_, i, f_7_, class186, i_9_, 30.toByte(), i_8_, f_3_, `is`, i_6_, f_2_)
                    i_1_ += i * i_8_
                    i_9_++
                }
                anInt3250++
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("u.B(" + i + ',' + f + ',' + (if (`is` != null) "{...}" else "null") + ',' + f_0_ + ',' + i_1_ + ',' + f_2_ + ',' + (if (class186 != null) "{...}" else "null") + ',' + f_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + i_8_ + ')'))
            }
        }

        @JvmStatic
        fun method1920(i: Int, i_10_: Int): Int {
            if (i != 127) return -32
            anInt3252++
            return 0x7f and i_10_
        }

        @JvmStatic
        fun method1922(string: String?, i: Int, string_12_: String?, bool: Boolean) {
            try {
                if (bool == true) {
                    anInt3247++
                    RuntimeException_Sub1.anInt4596 = i
                    Class239_Sub12.anInt5969 = 2
                    Class132.method1138(string_12_, false, string, (-45).toByte())
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("u.E(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + (if (string_12_ != null) "{...}" else "null") + ',' + bool + ')'))
            }
        }
    }
}
