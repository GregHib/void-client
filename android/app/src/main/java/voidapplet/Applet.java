package voidapplet;

import voidawt.Panel;

import java.net.URL;

public class Applet extends Panel {
    public void init() {
    }

    public void start() {
    }

    public void stop() {
    }

    public void destroy() {
    }

    public String getParameter(String name) {
        return null;
    }

    public URL getCodeBase() {
        return null;
    }

    public URL getDocumentBase() {
        return null;
    }

    public AppletContext getAppletContext() {
        return new AppletContext();
    }
}
