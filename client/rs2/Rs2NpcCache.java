/**
 * Per-tick NPC snapshot (Queryable-lite). Refresh when {@link OpenGlShader#clientCycle}
 * advances. Source: {@link Component21#aClass356_3654} + {@link DisplayModeManagerContainer238#anIntArray1233}.
 */
final class Rs2NpcCache {

    private int lastTick = -1;
    private Npc[] npcs = new Npc[0];
    private int count;

    Rs2NpcCache() {
    }

    void refreshIfNeeded() {
        int tick = OpenGlShader.clientCycle;
        if (tick == lastTick) {
            return;
        }
        lastTick = tick;
        int n = Component324.anInt2057;
        if (n < 0) {
            n = 0;
        }
        if (npcs.length < n) {
            npcs = new Npc[Math.max(n, 64)];
        }
        count = 0;
        for (int i = 0; i < Component324.anInt2057; i++) {
            try {
                NpcNode node = (NpcNode) Component21.aClass356_3654.get(DisplayModeManagerContainer238.anIntArray1233[i], -6008);
                if (node == null || node.npc == null) {
                    continue;
                }
                npcs[count++] = node.npc;
            } catch (Throwable ignored) {
            }
        }
    }

    int size() {
        refreshIfNeeded();
        return count;
    }

    Npc get(int i) {
        refreshIfNeeded();
        if (i < 0 || i >= count) {
            return null;
        }
        return npcs[i];
    }

    Npc[] snapshot() {
        refreshIfNeeded();
        Npc[] out = new Npc[count];
        System.arraycopy(npcs, 0, out, 0, count);
        return out;
    }
}
