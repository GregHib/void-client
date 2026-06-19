object HashLinkedListNodeStatics {
    var aModelOrSpriteHolder_7058: ModelOrSpriteHolder?
            @JvmField
            var anInt7059: Int = 0
            var anInt7061: Int = 0
            var anInt7062: Int = 0
            var anInt7064: Int = 0
    
            @JvmStatic
            fun method3161(i: Int) {
                if (i != 0) method3161(-27)
                aModelOrSpriteHolder_7058 = null
            }
    
            fun method3163(i: Byte) {
                ShaderStateStatics.anInt6513 = 0
                anInt7062++
                if (i.toInt() == -114) {
                    for (i_0_ in 0..2047) {
                        CompositeNpcModelBuilderStatics.aClass348_Sub49Array2105!![i_0_] = null
                        KeyboardLayoutCacheStatics.aByteArray3300!![i_0_] = 1.toByte()
                        SoundBankPatchStatics.aTextureAtlasStateArray6802s!![i_0_] = null
                    }
                }
            }
    
            init {
                aModelOrSpriteHolder_7058 = ModelOrSpriteHolder()
            }
}
