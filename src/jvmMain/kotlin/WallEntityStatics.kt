object WallEntityStatics {
    @JvmField
            var aLinkedQueueNode_8766: LinkedQueueNode? = null
            @JvmField
            var anInt8767: Int = 0
            @JvmField
            var anInt8768: Int = 0
            @JvmField
            var anInt8770: Int = 0
            @JvmField
            var anInt8771: Int = 0
            @JvmField
            var anInt8772: Int = 0
            @JvmField
            var aBoolean8773: Boolean = false
            @JvmField
            var anInt8774: Int = 0
            @JvmField
            var anInt8775: Int = 2
            @JvmField
            var anInt8776: Int = 0
            @JvmField
            var anInt8777: Int = 0
            @JvmField
            var anInt8778: Int = 0
            @JvmField
            var anInt8779: Int = 0
            @JvmField
            var anInt8780: Int = 0
            @JvmStatic
            fun method2483(i: Int, i_0_: Int): Int {
                if (BooleanGraphicsOptionStateStatics.aShortArrayArray5847 != null) return BooleanGraphicsOptionStateStatics.aShortArrayArray5847!![i]!![i_0_].toInt() and 0xffff
                return 0
            }
    
            @JvmStatic
            fun method2484(i: Int) {
                if (i != 0) method2487(-24)
                aLinkedQueueNode_8766 = null
            }
    
            @JvmStatic
            fun method2485(i: Int): Boolean {
                anInt8776++
                if (GlElementArrayBufferStatics.aClass348_Sub42_Sub12_4846 == null) return false
                if ((GlElementArrayBufferStatics.aClass348_Sub42_Sub12_4846!!.anInt9608) >= 2000) GlElementArrayBufferStatics.aClass348_Sub42_Sub12_4846!!.anInt9608 -= 2000
                val i_1_ = -53 % ((-41 - i) / 54)
                return (GlElementArrayBufferStatics.aClass348_Sub42_Sub12_4846!!.anInt9608) == 1011
            }
    
            @JvmStatic
            fun method2486(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) {
                if (i_8_ >= WorldMapLabelStatics.anInt4960 && i_5_ <= CameraNodeListStatics.anInt1745 && LocalPlayerState.anInt1910 <= i_9_ && WidgetTextConfigStatics.anInt513 >= i_7_) MinimapSpriteRendererStatics.method1111(i_7_, i, i_5_, i_8_, i_9_, i_6_)
                else ShadowQualityOptionStateStatics.method1792(i_9_, i_8_, i_7_, i_5_, (-114).toByte(), i_6_)
                if (i != 0) anInt8780 = 42
                anInt8777++
            }
    
            @JvmStatic
            fun method2487(i: Int): MapLabelMenuEntry? {
                anInt8778++
                WidgetActionEntryStatics.anInt6985 = 0
                if (i >= -91) anInt8775 = -63
                return ModelOrSpriteHolderStatics.method170(true)
            }
}
