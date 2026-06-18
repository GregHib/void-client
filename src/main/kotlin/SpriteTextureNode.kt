/* Class348_Sub40_Sub17 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class SpriteTextureNode : AbstractProceduralTextureNode(0, false) {
    var anIntArray9232: IntArray? = null
    var anInt9237: Int = 0
    var anInt9241: Int = 0
    private var anInt9243 = -1

    fun method3090(bool: Boolean): Boolean {
        anInt9235++
        if (bool != true) return true
        if (this.anIntArray9232 != null) return true
        if (anInt9243 >= 0) {
            val spriteImage = (if (FloatCameraTransform.anInt5713 >= 0) SpriteImage.method1521(aJs5Archive_4286!!, FloatCameraTransform.anInt5713, anInt9243) else SpriteImage.method1512(aJs5Archive_4286!!, anInt9243))
            spriteImage!!.method1524()
            this.anIntArray9232 = spriteImage.method1516()
            this.anInt9237 = spriteImage.anInt2702
            this.anInt9241 = spriteImage.anInt2696
            return true
        }
        return false
    }

    override fun method3049(class348_sub49: Buffer, i: Int, i_0_: Int) {
        if (i_0_ == 31015) {
            if (i == 0) anInt9243 = class348_sub49.readUnsignedShort(842397944)
            anInt9236++
        }
    }

    override fun method3037(i: Int): Int {
        anInt9233++
        if (i > -113) aBoolean9242 = false
        return anInt9243
    }

    override fun method3046(i: Byte) {
        super.method3046((-112).toByte())
        if (i < -102) {
            anInt9238++
            this.anIntArray9232 = null
        }
    }

    override fun method3047(i: Int, i_1_: Int): Array<IntArray?>? {
        anInt9239++
        if (i_1_ != -1564599039) method3047(8, -86)
        val `is` = this.aImageFrameCache_7033!!.method2557(-108, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035 && method3090(true)) {
            val is_2_ = `is`[0]!!
            val is_3_ = `is`[1]!!
            val is_4_ = `is`[2]!!
            var i_5_ = (this.anInt9237 * (if (this.anInt9241 != FixedFunctionMaterialPass.anInt6212) (this.anInt9241 * i / FixedFunctionMaterialPass.anInt6212) else i))
            if (DisplaceTextureNode.Companion.anInt9139 == this.anInt9237) {
                var i_6_ = 0
                while ((DisplaceTextureNode.Companion.anInt9139 > i_6_)) {
                    val i_7_ = this.anIntArray9232!![i_5_++]
                    is_4_[i_6_] = NpcSummaryDefinition.method1166(4080, i_7_ shl 4)
                    is_3_[i_6_] = NpcSummaryDefinition.method1166(65280, i_7_) shr 4
                    is_2_[i_6_] = NpcSummaryDefinition.method1166(4080, i_7_ shr 12)
                    i_6_++
                }
            } else {
                var i_8_ = 0
                while ((DisplaceTextureNode.Companion.anInt9139 > i_8_)) {
                    val i_9_: Int = (this.anInt9237 * i_8_ / DisplaceTextureNode.Companion.anInt9139)
                    val i_10_ = (this.anIntArray9232!![i_9_ + i_5_])
                    is_4_[i_8_] = NpcSummaryDefinition.method1166(i_10_, 255) shl 4
                    is_3_[i_8_] = NpcSummaryDefinition.method1166(i_10_ shr 4, 4080)
                    is_2_[i_8_] = NpcSummaryDefinition.method1166(i_10_, 16711680) shr 12
                    i_8_++
                }
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9233: Int = 0
        @JvmField
        var aFontMetaRef_9234: FontMetaRef? = FontMetaRef(67, -1)
        @JvmField
        var anInt9235: Int = 0
        @JvmField
        var anInt9236: Int = 0
        @JvmField
        var anInt9238: Int = 0
        @JvmField
        var anInt9239: Int = 0
        @JvmField
        var aNodeDeque_9240: NodeDeque? = NodeDeque()
        @JvmField
        var aBoolean9242: Boolean = false
        @JvmStatic
        fun method3091(bool: Boolean) {
            aFontMetaRef_9234 = null
            aNodeDeque_9240 = null
            if (bool != true) method3091(false)
        }
    }
}
