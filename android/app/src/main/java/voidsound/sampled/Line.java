package voidsound.sampled;

/** Minimal {@code javax.sound.sampled.Line} surface used by the 634 audio mixer. */
public interface Line {
    public static class Info {
        public Info(Class<?> lineClass, AudioFormat format, int bufferSize) {
        }

        public Info(Class<?> lineClass) {
        }
    }

    void open() throws LineUnavailableException;

    void close();

    void start();

    void flush();
}
