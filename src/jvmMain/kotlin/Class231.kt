import Class16.method260
import Class214.method1574
import Class318_Sub1_Sub3_Sub3.Companion.method2431

/* Class231 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class231 internal constructor(string: String?, @JvmField var anInt2995: Int) {
    override fun toString(): String {
        anInt2992++
        throw IllegalStateException()
    }

    fun method1640(i: Int): Int {
        if (i != 0) return -76
        anInt2991++
        return this.anInt2995
    }

    companion object {
        var anInt2990: Int = 0
        var anInt2991: Int = 0
        var anInt2992: Int = 0
        var aClass297_2993: Class297? = null
        var anInt2994: Int = 0
        var anInt2996: Int = 0
        var anInt2997: Int = 0

        fun method1638(i: Int, fs: FloatArray, i_0_: Int): FloatArray {
            anInt2990++
            if (i_0_ != -1) aClass297_2993 = null
            val fs_1_ = FloatArray(i)
            method1574(fs, 0, fs_1_, 0, i)
            return fs_1_
        }

        @JvmStatic
        fun method1639(i: Int, i_2_: Int): Boolean {
            anInt2994++
            return i >= 12 && i <= 17
        }

        @JvmStatic
        fun method1641(i: Byte) {
            aClass297_2993 = null
            if (i.toInt() != 85) aClass297_2993 = null
        }

        @JvmStatic
        fun method1642(i: Byte, var_ha: ha?) {
            anInt2997++
            var i_3_ = 0
            var i_4_ = 0
            if (Class59_Sub1.aBoolean5300) {
                i_3_ = s_Sub3.method4008((-124).toByte())
                i_4_ = method260(false)
            }
            val i_5_ = -10660793
            Class318_Sub7.method2509(Class63.anInt1117, Class348_Sub42_Sub5.anInt9532 - -i_4_, var_ha!!, Class135_Sub1.anInt4717 - -i_3_, i_5_, true, Class237_Sub1.anInt5819, -16777216)
            if (i > 98) {
                Class262.aClass324_3326!!.method2576(Class274.aClass274_3507!!.method2063(Class348_Sub33.anInt6967, 544), i_5_, i_4_ + (Class348_Sub42_Sub5.anInt9532 - -14), i_3_ + (Class135_Sub1.anInt4717 + 3), -1, -125)
                val i_6_ = Class258_Sub4.aClass373_8552!!.method3597(true) - -i_3_
                val i_7_ = i_4_ + Class258_Sub4.aClass373_8552!!.method3594(127.toByte())
                if (Class348_Sub42_Sub6.aBoolean9535) {
                    var i_8_ = 0
                    var class348_sub42_sub13 = (Class233.Companion.aClass107_3022!!.method1011(-119) as? Class348_Sub42_Sub13?)
                    while (class348_sub42_sub13 != null) {
                        val i_9_ = (31 + i_4_ + Class348_Sub42_Sub5.anInt9532 + i_8_ * 16)
                        i_8_++
                        if ((class348_sub42_sub13.anInt9615) == 1) Class318_Sub2.method2494(i_4_ + Class348_Sub42_Sub5.anInt9532, -256, i_9_, var_ha, ((class348_sub42_sub13.aClass107_9621.aClass348_Sub42_1647.aClass348_Sub42_7063) as Class348_Sub42_Sub12?), Class63.anInt1117, i_7_, -1, 124.toByte(), Class237_Sub1.anInt5819, Class135_Sub1.anInt4717 - -i_3_, i_6_)
                        else method2431(-1, i_9_, class348_sub42_sub13, i_6_, Class63.anInt1117, -256, i_7_, var_ha, Class348_Sub42_Sub5.anInt9532 + i_4_, 126, Class135_Sub1.anInt4717 - -i_3_, Class237_Sub1.anInt5819)
                        class348_sub42_sub13 = (Class233.Companion.aClass107_3022!!.method1003(44.toByte()) as? Class348_Sub42_Sub13?)
                    }
                    if (Class242.aClass348_Sub42_Sub13_3152 != null) {
                        Class318_Sub7.method2509(Class348_Sub1_Sub1.anInt8806, Class373.anInt4534, var_ha, Class50_Sub3.anInt5252, i_5_, true, Class177.anInt4669, -16777216)
                        i_8_ = 0
                        Class262.aClass324_3326!!.method2576(Class242.aClass348_Sub42_Sub13_3152!!.aString9617, i_5_, Class373.anInt4534 - -14, 3 + Class50_Sub3.anInt5252, -1, -126)
                        var class348_sub42_sub12 = (Class242.aClass348_Sub42_Sub13_3152!!.aClass107_9621.method1011(-84) as? Class348_Sub42_Sub12?)
                        while (class348_sub42_sub12 != null) {
                            val i_10_ = 31 + (Class373.anInt4534 + i_8_ * 16)
                            i_8_++
                            Class318_Sub2.method2494(Class373.anInt4534, -256, i_10_, var_ha, class348_sub42_sub12, Class348_Sub1_Sub1.anInt8806, i_7_, -1, 125.toByte(), Class177.anInt4669, Class50_Sub3.anInt5252, i_6_)
                            class348_sub42_sub12 = (Class242.aClass348_Sub42_Sub13_3152!!.aClass107_9621.method1003(73.toByte()) as? Class348_Sub42_Sub12?)
                        }
                        Class332.method2642(Class348_Sub1_Sub1.anInt8806, Class373.anInt4534, true, Class50_Sub3.anInt5252, Class177.anInt4669)
                    }
                } else {
                    var i_11_ = 0
                    var class348_sub42_sub12 = (Class348_Sub40_Sub4.aClass262_9111!!.method1995(4) as? Class348_Sub42_Sub12?)
                    while (class348_sub42_sub12 != null) {
                        val i_12_ = 31 + (i_4_ + Class348_Sub42_Sub5.anInt9532 - -((-i_11_ + -1 + Class73.anInt4776) * 16))
                        Class318_Sub2.method2494(i_4_ + Class348_Sub42_Sub5.anInt9532, -256, i_12_, var_ha, class348_sub42_sub12, Class63.anInt1117, i_7_, -1, 124.toByte(), Class237_Sub1.anInt5819, Class135_Sub1.anInt4717 - -i_3_, i_6_)
                        i_11_++
                        class348_sub42_sub12 = Class348_Sub40_Sub4.aClass262_9111!!.method1990(55.toByte()) as? Class348_Sub42_Sub12?
                    }
                }
                Class332.method2642(Class63.anInt1117, Class348_Sub42_Sub5.anInt9532 - -i_4_, true, Class135_Sub1.anInt4717 + i_3_, Class237_Sub1.anInt5819)
            }
        }
    }
}
