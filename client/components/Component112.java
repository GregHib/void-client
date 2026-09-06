/* Component112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Component112
/**
 * RENAMED from `Class314` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    /** Camera yaw in 0..16384 units (wraps in {@code clampCameraAngles}). */
    static float cameraYaw = 0.0F;
    static int anInt3939;
    static int anInt3940;
    static int anInt3941;
    static int anInt3942;
    static float aFloat3943;

    public Component112() {
        /* empty */
    }

        /** Download/load percent for group {@code i_0_} (0..100). */
    abstract int getGroupLoadPercent(int i, int i_0_);

    static final void method2336(ObjectDefinition class51, int i, int i_1_, int i_2_, int i_3_) {
        anInt3940++;
        if (i_3_ > -126) anInt3941 = 15;
        for (SceneNode class348_sub9 = (SceneNode) SceneManager.aClass262_2859.first(4); class348_sub9 != null; class348_sub9 = (SceneNode) SceneManager.aClass262_2859.next((byte) 123)) {
            if (i_2_ == class348_sub9.anInt6693 && (class348_sub9.anInt6678 == i << 9) && (i_1_ << 9 == class348_sub9.anInt6689) && (class348_sub9.aClass51_6695.anInt941 == class51.anInt941)) {
                if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                    PlayerState.aClass348_Sub16_Sub4_7065.method2880(class348_sub9.aClass348_Sub16_Sub5_6676);
                    class348_sub9.aClass348_Sub16_Sub5_6676 = null;
                }
                if (class348_sub9.aClass348_Sub16_Sub5_6673 != null) {
                    PlayerState.aClass348_Sub16_Sub4_7065.method2880(class348_sub9.aClass348_Sub16_Sub5_6673);
                    class348_sub9.aClass348_Sub16_Sub5_6673 = null;
                }
                class348_sub9.unlink((byte) 125);
                break;
            }
        }
    }

    static final float method2337(float f, boolean bool, float f_4_, float f_5_) {
        if (bool != true) method2337(-0.96692735F, false, 0.1946915F, -1.0497112F);
        anInt3942++;
        return f + (-f + f_4_) * f_5_;
    }

        /** Prefetch packed group {@code i_6_}. */
    abstract void requestGroup(byte i, int i_6_);

        /** Raw packed bytes for group {@code i}. */
    abstract byte[] getGroupData(int i, byte i_7_);

        /** Load/parse the archive reference table, or null if not ready. */
    abstract ReferenceTable getReferenceTable(byte i);
}
