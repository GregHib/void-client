object HashLinkedListNodeStatics {
    var aModelOrSpriteHolder_7058: ModelOrSpriteHolder?

    var anInt7059: Int = 0
    var anInt7062: Int = 0

    @JvmStatic
    fun method3161(i: Int) {
        if (i != 0) method3161(-27)
        aModelOrSpriteHolder_7058 = null
    }

    fun method3163(i: Byte) {
        ShaderState.anInt6513 = 0
        anInt7062++
        if (i.toInt() == -114) {
            for (i_0_ in 0..2047) {
                CompositeNpcModelBuilder.aClass348_Sub49Array2105!![i_0_] = null
                KeyboardLayoutCache.aByteArray3300!![i_0_] = 1.toByte()
                SoundBankPatch.aTextureAtlasStateArray6802s!![i_0_] = null
            }
        }
    }

    init {
        aModelOrSpriteHolder_7058 = ModelOrSpriteHolder()
    }
}