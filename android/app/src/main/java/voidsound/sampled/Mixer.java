package voidsound.sampled;

/**
 * Stub mixer list for {@link AudioSystem#getMixerInfo}. The client only scans
 * names for "soundmax" (SoundMAX reopen workaround in {@code SourceAudioLine}).
 */
public abstract class Mixer {
    public static class Info {
        public String getName() {
            return "";
        }
    }
}
