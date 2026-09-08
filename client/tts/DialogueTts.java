/** Stable façade; Piper/Sherpa can replace the engine without changing the hook. */
public final class DialogueTts {
    /**
     * DISABLED 2026-08-30: dialogue TTS freezes the client hard (scanner every tick +
     * native {@code say}/AVSpeech/Android TTS). Re-enable only after the path is
     * off-thread and rate-limited. Set true to turn back on.
     */
    private static final boolean ENABLED = false;

    private static volatile DialogueTtsEngine engine = new NativeDialogueTtsEngine();
    private static String lastText;

    public static synchronized void speak(String text, VoiceGender gender) {
        if (!ENABLED) return;
        String cleaned = strip(text);
        if (cleaned.length() == 0 || cleaned.equals(lastText)) return;
        lastText = cleaned;
        System.out.println("void-tts: " + gender + " " + cleaned);
        engine.speak(cleaned, gender);
    }

    public static synchronized void stop() {
        if (!ENABLED) return;
        lastText = null;
        engine.stop();
    }

    /** Replace the backend without changing the dialogue hook (Piper can use this later). */
    public static synchronized void setEngine(DialogueTtsEngine replacement) {
        if (replacement == null) throw new IllegalArgumentException("replacement");
        engine.stop();
        engine = replacement;
        lastText = null;
    }

    /** Called once per client logic tick. Future selection: System property void.tts=piper. */
    public static void pulse() {
        // Disabled — see {@link #ENABLED}. Chatbox scan + OS TTS was locking the game loop.
        if (!ENABLED) return;
        DialogueChatboxScanner.pulse();
    }

    static String strip(String text) {
        if (text == null) return "";
        return text.replaceAll("<[^>]*>", " ").replaceAll("\\s+", " ").trim();
    }
}
