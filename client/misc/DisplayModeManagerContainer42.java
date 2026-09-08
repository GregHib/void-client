/* DisplayModeManagerContainer42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer42
/**
 * RENAMED from `Class304` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static boolean aBoolean3847 = false;
    static int anInt3848;
    static int anInt3849;
    int anInt3850;
    static int anInt3851;

    DisplayModeManagerContainer42(int i) {
        this.anInt3850 = i;
    }

    public final String toString() {
        anInt3851++;
        throw new IllegalStateException();
    }

    static final void method2289(int i, int i_0_, int i_1_, int i_2_, byte[] is, int i_3_) {
        if (i_1_ > -32) method2290();
        anInt3848++;
        if (i < i_3_) {
            i_0_ += i;
            i_2_ = -i + i_3_ >> 2;
            while (--i_2_ >= 0) {
                is[i_0_++] = (byte) 1;
                is[i_0_++] = (byte) 1;
                is[i_0_++] = (byte) 1;
                is[i_0_++] = (byte) 1;
            }
            i_2_ = 0x3 & -i + i_3_;
            while (--i_2_ >= 0) is[i_0_++] = (byte) 1;
        }
    }

    static final void method2290() {
        for (; ; ) {
            boolean bool = true;
            for (int i = 0; i < LoggedOutDefinition.aClass293Array9432.length; i++) {
                if (!LoggedOutDefinition.aClass293Array9432[i].method2210()) {
                    synchronized (LoggedOutDefinition.aClass293Array9432[i]) {
                        LoggedOutDefinition.aClass293Array9432[i].notify();
                    }
                    bool = false;
                } else Component334.aLongArray2013[i] = LoggedOutDefinition.aClass293Array9432[i].method2204();
            }
            if (bool) break;
            try {
                SpriteAtlasShader.sleep((byte) -18, 1L);
            } catch (Exception exception) {
                /* empty */
            }
        }
        LoggedOutDefinition.aClass293Array9432[LoggedOutDefinition.aClass293Array9432.length - 1].method2208();
        DebugPanicSub1.method2131(1);
        for (; ; ) {
            boolean bool = true;
            for (int i = 0; i < LoggedOutDefinition.aClass293Array9432.length - 1; i++) {
                if (!LoggedOutDefinition.aClass293Array9432[i].method2210()) {
                    synchronized (LoggedOutDefinition.aClass293Array9432[i]) {
                        LoggedOutDefinition.aClass293Array9432[i].notify();
                    }
                    bool = false;
                }
            }
            if (bool) break;
            try {
                SpriteAtlasShader.sleep((byte) 72, 1L);
            } catch (Exception exception) {
                /* empty */
            }
        }
        for (int i = 1; i < LoggedOutDefinition.aClass293Array9432.length - 2; i++)
            LoggedOutDefinition.aClass293Array9432[i].method2208();
        DebugPanicSub1.method2131(2);
        while (!LoggedOutDefinition.aClass293Array9432[0].method2210()) {
            synchronized (LoggedOutDefinition.aClass293Array9432[0]) {
                LoggedOutDefinition.aClass293Array9432[0].notify();
            }
            try {
                SpriteAtlasShader.sleep((byte) 112, 1L);
            } catch (Exception exception) {
                /* empty */
            }
        }
        LoggedOutDefinition.aClass293Array9432[0].method2208();
    }

    static final void method2291(byte i, int i_4_, int i_5_) {
        anInt3849++;
        int i_6_ = (Component27.aClass143_4962.stringWidth(true, FriendsIgnoreList.aClass274_3507.getLocalized(ObjectDeserializer.languageId, 544)));
        int i_7_;
        if (PauseHandler.aBoolean9535) {
            for (HashNodeSub13 class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.first(-87)); class348_sub42_sub13 != null; class348_sub42_sub13 = ((HashNodeSub13) Component237.aClass107_3022.next((byte) 126))) {
                int i_9_;
                if (class348_sub42_sub13.anInt9615 != 1) i_9_ = Component156.method2194(-1, class348_sub42_sub13);
                else i_9_ = (OutputStream_Sub2.method138(((MenuEntry) (class348_sub42_sub13.aClass107_9621.sentinel.next)), false));
                if (i_6_ < i_9_) i_6_ = i_9_;
            }
            i_6_ += 8;
            i_7_ = 21 + 16 * DisplayModeManagerContainer345.anInt166;
            Component251.anInt5819 = (DisplayModeManagerContainer5.aBoolean1211 ? 26 : 22) + 16 * DisplayModeManagerContainer345.anInt166;
        } else {
            for (MenuEntry class348_sub42_sub12 = ((MenuEntry) DefinitionSub4.menuEntries.first(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (MenuEntry) DefinitionSub4.menuEntries.next((byte) 69)) {
                int i_8_ = OutputStream_Sub2.method138(class348_sub42_sub12, false);
                if (i_6_ < i_8_) i_6_ = i_8_;
            }
            i_6_ += 8;
            Component251.anInt5819 = (!DisplayModeManagerContainer5.aBoolean1211 ? 22 : 26) + 16 * DisplayModeManagerContainer306.menuEntryCount;
            i_7_ = 21 + DisplayModeManagerContainer306.menuEntryCount * 16;
        }
        int i_10_ = -(i_6_ / 2) + i_4_;
        if (Component236.canvasWidth < i_6_ + i_10_) i_10_ = -i_6_ + Component236.canvasWidth;
        if (i_10_ < 0) i_10_ = 0;
        int i_11_ = i_5_;
        if (i > -108) method2290();
        if (i_11_ + i_7_ > PacketReader.canvasHeight) i_11_ = PacketReader.canvasHeight + -i_7_;
        if (i_11_ < 0) i_11_ = 0;
        DisplayModeManagerContainer136.anInt4717 = i_10_;
        Component364.aBoolean8335 = true;
        DefinitionGroup.anInt9532 = i_11_;
        Component227.anInt1117 = i_6_;
    }
}
