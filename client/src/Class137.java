/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class137 {
    static int anInt1931;
    private int anInt1932;
    private Class78 aClass78_1933 = null;
    static int anInt1934;
    static int anInt1935;
    static int anInt1936;
    static int anInt1937;
    private Class78 aClass78_1938 = null;
    private int anInt1939 = 65000;

    final boolean method1160(int i, int i_0_, byte[] is, int i_1_) {
        if (i_1_ != -7305)
            return true;
        anInt1935++;
        synchronized (aClass78_1933) {
            if ((i ^ 0xffffffff) > -1
                    || (anInt1939 ^ 0xffffffff) > (i ^ 0xffffffff))
                throw new IllegalArgumentException();
            boolean bool = method1162(is, -15096, i_0_, i, true);
            if (!bool)
                bool = method1162(is, -15096, i_0_, i, false);
            return bool;
        }
    }

    final byte[] method1161(byte i, int i_2_) {
        anInt1937++;
        synchronized (aClass78_1933) {
            try {
                if ((aClass78_1938.method787(0) ^ 0xffffffffffffffffL)
                        > ((long) (6 * i_2_ - -6) ^ 0xffffffffffffffffL))
                    return null;
                aClass78_1938.method789(6 * i_2_, (byte) -106);
                aClass78_1938.method788(0, Class239.aByteArray3144, 6,
                        i + -16713);
                int i_3_
                        = ((0xff & Class239.aByteArray3144[2])
                        + ((0xff00 & Class239.aByteArray3144[1] << -648170616)
                        + (0xff0000
                        & Class239.aByteArray3144[0] << 1045546992)));
                int i_4_
                        = ((0xff & Class239.aByteArray3144[5])
                        + ((0xff & Class239.aByteArray3144[3]) << -1719237520)
                        - -((Class239.aByteArray3144[4] & 0xff) << 1980544360));
                if ((i_3_ ^ 0xffffffff) > -1
                        || (i_3_ ^ 0xffffffff) < (anInt1939 ^ 0xffffffff))
                    return null;
                if (i_4_ <= 0
                        || (long) i_4_ > aClass78_1933.method787(0) / 520L)
                    return null;
                byte[] is = new byte[i_3_];
                int i_5_ = 0;
                if (i != -4)
                    return null;
                int i_6_ = 0;
                while ((i_5_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff)) {
                    if ((i_4_ ^ 0xffffffff) == -1)
                        return null;
                    aClass78_1933.method789(i_4_ * 520, (byte) -103);
                    int i_7_ = -i_5_ + i_3_;
                    if (i_7_ > 512)
                        i_7_ = 512;
                    aClass78_1933.method788(0, Class239.aByteArray3144,
                            8 + i_7_, i ^ 0x414f);
                    int i_8_
                            = ((0xff00 & Class239.aByteArray3144[0] << 927302184)
                            + (Class239.aByteArray3144[1] & 0xff));
                    int i_9_
                            = ((Class239.aByteArray3144[2] << -1931300120 & 0xff00)
                            + (Class239.aByteArray3144[3] & 0xff));
                    int i_10_
                            = (((Class239.aByteArray3144[5] & 0xff) << 198622888)
                            + (0xff0000
                            & Class239.aByteArray3144[4] << 406901168)
                            + (Class239.aByteArray3144[6] & 0xff));
                    int i_11_ = 0xff & Class239.aByteArray3144[7];
                    if (i_2_ != i_8_
                            || (i_6_ ^ 0xffffffff) != (i_9_ ^ 0xffffffff)
                            || (anInt1932 ^ 0xffffffff) != (i_11_ ^ 0xffffffff))
                        return null;
                    if (i_10_ < 0 || ((long) i_10_
                            > aClass78_1933.method787(i + 4) / 520L))
                        return null;
                    i_4_ = i_10_;
                    i_6_++;
                    for (int i_12_ = 0; i_12_ < i_7_; i_12_++)
                        is[i_5_++] = Class239.aByteArray3144[8 + i_12_];
                }
                return is;
            } catch (java.io.IOException ioexception) {
                return null;
            }
        }
    }

    private final boolean method1162(byte[] is, int i, int i_13_, int i_14_,
                                     boolean bool) {
        anInt1936++;
        synchronized (aClass78_1933) {
            try {
                int i_15_;
                if (bool) {
                    if (aClass78_1938.method787(i + 15096)
                            < (long) (i_13_ * 6 - -6))
                        return false;
                    aClass78_1938.method789(i_13_ * 6, (byte) 70);
                    aClass78_1938.method788(0, Class239.aByteArray3144, 6,
                            -16717);
                    i_15_ = ((0xff & Class239.aByteArray3144[5])
                            + ((0xff & Class239.aByteArray3144[3])
                            << -1115057712)
                            + ((Class239.aByteArray3144[4] & 0xff)
                            << 58869768));
                    if ((i_15_ ^ 0xffffffff) >= -1
                            || (((long) i_15_ ^ 0xffffffffffffffffL)
                            < (aClass78_1933.method787(i ^ ~0x3af7) / 520L
                            ^ 0xffffffffffffffffL)))
                        return false;
                } else {
                    i_15_ = (int) ((519L + aClass78_1933.method787(0)) / 520L);
                    if ((i_15_ ^ 0xffffffff) == -1)
                        i_15_ = 1;
                }
                Class239.aByteArray3144[0] = (byte) (i_14_ >> -416234640);
                Class239.aByteArray3144[4] = (byte) (i_15_ >> -1627219416);
                Class239.aByteArray3144[2] = (byte) i_14_;
                Class239.aByteArray3144[1] = (byte) (i_14_ >> -710484280);
                Class239.aByteArray3144[3] = (byte) (i_15_ >> 1575572496);
                Class239.aByteArray3144[5] = (byte) i_15_;
                aClass78_1938.method789(i_13_ * 6, (byte) 111);
                aClass78_1938.method783(0, 6, true, Class239.aByteArray3144);
                int i_16_ = 0;
                if (i != -15096)
                    anInt1932 = 122;
                int i_17_ = 0;
                while (i_16_ < i_14_) {
                    int i_18_ = 0;
                    if (bool) {
                        aClass78_1933.method789(520 * i_15_,
                                (byte) -116);
                        try {
                            aClass78_1933.method788(0, Class239.aByteArray3144,
                                    8, -16717);
                        } catch (java.io.EOFException eofexception) {
                            break;
                        }
                        int i_19_ = ((0xff & Class239.aByteArray3144[1])
                                + (0xff00 & (Class239.aByteArray3144[0]
                                << -1890598040)));
                        i_18_ = ((0xff00
                                & Class239.aByteArray3144[5] << 1381585320)
                                + (((Class239.aByteArray3144[4] & 0xff)
                                << 1811989488)
                                - -(0xff & Class239.aByteArray3144[6])));
                        int i_20_ = ((Class239.aByteArray3144[2] << -519862680
                                & 0xff00)
                                + (Class239.aByteArray3144[3] & 0xff));
                        int i_21_ = 0xff & Class239.aByteArray3144[7];
                        if ((i_13_ ^ 0xffffffff) != (i_19_ ^ 0xffffffff)
                                || i_20_ != i_17_ || i_21_ != anInt1932)
                            return false;
                        if ((i_18_ ^ 0xffffffff) > -1
                                || (((long) i_18_ ^ 0xffffffffffffffffL)
                                < (aClass78_1933.method787(0) / 520L
                                ^ 0xffffffffffffffffL)))
                            return false;
                    }
                    if (i_18_ == 0) {
                        bool = false;
                        i_18_ = (int) ((aClass78_1933.method787(0) - -519L)
                                / 520L);
                        if ((i_18_ ^ 0xffffffff) == -1)
                            i_18_++;
                        if ((i_18_ ^ 0xffffffff) == (i_15_ ^ 0xffffffff))
                            i_18_++;
                    }
                    if (i_14_ + -i_16_ <= 512)
                        i_18_ = 0;
                    Class239.aByteArray3144[3] = (byte) i_17_;
                    Class239.aByteArray3144[2] = (byte) (i_17_ >> -912843704);
                    Class239.aByteArray3144[0] = (byte) (i_13_ >> -932895448);
                    Class239.aByteArray3144[1] = (byte) i_13_;
                    Class239.aByteArray3144[5] = (byte) (i_18_ >> 1550098056);
                    Class239.aByteArray3144[6] = (byte) i_18_;
                    Class239.aByteArray3144[7] = (byte) anInt1932;
                    Class239.aByteArray3144[4] = (byte) (i_18_ >> -832016080);
                    aClass78_1933.method789(520 * i_15_, (byte) -121);
                    aClass78_1933.method783(0, 8, true,
                            Class239.aByteArray3144);
                    int i_22_ = -i_16_ + i_14_;
                    if (i_22_ > 512)
                        i_22_ = 512;
                    aClass78_1933.method783(i_16_, i_22_, true, is);
                    i_17_++;
                    i_16_ += i_22_;
                    i_15_ = i_18_;
                }
                return true;
            } catch (java.io.IOException ioexception) {
                return false;
            }
        }
    }

    public final String toString() {
        anInt1934++;
        return "Cache:" + anInt1932;
    }

    static final boolean method1163(int i, byte i_23_, int i_24_) {
        int i_25_ = -65 / ((i_23_ - 2) / 55);
        anInt1931++;
        return (i_24_ & 0x800 ^ 0xffffffff) != -1;
    }

    Class137(int i, Class78 class78, Class78 class78_26_, int i_27_) {
        try {
            anInt1932 = i;
            aClass78_1933 = class78;
            aClass78_1938 = class78_26_;
            anInt1939 = i_27_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("nw.<init>(" + i + ','
                            + (class78 != null ? "{...}"
                            : "null")
                            + ','
                            + (class78_26_ != null ? "{...}"
                            : "null")
                            + ',' + i_27_ + ')'));
        }
    }
}
