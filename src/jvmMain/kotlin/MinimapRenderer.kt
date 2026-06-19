import ClientExceptionStatics.method141
import MinimapRendererStatics.anInt1577
import MinimapRendererStatics.anInt1587
import MinimapRendererStatics.anInt1590

/* Class100 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapRenderer internal constructor(private val aHa_Sub2_1581: OpenGlRenderer) {
    private var anInt1578 = 0
    private var aWaterTextureSet_1582: WaterTextureSet?
    private var anInt1584 = 0
    var aClass286_Sub1_1586: ArbFogMaterialPass
    private val aMaterialPassArray1588: Array<MaterialPass?>
    private var anInt1592 = 0

    fun method884(i: Int, bool: Boolean, i_0_: Int, i_1_: Int, i_2_: Byte, bool_3_: Boolean) {
        var i_0_ = i_0_
        var i_1_ = i_1_
        var bool_3_ = bool_3_
        anInt1587++
        bool_3_ = bool_3_ and aHa_Sub2_1581.method3639()
        if (!bool_3_ && (i_0_ == 4 || i_0_ == 8 || i_0_ == 9)) {
            if (i_0_ == 4) i_1_ = i
            i_0_ = 2
        }
        if (i_0_ != 0 && bool) i_0_ = i_0_ or 0x7fffffff.inv()
        if (anInt1578 != i_0_) {
            if (anInt1578 != 0) aMaterialPassArray1588[0x7fffffff and anInt1578]!!.method2133(-93)
            if (i_0_ != 0) {
                aMaterialPassArray1588[i_0_ and 0x7fffffff]!!.method2134(bool, false)
                aMaterialPassArray1588[0x7fffffff and i_0_]!!.method2139(bool, ((-115).toByte()).toByte())
                aMaterialPassArray1588[i_0_ and 0x7fffffff]!!.method2136(i, i_1_, ((-106).toByte()).toByte())
            }
            anInt1578 = i_0_
            anInt1584 = i_1_
            anInt1592 = i
        } else if (anInt1578 != 0) {
            aMaterialPassArray1588[0x7fffffff and anInt1578]!!.method2139(bool, ((-101).toByte()).toByte())
            if (i != anInt1592 || anInt1584 != i_1_) {
                aMaterialPassArray1588[0x7fffffff and anInt1578]!!.method2136(i, i_1_, ((-98).toByte()).toByte())
                anInt1592 = i
                anInt1584 = i_1_
            }
        }
        if (i_2_ <= 9) aWaterTextureSet_1582 = null
    }

    fun method885(i: Int, i_4_: Byte, glTexture: GlTexture?): Boolean {
        anInt1590++
        if (anInt1578 == 0) return false
        if (i_4_.toInt() != -124) method889(99.toByte(), 7)
        aMaterialPassArray1588[0x7fffffff and anInt1578]!!.method2140(glTexture, ((-98).toByte()).toByte(), i)
        return true
    }

    fun method889(i: Byte, i_8_: Int): Boolean {
        if (i >= -45) method885(7, ((-70).toByte()).toByte(), null)
        anInt1577++
        return aMaterialPassArray1588[i_8_]!!.method2137(-112)
    }

    init {
        aWaterTextureSet_1582 = WaterTextureSet(aHa_Sub2_1581)
        aMaterialPassArray1588 = arrayOfNulls(10)
        aMaterialPassArray1588[1] = SphereMapMaterialPass(aHa_Sub2_1581)
        aMaterialPassArray1588[2] = WaterMaterialPass(aHa_Sub2_1581, aWaterTextureSet_1582)
        aMaterialPassArray1588[4] = ScrollTexMaterialPass(aHa_Sub2_1581, aWaterTextureSet_1582)
        aMaterialPassArray1588[5] = TexGenMaterialPass(aHa_Sub2_1581, aWaterTextureSet_1582)
        aMaterialPassArray1588[6] = FixedFunctionMaterialPass(aHa_Sub2_1581)
        aMaterialPassArray1588[7] = CubeMapMaterialPass(aHa_Sub2_1581)
        this.aClass286_Sub1_1586 = ArbFogMaterialPass(aHa_Sub2_1581)
        aMaterialPassArray1588[3] = this.aClass286_Sub1_1586
        aMaterialPassArray1588[8] = GlslEnvMaterialPass(aHa_Sub2_1581, aWaterTextureSet_1582)
        aMaterialPassArray1588[9] = GlslMaterialPass(aHa_Sub2_1581, aWaterTextureSet_1582)
        if (!aMaterialPassArray1588[8]!!.method2137(-33)) aMaterialPassArray1588[8] = aMaterialPassArray1588[4]
        if (!aMaterialPassArray1588[9]!!.method2137(-82)) aMaterialPassArray1588[9] = aMaterialPassArray1588[8]
    }
}
