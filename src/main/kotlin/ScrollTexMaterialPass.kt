import BrightnessOptionState.Companion.method1745
import GlVertexBufferArb.Companion.method2127
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glPopMatrix
import jaggl.OpenGL.Companion.glPushMatrix
import jaggl.OpenGL.Companion.glScalef
import jaggl.OpenGL.Companion.glTexEnvf
import jaggl.OpenGL.Companion.glTexGenfv
import jaggl.OpenGL.Companion.glTexGeni

class ScrollTexMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer, class83: Class83?) : MaterialPass(var_ha_Sub2) {
    private val aClass83_6278: Class83?
    private var aClass61_6284: Class61? = null
    private var aClass258_Sub4_6285: GlTexture1D? = null
    override fun method2136(i: Int, i_3_: Int, i_4_: Byte) {
        if (i_4_ >= -42) aClass258_Sub4_6285 = null
        if ((0x1 and i) == 1) {
            if (aClass83_6278!!.aBoolean1442) {
                this.aHa_Sub2_3684.method3771((-83).toByte(), aClass83_6278.aClass258_Sub1_1440)
                KeyboardLayoutConfig.aFloatArray2131!![2] = 0.0f
                KeyboardLayoutConfig.aFloatArray2131!![3] = ((this.aHa_Sub2_3684.anInt7735) % 4000).toFloat() / 4000.0f
                KeyboardLayoutConfig.aFloatArray2131!![0] = 0.0f
                KeyboardLayoutConfig.aFloatArray2131!![1] = 0.0f
                glTexGenfv(8194, 9473, KeyboardLayoutConfig.aFloatArray2131, 0)
            } else {
                val i_5_ = (16 * (this.aHa_Sub2_3684.anInt7735 % 4000) / 4000)
                this.aHa_Sub2_3684.method3771((-95).toByte(), aClass83_6278.aClass258_Sub3Array1444!![i_5_])
            }
        } else if (aClass83_6278!!.aBoolean1442) {
            this.aHa_Sub2_3684.method3771((-126).toByte(), (aClass83_6278.aClass258_Sub1_1440))
            KeyboardLayoutConfig.aFloatArray2131!![0] = 0.0f
            KeyboardLayoutConfig.aFloatArray2131!![2] = 0.0f
            KeyboardLayoutConfig.aFloatArray2131!![1] = 0.0f
            KeyboardLayoutConfig.aFloatArray2131!![3] = 0.0f
            glTexGenfv(8194, 9473, KeyboardLayoutConfig.aFloatArray2131, 0)
        } else this.aHa_Sub2_3684.method3771((-110).toByte(), aClass83_6278.aClass258_Sub3Array1444!![0])
        anInt6291++
    }

    override fun method2134(bool: Boolean, bool_6_: Boolean) {
        if (this.aHa_Sub2_3684.anInt7782 > 0) {
            val f = -0.5f / (this.aHa_Sub2_3684.anInt7782).toFloat()
            this.aHa_Sub2_3684.method3738(-15039, 1)
            KeyboardLayoutConfig.aFloatArray2131!![3] = 0.25f + (this.aHa_Sub2_3684.aFloat7792) * f
            KeyboardLayoutConfig.aFloatArray2131!![0] = 0.0f
            KeyboardLayoutConfig.aFloatArray2131!![2] = f
            KeyboardLayoutConfig.aFloatArray2131!![1] = 0.0f
            glPushMatrix()
            glLoadIdentity()
            glTexGenfv(8192, 9474, KeyboardLayoutConfig.aFloatArray2131, 0)
            glPopMatrix()
            this.aHa_Sub2_3684.method3744(this.aHa_Sub2_3684.anInt7782.toFloat(), 770, 0.5f)
            this.aHa_Sub2_3684.method3771((-99).toByte(), aClass258_Sub4_6285)
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
        anInt6286++
        aClass61_6284!!.method594('\u0000', 28666)
        glMatrixMode(5890)
        glPushMatrix()
        if (bool_6_ == false) {
            glScalef(0.25f, 0.25f, 1.0f)
            glMatrixMode(5888)
        }
    }

    private fun method2167(i: Int) {
        aClass61_6284 = Class61(this.aHa_Sub2_3684, 2)
        anInt6283++
        aClass61_6284!!.method595(109.toByte(), 0)
        this.aHa_Sub2_3684.method3738(i + 6366, 1)
        this.aHa_Sub2_3684.method3729(7681, 98.toByte(), 260)
        this.aHa_Sub2_3684.method3762(34168, 768, (-87).toByte(), 0)
        glTexGeni(8192, 9472, 9216)
        glEnable(3168)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        glTexEnvf(8960, 34163, 2.0f)
        if (aClass83_6278!!.aBoolean1442) {
            glTexGeni(8194, 9472, 9217)
            glTexGeni(8195, 9472, 9217)
            glTexGenfv(8195, 9473, floatArrayOf(0.0f, 0.0f, 0.0f, 1.0f), 0)
            glEnable(3170)
            glEnable(3171)
        }
        aClass61_6284!!.method591(-1)
        aClass61_6284!!.method595(117.toByte(), 1)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        if (i != -21405) method2137(-18)
        this.aHa_Sub2_3684.method3729(8448, (-115).toByte(), 8448)
        this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
        glDisable(3168)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        glTexEnvf(8960, 34163, 1.0f)
        if (aClass83_6278.aBoolean1442) {
            glDisable(3170)
            glDisable(3171)
        }
        aClass61_6284!!.method591(i + 21404)
    }

    init {
        try {
            aClass83_6278 = class83
            method2167(-21405)
            aClass258_Sub4_6285 = GlTexture1D(this.aHa_Sub2_3684, 6406, 2, byteArrayOf(0, -1), 6406)
            aClass258_Sub4_6285!!.method1972((-91).toByte(), false)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("tn.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (class83 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method2137(i: Int): Boolean {
        anInt6288++
        if (i > -5) return true
        return true
    }

    override fun method2133(i: Int) {
        aClass61_6284!!.method594('\u0001', 28666)
        anInt6282++
        if (this.aHa_Sub2_3684.anInt7782 > 0) {
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-115).toByte(), null)
            this.aHa_Sub2_3684.method3744(0.0f, 770, 1.0f)
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
        if (i > -75) aClass258_Sub4_6285 = null
        this.aHa_Sub2_3684.method3729(8448, 102.toByte(), 8448)
        glMatrixMode(5890)
        glPopMatrix()
        glMatrixMode(5888)
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_9_: Int) {
        if (i < -89) anInt6280++
    }

    override fun method2139(bool: Boolean, i: Byte) {
        this.aHa_Sub2_3684.method3729(260, (-94).toByte(), 8448)
        anInt6279++
        val i_18_ = 107 % ((-60 - i) / 38)
    }

    companion object {
        @JvmField
        var aClass45_6277: Class45? = null
        @JvmField
        var anInt6279: Int = 0
        @JvmField
        var anInt6280: Int = 0
        @JvmField
        var anInt6281: Int = 0
        @JvmField
        var anInt6282: Int = 0
        @JvmField
        var anInt6283: Int = 0
        @JvmField
        var anInt6286: Int = 0
        @JvmField
        var anInt6287: Int = 0
        @JvmField
        var anInt6288: Int = 0
        @JvmField
        var aBoolean6289: Boolean = false
        @JvmField
        var anIntArray6290: IntArray? = IntArray(2048)
        @JvmField
        var anInt6291: Int = 0

        @JvmStatic
        fun method2165(bool: Boolean, string: String?) {
            var string = string
            anInt6287++
            if (string != null) {
                if (string.startsWith("*")) string = string.substring(1)
                val string_0_ = method2127(2, string)
                if (string_0_ != null) {
                    var i = 0
                    while ((HslAdjustTextureNode.anInt9383 > i)) {
                        var string_1_ = Class83.aStringArray1441!![i]
                        if (string_1_!!.startsWith("*")) string_1_ = string_1_.substring(1)
                        string_1_ = method2127(2, string_1_)
                        if (string_1_ != null && string_1_ == string_0_) {
                            HslAdjustTextureNode.anInt9383--
                            for (i_2_ in i..<HslAdjustTextureNode.anInt9383) {
                                Class83.aStringArray1441!![i_2_] = Class83.aStringArray1441!![i_2_ - -1]
                                FixedFunctionMaterialPass.Companion.aStringArray6205!![i_2_] = FixedFunctionMaterialPass.Companion.aStringArray6205!![1 + i_2_]
                                Renderer.anIntArray4578!![i_2_] = Renderer.anIntArray4578!![i_2_ - -1]
                                GlBufferObject.aStringArray4744!![i_2_] = GlBufferObject.aStringArray4744!![1 + i_2_]
                                NpcCountAccessor.anIntArray2280!![i_2_] = NpcCountAccessor.anIntArray2280!![i_2_ - -1]
                                ObjectSpawnDecoder.aBooleanArray1806!![i_2_] = ObjectSpawnDecoder.aBooleanArray1806!![1 + i_2_]
                            }
                            Crc64Hashable.anInt4985 = ResourceLoaderThread.anInt3918
                            ConfigShortValueNode.anInt9540++
                            val class348_sub47: OutgoingPacketNode = WaterMaterialPass.Companion.method2148(SceneCollisionEntry.aFontMetaRef_4394, (TheoraVideoStream.aClass77_9029), -99)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                            InterfaceComponentGroup.method3243(117, class348_sub47)
                            break
                        }
                        i++
                    }
                    if (bool != true) aBoolean6289 = true
                }
            }
        }

        @JvmStatic
        fun method2166(i: Int) {
            if (i == 6336) {
                aClass45_6277 = null
                anIntArray6290 = null
            }
        }

        @JvmStatic
        fun method2168(i: Int, i_7_: Int, i_8_: Int) {
            val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_7_]!![i_8_]
            if (class357 != null) {
                ParticleDefLoader.method1376(class357.aClass318_Sub1_Sub5_4395)
                ParticleDefLoader.method1376(class357.aClass318_Sub1_Sub5_4407)
                if (class357.aClass318_Sub1_Sub5_4395 != null) class357.aClass318_Sub1_Sub5_4395 = null
                if (class357.aClass318_Sub1_Sub5_4407 != null) class357.aClass318_Sub1_Sub5_4407 = null
            }
        }

        @JvmStatic
        fun method2169(i: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, bool: Boolean): Boolean {
            var i = i
            var i_10_ = i_10_
            var i_11_ = i_11_
            var i_12_ = i_12_
            var i_13_ = i_13_
            var i_14_ = i_14_
            var i_15_ = i_15_
            var i_16_ = i_16_
            var i_17_ = i_17_
            anInt6281++
            if (!ModelLightingConfig.method1422(i_16_, i_11_, i, -7596)) return false
            i_16_ = SequencedWallEntity.anIntArray10172!![1]
            i = SequencedWallEntity.anIntArray10172!![0]
            i_11_ = SequencedWallEntity.anIntArray10172!![2]
            if (!ModelLightingConfig.method1422(i_15_, i_17_, i_10_, -7596)) return false
            i_10_ = SequencedWallEntity.anIntArray10172!![0]
            i_17_ = SequencedWallEntity.anIntArray10172!![2]
            i_15_ = SequencedWallEntity.anIntArray10172!![1]
            if (!ModelLightingConfig.method1422(i_14_, i_13_, i_12_, -7596)) return false
            i_13_ = SequencedWallEntity.anIntArray10172!![2]
            if (bool != false) return false
            i_14_ = SequencedWallEntity.anIntArray10172!![1]
            i_12_ = SequencedWallEntity.anIntArray10172!![0]
            return TextureMapImageNode.method3125(i_12_, i_16_, i_10_, i_13_, i_17_, (-76).toByte(), i_15_, i_11_, i, i_14_)
        }
    }
}
