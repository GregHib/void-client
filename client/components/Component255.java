/* Component255 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component255
/**
 * RENAMED from `Class58` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1056;
    private long aLong1057;
    private int anInt1058;
    static int anInt1059;
    static int anInt1060;
    static int anInt1061;
    static int anInt1062;
    static int anInt1063;
    static int anInt1064 = -2;
    static int anInt1065;
    static int anInt1066;
    static int anInt1067;

    static final int method532(int i, int i_0_, boolean bool, int i_1_) {
        anInt1061++;
        NodeSub13 class348_sub13 = AbstractGlTextureSub4.getContainerNode((byte) -120, i_0_, bool);
        if (class348_sub13 == null) return 0;
        if (i == -1) return 0;
        int i_2_ = 0;
        for (int i_3_ = 0; (i_3_ < class348_sub13.amounts.length); i_3_++) {
            if (class348_sub13.itemIds[i_3_] == i) i_2_ += class348_sub13.amounts[i_3_];
        }
        int i_4_ = 73 % ((i_1_ - -52) / 63);
        return i_2_;
    }

    private final void method533(ColoredTextBuilder class325, int i) {
        aLong1057 |= class325.anInt4070 << anInt1058++ * ColoredTextBuilder.anInt4081;
        anInt1063++;
        int i_5_ = 0 % ((28 - i) / 59);
    }

    private final int method534(byte i, int i_6_) {
        anInt1065++;
        if (i != 0) return -115;
        return (int) (aLong1057 >> ColoredTextBuilder.anInt4081 * i_6_) & 0xf;
    }

    static final void method535(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, byte i_12_) {
        anInt1062++;
        int i_13_ = LogicError.clamp(PauseTimer.anInt513, i_11_, Component72.anInt1910, 111);
        int i_14_ = LogicError.clamp(PauseTimer.anInt513, i_7_, Component72.anInt1910, -104);
        if (i_12_ >= -62) method535(80, -63, -10, 41, -65, 39, (byte) -89);
        int i_15_ = LogicError.clamp(Component22.anInt1745, i, Component27.anInt4960, -79);
        int i_16_ = LogicError.clamp(Component22.anInt1745, i_9_, Component27.anInt4960, 92);
        int i_17_ = LogicError.clamp(PauseTimer.anInt513, i_11_ + i_8_, Component72.anInt1910, 32);
        int i_18_ = LogicError.clamp(PauseTimer.anInt513, -i_8_ + i_7_, Component72.anInt1910, 41);
        for (int i_19_ = i_13_; i_17_ > i_19_; i_19_++)
            MenuOpener.fillInts(-27, i_16_, DisplayModeManagerContainer167.anIntArrayArray255[i_19_], i_15_, i_10_);
        for (int i_20_ = i_14_; i_18_ < i_20_; i_20_--)
            MenuOpener.fillInts(-27, i_16_, DisplayModeManagerContainer167.anIntArrayArray255[i_20_], i_15_, i_10_);
        int i_21_ = LogicError.clamp(Component22.anInt1745, i_8_ + i, Component27.anInt4960, 121);
        int i_22_ = LogicError.clamp(Component22.anInt1745, -i_8_ + i_9_, Component27.anInt4960, -101);
        for (int i_23_ = i_17_; i_23_ <= i_18_; i_23_++) {
            int[] is = DisplayModeManagerContainer167.anIntArrayArray255[i_23_];
            MenuOpener.fillInts(-27, i_21_, is, i_15_, i_10_);
            MenuOpener.fillInts(-27, i_16_, is, i_22_, i_10_);
        }
    }

    Component255(ColoredTextBuilder class325) {
        aLong1057 = class325.anInt4070;
        anInt1058 = 1;
    }

    Component255(ColoredTextBuilder[] class325s) {
        for (int i = 0; i < class325s.length; i++)
            method533(class325s[i], 92);
    }

    static final boolean method536(int i, boolean bool, int i_24_, int i_25_, int i_26_) {
        if (bool != false) method536(-65, true, 105, -126, 39);
        anInt1066++;
        if ((ObjectDeserializer.aByteArrayArrayArray6962[0][i_24_][i] & 0x2) != 0) return true;
        if ((0x10 & ObjectDeserializer.aByteArrayArrayArray6962[i_26_][i_24_][i]) != 0) return false;
        return i_25_ == Component98.getEffectivePlane(-55, i_26_, i, i_24_);
    }

    final ColoredTextBuilder method537(int i, int i_27_) {
        anInt1060++;
        int i_28_ = 4 % ((-35 - i_27_) / 53);
        return ColoredTextBuilder.method2598(method534((byte) 0, i), -109);
    }

    final int method538(byte i) {
        anInt1056++;
        if (i >= -114) method538((byte) 105);
        return anInt1058;
    }
}
