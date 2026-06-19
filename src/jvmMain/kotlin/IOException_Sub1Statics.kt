import java.io.IOException

object IOException_Sub1Statics {
    @JvmField
            var aBoolean86: Boolean = false
            @JvmField
            var anInt87: Int = 0
            @JvmField
            var anInt88: Int = 0
            @JvmField
            var anInt89: Int = 0
            @JvmField
            var aIntRange_90: IntRange? = IntRange(42, -1)
            @JvmField
            var anIntArray91: IntArray? = IntArray(8)
    
            @JvmStatic
            fun method129(i: Int, i_0_: Int, ls: LongArray?, i_1_: Int, `is`: IntArray?) {
                do {
                    try {
                        anInt89++
                        if (i_1_ > i) {
                            val i_2_ = (i_1_ + i) / 2
                            var i_3_ = i
                            val l = ls!![i_2_]
                            ls[i_2_] = ls[i_1_]
                            ls[i_1_] = l
                            val i_4_ = `is`!![i_2_]
                            `is`[i_2_] = `is`[i_1_]
                            `is`[i_1_] = i_4_
                            val i_5_ = if (l == 9223372036854775807L) 0 else 1
                            var i_6_ = i
                            while (i_1_ > i_6_) {
                                if (l - -(i_5_ and i_6_).toLong() > ls[i_6_]) {
                                    val l_7_ = ls[i_6_]
                                    ls[i_6_] = ls[i_3_]
                                    ls[i_3_] = l_7_
                                    val i_8_ = `is`[i_6_]
                                    `is`[i_6_] = `is`[i_3_]
                                    `is`[i_3_++] = i_8_
                                }
                                i_6_++
                            }
                            ls[i_1_] = ls[i_3_]
                            ls[i_3_] = l
                            `is`[i_1_] = `is`[i_3_]
                            `is`[i_3_] = i_4_
                            method129(i, -126, ls, -1 + i_3_, `is`)
                            method129(1 + i_3_, -81, ls, i_1_, `is`)
                        }
                        if (i_0_ < -72) break
                        method130(99)
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("gv.A(" + i + ',' + i_0_ + ',' + (if (ls != null) "{...}" else "null") + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method130(i: Int) {
                if (i == 8) {
                    anIntArray91 = null
                    aIntRange_90 = null
                }
            }
    
            @JvmStatic
            fun method131(bool: Boolean, i: Int, bool_9_: Boolean, i_10_: Int) {
                anInt87++
                require(!(i_10_ < 8000 || i_10_ > 48000))
                CameraConfigDefinitionStatics.anInt3248 = i
                HslColorConfigStatics.anInt339 = i_10_
                NpcEntityUpdater.aBoolean3652 = bool
                if (bool_9_ != true) method130(-125)
            }
}
