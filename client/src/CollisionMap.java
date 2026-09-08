/* CollisionMap - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * Scene collision / clipping flag grid (RENAMED from `Class361`, then misnamed
 * `TeleportHandler` because one helper builds a {@code tele x,y,...} console string).
 * <p>
 * Each tile stores a bitfield of walkability walls (NESW), solid blocks, bridges,
 * etc. Pathfinding and loc spawn/despawn mutate flags via
 * {@link #setCollisionFlag}/{@link #clearCollisionFlag}/{@link #flagSolid}/{@link #unflagWall}.
 * Coordinates are world-tile absolute; {@link #offsetX}/{@link #offsetY} convert to
 * local indices into {@link #collisionFlags}.
 */

final class CollisionMap {
    static int anInt4431;
    static int anInt4432;
    static Component183 aClass114_4433 = new Component183(22, 0);
    static int anInt4434;
    static int anInt4435;
    static int anInt4436;
    /** Local map width in tiles (X extent of {@link #collisionFlags}). */
    int width;
    /** Per-tile clip bitfield: walls, blocks, bridge, interact, … */
    int[][] collisionFlags;
    static int anInt4439;
    static int anInt4440;
    /** World-tile Y subtracted before indexing {@link #collisionFlags}. */
    int offsetY;
    static int anInt4442;
    /** Local map length in tiles (Y extent of {@link #collisionFlags}). */
    int length;
    static int anInt4444;
    static int anInt4445;
    static int anInt4446;
    static int anInt4447;
    static int anInt4448;
    static int anInt4449;
    static int anInt4450;
    static int anInt4451;
    static int anInt4452;
    /** World-tile X subtracted before indexing {@link #collisionFlags}. */
    int offsetX;
    static int anInt4454;
    static float aFloat4455;

    /** Clears bits {@code i} from the clip flag at local ({@code i_1_},{@code i_2_}). */
    private final void clearCollisionFlag(int i, int i_0_, int i_1_, int i_2_) {
        this.collisionFlags[i_1_][i_2_] = GpsOverlay.bitwiseAnd((this.collisionFlags[i_1_][i_2_]), ~i);
        if (i_0_ > -120) method3509(-18, true, false, 122, 119, -54, 18, -57);
        anInt4452++;
    }

    /** ORs bits {@code i_3_} into the clip flag at local ({@code i},{@code i_4_}). */
    private final void setCollisionFlag(int i, int i_3_, int i_4_, int i_5_) {
        this.collisionFlags[i][i_4_] = Component224.bitwiseOr((this.collisionFlags[i][i_4_]), i_3_);
        if (i_5_ != -6496) setCollisionFlag(20, -107, -63, 115);
        anInt4448++;
    }

    /**
     * True if the mover of size {@code i_7_} can reach a wall/decor of type
     * {@code i_11_} / orientation {@code i_8_} at ({@code i_9_},{@code i_10_})
     * from ({@code i},{@code i_6_}) without blocked clip bits (classic RS wall-reach).
     */
    final boolean reachedWall(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        anInt4440++;
        int i_13_ = 64 % ((-11 - i_12_) / 37);
        if (i_7_ == 1) {
            if (i_9_ == i && i_10_ == i_6_) return true;
        } else if (i >= i_9_ && -1 + i_9_ + i_7_ >= i && i_10_ >= i_10_ && i_10_ <= -1 + (i_7_ + i_10_)) return true;
        i_10_ -= this.offsetY;
        i_6_ -= this.offsetY;
        i -= this.offsetX;
        i_9_ -= this.offsetX;
        if (i_7_ == 1) {
            if (i_11_ == 0) {
                if (i_8_ == 0) {
                    if (i_9_ == -1 + i && i_6_ == i_10_) return true;
                    if (i == i_9_ && i_10_ - -1 == i_6_ && (0x2c0120 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                    if (i == i_9_ && i_6_ == -1 + i_10_ && (0x2c0102 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                } else if (i_8_ == 1) {
                    if (i_9_ == i && i_10_ - -1 == i_6_) return true;
                    if (i + -1 == i_9_ && i_10_ == i_6_ && ((this.collisionFlags[i_9_][i_6_]) & 0x2c0108) == 0) return true;
                    if (i + 1 == i_9_ && i_10_ == i_6_ && (0x2c0180 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                } else if (i_8_ == 2) {
                    if (i + 1 == i_9_ && i_10_ == i_6_) return true;
                    if (i_9_ == i && 1 + i_10_ == i_6_ && ((this.collisionFlags[i_9_][i_6_]) & 0x2c0120) == 0) return true;
                    if (i_9_ == i && i_10_ + -1 == i_6_ && (0x2c0102 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                } else if (i_8_ == 3) {
                    if (i_9_ == i && -1 + i_10_ == i_6_) return true;
                    if (i + -1 == i_9_ && i_10_ == i_6_ && ((this.collisionFlags[i_9_][i_6_]) & 0x2c0108) == 0) return true;
                    if (i_9_ == 1 + i && i_10_ == i_6_ && ((this.collisionFlags[i_9_][i_6_]) & 0x2c0180) == 0) return true;
                }
            }
            if (i_11_ == 2) {
                if (i_8_ == 0) {
                    if (-1 + i == i_9_ && i_6_ == i_10_) return true;
                    if (i == i_9_ && i_6_ == i_10_ - -1) return true;
                    if (i + 1 == i_9_ && i_10_ == i_6_ && (0x2c0180 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                    if (i == i_9_ && i_6_ == i_10_ - 1 && (0x2c0102 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                } else if (i_8_ == 1) {
                    if (i_9_ == -1 + i && i_10_ == i_6_ && (0x2c0108 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                    if (i == i_9_ && i_10_ + 1 == i_6_) return true;
                    if (i_9_ == i - -1 && i_10_ == i_6_) return true;
                    if (i == i_9_ && i_10_ - 1 == i_6_ && ((this.collisionFlags[i_9_][i_6_]) & 0x2c0102) == 0) return true;
                } else if (i_8_ == 2) {
                    if (i - 1 == i_9_ && i_10_ == i_6_ && (0x2c0108 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                    if (i_9_ == i && i_10_ + 1 == i_6_ && (0x2c0120 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                    if (i_9_ == i + 1 && i_10_ == i_6_) return true;
                    if (i_9_ == i && -1 + i_10_ == i_6_) return true;
                } else if (i_8_ == 3) {
                    if (i + -1 == i_9_ && i_6_ == i_10_) return true;
                    if (i_9_ == i && 1 + i_10_ == i_6_ && (0x2c0120 & (this.collisionFlags[i_9_][i_6_])) == 0) return true;
                    if (1 + i == i_9_ && i_6_ == i_10_ && ((this.collisionFlags[i_9_][i_6_]) & 0x2c0180) == 0) return true;
                    if (i == i_9_ && (i_6_ == i_10_ + -1)) return true;
                }
            }
            if (i_11_ == 9) {
                if (i_9_ == i && i_6_ == 1 + i_10_ && ((0x20 & this.collisionFlags[i_9_][i_6_]) == 0)) return true;
                if (i == i_9_ && -1 + i_10_ == i_6_ && ((0x2 & this.collisionFlags[i_9_][i_6_]) == 0)) return true;
                if (-1 + i == i_9_ && i_6_ == i_10_ && ((0x8 & this.collisionFlags[i_9_][i_6_]) == 0)) return true;
                return i_9_ == 1 + i && i_10_ == i_6_ && (this.collisionFlags[i_9_][i_6_] & 0x80) == 0;
            }
        } else {
            int i_14_ = -1 + (i_7_ + i_9_);
            int i_15_ = -1 + i_7_ + i_6_;
            if (i_11_ == 0) {
                if (i_8_ == 0) {
                    if (-i_7_ + i == i_9_ && i_6_ <= i_10_ && i_10_ <= i_15_) return true;
                    if (i_9_ <= i && i <= i_14_ && i_10_ + 1 == i_6_ && (this.collisionFlags[i][i_6_] & 0x2c0120) == 0) return true;
                    if (i_9_ <= i && i_14_ >= i && i_6_ == -i_7_ + i_10_ && (this.collisionFlags[i][i_15_] & 0x2c0102) == 0) return true;
                } else if (i_8_ == 1) {
                    if (i >= i_9_ && i <= i_14_ && i_10_ - -1 == i_6_) return true;
                    if (i + -i_7_ == i_9_ && i_6_ <= i_10_ && i_15_ >= i_10_ && (0x2c0108 & (this.collisionFlags[i_14_][i_10_])) == 0) return true;
                    if (1 + i == i_9_ && i_6_ <= i_10_ && i_15_ >= i_10_ && (0x2c0180 & (this.collisionFlags[i_9_][i_10_])) == 0) return true;
                } else if (i_8_ == 2) {
                    if (i_9_ == 1 + i && i_6_ <= i_10_ && i_15_ >= i_10_) return true;
                    if (i >= i_9_ && i <= i_14_ && i_10_ - -1 == i_6_ && (this.collisionFlags[i][i_6_] & 0x2c0120) == 0) return true;
                    if (i >= i_9_ && i_14_ >= i && -i_7_ + i_10_ == i_6_ && ((this.collisionFlags[i][i_15_]) & 0x2c0102) == 0) return true;
                } else if (i_8_ == 3) {
                    if (i_9_ <= i && i_14_ >= i && i_10_ + -i_7_ == i_6_) return true;
                    if (i - i_7_ == i_9_ && i_10_ >= i_6_ && i_10_ <= i_15_ && ((this.collisionFlags[i_14_][i_10_]) & 0x2c0108) == 0) return true;
                    if (i_9_ == 1 + i && i_6_ <= i_10_ && i_10_ <= i_15_ && (0x2c0180 & (this.collisionFlags[i_9_][i_10_])) == 0) return true;
                }
            }
            if (i_11_ == 2) {
                if (i_8_ == 0) {
                    if (i - i_7_ == i_9_ && i_6_ <= i_10_ && i_10_ <= i_15_) return true;
                    if (i_9_ <= i && i <= i_14_ && i_6_ == 1 + i_10_) return true;
                    if (i_9_ == i + 1 && i_10_ >= i_6_ && i_10_ <= i_15_ && (0x2c0180 & (this.collisionFlags[i_9_][i_10_])) == 0) return true;
                    if (i >= i_9_ && i <= i_14_ && -i_7_ + i_10_ == i_6_ && (this.collisionFlags[i][i_15_] & 0x2c0102) == 0) return true;
                } else if (i_8_ == 1) {
                    if (i_9_ == -i_7_ + i && i_6_ <= i_10_ && i_15_ >= i_10_ && (0x2c0108 & (this.collisionFlags[i_14_][i_10_])) == 0) return true;
                    if (i >= i_9_ && i <= i_14_ && i_6_ == i_10_ + 1) return true;
                    if (1 + i == i_9_ && i_10_ >= i_6_ && i_10_ <= i_15_) return true;
                    if (i_9_ <= i && i <= i_14_ && -i_7_ + i_10_ == i_6_ && (this.collisionFlags[i][i_15_] & 0x2c0102) == 0) return true;
                } else if (i_8_ == 2) {
                    if (i_9_ == i - i_7_ && i_6_ <= i_10_ && i_10_ <= i_15_ && (0x2c0108 & (this.collisionFlags[i_14_][i_10_])) == 0) return true;
                    if (i >= i_9_ && i_14_ >= i && 1 + i_10_ == i_6_ && (this.collisionFlags[i][i_6_] & 0x2c0120) == 0) return true;
                    if (i - -1 == i_9_ && i_6_ <= i_10_ && i_15_ >= i_10_) return true;
                    if (i >= i_9_ && i <= i_14_ && -i_7_ + i_10_ == i_6_) return true;
                } else if (i_8_ == 3) {
                    if (i_9_ == i + -i_7_ && i_6_ <= i_10_ && i_10_ <= i_15_) return true;
                    if (i >= i_9_ && i_14_ >= i && i_6_ == i_10_ + 1 && (this.collisionFlags[i][i_6_] & 0x2c0120) == 0) return true;
                    if (i_9_ == i + 1 && i_10_ >= i_6_ && i_10_ <= i_15_ && ((this.collisionFlags[i_9_][i_10_]) & 0x2c0180) == 0) return true;
                    if (i >= i_9_ && i <= i_14_ && i_6_ == i_10_ + -i_7_) return true;
                }
            }
            if (i_11_ == 9) {
                if (i >= i_9_ && i <= i_14_ && i_10_ - -1 == i_6_ && (this.collisionFlags[i][i_6_] & 0x2c0120) == 0) return true;
                if (i_9_ <= i && i_14_ >= i && i_10_ + -i_7_ == i_6_ && (this.collisionFlags[i][i_15_] & 0x2c0102) == 0) return true;
                if (-i_7_ + i == i_9_ && i_10_ >= i_6_ && i_10_ <= i_15_ && (0x2c0108 & this.collisionFlags[i_14_][i_10_]) == 0) return true;
                return i_9_ == i - -1 && i_10_ >= i_6_ && i_10_ <= i_15_ && ((0x2c0180 & this.collisionFlags[i_9_][i_10_]) == 0);
            }
        }
        return false;
    }

    final void method3496(int i, int i_16_, int i_17_) {
        i -= this.offsetY;
        if (i_17_ != 1) method3510(113, 9, 32, -49, -123, false, false);
        anInt4444++;
        i_16_ -= this.offsetX;
        this.collisionFlags[i_16_][i] = Component224.bitwiseOr((this.collisionFlags[i_16_][i]), 262144);
    }

    final boolean method3497(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
        if (i != -28388) method3504(-75, -117, 49, -113, 42, -115, 105, -59);
        anInt4449++;
        int i_27_ = i_22_ - -i_20_;
        int i_28_ = i_23_ + i_24_;
        int i_29_ = i_18_ - -i_26_;
        int i_30_ = i_25_ - -i_21_;
        if (i_29_ == i_22_ && (i_19_ & 0x2) == 0) {
            int i_31_ = Math.max(i_25_, i_24_);
            for (int i_32_ = (Math.min(i_28_, i_30_)); i_32_ > i_31_; i_31_++) {
                if (((this.collisionFlags[-this.offsetX + (i_29_ - 1)][i_31_ - this.offsetY]) & 0x8) == 0) return true;
            }
        } else if (i_18_ == i_27_ && (0x8 & i_19_) == 0) {
            int i_33_ = Math.max(i_25_, i_24_);
            for (int i_34_ = (Math.min(i_30_, i_28_)); i_33_ < i_34_; i_33_++) {
                if (((this.collisionFlags[-this.offsetX + i_18_][-this.offsetY + i_33_]) & 0x80) == 0) return true;
            }
        } else if (i_30_ == i_24_ && (i_19_ & 0x1) == 0) {
            int i_35_ = Math.max(i_18_, i_22_);
            for (int i_36_ = Math.min(i_27_, i_29_); i_36_ > i_35_; i_35_++) {
                if ((0x2 & (this.collisionFlags[i_35_ + -this.offsetX][-this.offsetY + -1 + i_30_])) == 0) return true;
            }
        } else if (i_25_ == i_28_ && (i_19_ & 0x4) == 0) {
            int i_37_ = Math.max(i_22_, i_18_);
            for (int i_38_ = Math.min(i_27_, i_29_); i_38_ > i_37_; i_37_++) {
                if (((this.collisionFlags[i_37_ + -this.offsetX][i_25_ - this.offsetY]) & 0x20) == 0) return true;
            }
        }
        return false;
    }

    static final void method3498(int i, GraphicsToolkit var_ha, int i_39_, int i_40_, boolean bool, int i_41_) {
        do {
            try {
                anInt4442++;
                var_ha.KA(i_39_, i_41_, i_40_ + i_39_, i_41_ + i);
                var_ha.method3675(i_40_, (byte) -125, i_39_, i_41_, i, -16777216);
                if (Node.anInt4290 >= 100) {
                    float f = ((float) DisplayModeManagerContainer229.anInt1267 / (float) DisplayModeManagerContainer229.anInt1259);
                    int i_42_ = i_40_;
                    int i_43_ = i;
                    if (!(f < 1.0F)) i_42_ = (int) ((float) i / f);
                    else i_43_ = (int) ((float) i_40_ * f);
                    i_41_ += (-i_43_ + i) / 2;
                    i_39_ += (i_40_ + -i_42_) / 2;
                    if (VideoAdPlayer.aClass105_4643 == null || i_40_ != VideoAdPlayer.aClass105_4643.method971() || (VideoAdPlayer.aClass105_4643.method969() != i)) {
                        DisplayModeManagerContainer229.setWorldBounds(DisplayModeManagerContainer229.anInt1266, (DisplayModeManagerContainer229.anInt1267 + DisplayModeManagerContainer229.anInt1263), (DisplayModeManagerContainer229.anInt1266 - -DisplayModeManagerContainer229.anInt1259), DisplayModeManagerContainer229.anInt1263, i_39_, i_41_, i_42_ + i_39_, i_43_ + i_41_);
                        DisplayModeManagerContainer229.computeTransform(var_ha);
                        VideoAdPlayer.aClass105_4643 = var_ha.method3683(i_39_, i_41_, i_42_, i_43_, false);
                    }
                    VideoAdPlayer.aClass105_4643.drawAt(i_39_, i_41_);
                    int i_44_ = Component361.anInt370 * i_42_ / DisplayModeManagerContainer229.anInt1259;
                    int i_45_ = i_43_ * Component280.anInt2446 / DisplayModeManagerContainer229.anInt1267;
                    int i_46_ = i_39_ - -(i_42_ * Component63.anInt4509 / DisplayModeManagerContainer229.anInt1259);
                    if (bool != true) method3498(44, null, -27, -91, true, -26);
                    int i_47_ = (-i_45_ + i_41_ - (-i_43_ + (i_43_ * DisplayModeManagerContainer34.anInt8665 / DisplayModeManagerContainer229.anInt1267)));
                    int i_48_ = -1996554240;
                    if (WorldNameText.STELLARDAWN == PacketReader.currentGameType) i_48_ = -1996488705;
                    var_ha.fillRect2D(i_46_, i_47_, i_44_, i_45_, i_48_, 1);
                    var_ha.fillRect3D(i_46_, i_47_, i_44_, i_45_, i_48_, 0);
                    if (WaterShader.anInt7379 <= 0) break;
                    int i_49_;
                    if (LoadingManager.anInt2173 <= 50) i_49_ = LoadingManager.anInt2173 * 5;
                    else i_49_ = -(5 * LoadingManager.anInt2173) + 500;
                    for (NodeSub21 class348_sub21 = ((NodeSub21) DisplayModeManagerContainer229.aClass262_1254.first(4)); class348_sub21 != null; class348_sub21 = (NodeSub21) DisplayModeManagerContainer229.aClass262_1254.next((byte) 126)) {
                        Component274 class42 = (DisplayModeManagerContainer229.aClass153_1238.method1225(class348_sub21.anInt6847, (byte) 71));
                        if (NodeCache.method589(class42, -4)) {
                            if (DefinitionSub30.anInt9399 == (class348_sub21.anInt6847)) {
                                int i_50_ = (i_39_ + (i_42_ * (class348_sub21.anInt6852) / DisplayModeManagerContainer229.anInt1259));
                                int i_51_ = (((DisplayModeManagerContainer229.anInt1267 - (class348_sub21.anInt6851)) * i_43_ / DisplayModeManagerContainer229.anInt1267) + i_41_);
                                var_ha.method3675(4, (byte) -125, i_50_ - 2, -2 + i_51_, 4, (i_49_ << 24 | 0xffff00));
                            } else if (Component225.anInt481 != -1 && (class42.anInt596 == Component225.anInt481)) {
                                int i_52_ = (i_39_ - -((class348_sub21.anInt6852) * i_42_ / DisplayModeManagerContainer229.anInt1259));
                                int i_53_ = i_41_ - -(i_43_ * (DisplayModeManagerContainer229.anInt1267 + -(class348_sub21.anInt6851)) / DisplayModeManagerContainer229.anInt1267);
                                var_ha.method3675(4, (byte) -125, i_52_ + -2, -2 + i_53_, 4, (i_49_ << 24 | 0xffff00));
                            }
                        }
                    }
                }
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("fe.E(" + i + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_39_ + ',' + i_40_ + ',' + bool + ',' + i_41_ + ')'));
            }
            break;
        } while (false);
    }

    final void method3499(byte i, int i_54_, int i_55_) {
        i_55_ -= this.offsetY;
        i_54_ -= this.offsetX;
        anInt4446++;
        if (i == -52) this.collisionFlags[i_54_][i_55_] = GpsOverlay.bitwiseAnd((this.collisionFlags[i_54_][i_55_]), -262145);
    }

    final void method3500(int i) {
        int i_56_ = 0;
        if (i != 700) method3509(120, true, false, 4, -12, 14, -33, -109);
        for (/**/; i_56_ < this.width; i_56_++) {
            for (int i_57_ = 0; this.length > i_57_; i_57_++) {
                if (i_56_ != 0 && i_57_ != 0 && i_56_ < this.width + -5 && (i_57_ < -5 + this.length)) this.collisionFlags[i_56_][i_57_] = 2097152;
                else this.collisionFlags[i_56_][i_57_] = -1;
            }
        }
        anInt4451++;
    }

    final void method3501(byte i, int i_58_, int i_59_) {
        i_59_ -= this.offsetX;
        anInt4447++;
        i_58_ -= this.offsetY;
        int i_60_ = -79 % ((i - 66) / 39);
        this.collisionFlags[i_59_][i_58_] = GpsOverlay.bitwiseAnd((this.collisionFlags[i_59_][i_58_]), -2097153);
    }

    static final void method3502(int i, int i_61_, int i_62_, int i_63_) {
        anInt4439++;
        String string = ("tele " + i_62_ + "," + (i_63_ >> 6) + "," + (i >> 6) + "," + (0x3f & i_63_) + "," + (0x3f & i));
        if (i_61_ != 2) method3502(-25, -23, 24, 63);
        CommandHandler.handleCommand(string, true, false, (byte) -79);
    }

    final boolean method3503(int i, byte i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_) {
        anInt4436++;
        if (i_66_ > 1) {
            if (Component188.method1842(i_68_, i_65_, -1, i_66_, i, i_70_, i_71_, i_66_, i_67_)) return true;
            return method3497(-28388, i_71_, i_69_, i_66_, i_67_, i, i_66_, i_70_, i_65_, i_68_);
        }
        int i_72_ = 64 % ((2 - i_64_) / 45);
        int i_73_ = -1 + i_68_ + i_71_;
        int i_74_ = i_65_ - (-i_67_ + 1);
        if (i >= i_71_ && i_73_ >= i && i_65_ <= i_70_ && i_70_ <= i_74_) return true;
        if (-1 + i_71_ == i && i_70_ >= i_65_ && i_70_ <= i_74_ && ((this.collisionFlags[-this.offsetX + i][-this.offsetY + i_70_]) & 0x8) == 0 && (i_69_ & 0x8) == 0) return true;
        if (1 + i_73_ == i && i_70_ >= i_65_ && i_74_ >= i_70_ && (0x80 & (this.collisionFlags[-this.offsetX + i][i_70_ - this.offsetY])) == 0 && (0x2 & i_69_) == 0) return true;
        if (-1 + i_65_ == i_70_ && i >= i_71_ && i_73_ >= i && ((this.collisionFlags[i + -this.offsetX][-this.offsetY + i_70_]) & 0x2) == 0 && (i_69_ & 0x4) == 0) return true;
        return i_70_ == i_74_ - -1 && i_71_ <= i && i_73_ >= i && (0x20 & (this.collisionFlags[-this.offsetX + i][i_70_ - this.offsetY])) == 0 && (0x1 & i_69_) == 0;
    }

    final boolean method3504(int i, int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
        anInt4454++;
        if (i_79_ != 1) this.length = -59;
        if (i_81_ != 1) {
            if (i_77_ <= i_76_ && -1 + i_81_ + i_77_ >= i_76_ && i <= i && i_81_ + i - 1 >= i) return true;
        } else if (i_77_ == i_76_ && i_75_ == i) return true;
        i_76_ -= this.offsetX;
        i_77_ -= this.offsetX;
        i -= this.offsetY;
        i_75_ -= this.offsetY;
        if (i_81_ == 1) {
            if (i_78_ == 6 || i_78_ == 7) {
                if (i_78_ == 7) i_80_ = 2 + i_80_ & 0x3;
                if (i_80_ == 0) {
                    if (i_77_ == 1 + i_76_ && i_75_ == i && (0x80 & (this.collisionFlags[i_77_][i_75_])) == 0) return true;
                    if (i_77_ == i_76_ && i_75_ == -1 + i && (0x2 & (this.collisionFlags[i_77_][i_75_])) == 0) return true;
                } else if (i_80_ == 1) {
                    if (i_76_ + -1 == i_77_ && i == i_75_ && (this.collisionFlags[i_77_][i_75_] & 0x8) == 0) return true;
                    if (i_76_ == i_77_ && i - 1 == i_75_ && ((this.collisionFlags[i_77_][i_75_]) & 0x2) == 0) return true;
                } else if (i_80_ == 2) {
                    if (i_77_ == -1 + i_76_ && i == i_75_ && (0x8 & (this.collisionFlags[i_77_][i_75_])) == 0) return true;
                    if (i_76_ == i_77_ && i + 1 == i_75_ && ((this.collisionFlags[i_77_][i_75_]) & 0x20) == 0) return true;
                } else if (i_80_ == 3) {
                    if (i_76_ - -1 == i_77_ && i_75_ == i && (this.collisionFlags[i_77_][i_75_] & 0x80) == 0) return true;
                    if (i_77_ == i_76_ && i + 1 == i_75_ && (0x20 & (this.collisionFlags[i_77_][i_75_])) == 0) return true;
                }
            }
            if (i_78_ == 8) {
                if (i_76_ == i_77_ && 1 + i == i_75_ && (this.collisionFlags[i_77_][i_75_] & 0x20) == 0) return true;
                if (i_76_ == i_77_ && i - 1 == i_75_ && (this.collisionFlags[i_77_][i_75_] & 0x2) == 0) return true;
                if (i_77_ == i_76_ + -1 && i_75_ == i && (this.collisionFlags[i_77_][i_75_] & 0x8) == 0) return true;
                return i_77_ == 1 + i_76_ && i_75_ == i && (this.collisionFlags[i_77_][i_75_] & 0x80) == 0;
            }
        } else {
            int i_82_ = -1 + (i_81_ + i_77_);
            int i_83_ = i_75_ - (-i_81_ - -1);
            if (i_78_ == 6 || i_78_ == 7) {
                if (i_78_ == 7) i_80_ = 0x3 & 2 + i_80_;
                if (i_80_ == 0) {
                    if (i_77_ == 1 + i_76_ && i_75_ <= i && i <= i_83_ && ((0x80 & this.collisionFlags[i_77_][i]) == 0)) return true;
                    if (i_76_ >= i_77_ && i_76_ <= i_82_ && -i_81_ + i == i_75_ && ((this.collisionFlags[i_76_][i_83_]) & 0x2) == 0) return true;
                } else if (i_80_ == 1) {
                    if (i_77_ == i_76_ + -i_81_ && i >= i_75_ && i <= i_83_ && (this.collisionFlags[i_82_][i] & 0x8) == 0) return true;
                    if (i_76_ >= i_77_ && i_76_ <= i_82_ && i_75_ == -i_81_ + i && ((this.collisionFlags[i_76_][i_83_]) & 0x2) == 0) return true;
                } else if (i_80_ == 2) {
                    if (-i_81_ + i_76_ == i_77_ && i >= i_75_ && i_83_ >= i && ((this.collisionFlags[i_82_][i]) & 0x8) == 0) return true;
                    if (i_76_ >= i_77_ && i_76_ <= i_82_ && 1 + i == i_75_ && ((this.collisionFlags[i_76_][i_75_]) & 0x20) == 0) return true;
                } else if (i_80_ == 3) {
                    if (i_77_ == i_76_ - -1 && i_75_ <= i && i <= i_83_ && (0x80 & (this.collisionFlags[i_77_][i])) == 0) return true;
                    if (i_76_ >= i_77_ && i_82_ >= i_76_ && i - -1 == i_75_ && ((this.collisionFlags[i_76_][i_75_]) & 0x20) == 0) return true;
                }
            }
            if (i_78_ == 8) {
                if (i_76_ >= i_77_ && i_82_ >= i_76_ && 1 + i == i_75_ && (0x20 & this.collisionFlags[i_76_][i_75_]) == 0) return true;
                if (i_76_ >= i_77_ && i_76_ <= i_82_ && i_75_ == -i_81_ + i && (0x2 & this.collisionFlags[i_76_][i_83_]) == 0) return true;
                if (i_77_ == i_76_ - i_81_ && i_75_ <= i && i <= i_83_ && ((0x8 & this.collisionFlags[i_82_][i]) == 0)) return true;
                return i_77_ == 1 + i_76_ && i_75_ <= i && i_83_ >= i && ((0x80 & this.collisionFlags[i_77_][i]) == 0);
            }
        }
        return false;
    }

    /**
     * Flags a solid rectangle of size ({@code i}×{@code i_88_}) at world
     * ({@code i_86_},{@code i_84_}). Base bit 256; optional bridge/interact bits.
     */
    final void flagSolid(boolean bool, int i, int i_84_, boolean bool_85_, int i_86_, boolean bool_87_, int i_88_) {
        if (bool_85_ != true) this.offsetX = 116;
        anInt4434++;
        int i_89_ = 256;
        if (bool_87_) i_89_ |= 0x20000;
        i_86_ -= this.offsetX;
        i_84_ -= this.offsetY;
        if (bool) i_89_ |= 0x40000000;
        for (int i_90_ = i_86_; i_86_ + i > i_90_; i_90_++) {
            if (i_90_ >= 0 && (i_90_ < this.width)) {
                for (int i_91_ = i_84_; i_91_ < i_84_ + i_88_; i_91_++) {
                    if (i_91_ >= 0 && this.length > i_91_) setCollisionFlag(i_90_, i_89_, i_91_, -6496);
                }
            }
        }
    }

    /**
     * Clears wall/decor clip bits for object type {@code i_93_} / orientation
     * {@code i} at world ({@code i_92_},{@code i_94_}) — inverse of wall flagging.
     */
    final void unflagWall(boolean bool, int i, int i_92_, int i_93_, int i_94_, boolean bool_95_, int i_96_) {
        anInt4435++;
        i_92_ -= this.offsetX;
        if (i_96_ == 29216) {
            i_94_ -= this.offsetY;
            if (i_93_ == 0) {
                if (i == 0) {
                    clearCollisionFlag(128, i_96_ ^ ~0x725a, i_92_, i_94_);
                    clearCollisionFlag(8, i_96_ + -29342, i_92_ + -1, i_94_);
                }
                if (i == 1) {
                    clearCollisionFlag(2, -122, i_92_, i_94_);
                    clearCollisionFlag(32, -124, i_92_, i_94_ + 1);
                }
                if (i == 2) {
                    clearCollisionFlag(8, -127, i_92_, i_94_);
                    clearCollisionFlag(128, -127, 1 + i_92_, i_94_);
                }
                if (i == 3) {
                    clearCollisionFlag(32, -125, i_92_, i_94_);
                    clearCollisionFlag(2, i_96_ ^ ~0x725f, i_92_, i_94_ + -1);
                }
            }
            if (i_93_ == 1 || i_93_ == 3) {
                if (i == 0) {
                    clearCollisionFlag(1, -123, i_92_, i_94_);
                    clearCollisionFlag(16, -127, -1 + i_92_, i_94_ + 1);
                }
                if (i == 1) {
                    clearCollisionFlag(4, -123, i_92_, i_94_);
                    clearCollisionFlag(64, -128, i_92_ - -1, 1 + i_94_);
                }
                if (i == 2) {
                    clearCollisionFlag(16, -122, i_92_, i_94_);
                    clearCollisionFlag(1, -125, 1 + i_92_, -1 + i_94_);
                }
                if (i == 3) {
                    clearCollisionFlag(64, -127, i_92_, i_94_);
                    clearCollisionFlag(4, i_96_ ^ ~0x725f, -1 + i_92_, -1 + i_94_);
                }
            }
            if (i_93_ == 2) {
                if (i == 0) {
                    clearCollisionFlag(130, -122, i_92_, i_94_);
                    clearCollisionFlag(8, -123, -1 + i_92_, i_94_);
                    clearCollisionFlag(32, -124, i_92_, i_94_ + 1);
                }
                if (i == 1) {
                    clearCollisionFlag(10, -123, i_92_, i_94_);
                    clearCollisionFlag(32, -122, i_92_, i_94_ - -1);
                    clearCollisionFlag(128, -127, i_92_ - -1, i_94_);
                }
                if (i == 2) {
                    clearCollisionFlag(40, -122, i_92_, i_94_);
                    clearCollisionFlag(128, -123, 1 + i_92_, i_94_);
                    clearCollisionFlag(2, -127, i_92_, i_94_ + -1);
                }
                if (i == 3) {
                    clearCollisionFlag(160, -127, i_92_, i_94_);
                    clearCollisionFlag(2, -128, i_92_, i_94_ - 1);
                    clearCollisionFlag(8, i_96_ + -29343, -1 + i_92_, i_94_);
                }
            }
            if (bool) {
                if (i_93_ == 0) {
                    if (i == 0) {
                        clearCollisionFlag(65536, i_96_ ^ ~0x7258, i_92_, i_94_);
                        clearCollisionFlag(4096, -127, i_92_ - 1, i_94_);
                    }
                    if (i == 1) {
                        clearCollisionFlag(1024, i_96_ ^ ~0x725f, i_92_, i_94_);
                        clearCollisionFlag(16384, -122, i_92_, 1 + i_94_);
                    }
                    if (i == 2) {
                        clearCollisionFlag(4096, -124, i_92_, i_94_);
                        clearCollisionFlag(65536, -121, 1 + i_92_, i_94_);
                    }
                    if (i == 3) {
                        clearCollisionFlag(16384, -128, i_92_, i_94_);
                        clearCollisionFlag(1024, -125, i_92_, i_94_ - 1);
                    }
                }
                if (i_93_ == 1 || i_93_ == 3) {
                    if (i == 0) {
                        clearCollisionFlag(512, -125, i_92_, i_94_);
                        clearCollisionFlag(8192, -128, -1 + i_92_, 1 + i_94_);
                    }
                    if (i == 1) {
                        clearCollisionFlag(2048, i_96_ ^ ~0x7258, i_92_, i_94_);
                        clearCollisionFlag(32768, -128, 1 + i_92_, i_94_ - -1);
                    }
                    if (i == 2) {
                        clearCollisionFlag(8192, -125, i_92_, i_94_);
                        clearCollisionFlag(512, -123, i_92_ + 1, i_94_ - 1);
                    }
                    if (i == 3) {
                        clearCollisionFlag(32768, i_96_ ^ ~0x7258, i_92_, i_94_);
                        clearCollisionFlag(2048, -123, i_92_ - 1, i_94_ - 1);
                    }
                }
                if (i_93_ == 2) {
                    if (i == 0) {
                        clearCollisionFlag(66560, i_96_ + -29342, i_92_, i_94_);
                        clearCollisionFlag(4096, -121, -1 + i_92_, i_94_);
                        clearCollisionFlag(16384, -127, i_92_, i_94_ - -1);
                    }
                    if (i == 1) {
                        clearCollisionFlag(5120, -127, i_92_, i_94_);
                        clearCollisionFlag(16384, -125, i_92_, 1 + i_94_);
                        clearCollisionFlag(65536, -123, 1 + i_92_, i_94_);
                    }
                    if (i == 2) {
                        clearCollisionFlag(20480, i_96_ + -29339, i_92_, i_94_);
                        clearCollisionFlag(65536, -124, 1 + i_92_, i_94_);
                        clearCollisionFlag(1024, -125, i_92_, i_94_ + -1);
                    }
                    if (i == 3) {
                        clearCollisionFlag(81920, -123, i_92_, i_94_);
                        clearCollisionFlag(1024, i_96_ + -29339, i_92_, -1 + i_94_);
                        clearCollisionFlag(4096, i_96_ + -29340, i_92_ + -1, i_94_);
                    }
                }
            }
            if (bool_95_) {
                if (i_93_ == 0) {
                    if (i == 0) {
                        clearCollisionFlag(536870912, -125, i_92_, i_94_);
                        clearCollisionFlag(33554432, -128, i_92_ + -1, i_94_);
                    }
                    if (i == 1) {
                        clearCollisionFlag(8388608, i_96_ + -29338, i_92_, i_94_);
                        clearCollisionFlag(134217728, i_96_ + -29339, i_92_, i_94_ - -1);
                    }
                    if (i == 2) {
                        clearCollisionFlag(33554432, -123, i_92_, i_94_);
                        clearCollisionFlag(536870912, -122, 1 + i_92_, i_94_);
                    }
                    if (i == 3) {
                        clearCollisionFlag(134217728, -128, i_92_, i_94_);
                        clearCollisionFlag(8388608, -127, i_92_, -1 + i_94_);
                    }
                }
                if (i_93_ == 1 || i_93_ == 3) {
                    if (i == 0) {
                        clearCollisionFlag(4194304, -121, i_92_, i_94_);
                        clearCollisionFlag(67108864, -121, i_92_ + -1, 1 + i_94_);
                    }
                    if (i == 1) {
                        clearCollisionFlag(16777216, -126, i_92_, i_94_);
                        clearCollisionFlag(268435456, -124, 1 + i_92_, 1 + i_94_);
                    }
                    if (i == 2) {
                        clearCollisionFlag(67108864, -122, i_92_, i_94_);
                        clearCollisionFlag(4194304, -126, 1 + i_92_, -1 + i_94_);
                    }
                    if (i == 3) {
                        clearCollisionFlag(268435456, -122, i_92_, i_94_);
                        clearCollisionFlag(16777216, -126, -1 + i_92_, i_94_ + -1);
                    }
                }
                if (i_93_ == 2) {
                    if (i == 0) {
                        clearCollisionFlag(545259520, -124, i_92_, i_94_);
                        clearCollisionFlag(33554432, -123, -1 + i_92_, i_94_);
                        clearCollisionFlag(134217728, -123, i_92_, i_94_ + 1);
                    }
                    if (i == 1) {
                        clearCollisionFlag(41943040, -123, i_92_, i_94_);
                        clearCollisionFlag(134217728, i_96_ ^ ~0x725f, i_92_, 1 + i_94_);
                        clearCollisionFlag(536870912, -121, 1 + i_92_, i_94_);
                    }
                    if (i == 2) {
                        clearCollisionFlag(167772160, -127, i_92_, i_94_);
                        clearCollisionFlag(536870912, -124, 1 + i_92_, i_94_);
                        clearCollisionFlag(8388608, -128, i_92_, i_94_ - 1);
                    }
                    if (i == 3) {
                        clearCollisionFlag(671088640, -126, i_92_, i_94_);
                        clearCollisionFlag(8388608, -121, i_92_, i_94_ - 1);
                        clearCollisionFlag(33554432, -126, i_92_ - 1, i_94_);
                    }
                }
            }
        }
    }

    final void method3507(int i, int i_97_, byte i_98_) {
        if (i_98_ > -32) this.width = 85;
        i -= this.offsetY;
        anInt4431++;
        i_97_ -= this.offsetX;
        this.collisionFlags[i_97_][i] = Component224.bitwiseOr((this.collisionFlags[i_97_][i]), 2097152);
    }

    public static void method3508(int i) {
        aClass114_4433 = null;
        if (i != 2) aFloat4455 = 0.7198636F;
    }

    final void method3509(int i, boolean bool, boolean bool_99_, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_) {
        anInt4432++;
        if (i_103_ > 52) {
            int i_105_ = 256;
            if (bool_99_) i_105_ |= 0x20000;
            i_100_ -= this.offsetX;
            i_101_ -= this.offsetY;
            if (bool) i_105_ |= 0x40000000;
            if (i == 1 || i == 3) {
                int i_106_ = i_104_;
                i_104_ = i_102_;
                i_102_ = i_106_;
            }
            for (int i_107_ = i_100_; i_107_ < i_104_ + i_100_; i_107_++) {
                if (i_107_ >= 0 && i_107_ < this.width) {
                    for (int i_108_ = i_101_; (i_101_ + i_102_ > i_108_); i_108_++) {
                        if (i_108_ >= 0 && this.length > i_108_) clearCollisionFlag(i_105_, -122, i_107_, i_108_);
                    }
                }
            }
        }
    }

    final void method3510(int i, int i_109_, int i_110_, int i_111_, int i_112_, boolean bool, boolean bool_113_) {
        anInt4445++;
        int i_114_ = 49 / ((i_110_ - 6) / 46);
        i -= this.offsetY;
        i_109_ -= this.offsetX;
        if (i_111_ == 0) {
            if (i_112_ == 0) {
                setCollisionFlag(i_109_, 128, i, -6496);
                setCollisionFlag(-1 + i_109_, 8, i, -6496);
            }
            if (i_112_ == 1) {
                setCollisionFlag(i_109_, 2, i, -6496);
                setCollisionFlag(i_109_, 32, 1 + i, -6496);
            }
            if (i_112_ == 2) {
                setCollisionFlag(i_109_, 8, i, -6496);
                setCollisionFlag(i_109_ + 1, 128, i, -6496);
            }
            if (i_112_ == 3) {
                setCollisionFlag(i_109_, 32, i, -6496);
                setCollisionFlag(i_109_, 2, -1 + i, -6496);
            }
        }
        if (i_111_ == 1 || i_111_ == 3) {
            if (i_112_ == 0) {
                setCollisionFlag(i_109_, 1, i, -6496);
                setCollisionFlag(i_109_ - 1, 16, 1 + i, -6496);
            }
            if (i_112_ == 1) {
                setCollisionFlag(i_109_, 4, i, -6496);
                setCollisionFlag(i_109_ + 1, 64, 1 + i, -6496);
            }
            if (i_112_ == 2) {
                setCollisionFlag(i_109_, 16, i, -6496);
                setCollisionFlag(1 + i_109_, 1, -1 + i, -6496);
            }
            if (i_112_ == 3) {
                setCollisionFlag(i_109_, 64, i, -6496);
                setCollisionFlag(i_109_ - 1, 4, -1 + i, -6496);
            }
        }
        if (i_111_ == 2) {
            if (i_112_ == 0) {
                setCollisionFlag(i_109_, 130, i, -6496);
                setCollisionFlag(i_109_ - 1, 8, i, -6496);
                setCollisionFlag(i_109_, 32, i + 1, -6496);
            }
            if (i_112_ == 1) {
                setCollisionFlag(i_109_, 10, i, -6496);
                setCollisionFlag(i_109_, 32, 1 + i, -6496);
                setCollisionFlag(1 + i_109_, 128, i, -6496);
            }
            if (i_112_ == 2) {
                setCollisionFlag(i_109_, 40, i, -6496);
                setCollisionFlag(i_109_ + 1, 128, i, -6496);
                setCollisionFlag(i_109_, 2, -1 + i, -6496);
            }
            if (i_112_ == 3) {
                setCollisionFlag(i_109_, 160, i, -6496);
                setCollisionFlag(i_109_, 2, -1 + i, -6496);
                setCollisionFlag(-1 + i_109_, 8, i, -6496);
            }
        }
        if (bool_113_) {
            if (i_111_ == 0) {
                if (i_112_ == 0) {
                    setCollisionFlag(i_109_, 65536, i, -6496);
                    setCollisionFlag(i_109_ - 1, 4096, i, -6496);
                }
                if (i_112_ == 1) {
                    setCollisionFlag(i_109_, 1024, i, -6496);
                    setCollisionFlag(i_109_, 16384, i + 1, -6496);
                }
                if (i_112_ == 2) {
                    setCollisionFlag(i_109_, 4096, i, -6496);
                    setCollisionFlag(i_109_ + 1, 65536, i, -6496);
                }
                if (i_112_ == 3) {
                    setCollisionFlag(i_109_, 16384, i, -6496);
                    setCollisionFlag(i_109_, 1024, i - 1, -6496);
                }
            }
            if (i_111_ == 1 || i_111_ == 3) {
                if (i_112_ == 0) {
                    setCollisionFlag(i_109_, 512, i, -6496);
                    setCollisionFlag(-1 + i_109_, 8192, i + 1, -6496);
                }
                if (i_112_ == 1) {
                    setCollisionFlag(i_109_, 2048, i, -6496);
                    setCollisionFlag(i_109_ + 1, 32768, i - -1, -6496);
                }
                if (i_112_ == 2) {
                    setCollisionFlag(i_109_, 8192, i, -6496);
                    setCollisionFlag(1 + i_109_, 512, i - 1, -6496);
                }
                if (i_112_ == 3) {
                    setCollisionFlag(i_109_, 32768, i, -6496);
                    setCollisionFlag(i_109_ + -1, 2048, -1 + i, -6496);
                }
            }
            if (i_111_ == 2) {
                if (i_112_ == 0) {
                    setCollisionFlag(i_109_, 66560, i, -6496);
                    setCollisionFlag(i_109_ + -1, 4096, i, -6496);
                    setCollisionFlag(i_109_, 16384, 1 + i, -6496);
                }
                if (i_112_ == 1) {
                    setCollisionFlag(i_109_, 5120, i, -6496);
                    setCollisionFlag(i_109_, 16384, i + 1, -6496);
                    setCollisionFlag(i_109_ - -1, 65536, i, -6496);
                }
                if (i_112_ == 2) {
                    setCollisionFlag(i_109_, 20480, i, -6496);
                    setCollisionFlag(1 + i_109_, 65536, i, -6496);
                    setCollisionFlag(i_109_, 1024, -1 + i, -6496);
                }
                if (i_112_ == 3) {
                    setCollisionFlag(i_109_, 81920, i, -6496);
                    setCollisionFlag(i_109_, 1024, i - 1, -6496);
                    setCollisionFlag(i_109_ + -1, 4096, i, -6496);
                }
            }
        }
        if (bool) {
            if (i_111_ == 0) {
                if (i_112_ == 0) {
                    setCollisionFlag(i_109_, 536870912, i, -6496);
                    setCollisionFlag(-1 + i_109_, 33554432, i, -6496);
                }
                if (i_112_ == 1) {
                    setCollisionFlag(i_109_, 8388608, i, -6496);
                    setCollisionFlag(i_109_, 134217728, i - -1, -6496);
                }
                if (i_112_ == 2) {
                    setCollisionFlag(i_109_, 33554432, i, -6496);
                    setCollisionFlag(i_109_ - -1, 536870912, i, -6496);
                }
                if (i_112_ == 3) {
                    setCollisionFlag(i_109_, 134217728, i, -6496);
                    setCollisionFlag(i_109_, 8388608, i - 1, -6496);
                }
            }
            if (i_111_ == 1 || i_111_ == 3) {
                if (i_112_ == 0) {
                    setCollisionFlag(i_109_, 4194304, i, -6496);
                    setCollisionFlag(-1 + i_109_, 67108864, i - -1, -6496);
                }
                if (i_112_ == 1) {
                    setCollisionFlag(i_109_, 16777216, i, -6496);
                    setCollisionFlag(1 + i_109_, 268435456, 1 + i, -6496);
                }
                if (i_112_ == 2) {
                    setCollisionFlag(i_109_, 67108864, i, -6496);
                    setCollisionFlag(1 + i_109_, 4194304, i - 1, -6496);
                }
                if (i_112_ == 3) {
                    setCollisionFlag(i_109_, 268435456, i, -6496);
                    setCollisionFlag(i_109_ - 1, 16777216, -1 + i, -6496);
                }
            }
            if (i_111_ == 2) {
                if (i_112_ == 0) {
                    setCollisionFlag(i_109_, 545259520, i, -6496);
                    setCollisionFlag(i_109_ + -1, 33554432, i, -6496);
                    setCollisionFlag(i_109_, 134217728, i - -1, -6496);
                }
                if (i_112_ == 1) {
                    setCollisionFlag(i_109_, 41943040, i, -6496);
                    setCollisionFlag(i_109_, 134217728, 1 + i, -6496);
                    setCollisionFlag(1 + i_109_, 536870912, i, -6496);
                }
                if (i_112_ == 2) {
                    setCollisionFlag(i_109_, 167772160, i, -6496);
                    setCollisionFlag(1 + i_109_, 536870912, i, -6496);
                    setCollisionFlag(i_109_, 8388608, -1 + i, -6496);
                }
                if (i_112_ == 3) {
                    setCollisionFlag(i_109_, 671088640, i, -6496);
                    setCollisionFlag(i_109_, 8388608, i + -1, -6496);
                    setCollisionFlag(-1 + i_109_, 33554432, i, -6496);
                }
            }
        }
    }
}
