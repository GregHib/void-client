/**
 * Example Microbot combat script — attacks nearest Attack-able NPC within 12 tiles.
 * Toggle via lilac menu: {@code Microbot: Combat} / {@code Stop Combat}.
 * <p>
 * Gate: only issues Attack when {@link Rs2Player#inCombat()} is false. While
 * engaged (interacting index set), holds. Cooldown avoids frame-rate spam while
 * walking into range before the server sets interacting.
 */
final class ExampleCombatScript {

    private static final int MAX_DIST = 12;
    private static final int HEARTBEAT_FRAMES = 200;
    /** Frames to wait after Attack before re-checking (walk-in before interact). */
    private static final int ATTACK_COOLDOWN_FRAMES = 40;

    private volatile boolean running;
    private int heartbeat;
    private int attackCooldown;
    private boolean dumpedActions;

    ExampleCombatScript() {
    }

    void start() {
        running = true;
        heartbeat = 0;
        attackCooldown = 0;
        dumpedActions = false;
        Microbot.log("ExampleCombat started");
    }

    void shutdown() {
        running = false;
        attackCooldown = 0;
        Microbot.log("ExampleCombat stopped");
    }

    boolean isRunning() {
        return running;
    }

    /**
     * Called once per {@link client#processGameTick} while {@link #isRunning()}.
     */
    void pulse() {
        if (!running || Component72.localPlayer == null) {
            return;
        }
        if (++heartbeat % HEARTBEAT_FRAMES == 1) {
            Microbot.log("combat hb=" + heartbeat
                    + " inCombat=" + Rs2Player.inCombat()
                    + " cd=" + attackCooldown
                    + " npcs=" + MicrobotRuntime.npcCache.size());
        }
        if (!dumpedActions) {
            dumpedActions = true;
            dumpNpcActions();
        }

        // Already fighting — hold until interact clears.
        if (Rs2Player.inCombat()) {
            attackCooldown = 0;
            return;
        }

        if (attackCooldown > 0) {
            attackCooldown--;
            return;
        }

        Npc target = Rs2Npc.getNearestAttackable();
        if (target == null || Rs2Player.distanceTo(target) > MAX_DIST) {
            return;
        }

        if (Rs2Npc.attack(target)) {
            attackCooldown = ATTACK_COOLDOWN_FRAMES;
            String name = target.definition != null ? target.definition.name : "?";
            Microbot.log("attack → " + name
                    + " idx=" + target.anInt10290
                    + " dist=" + Rs2Player.distanceTo(target));
        }
    }

    private static void dumpNpcActions() {
        Microbot.log("attackLabel='" + Rs2Npc.attackLabelPublic() + "'");
        Npc[] all = Rs2Npc.getAll();
        int limit = Math.min(all.length, 4);
        for (int i = 0; i < limit; i++) {
            Npc n = all[i];
            if (n == null || n.definition == null) {
                continue;
            }
            NpcComposition def = n.definition;
            if (def.anIntArray1377 != null) {
                NpcComposition t = def.method794(DisplayModeManagerContainer58.aClass170_10209, -1);
                if (t != null) {
                    def = t;
                }
            }
            Microbot.log("npc '" + def.name + "' dist=" + Rs2Player.distanceTo(n));
        }
    }
}
