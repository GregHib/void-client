/* Component262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.IOException;

final class Component262
/**
 * RENAMED from `Class116` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt1758;
    static boolean shiftClick = true;
    static int anInt1760;
    /** Applet {@code quiturl} parameter (fallback browser quit target). */
    static String quitUrl;
    static Component183 aClass114_1762;

    public static void clearStatics(byte i) {
        if (i == 35) {
            aClass114_1762 = null;
            quitUrl = null;
        }
    }

    /**
     * Load client preferences from the {@code "2"} cache RAF
     * (same file written by {@link DisplayModeManagerContainer343#saveClientPreferences}).
     */
    static final void loadPreferences(int i) {
        if (i != 1) quitUrl = null;
        anInt1760++;
        RandomAccessFileReader class234 = null;
        try {
            Task class144 = OggUrlStream.aClass297_8992.openCacheFile((byte) -46, "2", true);
            while (class144.status == 0) SpriteAtlasShader.sleep((byte) 63, 1L);
            if (class144.status == 1) {
                class234 = (RandomAccessFileReader) class144.result;
                byte[] is = new byte[(int) class234.length((byte) -46)];
                int i_0_;
                for (int i_1_ = 0; is.length > i_1_; i_1_ += i_0_) {
                    i_0_ = class234.read(is, i_1_, (byte) -12, is.length + -i_1_);
                    if (i_0_ == -1) throw new IOException("EOF");
                }
                Sprite.readPreferences(new Buffer(is), (byte) -40);
            }
        } catch (Exception exception) {
            /* empty */
        }
        do {
            try {
                if (class234 == null) break;
                class234.close(false);
            } catch (Exception exception) {
                break;
            }
            break;
        } while (false);
    }

    static {
        anInt1758 = 0;
        aClass114_1762 = new Component183(50, -1);
    }
}
