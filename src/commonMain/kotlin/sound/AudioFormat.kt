package sound

expect class AudioFormat(
    sampleRate: Float,
    sampleSizeInBits: Int,
    channels: Int,
    signed: Boolean,
    bigEndian: Boolean
) {
    fun getSampleRate(): Float
    fun getSampleSizeInBits(): Int
    fun getChannels(): Int
    fun getFrameSize(): Int
    fun isBigEndian(): Boolean
}

expect class LineUnavailableException(message: String) : Exception

expect class MixerInfo {
    fun getName(): String
}

expect class DataLineInfo(format: AudioFormat)

expect class SourceDataLine {
    fun open(format: AudioFormat)
    fun open()
    fun start()
    fun close()
    fun flush()
    fun write(data: ByteArray, offset: Int, length: Int): Int
    fun available(): Int
}

expect object AudioSystem {
    fun getMixerInfo(): Array<MixerInfo>
    fun getLine(info: DataLineInfo): SourceDataLine
}