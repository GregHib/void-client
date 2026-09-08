/* Component327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Component327
/**
 * RENAMED from `Class318_Sub1_Sub3` (JODE-obfuscated).
 * Evidence: subclass of RenderableObject (hierarchy)
 */ extends RenderableObject {
    static int anInt8739;
    static int anInt8740;
    boolean aBoolean8741;
    static int anInt8742;
    short aShort8743;
    static NodeList aClass262_8744 = new NodeList();
    byte aByte8745;
    static int anInt8746;
    short aShort8747;
    static int anInt8748;
    static int anInt8749;
    short aShort8750;
    short aShort8751;
    static int anInt8752;
    static int anInt8753;
    static int anInt8754;
    static CacheStore aClass45_8755;
    static Component183 aClass114_8756 = new Component183(107, 6);

    final boolean method2378(int i) {
        anInt8740++;
        if (i != 0) this.aShort8747 = (short) -75;
        for (int i_0_ = this.aShort8743; i_0_ <= this.aShort8751; i_0_++) {
            for (int i_1_ = this.aShort8750; (i_1_ <= this.aShort8747); i_1_++) {
                int i_2_ = (-Component256.anInt6111 + i_0_ + Component197.anInt10084);
                if (i_2_ >= 0 && (DisplayModeManagerContainer153.aBooleanArrayArray1572.length > i_2_)) {
                    int i_3_ = (Component197.anInt10084 + (i_1_ - DebugPanicSub2.anInt8502));
                    if (i_3_ >= 0 && (DisplayModeManagerContainer153.aBooleanArrayArray1572.length > i_3_) && DisplayModeManagerContainer153.aBooleanArrayArray1572[i_2_][i_3_]) return true;
                }
            }
        }
        return false;
    }

    final boolean method2382(byte i) {
        anInt8748++;
        if (i > -51) return true;
        return RenderableSub2.method2499(this.aByte6376, this.aShort8747, this.aShort8750, this.method2394(true), this.aShort8743, (byte) 116, (this.aShort8751));
    }

    static final int method2408(byte i) {
        anInt8754++;
        int i_4_ = -71 % ((-2 - i) / 44);
        return DefinitionSub31.anInt9411++;
    }

    void method2409(byte i) {
        if (i <= -109) anInt8746++;
    }

    static final boolean method2410(byte i, int i_5_, int i_6_) {
        anInt8752++;
        if (i >= -21) return true;
        if (!Component364.aBoolean8335) return false;
        int i_7_ = i_6_ >> 16;
        int i_8_ = i_6_ & 0xffff;
        if (DefinitionSub33.openInterfaces[i_7_] == null || DefinitionSub33.openInterfaces[i_7_][i_8_] == null) return false;
        DisplayModeManagerContainer57 class46 = DefinitionSub33.openInterfaces[i_7_][i_8_];
        if (i_5_ == -1 && class46.type == 0) {
            for (MenuEntry class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.first(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 56)) {
                if (class348_sub42_sub12.opcode == 6 || class348_sub42_sub12.opcode == 1011 || (class348_sub42_sub12.opcode == 13) || (class348_sub42_sub12.opcode == 18) || (class348_sub42_sub12.opcode == 16)) {
                    for (DisplayModeManagerContainer57 class46_9_ = BitmapFont.getComponent(1512932720, (class348_sub42_sub12.param1)); class46_9_ != null; class46_9_ = DisplayModeManagerContainer87.method1687(class46_9_, 3)) {
                        if (class46_9_.packedId == class46.packedId) return true;
                    }
                }
            }
        } else {
            for (MenuEntry class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.first(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 93)) {
                if ((class348_sub42_sub12.param0 == i_5_) && (class348_sub42_sub12.param1 == class46.packedId) && ((class348_sub42_sub12.opcode) == 6 || (class348_sub42_sub12.opcode) == 1011 || (class348_sub42_sub12.opcode) == 13 || (class348_sub42_sub12.opcode) == 18 || (class348_sub42_sub12.opcode) == 16))
                    return true;
            }
        }
        return false;
    }

    Component327(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, boolean bool, byte i_18_) {
        this.anInt6382 = i_12_;
        this.aBoolean8741 = bool;
        this.aShort8747 = (short) i_17_;
        this.x = i_11_;
        this.aByte8745 = i_18_;
        this.aShort8751 = (short) i_15_;
        this.y = i_13_;
        this.plane = (byte) i;
        this.aShort8750 = (short) i_16_;
        this.aShort8743 = (short) i_14_;
        this.aByte6376 = (byte) i_10_;
    }

    static final int method2411(Component22 class113, int i) {
        anInt8742++;
        if (class113 == NodeBaseSub1.aClass113_9773) return 9216;
        if (class113 == Component82.aClass113_430) return 34065;
        if (DisplayModeManagerContainer1.aClass113_3314 == class113) return 34066;
        if (i != 25602) method2413(-121, null);
        throw new IllegalArgumentException();
    }

    public static void method2412(boolean bool) {
        aClass45_8755 = null;
        aClass114_8756 = null;
        aClass262_8744 = null;
        if (bool != true) method2408((byte) -121);
    }

    final int method2384(NodeSub1[] class348_sub1s, int i) {
        anInt8753++;
        int i_19_ = 0;
        while_104_:
        for (int i_20_ = this.aShort8743; (i_20_ <= this.aShort8751); i_20_++) {
            for (int i_21_ = this.aShort8750; this.aShort8747 >= i_21_; i_21_++) {
                long l = (PacketReader.aLongArrayArrayArray10431[this.plane][i_20_][i_21_]);
                long l_22_ = 0L;
                while_103_:
                while (l_22_ <= 48L) {
                    int i_23_ = (int) (l >>> (int) l_22_ & 0xffffL);
                    if (i_23_ <= 0) break;
                    DisplayModeManagerContainer159 class211 = Component329.aClass211Array5993[-1 + i_23_];
                    for (int i_24_ = 0; i_19_ > i_24_; i_24_++) {
                        if (class211.aClass348_Sub1_2745 == class348_sub1s[i_24_]) {
                            l_22_ += 16L;
                            continue while_103_;
                        }
                    }
                    class348_sub1s[i_19_++] = class211.aClass348_Sub1_2745;
                    if (i_19_ == 4) break while_104_;
                    l_22_ += 16L;
                }
            }
        }
        int i_25_ = 17 % ((i - -14) / 61);
        for (int i_26_ = i_19_; i_26_ < 4; i_26_++)
            class348_sub1s[i_26_] = null;
        if (this.aByte8745 != 0) {
            int i_27_ = (this.aShort8743 + -Component256.anInt6111);
            int i_28_ = (-DebugPanicSub2.anInt8502 + this.aShort8750);
            int i_29_;
            short i_30_;
            int i_31_;
            short i_32_;
            if (this.aByte8745 == 1) {
                if (i_27_ >= i_28_) {
                    i_32_ = this.aShort8743;
                    i_30_ = this.aShort8750;
                    i_31_ = this.aShort8750 - -1;
                    i_29_ = this.aShort8743 - 1;
                } else {
                    i_30_ = this.aShort8750;
                    i_31_ = this.aShort8750 + -1;
                    i_32_ = this.aShort8743;
                    i_29_ = 1 + this.aShort8743;
                }
            } else if (-i_27_ < i_28_) {
                i_29_ = this.aShort8743 + -1;
                i_30_ = this.aShort8750;
                i_31_ = -1 + this.aShort8750;
                i_32_ = this.aShort8743;
            } else {
                i_31_ = this.aShort8750 + 1;
                i_32_ = this.aShort8743;
                i_30_ = this.aShort8750;
                i_29_ = 1 + this.aShort8743;
            }
            int i_33_ = 0;
            while_106_:
            for (/**/; i_19_ > i_33_; i_33_++) {
                long l = (PacketReader.aLongArrayArrayArray10431[this.plane][i_32_][i_31_]);
                while (l != 0L) {
                    DisplayModeManagerContainer159 class211 = (Component329.aClass211Array5993[(int) (-1L + (l & 0xffffL))]);
                    l >>>= 16;
                    if (class211.aClass348_Sub1_2745 == class348_sub1s[i_33_]) continue while_106_;
                }
                l = (PacketReader.aLongArrayArrayArray10431[this.plane][i_29_][i_30_]);
                while (l != 0) {
                    DisplayModeManagerContainer159 class211 = (Component329.aClass211Array5993[(int) (-1L + (0xffffL & l))]);
                    l >>>= 16;
                    if (class348_sub1s[i_33_] == class211.aClass348_Sub1_2745) continue while_106_;
                }
                for (int i_34_ = i_33_; i_34_ < i_19_ - 1; i_34_++)
                    class348_sub1s[i_34_] = class348_sub1s[i_34_ - -1];
                i_19_--;
            }
        }
        return i_19_;
    }

    static final int method2413(int i, DisplayModeManagerContainer207 class348_sub49_sub2) {
        anInt8749++;
        int i_35_ = class348_sub49_sub2.readBits((byte) -24, 2);
        if (i != 1) aClass262_8744 = null;
        int i_36_;
        if (i_35_ != 0) {
            if (i_35_ == 1) i_36_ = class348_sub49_sub2.readBits((byte) -24, 5);
            else if (i_35_ != 2) i_36_ = class348_sub49_sub2.readBits((byte) -24, 11);
            else i_36_ = class348_sub49_sub2.readBits((byte) -24, 8);
        } else i_36_ = 0;
        return i_36_;
    }
}
