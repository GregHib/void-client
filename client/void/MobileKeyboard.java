/**
 * Mobile soft-keyboard bridge. Desktop no-ops; Android/iOS AwtHost picks this up via reflection.
 */
final class MobileKeyboard {
    private static int insetPx;
    private static int viewH = 1;
    private static int lastLoggedShift = -1;
    /** Unlifted screen Y/H of the text field that opened the IME. */
    private static int focusY;
    private static int focusH;
    /** Cached: client jar is shared; iOS host class is only on the RoboVM classpath. */
    private static boolean iosHost;
    private static boolean iosHostKnown;

    private MobileKeyboard() {
    }

    /** Called from the native host when the IME overlap changes (view pixels). */
    public static void setInset(int px, int viewHeight) {
        insetPx = px < 0 ? 0 : px;
        viewH = viewHeight < 1 ? 1 : viewHeight;
        if (insetPx == 0) {
            lastLoggedShift = -1;
        }
        System.out.println("void-osrs keyboard inset=" + insetPx + " viewH=" + viewH
                + " shift=" + shiftY());
    }

    /** Best Shift+click candidate this cycle (smallest useful widget). */
    private static DisplayModeManagerContainer57 pickBest;
    private static int pickBestArea = Integer.MAX_VALUE;
    private static int pickBestScore = -1;
    private static int pickCycle = -1;
    private static boolean pickPending;

    /** Called when the player presses a UI component (mouse-down). {@code screenY} is unlifted. */
    static void onInterfacePress(DisplayModeManagerContainer57 component, int screenX, int screenY) {
        if (component == null) {
            return;
        }
        // Shift+click: collect hits this cycle; {@link #flushWidgetPick} prints the best.
        if (isShiftDown()) {
            considerWidgetPick(component);
            return;
        }
        boolean keyListener = component.anObjectArray822 != null;
        boolean mouseDown = component.anObjectArray763 != null;
        int type = component.type;
        String text = component.textContent;
        if (text != null && text.length() > 48) {
            text = text.substring(0, 48);
        }
        int gameState = Component49.clientState;
        System.out.println("void-osrs ifPress id=" + component.packedId
                + " type=" + type
                + " keyListener=" + keyListener
                + " mouseDown=" + mouseDown
                + " state=" + gameState
                + " size=" + component.width + "x" + component.height
                + " xy=" + screenX + "," + screenY
                + " text=[" + text + "]");

        // Login root (type 0, 800x600) has a keyListener — must NOT open IME.
        // Real inputs are type-4 single-line text (login ~27px, chat ~17px).
        if (!isTextInput(component)) {
            return;
        }
        focusY = screenY;
        focusH = component.height;
        if (keyListener) {
            requestShow("keyListener id=" + component.packedId);
            return;
        }
        if (mouseDown && isLoginState(gameState)) {
            requestShow("loginText id=" + component.packedId + " state=" + gameState);
        }
    }

    /** Jagex keycode 81 = Shift ({@link Component280#aClass346_2449}). */
    private static boolean isShiftDown() {
        try {
            return Component280.aClass346_2449 != null
                    && Component280.aClass346_2449.isKeyDown(81, -122);
        } catch (Throwable ignored) {
            return false;
        }
    }

    /**
     * Remember the most specific widget under the cursor this cycle.
     * Skips fullscreen type-0 layers (the usual false positive).
     */
    private static void considerWidgetPick(DisplayModeManagerContainer57 c) {
        int cycle = OpenGlShader.clientCycle;
        if (cycle != pickCycle) {
            flushWidgetPick();
            pickCycle = cycle;
        }
        if (isBoringPick(c)) {
            return;
        }
        int area = c.width * c.height;
        if (area <= 0) {
            return;
        }
        int score = pickScore(c);
        if (area < pickBestArea || (area == pickBestArea && score > pickBestScore)) {
            pickBest = c;
            pickBestArea = area;
            pickBestScore = score;
            pickPending = true;
        }
    }

    /** True for huge empty layers that steal Shift+click identity. */
    private static boolean isBoringPick(DisplayModeManagerContainer57 c) {
        if (c.hidden) {
            return true;
        }
        if (c.width <= 0 || c.height <= 0) {
            return true;
        }
        // Fullscreen / near-fullscreen type-0 panels with no signal.
        if (c.type == 0 && isFullscreen(c) && c.spriteId < 0 && c.contentType == 0
                && !hasAnyOption(c) && firstNonEmpty(c.debugName, c.text, c.textContent, c.continueOption) == null) {
            return true;
        }
        int sw = Math.max(1, DisplayModeManagerContainer23.canvasWidth);
        int sh = Math.max(1, GlToolkitSub2.canvasHeight);
        long area = (long) c.width * (long) c.height;
        if (c.type == 0 && area >= (long) sw * sh * 70 / 100 && c.spriteId < 0 && !hasAnyOption(c)) {
            return true;
        }
        return false;
    }

    private static int pickScore(DisplayModeManagerContainer57 c) {
        int s = 0;
        if (c.spriteId >= 0) s += 4;
        if (c.contentType != 0) s += 3;
        if (c.type == 5 || c.type == 4 || c.type == 3) s += 2;
        if (hasAnyOption(c)) s += 3;
        if (firstNonEmpty(c.debugName, c.text, c.textContent, c.continueOption) != null) s += 2;
        if (c.itemId > 0) s += 1;
        // Prefer leaves over parents with children.
        if (c.children == null || c.children.length == 0) s += 1;
        return s;
    }

    private static boolean hasAnyOption(DisplayModeManagerContainer57 c) {
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, c, true);
            if ((opt == null || opt.length() == 0 || opt.startsWith("Hidden-"))
                    && c.optionLabels != null && i < c.optionLabels.length
                    && c.optionLabels[i] != null && c.optionLabels[i].trim().length() > 0) {
                opt = c.optionLabels[i];
            }
            if (opt != null && opt.length() > 0 && !opt.startsWith("Hidden-")) {
                return true;
            }
        }
        return false;
    }

    /**
     * Prints the best Shift+click hit for the finished cycle.
     * Called from {@link JoystickAlias#clientTick}.
     * <p>
     * Ctrl+Shift+click also dumps the whole IF group tree (containers + widgets)
     * so you can map an open interface from the view in one gesture.
     */
    static void flushWidgetPick() {
        if (!pickPending || pickBest == null) {
            pickPending = false;
            pickBest = null;
            pickBestArea = Integer.MAX_VALUE;
            pickBestScore = -1;
            return;
        }
        DisplayModeManagerContainer57 c = pickBest;
        pickPending = false;
        pickBest = null;
        pickBestArea = Integer.MAX_VALUE;
        pickBestScore = -1;
        printWidgetPick(c);
        // Ctrl (Jagex key 82) + Shift: dump full group tree for mapping.
        if (isCtrlDown()) {
            dumpGroupTree(c.packedId >>> 16);
        }
    }

    /** Jagex keycode 82 = Ctrl ({@link ClientScriptExecutor} / plane hotkeys). */
    private static boolean isCtrlDown() {
        try {
            return Component280.aClass346_2449 != null
                    && Component280.aClass346_2449.isKeyDown(82, -122);
        } catch (Throwable ignored) {
            return false;
        }
    }

    /**
     * Widgets are cache IF components ({@link DisplayModeManagerContainer57}), not
     * {@code Component*.java} files. Identity is {@code iface=group:child} + sprite/opts.
     * {@code debugName} is almost always empty in this build — {@code label=} is synthesized.
     * Also prints {@code parents=} (container chain toward root) and appends to
     * {@code widget-map/picks.jsonl} for progressive mapping.
     */
    private static void printWidgetPick(DisplayModeManagerContainer57 c) {
        int mx = -1;
        int my = -1;
        try {
            if (AbstractGlTextureSub4.mouseHandler != null) {
                mx = AbstractGlTextureSub4.mouseHandler.getCursorX(true);
                my = AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 100);
            }
        } catch (Throwable ignored) {
        }

        StringBuilder opts = new StringBuilder();
        String firstOpt = null;
        opts.append('[');
        boolean first = true;
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, c, true);
            if ((opt == null || opt.length() == 0 || opt.startsWith("Hidden-"))
                    && c.optionLabels != null && i < c.optionLabels.length
                    && c.optionLabels[i] != null && c.optionLabels[i].trim().length() > 0) {
                opt = c.optionLabels[i];
            }
            if (opt == null || opt.length() == 0 || opt.startsWith("Hidden-")) {
                continue;
            }
            if (!first) {
                opts.append(", ");
            }
            first = false;
            if (firstOpt == null) {
                firstOpt = opt.trim();
            }
            opts.append(i).append("='").append(opt.replace('\'', '"')).append('\'');
        }
        opts.append(']');

        String archiveName = firstNonEmpty(c.debugName, c.text, c.textContent, c.continueOption);
        String label = synthesizeLabel(c, archiveName, firstOpt);
        String parents = parentChain(c);
        int kids = c.children != null ? c.children.length : 0;

        StringBuilder b = new StringBuilder(360);
        b.append("void-osrs widget-pick");
        appendQuoted(b, " label", label);
        b.append(" iface=").append(c.packedId >>> 16).append(':').append(c.packedId & 0xffff);
        b.append(" packed=").append(c.packedId);
        b.append(" childIdx=").append(c.childIndex);
        b.append(" type=").append(c.type);
        b.append(" sprite=").append(c.spriteId);
        if (c.contentType != 0) {
            b.append(" contentType=").append(c.contentType);
        }
        if (c.itemId > 0) {
            b.append(" item=").append(c.itemId);
        }
        b.append(" size=").append(c.width).append('x').append(c.height);
        b.append(" abs=").append(c.absoluteX).append(',').append(c.absoluteY);
        b.append(" mouse=").append(mx).append(',').append(my);
        b.append(" kids=").append(kids);
        if (parents.length() > 0) {
            b.append(" parents=").append(parents);
        }
        if (archiveName != null) {
            appendQuoted(b, " archiveName", archiveName);
        }
        b.append(" opts=").append(opts);
        System.out.println(b.toString());
        appendMapPick(c, label, parents, opts.toString(), mx, my);
    }

    /** Readable label for logs / map file (never a Java filename). */
    private static String synthesizeLabel(DisplayModeManagerContainer57 c,
                                         String archiveName, String firstOpt) {
        String label = archiveName;
        if (label == null || label.length() == 0 || " ".equals(label)) {
            label = firstOpt;
        }
        if (label == null || label.length() == 0) {
            if (c.spriteId >= 0) {
                label = "sprite:" + c.spriteId;
            } else if (c.itemId > 0) {
                label = "item:" + c.itemId;
            } else if (c.contentType != 0) {
                label = "contentType:" + c.contentType;
            } else if (c.type == 0) {
                label = "layer:" + (c.packedId >>> 16) + ":" + (c.packedId & 0xffff);
            } else {
                label = "iface:" + (c.packedId >>> 16) + ":" + (c.packedId & 0xffff);
            }
        }
        return label;
    }

    /**
     * Walk {@link DisplayModeManagerContainer57#parent} / {@code parentId} toward root.
     * Format: {@code 746:0(t0) > 746:12(t0)} (root → … → immediate parent).
     */
    private static String parentChain(DisplayModeManagerContainer57 c) {
        StringBuilder sb = new StringBuilder();
        DisplayModeManagerContainer57 p = resolveParent(c);
        int depth = 0;
        DisplayModeManagerContainer57[] stack = new DisplayModeManagerContainer57[8];
        while (p != null && depth < stack.length) {
            stack[depth++] = p;
            p = resolveParent(p);
        }
        for (int i = depth - 1; i >= 0; i--) {
            if (sb.length() > 0) {
                sb.append(" > ");
            }
            DisplayModeManagerContainer57 n = stack[i];
            sb.append(n.packedId >>> 16).append(':').append(n.packedId & 0xffff);
            sb.append("(t").append(n.type).append(')');
            if (n.children != null && n.children.length > 0) {
                sb.append('[').append(n.children.length).append(']');
            }
        }
        return sb.toString();
    }

    private static DisplayModeManagerContainer57 resolveParent(DisplayModeManagerContainer57 c) {
        if (c == null) {
            return null;
        }
        if (c.parent != null) {
            return c.parent;
        }
        if (c.parentId == -1) {
            return null;
        }
        try {
            return BitmapFont.getComponent(1512932720, c.parentId);
        } catch (Throwable ignored) {
            return null;
        }
    }

    /**
     * Dump every loaded component in IF group {@code group} as an indented tree.
     * Printed to console and written to {@code widget-map/group-<id>.txt}.
     */
    private static void dumpGroupTree(int group) {
        DisplayModeManagerContainer57[][] roots = DefinitionSub33.openInterfaces;
        if (roots == null || group < 0 || group >= roots.length || roots[group] == null) {
            System.out.println("void-osrs widget-map: group " + group + " not open");
            return;
        }
        StringBuilder out = new StringBuilder(4096);
        out.append("void-osrs widget-map group=").append(group).append('\n');
        DisplayModeManagerContainer57[] comps = roots[group];
        int printed = 0;
        for (int i = 0; i < comps.length && printed < 800; i++) {
            DisplayModeManagerContainer57 c = comps[i];
            if (c == null || c.hidden) {
                continue;
            }
            // Only roots of the group (no parent in same group) — children via walk.
            if (c.parent != null && (c.parent.packedId >>> 16) == group) {
                continue;
            }
            if (c.parentId != -1 && (c.parentId >>> 16) == group) {
                continue;
            }
            printed += appendTreeNode(out, c, 0, printed);
        }
        if (printed == 0) {
            for (int i = 0; i < comps.length && printed < 800; i++) {
                DisplayModeManagerContainer57 c = comps[i];
                if (c == null || c.hidden) {
                    continue;
                }
                printed += appendTreeNode(out, c, 0, printed);
            }
        }
        String text = out.toString();
        System.out.print(text);
        writeMapFile("group-" + group + ".txt", text);
        System.out.println("void-osrs widget-map: wrote group-" + group
                + ".txt (" + printed + " nodes) → widget-map/");
    }

    private static int appendTreeNode(StringBuilder out, DisplayModeManagerContainer57 c,
                                      int depth, int already) {
        if (c == null || already >= 800 || depth > 12) {
            return 0;
        }
        for (int i = 0; i < depth; i++) {
            out.append("  ");
        }
        String label = synthesizeLabel(c,
                firstNonEmpty(c.debugName, c.text, c.textContent, c.continueOption), null);
        out.append(c.packedId >>> 16).append(':').append(c.packedId & 0xffff);
        out.append(" t").append(c.type);
        out.append(" '").append(label.replace('\'', '"')).append('\'');
        out.append(" ").append(c.width).append('x').append(c.height);
        out.append(" @").append(c.absoluteX).append(',').append(c.absoluteY);
        if (c.spriteId >= 0) {
            out.append(" spr=").append(c.spriteId);
        }
        if (c.contentType != 0) {
            out.append(" ct=").append(c.contentType);
        }
        if (c.children != null && c.children.length > 0) {
            out.append(" kids=").append(c.children.length);
        }
        out.append('\n');
        int n = 1;
        if (c.children != null) {
            for (int k = 0; k < c.children.length && already + n < 800; k++) {
                n += appendTreeNode(out, c.children[k], depth + 1, already + n);
            }
        }
        return n;
    }

    /** Append one Shift+click pick as JSONL under {@code widget-map/picks.jsonl}. */
    private static void appendMapPick(DisplayModeManagerContainer57 c, String label,
                                      String parents, String opts, int mx, int my) {
        try {
            java.io.File dir = mapDir();
            if (dir == null) {
                return;
            }
            if (!dir.exists() && !dir.mkdirs()) {
                return;
            }
            java.io.File f = new java.io.File(dir, "picks.jsonl");
            StringBuilder j = new StringBuilder(256);
            j.append('{');
            j.append("\"iface\":\"").append(c.packedId >>> 16).append(':')
                    .append(c.packedId & 0xffff).append('"');
            j.append(",\"packed\":").append(c.packedId);
            j.append(",\"childIndex\":").append(c.childIndex);
            j.append(",\"type\":").append(c.type);
            j.append(",\"sprite\":").append(c.spriteId);
            j.append(",\"contentType\":").append(c.contentType);
            j.append(",\"item\":").append(c.itemId);
            j.append(",\"w\":").append(c.width).append(",\"h\":").append(c.height);
            j.append(",\"x\":").append(c.absoluteX).append(",\"y\":").append(c.absoluteY);
            j.append(",\"mouseX\":").append(mx).append(",\"mouseY\":").append(my);
            j.append(",\"label\":\"").append(jsonEscape(label)).append('"');
            if (parents != null && parents.length() > 0) {
                j.append(",\"parents\":\"").append(jsonEscape(parents)).append('"');
            }
            j.append(",\"opts\":\"").append(jsonEscape(opts)).append('"');
            j.append("}\n");
            java.io.FileWriter fw = new java.io.FileWriter(f, true);
            try {
                fw.write(j.toString());
            } finally {
                fw.close();
            }
        } catch (Throwable t) {
            System.out.println("void-osrs widget-map: pick write failed: " + t);
        }
    }

    private static void writeMapFile(String name, String text) {
        try {
            java.io.File dir = mapDir();
            if (dir == null) {
                return;
            }
            if (!dir.exists() && !dir.mkdirs()) {
                return;
            }
            java.io.FileWriter fw = new java.io.FileWriter(new java.io.File(dir, name), false);
            try {
                fw.write(text);
            } finally {
                fw.close();
            }
        } catch (Throwable ignored) {
        }
    }

    /**
     * Map output dir: {@code -Dvoid.widget.map=} / {@code VOID_WIDGET_MAP} / default
     * {@code widget-map} next to the process cwd.
     */
    private static java.io.File mapDir() {
        String p = System.getProperty("void.widget.map");
        if (p == null || p.isEmpty()) {
            p = System.getenv("VOID_WIDGET_MAP");
        }
        if (p == null || p.isEmpty()) {
            p = "widget-map";
        }
        return new java.io.File(p);
    }

    private static String jsonEscape(String s) {
        if (s == null) {
            return "";
        }
        return s.replace("\\", "\\\\").replace("\"", "\\\"")
                .replace("\n", " ").replace("\r", "");
    }

    private static String firstNonEmpty(String a, String b, String c, String d) {
        if (a != null && a.trim().length() > 0) return a.trim();
        if (b != null && b.trim().length() > 0) return b.trim();
        if (c != null && c.trim().length() > 0) return c.trim();
        if (d != null && d.trim().length() > 0) return d.trim();
        return null;
    }

    private static void appendQuoted(StringBuilder b, String key, String value) {
        b.append(key).append('=');
        if (value == null) {
            b.append("null");
            return;
        }
        String v = value;
        if (v.length() > 64) {
            v = v.substring(0, 64) + "…";
        }
        b.append('\'').append(v.replace('\'', '"').replace('\n', ' ')).append('\'');
    }

    /** Single-line text widget suitable for soft-keyboard focus. */
    private static boolean isTextInput(DisplayModeManagerContainer57 c) {
        if (c.type != 4 || isFullscreen(c)) {
            return false;
        }
        int h = c.height;
        return h > 0 && h <= 48;
    }

    /**
     * Pixels to subtract from this widget's screen Y (chatbox layer only).
     * Applied in draw + input so children follow via parent offset.
     * Only the gameframe slot (parent fullscreen) is lifted — lifting a nested
     * 137 inside an unmoved clip makes the chat draw off-clip and vanish.
     */
    static int liftPx(DisplayModeManagerContainer57 c, int screenX, int screenY) {
        // Dev console sits at the top — never shove chat up while it's open.
        if (StringCache.devConsoleOpen) {
            return 0;
        }
        int shift = shiftY();
        if (shift <= 0 || c == null || isLoginState(Component49.clientState)) {
            return 0;
        }
        DisplayModeManagerContainer57 parent = c.parent;
        if (parent != null && !isFullscreen(parent)) {
            return 0;
        }
        if (!inChatBand(c, screenX, screenY)) {
            return 0;
        }
        int maxLift = Math.max(0, screenY - 4);
        int lift = shift < maxLift ? shift : maxLift;
        if (lift != lastLoggedShift) {
            lastLoggedShift = lift;
            System.out.println("void-osrs chatLift shift=" + lift
                    + " kb=" + shift
                    + " id=" + c.packedId
                    + " xy=" + screenX + "," + screenY
                    + " size=" + c.width + "x" + c.height
                    + " state=" + Component49.clientState);
        }
        return lift;
    }

    /**
     * Login interface 744 — lift just enough that the focused field sits a bit
     * above the IME, not the full keyboard height.
     */
    static int loginLayerShift() {
        if (!isLoginState(Component49.clientState)) {
            return 0;
        }
        int kb = shiftY();
        if (kb <= 0 || focusH <= 0) {
            return 0;
        }
        int gh = GlToolkitSub2.canvasHeight;
        if (gh <= 0) {
            gh = 503;
        }
        int kbTop = gh - kb;
        // Android: 12px gap above IME. iOS keyboard frame is short vs the
        // predictive bar / home indicator, so keep at least +30 extra.
        int pad = 12;
        if (isIosHost()) {
            pad += 30;
        }
        int need = focusY + focusH + pad - kbTop;
        if (need <= 0) {
            return 0;
        }
        if (need > kb) {
            need = kb;
        }
        if (need > focusY) {
            need = Math.max(0, focusY);
        }
        return need;
    }

    /** Keep 744 hit-testing aligned with {@link #loginLayerShift()} draw offset. */
    static int loginHitShift(DisplayModeManagerContainer57 c) {
        if (c == null || (c.packedId >>> 16) != 744) {
            return 0;
        }
        return loginLayerShift();
    }

    private static boolean inChatBand(DisplayModeManagerContainer57 c, int screenX, int screenY) {
        int sw = Math.max(1, DisplayModeManagerContainer23.canvasWidth);
        int sh = Math.max(1, GlToolkitSub2.canvasHeight);
        if (isFullscreen(c)) {
            return false;
        }
        int h = c.height;
        int w = c.width;
        if (h > sh * 45 / 100 || h < 40) {
            return false;
        }
        if (screenX > sw / 2) {
            return false;
        }
        if (screenY + h < sh * 70 / 100) {
            return false;
        }
        int iface = c.packedId >>> 16;
        if (iface == 137) {
            return true;
        }
        return w >= 120;
    }

    private static boolean isFullscreen(DisplayModeManagerContainer57 c) {
        int sw = Math.max(1, DisplayModeManagerContainer23.canvasWidth);
        int sh = Math.max(1, GlToolkitSub2.canvasHeight);
        return c.width >= sw - 8 && c.height >= sh - 8;
    }

    /** Title / login / lobby — not the in-game world (state 10). */
    private static boolean isLoginState(int gameState) {
        return gameState == 0 || gameState == 3 || gameState == 7;
    }

    private static boolean isIosHost() {
        if (!iosHostKnown) {
            iosHostKnown = true;
            try {
                Class.forName("world.gregs.voidosrs.ios.GameController");
                iosHost = true;
            } catch (Throwable ignored) {
            }
        }
        return iosHost;
    }

    /**
     * How many canvas pixels the soft keyboard covers from the bottom.
     * Unlike {@link #shiftY()}, this is <b>not</b> capped — used to size the
     * purple developer console so its bottom sits just above the IME.
     */
    static int imeCoverCanvasPx() {
        int px = insetPx;
        int vh = viewH;
        try {
            Class<?> host = Class.forName("voidawt.AwtHost");
            px = host.getField("KEYBOARD_INSET_PX").getInt(null);
            int hostH = host.getField("VIEW_HEIGHT_PX").getInt(null);
            if (hostH > 1) {
                vh = hostH;
            }
        } catch (Throwable ignored) {
        }
        if (px <= 0 || vh < 32) {
            return 0;
        }
        int canvasH = PacketReader.canvasHeight;
        if (canvasH <= 0) {
            canvasH = GlToolkitSub2.canvasHeight;
        }
        if (canvasH <= 0) {
            return 0;
        }
        int cover = px * canvasH / vh;
        if (cover > canvasH - 8) {
            cover = canvasH - 8;
        }
        return cover;
    }

    private static int shiftY() {
        int px = insetPx;
        int vh = viewH;
        try {
            Class<?> host = Class.forName("voidawt.AwtHost");
            px = host.getField("KEYBOARD_INSET_PX").getInt(null);
            int hostH = host.getField("VIEW_HEIGHT_PX").getInt(null);
            if (hostH > 1) {
                vh = hostH;
            }
        } catch (Throwable ignored) {
        }
        if (px <= 0 || vh < 32) {
            return 0;
        }
        int gh = GlToolkitSub2.canvasHeight;
        if (gh <= 0) {
            gh = 503;
        }
        int shift = px * gh / vh;
        int cap = gh * 50 / 100;
        if (shift > cap) {
            shift = cap;
        }
        return shift;
    }

    static void requestShow(String reason) {
        System.out.println("void-osrs keyboard REQUEST show (" + reason + ")");
        try {
            Class.forName("voidawt.AwtHost")
                    .getMethod("requestSoftKeyboard", String.class)
                    .invoke(null, reason);
        } catch (Throwable ignored) {
        }
    }

    static void requestHide(String reason) {
        System.out.println("void-osrs keyboard REQUEST hide (" + reason + ")");
        try {
            Class.forName("voidawt.AwtHost")
                    .getMethod("requestHideSoftKeyboard", String.class)
                    .invoke(null, reason);
        } catch (Throwable ignored) {
        }
    }
}
