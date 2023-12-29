/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class167 {
    private final ha_Sub1 aHa_Sub1_2191;
    int anInt2192;
    static int anInt2193;
    static int anInt2194;
    boolean aBoolean2195 = false;
    static Class114 aClass114_2196 = new Class114(111, -1);
    int anInt2197;
    Runnable aRunnable2198;
    static int anInt2199;
    static int anInt2200;
    boolean aBoolean2201;
    boolean aBoolean2202;
    static float aFloat2203;
    static int anInt2204 = 0;
    int anInt2205;
    static int anInt2206;
    static Class229 aClass229_2207 = new Class229();
    static Index aIndex_2208;
    Class101_Sub1 aClass101_Sub1_2209;
    int anInt2210;
    int anInt2211;
    int[] anIntArray2212;
    int[] anIntArray2213;
    int[] anIntArray2214;
    int anInt2215;
    int[] anIntArray2216;
    int[] anIntArray2217;
    int[] anIntArray2218;
    Class64_Sub1 aClass64_Sub1_2219;
    Class109 aClass109_2220;
    int anInt2221;
    int[] anIntArray2222;
    Class64_Sub1 aClass64_Sub1_2223;
    Class64_Sub1 aClass64_Sub1_2224;
    Class64_Sub1 aClass64_Sub1_2225;
    float[] aFloatArray2226;
    Class64_Sub1 aClass64_Sub1_2227;
    int[] anIntArray2228;
    int anInt2229;
    int[] anIntArray2230;
    Class64_Sub1 aClass64_Sub1_2231;
    int[] anIntArray2232;
    Class64_Sub1 aClass64_Sub1_2233;
    int[] anIntArray2234;
    int[] anIntArray2235;
    int[] anIntArray2236;
    int[] anIntArray2237;
    int[] anIntArray2238;
    Class64_Sub1 aClass64_Sub1_2239;
    int[] anIntArray2240;
    int[] anIntArray2241;
    int[] anIntArray2242;
    Class64_Sub1 aClass64_Sub1_2243;
    int[] anIntArray2244;
    int[] anIntArray2245;
    Class64_Sub1 aClass64_Sub1_2246;
    int[] anIntArray2247;

    final void method1291(int i, Runnable runnable) {
        if (i == 10000) {
            this.aRunnable2198 = runnable;
            anInt2193++;
        }
    }

    final void method1292(int i) {
        if (i == 64) {
            anInt2194++;
            this.aClass109_2220 = new Class109(aHa_Sub1_2191, this);
        }
    }

    public static void method1293(int i) {
        aClass114_2196 = null;
        aIndex_2208 = null;
        aClass229_2207 = null;
        if (i != 1) method1295(null, -117, -102);
    }

    static final boolean method1294(byte i, byte[] is) {
        anInt2199++;
        Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
        if (i > -98) method1294((byte) 73, null);
        int i_0_ = class348_sub49.readUnsignedByte(255);
        if (i_0_ != 2) return false;
        boolean bool = class348_sub49.readUnsignedByte(255) == 1;
        if (bool) Class59_Sub2_Sub2.method569((byte) -123, class348_sub49);
        Class348_Sub42_Sub6.method3188((byte) -67, class348_sub49);
        return true;
    }

    static final void method1295(Class318_Sub1[] class318_sub1s, int i, int i_1_) {
        if (i < i_1_) {
            int i_2_ = (i + i_1_) / 2;
            int i_3_ = i;
            Class318_Sub1 class318_sub1 = class318_sub1s[i_2_];
            class318_sub1s[i_2_] = class318_sub1s[i_1_];
            class318_sub1s[i_1_] = class318_sub1;
            int i_4_ = class318_sub1.anInt6389;
            for (int i_5_ = i; i_5_ < i_1_; i_5_++) {
                if (class318_sub1s[i_5_].anInt6389 < i_4_ + (i_5_ & 0x1)) {
                    Class318_Sub1 class318_sub1_6_ = class318_sub1s[i_5_];
                    class318_sub1s[i_5_] = class318_sub1s[i_3_];
                    class318_sub1s[i_3_++] = class318_sub1_6_;
                }
            }
            class318_sub1s[i_1_] = class318_sub1s[i_3_];
            class318_sub1s[i_3_] = class318_sub1;
            method1295(class318_sub1s, i, i_3_ - 1);
            method1295(class318_sub1s, i_3_ + 1, i_1_);
        }
    }

    static final boolean method1296(boolean bool) {
        if (bool != true) method1297((byte) 88, null, null, null, null);
        anInt2200++;
        if (Class348_Sub43.anInt7068 != 0) return true;
        return Class98.aClass348_Sub16_Sub3_1564.method2860(120);
    }

    static final void method1297(byte i, Player player, int[] is, int[] is_7_, int[] is_8_) {
        try {
            anInt2206++;
            if (i > -96) aFloat2203 = 0.6824298F;
            for (int i_9_ = 0; is_7_.length > i_9_; i_9_++) {
                int i_10_ = is_7_[i_9_];
                int i_11_ = is[i_9_];
                int i_12_ = is_8_[i_9_];
                for (int i_13_ = 0; i_11_ != 0 && i_13_ < (player.aClass182Array10308).length; i_11_ >>>= 1) {
                    if ((i_11_ & 0x1) != 0) {
                        if (i_10_ != -1) {
                            Class17 class17 = Class10.aClass87_191.method835(i_10_, 7);
                            int i_14_ = class17.anInt248;
                            Class182 class182 = (player.aClass182Array10308[i_13_]);
                            if (class182 != null) {
                                if (class182.anInt2454 == i_10_) {
                                    if (i_14_ == 0) class182 = player.aClass182Array10308[i_13_] = null;
                                    else if (i_14_ == 1) {
                                        class182.anInt2448 = i_12_;
                                        class182.anInt2455 = 1;
                                        class182.anInt2456 = 0;
                                        class182.anInt2451 = 0;
                                        class182.anInt2445 = 0;
                                        if (!player.aBoolean10309) Class287.method2178(player, 0, class17, -54);
                                    } else if (i_14_ == 2) class182.anInt2445 = 0;
                                } else if (class17.anInt239 >= Class10.aClass87_191.method835((class182.anInt2454), 7).anInt239) class182 = player.aClass182Array10308[i_13_] = null;
                            }
                            if (class182 == null) {
                                class182 = player.aClass182Array10308[i_13_] = new Class182();
                                class182.anInt2445 = 0;
                                class182.anInt2455 = 1;
                                class182.anInt2448 = i_12_;
                                class182.anInt2456 = 0;
                                class182.anInt2454 = i_10_;
                                class182.anInt2451 = 0;
                                if (!player.aBoolean10309) Class287.method2178(player, 0, class17, -123);
                            }
                        } else player.aClass182Array10308[i_13_] = null;
                    }
                    i_13_++;
                }
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("pga.G(" + i + ',' + (player != null ? "{...}" : "null") + ',' + (is != null ? "{...}" : "null") + ',' + (is_7_ != null ? "{...}" : "null") + ',' + (is_8_ != null ? "{...}" : "null") + ')'));
        }
    }

    Class167(ha_Sub1 var_ha_Sub1) {
        this.anInt2192 = 0;
        this.anInt2197 = 0;
        this.anInt2205 = 0;
        this.aBoolean2202 = true;
        this.anInt2211 = 0;
        this.aClass101_Sub1_2209 = new Class101_Sub1();
        this.anIntArray2213 = new int[Class64_Sub1.anInt5350];
        this.anIntArray2214 = new int[Class64_Sub1.anInt5350];
        this.anIntArray2212 = new int[64];
        this.aFloatArray2226 = new float[2];
        this.anIntArray2216 = new int[10000];
        this.anIntArray2222 = new int[Class64_Sub1.anInt5350];
        this.anIntArray2232 = new int[64];
        this.anIntArray2218 = new int[8];
        this.anIntArray2237 = new int[Class64_Sub1.anInt5350];
        this.anIntArray2236 = new int[10000];
        this.anIntArray2230 = new int[Class64_Sub1.anInt5350];
        this.anIntArray2240 = new int[10];
        this.anIntArray2228 = new int[64];
        this.anIntArray2238 = new int[10];
        this.anIntArray2241 = new int[8];
        this.anIntArray2235 = new int[10];
        this.anIntArray2245 = new int[8];
        this.anIntArray2217 = new int[64];
        this.anIntArray2244 = new int[Class64_Sub1.anInt5350];
        this.anIntArray2247 = new int[10];
        this.anIntArray2234 = new int[Class64_Sub1.anInt5350];
        aHa_Sub1_2191 = var_ha_Sub1;
        this.anInt2210 = aHa_Sub1_2191.anInt7494 + -255;
        this.aClass109_2220 = new Class109(var_ha_Sub1, this);
        this.aClass64_Sub1_2243 = new Class64_Sub1(aHa_Sub1_2191);
        this.aClass64_Sub1_2224 = new Class64_Sub1(aHa_Sub1_2191);
        this.aClass64_Sub1_2219 = new Class64_Sub1(aHa_Sub1_2191);
        this.aClass64_Sub1_2239 = new Class64_Sub1(aHa_Sub1_2191);
        this.aClass64_Sub1_2233 = new Class64_Sub1(aHa_Sub1_2191);
        this.aClass64_Sub1_2231 = new Class64_Sub1(aHa_Sub1_2191);
        this.aClass64_Sub1_2223 = new Class64_Sub1(aHa_Sub1_2191);
        this.aClass64_Sub1_2227 = new Class64_Sub1(aHa_Sub1_2191);
        this.aClass64_Sub1_2246 = new Class64_Sub1(aHa_Sub1_2191);
        this.aClass64_Sub1_2225 = new Class64_Sub1(aHa_Sub1_2191);
        this.anIntArray2242 = new int[Class64_Sub1.anInt5346];
        for (int i = 0; Class64_Sub1.anInt5346 > i; i++)
            this.anIntArray2242[i] = -1;
    }
}
