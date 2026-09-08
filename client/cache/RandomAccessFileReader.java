/* RandomAccessFileReader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class234` (JODE-obfuscated).
 * Thin wrapper around java.io.RandomAccessFile. Holds a File (file) and RandomAccessFile (randomAccessFile); read reads bytes, close closes.
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

final class RandomAccessFileReader {
    private RandomAccessFile randomAccessFile;
    /** Hard cap on writable size (EOFException past this). */
    private final long maxLength;
    static int anInt3038;
    /** Current RAF file pointer. */
    private long position;
    static int anInt3040;
    static int anInt3041;
    static int anInt3042;
    static int anInt3043;
    static Component161 aClass138_3044;
    static int anInt3045;
    private final File file;
    static int anInt3047 = 0;
    static int anInt3048;
    static int anInt3049;

    final int read(byte[] is, int i, byte i_0_, int i_1_) throws IOException {
        anInt3040++;
        int i_2_ = randomAccessFile.read(is, i, i_1_);
        int i_3_ = 39 % ((75 - i_0_) / 39);
        if (i_2_ > 0) position += i_2_;
        return i_2_;
    }

    final void close(boolean bool) throws IOException {
        anInt3045++;
        if (bool != false) getFile(-27);
        if (randomAccessFile != null) {
            randomAccessFile.close();
            randomAccessFile = null;
        }
    }

    final void write(byte i, int i_4_, int i_5_, byte[] is) throws IOException {
        anInt3043++;
        if (maxLength < (long) i_5_ - -position) {
            randomAccessFile.seek(maxLength);
            randomAccessFile.write(1);
            throw new EOFException();
        }
        if (i < 108) position = 124L;
        randomAccessFile.write(is, i_4_, i_5_);
        position += i_5_;
    }

    /** Nulls static type-tag handle at shutdown. */
    public static void clearStatics(byte i) {
        if (i >= -2) clearStatics((byte) 126);
        aClass138_3044 = null;
    }

    final File getFile(int i) {
        anInt3042++;
        if (i <= 64) clearStatics((byte) -48);
        return file;
    }

    final void seek(int i, long l) throws IOException {
        try {
            anInt3048++;
            if (i != -18968) randomAccessFile = null;
            randomAccessFile.seek(l);
            position = l;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "so.B(" + i + ',' + l + ')');
        }
    }

    /** @return {@link RandomAccessFile#length()}. */
    final long length(byte i) throws IOException {
        anInt3038++;
        if (i != -46) return 97L;
        return randomAccessFile.length();
    }

    protected final void finalize() throws Throwable {
        if (randomAccessFile != null) {
            System.out.println("Warning! fileondisk " + file + " not closed correctly using close(). Auto-closing instead. ");
            close(false);
        }
        anInt3041++;
    }

    RandomAccessFileReader(File file, String string, long l) throws IOException {
        try {
            if (l == -1) l = 9223372036854775807L;
            if (l < file.length()) file.delete();
            randomAccessFile = new RandomAccessFile(file, string);
            maxLength = l;
            position = 0L;
            this.file = file;
            int i = randomAccessFile.read();
            if (i != -1 && !string.equals("r")) {
                randomAccessFile.seek(0L);
                randomAccessFile.write(i);
            }
            randomAccessFile.seek(0L);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("so.<init>(" + (file != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + l + ')'));
        }
    }

    static {
        aClass138_3044 = new Component161(0, 2, 2, 1);
    }
}
