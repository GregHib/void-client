/* Class239_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub26 extends Class239 {
    static Class54[] aClass54Array6114;
    static int anInt6115;
    static int anInt6116;
    static int anInt6117;
    static int anInt6118;
    static int anInt6119;
    static float aFloat6120 = 1.0F;
    static Class114 aClass114_6121;
    static int anInt6122;
    static int anInt6123;
    static int anInt6124;
    static int anInt6125;
    static int anInt6126;

    static final boolean method1833(byte i, int i_0_, int i_1_) {
        if (i > -111) method1834(null, (byte) -87);
        anInt6126++;
        return (i_0_ & 0x84080) != 0;
    }

    final int method1710(int i) {
        if (i != 20014) return 112;
        anInt6116++;
        return 127;
    }

    static final void method1834(Class318_Sub1_Sub3_Sub3 class318_sub1_sub3_sub3, byte i) {
        anInt6125++;
        int i_2_ = (class318_sub1_sub3_sub3.anInt10239 - Class367_Sub11.anInt7396);
        if (i < 0) {
            int i_3_ = ((class318_sub1_sub3_sub3.anInt10293) * 512 + 256 * class318_sub1_sub3_sub3.method2436((byte) 73));
            int i_4_ = (512 * (class318_sub1_sub3_sub3.anInt10314) - -(class318_sub1_sub3_sub3.method2436((byte) 114) * 256));
            class318_sub1_sub3_sub3.anInt10326 = 0;
            class318_sub1_sub3_sub3.y += ((i_4_ + -class318_sub1_sub3_sub3.y) / i_2_);
            class318_sub1_sub3_sub3.x += ((i_3_ + -class318_sub1_sub3_sub3.x) / i_2_);
            if (class318_sub1_sub3_sub3.anInt10231 == 0) class318_sub1_sub3_sub3.method2440((byte) 49, 8192);
            if (class318_sub1_sub3_sub3.anInt10231 == 1) class318_sub1_sub3_sub3.method2440((byte) 49, 12288);
            if (class318_sub1_sub3_sub3.anInt10231 == 2) class318_sub1_sub3_sub3.method2440((byte) 49, 0);
            if (class318_sub1_sub3_sub3.anInt10231 == 3) class318_sub1_sub3_sub3.method2440((byte) 49, 4096);
        }
    }

    final void method1716(boolean bool) {
        if (bool != false) anInt6115 = 87;
        if (this.anInt3138 < 0 && this.anInt3138 > 127) this.anInt3138 = method1710(20014);
        anInt6117++;
    }

    final int method1714(int i, int i_5_) {
        if (i != 3) method1834(null, (byte) 50);
        anInt6124++;
        return 1;
    }

    public static void method1835(int i) {
        aClass54Array6114 = null;
        aClass114_6121 = null;
        if (i != -28594) anInt6115 = -7;
    }

    Class239_Sub26(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    static final int parseInt(int i, int radix, boolean positive, String string) {
        anInt6118++;
        if (radix < 2 || radix > 36) throw new IllegalArgumentException("Invalid radix:" + radix);
        boolean negative = false;
        boolean valid = false;
        int result = 0;
        if (i != -123) method1837(-93, 121, 38);
        int length = string.length();
        for (int index = 0; index < length; index++) {
            int digit = string.charAt(index);
            if (index == 0) {
                if (digit == 45) {
                    negative = true;
                    continue;
                }
                if (digit == 43 && positive) continue;
            }
            if (digit >= 48 && digit <= 57) digit -= 48;
            else if (digit >= 65 && digit <= 90) digit -= 55;
            else if (digit >= 97 && digit <= 122) digit -= 87;
            else throw new NumberFormatException();
            if (digit >= radix) throw new NumberFormatException();
            if (negative) digit = -digit;
            int temp = radix * result - -digit;
            if (result != temp / radix) throw new NumberFormatException();
            valid = true;
            result = temp;
        }
        if (!valid) throw new NumberFormatException();
        return result;
    }

    static final boolean method1837(int i, int i_14_, int i_15_) {
        if (i_14_ < 41) aClass114_6121 = null;
        anInt6122++;
        return (i_15_ & 0x800) != 0;
    }

    final void method1712(int i, int i_16_) {
        int i_17_ = 63 % ((i - 82) / 35);
        anInt6119++;
        this.anInt3138 = i_16_;
    }

    Class239_Sub26(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    final int method1838(int i) {
        if (i != -32350) parseInt(89, 103, false, null);
        anInt6123++;
        return this.anInt3138;
    }

    static {
        aClass54Array6114 = new Class54[6];
        aClass114_6121 = new Class114(32, 6);
    }
}
