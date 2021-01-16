/* Class241_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class241_Sub1 extends Class241 {
    private long aLong6154;
    private long aLong6155;
    private int anInt6156 = 1;
    private final long[] aLongArray6157;
    private long aLong6158;
    private int anInt6159;

    final long method1862(int i) {
        if (i != -18931)
            anInt6159 = 65;
        return aLong6158;
    }

    final int method1859(int i, long l) {
        if (i != 71)
            return 127;
        if ((aLong6158 ^ 0xffffffffffffffffL)
                > (aLong6154 ^ 0xffffffffffffffffL)) {
            aLong6155 += aLong6154 - aLong6158;
            aLong6158 += -aLong6158 + aLong6154;
            aLong6154 += l;
            return 1;
        }
        int i_0_ = 0;
        do {
            i_0_++;
            aLong6154 += l;
        } while ((i_0_ ^ 0xffffffff) > -11
                && ((aLong6158 ^ 0xffffffffffffffffL)
                < (aLong6154 ^ 0xffffffffffffffffL)));
        if (aLong6154 < aLong6158)
            aLong6154 = aLong6158;
        return i_0_;
    }

    final long method1858(int i) {
        if (i >= -60)
            anInt6156 = 64;
        aLong6158 += method1863(56);
        if ((aLong6154 ^ 0xffffffffffffffffL)
                < (aLong6158 ^ 0xffffffffffffffffL))
            return (aLong6154 - aLong6158) / 1000000L;
        return 0L;
    }

    final void method1856(byte i) {
        aLong6155 = 0L;
        if (aLong6154 > aLong6158)
            aLong6158 += -aLong6158 + aLong6154;
        if (i < 88)
            aLong6158 = -33L;
    }

    private final long method1863(int i) {
        long l = Class62.method599(-56) * 1000000L;
        long l_1_ = l + -aLong6155;
        aLong6155 = l;
        if (l_1_ > -5000000000L && l_1_ < 5000000000L) {
            aLongArray6157[anInt6159] = l_1_;
            if ((anInt6156 ^ 0xffffffff) > -11)
                anInt6156++;
            anInt6159 = (anInt6159 - -1) % 10;
        }
        long l_2_ = 0L;
        int i_3_ = 1;
        if (i <= 0)
            method1859(91, -39L);
        for (/**/; anInt6156 >= i_3_; i_3_++)
            l_2_ += aLongArray6157[(10 + (anInt6159 + -i_3_)) % 10];
        return l_2_ / (long) anInt6156;
    }

    Class241_Sub1() {
        aLong6155 = 0L;
        aLongArray6157 = new long[10];
        aLong6154 = 0L;
        anInt6159 = 0;
        aLong6158 = 0L;
    }
}
