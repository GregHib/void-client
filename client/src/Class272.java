/* Class272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

abstract class Class272
{
    int anInt3470;
    static int anInt3471;
    static int anInt3472;
    static int anInt3473;
    static int anInt3474;
    static int[] anIntArray3475 = { 1, 4, 1, 2 };
    String aString3476;
    
    final Socket method2047(byte i) throws IOException {
	anInt3472++;
	if (i <= 84)
	    anIntArray3475 = null;
	return new Socket(((Class272) this).aString3476,
			  ((Class272) this).anInt3470);
    }
    
    public static void method2048(int i) {
	anIntArray3475 = null;
	if (i != 1)
	    anInt3473 = -69;
    }
    
    static final void method2049(int i) {
	anInt3474++;
	if (i > 49) {
	    if (Class240.anInt4674 == 7)
		Class348_Sub40_Sub34.method3141(false, (byte) 11);
	    else {
		Class213.aClass238_2773 = Class348_Sub40_Sub8.aClass238_9165;
		Class348_Sub40_Sub8.aClass238_9165 = null;
		Class348_Sub49.method3379(2, 13);
	    }
	}
    }
    
    public Class272() {
	/* empty */
    }
    
    abstract Socket method2050(int i) throws IOException;
    
    static final void method2051(int i, int i_0_, Class221 class221,
				 Class341 class341, int i_1_, int i_2_,
				 int i_3_, byte i_4_, int i_5_, int i_6_,
				 int i_7_, int i_8_) {
	try {
	    Class95.aClass221_1542 = class221;
	    Class239_Sub3.anInt5871 = i_7_;
	    Class239_Sub27.aClass341_6128 = class341;
	    Class86.anInt1479 = i;
	    Class348_Sub7.aClass207_6643 = null;
	    Class295.anInt3762 = i_8_;
	    Class348_Sub40_Sub1.aClass207_9090 = null;
	    Class289.anInt3704 = i_3_;
	    Class20.anInt317 = i_5_;
	    anInt3471++;
	    Class269.anInt3451 = i_0_;
	    OutputStream_Sub1.anInt98 = i_2_;
	    Class290.anInt3712 = i_6_;
	    Class112.aClass207_1727 = null;
	    Class348_Sub32.anInt6938 = i_1_;
	    Class359.method3490(true);
	    int i_9_ = -77 % ((i_4_ - 29) / 34);
	    Class295.aBoolean3763 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("uu.E(" + i + ',' + i_0_ + ','
					     + (class221 != null ? "{...}"
						: "null")
					     + ','
					     + (class341 != null ? "{...}"
						: "null")
					     + ',' + i_1_ + ',' + i_2_ + ','
					     + i_3_ + ',' + i_4_ + ',' + i_5_
					     + ',' + i_6_ + ',' + i_7_ + ','
					     + i_8_ + ')'));
	}
    }
}
