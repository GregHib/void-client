/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class277
{
    int anInt3558 = 64;
    int anInt3559;
    boolean aBoolean3560;
    boolean aBoolean3561 = true;
    Class268 aClass268_3562;
    int anInt3563;
    int anInt3564 = 8;
    static int anInt3565;
    boolean aBoolean3566;
    static int anInt3567;
    static Class137 aClass137_3568;
    int anInt3569;
    int anInt3570;
    static int anInt3571;
    static Class21 aClass21_3572 = new Class21();
    int anInt3573;
    int anInt3574;
    int anInt3575;
    
    final void method2067(int i) {
	((Class277) this).anInt3564
	    = (((Class277) this).anInt3564 << -267776152
	       | ((Class277) this).anInt3573);
	if (i != -4860)
	    method2067(-102);
	anInt3571++;
    }
    
    static long method2068(long l, long l_0_) {
	try {
	    return l | l_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    "vd.D(" + l + ',' + l_0_ + ')');
	}
    }
    
    private final void method2069(int i, Class348_Sub49 class348_sub49,
				  int i_1_) {
	anInt3567++;
	if (i == -1) {
	    if (i_1_ != 1) {
		if ((i_1_ ^ 0xffffffff) == -3)
		    ((Class277) this).anInt3575
			= class348_sub49.method3387(255);
		else if ((i_1_ ^ 0xffffffff) != -4) {
		    if ((i_1_ ^ 0xffffffff) != -6) {
			if (i_1_ != 7) {
			    if (i_1_ == 8)
				((Class268) ((Class277) this).aClass268_3562)
				    .anInt3447
				    = ((Class277) this).anInt3573;
			    else if ((i_1_ ^ 0xffffffff) == -10)
				((Class277) this).anInt3570
				    = (class348_sub49.method3330(842397944)
				       << -345189086);
			    else if (i_1_ == 10)
				((Class277) this).aBoolean3566 = false;
			    else if ((i_1_ ^ 0xffffffff) == -12)
				((Class277) this).anInt3564
				    = class348_sub49.method3387(255);
			    else if (i_1_ != 12) {
				if (i_1_ != 13) {
				    if ((i_1_ ^ 0xffffffff) != -15) {
					if (i_1_ == 16)
					    ((Class277) this).anInt3574
						= class348_sub49
						      .method3387(255);
				    } else
					((Class277) this).anInt3558
					    = (class348_sub49.method3387(255)
					       << 991859202);
				} else
				    ((Class277) this).anInt3559
					= class348_sub49.method3351(-1);
			    } else
				((Class277) this).aBoolean3560 = true;
			} else
			    ((Class277) this).anInt3569
				= (Class348_Sub40_Sub34.method3140
				   (-67, class348_sub49.method3351(-1)));
		    } else
			((Class277) this).aBoolean3561 = false;
		} else {
		    ((Class277) this).anInt3575
			= class348_sub49.method3330(842397944);
		    if ((((Class277) this).anInt3575 ^ 0xffffffff) == -65536)
			((Class277) this).anInt3575 = -1;
		}
	    } else
		((Class277) this).anInt3563
		    = Class348_Sub40_Sub34
			  .method3140(-57, class348_sub49.method3351(-1));
	}
    }
    
    final void method2070(boolean bool, Class348_Sub49 class348_sub49) {
	if (bool != true)
	    ((Class277) this).aBoolean3561 = false;
	for (;;) {
	    int i = class348_sub49.method3387(255);
	    if ((i ^ 0xffffffff) == -1)
		break;
	    method2069(-1, class348_sub49, i);
	}
	anInt3565++;
    }
    
    public static void method2071(int i) {
	aClass21_3572 = null;
	aClass137_3568 = null;
	if (i > -126)
	    aClass21_3572 = null;
    }
    
    public Class277() {
	((Class277) this).anInt3563 = 0;
	((Class277) this).aBoolean3566 = true;
	((Class277) this).aBoolean3560 = false;
	((Class277) this).anInt3569 = -1;
	((Class277) this).anInt3570 = 512;
	((Class277) this).anInt3559 = 1190717;
	((Class277) this).anInt3575 = -1;
	((Class277) this).anInt3574 = 127;
    }
}
