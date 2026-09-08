/* BuildInfo - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class6` (JODE-obfuscated).
 * Build/version info ('Build: 634') plus the developer-console overlay:
 * {@link #drawDevConsole}, {@link #pollConsoleInput}, {@link #consoleBandHeight}.
 */

final class BuildInfo {
    short aShort143;
    int anInt144;
    boolean aBoolean145;
    short aShort146;
    static int anInt147;
    byte aByte148;
    static int anInt149;
    short aShort150;
    static Component150 aClass227_151 = new Component150(2);
    static int anInt152;
    static int anInt153;
    int anInt154;
    static int anInt155;
    byte aByte156;

    static final void method203(int i, int i_0_, int i_1_, int i_2_, int i_3_) {
        anInt149++;
        int i_4_ = 0;
        if (i > -92) aClass227_151 = null;
        int i_5_ = i_3_;
        int i_6_ = -i_3_;
        int i_7_ = -1;
        int i_8_ = LogicError.clamp(Component22.anInt1745, i_3_ + i_0_, Component27.anInt4960, -108);
        int i_9_ = LogicError.clamp(Component22.anInt1745, -i_3_ + i_0_, Component27.anInt4960, 81);
        MenuOpener.fillInts(-27, i_8_, DisplayModeManagerContainer167.anIntArrayArray255[i_2_], i_9_, i_1_);
        while (i_5_ > i_4_) {
            i_7_ += 2;
            i_6_ += i_7_;
            if (i_6_ > 0) {
                i_5_--;
                i_6_ -= i_5_ << 1;
                int i_10_ = -i_5_ + i_2_;
                int i_11_ = i_5_ + i_2_;
                if (i_11_ >= Component72.anInt1910 && PauseTimer.anInt513 >= i_10_) {
                    int i_12_ = LogicError.clamp(Component22.anInt1745, i_4_ + i_0_, Component27.anInt4960, 74);
                    int i_13_ = LogicError.clamp(Component22.anInt1745, i_0_ + -i_4_, Component27.anInt4960, 98);
                    if (i_11_ <= PauseTimer.anInt513) MenuOpener.fillInts(-27, i_12_, (DisplayModeManagerContainer167.anIntArrayArray255[i_11_]), i_13_, i_1_);
                    if (Component72.anInt1910 <= i_10_) MenuOpener.fillInts(-27, i_12_, (DisplayModeManagerContainer167.anIntArrayArray255[i_10_]), i_13_, i_1_);
                }
            }
            int i_14_ = -++i_4_ + i_2_;
            int i_15_ = i_2_ - -i_4_;
            if (Component72.anInt1910 <= i_15_ && PauseTimer.anInt513 >= i_14_) {
                int i_16_ = LogicError.clamp(Component22.anInt1745, i_0_ + i_5_, Component27.anInt4960, 52);
                int i_17_ = LogicError.clamp(Component22.anInt1745, i_0_ + -i_5_, Component27.anInt4960, -106);
                if (i_15_ <= PauseTimer.anInt513) MenuOpener.fillInts(-27, i_16_, DisplayModeManagerContainer167.anIntArrayArray255[i_15_], i_17_, i_1_);
                if (i_14_ >= Component72.anInt1910) MenuOpener.fillInts(-27, i_16_, DisplayModeManagerContainer167.anIntArrayArray255[i_14_], i_17_, i_1_);
            }
        }
    }

    static final void method204(int i) {
        anInt155++;
        while (Component80.packetBuffer.method3415(-62, DefinitionSub25.anInt9341) >= 15) {
            int i_18_ = Component80.packetBuffer.readBits((byte) -24, 15);
            if (i_18_ == 32767) break;
            boolean bool = false;
            NpcNode class348_sub22 = ((NpcNode) Component21.aClass356_3654.get(i_18_, -6008));
            if (class348_sub22 == null) {
                Npc npc = new Npc();
                npc.anInt10290 = i_18_;
                class348_sub22 = new NpcNode(npc);
                Component21.aClass356_3654.put((byte) 57, i_18_, class348_sub22);
                bool = true;
                DefinitionSub23.aClass348_Sub22Array9319[NodeSub32.anInt6930++] = class348_sub22;
            }
            Npc npc = (class348_sub22.npc);
            DisplayModeManagerContainer238.anIntArray1233[Component324.anInt2057++] = i_18_;
            npc.anInt10306 = OggStreamReader.anInt9041;
            if ((npc.definition) != null && npc.definition.method793(0)) Component298.method181(true, npc);
            int i_19_ = Component80.packetBuffer.readBits((byte) -24, 2);
            int i_20_ = Component80.packetBuffer.readBits((byte) -24, 1);
            int i_21_ = Component80.packetBuffer.readBits((byte) -24, 5);
            if (i_21_ > 15) i_21_ -= 32;
            int i_22_ = Component80.packetBuffer.readBits((byte) -24, 5);
            if (i_22_ > 15) i_22_ -= 32;
            int i_23_ = 0x3d01 & 4 + Component80.packetBuffer.readBits((byte) -24, 3) << 11;
            int i_24_ = Component80.packetBuffer.readBits((byte) -24, 1);
            if (i_24_ == 1) Component354.anIntArray224[DisplayModeManagerContainer204.anInt1597++] = i_18_;
            npc.method2448((Component291.aClass278_2529.method2079(Component80.packetBuffer.readBits((byte) -24, 14), -1)), i ^ 0x2b297815);
            npc.method2434((byte) 111, npc.definition.anInt1399);
            npc.anInt10310 = (npc.definition.anInt1329) << 3;
            if (bool) npc.method2435((byte) -108, i_23_, true);
            npc.method2444((Component72.localPlayer.anIntArray10317[0]) - -i_21_, i_20_ == 1, (Component72.localPlayer.anIntArray10320[0]) + i_22_, i + 724138125, npc.getSize((byte) 50), i_19_);
            if (npc.definition.method793(0)) DisplayModeManagerContainer369.method1614(979190089, npc, npc.plane, (npc.anIntArray10317[0]), (npc.anIntArray10320[0]), null, null, 0);
        }
        if (i == -724138005) Component80.packetBuffer.stopBitAccess(false);
    }

    static final void method205(int i, int i_25_, int i_26_, String string, int i_27_, int i_28_, int i_29_, int i_30_) {
        try {
            anInt147++;
            RenderableSub5 class318_sub5 = new RenderableSub5();
            class318_sub5.anInt6419 = i_25_;
            class318_sub5.anInt6418 = i_30_;
            class318_sub5.anInt6422 = i_29_;
            class318_sub5.anInt6421 = i + OpenGlShader.clientCycle;
            if (i_28_ >= -48) blendArgb(-90, -126, -8);
            class318_sub5.aString6416 = string;
            class318_sub5.anInt6415 = i_26_;
            class318_sub5.anInt6420 = i_27_;
            Component241.aClass243_2957.method1869(-103, class318_sub5);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("go.F(" + i + ',' + i_25_ + ',' + i_26_ + ',' + (string != null ? "{...}" : "null") + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ')'));
        }
    }

    /** Alpha-composite {@code i_31_} over {@code i_32_}. */
    static final int blendArgb(int i, int i_31_, int i_32_) {
        anInt152++;
        int i_33_ = i_31_ >>> 24;
        int i_34_ = -i_33_ + i_32_;
        i_31_ = (0xff0000 & (i_31_ & 0xff00) * i_33_ | (0xff00ff & i_31_) * i_33_ & ~0xff00ff) >>> 8;
        return i_31_ + (((i & 0xff00) * i_34_ & 0xff0000 | ~0xff00ff & (0xff00ff & i) * i_34_) >>> 8);
    }

    /**
     * Pixel height of the purple developer-console band.
     * <ul>
     *   <li>Desktop: fixed 350.</li>
     *   <li>Mobile, IME closed: compact 175.</li>
     *   <li>Mobile, IME open: fills from window top down to just above the keyboard
     *       so the prompt stays visible while typing commands.</li>
     * </ul>
     */
    static int consoleBandHeight() {
        int compact = isMobile() ? 175 : 350;
        if (!isMobile() || !StringCache.devConsoleOpen) {
            return compact;
        }
        int cover = MobileKeyboard.imeCoverCanvasPx();
        if (cover <= 0) {
            return compact;
        }
        int canvasH = PacketReader.canvasHeight;
        if (canvasH <= 0) {
            canvasH = GlToolkitSub2.canvasHeight;
        }
        // Bottom of purple sits 20px above the keyboard top.
        int filled = canvasH - cover - 30;
        if (filled < compact) {
            return compact;
        }
        if (filled > canvasH - 8) {
            filled = canvasH - 8;
        }
        return filled;
    }

    /**
     * Last height actually drawn for the purple band.
     * <p>
     * Mobile hosts hide the IME on console tap <b>before</b> the game loop drains
     * the injected click ({@code KEYBOARD_INSET_PX → 0}). Without this sticky height,
     * {@link #consoleBandHeight()} snaps back to compact and the lower (expanded)
     * region stops consuming presses — walk / iface clicks pass through the purple.
     */
    private static int lastDrawnConsoleH;

    /**
     * Hit-test height: at least the last drawn band, so a tap that dismisses the
     * keyboard still lands inside the purple that was on screen when the finger went down.
     */
    private static int consoleHitHeight() {
        int h = consoleBandHeight();
        if (lastDrawnConsoleH > h) {
            h = lastDrawnConsoleH;
        }
        return h;
    }

    /**
     * Cursor currently over the open console band — refreshed by {@link #pollConsoleInput()}.
     * Used by {@link DisplayModeManagerContainer1#updateMenuTip} to suppress walk / menus.
     */
    private static boolean consoleMouseOver;

    /** Finger/mouse gesture started on the purple band (press → drag or tap). */
    private static boolean consoleGestureActive;
    /** Canvas Y where the gesture began (tap hit-test uses this, not release Y). */
    private static int consoleGestureStartY;
    /** {@link Component94#consoleScroll} at gesture start — drag scrolls relative to this. */
    private static int consoleGestureStartScroll;
    /** True once movement exceeds {@link #CONSOLE_TAP_SLOP_PX} — tap will not re-run a command. */
    private static boolean consoleGestureDragged;
    /** {@link OpenGlShader#clientCycle} after last re-run — debounce double-taps. */
    private static int consoleRerunCycle;

    /** Pixels of movement before a press is treated as scroll instead of a tap. */
    private static final int CONSOLE_TAP_SLOP_PX = 28;
    /** Extra vertical gap between history cells (hit + draw spacing). */
    private static final int CONSOLE_CELL_GAP = 10;
    /**
     * Minimum height of the {@code -->} write strip (keyboard open zone).
     * Larger than the font metrics so the soft-keyboard tap target is easy on mobile.
     */
    private static final int CONSOLE_PROMPT_MIN_H = 30;
    /** Ignore a second re-run within this many client cycles (~0.5s at 50fps). */
    private static final int CONSOLE_RERUN_DEBOUNCE = 25;

    /** {@code true} when the console is open and the cursor is over its band this frame. */
    static boolean isMouseOverConsole() {
        return consoleMouseOver && StringCache.devConsoleOpen;
    }

    /** Row pitch for history cells: font line height + gap (avoids fat-finger double hits). */
    private static int consoleCellPitch() {
        int lineH = Component342.consoleLineHeight;
        if (lineH < 1) {
            lineH = 16;
        }
        return lineH + CONSOLE_CELL_GAP;
    }

    /**
     * Prompt strip height: separator → bottom of purple.
     * Floored at {@link #CONSOLE_PROMPT_MIN_H} so the keyboard tap target stays large.
     */
    private static int consolePromptStripH() {
        int promptH = ImageProducerSprite.consolePromptHeight;
        if (promptH < 1) {
            promptH = Component342.consoleLineHeight + 4;
        }
        if (promptH < CONSOLE_PROMPT_MIN_H) {
            promptH = CONSOLE_PROMPT_MIN_H;
        }
        return promptH;
    }

    /**
     * Hit-test in canvas coordinates (same space as
     * {@link MouseHandler#getCursorX} / {@link MouseHandler#getCursorY}).
     * Console is always anchored at the top of the game canvas.
     */
    static boolean consoleContains(int x, int y) {
        if (!StringCache.devConsoleOpen) {
            return false;
        }
        return x >= 0 && x < Component236.canvasWidth
                && y >= 0 && y < consoleHitHeight();
    }

    /**
     * True only on the {@code -->} write strip (bottom of the purple band).
     * Mobile hosts open/toggle the soft keyboard <b>only</b> here — history taps
     * must re-run commands without raising the IME.
     * <p>
     * Public: looked up by reflection from {@code voidawt.AwtHost}.
     */
    public static boolean isConsolePromptTap(int x, int y) {
        if (!StringCache.devConsoleOpen) {
            return false;
        }
        if (x < 0 || x >= Component236.canvasWidth) {
            return false;
        }
        // Drawn band height (not sticky) so history never counts as prompt.
        int h = consoleBandHeight();
        int promptH = consolePromptStripH();
        return y >= h - promptH && y < h;
    }

    /** Clamp console history scroll index (same bounds as {@link PauseTimer#processDevConsoleInput}). */
    private static void setConsoleScroll(int scroll) {
        int max = Component14.consoleLineCount - 1;
        if (max < 0) {
            max = 0;
        }
        if (scroll < 0) {
            scroll = 0;
        } else if (scroll > max) {
            scroll = max;
        }
        Component94.consoleScroll = scroll;
    }

    /**
     * Extract {@code cmd} from a {@code "HH:MM:SS: --> cmd"} history line, or null.
     * Strips {@code item ... (name)} display decoration so re-run sends a clean command.
     */
    private static String commandFromHistoryLine(String line) {
        if (line == null) {
            return null;
        }
        int arrow = line.indexOf("--> ");
        if (arrow < 0) {
            arrow = line.indexOf("-->");
            if (arrow < 0) {
                return null;
            }
            String cmd = line.substring(arrow + 3).trim();
            if (cmd.length() == 0) {
                return null;
            }
            return Component210.stripItemConsoleEcho(cmd);
        }
        String cmd = line.substring(arrow + 4).trim();
        if (cmd.length() == 0) {
            return null;
        }
        return Component210.stripItemConsoleEcho(cmd);
    }

    /**
     * Full-width cell hit-test for a {@code -->} history line, then re-submit.
     * Cells use {@link #consoleCellPitch()} (line + gap); the gap is a dead zone so
     * adjacent commands are harder to double-fire. Prompt strip is ignored.
     * Geometry matches {@link #drawDevConsole} (drawn band height, not sticky hit height).
     */
    private static void tryRerunCommandAt(int y) {
        if (ArbShaderProgram.consoleLines == null || Component14.consoleLineCount <= 0) {
            return;
        }
        if (OpenGlShader.clientCycle - consoleRerunCycle < CONSOLE_RERUN_DEBOUNCE
                && OpenGlShader.clientCycle >= consoleRerunCycle) {
            return;
        }
        int lineH = Component342.consoleLineHeight;
        if (lineH < 1) {
            return;
        }
        int pitch = consoleCellPitch();
        int consoleH = consoleBandHeight();
        int promptH = consolePromptStripH();
        int historyBottom = consoleH - promptH;
        if (y < 0 || y >= historyBottom) {
            return;
        }
        // Bottom-up cells matching draw: vis 0 = newest, just above the prompt.
        int fromBottom = historyBottom - 1 - y;
        int vis = fromBottom / pitch;
        int within = fromBottom % pitch;
        // Dead zone = top CONSOLE_CELL_GAP of each cell (padding between rows).
        if (within >= lineH) {
            return;
        }
        int lineIndex = Component94.consoleScroll + vis;
        if (lineIndex < 0 || lineIndex >= Component14.consoleLineCount) {
            return;
        }
        String cmd = commandFromHistoryLine(ArbShaderProgram.consoleLines[lineIndex]);
        if (cmd == null) {
            return;
        }
        Component126.consoleInput = cmd;
        NodeSub38.consoleCursor = cmd.length();
        Component210.submitConsoleLine(false, 0);
        consoleRerunCycle = OpenGlShader.clientCycle;
    }

    /**
     * Consume mouse presses that land on the purple console band so they do not
     * reach walk / tip menus / interface click handlers underneath.
     * <p>
     * Also handles mobile-friendly interaction:
     * <ul>
     *   <li>One-finger drag scrolls history ({@link Component94#consoleScroll}).</li>
     *   <li>Tap on a {@code --> } history cell re-submits that command (no IME).</li>
     * </ul>
     * Same pattern as {@link MicrobotPanel#pollInput}: unlink from
     * {@link Component327#aClass262_8744} after mouse drain, before
     * {@link DisplayModeManagerContainer1#updateMenuTip}. Event types 0/1/2 =
     * left/middle/right press ({@link Component307#method3584}).
     */
    static void pollConsoleInput() {
        consoleMouseOver = false;
        if (!StringCache.devConsoleOpen || AbstractGlTextureSub4.mouseHandler == null) {
            consoleGestureActive = false;
            lastDrawnConsoleH = 0;
            return;
        }
        try {
            int mx = AbstractGlTextureSub4.mouseHandler.getCursorX(true);
            int my = AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 100);
            consoleMouseOver = consoleContains(mx, my);

            Node node = Component327.aClass262_8744.first(4);
            while (node != null) {
                Node next = Component327.aClass262_8744.next((byte) 79);
                if (node instanceof NodeSub45) {
                    NodeSub45 click = (NodeSub45) node;
                    int type = click.getEventType(86);
                    // 0=left, 1=middle, 2=right press — releases/wheel stay elsewhere.
                    if (type == 0 || type == 1 || type == 2) {
                        int cx = click.getX((byte) -128);
                        int cy = click.getY(33);
                        if (consoleContains(cx, cy)) {
                            if (type == 0) {
                                // Start tap-or-drag gesture on left press.
                                consoleGestureActive = true;
                                consoleGestureStartY = cy;
                                consoleGestureStartScroll = Component94.consoleScroll;
                                consoleGestureDragged = false;
                            }
                            click.unlink((byte) 97);
                        }
                    }
                }
                node = next;
            }

            if (consoleGestureActive) {
                if (AbstractGlTextureSub4.mouseHandler.isLeftButtonDown(-91)) {
                    int dy = my - consoleGestureStartY;
                    if (dy < 0) {
                        dy = -dy;
                    }
                    if (dy > CONSOLE_TAP_SLOP_PX) {
                        consoleGestureDragged = true;
                    }
                    int pitch = consoleCellPitch();
                    // Natural mobile scroll (content follows finger): finger down → older
                    // history (higher consoleScroll). Opposite of the old inverted sign.
                    // Wheel path: PauseTimer uses mouseWheelDelta the other way around
                    // (positive notches → lower scroll) — same end UX as “scroll down”.
                    setConsoleScroll(consoleGestureStartScroll
                            + (my - consoleGestureStartY) / pitch);
                } else {
                    // Release / injectLeftClick same-frame: short tap re-runs a --> cell.
                    // Does not open the keyboard — that is prompt-only on the native host.
                    if (!consoleGestureDragged) {
                        tryRerunCommandAt(consoleGestureStartY);
                    }
                    consoleGestureActive = false;
                }
            }
        } catch (Throwable t) {
            consoleGestureActive = false;
            System.out.println("dev-console input: " + t.getMessage());
        }
    }

    /**
     * Draw the purple developer-console overlay (history + prompt + caret).
     * Band height from {@link #consoleBandHeight()}; scroll from {@link Component94#consoleScroll}.
     */
    static final void drawDevConsole(GraphicsToolkit var_ha, byte i) {
        do {
            try {
                anInt153++;
                int i_35_ = 0;
                int i_36_ = 0;
                if (i < 113) aClass227_151 = null;
                if (Component210.gameCanvasAttached) {
                    i_35_ = BufferCacheSub3.method4008((byte) -127);
                    i_36_ = Component110.method260(false);
                }
                // Purple band: compact by default; expands to IME top when keyboard is up.
                final int consoleH = consoleBandHeight();
                lastDrawnConsoleH = consoleH;
                final int scrollTrack = consoleH - 8;
                final int cellPitch = consoleCellPitch();
                final int promptH = consolePromptStripH();
                var_ha.KA(i_35_, i_36_, Component236.canvasWidth + i_35_, i_36_ + consoleH);
                var_ha.fillRect2D(i_35_, i_36_, Component236.canvasWidth, consoleH, 0x332277 | Component39.consoleFadeAlpha << 24, 1);
                Component103.method2663(-5590, i_35_, Component236.canvasWidth + i_35_, i_36_, i_36_ + consoleH);
                int i_37_ = (consoleH - promptH) / cellPitch;
                if (i_37_ < 1) {
                    i_37_ = 1;
                }
                if (Component14.consoleLineCount > 0) {
                    int i_38_ = scrollTrack + -cellPitch;
                    int i_39_ = (i_37_ * i_38_ / (-1 + (i_37_ - -Component14.consoleLineCount)));
                    int i_40_ = 4;
                    if (Component14.consoleLineCount > 1) i_40_ += ((Component14.consoleLineCount + (-1 + -Component94.consoleScroll)) * (i_38_ - i_39_) / (Component14.consoleLineCount + -1));
                    var_ha.fillRect2D(-16 + (Component236.canvasWidth + i_35_), i_36_ + i_40_, 12, i_39_, 0x332277 | Component39.consoleFadeAlpha << 24, 2);
                    for (int i_41_ = Component94.consoleScroll; ((i_41_ < i_37_ + Component94.consoleScroll) && Component14.consoleLineCount > i_41_); i_41_++) {
                        String[] strings = (DefinitionSub23.splitByChar('\010', true, ArbShaderProgram.consoleLines[i_41_]));
                        int i_42_ = (-16 + Component236.canvasWidth + -8) / strings.length;
                        for (int i_43_ = 0; i_43_ < strings.length; i_43_++) {
                            int i_44_ = i_42_ * i_43_ + 8;
                            var_ha.KA(i_35_ + i_44_, i_36_, i_42_ + i_35_ - (-i_44_ - -8), i_36_ + consoleH);
                            // Same bottom-up cell pitch as tryRerunCommandAt (line + gap).
                            Applet_Sub1.aClass324_20.drawText(AudioMixer.redactConsoleLine((byte) 31, strings[i_43_]), -1, (-((-Component94.consoleScroll + i_41_) * cellPitch) + (-promptH + i_36_ - (-consoleH - (-2 + -(Component163.aClass143_3179.descent))))), i_35_ + i_44_, -16777216, -110);
                        }
                    }
                }
                Component49.aClass324_4684.drawTextRightAligned("Build: 634", consoleH + (i_36_ + -20), -1, (Component236.canvasWidth + i_35_ + -25), -121, -16777216);
                var_ha.KA(i_35_, i_36_, i_35_ - -Component236.canvasWidth, i_36_ - -consoleH);
                var_ha.method3649((byte) -80, Component236.canvasWidth, -promptH + (consoleH + i_36_), -1, i_35_);
                NodeList.aClass324_3326.drawText("--> " + AudioMixer.redactConsoleLine((byte) 31, Component126.consoleInput), -1, (i_36_ - (-consoleH + Component27.aClass143_4962.descent) - 1), 10 + i_35_, -16777216, -127);
                if (!Component143.aBoolean2329) break;
                int i_45_ = -1;
                if (OpenGlShader.clientCycle % 30 > 15) i_45_ = 16777215;
                var_ha.method3660(10 + (i_35_ - -(Component27.aClass143_4962.stringWidth(true, "--> " + (AudioMixer.redactConsoleLine((byte) 31, Component126.consoleInput).substring(0, NodeSub38.consoleCursor))))), i_45_, 12, consoleH + (i_36_ + -Component27.aClass143_4962.descent - 11), true);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("go.B(" + (var_ha != null ? "{...}" : "null") + ',' + i + ')'));
            }
            break;
        } while (false);
    }

    public static void method208(byte i) {
        if (i != 0) method204(29);
        aClass227_151 = null;
    }

    /** Android/iOS rewrite to {@code voidawt}; desktop keeps {@code java.awt}. */
    static boolean isMobile() {
        try {
            Class.forName("voidawt.AwtHost");
            return true;
        } catch (Throwable ignored) {
            return false;
        }
    }

    /** Explicit GC stalls the game thread for seconds on mobile ART — skip there. */
    static void maybeGc() {
        if (!isMobile()) {
            System.gc();
        }
    }

    BuildInfo(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_, boolean bool, int i_54_) {
        this.aBoolean145 = bool;
        this.aByte156 = (byte) i_53_;
        this.anInt154 = i_54_;
        this.aShort143 = (short) i_50_;
        this.aByte148 = (byte) i_52_;
        this.aShort146 = (short) i_51_;
        this.aShort150 = (short) i_49_;
        this.anInt144 = i;
    }
}
