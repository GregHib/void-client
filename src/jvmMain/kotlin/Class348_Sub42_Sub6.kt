import Applet_Sub1.Companion.method94
import Class59_Sub1.Companion.method555
import Class62.method599

/* Class348_Sub42_Sub6 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub6 internal constructor(var aClass318_Sub1_Sub3_Sub4_9538: Class318_Sub1_Sub3_Sub4?) : Class348_Sub42() {
    companion object {
        var aBoolean9535: Boolean = false
        var aClass144_9536: Class144? = null
        var anInt9537: Int = 0
        var anInt9539: Int = 0

        fun method3188(i: Byte, class348_sub49: Class348_Sub49) {
            anInt9539++
            for (i_0_ in 0..<Class225.anInt2956) {
                val i_1_ = class348_sub49.readSmart(-127)
                var i_2_ = class348_sub49.readUnsignedShort(842397944)
                if (i_2_ == 65535) i_2_ = -1
                if (OutputStream_Sub1.aClass110_Sub1Array97!![i_1_] != null) OutputStream_Sub1.aClass110_Sub1Array97!![i_1_]!!.anInt1704 = i_2_
            }
            val i_3_ = -75 / ((53 - i) / 48)
        }

        fun method3189(i: Int, strings: Array<String?>) {
            if (i == 0) {
                anInt9537++
                if (strings.size > 1) {
                    for (i_4_ in strings.indices) {
                        if (strings[i_4_]!!.startsWith("pause")) {
                            var i_5_ = 5
                            try {
                                i_5_ = strings[i_4_]!!.substring(6).toInt()
                            } catch (exception: Exception) {
                                /* empty */
                            }
                            method94(("Pausing for " + i_5_ + " seconds..."), -109)
                            Class50_Sub1.aStringArray5223 = strings
                            Class121.anInt1794 = i_4_ - -1
                            Class299_Sub1_Sub1.aLong8694 = (i_5_ * 1000).toLong() + method599(-104)
                            break
                        }
                        Class363.aString4461 = strings[i_4_]
                        method555(false, 0)
                    }
                } else {
                    Class363.aString4461 += strings[0]
                    Class348_Sub38.anInt7006 += strings[0]!!.length
                }
            }
        }

        @JvmStatic
        fun method3190(bool: Boolean) {
            if (bool != false) aBoolean9535 = true
            aClass144_9536 = null
        }
    }
}
