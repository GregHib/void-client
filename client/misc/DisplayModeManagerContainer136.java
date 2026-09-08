/* DisplayModeManagerContainer136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaclib.memory.Buffer;

final class DisplayModeManagerContainer136
/**
 * RENAMED from `Class135_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component137 (hierarchy)
 */ extends Component137 implements Interface2 {
    static int anInt4706;
    static Component183 aClass114_4707;
    private int anInt4708;
    static int[] anIntArray4709 = new int[2048];
    static int anInt4710;
    static int anInt4711;
    static int anInt4712;
    static int anInt4713;
    static int anInt4714;
    static int anInt4715;
    static int anInt4716;
    static int anInt4717;
    static int anInt4718;

    public final int method13(byte i) {
        anInt4706++;
        if (i != -97) method10(false);
        return anInt4708;
    }

    final void method1152(int i) {
        this.aHa_Sub2_1927.glBindArrayBuffer(91, this);
        if (i >= -78) method10(false);
        anInt4710++;
    }

    public final void method11(int i, int i_0_, byte[] is, int i_1_) {
        this.method1150(is, 0, i_0_);
        anInt4711++;
        anInt4708 = i;
        if (i_1_ != -9894) method12((byte) -37);
    }

    DisplayModeManagerContainer136(GlToolkitSub2 var_ha_Sub2, int i, byte[] is, int i_2_, boolean bool) {
        super(var_ha_Sub2, 34962, is, i_2_, bool);
        try {
            anInt4708 = i;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("jt.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + (is != null ? "{...}" : "null") + ',' + i_2_ + ',' + bool + ')'));
        }
    }

    DisplayModeManagerContainer136(GlToolkitSub2 var_ha_Sub2, int i, Buffer buffer, int i_3_, boolean bool) {
        super(var_ha_Sub2, 34962, buffer, i_3_, bool);
        try {
            anInt4708 = i;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("jt.<init>(" + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + i + ',' + (buffer != null ? "{...}" : "null") + ',' + i_3_ + ',' + bool + ')'));
        }
    }

    static final void method1153(GraphicsToolkit var_ha, int i) {
        anInt4713++;
        int i_4_ = 0;
        int i_5_ = 0;
        if (Component210.gameCanvasAttached) {
            i_4_ = BufferCacheSub3.method4008((byte) -122);
            i_5_ = Component110.method260(false);
        }
        int i_6_ = i_4_ + anInt4717;
        int i_7_ = DefinitionGroup.anInt9532 + i_5_;
        int i_8_ = Component227.anInt1117;
        int i_9_ = -3 + Component251.anInt5819;
        int i_10_ = 20;
        Component201.method2270(Component227.anInt1117, i_4_ + anInt4717, var_ha, FriendsIgnoreList.aClass274_3507.getLocalized(ObjectDeserializer.languageId, i + 528), false, i_5_ + DefinitionGroup.anInt9532, Component251.anInt5819, i_10_);
        int i_11_ = i_4_ + AbstractGlTextureSub4.mouseHandler.getCursorX(true);
        if (i != 16) method1154((byte) 9);
        int i_12_ = i_5_ + AbstractGlTextureSub4.mouseHandler.getCursorY((byte) 95);
        if (PauseHandler.aBoolean9535) {
            int i_15_ = 0;
            for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.first(-73)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.next((byte) 61))) {
                int i_16_ = 16 * i_15_ + i_7_ - (-i_10_ + -13);
                if (i_4_ + anInt4717 < i_11_ && i_11_ < Component227.anInt1117 + (i_4_ + anInt4717) && i_12_ > -13 + i_16_ && i_16_ - -4 > i_12_ && ((class348_sub42_sub13.anInt9615) > 1 || ((MenuEntry) class348_sub42_sub13.aClass107_9621.sentinel.next).aBoolean9610))
                    var_ha.fillRect2D(anInt4717 + i_4_, -12 + i_16_, Component227.anInt1117, 16, (255 + -HashNodeSub4.anInt9511 << 24) | Component235.anInt3374, 1);
                i_15_++;
            }
            if (Component359.aClass348_Sub42_Sub13_3152 != null) {
                i_15_ = 0;
                Component201.method2270(NodeSub1Sub1.anInt8806, DisplayModeManagerContainer368.anInt5252, var_ha, (Component359.aClass348_Sub42_Sub13_3152.aString9617), false, MouseHandler.menuOriginY, DisplayModeManagerContainer249.anInt4669, i_10_);
                for (MenuEntry class348_sub42_sub12 = ((MenuEntry) Component359.aClass348_Sub42_Sub13_3152.aClass107_9621.first(-44)); class348_sub42_sub12 != null; class348_sub42_sub12 = ((MenuEntry) Component359.aClass348_Sub42_Sub13_3152.aClass107_9621.next((byte) 71))) {
                    int i_17_ = i_15_ * 16 + (MouseHandler.menuOriginY + i_10_ - -13);
                    if (DisplayModeManagerContainer368.anInt5252 < i_11_ && (DisplayModeManagerContainer368.anInt5252 - -NodeSub1Sub1.anInt8806) > i_11_ && -13 + i_17_ < i_12_ && i_17_ - -4 > i_12_ && (class348_sub42_sub12.aBoolean9610))
                        var_ha.fillRect2D(DisplayModeManagerContainer368.anInt5252, i_17_ - 12, NodeSub1Sub1.anInt8806, 16, (-HashNodeSub4.anInt9511 + 255 << 24) | Component235.anInt3374, 1);
                    i_15_++;
                }
                DisplayModeManagerContainer26.method826(i_10_, DisplayModeManagerContainer368.anInt5252, NodeSub1Sub1.anInt8806, DisplayModeManagerContainer249.anInt4669, 125, MouseHandler.menuOriginY, var_ha);
            }
        } else {
            int i_13_ = 0;
            for (MenuEntry class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.first(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 101)) {
                int i_14_ = (16 * (-1 + (DisplayModeManagerContainer306.menuEntryCount - i_13_)) + 13 + (i_7_ + i_10_));
                if (i_11_ > anInt4717 - -i_4_ && anInt4717 + i_4_ - -Component227.anInt1117 > i_11_ && i_12_ > i_14_ - 13 && 4 + i_14_ > i_12_ && (class348_sub42_sub12.aBoolean9610))
                    var_ha.fillRect2D(i_4_ + anInt4717, -12 + i_14_, Component227.anInt1117, 16, (255 + -HashNodeSub4.anInt9511 << 24) | Component235.anInt3374, 1);
                i_13_++;
            }
        }
        DisplayModeManagerContainer26.method826(i_10_, anInt4717 + i_4_, Component227.anInt1117, Component251.anInt5819, -75, DefinitionGroup.anInt9532 - -i_5_, var_ha);
        if (PauseHandler.aBoolean9535) {
            int i_20_ = 0;
            for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.first(-77)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.next((byte) 111))) {
                int i_21_ = i_10_ + (i_5_ + DefinitionGroup.anInt9532 + 13 - -(16 * i_20_));
                i_20_++;
                if (class348_sub42_sub13.anInt9615 == 1)
                    RenderableSub2.method2494(DefinitionGroup.anInt9532 - -i_5_, ~0xffffff | Component2.anInt8363, i_21_, var_ha, ((MenuEntry) class348_sub42_sub13.aClass107_9621.sentinel.next), Component227.anInt1117, i_12_, StringDefinition.anInt9586 | ~0xffffff, (byte) 125, Component251.anInt5819, anInt4717 - -i_4_, i_11_);
                else DisplayModeManagerContainer58.method2431(~0xffffff | StringDefinition.anInt9586, i_21_, class348_sub42_sub13, i_11_, Component227.anInt1117, ~0xffffff | Component2.anInt8363, i_12_, var_ha, DefinitionGroup.anInt9532 - -i_5_, i ^ 0x60, i_4_ + anInt4717, Component251.anInt5819);
            }
            if (Component359.aClass348_Sub42_Sub13_3152 != null) {
                i_20_ = 0;
                for (MenuEntry class348_sub42_sub12 = ((MenuEntry) Component359.aClass348_Sub42_Sub13_3152.aClass107_9621.first(-118)); class348_sub42_sub12 != null; class348_sub42_sub12 = ((MenuEntry) Component359.aClass348_Sub42_Sub13_3152.aClass107_9621.next((byte) 111))) {
                    int i_22_ = i_20_ * 16 + 13 + (MouseHandler.menuOriginY + i_10_);
                    i_20_++;
                    RenderableSub2.method2494(MouseHandler.menuOriginY, Component2.anInt8363 | ~0xffffff, i_22_, var_ha, class348_sub42_sub12, NodeSub1Sub1.anInt8806, i_12_, (StringDefinition.anInt9586 | ~0xffffff), (byte) 127, DisplayModeManagerContainer249.anInt4669, DisplayModeManagerContainer368.anInt5252, i_11_);
                }
                Component9.method2642(NodeSub1Sub1.anInt8806, MouseHandler.menuOriginY, true, DisplayModeManagerContainer368.anInt5252, DisplayModeManagerContainer249.anInt4669);
            }
        } else {
            int i_18_ = 0;
            for (MenuEntry class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.first(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 71)) {
                int i_19_ = (i_7_ - -i_10_ - (-13 - (DisplayModeManagerContainer306.menuEntryCount + (-1 + -i_18_)) * 16));
                i_18_++;
                RenderableSub2.method2494(i_7_, ~0xffffff | Component2.anInt8363, i_19_, var_ha, class348_sub42_sub12, i_8_, i_12_, (~0xffffff | StringDefinition.anInt9586), (byte) 125, i_9_, i_6_, i_11_);
            }
        }
        Component9.method2642(Component227.anInt1117, DefinitionGroup.anInt9532 - -i_5_, true, i_4_ + anInt4717, Component251.anInt5819);
    }

    public final int method10(boolean bool) {
        anInt4714++;
        if (bool != true) method12((byte) -54);
        return this.anInt1929;
    }

    public static void method1154(byte i) {
        int i_23_ = -93 / ((i - -75) / 36);
        anIntArray4709 = null;
        aClass114_4707 = null;
    }

    public final long method12(byte i) {
        if (i != 42) aClass114_4707 = null;
        anInt4712++;
        return 0L;
    }

    static {
        aClass114_4707 = new Component183(39, 8);
        anInt4718 = 0;
    }
}
