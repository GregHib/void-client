/* Class5_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SolidFillComponent internal constructor(js5Archive: Js5Archive, js5Archive_12_: Js5Archive, class369_sub2: WorldMapTextLabel) : WorldMapElement(js5Archive, js5Archive_12_, class369_sub2) {
    public override fun method178(i: Int, bool: Boolean, i_16_: Byte, i_17_: Int) {
        FacingDirectionNode.aRenderer6654!!.method3628(-2 + i, i_17_, 4 + this.aWorldMapLabel_4635!!.anInt4971, 2 + this.aWorldMapLabel_4635!!.anInt4963, ((this.aWorldMapLabel_4635 as WorldMapTextLabel).anInt8585), 0)
        anInt8360++
        FacingDirectionNode.aRenderer6654!!.method3628(i - 1, 1 + i_17_, this.aWorldMapLabel_4635!!.anInt4971 - -2, this.aWorldMapLabel_4635!!.anInt4963, 0, 0)
        if (i_16_ > -6) aIntRange_8365 = null
    }

    public override fun method182(i: Int, i_18_: Int, i_19_: Int, bool: Boolean) {
        anInt8355++
        val i_20_ = -110 / ((-20 - i) / 57)
        val i_21_ = (this.method183(116) * this.aWorldMapLabel_4635!!.anInt4971 / 10000)
        FacingDirectionNode.aRenderer6654!!.aa(i_19_, 2 + i_18_, i_21_, (this.aWorldMapLabel_4635!!.anInt4963) - 2, (this.aWorldMapLabel_4635 as WorldMapTextLabel).anInt8591, 0)
        FacingDirectionNode.aRenderer6654!!.aa(i_21_ + i_19_, 2 + i_18_, this.aWorldMapLabel_4635!!.anInt4971 - i_21_, this.aWorldMapLabel_4635!!.anInt4963 - 2, 0, 0)
    }

    companion object {
        @JvmField
        var anInt8353: Int = 0
        @JvmField
        var anInt8354: Int = 0
        @JvmField
        var anInt8355: Int = 0
        @JvmField
        var aBoundsConstraintEntry_8356: BoundsConstraintEntry? = BoundsConstraintEntry("", 11)
        @JvmField
        var anInt8357: Int = 0
        @JvmField
        var anInt8358: Int = 0
        @JvmField
        var anInt8359: Int = 0
        @JvmField
        var anInt8360: Int = 0
        @JvmField
        var aBooleanArrayArrayArray8361: Array<Array<BooleanArray?>?>? = null
        @JvmField
        var anInt8362: Int = 0
        @JvmField
        var anInt8363: Int = 0
        @JvmField
        var anInt8364: Int = 0
        @JvmField
        var aIntRange_8365: IntRange? = IntRange(30, -1)

        @JvmStatic
        fun method191(bool: Boolean, i: Int, i_0_: Int) {
            if (NpcEntityUpdater.anInt3655 != 1) {
                if (NpcEntityUpdater.anInt3655 == 2) {
                    if (!GrayscaleNoiseTexture.aBoolean5300) TextureFormatInfo.method2291((-127).toByte(), i, i_0_)
                    else TextureFormatInfo.method2291((-122).toByte(), i + NativeTerrainTile.method4008((-128).toByte()), SceneTilePlaneManager.method260(!bool) + i_0_)
                }
            } else SpriteMaskShape.method2599(101.toByte(), RectangleRegion.aClass348_Sub42_Sub12_1946, i_0_, i)
            anInt8354++
            NpcEntityUpdater.anInt3655 = 0
            RectangleRegion.aClass348_Sub42_Sub12_1946 = null
            if (bool != true) method197(true)
        }

        @JvmStatic
        fun method192(modelLightingConfig: ModelLightingConfig?, i: Int, i_1_: Int, i_2_: Int) {
            NodeDequeStatics.aModelLightingConfigArrayArray3335!![i_1_]!![i_2_] = modelLightingConfig
            anInt8362++
            if (i != 10000) anInt8363 = 32
        }

        @JvmStatic
        fun method193(i: Int) {
            if (i == 30) {
                aBoundsConstraintEntry_8356 = null
                aBooleanArrayArrayArray8361 = null
                aIntRange_8365 = null
            }
        }

        @JvmStatic
        fun method194(i: Int, i_3_: Int, i_4_: Int, f: Float, i_5_: Int, f_6_: Float, f_7_: Float, f_8_: Float, f_9_: Float, textureGenerator: TextureGenerator?, i_10_: Int): ByteArray {
            anInt8353++
            if (i_3_ != -1922) aBoundsConstraintEntry_8356 = null
            val `is` = ByteArray(i * i_5_ * i_10_)
            CameraConfigDefinition.method1919(i, f_8_, `is`, f_6_, 0, f_9_, textureGenerator, f_7_, i_4_, 119.toByte(), i_10_, f, i_5_)
            return `is`
        }

        @JvmStatic
        fun method195(i: Int, bool: Boolean, i_11_: Int): Boolean {
            var i = i
            anInt8364++
            val class51 = GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, i_11_)
            if (i == 11) i = 10
            if (bool != false) return false
            if (i >= 5 && i <= 8) i = 4
            return class51.method478(i, -31076)
        }

        @JvmStatic
        fun method196(bool: Boolean, i: Int, i_13_: Int, i_14_: Int, i_15_: Int) {
            var i = i
            var i_14_ = i_14_
            if (bool != true) method192(null, -119, 63, 12)
            if (LocalPlayerState.anInt1910 <= i_15_ && WidgetTextConfig.anInt513 >= i_15_) {
                i_14_ = WhirlpoolHash.method831(CameraNodeList.anInt1745, i_14_, WorldMapLabel.anInt4960, 71)
                i = WhirlpoolHash.method831(CameraNodeList.anInt1745, i, WorldMapLabel.anInt4960, -87)
                NpcAppearanceFlags.method223(i, i_13_, i_15_, i_14_, 39.toByte())
            }
            anInt8357++
        }

        @JvmStatic
        fun method197(bool: Boolean): Int {
            anInt8358++
            if (bool != false) aBoundsConstraintEntry_8356 = null
            return HslColorTableNode.anInt6637
        }

        @JvmStatic
        fun method198(widgetComponent: WidgetComponent?, bool: Boolean, i: Int, i_22_: Int) {
            SocketGameConnection.anInt5832 = i
            ConfigValueProvider.anInt4911 = i_22_
            CameraRotationStub.aWidgetComponent_323 = widgetComponent
            anInt8359++
            if (bool != false) anInt8363 = 112
        }
    }
}
