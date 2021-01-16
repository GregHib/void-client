/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class159
{
    static int anInt2124;
    int anInt2125 = 0;
    static int anInt2126;
    static int anInt2127 = 500;
    static int anInt2128;
    
    private final void method1251(Class348_Sub49 class348_sub49, int i,
				  int i_0_) {
	if (i == 5)
	    ((Class159) this).anInt2125 = class348_sub49.method3330(842397944);
	anInt2126++;
	int i_1_ = 60 % ((i_0_ - 33) / 57);
    }
    
    static final void method1252(int i, int i_2_, int i_3_, int i_4_, int i_5_,
				 int i_6_, int i_7_, byte i_8_, int i_9_) {
	anInt2124++;
	if (!Class320.method2547(i_2_, (byte) 84)) {
	    if (i_4_ == -1) {
		for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > -101; i_10_++)
		    Class152.aBooleanArray2076[i_10_] = true;
	    } else
		Class152.aBooleanArray2076[i_4_] = true;
	} else {
	    int i_11_ = 0;
	    int i_12_ = 0;
	    int i_13_ = 0;
	    int i_14_ = 0;
	    int i_15_ = 0;
	    if (Class59_Sub1.aBoolean5300) {
		i_11_ = Class314.anInt3941;
		i_15_ = Class348_Sub42_Sub16_Sub2.anInt10463;
		i_13_ = Class314.anInt3939;
		i_12_ = Class239.anInt3142;
		i_14_ = Class348_Sub3.anInt6585;
		Class348_Sub42_Sub16_Sub2.anInt10463 = 1;
	    }
	    if (Class369_Sub2.aClass46ArrayArray8584[i_2_] == null)
		Class348_Sub40_Sub7.method3064(i_9_, i, i_4_ < 0, i_5_, i_3_,
					       i_4_, i_6_, false,
					       (Class348_Sub40_Sub33
						.aClass46ArrayArray9427[i_2_]),
					       -1, i_7_);
	    else
		Class348_Sub40_Sub7.method3064(i_9_, i,
					       (i_4_ ^ 0xffffffff) > -1, i_5_,
					       i_3_, i_4_, i_6_, false,
					       (Class369_Sub2
						.aClass46ArrayArray8584[i_2_]),
					       -1, i_7_);
	    if (i_8_ <= 58)
		anInt2127 = -84;
	    if (Class59_Sub1.aBoolean5300) {
		if ((i_4_ ^ 0xffffffff) <= -1
		    && Class348_Sub42_Sub16_Sub2.anInt10463 == 2)
		    Class338.method2663(-5590, Class314.anInt3941,
					Class314.anInt3939, Class239.anInt3142,
					Class348_Sub3.anInt6585);
		Class348_Sub42_Sub16_Sub2.anInt10463 = i_15_;
		Class314.anInt3939 = i_13_;
		Class239.anInt3142 = i_12_;
		Class348_Sub3.anInt6585 = i_14_;
		Class314.anInt3941 = i_11_;
	    }
	}
    }
    
    final void method1253(Class348_Sub49 class348_sub49, boolean bool) {
	for (;;) {
	    int i = class348_sub49.method3387(255);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method1251(class348_sub49, i, -105);
	}
	anInt2128++;
	if (bool != true)
	    ((Class159) this).anInt2125 = 58;
    }
    
    public Class159() {
	/* empty */
    }
}
