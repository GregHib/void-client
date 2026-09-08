/* CustomCursorSetting - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Client preference: custom (Jagex) cursors on/off.
 * <p>
 * Value {@code 0} = use OS pointer only; {@code 1} = allow archive-33 cursors.
 * {@link Component373#applyCustomCursor} compares the first arg against
 * {@link #getValue} — when equal, forces cursor id {@code -1} (clear custom).
 * Draw-loop callers pass {@code 0}, so {@code getValue()==0} disables customs.
 * <p>
 * CS2: write opcode 6028, read opcode 6128. Stored on
 * {@link NodeSub51#customCursorSetting}. Default from {@link #getDefaultValue} is {@code 1}.
 * <p>
 * RENAMED from {@code Class239_Sub22} / {@code Component287}. Note: static
 * {@link #anInt6076} is an unrelated bit-mask parked on this class.
 */
final class CustomCursorSetting extends Component339 {
    static int anInt6070;
    static int anInt6071;
    static int anInt6072;
    static int anInt6073;
    static int anInt6074;
    static Component183 aClass114_6075 = new Component183(89, 0);
    /** Unrelated bit-mask constant parked here (noise / FFT helpers). */
    static int anInt6076;

    /** Default when unset / invalid: custom cursors enabled. */
    final int getDefaultValue(int i) {
        anInt6072++;
        if (i != 20014) return 63;
        return 1;
    }

    final void validateValue(boolean bool) {
        if (this.preferenceValue != 1 && this.preferenceValue != 0) this.preferenceValue = getDefaultValue(20014);
        anInt6070++;
        if (bool != false) anInt6076 = 59;
    }

    final void setValue(int i, int i_0_) {
        anInt6074++;
        this.preferenceValue = i_0_;
        int i_1_ = 126 / ((82 - i) / 35);
    }

    CustomCursorSetting(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    /** {@code 0}=custom cursors off, {@code 1}=on. */
    final int getValue(int i) {
        if (i != -32350) method1816(84);
        anInt6071++;
        return this.preferenceValue;
    }

    CustomCursorSetting(int i, NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    public static void method1816(int i) {
        aClass114_6075 = null;
        if (i != 1) aClass114_6075 = null;
    }

    final int getValue(int i, int i_2_) {
        anInt6073++;
        if (i != 3) anInt6076 = -121;
        return 1;
    }
}
