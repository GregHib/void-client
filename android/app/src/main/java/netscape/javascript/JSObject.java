package netscape.javascript;

import voidapplet.Applet;

public class JSObject {
    public static JSObject getWindow(Applet applet) {
        return new JSObject();
    }

    public Object eval(String s) {
        return null;
    }

    public Object call(String name, Object[] args) {
        return null;
    }
}
