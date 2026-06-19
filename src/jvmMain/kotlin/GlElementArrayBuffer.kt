import ProjectileConfigUtil.method313
import NodeDequeHolderStatics.method878
import GlElementArrayBufferStatics.anInt4833
import GlElementArrayBufferStatics.aConfigFlagUtil_4835
import GlElementArrayBufferStatics.anInt4836
import GlElementArrayBufferStatics.anInt4838
import GlElementArrayBufferStatics.aServerConnectionInfo_4839
import GlElementArrayBufferStatics.anInt4840
import GlElementArrayBufferStatics.anInt4842

/* Class135_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GlElementArrayBuffer internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, `is`: ByteArray?, i_8_: Int, bool: Boolean) : GlVertexBufferBase(var_ha_Sub2, 34963, `is`, i_8_, bool), ByteArrayCodec {
    private var anInt4837 = 0
    public override fun method1152(i: Int) {
        anInt4840++
        this.aHa_Sub2_1927!!.method3793(1, this)
        if (i >= -78) aServerConnectionInfo_4839 = null
    }

    override fun method34(i: Int): Int {
        anInt4838++
        if (i != -5711) method35(null, -82, 99, -89)
        return anInt4837
    }

    override fun method35(`is`: ByteArray?, i: Int, i_0_: Int, i_1_: Int) {
        if (i_0_ > 18) {
            this.method1150(`is`, 0, i_1_)
            anInt4833++
            anInt4837 = i
        }
    }

    override fun method33(i: Int): Int {
        if (i != -23923) method35(null, -47, -115, -72)
        anInt4836++
        return this.anInt1929
    }

    override fun method36(i: Byte): Long {
        if (i < 76) aConfigFlagUtil_4835 = null
        anInt4842++
        return 0L
    }

    init {
        try {
            anInt4837 = i
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("kaa.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_8_ + ',' + bool + ')'))
        }
    }
}
