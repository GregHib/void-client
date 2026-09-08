/* AbstractShader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class367` (JODE-obfuscated).
 * Abstract GPU shader/program base. Holds a GlToolkitSub3 toolkit reference (aHa_Sub3_4479) and declares abstract shader lifecycle methods (method3520/method3521); concrete GL and D3D variants implement it.
 */

abstract class AbstractShader {
    static int anInt4478;
    GlToolkitSub3 aHa_Sub3_4479;
    static int anInt4480;
    static int anInt4481;
    static int anInt4482;
    static int anInt4483;
    static int anInt4484;
    static int anInt4485;

    abstract void method3520(byte i);

    abstract void method3521(boolean bool, byte i);

    void method3522(int i) {
        anInt4484++;
        if (i != -16252) method3531(false);
    }

    void method3523(byte i) {
        if (i != 12) method3528(5);
        anInt4482++;
    }

    AbstractShader(GlToolkitSub3 var_ha_Sub3) {
        this.aHa_Sub3_4479 = var_ha_Sub3;
    }

    void method3524(int i) {
        anInt4483++;
        if (i != -14775) this.aHa_Sub3_4479 = null;
    }

    abstract void method3525(int i, boolean bool);

    abstract void method3526(int i, int i_0_, int i_1_);

    abstract void method3527(int i, Interface18 interface18, int i_2_);

    void method3528(int i) {
        if (i < 45) this.aHa_Sub3_4479 = null;
        anInt4481++;
    }

    static final RenderableSub6 method3529(int i) {
        anInt4478++;
        RenderableSub6 class318_sub6 = (RenderableSub6) Component240.aClass243_1114.method1875(60);
        if (i != 32564) method3529(-38);
        if (class318_sub6 != null) {
            Component6.anInt4474--;
            return class318_sub6;
        }
        return new RenderableSub6();
    }

    abstract boolean method3530(int i);

    void method3531(boolean bool) {
        anInt4480++;
        if (bool != false) this.aHa_Sub3_4479 = null;
    }

    void method3532(int i) {
        if (i == 10425) anInt4485++;
    }
}
