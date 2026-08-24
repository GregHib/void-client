import kotlin.jvm.JvmStatic
import GrowableStringList.Companion.anInt2361
import Js5Archive.Companion.method3873
import Js5Archive.Companion.method461
import SolidFillComponent.Companion.method194

/* Class83 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WaterTextureSet internal constructor(var_ha_Sub2: OpenGlRenderer) {
    var aClass258_Sub1_1440: GlTexture3D? = null
    var aBoolean1442: Boolean
    var aClass258_Sub1_1443: GlTexture3D? = null
    var aClass258_Sub3Array1444: Array<GlTexture2D?>? = null
    var aClass258_Sub1_1446: GlTexture3D? = null
    var aClass258_Sub3Array1448: Array<GlTexture2D?>? = null

    init {
        this.aBoolean1442 = var_ha_Sub2.aBoolean7831
        method3030(8, var_ha_Sub2)
        if (this.aBoolean1442) {
            var `is` = method461(false, GlShaderProgramHandle.anObject4177, 53146732)
            this.aClass258_Sub1_1440 = GlTexture3D(var_ha_Sub2, 6410, 128, 128, 16, `is`, 6410)
            `is` = method461(false, MapElementDefinitionCache.anObject3985, 53146732)
            this.aClass258_Sub1_1446 = GlTexture3D(var_ha_Sub2, 6410, 128, 128, 16, `is`, 6410)
            val class188 = var_ha_Sub2.aGlowPostProcessor_7736
            if (class188!!.method1414(35632)) {
                `is` = method461(false, WorldMapTextLabel.anObject8592, 53146732)
                this.aClass258_Sub1_1443 = GlTexture3D(var_ha_Sub2, 6408, 128, 128, 16)
                val class258_sub1 = GlTexture3D(var_ha_Sub2, 6409, 128, 128, 16, `is`, 6409)
                if (!class188.method1413(this.aClass258_Sub1_1443, class258_sub1, -114, 2.0f)) {
                    this.aClass258_Sub1_1443!!.method1952(-19948)
                    this.aClass258_Sub1_1443 = null
                } else this.aClass258_Sub1_1443!!.method1950(-82)
                class258_sub1.method1952(-19948)
            }
        } else {
            this.aClass258_Sub3Array1444 = arrayOfNulls<GlTexture2D>(16)
            for (i in 0..15) {
                val `is` = ObjectByteSerializerHolder.method1331(97.toByte(), GlShaderProgramHandle.anObject4177, 2 * (128 * i) * 128, 32768)
                this.aClass258_Sub3Array1444!![i] = GlTexture2D(var_ha_Sub2, 3553, 6410, 128, 128, true, `is`, 6410, false)
            }
            this.aClass258_Sub3Array1448 = arrayOfNulls<GlTexture2D>(16)
            for (i in 0..15) {
                val `is` = ObjectByteSerializerHolder.method1331(110.toByte(), MapElementDefinitionCache.anObject3985, 2 * i * 16384, 32768)
                this.aClass258_Sub3Array1448!![i] = GlTexture2D(var_ha_Sub2, 3553, 6410, 128, 128, true, `is`, 6410, false)
            }
        }
    }

    companion object {

        var aStringArray1441: Array<String?>? = arrayOfNulls<String>(200)

        var anInt1445: Int = 0

        var anInt1447: Int = 0
        @JvmStatic
        fun method815(bool: Boolean) {
            if (bool != false) method815(true)
            aStringArray1441 = null
        }

        var anInt6999: Int = 0
        fun method3030(i: Int, var_ha_Sub2: OpenGlRenderer) {
            anInt6999++
            if (GlShaderProgramHandle.anObject4177 == null) {
                val class59_sub1_sub2 = StaticNoiseTexture()
                val `is` = class59_sub1_sub2.method562(128, 128, 121.toByte(), 16)
                GlShaderProgramHandle.anObject4177 = Js5Archive.method1357(`is`, false, 81.toByte())
            }
            if (MapElementDefinitionCache.anObject3985 == null) {
                val class59_sub2_sub1 = CachedRgbNoiseTexture()
                val `is` = class59_sub2_sub1.method567(128, 111.toByte(), 16, 128)
                MapElementDefinitionCache.anObject3985 = Js5Archive.method1357(`is`, false, 103.toByte())
            }
            val class188 = var_ha_Sub2.aGlowPostProcessor_7736
            if (class188!!.method1414(35632) && WorldMapTextLabel.anObject8592 == null) {
                val `is` = method194(128, -1922, 8, 0.6f, 128, 4.0f, 4.0f, 0.5f, 16.0f, PerlinTextureProvider(419684), 16)
                WorldMapTextLabel.anObject8592 = Js5Archive.method1357(`is`, false, 78.toByte())
            }
        }

    }
}
