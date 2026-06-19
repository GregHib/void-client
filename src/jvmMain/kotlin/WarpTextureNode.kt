import kotlin.math.atan2
import WarpTextureNodeStatics.anInt9425
import WarpTextureNodeStatics.aWidgetComponentArrayArray9427
import WarpTextureNodeStatics.anInt9428
import WarpTextureNodeStatics.anInt9429
import WarpTextureNodeStatics.anInt9430

/* Class348_Sub40_Sub33 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WarpTextureNode : AbstractProceduralTextureNode(1, false) {
    override fun method3047(i: Int, i_2_: Int): Array<IntArray?>? {
        anInt9429++
        val `is` = this.aImageFrameCache_7033!!.method2557(-97, i)!!
        if (i_2_ != -1564599039) aWidgetComponentArrayArray9427 = null
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_3_ = `is`[0]!!
            val is_4_ = `is`[1]!!
            val is_5_ = `is`[2]!!
            var i_6_ = 0
            while ((DisplaceTextureNodeStatics.anInt9139 > i_6_)) {
                method3139(i_6_, i, (-31).toByte())
                val is_7_ = this.method3039(43.toByte(), ByteStoreStatics.anInt4265, 0)!!
                is_3_[i_6_] = is_7_[0]!![MinimapFlagRenderer.anInt1796]
                is_4_[i_6_] = is_7_[1]!![MinimapFlagRenderer.anInt1796]
                is_5_[i_6_] = is_7_[2]!![MinimapFlagRenderer.anInt1796]
                i_6_++
            }
        }
        return `is`
    }

    override fun method3042(i: Int, i_8_: Int): IntArray {
        anInt9428++
        if (i_8_ != 255) aWidgetComponentArrayArray9427 = null
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) {
            var i_9_ = 0
            while ((i_9_ < DisplaceTextureNodeStatics.anInt9139)) {
                method3139(i_9_, i, (-31).toByte())
                val is_10_ = this.method3048(ByteStoreStatics.anInt4265, i_8_ xor 0x25c5979e, 0)!!
                `is`[i_9_] = is_10_[MinimapFlagRenderer.anInt1796]
                i_9_++
            }
        }
        return `is`
    }

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_11_: Int) {
        if (i_11_ != 31015) aWidgetComponentArrayArray9427 = null
        anInt9430++
        if (i == 0) this.aBoolean7045 = class348_sub49.readUnsignedByte(255) == 1
    }

    private fun method3139(i: Int, i_12_: Int, i_13_: Byte) {
        anInt9425++
        val i_14_ = SceneEffectMarkerStatics.anIntArray6432!![i]
        val i_15_ = LightDetailOptionStateStatics.anIntArray6035!![i_12_]
        if (i_13_.toInt() != -31) method3139(-44, -111, 48.toByte())
        val f = atan2((i_14_ + -2048).toDouble(), (i_15_ + -2048).toDouble()).toFloat()
        if (f.toDouble() >= -3.141592653589793 && f.toDouble() <= -2.356194490192345) {
            ByteStoreStatics.anInt4265 = i_12_
            MinimapFlagRenderer.anInt1796 = i
        } else if (!(f.toDouble() <= -1.5707963267948966) || !(f.toDouble() >= -2.356194490192345)) {
            if (!(f.toDouble() <= -0.7853981633974483) || !(f.toDouble() >= -1.5707963267948966)) {
                if (!(f <= 0.0f) || !(f.toDouble() >= -0.7853981633974483)) {
                    if (!(f >= 0.0f) || !(f.toDouble() <= 0.7853981633974483)) {
                        if (!(f.toDouble() >= 0.7853981633974483) || !(f.toDouble() <= 1.5707963267948966)) {
                            if (f.toDouble() >= 1.5707963267948966 && f.toDouble() <= 2.356194490192345) {
                                ByteStoreStatics.anInt4265 = FixedFunctionMaterialPassStatics.anInt6212 + -i
                                MinimapFlagRenderer.anInt1796 = i_12_
                            } else if (f.toDouble() >= 2.356194490192345 && f.toDouble() <= 3.141592653589793) {
                                ByteStoreStatics.anInt4265 = i_12_
                                MinimapFlagRenderer.anInt1796 = -i + DisplaceTextureNodeStatics.anInt9139
                            }
                        } else {
                            MinimapFlagRenderer.anInt1796 = -i_12_ + DisplaceTextureNodeStatics.anInt9139
                            ByteStoreStatics.anInt4265 = -i + FixedFunctionMaterialPassStatics.anInt6212
                        }
                    } else {
                        MinimapFlagRenderer.anInt1796 = -i + DisplaceTextureNodeStatics.anInt9139
                        ByteStoreStatics.anInt4265 = -i_12_ + FixedFunctionMaterialPassStatics.anInt6212
                    }
                } else {
                    MinimapFlagRenderer.anInt1796 = i
                    ByteStoreStatics.anInt4265 = FixedFunctionMaterialPassStatics.anInt6212 - i_12_
                }
            } else {
                MinimapFlagRenderer.anInt1796 = DisplaceTextureNodeStatics.anInt9139 - i_12_
                ByteStoreStatics.anInt4265 = i
            }
        } else {
            ByteStoreStatics.anInt4265 = i
            MinimapFlagRenderer.anInt1796 = i_12_
        }
        ByteStoreStatics.anInt4265 = ByteStoreStatics.anInt4265 and TextureCubeProviderStatics.anInt6325
        MinimapFlagRenderer.anInt1796 = MinimapFlagRenderer.anInt1796 and SimpleBinaryOptionStateStatics.anInt6076
    }
}
