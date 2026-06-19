/* aa_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class IndexedSprite : Sprite {
    @JvmField
    var anInterface18_Impl3_5196: Renderable2dTexture? = null

    constructor(var_ha_Sub3: NativeRenderer?, i: Int, i_16_: Int, `is`: ByteArray?) {
        try {
            this.anInterface18_Impl3_5196 = var_ha_Sub3!!.method3944(`is`, i, GlFontTextured.aTextureFormatInfo_9471, 2, false, i_16_)
            this.anInterface18_Impl3_5196!!.method66(false, false, 25688)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("lp.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_16_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    constructor(var_ha_Sub3: NativeRenderer?, i: Int, i_17_: Int, `is`: IntArray?) {
        try {
            this.anInterface18_Impl3_5196 = var_ha_Sub3!!.method3839(i_17_, i, -15137, false, `is`)
            this.anInterface18_Impl3_5196!!.method66(false, false, 25688)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("lp.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_17_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt5194: Int = 0
        @JvmField
        var aStringArray5197: Array<String?>? = arrayOfNulls<String>(100)
        @JvmField
        var aServerConnectionInfo_5199: ServerConnectionInfo? = null

        @JvmStatic
        fun method162(i: Byte) {
            aStringArray5197 = null
            if (i >= -67) aServerConnectionInfo_5199 = null
            aServerConnectionInfo_5199 = null
        }



        @JvmStatic
        fun method165(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Byte, i_13_: Int, i_14_: Int) {
            anInt5194++
            if (i_9_ < 512 || i_11_ < 512 || (-2 + GlCubemapLightPass.anInt7319) * 512 < i_9_ || (-2 + RangeThresholdTextureNode.anInt9109) * 512 < i_11_) {
                RemoveRoofsOptionState.anIntArray6062!![1] = -1
                RemoveRoofsOptionState.anIntArray6062!![0] = RemoveRoofsOptionState.anIntArray6062!![1]
            } else if (i_12_ >= 22) {
                val i_15_ = CollisionMapAccessor.method2064(i_9_, i, 11219, i_11_) - i_7_
                if (GrayscaleNoiseTexture.aBoolean5300) IndexedSprite.method1010(false, true)
                else {
                    SettingsCrcWriter.aAbstractCameraTransform_2123!!.method891(i_10_, 0, 0)
                    FacingDirectionNode.aRenderer6654!!.method3638(SettingsCrcWriter.aAbstractCameraTransform_2123)
                }
                if (!ParticleSystemRenderer.aBoolean3870) FacingDirectionNode.aRenderer6654!!.da(i_9_, i_15_, i_11_, RemoveRoofsOptionState.anIntArray6062)
                else FacingDirectionNode.aRenderer6654!!.HA(i_9_, i_15_, i_11_, LocalPlayerState.anInt1906, RemoveRoofsOptionState.anIntArray6062)
                if (GrayscaleNoiseTexture.aBoolean5300) GlVertexBufferArb.method2129(60.toByte())
                else {
                    SettingsCrcWriter.aAbstractCameraTransform_2123!!.method891(-i_10_, 0, 0)
                    FacingDirectionNode.aRenderer6654!!.method3638(SettingsCrcWriter.aAbstractCameraTransform_2123)
                }
            }
        }

        var anInt1642: Int = 0
        fun method1010(bool: Boolean, bool_42_: Boolean) {
            RenderNodeStatics.aAbstractCameraTransform_9720!!.method898(CameraRotationStub.aRenderer326!!.method3640())
            anInt1642++
            val `is` = CameraRotationStub.aRenderer326!!.Y()
            Gl3dTexture.anInt8630 = `is`[2]
            MediaStreamClient.anInt3202 = `is`[0]
            ProjectileConfigUtil.anInt394 = `is`[3]
            SimpleToggleOptionState.anInt5886 = `is`[1]
            if (bool_42_) {
                CameraRotationStub.aRenderer326!!.DA(AnimationFrameState.anInt1537, SceneTextLabel.anInt6417, TextureHandle.anInt2590, FireParticleStream.anInt1879)
                RenderNodeStatics.method3284(true, ModelWallEntity.aDouble10120)
            } else {
                CameraRotationStub.aRenderer326!!.DA(ConfigValueProvider.anInt4910, ShaderStateVariant.anInt8799, TexGenMaterialPass.anInt6255, FireParticleStream.anInt95)
                RenderNodeStatics.method3284(true, GlCubeMapTexture.aDouble8621)
            }
        }
    }
}
