/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2 {
    static int anInt116;
    static Class141 aClass141_117;
    r aR118;
    Class64 aClass64_119;
    static int anInt120;
    static int anInt121;
    static int anInt122;

    static final Class110_Sub1 method170(boolean bool) {
        if (bool != true) method174(-106, -36);
        anInt122++;
        if (Class348_Sub36.anInt6985 < Class65.aClass110_Sub1Array1146.length) return Class65.aClass110_Sub1Array1146[Class348_Sub36.anInt6985++];
        return null;
    }

    public static void method171(byte i) {
        aClass141_117 = null;
        if (i != 72) method173(39, null, null);
    }

    static final void method172(int i, Index index) {
        if (i != 30284) method170(true);
        anInt116++;
        Class59_Sub2_Sub1.aIndex_8670 = index;
    }

    static final void method173(int i, Class46 class46, Class46 class46_0_) {
        try {
            anInt120++;
            Class348_Sub38.anInt7009++;
            Class348_Sub47 class348_sub47 = Class286_Sub3.method2148(Class239_Sub9.aClass351_5934, Class348_Sub23_Sub2.aClass77_9029, -104);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeInt((byte) 112, class46.anInt830);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeShortLittle(class46_0_.anInt704, (byte) 3);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeIntMiddle(class46_0_.anInt830, (byte) 44);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeShort((byte) 107, class46_0_.anInt812);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeShortAddLittle(4325, class46.anInt704);
            class348_sub47.aClass348_Sub49_Sub2_7116.writeShortAddLittle(4325, class46.anInt812);
            if (i > -50) aClass141_117 = null;
            Class348_Sub42_Sub14.method3243(-100, class348_sub47);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ak.E(" + i + ',' + (class46 != null ? "{...}" : "null") + ',' + (class46_0_ != null ? "{...}" : "null") + ')'));
        }
    }

    static final void method174(int i, int i_1_) {
        if (i_1_ != -30742) aClass141_117 = null;
        anInt121++;
        Class332.aClass60_4139.method578(2, i);
    }

    public Class2() {
        /* empty */
    }
}
