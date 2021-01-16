/* Class348_Sub42_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

import jaggl.OpenGL;

final class Class348_Sub42_Sub15 extends Class348_Sub42
{
    static int anInt9646;
    static int anInt9647;
    static int anInt9648;
    static int anInt9649;
    int anInt9650;
    int anInt9651;
    int anInt9652;
    static int anInt9653;
    String aString9654;
    static int anInt9655;
    static int anInt9656;
    static BigInteger aBigInteger9657
	= (new BigInteger
	   ("c88e80e2341a1d30e6dc4c5665a6e1c8b2e9d5b2380aa4bde34378d2c8a575bd47b17d6aaa56b365d411f60440764a0d0b44b55acdddd53b2fa17b7fbcdbe2756c0218419880392addf93f1ca3d24f8c65bf88a5a99e54bc07a0a94dc4fb95aafbdcdc886aa2f9c13202a81ae64b5bc969d4076536982adbdbe5f104b34cde5c3de403ef6950d88a952b37c218e0c2560027b40e4729076205c3486416ce4aea1cade4b660f1698ec76164ab7d611827e6d920a63c8b78d3ff6e45e9eea2d5fbb24988330204c003af4b061f24c1b415dcad503e7283311ee2045501e49b1bab75f3d5f9316dd9cfcfd8ad3d87907c910959e3b40ba664ef60929a0b4ac33033478d0f15d96983a5f8ac876047ac7e851c478807707d0480808c269f69f3fc570e2051dc8651dd9cfede9b6dc1bb182d8273e969bef49c14a74bbd7ecb743819468e01a1e08419e2654d7a51c1371d65918b97b8d9931cbaa8011027bf4927ac4b5ea533e47652f1e706af0b3a8aafc3842bc4be87e0622a829cadb62a6457bd5609ea7435a85ab2e88a4c92914291c6e47669effdff7289ac66aadfe870b1cd578e8b8bfd1c8c8ac3276c59399a83960b2bf0c46f6f529455dc32153e59e08d7f30a59b64f896a4b087329c59a7507f22b9ecdfef44467e272ad4b4ea91e1cfbebef0f197055514c1789466f6bb7a9a20fed9d65204b033b9adb16a46532505",
	    16));
    static Class105 aClass105_9658;
    static Class105 aClass105_9659;
    static Class56 aClass56_9660;
    
    final int method3245(boolean bool) {
	anInt9646++;
	if (bool != true)
	    method3248(-60);
	return (int) (((Class348) this).aLong4291 >>> -1780618848 & 0xffL);
    }
    
    final void method3246(int i) {
	((Class348_Sub42) this).aLong7057 |= ~0x7fffffffffffffffL;
	anInt9653++;
	if (method3250((byte) -89) == 0L)
	    Class367_Sub4.aClass107_7325.method1005(true, this);
	if (i != -25490)
	    aClass105_9659 = null;
    }
    
    public static void method3247(int i) {
	if (i > -49)
	    method3247(49);
	aClass56_9660 = null;
	aClass105_9658 = null;
	aClass105_9659 = null;
	aBigInteger9657 = null;
    }
    
    final int method3248(int i) {
	if (i != 1)
	    return -110;
	anInt9647++;
	return (int) ((Class348) this).aLong4291;
    }
    
    static final Class242 method3249(int i, int i_0_, ha_Sub2 var_ha_Sub2,
				     String string) {
	try {
	    anInt9656++;
	    int i_1_ = -89 / ((29 - i_0_) / 47);
	    long l = OpenGL.glCreateShaderObjectARB(i);
	    OpenGL.glShaderSourceARB(l, string);
	    OpenGL.glCompileShaderARB(l);
	    OpenGL.glGetObjectParameterivARB(l, 35713, (Class348_Sub42_Sub4
							.anIntArray9519), 0);
	    if ((Class348_Sub42_Sub4.anIntArray9519[0] ^ 0xffffffff) == -1) {
		if (Class348_Sub42_Sub4.anIntArray9519[0] == 0)
		    System.out.println("Shader compile failed:");
		OpenGL.glGetObjectParameterivARB(l, 35716,
						 (Class348_Sub42_Sub4
						  .anIntArray9519),
						 1);
		if ((Class348_Sub42_Sub4.anIntArray9519[1] ^ 0xffffffff)
		    < -2) {
		    byte[] is
			= new byte[Class348_Sub42_Sub4.anIntArray9519[1]];
		    OpenGL.glGetInfoLogARB(l,
					   (Class348_Sub42_Sub4.anIntArray9519
					    [1]),
					   Class348_Sub42_Sub4.anIntArray9519,
					   0, is, 0);
		    System.out.println(new String(is));
		}
		if ((Class348_Sub42_Sub4.anIntArray9519[0] ^ 0xffffffff)
		    == -1) {
		    OpenGL.glDeleteObjectARB(l);
		    return null;
		}
	    }
	    return new Class242(var_ha_Sub2, l, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class348_Sub17.method2929(runtimeexception,
					    ("et.G(" + i + ',' + i_0_ + ','
					     + (var_ha_Sub2 != null ? "{...}"
						: "null")
					     + ','
					     + (string != null ? "{...}"
						: "null")
					     + ')'));
	}
    }
    
    final long method3250(byte i) {
	anInt9649++;
	if (i >= -37)
	    method3250((byte) 79);
	return ((Class348_Sub42) this).aLong7057 & 0x7fffffffffffffffL;
    }
    
    Class348_Sub42_Sub15(int i, int i_2_) {
	((Class348) this).aLong4291 = (long) i << -1165915296 | (long) i_2_;
    }
    
    final void method3251(int i) {
	anInt9648++;
	((Class348_Sub42) this).aLong7057
	    = (~0x7fffffffffffffffL & ((Class348_Sub42) this).aLong7057
	       | Class62.method599(-120) + 500L);
	s_Sub2.aClass107_8241.method1005(true, this);
	if (i != -16058)
	    aClass105_9658 = null;
    }
}
