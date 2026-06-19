import jaclib.memory.Buffer
import GlIndexBufferArbStatics.anInt8496
import GlIndexBufferArbStatics.anInt8497
import GlIndexBufferArbStatics.anInt8499
import GlIndexBufferArbStatics.anInt8500
import GlIndexBufferArbStatics.anInt8501
import GlIndexBufferArbStatics.aTrigLookupTables_8503
import GlIndexBufferArbStatics.anInt8506

class GlIndexBufferArb internal constructor(glRenderDevice: GlRenderDevice, movementDirection: MovementDirection?, bool: Boolean) : GlBufferObject(glRenderDevice, 34963, bool), IndexBufferResource {
    private val aMovementDirection_8504: MovementDirection?
    override fun method23(i: Int, i_0_: Int) {
        super.method23(i, i_0_ * aMovementDirection_8504!!.anInt1178)
        anInt8499++
    }

    override fun method24(bool: Boolean, bool_1_: Boolean): Buffer? {
        if (bool_1_ != false) aTrigLookupTables_8503 = null
        anInt8500++
        return super.method2120(0, (this.aGlRenderDevice_4759.aMapBuffer9913), bool)
    }

    override fun method16(bool: Boolean): Int {
        anInt8497++
        if (bool != false) method16(true)
        return super.method16(false)
    }

    override fun method22(i: Int): Boolean {
        anInt8501++
        if (i != -23) return false
        return super.method2123((this.aGlRenderDevice_4759.aMapBuffer9913), 0)
    }

    override fun method25(i: Byte): MovementDirection {
        anInt8506++
        if (i <= 19) aTrigLookupTables_8503 = null
        return aMovementDirection_8504!!
    }

    override fun method21(i: Int) {
        if (i == 23315) {
            anInt8496++
            super.method21(i)
        }
    }

    init {
        try {
            aMovementDirection_8504 = movementDirection
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("mw.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (movementDirection != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }
}
