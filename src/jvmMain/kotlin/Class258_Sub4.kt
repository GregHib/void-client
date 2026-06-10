import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage1Dub
import jaggl.OpenGL.Companion.glTexParameteri

class Class258_Sub4 internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_0_: Int, `is`: ByteArray?, i_1_: Int) : Class258(var_ha_Sub2, 3552, i, i_0_, false) {
    private val anInt8556: Int
    override fun method37(i: Int) {
        if (i == -3022) anInt8554++
    }

    fun method1972(i: Byte, bool: Boolean) {
        this.aHa_Sub2_4851.method3771((-114).toByte(), this)
        val i_2_ = 59 / ((-49 - i) / 40)
        anInt8555++
        glTexParameteri(this.anInt4849, 10242, if (!bool) 33071 else 10497)
    }

    init {
        try {
            anInt8556 = i_0_
            this.aHa_Sub2_4851.method3771((-94).toByte(), this)
            glPixelStorei(3317, 1)
            glTexImage1Dub(this.anInt4849, 0, this.anInt4858, anInt8556, 0, i_1_, 5121, `is`, 0)
            glPixelStorei(3317, 4)
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wha.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_1_ + ')'))
        }
    }

    companion object {
        @JvmField
        var aClass373_8552: Class373? = null
        @JvmField
        var aClass138_8553: Class138?
        @JvmField
        var anInt8554: Int = 0
        @JvmField
        var anInt8555: Int = 0
        @JvmField
        var anIntArray8557: IntArray? = IntArray(500)
        @JvmField
        var aBoolean8558: Boolean = false
        @JvmField
        var anInt8559: Int = 0
        @JvmField
        var aFloat8560: Float = 0f

        @JvmStatic
        fun method1973(i: Int) {
            aClass138_8553 = null
            aClass373_8552 = null
            if (i == 24885) anIntArray8557 = null
        }

        @JvmStatic
        fun method1974(i: Byte, i_3_: Int, bool: Boolean): Class348_Sub13? {
            anInt8559++
            val i_4_ = -43 / ((-65 - i) / 55)
            val l = (i_3_ or (if (bool) -2147483648 else 0)).toLong()
            return (Class348_Sub40.aClass356_7041!!.method3480(l, -6008) as Class348_Sub13?)
        }

        init {
            aClass138_8553 = Class138(9, 0, 4, 1)
        }
    }
}
