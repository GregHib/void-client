/* Class348_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.math.BigInteger;

abstract class Class348_Sub31 extends Class348
{
    static int anInt6913 = 0;
    static int anInt6914;
    static int anInt6915;
    int[] anIntArray6916;
    int anInt6917;
    static int anInt6918;
    static int anInt6919;
    int anInt6920;
    static BigInteger aBigInteger6921;
    static int anInt6922;
    static int anInt6923 = -1;
    static int anInt6924;
    static Class351 aClass351_6925;
    static String aString6926;
    
    static final void method3007(int i, int i_0_) {
	Class318_Sub1_Sub4_Sub1.anInt10074 = -1;
	Class285.aClass348_Sub16_Sub3_4743 = null;
	if (i_0_ != 22684)
	    anInt6913 = -117;
	anInt6922++;
	Class346.aBoolean4275 = false;
	Class124.aClass45_1848 = null;
	Class318.anInt3971 = -1;
	Class239_Sub14.anInt5994 = i;
	Class348_Sub43.anInt7068 = 1;
	Class58.anInt1059 = 0;
    }
    
    abstract void method3008(Canvas canvas, int i, int i_1_, int i_2_);
    
    static final void method3009(int i, int i_3_, int i_4_, int i_5_, int i_6_,
				 byte i_7_, int i_8_, int i_9_, int i_10_,
				 int i_11_) {
	if ((i_4_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff)
	    || (i_9_ ^ 0xffffffff) != (i ^ 0xffffffff) || i_8_ != i_5_
	    || i_3_ != i_6_) {
	    int i_12_ = i_11_;
	    int i_13_ = i_9_;
	    int i_14_ = 3 * i_11_;
	    int i_15_ = 3 * i_9_;
	    int i_16_ = 3 * i_4_;
	    int i_17_ = 3 * i;
	    int i_18_ = 3 * i_8_;
	    int i_19_ = i_3_ * 3;
	    int i_20_ = -i_11_ + (i_16_ + -i_18_) + i_5_;
	    int i_21_ = -i_9_ + i_17_ + -i_19_ + i_6_;
	    int i_22_ = i_14_ + (-i_16_ + (i_18_ + -i_16_));
	    int i_23_ = -i_17_ + (-i_17_ + (i_19_ - -i_15_));
	    int i_24_ = -i_14_ + i_16_;
	    int i_25_ = i_17_ - i_15_;
	    for (int i_26_ = 128; (i_26_ ^ 0xffffffff) >= -4097;
		 i_26_ += 128) {
		int i_27_ = i_26_ * i_26_ >> 722108876;
		int i_28_ = i_27_ * i_26_ >> -811820148;
		int i_29_ = i_20_ * i_28_;
		int i_30_ = i_28_ * i_21_;
		int i_31_ = i_22_ * i_27_;
		int i_32_ = i_27_ * i_23_;
		int i_33_ = i_24_ * i_26_;
		int i_34_ = i_25_ * i_26_;
		int i_35_ = i_11_ + (i_29_ + (i_31_ + i_33_) >> 554090892);
		int i_36_ = i_9_ + (i_30_ - -i_32_ + i_34_ >> -2068869140);
		Class239_Sub15.method1783(i_12_, -1, i_13_, i_36_, i_35_,
					  i_10_);
		i_13_ = i_36_;
		i_12_ = i_35_;
	    }
	} else
	    Class239_Sub15.method1783(i_11_, -1, i_9_, i_6_, i_5_, i_10_);
	anInt6919++;
	int i_37_ = 64 % ((50 - i_7_) / 51);
    }
    
    public static void method3010(int i) {
	aClass351_6925 = null;
	aBigInteger6921 = null;
	if (i != -1316)
	    aClass351_6925 = null;
	aString6926 = null;
    }
    
    abstract void method3011(int i, int i_38_, int i_39_, Graphics graphics,
			     int i_40_, int i_41_, int i_42_, int i_43_);
    
    static final void method3012(int i, int i_44_, int i_45_, int i_46_,
				 int i_47_, byte i_48_, int i_49_, int i_50_) {
	anInt6918++;
	int i_51_ = 0;
	int i_52_ = i;
	int i_53_ = 0;
	int i_54_ = -i_50_ + i_45_;
	int i_55_ = -i_50_ + i;
	int i_56_ = i_45_ * i_45_;
	int i_57_ = i * i;
	int i_58_ = i_54_ * i_54_;
	int i_59_ = i_55_ * i_55_;
	int i_60_ = i_57_ << -2100977983;
	int i_61_ = i_56_ << 804146657;
	int i_62_ = i_59_ << -1847202623;
	int i_63_ = i_58_ << -673422751;
	int i_64_ = i << 1215643457;
	int i_65_ = i_55_ << 1293803873;
	int i_66_ = i_60_ + (-i_64_ + 1) * i_56_;
	int i_67_ = i_57_ + -(i_61_ * (i_64_ - 1));
	int i_68_ = i_62_ + (-i_65_ + 1) * i_58_;
	int i_69_ = -((i_65_ + -1) * i_63_) + i_59_;
	int i_70_ = i_56_ << 455767874;
	int i_71_ = i_57_ << -682134078;
	int i_72_ = i_58_ << -1899579550;
	int i_73_ = i_59_ << -700391294;
	int i_74_ = 3 * i_60_;
	int i_75_ = (-3 + i_64_) * i_61_;
	int i_76_ = 3 * i_62_;
	int i_77_ = i_63_ * (-3 + i_65_);
	int i_78_ = i_71_;
	int i_79_ = i_70_ * (-1 + i);
	int i_80_ = 51 / ((i_48_ - -63) / 44);
	int i_81_ = i_73_;
	int i_82_ = (-1 + i_55_) * i_72_;
	int[] is = Class17.anIntArrayArray255[i_49_];
	Class135_Sub2.method1156(-27, i_47_ - i_54_, is, -i_45_ + i_47_,
				 i_46_);
	Class135_Sub2.method1156(-27, i_47_ + i_54_, is, -i_54_ + i_47_,
				 i_44_);
	Class135_Sub2.method1156(-27, i_45_ + i_47_, is, i_47_ + i_54_, i_46_);
	while (i_52_ > 0) {
	    boolean bool = i_55_ >= i_52_;
	    if ((i_66_ ^ 0xffffffff) > -1) {
		while (i_66_ < 0) {
		    i_67_ += i_78_;
		    i_66_ += i_74_;
		    i_78_ += i_71_;
		    i_51_++;
		    i_74_ += i_71_;
		}
	    }
	    if (bool) {
		if ((i_68_ ^ 0xffffffff) > -1) {
		    while (i_68_ < 0) {
			i_69_ += i_81_;
			i_68_ += i_76_;
			i_53_++;
			i_81_ += i_73_;
			i_76_ += i_73_;
		    }
		}
		if ((i_69_ ^ 0xffffffff) > -1) {
		    i_69_ += i_81_;
		    i_68_ += i_76_;
		    i_76_ += i_73_;
		    i_53_++;
		    i_81_ += i_73_;
		}
		i_69_ += -i_77_;
		i_68_ += -i_82_;
		i_77_ -= i_72_;
		i_82_ -= i_72_;
	    }
	    if ((i_67_ ^ 0xffffffff) > -1) {
		i_67_ += i_78_;
		i_66_ += i_74_;
		i_78_ += i_71_;
		i_51_++;
		i_74_ += i_71_;
	    }
	    i_67_ += -i_75_;
	    i_66_ += -i_79_;
	    i_75_ -= i_70_;
	    i_52_--;
	    i_79_ -= i_70_;
	    int i_83_ = -i_52_ + i_49_;
	    int i_84_ = i_49_ - -i_52_;
	    int i_85_ = i_51_ + i_47_;
	    int i_86_ = -i_51_ + i_47_;
	    if (bool) {
		int i_87_ = i_47_ + i_53_;
		int i_88_ = -i_53_ + i_47_;
		Class135_Sub2.method1156(-27, i_88_,
					 Class17.anIntArrayArray255[i_83_],
					 i_86_, i_46_);
		Class135_Sub2.method1156(-27, i_87_,
					 Class17.anIntArrayArray255[i_83_],
					 i_88_, i_44_);
		Class135_Sub2.method1156(-27, i_85_,
					 Class17.anIntArrayArray255[i_83_],
					 i_87_, i_46_);
		Class135_Sub2.method1156(-27, i_88_,
					 Class17.anIntArrayArray255[i_84_],
					 i_86_, i_46_);
		Class135_Sub2.method1156(-27, i_87_,
					 Class17.anIntArrayArray255[i_84_],
					 i_88_, i_44_);
		Class135_Sub2.method1156(-27, i_85_,
					 Class17.anIntArrayArray255[i_84_],
					 i_87_, i_46_);
	    } else {
		Class135_Sub2.method1156(-27, i_85_,
					 Class17.anIntArrayArray255[i_83_],
					 i_86_, i_46_);
		Class135_Sub2.method1156(-27, i_85_,
					 Class17.anIntArrayArray255[i_84_],
					 i_86_, i_46_);
	    }
	}
    }
    
    static final int method3013(int i, boolean bool) {
	if (bool != true)
	    anInt6923 = -14;
	anInt6915++;
	return i & 0xff;
    }
    
    static final void method3014(Class348_Sub49 class348_sub49, byte i) {
	anInt6914++;
	if (((((Class348_Sub49) class348_sub49).aByteArray7154.length
	      - ((Class348_Sub49) class348_sub49).anInt7197)
	     ^ 0xffffffff)
	    <= -2) {
	    int i_89_ = class348_sub49.method3387(255);
	    if (i_89_ >= 0 && (i_89_ ^ 0xffffffff) >= -2
		&& ((((Class348_Sub49) class348_sub49).aByteArray7154.length
		     - ((Class348_Sub49) class348_sub49).anInt7197)
		    ^ 0xffffffff) <= -3) {
		if (i != -40)
		    method3012(13, -47, -27, 107, -90, (byte) -19, -61, 36);
		int i_90_ = class348_sub49.method3330(842397944);
		if (i_90_ * 6 <= (-((Class348_Sub49) class348_sub49).anInt7197
				  + (((Class348_Sub49) class348_sub49)
				     .aByteArray7154).length)) {
		    for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
			int i_92_ = class348_sub49.method3330(842397944);
			int i_93_ = class348_sub49.method3385((byte) -126);
			if (((i_92_ ^ 0xffffffff)
			     > (Class77.anIntArray1303.length ^ 0xffffffff))
			    && Class286_Sub6.aBooleanArray6270[i_92_]
			    && ((((Class160) Class239_Sub14.aClass259_5995
						 .method1976(i_92_, -107))
				 .aChar2132) != '1'
				|| (i_93_ ^ 0xffffffff) <= 0 && i_93_ <= 1))
			    Class77.anIntArray1303[i_92_] = i_93_;
		    }
		}
	    }
	}
    }
    
    public Class348_Sub31() {
	/* empty */
    }
    
    static {
	aBigInteger6921
	    = (new BigInteger
	       ("81623a54b9f051249834ac97893910ee91109ccd1a87694f9e128982180113d8a7e9e11579269bca981fbc40e666cd1d03a27a32eee39ab94be2f8d8efef02d9",
		16));
	aString6926 = null;
	aClass351_6925 = new Class351(31, 1);
    }
}
