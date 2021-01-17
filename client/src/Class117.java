/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class117 {
    static int anInt1763;
    private int anInt1764;
    static int anInt1765;
    static Class351 aClass351_1766 = new Class351(74, -1);
    Class356 aClass356_1767;
    static int anInt1768;
    static int anInt1769;
    private Class356 aClass356_1770;
    static int anInt1771;
    static int anInt1772;
    static int anInt1773;
    private String aString1774 = "null";
    static int anInt1775;
    static int anInt1776;
    static int anInt1777;
    char aChar1778;
    char aChar1779;
    static int anInt1780 = 0;

    public static void method1064(int i) {
        if (i != -3) aClass351_1766 = null;
        aClass351_1766 = null;
    }

    private final void method1065(Class348_Sub49 class348_sub49, int i, int i_0_) {
        if (i_0_ == 1) this.aChar1778 = Class50_Sub1.method462(class348_sub49.method3388(-91), -128);
        else if (i_0_ == 2) this.aChar1779 = Class50_Sub1.method462(class348_sub49.method3388(-119), -128);
        else if (i_0_ == 3) aString1774 = class348_sub49.method3377((byte) 86);
        else if (i_0_ == 4) anInt1764 = class348_sub49.readInt((byte) -126);
        else if (i_0_ == 5 || i_0_ == 6) {
            int i_1_ = class348_sub49.readShort(i ^ ~0x3235ab57);
            this.aClass356_1767 = new Class356(Class33.method340(i_1_, (byte) 108));
            for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
                int i_3_ = class348_sub49.readInt((byte) -126);
                Class348 class348;
                if (i_0_ != 5) class348 = new Class348_Sub35(class348_sub49.readInt((byte) -126));
                else class348 = new Class348_Sub50(class348_sub49.method3377((byte) -35));
                this.aClass356_1767.method3483((byte) 21, i_3_, class348);
            }
        }
        anInt1765++;
        if (i != -21424) method1068((byte) -15);
    }

    final boolean method1066(boolean bool, String string) {
        anInt1776++;
        if (this.aClass356_1767 == null) return false;
        if (bool != false) aClass356_1770 = null;
        if (aClass356_1770 == null) method1071(true);
        for (Class348_Sub46 class348_sub46 = ((Class348_Sub46) aClass356_1770.method3480(Class287.method2179(string, (byte) 109), -6008)); class348_sub46 != null; class348_sub46 = (Class348_Sub46) aClass356_1770.method3476(true)) {
            if (class348_sub46.aString7111.equals(string)) return true;
        }
        return false;
    }

    final boolean method1067(boolean bool, int i) {
        anInt1773++;
        if (this.aClass356_1767 == null) return false;
        if (bool != true) return true;
        if (aClass356_1770 == null) method1068((byte) 120);
        Class348_Sub35 class348_sub35 = (Class348_Sub35) aClass356_1770.method3480(i, -6008);
        return class348_sub35 != null;
    }

    private final void method1068(byte i) {
        anInt1772++;
        aClass356_1770 = new Class356(this.aClass356_1767.method3475(true));
        for (Class348_Sub35 class348_sub35 = ((Class348_Sub35) this.aClass356_1767.method3484(0)); class348_sub35 != null; class348_sub35 = (Class348_Sub35) this.aClass356_1767.method3482(0)) {
            Class348_Sub35 class348_sub35_4_ = new Class348_Sub35((int) class348_sub35.aLong4291);
            aClass356_1770.method3483((byte) 26, class348_sub35.anInt6976, class348_sub35_4_);
        }
        if (i < 85) method1069(111, null);
    }

    final void method1069(int i, Class348_Sub49 class348_sub49) {
        anInt1763++;
        for (; ; ) {
            int i_5_ = class348_sub49.readUnsignedByte(i + 255);
            if (i_5_ == 0) break;
            method1065(class348_sub49, i + -21424, i_5_);
        }
        if (i != 0) aString1774 = null;
    }

    static final void method1070(byte i, int i_6_) {
        if (i < 109) anInt1780 = 10;
        anInt1769++;
        if (Class348_Sub49_Sub2.anIntArray9757 == null || Class348_Sub49_Sub2.anIntArray9757.length < i_6_) Class348_Sub49_Sub2.anIntArray9757 = new int[i_6_];
    }

    private final void method1071(boolean bool) {
        aClass356_1770 = new Class356(this.aClass356_1767.method3475(bool));
        anInt1768++;
        for (Class348_Sub50 class348_sub50 = ((Class348_Sub50) this.aClass356_1767.method3484(0)); class348_sub50 != null; class348_sub50 = (Class348_Sub50) this.aClass356_1767.method3482(0)) {
            Class348_Sub46 class348_sub46 = new Class348_Sub46((class348_sub50.aString7211), (int) (class348_sub50.aLong4291));
            aClass356_1770.method3483((byte) 102, Class287.method2179((class348_sub50.aString7211), (byte) 120), class348_sub46);
        }
    }

    static final void method1072(Class45 class45, byte i) {
        if (i >= -91) method1070((byte) -93, 92);
        Class239_Sub12.aClass45_5964 = class45;
        anInt1771++;
    }

    final int method1073(boolean bool, int i) {
        if (bool != false) method1067(false, -31);
        anInt1775++;
        if (this.aClass356_1767 == null) return anInt1764;
        Class348_Sub35 class348_sub35 = ((Class348_Sub35) this.aClass356_1767.method3480(i, -6008));
        if (class348_sub35 == null) return anInt1764;
        return class348_sub35.anInt6976;
    }

    public Class117() {
        /* empty */
    }

    final String method1074(int i, int i_7_) {
        anInt1777++;
        if (i_7_ <= 60) return null;
        if (this.aClass356_1767 == null) return aString1774;
        Class348_Sub50 class348_sub50 = ((Class348_Sub50) this.aClass356_1767.method3480(i, -6008));
        if (class348_sub50 == null) return aString1774;
        return class348_sub50.aString7211;
    }
}
