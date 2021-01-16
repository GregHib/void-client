/* Class332 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Rectangle;

final class Class332
{
    static int anInt4138;
    static Class60 aClass60_4139;
    static int anInt4140;
    static int anInt4141 = -1;
    static s[] aSArray4142;
    static int anInt4143;
    
    public static void method2640(boolean bool) {
	aClass60_4139 = null;
	aSArray4142 = null;
	if (bool != true)
	    anInt4143 = 110;
    }
    
    static final void method2641(int i, int i_0_, int i_1_, int i_2_,
				 int i_3_) {
	anInt4140++;
	if (i_1_ >= -6)
	    aClass60_4139 = null;
	if (i < i_0_) {
	    for (int i_4_ = i; i_0_ > i_4_; i_4_++)
		Class17.anIntArrayArray255[i_4_][i_2_] = i_3_;
	} else {
	    for (int i_5_ = i_0_; i > i_5_; i_5_++)
		Class17.anIntArrayArray255[i_5_][i_2_] = i_3_;
	}
    }
    
    static final void method2642(int i, int i_6_, boolean bool, int i_7_,
				 int i_8_) {
	anInt4138++;
	for (int i_9_ = 0;
	     (i_9_ ^ 0xffffffff) > (Class348_Sub38.anInt7008 ^ 0xffffffff);
	     i_9_++) {
	    Rectangle rectangle = Class180.aRectangleArray2371[i_9_];
	    if ((i_7_ ^ 0xffffffff) > (rectangle.width + rectangle.x
				       ^ 0xffffffff)
		&& (i + i_7_ ^ 0xffffffff) < (rectangle.x ^ 0xffffffff)
		&& (i_6_ ^ 0xffffffff) > (rectangle.height + rectangle.y
					  ^ 0xffffffff)
		&& (i_8_ + i_6_ ^ 0xffffffff) < (rectangle.y ^ 0xffffffff))
		Class268.aBooleanArray3438[i_9_] = true;
	}
	Class338.method2663(-5590, i_7_, i_7_ + i, i_6_, i_6_ - -i_8_);
	if (bool != true)
	    method2642(-120, -24, false, -125, -16);
    }
    
    static {
	aClass60_4139 = new Class60(20);
	anInt4143 = -1;
    }
}
