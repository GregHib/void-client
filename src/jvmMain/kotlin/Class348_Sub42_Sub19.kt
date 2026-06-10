import Class13.method226

/* Class348_Sub42_Sub19 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub19 : Class348_Sub42() {
    var anInt9688: Int = 0
    var anInt9689: Int = 0
    var aString9690: String? = null
    var aClass273_9691: Class273? = null
    var aStringArray9692: Array<String?>? = null
    var aClass356Array9693: Array<Class356?>? = null
    var anIntArray9694: IntArray? = null
    var anInt9695: Int = 0
    var anIntArray9696: IntArray? = null
    var anInt9697: Int = 0

    companion object {
        var aClass351_9687: Class351? = Class351(14, -1)
        var anInt9698: Int = 0
        @JvmField
        var anInt9699: Int = 0
        var aClass338Array9700: Array<Class338?>? = null
        var anInt9701: Int = 0

        fun method3276(class211: Class211) {
            if (Class331.anInt4135 < 65535) {
                val class348_sub1 = class211.aClass348_Sub1_2745
                Class239_Sub14.aClass211Array5993!![Class331.anInt4135] = class211
                r.aBooleanArray9718!![Class331.anInt4135] = false
                Class331.anInt4135++
                var i = class211.anInt2731
                if (class211.aBoolean2749) i = 0
                var i_0_ = class211.anInt2731
                if (class211.aBoolean2737) i_0_ = Class189.anInt2524 - 1
                for (i_1_ in i..i_0_) {
                    var i_2_ = 0
                    var i_3_ = ((class348_sub1!!.method2717(89.toByte()) - class348_sub1.method2723(-1) + Class348_Sub23_Sub2.anInt9037) shr Class362.anInt4459)
                    if (i_3_ < 0) {
                        i_2_ -= i_3_
                        i_3_ = 0
                    }
                    var i_4_ = ((class348_sub1.method2717(122.toByte()) + class348_sub1.method2723(-1) - Class348_Sub23_Sub2.anInt9037) shr Class362.anInt4459)
                    if (i_4_ >= Class348_Sub41.anInt7054) i_4_ = Class348_Sub41.anInt7054 - 1
                    for (i_5_ in i_3_..i_4_) {
                        val i_6_ = class211.aShortArray2742!![i_2_++].toInt()
                        var i_7_ = (((class348_sub1.method2724(-1) - class348_sub1.method2723(-1) + Class348_Sub23_Sub2.anInt9037) shr Class362.anInt4459) + (i_6_ ushr 8))
                        var i_8_ = i_7_ + (i_6_ and 0xff) - 1
                        if (i_7_ < 0) i_7_ = 0
                        if (i_8_ >= Class318_Sub7.anInt6451) i_8_ = Class318_Sub7.anInt6451 - 1
                        for (i_9_ in i_7_..i_8_) {
                            val l = (Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_])
                            if ((l and 0xffffL) == 0L) Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_] = l or Class331.anInt4135.toLong()
                            else if ((l and 0xffff0000L) == 0L) Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_] = l or (Class331.anInt4135.toLong() shl 16)
                            else if ((l and 0xffff00000000L) == 0L) Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_] = l or (Class331.anInt4135.toLong() shl 32)
                            else if ((l and 0xffffffffffffL.inv()) == 0L) Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431!![i_1_]!![i_9_]!![i_5_] = l or (Class331.anInt4135.toLong() shl 48)
                        }
                    }
                }
            }
        }

        fun method3277(i: Byte) {
            anInt9698++
            if (Class242.aClass348_Sub42_Sub13_3152 != null) {
                Class242.aClass348_Sub42_Sub13_3152 = null
                method226(Class50_Sub3.anInt5252, Class348_Sub1_Sub1.anInt8806, Class373.anInt4534, 0, Class177.anInt4669)
            }
        }

        @JvmStatic
        fun method3278(i: Int) {
            aClass351_9687 = null
            if (i != 1) anInt9699 = -66
            aClass338Array9700 = null
        }
    }
}
