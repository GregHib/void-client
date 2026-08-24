import kotlin.jvm.JvmStatic
import DirectionPath.Companion.method536
import CompositeRgbNoiseTexture.Companion.method574
import NpcType.Companion.method802

/* Class218 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapSceneIconDef {
    var aTextureDefinitionLoader_2851: TextureDefinitionLoader? = null

    var anInt2853: Int = 0

    var aBoolean2854: Boolean = false

    var anInt2856: Int = 0
    fun method1593(i: Int): Boolean {
        if (i != 106) this.aTextureDefinitionLoader_2851 = null
        anInt2858++
        return this.aTextureDefinitionLoader_2851!!.aJs5Archive_1965!!.method421(false, this.anInt2853)
    }

    private fun method1595(i: Byte, i_17_: Int, class348_sub49: ByteBuffer) {
        anInt2852++
        if (i >= 5) {
            if (i_17_ == 1) this.anInt2853 = class348_sub49.readUnsignedShort(842397944)
            else if (i_17_ != 2) {
                if (i_17_ == 3) this.aBoolean2854 = true
                else if (i_17_ == 4) this.anInt2853 = -1
            } else this.anInt2856 = class348_sub49.readMedium(-1)
        }
    }

    fun method1596(i: Int, bool: Boolean, i_18_: Int, var_renderer: Renderer): AbstractModelRenderer? {
        anInt2857++
        if (i_18_ < 51) InboundPacketHeader.aInboundPacketHeader_2860 = null
        val l = (var_renderer.anInt4567 shl 19 or (this.anInt2853 or (i shl 16) or (if (!bool) 0 else 262144))).toLong()
        var abstractModelRenderer = this.aTextureDefinitionLoader_2851!!.aLruByteCache_1976.method583(l, -87) as AbstractModelRenderer?
        if (abstractModelRenderer != null) return abstractModelRenderer
        if (!this.aTextureDefinitionLoader_2851!!.aJs5Archive_1965!!.method421(false, this.anInt2853)) return null
        val spriteImage = SpriteImage.method1521(this.aTextureDefinitionLoader_2851!!.aJs5Archive_1965!!, this.anInt2853, 0)
        if (spriteImage != null) {
            spriteImage.anInt2700 = 0
            spriteImage.anInt2698 = spriteImage.anInt2700
            spriteImage.anInt2703 = spriteImage.anInt2698
            spriteImage.anInt2701 = spriteImage.anInt2703
            if (bool) spriteImage.method1514()
            for (i_19_ in 0..<i) spriteImage.method1520()
        }
        abstractModelRenderer = var_renderer.method3691(spriteImage, true)
        if (abstractModelRenderer != null) this.aTextureDefinitionLoader_2851!!.aLruByteCache_1976.method582(abstractModelRenderer, l, (-101).toByte())
        return abstractModelRenderer
    }

    fun method1597(i: Byte, class348_sub49: ByteBuffer) {
        anInt2850++
        while (true) {
            val i_20_ = class348_sub49.readUnsignedByte(255)
            if (i_20_ == 0) break
            method1595(61.toByte(), i_20_, class348_sub49)
        }
        if (i.toInt() != -114) aNodeDeque_2859 = null
    }

    companion object {
        var anInt2849: Int = 0
        var anInt2850: Int = 0
        var anInt2852: Int = 0
        var anInt2855: Int = 0
        var anInt2857: Int = 0
        var anInt2858: Int = 0

        var aNodeDeque_2859: NodeDeque? = NodeDeque()

        var anInt2861: Int = 1401

        fun method1591(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int) {
            anInt2855++
            if (i >= 1 && i_5_ >= 1 && -2 + GlCubemapLightPass.anInt7319 >= i && i_5_ <= -2 + RangeThresholdTextureNode.anInt9109) {
                var i_8_ = i_7_
                if (i_8_ < 3 && method802(i_5_, i, true)) i_8_++
                if ((IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 0 && !method536(i_5_, false, i, ParticleSystemState.anInt2204, i_8_)) || HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029 == null) return
                MapTileShape.aClass237_Sub1_4197!!.method1694((TimedRecordAccessor.aCollisionMapArray7108s!![i_7_]), i_1_, i_7_, FacingDirectionNode.aRenderer6654, i, i_5_, 106.toByte())
                if (i_3_ >= 0) {
                    val i_9_ = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1737(-32350)
                    IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub4_7220), 1)
                    MapTileShape.aClass237_Sub1_4197!!.method1689(i, i_7_, i_3_, FacingDirectionNode.aRenderer6654, i_8_, 50, i_4_, i_5_, i_2_, i_6_, (TimedRecordAccessor.aCollisionMapArray7108s!![i_7_]))
                    IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub4_7220), i_9_)
                }
            }
            if (i_0_ < 12) aNodeDeque_2859 = null
        }

        fun method1592(i: Byte, i_10_: Int, i_11_: Int, i_12_: Int, player: Player) {
            anInt2849++
            val i_13_ = (player.anIntArray10320!![0])
            val i_14_ = (player.anIntArray10317!![0])
            if (i_13_ >= 0 && GlCubemapLightPass.anInt7319 > i_13_ && i_14_ >= 0 && i_14_ < RangeThresholdTextureNode.anInt9109 && (i_12_ >= 0 && i_12_ < GlCubemapLightPass.anInt7319 && i_10_ >= 0 && RangeThresholdTextureNode.anInt9109 > i_10_)) {
                val i_15_ = (method574(i_12_, player.method2436(62.toByte()), 0, RadialGradientMaskEffect.anIntArray9185, true, 120.toByte(), -4, i_13_, i_14_, InterfaceComponentGroup.anIntArray9626, i_10_, (TimedRecordAccessor.aCollisionMapArray7108s!![(player.plane).toInt()]), 0, 0, 0))
                if (i_15_ >= 1) {
                    if (i_11_ != 4) aNodeDeque_2859 = null
                    if (i_15_ <= 3) {
                        for (i_16_ in 0..<-1 + i_15_) player.method2451(i, InterfaceComponentGroup.anIntArray9626!![i_16_], i_11_ + -29038, RadialGradientMaskEffect.anIntArray9185!![i_16_])
                    }
                }
            }
        }

        @JvmStatic
        fun method1594(i: Int) {
            aNodeDeque_2859 = null
            if (i != -1966608624) aNodeDeque_2859 = null
        }
    }
}
