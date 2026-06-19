import FixedFunctionWaterPassStatics.anInt7352
import FixedFunctionWaterPassStatics.anInt7354
import FixedFunctionWaterPassStatics.aShort7355
import FixedFunctionWaterPassStatics.anInt7356
import FixedFunctionWaterPassStatics.anInt7357
import FixedFunctionWaterPassStatics.anInt7358
import FixedFunctionWaterPassStatics.anInt7360
import FixedFunctionWaterPassStatics.anInt7364
import FixedFunctionWaterPassStatics.anInt7365
import FixedFunctionWaterPassStatics.method3549

/* Class367_Sub8 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FixedFunctionWaterPass internal constructor(var_ha_Sub3: NativeRenderer, normalMapGenerator: NormalMapGenerator?) : AbstractRenderPass(var_ha_Sub3) {
    private var aFloat7350 = 0.0f
    private val aNormalMapGenerator_7353: NormalMapGenerator?
    override fun method3520(i: Byte) {
        this.aHa_Sub3_4479.method3897(1, -4382)
        if (i.toInt() != 87) method3549(-29, (-5).toByte())
        anInt7364++
        this.aHa_Sub3_4479.method3874(ParticleSystemStateStatics.aRenderConfigFactory_2207, 120, ParticleSystemStateStatics.aRenderConfigFactory_2207)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
        this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
        this.aHa_Sub3_4479.method3910((-26).toByte(), 1)
        this.aHa_Sub3_4479.method3850(86.toByte(), null)
        this.aHa_Sub3_4479.method3897(0, -4382)
        this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
    }

    override fun method3526(i: Int, i_17_: Int, i_18_: Int) {
        this.aHa_Sub3_4479.method3897(1, -4382)
        anInt7354++
        if (i != 10756) method3527(-26, null, 111)
        if ((0x80 and i_17_) == 0) {
            if ((0x1 and i_18_) != 1) {
                if (aNormalMapGenerator_7353!!.aBoolean3458) this.aHa_Sub3_4479.method3850(108.toByte(), aNormalMapGenerator_7353.anInterface18_Impl1_3452)
                else this.aHa_Sub3_4479.method3850(126.toByte(), (aNormalMapGenerator_7353.anInterface18_Impl3Array3459!![0]))
            } else if (aNormalMapGenerator_7353!!.aBoolean3458) {
                aFloat7350 = ((this.aHa_Sub3_4479.anInt8146) % 4000).toFloat() / 4000.0f
                this.aHa_Sub3_4479.method3850((-112).toByte(), aNormalMapGenerator_7353.anInterface18_Impl1_3452)
            } else {
                val i_19_ = (16 * (this.aHa_Sub3_4479.anInt8146 % 4000) / 4000)
                this.aHa_Sub3_4479.method3850((-114).toByte(), (aNormalMapGenerator_7353.anInterface18_Impl3Array3459!![i_19_]))
            }
        } else this.aHa_Sub3_4479.method3850(85.toByte(), null)
        this.aHa_Sub3_4479.method3897(0, -4382)
    }

    override fun method3530(i: Int): Boolean {
        if (i > -57) return false
        anInt7360++
        return aNormalMapGenerator_7353!!.method2039(116)
    }

    override fun method3532(i: Int) {
        if (this.aHa_Sub3_4479.method3877((-126).toByte()) == 0) {
            val class101_sub2 = this.aHa_Sub3_4479.method3848(5)
            this.aHa_Sub3_4479.method3897(1, i xor 0x39a4.inv())
            val class101_sub2_21_ = this.aHa_Sub3_4479.method3820(false)
            class101_sub2_21_.method898(class101_sub2)
            class101_sub2_21_.method914(0.125f, 1.0f, 0, 0.125f)
            class101_sub2_21_.method920(0.0f, false, aFloat7350, 0.0f)
            this.aHa_Sub3_4479.method3853(-32, ClampTextureNodeStatics.aConfigFlagUtil_9477)
            this.aHa_Sub3_4479.method3897(0, -4382)
        }
        anInt7352++
        if (i != 10425) method3530(16)
    }

    override fun method3521(bool: Boolean, i: Byte) {
        if (i.toInt() != -103) anInt7365 = 86
        this.aHa_Sub3_4479.method3874((RenderQueueState.aRenderConfigFactory_6519), i.toInt() xor 0x17.inv(), ParticleSystemStateStatics.aRenderConfigFactory_2207)
        anInt7357++
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7356++
        this.aHa_Sub3_4479.method3897(1, i xor 0x2a45.inv())
        this.aHa_Sub3_4479.method3874((RenderQueueState.aRenderConfigFactory_6519), 111, (TheoraVideoStreamStatics.aRenderConfigFactory_9011))
        this.aHa_Sub3_4479.method3924(true, false, 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247, false)
        this.aHa_Sub3_4479.method3885(0, true, SceneObjectEntityStatics.aTrigLookupTables_8737)
        this.aHa_Sub3_4479.method3910((-26).toByte(), 0)
        this.aHa_Sub3_4479.method3897(0, -4382)
        this.aHa_Sub3_4479.method3894(-28186, -16777216)
        this.aHa_Sub3_4479.method3885(0, true, RenderListTextureNodeStatics.aTrigLookupTables_9485)
        method3532(10425)
        if (i != 15192) aShort7355 = 106.toShort()
    }

    override fun method3527(i: Int, renderable: Renderable?, i_22_: Int) {
        this.aHa_Sub3_4479.method3850(103.toByte(), renderable)
        anInt7358++
        if (i_22_ != -16776) method3520((-127).toByte())
    }

    init {
        try {
            aNormalMapGenerator_7353 = normalMapGenerator
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("kl.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (normalMapGenerator != null) "{...}" else "null") + ')'))
        }
    }
}
