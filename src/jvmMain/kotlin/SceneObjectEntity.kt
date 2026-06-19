import SceneObjectEntityStatics.method2405
import SceneObjectEntityStatics.method2406
import SceneObjectEntityStatics.anInt8730
import SceneObjectEntityStatics.anInt8731
import SceneObjectEntityStatics.anInt8733
import SceneObjectEntityStatics.anInt8734
import SceneObjectEntityStatics.anInt8735
import SceneObjectEntityStatics.anInt8736
import SceneObjectEntityStatics.anInt8738

/* Class318_Sub1_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class SceneObjectEntity internal constructor(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) : SceneEntity() {
    override fun method2382(i: Byte): Boolean {
        if (i > -51) return false
        anInt8733++
        val class148 = RenderableGroupStatics.method1449(this.plane.toInt(), (this.x shr Tooltip.anInt4459), (this.y shr Tooltip.anInt4459))
        if (class148 == null || !class148.aClass318_Sub1_Sub3_2040!!.aBoolean8741) return IndexedSpriteStatics.method164(this.plane.toInt(), (this.x shr Tooltip.anInt4459), (-97).toByte(), (this.y shr Tooltip.anInt4459))
        return (MinimapSpriteRendererStatics.method1110(this.y shr Tooltip.anInt4459, class148.aClass318_Sub1_Sub3_2040!!.method2394(true) + this.method2394(true), this.plane.toInt(), (-79).toByte(), this.x shr Tooltip.anInt4459))
    }

    override fun method2378(i: Int): Boolean {
        if (i != 0) method2406(79)
        anInt8734++
        return (SpriteBlitter.aBooleanArrayArray1572!![(NpcActorEntityStatics.anInt10084 + -DisplayModeOptionStateStatics.anInt6111 + (this.x shr Tooltip.anInt4459))]!![(NpcActorEntityStatics.anInt10084 + (-GlIndexBufferArbStatics.anInt8502 + (this.y shr Tooltip.anInt4459)))])
    }

    override fun method2392(bool: Boolean) {
        if (bool != true) anInt8731 = 119
        anInt8730++
        throw IllegalStateException()
    }

    override fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int {
        anInt8735++
        val i_2_ = -79 % ((-14 - i) / 61)
        return this.method2390(class348_sub1s!!, (this.x shr Tooltip.anInt4459), -2, (this.y shr Tooltip.anInt4459))
    }

    override fun method2388(i: Int): Boolean {
        if (i > -65) anInt8731 = -84
        anInt8738++
        return false
    }

    override fun method2380(var_renderer: Renderer?, i: Int, bool: Boolean, class318_sub1: SceneEntity?, i_3_: Int, i_4_: Byte, i_5_: Int) {
        try {
            if (i_4_ > -106) method2405(-8)
            anInt8736++
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("fha.N(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'))
        }
    }

    init {
        this.x = i
        this.plane = i_8_.toByte()
        this.anInt6382 = i_6_
        this.aByte6376 = i_9_.toByte()
        this.y = i_7_
    }
}
