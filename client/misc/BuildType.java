/* BuildType - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from {@code Class231} (JODE-obfuscated).
 * Client build channel: {@link Component342#LIVE}, {@link DefinitionSub20#RC}, {@link Component118#WIP}.
 * Selected via applet {@code modewhat} / CLI; {@link #id} is 0/1/2.
 */
final class BuildType {
    static int anInt2990;
    static int anInt2991;
    static int anInt2992;
    static ReflectionInvoker aClass297_2993;
    static int anInt2994;
    /** 0=LIVE, 1=RC, 2=WIP. */
    int id;
    static int anInt2996;
    static int anInt2997;

    static final float[] method1638(int i, float[] fs, int i_0_) {
        anInt2990++;
        if (i_0_ != -1) aClass297_2993 = null;
        float[] fs_1_ = new float[i];
        Component313.method1574(fs, 0, fs_1_, 0, i);
        return fs_1_;
    }

    public final String toString() {
        anInt2992++;
        throw new IllegalStateException();
    }

    static final boolean method1639(int i, int i_2_) {
        if (i_2_ != 14634) method1638(-102, null, 28);
        anInt2994++;
        return i >= 12 && i <= 17;
    }

    /** {@link #id}. */
    final int getId(int i) {
        if (i != 0) return -76;
        anInt2991++;
        return this.id;
    }

    public static void method1641(byte i) {
        aClass297_2993 = null;
        if (i != 85) aClass297_2993 = null;
    }

    static final void method1642(byte i, GraphicsToolkit var_ha) {
        anInt2997++;
        int i_3_ = 0;
        int i_4_ = 0;
        if (Component210.gameCanvasAttached) {
            i_3_ = BufferCacheSub3.method4008((byte) -124);
            i_4_ = Component110.method260(false);
        }
        int i_5_ = -10660793;
        StaticElementRenderer.method2509(Component227.anInt1117, DefinitionGroup.anInt9532 - -i_4_, var_ha, DisplayModeManagerContainer136.anInt4717 - -i_3_, i_5_, true, Component251.anInt5819, -16777216);
        if (i > 98) {
            NodeList.aClass324_3326.drawText(FriendsIgnoreList.aClass274_3507.getLocalized(ObjectDeserializer.languageId, 544), i_5_, i_4_ + (DefinitionGroup.anInt9532 - -14), i_3_ + (DisplayModeManagerContainer136.anInt4717 + 3), -1, -125);
            int i_6_ = AbstractGlTextureSub4.mouseHandler.getCursorX(true) - -i_3_;
            int i_7_ = i_4_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 127);
            if (PauseHandler.aBoolean9535) {
                int i_8_ = 0;
                for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.first(-119)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.next((byte) 44))) {
                    int i_9_ = (31 + i_4_ + DefinitionGroup.anInt9532 + i_8_ * 16);
                    i_8_++;
                    if ((class348_sub42_sub13.anInt9615) == 1)
                        RenderableSub2.method2494(i_4_ + DefinitionGroup.anInt9532, -256, i_9_, var_ha, ((MenuEntry) (class348_sub42_sub13.aClass107_9621.sentinel.next)), Component227.anInt1117, i_7_, -1, (byte) 124, Component251.anInt5819, DisplayModeManagerContainer136.anInt4717 - -i_3_, i_6_);
                    else DisplayModeManagerContainer58.method2431(-1, i_9_, class348_sub42_sub13, i_6_, Component227.anInt1117, -256, i_7_, var_ha, DefinitionGroup.anInt9532 + i_4_, 126, DisplayModeManagerContainer136.anInt4717 - -i_3_, Component251.anInt5819);
                }
                if (Component359.aClass348_Sub42_Sub13_3152 != null) {
                    StaticElementRenderer.method2509(NodeSub1Sub1.anInt8806, MouseHandler.menuOriginY, var_ha, DisplayModeManagerContainer368.anInt5252, i_5_, true, DisplayModeManagerContainer249.anInt4669, -16777216);
                    i_8_ = 0;
                    NodeList.aClass324_3326.drawText(Component359.aClass348_Sub42_Sub13_3152.aString9617, i_5_, MouseHandler.menuOriginY - -14, 3 + DisplayModeManagerContainer368.anInt5252, -1, -126);
                    for (MenuEntry class348_sub42_sub12 = ((MenuEntry) Component359.aClass348_Sub42_Sub13_3152.aClass107_9621.first(-84)); class348_sub42_sub12 != null; class348_sub42_sub12 = ((MenuEntry) Component359.aClass348_Sub42_Sub13_3152.aClass107_9621.next((byte) 73))) {
                        int i_10_ = 31 + (MouseHandler.menuOriginY + i_8_ * 16);
                        i_8_++;
                        RenderableSub2.method2494(MouseHandler.menuOriginY, -256, i_10_, var_ha, class348_sub42_sub12, NodeSub1Sub1.anInt8806, i_7_, -1, (byte) 125, DisplayModeManagerContainer249.anInt4669, DisplayModeManagerContainer368.anInt5252, i_6_);
                    }
                    Component9.method2642(NodeSub1Sub1.anInt8806, MouseHandler.menuOriginY, true, DisplayModeManagerContainer368.anInt5252, DisplayModeManagerContainer249.anInt4669);
                }
            } else {
                int i_11_ = 0;
                for (MenuEntry class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.first(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 55)) {
                    int i_12_ = 31 + (i_4_ + DefinitionGroup.anInt9532 - -((-i_11_ + -1 + DisplayModeManagerContainer306.menuEntryCount) * 16));
                    RenderableSub2.method2494(i_4_ + DefinitionGroup.anInt9532, -256, i_12_, var_ha, class348_sub42_sub12, Component227.anInt1117, i_7_, -1, (byte) 124, Component251.anInt5819, DisplayModeManagerContainer136.anInt4717 - -i_3_, i_6_);
                    i_11_++;
                }
            }
            Component9.method2642(Component227.anInt1117, DefinitionGroup.anInt9532 - -i_4_, true, DisplayModeManagerContainer136.anInt4717 + i_3_, Component251.anInt5819);
        }
    }

    /** {@code string} is label only (LIVE/RC/WIP); stored key is {@code i}. */
    BuildType(String string, int i) {
        this.id = i;
    }
}
