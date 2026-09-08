public interface DialogueTtsEngine {
    void speak(String text, VoiceGender gender);

    void stop();
}
