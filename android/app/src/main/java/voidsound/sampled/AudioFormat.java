package voidsound.sampled;

/**
 * PCM format descriptor — mirrors {@code javax.sound.sampled.AudioFormat}.
 * <p>
 * RS634 opens 16-bit little-endian PCM at {@code Component231.anInt339} Hz
 * (typically 22050), mono or stereo via {@code Component21.aBoolean3652}.
 */
public class AudioFormat {
    private final float sampleRate;
    private final int sampleSizeInBits;
    private final int channels;
    private final boolean signed;
    private final boolean bigEndian;

    public AudioFormat(float sampleRate, int sampleSizeInBits, int channels, boolean signed, boolean bigEndian) {
        this.sampleRate = sampleRate;
        this.sampleSizeInBits = sampleSizeInBits;
        this.channels = channels;
        this.signed = signed;
        this.bigEndian = bigEndian;
    }

    public float getSampleRate() {
        return sampleRate;
    }

    public int getSampleSizeInBits() {
        return sampleSizeInBits;
    }

    public int getChannels() {
        return channels;
    }

    public boolean isSigned() {
        return signed;
    }

    public boolean isBigEndian() {
        return bigEndian;
    }

    /** Bytes per sample frame (all channels). */
    public int getFrameSize() {
        int bits = sampleSizeInBits <= 0 ? 16 : sampleSizeInBits;
        int ch = channels <= 0 ? 1 : channels;
        return ((bits + 7) / 8) * ch;
    }
}
