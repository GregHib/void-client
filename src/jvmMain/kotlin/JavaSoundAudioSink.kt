import Class286_Sub4.Companion.method2155
import Class33.Companion.method340
import javax.sound.sampled.AudioFormat
import javax.sound.sampled.AudioSystem
import javax.sound.sampled.DataLine
import javax.sound.sampled.LineUnavailableException
import javax.sound.sampled.Mixer
import javax.sound.sampled.SourceDataLine

/**
 * JVM [AudioSink] backed by javax.sound.sampled.SourceDataLine.
 *
 * Lifted verbatim from the former Class279_Sub1 so JVM playback behaviour is byte-identical:
 * same DataLine.Info buffer sizing, the same LineUnavailableException size-retry (Class286_Sub4 /
 * Class33), the same "soundmax" mixer quirk that forces a flush-time reopen, and the same
 * 24-bit -> little-endian 16-bit sample conversion.
 */
class JavaSoundAudioSink : AudioSink {
    private var frameSize = 0
    private var byteBuffer: ByteArray = byteArrayOf()
    private var line: SourceDataLine? = null
    private var soundmax = false
    private var format: AudioFormat? = null
    private var stereo = false

    override fun init(sampleRate: Int, stereo: Boolean) {
        this.stereo = stereo
        val infos = AudioSystem.getMixerInfo()
        if (null != infos) {
            val infos_0_: Array<Mixer.Info?>? = infos
            for (i in infos_0_!!.indices) {
                val info = infos_0_[i]
                if (info != null) {
                    val string = info.getName()
                    if (null != string && string.lowercase().indexOf("soundmax") >= 0) soundmax = true
                }
            }
        }
        format = AudioFormat(sampleRate.toFloat(), 16, if (stereo) 2 else 1, true, false)
        byteBuffer = ByteArray(256 shl (if (!stereo) 1 else 2))
    }

    @Throws(LineUnavailableException::class)
    override fun open(frames: Int): Int {
        try {
            val info = DataLine.Info(SourceDataLine::class.java, format, frames shl (if (stereo) 2 else 1))
            line = AudioSystem.getLine(info) as SourceDataLine?
            line!!.open()
            line!!.start()
            frameSize = frames
        } catch (lineunavailableexception: LineUnavailableException) {
            if (1 == method2155(frames, 43.toByte())) {
                line = null
                throw lineunavailableexception
            } else open(method340(frames, 108.toByte()))
        }
        return frameSize
    }

    override fun available(): Int {
        return frameSize - (line!!.available() shr (if (stereo) 2 else 1))
    }

    @Throws(LineUnavailableException::class)
    override fun flush() {
        line!!.flush()
        if (soundmax) {
            line!!.close()
            line = null
            val info = DataLine.Info(SourceDataLine::class.java, format, frameSize shl (if (!stereo) 1 else 2))
            line = AudioSystem.getLine(info) as SourceDataLine?
            line!!.open()
            line!!.start()
        }
    }

    override fun close() {
        if (null != line) {
            line!!.close()
            line = null
        }
    }

    override fun write(samples: IntArray, count: Int, stereo: Boolean) {
        var i = count
        if (stereo) i = i shl 1
        for (i_1_ in 0..<i) {
            var i_2_ = samples[i_1_]
            if ((i_2_ + 8388608 and 0xffffff.inv()) != 0) i_2_ = 0x7fffff xor (i_2_ shr 31)
            byteBuffer[i_1_ * 2] = (i_2_ shr 8).toByte()
            byteBuffer[i_1_ * 2 + 1] = (i_2_ shr 16).toByte()
        }
        line!!.write(byteBuffer, 0, i shl 1)
    }
}
