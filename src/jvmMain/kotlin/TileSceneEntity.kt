import CameraDistanceOptionStateStatics.method1725
import TileSceneEntityStatics.anInt8721
import TileSceneEntityStatics.anInt8722
import TileSceneEntityStatics.anInt8723
import TileSceneEntityStatics.aFontMetaRef_8724

/* Class318_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class TileSceneEntity internal constructor(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : SceneEntity() {
    @JvmField
    var aShort8727: Short
    override fun method2382(i: Byte): Boolean {
        if (i > -51) aFontMetaRef_8724 = null
        anInt8723++
        return IndexedSpriteStatics.method164(this.aByte6376.toInt(), (this.x shr Tooltip.anInt4459), (-97).toByte(), (this.y shr Tooltip.anInt4459))
    }

    override fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int {
        anInt8722++
        val i_0_ = 88 % ((i - -14) / 61)
        return this.method2390(class348_sub1s!!, (this.x shr Tooltip.anInt4459), -2, (this.y shr Tooltip.anInt4459))
    }

    init {
        this.aByte6376 = i_7_.toByte()
        this.x = i
        this.y = i_5_
        this.aShort8727 = i_8_.toShort()
        this.anInt6382 = i_4_
        this.plane = i_6_.toByte()
    }

    override fun method2378(i: Int): Boolean {
        if (i != 0) aFontMetaRef_8724 = null
        anInt8721++
        return (SpriteBlitter.aBooleanArrayArray1572!![(NpcActorEntityStatics.anInt10084 + -DisplayModeOptionStateStatics.anInt6111 + (this.x shr Tooltip.anInt4459))]!![((this.y shr Tooltip.anInt4459) + -GlIndexBufferArbStatics.anInt8502 + NpcActorEntityStatics.anInt10084)])
    }
}
