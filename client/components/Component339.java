/* Component339 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Base class for a single client preference option (RENAMED from `Class239`).
 * Subclasses ({@code Component20}, {@code Component25}, …) clamp
 * {@link #preferenceValue} to their legal range and read/write via
 * {@link #getDefaultValue}/{@link #setValue}/{@link #validateValue}.
 * Held by {@link NodeSub51} (preferences root).
 */
abstract class Component339 {
    static int anInt3134;
    static Component183 aClass114_3135 = new Component183(108, 5);
    /** Owning preferences bag ({@link NodeSub51}). */
    NodeSub51 preferences;
    static int anInt3137;
    /** Current discrete option value (range depends on subclass). */
    int preferenceValue;
    static int anInt3139;
    static int anInt3140;
    static int anInt3141;
    static int anInt3142;
    static Component183 aClass114_3143;
    /** Shared 520+ byte sector scratch for {@link CacheIndexReader}. */
    static byte[] sectorBuffer = new byte[520];
    static Component183 aClass114_3145;
    static CacheStore aClass45_3146;
    /** Global cursor-def cache (archive 33); set in {@link LoadingManager}. */
    static CursorDefinitionCache cursorDefinitions;

    /** All {@link BuildType}s: LIVE, RC, WIP. */
    static final BuildType[] values(int i) {
        if (i > -110) method1715(97);
        anInt3141++;
        return (new BuildType[]{Component342.LIVE, DefinitionSub20.RC, Component118.WIP});
    }

    abstract int getDefaultValue(int i);

    static final void method1711(int i, CacheStore class45, int i_0_, CacheStore class45_1_) {
        try {
            MenuOpener.aClass45_4843 = class45_1_;
            anInt3140++;
            if (i != 7) aClass45_3146 = null;
            Component161.aClass45_1940 = class45;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("su.Q(" + i + ',' + (class45 != null ? "{...}" : "null") + ',' + i_0_ + ',' + (class45_1_ != null ? "{...}" : "null") + ')'));
        }
    }

    abstract void setValue(int i, int i_2_);

    static final void method1713(boolean bool, int i) {
        Component272.method1728(PacketReader.canvasHeight, -1, r.anInt9721, bool, Component236.canvasWidth);
        if (i == 520) anInt3137++;
    }

    abstract int getValue(int i, int i_3_);

    public static void method1715(int i) {
        aClass114_3145 = null;
        aClass114_3143 = null;
        aClass45_3146 = null;
        aClass114_3135 = null;
        sectorBuffer = null;
        cursorDefinitions = null;
        if (i < 13) values(-99);
    }

    abstract void validateValue(boolean bool);

    Component339(NodeSub51 class348_sub51) {
        this.preferences = class348_sub51;
        this.preferenceValue = getDefaultValue(20014);
    }

    static final void method1717(int i, int i_4_, int i_5_, int i_6_) {
        ObjectDeserializer.aByteArrayArrayArray6962 = new byte[i_6_][i_5_][i_4_];
        if (i != 19278) method1717(35, 126, -83, 85);
        anInt3134++;
    }

    Component339(int i, NodeSub51 class348_sub51) {
        this.preferences = class348_sub51;
        this.preferenceValue = i;
    }

    final void applyValue(int i, int i_7_) {
        if (i_7_ < 3) setValue(12, 42);
        anInt3139++;
        if (getValue(3, i) != 3) setValue(124, i);
    }

    static {
        aClass114_3143 = new Component183(7, 3);
    }
}
