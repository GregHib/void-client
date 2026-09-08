package world.gregs.voidosrs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Persisted JS5 / login host list and light game-state helpers for the mobile hosts.
 * <p>
 * File: {@code user.home/void-server.txt} (newest first, max {@link #MAX_HISTORY}).
 * Shared Android + iOS — lives under the Android tree and is copied into the iOS
 * source set by {@code prepareSharedSources}.
 * <p>
 * Game-state helpers read obfuscated statics via reflection so the picker overlay
 * can show on title / connect-fail without pulling 634 types into the host package.
 */
public final class ServerPrefs {
    public static final int MAX_HISTORY = 5;

    /**
     * Process-local newest host — tvOS RoboVM can hit {@code EPERM} writing under
     * {@code user.home}; boot still needs a host after Accept / seed.
     */
    private static volatile String sessionHost;

    private ServerPrefs() {
    }

    /** {@code user.home/void-server.txt} */
    public static File file() {
        String home = System.getProperty("user.home", ".");
        return new File(home, "void-server.txt");
    }

    /** Most recently used host, or {@code null} if none saved. */
    public static String load() {
        if (sessionHost != null) {
            return sessionHost;
        }
        String[] all = loadAll();
        return all.length > 0 ? all[0] : null;
    }

    /** History newest-first, already normalized and de-duplicated. */
    public static String[] loadAll() {
        ArrayList<String> out = new ArrayList<String>();
        if (sessionHost != null) {
            out.add(sessionHost);
        }
        File f = file();
        if (!f.exists() || !f.canRead()) {
            return out.toArray(new String[out.size()]);
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(f));
            String line;
            while ((line = in.readLine()) != null && out.size() < MAX_HISTORY) {
                String n = normalize(line);
                if (n != null && !out.contains(n)) {
                    out.add(n);
                }
            }
        } catch (Throwable ignored) {
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Throwable ignored) {
                }
            }
        }
        return out.toArray(new String[out.size()]);
    }

    /** Push {@code host} to the front of history (creates the file if needed). */
    public static void save(String host) {
        String n = normalize(host);
        if (n == null) {
            return;
        }
        sessionHost = n;
        ArrayList<String> out = new ArrayList<String>();
        out.add(n);
        // Disk history only (avoid duplicating sessionHost via loadAll).
        File f = file();
        if (f.exists() && f.canRead()) {
            BufferedReader in = null;
            try {
                in = new BufferedReader(new FileReader(f));
                String line;
                while ((line = in.readLine()) != null && out.size() < MAX_HISTORY) {
                    String old = normalize(line);
                    if (old != null && !n.equals(old) && !out.contains(old)) {
                        out.add(old);
                    }
                }
            } catch (Throwable ignored) {
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (Throwable ignored) {
                    }
                }
            }
        }
        FileWriter w = null;
        try {
            File parent = f.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            w = new FileWriter(f);
            for (int i = 0; i < out.size(); i++) {
                w.write(out.get(i));
                w.write('\n');
            }
            w.flush();
        } catch (Throwable t) {
            System.out.println("void-osrs ServerPrefs.save fail: " + t + " path=" + f.getAbsolutePath());
            t.printStackTrace();
        } finally {
            if (w != null) {
                try {
                    w.close();
                } catch (Throwable ignored) {
                }
            }
        }
    }

    /**
     * Strip scheme / path / port / userinfo to a bare host.
     * {@code http://192.168.1.10:43594/} → {@code 192.168.1.10}
     */
    public static String normalize(String raw) {
        if (raw == null) {
            return null;
        }
        String s = raw.trim();
        if (s.length() == 0) {
            return null;
        }
        int scheme = s.indexOf("://");
        if (scheme >= 0) {
            s = s.substring(scheme + 3);
        }
        int slash = s.indexOf('/');
        if (slash >= 0) {
            s = s.substring(0, slash);
        }
        int at = s.indexOf('@');
        if (at >= 0) {
            s = s.substring(at + 1);
        }
        if (s.startsWith("[")) {
            int end = s.indexOf(']');
            if (end > 0) {
                s = s.substring(1, end);
            }
        } else {
            int colon = s.lastIndexOf(':');
            if (colon > 0) {
                boolean digits = true;
                for (int i = colon + 1; i < s.length(); i++) {
                    if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                        digits = false;
                        break;
                    }
                }
                if (digits) {
                    s = s.substring(0, colon);
                }
            }
        }
        s = s.trim();
        return s.length() == 0 ? null : s;
    }

    /**
     * {@code Component49.clientState} — client game state.
     * Splash ≈ 0–2, title/login/lobby ≈ 3–9 / 12, in-world = 10, fatal connect = 14.
     */
    public static int gameState() {
        try {
            java.lang.reflect.Field f = Class.forName("Component49").getDeclaredField("clientState");
            f.setAccessible(true);
            return f.getInt(null);
        } catch (Throwable ignored) {
            return -1;
        }
    }

    /** Title / lobby / account screens — not splash and not in-world. */
    public static boolean isLoginScreen() {
        int state = gameState();
        return state == 3 || state == 4 || state == 5 || state == 6
                || state == 7 || state == 8 || state == 9 || state == 12;
    }

    /** Fatal JS5 / connect error page ({@code error_game_js5connect}). */
    public static boolean isConnectFailScreen() {
        return gameState() == 14;
    }

    /** JS5 retry counter on the live connection object — increments per Connect fail. */
    public static int js5FailCount() {
        try {
            java.lang.reflect.Field inst = Class.forName("HardwareProbe").getDeclaredField("aClass248_6601");
            inst.setAccessible(true);
            Object js5 = inst.get(null);
            if (js5 == null) {
                return 0;
            }
            java.lang.reflect.Field c = js5.getClass().getDeclaredField("errorCount");
            c.setAccessible(true);
            return c.getInt(js5);
        } catch (Throwable ignored) {
            return 0;
        }
    }

    /** Splash still running and JS5 already failed — show picker before state 14. */
    public static boolean isConnectFailing() {
        if (isConnectFailScreen()) {
            return true;
        }
        int state = gameState();
        return state >= 0 && state <= 2 && js5FailCount() >= 1;
    }

    /** Whether the host should show Change-server / auto-open the picker. */
    public static boolean showsServerPicker() {
        return isLoginScreen() || isConnectFailing();
    }
}
