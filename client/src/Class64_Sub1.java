/* Class64_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class64_Sub1 extends Class64 {
    private short[] aShortArray5311;
    private int[] anIntArray5312;
    private Class360[] aClass360Array5313;
    private float[][] aFloatArrayArray5314;
    private int[] anIntArray5315;
    private int anInt5316;
    private short[] aShortArray5317;
    private int[] anIntArray5318;
    private Class64_Sub1 aClass64_Sub1_5319;
    private Class101_Sub1 aClass101_Sub1_5320;
    private int[] anIntArray5321;
    private Class129[] aClass129Array5322;
    private boolean aBoolean5323 = false;
    private short aShort5324;
    private byte[] aByteArray5325;
    private int[] anIntArray5326;
    private short[] aShortArray5327;
    private Class64_Sub1 aClass64_Sub1_5328;
    private short aShort5329;
    private int[][] anIntArrayArray5330;
    private short aShort5331;
    private int[] anIntArray5332;
    private short[] aShortArray5333;
    private int[][] anIntArrayArray5334;
    private Class342[] aClass342Array5335;
    private Class167 aClass167_5336;
    private int[] anIntArray5337;
    private int anInt5338;
    private Class64_Sub1 aClass64_Sub1_5339;
    private int anInt5340 = 0;
    private static int anInt5341;
    private int anInt5342;
    private int[] anIntArray5343;
    private int anInt5344;
    private float[][] aFloatArrayArray5345;
    static int anInt5346 = 4096;
    private Class64_Sub1 aClass64_Sub1_5347;
    private short aShort5348;
    private int anInt5349;
    static int anInt5350;
    private int anInt5351;
    private short aShort5352;
    private final ha_Sub1 aHa_Sub1_5353;
    private int anInt5354;
    private int[] anIntArray5355;
    private int[] anIntArray5356;
    private boolean aBoolean5357 = false;
    private byte[] aByteArray5358;
    private int[] anIntArray5359;
    private Class360[] aClass360Array5360;
    private Class6[] aClass6Array5361;
    private int[] anIntArray5362;
    private Class350[] aClass350Array5363;
    private short[] aShortArray5364;
    private short aShort5365;
    private int[] anIntArray5366;
    private Class167 aClass167_5367;
    private int[] anIntArray5368;
    private boolean aBoolean5369;
    private short[] aShortArray5370;
    private int[] anIntArray5371;
    private boolean aBoolean5372;
    private int[] anIntArray5373;
    private Class64_Sub1 aClass64_Sub1_5374;
    private int anInt5375;
    private Class64_Sub1 aClass64_Sub1_5376;
    private int[] anIntArray5377;
    private Class64_Sub1 aClass64_Sub1_5378;
    private int[][] anIntArrayArray5379;
    private boolean aBoolean5380;
    private int[] anIntArray5381;
    private boolean aBoolean5382;
    private Class109 aClass109_5383;
    private int[] anIntArray5384;
    private Class41[] aClass41Array5385;
    private byte[] aByteArray5386;
    private int anInt5387;
    private short[] aShortArray5388;
    private int anInt5389;
    private Class64_Sub1 aClass64_Sub1_5390;
    private boolean aBoolean5391;
    private int[] anIntArray5392;
    private short aShort5393;
    private short[] aShortArray5394;
    private short aShort5395;
    private Class64_Sub1 aClass64_Sub1_5396;
    private Class64_Sub1 aClass64_Sub1_5397;
    private int[] anIntArray5398;
    private int[] anIntArray5399;
    private int[] anIntArray5400;

    private final boolean method629(int i) {
        if (aByteArray5325 == null)
            return false;
		return aByteArray5325[i] != 0;
	}

    private final boolean method630(int i, int i_0_, int i_1_, int i_2_,
                                    int i_3_, int i_4_, int i_5_, int i_6_) {
        if (i_0_ < i_1_ && i_0_ < i_2_ && i_0_ < i_3_)
            return false;
        if (i_0_ > i_1_ && i_0_ > i_2_ && i_0_ > i_3_)
            return false;
        if (i < i_4_ && i < i_5_ && i < i_6_)
            return false;
		return i <= i_4_ || i <= i_5_ || i <= i_6_;
	}

    private final void method631() {
        aClass360Array5360 = null;
        aClass360Array5313 = null;
        aClass41Array5385 = null;
        aBoolean5323 = false;
    }

    final int EA() {
        if (!aBoolean5323)
            method655();
        return aShort5365;
    }

    private final void method632(Thread thread) {
        Class167 class167 = aHa_Sub1_5353.method3724(thread);
        aClass109_5383 = class167.aClass109_2220;
        if (class167 != aClass167_5367) {
            aClass167_5367 = class167;
            anIntArray5362 = aClass167_5367.anIntArray2222;
            anIntArray5399 = aClass167_5367.anIntArray2244;
            anIntArray5384 = aClass167_5367.anIntArray2214;
            anIntArray5392 = aClass167_5367.anIntArray2237;
            anIntArray5321 = aClass167_5367.anIntArray2234;
            anIntArray5343 = aClass167_5367.anIntArray2230;
            anIntArray5355 = aClass167_5367.anIntArray2213;
            anIntArray5359 = aClass167_5367.anIntArray2218;
            anIntArray5373 = aClass167_5367.anIntArray2241;
            anIntArray5398 = aClass167_5367.anIntArray2245;
            anIntArray5315 = aClass167_5367.anIntArray2238;
            anIntArray5371 = aClass167_5367.anIntArray2247;
            anIntArray5381 = aClass167_5367.anIntArray2235;
            anIntArray5377 = aClass167_5367.anIntArray2240;
            anIntArray5326 = aClass167_5367.anIntArray2236;
            anIntArray5318 = aClass167_5367.anIntArray2216;
            anIntArray5400 = aClass167_5367.anIntArray2242;
        }
    }

    private final Class64 method633(Class64_Sub1 class64_sub1_7_,
                                    Class64_Sub1 class64_sub1_8_, int i,
                                    boolean bool, boolean bool_9_) {
        class64_sub1_7_.aBoolean5323 = aBoolean5323;
        if (aBoolean5323) {
            class64_sub1_7_.aShort5393 = aShort5393;
            class64_sub1_7_.aShort5365 = aShort5365;
            class64_sub1_7_.aShort5331 = aShort5331;
            class64_sub1_7_.aShort5395 = aShort5395;
            class64_sub1_7_.aShort5329 = aShort5329;
            class64_sub1_7_.aShort5352 = aShort5352;
            class64_sub1_7_.aShort5324 = aShort5324;
            class64_sub1_7_.aShort5348 = aShort5348;
        }
        class64_sub1_7_.anInt5344 = anInt5344;
        class64_sub1_7_.anInt5349 = anInt5349;
        class64_sub1_7_.anInt5340 = anInt5340;
        class64_sub1_7_.anInt5387 = anInt5387;
        class64_sub1_7_.anInt5351 = anInt5351;
        class64_sub1_7_.anInt5389 = anInt5389;
        if ((i & 0x100) != 0)
            class64_sub1_7_.aBoolean5382 = true;
        else
            class64_sub1_7_.aBoolean5382 = aBoolean5382;
        class64_sub1_7_.aBoolean5391 = aBoolean5391;
        boolean bool_10_ = (i & 0x7) == 7 | (i & 0x20) != 0;
        boolean bool_11_ = bool_10_ || (i & 0x1) != 0;
        boolean bool_12_ = bool_10_ || (i & 0x2) != 0;
        boolean bool_13_ = bool_10_ || (i & 0x4) != 0 || (i & 0x10) != 0;
        if (bool_11_ || bool_12_ || bool_13_) {
            if (bool_11_) {
                if (class64_sub1_8_.anIntArray5356 == null
                        || class64_sub1_8_.anIntArray5356.length < anInt5340)
                    class64_sub1_7_.anIntArray5356
                            = class64_sub1_8_.anIntArray5356 = new int[anInt5340];
                else
                    class64_sub1_7_.anIntArray5356
                            = class64_sub1_8_.anIntArray5356;
                for (int i_14_ = 0; i_14_ < anInt5340; i_14_++)
                    class64_sub1_7_.anIntArray5356[i_14_]
                            = anIntArray5356[i_14_];
            } else
                class64_sub1_7_.anIntArray5356 = anIntArray5356;
            if (bool_12_) {
                if (class64_sub1_8_.anIntArray5332 == null
                        || class64_sub1_8_.anIntArray5332.length < anInt5340)
                    class64_sub1_7_.anIntArray5332
                            = class64_sub1_8_.anIntArray5332 = new int[anInt5340];
                else
                    class64_sub1_7_.anIntArray5332
                            = class64_sub1_8_.anIntArray5332;
                for (int i_15_ = 0; i_15_ < anInt5340; i_15_++)
                    class64_sub1_7_.anIntArray5332[i_15_]
                            = anIntArray5332[i_15_];
            } else
                class64_sub1_7_.anIntArray5332 = anIntArray5332;
            if (bool_13_) {
                if (class64_sub1_8_.anIntArray5312 == null
                        || class64_sub1_8_.anIntArray5312.length < anInt5340)
                    class64_sub1_7_.anIntArray5312
                            = class64_sub1_8_.anIntArray5312 = new int[anInt5340];
                else
                    class64_sub1_7_.anIntArray5312
                            = class64_sub1_8_.anIntArray5312;
                for (int i_16_ = 0; i_16_ < anInt5340; i_16_++)
                    class64_sub1_7_.anIntArray5312[i_16_]
                            = anIntArray5312[i_16_];
            } else
                class64_sub1_7_.anIntArray5312 = anIntArray5312;
        } else {
            class64_sub1_7_.anIntArray5356 = anIntArray5356;
            class64_sub1_7_.anIntArray5332 = anIntArray5332;
            class64_sub1_7_.anIntArray5312 = anIntArray5312;
        }
        if ((i & 0x84080) != 0) {
            if (class64_sub1_8_.aShortArray5311 == null
                    || class64_sub1_8_.aShortArray5311.length < anInt5351) {
                int i_17_ = anInt5351;
                class64_sub1_7_.aShortArray5311
                        = class64_sub1_8_.aShortArray5311 = new short[i_17_];
            } else
                class64_sub1_7_.aShortArray5311
                        = class64_sub1_8_.aShortArray5311;
            for (int i_18_ = 0; i_18_ < anInt5351; i_18_++)
                class64_sub1_7_.aShortArray5311[i_18_]
                        = aShortArray5311[i_18_];
        } else
            class64_sub1_7_.aShortArray5311 = aShortArray5311;
        if ((i & 0x97018) != 0) {
            class64_sub1_7_.anInt5354 = 0;
            class64_sub1_7_.anIntArray5368 = class64_sub1_7_.anIntArray5337
                    = class64_sub1_7_.anIntArray5366 = null;
        } else if ((i & 0x80) != 0) {
            if (bool_9_)
                method634(false);
            if (anIntArray5368 != null) {
                if (class64_sub1_8_.anIntArray5368 == null
                        || class64_sub1_8_.anIntArray5368.length < anInt5351) {
                    int i_19_ = anInt5351;
                    class64_sub1_7_.anIntArray5368
                            = class64_sub1_8_.anIntArray5368 = new int[i_19_];
                    class64_sub1_7_.anIntArray5337
                            = class64_sub1_8_.anIntArray5337 = new int[i_19_];
                    class64_sub1_7_.anIntArray5366
                            = class64_sub1_8_.anIntArray5366 = new int[i_19_];
                } else {
                    class64_sub1_7_.anIntArray5368
                            = class64_sub1_8_.anIntArray5368;
                    class64_sub1_7_.anIntArray5337
                            = class64_sub1_8_.anIntArray5337;
                    class64_sub1_7_.anIntArray5366
                            = class64_sub1_8_.anIntArray5366;
                }
                for (int i_20_ = 0; i_20_ < anInt5351; i_20_++) {
                    class64_sub1_7_.anIntArray5368[i_20_]
                            = anIntArray5368[i_20_];
                    class64_sub1_7_.anIntArray5337[i_20_]
                            = anIntArray5337[i_20_];
                    class64_sub1_7_.anIntArray5366[i_20_]
                            = anIntArray5366[i_20_];
                }
            }
            class64_sub1_7_.anInt5354 = anInt5354;
        } else {
            if (bool_9_)
                method634(false);
            class64_sub1_7_.anIntArray5368 = anIntArray5368;
            class64_sub1_7_.anIntArray5337 = anIntArray5337;
            class64_sub1_7_.anIntArray5366 = anIntArray5366;
            class64_sub1_7_.anInt5354 = anInt5354;
        }
        if ((i & 0x100) != 0) {
            if (class64_sub1_8_.aByteArray5325 == null
                    || class64_sub1_8_.aByteArray5325.length < anInt5351) {
                int i_21_ = anInt5351;
                class64_sub1_7_.aByteArray5325
                        = class64_sub1_8_.aByteArray5325 = new byte[i_21_];
            } else
                class64_sub1_7_.aByteArray5325
                        = class64_sub1_8_.aByteArray5325;
            if (aByteArray5325 != null) {
                for (int i_22_ = 0; i_22_ < anInt5351; i_22_++)
                    class64_sub1_7_.aByteArray5325[i_22_]
                            = aByteArray5325[i_22_];
            } else {
                for (int i_23_ = 0; i_23_ < anInt5351; i_23_++)
                    class64_sub1_7_.aByteArray5325[i_23_] = (byte) 0;
            }
        } else
            class64_sub1_7_.aByteArray5325 = aByteArray5325;
        if ((i & 0x8) != 0 || (i & 0x10) != 0) {
            if (class64_sub1_8_.aClass360Array5360 == null
                    || class64_sub1_8_.aClass360Array5360.length < anInt5387) {
                int i_24_ = anInt5387;
                class64_sub1_7_.aClass360Array5360
                        = class64_sub1_8_.aClass360Array5360 = new Class360[i_24_];
            } else
                class64_sub1_7_.aClass360Array5360
                        = class64_sub1_8_.aClass360Array5360;
            if (aClass360Array5360 != null) {
                for (int i_25_ = 0; i_25_ < anInt5387; i_25_++)
                    class64_sub1_7_.aClass360Array5360[i_25_]
                            = new Class360(aClass360Array5360[i_25_]);
            } else
                class64_sub1_7_.aClass360Array5360 = null;
            if (aClass41Array5385 != null) {
                if (class64_sub1_8_.aClass41Array5385 == null
                        || class64_sub1_8_.aClass41Array5385.length < anInt5351) {
                    int i_26_ = anInt5351;
                    class64_sub1_7_.aClass41Array5385
                            = class64_sub1_8_.aClass41Array5385
                            = new Class41[i_26_];
                } else
                    class64_sub1_7_.aClass41Array5385
                            = class64_sub1_8_.aClass41Array5385;
                for (int i_27_ = 0; i_27_ < anInt5351; i_27_++)
                    class64_sub1_7_.aClass41Array5385[i_27_]
                            = (aClass41Array5385[i_27_] != null
                            ? new Class41(aClass41Array5385[i_27_]) : null);
            } else
                class64_sub1_7_.aClass41Array5385 = null;
        } else {
            if (bool_9_)
                method636();
            class64_sub1_7_.aClass360Array5360 = aClass360Array5360;
            class64_sub1_7_.aClass41Array5385 = aClass41Array5385;
        }
        if ((i & 0x8000) != 0) {
            if (aShortArray5388 == null)
                class64_sub1_7_.aShortArray5388 = null;
            else {
                if (class64_sub1_8_.aShortArray5388 == null
                        || class64_sub1_8_.aShortArray5388.length < anInt5351) {
                    int i_28_ = anInt5351;
                    class64_sub1_7_.aShortArray5388
                            = class64_sub1_8_.aShortArray5388 = new short[i_28_];
                } else
                    class64_sub1_7_.aShortArray5388
                            = class64_sub1_8_.aShortArray5388;
                for (int i_29_ = 0; i_29_ < anInt5351; i_29_++)
                    class64_sub1_7_.aShortArray5388[i_29_]
                            = aShortArray5388[i_29_];
            }
        } else
            class64_sub1_7_.aShortArray5388 = aShortArray5388;
        if ((i & 0x10000) != 0) {
            if (aByteArray5386 == null)
                class64_sub1_7_.aByteArray5386 = null;
            else {
                if (class64_sub1_8_.aByteArray5386 == null
                        || class64_sub1_8_.aByteArray5386.length < anInt5351) {
                    int i_30_ = bool ? anInt5351 + 100 : anInt5351;
                    class64_sub1_7_.aByteArray5386
                            = class64_sub1_8_.aByteArray5386 = new byte[i_30_];
                } else
                    class64_sub1_7_.aByteArray5386
                            = class64_sub1_8_.aByteArray5386;
                for (int i_31_ = 0; i_31_ < anInt5351; i_31_++)
                    class64_sub1_7_.aByteArray5386[i_31_]
                            = aByteArray5386[i_31_];
            }
        } else
            class64_sub1_7_.aByteArray5386 = aByteArray5386;
        if ((i & 0xc580) != 0) {
            if (class64_sub1_8_.aClass350Array5363 == null
                    || class64_sub1_8_.aClass350Array5363.length < anInt5389) {
                int i_32_ = anInt5389;
                class64_sub1_7_.aClass350Array5363
                        = class64_sub1_8_.aClass350Array5363 = new Class350[i_32_];
                for (int i_33_ = 0; i_33_ < anInt5389; i_33_++)
                    class64_sub1_7_.aClass350Array5363[i_33_]
                            = aClass350Array5363[i_33_].method3453(true);
            } else {
                class64_sub1_7_.aClass350Array5363
                        = class64_sub1_8_.aClass350Array5363;
                for (int i_34_ = 0; i_34_ < anInt5389; i_34_++)
                    class64_sub1_7_.aClass350Array5363[i_34_]
                            .method3454(aClass350Array5363[i_34_], true);
            }
        } else
            class64_sub1_7_.aClass350Array5363 = aClass350Array5363;
        if (aFloatArrayArray5314 != null && (i & 0x10) != 0) {
            if (class64_sub1_8_.aFloatArrayArray5314 == null
                    || class64_sub1_8_.aFloatArrayArray5314.length < anInt5351) {
                int i_35_ = bool ? anInt5351 + 100 : anInt5351;
                class64_sub1_7_.aFloatArrayArray5314
                        = class64_sub1_8_.aFloatArrayArray5314
                        = new float[i_35_][3];
            } else
                class64_sub1_7_.aFloatArrayArray5314
                        = class64_sub1_8_.aFloatArrayArray5314;
            for (int i_36_ = 0; i_36_ < anInt5351; i_36_++) {
                if (aFloatArrayArray5314[i_36_] != null) {
                    class64_sub1_7_.aFloatArrayArray5314[i_36_][0]
                            = aFloatArrayArray5314[i_36_][0];
                    class64_sub1_7_.aFloatArrayArray5314[i_36_][1]
                            = aFloatArrayArray5314[i_36_][1];
                    class64_sub1_7_.aFloatArrayArray5314[i_36_][2]
                            = aFloatArrayArray5314[i_36_][2];
                }
            }
            if (class64_sub1_8_.aFloatArrayArray5345 == null
                    || class64_sub1_8_.aFloatArrayArray5345.length < anInt5351) {
                int i_37_ = bool ? anInt5351 + 100 : anInt5351;
                class64_sub1_7_.aFloatArrayArray5345
                        = class64_sub1_8_.aFloatArrayArray5345
                        = new float[i_37_][3];
            } else
                class64_sub1_7_.aFloatArrayArray5345
                        = class64_sub1_8_.aFloatArrayArray5345;
            for (int i_38_ = 0; i_38_ < anInt5351; i_38_++) {
                if (aFloatArrayArray5345[i_38_] != null) {
                    class64_sub1_7_.aFloatArrayArray5345[i_38_][0]
                            = aFloatArrayArray5345[i_38_][0];
                    class64_sub1_7_.aFloatArrayArray5345[i_38_][1]
                            = aFloatArrayArray5345[i_38_][1];
                    class64_sub1_7_.aFloatArrayArray5345[i_38_][2]
                            = aFloatArrayArray5345[i_38_][2];
                }
            }
        } else {
            class64_sub1_7_.aFloatArrayArray5314 = aFloatArrayArray5314;
            class64_sub1_7_.aFloatArrayArray5345 = aFloatArrayArray5345;
        }
        class64_sub1_7_.anIntArrayArray5334 = anIntArrayArray5334;
        class64_sub1_7_.anIntArrayArray5330 = anIntArrayArray5330;
        class64_sub1_7_.anIntArrayArray5379 = anIntArrayArray5379;
        class64_sub1_7_.aShortArray5333 = aShortArray5333;
        class64_sub1_7_.aShortArray5370 = aShortArray5370;
        class64_sub1_7_.aByteArray5358 = aByteArray5358;
        class64_sub1_7_.aShortArray5317 = aShortArray5317;
        class64_sub1_7_.aShortArray5394 = aShortArray5394;
        class64_sub1_7_.aShortArray5364 = aShortArray5364;
        class64_sub1_7_.aClass129Array5322 = aClass129Array5322;
        class64_sub1_7_.aClass342Array5335 = aClass342Array5335;
        class64_sub1_7_.aClass6Array5361 = aClass6Array5361;
        class64_sub1_7_.aShortArray5327 = aShortArray5327;
        class64_sub1_7_.anInt5316 = i;
        return class64_sub1_7_;
    }

    private final void method634(boolean bool) {
        if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized (this) {
                method657(bool);
            }
        } else
            method657(bool);
    }

    final Class129[] method619() {
        return aClass129Array5322;
    }

    final int V() {
        if (!aBoolean5323)
            method655();
        return aShort5395;
    }

    private final void method635(int i) {
        short i_39_ = aShortArray5317[i];
        short i_40_ = aShortArray5394[i];
        short i_41_ = aShortArray5364[i];
        if (aShortArray5388 == null || aShortArray5388[i] == -1) {
            if (aByteArray5325 == null)
                aClass109_5383.anInt1674 = 0;
            else
                aClass109_5383.anInt1674
                        = aByteArray5325[i] & 0xff;
            if (anIntArray5366[i] == -1)
                aClass109_5383.method1018((float) anIntArray5343[i_39_],
                        (float) anIntArray5343[i_40_],
                        (float) anIntArray5343[i_41_],
                        (float) anIntArray5321[i_39_],
                        (float) anIntArray5321[i_40_],
                        (float) anIntArray5321[i_41_],
                        (float) anIntArray5355[i_39_],
                        (float) anIntArray5355[i_40_],
                        (float) anIntArray5355[i_41_],
                        (Class126.anIntArray4983
                                [anIntArray5368[i] & 0xffff]));
            else
                aClass109_5383.method1022((float) anIntArray5343[i_39_],
                        (float) anIntArray5343[i_40_],
                        (float) anIntArray5343[i_41_],
                        (float) anIntArray5321[i_39_],
                        (float) anIntArray5321[i_40_],
                        (float) anIntArray5321[i_41_],
                        (float) anIntArray5355[i_39_],
                        (float) anIntArray5355[i_40_],
                        (float) anIntArray5355[i_41_],
                        (float) (anIntArray5368[i] & 0xffff),
                        (float) (anIntArray5337[i] & 0xffff),
                        (float) (anIntArray5366[i]
                                & 0xffff));
        } else {
            int i_42_ = -16777216;
            if (aByteArray5325 != null)
                i_42_ = 255 - (aByteArray5325[i] & 0xff) << 24;
            if (anIntArray5366[i] == -1) {
                int i_43_ = i_42_ | anIntArray5368[i] & 0xffffff;
                aClass109_5383.method1024
                        ((float) anIntArray5343[i_39_],
                                (float) anIntArray5343[i_40_],
                                (float) anIntArray5343[i_41_],
                                (float) anIntArray5321[i_39_],
                                (float) anIntArray5321[i_40_],
                                (float) anIntArray5321[i_41_],
                                (float) anIntArray5355[i_39_],
                                (float) anIntArray5355[i_40_],
                                (float) anIntArray5355[i_41_], aFloatArrayArray5314[i][0],
                                aFloatArrayArray5314[i][1], aFloatArrayArray5314[i][2],
                                aFloatArrayArray5345[i][0], aFloatArrayArray5345[i][1],
                                aFloatArrayArray5345[i][2], i_43_, i_43_, i_43_,
                                aClass167_5367.anInt2192, 0, 0, 0,
                                aShortArray5388[i]);
            } else
                aClass109_5383.method1024((float) anIntArray5343[i_39_],
                        (float) anIntArray5343[i_40_],
                        (float) anIntArray5343[i_41_],
                        (float) anIntArray5321[i_39_],
                        (float) anIntArray5321[i_40_],
                        (float) anIntArray5321[i_41_],
                        (float) anIntArray5355[i_39_],
                        (float) anIntArray5355[i_40_],
                        (float) anIntArray5355[i_41_],
                        aFloatArrayArray5314[i][0],
                        aFloatArrayArray5314[i][1],
                        aFloatArrayArray5314[i][2],
                        aFloatArrayArray5345[i][0],
                        aFloatArrayArray5345[i][1],
                        aFloatArrayArray5345[i][2],
                        i_42_ | anIntArray5368[i] & 0xffffff,
                        i_42_ | anIntArray5337[i] & 0xffffff,
                        i_42_ | anIntArray5366[i] & 0xffffff,
                        (aClass167_5367
                                .anInt2192),
                        0, 0, 0, aShortArray5388[i]);
        }
    }

    final void method615(Class101 class101, Class318_Sub3 class318_sub3,
                         int i) {
        method654(class101, class318_sub3, -1, i);
    }

    final int HA() {
        if (!aBoolean5323)
            method655();
        return aShort5352;
    }

    final void method605(int i, int[] is, int i_44_, int i_45_, int i_46_,
                         int i_47_, boolean bool) {
        int i_48_ = is.length;
        if (i == 0) {
            i_44_ <<= 4;
            i_45_ <<= 4;
            i_46_ <<= 4;
            if (!aBoolean5372) {
                for (int i_49_ = 0; i_49_ < anInt5340; i_49_++) {
                    anIntArray5356[i_49_] <<= 4;
                    anIntArray5332[i_49_] <<= 4;
                    anIntArray5312[i_49_] <<= 4;
                }
                aBoolean5372 = true;
            }
            int i_50_ = 0;
            anInt5338 = 0;
            anInt5375 = 0;
            anInt5342 = 0;
            for (int i_51_ = 0; i_51_ < i_48_; i_51_++) {
                int i_52_ = is[i_51_];
                if (i_52_ < anIntArrayArray5334.length) {
                    int[] is_53_ = anIntArrayArray5334[i_52_];
                    for (int i_54_ = 0; i_54_ < is_53_.length; i_54_++) {
                        int i_55_ = is_53_[i_54_];
                        anInt5338 += anIntArray5356[i_55_];
                        anInt5375 += anIntArray5332[i_55_];
                        anInt5342 += anIntArray5312[i_55_];
                        i_50_++;
                    }
                }
            }
            if (i_50_ > 0) {
                anInt5338 = anInt5338 / i_50_ + i_44_;
                anInt5375 = anInt5375 / i_50_ + i_45_;
                anInt5342 = anInt5342 / i_50_ + i_46_;
            } else {
                anInt5338 = i_44_;
                anInt5375 = i_45_;
                anInt5342 = i_46_;
            }
        } else if (i == 1) {
            i_44_ <<= 4;
            i_45_ <<= 4;
            i_46_ <<= 4;
            if (!aBoolean5372) {
                for (int i_56_ = 0; i_56_ < anInt5340; i_56_++) {
                    anIntArray5356[i_56_] <<= 4;
                    anIntArray5332[i_56_] <<= 4;
                    anIntArray5312[i_56_] <<= 4;
                }
                aBoolean5372 = true;
            }
            for (int i_57_ = 0; i_57_ < i_48_; i_57_++) {
                int i_58_ = is[i_57_];
                if (i_58_ < anIntArrayArray5334.length) {
                    int[] is_59_ = anIntArrayArray5334[i_58_];
                    for (int i_60_ = 0; i_60_ < is_59_.length; i_60_++) {
                        int i_61_ = is_59_[i_60_];
                        anIntArray5356[i_61_] += i_44_;
                        anIntArray5332[i_61_] += i_45_;
                        anIntArray5312[i_61_] += i_46_;
                    }
                }
            }
        } else if (i == 2) {
            for (int i_62_ = 0; i_62_ < i_48_; i_62_++) {
                int i_63_ = is[i_62_];
                if (i_63_ < anIntArrayArray5334.length) {
                    int[] is_64_ = anIntArrayArray5334[i_63_];
                    if ((i_47_ & 0x1) == 0) {
                        for (int i_65_ = 0; i_65_ < is_64_.length; i_65_++) {
                            int i_66_ = is_64_[i_65_];
                            anIntArray5356[i_66_] -= anInt5338;
                            anIntArray5332[i_66_] -= anInt5375;
                            anIntArray5312[i_66_] -= anInt5342;
                            if (i_46_ != 0) {
                                int i_67_ = Class70.anIntArray1207[i_46_];
                                int i_68_ = Class70.anIntArray1204[i_46_];
                                int i_69_ = ((anIntArray5332[i_66_] * i_67_
                                        + anIntArray5356[i_66_] * i_68_
                                        + 16383)
                                        >> 14);
                                anIntArray5332[i_66_]
                                        = (anIntArray5332[i_66_] * i_68_
                                        - anIntArray5356[i_66_] * i_67_
                                        + 16383) >> 14;
                                anIntArray5356[i_66_] = i_69_;
                            }
                            if (i_44_ != 0) {
                                int i_70_ = Class70.anIntArray1207[i_44_];
                                int i_71_ = Class70.anIntArray1204[i_44_];
                                int i_72_ = ((anIntArray5332[i_66_] * i_71_
                                        - anIntArray5312[i_66_] * i_70_
                                        + 16383)
                                        >> 14);
                                anIntArray5312[i_66_]
                                        = (anIntArray5332[i_66_] * i_70_
                                        + anIntArray5312[i_66_] * i_71_
                                        + 16383) >> 14;
                                anIntArray5332[i_66_] = i_72_;
                            }
                            if (i_45_ != 0) {
                                int i_73_ = Class70.anIntArray1207[i_45_];
                                int i_74_ = Class70.anIntArray1204[i_45_];
                                int i_75_ = ((anIntArray5312[i_66_] * i_73_
                                        + anIntArray5356[i_66_] * i_74_
                                        + 16383)
                                        >> 14);
                                anIntArray5312[i_66_]
                                        = (anIntArray5312[i_66_] * i_74_
                                        - anIntArray5356[i_66_] * i_73_
                                        + 16383) >> 14;
                                anIntArray5356[i_66_] = i_75_;
                            }
                            anIntArray5356[i_66_] += anInt5338;
                            anIntArray5332[i_66_] += anInt5375;
                            anIntArray5312[i_66_] += anInt5342;
                        }
                    } else {
                        for (int i_76_ = 0; i_76_ < is_64_.length; i_76_++) {
                            int i_77_ = is_64_[i_76_];
                            anIntArray5356[i_77_] -= anInt5338;
                            anIntArray5332[i_77_] -= anInt5375;
                            anIntArray5312[i_77_] -= anInt5342;
                            if (i_44_ != 0) {
                                int i_78_ = Class70.anIntArray1207[i_44_];
                                int i_79_ = Class70.anIntArray1204[i_44_];
                                int i_80_ = ((anIntArray5332[i_77_] * i_79_
                                        - anIntArray5312[i_77_] * i_78_
                                        + 16383)
                                        >> 14);
                                anIntArray5312[i_77_]
                                        = (anIntArray5332[i_77_] * i_78_
                                        + anIntArray5312[i_77_] * i_79_
                                        + 16383) >> 14;
                                anIntArray5332[i_77_] = i_80_;
                            }
                            if (i_46_ != 0) {
                                int i_81_ = Class70.anIntArray1207[i_46_];
                                int i_82_ = Class70.anIntArray1204[i_46_];
                                int i_83_ = ((anIntArray5332[i_77_] * i_81_
                                        + anIntArray5356[i_77_] * i_82_
                                        + 16383)
                                        >> 14);
                                anIntArray5332[i_77_]
                                        = (anIntArray5332[i_77_] * i_82_
                                        - anIntArray5356[i_77_] * i_81_
                                        + 16383) >> 14;
                                anIntArray5356[i_77_] = i_83_;
                            }
                            if (i_45_ != 0) {
                                int i_84_ = Class70.anIntArray1207[i_45_];
                                int i_85_ = Class70.anIntArray1204[i_45_];
                                int i_86_ = ((anIntArray5312[i_77_] * i_84_
                                        + anIntArray5356[i_77_] * i_85_
                                        + 16383)
                                        >> 14);
                                anIntArray5312[i_77_]
                                        = (anIntArray5312[i_77_] * i_85_
                                        - anIntArray5356[i_77_] * i_84_
                                        + 16383) >> 14;
                                anIntArray5356[i_77_] = i_86_;
                            }
                            anIntArray5356[i_77_] += anInt5338;
                            anIntArray5332[i_77_] += anInt5375;
                            anIntArray5312[i_77_] += anInt5342;
                        }
                    }
                }
            }
        } else if (i == 3) {
            for (int i_87_ = 0; i_87_ < i_48_; i_87_++) {
                int i_88_ = is[i_87_];
                if (i_88_ < anIntArrayArray5334.length) {
                    int[] is_89_ = anIntArrayArray5334[i_88_];
                    for (int i_90_ = 0; i_90_ < is_89_.length; i_90_++) {
                        int i_91_ = is_89_[i_90_];
                        anIntArray5356[i_91_] -= anInt5338;
                        anIntArray5332[i_91_] -= anInt5375;
                        anIntArray5312[i_91_] -= anInt5342;
                        anIntArray5356[i_91_]
                                = anIntArray5356[i_91_] * i_44_ / 128;
                        anIntArray5332[i_91_]
                                = anIntArray5332[i_91_] * i_45_ / 128;
                        anIntArray5312[i_91_]
                                = anIntArray5312[i_91_] * i_46_ / 128;
                        anIntArray5356[i_91_] += anInt5338;
                        anIntArray5332[i_91_] += anInt5375;
                        anIntArray5312[i_91_] += anInt5342;
                    }
                }
            }
        } else if (i == 5) {
            if (anIntArrayArray5330 != null && aByteArray5325 != null) {
                for (int i_92_ = 0; i_92_ < i_48_; i_92_++) {
                    int i_93_ = is[i_92_];
                    if (i_93_ < anIntArrayArray5330.length) {
                        int[] is_94_ = anIntArrayArray5330[i_93_];
                        for (int i_95_ = 0; i_95_ < is_94_.length; i_95_++) {
                            int i_96_ = is_94_[i_95_];
                            int i_97_
                                    = (aByteArray5325[i_96_] & 0xff) + i_44_ * 8;
                            if (i_97_ < 0)
                                i_97_ = 0;
                            else if (i_97_ > 255)
                                i_97_ = 255;
                            aByteArray5325[i_96_] = (byte) i_97_;
                        }
                    }
                }
                if (aClass6Array5361 != null) {
                    for (int i_98_ = 0; i_98_ < anInt5389; i_98_++) {
                        Class6 class6 = aClass6Array5361[i_98_];
                        Class350 class350 = aClass350Array5363[i_98_];
                        class350.anInt4313
                                = (class350.anInt4313 & 0xffffff
                                | (255
                                - (aByteArray5325[class6.anInt144]
                                & 0xff)) << 24);
                    }
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray5330 != null) {
                for (int i_99_ = 0; i_99_ < i_48_; i_99_++) {
                    int i_100_ = is[i_99_];
                    if (i_100_ < anIntArrayArray5330.length) {
                        int[] is_101_ = anIntArrayArray5330[i_100_];
                        for (int i_102_ = 0; i_102_ < is_101_.length;
                             i_102_++) {
                            int i_103_ = is_101_[i_102_];
                            int i_104_ = aShortArray5311[i_103_] & 0xffff;
                            int i_105_ = i_104_ >> 10 & 0x3f;
                            int i_106_ = i_104_ >> 7 & 0x7;
                            int i_107_ = i_104_ & 0x7f;
                            i_105_ = i_105_ + i_44_ & 0x3f;
                            i_106_ += i_45_;
                            if (i_106_ < 0)
                                i_106_ = 0;
                            else if (i_106_ > 7)
                                i_106_ = 7;
                            i_107_ += i_46_;
                            if (i_107_ < 0)
                                i_107_ = 0;
                            else if (i_107_ > 127)
                                i_107_ = 127;
                            aShortArray5311[i_103_]
                                    = (short) (i_105_ << 10 | i_106_ << 7
                                    | i_107_);
                        }
                        aBoolean5380 = true;
                    }
                }
                if (aClass6Array5361 != null) {
                    for (int i_108_ = 0; i_108_ < anInt5389; i_108_++) {
                        Class6 class6 = aClass6Array5361[i_108_];
                        Class350 class350 = aClass350Array5363[i_108_];
                        class350.anInt4313
                                = (class350.anInt4313 & ~0xffffff
                                | ((Class126.anIntArray4983
                                [Class25.method303((aShortArray5311
                                        [(class6
                                        .anInt144)]) & 0xffff,
                                30) & 0xffff])
                                & 0xffffff));
                    }
                }
            }
        } else if (i == 8) {
            if (anIntArrayArray5379 != null) {
                for (int i_109_ = 0; i_109_ < i_48_; i_109_++) {
                    int i_110_ = is[i_109_];
                    if (i_110_ < anIntArrayArray5379.length) {
                        int[] is_111_ = anIntArrayArray5379[i_110_];
                        for (int i_112_ = 0; i_112_ < is_111_.length;
                             i_112_++) {
                            Class350 class350
                                    = aClass350Array5363[is_111_[i_112_]];
                            class350.anInt4316 += i_44_;
                            class350.anInt4317 += i_45_;
                        }
                    }
                }
            }
        } else if (i == 10) {
            if (anIntArrayArray5379 != null) {
                for (int i_113_ = 0; i_113_ < i_48_; i_113_++) {
                    int i_114_ = is[i_113_];
                    if (i_114_ < anIntArrayArray5379.length) {
                        int[] is_115_ = anIntArrayArray5379[i_114_];
                        for (int i_116_ = 0; i_116_ < is_115_.length;
                             i_116_++) {
                            Class350 class350
                                    = aClass350Array5363[is_115_[i_116_]];
                            class350.anInt4314
                                    = class350.anInt4314 * i_44_ >> 7;
                            class350.anInt4311
                                    = class350.anInt4311 * i_45_ >> 7;
                        }
                    }
                }
            }
        } else if (i == 9 && anIntArrayArray5379 != null) {
            for (int i_117_ = 0; i_117_ < i_48_; i_117_++) {
                int i_118_ = is[i_117_];
                if (i_118_ < anIntArrayArray5379.length) {
                    int[] is_119_ = anIntArrayArray5379[i_118_];
                    for (int i_120_ = 0; i_120_ < is_119_.length; i_120_++) {
                        Class350 class350
                                = aClass350Array5363[is_119_[i_120_]];
                        class350.anInt4308
                                = class350.anInt4308 + i_44_ & 0x3fff;
                    }
                }
            }
        }
    }

    final void FA(int i) {
        if ((anInt5316 & 0x6) != 6)
            throw new IllegalStateException();
        int i_121_ = Class70.anIntArray1207[i];
        int i_122_ = Class70.anIntArray1204[i];
        synchronized (this) {
            for (int i_123_ = 0; i_123_ < anInt5340; i_123_++) {
                int i_124_ = ((anIntArray5332[i_123_] * i_122_
                        - anIntArray5312[i_123_] * i_121_)
                        >> 14);
                anIntArray5312[i_123_]
                        = (anIntArray5332[i_123_] * i_121_
                        + anIntArray5312[i_123_] * i_122_) >> 14;
                anIntArray5332[i_123_] = i_124_;
            }
            method631();
        }
    }

    final void method622() {
        if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized (this) {
                while (this.aBoolean1124) {
                    try {
                        this.wait();
                    } catch (InterruptedException interruptedexception) {
                        /* empty */
                    }
                }
                this.aBoolean1124 = true;
            }
        }
    }

    final int G() {
        if (!aBoolean5323)
            method655();
        return aShort5331;
    }

    final void I(int i, int[] is, int i_125_, int i_126_, int i_127_,
                 boolean bool, int i_128_, int[] is_129_) {
        int i_130_ = is.length;
        if (i == 0) {
            i_125_ <<= 4;
            i_126_ <<= 4;
            i_127_ <<= 4;
            if (!aBoolean5372) {
                for (int i_131_ = 0; i_131_ < anInt5340; i_131_++) {
                    anIntArray5356[i_131_] <<= 4;
                    anIntArray5332[i_131_] <<= 4;
                    anIntArray5312[i_131_] <<= 4;
                }
                aBoolean5372 = true;
            }
            int i_132_ = 0;
            anInt5338 = 0;
            anInt5375 = 0;
            anInt5342 = 0;
            for (int i_133_ = 0; i_133_ < i_130_; i_133_++) {
                int i_134_ = is[i_133_];
                if (i_134_ < anIntArrayArray5334.length) {
                    int[] is_135_ = anIntArrayArray5334[i_134_];
                    for (int i_136_ = 0; i_136_ < is_135_.length; i_136_++) {
                        int i_137_ = is_135_[i_136_];
                        if (aShortArray5333 == null
                                || (i_128_ & aShortArray5333[i_137_]) != 0) {
                            anInt5338 += anIntArray5356[i_137_];
                            anInt5375 += anIntArray5332[i_137_];
                            anInt5342 += anIntArray5312[i_137_];
                            i_132_++;
                        }
                    }
                }
            }
            if (i_132_ > 0) {
                anInt5338 = anInt5338 / i_132_ + i_125_;
                anInt5375 = anInt5375 / i_132_ + i_126_;
                anInt5342 = anInt5342 / i_132_ + i_127_;
                aBoolean5369 = true;
            } else {
                anInt5338 = i_125_;
                anInt5375 = i_126_;
                anInt5342 = i_127_;
            }
        } else if (i == 1) {
            if (is_129_ != null) {
                int i_138_ = ((is_129_[0] * i_125_ + is_129_[1] * i_126_
                        + is_129_[2] * i_127_ + 8192)
                        >> 14);
                int i_139_ = ((is_129_[3] * i_125_ + is_129_[4] * i_126_
                        + is_129_[5] * i_127_ + 8192)
                        >> 14);
                int i_140_ = ((is_129_[6] * i_125_ + is_129_[7] * i_126_
                        + is_129_[8] * i_127_ + 8192)
                        >> 14);
                i_125_ = i_138_;
                i_126_ = i_139_;
                i_127_ = i_140_;
            }
            i_125_ <<= 4;
            i_126_ <<= 4;
            i_127_ <<= 4;
            if (!aBoolean5372) {
                for (int i_141_ = 0; i_141_ < anInt5340; i_141_++) {
                    anIntArray5356[i_141_] <<= 4;
                    anIntArray5332[i_141_] <<= 4;
                    anIntArray5312[i_141_] <<= 4;
                }
                aBoolean5372 = true;
            }
            for (int i_142_ = 0; i_142_ < i_130_; i_142_++) {
                int i_143_ = is[i_142_];
                if (i_143_ < anIntArrayArray5334.length) {
                    int[] is_144_ = anIntArrayArray5334[i_143_];
                    for (int i_145_ = 0; i_145_ < is_144_.length; i_145_++) {
                        int i_146_ = is_144_[i_145_];
                        if (aShortArray5333 == null
                                || (i_128_ & aShortArray5333[i_146_]) != 0) {
                            anIntArray5356[i_146_] += i_125_;
                            anIntArray5332[i_146_] += i_126_;
                            anIntArray5312[i_146_] += i_127_;
                        }
                    }
                }
            }
        } else if (i == 2) {
            if (is_129_ != null) {
                if (!aBoolean5372) {
                    for (int i_147_ = 0; i_147_ < anInt5340; i_147_++) {
                        anIntArray5356[i_147_] <<= 4;
                        anIntArray5332[i_147_] <<= 4;
                        anIntArray5312[i_147_] <<= 4;
                    }
                    aBoolean5372 = true;
                }
                int i_148_ = is_129_[9] << 4;
                int i_149_ = is_129_[10] << 4;
                int i_150_ = is_129_[11] << 4;
                int i_151_ = is_129_[12] << 4;
                int i_152_ = is_129_[13] << 4;
                int i_153_ = is_129_[14] << 4;
                if (aBoolean5369) {
                    int i_154_
                            = ((is_129_[0] * anInt5338 + is_129_[3] * anInt5375
                            + is_129_[6] * anInt5342 + 8192)
                            >> 14);
                    int i_155_
                            = ((is_129_[1] * anInt5338 + is_129_[4] * anInt5375
                            + is_129_[7] * anInt5342 + 8192)
                            >> 14);
                    int i_156_
                            = ((is_129_[2] * anInt5338 + is_129_[5] * anInt5375
                            + is_129_[8] * anInt5342 + 8192)
                            >> 14);
                    i_154_ += i_151_;
                    i_155_ += i_152_;
                    i_156_ += i_153_;
                    anInt5338 = i_154_;
                    anInt5375 = i_155_;
                    anInt5342 = i_156_;
                    aBoolean5369 = false;
                }
                int[] is_157_ = new int[9];
                int i_158_ = Class70.anIntArray1204[i_125_];
                int i_159_ = Class70.anIntArray1207[i_125_];
                int i_160_ = Class70.anIntArray1204[i_126_];
                int i_161_ = Class70.anIntArray1207[i_126_];
                int i_162_ = Class70.anIntArray1204[i_127_];
                int i_163_ = Class70.anIntArray1207[i_127_];
                int i_164_ = i_159_ * i_162_ + 8192 >> 14;
                int i_165_ = i_159_ * i_163_ + 8192 >> 14;
                is_157_[0] = i_160_ * i_162_ + i_161_ * i_165_ + 8192 >> 14;
                is_157_[1] = -i_160_ * i_163_ + i_161_ * i_164_ + 8192 >> 14;
                is_157_[2] = i_161_ * i_158_ + 8192 >> 14;
                is_157_[3] = i_158_ * i_163_ + 8192 >> 14;
                is_157_[4] = i_158_ * i_162_ + 8192 >> 14;
                is_157_[5] = -i_159_;
                is_157_[6] = -i_161_ * i_162_ + i_160_ * i_165_ + 8192 >> 14;
                is_157_[7] = i_161_ * i_163_ + i_160_ * i_164_ + 8192 >> 14;
                is_157_[8] = i_160_ * i_158_ + 8192 >> 14;
                int i_166_ = (is_157_[0] * -anInt5338 + is_157_[1] * -anInt5375
                        + is_157_[2] * -anInt5342 + 8192) >> 14;
                int i_167_ = (is_157_[3] * -anInt5338 + is_157_[4] * -anInt5375
                        + is_157_[5] * -anInt5342 + 8192) >> 14;
                int i_168_ = (is_157_[6] * -anInt5338 + is_157_[7] * -anInt5375
                        + is_157_[8] * -anInt5342 + 8192) >> 14;
                int i_169_ = i_166_ + anInt5338;
                int i_170_ = i_167_ + anInt5375;
                int i_171_ = i_168_ + anInt5342;
                int[] is_172_ = new int[9];
                for (int i_173_ = 0; i_173_ < 3; i_173_++) {
                    for (int i_174_ = 0; i_174_ < 3; i_174_++) {
                        int i_175_ = 0;
                        for (int i_176_ = 0; i_176_ < 3; i_176_++)
                            i_175_ += (is_157_[i_173_ * 3 + i_176_]
                                    * is_129_[i_174_ * 3 + i_176_]);
                        is_172_[i_173_ * 3 + i_174_] = i_175_ + 8192 >> 14;
                    }
                }
                int i_177_ = ((is_157_[0] * i_151_ + is_157_[1] * i_152_
                        + is_157_[2] * i_153_ + 8192)
                        >> 14);
                int i_178_ = ((is_157_[3] * i_151_ + is_157_[4] * i_152_
                        + is_157_[5] * i_153_ + 8192)
                        >> 14);
                int i_179_ = ((is_157_[6] * i_151_ + is_157_[7] * i_152_
                        + is_157_[8] * i_153_ + 8192)
                        >> 14);
                i_177_ += i_169_;
                i_178_ += i_170_;
                i_179_ += i_171_;
                int[] is_180_ = new int[9];
                for (int i_181_ = 0; i_181_ < 3; i_181_++) {
                    for (int i_182_ = 0; i_182_ < 3; i_182_++) {
                        int i_183_ = 0;
                        for (int i_184_ = 0; i_184_ < 3; i_184_++)
                            i_183_ += (is_129_[i_181_ * 3 + i_184_]
                                    * is_172_[i_182_ + i_184_ * 3]);
                        is_180_[i_181_ * 3 + i_182_] = i_183_ + 8192 >> 14;
                    }
                }
                int i_185_ = ((is_129_[0] * i_177_ + is_129_[1] * i_178_
                        + is_129_[2] * i_179_ + 8192)
                        >> 14);
                int i_186_ = ((is_129_[3] * i_177_ + is_129_[4] * i_178_
                        + is_129_[5] * i_179_ + 8192)
                        >> 14);
                int i_187_ = ((is_129_[6] * i_177_ + is_129_[7] * i_178_
                        + is_129_[8] * i_179_ + 8192)
                        >> 14);
                i_185_ += i_148_;
                i_186_ += i_149_;
                i_187_ += i_150_;
                for (int i_188_ = 0; i_188_ < i_130_; i_188_++) {
                    int i_189_ = is[i_188_];
                    if (i_189_ < anIntArrayArray5334.length) {
                        int[] is_190_ = anIntArrayArray5334[i_189_];
                        for (int i_191_ = 0; i_191_ < is_190_.length;
                             i_191_++) {
                            int i_192_ = is_190_[i_191_];
                            if (aShortArray5333 == null
                                    || (i_128_ & aShortArray5333[i_192_]) != 0) {
                                int i_193_
                                        = ((is_180_[0] * anIntArray5356[i_192_]
                                        + is_180_[1] * anIntArray5332[i_192_]
                                        + is_180_[2] * anIntArray5312[i_192_]
                                        + 8192)
                                        >> 14);
                                int i_194_
                                        = ((is_180_[3] * anIntArray5356[i_192_]
                                        + is_180_[4] * anIntArray5332[i_192_]
                                        + is_180_[5] * anIntArray5312[i_192_]
                                        + 8192)
                                        >> 14);
                                int i_195_
                                        = ((is_180_[6] * anIntArray5356[i_192_]
                                        + is_180_[7] * anIntArray5332[i_192_]
                                        + is_180_[8] * anIntArray5312[i_192_]
                                        + 8192)
                                        >> 14);
                                i_193_ += i_185_;
                                i_194_ += i_186_;
                                i_195_ += i_187_;
                                anIntArray5356[i_192_] = i_193_;
                                anIntArray5332[i_192_] = i_194_;
                                anIntArray5312[i_192_] = i_195_;
                            }
                        }
                    }
                }
            } else {
                for (int i_196_ = 0; i_196_ < i_130_; i_196_++) {
                    int i_197_ = is[i_196_];
                    if (i_197_ < anIntArrayArray5334.length) {
                        int[] is_198_ = anIntArrayArray5334[i_197_];
                        for (int i_199_ = 0; i_199_ < is_198_.length;
                             i_199_++) {
                            int i_200_ = is_198_[i_199_];
                            if (aShortArray5333 == null
                                    || (i_128_ & aShortArray5333[i_200_]) != 0) {
                                anIntArray5356[i_200_] -= anInt5338;
                                anIntArray5332[i_200_] -= anInt5375;
                                anIntArray5312[i_200_] -= anInt5342;
                                if (i_127_ != 0) {
                                    int i_201_
                                            = Class70.anIntArray1207[i_127_];
                                    int i_202_
                                            = Class70.anIntArray1204[i_127_];
                                    int i_203_
                                            = ((anIntArray5332[i_200_] * i_201_
                                            + anIntArray5356[i_200_] * i_202_
                                            + 16383)
                                            >> 14);
                                    anIntArray5332[i_200_]
                                            = (anIntArray5332[i_200_] * i_202_
                                            - anIntArray5356[i_200_] * i_201_
                                            + 16383) >> 14;
                                    anIntArray5356[i_200_] = i_203_;
                                }
                                if (i_125_ != 0) {
                                    int i_204_
                                            = Class70.anIntArray1207[i_125_];
                                    int i_205_
                                            = Class70.anIntArray1204[i_125_];
                                    int i_206_
                                            = ((anIntArray5332[i_200_] * i_205_
                                            - anIntArray5312[i_200_] * i_204_
                                            + 16383)
                                            >> 14);
                                    anIntArray5312[i_200_]
                                            = (anIntArray5332[i_200_] * i_204_
                                            + anIntArray5312[i_200_] * i_205_
                                            + 16383) >> 14;
                                    anIntArray5332[i_200_] = i_206_;
                                }
                                if (i_126_ != 0) {
                                    int i_207_
                                            = Class70.anIntArray1207[i_126_];
                                    int i_208_
                                            = Class70.anIntArray1204[i_126_];
                                    int i_209_
                                            = ((anIntArray5312[i_200_] * i_207_
                                            + anIntArray5356[i_200_] * i_208_
                                            + 16383)
                                            >> 14);
                                    anIntArray5312[i_200_]
                                            = (anIntArray5312[i_200_] * i_208_
                                            - anIntArray5356[i_200_] * i_207_
                                            + 16383) >> 14;
                                    anIntArray5356[i_200_] = i_209_;
                                }
                                anIntArray5356[i_200_] += anInt5338;
                                anIntArray5332[i_200_] += anInt5375;
                                anIntArray5312[i_200_] += anInt5342;
                            }
                        }
                    }
                }
            }
        } else if (i == 3) {
            if (is_129_ != null) {
                if (!aBoolean5372) {
                    for (int i_210_ = 0; i_210_ < anInt5340; i_210_++) {
                        anIntArray5356[i_210_] <<= 4;
                        anIntArray5332[i_210_] <<= 4;
                        anIntArray5312[i_210_] <<= 4;
                    }
                    aBoolean5372 = true;
                }
                int i_211_ = is_129_[9] << 4;
                int i_212_ = is_129_[10] << 4;
                int i_213_ = is_129_[11] << 4;
                int i_214_ = is_129_[12] << 4;
                int i_215_ = is_129_[13] << 4;
                int i_216_ = is_129_[14] << 4;
                if (aBoolean5369) {
                    int i_217_
                            = ((is_129_[0] * anInt5338 + is_129_[3] * anInt5375
                            + is_129_[6] * anInt5342 + 8192)
                            >> 14);
                    int i_218_
                            = ((is_129_[1] * anInt5338 + is_129_[4] * anInt5375
                            + is_129_[7] * anInt5342 + 8192)
                            >> 14);
                    int i_219_
                            = ((is_129_[2] * anInt5338 + is_129_[5] * anInt5375
                            + is_129_[8] * anInt5342 + 8192)
                            >> 14);
                    i_217_ += i_214_;
                    i_218_ += i_215_;
                    i_219_ += i_216_;
                    anInt5338 = i_217_;
                    anInt5375 = i_218_;
                    anInt5342 = i_219_;
                    aBoolean5369 = false;
                }
                int i_220_ = i_125_ << 15 >> 7;
                int i_221_ = i_126_ << 15 >> 7;
                int i_222_ = i_127_ << 15 >> 7;
                int i_223_ = i_220_ * -anInt5338 + 8192 >> 14;
                int i_224_ = i_221_ * -anInt5375 + 8192 >> 14;
                int i_225_ = i_222_ * -anInt5342 + 8192 >> 14;
                int i_226_ = i_223_ + anInt5338;
                int i_227_ = i_224_ + anInt5375;
                int i_228_ = i_225_ + anInt5342;
                int[] is_229_ = new int[9];
                is_229_[0] = i_220_ * is_129_[0] + 8192 >> 14;
                is_229_[1] = i_220_ * is_129_[3] + 8192 >> 14;
                is_229_[2] = i_220_ * is_129_[6] + 8192 >> 14;
                is_229_[3] = i_221_ * is_129_[1] + 8192 >> 14;
                is_229_[4] = i_221_ * is_129_[4] + 8192 >> 14;
                is_229_[5] = i_221_ * is_129_[7] + 8192 >> 14;
                is_229_[6] = i_222_ * is_129_[2] + 8192 >> 14;
                is_229_[7] = i_222_ * is_129_[5] + 8192 >> 14;
                is_229_[8] = i_222_ * is_129_[8] + 8192 >> 14;
                int i_230_ = i_220_ * i_214_ + 8192 >> 14;
                int i_231_ = i_221_ * i_215_ + 8192 >> 14;
                int i_232_ = i_222_ * i_216_ + 8192 >> 14;
                i_230_ += i_226_;
                i_231_ += i_227_;
                i_232_ += i_228_;
                int[] is_233_ = new int[9];
                for (int i_234_ = 0; i_234_ < 3; i_234_++) {
                    for (int i_235_ = 0; i_235_ < 3; i_235_++) {
                        int i_236_ = 0;
                        for (int i_237_ = 0; i_237_ < 3; i_237_++)
                            i_236_ += (is_129_[i_234_ * 3 + i_237_]
                                    * is_229_[i_235_ + i_237_ * 3]);
                        is_233_[i_234_ * 3 + i_235_] = i_236_ + 8192 >> 14;
                    }
                }
                int i_238_ = ((is_129_[0] * i_230_ + is_129_[1] * i_231_
                        + is_129_[2] * i_232_ + 8192)
                        >> 14);
                int i_239_ = ((is_129_[3] * i_230_ + is_129_[4] * i_231_
                        + is_129_[5] * i_232_ + 8192)
                        >> 14);
                int i_240_ = ((is_129_[6] * i_230_ + is_129_[7] * i_231_
                        + is_129_[8] * i_232_ + 8192)
                        >> 14);
                i_238_ += i_211_;
                i_239_ += i_212_;
                i_240_ += i_213_;
                for (int i_241_ = 0; i_241_ < i_130_; i_241_++) {
                    int i_242_ = is[i_241_];
                    if (i_242_ < anIntArrayArray5334.length) {
                        int[] is_243_ = anIntArrayArray5334[i_242_];
                        for (int i_244_ = 0; i_244_ < is_243_.length;
                             i_244_++) {
                            int i_245_ = is_243_[i_244_];
                            if (aShortArray5333 == null
                                    || (i_128_ & aShortArray5333[i_245_]) != 0) {
                                int i_246_
                                        = ((is_233_[0] * anIntArray5356[i_245_]
                                        + is_233_[1] * anIntArray5332[i_245_]
                                        + is_233_[2] * anIntArray5312[i_245_]
                                        + 8192)
                                        >> 14);
                                int i_247_
                                        = ((is_233_[3] * anIntArray5356[i_245_]
                                        + is_233_[4] * anIntArray5332[i_245_]
                                        + is_233_[5] * anIntArray5312[i_245_]
                                        + 8192)
                                        >> 14);
                                int i_248_
                                        = ((is_233_[6] * anIntArray5356[i_245_]
                                        + is_233_[7] * anIntArray5332[i_245_]
                                        + is_233_[8] * anIntArray5312[i_245_]
                                        + 8192)
                                        >> 14);
                                i_246_ += i_238_;
                                i_247_ += i_239_;
                                i_248_ += i_240_;
                                anIntArray5356[i_245_] = i_246_;
                                anIntArray5332[i_245_] = i_247_;
                                anIntArray5312[i_245_] = i_248_;
                            }
                        }
                    }
                }
            } else {
                for (int i_249_ = 0; i_249_ < i_130_; i_249_++) {
                    int i_250_ = is[i_249_];
                    if (i_250_ < anIntArrayArray5334.length) {
                        int[] is_251_ = anIntArrayArray5334[i_250_];
                        for (int i_252_ = 0; i_252_ < is_251_.length;
                             i_252_++) {
                            int i_253_ = is_251_[i_252_];
                            if (aShortArray5333 == null
                                    || (i_128_ & aShortArray5333[i_253_]) != 0) {
                                anIntArray5356[i_253_] -= anInt5338;
                                anIntArray5332[i_253_] -= anInt5375;
                                anIntArray5312[i_253_] -= anInt5342;
                                anIntArray5356[i_253_]
                                        = anIntArray5356[i_253_] * i_125_ / 128;
                                anIntArray5332[i_253_]
                                        = anIntArray5332[i_253_] * i_126_ / 128;
                                anIntArray5312[i_253_]
                                        = anIntArray5312[i_253_] * i_127_ / 128;
                                anIntArray5356[i_253_] += anInt5338;
                                anIntArray5332[i_253_] += anInt5375;
                                anIntArray5312[i_253_] += anInt5342;
                            }
                        }
                    }
                }
            }
        } else if (i == 5) {
            if (anIntArrayArray5330 != null && aByteArray5325 != null) {
                for (int i_254_ = 0; i_254_ < i_130_; i_254_++) {
                    int i_255_ = is[i_254_];
                    if (i_255_ < anIntArrayArray5330.length) {
                        int[] is_256_ = anIntArrayArray5330[i_255_];
                        for (int i_257_ = 0; i_257_ < is_256_.length;
                             i_257_++) {
                            int i_258_ = is_256_[i_257_];
                            if (aShortArray5370 == null
                                    || (i_128_ & aShortArray5370[i_258_]) != 0) {
                                int i_259_ = ((aByteArray5325[i_258_] & 0xff)
                                        + i_125_ * 8);
                                if (i_259_ < 0)
                                    i_259_ = 0;
                                else if (i_259_ > 255)
                                    i_259_ = 255;
                                aByteArray5325[i_258_] = (byte) i_259_;
                            }
                        }
                    }
                }
                if (aClass6Array5361 != null) {
                    for (int i_260_ = 0; i_260_ < anInt5389; i_260_++) {
                        Class6 class6 = aClass6Array5361[i_260_];
                        Class350 class350 = aClass350Array5363[i_260_];
                        class350.anInt4313
                                = (class350.anInt4313 & 0xffffff
                                | (255
                                - (aByteArray5325[class6.anInt144]
                                & 0xff)) << 24);
                    }
                }
            }
        } else if (i == 7) {
            if (anIntArrayArray5330 != null) {
                for (int i_261_ = 0; i_261_ < i_130_; i_261_++) {
                    int i_262_ = is[i_261_];
                    if (i_262_ < anIntArrayArray5330.length) {
                        int[] is_263_ = anIntArrayArray5330[i_262_];
                        for (int i_264_ = 0; i_264_ < is_263_.length;
                             i_264_++) {
                            int i_265_ = is_263_[i_264_];
                            if (aShortArray5370 == null
                                    || (i_128_ & aShortArray5370[i_265_]) != 0) {
                                int i_266_ = aShortArray5311[i_265_] & 0xffff;
                                int i_267_ = i_266_ >> 10 & 0x3f;
                                int i_268_ = i_266_ >> 7 & 0x7;
                                int i_269_ = i_266_ & 0x7f;
                                i_267_ = i_267_ + i_125_ & 0x3f;
                                i_268_ += i_126_;
                                if (i_268_ < 0)
                                    i_268_ = 0;
                                else if (i_268_ > 7)
                                    i_268_ = 7;
                                i_269_ += i_127_;
                                if (i_269_ < 0)
                                    i_269_ = 0;
                                else if (i_269_ > 127)
                                    i_269_ = 127;
                                aShortArray5311[i_265_]
                                        = (short) (i_267_ << 10 | i_268_ << 7
                                        | i_269_);
                            }
                        }
                        aBoolean5380 = true;
                    }
                }
                if (aClass6Array5361 != null) {
                    for (int i_270_ = 0; i_270_ < anInt5389; i_270_++) {
                        Class6 class6 = aClass6Array5361[i_270_];
                        Class350 class350 = aClass350Array5363[i_270_];
                        class350.anInt4313
                                = (class350.anInt4313 & ~0xffffff
                                | ((Class126.anIntArray4983
                                [Class25.method303((aShortArray5311
                                        [(class6
                                        .anInt144)]) & 0xffff,
                                30) & 0xffff])
                                & 0xffffff));
                    }
                }
            }
        } else if (i == 8) {
            if (anIntArrayArray5379 != null) {
                for (int i_271_ = 0; i_271_ < i_130_; i_271_++) {
                    int i_272_ = is[i_271_];
                    if (i_272_ < anIntArrayArray5379.length) {
                        int[] is_273_ = anIntArrayArray5379[i_272_];
                        for (int i_274_ = 0; i_274_ < is_273_.length;
                             i_274_++) {
                            Class350 class350
                                    = aClass350Array5363[is_273_[i_274_]];
                            class350.anInt4316 += i_125_;
                            class350.anInt4317 += i_126_;
                        }
                    }
                }
            }
        } else if (i == 10) {
            if (anIntArrayArray5379 != null) {
                for (int i_275_ = 0; i_275_ < i_130_; i_275_++) {
                    int i_276_ = is[i_275_];
                    if (i_276_ < anIntArrayArray5379.length) {
                        int[] is_277_ = anIntArrayArray5379[i_276_];
                        for (int i_278_ = 0; i_278_ < is_277_.length;
                             i_278_++) {
                            Class350 class350
                                    = aClass350Array5363[is_277_[i_278_]];
                            class350.anInt4314
                                    = (class350.anInt4314 * i_125_
                                    >> 7);
                            class350.anInt4311
                                    = (class350.anInt4311 * i_126_
                                    >> 7);
                        }
                    }
                }
            }
        } else if (i == 9 && anIntArrayArray5379 != null) {
            for (int i_279_ = 0; i_279_ < i_130_; i_279_++) {
                int i_280_ = is[i_279_];
                if (i_280_ < anIntArrayArray5379.length) {
                    int[] is_281_ = anIntArrayArray5379[i_280_];
                    for (int i_282_ = 0; i_282_ < is_281_.length; i_282_++) {
                        Class350 class350
                                = aClass350Array5363[is_281_[i_282_]];
                        class350.anInt4308
                                = (class350.anInt4308 + i_125_
                                & 0x3fff);
                    }
                }
            }
        }
    }

    private final void method636() {
        if (anInt5354 == 0 && aClass360Array5360 == null) {
            if (aHa_Sub1_5353.anInt7485 > 1) {
                synchronized (this) {
                    method649();
                }
            } else
                method649();
        }
    }

    final void wa() {
        if (aBoolean5372) {
            for (int i = 0; i < anInt5340; i++) {
                anIntArray5356[i] = anIntArray5356[i] + 7 >> 4;
                anIntArray5332[i] = anIntArray5332[i] + 7 >> 4;
                anIntArray5312[i] = anIntArray5312[i] + 7 >> 4;
            }
            aBoolean5372 = false;
        }
        if (aBoolean5380) {
            method647();
            aBoolean5380 = false;
        }
        aBoolean5323 = false;
    }

    final int fa() {
        if (!aBoolean5323)
            method655();
        return aShort5329;
    }

    private final int method637(int i, int i_283_) {
        i_283_ = i_283_ * (i & 0x7f) >> 7;
        if (i_283_ < 2)
            i_283_ = 2;
        else if (i_283_ > 126)
            i_283_ = 126;
        return (i & 0xff80) + i_283_;
    }

    private final boolean method638(int i) {
        if (anIntArray5400 == null)
            return false;
		return anIntArray5400[i] != -1;
	}

    final int da() {
        return anInt5349;
    }

    private final void method639() {
        synchronized (this) {
            for (int i = 0; i < anInt5340; i++) {
                int i_284_ = anIntArray5312[i];
                anIntArray5312[i] = anIntArray5356[i];
                anIntArray5356[i] = -i_284_;
            }
            method631();
        }
    }

    final boolean method618() {
        if (aShortArray5388 == null)
            return true;
        for (int i = 0; i < aShortArray5388.length; i++) {
            if (aShortArray5388[i] != -1
                    && !aHa_Sub1_5353.method3725(aShortArray5388[i]))
                return false;
        }
        return true;
    }

    final void method620(Class101 class101) {
        Class101_Sub1 class101_sub1 = (Class101_Sub1) class101;
        if (aClass129Array5322 != null) {
            for (int i = 0; i < aClass129Array5322.length; i++) {
                Class129 class129 = aClass129Array5322[i];
                Class129 class129_285_ = class129;
                if (class129.aClass129_1888 != null)
                    class129_285_ = class129.aClass129_1888;
                class129_285_.anInt1882
                        = (int) (class101_sub1.aFloat5686
                        + ((class101_sub1.aFloat5672
                        * (float) (anIntArray5356
                        [class129.anInt1881]))
                        + (class101_sub1.aFloat5673
                        * (float) (anIntArray5332
                        [(class129
                        .anInt1881)]))
                        + (class101_sub1.aFloat5669
                        * (float) (anIntArray5312
                        [(class129
                        .anInt1881)]))));
                class129_285_.anInt1891
                        = (int) (class101_sub1.aFloat5685
                        + ((class101_sub1.aFloat5655
                        * (float) (anIntArray5356
                        [class129.anInt1881]))
                        + (class101_sub1.aFloat5678
                        * (float) (anIntArray5332
                        [(class129
                        .anInt1881)]))
                        + (class101_sub1.aFloat5666
                        * (float) (anIntArray5312
                        [(class129
                        .anInt1881)]))));
                class129_285_.anInt1889
                        = (int) (class101_sub1.aFloat5681
                        + ((class101_sub1.aFloat5662
                        * (float) (anIntArray5356
                        [class129.anInt1881]))
                        + (class101_sub1.aFloat5680
                        * (float) (anIntArray5332
                        [(class129
                        .anInt1881)]))
                        + (class101_sub1.aFloat5664
                        * (float) (anIntArray5312
                        [(class129
                        .anInt1881)]))));
                class129_285_.anInt1883
                        = (int) (class101_sub1.aFloat5686
                        + ((class101_sub1.aFloat5672
                        * (float) (anIntArray5356
                        [class129.anInt1877]))
                        + (class101_sub1.aFloat5673
                        * (float) (anIntArray5332
                        [(class129
                        .anInt1877)]))
                        + (class101_sub1.aFloat5669
                        * (float) (anIntArray5312
                        [(class129
                        .anInt1877)]))));
                class129_285_.anInt1890
                        = (int) (class101_sub1.aFloat5685
                        + ((class101_sub1.aFloat5655
                        * (float) (anIntArray5356
                        [class129.anInt1877]))
                        + (class101_sub1.aFloat5678
                        * (float) (anIntArray5332
                        [(class129
                        .anInt1877)]))
                        + (class101_sub1.aFloat5666
                        * (float) (anIntArray5312
                        [(class129
                        .anInt1877)]))));
                class129_285_.anInt1880
                        = (int) (class101_sub1.aFloat5681
                        + ((class101_sub1.aFloat5662
                        * (float) (anIntArray5356
                        [class129.anInt1877]))
                        + (class101_sub1.aFloat5680
                        * (float) (anIntArray5332
                        [(class129
                        .anInt1877)]))
                        + (class101_sub1.aFloat5664
                        * (float) (anIntArray5312
                        [(class129
                        .anInt1877)]))));
                class129_285_.anInt1876
                        = (int) (class101_sub1.aFloat5686
                        + ((class101_sub1.aFloat5672
                        * (float) (anIntArray5356
                        [class129.anInt1892]))
                        + (class101_sub1.aFloat5673
                        * (float) (anIntArray5332
                        [(class129
                        .anInt1892)]))
                        + (class101_sub1.aFloat5669
                        * (float) (anIntArray5312
                        [(class129
                        .anInt1892)]))));
                class129_285_.anInt1874
                        = (int) (class101_sub1.aFloat5685
                        + ((class101_sub1.aFloat5655
                        * (float) (anIntArray5356
                        [class129.anInt1892]))
                        + (class101_sub1.aFloat5678
                        * (float) (anIntArray5332
                        [(class129
                        .anInt1892)]))
                        + (class101_sub1.aFloat5666
                        * (float) (anIntArray5312
                        [(class129
                        .anInt1892)]))));
                class129_285_.anInt1884
                        = (int) (class101_sub1.aFloat5681
                        + ((class101_sub1.aFloat5662
                        * (float) (anIntArray5356
                        [class129.anInt1892]))
                        + (class101_sub1.aFloat5680
                        * (float) (anIntArray5332
                        [(class129
                        .anInt1892)]))
                        + (class101_sub1.aFloat5664
                        * (float) (anIntArray5312
                        [(class129
                        .anInt1892)]))));
            }
        }
        if (aClass342Array5335 != null) {
            for (int i = 0; i < aClass342Array5335.length; i++) {
                Class342 class342 = aClass342Array5335[i];
                Class342 class342_286_ = class342;
                if (class342.aClass342_4248 != null)
                    class342_286_ = class342.aClass342_4248;
                if (class342.aClass101_4252 != null)
                    class342.aClass101_4252
                            .method898(class101_sub1);
                else
                    class342.aClass101_4252
                            = class101_sub1.method907();
                class342_286_.anInt4238
                        = (int) (class101_sub1.aFloat5686
                        + ((class101_sub1.aFloat5672
                        * (float) (anIntArray5356
                        [class342.anInt4244]))
                        + (class101_sub1.aFloat5673
                        * (float) (anIntArray5332
                        [(class342
                        .anInt4244)]))
                        + (class101_sub1.aFloat5669
                        * (float) (anIntArray5312
                        [(class342
                        .anInt4244)]))));
                class342_286_.anInt4239
                        = (int) (class101_sub1.aFloat5685
                        + ((class101_sub1.aFloat5655
                        * (float) (anIntArray5356
                        [class342.anInt4244]))
                        + (class101_sub1.aFloat5678
                        * (float) (anIntArray5332
                        [(class342
                        .anInt4244)]))
                        + (class101_sub1.aFloat5666
                        * (float) (anIntArray5312
                        [(class342
                        .anInt4244)]))));
                class342_286_.anInt4240
                        = (int) (class101_sub1.aFloat5681
                        + ((class101_sub1.aFloat5662
                        * (float) (anIntArray5356
                        [class342.anInt4244]))
                        + (class101_sub1.aFloat5680
                        * (float) (anIntArray5332
                        [(class342
                        .anInt4244)]))
                        + (class101_sub1.aFloat5664
                        * (float) (anIntArray5312
                        [(class342
                        .anInt4244)]))));
            }
        }
    }

    private final void method640() {
        for (int i = 0; i < anInt5351; i++) {
            short i_287_
                    = aShortArray5388 != null ? aShortArray5388[i] : (short) -1;
            if (i_287_ == -1) {
                int i_288_ = aShortArray5311[i] & 0xffff;
                int i_289_ = (i_288_ & 0x7f) * anInt5344 >> 7;
                short i_290_ = Class25.method303(i_288_ & ~0x7f | i_289_, 30);
                if (anIntArray5366[i] == -1) {
                    int i_291_ = anIntArray5368[i] & ~0x1ffff;
                    anIntArray5368[i]
                            = i_291_ | Class291.method2198(0, i_291_ >> 17,
                            i_290_);
                } else if (anIntArray5366[i] != -2) {
                    int i_292_ = anIntArray5368[i] & ~0x1ffff;
                    anIntArray5368[i]
                            = i_292_ | Class291.method2198(0, i_292_ >> 17,
                            i_290_);
                    i_292_ = anIntArray5337[i] & ~0x1ffff;
                    anIntArray5337[i]
                            = i_292_ | Class291.method2198(0, i_292_ >> 17,
                            i_290_);
                    i_292_ = anIntArray5366[i] & ~0x1ffff;
                    anIntArray5366[i]
                            = i_292_ | Class291.method2198(0, i_292_ >> 17,
                            i_290_);
                }
            }
        }
        anInt5354 = 2;
    }

    final void k(int i) {
        if ((anInt5316 & 0xd) != 13)
            throw new IllegalStateException();
        if (aClass360Array5360 != null) {
            if (i == 4096)
                method653();
            else if (i == 8192)
                method652();
            else if (i == 12288)
                method641();
            else {
                int i_293_ = Class70.anIntArray1207[i];
                int i_294_ = Class70.anIntArray1204[i];
                synchronized (this) {
                    for (int i_295_ = 0; i_295_ < anInt5387; i_295_++) {
                        int i_296_ = ((anIntArray5312[i_295_] * i_293_
                                + anIntArray5356[i_295_] * i_294_)
                                >> 14);
                        anIntArray5312[i_295_]
                                = (anIntArray5312[i_295_] * i_294_
                                - anIntArray5356[i_295_] * i_293_) >> 14;
                        anIntArray5356[i_295_] = i_296_;
                        if (aClass360Array5360[i_295_] != null) {
                            i_296_
                                    = ((aClass360Array5360[i_295_]
                                    .anInt4427) * i_293_
                                    + (aClass360Array5360[i_295_]
                                    .anInt4430) * i_294_) >> 14;
                            aClass360Array5360[i_295_].anInt4427
                                    = ((aClass360Array5360[i_295_]
                                    .anInt4427) * i_294_
                                    - (aClass360Array5360[i_295_]
                                    .anInt4430) * i_293_) >> 14;
                            aClass360Array5360[i_295_].anInt4430
                                    = i_296_;
                        }
                    }
                    if (aClass41Array5385 != null) {
                        for (int i_297_ = 0; i_297_ < anInt5351; i_297_++) {
                            if (aClass41Array5385[i_297_] != null) {
                                int i_298_
                                        = ((aClass41Array5385[i_297_]
                                        .anInt559) * i_293_
                                        + (aClass41Array5385[i_297_]
                                        .anInt561) * i_294_) >> 14;
                                aClass41Array5385[i_297_].anInt559
                                        = ((aClass41Array5385[i_297_]
                                        .anInt559) * i_294_
                                        - (aClass41Array5385[i_297_]
                                        .anInt561) * i_293_) >> 14;
                                aClass41Array5385[i_297_].anInt561
                                        = i_298_;
                            }
                        }
                    }
                    for (int i_299_ = anInt5387; i_299_ < anInt5340;
                         i_299_++) {
                        int i_300_ = ((anIntArray5312[i_299_] * i_293_
                                + anIntArray5356[i_299_] * i_294_)
                                >> 14);
                        anIntArray5312[i_299_]
                                = (anIntArray5312[i_299_] * i_294_
                                - anIntArray5356[i_299_] * i_293_) >> 14;
                        anIntArray5356[i_299_] = i_300_;
                    }
                    anInt5354 = 0;
                    aBoolean5323 = false;
                }
            }
        } else
            a(i);
    }

    final void method610(Class101 class101, int i, boolean bool) {
        if (aShortArray5333 != null) {
            int[] is = new int[3];
            for (int i_301_ = 0; i_301_ < anInt5387; i_301_++) {
                if ((i & aShortArray5333[i_301_]) != 0) {
                    if (bool)
                        class101.method892(anIntArray5356[i_301_],
                                anIntArray5332[i_301_],
                                anIntArray5312[i_301_], is);
                    else
                        class101.method897(anIntArray5356[i_301_],
                                anIntArray5332[i_301_],
                                anIntArray5312[i_301_], is);
                    anIntArray5356[i_301_] = is[0];
                    anIntArray5332[i_301_] = is[1];
                    anIntArray5312[i_301_] = is[2];
                }
            }
        }
    }

    final void method612() {
        /* empty */
    }

    private final void method641() {
        synchronized (this) {
            for (int i = 0; i < anInt5387; i++) {
                int i_302_ = anIntArray5312[i];
                anIntArray5312[i] = anIntArray5356[i];
                anIntArray5356[i] = -i_302_;
                if (aClass360Array5360[i] != null) {
                    i_302_ = aClass360Array5360[i].anInt4427;
                    aClass360Array5360[i].anInt4427
                            = aClass360Array5360[i].anInt4430;
                    aClass360Array5360[i].anInt4430 = -i_302_;
                }
            }
            if (aClass41Array5385 != null) {
                for (int i = 0; i < anInt5351; i++) {
                    if (aClass41Array5385[i] != null) {
                        int i_303_ = aClass41Array5385[i].anInt559;
                        aClass41Array5385[i].anInt559
                                = aClass41Array5385[i].anInt561;
                        aClass41Array5385[i].anInt561 = -i_303_;
                    }
                }
            }
            for (int i = anInt5387; i < anInt5340; i++) {
                int i_304_ = anIntArray5312[i];
                anIntArray5312[i] = anIntArray5356[i];
                anIntArray5356[i] = -i_304_;
            }
            anInt5354 = 0;
            aBoolean5323 = false;
        }
    }

    private final int method642(int i, short i_305_, int i_306_) {
        int i_307_ = Class10.anIntArray179[method637(i, i_306_)];
        Class12 class12
                = aHa_Sub1_5353.aD4579.method3(i_305_ & 0xffff, -6662);
        int i_308_ = class12.aByte201 & 0xff;
        if (i_308_ != 0) {
            int i_309_ = 131586 * i_306_;
            if (i_308_ == 256)
                i_307_ = i_309_;
            else {
                int i_310_ = i_308_;
                int i_311_ = 256 - i_308_;
                i_307_ = ((((i_309_ & 0xff00ff) * i_310_
                        + (i_307_ & 0xff00ff) * i_311_)
                        & ~0xff00ff)
                        + (((i_309_ & 0xff00) * i_310_
                        + (i_307_ & 0xff00) * i_311_)
                        & 0xff0000)) >> 8;
            }
        }
        int i_312_ = class12.aByte216 & 0xff;
        if (i_312_ != 0) {
            i_312_ += 256;
            int i_313_ = ((i_307_ & 0xff0000) >> 16) * i_312_;
            if (i_313_ > 65535)
                i_313_ = 65535;
            int i_314_ = ((i_307_ & 0xff00) >> 8) * i_312_;
            if (i_314_ > 65535)
                i_314_ = 65535;
            int i_315_ = (i_307_ & 0xff) * i_312_;
            if (i_315_ > 65535)
                i_315_ = 65535;
            i_307_
                    = (i_313_ << 8 & 0xff0000) + (i_314_ & 0xff00) + (i_315_ >> 8);
        }
        return i_307_;
    }

    final void method608(Class101 class101, Class318_Sub3 class318_sub3, int i,
                         int i_316_) {
        method654(class101, class318_sub3, i, i_316_);
    }

    final boolean NA() {
        if (anIntArrayArray5334 == null)
            return false;
        anInt5338 = 0;
        anInt5375 = 0;
        anInt5342 = 0;
        return true;
    }

    private final void method643(int i, boolean bool, boolean bool_317_) {
        if (anIntArray5366[i] != -2) {
            short i_318_ = aShortArray5317[i];
            short i_319_ = aShortArray5394[i];
            short i_320_ = aShortArray5364[i];
            int i_321_ = anIntArray5321[i_318_];
            int i_322_ = anIntArray5321[i_319_];
            int i_323_ = anIntArray5321[i_320_];
            if (bool
                    && (i_321_ == -5000 || i_322_ == -5000 || i_323_ == -5000)) {
                int i_324_ = anIntArray5399[i_318_];
                int i_325_ = anIntArray5399[i_319_];
                int i_326_ = anIntArray5399[i_320_];
                int i_327_ = anIntArray5384[i_318_];
                int i_328_ = anIntArray5384[i_319_];
                int i_329_ = anIntArray5384[i_320_];
                int i_330_ = anIntArray5392[i_318_];
                int i_331_ = anIntArray5392[i_319_];
                int i_332_ = anIntArray5392[i_320_];
                i_324_ -= i_325_;
                i_326_ -= i_325_;
                i_327_ -= i_328_;
                i_329_ -= i_328_;
                i_330_ -= i_331_;
                i_332_ -= i_331_;
                int i_333_ = i_327_ * i_332_ - i_330_ * i_329_;
                int i_334_ = i_330_ * i_326_ - i_324_ * i_332_;
                int i_335_ = i_324_ * i_329_ - i_327_ * i_326_;
                if (i_325_ * i_333_ + i_328_ * i_334_ + i_331_ * i_335_ > 0)
                    method646(i);
            } else if (anIntArray5400[i] != -1
                    || ((i_321_ - i_322_) * (anIntArray5343[i_320_]
                    - anIntArray5343[i_319_])
                    - ((anIntArray5343[i_318_] - anIntArray5343[i_319_])
                    * (i_323_ - i_322_))) > 0) {
				aClass109_5383.aBoolean1671 = i_321_ < 0 || i_322_ < 0 || i_323_ < 0
						|| i_321_ > aClass167_5367.anInt2221
						|| i_322_ > aClass167_5367.anInt2221
						|| i_323_ > aClass167_5367.anInt2221;
                if (bool_317_) {
                    int i_336_ = anIntArray5400[i];
                    if (i_336_ == -1
                            || !aClass6Array5361[i_336_].aBoolean145)
                        method658(i);
                } else {
                    int i_337_ = anIntArray5400[i];
                    if (i_337_ != -1) {
                        Class6 class6 = aClass6Array5361[i_337_];
                        Class350 class350 = aClass350Array5363[i_337_];
                        if (!class6.aBoolean145)
                            method635(i);
                        aHa_Sub1_5353.method3720
                                (class350.anInt4312,
                                        class350.anInt4310,
                                        class350.anInt4320,
                                        class350.anInt4309,
                                        class350.anInt4307,
                                        class350.anInt4308,
                                        class6.aShort146 & 0xffff,
                                        class350.anInt4313,
                                        class6.aByte148,
                                        class6.aByte156);
                    } else
                        method635(i);
                }
            }
        }
    }

    final boolean F() {
        return aBoolean5382;
    }

    final void P(int i, int i_338_, int i_339_, int i_340_) {
        if (i == 0) {
            int i_341_ = 0;
            anInt5338 = 0;
            anInt5375 = 0;
            anInt5342 = 0;
            for (int i_342_ = 0; i_342_ < anInt5340; i_342_++) {
                anInt5338 += anIntArray5356[i_342_];
                anInt5375 += anIntArray5332[i_342_];
                anInt5342 += anIntArray5312[i_342_];
                i_341_++;
            }
            if (i_341_ > 0) {
                anInt5338 = anInt5338 / i_341_ + i_338_;
                anInt5375 = anInt5375 / i_341_ + i_339_;
                anInt5342 = anInt5342 / i_341_ + i_340_;
            } else {
                anInt5338 = i_338_;
                anInt5375 = i_339_;
                anInt5342 = i_340_;
            }
        } else if (i == 1) {
            for (int i_343_ = 0; i_343_ < anInt5340; i_343_++) {
                anIntArray5356[i_343_] += i_338_;
                anIntArray5332[i_343_] += i_339_;
                anIntArray5312[i_343_] += i_340_;
            }
        } else if (i == 2) {
            for (int i_344_ = 0; i_344_ < anInt5340; i_344_++) {
                anIntArray5356[i_344_] -= anInt5338;
                anIntArray5332[i_344_] -= anInt5375;
                anIntArray5312[i_344_] -= anInt5342;
                if (i_340_ != 0) {
                    int i_345_ = Class70.anIntArray1207[i_340_];
                    int i_346_ = Class70.anIntArray1204[i_340_];
                    int i_347_ = ((anIntArray5332[i_344_] * i_345_
                            + anIntArray5356[i_344_] * i_346_ + 16383)
                            >> 14);
                    anIntArray5332[i_344_]
                            = (anIntArray5332[i_344_] * i_346_
                            - anIntArray5356[i_344_] * i_345_ + 16383) >> 14;
                    anIntArray5356[i_344_] = i_347_;
                }
                if (i_338_ != 0) {
                    int i_348_ = Class70.anIntArray1207[i_338_];
                    int i_349_ = Class70.anIntArray1204[i_338_];
                    int i_350_ = ((anIntArray5332[i_344_] * i_349_
                            - anIntArray5312[i_344_] * i_348_ + 16383)
                            >> 14);
                    anIntArray5312[i_344_]
                            = (anIntArray5332[i_344_] * i_348_
                            + anIntArray5312[i_344_] * i_349_ + 16383) >> 14;
                    anIntArray5332[i_344_] = i_350_;
                }
                if (i_339_ != 0) {
                    int i_351_ = Class70.anIntArray1207[i_339_];
                    int i_352_ = Class70.anIntArray1204[i_339_];
                    int i_353_ = ((anIntArray5312[i_344_] * i_351_
                            + anIntArray5356[i_344_] * i_352_ + 16383)
                            >> 14);
                    anIntArray5312[i_344_]
                            = (anIntArray5312[i_344_] * i_352_
                            - anIntArray5356[i_344_] * i_351_ + 16383) >> 14;
                    anIntArray5356[i_344_] = i_353_;
                }
                anIntArray5356[i_344_] += anInt5338;
                anIntArray5332[i_344_] += anInt5375;
                anIntArray5312[i_344_] += anInt5342;
            }
        } else if (i == 3) {
            for (int i_354_ = 0; i_354_ < anInt5340; i_354_++) {
                anIntArray5356[i_354_] -= anInt5338;
                anIntArray5332[i_354_] -= anInt5375;
                anIntArray5312[i_354_] -= anInt5342;
                anIntArray5356[i_354_] = anIntArray5356[i_354_] * i_338_ / 128;
                anIntArray5332[i_354_] = anIntArray5332[i_354_] * i_339_ / 128;
                anIntArray5312[i_354_] = anIntArray5312[i_354_] * i_340_ / 128;
                anIntArray5356[i_354_] += anInt5338;
                anIntArray5332[i_354_] += anInt5375;
                anIntArray5312[i_354_] += anInt5342;
            }
        } else if (i == 5) {
            for (int i_355_ = 0; i_355_ < anInt5351; i_355_++) {
                int i_356_ = (aByteArray5325[i_355_] & 0xff) + i_338_ * 8;
                if (i_356_ < 0)
                    i_356_ = 0;
                else if (i_356_ > 255)
                    i_356_ = 255;
                aByteArray5325[i_355_] = (byte) i_356_;
            }
            if (aClass6Array5361 != null) {
                for (int i_357_ = 0; i_357_ < anInt5389; i_357_++) {
                    Class6 class6 = aClass6Array5361[i_357_];
                    Class350 class350 = aClass350Array5363[i_357_];
                    class350.anInt4313
                            = (class350.anInt4313 & 0xffffff
                            | 255 - (aByteArray5325[class6.anInt144]
                            & 0xff) << 24);
                }
            }
        } else if (i == 7) {
            for (int i_358_ = 0; i_358_ < anInt5351; i_358_++) {
                int i_359_ = aShortArray5311[i_358_] & 0xffff;
                int i_360_ = i_359_ >> 10 & 0x3f;
                int i_361_ = i_359_ >> 7 & 0x7;
                int i_362_ = i_359_ & 0x7f;
                i_360_ = i_360_ + i_338_ & 0x3f;
                i_361_ += i_339_;
                if (i_361_ < 0)
                    i_361_ = 0;
                else if (i_361_ > 7)
                    i_361_ = 7;
                i_362_ += i_340_;
                if (i_362_ < 0)
                    i_362_ = 0;
                else if (i_362_ > 127)
                    i_362_ = 127;
                aShortArray5311[i_358_]
                        = (short) (i_360_ << 10 | i_361_ << 7 | i_362_);
            }
            aBoolean5380 = true;
            if (aClass6Array5361 != null) {
                for (int i_363_ = 0; i_363_ < anInt5389; i_363_++) {
                    Class6 class6 = aClass6Array5361[i_363_];
                    Class350 class350 = aClass350Array5363[i_363_];
                    class350.anInt4313
                            = (class350.anInt4313 & ~0xffffff
                            | (Class126.anIntArray4983
                            [Class25.method303((aShortArray5311
                                    [(class6
                                    .anInt144)]) & 0xffff,
                            30) & 0xffff]) & 0xffffff);
                }
            }
        } else if (i == 8) {
            for (int i_364_ = 0; i_364_ < anInt5389; i_364_++) {
                Class350 class350 = aClass350Array5363[i_364_];
                class350.anInt4316 += i_338_;
                class350.anInt4317 += i_339_;
            }
        } else if (i == 10) {
            for (int i_365_ = 0; i_365_ < anInt5389; i_365_++) {
                Class350 class350 = aClass350Array5363[i_365_];
                class350.anInt4314
                        = class350.anInt4314 * i_338_ >> 7;
                class350.anInt4311
                        = class350.anInt4311 * i_339_ >> 7;
            }
        } else if (i == 9) {
            for (int i_366_ = 0; i_366_ < anInt5389; i_366_++) {
                Class350 class350 = aClass350Array5363[i_366_];
                class350.anInt4308
                        = class350.anInt4308 + i_338_ & 0x3fff;
            }
        }
    }

    final int na() {
        if (!aBoolean5323)
            method655();
        return aShort5324;
    }

    final r ba(r var_r) {
        return null;
    }

    final void p(int i, int i_367_, s var_s, s var_s_368_, int i_369_,
                 int i_370_, int i_371_) {
        if (i == 3) {
            if ((anInt5316 & 0x7) != 7)
                throw new IllegalStateException();
        } else if ((anInt5316 & 0x2) != 2)
            throw new IllegalStateException();
        if (!aBoolean5323)
            method655();
        int i_372_ = i_369_ + aShort5395;
        int i_373_ = i_369_ + aShort5393;
        int i_374_ = i_371_ + aShort5352;
        int i_375_ = i_371_ + aShort5331;
        if (i == 4
                || (i_372_ >= 0
                && (i_373_ + var_s.anInt4592 >> var_s.anInt4588
                < var_s.anInt4587)
                && i_374_ >= 0
                && (i_375_ + var_s.anInt4592 >> var_s.anInt4588
                < var_s.anInt4590))) {
            int[][] is = var_s.anIntArrayArray4584;
            int[][] is_376_ = null;
            if (var_s_368_ != null)
                is_376_ = var_s_368_.anIntArrayArray4584;
            if (i == 4 || i == 5) {
                if (var_s_368_ == null
                        || (i_372_ < 0
                        || ((i_373_ + var_s_368_.anInt4592
                        >> var_s_368_.anInt4588)
                        >= var_s_368_.anInt4587)
                        || i_374_ < 0
                        || ((i_375_ + var_s_368_.anInt4592
                        >> var_s_368_.anInt4588)
                        >= var_s_368_.anInt4590)))
                    return;
            } else {
                i_372_ >>= var_s.anInt4588;
                i_373_ = (i_373_ + (var_s.anInt4592 - 1)
                        >> var_s.anInt4588);
                i_374_ >>= var_s.anInt4588;
                i_375_ = (i_375_ + (var_s.anInt4592 - 1)
                        >> var_s.anInt4588);
                if (is[i_372_][i_374_] == i_370_
                        && is[i_373_][i_374_] == i_370_
                        && is[i_372_][i_375_] == i_370_
                        && is[i_373_][i_375_] == i_370_)
                    return;
            }
            synchronized (this) {
                if (i == 1) {
                    int i_377_ = var_s.anInt4592 - 1;
                    for (int i_378_ = 0; i_378_ < anInt5387; i_378_++) {
                        int i_379_ = anIntArray5356[i_378_] + i_369_;
                        int i_380_ = anIntArray5312[i_378_] + i_371_;
                        int i_381_ = i_379_ & i_377_;
                        int i_382_ = i_380_ & i_377_;
                        int i_383_ = i_379_ >> var_s.anInt4588;
                        int i_384_ = i_380_ >> var_s.anInt4588;
                        int i_385_
                                = ((is[i_383_][i_384_] * (var_s.anInt4592
                                - i_381_)
                                + is[i_383_ + 1][i_384_] * i_381_)
                                >> var_s.anInt4588);
                        int i_386_
                                = ((is[i_383_][i_384_ + 1] * (var_s.anInt4592
                                - i_381_)
                                + is[i_383_ + 1][i_384_ + 1] * i_381_)
                                >> var_s.anInt4588);
                        int i_387_ = (i_385_ * (var_s.anInt4592
                                - i_382_) + i_386_ * i_382_
                                >> var_s.anInt4588);
                        anIntArray5332[i_378_]
                                = anIntArray5332[i_378_] + i_387_ - i_370_;
                    }
                    for (int i_388_ = anInt5387; i_388_ < anInt5340;
                         i_388_++) {
                        int i_389_ = anIntArray5356[i_388_] + i_369_;
                        int i_390_ = anIntArray5312[i_388_] + i_371_;
                        int i_391_ = i_389_ & i_377_;
                        int i_392_ = i_390_ & i_377_;
                        int i_393_ = i_389_ >> var_s.anInt4588;
                        int i_394_ = i_390_ >> var_s.anInt4588;
                        if (i_393_ >= 0 && i_393_ < is.length - 1
                                && i_394_ >= 0 && i_394_ < is[0].length - 1) {
                            int i_395_
                                    = ((is[i_393_][i_394_] * (var_s.anInt4592
                                    - i_391_)
                                    + is[i_393_ + 1][i_394_] * i_391_)
                                    >> var_s.anInt4588);
                            int i_396_
                                    = (((is[i_393_][i_394_ + 1]
                                    * (var_s.anInt4592 - i_391_))
                                    + is[i_393_ + 1][i_394_ + 1] * i_391_)
                                    >> var_s.anInt4588);
                            int i_397_ = (i_395_ * (var_s.anInt4592
                                    - i_392_) + i_396_ * i_392_
                                    >> var_s.anInt4588);
                            anIntArray5332[i_388_]
                                    = anIntArray5332[i_388_] + i_397_ - i_370_;
                        }
                    }
                } else if (i == 2) {
                    int i_398_ = var_s.anInt4592 - 1;
                    for (int i_399_ = 0; i_399_ < anInt5387; i_399_++) {
                        int i_400_
                                = (anIntArray5332[i_399_] << 16) / aShort5329;
                        if (i_400_ < i_367_) {
                            int i_401_ = anIntArray5356[i_399_] + i_369_;
                            int i_402_ = anIntArray5312[i_399_] + i_371_;
                            int i_403_ = i_401_ & i_398_;
                            int i_404_ = i_402_ & i_398_;
                            int i_405_ = i_401_ >> var_s.anInt4588;
                            int i_406_ = i_402_ >> var_s.anInt4588;
                            int i_407_
                                    = ((is[i_405_][i_406_] * (var_s.anInt4592
                                    - i_403_)
                                    + is[i_405_ + 1][i_406_] * i_403_)
                                    >> var_s.anInt4588);
                            int i_408_
                                    = (((is[i_405_][i_406_ + 1]
                                    * (var_s.anInt4592 - i_403_))
                                    + is[i_405_ + 1][i_406_ + 1] * i_403_)
                                    >> var_s.anInt4588);
                            int i_409_ = (i_407_ * (var_s.anInt4592
                                    - i_404_) + i_408_ * i_404_
                                    >> var_s.anInt4588);
                            anIntArray5332[i_399_]
                                    = anIntArray5332[i_399_] + ((i_409_ - i_370_)
                                    * (i_367_ - i_400_)
                                    / i_367_);
                        } else
                            anIntArray5332[i_399_] = anIntArray5332[i_399_];
                    }
                    for (int i_410_ = anInt5387; i_410_ < anInt5340;
                         i_410_++) {
                        int i_411_
                                = (anIntArray5332[i_410_] << 16) / aShort5329;
                        if (i_411_ < i_367_) {
                            int i_412_ = anIntArray5356[i_410_] + i_369_;
                            int i_413_ = anIntArray5312[i_410_] + i_371_;
                            int i_414_ = i_412_ & i_398_;
                            int i_415_ = i_413_ & i_398_;
                            int i_416_ = i_412_ >> var_s.anInt4588;
                            int i_417_ = i_413_ >> var_s.anInt4588;
                            if (i_416_ >= 0
                                    && i_416_ < var_s.anInt4587 - 1
                                    && i_417_ >= 0
                                    && i_417_ < var_s.anInt4590 - 1) {
                                int i_418_
                                        = (((is[i_416_][i_417_]
                                        * (var_s.anInt4592 - i_414_))
                                        + is[i_416_ + 1][i_417_] * i_414_)
                                        >> var_s.anInt4588);
                                int i_419_
                                        = (((is[i_416_][i_417_ + 1]
                                        * (var_s.anInt4592 - i_414_))
                                        + is[i_416_ + 1][i_417_ + 1] * i_414_)
                                        >> var_s.anInt4588);
                                int i_420_
                                        = (i_418_ * (var_s.anInt4592
                                        - i_415_) + i_419_ * i_415_
                                        >> var_s.anInt4588);
                                anIntArray5332[i_410_]
                                        = (anIntArray5332[i_410_]
                                        + ((i_420_ - i_370_) * (i_367_ - i_411_)
                                        / i_367_));
                            }
                        } else
                            anIntArray5332[i_410_] = anIntArray5332[i_410_];
                    }
                } else if (i == 3) {
                    int i_421_ = (i_367_ & 0xff) * 4;
                    int i_422_ = (i_367_ >> 8 & 0xff) * 4;
                    int i_423_ = (i_367_ >> 16 & 0xff) << 6;
                    int i_424_ = (i_367_ >> 24 & 0xff) << 6;
                    if (i_369_ - (i_421_ >> 1) < 0
                            || (i_369_ + (i_421_ >> 1) + var_s.anInt4592
                            >= var_s.anInt4587 << var_s.anInt4588)
                            || i_371_ - (i_422_ >> 1) < 0
                            || (i_371_ + (i_422_ >> 1) + var_s.anInt4592
                            >= var_s.anInt4590 << var_s.anInt4588))
                        return;
                    this.method626(i_421_, 10947, i_424_, i_369_, i_422_,
                            i_370_, i_423_, var_s, i_371_);
                } else if (i == 4) {
                    int i_425_ = var_s_368_.anInt4592 - 1;
                    int i_426_ = aShort5365 - aShort5329;
                    for (int i_427_ = 0; i_427_ < anInt5387; i_427_++) {
                        int i_428_ = anIntArray5356[i_427_] + i_369_;
                        int i_429_ = anIntArray5312[i_427_] + i_371_;
                        int i_430_ = i_428_ & i_425_;
                        int i_431_ = i_429_ & i_425_;
                        int i_432_ = i_428_ >> var_s_368_.anInt4588;
                        int i_433_ = i_429_ >> var_s_368_.anInt4588;
                        int i_434_
                                = (((is_376_[i_432_][i_433_]
                                * (var_s_368_.anInt4592 - i_430_))
                                + is_376_[i_432_ + 1][i_433_] * i_430_)
                                >> var_s_368_.anInt4588);
                        int i_435_
                                = (((is_376_[i_432_][i_433_ + 1]
                                * (var_s_368_.anInt4592 - i_430_))
                                + is_376_[i_432_ + 1][i_433_ + 1] * i_430_)
                                >> var_s_368_.anInt4588);
                        int i_436_ = (i_434_ * (var_s_368_.anInt4592
                                - i_431_) + i_435_ * i_431_
                                >> var_s_368_.anInt4588);
                        anIntArray5332[i_427_]
                                = (anIntArray5332[i_427_] + (i_436_ - i_370_)
                                + i_426_);
                    }
                    for (int i_437_ = anInt5387; i_437_ < anInt5340;
                         i_437_++) {
                        int i_438_ = anIntArray5356[i_437_] + i_369_;
                        int i_439_ = anIntArray5312[i_437_] + i_371_;
                        int i_440_ = i_438_ & i_425_;
                        int i_441_ = i_439_ & i_425_;
                        int i_442_ = i_438_ >> var_s_368_.anInt4588;
                        int i_443_ = i_439_ >> var_s_368_.anInt4588;
                        if (i_442_ >= 0
                                && i_442_ < var_s_368_.anInt4587 - 1
                                && i_443_ >= 0
                                && i_443_ < var_s_368_.anInt4590 - 1) {
                            int i_444_
                                    = (((is_376_[i_442_][i_443_]
                                    * (var_s_368_.anInt4592 - i_440_))
                                    + is_376_[i_442_ + 1][i_443_] * i_440_)
                                    >> var_s_368_.anInt4588);
                            int i_445_
                                    = (((is_376_[i_442_][i_443_ + 1]
                                    * (var_s_368_.anInt4592 - i_440_))
                                    + is_376_[i_442_ + 1][i_443_ + 1] * i_440_)
                                    >> var_s_368_.anInt4588);
                            int i_446_ = (i_444_ * (var_s_368_.anInt4592
                                    - i_441_) + i_445_ * i_441_
                                    >> var_s_368_.anInt4588);
                            anIntArray5332[i_437_]
                                    = (anIntArray5332[i_437_] + (i_446_ - i_370_)
                                    + i_426_);
                        }
                    }
                } else if (i == 5) {
                    int i_447_ = var_s_368_.anInt4592 - 1;
                    int i_448_ = aShort5365 - aShort5329;
                    for (int i_449_ = 0; i_449_ < anInt5387; i_449_++) {
                        int i_450_ = anIntArray5356[i_449_] + i_369_;
                        int i_451_ = anIntArray5312[i_449_] + i_371_;
                        int i_452_ = i_450_ & i_447_;
                        int i_453_ = i_451_ & i_447_;
                        int i_454_ = i_450_ >> var_s.anInt4588;
                        int i_455_ = i_451_ >> var_s.anInt4588;
                        int i_456_
                                = ((is[i_454_][i_455_] * (var_s.anInt4592
                                - i_452_)
                                + is[i_454_ + 1][i_455_] * i_452_)
                                >> var_s.anInt4588);
                        int i_457_
                                = ((is[i_454_][i_455_ + 1] * (var_s.anInt4592
                                - i_452_)
                                + is[i_454_ + 1][i_455_ + 1] * i_452_)
                                >> var_s.anInt4588);
                        int i_458_ = (i_456_ * (var_s.anInt4592
                                - i_453_) + i_457_ * i_453_
                                >> var_s.anInt4588);
                        i_456_ = (((is_376_[i_454_][i_455_]
                                * (var_s_368_.anInt4592 - i_452_))
                                + is_376_[i_454_ + 1][i_455_] * i_452_)
                                >> var_s_368_.anInt4588);
                        i_457_ = (((is_376_[i_454_][i_455_ + 1]
                                * (var_s_368_.anInt4592 - i_452_))
                                + is_376_[i_454_ + 1][i_455_ + 1] * i_452_)
                                >> var_s_368_.anInt4588);
                        int i_459_ = (i_456_ * (var_s_368_.anInt4592
                                - i_453_) + i_457_ * i_453_
                                >> var_s_368_.anInt4588);
                        int i_460_ = i_458_ - i_459_ - i_367_;
                        anIntArray5332[i_449_]
                                = ((anIntArray5332[i_449_] << 8) / i_448_ * i_460_
                                >> 8) - (i_370_ - i_458_);
                    }
                    for (int i_461_ = anInt5387; i_461_ < anInt5340;
                         i_461_++) {
                        int i_462_ = anIntArray5356[i_461_] + i_369_;
                        int i_463_ = anIntArray5312[i_461_] + i_371_;
                        int i_464_ = i_462_ & i_447_;
                        int i_465_ = i_463_ & i_447_;
                        int i_466_ = i_462_ >> var_s.anInt4588;
                        int i_467_ = i_463_ >> var_s.anInt4588;
                        if (i_466_ >= 0 && i_466_ < var_s.anInt4587 - 1
                                && i_466_ < var_s_368_.anInt4587 - 1
                                && i_467_ >= 0
                                && i_467_ < var_s.anInt4590 - 1
                                && i_467_ < var_s_368_.anInt4590 - 1) {
                            int i_468_
                                    = ((is[i_466_][i_467_] * (var_s.anInt4592
                                    - i_464_)
                                    + is[i_466_ + 1][i_467_] * i_464_)
                                    >> var_s.anInt4588);
                            int i_469_
                                    = (((is[i_466_][i_467_ + 1]
                                    * (var_s.anInt4592 - i_464_))
                                    + is[i_466_ + 1][i_467_ + 1] * i_464_)
                                    >> var_s.anInt4588);
                            int i_470_ = (i_468_ * (var_s.anInt4592
                                    - i_465_) + i_469_ * i_465_
                                    >> var_s.anInt4588);
                            i_468_
                                    = (((is_376_[i_466_][i_467_]
                                    * (var_s_368_.anInt4592 - i_464_))
                                    + is_376_[i_466_ + 1][i_467_] * i_464_)
                                    >> var_s_368_.anInt4588);
                            i_469_
                                    = (((is_376_[i_466_][i_467_ + 1]
                                    * (var_s_368_.anInt4592 - i_464_))
                                    + is_376_[i_466_ + 1][i_467_ + 1] * i_464_)
                                    >> var_s_368_.anInt4588);
                            int i_471_ = (i_468_ * (var_s_368_.anInt4592
                                    - i_465_) + i_469_ * i_465_
                                    >> var_s_368_.anInt4588);
                            int i_472_ = i_470_ - i_471_ - i_367_;
                            anIntArray5332[i_461_]
                                    = (((anIntArray5332[i_461_] << 8) / i_448_
                                    * i_472_)
                                    >> 8) - (i_370_ - i_470_);
                        }
                    }
                }
                aBoolean5323 = false;
            }
        }
    }

    final void C(int i) {
        if ((anInt5316 & 0x1000) != 4096)
            throw new IllegalStateException();
        anInt5344 = i;
        anInt5354 = 0;
    }

    private final void method644() {
        synchronized (this) {
            for (int i = 0; i < anInt5340; i++) {
                int i_473_ = anIntArray5356[i];
                anIntArray5356[i] = anIntArray5312[i];
                anIntArray5312[i] = -i_473_;
            }
            method631();
        }
    }

    final int RA() {
        if (!aBoolean5323)
            method655();
        return aShort5393;
    }

    final boolean method623(int i, int i_474_, Class101 class101, boolean bool,
                            int i_475_, int i_476_) {
        return method645(i, i_474_, class101, bool, i_475_, i_476_);
    }

    final Class342[] method604() {
        return aClass342Array5335;
    }

    final int WA() {
        return anInt5344;
    }

    final void s(int i) {
        if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized (this) {
                if ((anInt5316 & 0x10000) == 65536 && (i & 0x10000) == 0)
                    method634(true);
                anInt5316 = i;
            }
        } else {
            if ((anInt5316 & 0x10000) == 65536 && (i & 0x10000) == 0)
                method634(true);
            anInt5316 = i;
        }
    }

    final void method621() {
        if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized (this) {
                this.aBoolean1124 = false;
                this.notifyAll();
            }
        }
    }

    final void method624(int i, int i_477_, int i_478_, int i_479_) {
        if ((anInt5316 & 0x80000) != 524288)
            throw new IllegalStateException("FMT");
        for (int i_480_ = 0; i_480_ < anInt5351; i_480_++) {
            int i_481_ = aShortArray5311[i_480_] & 0xffff;
            int i_482_ = i_481_ >> 10 & 0x3f;
            int i_483_ = i_481_ >> 7 & 0x7;
            int i_484_ = i_481_ & 0x7f;
            if (i != -1)
                i_482_ += (i - i_482_) * i_479_ >> 7;
            if (i_477_ != -1)
                i_483_ += (i_477_ - i_483_) * i_479_ >> 7;
            if (i_478_ != -1)
                i_484_ += (i_478_ - i_484_) * i_479_ >> 7;
            aShortArray5311[i_480_]
                    = (short) (i_482_ << 10 | i_483_ << 7 | i_484_);
        }
        if (aClass6Array5361 != null) {
            for (int i_485_ = 0; i_485_ < anInt5389; i_485_++) {
                Class6 class6 = aClass6Array5361[i_485_];
                Class350 class350 = aClass350Array5363[i_485_];
                class350.anInt4313
                        = (class350.anInt4313 & ~0xffffff
                        | (Class126.anIntArray4983
                        [Class25.method303(((aShortArray5311
                                [class6.anInt144])
                                & 0xffff),
                        30)]) & 0xffffff);
            }
        }
        if (anInt5354 == 2)
            anInt5354 = 1;
    }

    final boolean method628(int i, int i_486_, Class101 class101, boolean bool,
                            int i_487_) {
        return method645(i, i_486_, class101, bool, i_487_, -1);
    }

    final int ma() {
        if (!aBoolean5323)
            method655();
        return aShort5348;
    }

    private final boolean method645(int i, int i_488_, Class101 class101,
                                    boolean bool, int i_489_, int i_490_) {
        aClass101_Sub1_5320 = (Class101_Sub1) class101;
        Class101_Sub1 class101_sub1
                = aHa_Sub1_5353.aClass101_Sub1_7492;
        float f = (class101_sub1.aFloat5686
                + ((class101_sub1.aFloat5672
                * aClass101_Sub1_5320.aFloat5686)
                + (class101_sub1.aFloat5673
                * aClass101_Sub1_5320.aFloat5685)
                + (class101_sub1.aFloat5669
                * aClass101_Sub1_5320.aFloat5681)));
        float f_491_
                = (class101_sub1.aFloat5685
                + ((class101_sub1.aFloat5655
                * aClass101_Sub1_5320.aFloat5686)
                + (class101_sub1.aFloat5678
                * aClass101_Sub1_5320.aFloat5685)
                + (class101_sub1.aFloat5666
                * aClass101_Sub1_5320.aFloat5681)));
        float f_492_
                = (class101_sub1.aFloat5681
                + ((class101_sub1.aFloat5662
                * aClass101_Sub1_5320.aFloat5686)
                + (class101_sub1.aFloat5680
                * aClass101_Sub1_5320.aFloat5685)
                + (class101_sub1.aFloat5664
                * aClass101_Sub1_5320.aFloat5681)));
        float f_493_
                = ((class101_sub1.aFloat5672
                * aClass101_Sub1_5320.aFloat5672)
                + (class101_sub1.aFloat5673
                * aClass101_Sub1_5320.aFloat5655)
                + (class101_sub1.aFloat5669
                * aClass101_Sub1_5320.aFloat5662));
        float f_494_
                = ((class101_sub1.aFloat5672
                * aClass101_Sub1_5320.aFloat5673)
                + (class101_sub1.aFloat5673
                * aClass101_Sub1_5320.aFloat5678)
                + (class101_sub1.aFloat5669
                * aClass101_Sub1_5320.aFloat5680));
        float f_495_
                = ((class101_sub1.aFloat5672
                * aClass101_Sub1_5320.aFloat5669)
                + (class101_sub1.aFloat5673
                * aClass101_Sub1_5320.aFloat5666)
                + (class101_sub1.aFloat5669
                * aClass101_Sub1_5320.aFloat5664));
        float f_496_
                = ((class101_sub1.aFloat5655
                * aClass101_Sub1_5320.aFloat5672)
                + (class101_sub1.aFloat5678
                * aClass101_Sub1_5320.aFloat5655)
                + (class101_sub1.aFloat5666
                * aClass101_Sub1_5320.aFloat5662));
        float f_497_
                = ((class101_sub1.aFloat5655
                * aClass101_Sub1_5320.aFloat5673)
                + (class101_sub1.aFloat5678
                * aClass101_Sub1_5320.aFloat5678)
                + (class101_sub1.aFloat5666
                * aClass101_Sub1_5320.aFloat5680));
        float f_498_
                = ((class101_sub1.aFloat5655
                * aClass101_Sub1_5320.aFloat5669)
                + (class101_sub1.aFloat5678
                * aClass101_Sub1_5320.aFloat5666)
                + (class101_sub1.aFloat5666
                * aClass101_Sub1_5320.aFloat5664));
        float f_499_
                = ((class101_sub1.aFloat5662
                * aClass101_Sub1_5320.aFloat5672)
                + (class101_sub1.aFloat5680
                * aClass101_Sub1_5320.aFloat5655)
                + (class101_sub1.aFloat5664
                * aClass101_Sub1_5320.aFloat5662));
        float f_500_
                = ((class101_sub1.aFloat5662
                * aClass101_Sub1_5320.aFloat5673)
                + (class101_sub1.aFloat5680
                * aClass101_Sub1_5320.aFloat5678)
                + (class101_sub1.aFloat5664
                * aClass101_Sub1_5320.aFloat5680));
        float f_501_
                = ((class101_sub1.aFloat5662
                * aClass101_Sub1_5320.aFloat5669)
                + (class101_sub1.aFloat5680
                * aClass101_Sub1_5320.aFloat5666)
                + (class101_sub1.aFloat5664
                * aClass101_Sub1_5320.aFloat5664));
        boolean bool_502_ = false;
        int i_503_ = aHa_Sub1_5353.anInt7510;
        int i_504_ = aHa_Sub1_5353.anInt7504;
        int i_505_ = aHa_Sub1_5353.anInt7491;
        int i_506_ = aHa_Sub1_5353.anInt7497;
        int i_507_ = 2147483647;
        int i_508_ = -2147483648;
        int i_509_ = 2147483647;
        int i_510_ = -2147483648;
        method632(Thread.currentThread());
        if (!aBoolean5323)
            method655();
        int i_511_ = aShort5393 - aShort5395 >> 1;
        int i_512_ = aShort5365 - aShort5329 >> 1;
        int i_513_ = aShort5331 - aShort5352 >> 1;
        int i_514_ = aShort5395 + i_511_;
        int i_515_ = aShort5329 + i_512_;
        int i_516_ = aShort5352 + i_513_;
        int i_517_ = i_514_ - (i_511_ << i_489_);
        int i_518_ = i_515_ - (i_512_ << i_489_);
        int i_519_ = i_516_ - (i_513_ << i_489_);
        int i_520_ = i_514_ + (i_511_ << i_489_);
        int i_521_ = i_515_ + (i_512_ << i_489_);
        int i_522_ = i_516_ + (i_513_ << i_489_);
        anIntArray5359[0] = i_517_;
        anIntArray5373[0] = i_518_;
        anIntArray5398[0] = i_519_;
        anIntArray5359[1] = i_520_;
        anIntArray5373[1] = i_518_;
        anIntArray5398[1] = i_519_;
        anIntArray5359[2] = i_517_;
        anIntArray5373[2] = i_521_;
        anIntArray5398[2] = i_519_;
        anIntArray5359[3] = i_520_;
        anIntArray5373[3] = i_521_;
        anIntArray5398[3] = i_519_;
        anIntArray5359[4] = i_517_;
        anIntArray5373[4] = i_518_;
        anIntArray5398[4] = i_522_;
        anIntArray5359[5] = i_520_;
        anIntArray5373[5] = i_518_;
        anIntArray5398[5] = i_522_;
        anIntArray5359[6] = i_517_;
        anIntArray5373[6] = i_521_;
        anIntArray5398[6] = i_522_;
        anIntArray5359[7] = i_520_;
        anIntArray5373[7] = i_521_;
        anIntArray5398[7] = i_522_;
        for (int i_523_ = 0; i_523_ < 8; i_523_++) {
            int i_524_ = anIntArray5359[i_523_];
            int i_525_ = anIntArray5373[i_523_];
            int i_526_ = anIntArray5398[i_523_];
            float f_527_
                    = f + (f_493_ * (float) i_524_ + f_494_ * (float) i_525_
                    + f_495_ * (float) i_526_);
            float f_528_
                    = f_491_ + (f_496_ * (float) i_524_ + f_497_ * (float) i_525_
                    + f_498_ * (float) i_526_);
            float f_529_
                    = f_492_ + (f_499_ * (float) i_524_ + f_500_ * (float) i_525_
                    + f_501_ * (float) i_526_);
            if (f_529_ >= (float) aHa_Sub1_5353.anInt7482) {
                if (i_490_ > 0)
                    f_529_ = (float) i_490_;
                int i_530_ = i_503_ + (int) (f_527_ * (float) i_505_ / f_529_);
                int i_531_ = i_504_ + (int) (f_528_ * (float) i_506_ / f_529_);
                if (i_530_ < i_507_)
                    i_507_ = i_530_;
                if (i_530_ > i_508_)
                    i_508_ = i_530_;
                if (i_531_ < i_509_)
                    i_509_ = i_531_;
                if (i_531_ > i_510_)
                    i_510_ = i_531_;
                bool_502_ = true;
            }
        }
        if (bool_502_ && i > i_507_ && i < i_508_ && i_488_ > i_509_
                && i_488_ < i_510_) {
            if (bool)
                return true;
            for (int i_532_ = 0; i_532_ < anInt5340; i_532_++) {
                int i_533_ = anIntArray5356[i_532_];
                int i_534_ = anIntArray5332[i_532_];
                int i_535_ = anIntArray5312[i_532_];
                float f_536_
                        = f + (f_493_ * (float) i_533_ + f_494_ * (float) i_534_
                        + f_495_ * (float) i_535_);
                float f_537_ = f_491_ + (f_496_ * (float) i_533_
                        + f_497_ * (float) i_534_
                        + f_498_ * (float) i_535_);
                float f_538_ = f_492_ + (f_499_ * (float) i_533_
                        + f_500_ * (float) i_534_
                        + f_501_ * (float) i_535_);
                if (f_538_ >= (float) aHa_Sub1_5353.anInt7482) {
                    if (i_490_ > 0)
                        f_538_ = (float) i_490_;
                    anIntArray5321[i_532_]
                            = i_503_ + (int) (f_536_ * (float) i_505_ / f_538_);
                    anIntArray5343[i_532_]
                            = i_504_ + (int) (f_537_ * (float) i_506_ / f_538_);
                } else
                    anIntArray5321[i_532_] = -999999;
            }
            for (int i_539_ = 0; i_539_ < anInt5351; i_539_++) {
                if (anIntArray5321[aShortArray5317[i_539_]] != -999999
                        && anIntArray5321[aShortArray5394[i_539_]] != -999999
                        && anIntArray5321[aShortArray5364[i_539_]] != -999999
                        && method630(i, i_488_,
                        anIntArray5343[aShortArray5317[i_539_]],
                        anIntArray5343[aShortArray5394[i_539_]],
                        anIntArray5343[aShortArray5364[i_539_]],
                        anIntArray5321[aShortArray5317[i_539_]],
                        anIntArray5321[aShortArray5394[i_539_]],
                        anIntArray5321[aShortArray5364[i_539_]]))
                    return true;
            }
        }
        return false;
    }

    private final void method646(int i) {
        int i_540_ = 0;
        int i_541_ = aHa_Sub1_5353.anInt7482;
        short i_542_ = aShortArray5317[i];
        short i_543_ = aShortArray5394[i];
        short i_544_ = aShortArray5364[i];
        int i_545_ = anIntArray5392[i_542_];
        int i_546_ = anIntArray5392[i_543_];
        int i_547_ = anIntArray5392[i_544_];
        if (aByteArray5325 == null)
            aClass109_5383.anInt1674 = 0;
        else
            aClass109_5383.anInt1674 = aByteArray5325[i] & 0xff;
        if (i_545_ >= i_541_) {
            anIntArray5315[i_540_] = anIntArray5321[i_542_];
            anIntArray5371[i_540_] = anIntArray5343[i_542_];
            anIntArray5381[i_540_] = anIntArray5355[i_542_];
            anIntArray5377[i_540_++] = anIntArray5368[i] & 0xffff;
        } else {
            int i_548_ = anIntArray5399[i_542_];
            int i_549_ = anIntArray5384[i_542_];
            int i_550_ = anIntArray5368[i] & 0xffff;
            if (i_547_ >= i_541_) {
                int i_551_ = (i_541_ - i_545_) * (65536 / (i_547_ - i_545_));
                anIntArray5315[i_540_]
                        = (aClass167_5367.anInt2229
                        + ((i_548_ + ((anIntArray5399[i_544_] - i_548_) * i_551_
                        >> 16))
                        * aHa_Sub1_5353.anInt7491 / i_541_));
                anIntArray5371[i_540_]
                        = (aClass167_5367.anInt2215
                        + ((i_549_ + ((anIntArray5384[i_544_] - i_549_) * i_551_
                        >> 16))
                        * aHa_Sub1_5353.anInt7497 / i_541_));
                anIntArray5381[i_540_] = i_541_;
                anIntArray5377[i_540_++]
                        = (i_550_
                        + (((anIntArray5366[i] & 0xffff) - i_550_) * i_551_
                        >> 16));
            }
            if (i_546_ >= i_541_) {
                int i_552_ = (i_541_ - i_545_) * (65536 / (i_546_ - i_545_));
                anIntArray5315[i_540_]
                        = (aClass167_5367.anInt2229
                        + ((i_548_ + ((anIntArray5399[i_543_] - i_548_) * i_552_
                        >> 16))
                        * aHa_Sub1_5353.anInt7491 / i_541_));
                anIntArray5371[i_540_]
                        = (aClass167_5367.anInt2215
                        + ((i_549_ + ((anIntArray5384[i_543_] - i_549_) * i_552_
                        >> 16))
                        * aHa_Sub1_5353.anInt7497 / i_541_));
                anIntArray5381[i_540_] = i_541_;
                anIntArray5377[i_540_++]
                        = (i_550_
                        + (((anIntArray5337[i] & 0xffff) - i_550_) * i_552_
                        >> 16));
            }
        }
        if (i_546_ >= i_541_) {
            anIntArray5315[i_540_] = anIntArray5321[i_543_];
            anIntArray5371[i_540_] = anIntArray5343[i_543_];
            anIntArray5381[i_540_] = anIntArray5355[i_543_];
            anIntArray5377[i_540_++] = anIntArray5337[i] & 0xffff;
        } else {
            int i_553_ = anIntArray5399[i_543_];
            int i_554_ = anIntArray5384[i_543_];
            int i_555_ = anIntArray5337[i] & 0xffff;
            if (i_545_ >= i_541_) {
                int i_556_ = (i_541_ - i_546_) * (65536 / (i_545_ - i_546_));
                anIntArray5315[i_540_]
                        = (aClass167_5367.anInt2229
                        + ((i_553_ + ((anIntArray5399[i_542_] - i_553_) * i_556_
                        >> 16))
                        * aHa_Sub1_5353.anInt7491 / i_541_));
                anIntArray5371[i_540_]
                        = (aClass167_5367.anInt2215
                        + ((i_554_ + ((anIntArray5384[i_542_] - i_554_) * i_556_
                        >> 16))
                        * aHa_Sub1_5353.anInt7497 / i_541_));
                anIntArray5381[i_540_] = i_541_;
                anIntArray5377[i_540_++]
                        = (i_555_
                        + (((anIntArray5368[i] & 0xffff) - i_555_) * i_556_
                        >> 16));
            }
            if (i_547_ >= i_541_) {
                int i_557_ = (i_541_ - i_546_) * (65536 / (i_547_ - i_546_));
                anIntArray5315[i_540_]
                        = (aClass167_5367.anInt2229
                        + ((i_553_ + ((anIntArray5399[i_544_] - i_553_) * i_557_
                        >> 16))
                        * aHa_Sub1_5353.anInt7491 / i_541_));
                anIntArray5371[i_540_]
                        = (aClass167_5367.anInt2215
                        + ((i_554_ + ((anIntArray5384[i_544_] - i_554_) * i_557_
                        >> 16))
                        * aHa_Sub1_5353.anInt7497 / i_541_));
                anIntArray5381[i_540_] = i_541_;
                anIntArray5377[i_540_++]
                        = (i_555_
                        + (((anIntArray5366[i] & 0xffff) - i_555_) * i_557_
                        >> 16));
            }
        }
        if (i_547_ >= i_541_) {
            anIntArray5315[i_540_] = anIntArray5321[i_544_];
            anIntArray5371[i_540_] = anIntArray5343[i_544_];
            anIntArray5381[i_540_] = anIntArray5355[i_544_];
            anIntArray5377[i_540_++] = anIntArray5366[i] & 0xffff;
        } else {
            int i_558_ = anIntArray5399[i_544_];
            int i_559_ = anIntArray5384[i_544_];
            int i_560_ = anIntArray5366[i] & 0xffff;
            if (i_546_ >= i_541_) {
                int i_561_ = (i_541_ - i_547_) * (65536 / (i_546_ - i_547_));
                anIntArray5315[i_540_]
                        = (aClass167_5367.anInt2229
                        + ((i_558_ + ((anIntArray5399[i_543_] - i_558_) * i_561_
                        >> 16))
                        * aHa_Sub1_5353.anInt7491 / i_541_));
                anIntArray5371[i_540_]
                        = (aClass167_5367.anInt2215
                        + ((i_559_ + ((anIntArray5384[i_543_] - i_559_) * i_561_
                        >> 16))
                        * aHa_Sub1_5353.anInt7497 / i_541_));
                anIntArray5381[i_540_] = i_541_;
                anIntArray5377[i_540_++]
                        = (i_560_
                        + (((anIntArray5337[i] & 0xffff) - i_560_) * i_561_
                        >> 16));
            }
            if (i_545_ >= i_541_) {
                int i_562_ = (i_541_ - i_547_) * (65536 / (i_545_ - i_547_));
                anIntArray5315[i_540_]
                        = (aClass167_5367.anInt2229
                        + ((i_558_ + ((anIntArray5399[i_542_] - i_558_) * i_562_
                        >> 16))
                        * aHa_Sub1_5353.anInt7491 / i_541_));
                anIntArray5371[i_540_]
                        = (aClass167_5367.anInt2215
                        + ((i_559_ + ((anIntArray5384[i_542_] - i_559_) * i_562_
                        >> 16))
                        * aHa_Sub1_5353.anInt7497 / i_541_));
                anIntArray5381[i_540_] = i_541_;
                anIntArray5377[i_540_++]
                        = (i_560_
                        + (((anIntArray5368[i] & 0xffff) - i_560_) * i_562_
                        >> 16));
            }
        }
        int i_563_ = anIntArray5315[0];
        int i_564_ = anIntArray5315[1];
        int i_565_ = anIntArray5315[2];
        int i_566_ = anIntArray5371[0];
        int i_567_ = anIntArray5371[1];
        int i_568_ = anIntArray5371[2];
        i_545_ = anIntArray5381[0];
        i_546_ = anIntArray5381[1];
        i_547_ = anIntArray5381[2];
        aClass109_5383.aBoolean1671 = false;
        if (i_540_ == 3) {
            if (i_563_ < 0 || i_564_ < 0 || i_565_ < 0
                    || i_563_ > aClass167_5367.anInt2221
                    || i_564_ > aClass167_5367.anInt2221
                    || i_565_ > aClass167_5367.anInt2221)
                aClass109_5383.aBoolean1671 = true;
            if (aShortArray5388 == null || aShortArray5388[i] == -1) {
                if (anIntArray5366[i] == -1)
                    aClass109_5383.method1018((float) i_566_, (float) i_567_,
                            (float) i_568_, (float) i_563_,
                            (float) i_564_, (float) i_565_,
                            (float) i_545_, (float) i_546_,
                            (float) i_547_,
                            (Class126.anIntArray4983
                                    [anIntArray5368[i] & 0xffff]));
                else
                    aClass109_5383.method1022((float) i_566_, (float) i_567_,
                            (float) i_568_, (float) i_563_,
                            (float) i_564_, (float) i_565_,
                            (float) i_545_, (float) i_546_,
                            (float) i_547_,
                            (float) anIntArray5377[0],
                            (float) anIntArray5377[1],
                            (float) anIntArray5377[2]);
            } else {
                int i_569_ = -16777216;
                if (aByteArray5325 != null)
                    i_569_ = 255 - (aByteArray5325[i] & 0xff) << 24;
                int i_570_ = i_569_ | anIntArray5368[i] & 0xffffff;
                if (anIntArray5366[i] == -1)
                    aClass109_5383.method1024((float) i_566_, (float) i_567_,
                            (float) i_568_, (float) i_563_,
                            (float) i_564_, (float) i_565_,
                            (float) i_545_, (float) i_546_,
                            (float) i_547_,
                            aFloatArrayArray5314[i][0],
                            aFloatArrayArray5314[i][1],
                            aFloatArrayArray5314[i][2],
                            aFloatArrayArray5345[i][0],
                            aFloatArrayArray5345[i][1],
                            aFloatArrayArray5345[i][2],
                            i_570_, i_570_, i_570_,
                            (aClass167_5367
                                    .anInt2192),
                            0, 0, 0, aShortArray5388[i]);
                else
                    aClass109_5383.method1024((float) i_566_, (float) i_567_,
                            (float) i_568_, (float) i_563_,
                            (float) i_564_, (float) i_565_,
                            (float) i_545_, (float) i_546_,
                            (float) i_547_,
                            aFloatArrayArray5314[i][0],
                            aFloatArrayArray5314[i][1],
                            aFloatArrayArray5314[i][2],
                            aFloatArrayArray5345[i][0],
                            aFloatArrayArray5345[i][1],
                            aFloatArrayArray5345[i][2],
                            i_570_, i_570_, i_570_,
                            (aClass167_5367
                                    .anInt2192),
                            0, 0, 0, aShortArray5388[i]);
            }
        }
        if (i_540_ == 4) {
            if (i_563_ < 0 || i_564_ < 0 || i_565_ < 0
                    || i_563_ > aClass167_5367.anInt2221
                    || i_564_ > aClass167_5367.anInt2221
                    || i_565_ > aClass167_5367.anInt2221
                    || anIntArray5315[3] < 0
                    || anIntArray5315[3] > aClass167_5367.anInt2221)
                aClass109_5383.aBoolean1671 = true;
            if (aShortArray5388 == null || aShortArray5388[i] == -1) {
                if (anIntArray5366[i] == -1) {
                    int i_571_
                            = Class126.anIntArray4983[anIntArray5368[i] & 0xffff];
                    aClass109_5383.method1018((float) i_566_, (float) i_567_,
                            (float) i_568_, (float) i_563_,
                            (float) i_564_, (float) i_565_,
                            (float) i_545_, (float) i_546_,
                            (float) i_547_, i_571_);
                    aClass109_5383.method1018((float) i_566_, (float) i_568_,
                            (float) anIntArray5371[3],
                            (float) i_563_, (float) i_565_,
                            (float) anIntArray5315[3],
                            (float) i_545_, (float) i_546_,
                            (float) anIntArray5381[3],
                            i_571_);
                } else {
                    aClass109_5383.method1022((float) i_566_, (float) i_567_,
                            (float) i_568_, (float) i_563_,
                            (float) i_564_, (float) i_565_,
                            (float) i_545_, (float) i_546_,
                            (float) i_547_,
                            (float) anIntArray5377[0],
                            (float) anIntArray5377[1],
                            (float) anIntArray5377[2]);
                    aClass109_5383.method1022((float) i_566_, (float) i_568_,
                            (float) anIntArray5371[3],
                            (float) i_563_, (float) i_565_,
                            (float) anIntArray5315[3],
                            (float) i_545_, (float) i_546_,
                            (float) anIntArray5381[3],
                            (float) anIntArray5377[0],
                            (float) anIntArray5377[2],
                            (float) anIntArray5377[3]);
                }
            } else {
                int i_572_ = -16777216;
                if (aByteArray5325 != null)
                    i_572_ = 255 - (aByteArray5325[i] & 0xff) << 24;
                int i_573_ = i_572_ | anIntArray5368[i] & 0xffffff;
                if (anIntArray5366[i] == -1) {
                    aClass109_5383.method1024((float) i_566_, (float) i_567_,
                            (float) i_568_, (float) i_563_,
                            (float) i_564_, (float) i_565_,
                            (float) i_545_, (float) i_546_,
                            (float) i_547_,
                            aFloatArrayArray5314[i][0],
                            aFloatArrayArray5314[i][1],
                            aFloatArrayArray5314[i][2],
                            aFloatArrayArray5345[i][0],
                            aFloatArrayArray5345[i][1],
                            aFloatArrayArray5345[i][2],
                            i_573_, i_573_, i_573_,
                            (aClass167_5367
                                    .anInt2192),
                            0, 0, 0, aShortArray5388[i]);
                    aClass109_5383.method1024((float) i_566_, (float) i_568_,
                            (float) anIntArray5371[3],
                            (float) i_563_, (float) i_565_,
                            (float) anIntArray5315[3],
                            (float) i_545_, (float) i_547_,
                            (float) anIntArray5381[3],
                            aFloatArrayArray5314[i][0],
                            aFloatArrayArray5314[i][1],
                            aFloatArrayArray5314[i][2],
                            aFloatArrayArray5345[i][0],
                            aFloatArrayArray5345[i][1],
                            aFloatArrayArray5345[i][2],
                            i_573_, i_573_, i_573_,
                            (aClass167_5367
                                    .anInt2192),
                            0, 0, 0, aShortArray5388[i]);
                } else {
                    aClass109_5383.method1024((float) i_566_, (float) i_567_,
                            (float) i_568_, (float) i_563_,
                            (float) i_564_, (float) i_565_,
                            (float) i_545_, (float) i_546_,
                            (float) i_547_,
                            aFloatArrayArray5314[i][0],
                            aFloatArrayArray5314[i][1],
                            aFloatArrayArray5314[i][2],
                            aFloatArrayArray5345[i][0],
                            aFloatArrayArray5345[i][1],
                            aFloatArrayArray5345[i][2],
                            i_573_, i_573_, i_573_,
                            (aClass167_5367
                                    .anInt2192),
                            0, 0, 0, aShortArray5388[i]);
                    aClass109_5383.method1024((float) i_566_, (float) i_568_,
                            (float) anIntArray5371[3],
                            (float) i_563_, (float) i_565_,
                            (float) anIntArray5315[3],
                            (float) i_545_, (float) i_547_,
                            (float) anIntArray5381[3],
                            aFloatArrayArray5314[i][0],
                            aFloatArrayArray5314[i][1],
                            aFloatArrayArray5314[i][2],
                            aFloatArrayArray5345[i][0],
                            aFloatArrayArray5345[i][1],
                            aFloatArrayArray5345[i][2],
                            i_573_, i_573_, i_573_,
                            (aClass167_5367
                                    .anInt2192),
                            0, 0, 0, aShortArray5388[i]);
                }
            }
        }
    }

    private final void method647() {
        if (anInt5354 == 0)
            method634(false);
        else if (aHa_Sub1_5353.anInt7485 > 1) {
            synchronized (this) {
                method640();
            }
        } else
            method640();
    }

    private final void method648(Thread thread) {
        Class167 class167 = aHa_Sub1_5353.method3724(thread);
        if (class167 != aClass167_5336) {
            aClass167_5336 = class167;
            aClass64_Sub1_5378
                    = aClass167_5336.aClass64_Sub1_2243;
            aClass64_Sub1_5339
                    = aClass167_5336.aClass64_Sub1_2224;
            aClass64_Sub1_5396
                    = aClass167_5336.aClass64_Sub1_2219;
            aClass64_Sub1_5347
                    = aClass167_5336.aClass64_Sub1_2239;
            aClass64_Sub1_5390
                    = aClass167_5336.aClass64_Sub1_2233;
            aClass64_Sub1_5374
                    = aClass167_5336.aClass64_Sub1_2231;
            aClass64_Sub1_5328
                    = aClass167_5336.aClass64_Sub1_2223;
            aClass64_Sub1_5376
                    = aClass167_5336.aClass64_Sub1_2227;
            aClass64_Sub1_5397
                    = aClass167_5336.aClass64_Sub1_2246;
            aClass64_Sub1_5319
                    = aClass167_5336.aClass64_Sub1_2225;
        }
    }

    final void LA(int i) {
        if ((anInt5316 & 0x2000) != 8192)
            throw new IllegalStateException();
        anInt5349 = i;
        anInt5354 = 0;
    }

    final void VA(int i) {
        if ((anInt5316 & 0x3) != 3)
            throw new IllegalStateException();
        int i_574_ = Class70.anIntArray1207[i];
        int i_575_ = Class70.anIntArray1204[i];
        synchronized (this) {
            for (int i_576_ = 0; i_576_ < anInt5340; i_576_++) {
                int i_577_ = ((anIntArray5332[i_576_] * i_574_
                        + anIntArray5356[i_576_] * i_575_)
                        >> 14);
                anIntArray5332[i_576_]
                        = (anIntArray5332[i_576_] * i_575_
                        - anIntArray5356[i_576_] * i_574_) >> 14;
                anIntArray5356[i_576_] = i_577_;
            }
            method631();
        }
    }

    final void a(int i) {
        if ((anInt5316 & 0x5) != 5)
            throw new IllegalStateException();
        if (i == 4096)
            method644();
        else if (i == 8192)
            method651();
        else if (i == 12288)
            method639();
        else {
            int i_578_ = Class70.anIntArray1207[i];
            int i_579_ = Class70.anIntArray1204[i];
            synchronized (this) {
                for (int i_580_ = 0; i_580_ < anInt5340; i_580_++) {
                    int i_581_ = ((anIntArray5312[i_580_] * i_578_
                            + anIntArray5356[i_580_] * i_579_)
                            >> 14);
                    anIntArray5312[i_580_]
                            = (anIntArray5312[i_580_] * i_579_
                            - anIntArray5356[i_580_] * i_578_) >> 14;
                    anIntArray5356[i_580_] = i_581_;
                }
                method631();
            }
        }
    }

    final void aa(short i, short i_582_) {
        if (aShortArray5388 != null) {
            if (!aBoolean5391 && i_582_ >= 0) {
                Class12 class12
                        = aHa_Sub1_5353.aD4579.method3(i_582_ & 0xffff,
                        -6662);
                if (class12.aByte198 != 0
                        || class12.aByte211 != 0)
                    aBoolean5391 = true;
            }
            for (int i_583_ = 0; i_583_ < anInt5351; i_583_++) {
                if (aShortArray5388[i_583_] == i)
                    aShortArray5388[i_583_] = i_582_;
            }
        }
    }

    final void method613(Class64 class64, int i, int i_584_, int i_585_,
                         boolean bool) {
        Class64_Sub1 class64_sub1_586_ = (Class64_Sub1) class64;
        if ((anInt5316 & 0x10000) != 65536)
            throw new IllegalStateException("");
        if ((class64_sub1_586_.anInt5316 & 0x10000) != 65536)
            throw new IllegalStateException("");
        method632(Thread.currentThread());
        method655();
        method636();
        class64_sub1_586_.method655();
        class64_sub1_586_.method636();
        anInt5341++;
        int i_587_ = 0;
        int[] is = class64_sub1_586_.anIntArray5356;
        int i_588_ = class64_sub1_586_.anInt5387;
        for (int i_589_ = 0; i_589_ < anInt5387; i_589_++) {
            Class360 class360 = aClass360Array5360[i_589_];
            if (class360.anInt4429 != 0) {
                int i_590_ = anIntArray5332[i_589_] - i_584_;
                if (i_590_ >= class64_sub1_586_.aShort5329
                        && i_590_ <= class64_sub1_586_.aShort5365) {
                    int i_591_ = anIntArray5356[i_589_] - i;
                    if (i_591_ >= class64_sub1_586_.aShort5395
                            && i_591_ <= class64_sub1_586_.aShort5393) {
                        int i_592_ = anIntArray5312[i_589_] - i_585_;
                        if (i_592_ >= class64_sub1_586_.aShort5352
                                && i_592_ <= class64_sub1_586_.aShort5331) {
                            for (int i_593_ = 0; i_593_ < i_588_; i_593_++) {
                                Class360 class360_594_
                                        = (class64_sub1_586_.aClass360Array5360
                                        [i_593_]);
                                if (i_591_ == is[i_593_]
                                        && i_592_ == (class64_sub1_586_
                                        .anIntArray5312[i_593_])
                                        && i_590_ == (class64_sub1_586_
                                        .anIntArray5332[i_593_])
                                        && (class360_594_.anInt4429
                                        != 0)) {
                                    if (aClass360Array5313 == null)
                                        aClass360Array5313
                                                = new Class360[anInt5387];
                                    if (class64_sub1_586_.aClass360Array5313
                                            == null)
                                        class64_sub1_586_.aClass360Array5313
                                                = new Class360[i_588_];
                                    Class360 class360_595_
                                            = aClass360Array5313[i_589_];
                                    if (class360_595_ == null)
                                        class360_595_
                                                = aClass360Array5313[i_589_]
                                                = new Class360(class360);
                                    Class360 class360_596_
                                            = (class64_sub1_586_.aClass360Array5313
                                            [i_593_]);
                                    if (class360_596_ == null)
                                        class360_596_
                                                = class64_sub1_586_
                                                .aClass360Array5313[i_593_]
                                                = new Class360(class360_594_);
                                    class360_595_.anInt4430
                                            += (class360_594_
                                            .anInt4430);
                                    class360_595_.anInt4428
                                            += (class360_594_
                                            .anInt4428);
                                    class360_595_.anInt4427
                                            += (class360_594_
                                            .anInt4427);
                                    class360_595_.anInt4429
                                            += (class360_594_
                                            .anInt4429);
                                    class360_596_.anInt4430
                                            += class360.anInt4430;
                                    class360_596_.anInt4428
                                            += class360.anInt4428;
                                    class360_596_.anInt4427
                                            += class360.anInt4427;
                                    class360_596_.anInt4429
                                            += class360.anInt4429;
                                    i_587_++;
                                    anIntArray5326[i_589_] = anInt5341;
                                    anIntArray5318[i_593_] = anInt5341;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i_587_ >= 3 && bool) {
            for (int i_597_ = 0; i_597_ < anInt5351; i_597_++) {
                if (anIntArray5326[aShortArray5317[i_597_]] == anInt5341
                        && anIntArray5326[aShortArray5394[i_597_]] == anInt5341
                        && anIntArray5326[aShortArray5364[i_597_]] == anInt5341) {
                    if (aByteArray5386 == null)
                        aByteArray5386 = new byte[anInt5351];
                    aByteArray5386[i_597_] = (byte) 2;
                }
            }
            for (int i_598_ = 0; i_598_ < class64_sub1_586_.anInt5351;
                 i_598_++) {
                if ((anIntArray5318[class64_sub1_586_.aShortArray5317[i_598_]]
                        == anInt5341)
                        && anIntArray5318[(class64_sub1_586_.aShortArray5394
                        [i_598_])] == anInt5341
                        && anIntArray5318[(class64_sub1_586_.aShortArray5364
                        [i_598_])] == anInt5341) {
                    if (class64_sub1_586_.aByteArray5386 == null)
                        class64_sub1_586_.aByteArray5386
                                = new byte[class64_sub1_586_.anInt5351];
                    class64_sub1_586_.aByteArray5386[i_598_] = (byte) 2;
                }
            }
        }
    }

    private final void method649() {
        aClass360Array5360 = new Class360[anInt5387];
        for (int i = 0; i < anInt5387; i++)
            aClass360Array5360[i] = new Class360();
        for (int i = 0; i < anInt5351; i++) {
            short i_599_ = aShortArray5317[i];
            short i_600_ = aShortArray5394[i];
            short i_601_ = aShortArray5364[i];
            int i_602_ = anIntArray5356[i_600_] - anIntArray5356[i_599_];
            int i_603_ = anIntArray5332[i_600_] - anIntArray5332[i_599_];
            int i_604_ = anIntArray5312[i_600_] - anIntArray5312[i_599_];
            int i_605_ = anIntArray5356[i_601_] - anIntArray5356[i_599_];
            int i_606_ = anIntArray5332[i_601_] - anIntArray5332[i_599_];
            int i_607_ = anIntArray5312[i_601_] - anIntArray5312[i_599_];
            int i_608_ = i_603_ * i_607_ - i_606_ * i_604_;
            int i_609_ = i_604_ * i_605_ - i_607_ * i_602_;
            int i_610_;
            for (i_610_ = i_602_ * i_606_ - i_605_ * i_603_;
                 (i_608_ > 8192 || i_609_ > 8192 || i_610_ > 8192
                         || i_608_ < -8192 || i_609_ < -8192 || i_610_ < -8192);
                 i_610_ >>= 1) {
                i_608_ >>= 1;
                i_609_ >>= 1;
            }
            int i_611_
                    = (int) Math.sqrt(i_608_ * i_608_ + i_609_ * i_609_
                    + i_610_ * i_610_);
            if (i_611_ <= 0)
                i_611_ = 1;
            i_608_ = i_608_ * 256 / i_611_;
            i_609_ = i_609_ * 256 / i_611_;
            i_610_ = i_610_ * 256 / i_611_;
            byte i_612_;
            if (aByteArray5386 == null)
                i_612_ = (byte) 0;
            else
                i_612_ = aByteArray5386[i];
            if (i_612_ == 0) {
                Class360 class360 = aClass360Array5360[i_599_];
                class360.anInt4430 += i_608_;
                class360.anInt4428 += i_609_;
                class360.anInt4427 += i_610_;
                class360.anInt4429++;
                class360 = aClass360Array5360[i_600_];
                class360.anInt4430 += i_608_;
                class360.anInt4428 += i_609_;
                class360.anInt4427 += i_610_;
                class360.anInt4429++;
                class360 = aClass360Array5360[i_601_];
                class360.anInt4430 += i_608_;
                class360.anInt4428 += i_609_;
                class360.anInt4427 += i_610_;
                class360.anInt4429++;
            } else if (i_612_ == 1) {
                if (aClass41Array5385 == null)
                    aClass41Array5385 = new Class41[anInt5351];
                Class41 class41 = aClass41Array5385[i] = new Class41();
                class41.anInt561 = i_608_;
                class41.anInt560 = i_609_;
                class41.anInt559 = i_610_;
            }
        }
    }

    final void H(int i, int i_613_, int i_614_) {
        if (i != 0 && (anInt5316 & 0x1) != 1)
            throw new IllegalStateException();
        if (i_613_ != 0 && (anInt5316 & 0x2) != 2)
            throw new IllegalStateException();
        if (i_614_ != 0 && (anInt5316 & 0x4) != 4)
            throw new IllegalStateException();
        synchronized (this) {
            for (int i_615_ = 0; i_615_ < anInt5340; i_615_++) {
                anIntArray5356[i_615_] += i;
                anIntArray5332[i_615_] += i_613_;
                anIntArray5312[i_615_] += i_614_;
            }
        }
    }

    final void v() {
        if ((anInt5316 & 0x10) != 16)
            throw new IllegalStateException();
        synchronized (this) {
            for (int i = 0; i < anInt5340; i++)
                anIntArray5312[i] = -anIntArray5312[i];
            if (aClass360Array5360 != null) {
                for (int i = 0; i < anInt5387; i++) {
                    if (aClass360Array5360[i] != null)
                        aClass360Array5360[i].anInt4427
                                = -aClass360Array5360[i].anInt4427;
                }
            }
            if (aClass360Array5313 != null) {
                for (int i = 0; i < anInt5387; i++) {
                    if (aClass360Array5313[i] != null)
                        aClass360Array5313[i].anInt4427
                                = -aClass360Array5313[i].anInt4427;
                }
            }
            if (aClass41Array5385 != null) {
                for (int i = 0; i < anInt5351; i++) {
                    if (aClass41Array5385[i] != null)
                        aClass41Array5385[i].anInt559
                                = -aClass41Array5385[i].anInt559;
                }
            }
            short[] is = aShortArray5317;
            aShortArray5317 = aShortArray5364;
            aShortArray5364 = is;
            if (aFloatArrayArray5314 != null) {
                for (int i = 0; i < anInt5351; i++) {
                    if (aFloatArrayArray5314[i] != null) {
                        float f = aFloatArrayArray5314[i][0];
                        aFloatArrayArray5314[i][0]
                                = aFloatArrayArray5314[i][2];
                        aFloatArrayArray5314[i][2] = f;
                    }
                    if (aFloatArrayArray5345[i] != null) {
                        float f = aFloatArrayArray5345[i][0];
                        aFloatArrayArray5345[i][0]
                                = aFloatArrayArray5345[i][2];
                        aFloatArrayArray5345[i][2] = f;
                    }
                }
            }
            aBoolean5323 = false;
            anInt5354 = 0;
        }
    }

    private final void method650(boolean bool, boolean bool_616_, int i,
                                 int i_617_) {
        if (aClass6Array5361 != null) {
            for (int i_618_ = 0; i_618_ < anInt5389; i_618_++) {
                Class6 class6 = aClass6Array5361[i_618_];
                anIntArray5400[class6.anInt144] = i_618_;
            }
        }
        if (aBoolean5382 || aClass6Array5361 != null) {
            if ((anInt5316 & 0x100) == 0 && aShortArray5327 != null) {
                for (int i_619_ = 0; i_619_ < anInt5351; i_619_++) {
                    short i_620_ = aShortArray5327[i_619_];
                    method643(i_620_, bool, bool_616_);
                }
            } else {
                for (int i_621_ = 0; i_621_ < anInt5351; i_621_++) {
                    if (!method629(i_621_) && !method638(i_621_))
                        method643(i_621_, bool, bool_616_);
                }
                if (aByteArray5358 == null) {
                    for (int i_622_ = 0; i_622_ < anInt5351; i_622_++) {
                        if (method629(i_622_) || method638(i_622_))
                            method643(i_622_, bool, bool_616_);
                    }
                } else {
                    for (int i_623_ = 0; i_623_ < 12; i_623_++) {
                        for (int i_624_ = 0; i_624_ < anInt5351; i_624_++) {
                            if (aByteArray5358[i_624_] == i_623_
                                    && (method629(i_624_) || method638(i_624_)))
                                method643(i_624_, bool, bool_616_);
                        }
                    }
                }
            }
        } else {
            for (int i_625_ = 0; i_625_ < anInt5351; i_625_++)
                method643(i_625_, bool, bool_616_);
        }
    }

    private final void method651() {
        synchronized (this) {
            for (int i = 0; i < anInt5340; i++) {
                anIntArray5356[i] = -anIntArray5356[i];
                anIntArray5312[i] = -anIntArray5312[i];
            }
            method631();
        }
    }

    final void ia(short i, short i_626_) {
        for (int i_627_ = 0; i_627_ < anInt5351; i_627_++) {
            if (aShortArray5311[i_627_] == i)
                aShortArray5311[i_627_] = i_626_;
        }
        if (aClass6Array5361 != null) {
            for (int i_628_ = 0; i_628_ < anInt5389; i_628_++) {
                Class6 class6 = aClass6Array5361[i_628_];
                Class350 class350 = aClass350Array5363[i_628_];
                class350.anInt4313
                        = (class350.anInt4313 & ~0xffffff
                        | (Class126.anIntArray4983
                        [Class25.method303((aShortArray5311
                                [class6.anInt144]),
                        30) & 0xffff]) & 0xffffff);
            }
        }
        if (anInt5354 == 2)
            anInt5354 = 1;
    }

    private final void method652() {
        synchronized (this) {
            for (int i = 0; i < anInt5387; i++) {
                anIntArray5356[i] = -anIntArray5356[i];
                anIntArray5312[i] = -anIntArray5312[i];
                if (aClass360Array5360[i] != null) {
                    aClass360Array5360[i].anInt4430
                            = -aClass360Array5360[i].anInt4430;
                    aClass360Array5360[i].anInt4427
                            = -aClass360Array5360[i].anInt4427;
                }
            }
            if (aClass41Array5385 != null) {
                for (int i = 0; i < anInt5351; i++) {
                    if (aClass41Array5385[i] != null) {
                        aClass41Array5385[i].anInt561
                                = -aClass41Array5385[i].anInt561;
                        aClass41Array5385[i].anInt559
                                = -aClass41Array5385[i].anInt559;
                    }
                }
            }
            for (int i = anInt5387; i < anInt5340; i++) {
                anIntArray5356[i] = -anIntArray5356[i];
                anIntArray5312[i] = -anIntArray5312[i];
            }
            anInt5354 = 0;
            aBoolean5323 = false;
        }
    }

    private final void method653() {
        synchronized (this) {
            for (int i = 0; i < anInt5387; i++) {
                int i_629_ = anIntArray5356[i];
                anIntArray5356[i] = anIntArray5312[i];
                anIntArray5312[i] = -i_629_;
                if (aClass360Array5360[i] != null) {
                    i_629_ = aClass360Array5360[i].anInt4430;
                    aClass360Array5360[i].anInt4430
                            = aClass360Array5360[i].anInt4427;
                    aClass360Array5360[i].anInt4427 = -i_629_;
                }
            }
            if (aClass41Array5385 != null) {
                for (int i = 0; i < anInt5351; i++) {
                    if (aClass41Array5385[i] != null) {
                        int i_630_ = aClass41Array5385[i].anInt561;
                        aClass41Array5385[i].anInt561
                                = aClass41Array5385[i].anInt559;
                        aClass41Array5385[i].anInt559 = -i_630_;
                    }
                }
            }
            for (int i = anInt5387; i < anInt5340; i++) {
                int i_631_ = anIntArray5356[i];
                anIntArray5356[i] = anIntArray5312[i];
                anIntArray5312[i] = -i_631_;
            }
            anInt5354 = 0;
            aBoolean5323 = false;
        }
    }

    private final void method654
            (Class101 class101, Class318_Sub3 class318_sub3, int i, int i_632_) {
        if (anInt5387 >= 1) {
            aClass101_Sub1_5320 = (Class101_Sub1) class101;
            Class101_Sub1 class101_sub1
                    = aHa_Sub1_5353.aClass101_Sub1_7492;
            if (!aBoolean5323)
                method655();
            boolean bool = false;
            if (aClass101_Sub1_5320.aFloat5672 == 16384.0F
                    && aClass101_Sub1_5320.aFloat5673 == 0.0F
                    && aClass101_Sub1_5320.aFloat5669 == 0.0F
                    && aClass101_Sub1_5320.aFloat5655 == 0.0F
                    && aClass101_Sub1_5320.aFloat5678 == 16384.0F
                    && aClass101_Sub1_5320.aFloat5666 == 0.0F
                    && aClass101_Sub1_5320.aFloat5662 == 0.0F
                    && aClass101_Sub1_5320.aFloat5680 == 0.0F
                    && (aClass101_Sub1_5320.aFloat5664
                    == 16384.0F))
                bool = true;
            float f = (class101_sub1.aFloat5681
                    + (class101_sub1.aFloat5662
                    * aClass101_Sub1_5320.aFloat5686)
                    + (class101_sub1.aFloat5680
                    * aClass101_Sub1_5320.aFloat5685)
                    + (class101_sub1.aFloat5664
                    * aClass101_Sub1_5320.aFloat5681));
            float f_633_
                    = (bool ? class101_sub1.aFloat5680
                    : ((class101_sub1.aFloat5662
                    * aClass101_Sub1_5320.aFloat5673)
                    + (class101_sub1.aFloat5680
                    * aClass101_Sub1_5320.aFloat5678)
                    + (class101_sub1.aFloat5664
                    * aClass101_Sub1_5320.aFloat5680)));
            int i_634_ = (int) (f + (float) aShort5329 * f_633_);
            int i_635_ = (int) (f + (float) aShort5365 * f_633_);
            int i_636_;
            int i_637_;
            if (i_634_ > i_635_) {
                i_636_ = i_635_ - aShort5324;
                i_637_ = i_634_ + aShort5324;
            } else {
                i_636_ = i_634_ - aShort5324;
                i_637_ = i_635_ + aShort5324;
            }
            if (i_636_ < aHa_Sub1_5353.anInt7494
                    && i_637_ > aHa_Sub1_5353.anInt7482) {
                float f_638_
                        = (class101_sub1.aFloat5686
                        + (class101_sub1.aFloat5672
                        * aClass101_Sub1_5320.aFloat5686)
                        + (class101_sub1.aFloat5673
                        * aClass101_Sub1_5320.aFloat5685)
                        + (class101_sub1.aFloat5669
                        * aClass101_Sub1_5320.aFloat5681));
                float f_639_
                        = (bool ? class101_sub1.aFloat5673
                        : ((class101_sub1.aFloat5672
                        * aClass101_Sub1_5320.aFloat5673)
                        + (class101_sub1.aFloat5673
                        * (aClass101_Sub1_5320
                        .aFloat5678))
                        + (class101_sub1.aFloat5669
                        * (aClass101_Sub1_5320
                        .aFloat5680))));
                int i_640_ = (int) (f_638_ + (float) aShort5329 * f_639_);
                int i_641_ = (int) (f_638_ + (float) aShort5365 * f_639_);
                int i_642_;
                int i_643_;
                if (i_640_ > i_641_) {
                    i_642_ = ((i_641_ - aShort5324)
                            * aHa_Sub1_5353.anInt7491);
                    i_643_ = ((i_640_ + aShort5324)
                            * aHa_Sub1_5353.anInt7491);
                } else {
                    i_642_ = ((i_640_ - aShort5324)
                            * aHa_Sub1_5353.anInt7491);
                    i_643_ = ((i_641_ + aShort5324)
                            * aHa_Sub1_5353.anInt7491);
                }
                if (i == -1) {
                    if (i_642_ / i_637_ >= aHa_Sub1_5353.anInt7508
                            || (i_643_ / i_637_
                            <= aHa_Sub1_5353.anInt7509))
                        return;
                } else if (i_642_ / i >= aHa_Sub1_5353.anInt7508
                        || (i_643_ / i
                        <= aHa_Sub1_5353.anInt7509))
                    return;
                float f_644_
                        = (class101_sub1.aFloat5685
                        + (class101_sub1.aFloat5655
                        * aClass101_Sub1_5320.aFloat5686)
                        + (class101_sub1.aFloat5678
                        * aClass101_Sub1_5320.aFloat5685)
                        + (class101_sub1.aFloat5666
                        * aClass101_Sub1_5320.aFloat5681));
                float f_645_
                        = (bool ? class101_sub1.aFloat5678
                        : ((class101_sub1.aFloat5655
                        * aClass101_Sub1_5320.aFloat5673)
                        + (class101_sub1.aFloat5678
                        * (aClass101_Sub1_5320
                        .aFloat5678))
                        + (class101_sub1.aFloat5666
                        * (aClass101_Sub1_5320
                        .aFloat5680))));
                int i_646_ = (int) (f_644_ + (float) aShort5329 * f_645_);
                int i_647_ = (int) (f_644_ + (float) aShort5365 * f_645_);
                int i_648_;
                int i_649_;
                if (i_646_ > i_647_) {
                    i_648_ = ((i_647_ - aShort5324)
                            * aHa_Sub1_5353.anInt7497);
                    i_649_ = ((i_646_ + aShort5324)
                            * aHa_Sub1_5353.anInt7497);
                } else {
                    i_648_ = ((i_646_ - aShort5324)
                            * aHa_Sub1_5353.anInt7497);
                    i_649_ = ((i_647_ + aShort5324)
                            * aHa_Sub1_5353.anInt7497);
                }
                if (i == -1) {
                    if (i_648_ / i_637_ >= aHa_Sub1_5353.anInt7506
                            || (i_649_ / i_637_
                            <= aHa_Sub1_5353.anInt7490))
                        return;
                } else if (i_648_ / i >= aHa_Sub1_5353.anInt7506
                        || (i_649_ / i
                        <= aHa_Sub1_5353.anInt7490))
                    return;
                float f_650_;
                float f_651_;
                float f_652_;
                float f_653_;
                float f_654_;
                float f_655_;
                if (bool) {
                    f_650_ = class101_sub1.aFloat5672;
                    f_651_ = class101_sub1.aFloat5655;
                    f_652_ = class101_sub1.aFloat5662;
                    f_653_ = class101_sub1.aFloat5669;
                    f_654_ = class101_sub1.aFloat5666;
                    f_655_ = class101_sub1.aFloat5664;
                } else {
                    f_650_
                            = ((class101_sub1.aFloat5672
                            * aClass101_Sub1_5320.aFloat5672)
                            + (class101_sub1.aFloat5673
                            * (aClass101_Sub1_5320
                            .aFloat5655))
                            + (class101_sub1.aFloat5669
                            * (aClass101_Sub1_5320
                            .aFloat5662)));
                    f_651_
                            = ((class101_sub1.aFloat5655
                            * aClass101_Sub1_5320.aFloat5672)
                            + (class101_sub1.aFloat5678
                            * (aClass101_Sub1_5320
                            .aFloat5655))
                            + (class101_sub1.aFloat5666
                            * (aClass101_Sub1_5320
                            .aFloat5662)));
                    f_652_
                            = ((class101_sub1.aFloat5662
                            * aClass101_Sub1_5320.aFloat5672)
                            + (class101_sub1.aFloat5680
                            * (aClass101_Sub1_5320
                            .aFloat5655))
                            + (class101_sub1.aFloat5664
                            * (aClass101_Sub1_5320
                            .aFloat5662)));
                    f_653_
                            = ((class101_sub1.aFloat5672
                            * aClass101_Sub1_5320.aFloat5669)
                            + (class101_sub1.aFloat5673
                            * (aClass101_Sub1_5320
                            .aFloat5666))
                            + (class101_sub1.aFloat5669
                            * (aClass101_Sub1_5320
                            .aFloat5664)));
                    f_654_
                            = ((class101_sub1.aFloat5655
                            * aClass101_Sub1_5320.aFloat5669)
                            + (class101_sub1.aFloat5678
                            * (aClass101_Sub1_5320
                            .aFloat5666))
                            + (class101_sub1.aFloat5666
                            * (aClass101_Sub1_5320
                            .aFloat5664)));
                    f_655_
                            = ((class101_sub1.aFloat5662
                            * aClass101_Sub1_5320.aFloat5669)
                            + (class101_sub1.aFloat5680
                            * (aClass101_Sub1_5320
                            .aFloat5666))
                            + (class101_sub1.aFloat5664
                            * (aClass101_Sub1_5320
                            .aFloat5664)));
                }
                if (aHa_Sub1_5353.anInt7485 > 1) {
                    synchronized (this) {
                        while (aBoolean5357) {
                            try {
                                this.wait();
                            } catch (InterruptedException interruptedexception) {
                                /* empty */
                            }
                        }
                        aBoolean5357 = true;
                    }
                }
                method632(Thread.currentThread());
				aClass109_5383.method1023((i_632_ & 0x2) != 0);
                boolean bool_656_ = false;
                boolean bool_657_
                        = i_636_ <= aHa_Sub1_5353.anInt7482;
                boolean bool_658_ = (bool_657_ || aClass129Array5322 != null
                        || aClass342Array5335 != null);
                aClass167_5367.anInt2221
                        = aClass109_5383.anInt1679;
                aClass167_5367.anInt2229
                        = aClass109_5383.anInt1665;
                aClass167_5367.anInt2215
                        = aClass109_5383.anInt1668;
                int i_659_ = aHa_Sub1_5353.anInt7491;
                int i_660_ = aHa_Sub1_5353.anInt7497;
                int i_661_ = aHa_Sub1_5353.anInt7482;
                if (i == -1) {
                    for (int i_662_ = 0; i_662_ < anInt5340; i_662_++) {
                        int i_663_ = anIntArray5356[i_662_];
                        int i_664_ = anIntArray5332[i_662_];
                        int i_665_ = anIntArray5312[i_662_];
                        float f_666_ = (f_638_ + f_650_ * (float) i_663_
                                + f_639_ * (float) i_664_
                                + f_653_ * (float) i_665_);
                        float f_667_ = (f_644_ + f_651_ * (float) i_663_
                                + f_645_ * (float) i_664_
                                + f_654_ * (float) i_665_);
                        float f_668_ = (f + f_652_ * (float) i_663_
                                + f_633_ * (float) i_664_
                                + f_655_ * (float) i_665_);
                        anIntArray5355[i_662_] = (int) f_668_;
                        if (f_668_ >= (float) i_661_) {
                            anIntArray5321[i_662_]
                                    = (aClass167_5367.anInt2229
                                    + (int) (f_666_ * (float) i_659_ / f_668_));
                            anIntArray5343[i_662_]
                                    = (aClass167_5367.anInt2215
                                    + (int) (f_667_ * (float) i_660_ / f_668_));
                        } else {
                            anIntArray5321[i_662_] = -5000;
                            bool_656_ = true;
                        }
                        if (bool_658_) {
                            anIntArray5399[i_662_] = (int) f_666_;
                            anIntArray5384[i_662_] = (int) f_667_;
                            anIntArray5392[i_662_] = (int) f_668_;
                        }
                        if (aClass167_5367.aBoolean2195)
                            anIntArray5362[i_662_]
                                    = (int) ((aClass101_Sub1_5320
                                    .aFloat5685)
                                    + ((aClass101_Sub1_5320.aFloat5655
                                    * (float) i_663_)
                                    + (aClass101_Sub1_5320.aFloat5678
                                    * (float) i_664_)
                                    + (aClass101_Sub1_5320.aFloat5666
                                    * (float) i_665_)));
                    }
                    if (aClass6Array5361 != null) {
                        for (int i_669_ = 0; i_669_ < anInt5389; i_669_++) {
                            Class6 class6 = aClass6Array5361[i_669_];
                            Class350 class350 = aClass350Array5363[i_669_];
                            short i_670_
                                    = aShortArray5317[class6.anInt144];
                            short i_671_
                                    = aShortArray5394[class6.anInt144];
                            short i_672_
                                    = aShortArray5364[class6.anInt144];
                            int i_673_ = ((anIntArray5356[i_670_]
                                    + anIntArray5356[i_671_]
                                    + anIntArray5356[i_672_])
                                    / 3);
                            int i_674_ = ((anIntArray5332[i_670_]
                                    + anIntArray5332[i_671_]
                                    + anIntArray5332[i_672_])
                                    / 3);
                            int i_675_ = ((anIntArray5312[i_670_]
                                    + anIntArray5312[i_671_]
                                    + anIntArray5312[i_672_])
                                    / 3);
                            float f_676_
                                    = ((float) class350.anInt4316
                                    + (f_638_ + f_650_ * (float) i_673_
                                    + f_639_ * (float) i_674_
                                    + f_653_ * (float) i_675_));
                            float f_677_
                                    = ((float) class350.anInt4317
                                    + (f_644_ + f_651_ * (float) i_673_
                                    + f_645_ * (float) i_674_
                                    + f_654_ * (float) i_675_));
                            float f_678_ = (f + f_652_ * (float) i_673_
                                    + f_633_ * (float) i_674_
                                    + f_655_ * (float) i_675_);
                            if (f_678_ > (float) (aHa_Sub1_5353
                                    .anInt7482)) {
                                class350.anInt4312
                                        = (aHa_Sub1_5353.anInt7510
                                        + (int) (f_676_ * (float) i_659_
                                        / f_678_));
                                class350.anInt4310
                                        = (aHa_Sub1_5353.anInt7504
                                        + (int) (f_677_ * (float) i_660_
                                        / f_678_));
                                class350.anInt4320
                                        = ((int) f_678_
                                        - class6.anInt154);
                                class350.anInt4309
                                        = (int) ((float) ((class350
                                        .anInt4314)
                                        * (class6
                                        .aShort150)
                                        * i_659_)
                                        / (f_678_ * 128.0F));
                                class350.anInt4307
                                        = (int) ((float) ((class350
                                        .anInt4311)
                                        * (class6
                                        .aShort143)
                                        * i_660_)
                                        / (f_678_ * 128.0F));
                            } else
                                class350.anInt4309
                                        = class350.anInt4307 = 0;
                        }
                    }
                } else {
                    for (int i_679_ = 0; i_679_ < anInt5340; i_679_++) {
                        int i_680_ = anIntArray5356[i_679_];
                        int i_681_ = anIntArray5332[i_679_];
                        int i_682_ = anIntArray5312[i_679_];
                        float f_683_ = (f_638_ + f_650_ * (float) i_680_
                                + f_639_ * (float) i_681_
                                + f_653_ * (float) i_682_);
                        float f_684_ = (f_644_ + f_651_ * (float) i_680_
                                + f_645_ * (float) i_681_
                                + f_654_ * (float) i_682_);
                        float f_685_ = (f + f_652_ * (float) i_680_
                                + f_633_ * (float) i_681_
                                + f_655_ * (float) i_682_);
                        anIntArray5355[i_679_] = (int) f_685_;
                        anIntArray5321[i_679_]
                                = (aClass167_5367.anInt2229
                                + (int) (f_683_ * (float) i_659_ / (float) i));
                        anIntArray5343[i_679_]
                                = (aClass167_5367.anInt2215
                                + (int) (f_684_ * (float) i_660_ / (float) i));
                        if (bool_658_) {
                            anIntArray5399[i_679_] = (int) f_683_;
                            anIntArray5384[i_679_] = (int) f_684_;
                            anIntArray5392[i_679_] = i;
                        }
                        if (aClass167_5367.aBoolean2195)
                            anIntArray5362[i_679_]
                                    = (int) ((aClass101_Sub1_5320
                                    .aFloat5685)
                                    + ((aClass101_Sub1_5320.aFloat5655
                                    * (float) i_680_)
                                    + (aClass101_Sub1_5320.aFloat5678
                                    * (float) i_681_)
                                    + (aClass101_Sub1_5320.aFloat5666
                                    * (float) i_682_)));
                    }
                    if (aClass6Array5361 != null) {
                        for (int i_686_ = 0; i_686_ < anInt5389; i_686_++) {
                            Class6 class6 = aClass6Array5361[i_686_];
                            Class350 class350 = aClass350Array5363[i_686_];
                            short i_687_
                                    = aShortArray5317[class6.anInt144];
                            short i_688_
                                    = aShortArray5394[class6.anInt144];
                            short i_689_
                                    = aShortArray5364[class6.anInt144];
                            int i_690_ = ((anIntArray5356[i_687_]
                                    + anIntArray5356[i_688_]
                                    + anIntArray5356[i_689_])
                                    / 3);
                            int i_691_ = ((anIntArray5332[i_687_]
                                    + anIntArray5332[i_688_]
                                    + anIntArray5332[i_689_])
                                    / 3);
                            int i_692_ = ((anIntArray5312[i_687_]
                                    + anIntArray5312[i_688_]
                                    + anIntArray5312[i_689_])
                                    / 3);
                            float f_693_ = (f_638_ + f_650_ * (float) i_690_
                                    + f_639_ * (float) i_691_
                                    + f_653_ * (float) i_692_);
                            float f_694_ = (f_644_ + f_651_ * (float) i_690_
                                    + f_645_ * (float) i_691_
                                    + f_654_ * (float) i_692_);
                            float f_695_ = (f + f_652_ * (float) i_690_
                                    + f_633_ * (float) i_691_
                                    + f_655_ * (float) i_692_);
                            class350.anInt4312
                                    = (aHa_Sub1_5353.anInt7510
                                    + (int) (f_693_ * (float) i_659_
                                    / (float) i));
                            class350.anInt4310
                                    = (aHa_Sub1_5353.anInt7504
                                    + (int) (f_694_ * (float) i_660_
                                    / (float) i));
                            class350.anInt4320
                                    = i - class6.anInt154;
                            class350.anInt4309
                                    = (class350.anInt4314
                                    * class6.aShort150 * i_659_
                                    / (i << 7));
                            class350.anInt4307
                                    = (class350.anInt4311
                                    * class6.aShort143 * i_660_
                                    / (i << 7));
                        }
                    }
                }
                if (class318_sub3 != null) {
                    boolean bool_696_ = false;
                    boolean bool_697_ = true;
                    int i_698_ = aShort5395 + aShort5393 >> 1;
                    int i_699_ = aShort5352 + aShort5331 >> 1;
                    int i_700_ = i_698_;
                    short i_701_ = aShort5329;
                    int i_702_ = i_699_;
                    float f_703_ = (f_638_ + f_650_ * (float) i_700_
                            + f_639_ * (float) i_701_
                            + f_653_ * (float) i_702_);
                    float f_704_ = (f_644_ + f_651_ * (float) i_700_
                            + f_645_ * (float) i_701_
                            + f_654_ * (float) i_702_);
                    float f_705_ = (f + f_652_ * (float) i_700_
                            + f_633_ * (float) i_701_
                            + f_655_ * (float) i_702_);
                    if (f_705_ >= (float) i_661_) {
                        int i_706_ = (int) f_705_;
                        if (i != -1)
                            i_706_ = i;
                        class318_sub3.anInt6405
                                = (aHa_Sub1_5353.anInt7510
                                + (int) (f_703_ * (float) i_659_
                                / (float) i_706_));
                        class318_sub3.anInt6402
                                = (aHa_Sub1_5353.anInt7504
                                + (int) (f_704_ * (float) i_660_
                                / (float) i_706_));
                    } else
                        bool_696_ = true;
                    i_700_ = i_698_;
                    i_701_ = aShort5365;
                    i_702_ = i_699_;
                    float f_707_ = (f_638_ + f_650_ * (float) i_700_
                            + f_639_ * (float) i_701_
                            + f_653_ * (float) i_702_);
                    float f_708_ = (f_644_ + f_651_ * (float) i_700_
                            + f_645_ * (float) i_701_
                            + f_654_ * (float) i_702_);
                    float f_709_ = (f + f_652_ * (float) i_700_
                            + f_633_ * (float) i_701_
                            + f_655_ * (float) i_702_);
                    if (f_709_ >= (float) i_661_) {
                        int i_710_ = (int) f_709_;
                        if (i != -1)
                            i_710_ = i;
                        class318_sub3.anInt6406
                                = (aHa_Sub1_5353.anInt7510
                                + (int) (f_707_ * (float) i_659_
                                / (float) i_710_));
                        class318_sub3.anInt6404
                                = (aHa_Sub1_5353.anInt7504
                                + (int) (f_708_ * (float) i_660_
                                / (float) i_710_));
                    } else
                        bool_696_ = true;
                    if (bool_696_) {
                        if (f_705_ < (float) i_661_ && f_709_ < (float) i_661_)
                            bool_697_ = false;
                        else if (f_705_ < (float) i_661_) {
                            float f_711_
                                    = ((f_709_ - (float) (aHa_Sub1_5353
                                    .anInt7482))
                                    / (f_709_ - f_705_));
                            int i_712_
                                    = (int) (f_707_ + (f_707_ - f_703_) * f_711_);
                            int i_713_
                                    = (int) (f_708_ + (f_708_ - f_704_) * f_711_);
                            int i_714_ = i_661_;
                            if (i != -1)
                                i_714_ = i;
                            class318_sub3.anInt6405
                                    = (aHa_Sub1_5353.anInt7510
                                    + i_712_ * i_659_ / i_714_);
                            class318_sub3.anInt6402
                                    = (aHa_Sub1_5353.anInt7504
                                    + i_713_ * i_660_ / i_714_);
                        } else if (f_709_ < (float) i_661_) {
                            float f_715_ = ((f_705_ - (float) i_661_)
                                    / (f_705_ - f_709_));
                            int i_716_
                                    = (int) (f_703_ + (f_703_ - f_707_) * f_715_);
                            int i_717_
                                    = (int) (f_704_ + (f_704_ - f_708_) * f_715_);
                            int i_718_ = i_661_;
                            if (i != -1)
                                i_718_ = i;
                            class318_sub3.anInt6405
                                    = (aHa_Sub1_5353.anInt7510
                                    + i_716_ * i_659_ / i_718_);
                            class318_sub3.anInt6402
                                    = (aHa_Sub1_5353.anInt7504
                                    + i_717_ * i_660_ / i_718_);
                        }
                    }
                    if (bool_697_) {
                        if (f_705_ > f_709_) {
                            int i_719_ = (int) f_705_;
                            if (i != -1)
                                i_719_ = i;
                            class318_sub3.anInt6403
                                    = (aHa_Sub1_5353.anInt7510
                                    + (int) ((f_703_ + (float) aShort5324)
                                    * (float) i_659_ / (float) i_719_)
                                    - (class318_sub3
                                    .anInt6405));
                        } else {
                            int i_720_ = (int) f_709_;
                            if (i != -1)
                                i_720_ = i;
                            class318_sub3.anInt6403
                                    = (aHa_Sub1_5353.anInt7510
                                    + (int) ((f_707_ + (float) aShort5324)
                                    * (float) i_659_ / (float) i_720_)
                                    - (class318_sub3
                                    .anInt6406));
                        }
                        class318_sub3.aBoolean6401 = true;
                    }
                }
                method634(true);
                aClass109_5383.aBoolean1669 = (i_632_ & 0x1) == 0;
                aClass109_5383.aBoolean1667 = false;
                try {
                    method650(bool_656_,
                            ((aClass167_5367.aBoolean2201
                                    && (i_637_
                                    > aClass167_5367.anInt2210))
                                    || aClass167_5367.aBoolean2195),
                            i_636_, i_637_ - i_636_);
                } catch (Exception exception) {
                    /* empty */
                }
                if (aClass6Array5361 != null) {
                    for (int i_721_ = 0; i_721_ < anInt5351; i_721_++)
                        anIntArray5400[i_721_] = -1;
                }
                aClass109_5383 = null;
                if (aHa_Sub1_5353.anInt7485 > 1) {
                    synchronized (this) {
                        aBoolean5357 = false;
                        this.notifyAll();
                    }
                }
            }
        }
    }

    final boolean r() {
        return aBoolean5391;
    }

    private final void method655() {
        if (!aBoolean5323) {
            int i = 0;
            int i_722_ = 0;
            int i_723_ = 32767;
            int i_724_ = 32767;
            int i_725_ = 32767;
            int i_726_ = -32768;
            int i_727_ = -32768;
            int i_728_ = -32768;
            for (int i_729_ = 0; i_729_ < anInt5387; i_729_++) {
                int i_730_ = anIntArray5356[i_729_];
                int i_731_ = anIntArray5332[i_729_];
                int i_732_ = anIntArray5312[i_729_];
                if (i_730_ < i_723_)
                    i_723_ = i_730_;
                if (i_730_ > i_726_)
                    i_726_ = i_730_;
                if (i_731_ < i_724_)
                    i_724_ = i_731_;
                if (i_731_ > i_727_)
                    i_727_ = i_731_;
                if (i_732_ < i_725_)
                    i_725_ = i_732_;
                if (i_732_ > i_728_)
                    i_728_ = i_732_;
                int i_733_ = i_730_ * i_730_ + i_732_ * i_732_;
                if (i_733_ > i)
                    i = i_733_;
                i_733_ += i_731_ * i_731_;
                if (i_733_ > i_722_)
                    i_722_ = i_733_;
            }
            aShort5395 = (short) i_723_;
            aShort5393 = (short) i_726_;
            aShort5329 = (short) i_724_;
            aShort5365 = (short) i_727_;
            aShort5352 = (short) i_725_;
            aShort5331 = (short) i_728_;
            aShort5324 = (short) (int) (Math.sqrt(i) + 0.99);
            aShort5348 = (short) (int) (Math.sqrt(i_722_) + 0.99);
            aBoolean5323 = true;
        }
    }

    private final int method656(int i) {
        if (i < 2)
            i = 2;
        else if (i > 126)
            i = 126;
        return i;
    }

    private final void method657(boolean bool) {
        if (anInt5354 == 1)
            method647();
        else if (anInt5354 == 2) {
            if ((anInt5316 & 0x97098) == 0 && aFloatArrayArray5314 == null)
                aShortArray5311 = null;
            if (bool)
                aByteArray5386 = null;
        } else {
            method636();
            int i = aHa_Sub1_5353.anInt7484;
            int i_734_ = aHa_Sub1_5353.anInt7473;
            int i_735_ = aHa_Sub1_5353.anInt7479;
            int i_736_ = aHa_Sub1_5353.anInt7500 >> 8;
            int i_737_ = aHa_Sub1_5353.anInt7474 * 768 / anInt5349;
            int i_738_ = aHa_Sub1_5353.anInt7478 * 768 / anInt5349;
            if (anIntArray5368 == null) {
                anIntArray5368 = new int[anInt5351];
                anIntArray5337 = new int[anInt5351];
                anIntArray5366 = new int[anInt5351];
            }
            for (int i_739_ = 0; i_739_ < anInt5351; i_739_++) {
                byte i_740_;
                if (aByteArray5386 == null)
                    i_740_ = (byte) 0;
                else
                    i_740_ = aByteArray5386[i_739_];
                byte i_741_;
                if (aByteArray5325 == null)
                    i_741_ = (byte) 0;
                else
                    i_741_ = aByteArray5325[i_739_];
                short i_742_;
                if (aShortArray5388 == null)
                    i_742_ = (short) -1;
                else
                    i_742_ = aShortArray5388[i_739_];
                if (i_741_ == -2)
                    i_740_ = (byte) 3;
                if (i_741_ == -1)
                    i_740_ = (byte) 2;
                if (i_742_ == -1) {
                    if (i_740_ == 0) {
                        int i_743_ = aShortArray5311[i_739_] & 0xffff;
                        int i_744_ = (i_743_ & 0x7f) * anInt5344 >> 7;
                        short i_745_
                                = Class25.method303(i_743_ & ~0x7f | i_744_, 30);
                        Class360 class360;
                        if (aClass360Array5313 != null
                                && (aClass360Array5313[aShortArray5317[i_739_]]
                                != null))
                            class360
                                    = aClass360Array5313[aShortArray5317[i_739_]];
                        else
                            class360
                                    = aClass360Array5360[aShortArray5317[i_739_]];
                        int i_746_
                                = (((i * class360.anInt4430
                                + i_734_ * class360.anInt4428
                                + i_735_ * class360.anInt4427)
                                / class360.anInt4429)
                                >> 16);
                        int i_747_ = i_746_ > 256 ? i_737_ : i_738_;
                        int i_748_ = (i_736_ >> 1) + (i_747_ * i_746_ >> 17);
                        anIntArray5368[i_739_]
                                = i_748_ << 17 | Class291.method2198(0, i_748_,
                                i_745_);
                        if (aClass360Array5313 != null
                                && (aClass360Array5313[aShortArray5394[i_739_]]
                                != null))
                            class360
                                    = aClass360Array5313[aShortArray5394[i_739_]];
                        else
                            class360
                                    = aClass360Array5360[aShortArray5394[i_739_]];
                        i_746_ = ((i * class360.anInt4430
                                + i_734_ * class360.anInt4428
                                + i_735_ * class360.anInt4427)
                                / class360.anInt4429) >> 16;
                        i_747_ = i_746_ > 256 ? i_737_ : i_738_;
                        i_748_ = (i_736_ >> 1) + (i_747_ * i_746_ >> 17);
                        anIntArray5337[i_739_]
                                = i_748_ << 17 | Class291.method2198(0, i_748_,
                                i_745_);
                        if (aClass360Array5313 != null
                                && (aClass360Array5313[aShortArray5364[i_739_]]
                                != null))
                            class360
                                    = aClass360Array5313[aShortArray5364[i_739_]];
                        else
                            class360
                                    = aClass360Array5360[aShortArray5364[i_739_]];
                        i_746_ = ((i * class360.anInt4430
                                + i_734_ * class360.anInt4428
                                + i_735_ * class360.anInt4427)
                                / class360.anInt4429) >> 16;
                        i_747_ = i_746_ > 256 ? i_737_ : i_738_;
                        i_748_ = (i_736_ >> 1) + (i_747_ * i_746_ >> 17);
                        anIntArray5366[i_739_]
                                = i_748_ << 17 | Class291.method2198(0, i_748_,
                                i_745_);
                    } else if (i_740_ == 1) {
                        int i_749_ = aShortArray5311[i_739_] & 0xffff;
                        int i_750_ = (i_749_ & 0x7f) * anInt5344 >> 7;
                        short i_751_
                                = Class25.method303(i_749_ & ~0x7f | i_750_, 30);
                        Class41 class41 = aClass41Array5385[i_739_];
                        int i_752_ = ((i * class41.anInt561
                                + i_734_ * class41.anInt560
                                + i_735_ * class41.anInt559)
                                >> 16);
                        int i_753_ = i_752_ > 256 ? i_737_ : i_738_;
                        int i_754_ = (i_736_ >> 1) + (i_753_ * i_752_ >> 17);
                        anIntArray5368[i_739_]
                                = i_754_ << 17 | Class291.method2198(0, i_754_,
                                i_751_);
                        anIntArray5366[i_739_] = -1;
                    } else if (i_740_ == 3) {
                        anIntArray5368[i_739_] = 128;
                        anIntArray5366[i_739_] = -1;
                    } else
                        anIntArray5366[i_739_] = -2;
                } else {
                    int i_755_ = aShortArray5311[i_739_] & 0xffff;
                    if (i_740_ == 0) {
                        Class360 class360;
                        if (aClass360Array5313 != null
                                && (aClass360Array5313[aShortArray5317[i_739_]]
                                != null))
                            class360
                                    = aClass360Array5313[aShortArray5317[i_739_]];
                        else
                            class360
                                    = aClass360Array5360[aShortArray5317[i_739_]];
                        int i_756_
                                = (((i * class360.anInt4430
                                + i_734_ * class360.anInt4428
                                + i_735_ * class360.anInt4427)
                                / class360.anInt4429)
                                >> 16);
                        int i_757_ = i_756_ > 256 ? i_737_ : i_738_;
                        int i_758_ = method656((i_736_ >> 2) + (i_757_ * i_756_
                                >> 18));
                        anIntArray5368[i_739_]
                                = i_758_ << 24 | method642(i_755_, i_742_, i_758_);
                        if (aClass360Array5313 != null
                                && (aClass360Array5313[aShortArray5394[i_739_]]
                                != null))
                            class360
                                    = aClass360Array5313[aShortArray5394[i_739_]];
                        else
                            class360
                                    = aClass360Array5360[aShortArray5394[i_739_]];
                        i_756_ = ((i * class360.anInt4430
                                + i_734_ * class360.anInt4428
                                + i_735_ * class360.anInt4427)
                                / class360.anInt4429) >> 16;
                        i_757_ = i_756_ > 256 ? i_737_ : i_738_;
                        i_758_ = method656((i_736_ >> 2) + (i_757_ * i_756_
                                >> 18));
                        anIntArray5337[i_739_]
                                = i_758_ << 24 | method642(i_755_, i_742_, i_758_);
                        if (aClass360Array5313 != null
                                && (aClass360Array5313[aShortArray5364[i_739_]]
                                != null))
                            class360
                                    = aClass360Array5313[aShortArray5364[i_739_]];
                        else
                            class360
                                    = aClass360Array5360[aShortArray5364[i_739_]];
                        i_756_ = ((i * class360.anInt4430
                                + i_734_ * class360.anInt4428
                                + i_735_ * class360.anInt4427)
                                / class360.anInt4429) >> 16;
                        i_757_ = i_756_ > 256 ? i_737_ : i_738_;
                        i_758_ = method656((i_736_ >> 2) + (i_757_ * i_756_
                                >> 18));
                        anIntArray5366[i_739_]
                                = i_758_ << 24 | method642(i_755_, i_742_, i_758_);
                    } else if (i_740_ == 1) {
                        Class41 class41 = aClass41Array5385[i_739_];
                        int i_759_ = ((i * class41.anInt561
                                + i_734_ * class41.anInt560
                                + i_735_ * class41.anInt559)
                                >> 16);
                        int i_760_ = i_759_ > 256 ? i_737_ : i_738_;
                        int i_761_ = method656((i_736_ >> 2) + (i_760_ * i_759_
                                >> 18));
                        anIntArray5368[i_739_]
                                = i_761_ << 24 | method642(i_755_, i_742_, i_761_);
                        anIntArray5366[i_739_] = -1;
                    } else
                        anIntArray5366[i_739_] = -2;
                }
            }
            aClass360Array5360 = null;
            aClass360Array5313 = null;
            aClass41Array5385 = null;
            if ((anInt5316 & 0x97098) == 0 && aFloatArrayArray5314 == null)
                aShortArray5311 = null;
            if (bool)
                aByteArray5386 = null;
            anInt5354 = 2;
        }
    }

    final Class64 method614(byte i, int i_762_, boolean bool) {
        method648(Thread.currentThread());
        Class64_Sub1 class64_sub1_763_;
        Class64_Sub1 class64_sub1_764_;
        if (i == 1) {
            class64_sub1_763_ = aClass64_Sub1_5374;
            class64_sub1_764_ = aClass64_Sub1_5378;
        } else if (i == 2) {
            class64_sub1_763_ = aClass64_Sub1_5328;
            class64_sub1_764_ = aClass64_Sub1_5339;
        } else if (i == 3) {
            class64_sub1_763_ = aClass64_Sub1_5376;
            class64_sub1_764_ = aClass64_Sub1_5396;
        } else if (i == 4) {
            class64_sub1_763_ = aClass64_Sub1_5397;
            class64_sub1_764_ = aClass64_Sub1_5347;
        } else if (i == 5) {
            class64_sub1_763_ = aClass64_Sub1_5319;
            class64_sub1_764_ = aClass64_Sub1_5390;
        } else
            class64_sub1_764_ = class64_sub1_763_
                    = new Class64_Sub1(aHa_Sub1_5353);
        return method633(class64_sub1_764_, class64_sub1_763_, i_762_, i != 0,
                bool);
    }

    final void O(int i, int i_765_, int i_766_) {
        if (i != 128 && (anInt5316 & 0x1) != 1)
            throw new IllegalStateException();
        if (i_765_ != 128 && (anInt5316 & 0x2) != 2)
            throw new IllegalStateException();
        if (i_766_ != 128 && (anInt5316 & 0x4) != 4)
            throw new IllegalStateException();
        synchronized (this) {
            for (int i_767_ = 0; i_767_ < anInt5340; i_767_++) {
                anIntArray5356[i_767_] = anIntArray5356[i_767_] * i >> 7;
                anIntArray5332[i_767_] = anIntArray5332[i_767_] * i_765_ >> 7;
                anIntArray5312[i_767_] = anIntArray5312[i_767_] * i_766_ >> 7;
            }
            aBoolean5323 = false;
        }
    }

    final int ua() {
        return anInt5316;
    }

    private final void method658(int i) {
        if (!aClass167_5367.aBoolean2195) {
            short i_768_ = aShortArray5317[i];
            short i_769_ = aShortArray5394[i];
            short i_770_ = aShortArray5364[i];
            int i_771_ = (anIntArray5355[i_768_]
                    - aClass167_5367.anInt2210);
            if (i_771_ > 255)
                i_771_ = 255;
            else if (i_771_ < 0)
                i_771_ = 0;
            int i_772_ = (anIntArray5355[i_769_]
                    - aClass167_5367.anInt2210);
            if (i_772_ > 255)
                i_772_ = 255;
            else if (i_772_ < 0)
                i_772_ = 0;
            int i_773_ = (anIntArray5355[i_770_]
                    - aClass167_5367.anInt2210);
            if (i_773_ > 255)
                i_773_ = 255;
            else if (i_773_ < 0)
                i_773_ = 0;
            int i_774_ = i_771_ + i_772_ + i_773_;
            if (i_774_ != 765) {
                if (i_774_ == 0)
                    method635(i);
                else {
                    if (aByteArray5325 == null)
                        aClass109_5383.anInt1674 = 0;
                    else
                        aClass109_5383.anInt1674
                                = aByteArray5325[i] & 0xff;
                    if (aShortArray5388 == null || aShortArray5388[i] == -1) {
                        if (anIntArray5366[i] == -1)
                            aClass109_5383.method1027
                                    ((float) anIntArray5343[i_768_],
                                            (float) anIntArray5343[i_769_],
                                            (float) anIntArray5343[i_770_],
                                            (float) anIntArray5321[i_768_],
                                            (float) anIntArray5321[i_769_],
                                            (float) anIntArray5321[i_770_],
                                            (float) anIntArray5355[i_768_],
                                            (float) anIntArray5355[i_769_],
                                            (float) anIntArray5355[i_770_],
                                            Class6.method206((Class126.anIntArray4983
                                                            [(anIntArray5368[i]
                                                            & 0xffff)]),
                                                    (i_771_ << 24
                                                            | (aClass167_5367
                                                            .anInt2192)),
                                                    255),
                                            Class6.method206((Class126.anIntArray4983
                                                            [(anIntArray5368[i]
                                                            & 0xffff)]),
                                                    (i_772_ << 24
                                                            | (aClass167_5367
                                                            .anInt2192)),
                                                    255),
                                            Class6.method206((Class126.anIntArray4983
                                                            [(anIntArray5368[i]
                                                            & 0xffff)]),
                                                    (i_773_ << 24
                                                            | (aClass167_5367
                                                            .anInt2192)),
                                                    255));
                        else
                            aClass109_5383.method1027
                                    ((float) anIntArray5343[i_768_],
                                            (float) anIntArray5343[i_769_],
                                            (float) anIntArray5343[i_770_],
                                            (float) anIntArray5321[i_768_],
                                            (float) anIntArray5321[i_769_],
                                            (float) anIntArray5321[i_770_],
                                            (float) anIntArray5355[i_768_],
                                            (float) anIntArray5355[i_769_],
                                            (float) anIntArray5355[i_770_],
                                            Class6.method206((Class126.anIntArray4983
                                                            [(anIntArray5368[i]
                                                            & 0xffff)]),
                                                    (i_771_ << 24
                                                            | (aClass167_5367
                                                            .anInt2192)),
                                                    255),
                                            Class6.method206((Class126.anIntArray4983
                                                            [(anIntArray5337[i]
                                                            & 0xffff)]),
                                                    (i_772_ << 24
                                                            | (aClass167_5367
                                                            .anInt2192)),
                                                    255),
                                            Class6.method206((Class126.anIntArray4983
                                                            [(anIntArray5366[i]
                                                            & 0xffff)]),
                                                    (i_773_ << 24
                                                            | (aClass167_5367
                                                            .anInt2192)),
                                                    255));
                    } else {
                        int i_775_ = -16777216;
                        if (aByteArray5325 != null)
                            i_775_ = 255 - (aByteArray5325[i] & 0xff) << 24;
                        if (anIntArray5366[i] == -1) {
                            int i_776_ = i_775_ | anIntArray5368[i] & 0xffffff;
                            aClass109_5383.method1024
                                    ((float) anIntArray5343[i_768_],
                                            (float) anIntArray5343[i_769_],
                                            (float) anIntArray5343[i_770_],
                                            (float) anIntArray5321[i_768_],
                                            (float) anIntArray5321[i_769_],
                                            (float) anIntArray5321[i_770_],
                                            (float) anIntArray5355[i_768_],
                                            (float) anIntArray5355[i_769_],
                                            (float) anIntArray5355[i_770_],
                                            aFloatArrayArray5314[i][0],
                                            aFloatArrayArray5314[i][1],
                                            aFloatArrayArray5314[i][2],
                                            aFloatArrayArray5345[i][0],
                                            aFloatArrayArray5345[i][1],
                                            aFloatArrayArray5345[i][2], i_776_, i_776_,
                                            i_776_, aClass167_5367.anInt2192,
                                            i_771_, i_772_, i_773_, aShortArray5388[i]);
                        } else
                            aClass109_5383.method1024
                                    ((float) anIntArray5343[i_768_],
                                            (float) anIntArray5343[i_769_],
                                            (float) anIntArray5343[i_770_],
                                            (float) anIntArray5321[i_768_],
                                            (float) anIntArray5321[i_769_],
                                            (float) anIntArray5321[i_770_],
                                            (float) anIntArray5355[i_768_],
                                            (float) anIntArray5355[i_769_],
                                            (float) anIntArray5355[i_770_],
                                            aFloatArrayArray5314[i][0],
                                            aFloatArrayArray5314[i][1],
                                            aFloatArrayArray5314[i][2],
                                            aFloatArrayArray5345[i][0],
                                            aFloatArrayArray5345[i][1],
                                            aFloatArrayArray5345[i][2],
                                            i_775_ | anIntArray5368[i] & 0xffffff,
                                            i_775_ | anIntArray5337[i] & 0xffffff,
                                            i_775_ | anIntArray5366[i] & 0xffffff,
                                            aClass167_5367.anInt2192, i_771_,
                                            i_772_, i_773_, aShortArray5388[i]);
                    }
                }
            }
        } else {
            short i_777_ = aShortArray5317[i];
            short i_778_ = aShortArray5394[i];
            short i_779_ = aShortArray5364[i];
            int i_780_ = 0;
            int i_781_ = 0;
            int i_782_ = 0;
            if (anIntArray5362[i_777_] > aClass167_5367.anInt2197)
                i_780_ = 255;
            else if (anIntArray5362[i_777_]
                    > aClass167_5367.anInt2211)
                i_780_ = ((aClass167_5367.anInt2211
                        - anIntArray5362[i_777_])
                        * 255
                        / (aClass167_5367.anInt2211
                        - aClass167_5367.anInt2197));
            if (anIntArray5362[i_778_] > aClass167_5367.anInt2197)
                i_781_ = 255;
            else if (anIntArray5362[i_778_]
                    > aClass167_5367.anInt2211)
                i_781_ = ((aClass167_5367.anInt2211
                        - anIntArray5362[i_778_])
                        * 255
                        / (aClass167_5367.anInt2211
                        - aClass167_5367.anInt2197));
            if (anIntArray5362[i_779_] > aClass167_5367.anInt2197)
                i_782_ = 255;
            else if (anIntArray5362[i_779_]
                    > aClass167_5367.anInt2211)
                i_782_ = ((aClass167_5367.anInt2211
                        - anIntArray5362[i_779_])
                        * 255
                        / (aClass167_5367.anInt2211
                        - aClass167_5367.anInt2197));
            if (aByteArray5325 == null)
                aClass109_5383.anInt1674 = 0;
            else
                aClass109_5383.anInt1674
                        = aByteArray5325[i] & 0xff;
            if (aShortArray5388 == null || aShortArray5388[i] == -1) {
                if (anIntArray5366[i] == -1)
                    aClass109_5383.method1027
                            ((float) anIntArray5343[i_777_],
                                    (float) anIntArray5343[i_778_],
                                    (float) anIntArray5343[i_779_],
                                    (float) anIntArray5321[i_777_],
                                    (float) anIntArray5321[i_778_],
                                    (float) anIntArray5321[i_779_],
                                    (float) anIntArray5355[i_777_],
                                    (float) anIntArray5355[i_778_],
                                    (float) anIntArray5355[i_779_],
                                    Class6.method206((Class126.anIntArray4983
                                                    [anIntArray5368[i] & 0xffff]),
                                            (i_780_ << 24
                                                    | (aClass167_5367
                                                    .anInt2192)),
                                            255),
                                    Class6.method206((Class126.anIntArray4983
                                                    [anIntArray5368[i] & 0xffff]),
                                            (i_781_ << 24
                                                    | (aClass167_5367
                                                    .anInt2192)),
                                            255),
                                    Class6.method206((Class126.anIntArray4983
                                                    [anIntArray5368[i] & 0xffff]),
                                            (i_782_ << 24
                                                    | (aClass167_5367
                                                    .anInt2192)),
                                            255));
                else
                    aClass109_5383.method1027
                            ((float) anIntArray5343[i_777_],
                                    (float) anIntArray5343[i_778_],
                                    (float) anIntArray5343[i_779_],
                                    (float) anIntArray5321[i_777_],
                                    (float) anIntArray5321[i_778_],
                                    (float) anIntArray5321[i_779_],
                                    (float) anIntArray5355[i_777_],
                                    (float) anIntArray5355[i_778_],
                                    (float) anIntArray5355[i_779_],
                                    Class6.method206((Class126.anIntArray4983
                                                    [anIntArray5368[i] & 0xffff]),
                                            (i_780_ << 24
                                                    | (aClass167_5367
                                                    .anInt2192)),
                                            255),
                                    Class6.method206((Class126.anIntArray4983
                                                    [anIntArray5337[i] & 0xffff]),
                                            (i_781_ << 24
                                                    | (aClass167_5367
                                                    .anInt2192)),
                                            255),
                                    Class6.method206((Class126.anIntArray4983
                                                    [anIntArray5366[i] & 0xffff]),
                                            (i_782_ << 24
                                                    | (aClass167_5367
                                                    .anInt2192)),
                                            255));
            } else {
                int i_783_ = -16777216;
                if (aByteArray5325 != null)
                    i_783_ = 255 - (aByteArray5325[i] & 0xff) << 24;
                if (anIntArray5366[i] == -1) {
                    int i_784_ = i_783_ | anIntArray5368[i] & 0xffffff;
                    aClass109_5383.method1024((float) anIntArray5343[i_777_],
                            (float) anIntArray5343[i_778_],
                            (float) anIntArray5343[i_779_],
                            (float) anIntArray5321[i_777_],
                            (float) anIntArray5321[i_778_],
                            (float) anIntArray5321[i_779_],
                            (float) anIntArray5355[i_777_],
                            (float) anIntArray5355[i_778_],
                            (float) anIntArray5355[i_779_],
                            aFloatArrayArray5314[i][0],
                            aFloatArrayArray5314[i][1],
                            aFloatArrayArray5314[i][2],
                            aFloatArrayArray5345[i][0],
                            aFloatArrayArray5345[i][1],
                            aFloatArrayArray5345[i][2],
                            i_784_, i_784_, i_784_,
                            (aClass167_5367
                                    .anInt2192),
                            i_780_, i_781_, i_782_,
                            aShortArray5388[i]);
                } else
                    aClass109_5383.method1024
                            ((float) anIntArray5343[i_777_],
                                    (float) anIntArray5343[i_778_],
                                    (float) anIntArray5343[i_779_],
                                    (float) anIntArray5321[i_777_],
                                    (float) anIntArray5321[i_778_],
                                    (float) anIntArray5321[i_779_],
                                    (float) anIntArray5355[i_777_],
                                    (float) anIntArray5355[i_778_],
                                    (float) anIntArray5355[i_779_],
                                    aFloatArrayArray5314[i][0],
                                    aFloatArrayArray5314[i][1],
                                    aFloatArrayArray5314[i][2],
                                    aFloatArrayArray5345[i][0],
                                    aFloatArrayArray5345[i][1],
                                    aFloatArrayArray5345[i][2],
                                    i_783_ | anIntArray5368[i] & 0xffffff,
                                    i_783_ | anIntArray5337[i] & 0xffffff,
                                    i_783_ | anIntArray5366[i] & 0xffffff,
                                    aClass167_5367.anInt2192, i_780_, i_781_,
                                    i_782_, aShortArray5388[i]);
            }
        }
    }

    Class64_Sub1(ha_Sub1 var_ha_Sub1) {
        anInt5354 = 0;
        aBoolean5369 = false;
        anInt5351 = 0;
        aBoolean5372 = false;
        aBoolean5391 = false;
        anInt5387 = 0;
        aBoolean5382 = false;
        aHa_Sub1_5353 = var_ha_Sub1;
    }

    Class64_Sub1(ha_Sub1 var_ha_Sub1, Class124 class124, int i, int i_785_,
                 int i_786_, int i_787_) {
        anInt5354 = 0;
        aBoolean5369 = false;
        anInt5351 = 0;
        aBoolean5372 = false;
        aBoolean5391 = false;
        anInt5387 = 0;
        aBoolean5382 = false;
        aHa_Sub1_5353 = var_ha_Sub1;
        anInt5316 = i;
        anInt5344 = i_785_;
        anInt5349 = i_786_;
        d var_d = aHa_Sub1_5353.aD4579;
        anInt5340 = class124.anInt1836;
        anInt5387 = class124.anInt1821;
        anIntArray5356 = class124.anIntArray1841;
        anIntArray5332 = class124.anIntArray1847;
        anIntArray5312 = class124.anIntArray1852;
        anInt5351 = class124.anInt1817;
        aShortArray5317 = class124.aShortArray1863;
        aShortArray5394 = class124.aShortArray1835;
        aShortArray5364 = class124.aShortArray1855;
        aByteArray5358 = class124.aByteArray1839;
        aShortArray5311 = class124.aShortArray1862;
        aByteArray5325 = class124.aByteArray1834;
        aShortArray5370 = class124.aShortArray1856;
        aByteArray5386 = class124.aByteArray1843;
        aClass129Array5322 = class124.aClass129Array1846;
        aClass342Array5335 = class124.aClass342Array1866;
        aShortArray5333 = class124.aShortArray1842;
        int[] is = new int[anInt5351];
        for (int i_788_ = 0; i_788_ < anInt5351; i_788_++)
            is[i_788_] = i_788_;
        long[] ls = new long[anInt5351];
        boolean bool = (anInt5316 & 0x100) != 0;
        for (int i_789_ = 0; i_789_ < anInt5351; i_789_++) {
            int i_790_ = is[i_789_];
            Class12 class12 = null;
            int i_791_ = 0;
            int i_792_ = 0;
            int i_793_ = 0;
            int i_794_ = 0;
            if (class124.aClass162Array1832 != null) {
                boolean bool_795_ = false;
                for (int i_796_ = 0;
                     i_796_ < class124.aClass162Array1832.length;
                     i_796_++) {
                    Class162 class162
                            = class124.aClass162Array1832[i_796_];
                    if (i_790_ == class162.anInt2155) {
                        Class189 class189
                                = Class73.method742(104, (class162
                                .anInt2153));
                        if (class189.aBoolean2531)
                            bool_795_ = true;
                        if (class189.anInt2525 != -1) {
                            Class12 class12_797_
                                    = var_d.method3((class189
                                            .anInt2525),
                                    -6662);
                            if (class12_797_.anInt200 == 2)
                                aBoolean5382 = true;
                        }
                    }
                }
                if (bool_795_)
                    ls[i_789_] = 9223372036854775807L;
            }
            int i_798_ = -1;
            if (class124.aShortArray1822 != null) {
                i_798_ = class124.aShortArray1822[i_790_];
                if (i_798_ != -1) {
                    class12 = var_d.method3(i_798_ & 0xffff, -6662);
                    if ((i_787_ & 0x40) == 0
                            || !class12.aBoolean209) {
                        i_793_ = class12.aByte213;
                        i_794_ = class12.aByte202;
                    } else
                        i_798_ = -1;
                }
            }
            boolean bool_799_
                    = (aByteArray5325 != null && aByteArray5325[i_790_] != 0
                    || class12 != null && class12.anInt200 == 2);
            if ((bool || bool_799_) && aByteArray5358 != null)
                i_791_ += aByteArray5358[i_790_] << 17;
            if (bool_799_)
                i_791_ += 65536;
            i_791_ += (i_793_ & 0xff) << 8;
            i_791_ += i_794_ & 0xff;
            i_792_ += (i_798_ & 0xffff) << 16;
            i_792_ += i_789_ & 0xffff;
            ls[i_789_] = ((long) i_791_ << 32) + (long) i_792_;
            aBoolean5382 |= bool_799_;
        }
        Class348_Sub16_Sub2.method2832(is, ls, 0);
        if (class124.aClass162Array1832 != null) {
            anInt5389 = class124.aClass162Array1832.length;
            aClass6Array5361 = new Class6[anInt5389];
            aClass350Array5363 = new Class350[anInt5389];
            for (int i_800_ = 0;
                 i_800_ < class124.aClass162Array1832.length;
                 i_800_++) {
                Class162 class162
                        = class124.aClass162Array1832[i_800_];
                Class189 class189
                        = Class73.method742(104, class162.anInt2153);
                int i_801_ = ((Class126.anIntArray4983
                        [(class124.aShortArray1862
                        [class162.anInt2155]) & 0xffff])
                        & 0xffffff);
                i_801_ = (i_801_
                        | 255 - (class124.aByteArray1834 != null
                        ? (class124.aByteArray1834
                        [class162.anInt2155]) & 0xff
                        : 0) << 24);
                aClass6Array5361[i_800_]
                        = new Class6(class162.anInt2155,
                        (class124.aShortArray1863
                                [class162.anInt2155]),
                        (class124.aShortArray1835
                                [class162.anInt2155]),
                        (class124.aShortArray1855
                                [class162.anInt2155]),
                        class189.anInt2526,
                        class189.anInt2530,
                        class189.anInt2525,
                        class189.anInt2533,
                        class189.anInt2534,
                        class189.aBoolean2531,
                        class162.anInt2158);
                aClass350Array5363[i_800_] = new Class350(i_801_);
            }
        }
        aFloatArrayArray5314 = new float[anInt5351][];
        aFloatArrayArray5345 = new float[anInt5351][];
        Class358 class358
                = Class59_Sub2_Sub1.method565(255, anInt5351, class124, is);
        Class167 class167 = aHa_Sub1_5353.method3724(Thread.currentThread());
        float[] fs = class167.aFloatArray2226;
        boolean bool_802_ = false;
        for (int i_803_ = 0; i_803_ < anInt5351; i_803_++) {
            int i_804_ = is[i_803_];
            int i_805_;
            if (class124.aByteArray1820 == null)
                i_805_ = -1;
            else
                i_805_ = class124.aByteArray1820[i_804_];
            int i_806_
                    = (class124.aShortArray1822 == null ? -1
                    : class124.aShortArray1822[i_804_]);
            if (i_806_ != -1 && (i_787_ & 0x40) != 0) {
                Class12 class12 = var_d.method3(i_806_ & 0xffff, -6662);
                if (class12.aBoolean209)
                    i_806_ = -1;
            }
            if (i_806_ != -1) {
                bool_802_ = true;
                float[] fs_807_ = aFloatArrayArray5314[i_804_] = new float[3];
                float[] fs_808_ = aFloatArrayArray5345[i_804_] = new float[3];
                boolean bool_809_ = false;
                if (i_805_ == -1) {
                    fs_807_[0] = 0.0F;
                    fs_808_[0] = 1.0F;
                    fs_807_[1] = 1.0F;
                    fs_808_[1] = 1.0F;
                    fs_807_[2] = 0.0F;
                    fs_808_[2] = 0.0F;
                } else {
                    i_805_ &= 0xff;
                    byte i_810_ = class124.aByteArray1823[i_805_];
                    if (i_810_ == 0) {
                        short i_811_ = aShortArray5317[i_804_];
                        short i_812_ = aShortArray5394[i_804_];
                        short i_813_ = aShortArray5364[i_804_];
                        short i_814_
                                = class124.aShortArray1829[i_805_];
                        short i_815_
                                = class124.aShortArray1849[i_805_];
                        short i_816_
                                = class124.aShortArray1825[i_805_];
                        float f = (float) anIntArray5356[i_814_];
                        float f_817_ = (float) anIntArray5332[i_814_];
                        float f_818_ = (float) anIntArray5312[i_814_];
                        float f_819_ = (float) anIntArray5356[i_815_] - f;
                        float f_820_ = (float) anIntArray5332[i_815_] - f_817_;
                        float f_821_ = (float) anIntArray5312[i_815_] - f_818_;
                        float f_822_ = (float) anIntArray5356[i_816_] - f;
                        float f_823_ = (float) anIntArray5332[i_816_] - f_817_;
                        float f_824_ = (float) anIntArray5312[i_816_] - f_818_;
                        float f_825_ = (float) anIntArray5356[i_811_] - f;
                        float f_826_ = (float) anIntArray5332[i_811_] - f_817_;
                        float f_827_ = (float) anIntArray5312[i_811_] - f_818_;
                        float f_828_ = (float) anIntArray5356[i_812_] - f;
                        float f_829_ = (float) anIntArray5332[i_812_] - f_817_;
                        float f_830_ = (float) anIntArray5312[i_812_] - f_818_;
                        float f_831_ = (float) anIntArray5356[i_813_] - f;
                        float f_832_ = (float) anIntArray5332[i_813_] - f_817_;
                        float f_833_ = (float) anIntArray5312[i_813_] - f_818_;
                        float f_834_ = f_820_ * f_824_ - f_821_ * f_823_;
                        float f_835_ = f_821_ * f_822_ - f_819_ * f_824_;
                        float f_836_ = f_819_ * f_823_ - f_820_ * f_822_;
                        float f_837_ = f_823_ * f_836_ - f_824_ * f_835_;
                        float f_838_ = f_824_ * f_834_ - f_822_ * f_836_;
                        float f_839_ = f_822_ * f_835_ - f_823_ * f_834_;
                        float f_840_
                                = 1.0F / (f_837_ * f_819_ + f_838_ * f_820_
                                + f_839_ * f_821_);
                        fs_807_[0] = (f_837_ * f_825_ + f_838_ * f_826_
                                + f_839_ * f_827_) * f_840_;
                        fs_807_[1] = (f_837_ * f_828_ + f_838_ * f_829_
                                + f_839_ * f_830_) * f_840_;
                        fs_807_[2] = (f_837_ * f_831_ + f_838_ * f_832_
                                + f_839_ * f_833_) * f_840_;
                        f_837_ = f_820_ * f_836_ - f_821_ * f_835_;
                        f_838_ = f_821_ * f_834_ - f_819_ * f_836_;
                        f_839_ = f_819_ * f_835_ - f_820_ * f_834_;
                        f_840_ = 1.0F / (f_837_ * f_822_ + f_838_ * f_823_
                                + f_839_ * f_824_);
                        fs_808_[0] = (f_837_ * f_825_ + f_838_ * f_826_
                                + f_839_ * f_827_) * f_840_;
                        fs_808_[1] = (f_837_ * f_828_ + f_838_ * f_829_
                                + f_839_ * f_830_) * f_840_;
                        fs_808_[2] = (f_837_ * f_831_ + f_838_ * f_832_
                                + f_839_ * f_833_) * f_840_;
                    } else {
                        short i_841_ = aShortArray5317[i_804_];
                        short i_842_ = aShortArray5394[i_804_];
                        short i_843_ = aShortArray5364[i_804_];
                        int i_844_
                                = class358.anIntArray4416[i_805_];
                        int i_845_
                                = class358.anIntArray4415[i_805_];
                        int i_846_
                                = class358.anIntArray4414[i_805_];
                        float[] fs_847_ = (class358
                                .aFloatArrayArray4412[i_805_]);
                        byte i_848_
                                = class124.aByteArray1853[i_805_];
                        float f = ((float) (class124
                                .anIntArray1867[i_805_])
                                / 256.0F);
                        if (i_810_ == 1) {
                            float f_849_ = ((float) (class124
                                    .anIntArray1844[i_805_])
                                    / 1024.0F);
                            Class246.method1885(i_846_, anIntArray5312[i_841_],
                                    i_848_, 8,
                                    anIntArray5356[i_841_], fs,
                                    anIntArray5332[i_841_], f,
                                    i_845_, i_844_, f_849_,
                                    fs_847_);
                            fs_807_[0] = fs[0];
                            fs_808_[0] = fs[1];
                            Class246.method1885(i_846_, anIntArray5312[i_842_],
                                    i_848_, 8,
                                    anIntArray5356[i_842_], fs,
                                    anIntArray5332[i_842_], f,
                                    i_845_, i_844_, f_849_,
                                    fs_847_);
                            fs_807_[1] = fs[0];
                            fs_808_[1] = fs[1];
                            Class246.method1885(i_846_, anIntArray5312[i_843_],
                                    i_848_, 8,
                                    anIntArray5356[i_843_], fs,
                                    anIntArray5332[i_843_], f,
                                    i_845_, i_844_, f_849_,
                                    fs_847_);
                            fs_807_[2] = fs[0];
                            fs_808_[2] = fs[1];
                            float f_850_ = f_849_ / 2.0F;
                            if ((i_848_ & 0x1) == 0) {
                                if (fs_807_[1] - fs_807_[0] > f_850_)
                                    fs_807_[1] -= f_849_;
                                else if (fs_807_[0] - fs_807_[1] > f_850_)
                                    fs_807_[1] += f_849_;
                                if (fs_807_[2] - fs_807_[0] > f_850_)
                                    fs_807_[2] -= f_849_;
                                else if (fs_807_[0] - fs_807_[2] > f_850_)
                                    fs_807_[2] += f_849_;
                            } else {
                                if (fs_808_[1] - fs_808_[0] > f_850_)
                                    fs_808_[1] -= f_849_;
                                else if (fs_808_[0] - fs_808_[1] > f_850_)
                                    fs_808_[1] += f_849_;
                                if (fs_808_[2] - fs_808_[0] > f_850_)
                                    fs_808_[2] -= f_849_;
                                else if (fs_808_[0] - fs_808_[2] > f_850_)
                                    fs_808_[2] += f_849_;
                            }
                        } else if (i_810_ == 2) {
                            float f_851_ = ((float) (class124
                                    .anIntArray1857[i_805_])
                                    / 256.0F);
                            float f_852_ = ((float) (class124
                                    .anIntArray1865[i_805_])
                                    / 256.0F);
                            int i_853_ = (anIntArray5356[i_842_]
                                    - anIntArray5356[i_841_]);
                            int i_854_ = (anIntArray5332[i_842_]
                                    - anIntArray5332[i_841_]);
                            int i_855_ = (anIntArray5312[i_842_]
                                    - anIntArray5312[i_841_]);
                            int i_856_ = (anIntArray5356[i_843_]
                                    - anIntArray5356[i_841_]);
                            int i_857_ = (anIntArray5332[i_843_]
                                    - anIntArray5332[i_841_]);
                            int i_858_ = (anIntArray5312[i_843_]
                                    - anIntArray5312[i_841_]);
                            int i_859_ = i_854_ * i_858_ - i_857_ * i_855_;
                            int i_860_ = i_855_ * i_856_ - i_858_ * i_853_;
                            int i_861_ = i_853_ * i_857_ - i_856_ * i_854_;
                            float f_862_
                                    = 64.0F / (float) (class124
                                    .anIntArray1859[i_805_]);
                            float f_863_
                                    = 64.0F / (float) (class124
                                    .anIntArray1816[i_805_]);
                            float f_864_
                                    = 64.0F / (float) (class124
                                    .anIntArray1844[i_805_]);
                            float f_865_ = (((float) i_859_ * fs_847_[0]
                                    + (float) i_860_ * fs_847_[1]
                                    + (float) i_861_ * fs_847_[2])
                                    / f_862_);
                            float f_866_ = (((float) i_859_ * fs_847_[3]
                                    + (float) i_860_ * fs_847_[4]
                                    + (float) i_861_ * fs_847_[5])
                                    / f_863_);
                            float f_867_ = (((float) i_859_ * fs_847_[6]
                                    + (float) i_860_ * fs_847_[7]
                                    + (float) i_861_ * fs_847_[8])
                                    / f_864_);
                            int i_868_ = Class331.method2635(f_866_, false,
                                    f_867_, f_865_);
                            Class262.method1991(f_852_, f, fs_847_,
                                    anIntArray5312[i_841_], i_846_,
                                    false, i_848_, i_844_,
                                    anIntArray5356[i_841_],
                                    anIntArray5332[i_841_], f_851_,
                                    fs, i_845_, i_868_);
                            fs_807_[0] = fs[0];
                            fs_808_[0] = fs[1];
                            Class262.method1991(f_852_, f, fs_847_,
                                    anIntArray5312[i_842_], i_846_,
                                    false, i_848_, i_844_,
                                    anIntArray5356[i_842_],
                                    anIntArray5332[i_842_], f_851_,
                                    fs, i_845_, i_868_);
                            fs_807_[1] = fs[0];
                            fs_808_[1] = fs[1];
                            Class262.method1991(f_852_, f, fs_847_,
                                    anIntArray5312[i_843_], i_846_,
                                    false, i_848_, i_844_,
                                    anIntArray5356[i_843_],
                                    anIntArray5332[i_843_], f_851_,
                                    fs, i_845_, i_868_);
                            fs_807_[2] = fs[0];
                            fs_808_[2] = fs[1];
                        } else if (i_810_ == 3) {
                            Class181.method1367(i_846_, i_848_, f,
                                    anIntArray5356[i_841_], fs,
                                    anIntArray5312[i_841_], i_844_,
                                    anIntArray5332[i_841_], i_845_,
                                    -4, fs_847_);
                            fs_807_[0] = fs[0];
                            fs_808_[0] = fs[1];
                            Class181.method1367(i_846_, i_848_, f,
                                    anIntArray5356[i_842_], fs,
                                    anIntArray5312[i_842_], i_844_,
                                    anIntArray5332[i_842_], i_845_,
                                    -4, fs_847_);
                            fs_807_[1] = fs[0];
                            fs_808_[1] = fs[1];
                            Class181.method1367(i_846_, i_848_, f,
                                    anIntArray5356[i_843_], fs,
                                    anIntArray5312[i_843_], i_844_,
                                    anIntArray5332[i_843_], i_845_,
                                    -4, fs_847_);
                            fs_807_[2] = fs[0];
                            fs_808_[2] = fs[1];
                            if ((i_848_ & 0x1) == 0) {
                                if (fs_807_[1] - fs_807_[0] > 0.5F)
                                    fs_807_[1]--;
                                else if (fs_807_[0] - fs_807_[1] > 0.5F)
                                    fs_807_[1]++;
                                if (fs_807_[2] - fs_807_[0] > 0.5F)
                                    fs_807_[2]--;
                                else if (fs_807_[0] - fs_807_[2] > 0.5F)
                                    fs_807_[2]++;
                            } else {
                                if (fs_808_[1] - fs_808_[0] > 0.5F)
                                    fs_808_[1]--;
                                else if (fs_808_[0] - fs_808_[1] > 0.5F)
                                    fs_808_[1]++;
                                if (fs_808_[2] - fs_808_[0] > 0.5F)
                                    fs_808_[2]--;
                                else if (fs_808_[0] - fs_808_[2] > 0.5F)
                                    fs_808_[2]++;
                            }
                        }
                    }
                }
            }
        }
        if (!bool_802_)
            aFloatArrayArray5314 = aFloatArrayArray5345 = null;
        if (class124.anIntArray1868 != null
                && (anInt5316 & 0x20) != 0)
            anIntArrayArray5334 = class124.method1100(true, -122);
        if (class124.anIntArray1824 != null
                && (anInt5316 & 0x180) != 0)
            anIntArrayArray5330 = class124.method1094((byte) 30);
        if (class124.aClass162Array1832 != null
                && (anInt5316 & 0x400) != 0)
            anIntArrayArray5379 = class124.method1093((byte) -75);
        if (class124.aShortArray1822 != null) {
            aShortArray5388 = new short[anInt5351];
            boolean bool_869_ = false;
            for (int i_870_ = 0; i_870_ < anInt5351; i_870_++) {
                short i_871_ = class124.aShortArray1822[i_870_];
                if (i_871_ != -1) {
                    Class12 class12
                            = aHa_Sub1_5353.aD4579.method3(i_871_, -6662);
                    if ((i_787_ & 0x40) == 0
                            || !class12.aBoolean209) {
                        aShortArray5388[i_870_] = i_871_;
                        bool_869_ = true;
                        if (class12.anInt200 == 2)
                            aBoolean5382 = true;
                        if (class12.aByte198 != 0
                                || class12.aByte211 != 0)
                            aBoolean5391 = true;
                    } else
                        aShortArray5388[i_870_] = (short) -1;
                } else
                    aShortArray5388[i_870_] = (short) -1;
            }
            if (!bool_869_)
                aShortArray5388 = null;
        } else
            aShortArray5388 = null;
        if (aBoolean5382 || aClass6Array5361 != null) {
            aShortArray5327 = new short[anInt5351];
            for (int i_872_ = 0; i_872_ < anInt5351; i_872_++)
                aShortArray5327[i_872_] = (short) is[i_872_];
        }
    }

    static {
        anInt5341 = 0;
        anInt5350 = 4096;
    }
}
