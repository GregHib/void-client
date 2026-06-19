import java.io.IOException

object OggCacheStreamStatics {
    var aBoolean5265: Boolean = false

    @JvmField
    var anInt5266: Int = 0

    @JvmField
    var anInt5268: Int = 0

    @JvmField
    var aNamedIdRecord_5271: NamedIdRecord? = NamedIdRecord("LIVE", 0)

    @JvmField
    var anInt5273: Int = 0

    @JvmStatic
    fun method523(i: Int) {
        if (i <= 80) method524(-87, true, 104, 0)
        aNamedIdRecord_5271 = null
    }

    @JvmStatic
    fun method524(i: Int, bool: Boolean, i_2_: Int, i_3_: Int) {
        if (i_3_ > -108) aBoolean5265 = false
        if (ProjectileConfigUtil.aHashtable_389!!.method3480(i_2_.toLong(), -6008) == null) {
            if (WidgetTextConfigStatics.aBoolean510) {
                val class348_sub15 = MenuActionNode(i_2_, OggCacheStream(4096, (HitsplatDefinitionStatics.aJs5Archive_2015!!), i_2_), i, bool)
                class348_sub15.aClass55_Sub1_6768!!.method509(-92, RgbNoiseTextureStatics.aStringArray5305!![AnimationFrameDefinitionStatics.anInt6967])
                ProjectileConfigUtil.aHashtable_389!!.method3483(35.toByte(), i_2_.toLong(), class348_sub15)
            } else ProjectileDefinition.method2285(bool, (-90).toByte(), i_2_)
        }
        anInt5268++
    }
}
