/* WidgetDump — live open-interface crop dump for visual identification.
 *
 * Captures the software toolkit colour buffer (fallback: AWT Robot with the
 * game window raised). Walks {@link DefinitionSub33#openInterfaces} and writes
 * one PNG crop per visible widget plus a JSONL manifest. Used by the Component
 * Lab widgets gallery.
 *
 * Prefer the toolkit buffer over Robot: Robot grabs the composited screen, so
 * an IDE covering the canvas (e.g. Cursor) ends up in every crop.
 *
 * Enable:  -Dvoid.widget.dump=<dir>  OR  env VOID_WIDGET_DUMP=<dir>
 * Trigger: create an empty file <dir>/REQUEST  (deleted when the dump starts)
 *
 * Desktop-only — excluded from Android/iOS source sync (needs java.awt.Robot).
 * JoystickAlias.clientTick invokes {@link #poll} via reflection so mobile builds
 * do not need this class on the classpath.
 */
import java.awt.Canvas;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

final class WidgetDump {
    private static final boolean ENABLED = computeEnabled();
    private static final File DIR = computeDir();
    /** Skip giant full-screen layers; keep orbs / icons / panels. */
    private static final int MAX_EDGE = 400;
    private static final int MAX_WIDGETS = 600;

    static {
        if (ENABLED) {
            System.out.println("void-osrs widget-dump armed dir=" + DIR.getAbsolutePath()
                    + " (touch REQUEST to capture)");
        }
    }

    private WidgetDump() {
    }

    private static boolean computeEnabled() {
        return System.getProperty("void.widget.dump") != null
                || System.getenv("VOID_WIDGET_DUMP") != null;
    }

    private static File computeDir() {
        String p = System.getProperty("void.widget.dump");
        if (p == null || p.isEmpty()) p = System.getenv("VOID_WIDGET_DUMP");
        if (p == null || p.isEmpty()) return null;
        return new File(p);
    }

    /**
     * Called from the client tick. When enabled and {@code REQUEST} exists,
     * dumps once and removes the request file.
     * Must stay {@code public} — {@link JoystickAlias} invokes this via reflection
     * ({@code Class#getMethod} only sees public members).
     */
    public static void poll() {
        if (!ENABLED || DIR == null) return;
        File request = new File(DIR, "REQUEST");
        if (!request.isFile()) return;
        // Delete first so a slow dump does not re-trigger every tick.
        if (!request.delete() && request.exists()) return;
        try {
            dumpOnce();
        } catch (Throwable t) {
            System.out.println("void-osrs widget-dump FAILED: " + t);
            t.printStackTrace(System.out);
        }
    }

    private static void dumpOnce() throws Exception {
        if (!DIR.exists() && !DIR.mkdirs()) {
            throw new IOException("cannot create dump dir " + DIR);
        }
        Canvas canvas = DisplayModeManagerContainer50.gameCanvas;
        if (canvas == null || !canvas.isShowing()) {
            System.out.println("void-osrs widget-dump: gameCanvas missing/not showing");
            return;
        }
        DisplayModeManagerContainer57[][] roots = DefinitionSub33.openInterfaces;
        if (roots == null) {
            System.out.println("void-osrs widget-dump: openInterfaces null");
            return;
        }

        BufferedImage frame = captureGamePixels(canvas);
        if (frame == null) {
            System.out.println("void-osrs widget-dump: no pixel source (toolkit/canvas)");
            return;
        }

        String stamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        File runDir = new File(DIR, stamp);
        if (!runDir.mkdirs()) {
            throw new IOException("cannot create run dir " + runDir);
        }
        ImageIO.write(frame, "png", new File(runDir, "_frame.png"));

        File manifest = new File(runDir, "manifest.jsonl");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(manifest)));
        int written = 0;
        try {
            for (int g = 0; g < roots.length && written < MAX_WIDGETS; g++) {
                DisplayModeManagerContainer57[] group = roots[g];
                if (group == null) continue;
                for (int i = 0; i < group.length && written < MAX_WIDGETS; i++) {
                    written += dumpTree(group[i], frame, runDir, out, written);
                }
            }
        } finally {
            out.close();
        }

        // Full IF trees (all sizes — containers too). No click required.
        int treeNodes = writeOpenTrees(roots, runDir);

        // Pointer for the lab: latest dump run.
        PrintWriter latest = new PrintWriter(new FileWriter(new File(DIR, "LATEST")));
        try {
            latest.println(stamp);
        } finally {
            latest.close();
        }
        System.out.println("void-osrs widget-dump: wrote " + written
                + " crops + " + treeNodes + " tree nodes + _frame.png → "
                + runDir.getAbsolutePath()
                + " (" + frame.getWidth() + "x" + frame.getHeight() + ")");
        // Mirror trees into widget-map/ for the offline mapper script.
        mirrorTreesToMapDir(runDir);
    }

    /**
     * Write {@code group-<id>.txt} for every loaded IF group (full hierarchy,
     * including fullscreen layers the crop pass skips via {@link #MAX_EDGE}).
     * @return total nodes printed
     */
    private static int writeOpenTrees(DisplayModeManagerContainer57[][] roots, File runDir)
            throws IOException {
        int total = 0;
        for (int g = 0; g < roots.length; g++) {
            DisplayModeManagerContainer57[] comps = roots[g];
            if (comps == null) continue;
            StringBuilder sb = new StringBuilder(4096);
            sb.append("void-osrs widget-map group=").append(g).append('\n');
            int n = 0;
            // Prefer walking from roots (no parent in this group).
            for (int i = 0; i < comps.length && n < 2000; i++) {
                DisplayModeManagerContainer57 c = comps[i];
                if (c == null || c.hidden) continue;
                if (c.parent != null && (c.parent.packedId >>> 16) == g) continue;
                if (c.parentId != -1 && (c.parentId >>> 16) == g) continue;
                n += appendTreeNode(sb, c, 0, n);
            }
            if (n == 0) {
                for (int i = 0; i < comps.length && n < 2000; i++) {
                    DisplayModeManagerContainer57 c = comps[i];
                    if (c == null || c.hidden) continue;
                    n += appendTreeNode(sb, c, 0, n);
                }
            }
            if (n == 0) continue;
            File f = new File(runDir, "group-" + g + ".txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f)));
            try {
                pw.print(sb.toString());
            } finally {
                pw.close();
            }
            total += n;
        }
        return total;
    }

    private static int appendTreeNode(StringBuilder out, DisplayModeManagerContainer57 c,
                                      int depth, int already) {
        if (c == null || already >= 2000 || depth > 14) return 0;
        for (int i = 0; i < depth; i++) out.append("  ");
        String label = treeLabel(c);
        out.append(c.packedId >>> 16).append(':').append(c.packedId & 0xffff);
        out.append(" t").append(c.type);
        out.append(" '").append(label.replace('\'', '"')).append('\'');
        out.append(' ').append(c.width).append('x').append(c.height);
        out.append(" @").append(c.absoluteX).append(',').append(c.absoluteY);
        if (c.spriteId >= 0) out.append(" spr=").append(c.spriteId);
        if (c.contentType != 0) out.append(" ct=").append(c.contentType);
        if (c.children != null && c.children.length > 0) {
            out.append(" kids=").append(c.children.length);
        }
        // First option label if any.
        if (c.optionLabels != null) {
            for (int oi = 0; oi < c.optionLabels.length; oi++) {
                String o = c.optionLabels[oi];
                if (o != null && o.length() > 0) {
                    out.append(" opt='").append(o.replace('\'', '"')).append('\'');
                    break;
                }
            }
        }
        out.append('\n');
        int n = 1;
        if (c.children != null) {
            for (int k = 0; k < c.children.length && already + n < 2000; k++) {
                n += appendTreeNode(out, c.children[k], depth + 1, already + n);
            }
        }
        return n;
    }

    private static String treeLabel(DisplayModeManagerContainer57 c) {
        if (c.debugName != null && c.debugName.trim().length() > 0) return c.debugName.trim();
        if (c.text != null && c.text.trim().length() > 0) return c.text.trim();
        if (c.textContent != null && c.textContent.trim().length() > 0) return c.textContent.trim();
        if (c.optionLabels != null) {
            for (int i = 0; i < c.optionLabels.length; i++) {
                String o = c.optionLabels[i];
                if (o != null && o.trim().length() > 0) return o.trim();
            }
        }
        if (c.spriteId >= 0) return "sprite:" + c.spriteId;
        if (c.itemId > 0) return "item:" + c.itemId;
        if (c.contentType != 0) return "contentType:" + c.contentType;
        if (c.type == 0) return "layer";
        return "iface";
    }

    /** Copy group-*.txt into cwd {@code widget-map/} for the Python mapper. */
    private static void mirrorTreesToMapDir(File runDir) {
        try {
            File mapDir = new File("widget-map");
            if (!mapDir.exists() && !mapDir.mkdirs()) return;
            File[] files = runDir.listFiles();
            if (files == null) return;
            for (int i = 0; i < files.length; i++) {
                File f = files[i];
                String name = f.getName();
                if (!name.startsWith("group-") || !name.endsWith(".txt")) continue;
                java.nio.file.Files.copy(f.toPath(), new File(mapDir, name).toPath(),
                        java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            }
            // Stamp which dump produced the trees.
            PrintWriter pw = new PrintWriter(new FileWriter(new File(mapDir, "SOURCE")));
            try {
                pw.println(runDir.getName());
            } finally {
                pw.close();
            }
        } catch (Throwable t) {
            System.out.println("void-osrs widget-dump: map mirror failed: " + t);
        }
    }

    /**
     * Prefer the software toolkit colour buffer (what the game drew) over
     * {@link Robot#createScreenCapture} — Robot grabs whatever is composited
     * on screen, so an IDE window covering the canvas shows up in crops.
     */
    private static BufferedImage captureGamePixels(Canvas canvas) throws Exception {
        GraphicsToolkit toolkit = NodeSub8.toolkit;
        if (toolkit instanceof GlToolkitSub1) {
            GlToolkitSub1 soft = (GlToolkitSub1) toolkit;
            int[] px = soft.anIntArray7483;
            int w = soft.anInt7477;
            if (px != null && w > 0 && px.length >= w) {
                int h = px.length / w;
                BufferedImage img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
                // Copy — toolkit keeps writing into anIntArray7483 next frame.
                img.setRGB(0, 0, w, h, px, 0, w);
                return img;
            }
            System.out.println("void-osrs widget-dump: software buffer empty, falling back to Robot");
        } else {
            System.out.println("void-osrs widget-dump: toolkit not software ("
                    + (toolkit == null ? "null" : toolkit.getClass().getName())
                    + "), falling back to Robot");
        }
        return captureViaRobot(canvas);
    }

    /** Last resort: screen grab. Brings the game window forward and parks the mouse. */
    private static BufferedImage captureViaRobot(Canvas canvas) throws Exception {
        int cw = canvas.getWidth();
        int ch = canvas.getHeight();
        if (cw <= 0 || ch <= 0) return null;
        java.awt.Window win = javax.swing.SwingUtilities.getWindowAncestor(canvas);
        if (win != null) {
            win.toFront();
            win.requestFocus();
        }
        Robot robot = new Robot();
        Point loc = canvas.getLocationOnScreen();
        // Keep the system pointer out of the crop (and off the canvas).
        robot.mouseMove(Math.max(0, loc.x - 40), Math.max(0, loc.y - 40));
        robot.waitForIdle();
        try {
            Thread.sleep(80L);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        return robot.createScreenCapture(new Rectangle(loc.x, loc.y, cw, ch));
    }

    /** Returns number of crops written under this node (self + descendants). */
    private static int dumpTree(DisplayModeManagerContainer57 c, BufferedImage frame,
                                File runDir, PrintWriter out, int already) {
        if (c == null || already >= MAX_WIDGETS) return 0;
        int n = 0;
        if (shouldDump(c)) {
            if (writeCrop(c, frame, runDir, out, already + n)) n++;
        }
        if (c.children != null) {
            for (int k = 0; k < c.children.length && already + n < MAX_WIDGETS; k++) {
                n += dumpTree(c.children[k], frame, runDir, out, already + n);
            }
        }
        return n;
    }

    private static boolean shouldDump(DisplayModeManagerContainer57 c) {
        if (c.hidden) return false;
        if (c.width <= 0 || c.height <= 0) return false;
        if (c.width > MAX_EDGE || c.height > MAX_EDGE) return false;
        // Prefer anything with a visual / interactive signal; still keep bare rects.
        return true;
    }

    private static boolean writeCrop(DisplayModeManagerContainer57 c, BufferedImage frame,
                                     File runDir, PrintWriter out, int seq) {
        int x = c.absoluteX;
        int y = c.absoluteY;
        int w = c.width;
        int h = c.height;
        if (x < 0) {
            w += x;
            x = 0;
        }
        if (y < 0) {
            h += y;
            y = 0;
        }
        if (x >= frame.getWidth() || y >= frame.getHeight()) return false;
        if (x + w > frame.getWidth()) w = frame.getWidth() - x;
        if (y + h > frame.getHeight()) h = frame.getHeight() - y;
        if (w <= 0 || h <= 0) return false;

        String fileName = "w_" + seq + "_p" + c.packedId + "_c" + c.childIndex + ".png";
        try {
            BufferedImage crop = frame.getSubimage(x, y, w, h);
            ImageIO.write(crop, "png", new File(runDir, fileName));
        } catch (Exception e) {
            return false;
        }

        StringBuilder opts = new StringBuilder("[");
        if (c.optionLabels != null) {
            boolean first = true;
            for (int i = 0; i < c.optionLabels.length; i++) {
                String o = c.optionLabels[i];
                if (o == null || o.length() == 0) continue;
                if (!first) opts.append(',');
                first = false;
                opts.append(jsonQuote(o));
            }
        }
        opts.append(']');

        StringBuilder line = new StringBuilder(256);
        line.append('{');
        line.append("\"file\":").append(jsonQuote(fileName));
        line.append(",\"iface\":").append(jsonQuote(
                (c.packedId >>> 16) + ":" + (c.packedId & 0xffff)));
        line.append(",\"packedId\":").append(c.packedId);
        line.append(",\"childIndex\":").append(c.childIndex);
        line.append(",\"type\":").append(c.type);
        line.append(",\"spriteId\":").append(c.spriteId);
        line.append(",\"contentType\":").append(c.contentType);
        line.append(",\"itemId\":").append(c.itemId);
        line.append(",\"x\":").append(c.absoluteX);
        line.append(",\"y\":").append(c.absoluteY);
        line.append(",\"w\":").append(c.width);
        line.append(",\"h\":").append(c.height);
        line.append(",\"parentId\":").append(c.parentId);
        line.append(",\"text\":").append(jsonQuote(c.text));
        line.append(",\"textContent\":").append(jsonQuote(c.textContent));
        line.append(",\"debugName\":").append(jsonQuote(c.debugName));
        line.append(",\"options\":").append(opts);
        line.append('}');
        out.println(line.toString());
        return true;
    }

    private static String jsonQuote(String s) {
        if (s == null) return "null";
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '"': sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (ch < 0x20) sb.append(String.format("\\u%04x", (int) ch));
                    else sb.append(ch);
            }
        }
        return sb.append('"').toString();
    }
}
