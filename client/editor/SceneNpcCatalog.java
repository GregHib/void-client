import java.util.Locale;

/**
 * Asynchronously indexes every NPC definition available in the NPC archive.
 * The editor uses this as the second catalog after City Assets.
 */
final class SceneNpcCatalog {
    static final int RESULT_LIMIT = 100;

    private static volatile Entry[] entries = new Entry[0];
    private static volatile int generation;
    private static volatile int scanned;
    private static volatile int total;
    private static volatile boolean loading;
    private static volatile boolean complete;
    private static String resultQuery;
    private static int resultGeneration = -1;
    private static Entry[] results = new Entry[0];
    private static int resultCount;
    private static boolean started;

    private SceneNpcCatalog() {
    }

    static void start() {
        synchronized (SceneNpcCatalog.class) {
            if (started || Component291.aClass278_2529 == null) {
                return;
            }
            started = true;
            loading = true;
            Thread worker = new Thread(SceneNpcCatalog::load, "void-npc-assets");
            worker.setDaemon(true);
            worker.start();
        }
    }

    static boolean isLoading() {
        return loading;
    }

    static boolean isComplete() {
        return complete;
    }

    static int scanned() {
        return scanned;
    }

    static int total() {
        return total;
    }

    static int search(String query) {
        String normalized = query == null ? "" : query.toLowerCase(Locale.ROOT);
        int currentGeneration = generation;
        if (normalized.equals(resultQuery) && resultGeneration == currentGeneration) {
            return resultCount;
        }

        Entry[] snapshot = entries;
        Entry[] matches = new Entry[Math.min(RESULT_LIMIT, snapshot.length)];
        int count = 0;
        for (Entry entry : snapshot) {
            if (entry.normalizedName.indexOf(normalized) == -1) {
                continue;
            }
            if (count < RESULT_LIMIT) {
                matches[count++] = entry;
            }
        }
        results = matches;
        resultCount = count;
        resultQuery = normalized;
        resultGeneration = currentGeneration;
        return count;
    }
    static boolean containsResult(int npcId) {
        for (int i = 0; i < resultCount; i++) {
            if (results[i].npcId == npcId) {
                return true;
            }
        }
        return false;
    }


    static Entry resultAt(int index) {
        return index >= 0 && index < resultCount ? results[index] : null;
    }

    private static void load() {
        DisplayModeManagerContainer347 provider = Component291.aClass278_2529;
        if (provider == null) {
            loading = false;
            return;
        }
        try {
            int groups = Math.max(0, provider.definitionGroupCount());
            int expected = 0;
            for (int group = 0; group < groups; group++) {
                expected += Math.max(0, provider.definitionFileCount(group));
            }
            total = expected;

            java.util.ArrayList<Entry> loaded = new java.util.ArrayList<Entry>(Math.min(expected, 4096));
            for (int group = 0; group < groups; group++) {
                int files = provider.definitionFileCount(group);
                for (int file = 0; file < files; file++) {
                    int npcId = (group << 7) | file;
                    try {
                        NpcComposition definition = provider.method2079(npcId, -1);
                        String name = definition == null ? null : definition.name;
                        if (name == null || name.length() == 0 || "null".equalsIgnoreCase(name)) {
                            name = "Unnamed NPC";
                        }
                        loaded.add(new Entry(npcId, name));
                    } catch (Throwable ignored) {
                        // A malformed definition must not stop the remaining cache scan.
                    }
                    scanned++;
                    if ((scanned & 1023) == 0) {
                        publish(loaded);
                    }
                }
            }
            publish(loaded);
            complete = true;
        } catch (Throwable t) {
            System.out.println("scene-editor NPC catalog: " + t.getMessage());
        } finally {
            loading = false;
        }
    }

    private static void publish(java.util.ArrayList<Entry> loaded) {
        Entry[] snapshot = loaded.toArray(new Entry[loaded.size()]);
        java.util.Arrays.sort(snapshot, new java.util.Comparator<Entry>() {
            @Override
            public int compare(Entry left, Entry right) {
                int byName = left.normalizedName.compareTo(right.normalizedName);
                if (byName != 0) {
                    return byName;
                }
                return left.npcId < right.npcId ? -1 : (left.npcId == right.npcId ? 0 : 1);
            }
        });
        entries = snapshot;
        generation++;
    }

    static final class Entry {
        final int npcId;
        final String name;
        final String normalizedName;

        Entry(int npcId, String name) {
            this.npcId = npcId;
            this.name = name;
            this.normalizedName = name.toLowerCase(Locale.ROOT);
        }
    }
}
