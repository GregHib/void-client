/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class35
{
    static int anInt483;
    static int anInt484;
    static int anInt485;
    
    static final void method352(int i) {
	anInt483++;
	Class162.method1265(i + 15);
	IOException_Sub1.method131((((Class348_Sub51)
				     Class316.aClass348_Sub51_3959)
					.aClass239_Sub5_7240.method1739(-32350)
				    ^ 0xffffffff) == -2,
				   2, true, 22050);
	Class348_Sub40.aClass279_7042
	    = Class193.method1439(22050, Class348_Sub23_Sub1.aClass297_8992,
				  Class305.aCanvas3869, 0, 7);
	Class348_Sub42_Sub18.method3273(true, i + -82,
					Class172.method1326(null, 9));
	Class194.aClass279_2596
	    = Class193.method1439(2048, Class348_Sub23_Sub1.aClass297_8992,
				  Class305.aCanvas3869, i, 7);
	Class194.aClass279_2596
	    .method2088(false, Class348_Sub43.aClass348_Sub16_Sub4_7065);
    }
    
    static final int method353(int i, int i_0_, int i_1_) {
	anInt485++;
	if (i_1_ == -2)
	    return 12345678;
	if (i_0_ > -25)
	    return 58;
	if (i_1_ == -1) {
	    if ((i ^ 0xffffffff) <= -3) {
		if (i > 126)
		    i = 126;
	    } else
		i = 2;
	    return i;
	}
	i = (0x7f & i_1_) * i >> 1768082311;
	if ((i ^ 0xffffffff) > -3)
	    i = 2;
	else if ((i ^ 0xffffffff) < -127)
	    i = 126;
	return i + (0xff80 & i_1_);
    }
}
