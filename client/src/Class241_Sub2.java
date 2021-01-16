/* Class241_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

final class Class241_Sub2 extends Class241
{
    private long aLong6160;
    private long aLong6161 = 0L;
    private long aLong6162;
    private int anInt6163;
    private long[] aLongArray6164;
    private int anInt6165;
    
    private final long method1864(int i) {
	long l = jagmisc.nanoTime();
	long l_0_ = l + -aLong6162;
	aLong6162 = l;
	if (l_0_ > -5000000000L
	    && (l_0_ ^ 0xffffffffffffffffL) > -5000000001L) {
	    aLongArray6164[anInt6163] = l_0_;
	    if ((anInt6165 ^ 0xffffffff) > -2)
		anInt6165++;
	    anInt6163 = (1 + anInt6163) % 10;
	}
	long l_1_ = 0L;
	if (i != 10)
	    method1864(107);
	for (int i_2_ = 1; i_2_ <= anInt6165; i_2_++)
	    l_1_ += aLongArray6164[(10 + (anInt6163 + -i_2_)) % 10];
	return l_1_ / (long) anInt6165;
    }
    
    final long method1858(int i) {
	aLong6161 += method1864(10);
	if (i > -60)
	    return -8L;
	if (aLong6161 < aLong6160)
	    return (-aLong6161 + aLong6160) / 1000000L;
	return 0L;
    }
    
    final void method1856(byte i) {
	if (i <= 88)
	    method1856((byte) 111);
	aLong6162 = 0L;
	if (aLong6160 > aLong6161)
	    aLong6161 += -aLong6161 + aLong6160;
    }
    
    final long method1862(int i) {
	if (i != -18931)
	    return -56L;
	return aLong6161;
    }
    
    Class241_Sub2() {
	aLong6160 = 0L;
	anInt6163 = 0;
	aLong6162 = 0L;
	aLongArray6164 = new long[10];
	anInt6165 = 1;
	aLong6160 = aLong6161 = jagmisc.nanoTime();
	if ((aLong6161 ^ 0xffffffffffffffffL) == -1L)
	    throw new RuntimeException();
    }
    
    final int method1859(int i, long l) {
	if (i != 71)
	    method1859(41, -7L);
	if (aLong6161 < aLong6160) {
	    aLong6162 += aLong6160 + -aLong6161;
	    aLong6161 += -aLong6161 + aLong6160;
	    aLong6160 += l;
	    return 1;
	}
	int i_3_ = 0;
	do {
	    i_3_++;
	    aLong6160 += l;
	} while (i_3_ < 10 && aLong6161 > aLong6160);
	if ((aLong6161 ^ 0xffffffffffffffffL)
	    < (aLong6160 ^ 0xffffffffffffffffL))
	    aLong6160 = aLong6161;
	return i_3_;
    }
}
