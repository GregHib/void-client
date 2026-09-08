/* NamedInteger - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class364` (JODE-obfuscated).
 * Named int constant (label + {@link #value}).
 * World-list channels use statics like {@link Component326#LIVE}, {@link WaterShaderSub8#WTRC}, {@link DisplayModeManagerContainer154#LOCAL}.
 */

final class NamedInteger {
    int value;
    static int anInt4467;
    static int anInt4468;
    static int anInt4469;

    public final String toString() {
        anInt4467++;
        throw new IllegalStateException();
    }

    /** Clear the NamedInteger-related LRU used by channel/world-list helpers. */
    static final void clearCaches(int i) {
        if (i <= 35) clearCaches(98);
        anInt4468++;
        Component121.aClass60_4543.clear(0);
    }

    NamedInteger(String string, int i) {
        this.value = i;
    }
}
