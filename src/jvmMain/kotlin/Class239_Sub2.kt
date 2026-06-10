/* Class239_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class Class239_Sub2 : Class239 {
    override fun method1714(i: Int, i_0_: Int): Int {
        anInt5851++
        if (i != 3) return -26
        return 3
    }

    override fun method1716(bool: Boolean) {
        anInt5854++
        this.anInt3138 = method1710(20014)
        if (bool != false) aClass105Array5857 = null
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) method1716(true)
        anInt5853++
        if (!this.aClass348_Sub51_3136.method3425(-76)) return 0
        return 1
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1712(i: Int, i_13_: Int) {
        val i_14_ = 87 / ((82 - i) / 35)
        this.anInt3138 = i_13_
        anInt5852++
    }

    fun method1726(i: Int): Int {
        anInt5856++
        if (i != -32350) aClass105Array5857 = null
        return this.anInt3138
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    companion object {
        @JvmField
        var anInt5851: Int = 0
        @JvmField
        var anInt5852: Int = 0
        @JvmField
        var anInt5853: Int = 0
        @JvmField
        var anInt5854: Int = 0
        @JvmField
        var anInt5855: Int = 0
        @JvmField
        var anInt5856: Int = 0
        @JvmField
        var aClass105Array5857: Array<Class105?>? = null

        @JvmStatic
        fun method1724(i: Int) {
            aClass105Array5857 = null
            if (i != -4) aClass105Array5857 = null
        }

        @JvmStatic
        fun method1725(i: Int) {
            anInt5855++
            var i_1_ = 1024
            var i_2_ = 3072
            if (Class305.aBoolean3870) {
                i_2_ = 4096
                if (Class348_Sub49_Sub1.aBoolean9746) i_1_ = 2048
            }
            if (Class76.aFloat1287 < i_1_.toFloat()) Class76.aFloat1287 = i_1_.toFloat()
            if (Class76.aFloat1287 > i_2_.toFloat()) Class76.aFloat1287 = i_2_.toFloat()
            while ( /**/Class314.aFloat3938 >= 16384.0f) {
                Class314.aFloat3938 -= 16384.0f
            }
            while ( /**/Class314.aFloat3938 < 0.0f) {
                Class314.aFloat3938 += 16384.0f
            }
            val i_3_ = Class130_Sub1.anInt5799 shr 9
            val i_4_ = Class192.anInt2578 shr 9
            val i_5_ = Class275.method2064(Class130_Sub1.anInt5799, Class355.anInt4372, 11219, Class192.anInt2578)
            var i_6_ = 0
            if (i_3_ > 3 && i_4_ > 3 && -4 + Class367_Sub4.anInt7319 > i_3_ && Class348_Sub40_Sub3.anInt9109 - 4 > i_4_) {
                var i_7_ = i_3_ - 4
                while (i_3_ - -4 >= i_7_) {
                    for (i_8_ in -4 + i_4_..4 + i_4_) {
                        var i_9_ = Class355.anInt4372
                        if (i_9_ < 3 && Class79.method802(i_8_, i_7_, true)) i_9_++
                        var i_10_ = 0
                        if ((Class338.aClass237_Sub1_4197!!.aByteArrayArrayArray3104) != null && (Class338.aClass237_Sub1_4197!!.aByteArrayArrayArray3104!![i_9_]) != null) i_10_ = 8 * ((Class338.aClass237_Sub1_4197!!.aByteArrayArrayArray3104!![i_9_]!![i_7_]!![i_8_]).toInt() and 0xff) shl 2
                        if (aa_Sub1.aSArray5191 != null && aa_Sub1.aSArray5191!![i_9_] != null) {
                            val i_11_ = (i_5_ + i_10_ + -aa_Sub1.aSArray5191!![i_9_]!!.method3982((-86).toByte(), i_8_, i_7_))
                            if (i_6_ < i_11_) i_6_ = i_11_
                        }
                    }
                    i_7_++
                }
            }
            var i_12_ = 1536 * (i_6_ shr 2)
            if (i_12_ > 786432) i_12_ = 786432
            if (i_12_ < i) i_12_ = 262144
            if (Class348_Sub35.anInt6979 < i_12_) Class348_Sub35.anInt6979 += (i_12_ - Class348_Sub35.anInt6979) / 24
            else if (Class348_Sub35.anInt6979 > i_12_) Class348_Sub35.anInt6979 += (-Class348_Sub35.anInt6979 + i_12_) / 80
        }
    }
}
