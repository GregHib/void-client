import Class286_Sub4.Companion.method2155
import Class33.Companion.method340
import java.awt.Component
import java.util.*
import javax.sound.sampled.*

class Class279_Sub1 : Class279() {
    private var anInt6175 = 0
    private var aByteArray6176: ByteArray = byteArrayOf()
    private var aSourceDataLine6177: SourceDataLine? = null
    private var aBoolean6178 = false
    private var anAudioFormat6179: AudioFormat? = null
    override fun method2091() {
        if (null != aSourceDataLine6177) {
            aSourceDataLine6177!!.close()
            aSourceDataLine6177 = null
        }
    }

    @Throws(LineUnavailableException::class)
    override fun method2082(i: Int) {
        try {
            val info = (DataLine.Info((if (aClass6180 == null) (SourceDataLine::class.java.also { aClass6180 = it }) else aClass6180), anAudioFormat6179, i shl (if (Class282.aBoolean3652) 2 else 1)))
            aSourceDataLine6177 = AudioSystem.getLine(info) as SourceDataLine?
            aSourceDataLine6177!!.open()
            aSourceDataLine6177!!.start()
            anInt6175 = i
        } catch (lineunavailableexception: LineUnavailableException) {
            if (1 == method2155(i, 43.toByte())) {
                aSourceDataLine6177 = null
                throw lineunavailableexception
            } else method2082(method340(i, 108.toByte()))
        }
    }

    override fun method2095(component: Component?) {
        val infos = AudioSystem.getMixerInfo()
        if (null != infos) {
            val infos_0_: Array<Mixer.Info?>? = infos
            for (i in infos_0_!!.indices) {
                val info = infos_0_[i]
                if (info != null) {
                    val string = info.getName()
                    if (null != string && string.lowercase(Locale.getDefault()).indexOf("soundmax") >= 0) aBoolean6178 = true
                }
            }
        }
        anAudioFormat6179 = AudioFormat(Class22.anInt339.toFloat(), 16, if (Class282.aBoolean3652) 2 else 1, true, false)
        aByteArray6176 = ByteArray(256 shl (if (!Class282.aBoolean3652) 1 else 2))
    }

    override fun method2081(): Int {
        return anInt6175 - (aSourceDataLine6177!!.available() shr (if (Class282.aBoolean3652) 2 else 1))
    }

    @Throws(LineUnavailableException::class)
    override fun method2083() {
        aSourceDataLine6177!!.flush()
        if (aBoolean6178) {
            aSourceDataLine6177!!.close()
            aSourceDataLine6177 = null
            val info = (DataLine.Info((if (aClass6180 == null) (SourceDataLine::class.java.also { aClass6180 = it }) else aClass6180), anAudioFormat6179, anInt6175 shl (if (!Class282.aBoolean3652) 1 else 2)))
            aSourceDataLine6177 = AudioSystem.getLine(info) as SourceDataLine?
            aSourceDataLine6177!!.open()
            aSourceDataLine6177!!.start()
        }
    }

    override fun method2094() {
        var i = 256
        if (Class282.aBoolean3652) i = i shl 1
        for (i_1_ in 0..<i) {
            var i_2_ = this.anIntArray3603!![i_1_]
            if ((i_2_ + 8388608 and 0xffffff.inv()) != 0) i_2_ = 0x7fffff xor (i_2_ shr 31)
            aByteArray6176[i_1_ * 2] = (i_2_ shr 8).toByte()
            aByteArray6176[i_1_ * 2 + 1] = (i_2_ shr 16).toByte()
        }
        aSourceDataLine6177!!.write(aByteArray6176, 0, i shl 1)
    }

    companion object {
        var aClass6180: Class<*>? = null
    }
}
