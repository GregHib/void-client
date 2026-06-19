import CacheArchiveIndexLoaderStatics.method340
import ColorThresholdEffectStatics.method3051
import kotlin.math.asin
import kotlin.math.atan2
import kotlin.math.max
import kotlin.math.sqrt
import HintArrowRendererStatics.method732
import HintArrowRendererStatics.method738
import HintArrowRendererStatics.aAbstractModelRenderer_1215
import HintArrowRendererStatics.anIntArray1226
import HintArrowRendererStatics.aAbstractModel_1227
import HintArrowRendererStatics.aAbstractModelRenderer_1228

/* Class72 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class HintArrowRenderer internal constructor(private val anInt1230: Int, private val anInt1224: Int, private val anInt1225: Int, private val anInt1216: Int, private val anInt1229: Int, private val anInt1218: Int, private val anInt1222: Int, private val aBoolean1223: Boolean) {
    private var anInt1217 = 0
    private var anInt1219 = 0
    private var anInt1220 = 0
    private var aAbstractModelRenderer_1221: AbstractModelRenderer? = null
    private var anInt1231 = 0
    @JvmField
    var anInt1232: Int = 0

    private fun method730(var_renderer: Renderer, hintArrowRenderer_0_: HintArrowRenderer?): Boolean {
        if (aAbstractModelRenderer_1221 == null) {
            if (anInt1230 == 0) {
                if (MatrixCameraTransformStatics.aRenderConfig5684!!.method4(-7953, anInt1224)) {
                    val `is` = MatrixCameraTransformStatics.aRenderConfig5684!!.method6(-21540, anInt1220, 0.7f, anInt1224, false, anInt1220)
                    aAbstractModelRenderer_1221 = var_renderer.method3662(anInt1220, `is`, 94.toByte(), 0, anInt1220, anInt1220)
                }
            } else if (anInt1230 == 2) method740(var_renderer, hintArrowRenderer_0_)
            else if (anInt1230 == 1) method735(var_renderer, hintArrowRenderer_0_)
        }
        return aAbstractModelRenderer_1221 != null
    }

    fun method733(i: Int, i_11_: Int, i_12_: Int, i_13_: Int): Boolean {
        var i_14_: Int
        var i_15_: Int
        var i_16_: Int
        if (aBoolean1223) {
            this.anInt1232 = 1073741823
            i_14_ = anInt1225
            i_15_ = anInt1216
            i_16_ = anInt1229
        } else {
            i_14_ = anInt1225 - i
            i_15_ = anInt1216 - i_11_
            i_16_ = anInt1229 - i_12_
            this.anInt1232 = sqrt((i_14_ * i_14_ + i_15_ * i_15_ + i_16_ * i_16_).toDouble()).toInt()
            if (this.anInt1232 == 0) this.anInt1232 = 1
            i_14_ = (i_14_ shl 8) / this.anInt1232
            i_15_ = (i_15_ shl 8) / this.anInt1232
            i_16_ = (i_16_ shl 8) / this.anInt1232
        }
        val i_17_ = (sqrt((i_14_ * i_14_ + i_15_ * i_15_ + i_16_ * i_16_).toDouble()) * 256.0).toInt()
        if (i_17_ > 128) {
            i_14_ = (i_14_ shl 16) / i_17_
            i_15_ = (i_15_ shl 16) / i_17_
            i_16_ = (i_16_ shl 16) / i_17_
            anInt1217 = anInt1218 * i_13_ / (if (aBoolean1223) 1024 else this.anInt1232)
        } else anInt1217 = 0
        if (anInt1217 < 8) {
            aAbstractModelRenderer_1221 = null
            return false
        }
        var i_18_ = method340(anInt1217, 108.toByte())
        if (i_18_ > i_13_) i_18_ = method3051(i_13_, 4096)
        if (i_18_ > 512) i_18_ = 512
        if (i_18_ != anInt1220) anInt1220 = i_18_
        anInt1231 = (asin((i_15_.toFloat() / 256.0f).toDouble()) * 2607.5945876176133).toInt() and 0x3fff
        anInt1219 = (atan2(i_14_.toDouble(), -i_16_.toDouble()) * 2607.5945876176133).toInt() and 0x3fff
        aAbstractModelRenderer_1221 = null
        return true
    }

    fun method734() {
        aAbstractModelRenderer_1221 = null
    }

    private fun method735(var_renderer: Renderer, hintArrowRenderer_19_: HintArrowRenderer?) {
        method738(var_renderer)
        method732(var_renderer)
        var_renderer.K(anIntArray1226)
        var_renderer.KA(0, 0, anInt1220, anInt1220)
        var_renderer.ya()
        var_renderer.aa(0, 0, anInt1220, anInt1220, 0xffffff.inv() or anInt1222, 0)
        var i = 0
        var i_20_ = 0
        var i_21_ = 256
        if (hintArrowRenderer_19_ != null) {
            if (hintArrowRenderer_19_.aBoolean1223) {
                i = -hintArrowRenderer_19_.anInt1225
                i_20_ = -hintArrowRenderer_19_.anInt1216
                i_21_ = -hintArrowRenderer_19_.anInt1229
            } else {
                i = hintArrowRenderer_19_.anInt1225 - anInt1225
                i_20_ = hintArrowRenderer_19_.anInt1216 - anInt1216
                i_21_ = hintArrowRenderer_19_.anInt1229 - anInt1229
            }
        }
        if (anInt1231 != 0) {
            val i_22_: Int = TrigLookupTablesStatics.anIntArray1207!![anInt1231]
            val i_23_: Int = TrigLookupTablesStatics.anIntArray1204!![anInt1231]
            val i_24_ = i_20_ * i_23_ - i_21_ * i_22_ shr 14
            i_21_ = i_20_ * i_22_ + i_21_ * i_23_ shr 14
            i_20_ = i_24_
        }
        if (anInt1219 != 0) {
            val i_25_: Int = TrigLookupTablesStatics.anIntArray1207!![anInt1219]
            val i_26_: Int = TrigLookupTablesStatics.anIntArray1204!![anInt1219]
            val i_27_ = i_21_ * i_25_ + i * i_26_ shr 14
            i_21_ = i_21_ * i_26_ - i * i_25_ shr 14
            i = i_27_
        }
        val abstractModel: AbstractModel? = aAbstractModel_1227!!.method614(0.toByte(), 51200, true)
        abstractModel!!.aa(0.toShort(), anInt1224.toShort())
        var_renderer.xa(1.0f)
        var_renderer.ZA(16777215, 1.0f, 1.0f, i.toFloat(), i_20_.toFloat(), i_21_.toFloat())
        var i_28_ = 1024 * anInt1220 / (abstractModel.RA() - abstractModel.V())
        if (anInt1222 != 0) i_28_ = i_28_ * 13 / 16
        var_renderer.DA(anInt1220 / 2, anInt1220 / 2, i_28_, i_28_)
        var_renderer.method3638(var_renderer.method3654())
        val class101 = var_renderer.method3654()
        class101.method894(0, 0, var_renderer.i() - abstractModel.HA())
        abstractModel.method608(class101, null, 1024, 1)
        val i_29_ = anInt1220 * 13 / 16
        val i_30_ = (anInt1220 - i_29_) / 2
        aAbstractModelRenderer_1215!!.method970(i_30_, i_30_, i_29_, i_29_, 0, 0xffffff.inv() or anInt1222, 1)
        aAbstractModelRenderer_1221 = var_renderer.method3683(0, 0, anInt1220, anInt1220, true)
        var_renderer.ya()
        var_renderer.aa(0, 0, anInt1220, anInt1220, 0, 0)
        aAbstractModelRenderer_1228!!.method970(0, 0, anInt1220, anInt1220, 1, 0, 0)
        aAbstractModelRenderer_1221!!.method968(0, 0, 0)
        var_renderer.KA(anIntArray1226!![0], anIntArray1226!![1], anIntArray1226!![2], anIntArray1226!![3])
    }

    fun method736(var_renderer: Renderer, hintArrowRenderer_31_: HintArrowRenderer?): Boolean {
        return aAbstractModelRenderer_1221 != null || method730(var_renderer, hintArrowRenderer_31_)
    }

    fun method737(var_renderer: Renderer?, i: Int, i_32_: Int, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Int) {
        if (aAbstractModelRenderer_1221 != null) {
            var i_37_ = anInt1231 - i_35_ and 0x3fff
            var i_38_ = anInt1219 - i_36_ and 0x3fff
            if (i_38_ > 8192) i_38_ -= 16384
            if (i_37_ > 8192) i_37_ -= 16384
            val i_39_ = i_37_ * i_34_ / 4096 + (i_34_ - anInt1217) / 2
            val i_40_ = i_38_ * i_34_ / -4096 + (i_33_ - anInt1217) / 2
            if (i_39_ < i_34_ && i_39_ + anInt1217 > 0 && i_40_ < i_33_ && i_40_ + anInt1217 > 0) aAbstractModelRenderer_1221!!.method973(i_40_ + i, i_39_ + i_32_, anInt1217, anInt1217)
        }
    }

    private fun method740(var_renderer: Renderer, hintArrowRenderer_60_: HintArrowRenderer?) {
        val class124 = ParticleConfigParserStatics.method2277(0, WalkingTypeUtil.aJs5Archive_3309!!, anInt1224, -1)
        if (class124 != null) {
            var_renderer.K(anIntArray1226)
            var_renderer.KA(0, 0, anInt1220, anInt1220)
            var_renderer.aa(0, 0, anInt1220, anInt1220, 0, 0)
            var i = 0
            var i_61_ = 0
            var i_62_ = 256
            if (hintArrowRenderer_60_ != null) {
                if (hintArrowRenderer_60_.aBoolean1223) {
                    i = -hintArrowRenderer_60_.anInt1225
                    i_61_ = -hintArrowRenderer_60_.anInt1216
                    i_62_ = -hintArrowRenderer_60_.anInt1229
                } else {
                    i = anInt1225 - hintArrowRenderer_60_.anInt1225
                    i_61_ = anInt1216 - hintArrowRenderer_60_.anInt1216
                    i_62_ = anInt1229 - hintArrowRenderer_60_.anInt1229
                }
            }
            if (anInt1231 != 0) {
                val i_63_ = -anInt1231 and 0x3fff
                val i_64_: Int = TrigLookupTablesStatics.anIntArray1207!![i_63_]
                val i_65_: Int = TrigLookupTablesStatics.anIntArray1204!![i_63_]
                val i_66_ = i_61_ * i_65_ - i_62_ * i_64_ shr 14
                i_62_ = i_61_ * i_64_ + i_62_ * i_65_ shr 14
                i_61_ = i_66_
            }
            if (anInt1219 != 0) {
                val i_67_ = -anInt1219 and 0x3fff
                val i_68_: Int = TrigLookupTablesStatics.anIntArray1207!![i_67_]
                val i_69_: Int = TrigLookupTablesStatics.anIntArray1204!![i_67_]
                val i_70_ = i_62_ * i_68_ + i * i_69_ shr 14
                i_62_ = i_62_ * i_69_ - i * i_68_ shr 14
                i = i_70_
            }
            var_renderer.xa(1.0f)
            var_renderer.ZA(16777215, 1.0f, 1.0f, i.toFloat(), i_61_.toFloat(), i_62_.toFloat())
            val class64 = var_renderer.method3625(class124, 2048, 0, 64, 768)
            val i_71_ = class64.RA() - class64.V()
            val i_72_ = class64.EA() - class64.fa()
            val i_73_ = class64.V() + i_71_ / 2
            val i_74_ = class64.fa() + i_72_ / 2
            val i_75_ = max(i_71_, i_72_)
            var_renderer.DA(i_73_, i_74_, i_75_, i_75_)
            var_renderer.method3638(var_renderer.method3654())
            val class101 = var_renderer.method3705()
            class101.method894(0, 0, var_renderer.i() - class64.HA())
            class64.method608(class101, null, var_renderer.i(), 1)
            aAbstractModelRenderer_1221 = var_renderer.method3683(0, 0, anInt1220, anInt1220, true)
            aAbstractModelRenderer_1221!!.method968(0, 0, 3)
            var_renderer.KA(anIntArray1226!![0], anIntArray1226!![1], anIntArray1226!![2], anIntArray1226!![3])
        }
    }
}
