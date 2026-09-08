/* HashNodeSub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HashNodeSub20
/**
 * RENAMED from `Class348_Sub42_Sub20` (JODE-obfuscated).
 * Evidence: subclass of HashNode (hierarchy)
 */ extends HashNode {
    DisplayModeManagerContainer173 aClass342_9702;
    static int anInt9703;
    RadixParser aClass174_9704;
    int anInt9705;
    int anInt9706;
    int anInt9707;
    static int anInt9708;
    static int anInt9709;
    int anInt9710;
    static NodeList aClass262_9711 = new NodeList();
    int anInt9712;
    static int anInt9713;
    static int[] anIntArray9714 = {1, 2, 4, 8};
    static int anInt9715;

    final void method3279(int i) {
        this.anInt9706 = (this.aClass342_9702.anInt4239);
        anInt9708++;
        this.anInt9710 = (this.aClass342_9702.anInt4240);
        this.anInt9712 = (this.aClass342_9702.anInt4238);
        if ((this.aClass342_9702.aClass101_4252) != null) this.aClass342_9702.aClass101_4252.method905((this.aClass174_9704.anInt2291), (this.aClass174_9704.anInt2290), (this.aClass174_9704.anInt2294), NodeSub8.anIntArray6666);
        this.anInt9705 = NodeSub8.anIntArray6666[0];
        this.anInt9707 = NodeSub8.anIntArray6666[i];
    }

    public static void method3280(int i) {
        aClass262_9711 = null;
        anIntArray9714 = null;
        int i_0_ = 112 / ((i - 16) / 57);
    }

    static final void method3281(byte i, GraphicsToolkit var_ha) {
        if (Component364.aBoolean8335) DisplayModeManagerContainer165.method2288(false, var_ha);
        else DisplayModeManagerContainer96.method1077(var_ha, (byte) -123);
        anInt9709++;
        if (i < 29) method3280(81);
    }

    static final void method3282(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        NodeSub51.anInt7244 = i_6_;
        WorldNameText.anInt8633 = i_5_;
        Component54.anInt8668 = i_2_;
        ComponentSettings.anInt7092 = i;
        Component337.anInt3650 = i_4_;
        CookieBuilder.anInt620 = i_1_;
        if (i_3_ != 0) method3281((byte) 92, null);
        anInt9703++;
    }

    HashNodeSub20(DisplayModeManagerContainer173 class342, RenderableSub10 class318_sub10) {
        try {
            this.aClass342_9702 = class342;
            this.aClass174_9704 = this.aClass342_9702.method2685((byte) -13);
            method3279(2);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("jo.<init>(" + (class342 != null ? "{...}" : "null") + ',' + (class318_sub10 != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method3283(int i) {
        if (OggUrlStream.aClass297_8992.signed && (ShaderSub2.aClass161_5199.anInt2143 != -1)) OggUrlStream.method2972((ShaderSub2.aClass161_5199.aString2147), (ShaderSub2.aClass161_5199.anInt2143), -54);
        anInt9713++;
        int i_7_ = 9 / ((i - 60) / 50);
    }
}
