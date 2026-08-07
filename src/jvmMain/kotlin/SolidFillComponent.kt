import ChatMessageStream.Companion.method138
import RegionSceneLoader.method2194
import TextureFormatInfo.Companion.anInt3849

/* Class5_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SolidFillComponent internal constructor(js5Archive: Js5Archive, js5Archive_12_: Js5Archive, class369_sub2: WorldMapTextLabel) : WorldMapElement(js5Archive, js5Archive_12_, class369_sub2) {
    public override fun method178(i: Int, bool: Boolean, i_16_: Byte, i_17_: Int) {
        FacingDirectionNodeStatics.aRenderer6654!!.method3628(-2 + i, i_17_, 4 + this.aWorldMapLabel_4635!!.anInt4971, 2 + this.aWorldMapLabel_4635!!.anInt4963, ((this.aWorldMapLabel_4635 as WorldMapTextLabel).anInt8585), 0)
        anInt8360++
        FacingDirectionNodeStatics.aRenderer6654!!.method3628(i - 1, 1 + i_17_, this.aWorldMapLabel_4635!!.anInt4971 - -2, this.aWorldMapLabel_4635!!.anInt4963, 0, 0)
        if (i_16_ > -6) InboundPacketHeader.aInboundPacketHeader_8365 = null
    }

    public override fun method182(i: Int, i_18_: Int, i_19_: Int, bool: Boolean) {
        anInt8355++
        val i_20_ = -110 / ((-20 - i) / 57)
        val i_21_ = (this.method183(116) * this.aWorldMapLabel_4635!!.anInt4971 / 10000)
        FacingDirectionNodeStatics.aRenderer6654!!.aa(i_19_, 2 + i_18_, i_21_, (this.aWorldMapLabel_4635!!.anInt4963) - 2, (this.aWorldMapLabel_4635 as WorldMapTextLabel).anInt8591, 0)
        FacingDirectionNodeStatics.aRenderer6654!!.aa(i_21_ + i_19_, 2 + i_18_, this.aWorldMapLabel_4635!!.anInt4971 - i_21_, this.aWorldMapLabel_4635!!.anInt4963 - 2, 0, 0)
    }

    companion object {

        var anInt8353: Int = 0

        var anInt8354: Int = 0

        var anInt8355: Int = 0

        var aBoundsConstraintEntry_8356: BoundsConstraintEntry? = BoundsConstraintEntry("", 11)

        var anInt8357: Int = 0

        var anInt8358: Int = 0

        var anInt8359: Int = 0

        var anInt8360: Int = 0

        var aBooleanArrayArrayArray8361: Array<Array<BooleanArray?>?>? = null

        var anInt8362: Int = 0

        var anInt8363: Int = 0

        var anInt8364: Int = 0

        @JvmStatic
        fun method1164(i: Byte) {
            if (i <= -42) {
                TextureMaterialGroup.aJs5Archive_1940 = null
                aClass348_Sub42_Sub12_1946 = null
                SceneNodeDeque.aWidgetComponentArray1942 = null
            }
        }
        var aClass348_Sub42_Sub12_1946: ContactEntry? = null
        @JvmStatic
        fun method191(bool: Boolean, i: Int, i_0_: Int) {
            if (NpcEntityUpdater.anInt3655 != 1) {
                if (NpcEntityUpdater.anInt3655 == 2) {
                    if (!GrayscaleNoiseTexture.aBoolean5300) SolidFillComponent.method2291((-127).toByte(), i, i_0_)
                    else SolidFillComponent.method2291((-122).toByte(), i + NativeTerrainTile.method4008((-128).toByte()), SceneTilePlaneManager.method260(!bool) + i_0_)
                }
            } else SpriteMaskShapeStatics.method2599(101.toByte(), SolidFillComponent.aClass348_Sub42_Sub12_1946, i_0_, i)
            anInt8354++
            NpcEntityUpdater.anInt3655 = 0
            SolidFillComponent.aClass348_Sub42_Sub12_1946 = null
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
                InboundPacketHeader.aInboundPacketHeader_8365 = null
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
                i_14_ = WhirlpoolHash.method831(CameraNodeListStatics.anInt1745, i_14_, WorldMapLabel.anInt4960, 71)
                i = WhirlpoolHash.method831(CameraNodeListStatics.anInt1745, i, WorldMapLabel.anInt4960, -87)
                method223(i, i_13_, i_15_, i_14_, 39.toByte())
            }
            anInt8357++
        }

        @JvmStatic
        fun method197(bool: Boolean): Int {
            anInt8358++
            if (bool != false) aBoundsConstraintEntry_8356 = null
            return TextureQualityOptionState.anInt6637
        }

        @JvmStatic
        fun method198(widgetComponent: WidgetComponent?, bool: Boolean, i: Int, i_22_: Int) {
            SocketGameConnection.anInt5832 = i
            ConfigValueProvider.anInt4911 = i_22_
            CameraRotationStubStatics.aWidgetComponent_323 = widgetComponent
            anInt8359++
            if (bool != false) anInt8363 = 112
        }
        fun method2291(i: Byte, i_4_: Int, i_5_: Int) {
            anInt3849++
            var i_6_ = (WorldMapLabel.aFontDefinition_4962!!.method1183(true, LocalizedText.aLocalizedText_3507!!.method2063(ChatCommandProcessor.anInt6967, 544)))
            val i_7_: Int
            if (ChatScriptListNode.aBoolean9535) {
                var class348_sub42_sub13 = (ParticleSortRenderer.aLinkedNodeListIterator_3022!!.method1011(-87) as? ContactList?)
                while (class348_sub42_sub13 != null) {
                    val i_9_: Int
                    if (class348_sub42_sub13.anInt9615 != 1) i_9_ = method2194(-1, class348_sub42_sub13)
                    else i_9_ = (ChatMessageStream.method138((((class348_sub42_sub13.aLinkedNodeListIterator_9621.aClass348_Sub42_1647.aClass348_Sub42_7063) as ContactEntry?)!!), false))
                    if (i_6_ < i_9_) i_6_ = i_9_
                    class348_sub42_sub13 = (ParticleSortRenderer.aLinkedNodeListIterator_3022!!.method1003(126.toByte()) as? ContactList?)
                }
                i_6_ += 8
                i_7_ = 21 + 16 * NpcAnimationResolverStatics.anInt166
                WorldMapSceneSoftware.anInt5819 = (if (PlayerSequenceSelector.aBoolean1211) 26 else 22) + 16 * NpcAnimationResolverStatics.anInt166
            } else {
                var class348_sub42_sub12 = (SourceRowTextureNode.aNodeDeque_9111!!.method1995(4) as? ContactEntry?)
                while (class348_sub42_sub12 != null) {
                    val i_8_ = method138(class348_sub42_sub12, false)
                    if (i_6_ < i_8_) i_6_ = i_8_
                    class348_sub42_sub12 = SourceRowTextureNode.aNodeDeque_9111!!.method1990(69.toByte()) as? ContactEntry?
                }
                i_6_ += 8
                WorldMapSceneSoftware.anInt5819 = (if (!PlayerSequenceSelector.aBoolean1211) 22 else 26) + 16 * FileExistsConditionStatics.anInt4776
                i_7_ = 21 + FileExistsConditionStatics.anInt4776 * 16
            }
            var i_10_ = -(i_6_ / 2) + i_4_
            if (LocTypeDefinition.anInt4017 < i_6_ + i_10_) i_10_ = -i_6_ + LocTypeDefinition.anInt4017
            if (i_10_ < 0) i_10_ = 0
            var i_11_ = i_5_
            if (i_11_ + i_7_ > GameDisplayManager.anInt10432) i_11_ = GameDisplayManager.anInt10432 + -i_7_
            if (i_11_ < 0) i_11_ = 0
            GlArrayBufferObject.anInt4717 = i_10_
            ScrollbarComponent.aBoolean8335 = true
            ProceduralTextureGraph.anInt9532 = i_11_
            SceneTileBounds.anInt1117 = i_6_
        }


        var anInt214: Int = 0
        fun method223(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Byte) {
            if (i_2_ > i) GlElementArrayBuffer.method1156(-27, i_2_, WidgetDefinition.anIntArrayArray255!![i_1_]!!, i, i_0_)
            else GlElementArrayBuffer.method1156(-27, i, WidgetDefinition.anIntArrayArray255!![i_1_]!!, i_2_, i_0_)
            anInt214++
            if (i_3_ >= 20) {
                /* empty */
            }
        }
    }
}
