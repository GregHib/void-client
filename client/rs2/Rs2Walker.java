/**
 * Simplified walker — BFS on local collision then walk-click (opcode 19) via
 * menu-inject. Transports/doors deferred (Microbot shortestpath later).
 * <p>
 * Uses {@link Component10#method2252} as an internal reliability assist after the
 * click is issued when the path is short.
 */
final class Rs2Walker {

    /** Walk-here opcode (see {@link ColoredTextBuilder#method2599} i_76_ == 19). */
    static final int OPCODE_WALK = 19;

    private Rs2Walker() {
    }

    static boolean isNear(int absX, int absY, int dist) {
        return Rs2Player.distanceTo(absX, absY) <= dist;
    }

    static boolean walkTo(int absX, int absY) {
        return walkTo(absX, absY, MicrobotWidgets.localPlane());
    }

    static boolean walkTo(int absX, int absY, int plane) {
        if (!Microbot.isLoggedIn()) {
            return false;
        }
        int localX = absX - NodeBaseSub2.regionTileX;
        int localY = absY - Component330.regionTileY;
        if (localX < 0 || localY < 0 || localX >= AbstractShaderSub4.anInt7319 || localY >= ParametricDefinition.anInt9109) {
            Microbot.log("walkTo out of scene: " + absX + "," + absY);
            return false;
        }
        NewMenuEntry entry = new NewMenuEntry("Walk here", "", OPCODE_WALK, 1L, localX, localY, -1);
        // Walk uses param0=x, param1=y (see client walk method466 + ColoredTextBuilder op 19)
        entry.setParam0(localX);
        entry.setParam1(localY);
        entry.setIdentifier(1L);
        Microbot.doInvoke(entry);
        // Assist pathing on client thread shortly after
        MicrobotRuntime.queueWalkAssist(localX, localY);
        return true;
    }

    static boolean walkToLocal(int localX, int localY) {
        return walkTo(localX + NodeBaseSub2.regionTileX, localY + Component330.regionTileY);
    }
}
