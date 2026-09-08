/* DeobProbe - runtime hypothesis logger for deobfuscation.
 *
 * Strategy (adapted from DebugSwift swift-agent-debug-log):
 *   Instrument a suspicious obfuscated method with a probe. Each probe appends
 *   ONE NDJSON line carrying the (still-obfuscated) location, the guessed
 *   English role (hypothesis), the runtime `data` that proves/disproves it,
 *   and a `hypothesisId` you can filter on later. Run the desktop client,
 *   reproduce the behaviour, then read the log and confirm/reject.
 *
 * The `location` field MUST keep the obfuscated name (e.g. "SpriteSub3.anInt8477")
 * so the evidence survives the eventual rename and stays greppable.
 *
 * WIRING: logging is asynchronous. Probes enqueue a line onto a bounded queue
 * and return immediately; a single daemon writer thread drains the queue to
 * disk. This keeps probes free of the game/render loop — a probe in a hot
 * per-frame method costs only a queue.offer, never a disk write.
 *
 * Enable:  set -Dvoid.deob.log=<path> OR env VOID_DEOB_LOG=<path>
 * Disable: set -Dvoid.deob.disabled=true OR env VOID_DEOB_DISABLED=1
 * Default path (when enabled without a path): "deob-log.ndjson" in user.dir.
 *
 * Wrap every call site in  // #region agent log ... // #endregion  so the
 * probes are trivial to strip once the hypothesis is resolved.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

final class DeobProbe {
    private static final String SESSION_ID =
            Long.toHexString(System.currentTimeMillis());
    private static final boolean ENABLED = computeEnabled();
    private static final String PATH = computePath();
    private static final int QUEUE_CAP = 4096;
    private static final BlockingQueue<String> queue =
            ENABLED ? new ArrayBlockingQueue<>(QUEUE_CAP) : null;
    private static final AtomicLong dropped = new AtomicLong(0);
    private static final AtomicLong enqueued = new AtomicLong(0);
    private static volatile PrintWriter writer;
    // Lightweight per-location call counters (for hot-method discovery).
    private static final Map<String, AtomicLong> counters = new IdentityHashMap<>();
    private static volatile boolean draining = false;

    static {
        if (ENABLED) startWriter();
    }

    private DeobProbe() {
    }

    private static boolean computeEnabled() {
        String sys = System.getProperty("void.deob.disabled");
        String env = System.getenv("VOID_DEOB_DISABLED");
        if ("true".equalsIgnoreCase(sys) || "1".equals(env) || "true".equalsIgnoreCase(env)) {
            return false;
        }
        return System.getProperty("void.deob.log") != null
                || System.getenv("VOID_DEOB_LOG") != null;
    }

    private static String computePath() {
        String p = System.getProperty("void.deob.log");
        if (p == null || p.isEmpty()) p = System.getenv("VOID_DEOB_LOG");
        if (p == null || p.isEmpty()) p = "deob-log.ndjson";
        return p;
    }

    /** Open the file and start the background writer thread. */
    private static void startWriter() {
        try {
            writer = new PrintWriter(new BufferedWriter(new FileWriter(PATH, true)));
        } catch (IOException e) {
            dropped.incrementAndGet();
            return;
        }
        enqueue(build("session", SESSION_ID, "session-start",
                map("path", PATH, "java", System.getProperty("java.version"))));
        // Anonymous Runnables — no lambdas/method-refs (RoboVM Soot cannot AOT invokedynamic).
        Thread t = new Thread(new Runnable() {
            public void run() {
                pump();
            }
        }, "DeobProbe-writer");
        t.setDaemon(true);
        t.start();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {
                drain();
                if (dropped.get() > 0) {
                    System.err.println("DeobProbe: queue saturated — wrote "
                            + enqueued.get() + " lines, dropped " + dropped.get()
                            + " (probes fired faster than the writer drained; "
                            + "lower the probe rate or call DeobProbe.flush()).");
                }
            }
        }, "DeobProbe-shutdown"));
    }

    /** Background drain loop: write lines as they arrive; stop on drain(). */
    private static void pump() {
        try {
            while (true) {
                String line = queue.poll(200, TimeUnit.MILLISECONDS);
                if (line != null) {
                    PrintWriter w = writer;
                    if (w != null) {
                        w.println(line);
                        w.flush();
                    }
                } else if (draining) {
                    break;
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            PrintWriter w = writer;
            if (w != null) w.flush();
        }
    }

    /** Enqueue one JSON line; drop (count) if the queue is full. */
    private static void enqueue(String line) {
        if (line == null) return;
        if (queue.offer(line)) enqueued.incrementAndGet();
        else dropped.incrementAndGet();
    }

    private static Map<String, Object> map(Object... kv) {
        Map<String, Object> m = new LinkedHashMap<>();
        for (int i = 0; i + 1 < kv.length; i += 2) {
            m.put(String.valueOf(kv[i]), truncate(kv[i + 1]));
        }
        return m;
    }

    private static Object truncate(Object v) {
        if (v == null) return null;
        if (v instanceof String) {
            String s = (String) v;
            return s.length() > 200 ? s.substring(0, 200) + "…" : s;
        }
        if (v.getClass().isArray()) {
            int n = Array.getLength(v);
            if (n > 16) return "[" + n + " elems]";
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < n; i++) {
                if (i > 0) sb.append(',');
                sb.append(String.valueOf(Array.get(v, i)));
            }
            return sb.append(']').toString();
        }
        return v;
    }

    /** Build the NDJSON string in the CALLER's thread (so `thread` is accurate). */
    private static String build(String kind, String location, String message,
                                Map<String, Object> data) {
        Map<String, Object> line = new LinkedHashMap<>();
        line.put("sessionId", SESSION_ID);
        line.put("kind", kind);
        line.put("location", location);
        line.put("message", message);
        line.put("data", data);
        line.put("timestamp", System.currentTimeMillis());
        line.put("thread", Thread.currentThread().getName());
        return toJson(line);
    }

    private static void emitRaw(String kind, String location, String message,
                                Map<String, Object> data) {
        enqueue(build(kind, location, message, data));
    }

    /** Record a hypothesis observation with structured `data`. */
    static void log(String hypothesisId, String location, String message,
                    Map<String, Object> data) {
        if (!ENABLED) return;
        Map<String, Object> d = data == null ? new LinkedHashMap<>() : data;
        d.put("hypothesisId", hypothesisId);
        d.put("runId", System.getProperty("void.deob.run", "pre-fix"));
        emitRaw("probe", location, message, d);
    }

    /** Convenience varargs form: log("H1", "Class.method", "msg", "arg0", v0, "arg1", v1). */
    static void log(String hypothesisId, String location, String message,
                    Object... kv) {
        if (!ENABLED) return;
        log(hypothesisId, location, message, map(kv));
    }

    /** Increment a per-location call counter (hot-method discovery). */
    static void tick(String location) {
        if (!ENABLED) return;
        AtomicLong c = counters.get(location);
        if (c == null) {
            synchronized (counters) {
                c = counters.get(location);
                if (c == null) {
                    c = new AtomicLong(0);
                    counters.put(location, c);
                }
            }
        }
        long n = c.incrementAndGet();
        // Every 1024 ticks, emit the aggregate so a crash mid-run loses little.
        if ((n & 0x3FF) == 0) {
            emitRaw("count", location, "call-count", map("count", n));
        }
    }

    /** Manual flush: emit aggregates, drain the queue, close the file. */
    static void flush() {
        if (!ENABLED) return;
        synchronized (counters) {
            for (Map.Entry<String, AtomicLong> e : counters.entrySet()) {
                emitRaw("count", e.getKey(), "call-count", map("count", e.getValue().get()));
            }
        }
        drain();
        synchronized (DeobProbe.class) {
            if (writer != null) {
                writer.close();
                writer = null;
            }
        }
    }

    /** Drain whatever is queued (used by flush and the shutdown hook). */
    private static void drain() {
        draining = true;
        PrintWriter w = writer;
        if (w == null) return;
        String line;
        while ((line = queue.poll()) != null) {
            w.println(line);
        }
        w.flush();
    }

    private static String toJson(Map<?, ?> m) {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        for (Map.Entry<?, ?> e : m.entrySet()) {
            if (!first) sb.append(',');
            first = false;
            sb.append(quote(String.valueOf(e.getKey()))).append(':').append(jsonValue(e.getValue()));
        }
        return sb.append('}').toString();
    }

    private static String jsonValue(Object v) {
        if (v == null) return "null";
        if (v instanceof String) return quote((String) v);
        if (v instanceof Number || v instanceof Boolean) return v.toString();
        if (v instanceof Map) return toJson((Map<?, ?>) v);
        return quote(String.valueOf(v));
    }

    private static String quote(String s) {
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"': sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (c < 0x20) sb.append(String.format("\\u%04x", (int) c));
                    else sb.append(c);
            }
        }
        return sb.append('"').toString();
    }

    /** Capture a throwable as a short string for the data map. */
    static String stack(Throwable t) {
        if (t == null) return null;
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        return sw.toString().split("\n", 4)[0];
    }
}
