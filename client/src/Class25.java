/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class25
{
    private Class60 aClass60_360 = new Class60(16);
    static int anInt361;
    static int anInt362;
    static int anInt363;
    static Class351 aClass351_364 = new Class351(12, 3);
    static int anInt365;
    private Class45 aClass45_366;
    static Class105[] aClass105Array367;
    static boolean aBoolean368 = false;
    static int[] anIntArray369;
    static int anInt370;
    static int anInt371;
    static int anInt372;
    
    final void method299(int i, int i_0_) {
	if (i_0_ != 16)
	    aClass45_366 = null;
	synchronized (aClass60_360) {
	    aClass60_360.method578(2, i);
	}
	anInt365++;
    }
    
    final void method300(byte i) {
	anInt371++;
	int i_1_ = 111 % ((i - -40) / 57);
	synchronized (aClass60_360) {
	    aClass60_360.method590(0);
	}
    }
    
    final Class38 method301(int i, int i_2_) {
	anInt361++;
	Class38 class38;
	synchronized (aClass60_360) {
	    class38 = (Class38) aClass60_360.method583((long) i, -91);
	}
	if (class38 != null)
	    return class38;
	byte[] is;
	synchronized (aClass45_366) {
	    is = aClass45_366.method410(-1860, 30, i);
	}
	if (i_2_ < 6)
	    aClass60_360 = null;
	class38 = new Class38();
	if (is != null)
	    class38.method364(new Class348_Sub49(is), (byte) 54);
	synchronized (aClass60_360) {
	    aClass60_360.method582(class38, (long) i, (byte) -109);
	}
	return class38;
    }
    
    final void method302(int i) {
	synchronized (aClass60_360) {
	    if (i != -797644856)
		aClass105Array367 = null;
	    aClass60_360.method587(i ^ 0x2f8b186f);
	}
	anInt372++;
    }
    
    static final short method303(int i, int i_3_) {
	anInt362++;
	int i_4_ = (i & 0xfe66) >> 638413482;
	int i_5_ = i >> -238279229 & 0x70;
	int i_6_ = i & 0x7f;
	i_5_ = ((i_6_ ^ 0xffffffff) >= -65 ? i_6_ * i_5_ >> -672414521
		: i_5_ * (127 + -i_6_) >> 1241897511);
	int i_7_ = i_5_ + i_6_;
	int i_8_;
	if (i_7_ != 0)
	    i_8_ = (i_5_ << -797644856) / i_7_;
	else
	    i_8_ = i_5_ << 79117537;
	int i_9_ = i_7_;
	if (i_3_ != 30)
	    return (short) 79;
	return (short) (i_9_ | (i_8_ >> 952428356 << 437853543
				| i_4_ << -166867030));
    }
    
    static final void method304(int i, int i_10_, int i_11_) {
	anInt363++;
	if (i_10_ != 437853543)
	    aBoolean368 = true;
	Class348_Sub42_Sub15 class348_sub42_sub15
	    = Class318_Sub9_Sub1.method2516(i_11_, (byte) 105, 16);
	class348_sub42_sub15.method3246(-25490);
	((Class348_Sub42_Sub15) class348_sub42_sub15).anInt9652 = i;
    }
    
    public static void method305(byte i) {
	anIntArray369 = null;
	if (i != 79)
	    method303(-22, -13);
	aClass351_364 = null;
	aClass105Array367 = null;
    }
    
    Class25(Class230 class230, int i, Class45 class45) {
	try {
	    aClass45_366 = class45;
	    aClass45_366.method407(0, 30);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("hq.<init>("
					     + (class230 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (class45 != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
}
