/* Class174 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class174 {
    static int anInt2287;
    static int anInt2288;
    int anInt2289;
    int anInt2290;
    int anInt2291;
    int anInt2292;
    static int anInt2293;
    int anInt2294;
    static int anInt2295;
    int anInt2296;
    int anInt2297 = 0;
    int anInt2298;
    int anInt2299;
    static int anInt2300;
    long aLong2301;
    private int anInt2302;
    int anInt2303;
    int anInt2304;
    static Class114 aClass114_2305 = new Class114(57, 10);
    static Class45 aClass45_2306;
    static Class223 aClass223_2307 = new Class223(7, 2);
    private boolean aBoolean2308;
    static Class105 aClass105_2309;

    static final boolean method1332(boolean bool, boolean bool_0_, int i, String string) {
        anInt2293++;
        if (i < 2 || i > 36) throw new IllegalArgumentException("Invalid radix:" + i);
        boolean bool_1_ = false;
        boolean bool_2_ = false;
        int i_3_ = 0;
        if (bool != true) aClass45_2306 = null;
        int i_4_ = string.length();
        for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
            int i_6_ = string.charAt(i_5_);
            if (i_5_ == 0) {
                if (i_6_ == 45) {
                    bool_1_ = true;
                    continue;
                }
                if (i_6_ == 43 && bool_0_) continue;
            }
            if (i_6_ < 48 || i_6_ > 57) {
                if (i_6_ < 65 || i_6_ > 90) {
                    if (i_6_ >= 97 && i_6_ <= 122) i_6_ -= 87;
                    else return false;
                } else i_6_ -= 55;
            } else i_6_ -= 48;
            if (i_6_ >= i) return false;
            if (bool_1_) i_6_ = -i_6_;
            int i_7_ = i * i_3_ - -i_6_;
            if (i_7_ / i != i_3_) return false;
            bool_2_ = true;
            i_3_ = i_7_;
        }
        return bool_2_;
    }

    static final void method1333(short[] is, int i, String[] strings) {
        try {
            if (i != 26073) aClass105_2309 = null;
            anInt2295++;
            Class64.method607(strings.length + -1, strings, is, 0, false);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("po.B(" + (is != null ? "{...}" : "null") + ',' + i + ',' + (strings != null ? "{...}" : "null") + ')'));
        }
    }

    public static void method1334(byte i) {
        aClass223_2307 = null;
        if (i != -110) method1333(null, -51, null);
        aClass114_2305 = null;
        aClass105_2309 = null;
        aClass45_2306 = null;
    }

    private final void method1335(Class348_Sub49 class348_sub49, int i, byte i_8_) {
        anInt2287++;
        if (i == 1) anInt2302 = class348_sub49.readShort(842397944);
        else if (i == 2) class348_sub49.readUnsignedByte(255);
        else if (i == 3) {
            this.anInt2291 = class348_sub49.readInt((byte) -126);
            this.anInt2290 = class348_sub49.readInt((byte) -126);
            this.anInt2294 = class348_sub49.readInt((byte) -126);
        } else if (i == 4) {
            this.anInt2289 = class348_sub49.readUnsignedByte(255);
            this.anInt2304 = class348_sub49.readInt((byte) -126);
        } else if (i != 6) {
            if (i == 8) this.anInt2297 = 1;
            else if (i == 9) this.anInt2292 = 1;
            else if (i == 10) aBoolean2308 = true;
        } else this.anInt2296 = class348_sub49.readUnsignedByte(255);
        if (i_8_ >= -124) this.aLong2301 = 65L;
    }

    final void method1336(int i, Class348_Sub49 class348_sub49) {
        for (; ; ) {
            int i_9_ = class348_sub49.readUnsignedByte(255);
            if (i_9_ == 0) break;
            method1335(class348_sub49, i_9_, (byte) -128);
        }
        anInt2288++;
        if (i <= 36) this.anInt2296 = 8;
    }

    final void method1337(int i) {
        anInt2300++;
        this.anInt2298 = Class70.anIntArray1204[anInt2302 << 3];
        long l = this.anInt2291;
        long l_10_ = this.anInt2290;
        long l_11_ = this.anInt2294;
        this.anInt2299 = (int) Math.sqrt((double) (l_10_ * l_10_ + (l * l - -(l_11_ * l_11_))));
        if (this.anInt2304 == 0) this.anInt2304 = 1;
        if ((~this.anInt2289) != i) {
            if (this.anInt2289 == 1) {
                this.aLong2301 = this.anInt2299 * 8 / this.anInt2304;
                this.aLong2301 *= this.aLong2301;
            } else if (this.anInt2289 == 2) this.aLong2301 = 8 * this.anInt2299 / this.anInt2304;
        } else this.aLong2301 = 2147483647L;
        if (aBoolean2308) this.anInt2299 *= -1;
    }

    public Class174() {
        this.anInt2292 = 0;
        aBoolean2308 = false;
    }
}
