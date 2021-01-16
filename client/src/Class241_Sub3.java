/* Class241_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class241_Sub3 extends Class241
{
    private long aLong6166 = 0L;
    private long aLong6167 = 0L;
    private int anInt6168;
    private long aLong6169 = 0L;
    private int anInt6170 = 0;
    private long[] aLongArray6171;
    
    final long method1858(int i) {
	aLong6166 += method1865(10);
	if (i > -60)
	    aLong6169 = 17L;
	if (aLong6167 > aLong6166)
	    return (-aLong6166 + aLong6167) / 1000000L;
	return 0L;
    }
    
    final void method1856(byte i) {
	aLong6169 = 0L;
	if (i < 88)
	    method1856((byte) -4);
	if (aLong6166 < aLong6167)
	    aLong6166 += aLong6167 + -aLong6166;
    }
    
    private final long method1865(int i) {
	long l = System.nanoTime();
	long l_0_ = -aLong6169 + l;
	if (i != 10)
	    return -56L;
	aLong6169 = l;
	if (4999999999L > (l_0_ ^ 0xffffffffffffffffL)
	    && -5000000001L < (l_0_ ^ 0xffffffffffffffffL)) {
	    aLongArray6171[anInt6170] = l_0_;
	    if ((anInt6168 ^ 0xffffffff) > -2)
		anInt6168++;
	    anInt6170 = (1 + anInt6170) % 10;
	}
	long l_1_ = 0L;
	for (int i_2_ = 1; i_2_ <= anInt6168; i_2_++)
	    l_1_ += aLongArray6171[(-i_2_ + anInt6170 - -10) % 10];
	return l_1_ / (long) anInt6168;
    }
    
    final int method1859(int i, long l) {
	if (i != 71)
	    return 22;
	if (aLong6167 <= aLong6166) {
	    int i_3_ = 0;
	    do {
		i_3_++;
		aLong6167 += l;
	    } while (i_3_ < 10 && ((aLong6166 ^ 0xffffffffffffffffL)
				   < (aLong6167 ^ 0xffffffffffffffffL)));
	    if (aLong6167 < aLong6166)
		aLong6167 = aLong6166;
	    return i_3_;
	}
	aLong6169 += -aLong6166 + aLong6167;
	aLong6166 += aLong6167 + -aLong6166;
	aLong6167 += l;
	return 1;
    }
    
    final long method1862(int i) {
	if (i != -18931)
	    return -36L;
	return aLong6166;
    }
    
    Class241_Sub3() {
	anInt6168 = 1;
	aLongArray6171 = new long[10];
	aLong6166 = System.nanoTime();
	aLong6167 = System.nanoTime();
    }
}
