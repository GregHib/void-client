import AbstractProceduralTextureNodeStatics.method3036
import VorbisOggDecoderStatics.method2970
import RenderListTextureNodeStatics.method3152
import RenderListTextureNodeStatics.anInt9483
import RenderListTextureNodeStatics.anInt9484
import RenderListTextureNodeStatics.aTrigLookupTables_9485
import RenderListTextureNodeStatics.anInt9486
import RenderListTextureNodeStatics.anInt9487

/* Class348_Sub40_Sub39 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RenderListTextureNode : AbstractProceduralTextureNode(0, true) {
    private var aMinimapShapeDrawerArray9481: Array<MinimapShapeDrawer?>? = null
    private fun method3151(`is`: Array<IntArray?>?, i: Byte) {
        anInt9487++
        if (i.toInt() != -27) method3152(86)
        val i_0_: Int = DisplaceTextureNodeStatics.anInt9139
        val i_1_ = FixedFunctionMaterialPassStatics.anInt6212
        NpcAppearanceFlagsStatics.method224((-40).toByte(), `is`)
        MultiFieldRecordStatics.method3000(SimpleBinaryOptionStateStatics.anInt6076, 0, TextureCubeProviderStatics.anInt6325, 0, i.toInt() xor 0x28)
        if (aMinimapShapeDrawerArray9481 != null) {
            var i_2_ = 0
            while (aMinimapShapeDrawerArray9481!!.size > i_2_) {
                val class50 = aMinimapShapeDrawerArray9481!![i_2_]!!
                val i_3_ = class50.anInt864
                val i_4_ = class50.anInt865
                if (i_3_ < 0) {
                    if (i_4_ >= 0) class50.method457(i_1_, i_0_, -43)
                } else if (i_4_ < 0) class50.method456(i.toInt() xor 0x6a.inv(), i_0_, i_1_)
                else class50.method455(i_0_, i_1_, -124)
                i_2_++
            }
        }
    }

    override fun method3042(i: Int, i_5_: Int): IntArray? {
        anInt9486++
        val `is` = this.aSpriteSheetCache_7032!!.method1433(i_5_ + -255, i)
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) method3151(this.aSpriteSheetCache_7032!!.method1427(16.toByte()), (-27).toByte())
        return `is`
    }

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_6_: Int) {
        if (i_6_ != 31015) aTrigLookupTables_9485 = null
        if (i == 0) {
            aMinimapShapeDrawerArray9481 = arrayOfNulls<MinimapShapeDrawer>(class348_sub49.readUnsignedByte(255))
            var i_7_ = 0
            while_216_@ while (aMinimapShapeDrawerArray9481!!.size > i_7_) {
                val i_8_ = class348_sub49.readUnsignedByte(255)
                val i_9_ = i_8_
                while_214_@ do {
                    do {
                        if (i_9_ == 0) {
                            aMinimapShapeDrawerArray9481!![i_7_] = LoadProgressCountersStatics.method1374(107, class348_sub49)
                            i_7_++
                            continue@while_216_
                        } else if (i_9_ != 1) {
                            if (i_9_ != 2) {
                                if (i_9_ != 3) {
                                    i_7_++
                                    continue@while_216_
                                }
                            } else break
                            break@while_214_
                        }
                        aMinimapShapeDrawerArray9481!![i_7_] = (method2970(CameraSplineNodeStatics.method2955(i_6_, 31013), class348_sub49))
                        i_7_++
                        continue@while_216_
                    } while (false)
                    aMinimapShapeDrawerArray9481!![i_7_] = (method3036(class348_sub49, CameraSplineNodeStatics.method2955(i_6_, -31102)))
                    i_7_++
                    continue@while_216_
                } while (false)
                aMinimapShapeDrawerArray9481!![i_7_] = SplashImageLoadableStatics.method2022(class348_sub49, 0)
                i_7_++
            }
        } else if (i == 1) this.aBoolean7045 = class348_sub49.readUnsignedByte(255) == 1
        anInt9484++
    }

    override fun method3047(i: Int, i_10_: Int): Array<IntArray?>? {
        anInt9483++
        val `is` = this.aImageFrameCache_7033!!.method2557(i_10_ + 1564598923, i)
        if (i_10_ != -1564599039) aTrigLookupTables_9485 = null
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val i_11_: Int = DisplaceTextureNodeStatics.anInt9139
            val i_12_ = FixedFunctionMaterialPassStatics.anInt6212
            val is_13_: Array<IntArray> = Array<IntArray>(i_12_) { IntArray(i_11_) }
            val is_14_ = this.aImageFrameCache_7033!!.method2553(0)!!
            method3151(is_13_ as Array<IntArray?>?, (-27).toByte())
            var i_15_ = 0
            while (FixedFunctionMaterialPassStatics.anInt6212 > i_15_) {
                val is_16_ = is_13_[i_15_]
                val is_17_ = is_14_[i_15_]!!
                val is_18_ = is_17_[0]!!
                val is_19_ = is_17_[1]!!
                val is_20_ = is_17_[2]!!
                for (i_21_ in 0..<DisplaceTextureNodeStatics.anInt9139) {
                    val i_22_ = is_16_[i_21_]
                    is_20_[i_21_] = NpcSummaryDefinitionStatics.method1166(i_22_, 255) shl 4
                    is_19_[i_21_] = NpcSummaryDefinitionStatics.method1166(i_22_ shr 4, 4080)
                    is_18_[i_21_] = NpcSummaryDefinitionStatics.method1166(4080, i_22_ shr 12)
                }
                i_15_++
            }
        }
        return `is`
    }
}
