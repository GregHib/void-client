/* Component372 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component372
/**
 * RENAMED from `Class239_Sub19` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt6039;
    static int anInt6040;
    static int anInt6041;
    static int anInt6042;
    static int anInt6043;
    static int anInt6044;
    static int anInt6045;
    static int anInt6046;
    static int anInt6047;

    final int getDefaultValue(int i) {
        anInt6041++;
        if (i != 20014) return -14;
        return 0;
    }

    Component372(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    Component372(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void validateValue(boolean bool) {
        anInt6045++;
        if (bool != false) anInt6043 = 2;
    }

    final int getValue(int i, int i_0_) {
        if (i != 3) anInt6043 = 15;
        anInt6039++;
        return 1;
    }

    static final void method1803(int i, String string, int i_1_) {
        anInt6047++;
        if (i_1_ != -32394) method1803(93, null, 106);
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i, (byte) 105, 3);
        class348_sub42_sub15.method3246(i_1_ ^ 0x1d18);
        class348_sub42_sub15.aString9654 = string;
    }

    final void setValue(int i, int i_2_) {
        anInt6046++;
        this.preferenceValue = i_2_;
        int i_3_ = -25 / ((82 - i) / 35);
    }

    static final void method1804(int i) {
        HashNodeSub10.method3211((byte) 60);
        if (i != 8839) anInt6042 = 63;
        anInt6040++;
    }

    final int method1805(int i) {
        if (i != -32350) return -40;
        anInt6044++;
        return this.preferenceValue;
    }
}
