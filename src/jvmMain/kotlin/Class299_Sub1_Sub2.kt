import jaggl.OpenGL.Companion.glBegin
import jaggl.OpenGL.Companion.glEnd
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glMultiTexCoord3i
import jaggl.OpenGL.Companion.glOrtho
import jaggl.OpenGL.Companion.glPopAttrib
import jaggl.OpenGL.Companion.glPushAttrib
import jaggl.OpenGL.Companion.glTexCoord3i
import jaggl.OpenGL.Companion.glVertex2f
import jaggl.OpenGL.Companion.glViewport

class Class299_Sub1_Sub2 internal constructor(var_ha_Sub2: ha_Sub2, i: Int) : Class299_Sub1() {
    private val aClass258_Sub2_8701: Class258_Sub2
    private var aHa_Sub2_8707: ha_Sub2

    fun method2261(class258_sub2: Class258_Sub2?, f: Float, i: Int, class258_sub2_0_: Class258_Sub2?): Boolean {
        try {
            anInt8703++
            var bool = true
            val class206 = aHa_Sub2_8707.aClass206_7778
            aHa_Sub2_8707.K(Class348_Sub6.anIntArray6635)
            aHa_Sub2_8707.la()
            aHa_Sub2_8707.method3755(-32)
            glMatrixMode(5889)
            glLoadIdentity()
            glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0)
            glMatrixMode(5888)
            glLoadIdentity()
            glPushAttrib(2048)
            glViewport(0, 0, aClass258_Sub2_8701.anInt8538, aClass258_Sub2_8701.anInt8538)
            aHa_Sub2_8707.method3807(false, i + -65532)
            aHa_Sub2_8707.method3728(false, i + -65411)
            aHa_Sub2_8707.method3752(114, false)
            aHa_Sub2_8707.method3748(i + -65534, false)
            aHa_Sub2_8707.method3757(-2, -91)
            aHa_Sub2_8707.method3738(-15039, 1)
            aHa_Sub2_8707.method3749(f, 0.0f, 0.0f, 110.toByte(), 0.0f)
            aHa_Sub2_8707.method3729(34165, (-115).toByte(), 34165)
            aHa_Sub2_8707.method3771((-95).toByte(), class258_sub2_0_)
            aHa_Sub2_8707.method3738(-15039, 0)
            aHa_Sub2_8707.method3761(0, 1)
            aHa_Sub2_8707.method3771((-90).toByte(), class258_sub2)
            aHa_Sub2_8707.method3773(i xor 0xfffe.inv(), class206)
            for (i_1_ in 0..5) {
                val i_2_ = 34069 + i_1_
                class206!!.method1498(0, i + -65591, i_2_, aClass258_Sub2_8701)
                class206.method1503(0, 3.toByte())
                if (class206.method1507(-116)) {
                    glBegin(7)
                    val i_3_ = i_2_
                    while_101_@ do {
                        while_100_@ do {
                            while_99_@ do {
                                while_98_@ do {
                                    do {
                                        if (i_3_ == 34069) {
                                            glTexCoord3i(65535, 65534, 65534)
                                            glMultiTexCoord3i(33985, 65535, 65534, 65534)
                                            glVertex2f(0.0f, 0.0f)
                                            glTexCoord3i(65535, 65534, -65534)
                                            glMultiTexCoord3i(33985, 65535, 65534, -65534)
                                            glVertex2f(1.0f, 0.0f)
                                            glTexCoord3i(65535, -65534, -65534)
                                            glMultiTexCoord3i(33985, 65535, -65534, -65534)
                                            glVertex2f(1.0f, 1.0f)
                                            glTexCoord3i(65535, -65534, 65534)
                                            glMultiTexCoord3i(33985, 65535, -65534, 65534)
                                            glVertex2f(0.0f, 1.0f)
                                            break@while_101_
                                        } else if (i_3_ != 34070) {
                                            if (i_3_ != 34071) {
                                                if (i_3_ != 34072) {
                                                    if (i_3_ != 34073) {
                                                        if (i_3_ != 34074) break@while_101_
                                                    } else break@while_99_
                                                    break@while_100_
                                                }
                                            } else break
                                            break@while_98_
                                        }
                                        glTexCoord3i(-65535, 65534, -65534)
                                        glMultiTexCoord3i(33985, -65535, 65534, -65534)
                                        glVertex2f(0.0f, 0.0f)
                                        glTexCoord3i(-65535, 65534, 65534)
                                        glMultiTexCoord3i(33985, -65535, 65534, 65534)
                                        glVertex2f(1.0f, 0.0f)
                                        glTexCoord3i(-65535, -65534, 65534)
                                        glMultiTexCoord3i(33985, -65535, -65534, 65534)
                                        glVertex2f(1.0f, 1.0f)
                                        glTexCoord3i(-65535, -65534, -65534)
                                        glMultiTexCoord3i(33985, -65535, -65534, -65534)
                                        glVertex2f(0.0f, 1.0f)
                                        break@while_101_
                                    } while (false)
                                    glTexCoord3i(-65534, 65535, -65534)
                                    glMultiTexCoord3i(33985, -65534, 65535, -65534)
                                    glVertex2f(0.0f, 0.0f)
                                    glTexCoord3i(65534, 65535, -65534)
                                    glMultiTexCoord3i(33985, 65534, 65535, -65534)
                                    glVertex2f(1.0f, 0.0f)
                                    glTexCoord3i(65534, 65535, 65534)
                                    glMultiTexCoord3i(33985, 65534, 65535, 65534)
                                    glVertex2f(1.0f, 1.0f)
                                    glTexCoord3i(-65534, 65535, 65534)
                                    glMultiTexCoord3i(33985, -65534, 65535, 65534)
                                    glVertex2f(0.0f, 1.0f)
                                    break@while_101_
                                } while (false)
                                glTexCoord3i(-65534, -65535, 65534)
                                glMultiTexCoord3i(33985, -65534, -65535, 65534)
                                glVertex2f(0.0f, 0.0f)
                                glTexCoord3i(65534, -65535, 65534)
                                glMultiTexCoord3i(33985, 65534, -65535, 65534)
                                glVertex2f(1.0f, 0.0f)
                                glTexCoord3i(65534, -65535, -65534)
                                glMultiTexCoord3i(33985, 65534, -65535, -65534)
                                glVertex2f(1.0f, 1.0f)
                                glTexCoord3i(-65534, -65535, -65534)
                                glMultiTexCoord3i(33985, -65534, -65535, -65534)
                                glVertex2f(0.0f, 1.0f)
                                break@while_101_
                            } while (false)
                            glTexCoord3i(-65534, 65534, 65535)
                            glMultiTexCoord3i(33985, -65534, 65534, 65535)
                            glVertex2f(0.0f, 0.0f)
                            glTexCoord3i(65534, 65534, 65535)
                            glMultiTexCoord3i(33985, 65534, 65534, 65535)
                            glVertex2f(1.0f, 0.0f)
                            glTexCoord3i(65534, -65534, 65535)
                            glMultiTexCoord3i(33985, 65534, -65534, 65535)
                            glVertex2f(1.0f, 1.0f)
                            glTexCoord3i(-65534, -65534, 65535)
                            glMultiTexCoord3i(33985, -65534, -65534, 65535)
                            glVertex2f(0.0f, 1.0f)
                            break@while_101_
                        } while (false)
                        glTexCoord3i(65534, 65534, -65535)
                        glMultiTexCoord3i(33985, 65534, 65534, -65535)
                        glVertex2f(0.0f, 0.0f)
                        glTexCoord3i(-65534, 65534, -65535)
                        glMultiTexCoord3i(33985, -65534, 65534, -65535)
                        glVertex2f(1.0f, 0.0f)
                        glTexCoord3i(-65534, -65534, -65535)
                        glMultiTexCoord3i(33985, -65534, -65534, -65535)
                        glVertex2f(1.0f, 1.0f)
                        glTexCoord3i(65534, -65534, -65535)
                        glMultiTexCoord3i(33985, 65534, -65534, -65535)
                        glVertex2f(0.0f, 1.0f)
                    } while (false)
                    glEnd()
                } else {
                    bool = false
                    break
                }
            }
            class206!!.method1500(2983, 0)
            aHa_Sub2_8707.method3770(-422613672, class206)
            aHa_Sub2_8707.method3738(i + -80573, 1)
            if (i != 65534) return true
            aHa_Sub2_8707.method3771((-95).toByte(), null)
            aHa_Sub2_8707.method3729(8448, 121.toByte(), 8448)
            aHa_Sub2_8707.method3738(-15039, 0)
            aHa_Sub2_8707.method3771((-88).toByte(), null)
            glPopAttrib()
            aHa_Sub2_8707.KA(Class348_Sub6.anIntArray6635!![0], Class348_Sub6.anIntArray6635!![1], Class348_Sub6.anIntArray6635!![2], Class348_Sub6.anIntArray6635!![3])
            if (bool && !aHa_Sub2_8707.aBoolean7847) aClass258_Sub2_8701.method1950(69)
            return bool
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qda.L(" + (if (class258_sub2 != null) "{...}" else "null") + ',' + f + ',' + i + ',' + (if (class258_sub2_0_ != null) "{...}" else "null") + ')'))
        }
    }

    override fun method2256(i: Byte): Class258_Sub2? {
        anInt8700++
        if (i.toInt() != -121) return null
        return aClass258_Sub2_8701
    }

    fun method2262(i: Int): Int {
        anInt8699++
        return aClass258_Sub2_8701.anInt8538
    }

    init {
        aHa_Sub2_8707 = var_ha_Sub2
        aClass258_Sub2_8701 = Class258_Sub2(var_ha_Sub2, 6408, i)
    }

    companion object {
        @JvmField
        var aClass348_Sub49_8698: Class348_Sub49? = null
        @JvmField
        var anInt8699: Int = 0
        @JvmField
        var anInt8700: Int = 0
        @JvmField
        var anInt8702: Int = 0
        @JvmField
        var anInt8703: Int = 0
        @JvmField
        var anInt8704: Int = 0
        @JvmField
        var anInt8705: Int = 0
        @JvmField
        var aClass351_8706: Class351? = Class351(79, 3)
        @JvmStatic
        fun method2263(var_ha: ha?, i: Int, i_4_: Int): Class105? {
            anInt8705++
            val class348_sub15 = (Class27.aClass356_389!!.method3480(i_4_.toLong(), -6008) as Class348_Sub15?)
            if (class348_sub15 != null) {
                val class348_sub23_sub2 = class348_sub15.aClass55_Sub1_6768!!.method506(false)
                class348_sub15.aBoolean6772 = true
                if (class348_sub23_sub2 != null) return class348_sub23_sub2.method2975(var_ha!!, 0)
            }
            if (i != 0) aClass351_8706 = null
            return null
        }

        @JvmStatic
        fun method2264(bool: Boolean) {
            if (bool != false) aClass348_Sub49_8698 = null
            anInt8704++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(0, 105.toByte(), 15)
            class348_sub42_sub15.method3251(-16058)
        }

        @JvmStatic
        fun method2265(i: Int) {
            aClass348_Sub49_8698 = null
            if (i != -10794) aClass351_8706 = null
            aClass351_8706 = null
        }
    }
}
