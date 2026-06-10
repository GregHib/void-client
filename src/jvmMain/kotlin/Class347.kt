import Class101_Sub1.Companion.method913
import Class16.method260
import Class2.Companion.method173
import Class318_Sub1_Sub5.Companion.method2485
import Class5_Sub2.Companion.method191
import Class66.method705

/* Class347 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class347 {
    var anInt4279: Int = 0
    var anInt4282: Int = 0
    var anInt4283: Int = 0

    companion object {
        @JvmField
        var aBoolean4278: Boolean = true
        var anInt4280: Int = 0
        var aByteArrayArray4281: Array<ByteArray?>? = null
        @JvmField
        var aBoolean4284: Boolean = false

        @JvmStatic
        fun method2707(bool: Boolean) {
            aByteArrayArray4281 = null
            if (bool != false) method2708(57)
        }

        @JvmStatic
        fun method2708(i: Int) {
            Class251.method1916(-9343, Class289.aClass46_3701!!)
            anInt4280++
            Class318_Sub1.anInt6392++
            if (!Class50_Sub1.aBoolean5221 || !Class127_Sub1.aBoolean8386) {
                if (Class318_Sub1.anInt6392 > 1) Class289.aClass46_3701 = null
            } else {
                var i_0_ = 0
                var i_1_ = 0
                if (Class59_Sub1.aBoolean5300) {
                    i_0_ = s_Sub3.method4008((-124).toByte())
                    i_1_ = method260(false)
                }
                var i_2_ = i_0_ + Class258_Sub4.aClass373_8552!!.method3597(true)
                var i_3_ = i_1_ + Class258_Sub4.aClass373_8552!!.method3594(80.toByte())
                i_3_ -= Class219.anInt2872
                i_2_ -= Class318_Sub4.anInt6411
                if (i_2_ < Class348_Sub40_Sub37.anInt9461) i_2_ = Class348_Sub40_Sub37.anInt9461
                if (i == -30206) {
                    if (i_2_ - -Class289.aClass46_3701!!.anInt709 > (Class348_Sub40_Sub37.anInt9461 - -Class331.aClass46_4130!!.anInt709)) i_2_ = (Class331.aClass46_4130!!.anInt709 + (Class348_Sub40_Sub37.anInt9461 + -Class289.aClass46_3701!!.anInt709))
                    if (i_3_ < Class40.anInt558) i_3_ = Class40.anInt558
                    if (Class289.aClass46_3701!!.anInt789 + i_3_ > (Class40.anInt558 - -Class331.aClass46_4130!!.anInt789)) i_3_ = (-Class289.aClass46_3701!!.anInt789 + (Class40.anInt558 - -Class331.aClass46_4130!!.anInt789))
                    val i_4_ = (-Class348_Sub40_Sub37.anInt9461 + (i_2_ - -Class331.aClass46_4130!!.anInt747))
                    val i_5_ = (-Class40.anInt558 + (i_3_ + Class331.aClass46_4130!!.anInt755))
                    if (Class258_Sub4.aClass373_8552!!.method3593(94)) {
                        if (Class289.aClass46_3701!!.anInt703 < Class318_Sub1.anInt6392) {
                            val i_6_ = i_2_ + -ha_Sub3.anInt8001
                            val i_7_ = -Class348_Sub40_Sub13.anInt9203 + i_3_
                            if (Class289.aClass46_3701!!.anInt729 < i_6_ || (-Class289.aClass46_3701!!.anInt729 > i_6_) || (i_7_ > Class289.aClass46_3701!!.anInt729) || i_7_ < -Class289.aClass46_3701!!.anInt729) Class300.aBoolean3819 = true
                        }
                        if ((Class289.aClass46_3701!!.anObjectArray823 != null) && Class300.aBoolean3819) {
                            val class348_sub36 = Class348_Sub36()
                            class348_sub36.aClass46_6989 = Class289.aClass46_3701
                            class348_sub36.anInt6984 = i_4_
                            class348_sub36.anObjectArray6987 = (Class289.aClass46_3701!!.anObjectArray823)
                            class348_sub36.anInt6995 = i_5_
                            method705(class348_sub36)
                        }
                    } else {
                        if (Class300.aBoolean3819) {
                            Class341.Companion.method2678(-2049)
                            if (Class289.aClass46_3701!!.anObjectArray692 != null) {
                                val class348_sub36 = Class348_Sub36()
                                class348_sub36.aClass46_6983 = Class318_Sub1_Sub3_Sub4.aClass46_10336
                                class348_sub36.anInt6984 = i_4_
                                class348_sub36.anObjectArray6987 = (Class289.aClass46_3701!!.anObjectArray692)
                                class348_sub36.anInt6995 = i_5_
                                class348_sub36.aClass46_6989 = Class289.aClass46_3701
                                method705(class348_sub36)
                            }
                            if (Class318_Sub1_Sub3_Sub4.aClass46_10336 != null && (Client.method108(Class289.aClass46_3701) != null)) method173(-67, Class289.aClass46_3701, (Class318_Sub1_Sub3_Sub4.aClass46_10336))
                        } else if ((Class318_Sub1_Sub5.anInt8770 == 1 || method2485(-113)) && Class73.anInt4776 > 2) method191(true, (ha_Sub3.anInt8001 + Class318_Sub4.anInt6411), (Class219.anInt2872 - -(Class348_Sub40_Sub13.anInt9203)))
                        else if (method913(127.toByte())) method191(true, (ha_Sub3.anInt8001 + Class318_Sub4.anInt6411), (Class219.anInt2872 + (Class348_Sub40_Sub13.anInt9203)))
                        Class289.aClass46_3701 = null
                    }
                }
            }
        }
    }
}
