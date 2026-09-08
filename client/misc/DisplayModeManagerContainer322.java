/* DisplayModeManagerContainer322 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer322
/**
 * RENAMED from `Class347` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static boolean aBoolean4278 = true;
    int anInt4279;
    static int anInt4280;
    static byte[][] aByteArrayArray4281;
    int anInt4282;
    int anInt4283;
    static boolean aBoolean4284 = false;

    public DisplayModeManagerContainer322() {
        /* empty */
    }

    public static void method2707(boolean bool) {
        aByteArrayArray4281 = null;
        if (bool != false) method2708(57);
    }

    static final void method2708(int i) {
        Component111.markInterfaceDirty(-9343, Component156.aClass46_3701);
        anInt4280++;
        RenderableObject.anInt6392++;
        if (!Cp1252Decoder.aBoolean5221 || !Component162.aBoolean8386) {
            if (RenderableObject.anInt6392 > 1) Component156.aClass46_3701 = null;
        } else {
            int i_0_ = 0;
            int i_1_ = 0;
            if (Component210.gameCanvasAttached) {
                i_0_ = BufferCacheSub3.method4008((byte) -124);
                i_1_ = Component110.method260(false);
            }
            int i_2_ = i_0_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true);
            int i_3_ = i_1_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 80);
            i_3_ -= Component386.anInt2872;
            i_2_ -= RenderableSub4.anInt6411;
            if (i_2_ < DefinitionSub37.anInt9461) i_2_ = DefinitionSub37.anInt9461;
            if (i == -30206) {
                if (i_2_ - -Component156.aClass46_3701.width > (DefinitionSub37.anInt9461 - -Component374.aClass46_4130.width)) i_2_ = (Component374.aClass46_4130.width + (DefinitionSub37.anInt9461 + -Component156.aClass46_3701.width));
                if (i_3_ < DisplayModeManagerContainer172.anInt558) i_3_ = DisplayModeManagerContainer172.anInt558;
                if (Component156.aClass46_3701.height + i_3_ > (DisplayModeManagerContainer172.anInt558 - -Component374.aClass46_4130.height)) i_3_ = (-Component156.aClass46_3701.height + (DisplayModeManagerContainer172.anInt558 - -Component374.aClass46_4130.height));
                int i_4_ = (-DefinitionSub37.anInt9461 + (i_2_ - -Component374.aClass46_4130.scrollX));
                int i_5_ = (-DisplayModeManagerContainer172.anInt558 + (i_3_ + Component374.aClass46_4130.scrollY));
                if (AbstractGlTextureSub4.mouseHandler.isAnyButtonDown(94)) {
                    if (Component156.aClass46_3701.anInt703 < RenderableObject.anInt6392) {
                        int i_6_ = i_2_ + -GlToolkitSub3.anInt8001;
                        int i_7_ = -DefinitionSub13.anInt9203 + i_3_;
                        if (Component156.aClass46_3701.anInt729 < i_6_ || (-Component156.aClass46_3701.anInt729 > i_6_) || (i_7_ > Component156.aClass46_3701.anInt729) || i_7_ < -Component156.aClass46_3701.anInt729) Component189.aBoolean3819 = true;
                    }
                    if ((Component156.aClass46_3701.anObjectArray823 != null) && Component189.aBoolean3819) {
                        NodeSub36 class348_sub36 = new NodeSub36();
                        class348_sub36.aClass46_6989 = Component156.aClass46_3701;
                        class348_sub36.anInt6984 = i_4_;
                        class348_sub36.anObjectArray6987 = (Component156.aClass46_3701.anObjectArray823);
                        class348_sub36.anInt6995 = i_5_;
                        ClientScriptExecutor.runHook(class348_sub36);
                    }
                } else {
                    if (Component189.aBoolean3819) {
                        DisplayModeManagerContainer196.method2678(-2049);
                        if (Component156.aClass46_3701.anObjectArray692 != null) {
                            NodeSub36 class348_sub36 = new NodeSub36();
                            class348_sub36.aClass46_6983 = DisplayModeManagerContainer104.aClass46_10336;
                            class348_sub36.anInt6984 = i_4_;
                            class348_sub36.anObjectArray6987 = (Component156.aClass46_3701.anObjectArray692);
                            class348_sub36.anInt6995 = i_5_;
                            class348_sub36.aClass46_6989 = Component156.aClass46_3701;
                            ClientScriptExecutor.runHook(class348_sub36);
                        }
                        if (DisplayModeManagerContainer104.aClass46_10336 != null && (client.getAncestorComponent(Component156.aClass46_3701) != null)) Component245.method173(-67, Component156.aClass46_3701, (DisplayModeManagerContainer104.aClass46_10336));
                    } else if ((Component203.anInt8770 == 1 || Component203.method2485(-113)) && DisplayModeManagerContainer306.menuEntryCount > 2) Component2.method191(true, (GlToolkitSub3.anInt8001 + RenderableSub4.anInt6411), (Component386.anInt2872 - -(DefinitionSub13.anInt9203)));
                    else if (MatrixSub1.method913((byte) 127)) Component2.method191(true, (GlToolkitSub3.anInt8001 + RenderableSub4.anInt6411), (Component386.anInt2872 + (DefinitionSub13.anInt9203)));
                    Component156.aClass46_3701 = null;
                }
            }
        }
    }
}
