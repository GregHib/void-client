/* LibraryCreditsText - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class239_Sub11` (JODE-obfuscated).
 * Native-library credits text. Extends Component339; lists the bundled native libraries (jagtheora, jagmisc, huffman) in the about/credits panel.
 */

final class LibraryCreditsText extends Component339 {
    static Component183 aClass114_5949 = new Component183(69, 12);
    static Component183 aClass114_5950;
    static int anInt5951 = 1339;
    static int anInt5952;
    static int anInt5953;
    static int anInt5954;
    static int anInt5955;
    static int anInt5956;
    static int anInt5957;
    static int anInt5958;
    static int anInt5959;

    static final void method1767(boolean bool, int i) {
        anInt5953++;
        MatrixSub3.method947((byte) 41);
        int i_0_ = (Component209.aClass217_3453.method1588(-51, i).anInt2125);
        if (i_0_ != 0) {
            if (bool != true) method1769(-43);
            int i_1_ = (DisplayModeManagerContainer58.aClass170_10209.anIntArray5063[i]);
            if (i_0_ == 5) Component203.anInt8770 = i_1_;
            if (i_0_ == 6) DefinitionSub31.anInt9408 = i_1_;
        }
    }

    final int method1768(int i) {
        if (i != -32350) method1767(true, -55);
        anInt5958++;
        return this.preferenceValue;
    }

    public static void method1769(int i) {
        aClass114_5950 = null;
        if (i != 100) method1769(-25);
        aClass114_5949 = null;
    }

    final int getDefaultValue(int i) {
        anInt5956++;
        if (i != 20014) return -48;
        return 0;
    }

    final void validateValue(boolean bool) {
        if (bool != false) validateValue(false);
        anInt5954++;
        if (this.preferenceValue != 1 && this.preferenceValue != 0) this.preferenceValue = getDefaultValue(20014);
    }

    LibraryCreditsText(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final void setValue(int i, int i_2_) {
        anInt5952++;
        this.preferenceValue = i_2_;
        int i_3_ = 98 / ((82 - i) / 35);
    }

    static final int method1770(byte i) {
        anInt5957++;
        if (WaterShaderSub8.anInt7365 == 0) {
            Component119.aClass267_3401.method2025(new DisplayModeManagerContainer74("jaclib"), false);
            if (Component119.aClass267_3401.method2027(119).method31(28) != 100) return 1;
            if (!((DisplayModeManagerContainer74) Component119.aClass267_3401.method2027(71)).method2313(124)) NpcComposition.aClient1367.tryLoadJaclib(i + 24);
            WaterShaderSub8.anInt7365 = 1;
        }
        if (WaterShaderSub8.anInt7365 == 1) {
            Component380.aClass267Array4987 = Component119.method2029(110);
            Component119.aClass267_3396.method2025(new Component102(WaterShaderSub8.aClass45_7362), false);
            Component119.aClass267_3402.method2025(new DisplayModeManagerContainer74("jaggl"), false);
            Component119.aClass267_3403.method2025(new DisplayModeManagerContainer74("jagdx"), false);
            Component119.aClass267_3404.method2025(new DisplayModeManagerContainer74("jagmisc"), false);
            Component119.aClass267_3405.method2025(new DisplayModeManagerContainer74("sw3d"), false);
            Component119.aClass267_3406.method2025(new DisplayModeManagerContainer74("hw3d"), false);
            Component119.aClass267_3407.method2025(new DisplayModeManagerContainer74("jagtheora"), false);
            Component119.aClass267_3408.method2025(new Component102(Component257.aClass45_4796), false);
            Component119.aClass267_3409.method2025(new Component102(NodeSub11.aClass45_4770), false);
            Component119.aClass267_3410.method2025(new Component102(Component181.aClass45_1541), false);
            Component119.aClass267_3411.method2025(new Component102(Component97.aClass45_1538), false);
            Component119.aClass267_3412.method2025(new Component102(VideoAdDisplay.aClass45_3183), false);
            Component119.aClass267_3413.method2025(new Component102(Component43.aClass45_4975), false);
            Component119.aClass267_3414.method2025(new Component102(RadixParser.aClass45_2306), false);
            Component119.aClass267_3415.method2025(new Component102(CacheNodeSub2.aClass45_10480), false);
            Component119.aClass267_3416.method2025(new Component102(SeekableFile.aClass45_1322), false);
            Component119.aClass267_3417.method2025(new Component102(BrowserUrlOpener.aClass45_8926), false);
            Component119.aClass267_3418.method2025(new Component102(Component387.aClass45_1897), false);
            Component119.aClass267_3419.method2025(new Component102(CommandHandler.aClass45_1434), false);
            Component119.aClass267_3420.method2025(new Component102(Component339.aClass45_3146), false);
            Component119.aClass267_3421.method2025(new Component102(NodeList.aClass45_3323), false);
            Component119.aClass267_3422.method2025(new DisplayModeManagerContainer306((Component110.aClass45_233), "huffman"), false);
            Component119.aClass267_3423.method2025(new Component102(NodeSub35.aClass45_6980), false);
            Component119.aClass267_3424.method2025(new Component102(Component22.aClass45_1743), false);
            Component119.aClass267_3425.method2025(new Component102(Component65.aClass45_1627), false);
            Component119.aClass267_3426.method2025(new Component257((NodeSub32.aClass45_6950), "details"), false);
            for (int i_4_ = 0; i_4_ < Component380.aClass267Array4987.length; i_4_++) {
                if (Component380.aClass267Array4987[i_4_].method2027(78) == null) throw new RuntimeException();
            }
            int i_5_ = 0;
            Component119[] class267s = Component380.aClass267Array4987;
            for (int i_6_ = 0; i_6_ < class267s.length; i_6_++) {
                Component119 class267 = class267s[i_6_];
                int i_7_ = class267.method2024(-1);
                int i_8_ = class267.method2027(80).method31(87);
                i_5_ += i_8_ * i_7_ / 100;
            }
            DefinitionSub24.anInt9327 = i_5_;
            WaterShaderSub8.anInt7365 = 2;
        }
        if (Component380.aClass267Array4987 == null) return 100;
        int i_9_ = 0;
        int i_10_ = 0;
        boolean bool = true;
        if (i != -25) anInt5951 = -33;
        Component119[] class267s = Component380.aClass267Array4987;
        for (int i_11_ = 0; class267s.length > i_11_; i_11_++) {
            Component119 class267 = class267s[i_11_];
            int i_12_ = class267.method2024(-1);
            int i_13_ = class267.method2027(70).method31(i ^ 0x75);
            i_9_ += i_12_;
            i_10_ += i_13_ * i_12_ / 100;
            if (i_13_ < 100) bool = false;
        }
        if (bool) {
            if (!((DisplayModeManagerContainer74) Component119.aClass267_3404.method2027(92)).method2313(102)) NpcComposition.aClient1367.tryLoadJagmisc(true);
            if (!((DisplayModeManagerContainer74) Component119.aClass267_3407.method2027(i ^ ~0x64)).method2313(103)) PauseTimer.aBoolean510 = NpcComposition.aClient1367.tryLoadJagtheora(i ^ ~0x12);
            Component380.aClass267Array4987 = null;
        }
        i_9_ -= DefinitionSub24.anInt9327;
        i_10_ -= DefinitionSub24.anInt9327;
        int i_14_ = i_9_ <= 0 ? 100 : 100 * i_10_ / i_9_;
        if (!bool && i_14_ > 99) i_14_ = 99;
        return i_14_;
    }

    LibraryCreditsText(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    final int getValue(int i, int i_15_) {
        if (i != 3) return 94;
        anInt5955++;
        return 1;
    }

    static {
        aClass114_5950 = new Component183(64, 2);
        anInt5959 = 0;
    }
}
