/* Class286_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FixedFunctionMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer) : MaterialPass(var_ha_Sub2) {
    override fun method2133(i: Int) {
        if (i < -75) {
            this.aHa_Sub2_3684.method3804(false, (-61).toByte())
            anInt6211++
        }
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_5_: Int) {
        anInt6206++
        this.aHa_Sub2_3684.method3771((-80).toByte(), glTexture)
        if (i >= -89) method2136(-67, -39, 18.toByte())
        this.aHa_Sub2_3684.method3761(0, i_5_)
    }

    override fun method2136(i: Int, i_7_: Int, i_8_: Byte) {
        anInt6209++
        if (i_8_ > -42) method2133(35)
    }

    override fun method2137(i: Int): Boolean {
        anInt6208++
        if (i > -5) anInt6212 = 1
        return true
    }

    override fun method2134(bool: Boolean, bool_9_: Boolean) {
        this.aHa_Sub2_3684.method3804(true, (-83).toByte())
        if (bool_9_ != false) method2136(-78, 73, 12.toByte())
        anInt6204++
    }

    override fun method2139(bool: Boolean, i: Byte) {
        val i_10_ = 23 / ((-60 - i) / 38)
        anInt6207++
    }

    companion object {
        @JvmField
        var anInt6203: Int = 0
        @JvmField
        var anInt6204: Int = 0
        @JvmField
        var aStringArray6205: Array<String?>? = arrayOfNulls<String>(200)
        @JvmField
        var anInt6206: Int = 0
        @JvmField
        var anInt6207: Int = 0
        @JvmField
        var anInt6208: Int = 0
        @JvmField
        var anInt6209: Int = 0
        @JvmField
        var anInt6210: Int = 0
        @JvmField
        var anInt6211: Int = 0
        @JvmField
        var anInt6212: Int = 0
        @JvmField
        var anInt6213: Int = 0

        @JvmStatic
        fun method2144(string: String?, i: Int, i_0_: Byte, i_1_: Int, string_2_: String?, string_3_: String?, string_4_: String?) {
            do {
                try {
                    TrackedGroundDecor.method2477(string, string_2_, (-110).toByte(), -1, string_3_, null, i, i_1_, string_4_)
                    anInt6203++
                    if (i_0_ < -86) break
                    aStringArray6205 = null
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatch.method2929(runtimeexception, ("di.G(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (string_2_ != null) "{...}" else "null") + ',' + (if (string_3_ != null) "{...}" else "null") + ',' + (if (string_4_ != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method2145(i: Int) {
            anInt6210++
            LocConfigModelBuilder.anInt4494++
            val class348_sub47: OutgoingPacketNode = WaterMaterialPass.Companion.method2148(GrayscaleNoiseTexture.aFontMetaRef_5288, TheoraVideoStream.aIsaacCipher_9029, -124)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, ContactEntry.method3229(-96))
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), LocTypeDefinition.anInt4017)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), HardCacheEntryReference.anInt10432)
            if (i != -24498) aStringArray6205 = null
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(-32350))
            InterfaceComponentGroup.method3243(-101, class348_sub47)
        }

        @JvmStatic
        fun method2146(i: Byte) {
            val i_6_ = 34 % ((i - 32) / 38)
            anInt6213++
            MinimapAreaMarkerNode.method3277((-48).toByte())
            ScrollbarComponent.aBoolean8335 = false
            MinimapRectClipper.method226(GlArrayBufferObject.anInt4717, SceneTileBounds.anInt1117, ProceduralTextureGraph.anInt9532, 0, WorldMapSceneSoftware.anInt5819)
        }

        @JvmStatic
        fun method2147(i: Int) {
            if (i != -1) anInt6212 = -79
            aStringArray6205 = null
        }
    }
}
