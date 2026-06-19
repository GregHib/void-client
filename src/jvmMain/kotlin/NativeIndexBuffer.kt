import MinimapRectClipper.method226
import RemoveRoofsOptionStateStatics.method1813
import FixedFunctionWaterPassStatics.method3549
import jaclib.memory.Buffer
import NativeIndexBufferStatics.anInt4699
import NativeIndexBufferStatics.anInt4701
import NativeIndexBufferStatics.anInt4704
import NativeIndexBufferStatics.anInt4705
import NativeIndexBufferStatics.method1077

class NativeIndexBuffer : NativeBufferWrapper, ByteBufferReader {
    private var anInt4697 = 0

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, `is`: ByteArray?, i_0_: Int) : super(var_ha_Sub2, `is`, i_0_) {
        try {
            anInt4697 = i
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("cw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_0_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, buffer: Buffer?) : super(var_ha_Sub2, buffer) {
        try {
            anInt4697 = i
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("cw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (buffer != null) "{...}" else "null") + ')'))
        }
    }

    override fun method12(i: Byte): Long {
        if (i.toInt() != 42) method1077(null, (-124).toByte())
        anInt4704++
        return this.aBuffer1792!!.getAddress()
    }

    override fun method13(i: Byte): Int {
        anInt4699++
        if (i.toInt() != -97) return -87
        return anInt4697
    }

    override fun method11(i: Int, i_2_: Int, `is`: ByteArray?, i_3_: Int) {
        anInt4705++
        this.method1076(`is`, i_2_)
        anInt4697 = i
        if (i_3_ != -9894) method10(false)
    }

    override fun method10(bool: Boolean): Int {
        anInt4701++
        if (bool != true) method11(126, 120, null, -73)
        return 0
    }
}
