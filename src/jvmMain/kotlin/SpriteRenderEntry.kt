import ProjectileDefinition.method2288
import SoundBankPatchStatics.method2929
import VorbisOggDecoderStatics.method2972
import SpriteRenderEntryStatics.anInt9708

/* Class348_Sub42_Sub20 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteRenderEntry internal constructor(widgetRedrawRegion: WidgetRedrawRegion?, class318_sub10: SceneGraphContainer?) : HashLinkedListNode() {
    var aWidgetRedrawRegion_9702: WidgetRedrawRegion? = null
    var aSpotAnimVector_9704: SpotAnimVector? = null
    var anInt9705: Int = 0
    var anInt9706: Int = 0
    var anInt9707: Int = 0
    var anInt9710: Int = 0
    var anInt9712: Int = 0
    fun method3279(i: Int) {
        this.anInt9706 = (this.aWidgetRedrawRegion_9702!!.anInt4239)
        anInt9708++
        this.anInt9710 = (this.aWidgetRedrawRegion_9702!!.anInt4240)
        this.anInt9712 = (this.aWidgetRedrawRegion_9702!!.anInt4238)
        if ((this.aWidgetRedrawRegion_9702!!.aAbstractCameraTransform_4252) != null) this.aWidgetRedrawRegion_9702!!.aAbstractCameraTransform_4252!!.method905((this.aSpotAnimVector_9704!!.anInt2291), (this.aSpotAnimVector_9704!!.anInt2290), (this.aSpotAnimVector_9704!!.anInt2294), FacingDirectionNodeStatics.anIntArray6666!!)
        this.anInt9705 = FacingDirectionNodeStatics.anIntArray6666!![0]
        this.anInt9707 = FacingDirectionNodeStatics.anIntArray6666!![i]
    }

    init {
        try {
            this.aWidgetRedrawRegion_9702 = widgetRedrawRegion
            this.aSpotAnimVector_9704 = this.aWidgetRedrawRegion_9702!!.method2685((-13).toByte())
            method3279(2)
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("jo.<init>(" + (if (widgetRedrawRegion != null) "{...}" else "null") + ',' + (if (class318_sub10 != null) "{...}" else "null") + ')'))
        }
    }
}
