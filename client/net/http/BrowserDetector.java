/* BrowserDetector - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class179` (JODE-obfuscated).
 * Browser capability detector. Probes for 'havefirefox' / 'haveie6' (and similar) to choose the embedded-browser path.
 */

final class BrowserDetector {
    static int anInt2355;
    static int anInt2356;
    static int anInt2357;
    static int anInt2358;
    static int anInt2359;
    /** When true, capacity grows by ×{@link #growth}; else by +{@link #growth}. */
    private boolean doubleCapacity = false;
    static int anInt2361 = 1;
    static int anInt2362;
    static int anInt2363;
    /** Highest used index in {@link #elements} (−1 if empty). */
    private int highestIndex = -1;
    /** Capacity growth step/factor for {@link #nextCapacity}. */
    private final int growth;
    static int anInt2366;
    /** Backing store for capability / probe strings. */
    private String[] elements = new String[0];
    static int anInt2368;
    static int anInt2369;

    static final Object wrapSoft(byte[] is, boolean bool, byte i) {
        if (i < 73) anInt2361 = -51;
        anInt2363++;
        if (is == null) return null;
        if (is.length > 136 && !DisplayModeManagerContainer167.aBoolean247) {
            try {
                AbstractBuffer class344 = new ByteBufferReader();
                class344.setBytes((byte) 62, is);
                return class344;
            } catch (Throwable throwable) {
                DisplayModeManagerContainer167.aBoolean247 = true;
            }
        }
        if (bool) return GlToolkitSub3.texStorage2D(is, 0);
        return is;
    }

    /** Next capacity ≥ {@code i} using {@link #growth}/{@link #doubleCapacity}. */
    private final int nextCapacity(int i, int i_0_) {
        int i_1_ = 71 % ((i_0_ - -4) / 53);
        anInt2362++;
        int i_2_ = elements.length;
        while (i_2_ <= i) {
            if (!doubleCapacity) i_2_ += growth;
            else if (i_2_ != 0) i_2_ *= growth;
            else i_2_ = 1;
        }
        return i_2_;
    }

    static final int unpackHighBits(boolean bool, int i) {
        anInt2368++;
        if (bool != true) anInt2361 = -32;
        return i >>> 10;
    }

    /** Open {@code string} in an external browser (IE6/Firefox applet-param aware). */
    static final void openBrowserUrl(String string, ReflectionInvoker class297, boolean bool, boolean bool_3_, int i) {
        try {
            anInt2369++;
            if (bool_3_) {
                if (ReflectionInvoker.aString3803.startsWith("win") && class297.signed) {
                    String string_4_ = null;
                    if (ToolkitFactory.anApplet1530 != null) string_4_ = ToolkitFactory.anApplet1530.getParameter("haveie6");
                    if (string_4_ == null || !string_4_.equals("1")) {
                        Task class144 = BrowserUrlOpener.openUrl(class297, string, -117, 0);
                        Component203.aClass144_8766 = class144;
                        Component195.aClass297_5017 = class297;
                        CacheNode.aString9554 = string;
                        return;
                    }
                }
                if (ReflectionInvoker.aString3803.startsWith("mac")) {
                    String string_5_ = null;
                    if (ToolkitFactory.anApplet1530 != null) string_5_ = ToolkitFactory.anApplet1530.getParameter("havefirefox");
                    if (string_5_ != null && string_5_.equals("1") && bool) {
                        BrowserUrlOpener.openUrl(class297, string, 42, 1);
                        return;
                    }
                }
                BrowserUrlOpener.openUrl(class297, string, 96, 2);
            } else BrowserUrlOpener.openUrl(class297, string, -96, 3);
            int i_6_ = -6 / ((i - 20) / 44);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bo.C(" + (string != null ? "{...}" : "null") + ',' + (class297 != null ? "{...}" : "null") + ',' + bool + ',' + bool_3_ + ',' + i + ')'));
        }
    }

    /** Copy used slots {@code [0 .. highestIndex]} inclusive. */
    final String[] toArray(int i) {
        anInt2359++;
        int i_7_ = 95 % ((15 - i) / 32);
        String[] strings = new String[1 + highestIndex];
        Component313.arraycopyObjects(elements, 0, strings, 0, highestIndex - -1);
        return strings;
    }

    /** Store {@code string} at index {@code i_8_}, growing as needed. */
    private final void set(String string, int i, int i_8_) {
        if (i >= -56) doubleCapacity = true;
        anInt2366++;
        if (i_8_ > highestIndex) highestIndex = i_8_;
        if (elements.length <= i_8_) ensureCapacity(i_8_, -107);
        elements[i_8_] = string;
    }

    /** Grow {@link #elements} to at least index {@code i}. */
    private final void ensureCapacity(int i, int i_9_) {
        int i_10_ = 50 % ((3 - i_9_) / 63);
        anInt2358++;
        String[] strings = new String[nextCapacity(i, 108)];
        Component313.arraycopyObjects(elements, 0, strings, 0, elements.length);
        elements = strings;
    }

    /** Append {@code string} after {@link #highestIndex}. */
    final void add(int i, String string) {
        set(string, -99, 1 + highestIndex);
        anInt2356++;
        if (i != -1) doubleCapacity = true;
    }

    static final void method1365(int i, byte i_11_, Buffer class348_sub49) {
        if (i_11_ > -113) anInt2361 = -64;
        if (DisplayModeManagerContainer152.aClass78_4538 != null) {
            try {
                DisplayModeManagerContainer152.aClass78_4538.seek(0L, (byte) 59);
                DisplayModeManagerContainer152.aClass78_4538.write(i, 24, true, (class348_sub49.payload));
            } catch (Exception exception) {
                /* empty */
            }
        }
        anInt2355++;
    }

    BrowserDetector(int i, boolean bool) {
        growth = i;
        doubleCapacity = bool;
    }

    public final String toString() {
        anInt2357++;
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("[");
        for (int i = 0; highestIndex > i; i++) {
            if (i != 0) stringbuffer.append(", ");
            stringbuffer.append(elements[i]);
        }
        stringbuffer.append("]");
        return stringbuffer.toString();
    }
}
