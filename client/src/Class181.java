/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class181 {
    int anInt2373;
    static boolean[] aBooleanArray2374 = new boolean[5];
    private int anInt2375;
    boolean aBoolean2376;
    int anInt2377;
    static int anInt2378;
    int anInt2379 = 0;
    int[] anIntArray2380;
    int anInt2381;
    boolean aBoolean2382 = false;
    int anInt2383;
    int anInt2384;
    int[] anIntArray2385;
    int anInt2386;
    int anInt2387 = -1;
    int anInt2388;
    int anInt2389;
    int anInt2390;
    int anInt2391;
    int anInt2392;
    int anInt2393;
    int anInt2394;
    int[] anIntArray2395;
    static int anInt2396;
    boolean aBoolean2397;
    static int anInt2398;
    int anInt2399;
    static int anInt2400;
    private int anInt2401;
    int[] anIntArray2402;
    int anInt2403;
    int anInt2404 = -1;
    int anInt2405;
    boolean aBoolean2406;
    int anInt2407;
    int anInt2408;
    static int anInt2409;
    int anInt2410;
    boolean aBoolean2411 = true;
    private int anInt2412;
    int anInt2413;
    int anInt2414;
    short aShort2415;
    int anInt2416;
    int anInt2417;
    short aShort2418;
    private int anInt2419;
    private int anInt2420;
    int anInt2421;
    int anInt2422;
    int anInt2423;
    boolean aBoolean2424;
    int anInt2425;
    int anInt2426;
    int anInt2427;
    private int anInt2428;
    int anInt2429;
    boolean aBoolean2430;
    short aShort2431;
    private int anInt2432;
    int anInt2433;
    private int anInt2434;
    boolean aBoolean2435;
    int anInt2436;
    int anInt2437;
    int anInt2438;
    int anInt2439;
    private int anInt2440;
    short aShort2441;
    int anInt2442;
    boolean aBoolean2443;
    private int anInt2444;

    static final void method1367(int i, int i_0_, float f, int i_1_, float[] fs, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, float[] fs_7_) {
        try {
            i_2_ -= i;
            anInt2409++;
            i_1_ -= i_3_;
            i_4_ -= i_5_;
            float f_8_ = (float) i_2_ * fs_7_[2] + (fs_7_[1] * (float) i_4_ + fs_7_[0] * (float) i_1_);
            float f_9_ = (float) i_2_ * fs_7_[5] + ((float) i_1_ * fs_7_[3] + (float) i_4_ * fs_7_[4]);
            float f_10_ = (fs_7_[6] * (float) i_1_ + (float) i_4_ * fs_7_[7] + (float) i_2_ * fs_7_[8]);
            float f_11_ = (float) Math.sqrt(f_8_ * f_8_ + f_9_ * f_9_ + f_10_ * f_10_);
            float f_12_ = 0.5F + ((float) Math.atan2(f_8_, f_10_) / 6.2831855F);
            if (i_6_ != -4) method1369((byte) 98);
            float f_13_ = f + (0.5F + ((float) Math.asin(f_9_ / f_11_) / 3.1415927F));
            if (i_0_ == 1) {
                float f_15_ = f_12_;
                f_12_ = -f_13_;
                f_13_ = f_15_;
            } else if (i_0_ == 2) {
                f_13_ = -f_13_;
                f_12_ = -f_12_;
            } else if (i_0_ == 3) {
                float f_14_ = f_12_;
                f_12_ = f_13_;
                f_13_ = -f_14_;
            }
            fs[0] = f_12_;
            fs[1] = f_13_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qb.E(" + i + ',' + i_0_ + ',' + f + ',' + i_1_ + ',' + (fs != null ? "{...}" : "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + (fs_7_ != null ? "{...}" : "null") + ')'));
        }
    }

    private final void method1368(int i, Class348_Sub49 class348_sub49, int i_16_) {
        if (i >= -43) method1369((byte) -111);
        anInt2396++;
        if (i_16_ == 1) {
            this.aShort2431 = (short) class348_sub49.method3330(842397944);
            this.aShort2415 = (short) class348_sub49.method3330(842397944);
            this.aShort2418 = (short) class348_sub49.method3330(842397944);
            this.aShort2441 = (short) class348_sub49.method3330(842397944);
            int i_23_ = 3;
            this.aShort2431 <<= i_23_;
            this.aShort2418 <<= i_23_;
            this.aShort2441 <<= i_23_;
            this.aShort2415 <<= i_23_;
        } else if (i_16_ == 2) class348_sub49.method3387(255);
        else if (i_16_ == 3) {
            this.anInt2392 = class348_sub49.method3385((byte) -126);
            this.anInt2438 = class348_sub49.method3385((byte) -126);
        } else if (i_16_ == 4) {
            this.anInt2436 = class348_sub49.method3387(255);
            this.anInt2437 = class348_sub49.method3388(-115);
        } else if (i_16_ != 5) {
            if (i_16_ == 6) {
                anInt2428 = class348_sub49.method3385((byte) -126);
                anInt2434 = class348_sub49.method3385((byte) -126);
            } else if (i_16_ == 7) {
                this.anInt2394 = class348_sub49.method3330(842397944);
                this.anInt2407 = class348_sub49.method3330(842397944);
            } else if (i_16_ == 8) {
                this.anInt2391 = class348_sub49.method3330(842397944);
                this.anInt2389 = class348_sub49.method3330(842397944);
            } else if (i_16_ == 9) {
                int i_21_ = class348_sub49.method3387(255);
                this.anIntArray2402 = new int[i_21_];
                for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
                    this.anIntArray2402[i_22_] = class348_sub49.method3330(842397944);
            } else if (i_16_ == 10) {
                int i_19_ = class348_sub49.method3387(255);
                this.anIntArray2395 = new int[i_19_];
                for (int i_20_ = 0; (i_20_ < i_19_); i_20_++)
                    this.anIntArray2395[i_20_] = class348_sub49.method3330(842397944);
            } else if (i_16_ == 12) this.anInt2384 = class348_sub49.method3388(-112);
            else if (i_16_ != 13) {
                if (i_16_ == 14) this.anInt2422 = class348_sub49.method3330(842397944);
                else if (i_16_ != 15) {
                    if (i_16_ == 16) {
                        this.aBoolean2406 = class348_sub49.method3387(255) == 1;
                        this.anInt2393 = class348_sub49.method3330(842397944);
                        this.anInt2425 = class348_sub49.method3330(842397944);
                        this.aBoolean2411 = class348_sub49.method3387(255) == 1;
                    } else if (i_16_ == 17) this.anInt2387 = class348_sub49.method3330(842397944);
                    else if (i_16_ == 18) this.anInt2386 = class348_sub49.method3385((byte) -126);
                    else if (i_16_ != 19) {
                        if (i_16_ == 20) anInt2375 = class348_sub49.method3387(255);
                        else if (i_16_ != 21) {
                            if (i_16_ == 22) this.anInt2404 = (class348_sub49.method3385((byte) -126));
                            else if (i_16_ != 23) {
                                if (i_16_ != 24) {
                                    if (i_16_ == 25) {
                                        int i_17_ = (class348_sub49.method3387(255));
                                        this.anIntArray2380 = (new int
                                                [i_17_]);
                                        for (int i_18_ = 0; i_17_ > i_18_; i_18_++)
                                            this.anIntArray2380[i_18_] = (class348_sub49.method3330(842397944));
                                    } else if (i_16_ != 26) {
                                        if (i_16_ == 27) this.anInt2427 = ((class348_sub49.method3330(842397944)) << -755800980 << 80752930);
                                        else if (i_16_ == 28) anInt2432 = (class348_sub49.method3387(255));
                                        else if (i_16_ != 29) {
                                            if (i_16_ != 30) {
                                                if (i_16_ == 31) {
                                                    this.anInt2442 = class348_sub49.method3330(842397944) << 2097170348 << -1512556382;
                                                    this.anInt2417 = class348_sub49.method3330(842397944) << -355565332 << -2060812222;
                                                } else if (i_16_ != 32) {
                                                    if (i_16_ != 33) {
                                                        if (i_16_ == 34) this.aBoolean2376 = false;
                                                    } else this.aBoolean2424 = true;
                                                } else this.aBoolean2430 = false;
                                            } else this.aBoolean2382 = true;
                                        } else class348_sub49.method3372(13638);
                                    } else this.aBoolean2435 = false;
                                } else this.aBoolean2443 = false;
                            } else anInt2401 = class348_sub49.method3387(255);
                        } else anInt2440 = class348_sub49.method3387(255);
                    } else this.anInt2379 = class348_sub49.method3387(255);
                } else this.anInt2414 = class348_sub49.method3330(842397944);
            } else this.anInt2423 = class348_sub49.method3388(-124);
        } else this.anInt2442 = this.anInt2417 = (class348_sub49.method3330(842397944) << -374037204 << 1009462498);
    }

    public static void method1369(byte i) {
        aBooleanArray2374 = null;
        if (i != 2) anInt2398 = 113;
    }

    final void method1370(int i, Class348_Sub49 class348_sub49) {
        anInt2400++;
        for (; ; ) {
            int i_24_ = class348_sub49.method3387(255);
            if (i_24_ == 0) break;
            method1368(-75, class348_sub49, i_24_);
        }
        int i_25_ = 117 / ((i - -51) / 43);
    }

    final void method1371(int i) {
        this.anInt2429 = (0xff8084 & anInt2428) >> -1101605264;
        anInt2420 = anInt2434 >> 499648816 & 0xff;
        if (this.anInt2384 > -2 || this.anInt2423 > -2) this.aBoolean2397 = true;
        anInt2378++;
        anInt2419 = anInt2434 >> -299034488 & 0xff;
        this.anInt2390 = 0xff & anInt2428 >> 1929846536;
        this.anInt2433 = -this.anInt2429 + anInt2420;
        anInt2412 = 0xff & anInt2434;
        this.anInt2399 = anInt2428 & 0xff;
        this.anInt2403 = anInt2419 - this.anInt2390;
        if (i != 4) this.aBoolean2376 = false;
        this.anInt2413 = anInt2428 >> -671976424 & 0xff;
        this.anInt2408 = anInt2412 - this.anInt2399;
        anInt2444 = 0xff & anInt2434 >> -1555004712;
        this.anInt2410 = -this.anInt2413 + anInt2444;
        if (this.anInt2427 != -1) {
            this.anInt2388 = this.anInt2407 * anInt2432 / 100;
            if (this.anInt2388 == 0) this.anInt2388 = 1;
            this.anInt2439 = ((this.anInt2427 + -((this.anInt2417 - this.anInt2442) / 2) + -this.anInt2442) / this.anInt2388);
        }
        if (this.anInt2386 != 0) {
            this.anInt2381 = this.anInt2407 * anInt2440 / 100;
            this.anInt2373 = anInt2375 * this.anInt2407 / 100;
            if (this.anInt2373 == 0) this.anInt2373 = 1;
            this.anInt2426 = ((((this.anInt2386 & 0xff61a1) >> -1333958768) + (-this.anInt2429 - this.anInt2433 / 2)) << -1835545336) / this.anInt2373;
            this.anInt2405 = (((0xff & this.anInt2386) - (this.anInt2399 - -(this.anInt2408 / 2))) << 177669928) / this.anInt2373;
            if (this.anInt2381 == 0) this.anInt2381 = 1;
            this.anInt2421 = ((-(this.anInt2403 / 2) + -this.anInt2390 + ((this.anInt2386 & 0xff16) >> -1967266872)) << -479429560) / this.anInt2373;
            Class181 class181_26_ = this;
            class181_26_.anInt2426 = (class181_26_.anInt2426 + (this.anInt2426 > 0 ? -4 : 4));
            Class181 class181_27_ = this;
            class181_27_.anInt2405 = (class181_27_.anInt2405 + (this.anInt2405 <= 0 ? 4 : -4));
            this.anInt2416 = (((this.anInt2386 >> -847692680 & 0xff) - this.anInt2410 / 2 - this.anInt2413) << 1376302568) / this.anInt2381;
            Class181 class181_28_ = this;
            class181_28_.anInt2421 = (class181_28_.anInt2421 + (this.anInt2421 > 0 ? -4 : 4));
            Class181 class181_29_ = this;
            class181_29_.anInt2416 = (class181_29_.anInt2416 + (this.anInt2416 <= 0 ? 4 : -4));
        }
        if (this.anInt2404 != -1) {
            this.anInt2383 = anInt2401 * this.anInt2407 / 100;
            if (this.anInt2383 == 0) this.anInt2383 = 1;
            this.anInt2377 = ((-this.anInt2392 + (-((this.anInt2438 + -this.anInt2392) / 2) + this.anInt2404)) / this.anInt2383);
        }
    }

    public Class181() {
        this.anInt2384 = -2;
        this.aBoolean2397 = false;
        anInt2401 = 100;
        this.aBoolean2376 = true;
        this.anInt2393 = -1;
        this.anInt2423 = -2;
        anInt2375 = 100;
        this.anInt2427 = -1;
        this.anInt2425 = -1;
        this.aBoolean2430 = true;
        this.anInt2422 = 0;
        this.aBoolean2424 = false;
        this.anInt2414 = -1;
        anInt2432 = 100;
        anInt2440 = 100;
        this.anInt2436 = 0;
        this.aBoolean2435 = true;
        this.aBoolean2406 = true;
        this.aBoolean2443 = true;
    }
}
