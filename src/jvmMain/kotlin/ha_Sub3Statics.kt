import r_Sub2.Companion.method3297
import Class348_Sub40_Sub32.Companion.method3135
import Class348_Sub16_Sub3.Companion.method2878

/**
 * JVM-side accessor shim for [ha_Sub3] companion members.
 * Companions in jvmMain reference this instead of [ha_Sub3] directly
 * so that the logic can be reasoned about without jaclib/jaggl deps.
 */
object ha_Sub3Statics {
    /*synthetic*/
    private var aClass8211: Class<*>? = null

    fun method3824(i: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int) {
        var i_36_ = i_36_
        ha_Sub3.anInt7933++
        if (i_37_ >= 0 && i >= 0 && -1 + Class367Sub4Statics.anInt7319 > i_37_ && (i < -1 + Class348_Sub40_Sub3.anInt9109)) {
            if (Class147.aClass357ArrayArrayArray2029 == null) return
            if (i_41_ == 0) {
                val interface10 = method3297(i_40_, i_37_, i) as Interface10?
                val interface10_42_ = Class82.method813(i_40_, i_37_, i) as Interface10?
                if (interface10 != null && i_36_ != 2) {
                    if (interface10 is Class318_Sub1_Sub4_Sub2) interface10.aClass235_10115!!.method1671(262144, i_35_)
                    else Class218.method1591(i_37_, 89, i_41_, i_35_, interface10.method42(-76), i_36_, i, i_38_, i_40_)
                }
                if (interface10_42_ != null) {
                    if (interface10_42_ is Class318_Sub1_Sub4_Sub2) interface10_42_.aClass235_10115!!.method1671(262144, i_35_)
                    else Class218.method1591(i_37_, 92, i_41_, i_35_, interface10_42_.method42(-71), i_36_, i, i_38_, i_40_)
                }
            } else if (i_41_ == 1) {
                val interface10 = (method3135(i_40_, i_37_, i) as Interface10?)
                if (interface10 != null) {
                    if (interface10 is Class318_Sub1_Sub5_Sub2) interface10.aClass235_10155!!.method1671(262144, i_35_)
                    else {
                        val i_43_ = interface10.method42(-83)
                        if (i_36_ != 4 && i_36_ != 5) {
                            if (i_36_ != 6) {
                                if (i_36_ == 7) Class218.method1591(i_37_, 50, i_41_, i_35_, i_43_, 4, i, 4 + (0x3 and 2 + i_38_), i_40_)
                                else if (i_36_ == 8) {
                                    Class218.method1591(i_37_, 116, i_41_, i_35_, i_43_, 4, i, 4 + i_38_, i_40_)
                                    Class218.method1591(i_37_, 91, i_41_, i_35_, i_43_, 4, i, 4 + (0x3 and i_38_ - -2), i_40_)
                                }
                            } else Class218.method1591(i_37_, 22, i_41_, i_35_, i_43_, 4, i, i_38_ + 4, i_40_)
                        } else Class218.method1591(i_37_, 86, i_41_, i_35_, i_43_, 4, i, i_38_, i_40_)
                    }
                }
            } else if (i_41_ == 2) {
                val interface10 = ((Class177.method1353(i_40_, i_37_, i, (if (aClass8211 != null) aClass8211 else (Interface10::class.java.also { aClass8211 = it })))) as Interface10?)
                if (interface10 != null) {
                    if (i_36_ == 11) i_36_ = 10
                    if (interface10 !is Class318_Sub1_Sub3_Sub2) Class218.method1591(i_37_, 43, i_41_, i_35_, interface10.method42(-107), i_36_, i, i_38_, i_40_)
                    else interface10.aClass235_10045!!.method1671(262144, i_35_)
                }
            } else if (i_41_ == 3) {
                val interface10 = (method2878(i_40_, i_37_, i) as Interface10?)
                if (interface10 != null) {
                    if (interface10 is Class318_Sub1_Sub1_Sub1) interface10.aClass235_9955!!.method1671(262144, i_35_)
                    else Class218.method1591(i_37_, 28, i_41_, i_35_, interface10.method42(-123), i_36_, i, i_38_, i_40_)
                }
            }
        }
        if (i_39_ < 98) ha_Sub3.method3936(-100)
    }

    var aStringArray8019: Array<String?>? = arrayOfNulls<String>(5)
    var anInt8001: Int = -1
    var anInt8045: Int = 0

    fun method3873(`is`: ByteArray?, i: Int): ByteArray {
        try {
            ha_Sub3.anInt8015++
            val i_127_ = `is`!!.size
            val is_128_ = ByteArray(i_127_)
            Class214.method1577(`is`, i, is_128_, 0, i_127_)
            return is_128_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wga.GI(" + (if (`is` != null) "{...}" else "null") + ',' + i + ')'))
        }
    }
}
