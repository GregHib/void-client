import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glLoadMatrixf
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glTexGeni

class Class286_Sub8 internal constructor(var_ha_Sub2: ha_Sub2) : Class286(var_ha_Sub2) {
    private var aBoolean6301 = false
    private var aClass61_6302: Class61? = null
    override fun method2133(i: Int) {
        if (i <= -75) {
            if (aBoolean6301) {
                aClass61_6302!!.method594('\u0001', 28666)
                this.aHa_Sub2_3684.method3738(-15039, 1)
                this.aHa_Sub2_3684.method3771((-92).toByte(), null)
                this.aHa_Sub2_3684.method3738(-15039, 0)
            } else this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
            anInt6297++
            this.aHa_Sub2_3684.method3729(8448, 116.toByte(), 8448)
            aBoolean6301 = false
        }
    }

    override fun method2140(class258: Class258?, i: Byte, i_1_: Int) {
        anInt6303++
        this.aHa_Sub2_3684.method3771((-86).toByte(), class258)
        this.aHa_Sub2_3684.method3761(0, i_1_)
        if (i >= -89) method2172(12)
    }

    init {
        if (var_ha_Sub2.aBoolean7863) {
            aClass61_6302 = Class61(var_ha_Sub2, 2)
            aClass61_6302!!.method595(123.toByte(), 0)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3729(34165, (-35).toByte(), 7681)
            this.aHa_Sub2_3684.method3762(34168, 770, (-87).toByte(), 2)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 34167)
            glTexGeni(8192, 9472, 34066)
            glTexGeni(8193, 9472, 34066)
            glTexGeni(8194, 9472, 34066)
            glEnable(3168)
            glEnable(3169)
            glEnable(3170)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aClass61_6302!!.method591(-1)
            aClass61_6302!!.method595(126.toByte(), 1)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3729(8448, (-73).toByte(), 8448)
            this.aHa_Sub2_3684.method3762(34166, 770, (-87).toByte(), 2)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
            glDisable(3168)
            glDisable(3169)
            glDisable(3170)
            glMatrixMode(5890)
            glLoadIdentity()
            glMatrixMode(5888)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aClass61_6302!!.method591(-1)
        }
    }

    override fun method2139(bool: Boolean, i: Byte) {
        anInt6298++
        val i_5_ = 94 / ((i - -60) / 38)
        this.aHa_Sub2_3684.method3729(8448, (-28).toByte(), 7681)
    }

    override fun method2137(i: Int): Boolean {
        if (i > -5) aFloat6304 = -0.3934622f
        anInt6294++
        return true
    }

    override fun method2134(bool: Boolean, bool_8_: Boolean) {
        if (bool_8_ != false) method2171(85)
        anInt6293++
        val class258_sub2 = this.aHa_Sub2_3684.method3741(444720536)
        if (aClass61_6302 != null && class258_sub2 != null && bool) {
            aClass61_6302!!.method594('\u0000', 28666)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-77).toByte(), class258_sub2)
            glMatrixMode(5890)
            glLoadMatrixf(this.aHa_Sub2_3684.aClass101_Sub3_7767.method945(true), 0)
            glMatrixMode(5888)
            this.aHa_Sub2_3684.method3738(-15039, 0)
            aBoolean6301 = true
        } else this.aHa_Sub2_3684.method3775(false, 0, 770, 34168)
    }

    override fun method2136(i: Int, i_9_: Int, i_10_: Byte) {
        anInt6305++
        if (i_10_ > -42) aBoolean6301 = false
    }

    companion object {
        @JvmField
        var anInt6292: Int = 0
        @JvmField
        var anInt6293: Int = 0
        @JvmField
        var anInt6294: Int = 0
        @JvmField
        var anInt6295: Int = 0
        @JvmField
        var anIntArray6296: IntArray? = intArrayOf(32, 39, 44, 47)
        @JvmField
        var anInt6297: Int = 0
        @JvmField
        var anInt6298: Int = 0
        @JvmField
        var anInt6299: Int = -1
        @JvmField
        var anInt6300: Int = 0
        @JvmField
        var anInt6303: Int = 0
        @JvmField
        var aFloat6304: Float = 0f
        @JvmField
        var anInt6305: Int = 0

        @JvmStatic
        fun method2170(i: Int, i_0_: Byte) {
            Class48.anInt859 = -1
            anInt6300++
            if (i_0_.toInt() != 3) method2170(-109, 7.toByte())
            Class245.anInt3170 = i
            Class48.anInt859 = -1
            Class348_Sub15.method2811(false)
        }

        @JvmStatic
        fun method2171(i: Int) {
            if (i != 0) method2172(-6)
            anIntArray6296 = null
        }

        @JvmStatic
        fun method2172(i: Int) {
            val i_2_ = 27 / ((i - -12) / 57)
            anInt6295++
            if (Class93.anApplet1530 != null) {
                try {
                    val string = Class93.anApplet1530!!.getParameter("cookiehost")
                    val i_3_ = (Class62.method599(-74) / 86400000L).toInt() - 11745
                    val string_4_ = ("usrdob=" + i_3_ + "; version=1; path=/; domain=" + string)
                    Class224.method1615(Class93.anApplet1530, -15092, "document.cookie=\"" + string_4_ + "\"")
                } catch (throwable: Throwable) {
                    /* empty */
                }
            }
        }

        @JvmStatic
        fun method2173(bool: Boolean, i: Int, bool_6_: Boolean) {
            val i_7_ = 111 % ((i - -62) / 38)
            anInt6292++
            if (bool) {
                Class26.anInt383--
                if (Class26.anInt383 == 0) Class10.anIntArray179 = null
            }
            if (bool_6_) {
                Class348_Sub40_Sub26.anInt9346--
                if (Class348_Sub40_Sub26.anInt9346 == 0) Class126.anIntArray4983 = null
            }
        }
    }
}
