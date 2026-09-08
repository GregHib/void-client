package voidsound.sampled;

/**
 * Writable PCM line — {@code javax.sound.sampled.DataLine} subset used by
 * {@code SourceAudioLine} ({@link #available}, {@link #write}).
 */
public interface DataLine extends Line {
    /**
     * Carries the requested PCM format and hardware buffer size (bytes) that
     * {@code SourceAudioLine.method2082} computed from the mixer sample count.
     */
    public static class Info extends Line.Info {
        private final AudioFormat format;
        private final int bufferSize;

        public Info(Class<?> lineClass, AudioFormat format, int bufferSize) {
            super(lineClass, format, bufferSize);
            this.format = format;
            this.bufferSize = bufferSize;
        }

        public AudioFormat getFormat() {
            return format;
        }

        public int getBufferSize() {
            return bufferSize;
        }
    }

    /**
     * Free space in the line buffer (bytes). Must match JavaSound semantics —
     * {@code SourceAudioLine.method2081} treats this as "how much can still be written".
     */
    int available();

    /** Blocks until {@code len} bytes are queued (or the line closes). */
    int write(byte[] b, int off, int len);
}
