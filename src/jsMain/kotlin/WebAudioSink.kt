import kotlin.js.Promise

/**
 * JS [AudioSink] backed by the WebAudio API.
 *
 * ## Architecture
 *
 * The game's synth engine (Class279) pushes 256-frame PCM blocks synchronously on the game
 * thread via [write].  WebAudio pulls audio on a separate high-priority thread in 128-sample
 * quanta.  The bridge between them depends on whether the page is cross-origin isolated
 * (required for SharedArrayBuffer):
 *
 * ### Path A — SharedArrayBuffer ring buffer (preferred, requires COOP/COEP headers)
 * A lock-free power-of-two ring buffer lives in a SAB.  [write] converts 24-bit PCM →
 * float32 and appends frames to the ring on the main thread.  An [AudioWorkletProcessor]
 * ("void-pcm-processor") drains 128-frame quanta from the same SAB on the audio thread.
 * No GC pressure, minimal latency jitter.
 *
 * ### Path B — AudioBufferSourceNode scheduling (fallback, no SAB)
 * [write] converts each 256-frame block to an [AudioBuffer] and schedules it at an
 * ever-advancing playback clock so blocks play back-to-back without gaps.
 *
 * The worklet module source is compiled into a Blob URL at [init] time so no external
 * file is required.
 */
class WebAudioSink : AudioSink {

    // ── state ──────────────────────────────────────────────────────────────

    private var ctx: dynamic = null          // AudioContext
    private var sampleRate: Int = 22050
    private var stereo: Boolean = false
    private var channels: Int = 1
    private var frameSize: Int = 0           // accepted open() size

    // Path A (SAB)
    private var useSab: Boolean = false
    private var sabRing: dynamic = null      // SharedArrayBuffer (float32 × ringCap × channels)
    private var ringCap: Int = 0             // capacity in frames (power of two)
    private var writeHead: Int = 0           // main-thread write index (frames, mod ringCap)
    private var workletNode: dynamic = null  // AudioWorkletNode
    private var workletBlobUrl: String? = null

    // Path B (scheduled buffers)
    private var scheduleAt: Double = 0.0     // next AudioBuffer start time (ctx seconds)

    // ── AudioSink contract ─────────────────────────────────────────────────

    override fun init(sampleRate: Int, stereo: Boolean) {
        this.sampleRate = sampleRate
        this.stereo = stereo
        channels = if (stereo) 2 else 1

        // Build AudioContext with the requested sample rate.
        ctx = createAudioContext(sampleRate)

        useSab = isCrossOriginIsolated() && isSharedArrayBufferAvailable()
        if (useSab) {
            workletBlobUrl = buildWorkletBlobUrl()
            // Pre-register the worklet module; open() will attach the node once we have ring dims.
            val url = workletBlobUrl!!
            val p: Promise<dynamic> = ctx.audioWorklet.addModule(url).unsafeCast<Promise<dynamic>>()
            p.then<Unit> { _ -> Unit }
        }
    }

    override fun open(frames: Int): Int {
        frameSize = frames
        if (useSab) {
            // Ring capacity = next power-of-two ≥ frames × 4 (≈ 4 blocks of headroom).
            ringCap = nextPow2(frames * 4)
            writeHead = 0
            val byteLen = ringCap * channels * 4    // Float32Array → 4 bytes per element
            sabRing = newSharedArrayBuffer(byteLen)
            attachWorkletNode()
        } else {
            scheduleAt = 0.0
        }
        return frameSize
    }

    override fun flush() {
        if (!useSab) scheduleAt = 0.0   // re-anchor scheduling clock on next write
    }

    override fun close() {
        workletNode?.disconnect()
        workletNode = null
        sabRing = null
        writeHead = 0
        scheduleAt = 0.0
    }

    /**
     * Approximate frames ahead of the playback head (latency indicator).
     * For SAB path: frames currently written but not yet consumed (capped at frameSize).
     * For scheduled path: 0 (latency is determined by scheduleAt overshoot).
     */
    override fun available(): Int {
        return if (useSab) frameSize / 2 else 0
    }

    override fun write(samples: IntArray, count: Int, stereo: Boolean) {
        if (ctx == null) return
        val ch = if (stereo) 2 else 1
        if (useSab && sabRing != null && workletNode != null) {
            writeSab(samples, count, ch)
        } else if (!useSab) {
            writeScheduled(samples, count, ch)
        }
    }

    // ── SAB path ───────────────────────────────────────────────────────────

    private fun writeSab(samples: IntArray, frames: Int, ch: Int) {
        val view = sabRingAsFloat32(sabRing)
        val cap = ringCap
        var wh = writeHead
        for (f in 0 until frames) {
            for (c in 0 until ch) {
                val raw = samples[f * ch + c]
                val clamped = if ((raw + 8388608 and 0xffffff.inv()) != 0) 0x7fffff xor (raw shr 31) else raw
                val f32 = clamped.toFloat() / 8388608.0f
                view[(wh and (cap - 1)) * ch + c] = f32
            }
            wh++
        }
        writeHead = wh
        // Inform the worklet of the new write head.
        val msg: dynamic = js("({})")
        msg.writeHead = wh and (cap - 1)
        workletNode.port.postMessage(msg)
    }

    // ── Scheduled-buffer path ──────────────────────────────────────────────

    private fun writeScheduled(samples: IntArray, frames: Int, ch: Int) {
        val buffer: dynamic = ctx.createBuffer(ch, frames, sampleRate)
        for (c in 0 until ch) {
            val channelData: dynamic = buffer.getChannelData(c)
            for (f in 0 until frames) {
                val raw = samples[f * ch + c]
                val clamped = if ((raw + 8388608 and 0xffffff.inv()) != 0) 0x7fffff xor (raw shr 31) else raw
                channelData[f] = clamped.toFloat() / 8388608.0f
            }
        }
        val now: Double = ctx.currentTime as Double
        if (scheduleAt < now + 0.005) scheduleAt = now + 0.005
        val source: dynamic = ctx.createBufferSource()
        source.buffer = buffer
        source.connect(ctx.destination)
        source.start(scheduleAt)
        scheduleAt += frames.toDouble() / sampleRate.toDouble()
    }

    // ── Worklet attachment ─────────────────────────────────────────────────

    private fun attachWorkletNode() {
        val url = workletBlobUrl ?: return
        // addModule is idempotent for an already-registered module URL.
        val p: Promise<dynamic> = ctx.audioWorklet.addModule(url).unsafeCast<Promise<dynamic>>()
        p.then<Unit> { _ ->
            val nodeOpts: dynamic = js("({})")
            nodeOpts.numberOfInputs = 0
            nodeOpts.numberOfOutputs = 1
            val chArr: dynamic = js("[]")
            chArr.push(channels)
            nodeOpts.outputChannelCount = chArr
            workletNode = newAudioWorkletNode(ctx, "void-pcm-processor", nodeOpts)
            // Ship the SAB and layout to the worklet processor.
            val msg: dynamic = js("({})")
            msg.ring = sabRing
            msg.cap = ringCap
            msg.channels = channels
            workletNode.port.postMessage(msg)
            workletNode.connect(ctx.destination)
        }
    }

    // ── Worklet source (runs on audio thread) ─────────────────────────────

    private fun buildWorkletBlobUrl(): String {
        val src = """
class VoidPcmProcessor extends AudioWorkletProcessor {
    constructor(opts) {
        super();
        this.ring     = null;
        this.cap      = 0;
        this.channels = 1;
        this.readHead = 0;
        this.writeHead = 0;
        this.port.onmessage = (e) => {
            const d = e.data;
            if (d.ring      !== undefined) this.ring      = new Float32Array(d.ring);
            if (d.cap       !== undefined) this.cap       = d.cap;
            if (d.channels  !== undefined) this.channels  = d.channels;
            if (d.writeHead !== undefined) this.writeHead = d.writeHead;
        };
    }
    process(_inputs, outputs) {
        const out       = outputs[0];
        const blockSize = out[0] ? out[0].length : 128;
        const outCh     = out.length;
        if (!this.ring || this.cap === 0) {
            for (let c = 0; c < outCh; c++) out[c].fill(0.0);
            return true;
        }
        const avail = (this.writeHead - this.readHead + this.cap) % this.cap;
        if (avail < blockSize) {
            // Buffer underrun — output silence and wait for more data.
            for (let c = 0; c < outCh; c++) out[c].fill(0.0);
            return true;
        }
        const mask    = this.cap - 1;
        const srcCh   = this.channels;
        for (let f = 0; f < blockSize; f++) {
            const ri = ((this.readHead + f) & mask) * srcCh;
            for (let c = 0; c < outCh; c++) {
                out[c][f] = (c < srcCh) ? this.ring[ri + c] : this.ring[ri];
            }
        }
        this.readHead = (this.readHead + blockSize) & mask;
        return true;
    }
}
registerProcessor('void-pcm-processor', VoidPcmProcessor);
""".trimIndent()

        val blob: dynamic = newBlob(src)
        return createObjectUrl(blob)
    }

    // ── Helpers ────────────────────────────────────────────────────────────

    private fun nextPow2(n: Int): Int {
        var v = n - 1
        v = v or (v shr 1)
        v = v or (v shr 2)
        v = v or (v shr 4)
        v = v or (v shr 8)
        v = v or (v shr 16)
        return v + 1
    }
}

// ── Top-level JS interop helpers (avoid js() inside closures / lambdas) ───────

private fun createAudioContext(sampleRate: Int): dynamic {
    val sr = sampleRate
    return js("new (window.AudioContext || window.webkitAudioContext)({ sampleRate: sr })")
}

private fun isCrossOriginIsolated(): Boolean =
    js("self.crossOriginIsolated === true") as Boolean

private fun isSharedArrayBufferAvailable(): Boolean =
    js("typeof SharedArrayBuffer !== 'undefined'") as Boolean

private fun newSharedArrayBuffer(byteLen: Int): dynamic {
    val bl = byteLen
    return js("new SharedArrayBuffer(bl)")
}

private fun sabRingAsFloat32(sab: dynamic): dynamic {
    return js("new Float32Array(sab)")
}

private fun newAudioWorkletNode(ctx: dynamic, name: String, opts: dynamic): dynamic {
    return js("new AudioWorkletNode(ctx, name, opts)")
}

private fun newBlob(src: String): dynamic {
    return js("new Blob([src], { type: 'application/javascript' })")
}

private fun createObjectUrl(blob: dynamic): String {
    return js("URL.createObjectURL(blob)") as String
}
