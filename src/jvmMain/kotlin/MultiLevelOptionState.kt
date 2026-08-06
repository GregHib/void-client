/* Class239_Sub29 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MultiLevelOptionState : GraphicsOptionState {
    fun method1848(i: Int): Int {
        if (i != -32350) method1714(100, 29)
        anInt6145++
        return this.anInt3138
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        anInt6153++
        if (i != 20014) method1716(true)
        return 0
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1712(i: Int, i_0_: Int) {
        val i_1_ = -10 / ((i - 82) / 35)
        this.anInt3138 = i_0_
        anInt6148++
    }

    override fun method1714(i: Int, i_10_: Int): Int {
        anInt6146++
        if (i != 3) aBoolean6147 = false
        return 1
    }

    override fun method1716(bool: Boolean) {
        if (this.anInt3138 < 0 || this.anInt3138 > 4) this.anInt3138 = method1710(20014)
        anInt6150++
        if (bool != false) anInt6151 = 62
    }

    companion object {

        var anInt6144: Int = 0

        var anInt6145: Int = 0

        var anInt6146: Int = 0

        var aBoolean6147: Boolean = false

        var anInt6148: Int = 0

        var anInt6149: Int = 0

        var anInt6150: Int = 0

        var anInt6151: Int = 0

        var anInt6152: Int = 0

        var anInt6153: Int = 0

        @JvmStatic
        fun method1849(c: Char, i: Int): Boolean {
            anInt6149++
            if (Character.isISOControl(c)) return false
            if (Npc.method2446(c, 105.toByte())) return true
            val cs = MapSceneDefLoader.aCharArray2488!!
            var i_2_ = 0
            while (cs.size > i_2_) {
                val i_3_ = cs[i_2_].code
                if (c.code == i_3_) return true
                i_2_++
            }
            val i_4_ = -127 / ((i - 44) / 45)
            val cs_5_ = ParserSpecialCharsHolder.aCharArray1903!!
            var i_6_ = 0
            while (cs_5_.size > i_6_) {
                val i_7_ = cs_5_[i_6_].code
                if (i_7_ == c.code) return true
                i_6_++
            }
            return false
        }

        @JvmStatic
        fun method1850(i: Int, i_8_: Int): Int {
            anInt6144++
            val i_9_ = 101 % ((-20 - i_8_) / 37)
            return i ushr 8
        }

        @JvmStatic
        fun method1851(i: Byte) {
            anInt6152++
            for (i_11_ in 0..4) MinimapStateReset.aBooleanArray2374!![i_11_] = false
            TextureAtlasStateStatics.anInt4424 = CompositeRgbNoiseTexture.anInt8685
            DataHolderStatics.anInt3662 = MinimapAreaMarkerNode.anInt9701
            SpriteComponent.anInt8368 = ParticleSystemRenderer.anInt3855
            FloatBuffer.anInt9751 = GlGroundShaderPass.anInt7396
            SequencedWallEntity.anInt10163 = -1
            NativeLibraryState.anInt167 = SequencedWallEntity.anInt10163
            SequencedGroundDecor.anInt10047 = GlslMaterialPass.anInt6246
            val i_12_ = -99 % ((i - 11) / 56)
            BloomGraphicsOptionState.anInt5973 = 0
            CameraConfigDefinition.anInt3253 = WorldMapElement.anInt4638
            GlGroundShaderPass.anInt7403 = 0
            WeaveTextureNode.anInt9282 = 5
            NativeShaderProgram.anInt9775 = -1
            MapArchiveSource.anInt4803 = -1
        }
    }
}
