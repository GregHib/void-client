import Class243.Companion.method1879
import Class260.method1978
import Class348_Sub16_Sub1.Companion.method2826
import Class348_Sub17.Companion.method2929
import Class348_Sub45.Companion.method3309
import jaggl.OpenGL.Companion.glBindRenderbufferEXT
import jaggl.OpenGL.Companion.glFramebufferRenderbufferEXT
import jaggl.OpenGL.Companion.glGenRenderbuffersEXT
import jaggl.OpenGL.Companion.glRenderbufferStorageEXT
import jaggl.OpenGL.Companion.glRenderbufferStorageMultisampleEXT
import kotlin.math.sqrt

class Class348_Sub42_Sub2 : Class348_Sub42, Interface9 {
    private var anInt8562 = -1
    private var anInt8563 = -1
    private val aHa_Sub2_8564: ha_Sub2?
    var anInt8565: Int = 0
    private val anInt8567: Int
    private var anInt8569 = 0
    private val anInt8571: Int
    var anInt8572: Int = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt8570++
        method3172(4)
//        super.finalize()
    }

    fun method3172(i: Int) {
        anInt8566++
        if (anInt8569 > 0) {
            aHa_Sub2_8564!!.method3810(anInt8569, anInt8571, -101)
            anInt8569 = 0
        }
        if (i != 4) method3171(null, 57, 49, -22, 43, -43, -45, true, true)
    }

    fun method3173(i: Int, i_9_: Int, i_10_: Int) {
        glFramebufferRenderbufferEXT(i_10_, i_9_, i, anInt8569)
        anInt8568++
        anInt8562 = i_10_
        anInt8563 = i_9_
    }

    override fun method37(i: Int) {
        anInt8561++
        if (i != -3022) this.anInt8572 = 15
        glFramebufferRenderbufferEXT(anInt8562, anInt8563, 36161, 0)
        anInt8562 = -1
        anInt8563 = -1
    }

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, i_11_: Int, i_12_: Int) {
        try {
            this.anInt8572 = i_11_
            aHa_Sub2_8564 = var_ha_Sub2
            this.anInt8565 = i_12_
            anInt8567 = i
            glGenRenderbuffersEXT(1, Class348_Sub40_Sub34.anIntArray9431, 0)
            anInt8569 = Class348_Sub40_Sub34.anIntArray9431!![0]
            glBindRenderbufferEXT(36161, anInt8569)
            glRenderbufferStorageEXT(36161, anInt8567, (this.anInt8572), (this.anInt8565))
            anInt8571 = (this.anInt8565 * this.anInt8572 * aHa_Sub2_8564!!.method3798(anInt8567, 2))
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("kw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_11_ + ',' + i_12_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, i_13_: Int, i_14_: Int, i_15_: Int) {
        try {
            this.anInt8572 = i_13_
            anInt8567 = i
            this.anInt8565 = i_14_
            aHa_Sub2_8564 = var_ha_Sub2
            glGenRenderbuffersEXT(1, Class348_Sub40_Sub34.anIntArray9431, 0)
            anInt8569 = Class348_Sub40_Sub34.anIntArray9431!![0]
            glBindRenderbufferEXT(36161, anInt8569)
            glRenderbufferStorageMultisampleEXT(36161, i_15_, anInt8567, this.anInt8572, this.anInt8565)
            anInt8571 = (this.anInt8565 * this.anInt8572 * aHa_Sub2_8564!!.method3798(anInt8567, 2))
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("kw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'))
        }
    }

    companion object {
        var anInt8561: Int = 0
        var anInt8566: Int = 0
        var anInt8568: Int = 0
        var anInt8570: Int = 0
        @JvmField
        var aLong8573: Long = 0L

        fun method3171(var_ha: ha?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, bool: Boolean, bool_5_: Boolean) {
            Class9.aHa171 = var_ha
            Npc.anInt10503 = i
            Class348_Sub40_Sub5.aBoolean9121 = (Npc.anInt10503 > 1 && Class9.aHa171!!.method3708())
            Class362.anInt4459 = i_0_
            Class270.anInt3465 = 1 shl Class362.anInt4459
            Class348_Sub23_Sub2.anInt9037 = Class270.anInt3465 shr 1
            sqrt(((Class348_Sub23_Sub2.anInt9037 * Class348_Sub23_Sub2.anInt9037) + (Class348_Sub23_Sub2.anInt9037 * Class348_Sub23_Sub2.anInt9037)).toDouble())
            Class189.anInt2524 = i_1_
            Class318_Sub7.anInt6451 = i_2_
            Class348_Sub41.anInt7054 = i_3_
            Class318_Sub1_Sub4_Sub1.anInt10084 = i_4_
            Class50_Sub4.aClass47_5262 = method2826(15)
            method3309(-124)
            Class65.aClass357ArrayArrayArray1148 = (Array<Array<Array<Class357?>?>?>(i_1_) { Array<Array<Class357?>?>(Class318_Sub7.anInt6451) { arrayOfNulls<Class357>(Class348_Sub41.anInt7054) } })
            Class348_Sub1_Sub1.aSArray8801 = arrayOfNulls<s>(i_1_)
            if (bool) {
                Class342.anIntArrayArray4253 = Array<IntArray?>(Class318_Sub7.anInt6451) { IntArray(Class348_Sub41.anInt7054) }
                Class348_Sub1_Sub2.aByteArrayArray8816 = Array<ByteArray?>(Class318_Sub7.anInt6451) { ByteArray(Class348_Sub41.anInt7054) }
                Class239_Sub1.aShortArrayArray5847 = Array<ShortArray?>(Class318_Sub7.anInt6451) { ShortArray(Class348_Sub41.anInt7054) }
                Class348_Sub31_Sub2.aClass357ArrayArrayArray9082 = (Array<Array<Array<Class357?>?>?>(1) { Array<Array<Class357?>?>(Class318_Sub7.anInt6451) { arrayOfNulls<Class357>(Class348_Sub41.anInt7054) } })
                Class332.aSArray4142 = arrayOfNulls<s>(1)
            } else {
                Class342.anIntArrayArray4253 = null
                Class348_Sub1_Sub2.aByteArrayArray8816 = null
                Class239_Sub1.aShortArrayArray5847 = null
                Class348_Sub31_Sub2.aClass357ArrayArrayArray9082 = null
                Class332.aSArray4142 = null
            }
            if (bool_5_) {
                Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431 = Array<Array<LongArray?>?>(i_1_) { Array<LongArray?>(i_2_) { LongArray(i_3_) } }
                Class239_Sub14.aClass211Array5993 = arrayOfNulls<Class211>(65535)
                r.aBooleanArray9718 = BooleanArray(65535)
                Class331.anInt4135 = 0
            } else {
                Class348_Sub42_Sub8_Sub2.aLongArrayArrayArray10431 = null
                Class239_Sub14.aClass211Array5993 = null
                r.aBooleanArray9718 = null
                Class331.anInt4135 = 0
            }
            method1879(false)
            aClass318_Sub1Array4293 = arrayOfNulls<Class318_Sub1>(2)
            Class250.aClass318_Sub1Array3226 = arrayOfNulls<Class318_Sub1>(2)
            Class115.aClass318_Sub1Array1754 = arrayOfNulls<Class318_Sub1>(2)
            Class239_Sub21.aClass318_Sub1Array6066 = arrayOfNulls<Class318_Sub1>(10000)
            Class5_Sub1_Sub1.anInt9930 = 0
            Class291.aClass318_Sub1Array3737 = arrayOfNulls<Class318_Sub1>(5000)
            Class348_Sub42_Sub3.Companion.anInt9504 = 0
            Class24.aClass318_Sub1_Sub3Array357 = arrayOfNulls<Class318_Sub1_Sub3>(5000)
            Class86.anInt1477 = 0
            Class99.aBooleanArrayArray1572 = (Array<BooleanArray?>((Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 1)) { BooleanArray((Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 1)) })
            Class348_Sub8.aBooleanArrayArray6656 = (Array<BooleanArray?>((Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 2)) { BooleanArray((Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 2)) })
            Class171.anIntArray2272 = IntArray((Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 2))
            Class71.aClass76_1208 = Class71.aClass76_1210
            if (Class348_Sub40_Sub5.aBoolean9121) {
                Class115.aBooleanArrayArrayArray1751 = (Array<Array<BooleanArray?>?>(i_1_) { Array<BooleanArray?>((Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 1)) { BooleanArray((Class318_Sub1_Sub4_Sub1.anInt10084 + Class318_Sub1_Sub4_Sub1.anInt10084 + 1)) } })
                Class5_Sub2.aBooleanArrayArrayArray8361 = arrayOfNulls<Array<BooleanArray?>>(i_1_)
                if (Class348_Sub40_Sub34.aClass293Array9432 != null) method1978()
                Class348_Sub40_Sub34.aClass293Array9432 = arrayOfNulls<Class293>(Npc.anInt10503)
                Class9.aHa171!!.method3631((Class348_Sub40_Sub34.aClass293Array9432)!!.size + 1)
                Class9.aHa171!!.method3659(0)
                for (i_6_ in Class348_Sub40_Sub34.aClass293Array9432!!.indices) {
                    Class348_Sub40_Sub34.aClass293Array9432!![i_6_] = Class293(i_6_ + 1, Class9.aHa171!!)
                    Thread(Class348_Sub40_Sub34.aClass293Array9432!![i_6_], "wr" + i_6_).start()
                }
                val i_7_: Int
                if (Npc.anInt10503 == 2) {
                    i_7_ = 4
                    Class75_Sub1.anInt5652 = 2
                } else if (Npc.anInt10503 == 3) {
                    i_7_ = 6
                    Class75_Sub1.anInt5652 = 3
                } else {
                    i_7_ = 8
                    Class75_Sub1.anInt5652 = 4
                }
                Class319.aClass315Array3982 = arrayOfNulls<Class315>(i_7_)
                for (i_8_ in 0..<i_7_) Class319.aClass315Array3982!![i_8_] = Class315(Class239_Sub24.aStringArrayArray6093!![(Npc.anInt10503 - 2)]!![i_8_])
            } else Class75_Sub1.anInt5652 = 1
            Class17.anIntArray256 = IntArray(Class75_Sub1.anInt5652 - 1)
            Class345.anIntArray4271 = IntArray(Class75_Sub1.anInt5652 - 1)
        }
    }
}
