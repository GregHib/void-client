/**
 * Local player helpers for Microbot scripts.
 */
final class Rs2Player {

    private Rs2Player() {
    }

    static Player getLocal() {
        return MicrobotRuntime.playerCache.getLocal();
    }

    static boolean isMoving() {
        Player p = getLocal();
        if (p == null) {
            return false;
        }
        // Queue length / path residual — anIntArray10320[0] is current; moving if more steps queued
        return p.anInt10306 > 0 || p.anInt10269 != -1;
    }

    /**
     * True when the local player has an interacting target.
     * <p>
     * {@code Player.anInt10275} is the entity face/interact index from the server
     * ({@code -1} = none; {@code < 32768} = NPC; {@code >= 32768} = player).
     * Prefer this over animation flags — idle anims are not combat.
     */
    static boolean inCombat() {
        Player p = getLocal();
        if (p == null) {
            return false;
        }
        return p.anInt10275 != -1;
    }

    /** Interacting entity index, or {@code -1} when idle. See {@link #inCombat()}. */
    static int getInteractingIndex() {
        Player p = getLocal();
        return p != null ? p.anInt10275 : -1;
    }

    static int getAnimation() {
        Player p = getLocal();
        return p != null ? p.anInt10268 : -1;
    }

    static int getCombatLevel() {
        Player p = getLocal();
        return p != null ? p.combatLevel : 0;
    }

    static int getWorldX() {
        return MicrobotWidgets.localAbsX();
    }

    static int getWorldY() {
        return MicrobotWidgets.localAbsY();
    }

    static int getPlane() {
        return MicrobotWidgets.localPlane();
    }

    static int distanceTo(int absX, int absY) {
        int dx = getWorldX() - absX;
        int dy = getWorldY() - absY;
        return Math.max(Math.abs(dx), Math.abs(dy));
    }

    static int distanceTo(Npc npc) {
        if (npc == null) {
            return Integer.MAX_VALUE;
        }
        int nx = npc.anIntArray10320[0] + NodeBaseSub2.regionTileX;
        int ny = npc.anIntArray10317[0] + Component330.regionTileY;
        return distanceTo(nx, ny);
    }
}
