/* Component139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component139
/**
 * RENAMED from `Class239_Sub27` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt6127;
    static DisplayModeManagerContainer196 aClass341_6128;
    static int anInt6129;
    static int anInt6130;
    static int anInt6131;
    static int anInt6132;
    static int anInt6133;

    static final void method1839(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        anInt6129++;
        int i_5_ = 0;
        int i_6_ = i_0_;
        int i_7_ = i_4_ * i_4_;
        int i_8_ = i_0_ * i_0_;
        int i_9_ = i_8_ << 1;
        int i_10_ = i_7_ << 1;
        int i_11_ = i_0_ << 1;
        int i_12_ = i_9_ + i_7_ * (-i_11_ + 1);
        int i_13_ = -((i_11_ + i_2_) * i_10_) + i_8_;
        int i_14_ = i_7_ << 2;
        int i_15_ = i_8_ << 2;
        int i_16_ = i_9_ * (3 + (i_5_ << 1));
        int i_17_ = i_10_ * (-3 + (i_6_ << 1));
        int i_18_ = i_15_ * (i_5_ - -1);
        if (Component72.anInt1910 <= i_1_ && PauseTimer.anInt513 >= i_1_) {
            int i_19_ = LogicError.clamp(Component22.anInt1745, i + i_4_, Component27.anInt4960, -89);
            int i_20_ = LogicError.clamp(Component22.anInt1745, -i_4_ + i, Component27.anInt4960, -116);
            MenuOpener.fillInts(-27, i_19_, DisplayModeManagerContainer167.anIntArrayArray255[i_1_], i_20_, i_3_);
        }
        int i_21_ = i_14_ * (i_6_ - 1);
        while (i_6_ > 0) {
            if (i_12_ < 0) {
                while (i_12_ < 0) {
                    i_13_ += i_18_;
                    i_12_ += i_16_;
                    i_5_++;
                    i_16_ += i_15_;
                    i_18_ += i_15_;
                }
            }
            if (i_13_ < 0) {
                i_12_ += i_16_;
                i_13_ += i_18_;
                i_16_ += i_15_;
                i_18_ += i_15_;
                i_5_++;
            }
            i_13_ += -i_17_;
            i_12_ += -i_21_;
            i_21_ -= i_14_;
            i_17_ -= i_14_;
            i_6_--;
            int i_22_ = i_1_ + -i_6_;
            int i_23_ = i_6_ + i_1_;
            if (i_23_ >= Component72.anInt1910 && i_22_ <= PauseTimer.anInt513) {
                int i_24_ = LogicError.clamp(Component22.anInt1745, i + i_5_, Component27.anInt4960, 86);
                int i_25_ = LogicError.clamp(Component22.anInt1745, -i_5_ + i, Component27.anInt4960, 32);
                if (Component72.anInt1910 <= i_22_) MenuOpener.fillInts(i_2_ + -26, i_24_, DisplayModeManagerContainer167.anIntArrayArray255[i_22_], i_25_, i_3_);
                if (PauseTimer.anInt513 >= i_23_) MenuOpener.fillInts(-27, i_24_, DisplayModeManagerContainer167.anIntArrayArray255[i_23_], i_25_, i_3_);
            }
        }
    }

    final int method1840(int i) {
        anInt6127++;
        if (i != -32350) aClass341_6128 = null;
        return this.preferenceValue;
    }

    public static void method1841(int i) {
        if (i != 16878) method1839(-83, -10, 27, 111, 41, 109);
        aClass341_6128 = null;
    }

    final void setValue(int i, int i_26_) {
        this.preferenceValue = i_26_;
        anInt6132++;
        int i_27_ = 123 / ((82 - i) / 35);
    }

    final int getValue(int i, int i_28_) {
        if (i != 3) aClass341_6128 = null;
        anInt6130++;
        return 3;
    }

    Component139(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    Component139(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final int getDefaultValue(int i) {
        anInt6133++;
        if (i != 20014) validateValue(true);
        if ((this.preferences.method3422(674) == RunescapeInfo.RUNESCAPE) && this.preferences.method3425(-111)) return 0;
        return 1;
    }

    final void validateValue(boolean bool) {
        anInt6131++;
        this.preferenceValue = getDefaultValue(20014);
        if (bool != false) getDefaultValue(98);
    }
}
