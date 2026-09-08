package voidsound.sampled;

import java.nio.ByteBuffer;

import org.robovm.apple.audiotoolbox.AudioQueue;
import org.robovm.apple.audiotoolbox.AudioQueueBuffer;
import org.robovm.apple.avfoundation.AVAudioSession;
import org.robovm.apple.avfoundation.AVAudioSessionCategory;
import org.robovm.apple.avfoundation.AVAudioSessionCategoryOptions;
import org.robovm.apple.coreaudio.AudioFormatFlags;
import org.robovm.apple.coreaudio.AudioStreamBasicDescription;
import org.robovm.apple.corefoundation.OSStatusException;
import org.robovm.apple.dispatch.DispatchQueue;
import org.robovm.apple.foundation.NSThread;
import org.robovm.rt.VM;

/**
 * iOS PCM sink for the 634 mixer ({@code SourceAudioLine}).
 * <p>
 * Uses AudioQueue (16-bit LE PCM) instead of AVAudioEngine — more reliable under
 * RoboVM. Hard requirements learned the hard way:
 * <ul>
 *   <li>Create/dispose the queue on the <b>main</b> thread — mixer-thread
 *       {@code AudioQueueNewOutput} crashes in {@code objc_retain}.</li>
 *   <li>Copy PCM into the native buffer via {@link VM#newDirectByteBuffer} —
 *       RoboVM {@code setAudioData(byte[])} only points at the Java array and
 *       the GC can reclaim it before Core Audio reads it.</li>
 *   <li>Keep {@link #callback} as a field so the block marshaler cannot GC it.</li>
 * </ul>
 * Android's AudioTrack implementation is excluded in {@code ios/build.gradle};
 * this file is the iOS overlay.
 */
final class PcmSourceDataLine implements SourceDataLine {
    private static final int QUEUE_BUFFERS = 3;
    private static final int BUFFER_BYTES = 4096;

    private final AudioFormat format;
    private final int requestedBufferBytes;
    /** Strong ref — RoboVM block marshaler must not GC the OutputCallback. */
    private final AudioQueue.OutputCallback callback = new AudioQueue.OutputCallback() {
        public void onOutput(AudioQueue q, long bufferPtr) {
            PcmSourceDataLine.this.onOutput(q, bufferPtr);
        }
    };

    private ByteRing ring;
    private AudioQueue queue;
    private volatile boolean running;
    private int channels;
    private int frameSize;
    private int sampleRate;
    private int writes;
    private int maxPeak;

    /**
     * Thin wrapper so we can copy bytes into the Core Audio buffer's native
     * memory (RoboVM's AudioQueueBuffer setters are pointer-only).
     */
    private static final class NativeBuf extends AudioQueueBuffer {
        NativeBuf(long handle) {
            super(handle);
        }

        void putPcm(byte[] src) {
            int cap = getAudioDataBytesCapacity();
            int n = Math.min(src.length, cap);
            if (n <= 0) {
                return;
            }
            ByteBuffer dst = VM.newDirectByteBuffer(getDataPointer(), cap);
            dst.clear();
            dst.put(src, 0, n);
            setAudioDataByteSize(n);
        }
    }

    PcmSourceDataLine(AudioFormat format, int bufferBytes) {
        this.format = format;
        this.requestedBufferBytes = bufferBytes;
    }

    public void open() throws LineUnavailableException {
        synchronized (this) {
            if (running) {
                return;
            }
        }
        channels = format.getChannels() <= 1 ? 1 : 2;
        frameSize = channels * 2;
        sampleRate = Math.max(8000, (int) format.getSampleRate());
        int ringBytes = requestedBufferBytes > 0 ? requestedBufferBytes : sampleRate * frameSize / 2;
        ringBytes = Math.max(ringBytes, frameSize * 2048);
        ring = new ByteRing(ringBytes);
        try {
            // Mixer thread → hop to main before touching AudioQueue APIs.
            runOnMain(new Runnable() {
                public void run() {
                    openOnMain();
                }
            });
        } catch (Throwable t) {
            close();
            throw new LineUnavailableException(String.valueOf(t));
        }
        synchronized (this) {
            running = true;
        }
        System.out.println("void-osrs audio open (AudioQueue/main) " + sampleRate + "Hz ch=" + channels
                + " ring=" + ring.capacity());
    }

    private void openOnMain() {
        try {
            // MixWithOthers so opening the AudioQueue does not steal focus from
            // PiP / Spotify / etc. (plain Playback pauses them even at game mute).
            AVAudioSession session = AVAudioSession.getSharedInstance();
            session.setCategory(AVAudioSessionCategory.Playback,
                    AVAudioSessionCategoryOptions.MixWithOthers);
            session.setActive(true);
            AudioFormatFlags flags = new AudioFormatFlags(
                    AudioFormatFlags.LinearPCMFormatFlagIsSignedInteger.value()
                            | AudioFormatFlags.LinearPCMFormatFlagIsPacked.value());
            AudioStreamBasicDescription asbd = new AudioStreamBasicDescription(
                    sampleRate,
                    org.robovm.apple.coreaudio.AudioFormat.LinearPCM,
                    flags,
                    frameSize,
                    1,
                    frameSize,
                    channels,
                    16);
            queue = AudioQueue.createOutput(asbd, callback);
            // Prime three buffers so the queue never underruns on start.
            byte[] priming = new byte[BUFFER_BYTES];
            fill(priming);
            for (int i = 0; i < QUEUE_BUFFERS; i++) {
                AudioQueueBuffer buf = queue.allocateBuffer(BUFFER_BYTES);
                new NativeBuf(buf.getHandle()).putPcm(priming);
                queue.enqueueBuffer(buf, null);
            }
            queue.start();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        synchronized (this) {
            running = false;
        }
        if (ring != null) {
            ring.clear();
        }
        try {
            runOnMain(new Runnable() {
                public void run() {
                    AudioQueue q = queue;
                    queue = null;
                    if (q == null) {
                        return;
                    }
                    try {
                        q.stop(true);
                    } catch (Exception ignored) {
                    }
                    try {
                        q.dispose(true);
                    } catch (Exception ignored) {
                    }
                }
            });
        } catch (Throwable ignored) {
        }
        ring = null;
    }

    public void start() {
        // AudioQueue starts in openOnMain; nothing else to do.
    }

    public void flush() {
        if (ring != null) {
            ring.clear();
        }
        final AudioQueue q = queue;
        if (q == null) {
            return;
        }
        try {
            runOnMain(new Runnable() {
                public void run() {
                    try {
                        q.flush();
                    } catch (OSStatusException ignored) {
                    }
                }
            });
        } catch (Throwable ignored) {
        }
    }

    /** Free ring space (JavaSound {@code available()}). */
    public int available() {
        ByteRing r = ring;
        return r == null ? 0 : r.free();
    }

    public int write(byte[] b, int off, int len) {
        ByteRing r = ring;
        if (r == null || b == null || len <= 0) {
            return 0;
        }
        int p = peak(b, off, len);
        if (p > maxPeak) {
            maxPeak = p;
        }
        writes++;
        // Sparse logs: splash is peak=0; title music should push peak > 0.
        if (writes == 1 || writes == 50 || (writes % 200 == 0)) {
            System.out.println("void-osrs audio write#" + writes + " len=" + len
                    + " peak=" + p + " max=" + maxPeak + " buffered=" + r.used());
        }
        return r.write(b, off, len);
    }

    /** AudioQueue callback: refill a finished buffer from the ring (or silence). */
    private void onOutput(AudioQueue q, long bufferPtr) {
        if (!running || q == null) {
            return;
        }
        NativeBuf buf = new NativeBuf(bufferPtr);
        int cap = buf.getAudioDataBytesCapacity();
        if (cap <= 0) {
            cap = BUFFER_BYTES;
        }
        cap -= cap % Math.max(1, frameSize);
        byte[] data = new byte[cap];
        fill(data);
        buf.putPcm(data);
        try {
            q.enqueueBuffer(bufferPtr, null);
        } catch (OSStatusException e) {
            System.out.println("void-osrs audio enqueue failed " + e);
        }
    }

    private void fill(byte[] dst) {
        ByteRing r = ring;
        int off = r == null ? 0 : r.read(dst, 0, dst.length);
        if (off < dst.length) {
            for (int i = off; i < dst.length; i++) {
                dst[i] = 0;
            }
        }
    }

    /** Run {@code task} on the main queue and wait (mixer threads call this). */
    private static void runOnMain(final Runnable task) {
        if (NSThread.getCurrentThread().isMainThread()) {
            task.run();
            return;
        }
        final RuntimeException[] fail = new RuntimeException[1];
        final boolean[] done = new boolean[1];
        final Object lock = new Object();
        DispatchQueue.getMainQueue().async(new Runnable() {
            public void run() {
                try {
                    task.run();
                } catch (RuntimeException e) {
                    fail[0] = e;
                } finally {
                    synchronized (lock) {
                        done[0] = true;
                        lock.notifyAll();
                    }
                }
            }
        });
        synchronized (lock) {
            long deadline = System.currentTimeMillis() + 8000L;
            while (!done[0]) {
                long wait = deadline - System.currentTimeMillis();
                if (wait <= 0) {
                    throw new RuntimeException("main audio timeout");
                }
                try {
                    lock.wait(wait);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                }
            }
        }
        if (fail[0] != null) {
            throw fail[0];
        }
    }

    /** Max abs amplitude of LE 16-bit samples — debug for silent mixer. */
    private static int peak(byte[] b, int off, int len) {
        int peak = 0;
        int end = Math.min(b.length, off + len) - 1;
        for (int i = off; i < end; i += 2) {
            int s = (b[i] & 0xff) | (b[i + 1] << 8);
            int a = Math.abs((short) s);
            if (a > peak) {
                peak = a;
            }
        }
        return peak;
    }
}
