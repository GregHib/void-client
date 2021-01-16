/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76
{
    static int anInt1278;
    static Class364 aClass364_1279 = new Class364("LOCAL", 4);
    static int anInt1280;
    static int anInt1281;
    Class243 aClass243_1282 = new Class243();
    boolean aBoolean1283 = false;
    static int anInt1284;
    static int anInt1285;
    static Class169 aClass169_1286;
    static float aFloat1287 = 1024.0F;
    static int anInt1288;
    
    static final boolean method771(int i, byte i_0_, int i_1_, int i_2_,
				   int i_3_, int i_4_, int[] is, int i_5_) {
	anInt1281++;
	if ((Class306.anInt3872 ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
	    i_3_ = Class306.anInt3872;
	if ((i_4_ ^ 0xffffffff) > -1)
	    i_4_ = 0;
	if (i_0_ != -25)
	    anInt1288 = -32;
	if (i_4_ >= i_3_)
	    return true;
	i_5_ += -1 + i_4_;
	i_1_ += i * i_4_;
	i_2_ = -i_4_ + i_3_ >> 79407298;
	if ((Class350.anInt4319 ^ 0xffffffff) != -2) {
	    i_1_ -= 38400;
	    while ((--i_2_ ^ 0xffffffff) <= -1) {
		if ((i_1_ ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
		    return false;
		i_1_ += i;
		if (is[++i_5_] > i_1_)
		    return false;
		i_1_ += i;
		if (i_1_ < is[++i_5_])
		    return false;
		i_1_ += i;
		if (is[++i_5_] > i_1_)
		    return false;
		i_1_ += i;
	    }
	    i_2_ = 0x3 & i_3_ - i_4_;
	    while (--i_2_ >= 0) {
		if (i_1_ < is[++i_5_])
		    return false;
		i_1_ += i;
	    }
	} else {
	    Class225.anInt2946 += i_2_;
	    while (--i_2_ >= 0) {
		if ((i_1_ ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
		    is[i_5_] = i_1_;
		i_1_ += i;
		if ((i_1_ ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
		    is[i_5_] = i_1_;
		i_1_ += i;
		if (i_1_ < is[++i_5_])
		    is[i_5_] = i_1_;
		i_1_ += i;
		if ((i_1_ ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
		    is[i_5_] = i_1_;
		i_1_ += i;
	    }
	    i_2_ = 0x3 & i_3_ - i_4_;
	    while ((--i_2_ ^ 0xffffffff) <= -1) {
		if ((i_1_ ^ 0xffffffff) > (is[++i_5_] ^ 0xffffffff))
		    is[i_5_] = i_1_;
		i_1_ += i;
	    }
	}
	return true;
    }
    
    public static void method772(byte i) {
	aClass169_1286 = null;
	aClass364_1279 = null;
	if (i >= -110)
	    method771(-68, (byte) 45, 58, 119, 101, -92, null, 79);
    }
    
    static final void method773(boolean bool) {
	Class348_Sub40_Sub10.aBoolean9181 = bool;
	anInt1284++;
    }
    
    final void method774(Class318_Sub4 class318_sub4, int i) {
	anInt1280++;
	Class318_Sub1 class318_sub1
	    = ((Class318_Sub4) class318_sub4).aClass318_Sub1_6410;
	boolean bool = true;
	Class318_Sub3[] class318_sub3s
	    = ((Class318_Sub4) class318_sub4).aClass318_Sub3Array6414;
	for (int i_6_ = 0; class318_sub3s.length > i_6_; i_6_++) {
	    if (((Class318_Sub3) class318_sub3s[i_6_]).aBoolean6401) {
		bool = false;
		break;
	    }
	}
	if (!bool) {
	    if (((Class76) this).aBoolean1283) {
		for (Class318_Sub4 class318_sub4_7_
			 = ((Class318_Sub4)
			    ((Class76) this).aClass243_1282.method1872(8));
		     class318_sub4_7_ != null;
		     class318_sub4_7_
			 = (Class318_Sub4) ((Class76) this).aClass243_1282
					       .method1878((byte) -103)) {
		    if (class318_sub1 == (((Class318_Sub4) class318_sub4_7_)
					  .aClass318_Sub1_6410)) {
			class318_sub4_7_.method2373(false);
			Class59_Sub1_Sub1.method560(class318_sub4_7_, -41);
		    }
		}
	    }
	    for (Class318_Sub4 class318_sub4_8_
		     = ((Class318_Sub4)
			((Class76) this).aClass243_1282.method1872(8));
		 class318_sub4_8_ != null;
		 class318_sub4_8_
		     = (Class318_Sub4) ((Class76) this).aClass243_1282
					   .method1878((byte) -44)) {
		if (((Class318_Sub1) class318_sub1).anInt6389
		    >= ((Class318_Sub1) (((Class318_Sub4) class318_sub4_8_)
					 .aClass318_Sub1_6410)).anInt6389) {
		    Class245.method1883(class318_sub4_8_, class318_sub4, true);
		    return;
		}
	    }
	    if (i != 18802)
		aClass169_1286 = null;
	    ((Class76) this).aClass243_1282.method1869(-107, class318_sub4);
	}
    }
    
    final void method775(byte i) {
	for (;;) {
	    Class318_Sub4 class318_sub4
		= ((Class318_Sub4)
		   ((Class76) this).aClass243_1282.method1875(60));
	    if (class318_sub4 == null)
		break;
	    class318_sub4.method2373(false);
	    Class59_Sub1_Sub1.method560(class318_sub4, 123);
	}
	anInt1278++;
	if (i != 69)
	    anInt1288 = -20;
    }
    
    Class76(boolean bool) {
	((Class76) this).aBoolean1283 = bool;
    }
    
    static {
	aClass169_1286 = new Class169();
    }
}
