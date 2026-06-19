import KeyedCacheEntryReferenceStatics.method3203

object Crc64HashableStatics {
    @JvmField
            var anIntArray4983: IntArray? = null
            @JvmField
            var aJs5Archive_4984: Js5Archive? = null
            @JvmField
            var anInt4985: Int = 0
            @JvmField
            var anInt4986: Int = 0
            var aSlotBindingArray4987: Array<SlotBinding?>? = null
            @JvmField
            var anInt4988: Int = 0
            @JvmField
            var anInt4994: Int = 0
            @JvmField
            var anInt4995: Int = 0
    
            @JvmStatic
            fun method1112(i: Int) {
                if (i != 1) aSlotBindingArray4987 = null
                aJs5Archive_4984 = null
                anIntArray4983 = null
                aSlotBindingArray4987 = null
            }
    
            fun method1113(i: Int, i_0_: Int, i_1_: Int): Boolean {
                anInt4995++
                if (i_1_ >= -3) aJs5Archive_4984 = null
                return (GlowPostProcessorStatics.method1412((-35).toByte(), i_0_, i) and (LocalizedTextStatics.method2058(i, i_0_, 72) or ((i and 0x2000) != 0) or method3203(i_0_, 114.toByte(), i)))
            }
    
            fun method1114(i: Int, i_2_: Int) {
                var i = i
                anInt4986++
                if (i < 0 || i > 2) i = 0
                HslColorTableNodeStatics.anInt6637 = i
                DisplaySettingsConfigStatics.aClass318_Sub10Array7249 = arrayOfNulls<SceneGraphContainer>(1 + (KeyedCacheEntryReferenceStatics.anIntArray9558!![HslColorTableNodeStatics.anInt6637]))
                GlTexture2DStatics.anInt8550 = 0
                if (i_2_ >= -118) method1114(-43, -71)
                RingBufferInputStreamStatics.anInt4559 = 0
            }
}
