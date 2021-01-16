/* Class324_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class324_Sub1 extends Class324
{
    private ha_Sub1 aHa_Sub1_6486;
    private int[] anIntArray6487;
    private int[] anIntArray6488;
    private int[] anIntArray6489;
    private byte[][] aByteArrayArray6490;
    private int[] anIntArray6491;
    
    final void fa(char c, int i, int i_0_, int i_1_, boolean bool) {
	i += anIntArray6491[c];
	i_0_ += anIntArray6487[c];
	int i_2_ = anIntArray6489[c];
	int i_3_ = anIntArray6488[c];
	int i_4_ = ((ha_Sub1) aHa_Sub1_6486).anInt7477;
	int i_5_ = i + i_0_ * i_4_;
	int i_6_ = i_4_ - i_2_;
	int i_7_ = 0;
	int i_8_ = 0;
	if (i_0_ < ((ha_Sub1) aHa_Sub1_6486).anInt7476) {
	    int i_9_ = ((ha_Sub1) aHa_Sub1_6486).anInt7476 - i_0_;
	    i_3_ -= i_9_;
	    i_0_ = ((ha_Sub1) aHa_Sub1_6486).anInt7476;
	    i_8_ += i_9_ * i_2_;
	    i_5_ += i_9_ * i_4_;
	}
	if (i_0_ + i_3_ > ((ha_Sub1) aHa_Sub1_6486).anInt7503)
	    i_3_ -= i_0_ + i_3_ - ((ha_Sub1) aHa_Sub1_6486).anInt7503;
	if (i < ((ha_Sub1) aHa_Sub1_6486).anInt7496) {
	    int i_10_ = ((ha_Sub1) aHa_Sub1_6486).anInt7496 - i;
	    i_2_ -= i_10_;
	    i = ((ha_Sub1) aHa_Sub1_6486).anInt7496;
	    i_8_ += i_10_;
	    i_5_ += i_10_;
	    i_7_ += i_10_;
	    i_6_ += i_10_;
	}
	if (i + i_2_ > ((ha_Sub1) aHa_Sub1_6486).anInt7507) {
	    int i_11_ = i + i_2_ - ((ha_Sub1) aHa_Sub1_6486).anInt7507;
	    i_2_ -= i_11_;
	    i_7_ += i_11_;
	    i_6_ += i_11_;
	}
	if (i_2_ > 0 && i_3_ > 0) {
	    if ((i_1_ & ~0xffffff) == -16777216)
		method2588(aByteArrayArray6490[c],
			   ((ha_Sub1) aHa_Sub1_6486).anIntArray7483, i_1_,
			   i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
	    else if ((i_1_ & ~0xffffff) != 0)
		method2586(aByteArrayArray6490[c],
			   ((ha_Sub1) aHa_Sub1_6486).anIntArray7483, i_1_,
			   i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
	}
    }
    
    private final void method2586(byte[] is, int[] is_12_, int i, int i_13_,
				  int i_14_, int i_15_, int i_16_, int i_17_,
				  int i_18_) {
	int i_19_ = i >>> 24;
	int i_20_ = 255 - i_19_;
	for (int i_21_ = -i_16_; i_21_ < 0; i_21_++) {
	    for (int i_22_ = -i_15_; i_22_ < 0; i_22_++) {
		if (is[i_13_++] != 0) {
		    int i_23_ = ((((i & 0xff00ff) * i_19_ & ~0xff00ff)
				  + ((i & 0xff00) * i_19_ & 0xff0000))
				 >> 8);
		    int i_24_ = is_12_[i_14_];
		    is_12_[i_14_++]
			= ((((i_24_ & 0xff00ff) * i_20_ & ~0xff00ff)
			    + ((i_24_ & 0xff00) * i_20_ & 0xff0000))
			   >> 8) + i_23_;
		} else
		    i_14_++;
	    }
	    i_14_ += i_17_;
	    i_13_ += i_18_;
	}
    }
    
    private final void method2587(byte[] is, int[] is_25_, int i, int i_26_,
				  int i_27_, int i_28_, int i_29_, int i_30_,
				  int i_31_, int i_32_, int i_33_, int i_34_,
				  aa var_aa, int i_35_, int i_36_) {
	aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
	int[] is_37_ = ((aa_Sub3) var_aa_Sub3).anIntArray5201;
	int[] is_38_ = ((aa_Sub3) var_aa_Sub3).anIntArray5202;
	int i_39_ = i_33_;
	if (i_36_ > i_39_) {
	    i_39_ = i_36_;
	    i_27_ += (i_36_ - i_33_) * ((ha_Sub1) aHa_Sub1_6486).anInt7477;
	    i_26_ += (i_36_ - i_33_) * i_34_;
	}
	int i_40_ = (i_36_ + is_37_.length < i_33_ + i_29_
		     ? i_36_ + is_37_.length : i_33_ + i_29_);
	for (int i_41_ = i_39_; i_41_ < i_40_; i_41_++) {
	    int i_42_ = i_35_ + is_37_[i_41_ - i_36_];
	    int i_43_ = is_38_[i_41_ - i_36_];
	    int i_44_ = i_28_;
	    if (i_32_ > i_42_) {
		int i_45_ = i_32_ - i_42_;
		if (i_45_ >= i_43_) {
		    i_26_ += i_28_ + i_31_;
		    i_27_ += i_28_ + i_30_;
		    continue;
		}
		i_43_ -= i_45_;
	    } else {
		int i_46_ = i_42_ - i_32_;
		if (i_46_ >= i_28_) {
		    i_26_ += i_28_ + i_31_;
		    i_27_ += i_28_ + i_30_;
		    continue;
		}
		i_26_ += i_46_;
		i_44_ -= i_46_;
		i_27_ += i_46_;
	    }
	    int i_47_ = 0;
	    if (i_44_ < i_43_)
		i_43_ = i_44_;
	    else
		i_47_ = i_44_ - i_43_;
	    for (int i_48_ = 0; i_48_ < i_43_; i_48_++) {
		if (is[i_26_++] != 0)
		    is_25_[i_27_++] = i;
		else
		    i_27_++;
	    }
	    i_26_ += i_47_ + i_31_;
	    i_27_ += i_47_ + i_30_;
	}
    }
    
    private final void method2588(byte[] is, int[] is_49_, int i, int i_50_,
				  int i_51_, int i_52_, int i_53_, int i_54_,
				  int i_55_) {
	int i_56_ = -(i_52_ >> 2);
	i_52_ = -(i_52_ & 0x3);
	for (int i_57_ = -i_53_; i_57_ < 0; i_57_++) {
	    for (int i_58_ = i_56_; i_58_ < 0; i_58_++) {
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
	    }
	    for (int i_59_ = i_52_; i_59_ < 0; i_59_++) {
		if (is[i_50_++] != 0)
		    is_49_[i_51_++] = i;
		else
		    i_51_++;
	    }
	    i_51_ += i_54_;
	    i_50_ += i_55_;
	}
    }
    
    final void method2578(char c, int i, int i_60_, int i_61_, boolean bool,
			  aa var_aa, int i_62_, int i_63_) {
	if (var_aa == null)
	    fa(c, i, i_60_, i_61_, bool);
	else {
	    i += anIntArray6491[c];
	    i_60_ += anIntArray6487[c];
	    int i_64_ = anIntArray6489[c];
	    int i_65_ = anIntArray6488[c];
	    int i_66_ = ((ha_Sub1) aHa_Sub1_6486).anInt7477;
	    int i_67_ = i + i_60_ * i_66_;
	    int i_68_ = i_66_ - i_64_;
	    int i_69_ = 0;
	    int i_70_ = 0;
	    if (i_60_ < ((ha_Sub1) aHa_Sub1_6486).anInt7476) {
		int i_71_ = ((ha_Sub1) aHa_Sub1_6486).anInt7476 - i_60_;
		i_65_ -= i_71_;
		i_60_ = ((ha_Sub1) aHa_Sub1_6486).anInt7476;
		i_70_ += i_71_ * i_64_;
		i_67_ += i_71_ * i_66_;
	    }
	    if (i_60_ + i_65_ > ((ha_Sub1) aHa_Sub1_6486).anInt7503)
		i_65_ -= i_60_ + i_65_ - ((ha_Sub1) aHa_Sub1_6486).anInt7503;
	    if (i < ((ha_Sub1) aHa_Sub1_6486).anInt7496) {
		int i_72_ = ((ha_Sub1) aHa_Sub1_6486).anInt7496 - i;
		i_64_ -= i_72_;
		i = ((ha_Sub1) aHa_Sub1_6486).anInt7496;
		i_70_ += i_72_;
		i_67_ += i_72_;
		i_69_ += i_72_;
		i_68_ += i_72_;
	    }
	    if (i + i_64_ > ((ha_Sub1) aHa_Sub1_6486).anInt7507) {
		int i_73_ = i + i_64_ - ((ha_Sub1) aHa_Sub1_6486).anInt7507;
		i_64_ -= i_73_;
		i_69_ += i_73_;
		i_68_ += i_73_;
	    }
	    if (i_64_ > 0 && i_65_ > 0) {
		if ((i_61_ & ~0xffffff) == -16777216)
		    method2587(aByteArrayArray6490[c],
			       ((ha_Sub1) aHa_Sub1_6486).anIntArray7483, i_61_,
			       i_70_, i_67_, i_64_, i_65_, i_68_, i_69_, i,
			       i_60_, anIntArray6489[c], var_aa, i_62_, i_63_);
		else
		    method2589(aByteArrayArray6490[c],
			       ((ha_Sub1) aHa_Sub1_6486).anIntArray7483, i_61_,
			       i_70_, i_67_, i_64_, i_65_, i_68_, i_69_, i,
			       i_60_, anIntArray6489[c], var_aa, i_62_, i_63_);
	    }
	}
    }
    
    private final void method2589(byte[] is, int[] is_74_, int i, int i_75_,
				  int i_76_, int i_77_, int i_78_, int i_79_,
				  int i_80_, int i_81_, int i_82_, int i_83_,
				  aa var_aa, int i_84_, int i_85_) {
	aa_Sub3 var_aa_Sub3 = (aa_Sub3) var_aa;
	int[] is_86_ = ((aa_Sub3) var_aa_Sub3).anIntArray5201;
	int[] is_87_ = ((aa_Sub3) var_aa_Sub3).anIntArray5202;
	int i_88_ = i_81_ - ((ha_Sub1) aHa_Sub1_6486).anInt7496;
	int i_89_ = i_82_;
	if (i_85_ > i_89_) {
	    i_89_ = i_85_;
	    i_76_ += (i_85_ - i_82_) * ((ha_Sub1) aHa_Sub1_6486).anInt7477;
	    i_75_ += (i_85_ - i_82_) * i_83_;
	}
	int i_90_ = (i_85_ + is_86_.length < i_82_ + i_78_
		     ? i_85_ + is_86_.length : i_82_ + i_78_);
	int i_91_ = i >>> 24;
	int i_92_ = 255 - i_91_;
	for (int i_93_ = i_89_; i_93_ < i_90_; i_93_++) {
	    int i_94_ = is_86_[i_93_ - i_85_] + i_84_;
	    int i_95_ = is_87_[i_93_ - i_85_];
	    int i_96_ = i_77_;
	    if (i_88_ > i_94_) {
		int i_97_ = i_88_ - i_94_;
		if (i_97_ >= i_95_) {
		    i_75_ += i_77_ + i_80_;
		    i_76_ += i_77_ + i_79_;
		    continue;
		}
		i_95_ -= i_97_;
	    } else {
		int i_98_ = i_94_ - i_88_;
		if (i_98_ >= i_77_) {
		    i_75_ += i_77_ + i_80_;
		    i_76_ += i_77_ + i_79_;
		    continue;
		}
		i_75_ += i_98_;
		i_96_ -= i_98_;
		i_76_ += i_98_;
	    }
	    int i_99_ = 0;
	    if (i_96_ < i_95_)
		i_95_ = i_96_;
	    else
		i_99_ = i_96_ - i_95_;
	    for (int i_100_ = -i_95_; i_100_ < 0; i_100_++) {
		if (is[i_75_++] != 0) {
		    int i_101_ = ((((i & 0xff00ff) * i_91_ & ~0xff00ff)
				   + ((i & 0xff00) * i_91_ & 0xff0000))
				  >> 8);
		    int i_102_ = is_74_[i_76_];
		    is_74_[i_76_++]
			= ((((i_102_ & 0xff00ff) * i_92_ & ~0xff00ff)
			    + ((i_102_ & 0xff00) * i_92_ & 0xff0000))
			   >> 8) + i_101_;
		} else
		    i_76_++;
	    }
	    i_75_ += i_99_ + i_80_;
	    i_76_ += i_99_ + i_79_;
	}
    }
    
    Class324_Sub1(ha_Sub1 var_ha_Sub1, Class143 class143, Class207[] class207s,
		  int[] is, int[] is_103_) {
	super(var_ha_Sub1, class143);
	aHa_Sub1_6486 = var_ha_Sub1;
	anIntArray6489 = is;
	anIntArray6488 = is_103_;
	aByteArrayArray6490 = new byte[class207s.length][];
	anIntArray6487 = new int[class207s.length];
	anIntArray6491 = new int[class207s.length];
	for (int i = 0; i < class207s.length; i++) {
	    aByteArrayArray6490[i] = ((Class207) class207s[i]).aByteArray2699;
	    anIntArray6487[i] = ((Class207) class207s[i]).anInt2700;
	    anIntArray6491[i] = ((Class207) class207s[i]).anInt2703;
	}
    }
}
