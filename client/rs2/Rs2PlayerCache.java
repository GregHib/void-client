/**
 * Local player + nearby players snapshot.
 */
final class Rs2PlayerCache {

    private int lastTick = -1;
    private Player local;
    private Player[] players = new Player[0];
    private int count;

    Rs2PlayerCache() {
    }

    void refreshIfNeeded() {
        int tick = OpenGlShader.clientCycle;
        if (tick == lastTick) {
            return;
        }
        lastTick = tick;
        local = Component72.localPlayer;
        int n = ShaderCompilerSub1.anInt6513;
        if (n < 0) {
            n = 0;
        }
        if (players.length < n) {
            players = new Player[Math.max(n, 32)];
        }
        count = 0;
        int[] indices = ShaderProgramSub7.anIntArray6290;
        for (int i = 0; i < n && indices != null; i++) {
            try {
                Player p = InterfaceRenderer.players[indices[i]];
                if (p != null) {
                    players[count++] = p;
                }
            } catch (Throwable ignored) {
            }
        }
    }

    Player getLocal() {
        refreshIfNeeded();
        return local;
    }

    int size() {
        refreshIfNeeded();
        return count;
    }

    Player get(int i) {
        refreshIfNeeded();
        if (i < 0 || i >= count) {
            return null;
        }
        return players[i];
    }
}
