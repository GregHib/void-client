/**
 * 634 interface group / packed widget ids confirmed on Void (RS634).
 * <p>
 * Do <b>not</b> copy OSRS Microbot {@code globval} — ids differ. Source of truth:
 * live {@code widget-map/} from {@code WidgetDump} + Shift+click picks
 * ({@code iface=group:child}). Promote here only with dump / pick evidence.
 * <p>
 * Identity is cache IF archive path, not a Java filename. Dynamic children
 * (inv slots, quest rows, prayer icons) often share {@code packedId} — use
 * {@code childIndex} + {@link NpcNode#getChildComponent}.
 */
final class MicrobotWidgets {

    // ---- IF groups (openInterfaces[group]) — dump 20260830-164259 ----

    /** Notes side panel — labels "Notes" / "Add note" / "Delete". */
    static final int NOTES_GROUP = 34;

    /** Chatbox / quick-chat — "Close Quick Chat", "Submit", date picker. */
    static final int CHAT_GROUP = 137;

    /**
     * Inventory backpack root. Confirmed open in-game; item slots are dynamic
     * children under {@code 149:0} sharing packedId (distinguish by childIndex).
     */
    static int INVENTORY_GROUP = 149;

    /** Music player — track list under {@code 187:1} ("Adventure", …). */
    static final int MUSIC_GROUP = 187;

    /** Quest list — "Quests", filter, rows under shared {@code 190:18}. */
    static final int QUESTS_GROUP = 190;

    /** Modern spellbook — "Defensive Casting", spell sprites Cast/Autocast. */
    static final int MAGIC_GROUP = 192;

    /** Options / settings — "Toggle Run", chat effects, graphics/audio. */
    static final int OPTIONS_GROUP = 261;

    /**
     * Prayer book + quick-prayer setup. Icons share packed parent
     * {@link #PRAYER_BOOK_ICONS}; orb is on gameframe side ({@link #QUICK_PRAYER_ORB}).
     */
    static final int PRAYER_GROUP = 271;

    /** Attack style / combat options panel (levels shown as plain text). */
    static final int COMBAT_STYLES_GROUP = 320;

    /** Friends list — "Friends List - RuneScape …". */
    static final int FRIENDS_GROUP = 550;

    /** Ignore list — "Ignore List" / "Add Name". */
    static final int IGNORE_GROUP = 551;

    /** Clan chat panel — "Talking in:" / "Owner:". */
    static final int CLAN_CHAT_GROUP = 589;

    /** Gameframe / HUD root (minimap, orbs, tabs, world-map button). */
    static final int GAMEFRAME_GROUP = 746;

    /**
     * Quick-prayer orb layer group (minimap). Orb widget itself is
     * {@link #QUICK_PRAYER_ORB} = {@code 749:1}.
     */
    static final int QUICK_PRAYER_ORB_GROUP = 749;

    /** Worn equipment / combat overlay — "Unarmed", "Combat Lvl: …". */
    static final int COMBAT_OVERLAY_GROUP = 884;

    /** Bank main interface (placeholder — scan prefers open bank by item grid). */
    static int BANK_GROUP = 762;

    // ---- Packed widgets (group << 16 | child) ----

    /** World Map globe on gameframe — Shift+click: sprite 1777, opts[0]=World Map. */
    static final int WORLD_MAP_BUTTON = (GAMEFRAME_GROUP << 16) | 178;

    /**
     * Minimap quick-prayer orb. Desktop dump {@code packedId=49086465}
     * ({@code 749:1}): {@code Turn quick prayers on} / {@code Turn prayers off}
     * + {@code Select quick prayers} (setup — never learn/fire).
     */
    static final int QUICK_PRAYER_ORB = (QUICK_PRAYER_ORB_GROUP << 16) | 1;

    /**
     * Prayer-book icon parent. Icons share this packedId; bind
     * {@code childIndex} and resolve via {@link NpcNode#getChildComponent}.
     * Dump evidence: {@code packedId=17760264} → {@code 271:8}.
     */
    static final int PRAYER_BOOK_ICONS = (PRAYER_GROUP << 16) | 8;

    /** Magic book root layer often at child 0 of {@link #MAGIC_GROUP}. */
    static final int MAGIC_ROOT = (MAGIC_GROUP << 16) | 0;

    /** Options panel title widget {@code 261:1} ("Options"). */
    static final int OPTIONS_TITLE = (OPTIONS_GROUP << 16) | 1;

    /** Toggle Run button {@code 261:3}. */
    static final int OPTIONS_TOGGLE_RUN = (OPTIONS_GROUP << 16) | 3;

    private MicrobotWidgets() {
    }

    /** {@code (group << 16) | child} — same packing as {@link DisplayModeManagerContainer57#packedId}. */
    static int packed(int group, int child) {
        return (group << 16) | (child & 0xffff);
    }

    static DisplayModeManagerContainer57 get(int packedId) {
        try {
            return BitmapFont.getComponent(1512932720, packedId);
        } catch (Throwable t) {
            return null;
        }
    }

    static DisplayModeManagerContainer57 getChild(int packedParent, int child) {
        try {
            return NpcNode.getChildComponent(child, (byte) -54, packedParent);
        } catch (Throwable t) {
            return null;
        }
    }

    /** Absolute scene tile X for local player. */
    static int localAbsX() {
        Player p = Component72.localPlayer;
        if (p == null) {
            return -1;
        }
        return p.anIntArray10320[0] + NodeBaseSub2.regionTileX;
    }

    static int localAbsY() {
        Player p = Component72.localPlayer;
        if (p == null) {
            return -1;
        }
        return p.anIntArray10317[0] + Component330.regionTileY;
    }

    static int localPlane() {
        Player p = Component72.localPlayer;
        return p != null ? p.plane : 0;
    }
}
