/* DisplayModeManagerContainer28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DisplayModeManagerContainer28
/**
 * RENAMED from `Class318_Sub1_Sub1` (JODE-obfuscated).
 * Evidence: subclass of RenderableObject (hierarchy)
 */ extends RenderableObject {
    static int anInt8721;
    static int anInt8722;
    static int anInt8723;
    static StringCache aClass351_8724 = new StringCache(50, -1);
    static float aFloat8725;
    static int anInt8726;
    short aShort8727;
    /** Accumulated positive skew when wall clock jumps backwards (monotonic offset). */
    static long clockSkewMillis;

    final boolean method2382(byte i) {
        if (i > -51) aClass351_8724 = null;
        anInt8723++;
        return ShaderSub2.method164(this.aByte6376, (this.x >> Component149.anInt4459), (byte) -97, (this.y >> Component149.anInt4459));
    }

    final int method2384(NodeSub1[] class348_sub1s, int i) {
        anInt8722++;
        int i_0_ = 88 % ((i - -14) / 61);
        return this.method2390(class348_sub1s, (this.x >> Component149.anInt4459), -2, (this.y >> Component149.anInt4459));
    }

    public static void method2395(byte i) {
        aClass351_8724 = null;
        if (i != 50) method2395((byte) 65);
    }

    static final void method2396(int i, int i_1_, int i_2_, int i_3_) {
        i <<= i_3_;
        anInt8726++;
        i_1_ <<= 3;
        i_2_ <<= 3;
        if (DefinitionSub21.cameraMode == 2) {
            Component298.anInt4638 = i_1_;
            Component103.anInt4186 = i_2_;
            HashNodeSub19.anInt9701 = i;
        }
        Component112.cameraYaw = (float) i_1_;
        DisplayModeManagerContainer154.cameraPitch = (float) i;
        DisplayModeManagerContainer199.clampCameraAngles(262144);
        DummyClass.aBoolean10174 = true;
    }

    DisplayModeManagerContainer28(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
        this.aByte6376 = (byte) i_7_;
        this.x = i;
        this.y = i_5_;
        this.aShort8727 = (short) i_8_;
        this.anInt6382 = i_4_;
        this.plane = (byte) i_6_;
    }

    final boolean method2378(int i) {
        if (i != 0) aClass351_8724 = null;
        anInt8721++;
        return (DisplayModeManagerContainer153.aBooleanArrayArray1572[(Component197.anInt10084 + -Component256.anInt6111 + (this.x >> Component149.anInt4459))][((this.y >> Component149.anInt4459) + -DebugPanicSub2.anInt8502 + Component197.anInt10084)]);
    }
}
