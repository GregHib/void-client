import Class348_Sub5_Sub1.Companion.method2766
import Class88.Companion.method847
import java.io.DataInputStream
import java.net.URL

class Class156 {
    private var aClass348_Sub42_2115: Class348_Sub42? = null
    private var aClass107_2118: Class107? = null
    fun method1240(i: Int): Class348_Sub42? {
        anInt2114++
        if (i <= 7) method1240(79)
        val class348_sub42 = (aClass107_2118!!.aClass348_Sub42_1647.aClass348_Sub42_7063)
        if (class348_sub42 === aClass107_2118!!.aClass348_Sub42_1647) {
            aClass348_Sub42_2115 = null
            return null
        }
        aClass348_Sub42_2115 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    constructor()

    fun method1243(i: Byte): Class348_Sub42? {
        anInt2120++
        if (i < 44) aStringArray2113 = null
        val class348_sub42 = aClass348_Sub42_2115
        if (class348_sub42 === aClass107_2118!!.aClass348_Sub42_1647) {
            aClass348_Sub42_2115 = null
            return null
        }
        aClass348_Sub42_2115 = class348_sub42!!.aClass348_Sub42_7063
        return class348_sub42
    }

    internal constructor(class107: Class107) {
        aClass107_2118 = class107
    }

    companion object {
        var aFloat2111: Float = 0f
        var anInt2112: Int = 0
        var aStringArray2113: Array<String?>? = arrayOfNulls<String>(100)
        var anInt2114: Int = 0
        var anInt2116: Int = 0
        @JvmField
        var anIntArray2117: IntArray? = IntArray(2)
        var anInt2119: Int = 0
        var anInt2120: Int = 0

        fun method1238(i: Int, i_0_: Int, i_1_: Int): Boolean {
            anInt2116++
            if (i_1_ > -4) aFloat2111 = -0.9273654f
            return (0x800 and i) != 0
        }

        @JvmStatic
        fun method1239(i: Int) {
            aStringArray2113 = null
            anIntArray2117 = null
            if (i != 30114) anIntArray2117 = null
        }

        @JvmStatic
        fun method1241(i: Int, i_2_: Int, i_3_: Int): Boolean {
            if (i_3_ > -111) method1239(-81)
            anInt2119++
            return (((i_2_ and 0x18) != 0) or ((0x220 and i_2_) == 544))
        }

        @JvmStatic
        fun method1242(string: String?, throwable: Throwable?, i: Int) {
            anInt2112++
            do {
                try {
                    var string_4_ = ""
                    if (throwable != null) string_4_ = method2766(false, throwable)
                    if (string != null) {
                        if (throwable != null) string_4_ += " | "
                        string_4_ += string
                    }
                    throwable?.printStackTrace()
                    method847(string_4_, -5192)
                    string_4_ = Class341.method2680("%3a", true, ":", string_4_)
                    string_4_ = Class341.method2680("%40", true, "@", string_4_)
                    string_4_ = Class341.method2680("%26", true, "&", string_4_)
                    string_4_ = Class341.method2680("%23", true, "#", string_4_)
                    if (Class348_Sub8.anApplet6662 != null) {
                        if (i != 15004) method1238(-69, 63, 124)
                        val class144 = (Class231.aClass297_2993!!.method2237(URL(Class348_Sub8.anApplet6662!!.getCodeBase(), ("clienterror.ws?c=" + Class348_Sub1_Sub3.anInt8818 + "&u=" + (if (s_Sub2.aString8265 != null) s_Sub2.aString8265 else Class89.aLong1507.toString()) + "&v1=" + Class297.aString3782 + "&v2=" + Class297.aString3796 + "&e=" + string_4_)), 8362))
                        while (class144!!.anInt1997 == 0) Class286_Sub5.method2161((-123).toByte(), 1L)
                        if (class144.anInt1997 != 1) break
                        val datainputstream = class144.anObject1998 as DataInputStream?
                        datainputstream!!.read()
                        datainputstream.close()
                    }
                } catch (exception: Exception) {
                    break
                }
                break
            } while (false)
        }
    }
}
