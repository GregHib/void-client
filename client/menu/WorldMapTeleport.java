/**
 * Client-only admin Teleport actions on the world map.
 *
 * <ul>
 *   <li>{@link #injectAtSurface} — any map pixel under the cursor (right-click
 *       "Teleport to here").</li>
 *   <li>{@link #inject} — map-element icons in {@link #ALLOWED_CATEGORIES}
 *       (Activities = category 3), snapped to the icon tile.</li>
 * </ul>
 *
 * Both paths store absolute tile X/Y/plane on the {@link MenuEntry} and fire
 * the same console {@code tele} command as Ctrl+click on the map
 * ({@link CollisionMap#method3502}). Privilege gate: {@link Component353#anInt2581} &gt; 0.
 * <p>
 * Opcode must stay &lt; 2000 — {@code processMenuAction} / client-only handlers
 * strip 2000 for shift-click, so values like 4900 never match.
 */
final class WorldMapTeleport {

    /**
     * Private client-only opcode (&lt; 2000). Keep clear of DefaultClick (1900–05),
     * Microbot (1907), JoystickAlias (1910–11).
     */
    static final int OPCODE_TELEPORT = 1906;

    /** Cache category ids that also get a snapped Teleport on their icon. */
    private static final int[] ALLOWED_CATEGORIES = {3};

    /** Green label so the admin tele option stands out in the right-click menu. */
    private static final String OPTION_LABEL = "<col=00ff00>Teleport to here</col>";

    private WorldMapTeleport() {
    }

    /**
     * While hovering the world-map surface, add "Teleport to here" for admins.
     * {@code localX}/{@code localY} are cursor coords relative to the map
     * widget's top-left; {@code mapW}/{@code mapH} are the widget size.
     * Uses the same screen→tile math as the map Ctrl+click teleport.
     */
    static void injectAtSurface(int localX, int localY, int mapW, int mapH) {
        if (Component353.anInt2581 <= 0) {
            return;
        }
        int mapDx = (int) ((double) (localX - mapW / 2) * 2.0
                / (double) DisplayModeManagerContainer229.aFloat1247);
        int mapDy = (int) -((double) (localY - mapH / 2) * 2.0
                / (double) DisplayModeManagerContainer229.aFloat1247);
        int absX = NodeSub36.anInt6992 + mapDx + DisplayModeManagerContainer229.anInt1266;
        int absY = DebugOverlay.anInt3170 + mapDy + DisplayModeManagerContainer229.anInt1263;
        HashNodeSub14 area = ImageTagText.method1269(-17096);
        if (area == null) {
            return;
        }
        int[] tile = new int[3];
        if (!area.method3239(true, absY, absX, tile)) {
            return;
        }
        // tile[0]=plane, tile[1]=X, tile[2]=Y
        addTeleportEntry("", tile[1], tile[2], tile[0]);
    }

    /**
     * Adds Teleport on a hovered map-element icon when its category is allowed
     * and the local player is admin. Snaps to the element's tile.
     */
    static void inject(NodeSub12 hit, Component274 type) {
        if (Component353.anInt2581 <= 0 || hit == null || type == null
                || !isAllowedCategory(type.anInt596) || hit.aClass348_Sub21_6751 == null) {
            return;
        }
        NodeSub21 element = hit.aClass348_Sub21_6751;
        int x = element.anInt6852 + DisplayModeManagerContainer229.anInt1266;
        int y = element.anInt6851 + DisplayModeManagerContainer229.anInt1263;
        int plane = element.anInt6850;
        if (plane < 0 || plane > 3) {
            plane = Component72.localPlayer != null ? Component72.localPlayer.plane : 0;
        }
        addTeleportEntry(type.aString565, x, y, plane);
    }

    /**
     * addMenuEntry → MenuEntry: sixth arg = param0 (X), third = param1 (Y),
     * twelfth = identifier (plane). Tenth (groupKey) stays 0 — same layout as
     * {@link DefaultClickSwapper}.
     */
    private static void addTeleportEntry(String target, int x, int y, int plane) {
        DisplayModeManagerContainer368.addMenuEntry(
                false, target != null ? target : "", y, (byte) -93, false, x, -1, true,
                OPCODE_TELEPORT, 0L, OPTION_LABEL, (long) plane, -1);
    }

    /**
     * Consumes our private opcode: send the admin {@code tele} console command
     * (same format as Ctrl+click on the map).
     */
    static boolean handle(MenuEntry entry) {
        if (entry == null) {
            return false;
        }
        int opcode = entry.opcode;
        if (opcode >= 2000) {
            opcode -= 2000;
        }
        if (opcode != OPCODE_TELEPORT) {
            return false;
        }
        CollisionMap.method3502(entry.param1, 2, (int) entry.identifier, entry.param0);
        return true;
    }

    private static boolean isAllowedCategory(int category) {
        for (int allowed : ALLOWED_CATEGORIES) {
            if (allowed == category) {
                return true;
            }
        }
        return false;
    }
}
