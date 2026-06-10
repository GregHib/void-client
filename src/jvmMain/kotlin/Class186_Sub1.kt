import jaggl.OpenGL.Companion.glTexImage2Dub
import java.util.*
import kotlin.math.min

class Class186_Sub1 internal constructor(i: Int) : Class186() {
    private val anIntArray5804 = IntArray(512)
    override fun method1398(i: Int, i_0_: Int, f: Float, f_1_: Float, i_2_: Int, f_3_: Float, i_4_: Int, f_5_: Float, i_6_: Int, i_7_: Int, fs: FloatArray) {
        var i_2_ = i_2_
        anInt5810++
        var i_8_ = (-1.0f + f * i_6_.toFloat()).toInt()
        i_8_ = i_8_ and 0xff
        var i_9_ = (-1.0f + i_0_.toFloat() * f_5_).toInt()
        i_9_ = i_9_ and 0xff
        var i_10_ = (-1.0f + i.toFloat() * f_1_).toInt()
        i_10_ = i_10_ and 0xff
        val f_11_ = i_7_.toFloat() * f_1_
        var i_12_ = f_11_.toInt()
        var i_13_ = i_12_ + 1
        val f_14_ = f_11_ - i_12_.toFloat()
        val f_15_ = i_4_.toFloat() - f_14_
        val f_16_ = Class342.method2684(6, f_14_)
        i_13_ = i_13_ and i_10_
        i_12_ = i_12_ and i_10_
        val i_17_ = anIntArray5804[i_12_]
        val i_18_ = anIntArray5804[i_13_]
        var i_19_ = 0
        while (i_0_ > i_19_) {
            val f_20_ = f_5_ * i_19_.toFloat()
            var i_21_ = f_20_.toInt()
            var i_22_ = i_21_ + 1
            val f_23_ = -i_21_.toFloat() + f_20_
            val f_24_ = -f_23_ + 1.0f
            val f_25_ = Class342.method2684(i_4_ xor 0x7, f_23_)
            i_21_ = i_21_ and i_9_
            i_22_ = i_22_ and i_9_
            val i_26_ = anIntArray5804[i_17_ + i_21_]
            val i_27_ = anIntArray5804[i_17_ + i_22_]
            val i_28_ = anIntArray5804[i_21_ + i_18_]
            val i_29_ = anIntArray5804[i_22_ - -i_18_]
            for (i_30_ in 0..<i_6_) {
                val f_31_ = f * i_30_.toFloat()
                var i_32_ = f_31_.toInt()
                var i_33_ = 1 + i_32_
                val f_34_ = f_31_ - i_32_.toFloat()
                val f_35_ = 1.0f - f_34_
                i_32_ = i_32_ and i_8_
                i_33_ = i_33_ and i_8_
                val f_36_ = Class342.method2684(i_4_ xor 0x7, f_34_)
                fs[i_2_++] = f_3_ * (Class314.method2337(
                    (Class314.method2337(
                        (Class314.method2337((Class285.method2119(f_24_, Class139.method1166((anIntArray5804[i_26_ + i_32_]), 7), f_15_, -70, f_35_)), true, (Class285.method2119(f_24_, Class139.method1166(7, (anIntArray5804[i_33_ - -i_26_])), f_15_, -73, f_34_)), f_36_)),
                        true,
                        (Class314.method2337((Class285.method2119(f_23_, Class139.method1166(7, (anIntArray5804[i_32_ + i_27_])), f_15_, -75, f_35_)), true, (Class285.method2119(f_23_, Class139.method1166((anIntArray5804[i_27_ + i_33_]), 7), f_15_, -91, f_34_)), f_36_)),
                        f_25_
                    )),
                    true,
                    (Class314.method2337(
                        (Class314.method2337((Class285.method2119(f_24_, Class139.method1166((anIntArray5804[i_28_ + i_32_]), 7), f_14_, -72, f_35_)), true, (Class285.method2119(f_24_, Class139.method1166((anIntArray5804[i_28_ + i_33_]), 7), f_14_, -75, f_34_)), f_36_)),
                        true,
                        (Class314.method2337((Class285.method2119(f_23_, Class139.method1166((anIntArray5804[i_29_ + i_32_]), 7), f_14_, -100, f_35_)), true, (Class285.method2119(f_23_, Class139.method1166((anIntArray5804[i_29_ + i_33_]), 7), f_14_, -72, f_34_)), f_36_)),
                        f_25_
                    )),
                    f_16_
                ))
            }
            i_19_++
        }
    }

    init {
        val random = Random(i.toLong())
        for (i_41_ in 0..255) {
            anIntArray5804[256 + i_41_] = i_41_
            anIntArray5804[i_41_] = anIntArray5804[256 + i_41_]
        }
        for (i_42_ in 0..255) {
            val i_43_ = 0xff and random.nextInt()
            val i_44_ = anIntArray5804[i_43_]
            anIntArray5804[256 + i_43_] = anIntArray5804[i_42_]
            anIntArray5804[i_43_] = anIntArray5804[256 + i_43_]
            anIntArray5804[256 + i_42_] = i_44_
            anIntArray5804[i_42_] = anIntArray5804[256 + i_42_]
        }
    }

    companion object {
        @JvmField
        var anInt5805: Int = 0
        @JvmField
        var anInt5806: Int = 0
        @JvmField
        var anInt5807: Int = 0
        @JvmField
        var aClass341_5808: Class341? = Class341()
        @JvmField
        var anInt5809: Int = 0
        @JvmField
        var anInt5810: Int = 0
        @JvmField
        var anInt5811: Int = 0
        @JvmField
        var anInt5812: Int = 100
        @JvmField
        var aClass111_5813: Class111? = null
        @JvmField
        var anInt5814: Int = 0

        @JvmStatic
        fun method1399(i: Int, c: Char): Int {
            anInt5805++
            if (i != 7) method1400(-22)
            if (c.code >= 0 && Class239_Sub6.anIntArray5902!!.size > c.code) return Class239_Sub6.anIntArray5902!![c.code]
            return -1
        }

        @JvmStatic
        fun method1400(i: Int) {
            aClass341_5808 = null
            aClass111_5813 = null
        }

        @JvmStatic
        fun method1401(var_ha_Sub2: ha_Sub2, i: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int): Class258_Sub3_Sub1 {
            anInt5809++
            if (i_37_ != 34037) aClass341_5808 = null
            if (var_ha_Sub2.aBoolean7793 || Class192.method1436(-20, i_38_) && Class192.method1436(-119, i_40_)) return Class258_Sub3_Sub1(var_ha_Sub2, 3553, i, i_39_, i_38_, i_40_, true)
            if (!var_ha_Sub2.aBoolean7837) return Class258_Sub3_Sub1(var_ha_Sub2, i, i_39_, i_38_, i_40_, Class33.method340(i_38_, 108.toByte()), Class33.method340(i_40_, 108.toByte()), true)
            return Class258_Sub3_Sub1(var_ha_Sub2, 34037, i, i_39_, i_38_, i_40_, true)
        }

        @JvmStatic
        fun method1402(i: Int) {
            if (i == 1) {
                Class318_Sub1_Sub2.aClass60_8732!!.method590(0)
                anInt5811++
            }
        }

        @JvmStatic
        fun method1403(i: Int, i_45_: Int, `is`: ByteArray, bool: Boolean, i_46_: Int, i_47_: Int, i_48_: Int) {
            var i = i
            var i_45_ = i_45_
            anInt5806++
            require(!(i_45_ > 0 && !Class192.method1436(69, i_45_))) { "" }
            require(!(i > 0 && !Class192.method1436(100, i))) { "" }
            val i_49_ = Class183.method1382(i_46_, -6409)
            var i_50_ = 0
            var i_51_ = min(i_45_, i)
            if (bool != false) anInt5807 = -127
            var i_52_ = i_45_ shr 1
            var i_53_ = i shr 1
            var is_54_ = `is`
            var is_55_ = ByteArray(i_52_ * (i_53_ * i_49_))
            while (true) {
                glTexImage2Dub(i_47_, i_50_, i_48_, i_45_, i, 0, i_46_, 5121, is_54_, 0)
                if (i_51_ <= 1) break
                val i_56_ = i_45_ * i_49_
                val is_57_ = is_55_
                var i_58_ = 0
                while (i_49_ > i_58_) {
                    var i_59_ = i_58_
                    var i_60_ = i_58_
                    var i_61_ = i_56_ + i_60_
                    for (i_62_ in 0..<i_53_) {
                        for (i_63_ in 0..<i_52_) {
                            var i_64_ = is_54_[i_60_].toInt()
                            i_60_ += i_49_
                            i_64_ += is_54_[i_60_].toInt()
                            i_64_ += is_54_[i_61_].toInt()
                            i_60_ += i_49_
                            i_61_ += i_49_
                            i_64_ += is_54_[i_61_].toInt()
                            is_55_[i_59_] = (i_64_ shr 2).toByte()
                            i_61_ += i_49_
                            i_59_ += i_49_
                        }
                        i_61_ += i_56_
                        i_60_ += i_56_
                    }
                    i_58_++
                }
                is_55_ = is_54_
                is_54_ = is_57_
                i = i_53_
                i_45_ = i_52_
                i_53_ = i_53_ shr 1
                i_50_++
                i_51_ = i_51_ shr 1
                i_52_ = i_52_ shr 1
            }
        }
    }
}
