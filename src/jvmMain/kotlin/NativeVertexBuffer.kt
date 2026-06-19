import NativeVertexBufferStatics.anInt4828
import NativeVertexBufferStatics.anInt4830
import NativeVertexBufferStatics.anInt4831
import NativeVertexBufferStatics.anInt4832

/* Class119_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NativeVertexBuffer internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, `is`: ByteArray?, i_7_: Int) : NativeBufferWrapper(var_ha_Sub2, `is`, i_7_), ByteArrayCodec {
    private var anInt4827 = 0
    override fun method33(i: Int): Int {
        if (i != -23923) return 92
        anInt4830++
        return 0
    }

    override fun method36(i: Byte): Long {
        if (i <= 76) anInt4827 = 68
        anInt4832++
        return this.aBuffer1792!!.getAddress()
    }

    override fun method34(i: Int): Int {
        anInt4831++
        if (i != -5711) method35(null, -107, -123, -39)
        return anInt4827
    }

    override fun method35(`is`: ByteArray?, i: Int, i_5_: Int, i_6_: Int) {
        this.method1076(`is`, i_6_)
        anInt4828++
        anInt4827 = i
        if (i_5_ < 18) anInt4827 = -41
    }

    init {
        try {
            anInt4827 = i
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("wv.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_7_ + ')'))
        }
    }
}
