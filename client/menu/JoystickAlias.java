import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Gamepad button → inventory / UI action aliases (eat, drink, quick prayer,
 * individual prayers, summon).
 * <p>
 * When a pad is connected ({@link #padConnected}), item / widget menus that expose
 * a matching option get an extra lilac {@code Learn alias: …} row. Choosing it arms
 * learn mode; the next learnable pad button is persisted and announced in chat as
 * {@code Eat Shark is bound to Triangle}.
 * <p>
 * <b>Widget evidence (desktop dump + widget-map/):</b>
 * <ul>
 *   <li>Quick-prayer orb {@link MicrobotWidgets#QUICK_PRAYER_ORB} ({@code 749:1} /
 *       packed {@code 49086465}): {@code Turn quick prayers on}
 *       / {@code Turn prayers off} (active state drops "quick") +
 *       {@code Select quick prayers} (setup — never learn/fire).</li>
 *   <li>Prayer-book icons share {@link MicrobotWidgets#PRAYER_BOOK_ICONS}
 *       ({@code 271:8}); bind {@link #Binding#childIndex}
 *       and resolve with {@link NpcNode#getChildComponent}.</li>
 *   <li>World Map globe {@link MicrobotWidgets#WORLD_MAP_BUTTON} ({@code 746:178},
 *       sprite 1777) — preferred before label scan.</li>
 *   <li>IF groups catalogued in {@link MicrobotWidgets} from {@code widget-map/MAP.md}
 *       (Notes 34, Chat 137, Inv 149, Music 187, Quests 190, Magic 192,
 *       Options 261, Prayer 271, Gameframe 746, …).</li>
 *   <li>Pad callbacks are off-thread — queue {@link #pendingFire} and drain in
 *       {@link #clientTick} or CC_OP freezes the UI.</li>
 *   <li>Chat labels must be ASCII (RS bitmap font has no ↑↓ / □△ — they render as '?').</li>
 * </ul>
 * Hosts (Android / iOS / desktop {@code DesktopGamepad}) set {@link #padConnected}
 * and forward button presses via {@link #onPadButton(int, String)}. Zoom stays on
 * L2/R2 — those codes are never aliased. Cross/Circle keep left/right click.
 * <p>
 * <b>D-pad Learn (ids 19–22 = Android {@code KEYCODE_DPAD_*}):</b>
 * <ul>
 *   <li>Desktop: Jamepad {@code dpad*JustPressed} → {@link #onPadButton}.</li>
 *   <li>iOS: {@code GCExtendedGamepad.getDpad()} discrete buttons → same ids.</li>
 *   <li>Android: many DualShock pads only emit {@code AXIS_HAT_X/Y} (no KeyEvent).
 *       {@code MainActivity.updateHatDpad} edge-triggers Learn; KeyEvents also work
 *       when the OEM delivers {@code KEYCODE_DPAD_*}.</li>
 * </ul>
 */
final class JoystickAlias {

    /** Client-only: start binding the named action to the next pad button. */
    static final int OPCODE_LEARN = 1910;
    /** Client-only: clear the binding for this action kind. */
    static final int OPCODE_CLEAR = 1911;

    /**
     * Set by mobile hosts via reflection when a DualShock / Xbox / MFi pad is live.
     * Defaults to {@code true} so desktop can show Learn alias rows without a
     * controller (mobile still flips this on connect/disconnect).
     */
    static volatile boolean padConnected = true;

    private static final String FILE_NAME = "joystick-alias.properties";
    private static final String COL = "<col=80ff80>";
    private static final String COL_END = "</col>";

    private static final Map<Integer, Binding> byButton = new HashMap<Integer, Binding>();
    private static boolean loaded;

    /** Non-null while waiting for the next learnable pad button (written game thread, read pad/UI thread). */
    private static volatile PendingLearn pending;

    /**
     * Alias fire queued from the pad/UI thread; drained on the client tick so
     * {@link ColoredTextBuilder#processMenuAction} / CS2 never run off-thread
     * (that froze the whole UI when toggling quick prayers).
     */
    private static volatile Binding pendingFire;

    /** Options/Start → world map, same client-thread queue as {@link #pendingFire}. */
    private static volatile boolean pendingWorldMap;

    private JoystickAlias() {
    }

    /**
     * Client-thread pump — called from {@code client} each game tick.
     * Runs queued pad alias fires / world-map opens safely.
     */
    static void clientTick() {
        if (pendingWorldMap) {
            pendingWorldMap = false;
            openWorldMap();
        }
        Binding b = pendingFire;
        if (b != null) {
            pendingFire = null;
            fire(b);
        }
        // Desktop-only WidgetDump (reflection — class excluded from Android/iOS sync).
        pollWidgetDump();
        // Flush Shift+click widget identity (best leaf from this tick).
        MobileKeyboard.flushWidgetPick();
    }

    /**
     * Invokes {@code WidgetDump.poll()} when the desktop class is present.
     * No-op on mobile (class excluded from source sync).
     */
    private static void pollWidgetDump() {
        try {
            Class.forName("WidgetDump").getMethod("poll").invoke(null);
        } catch (Throwable ignored) {
            // Desktop class missing or dump disabled — expected on mobile.
        }
    }

    /**
     * Inject Learn alias rows for inventory / bank item options that match the
     * focused kinds (Eat, Drink, Summon) and for prayer widgets (quick + individual).
     */
    static void injectItemMenu(DisplayModeManagerContainer57 component) {
        if (!padConnected || component == null) {
            return;
        }
        ensureLoaded();
        // Debug: dump any widget that looks prayer-related so we can see real option text.
        if (optionsLookPrayerRelated(component)) {
            dumpPrayerMenu(component);
        }
        java.util.LinkedHashSet seen = new java.util.LinkedHashSet();
        int itemId = component.itemId;
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, component, true);
            if ((opt == null || opt.length() == 0 || opt.startsWith("Hidden-"))
                    && component.optionLabels != null
                    && i < component.optionLabels.length
                    && component.optionLabels[i] != null
                    && component.optionLabels[i].trim().length() > 0) {
                opt = component.optionLabels[i];
            }
            maybeInject(opt, itemId, component, seen);
        }
        String use = DisplayModeManagerContainer295.getUseOption(0, component);
        maybeInject(use, itemId, component, seen);
        // Clear rows for bindings that appear on this component.
        // `seen` holds raw option strings and synthetic keys (pray:… / quickpray).
        if (findByKind(Kind.QUICK_PRAYER) != null && isQuickPrayerOrb(component)) {
            DisplayModeManagerContainer368.addMenuEntry(
                    false, "", 0, (byte) -93, true, 0, -1, true,
                    OPCODE_CLEAR, (long) Kind.QUICK_PRAYER.ordinal(),
                    COL + "Clear alias: " + COL_END + Kind.QUICK_PRAYER.label(),
                    (long) Kind.QUICK_PRAYER.ordinal(), 0);
        }
        for (Object o : seen) {
            String action = (String) o;
            if (action.startsWith("pray:") || action.equals("quickpray")
                    || action.startsWith("act:")) {
                if (action.startsWith("pray:")) {
                    String key = action.substring("pray:".length());
                    if (findByPrayerKey(key) != null) {
                        DisplayModeManagerContainer368.addMenuEntry(
                                false, "", 0, (byte) -93, true, 0, -1, true,
                                OPCODE_CLEAR, (long) Kind.PRAYER.ordinal(),
                                COL + "Clear alias: " + COL_END + key,
                                (long) Kind.PRAYER.ordinal(), 0);
                    }
                }
                continue;
            }
            Kind kind = classify(action, component);
            if (kind == null || kind == Kind.QUICK_PRAYER || kind == Kind.PRAYER) {
                continue;
            }
            if (findByKind(kind) != null) {
                DisplayModeManagerContainer368.addMenuEntry(
                        false, "", 0, (byte) -93, true, 0, -1, true,
                        OPCODE_CLEAR, (long) kind.ordinal(),
                        COL + "Clear alias: " + COL_END + kind.label(),
                        (long) kind.ordinal(), 0);
            }
        }
    }

    private static void maybeInject(String action, int itemId,
                                    DisplayModeManagerContainer57 component,
                                    java.util.LinkedHashSet seen) {
        if (action == null || action.length() == 0 || action.startsWith("Hidden-")) {
            return;
        }
        // Never alias Setup Quick-prayers — that opens the setup panel.
        if (isQuickPrayerSetupOption(action)) {
            return;
        }
        Kind kind = classify(action, component);
        // Prayer icons often only expose "Activate" / "Deactivate" with the name in
        // another string field — still offer Learn alias (manual prayer).
        if (kind == null
                && itemId <= 0
                && isIndividualPrayerToggle(action)
                && !isQuickPrayerOrb(component)) {
            kind = Kind.PRAYER;
        }
        if (kind == null) {
            return;
        }
        // Inventory actions need an item; prayers are item-less widgets.
        if (kind != Kind.QUICK_PRAYER && kind != Kind.PRAYER && itemId <= 0) {
            return;
        }
        String prayerName = "";
        if (kind == Kind.QUICK_PRAYER) {
            if (!seen.add("quickpray")) {
                return;
            }
        } else if (kind == Kind.PRAYER) {
            prayerName = resolvePrayerName(component, action);
            String seenKey = prayerName.length() > 0 ? ("pray:" + prayerName)
                    : ("act:" + action + "@" + component.packedId + ":" + component.childIndex);
            if (!seen.add(seenKey)) {
                return;
            }
        } else if (!seen.add(action)) {
            return;
        }
        // Learn row label: "Quick prayer" / prayer name / raw action.
        String shown;
        if (kind == Kind.QUICK_PRAYER) {
            shown = "Quick prayer";
        } else if (kind == Kind.PRAYER && prayerName.length() > 0) {
            shown = prayerName;
        } else {
            shown = action;
        }
        String target = kind == Kind.PRAYER
                ? (prayerName.length() > 0 ? prayerName : widgetLabel(component))
                : (kind == Kind.QUICK_PRAYER ? "Quick prayer" : widgetLabel(component));
        DisplayModeManagerContainer368.addMenuEntry(
                false, target, component.packedId, (byte) -93, true, component.childIndex,
                itemId, true,
                OPCODE_LEARN, (long) component.packedId,
                COL + "Learn alias: " + COL_END + shown, (long) component.packedId, 0);
        System.out.println("void-osrs joy-alias INJECT kind=" + kind
                + " shown='" + shown + "' action='" + action
                + "' packed=" + component.packedId + " child=" + component.childIndex
                + " orb=" + isQuickPrayerOrb(component));
    }

    /** True if any option/label mentions pray / activate / setup — log candidates. */
    private static boolean optionsLookPrayerRelated(DisplayModeManagerContainer57 c) {
        if (c == null) {
            return false;
        }
        String label = widgetLabel(c);
        if (label != null) {
            String ll = label.toLowerCase();
            if (ll.indexOf("pray") >= 0 || ll.indexOf("oração") >= 0 || ll.indexOf("oracao") >= 0) {
                return true;
            }
        }
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, c, true);
            if (opt == null || opt.length() == 0 || opt.startsWith("Hidden-")) {
                continue;
            }
            String lower = opt.toLowerCase();
            if (lower.indexOf("pray") >= 0
                    || lower.equals("activate")
                    || lower.equals("deactivate")
                    || lower.indexOf("setup") >= 0
                    || lower.startsWith("activate")
                    || lower.startsWith("deactivate")) {
                return true;
            }
        }
        return false;
    }

    private static void dumpPrayerMenu(DisplayModeManagerContainer57 c) {
        StringBuilder b = new StringBuilder(160);
        b.append("void-osrs joy-alias PRAY-DUMP packed=").append(c.packedId)
                .append(" child=").append(c.childIndex)
                .append(" item=").append(c.itemId)
                .append(" label='").append(widgetLabel(c)).append('\'')
                .append(" orb=").append(isQuickPrayerOrb(c))
                .append(" opts=");
        appendOptionDump(b, c);
        System.out.println(b.toString());
    }

    /**
     * Walks open interfaces and dumps widgets that look like the quick-prayer
     * orb (Setup / named quick toggle / pray+activate). Prayer-book icons
     * ({@code Activate} only, same parent packedId) are skipped here.
     */
    private static void scanQuickPrayerOrbs() {
        DisplayModeManagerContainer57[][] roots = DefinitionSub33.openInterfaces;
        if (roots == null) {
            return;
        }
        int found = 0;
        for (int g = 0; g < roots.length; g++) {
            DisplayModeManagerContainer57[] all = roots[g];
            if (all == null) {
                continue;
            }
            for (int i = 0; i < all.length; i++) {
                DisplayModeManagerContainer57 c = all[i];
                if (c == null || c.hidden) {
                    continue;
                }
                if (looksLikeQuickPrayerCandidate(c)) {
                    found++;
                    StringBuilder b = new StringBuilder(180);
                    b.append("void-osrs joy-alias ORB-SCAN packed=").append(c.packedId)
                            .append(" child=").append(c.childIndex)
                            .append(" item=").append(c.itemId)
                            .append(" type=").append(c.type)
                            .append(" label='").append(widgetLabel(c)).append('\'')
                            .append(" orb=").append(isQuickPrayerOrb(c))
                            .append(" opts=");
                    appendOptionDump(b, c);
                    System.out.println(b.toString());
                }
                if (c.children != null) {
                    for (int k = 0; k < c.children.length; k++) {
                        DisplayModeManagerContainer57 kid = c.children[k];
                        if (kid == null || kid.hidden) {
                            continue;
                        }
                        if (looksLikeQuickPrayerCandidate(kid)) {
                            found++;
                            StringBuilder b = new StringBuilder(180);
                            b.append("void-osrs joy-alias ORB-SCAN packed=").append(kid.packedId)
                                    .append(" child=").append(kid.childIndex)
                                    .append(" item=").append(kid.itemId)
                                    .append(" type=").append(kid.type)
                                    .append(" label='").append(widgetLabel(kid)).append('\'')
                                    .append(" orb=").append(isQuickPrayerOrb(kid))
                                    .append(" opts=");
                            appendOptionDump(b, kid);
                            System.out.println(b.toString());
                        }
                    }
                }
            }
        }
        if (found == 0) {
            System.out.println("void-osrs joy-alias ORB-SCAN none (no Setup/quick-pray opts in openInterfaces)");
        }
    }

    /** True if options mention quick/setup+pray — not bare Activate on a prayer icon. */
    private static boolean looksLikeQuickPrayerCandidate(DisplayModeManagerContainer57 c) {
        if (c == null) {
            return false;
        }
        if (isQuickPrayerOrb(c)) {
            return true;
        }
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, c, true);
            if ((opt == null || opt.length() == 0 || opt.startsWith("Hidden-"))
                    && c.optionLabels != null && i < c.optionLabels.length
                    && c.optionLabels[i] != null && c.optionLabels[i].trim().length() > 0) {
                opt = c.optionLabels[i];
            }
            if (opt == null || opt.length() == 0) {
                continue;
            }
            String lower = opt.toLowerCase();
            if (lower.indexOf("setup") >= 0
                    || lower.indexOf("quick") >= 0
                    || (lower.indexOf("pray") >= 0 && !lower.equals("activate")
                    && !lower.equals("deactivate"))) {
                return true;
            }
        }
        String label = widgetLabel(c);
        if (label != null) {
            String ll = label.toLowerCase();
            if (ll.indexOf("quick") >= 0 && ll.indexOf("pray") >= 0) {
                return true;
            }
        }
        return false;
    }

    private static void appendOptionDump(StringBuilder b, DisplayModeManagerContainer57 c) {
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, c, true);
            String raw = (c.optionLabels != null && i < c.optionLabels.length)
                    ? c.optionLabels[i] : null;
            if ((opt == null || opt.length() == 0) && (raw == null || raw.trim().length() == 0)) {
                continue;
            }
            String use = (opt != null && opt.length() > 0 && !opt.startsWith("Hidden-")) ? opt : raw;
            Kind k = classify(use, c);
            b.append(" [").append(i).append("]='").append(use).append("'");
            if (raw != null && opt != null && !raw.equals(opt)) {
                b.append("(raw='").append(raw).append("')");
            }
            b.append("→").append(k != null ? k.name() : "null")
                    .append(isQuickPrayerSetupOption(use) ? "/setup" : "")
                    .append(isQuickPrayerToggleOption(use) ? "/qtoggle" : "")
                    .append(isIndividualPrayerToggle(use) ? "/indiv" : "");
        }
    }

    /**
     * Best-effort prayer display name: action suffix, self fields, children, then
     * parent/sibling labels. Bare {@code Activate} alone is never a usable name.
     */
    private static String resolvePrayerName(DisplayModeManagerContainer57 c, String action) {
        String fromAction = prayerNameFromAction(action);
        if (isUsablePrayerName(fromAction)) {
            return fromAction;
        }
        String self = widgetLabel(c);
        if (isUsablePrayerName(self)) {
            return self;
        }
        if (c != null && c.children != null) {
            for (int i = 0; i < c.children.length; i++) {
                String t = widgetLabel(c.children[i]);
                if (isUsablePrayerName(t)) {
                    return t;
                }
            }
        }
        // Do not scan parent siblings — that picks the first text in the whole
        // prayer book and every icon would learn the same name.
        return "";
    }

    /** Strip Activate/Deactivate/… prefix; empty if action is a bare toggle verb. */
    private static String prayerNameFromAction(String action) {
        if (action == null) {
            return "";
        }
        String a = stripColTags(action).trim();
        String lower = a.toLowerCase();
        if (lower.equals("activate") || lower.equals("deactivate") || lower.equals("toggle")
                || lower.equals("turn on") || lower.equals("turn off")) {
            return "";
        }
        if (lower.startsWith("activate ")) {
            return a.substring("activate ".length()).trim();
        }
        if (lower.startsWith("deactivate ")) {
            return a.substring("deactivate ".length()).trim();
        }
        if (lower.startsWith("turn on ")) {
            return a.substring("turn on ".length()).trim();
        }
        if (lower.startsWith("turn off ")) {
            return a.substring("turn off ".length()).trim();
        }
        return a;
    }

    /** True when {@code t} looks like a real prayer title, not a verb / dialog button. */
    private static boolean isUsablePrayerName(String t) {
        if (t == null || t.length() == 0 || isNonPrayerWidgetLabel(t)) {
            return false;
        }
        String lower = t.trim().toLowerCase();
        if (lower.equals("activate") || lower.equals("deactivate") || lower.equals("toggle")
                || lower.equals("turn on") || lower.equals("turn off")) {
            return false;
        }
        // Reject pure toggle verbs even with trailing junk trimmed.
        if (isIndividualPrayerToggle(t) && prayerNameFromAction(t).length() == 0) {
            return false;
        }
        return true;
    }

    /** Best-effort visible name for a widget (prayer icons, buttons, …). */
    private static String widgetLabel(DisplayModeManagerContainer57 c) {
        if (c == null) {
            return "";
        }
        String[] candidates = new String[] { c.text, c.debugName, c.textContent, c.continueOption };
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] == null) {
                continue;
            }
            String t = stripColTags(candidates[i]).trim();
            if (t.length() > 0 && !isNonPrayerWidgetLabel(t)) {
                return t;
            }
        }
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] == null) {
                continue;
            }
            String t = stripColTags(candidates[i]).trim();
            if (t.length() > 0) {
                return t;
            }
        }
        return "";
    }

    static boolean handleMenuAction(MenuEntry entry) {
        if (entry == null) {
            return false;
        }
        int op = entry.opcode;
        if (op >= 2000) {
            op -= 2000;
        }
        if (op == OPCODE_LEARN) {
            String action = stripLearnLabel(entry.option);
            if (action == null) {
                return true;
            }
            String target = entry.target != null
                    ? stripColTags(entry.target).trim() : "";
            Kind kind;
            String display;
            String bindAction = action;
            int bindId = entry.itemId;
            int bindChild = -1;
            if (isQuickPrayerToggleOption(action)
                    || isOrbActivePrayerToggle(action)
                    || action.equalsIgnoreCase("Quick prayer")) {
                kind = Kind.QUICK_PRAYER;
                display = "Quick prayer";
                bindAction = "Activate";
                // Persist orb packedId so fire hits this widget directly.
                if (entry.param1 != 0) {
                    bindId = entry.param1;
                } else if (entry.identifier != 0L) {
                    bindId = (int) entry.identifier;
                }
            } else if (entry.itemId <= 0
                    && (isIndividualPrayerToggle(action)
                    || isUsablePrayerName(action)
                    || isUsablePrayerName(target))) {
                // Individual prayer: learn by name + packedId/childIndex.
                // Prayer-book icons share one parent packedId; childIndex is unique.
                kind = Kind.PRAYER;
                bindChild = entry.param0;
                if (isUsablePrayerName(action) && !isIndividualPrayerToggle(action)) {
                    display = action;
                    bindAction = "Activate";
                } else if (isUsablePrayerName(target)) {
                    display = target;
                    bindAction = isIndividualPrayerToggle(action) ? action : "Activate";
                } else {
                    display = prayerKey(target, action);
                    if (!isUsablePrayerName(display)) {
                        int pid = entry.param1 != 0 ? entry.param1 : (int) entry.identifier;
                        if (pid != 0 || bindChild >= 0) {
                            display = bindChild >= 0 ? ("Prayer#" + bindChild) : ("Prayer#" + pid);
                        } else {
                            chat(COL + "Could not resolve prayer — open the prayer book and try again."
                                    + COL_END);
                            return true;
                        }
                    }
                    bindAction = isIndividualPrayerToggle(action) ? action : "Activate";
                }
                if (entry.param1 != 0) {
                    bindId = entry.param1;
                } else if (entry.identifier != 0L) {
                    bindId = (int) entry.identifier;
                }
            } else {
                kind = classifyActionOnly(action);
                if (kind == null) {
                    return true;
                }
                display = resolveDisplayName(entry.itemId, entry.target);
            }
            pending = new PendingLearn(kind, bindAction, bindId, display, bindChild);
            String bindLabel = display.equalsIgnoreCase(kind.label())
                    ? display : (kind.label() + " " + display);
            chat(COL + "Press a joystick button to bind " + bindLabel + "…" + COL_END);
            System.out.println("void-osrs joy-alias learn armed kind=" + kind
                    + " action=" + bindAction + " packed=" + bindId
                    + " child=" + bindChild + " display=" + display);
            return true;
        }
        if (op == OPCODE_CLEAR) {
            Kind kind = Kind.fromOrdinal((int) entry.identifier);
            String what = stripLearnLabel(entry.option);
            if (kind == Kind.PRAYER) {
                clearPrayerKey(what != null ? what : "");
            } else if (kind != null) {
                clearKind(kind);
            }
            return true;
        }
        return false;
    }

    /**
     * Called from AwtHost when a pad button goes down.
     * Must stay {@code public} — mobile hosts invoke via reflection across packages.
     *
     * @param buttonId Android {@code KeyEvent.KEYCODE_BUTTON_*} (shared with iOS mapping)
     * @param label    human button name (△, L1, …) for chat
     * @return true if the press was consumed (learn or aliased fire)
     */
    public static boolean onPadButton(int buttonId, String label) {
        System.out.println("void-osrs joy-alias onPadButton id=" + buttonId
                + " label=" + label + " pending=" + (pending != null));
        // Options / Start → world map (never aliased). Queue for client thread.
        if (buttonId == 108) {
            pendingWorldMap = true;
            return true;
        }
        if (!isLearnable(buttonId)) {
            if (pending != null) {
                chat(COL + "Use L1/R1, L3/R3, D-pad or Square/Triangle to bind." + COL_END);
            }
            return false;
        }
        ensureLoaded();
        String btn = label != null && label.length() > 0 ? label : buttonLabel(buttonId);
        if (pending != null) {
            Binding b = new Binding(pending.kind, pending.action, pending.itemId,
                    pending.displayName, pending.childIndex);
            if (pending.kind == Kind.PRAYER) {
                // One button per prayer — drop previous bind for same name or same slot.
                removePrayerBinding(pending.displayName, pending.action,
                        pending.itemId, pending.childIndex);
            } else {
                // One binding per kind — drop previous button for same kind.
                removeKind(pending.kind);
            }
            byButton.put(Integer.valueOf(buttonId), b);
            save();
            chat(COL + (pending.displayName.equalsIgnoreCase(pending.kind.label())
                    ? pending.displayName
                    : (pending.kind.label() + " " + pending.displayName))
                    + " is bound to " + btn + COL_END);
            System.out.println("void-osrs joy-alias bound " + pending.kind + " → " + btn
                    + " packed=" + pending.itemId + " child=" + pending.childIndex
                    + " action=" + pending.action + " display=" + pending.displayName);
            pending = null;
            return true;
        }
        Binding hit = byButton.get(Integer.valueOf(buttonId));
        if (hit == null) {
            return false;
        }
        // Never fire CC_OP / CS2 from the pad callback thread — queue for clientTick.
        pendingFire = hit;
        return true;
    }

    /**
     * Options / Start — open the world-map UI by clicking a visible control whose
     * text/option mentions "World Map" / "Mapa". Falls back to chat if missing.
     */
    static void openWorldMap() {
        try {
            if (tryClickWorldMapControl()) {
                System.out.println("void-osrs joy-alias Options → world map");
                return;
            }
            chat(COL + "World map control not found." + COL_END);
        } catch (Throwable t) {
            System.out.println("void-osrs joy-alias openWorldMap failed: " + t.getMessage());
        }
    }

    private static boolean tryClickWorldMapControl() {
        // Prefer the confirmed gameframe globe (widget-map / Shift+click) before a full scan.
        DisplayModeManagerContainer57 hit = MicrobotWidgets.get(MicrobotWidgets.WORLD_MAP_BUTTON);
        if (hit == null || hit.hidden) {
            hit = findWorldMapWidget(DefinitionSub33.openInterfaces);
        } else if (!isWorldMapLabel(hit.text) && !hasWorldMapOption(hit)) {
            // Packed id present but labels empty — still try click; else fall back to scan.
            DisplayModeManagerContainer57 scanned = findWorldMapWidget(DefinitionSub33.openInterfaces);
            if (scanned != null) {
                hit = scanned;
            }
        }
        if (hit == null) {
            return false;
        }
        // Prefer an explicit World Map option; else Continue / first option.
        String preferred = null;
        int preferredSlot = -1;
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, hit, true);
            if (opt == null || opt.length() == 0 || opt.startsWith("Hidden-")) {
                continue;
            }
            if (isWorldMapLabel(opt)) {
                preferred = opt;
                preferredSlot = i;
                break;
            }
            if (preferred == null) {
                preferred = opt;
                preferredSlot = i;
            }
        }
        if (preferred != null) {
            MenuEntry entry = new MenuEntry(
                    preferred,
                    hit.text != null ? hit.text : "",
                    0x7fffffff,
                    18,
                    hit.itemId,
                    1L + preferredSlot,
                    hit.childIndex,
                    hit.packedId,
                    true,
                    false,
                    ((long) hit.childIndex) | hit.packedId,
                    false);
            ColoredTextBuilder.processMenuAction((byte) 109, entry, 300, 400);
            return true;
        }
        if (hit.continueOption != null && hit.continueOption.length() > 0) {
            MenuEntry entry = new MenuEntry(
                    hit.continueOption,
                    "",
                    0x7fffffff,
                    16,
                    hit.itemId,
                    0L,
                    hit.childIndex,
                    hit.packedId,
                    true,
                    false,
                    ((long) hit.childIndex) | hit.packedId,
                    false);
            ColoredTextBuilder.processMenuAction((byte) 109, entry, 300, 400);
            return true;
        }
        return Rs2Widget.click(hit, hit.text != null ? hit.text : "World Map");
    }

    private static DisplayModeManagerContainer57 findWorldMapWidget(DisplayModeManagerContainer57[][] roots) {
        if (roots == null) {
            return null;
        }
        for (int g = 0; g < roots.length; g++) {
            DisplayModeManagerContainer57[] all = roots[g];
            if (all == null) {
                continue;
            }
            for (int i = 0; i < all.length; i++) {
                DisplayModeManagerContainer57 found = findWorldMapWidget(all[i]);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }

    private static DisplayModeManagerContainer57 findWorldMapWidget(DisplayModeManagerContainer57 c) {
        if (c == null || c.hidden) {
            return null;
        }
        if (isWorldMapLabel(c.text)) {
            return c;
        }
        if (isWorldMapLabel(c.continueOption)) {
            return c;
        }
        for (int i = 0; i <= 9; i++) {
            if (isWorldMapLabel(Component63.getComponentOption(i, c, true))) {
                return c;
            }
        }
        if (c.children != null) {
            for (int i = 0; i < c.children.length; i++) {
                DisplayModeManagerContainer57 found = findWorldMapWidget(c.children[i]);
                if (found != null) {
                    return found;
                }
            }
        }
        return null;
    }

    private static boolean isWorldMapLabel(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        String lower = s.toLowerCase();
        return lower.indexOf("world map") >= 0
                || lower.indexOf("mapa-m") >= 0
                || lower.equals("mapa")
                || lower.indexOf("mappemonde") >= 0
                || lower.indexOf("weltkarte") >= 0;
    }

    /** True if any option slot on {@code c} looks like the World Map control. */
    private static boolean hasWorldMapOption(DisplayModeManagerContainer57 c) {
        if (c == null) {
            return false;
        }
        for (int i = 0; i <= 9; i++) {
            if (isWorldMapLabel(Component63.getComponentOption(i, c, true))) {
                return true;
            }
        }
        return isWorldMapLabel(c.continueOption);
    }

    private static void fire(Binding b) {
        try {
            if (b.kind == Kind.QUICK_PRAYER) {
                // One alias toggles both on and off — use whichever option the
                // orb currently exposes ("Turn quick prayers on" / "Turn prayers off").
                if (b.itemId > 0) {
                    DisplayModeManagerContainer57 orb = MicrobotWidgets.get(b.itemId);
                    if (orb != null && !orb.hidden && fireQuickPrayerOnOrb(orb)) {
                        return;
                    }
                }
                if (!fireQuickPrayerToggle()) {
                    chat(COL + "Quick prayer widget not found." + COL_END);
                }
                return;
            }
            if (b.kind == Kind.PRAYER) {
                if (!fireIndividualPrayerToggle(b)) {
                    chat(COL + "Prayer " + b.displayName + " not found." + COL_END);
                }
                return;
            }
            if (b.kind == Kind.DRINK) {
                DisplayModeManagerContainer57 drinkSlot = findDrinkSlotByName(b);
                if (drinkSlot == null) {
                    chat(COL + b.displayName + " not in inventory." + COL_END);
                    return;
                }
                fireInventoryAction(b, drinkSlot);
                return;
            }
            if (b.itemId <= 0) {
                chat(COL + "Alias item missing (id=" + b.itemId + ")." + COL_END);
                return;
            }
            DisplayModeManagerContainer57 slot = Rs2Inventory.findSlot(b.itemId);
            if (slot == null) {
                chat(COL + b.displayName + " not in inventory." + COL_END);
                return;
            }
            fireInventoryAction(b, slot);
        } catch (Throwable t) {
            System.out.println("void-osrs joy-alias fire failed: " + t.getMessage());
        }
    }

    private static void fireInventoryAction(Binding b, DisplayModeManagerContainer57 slot) {
        int optionSlot = findItemOptionSlot(slot, b.action);
        if (optionSlot < 0 && b.kind == Kind.DRINK) {
            // Dose variants still use Drink even if the learned slot index differs.
            optionSlot = findItemOptionSlot(slot, "Drink");
        }
        long identifier = optionSlot >= 0 ? (1L + optionSlot) : 1L;
        String option = b.action;
        if (optionSlot >= 0) {
            String live = Component63.getComponentOption(optionSlot, slot, true);
            if (live != null && live.length() > 0) {
                option = live;
            }
        }
        MenuEntry entry = new MenuEntry(
                option,
                slot.text != null ? slot.text : b.displayName,
                0x7fffffff,
                18,
                slot.itemId,
                identifier,
                slot.childIndex,
                slot.packedId,
                true,
                false,
                ((long) slot.childIndex) | slot.packedId,
                false);
        ColoredTextBuilder.processMenuAction((byte) 109, entry, 300, 400);
        System.out.println("void-osrs joy-alias fire " + b.kind + " '" + option
                + "' item=" + slot.itemId + " name=" + itemNameOf(slot.itemId)
                + " (bound=" + b.displayName + ")");
    }

    /**
     * Find a drink by <b>name</b>, not item id. Potion ids change each sip
     * ({@code Overload (4)} → {@code (3)} → …). Uses the dose-family prefix of the
     * learned display name / item def name and prefers the lowest dose so one
     * flask is finished before the next.
     */
    private static DisplayModeManagerContainer57 findDrinkSlotByName(Binding b) {
        String family = drinkFamily(b);
        if (family == null || family.length() == 0) {
            return b.itemId > 0 ? Rs2Inventory.findSlot(b.itemId) : null;
        }
        String familyNorm = normalizeItemName(family);
        DisplayModeManagerContainer57 best = null;
        int bestDose = Integer.MAX_VALUE;
        DisplayModeManagerContainer57[] slots = Rs2Inventory.slots();
        for (int i = 0; i < slots.length; i++) {
            DisplayModeManagerContainer57 s = slots[i];
            if (s == null || s.itemId <= 0) {
                continue;
            }
            // Prefer cache item name — inventory widget text is often empty / wrong.
            String name = itemNameOf(s.itemId);
            if (name == null || name.length() == 0) {
                name = inventoryItemName(s);
            }
            if (name == null || name.length() == 0) {
                continue;
            }
            if (!nameMatchesDrinkFamily(name, familyNorm)) {
                continue;
            }
            int dose = parseDoseSuffix(name);
            // Undosed drinks: treat as dose 0 so any match wins once.
            if (dose < 0) {
                dose = 0;
            }
            if (dose < bestDose) {
                bestDose = dose;
                best = s;
            }
        }
        if (best != null) {
            return best;
        }
        // Last resort: exact learned id (fresh learn before first sip).
        return b.itemId > 0 ? Rs2Inventory.findSlot(b.itemId) : null;
    }

    /** Dose-family or full drink name used for inventory matching. */
    private static String drinkFamily(Binding b) {
        String fromDisplay = doseFamilyName(b.displayName);
        if (fromDisplay != null) {
            return fromDisplay;
        }
        String fromId = doseFamilyName(itemNameOf(b.itemId));
        if (fromId != null) {
            return fromId;
        }
        // Non-dosed drink / odd naming — use full cleaned display or def name.
        if (b.displayName != null && b.displayName.length() > 0 && !"?".equals(b.displayName)) {
            return stripColTags(b.displayName).trim();
        }
        return itemNameOf(b.itemId);
    }

    private static boolean nameMatchesDrinkFamily(String itemName, String familyNorm) {
        if (itemName == null || familyNorm == null || familyNorm.length() == 0) {
            return false;
        }
        String nameNorm = normalizeItemName(itemName);
        String itemFamily = doseFamilyName(itemName);
        if (itemFamily != null && normalizeItemName(itemFamily).equals(familyNorm)) {
            return true;
        }
        if (nameNorm.equals(familyNorm)) {
            return true;
        }
        // "Saradomin brew" vs "Saradomin brew (3)" / minor wording drift.
        if (nameNorm.startsWith(familyNorm) || familyNorm.startsWith(nameNorm)) {
            return true;
        }
        return false;
    }

    private static String normalizeItemName(String name) {
        if (name == null) {
            return "";
        }
        return stripColTags(name).trim().toLowerCase().replaceAll("\\s+", " ");
    }

    /** Trailing {@code (N)} dose with N in 1..9, else {@code -1}. */
    private static int parseDoseSuffix(String name) {
        if (name == null) {
            return -1;
        }
        String n = stripColTags(name).trim();
        int open = n.lastIndexOf('(');
        int close = n.lastIndexOf(')');
        if (open < 0 || close != n.length() - 1 || close <= open + 1) {
            return -1;
        }
        String inner = n.substring(open + 1, close).trim();
        if (inner.length() != 1) {
            return -1;
        }
        char c = inner.charAt(0);
        if (c < '1' || c > '9') {
            return -1;
        }
        return c - '0';
    }

    /** Name without trailing {@code (N)} dose, or null if not a dosed potion name. */
    private static String doseFamilyName(String name) {
        if (name == null || parseDoseSuffix(name) < 0) {
            return null;
        }
        String n = stripColTags(name).trim();
        int open = n.lastIndexOf('(');
        return n.substring(0, open).trim();
    }

    private static String inventoryItemName(DisplayModeManagerContainer57 slot) {
        if (slot.text != null && slot.text.length() > 0) {
            String t = stripColTags(slot.text).trim();
            if (t.length() > 0) {
                return t;
            }
        }
        return itemNameOf(slot.itemId);
    }

    private static String itemNameOf(int itemId) {
        if (itemId <= 0 || Exception_Sub1.itemDefinitions == null) {
            return null;
        }
        try {
            ItemDefinition def = Exception_Sub1.itemDefinitions.getItemDefinition(90, itemId);
            if (def != null && def.itemName != null && def.itemName.length() > 0
                    && !"null".equals(def.itemName)) {
                return def.itemName;
            }
        } catch (Throwable ignored) {
        }
        return null;
    }

    private static String stripColTags(String s) {
        if (s == null) {
            return "";
        }
        return s.replaceAll("<col=[^>]*>", "").replace("</col>", "");
    }

    /** Option index 0..9 for {@code action} on an inventory component, or {@code -1}. */
    private static int findItemOptionSlot(DisplayModeManagerContainer57 slot, String action) {
        if (slot == null || action == null) {
            return -1;
        }
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, slot, true);
            if (opt != null && opt.equalsIgnoreCase(action)) {
                return i;
            }
        }
        // Soft match: "Drink" vs "Drink potion" etc.
        String lower = action.toLowerCase();
        for (int i = 0; i <= 9; i++) {
            String opt = Component63.getComponentOption(i, slot, true);
            if (opt != null && opt.toLowerCase().startsWith(lower)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Toggle a single prayer. Identity is {@code packedId + childIndex} (icons share
     * one parent packedId). Name match is a fallback when the book exposes labels.
     */
    private static boolean fireIndividualPrayerToggle(Binding b) {
        String key = prayerKey(b.displayName, b.action);
        if (!isUsablePrayerName(key)) {
            key = isUsablePrayerName(b.displayName) ? b.displayName : "";
        }
        // Primary: packed parent + childIndex (how CC_OP resolves interface children).
        if (b.itemId != 0 || b.childIndex >= 0) {
            DisplayModeManagerContainer57 bySlot = findPrayerComponent(b.itemId, b.childIndex);
            if (bySlot != null && !bySlot.hidden && fireToggleOnComponent(bySlot)) {
                System.out.println("void-osrs joy-alias prayer fire packed=" + b.itemId
                        + " child=" + b.childIndex + " name=" + b.displayName);
                return true;
            }
        }
        if (!isUsablePrayerName(key) || key.startsWith("Prayer#")) {
            return false;
        }
        DisplayModeManagerContainer57[][] roots = DefinitionSub33.openInterfaces;
        if (roots == null) {
            return false;
        }
        for (int g = 0; g < roots.length; g++) {
            DisplayModeManagerContainer57[] all = roots[g];
            if (all == null) {
                continue;
            }
            for (int i = 0; i < all.length; i++) {
                DisplayModeManagerContainer57 c = all[i];
                if (c == null || c.hidden) {
                    continue;
                }
                String resolved = resolvePrayerName(c, null);
                if (resolved.length() > 0 && resolved.equalsIgnoreCase(key)) {
                    if (fireToggleOnComponent(c)) {
                        return true;
                    }
                }
                for (int s = 0; s <= 9; s++) {
                    String opt = Component63.getComponentOption(s, c, true);
                    if (opt == null || opt.length() == 0 || opt.startsWith("Hidden-")) {
                        continue;
                    }
                    if (isQuickPrayerToggleOption(opt)) {
                        continue;
                    }
                    String fromOpt = prayerNameFromAction(opt);
                    if (isUsablePrayerName(fromOpt) && key.equalsIgnoreCase(fromOpt)) {
                        return invokeComponentOption(c, opt, s);
                    }
                }
            }
        }
        return false;
    }

    /** Activate/Deactivate slot on {@code c}, whichever is currently offered. */
    private static boolean fireToggleOnComponent(DisplayModeManagerContainer57 c) {
        if (c == null) {
            return false;
        }
        for (int s = 0; s <= 9; s++) {
            String opt = Component63.getComponentOption(s, c, true);
            if (opt == null || opt.length() == 0 || opt.startsWith("Hidden-")) {
                continue;
            }
            if (isQuickPrayerToggleOption(opt)) {
                continue;
            }
            if (isIndividualPrayerToggle(opt)) {
                return invokeComponentOption(c, opt, s);
            }
        }
        return false;
    }

    /**
     * Resolve a prayer-book icon. Children of a layer share the parent's
     * {@code packedId}; {@link NpcNode#getChildComponent} looks up {@code children[childIndex]}.
     */
    private static DisplayModeManagerContainer57 findPrayerComponent(int packedId, int childIndex) {
        if (childIndex >= 0 && packedId != 0) {
            try {
                DisplayModeManagerContainer57 via = NpcNode.getChildComponent(childIndex, (byte) -54, packedId);
                if (via != null) {
                    return via;
                }
            } catch (Throwable ignored) {
            }
            try {
                DisplayModeManagerContainer57 parent = MicrobotWidgets.get(packedId);
                if (parent != null && parent.children != null
                        && childIndex < parent.children.length) {
                    return parent.children[childIndex];
                }
            } catch (Throwable ignored) {
            }
        }
        DisplayModeManagerContainer57[][] roots = DefinitionSub33.openInterfaces;
        if (roots == null) {
            return null;
        }
        for (int g = 0; g < roots.length; g++) {
            DisplayModeManagerContainer57[] all = roots[g];
            if (all == null) {
                continue;
            }
            for (int i = 0; i < all.length; i++) {
                DisplayModeManagerContainer57 c = all[i];
                if (c == null) {
                    continue;
                }
                if (packedId != 0 && c.packedId == packedId
                        && (childIndex < 0 || c.childIndex == childIndex)) {
                    return c;
                }
                if (c.children != null && childIndex >= 0 && childIndex < c.children.length
                        && (packedId == 0 || c.packedId == packedId)) {
                    DisplayModeManagerContainer57 kid = c.children[childIndex];
                    if (kid != null) {
                        return kid;
                    }
                }
            }
        }
        return null;
    }

    /**
     * Toggle quick prayers: click the on/off option on the prayer orb —
     * whichever it currently shows. Learned as one {@link Kind#QUICK_PRAYER} alias.
     */
    private static boolean fireQuickPrayerToggle() {
        // Prefer confirmed orb packed id from widget-map / desktop dump.
        DisplayModeManagerContainer57 known = MicrobotWidgets.get(MicrobotWidgets.QUICK_PRAYER_ORB);
        if (known != null && !known.hidden && fireQuickPrayerOnOrb(known)) {
            return true;
        }
        DisplayModeManagerContainer57[][] roots = DefinitionSub33.openInterfaces;
        if (roots == null) {
            return false;
        }
        for (int g = 0; g < roots.length; g++) {
            DisplayModeManagerContainer57[] all = roots[g];
            if (all == null) {
                continue;
            }
            for (int i = 0; i < all.length; i++) {
                DisplayModeManagerContainer57 c = all[i];
                if (c == null || c.hidden) {
                    continue;
                }
                if (isQuickPrayerOrb(c) && fireQuickPrayerOnOrb(c)) {
                    return true;
                }
                if (c.children != null) {
                    for (int k = 0; k < c.children.length; k++) {
                        DisplayModeManagerContainer57 kid = c.children[k];
                        if (kid != null && !kid.hidden
                                && isQuickPrayerOrb(kid) && fireQuickPrayerOnOrb(kid)) {
                            return true;
                        }
                    }
                }
            }
        }
        for (int g = 0; g < roots.length; g++) {
            DisplayModeManagerContainer57[] all = roots[g];
            if (all == null) {
                continue;
            }
            for (int i = 0; i < all.length; i++) {
                DisplayModeManagerContainer57 c = all[i];
                if (c == null || c.hidden) {
                    continue;
                }
                if (tryFireNamedQuickToggle(c)) {
                    return true;
                }
                if (c.children != null) {
                    for (int k = 0; k < c.children.length; k++) {
                        DisplayModeManagerContainer57 kid = c.children[k];
                        if (kid != null && !kid.hidden && tryFireNamedQuickToggle(kid)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean tryFireNamedQuickToggle(DisplayModeManagerContainer57 c) {
        for (int s = 0; s <= 9; s++) {
            String opt = readOption(c, s);
            if (opt == null) {
                continue;
            }
            if (isQuickPrayerToggleOption(opt) || isOrbActivePrayerToggle(opt)) {
                return invokeComponentOption(c, opt, s);
            }
        }
        return false;
    }

    /** Activate/Deactivate / Turn … on|off on the orb (never Setup/Select). */
    private static boolean fireQuickPrayerOnOrb(DisplayModeManagerContainer57 c) {
        int toggleSlot = -1;
        String toggleOpt = null;
        for (int s = 0; s <= 9; s++) {
            String opt = readOption(c, s);
            if (opt == null) {
                continue;
            }
            if (isQuickPrayerSetupOption(opt)) {
                continue;
            }
            if (isQuickPrayerToggleOption(opt)
                    || isOrbActivePrayerToggle(opt)
                    || isIndividualPrayerToggle(opt)) {
                toggleSlot = s;
                toggleOpt = opt;
                break;
            }
        }
        return toggleOpt != null && invokeComponentOption(c, toggleOpt, toggleSlot);
    }

    /** Option text for slot {@code i}, falling back to raw {@code optionLabels}. */
    private static String readOption(DisplayModeManagerContainer57 c, int i) {
        if (c == null) {
            return null;
        }
        String opt = Component63.getComponentOption(i, c, true);
        if (opt != null && opt.length() > 0 && !opt.startsWith("Hidden-")) {
            return opt;
        }
        if (c.optionLabels != null && i < c.optionLabels.length
                && c.optionLabels[i] != null && c.optionLabels[i].trim().length() > 0) {
            return c.optionLabels[i];
        }
        return null;
    }

    /**
     * True for the minimap prayer orb: any option mentioning quick-prayers, or
     * Setup/Select + a turn/activate toggle. Bare Activate on that widget is the
     * quick-prayer toggle, not an individual prayer.
     */
    private static boolean isQuickPrayerOrb(DisplayModeManagerContainer57 c) {
        if (c == null) {
            return false;
        }
        boolean hasSetup = false;
        boolean hasNamedToggle = false;
        boolean hasBareToggle = false;
        boolean mentionsQuickPray = false;
        for (int i = 0; i <= 9; i++) {
            String opt = readOption(c, i);
            if (opt == null) {
                continue;
            }
            String lower = opt.trim().toLowerCase();
            if (mentionsQuickPray(lower)) {
                mentionsQuickPray = true;
            }
            if (isQuickPrayerSetupOption(opt)) {
                hasSetup = true;
            }
            if (isQuickPrayerToggleOption(opt) || isOrbActivePrayerToggle(opt)) {
                hasNamedToggle = true;
            }
            if (lower.equals("activate") || lower.equals("deactivate")
                    || lower.equals("turn on") || lower.equals("turn off")) {
                hasBareToggle = true;
            }
        }
        return hasNamedToggle || hasSetup || (mentionsQuickPray && hasBareToggle);
    }

    /** {@code Select quick prayers} / {@code Setup Quick-prayers} — picker, never toggle. */
    private static boolean isQuickPrayerSetupOption(String action) {
        if (action == null) {
            return false;
        }
        String lower = action.trim().toLowerCase();
        if (lower.indexOf("setup") < 0 && lower.indexOf("select") < 0
                && lower.indexOf("choose") < 0) {
            return false;
        }
        return mentionsQuickPray(lower);
    }

    /**
     * Orb toggle while off: {@code Turn quick prayers on} / {@code Activate Quick-prayers}.
     */
    private static boolean isQuickPrayerToggleOption(String action) {
        if (action == null || isQuickPrayerSetupOption(action)) {
            return false;
        }
        String lower = action.trim().toLowerCase();
        if (!mentionsQuickPray(lower)) {
            return false;
        }
        return lower.indexOf("activate") >= 0
                || lower.indexOf("deactivate") >= 0
                || lower.indexOf("toggle") >= 0
                || lower.indexOf("turn") >= 0;
    }

    /**
     * When quick prayers are already on, the orb drops "quick" from the label:
     * {@code Turn prayers off} / {@code Turn prayers on}.
     */
    private static boolean isOrbActivePrayerToggle(String action) {
        if (action == null || isQuickPrayerSetupOption(action) || isQuickPrayerToggleOption(action)) {
            return false;
        }
        String lower = action.trim().toLowerCase();
        if (lower.indexOf("pray") < 0 || lower.indexOf("turn") < 0) {
            return false;
        }
        // Avoid matching unrelated "turn" UI; require on/off.
        return lower.endsWith(" on") || lower.endsWith(" off")
                || lower.indexOf(" on") >= 0 || lower.indexOf(" off") >= 0;
    }

    private static boolean mentionsQuickPray(String lower) {
        if (lower == null) {
            return false;
        }
        return lower.indexOf("quick-prayer") >= 0
                || lower.indexOf("quick prayer") >= 0
                || lower.indexOf("quickprayer") >= 0
                || lower.indexOf("quick prayers") >= 0
                || (lower.indexOf("quick") >= 0 && lower.indexOf("pray") >= 0);
    }

    /** Bare Activate/Deactivate (or Activate &lt;name&gt;) for a single prayer icon. */
    private static boolean isIndividualPrayerToggle(String action) {
        if (action == null || isQuickPrayerToggleOption(action)
                || isQuickPrayerSetupOption(action) || isOrbActivePrayerToggle(action)) {
            return false;
        }
        String lower = action.trim().toLowerCase();
        return lower.equals("activate")
                || lower.equals("deactivate")
                || lower.startsWith("activate ")
                || lower.startsWith("deactivate ")
                || lower.equals("toggle")
                || lower.startsWith("turn on")
                || lower.startsWith("turn off");
    }

    /** Stable name for an individual prayer (widget text, or name after Activate/…). */
    private static String prayerKey(String widgetText, String action) {
        String t = widgetText != null ? stripColTags(widgetText).trim() : "";
        if (isUsablePrayerName(t)) {
            return t;
        }
        String fromAction = prayerNameFromAction(action);
        if (isUsablePrayerName(fromAction)) {
            return fromAction;
        }
        return isUsablePrayerName(t) ? t : fromAction;
    }

    private static boolean isNonPrayerWidgetLabel(String text) {
        if (text == null) {
            return true;
        }
        String lower = text.trim().toLowerCase();
        return lower.length() == 0
                || lower.equals("continue")
                || lower.equals("close")
                || lower.equals("cancel")
                || lower.equals("ok")
                || lower.equals("yes")
                || lower.equals("no")
                || lower.indexOf("world map") >= 0
                || lower.indexOf("quick-prayer") >= 0
                || lower.indexOf("quick prayer") >= 0;
    }

    private static boolean invokeComponentOption(DisplayModeManagerContainer57 hit, String option, int slot) {
        MenuEntry entry = new MenuEntry(
                option,
                hit.text != null ? hit.text : "",
                0x7fffffff,
                18,
                hit.itemId,
                1L + slot,
                hit.childIndex,
                hit.packedId,
                true,
                false,
                ((long) hit.childIndex) | hit.packedId,
                false);
        ColoredTextBuilder.processMenuAction((byte) 109, entry, 300, 400);
        System.out.println("void-osrs joy-alias fire option '" + option
                + "' packed=" + hit.packedId + " child=" + hit.childIndex + " slot=" + slot);
        return true;
    }

    /**
     * Buttons that may be aliased.
     * Allowed: L1/R1, L3/R3, D-pad (19–22), □/△.
     * Reserved: ✕/○ (click), L2/R2 (zoom), Options/Start (world map).
     * <p>
     * D-pad ids match Android {@code KeyEvent.KEYCODE_DPAD_*} so a binding learned
     * on phone fires on desktop/iOS and vice versa. Hosts must deliver these ids —
     * Android hat axes are translated in {@code MainActivity}, not here.
     */
    static boolean isLearnable(int buttonId) {
        switch (buttonId) {
            case 99: // □ KEYCODE_BUTTON_X
            case 100: // △ KEYCODE_BUTTON_Y
            case 102: // L1
            case 103: // R1
            case 106: // L3
            case 107: // R3
            case 19: // KEYCODE_DPAD_UP
            case 20: // KEYCODE_DPAD_DOWN
            case 21: // KEYCODE_DPAD_LEFT
            case 22: // KEYCODE_DPAD_RIGHT
                return true;
            default:
                return false;
        }
    }

    /**
     * ASCII chat / Learn label for a pad button id.
     * Must stay ASCII — RS bitmap font has no ↑↓←→ / □△ (they render as '?').
     */
    static String buttonLabel(int buttonId) {
        switch (buttonId) {
            case 96:
                return "Cross";
            case 97:
                return "Circle";
            case 99:
                return "Square";
            case 100:
                return "Triangle";
            case 102:
                return "L1";
            case 103:
                return "R1";
            case 104:
                return "L2";
            case 105:
                return "R2";
            case 106:
                return "L3";
            case 107:
                return "R3";
            case 108:
                return "Options";
            case 109:
                return "Share";
            case 19:
                return "Up";
            case 20:
                return "Down";
            case 21:
                return "Left";
            case 22:
                return "Right";
            default:
                return "Btn" + buttonId;
        }
    }

    static Kind classify(String action) {
        return classify(action, null);
    }

    static Kind classify(String action, DisplayModeManagerContainer57 component) {
        if (action == null) {
            return null;
        }
        if (isQuickPrayerSetupOption(action)) {
            return null;
        }
        // Named quick toggle, "Turn prayers off" (active), or bare Activate on the orb.
        if (isQuickPrayerToggleOption(action)
                || isOrbActivePrayerToggle(action)
                || (component != null && isQuickPrayerOrb(component)
                && isIndividualPrayerToggle(action))) {
            return Kind.QUICK_PRAYER;
        }
        if (component != null
                && component.itemId <= 0
                && isIndividualPrayerToggle(action)
                && !isQuickPrayerOrb(component)) {
            String text = widgetLabel(component);
            if (text.length() > 0 && !isNonPrayerWidgetLabel(text)) {
                return Kind.PRAYER;
            }
            String key = prayerKey(null, action);
            if (key != null && key.length() > 0 && !key.equalsIgnoreCase(action.trim())
                    && !isIndividualPrayerToggle(key)) {
                return Kind.PRAYER;
            }
            // Bare Activate/Deactivate on an item-less prayer-book icon.
            return Kind.PRAYER;
        }
        return classifyActionOnly(action);
    }

    /** Inventory / summon kinds that do not need a widget context. */
    private static Kind classifyActionOnly(String action) {
        if (action == null) {
            return null;
        }
        String lower = action.trim().toLowerCase();
        if (lower.startsWith("eat")) {
            return Kind.EAT;
        }
        if (lower.startsWith("drink")) {
            return Kind.DRINK;
        }
        if (isQuickPrayerToggleOption(action)) {
            return Kind.QUICK_PRAYER;
        }
        if (lower.startsWith("summon") || lower.indexOf("familiar") >= 0
                || lower.indexOf("follower") >= 0) {
            return Kind.SUMMON;
        }
        return null;
    }

    private static String stripLearnLabel(String label) {
        if (label == null) {
            return null;
        }
        label = label.replace(COL, "").replace(COL_END, "")
                .replace("<col=ff80ff>", "").replace("</col>", "");
        if (label.startsWith("Learn alias: ")) {
            label = label.substring("Learn alias: ".length());
        }
        if (label.startsWith("Clear alias: ")) {
            label = label.substring("Clear alias: ".length());
        }
        return label.trim();
    }

    private static String resolveDisplayName(int itemId, String target) {
        if (target != null) {
            String t = target.replaceAll("<col=[^>]*>", "").replace("</col>", "").trim();
            if (t.length() > 0) {
                return t;
            }
        }
        if (itemId > 0 && Exception_Sub1.itemDefinitions != null) {
            try {
                ItemDefinition def = Exception_Sub1.itemDefinitions.getItemDefinition(90, itemId);
                if (def != null && def.itemName != null && def.itemName.length() > 0) {
                    return def.itemName;
                }
            } catch (Throwable ignored) {
            }
        }
        return itemId > 0 ? ("item " + itemId) : "?";
    }

    private static Binding findByKind(Kind kind) {
        for (Map.Entry<Integer, Binding> e : byButton.entrySet()) {
            if (e.getValue().kind == kind) {
                return e.getValue();
            }
        }
        return null;
    }

    private static Binding findByPrayerKey(String key) {
        if (key == null || key.length() == 0) {
            return null;
        }
        for (Map.Entry<Integer, Binding> e : byButton.entrySet()) {
            Binding b = e.getValue();
            if (b.kind == Kind.PRAYER
                    && key.equalsIgnoreCase(prayerKey(b.displayName, b.action))) {
                return b;
            }
        }
        return null;
    }

    private static void removeKind(Kind kind) {
        java.util.Iterator it = byButton.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            Binding b = (Binding) e.getValue();
            if (b.kind == kind) {
                it.remove();
            }
        }
    }

    private static void removePrayerKey(String key) {
        removePrayerBinding(key, null, 0, -1);
    }

    /** Drop existing prayer binds that match name and/or packedId+childIndex. */
    private static void removePrayerBinding(String displayName, String action,
                                           int packedId, int childIndex) {
        String key = prayerKey(displayName, action);
        java.util.Iterator it = byButton.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            Binding b = (Binding) e.getValue();
            if (b.kind != Kind.PRAYER) {
                continue;
            }
            boolean sameSlot = packedId != 0 && childIndex >= 0
                    && b.itemId == packedId && b.childIndex == childIndex;
            boolean sameName = key != null && key.length() > 0
                    && key.equalsIgnoreCase(prayerKey(b.displayName, b.action));
            if (sameSlot || sameName) {
                it.remove();
            }
        }
    }

    private static void clearKind(Kind kind) {
        ensureLoaded();
        removeKind(kind);
        save();
        chat(COL + "Alias " + kind.label() + " cleared." + COL_END);
    }

    private static void clearPrayerKey(String key) {
        ensureLoaded();
        String k = key != null ? key.trim() : "";
        removePrayerKey(k);
        save();
        chat(COL + "Alias Prayer " + k + " cleared." + COL_END);
    }

    private static void chat(String msg) {
        ShaderProgramSub2.addChatMessage("", 5, (byte) -100, 0, msg, "", "");
    }

    private static void ensureLoaded() {
        if (loaded) {
            return;
        }
        loaded = true;
        File file = storageFile();
        if (!file.isFile()) {
            return;
        }
        Properties props = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            props.load(in);
            for (Map.Entry<Object, Object> e : props.entrySet()) {
                String key = String.valueOf(e.getKey());
                String value = String.valueOf(e.getValue()).trim();
                if (!key.startsWith("btn_") || value.length() == 0) {
                    continue;
                }
                try {
                    int btn = Integer.parseInt(key.substring(4));
                    // kind|action|itemId|display[|childIndex]
                    String[] parts = value.split("\\|", 5);
                    if (parts.length < 4) {
                        continue;
                    }
                    Kind kind = Kind.valueOf(parts[0]);
                    int itemId = Integer.parseInt(parts[2]);
                    int childIndex = -1;
                    if (parts.length >= 5 && parts[4].length() > 0) {
                        childIndex = Integer.parseInt(parts[4]);
                    }
                    byButton.put(Integer.valueOf(btn),
                            new Binding(kind, parts[1], itemId, parts[3], childIndex));
                } catch (Exception ignored) {
                }
            }
            System.out.println("void-osrs joy-alias loaded " + byButton.size());
        } catch (Exception e) {
            System.out.println("void-osrs joy-alias load failed: " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (Exception ignored) {
                }
            }
        }
    }

    private static void save() {
        Properties props = new Properties();
        for (Map.Entry<Integer, Binding> e : byButton.entrySet()) {
            Binding b = e.getValue();
            String safeName = b.displayName.replace('|', '/');
            String value = b.kind.name() + "|" + b.action + "|" + b.itemId + "|" + safeName;
            if (b.kind == Kind.PRAYER || b.childIndex >= 0) {
                value = value + "|" + b.childIndex;
            }
            props.setProperty("btn_" + e.getKey().intValue(), value);
        }
        File file = storageFile();
        FileOutputStream out = null;
        try {
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            out = new FileOutputStream(file);
            props.store(out, "void-osrs joystick aliases (btn_N=kind|action|itemId|name|childIndex)");
        } catch (Exception e) {
            System.out.println("void-osrs joy-alias save failed: " + e.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception ignored) {
                }
            }
        }
    }

    private static File storageFile() {
        String home = System.getProperty("user.home", ".");
        return new File(new File(home, ".void-osrs"), FILE_NAME);
    }

    /** Focused alias kinds for this lote. */
    enum Kind {
        EAT,
        DRINK,
        QUICK_PRAYER,
        /** Individual prayer-book icon (many bindings allowed, keyed by prayer name). */
        PRAYER,
        SUMMON;

        String label() {
            switch (this) {
                case EAT:
                    return "Eat";
                case DRINK:
                    return "Drink";
                case QUICK_PRAYER:
                    return "Quick prayer";
                case PRAYER:
                    return "Prayer";
                case SUMMON:
                    return "Summon";
                default:
                    return name();
            }
        }

        static Kind fromOrdinal(int i) {
            Kind[] all = values();
            if (i < 0 || i >= all.length) {
                return null;
            }
            return all[i];
        }
    }

    private static final class Binding {
        final Kind kind;
        final String action;
        /**
         * Inventory item id, or for {@link Kind#PRAYER} the parent widget
         * {@link DisplayModeManagerContainer57#packedId} (shared by all icons).
         */
        final int itemId;
        final String displayName;
        /**
         * For {@link Kind#PRAYER}: index into the parent layer's {@code children[]}
         * — the unique id when packedIds collide. {@code -1} = unused.
         */
        final int childIndex;

        Binding(Kind kind, String action, int itemId, String displayName, int childIndex) {
            this.kind = kind;
            this.action = action;
            this.itemId = itemId;
            this.displayName = displayName != null ? displayName : "?";
            this.childIndex = childIndex;
        }
    }

    private static final class PendingLearn {
        final Kind kind;
        final String action;
        final int itemId;
        final String displayName;
        final int childIndex;

        PendingLearn(Kind kind, String action, int itemId, String displayName, int childIndex) {
            this.kind = kind;
            this.action = action;
            this.itemId = itemId;
            this.displayName = displayName;
            this.childIndex = childIndex;
        }
    }
}
