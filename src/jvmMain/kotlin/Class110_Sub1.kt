import Class239_Sub3.Companion.method1732
import Class50_Sub1.Companion.method462

/* Class110_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class110_Sub1 : Class110() {
    var anInt5786: Int = 0
    var aString5787: String? = null
    var anInt5788: Int = -1
    var aString5794: String? = null

    fun method1038(bool: Boolean): Class283 {
        if (bool != false) method1040(-125)
        anInt5789++
        return Class373_Sub2.aClass283Array7446!![anInt1711]!!
    }

    companion object {
        @JvmField
        var anInt5789: Int = 0
        @JvmField
        var anInt5790: Int = 0
        var aFloatArray5791: FloatArray? = FloatArray(4)
        @JvmField
        var anInt5792: Int = 0
        @JvmField
        var anInt5793: Int = 0
        @JvmStatic
        fun method1039(string: String, bool: Boolean): String {
            anInt5793++
            val stringbuffer = StringBuffer()
            val i = string.length
            if (bool != true) aFloatArray5791 = null
            var i_0_ = 0
            while (i > i_0_) {
                val c = string[i_0_]
                if (c.code == 37 && i > 2 + i_0_) {
                    var i_1_ = string[i_0_ + 1].code
                    val bool_2_ = false
                    var i_3_ = if (i_1_ < 48 || i_1_ > 57) {
                        if (i_1_ < 97 || i_1_ > 102) {
                            if (i_1_ >= 65 && i_1_ <= 70) -55 + i_1_
                            else {
                                stringbuffer.append('%')
                                i_0_++
                                continue
                            }
                        } else -97 + (10 + i_1_)
                    } else i_1_ - 48
                    i_1_ = string[i_0_ + 2].code
                    i_3_ *= 16
                    i_3_ += if (i_1_ >= 48 && i_1_ <= 57) i_1_ - 48
                    else if (i_1_ < 97 || i_1_ > 102) {
                        if (i_1_ >= 65 && i_1_ <= 70) -65 + (10 + i_1_)
                        else {
                            stringbuffer.append('%')
                            i_0_++
                            continue
                        }
                    } else 10 + (i_1_ - 97)
                    if (i_3_ != 0 && method1732(i_3_.toByte(), -129)) stringbuffer.append(method462(i_3_.toByte(), -128))
                    i_0_ += 2
                } else if (c.code != 43) stringbuffer.append(c)
                else stringbuffer.append(' ')
                i_0_++
            }
            return stringbuffer.toString()
        }

        @JvmStatic
        fun method1040(i: Int) {
            if (i == 512) aFloatArray5791 = null
        }

        @JvmStatic
        fun method1041(i: Int, class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3) {
            anInt5790++
            var bool = false
            if ((Class367_Sub11.anInt7396 != class318_sub1_sub3_sub3.anInt10300) && class318_sub1_sub3_sub3.anInt10286 != -1 && class318_sub1_sub3_sub3.anInt10218 == 0) {
                val class17 = Class10.aClass87_191!!.method835((class318_sub1_sub3_sub3.anInt10286), i + 8)
                if (class17.aBoolean241 || ((class17.anIntArray267!![(class318_sub1_sub3_sub3.anInt10267)]) < 1 + (class318_sub1_sub3_sub3.anInt10232))) bool = true
            } else bool = true
            if (bool) {
                val i_4_ = ((class318_sub1_sub3_sub3.anInt10300) + -(class318_sub1_sub3_sub3.anInt10239))
                val i_5_ = (Class367_Sub11.anInt7396 + -(class318_sub1_sub3_sub3.anInt10239))
                val i_6_ = ((class318_sub1_sub3_sub3.anInt10293) * 512 + 256 * class318_sub1_sub3_sub3.method2436(90.toByte()))
                val i_7_ = (512 * (class318_sub1_sub3_sub3.anInt10314) - -(class318_sub1_sub3_sub3.method2436(44.toByte()) * 256))
                val i_8_ = (512 * (class318_sub1_sub3_sub3.anInt10241) + 256 * class318_sub1_sub3_sub3.method2436(98.toByte()))
                val i_9_ = ((class318_sub1_sub3_sub3.anInt10288) * 512 - -(class318_sub1_sub3_sub3.method2436(76.toByte()) * 256))
                class318_sub1_sub3_sub3.x = (i_8_ * i_5_ + (i_4_ - i_5_) * i_6_) / i_4_
                class318_sub1_sub3_sub3.y = (i_7_ * (-i_5_ + i_4_) - -(i_5_ * i_9_)) / i_4_
            }
            class318_sub1_sub3_sub3.anInt10326 = 0
            if ((class318_sub1_sub3_sub3.anInt10231.inv()) == i) class318_sub1_sub3_sub3.method2435(((-108).toByte()).toByte(), 8192, false)
            if (class318_sub1_sub3_sub3.anInt10231 == 1) class318_sub1_sub3_sub3.method2435(((-108).toByte()).toByte(), 12288, false)
            if (class318_sub1_sub3_sub3.anInt10231 == 2) class318_sub1_sub3_sub3.method2435(((-108).toByte()).toByte(), 0, false)
            if (class318_sub1_sub3_sub3.anInt10231 == 3) class318_sub1_sub3_sub3.method2435(((-108).toByte()).toByte(), 4096, false)
        }

        fun method1042(i: Byte) {
            anInt5792++
            za_Sub1.anInt9776 = 0
            Class227.anInt2968 = za_Sub1.anInt9776
            Class86.anInt1482 = Class227.anInt2968
            Class177.anInt4666 = Class86.anInt1482
            val i_10_ = 58 % ((i - -66) / 39)
        }
    }
}
