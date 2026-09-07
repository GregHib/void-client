import java.util.Locale;

/**
 * Asynchronously indexes every LocType available in the object-definition cache.
 * The UI only receives immutable snapshots, so cache decoding never blocks drawing.
 */
final class SceneAssetCatalog {
    static final int RESULT_LIMIT = 400;

    private static final Object LOCK = new Object();
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

    private SceneAssetCatalog() {
    }

    static void start() {
        synchronized (LOCK) {
            if (started || GradientPreset.aClass263_9195 == null) {
                return;
            }
            started = true;
            loading = true;
            Thread worker = new Thread(SceneAssetCatalog::load, "void-city-assets");
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
        SceneCatalogQuery.Query parsed = SceneCatalogQuery.parse(query);
        String normalized = parsed.text;
        int currentGeneration = generation;
        if (normalized.equals(resultQuery) && resultGeneration == currentGeneration) {
            return resultCount;
        }

        Entry[] snapshot = entries;
        Entry[] matches = new Entry[Math.min(RESULT_LIMIT, snapshot.length)];
        int count = 0;
        for (Entry entry : snapshot) {
            boolean matchesQuery = parsed.idSearch
                    ? parsed.id != null && entry.objectId == parsed.id
                    : entry.normalizedName.indexOf(normalized) != -1;
            if (!matchesQuery) {
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

    static Entry resultAt(int index) {
        return index >= 0 && index < resultCount ? results[index] : null;
    }

    static boolean containsResult(int objectId) {
        for (int i = 0; i < resultCount; i++) {
            if (results[i].objectId == objectId) {
                return true;
            }
        }
        return false;
    }

    private static void load() {
        ObjectDefinitionProvider provider = GradientPreset.aClass263_9195;
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
                    int objectId = group << 8 | file;
                    try {
                        ObjectDefinition definition = provider.getObjectDefinition(0, objectId);
                        String name = definition == null ? null : definition.aString884;
                        if (name == null || name.length() == 0 || "null".equalsIgnoreCase(name)) {
                            name = "Unnamed object";
                        }
                        loaded.add(new Entry(objectId, name));
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
            System.out.println("scene-editor asset catalog: " + t.getMessage());
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
                return left.objectId < right.objectId ? -1 : (left.objectId == right.objectId ? 0 : 1);
            }
        });
        entries = snapshot;
        generation++;
    }

    static final class Entry {
        final int objectId;
        final String name;
        final String normalizedName;

        Entry(int objectId, String name) {
            this.objectId = objectId;
            this.name = name;
            this.normalizedName = name.toLowerCase(Locale.ROOT);
        }
    }
}
