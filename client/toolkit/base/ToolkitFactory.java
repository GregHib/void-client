/* ToolkitFactory - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class93` (JODE-obfuscated).
 * GraphicsToolkit factory. {@link #createOpenGlToolkit} builds the OpenGL toolkit;
 * {@link #clearStatics} tears down static refs. Called at client startup.
 */

import jaggl.OpenGL;

import java.applet.Applet;
import java.awt.*;

final class ToolkitFactory {
    static int anInt1529;
    static Applet anApplet1530;
    static String[] aStringArray1531 = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static int anInt1532;
    static int anInt1533;
    static int anInt1534 = 0;

    public static void clearStatics(int i) {
        aStringArray1531 = null;
        int i_0_ = 2 / ((i - 33) / 38);
        anApplet1530 = null;
    }

    static final GraphicsToolkit createOpenGlToolkit(Canvas canvas, d var_d, CacheStore class45, int i, int i_1_) {
        try {
            anInt1532++;
            if (!JaclibLoader.loadNatives(27165)) throw new RuntimeException("");
            if (!DefinitionSub19.tryLoadNativeLibrary(i ^ ~0x158f, "jaggl")) throw new RuntimeException("");
            OpenGL opengl = new OpenGL();
            long l = opengl.init(canvas, 8, 8, 8, 24, 0, i_1_);
            if (l == 0L) throw new RuntimeException("");
            if (i != 25542) return null;
            GlExtensionManager class377 = new GlExtensionManager(opengl, canvas, l, var_d, class45, i_1_);
            class377.setKeyState((byte) 26);
            return class377;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("lt.D(" + (canvas != null ? "{...}" : "null") + ',' + (var_d != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ')'));
        }
    }

    static final byte[] method863(int i, byte i_2_, byte[] is) {
        if (i_2_ < 64) return null;
        anInt1529++;
        byte[] is_3_ = new byte[i];
        Component313.arraycopy(is, 0, is_3_, 0, i);
        return is_3_;
    }

    static final byte[] method864(int i, byte[] is, int i_4_, int i_5_) {
        anInt1533++;
        if (i_5_ >= -30) aStringArray1531 = null;
        byte[] is_6_ = new byte[i_4_];
        Component313.arraycopy(is, i, is_6_, 0, i_4_);
        return is_6_;
    }
}
