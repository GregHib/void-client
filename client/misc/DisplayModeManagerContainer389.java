/* DisplayModeManagerContainer389 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class DisplayModeManagerContainer389
/**
 * RENAMED from `Class14_Sub2` (JODE-obfuscated).
 * Evidence: subclass of DisplayModeManagerContainer194 (hierarchy)
 */ extends DisplayModeManagerContainer194 implements Interface18_Impl2 {
    static int anInt8619;
    static int anInt8620;
    static double aDouble8621;
    static int anInt8622;
    /*synthetic*/ static Class aClass8623;

    DisplayModeManagerContainer389(GlExtensionManager class377, int i, boolean bool, int[][] is) {
        super(class377, 34067, Component83.aClass304_1662, Component342.aClass68_1183, 6 * (i * i), bool);
        try {
            this.aClass377_5082.setActiveTexture((byte) -109, this);
            if (bool) {
                for (int i_1_ = 0; i_1_ < 6; i_1_++)
                    this.method233(i, i, is[i_1_], i_1_ + 34069, 255);
            } else {
                for (int i_0_ = 0; i_0_ < 6; i_0_++)
                    OpenGL.glTexImage2Di(34069 + i_0_, 0, this.method228(121), i, i, 0, ParametricDefinition.method3055(110, this.aClass304_5084), (this.aClass377_5082.anInt9918), is[i_0_], 0);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("le.<init>(" + (class377 != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (is != null ? "{...}" : "null") + ')'));
        }
    }

    /** Persist the serialized preferences buffer to the cache preferences file. */
    static final void savePreferences(int i) {
        anInt8620++;
        RandomAccessFileReader class234 = null;
        try {
            Task class144 = OggUrlStream.aClass297_8992.openCacheFile((byte) -46, "", true);
            while (class144.status == 0) SpriteAtlasShader.sleep((byte) -122, 1L);
            if (class144.status == 1) {
                class234 = (RandomAccessFileReader) class144.result;
                Buffer class348_sub49 = Component192.preferences.method3427(24);
                class234.write((byte) 114, 0, (class348_sub49.offset), (class348_sub49.payload));
            }
        } catch (Exception exception) {
            /* empty */
        }
        do {
            try {
                if (i != 37) aDouble8621 = -0.46512114956219314;
                if (class234 == null) break;
                class234.close(false);
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    static final int method244(int i) {
        anInt8622++;
        if ((double) DisplayModeManagerContainer229.aFloat1249 == 3.0) return 37;
        if (i != 37) return 11;
        if ((double) DisplayModeManagerContainer229.aFloat1249 == 4.0) return 50;
        if ((double) DisplayModeManagerContainer229.aFloat1249 == 6.0) return 75;
        if ((double) DisplayModeManagerContainer229.aFloat1249 == 8.0) return 100;
        return 200;
    }

    static final boolean method245(int i, int i_2_, int i_3_, byte i_4_) {
        if (i_4_ < 38) return false;
        anInt8619++;
        Interface10 interface10 = (Interface10) CacheNodeSub2.method3297(i, i_2_, i_3_);
        boolean bool = true;
        if (interface10 != null) bool &= JagTheoraDecoder.method520(interface10, -1);
        interface10 = ((Interface10) DisplayModeManagerContainer249.method1353(i, i_2_, i_3_, (aClass8623 != null ? aClass8623 : (aClass8623 = Interface10.class))));
        if (interface10 != null) bool &= JagTheoraDecoder.method520(interface10, -1);
        interface10 = (Interface10) BrowserUrlOpener.method2878(i, i_2_, i_3_);
        if (interface10 != null) bool &= JagTheoraDecoder.method520(interface10, -1);
        return bool;
    }
}
