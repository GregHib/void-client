import Class251.Companion.method1915
import Class348_Sub17.Companion.method2929

/* Class354 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class354 internal constructor(var_ha_Sub2: ha_Sub2?, var_d: d?) {
    private val aHa_Sub2_4355: ha_Sub2?
    private val aD4359: d?
    private var aClass60_4361: Class60? = Class60(256)

    fun method3463(i: Byte) {
        anInt4360++
        aClass60_4361!!.method590(0)
        if (i.toInt() != -110) aClass60_4361 = null
    }

    fun method3467(i: Int, i_4_: Int): Class258_Sub3? {
        anInt4357++
        val `object` = aClass60_4361!!.method583(i.toLong(), -127)
        if (`object` != null) return `object` as Class258_Sub3
        if (!aD4359!!.method4(-7953, i)) return null
        val class12 = aD4359.method3(i, -6662)
        val i_5_ = (if (!class12!!.aBoolean199) aHa_Sub2_4355!!.anInt7712 else 64)
        val class258_sub3: Class258_Sub3?
        if (class12.aBoolean218 && aHa_Sub2_4355!!.method3666()) {
            val fs = aD4359.method1(i_5_, 0.7f, false, -30824, i_5_, i)
            class258_sub3 = Class258_Sub3(aHa_Sub2_4355, 3553, 34842, i_5_, i_5_, class12.aByte205.toInt() != 0, fs!!, 6408)
        } else {
            val `is`: IntArray?
            if (class12.anInt200 == 2 || !method1915(4.toByte(), class12.aByte213.toInt())) `is` = aD4359.method6(-21540, i_5_, 0.7f, i, false, i_5_)
            else `is` = aD4359.method5(true, i, 0.7f, i_5_, i_5_, i_4_ + -196)
            class258_sub3 = Class258_Sub3(aHa_Sub2_4355!!, 3553, 6408, i_5_, i_5_, class12.aByte205.toInt() != 0, `is`, 0, 0, false)
        }
        class258_sub3.method1965(class12.aBoolean215, class12.aBoolean217, 10243)
        if (i_4_ != 256) method3466(22)
        aClass60_4361!!.method582(class258_sub3, i.toLong(), (-114).toByte())
        return class258_sub3
    }

    fun method3469(i: Int) {
        if (i == 8218) {
            anInt4353++
            aClass60_4361!!.method578(2, 5)
        }
    }

    init {
        try {
            aHa_Sub2_4355 = var_ha_Sub2
            aD4359 = var_d
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("eo.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (var_d != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt4352: Int = 0
        var anInt4353: Int = 0
        var anInt4354: Int = 0
        var anIntArrayArrayArray4356: Array<Array<IntArray?>?>? = null
        var anInt4357: Int = 0
        var anInt4358: Int = 0
        var anInt4360: Int = 0
        fun method3464(c: Char, bool: Boolean): Byte {
            anInt4354++
            if (bool != false) method3464('\uffe1', false)
            val i: Byte
            if ((c.code <= 0 || c.code >= 128) && (c.code < 160 || c.code > 255)) {
                if (c.code != 8364) {
                    if (c.code != 8218) {
                        if (c.code == 402) i = (-125).toByte()
                        else if (c.code == 8222) i = (-124).toByte()
                        else if (c.code == 8230) i = (-123).toByte()
                        else if (c.code == 8224) i = (-122).toByte()
                        else if (c.code == 8225) i = (-121).toByte()
                        else if (c.code != 710) {
                            if (c.code == 8240) i = (-119).toByte()
                            else if (c.code == 352) i = (-118).toByte()
                            else if (c.code == 8249) i = (-117).toByte()
                            else if (c.code == 338) i = (-116).toByte()
                            else if (c.code != 381) {
                                if (c.code != 8216) {
                                    if (c.code == 8217) i = (-110).toByte()
                                    else if (c.code != 8220) {
                                        if (c.code != 8221) {
                                            if (c.code == 8226) i = (-107).toByte()
                                            else if (c.code != 8211) {
                                                if (c.code != 8212) {
                                                    if (c.code == 732) i = (-104).toByte()
                                                    else if (c.code == 8482) i = (-103).toByte()
                                                    else if (c.code == 353) i = (-102).toByte()
                                                    else if (c.code != 8250) {
                                                        if (c.code != 339) {
                                                            if (c.code == 382) i = (-98).toByte()
                                                            else if (c.code == 376) i = (-97).toByte()
                                                            else i = 63.toByte()
                                                        } else i = (-100).toByte()
                                                    } else i = (-101).toByte()
                                                } else i = (-105).toByte()
                                            } else i = (-106).toByte()
                                        } else i = (-108).toByte()
                                    } else i = (-109).toByte()
                                } else i = (-111).toByte()
                            } else i = (-114).toByte()
                        } else i = (-120).toByte()
                    } else i = (-126).toByte()
                } else i = (-128).toByte()
            } else i = c.code.toByte()
            return i
        }

        fun method3465(i: Int, i_0_: Int, class338: Class338): Boolean {
            anInt4358++
            Class348_Sub40_Sub4.aClass101_9114!!.method897(class338.anIntArray4187!![i], class338.anIntArray4191[i], class338.anIntArray4184[i], Class318_Sub1_Sub5_Sub2.anIntArray10172!!)
            val i_1_ = Class318_Sub1_Sub5_Sub2.anIntArray10172!![2]
            if (i_1_ < 50) return false
            class338.aShortArray4194!![i] = (Class69.anInt1202 + (Class318_Sub1_Sub5_Sub2.anIntArray10172!![0] * Class140.anInt1962 / i_1_)).toShort()
            class338.aShortArray4183!![i] = ((Class285_Sub2.anInt8498 * Class318_Sub1_Sub5_Sub2.anIntArray10172!![i_0_] / i_1_) + Class348_Sub49_Sub2.anInt9759).toShort()
            class338.aShortArray4188!![i] = i_1_.toShort()
            return true
        }

        @JvmStatic
        fun method3466(i: Int) {
            val i_2_ = 22 / ((-2 - i) / 52)
            anInt4352++
            for (i_3_ in 0..99) Class152.aBooleanArray2076!![i_3_] = true
        }

        @JvmStatic
        fun method3468(i: Int) {
            anIntArrayArrayArray4356 = null
            if (i != -1401) anIntArrayArrayArray4356 = null
        }
    }
}
