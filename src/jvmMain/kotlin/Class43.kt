import Class348_Sub42_Sub16_Sub1.Companion.method3261

/* Class43 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class43 {
    @JvmField
    var aClass348_Sub42_Sub10_614: Class348_Sub42_Sub10? = null
    @JvmField
    var anInt615: Int = 0
    @JvmField
    var anIntArray617: IntArray? = null

    companion object {
        @JvmField
        var aClass45_611: Class45? = null
        @JvmField
        var anInt612: Int = 0
        @JvmField
        var anInt613: Int = 0
        @JvmField
        var anInt616: Int = 0
        @JvmField
        var aClass351_618: Class351? = Class351(5, 3)
        @JvmField
        var anIntArray619: IntArray? = intArrayOf(0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4)
        @JvmField
        var anInt620: Int = 0

        @JvmStatic
        fun method380(i: Int) {
            aClass351_618 = null
            anIntArray619 = null
            if (i == 0) aClass45_611 = null
        }

        @JvmStatic
        fun method381(i: Byte): Class179 {
            anInt616++
            if (i.toInt() != 68) Companion.method381((-42).toByte())
            return Class114.method1059(95.toByte(), 1)
        }

        fun method382(string: String, bool: Boolean) {
            anInt613++
            Class239_Sub12.aString5966 = string
            if (bool != true) Companion.method381((-48).toByte())
            if (Class93.anApplet1530 != null) {
                try {
                    val string_0_ = Class93.anApplet1530!!.getParameter("cookieprefix")
                    val string_1_ = Class93.anApplet1530!!.getParameter("cookiehost")
                    var string_2_ = (string_0_ + "settings=" + string + "; version=1; path=/; domain=" + string_1_)
                    if (string.length == 0) string_2_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0"
                    else string_2_ += ("; Expires=" + (method3261(Class62.method599(-53) + 94608000000L, 63)) + "; Max-Age=" + 94608000L)
                    Class224.method1615(Class93.anApplet1530, -15092, "document.cookie=\"" + string_2_ + "\"")
                } catch (throwable: Throwable) {
                    /* empty */
                }
            }
        }

        @JvmStatic
        fun method383(i: Int) {
            var i_3_ = i
            while (Class250.anInt3225 > i_3_) {
                val i_4_ = (Class350.method3452(Class286.anInt3682 + i_3_, (-15).toByte(), Class250.anInt3225) * Class31.anInt425)
                var i_5_ = 0
                while (Class31.anInt425 > i_5_) {
                    val i_6_ = (Class350.method3452(i_5_ - -Class239_Sub24.anInt6095, (-15).toByte(), Class31.anInt425) + i_4_)
                    if (Class132.anIntArray1909!![i_6_] == Class318_Sub1_Sub1_Sub2.anInt9997) Class92.anInterface4Array1525!![i_6_]!!.method14(0, 0, Class58.anInt1067, Class344.anInt4267, i_5_ * Class58.anInt1067, Class344.anInt4267 * i_3_, true, true)
                    i_5_++
                }
                i_3_++
            }
            anInt612++
        }
    }
}
