import ServerConnectionInfo.Companion.method1258
import Class348_Sub40_Sub3.Companion.method3056
import Class348_Sub40_Sub9.Companion.method3073

/* Class264 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CompassSmoother {
    private var anInt3365 = 0
    var anInt3370: Int = 0
    fun method2016(i: Int, i_2_: Int) {
        if (i != 15615) method2019(98.toByte())
        anInt3365 = 0
        this.anInt3370 = i_2_
        anInt3377++
    }

    fun method2019(i: Byte): Int {
        if (i >= -18) anInt3373 = 32
        anInt3369++
        return this.anInt3370 and 0x3fff
    }

    fun method2020(i: Int, i_9_: Int, i_10_: Int, i_11_: Byte): Boolean {
        anInt3366++
        val i_12_ = anInt3365
        if (this.anInt3370 == i_9_ && anInt3365 == 0) return false
        if (i_11_ > -8) return true
        val bool: Boolean
        if (anInt3365 == 0) {
            if ((i_9_ > this.anInt3370 && i_9_ <= i_10_ + this.anInt3370) || (i_9_ < this.anInt3370 && (this.anInt3370 - i_10_ <= i_9_))) {
                this.anInt3370 = i_9_
                return false
            }
            bool = true
        } else if (anInt3365 > 0 && this.anInt3370 < i_9_) {
            val i_13_ = anInt3365 * anInt3365 / (2 * i_10_)
            val i_14_ = i_13_ + this.anInt3370
            bool = i_14_ < i_9_ && this.anInt3370 <= i_14_
        } else if (anInt3365 < 0 && i_9_ < this.anInt3370) {
            val i_15_ = anInt3365 * anInt3365 / (2 * i_10_)
            val i_16_ = this.anInt3370 - i_15_
            bool = i_9_ < i_16_ && i_16_ <= this.anInt3370
        } else bool = false
        if (bool) {
            if (this.anInt3370 >= i_9_) {
                anInt3365 -= i_10_
                if (i != 0 && anInt3365 < -i) anInt3365 = -i
            } else {
                anInt3365 += i_10_
                if (i != 0 && i < anInt3365) anInt3365 = i
            }
            if (i_12_ != anInt3365) {
                val i_17_ = anInt3365 * anInt3365 / (2 * i_10_)
                if (i_9_ > this.anInt3370) {
                    if (i_9_ < this.anInt3370 - -i_17_) anInt3365 = i_12_
                } else if (this.anInt3370 > i_9_ && i_9_ > this.anInt3370 - i_17_) anInt3365 = i_12_
            }
        } else if (anInt3365 <= 0) {
            anInt3365 += i_10_
            if (anInt3365 > 0) anInt3365 = 0
        } else {
            anInt3365 -= i_10_
            if (anInt3365 < 0) anInt3365 = 0
        }
        this.anInt3370 += anInt3365 + i_12_ shr 1
        return bool
    }

    fun method2021(i: Byte) {
        anInt3364++
        this.anInt3370 = this.anInt3370 and 0x3fff
        if (i < 77) method2021(36.toByte())
    }

    companion object {
        var anInt3364: Int = 0
        var anInt3366: Int = 0
        var anInt3367: Int = 0
        var aIntRange_3368: IntRange? = IntRange(112, 4)
        var anInt3369: Int = 0
        var aIntRange_3371: IntRange? = IntRange(63, 5)
        @JvmField
        var anInt3372: Int = 0
        @JvmField
        var anInt3373: Int = 0
        var anInt3374: Int = 0
        var anInt3375: Int = 0
        var anInt3376: Int = 0
        var anInt3377: Int = 0
        var aAbstractModelRendererArray3378: Array<AbstractModelRenderer?>? = null

        fun method2015(i: Int, i_0_: Int, i_1_: Int): Boolean {
            anInt3375++
            if (i_1_ != 7) return false
            return ((LoadingBarRenderer.method2217(i_0_, i, i_1_ xor 0x7) or method3056(115, i, i_0_) or method3073(i_0_, i, 50.toByte())) and method1258(i, -9301, i_0_))
        }

        @JvmStatic
        fun method2017(i: Int, widgetDefinition: WidgetDefinition?, i_3_: Int) {
            anInt3367++
            if (HintArrowOrMessage.anInt2021 < 50 && (widgetDefinition != null && widgetDefinition.anIntArrayArray264 != null && (widgetDefinition.anIntArrayArray264!!.size > i) && widgetDefinition.anIntArrayArray264!![i] != null)) {
                val i_4_ = widgetDefinition.anIntArrayArray264!![i]!![0]
                var i_5_ = i_4_ shr 8
                if (widgetDefinition.anIntArrayArray264!![i]!!.size > 1) {
                    val i_6_ = (Math.random() * (widgetDefinition.anIntArrayArray264!![i])!!.size.toDouble()).toInt()
                    if (i_6_ > 0) i_5_ = widgetDefinition.anIntArrayArray264!![i]!![i_6_]
                }
                val i_7_ = 0x7 and (i_4_ shr 5)
                if (i_3_ > 8) {
                    var i_8_ = 256
                    if (widgetDefinition.anIntArray236 != null && widgetDefinition.anIntArray265 != null) i_8_ = Texture2DProvider.method2257((widgetDefinition.anIntArray265!![i]), (widgetDefinition.anIntArray236!![i]), (-125).toByte())
                    if (widgetDefinition.aBoolean268) SoundChannelMixer.method2090(i_7_, i_8_, false, (-35).toByte(), 255, 0, i_5_)
                    else Class348_Sub20.method2947(true, 255, i_5_, i_7_, 0, i_8_)
                }
            }
        }

        @JvmStatic
        fun method2018(i: Int) {
            aAbstractModelRendererArray3378 = null
            aIntRange_3371 = null
            aIntRange_3368 = null
            if (i != 0) method2015(30, 1, -62)
        }
    }
}
