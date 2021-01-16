/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

final class Class156
{
    static float aFloat2111;
    static int anInt2112;
    static String[] aStringArray2113 = new String[100];
    static int anInt2114;
    private Class348_Sub42 aClass348_Sub42_2115;
    static int anInt2116;
    static int[] anIntArray2117 = new int[2];
    private Class107 aClass107_2118;
    static int anInt2119;
    static int anInt2120;
    
    static final boolean method1238(int i, int i_0_, int i_1_) {
	anInt2116++;
	if (i_1_ > -4)
	    aFloat2111 = -0.9273654F;
	if ((0x800 & i) == 0)
	    return false;
	return true;
    }
    
    public static void method1239(int i) {
	aStringArray2113 = null;
	anIntArray2117 = null;
	if (i != 30114)
	    anIntArray2117 = null;
    }
    
    final Class348_Sub42 method1240(int i) {
	anInt2114++;
	if (i <= 7)
	    method1240(79);
	Class348_Sub42 class348_sub42
	    = (((Class348_Sub42)
		((Class107) aClass107_2118).aClass348_Sub42_1647)
	       .aClass348_Sub42_7063);
	if (class348_sub42
	    == ((Class107) aClass107_2118).aClass348_Sub42_1647) {
	    aClass348_Sub42_2115 = null;
	    return null;
	}
	aClass348_Sub42_2115
	    = ((Class348_Sub42) class348_sub42).aClass348_Sub42_7063;
	return class348_sub42;
    }
    
    static final boolean method1241(int i, int i_2_, int i_3_) {
	if (i_3_ > -111)
	    method1239(-81);
	anInt2119++;
	return ((i_2_ & 0x18 ^ 0xffffffff) != -1
		| (0x220 & i_2_ ^ 0xffffffff) == -545);
    }
    
    public Class156() {
	/* empty */
    }
    
    static final void method1242(String string, Throwable throwable, int i) {
	anInt2112++;
	do {
	    try {
		String string_4_ = "";
		if (throwable != null)
		    string_4_
			= Class348_Sub5_Sub1.method2766(false, throwable);
		if (string != null) {
		    if (throwable != null)
			string_4_ += " | ";
		    string_4_ += (String) string;
		}
		Class88.method847(string_4_, -5192);
		string_4_ = Class341.method2680("%3a", true, ":", string_4_);
		string_4_ = Class341.method2680("%40", true, "@", string_4_);
		string_4_ = Class341.method2680("%26", true, "&", string_4_);
		string_4_ = Class341.method2680("%23", true, "#", string_4_);
		if (Class348_Sub8.anApplet6662 != null) {
		    if (i != 15004)
			method1238(-69, 63, 124);
		    Class144 class144
			= (Class231.aClass297_2993.method2237
			   (new URL(Class348_Sub8.anApplet6662.getCodeBase(),
				    ("clienterror.ws?c="
				     + Class348_Sub1_Sub3.anInt8818 + "&u="
				     + (s_Sub2.aString8265 != null
					? s_Sub2.aString8265
					: String.valueOf(Class89.aLong1507))
				     + "&v1=" + Class297.aString3782 + "&v2="
				     + Class297.aString3796 + "&e="
				     + string_4_)),
			    8362));
		    while ((class144.anInt1997 ^ 0xffffffff) == -1)
			Class286_Sub5.method2161((byte) -123, 1L);
		    if ((class144.anInt1997 ^ 0xffffffff) != -2)
			break;
		    DataInputStream datainputstream
			= (DataInputStream) class144.anObject1998;
		    datainputstream.read();
		    datainputstream.close();
		}
	    } catch (Exception exception) {
		break;
	    }
	    break;
	} while (false);
    }
    
    final Class348_Sub42 method1243(byte i) {
	anInt2120++;
	if (i < 44)
	    aStringArray2113 = null;
	Class348_Sub42 class348_sub42 = aClass348_Sub42_2115;
	if (class348_sub42
	    == ((Class107) aClass107_2118).aClass348_Sub42_1647) {
	    aClass348_Sub42_2115 = null;
	    return null;
	}
	aClass348_Sub42_2115
	    = ((Class348_Sub42) class348_sub42).aClass348_Sub42_7063;
	return class348_sub42;
    }
    
    Class156(Class107 class107) {
	aClass107_2118 = class107;
    }
}
