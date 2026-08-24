import ConfigFlagUtil.Companion.method1913
import ConfigFlagUtil.Companion.method1916
import RSFont.Companion.method2570
import RegionTileNode.Companion.method2772
import ChatCommandProcessor.method703
import ParticleDetailOptionState.Companion.method1796
import SpriteComponent.Companion.method202

/* Class338 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapTileShape internal constructor(i: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
    var aByte4181: Byte
    var aShort4182: Short

    var aShortArray4183: ShortArray?

    var anIntArray4184: IntArray = IntArray(4)
    var aShort4185: Short

    var anIntArray4187: IntArray?

    var aShortArray4188: ShortArray?
    var aShort4190: Short

    var anIntArray4191: IntArray = IntArray(4)
    var aByte4192: Byte
    var aShort4193: Short

    var aShortArray4194: ShortArray?

    init {
        this.aByte4192 = i.toByte()
        this.aByte4181 = i_15_.toByte()
        this.anIntArray4187 = IntArray(4)
        this.anIntArray4187!![0] = i_16_
        this.anIntArray4187!![1] = i_17_
        this.anIntArray4187!![3] = i_19_
        this.anIntArray4187!![2] = i_18_
        this.anIntArray4191[0] = i_20_
        this.anIntArray4191[2] = i_22_
        this.anIntArray4191[3] = i_23_
        this.anIntArray4191[1] = i_21_
        this.anIntArray4184[1] = i_25_
        this.aShort4185 = (i_16_ shr ActorEntity.anInt4459).toShort()
        this.anIntArray4184[3] = i_27_
        this.anIntArray4184[0] = i_24_
        this.anIntArray4184[2] = i_26_
        this.aShort4182 = (i_18_ shr ActorEntity.anInt4459).toShort()
        this.aShort4193 = (i_24_ shr ActorEntity.anInt4459).toShort()
        this.aShort4190 = (i_26_ shr ActorEntity.anInt4459).toShort()
        this.aShortArray4188 = ShortArray(4)
        this.aShortArray4183 = ShortArray(4)
        this.aShortArray4194 = ShortArray(4)
    }

    companion object {

        var anInt4186: Int = 0
        var anInt4189: Int = 0
        var anInt4195: Int = 0
        var anIntArray4196: IntArray? = IntArray(5)
        var aClass237_Sub1_4197: WorldMapSceneSoftware? = null

        fun method2661(i: Int, i_0_: Int, i_1_: Int, bool: Boolean, i_2_: Int): RegionSceneShifter {
            if (i_2_ != 2) method2661(31, -43, 32, true, -110)
            anInt4189++
            val class348_sub41 = RegionSceneShifter()
            class348_sub41.anInt7050 = i
            class348_sub41.anInt7053 = i_1_
            MinimapSpriteRenderer.aHashtable_4915!!.method3483(109.toByte(), i_0_.toLong(), class348_sub41)
            method2772(i, 110.toByte())
            val class46 = method2570(i_2_ + 1512932718, i_0_)
            if (class46 != null) method1916(-9343, class46)
            if (SpriteRenderable.aWidgetComponent_4730 != null) {
                method1916(-9343, SpriteRenderable.aWidgetComponent_4730!!)
                SpriteRenderable.aWidgetComponent_4730 = null
            }
            method3270(120.toByte())
            if (class46 != null) method1913(!bool, i_2_ + -104, class46)
            if (!bool) method703(i)
            if (!bool && RenderNodeStatics.anInt9721 != -1) BloomGraphicsOptionState.method1775((-8).toByte(), RenderNodeStatics.anInt9721, 1)
            return class348_sub41
        }

        @JvmStatic
        fun method2662(i: Int) {
            aClass237_Sub1_4197 = null
            anIntArray4196 = null
            if (i != 4) method2663(91, -57, -85, 14, 6)
        }

        fun method2663(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            anInt4195++
            if (WhirlpoolHash.anInt7207 == 1) {
                var i_7_ = i_3_ / WhirlpoolHash.anInt1067
                var i_8_ = i_4_ / WhirlpoolHash.anInt1067
                var i_9_ = i_5_ / WhirlpoolHash.anInt4267
                var i_10_ = i_6_ / WhirlpoolHash.anInt4267
                if (i_7_ < WhirlpoolHash.anInt425 && i_8_ >= 0 && WhirlpoolHash.anInt3225 > i_9_ && i_10_ >= 0 && i == -5590) {
                    if (i_8_ >= WhirlpoolHash.anInt425) i_8_ = -1 + WhirlpoolHash.anInt425
                    if (i_9_ < 0) i_9_ = 0
                    if (i_10_ >= WhirlpoolHash.anInt3225) i_10_ = WhirlpoolHash.anInt3225 + -1
                    if (i_7_ < 0) i_7_ = 0
                    for (i_11_ in i_9_..i_10_) {
                        val i_12_ = (ModelDefinition.method3452(i_11_ + MaterialPass.anInt3682, (-15).toByte(), WhirlpoolHash.anInt3225) * WhirlpoolHash.anInt425)
                        var i_13_ = i_7_
                        while (i_8_ >= i_13_) {
                            val i_14_ = (i_12_ + ModelDefinition.method3452((SceneryDetailOptionState.anInt6095 + i_13_), (-15).toByte(), WhirlpoolHash.anInt425))
                            LocalPlayerState.anIntArray1909!![i_14_] = GroundDecorSceneEntity.anInt9997
                            i_13_++
                        }
                    }
                }
            }
        }
        var anInt9680: Int = 0

        fun method3270(i: Byte) {
            var class348_sub42_sub12 = (SourceRowTextureNode.aNodeDeque_9111!!.method1995(4) as ContactEntry?)
            while (class348_sub42_sub12 != null) {
                if (method1796(69, class348_sub42_sub12.anInt9608)) method202(6, class348_sub42_sub12)
                class348_sub42_sub12 = SourceRowTextureNode.aNodeDeque_9111!!.method1990(115.toByte()) as ContactEntry?
            }
            anInt9680++
        }
    }
}
