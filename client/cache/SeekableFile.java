/* SeekableFile - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class78` (JODE-obfuscated).
 * Buffered seekable random-access file over {@link RandomAccessFileReader}.
 * Throws IOException {@code Invalid seek to …} on negative seeks.
 * {@link #position}/{@link #length} are logical; write/read buffers reduce RAF traffic.
 */

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class SeekableFile {
    static int anInt1304;
    /** Dirty write-side cache pages. */
    private final byte[] writeBuffer;
    static int anInt1306;
    static int anInt1307;
    static int anInt1308;
    static int anInt1309;
    static int anInt1310;
    /** Read-ahead cache pages. */
    private final byte[] readBuffer;
    private final RandomAccessFileReader fileReader;
    static int anInt1313;
    /** Valid byte count in {@link #writeBuffer}. */
    private int writeBufferLength = 0;
    /** Last seek/write position on the underlying RAF. */
    private long rafPosition;
    static int anInt1316;
    /** Highest byte written through the RAF so far. */
    private long rafLength;
    static int anInt1318;
    /** File offset of {@link #readBuffer} ({@code -1} = empty). */
    private long readBufferPosition = -1L;
    /** Valid byte count in {@link #readBuffer}. */
    private int readBufferLength;
    /** File offset of {@link #writeBuffer} ({@code -1} = empty). */
    private long writeBufferPosition = -1L;
    static CacheStore aClass45_1322;
    /** Logical file length (grows on write past EOF). */
    private long length;
    /** Current seek position in the file. */
    private long position;

    final void write(int i, int i_0_, boolean bool, byte[] is) throws IOException {
        anInt1310++;
        try {
            if (position - -(long) i_0_ > length) length = (long) i_0_ + position;
            if (writeBufferPosition != -1 && (writeBufferPosition > position || (position > (long) writeBufferLength + writeBufferPosition))) flushWriteBuffer(-1);
            if (writeBufferPosition != -1L && (position + (long) i_0_ > (long) writeBuffer.length + writeBufferPosition)) {
                int i_1_ = (int) ((long) writeBuffer.length + (writeBufferPosition + -position));
                Component313.arraycopy(is, i, writeBuffer, (int) (-writeBufferPosition + position), i_1_);
                i += i_1_;
                i_0_ -= i_1_;
                position += i_1_;
                writeBufferLength = writeBuffer.length;
                flushWriteBuffer(-1);
            }
            if (writeBuffer.length < i_0_) {
                if (rafPosition != position) {
                    fileReader.seek(-18968, position);
                    rafPosition = position;
                }
                fileReader.write((byte) 115, i, i_0_, is);
                rafPosition += i_0_;
                if (rafLength < rafPosition) rafLength = rafPosition;
                long l = -1L;
                if ((readBufferPosition <= position) && (readBufferPosition + (long) readBufferLength > position)) l = position;
                else if ((position <= readBufferPosition) && readBufferPosition < position - -(long) i_0_) l = readBufferPosition;
                long l_2_ = -1L;
                if ((long) i_0_ + position > readBufferPosition && (long) readBufferLength + readBufferPosition >= position + (long) i_0_) l_2_ = (long) i_0_ + position;
                else if ((position < (long) readBufferLength + readBufferPosition) && ((long) i_0_ + position >= readBufferPosition + (long) readBufferLength)) l_2_ = (long) readBufferLength + readBufferPosition;
                if (l > -1L && l_2_ > l) {
                    int i_3_ = (int) (l_2_ + -l);
                    Component313.arraycopy(is, (int) (-position + l + (long) i), readBuffer, (int) (-readBufferPosition + l), i_3_);
                }
                position += i_0_;
                return;
            }
            if (i_0_ > 0) {
                if (writeBufferPosition == -1L) writeBufferPosition = position;
                Component313.arraycopy(is, i, writeBuffer, (int) (-writeBufferPosition + position), i_0_);
                position += i_0_;
                if (position + -writeBufferPosition > (long) writeBufferLength) writeBufferLength = (int) (-writeBufferPosition + position);
                return;
            }
        } catch (IOException ioexception) {
            rafPosition = -1L;
            throw ioexception;
        }
        if (bool != true) writeBufferLength = -69;
    }

    final void readFully(int i, byte[] is) throws IOException {
        int i_4_ = -98 % ((1 - i) / 40);
        read(0, is, is.length, -16717);
        anInt1313++;
    }

    private final File getFileName(int i) {
        anInt1316++;
        if (i != -8659) getFileName(-88);
        return fileReader.getFile(i ^ ~0x2198);
    }

    public static void method786(byte i) {
        if (i != 0) aClass45_1322 = null;
        aClass45_1322 = null;
    }

    final long length(int i) {
        if (i != 0) return 26L;
        anInt1318++;
        return length;
    }

    final void read(int i, byte[] is, int i_5_, int i_6_) throws IOException {
        anInt1307++;
        try {
            if (i_5_ + i > is.length) throw new ArrayIndexOutOfBoundsException(i + (i_5_ - is.length));
            if (i_6_ != -16717) return;
            if (writeBufferPosition != -1 && position >= writeBufferPosition && (position - -(long) i_5_ <= (long) writeBufferLength + writeBufferPosition)) {
                Component313.arraycopy(writeBuffer, (int) (-writeBufferPosition + position), is, i, i_5_);
                position += i_5_;
                return;
            }
            long l = position;
            int i_7_ = i;
            int i_8_ = i_5_;
            if (position >= readBufferPosition && (readBufferPosition - -(long) readBufferLength > position)) {
                int i_9_ = (int) ((long) readBufferLength - (-readBufferPosition + position));
                if (i_5_ < i_9_) i_9_ = i_5_;
                Component313.arraycopy(readBuffer, (int) (position + -readBufferPosition), is, i, i_9_);
                position += i_9_;
                i_5_ -= i_9_;
                i += i_9_;
            }
            if (i_5_ > readBuffer.length) {
                fileReader.seek(i_6_ + -2251, position);
                rafPosition = position;
                int i_10_;
                for (/**/; i_5_ > 0; i_5_ -= i_10_) {
                    i_10_ = fileReader.read(is, i, (byte) 8, i_5_);
                    if (i_10_ == -1) break;
                    i += i_10_;
                    rafPosition += i_10_;
                    position += i_10_;
                }
            } else if (i_5_ > 0) {
                fillReadBuffer((byte) -46);
                int i_11_ = i_5_;
                if (readBufferLength < i_11_) i_11_ = readBufferLength;
                Component313.arraycopy(readBuffer, 0, is, i, i_11_);
                i += i_11_;
                position += i_11_;
                i_5_ -= i_11_;
            }
            if (writeBufferPosition != -1L) {
                if (position < writeBufferPosition && i_5_ > 0) {
                    int i_12_ = (int) (writeBufferPosition - position) + i;
                    if (i + i_5_ < i_12_) i_12_ = i + i_5_;
                    while (i_12_ > i) {
                        is[i++] = (byte) 0;
                        i_5_--;
                        position++;
                    }
                }
                long l_13_ = -1L;
                if (writeBufferPosition < l || (l - -(long) i_8_ <= writeBufferPosition)) {
                    if (writeBufferPosition <= l && l < writeBufferPosition - -(long) writeBufferLength) l_13_ = l;
                } else l_13_ = writeBufferPosition;
                long l_14_ = -1L;
                if ((long) writeBufferLength + writeBufferPosition <= l || ((long) i_8_ + l < (long) writeBufferLength + writeBufferPosition)) {
                    if ((writeBufferPosition < l - -(long) i_8_) && ((long) writeBufferLength + writeBufferPosition >= l - -(long) i_8_)) l_14_ = l + (long) i_8_;
                } else l_14_ = writeBufferPosition - -(long) writeBufferLength;
                if (l_13_ > -1L && (l_13_ < l_14_)) {
                    int i_15_ = (int) (l_14_ + -l_13_);
                    Component313.arraycopy(writeBuffer, (int) (l_13_ + -writeBufferPosition), is, i_7_ - -(int) (l_13_ - l), i_15_);
                    if (l_14_ > position) {
                        i_5_ -= -position + l_14_;
                        position = l_14_;
                    }
                }
            }
        } catch (IOException ioexception) {
            rafPosition = -1L;
            throw ioexception;
        }
        if (i_5_ > 0) throw new EOFException();
    }

    final void seek(long l, byte i) throws IOException {
        try {
            anInt1309++;
            if (l < 0) throw new IOException("Invalid seek to " + l + " in file " + getFileName(-8659));
            int i_16_ = -67 / ((i - -49) / 34);
            position = l;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, "l.A(" + l + ',' + i + ')');
        }
    }

    final void close(byte i) throws IOException {
        anInt1304++;
        flushWriteBuffer(-1);
        fileReader.close(false);
        int i_17_ = -26 % ((i - -7) / 51);
    }

    /** Writes the dirty write-buffer range to disk and invalidates it. */
    private final void flushWriteBuffer(int i) throws IOException {
        if (i != -1) writeBufferPosition = 47L;
        if (writeBufferPosition != -1) {
            if (rafPosition != writeBufferPosition) {
                fileReader.seek(-18968, writeBufferPosition);
                rafPosition = writeBufferPosition;
            }
            fileReader.write((byte) 120, 0, writeBufferLength, writeBuffer);
            rafPosition += writeBufferLength;
            if (rafLength < rafPosition) rafLength = rafPosition;
            long l = -1L;
            long l_18_ = -1L;
            if (readBufferPosition <= writeBufferPosition && (writeBufferPosition < (long) readBufferLength + readBufferPosition)) l = writeBufferPosition;
            else if ((readBufferPosition >= writeBufferPosition) && (readBufferPosition < writeBufferPosition - -(long) writeBufferLength)) l = readBufferPosition;
            if (((long) writeBufferLength + writeBufferPosition > readBufferPosition) && ((long) writeBufferLength + writeBufferPosition <= (long) readBufferLength + readBufferPosition)) l_18_ = writeBufferPosition - -(long) writeBufferLength;
            else if ((writeBufferPosition < readBufferPosition + (long) readBufferLength) && (readBufferPosition + (long) readBufferLength <= (long) writeBufferLength + writeBufferPosition)) l_18_ = (long) readBufferLength + readBufferPosition;
            if (l > -1 && l < l_18_) {
                int i_19_ = (int) (-l + l_18_);
                Component313.arraycopy(writeBuffer, (int) (l - writeBufferPosition), readBuffer, (int) (-readBufferPosition + l), i_19_);
            }
            writeBufferPosition = -1L;
            writeBufferLength = 0;
        }
        anInt1308++;
    }

    /** Refills {@link #readBuffer} from the RAF at {@link #position}. */
    private final void fillReadBuffer(byte i) throws IOException {
        readBufferLength = 0;
        anInt1306++;
        if (i != -46) getFileName(111);
        if (rafPosition != position) {
            fileReader.seek(-18968, position);
            rafPosition = position;
        }
        readBufferPosition = position;
        while (readBufferLength < readBuffer.length) {
            int i_20_ = -readBufferLength + readBuffer.length;
            if (i_20_ > 200000000) i_20_ = 200000000;
            int i_21_ = fileReader.read(readBuffer, readBufferLength, (byte) 125, i_20_);
            if (i_21_ == -1) break;
            readBufferLength += i_21_;
            rafPosition += i_21_;
        }
    }

    SeekableFile(RandomAccessFileReader class234, int i, int i_22_) throws IOException {
        fileReader = class234;
        length = rafLength = class234.length((byte) -46);
        writeBuffer = new byte[i_22_];
        readBuffer = new byte[i];
        position = 0L;
    }
}
