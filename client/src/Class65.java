/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class65 {
    static int anInt1138;
    static int anInt1139;
    static int anInt1140;
    private final Index aIndex_1141;
    static int anInt1142;
    static int anInt1143;
    static Class351 aClass351_1144;
    private final Class60 aClass60_1145 = new Class60(256);
    static Class110_Sub1[] aClass110_Sub1Array1146 = new Class110_Sub1[0];
    static int anInt1147;
    static Class357[][][] aClass357ArrayArrayArray1148;

    final void method694(int i) {
        anInt1140++;
        if (i != -1007) method700(14, 98);
        synchronized (aClass60_1145) {
            aClass60_1145.method587(i + 883);
        }
    }

    final void method695(boolean bool) {
        if (bool != true) aClass351_1144 = null;
        synchronized (aClass60_1145) {
            aClass60_1145.method590(0);
        }
        anInt1139++;
    }

    static final void method696(int i, int i_0_, int i_1_, int i_2_) {
        if (i_2_ == -1007) {
            if (i == 1009) Class66.method701(Class327.aClass273_4091, i_1_, i_0_);
            else if (i != 1012) {
                if (i == 1002) Class66.method701(Class348_Sub40_Sub32.aClass273_9415, i_1_, i_0_);
                else if (i == 1003) Class66.method701(Class348_Sub12.aClass273_6743, i_1_, i_0_);
                else if (i == 1006) Class66.method701(Class239_Sub17.aClass273_6018, i_1_, i_0_);
            } else Class66.method701(Class5_Sub2.aClass273_8356, i_1_, i_0_);
            anInt1138++;
        }
    }

    final void method697(int i, int i_3_) {
        if (i_3_ == 26) {
            anInt1142++;
            synchronized (aClass60_1145) {
                aClass60_1145.method578(i_3_ ^ 0x18, i);
            }
        }
    }

    public static void method698(int i) {
        aClass351_1144 = null;
        if (i != 2) aClass357ArrayArrayArray1148 = null;
        aClass357ArrayArrayArray1148 = null;
        aClass110_Sub1Array1146 = null;
    }

    static final void method699(Index index, byte i, Index index_4_, Index index_5_, Index index_6_) {
        try {
            Class348_Sub40_Sub28.aIndex_9365 = index_6_;
            anInt1147++;
            Class318_Sub1_Sub3.aIndex_8755 = index_5_;
            Class229.aIndex_2978 = index_4_;
            Class348_Sub40_Sub33.aClass46ArrayArray9427 = new Class46[Class229.aIndex_2978.method414(-1)][];
            Class163.aBooleanArray2162 = new boolean[Class229.aIndex_2978.method414(-1)];
            int i_7_ = -72 % ((35 - i) / 41);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("kb.F(" + (index != null ? "{...}" : "null") + ',' + i + ',' + (index_4_ != null ? "{...}" : "null") + ',' + (index_5_ != null ? "{...}" : "null") + ',' + (index_6_ != null ? "{...}" : "null") + ')'));
        }
    }

    final Class348_Sub42_Sub1 method700(int i, int i_8_) {
        anInt1143++;
        int i_9_ = -128 / ((-3 - i_8_) / 49);
        Class348_Sub42_Sub1 class348_sub42_sub1;
        synchronized (aClass60_1145) {
            class348_sub42_sub1 = (Class348_Sub42_Sub1) aClass60_1145.method583(i, -101);
        }
        if (class348_sub42_sub1 != null) return class348_sub42_sub1;
        byte[] is;
        synchronized (aIndex_1141) {
            is = aIndex_1141.method410(-1860, 26, i);
        }
        class348_sub42_sub1 = new Class348_Sub42_Sub1();
        if (is != null) class348_sub42_sub1.method3168(new Class348_Sub49(is), (byte) -101);
        synchronized (aClass60_1145) {
            aClass60_1145.method582(class348_sub42_sub1, i, (byte) -114);
        }
        return class348_sub42_sub1;
    }

    Class65(Class230 class230, int i, Index index) {
        try {
            aIndex_1141 = index;
            aIndex_1141.method407(0, 26);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("kb.<init>(" + (class230 != null ? "{...}" : "null") + ',' + i + ',' + (index != null ? "{...}" : "null") + ')'));
        }
    }

    static {
        aClass351_1144 = new Class351(37, 2);
    }
}
