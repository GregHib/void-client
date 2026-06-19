import GlVertexBufferBaseStatics.method1151
import WaterMaterialPassStatics.method2148
import GlslMaterialPassStatics.method2157
import CubemapTextureGlSourceStatics.method2263
import WorldMapAreaLabelStatics.method3570
import NoiseTextureGeneratorStatics.method544
import FireParticleStreamStatics.method132
import kotlin.math.max
import kotlin.math.min
import FlipTextureNodeStatics.method3065
import FlipTextureNodeStatics.anInt9141
import FlipTextureNodeStatics.anInt9143
import FlipTextureNodeStatics.aClass348_Sub42_Sub12_9144
import FlipTextureNodeStatics.anInt9146

/* Class348_Sub40_Sub7 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FlipTextureNode : AbstractProceduralTextureNode(1, false) {
    private var aBoolean9140 = true
    private var aBoolean9147 = true

    override fun method3047(i: Int, i_0_: Int): Array<IntArray?>? {
        anInt9141++
        val `is` = this.aImageFrameCache_7033!!.method2557(-119, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_1_ = this.method3039(120.toByte(), (if (aBoolean9147) -i + TextureCubeProviderStatics.anInt6325 else i), 0)!!
            val is_2_ = is_1_[0]!!
            val is_3_ = is_1_[1]!!
            val is_4_ = is_1_[2]!!
            val is_5_ = `is`[0]!!
            val is_6_ = `is`[1]!!
            val is_7_ = `is`[2]!!
            if (aBoolean9140) {
                for (i_8_ in 0..<DisplaceTextureNodeStatics.anInt9139) {
                    is_5_[i_8_] = is_2_[SimpleBinaryOptionStateStatics.anInt6076 + -i_8_]
                    is_6_[i_8_] = is_3_[SimpleBinaryOptionStateStatics.anInt6076 - i_8_]
                    is_7_[i_8_] = is_4_[-i_8_ + SimpleBinaryOptionStateStatics.anInt6076]
                }
            } else {
                var i_9_ = 0
                while ((i_9_ < DisplaceTextureNodeStatics.anInt9139)) {
                    is_5_[i_9_] = is_2_[i_9_]
                    is_6_[i_9_] = is_3_[i_9_]
                    is_7_[i_9_] = is_4_[i_9_]
                    i_9_++
                }
            }
        }
        if (i_0_ != -1564599039) method3065(-40, true, 93)
        return `is`
    }

    override fun method3049(class348_sub49: ByteBuffer, i: Int, i_72_: Int) {
        while_146_@ do {
            try {
                anInt9146++
                if (i_72_ == 31015) {
                    val i_73_ = i
                    do {
                        if (i_73_ == 0) {
                            aBoolean9140 = class348_sub49!!.readUnsignedByte(255) == 1
                            return
                        } else if (i_73_ != 1) {
                            if (i_73_ == 2) break
                            break@while_146_
                        }
                        aBoolean9147 = class348_sub49!!.readUnsignedByte(255) == 1
                        return
                    } while (false)
                    this.aBoolean7045 = class348_sub49!!.readUnsignedByte(255) == 1
                    break
                }
                break
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("jia.F(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + i_72_ + ')'))
            }
        } while (false)
    }

    override fun method3042(i: Int, i_75_: Int): IntArray {
        anInt9143++
        if (i_75_ != 255) aClass348_Sub42_Sub12_9144 = null
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) {
            val is_76_ = this.method3048((if (aBoolean9147) TextureCubeProviderStatics.anInt6325 - i else i), i_75_ + 633706082, 0)!!
            if (aBoolean9140) {
                var i_77_ = 0
                while ((i_77_ < DisplaceTextureNodeStatics.anInt9139)) {
                    `is`[i_77_] = is_76_[SimpleBinaryOptionStateStatics.anInt6076 + -i_77_]
                    i_77_++
                }
            } else ArrayCopyUtil.method1578(is_76_, 0, `is`, 0, DisplaceTextureNodeStatics.anInt9139)
        }
        return `is`
    }
}
