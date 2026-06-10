import Class139.Companion.method1166
import Class192.Companion.method1436
import Class273.Companion.method2057
import Class348_Sub17.Companion.method2929
import jaggl.OpenGL.Companion.glTexImage2Di
import kotlin.math.min

class Class353 internal constructor(var anInt4342: Int, var anInt4349: Int, var anInt4344: Int, var anInt4339: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int, bool: Boolean, var aBoolean4350: Boolean, var anInt4347: Int) {
    var aShort4340: Short
    var aShort4341: Short
    var aByte4343: Byte
    var aShort4348: Short

    init {
        this.aShort4340 = i_38_.toShort()
        this.aByte4343 = i_41_.toByte()
        this.aShort4341 = i_37_.toShort()
        this.aShort4348 = i_39_.toShort()
    }

    companion object {
        var aFloat4338: Float = 0f
        var anInt4345: Int = 0
        var aClass60_4346: Class60? = Class60(4)
        var anInt4351: Int = 0

        fun method3460(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, `is`: IntArray, i_4_: Int, i_5_: Int) {
            var i_1_ = i_1_
            var i_3_ = i_3_
            anInt4345++
            require(!(i_3_ > 0 && !method1436(-86, i_3_))) { "" }
            require(!(i_1_ > 0 && !method1436(88, i_1_))) { "" }
            require(i_4_ == 32993) { "" }
            var i_6_ = 0
            var i_7_ = min(i_1_, i_3_)
            if (i_5_ >= -54) method3462(106)
            var i_8_ = i_3_ shr 1
            var i_9_ = i_1_ shr 1
            var is_10_ = `is`
            var is_11_ = IntArray(i_9_ * i_8_)
            while (true) {
                glTexImage2Di(i, i_6_, i_0_, i_3_, i_1_, 0, i_4_, i_2_, is_10_, 0)
                if (i_7_ <= 1) break
                var i_12_ = 0
                var i_13_ = 0
                var i_14_ = i_3_ + i_13_
                val is_15_ = is_11_
                for (i_16_ in 0..<i_9_) {
                    for (i_17_ in 0..<i_8_) {
                        val i_18_ = is_10_[i_13_++]
                        val i_19_ = is_10_[i_13_++]
                        val i_20_ = is_10_[i_14_++]
                        var i_21_ = i_18_ and 0xff
                        var i_22_ = (0xff2fb7 and i_18_) shr 16
                        var i_23_ = 0xff and (i_18_ shr 24)
                        var i_24_ = (i_18_ and 0xff43) shr 8
                        val i_25_ = is_10_[i_14_++]
                        i_23_ += 0xff and (i_19_ shr 24)
                        i_22_ += (i_19_ and 0xff6a76) shr 16
                        i_21_ += 0xff and i_19_
                        i_24_ += (i_19_ and 0xff5a) shr 8
                        i_23_ += 0xff and (i_20_ shr 24)
                        i_22_ += (i_20_ and 0xff2819) shr 16
                        i_24_ += (i_20_ and 0xff76) shr 8
                        i_21_ += i_20_ and 0xff
                        i_21_ += 0xff and i_25_
                        i_24_ += i_25_ shr 8 and 0xff
                        i_23_ += 0xff and (i_25_ shr 24)
                        i_22_ += (0xff943a and i_25_) shr 16
                        is_11_[i_12_++] = (method2057((method2057(method1166(i_24_ shl 6, 65280), method2057((method1166(1020, i_22_) shl 14), (method1166(i_23_, 1020) shl 22)))), method1166(i_21_, 1020) shr 2))
                    }
                    i_13_ += i_3_
                    i_14_ += i_3_
                }
                is_11_ = is_10_
                i_1_ = i_9_
                i_3_ = i_8_
                is_10_ = is_15_
                i_6_++
                i_8_ = i_8_ shr 1
                i_7_ = i_7_ shr 1
                i_9_ = i_9_ shr 1
            }
        }

        fun method3461(i: Int, objects: Array<Any?>?, i_26_: Int, ls: LongArray?, i_27_: Int) {
            do {
                try {
                    anInt4351++
                    if (i_26_ > i) {
                        val i_28_ = (i + i_26_) / 2
                        var i_29_ = i
                        val l = ls!![i_28_]
                        ls[i_28_] = ls[i_26_]
                        ls[i_26_] = l
                        val `object` = objects!![i_28_]
                        objects[i_28_] = objects[i_26_]
                        objects[i_26_] = `object`
                        val i_30_ = (if (l != 9223372036854775807L) 1 else 0)
                        var i_31_ = i
                        while (i_26_ > i_31_) {
                            if ((i_31_ and i_30_).toLong() + l > ls[i_31_]) {
                                val l_32_ = ls[i_31_]
                                ls[i_31_] = ls[i_29_]
                                ls[i_29_] = l_32_
                                val object_33_ = objects[i_31_]
                                objects[i_31_] = objects[i_29_]
                                objects[i_29_++] = object_33_
                            }
                            i_31_++
                        }
                        ls[i_26_] = ls[i_29_]
                        ls[i_29_] = l
                        objects[i_26_] = objects[i_29_]
                        objects[i_29_] = `object`
                        method3461(i, objects, i_29_ + -1, ls, 9455)
                        method3461(i_29_ + 1, objects, i_26_, ls, 9455)
                    }
                    if (i_27_ == 9455) break
                    aClass60_4346 = null
                } catch (runtimeexception: RuntimeException) {
                    throw method2929(runtimeexception, ("en.B(" + i + ',' + (if (objects != null) "{...}" else "null") + ',' + i_26_ + ',' + (if (ls != null) "{...}" else "null") + ',' + i_27_ + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method3462(i: Int) {
            aClass60_4346 = null
            if (i != -30094) method3461(-108, null, -26, null, 42)
        }
    }
}
