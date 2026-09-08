/* Component188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component188
/**
 * RENAMED from `Class239_Sub28` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt6134;
    static int anInt6135;
    static int anInt6136;
    static int anInt6137;
    static int anInt6138;
    static int anInt6139;
    static int anInt6140;
    static int anInt6141;
    static int anInt6142;
    static int anInt6143;

    static final boolean method1842(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
        anInt6134++;
        if (i_1_ != -1) return false;
        if (i_3_ >= i + i_5_ || i_3_ - -i_6_ <= i_5_) return false;
        return i_0_ + i_7_ > i_4_ && i_0_ < i_2_ + i_4_;
    }

    static final void method1843(int i, int i_8_, DisplayModeManagerContainer57 class46, boolean bool, int i_9_) {
        anInt6135++;
        if (i_8_ != -326) method1844(32, -33, false, 1, false, 64, -83);
        int i_10_ = class46.width;
        int i_11_ = class46.height;
        if (class46.widthMode == 0) class46.width = class46.baseWidth;
        else if (class46.widthMode != 1) {
            if (class46.widthMode == 2) class46.width = class46.baseWidth * i >> 14;
        } else class46.width = -class46.baseWidth + i;
        if (class46.heightMode != 0) {
            if (class46.heightMode != 1) {
                if (class46.heightMode == 2) class46.height = class46.baseHeight * i_9_ >> 14;
            } else class46.height = i_9_ - class46.baseHeight;
        } else class46.height = class46.baseHeight;
        if (class46.widthMode == 4) class46.width = (class46.height * class46.anInt710 / class46.anInt775);
        if (class46.heightMode == 4) class46.height = (class46.anInt775 * class46.width / class46.anInt710);
        if (DisplayModeManagerContainer356.aBoolean6327 && (client.getComponentSettings(class46).optionFlags != 0 || class46.type == 0)) {
            if (class46.height < 5 && class46.width < 5) {
                class46.height = 5;
                class46.width = 5;
            } else {
                if (class46.height <= 0) class46.height = 5;
                if (class46.width <= 0) class46.width = 5;
            }
        }
        if (Component98.anInt5943 == class46.contentType) NodeSub1.aClass46_6561 = class46;
        if (bool && class46.anObjectArray727 != null && (i_10_ != class46.width || (i_11_ != class46.height))) {
            NodeSub36 class348_sub36 = new NodeSub36();
            class348_sub36.aClass46_6989 = class46;
            class348_sub36.anObjectArray6987 = class46.anObjectArray727;
            NodeSub1Sub2.aClass262_8810.addTail(class348_sub36, -20180);
        }
    }

    static final void method1844(int i, int i_12_, boolean bool, int i_13_, boolean bool_14_, int i_15_, int i_16_) {
        HashNodeSub4.anInt9515 = i_13_;
        Component300.anInt3550 = i_16_;
        if (bool_14_ == false) {
            DefinitionSub31.anInt9406 = i;
            anInt6136++;
            NodeSub35.anInt6981 = i_12_;
            GlFramebufferTexture.anInt8537 = i_15_;
            if (bool && GlFramebufferTexture.anInt8537 >= 100) {
                Component317.anInt8685 = 256 + 512 * Component300.anInt3550;
                WaterSurfaceShader.anInt6246 = 256 + NodeSub35.anInt6981 * 512;
                DisplayModeManagerContainer50.anInt3855 = (Component300.method2064(WaterSurfaceShader.anInt6246, Component117.anInt4372, 11219, Component317.anInt8685) + -HashNodeSub4.anInt9515);
            }
            DefinitionSub21.cameraMode = 2;
            JaclibLoader.anInt167 = ShaderLinker.anInt10163 = -1;
        }
    }

    Component188(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final int getValue(int i, int i_17_) {
        if (i != 3) setValue(-55, 59);
        anInt6139++;
        return 1;
    }

    Component188(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void validateValue(boolean bool) {
        if (bool != false) method1847(null, 64);
        anInt6142++;
        if (this.preferenceValue != 1 && this.preferenceValue != 0) this.preferenceValue = getDefaultValue(20014);
    }

    final int getDefaultValue(int i) {
        if (i != 20014) return 52;
        anInt6138++;
        return 1;
    }

    final int method1845(int i) {
        anInt6141++;
        if (i != -32350) return -127;
        return this.preferenceValue;
    }

    static final boolean method1846(int i, int i_18_, int i_19_) {
        if (i_19_ <= 42) return true;
        anInt6143++;
        return DisplayModeManagerContainer347.method2075(i_18_, -126, i) | (0x40000 & i_18_) != 0 || Component224.method2056(i_18_, 122, i);
    }

    static final String[] method1847(String[] strings, int i) {
        anInt6140++;
        String[] strings_20_ = new String[5];
        for (int i_21_ = i; i_21_ < 5; i_21_++) {
            strings_20_[i_21_] = i_21_ + ": ";
            if (strings != null && strings[i_21_] != null) strings_20_[i_21_] = strings_20_[i_21_] + strings[i_21_];
        }
        return strings_20_;
    }

    final void setValue(int i, int i_22_) {
        int i_23_ = -89 / ((82 - i) / 35);
        anInt6137++;
        this.preferenceValue = i_22_;
    }
}
