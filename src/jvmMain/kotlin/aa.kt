/* aa - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
abstract class aa {
    companion object {
        @JvmField
        var anInt113: Int = 0
        @JvmField
        var aClass144_114: Class144? = null
        @JvmField
        var anInt115: Int = 0

        @JvmStatic
        fun method158(i: Byte) {
            aClass144_114 = null
            val i_0_ = -87 % ((-25 - i) / 41)
        }

        @JvmStatic
        fun method159(i: Int) {
            if (Class260.anInt3312 > 0) {
                var i_1_ = 0
                var i_2_ = 0
                while (Class286_Sub1.aStringArray6200!!.size > i_2_) {
                    if (Class286_Sub1.aStringArray6200!![i_2_]!!.indexOf("--> ") != -1 && ++i_1_ == Class260.anInt3312) {
                        Class363.aString4461 = (Class286_Sub1.aStringArray6200!![i_2_]!!.substring(2 + Class286_Sub1.aStringArray6200!![i_2_]!!.indexOf(">")))
                        break
                    }
                    i_2_++
                }
            } else Class363.aString4461 = ""
            if (i != -615751774) aClass144_114 = null
            anInt115++
        }

        @JvmStatic
        fun method160(i: Int, i_3_: Int): Int {
            anInt113++
            val d = (i_3_ shr 16 and 0xff).toDouble() / 256.0
            val d_4_ = (0xff and (i_3_ shr 8)).toDouble() / 256.0
            val d_5_ = (i_3_ and 0xff).toDouble() / 256.0
            var d_6_ = d
            if (d_4_ < d_6_) d_6_ = d_4_
            if (d_5_ < d_6_) d_6_ = d_5_
            var d_7_ = d
            if (d_4_ > d_7_) d_7_ = d_4_
            if (d_5_ > d_7_) d_7_ = d_5_
            var d_8_ = 0.0
            if (i != 27076) return 85
            var d_9_ = 0.0
            val d_10_ = (d_6_ + d_7_) / 2.0
            if (d_7_ != d_6_) {
                if (d_10_ < 0.5) d_9_ = (-d_6_ + d_7_) / (d_6_ + d_7_)
                if (d_7_ != d) {
                    if (d_4_ != d_7_) {
                        if (d_5_ == d_7_) d_8_ = (-d_4_ + d) / (d_7_ - d_6_) + 4.0
                    } else d_8_ = 2.0 + (-d + d_5_) / (d_7_ - d_6_)
                } else d_8_ = (-d_5_ + d_4_) / (-d_6_ + d_7_)
                if (d_10_ >= 0.5) d_9_ = (-d_6_ + d_7_) / (-d_6_ + (-d_7_ + 2.0))
            }
            d_8_ /= 6.0
            val i_11_ = (256.0 * d_8_).toInt()
            var i_12_ = (256.0 * d_9_).toInt()
            var i_13_ = (256.0 * d_10_).toInt()
            if (i_12_ < 0) i_12_ = 0
            else if (i_12_ > 255) i_12_ = 255
            if (i_13_ < 0) i_13_ = 0
            else if (i_13_ > 255) i_13_ = 255
            if (i_13_ > 243) i_12_ = i_12_ shr 4
            else if (i_13_ > 217) i_12_ = i_12_ shr 3
            else if (i_13_ > 192) i_12_ = i_12_ shr 2
            else if (i_13_ > 179) i_12_ = i_12_ shr 1
            return ((i_13_ shr 1) + ((i_11_ and 0xff) shr 2 shl 10) + (i_12_ shr 5 shl 7))
        }
    }
}
