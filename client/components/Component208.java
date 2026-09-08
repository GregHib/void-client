/* Component208 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component208
/**
 * RENAMED from {@code Class117} (JODE-obfuscated).
 * CS2/enum config type: maps int keys to int or String values with typed
 * {@link #keyType}/{@link #valueType} chars, defaults, and optional reverse lookup.
 */ {
    static int anInt1763;
    /** Default int returned by {@link #getInt} when the key is missing. */
    private int defaultInt;
    static int anInt1765;
    static StringCache aClass351_1766 = new StringCache(74, -1);
    /** Forward map: key → {@link NodeSub35} (int) or {@link NodeSub50} (String). */
    LruCache values;
    static int anInt1768;
    static int anInt1769;
    /** Reverse map built on demand for contains*Value queries. */
    private LruCache reverseLookup;
    static int anInt1771;
    static int anInt1772;
    static int anInt1773;
    /** Default String returned by {@link #getString} when the key is missing. */
    private String defaultString = "null";
    static int anInt1775;
    static int anInt1776;
    static int anInt1777;
    /** Script type char for keys (e.g. {@code i}/{@code s}). */
    char keyType;
    /** Script type char for values. */
    char valueType;
    static int anInt1780 = 0;

    /** Nulls static string-cache handle. */
    public static void clearStatics(int i) {
        if (i != -3) aClass351_1766 = null;
        aClass351_1766 = null;
    }

    /** Decodes one enum opcode from {@code class348_sub49} (types, defaults, value table). */
    private final void decodeOpcode(Buffer class348_sub49, int i, int i_0_) {
        if (i_0_ == 1) this.keyType = Cp1252Decoder.method462(class348_sub49.readByte(-91), -128);
        else if (i_0_ == 2) this.valueType = Cp1252Decoder.method462(class348_sub49.readByte(-119), -128);
        else if (i_0_ == 3) defaultString = class348_sub49.readString((byte) 86);
        else if (i_0_ == 4) defaultInt = class348_sub49.readInt((byte) -126);
        else if (i_0_ == 5 || i_0_ == 6) {
            int i_1_ = class348_sub49.readUnsignedShort(i ^ ~0x3235ab57);
            this.values = new LruCache(Component373.nextPowerOfTwo(i_1_, (byte) 108));
            for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
                int i_3_ = class348_sub49.readInt((byte) -126);
                Node class348;
                if (i_0_ != 5) class348 = new NodeSub35(class348_sub49.readInt((byte) -126));
                else class348 = new NodeSub50(class348_sub49.readString((byte) -35));
                this.values.put((byte) 21, i_3_, class348);
            }
        }
        anInt1765++;
        if (i != -21424) buildIntReverseLookup((byte) -15);
    }

    /** True if any mapped String value equals {@code string} (builds reverse lookup). */
    final boolean containsStringValue(boolean bool, String string) {
        anInt1776++;
        if (this.values == null) return false;
        if (bool != false) reverseLookup = null;
        if (reverseLookup == null) buildStringReverseLookup(true);
        for (NodeSub46 class348_sub46 = ((NodeSub46) reverseLookup.get(DisplayModeManagerContainer260.hashString(string, (byte) 109), -6008)); class348_sub46 != null; class348_sub46 = (NodeSub46) reverseLookup.continueGet(true)) {
            if (class348_sub46.name.equals(string)) return true;
        }
        return false;
    }

    /** True if any mapped int value equals {@code i} (builds reverse lookup). */
    final boolean containsIntValue(boolean bool, int i) {
        anInt1773++;
        if (this.values == null) return false;
        if (bool != true) return true;
        if (reverseLookup == null) buildIntReverseLookup((byte) 120);
        NodeSub35 class348_sub35 = (NodeSub35) reverseLookup.get(i, -6008);
        return class348_sub35 != null;
    }

    /** Builds reverseLookup keyed by int value → original key node. */
    private final void buildIntReverseLookup(byte i) {
        anInt1772++;
        reverseLookup = new LruCache(this.values.getCapacity(true));
        for (NodeSub35 class348_sub35 = ((NodeSub35) this.values.first(0)); class348_sub35 != null; class348_sub35 = (NodeSub35) this.values.next(0)) {
            NodeSub35 class348_sub35_4_ = new NodeSub35((int) class348_sub35.key);
            reverseLookup.put((byte) 26, class348_sub35.intValue, class348_sub35_4_);
        }
        if (i < 85) decode(111, null);
    }

    /** Reads the full enum definition (opcode stream terminated by 0). */
    final void decode(int i, Buffer class348_sub49) {
        anInt1763++;
        for (; ; ) {
            int i_5_ = class348_sub49.readUnsignedByte(i + 255);
            if (i_5_ == 0) break;
            decodeOpcode(class348_sub49, i + -21424, i_5_);
        }
        if (i != 0) defaultString = null;
    }

    /** Ensures {@link DisplayModeManagerContainer207#anIntArray9757} can hold {@code i_6_} ints. */
    static final void ensureIntArrayCapacity(byte i, int i_6_) {
        if (i < 109) anInt1780 = 10;
        anInt1769++;
        if (DisplayModeManagerContainer207.anIntArray9757 == null || DisplayModeManagerContainer207.anIntArray9757.length < i_6_) DisplayModeManagerContainer207.anIntArray9757 = new int[i_6_];
    }

    /** Builds reverseLookup keyed by {@link DisplayModeManagerContainer260#hashString} of values. */
    private final void buildStringReverseLookup(boolean bool) {
        reverseLookup = new LruCache(this.values.getCapacity(bool));
        anInt1768++;
        for (NodeSub50 class348_sub50 = ((NodeSub50) this.values.first(0)); class348_sub50 != null; class348_sub50 = (NodeSub50) this.values.next(0)) {
            NodeSub46 class348_sub46 = new NodeSub46((class348_sub50.stringValue), (int) (class348_sub50.key));
            reverseLookup.put((byte) 102, DisplayModeManagerContainer260.hashString((class348_sub50.stringValue), (byte) 120), class348_sub46);
        }
    }

    /** Sets the JS5 store used when loading enum definitions. */
    static final void setEnumCacheStore(CacheStore class45, byte i) {
        if (i >= -91) ensureIntArrayCapacity((byte) -93, 92);
        Component205.aClass45_5964 = class45;
        anInt1771++;
    }

    /** Returns the int value for key {@code i}, or {@link #defaultInt}. */
    final int getInt(boolean bool, int i) {
        if (bool != false) containsIntValue(false, -31);
        anInt1775++;
        if (this.values == null) return defaultInt;
        NodeSub35 class348_sub35 = ((NodeSub35) this.values.get(i, -6008));
        if (class348_sub35 == null) return defaultInt;
        return class348_sub35.intValue;
    }

    public Component208() {
        /* empty */
    }

    /** Returns the String value for key {@code i}, or {@link #defaultString}. */
    final String getString(int i, int i_7_) {
        anInt1777++;
        if (i_7_ <= 60) return null;
        if (this.values == null) return defaultString;
        NodeSub50 class348_sub50 = ((NodeSub50) this.values.get(i, -6008));
        if (class348_sub50 == null) return defaultString;
        return class348_sub50.stringValue;
    }
}
