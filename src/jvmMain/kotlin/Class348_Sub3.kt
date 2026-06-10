import jaclib.memory.Stream
import jaclib.memory.Stream.Companion.c
import jaclib.memory.heap.NativeHeapBuffer
import java.awt.Component

class Class348_Sub3 internal constructor(private val aS_Sub3_6566: s_Sub3, var anInt6567: Int, i_43_: Int, var anInt6571: Int, var anInt6575: Int, var anInt6569: Int) : Class348() {
    private var aNativeHeapBuffer6572: NativeHeapBuffer? = null
    private val anIntArray6573: IntArray
    private var aStream6574: Stream? = null
    private var anInterface5_Impl1_6577: Interface5_Impl1? = null
    var aFloat6582: Float
    var anInt6589: Int = 0
    private val aHa_Sub3_6590: ha_Sub3?

    fun method2736(i: Byte, i_0_: Int) {
        if (i.toInt() != -57) method2736(25.toByte(), -39)
        anInt6580++
        aNativeHeapBuffer6572 = aHa_Sub3_6590!!.method3869(77.toByte(), true, i_0_ * 4)
        aStream6574 = Stream(aNativeHeapBuffer6572!!, 0, 4 * i_0_)
    }

    fun method2737(i: Byte, `is`: IntArray, i_1_: Int) {
        anInt6583++
        val interface5_impl2 = aHa_Sub3_6590!!.method3822(47, this.anInt6589 * 3)
        val buffer = interface5_impl2!!.method24(true, false)
        if (buffer != null) {
            if (i.toInt() != -30) method2736(116.toByte(), 72)
            val stream = aHa_Sub3_6590.method3893(buffer, 9179)
            var i_2_ = 0
            var i_3_ = 32767
            var i_4_ = -32768
            if (c()) {
                var i_5_ = 0
                while (i_1_ > i_5_) {
                    val i_6_ = `is`[i_5_]
                    val is_7_ = aS_Sub3_6566.aShortArrayArray8299[i_6_]
                    val i_8_ = anIntArray6573[i_6_]
                    if (i_8_ != 0 && is_7_ != null) {
                        var i_9_ = 0
                        var i_10_ = 0
                        while (i_10_ < is_7_.size) {
                            if ((i_8_ and (1 shl i_9_++)) == 0) i_10_ += 3
                            else {
                                i_2_++
                                for (i_11_ in 0..2) {
                                    val i_12_ = 0xffff and is_7_[i_10_++].toInt()
                                    if (i_12_ < i_3_) i_3_ = i_12_
                                    stream.d(i_12_)
                                    if (i_4_ < i_12_) i_4_ = i_12_
                                }
                            }
                        }
                    }
                    i_5_++
                }
            } else {
                var i_13_ = 0
                while (i_1_ > i_13_) {
                    val i_14_ = `is`[i_13_]
                    val is_15_ = aS_Sub3_6566.aShortArrayArray8299[i_14_]
                    val i_16_ = anIntArray6573[i_14_]
                    if (i_16_ != 0 && is_15_ != null) {
                        var i_17_ = 0
                        var i_18_ = 0
                        while (is_15_.size > i_18_) {
                            if ((1 shl i_17_++ and i_16_) != 0) {
                                i_2_++
                                for (i_19_ in 0..2) {
                                    val i_20_ = 0xffff and is_15_[i_18_++].toInt()
                                    if (i_3_ > i_20_) i_3_ = i_20_
                                    stream.a(i_20_)
                                    if (i_20_ > i_4_) i_4_ = i_20_
                                }
                            } else i_18_ += 3
                        }
                    }
                    i_13_++
                }
            }
            stream.a()
            if (interface5_impl2.method22(i + 7) && i_2_ > 0) {
                aHa_Sub3_6590.method3814((aS_Sub3_6566.anInt8294 and 0x8) != 0, (0x7 and aS_Sub3_6566.anInt8294) != 0, this.anInt6567, 48.toByte())
                if (aHa_Sub3_6590.aBoolean8160) aHa_Sub3_6590.EA(2147483647, this.anInt6571, this.anInt6575, this.anInt6569)
                val class101_sub2 = aHa_Sub3_6590.method3820(false)
                class101_sub2.method932(1.0f, 1.0f / this.aFloat6582, 1.0f / this.aFloat6582, (-80).toByte())
                aHa_Sub3_6590.method3853(i + -2, Class239_Sub18.aClass251_6030)
                aHa_Sub3_6590.method3925(55, anInterface5_Impl1_6577, 1)
                aHa_Sub3_6590.method3862(i + 30, (aS_Sub3_6566.aClass130_8324))
                aHa_Sub3_6590.method3938(Class247.aClass21_3181, i_2_, interface5_impl2, i_3_, 0, 1 + -i_3_ + i_4_, 104)
                aHa_Sub3_6590.method3879(-8629)
            }
        }
    }

    fun method2740(i: Int, i_22_: Int) {
        anInt6576++
        aStream6574!!.a()
        anInterface5_Impl1_6577 = aHa_Sub3_6590!!.method3889(false, 16711680)
        anInterface5_Impl1_6577!!.method17(aNativeHeapBuffer6572!!, 4, 4 * i_22_, (-110).toByte())
        val i_23_ = 44 % ((i - 19) / 33)
        aNativeHeapBuffer6572 = null
        aStream6574 = null
    }

    fun method2741(i: Int, f: Float, i_24_: Int, i_25_: Int, i_26_: Int) {
        var i_26_ = i_26_
        if (this.anInt6567 != -1) {
            val class12 = aHa_Sub3_6590!!.aD4579!!.method3(this.anInt6567, -6662)
            val i_27_ = class12!!.aByte201.toInt() and 0xff
            if (i_27_ != 0 && class12.aByte213.toInt() != 4) {
                val i_28_: Int
                if (i_25_ < 0) i_28_ = 0
                else if (i_25_ <= 127) i_28_ = i_25_ * 131586
                else i_28_ = 16777215
                if (i_27_ != 256) {
                    val i_29_ = i_27_
                    val i_30_ = -i_27_ + 256
                    i_26_ = ((i_30_ * (i_26_ and 0xff00) + i_29_ * (0xff00 and i_28_) and 0xff0000) + (0xff00ff.inv() and (i_29_ * (i_28_ and 0xff00ff) - -((i_26_ and 0xff00ff) * i_30_)))) shr 8
                } else i_26_ = i_28_
            }
            var i_31_ = 0xff and class12.aByte216.toInt()
            if (i_31_ != 0) {
                i_31_ += 256
                var i_32_ = (0xff and (i_26_ shr 16)) * i_31_
                if (i_32_ > 65535) i_32_ = 65535
                var i_33_ = ((0xff00 and i_26_) shr 8) * i_31_
                if (i_33_ > 65535) i_33_ = 65535
                var i_34_ = i_31_ * (0xff and i_26_)
                if (i_34_ > 65535) i_34_ = 65535
                i_26_ = (i_34_ shr 8) + ((i_33_ and 0xff00) + ((0x5400ff00 and i_32_) shl 8))
            }
        }
        anInt6588++
        aStream6574!!.e(i * 4)
        if (f != 1.0f) {
            var i_35_ = i_26_ shr 16 and 0xff
            var i_36_ = 0xff and (i_26_ shr 8)
            i_35_ = (i_35_ * f).toInt()
            var i_37_ = 0xff and i_26_
            if (i_35_ < 0) i_35_ = 0
            else if (i_35_ > 255) i_35_ = 255
            i_36_ = (i_36_ * f).toInt()
            if (i_36_ < 0) i_36_ = 0
            else if (i_36_ > 255) i_36_ = 255
            i_37_ = (i_37_ * f).toInt()
            if (i_37_ < 0) i_37_ = 0
            else if (i_37_ > 255) i_37_ = 255
            i_26_ = i_37_ or (i_35_ shl 16 or (i_36_ shl 8))
        }
        if (i_24_ != 1624) method2743(null, 67.toByte())
        if (aHa_Sub3_6590!!.anInt8178 == 0) {
            aStream6574!!.f(i_26_.toByte().toInt())
            aStream6574!!.f((i_26_ shr 8).toByte().toInt())
            aStream6574!!.f((i_26_ shr 16).toByte().toInt())
        } else {
            aStream6574!!.f((i_26_ shr 16).toByte().toInt())
            aStream6574!!.f((i_26_ shr 8).toByte().toInt())
            aStream6574!!.f(i_26_.toByte().toInt())
        }
    }

    fun method2742(i: Int, i_38_: Int, i_39_: Int, i_40_: Byte) {
        anInt6570++
        anIntArray6573[i_38_ * aS_Sub3_6566.anInt4587 - -i_39_] = Class273.method2057((anIntArray6573[(i_38_ * aS_Sub3_6566.anInt4587 - -i_39_)]), 1 shl i)
        if (i_40_ > -65) aFloat6586 = -1.0413289f
        this.anInt6589++
    }

    fun method2744(i: Byte, i_42_: Int) {
        anInt6578++
        if (i > -106) this.anInt6571 = -80
        aStream6574!!.e(4 * i_42_ + 3)
        aStream6574!!.f(-1)
    }

    init {
        this.aFloat6582 = i_43_.toFloat()
        aHa_Sub3_6590 = aS_Sub3_6566.aHa_Sub3_8322
        anIntArray6573 = IntArray((aS_Sub3_6566.anInt4590 * aS_Sub3_6566.anInt4587))
    }

    companion object {
        @JvmField
        var anInt6568: Int = 0
        @JvmField
        var anInt6570: Int = 0
        @JvmField
        var anInt6576: Int = 0
        @JvmField
        var anInt6578: Int = 0
        @JvmField
        var anInt6579: Int = 0
        @JvmField
        var anInt6580: Int = 0
        @JvmField
        var aClass323_6581: Class323? = null
        @JvmField
        var anInt6583: Int = 0
        @JvmField
        var aClass114_6584: Class114? = null
        @JvmField
        var anInt6585: Int = 0
        @JvmField
        var aFloat6586: Float = 0f
        @JvmField
        var anInt6587: Int = 0
        @JvmField
        var anInt6588: Int = 0
        @JvmStatic
        fun method2738(i: Byte) {
            aClass114_6584 = null
            aClass323_6581 = null
            val i_21_ = 89 / ((19 - i) / 43)
        }

        @JvmStatic
        fun method2739(i: Int) {
            Class348_Sub40_Sub13.aClass262_9201!!.method1996(98)
            anInt6579++
            Class348_Sub34.anInt6969 = i
        }

        @JvmStatic
        fun method2743(component: Component?, i: Byte): Class346 {
            anInt6587++
            val i_41_ = -16 % ((i - -58) / 63)
            return Class346_Sub1(component)
        }
    }
}
