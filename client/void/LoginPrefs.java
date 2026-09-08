import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Persisted login credentials for quick / auto re-login (desktop + Android + iOS).
 * <p>
 * File: {@code user.home/void-login.txt} — username on line 1, password on line 2
 * (plaintext, same style as {@code void-server.txt}). Saved on every login attempt.
 * <p>
 * Auto-login mirrors CS2 opcode 5600: restore creds on title (state 3), then on a
 * later tick transition to state 6 (connecting), which starts {@code method1922}.
 * <p>
 * Graphics Auto Setup must finish first. Leaving state 3 on the first tick skipped
 * the title draw that clears pref {@code aClass239_Sub11_7265} and the CS2 that
 * mounts Auto Setup (opcodes 6144/6147 → 7000). That left the client stuck on the
 * safe-mode toolkit and never ran {@code method2478}.
 */
final class LoginPrefs {
    /**
     * Session arm: consumed when auto-login is scheduled.
     * Not restored on world entry — so "Exit to login" stays on the title
     * instead of immediately re-authenticating. Cold start still auto-logs once.
     */
    private static boolean autoArmed = true;
    /** Fire state-6 transition once graphics setup + title are ready. */
    private static boolean pendingAutoLogin;
    /**
     * Once per auto-login attempt: run CS2-7000 graphics Auto Setup if the title
     * would have offered it (safe-mode flag / low VRAM / recovered toolkit).
     */
    private static boolean graphicsSetupHandled;

    private LoginPrefs() {
    }

    /** {@code user.home/void-login.txt} */
    static File file() {
        String home = System.getProperty("user.home", ".");
        return new File(home, "void-login.txt");
    }

    /**
     * @return {@code {username, password}} or {@code null} if missing / incomplete
     */
    static String[] load() {
        File f = file();
        if (!f.isFile()) {
            return null;
        }
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(f));
            String user = in.readLine();
            String pass = in.readLine();
            if (user == null || pass == null) {
                return null;
            }
            user = user.trim();
            if (pass.endsWith("\r")) {
                pass = pass.substring(0, pass.length() - 1);
            }
            if (user.length() == 0 || pass.length() == 0) {
                return null;
            }
            return new String[]{user, pass};
        } catch (Throwable ignored) {
            return null;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Throwable ignored) {
                }
            }
        }
    }

    /** Overwrite saved credentials (called on every login attempt). */
    static void save(String username, String password) {
        if (username == null || password == null) {
            return;
        }
        if (username.length() == 0 || password.length() == 0) {
            return;
        }
        FileWriter w = null;
        try {
            File f = file();
            File parent = f.getParentFile();
            if (parent != null) {
                parent.mkdirs();
            }
            w = new FileWriter(f);
            w.write(username);
            w.write('\n');
            w.write(password);
            w.write('\n');
        } catch (Throwable t) {
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

    /** Remember credentials from a login attempt (manual or auto). */
    static void remember(String username, String password) {
        save(username, password);
    }

    /**
     * Title screen opened: restore saved user/pass, schedule auto-login for later.
     */
    static void onLoginScreen() {
        String[] creds = load();
        if (creds == null) {
            return;
        }
        DisplayModeManagerContainer282.username = creds[0];
        DisplayModeManagerContainer51.password = creds[1];
        fillLoginFields(creds[0], creds[1]);
        if (!Loader.autoLogin || !autoArmed) {
            return;
        }
        autoArmed = false;
        pendingAutoLogin = true;
        graphicsSetupHandled = false;
        System.out.println("void-osrs auto-login armed user=" + creds[0]);
    }

    /**
     * Called each frame while the login FSM can run. Completes a pending auto-login
     * with the same state transition as the Login button (CS2 5600 → state 6),
     * after graphics Auto Setup has run (or is not needed).
     */
    static void tick() {
        if (!pendingAutoLogin) {
            return;
        }
        // Same guards as CS2 opcode 5600.
        if (Component49.clientState != 3) {
            return;
        }
        if (Component241.anInt2955 != 0 || AbstractShaderSub2.anInt7297 != 0) {
            return;
        }
        if (DisplayModeManagerContainer282.username == null || DisplayModeManagerContainer282.username.length() == 0
                || DisplayModeManagerContainer51.password == null || DisplayModeManagerContainer51.password.length() == 0) {
            pendingAutoLogin = false;
            return;
        }
        // Login root interface must be mounted before title CS2 / Auto Setup runs.
        if (r.anInt9721 == -1) {
            return;
        }
        // Title draw clears pref 1→0 once the iface is up (see client.method116).
        // Leaving earlier left pref at 1 → next cold start forced safe-mode toolkit.
        if (Component192.preferences.aClass239_Sub11_7265.method1768(-32350) == 1) {
            return;
        }
        if (!graphicsSetupHandled) {
            graphicsSetupHandled = true;
            if (needsGraphicsAutoSetup()) {
                runGraphicsAutoSetup();
            }
            // Always dismiss Leave Alone / Auto Setup so auto-login is not stuck
            // waiting on a type-3 overlay (especially on macOS where we skip toolkit switch).
            closeModalOverlays();
        }
        // Still waiting on Leave Alone / Auto Setup dialog (or close failed).
        if (hasModalOverlay()) {
            return;
        }
        pendingAutoLogin = false;
        System.out.println("void-osrs auto-login go user=" + DisplayModeManagerContainer282.username);
        // Enter connecting — setClientState(6) calls method1922 and leaves the title UI.
        Buffer.setClientState(2, 6);
    }

    /**
     * Same condition CS2 opcode 6147 uses to offer the graphics Auto Setup UI:
     * low VRAM, splash safe-mode flag, or toolkit recovered after a crash.
     */
    private static boolean needsGraphicsAutoSetup() {
        int vram = 0;
        if (DefinitionSub20.aClass348_Sub4_9264 != null) {
            vram = DefinitionSub20.aClass348_Sub4_9264.anInt6609;
        }
        return vram < 512 || DisplayModeManagerContainer64.aBoolean9038 || GpsOverlay.aBoolean1952;
    }

    /**
     * Mirrors CS2 opcode 7000 (Auto Setup button): benchmark toolkits, apply best,
     * refresh display, persist prefs.
     * <p>
     * On macOS, skip the native toolkit probe (JAWT crash / GlToolkitSub2 fail) — software
     * renderer stays; caller still dismisses the dialog via {@link #closeModalOverlays()}.
     */
    private static void runGraphicsAutoSetup() {
        if (Loader.isMacOs()) {
            System.out.println("void-osrs graphics auto-setup skipped on macOS (software toolkit)");
            return;
        }
        try {
            Component269.method2478(1000);
            DisplayModeManagerContainer282.anInt5584 = Component192.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350);
            NodeSub20.method2953((byte) -113);
            DisplayModeManagerContainer389.savePreferences(37);
            r.aBoolean9719 = false;
            System.out.println("void-osrs graphics auto-setup toolkit=" + DisplayModeManagerContainer282.anInt5584);
        } catch (Throwable t) {
            System.out.println("void-osrs graphics auto-setup failed: " + t);
            t.printStackTrace();
        }
    }

    /** True if a type-3 (modal) overlay is open — Auto Setup uses this. */
    private static boolean hasModalOverlay() {
        try {
            for (NodeSub41 o = (NodeSub41) Component15.aClass356_4915.first(0);
                 o != null;
                 o = (NodeSub41) Component15.aClass356_4915.next(0)) {
                if (o.anInt7053 == 3) {
                    return true;
                }
            }
        } catch (Throwable ignored) {
        }
        return false;
    }

    /** Dismiss modal overlays after programmatic Auto Setup (same as closing the dialog). */
    private static void closeModalOverlays() {
        try {
            for (; ; ) {
                NodeSub41 target = null;
                for (NodeSub41 o = (NodeSub41) Component15.aClass356_4915.first(0);
                     o != null;
                     o = (NodeSub41) Component15.aClass356_4915.next(0)) {
                    if (o.anInt7053 == 3) {
                        target = o;
                        break;
                    }
                }
                if (target == null) {
                    return;
                }
                Component162.method1118(true, true, target, 2533);
            }
        } catch (Throwable ignored) {
        }
    }

    /**
     * World entered — drop any pending auto-login.
     * Leaves {@code autoArmed} false so a later logout ("Exit to login")
     * restores creds on the title but does not auto-connect again.
     */
    static void onWorldEntered() {
        pendingAutoLogin = false;
    }

    /**
     * Best-effort: write saved strings into the first two single-line text
     * widgets on the login root (by component id). Helps when auto is disarmed.
     */
    private static void fillLoginFields(String user, String pass) {
        try {
            int root = r.anInt9721;
            if (root < 0 || DefinitionSub33.openInterfaces == null) {
                return;
            }
            if (root >= DefinitionSub33.openInterfaces.length) {
                return;
            }
            DisplayModeManagerContainer57[] all = DefinitionSub33.openInterfaces[root];
            if (all == null) {
                return;
            }
            DisplayModeManagerContainer57 first = null;
            DisplayModeManagerContainer57 second = null;
            int firstId = Integer.MAX_VALUE;
            int secondId = Integer.MAX_VALUE;
            for (int i = 0; i < all.length; i++) {
                DisplayModeManagerContainer57 c = all[i];
                if (c == null || c.type != 4) {
                    continue;
                }
                int h = c.height;
                if (h <= 0 || h > 48) {
                    continue;
                }
                if (c.anObjectArray822 == null && c.anObjectArray763 == null) {
                    continue;
                }
                int id = c.packedId & 0xffff;
                if (id < firstId) {
                    second = first;
                    secondId = firstId;
                    first = c;
                    firstId = id;
                } else if (id < secondId) {
                    second = c;
                    secondId = id;
                }
            }
            if (first != null && !user.equals(first.textContent)) {
                first.textContent = user;
                Component111.markInterfaceDirty(-9343, first);
            }
            if (second != null && !pass.equals(second.textContent)) {
                second.textContent = pass;
                Component111.markInterfaceDirty(-9343, second);
            }
        } catch (Throwable ignored) {
        }
    }
}
