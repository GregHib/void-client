/* Class207 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class207
{
    byte[] aByteArray2695;
    int anInt2696;
    int[] anIntArray2697;
    int anInt2698;
    byte[] aByteArray2699;
    int anInt2700;
    int anInt2701;
    int anInt2702;
    int anInt2703;
    
    final int method1510() {
	return (((Class207) this).anInt2702 + ((Class207) this).anInt2703
		+ ((Class207) this).anInt2698);
    }
    
    final void method1511(int i) {
	int i_0_ = -1;
	if (((Class207) this).anIntArray2697.length < 255) {
	    for (int i_1_ = 0; i_1_ < ((Class207) this).anIntArray2697.length;
		 i_1_++) {
		if (((Class207) this).anIntArray2697[i_1_] == i) {
		    i_0_ = i_1_;
		    break;
		}
	    }
	    if (i_0_ == -1) {
		i_0_ = ((Class207) this).anIntArray2697.length;
		int[] is
		    = new int[((Class207) this).anIntArray2697.length + 1];
		Class214.method1578(((Class207) this).anIntArray2697, 0, is, 0,
				    ((Class207) this).anIntArray2697.length);
		((Class207) this).anIntArray2697 = is;
		is[i_0_] = i;
	    }
	} else {
	    int i_2_ = 2147483647;
	    int i_3_ = i >> 16 & 0xff;
	    int i_4_ = i >> 8 & 0xff;
	    int i_5_ = i & 0xff;
	    for (int i_6_ = 0; i_6_ < ((Class207) this).anIntArray2697.length;
		 i_6_++) {
		int i_7_ = ((Class207) this).anIntArray2697[i_6_];
		int i_8_ = i_7_ >> 16 & 0xff;
		int i_9_ = i_7_ >> 8 & 0xff;
		int i_10_ = i_7_ & 0xff;
		int i_11_ = i_3_ - i_8_;
		if (i_11_ < 0)
		    i_11_ = -i_11_;
		int i_12_ = i_4_ - i_9_;
		if (i_12_ < 0)
		    i_12_ = -i_12_;
		int i_13_ = i_5_ - i_10_;
		if (i_13_ < 0)
		    i_13_ = -i_13_;
		int i_14_ = i_11_ + i_12_ + i_13_;
		if (i_14_ < i_2_) {
		    i_2_ = i_14_;
		    i_0_ = i_6_;
		}
	    }
	}
	for (int i_15_ = ((Class207) this).anInt2696 - 1; i_15_ > 0; i_15_--) {
	    int i_16_ = i_15_ * ((Class207) this).anInt2702;
	    for (int i_17_ = ((Class207) this).anInt2702 - 1; i_17_ > 0;
		 i_17_--) {
		if (((((Class207) this).anIntArray2697
		      [((Class207) this).aByteArray2699[i_17_ + i_16_] & 0xff])
		     == 0)
		    && (((Class207) this).anIntArray2697
			[((((Class207) this).aByteArray2699
			   [i_17_ + i_16_ - 1 - ((Class207) this).anInt2702])
			  & 0xff)]) != 0)
		    ((Class207) this).aByteArray2699[i_17_ + i_16_]
			= (byte) i_0_;
	    }
	}
    }
    
    static final Class207 method1512(Class45 class45, int i) {
	byte[] is = class45.method415((byte) 73, i);
	if (is == null)
	    return null;
	return method1517(is)[0];
    }
    
    final void method1513(int i) {
	int i_18_ = method1510();
	int i_19_ = method1522();
	if (((Class207) this).anInt2702 != i_18_
	    || ((Class207) this).anInt2696 != i_19_) {
	    int i_20_ = i;
	    if (i_20_ > ((Class207) this).anInt2703)
		i_20_ = ((Class207) this).anInt2703;
	    int i_21_ = i;
	    if ((i_21_ + ((Class207) this).anInt2703
		 + ((Class207) this).anInt2702)
		> i_18_)
		i_21_ = (i_18_ - ((Class207) this).anInt2703
			 - ((Class207) this).anInt2702);
	    int i_22_ = i;
	    if (i_22_ > ((Class207) this).anInt2700)
		i_22_ = ((Class207) this).anInt2700;
	    int i_23_ = i;
	    if ((i_23_ + ((Class207) this).anInt2700
		 + ((Class207) this).anInt2696)
		> i_19_)
		i_23_ = (i_19_ - ((Class207) this).anInt2700
			 - ((Class207) this).anInt2696);
	    int i_24_ = ((Class207) this).anInt2702 + i_20_ + i_21_;
	    int i_25_ = ((Class207) this).anInt2696 + i_22_ + i_23_;
	    byte[] is = new byte[i_24_ * i_25_];
	    if (((Class207) this).aByteArray2695 == null) {
		for (int i_26_ = 0; i_26_ < ((Class207) this).anInt2696;
		     i_26_++) {
		    int i_27_ = i_26_ * ((Class207) this).anInt2702;
		    int i_28_ = (i_26_ + i_22_) * i_24_ + i_20_;
		    for (int i_29_ = 0; i_29_ < ((Class207) this).anInt2702;
			 i_29_++)
			is[i_28_++]
			    = ((Class207) this).aByteArray2699[i_27_++];
		}
	    } else {
		byte[] is_30_ = new byte[i_24_ * i_25_];
		for (int i_31_ = 0; i_31_ < ((Class207) this).anInt2696;
		     i_31_++) {
		    int i_32_ = i_31_ * ((Class207) this).anInt2702;
		    int i_33_ = (i_31_ + i_22_) * i_24_ + i_20_;
		    for (int i_34_ = 0; i_34_ < ((Class207) this).anInt2702;
			 i_34_++) {
			is_30_[i_33_]
			    = ((Class207) this).aByteArray2695[i_32_];
			is[i_33_++]
			    = ((Class207) this).aByteArray2699[i_32_++];
		    }
		}
		((Class207) this).aByteArray2695 = is_30_;
	    }
	    ((Class207) this).anInt2703 -= i_20_;
	    ((Class207) this).anInt2700 -= i_22_;
	    ((Class207) this).anInt2698 -= i_21_;
	    ((Class207) this).anInt2701 -= i_23_;
	    ((Class207) this).anInt2702 = i_24_;
	    ((Class207) this).anInt2696 = i_25_;
	    ((Class207) this).aByteArray2699 = is;
	}
    }
    
    final void method1514() {
	byte[] is = ((Class207) this).aByteArray2699;
	if (((Class207) this).aByteArray2695 == null) {
	    for (int i = (((Class207) this).anInt2696 >> 1) - 1; i >= 0; i--) {
		int i_35_ = i * ((Class207) this).anInt2702;
		int i_36_ = ((((Class207) this).anInt2696 - i - 1)
			     * ((Class207) this).anInt2702);
		for (int i_37_ = -((Class207) this).anInt2702; i_37_ < 0;
		     i_37_++) {
		    byte i_38_ = is[i_35_];
		    is[i_35_] = is[i_36_];
		    is[i_36_] = i_38_;
		    i_35_++;
		    i_36_++;
		}
	    }
	} else {
	    byte[] is_39_ = ((Class207) this).aByteArray2695;
	    for (int i = (((Class207) this).anInt2696 >> 1) - 1; i >= 0; i--) {
		int i_40_ = i * ((Class207) this).anInt2702;
		int i_41_ = ((((Class207) this).anInt2696 - i - 1)
			     * ((Class207) this).anInt2702);
		for (int i_42_ = -((Class207) this).anInt2702; i_42_ < 0;
		     i_42_++) {
		    byte i_43_ = is[i_40_];
		    is[i_40_] = is[i_41_];
		    is[i_41_] = i_43_;
		    i_43_ = is_39_[i_40_];
		    is_39_[i_40_] = is_39_[i_41_];
		    is_39_[i_41_] = i_43_;
		    i_40_++;
		    i_41_++;
		}
	    }
	}
	int i = ((Class207) this).anInt2700;
	((Class207) this).anInt2700 = ((Class207) this).anInt2701;
	((Class207) this).anInt2701 = i;
    }
    
    final void method1515(int i) {
	int i_44_ = -1;
	if (((Class207) this).anIntArray2697.length < 255) {
	    for (int i_45_ = 0;
		 i_45_ < ((Class207) this).anIntArray2697.length; i_45_++) {
		if (((Class207) this).anIntArray2697[i_45_] == i) {
		    i_44_ = i_45_;
		    break;
		}
	    }
	    if (i_44_ == -1) {
		i_44_ = ((Class207) this).anIntArray2697.length;
		int[] is
		    = new int[((Class207) this).anIntArray2697.length + 1];
		Class214.method1578(((Class207) this).anIntArray2697, 0, is, 0,
				    ((Class207) this).anIntArray2697.length);
		((Class207) this).anIntArray2697 = is;
		is[i_44_] = i;
	    }
	} else {
	    int i_46_ = 2147483647;
	    int i_47_ = i >> 16 & 0xff;
	    int i_48_ = i >> 8 & 0xff;
	    int i_49_ = i & 0xff;
	    for (int i_50_ = 0;
		 i_50_ < ((Class207) this).anIntArray2697.length; i_50_++) {
		int i_51_ = ((Class207) this).anIntArray2697[i_50_];
		int i_52_ = i_51_ >> 16 & 0xff;
		int i_53_ = i_51_ >> 8 & 0xff;
		int i_54_ = i_51_ & 0xff;
		int i_55_ = i_47_ - i_52_;
		if (i_55_ < 0)
		    i_55_ = -i_55_;
		int i_56_ = i_48_ - i_53_;
		if (i_56_ < 0)
		    i_56_ = -i_56_;
		int i_57_ = i_49_ - i_54_;
		if (i_57_ < 0)
		    i_57_ = -i_57_;
		int i_58_ = i_55_ + i_56_ + i_57_;
		if (i_58_ < i_46_) {
		    i_46_ = i_58_;
		    i_44_ = i_50_;
		}
	    }
	}
	int i_59_ = 0;
	byte[] is
	    = (new byte
	       [((Class207) this).anInt2702 * ((Class207) this).anInt2696]);
	for (int i_60_ = 0; i_60_ < ((Class207) this).anInt2696; i_60_++) {
	    for (int i_61_ = 0; i_61_ < ((Class207) this).anInt2702; i_61_++) {
		int i_62_ = ((Class207) this).aByteArray2699[i_59_] & 0xff;
		if (((Class207) this).anIntArray2697[i_62_] == 0) {
		    if (i_61_ > 0
			&& (((Class207) this).anIntArray2697
			    [(((Class207) this).aByteArray2699[i_59_ - 1]
			      & 0xff)]) != 0)
			i_62_ = i_44_;
		    else if (i_60_ > 0
			     && (((Class207) this).anIntArray2697
				 [((((Class207) this).aByteArray2699
				    [i_59_ - ((Class207) this).anInt2702])
				   & 0xff)]) != 0)
			i_62_ = i_44_;
		    else if (i_61_ < ((Class207) this).anInt2702 - 1
			     && (((Class207) this).anIntArray2697
				 [(((Class207) this).aByteArray2699[i_59_ + 1]
				   & 0xff)]) != 0)
			i_62_ = i_44_;
		    else if (i_60_ < ((Class207) this).anInt2696 - 1
			     && (((Class207) this).anIntArray2697
				 [((((Class207) this).aByteArray2699
				    [i_59_ + ((Class207) this).anInt2702])
				   & 0xff)]) != 0)
			i_62_ = i_44_;
		}
		is[i_59_++] = (byte) i_62_;
	    }
	}
	((Class207) this).aByteArray2699 = is;
    }
    
    final int[] method1516() {
	int i = method1510();
	int[] is = new int[i * method1522()];
	if (((Class207) this).aByteArray2695 != null) {
	    for (int i_63_ = 0; i_63_ < ((Class207) this).anInt2696; i_63_++) {
		int i_64_ = i_63_ * ((Class207) this).anInt2702;
		int i_65_ = (((Class207) this).anInt2703
			     + (i_63_ + ((Class207) this).anInt2700) * i);
		for (int i_66_ = 0; i_66_ < ((Class207) this).anInt2702;
		     i_66_++) {
		    is[i_65_++]
			= (((Class207) this).aByteArray2695[i_64_] << 24
			   | (((Class207) this).anIntArray2697
			      [(((Class207) this).aByteArray2699[i_64_]
				& 0xff)]));
		    i_64_++;
		}
	    }
	} else {
	    for (int i_67_ = 0; i_67_ < ((Class207) this).anInt2696; i_67_++) {
		int i_68_ = i_67_ * ((Class207) this).anInt2702;
		int i_69_ = (((Class207) this).anInt2703
			     + (i_67_ + ((Class207) this).anInt2700) * i);
		for (int i_70_ = 0; i_70_ < ((Class207) this).anInt2702;
		     i_70_++) {
		    int i_71_
			= (((Class207) this).anIntArray2697
			   [((Class207) this).aByteArray2699[i_68_++] & 0xff]);
		    if (i_71_ != 0)
			is[i_69_++] = ~0xffffff | i_71_;
		    else
			is[i_69_++] = 0;
		}
	    }
	}
	return is;
    }
    
    private static final Class207[] method1517(byte[] is) {
	Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
	((Class348_Sub49) class348_sub49).anInt7197 = is.length - 2;
	int i = class348_sub49.method3330(842397944);
	Class207[] class207s = new Class207[i];
	for (int i_72_ = 0; i_72_ < i; i_72_++)
	    class207s[i_72_] = new Class207();
	((Class348_Sub49) class348_sub49).anInt7197 = is.length - 7 - i * 8;
	int i_73_ = class348_sub49.method3330(842397944);
	int i_74_ = class348_sub49.method3330(842397944);
	int i_75_ = (class348_sub49.method3387(255) & 0xff) + 1;
	for (int i_76_ = 0; i_76_ < i; i_76_++)
	    ((Class207) class207s[i_76_]).anInt2703
		= class348_sub49.method3330(842397944);
	for (int i_77_ = 0; i_77_ < i; i_77_++)
	    ((Class207) class207s[i_77_]).anInt2700
		= class348_sub49.method3330(842397944);
	for (int i_78_ = 0; i_78_ < i; i_78_++)
	    ((Class207) class207s[i_78_]).anInt2702
		= class348_sub49.method3330(842397944);
	for (int i_79_ = 0; i_79_ < i; i_79_++)
	    ((Class207) class207s[i_79_]).anInt2696
		= class348_sub49.method3330(842397944);
	for (int i_80_ = 0; i_80_ < i; i_80_++) {
	    Class207 class207 = class207s[i_80_];
	    ((Class207) class207).anInt2698
		= (i_73_ - ((Class207) class207).anInt2702
		   - ((Class207) class207).anInt2703);
	    ((Class207) class207).anInt2701
		= (i_74_ - ((Class207) class207).anInt2696
		   - ((Class207) class207).anInt2700);
	}
	((Class348_Sub49) class348_sub49).anInt7197
	    = is.length - 7 - i * 8 - (i_75_ - 1) * 3;
	int[] is_81_ = new int[i_75_];
	for (int i_82_ = 1; i_82_ < i_75_; i_82_++) {
	    is_81_[i_82_] = class348_sub49.method3351(-1);
	    if (is_81_[i_82_] == 0)
		is_81_[i_82_] = 1;
	}
	for (int i_83_ = 0; i_83_ < i; i_83_++)
	    ((Class207) class207s[i_83_]).anIntArray2697 = is_81_;
	((Class348_Sub49) class348_sub49).anInt7197 = 0;
	for (int i_84_ = 0; i_84_ < i; i_84_++) {
	    Class207 class207 = class207s[i_84_];
	    int i_85_ = (((Class207) class207).anInt2702
			 * ((Class207) class207).anInt2696);
	    ((Class207) class207).aByteArray2699 = new byte[i_85_];
	    int i_86_ = class348_sub49.method3387(255);
	    if ((i_86_ & 0x2) == 0) {
		if ((i_86_ & 0x1) == 0) {
		    for (int i_87_ = 0; i_87_ < i_85_; i_87_++)
			((Class207) class207).aByteArray2699[i_87_]
			    = class348_sub49.method3388(-126);
		} else {
		    for (int i_88_ = 0;
			 i_88_ < ((Class207) class207).anInt2702; i_88_++) {
			for (int i_89_ = 0;
			     i_89_ < ((Class207) class207).anInt2696; i_89_++)
			    ((Class207) class207).aByteArray2699
				[(i_88_
				  + i_89_ * ((Class207) class207).anInt2702)]
				= class348_sub49.method3388(-96);
		    }
		}
	    } else {
		boolean bool = false;
		((Class207) class207).aByteArray2695 = new byte[i_85_];
		if ((i_86_ & 0x1) == 0) {
		    for (int i_90_ = 0; i_90_ < i_85_; i_90_++)
			((Class207) class207).aByteArray2699[i_90_]
			    = class348_sub49.method3388(-118);
		    for (int i_91_ = 0; i_91_ < i_85_; i_91_++) {
			byte i_92_
			    = (((Class207) class207).aByteArray2695[i_91_]
			       = class348_sub49.method3388(-89));
			bool = bool | i_92_ != -1;
		    }
		} else {
		    for (int i_93_ = 0;
			 i_93_ < ((Class207) class207).anInt2702; i_93_++) {
			for (int i_94_ = 0;
			     i_94_ < ((Class207) class207).anInt2696; i_94_++)
			    ((Class207) class207).aByteArray2699
				[(i_93_
				  + i_94_ * ((Class207) class207).anInt2702)]
				= class348_sub49.method3388(-84);
		    }
		    for (int i_95_ = 0;
			 i_95_ < ((Class207) class207).anInt2702; i_95_++) {
			for (int i_96_ = 0;
			     i_96_ < ((Class207) class207).anInt2696;
			     i_96_++) {
			    byte i_97_
				= (((Class207) class207).aByteArray2695
				       [i_95_ + i_96_ * (((Class207) class207)
							 .anInt2702)]
				   = class348_sub49.method3388(-122));
			    bool = bool | i_97_ != -1;
			}
		    }
		}
		if (!bool)
		    ((Class207) class207).aByteArray2695 = null;
	    }
	}
	return class207s;
    }
    
    final void method1518() {
	byte[] is = ((Class207) this).aByteArray2699;
	if (((Class207) this).aByteArray2695 == null) {
	    for (int i = ((Class207) this).anInt2696 - 1; i >= 0; i--) {
		int i_98_ = i * ((Class207) this).anInt2702;
		for (int i_99_ = (i + 1) * ((Class207) this).anInt2702;
		     i_98_ < i_99_; i_98_++) {
		    i_99_--;
		    byte i_100_ = is[i_98_];
		    is[i_98_] = is[i_99_];
		    is[i_99_] = i_100_;
		}
	    }
	} else {
	    byte[] is_101_ = ((Class207) this).aByteArray2695;
	    for (int i = ((Class207) this).anInt2696 - 1; i >= 0; i--) {
		int i_102_ = i * ((Class207) this).anInt2702;
		for (int i_103_ = (i + 1) * ((Class207) this).anInt2702;
		     i_102_ < i_103_; i_102_++) {
		    i_103_--;
		    byte i_104_ = is[i_102_];
		    is[i_102_] = is[i_103_];
		    is[i_103_] = i_104_;
		    i_104_ = is_101_[i_102_];
		    is_101_[i_102_] = is_101_[i_103_];
		    is_101_[i_103_] = i_104_;
		}
	    }
	}
	int i = ((Class207) this).anInt2703;
	((Class207) this).anInt2703 = ((Class207) this).anInt2698;
	((Class207) this).anInt2698 = i;
    }
    
    static final Class207[] method1519(Class45 class45, int i, int i_105_) {
	byte[] is = class45.method410(-1860, i, i_105_);
	if (is == null)
	    return null;
	return method1517(is);
    }
    
    final void method1520() {
	byte[] is
	    = (new byte
	       [((Class207) this).anInt2702 * ((Class207) this).anInt2696]);
	int i = 0;
	if (((Class207) this).aByteArray2695 == null) {
	    for (int i_106_ = 0; i_106_ < ((Class207) this).anInt2702;
		 i_106_++) {
		for (int i_107_ = ((Class207) this).anInt2696 - 1; i_107_ >= 0;
		     i_107_--)
		    is[i++]
			= (((Class207) this).aByteArray2699
			   [i_106_ + i_107_ * ((Class207) this).anInt2702]);
	    }
	    ((Class207) this).aByteArray2699 = is;
	} else {
	    byte[] is_108_ = new byte[(((Class207) this).anInt2702
				       * ((Class207) this).anInt2696)];
	    for (int i_109_ = 0; i_109_ < ((Class207) this).anInt2702;
		 i_109_++) {
		for (int i_110_ = ((Class207) this).anInt2696 - 1; i_110_ >= 0;
		     i_110_--) {
		    is[i] = (((Class207) this).aByteArray2699
			     [i_109_ + i_110_ * ((Class207) this).anInt2702]);
		    is_108_[i++]
			= (((Class207) this).aByteArray2695
			   [i_109_ + i_110_ * ((Class207) this).anInt2702]);
		}
	    }
	    ((Class207) this).aByteArray2699 = is;
	    ((Class207) this).aByteArray2695 = is_108_;
	}
	int i_111_ = ((Class207) this).anInt2700;
	((Class207) this).anInt2700 = ((Class207) this).anInt2703;
	((Class207) this).anInt2703 = ((Class207) this).anInt2701;
	((Class207) this).anInt2701 = ((Class207) this).anInt2698;
	((Class207) this).anInt2698 = ((Class207) this).anInt2700;
	i_111_ = ((Class207) this).anInt2696;
	((Class207) this).anInt2696 = ((Class207) this).anInt2702;
	((Class207) this).anInt2702 = i_111_;
    }
    
    public Class207() {
	/* empty */
    }
    
    static final Class207 method1521(Class45 class45, int i, int i_112_) {
	byte[] is = class45.method410(-1860, i, i_112_);
	if (is == null)
	    return null;
	return method1517(is)[0];
    }
    
    final int method1522() {
	return (((Class207) this).anInt2696 + ((Class207) this).anInt2700
		+ ((Class207) this).anInt2701);
    }
    
    static final Class207[] method1523(Class45 class45, int i) {
	byte[] is = class45.method415((byte) 73, i);
	if (is == null)
	    return null;
	return method1517(is);
    }
    
    final void method1524() {
	int i = method1510();
	int i_113_ = method1522();
	if (((Class207) this).anInt2702 != i
	    || ((Class207) this).anInt2696 != i_113_) {
	    byte[] is = new byte[i * i_113_];
	    if (((Class207) this).aByteArray2695 != null) {
		byte[] is_114_ = new byte[i * i_113_];
		for (int i_115_ = 0; i_115_ < ((Class207) this).anInt2696;
		     i_115_++) {
		    int i_116_ = i_115_ * ((Class207) this).anInt2702;
		    int i_117_ = ((i_115_ + ((Class207) this).anInt2700) * i
				  + ((Class207) this).anInt2703);
		    for (int i_118_ = 0; i_118_ < ((Class207) this).anInt2702;
			 i_118_++) {
			is[i_117_] = ((Class207) this).aByteArray2699[i_116_];
			is_114_[i_117_++]
			    = ((Class207) this).aByteArray2695[i_116_++];
		    }
		}
		((Class207) this).aByteArray2695 = is_114_;
	    } else {
		for (int i_119_ = 0; i_119_ < ((Class207) this).anInt2696;
		     i_119_++) {
		    int i_120_ = i_119_ * ((Class207) this).anInt2702;
		    int i_121_ = ((i_119_ + ((Class207) this).anInt2700) * i
				  + ((Class207) this).anInt2703);
		    for (int i_122_ = 0; i_122_ < ((Class207) this).anInt2702;
			 i_122_++)
			is[i_121_++]
			    = ((Class207) this).aByteArray2699[i_120_++];
		}
	    }
	    ((Class207) this).anInt2703 = ((Class207) this).anInt2698
		= ((Class207) this).anInt2700 = ((Class207) this).anInt2701
		= 0;
	    ((Class207) this).anInt2702 = i;
	    ((Class207) this).anInt2696 = i_113_;
	    ((Class207) this).aByteArray2699 = is;
	}
    }
}
