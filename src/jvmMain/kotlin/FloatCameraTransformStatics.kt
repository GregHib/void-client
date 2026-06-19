object FloatCameraTransformStatics {
    @JvmField
            var anInt5690: Int = 0
            @JvmField
            var anInt5692: Int = 0
            @JvmField
            var anInt5693: Int = 0
            @JvmField
            var anInt5694: Int = 0
            @JvmField
            var anInt5695: Int = 0
            @JvmField
            var anInt5696: Int = 0
            @JvmField
            var anInt5697: Int = 0
            @JvmField
            var anInt5698: Int = 0
            var aFontMetaRef_5699: FontMetaRef?
            @JvmField
            var anInt5701: Int = 0
            @JvmField
            var anInt5702: Int = 0
            @JvmField
            var anInt5703: Int = 0
            @JvmField
            var anInt5705: Int = 0
            @JvmField
            var anInt5706: Int = 0
            @JvmField
            var anInt5707: Int = 0
            @JvmField
            var anInt5709: Int = 0
            @JvmField
            var anInt5712: Int = 0
            @JvmField
            var anInt5713: Int = -1
            @JvmField
            var anInt5714: Int = 0
            @JvmField
            var anInt5715: Int = 0
            @JvmField
            var anInt5717: Int = 0
            @JvmField
            var anInt5718: Int = 0
            @JvmField
            var anInt5719: Int = 0
            @JvmField
            var anInt5720: Int = 0
            @JvmField
            var anInt5721: Int = 0
            @JvmField
            var anInt5723: Int = 0
            @JvmField
            var anInt5725: Int = 0
            @JvmField
            var anInt5726: Int = 0
            @JvmField
            var anInt5727: Int = 0
            @JvmField
            var anInt5728: Int = 0
            @JvmField
            var anInt5730: Int = 0
            @JvmField
            var anInt5731: Int = 0
            @JvmField
            var anInt5733: Int = 0
            @JvmField
            var anInt5734: Int = 0
            @JvmField
            var anInt5735: Int = 0
            @JvmField
            var anInt5737: Int = 0
            @JvmField
            var anInt5738: Int = 0
            @JvmField
            var anInt5739: Int = 0
            @JvmField
            var anInt5740: Int = 0
            @JvmField
            var anInt5741: Int = 0
            var aIntRange_5742: IntRange?
            @JvmField
            var anInt5743: Int = 0
            var anInt5744: Int = 0
            @JvmField
            var aLong5745: Long = 0
    
            fun method921(i: Byte, bool: Boolean) {
                if (i.toInt() == 99) {
                    var class348_sub9 = MapSceneIconDefStatics.aNodeDeque_2859!!.method1995(4) as? CharacterRenderState
                    while (class348_sub9 != null) {
                        if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                            SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6676!!)
                            class348_sub9.aClass348_Sub16_Sub5_6676 = null
                        }
                        if (class348_sub9.aClass348_Sub16_Sub5_6673 != null) {
                            SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6673!!)
                            class348_sub9.aClass348_Sub16_Sub5_6673 = null
                        }
                        class348_sub9.method2715(94.toByte())
                        class348_sub9 = MapSceneIconDefStatics.aNodeDeque_2859!!.method1990(120.toByte()) as? CharacterRenderState
                    }
                    anInt5739++
                    if (bool) {
                        run {
                            var class348_sub9 = ClientStatics.aNodeDeque_5185!!.method1995(4) as? CharacterRenderState
                            while (class348_sub9 != null) {
                                if ((class348_sub9!!.aClass348_Sub16_Sub5_6676) != null) {
                                    SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9!!.aClass348_Sub16_Sub5_6676!!)
                                    class348_sub9!!.aClass348_Sub16_Sub5_6676 = null
                                }
                                class348_sub9!!.method2715(66.toByte())
                                class348_sub9 = (ClientStatics.aNodeDeque_5185!!.method1990(69.toByte()) as? CharacterRenderState)
                            }
                        }
                        var class348_sub9 = CompletedResourceRequestStatics.aHashtable_10465!!.method3484(0) as? CharacterRenderState
                        while (class348_sub9 != null) {
                            if ((class348_sub9!!.aClass348_Sub16_Sub5_6676) != null) {
                                SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9!!.aClass348_Sub16_Sub5_6676!!)
                                class348_sub9!!.aClass348_Sub16_Sub5_6676 = null
                            }
                            class348_sub9!!.method2715(112.toByte())
                            class348_sub9 = CompletedResourceRequestStatics.aHashtable_10465!!.method3482(0) as? CharacterRenderState
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method925(i: Int) {
                if (i == -5997) {
                    aFontMetaRef_5699 = null
                    aIntRange_5742 = null
                }
            }
    
            init {
                aFontMetaRef_5699 = FontMetaRef(53, -1)
                aIntRange_5742 = IntRange(119, 6)
            }
}
