import jaclib.memory.Buffer
import jaclib.memory.Source
import jaclib.memory.heap.NativeHeapBuffer
import jaggl.MapBuffer
import jaggl.OpenGL.Companion.glBindBufferARB
import jaggl.OpenGL.Companion.glBufferDataARBa
import jaggl.OpenGL.Companion.glBufferDataARBub
import jaggl.OpenGL.Companion.glBufferSubDataARBa
import jaggl.OpenGL.Companion.glGenBuffersARB

abstract class Class285 internal constructor(var aClass377_4759: Class377, private val anInt4755: Int, private val aBoolean4750: Boolean) : Interface5 {
    private var anInt4736 = 0
    private var anInt4739 = 0
    private var anInt4746 = -1
    private var anInt4747 = 0
    private var aNativeHeapBuffer4748: NativeHeapBuffer? = null

    fun method2120(i: Int, mapbuffer: MapBuffer, bool: Boolean): Buffer? {
        anInt4756++
        if (anInt4736 == 0) {
            method2126((-36).toByte())
            if (anInt4746 <= 0) {
                anInt4736 = 2
                return aNativeHeapBuffer4748
            }
            glBindBufferARB(anInt4755, anInt4746)
            if (bool) {
                glBufferDataARBub(anInt4755, anInt4739, null, 0, if (aBoolean4750) 35040 else 35044)
                if (anInt4747 <= (this.aClass377_4759.aNativeHeapBuffer7974!!.b)) {
                    anInt4736 = 1
                    return (this.aClass377_4759.aNativeHeapBuffer7974)
                }
            }
            if (!mapbuffer.a() && mapbuffer.a(anInt4755, anInt4747, 35001)) {
                anInt4736 = 2
                return mapbuffer
            }
        }
        return null
    }

    fun method2121(i: Int, source: Source, i_3_: Int): Boolean {
        anInt4745++
        if (i != 25625) method2126((-74).toByte())
        if (i_3_ > anInt4739) {
            method2126((-36).toByte())
            if (anInt4746 <= 0) throw RuntimeException("ARGH!")
            glBindBufferARB(anInt4755, anInt4746)
            glBufferDataARBa(anInt4755, i_3_, source.getAddress(), if (!aBoolean4750) 35044 else 35040)
            this.aClass377_4759.anInt8063 += i_3_ - anInt4747
            anInt4739 = i_3_
        } else if (anInt4746 > 0) {
            glBindBufferARB(anInt4755, anInt4746)
            glBufferSubDataARBa(anInt4755, 0, anInt4747, source.getAddress())
            this.aClass377_4759.anInt8063 += i_3_ - anInt4747
        } else throw RuntimeException("ARGH!")
        anInt4747 = i_3_
        return true
    }

    open fun method21(i: Int) {
        if (i != 23315) aClass323_4754 = null
        anInt4749++
        if (anInt4746 > 0) {
            this.aClass377_4759.method3969(anInt4747, anInt4746, 3089)
            anInt4746 = -1
        }
    }

    fun method2122(i: Int): Long {
        anInt4758++
        if (i != 27819) return 59L
        if (anInt4746 == 0) return aNativeHeapBuffer4748!!.getAddress()
        return 0L
    }

    fun method2123(mapbuffer: MapBuffer, i: Int): Boolean {
        anInt4735++
        var bool = true
        if (i != anInt4736) {
            if (anInt4746 > 0) {
                glBindBufferARB(anInt4755, anInt4746)
                if (anInt4736 != 1) bool = mapbuffer.b()
                else glBufferSubDataARBa(anInt4755, 0, anInt4739, this.aClass377_4759.aNativeHeapBuffer7974!!.getAddress())
            }
            anInt4736 = 0
        }
        return bool
    }

    open fun method23(i: Int, i_4_: Int) {
        anInt4752++
        if (i_4_ > anInt4739) {
            method2126((-36).toByte())
            if (anInt4746 <= 0) aNativeHeapBuffer4748 = this.aClass377_4759.method3869(47.toByte(), false, i_4_)
            else {
                glBindBufferARB(anInt4755, anInt4746)
                glBufferDataARBub(anInt4755, i_4_, null, 0, if (!aBoolean4750) 35044 else 35040)
                this.aClass377_4759.anInt8063 += i_4_ - anInt4739
            }
            anInt4739 = i_4_
        }
        anInt4747 = i_4_
        if (i != 15959) aStringArray4744 = null
    }

    fun method2125(i: Int) {
        anInt4742++
        if (i == 0) {
            if (this.aClass377_4759.aBoolean9920) glBindBufferARB(anInt4755, anInt4746)
        }
    }

    override fun method16(bool: Boolean): Int {
        anInt4740++
        if (bool != false) method2122(127)
        return anInt4747
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt4751++
        method21(23315)
//        super.finalize()
    }

    private fun method2126(i: Byte) {
        anInt4757++
        if (i.toInt() != -36) anInt4736 = -3
        if (anInt4746 < 0) {
            if (this.aClass377_4759.aBoolean9920) {
                glGenBuffersARB(1, Class260.anIntArray3311, 0)
                anInt4746 = Class260.anIntArray3311!![0]
                glBindBufferARB(anInt4755, anInt4746)
            } else anInt4746 = 0
        }
    }

    companion object {
        @JvmField
        var anInt4735: Int = 0
        @JvmField
        var anInt4737: Int = 0
        @JvmField
        var anInt4738: Int = 0
        @JvmField
        var anInt4740: Int = 0
        @JvmField
        var aBoolean4741: Boolean = false
        @JvmField
        var anInt4742: Int = 0
        @JvmField
        var aClass348_Sub16_Sub3_4743: Class348_Sub16_Sub3? = null
        @JvmField
        var aStringArray4744: Array<String?>? = arrayOfNulls<String>(200)
        @JvmField
        var anInt4745: Int = 0
        @JvmField
        var anInt4749: Int = 0
        @JvmField
        var anInt4751: Int = 0
        @JvmField
        var anInt4752: Int = 0
        @JvmField
        var anInt4753: Int = 0
        @JvmField
        var aClass323_4754: Class323? = null
        @JvmField
        var anInt4756: Int = 0
        @JvmField
        var anInt4757: Int = 0
        @JvmField
        var anInt4758: Int = 0
        fun method2119(f: Float, i: Int, f_0_: Float, i_1_: Int, f_2_: Float): Float {
            anInt4738++
            if (i_1_ >= -59) method2119(1.299765f, 45, -0.43444797f, -35, 0.059617087f)
            val fs = Class337.aFloatArrayArray4174!![i]!!
            return fs[1] * f + f_2_ * fs[0] + fs[2] * f_0_
        }

        @JvmStatic
        fun method2124(i: Int) {
            aClass348_Sub16_Sub3_4743 = null
            aClass323_4754 = null
            aStringArray4744 = null
            if (i != 0) method2119(-1.1717526f, -45, -2.0738192f, 18, -0.4863547f)
        }
    }
}
