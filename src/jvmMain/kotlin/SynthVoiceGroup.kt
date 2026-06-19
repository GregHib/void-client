import PlayerAppearanceUpdateDecoder.method3612
import SynthVoiceGroupStatics.anInt8847
import SynthVoiceGroupStatics.anInt8849
import SynthVoiceGroupStatics.anInt8850
import SynthVoiceGroupStatics.anInt8851
import SynthVoiceGroupStatics.anInt8856
import SynthVoiceGroupStatics.anInt8858
import SynthVoiceGroupStatics.anInt8859

/* Class348_Sub16_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SynthVoiceGroup internal constructor(private val aClass348_Sub16_Sub3_8852: MidiSequencePlayer) : AudioStreamNode() {
    var aNodeDeque_8848: NodeDeque = NodeDeque()
    var aClass348_Sub16_Sub4_8855: AudioMixerScheduler = AudioMixerScheduler()
    override fun method2818(): AudioStreamNode? {
        anInt8856++
        var class348_sub43: SpriteDefinition?
        do {
            class348_sub43 = this.aNodeDeque_8848.method1990(122.toByte()) as SpriteDefinition?
            if (class348_sub43 == null) return null
        } while (class348_sub43.aClass348_Sub16_Sub5_7081 == null)
        return class348_sub43.aClass348_Sub16_Sub5_7081
    }

    override fun method2817(`is`: IntArray, i: Int, i_0_: Int) {
        anInt8847++
        this.aClass348_Sub16_Sub4_8855.method2817(`is`, i, i_0_)
        var class348_sub43 = (this.aNodeDeque_8848.method1995(4) as SpriteDefinition?)
        while_125_@ while (class348_sub43 != null) {
            if (!aClass348_Sub16_Sub3_8852.method2847(-107, class348_sub43)) {
                var i_1_ = i
                var i_2_ = i_0_
                while (class348_sub43!!.anInt7086 < i_2_) {
                    method2825(i_1_ + i_2_, class348_sub43, i_1_, (-114).toByte(), class348_sub43.anInt7086, `is`)
                    i_1_ += class348_sub43.anInt7086
                    i_2_ -= class348_sub43.anInt7086
                    if (aClass348_Sub16_Sub3_8852.method2852(`is`, i_2_, class348_sub43, i_1_, (-4).toByte())) {
                        class348_sub43 = this.aNodeDeque_8848.method1990(121.toByte()) as SpriteDefinition?
                        continue@while_125_
                    }
                }
                method2825(i_1_ + i_2_, class348_sub43, i_1_, (-114).toByte(), i_2_, `is`)
                class348_sub43.anInt7086 -= i_2_
            }
            class348_sub43 = this.aNodeDeque_8848.method1990(121.toByte()) as SpriteDefinition?
        }
    }

    private fun method2824(i: Int, i_4_: Byte, class348_sub43: SpriteDefinition) {
        var i = i
        if (((aClass348_Sub16_Sub3_8852.anIntArray8895[class348_sub43.anInt7067]) and 0x4) != 0 && (class348_sub43.anInt7087 < 0)) {
            val i_5_ = ((aClass348_Sub16_Sub3_8852.anIntArray8906!![class348_sub43.anInt7067]) / HslColorConfigStatics.anInt339)
            val i_6_ = ((-class348_sub43.anInt7082 + (1048575 + i_5_)) / i_5_)
            class348_sub43.anInt7082 = (i_5_ * i + class348_sub43.anInt7082 and 0xfffff)
            if (i_6_ <= i) {
                if ((aClass348_Sub16_Sub3_8852.anIntArray8914[class348_sub43.anInt7067]) != 0) {
                    class348_sub43.aClass348_Sub16_Sub5_7081 = (SampledVoiceStatics.method2911((class348_sub43.aClass348_Sub19_Sub1_7077!!), class348_sub43.aClass348_Sub16_Sub5_7081!!.method2914(), 0, class348_sub43.aClass348_Sub16_Sub5_7081!!.method2892()))
                    aClass348_Sub16_Sub3_8852.method2874(95, (class348_sub43.aClass348_Sub17_7085!!.aShortArray6795!![class348_sub43.anInt7071]) < 0, class348_sub43)
                } else class348_sub43.aClass348_Sub16_Sub5_7081 = (SampledVoiceStatics.method2911((class348_sub43.aClass348_Sub19_Sub1_7077!!), class348_sub43.aClass348_Sub16_Sub5_7081!!.method2914(), class348_sub43.aClass348_Sub16_Sub5_7081!!.method2906(), class348_sub43.aClass348_Sub16_Sub5_7081!!.method2892()))
                if ((class348_sub43.aClass348_Sub17_7085!!.aShortArray6795!![class348_sub43.anInt7071]) < 0) class348_sub43.aClass348_Sub16_Sub5_7081!!.method2917(-1)
                i = class348_sub43.anInt7082 / i_5_
            }
        }
        anInt8849++
        val i_7_ = -70 / ((14 - i_4_) / 61)
        class348_sub43.aClass348_Sub16_Sub5_7081!!.method2819(i)
    }

    override fun method2821(): Int {
        anInt8858++
        return 0
    }

    override fun method2819(i: Int) {
        this.aClass348_Sub16_Sub4_8855.method2819(i)
        anInt8850++
        var class348_sub43 = (this.aNodeDeque_8848.method1995(4) as SpriteDefinition?)
        while_127_@ while (class348_sub43 != null) {
            if (!aClass348_Sub16_Sub3_8852.method2847(53, class348_sub43)) {
                var i_8_ = i
                while (i_8_ > class348_sub43!!.anInt7086) {
                    method2824(class348_sub43.anInt7086, 115.toByte(), class348_sub43)
                    i_8_ -= class348_sub43.anInt7086
                    if (aClass348_Sub16_Sub3_8852.method2852(null, i_8_, class348_sub43, 0, (-4).toByte())) {
                        class348_sub43 = this.aNodeDeque_8848.method1990(38.toByte()) as SpriteDefinition?
                        continue@while_127_
                    }
                }
                method2824(i_8_, 84.toByte(), class348_sub43)
                class348_sub43.anInt7086 -= i_8_
            }
            class348_sub43 = this.aNodeDeque_8848.method1990(38.toByte()) as SpriteDefinition?
        }
    }

    private fun method2825(i: Int, class348_sub43: SpriteDefinition?, i_9_: Int, i_10_: Byte, i_11_: Int, `is`: IntArray) {
        var i_9_ = i_9_
        var i_11_ = i_11_
        try {
            anInt8859++
            if (i_10_.toInt() != -114) method2821()
            if ((0x4 and (aClass348_Sub16_Sub3_8852.anIntArray8895[class348_sub43!!.anInt7067])) != 0 && (class348_sub43.anInt7087 < 0)) {
                val i_12_ = ((aClass348_Sub16_Sub3_8852.anIntArray8906!![class348_sub43.anInt7067]) / HslColorConfigStatics.anInt339)
                while (true) {
                    val i_13_ = ((i_12_ + (1048575 + -class348_sub43.anInt7082)) / i_12_)
                    if (i_13_ > i_11_) break
                    class348_sub43.aClass348_Sub16_Sub5_7081!!.method2817(`is`, i_9_, i_13_)
                    i_9_ += i_13_
                    class348_sub43.anInt7082 += -1048576 + i_12_ * i_13_
                    i_11_ -= i_13_
                    var i_14_ = HslColorConfigStatics.anInt339 / 100
                    val i_15_ = 262144 / i_12_
                    if (i_15_ < i_14_) i_14_ = i_15_
                    val class348_sub16_sub5 = (class348_sub43.aClass348_Sub16_Sub5_7081)!!
                    if ((aClass348_Sub16_Sub3_8852.anIntArray8914[class348_sub43.anInt7067]) != 0) {
                        class348_sub43.aClass348_Sub16_Sub5_7081 = (SampledVoiceStatics.method2911((class348_sub43.aClass348_Sub19_Sub1_7077!!), class348_sub16_sub5.method2914(), 0, class348_sub16_sub5.method2892()))
                        aClass348_Sub16_Sub3_8852.method2874(116, ((class348_sub43.aClass348_Sub17_7085!!.aShortArray6795!![class348_sub43.anInt7071]) < 0), class348_sub43)
                        class348_sub43.aClass348_Sub16_Sub5_7081!!.method2916(i_14_, class348_sub16_sub5.method2906())
                    } else class348_sub43.aClass348_Sub16_Sub5_7081 = (SampledVoiceStatics.method2911((class348_sub43.aClass348_Sub19_Sub1_7077!!), class348_sub16_sub5.method2914(), class348_sub16_sub5.method2906(), class348_sub16_sub5.method2892()))
                    if ((class348_sub43.aClass348_Sub17_7085!!.aShortArray6795!![class348_sub43.anInt7071]) < 0) class348_sub43.aClass348_Sub16_Sub5_7081!!.method2917(-1)
                    class348_sub16_sub5.method2902(i_14_)
                    class348_sub16_sub5.method2817(`is`, i_9_, -i_9_ + i)
                    if (class348_sub16_sub5.method2895()) this.aClass348_Sub16_Sub4_8855.method2883(class348_sub16_sub5)
                }
                class348_sub43.anInt7082 += i_11_ * i_12_
            }
            class348_sub43.aClass348_Sub16_Sub5_7081!!.method2817(`is`, i_9_, i_11_)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("bea.H(" + i + ',' + (if (class348_sub43 != null) "{...}" else "null") + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    override fun method2816(): AudioStreamNode? {
        anInt8851++
        val class348_sub43 = (this.aNodeDeque_8848.method1995(4) as SpriteDefinition?)
        if (class348_sub43 == null) return null
        if (class348_sub43.aClass348_Sub16_Sub5_7081 != null) return class348_sub43.aClass348_Sub16_Sub5_7081
        return method2818()
    }
}
