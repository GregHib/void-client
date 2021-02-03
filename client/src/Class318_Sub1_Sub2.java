/* Class318_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class318_Sub1_Sub2 extends Class318_Sub1 {
    static int anInt8729;
    static int anInt8730;
    static int anInt8731;
    static Class60 aClass60_8732 = new Class60(64);
    static int anInt8733;
    static int anInt8734;
    static int anInt8735;
    static int anInt8736;
    static Class70 aClass70_8737 = new Class70();
    static int anInt8738;

    static final void method2405(int i) {
        anInt8729++;
        Class234 class234 = null;
        try {
            class234 = Class297.method2231("2", -1141472112);
            Class348_Sub49 class348_sub49 = new Class348_Sub49(3 + 6 * Class335.anInt4168);
            class348_sub49.writeByte(false, 1);
            class348_sub49.writeShort((byte) 107, Class335.anInt4168);
            int i_0_ = -4 % ((-12 - i) / 38);
            for (int i_1_ = 0; (i_1_ < Class77.anIntArray1303.length); i_1_++) {
                if (Class286_Sub6.aBooleanArray6270[i_1_]) {
                    class348_sub49.writeShort((byte) 107, i_1_);
                    class348_sub49.writeInt((byte) 124, Class77.anIntArray1303[i_1_]);
                }
            }
            class234.method1658((byte) 117, 0, class348_sub49.anInt7197, (class348_sub49.aByteArray7154));
        } catch (Exception exception) {
            /* empty */
        }
        try {
            if (class234 != null) class234.method1657(false);
        } catch (Exception exception) {
            /* empty */
        }
        Class34.aLong482 = Class62.method599(-117);
        Class184.aBoolean2469 = false;
    }

    final boolean method2382(byte i) {
        if (i > -51) return false;
        anInt8733++;
        Class148 class148 = Class195.method1449(this.aByte6381, (this.anInt6377 >> Class362.anInt4459), (this.anInt6388 >> Class362.anInt4459));
        if (class148 == null || !class148.aClass318_Sub1_Sub3_2040.aBoolean8741) return aa_Sub2.method164(this.aByte6381, (this.anInt6377 >> Class362.anInt4459), (byte) -97, (this.anInt6388 >> Class362.anInt4459));
        return (Class125.method1110(this.anInt6388 >> Class362.anInt4459, class148.aClass318_Sub1_Sub3_2040.method2394(true) + this.method2394(true), this.aByte6381, (byte) -79, this.anInt6377 >> Class362.anInt4459));
    }

    final boolean method2378(int i) {
        if (i != 0) method2406(79);
        anInt8734++;
        return (Class99.aBooleanArrayArray1572[(Class318_Sub1_Sub4_Sub1.anInt10084 + -Class239_Sub25.anInt6111 + (this.anInt6377 >> Class362.anInt4459))][(Class318_Sub1_Sub4_Sub1.anInt10084 + (-Class285_Sub2.anInt8502 + (this.anInt6388 >> Class362.anInt4459)))]);
    }

    final void method2392(boolean bool) {
        if (bool != true) anInt8731 = 119;
        anInt8730++;
        throw new IllegalStateException();
    }

    public static void method2406(int i) {
        if (i > -126) anInt8731 = 118;
        aClass60_8732 = null;
        aClass70_8737 = null;
    }

    final int method2384(Class348_Sub1[] class348_sub1s, int i) {
        anInt8735++;
        int i_2_ = -79 % ((-14 - i) / 61);
        return this.method2390(class348_sub1s, (this.anInt6377 >> Class362.anInt4459), -2, (this.anInt6388 >> Class362.anInt4459));
    }

    final boolean method2388(int i) {
        if (i > -65) anInt8731 = -84;
        anInt8738++;
        return false;
    }

    final void method2380(ha var_ha, int i, boolean bool, Class318_Sub1 class318_sub1, int i_3_, byte i_4_, int i_5_) {
        try {
            if (i_4_ > -106) method2405(-8);
            anInt8736++;
            throw new IllegalStateException();
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("fha.N(" + (var_ha != null ? "{...}" : "null") + ',' + i + ',' + bool + ',' + (class318_sub1 != null ? "{...}" : "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'));
        }
    }

    Class318_Sub1_Sub2(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
        this.anInt6377 = i;
        this.aByte6381 = (byte) i_8_;
        this.anInt6382 = i_6_;
        this.aByte6376 = (byte) i_9_;
        this.anInt6388 = i_7_;
    }
}
