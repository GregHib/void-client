object SceneGraphContainerStatics {
    var aBooleanArray6474: BooleanArray? = BooleanArray(32)
    var aBooleanArray6477: BooleanArray? = BooleanArray(8)
    fun method2526(i: Int, bool: Boolean): SceneGraphContainer {
        if (GlTexture2DStatics.anInt8550 != RingBufferInputStreamStatics.anInt4559) {
            val class318_sub10 = DisplaySettingsConfigStatics.aClass318_Sub10Array7249!![RingBufferInputStreamStatics.anInt4559]!!
            RingBufferInputStreamStatics.anInt4559 = RingBufferInputStreamStatics.anInt4559 + 1 and (KeyedCacheEntryReferenceStatics.anIntArray9558!![HslColorTableNodeStatics.anInt6637])
            class318_sub10.method2531(i, bool)
            return class318_sub10
        }
        return SceneGraphContainer(i, bool)
    }

    @JvmStatic
    fun method2527() {
        aBooleanArray6474 = null
        aBooleanArray6477 = null
    }
}
