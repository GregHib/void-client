import IOException_Sub1Statics.method131

object NativeRenderNodeStatics {
    @JvmField
            var anInt10469: Int = 0
            @JvmField
            var anInt10470: Int = 0
            @JvmField
            var anInt10472: Int = 0
            @JvmField
            var anInt10473: Int = 0
            @JvmField
            var anInt10475: Int = 0
            @JvmField
            var anInt10476: Int = 0
            @JvmField
            var aFontMetaRef_10477: FontMetaRef? = FontMetaRef(22, 7)
            @JvmField
            var anIntArray10478: IntArray? = IntArray(1)
            @JvmField
            var aNodeDeque_10479: NodeDeque?
    
            @JvmStatic
            fun method3288(i: Byte) {
                val i_14_ = 107 % ((i - 27) / 34)
                anIntArray10478 = null
                aFontMetaRef_10477 = null
                aNodeDeque_10479 = null
            }
    
            @JvmStatic
            fun method3290(i: Int) {
                if (i < 30) aNodeDeque_10479 = null
                method131(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub5_7240!!.method1739(-32350) == 1, 2, true, 22050)
                anInt10470++
                AbstractProceduralTextureNodeStatics.aSoundChannelMixer_7042 = TextureHandleStatics.method1439(22050, VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992, ParticleSystemRendererStatics.aCanvas3869, 0, 7)
                ParticleEmitterListNodeStatics.method3273(true, -114, NpcCountAccessor.method1326(null, 9))
                VarbitDefLoaderStatics.aSoundChannelMixer_2596 = TextureHandleStatics.method1439(2048, VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992, ParticleSystemRendererStatics.aCanvas3869, 1, 7)
                SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065 = AudioMixerScheduler()
                VarbitDefLoaderStatics.aSoundChannelMixer_2596!!.method2088(false, SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065)
                MapSceneTileStatics.aAudioResampler_1050 = AudioResampler(22050, HslColorConfigStatics.anInt339)
                SpriteRgbTextureNodeStatics.method3093(110)
            }
    
            init {
                BoundsConstraintEntry("", 76)
                aNodeDeque_10479 = NodeDeque()
            }
}
