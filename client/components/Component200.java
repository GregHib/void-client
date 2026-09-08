/* Component200 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component200
/**
 * RENAMED from `Class290` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static boolean aBoolean3706;
    static int anInt3707;
    Interface5_Impl1 anInterface5_Impl1_3708;
    boolean aBoolean3709;
    static float aFloat3710;
    Interface5_Impl1 anInterface5_Impl1_3711;
    static int anInt3712;
    static int anInt3713 = 0;
    boolean aBoolean3714;
    static int anInt3715;
    static int anInt3716;
    static int anInt3717 = 1338;
    static int anInt3718;

    final void method2195(boolean bool) {
        if (this.anInterface5_Impl1_3708 != null) this.anInterface5_Impl1_3708.method21(23315);
        anInt3715++;
        this.aBoolean3714 = bool;
    }

    static final void method2196(byte i) {
        Component372.anInt6043 = (int) ((double) AbstractShaderSub4.anInt7319 * 34.46);
        ObjectDeserializer.anInt6964 = 200;
        anInt3716++;
        if (i == -9) {
            Component372.anInt6043 <<= 2;
            if (NodeSub8.toolkit.method3670()) Component372.anInt6043 += 512;
            Component127.method1626(1, false);
        }
        Component372.anInt6043 = (int) (Component372.anInt6043 * Loader.CULLING_DISTANCE_MULTIPLIER);
    }

    final boolean method2197(byte i) {
        if (i >= -4) method2195(true);
        anInt3718++;
        return this.aBoolean3714 && !this.aBoolean3709;
    }

    Component200(boolean bool) {
        this.aBoolean3709 = bool;
    }
}
