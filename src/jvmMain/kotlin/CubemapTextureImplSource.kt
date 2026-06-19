import CubemapTextureImplSourceStatics.anInt8720

/* Class299_Sub2_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CubemapTextureImplSource internal constructor(private val aHa_Sub3_8718: NativeRenderer, private val anInt8716: Int, private val anInt8717: Int, private val anInt8715: Int, private val anInt8711: Int, private val anInt8708: Int, private val anInt8714: Int) : TextureCubeProvider() {
    private var anInterface18_Impl2_8719: RenderableCubeTexture? = null
    override fun method2266(bool: Boolean): RenderableCubeTexture? {
        if (bool != true) return null
        anInt8720++
        if (anInterface18_Impl2_8719 == null) {
            ArchiveFileConditionWrapperStatics.anIntArray3464!![3] = anInt8711
            ArchiveFileConditionWrapperStatics.anIntArray3464!![1] = anInt8717
            ArchiveFileConditionWrapperStatics.anIntArray3464!![4] = anInt8708
            val var_d = aHa_Sub3_8718.aRenderConfig4579!!
            ArchiveFileConditionWrapperStatics.anIntArray3464!![5] = anInt8714
            ArchiveFileConditionWrapperStatics.anIntArray3464!![2] = anInt8715
            ArchiveFileConditionWrapperStatics.anIntArray3464!![0] = anInt8716
            var bool_0_ = false
            var i = 0
            for (i_1_ in 0..5) {
                if (!var_d.method4(-7953, ArchiveFileConditionWrapperStatics.anIntArray3464!![i_1_])) return null
                val class12 = var_d.method3(ArchiveFileConditionWrapperStatics.anIntArray3464!![i_1_], -6662)
                val i_2_ = if (class12!!.aBoolean199) 64 else 128
                if (i < i_2_) i = i_2_
                if (class12.aByte205 > 0) bool_0_ = true
            }
            for (i_3_ in 0..5) WaterDetailOptionStateStatics.anIntArrayArray5991!![i_3_] = var_d.method5(false, ArchiveFileConditionWrapperStatics.anIntArray3464!![i_3_], 1.0f, i, i, 81)
            anInterface18_Impl2_8719 = aHa_Sub3_8718.method3900(WaterDetailOptionStateStatics.anIntArrayArray5991, bool_0_, 61, i)
        }
        return anInterface18_Impl2_8719
    }
}
