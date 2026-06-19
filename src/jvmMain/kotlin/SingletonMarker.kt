import SingletonMarkerStatics.anInt2599
import SingletonMarkerStatics.anInt2600

/* Class196 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SingletonMarker {
    fun method1450(i: Int): Boolean {
        anInt2600++
        if (i >= -1) return true
        return (this == HintIconState.aSingletonMarker_2372) or (WidgetComponentStatics.aSingletonMarker_838 == this)
    }

    override fun toString(): String {
        anInt2599++
        throw IllegalStateException()
    }
}
