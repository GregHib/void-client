import HardCacheEntryReferenceStatics.method3200
import ParticleEmitterNodeStatics.method218
import ParticleEmitterNodeStatics.anInt181

/* Class10 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleEmitterNode internal constructor(@JvmField var aByte180: Byte, @JvmField var anInt185: Int, @JvmField var anInt177: Int, @JvmField var anInt188: Int, @JvmField var anInt184: Int, @JvmField var anInt178: Int, @JvmField var anInt173: Int, @JvmField var aClass318_Sub1_172: SceneEntity?) {
    @JvmField
    var aClass348_Sub16_Sub5_176: SampledVoice? = null
    @JvmField
    var aAudioClipDefinition_183: AudioClipDefinition? = null
    @JvmField
    var aClass348_Sub19_Sub1_189: PcmSampleData? = null
    @JvmField
    var aClass348_Sub10_192: VorbisAudioDecoder? = null

    fun method220(i: Byte): Boolean {
        anInt181++
        if (i >= -12) method218(101.toByte())
        return this.aByte180.toInt() == 2 || this.aByte180.toInt() == 3
    }
}
