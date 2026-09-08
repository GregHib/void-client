package voidsound.sampled;

/**
 * Stand-in for {@code javax.sound.sampled.AudioSystem}.
 * <p>
 * The 634 mixer ({@code SourceAudioLine}) calls {@link #getLine} for a
 * {@link SourceDataLine}. Returning a real {@link PcmSourceDataLine} is what
 * makes music/SFX audible on mobile — stubs that threw here fell through to an
 * empty mixer with no PCM output.
 */
public class AudioSystem {
    private static final Mixer.Info MIXER = new Mixer.Info();

    /** Probe used by the client to detect weird mixers (e.g. "SoundMAX"). */
    public static Mixer.Info[] getMixerInfo() {
        return new Mixer.Info[] { MIXER };
    }

    /**
     * Opens a PCM output line matching {@code info}'s format/buffer size.
     * Always returns {@link PcmSourceDataLine} (Android: AudioTrack; iOS has
     * its own overlay of that class).
     */
    public static Line getLine(Line.Info info) throws LineUnavailableException {
        AudioFormat format = null;
        int bufferSize = 0;
        if (info instanceof DataLine.Info) {
            DataLine.Info di = (DataLine.Info) info;
            format = di.getFormat();
            bufferSize = di.getBufferSize();
        }
        if (format == null) {
            throw new LineUnavailableException("no format");
        }
        return new PcmSourceDataLine(format, bufferSize);
    }
}
