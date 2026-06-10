import Class324.Companion.method2582
import jaggl.OpenGL.Companion.glGetUniformLocationARB
import jaggl.OpenGL.Companion.glUniform1fARB
import jaggl.OpenGL.Companion.glUniform1iARB
import jaggl.OpenGL.Companion.glUniform3fARB
import jaggl.OpenGL.Companion.glUniform4fARB
import jaggl.OpenGL.Companion.glUseProgramObjectARB
import kotlin.math.abs

class Class367_Sub9 internal constructor(class377: Class377, class45: Class45?, class269: Class269?) : Class367(class377) {
    private var aClass89_7369: Class89? = null
    private var aBoolean7373 = false
    private var aClass269_7375: Class269? = null
    private var aBoolean7376 = false
    override fun method3526(i: Int, i_0_: Int, i_1_: Int) {
        anInt7372++
        if (aBoolean7373) {
            val i_2_ = 1 shl (i_0_ and 0x3)
            val f = (1 shl (0x7 and (i_0_ shr 3))).toFloat() / 32.0f
            val i_3_ = i_1_ and 0xffff
            val f_4_ = (0x3 and (i_1_ shr 16)).toFloat() / 8.0f
            val l = aClass89_7369!!.aLong1510
            glUniform1fARB(glGetUniformLocationARB(l, "time"), ((this.aHa_Sub3_4479.anInt8146) * i_2_ % 40000).toFloat() / 40000.0f)
            glUniform1fARB(glGetUniformLocationARB(l, "scale"), f)
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterDepth"), i_3_.toFloat())
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterOffset"), f_4_)
        }
        if (i != 10756) aClass269_7375 = null
    }

    override fun method3520(i: Byte) {
        if (i.toInt() != 87) aBoolean7376 = true
        if (aBoolean7373) {
            this.aHa_Sub3_4479.method3897(1, -4382)
            this.aHa_Sub3_4479.method3850(70.toByte(), null)
            this.aHa_Sub3_4479.method3897(0, -4382)
            this.aHa_Sub3_4479.method3850(107.toByte(), null)
            glUseProgramObjectARB(0L)
            aBoolean7373 = false
        }
        anInt7368++
    }

    override fun method3530(i: Int): Boolean {
        if (i >= -57) aBoolean7373 = true
        anInt7366++
        return aBoolean7376
    }

    override fun method3527(i: Int, interface18: Interface18?, i_12_: Int) {
        if (i_12_ != -16776) method3552(-90)
        anInt7380++
        if (!aBoolean7373) {
            this.aHa_Sub3_4479.method3850(102.toByte(), interface18)
            this.aHa_Sub3_4479.method3923(true, i)
        }
    }

    override fun method3521(bool: Boolean, i: Byte) {
        anInt7377++
        if (i.toInt() != -103) anInt7379 = -84
    }

    init {
        try {
            aClass269_7375 = class269
            if (class45 != null && class377!!.aBoolean9921 && class377.aBoolean9922) {
                val class39 = (Class328.method2608(class377, class45.method391("gl", "environment_mapped_water_v", -29832), -108, 35633))
                val class39_13_ = (Class328.method2608(class377, class45.method391("gl", "environment_mapped_water_f", -29832), -122, 35632))
                aClass89_7369 = method2582(class377, arrayOf<Class39?>(class39, class39_13_), -2113)
                aBoolean7376 = (aClass89_7369 != null && aClass269_7375!!.method2041(120.toByte()))
            } else aBoolean7376 = false
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ko.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class45 != null) "{...}" else "null") + ',' + (if (class269 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7370++
        if (i != 15192) method3551(58, -50, 40, true)
        val interface18_impl2 = this.aHa_Sub3_4479.method3834(-16777216)
        if (aBoolean7376 && interface18_impl2 != null) {
            this.aHa_Sub3_4479.method3897(1, i + -19574)
            this.aHa_Sub3_4479.method3850((-63).toByte(), interface18_impl2)
            this.aHa_Sub3_4479.method3897(0, -4382)
            this.aHa_Sub3_4479.method3850((-107).toByte(), aClass269_7375!!.anInterface18_Impl1_3455)
            val l = aClass89_7369!!.aLong1510
            glUseProgramObjectARB(l)
            glUniform1iARB(glGetUniformLocationARB(l, "normalSampler"), 0)
            glUniform1iARB(glGetUniformLocationARB(l, "envMapSampler"), 1)
            glUniform3fARB(glGetUniformLocationARB(l, "sunDir"), -(this.aHa_Sub3_4479.aFloatArray8170[0]), -(this.aHa_Sub3_4479.aFloatArray8170[1]), -(this.aHa_Sub3_4479.aFloatArray8170[2]))
            glUniform4fARB(glGetUniformLocationARB(l, "sunColour"), this.aHa_Sub3_4479.aFloat8180, this.aHa_Sub3_4479.aFloat8087, this.aHa_Sub3_4479.aFloat8168, 1.0f)
            glUniform1fARB(glGetUniformLocationARB(l, "sunExponent"), 928.0f * abs(this.aHa_Sub3_4479.aFloatArray8170[1]) + 96.0f)
            aBoolean7373 = true
        }
    }

    companion object {
        @JvmField
        var anInt7366: Int = 0
        @JvmField
        var aClass114_7367: Class114? = Class114(37, 7)
        @JvmField
        var anInt7368: Int = 0
        @JvmField
        var anInt7370: Int = 0
        @JvmField
        var aClass45_7371: Class45? = null
        @JvmField
        var anInt7372: Int = 0
        @JvmField
        var anInt7374: Int = 0
        @JvmField
        var anInt7377: Int = 0
        @JvmField
        var aStringArray7378: Array<String?>? = null
        @JvmField
        var anInt7379: Int = 0
        @JvmField
        var anInt7380: Int = 0

        @JvmStatic
        fun method3551(i: Int, i_5_: Int, i_6_: Int, bool: Boolean): String? {
            var i_6_ = i_6_
            anInt7374++
            require(!(i_5_ < 2 || i_5_ > 36)) { "Invalid radix:" + i_5_ }
            if (!bool || i_6_ < 0) return i_6_.toString(i_5_.coerceIn(2, 36))
            var i_7_ = 2
            var i_8_ = i_6_ / i_5_
            while (i_8_ != 0) {
                i_8_ /= i_5_
                i_7_++
            }
            val cs = CharArray(i_7_)
            cs[0] = '+'
            var i_9_ = i_7_ + -1
            if (i != 8320) return null
            while ( /**/i_9_ > 0) {
                val i_10_ = i_6_
                i_6_ /= i_5_
                val i_11_ = i_10_ + -(i_6_ * i_5_)
                if (i_11_ < 10) cs[i_9_] = (i_11_ + 48).toChar()
                else cs[i_9_] = (i_11_ + 87).toChar()
                i_9_--
            }
            return String(cs)
        }

        @JvmStatic
        fun method3552(i: Int) {
            aClass45_7371 = null
            aClass114_7367 = null
            aStringArray7378 = null
            if (i != 87) anInt7379 = 80
        }
    }
}
