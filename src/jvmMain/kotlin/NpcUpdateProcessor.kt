import FixedFunctionMaterialPassStatics.method2146
import WorldMapElementStatics.method181
import IdentKitRecolorStatics.method204

/* Class91 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object NpcUpdateProcessor {
    @JvmField
    var aRgbColorPalette_1519: RgbColorPalette?
    @JvmField
    var anInt1520: Int = 0
    var anIntArray1521: IntArray? = intArrayOf(7, 8, 9, 10, 11, 12, 13, 15)
    @JvmField
    var anInt1522: Int = 0
    @JvmField
    var aConfigArchiveLoader_1523: ConfigArchiveLoader? = null

    fun method855(i: Int, i_0_: Int, i_1_: Int) {
        anInt1520++
        val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i_1_, 105.toByte(), i) //6
        class348_sub42_sub15.method3246(i xor 0x6397.inv())
        class348_sub42_sub15.anInt9652 = i_0_
    }

    fun method856(i: Byte) {
        ParticleGeometryStatics.anInt4411 = 0
        AbstractCameraTransformStatics.anInt1597 = 0
        anInt1522++
        NullOggStreamStatics.anInt9041++
        NpcSummaryDefinitionStatics.method1165(1)
        method204(-724138005)
        VarpStoreStatics.method1318(-65536)
        var bool = false
        for (i_2_ in 0..<ParticleGeometryStatics.anInt4411) {
            val i_3_ = ProportionalScrollbarComponentStatics.anIntArray9932!![i_2_]
            val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_3_.toLong(), -6008) as NpcReference)
            val npc = (class348_sub22.aNpc_6859)!!
            if (ScrollbarComponentStatics.aBoolean8335 && ParamMapStatics.method3169(i_3_, 0)) method2146(84.toByte())
            if (NullOggStreamStatics.anInt9041 != (npc.anInt10306)) {
                if (npc.aNpcType_10505!!.method793(0)) method181(true, npc)
                npc.method2448(null, -2)
                class348_sub22.method2715(52.toByte())
                bool = true
            }
        }
        if (bool) {
            TerrainShadowBuilderGl2Statics.anInt6930 = NpcEntityUpdater.aHashtable_3654!!.method3474(1)
            NpcEntityUpdater.aHashtable_3654!!.method3477(3, TurbulenceTextureNodeStatics.aClass348_Sub22Array9319!! as Array<LinkedListNode?>)
        }
        if (RadialTextureNodeStatics.anInt9341 != CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197) throw RuntimeException("gnp1 pos:" + (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197) + " psize:" + RadialTextureNodeStatics.anInt9341)
        if (i <= 47) aRgbColorPalette_1519 = null
        var i_4_ = 0
        while (ModelDefinitionLoaderStatics.anInt2057 > i_4_) {
            if (NpcEntityUpdater.aHashtable_3654!!.method3480(RgbColorPaletteStatics.anIntArray1233!![i_4_].toLong(), -6008) == null) throw RuntimeException("gnp2 pos:" + i_4_ + " size:" + ModelDefinitionLoaderStatics.anInt2057)
            i_4_++
        }
        if (TerrainShadowBuilderGl2Statics.anInt6930 - ModelDefinitionLoaderStatics.anInt2057 != 0) throw RuntimeException("gnp3 mis:" + (TerrainShadowBuilderGl2Statics.anInt6930 - ModelDefinitionLoaderStatics.anInt2057))
        for (i_5_ in 0..<TerrainShadowBuilderGl2Statics.anInt6930) {
            if (TurbulenceTextureNodeStatics.aClass348_Sub22Array9319!![i_5_]!!.aNpc_6859!!.anInt10306 != NullOggStreamStatics.anInt9041) throw RuntimeException("gnp4 uk:" + (TurbulenceTextureNodeStatics.aClass348_Sub22Array9319!![i_5_]!!.aNpc_6859!!.anInt10290))
        }
    }

    @JvmStatic
    fun method857(i: Int) {
        anIntArray1521 = null
        aConfigArchiveLoader_1523 = null
        aRgbColorPalette_1519 = null
        if (i < 121) method856(((-72).toByte()).toByte())
    }

    init {
        aRgbColorPalette_1519 = RgbColorPalette(10, 8)
    }
}
