import WaterMaterialPass.Companion.method2152
import ConfigValueProvider.Companion.method2516

/* Class328_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object RenderQueueState : ShaderObject() {

    var aRenderConfigFactory_6519: RenderConfigFactory? = RenderConfigFactory()
    var anInt6520: Int = 0
    var anInt6521: Int = 0
    var anIntArray6522: IntArray? = IntArray(1000)
    var aFloat6523: Float = 0f

    fun method2615(i: Int, i_0_: Int) {
        anInt6521++
        val class348_sub42_sub15 = method2516(i_0_, 105.toByte(), 12)
        class348_sub42_sub15.method3251(-16058)
        if (i >= -59) RenderQueueState.method2617((-108).toByte())
    }

    fun method2616(i: Int) {
        anInt6520++
        if (i == 12) method2152(false)
    }

    @JvmStatic
    fun method2617(i: Byte) {
        anIntArray6522 = null
        val i_1_ = -3 / ((i - 3) / 54)
        aRenderConfigFactory_6519 = null
    }
}
