/* Class249 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class249
{
    static int anInt3216;
    static Class21 aClass21_3217 = new Class21();
    
    public static void method1907(byte i) {
	aClass21_3217 = null;
	int i_0_ = -55 / ((i - -39) / 60);
    }
    
    static final int method1908(int i, int i_1_, int i_2_, boolean bool,
				int i_3_, int i_4_, int i_5_) {
	i_2_ &= 0x3;
	anInt3216++;
	if (bool != true)
	    aClass21_3217 = null;
	if ((i_5_ & 0x1 ^ 0xffffffff) == -2) {
	    int i_6_ = i_4_;
	    i_4_ = i_3_;
	    i_3_ = i_6_;
	}
	if ((i_2_ ^ 0xffffffff) == -1)
	    return i_1_;
	if (i_2_ == 1)
	    return i;
	if ((i_2_ ^ 0xffffffff) == -3)
	    return 7 + -i_1_ + (-i_4_ + 1);
	return -i_3_ - (-1 - (7 - i));
    }
}
