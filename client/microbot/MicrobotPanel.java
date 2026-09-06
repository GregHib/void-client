/**
 * Microbot mini HUD — canvas overlay (not an RS {@link DisplayModeManagerContainer57} iface, not Swing).
 * <p>
 * <b>Draw:</b> {@link GraphicsToolkit#fillRect} for the translucent box + {@link BitmapFont#drawText}
 * for left-aligned labels (same stack as the developer console / FPS overlay).
 * Wired from {@code client} after the console draw so the panel sits on top of the
 * game world.
 * <p>
 * <b>Input:</b> {@link #pollInput()} runs right after mouse events are copied into
 * {@link Component327#aClass262_8744}. Left-presses inside the panel are
 * unlinked ({@link Node#unlink}) so walk / tip menus never see them.
 * {@link DisplayModeManagerContainer1#updateMenuTip} also bails when {@link #isMouseOver()} so right-click
 * menus don't open through the HUD.
 * Rows (expanded): header → Combat toggle → Pause all scripts → Position.
 */
final class MicrobotPanel {

    /** Canvas-space top-left — below the tip / "X more options" strip. */
    private static final int PANEL_X = 8;
    private static final int PANEL_Y = 28;
    private static final int WIDTH = 150;
    /** Pixel height of one text row (hit-test + layout). */
    private static final int ROW_H = 16;
    private static final int PAD = 4;

    /** ARGB fill — dark translucent purple. */
    private static final int BG = 0xC01a1028;
    /** Header / accent (cyan). */
    private static final int ACCENT = 0xFF00FFFF;
    private static final int ON = 0xFF66FF66;
    private static final int OFF = 0xFFFF8888;
    private static final int SHADOW = 0xFF000000;

    /** When true, only the header row is drawn / clickable. */
    private static boolean collapsed = true;
    /**
     * Cursor currently over the panel bounds — refreshed each {@link #pollInput()}.
     * Used by {@link DisplayModeManagerContainer1} to suppress menus under the HUD.
     */
    private static boolean mouseOver;

    private MicrobotPanel() {
    }

    /** True when Microbot is enabled and a local player exists. */
    static boolean isVisible() {
        return Loader.microbotEnabled && Microbot.enabled && Microbot.isLoggedIn();
    }

    /** Current panel pixel height (collapsed = header only). */
    static int height() {
        return collapsed ? ROW_H + PAD * 2 : ROW_H * 5 + PAD * 2;
    }

    /**
     * Hit-test in canvas coordinates (same space as
     * {@link MouseHandler#getCursorX} / {@link MouseHandler#getCursorY}).
     */
    static boolean contains(int x, int y) {
        if (!isVisible()) {
            return false;
        }
        return x >= PANEL_X && x < PANEL_X + WIDTH
                && y >= PANEL_Y && y < PANEL_Y + height();
    }

    /** {@code true} when the cursor is over the panel this frame. */
    static boolean isMouseOver() {
        return mouseOver && isVisible();
    }

    /**
     * Paint the panel into the current frame buffer.
     * Prefer {@link BitmapFont#drawText} (left-aligned) — {@link BitmapFont#drawTextCentred}
     * is centre-X and easy to mis-wire (garbled / stacked glyphs).
     *
     * @param renderer active toolkit ({@link NodeSub8#toolkit})
     */
    static void draw(GraphicsToolkit renderer) {
        if (!isVisible() || renderer == null) {
            return;
        }
        try {
            BitmapFont font = Applet_Sub1.aClass324_20;
            if (font == null) {
                font = Component49.aClass324_4684;
            }
            if (font == null) {
                return;
            }
            int h = height();
            // Shader(x, y, width, height, argb, mode) — filled rect.
            renderer.fillRect2D(PANEL_X, PANEL_Y, WIDTH, h, BG, 1);
            renderer.fillRect2D(PANEL_X, PANEL_Y, WIDTH, 1, ACCENT, 1);

            int textX = PANEL_X + PAD;
            int y = PANEL_Y + PAD + 12;
            String header = collapsed ? "Microbot [+]" : "Microbot [-]";
            font.drawText(header, ACCENT, y, textX, SHADOW, -110);

            if (!collapsed) {
                y += ROW_H;
                boolean combatOn = Microbot.getExampleCombat().isRunning();
                font.drawText(combatOn ? "Combat: ON" : "Combat: OFF",
                        combatOn ? ON : OFF, y, textX, SHADOW, -110);
                y += ROW_H;
                boolean paused = Microbot.pauseAllScripts;
                font.drawText(paused ? "Pause: ON" : "Pause: OFF",
                        paused ? OFF : ON, y, textX, SHADOW, -110);
                y += ROW_H;
                boolean editorOn = SceneEditorHost.isEditorMode();
                String editorLabel = editorOn
                        ? "Editor: ON " + SceneEditorUi.currentAsset().label
                        : "Editor: OFF";
                font.drawText(editorLabel, editorOn ? ON : OFF, y, textX, SHADOW, -110);
                y += ROW_H;
                int absX = MicrobotWidgets.localAbsX();
                int absY = MicrobotWidgets.localAbsY();
                int plane = MicrobotWidgets.localPlane();
                font.drawText("Pos: " + absX + ", " + absY + ", " + plane,
                        0xFFFFFFFF, y, textX, SHADOW, -110);
            }
        } catch (Throwable t) {
            System.out.println("microbot panel draw: " + t.getMessage());
        }
    }

    /**
     * Consume left-presses that land on a panel row.
     * <p>
     * Must run after mouse drain into {@link Component327#aClass262_8744}
     * and before {@link DisplayModeManagerContainer1#updateMenuTip} / walk packet builders.
     * Click type {@code 0} = left press ({@link AwtMouseHandler#mousePressed}).
     */
    static void pollInput() {
        mouseOver = false;
        if (!isVisible() || AbstractGlTextureSub4.mouseHandler == null) {
            return;
        }
        try {
            int mx = AbstractGlTextureSub4.mouseHandler.getCursorX(true);
            int my = AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 100);
            mouseOver = contains(mx, my);

            Node node = Component327.aClass262_8744.first(4);
            while (node != null) {
                Node next = Component327.aClass262_8744.next((byte) 79);
                if (node instanceof NodeSub45) {
                    NodeSub45 click = (NodeSub45) node;
                    int type = click.getEventType(86);
                    if (type == 0) {
                        int cx = click.getX((byte) -128);
                        int cy = click.getY(33);
                        if (contains(cx, cy)) {
                            onClick(cx, cy);
                            click.unlink((byte) 97);
                        }
                    }
                }
                node = next;
            }
        } catch (Throwable t) {
            System.out.println("microbot panel input: " + t.getMessage());
        }
    }

    /**
     * Map a canvas click to a row action.
     * Row 0 = collapse/expand; 1 = combat; 2 = pause; 3 = scene editor.
     */
    private static void onClick(int x, int y) {
        int relY = y - PANEL_Y - PAD;
        int row = relY / ROW_H;
        if (row <= 0) {
            collapsed = !collapsed;
            Microbot.log("panel " + (collapsed ? "collapsed" : "expanded"));
            return;
        }
        if (collapsed) {
            return;
        }
        if (row == 1) {
            toggleCombat();
        } else if (row == 2) {
            Microbot.pauseAllScripts = !Microbot.pauseAllScripts;
            Microbot.log("pause=" + Microbot.pauseAllScripts);
        } else if (row == 3) {
            boolean next = !SceneEditorHost.isEditorMode();
            SceneEditorHost.setEditorMode(next);
            Microbot.log("editor=" + next + " (console: ed spawn <id>)");
        }
    }

    /** Start/stop {@link ExampleCombatScript} (shared with lilac NPC menu opcode 1907). */
    static void toggleCombat() {
        ExampleCombatScript script = Microbot.getExampleCombat();
        if (script.isRunning()) {
            script.shutdown();
        } else {
            script.start();
        }
    }
}
