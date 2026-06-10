import Class285_Sub1.Companion.method2131
import Class286_Sub5.Companion.method2161
import Class289.method2194
import OutputStream_Sub2.Companion.method138

/* Class304 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class304 internal constructor(var anInt3850: Int) {
    override fun toString(): String {
        anInt3851++
        throw IllegalStateException()
    }

    companion object {
        var aBoolean3847: Boolean = false
        var anInt3848: Int = 0
        var anInt3849: Int = 0
        var anInt3851: Int = 0

        fun method2289(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, `is`: ByteArray, i_3_: Int) {
            var i_0_ = i_0_
            var i_2_ = i_2_
            if (i_1_ > -32) method2290()
            anInt3848++
            if (i < i_3_) {
                i_0_ += i
                i_2_ = -i + i_3_ shr 2
                while (--i_2_ >= 0) {
                    `is`[i_0_++] = 1.toByte()
                    `is`[i_0_++] = 1.toByte()
                    `is`[i_0_++] = 1.toByte()
                    `is`[i_0_++] = 1.toByte()
                }
                i_2_ = 0x3 and -i + i_3_
                while (--i_2_ >= 0) `is`[i_0_++] = 1.toByte()
            }
        }

        fun method2290() {
            while (true) {
                var bool = true
                for (i in Class348_Sub40_Sub34.aClass293Array9432!!.indices) {
                    if (!Class348_Sub40_Sub34.aClass293Array9432!![i]!!.method2210()) {
                        synchronized(Class348_Sub40_Sub34.aClass293Array9432!![i]!!) {
                            (Class348_Sub40_Sub34.aClass293Array9432!![i] as Object).notify()
                        }
                        bool = false
                    } else Class146.aLongArray2013!![i] = Class348_Sub40_Sub34.aClass293Array9432!![i]!!.method2204()
                }
                if (bool) break
                try {
                    Class286_Sub5.method2161((-18).toByte(), 1L)
                } catch (exception: Exception) {
                    /* empty */
                }
            }
            Class348_Sub40_Sub34.aClass293Array9432!![Class348_Sub40_Sub34.aClass293Array9432!!.size - 1]!!.method2208()
            method2131(1)
            while (true) {
                var bool = true
                for (i in 0..<Class348_Sub40_Sub34.aClass293Array9432!!.size - 1) {
                    if (!Class348_Sub40_Sub34.aClass293Array9432!![i]!!.method2210()) {
                        synchronized(Class348_Sub40_Sub34.aClass293Array9432!![i]!!) {
                            (Class348_Sub40_Sub34.aClass293Array9432!![i] as Object).notify()
                        }
                        bool = false
                    }
                }
                if (bool) break
                try {
                    method2161(72.toByte(), 1L)
                } catch (exception: Exception) {
                    /* empty */
                }
            }
            for (i in 1..<Class348_Sub40_Sub34.aClass293Array9432!!.size - 2) Class348_Sub40_Sub34.aClass293Array9432!![i]!!.method2208()
            method2131(2)
            while (!Class348_Sub40_Sub34.aClass293Array9432!![0]!!.method2210()) {
                synchronized(Class348_Sub40_Sub34.aClass293Array9432!![0]!!) {
                    (Class348_Sub40_Sub34.aClass293Array9432!![0] as Object).notify()
                }
                try {
                    method2161(112.toByte(), 1L)
                } catch (exception: Exception) {
                    /* empty */
                }
            }
            Class348_Sub40_Sub34.aClass293Array9432!![0]!!.method2208()
        }

        fun method2291(i: Byte, i_4_: Int, i_5_: Int) {
            anInt3849++
            var i_6_ = (Class369.aClass143_4962!!.method1183(true, Class274.aClass274_3507!!.method2063(Class348_Sub33.anInt6967, 544)))
            val i_7_: Int
            if (Class348_Sub42_Sub6.aBoolean9535) {
                var class348_sub42_sub13 = (Class233.aClass107_3022!!.method1011(-87) as? Class348_Sub42_Sub13?)
                while (class348_sub42_sub13 != null) {
                    val i_9_: Int
                    if (class348_sub42_sub13.anInt9615 != 1) i_9_ = method2194(-1, class348_sub42_sub13)
                    else i_9_ = (OutputStream_Sub2.method138((((class348_sub42_sub13.aClass107_9621.aClass348_Sub42_1647.aClass348_Sub42_7063) as Class348_Sub42_Sub12?)!!), false))
                    if (i_6_ < i_9_) i_6_ = i_9_
                    class348_sub42_sub13 = (Class233.aClass107_3022!!.method1003(126.toByte()) as? Class348_Sub42_Sub13?)
                }
                i_6_ += 8
                i_7_ = 21 + 16 * Class8.anInt166
                Class237_Sub1.anInt5819 = (if (Class71.aBoolean1211) 26 else 22) + 16 * Class8.anInt166
            } else {
                var class348_sub42_sub12 = (Class348_Sub40_Sub4.aClass262_9111!!.method1995(4) as? Class348_Sub42_Sub12?)
                while (class348_sub42_sub12 != null) {
                    val i_8_ = method138(class348_sub42_sub12, false)
                    if (i_6_ < i_8_) i_6_ = i_8_
                    class348_sub42_sub12 = Class348_Sub40_Sub4.aClass262_9111!!.method1990(69.toByte()) as? Class348_Sub42_Sub12?
                }
                i_6_ += 8
                Class237_Sub1.anInt5819 = (if (!Class71.aBoolean1211) 22 else 26) + 16 * Class73.anInt4776
                i_7_ = 21 + Class73.anInt4776 * 16
            }
            var i_10_ = -(i_6_ / 2) + i_4_
            if (Class321.anInt4017 < i_6_ + i_10_) i_10_ = -i_6_ + Class321.anInt4017
            if (i_10_ < 0) i_10_ = 0
            var i_11_ = i_5_
            if (i > -108) method2290()
            if (i_11_ + i_7_ > Class348_Sub42_Sub8_Sub2.anInt10432) i_11_ = Class348_Sub42_Sub8_Sub2.anInt10432 + -i_7_
            if (i_11_ < 0) i_11_ = 0
            Class135_Sub1.anInt4717 = i_10_
            Class5_Sub1.aBoolean8335 = true
            Class348_Sub42_Sub5.anInt9532 = i_11_
            Class63.anInt1117 = i_6_
        }
    }
}
