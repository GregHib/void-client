/* AudioLineSub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class AudioLineSub2
/**
 * RENAMED from `Class279_Sub2` (JODE-obfuscated).
 * Evidence: subclass of AudioLine (hierarchy)
 */ extends AudioLine {
    /** Native audio channel index. */
    private final int channelId;
    /** Shared {@link DirectSoundAudio} peer from {@link ReflectionInvoker}. */
    private static NativeAudio nativeAudio;

    final void flush() {
        nativeAudio.flush((byte) 98, channelId);
    }

    final int getBufferedSamples() {
        return nativeAudio.getBufferedSamples((byte) -93, channelId);
    }

    /** Drop the static native peer reference. */
    public static void clearNativeAudio() {
        nativeAudio = null;
    }

    final void close() {
        nativeAudio.close(channelId, (byte) 122);
    }

    final void initOnComponent(Component component) throws Exception {
        nativeAudio.initOnComponent(Component231.sampleRate, Component21.stereo, component, 27929);
    }

    /** Push mixed PCM into the native channel. */
    final void writeSamples() {
        nativeAudio.writeSamples(channelId, this.anIntArray3603);
    }

    AudioLineSub2(ReflectionInvoker class297, int i) {
        nativeAudio = (NativeAudio) class297.getNativeInterface(21);
        channelId = i;
    }

    final void open(int i) throws Exception {
        if (i > 32768) throw new IllegalArgumentException();
        nativeAudio.open(i, channelId, (byte) 112);
    }
}
