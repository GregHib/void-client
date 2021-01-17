/* Class307 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class307 {
    static int anInt3877;
    static int anInt3878;

    static final Class252 method2300(Class45 class45, String string, boolean bool, byte i) {
        try {
            anInt3877++;
            int i_0_ = class45.method417(string, 0);
            if (i != -91) return null;
            if (i_0_ == -1) return new Class252(0);
            int[] is = class45.method396(i_0_, i ^ ~0x5a);
            Class252 class252 = new Class252(is.length);
            int i_1_ = 0;
            int i_2_ = 0;
            while (i_1_ < class252.anInt3241) {
                Class348_Sub49 class348_sub49 = new Class348_Sub49(class45.method410(-1860, i_0_, is[i_2_++]));
                int i_3_ = class348_sub49.readInt((byte) -126);
                int i_4_ = class348_sub49.readShort(i ^ ~0x3235f8a2);
                int i_5_ = class348_sub49.readUnsignedByte(255);
                if (!bool && i_5_ == 1) class252.anInt3241--;
                else {
                    class252.anIntArray3238[i_1_] = i_3_;
                    class252.anIntArray3239[i_1_] = i_4_;
                    i_1_++;
                }
            }
            return class252;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("wt.A(" + (class45 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + bool + ',' + i + ')'));
        }
    }

    static final int method2301(byte i, int i_6_, boolean bool) {
        anInt3878++;
        if (bool) return 0;
        Class348_Sub13 class348_sub13 = Class258_Sub4.method1974((byte) -9, i_6_, bool);
        if (class348_sub13 == null) return (Class127_Sub1.aClass271_8378.method2044(109, i_6_).anInt9542);
        int i_7_ = 0;
        for (int i_8_ = 0; (i_8_ < class348_sub13.anIntArray6757.length); i_8_++) {
            if (class348_sub13.anIntArray6757[i_8_] == -1) i_7_++;
        }
        if (i != 35) method2301((byte) -102, 43, true);
        i_7_ += (Class127_Sub1.aClass271_8378.method2044(82, i_6_).anInt9542 + -class348_sub13.anIntArray6757.length);
        return i_7_;
    }
}
