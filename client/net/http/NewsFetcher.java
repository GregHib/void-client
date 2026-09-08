/* NewsFetcher - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class339` (JODE-obfuscated).
 * News fetcher. Implements Runnable; downloads the /news.ws?game= feed over http and supplies the client news panel with parsed entries on a background thread.
 */

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.URL;

final class NewsFetcher implements Runnable {
    static int anInt4198;
    static int anInt4199;
    static int anInt4200;
    private Task aClass144_4201;
    static int anInt4202 = -1;
    static int anInt4203;
    private DisplayModeManagerContainer61[] aClass295Array4204;
    private volatile boolean aBoolean4205;
    private Thread aThread4206;
    static StringCache aClass351_4207 = new StringCache(29, 3);
    static int anInt4208;
    static int anInt4209;
    static int anInt4210;
    static int anInt4211;

    public static void method2664(int i) {
        if (i == 3) aClass351_4207 = null;
    }

    public final void run() {
        anInt4203++;
        try {
            BufferedReader bufferedreader = new BufferedReader(new InputStreamReader((DataInputStream) (aClass144_4201.result)));
            String string = bufferedreader.readLine();
            BrowserDetector class179 = CookieBuilder.createBrowserDetector((byte) 68);
            for (/**/; string != null; string = bufferedreader.readLine())
                class179.add(-1, string);
            String[] strings = class179.toArray(63);
            if (strings.length % 3 != 0) return;
            aClass295Array4204 = new DisplayModeManagerContainer61[strings.length / 3];
            for (int i = 0; i < strings.length; i += 3)
                aClass295Array4204[i / 3] = new DisplayModeManagerContainer61(strings[i], strings[i + 1], strings[2 + i]);
        } catch (java.io.IOException ioexception) {
            /* empty */
        }
        aBoolean4205 = true;
    }

    static final void method2665(int i, byte i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        anInt4200++;
        int i_5_ = i_4_ - i;
        int i_6_ = -i_2_ + i_3_;
        if (i_5_ == 0) {
            if (i_6_ != 0) Component226.method2656(i_2_, i, (byte) 124, i_1_, i_3_);
            return;
        } else if (i_6_ == 0) {
            Component2.method196(true, i_4_, i_1_, i, i_2_);
            return;
        }
        int i_7_ = (i_6_ << 12) / i_5_;
        int i_8_ = -(i_7_ * i >> 12) + i_2_;
        int i_9_;
        int i_10_;
        if (i < Component27.anInt4960) {
            i_9_ = (i_7_ * Component27.anInt4960 >> 12) + i_8_;
            i_10_ = Component27.anInt4960;
        } else if (i > Component22.anInt1745) {
            i_9_ = i_8_ - -(Component22.anInt1745 * i_7_ >> 12);
            i_10_ = Component22.anInt1745;
        } else {
            i_10_ = i;
            i_9_ = i_2_;
        }
        if (i_0_ < 56) anInt4202 = -57;
        int i_11_;
        int i_12_;
        if (Component27.anInt4960 <= i_4_) {
            if (Component22.anInt1745 >= i_4_) {
                i_11_ = i_4_;
                i_12_ = i_3_;
            } else {
                i_11_ = Component22.anInt1745;
                i_12_ = i_8_ + (Component22.anInt1745 * i_7_ >> 12);
            }
        } else {
            i_11_ = Component27.anInt4960;
            i_12_ = (i_7_ * Component27.anInt4960 >> 12) + i_8_;
        }
        if (i_12_ < Component72.anInt1910) {
            i_11_ = (Component72.anInt1910 + -i_8_ << 12) / i_7_;
            i_12_ = Component72.anInt1910;
        } else if (PauseTimer.anInt513 < i_12_) {
            i_11_ = (PauseTimer.anInt513 - i_8_ << 12) / i_7_;
            i_12_ = PauseTimer.anInt513;
        }
        if (Component72.anInt1910 <= i_9_) {
            if (PauseTimer.anInt513 < i_9_) {
                i_10_ = (PauseTimer.anInt513 - i_8_ << 12) / i_7_;
                i_9_ = PauseTimer.anInt513;
            }
        } else {
            i_10_ = (-i_8_ + Component72.anInt1910 << 12) / i_7_;
            i_9_ = Component72.anInt1910;
        }
        DisplayModeManagerContainer341.method1783(i_10_, -1, i_9_, i_12_, i_11_, i_1_);
    }

    static final void method2666(int i, int i_13_, DisplayModeManagerContainer57 class46, byte i_14_) {
        anInt4199++;
        if (class46 != null) {
            if (class46.anObjectArray714 != null) {
                NodeSub36 class348_sub36 = new NodeSub36();
                class348_sub36.anObjectArray6987 = class46.anObjectArray714;
                class348_sub36.aClass46_6989 = class46;
                ClientScriptExecutor.runHook(class348_sub36);
            }
            Component149.widgetCursorId = class46.anInt695;
            Component163.anInt3176 = i;
            PauseTimer.anInt500 = i_13_;
            Component281.anInt3829 = class46.itemId;
            r.aBoolean9722 = true;
            JaclibLoader.anInt169 = class46.childIndex;
            Component182.anInt9747 = class46.anInt824;
            if (i_14_ != 21) method2665(-99, (byte) -106, 10, -37, 26, -123);
            Component90.anInt2046 = class46.packedId;
            Component111.markInterfaceDirty(-9343, class46);
        }
    }

    final DisplayModeManagerContainer61 method2667(boolean bool, int i) {
        anInt4210++;
        if (bool != false) return null;
        if (aClass295Array4204 == null || i < 0 || i >= aClass295Array4204.length) return null;
        return aClass295Array4204[i];
    }

    public NewsFetcher() {
        /* empty */
    }

    final boolean method2668(int i) {
        anInt4208++;
        if (aBoolean4205) return true;
        if (aClass144_4201 == null) {
            try {
                int i_15_ = (DisplayModeManagerContainer345.aClass364_165 == Component326.LIVE ? 80 : 7000 - -(MenuOpener.aClass161_4839.anInt2143));
                aClass144_4201 = (OggUrlStream.aClass297_8992.openUrlStream(new URL("http://" + (MenuOpener.aClass161_4839.aString2147) + ":" + i_15_ + "/news.ws?game=" + PacketReader.currentGameType.id), 8362));
            } catch (java.net.MalformedURLException malformedurlexception) {
                return true;
            }
        }
        if (aClass144_4201 == null || aClass144_4201.status == 2) return true;
        if (i != -21913) return false;
        if (aClass144_4201.status != 1) return false;
        if (aThread4206 == null) {
            aThread4206 = new Thread(this);
            aThread4206.start();
        }
        return aBoolean4205;
    }

    static final void method2669(Object[] objects, long[] ls, int i) {
        try {
            if (i < -5) {
                anInt4209++;
                Component45.method3461(0, objects, -1 + ls.length, ls, 9455);
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("eaa.E(" + (objects != null ? "{...}" : "null") + ',' + (ls != null ? "{...}" : "null") + ',' + i + ')'));
        }
    }
}
