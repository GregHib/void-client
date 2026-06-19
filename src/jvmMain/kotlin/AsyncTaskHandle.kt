import AsyncTaskHandleStatics.anInt2575
import AsyncTaskHandleStatics.anInt2580

/* Class192 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class AsyncTaskHandle internal constructor(var aBoolean2574: Boolean) {
    var anInterface5_Impl2_2572: IndexBufferResource? = null
    var anInterface5_Impl2_2576: IndexBufferResource? = null
    var aBoolean2577: Boolean = false
    fun method1435(i: Byte) {
        if (i >= -6) this.aBoolean2577 = true
        anInt2575++
        if (this.anInterface5_Impl2_2576 != null) this.anInterface5_Impl2_2576!!.method21(23315)
        this.aBoolean2577 = false
    }

    fun method1437(i: Byte): Boolean {
        anInt2580++
        if (i.toInt() != -100) this.anInterface5_Impl2_2572 = null
        return this.aBoolean2577 && !this.aBoolean2574
    }
}
