/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48 {
    int anInt847;
    static int anInt848;
    static int anInt849;
    static int anInt850;
    static short aShort851;
    static char[] aCharArray852 = {'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    int anInt853;
    int anInt854;
    static int anInt855;
    int anInt856;
    int anInt857 = 128;
    int anInt858;
    static int anInt859;
    static int[] anIntArray860;

    public static void method448(byte i) {
        aCharArray852 = null;
        anIntArray860 = null;
        int i_0_ = -50 % ((37 - i) / 40);
    }

    static final void method449(String string, String string_1_, boolean bool, int i, boolean bool_2_) {
        do {
            try {
                anInt849++;
                Class348_Sub47 class348_sub47 = Class203.createPacket(true);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(bool, Class178.aClass29_2348.anInt400);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, 0);
                int i_3_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, 634);
                int[] is = Class50_Sub1.method463(class348_sub47, false);
                int i_4_ = (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string_1_);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, Class202.anInt2670);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeLong(Class244.aLong4615, (byte) 104);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(bool, Class348_Sub33.anInt6967);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(bool, (Class348_Sub42_Sub8_Sub2.aGame_10434.anInt2987));
                s_Sub2.method4002((class348_sub47.aClass348_Sub49_Sub2_7116), (byte) 55);
                String string_5_ = Class14_Sub1.aString8605;
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, string_5_ == null ? 0 : 1);
                if (string_5_ != null) class348_sub47.aClass348_Sub49_Sub2_7116.writeString((byte) -5, string_5_);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, i);
                class348_sub47.aClass348_Sub49_Sub2_7116.writeByte(false, !bool_2_ ? 0 : 1);
                class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197 += 7;
                class348_sub47.aClass348_Sub49_Sub2_7116.method3350(i_4_, true, is, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197));
                class348_sub47.aClass348_Sub49_Sub2_7116.method3383(1809639944, (class348_sub47.aClass348_Sub49_Sub2_7116.anInt7197 + -i_3_));
                Class348_Sub42_Sub14.writePacket(2, class348_sub47);
                Class352.anInt4337 = -3;
                Class367_Sub2.anInt7297 = 1;
                Class169.anInt2264 = 0;
                Class105_Sub1.anInt8398 = 0;
                if (i >= 13) break;
                Class330.aBoolean4127 = true;
                Class286_Sub8.method2172(60);
            } catch (RuntimeException runtimeexception) {
                throw Class348_Sub17.method2929(runtimeexception, ("iq.D(" + (string != null ? "{...}" : "null") + ',' + (string_1_ != null ? "{...}" : "null") + ',' + bool + ',' + i + ',' + bool_2_ + ')'));
            }
            break;
        } while (false);
    }

    static final int method450(int i, String string, int i_6_) {
        if (i != -20188) return 88;
        anInt850++;
        return Class239_Sub26.method1836(-123, i_6_, true, string);
    }

    final void method451(Class48 class48_7_, byte i) {
        this.anInt857 = class48_7_.anInt857;
        this.anInt858 = class48_7_.anInt858;
        this.anInt856 = class48_7_.anInt856;
        this.anInt854 = class48_7_.anInt854;
        anInt855++;
        this.anInt847 = class48_7_.anInt847;
        this.anInt853 = class48_7_.anInt853;
        if (i != -110) method448((byte) -93);
    }

    final Class48 method452(boolean bool) {
        anInt848++;
        if (bool != true) method448((byte) -81);
        return new Class48(this.anInt858, this.anInt856, this.anInt857, this.anInt854, this.anInt847, this.anInt853);
    }

    Class48(int i) {
        this.anInt856 = 128;
        this.anInt858 = i;
    }

    private Class48(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
        this.anInt856 = 128;
        this.anInt847 = i_11_;
        this.anInt854 = i_10_;
        this.anInt853 = i_12_;
        this.anInt858 = i;
        this.anInt856 = i_8_;
        this.anInt857 = i_9_;
    }

    static {
        aShort851 = (short) 32767;
        anInt859 = -1;
        anIntArray860 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
    }
}
