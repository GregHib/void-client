import RuntimeException_Sub1.Companion.method4009
import jaclib.memory.Buffer
import jaclib.memory.Stream
import jaclib.memory.heap.NativeHeap
import jaggl.OpenGL
import jaggl.OpenGL.Companion.glActiveTexture
import jaggl.OpenGL.Companion.glAlphaFunc
import jaggl.OpenGL.Companion.glBegin
import jaggl.OpenGL.Companion.glBindBufferARB
import jaggl.OpenGL.Companion.glBindTexture
import jaggl.OpenGL.Companion.glBlendFunc
import jaggl.OpenGL.Companion.glClear
import jaggl.OpenGL.Companion.glClearColor
import jaggl.OpenGL.Companion.glClearDepth
import jaggl.OpenGL.Companion.glColor4ub
import jaggl.OpenGL.Companion.glColorMask
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
import jaggl.OpenGL.Companion.glEnd
import jaggl.OpenGL.Companion.glFinish
import jaggl.OpenGL.Companion.glFlush
import jaggl.OpenGL.Companion.glFogf
import jaggl.OpenGL.Companion.glFogfv
import jaggl.OpenGL.Companion.glFogi
import jaggl.OpenGL.Companion.glGenBuffersARB
import jaggl.OpenGL.Companion.glGetFloatv
import jaggl.OpenGL.Companion.glGetIntegerv
import jaggl.OpenGL.Companion.glGetString
import jaggl.OpenGL.Companion.glHint
import jaggl.OpenGL.Companion.glLightModelfv
import jaggl.OpenGL.Companion.glLightf
import jaggl.OpenGL.Companion.glLightfv
import jaggl.OpenGL.Companion.glLineWidth
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glLoadMatrixf
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glMultMatrixf
import jaggl.OpenGL.Companion.glNormalPointer
import jaggl.OpenGL.Companion.glOrtho
import jaggl.OpenGL.Companion.glPointSize
import jaggl.OpenGL.Companion.glPolygonMode
import jaggl.OpenGL.Companion.glPopMatrix
import jaggl.OpenGL.Companion.glPushMatrix
import jaggl.OpenGL.Companion.glRasterPos2i
import jaggl.OpenGL.Companion.glReadBuffer
import jaggl.OpenGL.Companion.glReadPixelsi
import jaggl.OpenGL.Companion.glScissor
import jaggl.OpenGL.Companion.glShadeModel
import jaggl.OpenGL.Companion.glTexCoord2f
import jaggl.OpenGL.Companion.glTexCoordPointer
import jaggl.OpenGL.Companion.glTexEnvfv
import jaggl.OpenGL.Companion.glTexEnvi
import jaggl.OpenGL.Companion.glTranslatef
import jaggl.OpenGL.Companion.glVertex2f
import jaggl.OpenGL.Companion.glVertex2i
import jaggl.OpenGL.Companion.glVertex3f
import jaggl.OpenGL.Companion.glVertexPointer
import jaggl.OpenGL.Companion.glViewport
import java.awt.Canvas
import java.awt.Rectangle
import java.util.*
import kotlin.math.max
import kotlin.math.sqrt

public class ha_Sub2(canvas: Canvas?, var_d: d?, i: Int) : ha(var_d) {
    private var anInt7523 = 0
    private val aLong7553: Long
    private var aCanvas7575: Canvas? = null
    private val aHashtable7577: Hashtable<Any?, Any?> = Hashtable<Any?, Any?>()
    private var aCanvas7626: Canvas? = null
    private var aLong7636: Long = 0
    @JvmField
    var anInt7641: Int = 0
    private var anInt7645 = 0
    private var anOpenGL7664: OpenGL? = null
    var anInt7688: Int = 0
    private var aClass100_7707: Class100? = null
    private val aClass233_7711: Class233
    @JvmField
    var anInt7712: Int = 128
    @JvmField
    var anInt7713: Int = 0
    private val aClass18_7720: Class18?
    private var aClass348_Sub5_Sub1_7721: Class348_Sub5_Sub1? = null
    private val aClass354_7723: Class354
    private val aClass101_Sub3_7725: Class101_Sub3
    @JvmField
    var aClass101_Sub3_7729: Class101_Sub3?
    @JvmField
    var aNativeHeap7730: NativeHeap? = null
    @JvmField
    var anInt7731: Int
    private val aClass262_7732: Class262
    @JvmField
    var anInt7733: Int
    private var aBoolean7734: Boolean
    @JvmField
    var anInt7735: Int = 0
    @JvmField
    var aClass188_7736: Class188? = null
    private val anInterface11Array7737: Array<Interface11?>
    private var anInt7738: Int
    private val aClass206_7739: Class206? = null
    private var anInterface11_7740: Interface11? = null
    private val anInterface11Array7741: Array<Interface11?>
    private var anInt7742: Int
    private val anInterface11Array7743: Array<Interface11?>
    private var aClass105_Sub2_7744: Class105_Sub2? = null
    private var anInterface11_7745: Interface11? = null
    private var anInt7746: Int
    @JvmField
    var anInt7747: Int = 0
    @JvmField
    var anInt7748: Int = 0
    private val aClass262_7749: Class262
    private var anInt7750 = 0
    private var aClass262_7751: Class262?
    private val aClass262_7752: Class262
    private val aClass262_7753: Class262
    private val aClass262_7754: Class262
    private val aClass262_7755: Class262
    private val aClass262_7756: Class262
    private var aLong7757: Long = 0
    private var aBoolean7758 = false
    private var aBoolean7759 = false
    @JvmField
    var aClass101_Sub3_7760: Class101_Sub3
    private var aBoolean7761 = false
    private var anInt7762 = 0
    private var aBoolean7763 = false
    private var anInt7764 = 0
    private var anInt7765 = 0
    @JvmField
    var aClass101_Sub3_7766: Class101_Sub3
    @JvmField
    var aClass101_Sub3_7767: Class101_Sub3
    @JvmField
    var aFloat7768: Float = 0f
    private var aClass299_Sub1_7769: Class299_Sub1? = null
    private var anInt7770: Int
    @JvmField
    var anInt7771: Int
    @JvmField
    var anInt7772: Int = 0
    private var anInt7773: Int
    private val aBoolean7774: Boolean
    @JvmField
    var aBoolean7775: Boolean = false
    private var aClass258_Sub3_Sub1_7776: Class258_Sub3_Sub1? = null
    @JvmField
    var anInt7777: Int = 0
    @JvmField
    var aClass206_7778: Class206? = null
    private val aFloatArray7779: FloatArray
    @JvmField
    var aClass64_Sub3_7780: Class64_Sub3? = null
    @JvmField
    var aFloat7781: Float
    @JvmField
    var anInt7782: Int
    @JvmField
    var aBoolean7783: Boolean = false
    private var aBoolean7784 = false
    @JvmField
    var aClass64_Sub3_7785: Class64_Sub3? = null
    private var aFloat7786: Float
    private var anInt7787: Int
    @JvmField
    var anInt7788: Int = 0
    private var anInt7789 = 0
    private var aString7790: String? = null
    @JvmField
    var aBoolean7791: Boolean = false
    @JvmField
    var aFloat7792: Float = 0f
    @JvmField
    var aBoolean7793: Boolean = false
    @JvmField
    var anInt7794: Int
    @JvmField
    var anInt7795: Int = 0
    private var anInt7796 = 0
    private var anInterface2_7797: Interface2? = null
    @JvmField
    var aClass348_Sub49_Sub1_7798: Class348_Sub49_Sub1?
    private var anInt7799 = 0
    private var aFloat7800: Float
    private var aBoolean7801 = false
    @JvmField
    var aClass64_Sub3_7802: Class64_Sub3? = null
    @JvmField
    var aClass64_Sub3_7803: Class64_Sub3? = null
    private var anInt7804: Int
    private var aBoolean7805 = false
    @JvmField
    var anInt7806: Int
    @JvmField
    var aBoolean7807: Boolean = false
    private var anInt7808: Int
    @JvmField
    var anInt7809: Int
    @JvmField
    var anInt7810: Int
    private val aFloatArray7811: FloatArray
    @JvmField
    var anInt7812: Int = 0
    var anInt7813: Int
    private var anInt7814: Int
    @JvmField
    var aBoolean7815: Boolean = false
    @JvmField
    var aFloat7816: Float
    private var anInterface8_7817: Interface8? = null
    @JvmField
    var aBoolean7818: Boolean = false
    private var anInt7819 = 0
    @JvmField
    var aBoolean7820: Boolean = false
    @JvmField
    var aClass64_Sub3_7821: Class64_Sub3? = null
    private var aBoolean7822 = false
    @JvmField
    var aFloat7823: Float
    private var aFloat7824 = 0f
    @JvmField
    var aFloatArray7825: FloatArray
    @JvmField
    var anInt7826: Int
    @JvmField
    var aClass258_Sub3_7827: Class258_Sub3? = null
    private var aClass258Array7828: Array<Class258?>? = null
    private var aFloat7829: Float
    @JvmField
    var aFloat7830: Float = 0f
    @JvmField
    var aBoolean7831: Boolean = false
    @JvmField
    var aFloat7832: Float
    @JvmField
    var aClass123_7833: Class123? = null
    @JvmField
    var aClass64_Sub3_7834: Class64_Sub3? = null
    @JvmField
    var aFloat7835: Float = 0f
    @JvmField
    var aFloat7836: Float = 0f
    @JvmField
    var aBoolean7837: Boolean = false
    @JvmField
    var aClass64_Sub3_7838: Class64_Sub3? = null
    private var anInt7839 = 0
    @JvmField
    var aClass64_Sub3_7840: Class64_Sub3? = null
    @JvmField
    var aBoolean7841: Boolean = false
    private var aFloat7842 = 0f
    private var aBoolean7843 = false
    @JvmField
    var aClass64_Sub3_7844: Class64_Sub3? = null
    private var aString7845: String? = null
    @JvmField
    var aBoolean7846: Boolean = false
    @JvmField
    var aBoolean7847: Boolean = false
    @JvmField
    var anInt7848: Int
    @JvmField
    var aClass123_7849: Class123? = null
    private val aFloatArray7850: FloatArray
    private var aFloat7851: Float
    private var anInterface2_7852: Interface2? = null
    @JvmField
    var anInt7853: Int
    private var aFloat7854 = 0f
    private var anInt7855: Int
    var anInt7856: Int
    private var aFloat7857: Float
    private val aClass348_Sub1Array7858: Array<Class348_Sub1?>
    private var aBoolean7859: Boolean
    private var aBoolean7860 = false
    private var anInt7861: Int
    private var anInt7862 = 0
    @JvmField
    var aBoolean7863: Boolean = false
    @JvmField
    var aClass64_Sub3_7864: Class64_Sub3? = null
    private var anInt7865 = 0
    private var aBoolean7866 = false
    private var anInt7867: Int
    private var anInt7868: Int
    private var aBoolean7869 = false
    private var aBoolean7870: Boolean
    @JvmField
    var aFloat7871: Float
    @JvmField
    var aFloat7872: Float = 0f
    private var aBoolean7873 = false
    @JvmField
    var aFloat7874: Float
    @JvmField
    var aFloat7875: Float
    private var anInt7876 = 0
    private val aFloatArray7877: FloatArray
    private var anInt7878 = 0
    @JvmField
    var aByteArray7879: ByteArray?
    @JvmField
    var anIntArray7880: IntArray?
    private var anInt7881 = 0
    var anIntArray7882: IntArray?
    @JvmField
    var anIntArray7883: IntArray?

    public override fun L(i: Int, i_0_: Int, i_1_: Int) {
        if (i != this.anInt7856 || i_0_ != this.anInt7782 || this.anInt7813 != i_1_) {
            this.anInt7782 = i_0_
            this.anInt7856 = i
            this.anInt7813 = i_1_
            method3803(16711680)
            method3732(92)
        }
        anInt7694++
    }

    fun method3728(bool: Boolean, i: Int) {
        if (aBoolean7784 != bool) {
            aBoolean7784 = bool
            method3768((-121).toByte())
            anInt7765 = anInt7765 and 0x7.inv()
        }
        if (i < 18) anInt7804 = -98
        anInt7683++
    }

    override fun method3625(class124: Class124?, i: Int, i_2_: Int, i_3_: Int, i_4_: Int): Class64 {
        try {
            anInt7579++
            return Class64_Sub3(this, class124, i, i_3_, i_4_, i_2_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.EG(" + (if (class124 != null) "{...}" else "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'))
        }
    }

    fun method3729(i: Int, i_5_: Byte, i_6_: Int) {
        if (anInt7876 == 0) {
            var bool = false
            if (anInt7804 != i) {
                glTexEnvi(8960, 34161, i)
                bool = true
                anInt7804 = i
            }
            if (i_6_ != anInt7861) {
                glTexEnvi(8960, 34162, i_6_)
                anInt7861 = i_6_
                bool = true
            }
            if (bool) anInt7765 = anInt7765 and 0x1d.inv()
        } else {
            glTexEnvi(8960, 34161, i)
            glTexEnvi(8960, 34162, i_6_)
        }
        val i_7_ = -14 / ((i_5_ - 46) / 46)
        anInt7655++
    }

    private fun method3730(i: Byte) {
        glMatrixMode(5889)
        anInt7693++
        glLoadMatrixf(aFloatArray7779, 0)
        glMatrixMode(5888)
        if (i <= 113) method3659(-64)
    }

    override fun method3653(class299: Class299?) {
        try {
            anInt7550++
            aClass299_Sub1_7769 = class299 as Class299_Sub1?
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.DF(" + (if (class299 != null) "{...}" else "null") + ')')
        }
    }

    fun method3731(i: Int, bool: Boolean, i_8_: Int, `is`: ByteArray?, i_9_: Int): Interface2 {
        try {
            if (i != 2) method3781((-13).toByte(), 54)
            anInt7530++
            if (aBoolean7873 && (!bool || aBoolean7869)) return Class135_Sub1(this, i_8_, `is`, i_9_, bool)
            return Class119_Sub1(this, i_8_, `is`, i_9_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.VB(" + i + ',' + bool + ',' + i_8_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_9_ + ')'))
        }
    }

    override fun DA(i: Int, i_10_: Int, i_11_: Int, i_12_: Int) {
        this.anInt7771 = i_11_
        this.anInt7794 = i_12_
        this.anInt7810 = i_10_
        this.anInt7853 = i
        anInt7558++
        method3806(96)
        method3772(124.toByte())
        if (anInt7865 == 3) method3747((-63).toByte())
        else if (anInt7865 == 2) method3730(119.toByte())
    }

    private fun method3732(i: Int) {
        if (!aBoolean7801 || this.anInt7782 < 0) glDisable(2912)
        else glEnable(2912)
        val i_13_ = 96 % (i / 63)
        anInt7629++
    }

    fun method3733(i: Int, i_14_: Int, i_15_: Int, `is`: ByteArray?, bool: Boolean): Interface8 {
        try {
            anInt7565++
            if (i_14_ >= -2) method3644()
            if (aBoolean7873 && (!bool || aBoolean7869)) return Class135_Sub2(this, i, `is`, i_15_, bool)
            return Class119_Sub2(this, i, `is`, i_15_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.G(" + i + ',' + i_14_ + ',' + i_15_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    fun method3734(bool: Boolean) {
        glPopMatrix()
        anInt7696++
        if (bool != true) this.anInt7772 = 37
    }

    override fun method3690(i: Int, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, f: Float): Class348_Sub1 {
        anInt7559++
        return Class348_Sub1_Sub1(i, i_16_, i_17_, i_18_, i_19_, f)
    }

    fun method3735(i: Int) {
        if (anInt7765 != 4) {
            method3763(i xor 0x3201)
            method3807(false, 2)
            method3728(false, 79)
            method3752(i xor 0x257a, false)
            method3748(0, false)
            method3757(-2, -111)
            method3753(1, 1)
            anInt7765 = 4
        }
        anInt7514++
    }

    public override fun XA(): Int {
        anInt7706++
        return anInt7814
    }

    override fun method3636(i: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, var_aa: aa?, i_25_: Int, i_26_: Int) {
        try {
            anInt7727++
            val var_aa_Sub1 = var_aa as aa_Sub1
            val class258_sub3_sub1 = var_aa_Sub1.aClass258_Sub3_Sub1_5193
            method3792(110)
            method3771((-88).toByte(), var_aa_Sub1.aClass258_Sub3_Sub1_5193)
            method3753(i_24_, 1)
            method3729(7681, 97.toByte(), 8448)
            method3762(34167, 768, (-87).toByte(), 0)
            val f = (class258_sub3_sub1!!.aFloat9937 / (class258_sub3_sub1.anInt9940).toFloat())
            val f_27_ = (class258_sub3_sub1.aFloat9938 / (class258_sub3_sub1.anInt9939).toFloat())
            var f_28_ = i_21_.toFloat() - i.toFloat()
            var f_29_ = i_22_.toFloat() - i_20_.toFloat()
            val f_30_ = (1.0 / sqrt((f_29_ * f_29_ + f_28_ * f_28_).toDouble())).toFloat()
            f_28_ *= f_30_
            glColor4ub((i_23_ shr 16).toByte(), (i_23_ shr 8).toByte(), i_23_.toByte(), (i_23_ shr 24).toByte())
            f_29_ *= f_30_
            glBegin(1)
            glTexCoord2f((-i_25_ + i).toFloat() * f, f_27_ * (i_20_ + -i_26_).toFloat())
            glVertex2f(i.toFloat() + 0.35f, 0.35f + i_20_.toFloat())
            glTexCoord2f(f * (i_21_ + -i_25_).toFloat(), (-i_26_ + i_22_).toFloat() * f_27_)
            glVertex2f(0.35f + (f_28_ + i_21_.toFloat()), 0.35f + (i_22_.toFloat() + f_29_))
            glEnd()
            method3762(5890, 768, (-87).toByte(), 0)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.ME(" + i + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + (if (var_aa != null) "{...}" else "null") + ',' + i_25_ + ',' + i_26_ + ')'))
        }
    }

    override fun Y(): IntArray {
        anInt7704++
        return (intArrayOf(this.anInt7853, this.anInt7810, this.anInt7771, this.anInt7794))
    }

    @Synchronized
    fun method3737(i: Int, i_31_: Byte, i_32_: Int) {
        anInt7676++
        val class348_sub35 = Class348_Sub35(i_32_)
        class348_sub35.aLong4291 = i.toLong()
        val i_33_ = -124 / ((i_31_ - 79) / 39)
        aClass262_7752.method1999(class348_sub35, -20180)
    }

    fun method3738(i: Int, i_34_: Int) {
        if (i != -15039) aClass258Array7828 = null
        if (i_34_ != anInt7876) {
            glActiveTexture(33984 + i_34_)
            anInt7876 = i_34_
        }
        anInt7526++
    }

    fun method3739(i: Int, buffer: Buffer?, bool: Boolean, i_35_: Int, i_36_: Int): Interface2 {
        try {
            if (i != 8448) this.aClass64_Sub3_7844 = null
            anInt7605++
            if (aBoolean7873 && (!bool || aBoolean7869)) return Class135_Sub1(this, i_35_, buffer, i_36_, bool)
            return Class119_Sub1(this, i_35_, buffer)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.OG(" + i + ',' + (if (buffer != null) "{...}" else "null") + ',' + bool + ',' + i_35_ + ',' + i_36_ + ')'))
        }
    }

    private fun method3740(i: Int) {
        if (anInt7865 != 2) {
            anInt7865 = 2
            method3730(125.toByte())
            method3754(90.toByte())
            anInt7765 = anInt7765 and 0x7.inv()
        }
        if (i != -14388) this.anInt7735 = -85
        anInt7678++
    }

    override fun method3644(): Boolean {
        anInt7556++
        return true
    }

    fun method3741(i: Int): Class258_Sub2? {
        anInt7581++
        if (i != 444720536) this.aFloat7823 = 0.28610376f
        if (aClass299_Sub1_7769 != null) return aClass299_Sub1_7769!!.method2256((-121).toByte())
        return null
    }

    override fun HA(i: Int, i_37_: Int, i_38_: Int, i_39_: Int, `is`: IntArray?) {
        try {
            anInt7681++
            val f = ((i_38_.toFloat() * (this.aClass101_Sub3_7760.aFloat5784)) + (i_37_.toFloat() * (this.aClass101_Sub3_7760.aFloat5754) + (this.aClass101_Sub3_7760.aFloat5756) * i.toFloat()) + (this.aClass101_Sub3_7760.aFloat5751))
            if (this.anInt7826.toFloat() <= f && anInt7814.toFloat() >= f) {
                val i_40_ = ((this.aClass101_Sub3_7760.aFloat5747 + ((this.aClass101_Sub3_7760.aFloat5750) * i_37_.toFloat() + (i.toFloat() * (this.aClass101_Sub3_7760.aFloat5770)) + (this.aClass101_Sub3_7760.aFloat5781) * i_38_.toFloat())) * this.anInt7771.toFloat() / i_39_.toFloat()).toInt()
                val i_41_ = (this.anInt7794.toFloat() * ((this.aClass101_Sub3_7760.aFloat5772) + ((this.aClass101_Sub3_7760.aFloat5761) * i.toFloat() + (i_37_.toFloat() * (this.aClass101_Sub3_7760.aFloat5769)) + (i_38_.toFloat() * (this.aClass101_Sub3_7760.aFloat5762)))) / i_39_.toFloat()).toInt()
                if (i_40_.toFloat() >= this.aFloat7872 && this.aFloat7835 >= i_40_.toFloat() && this.aFloat7836 <= i_41_.toFloat() && this.aFloat7830 >= i_41_.toFloat()) {
                    `is`!![2] = f.toInt()
                    `is`[1] = (-this.aFloat7836 + i_41_.toFloat()).toInt()
                    `is`[0] = (-this.aFloat7872 + i_40_.toFloat()).toInt()
                } else {
                    `is`!![2] = -1
                    `is`[1] = `is`[2]
                    `is`[0] = `is`[1]
                }
            } else {
                `is`!![2] = -1
                `is`[1] = `is`[2]
                `is`[0] = `is`[1]
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.HA(" + i + ',' + i_37_ + ',' + i_38_ + ',' + i_39_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    override fun EA(i: Int, i_42_: Int, i_43_: Int, i_44_: Int) {
        anInt7532++
        if (!this.aBoolean7846) throw RuntimeException("")
        this.anInt7788 = i
        this.anInt7806 = i_42_
        this.anInt7848 = i_43_
        this.anInt7809 = i_44_
        if (aBoolean7859) {
            aClass100_7707!!.aClass286_Sub1_1586.method2141(false)
            aClass100_7707!!.aClass286_Sub1_1586.method2143(34336)
        }
    }

    private fun method3742(i: Int) {
        anInt7638++
        if (anInt7865 != 3) {
            anInt7865 = 3
            method3747((-63).toByte())
            method3754(89.toByte())
            anInt7765 = anInt7765 and 0x7.inv()
        }
        if (i != 3) anInt7799 = -50
    }

    override fun method3655(): Boolean {
        anInt7703++
        return true
    }

    fun method3744(f: Float, i: Int, f_45_: Float) {
        if (i != 770) this.aFloat7792 = 0.31055084f
        anInt7571++
        aFloat7786 = f
        aFloat7857 = f_45_
        method3803(16711680)
    }

    private fun method3745(i: Byte) {
        anInt7680++
        if (aCanvas7575 != null) {
            val dimension = aCanvas7575!!.getSize()
            anInt7645 = dimension.width
            anInt7523 = dimension.height
        } else {
            anInt7523 = 0
            anInt7645 = anInt7523
        }
        if (i > 61) {
            if (anInterface11_7740 == null) {
                this.anInt7688 = anInt7645
                this.anInt7641 = anInt7523
                method3809(true)
            }
            method3755(-32)
            la()
        }
    }

    fun method3746(bool: Boolean, i: Int, bool_46_: Boolean, i_47_: Int) {
        anInt7631++
        if (anInt7796 != i || aBoolean7859 == !this.aBoolean7846) {
            var class258_sub3: Class258_Sub3? = null
            var i_48_ = 0
            var i_49_: Byte = 0
            var i_50_ = 0
            var i_51_ = if (!this.aBoolean7846) 0.toByte() else 3.toByte()
            if (i >= 0) {
                class258_sub3 = aClass354_7723.method3467(i, 256)
                val class12 = this.aD4579!!.method3(i, -6662)
                if (class12!!.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0) {
                    val i_52_ = if (class12.aBoolean199) 64 else 128
                    val i_53_ = i_52_ * 50
                    method3799(((this.anInt7735 % i_53_ * class12.aByte211).toFloat() / i_53_.toFloat()), 0.0f, (class12.aByte198 * (this.anInt7735 % i_53_)).toFloat() / i_53_.toFloat(), 126.toByte())
                } else method3767(-21974)
                if (!this.aBoolean7846) {
                    i_51_ = class12.aByte213
                    i_50_ = class12.anInt206
                    i_49_ = class12.aByte202
                }
                i_48_ = class12.anInt203
            } else method3767(-21974)
            aClass100_7707!!.method884(i_49_.toInt(), bool, i_51_.toInt(), i_50_, 12.toByte(), bool_46_)
            if (!aClass100_7707!!.method885(i_48_, (-124).toByte(), class258_sub3)) {
                method3771((-86).toByte(), class258_sub3)
                method3761(0, i_48_)
            }
            aBoolean7859 = this.aBoolean7846
            anInt7796 = i
        }
        if (i_47_ <= 111) KA(59, -107, -128, -14)
        anInt7765 = anInt7765 and 0x7.inv()
    }

    private fun method3747(i: Byte) {
        anInt7597++
        val f = (-this.anInt7853.toFloat() * aFloat7851 / this.anInt7771.toFloat())
        val f_54_ = (aFloat7851 * -this.anInt7810.toFloat() / this.anInt7794.toFloat())
        val f_55_ = (aFloat7851 * (-this.anInt7853 + this.anInt7688).toFloat() / this.anInt7771.toFloat())
        val f_56_ = (aFloat7851 * (this.anInt7641 - this.anInt7810).toFloat() / this.anInt7794.toFloat())
        glMatrixMode(5889)
        glLoadIdentity()
        if (f != f_55_ && f_54_ != f_56_) glOrtho(f.toDouble(), f_55_.toDouble(), -f_56_.toDouble(), -f_54_.toDouble(), this.anInt7826.toDouble(), anInt7814.toDouble())
        glMatrixMode(5888)
        if (i.toInt() != -63) this.anInt7795 = 67
    }

    override fun method3627(): Boolean {
        anInt7542++
        return aClass348_Sub5_Sub1_7721 != null && (this.anInt7713 <= 1 || aBoolean7822)
    }

    fun method3748(i: Int, bool: Boolean) {
        anInt7710++
        if (aBoolean7759 != bool) {
            aBoolean7759 = bool
            method3795(-30199)
            anInt7765 = anInt7765 and 0x1f.inv()
        }
    }

    public override fun K(`is`: IntArray?) {
        try {
            `is`!![1] = anInt7773
            `is`[3] = anInt7787
            `is`[0] = anInt7868
            anInt7580++
            `is`[2] = anInt7855
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.K(" + (if (`is` != null) "{...}" else "null") + ')')
        }
    }

    override fun Q(i: Int, i_57_: Int, i_58_: Int, i_59_: Int, i_60_: Int, i_61_: Int, `is`: ByteArray?, i_62_: Int, i_63_: Int) {
        try {
            anInt7540++
            val f: Float
            val f_64_: Float
            if (aClass258_Sub3_Sub1_7776 == null || i_58_ > aClass258_Sub3_Sub1_7776!!.anInt8547 || i_59_ > aClass258_Sub3_Sub1_7776!!.anInt8551) {
                aClass258_Sub3_Sub1_7776 = Class371.method3583(false, `is`, 6406, i_59_, this, -45, 6406, i_58_)
                aClass258_Sub3_Sub1_7776!!.method1965(false, false, 10243)
                f = aClass258_Sub3_Sub1_7776!!.aFloat9938
                f_64_ = (aClass258_Sub3_Sub1_7776!!.aFloat9937)
            } else {
                aClass258_Sub3_Sub1_7776!!.method1970(0, 0, i_58_, false, 0, i_59_, 6406, 123, `is`, 0)
                f = (i_59_.toFloat() * (aClass258_Sub3_Sub1_7776!!.aFloat9938) / (aClass258_Sub3_Sub1_7776!!.anInt8551).toFloat())
                f_64_ = (i_58_.toFloat() * (aClass258_Sub3_Sub1_7776!!.aFloat9937) / (aClass258_Sub3_Sub1_7776!!.anInt8547).toFloat())
            }
            method3792(58)
            method3771((-117).toByte(), aClass258_Sub3_Sub1_7776)
            method3753(i_63_, 1)
            glColor4ub((i_60_ shr 16).toByte(), (i_60_ shr 8).toByte(), i_60_.toByte(), (i_60_ shr 24).toByte())
            method3808(i_61_, 120)
            method3729(34165, 101.toByte(), 34165)
            method3762(34166, 768, (-87).toByte(), 0)
            method3762(5890, 770, (-87).toByte(), 2)
            method3775(false, 0, 770, 34166)
            method3775(false, 2, 770, 5890)
            val f_65_ = i.toFloat()
            val f_66_ = i_57_.toFloat()
            val f_67_ = i_58_.toFloat() + f_65_
            val f_68_ = i_59_.toFloat() + f_66_
            glBegin(7)
            glTexCoord2f(0.0f, 0.0f)
            glVertex2f(f_65_, f_66_)
            glTexCoord2f(0.0f, f_64_)
            glVertex2f(f_65_, f_68_)
            glTexCoord2f(f, f_64_)
            glVertex2f(f_67_, f_68_)
            glTexCoord2f(f, 0.0f)
            glVertex2f(f_67_, f_66_)
            glEnd()
            method3762(5890, 768, (-87).toByte(), 0)
            method3762(34166, 770, (-87).toByte(), 2)
            method3775(false, 0, 770, 5890)
            method3775(false, 2, 770, 34166)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.Q(" + i + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ',' + i_61_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_62_ + ',' + i_63_ + ')'))
        }
    }

    override fun method3684(class98: Class98) {
        try {
            aClass233_7711.method1651(this, (-119).toByte(), -1, class98)
            anInt7569++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.EF(" + (if (class98 != null) "{...}" else "null") + ')')
        }
    }

    fun method3749(f: Float, f_69_: Float, f_70_: Float, i: Byte, f_71_: Float) {
        InputStream_Sub2.aFloatArray84!![2] = f_70_
        if (i <= 45) method3769(-35L, false)
        anInt7576++
        InputStream_Sub2.aFloatArray84!![0] = f_69_
        InputStream_Sub2.aFloatArray84!![1] = f_71_
        InputStream_Sub2.aFloatArray84!![3] = f
        glTexEnvfv(8960, 8705, InputStream_Sub2.aFloatArray84, 0)
    }

    override fun method3638(class101: Class101?) {
        do {
            try {
                anInt7549++
                this.aClass101_Sub3_7760.method898(class101)
                this.aClass101_Sub3_7766.method898(this.aClass101_Sub3_7760)
                this.aClass101_Sub3_7766.method942(3128)
                this.aClass101_Sub3_7767.method946(this.aClass101_Sub3_7766, -7929)
                if (anInt7865 == 1) break
                method3754(89.toByte())
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "qo.DE(" + (if (class101 != null) "{...}" else "null") + ')')
            }
            break
        } while (false)
    }

    fun method3750(i: Int, interface2: Interface2?) {
        try {
            if (i <= 39) this.anInt7782 = 120
            if (interface2 !== anInterface2_7852) {
                if (aBoolean7873) glBindBufferARB(34962, interface2!!.method10(true))
                anInterface2_7852 = interface2
            }
            anInt7552++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.D(" + i + ',' + (if (interface2 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3676(i: Int, i_72_: Int, i_73_: Int, i_74_: Int, i_75_: Int, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int, i_80_: Int, i_81_: Int, i_82_: Int, i_83_: Int) {
        method3778((-123).toByte())
        anInt7567++
        method3753(i_83_, 1)
        glBegin(4)
        glColor4ub((i_80_ shr 16).toByte(), (i_80_ shr 8).toByte(), i_80_.toByte(), (i_80_ shr 24).toByte())
        glVertex3f(i.toFloat() + 0.35f, i_72_.toFloat() + 0.35f, i_73_.toFloat())
        glColor4ub((i_81_ shr 16).toByte(), (i_81_ shr 8).toByte(), i_81_.toByte(), (i_81_ shr 24).toByte())
        glVertex3f(i_74_.toFloat() + 0.35f, i_75_.toFloat() + 0.35f, i_76_.toFloat())
        glColor4ub((i_82_ shr 16).toByte(), (i_82_ shr 8).toByte(), i_82_.toByte(), (i_82_ shr 24).toByte())
        glVertex3f(0.35f + i_77_.toFloat(), i_78_.toFloat() + 0.35f, i_79_.toFloat())
        glEnd()
    }

    override fun method3672() {
        anInt7702++
        if (this.aBoolean7820) {
            if (anInterface11_7740 !== aClass206_7739) throw RuntimeException()
            aClass206_7739!!.method1500(2983, 0)
            aClass206_7739.method1500(2983, 8)
            method3770(-422613672, aClass206_7739)
        } else {
            if (!aBoolean7866) throw RuntimeException("")
            aClass105_Sub2_7744!!.method979(0, 0, this.anInt7688, this.anInt7641, 0, 0)
            anOpenGL7664!!.setSurface(aLong7636)
        }
        this.anInt7688 = anInt7645
        aClass105_Sub2_7744 = null
        this.anInt7641 = anInt7523
        method3755(-32)
        method3809(true)
        la()
    }

    fun method3751(interface11: Interface11?, i: Int) {
        try {
            anInt7548++
            if (anInt7742 >= 3) throw RuntimeException()
            val i_84_ = 67 % ((-4 - i) / 46)
            if (anInt7742 >= 0) anInterface11Array7737[anInt7742]!!.method50(-32502)
            anInterface11Array7737[++anInt7742] = interface11
            anInterface11_7740 = interface11
            anInterface11_7740!!.method47(-11421)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.NG(" + (if (interface11 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    fun method3752(i: Int, bool: Boolean) {
        if (!bool != !aBoolean7763) {
            if (!bool) glDisable(2929)
            else glEnable(2929)
            aBoolean7763 = bool
            anInt7765 = anInt7765 and 0x1f.inv()
        }
        if (i <= 106) method3765(118.toByte(), 75)
        anInt7726++
    }

    override fun method3686(class143: Class143?, class207s: Array<Class207>?, bool: Boolean): Class324 {
        try {
            anInt7574++
            return Class324_Sub5(this, class143, class207s!!, bool)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.JE(" + (if (class143 != null) "{...}" else "null") + ',' + (if (class207s != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    override fun aa(i: Int, i_85_: Int, i_86_: Int, i_87_: Int, i_88_: Int, i_89_: Int) {
        anInt7601++
        val f = i.toFloat() + 0.35f
        val f_90_ = i_85_.toFloat() + 0.35f
        val f_91_ = i_86_.toFloat() + f
        method3778((-127).toByte())
        val f_92_ = f_90_ + i_87_.toFloat()
        method3753(i_89_, 1)
        glColor4ub((i_88_ shr 16).toByte(), (i_88_ shr 8).toByte(), i_88_.toByte(), (i_88_ shr 24).toByte())
        if (aBoolean7843) glDisable(32925)
        glBegin(7)
        glVertex2f(f, f_90_)
        glVertex2f(f, f_92_)
        glVertex2f(f_91_, f_92_)
        glVertex2f(f_91_, f_90_)
        glEnd()
        if (aBoolean7843) glEnable(32925)
    }

    override fun ZA(i: Int, f: Float, f_93_: Float, f_94_: Float, f_95_: Float, f_96_: Float) {
        anInt7633++
        val bool = i != anInt7808
        if (bool || this.aFloat7832 != f || f_93_ != this.aFloat7871) {
            this.aFloat7832 = f
            anInt7808 = i
            this.aFloat7871 = f_93_
            if (bool) {
                this.aFloat7823 = (anInt7808 and 0xff).toFloat() / 255.0f
                this.aFloat7781 = (0xff0000 and anInt7808).toFloat() / 1.671168E7f
                this.aFloat7816 = (0xff00 and anInt7808).toFloat() / 65280.0f
                method3787(-93)
            }
            method3779(29890)
        }
        if (f_94_ != aFloatArray7850[0] || aFloatArray7850[1] != f_95_ || aFloatArray7850[2] != f_96_) {
            aFloatArray7850[2] = f_96_
            aFloatArray7850[1] = f_95_
            aFloatArray7850[0] = f_94_
            aFloatArray7877[0] = -f_94_
            aFloatArray7877[2] = -f_96_
            aFloatArray7877[1] = -f_95_
            val f_97_ = (1.0 / sqrt((f_96_ * f_96_ + (f_95_ * f_95_ + f_94_ * f_94_)).toDouble())).toFloat()
            this.aFloatArray7825[0] = f_97_ * f_94_
            this.aFloatArray7825[2] = f_96_ * f_97_
            this.aFloatArray7825[1] = f_97_ * f_95_
            aFloatArray7811[2] = -this.aFloatArray7825[2]
            aFloatArray7811[1] = -this.aFloatArray7825[1]
            aFloatArray7811[0] = -this.aFloatArray7825[0]
            method3796(16384)
            this.anInt7777 = (256.0f * f_96_ / f_95_).toInt()
            this.anInt7772 = (256.0f * f_94_ / f_95_).toInt()
        }
    }

    override fun method3679(i: Int, i_98_: Int): Int {
        anInt7634++
        return i or i_98_
    }

    override fun GA(i: Int) {
        anInt7592++
        method3753(0, 1)
        glClearColor((i and 0xff0000).toFloat() / 1.671168E7f, (0xff00 and i).toFloat() / 65280.0f, (0xff and i).toFloat() / 255.0f, (i ushr 24).toFloat() / 255.0f)
        glClear(16384)
    }

    override fun method3650(i: Int) {
        anInt7646++
    }

    fun method3753(i: Int, i_103_: Int) {
        if (i_103_ != 1) this.aBoolean7837 = false
        if (i != anInt7764) {
            val bool: Boolean
            val i_104_: Int
            val bool_105_: Boolean
            if (i == 1) {
                bool_105_ = true
                i_104_ = 1
                bool = true
            } else if (i == 2) {
                bool_105_ = true
                i_104_ = 2
                bool = false
            } else if (i == 128) {
                i_104_ = 3
                bool_105_ = true
                bool = true
            } else {
                bool = false
                i_104_ = 0
                bool_105_ = true
            }
            if (!aBoolean7758 != !bool_105_) {
                glColorMask(bool_105_, bool_105_, bool_105_, true)
                aBoolean7758 = bool_105_
            }
            if (!bool != !aBoolean7761) {
                if (!bool) glDisable(3008)
                else glEnable(3008)
                aBoolean7761 = bool
            }
            if (anInt7762 != i_104_) {
                if (i_104_ == 1) {
                    glEnable(3042)
                    glBlendFunc(770, 771)
                } else if (i_104_ == 2) {
                    glEnable(3042)
                    glBlendFunc(1, 1)
                } else if (i_104_ == 3) {
                    glEnable(3042)
                    glBlendFunc(774, 1)
                } else glDisable(3042)
                anInt7762 = i_104_
            }
            anInt7764 = i
            anInt7765 = anInt7765 and 0x1c.inv()
        }
        anInt7591++
    }

    private fun method3754(i: Byte) {
        anInt7689++
        if (i > 77) {
            glLoadIdentity()
            glMultMatrixf(this.aClass101_Sub3_7766.method940(1), 0)
            if (aBoolean7859) aClass100_7707!!.aClass286_Sub1_1586.method2141(false)
            method3796(16384)
            method3783(0)
        }
    }

    fun method3755(i: Int) {
        if (anInt7865 != 0) {
            anInt7765 = anInt7765 and 0x1f.inv()
            anInt7865 = 0
        }
        if (i == -32) anInt7708++
    }

    fun method3756(i: Int, i_106_: Int, i_107_: Int, i_108_: Int) {
        if (i_108_ <= 32) aFloat7857 = -0.7407605f
        anInt7555++
        glDrawArrays(i_106_, i_107_, i)
    }

    override fun U(i: Int, i_109_: Int, i_110_: Int, i_111_: Int, i_112_: Int) {
        method3778((-119).toByte())
        anInt7525++
        method3753(i_112_, 1)
        val f = i.toFloat() + 0.35f
        glColor4ub((i_111_ shr 16).toByte(), (i_111_ shr 8).toByte(), i_111_.toByte(), (i_111_ shr 24).toByte())
        val f_113_ = i_109_.toFloat() + 0.35f
        glBegin(1)
        glVertex2f(f, f_113_)
        glVertex2f(i_110_.toFloat() + f, f_113_)
        glEnd()
    }

    override fun method3696(i: Int) {
        anInt7635++
        require(!(i < 128 || i > 1024))
        this.anInt7712 = i
        aClass354_7723.method3463((-110).toByte())
    }

    override fun xa(f: Float) {
        if (this.aFloat7768 != f) {
            this.aFloat7768 = f
            method3787(-105)
        }
        anInt7668++
    }

    fun method3757(i: Int, i_114_: Int) {
        method3801(true, i, -104)
        anInt7649++
        if (i_114_ > -43) method3768(85.toByte())
    }

    fun method3758(bool: Boolean, class101_sub3: Class101_Sub3?) {
        try {
            glPushMatrix()
            if (bool != false) method3650(51)
            anInt7653++
            glMultMatrixf(class101_sub3!!.method940(1), 0)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.WC(" + bool + ',' + (if (class101_sub3 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3683(i: Int, i_115_: Int, i_116_: Int, i_117_: Int, bool: Boolean): Class105 {
        anInt7582++
        return Class105_Sub2(this, i, i_115_, i_116_, i_117_)
    }

    fun method3759(i: Int, i_118_: Int, i_119_: Int, interface8: Interface8?, i_120_: Int) {
        var i_120_ = i_120_
        try {
            anInt7619++
            val i_121_ = interface8!!.method34(-5711)
            if (i_118_ >= -127) aClass100_7707 = null
            i_120_ *= method3785(i_121_, 4)
            method3793(1, interface8)
            glDrawElements(i_119_, i, i_121_, (interface8.method36(78.toByte()) + i_120_.toLong()))
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.MA(" + i + ',' + i_118_ + ',' + i_119_ + ',' + (if (interface8 != null) "{...}" else "null") + ',' + i_120_ + ')'))
        }
    }

    @Synchronized
    override fun method3646(i: Int) {
        var i = i
        anInt7699++
        var i_122_ = 0
        i = i and 0x7fffffff
        while (!aClass262_7751!!.method2002(18.toByte())) {
            val class348_sub35 = aClass262_7751!!.method1997(8) as Class348_Sub35?
            Class328_Sub3.anIntArray6522!![i_122_++] = class348_sub35!!.aLong4291.toInt()
            this.anInt7747 -= class348_sub35.anInt6976
            if (i_122_ == 1000) {
                glDeleteBuffersARB(i_122_, Class328_Sub3.anIntArray6522, 0)
                i_122_ = 0
            }
        }
        if (i_122_ > 0) {
            glDeleteBuffersARB(i_122_, Class328_Sub3.anIntArray6522, 0)
            i_122_ = 0
        }
        while (!aClass262_7752.method2002(18.toByte())) {
            val class348_sub35 = aClass262_7752.method1997(8) as Class348_Sub35?
            Class328_Sub3.anIntArray6522!![i_122_++] = class348_sub35!!.aLong4291.toInt()
            this.anInt7748 -= class348_sub35.anInt6976
            if (i_122_ == 1000) {
                glDeleteTextures(i_122_, Class328_Sub3.anIntArray6522, 0)
                i_122_ = 0
            }
        }
        if (i_122_ > 0) {
            glDeleteTextures(i_122_, Class328_Sub3.anIntArray6522, 0)
            i_122_ = 0
        }
        while (!aClass262_7753.method2002(18.toByte())) {
            val class348_sub35 = aClass262_7753.method1997(8) as Class348_Sub35?
            Class328_Sub3.anIntArray6522!![i_122_++] = class348_sub35!!.anInt6976
            if (i_122_ == 1000) {
                glDeleteFramebuffersEXT(i_122_, Class328_Sub3.anIntArray6522, 0)
                i_122_ = 0
            }
        }
        if (i_122_ > 0) {
            glDeleteFramebuffersEXT(i_122_, Class328_Sub3.anIntArray6522, 0)
            i_122_ = 0
        }
        while (!aClass262_7754.method2002(18.toByte())) {
            val class348_sub35 = aClass262_7754.method1997(8) as Class348_Sub35?
            Class328_Sub3.anIntArray6522!![i_122_++] = class348_sub35!!.aLong4291.toInt()
            anInt7750 -= class348_sub35.anInt6976
            if (i_122_ == 1000) {
                glDeleteRenderbuffersEXT(i_122_, Class328_Sub3.anIntArray6522, 0)
                i_122_ = 0
            }
        }
        if (i_122_ > 0) {
            glDeleteRenderbuffersEXT(i_122_, Class328_Sub3.anIntArray6522, 0)
            val bool = false
        }
        while (!aClass262_7749.method2002(18.toByte())) {
            val class348_sub35 = aClass262_7749.method1997(8) as Class348_Sub35?
            glDeleteLists(class348_sub35!!.aLong4291.toInt(), class348_sub35.anInt6976)
        }
        while (!aClass262_7755.method2002(18.toByte())) {
            val class348 = aClass262_7755.method1997(8)
            glDeleteProgramARB(class348!!.aLong4291.toInt())
        }
        while (!aClass262_7756.method2002(18.toByte())) {
            val class348 = aClass262_7756.method1997(8)
            glDeleteObjectARB(class348!!.aLong4291)
        }
        while (!aClass262_7749.method2002(18.toByte())) {
            val class348_sub35 = aClass262_7749.method1997(8) as Class348_Sub35?
            glDeleteLists(class348_sub35!!.aLong4291.toInt(), class348_sub35.anInt6976)
        }
        aClass354_7723.method3469(8218)
        if (E() > 100663296 && 60000L + aLong7757 < Class62.method599(-96)) {
            System.gc()
            aLong7757 = Class62.method599(-91)
        }
        this.anInt7735 = i
    }

    override fun method3709(i: Int, i_123_: Int, i_124_: Int, i_125_: Int, i_126_: Int, i_127_: Int) {
        method3778((-124).toByte())
        anInt7611++
        method3753(i_127_, 1)
        var f = i_124_.toFloat() - i.toFloat()
        var f_128_ = -i_123_.toFloat() + i_125_.toFloat()
        if (f == 0.0f && f_128_ == 0.0f) f = 1.0f
        else {
            val f_129_ = (1.0 / sqrt((f * f + f_128_ * f_128_).toDouble())).toFloat()
            f *= f_129_
            f_128_ *= f_129_
        }
        glColor4ub((i_126_ shr 16).toByte(), (i_126_ shr 8).toByte(), i_126_.toByte(), (i_126_ shr 24).toByte())
        glBegin(1)
        glVertex2f(0.35f + i.toFloat(), i_123_.toFloat() + 0.35f)
        glVertex2f(0.35f + (f + i_124_.toFloat()), 0.35f + (f_128_ + i_125_.toFloat()))
        glEnd()
    }

    override fun b(i: Int, i_130_: Int, i_131_: Int, i_132_: Int, d: Double) {
        anInt7535++
    }

    fun method3760(i: Int) {
        if (i != 1) method3759(65, 117, -33, null, -33)
        anInt7643++
        if (anInt7765 != 16) {
            method3742(3)
            method3807(true, 2)
            method3752(122, true)
            method3748(0, true)
            method3753(1, i)
            anInt7765 = 16
        }
    }

    fun method3761(i: Int, i_133_: Int) {
        if (i != 0) aClass262_7751 = null
        anInt7654++
        if (i_133_ == 1) method3729(7681, 114.toByte(), 7681)
        else if (i_133_ == 0) method3729(8448, 107.toByte(), 8448)
        else if (i_133_ != 2) {
            if (i_133_ != 3) {
                if (i_133_ == 4) method3729(34023, 123.toByte(), 34023)
            } else method3729(260, 97.toByte(), 8448)
        } else method3729(34165, 126.toByte(), 7681)
    }

    override fun method3695(): Boolean {
        anInt7547++
        return true
    }

    fun method3762(i: Int, i_134_: Int, i_135_: Byte, i_136_: Int) {
        anInt7671++
        glTexEnvi(8960, 34176 - -i_136_, i)
        glTexEnvi(8960, i_136_ + 34192, i_134_)
        if (i_135_.toInt() != -87) r(48, 67, -20, 106, -89, 67, 104)
    }

    private fun method3763(i: Int) {
        anInt7516++
        if (anInt7865 != 1) {
            glMatrixMode(5889)
            glLoadIdentity()
            if (this.anInt7688 > 0 && this.anInt7641 > 0) glOrtho(0.0, this.anInt7688.toDouble(), this.anInt7641.toDouble(), 0.0, -1.0, 1.0)
            glMatrixMode(5888)
            glLoadIdentity()
            anInt7865 = 1
            anInt7765 = anInt7765 and 0x18.inv()
        }
        if (i != 5888) method3763(-122)
    }

    fun method3764(i: Int, interface11: Interface11?) {
        try {
            anInt7586++
            if (anInt7742 < 0 || anInterface11Array7737[anInt7742] !== interface11) throw RuntimeException()
            anInterface11Array7737[anInt7742--] = null
            if (i != -17083) aClass105_Sub2_7744 = null
            interface11!!.method50(-32502)
            if (anInt7742 < 0) anInterface11_7740 = null
            else {
                anInterface11_7740 = anInterface11Array7737[anInt7742]
                anInterface11_7740!!.method47(-11421)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.FA(" + i + ',' + (if (interface11 != null) "{...}" else "null") + ')'))
        }
    }

    @Synchronized
    fun method3765(i: Byte, i_137_: Int) {
        anInt7566++
        val class348 = Class348()
        class348.aLong4291 = i_137_.toLong()
        aClass262_7755.method1999(class348, -20180)
    }

    fun method3766(i: Byte, class101_sub3: Class101_Sub3?) {
        do {
            try {
                anInt7623++
                glLoadMatrixf(class101_sub3!!.method940(i + -54), 0)
                if (i.toInt() == 55) break
                method3782(null, -47)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.GC(" + i + ',' + (if (class101_sub3 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    override fun method3700(f: Float, f_138_: Float, f_139_: Float) {
        Class348_Sub40_Sub13.aFloat9204 = f_139_
        Class75_Sub1.aFloat5654 = f
        anInt7685++
        Class239_Sub26.aFloat6120 = f_138_
    }

    override fun method3701(canvas: Canvas?) {
        do {
            try {
                anInt7674++
                if (canvas === aCanvas7626) throw RuntimeException()
                if (!aHashtable7577.containsKey(canvas)) break
                val var_long = aHashtable7577.get(canvas) as Long
                anOpenGL7664!!.releaseSurface(canvas, var_long)
                aHashtable7577.remove(canvas)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "qo.AG(" + (if (canvas != null) "{...}" else "null") + ')')
            }
            break
        } while (false)
    }

    private fun method3767(i: Int) {
        if (i != -21974) aClass105_Sub2_7744 = null
        anInt7599++
        if (aBoolean7860) {
            glMatrixMode(5890)
            glLoadIdentity()
            glMatrixMode(5888)
            aBoolean7860 = false
        }
    }

    override fun method3670(): Boolean {
        anInt7557++
        return true
    }

    override fun za(i: Int, i_140_: Int, i_141_: Int, i_142_: Int, i_143_: Int) {
        var i_141_ = i_141_
        if (i_141_ < 0) i_141_ = -i_141_
        anInt7728++
        if (anInt7868 <= i + i_141_ && anInt7855 >= -i_141_ + i && anInt7773 <= i_140_ + i_141_ && i_140_ + -i_141_ <= anInt7787) {
            method3778((-117).toByte())
            method3753(i_143_, 1)
            glColor4ub((i_142_ shr 16).toByte(), (i_142_ shr 8).toByte(), i_142_.toByte(), (i_142_ shr 24).toByte())
            val f = i.toFloat() + 0.35f
            val f_144_ = i_140_.toFloat() + 0.35f
            val i_145_ = i_141_ shl 1
            if (aFloat7829 > i_145_.toFloat()) {
                glBegin(7)
                glVertex2f(1.0f + f, 1.0f + f_144_)
                glVertex2f(f + 1.0f, -1.0f + f_144_)
                glVertex2f(-1.0f + f, f_144_ - 1.0f)
                glVertex2f(-1.0f + f, f_144_ + 1.0f)
                glEnd()
            } else if (aFloat7800 >= i_145_.toFloat()) {
                glEnable(2832)
                glPointSize(i_145_.toFloat())
                glBegin(0)
                glVertex2f(f, f_144_)
                glEnd()
                glDisable(2832)
            } else {
                glBegin(6)
                glVertex2f(f, f_144_)
                var i_146_ = 262144 / (6 * i_141_)
                if (i_146_ > 64) {
                    if (i_146_ > 512) i_146_ = 512
                } else i_146_ = 64
                i_146_ = Class348_Sub40_Sub1.method3051(i_146_, 4096)
                glVertex2f(i_141_.toFloat() + f, f_144_)
                var i_147_ = 16384 + -i_146_
                while (i_147_ > 0) {
                    glVertex2f(i_141_.toFloat() * (Class348_Sub23.aFloatArray6867!![i_147_]) + f, i_141_.toFloat() * (Class348_Sub23.aFloatArray6865!![i_147_]) + f_144_)
                    i_147_ -= i_146_
                }
                glVertex2f(f + i_141_.toFloat(), f_144_)
                glEnd()
            }
        }
    }

    override fun method3659(i: Int) {
        method3776(22544)
        anInt7541++
    }

    private fun method3768(i: Byte) {
        anInt7519++
        if (i >= -69) this.aClass64_Sub3_7802 = null
        if (!aBoolean7784 || aBoolean7805) glDisable(2896)
        else glEnable(2896)
    }

    override fun method3652() {
        var class348 = aClass262_7732.method1995(4)
        while (class348 != null) {
            (class348 as za_Sub1).method3440(-82)
            class348 = aClass262_7732.method1990(55.toByte())
        }
        anInt7563++
        if (aClass18_7720 != null) aClass18_7720.method279((-126).toByte())
        if (anOpenGL7664 != null) {
            method3797(0)
            val enumeration = aHashtable7577.keys()
            while (enumeration.hasMoreElements()) {
                val canvas = enumeration.nextElement() as Canvas?
                val var_long = aHashtable7577.get(canvas) as Long
                anOpenGL7664!!.releaseSurface(canvas, var_long)
            }
            anOpenGL7664!!.release()
            anOpenGL7664 = null
        }
        if (aBoolean7734) {
            Class286_Sub8.method2173(true, 12, false)
            aBoolean7734 = false
        }
    }

    override fun method3673() {
        anInt7568++
        if (aBoolean7774 && this.anInt7688 > 0 && this.anInt7641 > 0) {
            val i = anInt7868
            val i_148_ = anInt7855
            val i_149_ = anInt7773
            val i_150_ = anInt7787
            la()
            glReadBuffer(1028)
            glDrawBuffer(1029)
            method3755(-32)
            method3807(false, 2)
            method3728(false, 86)
            method3752(112, false)
            method3748(0, false)
            method3771((-91).toByte(), null)
            method3757(-2, -88)
            method3761(0, 1)
            method3753(0, 1)
            glMatrixMode(5889)
            glLoadIdentity()
            glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0)
            glMatrixMode(5888)
            glLoadIdentity()
            glRasterPos2i(0, 0)
            glCopyPixels(0, 0, this.anInt7688, this.anInt7641, 6144)
            glFlush()
            glReadBuffer(1029)
            glDrawBuffer(1029)
            KA(i, i_149_, i_148_, i_150_)
        }
    }

    override fun method3697(i: Int, i_151_: Int, i_152_: Int, i_153_: Int, i_154_: Int, i_155_: Int): Class299? {
        anInt7515++
        if (this.aBoolean7863) return Class299_Sub1_Sub1(this, i, i_151_, i_152_, i_153_, i_154_, i_155_)
        return null
    }

    @Synchronized
    fun method3769(l: Long, bool: Boolean) {
        try {
            if (bool != false) aClass262_7751 = null
            anInt7533++
            val class348 = Class348()
            class348.aLong4291 = l
            aClass262_7756.method1999(class348, -20180)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.CD(" + l + ',' + bool + ')')
        }
    }

    fun method3770(i: Int, interface11: Interface11?) {
        do {
            try {
                anInt7598++
                if (this.aBoolean7815) {
                    method3805(8387, interface11)
                    method3764(-17083, interface11)
                } else {
                    if (anInt7746 < 0 || anInterface11Array7743[anInt7746] !== interface11) throw RuntimeException()
                    anInterface11Array7743[anInt7746--] = null
                    interface11!!.method48(46)
                    if (anInt7746 < 0) {
                        anInterface11_7740 = null
                        anInterface11_7745 = anInterface11_7740
                    } else {
                        anInterface11_7740 = anInterface11Array7743[anInt7746]
                        anInterface11_7745 = anInterface11_7740
                        anInterface11_7745!!.method46(-11762)
                    }
                }
                if (i == -422613672) break
                this.anInt7788 = 30
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.FD(" + i + ',' + (if (interface11 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    fun method3771(i: Byte, class258: Class258?) {
        try {
            anInt7673++
            if (i > -74) A(38, null, 4, -3)
            val class258_156_ = aClass258Array7828!![anInt7876]
            if (class258_156_ !== class258) {
                if (class258 == null) glDisable(class258_156_!!.anInt4849)
                else {
                    if (class258_156_ != null) {
                        if (class258_156_.anInt4849 != class258.anInt4849) {
                            glDisable(class258_156_.anInt4849)
                            glEnable(class258.anInt4849)
                        }
                    } else glEnable(class258.anInt4849)
                    glBindTexture(class258.anInt4849, class258.method1953(41))
                }
                aClass258Array7828!![anInt7876] = class258
            }
            anInt7765 = anInt7765 and 0x1.inv()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.VA(" + i + ',' + (if (class258 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3710() {
        if (aClass348_Sub5_Sub1_7721 != null && aClass348_Sub5_Sub1_7721!!.method2760(1.toByte())) {
            aClass18_7720!!.method278(aClass348_Sub5_Sub1_7721!!, true)
            aClass354_7723.method3463((-110).toByte())
        }
        anInt7612++
    }

    override fun method3674(i: Int, i_157_: Int, i_158_: Int, i_159_: Int, i_160_: Int, i_161_: Int, i_162_: Int, i_163_: Int, i_164_: Int) {
        var i_164_ = i_164_
        anInt7656++
        if (i_158_ != i || i_157_ != i_159_) {
            method3778((-119).toByte())
            method3753(i_161_, 1)
            var f = i_158_.toFloat() - i.toFloat()
            var f_165_ = i_159_.toFloat() - i_157_.toFloat()
            val f_166_ = (1.0 / sqrt((f_165_ * f_165_ + f * f).toDouble())).toFloat()
            f *= f_166_
            f_165_ *= f_166_
            glColor4ub((i_160_ shr 16).toByte(), (i_160_ shr 8).toByte(), i_160_.toByte(), (i_160_ shr 24).toByte())
            i_164_ %= i_162_ + i_163_
            val f_167_ = i_162_.toFloat() * f
            val f_168_ = f_165_ * i_162_.toFloat()
            var f_169_ = 0.0f
            var f_170_ = 0.0f
            var f_171_ = f_167_
            var f_172_ = f_168_
            if (i_164_ <= i_162_) {
                f_172_ = (-i_164_ + i_162_).toFloat() * f_165_
                f_171_ = f * (-i_164_ + i_162_).toFloat()
            } else {
                f_170_ = (i_163_ + i_162_ - i_164_).toFloat() * f_165_
                f_169_ = (i_163_ + i_162_ - i_164_).toFloat() * f
            }
            var f_173_ = f_169_ + (0.35f + i.toFloat())
            var f_174_ = 0.35f + i_157_.toFloat() + f_170_
            val f_175_ = f * i_163_.toFloat()
            val f_176_ = f_165_ * i_163_.toFloat()
            while (true) {
                if (i >= i_158_) {
                    if (i_158_.toFloat() + 0.35f > f_173_) break
                    if (f_173_ + f_171_ < i_158_.toFloat()) f_171_ = -f_173_ + i_158_.toFloat()
                } else {
                    if (f_173_ > i_158_.toFloat() + 0.35f) break
                    if (f_173_ + f_171_ > i_158_.toFloat()) f_171_ = -f_173_ + i_158_.toFloat()
                }
                if (i_157_ >= i_159_) {
                    if (i_159_.toFloat() + 0.35f > f_174_) break
                    if (f_172_ + f_174_ < i_159_.toFloat()) f_172_ = i_159_.toFloat() - f_174_
                } else {
                    if (i_159_.toFloat() + 0.35f < f_174_) break
                    if (f_172_ + f_174_ > i_159_.toFloat()) f_172_ = -f_174_ + i_159_.toFloat()
                }
                glBegin(1)
                glVertex2f(f_173_, f_174_)
                glVertex2f(f_173_ + f_171_, f_172_ + f_174_)
                glEnd()
                f_174_ += f_172_ + f_176_
                f_173_ += f_175_ + f_171_
                f_171_ = f_167_
                f_172_ = f_168_
            }
        }
    }

    override fun method3643(canvas: Canvas?, i: Int, i_177_: Int) {
        do {
            try {
                anInt7544++
                if (aCanvas7626 === canvas) throw RuntimeException()
                if (aHashtable7577.containsKey(canvas)) break
                if (!canvas!!.isShowing()) throw RuntimeException()
                canvas.setIgnoreRepaint(true)
                val l = anOpenGL7664!!.prepareSurface(canvas)
                if (l == -1L) throw RuntimeException()
                aHashtable7577.put(canvas, l)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.VF(" + (if (canvas != null) "{...}" else "null") + ',' + i + ',' + i_177_ + ')'))
            }
            break
        } while (false)
    }

    private fun method3772(i: Byte) {
        this.aFloat7835 = (-this.anInt7853 + anInt7855).toFloat()
        anInt7709++
        this.aFloat7872 = (-this.anInt7853 + anInt7868).toFloat()
        this.aFloat7836 = (-this.anInt7810 + anInt7773).toFloat()
        if (i < 123) X(-79)
        this.aFloat7830 = (anInt7787 + -this.anInt7810).toFloat()
    }

    override fun method3702(i: Int): za {
        anInt7538++
        val var_za_Sub1 = za_Sub1(i)
        aClass262_7732.method1999(var_za_Sub1, -20180)
        return var_za_Sub1
    }

    override fun method3648(i: Int, i_178_: Int, `is`: Array<IntArray?>, is_179_: Array<IntArray?>?, i_180_: Int, i_181_: Int, i_182_: Int): s {
        try {
            anInt7600++
            return s_Sub2(this, i_181_, i_182_, i, i_178_, `is`, is_179_, i_180_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.VE(" + i + ',' + i_178_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_179_ != null) "{...}" else "null") + ',' + i_180_ + ',' + i_181_ + ',' + i_182_ + ')'))
        }
    }

    override fun method3682(): Boolean {
        anInt7705++
        return true
    }

    fun method3773(i: Int, interface11: Interface11?) {
        try {
            anInt7617++
            if (i != -1) aString7845 = null
            if (this.aBoolean7815) {
                method3782(interface11, 327685)
                method3751(interface11, i xor 0x4f.inv())
            } else {
                if (anInt7746 >= 3) throw RuntimeException()
                if (anInt7746 >= 0) anInterface11Array7743[anInt7746]!!.method48(-76)
                anInterface11Array7743[++anInt7746] = interface11
                anInterface11_7740 = anInterface11Array7743[++anInt7746]
                anInterface11_7745 = anInterface11_7740
                anInterface11_7745!!.method46(-11762)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.JB(" + i + ',' + (if (interface11 != null) "{...}" else "null") + ')'))
        }
    }

    private fun method3774(i: Byte): Int {
        anInt7518++
        var i_183_ = 0
        aString7845 = glGetString(7936).lowercase(Locale.getDefault())
        aString7790 = glGetString(7937).lowercase(Locale.getDefault())
        if (aString7845!!.indexOf("microsoft") != -1) i_183_ = i_183_ or 0x1
        if (aString7845!!.indexOf("brian paul") != -1 || aString7845!!.indexOf("mesa") != -1) i_183_ = i_183_ or 0x1
        val string = glGetString(7938)
        val strings = Class348_Sub40_Sub23.method3113(' ', true, string.replace('.', ' '))
        if (strings.size >= 2) {
            try {
                val i_184_ = Class348_Sub41.method3156(true, strings[0]!!)
                val i_185_ = Class348_Sub41.method3156(true, strings[1]!!)
                anInt7789 = i_184_ * 10 - -i_185_
            } catch (numberformatexception: NumberFormatException) {
                i_183_ = i_183_ or 0x4
            }
        } else i_183_ = i_183_ or 0x4
        if (anInt7789 < 12) i_183_ = i_183_ or 0x2
        if (!anOpenGL7664!!.a("GL_ARB_multitexture")) i_183_ = i_183_ or 0x8
        if (!anOpenGL7664!!.a("GL_ARB_texture_env_combine")) i_183_ = i_183_ or 0x20
        if (i > -58) return 48
        val `is` = IntArray(1)
        glGetIntegerv(34018, `is`, 0)
        this.anInt7795 = `is`[0]
        glGetIntegerv(34929, `is`, 0)
        anInt7799 = `is`[0]
        glGetIntegerv(34930, `is`, 0)
        anInt7819 = `is`[0]
        if (this.anInt7795 < 2 || anInt7799 < 2 || anInt7819 < 2) i_183_ = i_183_ or 0x10
        this.aBoolean7775 = Stream.c()
        aBoolean7866 = anOpenGL7664!!.arePbuffersAvailable()
        aBoolean7873 = anOpenGL7664!!.a("GL_ARB_vertex_buffer_object")
        aBoolean7843 = anOpenGL7664!!.a("GL_ARB_multisample")
        this.aBoolean7841 = anOpenGL7664!!.a("GL_ARB_vertex_program")
        anOpenGL7664!!.a("GL_ARB_fragment_program")
        this.aBoolean7791 = anOpenGL7664!!.a("GL_ARB_vertex_shader")
        this.aBoolean7783 = anOpenGL7664!!.a("GL_ARB_fragment_shader")
        this.aBoolean7831 = anOpenGL7664!!.a("GL_EXT_texture3D")
        this.aBoolean7837 = anOpenGL7664!!.a("GL_ARB_texture_rectangle")
        this.aBoolean7863 = anOpenGL7664!!.a("GL_ARB_texture_cube_map")
        this.aBoolean7818 = anOpenGL7664!!.a("GL_ARB_texture_float")
        this.aBoolean7793 = false
        this.aBoolean7820 = anOpenGL7664!!.a("GL_EXT_framebuffer_object")
        this.aBoolean7815 = anOpenGL7664!!.a("GL_EXT_framebuffer_blit")
        this.aBoolean7807 = anOpenGL7664!!.a("GL_EXT_framebuffer_multisample")
        aBoolean7822 = this.aBoolean7807 and this.aBoolean7815
        glGetFloatv(2834, InputStream_Sub2.aFloatArray84, 0)
        aFloat7829 = InputStream_Sub2.aFloatArray84!![0]
        aFloat7800 = InputStream_Sub2.aFloatArray84!![1]
        return i_183_
    }

    override fun method3703(i: Int, i_186_: Int, i_187_: Int, i_188_: Int, i_189_: Int, i_190_: Int, var_aa: aa?, i_191_: Int, i_192_: Int, i_193_: Int, i_194_: Int, i_195_: Int) {
        var i_195_ = i_195_
        try {
            anInt7618++
            if (i_187_ != i || i_188_ != i_186_) {
                val var_aa_Sub1 = var_aa as aa_Sub1
                val class258_sub3_sub1 = var_aa_Sub1.aClass258_Sub3_Sub1_5193
                method3792(90)
                method3771((-122).toByte(), var_aa_Sub1.aClass258_Sub3_Sub1_5193)
                method3753(i_190_, 1)
                method3729(7681, (-61).toByte(), 8448)
                method3762(34167, 768, (-87).toByte(), 0)
                val f = (class258_sub3_sub1!!.aFloat9937 / (class258_sub3_sub1.anInt9940).toFloat())
                val f_196_ = (class258_sub3_sub1.aFloat9938 / (class258_sub3_sub1.anInt9939).toFloat())
                var f_197_ = -i.toFloat() + i_187_.toFloat()
                var f_198_ = i_188_.toFloat() - i_186_.toFloat()
                val f_199_ = (1.0 / sqrt((f_197_ * f_197_ + f_198_ * f_198_).toDouble())).toFloat()
                glColor4ub((i_189_ shr 16).toByte(), (i_189_ shr 8).toByte(), i_189_.toByte(), (i_189_ shr 24).toByte())
                f_197_ *= f_199_
                f_198_ *= f_199_
                i_195_ %= i_194_ + i_193_
                val f_200_ = i_193_.toFloat() * f_197_
                val f_201_ = f_198_ * i_193_.toFloat()
                var f_202_ = 0.0f
                var f_203_ = 0.0f
                var f_204_ = f_200_
                var f_205_ = f_201_
                if (i_195_ <= i_193_) {
                    f_204_ = f_197_ * (-i_195_ + i_193_).toFloat()
                    f_205_ = f_198_ * (i_193_ + -i_195_).toFloat()
                } else {
                    f_203_ = (-i_195_ + (i_193_ - -i_194_)).toFloat() * f_198_
                    f_202_ = (i_193_ - -i_194_ - i_195_).toFloat() * f_197_
                }
                var f_206_ = f_202_ + (i.toFloat() + 0.35f)
                var f_207_ = i_186_.toFloat() + 0.35f + f_203_
                val f_208_ = i_194_.toFloat() * f_197_
                val f_209_ = i_194_.toFloat() * f_198_
                while (true) {
                    if (i < i_187_) {
                        if (f_206_ > 0.35f + i_187_.toFloat()) break
                        if (i_187_.toFloat() < f_206_ + f_204_) f_204_ = i_187_.toFloat() - f_206_
                    } else {
                        if (i_187_.toFloat() + 0.35f > f_206_) break
                        if (i_187_.toFloat() > f_206_ + f_204_) f_204_ = -f_206_ + i_187_.toFloat()
                    }
                    if (i_188_ <= i_186_) {
                        if (0.35f + i_188_.toFloat() > f_207_) break
                        if (i_188_.toFloat() > f_207_ + f_205_) f_205_ = i_188_.toFloat() - f_207_
                    } else {
                        if (f_207_ > 0.35f + i_188_.toFloat()) break
                        if (i_188_.toFloat() < f_205_ + f_207_) f_205_ = i_188_.toFloat() - f_207_
                    }
                    glBegin(1)
                    glTexCoord2f(f * (-i_191_.toFloat() + f_206_), f_196_ * (-i_192_.toFloat() + f_207_))
                    glVertex2f(f_206_, f_207_)
                    glTexCoord2f((f_206_ + f_204_ - i_191_.toFloat()) * f, ((-i_192_.toFloat() + (f_207_ + f_205_)) * f_196_))
                    glVertex2f(f_204_ + f_206_, f_207_ + f_205_)
                    glEnd()
                    f_206_ += f_204_ + f_208_
                    f_207_ += f_205_ + f_209_
                    f_205_ = f_201_
                    f_204_ = f_200_
                }
                method3762(5890, 768, (-87).toByte(), 0)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.IF(" + i + ',' + i_186_ + ',' + i_187_ + ',' + i_188_ + ',' + i_189_ + ',' + i_190_ + ',' + (if (var_aa != null) "{...}" else "null") + ',' + i_191_ + ',' + i_192_ + ',' + i_193_ + ',' + i_194_ + ',' + i_195_ + ')'))
        }
    }

    override fun X(i: Int) {
        var i = i
        this.anInt7731 = 0
        anInt7521++
        while ( /**/i > 1) {
            this.anInt7731++
            i = i shr 1
        }
        this.anInt7733 = 1 shl this.anInt7731
    }

    override fun method3661(i: Int, i_210_: Int, `is`: IntArray?, is_211_: IntArray?): aa {
        try {
            anInt7589++
            return method4009(i, `is`, is_211_, 0, this, i_210_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.RF(" + i + ',' + i_210_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_211_ != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3632(`is`: IntArray?) {
        try {
            `is`!![0] = this.anInt7688
            anInt7675++
            `is`[1] = this.anInt7641
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.KE(" + (if (`is` != null) "{...}" else "null") + ')')
        }
    }

    override fun method3651(var_za: za?) {
        do {
            try {
                this.aNativeHeap7730 = (var_za as za_Sub1).aNativeHeap9770
                anInt7573++
                if (anInterface2_7797 != null) break
                val class348_sub49_sub1 = Class348_Sub49_Sub1(80)
                if (this.aBoolean7775) {
                    class348_sub49_sub1.method3400(-1.0f, (-122).toByte())
                    class348_sub49_sub1.method3400(-1.0f, (-103).toByte())
                    class348_sub49_sub1.method3400(0.0f, (-113).toByte())
                    class348_sub49_sub1.method3400(0.0f, (-112).toByte())
                    class348_sub49_sub1.method3400(1.0f, (-124).toByte())
                    class348_sub49_sub1.method3400(1.0f, (-99).toByte())
                    class348_sub49_sub1.method3400(-1.0f, (-95).toByte())
                    class348_sub49_sub1.method3400(0.0f, (-94).toByte())
                    class348_sub49_sub1.method3400(1.0f, (-118).toByte())
                    class348_sub49_sub1.method3400(1.0f, (-112).toByte())
                    class348_sub49_sub1.method3400(1.0f, (-89).toByte())
                    class348_sub49_sub1.method3400(1.0f, (-102).toByte())
                    class348_sub49_sub1.method3400(0.0f, (-109).toByte())
                    class348_sub49_sub1.method3400(1.0f, (-109).toByte())
                    class348_sub49_sub1.method3400(0.0f, (-112).toByte())
                    class348_sub49_sub1.method3400(-1.0f, (-101).toByte())
                    class348_sub49_sub1.method3400(1.0f, (-93).toByte())
                    class348_sub49_sub1.method3400(0.0f, (-123).toByte())
                    class348_sub49_sub1.method3400(0.0f, (-110).toByte())
                    class348_sub49_sub1.method3400(0.0f, (-113).toByte())
                } else {
                    class348_sub49_sub1.method3399(18291, -1.0f)
                    class348_sub49_sub1.method3399(18291, -1.0f)
                    class348_sub49_sub1.method3399(18291, 0.0f)
                    class348_sub49_sub1.method3399(18291, 0.0f)
                    class348_sub49_sub1.method3399(18291, 1.0f)
                    class348_sub49_sub1.method3399(18291, 1.0f)
                    class348_sub49_sub1.method3399(18291, -1.0f)
                    class348_sub49_sub1.method3399(18291, 0.0f)
                    class348_sub49_sub1.method3399(18291, 1.0f)
                    class348_sub49_sub1.method3399(18291, 1.0f)
                    class348_sub49_sub1.method3399(18291, 1.0f)
                    class348_sub49_sub1.method3399(18291, 1.0f)
                    class348_sub49_sub1.method3399(18291, 0.0f)
                    class348_sub49_sub1.method3399(18291, 1.0f)
                    class348_sub49_sub1.method3399(18291, 0.0f)
                    class348_sub49_sub1.method3399(18291, -1.0f)
                    class348_sub49_sub1.method3399(18291, 1.0f)
                    class348_sub49_sub1.method3399(18291, 0.0f)
                    class348_sub49_sub1.method3399(18291, 0.0f)
                    class348_sub49_sub1.method3399(18291, 0.0f)
                }
                anInterface2_7797 = method3731(2, false, 20, (class348_sub49_sub1.aByteArray7154), (class348_sub49_sub1.anInt7197))
                this.aClass123_7849 = Class123(anInterface2_7797, 5126, 3, 0)
                this.aClass123_7833 = Class123(anInterface2_7797, 5126, 2, 12)
                aClass233_7711.method1654(643267468, this)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "qo.PF(" + (if (var_za != null) "{...}" else "null") + ')')
            }
            break
        } while (false)
    }

    override fun A(i: Int, var_aa: aa?, i_212_: Int, i_213_: Int) {
        try {
            anInt7695++
            val var_aa_Sub1 = var_aa as aa_Sub1
            val class258_sub3_sub1 = var_aa_Sub1.aClass258_Sub3_Sub1_5193
            method3792(119)
            method3771((-88).toByte(), var_aa_Sub1.aClass258_Sub3_Sub1_5193)
            method3753(1, 1)
            method3729(7681, (-103).toByte(), 8448)
            method3762(34167, 768, (-87).toByte(), 0)
            val f = (class258_sub3_sub1!!.aFloat9937 / (class258_sub3_sub1.anInt9940).toFloat())
            val f_214_ = (class258_sub3_sub1.aFloat9938 / (class258_sub3_sub1.anInt9939).toFloat())
            glColor4ub((i shr 16).toByte(), (i shr 8).toByte(), i.toByte(), (i shr 24).toByte())
            glBegin(7)
            glTexCoord2f(f * (anInt7868 + -i_212_).toFloat(), (anInt7773 + -i_213_).toFloat() * f_214_)
            glVertex2i(anInt7868, anInt7773)
            glTexCoord2f(f * (-i_212_ + anInt7868).toFloat(), f_214_ * (-i_213_ + anInt7787).toFloat())
            glVertex2i(anInt7868, anInt7787)
            glTexCoord2f((-i_212_ + anInt7855).toFloat() * f, (anInt7787 + -i_213_).toFloat() * f_214_)
            glVertex2i(anInt7855, anInt7787)
            glTexCoord2f(f * (-i_212_ + anInt7855).toFloat(), f_214_ * (-i_213_ + anInt7773).toFloat())
            glVertex2i(anInt7855, anInt7773)
            glEnd()
            method3762(5890, 768, (-87).toByte(), 0)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.A(" + i + ',' + (if (var_aa != null) "{...}" else "null") + ',' + i_212_ + ',' + i_213_ + ')'))
        }
    }

    override fun method3694(): Boolean {
        anInt7593++
        return false
    }

    override fun method3624(i: Int, i_215_: Int): Interface13? {
        anInt7679++
        return null
    }

    fun method3775(bool: Boolean, i: Int, i_216_: Int, i_217_: Int) {
        anInt7531++
        if (bool != false) method3644()
        glTexEnvi(8960, 34184 + i, i_217_)
        glTexEnvi(8960, 34200 + i, i_216_)
    }

    private fun method3776(i: Int) {
        anInt7609++
        if (i != 22544) this.aNativeHeap7730 = null
        var i_218_ = 0
        while (!anOpenGL7664!!.b()) {
            if (i_218_++ > 5) throw RuntimeException("")
            Class286_Sub5.method2161((-3).toByte(), 1000L)
        }
    }

    override fun method3688(i: Int, i_219_: Int, i_220_: Int, i_221_: Int, i_222_: Int, i_223_: Int, i_224_: Int) {
        anInt7662++
        glLineWidth(i_223_.toFloat())
        method3709(i, i_219_, i_220_, i_221_, i_222_, i_224_)
        glLineWidth(1.0f)
    }

    override fun ra(i: Int, i_225_: Int, i_226_: Int, i_227_: Int) {
        anInt7660++
        this.anInt7788 = i
        this.anInt7848 = i_226_
        this.anInt7806 = i_225_
        this.aBoolean7846 = true
        this.anInt7809 = i_227_
    }

    private fun method3777(i: Int) {
        anInt7632++
        aFloatArray7779[10] = aFloat7854
        aFloatArray7779[14] = aFloat7842
        this.aFloat7875 = anInt7814.toFloat()
        if (i != -24051) this.aClass64_Sub3_7821 = null
        this.aFloat7874 = (aFloatArray7779[14] - anInt7814.toFloat()) / aFloatArray7779[10]
    }

    override fun T(i: Int, i_228_: Int, i_229_: Int, i_230_: Int) {
        if (i_228_ > anInt7773) anInt7773 = i_228_
        anInt7648++
        if (anInt7787 > i_230_) anInt7787 = i_230_
        if (i > anInt7868) anInt7868 = i
        if (i_229_ < anInt7855) anInt7855 = i_229_
        glEnable(3089)
        method3772(125.toByte())
        method3811(11.toByte())
    }

    override fun method3669(canvas: Canvas?, i: Int, i_231_: Int) {
        do {
            try {
                anInt7701++
                var l = 0L
                if (canvas != null && aCanvas7626 !== canvas) {
                    if (aHashtable7577.containsKey(canvas)) {
                        val var_long = aHashtable7577.get(canvas) as Long
                        l = var_long
                    }
                } else l = aLong7553
                if (l == 0L) throw RuntimeException()
                anOpenGL7664!!.surfaceResized(l)
                if (aCanvas7575 !== canvas) break
                method3745(117.toByte())
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.HF(" + (if (canvas != null) "{...}" else "null") + ',' + i + ',' + i_231_ + ')'))
            }
            break
        } while (false)
    }

    override fun method3711(`is`: IntArray?, i: Int, i_232_: Int, i_233_: Int, i_234_: Int, bool: Boolean): Class105 {
        try {
            anInt7522++
            return Class105_Sub2(this, i_233_, i_234_, `is`, i, i_232_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.BE(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_232_ + ',' + i_233_ + ',' + i_234_ + ',' + bool + ')'))
        }
    }

    private fun method3778(i: Byte) {
        if (anInt7765 != 1) {
            method3763(5888)
            method3807(false, 2)
            method3728(false, 48)
            method3752(107, false)
            method3748(0, false)
            method3771((-122).toByte(), null)
            method3757(-2, -45)
            method3761(0, 1)
            anInt7765 = 1
        }
        if (i <= -115) anInt7594++
    }

    private fun method3779(i: Int) {
        InputStream_Sub2.aFloatArray84!![3] = 1.0f
        anInt7588++
        InputStream_Sub2.aFloatArray84!![0] = this.aFloat7832 * this.aFloat7781
        InputStream_Sub2.aFloatArray84!![1] = this.aFloat7816 * this.aFloat7832
        if (i == 29890) {
            InputStream_Sub2.aFloatArray84!![2] = this.aFloat7823 * this.aFloat7832
            glLightfv(16384, 4609, InputStream_Sub2.aFloatArray84, 0)
            InputStream_Sub2.aFloatArray84!![2] = this.aFloat7823 * -this.aFloat7871
            InputStream_Sub2.aFloatArray84!![3] = 1.0f
            InputStream_Sub2.aFloatArray84!![1] = this.aFloat7816 * -this.aFloat7871
            InputStream_Sub2.aFloatArray84!![0] = this.aFloat7781 * -this.aFloat7871
            glLightfv(16385, 4609, InputStream_Sub2.aFloatArray84, 0)
        }
    }

    @Synchronized
    fun method3780(i: Int, i_235_: Int, i_236_: Int) {
        anInt7616++
        val class348_sub35 = Class348_Sub35(i)
        class348_sub35.aLong4291 = i_236_.toLong()
        aClass262_7751!!.method1999(class348_sub35, -20180)
        if (i_235_ != -1) method3733(-17, -42, -40, null, true)
    }

    override fun M(): Int {
        anInt7562++
        val i = anInt7881
        anInt7881 = 0
        return i
    }

    fun method3781(i: Byte, i_237_: Int): Int {
        anInt7613++
        if (i_237_ == 1) return 7681
        if (i_237_ == 0) return 8448
        if (i_237_ != 2) {
            if (i_237_ != 3) {
                if (i_237_ == 4) return 34023
            } else return 260
        } else return 34165
        if (i.toInt() != 17) anInt7814 = -39
        throw IllegalArgumentException()
    }

    fun method3782(interface11: Interface11?, i: Int) {
        try {
            anInt7640++
            if (anInt7738 >= 3) throw RuntimeException()
            if (i != 327685) method3688(-94, -9, -90, -108, 41, -52, 70)
            if (anInt7738 >= 0) anInterface11Array7741[anInt7738]!!.method45((-47).toByte())
            anInterface11_7745 = interface11
            anInterface11Array7741[++anInt7738] = interface11
            anInterface11_7745!!.method49(-27141)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.HD(" + (if (interface11 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    override fun method3628(i: Int, i_238_: Int, i_239_: Int, i_240_: Int, i_241_: Int, i_242_: Int) {
        anInt7615++
        val f = 0.35f + i.toFloat()
        val f_243_ = 0.35f + i_238_.toFloat()
        val f_244_ = f + i_239_.toFloat() - 1.0f
        method3778((-119).toByte())
        val f_245_ = -1.0f + (f_243_ + i_240_.toFloat())
        method3753(i_242_, 1)
        glColor4ub((i_241_ shr 16).toByte(), (i_241_ shr 8).toByte(), i_241_.toByte(), (i_241_ shr 24).toByte())
        if (aBoolean7843) glDisable(32925)
        glBegin(2)
        glVertex2f(f, f_243_)
        glVertex2f(f, f_245_)
        glVertex2f(f_244_, f_245_)
        glVertex2f(f_244_, f_243_)
        glEnd()
        if (aBoolean7843) glEnable(32925)
    }

    override fun H(i: Int, i_246_: Int, i_247_: Int, `is`: IntArray?) {
        try {
            anInt7637++
            val f = ((this.aClass101_Sub3_7760.aFloat5751) + (i.toFloat() * (this.aClass101_Sub3_7760.aFloat5756) + (this.aClass101_Sub3_7760.aFloat5754) * i_246_.toFloat() + (this.aClass101_Sub3_7760.aFloat5784) * i_247_.toFloat()))
            if (f == 0.0f) {
                `is`!![2] = -1
                `is`[1] = `is`[2]
                `is`[0] = `is`[1]
            } else {
                val i_248_ = ((this.aClass101_Sub3_7760.aFloat5747 + ((this.aClass101_Sub3_7760.aFloat5781) * i_247_.toFloat() + ((this.aClass101_Sub3_7760.aFloat5750) * i_246_.toFloat() + (this.aClass101_Sub3_7760.aFloat5770) * i.toFloat()))) * this.anInt7771.toFloat() / f).toInt()
                val i_249_ = ((i.toFloat() * this.aClass101_Sub3_7760.aFloat5761 + (this.aClass101_Sub3_7760.aFloat5769) * i_246_.toFloat() + (this.aClass101_Sub3_7760.aFloat5762) * i_247_.toFloat() + (this.aClass101_Sub3_7760.aFloat5772)) * this.anInt7794.toFloat() / f).toInt()
                `is`!![0] = (-this.aFloat7872 + i_248_.toFloat()).toInt()
                `is`[2] = f.toInt()
                `is`[1] = (-this.aFloat7836 + i_249_.toFloat()).toInt()
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.H(" + i + ',' + i_246_ + ',' + i_247_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3654(): Class101 {
        anInt7716++
        return Class101_Sub3()
    }

    override fun method3671(): Boolean {
        anInt7670++
        if (aClass348_Sub5_Sub1_7721 != null) {
            if (!aClass348_Sub5_Sub1_7721!!.method2760(1.toByte())) {
                if (!aClass18_7720!!.method274(aClass348_Sub5_Sub1_7721!!, true)) return false
                aClass354_7723.method3463((-110).toByte())
            }
            return true
        }
        return false
    }

    private fun method3783(i: Int) {
        anInt7527++
        var i_250_: Int
        i_250_ = i
        while (anInt7862 > i_250_) {
            val class348_sub1 = aClass348_Sub1Array7858[i_250_]!!
            Class328_Sub1.aFloatArray6514!![0] = class348_sub1.method2724(-1).toFloat()
            val i_251_ = i_250_ + 16386
            Class328_Sub1.aFloatArray6514!![1] = class348_sub1.method2722(127).toFloat()
            Class328_Sub1.aFloatArray6514!![2] = class348_sub1.method2717(77.toByte()).toFloat()
            Class328_Sub1.aFloatArray6514!![3] = 1.0f
            glLightfv(i_251_, 4611, Class328_Sub1.aFloatArray6514, 0)
            val i_252_ = class348_sub1.method2720(-1)
            val f = class348_sub1.method2721(-76) / 255.0f
            Class328_Sub1.aFloatArray6514!![2] = Class139.method1166(i_252_, 255).toFloat() * f
            Class328_Sub1.aFloatArray6514!![0] = ((Class139.method1166(16762087, i_252_) shr 16).toFloat() * f)
            Class328_Sub1.aFloatArray6514!![1] = ((Class139.method1166(i_252_, 65533) shr 8).toFloat() * f)
            glLightfv(i_251_, 4609, Class328_Sub1.aFloatArray6514, 0)
            glLightf(i_251_, 4617, 1.0f / (class348_sub1.method2723(-1) * class348_sub1.method2723(-1)).toFloat())
            glEnable(i_251_)
            i_250_++
        }
        while ( /**/anInt7839 > i_250_) {
            glDisable(i_250_ + 16386)
            i_250_++
        }
        anInt7839 = anInt7862
    }

    fun method3784(i: Byte) {
        if (anInt7765 != 8) {
            method3740(-14388)
            method3807(true, 2)
            method3752(114, true)
            method3748(i + 62, true)
            method3753(1, 1)
            anInt7765 = 8
        }
        anInt7665++
        if (i.toInt() != -62) aCanvas7626 = null
    }

    fun method3785(i: Int, i_253_: Int): Int {
        anInt7682++
        if (i == 5121 || i == 5120) return 1
        if (i_253_ != 4) this.aBoolean7793 = false
        if (i == 5123 || i == 5122) return 2
        if (i == 5125 || i == 5124 || i == 5126) return 4
        throw IllegalArgumentException("")
    }

    override fun method3685(class98: Class98, i: Int) {
        try {
            aClass233_7711.method1651(this, (-116).toByte(), i, class98)
            anInt7687++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.FG(" + (if (class98 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    private fun method3786(bool: Boolean) {
        anInt7630++
        aClass258Array7828 = arrayOfNulls<Class258>(this.anInt7795)
        this.aClass258_Sub3_7827 = Class258_Sub3(this, 3553, 6408, 1, 1)
        Class258_Sub3(this, 3553, 6408, 1, 1)
        Class258_Sub3(this, 3553, 6408, 1, 1)
        this.aClass64_Sub3_7864 = Class64_Sub3(this)
        this.aClass64_Sub3_7838 = Class64_Sub3(this)
        this.aClass64_Sub3_7803 = Class64_Sub3(this)
        this.aClass64_Sub3_7834 = Class64_Sub3(this)
        this.aClass64_Sub3_7840 = Class64_Sub3(this)
        this.aClass64_Sub3_7780 = Class64_Sub3(this)
        this.aClass64_Sub3_7802 = Class64_Sub3(this)
        this.aClass64_Sub3_7821 = Class64_Sub3(this)
        this.aClass64_Sub3_7844 = Class64_Sub3(this)
        this.aClass64_Sub3_7785 = Class64_Sub3(this)
        if (this.aBoolean7820) {
            this.aClass206_7778 = Class206(this)
            Class206(this)
        }
    }

    private fun method3787(i: Int) {
        InputStream_Sub2.aFloatArray84!![3] = 1.0f
        anInt7661++
        InputStream_Sub2.aFloatArray84!![0] = this.aFloat7768 * this.aFloat7781
        InputStream_Sub2.aFloatArray84!![2] = this.aFloat7823 * this.aFloat7768
        InputStream_Sub2.aFloatArray84!![1] = this.aFloat7816 * this.aFloat7768
        glLightModelfv(2899, InputStream_Sub2.aFloatArray84, 0)
        if (i >= -13) anInt7742 = 102
    }

    override fun c(): Class365 {
        anInt7607++
        var i = -1
        if (aString7845!!.indexOf("nvidia") == -1) {
            if (aString7845!!.indexOf("intel") != -1) i = 32902
            else if (aString7845!!.indexOf("ati") != -1) i = 4098
        } else i = 4318
        return Class365(i, "OpenGL", anInt7789, aString7790, 0L)
    }

    override fun da(i: Int, i_254_: Int, i_255_: Int, `is`: IntArray?) {
        try {
            anInt7528++
            val f = ((i_254_.toFloat() * (this.aClass101_Sub3_7760.aFloat5754)) + (this.aClass101_Sub3_7760.aFloat5756) * i.toFloat() + (this.aClass101_Sub3_7760.aFloat5784) * i_255_.toFloat() + (this.aClass101_Sub3_7760.aFloat5751))
            if (f >= this.anInt7826.toFloat() && f <= anInt7814.toFloat()) {
                val i_256_ = (this.anInt7771.toFloat() * ((i_254_.toFloat() * (this.aClass101_Sub3_7760.aFloat5750)) + (this.aClass101_Sub3_7760.aFloat5770) * i.toFloat() + (this.aClass101_Sub3_7760.aFloat5781) * i_255_.toFloat() + (this.aClass101_Sub3_7760.aFloat5747)) / f).toInt()
                val i_257_ = ((this.aClass101_Sub3_7760.aFloat5772 + ((i.toFloat() * (this.aClass101_Sub3_7760.aFloat5761)) + (this.aClass101_Sub3_7760.aFloat5769) * i_254_.toFloat() + (this.aClass101_Sub3_7760.aFloat5762) * i_255_.toFloat())) * this.anInt7794.toFloat() / f).toInt()
                if (!(this.aFloat7872 <= i_256_.toFloat()) || !(i_256_.toFloat() <= this.aFloat7835) || !(this.aFloat7836 <= i_257_.toFloat()) || !(this.aFloat7830 >= i_257_.toFloat())) {
                    `is`!![2] = -1
                    `is`[1] = `is`[2]
                    `is`[0] = `is`[1]
                } else {
                    `is`!![2] = f.toInt()
                    `is`[0] = (-this.aFloat7872 + i_256_.toFloat()).toInt()
                    `is`[1] = (-this.aFloat7836 + i_257_.toFloat()).toInt()
                }
            } else {
                `is`!![2] = -1
                `is`[1] = `is`[2]
                `is`[0] = `is`[1]
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.da(" + i + ',' + i_254_ + ',' + i_255_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    fun method3788(i: Int) {
        anInt7647++
        if (i == -18516) glPushMatrix()
    }

    override fun F(i: Int, i_258_: Int) {
        anInt7719++
    }

    override fun method3687(interface4: Interface4?) {
        try {
            anInt7590++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.IA(" + (if (interface4 != null) "{...}" else "null") + ')')
        }
    }

    public override fun KA(i: Int, i_259_: Int, i_260_: Int, i_261_: Int) {
        var i = i
        var i_259_ = i_259_
        var i_260_ = i_260_
        var i_261_ = i_261_
        if (i_259_ < 0) i_259_ = 0
        anInt7717++
        if (i_260_ > this.anInt7688) i_260_ = this.anInt7688
        if (i < 0) i = 0
        if (i_261_ > this.anInt7641) i_261_ = this.anInt7641
        anInt7855 = i_260_
        anInt7787 = i_261_
        anInt7773 = i_259_
        anInt7868 = i
        glEnable(3089)
        method3772(126.toByte())
        method3811(11.toByte())
    }

    fun method3789(i: Byte, f: Float) {
        if (aFloat7851 != f) {
            aFloat7851 = f
            if (anInt7865 == 3) method3747((-63).toByte())
        }
        if (i <= -101) anInt7545++
    }

    public override fun la() {
        anInt7773 = 0
        anInt7642++
        anInt7787 = this.anInt7641
        anInt7855 = this.anInt7688
        anInt7868 = 0
        glDisable(3089)
        method3772(125.toByte())
    }

    override fun C(bool: Boolean) {
        aBoolean7870 = bool
        anInt7602++
        method3795(-30199)
    }

    override fun method3663() {
        anInt7604++
    }

    fun method3790(i: Int, i_262_: Int, i_263_: Int) {
        if (i > 94) {
            anInt7724++
            anInt7867 = i_262_
            anInt7770 = i_263_
            method3809(true)
            method3811(11.toByte())
        }
    }

    override fun JA(i: Int, i_264_: Int, i_265_: Int, i_266_: Int, i_267_: Int, i_268_: Int): Int {
        anInt7652++
        var i_269_ = 0
        var f = ((i_265_.toFloat() * (this.aClass101_Sub3_7760.aFloat5784)) + (i.toFloat() * this.aClass101_Sub3_7760.aFloat5756 + (i_264_.toFloat() * (this.aClass101_Sub3_7760.aFloat5754))) + (this.aClass101_Sub3_7760.aFloat5751))
        if (f < 1.0f) f = 1.0f
        var f_270_ = ((i_268_.toFloat() * (this.aClass101_Sub3_7760.aFloat5784)) + ((i_267_.toFloat() * (this.aClass101_Sub3_7760.aFloat5754)) + (this.aClass101_Sub3_7760.aFloat5756) * i_266_.toFloat()) + (this.aClass101_Sub3_7760.aFloat5751))
        if (f_270_ < 1.0f) f_270_ = 1.0f
        if (!(this.anInt7826.toFloat() > f) || !(this.anInt7826.toFloat() > f_270_)) {
            if (f > anInt7814.toFloat() && f_270_ > anInt7814.toFloat()) i_269_ = i_269_ or 0x20
        } else i_269_ = i_269_ or 0x10
        val i_271_ = (((this.aClass101_Sub3_7760.aFloat5781) * i_265_.toFloat() + ((this.aClass101_Sub3_7760.aFloat5750 * i_264_.toFloat()) + (this.aClass101_Sub3_7760.aFloat5770 * i.toFloat())) + (this.aClass101_Sub3_7760.aFloat5747)) * this.anInt7771.toFloat() / f).toInt()
        val i_272_ = (this.anInt7771.toFloat() * ((i_268_.toFloat() * this.aClass101_Sub3_7760.aFloat5781) + ((this.aClass101_Sub3_7760.aFloat5770 * i_266_.toFloat()) + (this.aClass101_Sub3_7760.aFloat5750 * i_267_.toFloat())) + this.aClass101_Sub3_7760.aFloat5747) / f_270_).toInt()
        if (!(i_271_.toFloat() < this.aFloat7872) || !(this.aFloat7872 > i_272_.toFloat())) {
            if (i_271_.toFloat() > this.aFloat7835 && i_272_.toFloat() > this.aFloat7835) i_269_ = i_269_ or 0x2
        } else i_269_ = i_269_ or 0x1
        val i_273_ = (this.anInt7794.toFloat() * ((this.aClass101_Sub3_7760.aFloat5762) * i_265_.toFloat() + (i_264_.toFloat() * this.aClass101_Sub3_7760.aFloat5769 + i.toFloat() * this.aClass101_Sub3_7760.aFloat5761) + this.aClass101_Sub3_7760.aFloat5772) / f).toInt()
        val i_274_ = (((this.aClass101_Sub3_7760.aFloat5772) + ((i_266_.toFloat() * this.aClass101_Sub3_7760.aFloat5761) + i_267_.toFloat() * this.aClass101_Sub3_7760.aFloat5769 + (this.aClass101_Sub3_7760.aFloat5762 * i_268_.toFloat()))) * this.anInt7794.toFloat() / f_270_).toInt()
        if (!(i_273_.toFloat() < this.aFloat7836) || !(this.aFloat7836 > i_274_.toFloat())) {
            if (i_273_.toFloat() > this.aFloat7830 && i_274_.toFloat() > this.aFloat7830) i_269_ = i_269_ or 0x8
        } else i_269_ = i_269_ or 0x4
        return i_269_
    }

    override fun method3693(): Boolean {
        anInt7684++
        return true
    }

    override fun method3629(i: Int, i_275_: Int, bool: Boolean): Class105 {
        anInt7625++
        return Class105_Sub2(this, i, i_275_, bool)
    }

    override fun method3678(i: Int) {
        anInt7663++
        method3797(0)
    }

    private fun method3791(i: Int) {
        anInt7543++
        method3757(-2, -69)
        for (i_276_ in this.anInt7795 - 1 downTo 0) {
            method3738(-15039, i_276_)
            method3771((-88).toByte(), null)
            glTexEnvi(8960, 8704, 34160)
        }
        method3729(8448, 119.toByte(), 8448)
        method3762(34168, 770, (-87).toByte(), 2)
        method3767(-21974)
        anInt7764 = 1
        glEnable(3042)
        glBlendFunc(770, 771)
        anInt7762 = 1
        glEnable(3008)
        glAlphaFunc(516, 0.0f)
        aBoolean7761 = true
        glColorMask(true, true, true, true)
        aBoolean7758 = true
        method3807(true, 2)
        method3728(true, 71)
        method3752(124, true)
        method3748(0, true)
        method3755(i xor 0x651d.inv())
        anOpenGL7664!!.setSwapInterval(0)
        glShadeModel(7425)
        glClearDepth(1.0f)
        glDepthFunc(515)
        glPolygonMode(1028, 6914)
        glEnable(2884)
        glCullFace(1029)
        glMatrixMode(5888)
        glLoadIdentity()
        glColorMaterial(1028, 5634)
        glEnable(2903)
        val fs = floatArrayOf(0.0f, 0.0f, 0.0f, 1.0f)
        for (i_277_ in 0..7) {
            val i_278_ = 16384 + i_277_
            glLightfv(i_278_, 4608, fs, 0)
            glLightf(i_278_, 4615, 0.0f)
            glLightf(i_278_, 4616, 0.0f)
        }
        glEnable(16384)
        glEnable(16385)
        glFogf(2914, 0.95f)
        glFogi(2917, 9729)
        if (i != 25858) this.aClass64_Sub3_7864 = null
        glHint(3156, 4353)
        this.anInt7856 = -1
        anInt7808 = this.anInt7856
        la()
    }

    fun method3792(i: Int) {
        if (i < 45) method3777(-72)
        if (anInt7765 != 2) {
            method3763(5888)
            method3807(false, 2)
            method3728(false, 66)
            method3752(115, false)
            method3748(0, false)
            method3757(-2, -67)
            anInt7765 = 2
        }
        anInt7608++
    }

    override fun I(): Int {
        anInt7551++
        val i = anInt7878
        anInt7878 = 0
        return i
    }

    fun method3793(i: Int, interface8: Interface8?) {
        do {
            try {
                if (i == 1) {
                    anInt7560++
                    if (anInterface8_7817 === interface8) break
                    if (aBoolean7873) glBindBufferARB(34963, interface8!!.method33(-23923))
                    anInterface8_7817 = interface8
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.OE(" + i + ',' + (if (interface8 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    fun method3794(class123: Class123?, class123_279_: Class123?, i: Int, class123_280_: Class123?, class123_281_: Class123?) {
        try {
            if (class123 != null) {
                method3750(i + 26493, class123.anInterface2_1811)
                glVertexPointer(class123.aByte1814.toInt(), class123.aShort1810.toInt(), anInterface2_7852!!.method13((-97).toByte()), (anInterface2_7852!!.method12(42.toByte()) - -(class123.aByte1812).toLong()))
                glEnableClientState(32884)
            } else glDisableClientState(32884)
            anInt7529++
            if (class123_281_ != null) {
                method3750(56, class123_281_.anInterface2_1811)
                glNormalPointer(class123_281_.aShort1810.toInt(), anInterface2_7852!!.method13((-97).toByte()), (anInterface2_7852!!.method12(42.toByte()) - -(class123_281_.aByte1812).toLong()))
                glEnableClientState(32885)
            } else glDisableClientState(32885)
            if (class123_279_ != null) {
                method3750(67, class123_279_.anInterface2_1811)
                glColorPointer(class123_279_.aByte1814.toInt(), class123_279_.aShort1810.toInt(), anInterface2_7852!!.method13((-97).toByte()), (anInterface2_7852!!.method12(42.toByte()) + (class123_279_.aByte1812).toLong()))
                glEnableClientState(32886)
            } else glDisableClientState(32886)
            if (i == -26411) {
                if (class123_280_ != null) {
                    method3750(119, class123_280_.anInterface2_1811)
                    glTexCoordPointer(class123_280_.aByte1814.toInt(), class123_280_.aShort1810.toInt(), anInterface2_7852!!.method13((-97).toByte()), (anInterface2_7852!!.method12(42.toByte()) - -class123_280_.aByte1812.toLong()))
                    glEnableClientState(32888)
                } else glDisableClientState(32888)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.KB(" + (if (class123 != null) "{...}" else "null") + ',' + (if (class123_279_ != null) "{...}" else "null") + ',' + i + ',' + (if (class123_280_ != null) "{...}" else "null") + ',' + (if (class123_281_ != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3704(): Int {
        anInt7672++
        return 4
    }

    override fun method3634(interface3: Interface3?, interface13: Interface13?): Interface4? {
        try {
            anInt7596++
            return null
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.NB(" + (if (interface3 != null) "{...}" else "null") + ',' + (if (interface13 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3640(): Class101 {
        anInt7650++
        return this.aClass101_Sub3_7760
    }

    private fun method3795(i: Int) {
        glDepthMask(aBoolean7759 && aBoolean7870)
        anInt7578++
        if (i != -30199) K(null)
    }

    override fun method3705(): Class101 {
        anInt7587++
        return aClass101_Sub3_7725
    }

    public override fun i(): Int {
        anInt7628++
        return this.anInt7826
    }

    override fun ya() {
        anInt7534++
        method3748(0, true)
        glClear(256)
    }

    override fun method3647(bool: Boolean) {
        anInt7691++
    }

    fun method3796(i: Int) {
        glLightfv(i, 4611, this.aFloatArray7825, 0)
        anInt7536++
        glLightfv(16385, 4611, aFloatArray7811, 0)
    }

    override fun method3639(): Boolean {
        anInt7667++
        return aClass100_7707!!.method889((-91).toByte(), 3)
    }

    override fun method3666(): Boolean {
        anInt7537++
        return aClass348_Sub5_Sub1_7721 != null && aClass348_Sub5_Sub1_7721!!.method2760(1.toByte())
    }

    override fun method3642(i: Int, class348_sub1s: Array<Class348_Sub1?>?) {
        do {
            try {
                for (i_282_ in 0..<i) aClass348_Sub1Array7858[i_282_] = class348_sub1s!![i_282_]
                anInt7610++
                anInt7862 = i
                if (anInt7865 == 1) break
                method3783(0)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qo.FF(" + i + ',' + (if (class348_sub1s != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    override fun method3630(bool: Boolean) {
        anInt7620++
    }

    private fun method3797(i: Int) {
        if (i != 0) this.anIntArray7883 = null
        anInt7546++
        anOpenGL7664!!.a()
    }

    override fun pa() {
        anInt7524++
        this.aBoolean7846 = false
    }

    override fun r(i: Int, i_283_: Int, i_284_: Int, i_285_: Int, i_286_: Int, i_287_: Int, i_288_: Int): Int {
        anInt7669++
        val f = ((i_284_.toFloat() * (this.aClass101_Sub3_7760.aFloat5784)) + (i_283_.toFloat() * (this.aClass101_Sub3_7760.aFloat5754) + i.toFloat() * (this.aClass101_Sub3_7760.aFloat5756)) + (this.aClass101_Sub3_7760.aFloat5751))
        val f_289_ = ((i_287_.toFloat() * (this.aClass101_Sub3_7760.aFloat5784)) + ((this.aClass101_Sub3_7760.aFloat5756) * i_285_.toFloat() + (i_286_.toFloat() * (this.aClass101_Sub3_7760.aFloat5754))) + (this.aClass101_Sub3_7760.aFloat5751))
        var i_290_ = 0
        if (!(f < this.anInt7826.toFloat()) || !(this.anInt7826.toFloat() > f_289_)) {
            if (anInt7814.toFloat() < f && f_289_ > anInt7814.toFloat()) i_290_ = i_290_ or 0x20
        } else i_290_ = i_290_ or 0x10
        val i_291_ = (this.anInt7771.toFloat() * ((this.aClass101_Sub3_7760.aFloat5781) * i_284_.toFloat() + ((this.aClass101_Sub3_7760.aFloat5750 * i_283_.toFloat()) + (this.aClass101_Sub3_7760.aFloat5770 * i.toFloat())) + this.aClass101_Sub3_7760.aFloat5747) / i_288_.toFloat()).toInt()
        val i_292_ = (this.anInt7771.toFloat() * ((this.aClass101_Sub3_7760.aFloat5747) + ((this.aClass101_Sub3_7760.aFloat5781 * i_287_.toFloat()) + ((i_285_.toFloat() * (this.aClass101_Sub3_7760.aFloat5770)) + (this.aClass101_Sub3_7760.aFloat5750) * i_286_.toFloat()))) / i_288_.toFloat()).toInt()
        if (!(this.aFloat7872 > i_291_.toFloat()) || !(this.aFloat7872 > i_292_.toFloat())) {
            if (this.aFloat7835 < i_291_.toFloat() && i_292_.toFloat() > this.aFloat7835) i_290_ = i_290_ or 0x2
        } else i_290_ = i_290_ or 0x1
        val i_293_ = (((this.aClass101_Sub3_7760.aFloat5772) + ((this.aClass101_Sub3_7760.aFloat5762 * i_284_.toFloat()) + ((this.aClass101_Sub3_7760.aFloat5761 * i.toFloat()) + (i_283_.toFloat() * (this.aClass101_Sub3_7760.aFloat5769))))) * this.anInt7794.toFloat() / i_288_.toFloat()).toInt()
        val i_294_ = (this.anInt7794.toFloat() * ((i_287_.toFloat() * this.aClass101_Sub3_7760.aFloat5762) + (i_286_.toFloat() * this.aClass101_Sub3_7760.aFloat5769 + (this.aClass101_Sub3_7760.aFloat5761 * i_285_.toFloat())) + this.aClass101_Sub3_7760.aFloat5772) / i_288_.toFloat()).toInt()
        if (!(this.aFloat7836 > i_293_.toFloat()) || !(i_294_.toFloat() < this.aFloat7836)) {
            if (i_293_.toFloat() > this.aFloat7830 && this.aFloat7830 < i_294_.toFloat()) i_290_ = i_290_ or 0x8
        } else i_290_ = i_290_ or 0x4
        return i_290_
    }

    fun method3798(i: Int, i_295_: Int): Int {
        anInt7698++
        if (i_295_ != 2) this.aFloat7872 = -1.3399854f
        if (i != 6406 && i != 6409) {
            if (i != 6410 && i != 34846 && i != 34844) {
                if (i == 6407) return 3
                if (i == 6408 || i == 34847) return 4
                if (i == 34843) return 6
                if (i == 34842) return 8
                if (i == 6402) return 3
                if (i == 6401) return 1
            } else return 2
        } else return 1
        throw IllegalArgumentException("")
    }

    private fun method3799(f: Float, f_296_: Float, f_297_: Float, i: Byte) {
        glMatrixMode(5890)
        anInt7585++
        if (aBoolean7860) glLoadIdentity()
        glTranslatef(f_297_, f, f_296_)
        val i_298_ = -9 / ((81 - i) / 44)
        glMatrixMode(5888)
        aBoolean7860 = true
    }

    @Synchronized
    fun method3800(i: Int, i_299_: Int) {
        anInt7570++
        val class348_sub35 = Class348_Sub35(i_299_)
        if (i > 71) aClass262_7753.method1999(class348_sub35, -20180)
    }

    override fun method3698() {
        aClass18_7720!!.method272(-53)
        anInt7595++
    }

    override fun P(i: Int, i_300_: Int, i_301_: Int, i_302_: Int, i_303_: Int) {
        method3778((-124).toByte())
        anInt7583++
        method3753(i_303_, 1)
        val f = 0.35f + i.toFloat()
        glColor4ub((i_302_ shr 16).toByte(), (i_302_ shr 8).toByte(), i_302_.toByte(), (i_302_ shr 24).toByte())
        val f_304_ = i_300_.toFloat() + 0.35f
        glBegin(1)
        glVertex2f(f, f_304_)
        glVertex2f(f, i_301_.toFloat() + f_304_)
        glEnd()
    }

    override fun E(): Int {
        anInt7539++
        return (anInt7750 + this.anInt7748 + this.anInt7747)
    }

    override fun method3706(class299: Class299?, class299_305_: Class299?, f: Float, class299_306_: Class299?): Class299? {
        try {
            anInt7658++
            if (class299 != null && class299_305_ != null && this.aBoolean7863 && this.aBoolean7820) {
                var class299_sub1_sub2: Class299_Sub1_Sub2? = null
                val class299_sub1 = class299 as Class299_Sub1
                val class299_sub1_307_ = class299_305_ as Class299_Sub1
                val class258_sub2 = class299_sub1.method2256((-121).toByte())
                val class258_sub2_308_ = class299_sub1_307_.method2256((-121).toByte())
                if (class258_sub2 != null && class258_sub2_308_ != null) {
                    val i = (max(class258_sub2_308_.anInt8538, class258_sub2.anInt8538))
                    if (class299_306_ !== class299 && class299_305_ !== class299_306_ && class299_306_ is Class299_Sub1_Sub2) {
                        val class299_sub1_sub2_309_ = class299_306_
                        if (i == class299_sub1_sub2_309_.method2262(65534)) class299_sub1_sub2 = class299_sub1_sub2_309_
                    }
                    if (class299_sub1_sub2 == null) class299_sub1_sub2 = Class299_Sub1_Sub2(this, i)
                    if (class299_sub1_sub2.method2261(class258_sub2, f, 65534, class258_sub2_308_)) return class299_sub1_sub2
                }
            }
            if (f < 0.5f) return class299
            return class299_305_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.SD(" + (if (class299 != null) "{...}" else "null") + ',' + (if (class299_305_ != null) "{...}" else "null") + ',' + f + ',' + (if (class299_306_ != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3677(canvas: Canvas?) {
        try {
            aCanvas7575 = null
            anInt7621++
            aLong7636 = 0L
            if (canvas == null || canvas === aCanvas7626) {
                aCanvas7575 = aCanvas7626
                aLong7636 = aLong7553
            } else if (aHashtable7577.containsKey(canvas)) {
                val var_long = aHashtable7577.get(canvas) as Long
                aLong7636 = var_long
                aCanvas7575 = canvas
            }
            if (aCanvas7575 == null || aLong7636 == 0L) throw RuntimeException()
            anOpenGL7664!!.setSurface(aLong7636)
            method3745(92.toByte())
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "qo.MF(" + (if (canvas != null) "{...}" else "null") + ')')
        }
    }

    fun method3801(bool: Boolean, i: Int, i_310_: Int) {
        val i_311_ = 57 / ((39 - i_310_) / 52)
        anInt7644++
        method3746(bool, i, true, 115)
    }

    override fun method3667(i: Int, i_312_: Int): Int {
        anInt7627++
        return i_312_ xor (i and i_312_)
    }

    @Throws(Exception_Sub1::class)
    override fun method3707(rectangles: Array<Rectangle?>?, i: Int, i_313_: Int, i_314_: Int) {
        try {
            method3626(i_313_, i_314_)
            anInt7584++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.UA(" + (if (rectangles != null) "{...}" else "null") + ',' + i + ',' + i_313_ + ',' + i_314_ + ')'))
        }
    }

    private fun method3803(i: Int) {
        aFloat7824 = -aFloat7786 + (anInt7814 - this.anInt7813).toFloat()
        anInt7639++
        this.aFloat7792 = aFloat7824 - aFloat7857 * this.anInt7782.toFloat()
        if (this.anInt7826.toFloat() > this.aFloat7792) this.aFloat7792 = this.anInt7826.toFloat()
        glFogf(2915, this.aFloat7792)
        glFogf(2916, aFloat7824)
        InputStream_Sub2.aFloatArray84!![0] = (Class139.method1166(i, this.anInt7856).toFloat() / 1.671168E7f)
        InputStream_Sub2.aFloatArray84!![1] = (Class139.method1166(this.anInt7856, 65280).toFloat() / 65280.0f)
        InputStream_Sub2.aFloatArray84!![2] = (Class139.method1166(this.anInt7856, 255).toFloat() / 255.0f)
        glFogfv(2918, InputStream_Sub2.aFloatArray84, 0)
    }

    fun method3804(bool: Boolean, i: Byte) {
        if (!bool == aBoolean7805) {
            aBoolean7805 = bool
            method3768((-117).toByte())
        }
        if (i < -56) anInt7564++
    }

    @Throws(Exception_Sub1::class)
    override fun method3626(i: Int, i_457_: Int) {
        try {
            anOpenGL7664!!.swapBuffers()
        } catch (exception: Exception) {
            /* empty */
        }
        anInt7624++
    }

    override fun f(i: Int, i_458_: Int) {
        anInt7606++
        if (i != this.anInt7826 || anInt7814 != i_458_) {
            this.anInt7826 = i
            anInt7814 = i_458_
            method3806(98)
            method3803(16711680)
            if (anInt7865 == 3) method3747((-63).toByte())
            else if (anInt7865 == 2) method3730(121.toByte())
        }
    }

    override fun method3658(i: Int, i_459_: Int, i_460_: Int, i_461_: Int) {
        aClass18_7720!!.method275(i_460_, i, i_461_, i_459_, -1)
        anInt7651++
    }

    fun method3805(i: Int, interface11: Interface11?) {
        try {
            anInt7697++
            if (anInt7738 < 0 || interface11 !== anInterface11Array7741[anInt7738]) throw RuntimeException()
            anInterface11Array7741[anInt7738--] = null
            interface11!!.method45((-47).toByte())
            if (i == 8387) {
                if (anInt7738 < 0) anInterface11_7745 = null
                else {
                    anInterface11_7745 = anInterface11Array7741[anInt7738]
                    anInterface11_7745!!.method49(-27141)
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.CA(" + i + ',' + (if (interface11 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3631(i: Int) {
        anInt7520++
        require(i == 1) { "" }
    }

    override fun method3665(i: Int, i_462_: Int): Interface3? {
        anInt7561++
        return null
    }

    private fun method3806(i: Int) {
        anInt7614++
        val fs = aFloatArray7779
        val f = ((this.anInt7826 * -this.anInt7853).toFloat() / this.anInt7771.toFloat())
        val f_463_ = (((this.anInt7688 - this.anInt7853) * this.anInt7826).toFloat() / this.anInt7771.toFloat())
        if (i < 28) aClass258_Sub3_Sub1_7776 = null
        val f_464_ = ((this.anInt7826 * this.anInt7810).toFloat() / this.anInt7794.toFloat())
        val f_465_ = (((this.anInt7810 + -this.anInt7641) * this.anInt7826).toFloat() / this.anInt7794.toFloat())
        if (f_463_ == f || f_465_ == f_464_) {
            fs[13] = 0.0f
            fs[15] = 1.0f
            fs[3] = 0.0f
            fs[11] = 0.0f
            fs[12] = 0.0f
            fs[4] = 0.0f
            fs[6] = 0.0f
            fs[8] = 0.0f
            fs[7] = 0.0f
            fs[1] = 0.0f
            fs[10] = 1.0f
            fs[14] = 0.0f
            fs[5] = 1.0f
            fs[0] = 1.0f
            fs[9] = 0.0f
            fs[2] = 0.0f
        } else {
            val f_466_ = 2.0f * this.anInt7826.toFloat()
            fs[1] = 0.0f
            fs[5] = f_466_ / (f_464_ - f_465_)
            fs[9] = (f_464_ + f_465_) / (-f_465_ + f_464_)
            fs[3] = 0.0f
            fs[4] = 0.0f
            fs[8] = (f_463_ + f) / (f_463_ - f)
            fs[7] = 0.0f
            aFloat7842 = (-(anInt7814.toFloat() * f_466_) / (-this.anInt7826 + anInt7814).toFloat())
            fs[14] = aFloat7842
            fs[2] = 0.0f
            fs[11] = -1.0f
            fs[15] = 0.0f
            aFloat7854 = (-(anInt7814 - -this.anInt7826).toFloat() / (-this.anInt7826 + anInt7814).toFloat())
            fs[10] = aFloat7854
            fs[12] = 0.0f
            fs[0] = f_466_ / (-f + f_463_)
            fs[13] = 0.0f
            fs[6] = 0.0f
        }
        method3777(-24051)
    }

    override fun method3633() {
        anInt7692++
        glFinish()
    }

    override fun method3691(class207: Class207?, bool: Boolean): Class105 {
        try {
            anInt7657++
            val `is` = IntArray((class207!!.anInt2702 * class207.anInt2696))
            var i = 0
            var i_467_ = 0
            if (class207.aByteArray2695 == null) {
                var i_470_ = 0
                while (class207.anInt2696 > i_470_) {
                    var i_471_ = 0
                    while ((class207.anInt2702 > i_471_)) {
                        val i_472_ = (class207.anIntArray2697[0xff and (class207.aByteArray2699[i++]).toInt()])
                        `is`[i_467_++] = if (i_472_ == 0) 0 else Class273.method2057(-16777216, i_472_)
                        i_471_++
                    }
                    i_470_++
                }
            } else {
                var i_468_ = 0
                while (class207.anInt2696 > i_468_) {
                    var i_469_ = 0
                    while ((i_469_ < class207.anInt2702)) {
                        `is`[i_467_++] = (Class273.method2057((class207.aByteArray2695!![i].toInt() shl 24), (class207.anIntArray2697[Class139.method1166((class207.aByteArray2699[i]).toInt(), 255)])))
                        i++
                        i_469_++
                    }
                    i_468_++
                }
            }
            val class105 = this.method3662(class207.anInt2702, `is`, 94.toByte(), 0, class207.anInt2702, class207.anInt2696)
            class105.method985(class207.anInt2703, class207.anInt2700, class207.anInt2698, class207.anInt2701)
            return class105
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.GF(" + (if (class207 != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    fun method3807(bool: Boolean, i: Int) {
        if (i != 2) anInt7814 = -59
        anInt7517++
        if (!bool != !aBoolean7801) {
            aBoolean7801 = bool
            method3732(-87)
            anInt7765 = anInt7765 and 0x1f.inv()
        }
    }

    fun method3808(i: Int, i_473_: Int) {
        InputStream_Sub2.aFloatArray84!![2] = Class139.method1166(i, 255).toFloat() / 255.0f
        if (i_473_ <= 116) this.anInt7771 = 76
        InputStream_Sub2.aFloatArray84!![3] = (i ushr 24).toFloat() / 255.0f
        InputStream_Sub2.aFloatArray84!![1] = Class139.method1166(i, 65280).toFloat() / 65280.0f
        anInt7659++
        InputStream_Sub2.aFloatArray84!![0] = Class139.method1166(16711680, i).toFloat() / 1.671168E7f
        glTexEnvfv(8960, 8705, InputStream_Sub2.aFloatArray84, 0)
    }

    override fun na(i: Int, i_474_: Int, i_475_: Int, i_476_: Int): IntArray {
        anInt7622++
        val `is` = IntArray(i_475_ * i_476_)
        var i_477_ = 0
        while (i_476_ > i_477_) {
            glReadPixelsi(i, (-i_474_ + this.anInt7641 + -i_477_), i_475_, 1, 32993, this.anInt7812, `is`, i_475_ * i_477_)
            i_477_++
        }
        return `is`
    }

    private fun method3809(bool: Boolean) {
        glViewport(anInt7770, anInt7867, this.anInt7688, this.anInt7641)
        anInt7718++
        if (bool != true) this.aClass64_Sub3_7780 = null
    }

    override fun method3699(): Boolean {
        anInt7700++
        return aBoolean7843 && (!method3666() || aBoolean7822)
    }

    @Synchronized
    fun method3810(i: Int, i_478_: Int, i_479_: Int) {
        if (i_479_ < -57) {
            anInt7677++
            val class348_sub35 = Class348_Sub35(i_478_)
            class348_sub35.aLong4291 = i.toLong()
            aClass262_7754.method1999(class348_sub35, -20180)
        }
    }

    private fun method3811(i: Byte) {
        anInt7690++
        if (i.toInt() == 11) {
            if (anInt7855 >= anInt7868 && anInt7773 <= anInt7787) glScissor(anInt7770 + anInt7868, (anInt7867 + this.anInt7641 - anInt7787), -anInt7868 + anInt7855, -anInt7773 + anInt7787)
            else glScissor(0, 0, 0, 0)
        }
    }

    override fun method3708(): Boolean {
        anInt7603++
        return false
    }

    init {
        aClass233_7711 = Class233()
        aClass101_Sub3_7725 = Class101_Sub3()
        this.aClass101_Sub3_7729 = Class101_Sub3()
        this.anInt7731 = 3
        aBoolean7734 = false
        this.anInt7733 = 8
        aClass262_7732 = Class262()
        anInterface11Array7737 = arrayOfNulls<Interface11>(4)
        anInt7738 = -1
        anInt7742 = -1
        anInterface11Array7741 = arrayOfNulls<Interface11>(4)
        anInterface11Array7743 = arrayOfNulls<Interface11>(4)
        anInt7746 = -1
        Class107()
        Class356(16)
        aClass262_7749 = Class262()
        aClass262_7751 = Class262()
        aClass262_7752 = Class262()
        aClass262_7753 = Class262()
        aClass262_7754 = Class262()
        aClass262_7755 = Class262()
        aClass262_7756 = Class262()
        this.aClass101_Sub3_7760 = Class101_Sub3()
        this.aClass101_Sub3_7766 = Class101_Sub3()
        this.aClass101_Sub3_7767 = Class101_Sub3()
        anInt7770 = 0
        aFloat7786 = 0.0f
        anInt7773 = 0
        this.aFloat7781 = 1.0f
        this.anInt7806 = -1
        this.anInt7771 = 512
        aFloat7800 = -1.0f
        anInt7808 = -1
        this.aFloat7816 = 1.0f
        anInt7804 = 8448
        aFloat7829 = -1.0f
        this.anInt7810 = 0
        this.aFloat7832 = -1.0f
        this.aFloatArray7825 = FloatArray(4)
        this.anInt7809 = 0
        aFloatArray7811 = FloatArray(4)
        this.aFloat7823 = 1.0f
        this.anInt7794 = 512
        anInt7814 = 3584
        anInt7855 = 0
        aFloat7857 = 1.0f
        anInt7787 = 0
        aBoolean7859 = false
        aFloatArray7850 = FloatArray(4)
        aFloat7851 = 1.0f
        this.anInt7826 = 50
        anInt7861 = 8448
        this.anInt7813 = 0
        this.anInt7856 = -1
        anInt7868 = 0
        aFloatArray7779 = FloatArray(16)
        aBoolean7870 = true
        this.aFloat7871 = -1.0f
        aClass348_Sub1Array7858 = arrayOfNulls<Class348_Sub1>(Class55.anInt984)
        this.anInt7853 = 0
        anInt7867 = 0
        this.aFloat7875 = 3584.0f
        this.aFloat7874 = 3584.0f
        this.anInt7848 = -1
        aFloatArray7877 = FloatArray(4)
        this.anInt7782 = -1
        this.aClass348_Sub49_Sub1_7798 = Class348_Sub49_Sub1(8192)
        this.aByteArray7879 = ByteArray(16384)
        this.anIntArray7880 = IntArray(1)
        this.anIntArray7883 = IntArray(1)
        this.anIntArray7882 = IntArray(1)
        try {
            aCanvas7626 = canvas
            aCanvas7575 = aCanvas7626
            this.anInt7713 = i
            if (!Class348_Sub40_Sub19.method3098(-30282, "jaclib")) throw RuntimeException("")
            if (!Class348_Sub40_Sub19.method3098(-30282, "jaggl")) throw RuntimeException("")
            try {
                anOpenGL7664 = OpenGL()
                aLong7553 = anOpenGL7664!!.init(canvas, 8, 8, 8, 24, 0, this.anInt7713)
                aLong7636 = aLong7553
                if (aLong7553 == 0L) throw RuntimeException("")
                method3776(22544)
                val i_99_ = method3774((-62).toByte())
                if (i_99_ != 0) throw RuntimeException("")
                this.anInt7812 = if (this.aBoolean7775) 33639 else 5121
                if (aString7790!!.indexOf("radeon") != -1) {
                    var i_100_ = 0
                    var bool = false
                    var bool_101_ = false
                    val strings = (Class348_Sub40_Sub23.method3113(' ', true, aString7790!!.replace('/', ' ')))
                    for (i_102_ in strings.indices) {
                        var string = strings[i_102_]!!
                        try {
                            if (string.length > 0) {
                                if (string.get(0) == 'x' && string.length >= 3 && (Class50_Sub3.method468(string.substring(1, 3), 111))) {
                                    string = string.substring(1)
                                    bool_101_ = true
                                }
                                if (string == "hd") bool = true
                                else {
                                    if (string.startsWith("hd")) {
                                        bool = true
                                        string = string.substring(2)
                                    }
                                    if (string.length >= 4 && (Class50_Sub3.method468(string.substring(0, 4), 47))) {
                                        i_100_ = (Class348_Sub41.method3156(true, string.substring(0, 4)))
                                        break
                                    }
                                }
                            }
                        } catch (exception: Exception) {
                            /* empty */
                        }
                    }
                    if (!bool_101_ && !bool) {
                        if (i_100_ >= 7000 && i_100_ <= 7999) aBoolean7873 = false
                        if (i_100_ >= 7000 && i_100_ <= 9250) this.aBoolean7831 = false
                    }
                    if (!bool || i_100_ < 4000) this.aBoolean7818 = false
                    this.aBoolean7837 = this.aBoolean7837 and anOpenGL7664!!.a("GL_ARB_half_float_pixel")
                    this.aBoolean7847 = true
                    aBoolean7869 = aBoolean7873
                }
                if (aString7845!!.indexOf("intel") != -1) this.aBoolean7820 = false
                aBoolean7774 = aString7845 != "s3 graphics"
                if (aBoolean7873) {
                    try {
                        val `is` = IntArray(1)
                        glGenBuffersARB(1, `is`, 0)
                    } catch (throwable: Throwable) {
                        throw RuntimeException("")
                    }
                }
                Class59_Sub2_Sub1.method566(false, true, (-128).toByte())
                aBoolean7734 = true
                aClass354_7723 = Class354(this, this.aD4579)
                method3786(false)
                this.aClass188_7736 = Class188(this)
                aClass18_7720 = Class18(this)
                if (aClass18_7720.method280(1)) {
                    aClass348_Sub5_Sub1_7721 = Class348_Sub5_Sub1(this)
                    if (!aClass348_Sub5_Sub1_7721!!.method2767(104.toByte())) {
                        aClass348_Sub5_Sub1_7721!!.method2763((-124).toByte())
                        aClass348_Sub5_Sub1_7721 = null
                    }
                }
                aClass100_7707 = Class100(this)
                method3791(25858)
                method3745(123.toByte())
                method3673()
            } catch (throwable: Throwable) {
                throwable.printStackTrace()
                method3652()
                throw RuntimeException("")
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qo.<init>(" + (if (canvas != null) "{...}" else "null") + ',' + (if (var_d != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt7514: Int = 0
        @JvmField
        var anInt7515: Int = 0
        @JvmField
        var anInt7516: Int = 0
        @JvmField
        var anInt7517: Int = 0
        @JvmField
        var anInt7518: Int = 0
        @JvmField
        var anInt7519: Int = 0
        @JvmField
        var anInt7520: Int = 0
        @JvmField
        var anInt7521: Int = 0
        @JvmField
        var anInt7522: Int = 0
        @JvmField
        var anInt7524: Int = 0
        @JvmField
        var anInt7525: Int = 0
        @JvmField
        var anInt7526: Int = 0
        @JvmField
        var anInt7527: Int = 0
        @JvmField
        var anInt7528: Int = 0
        @JvmField
        var anInt7529: Int = 0
        @JvmField
        var anInt7530: Int = 0
        @JvmField
        var anInt7531: Int = 0
        @JvmField
        var anInt7532: Int = 0
        @JvmField
        var anInt7533: Int = 0
        @JvmField
        var anInt7534: Int = 0
        @JvmField
        var anInt7535: Int = 0
        @JvmField
        var anInt7536: Int = 0
        @JvmField
        var anInt7537: Int = 0
        @JvmField
        var anInt7538: Int = 0
        @JvmField
        var anInt7539: Int = 0
        @JvmField
        var anInt7540: Int = 0
        @JvmField
        var anInt7541: Int = 0
        @JvmField
        var anInt7542: Int = 0
        @JvmField
        var anInt7543: Int = 0
        @JvmField
        var anInt7544: Int = 0
        @JvmField
        var anInt7545: Int = 0
        @JvmField
        var anInt7546: Int = 0
        @JvmField
        var anInt7547: Int = 0
        @JvmField
        var anInt7548: Int = 0
        @JvmField
        var anInt7549: Int = 0
        @JvmField
        var anInt7550: Int = 0
        @JvmField
        var anInt7551: Int = 0
        @JvmField
        var anInt7552: Int = 0
        @JvmField
        var aClass351_7554: Class351? = Class351(52, 4)
        @JvmField
        var anInt7555: Int = 0
        @JvmField
        var anInt7556: Int = 0
        @JvmField
        var anInt7557: Int = 0
        @JvmField
        var anInt7558: Int = 0
        @JvmField
        var anInt7559: Int = 0
        @JvmField
        var anInt7560: Int = 0
        @JvmField
        var anInt7561: Int = 0
        @JvmField
        var anInt7562: Int = 0
        @JvmField
        var anInt7563: Int = 0
        @JvmField
        var anInt7564: Int = 0
        @JvmField
        var anInt7565: Int = 0
        @JvmField
        var anInt7566: Int = 0
        @JvmField
        var anInt7567: Int = 0
        @JvmField
        var anInt7568: Int = 0
        @JvmField
        var anInt7569: Int = 0
        @JvmField
        var anInt7570: Int = 0
        @JvmField
        var anInt7571: Int = 0
        @JvmField
        var anInt7572: Int = 0
        @JvmField
        var anInt7573: Int = 0
        @JvmField
        var anInt7574: Int = 0
        @JvmField
        var anInt7576: Int = 0
        @JvmField
        var anInt7578: Int = 0
        @JvmField
        var anInt7579: Int = 0
        @JvmField
        var anInt7580: Int = 0
        @JvmField
        var anInt7581: Int = 0
        @JvmField
        var anInt7582: Int = 0
        @JvmField
        var anInt7583: Int = 0
        @JvmField
        var anInt7584: Int = 0
        @JvmField
        var anInt7585: Int = 0
        @JvmField
        var anInt7586: Int = 0
        @JvmField
        var anInt7587: Int = 0
        @JvmField
        var anInt7588: Int = 0
        @JvmField
        var anInt7589: Int = 0
        @JvmField
        var anInt7590: Int = 0
        @JvmField
        var anInt7591: Int = 0
        @JvmField
        var anInt7592: Int = 0
        @JvmField
        var anInt7593: Int = 0
        @JvmField
        var anInt7594: Int = 0
        @JvmField
        var anInt7595: Int = 0
        @JvmField
        var anInt7596: Int = 0
        @JvmField
        var anInt7597: Int = 0
        @JvmField
        var anInt7598: Int = 0
        @JvmField
        var anInt7599: Int = 0
        @JvmField
        var anInt7600: Int = 0
        @JvmField
        var anInt7601: Int = 0
        @JvmField
        var anInt7602: Int = 0
        @JvmField
        var anInt7603: Int = 0
        @JvmField
        var anInt7604: Int = 0
        @JvmField
        var anInt7605: Int = 0
        @JvmField
        var anInt7606: Int = 0
        @JvmField
        var anInt7607: Int = 0
        @JvmField
        var anInt7608: Int = 0
        @JvmField
        var anInt7609: Int = 0
        @JvmField
        var anInt7610: Int = 0
        @JvmField
        var anInt7611: Int = 0
        @JvmField
        var anInt7612: Int = 0
        @JvmField
        var anInt7613: Int = 0
        @JvmField
        var anInt7614: Int = 0
        @JvmField
        var anInt7615: Int = 0
        @JvmField
        var anInt7616: Int = 0
        @JvmField
        var anInt7617: Int = 0
        @JvmField
        var anInt7618: Int = 0
        @JvmField
        var anInt7619: Int = 0
        @JvmField
        var anInt7620: Int = 0
        @JvmField
        var anInt7621: Int = 0
        @JvmField
        var anInt7622: Int = 0
        @JvmField
        var anInt7623: Int = 0
        @JvmField
        var anInt7624: Int = 0
        @JvmField
        var anInt7625: Int = 0
        @JvmField
        var anInt7627: Int = 0
        @JvmField
        var anInt7628: Int = 0
        @JvmField
        var anInt7629: Int = 0
        @JvmField
        var anInt7630: Int = 0
        @JvmField
        var anInt7631: Int = 0
        @JvmField
        var anInt7632: Int = 0
        @JvmField
        var anInt7633: Int = 0
        @JvmField
        var anInt7634: Int = 0
        @JvmField
        var anInt7635: Int = 0
        @JvmField
        var anInt7637: Int = 0
        @JvmField
        var anInt7638: Int = 0
        @JvmField
        var anInt7639: Int = 0
        @JvmField
        var anInt7640: Int = 0
        @JvmField
        var anInt7642: Int = 0
        @JvmField
        var anInt7643: Int = 0
        @JvmField
        var anInt7644: Int = 0
        @JvmField
        var anInt7646: Int = 0
        @JvmField
        var anInt7647: Int = 0
        @JvmField
        var anInt7648: Int = 0
        @JvmField
        var anInt7649: Int = 0
        @JvmField
        var anInt7650: Int = 0
        @JvmField
        var anInt7651: Int = 0
        @JvmField
        var anInt7652: Int = 0
        @JvmField
        var anInt7653: Int = 0
        @JvmField
        var anInt7654: Int = 0
        @JvmField
        var anInt7655: Int = 0
        @JvmField
        var anInt7656: Int = 0
        @JvmField
        var anInt7657: Int = 0
        @JvmField
        var anInt7658: Int = 0
        @JvmField
        var anInt7659: Int = 0
        @JvmField
        var anInt7660: Int = 0
        @JvmField
        var anInt7661: Int = 0
        @JvmField
        var anInt7662: Int = 0
        @JvmField
        var anInt7663: Int = 0
        @JvmField
        var anInt7665: Int = 0
        @JvmField
        var anInt7666: Int = 503
        @JvmField
        var anInt7667: Int = 0
        @JvmField
        var anInt7668: Int = 0
        @JvmField
        var anInt7669: Int = 0
        @JvmField
        var anInt7670: Int = 0
        @JvmField
        var anInt7671: Int = 0
        @JvmField
        var anInt7672: Int = 0
        @JvmField
        var anInt7673: Int = 0
        @JvmField
        var anInt7674: Int = 0
        @JvmField
        var anInt7675: Int = 0
        @JvmField
        var anInt7676: Int = 0
        @JvmField
        var anInt7677: Int = 0
        @JvmField
        var anInt7678: Int = 0
        @JvmField
        var anInt7679: Int = 0
        @JvmField
        var anInt7680: Int = 0
        @JvmField
        var anInt7681: Int = 0
        @JvmField
        var anInt7682: Int = 0
        @JvmField
        var anInt7683: Int = 0
        @JvmField
        var anInt7684: Int = 0
        @JvmField
        var anInt7685: Int = 0
        @JvmField
        var anInt7686: Int = 0
        @JvmField
        var anInt7687: Int = 0
        @JvmField
        var anInt7689: Int = 0
        @JvmField
        var anInt7690: Int = 0
        @JvmField
        var anInt7691: Int = 0
        @JvmField
        var anInt7692: Int = 0
        @JvmField
        var anInt7693: Int = 0
        @JvmField
        var anInt7694: Int = 0
        @JvmField
        var anInt7695: Int = 0
        @JvmField
        var anInt7696: Int = 0
        @JvmField
        var anInt7697: Int = 0
        @JvmField
        var anInt7698: Int = 0
        @JvmField
        var anInt7699: Int = 0
        @JvmField
        var anInt7700: Int = 0
        @JvmField
        var anInt7701: Int = 0
        @JvmField
        var anInt7702: Int = 0
        @JvmField
        var anInt7703: Int = 0
        @JvmField
        var anInt7704: Int = 0
        @JvmField
        var anInt7705: Int = 0
        @JvmField
        var anInt7706: Int = 0
        @JvmField
        var anInt7708: Int = 0
        @JvmField
        var anInt7709: Int = 0
        @JvmField
        var anInt7710: Int = 0
        @JvmField
        var anInt7714: Int = 0
        @JvmField
        var aClass351_7715: Class351? = Class351(58, 4)
        @JvmField
        var anInt7716: Int = 0
        @JvmField
        var anInt7717: Int = 0
        @JvmField
        var anInt7718: Int = 0
        @JvmField
        var anInt7719: Int = 0
        @JvmField
        var anInt7722: Int = 0
        @JvmField
        var anInt7724: Int = 0
        @JvmField
        var anInt7726: Int = 0
        @JvmField
        var anInt7727: Int = 0
        @JvmField
        var anInt7728: Int = 0
        @JvmStatic
        fun method3736(i: Byte) {
            aClass351_7554 = null
            aClass351_7715 = null
            if (i < 27) aClass351_7715 = null
        }

        @JvmStatic
        fun method3743(i: Byte, class348_sub42_sub12: Class348_Sub42_Sub12?) {
            do {
                try {
                    anInt7686++
                    if (i.toInt() != 6) aClass351_7715 = null
                    if (class348_sub42_sub12 != null) {
                        Class348_Sub40_Sub4.aClass262_9111!!.method1999(class348_sub42_sub12, -20180)
                        Class73.anInt4776++
                        val `object`: Any? = null
                        var class348_sub42_sub13: Class348_Sub42_Sub13?
                        if ((class348_sub42_sub12.aBoolean9611) || "" == class348_sub42_sub12.aString9601) {
                            class348_sub42_sub13 = Class348_Sub42_Sub13(class348_sub42_sub12.aString9601)
                            Class8.anInt166++
                        } else {
                            val l = (class348_sub42_sub12.aLong9600)
                            class348_sub42_sub13 = (Class348_Sub42_Sub12.aClass356_9603!!.method3480(l, -6008) as? Class348_Sub42_Sub13?)
                            while (class348_sub42_sub13 != null) {
                                if (class348_sub42_sub13.aString9617 == class348_sub42_sub12.aString9601) break
                                class348_sub42_sub13 = (Class348_Sub42_Sub12.aClass356_9603!!.method3476(true) as? Class348_Sub42_Sub13?)
                            }
                            if (class348_sub42_sub13 == null) {
                                class348_sub42_sub13 = (Class259.aClass60_3301!!.method583(l, i.toInt() xor 0x3a) as? Class348_Sub42_Sub13?)
                                if (class348_sub42_sub13 != null && !(class348_sub42_sub13.aString9617 == class348_sub42_sub12.aString9601)) class348_sub42_sub13 = null
                                if (class348_sub42_sub13 == null) class348_sub42_sub13 = (Class348_Sub42_Sub13(class348_sub42_sub12.aString9601))
                                Class348_Sub42_Sub12.aClass356_9603!!.method3483(71.toByte(), l, class348_sub42_sub13)
                                Class8.anInt166++
                            }
                        }
                        if (!class348_sub42_sub13.method3233(class348_sub42_sub12, -21)) break
                        Class242.method1868((-39).toByte(), class348_sub42_sub13)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("qo.VC(" + i + ',' + (if (class348_sub42_sub12 != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method3802(i: Int, i_315_: Int, i_316_: Int, i_317_: Int, i_318_: Int, i_319_: Int, i_320_: Int) {
            anInt7572++
            val i_321_ = Class328_Sub1.anInt6513
            Class88.anInt1497 = 0
            val `is` = Class286_Sub7.anIntArray6290!!
            var i_322_ = 0
            while ((i_322_ < Class150.anInt2057 + i_321_)) {
                var class79: Class79? = null
                val class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3
                if (i_321_ > i_322_) class318_sub1_sub3_sub3 = (Class294.aPlayerArray5058!![`is`[i_322_]]!!)
                else {
                    class318_sub1_sub3_sub3 = ((Class282.aClass356_3654!!.method3480(Class74.anIntArray1233!![i_322_ + -i_321_].toLong(), i_316_ xor 0x1775.inv()) as Class348_Sub22).aNpc_6859!!)
                    class79 = class318_sub1_sub3_sub3.aClass79_10505!!
                    if (class79.anIntArray1377 != null) {
                        class79 = class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), i_316_ + -3)
                        if (class79 == null) {
                            i_322_++
                            continue
                        }
                    }
                }
                if ((class318_sub1_sub3_sub3.anInt10285 >= 0) && (((class318_sub1_sub3_sub3.anInt10301) == Class239_Sub15.anInt6006) || ((Class132.aPlayer_1907!!.plane) == class318_sub1_sub3_sub3.plane))) {
                    Class348_Sub13.method2801(class318_sub1_sub3_sub3.method2426(200), i_318_ shr 1, i_320_, i_319_, i_315_ shr 1, class318_sub1_sub3_sub3, 100.toByte())
                    if (Class239_Sub21.anIntArray6062!![0] >= 0) {
                        if ((class318_sub1_sub3_sub3.aString10292) != null && (i_321_ <= i_322_ || za.anInt7276 == 0 || za.anInt7276 == 3 || (za.anInt7276 == 1 && (Class348_Sub11.method2797((class318_sub1_sub3_sub3 as Player).aString10544, (-63).toByte())))) && Class88.anInt1497 < Class309.anInt4814) {
                            Class309.anIntArray4819!![Class88.anInt1497] = ((Class369.aClass143_4962!!.method1183(true, class318_sub1_sub3_sub3.aString10292)) / 2)
                            Class309.anIntArray4822!![Class88.anInt1497] = Class239_Sub21.anIntArray6062!![0]
                            Class309.anIntArray4813!![Class88.anInt1497] = Class239_Sub21.anIntArray6062!![1]
                            Class309.anIntArray4817!![Class88.anInt1497] = class318_sub1_sub3_sub3.anInt10201
                            Class309.anIntArray4806!![Class88.anInt1497] = class318_sub1_sub3_sub3.anInt10234
                            Class309.anIntArray4812!![Class88.anInt1497] = class318_sub1_sub3_sub3.anInt10264
                            Class309.aStringArray4818!![Class88.anInt1497] = class318_sub1_sub3_sub3.aString10292
                            Class88.anInt1497++
                        }
                        var i_323_ = Class239_Sub21.anIntArray6062!![1] + i
                        if (!(class318_sub1_sub3_sub3.aBoolean10309) && (Class367_Sub11.anInt7396 < class318_sub1_sub3_sub3.anInt10223)) {
                            var i_324_ = -1
                            var i_325_ = 1
                            if (i_321_ <= i_322_) {
                                i_324_ = class79!!.anInt1373
                                if (i_324_ == -1) i_324_ = (class318_sub1_sub3_sub3.method2422(72.toByte()).anInt2909)
                            } else {
                                val player = (Class294.aPlayerArray5058!![`is`[i_322_]]!!)
                                i_324_ = (class318_sub1_sub3_sub3.method2422(72.toByte()).anInt2909)
                                if (player.aBoolean10554) i_325_ = 2
                            }
                            var class105s = Class348_Sub45.aClass105Array7107
                            if (i_324_ != -1) {
                                var class105s_326_ = ((Class353.aClass60_4346!!.method583(i_324_.toLong(), i_316_ xor 0x79.inv())) as? Array<Class105?>?)
                                if (class105s_326_ == null) {
                                    val class207s = Class207.method1519(Class21.aClass45_322!!, i_324_, 0)
                                    if (class207s != null) {
                                        class105s_326_ = arrayOfNulls<Class105>(class207s.size)
                                        var i_327_ = 0
                                        while (class207s.size > i_327_) {
                                            class105s_326_[i_327_] = (Class348_Sub8.aHa6654!!.method3691(class207s[i_327_], true))
                                            i_327_++
                                        }
                                        Class353.aClass60_4346!!.method582(class105s_326_, i_324_.toLong(), (-94).toByte())
                                    }
                                }
                                if (class105s_326_ != null && class105s_326_.size >= 2) class105s = class105s_326_
                            }
                            if (class105s!!.size <= i_325_) i_325_ = 1
                            val class105 = class105s[0]!!
                            val class105_328_ = class105s[i_325_]!!
                            i_323_ -= max((Class369.aClass143_4962!!.anInt1988), class105.method969())
                            val i_329_ = (Class239_Sub21.anIntArray6062!![0] + (i_317_ + -(class105.method971() shr 1)))
                            var i_330_ = (class105.method971() * class318_sub1_sub3_sub3.anInt10295 / 255)
                            val i_331_ = class105.method969()
                            if (class318_sub1_sub3_sub3.anInt10295 > 0 && i_330_ < 2) i_330_ = 2
                            class105.method974(i_329_, i_323_)
                            Class348_Sub8.aHa6654!!.T(i_329_, i_323_, i_330_ + i_329_, i_331_ + i_323_)
                            class105_328_.method974(i_329_, i_323_)
                            Class348_Sub8.aHa6654!!.KA(i_317_, i, i_317_ - -i_318_, i_315_ + i)
                            Class338.method2663(-5590, i_329_, i_329_ + class105.method966(), i_323_, i_323_ + i_331_)
                        } else i_323_ -= max((Class369.aClass143_4962!!.anInt1988), Class348_Sub45.aClass105Array7107!![0]!!.method969())
                        i_323_ -= 2
                        if (!class318_sub1_sub3_sub3.aBoolean10309) {
                            if (class318_sub1_sub3_sub3.anInt10287 > Class367_Sub11.anInt7396) {
                                var class105 = (Class239_Sub2.aClass105Array5857!![(if (class318_sub1_sub3_sub3.aBoolean10226) 2 else 0)]!!)
                                var class105_332_ = (Class239_Sub2.aClass105Array5857!![(if (!class318_sub1_sub3_sub3.aBoolean10226) 1 else 3)]!!)
                                var i_333_ = -1
                                if (class318_sub1_sub3_sub3 is Npc) {
                                    i_333_ = class79!!.anInt1382
                                    if (i_333_ == -1) i_333_ = (class318_sub1_sub3_sub3.method2422(72.toByte()).anInt2923)
                                } else i_333_ = (class318_sub1_sub3_sub3.method2422(72.toByte()).anInt2923)
                                if (i_333_ != -1) {
                                    var class105s = (Class328_Sub2.aClass60_6517!!.method583(i_333_.toLong(), -45) as? Array<Class105?>)
                                    if (class105s == null) {
                                        val class207s = Class207.method1519((Class21.aClass45_322!!), i_333_, 0)
                                        if (class207s != null) {
                                            class105s = arrayOfNulls<Class105>(class207s.size)
                                            var i_334_ = 0
                                            while ((class207s.size > i_334_)) {
                                                class105s[i_334_] = (Class348_Sub8.aHa6654!!.method3691(class207s[i_334_], true))
                                                i_334_++
                                            }
                                            Class328_Sub2.aClass60_6517!!.method582(class105s, i_333_.toLong(), (-101).toByte())
                                        }
                                    }
                                    if (class105s != null && class105s.size == 4) {
                                        class105_332_ = (class105s[if (!(class318_sub1_sub3_sub3.aBoolean10226)) 1 else 3]!!)
                                        class105 = (class105s[if (!(class318_sub1_sub3_sub3.aBoolean10226)) 0 else 2]!!)
                                    }
                                }
                                var i_335_ = (-Class367_Sub11.anInt7396 + class318_sub1_sub3_sub3.anInt10287)
                                val i_336_: Int
                                if (i_335_ > class318_sub1_sub3_sub3.anInt10227) {
                                    i_335_ -= class318_sub1_sub3_sub3.anInt10227
                                    val i_337_ = (if (class318_sub1_sub3_sub3.anInt10271 != 0) (class318_sub1_sub3_sub3.anInt10271 * (((class318_sub1_sub3_sub3.anInt10210) - i_335_) / (class318_sub1_sub3_sub3.anInt10271))) else 0)
                                    i_336_ = (class105.method971() * i_337_ / class318_sub1_sub3_sub3.anInt10210)
                                } else i_336_ = class105.method971()
                                val i_338_ = class105.method969()
                                i_323_ -= i_338_
                                val i_339_ = (Class239_Sub21.anIntArray6062!![0] + (i_317_ + -(class105.method971() shr 1)))
                                class105.method974(i_339_, i_323_)
                                Class348_Sub8.aHa6654!!.T(i_339_, i_323_, i_339_ - -i_336_, i_323_ - -i_338_)
                                class105_332_.method974(i_339_, i_323_)
                                Class348_Sub8.aHa6654!!.KA(i_317_, i, i_318_ + i_317_, i - -i_315_)
                                Class338.method2663(-5590, i_339_, class105.method966() + i_339_, i_323_, i_338_ + i_323_)
                                i_323_ -= 2
                            }
                            if (i_322_ < i_321_) {
                                val player = (class318_sub1_sub3_sub3 as Player)
                                if (player.anInt10540 != -1) {
                                    i_323_ -= 25
                                    val class105 = (Class318_Sub1_Sub1_Sub1.aClass105Array9959!![(player.anInt10540)])!!
                                    class105.method974((-12 + i_317_ + (Class239_Sub21.anIntArray6062!![0])), i_323_)
                                    Class338.method2663(-5590, i_317_ + (Class239_Sub21.anIntArray6062!![0] + -12), (i_317_ - -Class239_Sub21.anIntArray6062!![0] + (-12 + class105.method966())), i_323_, i_323_ + class105.method980())
                                    i_323_ -= 2
                                }
                                if (player.anInt10522 != -1) {
                                    i_323_ -= 25
                                    val class105 = (Class264.aClass105Array3378!![(player.anInt10522)])!!
                                    class105.method974((-12 + i_317_ + (Class239_Sub21.anIntArray6062!![0])), i_323_)
                                    Class338.method2663(-5590, (-12 + Class239_Sub21.anIntArray6062!![0] + i_317_), (Class239_Sub21.anIntArray6062!![0] + i_317_ - (12 + -class105.method966())), i_323_, i_323_ - -class105.method980())
                                    i_323_ -= 2
                                }
                            } else if (class79!!.anInt1375 >= 0 && (class79.anInt1375 < Class264.aClass105Array3378!!.size)) {
                                val class105 = (Class264.aClass105Array3378!![class79.anInt1375])!!
                                i_323_ -= 25
                                class105.method974((i_317_ + (Class239_Sub21.anIntArray6062!![0]) + -(class105.method971() shr 1)), i_323_)
                                Class338.method2663(-5590, (Class239_Sub21.anIntArray6062!![0] + (i_317_ - (class105.method971() shr 1))), (Class239_Sub21.anIntArray6062!![0] + (i_317_ - (class105.method971() shr 1)) + class105.method966()), i_323_, class105.method980() + i_323_)
                                i_323_ -= 2
                            }
                        }
                        if (class318_sub1_sub3_sub3 is Player) {
                            if (i_322_ >= 0) {
                                var i_340_ = 0
                                val class302s = Class348_Sub27.aClass302Array6897!!
                                var i_341_ = 0
                                while ((i_341_ < class302s.size)) {
                                    val class302 = class302s[i_341_]
                                    if (class302 != null && class302.anInt3840 == 10 && (`is`[i_322_] == class302.anInt3833)) {
                                        val class105 = (Class239_Sub9.aClass105Array5933!![class302.anInt3831])!!
                                        if (i_340_ < class105.method969()) i_340_ = class105.method969()
                                        class105.method974(-12 + ((Class239_Sub21.anIntArray6062!![0]) + i_317_), (i_323_ + -class105.method969()))
                                        Class338.method2663(-5590, -12 + (i_317_ - -(Class239_Sub21.anIntArray6062!![0])), (i_317_ + (Class239_Sub21.anIntArray6062!![0] + -12 - -class105.method966())), -class105.method969() + i_323_, (i_323_ + -class105.method969() - -class105.method980()))
                                    }
                                    i_341_++
                                }
                                if (i_340_ > 0) i_323_ -= 2 + i_340_
                            }
                        } else {
                            var i_342_ = 0
                            val class302s = Class348_Sub27.aClass302Array6897!!
                            var i_343_ = 0
                            while (class302s.size > i_343_) {
                                val class302 = class302s[i_343_]
                                if (class302 != null && class302.anInt3840 == 1 && (class302.anInt3833 == Class74.anIntArray1233!![i_322_ - i_321_])) {
                                    val class105 = (Class239_Sub9.aClass105Array5933!![class302.anInt3831])!!
                                    if (class105.method969() > i_342_) i_342_ = class105.method969()
                                    if (Class367_Sub11.anInt7396 % 20 < 10) {
                                        class105.method974((-12 + i_317_ + Class239_Sub21.anIntArray6062!![0]), i_323_ + -class105.method969())
                                        Class338.method2663(-5590, (-12 + i_317_ - -Class239_Sub21.anIntArray6062!![0]), (Class239_Sub21.anIntArray6062!![0] + (i_317_ + -12) - -class105.method966()), -class105.method969() + i_323_, (-class105.method969() + (i_323_ - -class105.method980())))
                                    }
                                }
                                i_343_++
                            }
                            if (i_342_ > 0) i_323_ -= 2 + i_342_
                        }
                        var i_344_ = 0
                        while ( /**/i_344_ < Class132.anInt1905) {
                            val i_345_ = (class318_sub1_sub3_sub3.anIntArray10219[i_344_])
                            val i_346_ = (class318_sub1_sub3_sub3.anIntArray10259[i_344_])
                            var class31: Class31? = null
                            var i_347_ = 0
                            if (i_346_ >= 0) {
                                if (i_345_ <= Class367_Sub11.anInt7396) {
                                    i_344_++
                                    continue
                                }
                                class31 = (Class73.aClass219_4782!!.method1601(46, (class318_sub1_sub3_sub3.anIntArray10259[i_344_])))
                                i_347_ = class31.anInt434
                            } else if (i_345_ < 0) {
                                i_344_++
                                continue
                            }
                            val i_348_ = (class318_sub1_sub3_sub3.anIntArray10304[i_344_])
                            var class31_349_: Class31? = null
                            if (i_348_ >= 0) class31_349_ = Class73.aClass219_4782!!.method1601(46, i_348_)
                            if (-i_347_ + i_345_ <= Class367_Sub11.anInt7396) {
                                val i_350_ = (class318_sub1_sub3_sub3.anIntArray10303[i_344_])
                                if (i_350_ >= 0) {
                                    class318_sub1_sub3_sub3.anInt10223 = 300 + Class367_Sub11.anInt7396
                                    class318_sub1_sub3_sub3.anInt10295 = i_350_
                                    class318_sub1_sub3_sub3.anIntArray10303[i_344_] = -1
                                }
                                if (class31 == null) class318_sub1_sub3_sub3.anIntArray10219[i_344_] = -1
                                else {
                                    val i_351_ = (class318_sub1_sub3_sub3.method2426(200) / 2)
                                    Class348_Sub13.method2801(i_351_, i_318_ shr 1, i_320_, i_319_, i_315_ shr 1, class318_sub1_sub3_sub3, (-107).toByte())
                                    if (Class239_Sub21.anIntArray6062!![0] > -1) {
                                        Class239_Sub21.anIntArray6062!![0] += Class118.anIntArray1786!![i_344_]
                                        Class239_Sub21.anIntArray6062!![1] += Class106.anIntArray1636!![i_344_]
                                        val `object`: Any? = null
                                        val object_352_: Any? = null
                                        val object_353_: Any? = null
                                        val object_354_: Any? = null
                                        var i_355_ = 0
                                        var i_356_ = 0
                                        var i_357_ = 0
                                        var i_358_ = 0
                                        var i_359_ = 0
                                        var i_360_ = 0
                                        var i_361_ = 0
                                        var i_362_ = 0
                                        var class105: Class105? = null
                                        var class105_363_: Class105? = null
                                        var class105_364_: Class105? = null
                                        var class105_365_: Class105? = null
                                        var i_366_ = 0
                                        var i_367_ = 0
                                        var i_368_ = 0
                                        var i_369_ = 0
                                        var i_370_ = 0
                                        var i_371_ = 0
                                        var i_372_ = 0
                                        var i_373_ = 0
                                        var i_374_ = 0
                                        val class105_375_ = class31.method327((Class348_Sub8.aHa6654!!), (-96).toByte())
                                        if (class105_375_ != null) {
                                            i_355_ = class105_375_.method971()
                                            val i_376_ = class105_375_.method969()
                                            class105_375_.method984(Class151.anIntArray2062)
                                            if (i_374_ < i_376_) i_374_ = i_376_
                                            i_359_ = Class151.anIntArray2062!![0]
                                        }
                                        val class105_377_ = class31.method331((Class348_Sub8.aHa6654!!), (-75).toByte())
                                        if (class105_377_ != null) {
                                            i_356_ = class105_377_.method971()
                                            val i_378_ = class105_377_.method969()
                                            class105_377_.method984(Class151.anIntArray2062)
                                            if (i_378_ > i_374_) i_374_ = i_378_
                                            i_360_ = Class151.anIntArray2062!![0]
                                        }
                                        val class105_379_ = class31.method324((Class348_Sub8.aHa6654!!), true)
                                        if (class105_379_ != null) {
                                            i_357_ = class105_379_.method971()
                                            val i_380_ = class105_379_.method969()
                                            if (i_374_ < i_380_) i_374_ = i_380_
                                            class105_379_.method984(Class151.anIntArray2062)
                                            i_361_ = Class151.anIntArray2062!![0]
                                        }
                                        val class105_381_ = class31.method325((Class348_Sub8.aHa6654!!), 105)
                                        if (class105_381_ != null) {
                                            i_358_ = class105_381_.method971()
                                            val i_382_ = class105_381_.method969()
                                            class105_381_.method984(Class151.anIntArray2062)
                                            if (i_374_ < i_382_) i_374_ = i_382_
                                            i_362_ = Class151.anIntArray2062!![0]
                                        }
                                        if (class31_349_ != null) {
                                            class105 = (class31_349_.method327(Class348_Sub8.aHa6654!!, 110.toByte()))
                                            if (class105 != null) {
                                                i_366_ = class105.method971()
                                                val i_383_ = class105.method969()
                                                if (i_383_ > i_374_) i_374_ = i_383_
                                                class105.method984(Class151.anIntArray2062)
                                                i_370_ = Class151.anIntArray2062!![0]
                                            }
                                            class105_363_ = (class31_349_.method331(Class348_Sub8.aHa6654!!, (-80).toByte()))
                                            if (class105_363_ != null) {
                                                i_367_ = class105_363_.method971()
                                                val i_384_ = class105_363_.method969()
                                                if (i_384_ > i_374_) i_374_ = i_384_
                                                class105_363_.method984(Class151.anIntArray2062)
                                                i_371_ = Class151.anIntArray2062!![0]
                                            }
                                            class105_364_ = (class31_349_.method324(Class348_Sub8.aHa6654!!, true))
                                            if (class105_364_ != null) {
                                                i_368_ = class105_364_.method971()
                                                val i_385_ = class105_364_.method969()
                                                class105_364_.method984(Class151.anIntArray2062)
                                                if (i_385_ > i_374_) i_374_ = i_385_
                                                i_372_ = Class151.anIntArray2062!![0]
                                            }
                                            class105_365_ = (class31_349_.method325(Class348_Sub8.aHa6654!!, i_316_ xor 0x35))
                                            if (class105_365_ != null) {
                                                i_369_ = class105_365_.method971()
                                                val i_386_ = class105_365_.method969()
                                                if (i_386_ > i_374_) i_374_ = i_386_
                                                class105_365_.method984(Class151.anIntArray2062)
                                                i_373_ = Class151.anIntArray2062!![0]
                                            }
                                        }
                                        var class324 = Class240.aClass324_4684
                                        var class324_387_ = Class240.aClass324_4684
                                        var class143 = Class258_Sub1.aClass143_8527
                                        var i_388_ = class31.anInt435
                                        var class143_389_ = Class258_Sub1.aClass143_8527
                                        if (i_388_ >= 0) {
                                            val class324_390_ = Class14.method232((Class348_Sub8.aHa6654), (-53).toByte(), true, i_388_)
                                            val class143_391_ = (Class135.method1151(-25411, Class348_Sub8.aHa6654, i_388_))
                                            if (class324_390_ != null && class143_391_ != null) {
                                                class324 = class324_390_
                                                class143 = class143_391_
                                            }
                                        }
                                        if (class31_349_ != null) {
                                            i_388_ = (class31_349_.anInt435)
                                            if (i_388_ >= 0) {
                                                val class324_392_ = (Class14.method232(Class348_Sub8.aHa6654, (-53).toByte(), true, i_388_))
                                                val class143_393_ = (Class135.method1151(-25411, Class348_Sub8.aHa6654, i_388_))
                                                if (class324_392_ != null && class143_393_ != null) {
                                                    class143_389_ = class143_393_
                                                    class324_387_ = class324_392_
                                                }
                                            }
                                        }
                                        val object_394_: Any? = null
                                        var string: String? = null
                                        val bool = false
                                        var i_395_ = 0
                                        val string_396_ = (class31.method333((class318_sub1_sub3_sub3.anIntArray10229[i_344_]), 0))
                                        val i_397_ = class143!!.method1183(true, string_396_)
                                        if (class31_349_ != null) {
                                            string = (class31_349_.method333((class318_sub1_sub3_sub3.anIntArray10284[i_344_]), 0))
                                            i_395_ = class143_389_!!.method1183(true, string)
                                        }
                                        var i_398_ = 0
                                        if (i_356_ > 0) i_398_ = i_397_ / i_356_ + 1
                                        var i_399_ = 0
                                        if (class31_349_ != null && i_367_ > 0) i_399_ = i_395_ / i_367_ - -1
                                        var i_400_ = 0
                                        val i_401_ = i_400_
                                        if (i_355_ > 0) i_400_ += i_355_
                                        i_400_ += 2
                                        val i_402_ = i_400_
                                        if (i_357_ > 0) i_400_ += i_357_
                                        val i_403_ = i_400_
                                        var i_404_ = i_400_
                                        if (i_356_ <= 0) i_400_ += i_397_
                                        else {
                                            val i_405_ = i_356_ * i_398_
                                            i_404_ += (i_405_ + -i_397_) / 2
                                            i_400_ += i_405_
                                        }
                                        val i_406_ = i_400_
                                        if (i_358_ > 0) i_400_ += i_358_
                                        var i_407_ = 0
                                        var i_408_ = 0
                                        var i_409_ = 0
                                        var i_410_ = 0
                                        var i_411_ = 0
                                        if (class31_349_ != null) {
                                            i_400_ += 2
                                            i_407_ = i_400_
                                            if (i_366_ > 0) i_400_ += i_366_
                                            i_400_ += 2
                                            i_408_ = i_400_
                                            if (i_368_ > 0) i_400_ += i_368_
                                            i_411_ = i_400_
                                            i_409_ = i_400_
                                            if (i_367_ > 0) {
                                                val i_412_ = i_399_ * i_367_
                                                i_411_ += (i_412_ - i_395_) / 2
                                                i_400_ += i_412_
                                            } else i_400_ += i_395_
                                            i_410_ = i_400_
                                            if (i_369_ > 0) i_400_ += i_369_
                                        }
                                        val i_413_ = (-Class367_Sub11.anInt7396 + (class318_sub1_sub3_sub3.anIntArray10219[i_344_]))
                                        val i_414_ = (-(class31.anInt424 * i_413_ / class31.anInt434) + class31.anInt424)
                                        val i_415_ = (-class31.anInt422 + (class31.anInt422 * i_413_ / class31.anInt434))
                                        val i_416_ = (i_317_ + Class239_Sub21.anIntArray6062!![0] + -(i_400_ shr 1) - -i_414_)
                                        val i_417_ = -12 + (i + ((Class239_Sub21.anIntArray6062!![1]) - -i_415_))
                                        var i_418_ = i_417_
                                        var i_419_ = i_417_ + i_374_
                                        val i_420_ = 15 + (i_417_ - -(class31.anInt420))
                                        val i_421_ = (i_420_ + -class143.anInt1988)
                                        val i_422_ = (i_420_ - -class143.anInt1993)
                                        if (i_418_ > i_421_) i_418_ = i_421_
                                        if (i_419_ < i_422_) i_419_ = i_422_
                                        var i_423_ = 0
                                        if (class31_349_ != null) {
                                            i_423_ = 15 + (i_417_ - -(class31_349_.anInt420))
                                            val i_424_ = (-(class143_389_!!.anInt1988) + i_423_)
                                            if (i_424_ < i_418_) i_418_ = i_424_
                                            val i_425_ = ((class143_389_.anInt1993) + i_423_)
                                            if (i_419_ < i_425_) i_419_ = i_425_
                                        }
                                        var i_426_ = 255
                                        if (class31.anInt426 >= 0) i_426_ = ((i_413_ shl 8) / (-class31.anInt426 + (class31.anInt434)))
                                        if (i_426_ >= 0 && i_426_ < 255) {
                                            val i_427_ = i_426_ shl 24
                                            val i_428_ = 0xffffff or i_427_
                                            if (class105_375_ != null) class105_375_.method964((-i_359_ + i_401_ + i_416_), i_417_, 0, i_428_, 1)
                                            if (class105_379_ != null) class105_379_.method964((-i_361_ + i_402_ + i_416_), i_417_, 0, i_428_, 1)
                                            if (class105_377_ != null) {
                                                var i_429_ = 0
                                                while ((i_398_ > i_429_)) {
                                                    class105_377_.method964((i_403_ + (i_416_ + (-i_360_ - -(i_356_ * i_429_)))), i_417_, 0, i_428_, 1)
                                                    i_429_++
                                                }
                                            }
                                            if (class105_381_ != null) class105_381_.method964(i_406_ + i_416_ + -i_362_, i_417_, 0, i_428_, 1)
                                            class324!!.method2576(string_396_, (class31.anInt444 or i_427_), i_420_, i_404_ + i_416_, 0, -124)
                                            if (class31_349_ != null) {
                                                if (class105 != null) class105.method964((i_416_ + i_407_ - i_370_), i_417_, 0, i_428_, 1)
                                                if (class105_364_ != null) class105_364_.method964(-i_372_ + (i_408_ + i_416_), i_417_, 0, i_428_, 1)
                                                if (class105_363_ != null) {
                                                    for (i_430_ in 0..<i_399_) class105_363_.method964((i_430_ * i_367_ + i_416_ + (i_409_ + -i_371_)), i_417_, 0, i_428_, 1)
                                                }
                                                if (class105_365_ != null) class105_365_.method964((i_416_ - -i_410_ + -i_373_), i_417_, 0, i_428_, 1)
                                                class324_387_!!.method2576(string, (i_427_ or (class31_349_.anInt444)), i_423_, i_416_ + i_411_, 0, -125)
                                            }
                                        } else {
                                            if (class105_375_ != null) class105_375_.method974(i_416_ - (-i_401_ + i_359_), i_417_)
                                            if (class105_379_ != null) class105_379_.method974(i_416_ - (-i_402_ - -i_361_), i_417_)
                                            if (class105_377_ != null) {
                                                for (i_431_ in 0..<i_398_) class105_377_.method974((i_403_ + i_416_ - (i_360_ - i_431_ * i_356_)), i_417_)
                                            }
                                            if (class105_381_ != null) class105_381_.method974(i_406_ + (i_416_ + -i_362_), i_417_)
                                            class324!!.method2576(string_396_, (class31.anInt444 or 0xffffff.inv()), i_420_, i_416_ + i_404_, 0, i_316_ xor 0x74.inv())
                                            if (class31_349_ != null) {
                                                if (class105 != null) class105.method974((-i_370_ + i_416_ + i_407_), i_417_)
                                                if (class105_364_ != null) class105_364_.method974(i_408_ + (i_416_ + -i_372_), i_417_)
                                                if (class105_363_ != null) {
                                                    var i_432_ = 0
                                                    while (i_399_ > i_432_) {
                                                        class105_363_.method974((i_432_ * i_367_ + (-i_371_ + i_416_ + i_409_)), i_417_)
                                                        i_432_++
                                                    }
                                                }
                                                if (class105_365_ != null) class105_365_.method974(i_410_ + i_416_ - i_373_, i_417_)
                                                class324_387_!!.method2576(string, (class31_349_.anInt444) or 0xffffff.inv(), i_423_, i_411_ + i_416_, 0, -119)
                                            }
                                        }
                                        Class338.method2663(-5590, i_416_, i_416_ + i_400_, i_418_, 1 + i_419_)
                                    }
                                }
                            }
                            i_344_++
                        }
                    }
                }
                i_322_++
            }
            for (i_433_ in 0..<Class45.anInt669) {
                val i_434_ = Class258_Sub4.anIntArray8557!![i_433_]
                val class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3?
                if (i_434_ >= 2048) class318_sub1_sub3_sub3 = ((Class282.aClass356_3654!!.method3480((-2048 + i_434_).toLong(), -6008) as? Class348_Sub22)?.aNpc_6859)
                else class318_sub1_sub3_sub3 = Class294.aPlayerArray5058!![i_434_]
                val i_435_ = Class268.anIntArray3432!![i_433_]
                val class318_sub1_sub3_sub3_436_: Class318_Sub1_Sub3_Sub3?
                if (i_435_ >= 2048) class318_sub1_sub3_sub3_436_ = ((Class282.aClass356_3654!!.method3480((-2048 + i_435_).toLong(), -6008) as? Class348_Sub22)?.aNpc_6859)
                else class318_sub1_sub3_sub3_436_ = Class294.aPlayerArray5058!![i_435_]
                Class191.method1430(--class318_sub1_sub3_sub3!!.anInt10261, 119.toByte(), i_320_, i_315_, i, i_319_, i_318_, i_317_, class318_sub1_sub3_sub3_436_, class318_sub1_sub3_sub3)
            }
            val i_437_ = i_316_ + (Class369.aClass143_4962!!.anInt1993 + Class369.aClass143_4962!!.anInt1988)
            for (i_438_ in 0..<Class88.anInt1497) {
                val i_439_ = Class309.anIntArray4822!![i_438_]
                var i_440_ = Class309.anIntArray4813!![i_438_]
                val i_441_ = Class309.anIntArray4819!![i_438_]
                var bool = true
                while (bool) {
                    bool = false
                    var i_442_ = 0
                    while (i_438_ > i_442_) {
                        if (i_440_ - -2 > Class309.anIntArray4813!![i_442_] + -i_437_ && (-i_437_ + i_440_ < 2 + Class309.anIntArray4813!![i_442_]) && ((Class309.anIntArray4822!![i_442_] - -Class309.anIntArray4819!![i_442_]) > i_439_ + -i_441_) && ((-Class309.anIntArray4819!![i_442_] + Class309.anIntArray4822!![i_442_]) < i_439_ + i_441_) && (-i_437_ + Class309.anIntArray4813!![i_442_] < i_440_)) {
                            i_440_ = -i_437_ + Class309.anIntArray4813!![i_442_]
                            bool = true
                        }
                        i_442_++
                    }
                }
                Class309.anIntArray4813!![i_438_] = i_440_
                val string = Class309.aStringArray4818!![i_438_]
                val i_443_ = Class369.aClass143_4962!!.method1183(true, string)
                var i_444_ = i_439_ + i_317_
                var i_445_ = -Class369.aClass143_4962!!.anInt1988 + i_440_ + i
                var i_446_ = i_444_ - -i_443_
                var i_447_ = i_440_ + i - -Class369.aClass143_4962!!.anInt1993
                if (Class348_Sub40_Sub31.anInt9408 == 0) {
                    var i_448_ = 16776960
                    if (Class309.anIntArray4817!![i_438_] < 6) i_448_ = (Class115.anIntArray1757!![Class309.anIntArray4817!![i_438_]])
                    if (Class309.anIntArray4817!![i_438_] == 6) i_448_ = (if (Class239_Sub15.anInt6006 % 20 >= 10) 16776960 else 16711680)
                    if (Class309.anIntArray4817!![i_438_] == 7) i_448_ = if (Class239_Sub15.anInt6006 % 20 < 10) 255 else 65535
                    if (Class309.anIntArray4817!![i_438_] == 8) i_448_ = (if (Class239_Sub15.anInt6006 % 20 >= 10) 8454016 else 45056)
                    if (Class309.anIntArray4817!![i_438_] == 9) {
                        val i_449_ = -Class309.anIntArray4812!![i_438_] + 150
                        if (i_449_ < 50) i_448_ = 1280 * i_449_ + 16711680
                        else if (i_449_ < 100) i_448_ = -(327680 * i_449_) + 16384000 + 16776960
                        else if (i_449_ < 150) i_448_ = 5 * (-100 + i_449_) + 65280
                    }
                    if (Class309.anIntArray4817!![i_438_] == 10) {
                        val i_450_ = 150 - Class309.anIntArray4812!![i_438_]
                        if (i_450_ >= 50) {
                            if (i_450_ >= 100) {
                                if (i_450_ < 150) i_448_ = (-(5 * i_450_) - -500 + 327680 * i_450_ - 32767745)
                            } else i_448_ = 33095935 + -(327680 * i_450_)
                        } else i_448_ = 16711680 + 5 * i_450_
                    }
                    if (Class309.anIntArray4817!![i_438_] == 11) {
                        val i_451_ = 150 - Class309.anIntArray4812!![i_438_]
                        if (i_451_ >= 50) {
                            if (i_451_ < 100) i_448_ = 327685 * (-50 + i_451_) + 65280
                            else if (i_451_ < 150) i_448_ = 16777215 + -(327680 * (i_451_ - 100))
                        } else i_448_ = 16777215 + -(i_451_ * 327685)
                    }
                    val i_452_ = 0xffffff.inv() or i_448_
                    if (Class309.anIntArray4806!![i_438_] == 0) {
                        Class262.aClass324_3326!!.method2575(115.toByte(), i_439_ + i_317_, i_452_, string, -16777216, i_440_ + i)
                        i_444_ -= i_443_ shr 1
                        i_446_ -= i_443_ shr 1
                    }
                    if (Class309.anIntArray4806!![i_438_] == 1) {
                        i_446_ -= i_443_ shr 1
                        i_444_ -= i_443_ shr 1
                        Class262.aClass324_3326!!.method2574(i_452_, i_440_ + i, string, i_317_ - -i_439_, -16777216, Class239_Sub15.anInt6006, false)
                        i_447_ += 5
                        i_445_ -= 5
                    }
                    if (Class309.anIntArray4806!![i_438_] == 2) {
                        i_447_ += 5
                        i_446_ -= -5 + (i_443_ shr 1)
                        Class262.aClass324_3326!!.method2581(string, i_452_, (Class239_Sub15.anInt6006), i_440_ + i, (-112).toByte(), -16777216, i_317_ - -i_439_)
                        i_445_ -= 5
                        i_444_ -= (i_443_ shr 1) - -5
                    }
                    if (Class309.anIntArray4806!![i_438_] == 3) {
                        i_446_ -= i_443_ shr 1
                        i_444_ -= i_443_ shr 1
                        i_447_ += 7
                        Class262.aClass324_3326!!.method2577(Class239_Sub15.anInt6006, i + i_440_, string, i_452_, -16777216, 150 + -Class309.anIntArray4812!![i_438_], i_439_ + i_317_, -20509)
                        i_445_ -= 7
                    }
                    if (Class309.anIntArray4806!![i_438_] == 4) {
                        val i_453_ = ((150 + -Class309.anIntArray4812!![i_438_]) * (Class369.aClass143_4962!!.method1183(true, string) + 100) / 150)
                        Class348_Sub8.aHa6654!!.T(i_317_ - (-i_439_ - -50), i, 50 + (i_439_ + i_317_), i - -i_315_)
                        i_444_ += 50 - i_453_
                        i_446_ += -i_453_ + 50
                        Class262.aClass324_3326!!.method2576(string, i_452_, i + i_440_, (i_317_ - (-i_439_ - 50) - i_453_), -16777216, i_316_ + -125)
                        Class348_Sub8.aHa6654!!.KA(i_317_, i, i_318_ + i_317_, i + i_315_)
                    }
                    if (Class309.anIntArray4806!![i_438_] == 5) {
                        val i_454_ = 150 + -Class309.anIntArray4812!![i_438_]
                        var i_455_ = 0
                        if (i_454_ >= 25) {
                            if (i_454_ > 125) i_455_ = i_454_ + -125
                        } else i_455_ = i_454_ - 25
                        val i_456_ = (Class369.aClass143_4962!!.anInt1993 + Class369.aClass143_4962!!.anInt1988)
                        Class348_Sub8.aHa6654!!.T(i_317_, i_440_ + i - (i_456_ - -1), i_318_ + i_317_, 5 + i_440_ + i)
                        i_444_ -= i_443_ shr 1
                        i_447_ += i_455_
                        Class262.aClass324_3326!!.method2575((-105).toByte(), i_439_ + i_317_, i_452_, string, -16777216, i_455_ + (i + i_440_))
                        i_445_ += i_455_
                        i_446_ -= i_443_ shr 1
                        Class348_Sub8.aHa6654!!.KA(i_317_, i, i_318_ + i_317_, i_315_ + i)
                    }
                } else {
                    i_444_ -= i_443_ shr 1
                    i_446_ -= i_443_ shr 1
                    Class262.aClass324_3326!!.method2575(118.toByte(), i_439_ + i_317_, -256, string, -16777216, i_440_ + i)
                }
                Class338.method2663(i_316_ + -5592, i_444_, 1 + i_446_, i_445_, 1 + i_447_)
            }
        }
    }
}
