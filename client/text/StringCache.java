/* StringCache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class351` (JODE-obfuscated).
 * String-keyed cache. Backed by a NodeCache (aClass60_4327 = new NodeCache(3000000,200)); isOnIgnoreList(String,int) looks up by name. Used by CacheStore and many systems.
 */

import java.awt.*;

final class StringCache {
    static int anInt4322;
    /** Secondary constructor value (often payload/group size). */
    int size;
    static int anInt4324;
    static int anInt4325;
    /** Primary id (packet opcode / cache key). */
    private int opcode;
    static NodeCache aClass60_4327 = new NodeCache(3000000, 200);
    /**
     * Developer console (purple band) open. Toggled by {@code `} / 4-finger tap;
     * read reflectively by {@code voidawt.AwtHost.isDevConsoleOpen}.
     */
    static boolean devConsoleOpen = false;
    static Font aFont4329;

    /** True if {@code string} matches an ignore-list display name (current or previous). */
    static final boolean isOnIgnoreList(String string, int i) {
        anInt4324++;
        if (string == null) return false;
        for (int i_0_ = 0; (i_0_ < MenuEntry.ignoreCount); i_0_++) {
            if (string.equalsIgnoreCase(DisplayModeManagerContainer145.ignoreDisplayNames[i_0_])) return true;
            if (string.equalsIgnoreCase(ShaderSub2.ignoreLastDisplayNames[i_0_])) return true;
        }
        if (i != 28280) devConsoleOpen = false;
        return false;
    }

    public final String toString() {
        anInt4325++;
        throw new IllegalStateException();
    }

    /** Packet / cache opcode id assigned at construction ({@code new StringCache(opcode, size)}). */
    final int getOpcode(int i) {
        anInt4322++;
        if (i != 200) opcode = -78;
        return opcode;
    }

    public static void clearStatics(boolean bool) {
        aFont4329 = null;
        aClass60_4327 = null;
        if (bool != true) isOnIgnoreList(null, -16);
    }

    StringCache(int i, int i_1_) {
        opcode = i;
        this.size = i_1_;
    }
}
