import jaggl.OpenGL.Companion.glFramebufferTexture2DEXT
import jaggl.OpenGL.Companion.glTexImage2Di
import jaggl.OpenGL.Companion.glTexImage2Dub

class Class258_Sub2 : Class258 {
    private var anInt8535 = -1
    private var anInt8536 = -1
    @JvmField
    var anInt8538: Int = 0

    fun method1961(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        anInt8533++
        glFramebufferTexture2DEXT(i, i_1_, i_0_, this.anInt4859, i_2_)
        if (i_3_ != -1) aStringArray8532 = null
        anInt8536 = i
        anInt8535 = i_1_
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_4_: Int) : super(var_ha_Sub2, 34067, i, i_4_ * (i_4_ * 6), false) {
        this.anInt8538 = i_4_
        this.aHa_Sub2_4851.method3771((-81).toByte(), this)
        for (i_5_ in 0..5) glTexImage2Dub(i_5_ + 34069, 0, this.anInt4858, i_4_, i_4_, 0, Class348_Sub9.method2779(true, (this.anInt4858)), 5121, null, 0)
        this.method1957(9728, true)
    }

    override fun method37(i: Int) {
        glFramebufferTexture2DEXT(anInt8536, anInt8535, 3553, 0, 0)
        anInt8534++
        anInt8535 = -1
        if (i != -3022) anInt8537 = 60
        anInt8536 = -1
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_6_: Int, bool: Boolean, `is`: Array<ByteArray?>?, i_7_: Int) : super(var_ha_Sub2, 34067, i, i_6_ * (i_6_ * 6), bool) {
        try {
            this.anInt8538 = i_6_
            this.aHa_Sub2_4851.method3771((-127).toByte(), this)
            for (i_8_ in 0..5) glTexImage2Dub(i_8_ + 34069, 0, this.anInt4858, i_6_, i_6_, 0, i_7_, 5121, `is`!![i_8_], 0)
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("q.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_6_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_7_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_9_: Int, bool: Boolean, `is`: Array<IntArray?>?) : super(var_ha_Sub2, 34067, i, 6 * i_9_ * i_9_, bool) {
        try {
            this.anInt8538 = i_9_
            this.aHa_Sub2_4851.method3771((-77).toByte(), this)
            if (bool) {
                for (i_10_ in 0..5) Class353.method3460(i_10_ + 34069, this.anInt4858, i_9_, this.aHa_Sub2_4851.anInt7812, i_9_, `is`!![i_10_]!!, 32993, -83)
            } else {
                for (i_11_ in 0..5) glTexImage2Di(i_11_ + 34069, 0, this.anInt4858, i_9_, i_9_, 0, 32993, (this.aHa_Sub2_4851.anInt7812), `is`!![i_11_], 0)
            }
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("q.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_9_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var aLongArray8530: LongArray? = null
        @JvmField
        var aClass10Array8531: Array<Class10?>? = arrayOfNulls<Class10>(50)
        @JvmField
        var aStringArray8532: Array<String?>? = null
        @JvmField
        var anInt8533: Int = 0
        @JvmField
        var anInt8534: Int = 0
        @JvmField
        var anInt8537: Int = 0
        @JvmStatic
        fun method1962(i: Int) {
            aStringArray8532 = null
            aLongArray8530 = null
            aClass10Array8531 = null
            if (i != -1) aStringArray8532 = null
        }
    }
}
