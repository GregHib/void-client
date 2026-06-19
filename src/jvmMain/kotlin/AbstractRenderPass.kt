import AbstractRenderPassStatics.anInt4480
import AbstractRenderPassStatics.anInt4481
import AbstractRenderPassStatics.anInt4482
import AbstractRenderPassStatics.anInt4483
import AbstractRenderPassStatics.anInt4484
import AbstractRenderPassStatics.anInt4485

/* Class367 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class AbstractRenderPass internal constructor(var aHa_Sub3_4479: NativeRenderer) {
    abstract fun method3520(i: Byte)

    abstract fun method3521(bool: Boolean, i: Byte)

    open fun method3522(i: Int) {
        anInt4484++
        if (i != -16252) method3531(false)
    }

    open fun method3523(i: Byte) {
        if (i.toInt() != 12) method3528(5)
        anInt4482++
    }

    open fun method3524(i: Int) {
        anInt4483++
    }

    abstract fun method3525(i: Int, bool: Boolean)

    abstract fun method3526(i: Int, i_0_: Int, i_1_: Int)

    abstract fun method3527(i: Int, renderable: Renderable?, i_2_: Int)

    open fun method3528(i: Int) {
        anInt4481++
    }

    abstract fun method3530(i: Int): Boolean

    open fun method3531(bool: Boolean) {
        anInt4480++
    }

    open fun method3532(i: Int) {
        if (i == 10425) anInt4485++
    }
}
