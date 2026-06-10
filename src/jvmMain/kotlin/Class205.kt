import Class117.Companion.method1070
import Class135_Sub2.Companion.method1156
import Class85.Companion.method831

/* Class205 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class205 {
    var anInt2685: Int = 0
    var aClass351_2686: Class351?
    @JvmField
    var aFloat2687: Float = 0.0f
    var anInt2688: Int = 0
    @JvmField
    var anInt2689: Int = 0
    var anInt2690: Int = 0
    @JvmField
    var aClass351_2691: Class351?
    var aClass348_Sub44_2692: Class348_Sub44?
    var aClass114_2693: Class114?
    @JvmField
    var anIntArray2694: IntArray?

    @JvmStatic
    fun method1496(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
        method1070(118.toByte(), i_2_)
        anInt2685++
        var i_6_ = 0
        var i_7_ = -i_4_ + i_2_
        if (i_7_ < 0) i_7_ = 0
        var i_8_ = i_2_
        var i_9_ = -i_2_
        var i_10_ = i_7_
        var i_11_ = -i_7_
        var i_12_ = -1
        if (i_0_ >= Class132.anInt1910 && i_0_ <= Class38.anInt513) {
            val `is`: IntArray = Class17.anIntArrayArray255!![i_0_]!!
            val i_13_ = method831(Class113.anInt1745, -i_2_ + i_5_, Class369.anInt4960, -104)
            val i_14_ = method831(Class113.anInt1745, i_5_ - -i_2_, Class369.anInt4960, i_3_ + -94)
            val i_15_ = method831(Class113.anInt1745, i_5_ - i_7_, Class369.anInt4960, -82)
            val i_16_ = method831(Class113.anInt1745, i_5_ - -i_7_, Class369.anInt4960, -96)
            method1156(-27, i_15_, `is`, i_13_, i)
            method1156(-27, i_16_, `is`, i_15_, i_1_)
            method1156(-27, i_14_, `is`, i_16_, i)
        }
        var i_17_ = -1
        while (i_6_ < i_8_) {
            i_12_ += 2
            i_17_ += 2
            i_11_ += i_17_
            i_9_ += i_12_
            if (i_11_ >= 0 && i_10_ >= 1) {
                i_10_--
                Class348_Sub49_Sub2.anIntArray9757!![i_10_] = i_6_
                i_11_ -= i_10_ shl 1
            }
            i_6_++
            if (i_9_ >= 0) {
                i_8_--
                i_9_ -= i_8_ shl 1
                val i_18_ = i_0_ - i_8_
                val i_19_ = i_0_ + i_8_
                if (Class132.anInt1910 <= i_19_ && Class38.anInt513 >= i_18_) {
                    if (i_8_ >= i_7_) {
                        val i_20_ = method831(Class113.anInt1745, i_6_ + i_5_, Class369.anInt4960, i_3_ xor 0x36)
                        val i_21_ = method831(Class113.anInt1745, i_5_ - i_6_, Class369.anInt4960, 112)
                        if (i_19_ <= Class38.anInt513) Class135_Sub2.method1156(-27, i_20_, (Class17.anIntArrayArray255!![i_19_]!!), i_21_, i)
                        if (Class132.anInt1910 <= i_18_) Class135_Sub2.method1156(-27, i_20_, (Class17.anIntArrayArray255!![i_18_]!!), i_21_, i)
                    } else {
                        val i_22_ = Class348_Sub49_Sub2.anIntArray9757!![i_8_]
                        val i_23_ = method831(Class113.anInt1745, i_6_ + i_5_, Class369.anInt4960, -123)
                        val i_24_ = method831(Class113.anInt1745, -i_6_ + i_5_, Class369.anInt4960, 110)
                        val i_25_ = method831(Class113.anInt1745, i_22_ + i_5_, Class369.anInt4960, 85)
                        val i_26_ = method831(Class113.anInt1745, i_5_ - i_22_, Class369.anInt4960, 84)
                        if (Class38.anInt513 >= i_19_) {
                            val `is`: IntArray = Class17.anIntArrayArray255!![i_19_]!!
                            method1156(-27, i_26_, `is`, i_24_, i)
                            method1156(-27, i_25_, `is`, i_26_, i_1_)
                            method1156(-27, i_23_, `is`, i_25_, i)
                        }
                        if (Class132.anInt1910 <= i_18_) {
                            val `is`: IntArray = Class17.anIntArrayArray255!![i_18_]!!
                            method1156(-27, i_26_, `is`, i_24_, i)
                            method1156(-27, i_25_, `is`, i_26_, i_1_)
                            method1156(-27, i_23_, `is`, i_25_, i)
                        }
                    }
                }
            }
            val i_27_ = -i_6_ + i_0_
            val i_28_ = i_0_ + i_6_
            if (Class132.anInt1910 <= i_28_ && i_27_ <= Class38.anInt513) {
                var i_29_ = i_8_ + i_5_
                var i_30_ = i_5_ + -i_8_
                if (Class369.anInt4960 <= i_29_ && i_30_ <= Class113.anInt1745) {
                    i_29_ = method831(Class113.anInt1745, i_29_, Class369.anInt4960, 102)
                    i_30_ = method831(Class113.anInt1745, i_30_, Class369.anInt4960, -100)
                    if (i_6_ >= i_7_) {
                        if (Class38.anInt513 >= i_28_) Class135_Sub2.method1156(-27, i_29_, (Class17.anIntArrayArray255!![i_28_]!!), i_30_, i)
                        if (i_27_ >= Class132.anInt1910) Class135_Sub2.method1156(-27, i_29_, (Class17.anIntArrayArray255!![i_27_]!!), i_30_, i)
                    } else {
                        val i_31_ = (if (i_6_ > i_10_) Class348_Sub49_Sub2.anIntArray9757!![i_6_] else i_10_)
                        val i_32_ = method831(Class113.anInt1745, i_31_ + i_5_, Class369.anInt4960, 71)
                        val i_33_ = method831(Class113.anInt1745, -i_31_ + i_5_, Class369.anInt4960, 65)
                        if (i_28_ <= Class38.anInt513) {
                            val `is`: IntArray = Class17.anIntArrayArray255!![i_28_]!!
                            method1156(-27, i_33_, `is`, i_30_, i)
                            method1156(-27, i_32_, `is`, i_33_, i_1_)
                            method1156(-27, i_29_, `is`, i_32_, i)
                        }
                        if (Class132.anInt1910 <= i_27_) {
                            val `is`: IntArray = Class17.anIntArrayArray255!![i_27_]!!
                            method1156(i_3_ + -29, i_33_, `is`, i_30_, i)
                            method1156(-27, i_32_, `is`, i_33_, i_1_)
                            method1156(-27, i_29_, `is`, i_32_, i)
                        }
                    }
                }
            }
        }
        if (i_3_ != 2) method1497(79)
    }

    @JvmStatic
    fun method1497(i: Int) {
        anIntArray2694 = null
        aClass348_Sub44_2692 = null
        aClass351_2691 = null
        aClass114_2693 = null
        if (i != 16384) method1496(-23, 118, -17, -52, 33, 108, 2)
        aClass351_2686 = null
    }

    init {
        aClass351_2686 = Class351(41, -1)
        aClass351_2691 = Class351(46, 2)
        aClass348_Sub44_2692 = Class348_Sub44(0, -1)
        anIntArray2694 = IntArray(4096)
        aClass114_2693 = Class114(94, -1)
    }
}
