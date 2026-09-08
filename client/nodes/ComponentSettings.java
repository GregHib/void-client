/* ComponentSettings - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Per-component interface settings / click-mask bitfield.
 * <p>
 * Looked up by {@link client#getComponentSettings}: either an IF-packet override
 * in {@code Component127.aClass356_2959}, or the widget's default
 * {@link DisplayModeManagerContainer57#settings}.
 * <p>
 * {@link #optionFlags} drives right-click visibility:
 * {@link #hasOption}(slot) is what {@link Component63#getComponentOption} checks
 * before returning {@link DisplayModeManagerContainer57#optionLabels}[slot].
 * Joystick alias dumps fall back to raw labels when this bit is off (disabled slot).
 * <p>
 * RENAMED from {@code Class348_Sub44} / {@code NodeSub44}.
 */
final class ComponentSettings extends Node {
    static int anInt7091;
    static int anInt7092;
    /** Secondary payload (often -1); paired with {@link #optionFlags} in IF updates. */
    int anInt7093;
    static int anInt7094;
    static int anInt7095;
    static int anInt7096;
    static int anInt7097;
    /**
     * Bitfield of enabled menu / interaction features.
     * Slot {@code i} option: bit {@code (optionFlags >> (i + 1)) & 1} — see {@link #hasOption}.
     * Bit 0 → Continue ({@link #hasContinue}); bit 21 → hover; bit 22 → targetable.
     */
    int optionFlags;
    static int anInt7099;
    static int anInt7100;
    static int anInt7101;

    /**
     * True when right-click / left-click option slot {@code i} (0..9) is enabled.
     * Opaque {@code bool} must be {@code false} at call sites that gate menus.
     */
    final boolean hasOption(int i, boolean bool) {
        anInt7091++;
        if (bool != false) anInt7092 = 29;
        return (0x1 & this.optionFlags >> i + 1) != 0;
    }

    /** True when this component accepts hover highlighting (mouse-over target). */
    final boolean hasHoverHighlight(int i) {
        if (i != 17356) hasContinue(8);
        anInt7095++;
        return (0x3df376 & this.optionFlags) >> 21 != 0;
    }

    /**
     * True when the component can be a "Use X -&gt;" / spell target while an
     * item or ability is selected ({@link Component66#buildComponentMenu}).
     */
    final boolean canBeTargeted(int i) {
        anInt7094++;
        if (i != 1) anInt7092 = -24;
        return (this.optionFlags & 0x433bfd) >> 22 != 0;
    }

    /**
     * How many parent hops to take for ancestor lookup
     * ({@link client#getAncestorComponent}).
     */
    final int getParentDepth(byte i) {
        anInt7099++;
        if (i < 43) hasOption(-16, false);
        return (this.optionFlags & 0x1f77eb) >> 18;
    }

    /** Bit 0 — component exposes a Continue option (dialogue / click-to-continue). */
    final boolean hasContinue(int i) {
        anInt7096++;
        if (i != 0) return true;
        return (0x1 & this.optionFlags) != 0;
    }

    static final int method3306(byte i) {
        if (i >= -90) anInt7101 = -7;
        anInt7097++;
        if (Buffer.anInt7207 == 1) return Component25.anInt6008;
        return HashTable.anInt1651;
    }

    /** Normalized click / event mask derived from {@link #optionFlags}. */
    final int getClickMask(int i) {
        anInt7100++;
        if (i < 10) this.anInt7093 = -51;
        return DefinitionSub5.method3060(this.optionFlags, true);
    }

    ComponentSettings(int i, int i_0_) {
        this.anInt7093 = i_0_;
        this.optionFlags = i;
    }
}
