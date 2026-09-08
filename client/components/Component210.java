/* Component210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

class Component210
/**
 * RENAMED from {@code Class59_Sub1}. OpenGL mipmap / noise texture helper
 * ({@link DisplayModeManagerContainer213} subclass) — <b>and</b> hosts static
 * developer-console helpers that JODE parked here:
 * {@link #submitConsoleLine}, {@link #decorateItemConsoleEcho}, {@link #stripItemConsoleEcho}.
 * <p>
 * {@link #gameCanvasAttached} mirrors the graphics pref that binds the game canvas
 * to the toolkit (alternate present path when true).
 */ extends DisplayModeManagerContainer213 {
    static int anInt5277;
    private final int anInt5278;
    private final int anInt5279;
    private int anInt5280;
    static int anInt5281;
    static int anInt5282;
    static int anInt5283;
    static int anInt5284;
    private int anInt5285;
    static int anInt5286;
    private int anInt5287;
    static StringCache aClass351_5288 = new StringCache(7, 6);
    private int anInt5289;
    private int anInt5290;
    static int anInt5291;
    static int anInt5292;
    static int anInt5293;
    static Component24[] aClass105Array5294;
    static int anInt5295;
    private byte[] aByteArray5296;
    static ReflectionInvoker aClass297_5297;
    private final int anInt5298;
    static float aFloat5299;
    /**
     * True when the active graphics preference has attached {@code gameCanvas} to the
     * toolkit ({@code HashNodeSub3} sync). Gates toolkit present vs software blit paths.
     */
    static boolean gameCanvasAttached = false;

    void method550(int i, byte i_0_, byte i_1_) {
        if (i_1_ != 14) submitConsoleLine(true, -38);
        anInt5281++;
        aByteArray5296[i] = i_0_;
    }

    final void method543(boolean bool) {
        anInt5287 = 0;
        if (bool != true) submitConsoleLine(false, -53);
        anInt5290 = 0;
        anInt5291++;
    }

    static final void method551(int i, int i_2_, int i_3_, float[] fs, int i_4_, int i_5_, int i_6_) {
        anInt5277++;
        if (i_4_ < i && !Component353.method1436(i_4_ + -23, i)) throw new IllegalArgumentException("");
        if (i_5_ > 0 && !Component353.method1436(56, i_5_)) throw new IllegalArgumentException("");
        int i_7_ = Component191.method1382(i_2_, -6409);
        int i_8_ = 0;
        int i_9_ = Math.min(i_5_, i);
        int i_10_ = i >> 1;
        int i_11_ = i_5_ >> 1;
        float[] fs_12_ = fs;
        float[] fs_13_ = new float[i_7_ * i_10_ * i_11_];
        for (; ; ) {
            OpenGL.glTexImage2Df(i_3_, i_8_, i_6_, i, i_5_, 0, i_2_, 5126, fs_12_, 0);
            if (i_9_ <= 1) break;
            int i_14_ = i * i_7_;
            float[] fs_15_ = fs_13_;
            for (int i_16_ = 0; i_16_ < i_7_; i_16_++) {
                int i_17_ = i_16_;
                int i_18_ = i_16_;
                int i_19_ = i_14_ + i_18_;
                for (int i_20_ = 0; i_11_ > i_20_; i_20_++) {
                    for (int i_21_ = 0; i_10_ > i_21_; i_21_++) {
                        float f = fs_12_[i_18_];
                        i_18_ += i_7_;
                        f += fs_12_[i_18_];
                        i_18_ += i_7_;
                        f += fs_12_[i_19_];
                        i_19_ += i_7_;
                        f += fs_12_[i_19_];
                        i_19_ += i_7_;
                        fs_13_[i_17_] = f * 0.25F;
                        i_17_ += i_7_;
                    }
                    i_18_ += i_14_;
                    i_19_ += i_14_;
                }
            }
            fs_13_ = fs_12_;
            fs_12_ = fs_15_;
            i = i_10_;
            i_5_ = i_11_;
            i_8_++;
            i_9_ >>= 1;
            i_10_ >>= 1;
            i_11_ >>= 1;
        }
    }

    Component210(int i, int i_22_, int i_23_, int i_24_, int i_25_, float f, float f_26_, float f_27_) {
        super(i, i_22_, i_23_, i_24_, i_25_);
        anInt5298 = (int) (4096.0F * f_27_);
        anInt5278 = (int) (f_26_ * 4096.0F);
        anInt5285 = anInt5279 = (int) (Math.pow(0.5, -f) * 4096.0);
    }

    static final boolean method552(int i, int i_28_, byte i_29_, int i_30_, int i_31_, int i_32_, byte[] is) {
        anInt5282++;
        int i_33_ = i_31_ % i_30_;
        int i_34_ = 39 / ((31 - i_29_) / 63);
        int i_35_;
        if (i_33_ != 0) i_35_ = i_30_ - i_33_;
        else i_35_ = 0;
        int i_36_ = -((i_28_ - -i_30_ + -1) / i_30_);
        int i_37_ = -((i_30_ + i_31_ - 1) / i_30_);
        for (int i_38_ = i_36_; i_38_ < 0; i_38_++) {
            for (int i_39_ = i_37_; i_39_ < 0; i_39_++) {
                if (is[i_32_] == 0) return true;
                i_32_ += i_30_;
            }
            i_32_ -= i_35_;
            if (is[i_32_ + -1] == 0) return true;
            i_32_ += i;
        }
        return false;
    }

    final void method546(int i, int i_40_, int i_41_) {
        if (i_41_ == -2) {
            if (i_40_ == 0) {
                anInt5280 = -(i >= 0 ? i : -i) + anInt5278;
                anInt5289 = 4096;
                anInt5280 = anInt5280 * anInt5280 >> 12;
                anInt5290 = anInt5280;
            } else {
                anInt5289 = anInt5280 * anInt5298 >> 12;
                if (anInt5289 < 0) anInt5289 = 0;
                else if (anInt5289 > 4096) anInt5289 = 4096;
                anInt5280 = anInt5278 + -(i < 0 ? -i : i);
                anInt5280 = anInt5280 * anInt5280 >> 12;
                anInt5280 = anInt5289 * anInt5280 >> 12;
                anInt5290 += anInt5280 * anInt5285 >> 12;
                anInt5285 = anInt5285 * anInt5279 >> 12;
            }
            anInt5292++;
        }
    }

    public static void method553(int i) {
        aClass105Array5294 = null;
        aClass351_5288 = null;
        if (i != 0) aClass297_5297 = null;
        aClass297_5297 = null;
    }

    /** CRC32 over {@code is[0..i_42_)}. {@code i} must be 5126. */
    static final int crc32(int i, int i_42_, byte[] is) {
        if (i != 5126) method553(52);
        anInt5284++;
        return Component382.computeCrc32(i_42_, true, is, 0);
    }

    /**
     * Submits {@link Component126#consoleInput} to {@link CommandHandler#handleCommand}
     * (console enter). When {@code silent} is false, echoes {@code --> ...} and clears the line.
     * <p>
     * {@code item <id> ...} echoes with the item name appended for readability
     * ({@code item 12345 1 (Abyssal whip)}); the string sent to the server stays undecorated.
     * <p>
     * On mobile, hides the soft keyboard after a real submit so the purple band shrinks
     * back to compact height and the inventory / world underneath are visible again
     * (history re-run used to leave the IME up and cover the whole game view).
     *
     * @param silent when {@code true}, run the command without echoing / clearing the prompt
     *               (e.g. console key path that peeks without Enter).
     * @param lengthGuard must differ from {@link Component126#consoleInput}{@
     *                    (obfuscator junk — callers pass {@code 0}).
     */
    static final void submitConsoleLine(boolean silent, int lengthGuard) {
        anInt5286++;
        if (lengthGuard != Component126.consoleInput.length()) {
            // Strip any prior "(name)" decoration (e.g. history up-arrow / re-run) before send.
            String raw = stripItemConsoleEcho(Component126.consoleInput);
            CommandHandler.handleCommand(raw, false, silent, (byte) -79);
            if (!silent) {
                Applet_Sub1.printConsole("--> " + decorateItemConsoleEcho(raw), 110);
                NodeSub38.consoleCursor = 0;
                Component126.consoleInput = "";
                Component92.consoleHistoryDepth = 0;
                // History taps deliberately skip host IME toggle; still drop the keyboard
                // here so spawn commands (item/tele/…) are not hidden under the expanded band.
                MobileKeyboard.requestHide("console-submit");
            }
        }
    }

    /**
     * True when {@code s} is an {@code item} admin command ({@code item} / {@code item ...}).
     */
    private static boolean isItemCommand(String s) {
        if (s == null) {
            return false;
        }
        String t = s.trim();
        if (t.length() < 4 || !t.regionMatches(true, 0, "item", 0, 4)) {
            return false;
        }
        return t.length() == 4 || t.charAt(4) == ' ';
    }

    /**
     * End index (exclusive) of {@code item <id> [amount]} in a trimmed item command,
     * or {@code -1} if the id is missing. Ignores a trailing {@code (name)} decoration
     * so names with nested parens (e.g. {@code Overload (4)}) do not confuse strip/decorate.
     */
    private static int itemCommandArgsEnd(String trimmed) {
        if (!isItemCommand(trimmed)) {
            return -1;
        }
        int i = 4; // after "item"
        int n = trimmed.length();
        while (i < n && trimmed.charAt(i) == ' ') {
            i++;
        }
        if (i >= n) {
            return -1;
        }
        // item-id (non-space token)
        while (i < n && trimmed.charAt(i) != ' ') {
            i++;
        }
        int afterId = i;
        while (i < n && trimmed.charAt(i) == ' ') {
            i++;
        }
        // optional item-amount (digits only — decoration starts with '(')
        if (i < n && trimmed.charAt(i) >= '0' && trimmed.charAt(i) <= '9') {
            while (i < n && trimmed.charAt(i) >= '0' && trimmed.charAt(i) <= '9') {
                i++;
            }
            return i;
        }
        return afterId;
    }

    /**
     * True when {@code trimmed} is {@code item <id> [amount] (…)} display decoration
     * (name may itself contain parentheses).
     */
    private static boolean hasItemConsoleDecoration(String trimmed) {
        int end = itemCommandArgsEnd(trimmed);
        if (end < 0) {
            return false;
        }
        String rest = trimmed.substring(end).trim();
        return rest.length() >= 2 && rest.charAt(0) == '(' && rest.charAt(rest.length() - 1) == ')';
    }

    /**
     * Appends {@code (itemName)} to {@code item <id> ...} for console history display.
     * Leaves non-item lines and already-decorated lines unchanged.
     */
    static String decorateItemConsoleEcho(String cmd) {
        if (cmd == null) {
            return null;
        }
        String trimmed = cmd.trim();
        if (trimmed.length() == 0) {
            return cmd;
        }
        if (!isItemCommand(trimmed)) {
            return cmd;
        }
        // Already decorated: "item 12345 1 (Name)" / "item 15332 (Overload (4))"
        if (hasItemConsoleDecoration(trimmed)) {
            return cmd;
        }
        int argsEnd = itemCommandArgsEnd(trimmed);
        if (argsEnd < 0) {
            return cmd;
        }
        String args = trimmed.substring(0, argsEnd).trim();
        String[] parts = args.split("\\s+");
        if (parts.length < 2) {
            return cmd;
        }
        int id;
        try {
            id = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            return cmd;
        }
        if (Exception_Sub1.itemDefinitions == null) {
            return cmd;
        }
        try {
            // First arg is obfuscator junk — must keep (junk-13)/59 != 0 or getItemDefinition divides by zero.
            ItemDefinition def = Exception_Sub1.itemDefinitions.getItemDefinition(90, id);
            if (def == null || def.itemName == null || def.itemName.length() == 0
                    || "null".equals(def.itemName)) {
                return cmd;
            }
            return args + " (" + def.itemName + ")";
        } catch (RuntimeException e) {
            // Never block console submit on a bad/missing item def.
            return cmd;
        }
    }

    /**
     * Removes a trailing {@code (itemName)} decoration from an {@code item ...} console line
     * so history recall / re-run still sends a clean admin command to the server.
     * Names with nested parens (e.g. {@code Overload (4)}) must not truncate mid-name.
     */
    static String stripItemConsoleEcho(String cmd) {
        if (cmd == null) {
            return null;
        }
        String trimmed = cmd.trim();
        if (!hasItemConsoleDecoration(trimmed)) {
            return cmd;
        }
        int end = itemCommandArgsEnd(trimmed);
        return trimmed.substring(0, end).trim();
    }

    final void method541(int i) {
        anInt5285 = anInt5279;
        anInt5290 >>= 4;
        anInt5295++;
        if (anInt5290 >= 0) {
            if (anInt5290 > 255) anInt5290 = 255;
        } else anInt5290 = 0;
        if (i != -1538606516) anInt5289 = 17;
        method550(anInt5287++, (byte) anInt5290, (byte) 14);
        anInt5290 = 0;
    }
}
