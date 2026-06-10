import Class64.Companion.method607
import kotlin.math.sqrt

/* Class174 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class174 {
    @JvmField
    var anInt2289: Int = 0
    @JvmField
    var anInt2290: Int = 0
    @JvmField
    var anInt2291: Int = 0
    @JvmField
    var anInt2292: Int = 0
    @JvmField
    var anInt2294: Int = 0
    @JvmField
    var anInt2296: Int = 0
    @JvmField
    var anInt2297: Int = 0
    @JvmField
    var anInt2298: Int = 0
    @JvmField
    var anInt2299: Int = 0
    @JvmField
    var aLong2301: Long = 0
    private var anInt2302 = 0
    @JvmField
    var anInt2303: Int = 0
    @JvmField
    var anInt2304: Int = 0
    private var aBoolean2308 = false
    private fun method1335(class348_sub49: Class348_Sub49, i: Int, i_8_: Byte) {
        anInt2287++
        if (i == 1) anInt2302 = class348_sub49.readUnsignedShort(842397944)
        else if (i == 2) class348_sub49.readUnsignedByte(255)
        else if (i == 3) {
            this.anInt2291 = class348_sub49.readInt((-126).toByte())
            this.anInt2290 = class348_sub49.readInt((-126).toByte())
            this.anInt2294 = class348_sub49.readInt((-126).toByte())
        } else if (i == 4) {
            this.anInt2289 = class348_sub49.readUnsignedByte(255)
            this.anInt2304 = class348_sub49.readInt((-126).toByte())
        } else if (i != 6) {
            if (i == 8) this.anInt2297 = 1
            else if (i == 9) this.anInt2292 = 1
            else if (i == 10) aBoolean2308 = true
        } else this.anInt2296 = class348_sub49.readUnsignedByte(255)
        if (i_8_ >= -124) this.aLong2301 = 65L
    }

    fun method1336(i: Int, class348_sub49: Class348_Sub49) {
        while (true) {
            val i_9_ = class348_sub49.readUnsignedByte(255)
            if (i_9_ == 0) break
            method1335(class348_sub49, i_9_, (-128).toByte())
        }
        anInt2288++
        if (i <= 36) this.anInt2296 = 8
    }

    fun method1337(i: Int) {
        anInt2300++
        this.anInt2298 = Class70.anIntArray1204!![anInt2302 shl 3]
        val l = this.anInt2291.toLong()
        val l_10_ = this.anInt2290.toLong()
        val l_11_ = this.anInt2294.toLong()
        this.anInt2299 = sqrt((l_10_ * l_10_ + (l * l - -(l_11_ * l_11_))).toDouble()).toInt()
        if (this.anInt2304 == 0) this.anInt2304 = 1
        if ((this.anInt2289.inv()) != i) {
            if (this.anInt2289 == 1) {
                this.aLong2301 = (this.anInt2299 * 8 / this.anInt2304).toLong()
                this.aLong2301 *= this.aLong2301
            } else if (this.anInt2289 == 2) this.aLong2301 = (8 * this.anInt2299 / this.anInt2304).toLong()
        } else this.aLong2301 = 2147483647L
        if (aBoolean2308) this.anInt2299 *= -1
    }

    companion object {
        var anInt2287: Int = 0
        var anInt2288: Int = 0
        var anInt2293: Int = 0
        var anInt2295: Int = 0
        var anInt2300: Int = 0
        var aClass114_2305: Class114? = Class114(57, 10)
        @JvmField
        var aClass45_2306: Class45? = null
        @JvmField
        var aClass223_2307: Class223? = Class223(7, 2)
        @JvmField
        var aClass105_2309: Class105? = null

        fun method1332(bool: Boolean, bool_0_: Boolean, i: Int, string: String): Boolean {
            anInt2293++
            require(!(i < 2 || i > 36)) { "Invalid radix:" + i }
            var bool_1_ = false
            var bool_2_ = false
            var i_3_ = 0
            if (bool != true) aClass45_2306 = null
            val i_4_ = string.length
            for (i_5_ in 0..<i_4_) {
                var i_6_ = string.get(i_5_).code
                if (i_5_ == 0) {
                    if (i_6_ == 45) {
                        bool_1_ = true
                        continue
                    }
                    if (i_6_ == 43 && bool_0_) continue
                }
                if (i_6_ < 48 || i_6_ > 57) {
                    if (i_6_ < 65 || i_6_ > 90) {
                        if (i_6_ >= 97 && i_6_ <= 122) i_6_ -= 87
                        else return false
                    } else i_6_ -= 55
                } else i_6_ -= 48
                if (i_6_ >= i) return false
                if (bool_1_) i_6_ = -i_6_
                val i_7_ = i * i_3_ - -i_6_
                if (i_7_ / i != i_3_) return false
                bool_2_ = true
                i_3_ = i_7_
            }
            return bool_2_
        }

        fun method1333(`is`: ShortArray?, i: Int, strings: Array<String?>?) {
            try {
                if (i != 26073) aClass105_2309 = null
                anInt2295++
                method607(strings!!.size + -1, strings, `is`, 0, false)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("po.B(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (strings != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method1334(i: Byte) {
            aClass223_2307 = null
            if (i.toInt() != -110) method1333(null, -51, null)
            aClass114_2305 = null
            aClass105_2309 = null
            aClass45_2306 = null
        }
    }
}
