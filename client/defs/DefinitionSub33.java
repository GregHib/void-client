/* DefinitionSub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub33
/**
 * RENAMED from `Class348_Sub40_Sub33` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static int anInt9425;
    static int anInt9426;
    /**
     * Open interface roots indexed by interface group id.
     * {@code openInterfaces[group][child]} — used by menu builders, CS2,
     * {@link Rs2Widget}, and joystick world-map lookup.
     */
    static DisplayModeManagerContainer57[][] openInterfaces;
    static int anInt9428;
    static int anInt9429;
    static int anInt9430;

    static final boolean method3137(boolean bool, byte i) {
        anInt9426++;
        boolean bool_0_ = NodeSub8.toolkit.method3666();
        if (i != -24) return true;
        if (!bool_0_ == !bool) return true;
        if (!bool) NodeSub8.toolkit.method3710();
        else if (!NodeSub8.toolkit.method3671()) bool = false;
        if (bool_0_ == bool) return false;
        Component192.preferences.applyPreference((byte) 74, (Component192.preferences.aClass239_Sub12_7243), bool ? 1 : 0);
        DisplayModeManagerContainer389.savePreferences(37);
        return true;
    }

    public static void method3138(byte i) {
        openInterfaces = null;
        int i_1_ = 93 % ((-58 - i) / 55);
    }

    final int[][] getColourOutput(int i, int i_2_) {
        anInt9429++;
        int[][] is = this.imageCacheStore.getPixels(-97, i);
        if (i_2_ != -1564599039) openInterfaces = null;
        if (this.imageCacheStore.cacheMiss) {
            int[] is_3_ = is[0];
            int[] is_4_ = is[1];
            int[] is_5_ = is[2];
            for (int i_6_ = 0; (DefinitionSub6.anInt9139 > i_6_); i_6_++) {
                method3139(i_6_, i, (byte) -31);
                int[][] is_7_ = this.method3039((byte) 43, AbstractBuffer.anInt4265, 0);
                is_3_[i_6_] = is_7_[0][Component221.anInt1796];
                is_4_[i_6_] = is_7_[1][Component221.anInt1796];
                is_5_[i_6_] = is_7_[2][Component221.anInt1796];
            }
        }
        return is;
    }

    final int[] getMonochromeOutput(int i, int i_8_) {
        anInt9428++;
        if (i_8_ != 255) openInterfaces = null;
        int[] is = this.imageCache.getPixels(0, i);
        if (this.imageCache.cacheMiss) {
            for (int i_9_ = 0; (i_9_ < DefinitionSub6.anInt9139); i_9_++) {
                method3139(i_9_, i, (byte) -31);
                int[] is_10_ = this.method3048(AbstractBuffer.anInt4265, i_8_ ^ 0x25c5979e, 0);
                is[i_9_] = is_10_[Component221.anInt1796];
            }
        }
        return is;
    }

    final void method3049(Buffer class348_sub49, int i, int i_11_) {
        if (i_11_ != 31015) openInterfaces = null;
        anInt9430++;
        if (i == 0) this.use2dImageCache = class348_sub49.readUnsignedByte(255) == 1;
    }

    public DefinitionSub33() {
        super(1, false);
    }

    private final void method3139(int i, int i_12_, byte i_13_) {
        anInt9425++;
        int i_14_ = RenderableSub6.anIntArray6432[i];
        int i_15_ = Component302.anIntArray6035[i_12_];
        if (i_13_ != -31) method3139(-44, -111, (byte) 48);
        float f = (float) Math.atan2(i_14_ + -2048, i_15_ + -2048);
        if ((double) f >= -3.141592653589793 && (double) f <= -2.356194490192345) {
            AbstractBuffer.anInt4265 = i_12_;
            Component221.anInt1796 = i;
        } else if (!((double) f <= -1.5707963267948966) || !((double) f >= -2.356194490192345)) {
            if (!((double) f <= -0.7853981633974483) || !((double) f >= -1.5707963267948966)) {
                if (!(f <= 0.0F) || !((double) f >= -0.7853981633974483)) {
                    if (!(f >= 0.0F) || !((double) f <= 0.7853981633974483)) {
                        if (!((double) f >= 0.7853981633974483) || !((double) f <= 1.5707963267948966)) {
                            if ((double) f >= 1.5707963267948966 && (double) f <= 2.356194490192345) {
                                AbstractBuffer.anInt4265 = ShaderProgramSub2.anInt6212 + -i;
                                Component221.anInt1796 = i_12_;
                            } else if ((double) f >= 2.356194490192345 && (double) f <= 3.141592653589793) {
                                AbstractBuffer.anInt4265 = i_12_;
                                Component221.anInt1796 = -i + DefinitionSub6.anInt9139;
                            }
                        } else {
                            Component221.anInt1796 = -i_12_ + DefinitionSub6.anInt9139;
                            AbstractBuffer.anInt4265 = -i + ShaderProgramSub2.anInt6212;
                        }
                    } else {
                        Component221.anInt1796 = -i + DefinitionSub6.anInt9139;
                        AbstractBuffer.anInt4265 = -i_12_ + ShaderProgramSub2.anInt6212;
                    }
                } else {
                    Component221.anInt1796 = i;
                    AbstractBuffer.anInt4265 = ShaderProgramSub2.anInt6212 - i_12_;
                }
            } else {
                Component221.anInt1796 = DefinitionSub6.anInt9139 - i_12_;
                AbstractBuffer.anInt4265 = i;
            }
        } else {
            AbstractBuffer.anInt4265 = i;
            Component221.anInt1796 = i_12_;
        }
        AbstractBuffer.anInt4265 &= DisplayModeManagerContainer356.anInt6325;
        Component221.anInt1796 &= CustomCursorSetting.anInt6076;
    }
}
