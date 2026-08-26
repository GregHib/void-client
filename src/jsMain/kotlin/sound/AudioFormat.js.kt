package sound

import kotlin.js.Promise
import kotlinx.browser.document
import org.w3c.dom.events.Event

private external class AudioContext {
    val destination: AudioDestinationNode
    fun createScriptProcessor(bufferSize: Int, numberOfInputChannels: Int, numberOfOutputChannels: Int): ScriptProcessorNode
    fun resume(): Promise<Unit>
    fun close(): Promise<Unit>
}

private external interface AudioNode {
    fun connect(destination: AudioNode)
    fun disconnect()
}

private external interface AudioDestinationNode : AudioNode

private external class ScriptProcessorNode : AudioNode {
    var onaudioprocess: ((AudioProcessingEvent) -> Unit)?
    override fun connect(destination: AudioNode)
    override fun disconnect()
}

private external class AudioProcessingEvent {
    val outputBuffer: AudioBuffer
}

private external class AudioBuffer {
    fun getChannelData(channel: Int): FloatArray
}

private var audioContextCreateCount = 0

private fun createAudioContext(): AudioContext {
    audioContextCreateCount++
    return js("new (window.AudioContext || window.webkitAudioContext)()") as AudioContext
}

private fun audioContextSupported(): Boolean =
    js("typeof (window.AudioContext || window.webkitAudioContext) !== 'undefined'") as Boolean

// Chrome logs the "AudioContext was prevented from starting automatically" warning as soon as
// an AudioContext is *constructed* without prior user activation, not just when resume() is
// called on one. So both context creation and resume must be deferred until a real user gesture.
private var userGestureOccurred = false
private var gestureListenerRegistered = false
private val pendingActions = mutableListOf<() -> Unit>()

private fun runAfterUserGesture(action: () -> Unit) {
    if (userGestureOccurred) {
        action()
        return
    }
    pendingActions.add(action)
    if (gestureListenerRegistered) return
    gestureListenerRegistered = true
    val handler: (Event) -> Unit = {
        userGestureOccurred = true
        val actions = pendingActions.toList()
        pendingActions.clear()
        for (pending in actions) pending()
    }
    val options = js("({ once: true })")
    document.addEventListener("pointerdown", handler, options)
    document.addEventListener("keydown", handler, options)
    document.addEventListener("touchstart", handler, options)
}

// --- Shim implementation ---

actual class AudioFormat actual constructor(
    private val sampleRate: Float,
    private val sampleSizeInBits: Int,
    private val channels: Int,
    private val signed: Boolean,
    private val bigEndian: Boolean
) {
    actual fun getSampleRate(): Float = sampleRate
    actual fun getSampleSizeInBits(): Int = sampleSizeInBits
    actual fun getChannels(): Int = channels
    actual fun getFrameSize(): Int = channels * (sampleSizeInBits / 8)
    actual fun isBigEndian(): Boolean = bigEndian
}

actual class LineUnavailableException actual constructor(message: String) : Exception(message)

actual class MixerInfo internal constructor(private val name: String) {
    actual fun getName(): String = name
}

actual class DataLineInfo actual constructor(val format: AudioFormat)

actual class SourceDataLine internal constructor(private var format: AudioFormat) {
    private val bufferCapacityBytes = 1 shl 16 // 64KB ring buffer
    private val queue = ArrayDeque<Byte>()

    private var audioContext: AudioContext? = null
    private var node: ScriptProcessorNode? = null
    private var isOpen = false

    private var started = false

    actual fun open(format: AudioFormat) {
        this.format = format
        openInternal()
    }

    actual fun open() = openInternal()

    private fun openInternal() {
        if (isOpen) return
        isOpen = true
        runAfterUserGesture {
            if (!isOpen) return@runAfterUserGesture
            val ctx = createAudioContext()
            val channels = format.getChannels().coerceAtLeast(1)
            val scriptNode = ctx.createScriptProcessor(4096, 0, channels)
            scriptNode.onaudioprocess = { e -> fillBuffer(e.outputBuffer, channels) }
            scriptNode.connect(ctx.destination)
            audioContext = ctx
            node = scriptNode
            started = true
        }
    }

    actual fun start() {
        runAfterUserGesture {
            if (isOpen) audioContext?.resume()?.catch { }
        }
    }

    actual fun close() {
        isOpen = false
        started = false
        node?.disconnect()
        audioContext?.close()?.catch { }
        node = null
        audioContext = null
        queue.clear()
    }

    actual fun flush() {
        queue.clear()
    }

    actual fun write(data: ByteArray, offset: Int, length: Int): Int {
        if (!started) return length
        val toWrite = minOf(length, available())
        for (i in 0 until toWrite) queue.addLast(data[offset + i])
        return toWrite
    }

    actual fun available(): Int = if (!started) bufferCapacityBytes else bufferCapacityBytes - queue.size

    private fun popSample(): Float {
        if (queue.size < 2) return 0f
        val b0 = queue.removeFirst().toInt() and 0xFF
        val b1 = queue.removeFirst().toInt() and 0xFF
        val bits = if (format.isBigEndian()) (b0 shl 8) or b1 else (b1 shl 8) or b0
        return bits.toShort() / 32768f
    }

    private fun fillBuffer(outputBuffer: AudioBuffer, channels: Int) {
        val channelData = Array<FloatArray>(channels) { outputBuffer.getChannelData(it) }
        val frameCount = channelData[0].size
        for (frame in 0 until frameCount) {
            for (ch in 0 until channels) {
                channelData[ch][frame] = popSample()
            }
        }
    }
}

actual object AudioSystem {
    actual fun getMixerInfo(): Array<MixerInfo> =
        arrayOf(MixerInfo("Web Audio Default Output"))

    actual fun getLine(info: DataLineInfo): SourceDataLine {
        if (!audioContextSupported()) {
            throw LineUnavailableException("Web Audio API not supported in this browser")
        }
        return SourceDataLine(info.format)
    }
}