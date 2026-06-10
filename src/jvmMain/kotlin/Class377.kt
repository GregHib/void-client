import jaclib.memory.Stream
import jaggl.MapBuffer
import jaggl.OpenGL
import jaggl.OpenGL.Companion.glActiveTexture
import jaggl.OpenGL.Companion.glAlphaFunc
import jaggl.OpenGL.Companion.glBindTexture
import jaggl.OpenGL.Companion.glBlendFunc
import jaggl.OpenGL.Companion.glClear
import jaggl.OpenGL.Companion.glClearColor
import jaggl.OpenGL.Companion.glClearDepth
import jaggl.OpenGL.Companion.glClientActiveTexture
import jaggl.OpenGL.Companion.glColorMaterial
import jaggl.OpenGL.Companion.glColorPointer
import jaggl.OpenGL.Companion.glCopyPixels
import jaggl.OpenGL.Companion.glCullFace
import jaggl.OpenGL.Companion.glDeleteBuffersARB
import jaggl.OpenGL.Companion.glDeleteFramebuffersEXT
import jaggl.OpenGL.Companion.glDeleteLists
import jaggl.OpenGL.Companion.glDeleteObjectARB
import jaggl.OpenGL.Companion.glDeleteProgramARB
import jaggl.OpenGL.Companion.glDeleteRenderbuffersEXT
import jaggl.OpenGL.Companion.glDeleteTextures
import jaggl.OpenGL.Companion.glDepthFunc
import jaggl.OpenGL.Companion.glDepthMask
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glDisableClientState
import jaggl.OpenGL.Companion.glDrawArrays
import jaggl.OpenGL.Companion.glDrawBuffer
import jaggl.OpenGL.Companion.glDrawElements
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glEnableClientState
import jaggl.OpenGL.Companion.glFinish
import jaggl.OpenGL.Companion.glFlush
import jaggl.OpenGL.Companion.glFogf
import jaggl.OpenGL.Companion.glFogfv
import jaggl.OpenGL.Companion.glFogi
import jaggl.OpenGL.Companion.glGenBuffersARB
import jaggl.OpenGL.Companion.glGetIntegerv
import jaggl.OpenGL.Companion.glGetString
import jaggl.OpenGL.Companion.glHint
import jaggl.OpenGL.Companion.glLightModelfv
import jaggl.OpenGL.Companion.glLightf
import jaggl.OpenGL.Companion.glLightfv
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glLoadMatrixf
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glMultMatrixf
import jaggl.OpenGL.Companion.glNormalPointer
import jaggl.OpenGL.Companion.glOrtho
import jaggl.OpenGL.Companion.glPolygonMode
import jaggl.OpenGL.Companion.glPopMatrix
import jaggl.OpenGL.Companion.glPushMatrix
import jaggl.OpenGL.Companion.glRasterPos2i
import jaggl.OpenGL.Companion.glReadBuffer
import jaggl.OpenGL.Companion.glReadPixelsi
import jaggl.OpenGL.Companion.glScissor
import jaggl.OpenGL.Companion.glShadeModel
import jaggl.OpenGL.Companion.glTexCoordPointer
import jaggl.OpenGL.Companion.glTexEnvfv
import jaggl.OpenGL.Companion.glTexEnvi
import jaggl.OpenGL.Companion.glTexGeni
import jaggl.OpenGL.Companion.glVertexPointer
import jaggl.OpenGL.Companion.glViewport
import java.awt.Canvas
import java.awt.Rectangle
import java.util.*

class Class377(opengl: OpenGL?, canvas: Canvas?, l: Long, var_d: d?, class45: Class45?, i: Int) : ha_Sub3(canvas, l, var_d, class45, i, 1) {
    private var anOpenGL9856: OpenGL? = null
    private val aClass262_9869 = Class262()
    private var aClass262_9899: Class262? = Class262()
    private val aClass262_9901 = Class262()
    private var aClass262_9902: Class262? = Class262()
    private var aClass262_9903: Class262? = Class262()
    private val aClass262_9904 = Class262()
    private var aClass262_9905: Class262? = Class262()
    private var aLong9906: Long = 0
    private var aClass285_Sub1Array9907: Array<Class285_Sub1?>? = arrayOfNulls<Class285_Sub1>(16)
    private var aBoolean9908 = false
    private var anInt9909 = 0
    private var aBoolean9910 = false
    private var aBoolean9911 = false
    private var aBoolean9912 = false
    @JvmField
    var aMapBuffer9913: MapBuffer = MapBuffer()
    private var aBoolean9914 = false
    @JvmField
    var aMapBuffer9915: MapBuffer = MapBuffer()
    private var aString9916: String? = null
    private val aString9917: String
    @JvmField
    var anInt9918: Int = 0
    private var aBoolean9919 = false
    @JvmField
    var aBoolean9920: Boolean = false
    @JvmField
    var aBoolean9921: Boolean = false
    @JvmField
    var aBoolean9922: Boolean = false
    @JvmField
    var aBoolean9923: Boolean = false
    private var anInt9924 = 0
    private var anInt9925 = 0
    private val aBoolean9926: Boolean
    var anIntArray9927: IntArray?

    @Synchronized
    override fun method3646(i: Int) {
        var i = i
        anInt9870++
        var i_0_ = 0
        i = i and 0x7fffffff
        while (!aClass262_9899!!.method2002(18.toByte())) {
            val class348_sub35 = aClass262_9899!!.method1997(8) as Class348_Sub35?
            Class107.anIntArray1650!![i_0_++] = class348_sub35!!.aLong4291.toInt()
            this.anInt8063 -= class348_sub35.anInt6976
            if (i_0_ == 1000) {
                glDeleteBuffersARB(i_0_, Class107.anIntArray1650, 0)
                i_0_ = 0
            }
        }
        if (i_0_ > 0) {
            glDeleteBuffersARB(i_0_, Class107.anIntArray1650, 0)
            i_0_ = 0
        }
        while (!aClass262_9901.method2002(18.toByte())) {
            val class348_sub35 = aClass262_9901.method1997(8) as Class348_Sub35?
            Class107.anIntArray1650!![i_0_++] = class348_sub35!!.aLong4291.toInt()
            this.anInt8062 -= class348_sub35.anInt6976
            if (i_0_ == 1000) {
                glDeleteTextures(i_0_, Class107.anIntArray1650, 0)
                i_0_ = 0
            }
        }
        if (i_0_ > 0) {
            glDeleteTextures(i_0_, Class107.anIntArray1650, 0)
            i_0_ = 0
        }
        while (!aClass262_9902!!.method2002(18.toByte())) {
            val class348_sub35 = aClass262_9902!!.method1997(8) as Class348_Sub35?
            Class107.anIntArray1650!![i_0_++] = class348_sub35!!.anInt6976
            if (i_0_ == 1000) {
                glDeleteFramebuffersEXT(i_0_, Class107.anIntArray1650, 0)
                i_0_ = 0
            }
        }
        if (i_0_ > 0) {
            glDeleteFramebuffersEXT(i_0_, Class107.anIntArray1650, 0)
            i_0_ = 0
        }
        while (!aClass262_9903!!.method2002(18.toByte())) {
            val class348_sub35 = aClass262_9903!!.method1997(8) as Class348_Sub35?
            Class107.anIntArray1650!![i_0_++] = class348_sub35!!.aLong4291.toInt()
            this.anInt8079 -= class348_sub35.anInt6976
            if (i_0_ == 1000) {
                glDeleteRenderbuffersEXT(i_0_, Class107.anIntArray1650, 0)
                i_0_ = 0
            }
        }
        if (i_0_ > 0) {
            glDeleteRenderbuffersEXT(i_0_, Class107.anIntArray1650, 0)
            val bool = false
        }
        while (!aClass262_9869.method2002(18.toByte())) {
            val class348_sub35 = aClass262_9869.method1997(8) as Class348_Sub35?
            glDeleteLists(class348_sub35!!.aLong4291.toInt(), class348_sub35.anInt6976)
        }
        while (!aClass262_9904.method2002(18.toByte())) {
            val class348 = aClass262_9904.method1997(8)
            glDeleteProgramARB(class348!!.aLong4291.toInt())
        }
        while (!aClass262_9905!!.method2002(18.toByte())) {
            val class348 = aClass262_9905!!.method1997(8)
            glDeleteObjectARB(class348!!.aLong4291)
        }
        while (!aClass262_9869.method2002(18.toByte())) {
            val class348_sub35 = aClass262_9869.method1997(8) as Class348_Sub35?
            glDeleteLists(class348_sub35!!.aLong4291.toInt(), class348_sub35.anInt6976)
        }
        if (this.E() > 100663296 && (Class62.method599(-82) > 60000L + aLong9906)) {
            System.gc()
            aLong9906 = Class62.method599(-96)
        }
        super.method3646(i)
    }

    override fun method3841(i: Byte) {
        if (i.toInt() == -116) {
            glDepthMask(this.aBoolean8124 && this.aBoolean8118)
            anInt9837++
        }
    }

    override fun method3812(i: Int, class58s: Array<Class58>): Class130 {
        try {
            anInt9875++
            return Class130_Sub1(class58s)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.KD(" + i + ',' + (if (class58s != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3818(bool: Boolean) {
        anInt9844++
        if (bool != true) aClass262_9899 = null
        if (this.aBoolean8110) {
            glEnable(16384)
            glEnable(16385)
        } else {
            glDisable(16384)
            glDisable(16385)
        }
    }

    override fun method3881(`object`: Any?, i: Byte, canvas: Canvas?) {
        try {
            anInt9880++
            if (i.toInt() == 99) {
                val var_long = `object` as Long
                if (!anOpenGL9856!!.setSurface(var_long)) throw RuntimeException()
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.UB(" + (if (`object` != null) "{...}" else "null") + ',' + i + ',' + (if (canvas != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3901(i: Byte) {
        anInt9831++
        if (i <= -18) method3970(1)
    }

    override fun method3924(bool: Boolean, bool_2_: Boolean, i: Int, class70: Class70?, bool_3_: Boolean) {
        try {
            anInt9852++
            if (bool_2_ == false) {
                glTexEnvi(8960, i + 34176, Class57.method531(101.toByte(), class70))
                if (bool) glTexEnvi(8960, i + 34192, if (!bool_3_) 770 else 771)
                else glTexEnvi(8960, i + 34192, if (!bool_3_) 768 else 769)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.DD(" + bool + ',' + bool_2_ + ',' + i + ',' + (if (class70 != null) "{...}" else "null") + ',' + bool_3_ + ')'))
        }
    }

    override fun method3880(class68: Class68?, class304: Class304?, i: Byte): Boolean {
        try {
            anInt9849++
            val i_4_ = -21 / ((85 - i) / 37)
            return true
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.FB(" + (if (class68 != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    override fun method3813(bool: Boolean) {
        glMatrixMode(5889)
        if (bool != true) method3652()
        anInt9884++
        glLoadMatrixf(this.aFloatArray8135, 0)
        glMatrixMode(5888)
    }

    override fun ya() {
        anInt9839++
        this.method3946(-32, true)
        glClear(256)
    }

    @Synchronized
    fun method3966(l: Long, i: Int) {
        try {
            anInt9853++
            val class348 = Class348()
            class348.aLong4291 = l
            if (i == 34192) aClass262_9905!!.method1999(class348, i xor 0xcb43.inv())
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "bga.N(" + l + ',' + i + ')')
        }
    }

    override fun method3624(i: Int, i_5_: Int): Interface13? {
        anInt9893++
        return null
    }

    override fun method3935(i: Int) {
        anInt9861++
        glTexEnvi(8960, 34162, Class348_Sub32.method3021(32.toByte(), (this.aClass229Array8092[(this.anInt8175)])))
        if (i >= -99) method3658(-123, -102, -33, -112)
    }

    override fun method3872(i: Int, i_6_: Int, class304: Class304?, bool: Boolean, i_7_: Int, `is`: ByteArray?): Interface18_Impl1 {
        try {
            if (bool != true) aString9916 = null
            anInt9832++
            return Class14_Sub3(this, class304, i_6_, i_7_, i, `is`)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.ND(" + i + ',' + i_6_ + ',' + (if (class304 != null) "{...}" else "null") + ',' + bool + ',' + i_7_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    @Synchronized
    fun method3967(i: Int, i_8_: Byte, i_9_: Int) {
        anInt9898++
        val class348_sub35 = Class348_Sub35(i)
        if (i_8_.toInt() != 59) method3818(false)
        class348_sub35.aLong4291 = i_9_.toLong()
        aClass262_9901.method1999(class348_sub35, -20180)
    }

    override fun method3884(i: Byte) {
        anInt9896++
        if (i.toInt() != 101) method3967(52, (-47).toByte(), 49)
    }

    override fun method3928(i: Int) {
        RuntimeException_Sub1.aFloatArray4602!![0] = this.aFloat8180 * this.aFloat8093
        anInt9864++
        RuntimeException_Sub1.aFloatArray4602!![2] = this.aFloat8093 * this.aFloat8168
        RuntimeException_Sub1.aFloatArray4602!![1] = this.aFloat8087 * this.aFloat8093
        RuntimeException_Sub1.aFloatArray4602!![3] = 1.0f
        glLightModelfv(2899, RuntimeException_Sub1.aFloatArray4602, i)
    }

    override fun method3843(i: Int, i_11_: Int, i_12_: Int, i_13_: Int, `is`: ByteArray?, class304: Class304?, i_14_: Int, bool: Boolean): Interface18_Impl3 {
        try {
            anInt9846++
            if (i_14_ != 32) anOpenGL9856 = null
            if (!aBoolean9926 && (!Class192.method1436(i_14_ xor 0x46, i_12_) || !Class192.method1436(i_14_ + 83, i))) {
                if (aBoolean9919) return Class14_Sub4(this, class304, i_12_, i, `is`, i_11_, i_13_)
                val class14_sub1 = Class14_Sub1(this, class304, Class68.aClass68_1183, Class33.method340(i_12_, 108.toByte()), Class33.method340(i, 108.toByte()))
                class14_sub1.method70(0, i_11_, (-45).toByte(), i_13_, i, i_12_, 0, `is`, class304)
                return class14_sub1
            }
            return Class14_Sub1(this, class304, i_12_, i, bool, `is`, i_11_, i_13_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.B(" + i + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + i_14_ + ',' + bool + ')'))
        }
    }

    override fun method3910(i: Byte, i_15_: Int) {
        if (i.toInt() == -26) anInt9834++
    }

    override fun method3871(class113: Class113?, i: Int) {
        try {
            if (i == 0) {
                anInt9836++
                if (class113 == Class150.aClass113_2047) {
                    glDisable(3168)
                    glDisable(3169)
                    glDisable(3170)
                } else {
                    val i_16_ = Class318_Sub1_Sub3.method2411(class113, 25602)
                    glTexGeni(8192, 9472, i_16_)
                    glEnable(3168)
                    glTexGeni(8193, 9472, i_16_)
                    glEnable(3169)
                    glTexGeni(8194, 9472, i_16_)
                    glEnable(3170)
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.CD(" + (if (class113 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    override fun method3926(i: Byte, bool: Boolean) {
        anInt9847++
        if (i <= 34) aBoolean9914 = false
        if (bool) glEnable(32925)
        else glDisable(32925)
    }

    override fun method3940(i: Int) {
        glMatrixMode(5890)
        anInt9888++
        if (Class348_Sub42_Sub18.aClass251_9685 != this.aClass251Array8113[this.anInt8175]) glLoadMatrixf(this.aClass101_Sub2Array8131[this.anInt8175]!!.method918(Class233.aFloatArray3015!!, 0), 0)
        else glLoadIdentity()
        if (i != 1) method3862(37, null)
        glMatrixMode(5888)
    }

    override fun method3925(i: Int, interface5_impl1: Interface5_Impl1?, i_17_: Int) {
        try {
            anInt9814++
            val i_18_ = 86 / ((i - -26) / 39)
            aClass285_Sub1Array9907!![i_17_] = (interface5_impl1 as Class285_Sub1?)!!
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.WB(" + i + ',' + (if (interface5_impl1 != null) "{...}" else "null") + ',' + i_17_ + ')'))
        }
    }

    override fun method3920(i: Int) {
        anInt9862++
        if (i != 10) method3911(null, 34, null)
        glTexEnvi(8960, 34161, Class348_Sub32.method3021(32.toByte(), (this.aClass229Array8086[(this.anInt8175)])))
    }

    override fun method3665(i: Int, i_19_: Int): Interface3? {
        anInt9891++
        return null
    }

    override fun method3819(i: Byte) {
        anInt9887++
        val i_20_ = this.anIntArray9927!![this.anInt8175]
        if (i_20_ != 0) {
            this.anIntArray9927!![this.anInt8175] = 0
            glBindTexture(i_20_, 0)
            glDisable(i_20_)
        }
        if (i >= -19) aLong9906 = 83L
    }

    override fun method3882(i: Byte) {
        anInt9874++
        for (i_21_ in -1 + this.anInt8090 downTo 0) {
            glActiveTexture(i_21_ + 33984)
            glTexEnvi(8960, 8704, 34160)
            glTexEnvi(8960, 34161, 8448)
            glTexEnvi(8960, 34178, 34166)
            glTexEnvi(8960, 34162, 8448)
            glTexEnvi(8960, 34186, 34166)
        }
        glTexEnvi(8960, 34186, 34168)
        glShadeModel(7425)
        glClearDepth(1.0f)
        glDepthFunc(515)
        glPolygonMode(1028, 6914)
        glEnable(2884)
        glCullFace(1029)
        glAlphaFunc(516, 0.0f)
        glMatrixMode(5888)
        glLoadIdentity()
        glColorMaterial(1028, 5634)
        glEnable(2903)
        val fs = floatArrayOf(0.0f, 0.0f, 0.0f, 1.0f)
        var i_22_ = 0
        if (i < 45) anInt9925 = 51
        while ( /**/i_22_ < 8) {
            val i_23_ = i_22_ + 16384
            glLightfv(i_23_, 4608, fs, 0)
            glLightf(i_23_, 4615, 0.0f)
            glLightf(i_23_, 4616, 0.0f)
            i_22_++
        }
        glFogf(2914, 0.95f)
        glFogi(2917, 9729)
        glHint(3156, 4353)
        anOpenGL9856!!.setSwapInterval(0)
        super.method3882(122.toByte())
    }

    override fun method3827(i: Byte) {
        anInt9879++
        if (this.aBoolean8148 && this.aBoolean8123 && this.anInt8091 >= 0) glEnable(2912)
        else glDisable(2912)
        if (i > -30) ya()
    }

    override fun method3634(interface3: Interface3?, interface13: Interface13?): Interface4? {
        try {
            anInt9897++
            return null
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.NB(" + (if (interface3 != null) "{...}" else "null") + ',' + (if (interface13 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3876(i: Int, canvas: Canvas?): Any {
        try {
            anInt9894++
            if (i != -1) GA(-118)
            val l = anOpenGL9856!!.prepareSurface(canvas)
            if (l == -1L) throw RuntimeException()
            return l
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.MC(" + i + ',' + (if (canvas != null) "{...}" else "null") + ')'))
        }
    }

    override fun c(): Class365 {
        anInt9843++
        var i = -1
        if (aString9917.indexOf("nvidia") != -1) i = 4318
        else if (aString9917.indexOf("intel") != -1) i = 32902
        else if (aString9917.indexOf("ati") != -1) i = 4098
        return Class365(i, "OpenGL", anInt9924, aString9916, 0L)
    }

    override fun method3706(class299: Class299?, class299_24_: Class299?, f: Float, class299_25_: Class299?): Class299? {
        try {
            anInt9873++
            if (f < 0.5f) return class299
            return class299_24_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.SD(" + (if (class299 != null) "{...}" else "null") + ',' + (if (class299_24_ != null) "{...}" else "null") + ',' + f + ',' + (if (class299_25_ != null) "{...}" else "null") + ')'))
        }
    }

    @Synchronized
    fun method3969(i: Int, i_26_: Int, i_27_: Int) {
        if (i_27_ != 3089) this.anIntArray9927 = null
        anInt9850++
        val class348_sub35 = Class348_Sub35(i)
        class348_sub35.aLong4291 = i_26_.toLong()
        aClass262_9899!!.method1999(class348_sub35, i_27_ xor 0x42c2.inv())
    }

    override fun method3842(bool: Boolean) {
        RuntimeException_Sub1.aFloatArray4602!![2] = this.aFloat8168 * this.aFloat8174
        RuntimeException_Sub1.aFloatArray4602!![3] = 1.0f
        RuntimeException_Sub1.aFloatArray4602!![0] = this.aFloat8180 * this.aFloat8174
        anInt9825++
        RuntimeException_Sub1.aFloatArray4602!![1] = this.aFloat8087 * this.aFloat8174
        glLightfv(16384, 4609, RuntimeException_Sub1.aFloatArray4602, 0)
        RuntimeException_Sub1.aFloatArray4602!![0] = this.aFloat8180 * -this.aFloat8186
        RuntimeException_Sub1.aFloatArray4602!![2] = -this.aFloat8186 * this.aFloat8168
        if (bool == true) {
            RuntimeException_Sub1.aFloatArray4602!![3] = 1.0f
            RuntimeException_Sub1.aFloatArray4602!![1] = -this.aFloat8186 * this.aFloat8087
            glLightfv(16385, 4609, RuntimeException_Sub1.aFloatArray4602, 0)
        }
    }

    private fun method3970(i: Int) {
        if (aBoolean9911) glPopMatrix()
        anInt9840++
        if (i != 1) method3950(69)
        if (this.aClass196_8184.method1450(-98)) {
            if (!aBoolean9914) {
                glLoadMatrixf(this.aClass101_Sub2_8083.method918(Class233.aFloatArray3015!!, 0), 0)
                aBoolean9914 = true
                method3892(0)
                method3823((-104).toByte())
            }
            if (!this.aBoolean8069) {
                glPushMatrix()
                glMultMatrixf(this.aClass101_Sub2_8074.method918(Class233.aFloatArray3015!!, i xor 0x1), 0)
                aBoolean9911 = true
            } else aBoolean9911 = false
        } else if (this.aBoolean8069) {
            glLoadIdentity()
            aBoolean9911 = false
        } else {
            glLoadMatrixf(this.aClass101_Sub2_8074.method918(Class233.aFloatArray3015!!, 0), 0)
            aBoolean9911 = false
        }
    }

    override fun method3652() {
        super.method3652()
        anInt9868++
        if (anOpenGL9856 != null) {
            anOpenGL9856!!.a()
            anOpenGL9856!!.release()
            anOpenGL9856 = null
        }
    }

    override fun method3851(i: Int) {
        if (i != 25644) this.aBoolean9921 = false
        anInt9871++
        this.aFloat8115 = (this.anInt8154 + -this.anInt8105).toFloat()
        this.aFloat8173 = (-this.anInt8091.toFloat() + this.aFloat8115)
        if (this.aFloat8173 < this.anInt8095.toFloat()) this.aFloat8173 = this.anInt8095.toFloat()
        glFogf(2915, this.aFloat8173)
        glFogf(2916, this.aFloat8115)
        RuntimeException_Sub1.aFloatArray4602!![2] = (Class139.method1166(this.anInt8144, 255).toFloat() / 255.0f)
        RuntimeException_Sub1.aFloatArray4602!![0] = (Class139.method1166(16711680, this.anInt8144).toFloat() / 1.671168E7f)
        RuntimeException_Sub1.aFloatArray4602!![1] = (Class139.method1166(65280, this.anInt8144).toFloat() / 65280.0f)
        glFogfv(2918, RuntimeException_Sub1.aFloatArray4602, 0)
    }

    override fun method3671(): Boolean {
        anInt9829++
        return false
    }

    override fun method3883(i: Int) {
        if (!this.aBoolean8145 || this.aBoolean8149) glDisable(2896)
        else glEnable(2896)
        anInt9818++
        val i_28_ = -61 / ((i - 20) / 36)
    }

    override fun method3921(i: Int) {
        anInt9824++
        if (i == 1) {
            if (!this.aBoolean8209) glDisable(3089)
            else glEnable(3089)
        }
    }

    override fun method3937(i: Byte) {
        if (i.toInt() != -33) method3832(35, (-122).toByte())
        glViewport(this.anInt8181, this.anInt8109, this.anInt7931, this.anInt7962)
        anInt9827++
    }

    override fun method3658(i: Int, i_29_: Int, i_30_: Int, i_31_: Int) {
        anInt9833++
    }

    init {
        try {
            try {
                anOpenGL9856 = opengl
                anOpenGL9856!!.b()
                aString9917 = glGetString(7936).lowercase(Locale.getDefault())
                aString9916 = glGetString(7937).lowercase(Locale.getDefault())
                if (aString9917.indexOf("microsoft") != -1 || aString9917.indexOf("brian paul") != -1 || aString9917.indexOf("mesa") != -1) throw RuntimeException("")
                val string = glGetString(7938)
                val strings = Class348_Sub40_Sub23.method3113(' ', true, string.replace('.', ' '))
                if (strings.size < 2) throw RuntimeException("")
                try {
                    val i_32_ = Class348_Sub41.method3156(true, strings!![0]!!)
                    val i_33_ = Class348_Sub41.method3156(true, strings!![1]!!)
                    anInt9924 = i_32_ * 10 - -i_33_
                } catch (numberformatexception: NumberFormatException) {
                    throw RuntimeException("")
                }
                if (anInt9924 < 12) throw RuntimeException("")
                if (!anOpenGL9856!!.a("GL_ARB_multitexture")) throw RuntimeException("")
                if (!anOpenGL9856!!.a("GL_ARB_texture_env_combine")) throw RuntimeException("")
                val `is` = IntArray(1)
                glGetIntegerv(34018, `is`, 0)
                this.anInt8090 = `is`[0]
                if (this.anInt8090 < 2) throw RuntimeException("")
                this.anInt8138 = 8
                this.aBoolean9920 = anOpenGL9856!!.a("GL_ARB_vertex_buffer_object")
                this.aBoolean8182 = anOpenGL9856!!.a("GL_ARB_multisample")
                aBoolean9919 = anOpenGL9856!!.a("GL_ARB_texture_rectangle")
                this.aBoolean8101 = anOpenGL9856!!.a("GL_ARB_texture_cube_map")
                aBoolean9926 = anOpenGL9856!!.a("GL_ARB_texture_non_power_of_two")
                this.aBoolean8159 = anOpenGL9856!!.a("GL_EXT_texture3D")
                this.aBoolean9921 = anOpenGL9856!!.a("GL_ARB_vertex_shader")
                this.aBoolean9923 = anOpenGL9856!!.a("GL_ARB_vertex_program")
                this.aBoolean9922 = anOpenGL9856!!.a("GL_ARB_fragment_shader")
                anOpenGL9856!!.a("GL_ARB_fragment_program")
                this.anIntArray9927 = IntArray(this.anInt8090)
                this.anInt9918 = if (Stream.c()) 33639 else 5121
                if (aString9916!!.indexOf("radeon") != -1) {
                    var i_34_ = 0
                    var bool = false
                    var bool_35_ = false
                    val strings_36_ = (Class348_Sub40_Sub23.method3113(' ', true, aString9916!!.replace('/', ' ')))
                    var i_37_ = 0
                    while ((i_37_ < strings_36_.size)) {
                        var string_38_ = strings_36_[i_37_]!!
                        try {
                            if (string_38_.length > 0) {
                                if (string_38_.get(0) == 'x' && string_38_.length >= 3 && (Class50_Sub3.method468(string_38_.substring(1, 3), -115))) {
                                    bool_35_ = true
                                    string_38_ = string_38_.substring(1)
                                }
                                if (string_38_ == "hd") bool = true
                                else {
                                    if (string_38_.startsWith("hd")) {
                                        bool = true
                                        string_38_ = string_38_.substring(2)
                                    }
                                    if (string_38_.length >= 4 && (Class50_Sub3.method468(string_38_.substring(0, 4), 92))) {
                                        i_34_ = (Class348_Sub41.method3156(true, string_38_.substring(0, 4)))
                                        break
                                    }
                                }
                            }
                        } catch (exception: Exception) {
                            /* empty */
                        }
                        i_37_++
                    }
                    if (!bool_35_ && !bool) {
                        if (i_34_ >= 7000 && i_34_ <= 7999) this.aBoolean9920 = false
                        if (i_34_ >= 7000 && i_34_ <= 9250) this.aBoolean8159 = false
                    }
                    aBoolean9919 = aBoolean9919 and anOpenGL9856!!.a("GL_ARB_half_float_pixel")
                }
                aString9917.indexOf("intel")
                if (this.aBoolean9920) {
                    try {
                        val is_39_ = IntArray(1)
                        glGenBuffersARB(1, is_39_, 0)
                    } catch (throwable: Throwable) {
                        throw RuntimeException("")
                    }
                }
            } catch (throwable: Throwable) {
                throwable.printStackTrace()
                this.method3635((-28).toByte())
                throw RuntimeException("")
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.<init>(" + (if (opengl != null) "{...}" else "null") + ',' + (if (canvas != null) "{...}" else "null") + ',' + l + ',' + (if (var_d != null) "{...}" else "null") + ',' + (if (class45 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    override fun method3938(class21: Class21?, i: Int, interface5_impl2: Interface5_Impl2?, i_40_: Int, i_41_: Int, i_42_: Int, i_43_: Int) {
        try {
            if (i_43_ <= 46) aClass262_9903 = null
            anInt9867++
            val i_44_: Int
            val i_45_: Int
            if (Class249.aClass21_3217 == class21) {
                i_44_ = 1
                i_45_ = i * 2
            } else if (class21 == Class348_Sub5_Sub1.aClass21_8832) {
                i_45_ = 1 + i
                i_44_ = 3
            } else if (class21 == Class247.aClass21_3181) {
                i_44_ = 4
                i_45_ = i * 3
            } else if (Class348_Sub42_Sub16.aClass21_9661 == class21) {
                i_44_ = 6
                i_45_ = 2 + i
            } else if (class21 == s_Sub3.aClass21_8320) {
                i_45_ = 2 + i
                i_44_ = 5
            } else {
                i_45_ = i
                i_44_ = 0
            }
            val class68 = interface5_impl2!!.method25(51.toByte())
            val class285_sub2 = interface5_impl2 as Class285_Sub2
            class285_sub2.method2125(0)
            glDrawElements(i_44_, i_45_, Class130.method1128(-20, class68), (class285_sub2.method2122(27819) + (i_41_ * (class68!!.anInt1178)).toLong()))
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.JC(" + (if (class21 != null) "{...}" else "null") + ',' + i + ',' + (if (interface5_impl2 != null) "{...}" else "null") + ',' + i_40_ + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ')'))
        }
    }

    override fun method3823(i: Byte) {
        anInt9812++
        val i_46_ = -79 / ((i - -39) / 62)
        this.method3942(5)
        var i_47_: Int
        i_47_ = 0
        while (this.anInt8151 > i_47_) {
            val class348_sub1 = this.aClass348_Sub1Array8132[i_47_]!!
            val i_48_ = class348_sub1.method2720(-1)
            val i_49_ = i_47_ + 16386
            val f = class348_sub1.method2721(-37) / 255.0f
            RuntimeException_Sub1.aFloatArray4602!![0] = class348_sub1.method2724(-1).toFloat()
            RuntimeException_Sub1.aFloatArray4602!![1] = class348_sub1.method2722(124).toFloat()
            RuntimeException_Sub1.aFloatArray4602!![2] = class348_sub1.method2717(111.toByte()).toFloat()
            RuntimeException_Sub1.aFloatArray4602!![3] = 1.0f
            glLightfv(i_49_, 4611, RuntimeException_Sub1.aFloatArray4602, 0)
            RuntimeException_Sub1.aFloatArray4602!![2] = Class139.method1166(255, i_48_).toFloat() * f
            RuntimeException_Sub1.aFloatArray4602!![1] = f * (Class139.method1166(i_48_, 65338) shr 8).toFloat()
            RuntimeException_Sub1.aFloatArray4602!![0] = Class139.method1166(255, i_48_ shr 16).toFloat() * f
            RuntimeException_Sub1.aFloatArray4602!![3] = 1.0f
            glLightfv(i_49_, 4609, RuntimeException_Sub1.aFloatArray4602, 0)
            glLightf(i_49_, 4617, 1.0f / (class348_sub1.method2723(-1) * class348_sub1.method2723(-1)).toFloat())
            glEnable(i_49_)
            i_47_++
        }
        while ( /**/i_47_ < this.anInt8122) {
            glDisable(16386 - -i_47_)
            i_47_++
        }
        super.method3823(107.toByte())
    }

    override fun method3844(i: Int, canvas: Canvas?, `object`: Any?) {
        try {
            if (i != 12727) anInt9925 = 5
            anInt9821++
            val var_long = `object` as Long
            anOpenGL9856!!.surfaceResized(var_long)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.FC(" + i + ',' + (if (canvas != null) "{...}" else "null") + ',' + (if (`object` != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3633() {
        glFinish()
        anInt9876++
    }

    override fun method3931(bool: Boolean, class304: Class304?, class68: Class68?): Boolean {
        try {
            if (bool != true) aClass262_9905 = null
            anInt9855++
            return true
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.RA(" + bool + ',' + (if (class304 != null) "{...}" else "null") + ',' + (if (class68 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3899(i: Int, i_50_: Int, class21: Class21?, bool: Boolean) {
        try {
            anInt9854++
            if (bool != true) this.aBoolean9921 = true
            val i_51_: Int
            val i_52_: Int
            if (class21 == Class249.aClass21_3217) {
                i_51_ = 2 * i
                i_52_ = 1
            } else if (Class348_Sub5_Sub1.aClass21_8832 == class21) {
                i_51_ = i - -1
                i_52_ = 3
            } else if (Class247.aClass21_3181 == class21) {
                i_52_ = 4
                i_51_ = i * 3
            } else if (class21 == Class348_Sub42_Sub16.aClass21_9661) {
                i_52_ = 6
                i_51_ = 2 + i
            } else if (s_Sub3.aClass21_8320 == class21) {
                i_51_ = 2 + i
                i_52_ = 5
            } else {
                i_51_ = i
                i_52_ = 0
            }
            glDrawArrays(i_52_, i_50_, i_51_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.V(" + i + ',' + i_50_ + ',' + (if (class21 != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    override fun method3900(`is`: Array<IntArray?>?, bool: Boolean, i: Int, i_53_: Int): Interface18_Impl2 {
        try {
            if (i <= 1) aClass262_9902 = null
            anInt9883++
            return Class14_Sub2(this, i_53_, bool, `is`)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.HB(" + (if (`is` != null) "{...}" else "null") + ',' + bool + ',' + i + ',' + i_53_ + ')'))
        }
    }

    override fun method3855(class304: Class304?, i: Int, i_54_: Int, fs: FloatArray?, bool: Boolean, i_55_: Int, i_56_: Int, i_57_: Int): Interface18_Impl3 {
        try {
            anInt9890++
            if (!aBoolean9926 && (!Class192.method1436(60, i) || !Class192.method1436(-73, i_57_))) {
                if (aBoolean9919) return Class14_Sub4(this, class304, i, i_57_, fs, i_54_, i_55_)
                val class14_sub1 = Class14_Sub1(this, class304, Class68.aClass68_1187, Class33.method340(i, 108.toByte()), Class33.method340(i_57_, 108.toByte()))
                class14_sub1.method240(i_55_, (-126).toByte(), fs, class304, 0, i_54_, 0, i, i_57_)
                return class14_sub1
            }
            return Class14_Sub1(this, class304, i, i_57_, bool, fs, i_54_, i_55_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.WC(" + (if (class304 != null) "{...}" else "null") + ',' + i + ',' + i_54_ + ',' + (if (fs != null) "{...}" else "null") + ',' + bool + ',' + i_55_ + ',' + i_56_ + ',' + i_57_ + ')'))
        }
    }

    override fun method3666(): Boolean {
        anInt9881++
        return false
    }

    override fun method3832(i: Int, i_58_: Byte): Class367? {
        anInt9900++
        if (i_58_ >= -57) method3832(-96, 20.toByte())
        val i_59_ = i
        while_237_@ do {
            do {
                if (i_59_ != 3) {
                    if (i_59_ != 4) {
                        if (i_59_ == 8) break
                        break@while_237_
                    }
                } else return Class367_Sub11(this, this.aClass45_8039)
                return Class367_Sub2(this, this.aClass45_8039, this.aClass269_7937)
            } while (false)
            return Class367_Sub9(this, this.aClass45_8039, this.aClass269_7937)
        } while (false)
        return super.method3832(i, (-73).toByte())
    }

    override fun method3830(i: Int, `is`: IntArray?, bool: Boolean, i_60_: Byte, i_61_: Int, i_62_: Int, i_63_: Int): Interface18_Impl3 {
        try {
            val i_64_ = 101 / ((i_60_ - -21) / 46)
            anInt9830++
            if (aBoolean9926 || Class192.method1436(103, i) && Class192.method1436(-53, i_63_)) return Class14_Sub1(this, i, i_63_, bool, `is`, i_61_, i_62_)
            if (!aBoolean9919) {
                val class14_sub1 = Class14_Sub1(this, Class108.aClass304_1662, Class68.aClass68_1183, Class33.method340(i, 108.toByte()), Class33.method340(i_63_, 108.toByte()))
                class14_sub1.method68(i_62_, 22809, `is`, 0, i_61_, i, 0, i_63_)
                return class14_sub1
            }
            return Class14_Sub4(this, i, i_63_, `is`, i_61_, i_62_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.R(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + bool + ',' + i_60_ + ',' + i_61_ + ',' + i_62_ + ',' + i_63_ + ')'))
        }
    }

    override fun F(i: Int, i_65_: Int) {
        anInt9848++
    }

    @Throws(Exception_Sub1::class)
    override fun method3626(i: Int, i_66_: Int) {
        anOpenGL9856!!.swapBuffers()
        anInt9857++
    }

    override fun method3673() {
        anInt9892++
        if (this.anInt7931 > 0 || this.anInt7962 > 0) {
            val i = this.anInt8106
            val i_67_ = this.anInt8183
            val i_68_ = this.anInt8165
            val i_69_ = this.anInt8096
            this.la()
            glReadBuffer(1028)
            glDrawBuffer(1029)
            this.method3932((-107).toByte())
            this.method3838(true, false)
            this.method3866(false, true)
            this.method3890(false, 127.toByte())
            this.method3946(-32, false)
            this.method3850(110.toByte(), null)
            this.method3814(false, false, -2, 42.toByte())
            this.method3923(true, 1)
            this.method3817(117, 0)
            glMatrixMode(5889)
            glLoadIdentity()
            glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0)
            glMatrixMode(5888)
            glLoadIdentity()
            glRasterPos2i(0, 0)
            glCopyPixels(0, 0, this.anInt7931, this.anInt7962, 6144)
            glFlush()
            glReadBuffer(1029)
            glDrawBuffer(1029)
            this.KA(i, i_68_, i_67_, i_69_)
        }
    }

    override fun method3947(i: Int) {
        if (i != 4) method3950(-83)
        if (!this.aBoolean8116) glDisable(3042)
        else glEnable(3042)
        anInt9878++
    }

    @Synchronized
    fun method3971(i: Int, i_70_: Int) {
        anInt9819++
        val class348 = Class348()
        class348.aLong4291 = i_70_.toLong()
        aClass262_9904.method1999(class348, -20180)
        if (i != 16386) method3928(-86)
    }

    override fun method3859(i: Int) {
        if (this.aBoolean8164) glEnable(2929)
        else glDisable(2929)
        if (i != 3) method3937((-23).toByte())
        anInt9828++
    }

    override fun method3829(class70: Class70?, i: Int, i_71_: Byte, bool: Boolean) {
        try {
            if (i_71_.toInt() == 80) {
                glTexEnvi(8960, i + 34184, Class57.method531(123.toByte(), class70))
                anInt9885++
                glTexEnvi(8960, 34200 + i, if (bool) 771 else 770)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.AD(" + (if (class70 != null) "{...}" else "null") + ',' + i + ',' + i_71_ + ',' + bool + ')'))
        }
    }

    @Throws(Exception_Sub1::class)
    override fun method3707(rectangles: Array<Rectangle?>?, i: Int, i_72_: Int, i_73_: Int) {
        try {
            anInt9823++
            method3626(i_72_, i_73_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.UA(" + (if (rectangles != null) "{...}" else "null") + ',' + i + ',' + i_72_ + ',' + i_73_ + ')'))
        }
    }

    override fun method3862(i: Int, class130: Class130?) {
        try {
            anInt9866++
            val class58s = (class130 as Class130_Sub1).aClass58Array5801
            var i_74_ = 0
            var bool = false
            var bool_75_ = false
            var bool_76_ = false
            for (i_77_ in i..<class58s.size) {
                val class58 = class58s[i_77_]
                val class285_sub1 = aClass285_Sub1Array9907!![i_77_]!!
                var i_78_ = 0
                val i_79_ = class285_sub1.method2130(3545)
                val l = class285_sub1.method2122(27819)
                class285_sub1.method2125(0)
                var i_80_ = 0
                while ((i_80_ < class58.method538((-119).toByte()))) {
                    val class325 = class58.method537(i_80_, -119)!!
                    if (class325 == Class325.aClass325_4073) {
                        glVertexPointer(3, 5126, i_79_, i_78_.toLong() + l)
                        bool_76_ = true
                    } else if (Class325.aClass325_4075 == class325) {
                        bool_75_ = true
                        glNormalPointer(5126, i_79_, i_78_.toLong() + l)
                    } else if (class325 == Class325.aClass325_4076) {
                        glColorPointer(4, 5121, i_79_, i_78_.toLong() + l)
                        bool = true
                    } else if (Class325.aClass325_4077 == class325) {
                        glClientActiveTexture(33984 + i_74_++)
                        glTexCoordPointer(1, 5126, i_79_, i_78_.toLong() + l)
                    } else if (Class325.aClass325_4078 == class325) {
                        glClientActiveTexture(i_74_++ + 33984)
                        glTexCoordPointer(2, 5126, i_79_, i_78_.toLong() + l)
                    } else if (Class325.aClass325_4079 == class325) {
                        glClientActiveTexture(i_74_++ + 33984)
                        glTexCoordPointer(3, 5126, i_79_, i_78_.toLong() + l)
                    } else if (class325 == Class325.aClass325_4080) {
                        glClientActiveTexture(33984 - -i_74_++)
                        glTexCoordPointer(4, 5126, i_79_, l + i_78_.toLong())
                    }
                    i_78_ += class325.anInt4069
                    i_80_++
                }
            }
            if (aBoolean9910 != bool_76_) {
                if (bool_76_) glEnableClientState(32884)
                else glDisableClientState(32884)
                aBoolean9910 = bool_76_
            }
            if (aBoolean9912 == !bool_75_) {
                if (bool_75_) glEnableClientState(32885)
                else glDisableClientState(32885)
                aBoolean9912 = bool_75_
            }
            if (!bool != !aBoolean9908) {
                if (!bool) glDisableClientState(32886)
                else glEnableClientState(32886)
                aBoolean9908 = bool
            }
            if (i_74_ <= anInt9909) {
                if (anInt9909 > i_74_) {
                    var i_81_ = i_74_
                    while (anInt9909 > i_81_) {
                        glClientActiveTexture(i_81_ + 33984)
                        glDisableClientState(32888)
                        i_81_++
                    }
                    anInt9909 = i_74_
                }
            } else {
                for (i_82_ in anInt9909..<i_74_) {
                    glClientActiveTexture(33984 - -i_82_)
                    glEnableClientState(32888)
                }
                anInt9909 = i_74_
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.KC(" + i + ',' + (if (class130 != null) "{...}" else "null") + ')'))
        }
    }

    override fun b(i: Int, i_83_: Int, i_84_: Int, i_85_: Int, d: Double) {
        anInt9859++
    }

    override fun method3840(i: Int, bool: Boolean): Interface5_Impl2? {
        anInt9826++
        if (i != -28633) return null
        return Class285_Sub2(this, Class68.aClass68_1184, bool)
    }

    override fun I(): Int {
        anInt9845++
        return anInt9925
    }

    override fun method3868(bool: Boolean) {
        if (bool != false) aBoolean9919 = false
        glActiveTexture(33984 + this.anInt8175)
        anInt9838++
    }

    override fun method3898(i: Int) {
        if (i != 12) anInt9924 = 75
        anInt9842++
        aBoolean9914 = false
        method3970(1)
    }

    override fun method3700(f: Float, f_86_: Float, f_87_: Float) {
        anInt9895++
    }

    override fun method3911(canvas: Canvas?, i: Int, `object`: Any?) {
        try {
            anInt9822++
            val var_long = `object` as Long
            if (i != 1) this.anInt9918 = -120
            anOpenGL9856!!.releaseSurface(canvas, var_long)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.QD(" + (if (canvas != null) "{...}" else "null") + ',' + i + ',' + (if (`object` != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3945(i: Int) {
        RuntimeException_Sub1.aFloatArray4602!![1] = (Class139.method1166(65280, this.anInt8119).toFloat() / 65280.0f)
        RuntimeException_Sub1.aFloatArray4602!![2] = (Class139.method1166(255, this.anInt8119).toFloat() / 255.0f)
        RuntimeException_Sub1.aFloatArray4602!![3] = (this.anInt8119 ushr 24).toFloat() / 255.0f
        anInt9889++
        RuntimeException_Sub1.aFloatArray4602!![0] = (Class139.method1166(16711680, this.anInt8119).toFloat() / 1.671168E7f)
        if (i >= -107) anInt9909 = -64
        glTexEnvfv(8960, 8705, RuntimeException_Sub1.aFloatArray4602, 0)
    }

    override fun method3892(i: Int) {
        anInt9865++
        glLightfv(16384, 4611, this.aFloatArray8170, i)
        glLightfv(16385, 4611, this.aFloatArray8102, 0)
    }

    override fun GA(i: Int) {
        glClearColor((0xff0000 and i).toFloat() / 1.671168E7f, (0xff00 and i).toFloat() / 65280.0f, (i and 0xff).toFloat() / 255.0f, (i ushr 24).toFloat() / 255.0f)
        anInt9835++
        glClear(16384)
    }

    override fun method3672() {
        anInt9851++
    }

    override fun method3939(i: Byte) {
        if (this.aBoolean8141) glEnable(3008)
        else glDisable(3008)
        if (i.toInt() == 100) anInt9858++
    }

    override fun method3710() {
        anInt9872++
    }

    override fun method3861(i: Int, i_88_: Byte, i_89_: Int, class68: Class68?, class304: Class304?): Interface18_Impl3 {
        try {
            if (i_88_.toInt() != -84) method3842(false)
            anInt9882++
            if (aBoolean9926 || (Class192.method1436(i_88_ + 15, i_89_) && Class192.method1436(65, i))) return Class14_Sub1(this, class304, class68, i_89_, i)
            if (!aBoolean9919) return Class14_Sub1(this, class304, class68, Class33.method340(i_89_, 108.toByte()), Class33.method340(i, 108.toByte()))
            return Class14_Sub4(this, class304, class68, i_89_, i)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bga.NC(" + i + ',' + i_88_ + ',' + i_89_ + ',' + (if (class68 != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3698() {
        anInt9863++
    }

    override fun method3888(i: Int) {
        if (i != 6259) aClass285_Sub1Array9907 = null
        anInt9817++
        glScissor(this.anInt8181 - -this.anInt8106, -this.anInt8096 + (this.anInt8109 - -this.anInt7962), -this.anInt8106 + this.anInt8183, this.anInt8096 - this.anInt8165)
    }

    override fun method3647(bool: Boolean) {
        anInt9813++
    }

    override fun method3950(i: Int) {
        anInt9886++
        if (Class348_Sub4.aClass173_6602 == this.aClass173_8163) glBlendFunc(770, 771)
        else if (Class69.aClass173_1201 == this.aClass173_8163) glBlendFunc(1, 1)
        else if (Class273.aClass173_5169 == this.aClass173_8163) glBlendFunc(774, 1)
        if (i != 0) this.anInt9918 = 74
    }

    override fun method3889(bool: Boolean, i: Int): Interface5_Impl1 {
        anInt9815++
        return Class285_Sub1(this, bool)
    }

    override fun method3858(bool: Boolean): Float {
        anInt9877++
        if (bool != false) method3935(45)
        return 0.0f
    }

    override fun na(i: Int, i_90_: Int, i_91_: Int, i_92_: Int): IntArray {
        anInt9820++
        val `is` = IntArray(i_92_ * i_91_)
        for (i_93_ in 0..<i_92_) glReadPixelsi(i, (-1 + (-i_93_ + -i_90_) + this.anInt7962), i_91_, 1, 32993, this.anInt9918, `is`, i_91_ * i_93_)
        return `is`
    }

    override fun method3687(interface4: Interface4?) {
        try {
            anInt9816++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "bga.IA(" + (if (interface4 != null) "{...}" else "null") + ')')
        }
    }

    companion object {
        @JvmField
        var anInt9812: Int = 0
        @JvmField
        var anInt9813: Int = 0
        @JvmField
        var anInt9814: Int = 0
        @JvmField
        var anInt9815: Int = 0
        @JvmField
        var anInt9816: Int = 0
        @JvmField
        var anInt9817: Int = 0
        @JvmField
        var anInt9818: Int = 0
        @JvmField
        var anInt9819: Int = 0
        @JvmField
        var anInt9820: Int = 0
        @JvmField
        var anInt9821: Int = 0
        @JvmField
        var anInt9822: Int = 0
        @JvmField
        var anInt9823: Int = 0
        @JvmField
        var anInt9824: Int = 0
        @JvmField
        var anInt9825: Int = 0
        @JvmField
        var anInt9826: Int = 0
        @JvmField
        var anInt9827: Int = 0
        @JvmField
        var anInt9828: Int = 0
        @JvmField
        var anInt9829: Int = 0
        @JvmField
        var anInt9830: Int = 0
        @JvmField
        var anInt9831: Int = 0
        @JvmField
        var anInt9832: Int = 0
        @JvmField
        var anInt9833: Int = 0
        @JvmField
        var anInt9834: Int = 0
        @JvmField
        var anInt9835: Int = 0
        @JvmField
        var anInt9836: Int = 0
        @JvmField
        var anInt9837: Int = 0
        @JvmField
        var anInt9838: Int = 0
        @JvmField
        var anInt9839: Int = 0
        @JvmField
        var anInt9840: Int = 0
        @JvmField
        var anInt9841: Int = 0
        @JvmField
        var anInt9842: Int = 0
        @JvmField
        var anInt9843: Int = 0
        @JvmField
        var anInt9844: Int = 0
        @JvmField
        var anInt9845: Int = 0
        @JvmField
        var anInt9846: Int = 0
        @JvmField
        var anInt9847: Int = 0
        @JvmField
        var anInt9848: Int = 0
        @JvmField
        var anInt9849: Int = 0
        @JvmField
        var anInt9850: Int = 0
        @JvmField
        var anInt9851: Int = 0
        @JvmField
        var anInt9852: Int = 0
        @JvmField
        var anInt9853: Int = 0
        @JvmField
        var anInt9854: Int = 0
        @JvmField
        var anInt9855: Int = 0
        @JvmField
        var anInt9857: Int = 0
        @JvmField
        var anInt9858: Int = 0
        @JvmField
        var anInt9859: Int = 0
        @JvmField
        var aClass138_9860: Class138? = Class138(15, 0, 1, 0)
        @JvmField
        var anInt9861: Int = 0
        @JvmField
        var anInt9862: Int = 0
        @JvmField
        var anInt9863: Int = 0
        @JvmField
        var anInt9864: Int = 0
        @JvmField
        var anInt9865: Int = 0
        @JvmField
        var anInt9866: Int = 0
        @JvmField
        var anInt9867: Int = 0
        @JvmField
        var anInt9868: Int = 0
        @JvmField
        var anInt9870: Int = 0
        @JvmField
        var anInt9871: Int = 0
        @JvmField
        var anInt9872: Int = 0
        @JvmField
        var anInt9873: Int = 0
        @JvmField
        var anInt9874: Int = 0
        @JvmField
        var anInt9875: Int = 0
        @JvmField
        var anInt9876: Int = 0
        @JvmField
        var anInt9877: Int = 0
        @JvmField
        var anInt9878: Int = 0
        @JvmField
        var anInt9879: Int = 0
        @JvmField
        var anInt9880: Int = 0
        @JvmField
        var anInt9881: Int = 0
        @JvmField
        var anInt9882: Int = 0
        @JvmField
        var anInt9883: Int = 0
        @JvmField
        var anInt9884: Int = 0
        @JvmField
        var anInt9885: Int = 0
        @JvmField
        var anInt9886: Int = 0
        @JvmField
        var anInt9887: Int = 0
        @JvmField
        var anInt9888: Int = 0
        @JvmField
        var anInt9889: Int = 0
        @JvmField
        var anInt9890: Int = 0
        @JvmField
        var anInt9891: Int = 0
        @JvmField
        var anInt9892: Int = 0
        @JvmField
        var anInt9893: Int = 0
        @JvmField
        var anInt9894: Int = 0
        @JvmField
        var anInt9895: Int = 0
        @JvmField
        var anInt9896: Int = 0
        @JvmField
        var anInt9897: Int = 0
        @JvmField
        var anInt9898: Int = 0
        @JvmField
        var anInt9900: Int = 0
        @JvmStatic
        fun method3965(string: String?, i: Int, i_1_: Int) {
            try {
                anInt9841++
                val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, 105.toByte(), i_1_) //2
                class348_sub42_sub15.method3246(-25490)
                class348_sub42_sub15.aString9654 = string
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("bga.AA(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ')'))
            }
        }

        @JvmStatic
        fun method3968(i: Int) {
            val i_10_ = 69 % ((-67 - i) / 57)
            aClass138_9860 = null
        }
    }
}
