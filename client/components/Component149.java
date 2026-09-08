/* Component149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component149
/**
 * RENAMED from `Class362` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    /** Font for debug overlay lines (Dynamic/Occluders/…); set via {@code setDebugOverlayFont}. */
    static BitmapFont debugOverlayFont;
    static int anInt4457;
    /**
     * Cursor def id from the hovered interface component ({@code anInt719}),
     * or {@code -1}. Second fallback in the draw-loop cursor resolve chain.
     */
    static int widgetCursorId = -1;
    static int anInt4459;
    static Component191 aClass183_4460;

    static final void method3511(boolean bool, BitmapFont class324, Component184 class143, String string, int i, GraphicsToolkit var_ha) {
        try {
            if (i != 2) debugOverlayFont = null;
            anInt4457++;
            boolean bool_0_ = !DisplayModeManagerContainer61.aBoolean3763 || Component135.method3490(true);
            if (bool_0_) {
                if (DisplayModeManagerContainer61.aBoolean3763 && bool_0_) {
                    class143 = Component337.aClass143_3649;
                    class324 = var_ha.method3686(class143, (Component305.aClass207Array9929), true);
                    int i_1_ = class143.method1187(string, false, 250, null);
                    int i_2_ = class143.method1185(null, i ^ 0x2, class143.ascent, 250, string);
                    int i_3_ = NodeSub7.aClass207_6643.anInt2702;
                    int i_4_ = i_3_ + 4;
                    i_2_ += 2 * i_4_;
                    i_1_ += 2 * i_4_;
                    if (i_2_ < Component209.anInt3451) i_2_ = Component209.anInt3451;
                    if (i_1_ < Component156.anInt3704) i_1_ = Component156.anInt3704;
                    int i_5_ = (Component181.aClass221_1542.method1607(DisplayModeManagerContainer23.canvasWidth, i_1_, (byte) -107) - -Component200.anInt3712);
                    int i_6_ = (Component139.aClass341_6128.getAlignedOffset(GlToolkitSub2.canvasHeight, i_2_, 1595) + Component272.anInt5871);
                    if (Component210.gameCanvasAttached) {
                        i_5_ += BufferCacheSub3.method4008((byte) -124);
                        i_6_ += Component110.method260(false);
                    }
                    var_ha.method3691(DisplayModeManagerContainer67.aClass207_1727, false).method965((PrimitiveTypeDefinition.aClass207_9090.anInt2702) + i_5_, (PrimitiveTypeDefinition.aClass207_9090.anInt2696) + i_6_, -(2 * (PrimitiveTypeDefinition.aClass207_9090.anInt2702)) + i_1_, -((PrimitiveTypeDefinition.aClass207_9090.anInt2696) * 2) + i_2_, 1, 0, 0);
                    var_ha.method3691(PrimitiveTypeDefinition.aClass207_9090, true).drawAt(i_5_, i_6_);
                    PrimitiveTypeDefinition.aClass207_9090.method1518();
                    var_ha.method3691(PrimitiveTypeDefinition.aClass207_9090, true).drawAt(i_5_ + i_1_ - i_3_, i_6_);
                    PrimitiveTypeDefinition.aClass207_9090.method1514();
                    var_ha.method3691(PrimitiveTypeDefinition.aClass207_9090, true).drawAt(i_5_ - -i_1_ + -i_3_, -i_3_ + (i_6_ - -i_2_));
                    PrimitiveTypeDefinition.aClass207_9090.method1518();
                    var_ha.method3691(PrimitiveTypeDefinition.aClass207_9090, true).drawAt(i_5_, -i_3_ + i_6_ - -i_2_);
                    PrimitiveTypeDefinition.aClass207_9090.method1514();
                    var_ha.method3691(NodeSub7.aClass207_6643, true).method972(i_5_, (PrimitiveTypeDefinition.aClass207_9090.anInt2696) + i_6_, i_3_, -(2 * (PrimitiveTypeDefinition.aClass207_9090.anInt2696)) + i_2_);
                    NodeSub7.aClass207_6643.method1520();
                    var_ha.method3691(NodeSub7.aClass207_6643, true).method972((PrimitiveTypeDefinition.aClass207_9090.anInt2702) + i_5_, i_6_, -((PrimitiveTypeDefinition.aClass207_9090.anInt2702) * 2) + i_1_, i_3_);
                    NodeSub7.aClass207_6643.method1520();
                    var_ha.method3691(NodeSub7.aClass207_6643, true).method972(i_5_ - -i_1_ + -i_3_, (PrimitiveTypeDefinition.aClass207_9090.anInt2696) + i_6_, i_3_, -(2 * (PrimitiveTypeDefinition.aClass207_9090.anInt2696)) + i_2_);
                    NodeSub7.aClass207_6643.method1520();
                    var_ha.method3691(NodeSub7.aClass207_6643, true).method972((PrimitiveTypeDefinition.aClass207_9090.anInt2702) + i_5_, -i_3_ + i_6_ - -i_2_, -(2 * (PrimitiveTypeDefinition.aClass207_9090.anInt2702)) + i_1_, i_3_);
                    NodeSub7.aClass207_6643.method1520();
                    class324.method2584(null, 0, -1, null, ~0xffffff | Component328.anInt1479, 1, i_2_ + -(i_4_ * 2), null, i_6_ + i_4_, 0, 0, -(2 * i_4_) + i_1_, i_5_ + i_4_, false, 1, string);
                    Component354.method226(i_5_, i_1_, i_6_, i ^ 0x2, i_2_);
                } else {
                    int i_7_ = class143.method1187(string, false, 250, null);
                    int i_8_ = class143.method1190(null, 1, string, 250) * 13;
                    int i_9_ = 4;
                    int i_10_ = 6 - -i_9_;
                    int i_11_ = i_9_ + 6;
                    var_ha.fillRect2D(i_10_ + -i_9_, i_11_ + -i_9_, i_9_ + i_7_ + i_9_, i_8_ + (i_9_ - -i_9_), -16777216, 0);
                    var_ha.fillRect3D(i_10_ - i_9_, -i_9_ + i_11_, i_9_ + (i_7_ + i_9_), i_9_ + i_9_ + i_8_, -1, 0);
                    class324.method2584(null, 0, -1, null, -1, 1, i_8_, null, i_11_, 0, 0, i_7_, i_10_, false, 1, string);
                    Component354.method226(i_10_ - i_9_, i_9_ + i_7_ - -i_9_, i_11_ + -i_9_, i + -2, i_9_ + i_8_ - -i_9_);
                }
                if (bool) {
                    try {
                        if (!Component210.gameCanvasAttached) var_ha.method3689((byte) 118);
                        else CacheStore.method395(i + 79);
                    } catch (Exception_Sub1 exception_sub1) {
                        /* empty */
                    }
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("fg.A(" + bool + ',' + (class324 != null ? "{...}" : "null") + ',' + (class143 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + i + ',' + (var_ha != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method3512(int i) {
        aClass183_4460 = null;
        if (i != 4) widgetCursorId = 96;
        debugOverlayFont = null;
    }
}
