/* CursorDefinitionCache - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;

final class CursorDefinitionCache
/**
 * Cache of {@link CursorDefinition} rows (archive group 33) plus soft-cached
 * cursor sprites. Constructed during loading ({@link LoadingManager}); exposed
 * as {@link Component339#cursorDefinitions}.
 * <p>
 * RENAMED from {@code Class166} / {@code Component290}. Evidence: {@code getFile(..., 33, id)}
 * and sole use from {@link Component373#applyCustomCursor}.
 * <p>
 * Note: several unrelated static helpers ({@link #method1288}, click ripples, …)
 * are still parked on this type from the deob dump.
 */ {
    static int anInt2178;
    static int anInt2179;
    /** Sprite archive for cursor images ({@link CursorDefinition#getSprite}). */
    CacheStore aClass45_2180;
    static int anInt2181;
    static int anInt2182;
    static Component183 aClass114_2183 = new Component183(0, -1);
    static int anInt2184;
    /** Soft cache of decoded {@link CursorDefinition} by id. */
    private final NodeCache aClass60_2185 = new NodeCache(64);
    static int anInt2186;
    static NodeList aClass262_2187 = new NodeList();
    /** Definition archive (group 33). */
    private final CacheStore aClass45_2188;
    static int anInt2189;
    /** Soft cache of cursor {@link Component170} sprites by sprite id. */
    NodeCache aClass60_2190 = new NodeCache(2);

    final void method1283(int i) {
        synchronized (aClass60_2185) {
            aClass60_2185.purgeSoftReferences(-76);
        }
        anInt2178++;
        synchronized (this.aClass60_2190) {
            this.aClass60_2190.purgeSoftReferences(-110);
        }
        if (i != 1) method1286(null, -124, null);
    }

    public static void method1284(int i) {
        aClass114_2183 = null;
        if (i == -21165) aClass262_2187 = null;
    }

    final void method1285(int i, int i_0_) {
        anInt2189++;
        synchronized (aClass60_2185) {
            aClass60_2185.processSoftEntries(2, i);
        }
        synchronized (this.aClass60_2190) {
            if (i_0_ != 8) this.aClass45_2180 = null;
            this.aClass60_2190.processSoftEntries(i_0_ + -6, i);
        }
    }

    static final void method1286(File file, int i, String string) {
        do {
            try {
                anInt2181++;
                Component300.aHashtable3548.put(string, file);
                if (i == 64) break;
                aClass114_2183 = null;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("pg.F(" + (file != null ? "{...}" : "null") + ',' + i + ',' + (string != null ? "{...}" : "null") + ')'));
            }
            break;
        } while (false);
    }

    /**
     * Load / soft-cache cursor definition {@code i_1_} from archive group 33.
     * Missing files yield an empty def (no sprite → caller clears custom cursor).
     */
    final CursorDefinition get(byte i, int i_1_) {
        anInt2182++;
        CursorDefinition class222;
        synchronized (aClass60_2185) {
            class222 = (CursorDefinition) aClass60_2185.get(i_1_, i ^ ~0x1d);
        }
        if (class222 != null) return class222;
        if (i != -104) this.aClass60_2190 = null;
        byte[] is;
        synchronized (aClass45_2188) {
            is = aClass45_2188.getFile(-1860, 33, i_1_);
        }
        class222 = new CursorDefinition();
        class222.cache = this;
        if (is != null) class222.decode(new Buffer(is), false);
        synchronized (aClass60_2185) {
            aClass60_2185.putOne(class222, i_1_, (byte) -116);
        }
        return class222;
    }

    static final void method1288(int i, int i_2_) {
        anInt2186++;
        for (Node class348 = Component127.aClass356_2959.first(0); class348 != null; class348 = Component127.aClass356_2959.next(0)) {
            if ((class348.key >> 48 & 0xffffL) == (long) i_2_) class348.unlink((byte) 119);
        }
    }

    static final void method1289(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt2179++;
        int i_7_ = AssetCacheLoader.anInt385;
        if (i_5_ != 8) method1284(-59);
        int i_8_ = ToolkitFactory.anInt1534;
        if (Component210.gameCanvasAttached) {
            i_7_ += BufferCacheSub3.method4008((byte) -126);
            i_8_ += Component110.method260(false);
        }
        if (Component20.anInt6048 == 1) {
            Component24 class105 = (DefinitionSub37.aClass105Array9467[Node.anInt4292 / 100]);
            class105.drawAt(i_7_ - 8, i_8_ + -8);
            Component103.method2663(-5590, -8 + i_7_, -8 + (i_7_ - -class105.method966()), -8 + i_8_, class105.method980() + -8 + i_8_);
        }
        if (Component20.anInt6048 == 2) {
            Component24 class105 = (DefinitionSub37.aClass105Array9467[Node.anInt4292 / 100 + 4]);
            class105.drawAt(i_7_ + -8, -8 + i_8_);
            Component103.method2663(-5590, i_7_ - 8, class105.method966() + i_7_ + -8, -8 + i_8_, class105.method980() + -8 + i_8_);
        }
        Component156.method2192((byte) 80);
    }

    final void method1290(int i) {
        anInt2184++;
        synchronized (aClass60_2185) {
            aClass60_2185.clear(0);
        }
        synchronized (this.aClass60_2190) {
            this.aClass60_2190.clear(0);
            if (i != -8) aClass114_2183 = null;
        }
    }

    CursorDefinitionCache(GameType class230, int i, CacheStore class45, CacheStore class45_9_) {
        try {
            aClass45_2188 = class45;
            this.aClass45_2180 = class45_9_;
            aClass45_2188.getFileCount(0, 33);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("pg.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (class45 != null ? "{...}" : "null") + ',' + (class45_9_ != null ? "{...}" : "null") + ')'));
        }
    }
}
