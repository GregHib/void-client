import VorbisOggDecoder.Companion.method2970

/* Class348_Sub40_Sub39 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RenderListTextureNode : AbstractProceduralTextureNode(0, true) {
    private var aMinimapShapeDrawerArray9481: Array<MinimapShapeDrawer?>? = null
    private fun method3151(`is`: Array<IntArray?>?, i: Byte) {
        anInt9487++
        if (i.toInt() != -27) method3152(86)
        val i_0_: Int = DisplaceTextureNode.Companion.anInt9139
        val i_1_ = FixedFunctionMaterialPass.anInt6212
        NpcAppearanceFlags.method224((-40).toByte(), `is`)
        MultiFieldRecord.method3000(SimpleBinaryOptionState.anInt6076, 0, TextureCubeProvider.anInt6325, 0, i.toInt() xor 0x28)
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

    override fun method3049(class348_sub49: Buffer, i: Int, i_6_: Int) {
        if (i_6_ != 31015) aClass70_9485 = null
        if (i == 0) {
            aMinimapShapeDrawerArray9481 = arrayOfNulls<MinimapShapeDrawer>(class348_sub49.readUnsignedByte(255))
            var i_7_ = 0
            while_216_@ while (aMinimapShapeDrawerArray9481!!.size > i_7_) {
                val i_8_ = class348_sub49.readUnsignedByte(255)
                val i_9_ = i_8_
                while_214_@ do {
                    do {
                        if (i_9_ == 0) {
                            aMinimapShapeDrawerArray9481!![i_7_] = LoadProgressCounters.method1374(107, class348_sub49)
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
                        aMinimapShapeDrawerArray9481!![i_7_] = (method2970(CameraSplineNode.method2955(i_6_, 31013), class348_sub49))
                        i_7_++
                        continue@while_216_
                    } while (false)
                    aMinimapShapeDrawerArray9481!![i_7_] = (method3036(class348_sub49, CameraSplineNode.method2955(i_6_, -31102)))
                    i_7_++
                    continue@while_216_
                } while (false)
                aMinimapShapeDrawerArray9481!![i_7_] = SplashImageLoadable.method2022(class348_sub49, 0)
                i_7_++
            }
        } else if (i == 1) this.aBoolean7045 = class348_sub49.readUnsignedByte(255) == 1
        anInt9484++
    }

    override fun method3047(i: Int, i_10_: Int): Array<IntArray?>? {
        anInt9483++
        val `is` = this.aImageFrameCache_7033!!.method2557(i_10_ + 1564598923, i)
        if (i_10_ != -1564599039) aClass70_9485 = null
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val i_11_: Int = DisplaceTextureNode.Companion.anInt9139
            val i_12_ = FixedFunctionMaterialPass.anInt6212
            val is_13_: Array<IntArray> = Array<IntArray>(i_12_) { IntArray(i_11_) }
            val is_14_ = this.aImageFrameCache_7033!!.method2553(0)!!
            method3151(is_13_ as Array<IntArray?>?, (-27).toByte())
            var i_15_ = 0
            while (FixedFunctionMaterialPass.anInt6212 > i_15_) {
                val is_16_ = is_13_[i_15_]
                val is_17_ = is_14_[i_15_]!!
                val is_18_ = is_17_[0]!!
                val is_19_ = is_17_[1]!!
                val is_20_ = is_17_[2]!!
                for (i_21_ in 0..<DisplaceTextureNode.Companion.anInt9139) {
                    val i_22_ = is_16_[i_21_]
                    is_20_[i_21_] = NpcSummaryDefinition.method1166(i_22_, 255) shl 4
                    is_19_[i_21_] = NpcSummaryDefinition.method1166(i_22_ shr 4, 4080)
                    is_18_[i_21_] = NpcSummaryDefinition.method1166(4080, i_22_ shr 12)
                }
                i_15_++
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9482: Int = 0
        @JvmField
        var anInt9483: Int = 0
        @JvmField
        var anInt9484: Int = 0
        @JvmField
        var aClass70_9485: Class70? = Class70()
        @JvmField
        var anInt9486: Int = 0
        @JvmField
        var anInt9487: Int = 0

        @JvmStatic
        fun method3152(i: Int) {
            aClass70_9485 = null
            if (i != 255) method3152(-42)
        }

        @JvmStatic
        fun method3153(i: Int) {
            anInt9482++
            var class348_sub42_sub13 = (ParticleSortRenderer.aLinkedNodeListIterator_3022!!.method1011(-49) as ContactList?)
            while (class348_sub42_sub13 != null) {
                if (class348_sub42_sub13.anInt9615 > 1) {
                    class348_sub42_sub13.anInt9615 = 0
                    KeyboardLayoutCache.aLruByteCache_3301!!.method582(class348_sub42_sub13, (class348_sub42_sub13.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063 as ContactEntry).aLong9600, (-108).toByte())
                    class348_sub42_sub13.aLinkedNodeListIterator_9621.method1009(i xor 0x7dc976c2)
                }
                class348_sub42_sub13 = (ParticleSortRenderer.aLinkedNodeListIterator_3022!!.method1003(51.toByte()) as ContactList?)
            }
            Class8.anInt166 = 0
            Class73.anInt4776 = i
            SourceRowTextureNode.Companion.aNodeDeque_9111!!.method1996(125)
            ContactEntry.aHashtable_9603!!.method3481(0)
            ParticleSortRenderer.aLinkedNodeListIterator_3022!!.method1009(2110355138)
            ScrollbarComponent.aBoolean8335 = false
        }
    }
}
