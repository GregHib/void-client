/* NativeAudio - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

/**
 * Native audio backend (DirectSound on Microsoft JVM).
 * Implemented by {@link DirectSoundAudio}; driven by {@link AudioLineSub2}.
 */
interface NativeAudio {
    /** Destroy channel buffer {@code i}. */
    void close(int i, byte i_0_);

    /** Samples still queued for channel {@code i_1_}. */
    int getBufferedSamples(byte i, int i_1_);

    /** Write PCM ints for channel {@code i}. */
    void writeSamples(int i, int[] is);

    /** Stop and rewind channel {@code i_2_}. */
    void flush(byte i, int i_2_);

    /** Init DirectSound against {@code component} at sample-rate {@code i}. */
    void initOnComponent(int i, boolean bool, Component component, int i_3_) throws Exception;

    /** Open secondary buffer for channel {@code i_4_} with capacity {@code i}. */
    void open(int i, int i_4_, byte i_5_) throws Exception;
}
