/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class77 {
    private int[] anIntArray1289;
    static int anInt1290 = 0;
    private int anInt1291;
    private int anInt1292;
    private int anInt1293;
    private int anInt1294;
    static int anInt1295;
    private int[] anIntArray1296;
    static int anInt1297;
    static Class273 aClass273_1298 = new Class273("", 16);
    static int anInt1299;
    static int anInt1300;
    static int anInt1301;
    static int anInt1302;
    static int[] anIntArray1303;

    static final boolean method776(int i, int i_0_, int i_1_) {
        anInt1297++;
        if (i_1_ != 65536) method780(-106, -24, 57);
        boolean bool = ((i & 0x37) != 0 ? Class126.method1113(i_0_, i, -7) : Class348_Sub42_Sub8_Sub2.method3200(i_0_, i, (byte) 111));
        return bool | (Class274.method2058(i_0_, i, i_1_ ^ 0x1003d) | (0x10000 & i_0_) != 0);
    }

    private Class77() {
        /* empty */
    }

    Class77(int[] is) {
        anIntArray1296 = new int[256];
        anIntArray1289 = new int[256];
        for (int i = 0; is.length > i; i++)
            anIntArray1289[i] = is[i];
        method777(-94);
    }

    private final void method777(int i) {
        anInt1302++;
        int i_3_;
        int i_4_;
        int i_5_;
        int i_6_;
        int i_7_;
        int i_8_;
        int i_9_;
        int i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = i_8_ = i_9_ = -1640531527;
        for (int i_10_ = 0; i_10_ < 4; i_10_++) {
            i_2_ ^= i_3_ << 11;
            i_5_ += i_2_;
            i_3_ += i_4_;
            i_3_ ^= i_4_ >>> 2;
            i_6_ += i_3_;
            i_4_ += i_5_;
            i_4_ ^= i_5_ << 8;
            i_5_ += i_6_;
            i_7_ += i_4_;
            i_5_ ^= i_6_ >>> 16;
            i_8_ += i_5_;
            i_6_ += i_7_;
            i_6_ ^= i_7_ << 10;
            i_7_ += i_8_;
            i_9_ += i_6_;
            i_7_ ^= i_8_ >>> 4;
            i_2_ += i_7_;
            i_8_ += i_9_;
            i_8_ ^= i_9_ << 8;
            i_3_ += i_8_;
            i_9_ += i_2_;
            i_9_ ^= i_2_ >>> 9;
            i_2_ += i_3_;
            i_4_ += i_9_;
        }
        for (int i_11_ = 0; i_11_ < 256; i_11_ += 8) {
            i_4_ += anIntArray1289[i_11_ - -2];
            i_9_ += anIntArray1289[i_11_ + 7];
            i_5_ += anIntArray1289[3 + i_11_];
            i_7_ += anIntArray1289[5 + i_11_];
            i_8_ += anIntArray1289[i_11_ - -6];
            i_3_ += anIntArray1289[1 + i_11_];
            i_6_ += anIntArray1289[4 + i_11_];
            i_2_ += anIntArray1289[i_11_];
            i_2_ ^= i_3_ << 11;
            i_3_ += i_4_;
            i_5_ += i_2_;
            i_3_ ^= i_4_ >>> 2;
            i_4_ += i_5_;
            i_6_ += i_3_;
            i_4_ ^= i_5_ << 8;
            i_7_ += i_4_;
            i_5_ += i_6_;
            i_5_ ^= i_6_ >>> 16;
            i_8_ += i_5_;
            i_6_ += i_7_;
            i_6_ ^= i_7_ << 10;
            i_9_ += i_6_;
            i_7_ += i_8_;
            i_7_ ^= i_8_ >>> 4;
            i_8_ += i_9_;
            i_2_ += i_7_;
            i_8_ ^= i_9_ << 8;
            i_9_ += i_2_;
            i_3_ += i_8_;
            i_9_ ^= i_2_ >>> 9;
            i_4_ += i_9_;
            i_2_ += i_3_;
            anIntArray1296[i_11_] = i_2_;
            anIntArray1296[1 + i_11_] = i_3_;
            anIntArray1296[i_11_ + 2] = i_4_;
            anIntArray1296[i_11_ + 3] = i_5_;
            anIntArray1296[i_11_ + 4] = i_6_;
            anIntArray1296[i_11_ - -5] = i_7_;
            anIntArray1296[i_11_ - -6] = i_8_;
            anIntArray1296[i_11_ - -7] = i_9_;
        }
        int i_12_ = 0;
        if (i > -72) anIntArray1296 = null;
        for (/**/; i_12_ < 256; i_12_ += 8) {
            i_4_ += anIntArray1296[2 + i_12_];
            i_5_ += anIntArray1296[i_12_ - -3];
            i_9_ += anIntArray1296[i_12_ + 7];
            i_7_ += anIntArray1296[i_12_ - -5];
            i_3_ += anIntArray1296[i_12_ + 1];
            i_8_ += anIntArray1296[6 + i_12_];
            i_2_ += anIntArray1296[i_12_];
            i_6_ += anIntArray1296[i_12_ - -4];
            i_2_ ^= i_3_ << 11;
            i_5_ += i_2_;
            i_3_ += i_4_;
            i_3_ ^= i_4_ >>> 2;
            i_6_ += i_3_;
            i_4_ += i_5_;
            i_4_ ^= i_5_ << 8;
            i_7_ += i_4_;
            i_5_ += i_6_;
            i_5_ ^= i_6_ >>> 16;
            i_8_ += i_5_;
            i_6_ += i_7_;
            i_6_ ^= i_7_ << 10;
            i_7_ += i_8_;
            i_9_ += i_6_;
            i_7_ ^= i_8_ >>> 4;
            i_8_ += i_9_;
            i_2_ += i_7_;
            i_8_ ^= i_9_ << 8;
            i_3_ += i_8_;
            i_9_ += i_2_;
            i_9_ ^= i_2_ >>> 9;
            i_4_ += i_9_;
            i_2_ += i_3_;
            anIntArray1296[i_12_] = i_2_;
            anIntArray1296[i_12_ + 1] = i_3_;
            anIntArray1296[2 + i_12_] = i_4_;
            anIntArray1296[3 + i_12_] = i_5_;
            anIntArray1296[4 + i_12_] = i_6_;
            anIntArray1296[i_12_ - -5] = i_7_;
            anIntArray1296[i_12_ + 6] = i_8_;
            anIntArray1296[7 + i_12_] = i_9_;
        }
        method779(false);
        anInt1292 = 256;
    }

    final int method778(byte i) {
        anInt1300++;
        if (anInt1292 == 0) {
            method779(false);
            anInt1292 = 256;
        }
        if (i <= 12) return 116;
        return anIntArray1289[anInt1292 - 1];
    }

    private final void method779(boolean bool) {
        anInt1301++;
        anInt1291 += ++anInt1294;
        for (int i = 0; i < 256; i++) {
            int i_13_ = anIntArray1296[i];
            if ((i & 0x2) != 0) {
                if ((0x1 & i) == 0) anInt1293 ^= anInt1293 << 2;
                else anInt1293 ^= anInt1293 >>> 16;
            } else if ((0x1 & i) != 0) anInt1293 ^= anInt1293 >>> 6;
            else anInt1293 ^= anInt1293 << 13;
            anInt1293 += anIntArray1296[0xff & 128 + i];
            int i_14_;
            anIntArray1296[i] = i_14_ = (anIntArray1296[Class139.method1166(255, i_13_ >> 2)] - (-anInt1293 - anInt1291));
            anIntArray1289[i] = anInt1291 = i_13_ + anIntArray1296[(Class139.method1166(261268, i_14_) >> 278777480 >> 242087490)];
        }
        if (bool != false) method776(-33, -56, 52);
    }

    static final boolean method780(int i, int i_15_, int i_16_) {
        if (i_15_ != 0) return true;
        anInt1299++;
        return (0x400 & i_16_) != 0;
    }

    final int method781(byte i) {
        if (anInt1292 == 0) {
            method779(false);
            anInt1292 = 256;
        }
        anInt1295++;
        if (i >= -47) method779(false);
        return anIntArray1289[--anInt1292];
    }

    public static void method782(int i) {
        anIntArray1303 = null;
        if (i != 1) anInt1290 = 114;
        aClass273_1298 = null;
    }
}
