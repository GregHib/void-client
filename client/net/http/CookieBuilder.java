/* CookieBuilder - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class43` (JODE-obfuscated).
 * HTTP cookie builder. Assembles a settings cookie string ('settings=...; version=1; path=/; domain=') from host/domain params.
 */

final class CookieBuilder {
    static CacheStore aClass45_611;
    static int anInt612;
    static int anInt613;
    HashNodeSub10 aClass348_Sub42_Sub10_614;
    int anInt615;
    static int anInt616;
    int[] anIntArray617;
    static StringCache aClass351_618 = new StringCache(5, 3);
    static int[] anIntArray619 = {0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
    static int anInt620;

    public static void clearStatics(int i) {
        aClass351_618 = null;
        anIntArray619 = null;
        if (i == 0) aClass45_611 = null;
    }

    /** Factory for the browser/UA detector used by HTTP news/cookie helpers. */
    static final BrowserDetector createBrowserDetector(byte i) {
        anInt616++;
        if (i != 68) createBrowserDetector((byte) -42);
        return Component183.method1059((byte) 95, 1);
    }

    /** Write {@code settings=} cookie via {@code document.cookie} (empty clears). */
    static final void setSettingsCookie(String string, boolean bool) {
        anInt613++;
        Component205.settingsCookie = string;
        if (bool != true) createBrowserDetector((byte) -48);
        if (ToolkitFactory.anApplet1530 != null) {
            try {
                String string_0_ = ToolkitFactory.anApplet1530.getParameter("cookieprefix");
                String string_1_ = ToolkitFactory.anApplet1530.getParameter("cookiehost");
                String string_2_ = (string_0_ + "settings=" + string + "; version=1; path=/; domain=" + string_1_);
                if (string.length() == 0) string_2_ += "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                else string_2_ += ("; Expires=" + (HashNodeSub16Sub1.formatHttpDate(Component240.currentTimeMillis(-53) + 94608000000L, 63)) + "; Max-Age=" + 94608000L);
                AppletInvoker.invokeApplet(ToolkitFactory.anApplet1530, -15092, "document.cookie=\"" + string_2_ + "\"");
            } catch (Throwable throwable) {
                /* empty */
            }
        }
    }

    static final void method383(int i) {
        for (int i_3_ = i; AudioMixer.anInt3225 > i_3_; i_3_++) {
            int i_4_ = (Component360.method3452(ShaderProgram.anInt3682 + i_3_, (byte) -15, AudioMixer.anInt3225) * Component82.anInt425);
            for (int i_5_ = 0; Component82.anInt425 > i_5_; i_5_++) {
                int i_6_ = (Component360.method3452(i_5_ - -ColoredText.anInt6095, (byte) -15, Component82.anInt425) + i_4_);
                if (Component72.anIntArray1909[i_6_] == Component212.anInt9997) DisplayModeManagerContainer23.anInterface4Array1525[i_6_].method14(0, 0, Component255.anInt1067, AbstractBuffer.anInt4267, i_5_ * Component255.anInt1067, AbstractBuffer.anInt4267 * i_3_, true, true);
            }
        }
        anInt612++;
    }

    public CookieBuilder() {
        /* empty */
    }
}
