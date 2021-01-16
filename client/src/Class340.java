/* Class340 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

final class Class340
{
    private Class248 aClass248_4212;
    private BigInteger aBigInteger4213;
    static int anInt4214;
    private Class348_Sub49 aClass348_Sub49_4215;
    private Class314_Sub1[] aClass314_Sub1Array4216;
    private Class112 aClass112_4217;
    private BigInteger aBigInteger4218;
    static int anInt4219;
    private Class348_Sub42_Sub16_Sub1 aClass348_Sub42_Sub16_Sub1_4220;
    static int anInt4221;
    static int anInt4222;
    static Class351 aClass351_4223 = new Class351(4, 0);
    static int anInt4224;
    static Class351 aClass351_4225 = new Class351(43, -1);
    
    final void method2670(int i) {
	anInt4222++;
	if (aClass314_Sub1Array4216 != null) {
	    for (int i_0_ = 0; ((aClass314_Sub1Array4216.length ^ 0xffffffff)
				< (i_0_ ^ 0xffffffff)); i_0_++) {
		if (aClass314_Sub1Array4216[i_0_] != null)
		    aClass314_Sub1Array4216[i_0_].method2342(0);
	    }
	    for (int i_1_ = i; i_1_ < aClass314_Sub1Array4216.length; i_1_++) {
		if (aClass314_Sub1Array4216[i_1_] != null)
		    aClass314_Sub1Array4216[i_1_].method2343(-1);
	    }
	}
    }
    
    public static void method2671(int i) {
	aClass351_4225 = null;
	aClass351_4223 = null;
	if (i != 0)
	    method2672(92, 5);
    }
    
    static final boolean method2672(int i, int i_2_) {
	anInt4224++;
	if (i_2_ >= -89)
	    return true;
	if (i != 7 && (i ^ 0xffffffff) != -9 && (i ^ 0xffffffff) != -10)
	    return false;
	return true;
    }
    
    final Class314_Sub1 method2673(Class137 class137, int i,
				   Class137 class137_3_, int i_4_) {
	try {
	    anInt4219++;
	    if (i_4_ != 255)
		method2671(-43);
	    return method2675((byte) -123, true, i, class137, class137_3_);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("eb.D("
					     + (class137 != null ? "{...}"
						: "null")
					     + ',' + i + ','
					     + (class137_3_ != null ? "{...}"
						: "null")
					     + ',' + i_4_ + ')'));
	}
    }
    
    final boolean method2674(int i) {
	anInt4214++;
	if (aClass348_Sub49_4215 != null)
	    return true;
	if (aClass348_Sub42_Sub16_Sub1_4220 == null) {
	    if (aClass248_4212.method1900(-71))
		return false;
	    aClass348_Sub42_Sub16_Sub1_4220
		= aClass248_4212.method1906((byte) -84, (byte) 0, true, 255,
					    255);
	}
	if (((Class348_Sub42_Sub16) aClass348_Sub42_Sub16_Sub1_4220)
	    .aBoolean9664)
	    return false;
	Class348_Sub49 class348_sub49
	    = new Class348_Sub49(aClass348_Sub42_Sub16_Sub1_4220
				     .method3259(i ^ 0x17));
	((Class348_Sub49) class348_sub49).anInt7197 = 5;
	
	int idxCount = class348_sub49.method3387(i ^ 0xf8);
	System.out.println("i_5_: "+idxCount);
	
	((Class348_Sub49) class348_sub49).anInt7197 += idxCount * 72;
	byte[] is = new byte[(((Class348_Sub49) class348_sub49).aByteArray7154.length - ((Class348_Sub49) class348_sub49).anInt7197)];
	
	System.out.println("is len: "+is.length); // 512
	
	class348_sub49.method3389(2147483647, 0, is.length, is);
	if (i != 7)
	    aClass112_4217 = null;
	
	
	String ukeys = "";
	for(int t3=0; t3< is.length; t3++) {
		ukeys += is[t3]+", ";
	}
	System.out.println("ukeys: "+ukeys);
	
	byte[] is_6_;
	if (Loader.isrs && aBigInteger4213 != null && aBigInteger4218 != null) {
	    BigInteger biginteger = new BigInteger(is);
	    BigInteger biginteger_7_
		= biginteger.modPow(aBigInteger4213, aBigInteger4218);
	    is_6_ = biginteger_7_.toByteArray();
	} else {
	    is_6_ = is;
    }
	if ((is_6_.length ^ 0xffffffff) != -66)
	    throw new RuntimeException();
	byte[] is_8_
	    = Class348_Sub1_Sub2.method2730(4567, 5,
					    (((Class348_Sub49) class348_sub49)
					     .aByteArray7154),
					    (((Class348_Sub49) class348_sub49)
					     .anInt7197) - (is.length + 5));
	for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -65; i_9_++) {
	    if ((is_6_[i_9_ + 1] ^ 0xffffffff) != (is_8_[i_9_] ^ 0xffffffff))
		throw new RuntimeException();
	}
	aClass348_Sub49_4215 = class348_sub49;
	aClass314_Sub1Array4216 = new Class314_Sub1[idxCount];
	return true;
    }
    
    private final Class314_Sub1 method2675(byte i, boolean bool, int i_10_,
					   Class137 class137,
					   Class137 class137_11_) {
	try {
	    anInt4221++;
	    if (aClass348_Sub49_4215 == null)
		throw new RuntimeException();
	    if ((i_10_ ^ 0xffffffff) > -1
		|| i_10_ >= aClass314_Sub1Array4216.length)
		throw new RuntimeException();
	    if (aClass314_Sub1Array4216[i_10_] != null)
		return aClass314_Sub1Array4216[i_10_];
	    ((Class348_Sub49) aClass348_Sub49_4215).anInt7197 = 6 + i_10_ * 72;
	    int i_12_ = aClass348_Sub49_4215.method3385((byte) -126);
	    int i_13_ = aClass348_Sub49_4215.method3385((byte) -126);
	    byte[] is = new byte[64];
	    aClass348_Sub49_4215.method3389(2147483647, 0, 64, is);
	    if (i >= -18)
		method2671(103);
	    Class314_Sub1 class314_sub1
		= new Class314_Sub1(i_10_, class137, class137_11_,
				    aClass248_4212, aClass112_4217, i_12_, is,
				    i_13_, bool);
	    aClass314_Sub1Array4216[i_10_] = class314_sub1;
	    return class314_sub1;
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("eb.E(" + i + ',' + bool + ','
					     + i_10_ + ','
					     + (class137 != null ? "{...}"
						: "null")
					     + ','
					     + (class137_11_ != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    Class340(Class248 class248, Class112 class112, BigInteger biginteger,
	     BigInteger biginteger_14_) {
	do {
	    try {
		aClass112_4217 = class112;
		aBigInteger4218 = biginteger_14_;
		aBigInteger4213 = biginteger;
		aClass248_4212 = class248;
		if (aClass248_4212.method1900(-31))
		    break;
		aClass348_Sub42_Sub16_Sub1_4220
		    = aClass248_4212.method1906((byte) -80, (byte) 0, true,
						255, 255);
	    } catch (RuntimeException runtimeexception) {
		throw Class348_Sub17.method2929
			  (runtimeexception,
			   ("eb.<init>("
			    + (class248 != null ? "{...}" : "null") + ','
			    + (class112 != null ? "{...}" : "null") + ','
			    + (biginteger != null ? "{...}" : "null") + ','
			    + (biginteger_14_ != null ? "{...}" : "null")
			    + ')'));
	    }
	    break;
	} while (false);
    }
}
