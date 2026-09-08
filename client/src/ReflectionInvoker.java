/* ReflectionInvoker - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class297` (JODE-obfuscated).
 * Reflection-based method/constructor invoker (invokeByOpcode dispatches by opcode). Used to call into restricted JDK APIs (e.g. system Clipboard get/setContents) and load classes; enforces a classloader null-check SecurityException. Implements Runnable.
 */

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

final class ReflectionInvoker implements Runnable {
    /** DirectDraw cursor peer when {@link #useDirectDraw}. */
    private DirectDrawCursor directDrawCursor;
    /** Signed-applet privileges (reflection/network extras). */
    boolean signed;
    /** {@code os.version}. */
    static String osVersion;
    RandomAccessFileReader cacheIdx255 = null;
    /** {@code os.arch}. */
    static String osArch;
    private static volatile long connectionBlockedUntil = 0L;
    /** {@code java.vendor}. */
    static String javaVendor;
    static Method aMethod3783;
    private static String osName;
    /** {@code main_file_cache.dat2}. */
    RandomAccessFileReader cacheDat2 = null;
    static Method aMethod3786;
    /** Native peer ({@code DirectSoundAudio} / {@link NativeAudio}) for audio/input. */
    private Object nativeInterface;
    /** {@code random.dat} UID file. */
    RandomAccessFileReader randomDat;
    /** Game name passed to {@link CacheDirectory#init}. */
    private static String gameName;
    /** Daemon thread running {@link #run} task queue. */
    private final Thread workerThread;
    /** {@link CursorManager} for custom/blank cursors (non-DirectDraw). */
    private Object cursorManager;
    /** Cache store id ({@code jagex_cache_<id>}). */
    private static int cacheId;
    /** {@link DisplayModeManager} when not using DirectDraw. */
    private Object displayModeManager;
    /** Microsoft JVM path: use DirectDraw fullscreen/cursor instead of AWT. */
    boolean useDirectDraw;
    /** {@code main_file_cache.idx0..N}. */
    RandomAccessFileReader[] cacheIndexFiles;
    /** {@code java.version}. */
    static String javaVersion;
    /** Queue head of pending {@link Task}s. */
    private Task taskHead;
    /** Queue tail of pending {@link Task}s. */
    private Task taskTail;
    /** System AWT event queue (for {@link DummyClass#pulseAwtQueue}). */
    EventQueue eventQueue;
    /** {@code user.home}. */
    private static String userHome;
    /** Set to stop the async worker thread. */
    private boolean stopRequested;
    /** DirectDraw fullscreen helper when {@link #useDirectDraw}. */
    private DirectDrawDisplay directDrawFullscreen;
    static String aString3803;
    /*synthetic*/ static Class aClass3804;
    /*synthetic*/ static Class aClass3805;
    /*synthetic*/ static Class aClass3806;
    /*synthetic*/ static Class aClass3807;

    /** Queue opcode-6: create non-resizable fullscreen {@link Frame}. */
    final Task createFullscreenFrame(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
        if (i_3_ != -11) connectionBlockedUntil = 34L;
        return invokeByOpcode(8, (i_1_ << 16) - -i, 6, i_0_ + (i_2_ << 16), null);
    }

    /** Reflect {@code var_class.getDeclaredMethod(string, var_classes)}. */
    final Task getDeclaredMethod(Class[] var_classes, int i, Class var_class, String string) {
        if (i < 49) return null;
        return invokeByOpcode(8, 0, 8, 0, new Object[]{var_class, string, var_classes});
    }

    /** Open jagex preferences RAF for {@link #gameName}/{@link #cacheId}. */
    static final RandomAccessFileReader openGamePreferences(String string, int i) {
        if (i != -1141472112) return null;
        return openPreferencesFile(string, 12606, gameName, cacheId);
    }

    /** Reverse-DNS lookup for packed IPv4 {@code i_4_}. */
    final Task reverseDns(int i, int i_4_) {
        if (i <= 20) startThread(null, -123, -128);
        return invokeByOpcode(8, 0, 3, i_4_, null);
    }

    /** Open cache RAF for {@code string} (create-if-missing when {@code bool}). */
    final Task openCacheFile(byte i, String string, boolean bool) {
        if (i != -46) return null;
        if (!bool) return invokeByOpcode(8, 0, 13, 0, string);
        return invokeByOpcode(8, 0, 12, 0, string);
    }

    public final void run() {
        for (; ; ) {
            Task class144;
            synchronized (this) {
                for (; ; ) {
                    if (stopRequested) return;
                    if (taskHead != null) {
                        class144 = taskHead;
                        taskHead = taskHead.next;
                        if (taskHead == null) taskTail = null;
                        break;
                    }
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
            }
            try {
                int i = class144.opcode;
                if (i == 1) {
                    if (connectionBlockedUntil > Component240.currentTimeMillis(-53)) throw new IOException();
                    if (Loader.debug) {
                        System.out.println("Connect: " + class144.argument + " " + class144.intArg1);
                    }
                    {
                        String host = (String) class144.argument;
                        InetAddress addr;
                        if (host != null && host.matches("\\d+\\.\\d+\\.\\d+\\.\\d+")) {
                            String[] p = host.split("\\.");
                            addr = InetAddress.getByAddress(new byte[]{
                                    (byte) Integer.parseInt(p[0]),
                                    (byte) Integer.parseInt(p[1]),
                                    (byte) Integer.parseInt(p[2]),
                                    (byte) Integer.parseInt(p[3])
                            });
                        } else {
                            addr = InetAddress.getByName(host);
                        }
                        Socket socket = new Socket();
                        socket.connect(new java.net.InetSocketAddress(addr, class144.intArg1), 5000);
                        class144.result = socket;
                    }
                    if (Loader.debug) {
                        System.out.println("Connect OK: " + class144.argument + ":" + class144.intArg1);
                    }
                } else if (i == 22) {
                    if (connectionBlockedUntil > Component240.currentTimeMillis(-92)) throw new IOException();
                    try {
                        class144.result = Component128.createSocketConnector(class144.intArg1, (byte) -90, ((String) class144.argument)).connect(-112);
                    } catch (IOException_Sub1 ioexception_sub1) {
                        class144.result = ioexception_sub1.getMessage();
                        throw ioexception_sub1;
                    }
                } else if (i == 2) {
                    Thread thread = new Thread((Runnable) (class144.argument));
                    thread.setDaemon(true);
                    thread.start();
                    thread.setPriority(class144.intArg1);
                    class144.result = thread;
                } else if (i == 4) {
                    if (Component240.currentTimeMillis(-73) < connectionBlockedUntil) throw new IOException();
                    class144.result = new DataInputStream(((URL) (class144.argument)).openStream());
                } else if (i == 8) {
                    Object[] objects = ((Object[]) class144.argument);
                    if (this.signed && (((Class) objects[0]).getClassLoader() == null)) throw new SecurityException();
                    class144.result = (((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]));
                } else if (i == 9) {
                    Object[] objects = ((Object[]) class144.argument);
                    if (this.signed && (((Class) objects[0]).getClassLoader() == null)) throw new SecurityException();
                    class144.result = (((Class) objects[0]).getDeclaredField((String) objects[1]));
                } else if (i == 18) {
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    class144.result = clipboard.getContents(null);
                } else if (i == 19) {
                    Transferable transferable = ((Transferable) (class144.argument));
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(transferable, null);
                } else if (this.signed) {
                    if (i == 3) {
                        if (connectionBlockedUntil > Component240.currentTimeMillis(-123)) throw new IOException();
                        String string = (((0xff & (class144.intArg1 >> 24))) + "." + (0xff & (class144.intArg1 >> 16)) + "." + ((class144.intArg1 >> 8) & 0xff) + "." + (0xff & class144.intArg1));
                        class144.result = InetAddress.getByName(string).getHostName();
                    } else if (i == 21) {
                        if (Component240.currentTimeMillis(-82) < connectionBlockedUntil) throw new IOException();
                        class144.result = InetAddress.getByName((String) (class144.argument)).getAddress();
                    } else if (i != 5) {
                        if (i == 6) {
                            Frame frame = (new Frame("Jagex Full Screen"));
                            class144.result = frame;
                            frame.setResizable(false);
                            if (this.useDirectDraw) directDrawFullscreen.enterFullscreen((class144.intArg1 & 0xffff), (class144.intArg0 >> 16), (class144.intArg1 >>> 16), -43, 0xffff & (class144.intArg0), frame);
                            else
                                ((DisplayModeManager) displayModeManager).setDisplayMode(frame, (new Integer((class144.intArg1) >>> 16)), (new Integer(0xffff & (class144.intArg1))), (new Integer((class144.intArg0) >> 16)), (new Integer((class144.intArg0) & 0xffff)));
                        } else if (i == 7) {
                            if (this.useDirectDraw) directDrawFullscreen.restoreDisplayMode(((Frame) (class144.argument)), 8);
                            else ((DisplayModeManager) displayModeManager).restoreDisplayMode();
                        } else if (i == 12) {
                            RandomAccessFileReader class234 = (openPreferencesFile(((String) (class144.argument)), 12606, gameName, cacheId));
                            class144.result = class234;
                        } else if (i == 13) {
                            RandomAccessFileReader class234 = (openPreferencesFile(((String) (class144.argument)), 12606, "", cacheId));
                            class144.result = class234;
                        } else if ((this.signed) && i == 14) {
                            int i_5_ = (class144.intArg1);
                            int i_6_ = (class144.intArg0);
                            if (this.useDirectDraw) directDrawCursor.setCursorPos(i_5_, (byte) 115, i_6_);
                            else ((CursorManager) cursorManager).setCursorPos((new Integer(i_5_)), (new Integer(i_6_)));
                        } else if ((this.signed) && (i == 15)) {
                            boolean bool = ((class144.intArg1) != 0);
                            Component component = ((Component) (class144.argument));
                            if (this.useDirectDraw) directDrawCursor.setBlankCursor(bool, 13259, component);
                            else ((CursorManager) cursorManager).setBlankCursor(component, (new Boolean(bool)));
                        } else if (!(this.useDirectDraw) && (i == 17)) {
                            Object[] objects = ((Object[]) (class144.argument));
                            ((CursorManager) cursorManager).setCustomCursor((Component) objects[0], (int[]) objects[1], (new Integer(class144.intArg1)), (new Integer(class144.intArg0)), (Point) objects[2]);
                        } else if (i == 16) {
                            try {
                                if (!aString3803.startsWith("win")) throw new Exception();
                                String string = ((String) (class144.argument));
                                if (!(string.startsWith("http://")) && !(string.startsWith("https://"))) throw new Exception();
                                String string_7_ = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                                for (int i_8_ = 0; (i_8_ < (string.length())); i_8_++) {
                                    if ((string_7_.indexOf(string.charAt(i_8_))) == -1) throw new Exception();
                                }
                                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + string + "\"");
                                class144.result = null;
                            } catch (Exception exception) {
                                class144.result = exception;
                                throw exception;
                            }
                        } else throw new Exception("");
                    } else if (!this.useDirectDraw) class144.result = ((DisplayModeManager) displayModeManager).getDisplayModesPacked();
                    else class144.result = directDrawFullscreen.getDisplayModesPacked(true);
                } else throw new Exception("");
                class144.status = 1;
            } catch (Throwable throwable) {
                if (Loader.debug && class144.opcode == 1) {
                    System.out.println("Connect FAIL: " + class144.argument + ":" + class144.intArg1
                            + " " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage());
                }
                if (Loader.trace) {
                    throwable.printStackTrace();
                }
                class144.status = 2;
            }
            synchronized (class144) {
                class144.notify();
            }
        }
    }

    /** Stop worker thread and close cache RAFs. */
    final void shutdown(byte i) {
        synchronized (this) {
            stopRequested = true;
            this.notifyAll();
        }
        try {
            workerThread.join();
            if (i != 103) this.randomDat = null;
        } catch (InterruptedException interruptedexception) {
            /* empty */
        }
        if (this.cacheDat2 != null) {
            try {
                this.cacheDat2.close(false);
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (this.cacheIdx255 != null) {
            try {
                this.cacheIdx255.close(false);
            } catch (IOException ioexception) {
                /* empty */
            }
        }
        if (this.cacheIndexFiles != null) {
            for (int i_9_ = 0; i_9_ < this.cacheIndexFiles.length; i_9_++) {
                if (this.cacheIndexFiles[i_9_] != null) {
                    try {
                        this.cacheIndexFiles[i_9_].close(false);
                    } catch (IOException ioexception) {
                        /* empty */
                    }
                }
            }
        }
        do {
            if (this.randomDat != null) {
                try {
                    this.randomDat.close(false);
                } catch (IOException ioexception) {
                    break;
                }
                break;
            }
        } while (false);
    }

    /** Connect TCP to {@code string}:{@code i} ({@code bool} selects proxy path). */
    final Task openSocket(boolean bool, int i, String string, int i_10_) {
        if (i_10_ != 28225) return null;
        return invokeByOpcode(i_10_ ^ 0x6e49, 0, bool ? 22 : 1, i, string);
    }

    /** Start a daemon thread at priority {@code i_11_}. */
    final Task startThread(Runnable runnable, int i, int i_11_) {
        if (i != -10240) writeFileBytes(null, (byte) 57, null);
        return invokeByOpcode(8, 0, 2, i_11_, runnable);
    }

    /** Open {@link DataInputStream} on {@code url}. */
    final Task openUrlStream(URL url, int i) {
        if (i != 8362) return null;
        return invokeByOpcode(8, 0, 4, 0, url);
    }

    /** Install a custom AWT cursor from packed ARGB pixels. */
    final Task setCustomCursor(int i, int[] is, int i_12_, Point point, Component component, int i_13_) {
        if (i_12_ != 17) getLocalHost(-75);
        return invokeByOpcode(i_12_ + -9, i, 17, i_13_, new Object[]{component, is, point});
    }

    /** Block new network tasks for ~5s (rate-limit after failures). */
    final void blockConnections(int i) {
        if (i > -90) this.cacheIdx255 = null;
        connectionBlockedUntil = 5000L + Component240.currentTimeMillis(-107);
    }

    /** Resolve local host name via {@link InetAddress#getLocalHost()}. */
    final Task getLocalHost(int i) {
        if (i != 972476528) return null;
        return invokeByOpcode(8, 0, 5, 0, null);
    }

    /** Open jagex_*_preferences*.dat under common cache roots. */
    private static final RandomAccessFileReader openPreferencesFile(String string, int i, String string_14_, int i_15_) {
        String string_16_;
        if (i_15_ == 33) string_16_ = "jagex_" + string_14_ + "_preferences" + string + "_rc.dat";
        else if (i_15_ != 34) string_16_ = "jagex_" + string_14_ + "_preferences" + string + ".dat";
        else string_16_ = "jagex_" + string_14_ + "_preferences" + string + "_wip.dat";
        if (i != 12606) return null;
        String[] strings = {"c:/rscache/", "/rscache/", userHome, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
        for (int i_17_ = 0; strings.length > i_17_; i_17_++) {
            String string_18_ = strings[i_17_];
            if (string_18_.length() <= 0 || new File(string_18_).exists()) {
                try {
                    RandomAccessFileReader class234 = new RandomAccessFileReader(new File(string_18_, string_16_), "rw", 10000L);
                    return class234;
                } catch (Exception exception) {
                    /* empty */
                }
            }
        }
        return null;
    }

    /** Write {@code is} to {@code file}; returns true on success. */
    final boolean writeFileBytes(byte[] is, byte i, File file) {
        try {
            FileOutputStream fileoutputstream = new FileOutputStream(file);
            fileoutputstream.write(is, 0, is.length);
            if (i != -104) return false;
            fileoutputstream.close();
            return true;
        } catch (IOException ioexception) {
            throw new RuntimeException();
        }
    }

    /** Reflect {@code var_class.getDeclaredField(string)}. */
    final Task getDeclaredField(int i, String string, Class var_class) {
        if (i != 0) blockConnections(-13);
        return invokeByOpcode(8, 0, 9, 0, new Object[]{var_class, string});
    }

    /** {@link #nativeInterface} (audio/input peer). */
    final Object getNativeInterface(int i) {
        if (i != 21) openUrlStream(null, 23);
        return nativeInterface;
    }

    /** Queue opcode-16 URL open for {@code string}. */
    final Task openUrlTask(String string, int i) {
        if (i != 16) return null;
        return invokeByOpcode(i + -8, 0, 16, 0, string);
    }

    private final Task invokeByOpcode(int i, int i_19_, int i_20_, int i_21_, Object object) {
        Task class144 = new Task();
        class144.argument = object;
        class144.intArg0 = i_19_;
        class144.opcode = i_20_;
        class144.intArg1 = i_21_;
        synchronized (this) {
            if (taskTail == null) taskTail = taskHead = class144;
            else {
                taskTail.next = class144;
                taskTail = class144;
            }
            this.notify();
            if (i != 8) openSocket(false, 76, null, 37);
        }
        return class144;
    }

    /** True if a display-mode backend is loaded (DirectDraw or {@link DisplayModeManager}). */
    final boolean hasFullscreenSupport(int i) {
        if (i != -4) openUrlTask(null, 50);
        if (!this.signed) return false;
        if (this.useDirectDraw) {
            return directDrawFullscreen != null;
        }
        return displayModeManager != null;
    }

    /** Leave fullscreen / restore display mode for {@code frame}. */
    final Task exitFullscreen(byte i, Frame frame) {
        if (i != 89) return null;
        return invokeByOpcode(i ^ 0x51, 0, 7, 0, frame);
    }

    ReflectionInvoker(int i, String string, int i_22_, boolean bool) throws Exception {
        this.signed = false;
        taskTail = null;
        stopRequested = false;
        this.randomDat = null;
        this.useDirectDraw = false;
        taskHead = null;
        gameName = string;
        this.signed = bool;
        javaVersion = "1.1";
        javaVendor = "Unknown";
        cacheId = i;
        try {
            javaVendor = System.getProperty("java.vendor");
            javaVersion = System.getProperty("java.version");
        } catch (Exception exception) {
            /* empty */
        }
        if (javaVendor.toLowerCase().indexOf("microsoft") != -1) this.useDirectDraw = true;
        try {
            osName = System.getProperty("os.name");
        } catch (Exception exception) {
            osName = "Unknown";
        }
        aString3803 = osName.toLowerCase();
        try {
            osArch = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
            osArch = "";
        }
        try {
            osVersion = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
            osVersion = "";
        }
        try {
            userHome = System.getProperty("user.home");
            if (userHome != null) userHome += "/";
        } catch (Exception exception) {
            /* empty */
        }
        if (userHome == null) userHome = "~/";
        try {
            this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        } catch (Throwable throwable) {
            /* empty */
        }
        if (!this.useDirectDraw) {
            try {
                aMethod3783 = Component.class.getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
            } catch (Exception exception) {
                /* empty */
            }
            try {
                aMethod3786 = (Container.class.getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE));
            } catch (Exception exception) {
                /* empty */
            }
        }
        CacheDirectory.init((byte) -121, gameName, cacheId);
        if (this.signed) {
            this.randomDat = new RandomAccessFileReader(CacheDirectory.resolveCacheFile(0, cacheId, "random.dat", null), "rw", 25L);
            this.cacheDat2 = new RandomAccessFileReader(CacheDirectory.getCacheFile(-2, "main_file_cache.dat2"), "rw", 209715200L);
            this.cacheIdx255 = new RandomAccessFileReader(CacheDirectory.getCacheFile(-2, "main_file_cache.idx255"), "rw", 1048576L);
            this.cacheIndexFiles = new RandomAccessFileReader[i_22_];
            for (int i_23_ = 0; i_22_ > i_23_; i_23_++)
                this.cacheIndexFiles[i_23_] = new RandomAccessFileReader(CacheDirectory.getCacheFile(-2, ("main_file_cache.idx" + i_23_)), "rw", 1048576L);
            if (this.useDirectDraw) {
                try {
                    nativeInterface = new DirectSoundAudio();
                } catch (Throwable throwable) {
                    /* empty */
                }
            }
            try {
                if (!this.useDirectDraw) displayModeManager = new DisplayModeManager();
                else directDrawFullscreen = new DirectDrawDisplay();
            } catch (Throwable throwable) {
                /* empty */
            }
            try {
                if (!this.useDirectDraw) cursorManager = new CursorManager();
                else directDrawCursor = new DirectDrawCursor();
            } catch (Throwable throwable) {
                /* empty */
            }
        }
        if (this.signed && !this.useDirectDraw) {
            ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
            for (ThreadGroup threadgroup_24_ = threadgroup.getParent(); threadgroup_24_ != null; threadgroup_24_ = threadgroup.getParent())
                threadgroup = threadgroup_24_;
            Thread[] threads = new Thread[1000];
            threadgroup.enumerate(threads);
            for (int i_25_ = 0; threads.length > i_25_; i_25_++) {
                if (threads[i_25_] != null && threads[i_25_].getName().startsWith("AWT")) threads[i_25_].setPriority(1);
            }
        }
        stopRequested = false;
        workerThread = new Thread(this);
        workerThread.setPriority(10);
        workerThread.setDaemon(true);
        workerThread.start();
    }

}
