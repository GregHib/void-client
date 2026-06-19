import IOException_Sub1.Companion.method131

/* Class35 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object SoundEngineInitializer {
    @JvmField
    var anInt483: Int = 0
    @JvmField
    var anInt484: Int = 0
    @JvmField
    var anInt485: Int = 0

    @JvmStatic
    fun method352(i: Int) {
        anInt483++
        ClientLoadStateMachine.method1265(i + 15)
        method131(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub5_7240!!.method1739(-32350) == 1, 2, true, 22050)
        ClientLoadStateMachine.aSoundChannelMixer_7042 = TextureHandle.method1439(22050, VorbisOggDecoder.aPrivilegedOperationWorker_8992, ParticleSystemRenderer.aCanvas3869, 0, 7)
        ParticleEmitterListNode.method3273(true, i + -82, NpcCountAccessor.method1326(null, 9))
        VarbitDefLoader.aSoundChannelMixer_2596 = TextureHandle.method1439(2048, VorbisOggDecoder.aPrivilegedOperationWorker_8992, ParticleSystemRenderer.aCanvas3869, i, 7)
        VarbitDefLoader.aSoundChannelMixer_2596!!.method2088(false, SpriteDefinition.aClass348_Sub16_Sub4_7065)
    }

    @JvmStatic
    fun method353(i: Int, i_0_: Int, i_1_: Int): Int {
        var i = i
        anInt485++
        if (i_1_ == -2) return 12345678
        if (i_0_ > -25) return 58
        if (i_1_ == -1) {
            if (i >= 2) {
                if (i > 126) i = 126
            } else i = 2
            return i
        }
        i = (0x7f and i_1_) * i shr 7
        if (i < 2) i = 2
        else if (i > 126) i = 126
        return i + (0xff80 and i_1_)
    }
}
