/* Class348_Sub42_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

final class Class348_Sub42_Sub9_Sub2 extends Class348_Sub42_Sub9
{
    private SoftReference aSoftReference10446;
    
    final Object method3205(int i) {
	if (i != 65536)
	    aSoftReference10446 = null;
	return aSoftReference10446.get();
    }
    
    final boolean method3206(byte i) {
	int i_0_ = -88 % ((-63 - i) / 61);
	return true;
    }
    
    Class348_Sub42_Sub9_Sub2(Interface14 interface14, Object object, int i) {
	super(interface14, i);
	aSoftReference10446 = new SoftReference(object);
    }
}
