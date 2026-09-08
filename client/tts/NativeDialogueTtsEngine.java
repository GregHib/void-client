import java.lang.reflect.Method;

/** Phase A backend: the host OS voice (say on desktop, AwtHost on mobile). */
public final class NativeDialogueTtsEngine implements DialogueTtsEngine {
    private volatile Process desktopProcess;

    @Override
    public synchronized void speak(String text, VoiceGender gender) {
        stop();
        try {
            Class<?> host = Class.forName("voidawt.AwtHost");
            Method speak = host.getMethod("speak", String.class, boolean.class);
            speak.invoke(null, text, gender == VoiceGender.FEMALE);
            return;
        } catch (ClassNotFoundException ignored) {
            // Desktop JVM has no mobile AwtHost.
        } catch (Throwable t) {
            System.out.println("void-tts: mobile bridge unavailable: " + t);
        }
        try {
            String voice = gender == VoiceGender.FEMALE ? "Samantha" : "Alex";
            desktopProcess = new ProcessBuilder("say", "-v", voice, "--", text)
                    .redirectErrorStream(true).start();
            final Process process = desktopProcess;
            Thread drain = new Thread(new Runnable() {
                public void run() {
                    try {
                        while (process.getInputStream().read() != -1) {
                            // Keep the native process from blocking on its pipe.
                        }
                    } catch (Exception ignored) {
                    }
                }
            }, "void-tts-drain");
            drain.setDaemon(true);
            drain.start();
        } catch (Throwable t) {
            System.out.println("void-tts: native voice unavailable: " + t.getMessage());
        }
    }

    @Override
    public synchronized void stop() {
        if (desktopProcess != null) {
            desktopProcess.destroy();
            desktopProcess = null;
        }
        try {
            Class<?> host = Class.forName("voidawt.AwtHost");
            host.getMethod("stopSpeech").invoke(null);
        } catch (Throwable ignored) {
            // Desktop, or a host without speech support.
        }
    }
}
