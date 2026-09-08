/* DisplayModeManagerContainer199 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer199
/**
 * RENAMED from `Class239_Sub2` (JODE-obfuscated).
 * Evidence: subclass of Component339 (hierarchy)
 */ extends Component339 {
    static int anInt5851;
    static int anInt5852;
    static int anInt5853;
    static int anInt5854;
    static int anInt5855;
    static int anInt5856;
    static Component24[] aClass105Array5857;

    final int getValue(int i, int i_0_) {
        anInt5851++;
        if (i != 3) return -26;
        return 3;
    }

    final void validateValue(boolean bool) {
        anInt5854++;
        this.preferenceValue = getDefaultValue(20014);
        if (bool != false) aClass105Array5857 = null;
    }

    final int getDefaultValue(int i) {
        if (i != 20014) validateValue(true);
        anInt5853++;
        if (!this.preferences.method3425(-76)) return 0;
        return 1;
    }

    DisplayModeManagerContainer199(NodeSub51 class348_sub51) {
        super(class348_sub51);
    }

    public static void method1724(int i) {
        aClass105Array5857 = null;
        if (i != -4) aClass105Array5857 = null;
    }

    /**
     * Clamp camera pitch to the allowed range and wrap yaw into 0..16384.
     * Also samples nearby terrain height for camera collision adjustments.
     */
    static final void clampCameraAngles(int i) {
        anInt5855++;
        int i_1_ = 1024;
        int i_2_ = 3072;
        if (DisplayModeManagerContainer50.aBoolean3870) {
            i_2_ = 4096;
            if (Component182.aBoolean9746) i_1_ = 2048;
        }
        if (DisplayModeManagerContainer154.cameraPitch < (float) i_1_) DisplayModeManagerContainer154.cameraPitch = (float) i_1_;
        if (DisplayModeManagerContainer154.cameraPitch > (float) i_2_) DisplayModeManagerContainer154.cameraPitch = (float) i_2_;
        for (/**/; Component112.cameraYaw >= 16384.0F; Component112.cameraYaw -= 16384.0F) {
            /* empty */
        }
        for (/**/; Component112.cameraYaw < 0.0F; Component112.cameraYaw += 16384.0F) {
            /* empty */
        }
        int i_3_ = DisplayModeManagerContainer273.cameraFocusX >> 9;
        int i_4_ = Component353.cameraFocusZ >> 9;
        int i_5_ = Component300.method2064(DisplayModeManagerContainer273.cameraFocusX, Component117.anInt4372, 11219, Component353.cameraFocusZ);
        int i_6_ = 0;
        if (i_3_ > 3 && i_4_ > 3 && -4 + AbstractShaderSub4.anInt7319 > i_3_ && ParametricDefinition.anInt9109 - 4 > i_4_) {
            for (int i_7_ = i_3_ - 4; i_3_ - -4 >= i_7_; i_7_++) {
                for (int i_8_ = -4 + i_4_; i_8_ <= 4 + i_4_; i_8_++) {
                    int i_9_ = Component117.anInt4372;
                    if (i_9_ < 3 && NpcComposition.method802(i_8_, i_7_, true)) i_9_++;
                    int i_10_ = 0;
                    if ((Component103.aClass237_Sub1_4197.aByteArrayArrayArray3104) != null && (Component103.aClass237_Sub1_4197.aByteArrayArrayArray3104[i_9_]) != null) i_10_ = 8 * ((Component103.aClass237_Sub1_4197.aByteArrayArrayArray3104[i_9_][i_7_][i_8_]) & 0xff) << 2;
                    if (ShaderSub1.aSArray5191 != null && ShaderSub1.aSArray5191[i_9_] != null) {
                        int i_11_ = (i_5_ + i_10_ + -ShaderSub1.aSArray5191[i_9_].getHeight((byte) -86, i_8_, i_7_));
                        if (i_6_ < i_11_) i_6_ = i_11_;
                    }
                }
            }
        }
        int i_12_ = 1536 * (i_6_ >> 2);
        if (i_12_ > 786432) i_12_ = 786432;
        if (i_12_ < i) i_12_ = 262144;
        if (NodeSub35.anInt6979 < i_12_) NodeSub35.anInt6979 += (i_12_ - NodeSub35.anInt6979) / 24;
        else if (NodeSub35.anInt6979 > i_12_) NodeSub35.anInt6979 += (-NodeSub35.anInt6979 + i_12_) / 80;
    }

    final void setValue(int i, int i_13_) {
        int i_14_ = 87 / ((82 - i) / 35);
        this.preferenceValue = i_13_;
        anInt5852++;
    }

    final int method1726(int i) {
        anInt5856++;
        if (i != -32350) aClass105Array5857 = null;
        return this.preferenceValue;
    }

    DisplayModeManagerContainer199(int i, NodeSub51 class348_sub51) {
        super(i, class348_sub51);
    }
}
