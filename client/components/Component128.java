/* Component128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Component128
/**
 * RENAMED from {@code Class61} (JODE-obfuscated).
 * OpenGL display-list helper for glyph/UI lists: {@link #beginDisplayList},
 * {@link #callDisplayList}, {@link #endDisplayList} around {@link #listBase}.
 */ {
    static int anInt1104;
    static int anInt1105;
    static int anInt1106;
    static int anInt1107;
    static int anInt1108;
    /** First GL list id from {@link OpenGL#glGenLists}. */
    private final int listBase;

    final void endDisplayList(int i) {
        anInt1108++;
        OpenGL.glEndList();
        if (i != -1) beginDisplayList((byte) -56, 72);
    }

    static final int method592(boolean bool, byte i, boolean bool_0_, int i_1_, int i_2_) {
        anInt1105++;
        if (i != -128) return -20;
        NodeSub13 class348_sub13 = AbstractGlTextureSub4.getContainerNode((byte) -1, i_1_, bool_0_);
        if (class348_sub13 == null) return 0;
        int i_3_ = 0;
        for (int i_4_ = 0; (class348_sub13.itemIds.length > i_4_); i_4_++) {
            if (class348_sub13.itemIds[i_4_] >= 0 && (Exception_Sub1.itemDefinitions.itemCount > class348_sub13.itemIds[i_4_])) {
                ItemDefinition class213 = (Exception_Sub1.itemDefinitions.getItemDefinition(-127, (class348_sub13.itemIds[i_4_])));
                int i_5_ = class213.method1567((MatrixSub3.aClass326_5764.method2600(i_2_, 28364).anInt3256), 107, i_2_);
                if (!bool) i_3_ += i_5_;
                else i_3_ += i_5_ * (class348_sub13.amounts[i_4_]);
            }
        }
        return i_3_;
    }

    /**
     * Build a {@link SocketConnector} for {@code host}:{@code port}, preferring
     * {@link ProxySocketConnector} and falling back to {@link DirectSocketConnector}.
     */
    static final SocketConnector createSocketConnector(int i, byte i_6_, String string) {
        anInt1104++;
        SocketConnector class272;
        try {
            class272 = new ProxySocketConnector();
        } catch (Throwable throwable) {
            class272 = new DirectSocketConnector();
        }
        if (i_6_ != -90) return null;
        class272.host = string;
        class272.port = i;
        return class272;
    }

    final void callDisplayList(char c, int i) {
        anInt1107++;
        OpenGL.glCallList(listBase - -c);
        if (i != 28666) endDisplayList(30);
    }

    final void beginDisplayList(byte i, int i_7_) {
        OpenGL.glNewList(i_7_ + listBase, 4864);
        anInt1106++;
        if (i <= 101) callDisplayList('\ufff3', -3);
    }

    Component128(GlToolkitSub2 var_ha_Sub2, int i) {
        listBase = OpenGL.glGenLists(i);
    }
}
