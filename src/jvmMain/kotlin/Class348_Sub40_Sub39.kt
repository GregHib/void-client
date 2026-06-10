import Class348_Sub23_Sub1.Companion.method2970

/* Class348_Sub40_Sub39 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub39 : Class348_Sub40(0, true) {
    private var aClass50Array9481: Array<Class50?>? = null
    private fun method3151(`is`: Array<IntArray?>?, i: Byte) {
        anInt9487++
        if (i.toInt() != -27) method3152(86)
        val i_0_: Int = Class348_Sub40_Sub6.Companion.anInt9139
        val i_1_ = Class286_Sub2.anInt6212
        Class12.method224((-40).toByte(), `is`)
        Class348_Sub27.method3000(Class239_Sub22.anInt6076, 0, Class299_Sub2.anInt6325, 0, i.toInt() xor 0x28)
        if (aClass50Array9481 != null) {
            var i_2_ = 0
            while (aClass50Array9481!!.size > i_2_) {
                val class50 = aClass50Array9481!![i_2_]!!
                val i_3_ = class50.anInt864
                val i_4_ = class50.anInt865
                if (i_3_ < 0) {
                    if (i_4_ >= 0) class50.method457(i_1_, i_0_, -43)
                } else if (i_4_ < 0) class50.method456(i.toInt() xor 0x6a.inv(), i_0_, i_1_)
                else class50.method455(i_0_, i_1_, -124)
                i_2_++
            }
        }
    }

    override fun method3042(i: Int, i_5_: Int): IntArray? {
        anInt9486++
        val `is` = this.aClass191_7032!!.method1433(i_5_ + -255, i)
        if (this.aClass191_7032!!.aBoolean2570) method3151(this.aClass191_7032!!.method1427(16.toByte()), (-27).toByte())
        return `is`
    }

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_6_: Int) {
        if (i_6_ != 31015) aClass70_9485 = null
        if (i == 0) {
            aClass50Array9481 = arrayOfNulls<Class50>(class348_sub49.readUnsignedByte(255))
            var i_7_ = 0
            while_216_@ while (aClass50Array9481!!.size > i_7_) {
                val i_8_ = class348_sub49.readUnsignedByte(255)
                val i_9_ = i_8_
                while_214_@ do {
                    do {
                        if (i_9_ == 0) {
                            aClass50Array9481!![i_7_] = Class182.method1374(107, class348_sub49)
                            i_7_++
                            continue@while_216_
                        } else if (i_9_ != 1) {
                            if (i_9_ != 2) {
                                if (i_9_ != 3) {
                                    i_7_++
                                    continue@while_216_
                                }
                            } else break
                            break@while_214_
                        }
                        aClass50Array9481!![i_7_] = (method2970(Class348_Sub21.method2955(i_6_, 31013), class348_sub49))
                        i_7_++
                        continue@while_216_
                    } while (false)
                    aClass50Array9481!![i_7_] = (method3036(class348_sub49, Class348_Sub21.method2955(i_6_, -31102)))
                    i_7_++
                    continue@while_216_
                } while (false)
                aClass50Array9481!![i_7_] = Class265.method2022(class348_sub49, 0)
                i_7_++
            }
        } else if (i == 1) this.aBoolean7045 = class348_sub49.readUnsignedByte(255) == 1
        anInt9484++
    }

    override fun method3047(i: Int, i_10_: Int): Array<IntArray?>? {
        anInt9483++
        val `is` = this.aClass322_7033!!.method2557(i_10_ + 1564598923, i)
        if (i_10_ != -1564599039) aClass70_9485 = null
        if (this.aClass322_7033!!.aBoolean4035) {
            val i_11_: Int = Class348_Sub40_Sub6.Companion.anInt9139
            val i_12_ = Class286_Sub2.anInt6212
            val is_13_: Array<IntArray> = Array<IntArray>(i_12_) { IntArray(i_11_) }
            val is_14_ = this.aClass322_7033!!.method2553(0)!!
            method3151(is_13_ as Array<IntArray?>?, (-27).toByte())
            var i_15_ = 0
            while (Class286_Sub2.anInt6212 > i_15_) {
                val is_16_ = is_13_[i_15_]
                val is_17_ = is_14_[i_15_]!!
                val is_18_ = is_17_[0]!!
                val is_19_ = is_17_[1]!!
                val is_20_ = is_17_[2]!!
                for (i_21_ in 0..<Class348_Sub40_Sub6.Companion.anInt9139) {
                    val i_22_ = is_16_[i_21_]
                    is_20_[i_21_] = Class139.method1166(i_22_, 255) shl 4
                    is_19_[i_21_] = Class139.method1166(i_22_ shr 4, 4080)
                    is_18_[i_21_] = Class139.method1166(4080, i_22_ shr 12)
                }
                i_15_++
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9482: Int = 0
        @JvmField
        var anInt9483: Int = 0
        @JvmField
        var anInt9484: Int = 0
        @JvmField
        var aClass70_9485: Class70? = Class70()
        @JvmField
        var anInt9486: Int = 0
        @JvmField
        var anInt9487: Int = 0

        @JvmStatic
        fun method3152(i: Int) {
            aClass70_9485 = null
            if (i != 255) method3152(-42)
        }

        @JvmStatic
        fun method3153(i: Int) {
            anInt9482++
            var class348_sub42_sub13 = (Class233.aClass107_3022!!.method1011(-49) as Class348_Sub42_Sub13?)
            while (class348_sub42_sub13 != null) {
                if (class348_sub42_sub13.anInt9615 > 1) {
                    class348_sub42_sub13.anInt9615 = 0
                    Class259.aClass60_3301!!.method582(class348_sub42_sub13, (class348_sub42_sub13.aClass107_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as Class348_Sub42_Sub12).aLong9600, (-108).toByte())
                    class348_sub42_sub13.aClass107_9621.method1009(i xor 0x7dc976c2)
                }
                class348_sub42_sub13 = (Class233.aClass107_3022!!.method1003(51.toByte()) as Class348_Sub42_Sub13?)
            }
            Class8.anInt166 = 0
            Class73.anInt4776 = i
            Class348_Sub40_Sub4.Companion.aClass262_9111!!.method1996(125)
            Class348_Sub42_Sub12.aClass356_9603!!.method3481(0)
            Class233.aClass107_3022!!.method1009(2110355138)
            Class5_Sub1.aBoolean8335 = false
        }
    }
}
