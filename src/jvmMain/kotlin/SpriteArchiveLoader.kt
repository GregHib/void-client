import SpriteArchiveLoaderStatics.anInt373
import SpriteArchiveLoaderStatics.anInt375
import SpriteArchiveLoaderStatics.anInt376
import SpriteArchiveLoaderStatics.anInt378
import SpriteArchiveLoaderStatics.method311

/* Class26 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteArchiveLoader internal constructor(js5Archive: Js5Archive?, js5Archive_9_: Js5Archive?) {
    private val aHashtable_374 = Hashtable(256)
    private val aJs5Archive_377: Js5Archive?
    private val aJs5Archive_379: Js5Archive?
    private val aHashtable_381 = Hashtable(256)
    private fun method307(i: Int, `is`: IntArray?, i_0_: Int, i_1_: Int): PcmSampleData? {
        anInt378++
        var i_2_ = i xor (i_1_ ushr 12 or (i_1_ shl 4 and 0xfff1))
        i_2_ = i_2_ or (i_1_ shl 16)
        val l = i_2_.toLong()
        var class348_sub19_sub1 = aHashtable_381.method3480(l, -6008) as PcmSampleData?
        if (class348_sub19_sub1 != null) return class348_sub19_sub1
        if (`is` != null && `is`[0] <= 0) return null
        val audioClipDefinition = AudioClipDefinitionStatics.method2372(aJs5Archive_379!!, i_1_, i)
        if (i_0_ < 50) method311((-60).toByte(), 'n')
        if (audioClipDefinition == null) return null
        class348_sub19_sub1 = audioClipDefinition.method2369()
        aHashtable_381.method3483(32.toByte(), l, class348_sub19_sub1)
        if (`is` != null) `is`[0] -= (class348_sub19_sub1.aByteArray8984)!!.size
        return class348_sub19_sub1
    }

    fun method308(i: Int, `is`: IntArray?, i_3_: Int): PcmSampleData? {
        anInt373++
        if ((aJs5Archive_379!!.method414(-1).inv()) == i_3_) return method307(i, `is`, 122, 0)
        if (aJs5Archive_379.method407(0, i) == 1) return method307(0, `is`, 69, i)
        throw RuntimeException()
    }

    fun method309(`is`: IntArray?, i: Int, i_4_: Int): PcmSampleData? {
        anInt376++
        if (aJs5Archive_377!!.method414(i_4_) == 1) return method310(i, 0, 92.toByte(), `is`)
        if (aJs5Archive_377.method407(0, i) == 1) return method310(0, i, 78.toByte(), `is`)
        if (i_4_ != -1) method307(44, null, -124, -47)
        throw RuntimeException()
    }

    private fun method310(i: Int, i_5_: Int, i_6_: Byte, `is`: IntArray?): PcmSampleData? {
        anInt375++
        var i_7_ = i xor (0xfff0 and (i_5_ shl 4) or (i_5_ ushr 12))
        i_7_ = i_7_ or (i_5_ shl 16)
        val i_8_ = -113 / ((i_6_ - 16) / 34)
        val l = i_7_.toLong() xor 0x100000000L
        var class348_sub19_sub1 = aHashtable_381.method3480(l, -6008) as PcmSampleData?
        if (class348_sub19_sub1 != null) return class348_sub19_sub1
        if (`is` != null && `is`[0] <= 0) return null
        var class348_sub10 = aHashtable_374.method3480(l, -6008) as VorbisAudioDecoder?
        if (class348_sub10 == null) {
            class348_sub10 = VorbisAudioDecoderStatics.method2795(aJs5Archive_377!!, i_5_, i)
            if (class348_sub10 == null) return null
            aHashtable_374.method3483(108.toByte(), l, class348_sub10)
        }
        class348_sub19_sub1 = class348_sub10.method2791(`is`)
        if (class348_sub19_sub1 == null) return null
        class348_sub10.method2715(27.toByte())
        aHashtable_381.method3483(117.toByte(), l, class348_sub19_sub1)
        return class348_sub19_sub1
    }

    init {
        try {
            aJs5Archive_377 = js5Archive_9_
            aJs5Archive_379 = js5Archive
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("hs.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_9_ != null) "{...}" else "null") + ')'))
        }
    }
}
