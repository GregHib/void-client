import ParticleTileShapeStatics.method2732
import BrightnessTextureNodeStatics.method3085
import BrightnessTextureNodeStatics.anInt9217
import BrightnessTextureNodeStatics.anInt9221

/* Class348_Sub40_Sub15 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BrightnessTextureNode internal constructor(i: Int) : AbstractProceduralTextureNode(0, true) {
    private var anInt9220 = 4096
    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_0_: Int) {
        val i_1_ = i
        if (i_1_ == 0) anInt9220 = (class348_sub49.readUnsignedByte(255) shl 12) / 255
        if (i_0_ == 31015) anInt9217++
    }

    init {
        anInt9220 = i
    }

    override fun method3042(i: Int, i_8_: Int): IntArray? {
        anInt9221++
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) ArrayCopyUtil.method1579(`is`, 0, DisplaceTextureNodeStatics.anInt9139, anInt9220)
        if (i_8_ != 255) method3085(63)
        return `is`
    }

    constructor() : this(4096)
}
