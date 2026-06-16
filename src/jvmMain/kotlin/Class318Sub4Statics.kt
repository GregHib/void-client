/**
 * JVM-only statics extracted from [Class318_Sub4] companion that reference jvmMain-only types
 * (ha_Sub3, aa_Sub2, Class68, Class348_Sub40_Sub38) and therefore cannot live in commonMain.
 */
object Class318Sub4Statics {
    fun method2501(i: Int, var_ha_Sub3: ha_Sub3?, `is`: IntArray?, i_0_: Byte, is_1_: IntArray?, i_2_: Int): aa_Sub2 {
        try {
            if (i_0_ >= -32) Class318_Sub4.method2502(null, -18)
            Class318_Sub4.anInt6412++
            if (var_ha_Sub3!!.method3880(Class68.aClass68_1183, Class348_Sub40_Sub38.aClass304_9471, 125.toByte())) {
                val is_3_ = ByteArray(i * i_2_)
                var i_4_ = 0
                while (i > i_4_) {
                    var i_5_ = `is`!![i_4_] + i_2_ * i_4_
                    var i_6_ = 0
                    while (is_1_!![i_4_] > i_6_) {
                        is_3_[i_5_++] = (-1).toByte()
                        i_6_++
                    }
                    i_4_++
                }
                return aa_Sub2(var_ha_Sub3, i_2_, i, is_3_)
            }
            val is_7_ = IntArray(i * i_2_)
            var i_8_ = 0
            while (i > i_8_) {
                var i_9_ = `is`!![i_8_] + i_8_ * i_2_
                for (i_10_ in 0..<is_1_!![i_8_]) is_7_[i_9_++] = -16777216
                i_8_++
            }
            return aa_Sub2(var_ha_Sub3, i_2_, i, is_7_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("jda.A(" + i + ',' + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_0_ + ',' + (if (is_1_ != null) "{...}" else "null") + ',' + i_2_ + ')'))
        }
    }
}
