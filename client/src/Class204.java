/* Class204 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class204
{
    private static byte[] aByteArray2676
	= { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private Class348_Sub49 aClass348_Sub49_2677;
    private int[] anIntArray2678;
    private int[] anIntArray2679;
    private long aLong2680;
    int[] anIntArray2681;
    private int[] anIntArray2682;
    int anInt2683;
    private int anInt2684;
    
    final boolean method1480() {
	int i = anIntArray2682.length;
	for (int i_0_ = 0; i_0_ < i; i_0_++) {
	    if (anIntArray2682[i_0_] >= 0)
		return false;
	}
	return true;
    }
    
    private final int method1481(int i, int i_1_) {
	if (i_1_ == 255) {
	    int i_2_ = aClass348_Sub49_2677.method3387(255);
	    int i_3_ = aClass348_Sub49_2677.method3366((byte) 112);
	    if (i_2_ == 47) {
		((Class348_Sub49) aClass348_Sub49_2677).anInt7197 += i_3_;
		return 1;
	    }
	    if (i_2_ == 81) {
		int i_4_ = aClass348_Sub49_2677.method3351(-1);
		i_3_ -= 3;
		int i_5_ = ((Class204) this).anIntArray2681[i];
		aLong2680 += (long) i_5_ * (long) (anInt2684 - i_4_);
		anInt2684 = i_4_;
		((Class348_Sub49) aClass348_Sub49_2677).anInt7197 += i_3_;
		return 2;
	    }
	    ((Class348_Sub49) aClass348_Sub49_2677).anInt7197 += i_3_;
	    return 3;
	}
	byte i_6_ = aByteArray2676[i_1_ - 128];
	int i_7_ = i_1_;
	if (i_6_ >= 1)
	    i_7_ |= aClass348_Sub49_2677.method3387(255) << 8;
	if (i_6_ >= 2)
	    i_7_ |= aClass348_Sub49_2677.method3387(255) << 16;
	return i_7_;
    }
    
    final void method1482(byte[] is) {
	((Class348_Sub49) aClass348_Sub49_2677).aByteArray7154 = is;
	((Class348_Sub49) aClass348_Sub49_2677).anInt7197 = 10;
	int i = aClass348_Sub49_2677.method3330(842397944);
	((Class204) this).anInt2683
	    = aClass348_Sub49_2677.method3330(842397944);
	anInt2684 = 500000;
	anIntArray2679 = new int[i];
	int i_8_ = 0;
	while (i_8_ < i) {
	    int i_9_ = aClass348_Sub49_2677.method3385((byte) -126);
	    int i_10_ = aClass348_Sub49_2677.method3385((byte) -126);
	    if (i_9_ == 1297379947) {
		anIntArray2679[i_8_]
		    = ((Class348_Sub49) aClass348_Sub49_2677).anInt7197;
		i_8_++;
	    }
	    ((Class348_Sub49) aClass348_Sub49_2677).anInt7197 += i_10_;
	}
	aLong2680 = 0L;
	anIntArray2682 = new int[i];
	for (int i_11_ = 0; i_11_ < i; i_11_++)
	    anIntArray2682[i_11_] = anIntArray2679[i_11_];
	((Class204) this).anIntArray2681 = new int[i];
	anIntArray2678 = new int[i];
    }
    
    final int method1483() {
	return anIntArray2682.length;
    }
    
    final void method1484(long l) {
	aLong2680 = l;
	int i = anIntArray2682.length;
	for (int i_12_ = 0; i_12_ < i; i_12_++) {
	    ((Class204) this).anIntArray2681[i_12_] = 0;
	    anIntArray2678[i_12_] = 0;
	    ((Class348_Sub49) aClass348_Sub49_2677).anInt7197
		= anIntArray2679[i_12_];
	    method1485(i_12_);
	    anIntArray2682[i_12_]
		= ((Class348_Sub49) aClass348_Sub49_2677).anInt7197;
	}
    }
    
    final void method1485(int i) {
	int i_13_ = aClass348_Sub49_2677.method3366((byte) 98);
	((Class204) this).anIntArray2681[i] += i_13_;
    }
    
    final void method1486(int i) {
	anIntArray2682[i] = ((Class348_Sub49) aClass348_Sub49_2677).anInt7197;
    }
    
    final void method1487() {
	((Class348_Sub49) aClass348_Sub49_2677).aByteArray7154 = null;
	anIntArray2679 = null;
	anIntArray2682 = null;
	((Class204) this).anIntArray2681 = null;
	anIntArray2678 = null;
    }
    
    final long method1488(int i) {
	return aLong2680 + (long) i * (long) anInt2684;
    }
    
    private final int method1489(int i) {
	int i_14_ = (((Class348_Sub49) aClass348_Sub49_2677).aByteArray7154
		     [((Class348_Sub49) aClass348_Sub49_2677).anInt7197]);
	if (i_14_ < 0) {
	    i_14_ &= 0xff;
	    anIntArray2678[i] = i_14_;
	    ((Class348_Sub49) aClass348_Sub49_2677).anInt7197++;
	} else
	    i_14_ = anIntArray2678[i];
	if (i_14_ == 240 || i_14_ == 247) {
	    int i_15_ = aClass348_Sub49_2677.method3366((byte) 40);
	    if (i_14_ == 247 && i_15_ > 0) {
		int i_16_
		    = ((((Class348_Sub49) aClass348_Sub49_2677).aByteArray7154
			[((Class348_Sub49) aClass348_Sub49_2677).anInt7197])
		       & 0xff);
		if (i_16_ >= 241 && i_16_ <= 243 || i_16_ == 246
		    || i_16_ == 248 || i_16_ >= 250 && i_16_ <= 252
		    || i_16_ == 254) {
		    ((Class348_Sub49) aClass348_Sub49_2677).anInt7197++;
		    anIntArray2678[i] = i_16_;
		    return method1481(i, i_16_);
		}
	    }
	    ((Class348_Sub49) aClass348_Sub49_2677).anInt7197 += i_15_;
	    return 0;
	}
	return method1481(i, i_14_);
    }
    
    final int method1490() {
	int i = anIntArray2682.length;
	int i_17_ = -1;
	int i_18_ = 2147483647;
	for (int i_19_ = 0; i_19_ < i; i_19_++) {
	    if (anIntArray2682[i_19_] >= 0
		&& ((Class204) this).anIntArray2681[i_19_] < i_18_) {
		i_17_ = i_19_;
		i_18_ = ((Class204) this).anIntArray2681[i_19_];
	    }
	}
	return i_17_;
    }
    
    final boolean method1491() {
	if (((Class348_Sub49) aClass348_Sub49_2677).aByteArray7154 == null)
	    return false;
	return true;
    }
    
    final void method1492(int i) {
	((Class348_Sub49) aClass348_Sub49_2677).anInt7197 = anIntArray2682[i];
    }
    
    public static void method1493() {
	aByteArray2676 = null;
    }
    
    final int method1494(int i) {
	int i_20_ = method1489(i);
	return i_20_;
    }
    
    final void method1495() {
	((Class348_Sub49) aClass348_Sub49_2677).anInt7197 = -1;
    }
    
    public Class204() {
	aClass348_Sub49_2677 = new Class348_Sub49(null);
    }
    
    Class204(byte[] is) {
	aClass348_Sub49_2677 = new Class348_Sub49(null);
	method1482(is);
    }
}
