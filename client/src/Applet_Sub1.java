/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jagex3.jagmisc.jagmisc;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Date;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
    static int anInt1;
    static int anInt2;
    static int anInt3;
    static int anInt4;
    static int anInt5;
    static int anInt6;
    static int anInt7;
    static int anInt8;
    static int anInt9;
    static int anInt10;
    static int anInt11;
    static int anInt12;
    static int anInt13;
    static int anInt14;
    static int anInt15;
    static int anInt16;
    private boolean aBoolean17 = false;
    static int anInt18;
    static int anInt19;
    static BitmapFont aClass324_20;
    static int anInt21;
    static int anInt22;
    static int anInt23;
    static int anInt24;
    static int anInt25;
    static int anInt26;
    private boolean aBoolean27 = false;
    static int anInt28;
    static int anInt29;
    static int anInt30;
    static int anInt31;
    static int anInt32;
    static int anInt33;
    static int anInt34;
    static int anInt35;
    static int anInt36;
    static int anInt37;
    static int[] anIntArray38;
    static int anInt39;
    static int anInt40;
    public static boolean aBoolean41;
    public static int anInt42;
    public static int anInt43;
    public static int anInt44;
    public static int anInt45;
    public static boolean aBoolean46;
    public static boolean aBoolean47;
    public static boolean aBoolean48;
    public static boolean aBoolean49;
    public static boolean aBoolean50;
    public static boolean aBoolean51;
    public static boolean aBoolean52;
    public static int anInt53;
    public static boolean aBoolean54;
    public static int anInt55;
    public static boolean aBoolean56;
    public static int anInt57;
    public static boolean aBoolean58;
    public static int anInt59;

    /** Close toolkit, sockets, and cache files. */
    abstract void closeResources(int i);

    public final void stop() {
        anInt24++;
        if (this == DefinitionSub9.anApplet_Sub1_9169 && !AssetCacheLoader.shuttingDown) Component22.aLong1739 = Component240.currentTimeMillis(-73) - -4000L;
    }

    public final String getParameter(String string) {
        anInt3++;
        if (RSACipher.aFrame4904 != null) return null;
        if (ToolkitFactory.anApplet1530 != null && ToolkitFactory.anApplet1530 != this) return ToolkitFactory.anApplet1530.getParameter(string);
        return super.getParameter(string);
    }

    String method81(byte i) {
        anInt1++;
        if (i <= 40) run();
        return null;
    }

    /** Print {@code error_game_<string>} and redirect to error page once. */
    final void reportGameError(int i, String string) {
        int i_0_ = 88 / ((i - -5) / 54);
        anInt22++;
        if (!aBoolean27) {
            aBoolean27 = true;
            System.out.println("error_game_" + string);
            try {
                AppletInvoker.callAppletNoArgs((byte) 125, ToolkitFactory.anApplet1530, "loggedout");
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                getAppletContext().showDocument(new URL(getCodeBase(), ("error_game_" + string + ".ws")), "_top");
            } catch (Exception exception) {
                /* empty */
            }
        }
    }

    public final void windowActivated(WindowEvent windowevent) {
        anInt16++;
    }

    /** Load the {@code jagmisc} native (timing / system helpers). */
    final boolean tryLoadJagmisc(boolean bool) {
        if (bool != true) getDocumentBase();
        anInt5++;
        return DefinitionSub19.tryLoadNativeLibrary(-30282, "jagmisc");
    }

    public final void focusLost(FocusEvent focusevent) {
        anInt9++;
        ToolbarRefreshDefinition.aBoolean9229 = false;
    }

    /** One logic-frame sample: record timestamp ring, sync focus flag, then {@link #pulseGame}. */
    private final void pulseLogicFrame(int i) {
        anInt8++;
        long l = Component240.currentTimeMillis(i + -88);
        long l_1_ = ShaderCompilerSub2Sub1.aLongArray8800[ModelStore.anInt4613];
        ShaderCompilerSub2Sub1.aLongArray8800[ModelStore.anInt4613] = l;
        ModelStore.anInt4613 = 0x1f & 1 + ModelStore.anInt4613;
        if (l_1_ != 0L && l > l_1_) {
            /* empty */
        }
        synchronized (this) {
            Component143.aBoolean2329 = ToolbarRefreshDefinition.aBoolean9229;
        }
        pulseGame((byte) 93);
        if (i != -1) aBoolean27 = true;
    }

    public final void update(Graphics graphics) {
        anInt34++;
        paint(graphics);
    }

    /** Bind the cache store jagmisc uses for optional native-backed IO. */
    static final void setJagmiscCacheStore(int i, CacheStore class45) {
        anInt32++;
        Component76.aClass45_8601 = class45;
        if (i != 0) anInt37 = 101;
    }

    public final void windowClosing(WindowEvent windowevent) {
        anInt15++;
        destroy();
    }

    public final URL getDocumentBase() {
        anInt30++;
        if (RSACipher.aFrame4904 != null) return null;
        if (ToolkitFactory.anApplet1530 != null && this != ToolkitFactory.anApplet1530) return ToolkitFactory.anApplet1530.getDocumentBase();
        return super.getDocumentBase();
    }

    /** True if {@code string} (e.g. {@code jagdx}) was already extracted/cached this session. */
    static final boolean isNativeLibraryCached(String string, int i) {
        anInt13++;
        if (i != 0) return true;
        return Component300.aHashtable3548.containsKey(string);
    }

    public final void windowDeactivated(WindowEvent windowevent) {
        anInt12++;
    }

    /** Tear down and recreate {@link DisplayModeManagerContainer50#gameCanvas} on the current host container. */
    synchronized void recreateGameCanvas(byte i) {
        if (i > -11) paint(null);
        if (DisplayModeManagerContainer50.gameCanvas != null) {
            DisplayModeManagerContainer50.gameCanvas.removeFocusListener(this);
            DisplayModeManagerContainer50.gameCanvas.getParent().setBackground(Color.black);
            DisplayModeManagerContainer50.gameCanvas.getParent().remove(DisplayModeManagerContainer50.gameCanvas);
        }
        anInt7++;
        Container container;
        if (Component225.aFrame476 == null) {
            if (RSACipher.aFrame4904 == null) {
                if (ToolkitFactory.anApplet1530 == null) container = DefinitionSub9.anApplet_Sub1_9169;
                else container = ToolkitFactory.anApplet1530;
            } else container = RSACipher.aFrame4904;
        } else container = Component225.aFrame476;
        container.setLayout(null);
        DisplayModeManagerContainer50.gameCanvas = new Canvas_Sub1(this);
        container.add(DisplayModeManagerContainer50.gameCanvas);
        DisplayModeManagerContainer50.gameCanvas.setSize(Component236.canvasWidth, PacketReader.canvasHeight);
        DisplayModeManagerContainer50.gameCanvas.setVisible(true);
        if (container == RSACipher.aFrame4904) {
            Insets insets = RSACipher.aFrame4904.getInsets();
            DisplayModeManagerContainer50.gameCanvas.setLocation((insets.left + NodeSub48.perFrameReset), insets.top - -DisplayModeManagerContainer147.perDrawReset);
        } else DisplayModeManagerContainer50.gameCanvas.setLocation(NodeSub48.perFrameReset, DisplayModeManagerContainer147.perDrawReset);
        DisplayModeManagerContainer50.gameCanvas.addFocusListener(this);
        DisplayModeManagerContainer50.gameCanvas.requestFocus();
        ToolbarRefreshDefinition.aBoolean9229 = true;
        Component143.aBoolean2329 = true;
        Component297.aBoolean4726 = true;
        DisplayModeManagerContainer351.aBoolean2674 = false;
        NodeSub12.aLong6748 = Component240.currentTimeMillis(-106);
    }

    public final void windowOpened(WindowEvent windowevent) {
        anInt39++;
    }

    public final synchronized void paint(Graphics graphics) {
        anInt18++;
        if (this == DefinitionSub9.anApplet_Sub1_9169 && !AssetCacheLoader.shuttingDown) {
            Component297.aBoolean4726 = true;
            if (AbstractShaderSub4.aBoolean7320 && -NodeSub12.aLong6748 + Component240.currentTimeMillis(-57) > 1000) {
                Rectangle rectangle = graphics.getClipBounds();
                if (rectangle == null || (rectangle.width >= SocketConnector.canvasWidth && (NpcNode.canvasHeight <= rectangle.height))) DisplayModeManagerContainer351.aBoolean2674 = true;
            }
        }
    }

    /** Sample frame timestamps into the FPS ring and update {@code DisplayModeManagerContainer348.fps}. */
    private final void updateFpsCounter(int i) {
        anInt2++;
        long l = Component240.currentTimeMillis(-119);
        long l_2_ = Buffer.aLongArray7206[InflaterDecompressor.anInt2071];
        Buffer.aLongArray7206[InflaterDecompressor.anInt2071] = l;
        if (l_2_ != 0L && l_2_ < l) {
            int i_3_ = (int) (l - l_2_);
            DisplayModeManagerContainer348.fps = (32000 + (i_3_ >> 1)) / i_3_;
        }
        InflaterDecompressor.anInt2071 = InflaterDecompressor.anInt2071 - -1 & 0x1f;
        if (Component146.anInt2127++ > 50) {
            Component146.anInt2127 -= 50;
            Component297.aBoolean4726 = true;
            DisplayModeManagerContainer50.gameCanvas.setSize(Component236.canvasWidth, PacketReader.canvasHeight);
            DisplayModeManagerContainer50.gameCanvas.setVisible(true);
            if (RSACipher.aFrame4904 != null && Component225.aFrame476 == null) {
                Insets insets = RSACipher.aFrame4904.getInsets();
                DisplayModeManagerContainer50.gameCanvas.setLocation((insets.left - -NodeSub48.perFrameReset), (insets.top + DisplayModeManagerContainer147.perDrawReset));
            } else DisplayModeManagerContainer50.gameCanvas.setLocation(NodeSub48.perFrameReset, DisplayModeManagerContainer147.perDrawReset);
        }
        pulseDrawFrame(-11018);
        if (i > -107) shutdown(true, true);
    }

    public final void windowDeiconified(WindowEvent windowevent) {
        anInt35++;
    }

    public final void focusGained(FocusEvent focusevent) {
        anInt23++;
        ToolbarRefreshDefinition.aBoolean9229 = true;
        Component297.aBoolean4726 = true;
    }

    public final void windowClosed(WindowEvent windowevent) {
        anInt33++;
    }

    /** Host allow-list check (currently always true; original jagex.com/127.0.0.1 checks remain commented). */
    final boolean validateHost(int i) {
        anInt40++;
        return true;
        /*if (i <= 19) return true;
        String string = getDocumentBase().getHost().toLowerCase();
        if (string.equals("jagex.com") || string.endsWith(".jagex.com")) return true;
        if (string.equals("runescape.com") || string.endsWith(".runescape.com")) return true;
        if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com")) return true;
        if (string.endsWith("127.0.0.1")) return true;
        for (*//**//*; string.length() > 0 && string.charAt(-1 + string.length()) >= 48; string = string.substring(0, string.length() - 1)) {
            if (string.charAt(string.length() - 1) > 57) {
                break;
            }
        }
        if (string.endsWith("192.168.1.")) return true;
        reportGameError(53, "invalidhost");
        return false;*/
    }

    /** Begin client shutdown ({@code clean=}{@code bool}); calls {@link #cleanup}. */
    private final void shutdown(boolean bool, boolean bool_4_) {
        anInt26++;
        synchronized (this) {
            if (AssetCacheLoader.shuttingDown) return;
            AssetCacheLoader.shuttingDown = true;
        }
        System.out.println("Shutdown start - clean:" + bool);
        if (ToolkitFactory.anApplet1530 != null) ToolkitFactory.anApplet1530.destroy();
        if (bool_4_ != false) aBoolean17 = false;
        try {
            closeResources(0);
        } catch (Exception exception) {
            /* empty */
        }
        if (aBoolean17) {
            try {
                jagmisc.quit();
            } catch (Throwable throwable) {
                /* empty */
            }
            aBoolean17 = false;
        }
        Component36.method1945((byte) -128, true);
        NativeLibraryLoader.unloadNativeLibraries(!bool_4_);
        if (DisplayModeManagerContainer50.gameCanvas != null) {
            try {
                DisplayModeManagerContainer50.gameCanvas.removeFocusListener(this);
                DisplayModeManagerContainer50.gameCanvas.getParent().remove(DisplayModeManagerContainer50.gameCanvas);
            } catch (Exception exception) {
                /* empty */
            }
        }
        if (OggUrlStream.aClass297_8992 != null) {
            try {
                OggUrlStream.aClass297_8992.shutdown((byte) 103);
            } catch (Exception exception) {
                /* empty */
            }
        }
        cleanup((byte) 108);
        if (RSACipher.aFrame4904 != null) {
            RSACipher.aFrame4904.setVisible(false);
            RSACipher.aFrame4904.dispose();
            RSACipher.aFrame4904 = null;
        }
        System.out.println("Shutdown complete - clean:" + bool);
    }

    public static final void provideLoaderApplet(Applet applet) {
        anInt11++;
        ToolkitFactory.anApplet1530 = applet;
    }

    /** Subclass static-table / resource teardown after {@link #closeResources}. */
    abstract void cleanup(byte i);

    public final AppletContext getAppletContext() {
        anInt19++;
        if (RSACipher.aFrame4904 != null) return null;
        if (ToolkitFactory.anApplet1530 != null && this != ToolkitFactory.anApplet1530) return ToolkitFactory.anApplet1530.getAppletContext();
        return super.getAppletContext();
    }

    public final URL getCodeBase() {
        anInt29++;
        if (RSACipher.aFrame4904 != null) return null;
        if (ToolkitFactory.anApplet1530 != null && this != ToolkitFactory.anApplet1530) return ToolkitFactory.anApplet1530.getCodeBase();
        return super.getCodeBase();
    }

    public abstract void init();

    public final void destroy() {
        anInt21++;
        if (DefinitionSub9.anApplet_Sub1_9169 == this && !AssetCacheLoader.shuttingDown) {
            Component22.aLong1739 = Component240.currentTimeMillis(-108);
            SpriteAtlasShader.sleep((byte) 77, 5000L);
            BuildType.aClass297_2993 = null;
            shutdown(false, false);
        }
    }

    public final void run() {
        anInt28++;
        do {
            try {
                if (ReflectionInvoker.javaVendor != null) {
                    String string = ReflectionInvoker.javaVendor.toLowerCase();
                    if (string.indexOf("sun") != -1 || string.indexOf("apple") != -1) {
                        String string_5_ = ReflectionInvoker.javaVersion;
                        if (string_5_.equals("1.1") || string_5_.startsWith("1.1.") || string_5_.equals("1.2") || string_5_.startsWith("1.2.")) {
                            reportGameError(-119, "wrongjava");
                            break;
                        }
                    } else if (string.indexOf("ibm") != -1 && (ReflectionInvoker.javaVersion == null || ReflectionInvoker.javaVersion.equals("1.4.2"))) {
                        reportGameError(81, "wrongjava");
                        break;
                    }
                }
                if (ReflectionInvoker.javaVersion != null && ReflectionInvoker.javaVersion.startsWith("1.")) {
                    int i = 2;
                    int i_6_ = 0;
                    while (ReflectionInvoker.javaVersion.length() > i) {
                        int i_7_ = ReflectionInvoker.javaVersion.charAt(i);
                        if (i_7_ < 48 || i_7_ > 57) break;
                        i++;
                        i_6_ = 10 * i_6_ - (-i_7_ + 48);
                    }
                    if (i_6_ >= 5) AbstractShaderSub4.aBoolean7320 = true;
                }
                Applet applet = DefinitionSub9.anApplet_Sub1_9169;
                if (ToolkitFactory.anApplet1530 != null) applet = ToolkitFactory.anApplet1530;
                Method method = ReflectionInvoker.aMethod3786;
                if (method != null) {
                    try {
                        method.invoke(applet, Boolean.TRUE);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                }
                ShaderSub3.method168((byte) 103);
                Component162.method1119(false);
                recreateGameCanvas((byte) -97);
                initializeClient(28740);
                NodeSub8.aClass241_6660 = Component267.method1631(false);
                while (Component22.aLong1739 == 0L || (Component240.currentTimeMillis(-124) < Component22.aLong1739)) {
                    MatrixSub2.anInt5744 = NodeSub8.aClass241_6660.method1861(0, DisplayModeManagerContainer306.aLong4783);
                    for (int i = 0; MatrixSub2.anInt5744 > i; i++)
                        pulseLogicFrame(-1);
                    updateFpsCounter(-119);
                    DummyClass.pulseAwtQueue((byte) -42, DisplayModeManagerContainer50.gameCanvas, (OggUrlStream.aClass297_8992));
                }
            } catch (Throwable throwable) {
                ClientErrorReporter.reportError(method81((byte) 109), throwable, 15004);
                reportGameError(123, "crash");
            } finally {
                shutdown(true, false);
            }
        } while (false);
    }

    /** One-shot client bootstrap (prefs, hosts, palettes). Implemented by {@code client}. */
    abstract void initializeClient(int i);

    /** Draw/present pulse; implemented by {@code client} (safe-mode catch around the real draw path). */
    abstract void pulseDrawFrame(int i);

    static final void set(String string) {
        Component126.consoleInput = string;
        NodeSub38.consoleCursor = string.length();
    }

    /** Append timestamped line(s) to the client console (and optional log stream). */
    static final void printConsole(String string, int i) {
        anInt6++;
        if (ArbShaderProgram.consoleLines == null) DisplayModeManagerContainer288.initDevConsole(2);
        // createOutboundPacket's opaque arg can null this; restore so console never NPEs.
        if (ParticleShader.aCalendar6221 == null)
            ParticleShader.aCalendar6221 = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone("GMT"));
        ParticleShader.aCalendar6221.setTime(new Date(Component240.currentTimeMillis(-102)));
        int i_8_ = ParticleShader.aCalendar6221.get(11);
        int i_9_ = ParticleShader.aCalendar6221.get(12);
        int i_10_ = ParticleShader.aCalendar6221.get(13);
        String string_11_ = (Integer.toString(i_8_ / 10) + i_8_ % 10 + ":" + i_9_ / 10 + i_9_ % 10 + ":" + i_10_ / 10 + i_10_ % 10);
        String[] strings = DefinitionSub23.splitByChar('\n', true, string);
        for (int i_12_ = 0; i_12_ < strings.length; i_12_++) {
            for (int i_13_ = Component14.consoleLineCount; i_13_ > 0; i_13_--)
                ArbShaderProgram.consoleLines[i_13_] = ArbShaderProgram.consoleLines[-1 + i_13_];
            ArbShaderProgram.consoleLines[0] = string_11_ + ": " + strings[i_12_];
            if (Component40.consoleLogStream != null) {
                try {
                    Component40.consoleLogStream.write(ClientSystemInfo.encodeCp1252(((ArbShaderProgram.consoleLines[0]) + "\n"), (byte) -20));
                } catch (java.io.IOException ioexception) {
                    /* empty */
                }
            }
            if (-1 + ArbShaderProgram.consoleLines.length > Component14.consoleLineCount) {
                Component14.consoleLineCount++;
                if (Component94.consoleScroll > 0) Component94.consoleScroll++;
            }
        }
        int i_14_ = 85 / ((i - -1) / 52);
    }

    /** Boot as an embedded applet: size the canvas and start the game thread via {@link ReflectionInvoker}. */
    final void startFromApplet(int i, int i_15_, int i_16_, int i_17_, int i_18_, String string, int i_19_) {
        anInt25++;
        try {
            if (DefinitionSub9.anApplet_Sub1_9169 == null) {
                NodeSub48.perFrameReset = 0;
                NpcNode.canvasHeight = PacketReader.canvasHeight = i_16_;
                SocketConnector.canvasWidth = Component236.canvasWidth = i;
                DisplayModeManagerContainer147.perDrawReset = 0;
                NodeSub1Sub3.anInt8818 = i_15_;
                DefinitionSub9.anApplet_Sub1_9169 = this;
                NodeSub8.anApplet6662 = ToolkitFactory.anApplet1530;
                BuildType.aClass297_2993 = OggUrlStream.aClass297_8992 = new ReflectionInvoker(i_17_, string, i_18_, ToolkitFactory.anApplet1530 != null);
                Task class144 = OggUrlStream.aClass297_8992.startThread(this, -10240, 1);
                if (i_19_ != 50) anInt37 = -13;
                while (class144.status == 0) SpriteAtlasShader.sleep((byte) -126, 10L);
            } else {
                NodeSub51.anInt7252++;
                if (NodeSub51.anInt7252 >= 3) reportGameError(112, "alreadyloaded");
                else getAppletContext().showDocument(getDocumentBase(), "_self");
            }
        } catch (Throwable throwable) {
            ClientErrorReporter.reportError(null, throwable, 15004);
            reportGameError(52, "crash");
        }
    }

    /** Boot as a standalone {@link Frame} titled {@code Jagex}; used by desktop {@code Loader}. */
    final void startFromFrame(int i, int i_20_, boolean bool, int i_21_, int i_22_, String string, int i_23_, int i_24_) {
        try {
            if (i_23_ != 23499) return;
            SocketConnector.canvasWidth = Component236.canvasWidth = i_20_;
            NpcNode.canvasHeight = PacketReader.canvasHeight = i_24_;
            DefinitionSub9.anApplet_Sub1_9169 = this;
            DisplayModeManagerContainer147.perDrawReset = 0;
            NodeSub48.perFrameReset = 0;
            NodeSub1Sub3.anInt8818 = i_21_;
            NodeSub8.anApplet6662 = null;
            RSACipher.aFrame4904 = new Frame();
            RSACipher.aFrame4904.setTitle("Jagex");
            RSACipher.aFrame4904.setResizable(true);
            RSACipher.aFrame4904.addWindowListener(this);
            RSACipher.aFrame4904.setVisible(true);
            RSACipher.aFrame4904.toFront();
            Insets insets = RSACipher.aFrame4904.getInsets();
            RSACipher.aFrame4904.setSize(insets.right + (insets.left + SocketConnector.canvasWidth), (insets.bottom + (NpcNode.canvasHeight + insets.top)));
            BuildType.aClass297_2993 = OggUrlStream.aClass297_8992 = new ReflectionInvoker(i, string, i_22_, true);
            Task class144 = OggUrlStream.aClass297_8992.startThread(this, i_23_ + -33739, 1);
            while (class144.status == 0) SpriteAtlasShader.sleep((byte) 21, 10L);
        } catch (Exception exception) {
            ClientErrorReporter.reportError(null, exception, i_23_ + -8495);
        }
        anInt31++;
    }

    public final void windowIconified(WindowEvent windowevent) {
        anInt14++;
    }

    /** Load the {@code jaclib} native. */
    final boolean tryLoadJaclib(int i) {
        if (i != -1) updateFpsCounter(-104);
        anInt4++;
        return DefinitionSub19.tryLoadNativeLibrary(-30282, "jaclib");
    }

    public static void clearStatics(int i) {
        anIntArray38 = null;
        aClass324_20 = null;
        if (i != 32717) isNativeLibraryCached(null, 65);
    }

    public final void start() {
        anInt36++;
        if (this == DefinitionSub9.anApplet_Sub1_9169 && !AssetCacheLoader.shuttingDown) Component22.aLong1739 = 0L;
    }

    /** Per-logic-tick game pulse; implemented by {@code client} → {@code processGameTick}. */
    abstract void pulseGame(byte i);

    /** Load the {@code jagtheora} native (video ads). */
    final boolean tryLoadJagtheora(int i) {
        anInt10++;
        if (i != 10) return true;
        return DefinitionSub19.tryLoadNativeLibrary(-30282, "jagtheora");
    }
}
