/* HashNodeSub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class HashNodeSub16
/**
 * RENAMED from {@code Class348_Sub42_Sub16} (JODE-obfuscated).
 * Base for JS5/on-demand archive download nodes (TCP or disk).
 * {@link #incomplete} stays true until payload is fully received;
 * {@link #priority} marks urgent (opcode 1) vs normal (opcode 0) requests.
 */ extends HashNode {
    static Component158 aClass21_9661;
    static int anInt9662;
    /** True for priority (urgent) requests. */
    boolean priority;
    /** True until the full archive payload has been received. */
    volatile boolean incomplete = true;
    static String aString9665 = null;
    static int anInt9666;
    /** Two-tick discard mark for completed non-priority requests. */
    boolean markedForDiscard;
    static int anInt9668;

    public static void method3252(int i) {
        aClass21_9661 = null;
        aString9665 = null;
        if (i != 353) aClass21_9661 = null;
    }

    static final void method3253(int i, int i_0_, int i_1_, Class var_class) {
        Component186 class357 = Component335.aClass357ArrayArrayArray2029[i][i_0_][i_1_];
        if (class357 != null) {
            for (Component3 class148 = class357.aClass148_4396; class148 != null; class148 = class148.aClass148_2038) {
                Component327 class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040;
                if (var_class.isAssignableFrom(class318_sub1_sub3.getClass()) && (class318_sub1_sub3.aShort8743 == i_0_) && (class318_sub1_sub3.aShort8750 == i_1_)) {
                    NodeSub46.method3320(class318_sub1_sub3, false);
                    break;
                }
            }
        }
    }

    static final void method3254(int i, int i_2_, int i_3_, Component269 class318_sub1_sub4, Component269 class318_sub1_sub4_4_) {
        Component186 class357 = NodeSub46.method3321(i, i_2_, i_3_);
        if (class357 != null) {
            class357.aClass318_Sub1_Sub4_4406 = class318_sub1_sub4;
            class357.aClass318_Sub1_Sub4_4403 = class318_sub1_sub4_4_;
            int i_5_ = ShaderSub1.aSArray5191 == Component9.aSArray4142 ? 1 : 0;
            if (class318_sub1_sub4.method2376(-109)) {
                if (class318_sub1_sub4.method2377((byte) 122)) {
                    class318_sub1_sub4.aClass318_Sub1_6379 = AudioMixer.aClass318_Sub1Array3226[i_5_];
                    AudioMixer.aClass318_Sub1Array3226[i_5_] = class318_sub1_sub4;
                } else {
                    class318_sub1_sub4.aClass318_Sub1_6379 = Node.aClass318_Sub1Array4293[i_5_];
                    Node.aClass318_Sub1Array4293[i_5_] = class318_sub1_sub4;
                    NodeSub16Sub2.aBoolean8870 = true;
                }
            } else {
                class318_sub1_sub4.aClass318_Sub1_6379 = Component95.aClass318_Sub1Array1754[i_5_];
                Component95.aClass318_Sub1Array1754[i_5_] = class318_sub1_sub4;
            }
            if (class318_sub1_sub4_4_ != null) {
                if (class318_sub1_sub4_4_.method2376(-118)) {
                    if (class318_sub1_sub4_4_.method2377((byte) 122)) {
                        class318_sub1_sub4_4_.aClass318_Sub1_6379 = AudioMixer.aClass318_Sub1Array3226[i_5_];
                        AudioMixer.aClass318_Sub1Array3226[i_5_] = class318_sub1_sub4_4_;
                    } else {
                        class318_sub1_sub4_4_.aClass318_Sub1_6379 = Node.aClass318_Sub1Array4293[i_5_];
                        Node.aClass318_Sub1Array4293[i_5_] = class318_sub1_sub4_4_;
                        NodeSub16Sub2.aBoolean8870 = true;
                    }
                } else {
                    class318_sub1_sub4_4_.aClass318_Sub1_6379 = Component95.aClass318_Sub1Array1754[i_5_];
                    Component95.aClass318_Sub1Array1754[i_5_] = class318_sub1_sub4_4_;
                }
            }
        }
    }

    /**
     * Encodes {@code string[i..i_6_)} as CP1252 into {@code is} at {@code i_7_}.
     * Unmappable chars become {@code '?'}. Returns bytes written.
     */
    static final int encodeCp1252Into(int i, byte[] is, int i_6_, boolean bool, String string, int i_7_) {
        try {
            anInt9666++;
            if (bool != false) return -119;
            int i_8_ = -i + i_6_;
            for (int i_9_ = 0; i_8_ > i_9_; i_9_++) {
                int i_10_ = string.charAt(i_9_ + i);
                if (i_10_ > 0 && i_10_ < 128 || i_10_ >= 160 && i_10_ <= 255) is[i_7_ + i_9_] = (byte) i_10_;
                else if (i_10_ == 8364) is[i_9_ + i_7_] = (byte) -128;
                else if (i_10_ == 8218) is[i_9_ + i_7_] = (byte) -126;
                else if (i_10_ == 402) is[i_7_ - -i_9_] = (byte) -125;
                else if (i_10_ != 8222) {
                    if (i_10_ != 8230) {
                        if (i_10_ != 8224) {
                            if (i_10_ == 8225) is[i_9_ + i_7_] = (byte) -121;
                            else if (i_10_ == 710) is[i_7_ + i_9_] = (byte) -120;
                            else if (i_10_ == 8240) is[i_7_ - -i_9_] = (byte) -119;
                            else if (i_10_ != 352) {
                                if (i_10_ == 8249) is[i_9_ + i_7_] = (byte) -117;
                                else if (i_10_ == 338) is[i_9_ + i_7_] = (byte) -116;
                                else if (i_10_ == 381) is[i_7_ + i_9_] = (byte) -114;
                                else if (i_10_ != 8216) {
                                    if (i_10_ == 8217) is[i_7_ - -i_9_] = (byte) -110;
                                    else if (i_10_ == 8220) is[i_7_ + i_9_] = (byte) -109;
                                    else if (i_10_ == 8221) is[i_7_ + i_9_] = (byte) -108;
                                    else if (i_10_ == 8226) is[i_7_ + i_9_] = (byte) -107;
                                    else if (i_10_ != 8211) {
                                        if (i_10_ == 8212) is[i_7_ + i_9_] = (byte) -105;
                                        else if (i_10_ != 732) {
                                            if (i_10_ != 8482) {
                                                if (i_10_ != 353) {
                                                    if (i_10_ == 8250) is[i_7_ - -i_9_] = (byte) -101;
                                                    else if (i_10_ == 339) is[i_7_ - -i_9_] = (byte) -100;
                                                    else if (i_10_ != 382) {
                                                        if (i_10_ != 376) is[i_9_ + i_7_] = (byte) 63;
                                                        else is[i_7_ + i_9_] = (byte) -97;
                                                    } else is[i_7_ - -i_9_] = (byte) -98;
                                                } else is[i_9_ + i_7_] = (byte) -102;
                                            } else is[i_9_ + i_7_] = (byte) -103;
                                        } else is[i_9_ + i_7_] = (byte) -104;
                                    } else is[i_7_ - -i_9_] = (byte) -106;
                                } else is[i_7_ + i_9_] = (byte) -111;
                            } else is[i_7_ - -i_9_] = (byte) -118;
                        } else is[i_9_ + i_7_] = (byte) -122;
                    } else is[i_7_ - -i_9_] = (byte) -123;
                } else is[i_7_ - -i_9_] = (byte) -124;
            }
            return i_8_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ffa.E(" + i + ',' + (is != null ? "{...}" : "null") + ',' + i_6_ + ',' + bool + ',' + (string != null ? "{...}" : "null") + ',' + i_7_ + ')'));
        }
    }

    static final int method3256(int i) {
        anInt9662++;
        if (NodeSub1.anIntArray6547 == null) return 0;
        if (i != 2) aClass21_9661 = null;
        return 2 * NodeSub1.anIntArray6547.length;
    }

    abstract int getProgressPercent(int i);

    public HashNodeSub16() {
        /* empty */
    }

    static final float[] method3258(int i, int i_11_, float[] fs) {
        anInt9668++;
        float[] fs_12_ = new float[i_11_];
        Component313.method1574(fs, 0, fs_12_, i, i_11_);
        return fs_12_;
    }

    abstract byte[] getData(int i);

    static {
        aClass21_9661 = new Component158();
    }
}
