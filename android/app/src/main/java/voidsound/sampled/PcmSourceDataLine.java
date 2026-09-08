package voidsound.sampled;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.util.Log;

/**
 * Android PCM sink for the 634 mixer ({@code SourceAudioLine}).
 * <p>
 * Mixer thread writes LE 16-bit frames into a {@link ByteRing}; a dedicated
 * high-priority pump drains the ring into {@link AudioTrack} (MODE_STREAM).
 * Some devices reject 22050 Hz — we fall back to 44100 and duplicate each
 * sample frame ({@link #stretch2x}).
 * <p>
 * Shared with iOS via Gradle copy, but iOS excludes this file and ships its
 * own AudioQueue-based {@code PcmSourceDataLine}.
 */
final class PcmSourceDataLine implements SourceDataLine {
    private static final String TAG = "void-osrs";

    private final voidsound.sampled.AudioFormat format;
    private final int requestedBufferBytes;

    private ByteRing ring;
    private AudioTrack track;
    private Thread pump;
    private volatile boolean running;
    private int srcRate;
    private int outRate;
    private int channels;
    private int srcFrameSize;
    private boolean logged;

    PcmSourceDataLine(voidsound.sampled.AudioFormat format, int bufferBytes) {
        this.format = format;
        this.requestedBufferBytes = bufferBytes;
    }

    public synchronized void open() throws LineUnavailableException {
        if (track != null) {
            return;
        }
        srcRate = Math.max(8000, (int) format.getSampleRate());
        channels = format.getChannels() <= 1 ? 1 : 2;
        srcFrameSize = channels * 2;
        int channelMask = channels == 2
                ? AudioFormat.CHANNEL_OUT_STEREO
                : AudioFormat.CHANNEL_OUT_MONO;

        // Prefer native rate; many phones only accept 44100/48000.
        outRate = srcRate;
        int min = AudioTrack.getMinBufferSize(outRate, channelMask, AudioFormat.ENCODING_PCM_16BIT);
        if (min <= 0) {
            outRate = srcRate == 22050 ? 44100 : 48000;
            min = AudioTrack.getMinBufferSize(outRate, channelMask, AudioFormat.ENCODING_PCM_16BIT);
        }
        if (min <= 0) {
            throw new LineUnavailableException("min buffer " + srcRate);
        }

        int hwBytes = Math.max(min * 2, 4096);
        try {
            track = new AudioTrack.Builder()
                    .setAudioAttributes(new AudioAttributes.Builder()
                            .setUsage(AudioAttributes.USAGE_MEDIA)
                            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                            .build())
                    .setAudioFormat(new AudioFormat.Builder()
                            .setSampleRate(outRate)
                            .setChannelMask(channelMask)
                            .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                            .build())
                    .setTransferMode(AudioTrack.MODE_STREAM)
                    .setBufferSizeInBytes(hwBytes)
                    .build();
        } catch (Exception e) {
            throw new LineUnavailableException(String.valueOf(e));
        }
        if (track.getState() != AudioTrack.STATE_INITIALIZED) {
            track.release();
            track = null;
            throw new LineUnavailableException("AudioTrack");
        }
        track.setVolume(1f);
        int ringBytes = requestedBufferBytes > 0 ? requestedBufferBytes : srcRate * srcFrameSize / 2;
        ringBytes = Math.max(ringBytes, srcFrameSize * 2048);
        ring = new ByteRing(ringBytes);
        running = true;
        pump = new Thread(new Runnable() {
            public void run() {
                pumpLoop();
            }
        }, "void-pcm");
        pump.setDaemon(true);
        pump.setPriority(Thread.MAX_PRIORITY);
        pump.start();
        Log.i(TAG, "audio open src=" + srcRate + " out=" + outRate + " ch=" + channels
                + " ring=" + ring.capacity() + " hw=" + hwBytes);
    }

    public synchronized void close() {
        running = false;
        if (ring != null) {
            ring.clear();
        }
        if (pump != null) {
            pump.interrupt();
            pump = null;
        }
        if (track != null) {
            try {
                track.pause();
                track.flush();
                track.stop();
            } catch (Exception ignored) {
            }
            track.release();
            track = null;
        }
        ring = null;
    }

    public synchronized void start() {
        if (track != null && track.getPlayState() != AudioTrack.PLAYSTATE_PLAYING) {
            track.play();
        }
    }

    public synchronized void flush() {
        if (ring != null) {
            ring.clear();
        }
        if (track != null) {
            try {
                track.pause();
                track.flush();
                track.play();
            } catch (Exception ignored) {
            }
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
        // peak=0 during splash is normal; after title music loads it should rise.
        if (!logged) {
            logged = true;
            Log.i(TAG, "audio first write " + len + " peak=" + peak(b, off, len));
        }
        return r.write(b, off, len);
    }

    /** Drain ring → AudioTrack; stretch when hw rate is 2× game rate. */
    private void pumpLoop() {
        byte[] src = new byte[512 * srcFrameSize];
        byte[] stretched = outRate != srcRate ? new byte[src.length * 4] : src;
        while (running) {
            ByteRing r = ring;
            AudioTrack t = track;
            if (r == null || t == null) {
                break;
            }
            int n = r.read(src, 0, src.length);
            if (n <= 0) {
                try {
                    Thread.sleep(2L);
                } catch (InterruptedException e) {
                    break;
                }
                continue;
            }
            if (t.getPlayState() != AudioTrack.PLAYSTATE_PLAYING) {
                try {
                    t.play();
                } catch (Exception ignored) {
                }
            }
            byte[] out = src;
            int outLen = n;
            if (outRate == srcRate * 2) {
                outLen = stretch2x(src, n, stretched);
                out = stretched;
            }
            int w = 0;
            while (w < outLen && running) {
                int wrote = t.write(out, w, outLen - w, AudioTrack.WRITE_BLOCKING);
                if (wrote <= 0) {
                    try {
                        t.play();
                    } catch (Exception ignored) {
                    }
                    break;
                }
                w += wrote;
            }
        }
    }

    /** Nearest-neighbour upsample: duplicate each frame (22050 → 44100). */
    private int stretch2x(byte[] src, int len, byte[] dst) {
        int frames = len / srcFrameSize;
        int o = 0;
        for (int f = 0; f < frames; f++) {
            int i = f * srcFrameSize;
            System.arraycopy(src, i, dst, o, srcFrameSize);
            o += srcFrameSize;
            System.arraycopy(src, i, dst, o, srcFrameSize);
            o += srcFrameSize;
        }
        return o;
    }

    /** Max abs amplitude of LE 16-bit samples — debug for "is the mixer silent?". */
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
