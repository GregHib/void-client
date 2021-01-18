/* Class348_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.lang.reflect.Method;

final class Class348_Sub6 extends Class348 {
    int anInt6630;
    static int[] anIntArray6631 = new int[13];
    static int anInt6632;
    static int anInt6633;
    static int anInt6634 = -2;
    static int[] anIntArray6635 = new int[4];
    int anInt6636;
    static int anInt6637 = 2;
    static int anInt6638;
    static int anInt6639;
    /*synthetic*/ static Class aClass6640;

    public static void method2768(int i) {
        anIntArray6631 = null;
        anIntArray6635 = null;
        if (i != 3) anInt6634 = 101;
    }

    static final boolean method2769(Class var_class, byte i, String string) {
        try {
            anInt6639++;
            Class var_class_0_ = ((Class) Class318_Sub1_Sub3_Sub3_Sub2.aHashtable10565.get(string));
            if (var_class_0_ != null) {
                return var_class_0_.getClassLoader() == var_class.getClassLoader();
            }
            File file = null;
            if (file == null) file = (File) Class275.aHashtable3548.get(string);
            if (i != 20) anInt6633 = -118;
            if (file != null) {
                try {
                    file = new File(file.getCanonicalPath());
                    Class var_class_1_ = Class.forName("java.lang.Runtime");
                    Class var_class_2_ = Class.forName("java.lang.reflect.AccessibleObject");
                    Method method = var_class_2_.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method method_3_ = (var_class_1_.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String")));
                    method.invoke(method_3_, Boolean.TRUE);

                    // System.out.println(var_class);

                    method_3_.invoke(Runtime.getRuntime(), var_class, file.getPath());
                    method.invoke(method_3_, Boolean.FALSE);
                    Class318_Sub1_Sub3_Sub3_Sub2.aHashtable10565.put(string, var_class);
                    return true;
                } catch (NoSuchMethodException nosuchmethodexception) {
                    nosuchmethodexception.printStackTrace();
                    System.load(file.getPath());
                    Class318_Sub1_Sub3_Sub3_Sub2.aHashtable10565.put(string, (aClass6640 != null ? aClass6640 : (aClass6640 = method2771("Class90"))));
                    return true;
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                    /* empty */
                }
            }
            return false;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("gba.C(" + (var_class != null ? "{...}" : "null") + ',' + i + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    Class348_Sub6(int i, int i_4_) {
        this.anInt6636 = i_4_;
        this.anInt6630 = i;
    }

    static final void method2770(int i) {
        anInt6638++;
        if (Class10.anIntArray179 == null) Class10.anIntArray179 = new int[65536];
        else return;
        double d = 0.7 + (0.03 * Math.random() - 0.015);
        for (int i_5_ = 0; i_5_ < 65536; i_5_++) {
            double d_6_ = 0.0078125 + (double) ((0xfebd & i_5_) >> 10) / 64.0;
            double d_7_ = (double) ((0x384 & i_5_) >> 7) / 8.0 + 0.0625;
            double d_8_ = (double) (i_5_ & 0x7f) / 128.0;
            double d_9_ = d_8_;
            double d_10_ = d_8_;
            double d_11_ = d_8_;
            if (d_7_ != 0.0) {
                double d_12_;
                if (d_8_ < 0.5) d_12_ = d_8_ * (d_7_ + 1.0);
                else d_12_ = -(d_8_ * d_7_) + (d_8_ + d_7_);
                double d_13_ = 2.0 * d_8_ - d_12_;
                double d_14_ = 0.3333333333333333 + d_6_;
                if (d_14_ > 1.0) d_14_--;
                double d_15_ = d_6_;
                double d_16_ = -0.3333333333333333 + d_6_;
                if (d_16_ < 0.0) d_16_++;
                if (6.0 * d_14_ < 1.0) d_9_ = d_13_ + 6.0 * (-d_13_ + d_12_) * d_14_;
                else if (!(2.0 * d_14_ < 1.0)) {
                    if (!(3.0 * d_14_ < 2.0)) d_9_ = d_13_;
                    else d_9_ = 6.0 * ((d_12_ - d_13_) * (-d_14_ + 0.6666666666666666)) + d_13_;
                } else d_9_ = d_12_;
                if (!(6.0 * d_15_ < 1.0)) {
                    if (!(2.0 * d_15_ < 1.0)) {
                        if (!(d_15_ * 3.0 < 2.0)) d_10_ = d_13_;
                        else d_10_ = ((-d_15_ + 0.6666666666666666) * (d_12_ - d_13_) * 6.0) + d_13_;
                    } else d_10_ = d_12_;
                } else d_10_ = d_13_ + d_15_ * (6.0 * (d_12_ - d_13_));
                if (d_16_ * 6.0 < 1.0) d_11_ = d_13_ + (d_12_ - d_13_) * 6.0 * d_16_;
                else if (!(2.0 * d_16_ < 1.0)) {
                    if (3.0 * d_16_ < 2.0) d_11_ = d_13_ + ((-d_13_ + d_12_) * (0.6666666666666666 - d_16_) * 6.0);
                    else d_11_ = d_13_;
                } else d_11_ = d_12_;
            }
            d_9_ = Math.pow(d_9_, d);
            d_10_ = Math.pow(d_10_, d);
            d_11_ = Math.pow(d_11_, d);
            int i_17_ = (int) (d_9_ * 256.0);
            int i_18_ = (int) (d_10_ * 256.0);
            int i_19_ = (int) (d_11_ * 256.0);
            int i_20_ = (i_18_ << 8) + (i_17_ << 16) - -i_19_;
            Class10.anIntArray179[i_5_] = i_20_;
        }
        if (i != 2) anInt6634 = 92;
    }

    /*synthetic*/
    static Class method2771(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    static {
        anInt6633 = 0;
    }
}
