/**
 * Menu-inject helpers — 634 equivalent of Microbot's MenuEntryAdded rewrite.
 * <p>
 * Primary invoke path: build a {@link MenuEntry} and call
 * {@link ColoredTextBuilder#method2599} on the client thread (same handler as a real tip
 * click). Centre-canvas VirtualMouse is unreliable under fullscreen widgets.
 */
final class MicrobotMenu {

    private MicrobotMenu() {
    }

    /**
     * Called on the client thread during menu tip selection.
     *
     * @return forced tip entry, or null when Microbot is idle
     */
    static MenuEntry applyTargetMenu() {
        NewMenuEntry target = Microbot.targetMenu;
        if (target == null || !Microbot.enabled) {
            return null;
        }
        MenuEntry match = findMatching(target);
        if (match == null) {
            match = plant(target);
        }
        if (match == null) {
            return null;
        }
        // Keep match.cursorId (cursor sprite id). Tip wins via menuTip assignment.
        Component192.menuTip = match;
        MenuOpener.menuTipSecondary = match;
        return match;
    }

    /**
     * Eager inject when hover never built rows ({@link Microbot#pendingMenuInject}).
     */
    static void injectPending() {
        if (!Microbot.pendingMenuInject || Microbot.targetMenu == null) {
            return;
        }
        Microbot.pendingMenuInject = false;
        applyTargetMenu();
    }

    /**
     * Client-thread: turn {@link Microbot#pendingDispatch} into a real
     * {@link ColoredTextBuilder#method2599} call (stock opcode path).
     */
    static void dispatchPending() {
        NewMenuEntry t = Microbot.pendingDispatch;
        if (t == null || !Microbot.enabled) {
            return;
        }
        Microbot.pendingDispatch = null;
        try {
            MenuEntry entry = buildEntry(t);
            int cx = Microbot.pendingClickX;
            int cy = Microbot.pendingClickY;
            Microbot.log("dispatch op=" + t.getOpcode() + " id=" + t.getIdentifier()
                    + " '" + t.getOption() + "'");
            ColoredTextBuilder.processMenuAction((byte) 109, entry, cy, cx);
        } catch (Throwable ex) {
            System.out.println("microbot dispatch failed: " + ex.getMessage());
            ex.printStackTrace();
            Microbot.targetMenu = null;
        }
    }

    /** Build a menu row matching {@link DisplayModeManagerContainer368#addMenuEntry} field layout. */
    static MenuEntry buildEntry(NewMenuEntry t) {
        // cursorId -1 → addMenuEntry falls back to widget cursor id (Component149.widgetCursorId)
        return new MenuEntry(
                t.getOption(),
                t.getTarget(),
                -1,
                t.getOpcode(),
                t.getItemId(),
                t.getIdentifier(),
                t.getParam0(),
                t.getParam1(),
                true,
                false,
                t.getIdentifier(),
                false);
    }

    /** Clears tip bookkeeping after {@link ColoredTextBuilder#method2599} consumes an action. */
    static void onMenuOptionClicked() {
        Microbot.targetMenu = null;
        Microbot.pendingMenuInject = false;
    }

    private static MenuEntry findMatching(NewMenuEntry target) {
        int wantOp = target.getOpcode();
        if (wantOp >= 2000) {
            wantOp -= 2000;
        }
        for (MenuEntry entry = (MenuEntry) DefinitionSub4.menuEntries.first(4);
             entry != null;
             entry = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 83)) {
            int op = entry.opcode;
            if (op >= 2000) {
                op -= 2000;
            }
            if (op != wantOp) {
                continue;
            }
            if (target.getIdentifier() != 0L && (int) entry.identifier != (int) target.getIdentifier()) {
                continue;
            }
            if (target.getOption() != null && target.getOption().length() > 0) {
                if (!entry.option.equalsIgnoreCase(target.getOption())
                        && !stripCol(entry.option).equalsIgnoreCase(stripCol(target.getOption()))) {
                    continue;
                }
            }
            return entry;
        }
        return null;
    }

    private static MenuEntry plant(NewMenuEntry t) {
        try {
            DefinitionSub4.menuEntries.clear(103);
            DisplayModeManagerContainer306.menuEntryCount = 0;
            DisplayModeManagerContainer368.addMenuEntry(false, "", 0, (byte) -93, false, 0, -1, true,
                    1006, 0L, "Cancel", 0L, -1);
            DisplayModeManagerContainer368.addMenuEntry(false, t.getTarget(), t.getParam1(), (byte) -93, false,
                    t.getParam0(), t.getItemId(), true, t.getOpcode(), t.getIdentifier(),
                    t.getOption(), t.getIdentifier(), -1);
            return findMatching(t);
        } catch (Throwable ex) {
            System.out.println("microbot plant menu failed: " + ex.getMessage());
            return null;
        }
    }

    private static String stripCol(String s) {
        if (s == null) {
            return "";
        }
        StringBuilder b = new StringBuilder(s.length());
        boolean in = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '<') {
                in = true;
                continue;
            }
            if (c == '>') {
                in = false;
                continue;
            }
            if (!in) {
                b.append(c);
            }
        }
        return b.toString().trim();
    }
}
