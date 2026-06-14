/**
 * Platform PCM audio sink (the plan's "AudioSink" seam, replacing javax.sound.sampled).
 *
 * Captures exactly the device-side lifecycle the synth engine (Class279) drives: configure the
 * format, open a buffered line of a given frame capacity, push signed-16-bit PCM, query latency,
 * flush, and close. The portable mixing/synthesis stays in Class279; only the device backend lives
 * behind this interface.
 *
 * JVM impl: JavaSoundAudioSink (SourceDataLine). Web: WebAudio AudioWorklet. Native: OpenAL/miniaudio.
 */
interface AudioSink {
    /** Configure output format. Called once before [open]. */
    fun init(sampleRate: Int, stereo: Boolean)

    /**
     * (Re)open the underlying line sized for [frames] frames of latency, then start playback.
     * The backend may negotiate a smaller buffer; the accepted frame count is returned and becomes
     * the sink's working size for [available].
     */
    fun open(frames: Int): Int

    /** Flush pending audio; the backend may reopen the line if its hardware requires it. */
    fun flush()

    /** Close the underlying line and release it. Safe to call when not open. */
    fun close()

    /** Frames currently queued ahead of the playback head (latency), in frames. */
    fun available(): Int

    /**
     * Convert and write [count] frames of 24-bit signed samples from [samples] (interleaved when
     * [stereo]) to the line as little-endian signed 16-bit PCM.
     */
    fun write(samples: IntArray, count: Int, stereo: Boolean)
}

/**
 * Platform factory for [AudioSink] instances.
 *
 * Holds a constructor lambda so each [Class279] subclass that drives a synth engine
 * gets its own independent [AudioSink] — sharing one instance across multiple engine
 * instances would cause SourceDataLine / WebAudio contention.
 *
 * JVM: registered by [ClientBootstrap.installCommon] with `{ JavaSoundAudioSink() }`.
 * JS:  registered by [ClientBootstrap.installCommon] with `{ WebAudioSink() }`.
 */
object AudioSinks {
    private lateinit var ctor: () -> AudioSink

    fun install(factory: () -> AudioSink) {
        ctor = factory
    }

    /** Create a new [AudioSink] instance for one synth-engine lifetime. */
    fun create(): AudioSink = ctor()
}
