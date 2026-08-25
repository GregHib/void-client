package sound

import javax.sound.sampled.AudioFormat as JAudioFormat
import javax.sound.sampled.AudioSystem as JAudioSystem
import javax.sound.sampled.DataLine as JDataLine
import javax.sound.sampled.LineUnavailableException as JLineUnavailableException
import javax.sound.sampled.Mixer as JMixer
import javax.sound.sampled.SourceDataLine as JSourceDataLine

actual class AudioFormat actual constructor(
    sampleRate: Float,
    sampleSizeInBits: Int,
    channels: Int,
    signed: Boolean,
    bigEndian: Boolean
) {
    internal val delegate = JAudioFormat(sampleRate, sampleSizeInBits, channels, signed, bigEndian)
    actual fun getSampleRate(): Float = delegate.sampleRate
    actual fun getSampleSizeInBits(): Int = delegate.sampleSizeInBits
    actual fun getChannels(): Int = delegate.channels
    actual fun getFrameSize(): Int = delegate.frameSize
    actual fun isBigEndian(): Boolean = delegate.isBigEndian
}

actual class LineUnavailableException actual constructor(message: String) : Exception(message)

actual class MixerInfo internal constructor(internal val delegate: JMixer.Info) {
    actual fun getName(): String = delegate.name
}

actual class DataLineInfo actual constructor(format: AudioFormat) {
    internal val delegate = JDataLine.Info(JSourceDataLine::class.java, format.delegate)
}

actual class SourceDataLine internal constructor(internal val delegate: JSourceDataLine) {
    actual fun open(format: AudioFormat) = wrapLUE { delegate.open(format.delegate) }
    actual fun open() = wrapLUE { delegate.open() }
    actual fun start() = delegate.start()
    actual fun close() = delegate.close()
    actual fun flush() = delegate.flush()
    actual fun write(data: ByteArray, offset: Int, length: Int): Int = delegate.write(data, offset, length)
    actual fun available(): Int = delegate.available()

    private inline fun wrapLUE(block: () -> Unit) {
        try {
            block()
        } catch (e: JLineUnavailableException) {
            throw LineUnavailableException(e.message ?: "line unavailable")
        }
    }
}

actual object AudioSystem {
    actual fun getMixerInfo(): Array<MixerInfo> =
        JAudioSystem.getMixerInfo().map { MixerInfo(it) }.toTypedArray()

    actual fun getLine(info: DataLineInfo): SourceDataLine {
        try {
            val line = JAudioSystem.getLine(info.delegate) as JSourceDataLine
            return SourceDataLine(line)
        } catch (e: JLineUnavailableException) {
            throw LineUnavailableException(e.message ?: "line unavailable")
        }
    }
}