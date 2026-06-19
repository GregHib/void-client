import GlCubeMapTextureStatics.method243
import GradientLookupEffectStatics.method3076
import GlShadowRenderPassStatics.method3553
import kotlin.concurrent.Volatile
import SpriteRenderableStatics.anInt4721
import SpriteRenderableStatics.anInt4723

/* Class49 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteRenderable internal constructor(var_ha_Sub1: SoftwareRenderer?, abstractModelRenderer: AbstractModelRenderer?, floatGrid: FloatGrid?) : SpriteDrawTarget {
    var aFloatArray4719: FloatArray? = null
    var anInt4722: Int = 0
    private var aFloatGrid_4724: FloatGrid? = null
    var anInt4725: Int = 0
    private val aHa_Sub1_4729: SoftwareRenderer?
    var anIntArray4731: IntArray?

    override fun method14(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, bool: Boolean, bool_8_: Boolean) {
        anInt4723++
        ItemDefinitionStatics.method1568((aHa_Sub1_4729!!.aClass348_Sub31_7469!!.anIntArray6916), i_3_, i, i_7_, if (bool_8_) aHa_Sub1_4729.aFloatArray7502 else null, if (bool) this.anIntArray4731 else null, i_4_, 115, i_5_, (aHa_Sub1_4729.aClass348_Sub31_7469!!.anInt6917), this.anInt4725, i_6_, if (!bool_8_) null else this.aFloatArray4719)
    }

    override fun method15(i: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, bool: Boolean, bool_14_: Boolean) {
        anInt4721++
        ItemDefinitionStatics.method1568(this.anIntArray4731, i_9_, i, i_13_, if (bool_14_) this.aFloatArray4719 else null, if (!bool) null else (aHa_Sub1_4729!!.aClass348_Sub31_7469!!.anIntArray6916), i_10_, 113, i_11_, this.anInt4725, (aHa_Sub1_4729!!.aClass348_Sub31_7469!!.anInt6917), i_12_, if (bool_14_) aHa_Sub1_4729.aFloatArray7502 else null)
    }

    init {
        do {
            try {
                aHa_Sub1_4729 = var_ha_Sub1
                if (abstractModelRenderer is SoftwareRgbSpriteRenderer) {
                    val class105_sub3_sub1 = abstractModelRenderer
                    this.anIntArray4731 = (class105_sub3_sub1.anIntArray9933)
                    this.anInt4722 = class105_sub3_sub1.anInt8470
                    this.anInt4725 = class105_sub3_sub1.anInt8471
                } else {
                    if (abstractModelRenderer !is SoftwareAlphaSpriteRenderer) throw RuntimeException()
                    val class105_sub3_sub3 = abstractModelRenderer
                    this.anInt4725 = class105_sub3_sub3.anInt8471
                    this.anInt4722 = class105_sub3_sub3.anInt8470
                    this.anIntArray4731 = (class105_sub3_sub3.anIntArray9936)
                }
                if (floatGrid == null) break
                aFloatGrid_4724 = floatGrid
                if ((aFloatGrid_4724!!.anInt4974 != this.anInt4725) || (this.anInt4722 != aFloatGrid_4724!!.anInt4978)) throw RuntimeException()
                this.aFloatArray4719 = aFloatGrid_4724!!.aFloatArray4980
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("it.<init>(" + (if (var_ha_Sub1 != null) "{...}" else "null") + ',' + (if (abstractModelRenderer != null) "{...}" else "null") + ',' + (if (floatGrid != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }
}
