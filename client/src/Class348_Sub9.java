/* Class348_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub9 extends Class348
{
    int anInt6668;
    static int anInt6669;
    int anInt6670;
    static int anInt6671;
    static int anInt6672;
    Class348_Sub16_Sub5 aClass348_Sub16_Sub5_6673;
    boolean aBoolean6674;
    int anInt6675 = 0;
    Class348_Sub16_Sub5 aClass348_Sub16_Sub5_6676;
    int anInt6677;
    int anInt6678;
    Class318_Sub1_Sub3_Sub3_Sub2 aClass318_Sub1_Sub3_Sub3_Sub2_6679;
    int anInt6680;
    int anInt6681;
    static int anInt6682;
    Class348_Sub10 aClass348_Sub10_6683;
    boolean aBoolean6684;
    int anInt6685;
    Class348_Sub19_Sub1 aClass348_Sub19_Sub1_6686;
    int anInt6687;
    Class348_Sub10 aClass348_Sub10_6688;
    int anInt6689;
    static int anInt6690;
    Class318_Sub1_Sub3_Sub3_Sub1 aClass318_Sub1_Sub3_Sub3_Sub1_6691;
    Class348_Sub19_Sub1 aClass348_Sub19_Sub1_6692;
    int anInt6693;
    int anInt6694;
    Class51 aClass51_6695;
    int anInt6696;
    int[] anIntArray6697;
    int anInt6698;
    boolean aBoolean6699;
    
    static final boolean method2778(Class318_Sub1 class318_sub1, boolean bool,
				    byte[][][] is, int i, byte i_0_) {
	if (!Class348_Sub40_Sub17.aBoolean9242)
	    return false;
	int i_1_
	    = ((Class318_Sub1) class318_sub1).anInt6377 >> Class362.anInt4459;
	int i_2_ = i_1_;
	int i_3_
	    = ((Class318_Sub1) class318_sub1).anInt6388 >> Class362.anInt4459;
	int i_4_ = i_3_;
	if (class318_sub1 instanceof Class318_Sub1_Sub3) {
	    i_2_ = (((Class318_Sub1_Sub3) (Class318_Sub1_Sub3) class318_sub1)
		    .aShort8751);
	    i_4_ = (((Class318_Sub1_Sub3) (Class318_Sub1_Sub3) class318_sub1)
		    .aShort8747);
	    i_1_ = (((Class318_Sub1_Sub3) (Class318_Sub1_Sub3) class318_sub1)
		    .aShort8743);
	    i_3_ = (((Class318_Sub1_Sub3) (Class318_Sub1_Sub3) class318_sub1)
		    .aShort8750);
	}
	for (int i_5_ = i_1_; i_5_ <= i_2_; i_5_++) {
	    for (int i_6_ = i_3_; i_6_ <= i_4_; i_6_++) {
		if ((((Class318_Sub1) class318_sub1).aByte6376
		     < Class189.anInt2524)
		    && i_5_ >= Class37.anInt492 && i_5_ < Class27.anInt387
		    && i_6_ >= Class348_Sub34.anInt6974
		    && i_6_ < Class59_Sub1.anInt5293) {
		    if ((is != null
			 && ((Class318_Sub1) class318_sub1).aByte6381 >= i
			 && (is[((Class318_Sub1) class318_sub1).aByte6381]
			     [i_5_][i_6_]) == i_0_)
			|| !class318_sub1.method2378(0)
			|| class318_sub1.method2382((byte) -79)) {
			if (!bool && i_5_ >= Class239_Sub25.anInt6111 - 16
			    && i_5_ <= Class239_Sub25.anInt6111 + 16
			    && i_6_ >= Class285_Sub2.anInt8502 - 16
			    && i_6_ <= Class285_Sub2.anInt8502 + 16) {
			    if (Class348_Sub40_Sub5.aBoolean9121) {
				Class319.aClass315Array3982
				    [Class139.anInt1949++]
				    .method2361(-15481, class318_sub1);
				Class139.anInt1949 %= Class75_Sub1.anInt5652;
			    } else
				class318_sub1.method2387(Class9.aHa171, -128);
			}
		    } else
			return false;
		}
	    }
	}
	return true;
    }
    
    static final int method2779(boolean bool, int i) {
	anInt6672++;
	if ((i ^ 0xffffffff) == -6408 || i == 34843
	    || (i ^ 0xffffffff) == -34838)
	    return 6407;
	if (i == 6408 || (i ^ 0xffffffff) == -34843 || i == 34836)
	    return 6408;
	if ((i ^ 0xffffffff) == -6407 || i == 34844)
	    return 6406;
	if ((i ^ 0xffffffff) == -6410 || i == 34846)
	    return 6409;
	if ((i ^ 0xffffffff) == -6411 || i == 34847)
	    return 6410;
	if (bool != true)
	    method2780(36, null, (byte) -28, -58, -120);
	if ((i ^ 0xffffffff) == -6403)
	    return 6402;
	throw new IllegalArgumentException("");
    }
    
    static final void method2780(int i, String string, byte i_7_, int i_8_,
				 int i_9_) {
	do {
	    try {
		anInt6669++;
		Class46 class46
		    = Class348_Sub22.method2957(i, (byte) -54, i_9_);
		if (class46 != null) {
		    if (((Class46) class46).anObjectArray741 != null) {
			Class348_Sub36 class348_sub36 = new Class348_Sub36();
			((Class348_Sub36) class348_sub36).aClass46_6989
			    = class46;
			((Class348_Sub36) class348_sub36).aString6994 = string;
			((Class348_Sub36) class348_sub36).anObjectArray6987
			    = ((Class46) class46).anObjectArray741;
			((Class348_Sub36) class348_sub36).anInt6986 = i_8_;
			Class66.method705(class348_sub36);
		    }
		    if (Class240.anInt4674 == 10
			&& client.method105(class46).method3301(-1 + i_8_,
								false)) {
			if ((i_8_ ^ 0xffffffff) == -2) {
			    Class127_Sub1.anInt8380++;
			    Class348_Sub47 class348_sub47
				= Class286_Sub3.method2148((Class27
							    .aClass351_398),
							   (Class348_Sub23_Sub2
							    .aClass77_9029),
							   -93);
			    Class375.method3614(i_9_, i,
						((Class46) class46).anInt812,
						class348_sub47, -19692);
			    Class348_Sub42_Sub14.method3243(118,
							    class348_sub47);
			}
			if (i_8_ == 2) {
			    InputStream_Sub1.anInt71++;
			    Class348_Sub47 class348_sub47
				= Class286_Sub3.method2148((Class200
							    .aClass351_2638),
							   (Class348_Sub23_Sub2
							    .aClass77_9029),
							   -98);
			    Class375.method3614(i_9_, i,
						((Class46) class46).anInt812,
						class348_sub47, -19692);
			    Class348_Sub42_Sub14.method3243(126,
							    class348_sub47);
			}
			if ((i_8_ ^ 0xffffffff) == -4) {
			    Class289.anInt3703++;
			    Class348_Sub47 class348_sub47
				= Class286_Sub3.method2148((Class286_Sub4
							    .aClass351_6244),
							   (Class348_Sub23_Sub2
							    .aClass77_9029),
							   -93);
			    Class375.method3614(i_9_, i,
						((Class46) class46).anInt812,
						class348_sub47, -19692);
			    Class348_Sub42_Sub14.method3243(-80,
							    class348_sub47);
			}
			if ((i_8_ ^ 0xffffffff) == -5) {
			    Class90.anInt1514++;
			    Class348_Sub47 class348_sub47
				= Class286_Sub3.method2148((aa_Sub3
							    .aClass351_5204),
							   (Class348_Sub23_Sub2
							    .aClass77_9029),
							   -82);
			    Class375.method3614(i_9_, i,
						((Class46) class46).anInt812,
						class348_sub47, -19692);
			    Class348_Sub42_Sub14.method3243(116,
							    class348_sub47);
			}
			int i_10_ = -80 / ((64 - i_7_) / 43);
			if (i_8_ == 5) {
			    Class101_Sub2.anInt5714++;
			    Class348_Sub47 class348_sub47
				= Class286_Sub3.method2148((Class50_Sub1
							    .aClass351_5217),
							   (Class348_Sub23_Sub2
							    .aClass77_9029),
							   -94);
			    Class375.method3614(i_9_, i,
						((Class46) class46).anInt812,
						class348_sub47, -19692);
			    Class348_Sub42_Sub14.method3243(123,
							    class348_sub47);
			}
			if ((i_8_ ^ 0xffffffff) == -7) {
			    Class240.anInt4680++;
			    Class348_Sub47 class348_sub47
				= Class286_Sub3.method2148((Class222
							    .aClass351_2892),
							   (Class348_Sub23_Sub2
							    .aClass77_9029),
							   -100);
			    Class375.method3614(i_9_, i,
						((Class46) class46).anInt812,
						class348_sub47, -19692);
			    Class348_Sub42_Sub14.method3243(-4,
							    class348_sub47);
			}
			if ((i_8_ ^ 0xffffffff) == -8) {
			    Class331.anInt4134++;
			    Class348_Sub47 class348_sub47
				= Class286_Sub3.method2148((Class358
							    .aClass351_4418),
							   (Class348_Sub23_Sub2
							    .aClass77_9029),
							   -84);
			    Class375.method3614(i_9_, i,
						((Class46) class46).anInt812,
						class348_sub47, -19692);
			    Class348_Sub42_Sub14.method3243(118,
							    class348_sub47);
			}
			if (i_8_ == 8) {
			    Class112.anInt1726++;
			    Class348_Sub47 class348_sub47
				= Class286_Sub3.method2148((Class243
							    .aClass351_3165),
							   (Class348_Sub23_Sub2
							    .aClass77_9029),
							   -117);
			    Class375.method3614(i_9_, i,
						((Class46) class46).anInt812,
						class348_sub47, -19692);
			    Class348_Sub42_Sub14.method3243(-96,
							    class348_sub47);
			}
			if ((i_8_ ^ 0xffffffff) == -10) {
			    Class339.anInt4198++;
			    Class348_Sub47 class348_sub47
				= Class286_Sub3.method2148((Class311
							    .aClass351_3898),
							   (Class348_Sub23_Sub2
							    .aClass77_9029),
							   -107);
			    Class375.method3614(i_9_, i,
						((Class46) class46).anInt812,
						class348_sub47, -19692);
			    Class348_Sub42_Sub14.method3243(119,
							    class348_sub47);
			}
			if ((i_8_ ^ 0xffffffff) != -11)
			    break;
			Class308.anInt3886++;
			Class348_Sub47 class348_sub47
			    = Class286_Sub3.method2148(Class281.aClass351_3644,
						       (Class348_Sub23_Sub2
							.aClass77_9029),
						       -120);
			Class375.method3614(i_9_, i,
					    ((Class46) class46).anInt812,
					    class348_sub47, -19692);
			Class348_Sub42_Sub14.method3243(117, class348_sub47);
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("hf.D(" + i + ','
						 + (string != null ? "{...}"
						    : "null")
						 + ',' + i_7_ + ',' + i_8_
						 + ',' + i_9_ + ')'));
	    }
	    break;
	} while (false);
    }
    
    final void method2781(byte i) {
	anInt6671++;
	int i_11_ = ((Class348_Sub9) this).anInt6685;
	if (i == 21) {
	    boolean bool = ((Class348_Sub9) this).aBoolean6674;
	    if (((Class348_Sub9) this).aClass51_6695 == null) {
		if (((Class348_Sub9) this).aClass318_Sub1_Sub3_Sub3_Sub1_6691
		    == null) {
		    if ((((Class348_Sub9) this)
			 .aClass318_Sub1_Sub3_Sub3_Sub2_6679)
			!= null) {
			((Class348_Sub9) this).anInt6685
			    = (Class315.method2357
			       (-1, (((Class348_Sub9) this)
				     .aClass318_Sub1_Sub3_Sub3_Sub2_6679)));
			((Class348_Sub9) this).anInt6694
			    = (((Class318_Sub1_Sub3_Sub3_Sub2)
				(((Class348_Sub9) this)
				 .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
			       .anInt10553) << -1345944631;
			((Class348_Sub9) this).anInt6677
			    = (((Class318_Sub1_Sub3_Sub3_Sub2)
				(((Class348_Sub9) this)
				 .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
			       .anInt10558);
			((Class348_Sub9) this).anInt6681 = 256;
			((Class348_Sub9) this).anInt6696 = 256;
			((Class348_Sub9) this).aBoolean6674
			    = (((Class318_Sub1_Sub3_Sub3_Sub2)
				(((Class348_Sub9) this)
				 .aClass318_Sub1_Sub3_Sub3_Sub2_6679))
			       .aBoolean10517);
		    }
		} else {
		    int i_12_ = (Class8.method214
				 ((((Class348_Sub9) this)
				   .aClass318_Sub1_Sub3_Sub3_Sub1_6691),
				  -1));
		    if (i_12_ != i_11_) {
			((Class348_Sub9) this).anInt6685 = i_12_;
			Class79 class79
			    = (((Class318_Sub1_Sub3_Sub3_Sub1)
				(((Class348_Sub9) this)
				 .aClass318_Sub1_Sub3_Sub3_Sub1_6691))
			       .aClass79_10505);
			if (((Class79) class79).anIntArray1377 != null)
			    class79
				= class79.method794((Class318_Sub1_Sub3_Sub3
						     .aClass170_10209),
						    -1);
			if (class79 == null) {
			    ((Class348_Sub9) this).anInt6677
				= ((Class348_Sub9) this).anInt6694 = 0;
			    ((Class348_Sub9) this).anInt6681 = 256;
			    ((Class348_Sub9) this).anInt6696 = 256;
			    ((Class348_Sub9) this).aBoolean6674
				= ((Class79)
				   (((Class318_Sub1_Sub3_Sub3_Sub1)
				     (((Class348_Sub9) this)
				      .aClass318_Sub1_Sub3_Sub3_Sub1_6691))
				    .aClass79_10505)).aBoolean1370;
			} else {
			    ((Class348_Sub9) this).anInt6694
				= ((Class79) class79).anInt1392 << -401249015;
			    ((Class348_Sub9) this).anInt6681
				= ((Class79) class79).anInt1363;
			    ((Class348_Sub9) this).anInt6677
				= ((Class79) class79).anInt1356;
			    ((Class348_Sub9) this).aBoolean6674
				= ((Class79) class79).aBoolean1370;
			    ((Class348_Sub9) this).anInt6696
				= ((Class79) class79).anInt1340;
			}
		    }
		}
	    } else {
		Class51 class51
		    = (((Class348_Sub9) this).aClass51_6695.method480
		       (Class318_Sub1_Sub3_Sub3.aClass170_10209, (byte) 47));
		if (class51 == null) {
		    ((Class348_Sub9) this).anInt6681 = 256;
		    ((Class348_Sub9) this).aBoolean6674 = false;
		    ((Class348_Sub9) this).aBoolean6699 = false;
		    ((Class348_Sub9) this).anIntArray6697 = null;
		    ((Class348_Sub9) this).anInt6668 = 0;
		    ((Class348_Sub9) this).anInt6677 = 0;
		    ((Class348_Sub9) this).anInt6696 = 256;
		    ((Class348_Sub9) this).anInt6680 = 0;
		    ((Class348_Sub9) this).anInt6685 = -1;
		    ((Class348_Sub9) this).anInt6694 = 0;
		} else {
		    ((Class348_Sub9) this).anInt6681
			= ((Class51) class51).anInt916;
		    ((Class348_Sub9) this).anInt6685
			= ((Class51) class51).anInt887;
		    ((Class348_Sub9) this).anInt6696
			= ((Class51) class51).anInt878;
		    ((Class348_Sub9) this).anInt6694
			= ((Class51) class51).anInt889 << 2099748617;
		    ((Class348_Sub9) this).aBoolean6674
			= ((Class51) class51).aBoolean888;
		    ((Class348_Sub9) this).anInt6680
			= ((Class51) class51).anInt962;
		    ((Class348_Sub9) this).anInt6677
			= ((Class51) class51).anInt936;
		    ((Class348_Sub9) this).anInt6668
			= ((Class51) class51).anInt937;
		    ((Class348_Sub9) this).aBoolean6699
			= ((Class51) class51).aBoolean903;
		    ((Class348_Sub9) this).anIntArray6697
			= ((Class51) class51).anIntArray904;
		}
	    }
	    if ((((((Class348_Sub9) this).anInt6685 ^ 0xffffffff)
		  != (i_11_ ^ 0xffffffff))
		 || bool == !((Class348_Sub9) this).aBoolean6674)
		&& ((Class348_Sub9) this).aClass348_Sub16_Sub5_6676 != null) {
		Class348_Sub43.aClass348_Sub16_Sub4_7065.method2880
		    (((Class348_Sub9) this).aClass348_Sub16_Sub5_6676);
		((Class348_Sub9) this).aClass348_Sub19_Sub1_6686 = null;
		((Class348_Sub9) this).aClass348_Sub16_Sub5_6676 = null;
		((Class348_Sub9) this).aClass348_Sub10_6688 = null;
	    }
	}
    }
    
    static final byte method2782(int i, int i_13_, int i_14_) {
	if (i_14_ != 0)
	    method2783(-96, (byte) -65, -96);
	anInt6690++;
	if ((i_13_ ^ 0xffffffff) != -10)
	    return (byte) 0;
	if ((i & 0x1 ^ 0xffffffff) == -1)
	    return (byte) 1;
	return (byte) 2;
    }
    
    static final boolean method2783(int i, byte i_15_, int i_16_) {
	anInt6682++;
	int i_17_ = 53 / ((15 - i_15_) / 55);
	return (Class348_Sub42_Sub16_Sub1.method3262(i_16_, i, 118)
		& Class368.method3563(i_16_, (byte) 56, i));
    }
    
    public Class348_Sub9() {
	/* empty */
    }
}
