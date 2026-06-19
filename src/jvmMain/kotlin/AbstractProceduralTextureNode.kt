import FlickeringEffectsOptionStateStatics.method1750
import ProjectedGroundDecorStatics.method2420
import NullRenderPassStatics.method3535
import AbstractProceduralTextureNodeStatics.method3038
import AbstractProceduralTextureNodeStatics.anInt7027
import AbstractProceduralTextureNodeStatics.anInt7028
import AbstractProceduralTextureNodeStatics.anInt7029
import AbstractProceduralTextureNodeStatics.anInt7034
import AbstractProceduralTextureNodeStatics.anInt7035
import AbstractProceduralTextureNodeStatics.anInt7037
import AbstractProceduralTextureNodeStatics.anInt7038
import AbstractProceduralTextureNodeStatics.anInt7039
import AbstractProceduralTextureNodeStatics.anInt7040
import AbstractProceduralTextureNodeStatics.anInt7043

/* Class348_Sub40 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class AbstractProceduralTextureNode internal constructor(i: Int, @JvmField var aBoolean7045: Boolean) : LinkedListNode() {
    @JvmField
    var aClass348_Sub40Array7031: Array<AbstractProceduralTextureNode?>
    var aSpriteSheetCache_7032: SpriteSheetCache? = null
    var aImageFrameCache_7033: ImageFrameCache? = null
    @JvmField
    var anInt7036: Int = 0

    open fun method3037(i: Int): Int {
        if (i >= -113) method3048(-125, -85, 60)
        anInt7027++
        return -1
    }

    fun method3039(i: Byte, i_1_: Int, i_2_: Int): Array<IntArray?>? {
        anInt7039++
        val i_3_ = 9 / ((6 - i) / 37)
        if (this.aClass348_Sub40Array7031[i_2_]!!.aBoolean7045) {
            val `is` = this.aClass348_Sub40Array7031[i_2_]!!.method3042(i_1_, 255)
            val is_4_ = arrayOfNulls<IntArray>(3)
            is_4_[2] = `is`
            is_4_[1] = `is`
            is_4_[0] = `is`
            return is_4_
        }
        return this.aClass348_Sub40Array7031[i_2_]!!.method3047(i_1_, -1564599039)
    }

    open fun method3042(i: Int, i_53_: Int): IntArray? {
        if (i_53_ != 255) return null
        anInt7035++
        throw IllegalStateException("This operation does not have a monochrome output")
    }

    open fun method3043(i: Int): Int {
        anInt7037++
        if (i != -1) this.aImageFrameCache_7033 = null
        return -1
    }

    open fun method3044(i: Int) {
        if (i <= 108) this.aSpriteSheetCache_7032 = null
        anInt7029++
    }

    open fun method3045(i: Int, i_54_: Int, i_55_: Int) {
        anInt7043++
        val i_56_ = (if (i_55_ != (this.anInt7036.inv())) this.anInt7036 else i_54_)
        if (this.aBoolean7045) this.aSpriteSheetCache_7032 = SpriteSheetCache(i_56_, i_54_, i)
        else this.aImageFrameCache_7033 = ImageFrameCache(i_56_, i_54_, i)
    }

    open fun method3046(i: Byte) {
        anInt7038++
        if (i > -102) method3046((-112).toByte())
        if (this.aBoolean7045) {
            this.aSpriteSheetCache_7032!!.method1432(124.toByte())
            this.aSpriteSheetCache_7032 = null
        } else {
            this.aImageFrameCache_7033!!.method2558(6144)
            this.aImageFrameCache_7033 = null
        }
    }

    open fun method3047(i: Int, i_57_: Int): Array<IntArray?>? {
        anInt7040++
        if (i_57_ != -1564599039) method3048(-4, -64, 20)
        throw IllegalStateException("This operation does not have a colour output")
    }

    fun method3048(i: Int, i_58_: Int, i_59_: Int): IntArray? {
        anInt7034++
        if (i_58_ != 633706337) this.aSpriteSheetCache_7032 = null
        if (!this.aClass348_Sub40Array7031[i_59_]!!.aBoolean7045) return (this.aClass348_Sub40Array7031[i_59_]!!.method3047(i, -1564599039)!![0])
        return this.aClass348_Sub40Array7031[i_59_]!!.method3042(i, i_58_ + -633706082)
    }

    open fun method3049(class348_sub49: ByteBuffer, i: Int, i_60_: Int) {
        anInt7028++
        if (i_60_ != 31015) method3038(-16)
    }

    init {
        this.aClass348_Sub40Array7031 = arrayOfNulls<AbstractProceduralTextureNode>(i)
    }
}
