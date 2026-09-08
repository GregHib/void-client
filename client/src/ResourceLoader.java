/* ResourceLoader - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class311` (JODE-obfuscated).
 * Resource-loading thread (implements Runnable). Loads anInterface16_3907 (InterfaceRenderer etc.) and reports progress through a LoadingState (aClass56_3916) and the GraphicsToolkit.
 */

final class ResourceLoader implements Runnable {
    static int anInt3897;
    static StringCache aClass351_3898 = new StringCache(11, 8);
    static int anInt3899;
    static int anInt3900;
    static int anInt3901;
    static int anInt3902;
    static int anInt3903;
    static int anInt3904;
    static int anInt3905;
    static int anInt3906;
    private Interface16 anInterface16_3907 = new InterfaceRenderer();
    private volatile boolean aBoolean3908;
    static int anInt3909;
    private volatile boolean aBoolean3910;
    static int anInt3911;
    static int anInt3912;
    static DisplayModeManagerContainer57 aClass46_3913;
    private long aLong3914;
    private int anInt3915;
    private LoadingState aClass56_3916;
    private long aLong3917;
    static int anInt3918 = 1;
    private Interface16 anInterface16_3919 = null;
    /** Loading-render loop iterations ({@link #run}). */
    private int pulseCount;
    private String aString3921;

    final int method2315(byte i) {
        anInt3909++;
        if (aClass56_3916 == null) return 0;
        if (i < 103) aLong3917 = -58L;
        int i_0_ = aClass56_3916.getStageId(-118);
        if (aClass56_3916.isBlocking && (anInt3915 < aClass56_3916.currentProgress)) return 1 + anInt3915;
        if (i_0_ < 0 || -1 + ShaderCompilerSub2.aClass56Array6515.length <= i_0_) return 100;
        if (aClass56_3916.maxProgress == anInt3915) return aClass56_3916.currentProgress;
        return aClass56_3916.maxProgress;
    }

    final void method2316(LoadingState class56, String string, int i, long l, boolean bool) {
        try {
            if (bool != false) method2318(9);
            aString3921 = string;
            anInt3915 = i;
            anInt3897++;
            aLong3917 = l;
            aClass56_3916 = class56;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ae.J(" + (class56 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + i + ',' + l + ',' + bool + ')'));
        }
    }

    public final void run() {
        anInt3902++;
        while (!aBoolean3910) {
            long l = Component240.currentTimeMillis(-61);
            try {
                pulseCount++;
                    if (anInterface16_3907 instanceof InterfaceRenderer) anInterface16_3907.method58(aBoolean3908, -104);
                    else {
                        long l_1_ = Component240.currentTimeMillis(-104);
                        if (NodeSub8.toolkit != null && anInterface16_3919 != null && anInterface16_3919.method55((byte) -58) != 0 && (aLong3914 >= l_1_ - (long) anInterface16_3919.method55((byte) -58))) {
                            int i = (int) ((l_1_ + -aLong3914) * 255L / (long) anInterface16_3919.method55((byte) -58));
                            int i_2_ = -i + 255;
                            i_2_ = 0xffffff | i_2_ << 24;
                            i = 0xffffff | i << 24;
                            Component211.method1170((byte) -121);
                            NodeSub8.toolkit.GA(0);
                            Component24 class105 = (NodeSub8.toolkit.method3629(Component236.canvasWidth, PacketReader.canvasHeight, true));
                            NodeSub8.toolkit.method3681(class105, 0);
                            anInterface16_3919.method58(true, -126);
                            NodeSub8.toolkit.method3672();
                            class105.method964(0, 0, 0, i_2_, 1);
                            NodeSub8.toolkit.method3681(class105, 0);
                            NodeSub8.toolkit.GA(0);
                            anInterface16_3907.method58(true, -114);
                            NodeSub8.toolkit.method3672();
                            class105.method964(0, 0, 0, i, 1);
                        } else {
                            if (anInterface16_3919 != null) {
                                aBoolean3908 = true;
                                anInterface16_3919.method59(-9719);
                                anInterface16_3919 = null;
                            }
                            if (aBoolean3908) {
                                Component211.method1170((byte) -64);
                                if (NodeSub8.toolkit != null) NodeSub8.toolkit.GA(0);
                            }
                            anInterface16_3907.method58((aBoolean3908 || (NodeSub8.toolkit != null && NodeSub8.toolkit.method3655())), -90);
                        }
                        try {
                            if (NodeSub8.toolkit != null && !(anInterface16_3907 instanceof InterfaceRenderer)) NodeSub8.toolkit.method3689((byte) 57);
                        } catch (Exception_Sub1 exception_sub1) {
                            ClientErrorReporter.reportError((exception_sub1.getMessage() + " (Recovered) " + NpcComposition.aClient1367.method81((byte) 80)), exception_sub1, 15004);
                            SoftwareFallbackShader.method3553(true, (byte) 114, 0);
                        }
                    }
                    java.awt.Container container;
                    if (RSACipher.aFrame4904 != null) container = RSACipher.aFrame4904;
                    else if (ToolkitFactory.anApplet1530 != null) container = ToolkitFactory.anApplet1530;
                    else container = DefinitionSub9.anApplet_Sub1_9169;
                    container.getSize();
                    container.getSize();
                    if (RSACipher.aFrame4904 == container) RSACipher.aFrame4904.getInsets();
                    aBoolean3908 = false;
                    if (NodeSub8.toolkit != null && !(anInterface16_3907 instanceof InterfaceRenderer) && (aClass56_3916.getStageId(-112) < LoadingState.aClass56_1041.getStageId(-127))) OpenGlShader.method3556(false);
            } catch (Exception exception) {
                continue;
            }
            long l_3_ = Component240.currentTimeMillis(-73);
            int i = (int) (-l_3_ - -l + 20L);
            if (i > 0) SpriteAtlasShader.sleep((byte) -3, i);
        }
    }

    public static void method2317(byte i) {
        if (i > 50) {
            aClass351_3898 = null;
            aClass46_3913 = null;
        }
    }

    final String method2318(int i) {
        if (i != -9324) method2320((byte) -47);
        anInt3903++;
        return aString3921;
    }

    final void method2319(byte i) {
        aBoolean3910 = true;
        if (i >= -37) aLong3914 = -36L;
        anInt3906++;
    }

    final int method2320(byte i) {
        anInt3901++;
        int i_4_ = -127 / ((29 - i) / 45);
        return anInt3915;
    }

    final synchronized void method2321(int i, Interface16 interface16) {
        anInt3911++;
        if (i != 10559) aClass46_3913 = null;
        anInterface16_3919 = anInterface16_3907;
        anInterface16_3907 = interface16;
        aLong3914 = Component240.currentTimeMillis(-67);
    }

    final synchronized boolean method2322(int i) {
        anInt3900++;
        if (i != 0) return false;
        return anInterface16_3907.method56((byte) 125, aLong3914);
    }

    final long method2323(int i) {
        anInt3912++;
        if (i != 0) method2318(14);
        return aLong3917;
    }

    final LoadingState method2324(int i) {
        anInt3904++;
        if (i <= 45) return null;
        return aClass56_3916;
    }

    /** {@link #pulseCount} — frames processed by the loader thread. */
    final int getPulseCount(byte i) {
        int i_5_ = 32 / ((i - -41) / 47);
        anInt3899++;
        return pulseCount;
    }

    final void method2326(int i) {
        if (i <= 39) method2315((byte) 28);
        anInt3905++;
        aBoolean3908 = true;
    }

    public ResourceLoader() {
        /* empty */
    }
}
