/* Component103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component103
/**
 * RENAMED from `Class338` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    byte aByte4181;
    short aShort4182;
    short[] aShortArray4183;
    int[] anIntArray4184 = new int[4];
    short aShort4185;
    static int anInt4186;
    int[] anIntArray4187;
    short[] aShortArray4188;
    static int anInt4189;
    short aShort4190;
    int[] anIntArray4191 = new int[4];
    byte aByte4192;
    short aShort4193;
    short[] aShortArray4194;
    static int anInt4195;
    static int[] anIntArray4196 = new int[5];
    static Component251 aClass237_Sub1_4197;

    static final NodeSub41 method2661(int i, int i_0_, int i_1_, boolean bool, int i_2_) {
        if (i_2_ != 2) method2661(31, -43, 32, true, -110);
        anInt4189++;
        NodeSub41 class348_sub41 = new NodeSub41();
        class348_sub41.anInt7050 = i;
        class348_sub41.anInt7053 = i_1_;
        Component15.aClass356_4915.put((byte) 109, i_0_, class348_sub41);
        NodeSub7.method2772(i, (byte) 110);
        DisplayModeManagerContainer57 class46 = BitmapFont.getComponent(i_2_ + 1512932718, i_0_);
        if (class46 != null) Component111.markInterfaceDirty(-9343, class46);
        if (Component297.aClass46_4730 != null) {
            Component111.markInterfaceDirty(-9343, Component297.aClass46_4730);
            Component297.aClass46_4730 = null;
        }
        HashNodeSub17.method3270((byte) 120);
        if (class46 != null) Component111.layoutInterfaceTree(!bool, i_2_ + -104, class46);
        if (!bool) ClientScriptExecutor.runInterfaceScripts(i);
        if (!bool && r.anInt9721 != -1) Component205.method1775((byte) -8, r.anInt9721, 1);
        return class348_sub41;
    }

    public static void method2662(int i) {
        aClass237_Sub1_4197 = null;
        anIntArray4196 = null;
        if (i != 4) method2663(91, -57, -85, 14, 6);
    }

    static final void method2663(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt4195++;
        if (Buffer.anInt7207 == 1) {
            int i_7_ = i_3_ / Component255.anInt1067;
            int i_8_ = i_4_ / Component255.anInt1067;
            int i_9_ = i_5_ / AbstractBuffer.anInt4267;
            int i_10_ = i_6_ / AbstractBuffer.anInt4267;
            if (i_7_ < Component82.anInt425 && i_8_ >= 0 && AudioMixer.anInt3225 > i_9_ && i_10_ >= 0 && i == -5590) {
                if (i_8_ >= Component82.anInt425) i_8_ = -1 + Component82.anInt425;
                if (i_9_ < 0) i_9_ = 0;
                if (i_10_ >= AudioMixer.anInt3225) i_10_ = AudioMixer.anInt3225 + -1;
                if (i_7_ < 0) i_7_ = 0;
                for (int i_11_ = i_9_; i_11_ <= i_10_; i_11_++) {
                    int i_12_ = (Component360.method3452(i_11_ + ShaderProgram.anInt3682, (byte) -15, AudioMixer.anInt3225) * Component82.anInt425);
                    for (int i_13_ = i_7_; i_8_ >= i_13_; i_13_++) {
                        int i_14_ = (i_12_ + Component360.method3452((ColoredText.anInt6095 + i_13_), (byte) -15, Component82.anInt425));
                        Component72.anIntArray1909[i_14_] = Component212.anInt9997;
                    }
                }
            }
        }
    }

    Component103(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_) {
        this.aByte4192 = (byte) i;
        this.aByte4181 = (byte) i_15_;
        this.anIntArray4187 = new int[4];
        this.anIntArray4187[0] = i_16_;
        this.anIntArray4187[1] = i_17_;
        this.anIntArray4187[3] = i_19_;
        this.anIntArray4187[2] = i_18_;
        this.anIntArray4191[0] = i_20_;
        this.anIntArray4191[2] = i_22_;
        this.anIntArray4191[3] = i_23_;
        this.anIntArray4191[1] = i_21_;
        this.anIntArray4184[1] = i_25_;
        this.aShort4185 = (short) (i_16_ >> Component149.anInt4459);
        this.anIntArray4184[3] = i_27_;
        this.anIntArray4184[0] = i_24_;
        this.anIntArray4184[2] = i_26_;
        this.aShort4182 = (short) (i_18_ >> Component149.anInt4459);
        this.aShort4193 = (short) (i_24_ >> Component149.anInt4459);
        this.aShort4190 = (short) (i_26_ >> Component149.anInt4459);
        this.aShortArray4188 = new short[4];
        this.aShortArray4183 = new short[4];
        this.aShortArray4194 = new short[4];
    }
}
