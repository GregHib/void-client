/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Dimension;

import jaggl.OpenGL;

final class Class104
{
    static int anInt1610;
    static int anInt1611;
    private int anInt1612;
    private int anInt1613;
    static int anInt1614;
    static int anInt1615;
    private ha_Sub2 aHa_Sub2_1616;
    byte[] aByteArray1617;
    private int anInt1618;
    static int anInt1619;
    static Class221 aClass221_1620 = new Class221();
    static int anInt1621;
    private s_Sub2 aS_Sub2_1622;
    private Class232[][] aClass232ArrayArray1623;
    int anInt1624;
    private int anInt1625;
    static int[] anIntArray1626 = new int[1];
    static Class45 aClass45_1627;
    static int anInt1628;
    static int anInt1629;
    static int anInt1630;
    
    final void method951(r var_r, int i, int i_0_, int i_1_) {
	anInt1619++;
	r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
	i += ((r_Sub2) var_r_Sub2).anInt10489 - -1;
	i_0_ += ((r_Sub2) var_r_Sub2).anInt10484 + 1;
	int i_2_ = ((Class104) this).anInt1624 * i_0_ + i;
	int i_3_ = 0;
	int i_4_ = ((r_Sub2) var_r_Sub2).anInt10487;
	int i_5_ = ((r_Sub2) var_r_Sub2).anInt10482;
	int i_6_ = ((Class104) this).anInt1624 - i_5_;
	int i_7_ = 0;
	if (i_0_ <= 0) {
	    int i_8_ = -i_0_ + 1;
	    i_3_ += i_8_ * i_5_;
	    i_4_ -= i_8_;
	    i_0_ = 1;
	    i_2_ += i_8_ * ((Class104) this).anInt1624;
	}
	if (anInt1612 <= i_0_ + i_4_) {
	    int i_9_ = 1 + (i_4_ + i_0_ + -anInt1612);
	    i_4_ -= i_9_;
	}
	if (i <= 0) {
	    int i_10_ = 1 - i;
	    i_5_ -= i_10_;
	    i_2_ += i_10_;
	    i = 1;
	    i_6_ += i_10_;
	    i_7_ += i_10_;
	    i_3_ += i_10_;
	}
	if ((((Class104) this).anInt1624 ^ 0xffffffff)
	    >= (i_5_ + i ^ 0xffffffff)) {
	    int i_11_ = 1 + (i - -i_5_ + -((Class104) this).anInt1624);
	    i_7_ += i_11_;
	    i_6_ += i_11_;
	    i_5_ -= i_11_;
	}
	int i_12_ = 101 / ((-30 - i_1_) / 62);
	if (i_5_ > 0 && (i_4_ ^ 0xffffffff) < -1) {
	    Class248.method1895(i_3_, ((Class104) this).aByteArray1617, i_4_,
				i_2_, i_6_, i_7_,
				((r_Sub2) var_r_Sub2).aByteArray10486, i_5_,
				(byte) 121);
	    method952(i_4_, i_5_, i, -1, i_0_);
	}
    }
    
    private final void method952(int i, int i_13_, int i_14_, int i_15_,
				 int i_16_) {
	anInt1629++;
	if (aClass232ArrayArray1623 != null) {
	    int i_17_ = i_14_ + -1 >> -271430585;
	    int i_18_ = -1 + i_14_ - 1 - -i_13_ >> 2032031335;
	    int i_19_ = i_15_ + i_16_ >> 472514151;
	    int i_20_ = -1 + i + i_16_ - 1 >> 1145890055;
	    for (int i_21_ = i_17_; i_18_ >= i_21_; i_21_++) {
		Class232[] class232s = aClass232ArrayArray1623[i_21_];
		for (int i_22_ = i_19_;
		     (i_20_ ^ 0xffffffff) <= (i_22_ ^ 0xffffffff); i_22_++)
		    ((Class232) class232s[i_22_]).aBoolean3009 = true;
	    }
	}
    }
    
    public static void method953(byte i) {
	anIntArray1626 = null;
	aClass45_1627 = null;
	aClass221_1620 = null;
	if (i != 9)
	    aClass221_1620 = null;
    }
    
    final boolean method954(int i, byte i_23_, int i_24_, r var_r) {
	anInt1630++;
	r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
	i_24_ += 1 + ((r_Sub2) var_r_Sub2).anInt10484;
	if (i_23_ != 88)
	    aClass232ArrayArray1623 = null;
	i += 1 + ((r_Sub2) var_r_Sub2).anInt10489;
	int i_25_ = i_24_ * ((Class104) this).anInt1624 + i;
	int i_26_ = ((r_Sub2) var_r_Sub2).anInt10487;
	int i_27_ = ((r_Sub2) var_r_Sub2).anInt10482;
	int i_28_ = -i_27_ + ((Class104) this).anInt1624;
	if (i_24_ <= 0) {
	    int i_29_ = -i_24_ + 1;
	    i_26_ -= i_29_;
	    i_24_ = 1;
	    i_25_ += ((Class104) this).anInt1624 * i_29_;
	}
	if ((anInt1612 ^ 0xffffffff) >= (i_26_ + i_24_ ^ 0xffffffff)) {
	    int i_30_ = -anInt1612 + (1 + (i_24_ + i_26_));
	    i_26_ -= i_30_;
	}
	if ((i ^ 0xffffffff) >= -1) {
	    int i_31_ = -i + 1;
	    i_27_ -= i_31_;
	    i_25_ += i_31_;
	    i_28_ += i_31_;
	    i = 1;
	}
	if (((Class104) this).anInt1624 <= i - -i_27_) {
	    int i_32_ = -((Class104) this).anInt1624 + 1 + (i + i_27_);
	    i_27_ -= i_32_;
	    i_28_ += i_32_;
	}
	if (i_27_ <= 0 || (i_26_ ^ 0xffffffff) >= -1)
	    return false;
	int i_33_ = 8;
	i_28_ += (-1 + i_33_) * ((Class104) this).anInt1624;
	return Class59_Sub1.method552(i_28_, i_26_, (byte) 112, i_33_, i_27_,
				      i_25_, ((Class104) this).aByteArray1617);
    }
    
    static final boolean method955(int i, int i_34_) {
	if (i != 22311)
	    aClass221_1620 = null;
	anInt1615++;
	if ((i_34_ ^ 0xffffffff) > -5 || i_34_ > 8)
	    return false;
	return true;
    }
    
    final void method956(boolean bool, int i, boolean[][] bools, int i_35_,
			 int i_36_, int i_37_) {
	aHa_Sub2_1616.method3728(false, 114);
	int i_38_ = 80 / ((i - 15) / 60);
	anInt1614++;
	aHa_Sub2_1616.method3748(0, false);
	aHa_Sub2_1616.method3757(-2, -119);
	aHa_Sub2_1616.method3761(0, 1);
	aHa_Sub2_1616.method3753(1, 1);
	float f = 1.0F / (float) (((ha_Sub2) aHa_Sub2_1616).anInt7733 * 128);
	if (!bool) {
	    for (int i_39_ = 0; anInt1625 > i_39_; i_39_++) {
		int i_40_ = i_39_ << anInt1613;
		int i_41_ = i_39_ + 1 << anInt1613;
		for (int i_42_ = 0;
		     (i_42_ ^ 0xffffffff) > (anInt1618 ^ 0xffffffff);
		     i_42_++) {
		    int i_43_ = 0;
		    int i_44_ = i_42_ << anInt1613;
		    int i_45_ = 1 + i_42_ << anInt1613;
		    Class348_Sub49_Sub1 class348_sub49_sub1
			= ((ha_Sub2) aHa_Sub2_1616).aClass348_Sub49_Sub1_7798;
		    ((Class348_Sub49) class348_sub49_sub1).anInt7197 = 0;
		    for (int i_46_ = i_40_; i_41_ > i_46_; i_46_++) {
			if ((-i_36_ + i_46_ ^ 0xffffffff) <= (-i_35_
							      ^ 0xffffffff)
			    && -i_36_ + i_46_ <= i_35_) {
			    int i_47_
				= i_44_ + i_46_ * ((s) aS_Sub2_1622).anInt4587;
			    for (int i_48_ = i_44_;
				 (i_48_ ^ 0xffffffff) > (i_45_ ^ 0xffffffff);
				 i_48_++) {
				if (((-i_37_ + i_48_ ^ 0xffffffff)
				     <= (-i_35_ ^ 0xffffffff))
				    && -i_37_ + i_48_ <= i_35_
				    && (bools[i_35_ + i_48_ - i_37_]
					[i_35_ + i_46_ + -i_36_])) {
				    short[] is
					= (((s_Sub2) aS_Sub2_1622)
					   .aShortArrayArray8267[i_47_]);
				    if (is != null) {
					if (!((ha_Sub2) aHa_Sub2_1616)
					     .aBoolean7775) {
					    for (int i_49_ = 0;
						 is.length > i_49_; i_49_++) {
						class348_sub49_sub1.method3397
						    (111, is[i_49_] & 0xffff);
						i_43_++;
					    }
					} else {
					    for (int i_50_ = 0;
						 ((is.length ^ 0xffffffff)
						  < (i_50_ ^ 0xffffffff));
						 i_50_++) {
						i_43_++;
						class348_sub49_sub1.method3337
						    ((byte) 107,
						     0xffff & is[i_50_]);
					    }
					}
				    }
				}
				i_47_++;
			    }
			}
		    }
		    if ((i_43_ ^ 0xffffffff) < -1) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glScalef(f, f, 1.0F);
			OpenGL.glTranslatef((float) -i_42_ / f,
					    (float) -i_39_ / f, 1.0F);
			OpenGL.glMatrixMode(5888);
			aClass232ArrayArray1623[i_42_][i_39_].method1643
			    ((((Class348_Sub49) class348_sub49_sub1)
			      .aByteArray7154),
			     5123, i_43_, (byte) 70);
		    }
		}
	    }
	} else {
	    for (int i_51_ = 0;
		 (anInt1625 ^ 0xffffffff) < (i_51_ ^ 0xffffffff); i_51_++) {
		int i_52_ = i_51_ << anInt1613;
		int i_53_ = 1 + i_51_ << anInt1613;
		for (int i_54_ = 0; i_54_ < anInt1618; i_54_++) {
		    int i_55_ = i_54_ << anInt1613;
		    int i_56_ = 1 + i_54_ << anInt1613;
		while_43_:
		    for (int i_57_ = i_55_;
			 (i_57_ ^ 0xffffffff) > (i_56_ ^ 0xffffffff);
			 i_57_++) {
			if ((i_57_ + -i_37_ ^ 0xffffffff) <= (-i_35_
							      ^ 0xffffffff)
			    && i_35_ >= -i_37_ + i_57_) {
			    for (int i_58_ = i_52_; i_53_ > i_58_; i_58_++) {
				if (-i_35_ <= -i_36_ + i_58_
				    && -i_36_ + i_58_ <= i_35_
				    && (bools[i_35_ + i_57_ - i_37_]
					[i_35_ + i_58_ + -i_36_])) {
				    OpenGL.glMatrixMode(5890);
				    OpenGL.glLoadIdentity();
				    OpenGL.glScalef(f, f, 1.0F);
				    OpenGL.glTranslatef((float) -i_54_ / f,
							(float) -i_51_ / f,
							1.0F);
				    OpenGL.glMatrixMode(5888);
				    aClass232ArrayArray1623[i_54_][i_51_]
					.method1644((byte) -121);
				    break while_43_;
				}
			    }
			}
		    }
		}
	    }
	}
	OpenGL.glMatrixMode(5890);
	OpenGL.glLoadIdentity();
	OpenGL.glMatrixMode(5888);
    }
    
    final void method957(int i) {
	anInt1628++;
	aClass232ArrayArray1623 = new Class232[anInt1618][anInt1625];
	for (int i_59_ = i; (anInt1625 ^ 0xffffffff) < (i_59_ ^ 0xffffffff);
	     i_59_++) {
	    for (int i_60_ = 0;
		 (i_60_ ^ 0xffffffff) > (anInt1618 ^ 0xffffffff); i_60_++)
		aClass232ArrayArray1623[i_60_][i_59_]
		    = new Class232(aHa_Sub2_1616, this, aS_Sub2_1622, i_60_,
				   i_59_, anInt1613, 1 + 128 * i_60_,
				   128 * i_59_ + 1);
	}
    }
    
    static final ha method958(boolean bool, int i, d var_d, int i_61_,
			      Canvas canvas, Class45 class45) {
	try {
	    if (bool != true)
		aClass221_1620 = null;
	    anInt1610++;
	    int i_62_ = 0;
	    int i_63_ = 0;
	    if (canvas != null) {
		Dimension dimension = canvas.getSize();
		i_63_ = dimension.height;
		i_62_ = dimension.width;
	    }
	    return ha.method3692(i_61_, i_63_, i_62_, class45, 0, var_d,
				 canvas, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929
		      (runtimeexception,
		       ("mha.E(" + bool + ',' + i + ','
			+ (var_d != null ? "{...}" : "null") + ',' + i_61_
			+ ',' + (canvas != null ? "{...}" : "null") + ','
			+ (class45 != null ? "{...}" : "null") + ')'));
	}
    }
    
    final void method959(int i, int i_64_, byte i_65_, r var_r) {
	anInt1621++;
	r_Sub2 var_r_Sub2 = (r_Sub2) var_r;
	i_64_ += 1 + ((r_Sub2) var_r_Sub2).anInt10484;
	i += 1 + ((r_Sub2) var_r_Sub2).anInt10489;
	int i_66_ = ((Class104) this).anInt1624 * i_64_ + i;
	int i_67_ = 0;
	int i_68_ = ((r_Sub2) var_r_Sub2).anInt10487;
	int i_69_ = ((r_Sub2) var_r_Sub2).anInt10482;
	if (i_65_ < 67)
	    method957(-40);
	int i_70_ = ((Class104) this).anInt1624 - i_69_;
	if (i_64_ <= 0) {
	    int i_71_ = -i_64_ + 1;
	    i_67_ += i_69_ * i_71_;
	    i_68_ -= i_71_;
	    i_64_ = 1;
	    i_66_ += i_71_ * ((Class104) this).anInt1624;
	}
	int i_72_ = 0;
	if (i_64_ - -i_68_ >= anInt1612) {
	    int i_73_ = -anInt1612 + (1 + i_64_) - -i_68_;
	    i_68_ -= i_73_;
	}
	if ((i ^ 0xffffffff) >= -1) {
	    int i_74_ = -i + 1;
	    i_69_ -= i_74_;
	    i_66_ += i_74_;
	    i = 1;
	    i_72_ += i_74_;
	    i_67_ += i_74_;
	    i_70_ += i_74_;
	}
	if (((Class104) this).anInt1624 <= i_69_ + i) {
	    int i_75_ = -((Class104) this).anInt1624 + (1 + (i_69_ + i));
	    i_72_ += i_75_;
	    i_69_ -= i_75_;
	    i_70_ += i_75_;
	}
	if ((i_69_ ^ 0xffffffff) < -1 && i_68_ > 0) {
	    Class22.method295(i_72_, i_67_, 256,
			      ((r_Sub2) var_r_Sub2).aByteArray10486, i_69_,
			      ((Class104) this).aByteArray1617, i_68_, i_66_,
			      i_70_);
	    method952(i_68_, i_69_, i, -1, i_64_);
	}
    }
    
    static final void method960(int i) {
	Class98.aClass348_Sub16_Sub3_1564.method2877(-128);
	anInt1611++;
	Class285.aClass348_Sub16_Sub3_4743 = null;
	Class348_Sub43.anInt7068 = i;
	Class124.aClass45_1848 = null;
    }
    
    Class104(ha_Sub2 var_ha_Sub2, s_Sub2 var_s_Sub2) {
	try {
	    aHa_Sub2_1616 = var_ha_Sub2;
	    aS_Sub2_1622 = var_s_Sub2;
	    ((Class104) this).anInt1624
		= (((s) aS_Sub2_1622).anInt4592 * ((s) aS_Sub2_1622).anInt4587
		   >> ((ha_Sub2) aHa_Sub2_1616).anInt7731) + 2;
	    anInt1612
		= (((s) aS_Sub2_1622).anInt4592 * ((s) aS_Sub2_1622).anInt4590
		   >> ((ha_Sub2) aHa_Sub2_1616).anInt7731) + 2;
	    anInt1613 = (-((s) aS_Sub2_1622).anInt4588
			 + (7 + ((ha_Sub2) aHa_Sub2_1616).anInt7731));
	    ((Class104) this).aByteArray1617
		= new byte[((Class104) this).anInt1624 * anInt1612];
	    anInt1618 = ((s) aS_Sub2_1622).anInt4587 >> anInt1613;
	    anInt1625 = ((s) aS_Sub2_1622).anInt4590 >> anInt1613;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("mha.<init>("
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ','
					     + (var_s_Sub2 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
