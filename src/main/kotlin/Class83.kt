import MinimapSquareDrawer.Companion.method461

/* Class83 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class83 internal constructor(var_ha_Sub2: OpenGlRenderer) {
    var aClass258_Sub1_1440: GlTexture3D? = null
    var aBoolean1442: Boolean
    var aClass258_Sub1_1443: GlTexture3D? = null
    var aClass258_Sub3Array1444: Array<GlTexture2D?>? = null
    var aClass258_Sub1_1446: GlTexture3D? = null
    var aClass258_Sub3Array1448: Array<GlTexture2D?>? = null

    init {
        this.aBoolean1442 = var_ha_Sub2.aBoolean7831
        HashTableContainer.method3030(8, var_ha_Sub2)
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
        @JvmField
        var aStringArray1441: Array<String?>? = arrayOfNulls<String>(200)
        @JvmField
        var anInt1445: Int = 0
        @JvmField
        var anInt1447: Int = 0
        @JvmStatic
        fun method815(bool: Boolean) {
            if (bool != false) method815(true)
            aStringArray1441 = null
        }
    }
}
