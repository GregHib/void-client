/* Component366 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component366
/**
 * RENAMED from `Class235` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt3050;
    private final RenderableObject aClass318_Sub1_3051;
    int anInt3052;
    private int anInt3053;
    private int anInt3054;
    private int anInt3055;
    private int anInt3056;
    private DisplayModeManagerContainer167 aClass17_3057;
    static int anInt3058;
    private DisplayModeManagerContainer370 aClass64_3059;
    private int anInt3060 = 0;
    static int anInt3061;
    static int anInt3062;
    int anInt3063;
    private boolean aBoolean3064;
    private final boolean aBoolean3065;
    static int anInt3066;
    private final byte aByte3067;
    static int[] anIntArray3068;
    private boolean aBoolean3069;
    static int anInt3070;
    private r aR3071;
    private boolean[] aBooleanArray3072;
    private int anInt3073;
    private int anInt3074;
    static SeekableFile aClass78_3075;
    static int anInt3076;
    static int anInt3077;
    static int anInt3078;
    int anInt3079;
    static int anInt3080;
    RenderableSub10 aClass318_Sub10_3081;
    static int anInt3082;
    private int anInt3083;
    private int anInt3084;
    private final byte aByte3085;
    static int anInt3086;
    static int anInt3087;

    final int method1663(int i) {
        if (i < 31) return 48;
        anInt3087++;
        return anInt3060;
    }

    final int method1664(int i) {
        if (i > -20) finalize();
        anInt3076++;
        return anInt3055;
    }

    final boolean method1665(int i) {
        if (i != 2) anInt3056 = -73;
        anInt3070++;
        return aBoolean3065;
    }

    private final void method1666(byte i, int i_0_) {
        anInt3077++;
        if (i != 69) aClass64_3059 = null;
        int i_1_ = i_0_;
        boolean bool = false;
        if (i_1_ == -1) {
            ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(i ^ 0x45, this.anInt3063);
            ObjectDefinition class51_2_ = class51;
            if (class51.anIntArray945 != null) class51 = class51.getTransformedDefinition((DisplayModeManagerContainer58.aClass170_10209), (byte) 47);
            if (class51 == null) return;
            if (class51_2_ == class51) class51_2_ = null;
            if (class51.anIntArray943 == null) {
                if (class51.anInt868 != -1) {
                    if (anInt3053 != class51.anInt941) {
                        i_1_ = class51.anInt868;
                        bool = class51.aBoolean924;
                    }
                } else if (class51_2_ != null && class51_2_.anIntArray943 != null) {
                    if (aClass17_3057 != null && class51_2_.method481((byte) 105, (aClass17_3057.anInt269))) return;
                    i_1_ = class51_2_.method489(i ^ ~0x45);
                    if (anInt3053 != class51_2_.anInt941) bool = class51_2_.aBoolean924;
                } else if (class51_2_ != null && (class51_2_.anInt868 != -1) && (anInt3053 != class51_2_.anInt941)) {
                    bool = class51_2_.aBoolean924;
                    i_1_ = class51_2_.anInt868;
                }
            } else {
                if (aClass17_3057 != null && class51.method481((byte) 73, aClass17_3057.anInt269)) return;
                i_1_ = class51.method489(i + -70);
                if (anInt3053 != class51.anInt941) bool = class51.aBoolean924;
            }
        }
        if (i_1_ == -1) aClass17_3057 = null;
        else {
            aClass64_3059 = null;
            if (aClass17_3057 != null && i_1_ == aClass17_3057.anInt269) {
                if (aClass17_3057.anInt248 == 0) return;
            } else aClass17_3057 = RunescapeInfo.aClass87_191.getSequence(i_1_, i + -62);
            if (aClass17_3057.anIntArray237 == null) aClass17_3057 = null;
            else {
                if (bool) {
                    anInt3084 = (int) ((double) (aClass17_3057.anIntArray237).length * Math.random());
                    anInt3054 = 1 + (int) ((double) (aClass17_3057.anIntArray267[anInt3084]) * Math.random());
                } else {
                    anInt3084 = 0;
                    anInt3054 = 1;
                }
                anInt3083 = anInt3084 - -1;
                if (anInt3083 < 0 || anInt3083 >= aClass17_3057.anIntArray237.length) anInt3083 = -1;
                anInt3074 = -anInt3054 + OpenGlShader.clientCycle;
            }
        }
    }

    final void method1667(byte i, GraphicsToolkit var_ha) {
        anInt3061++;
        method1668(true, true, i + -244, 262144, var_ha);
        if (i != 116) this.anInt3063 = 99;
    }

    final DisplayModeManagerContainer370 method1668(boolean bool, boolean bool_3_, int i, int i_4_, GraphicsToolkit var_ha) {
        anInt3082++;
        ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(0, this.anInt3063);
        if (class51.anIntArray945 != null) class51 = class51.getTransformedDefinition(DisplayModeManagerContainer58.aClass170_10209, (byte) 47);
        if (class51 == null) {
            method1674(-1, var_ha);
            anInt3073 = -1;
            anInt3056 = -1;
            anInt3053 = -1;
            return null;
        }
        if (!aBoolean3064 && class51.anInt941 != anInt3053) {
            aClass64_3059 = null;
            method1666((byte) 69, -1);
        }
        method1672(aClass318_Sub1_3051, true);
        if (bool_3_) {
            bool_3_ = bool_3_ & (aBoolean3065 & Component192.preferences.aClass239_Sub7_7238.method1748(-32350) != 0);
            bool_3_ = (bool_3_ & (class51.anInt941 != anInt3056 || (aClass17_3057 != null && Component192.preferences.aClass239_Sub7_7238.method1748(-32350) >= 2 && (anInt3084 != anInt3073 || ((aClass17_3057.aBoolean254 || DisplayModeManagerContainer332.aBoolean5002) && (anInt3083 != anInt3084))))));
        }
        if (bool && !bool_3_) {
            anInt3053 = class51.anInt941;
            return null;
        }
        if (bool_3_) {
            RequestProcessor.method1301(aR3071, aByte3067, (aClass318_Sub1_3051.x), (aClass318_Sub1_3051.y), aBooleanArray3072);
            anInt3056 = -1;
            anInt3073 = -1;
        }
        if (i > -126) return null;
        s var_s = ShaderSub1.aSArray5191[aByte3067];
        s var_s_5_;
        if (!aBoolean3069) var_s_5_ = aByte3067 >= 3 ? null : ShaderSub1.aSArray5191[1 + aByte3067];
        else var_s_5_ = NodeSub1Sub1.aSArray8801[0];
        DisplayModeManagerContainer370 class64 = null;
        if (aClass17_3057 == null) {
            if (aClass64_3059 == null || i_4_ != (i_4_ & aClass64_3059.ua()) || (anInt3053 != class51.anInt941)) {
                if (aClass64_3059 != null) i_4_ |= aClass64_3059.ua();
                Component245 class2 = (class51.buildLocationModel(var_ha, var_s_5_, (this.anInt3079 != 11 ? this.anInt3079 : 10), i_4_, aClass318_Sub1_3051.x, bool_3_, var_s, var_s.getInterpolatedHeight((aClass318_Sub1_3051.x), (aClass318_Sub1_3051.y), (byte) -114), aClass318_Sub1_3051.y, (this.anInt3079 == 11 ? 4 + this.anInt3052 : this.anInt3052), 128));
                if (class2 == null) {
                    anInt3055 = 0;
                    aBooleanArray3072 = null;
                    aR3071 = null;
                    anInt3060 = 0;
                    aClass64_3059 = null;
                } else {
                    aClass64_3059 = class64 = class2.aClass64_119;
                    if (bool_3_) {
                        aBooleanArray3072 = null;
                        aR3071 = class2.aR118;
                        Component387.method1130(aR3071, aByte3067, aClass318_Sub1_3051.x, aClass318_Sub1_3051.y, null);
                        anInt3073 = -1;
                        anInt3056 = class51.anInt941;
                    }
                    anInt3060 = class64.fa();
                    anInt3055 = class64.ma();
                }
            } else class64 = aClass64_3059;
        } else {
            if (bool_3_) i_4_ |= 0x40000;
            class64 = (class51.method483(anInt3083, anInt3054, (this.anInt3079 == 11 ? 10 : this.anInt3079), var_s.getInterpolatedHeight((aClass318_Sub1_3051.x), (aClass318_Sub1_3051.y), (byte) -2), var_ha, (this.anInt3079 == 11 ? this.anInt3052 + 4 : this.anInt3052), i_4_, (byte) 76, var_s_5_, aClass318_Sub1_3051.y, anInt3084, aClass318_Sub1_3051.x, aClass17_3057, var_s));
            if (class64 == null) {
                anInt3055 = 0;
                aBooleanArray3072 = null;
                anInt3060 = 0;
                aR3071 = null;
            } else {
                if (bool_3_) {
                    if (aBooleanArray3072 == null) aBooleanArray3072 = new boolean[4];
                    aR3071 = class64.BufferedToolkit(aR3071);
                    Component387.method1130(aR3071, aByte3067, (aClass318_Sub1_3051.x), (aClass318_Sub1_3051.y), aBooleanArray3072);
                    anInt3073 = anInt3084;
                    anInt3056 = class51.anInt941;
                }
                anInt3060 = class64.fa();
                anInt3055 = class64.ma();
            }
            aClass64_3059 = null;
        }
        anInt3053 = class51.anInt941;
        return class64;
    }

    static final String method1669(int i, int i_6_) {
        if (i != -19918) method1669(75, 33);
        anInt3066++;
        return ((0xff & i_6_ >> 24) + "." + ((i_6_ & 0xffb428) >> 16) + "." + (i_6_ >> 8 & 0xff) + "." + (i_6_ & 0xff));
    }

    final void method1670(int i, DisplayModeManagerContainer204 class101, int i_7_, GraphicsToolkit var_ha, int i_8_, DisplayModeManagerContainer370 class64, boolean bool, byte i_9_, int i_10_) {
        do {
            try {
                anInt3058++;
                if (i_9_ != -73) this.anInt3052 = 62;
                Component30[] class129s = class64.method619();
                DisplayModeManagerContainer173[] class342s = class64.method604();
                if ((this.aClass318_Sub10_3081 == null || this.aClass318_Sub10_3081.aBoolean6470) && (class129s != null || class342s != null)) {
                    ObjectDefinition class51 = GradientPreset.aClass263_9195.getObjectDefinition(0, this.anInt3063);
                    if (class51.anIntArray945 != null) class51 = class51.getTransformedDefinition((DisplayModeManagerContainer58.aClass170_10209), (byte) 47);
                    if (class51 != null) this.aClass318_Sub10_3081 = RenderableSub10.method2526(OpenGlShader.clientCycle, true);
                }
                if (this.aClass318_Sub10_3081 == null) break;
                class64.transformVertices(class101);
                if (bool) this.aClass318_Sub10_3081.method2536(var_ha, OpenGlShader.clientCycle, class129s, class342s, false);
                else this.aClass318_Sub10_3081.method2540(OpenGlShader.clientCycle);
                this.aClass318_Sub10_3081.method2533(aByte3085, i_8_, i, i_10_, i_7_);
            } catch (RuntimeException runtimeexception) {
                throw NpcDefinition.wrapThrowable(runtimeexception, ("bv.E(" + i + ',' + (class101 != null ? "{...}" : "null") + ',' + i_7_ + ',' + (var_ha != null ? "{...}" : "null") + ',' + i_8_ + ',' + (class64 != null ? "{...}" : "null") + ',' + bool + ',' + i_9_ + ',' + i_10_ + ')'));
            }
            break;
        } while (false);
    }

    final void method1671(int i, int i_11_) {
        aBoolean3064 = true;
        anInt3078++;
        method1666((byte) 69, i_11_);
        if (i != 262144) aClass78_3075 = null;
    }

    protected final void finalize() {
        anInt3080++;
        if (this.aClass318_Sub10_3081 != null) this.aClass318_Sub10_3081.method2534();
    }

    private final void method1672(RenderableObject class318_sub1, boolean bool) {
        if (bool != true) method1674(-55, null);
        anInt3086++;
        int i;
        while_76_:
        for (; ; ) {
            if (aClass17_3057 == null) {
                if (aBoolean3064) return;
                method1666((byte) 69, -1);
                if (aClass17_3057 == null) return;
            }
            i = -anInt3074 + OpenGlShader.clientCycle;
            if (i > 100 && aClass17_3057.anInt238 > 0) {
                int i_12_;
                for (i_12_ = (-aClass17_3057.anInt238 + aClass17_3057.anIntArray237.length); (anInt3084 < i_12_ && (aClass17_3057.anIntArray267[anInt3084] < i)); anInt3084++)
                    i -= aClass17_3057.anIntArray267[anInt3084];
                if (i_12_ <= anInt3084) {
                    int i_13_ = 0;
                    for (int i_14_ = i_12_; (aClass17_3057.anIntArray237.length > i_14_); i_14_++)
                        i_13_ += aClass17_3057.anIntArray267[i_14_];
                    i %= i_13_;
                }
                anInt3083 = 1 + anInt3084;
                if (anInt3083 >= aClass17_3057.anIntArray237.length) {
                    anInt3083 -= aClass17_3057.anInt238;
                    if (anInt3083 < 0 || anInt3083 >= aClass17_3057.anIntArray237.length) anInt3083 = -1;
                }
            }
            for (; ; ) {
                if (aClass17_3057.anIntArray267[anInt3084] >= i) break while_76_;
                DisplayModeManagerContainer260.method2178(class318_sub1, anInt3084, aClass17_3057, -99);
                i -= aClass17_3057.anIntArray267[anInt3084];
                anInt3084++;
                if (aClass17_3057.anIntArray237.length <= anInt3084) {
                    anInt3084 -= aClass17_3057.anInt238;
                    if (anInt3084 < 0 || anInt3084 >= aClass17_3057.anIntArray237.length) {
                        aClass17_3057 = null;
                        break;
                    }
                }
                anInt3083 = anInt3084 + 1;
                if (aClass17_3057.anIntArray237.length <= anInt3083) {
                    anInt3083 -= aClass17_3057.anInt238;
                    if (anInt3083 < 0 || (anInt3083 >= aClass17_3057.anIntArray237.length)) anInt3083 = -1;
                }
            }
        }
        anInt3054 = i;
        anInt3074 = -i + OpenGlShader.clientCycle;
    }

    public static void method1673(int i) {
        aClass78_3075 = null;
        anIntArray3068 = null;
        if (i >= -19) method1669(-110, -13);
    }

    Component366(GraphicsToolkit var_ha, ObjectDefinition class51, int i, int i_15_, int i_16_, int i_17_, RenderableObject class318_sub1, boolean bool, int i_18_) {
        anInt3055 = 0;
        aBoolean3064 = false;
        anInt3053 = -1;
        aBoolean3069 = false;
        anInt3056 = -1;
        anInt3073 = -1;
        try {
            this.anInt3079 = i;
            this.anInt3063 = class51.anInt941;
            aClass318_Sub1_3051 = class318_sub1;
            aByte3085 = (byte) i_16_;
            aByte3067 = (byte) i_17_;
            aBoolean3069 = bool;
            this.anInt3052 = i_15_;
            aBoolean3065 = (var_ha.method3682() && class51.aBoolean894 && !aBoolean3069);
            if (i_18_ != -1) aBoolean3064 = true;
            method1666((byte) 69, i_18_);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("bv.<init>(" + (var_ha != null ? "{...}" : "null") + ',' + (class51 != null ? "{...}" : "null") + ',' + i + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + bool + ',' + i_18_ + ')'));
        }
    }

    final void method1674(int i, GraphicsToolkit var_ha) {
        if (i != -1) aBoolean3064 = false;
        if (aR3071 != null) {
            RequestProcessor.method1301(aR3071, aByte3067, (aClass318_Sub1_3051.x), (aClass318_Sub1_3051.y), aBooleanArray3072);
            aR3071 = null;
            aBooleanArray3072 = null;
        }
        anInt3050++;
    }
}
