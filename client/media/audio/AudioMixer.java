/* AudioMixer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class250` (JODE-obfuscated).
 * Audio mixer thread (implements Runnable). run() pumps an array of AudioLine (lines), calling process on each and sleeping; mixes client audio.
 */

final class AudioMixer implements Runnable {
    /** Primary / secondary output lines. */
    volatile AudioLine[] lines = new AudioLine[2];
    static int anInt3219;
    static int[] anIntArray3220;
    /** Set to stop the mixer loop. */
    volatile boolean stopRequested = false;
    static int anInt3222;
    /** True while {@link #run} is inside the mix loop. */
    volatile boolean running = false;
    static int anInt3224;
    static int anInt3225;
    static RenderableObject[] aClass318_Sub1Array3226;
    static int anInt3227 = 0;
    ReflectionInvoker invoker;

    /** Mask {@code directlogin} password chars with {@code *} for console echo. */
    static final String redactConsoleLine(byte i, String string) {
        if (i != 31) method1911((byte) 87);
        anInt3222++;
        String string_0_ = null;
        int i_1_ = string.indexOf("--> ");
        if (i_1_ >= 0) {
            string_0_ = string.substring(0, 4 + i_1_);
            string = string.substring(i_1_ + 4);
        }
        if (string.startsWith("directlogin ")) {
            int i_2_ = string.indexOf(" ", "directlogin ".length());
            if (i_2_ >= 0) {
                int i_3_ = string.length();
                string = string.substring(0, i_2_) + " ";
                for (int i_4_ = 1 + i_2_; i_4_ < i_3_; i_4_++)
                    string += "*";
            }
        }
        if (string_0_ == null) return string;
        return string_0_ + string;
    }

    public final void run() {
        this.running = true;
        anInt3224++;
        try {
            while (!this.stopRequested) {
                for (int i = 0; i < 2; i++) {
                    AudioLine class279 = this.lines[i];
                    if (class279 != null) class279.process(-6858);
                }
                SpriteAtlasShader.sleep((byte) -107, 10L);
                DummyClass.pulseAwtQueue((byte) -42, null, (this.invoker));
            }
        } catch (Exception exception) {
            ClientErrorReporter.reportError(null, exception, 15004);
        } finally {
            this.running = false;
        }
    }

    public static void method1910(int i) {
        anIntArray3220 = null;
        if (i != 0) method1910(-18);
        aClass318_Sub1Array3226 = null;
    }

    static final void method1911(byte i) {
        if (i != 99) anIntArray3220 = null;
        OpenGlShader.aClass32_7415 = new Component299(8);
        anInt3219++;
        StaticElementRenderer.anInt6450 = 0;
        for (RenderableSub10 class318_sub10 = (RenderableSub10) InflaterDecompressor.aClass243_2077.method1872(8); class318_sub10 != null; class318_sub10 = (RenderableSub10) InflaterDecompressor.aClass243_2077.method1878((byte) -115))
            class318_sub10.method2530();
    }
}
