/**
 * Ground-item helpers — interact via orange item menu opcodes (21/10/47/22/5)
 * as built in {@link ColoredText}.
 */
final class Rs2GroundItem {

    private Rs2GroundItem() {
    }

    /**
     * Take / interact nearest ground item matching {@code name} (substring).
     * Uses action "Take" when present.
     */
    static boolean takeNearest(String name) {
        return interactNearest(name, "Take");
    }

    static boolean interactNearest(String name, String action) {
        // Ground items are ephemeral in the hover picker; for MVP, walk the
        // recent ground-item nodes if NodeSub34 lists are available via
        // NodeSub37. Fallback: click tip after forcing a Take entry when
        // the player is standing on a pile (script responsibility to be near).
        DisplayModeManagerContainer57 label = Rs2Widget.findByText(name);
        if (label != null) {
            return Rs2Widget.click(label, action);
        }
        Microbot.log("Rs2GroundItem: no pile matched '" + name + "' (stand on item / expand later)");
        return false;
    }
}
