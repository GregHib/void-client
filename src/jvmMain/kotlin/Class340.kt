import Class348_Sub1_Sub2.Companion.method2730
import java.math.BigInteger

class Class340 internal constructor(class248: Class248?, class112: Class112?, biginteger: BigInteger?, biginteger_14_: BigInteger?) {
    private val aClass248_4212: Class248?
    private val aBigInteger4213: BigInteger?
    private var aClass348_Sub49_4215: Class348_Sub49? = null
    private var aClass314_Sub1Array4216: Array<Class314_Sub1?>? = null
    private var aClass112_4217: Class112? = null
    private val aBigInteger4218: BigInteger?
    private var aClass348_Sub42_Sub16_Sub1_4220: Class348_Sub42_Sub16_Sub1? = null
    fun method2670(i: Int) {
        anInt4222++
        if (aClass314_Sub1Array4216 != null) {
            var i_0_ = 0
            while ((i_0_ < aClass314_Sub1Array4216!!.size)) {
                if (aClass314_Sub1Array4216!![i_0_] != null) aClass314_Sub1Array4216!![i_0_]!!.method2342(0)
                i_0_++
            }
            for (i_1_ in i..<aClass314_Sub1Array4216!!.size) {
                if (aClass314_Sub1Array4216!![i_1_] != null) aClass314_Sub1Array4216!![i_1_]!!.method2343(-1)
            }
        }
    }

    fun method2673(class137: Class137?, i: Int, class137_3_: Class137?, i_4_: Int): Class314_Sub1? {
        try {
            anInt4219++
            if (i_4_ != 255) method2671(-43)
            return method2675((-123).toByte(), true, i, class137, class137_3_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("eb.D(" + (if (class137 != null) "{...}" else "null") + ',' + i + ',' + (if (class137_3_ != null) "{...}" else "null") + ',' + i_4_ + ')'))
        }
    }

    fun method2674(i: Int): Boolean {
        anInt4214++
        if (aClass348_Sub49_4215 != null) {
            return true
        }
        if (aClass348_Sub42_Sub16_Sub1_4220 == null) {
            if (aClass248_4212!!.method1900(-71)) {
                return false
            }
            aClass348_Sub42_Sub16_Sub1_4220 = aClass248_4212.method1906((-84).toByte(), 0.toByte(), true, 255, 255)
        }
        if (aClass348_Sub42_Sub16_Sub1_4220!!.aBoolean9664) {
            return false
        }
        val class348_sub49 = Class348_Sub49(aClass348_Sub42_Sub16_Sub1_4220!!.method3259(i xor 0x17))
        class348_sub49.anInt7197 = 5
        val idxCount = class348_sub49.readUnsignedByte(i xor 0xf8)
        class348_sub49.anInt7197 += idxCount * 72
        val `is` = ByteArray((class348_sub49.aByteArray7154!!.size - class348_sub49.anInt7197))
        class348_sub49.method3389(2147483647, 0, `is`.size, `is`)
        val is_6_: ByteArray?
        if (aBigInteger4213 != null && aBigInteger4218 != null) {
            val biginteger = BigInteger(`is`)
            val biginteger_7_ = biginteger.modPow(aBigInteger4213, aBigInteger4218)
            is_6_ = biginteger_7_.toByteArray()
        } else {
            is_6_ = `is`
        }
        if (is_6_.size != 65) {
            throw RuntimeException()
        }
        val is_8_ = method2730(4567, 5, (class348_sub49.aByteArray7154!!), (class348_sub49.anInt7197) - (`is`.size + 5))
        for (i_9_ in 0..63) {
            if (is_8_[i_9_] != is_6_[i_9_ + 1]) {
                throw RuntimeException()
            }
        }
        aClass348_Sub49_4215 = class348_sub49
        aClass314_Sub1Array4216 = arrayOfNulls<Class314_Sub1>(idxCount)
        return true
    }

    private fun method2675(i: Byte, bool: Boolean, i_10_: Int, class137: Class137?, class137_11_: Class137?): Class314_Sub1? {
        try {
            anInt4221++
            if (aClass348_Sub49_4215 == null) throw RuntimeException()
            if (i_10_ < 0 || i_10_ >= aClass314_Sub1Array4216!!.size) throw RuntimeException()
            if (aClass314_Sub1Array4216!![i_10_] != null) return aClass314_Sub1Array4216!![i_10_]
            aClass348_Sub49_4215!!.anInt7197 = 6 + i_10_ * 72
            val i_12_ = aClass348_Sub49_4215!!.readInt((-126).toByte())
            val i_13_ = aClass348_Sub49_4215!!.readInt((-126).toByte())
            val `is` = ByteArray(64)
            aClass348_Sub49_4215!!.method3389(2147483647, 0, 64, `is`)
            if (i >= -18) method2671(103)
            val class314_sub1 = Class314_Sub1(i_10_, class137, class137_11_, aClass248_4212, aClass112_4217, i_12_, `is`, i_13_, bool)
            aClass314_Sub1Array4216!![i_10_] = class314_sub1
            return class314_sub1
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("eb.E(" + i + ',' + bool + ',' + i_10_ + ',' + (if (class137 != null) "{...}" else "null") + ',' + (if (class137_11_ != null) "{...}" else "null") + ')'))
        }
    }

    init {
        do {
            try {
                aClass112_4217 = class112
                aBigInteger4218 = biginteger_14_
                aBigInteger4213 = biginteger
                aClass248_4212 = class248
                if (aClass248_4212!!.method1900(-31)) break
                aClass348_Sub42_Sub16_Sub1_4220 = aClass248_4212.method1906((-80).toByte(), 0.toByte(), true, 255, 255)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("eb.<init>(" + (if (class248 != null) "{...}" else "null") + ',' + (if (class112 != null) "{...}" else "null") + ',' + (if (biginteger != null) "{...}" else "null") + ',' + (if (biginteger_14_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt4214: Int = 0
        var anInt4219: Int = 0
        var anInt4221: Int = 0
        var anInt4222: Int = 0
        var aClass351_4223: Class351? = Class351(4, 0)
        var anInt4224: Int = 0
        var aClass351_4225: Class351? = Class351(43, -1)

        @JvmStatic
        fun method2671(i: Int) {
            aClass351_4225 = null
            aClass351_4223 = null
            if (i != 0) method2672(92, 5)
        }

        @JvmStatic
        fun method2672(i: Int, i_2_: Int): Boolean {
            anInt4224++
            if (i_2_ >= -89) return true
            return i == 7 || i == 8 || i == 9
        }
    }
}
