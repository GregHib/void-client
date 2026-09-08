/**
 * Client-thread Microbot pump — wired from {@link client#processGameTick}.
 * Refreshes caches, injects pending menus, runs walk assists, starts example script toggle hook.
 */
final class MicrobotRuntime {

    static final Rs2NpcCache npcCache = new Rs2NpcCache();
    static final Rs2PlayerCache playerCache = new Rs2PlayerCache();
    static final Rs2TileObjectCache tileObjectCache = new Rs2TileObjectCache();
    static final Rs2TileItemCache tileItemCache = new Rs2TileItemCache();

    private static int walkAssistX = -1;
    private static int walkAssistY = -1;
    private static int walkAssistTicks;

    /** Client-only menu opcode: toggle ExampleCombatScript. */
    static final int OPCODE_TOGGLE_COMBAT = 1907;

    private MicrobotRuntime() {
    }

    static void ensureStarted() {
        if (Microbot.isStarted() || !Microbot.enabled || !Loader.microbotEnabled) {
            return;
        }
        Microbot.markClientThread();
        Microbot.mouse.ensureBackend();
        Microbot.setStarted(true);
        Microbot.log("runtime started");
    }

    /** Per-tick hook — must stay cheap. */
    static void tick() {
        if (!Loader.microbotEnabled) {
            return;
        }
        ensureStarted();
        Microbot.markClientThread();
        if (!Microbot.isLoggedIn()) {
            return;
        }
        npcCache.refreshIfNeeded();
        playerCache.refreshIfNeeded();
        tileObjectCache.refreshIfNeeded();
        tileItemCache.refreshIfNeeded();
        MicrobotMenu.injectPending();
        MicrobotMenu.dispatchPending();
        // Example combat (and future always-on pulses) — client thread, not executor.
        try {
            ExampleCombatScript combat = Microbot.getExampleCombat();
            if (combat.isRunning() && !Microbot.pauseAllScripts) {
                combat.pulse();
            }
        } catch (Throwable t) {
            System.out.println("microbot combat pulse error: " + t.getMessage());
            t.printStackTrace();
        }
        if (walkAssistX >= 0 && walkAssistTicks > 0) {
            walkAssistTicks--;
            try {
                Component10.method2252(true, walkAssistX, walkAssistY, (byte) -120, 1, 0, 1, -4, 0);
            } catch (Throwable ignored) {
            }
            if (walkAssistTicks <= 0) {
                walkAssistX = -1;
                walkAssistY = -1;
            }
        }
    }

    static void queueWalkAssist(int localX, int localY) {
        walkAssistX = localX;
        walkAssistY = localY;
        walkAssistTicks = 2;
    }

    /**
     * Inject lilac toggle row on attackable NPC menus:
     * {@code Microbot: Combat} when off, {@code Stop Combat} when on.
     */
    static void injectNpcMenu(Npc npc, NpcComposition composition) {
        if (!Loader.microbotEnabled || npc == null || composition == null) {
            return;
        }
        try {
            String attack = FriendsIgnoreList.aClass274_3506.getLocalized(ObjectDeserializer.languageId, 544);
            String[] actions = composition.actions;
            boolean hasAttack = false;
            if (actions != null) {
                for (int i = 0; i < actions.length && i < 5; i++) {
                    if (actions[i] != null && actions[i].equalsIgnoreCase(attack)) {
                        hasAttack = true;
                        break;
                    }
                }
            }
            if (!hasAttack) {
                return;
            }
            // Off → enable; on → disable.
            String label = Microbot.getExampleCombat().isRunning()
                    ? "Stop Combat"
                    : "Microbot: Combat";
            DisplayModeManagerContainer368.addMenuEntry(false, "", 0, (byte) -93, true, 0, -1, true,
                    OPCODE_TOGGLE_COMBAT, (long) npc.anInt10290,
                    "<col=00ffff>" + label + "</col>", (long) npc.anInt10290, 0);
        } catch (Throwable ignored) {
        }
    }

    static boolean handleMenuAction(MenuEntry entry) {
        if (entry == null) {
            return false;
        }
        int op = entry.opcode;
        if (op >= 2000) {
            op -= 2000;
        }
        if (op != OPCODE_TOGGLE_COMBAT) {
            return false;
        }
        MicrobotPanel.toggleCombat();
        return true;
    }
}
