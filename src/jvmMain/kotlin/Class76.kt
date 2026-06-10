import Class59_Sub1_Sub1.Companion.method560

/* Class76 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class76 internal constructor(bool: Boolean) {
    @JvmField
    var aClass243_1282: Class243 = Class243()
    var aBoolean1283: Boolean = false
    fun method774(class318_sub4: Class318_Sub4, i: Int) {
        anInt1280++
        val class318_sub1 = class318_sub4.aClass318_Sub1_6410
        var bool = true
        val class318_sub3s = class318_sub4.aClass318_Sub3Array6414
        var i_6_ = 0
        while (class318_sub3s!!.size > i_6_) {
            if (class318_sub3s[i_6_]!!.aBoolean6401) {
                bool = false
                break
            }
            i_6_++
        }
        if (!bool) {
            if (this.aBoolean1283) {
                var class318_sub4_7_ = (this.aClass243_1282.method1872(8) as? Class318_Sub4?)
                while (class318_sub4_7_ != null) {
                    if (class318_sub1 === (class318_sub4_7_.aClass318_Sub1_6410)) {
                        class318_sub4_7_.method2373(false)
                        method560(class318_sub4_7_, -41)
                    }
                    class318_sub4_7_ = this.aClass243_1282.method1878((-103).toByte()) as? Class318_Sub4?
                }
            }
            var class318_sub4_8_ = (this.aClass243_1282.method1872(8) as? Class318_Sub4?)
            while (class318_sub4_8_ != null) {
                if (class318_sub1!!.anInt6389 >= class318_sub4_8_.aClass318_Sub1_6410!!.anInt6389) {
                    Class245.method1883(class318_sub4_8_, class318_sub4, true)
                    return
                }
                class318_sub4_8_ = this.aClass243_1282.method1878((-44).toByte()) as? Class318_Sub4?
            }
            if (i != 18802) aClass169_1286 = null
            this.aClass243_1282.method1869(-107, class318_sub4)
        }
    }

    fun method775(i: Byte) {
        while (true) {
            val class318_sub4 = (this.aClass243_1282.method1875(60) as? Class318_Sub4?)
            if (class318_sub4 == null) break
            class318_sub4.method2373(false)
            method560(class318_sub4, 123)
        }
        anInt1278++
        if (i.toInt() != 69) anInt1288 = -20
    }

    init {
        this.aBoolean1283 = bool
    }

    companion object {
        @JvmField
        var anInt1278: Int = 0
        @JvmField
        var aClass364_1279: Class364? = Class364("LOCAL", 4)
        @JvmField
        var anInt1280: Int = 0
        @JvmField
        var anInt1281: Int = 0
        @JvmField
        var anInt1284: Int = 0
        @JvmField
        var anInt1285: Int = 0
        @JvmField
        var aClass169_1286: Class169?
        @JvmField
        var aFloat1287: Float = 1024.0f
        var anInt1288: Int = 0

        fun method771(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, `is`: IntArray?, i_5_: Int): Boolean {
            var i_1_ = i_1_
            var i_2_ = i_2_
            var i_3_ = i_3_
            var i_4_ = i_4_
            var i_5_ = i_5_
            anInt1281++
            if (i_3_ > Class306.anInt3872) i_3_ = Class306.anInt3872
            if (i_4_ < 0) i_4_ = 0
            if (i_0_.toInt() != -25) anInt1288 = -32
            if (i_4_ >= i_3_) return true
            i_5_ += -1 + i_4_
            i_1_ += i * i_4_
            i_2_ = -i_4_ + i_3_ shr 2
            if (Class350.anInt4319 == 1) {
                Class225.anInt2946 += i_2_
                while (--i_2_ >= 0) {
                    if (`is`!![++i_5_] > i_1_) `is`[i_5_] = i_1_
                    i_1_ += i
                    if (`is`[++i_5_] > i_1_) `is`[i_5_] = i_1_
                    i_1_ += i
                    if (i_1_ < `is`[++i_5_]) `is`[i_5_] = i_1_
                    i_1_ += i
                    if (`is`[++i_5_] > i_1_) `is`[i_5_] = i_1_
                    i_1_ += i
                }
                i_2_ = 0x3 and i_3_ - i_4_
                while (--i_2_ >= 0) {
                    if (`is`!![++i_5_] > i_1_) `is`[i_5_] = i_1_
                    i_1_ += i
                }
            } else {
                i_1_ -= 38400
                while (--i_2_ >= 0) {
                    if (`is`!![++i_5_] > i_1_) return false
                    i_1_ += i
                    if (`is`[++i_5_] > i_1_) return false
                    i_1_ += i
                    if (i_1_ < `is`[++i_5_]) return false
                    i_1_ += i
                    if (`is`[++i_5_] > i_1_) return false
                    i_1_ += i
                }
                i_2_ = 0x3 and i_3_ - i_4_
                while (--i_2_ >= 0) {
                    if (i_1_ < `is`!![++i_5_]) return false
                    i_1_ += i
                }
            }
            return true
        }

        @JvmStatic
        fun method772(i: Byte) {
            aClass169_1286 = null
            aClass364_1279 = null
        }

        @JvmStatic
        fun method773(bool: Boolean) {
            Class348_Sub40_Sub10.aBoolean9181 = bool
            anInt1284++
        }

        init {
            aClass169_1286 = Class169()
        }
    }
}
