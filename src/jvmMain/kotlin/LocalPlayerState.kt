/* Class132 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object LocalPlayerState {
    var anInt1905: Int = 4
    @JvmField
    var anInt1906: Int
    @JvmField
    var aPlayer_1907: Player? = null
    var anInt1908: Int = 0
    @JvmField
    var anIntArray1909: IntArray? = null
    @JvmField
    var anInt1910: Int = 0
    var anInt1911: Int = 7000

    @JvmStatic
    fun method1137(i: Int) {
        if (i != 3) method1138(null, true, null, 70.toByte())
        anIntArray1909 = null
        aPlayer_1907 = null
    }

    @JvmStatic
    fun method1138(string: String?, bool: Boolean, string_0_: String?, i: Byte) {
        try {
            anInt1908++
            OpenGlModel.aString5600 = string
            TextureGenerator.aString2496 = string_0_
            ProjectedGroundDecor.aBoolean10238 = bool
            if (!ProjectedGroundDecor.aBoolean10238 && (OpenGlModel.aString5600 == "" || TextureGenerator.aString2496 == "")) GlRectangleTexture.method254(3, (-100).toByte())
            else {
                val i_1_ = 34 % ((16 - i) / 55)
                if (BloomGraphicsOptionState.anInt5969 != 1) {
                    SceneTileBounds.anInt1121 = 0
                    ConfigShortValueNode.anInt9541 = -1
                }
                AbstractMenuEntry.aBoolean1712 = false
                GlRectangleTexture.method254(-3, (-94).toByte())
                NpcDefinition.anInt2955 = 1
                SceneRegionState.anInt197 = 0
                GroundDecorSceneEntity.anInt9971 = 0
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("nr.A(" + (if (string != null) "{...}" else "null") + ',' + bool + ',' + (if (string_0_ != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    init {
        anInt1906 = anInt1911
    }
}
