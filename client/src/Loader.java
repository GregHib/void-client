import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.math.BigInteger;
import java.net.URL;
import java.util.Properties;

public class Loader extends Applet {

    public static Properties aProperties1 = new Properties();
    public JFrame aJFrame2;
    public JPanel aJPanel3 = new JPanel();
    public static boolean loadRunescape = false;
    public static boolean showCoordinates = true;
    public static boolean skipLobby = true;
    public static boolean debug = true;
    public static boolean trace = false;
    public static final BigInteger LOGIN_SERVER_RSA_MODULUS = new BigInteger("ea3680fdebf2621da7a33601ba39925ee203b3fc80775cd3727bf27fd8c0791c803e0bdb42b8b5257567177f8569024569da9147cef59009ed016af6007e57a556f1754f09ca84dd39a03287f7e41e8626fd78ab3b53262bd63f2e37403a549980bf3077bd402b82ef5fac269eb3c04d2a9b7712a67a018321ceba6c3bfb8f7f", 16);
    public static final BigInteger FILE_SERVER_RSA_MODULUS = new BigInteger("d6808be939bbfd2ec4e96b1581ce3e1144b526e7643a72e3c64fbb902724fbfcf14ab601da6d6f8dbb57d1c369d080d9fc392abeb7886e0076d07f2aea5810e540d2817fd1967e35b39cc95cf7c9170b5fb55f5bf95524b60e938f0d64614bc365b87d66963a8cc8664e32875366099ef297180d01c7c3842162865e11d92299", 16);

    public static void main(String[] arg0) {
        Loader l = new Loader();
        l.doFrame();
    }

    @Override
    public void init() {
        doApplet();
    }

    void doApplet() {
        setParms();
        startClient();
    }

    public void doFrame() {
        setParms();
        openFrame();
        startClient();
    }

    void setParms() {
        aProperties1.put("cabbase", "g.cab");
        aProperties1.put("java_arguments", "-Xmx102m -Dsun.java2d.noddraw=true");
        aProperties1.put("colourid", "0");
        aProperties1.put("worldid", "16");
        aProperties1.put("lobbyid", "15");
        aProperties1.put("lobbyaddress", loadRunescape ? "lobby16.runescape.com" : "127.0.0.1");
        aProperties1.put("demoid", "0");
        aProperties1.put("demoaddress", "");
        aProperties1.put("modewhere", "1");
        aProperties1.put("modewhat", "0");
        aProperties1.put("lang", "0");
        aProperties1.put("objecttag", "0");
        aProperties1.put("js", "1");
        aProperties1.put("game", "0");
        aProperties1.put("affid", "0");
        aProperties1.put("advert", "1");
        aProperties1.put("settings", "wwGlrZHF5gJcZl7tf7KSRh0MZLhiU0gI0xDX6DwZ-Qk");
        aProperties1.put("country", "0");
        aProperties1.put("haveie6", "0");
        aProperties1.put("havefirefox", "1");
        aProperties1.put("cookieprefix", "");
        aProperties1.put("cookiehost", "127.0.0.1");
        aProperties1.put("cachesubdirid", "0");
        aProperties1.put("crashurl", "");
        aProperties1.put("unsignedurl", "");
        aProperties1.put("sitesettings_member", "1");
        aProperties1.put("frombilling", "false");
        aProperties1.put("sskey", "");
        aProperties1.put("force64mb", "false");
        aProperties1.put("worldflags", "8");
    }

    void openFrame() {
        aJFrame2 = new JFrame("Client");
        aJFrame2.setLayout(new BorderLayout());
        aJPanel3.setLayout(new BorderLayout());
        aJPanel3.add(this);
        aJPanel3.setPreferredSize(new Dimension(765, 503));
        aJFrame2.getContentPane().add(aJPanel3, "Center");
        aJFrame2.pack();
        aJFrame2.setVisible(true);
        aJFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void startClient() {
        try {
            Applet_Sub1.provideLoaderApplet(this);
            client var_client = new client();
            var_client.init();
            var_client.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getParameter(String arg0) {
        return (String) aProperties1.get(arg0);
    }

    @Override
    public URL getDocumentBase() {
        return getCodeBase();
    }

    @Override
    public URL getCodeBase() {
        URL url;
        try {
            if (loadRunescape) url = new URL("http://world16.runescape.com");
            else url = new URL("http://127.0.0.1");
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        return url;
    }

    public static String getDebug(int id, int x, int y, int plane) {
        return debug ? " <col=00ff00>(</col>" + id + " - " + x + ", " + y + ", " + plane + "<col=00ff00>)</col>" : "";
    }
}