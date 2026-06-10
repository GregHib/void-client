import Class348_Sub9.Companion.method2778
import jaclib.memory.Stream.Companion.floatToRawIntBits
import s_Sub2.Companion.method4001
import java.util.*

class Class348_Sub49_Sub1 internal constructor(i: Int) : Class348_Sub49(i) {
    fun method3399(i: Int, f: Float) {
        anInt9741++
        val i_23_ = floatToRawIntBits(f)
        this.aByteArray7154!![this.anInt7197++] = i_23_.toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_23_ shr 8).toByte()
        if (i != 18291) aBoolean9746 = true
        this.aByteArray7154!![this.anInt7197++] = (i_23_ shr 16).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_23_ shr 24).toByte()
    }

    fun method3400(f: Float, i: Byte) {
        anInt9744++
        val i_24_ = floatToRawIntBits(f)
        this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 24).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 16).toByte()
        if (i >= -76) aBoolean9746 = true
        this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 8).toByte()
        this.aByteArray7154!![this.anInt7197++] = i_24_.toByte()
    }

    companion object {
        var anInt9741: Int = 0
        var anInt9742: Int = 0
        var aClass351_9743: Class351? = Class351(84, -1)
        var anInt9744: Int = 0
        var anInt9745: Int = 0
        var aBoolean9746: Boolean = true
        @JvmField
        var anInt9747: Int = 0
        var aClass138_9748: Class138? = Class138(7, 0, 1, 1)
        var aClass351_9749: Class351?
        @JvmField
        var anInt9750: Int
        var anInt9751: Int = 0

        fun method3398(bool: Boolean, `is`: Array<Array<ByteArray?>?>?, i: Int, i_0_: Byte, i_1_: Int, i_2_: Int, bool_3_: Boolean) {
            val i_4_ = if (bool) 1 else 0
            Class5_Sub1_Sub1.anInt9930 = 0
            Class348_Sub42_Sub3.anInt9504 = 0
            Class234.anInt3049++
            if ((i_2_ and 0x2) == 0) {
                var class318_sub1 = aClass318_Sub1Array4293!![i_4_]
                while (class318_sub1 != null) {
                    if (!method2778(class318_sub1, bool, `is`, i, i_0_)) {
                        method4001(class318_sub1)
                        if (class318_sub1.anInt6389 != -1) Class239_Sub21.aClass318_Sub1Array6066!![Class5_Sub1_Sub1.anInt9930++] = class318_sub1
                    }
                    class318_sub1 = class318_sub1.aClass318_Sub1_6379
                }
            }
            if ((i_2_ and 0x1) == 0) {
                run {
                    var class318_sub1 = Class250.aClass318_Sub1Array3226!![i_4_]
                    while (class318_sub1 != null) {
                        if (!method2778(class318_sub1, bool, `is`, i, i_0_)) {
                            method4001(class318_sub1)
                            if (class318_sub1.anInt6389 != -1) Class291.aClass318_Sub1Array3737!![Class348_Sub42_Sub3.anInt9504++] = class318_sub1
                        }
                        class318_sub1 = class318_sub1.aClass318_Sub1_6379
                    }
                }
                var class318_sub1 = Class115.aClass318_Sub1Array1754!![i_4_]
                while (class318_sub1 != null) {
                    if (!method2778(class318_sub1, bool, `is`, i, i_0_)) {
                        if (class318_sub1.method2377(122.toByte())) {
                            method4001(class318_sub1)
                            if (class318_sub1.anInt6389 != -1) Class291.aClass318_Sub1Array3737!![Class348_Sub42_Sub3.anInt9504++] = class318_sub1
                        } else {
                            method4001(class318_sub1)
                            if (class318_sub1.anInt6389 != -1) Class239_Sub21.aClass318_Sub1Array6066!![Class5_Sub1_Sub1.anInt9930++] = class318_sub1
                        }
                    }
                    class318_sub1 = class318_sub1.aClass318_Sub1_6379
                }
                if (!bool) {
                    for (i_5_ in 0..<Class86.anInt1477) {
                        if (!Class348_Sub9.method2778((Class24.aClass318_Sub1_Sub3Array357!![i_5_]!!), bool, `is`, i, i_0_)) {
                            s_Sub2.method4001(Class24.aClass318_Sub1_Sub3Array357!![i_5_]!!)
                            if ((Class24.aClass318_Sub1_Sub3Array357!![i_5_]!!.anInt6389) != -1) {
                                if (Class24.aClass318_Sub1_Sub3Array357!![i_5_]!!.method2377(122.toByte())) Class291.aClass318_Sub1Array3737!![Class348_Sub42_Sub3.anInt9504++] = (Class24.aClass318_Sub1_Sub3Array357!![i_5_])
                                else Class239_Sub21.aClass318_Sub1Array6066!![Class5_Sub1_Sub1.anInt9930++] = (Class24.aClass318_Sub1_Sub3Array357!![i_5_])
                            }
                        }
                    }
                }
            }
            if (Class5_Sub1_Sub1.anInt9930 > 0) {
                Class167.method1295(Class239_Sub21.aClass318_Sub1Array6066!!, 0, Class5_Sub1_Sub1.anInt9930 - 1)
                for (i_6_ in 0..<Class5_Sub1_Sub1.anInt9930) Class13.method227(Class239_Sub21.aClass318_Sub1Array6066!![i_6_]!!, true, bool_3_)
            }
            if (Class318_Sub1_Sub3_Sub3.aBoolean10221) Class9.aHa171!!.method3642(0, null)
            if ((i_2_ and 0x2) == 0) {
                for (i_7_ in Canvas_Sub1.anInt67..<Class189.anInt2524) {
                    if (i_7_ >= i && `is` != null) {
                        var i_8_ = Class99.aBooleanArrayArray1572!!.size
                        if ((Class37.anInt492 + Class99.aBooleanArrayArray1572!!.size) > Class318_Sub7.anInt6451) i_8_ -= (Class37.anInt492 + Class99.aBooleanArrayArray1572!!.size - Class318_Sub7.anInt6451)
                        var i_9_ = Class99.aBooleanArrayArray1572!![0]!!.size
                        if ((Class348_Sub34.anInt6974 + Class99.aBooleanArrayArray1572!![0]!!.size) > Class348_Sub41.anInt7054) i_9_ -= (Class348_Sub34.anInt6974 + Class99.aBooleanArrayArray1572!![0]!!.size - Class348_Sub41.anInt7054)
                        var bools = Class348_Sub8.aBooleanArrayArray6656
                        if (Class348_Sub40_Sub17.aBoolean9242) {
                            if (Class348_Sub40_Sub5.aBoolean9121) bools = Class115.aBooleanArrayArrayArray1751!![i_7_]
                            for (i_10_ in Class105_Sub1.anInt8412..<i_8_) {
                                val i_11_ = (i_10_ + Class37.anInt492 - Class105_Sub1.anInt8412)
                                for (i_12_ in Class240.anInt4686..<i_9_) {
                                    bools!![i_10_]!![i_12_] = false
                                    if (Class99.aBooleanArrayArray1572!![i_10_]!![i_12_]) {
                                        val i_13_ = (i_12_ + Class348_Sub34.anInt6974 - Class240.anInt4686)
                                        for (i_14_ in i_7_ downTo 0) {
                                            if ((Class147.aClass357ArrayArrayArray2029!![i_14_]!![i_11_]!![i_13_]) != null && (Class147.aClass357ArrayArrayArray2029!![i_14_]!![i_11_]!![i_13_]!!.aByte4399).toInt() == i_7_) {
                                                bools[i_10_]!![i_12_] = (i_14_ < i || (`is`[i_14_]!![i_11_]!![i_13_]) != i_0_) && (!aa_Sub2.method164(i_7_, i_11_, (-97).toByte(), i_13_))
                                                break
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (Class348_Sub40_Sub5.aBoolean9121) {
                            if (i_1_ >= 0) aa_Sub1.aSArray5191!![i_7_]!!.method3984(0, 0, 0, null, false, i_1_, i_2_)
                            else aa_Sub1.aSArray5191!![i_7_]!!.method3983(0, 0, 0, null, false, i_2_)
                            for (i_15_ in 0..<Npc.anInt10503) Class319.aClass315Array3982!![i_15_]!!.method2359(Class318_Sub2(i_7_ + 1), -1)
                        } else if (i_1_ >= 0) aa_Sub1.aSArray5191!![i_7_]!!.method3984(Class239_Sub25.anInt6111, Class285_Sub2.anInt8502, Class318_Sub1_Sub4_Sub1.anInt10084, Class348_Sub8.aBooleanArrayArray6656!!, false, i_1_, i_2_)
                        else aa_Sub1.aSArray5191!![i_7_]!!.method3983(Class239_Sub25.anInt6111, Class285_Sub2.anInt8502, Class318_Sub1_Sub4_Sub1.anInt10084, Class348_Sub8.aBooleanArrayArray6656!!, false, i_2_)
                    } else {
                        var i_16_ = Class99.aBooleanArrayArray1572!!.size
                        if ((Class37.anInt492 + Class99.aBooleanArrayArray1572!!.size) > Class318_Sub7.anInt6451) i_16_ -= (Class37.anInt492 + Class99.aBooleanArrayArray1572!!.size - Class318_Sub7.anInt6451)
                        var i_17_ = Class99.aBooleanArrayArray1572!![0]!!.size
                        if ((Class348_Sub34.anInt6974 + Class99.aBooleanArrayArray1572!![0]!!.size) > Class348_Sub41.anInt7054) i_17_ -= (Class348_Sub34.anInt6974 + Class99.aBooleanArrayArray1572!![0]!!.size - Class348_Sub41.anInt7054)
                        var bools = Class348_Sub8.aBooleanArrayArray6656
                        if (Class348_Sub40_Sub17.aBoolean9242) {
                            if (Class348_Sub40_Sub5.aBoolean9121) bools = Class115.aBooleanArrayArrayArray1751!![i_7_]
                            for (i_18_ in Class105_Sub1.anInt8412..<i_16_) {
                                val i_19_ = (i_18_ + Class37.anInt492 - Class105_Sub1.anInt8412)
                                for (i_20_ in Class240.anInt4686..<i_17_) {
                                    bools!![i_18_]!![i_20_] = (Class99.aBooleanArrayArray1572!![i_18_]!![i_20_]) && !aa_Sub2.method164(i_7_, i_19_, (-97).toByte(), (i_20_ + (Class348_Sub34.anInt6974) - (Class240.anInt4686)))
                                }
                            }
                        }
                        if (Class348_Sub40_Sub5.aBoolean9121) {
                            if (i_1_ >= 0) aa_Sub1.aSArray5191!![i_7_]!!.method3984(0, 0, 0, null, false, i_1_, i_2_)
                            else aa_Sub1.aSArray5191!![i_7_]!!.method3983(0, 0, 0, null, false, i_2_)
                            for (i_21_ in 0..<Npc.anInt10503) Class319.aClass315Array3982!![i_21_]!!.method2359(Class318_Sub2(i_7_ + 1), -1)
                        } else if (i_1_ >= 0) aa_Sub1.aSArray5191!![i_7_]!!.method3984(Class239_Sub25.anInt6111, Class285_Sub2.anInt8502, Class318_Sub1_Sub4_Sub1.anInt10084, Class348_Sub8.aBooleanArrayArray6656!!, true, i_1_, i_2_)
                        else aa_Sub1.aSArray5191!![i_7_]!!.method3983(Class239_Sub25.anInt6111, Class285_Sub2.anInt8502, Class318_Sub1_Sub4_Sub1.anInt10084, Class348_Sub8.aBooleanArrayArray6656!!, true, i_2_)
                    }
                }
            }
            if (Class348_Sub42_Sub3.anInt9504 > 0) {
                Class67.method718(Class291.aClass318_Sub1Array3737!!, 0, Class348_Sub42_Sub3.anInt9504 - 1)
                for (i_22_ in 0..<Class348_Sub42_Sub3.anInt9504) Class13.method227(Class291.aClass318_Sub1Array3737!![i_22_]!!, true, bool_3_)
            }
        }

        fun method3401(i: Int, i_25_: Int, i_26_: Byte): Int {
            var i_25_ = i_25_
            anInt9745++
            if (i_26_ <= 10) return -118
            if (i == -1) return 12345678
            i_25_ = (i and 0x7f) * i_25_ shr 7
            if (i_25_ < 2) i_25_ = 2
            else if (i_25_ > 126) i_25_ = 126
            return i_25_ + (i and 0xff80)
        }

        fun method3402(i: Byte) {
            if (Class297.aString3782!!.lowercase(Locale.getDefault()).indexOf("microsoft") == -1) {
                Class285_Sub2.anIntArray8507!![46] = 72
                Class285_Sub2.anIntArray8507!![92] = 74
                Class285_Sub2.anIntArray8507!![44] = 71
                Class285_Sub2.anIntArray8507!![61] = 27
                Class285_Sub2.anIntArray8507!![91] = 42
                if (Class297.aMethod3783 == null) {
                    Class285_Sub2.anIntArray8507!![192] = 58
                    Class285_Sub2.anIntArray8507!![222] = 59
                } else {
                    Class285_Sub2.anIntArray8507!![520] = 59
                    Class285_Sub2.anIntArray8507!![192] = 28
                    Class285_Sub2.anIntArray8507!![222] = 58
                }
                Class285_Sub2.anIntArray8507!![45] = 26
                Class285_Sub2.anIntArray8507!![47] = 73
                Class285_Sub2.anIntArray8507!![59] = 57
                Class285_Sub2.anIntArray8507!![93] = 43
            } else {
                Class285_Sub2.anIntArray8507!![222] = 59
                Class285_Sub2.anIntArray8507!![187] = 27
                Class285_Sub2.anIntArray8507!![186] = 57
                Class285_Sub2.anIntArray8507!![221] = 43
                Class285_Sub2.anIntArray8507!![219] = 42
                Class285_Sub2.anIntArray8507!![191] = 73
                Class285_Sub2.anIntArray8507!![190] = 72
                Class285_Sub2.anIntArray8507!![220] = 74
                Class285_Sub2.anIntArray8507!![188] = 71
                Class285_Sub2.anIntArray8507!![189] = 26
                Class285_Sub2.anIntArray8507!![192] = 58
                Class285_Sub2.anIntArray8507!![223] = 28
            }
            anInt9742++
            if (i > -20) aBoolean9746 = false
        }

        @JvmStatic
        fun method3403(i: Int) {
            if (i >= 58) {
                aClass138_9748 = null
                aClass351_9749 = null
                aClass351_9743 = null
            }
        }

        init {
            anInt9750 = 0
            aClass351_9749 = Class351(45, 7)
        }
    }
}
