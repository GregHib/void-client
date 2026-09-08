import java.util.Locale;

/**
 * Asynchronously indexes every item definition available in the item archive.
 * Selecting a result asks the server to drop one item at the player position.
 */
final class SceneItemCatalog {

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

    private SceneItemCatalog() {
    }

    static void start() {
        synchronized (SceneItemCatalog.class) {
            if (started || Exception_Sub1.itemDefinitions == null) {
                return;
            }
            started = true;
            loading = true;
            Thread worker = new Thread(new Runnable() {
                @Override
                public void run() {
                    load();
                }
            }, "void-item-assets");
            worker.setDaemon(true);
            worker.start();
        }
    }

    static boolean isLoading() {
        return loading;
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
        Entry[] matches = new Entry[snapshot.length];
        int count = 0;
        for (Entry entry : snapshot) {
            boolean matchesQuery = parsed.idSearch
                    ? parsed.id != null && entry.itemId == parsed.id
                    : entry.normalizedName.indexOf(normalized) != -1;
            if (!matchesQuery) {
                continue;
            }
            matches[count++] = entry;
        }
        results = matches;
        resultCount = count;
        resultQuery = normalized;
        resultGeneration = currentGeneration;
        return count;
    }

    static boolean containsResult(int itemId) {
        for (int i = 0; i < resultCount; i++) {
            if (results[i].itemId == itemId) {
                return true;
            }
        }
        return false;
    }

    static Entry resultAt(int index) {
        return index >= 0 && index < resultCount ? results[index] : null;
    }

    private static void load() {
        ItemDefinitionProvider provider = Exception_Sub1.itemDefinitions;
        if (provider == null) {
            loading = false;
            return;
        }
        try {
            int expected = Math.max(0, provider.itemCount);
            total = expected;
            java.util.ArrayList<Entry> loaded = new java.util.ArrayList<Entry>(Math.min(expected, 4096));
            for (int itemId = 0; itemId < expected; itemId++) {
                try {
                    ItemDefinition definition = provider.getItemDefinition(90, itemId);
                    String name = definition == null ? null : definition.itemName;
                    if (name == null || name.length() == 0 || "null".equalsIgnoreCase(name)) {
                        name = "Unnamed item";
                    }
                    loaded.add(new Entry(itemId, name));
                } catch (Throwable ignored) {
                    // A malformed definition must not stop the remaining cache scan.
                }
                scanned++;
                if ((scanned & 1023) == 0) {
                    publish(loaded);
                }
            }
            publish(loaded);
            complete = true;
        } catch (Throwable t) {
            System.out.println("scene-editor item catalog: " + t.getMessage());
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
                return left.itemId < right.itemId ? -1 : (left.itemId == right.itemId ? 0 : 1);
            }
        });
        entries = snapshot;
        generation++;
    }

    static final class Entry {
        final int itemId;
        final String name;
        final String normalizedName;

        Entry(int itemId, String name) {
            this.itemId = itemId;
            this.name = name;
            this.normalizedName = name.toLowerCase(Locale.ROOT);
        }
    }
}
