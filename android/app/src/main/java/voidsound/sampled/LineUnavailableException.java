package voidsound.sampled;

/** Thrown when the platform cannot open a PCM output line (no AudioTrack / AudioQueue). */
public class LineUnavailableException extends Exception {
    public LineUnavailableException() {
    }

    public LineUnavailableException(String message) {
        super(message);
    }
}
