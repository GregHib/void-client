/* Class348_Sub42_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub17 extends Class348_Sub42 {
    private int anInt9669;
    static int anInt9670;
    private byte[][] aByteArrayArray9671;
    static Class348_Sub42_Sub17[] aClass348_Sub42_Sub17Array9672 = new Class348_Sub42_Sub17[14];
    Class4[] aClass4Array9673;
    static int anInt9674;
    static int anInt9675;
    static int anInt9676;
    static int anInt9677;
    static int[][] anIntArrayArray9678;
    static Class351 aClass351_9679 = new Class351(27, 7);
    static int anInt9680;

    static final int method3266(ha var_ha, int i, Class277 class277) {
        try {
            anInt9674++;
            if ((((Class277) class277).anInt3569 ^ 0xffffffff) == 0) {
                if (((Class277) class277).anInt3575 != -1) {
                    Class12 class12 = ((ha) var_ha).aD4579.method3(
                            ((Class277) class277).anInt3575, -6662);
                    if (!((Class12) class12).aBoolean209)
                        return ((Class12) class12).aShort208;
                }
            } else
                return ((Class277) class277).anInt3569;
            if (i <= 123)
                return -68;
            return ((Class277) class277).anInt3563;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("gw.F("
                    + (var_ha != null ? "{...}" : "null") + ',' + i + ','
                    + (class277 != null ? "{...}" : "null") + ')'));
        }
    }

    final boolean method3267(byte i, int i_0_) {
        anInt9676++;
        if (i >= -91)
            return false;
        return (((Class4) ((Class348_Sub42_Sub17) this).aClass4Array9673[i_0_]).aBoolean129);
    }

    final boolean method3268(int i) {
        anInt9675++;
        if (((Class348_Sub42_Sub17) this).aClass4Array9673 != null)
            return true;
        if (aByteArrayArray9671 == null) {
            synchronized (Class138.aClass45_1940) {
                if (!Class138.aClass45_1940.method408((byte) -116, anInt9669))
                    return false;
                int[] is = Class138.aClass45_1940.method396(anInt9669, 0);
                aByteArrayArray9671 = new byte[is.length][];
                for (int i_1_ = 0; (is.length ^ 0xffffffff) < (i_1_ ^ 0xffffffff); i_1_++)
                    aByteArrayArray9671[i_1_] = Class138.aClass45_1940
                            .method410(-1860, anInt9669, is[i_1_]);
            }
        }
        boolean bool = true;
        for (int i_2_ = 0; i_2_ < aByteArrayArray9671.length; i_2_++) {
            byte[] is = aByteArrayArray9671[i_2_];
            Class348_Sub49 class348_sub49 = new Class348_Sub49(is);
            ((Class348_Sub49) class348_sub49).anInt7197 = 1;
            int i_3_ = class348_sub49.method3330(842397944);
            synchronized (Class135_Sub2.aClass45_4843) {
                bool &= Class135_Sub2.aClass45_4843.method421(false, i_3_);
            }
        }
        if (!bool)
            return false;
        Class262 class262 = new Class262();
        int[] is;
        synchronized (Class138.aClass45_1940) {
            int i_4_ = Class138.aClass45_1940.method407(0, anInt9669);
            ((Class348_Sub42_Sub17) this).aClass4Array9673 = new Class4[i_4_];
            is = Class138.aClass45_1940.method396(anInt9669, 0);
            if (i > -115)
                method3266(null, 123, null);
        }
        for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
            byte[] is_6_ = aByteArrayArray9671[i_5_];
            Class348_Sub49 class348_sub49 = new Class348_Sub49(is_6_);
            ((Class348_Sub49) class348_sub49).anInt7197 = 1;
            int i_7_ = class348_sub49.method3330(842397944);//
            Class348_Sub33 class348_sub33 = null;
            for (Class348_Sub33 class348_sub33_8_ = (Class348_Sub33) class262
                    .method1995(4); class348_sub33_8_ != null; class348_sub33_8_ = (Class348_Sub33) class262
                    .method1990((byte) 78)) {
                if (((Class348_Sub33) class348_sub33_8_).anInt6958 == i_7_) {
                    class348_sub33 = class348_sub33_8_;
                    break;
                }
            }
            if (class348_sub33 == null) {
                synchronized (Class135_Sub2.aClass45_4843) {
                    class348_sub33 = new Class348_Sub33(i_7_,
                            Class135_Sub2.aClass45_4843.method415((byte) 73,
                                    i_7_));
                }
                class262.method1999(class348_sub33, -20180);
            }
            ((Class348_Sub42_Sub17) this).aClass4Array9673[is[i_5_]] = new Class4(
                    is_6_, class348_sub33);
        }
        aByteArrayArray9671 = null;
        return true;
    }

    public static void method3269(boolean bool) {
        aClass348_Sub42_Sub17Array9672 = null;
        aClass351_9679 = null;
        anIntArrayArray9678 = null;
        if (bool != true)
            method3270((byte) -116);
    }

    static final void method3270(byte i) {
        if (i <= 106)
            method3266(null, -91, null);
        for (Class348_Sub42_Sub12 class348_sub42_sub12 = ((Class348_Sub42_Sub12) Class348_Sub40_Sub4.aClass262_9111
                .method1995(4)); class348_sub42_sub12 != null; class348_sub42_sub12 = (Class348_Sub42_Sub12) Class348_Sub40_Sub4.aClass262_9111
                .method1990((byte) 115)) {
            if (Class239_Sub17.method1796(69,
                    ((Class348_Sub42_Sub12) class348_sub42_sub12).anInt9608))
                Class5_Sub3.method202(6, class348_sub42_sub12);
        }
        anInt9680++;
    }

    Class348_Sub42_Sub17(int i) {
        anInt9669 = i;
    }

    final boolean method3271(int i, int i_9_) {
        anInt9670++;
        if (i_9_ != 14)
            method3269(false);
        return (((Class4) ((Class348_Sub42_Sub17) this).aClass4Array9673[i]).aBoolean139);
    }

    final boolean method3272(int i, int i_10_) {
        anInt9677++;
        if (i_10_ != 0)
            return true;
        return (((Class4) ((Class348_Sub42_Sub17) this).aClass4Array9673[i]).aBoolean131);
    }
}
