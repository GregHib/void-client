import Exception_Sub1.Companion.method141

/* Class100 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class100 internal constructor(private val aHa_Sub2_1581: ha_Sub2) {
    private var anInt1578 = 0
    private var aClass83_1582: Class83?
    private var anInt1584 = 0
    var aClass286_Sub1_1586: Class286_Sub1
    private val aClass286Array1588: Array<Class286?>
    private var anInt1592 = 0

    fun method884(i: Int, bool: Boolean, i_0_: Int, i_1_: Int, i_2_: Byte, bool_3_: Boolean) {
        var i_0_ = i_0_
        var i_1_ = i_1_
        var bool_3_ = bool_3_
        anInt1587++
        bool_3_ = bool_3_ and aHa_Sub2_1581.method3639()
        if (!bool_3_ && (i_0_ == 4 || i_0_ == 8 || i_0_ == 9)) {
            if (i_0_ == 4) i_1_ = i
            i_0_ = 2
        }
        if (i_0_ != 0 && bool) i_0_ = i_0_ or 0x7fffffff.inv()
        if (anInt1578 != i_0_) {
            if (anInt1578 != 0) aClass286Array1588[0x7fffffff and anInt1578]!!.method2133(-93)
            if (i_0_ != 0) {
                aClass286Array1588[i_0_ and 0x7fffffff]!!.method2134(bool, false)
                aClass286Array1588[0x7fffffff and i_0_]!!.method2139(bool, ((-115).toByte()).toByte())
                aClass286Array1588[i_0_ and 0x7fffffff]!!.method2136(i, i_1_, ((-106).toByte()).toByte())
            }
            anInt1578 = i_0_
            anInt1584 = i_1_
            anInt1592 = i
        } else if (anInt1578 != 0) {
            aClass286Array1588[0x7fffffff and anInt1578]!!.method2139(bool, ((-101).toByte()).toByte())
            if (i != anInt1592 || anInt1584 != i_1_) {
                aClass286Array1588[0x7fffffff and anInt1578]!!.method2136(i, i_1_, ((-98).toByte()).toByte())
                anInt1592 = i
                anInt1584 = i_1_
            }
        }
        if (i_2_ <= 9) aClass83_1582 = null
    }

    fun method885(i: Int, i_4_: Byte, class258: Class258?): Boolean {
        anInt1590++
        if (anInt1578 == 0) return false
        if (i_4_.toInt() != -124) method889(99.toByte(), 7)
        aClass286Array1588[0x7fffffff and anInt1578]!!.method2140(class258, ((-98).toByte()).toByte(), i)
        return true
    }

    fun method889(i: Byte, i_8_: Int): Boolean {
        if (i >= -45) method885(7, ((-70).toByte()).toByte(), null)
        anInt1577++
        return aClass286Array1588[i_8_]!!.method2137(-112)
    }

    init {
        aClass83_1582 = Class83(aHa_Sub2_1581)
        aClass286Array1588 = arrayOfNulls(10)
        aClass286Array1588[1] = Class286_Sub9(aHa_Sub2_1581)
        aClass286Array1588[2] = Class286_Sub3(aHa_Sub2_1581, aClass83_1582)
        aClass286Array1588[4] = Class286_Sub7(aHa_Sub2_1581, aClass83_1582)
        aClass286Array1588[5] = Class286_Sub5(aHa_Sub2_1581, aClass83_1582)
        aClass286Array1588[6] = Class286_Sub2(aHa_Sub2_1581)
        aClass286Array1588[7] = Class286_Sub8(aHa_Sub2_1581)
        this.aClass286_Sub1_1586 = Class286_Sub1(aHa_Sub2_1581)
        aClass286Array1588[3] = this.aClass286_Sub1_1586
        aClass286Array1588[8] = Class286_Sub6(aHa_Sub2_1581, aClass83_1582)
        aClass286Array1588[9] = Class286_Sub4(aHa_Sub2_1581, aClass83_1582)
        if (!aClass286Array1588[8]!!.method2137(-33)) aClass286Array1588[8] = aClass286Array1588[4]
        if (!aClass286Array1588[9]!!.method2137(-82)) aClass286Array1588[9] = aClass286Array1588[8]
    }

    companion object {
        @JvmField
        var anInt1577: Int = 0
        @JvmField
        var aClass78Array1579: Array<Class78?>? = arrayOfNulls(37)
        @JvmField
        var anInt1580: Int = 0
        @JvmField
        var anIntArray1583: IntArray? = IntArray(14)
        @JvmField
        var aClass356_1585: Class356? = Class356(16)
        @JvmField
        var anInt1587: Int = 0
        @JvmField
        var anInt1589: Int = 0
        @JvmField
        var anInt1590: Int = 0
        var aClass227_1591: Class227? = Class227(1)
        @JvmStatic
        fun method886(i: Int) {
            aClass356_1585 = null
            aClass78Array1579 = null
            if (i != 16) aClass78Array1579 = null
            anIntArray1583 = null
            aClass227_1591 = null
        }

        @JvmStatic
        fun method887(class46: Class46?, i: Int, i_5_: Int, i_6_: Int) {
            if (i_6_ == 2147483647) {
                anInt1589++
                if (Class289.aClass46_3701 == null && !Class5_Sub1.aBoolean8335 && (class46 != null && (method141(class46, ((-79).toByte()).toByte()) != null))) {
                    Class289.aClass46_3701 = class46
                    Class331.aClass46_4130 = method141(class46, ((-117).toByte()).toByte())
                    Class318_Sub1.anInt6392 = 0
                    Class219.anInt2872 = i_5_
                    Class318_Sub4.anInt6411 = i
                    Class300.aBoolean3819 = false
                }
            }
        }

        fun method888(i: Byte, i_7_: Int, class46: Class46): Int {
            anInt1580++
            if (i.toInt() != 57) method886(7)
            if (!Client.method105(class46)!!.method3301(i_7_, false) && class46.anObjectArray741 == null) return -1
            if (class46.anIntArray706 != null && i_7_ < class46.anIntArray706!!.size) return class46.anIntArray706!![i_7_]
            return -1
        }
    }
}
