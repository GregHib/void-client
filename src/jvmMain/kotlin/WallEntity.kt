import WallEntityStatics.method2486
import WallEntityStatics.anInt8767
import WallEntityStatics.anInt8768
import WallEntityStatics.anInt8771
import WallEntityStatics.anInt8772
import WallEntityStatics.anInt8774
import WallEntityStatics.anInt8779

/* Class318_Sub1_Sub5 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class WallEntity internal constructor(i: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int) : SceneEntity() {
    @JvmField
    var aShort8769: Short
    @JvmField
    var aShort8781: Short

    override fun method2378(i: Int): Boolean {
        if (i != 0) method2378(29)
        anInt8767++
        return (SpriteBlitter.aBooleanArrayArray1572!![(-DisplayModeOptionStateStatics.anInt6111 + ((this.x shr Tooltip.anInt4459) - -NpcActorEntityStatics.anInt10084))]!![(NpcActorEntityStatics.anInt10084 + (-GlIndexBufferArbStatics.anInt8502 + (this.y shr Tooltip.anInt4459)))])
    }

    override fun method2382(i: Byte): Boolean {
        anInt8774++
        if (i >= -51) method2486(-102, 81, -103, -31, -95, -90)
        return MinimapSpriteRendererStatics.method1110((this.y shr Tooltip.anInt4459), this.method2394(true), this.aByte6376.toInt(), (-79).toByte(), (this.x shr Tooltip.anInt4459))
    }

    override fun method2380(var_renderer: Renderer?, i: Int, bool: Boolean, class318_sub1: SceneEntity?, i_2_: Int, i_3_: Byte, i_4_: Int) {
        try {
            anInt8768++
            if (i_3_ >= -106) method2384(null, 52)
            throw IllegalStateException()
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("un.N(" + (if (var_renderer != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (class318_sub1 != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ')'))
        }
    }

    override fun method2388(i: Int): Boolean {
        if (i >= -65) return false
        anInt8772++
        return false
    }

    override fun method2392(bool: Boolean) {
        if (bool == true) {
            anInt8779++
            throw IllegalStateException()
        }
    }

    override fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int {
        anInt8771++
        val i_10_ = 122 % ((-14 - i) / 61)
        return this.method2390(class348_sub1s!!, (this.x shr Tooltip.anInt4459), -2, (this.y shr Tooltip.anInt4459))
    }

    init {
        this.aShort8769 = i_16_.toShort()
        this.aByte6376 = i_14_.toByte()
        this.anInt6382 = i_11_
        this.x = i
        this.aShort8781 = i_15_.toShort()
        this.y = i_12_
        this.plane = i_13_.toByte()
    }
}
