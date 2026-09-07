import java.util.Locale;

final class SceneCatalogQuery {
    private SceneCatalogQuery() {
    }

    static Query parse(String input) {
        String text = input == null ? "" : input.trim().toLowerCase(Locale.ROOT);
        boolean explicitId = text.startsWith("#") || text.startsWith("id:") || text.startsWith("id=");
        String idText = text;
        if (text.startsWith("#")) {
            idText = text.substring(1).trim();
        } else if (text.startsWith("id:") || text.startsWith("id=")) {
            idText = text.substring(3).trim();
        }
        Integer id = parseInteger(idText);
        return new Query(text, id, explicitId || id != null);
    }

    private static Integer parseInteger(String value) {
        if (value.length() == 0) {
            return null;
        }
        try {
            return Integer.valueOf(value);
        } catch (NumberFormatException ignored) {
            return null;
        }
    }

    static final class Query {
        final String text;
        final Integer id;
        final boolean idSearch;

        Query(String text, Integer id, boolean idSearch) {
            this.text = text;
            this.id = id;
            this.idSearch = idSearch;
        }
    }
}
