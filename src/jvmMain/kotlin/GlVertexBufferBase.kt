import jaclib.memory.Buffer
import jaggl.OpenGLStatics.glBufferDataARBa
import jaggl.OpenGLStatics.glBufferDataARBub
import jaggl.OpenGLStatics.glBufferSubDataARBub
import jaggl.OpenGLStatics.glGenBuffersARB
import java.awt.Color
import GlVertexBufferBaseStatics.method1148
import GlVertexBufferBaseStatics.anInt1922
import GlVertexBufferBaseStatics.anInt1926

abstract class GlVertexBufferBase {
    private var anInt1921 = 0
    private val aBoolean1923: Boolean
    @JvmField
    var aHa_Sub2_1927: OpenGlRenderer? = null
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

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, `is`: ByteArray?, i_4_: Int, bool: Boolean) {
        try {
            aBoolean1923 = bool
            this.aHa_Sub2_1927 = var_ha_Sub2
            anInt1930 = i
            anInt1921 = i_4_
            glGenBuffersARB(1, NativeRenderNodeStatics.anIntArray10478, 0)
            this.anInt1929 = NativeRenderNodeStatics.anIntArray10478!![0]
            method1152(-111)
            glBufferDataARBub(i, anInt1921, `is`, 0, if (aBoolean1923) 35040 else 35044)
            this.aHa_Sub2_1927!!.anInt7747 += anInt1921
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("bi.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_4_ + ',' + bool + ')'))
        }
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, buffer: Buffer?, i_5_: Int, bool: Boolean) {
        try {
            anInt1930 = i
            anInt1921 = i_5_
            this.aHa_Sub2_1927 = var_ha_Sub2
            aBoolean1923 = bool
            glGenBuffersARB(1, NativeRenderNodeStatics.anIntArray10478, 0)
            this.anInt1929 = NativeRenderNodeStatics.anIntArray10478!![0]
            method1152(-126)
            glBufferDataARBa(i, anInt1921, buffer!!.getAddress(), if (!aBoolean1923) 35044 else 35040)
            this.aHa_Sub2_1927!!.anInt7747 += anInt1921
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("bi.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (buffer != null) "{...}" else "null") + ',' + i_5_ + ',' + bool + ')'))
        }
    }
}
