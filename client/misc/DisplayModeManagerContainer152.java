/* DisplayModeManagerContainer152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.*;

final class DisplayModeManagerContainer152
/**
 * RENAMED from `Class374` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt4536;
    static DisplayModeManagerContainer238 aClass74_4537 = new DisplayModeManagerContainer238(3, 2);
    static SeekableFile aClass78_4538;

    /** Read up to {@code i_0_} bytes from {@code file} into {@code is} (EOF tolerated). */
    static final void readFileFully(byte[] is, byte i, int i_0_, File file) throws IOException {
        try {
            anInt4536++;
            DataInputStream datainputstream = (new DataInputStream(new BufferedInputStream(new FileInputStream(file))));
            try {
                int i_1_ = -11 % ((-43 - i) / 33);
                datainputstream.readFully(is, 0, i_0_);
            } catch (java.io.EOFException eofexception) {
                /* empty */
            }
            datainputstream.close();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("gca.A(" + (is != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + (file != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method3611(boolean bool) {
        if (bool != true) aClass74_4537 = null;
        aClass74_4537 = null;
        aClass78_4538 = null;
    }
}
