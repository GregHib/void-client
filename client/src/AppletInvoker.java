/* AppletInvoker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class224` (JODE-obfuscated).
 * Reflection helper that invokes methods on the client Applet. invokeApplet/1616/1617 take an Applet and call into it via reflection (used for applet-host integration).
 */

import netscape.javascript.JSObject;

import java.applet.Applet;

final class AppletInvoker {
    static final void invokeApplet(Applet applet, int i, String string) throws Throwable {
        JSObject.getWindow(applet).eval(string);
        if (i == -15092) {
            /* empty */
        }
    }

    static final Object callApplet(String string, Object[] objects, Applet applet, byte i) throws Throwable {
        if (i <= 0) return null;
        return JSObject.getWindow(applet).call(string, objects);
    }

    static final Object callAppletNoArgs(byte i, Applet applet, String string) throws Throwable {
        if (i != 125) return null;
        return JSObject.getWindow(applet).call(string, null);
    }
}
