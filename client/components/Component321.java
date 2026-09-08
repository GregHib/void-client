/* Component321 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;

final class Component321
/**
 * RENAMED from `Class193` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt2583;
    int anInt2584;
    private final GlExtensionManager aClass377_2585;
    static int anInt2586;
    static StringCache aClass351_2587 = new StringCache(38, 7);
    static int anInt2588;
    static Connection aClass202_2589;
    static int anInt2590;

    static final AudioLine method1439(int i, ReflectionInvoker class297, Component component, int i_0_, int i_1_) {
        try {
            anInt2583++;
            if (Component231.sampleRate == 0) throw new IllegalStateException();
            if (i_0_ < 0 || i_0_ >= 2) throw new IllegalArgumentException();
            if (i < 256) i = 256;
            try {
                AudioLine class279 = new SourceAudioLine();
                class279.anInt3620 = i;
                class279.anIntArray3603 = new int[(Component21.stereo ? 2 : 1) * 256];
                class279.initOnComponent(component);
                class279.anInt3613 = (i & ~0x3ff) + 1024;
                if (class279.anInt3613 > 16384) class279.anInt3613 = 16384;
                class279.open(class279.anInt3613);
                if (Component193.audioThreadPriority > 0 && Component191.aClass250_2462 == null) {
                    Component191.aClass250_2462 = new AudioMixer();
                    Component191.aClass250_2462.invoker = class297;
                    class297.startThread(Component191.aClass250_2462, -10240, Component193.audioThreadPriority);
                }
                if (Component191.aClass250_2462 != null) {
                    if ((Component191.aClass250_2462.lines[i_0_]) != null) throw new IllegalArgumentException();
                    Component191.aClass250_2462.lines[i_0_] = class279;
                }
                if (i_1_ != 7) method1440(107);
                return class279;
            } catch (Throwable throwable) {
                try {
                    AudioLineSub2 class279_sub2 = new AudioLineSub2(class297, i_0_);
                    class279_sub2.anInt3620 = i;
                    class279_sub2.anIntArray3603 = new int[(!Component21.stereo ? 1 : 2) * 256];
                    class279_sub2.initOnComponent(component);
                    class279_sub2.anInt3613 = 16384;
                    class279_sub2.open(class279_sub2.anInt3613);
                    if (Component193.audioThreadPriority > 0 && Component191.aClass250_2462 == null) {
                        Component191.aClass250_2462 = new AudioMixer();
                        Component191.aClass250_2462.invoker = class297;
                        class297.startThread(Component191.aClass250_2462, -10240, Component193.audioThreadPriority);
                    }
                    if (Component191.aClass250_2462 != null) {
                        if ((Component191.aClass250_2462.lines[i_0_]) != null) throw new IllegalArgumentException();
                        Component191.aClass250_2462.lines[i_0_] = class279_sub2;
                    }
                    return class279_sub2;
                } catch (Throwable throwable_2_) {
                    return new AudioLine();
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("qr.A(" + i + ',' + (class297 != null ? "{...}" : "null") + ',' + (component != null ? "{...}" : "null") + ',' + i_0_ + ',' + i_1_ + ')'));
        }
    }

    protected final void finalize() throws Throwable {
        anInt2588++;
        aClass377_2585.method3971(16386, this.anInt2584);
        super.finalize();
    }

    Component321(GlExtensionManager class377, int i, int i_3_) {
        aClass377_2585 = class377;
        this.anInt2584 = i_3_;
    }

    public static void method1440(int i) {
        aClass202_2589 = null;
        int i_4_ = -79 / ((i - -45) / 46);
        aClass351_2587 = null;
    }
}
