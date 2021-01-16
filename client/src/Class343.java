/* Class343 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class343
{
    private int anInt4255;
    private int anInt4256;
    private int anInt4257 = Class348_Sub10.method2789(16);
    private int anInt4258 = Class348_Sub10.method2789(24);
    private int anInt4259 = Class348_Sub10.method2789(24);
    private int[] anIntArray4260;
    private int anInt4261;
    
    final void method2688(float[] fs, int i, boolean bool) {
	for (int i_0_ = 0; i_0_ < i; i_0_++)
	    fs[i_0_] = 0.0F;
	if (!bool) {
	    int i_1_
		= (((Class370) Class348_Sub10.aClass370Array6718[anInt4261])
		   .anInt4514);
	    int i_2_ = anInt4259 - anInt4258;
	    int i_3_ = i_2_ / anInt4256;
	    int[] is = new int[i_3_];
	    for (int i_4_ = 0; i_4_ < 8; i_4_++) {
		int i_5_ = 0;
		while (i_5_ < i_3_) {
		    if (i_4_ == 0) {
			int i_6_ = Class348_Sub10.aClass370Array6718
				       [anInt4261].method3581();
			for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
			    if (i_5_ + i_7_ < i_3_)
				is[i_5_ + i_7_] = i_6_ % anInt4255;
			    i_6_ /= anInt4255;
			}
		    }
		    for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
			int i_9_ = is[i_5_];
			int i_10_ = anIntArray4260[i_9_ * 8 + i_4_];
			if (i_10_ >= 0) {
			    int i_11_ = anInt4258 + i_5_ * anInt4256;
			    Class370 class370
				= Class348_Sub10.aClass370Array6718[i_10_];
			    if (anInt4257 == 0) {
				int i_12_
				    = (anInt4256
				       / ((Class370) class370).anInt4514);
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				    float[] fs_14_ = class370.method3582();
				    for (int i_15_ = 0;
					 (i_15_
					  < ((Class370) class370).anInt4514);
					 i_15_++)
					fs[i_11_ + i_13_ + i_15_ * i_12_]
					    += fs_14_[i_15_];
				}
			    } else {
				int i_16_ = 0;
				while (i_16_ < anInt4256) {
				    float[] fs_17_ = class370.method3582();
				    for (int i_18_ = 0;
					 (i_18_
					  < ((Class370) class370).anInt4514);
					 i_18_++) {
					fs[i_11_ + i_16_] += fs_17_[i_18_];
					i_16_++;
				    }
				}
			    }
			}
			if (++i_5_ >= i_3_)
			    break;
		    }
		}
	    }
	}
    }
    
    Class343() {
	anInt4256 = Class348_Sub10.method2789(24) + 1;
	anInt4255 = Class348_Sub10.method2789(6) + 1;
	anInt4261 = Class348_Sub10.method2789(8);
	int[] is = new int[anInt4255];
	for (int i = 0; i < anInt4255; i++) {
	    int i_19_ = 0;
	    int i_20_ = Class348_Sub10.method2789(3);
	    boolean bool = Class348_Sub10.method2788() != 0;
	    if (bool)
		i_19_ = Class348_Sub10.method2789(5);
	    is[i] = i_19_ << 3 | i_20_;
	}
	anIntArray4260 = new int[anInt4255 * 8];
	for (int i = 0; i < anInt4255 * 8; i++)
	    anIntArray4260[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0
				 ? Class348_Sub10.method2789(8) : -1);
    }
}
