import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Dumps every song in the music archive (index 6) to raw .mid files and renders each to a
 * playable .wav using the game's OWN software synthesizer (Class348_Sub16_Sub3 /
 * Class348_Sub16_Sub1), so instruments match what actually plays in-game rather than a generic
 * MIDI soundfont. Triggered once from Class164 once every archive it depends on (4, 6, 14, 15)
 * has been loaded during cache load.
 */
final class MidiSongDumper {
    private static boolean dumped = false;

    private static final int SAMPLE_RATE = 22050; // matches IOException_Sub1.method131's fixed rate
    private static final int SAMPLE_LOAD_BUDGET = 50_000_000; // generous per-call sample-load byte budget; see renderToWav
    private static final boolean STEREO = true;
    private static final int CHANNELS = STEREO ? 2 : 1;
    private static final int FRAME_CHUNK = 256; // matches the real mixer's own chunk size (Class279)
    private static final int TAIL_CHUNKS = (SAMPLE_RATE * 2) / FRAME_CHUNK; // ~2s release/reverb tail
    private static final int MAX_CHUNKS = (SAMPLE_RATE * 600) / FRAME_CHUNK; // 10 minute safety cap

    static void dumpAll(Class45 musicArchive) {
        if (dumped) return;
        dumped = true;
        System.out.println("Starting MIDI dump");

        Class22.anInt339 = SAMPLE_RATE;
        Class282.aBoolean3652 = STEREO;

        Class26 spriteArchiveLoader = new Class26(Class129.aClass45_1878, Class239_Sub4.aClass45_5878);
        Class45 instrumentArchive = Class123.aClass45_1815;

        Class348_Sub16_Sub3 player = new Class348_Sub16_Sub3();
        player.method2841(9, -94, 128);
        player.method2843(255, -1, -7836);

        int groupCount = musicArchive.method414(-1);
        if (groupCount <= 0) return;
        File dir = new File("dump/midi");
        dir.mkdirs();
        int written = 0;
        for (int group = 0; group < groupCount; group++) {
            int fileCount = musicArchive.method407(0, group);
            for (int file = 0; file < fileCount; file++) {
                Class348_Sub2 builder = Class348_Sub2.method2734(musicArchive, group, file);
                if (builder == null || builder.aByteArray6564 == null) continue;
                String name = group + "";
                try {
                    renderToWav(player, spriteArchiveLoader, instrumentArchive, builder, new File(dir, name + ".wav"));
                } catch (Exception e) {
                    System.out.println("Failed to render " + name + " to wav: " + describe(e));
                }
                written++;
            }
        }
        System.out.println("Dumped " + written + " MIDI songs to " + dir.getAbsolutePath());
    }

    /**
     * RuntimeException_Sub1 (this game's catch-all wrapper) stores the real cause in its own field
     * rather than via Throwable's standard cause mechanism, so printStackTrace() on it only ever
     * shows where it was constructed - never the original failure. Unwrap it manually.
     */
    private static String describe(Throwable t) {
        StringBuilder sb = new StringBuilder();
        while (t != null) {
            sb.append(t.getClass().getSimpleName());
            if (t.getMessage() != null) sb.append('(').append(t.getMessage()).append(')');
            if (t instanceof RuntimeException_Sub1) {
                RuntimeException_Sub1 wrapped = (RuntimeException_Sub1) t;
                sb.append(" [").append(wrapped.aString4594).append(']');
                t = wrapped.aThrowable4595;
            } else {
                t = t.getCause();
            }
            if (t != null) sb.append(" caused by ");
        }
        return sb.toString();
    }

    private static void writeBytes(File file, byte[] bytes) throws IOException {
        try (FileOutputStream out = new FileOutputStream(file)) {
            out.write(bytes);
        }
    }

    /**
     * Drives the player exactly like a real song change (see Class286_Sub6.method2163) but pulls
     * PCM straight out of method2817 instead of pushing it to a live SourceDataLine, so it renders
     * as fast as the CPU allows rather than in real time. The int[] -> 16-bit PCM conversion mirrors
     * Class279_Sub1.method2094, the code that normally feeds this exact buffer to the sound card:
     * each int is a 24-bit-range accumulator sample: saturate to [-8388608, 8388607], then the
     * top 16 bits (>> 8) are the little-endian PCM sample.
     *
     * method2866's 2nd param doubles as a per-call byte budget for freshly-loaded (uncached)
     * instrument samples (see Class26.method307: "is[0] -= sampleBytes.length", returning null -
     * i.e. a failed load - once the budget is exhausted). It's never used as an actual sample rate
     * anywhere in method2866 itself, despite real production code passing the same 22050 constant
     * for both purposes - that's a coincidence of reuse, not a requirement. Retrying alone doesn't
     * fix a starved sample: hashtable iteration order is fixed, so the same earlier samples consume
     * the budget first on every attempt, permanently starving whatever comes later. A budget this
     * generous means everything fits in one pass; the retry loop below is just a harmless safety net.
     *
     * Deliberately skips method2864 here (unlike the real per-song-change call in
     * Class286_Sub6.method2163): it unconditionally nulls every cached Class348_Sub17's
     * anIntArray6793 scratch array, not just the current song's instruments. In real gameplay that's
     * apparently harmless, but batching hundreds of songs back-to-back means the very next song to
     * reuse any previously-loaded instrument hits a null array in method2932 - and since the cache
     * entry itself is never removed or re-fetched, it fails permanently once nulled.
     */
    private static void renderToWav(Class348_Sub16_Sub3 player, Class26 spriteArchiveLoader, Class45 instrumentArchive, Class348_Sub2 builder, File out) throws Exception {
        boolean loaded = false;
        for (int attempt = 0; attempt < 20 && !loaded; attempt++) {
            loaded = player.method2866(builder, SAMPLE_LOAD_BUDGET, spriteArchiveLoader, instrumentArchive, -35);
        }
        if (!loaded) System.out.println("Warning: some instrument samples never loaded for " + out.getName());
        player.method2869(builder, false, false);

        ByteArrayOutputStream pcm = new ByteArrayOutputStream();
        int[] buffer = new int[FRAME_CHUNK * CHANNELS];
        int silentChunks = 0;
        for (int chunk = 0; chunk < MAX_CHUNKS; chunk++) {
            boolean trackActive = player.method2860(0);
            Arrays.fill(buffer, 0);
            player.method2817(buffer, 0, FRAME_CHUNK);
            appendPcm16(pcm, buffer);
            if (!trackActive) {
                if (isSilent(buffer)) {
                    if (++silentChunks >= TAIL_CHUNKS) break;
                } else {
                    silentChunks = 0;
                }
            }
        }

        byte[] bytes = pcm.toByteArray();
        AudioFormat format = new AudioFormat(SAMPLE_RATE, 16, CHANNELS, true, false);
        long frameLength = bytes.length / (2L * CHANNELS);
        AudioInputStream stream = new AudioInputStream(new ByteArrayInputStream(bytes), format, frameLength);
        AudioSystem.write(stream, AudioFileFormat.Type.WAVE, out);
    }

    private static boolean isSilent(int[] buffer) {
        for (int v : buffer) if (v != 0) return false;
        return true;
    }

    private static void appendPcm16(ByteArrayOutputStream pcm, int[] buffer) {
        for (int v : buffer) {
            if (((v + 8388608) & ~0xffffff) != 0) v = 0x7fffff ^ (v >> 31);
            short sample = (short) (v >> 8);
            pcm.write(sample & 0xff);
            pcm.write((sample >> 8) & 0xff);
        }
    }
}
