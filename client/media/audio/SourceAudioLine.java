/* SourceAudioLine - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class279_Sub1` (JODE-obfuscated).
 * Audio output line backed by a javax.sound SourceDataLine. Opens/closes the line (open/2091) and writes PCM via AudioSystem.
 */

import javax.sound.sampled.*;
import java.awt.*;

final class SourceAudioLine extends AudioLine {
    /** SourceDataLine buffer size in samples. */
    private int bufferSize;
    /** Scratch PCM bytes for {@link #writeSamples}. */
    private byte[] pcmBytes;
    /** Active javax.sound output line. */
    private SourceDataLine sourceDataLine;
    /** True if a "SoundMax" mixer was detected (needs reopen-on-flush). */
    private boolean soundmaxMixer = false;
    /** Output {@link AudioFormat} (16-bit, sampleRate, mono/stereo). */
    private AudioFormat audioFormat;
    static Class aClass6180;

    final void close() {
        if (null != sourceDataLine) {
            sourceDataLine.close();
            sourceDataLine = null;
        }
    }

    final void open(int i) throws LineUnavailableException {
        try {
            DataLine.Info info = (new DataLine.Info((aClass6180 == null ? (aClass6180 = SourceDataLine.class) : aClass6180), audioFormat, i << (Component21.stereo ? 2 : 1)));
            sourceDataLine = (SourceDataLine) AudioSystem.getLine(info);
            sourceDataLine.open();
            sourceDataLine.start();
            bufferSize = i;
        } catch (LineUnavailableException lineunavailableexception) {
            if (1 == WaterSurfaceShader.bitCount(i, (byte) 43)) {
                sourceDataLine = null;
                throw lineunavailableexception;
            } else open(Component373.nextPowerOfTwo(i, (byte) 108));
        }
    }

    final void initOnComponent(Component component) {
        Mixer.Info[] infos = AudioSystem.getMixerInfo();
        if (null != infos) {
            Mixer.Info[] infos_0_ = infos;
            for (int i = 0; i < infos_0_.length; i++) {
                Mixer.Info info = infos_0_[i];
                if (info != null) {
                    String string = info.getName();
                    if (null != string && string.toLowerCase().indexOf("soundmax") >= 0) soundmaxMixer = true;
                }
            }
        }
        audioFormat = new AudioFormat((float) Component231.sampleRate, 16, Component21.stereo ? 2 : 1, true, false);
        pcmBytes = new byte[256 << (!Component21.stereo ? 1 : 2)];
    }

    final int getBufferedSamples() {
        return bufferSize - (sourceDataLine.available() >> (Component21.stereo ? 2 : 1));
    }

    final void flush() throws LineUnavailableException {
        sourceDataLine.flush();
        if (soundmaxMixer) {
            sourceDataLine.close();
            sourceDataLine = null;
            DataLine.Info info = (new DataLine.Info((aClass6180 == null ? (aClass6180 = SourceDataLine.class) : aClass6180), audioFormat, bufferSize << (!Component21.stereo ? 1 : 2)));
            sourceDataLine = (SourceDataLine) AudioSystem.getLine(info);
            sourceDataLine.open();
            sourceDataLine.start();
        }
    }

    final void writeSamples() {
        int i = 256;
        if (Component21.stereo) i <<= 1;
        for (int i_1_ = 0; i_1_ < i; i_1_++) {
            int i_2_ = this.anIntArray3603[i_1_];
            if ((i_2_ + 8388608 & ~0xffffff) != 0) i_2_ = 0x7fffff ^ i_2_ >> 31;
            pcmBytes[i_1_ * 2] = (byte) (i_2_ >> 8);
            pcmBytes[i_1_ * 2 + 1] = (byte) (i_2_ >> 16);
        }
        sourceDataLine.write(pcmBytes, 0, i << 1);
    }
}
