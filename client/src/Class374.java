/* Class374 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

final class Class374 {
    static int anInt4536;
    static Class74 aClass74_4537 = new Class74(3, 2);
    static Class78 aClass78_4538;

    static final void method3610(byte[] is, byte i, int i_0_, File file)
            throws IOException {
        try {
            anInt4536++;
            DataInputStream datainputstream
                    = (new DataInputStream
                    (new BufferedInputStream(new FileInputStream(file))));
            try {
                int i_1_ = -11 % ((-43 - i) / 33);
                datainputstream.readFully(is, 0, i_0_);
            } catch (java.io.EOFException eofexception) {
                /* empty */
            }
            datainputstream.close();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("gca.A("
                            + (is != null ? "{...}" : "null")
                            + ',' + i + ',' + i_0_ + ','
                            + (file != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public static void method3611(boolean bool) {
        if (bool != true)
            aClass74_4537 = null;
        aClass74_4537 = null;
        aClass78_4538 = null;
    }
}
