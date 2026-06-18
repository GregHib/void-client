import WaterMaterialPass.Companion.method2148
import Class59.Companion.method544

/* Class5_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class5_Sub3 internal constructor(js5Archive: Js5Archive?, js5Archive_4_: Js5Archive, class369_sub1: WorldMapAreaLabel?) : Class5(js5Archive, js5Archive_4_, class369_sub1) {
    private var aAbstractModelRenderer_8366: AbstractModelRenderer? = null
    public override fun method178(i: Int, bool: Boolean, i_0_: Byte, i_1_: Int) {
        if (i_0_ >= -6) method202(-4, null)
        anInt8376++
        FacingDirectionNode.aRenderer6654!!.method3628(-2 + i, i_1_, 4 + this.aWorldMapLabel_4635!!.anInt4971, this.aWorldMapLabel_4635!!.anInt4963 + 2, ((this.aWorldMapLabel_4635 as WorldMapAreaLabel).anInt8580), 0)
        FacingDirectionNode.aRenderer6654!!.method3628(i + -1, i_1_ + 1, this.aWorldMapLabel_4635!!.anInt4971 + 2, this.aWorldMapLabel_4635!!.anInt4963, 0, 0)
    }

    public override fun method8(i: Byte): Boolean {
        val i_2_ = 2 % ((25 - i) / 52)
        anInt8373++
        if (!super.method8(82.toByte())) return false
        return this.aJs5Archive_4632!!.method421(false, ((this.aWorldMapLabel_4635 as WorldMapAreaLabel).anInt8582))
    }

    public override fun method7(i: Int) {
        anInt8371++
        if (i == 10286) {
            super.method7(i)
            aAbstractModelRenderer_8366 = WorldMapPolygonIconLabel.method3577((this.aWorldMapLabel_4635 as WorldMapAreaLabel).anInt8582, (-96).toByte(), this.aJs5Archive_4632!!)
        }
    }

    public override fun method182(i: Int, i_8_: Int, i_9_: Int, bool: Boolean) {
        anInt8367++
        val i_10_ = (this.method183(48) * this.aWorldMapLabel_4635!!.anInt4971 / 10000)
        val `is` = IntArray(4)
        val i_11_ = -50 % ((-20 - i) / 57)
        FacingDirectionNode.aRenderer6654!!.K(`is`)
        FacingDirectionNode.aRenderer6654!!.KA(i_9_, 2 + i_8_, i_9_ - -i_10_, i_8_ - -(this.aWorldMapLabel_4635!!.anInt4963))
        aAbstractModelRenderer_8366!!.method972(i_9_, 2 + i_8_, (this.aWorldMapLabel_4635!!.anInt4971), (this.aWorldMapLabel_4635!!.anInt4963))
        FacingDirectionNode.aRenderer6654!!.KA(`is`[0], `is`[1], `is`[2], `is`[3])
    }

    companion object {
        @JvmField
        var anInt8367: Int = 0
        @JvmField
        var anInt8368: Int = 0
        @JvmField
        var anInt8369: Int = 0
        @JvmField
        var anInt8370: Int = 0
        @JvmField
        var anInt8371: Int = 0
        @JvmField
        var anInt8372: Int = 0
        @JvmField
        var anInt8373: Int = 0
        @JvmField
        var anInt8374: Int = 0
        @JvmField
        var anInt8375: Int = 0
        @JvmField
        var anInt8376: Int = 0
        @JvmField
        var anInt8377: Int = 0

        @JvmStatic
        fun method199(i: Int): CameraSplineNode? {
            anInt8369++
            if (Class75.aNodeDeque_1254 == null || RenderNode.aWidgetRedrawTracker_9716 == null) return null
            RenderNode.aWidgetRedrawTracker_9716!!.method2328(Class75.aNodeDeque_1254!!, 75)
            val class348_sub21 = RenderNode.aWidgetRedrawTracker_9716!!.method2327((-53).toByte()) as CameraSplineNode?
            if (class348_sub21 == null) return null
            val class42 = Class75.aConfigDefinitionLoader_1238!!.method1225(class348_sub21.anInt6847, 50.toByte())
            if (i != 1) anInt8370 = -75
            if (class42 != null && class42.aBoolean609 && class42.method373(Class75.anInterface17_1244!!, 98)) return class348_sub21
            return Hashtable.method3479(-1)
        }

        @JvmStatic
        fun method200(i: Int, i_3_: Int): Int {
            if (i >= -75) return -109
            anInt8377++
            return i_3_ ushr 8
        }

        @JvmStatic
        fun method201(i: Int, i_5_: Int, string: String?) {
            do {
                try {
                    anInt8372++
                    val i_6_ = ShaderState.anInt6513
                    val `is` = ScrollTexMaterialPass.anIntArray6290
                    if (i_5_ == -7257) {
                        var bool = false
                        var i_7_ = 0
                        while (i_6_ > i_7_) {
                            val player = (LoadingBarRenderer.aPlayerArray5058!![`is`!![i_7_]])
                            if (player != null && (LocalPlayerState.aPlayer_1907 != player) && (player.aString10544 != null) && player.aString10544.equals(string, ignoreCase = true)) {
                                bool = true
                                if (i == 1) {
                                    WidgetComponentNode.anInt4657++
                                    val class348_sub47 = (method2148(CustomCursorsOptionState.aFontMetaRef_5929, TheoraVideoStream.aClass77_9029, i_5_ + 7158))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, `is`[i_7_])
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteInverse((-75).toByte(), 0)
                                    InterfaceComponentGroup.method3243(i_5_ xor 0x1c2a, class348_sub47)
                                } else if (i == 4) {
                                    NpcActorEntity.anInt10073++
                                    val class348_sub47 = (method2148(Class52.aFontMetaRef_4905, TheoraVideoStream.aClass77_9029, -88))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), `is`[i_7_])
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd((-128).toByte(), 0)
                                    InterfaceComponentGroup.method3243(126, class348_sub47)
                                } else if (i == 5) {
                                    FloatGrid.anInt4979++
                                    val class348_sub47 = (method2148(ParticleEmitterListNode.aFontMetaRef_9684, TheoraVideoStream.aClass77_9029, -83))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(81, `is`[i_7_])
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                                    InterfaceComponentGroup.method3243(-112, class348_sub47)
                                } else if (i == 6) {
                                    HuffmanCodec.anInt3768++
                                    val class348_sub47 = (method2148(ConfigFlagUtil.aFontMetaRef_3232, TheoraVideoStream.aClass77_9029, -83))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-119, `is`[i_7_])
                                    InterfaceComponentGroup.method3243(i_5_ + 7281, class348_sub47)
                                } else if (i == 7) {
                                    WorldMapTextLabel.anInt8588++
                                    val class348_sub47 = (method2148(ProceduralTextureGraph.aFontMetaRef_9533, TheoraVideoStream.aClass77_9029, -116))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(i_5_ xor 0x1c2c, `is`[i_7_])
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd(92.toByte(), 0)
                                    InterfaceComponentGroup.method3243(127, class348_sub47)
                                }
                                break
                            }
                            i_7_++
                        }
                        if (bool) break
                        method544(((LocalizedText.aLocalizedText_3504!!.method2063(AnimationFrameDefinition.anInt6967, 544)) + string), false, 4)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatch.method2929(runtimeexception, ("tq.A(" + i + ',' + i_5_ + ',' + (if (string != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method202(i: Int, class348_sub42_sub12: ContactEntry?) {
            do {
                try {
                    anInt8375++
                    if (i == 6 && !Class5_Sub1.Companion.aBoolean8335) {
                        class348_sub42_sub12!!.method2715(111.toByte())
                        Class73.anInt4776--
                        if (class348_sub42_sub12.aBoolean9611) {
                            var class348_sub42_sub13 = (ParticleSortRenderer.aLinkedNodeListIterator_3022!!.method1011(-99) as ContactList?)
                            while (class348_sub42_sub13 != null) {
                                if (class348_sub42_sub13.aString9617 == class348_sub42_sub12.aString9601) {
                                    var bool = false
                                    var class348_sub42_sub12_12_ = (class348_sub42_sub13.aLinkedNodeListIterator_9621.method1011(-58) as ContactEntry?)
                                    while (class348_sub42_sub12_12_ != null) {
                                        if (class348_sub42_sub12 == class348_sub42_sub12_12_) {
                                            if (class348_sub42_sub13.method3234((-123).toByte(), class348_sub42_sub12)) ManagedGlResource.method1868((-98).toByte(), class348_sub42_sub13)
                                            bool = true
                                            break
                                        }
                                        class348_sub42_sub12_12_ = (class348_sub42_sub13.aLinkedNodeListIterator_9621.method1003(112.toByte()) as ContactEntry?)
                                    }
                                    if (bool) break
                                }
                                class348_sub42_sub13 = (ParticleSortRenderer.aLinkedNodeListIterator_3022!!.method1003(110.toByte()) as ContactList?)
                            }
                        } else {
                            val l = (class348_sub42_sub12.aLong9600)
                            var class348_sub42_sub13: ContactList?
                            class348_sub42_sub13 = (ContactEntry.aHashtable_9603!!.method3480(l, -6008) as? ContactList?)
                            while (class348_sub42_sub13 != null) {
                                if (class348_sub42_sub13.aString9617 == class348_sub42_sub12.aString9601) break
                                class348_sub42_sub13 = (ContactEntry.aHashtable_9603!!.method3476(true) as? ContactList?)
                            }
                            if (class348_sub42_sub13 == null || !(class348_sub42_sub13.method3234(15.toByte(), class348_sub42_sub12))) break
                            ManagedGlResource.method1868(120.toByte(), class348_sub42_sub13)
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatch.method2929(runtimeexception, ("tq.I(" + i + ',' + (if (class348_sub42_sub12 != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }
    }
}
