/* Class224 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

final class Class224
{
    static final void method1615(Applet applet, int i, String string)
	throws Throwable {
	JSObject.getWindow(applet).eval(string);
	if (i == -15092) {
	    /* empty */
	}
    }
    
    static final Object method1616(String string, Object[] objects,
				   Applet applet, byte i) throws Throwable {
	if (i <= 0)
	    return null;
	return JSObject.getWindow(applet).call(string, objects);
    }
    
    static final Object method1617(byte i, Applet applet, String string)
	throws Throwable {
	if (i != 125)
	    return null;
	return JSObject.getWindow(applet).call(string, null);
    }
}
