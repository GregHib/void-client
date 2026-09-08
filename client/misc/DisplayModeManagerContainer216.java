/* DisplayModeManagerContainer216 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeManagerContainer216
/**
 * RENAMED from `Class75_Sub1` (JODE-obfuscated).
 * Evidence: subclass of DisplayModeManagerContainer229 (hierarchy)
 */ extends DisplayModeManagerContainer229 {
    static int anInt5652 = 1;
    static int anInt5653;
    static float aFloat5654 = 1.0F;

    static final void method769(int i, byte i_0_) {
        anInt5653++;
        if (i_0_ > 109 && Component233.method2547(i, (byte) 84)) HashNodeSub4.method3180(-1, (DefinitionSub33.openInterfaces[i]), 24235);
    }

    static final void method770(int i, int i_1_, int i_2_, DisplayModeManagerContainer28 class318_sub1_sub1) {
        Component186 class357 = NodeSub46.method3321(i, i_1_, i_2_);
        if (class357 != null) {
            class357.aClass318_Sub1_Sub1_4402 = class318_sub1_sub1;
            int i_3_ = ShaderSub1.aSArray5191 == Component9.aSArray4142 ? 1 : 0;
            if (class318_sub1_sub1.method2376(-93)) {
                if (class318_sub1_sub1.method2377((byte) 122)) {
                    class318_sub1_sub1.aClass318_Sub1_6379 = AudioMixer.aClass318_Sub1Array3226[i_3_];
                    AudioMixer.aClass318_Sub1Array3226[i_3_] = class318_sub1_sub1;
                } else {
                    class318_sub1_sub1.aClass318_Sub1_6379 = Node.aClass318_Sub1Array4293[i_3_];
                    Node.aClass318_Sub1Array4293[i_3_] = class318_sub1_sub1;
                    NodeSub16Sub2.aBoolean8870 = true;
                }
            } else {
                class318_sub1_sub1.aClass318_Sub1_6379 = Component95.aClass318_Sub1Array1754[i_3_];
                Component95.aClass318_Sub1Array1754[i_3_] = class318_sub1_sub1;
            }
        }
    }
}
