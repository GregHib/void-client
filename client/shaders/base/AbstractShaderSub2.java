/* AbstractShaderSub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class AbstractShaderSub2
/**
 * RENAMED from `Class367_Sub2` (JODE-obfuscated).
 * Evidence: subclass of AbstractShader (hierarchy)
 */ extends AbstractShader {
    static int anInt7286;
    static int anInt7287;
    static int anInt7288;
    static int anInt7289;
    static short[][][] aShortArrayArrayArray7290;
    static int anInt7291;
    static int anInt7292;
    private final Component321 aClass193_7293;
    private final Component209 aClass269_7294;
    static int anInt7295;
    private GlExtensionManager aClass377_7296;
    static int anInt7297 = 0;

    static final void method3536(int i, int i_0_, int i_1_, int i_2_, DisplayModeManagerContainer343 class318_sub1_sub2) {
        Component186 class357 = NodeSub46.method3321(i, i_0_, i_1_);
        if (class357 != null) {
            class318_sub1_sub2.x = (i_0_ << Component149.anInt4459) + DisplayModeManagerContainer64.anInt9037;
            class318_sub1_sub2.anInt6382 = i_2_;
            class318_sub1_sub2.y = (i_1_ << Component149.anInt4459) + DisplayModeManagerContainer64.anInt9037;
            class357.aClass318_Sub1_Sub2_4408 = class318_sub1_sub2;
            int i_3_ = ShaderSub1.aSArray5191 == Component9.aSArray4142 ? 1 : 0;
            if (class318_sub1_sub2.method2376(-52)) {
                if (class318_sub1_sub2.method2377((byte) 122)) {
                    class318_sub1_sub2.aClass318_Sub1_6379 = AudioMixer.aClass318_Sub1Array3226[i_3_];
                    AudioMixer.aClass318_Sub1Array3226[i_3_] = class318_sub1_sub2;
                } else {
                    class318_sub1_sub2.aClass318_Sub1_6379 = Node.aClass318_Sub1Array4293[i_3_];
                    Node.aClass318_Sub1Array4293[i_3_] = class318_sub1_sub2;
                    NodeSub16Sub2.aBoolean8870 = true;
                }
            } else {
                class318_sub1_sub2.aClass318_Sub1_6379 = Component95.aClass318_Sub1Array1754[i_3_];
                Component95.aClass318_Sub1Array1754[i_3_] = class318_sub1_sub2;
            }
        }
    }

    final void method3527(int i, Interface18 interface18, int i_4_) {
        anInt7288++;
        if (i_4_ != -16776) aClass377_7296 = null;
    }

    final void method3525(int i, boolean bool) {
        if (i == 15192) {
            anInt7287++;
            OpenGL.glBindProgramARB(34336, aClass193_7293.anInt2584);
            OpenGL.glEnable(34336);
            this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DisplayModeManagerContainer343.aClass70_8737);
        }
    }

    AbstractShaderSub2(GlExtensionManager class377, CacheStore class45, Component209 class269) {
        super(class377);
        try {
            aClass377_7296 = class377;
            aClass269_7294 = class269;
            if (class45 == null || !aClass269_7294.method2039(100) || !aClass377_7296.aBoolean9923) aClass193_7293 = null;
            else aClass193_7293 = NodeBaseSub2.method3442(34336, class45.getFile("gl", "transparent_water", -29832), aClass377_7296, 4);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ov.<init>(" + (class377 != null ? "{...}" : "null") + ',' + (class45 != null ? "{...}" : "null") + ',' + (class269 != null ? "{...}" : "null") + ')'));
        }
    }

    final void method3521(boolean bool, byte i) {
        if (i != -103) aShortArrayArrayArray7290 = null;
        this.aHa_Sub3_4479.texStorage3D((DisplayModeManagerContainer64.aClass229_9011), 106, (ShaderCompilerSub3.aClass229_6519));
        anInt7292++;
    }

    final void method3520(byte i) {
        anInt7295++;
        if (i == 87) {
            this.aHa_Sub3_4479.setTextureCombineMode((byte) 47, 0, DisplayModeManagerContainer173.aClass70_4247);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    public static void clearStatics(int i) {
        aShortArrayArrayArray7290 = null;
        if (i != 34336) anInt7297 = 99;
    }

    final void method3526(int i, int i_5_, int i_6_) {
        anInt7286++;
        if (i == 10756) {
            if (aClass269_7294.aBoolean3458) {
                float f = (float) ((this.aHa_Sub3_4479.anInt8146) % 4000) / 4000.0F;
                this.aHa_Sub3_4479.setActiveTexture((byte) 79, aClass269_7294.anInterface18_Impl1_3452);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, f, 0.0F, 0.0F, 1.0F);
            } else {
                int i_7_ = (16 * (this.aHa_Sub3_4479.anInt8146 % 4000) / 4000);
                this.aHa_Sub3_4479.setActiveTexture((byte) -118, (aClass269_7294.anInterface18_Impl3Array3459[i_7_]));
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            }
        }
    }

    final boolean method3530(int i) {
        anInt7289++;
        if (i >= -57) return true;
        return aClass193_7293 != null;
    }

    /** Remove {@code string} from the ignore list and notify the server. */
    static final void removeIgnore(boolean bool, String string) {
        anInt7291++;
        if (string != null) {
            if (string.startsWith("*")) string = string.substring(1);
            String string_8_ = DebugPanicSub1.method2127(2, string);
            if (string_8_ != null) {
                if (bool != true) method3536(9, 65, -72, 107, null);
                for (int i = 0; (MenuEntry.ignoreCount > i); i++) {
                    String string_9_ = ObjectDefinition.ignoreNames[i];
                    if (string_9_.startsWith("*")) string_9_ = string_9_.substring(1);
                    string_9_ = DebugPanicSub1.method2127(2, string_9_);
                    if (string_9_ != null && string_9_.equals(string_8_)) {
                        MenuEntry.ignoreCount--;
                        for (int i_10_ = i; MenuEntry.ignoreCount > i_10_; i_10_++) {
                            ObjectDefinition.ignoreNames[i_10_] = ObjectDefinition.ignoreNames[i_10_ + 1];
                            DisplayModeManagerContainer145.ignoreDisplayNames[i_10_] = DisplayModeManagerContainer145.ignoreDisplayNames[1 + i_10_];
                            DefinitionSub21.ignoreLastNames[i_10_] = (DefinitionSub21.ignoreLastNames[1 + i_10_]);
                            ShaderSub2.ignoreLastDisplayNames[i_10_] = ShaderSub2.ignoreLastDisplayNames[1 + i_10_];
                            AbstractShaderSub3.ignoreTemporary[i_10_] = AbstractShaderSub3.ignoreTemporary[i_10_ - -1];
                        }
                        DebugPanicSub1.anInt8493++;
                        Component380.anInt4985 = ResourceLoader.anInt3918;
                        ParticleSystem class348_sub47 = ParticleShader.createOutboundPacket(GraphicsToolkit.aClass351_4571, (DisplayModeManagerContainer64.aClass77_9029), -123);
                        class348_sub47.particleBuffer.writeByte(false, Component31.method1745(string, -65));
                        class348_sub47.particleBuffer.writeString((byte) -5, string);
                        HashNodeSub14.enqueueOutboundPacket(118, class348_sub47);
                        break;
                    }
                }
            }
        }
    }
}
