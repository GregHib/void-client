/* Player - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.util.Arrays;
import java.util.Hashtable;

/**
 * RENAMED from `Class318_Sub1_Sub3_Sub3_Sub2` (JODE-obfuscated).
 * Evidence: JODE header recorded original obfuscated name
 */
final class Player extends DisplayModeManagerContainer58 {
    /** Combat level from the appearance / player-info packet (unsigned byte). */
    int combatLevel;
    boolean aBoolean10517 = false;
    static int anInt10518;
    int anInt10519;
    private int anInt10520;
    boolean aBoolean10521;
    int anInt10522;
    static int anInt10523;
    int anInt10524;
    static int anInt10525;
    int anInt10526;
    static int anInt10527;
    static int anInt10528;
    static int anInt10529;
    static int anInt10530;
    int anInt10531;
    static int anInt10532;
    static int anInt10533;
    static int anInt10534;
    int anInt10535;
    Component101 appearance;
    String displayName;
    private byte aByte10538;
    boolean aBoolean10539;
    int anInt10540;
    static int anInt10541;
    int anInt10542;
    static int anInt10543;
    String username;

    boolean isFemaleVoice() {
        return aByte10538 == 1;
    }
    static int anInt10545;
    static int anInt10546;
    static int anInt10547;
    static int anInt10548;
    int anInt10549;
    static int anInt10550;
    boolean aBoolean10551;
    private byte aByte10552;
    int anInt10553;
    boolean aBoolean10554;
    static int anInt10555;
    private byte aByte10556;
    int anInt10557;
    int anInt10558;
    static int anInt10559;
    int anInt10560;
    int anInt10561;
    static int anInt10562;
    static int anInt10563;
    int anInt10564;
    static Hashtable aHashtable10565 = new Hashtable();
    static int[] anIntArray10566;
    static int anInt10567 = -1;

    final void method2387(GraphicsToolkit var_ha, int i) {
        anInt10533++;
        if (this.appearance != null && (this.aBoolean10318 || method2459(0, var_ha, -123))) {
            DisplayModeManagerContainer204 class101 = var_ha.method3705();
            if (i >= -125) method2457((byte) -106);
            class101.method895(this.aClass264_10217.method2019((byte) -116));
            class101.method891(this.x, -5 + this.anInt6382, this.y);
            this.method2432(var_ha, -15074, class101, this.aBoolean10318, (this.aClass64Array10323));
            this.aClass64Array10323[0] = this.aClass64Array10323[1] = this.aClass64Array10323[2] = null;
        }
    }

    final void setMovementState(int i, int i_0_, byte i_1_) {
        anInt10541++;
        this.anInt10322 = 0;
        this.anIntArray10320[0] = i_0_;
        this.anInt10319 = 0;
        this.anInt10326 = 0;
        this.anIntArray10317[0] = i;
        if (i_1_ <= 55) anInt10567 = -3;
        int i_2_ = getSize((byte) 103);
        this.y = (256 * i_2_ + 512 * this.anIntArray10317[0]);
        this.x = (this.anIntArray10320[0] * 512 + i_2_ * 256);
        if (Component72.localPlayer == this) DisplayModeManagerContainer154.method773(true);
        if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327.method2529();
    }

    final String getName(boolean bool, int i) {
        if (i > -67) this.aBoolean10554 = false;
        anInt10555++;
        if (bool) return this.displayName;
        return this.username;
    }

    final void advanceMovement(byte i, int i_3_, int i_4_, int i_5_) {
        if (i_4_ != -29034) this.anInt10557 = -47;
        anInt10528++;
        if (this.anInt10319 < 9) this.anInt10319++;
        for (int i_6_ = this.anInt10319; i_6_ > 0; i_6_--) {
            this.anIntArray10320[i_6_] = this.anIntArray10320[-1 + i_6_];
            this.anIntArray10317[i_6_] = this.anIntArray10317[i_6_ + -1];
            this.aByteArray10321[i_6_] = this.aByteArray10321[-1 + i_6_];
        }
        this.anIntArray10320[0] = i_3_;
        this.aByteArray10321[0] = i;
        this.anIntArray10317[0] = i_5_;
    }

    final boolean method2391(GraphicsToolkit var_ha, int i, int i_7_, int i_8_) {
        anInt10562++;
        if (this.appearance == null || !method2459(131072, var_ha, 113)) return false;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        int i_9_ = this.aClass264_10217.method2019((byte) -31);
        class101.method895(i_9_);
        class101.method891(this.x, this.anInt6382, this.y);
        boolean bool = false;
        for (int i_10_ = 0; (this.aClass64Array10323.length > i_10_); i_10_++) {
            if ((this.aClass64Array10323[i_10_] != null) && (DisplayModeManagerContainer50.aBoolean3870 ? (this.aClass64Array10323[i_10_].isInFrustumExt(i_7_, i, class101, true, 0, Component72.anInt1906)) : this.aClass64Array10323[i_10_].isInFrustumExtended(i_7_, i, class101, true, 0))) {
                bool = true;
                break;
            }
        }
        this.aClass64Array10323[i_8_] = this.aClass64Array10323[1] = this.aClass64Array10323[2] = null;
        return bool;
    }

    final void readUpdateMask(byte i, Buffer class348_sub49) {
        anInt10547++;
        class348_sub49.offset = 0;
        int i_11_ = class348_sub49.readUnsignedByte(255);
        aByte10538 = (byte) (i_11_ & 0x1);
        boolean bool = this.aBoolean10517;
        this.aBoolean10517 = (0x2 & i_11_) != 0;
        boolean bool_12_ = (i_11_ & 0x4) != 0;
        int i_13_ = super.getSize((byte) 68);
        this.method2434((byte) 51, 1 + ((0x3f & i_11_) >> 3));
        aByte10552 = (byte) (i_11_ >> 6 & 0x3);
        this.x += -i_13_ + getSize((byte) 47) << 8;
        this.y += getSize((byte) 96) + -i_13_ << 8;
        aByte10556 = class348_sub49.readByte(-114);
        this.anInt10540 = class348_sub49.readByte(-89);
        this.anInt10522 = class348_sub49.readByte(i ^ ~0x1);
        this.aBoolean10551 = class348_sub49.readByte(i + -199) == 1;
        if (DisplayModeManagerContainer345.aClass364_165 == Component326.LIVE && Component353.anInt2581 >= 2) this.aBoolean10551 = false;
        this.anInt10542 = 0;
        int i_14_ = -1;
        int[] is = new int[12];
        for (int i_15_ = 0; i_15_ < 12; i_15_++) {
            int i_16_ = class348_sub49.readUnsignedByte(255);
            if (i_16_ == 0) is[i_15_] = 0;
            else {
                int i_17_ = class348_sub49.readUnsignedByte(255);
                int i_18_ = i_17_ + (i_16_ << 8);
                if (i_15_ == 0 && i_18_ == 65535) {
                    i_14_ = class348_sub49.readUnsignedShort(842397944);
                    this.anInt10542 = class348_sub49.readUnsignedByte(255);
                    break;
                }
                if (i_18_ >= 32768) {
                    i_18_ = Component361.anIntArray369[-32768 + i_18_];
                    is[i_15_] = Component224.bitwiseOr(1073741824, i_18_);
                    int i_19_ = (Exception_Sub1.itemDefinitions.getItemDefinition(-111, i_18_).anInt2827);
                    if (i_19_ != 0) this.anInt10542 = i_19_;
                } else is[i_15_] = Component224.bitwiseOr(-256 + i_18_, -2147483648);
            }
        }
        int[] is_20_ = new int[5];
        for (int i_21_ = 0; i_21_ < 5; i_21_++) {
            int i_22_ = class348_sub49.readUnsignedByte(255);
            if (AbstractShaderSub2.aShortArrayArrayArray7290.length < 1 || i_22_ < 0 || i_22_ >= AbstractShaderSub2.aShortArrayArrayArray7290[0][i_21_].length) i_22_ = 0;
            is_20_[i_21_] = i_22_;
        }
        anInt10520 = class348_sub49.readUnsignedShort(842397944);
        this.displayName = class348_sub49.readString((byte) -47);
        this.username = this.displayName;
        if (this == Component72.localPlayer) BufferCacheSub2.aString8265 = this.displayName;
        this.combatLevel = class348_sub49.readUnsignedByte(i ^ 0xab);
        if (i != 84) anInt10520 = 87;
        if (bool_12_) {
            this.anInt10564 = class348_sub49.readUnsignedShort(842397944);
            this.anInt10557 = this.combatLevel;
            if (this.anInt10564 == 65535) this.anInt10564 = -1;
            this.anInt10561 = -1;
        } else {
            this.anInt10564 = 0;
            this.anInt10557 = class348_sub49.readUnsignedByte(255);
            this.anInt10561 = class348_sub49.readUnsignedByte(255);
            if (this.anInt10561 == 255) this.anInt10561 = -1;
        }
        int i_23_ = this.anInt10553;
        this.anInt10553 = class348_sub49.readUnsignedByte(255);
        if (this.anInt10553 == 0) DisplayModeManagerContainer61.method2221(this, -28482);
        else {
            int i_24_ = this.anInt10535;
            int i_25_ = this.anInt10526;
            int i_26_ = this.anInt10560;
            int i_27_ = this.anInt10519;
            int i_28_ = this.anInt10558;
            this.anInt10535 = class348_sub49.readUnsignedShort(842397944);
            this.anInt10526 = class348_sub49.readUnsignedShort(842397944);
            this.anInt10560 = class348_sub49.readUnsignedShort(842397944);
            this.anInt10519 = class348_sub49.readUnsignedShort(842397944);
            this.anInt10558 = class348_sub49.readUnsignedByte(i ^ 0xab);
            if (!this.aBoolean10517 != !bool || this.anInt10553 != i_23_ || i_24_ != this.anInt10535 || i_25_ != this.anInt10526 || (this.anInt10560 != i_26_) || this.anInt10519 != i_27_ || i_28_ != this.anInt10558) DisplayModeManagerContainer23.method858(true, this);
        }
        if (this.appearance == null) this.appearance = new Component101();
        int i_29_ = (this.appearance.anInt2093);
        int[] is_30_ = (this.appearance.anIntArray2095);
        this.appearance.method1228(i_14_, 105, method2421((byte) 121), is, aByte10538 == 1, is_20_);
        if (i_14_ != i_29_) {
            this.x = (this.anIntArray10320[0] << 9) - -(getSize((byte) 89) << 8);
            this.y = (this.anIntArray10317[0] << 9) - -(getSize((byte) 98) << 8);
        }
        if ((StringDefinition.anInt9591 == this.anInt10290) && is_30_ != null) {
            for (int i_31_ = 0; i_31_ < is_20_.length; i_31_++) {
                if (is_20_[i_31_] != is_30_[i_31_]) {
                    Exception_Sub1.itemDefinitions.method1936(72);
                    break;
                }
            }
        }
        if (this.aClass318_Sub10_10327 != null) this.aClass318_Sub10_10327.method2529();
        if (this.anInt10268 != -1 && this.aBoolean10213) {
            Component241 class225 = this.getDefinition((byte) 72);
            if (!class225.method1623((this.anInt10268), -40)) {
                this.aBoolean10213 = false;
                this.anInt10268 = -1;
            }
        }
    }

    private final void processUpdate1(int i, GraphicsToolkit var_ha, int i_32_, DisplayModeManagerContainer370 class64, int i_33_, int i_34_, DisplayModeManagerContainer204 class101, int i_35_) {
        do {
            try {
                anInt10548++;
                if (i_33_ == 0) {
                    int i_36_ = i * i + i_34_ * i_34_;
                    if (i_36_ >= 262144 && i_32_ >= i_36_) {
                        int i_37_ = 0x3fff & (int) (Math.atan2(i, i_34_) * 2607.5945876176133);
                        DisplayModeManagerContainer370 class64_38_ = (Canvas_Sub1.getCachedModel(this.anInt10252, this.anInt10302, this.anInt10208, i_37_, i_35_, (byte) -35, var_ha));
                        if (class64_38_ == null) break;
                        var_ha.C(false);
                        class64_38_.render(class101, null, 0);
                        var_ha.C(true);
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("ke.OB(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_32_ + ',' + (class64 != null ? "{...}" : "null") + ',' + i_33_ + ',' + i_34_ + ',' + (class101 != null ? "{...}" : "null") + ',' + i_35_ + ')'));
            }
            break;
        } while (false);
    }

    private final void processUpdate2(int i, int i_39_, int i_40_, int i_41_, DisplayModeManagerContainer370 class64, int i_42_, DisplayModeManagerContainer204 class101, GraphicsToolkit var_ha, int i_43_) {
        do {
            try {
                if (i != 6253) this.username = null;
                anInt10563++;
                int i_44_ = i_43_ * i_43_ + i_39_ * i_39_;
                if (i_44_ >= 262144 && i_44_ <= i_42_) {
                    int i_45_ = ((int) (2607.5945876176133 * Math.atan2(i_39_, i_43_)) & 0x3fff);
                    DisplayModeManagerContainer370 class64_46_ = (Canvas_Sub1.getCachedModel(this.anInt10252, this.anInt10302, this.anInt10208, i_45_, i_41_, (byte) -35, var_ha));
                    if (class64_46_ == null) break;
                    var_ha.C(false);
                    class64_46_.method608(class101, null, i_40_, 0);
                    var_ha.C(true);
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("ke.V(" + i + ',' + i_39_ + ',' + i_40_ + ',' + i_41_ + ',' + (class64 != null ? "{...}" : "null") + ',' + i_42_ + ',' + (class101 != null ? "{...}" : "null") + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_43_ + ')'));
            }
            break;
        } while (false);
    }

    final ComponentDownloader method2381(GraphicsToolkit var_ha, int i) {
        if (i != 7) this.username = null;
        anInt10518++;
        return null;
    }

    final void method2392(boolean bool) {
        if (bool != true) this.username = null;
        anInt10534++;
        throw new IllegalStateException();
    }

    final void method2380(GraphicsToolkit var_ha, int i, boolean bool, RenderableObject class318_sub1, int i_47_, byte i_48_, int i_49_) {
        try {
            if (i_48_ >= -106) anInt10520 = 116;
            anInt10545++;
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ke.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_47_ + ',' + i_48_ + ',' + i_49_ + ')'));
        }
    }

    final void method2455(int i, int i_50_, byte i_51_, int i_52_) {
        anInt10529++;
        if (i_50_ != -26443) advanceMovement((byte) -35, 9, 26, 87);
        if (this.anInt10286 != -1 && RunescapeInfo.aClass87_191.getSequence(this.anInt10286, 7).anInt245 == 1) {
            this.anInt10286 = -1;
            this.anIntArray10236 = null;
        }
        if (this.anInt10269 != -1) {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 59, this.anInt10269));
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && RunescapeInfo.aClass87_191.getSequence((class368.anInt4503), i_50_ ^ ~0x674d).anInt245 == 1) this.anInt10269 = -1;
        }
        if (this.anInt10291 != -1) {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 124, this.anInt10291));
            if (class368.aBoolean4487 && class368.anInt4503 != -1 && (RunescapeInfo.aClass87_191.getSequence(class368.anInt4503, 7).anInt245) == 1) this.anInt10291 = -1;
        }
        this.anInt10524 = -1;
        if (i_52_ >= 0 && AbstractShaderSub4.anInt7319 > i_52_ && i >= 0 && ParametricDefinition.anInt9109 > i) {
            if (this.anIntArray10320[0] >= 0 && (this.anIntArray10320[0] < AbstractShaderSub4.anInt7319) && this.anIntArray10317[0] >= 0 && (ParametricDefinition.anInt9109 > this.anIntArray10317[0])) {
                if (i_51_ == 2) SceneManager.method1592((byte) 2, i, 4, i_52_, this);
                advanceMovement(i_51_, i_52_, -29034, i);
            } else setMovementState(i, i_52_, (byte) 111);
        } else setMovementState(i, i_52_, (byte) 112);
    }

    final RenderableSub4 method2386(int i, GraphicsToolkit var_ha) {
        anInt10527++;
        if (this.appearance == null || !method2459(2048, var_ha, -95)) return null;
        DisplayModeManagerContainer204 class101 = var_ha.method3705();
        int i_53_ = this.aClass264_10217.method2019((byte) -126);
        class101.method895(i_53_);
        Component186 class357 = (Component335.aClass357ArrayArrayArray2029[this.plane][this.x >> Component149.anInt4459][this.y >> Component149.anInt4459]);
        if (class357 == null || class357.aClass318_Sub1_Sub1_4402 == null) this.anInt10274 -= (float) this.anInt10274 / 10.0F;
        else {
            int i_54_ = (this.anInt10274 + -(class357.aClass318_Sub1_Sub1_4402.aShort8727));
            this.anInt10274 -= (float) i_54_ / 10.0F;
        }
        class101.method891(this.x, (-20 + (this.anInt6382 - this.anInt10274)), this.y);
        RenderableSub4 class318_sub4 = null;
        this.aBoolean10324 = false;
        if (Component192.preferences.aClass239_Sub21_7270.method1812(-32350) == 1) {
            Component241 class225 = this.getDefinition((byte) 72);
            if (class225.aBoolean2913 && (this.appearance.anInt2093 == -1 || Component291.aClass278_2529.method2079(this.appearance.anInt2093, i + -2).aBoolean1369)) {
                DisplayModeManagerContainer167 class17 = ((this.anInt10286 != -1 && this.anInt10218 == 0) ? (RunescapeInfo.aClass87_191.getSequence(this.anInt10286, 7)) : null);
                DisplayModeManagerContainer167 class17_55_ = ((this.anInt10268 == -1 || this.aBoolean10521 || (this.aBoolean10213 && class17 != null)) ? null : (RunescapeInfo.aClass87_191.getSequence(this.anInt10268, 7)));
                DisplayModeManagerContainer370 class64 = (Node.method2711(this.anInt10302, i_53_, this.aClass64Array10323[0], this.anInt10208, false, (class17_55_ == null ? this.anInt10267 : this.anInt10245), 0, 1, this.anInt10252, var_ha, 160, 0, 240, class17_55_ == null ? class17 : class17_55_));
                if (class64 != null) {
                    class318_sub4 = (OutputStream_Sub2.method136(1 + (this.aClass64Array10323).length, true, false));
                    this.aBoolean10324 = true;
                    var_ha.C(false);
                    if (DisplayModeManagerContainer50.aBoolean3870) class64.method608(class101, (class318_sub4.aClass318_Sub3Array6414[(this.aClass64Array10323).length]), Component72.anInt1906, 0);
                    else class64.render(class101, (class318_sub4.aClass318_Sub3Array6414[(this.aClass64Array10323).length]), 0);
                    var_ha.C(true);
                }
            }
        }
        if (this == Component72.localPlayer) {
            class101.method894(this.x, this.anInt6382, this.y);
            for (int i_56_ = -1 + NodeSub27.aClass302Array6897.length; i_56_ >= 0; i_56_--) {
                Component114 class302 = NodeSub27.aClass302Array6897[i_56_];
                if (class302 != null && class302.anInt3834 != -1) {
                    if (class302.anInt3840 == 1) {
                        NpcNode class348_sub22 = ((NpcNode) (Component21.aClass356_3654.get(class302.anInt3833, -6008)));
                        if (class348_sub22 != null) {
                            Npc npc = (class348_sub22.npc);
                            int i_57_ = (-(Component72.localPlayer.x) + npc.x);
                            int i_58_ = (-(Component72.localPlayer.y) + npc.y);
                            if (DisplayModeManagerContainer50.aBoolean3870) processUpdate2(6253, i_57_, Component72.anInt1906, class302.anInt3834, (this.aClass64Array10323[0]), 92160000, class101, var_ha, i_58_);
                            else processUpdate1(i_57_, var_ha, 92160000, (this.aClass64Array10323[0]), 0, i_58_, class101, class302.anInt3834);
                        }
                    }
                    if (class302.anInt3840 == 2) {
                        int i_59_ = (-(Component72.localPlayer.x) + 256 + class302.anInt3835);
                        int i_60_ = (-(Component72.localPlayer.y) + 256 + class302.anInt3832);
                        int i_61_ = class302.anInt3837 << 9;
                        i_61_ *= i_61_;
                        if (DisplayModeManagerContainer50.aBoolean3870) processUpdate2(6253, i_59_, Component72.anInt1906, class302.anInt3834, (this.aClass64Array10323[0]), i_61_, class101, var_ha, i_60_);
                        else processUpdate1(i_59_, var_ha, i_61_, (this.aClass64Array10323[0]), 0, i_60_, class101, class302.anInt3834);
                    }
                    if (class302.anInt3840 == 10 && class302.anInt3833 >= 0 && (class302.anInt3833 < (InterfaceRenderer.players).length)) {
                        Player player_62_ = (InterfaceRenderer.players[class302.anInt3833]);
                        if (player_62_ != null) {
                            int i_63_ = (-(Component72.localPlayer.x) + (player_62_.x));
                            int i_64_ = (-(Component72.localPlayer.y) + (player_62_.y));
                            if (DisplayModeManagerContainer50.aBoolean3870) processUpdate2(6253, i_63_, Component72.anInt1906, class302.anInt3834, (this.aClass64Array10323[0]), 92160000, class101, var_ha, i_64_);
                            else processUpdate1(i_63_, var_ha, 92160000, (this.aClass64Array10323[0]), i ^ 0x1, i_64_, class101, class302.anInt3834);
                        }
                    }
                }
            }
            class101.method895(i_53_);
            class101.method891(this.x, this.anInt6382, this.y);
        }
        class101.method895(i_53_);
        class101.method891(this.x, (this.anInt6382 + (-5 + -(this.anInt10274))), this.y);
        if (class318_sub4 == null) class318_sub4 = OutputStream_Sub2.method136((this.aClass64Array10323).length, true, false);
        this.method2432(var_ha, -15074, class101, false, this.aClass64Array10323);
        if (DisplayModeManagerContainer50.aBoolean3870) {
            for (int i_65_ = 0; i_65_ < (this.aClass64Array10323).length; i_65_++) {
                if (this.aClass64Array10323[i_65_] != null) this.aClass64Array10323[i_65_].method608(class101, (class318_sub4.aClass318_Sub3Array6414[i_65_]), Component72.anInt1906, (this != Component72.localPlayer ? 0 : 1));
            }
        } else {
            for (int i_66_ = 0; i_66_ < (this.aClass64Array10323).length; i_66_++) {
                if (this.aClass64Array10323[i_66_] != null) this.aClass64Array10323[i_66_].render(class101, (class318_sub4.aClass318_Sub3Array6414[i_66_]), (this == Component72.localPlayer ? 1 : 0));
            }
        }
        if (this.aClass318_Sub10_10327 != null) {
            Component122 class98 = this.aClass318_Sub10_10327.method2525();
            if (DisplayModeManagerContainer50.aBoolean3870) var_ha.renderModelEx(class98, Component72.anInt1906);
            else var_ha.renderModel(class98);
        }
        for (int i_67_ = 0; (i_67_ < this.aClass64Array10323.length); i_67_++) {
            if (this.aClass64Array10323[i_67_] != null) this.aBoolean10324 |= this.aClass64Array10323[i_67_].F();
        }
        this.aClass64Array10323[0] = this.aClass64Array10323[i] = this.aClass64Array10323[2] = null;
        this.anInt10301 = DisplayModeManagerContainer341.anInt6006;
        return class318_sub4;
    }

    final String method2456(boolean bool, int i) {
        anInt10550++;
        String string = "";
        if (WaterShader.aStringArray7378 != null) string += WaterShader.aStringArray7378[aByte10552];
        int[] is;
        if (aByte10538 != 1 || Component66.anIntArray6021 == null) is = RuntimeException_Sub1.anIntArray4603;
        else is = Component66.anIntArray6021;
        if (i != 255) anInt10567 = 81;
        if (is != null && is[aByte10552] != -1) {
            Component208 class117 = NodeSub7.aClass33_6653.method337(true, is[aByte10552]);
            if (class117.valueType != 115) {
                ClientErrorReporter.reportError("gdn1", new Throwable(), 15004);
                is[aByte10552] = -1;
            } else string += class117.getString(0xff & aByte10556, i + -145);
        }
        if (!bool) string += this.username;
        else string += this.displayName;
        if (Component285.aStringArray974 != null) string += Component285.aStringArray974[aByte10552];
        return string;
    }

    final int method2425(int i) {
        anInt10532++;
        if (i != -1) return 82;
        return -1;
    }

    final boolean method2457(byte i) {
        anInt10530++;
        int i_68_ = 86 / ((-44 - i) / 38);
        return this.appearance != null;
    }

    final boolean method2388(int i) {
        anInt10523++;
        if (i >= -65) setMovementState(-64, -39, (byte) 37);
        return false;
    }

    /**
     * Player tile size: NPC-transform appearance size when morphing, else the
     * base entity {@link DisplayModeManagerContainer58#getSize}.
     */
    final int getSize(byte i) {
        if (i <= 39) method2455(-97, -62, (byte) 0, 103);
        anInt10546++;
        if (this.appearance != null && this.appearance.anInt2093 != -1) return (Component291.aClass278_2529.method2079(this.appearance.anInt2093, -1).anInt1399);
        return super.getSize((byte) 72);
    }

    public static void method2458(boolean bool) {
        anIntArray10566 = null;
        if (bool != true) method2458(false);
        aHashtable10565 = null;
    }

    private final boolean method2459(int i, GraphicsToolkit var_ha, int i_69_) {
        anInt10525++;
        int i_70_ = i;
        Component241 class225 = this.getDefinition((byte) 72);
        DisplayModeManagerContainer167 class17 = ((this.anInt10286 == -1 || this.anInt10218 != 0) ? null : RunescapeInfo.aClass87_191.getSequence(this.anInt10286, 7));
        DisplayModeManagerContainer167 class17_71_ = ((this.anInt10268 != -1 && !this.aBoolean10521 && (!this.aBoolean10213 || class17 == null)) ? RunescapeInfo.aClass87_191.getSequence(this.anInt10268, 7) : null);
        int i_72_ = class225.anInt2932;
        int i_73_ = class225.anInt2941;
        if (i_72_ != 0 || i_73_ != 0 || class225.anInt2950 != 0 || class225.anInt2926 != 0) i |= 0x7;
        int i_74_ = this.aClass264_10217.method2019((byte) -106);
        boolean bool = (this.aByte10279 != 0 && (this.anInt10248 <= OpenGlShader.clientCycle) && (OpenGlShader.clientCycle < this.anInt10250));
        if (bool) i |= 0x80000;
        DisplayModeManagerContainer370 class64 = (this.aClass64Array10323[0] = (this.appearance.method1226(DisplayModeManagerContainer58.aClass170_10209, class17_71_, this.aClass182Array10308, true, Exception_Sub1.itemDefinitions, i_74_, class17, this.anInt10244, true, this.anInt10312, this.anIntArray10296, i, DefinitionSub25.aClass150_9342, this.anInt10232, var_ha, Component291.aClass278_2529, RunescapeInfo.aClass87_191, this.anInt10245, this.anInt10267, this.anInt10203, DisplayModeManagerContainer282.aClass261_5558)));
        int i_75_ = Component102.method2201(2121);
        if (Component127.anInt2964 < 96 && i_75_ > 50) Component201.method2271(31268);
        int i_76_ = 3 % ((63 - i_69_) / 47);
        if (Component326.LIVE != DisplayModeManagerContainer345.aClass364_165 && i_75_ < 50) {
            int i_77_;
            for (i_77_ = -i_75_ + 50; Component162.anInt8388 < i_77_; Component162.anInt8388++)
                Component17.aByteArrayArray3882[Component162.anInt8388] = new byte[102400];
            while (Component162.anInt8388 > i_77_) {
                Component162.anInt8388--;
                Component17.aByteArrayArray3882[Component162.anInt8388] = null;
            }
        } else if (DisplayModeManagerContainer345.aClass364_165 != Component326.LIVE) {
            Component162.anInt8388 = 0;
            Component17.aByteArrayArray3882 = new byte[50][];
        }
        if (class64 == null) return false;
        this.anInt10207 = class64.fa();
        this.anInt10230 = class64.ma();
        this.method2439(-115, class64);
        if (i_72_ != 0 || i_73_ != 0) {
            this.updateRenderPosition(i_74_, i_72_, class225.anInt2943, i_73_, (byte) 108, class225.anInt2912);
            if (this.anInt10302 != 0) class64.FA(this.anInt10302);
            if (this.anInt10208 != 0) class64.VA(this.anInt10208);
            if (this.anInt10252 != 0) class64.H(0, this.anInt10252, 0);
        } else this.updateRenderPosition(i_74_, getSize((byte) 124) << 9, 0, getSize((byte) 58) << 9, (byte) 65, 0);
        if (bool) class64.animateColors(this.aByte10255, this.aByte10206, this.aByte10270, (this.aByte10279 & 0xff));
        if (!this.aBoolean10521 && this.anInt10269 != -1 && this.anInt10240 != -1) {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 76, this.anInt10269));
            boolean bool_78_ = (class368.aByte4488 == 3 && (i_72_ != 0 || i_73_ != 0));
            int i_79_ = i_70_;
            if (!bool_78_) {
                if (this.anInt10237 != 0) i_79_ |= 0x5;
                if (this.anInt10220 != 0) i_79_ |= 0x2;
                if (this.anInt10278 >= 0) i_79_ |= 0x7;
            } else i_79_ |= 0x7;
            DisplayModeManagerContainer370 class64_80_ = (this.aClass64Array10323[1] = (class368.method3562(this.anInt10240, var_ha, this.anInt10243, i_79_, this.anInt10283, RunescapeInfo.aClass87_191, (byte) 46)));
            if (class64_80_ != null) {
                if (this.anInt10278 >= 0 && class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939[this.anInt10278]) != null)) {
                    int i_81_ = 0;
                    int i_82_ = 0;
                    int i_83_ = 0;
                    if (class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939[this.anInt10278]) != null)) {
                        i_82_ += (class225.anIntArrayArray2939[this.anInt10278][1]);
                        i_83_ += (class225.anIntArrayArray2939[this.anInt10278][2]);
                        i_81_ += (class225.anIntArrayArray2939[this.anInt10278][0]);
                    }
                    if (class225.anIntArrayArray2910 != null && ((class225.anIntArrayArray2910[this.anInt10278]) != null)) {
                        i_82_ += (class225.anIntArrayArray2910[this.anInt10278][1]);
                        i_83_ += (class225.anIntArrayArray2910[this.anInt10278][2]);
                        i_81_ += (class225.anIntArrayArray2910[this.anInt10278][0]);
                    }
                    if (i_83_ != 0 || i_81_ != 0) {
                        int i_84_ = i_74_;
                        if ((this.anIntArray10296 != null) && ((this.anIntArray10296[this.anInt10278]) != -1)) i_84_ = (this.anIntArray10296[(this.anInt10278)]);
                        int i_85_ = (i_84_ + (this.anInt10237) * 2048 + -i_74_ & 0x3fff);
                        if (i_85_ != 0) class64_80_.a(i_85_);
                        int i_86_ = DisplayModeManagerContainer88.anIntArray1207[i_85_];
                        int i_87_ = DisplayModeManagerContainer88.anIntArray1204[i_85_];
                        int i_88_ = i_87_ * i_81_ + i_83_ * i_86_ >> 14;
                        i_83_ = -(i_81_ * i_86_) + i_83_ * i_87_ >> 14;
                        i_81_ = i_88_;
                    }
                    class64_80_.H(i_81_, i_82_, i_83_);
                } else if (this.anInt10237 != 0) class64_80_.a(2048 * this.anInt10237);
                if (this.anInt10220 != 0) class64_80_.H(0, (-this.anInt10220 << 2), 0);
                if (bool_78_) {
                    if (this.anInt10302 != 0) class64_80_.FA(this.anInt10302);
                    if (this.anInt10208 != 0) class64_80_.VA(this.anInt10208);
                    if (this.anInt10252 != 0) class64_80_.H(0, (this.anInt10252), 0);
                }
            }
        } else this.aClass64Array10323[1] = null;
        if (this.aBoolean10521 || this.anInt10291 == -1 || this.anInt10224 == -1) this.aClass64Array10323[2] = null;
        else {
            Component63 class368 = (NsnDefinition.aClass319_9245.method2543((byte) 76, this.anInt10291));
            boolean bool_89_ = (class368.aByte4488 == 3 && (i_72_ != 0 || i_73_ != 0));
            int i_90_ = i_70_;
            if (bool_89_) i_90_ |= 0x7;
            else {
                if (this.anInt10202 != 0) i_90_ |= 0x5;
                if (this.anInt10260 != 0) i_90_ |= 0x2;
                if (this.anInt10289 >= 0) i_90_ |= 0x7;
            }
            DisplayModeManagerContainer370 class64_91_ = (this.aClass64Array10323[2] = (class368.method3558(this.anInt10273, this.anInt10276, var_ha, i_90_, 3172, RunescapeInfo.aClass87_191, this.anInt10224)));
            if (class64_91_ != null) {
                if (this.anInt10289 < 0 || class225.anIntArrayArray2939 == null || ((class225.anIntArrayArray2939[this.anInt10289]) == null)) {
                    if (this.anInt10202 != 0) class64_91_.a(2048 * (this.anInt10202));
                } else {
                    int i_92_ = 0;
                    int i_93_ = 0;
                    int i_94_ = 0;
                    if (class225.anIntArrayArray2939 != null && ((class225.anIntArrayArray2939[this.anInt10289]) != null)) {
                        i_92_ += (class225.anIntArrayArray2939[this.anInt10289][0]);
                        i_93_ += (class225.anIntArrayArray2939[this.anInt10289][1]);
                        i_94_ += (class225.anIntArrayArray2939[this.anInt10289][2]);
                    }
                    if (class225.anIntArrayArray2910 != null && ((class225.anIntArrayArray2910[this.anInt10289]) != null)) {
                        i_92_ += (class225.anIntArrayArray2910[this.anInt10289][0]);
                        i_93_ += (class225.anIntArrayArray2910[this.anInt10289][1]);
                        i_94_ += (class225.anIntArrayArray2910[this.anInt10289][2]);
                    }
                    if (i_94_ != 0 || i_92_ != 0) {
                        int i_95_ = i_74_;
                        if ((this.anIntArray10296 != null) && ((this.anIntArray10296[this.anInt10289]) != -1)) i_95_ = (this.anIntArray10296[(this.anInt10289)]);
                        int i_96_ = (0x3fff & -i_74_ + ((this.anInt10202) * 2048 + i_95_));
                        if (i_96_ != 0) class64_91_.a(i_96_);
                        int i_97_ = DisplayModeManagerContainer88.anIntArray1207[i_96_];
                        int i_98_ = DisplayModeManagerContainer88.anIntArray1204[i_96_];
                        int i_99_ = i_94_ * i_97_ + i_98_ * i_92_ >> 14;
                        i_94_ = -(i_97_ * i_92_) + i_98_ * i_94_ >> 14;
                        i_92_ = i_99_;
                    }
                    class64_91_.H(i_92_, i_93_, i_94_);
                }
                if (this.anInt10260 != 0) class64_91_.H(0, (-this.anInt10260 << 2), 0);
                if (bool_89_) {
                    if (this.anInt10302 != 0) class64_91_.FA(this.anInt10302);
                    if (this.anInt10208 != 0) class64_91_.VA(this.anInt10208);
                    if (this.anInt10252 != 0) class64_91_.H(0, (this.anInt10252), 0);
                }
            }
        }
        return true;
    }

    final int method2421(byte i) {
        if (i < 113) this.anInt10535 = 60;
        anInt10543++;
        return anInt10520;
    }

    static final void method2460(float f, int i, float f_100_, int i_101_, int i_102_, float f_103_, DisplayModeManagerContainer51 class186, int i_104_, byte i_105_, int i_106_, float f_107_, byte[] is, int i_108_, float f_109_) {
        do {
            try {
                anInt10559++;
                int i_110_ = i_102_ * i_106_;
                float[] fs = new float[i_110_];
                for (int i_111_ = 0; i_101_ > i_111_; i_111_++) {
                    int i_112_ = i;
                    class186.method1398(i_108_, i_102_, f_100_ / (float) i_106_, f_109_ / (float) i_108_, 0, f * 127.0F, 1, f_107_ / (float) i_102_, i_106_, i_104_, fs);
                    f_107_ *= 2.0F;
                    f_100_ *= 2.0F;
                    for (int i_113_ = 0; i_110_ > i_113_; i_113_++) {
                        is[i_112_] += fs[i_113_];
                        i_112_++;
                    }
                    f_109_ *= 2.0F;
                    f *= f_103_;
                }
                int i_114_ = i;
                for (int i_115_ = 0; i_115_ < i_110_; i_115_++) {
                    is[i_114_] = (byte) (127 + is[i_114_]);
                    i_114_++;
                }
                if (i_105_ == 30) break;
                aHashtable10565 = null;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("ke.LB(" + f + ',' + i + ',' + f_100_ + ',' + i_101_ + ',' + i_102_ + ',' + f_103_ + ',' + (class186 != null ? "{...}" : "null") + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ',' + f_107_ + ',' + (is != null ? "{...}" : "null") + ',' + i_108_ + ',' + f_109_ + ')'));
            }
            break;
        } while (false);
    }

    public Player() {
        this.combatLevel = 0;
        this.anInt10535 = -1;
        this.aBoolean10521 = false;
        this.anInt10526 = -1;
        this.aBoolean10539 = false;
        this.anInt10519 = -1;
        this.anInt10522 = -1;
        this.aBoolean10554 = false;
        this.anInt10557 = 0;
        this.anInt10524 = -1;
        this.aBoolean10551 = false;
        this.anInt10560 = -1;
        this.anInt10542 = 0;
        this.anInt10553 = 0;
        aByte10556 = (byte) 0;
        this.anInt10558 = 255;
        this.anInt10540 = -1;
        aByte10552 = (byte) 0;
        aByte10538 = (byte) 0;
        this.anInt10561 = -1;
        this.anInt10564 = 0;
    }
}
