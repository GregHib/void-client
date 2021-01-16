/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class85
{
    static int anInt1461;
    static int anInt1462;
    private int anInt1463;
    static int anInt1464;
    private byte[] aByteArray1465 = new byte[32];
    static int anInt1466;
    static int anInt1467;
    private int anInt1468;
    private long[] aLongArray1469;
    static int anInt1470;
    private long[] aLongArray1471 = new long[8];
    private long[] aLongArray1472;
    private long[] aLongArray1473;
    private long[] aLongArray1474;
    private byte[] aByteArray1475;
    static int anInt1476;
    
    private final void method827(int i) {
	anInt1462++;
	int i_0_ = 0;
	int i_1_ = i;
	for (/**/; (i_0_ ^ 0xffffffff) > -9; i_0_++) {
	    aLongArray1473[i_0_]
		= (Class105_Sub2.method993
		   ((Class105_Sub2.method993
		     ((Class348_Sub8
			   .method2777(255L, (long) aByteArray1475[i_1_ + 6])
		       << 487716296),
		      (Class105_Sub2.method993
		       (Class348_Sub8.method2777(((long) (aByteArray1475
							  [i_1_ - -5])
						  << -896856240),
						 255L << 407026192),
			(Class105_Sub2.method993
			 ((Class105_Sub2.method993
			   (Class348_Sub8.method2777(255L << -561803296,
						     ((long) (aByteArray1475
							      [i_1_ + 3])
						      << 1709594400)),
			    (Class105_Sub2.method993
			     (Class105_Sub2.method993((Class348_Sub8.method2777
						       (255L << -1772986896,
							((long) (aByteArray1475
								 [1 + i_1_])
							 << -295236176))),
						      ((long) (aByteArray1475
							       [i_1_])
						       << 1398616696)),
			      Class348_Sub8.method2777(((long) (aByteArray1475
								[i_1_ + 2])
							<< 1090491688),
						       255L << 2085795816))))),
			  Class348_Sub8.method2777((long) (aByteArray1475
							   [4 + i_1_]),
						   255L) << 486892568)))))),
		    Class348_Sub8
			.method2777(255L, (long) aByteArray1475[i_1_ - -7])));
	    i_1_ += 8;
	}
	for (int i_2_ = 0; i_2_ < 8; i_2_++)
	    aLongArray1469[i_2_]
		= Class105_Sub2.method993(aLongArray1473[i_2_],
					  (aLongArray1472[i_2_]
					   = aLongArray1474[i_2_]));
	for (int i_3_ = 1; (i_3_ ^ 0xffffffff) >= -11; i_3_++) {
	    for (int i_4_ = 0; (i_4_ ^ 0xffffffff) > -9; i_4_++) {
		aLongArray1471[i_4_] = 0L;
		int i_5_ = 0;
		int i_6_ = 56;
		for (/**/; (i_5_ ^ 0xffffffff) > -9; i_5_++) {
		    aLongArray1471[i_4_]
			= (Class105_Sub2.method993
			   (aLongArray1471[i_4_],
			    (InputStream_Sub1.aLongArrayArray75[i_5_]
			     [(Class139.method1166
			       (255,
				(int) ((aLongArray1472
					[Class139.method1166(7, i_4_ - i_5_)])
				       >>> i_6_)))])));
		    i_6_ -= 8;
		}
	    }
	    for (int i_7_ = 0; i_7_ < 8; i_7_++)
		aLongArray1472[i_7_] = aLongArray1471[i_7_];
	    aLongArray1472[0]
		= Class105_Sub2.method993(aLongArray1472[0],
					  InputStream_Sub1.aLongArray76[i_3_]);
	    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -9; i_8_++) {
		aLongArray1471[i_8_] = aLongArray1472[i_8_];
		int i_9_ = 0;
		int i_10_ = 56;
		for (/**/; i_9_ < 8; i_9_++) {
		    aLongArray1471[i_8_]
			= (Class105_Sub2.method993
			   (aLongArray1471[i_8_],
			    (InputStream_Sub1.aLongArrayArray75[i_9_]
			     [(Class139.method1166
			       (255,
				(int) ((aLongArray1469
					[Class139.method1166(-i_9_ + i_8_, 7)])
				       >>> i_10_)))])));
		    i_10_ -= 8;
		}
	    }
	    for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > -9; i_11_++)
		aLongArray1469[i_11_] = aLongArray1471[i_11_];
	}
	for (int i_12_ = 0; i_12_ < 8; i_12_++)
	    aLongArray1474[i_12_]
		= (Class105_Sub2.method993
		   (aLongArray1474[i_12_],
		    Class105_Sub2.method993(aLongArray1473[i_12_],
					    aLongArray1469[i_12_])));
    }
    
    static final void method828(byte i, int i_13_, int i_14_) {
	if (i != 38)
	    method828((byte) 63, 119, 33);
	anInt1467++;
	if (Class21.aHa326 != null) {
	    int i_15_ = Class31.anInt425;
	    int i_16_ = Class250.anInt3225;
	    Class239_Sub8.method1752(-1, i_13_, i_14_);
	    if (Class348_Sub49.anInt7207 == 0) {
		Class17.anInterface4_252 = null;
		Class17.anInterface4_252
		    = (Class21.aHa326.method3634
		       (Class21.aHa326.method3665((Class348_Sub16_Sub1
						   .anInt8854),
						  Class239_Sub16.anInt6008),
			Class21.aHa326.method3624((Class348_Sub16_Sub1
						   .anInt8854),
						  Class239_Sub16.anInt6008)));
	    } else if ((Class348_Sub49.anInt7207 ^ 0xffffffff) == -2
		       && (Class92.anInterface4Array1525 == null
			   || (Class31.anInt425 ^ 0xffffffff) != (i_15_
								  ^ 0xffffffff)
			   || i_16_ != Class250.anInt3225)) {
		Class92.anInterface4Array1525
		    = new Interface4[Class250.anInt3225 * Class31.anInt425];
		for (int i_17_ = 0;
		     Class92.anInterface4Array1525.length > i_17_; i_17_++)
		    Class92.anInterface4Array1525[i_17_]
			= (Class21.aHa326.method3634
			   (Class21.aHa326.method3665(Class58.anInt1067,
						      Class344.anInt4267),
			    Class21.aHa326.method3624(Class58.anInt1067,
						      Class344.anInt4267)));
		Class132.anIntArray1909
		    = new int[Class31.anInt425 * Class250.anInt3225];
		Class318_Sub1_Sub1_Sub2.anInt9997 = 1;
	    }
	    Class348_Sub16_Sub2.aBoolean8870 = true;
	}
    }
    
    final void method829(int i) {
	anInt1466++;
	int i_18_ = -69 % ((i - 33) / 43);
	for (int i_19_ = 0; i_19_ < 32; i_19_++)
	    aByteArray1465[i_19_] = (byte) 0;
	aByteArray1475[0] = (byte) 0;
	anInt1463 = anInt1468 = 0;
	for (int i_20_ = 0; i_20_ < 8; i_20_++)
	    aLongArray1474[i_20_] = 0L;
    }
    
    static final void method830(int i, int i_21_, byte i_22_, boolean bool,
				int i_23_) {
	anInt1461++;
	Class348_Sub42_Sub3.method3179(0);
	Class348_Sub16_Sub2.aLong8866 = 0L;
	int i_24_ = Class348_Sub42_Sub12.method3229(-82);
	if (i_22_ == 102) {
	    if ((i ^ 0xffffffff) == -4 || (i_24_ ^ 0xffffffff) == -4)
		bool = true;
	    if (!Class348_Sub8.aHa6654.method3695())
		bool = true;
	    Class215.method1580((byte) -125, bool, i_21_, i_24_, i, i_23_);
	}
    }
    
    static final int method831(int i, int i_25_, int i_26_, int i_27_) {
	anInt1476++;
	int i_28_ = 106 / ((-20 - i_27_) / 48);
	if ((i_25_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff))
	    return i_26_;
	if ((i ^ 0xffffffff) <= (i_25_ ^ 0xffffffff))
	    return i_25_;
	return i;
    }
    
    final void method832(long l, byte[] is, int i) {
	try {
	    anInt1464++;
	    int i_29_ = 0;
	    int i_30_ = 8 - ((int) l & 0x7) & 0x7;
	    int i_31_ = anInt1463 & 0x7;
	    long l_32_ = l;
	    int i_33_ = 31;
	    int i_34_ = 0;
	    for (/**/; i_33_ >= 0; i_33_--) {
		i_34_
		    += (0xff & aByteArray1465[i_33_]) - -(0xff & (int) l_32_);
		aByteArray1465[i_33_] = (byte) i_34_;
		l_32_ >>>= 8;
		i_34_ >>>= 8;
	    }
	    int i_35_ = 6 % ((i - 64) / 52);
	    while (l > 8L) {
		int i_36_ = (is[i_29_] << i_30_ & 0xff
			     | (0xff & is[1 + i_29_]) >>> 8 + -i_30_);
		if (i_36_ < 0 || i_36_ >= 256)
		    throw new RuntimeException("LOGIC ERROR");
		aByteArray1475[anInt1468]
		    = (byte) Class273.method2057(aByteArray1475[anInt1468],
						 i_36_ >>> i_31_);
		anInt1468++;
		anInt1463 += 8 - i_31_;
		if (anInt1463 == 512) {
		    method827(0);
		    anInt1463 = anInt1468 = 0;
		}
		aByteArray1475[anInt1468]
		    = (byte) Class139.method1166(i_36_ << -i_31_ + 8, 255);
		i_29_++;
		l -= 8L;
		anInt1463 += i_31_;
	    }
	    int i_37_;
	    if (l > 0L) {
		i_37_ = 0xff & is[i_29_] << i_30_;
		aByteArray1475[anInt1468]
		    = (byte) Class273.method2057(aByteArray1475[anInt1468],
						 i_37_ >>> i_31_);
	    } else
		i_37_ = 0;
	    if ((l + (long) i_31_ ^ 0xffffffffffffffffL) <= -9L) {
		anInt1463 += 8 - i_31_;
		l -= (long) (-i_31_ + 8);
		anInt1468++;
		if (anInt1463 == 512) {
		    method827(0);
		    anInt1463 = anInt1468 = 0;
		}
		aByteArray1475[anInt1468]
		    = (byte) Class139.method1166(i_37_ << 8 + -i_31_, 255);
		anInt1463 += (int) l;
	    } else
		anInt1463 += l;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("lda.B(" + l + ','
					     + (is != null ? "{...}" : "null")
					     + ',' + i + ')'));
	}
    }
    
    final void method833(boolean bool, int i, byte[] is) {
	anInt1470++;
	aByteArray1475[anInt1468]
	    = (byte) Class273.method2057(aByteArray1475[anInt1468],
					 128 >>> Class139.method1166(anInt1463,
								     7));
	anInt1468++;
	if ((anInt1468 ^ 0xffffffff) < -33) {
	    while (anInt1468 < 64)
		aByteArray1475[anInt1468++] = (byte) 0;
	    method827(0);
	    anInt1468 = 0;
	}
	while ((anInt1468 ^ 0xffffffff) > -33)
	    aByteArray1475[anInt1468++] = (byte) 0;
	Class214.method1577(aByteArray1465, 0, aByteArray1475, 32, 32);
	method827(0);
	int i_38_ = 0;
	if (bool != true)
	    method830(-1, -123, (byte) 39, false, 61);
	int i_39_ = i;
	while ((i_38_ ^ 0xffffffff) > -9) {
	    long l = aLongArray1474[i_38_];
	    is[i_39_] = (byte) (int) (l >>> -494522120);
	    is[i_39_ + 1] = (byte) (int) (l >>> -1323727504);
	    is[2 + i_39_] = (byte) (int) (l >>> -1362540312);
	    is[i_39_ - -3] = (byte) (int) (l >>> -816276512);
	    is[i_39_ + 4] = (byte) (int) (l >>> -1281121832);
	    is[i_39_ + 5] = (byte) (int) (l >>> 1026016144);
	    is[6 + i_39_] = (byte) (int) (l >>> -800909304);
	    is[i_39_ + 7] = (byte) (int) l;
	    i_38_++;
	    i_39_ += 8;
	}
    }
    
    public Class85() {
	anInt1468 = 0;
	anInt1463 = 0;
	aLongArray1472 = new long[8];
	aLongArray1473 = new long[8];
	aByteArray1475 = new byte[64];
	aLongArray1469 = new long[8];
	aLongArray1474 = new long[8];
    }
}
