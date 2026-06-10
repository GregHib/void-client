import jaclib.memory.Buffer
import jaggl.OpenGL.Companion.glBufferDataARBa
import jaggl.OpenGL.Companion.glBufferDataARBub
import jaggl.OpenGL.Companion.glBufferSubDataARBub
import jaggl.OpenGL.Companion.glGenBuffersARB
import java.awt.Color

abstract class Class135 {
    private var anInt1921 = 0
    private val aBoolean1923: Boolean
    @JvmField
    var aHa_Sub2_1927: ha_Sub2? = null
    @JvmField
    var anInt1929: Int = 0
    private val anInt1930: Int

    fun method1150(`is`: ByteArray?, i: Int, i_2_: Int) {
        anInt1926++
        if (i != 0) method1148(-47, 124)
        method1152(i xor 0x74.inv())
        if (anInt1921 >= i_2_) glBufferSubDataARBub(anInt1930, 0, i_2_, `is`, 0)
        else {
            glBufferDataARBub(anInt1930, i_2_, `is`, 0, if (!aBoolean1923) 35044 else 35040)
            this.aHa_Sub2_1927!!.anInt7747 += -anInt1921 + i_2_
            anInt1921 = i_2_
        }
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt1922++
        this.aHa_Sub2_1927!!.method3780(anInt1921, -1, this.anInt1929)
//        super.finalize()
    }

    abstract fun method1152(i: Int)

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, `is`: ByteArray?, i_4_: Int, bool: Boolean) {
        try {
            aBoolean1923 = bool
            this.aHa_Sub2_1927 = var_ha_Sub2
            anInt1930 = i
            anInt1921 = i_4_
            glGenBuffersARB(1, r_Sub1.anIntArray10478, 0)
            this.anInt1929 = r_Sub1.anIntArray10478!![0]
            method1152(-111)
            glBufferDataARBub(i, anInt1921, `is`, 0, if (aBoolean1923) 35040 else 35044)
            this.aHa_Sub2_1927!!.anInt7747 += anInt1921
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bi.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_4_ + ',' + bool + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, buffer: Buffer?, i_5_: Int, bool: Boolean) {
        try {
            anInt1930 = i
            anInt1921 = i_5_
            this.aHa_Sub2_1927 = var_ha_Sub2
            aBoolean1923 = bool
            glGenBuffersARB(1, r_Sub1.anIntArray10478, 0)
            this.anInt1929 = r_Sub1.anIntArray10478!![0]
            method1152(-126)
            glBufferDataARBa(i, anInt1921, buffer!!.getAddress(), if (!aBoolean1923) 35044 else 35040)
            this.aHa_Sub2_1927!!.anInt7747 += anInt1921
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bi.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (buffer != null) "{...}" else "null") + ',' + i_5_ + ',' + bool + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt1922: Int = 0
        @JvmField
        var anInt1924: Int = 0
        @JvmField
        var anInt1925: Int = 0
        @JvmField
        var anInt1926: Int = 0
        @JvmField
        var aColorArray1928: Array<Color?>? = arrayOf<Color?>(Color(9179409), Color(3289650), Color(3289650), Color(3289650))
        @JvmStatic
        fun method1148(i: Int, i_0_: Int) {
            anInt1925++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, 105.toByte(), i_0_) //6
            class348_sub42_sub15.method3251(i_0_ xor 0x3ebf.inv())
        }

        @JvmStatic
        fun method1149(i: Int) {
            val i_1_ = -90 / ((-50 - i) / 37)
            aColorArray1928 = null
        }

        @JvmStatic
        fun method1151(i: Int, var_ha: ha?, i_3_: Int): Class143? {
            anInt1924++
            if (i != -25411) return null
            val class352 = Class239_Sub3.method1734(i_3_, var_ha, (-81).toByte(), true)
            if (class352 == null) return null
            return class352.aClass143_4333
        }
    }
}
