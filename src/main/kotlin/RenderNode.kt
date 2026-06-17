import kotlin.concurrent.Volatile

/* r - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class RenderNode : HashLinkedListNode() {
    companion object {
        @JvmField
        var aWidgetRedrawTracker_9716: WidgetRedrawTracker? = WidgetRedrawTracker()
        @JvmField
        var anInt9717: Int = 0
        @JvmField
        var aBooleanArray9718: BooleanArray? = null
        @JvmField
        var aBoolean9719: Boolean = true
        @JvmField
        var aAbstractCameraTransform_9720: AbstractCameraTransform? = null
        @JvmField
        @Volatile
        var anInt9721: Int = -1
        @JvmField
        var aBoolean9722: Boolean = false
        @JvmField
        var anIntArrayArray9723: Array<IntArray?>?
        @JvmField
        var anIntArray9724: IntArray? = null

        @JvmStatic
        fun method3284(bool: Boolean, d: Double) {
            Class44.aAbstractCameraTransform_624!!.method898(Class51.aAbstractCameraTransform_905)
            anInt9717++
            if (bool != true) method3285(10)
            Class44.aAbstractCameraTransform_624!!.method891(0, 0, d.toInt())
            CameraRotationStub.aRenderer326!!.method3638(Class44.aAbstractCameraTransform_624)
        }

        @JvmStatic
        fun method3285(i: Int) {
            val i_0_ = -61 % ((i - -73) / 32)
            aAbstractCameraTransform_9720 = null
            anIntArray9724 = null
            aBooleanArray9718 = null
            aWidgetRedrawTracker_9716 = null
            anIntArrayArray9723 = null
        }

        init {
            anIntArrayArray9723 = Array<IntArray?>(128) { IntArray(128) }
        }
    }
}
