import java.io.EOFException
import java.io.IOException

/* Class137 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class137 internal constructor(i: Int, class78: Class78?, class78_26_: Class78?, i_27_: Int) {
    private var anInt1932 = 0
    private var aClass78_1933: Class78? = null
    private var aClass78_1938: Class78? = null
    private var anInt1939 = 65000

    fun method1160(i: Int, i_0_: Int, `is`: ByteArray?, i_1_: Int): Boolean {
        if (i_1_ != -7305) return true
        anInt1935++
        synchronized(aClass78_1933!!) {
            require(!(i < 0 || i > anInt1939))
            var bool = method1162(`is`, -15096, i_0_, i, true)
            if (!bool) bool = method1162(`is`, -15096, i_0_, i, false)
            return bool
        }
    }

    fun method1161(i: Byte, i_2_: Int): ByteArray? {
        anInt1937++
        synchronized(aClass78_1933!!) {
            try {
                if ((6 * i_2_ - -6).toLong() > aClass78_1938!!.method787(0)) return null
                aClass78_1938!!.method789((6 * i_2_).toLong(), (-106).toByte())
                aClass78_1938!!.method788(0, Class239.aByteArray3144!!, 6, i + -16713)
                val i_3_ = ((0xff and Class239.aByteArray3144!![2].toInt()) + ((0xff00 and (Class239.aByteArray3144!![1].toInt() shl 8)) + (0xff0000 and (Class239.aByteArray3144!![0].toInt() shl 16))))
                var i_4_ = ((0xff and Class239.aByteArray3144!![5].toInt()) + ((0xff and Class239.aByteArray3144!![3].toInt()) shl 16) - -((Class239.aByteArray3144!![4].toInt() and 0xff) shl 8))
                if (i_3_ < 0 || anInt1939 < i_3_) return null
                if (i_4_ <= 0 || i_4_.toLong() > aClass78_1933!!.method787(0) / 520L) return null
                val `is` = ByteArray(i_3_)
                var i_5_ = 0
                if (i.toInt() != -4) return null
                var i_6_ = 0
                while (i_3_ > i_5_) {
                    if (i_4_ == 0) return null
                    aClass78_1933!!.method789((i_4_ * 520).toLong(), (-103).toByte())
                    var i_7_ = -i_5_ + i_3_
                    if (i_7_ > 512) i_7_ = 512
                    aClass78_1933!!.method788(0, Class239.aByteArray3144!!, 8 + i_7_, i.toInt() xor 0x414f)
                    val i_8_ = ((0xff00 and (Class239.aByteArray3144!![0].toInt() shl 8)) + (Class239.aByteArray3144!![1].toInt() and 0xff))
                    val i_9_ = ((Class239.aByteArray3144!![2].toInt() shl 8 and 0xff00) + (Class239.aByteArray3144!![3].toInt() and 0xff))
                    val i_10_ = (((Class239.aByteArray3144!![5].toInt() and 0xff) shl 8) + (0xff0000 and (Class239.aByteArray3144!![4].toInt() shl 16)) + (Class239.aByteArray3144!![6].toInt() and 0xff))
                    val i_11_ = 0xff and Class239.aByteArray3144!![7].toInt()
                    if (i_2_ != i_8_ || i_9_ != i_6_ || i_11_ != anInt1932) return null
                    if (i_10_ < 0 || (i_10_.toLong() > aClass78_1933!!.method787(i + 4) / 520L)) return null
                    i_4_ = i_10_
                    i_6_++
                    for (i_12_ in 0..<i_7_) `is`[i_5_++] = Class239.aByteArray3144!![8 + i_12_]
                }
                return `is`
            } catch (ioexception: IOException) {
                return null
            }
        }
    }

    private fun method1162(`is`: ByteArray?, i: Int, i_13_: Int, i_14_: Int, bool: Boolean): Boolean {
        var bool = bool
        anInt1936++
        synchronized(aClass78_1933!!) {
            try {
                var i_15_: Int
                if (bool) {
                    if (aClass78_1938!!.method787(i + 15096) < (i_13_ * 6 - -6).toLong()) return false
                    aClass78_1938!!.method789((i_13_ * 6).toLong(), 70.toByte())
                    aClass78_1938!!.method788(0, Class239.aByteArray3144!!, 6, -16717)
                    i_15_ = ((0xff and Class239.aByteArray3144!![5].toInt()) + ((0xff and Class239.aByteArray3144!![3].toInt()) shl 16) + ((Class239.aByteArray3144!![4].toInt() and 0xff) shl 8))
                    if (i_15_ <= 0 || (aClass78_1933!!.method787(i xor 0x3af7.inv()) / 520L < i_15_.toLong())) return false
                } else {
                    i_15_ = ((519L + aClass78_1933!!.method787(0)) / 520L).toInt()
                    if (i_15_ == 0) i_15_ = 1
                }
                Class239.aByteArray3144!![0] = (i_14_ shr 16).toByte()
                Class239.aByteArray3144!![4] = (i_15_ shr 8).toByte()
                Class239.aByteArray3144!![2] = i_14_.toByte()
                Class239.aByteArray3144!![1] = (i_14_ shr 8).toByte()
                Class239.aByteArray3144!![3] = (i_15_ shr 16).toByte()
                Class239.aByteArray3144!![5] = i_15_.toByte()
                aClass78_1938!!.method789((i_13_ * 6).toLong(), 111.toByte())
                aClass78_1938!!.method783(0, 6, true, Class239.aByteArray3144)
                var i_16_ = 0
                if (i != -15096) anInt1932 = 122
                var i_17_ = 0
                while (i_16_ < i_14_) {
                    var i_18_ = 0
                    if (bool) {
                        aClass78_1933!!.method789((520 * i_15_).toLong(), (-116).toByte())
                        try {
                            aClass78_1933!!.method788(0, Class239.aByteArray3144!!, 8, -16717)
                        } catch (eofexception: EOFException) {
                            break
                        }
                        val i_19_ = ((0xff and Class239.aByteArray3144!![1].toInt()) + (0xff00 and (Class239.aByteArray3144!![0].toInt() shl 8)))
                        i_18_ = ((0xff00 and (Class239.aByteArray3144!![5].toInt() shl 8)) + (((Class239.aByteArray3144!![4].toInt() and 0xff) shl 16) - -(0xff and Class239.aByteArray3144!![6].toInt())))
                        val i_20_ = ((Class239.aByteArray3144!![2].toInt() shl 8 and 0xff00) + (Class239.aByteArray3144!![3].toInt() and 0xff))
                        val i_21_ = 0xff and Class239.aByteArray3144!![7].toInt()
                        if (i_19_ != i_13_ || i_20_ != i_17_ || i_21_ != anInt1932) return false
                        if (i_18_ < 0 || (aClass78_1933!!.method787(0) / 520L < i_18_.toLong())) return false
                    }
                    if (i_18_ == 0) {
                        bool = false
                        i_18_ = ((aClass78_1933!!.method787(0) - -519L) / 520L).toInt()
                        if (i_18_ == 0) i_18_++
                        if (i_15_ == i_18_) i_18_++
                    }
                    if (i_14_ + -i_16_ <= 512) i_18_ = 0
                    Class239.aByteArray3144!![3] = i_17_.toByte()
                    Class239.aByteArray3144!![2] = (i_17_ shr 8).toByte()
                    Class239.aByteArray3144!![0] = (i_13_ shr 8).toByte()
                    Class239.aByteArray3144!![1] = i_13_.toByte()
                    Class239.aByteArray3144!![5] = (i_18_ shr 8).toByte()
                    Class239.aByteArray3144!![6] = i_18_.toByte()
                    Class239.aByteArray3144!![7] = anInt1932.toByte()
                    Class239.aByteArray3144!![4] = (i_18_ shr 16).toByte()
                    aClass78_1933!!.method789((520 * i_15_).toLong(), (-121).toByte())
                    aClass78_1933!!.method783(0, 8, true, Class239.aByteArray3144)
                    var i_22_ = -i_16_ + i_14_
                    if (i_22_ > 512) i_22_ = 512
                    aClass78_1933!!.method783(i_16_, i_22_, true, `is`)
                    i_17_++
                    i_16_ += i_22_
                    i_15_ = i_18_
                }
                return true
            } catch (ioexception: IOException) {
                return false
            }
        }
    }

    override fun toString(): String {
        anInt1934++
        return "Cache:" + anInt1932
    }

    init {
        try {
            anInt1932 = i
            aClass78_1933 = class78
            aClass78_1938 = class78_26_
            anInt1939 = i_27_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("nw.<init>(" + i + ',' + (if (class78 != null) "{...}" else "null") + ',' + (if (class78_26_ != null) "{...}" else "null") + ',' + i_27_ + ')'))
        }
    }

    companion object {
        var anInt1931: Int = 0
        var anInt1934: Int = 0
        var anInt1935: Int = 0
        var anInt1936: Int = 0
        var anInt1937: Int = 0
        @JvmStatic
        fun method1163(i: Int, i_23_: Byte, i_24_: Int): Boolean {
            val i_25_ = -65 / ((i_23_ - 2) / 55)
            anInt1931++
            return (i_24_ and 0x800) != 0
        }
    }
}
