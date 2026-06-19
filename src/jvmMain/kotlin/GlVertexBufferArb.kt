import MultiLevelOptionStateStatics.method1849
import jaclib.memory.Buffer
import jaclib.memory.Source
import GlVertexBufferArbStatics.anInt8484
import GlVertexBufferArbStatics.anInt8485
import GlVertexBufferArbStatics.anInt8486
import GlVertexBufferArbStatics.anInt8487
import GlVertexBufferArbStatics.anInt8488
import GlVertexBufferArbStatics.anInt8489
import GlVertexBufferArbStatics.anInt8490
import GlVertexBufferArbStatics.anInt8492

class GlVertexBufferArb internal constructor(glRenderDevice: GlRenderDevice, bool: Boolean) : GlBufferObject(glRenderDevice, 34962, bool), VertexBufferResource {
    private var aByte8491: Byte = 0
    override fun method21(i: Int) {
        super.method21(i)
        anInt8485++
    }

    override fun method18(i: Int): Boolean {
        if (i != 6331) anInt8492 = -14
        anInt8489++
        return super.method2123((this.aGlRenderDevice_4759.aMapBuffer9915), i xor 0x18bb)
    }

    fun method2130(i: Int): Int {
        if (i != 3545) return -18
        anInt8487++
        return aByte8491.toInt()
    }

    override fun method19(bool: Boolean, i: Int): Buffer? {
        anInt8490++
        if (i != 26775) aByte8491 = 7.toByte()
        return super.method2120(0, (this.aGlRenderDevice_4759.aMapBuffer9915), bool)
    }

    override fun method16(bool: Boolean): Int {
        anInt8486++
        if (bool != false) method18(-20)
        return super.method16(bool)
    }

    override fun method17(source: Source, i: Int, i_6_: Int, i_7_: Byte): Boolean {
        anInt8484++
        aByte8491 = i.toByte()
        if (i_7_ >= -15) aByte8491 = 62.toByte()
        super.method2121(25625, source, i_6_)
        return true
    }

    override fun method20(i: Int, i_8_: Byte, i_9_: Int): Boolean {
        anInt8488++
        aByte8491 = i_9_.toByte()
        super.method23(15959, i)
        if (i_8_ <= 122) method18(-86)
        return true
    }
}
