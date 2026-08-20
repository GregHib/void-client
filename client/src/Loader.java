import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

public class Loader extends Applet {

    public static Properties aProperties1 = new Properties();
    public JFrame aJFrame2;
    public JPanel aJPanel3 = new JPanel();
    public static boolean loadRunescape = false;
    public static boolean showCoordinates = true;
    public static boolean skipLobby = true;
    public static boolean splitPorts = false;
    public static boolean debug = false;
    public static boolean trace = false;
    public static String address = "127.0.0.1";
    public static int port = 43594;
    // -1 = use the saved display-settings preference; 0 = force software; 1 = force OpenGL
    public static int forcedGraphicsMode = -1;
    // -1 = use the saved preference; 0 = force fixed; 1 = force resizable HUD
    public static int forcedResizable = -1;
    public static final BigInteger LOGIN_SERVER_RSA_MODULUS = new BigInteger("ea3680fdebf2621da7a33601ba39925ee203b3fc80775cd3727bf27fd8c0791c803e0bdb42b8b5257567177f8569024569da9147cef59009ed016af6007e57a556f1754f09ca84dd39a03287f7e41e8626fd78ab3b53262bd63f2e37403a549980bf3077bd402b82ef5fac269eb3c04d2a9b7712a67a018321ceba6c3bfb8f7f", 16);
    public static final BigInteger FILE_SERVER_RSA_MODULUS = new BigInteger("d6808be939bbfd2ec4e96b1581ce3e1144b526e7643a72e3c64fbb902724fbfcf14ab601da6d6f8dbb57d1c369d080d9fc392abeb7886e0076d07f2aea5810e540d2817fd1967e35b39cc95cf7c9170b5fb55f5bf95524b60e938f0d64614bc365b87d66963a8cc8664e32875366099ef297180d01c7c3842162865e11d92299", 16);
    // Camera zoom constants
    static final int ZOOM_OFFSET_DEFAULT = 0; // Linear zoom offset added to the computed FOV (0 = no offset).
    static final int ZOOM_OFFSET_STEP = 15; // Scroll step size for the linear zoom offset.

    static final int FOV_MIN_FACTOR_NUM = 1; // FOV minimum as a fraction of the base min (numerator).
    static final int FOV_MIN_FACTOR_DEN = 4; // FOV minimum as a fraction of the base min (denominator).
    static final int FOV_MAX_FACTOR_NUM = 4; // FOV maximum as a fraction of the base max (numerator).
    static final int FOV_MAX_FACTOR_DEN = 1; // FOV maximum as a fraction of the base max (denominator).
    static final int FOV_MIN_ABS = 100; // Absolute minimum FOV clamp regardless of base settings.

    static final double RENDER_DISTANCE_MULTIPLIER = 2.0; // Adjust how many tiles off in the distance are rendered
    static final double CULLING_DISTANCE_MULTIPLIER = 1.8; // Adjust distance before objects go into fog

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            switch (arg) {
                case "-ip":
                case "--address":
                    address = args[i + 1];
                    break;
                case "-p":
                case "--port":
                    port = Integer.parseInt(args[i + 1]);
                    break;
                case "-d":
                case "--debug":
                    debug = true;
                    break;
                case "-t":
                case "--trace":
                    trace = true;
                    break;
                case "-prof":
                case "--profile":
                    FrameProfiler.setEnabled(true);
                    break;
                case "-gl":
                case "--gl":
                    forcedGraphicsMode = 1; // OpenGL toolkit (LWJGL-backed jaggl)
                    break;
                case "--gldebug":
                    jaggl.OpenGL.DEBUG = true;
                    break;
                case "--resizable":
                    forcedResizable = 1;
                    break;
                case "--fixed":
                    forcedResizable = 0;
                    break;
                case "-sw":
                case "--software":
                    forcedGraphicsMode = 0; // software toolkit
                    break;
            }
        }
        Loader l = new Loader();
        l.doFrame();
    }

    /**
     * A --gl/--software force means "start with this renderer": it holds
     * through boot and the login-time auto-detect benchmark, then the first
     * explicit renderer event afterwards consumes it. While it is active,
     * every graphics-mode preference read reports the forced mode
     * (Class239_Sub25.method1829), which keeps the in-game display settings
     * from ever seeing - or applying - a different choice; consuming syncs
     * both stored preferences to the forced value first so reads stay
     * consistent with the renderer that is actually running.
     */
    public static void consumeForcedGraphicsMode() {
        int mode = forcedGraphicsMode;
        if (mode < 0 || Class316.aClass348_Sub51_3959 == null) return;
        forcedGraphicsMode = -1;
        Class316.aClass348_Sub51_3959.method3429((byte) 74, Class316.aClass348_Sub51_3959.aClass239_Sub25_7251, mode);
        Class316.aClass348_Sub51_3959.method3429((byte) 74, Class316.aClass348_Sub51_3959.aClass239_Sub25_7271, mode);
    }

    /**
     * One-shot semantics for --resizable/--fixed, mirroring the graphics-mode
     * force: it holds until the first explicit write to the window-mode
     * preference, then the stored value is synced and the getter overrides in
     * Class239_Sub3 go inert so in-game layout switching works normally.
     */
    public static void consumeForcedResizable() {
        if (forcedResizable < 0) return;
        int mode = forcedResizable == 1 ? 2 : 1;
        forcedResizable = -1;
        if (Class316.aClass348_Sub51_3959 != null && Class316.aClass348_Sub51_3959.aClass239_Sub3_7222 != null)
            Class316.aClass348_Sub51_3959.aClass239_Sub3_7222.anInt3138 = mode;
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
        aProperties1.put("lobbyaddress", loadRunescape ? "lobby16.runescape.com" : address);
        aProperties1.put("demoid", "0");
        aProperties1.put("demoaddress", "");
        aProperties1.put("modewhere", "0");
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
        aProperties1.put("cookiehost", "127.0.0.3");
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
        ArrayList<Image> icons = new ArrayList<>();
        for (String name : Arrays.asList("icon-16.png", "icon-32.png", "icon-64.png", "icon-128.png", "icon-256.png")) {
            URL resource = Loader.class.getResource(name);
            if (resource != null) {
                icons.add(new ImageIcon(resource).getImage());
            }
        }
        aJFrame2.setIconImages(icons);
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
            else url = new URL("http://" + address);
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        return url;
    }

    public static String getDebug(int id) {
        return debug ? " <col=00ff00>(</col>" + id + "<col=00ff00>)</col>" : "";
    }

    public static String getDebug(int id, int component) {
        return debug ? " <col=00ff00>(</col>" + id + " - " + component + "<col=00ff00>)</col>" : "";
    }

    public static String getDebug(int id, int x, int y, int plane) {
        return debug ? " <col=00ff00>(</col>" + id + " - " + x + ", " + y + ", " + plane + "<col=00ff00>)</col>" : "";
    }
}