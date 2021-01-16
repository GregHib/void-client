/* Class234 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

final class Class234
{
    private RandomAccessFile aRandomAccessFile3036;
    private long aLong3037;
    static int anInt3038;
    private long aLong3039;
    static int anInt3040;
    static int anInt3041;
    static int anInt3042;
    static int anInt3043;
    static Class138 aClass138_3044;
    static int anInt3045;
    private File aFile3046;
    static int anInt3047 = 0;
    static int anInt3048;
    static int anInt3049;
    
    final int method1656(byte[] is, int i, byte i_0_, int i_1_)
	throws IOException {
	anInt3040++;
	int i_2_ = aRandomAccessFile3036.read(is, i, i_1_);
	int i_3_ = 39 % ((75 - i_0_) / 39);
	if ((i_2_ ^ 0xffffffff) < -1)
	    aLong3039 += (long) i_2_;
	return i_2_;
    }
    
    final void method1657(boolean bool) throws IOException {
	anInt3045++;
	if (bool != false)
	    method1660(-27);
	if (aRandomAccessFile3036 != null) {
	    aRandomAccessFile3036.close();
	    aRandomAccessFile3036 = null;
	}
    }
    
    final void method1658(byte i, int i_4_, int i_5_, byte[] is)
	throws IOException {
	anInt3043++;
	if (((long) i_5_ - -aLong3039 ^ 0xffffffffffffffffL)
	    < (aLong3037 ^ 0xffffffffffffffffL)) {
	    aRandomAccessFile3036.seek(aLong3037);
	    aRandomAccessFile3036.write(1);
	    throw new EOFException();
	}
	if (i < 108)
	    aLong3039 = 124L;
	aRandomAccessFile3036.write(is, i_4_, i_5_);
	aLong3039 += (long) i_5_;
    }
    
    public static void method1659(byte i) {
	if (i >= -2)
	    method1659((byte) 126);
	aClass138_3044 = null;
    }
    
    final File method1660(int i) {
	anInt3042++;
	if (i <= 64)
	    method1659((byte) -48);
	return aFile3046;
    }
    
    final void method1661(int i, long l) throws IOException {
	try {
	    anInt3048++;
	    if (i != -18968)
		aRandomAccessFile3036 = null;
	    aRandomAccessFile3036.seek(l);
	    aLong3039 = l;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "so.B(" + i + ',' + l + ')');
	}
    }
    
    final long method1662(byte i) throws IOException {
	anInt3038++;
	if (i != -46)
	    return 97L;
	return aRandomAccessFile3036.length();
    }
    
    protected final void finalize() throws Throwable {
	if (aRandomAccessFile3036 != null) {
	    System.out.println
		("Warning! fileondisk " + aFile3046
		 + " not closed correctly using close(). Auto-closing instead. ");
	    method1657(false);
	}
	anInt3041++;
    }
    
    Class234(File file, String string, long l) throws IOException {
	try {
	    if ((l ^ 0xffffffffffffffffL) == 0L)
		l = 9223372036854775807L;
	    if (l < file.length())
		file.delete();
	    aRandomAccessFile3036 = new RandomAccessFile(file, string);
	    aLong3037 = l;
	    aLong3039 = 0L;
	    aFile3046 = file;
	    int i = aRandomAccessFile3036.read();
	    if ((i ^ 0xffffffff) != 0 && !string.equals("r")) {
		aRandomAccessFile3036.seek(0L);
		aRandomAccessFile3036.write(i);
	    }
	    aRandomAccessFile3036.seek(0L);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("so.<init>("
					     + (file != null ? "{...}"
						: "null")
					     + ','
					     + (string != null ? "{...}"
						: "null")
					     + ',' + l + ')'));
	}
    }
    
    static {
	aClass138_3044 = new Class138(0, 2, 2, 1);
    }
}
