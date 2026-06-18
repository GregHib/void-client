/* aa_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NativeSprite(var_ha_Sub2: OpenGlRenderer?, i: Int, i_1_: Int, `is`: ByteArray?) : Sprite() {
    @JvmField
    var aClass258_Sub3_Sub1_5193: GlTexture2DRegion? = null

    init {
        try {
            this.aClass258_Sub3_Sub1_5193 = CubemapTextureFactory.method3583(false, `is`, 6406, i_1_, var_ha_Sub2, -119, 6406, i)
            this.aClass258_Sub3_Sub1_5193!!.method1965(false, false, 10243)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("ag.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var aTerrainTileArray5191: Array<TerrainTile?>? = null
        @JvmField
        var anIntArray5192: IntArray? = null
        @JvmStatic
        fun method161(i: Int) {
            val i_0_ = -70 / ((i - 42) / 48)
            aTerrainTileArray5191 = null
            anIntArray5192 = null
        }
    }
}
