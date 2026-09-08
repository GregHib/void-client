/* Component272 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component272
/**
 * RENAMED from `Class239_Sub3` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5858;
    static int anInt5859;
    static int anInt5860;
    static int anInt5861;
    static int anInt5862;
    static int anInt5863;
    static int anInt5864;
    static int anInt5865;
    static int anInt5866;
    static int anInt5867;
    static int anInt5868;
    static int anInt5869;
    static int anInt5870;
    static int anInt5871;

    final void setValue(int i, int i_0_) {
        this.preferenceValue = i_0_;
        anInt5862++;
        int i_1_ = -40 / ((i - 82) / 35);
    }

    final int method1727(int i) {
        if (i != -32350) anInt5871 = 39;
        anInt5869++;
        return this.preferenceValue;
    }

    static final void method1728(int i, int i_2_, int i_3_, boolean bool, int i_4_) {
        anInt5860++;
        if (Component233.method2547(i_3_, (byte) 84)) AbstractShaderSub1.method3534(false, i_2_, i_4_, bool, i, (DefinitionSub33.openInterfaces[i_3_]));
    }

    Component272(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final int getDefaultValue(int i) {
        if (i != 20014) anInt5871 = -72;
        anInt5867++;
        return 0;
    }

    Component272(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final boolean method1729(int i) {
        if (i <= 85) return true;
        anInt5861++;
        return true;
    }

    static final void method1730(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        if (i_10_ != -128) method1730(-6, -95, 101, -81, 56, 14, -29, -19);
        anInt5868++;
        int i_12_ = -i_9_ + i_5_;
        int i_13_ = i_9_ + i_6_;
        for (int i_14_ = i_6_; i_14_ < i_13_; i_14_++)
            MenuOpener.fillInts(-27, i_7_, DisplayModeManagerContainer167.anIntArrayArray255[i_14_], i_11_, i);
        int i_15_ = i_7_ + -i_9_;
        int i_16_ = i_9_ + i_11_;
        for (int i_17_ = i_5_; i_12_ < i_17_; i_17_--)
            MenuOpener.fillInts(i_10_ + 101, i_7_, DisplayModeManagerContainer167.anIntArrayArray255[i_17_], i_11_, i);
        for (int i_18_ = i_13_; i_18_ <= i_12_; i_18_++) {
            int[] is = DisplayModeManagerContainer167.anIntArrayArray255[i_18_];
            MenuOpener.fillInts(-27, i_16_, is, i_11_, i);
            MenuOpener.fillInts(-27, i_15_, is, i_16_, i_8_);
            MenuOpener.fillInts(-27, i_7_, is, i_15_, i);
        }
    }

    static final void method1731(int i) {
        anInt5863++;
        NodeSub45 class348_sub45 = ((NodeSub45) Component327.aClass262_8744.first(i ^ 0x5));
        boolean bool = (Component156.aClass46_3701 != null || HashNode.anInt7059 > 0);
        int i_19_ = class348_sub45.getX((byte) -128);
        int i_20_ = class348_sub45.getY(119);
        if (bool) Component21.anInt3655 = 1;
        if (!bool) ColoredTextBuilder.processMenuAction((byte) 109, Component192.menuTip, i_20_, i_19_);
        else Component161.aMenuEntry_1946 = Component192.menuTip;
        if (i != 1) method1734(-88, null, (byte) -126, false);
    }

    static final boolean method1732(byte i, int i_21_) {
        anInt5865++;
        int i_22_ = i & 0xff;
        if (i_22_ == 0) return false;
        return i_21_ < (~i_22_) || i_22_ >= 160 || Component352.cp1252HighChars[i_22_ + -128] != 0;
    }

    final void validateValue(boolean bool) {
        anInt5864++;
        if (method1735(bool)) {
            if (this.preferences.aClass239_Sub25_7271.method1830((byte) -97) && !DisplayModeManagerContainer346.method1210((byte) -94, this.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350))) this.preferenceValue = 1;
            if (this.preferences.aClass239_Sub8_7254.method1751(-32350) == 1) this.preferenceValue = 1;
        }
        if (this.preferenceValue == 3) this.preferenceValue = 2;
        if (bool != false) validateValue(true);
        if (this.preferenceValue < 0 || this.preferenceValue > 3) this.preferenceValue = getDefaultValue(20014);
    }

    static final void method1733(byte i, int i_23_) {
        anInt5870++;
        if (i != -78) method1732((byte) 80, -38);
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i_23_, (byte) 105, 11);
        class348_sub42_sub15.method3251(-16058);
    }

    final int getValue(int i, int i_24_) {
        anInt5866++;
        if (NodeCache.method576(i_24_, 29)) {
            if (this.preferences.aClass239_Sub25_7271.method1830((byte) -97) && !DisplayModeManagerContainer346.method1210((byte) -113, this.preferences.aClass239_Sub25_7271.getPreferenceValue(-32350))) return 3;
            if (this.preferences.aClass239_Sub8_7254.method1751(-32350) == 1) return 3;
        }
        if (i_24_ == i) return 3;
        if (NodeCache.method576(i_24_, i ^ 0x56)) return 2;
        return 1;
    }

    static final Component48 method1734(int i, GraphicsToolkit var_ha, byte i_25_, boolean bool) {
        try {
            anInt5859++;
            if (i == -1) return null;
            if (NodeSub1.anIntArray6547 != null) {
                for (int i_26_ = 0; i_26_ < NodeSub1.anIntArray6547.length; i_26_++) {
                    if (NodeSub1.anIntArray6547[i_26_] == i) return HelveticaFont.aClass352Array2636[i_26_];
                }
            }
            Component48 class352 = (Component48) Component9.aClass60_4139.get(i, -92);
            if (class352 != null) {
                if (bool && class352.aClass143_4333 == null) {
                    Component184 class143 = Component98.method1766((byte) -76, i, s.aClass45_4585);
                    if (class143 == null) return null;
                    class352.aClass143_4333 = class143;
                }
                return class352;
            }
            int i_27_ = -118 / ((-33 - i_25_) / 44);
            Component170[] class207s = Component170.method1523(DisplayModeManagerContainer271.aClass45_518, i);
            if (class207s == null) return null;
            Component184 class143 = Component98.method1766((byte) -39, i, s.aClass45_4585);
            if (class143 == null) return null;
            if (!bool) class352 = new Component48(var_ha.method3686(class143, class207s, true));
            else class352 = new Component48(var_ha.method3686(class143, class207s, true), class143);
            Component9.aClass60_4139.putOne(class352, i, (byte) -109);
            return class352;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("jaa.K(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_25_ + ',' + bool + ')'));
        }
    }

    final boolean method1735(boolean bool) {
        if (bool != false) anInt5871 = -86;
        anInt5858++;
        return NodeCache.method576(this.preferenceValue, 29);
    }
}
