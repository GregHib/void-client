import WaterDetailOptionStateStatics.method1781
import ArchiveResourceProviderStatics.method2348
import InputStream_Sub1Statics.method125
import java.math.BigInteger
import ActorEntityStatics.anInt8757
import ActorEntityStatics.anInt8758
import ActorEntityStatics.anInt8760

abstract class ActorEntity internal constructor(i: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int) : SceneEntity() {
    var aShort8759: Short
    override fun method2384(class348_sub1s: Array<AbstractTileShape?>?, i: Int): Int {
        anInt8758++
        val i_0_ = this.x shr Tooltip.anInt4459
        val i_1_ = this.y shr Tooltip.anInt4459
        val i_2_ = -103 / ((i - -14) / 61)
        var i_3_ = 0
        if (DisplayModeOptionStateStatics.anInt6111 == i_0_) i_3_++
        else if (DisplayModeOptionStateStatics.anInt6111 < i_0_) i_3_ += 2
        if (i_1_ == GlIndexBufferArbStatics.anInt8502) i_3_ += 3
        else if (i_1_ < GlIndexBufferArbStatics.anInt8502) i_3_ += 6
        val i_4_ = PositionedSceneNodeStatics.anIntArray8797!![i_3_]
        if ((this.aShort8759.toInt() and i_4_) != 0) return this.method2390(class348_sub1s!!, i_0_, -2, i_1_)
        if (this.aShort8759.toInt() == 1 && i_0_ > 0) return this.method2390(class348_sub1s!!, -1 + i_0_, -2, i_1_)
        if (this.aShort8759.toInt() == 4 && i_0_ <= SpotAnimEntityStatics.anInt6451) return this.method2390(class348_sub1s!!, 1 + i_0_, -2, i_1_)
        if (this.aShort8759.toInt() == 8 && i_1_ > 0) return this.method2390(class348_sub1s!!, i_0_, -2, -1 + i_1_)
        if (this.aShort8759.toInt() == 2 && i_1_ <= RegionSceneShifterStatics.anInt7054) return this.method2390(class348_sub1s!!, i_0_, -2, i_1_ + 1)
        if (this.aShort8759.toInt() == 16 && i_0_ > 0 && i_1_ <= RegionSceneShifterStatics.anInt7054) return this.method2390(class348_sub1s!!, -1 + i_0_, -2, i_1_ + 1)
        if (this.aShort8759.toInt() == 32 && SpotAnimEntityStatics.anInt6451 >= i_0_ && RegionSceneShifterStatics.anInt7054 >= i_1_) return this.method2390(class348_sub1s!!, i_0_ + 1, -2, i_1_ + 1)
        if (this.aShort8759.toInt() == 128 && i_0_ > 0 && i_1_ > 0) return this.method2390(class348_sub1s!!, i_0_ - 1, -2, i_1_ - 1)
        if (this.aShort8759.toInt() == 64 && i_0_ <= SpotAnimEntityStatics.anInt6451 && i_1_ > 0) return this.method2390(class348_sub1s!!, 1 + i_0_, -2, -1 + i_1_)
        throw RuntimeException("")
    }

    override fun method2382(i: Byte): Boolean {
        if (i >= -51) return false
        anInt8760++
        return method125((this.y shr Tooltip.anInt4459), (this.x shr Tooltip.anInt4459), this.aByte6376.toInt(), this, 120.toByte())
    }

    init {
        this.x = i
        this.anInt6382 = i_11_
        this.aByte6376 = i_14_.toByte()
        this.y = i_12_
        this.plane = i_13_.toByte()
        this.aShort8759 = i_15_.toShort()
    }

    override fun method2378(i: Int): Boolean {
        anInt8757++
        if (i != 0) method2378(-104)
        return (SpriteBlitter.aBooleanArrayArray1572!![(-DisplayModeOptionStateStatics.anInt6111 + (this.x shr Tooltip.anInt4459) + NpcActorEntityStatics.anInt10084)]!![(NpcActorEntityStatics.anInt10084 + -GlIndexBufferArbStatics.anInt8502 + (this.y shr Tooltip.anInt4459))])
    }
}
