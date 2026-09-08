/* DummyClass - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class369_Sub3_Sub1` (JODE-obfuscated).
 * Placeholder/dummy class. Marked 'dummy'; a no-op stub used where a class reference is required but no behaviour is implemented.
 */

import java.awt.event.ActionEvent;

final class DummyClass extends Component76 {
    static int anInt10173;
    static boolean aBoolean10174 = true;
    static int anInt10175;
    static int anInt10176;
    int anInt10177;
    static int anInt10178;

    static final void method3575(byte i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
        if (i_3_ <= PauseTimer.anInt513 && i_2_ >= Component72.anInt1910) {
            boolean bool;
            if (Component27.anInt4960 <= i_4_) {
                if (i_4_ <= Component22.anInt1745) bool = true;
                else {
                    bool = false;
                    i_4_ = Component22.anInt1745;
                }
            } else {
                i_4_ = Component27.anInt4960;
                bool = false;
            }
            boolean bool_5_;
            if (Component27.anInt4960 > i_0_) {
                i_0_ = Component27.anInt4960;
                bool_5_ = false;
            } else if (Component22.anInt1745 < i_0_) {
                i_0_ = Component22.anInt1745;
                bool_5_ = false;
            } else bool_5_ = true;
            if (i_3_ < Component72.anInt1910) i_3_ = Component72.anInt1910;
            else MenuOpener.fillInts(-27, i_0_, DisplayModeManagerContainer167.anIntArrayArray255[i_3_++], i_4_, i_1_);
            if (PauseTimer.anInt513 >= i_2_) MenuOpener.fillInts(-27, i_0_, DisplayModeManagerContainer167.anIntArrayArray255[i_2_--], i_4_, i_1_);
            else i_2_ = PauseTimer.anInt513;
            if (!bool || !bool_5_) {
                if (bool) {
                    for (int i_7_ = i_3_; i_7_ <= i_2_; i_7_++)
                        DisplayModeManagerContainer167.anIntArrayArray255[i_7_][i_4_] = i_1_;
                } else if (bool_5_) {
                    for (int i_6_ = i_3_; i_6_ <= i_2_; i_6_++)
                        DisplayModeManagerContainer167.anIntArrayArray255[i_6_][i_0_] = i_1_;
                }
            } else {
                for (int i_8_ = i_3_; i_2_ >= i_8_; i_8_++) {
                    int[] is = DisplayModeManagerContainer167.anIntArrayArray255[i_8_];
                    is[i_4_] = is[i_0_] = i_1_;
                }
            }
        }
        if (i <= 57) pulseAwtQueue((byte) -97, null, null);
        anInt10173++;
    }

    static boolean method3576(boolean bool, boolean bool_9_) {
        return bool | bool_9_;
    }

    public final DisplayModeManagerContainer369 method51(byte i) {
        anInt10175++;
        if (i < 116) this.anInt10177 = -10;
        return Component38.aClass223_2507;
    }

    static final Component24 method3577(int i, byte i_10_, CacheStore class45) {
        anInt10176++;
        Component24 class105 = (Component24) Component35.aClass60_4273.get(i, -68);
        int i_11_ = -86 / ((55 - i_10_) / 51);
        if (class105 == null) {
            if (ShaderProgramSub7.aBoolean6289) class105 = NodeSub8.toolkit.method3691(Component170.method1512(class45, i), true);
            else class105 = GlTexture.method1969(class45.getSingletonFile((byte) 73, i), -5901);
            Component35.aClass60_4273.putOne(class105, i, (byte) -108);
        }
        return class105;
    }

    /** Drain up to 50 pending AWT events (optionally post a dummy ActionEvent). */
    static final void pulseAwtQueue(byte i, Object object, ReflectionInvoker class297) {
        do {
            try {
                anInt10178++;
                if (class297.eventQueue != null) {
                    int i_12_ = 0;
                    if (i != -42) pulseAwtQueue((byte) 95, null, null);
                    for (/**/; i_12_ < 50 && class297.eventQueue.peekEvent() != null; i_12_++)
                        SpriteAtlasShader.sleep((byte) 30, 1L);
                    try {
                        if (object == null) break;
                        class297.eventQueue.postEvent(new ActionEvent(object, 1001, "dummy"));
                    } catch (Exception exception) {
                        /* empty */
                    }
                    break;
                }
                break;
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("fu.F(" + i + ',' + (object != null ? "{...}" : "null") + ',' + (class297 != null ? "{...}" : "null") + ')'));
            }
        } while (false);
    }

    DummyClass(Component85 class221, DisplayModeManagerContainer196 class341, int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
        super(class221, class341, i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_);
        try {
            this.anInt10177 = i_25_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("fu.<init>(" + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'));
        }
    }
}
