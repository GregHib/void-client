/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

final class Class61
{
    static int anInt1104;
    static int anInt1105;
    static int anInt1106;
    static int anInt1107;
    static int anInt1108;
    private int anInt1109;
    
    final void method591(int i) {
	anInt1108++;
	OpenGL.glEndList();
	if (i != -1)
	    method595((byte) -56, 72);
    }
    
    static final int method592(boolean bool, byte i, boolean bool_0_, int i_1_,
			       int i_2_) {
	anInt1105++;
	if (i != -128)
	    return -20;
	Class348_Sub13 class348_sub13
	    = Class258_Sub4.method1974((byte) -1, i_1_, bool_0_);
	if (class348_sub13 == null)
	    return 0;
	int i_3_ = 0;
	for (int i_4_ = 0;
	     ((i_4_ ^ 0xffffffff)
	      > (((Class348_Sub13) class348_sub13).anIntArray6757.length
		 ^ 0xffffffff));
	     i_4_++) {
	    if ((((Class348_Sub13) class348_sub13).anIntArray6757[i_4_]
		 ^ 0xffffffff) <= -1
		&& ((((Class348_Sub13) class348_sub13).anIntArray6757[i_4_]
		     ^ 0xffffffff)
		    > (((Class255) Exception_Sub1.aClass255_112).anInt3271
		       ^ 0xffffffff))) {
		Class213 class213 = (Exception_Sub1.aClass255_112.method1940
				     (-127, (((Class348_Sub13) class348_sub13)
					     .anIntArray6757[i_4_])));
		int i_5_ = class213.method1567((((Class254)
						 Class101_Sub3
						     .aClass326_5764
						     .method2600(i_2_, 28364))
						.anInt3256),
					       107, i_2_);
		if (!bool)
		    i_3_ += i_5_;
		else
		    i_3_ += i_5_ * (((Class348_Sub13) class348_sub13)
				    .anIntArray6758[i_4_]);
	    }
	}
	return i_3_;
    }
    
    static final Class272 method593(int i, byte i_6_, String string) {
	anInt1104++;
	Class272 class272;
	try {
	    class272 = (Class272) Class.forName("Class272_Sub2").newInstance();
	} catch (Throwable throwable) {
	    class272 = new Class272_Sub1();
	}
	if (i_6_ != -90)
	    return null;
	((Class272) class272).aString3476 = string;
	((Class272) class272).anInt3470 = i;
	return class272;
    }
    
    final void method594(char c, int i) {
	anInt1107++;
	OpenGL.glCallList(anInt1109 - -c);
	if (i != 28666)
	    method591(30);
    }
    
    final void method595(byte i, int i_7_) {
	OpenGL.glNewList(i_7_ + anInt1109, 4864);
	anInt1106++;
	if (i <= 101)
	    method594('\ufff3', -3);
    }
    
    Class61(ha_Sub2 var_ha_Sub2, int i) {
	anInt1109 = OpenGL.glGenLists(i);
    }
}
