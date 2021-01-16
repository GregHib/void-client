/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

final class Class33
{
    static int anInt456;
    static int anInt457;
    private Class45 aClass45_458;
    static int anInt459;
    private Class60 aClass60_460 = new Class60(128);
    static int anInt461;
    
    final Class117 method337(boolean bool, int i) {
	anInt457++;
	Class117 class117;
	synchronized (aClass60_460) {
	    class117 = (Class117) aClass60_460.method583((long) i, 111);
	}
	if (class117 != null)
	    return class117;
	byte[] is
	    = aClass45_458.method410(-1860, Class5_Sub3.method200(-107, i),
				     Class348_Sub31.method3013(i, bool));
	class117 = new Class117();
	if (is != null)
	    class117.method1069(0, new Class348_Sub49(is));
	synchronized (aClass60_460) {
	    aClass60_460.method582(class117, (long) i, (byte) -102);
	}
	return class117;
    }
    
    static final void method338(int i, int i_0_) {
	if (i == ((Class348_Sub51) Class316.aClass348_Sub51_3959)
		     .aClass239_Sub22_7253.method1815(-32350))
	    i_0_ = -1;
	anInt456++;
	if ((Class337.anInt4179 ^ 0xffffffff) != (i_0_ ^ 0xffffffff)) {
	    if (i_0_ != -1) {
		Class222 class222
		    = Class239.aClass166_3147.method1287((byte) -104, i_0_);
		Class207 class207 = class222.method1610((byte) 71);
		if (class207 == null)
		    i_0_ = -1;
		else {
		    Class348_Sub23_Sub1.aClass297_8992.method2238
			(class207.method1522(), class207.method1516(), 17,
			 new Point(((Class222) class222).anInt2883,
				   ((Class222) class222).anInt2890),
			 Class305.aCanvas3869, class207.method1510());
		    Class337.anInt4179 = i_0_;
		}
	    }
	    if (i_0_ == -1 && Class337.anInt4179 != -1) {
		Class348_Sub23_Sub1.aClass297_8992.method2238(-1, null, i + 17,
							      new Point(),
							      (Class305
							       .aCanvas3869),
							      -1);
		Class337.anInt4179 = -1;
	    }
	}
    }
    
    static final void method339(int i, int i_1_, byte[] is, int i_2_, int i_3_,
				int i_4_) {
	anInt461++;
	if ((i_1_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
	    i += i_1_;
	    i_2_ = -i_1_ + i_4_ >> 1135854850;
	    while (--i_2_ >= 0) {
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
		is[i++] = (byte) 1;
	    }
	    if (i_3_ == 1354705384) {
		i_2_ = 0x3 & i_4_ - i_1_;
		while (--i_2_ >= 0)
		    is[i++] = (byte) 1;
	    }
	}
    }
    
    static final int method340(int i, byte i_5_) {
	anInt459++;
	i = --i | i >>> 750142081;
	i |= i >>> -1369908414;
	i |= i >>> -1532713180;
	if (i_5_ != 108)
	    return 34;
	i |= i >>> 1354705384;
	i |= i >>> 255192560;
	return 1 + i;
    }
    
    Class33(Class230 class230, int i, Class45 class45) {
	do {
	    try {
		aClass45_458 = class45;
		if (aClass45_458 == null)
		    break;
		int i_6_ = -1 + aClass45_458.method414(-1);
		aClass45_458.method407(0, i_6_);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929(runtimeexception,
						("iba.<init>("
						 + (class230 != null ? "{...}"
						    : "null")
						 + ',' + i + ','
						 + (class45 != null ? "{...}"
						    : "null")
						 + ')'));
	    }
	    break;
	} while (false);
    }
}
