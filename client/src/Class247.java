/* Class247 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class247
{
    static int anInt3180;
    static Class21 aClass21_3181 = new Class21();
    static double aDouble3182;
    static Class45 aClass45_3183;
    static int anInt3184;
    
    public static void method1889(int i) {
	if (i != 255)
	    method1889(-18);
	aClass21_3181 = null;
	aClass45_3183 = null;
    }
    
    static final int method1890(int i, byte i_0_, int i_1_, int i_2_) {
	anInt3180++;
	int i_3_ = 88 % (-i_0_ / 55);
	if ((i ^ 0xffffffff) < -244)
	    i_1_ >>= 4;
	else if (i <= 217) {
	    if (i > 192)
		i_1_ >>= 2;
	    else if (i > 179)
		i_1_ >>= 1;
	} else
	    i_1_ >>= 3;
	return ((i >> -1873068927) + (i_1_ >> 2083908837 << 314376967)
		+ ((0xff & i_2_) >> 1227155490 << 683224458));
    }
    
    static final boolean method1891(int i) {
	if (i != 314376967)
	    method1890(-22, (byte) -36, 19, 113);
	anInt3184++;
	if (Class289.aBoolean3697) {
	    try {
		if (((Boolean)
		     Class224.method1617((byte) 125, Class93.anApplet1530,
					 "showingVideoAd"))
			.booleanValue())
		    return false;
		return true;
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	return true;
    }
}
