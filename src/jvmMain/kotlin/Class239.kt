import Class239_Sub3.Companion.method1728

/* Class239 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class239 {
    var aClass348_Sub51_3136: Class348_Sub51
    var anInt3138: Int
    abstract fun method1710(i: Int): Int

    abstract fun method1712(i: Int, i_2_: Int)

    abstract fun method1714(i: Int, i_3_: Int): Int

    abstract fun method1716(bool: Boolean)

    internal constructor(class348_sub51: Class348_Sub51) {
        this.aClass348_Sub51_3136 = class348_sub51
        this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) {
        this.aClass348_Sub51_3136 = class348_sub51
        this.anInt3138 = i
    }

    fun method1718(i: Int, i_7_: Int) {
        if (i_7_ < 3) method1712(12, 42)
        anInt3139++
        if (method1714(3, i) != 3) method1712(124, i)
    }

    companion object {
        @JvmField
        var anInt3134: Int = 0
        @JvmField
        var aClass114_3135: Class114? = Class114(108, 5)
        @JvmField
        var anInt3137: Int = 0
        @JvmField
        var anInt3139: Int = 0
        @JvmField
        var anInt3140: Int = 0
        @JvmField
        var anInt3141: Int = 0
        @JvmField
        var anInt3142: Int = 0
        @JvmField
        var aClass114_3143: Class114?
        @JvmField
        var aByteArray3144: ByteArray? = ByteArray(520)
        @JvmField
        var aClass114_3145: Class114? = null
        @JvmField
        var aClass45_3146: Class45? = null
        @JvmField
        var aClass166_3147: Class166? = null

        @JvmStatic
        fun method1709(i: Int): Array<Class231?> {
            if (i > -110) method1715(97)
            anInt3141++
            return (arrayOf<Class231?>(Class68.aClass231_1189, Class348_Sub40_Sub20.aClass231_9263, Class288.aClass231_4953))
        }

        @JvmStatic
        fun method1711(i: Int, class45: Class45?, i_0_: Int, class45_1_: Class45?) {
            try {
                Class135_Sub2.aClass45_4843 = class45_1_
                anInt3140++
                if (i != 7) aClass45_3146 = null
                Class138.aClass45_1940 = class45
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("su.Q(" + i + ',' + (if (class45 != null) "{...}" else "null") + ',' + i_0_ + ',' + (if (class45_1_ != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method1713(bool: Boolean, i: Int) {
            method1728(Class348_Sub42_Sub8_Sub2.anInt10432, -1, r.anInt9721, bool, Class321.anInt4017)
            if (i == 520) anInt3137++
        }

        @JvmStatic
        fun method1715(i: Int) {
            aClass114_3145 = null
            aClass114_3143 = null
            aClass45_3146 = null
            aClass114_3135 = null
            aByteArray3144 = null
            aClass166_3147 = null
            if (i < 13) method1709(-99)
        }

        @JvmStatic
        fun method1717(i: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            Class348_Sub33.aByteArrayArrayArray6962 = Array<Array<ByteArray?>?>(i_6_) { Array<ByteArray?>(i_5_) { ByteArray(i_4_) } }
            if (i != 19278) method1717(35, 126, -83, 85)
            anInt3134++
        }

        init {
            aClass114_3143 = Class114(7, 3)
        }
    }
}
