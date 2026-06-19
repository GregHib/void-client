import RangedGraphicsOptionStateStatics.method1762
import DirectionPathStatics.anInt1056
import DirectionPathStatics.anInt1060
import DirectionPathStatics.anInt1063
import DirectionPathStatics.anInt1065

/* Class58 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class DirectionPath {
    private var aLong1057: Long = 0
    private var anInt1058 = 0
    private fun method533(spriteMaskShape: SpriteMaskShape, i: Int) {
        aLong1057 = aLong1057 or (spriteMaskShape.anInt4070 shl anInt1058++ * SpriteMaskShapeStatics.anInt4081).toLong()
        anInt1063++
        val i_5_ = 0 % ((28 - i) / 59)
    }

    private fun method534(i: Byte, i_6_: Int): Int {
        anInt1065++
        if (i.toInt() != 0) return -115
        return (aLong1057 shr SpriteMaskShapeStatics.anInt4081 * i_6_).toInt() and 0xf
    }

    internal constructor(spriteMaskShape: SpriteMaskShape) {
        aLong1057 = spriteMaskShape.anInt4070.toLong()
        anInt1058 = 1
    }

    internal constructor(spriteMaskShapes: Array<SpriteMaskShape?>) {
        for (i in spriteMaskShapes.indices) method533(spriteMaskShapes[i]!!, 92)
    }

    fun method537(i: Int, i_27_: Int): SpriteMaskShape? {
        anInt1060++
        val i_28_ = 4 % ((-35 - i_27_) / 53)
        return SpriteMaskShapeStatics.method2598(method534(0.toByte(), i), -109)
    }

    fun method538(i: Byte): Int {
        anInt1056++
        if (i >= -114) method538(105.toByte())
        return anInt1058
    }
}
