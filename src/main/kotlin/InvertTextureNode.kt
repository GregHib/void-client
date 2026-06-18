import Class373_Sub2.Companion.method3607

/* Class348_Sub40_Sub32 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class InvertTextureNode : AbstractProceduralTextureNode(1, false) {
    override fun method3047(i: Int, i_9_: Int): Array<IntArray?>? {
        if (i_9_ != -1564599039) method3133(4.toByte())
        anInt9417++
        val `is` = this.aImageFrameCache_7033!!.method2557(-78, i)!!
        if (this.aImageFrameCache_7033!!.aBoolean4035) {
            val is_10_ = this.method3039((-104).toByte(), i, 0)!!
            val is_11_ = is_10_[0]!!
            val is_12_ = is_10_[1]!!
            val is_13_ = is_10_[2]!!
            val is_14_ = `is`[0]!!
            val is_15_ = `is`[1]!!
            val is_16_ = `is`[2]!!
            var i_17_ = 0
            while (DisplaceTextureNode.Companion.anInt9139 > i_17_) {
                is_14_[i_17_] = -is_11_[i_17_] + 4096
                is_15_[i_17_] = 4096 + -is_12_[i_17_]
                is_16_[i_17_] = -is_13_[i_17_] + 4096
                i_17_++
            }
        }
        return `is`
    }

    override fun method3042(i: Int, i_18_: Int): IntArray {
        anInt9420++
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (i_18_ != 255) method3047(-113, -46)
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) {
            val is_19_ = this.method3048(i, 633706337, 0)!!
            var i_20_ = 0
            while ((i_20_ < DisplaceTextureNode.Companion.anInt9139)) {
                `is`[i_20_] = 4096 + -is_19_[i_20_]
                i_20_++
            }
        }
        return `is`
    }

    override fun method3049(class348_sub49: Buffer, i: Int, i_21_: Int) {
        anInt9414++
        if (i_21_ != 31015) aBoundsConstraintEntry_9415 = null
        if (i == 0) this.aBoolean7045 = class348_sub49.readUnsignedByte(255) == 1
    }

    companion object {
        @JvmField
        var anInt9414: Int = 0
        @JvmField
        var aBoundsConstraintEntry_9415: BoundsConstraintEntry? = BoundsConstraintEntry("", 12)
        @JvmField
        var anInt9416: Int = 0
        @JvmField
        var anInt9417: Int = 0
        @JvmField
        var anInt9418: Int = 0
        @JvmField
        var anInt9419: Int = 0
        @JvmField
        var anInt9420: Int = 0
        private var aShortArray9421: ShortArray? = shortArrayOf(-10304, 9104, 25485, 4620, 4540)
        private var aShortArray9422: ShortArray? = shortArrayOf(-1, -1, -1, -1, -1)
        private var aShortArray9423: ShortArray? = shortArrayOf(6798, 8741, 25238, 4626, 4550)
        @JvmField
        var aShortArrayArray9424: Array<ShortArray?>? = arrayOf<ShortArray?>(aShortArray9423, aShortArray9421, aShortArray9422)

        @JvmStatic
        fun method3132(`is`: IntArray?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, var_ha_Sub2: OpenGlRenderer?, bool: Boolean, i_3_: Byte): GlTexture2DRegion {
            try {
                if (i_3_.toInt() != 12) method3134(9)
                anInt9418++
                if (!var_ha_Sub2!!.aBoolean7793 && (!AsyncTaskHandle.method1436(-74, i_2_) || !AsyncTaskHandle.method1436(127, i_1_))) {
                    if (!var_ha_Sub2.aBoolean7837) return (GlTexture2DRegion(var_ha_Sub2, i_2_, i_1_, CacheArchiveIndexLoader.method340(i_2_, 108.toByte()), CacheArchiveIndexLoader.method340(i_1_, 108.toByte()), `is`))
                    return GlTexture2DRegion(var_ha_Sub2, 34037, i_2_, i_1_, bool, `is`, i_0_, i)
                }
                return GlTexture2DRegion(var_ha_Sub2, 3553, i_2_, i_1_, bool, `is`, i_0_, i)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatch.method2929(runtimeexception, ("wi.C(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + bool + ',' + i_3_ + ')'))
            }
        }

        @JvmStatic
        fun method3133(i: Byte) {
            aBoundsConstraintEntry_9415 = null
            if (i.toInt() != -109) aBoundsConstraintEntry_9415 = null
            aShortArray9423 = null
            aShortArray9421 = null
            aShortArrayArray9424 = null
            aShortArray9422 = null
        }

        @JvmStatic
        fun method3134(i: Int) {
            anInt9419++
            if ((TexGenMaterialPass.anInt6248.inv()) <= i) {
                val l = Class62.method599(i xor 0x3c)
                TexGenMaterialPass.anInt6248 -= (-AnimationFrameDefinition.aLong6963 + l).toInt()
                if (TexGenMaterialPass.anInt6248 > 0) {
                    val i_4_ = ((TexGenMaterialPass.anInt6248 shl 8) / FrameBufferObject.anInt4889)
                    val i_5_ = -i_4_ + 255
                    val f = i_4_.toFloat() / 255.0f
                    val f_6_ = 1.0f - f
                    NativeIndexBuffer.anInt4703 = (((i_5_ * ((WaterDetailOptionState.aModelLightingConfig_5990!!.anInt2540) and 0xff00ff) + (GroundDecorEntity.anInt8739 and 0xff00ff) * i_4_) and 0xff00ff.inv()) - -(0xff0000 and (i_4_ * (0xff00 and GroundDecorEntity.anInt8739) + (0xff00 and (WaterDetailOptionState.aModelLightingConfig_5990!!.anInt2540)) * i_5_))) ushr 8
                    RangedGraphicsOptionState.aFloat5945 = (GlTexture1D.aFloat8560 + f_6_ * ((WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2551) - GlTexture1D.aFloat8560))
                    ModelVertexColorBuffer.aFloat6586 = (WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2545 - Class45.aFloat670) * f_6_ + Class45.aFloat670
                    AnimationFrameTable.anInt486 = (i_4_ * NoOpGraphicsOptionState.anInt6042 + (WaterDetailOptionState.aModelLightingConfig_5990!!.anInt2546 * i_5_)) shr 8
                    KeyboardLayoutConfig.aFloat2137 = (TileSceneEntity.aFloat8725 + (-TileSceneEntity.aFloat8725 + (WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2547)) * f_6_)
                    TextureMetadataProvider.aFloat4626 = (Class64.aFloat1136 + f_6_ * ((WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2544) - Class64.aFloat1136))
                    LocTypeDefLoader.anInt2500 = (((i_4_ * (0xff00 and DelegatingRenderCanvas.anInt70) + (0xff00 and (WaterDetailOptionState.aModelLightingConfig_5990!!.anInt2549)) * i_5_) and 0xff0000) + (0xff00ff.inv() and (i_4_ * (0xff00ff and DelegatingRenderCanvas.anInt70) - -(i_5_ * (0xff00ff and (WaterDetailOptionState.aModelLightingConfig_5990!!.anInt2549)))))) ushr 8
                    CollisionMap.aFloat4455 = (ParticleEmitterFactory.aFloat3177 + f_6_ * (-ParticleEmitterFactory.aFloat3177 + (WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2536)))
                    NormalMapGenerator.aFloat3462 = (DebugOverlayRenderer.aFloat3172 + (WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2542 - DebugOverlayRenderer.aFloat3172) * f_6_)
                    if (SceneryDetailOptionState.aCircleRasterizer_6098 !== (WaterDetailOptionState.aModelLightingConfig_5990!!.aCircleRasterizer_2541)) HeapInfoRecord.aCircleRasterizer_4938 = (Class60.aRenderer1098!!.method3706(SceneryDetailOptionState.aCircleRasterizer_6098, (WaterDetailOptionState.aModelLightingConfig_5990!!.aCircleRasterizer_2541), f_6_, HeapInfoRecord.aCircleRasterizer_4938))
                } else {
                    HeapInfoRecord.aCircleRasterizer_4938 = (WaterDetailOptionState.aModelLightingConfig_5990!!.aCircleRasterizer_2541)
                    TextureMetadataProvider.aFloat4626 = WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2544
                    ModelVertexColorBuffer.aFloat6586 = WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2545
                    RangedGraphicsOptionState.aFloat5945 = WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2551
                    AnimationFrameTable.anInt486 = WaterDetailOptionState.aModelLightingConfig_5990!!.anInt2546
                    NormalMapGenerator.aFloat3462 = WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2542
                    CollisionMap.aFloat4455 = WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2536
                    TexGenMaterialPass.anInt6248 = -1
                    LocTypeDefLoader.anInt2500 = WaterDetailOptionState.aModelLightingConfig_5990!!.anInt2549
                    NativeIndexBuffer.anInt4703 = WaterDetailOptionState.aModelLightingConfig_5990!!.anInt2540
                    KeyboardLayoutConfig.aFloat2137 = WaterDetailOptionState.aModelLightingConfig_5990!!.aFloat2547
                }
                AnimationFrameDefinition.aLong6963 = l
            }
        }

        @JvmStatic
        fun method3135(i: Int, i_7_: Int, i_8_: Int): WallEntity? {
            val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_7_]!![i_8_]
            if (class357 == null) return null
            return class357.aClass318_Sub1_Sub5_4395
        }

        fun method3136(i: Byte, class348_sub49: Buffer?): String {
            anInt9416++
            if (i.toInt() != 64) aShortArray9423 = null
            return method3607(32767, class348_sub49, -77)
        }
    }
}
