/* Class239_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class239_Sub21 extends Class239 {
    static int anInt6057;
    static Class114 aClass114_6058;
    static int anInt6059;
    static int anInt6060;
    static int[] anIntArray6061;
    static int[] anIntArray6062 = new int[3];
    static int anInt6063;
    static int anInt6064;
    static int anInt6065;
    static Class318_Sub1[] aClass318_Sub1Array6066;
    static int anInt6067;
    static int anInt6068;
    static int anInt6069;

    final int method1710(int i) {
        anInt6065++;
        if (i != 20014) return -81;
        return 1;
    }

    final boolean method1809(int i) {
        anInt6063++;
        if (i < 85) method1813(11, 68);
        return !this.aClass348_Sub51_3136.method3425(-104);
    }

    static final void method1810(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
        if (i_5_ != 8 && i_5_ != 16) {
            Class357 class357 = Class147.aClass357ArrayArrayArray2029[i_4_][i][i_2_];
            if (class357 == null) class357 = new Class357(i_4_);
            if (i_5_ == 1) {
                class357.aShort4401 = (short) i_0_;
                class357.aShort4409 = (short) i_1_;
            } else if (i_5_ == 2) {
                class357.aShort4398 = (short) i_1_;
                class357.aShort4397 = (short) i_0_;
            }
            if (Class50_Sub1.aBoolean5226) Class286_Sub3.method2152(false);
        } else if (i_5_ == 8) {
            int i_12_ = i << Class362.anInt4459;
            int i_13_ = Class270.anInt3465 + i_12_;
            int i_14_ = i_2_ << Class362.anInt4459;
            int i_15_ = Class270.anInt3465 + i_14_;
            int i_16_ = Class348_Sub1_Sub1.aSArray8801[i_4_].method3982((byte) -86, i_2_, i);
            int i_17_ = Class348_Sub1_Sub1.aSArray8801[i_4_].method3982((byte) -86, 1 + i_2_, i - -1);
            Class294.aClass338Array5060[Class348_Sub44.anInt7101++] = new Class338(i_5_, i_4_, i_12_, i_13_, i_13_, i_12_, i_16_, i_17_, -i_1_ + i_17_, -i_1_ + i_16_, i_14_, i_15_, i_15_, i_14_);
        } else {
            int i_6_ = Class270.anInt3465 + (i << Class362.anInt4459);
            int i_7_ = -Class270.anInt3465 + i_6_;
            int i_8_ = i_2_ << Class362.anInt4459;
            int i_9_ = i_8_ + Class270.anInt3465;
            int i_10_ = Class348_Sub1_Sub1.aSArray8801[i_4_].method3982((byte) -86, i_2_, i + 1);
            int i_11_ = Class348_Sub1_Sub1.aSArray8801[i_4_].method3982((byte) -86, 1 + i_2_, i);
            Class294.aClass338Array5060[Class348_Sub44.anInt7101++] = new Class338(i_5_, i_4_, i_6_, i_7_, i_7_, i_6_, i_10_, i_11_, -i_1_ + i_11_, i_10_ - i_1_, i_8_, i_9_, i_9_, i_8_);
        }
        if (i_3_ != -1) method1811(31, null, 115, null);
        anInt6067++;
    }

    static final int method1811(int i, String string, int i_18_, String string_19_) {
        try {
            anInt6060++;
            int i_20_ = string_19_.length();
            int i_21_ = string.length();
            int i_22_ = 0;
            int i_23_ = 0;
            char c = '\0';
            char c_24_ = '\0';
            while_81_:
            do {
                char c_25_;
                char c_26_;
                for (; ; ) {
                    if (-c + i_22_ >= i_20_ && -c_24_ + i_23_ >= i_21_) break while_81_;
                    if (-c + i_22_ >= i_20_) return -1;
                    if (i_21_ <= -c_24_ + i_23_) return 1;
                    if (c != 0) {
                        c_25_ = c;
                        boolean bool = false;
                    } else c_25_ = string_19_.charAt(i_22_++);
                    if (c_24_ != 0) {
                        c_26_ = c_24_;
                        boolean bool = false;
                    } else c_26_ = string.charAt(i_23_++);
                    c = Sprite_Sub2.method990(c_25_, (byte) -39);
                    c_24_ = Sprite_Sub2.method990(c_26_, (byte) -127);
                    c_25_ = Class239_Sub10.method1765(c_25_, i_18_, 105);
                    c_26_ = Class239_Sub10.method1765(c_26_, i_18_, 105);
                    if (c_25_ != c_26_ && (Character.toUpperCase(c_26_) != Character.toUpperCase(c_25_))) {
                        c_25_ = Character.toLowerCase(c_25_);
                        c_26_ = Character.toLowerCase(c_26_);
                        if (c_25_ != c_26_) break;
                    }
                }
                return (Class113.method1056(i_18_, 30316, c_25_) + -Class113.method1056(i_18_, i ^ 0x55ac, c_26_));
            } while (false);
            int i_27_ = Math.min(i_20_, i_21_);
            for (int i_28_ = 0; i_27_ > i_28_; i_28_++) {
                if (i_18_ == 2) {
                    i_23_ = -i_28_ + (i_21_ - 1);
                    i_22_ = i_20_ - (1 - -i_28_);
                } else i_22_ = i_23_ = i_28_;
                char c_29_ = string_19_.charAt(i_22_);
                char c_30_ = string.charAt(i_23_);
                if (c_29_ != c_30_ && (Character.toUpperCase(c_29_) != Character.toUpperCase(c_30_))) {
                    c_29_ = Character.toLowerCase(c_29_);
                    c_30_ = Character.toLowerCase(c_30_);
                    if (c_30_ != c_29_) return (Class113.method1056(i_18_, 30316, c_29_) + -Class113.method1056(i_18_, 30316, c_30_));
                }
            }
            if (i != 9152) method1810(-67, 60, -16, -117, -17, -84, 39);
            int i_31_ = -i_21_ + i_20_;
            if (i_31_ != 0) return i_31_;
            for (int i_32_ = 0; i_27_ > i_32_; i_32_++) {
                char c_33_ = string_19_.charAt(i_32_);
                char c_34_ = string.charAt(i_32_);
                if (c_34_ != c_33_) return (Class113.method1056(i_18_, 30316, c_33_) - Class113.method1056(i_18_, 30316, c_34_));
            }
            return 0;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("vu.F(" + i + ',' + (string != null ? "{...}" : "null") + ',' + i_18_ + ',' + (string_19_ != null ? "{...}" : "null") + ')'));
        }
    }

    final void method1712(int i, int i_35_) {
        this.anInt3138 = i_35_;
        anInt6059++;
        int i_36_ = -103 % ((i - 82) / 35);
    }

    final int method1714(int i, int i_37_) {
        if (i != 3) return 91;
        anInt6064++;
        if (this.aClass348_Sub51_3136.method3425(i ^ ~0x4b)) return 3;
        return 1;
    }

    Class239_Sub21(Class348_Sub51 class348_sub51) {
        super(class348_sub51);
    }

    final void method1716(boolean bool) {
        if (this.aClass348_Sub51_3136.method3425(-112)) this.anInt3138 = 0;
        anInt6057++;
        if (bool != false) aClass318_Sub1Array6066 = null;
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014);
    }

    Class239_Sub21(int i, Class348_Sub51 class348_sub51) {
        super(i, class348_sub51);
    }

    final int method1812(int i) {
        if (i != -32350) anIntArray6062 = null;
        anInt6068++;
        return this.anInt3138;
    }

    static final boolean method1813(int i, int i_38_) {
        anInt6069++;
        if (i != 8806) method1813(-86, 33);
        if (i_38_ == 3 || i_38_ == 4 || i_38_ == 9 || i_38_ == 59 || i_38_ == 1007) return true;
        return i_38_ == 2 || i_38_ == 1001;
    }

    public static void method1814(byte i) {
        aClass318_Sub1Array6066 = null;
        anIntArray6062 = null;
        int i_39_ = 41 % ((i - -32) / 32);
        anIntArray6061 = null;
        aClass114_6058 = null;
    }

    static {
        anIntArray6061 = new int[32];
        aClass114_6058 = new Class114(46, -1);
    }
}
