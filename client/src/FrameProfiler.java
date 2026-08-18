import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;

/**
 * Lightweight frame-phase profiler for the client main loop.
 *
 * The engine loop in Applet_Sub1.run() has four phases per frame:
 * wait (engine clock sleeping until the next cycle), logic (0..n game
 * ticks), render, and other (canvas/input upkeep). This class aggregates
 * per-phase time over a rolling window and prints a summary to stdout,
 * so "the client is slow" can be split into logic-bound, render-bound,
 * GC-bound or simply frame-capped (all time in wait).
 *
 * Enable with the --profile launch flag or the "profile" console command.
 * When disabled the per-frame cost is two static boolean reads.
 */
public final class FrameProfiler {

    public static volatile boolean enabled = false;

    private static final long WINDOW_NS = 5_000_000_000L;
    private static final long SLOW_FRAME_NS = 33_000_000L;

    private static long windowStart;
    private static int frames;
    private static int logicTicks;
    private static long waitNs;
    private static long logicNs;
    private static long renderNs;
    private static long otherNs;
    private static long maxActiveNs;
    private static int slowFrames;
    private static long gcMsAtWindowStart;

    private static volatile String lastReport = "no data yet - profiler just enabled?";

    private FrameProfiler() {
    }

    public static void setEnabled(boolean on) {
        enabled = on;
        if (on) reset(System.nanoTime());
        System.out.println("[profiler] " + (on ? "enabled - reports every " + (WINDOW_NS / 1_000_000_000L) + "s on stdout" : "disabled"));
    }

    /** Cheap when disabled: no nanoTime call is made. */
    public static long time() {
        return enabled ? System.nanoTime() : 0L;
    }

    /**
     * Record one frame. The timestamps bracket the phases:
     * wait=[t0,t1], logic=[t1,t2], render=[t2,t3], other=[t3,t4].
     */
    public static void frame(long t0, long t1, long t2, long t3, long t4, int ticks) {
        if (!enabled || t0 == 0L) return;
        if (windowStart == 0L) reset(t0);
        frames++;
        logicTicks += ticks;
        waitNs += t1 - t0;
        logicNs += t2 - t1;
        renderNs += t3 - t2;
        otherNs += t4 - t3;
        long active = t4 - t1;
        if (active > maxActiveNs) maxActiveNs = active;
        if (active > SLOW_FRAME_NS) slowFrames++;
        if (t4 - windowStart >= WINDOW_NS) {
            report(t4);
            reset(t4);
        }
    }

    /** Most recent window summary, for the in-game console. */
    public static String summary() {
        return lastReport;
    }

    private static void report(long nowNs) {
        if (frames == 0) return;
        double secs = (nowNs - windowStart) / 1e9;
        double fps = frames / secs;
        double waitMs = waitNs / 1e6 / frames;
        double logicMs = logicNs / 1e6 / frames;
        double renderMs = renderNs / 1e6 / frames;
        double otherMs = otherNs / 1e6 / frames;
        double activeMs = logicMs + renderMs + otherMs;
        long gcMs = gcTimeMs() - gcMsAtWindowStart;
        Runtime rt = Runtime.getRuntime();
        long usedMb = (rt.totalMemory() - rt.freeMemory()) >> 20;
        long maxMb = rt.maxMemory() >> 20;
        String line = String.format(
            "%.1f fps | frame active %.1fms (max %.0fms): logic %.1f render %.1f other %.1f | wait %.1fms | %d ticks | %d slow frames >%dms | gc %dms | heap %d/%dMB",
            fps, activeMs, maxActiveNs / 1e6, logicMs, renderMs, otherMs, waitMs,
            logicTicks, slowFrames, SLOW_FRAME_NS / 1_000_000L, gcMs, usedMb, maxMb);
        lastReport = line;
        System.out.println("[profiler] " + line);
    }

    private static void reset(long nowNs) {
        windowStart = nowNs;
        frames = 0;
        logicTicks = 0;
        waitNs = logicNs = renderNs = otherNs = 0L;
        maxActiveNs = 0L;
        slowFrames = 0;
        gcMsAtWindowStart = gcTimeMs();
    }

    private static long gcTimeMs() {
        long total = 0L;
        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
            long t = gc.getCollectionTime();
            if (t > 0L) total += t;
        }
        return total;
    }
}
