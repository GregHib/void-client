/* Class303 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class303
{
    static Class114 aClass114_3842;
    static int anInt3843;
    static int anInt3844 = 1;
    static int anInt3845;
    static int anInt3846;
    
    static final void method2285(boolean bool, byte i, int i_0_) {
	if (i > -61)
	    aClass114_3842 = null;
	anInt3843++;
	if (!bool)
	    Class66.method701(Class141.aClass273_1966, i_0_, -1);
	else {
	    Class348_Sub47 class348_sub47
		= Class286_Sub3.method2148(Class241.aClass351_3150,
					   Class348_Sub23_Sub2.aClass77_9029,
					   -126);
	    ((Class348_Sub47) class348_sub47).aClass348_Sub49_Sub2_7116
		.method3337((byte) 107, i_0_);
	    Class348_Sub42_Sub14.method3243(42, class348_sub47);
	}
    }
    
    public static void method2286(int i) {
	aClass114_3842 = null;
	if (i != 114)
	    anInt3844 = 87;
    }
    
    static final Class125 method2287(Class348_Sub49 class348_sub49, byte i) {
	anInt3846++;
	int i_1_ = class348_sub49.method3387(255);
	Class221 class221
	    = Class158.method1248(87)[class348_sub49.method3387(255)];
	Class341 class341
	    = Class62.method596(20000)[class348_sub49.method3387(255)];
	int i_2_ = class348_sub49.method3372(13638);
	int i_3_ = class348_sub49.method3372(13638);
	int i_4_ = class348_sub49.method3330(842397944);
	int i_5_ = class348_sub49.method3330(842397944);
	int i_6_ = class348_sub49.method3385((byte) -126);
	int i_7_ = class348_sub49.method3385((byte) -126);
	int i_8_ = class348_sub49.method3385((byte) -126);
	int i_9_ = -54 / ((i - -45) / 61);
	boolean bool = class348_sub49.method3387(255) == 1;
	return new Class125(i_1_, class221, class341, i_2_, i_3_, i_4_, i_5_,
			    i_6_, i_7_, i_8_, bool);
    }
    
    static final void method2288(boolean bool, ha var_ha) {
	anInt3845++;
	if (!Class71.aBoolean1211)
	    Class231.method1642((byte) 108, var_ha);
	else
	    Class135_Sub1.method1153(var_ha, 16);
	if (bool != false)
	    anInt3844 = -97;
    }
    
    static {
	aClass114_3842 = new Class114(114, 4);
    }
}
