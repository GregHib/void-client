package jaggl;

import java.awt.Canvas;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.StringTokenizer;

import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.awt.GLData;
import org.lwjgl.opengl.awt.PlatformGLCanvas;
import org.lwjgl.opengl.awt.PlatformLinuxGLCanvas;
import org.lwjgl.opengl.awt.PlatformMacOSXGLCanvas;
import org.lwjgl.opengl.awt.PlatformWin32GLCanvas;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Platform;

/**
 * Pure-Java replacement for Jagex's jaggl native OpenGL binding
 * (clientlibs.jar), backed by LWJGL 3 for the GL entry points and lwjgl3-awt
 * for context creation on the AWT canvas (WGL / GLX / modern-macOS CALayer).
 *
 * The static method surface is byte-for-byte signature compatible with the
 * original 634-era jaggl.OpenGL, so client code and jaggl.MapBuffer (still
 * loaded from clientlibs.jar) link against this class unchanged. Instance
 * methods reproduce the original context-lifecycle semantics: init() creates
 * the context on the game canvas and returns a surface handle, b() attaches
 * the context to the calling thread, a() detaches it, a(String) answers
 * extension queries. Pbuffers report unavailable, pushing the client onto its
 * (better) EXT_framebuffer_object path.
 */
public class OpenGL {

    public static boolean DEBUG = false;

    long peer; // layout compat with the original; unused

    private Thread a;                          // thread the context is attached to
    private static final Hashtable b = new Hashtable(); // thread -> OpenGL
    private Hashtable c;                       // extension name -> name

    private PlatformGLCanvas canvasBinding;
    private long context;
    private GLCapabilities caps;
    private Canvas canvas;
    private int lastWidth, lastHeight, lastWinWidth, lastWinHeight;
    private int warmupFrames = 30;
    private int layerFixFrames;


    public OpenGL() {
    }

    // ------------------------------------------------------------------
    // Context lifecycle
    // ------------------------------------------------------------------

    private static PlatformGLCanvas platformCanvas() {
        switch (Platform.get()) {
            case WINDOWS: return new PlatformWin32GLCanvas();
            case LINUX: return new PlatformLinuxGLCanvas();
            case MACOSX: return new PlatformMacOSXGLCanvas();
            default: throw new UnsupportedOperationException("platform");
        }
    }

    public final long init(Canvas canvas, int red, int green, int blue, int depth, int alpha, int samples) {
        try {
            GLData want = new GLData();
            want.redSize = red;
            want.greenSize = green;
            want.blueSize = blue;
            want.alphaSize = alpha;
            want.depthSize = depth;
            want.stencilSize = 0;
            want.doubleBuffer = true;
            want.swapInterval = Integer.valueOf(0);
            if (samples > 1) {
                want.sampleBuffers = 1;
                want.samples = samples;
            }
            try {
                canvasBinding = platformCanvas();
                context = canvasBinding.create(canvas, want, new GLData());
            } catch (Throwable t) {
                if (samples <= 1) throw t;
                if (DEBUG) System.err.println("[jaggl] MSAA " + samples + "x failed, retrying without: " + t);
                want.sampleBuffers = 0;
                want.samples = 0;
                canvasBinding = platformCanvas();
                context = canvasBinding.create(canvas, want, new GLData());
            }
            if (DEBUG) System.err.println("[jaggl] context created: 0x" + Long.toHexString(context));
            this.canvas = canvas;
            return context;
        } catch (Throwable t) {
            System.err.println("[jaggl] context creation failed: " + t);
            if (DEBUG) t.printStackTrace();
            return 0L;
        }
    }

    /** Attach the GL context to the calling thread. */
    public final synchronized boolean b() {
        Thread thread = Thread.currentThread();
        try {
            canvasBinding.lock();
            boolean ok;
            try {
                ok = canvasBinding.makeCurrent(context);
            } finally {
                canvasBinding.unlock();
            }
            if (!ok) return false;
        } catch (Throwable t) {
            if (DEBUG) System.err.println("[jaggl] attach failed: " + t);
            return false;
        }
        if (caps == null) {
            caps = GL.createCapabilities();
            System.out.println("[jaggl] OpenGL active: "
                + org.lwjgl.opengl.GL11.glGetString(7936) + " | "   // GL_VENDOR
                + org.lwjgl.opengl.GL11.glGetString(7937) + " | "   // GL_RENDERER
                + org.lwjgl.opengl.GL11.glGetString(7938)           // GL_VERSION
                + " | depth=" + org.lwjgl.opengl.GL11.glGetInteger(3414)     // GL_DEPTH_BITS
                + " stencil=" + org.lwjgl.opengl.GL11.glGetInteger(3415)     // GL_STENCIL_BITS
                + " samples=" + org.lwjgl.opengl.GL11.glGetInteger(32937));  // GL_SAMPLES
        } else {
            GL.setCapabilities(caps);
        }
        OpenGL previous = (OpenGL) b.put(thread, this);
        if (previous != null && previous != this) previous.a = null;
        this.a = thread;
        return true;
    }

    /** Detach the GL context from the calling thread. */
    public final synchronized boolean a() {
        if (this.a != Thread.currentThread()) return false;
        try {
            canvasBinding.makeCurrent(0L);
        } catch (Throwable ignored) {
        }
        GL.setCapabilities(null);
        b.remove(this.a);
        this.a = null;
        return true;
    }

    /** Extension query against GL_EXTENSIONS. */
    public final boolean a(String name) {
        if (c == null) {
            c = new Hashtable();
            String extensions = glGetString(7939);
            if (extensions != null) {
                StringTokenizer tokens = new StringTokenizer(extensions, " ");
                while (tokens.hasMoreTokens()) {
                    String token = tokens.nextToken().trim();
                    if (token.length() > 0) c.put(token, token);
                }
            }
        }
        return c.containsKey(name);
    }

    public final void swapBuffers() {
        try {
            // The layer's size AND position are only recomputed inside
            // makeCurrent (under the JAWT lock), so refresh when the canvas
            // OR the window geometry changes (layer position depends on the
            // window height - bottom-left CALayer origin), plus a few warmup
            // frames while AWT finishes its initial layout. Refreshing every
            // frame would thrash CoreAnimation into a blank window.
            if (canvas != null) {
                java.awt.Component root = canvas;
                while (root.getParent() != null) root = root.getParent();
                int cw = canvas.getWidth(), ch = canvas.getHeight();
                int ww = root.getWidth(), wh = root.getHeight();
                if (DEBUG && (frameCount % 256) == 0) {
                    System.err.println("[jaggl] geometry: canvas " + cw + "x" + ch
                        + " at (" + canvas.getX() + "," + canvas.getY() + ") in "
                        + canvas.getParent().getClass().getSimpleName() + " "
                        + canvas.getParent().getWidth() + "x" + canvas.getParent().getHeight()
                        + ", window " + ww + "x" + wh);
                }
                boolean geometryChanged = cw != lastWidth || ch != lastHeight
                    || ww != lastWinWidth || wh != lastWinHeight;
                if (geometryChanged) layerFixFrames = 10;
                if (warmupFrames > 0 || geometryChanged) {
                    if (warmupFrames > 0) warmupFrames--;
                    lastWidth = cw;
                    lastHeight = ch;
                    lastWinWidth = ww;
                    lastWinHeight = wh;
                    setSurface(context);
                }
                // Re-apply for a few frames after any geometry change (and
                // during warmup): lwjgl3-awt only ever sets the layer frame to
                // {0,0,w,h}, and may do so asynchronously after our write.
                if ((warmupFrames > 0 || layerFixFrames > 0)
                    && Platform.get() == Platform.MACOSX && root instanceof java.awt.Window) {
                    if (layerFixFrames > 0) layerFixFrames--;
                    fixLayerFrame((java.awt.Window) root);
                }
                // Once a second, verify AWT's window model against the real
                // NSWindow and resync if the resize notifications got lost.
                if (Platform.get() == Platform.MACOSX && root instanceof java.awt.Window
                    && --windowSyncCountdown <= 0) {
                    windowSyncCountdown = 50;
                    syncWindowFromNative((java.awt.Window) root);
                }
            }
            canvasBinding.swapBuffers();
            flushDeferredDeletes();
        } catch (Throwable t) {
            if (DEBUG) System.err.println("[jaggl] swapBuffers failed: " + t);
        }
    }

    public final void setSwapInterval(int interval) {
        try {
            if (Platform.get() == Platform.MACOSX) {
                long ctx = org.lwjgl.opengl.CGL.CGLGetCurrentContext();
                if (ctx != 0L) {
                    org.lwjgl.opengl.CGL.CGLSetParameter(ctx, org.lwjgl.opengl.CGL.kCGLCPSwapInterval, new int[]{interval});
                }
            }
            // Other platforms: the context was created with swapInterval 0.
        } catch (Throwable ignored) {
        }
    }

    public final boolean setSurface(long surface) {
        if (surface != context || canvasBinding == null) return false;
        try {
            if (Platform.get() == Platform.MACOSX) invalidateCachedSize();
            canvasBinding.lock();
            try {
                return canvasBinding.makeCurrent(context);
            } finally {
                canvasBinding.unlock();
            }
        } catch (Throwable t) {
            return false;
        }
    }

    public final void surfaceResized(long surface) {
        // Re-running makeCurrent under the surface lock refreshes the drawable
        // bounds (lwjgl3-awt updates layer/drawable size there).
        setSurface(surface);
    }

    public final long prepareSurface(Canvas canvas) {
        if (DEBUG) System.err.println("[jaggl] prepareSurface unsupported (secondary canvas)");
        return -1L; // secondary surfaces unsupported in the Java backend
    }

    public final void releaseSurface(Canvas canvas, long surface) {
        if (surface == context && canvasBinding != null) {
            try {
                canvasBinding.makeCurrent(0L);
            } catch (Throwable ignored) {
            }
            try {
                canvasBinding.deleteContext(context);
            } catch (Throwable ignored) {
            }
            context = 0L;
        }
    }

    public final void release() {
        if (canvasBinding != null) {
            if (context != 0L) {
                try {
                    canvasBinding.makeCurrent(0L);
                    canvasBinding.deleteContext(context);
                } catch (Throwable ignored) {
                }
                context = 0L;
            }
            try {
                canvasBinding.dispose();
            } catch (Throwable ignored) {
            }
            canvasBinding = null;
        }
        caps = null;
        if (this.a != null) {
            b.remove(this.a);
            this.a = null;
        }
    }

    // Pbuffers: report unavailable; the client falls back to FBOs.
    public final boolean arePbuffersAvailable() {
        return false;
    }

    public final long createPbuffer(int width, int height) {
        return 0L;
    }

    public final void setPbuffer(long pbuffer) {
    }

    public final void releasePbuffer(long pbuffer) {
    }

    // ------------------------------------------------------------------
    // macOS CALayer frame correction: lwjgl3-awt 0.2.3 creates its
    // NSOpenGLView/layer with frame {0,0,w,h} and never repositions it, so a
    // canvas smaller than the window renders at the bottom-left (CALayer
    // origin). We call its own private setOpenglViewLayersFrame (libffi
    // CGRect call) with the correctly flipped rectangle, via reflection.
    // ------------------------------------------------------------------

    private static java.lang.reflect.Field viewField;
    private static java.lang.reflect.Field widthField;
    private static java.lang.reflect.Field heightField;
    private static boolean layerFixBroken;

    /**
     * lwjgl3-awt only applies the Retina backing-size override
     * (kCGLCPSurfaceBackingSize = canvas * scale) inside makeCurrent's
     * size-changed branch, and create() pre-caches the startup size - so on
     * a fresh launch the 2x scale is never applied and the surface renders
     * at half size on Retina displays. Invalidate its cached size so the
     * next makeCurrent recomputes the backing size with the display scale.
     */
    private void invalidateCachedSize() {
        if (!(canvasBinding instanceof PlatformMacOSXGLCanvas)) return;
        try {
            if (widthField == null) {
                widthField = PlatformMacOSXGLCanvas.class.getDeclaredField("width");
                widthField.setAccessible(true);
                heightField = PlatformMacOSXGLCanvas.class.getDeclaredField("height");
                heightField.setAccessible(true);
            }
            widthField.setInt(canvasBinding, -1);
            heightField.setInt(canvasBinding, -1);
        } catch (Throwable ignored) {
        }
    }
    private int windowSyncCountdown;
    private volatile boolean windowSyncPending;

    /**
     * After GL-context creation, macOS stops delivering NSWindow resize
     * notifications to AWT (observed on Zulu 8 + modern macOS with
     * lwjgl3-awt's layer graft): the user resizes the window, the NSWindow
     * grows, but the JFrame's model stays stale, so neither the engine nor
     * the layer ever adapt. Java->native resizes still work, so we act as
     * the missing bridge: read the real NSWindow content size via ObjC KVC
     * (thread-safe) and, when it disagrees with AWT's model, push the true
     * size back through win.setSize() on the EDT.
     */
    private void syncWindowFromNative(final java.awt.Window win) {
        if (layerFixBroken || windowSyncPending || !(canvasBinding instanceof PlatformMacOSXGLCanvas)) return;
        try {
            if (viewField == null) return; // fixLayerFrame initializes it
            long view = viewField.getLong(canvasBinding);
            if (view == 0L) return;
            long msgSend = org.lwjgl.system.macosx.ObjCRuntime.getLibrary().getFunctionAddress("objc_msgSend");
            long nsWindow = org.lwjgl.system.JNI.invokePPP(view,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("window"), msgSend);
            if (nsWindow == 0L) return;
            long contentView = org.lwjgl.system.JNI.invokePPP(nsWindow,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("contentView"), msgSend);
            if (contentView == 0L) return;
            // NSView.frame via KVC -> NSValue -> getValue: (all pointer calls)
            ByteBuffer key = MemoryUtil.memASCII("frame");
            ByteBuffer out = MemoryUtil.memAlloc(32);
            try {
                long nsStringClass = org.lwjgl.system.macosx.ObjCRuntime.objc_getClass("NSString");
                long nsKey = org.lwjgl.system.JNI.invokePPPP(nsStringClass,
                    org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("stringWithUTF8String:"),
                    MemoryUtil.memAddress(key), msgSend);
                long value = org.lwjgl.system.JNI.invokePPPP(contentView,
                    org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("valueForKey:"), nsKey, msgSend);
                if (value == 0L) return;
                org.lwjgl.system.JNI.invokePPPV(value,
                    org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("getValue:"),
                    MemoryUtil.memAddress(out), msgSend);
                final int realW = (int) Math.round(out.getDouble(16));
                final int realH = (int) Math.round(out.getDouble(24));
                if (realW <= 0 || realH <= 0) return;
                java.awt.Insets insets = win.getInsets();
                int modelW = win.getWidth() - insets.left - insets.right;
                int modelH = win.getHeight() - insets.top - insets.bottom;
                if (Math.abs(realW - modelW) > 2 || Math.abs(realH - modelH) > 2) {
                    if (DEBUG) System.err.println("[jaggl] window model stale: AWT " + modelW + "x" + modelH
                        + " vs native " + realW + "x" + realH + " - resyncing");
                    final int outerW = realW + insets.left + insets.right;
                    final int outerH = realH + insets.top + insets.bottom;
                    windowSyncPending = true;
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            try {
                                win.setSize(outerW, outerH);
                                win.validate();
                            } finally {
                                windowSyncPending = false;
                            }
                        }
                    });
                }
            } finally {
                MemoryUtil.memFree(key);
                MemoryUtil.memFree(out);
            }
        } catch (Throwable t) {
            if (DEBUG) System.err.println("[jaggl] window sync skipped: " + t);
        }
    }

    /**
     * Display scale (2.0 on Retina). Java 8's AWT reports an identity
     * transform (HiDPI transforms are a Java 9+ API), but the Mac JDK 8
     * exposes the real value via sun.awt.CGraphicsDevice.getScaleFactor().
     */
    private double displayScale() {
        try {
            java.awt.GraphicsDevice device = canvas.getGraphicsConfiguration().getDevice();
            Object factor = device.getClass().getMethod("getScaleFactor").invoke(device);
            if (factor instanceof Number) {
                double f = ((Number) factor).doubleValue();
                if (f > 0) return f;
            }
        } catch (Throwable ignored) {
        }
        double t = canvas.getGraphicsConfiguration().getDefaultTransform().getScaleX();
        return t > 0 ? t : 1.0;
    }

    private void fixLayerFrame(java.awt.Window win) {
        if (layerFixBroken || !(canvasBinding instanceof PlatformMacOSXGLCanvas)) return;
        try {
            if (viewField == null) {
                try {
                    viewField = PlatformMacOSXGLCanvas.class.getDeclaredField("view");
                    viewField.setAccessible(true);
                } catch (Throwable t) {
                    layerFixBroken = true; // internals differ; retrying is pointless
                    System.err.println("[jaggl] layer frame fix unavailable: " + t);
                    return;
                }
            }
            long view = viewField.getLong(canvasBinding);
            if (view == 0L) return;
            if (!canvas.isShowing() || !win.isShowing()) return; // transient during (re)layout
            java.awt.Point canvasOnScreen = canvas.getLocationOnScreen();
            java.awt.Point windowOnScreen = win.getLocationOnScreen();
            java.awt.Insets insets = win.getInsets();
            int contentH = win.getHeight() - insets.top - insets.bottom;
            double xPt = canvasOnScreen.x - windowOnScreen.x - insets.left;
            double yTopPt = canvasOnScreen.y - windowOnScreen.y - insets.top;
            // AWT's JAWT root layer coordinate space is in PIXELS on Retina
            // displays (2x the window's point size), while lwjgl3-awt sets its
            // layer frame in points - the "content at half size in the
            // bottom-left" bug. Convert everything to pixel units and flip Y
            // in pixel space.
            // Mutate ONLY CALayers (thread-safe inside a CATransaction);
            // NSView geometry calls off the AppKit main thread abort.
            // The layer registered with JAWT is the INTERMEDIATE layer =
            // superlayer of the NSOpenGLView's own (autoresizing) sublayer,
            // and ITS superlayer is AWT's root layer for the window.
            long msgSend = org.lwjgl.system.macosx.ObjCRuntime.getLibrary().getFunctionAddress("objc_msgSend");
            long subLayer = org.lwjgl.system.JNI.invokePPP(view,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("layer"), msgSend);
            if (subLayer == 0L) return;
            long interLayer = org.lwjgl.system.JNI.invokePPP(subLayer,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("superlayer"), msgSend);
            // Self-calibrate the scale: the AWT root layer's bounds are in
            // backing units; dividing by the window's point size yields the
            // Retina scale regardless of what this JVM's AWT reports.
            double scale = displayScale();
            long rootLayer = interLayer != 0L ? org.lwjgl.system.JNI.invokePPP(interLayer,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("superlayer"), msgSend) : 0L;
            double[] rootBounds = new double[4];
            if (rootLayer != 0L && readLayerRect(rootLayer, msgSend, "bounds", rootBounds)
                && rootBounds[3] > 0 && contentH > 0) {
                double derived = rootBounds[3] / contentH;
                if (derived >= 0.5 && derived <= 4.0) scale = derived;
            }
            double w = canvas.getWidth() * scale;
            double h = canvas.getHeight() * scale;
            double x = xPt * scale;
            double y = contentH * scale - yTopPt * scale - h;
            if (interLayer != 0L) {
                setLayerFrame(interLayer, msgSend, x, y, w, h);
                setLayerFrame(subLayer, msgSend, 0, 0, w, h);
            } else {
                setLayerFrame(subLayer, msgSend, x, y, w, h);
            }
            if (DEBUG) System.err.println("[jaggl] layer frame -> px(" + x + "," + y + " "
                + w + "x" + h + ") scale=" + scale + " rootH=" + rootBounds[3] + " contentH=" + contentH);
        } catch (Throwable t) {
            // Transient failures (component mid-layout etc.) - retry next frame.
            if (DEBUG) System.err.println("[jaggl] layer frame fix skipped: " + t);
        }
    }

    /** Read a CGRect-valued property (e.g. "bounds") of an ObjC object via KVC. */
    private static boolean readLayerRect(long obj, long msgSend, String property, double[] out) {
        ByteBuffer key = MemoryUtil.memASCII(property);
        ByteBuffer buf = MemoryUtil.memAlloc(32);
        try {
            long nsStringClass = org.lwjgl.system.macosx.ObjCRuntime.objc_getClass("NSString");
            long nsKey = org.lwjgl.system.JNI.invokePPPP(nsStringClass,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("stringWithUTF8String:"),
                MemoryUtil.memAddress(key), msgSend);
            long value = org.lwjgl.system.JNI.invokePPPP(obj,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("valueForKey:"), nsKey, msgSend);
            if (value == 0L) return false;
            org.lwjgl.system.JNI.invokePPPV(value,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("getValue:"),
                MemoryUtil.memAddress(buf), msgSend);
            for (int i = 0; i < 4; i++) out[i] = buf.getDouble(i * 8);
            return true;
        } finally {
            MemoryUtil.memFree(key);
            MemoryUtil.memFree(buf);
        }
    }

    private static void setLayerFrame(long layer, long msgSend, double x, double y, double w, double h) {
        ByteBuffer rect = MemoryUtil.memAlloc(32);
        ByteBuffer type = MemoryUtil.memASCII("{CGRect={CGPoint=dd}{CGSize=dd}}");
        ByteBuffer key = MemoryUtil.memASCII("frame");
        try {
            rect.putDouble(0, x).putDouble(8, y).putDouble(16, w).putDouble(24, h);
            long nsValueClass = org.lwjgl.system.macosx.ObjCRuntime.objc_getClass("NSValue");
            long nsStringClass = org.lwjgl.system.macosx.ObjCRuntime.objc_getClass("NSString");
            long caTransaction = org.lwjgl.system.macosx.ObjCRuntime.objc_getClass("CATransaction");
            long value = org.lwjgl.system.JNI.invokePPPPP(nsValueClass,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("valueWithBytes:objCType:"),
                MemoryUtil.memAddress(rect), MemoryUtil.memAddress(type), msgSend);
            long nsKey = org.lwjgl.system.JNI.invokePPPP(nsStringClass,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("stringWithUTF8String:"),
                MemoryUtil.memAddress(key), msgSend);
            if (value == 0L || nsKey == 0L) return;
            org.lwjgl.system.JNI.invokePPP(caTransaction,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("begin"), msgSend);
            org.lwjgl.system.JNI.invokePPPPV(layer,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("setValue:forKey:"),
                value, nsKey, msgSend);
            org.lwjgl.system.JNI.invokePPP(caTransaction,
                org.lwjgl.system.macosx.ObjCRuntime.sel_getUid("commit"), msgSend);
        } finally {
            MemoryUtil.memFree(rect);
            MemoryUtil.memFree(type);
            MemoryUtil.memFree(key);
        }
    }

    // ------------------------------------------------------------------
    // DEBUG pointer validation: catch stale/garbage client-side pointers
    // before the GL driver crashes on them.
    // ------------------------------------------------------------------

    private static final long[] rangeBase = new long[32];
    private static final long[] rangeEnd = new long[32];
    private static int rangeCount;
    private static int boundArrayBuffer;
    private static int boundElementBuffer;
    private static long mappedArrayAddr;
    private static long mappedElementAddr;
    private static final java.util.HashMap vboSize = new java.util.HashMap(); // buffer id -> data store size

    /** Called by jaclib.memory.heap.NativeHeap to register its arena. */
    public static synchronized void registerRange(long base, long size) {
        if (rangeCount < rangeBase.length) {
            rangeBase[rangeCount] = base;
            rangeEnd[rangeCount] = base + size;
            rangeCount++;
        }
    }

    private static void checkPtr(String fn, int bindTarget, long ptr) {
        if (!DEBUG || ptr == 0L) return;
        int bound = bindTarget == 34963 ? boundElementBuffer : boundArrayBuffer;
        if (bound != 0) return; // VBO bound: ptr is an offset
        for (int i = 0; i < rangeCount; i++) {
            if (ptr >= rangeBase[i] && ptr < rangeEnd[i]) return;
        }
        long mapped = bindTarget == 34963 ? mappedElementAddr : mappedArrayAddr;
        if (mapped != 0L && ptr >= mapped && ptr < mapped + (32L << 20)) return;
        System.err.println("[jaggl] SUSPECT client pointer in " + fn + ": 0x" + Long.toHexString(ptr)
            + " (arrayBuf=" + boundArrayBuffer + " elemBuf=" + boundElementBuffer + ")");
        new Exception("stack").printStackTrace();
    }

    private static void trace(String msg) {
        if (DEBUG) System.err.println("[gltrace] " + msg);
    }

    private static int texLogBudget = 60;
    private static int activeUnit = 0;
    private static final int[] boundTex = new int[4];
    private static final boolean[] texEnabled = new boolean[4];
    private static long boundProgram = 0;
    private static int lastTexPtrBuf, lastTexPtrOff, lastTexPtrStride;
    private static int uvProbeBudget = 16;

    private static void texCheck(String call) {
        if (!DEBUG) return;
        int err = org.lwjgl.opengl.GL11.glGetError();
        if (err != 0) System.err.println("[jaggl] GL ERROR 0x" + Integer.toHexString(err) + " after " + call);
        else if (texLogBudget > 0) {
            texLogBudget--;
            System.err.println("[jaggl] " + call);
        }
    }

    // ------------------------------------------------------------------
    // Array/buffer marshalling helpers
    // ------------------------------------------------------------------

    private static float[] fin(float[] a, int off) {
        return off == 0 ? a : Arrays.copyOfRange(a, off, a.length);
    }

    private static int[] iin(int[] a, int off) {
        return off == 0 ? a : Arrays.copyOfRange(a, off, a.length);
    }

    private static int[] islice(int[] a, int off, int n) {
        return (off == 0 && a.length == n) ? a : Arrays.copyOfRange(a, off, off + n);
    }

    private static float[] fslice(float[] a, int off, int n) {
        int end = Math.min(off + n, a.length);
        return (off == 0 && a.length == end) ? a : Arrays.copyOfRange(a, off, end);
    }

    private static ByteBuffer wrap(byte[] a, int off, int len) {
        ByteBuffer buf = MemoryUtil.memAlloc(len);
        buf.put(a, off, len);
        buf.flip();
        return buf;
    }

    private static ByteBuffer wrapToEnd(byte[] a, int off) {
        return wrap(a, off, a.length - off);
    }

    // ------------------------------------------------------------------
    // GL 1.x core
    // ------------------------------------------------------------------

    public static final void glAlphaFunc(int func, float ref) { org.lwjgl.opengl.GL11.glAlphaFunc(func, ref); }
    public static final void glBegin(int mode) { org.lwjgl.opengl.GL11.glBegin(mode); }
    public static final void glBindTexture(int target, int texture) { if (target == 3553) boundTex[activeUnit] = texture; org.lwjgl.opengl.GL11.glBindTexture(target, texture); }
    public static final void glBlendFunc(int sfactor, int dfactor) { org.lwjgl.opengl.GL11.glBlendFunc(sfactor, dfactor); }
    public static final void glCallList(int list) { org.lwjgl.opengl.GL11.glCallList(list); }
    public static final void glClear(int mask) { org.lwjgl.opengl.GL11.glClear(mask); }
    public static final void glClearColor(float r, float g, float b, float a) { org.lwjgl.opengl.GL11.glClearColor(r, g, b, a); }
    public static final void glClearDepth(float depth) { org.lwjgl.opengl.GL11.glClearDepth(depth); }
    public static final void glColor3f(float r, float g, float b) { org.lwjgl.opengl.GL11.glColor3f(r, g, b); }
    public static final void glColor3ub(byte r, byte g, byte b) { org.lwjgl.opengl.GL11.glColor3ub(r, g, b); }
    public static final void glColor4f(float r, float g, float b, float a) { org.lwjgl.opengl.GL11.glColor4f(r, g, b, a); }
    public static final void glColor4ub(byte r, byte g, byte b, byte a) { org.lwjgl.opengl.GL11.glColor4ub(r, g, b, a); }
    public static final void glColorMask(boolean r, boolean g, boolean b, boolean a) { org.lwjgl.opengl.GL11.glColorMask(r, g, b, a); }
    public static final void glColorMaterial(int face, int mode) { org.lwjgl.opengl.GL11.glColorMaterial(face, mode); }
    public static final void glColorPointer(int size, int type, int stride, long pointer) { checkPtr("glColorPointer", 34962, pointer); trace("colorPtr size=" + size + " type=" + type + " stride=" + stride + " ptr=0x" + Long.toHexString(pointer) + " arrayBuf=" + boundArrayBuffer); org.lwjgl.opengl.GL11.glColorPointer(size, type, stride, pointer); }
    public static final void glCopyPixels(int x, int y, int w, int h, int type) { org.lwjgl.opengl.GL11.glCopyPixels(x, y, w, h, type); }
    public static final void glCopyTexImage2D(int target, int level, int internalformat, int x, int y, int w, int h, int border) { org.lwjgl.opengl.GL11.glCopyTexImage2D(target, level, internalformat, x, y, w, h, border); }
    public static final void glCopyTexSubImage2D(int target, int level, int xoff, int yoff, int x, int y, int w, int h) { org.lwjgl.opengl.GL11.glCopyTexSubImage2D(target, level, xoff, yoff, x, y, w, h); }
    public static final void glCopyTexSubImage3D(int target, int level, int xoff, int yoff, int zoff, int x, int y, int w, int h) { org.lwjgl.opengl.GL12.glCopyTexSubImage3D(target, level, xoff, yoff, zoff, x, y, w, h); }
    public static final void glCullFace(int mode) { org.lwjgl.opengl.GL11.glCullFace(mode); }
    public static final void glDeleteLists(int list, int range) { org.lwjgl.opengl.GL11.glDeleteLists(list, range); }
    public static final void glDeleteTextures(int n, int[] textures, int off) { org.lwjgl.opengl.GL11.glDeleteTextures(islice(textures, off, n)); }
    public static final void glDepthFunc(int func) { org.lwjgl.opengl.GL11.glDepthFunc(func); }
    public static final void glDepthMask(boolean flag) { org.lwjgl.opengl.GL11.glDepthMask(flag); }
    public static final void glDisable(int cap) { if (cap == 3553) texEnabled[activeUnit] = false; org.lwjgl.opengl.GL11.glDisable(cap); }
    public static final void glDisableClientState(int cap) { trace("disableCS " + cap); org.lwjgl.opengl.GL11.glDisableClientState(cap); }
    public static final void glDrawArrays(int mode, int first, int count) { trace("drawArrays mode=" + mode + " first=" + first + " count=" + count + " arrayBuf=" + boundArrayBuffer); org.lwjgl.opengl.GL11.glDrawArrays(mode, first, count); }
    public static final void glDrawBuffer(int buf) { org.lwjgl.opengl.GL11.glDrawBuffer(buf); }
    public static final void glDrawElements(int mode, int count, int type, long indices) {
        checkPtr("glDrawElements", 34963, indices);
        if (DEBUG && uvProbeBudget > 0 && texEnabled[0] && boundTex[0] > 300 && lastTexPtrBuf != 0) {
            uvProbeBudget--;
            float[] uv = new float[4];
            int prev = boundArrayBuffer;
            org.lwjgl.opengl.ARBVertexBufferObject.glBindBufferARB(34962, lastTexPtrBuf);
            org.lwjgl.opengl.ARBVertexBufferObject.glGetBufferSubDataARB(34962, lastTexPtrOff, java.nio.FloatBuffer.wrap(uv).hasArray() ? uv : uv);
            float[] uv2 = new float[2];
            org.lwjgl.opengl.ARBVertexBufferObject.glGetBufferSubDataARB(34962, lastTexPtrOff + lastTexPtrStride, uv2);
            org.lwjgl.opengl.ARBVertexBufferObject.glBindBufferARB(34962, prev);
            System.err.println("[jaggl] UV probe buf=" + lastTexPtrBuf + " off=" + lastTexPtrOff + " stride=" + lastTexPtrStride
                + " v0=(" + uv[0] + "," + uv[1] + ") v1=(" + uv2[0] + "," + uv2[1] + ") tex=" + boundTex[0]);
        }
        trace("drawElements count=" + count + " arrayBuf=" + boundArrayBuffer + " elemBuf=" + boundElementBuffer + " tex0=" + boundTex[0] + (texEnabled[0] ? "on" : "OFF") + " tex1=" + boundTex[1] + (texEnabled[1] ? "on" : "OFF") + " prog=" + boundProgram);
        // Apple's GL-on-Metal driver hard-crashes when a draw spans more index
        // bytes than the bound element VBO holds (2011-era drivers read
        // garbage silently, and the engine relies on that). Clamp the draw.
        if (boundElementBuffer != 0) {
            Integer size = (Integer) vboSize.get(Integer.valueOf(boundElementBuffer));
            if (size != null) {
                int typeSize = type == 5125 ? 4 : type == 5123 ? 2 : 1;
                long avail = size.intValue() - indices;
                if (avail < 0L) avail = 0L;
                int maxCount = (int) (avail / typeSize);
                if (count > maxCount) {
                    if (DEBUG) System.err.println("[jaggl] OVERDRAW glDrawElements count=" + count
                        + " offset=" + indices + " type=" + type
                        + " but element VBO " + boundElementBuffer + " holds " + size + " bytes; clamping");
                    count = maxCount;
                }
            }
        }
        org.lwjgl.opengl.GL11.glDrawElements(mode, count, type, indices);
    }
    public static final void glDrawPixelsi(int w, int h, int format, int type, int[] pixels, int off) { org.lwjgl.opengl.GL11.glDrawPixels(w, h, format, type, iin(pixels, off)); }
    public static final void glDrawPixelsub(int w, int h, int format, int type, byte[] pixels, int off) {
        if (pixels == null) return;
        ByteBuffer buf = wrapToEnd(pixels, off);
        try { org.lwjgl.opengl.GL11.glDrawPixels(w, h, format, type, buf); } finally { MemoryUtil.memFree(buf); }
    }
    public static final void glEnable(int cap) { if (cap == 3553) texEnabled[activeUnit] = true; org.lwjgl.opengl.GL11.glEnable(cap); }
    public static final void glEnableClientState(int cap) { trace("enableCS " + cap); org.lwjgl.opengl.GL11.glEnableClientState(cap); }
    public static final void glEnd() { org.lwjgl.opengl.GL11.glEnd(); }
    public static final void glEndList() { org.lwjgl.opengl.GL11.glEndList(); }
    public static final void glFinish() {
        // The engine calls glFinish every frame for pacing. On Apple's
        // Metal-backed GLEngine that is a full pipeline drain costing many
        // milliseconds; a flush gives the same pacing without the stall.
        if (Platform.get() == Platform.MACOSX) org.lwjgl.opengl.GL11.glFlush();
        else org.lwjgl.opengl.GL11.glFinish();
    }
    public static final void glFlush() { org.lwjgl.opengl.GL11.glFlush(); }
    public static final void glFogf(int pname, float param) { org.lwjgl.opengl.GL11.glFogf(pname, param); }
    public static final void glFogfv(int pname, float[] params, int off) { org.lwjgl.opengl.GL11.glFogfv(pname, fin(params, off)); }
    public static final void glFogi(int pname, int param) { org.lwjgl.opengl.GL11.glFogi(pname, param); }
    public static final void glFrustum(double l, double r, double b, double t, double n, double f) { org.lwjgl.opengl.GL11.glFrustum(l, r, b, t, n, f); }
    public static final void glGenTextures(int n, int[] textures, int off) {
        int[] tmp = new int[n];
        org.lwjgl.opengl.GL11.glGenTextures(tmp);
        System.arraycopy(tmp, 0, textures, off, n);
    }
    public static final int glGenLists(int range) { return org.lwjgl.opengl.GL11.glGenLists(range); }
    public static final int glGetError() { return org.lwjgl.opengl.GL11.glGetError(); }
    public static final void glGetFloatv(int pname, float[] params, int off) {
        if (off == 0) { org.lwjgl.opengl.GL11.glGetFloatv(pname, params); return; }
        float[] tmp = new float[params.length - off];
        org.lwjgl.opengl.GL11.glGetFloatv(pname, tmp);
        System.arraycopy(tmp, 0, params, off, tmp.length);
    }
    public static final void glGetIntegerv(int pname, int[] params, int off) {
        if (off == 0) { org.lwjgl.opengl.GL11.glGetIntegerv(pname, params); return; }
        int[] tmp = new int[params.length - off];
        org.lwjgl.opengl.GL11.glGetIntegerv(pname, tmp);
        System.arraycopy(tmp, 0, params, off, tmp.length);
    }
    public static final String glGetString(int name) { return org.lwjgl.opengl.GL11.glGetString(name); }
    public static final void glGetTexImagei(int target, int level, int format, int type, int[] pixels, int off) {
        if (off == 0) { org.lwjgl.opengl.GL11.glGetTexImage(target, level, format, type, pixels); return; }
        int[] tmp = new int[pixels.length - off];
        org.lwjgl.opengl.GL11.glGetTexImage(target, level, format, type, tmp);
        System.arraycopy(tmp, 0, pixels, off, tmp.length);
    }
    public static final void glGetTexImageub(int target, int level, int format, int type, byte[] pixels, int off) {
        ByteBuffer buf = MemoryUtil.memAlloc(pixels.length - off + 4096);
        try {
            org.lwjgl.opengl.GL11.glGetTexImage(target, level, format, type, buf);
            buf.get(pixels, off, pixels.length - off);
        } finally {
            MemoryUtil.memFree(buf);
        }
    }
    public static final void glHint(int target, int mode) { org.lwjgl.opengl.GL11.glHint(target, mode); }
    public static final void glLightModelfv(int pname, float[] params, int off) { org.lwjgl.opengl.GL11.glLightModelfv(pname, fin(params, off)); }
    public static final void glLightf(int light, int pname, float param) { org.lwjgl.opengl.GL11.glLightf(light, pname, param); }
    public static final void glLightfv(int light, int pname, float[] params, int off) { org.lwjgl.opengl.GL11.glLightfv(light, pname, fin(params, off)); }
    public static final void glLineWidth(float width) { org.lwjgl.opengl.GL11.glLineWidth(width); }
    public static final void glLoadIdentity() { org.lwjgl.opengl.GL11.glLoadIdentity(); }
    public static final void glLoadMatrixf(float[] m, int off) { org.lwjgl.opengl.GL11.glLoadMatrixf(fslice(m, off, 16)); }
    public static final void glMaterialfv(int face, int pname, float[] params, int off) { org.lwjgl.opengl.GL11.glMaterialfv(face, pname, fin(params, off)); }
    public static final void glMatrixMode(int mode) { org.lwjgl.opengl.GL11.glMatrixMode(mode); }
    public static final void glMultMatrixf(float[] m, int off) { org.lwjgl.opengl.GL11.glMultMatrixf(fslice(m, off, 16)); }
    public static final void glNewList(int list, int mode) { org.lwjgl.opengl.GL11.glNewList(list, mode); }
    public static final void glNormal3f(float nx, float ny, float nz) { org.lwjgl.opengl.GL11.glNormal3f(nx, ny, nz); }
    public static final void glNormalPointer(int type, int stride, long pointer) { checkPtr("glNormalPointer", 34962, pointer); trace("normalPtr type=" + type + " stride=" + stride + " ptr=0x" + Long.toHexString(pointer) + " arrayBuf=" + boundArrayBuffer); org.lwjgl.opengl.GL11.glNormalPointer(type, stride, pointer); }
    public static final void glOrtho(double l, double r, double b, double t, double n, double f) { org.lwjgl.opengl.GL11.glOrtho(l, r, b, t, n, f); }
    public static final void glPixelStorei(int pname, int param) { org.lwjgl.opengl.GL11.glPixelStorei(pname, param); }
    public static final void glPixelTransferf(int pname, float param) { org.lwjgl.opengl.GL11.glPixelTransferf(pname, param); }
    public static final void glPixelZoom(float xfactor, float yfactor) { org.lwjgl.opengl.GL11.glPixelZoom(xfactor, yfactor); }
    public static final void glPointSize(float size) { org.lwjgl.opengl.GL11.glPointSize(size); }
    public static final void glPolygonMode(int face, int mode) { org.lwjgl.opengl.GL11.glPolygonMode(face, mode); }
    public static final void glPopAttrib() { org.lwjgl.opengl.GL11.glPopAttrib(); }
    public static final void glPopMatrix() { org.lwjgl.opengl.GL11.glPopMatrix(); }
    public static final void glPushAttrib(int mask) { org.lwjgl.opengl.GL11.glPushAttrib(mask); }
    public static final void glPushMatrix() { org.lwjgl.opengl.GL11.glPushMatrix(); }
    public static final void glRasterPos2i(int x, int y) { org.lwjgl.opengl.GL11.glRasterPos2i(x, y); }
    public static final void glReadBuffer(int src) { org.lwjgl.opengl.GL11.glReadBuffer(src); }
    public static final void glReadPixelsi(int x, int y, int w, int h, int format, int type, int[] pixels, int off) {
        if (off == 0) { org.lwjgl.opengl.GL11.glReadPixels(x, y, w, h, format, type, pixels); return; }
        int[] tmp = new int[pixels.length - off];
        org.lwjgl.opengl.GL11.glReadPixels(x, y, w, h, format, type, tmp);
        System.arraycopy(tmp, 0, pixels, off, tmp.length);
    }
    public static final void glReadPixelsub(int x, int y, int w, int h, int format, int type, byte[] pixels, int off) {
        // +4096 guard: GL_PACK_ALIGNMENT row padding can make the driver write
        // slightly more than the caller-sized array.
        ByteBuffer buf = MemoryUtil.memAlloc(pixels.length - off + 4096);
        try {
            org.lwjgl.opengl.GL11.glReadPixels(x, y, w, h, format, type, buf);
            buf.get(pixels, off, pixels.length - off);
        } finally {
            MemoryUtil.memFree(buf);
        }
    }
    public static final void glRotatef(float angle, float x, float y, float z) { org.lwjgl.opengl.GL11.glRotatef(angle, x, y, z); }
    public static final void glScalef(float x, float y, float z) { org.lwjgl.opengl.GL11.glScalef(x, y, z); }
    public static final void glScissor(int x, int y, int w, int h) { org.lwjgl.opengl.GL11.glScissor(x, y, w, h); }
    public static final void glShadeModel(int mode) { org.lwjgl.opengl.GL11.glShadeModel(mode); }
    public static final void glStencilFunc(int func, int ref, int mask) { org.lwjgl.opengl.GL11.glStencilFunc(func, ref, mask); }
    public static final void glStencilOp(int fail, int zfail, int zpass) { org.lwjgl.opengl.GL11.glStencilOp(fail, zfail, zpass); }
    public static final void glTexCoord2f(float s, float t) { org.lwjgl.opengl.GL11.glTexCoord2f(s, t); }
    public static final void glTexCoord2i(int s, int t) { org.lwjgl.opengl.GL11.glTexCoord2i(s, t); }
    public static final void glTexCoord3f(float s, float t, float r) { org.lwjgl.opengl.GL11.glTexCoord3f(s, t, r); }
    public static final void glTexCoord3i(int s, int t, int r) { org.lwjgl.opengl.GL11.glTexCoord3i(s, t, r); }
    public static final void glTexCoordPointer(int size, int type, int stride, long pointer) {
        checkPtr("glTexCoordPointer", 34962, pointer);
        lastTexPtrBuf = boundArrayBuffer;
        lastTexPtrOff = (int) pointer;
        lastTexPtrStride = stride;
        org.lwjgl.opengl.GL11.glTexCoordPointer(size, type, stride, pointer);
    }
    public static final void glTexEnvf(int target, int pname, float param) { org.lwjgl.opengl.GL11.glTexEnvf(target, pname, param); }
    public static final void glTexEnvfv(int target, int pname, float[] params, int off) { org.lwjgl.opengl.GL11.glTexEnvfv(target, pname, fin(params, off)); }
    public static final void glTexEnvi(int target, int pname, int param) { org.lwjgl.opengl.GL11.glTexEnvi(target, pname, param); }
    public static final void glTexGenfv(int coord, int pname, float[] params, int off) { org.lwjgl.opengl.GL11.glTexGenfv(coord, pname, fin(params, off)); }
    public static final void glTexGeni(int coord, int pname, int param) { org.lwjgl.opengl.GL11.glTexGeni(coord, pname, param); }
    public static final void glTexImage1Dub(int target, int level, int internalformat, int w, int border, int format, int type, byte[] pixels, int off) {
        if (pixels == null) { org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, w, border, format, type, (ByteBuffer) null); return; }
        ByteBuffer buf = wrapToEnd(pixels, off);
        try { org.lwjgl.opengl.GL11.glTexImage1D(target, level, internalformat, w, border, format, type, buf); } finally { MemoryUtil.memFree(buf); }
    }
    public static final void glTexImage2Df(int target, int level, int internalformat, int w, int h, int border, int format, int type, float[] pixels, int off) {
        if (pixels == null) { org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, w, h, border, format, type, (ByteBuffer) null); return; }
        org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, w, h, border, format, type, fin(pixels, off));
    }
    public static final void glTexImage2Di(int target, int level, int internalformat, int w, int h, int border, int format, int type, int[] pixels, int off) {
        if (pixels == null) org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, w, h, border, format, type, (ByteBuffer) null);
        else org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, w, h, border, format, type, iin(pixels, off));
        texCheck("texImage2Di lvl=" + level + " ifmt=" + internalformat + " " + w + "x" + h + " fmt=" + format + " type=" + type + (pixels == null ? " null" : ""));
    }
    public static final void glTexImage2Dub(int target, int level, int internalformat, int w, int h, int border, int format, int type, byte[] pixels, int off) {
        if (pixels == null) org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, w, h, border, format, type, (ByteBuffer) null);
        else {
            ByteBuffer buf = wrapToEnd(pixels, off);
            try { org.lwjgl.opengl.GL11.glTexImage2D(target, level, internalformat, w, h, border, format, type, buf); } finally { MemoryUtil.memFree(buf); }
        }
        if (DEBUG && pixels != null && level == 0 && w >= 64) {
            int min = 255, max = 0;
            long sum = 0;
            int n = Math.min(pixels.length - off, w * h * 2);
            for (int i = 0; i < n; i += 2) { // luminance channel of LA pairs
                int v = pixels[off + i] & 0xff;
                if (v < min) min = v;
                if (v > max) max = v;
                sum += v;
            }
            texCheck("texImage2Dub lvl=0 ifmt=" + internalformat + " " + w + "x" + h
                + " lum min=" + min + " max=" + max + " avg=" + (n > 0 ? sum * 2 / n : 0));
        } else {
            texCheck("texImage2Dub lvl=" + level + " ifmt=" + internalformat + " " + w + "x" + h + " fmt=" + format + " type=" + type + (pixels == null ? " null" : ""));
        }
    }
    public static final void glTexImage3Dub(int target, int level, int internalformat, int w, int h, int d, int border, int format, int type, byte[] pixels, int off) {
        if (pixels == null) org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, w, h, d, border, format, type, (ByteBuffer) null);
        else {
            ByteBuffer buf = wrapToEnd(pixels, off);
            try { org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalformat, w, h, d, border, format, type, buf); } finally { MemoryUtil.memFree(buf); }
        }
        texCheck("texImage3Dub lvl=" + level + " ifmt=" + internalformat + " " + w + "x" + h + "x" + d + " fmt=" + format + " type=" + type + (pixels == null ? " null" : ""));
    }
    public static final void glTexParameterf(int target, int pname, float param) { org.lwjgl.opengl.GL11.glTexParameterf(target, pname, param); }
    public static final void glTexParameteri(int target, int pname, int param) {
        org.lwjgl.opengl.GL11.glTexParameteri(target, pname, param);
        texCheck("texParameteri target=" + target + " pname=" + pname + " param=" + param);
    }
    public static final void glTexSubImage2Df(int target, int level, int xoff, int yoff, int w, int h, int format, int type, float[] pixels, int off) {
        if (pixels == null) { org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoff, yoff, w, h, format, type, (ByteBuffer) null); return; }
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoff, yoff, w, h, format, type, fin(pixels, off));
    }
    public static final void glTexSubImage2Di(int target, int level, int xoff, int yoff, int w, int h, int format, int type, int[] pixels, int off) {
        if (pixels == null) { org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoff, yoff, w, h, format, type, (ByteBuffer) null); return; }
        org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoff, yoff, w, h, format, type, iin(pixels, off));
    }
    public static final void glTexSubImage2Dub(int target, int level, int xoff, int yoff, int w, int h, int format, int type, byte[] pixels, int off) {
        if (pixels == null) { org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoff, yoff, w, h, format, type, (ByteBuffer) null); return; }
        ByteBuffer buf = wrapToEnd(pixels, off);
        try { org.lwjgl.opengl.GL11.glTexSubImage2D(target, level, xoff, yoff, w, h, format, type, buf); } finally { MemoryUtil.memFree(buf); }
    }
    public static final void glTranslatef(float x, float y, float z) { org.lwjgl.opengl.GL11.glTranslatef(x, y, z); }
    public static final void glVertex2f(float x, float y) { org.lwjgl.opengl.GL11.glVertex2f(x, y); }
    public static final void glVertex2i(int x, int y) { org.lwjgl.opengl.GL11.glVertex2i(x, y); }
    public static final void glVertex3f(float x, float y, float z) { org.lwjgl.opengl.GL11.glVertex3f(x, y, z); }
    public static final void glVertexPointer(int size, int type, int stride, long pointer) { checkPtr("glVertexPointer", 34962, pointer); trace("vertexPtr size=" + size + " type=" + type + " stride=" + stride + " ptr=0x" + Long.toHexString(pointer) + " arrayBuf=" + boundArrayBuffer); org.lwjgl.opengl.GL11.glVertexPointer(size, type, stride, pointer); }
    public static final void glViewport(int x, int y, int w, int h) { org.lwjgl.opengl.GL11.glViewport(x, y, w, h); }

    // ------------------------------------------------------------------
    // GL 1.3 multitexture
    // ------------------------------------------------------------------

    public static final void glActiveTexture(int texture) { int u = texture - 33984; if (u >= 0 && u < 4) activeUnit = u; org.lwjgl.opengl.GL13.glActiveTexture(texture); }
    public static final void glClientActiveTexture(int texture) { org.lwjgl.opengl.GL13.glClientActiveTexture(texture); }
    public static final void glMultiTexCoord2f(int target, float s, float t) { org.lwjgl.opengl.GL13.glMultiTexCoord2f(target, s, t); }
    public static final void glMultiTexCoord2i(int target, int s, int t) { org.lwjgl.opengl.GL13.glMultiTexCoord2i(target, s, t); }
    public static final void glMultiTexCoord3i(int target, int s, int t, int r) { org.lwjgl.opengl.GL13.glMultiTexCoord3i(target, s, t, r); }

    // ------------------------------------------------------------------
    // ARB vertex buffer objects
    // ------------------------------------------------------------------

    public static final void glBindBufferARB(int target, int buffer) {
        if (target == 34962) boundArrayBuffer = buffer;
        else if (target == 34963) boundElementBuffer = buffer;
        trace("bind target=" + target + " buf=" + buffer);
        org.lwjgl.opengl.ARBVertexBufferObject.glBindBufferARB(target, buffer);
    }
    private static void trackVboSize(int target, int size) {
        int bound = target == 34963 ? boundElementBuffer : target == 34962 ? boundArrayBuffer : 0;
        if (bound != 0) vboSize.put(Integer.valueOf(bound), Integer.valueOf(size));
    }
    // Every VBO data store is over-allocated by VBO_PAD bytes: the engine
    // sometimes issues draws whose indices span slightly more vertex data than
    // it uploaded (2011 drivers read adjacent heap garbage and drew a glitched
    // vertex; Apple's Metal-backed GLEngine segfaults in its CPU shadow copy).
    // Sized for driver tail-overreads past the last vertex (a stride or a
    // cacheline) - the crash-level overreads are handled by the arena, map
    // emulation and deferred deletes. Large pads churn the driver allocator:
    // at thousands of streaming uploads/second, 16KB pads cost whole frames.
    private static final int VBO_PAD = 512;

    public static final void glBufferDataARBa(int target, int size, long data, int usage) {
        trackVboSize(target, size + VBO_PAD);
        trace("bufferDataA target=" + target + " size=" + size + " src=0x" + Long.toHexString(data));
        org.lwjgl.opengl.ARBVertexBufferObject.nglBufferDataARB(target, (long) size + VBO_PAD, 0L, usage);
        if (data != 0L && size > 0) org.lwjgl.opengl.ARBVertexBufferObject.nglBufferSubDataARB(target, 0L, size, data);
    }
    public static final void glBufferDataARBub(int target, int size, byte[] data, int off, int usage) {
        trackVboSize(target, size + VBO_PAD);
        if (data == null) { // null = allocate/orphan storage without uploading
            org.lwjgl.opengl.ARBVertexBufferObject.nglBufferDataARB(target, (long) size + VBO_PAD, 0L, usage);
            return;
        }
        ByteBuffer buf = MemoryUtil.memCalloc(1, size + VBO_PAD);
        buf.put(data, off, size);
        buf.clear(); // position 0, limit = size + VBO_PAD: upload the pad too
        try { org.lwjgl.opengl.ARBVertexBufferObject.glBufferDataARB(target, buf, usage); } finally { MemoryUtil.memFree(buf); }
    }
    public static final void glBufferSubDataARBa(int target, int offset, int size, long data) { trace("bufferSubDataA target=" + target + " off=" + offset + " size=" + size + " src=0x" + Long.toHexString(data)); org.lwjgl.opengl.ARBVertexBufferObject.nglBufferSubDataARB(target, offset, size, data); }
    public static final void glBufferSubDataARBub(int target, int offset, int size, byte[] data, int off) {
        if (data == null) return;
        ByteBuffer buf = wrap(data, off, size);
        try { org.lwjgl.opengl.ARBVertexBufferObject.glBufferSubDataARB(target, offset, buf); } finally { MemoryUtil.memFree(buf); }
    }
    // VBO deletion is deferred by two frames: the engine deletes buffers from
    // finalizers, and premature finalization can free a VBO whose id is still
    // latched in the fixed-function vertex-array state for the current frame.
    // Apple's Metal-backed GLEngine really frees the CPU shadow on delete and
    // then segfaults reading latched attributes (fault always at shadow+attr
    // offset). Old drivers kept freed shadows around, hiding this.
    private static final java.util.ArrayList deferredDeletes = new java.util.ArrayList(); // long[]{frame, id}
    private static long frameCount;

    public static final void glDeleteBuffersARB(int n, int[] buffers, int off) {
        synchronized (deferredDeletes) {
            for (int i = 0; i < n; i++) {
                deferredDeletes.add(new long[]{frameCount, buffers[off + i]});
            }
        }
        trace("deleteBuffers n=" + n + " (deferred)");
    }

    static void flushDeferredDeletes() {
        frameCount++;
        int[] ready = null;
        synchronized (deferredDeletes) {
            int count = 0;
            while (count < deferredDeletes.size() && ((long[]) deferredDeletes.get(count))[0] <= frameCount - 2) count++;
            if (count == 0) return;
            ready = new int[count];
            for (int i = 0; i < count; i++) ready[i] = (int) ((long[]) deferredDeletes.get(i))[1];
            deferredDeletes.subList(0, count).clear();
        }
        for (int i = 0; i < ready.length; i++) {
            int id = ready[i];
            vboSize.remove(Integer.valueOf(id));
            if (id == boundArrayBuffer) boundArrayBuffer = 0;
            if (id == boundElementBuffer) boundElementBuffer = 0;
        }
        org.lwjgl.opengl.ARBVertexBufferObject.glDeleteBuffersARB(ready);
    }
    public static final void glGenBuffersARB(int n, int[] buffers, int off) {
        int[] tmp = new int[n];
        org.lwjgl.opengl.ARBVertexBufferObject.glGenBuffersARB(tmp);
        System.arraycopy(tmp, 0, buffers, off, n);
    }
    // glMapBufferARB is emulated with a permanent client-side scratch buffer
    // instead of a real driver mapping: the engine occasionally leaves stale
    // pointers to map windows around (2011 drivers kept them mapped lazily so
    // it worked; Apple's Metal-backed GLEngine unmaps for real and crashes in
    // gleRunVertexSubmitImmediate). Our scratch is never freed, so any stale
    // read stays on valid memory; unmap uploads the bytes via BufferSubData.
    private static final long[] mapScratchAddr = new long[2]; // 0=ARRAY, 1=ELEMENT
    private static final int[] mapScratchSize = new int[2];
    private static final int[] mappedVbo = new int[2];

    private static int mapSlot(int target) {
        return target == 34963 ? 1 : 0;
    }

    public static final long glMapBufferARB(int target, int access) {
        int slot = mapSlot(target);
        int bound = slot == 1 ? boundElementBuffer : boundArrayBuffer;
        Integer sizeObj = (Integer) vboSize.get(Integer.valueOf(bound));
        int size = sizeObj == null ? 0 : sizeObj.intValue();
        if (bound == 0 || size <= 0) return 0L;
        if (mapScratchSize[slot] < size) {
            int grown = Math.max(size, Math.max(mapScratchSize[slot] * 2, 1 << 20));
            long addr = MemoryUtil.nmemCalloc(1, (long) grown + 64);
            if (addr == 0L) return 0L;
            // The previous scratch is deliberately leaked: the driver may still
            // dereference stale pointers into it.
            mapScratchAddr[slot] = addr;
            mapScratchSize[slot] = grown;
            registerRange(addr, (long) grown + 64);
            if (DEBUG) System.err.println("[jaggl] map scratch[" + slot + "] " + grown + "B at 0x" + Long.toHexString(addr));
        }
        mappedVbo[slot] = bound;
        if (slot == 1) mappedElementAddr = mapScratchAddr[slot];
        else mappedArrayAddr = mapScratchAddr[slot];
        return mapScratchAddr[slot];
    }

    public static final boolean glUnmapBufferARB(int target) {
        int slot = mapSlot(target);
        int bound = slot == 1 ? boundElementBuffer : boundArrayBuffer;
        if (mappedVbo[slot] != 0 && bound == mappedVbo[slot]) {
            Integer sizeObj = (Integer) vboSize.get(Integer.valueOf(bound));
            int size = sizeObj == null ? 0 : Math.min(sizeObj.intValue(), mapScratchSize[slot]);
            if (size > 0) org.lwjgl.opengl.ARBVertexBufferObject.nglBufferSubDataARB(target, 0, size, mapScratchAddr[slot]);
        }
        mappedVbo[slot] = 0;
        if (slot == 1) mappedElementAddr = 0L;
        else mappedArrayAddr = 0L;
        return true;
    }

    // ------------------------------------------------------------------
    // ARB shader objects (GLSL); jaggl used long handles, LWJGL uses int
    // ------------------------------------------------------------------

    public static final void glAttachObjectARB(long container, long obj) { org.lwjgl.opengl.ARBShaderObjects.glAttachObjectARB((int) container, (int) obj); }
    public static final void glCompileShaderARB(long shader) {
        org.lwjgl.opengl.ARBShaderObjects.glCompileShaderARB((int) shader);
        if (DEBUG) {
            int ok = org.lwjgl.opengl.ARBShaderObjects.glGetObjectParameteriARB((int) shader, 35713); // COMPILE_STATUS
            if (ok == 0) System.err.println("[jaggl] GLSL compile FAILED: "
                + org.lwjgl.opengl.ARBShaderObjects.glGetInfoLogARB((int) shader, 4096));
            else System.err.println("[jaggl] GLSL shader compiled ok");
        }
    }
    public static final long glCreateProgramObjectARB() { return org.lwjgl.opengl.ARBShaderObjects.glCreateProgramObjectARB() & 0xffffffffL; }
    public static final long glCreateShaderObjectARB(int type) { return org.lwjgl.opengl.ARBShaderObjects.glCreateShaderObjectARB(type) & 0xffffffffL; }
    public static final void glDeleteObjectARB(long obj) { org.lwjgl.opengl.ARBShaderObjects.glDeleteObjectARB((int) obj); }
    public static final void glDetachObjectARB(long container, long obj) { org.lwjgl.opengl.ARBShaderObjects.glDetachObjectARB((int) container, (int) obj); }
    public static final void glGetInfoLogARB(long obj, int maxLength, int[] length, int lengthOff, byte[] infoLog, int infoLogOff) {
        ByteBuffer buf = MemoryUtil.memAlloc(maxLength);
        java.nio.IntBuffer len = MemoryUtil.memAllocInt(1);
        try {
            org.lwjgl.opengl.ARBShaderObjects.nglGetInfoLogARB((int) obj, maxLength, MemoryUtil.memAddress(len), MemoryUtil.memAddress(buf));
            int n = len.get(0);
            if (n > 0) buf.limit(Math.min(n, maxLength)).position(0);
            length[lengthOff] = n;
            buf.get(infoLog, infoLogOff, Math.min(n, Math.min(maxLength, infoLog.length - infoLogOff)));
        } finally {
            MemoryUtil.memFree(len);
            MemoryUtil.memFree(buf);
        }
    }
    public static final void glGetObjectParameterivARB(long obj, int pname, int[] params, int off) {
        params[off] = org.lwjgl.opengl.ARBShaderObjects.glGetObjectParameteriARB((int) obj, pname);
    }
    public static final int glGetUniformLocationARB(long program, String name) { return org.lwjgl.opengl.ARBShaderObjects.glGetUniformLocationARB((int) program, name); }
    public static final void glLinkProgramARB(long program) { org.lwjgl.opengl.ARBShaderObjects.glLinkProgramARB((int) program); }
    public static final void glShaderSourceARB(long shader, String source) { org.lwjgl.opengl.ARBShaderObjects.glShaderSourceARB((int) shader, source); }
    public static final void glShaderSourceRawARB(long shader, byte[] source) {
        try {
            org.lwjgl.opengl.ARBShaderObjects.glShaderSourceARB((int) shader, new String(source, "ISO-8859-1"));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    public static final void glUniform1fARB(int location, float v0) { org.lwjgl.opengl.ARBShaderObjects.glUniform1fARB(location, v0); }
    public static final void glUniform1iARB(int location, int v0) { org.lwjgl.opengl.ARBShaderObjects.glUniform1iARB(location, v0); }
    public static final void glUniform2fARB(int location, float v0, float v1) { org.lwjgl.opengl.ARBShaderObjects.glUniform2fARB(location, v0, v1); }
    public static final void glUniform3fARB(int location, float v0, float v1, float v2) { org.lwjgl.opengl.ARBShaderObjects.glUniform3fARB(location, v0, v1, v2); }
    public static final void glUniform4fARB(int location, float v0, float v1, float v2, float v3) { org.lwjgl.opengl.ARBShaderObjects.glUniform4fARB(location, v0, v1, v2, v3); }
    public static final void glUniformMatrix2fvARB(int location, int count, boolean transpose, float[] value, int off) {
        org.lwjgl.opengl.ARBShaderObjects.glUniformMatrix2fvARB(location, transpose, fslice(value, off, count * 4));
    }
    public static final void glUniformMatrix3fvARB(int location, int count, boolean transpose, float[] value, int off) {
        org.lwjgl.opengl.ARBShaderObjects.glUniformMatrix3fvARB(location, transpose, fslice(value, off, count * 9));
    }
    public static final void glUniformMatrix4fvARB(int location, int count, boolean transpose, float[] value, int off) {
        org.lwjgl.opengl.ARBShaderObjects.glUniformMatrix4fvARB(location, transpose, fslice(value, off, count * 16));
    }
    public static final void glUseProgramObjectARB(long program) { boundProgram = program; org.lwjgl.opengl.ARBShaderObjects.glUseProgramObjectARB((int) program); }

    // ------------------------------------------------------------------
    // ARB vertex/fragment programs (assembly shaders)
    // ------------------------------------------------------------------

    public static final void glBindProgramARB(int target, int program) { org.lwjgl.opengl.ARBVertexProgram.glBindProgramARB(target, program); }
    public static final void glDeleteProgramARB(int program) { org.lwjgl.opengl.ARBVertexProgram.glDeleteProgramsARB(new int[]{program}); }
    public static final int glGenProgramARB() { return org.lwjgl.opengl.ARBVertexProgram.glGenProgramsARB(); }
    public static final void glGetProgramivARB(int target, int pname, int[] params, int off) {
        params[off] = org.lwjgl.opengl.ARBVertexProgram.glGetProgramiARB(target, pname);
    }
    public static final void glProgramLocalParameter4fARB(int target, int index, float x, float y, float z, float w) {
        org.lwjgl.opengl.ARBVertexProgram.glProgramLocalParameter4fARB(target, index, x, y, z, w);
    }
    public static final void glProgramLocalParameter4fvARB(int target, int index, float[] params, int off) {
        org.lwjgl.opengl.ARBVertexProgram.glProgramLocalParameter4fvARB(target, index, fslice(params, off, 4));
    }
    public static final void glProgramRawARB(int target, int format, byte[] string) {
        ByteBuffer buf = wrap(string, 0, string.length);
        try {
            org.lwjgl.opengl.ARBVertexProgram.nglProgramStringARB(target, format, string.length, MemoryUtil.memAddress(buf));
        } finally {
            MemoryUtil.memFree(buf);
        }
        if (DEBUG) {
            int err = org.lwjgl.opengl.GL11.glGetError();
            if (err != 0) System.err.println("[jaggl] ARB program FAILED (0x" + Integer.toHexString(err) + ") target=" + target + ": "
                + org.lwjgl.opengl.GL11.glGetString(34932)); // GL_PROGRAM_ERROR_STRING_ARB
            else System.err.println("[jaggl] ARB program ok, target=" + target + " len=" + string.length);
        }
    }
    public static final void glProgramStringARB(int target, int format, String string) {
        try {
            glProgramRawARB(target, format, string.getBytes("ISO-8859-1"));
        } catch (java.io.UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    // ------------------------------------------------------------------
    // ARB draw buffers
    // ------------------------------------------------------------------

    public static final void glDrawBuffersARB(int n, int[] bufs, int off) { org.lwjgl.opengl.ARBDrawBuffers.glDrawBuffersARB(islice(bufs, off, n)); }

    // ------------------------------------------------------------------
    // EXT framebuffer object / blit / multisample
    // ------------------------------------------------------------------

    public static final void glBindFramebufferEXT(int target, int framebuffer) { org.lwjgl.opengl.EXTFramebufferObject.glBindFramebufferEXT(target, framebuffer); }
    public static final void glBindRenderbufferEXT(int target, int renderbuffer) { org.lwjgl.opengl.EXTFramebufferObject.glBindRenderbufferEXT(target, renderbuffer); }
    public static final void glBlitFramebufferEXT(int sx0, int sy0, int sx1, int sy1, int dx0, int dy0, int dx1, int dy1, int mask, int filter) {
        org.lwjgl.opengl.EXTFramebufferBlit.glBlitFramebufferEXT(sx0, sy0, sx1, sy1, dx0, dy0, dx1, dy1, mask, filter);
    }
    public static final int glCheckFramebufferStatusEXT(int target) { return org.lwjgl.opengl.EXTFramebufferObject.glCheckFramebufferStatusEXT(target); }
    public static final void glDeleteFramebuffersEXT(int n, int[] framebuffers, int off) { org.lwjgl.opengl.EXTFramebufferObject.glDeleteFramebuffersEXT(islice(framebuffers, off, n)); }
    public static final void glDeleteRenderbuffersEXT(int n, int[] renderbuffers, int off) { org.lwjgl.opengl.EXTFramebufferObject.glDeleteRenderbuffersEXT(islice(renderbuffers, off, n)); }
    public static final void glFramebufferRenderbufferEXT(int target, int attachment, int renderbuffertarget, int renderbuffer) {
        org.lwjgl.opengl.EXTFramebufferObject.glFramebufferRenderbufferEXT(target, attachment, renderbuffertarget, renderbuffer);
    }
    public static final void glFramebufferTexture2DEXT(int target, int attachment, int textarget, int texture, int level) {
        org.lwjgl.opengl.EXTFramebufferObject.glFramebufferTexture2DEXT(target, attachment, textarget, texture, level);
    }
    public static final void glFramebufferTexture3DEXT(int target, int attachment, int textarget, int texture, int level, int zoffset) {
        org.lwjgl.opengl.EXTFramebufferObject.glFramebufferTexture3DEXT(target, attachment, textarget, texture, level, zoffset);
    }
    public static final void glGenFramebuffersEXT(int n, int[] framebuffers, int off) {
        int[] tmp = new int[n];
        org.lwjgl.opengl.EXTFramebufferObject.glGenFramebuffersEXT(tmp);
        System.arraycopy(tmp, 0, framebuffers, off, n);
    }
    public static final void glGenRenderbuffersEXT(int n, int[] renderbuffers, int off) {
        int[] tmp = new int[n];
        org.lwjgl.opengl.EXTFramebufferObject.glGenRenderbuffersEXT(tmp);
        System.arraycopy(tmp, 0, renderbuffers, off, n);
    }
    public static final void glGenerateMipmapEXT(int target) {
        org.lwjgl.opengl.EXTFramebufferObject.glGenerateMipmapEXT(target);
        texCheck("generateMipmapEXT target=" + target);
    }
    public static final void glRenderbufferStorageEXT(int target, int internalformat, int w, int h) {
        org.lwjgl.opengl.EXTFramebufferObject.glRenderbufferStorageEXT(target, internalformat, w, h);
    }
    public static final void glRenderbufferStorageMultisampleEXT(int target, int samples, int internalformat, int w, int h) {
        org.lwjgl.opengl.EXTFramebufferMultisample.glRenderbufferStorageMultisampleEXT(target, samples, internalformat, w, h);
    }
}
