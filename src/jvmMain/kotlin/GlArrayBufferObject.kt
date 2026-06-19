import SceneTilePlaneManager.method260
import CubemapTextureImplSourceStatics.method2270
import ProjectedGroundDecorStatics.method2431
import MapSceneCacheStatics.method826
import jaclib.memory.Buffer
import GlArrayBufferObjectStatics.anInt4706
import GlArrayBufferObjectStatics.aIntRange_4707
import GlArrayBufferObjectStatics.anInt4710
import GlArrayBufferObjectStatics.anInt4711
import GlArrayBufferObjectStatics.anInt4712
import GlArrayBufferObjectStatics.anInt4714

class GlArrayBufferObject : GlVertexBufferBase, ByteBufferReader {
    private var anInt4708 = 0
    override fun method13(i: Byte): Int {
        anInt4706++
        if (i.toInt() != -97) method10(false)
        return anInt4708
    }

    public override fun method1152(i: Int) {
        this.aHa_Sub2_1927!!.method3750(91, this)
        if (i >= -78) method10(false)
        anInt4710++
    }

    override fun method11(i: Int, i_0_: Int, `is`: ByteArray?, i_1_: Int) {
        this.method1150(`is`, 0, i_0_)
        anInt4711++
        anInt4708 = i
        if (i_1_ != -9894) method12((-37).toByte())
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, `is`: ByteArray?, i_2_: Int, bool: Boolean) : super(var_ha_Sub2, 34962, `is`, i_2_, bool) {
        try {
            anInt4708 = i
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("jt.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_2_ + ',' + bool + ')'))
        }
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, buffer: Buffer?, i_3_: Int, bool: Boolean) : super(var_ha_Sub2, 34962, buffer, i_3_, bool) {
        try {
            anInt4708 = i
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("jt.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (buffer != null) "{...}" else "null") + ',' + i_3_ + ',' + bool + ')'))
        }
    }

    override fun method10(bool: Boolean): Int {
        anInt4714++
        if (bool != true) method12((-54).toByte())
        return this.anInt1929
    }

    override fun method12(i: Byte): Long {
        if (i.toInt() != 42) aIntRange_4707 = null
        anInt4712++
        return 0L
    }
}
