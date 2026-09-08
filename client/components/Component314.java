/* Component314 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Component314
/**
 * RENAMED from `Class306` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3872 = -1;
    static int[] anIntArray3873 = new int[13];
    static int anInt3874;
    static int anInt3875;
    static int anInt3876;

    /** Construct an {@link OpenGLToolkit} for {@code canvas} (desktop GL path). */
    static final GraphicsToolkit createOpenGLToolkit(int i, int i_0_, d var_d, Canvas canvas, int i_1_) {
        try {
            if (i != -6) createOpenGLToolkit(23, -44, null, null, -57);
            anInt3875++;
            return new OpenGLToolkit(canvas, var_d, i_1_, i_0_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ws.C(" + i + ',' + i_0_ + ',' + (var_d != null ? "{...}" : "null") + ',' + (canvas != null ? "{...}" : "null") + ',' + i_1_ + ')'));
        }
    }

    static final void method2298(byte i, String string) {
        anInt3876++;
        if (RequestProcessor.aClass19Array2261 != null) {
            DisplayModeManagerContainer96.anInt4698++;
            ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(Component186.aClass351_4405, DisplayModeManagerContainer64.aClass77_9029, -97);
            class348_sub47.particleBuffer.writeByte(false, Component31.method1745(string, -65));
            class348_sub47.particleBuffer.writeString((byte) -5, string);
            if (i > -50) createOpenGLToolkit(104, 26, null, null, -19);
            HashNodeSub14.enqueueOutboundPacket(-43, class348_sub47);
        }
    }

    public static void method2299(byte i) {
        anIntArray3873 = null;
        if (i != -128) createOpenGLToolkit(66, -48, null, null, 100);
    }
}
