/* Component233 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component233
/**
 * RENAMED from `Class320` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static short aShort3992 = 320;
    static int anInt3993;
    static int zoomStep = Loader.ZOOM_OFFSET_DEFAULT;
    static boolean overGameScreen = false;
    static int scrollWheelDiff = 0;
    static float aFloat3994;

    static final boolean method2547(int i, byte i_0_) {
        anInt3993++;
        if (ImageTagText.aBooleanArray2162[i]) return true;
        if (!Component267.aClass45_2978.isGroupReady((byte) -124, i)) return false;
        int i_1_ = Component267.aClass45_2978.getFileCount(0, i);
        if (i_1_ == 0) {
            ImageTagText.aBooleanArray2162[i] = true;
            return true;
        }
        if (DefinitionSub33.openInterfaces[i] == null) DefinitionSub33.openInterfaces[i] = new DisplayModeManagerContainer57[i_1_];
        for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
            if (DefinitionSub33.openInterfaces[i][i_2_] == null) {
                byte[] is = Component267.aClass45_2978.getFile(i_0_ ^ ~0x717, i, i_2_);
                if (is != null) {
                    DisplayModeManagerContainer57 class46 = (DefinitionSub33.openInterfaces[i][i_2_] = new DisplayModeManagerContainer57());
                    class46.packedId = i_2_ + (i << 16);
                    if (is[0] != -1) throw new IllegalStateException("if1");
                    class46.decode(new Buffer(is), true);
                }
            }
        }
        if (i_0_ != 84) aFloat3994 = -0.8522395F;
        ImageTagText.aBooleanArray2162[i] = true;
        return true;
    }
}
