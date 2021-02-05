/* Class228 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class Class228 {
    static int anInt2971;
    static Class114 aClass114_2972 = new Class114(49, 4);
    static int anInt2973;
    static Class57[] aClass57Array2974;
    static int anInt2975;

    public static void method1628(byte i) {
        aClass57Array2974 = null;
        if (i <= 47) aClass57Array2974 = null;
        aClass114_2972 = null;
    }

    static final boolean method1629(boolean bool) {
        anInt2973++;
        Hashtable hashtable = new Hashtable();
        Enumeration enumeration = Player.aHashtable10565.keys();
        while (enumeration.hasMoreElements()) {
            Object object = enumeration.nextElement();
            hashtable.put(object, Player.aHashtable10565.get(object));
        }
        try {
            Field field = ClassLoader.class.getDeclaredField("nativeLibraries");
            if (bool != true) return false;
            field.setAccessible(true);
            try {
                enumeration = Player.aHashtable10565.keys();
                while (enumeration.hasMoreElements()) {
                    String string = (String) enumeration.nextElement();
                    try {
                        File file = (File) Class275.aHashtable3548.get(string);
                        Class var_class_1_ = (Class) Player.aHashtable10565.get(string);
                        Vector vector = ((Vector) field.get(var_class_1_.getClassLoader()));
                        for (int i = 0; i < vector.size(); i++) {
                            try {
                                Object object = vector.elementAt(i);
                                Field field_2_ = object.getClass().getDeclaredField("name");
                                field_2_.setAccessible(true);
                                try {
                                    String string_3_ = (String) field_2_.get(object);
                                    if (string_3_ != null && (string_3_.equalsIgnoreCase(file.getCanonicalPath()))) {
                                        Field field_4_ = object.getClass().getDeclaredField("handle");
                                        Method method_5_ = (object.getClass().getDeclaredMethod("finalize"));
                                        field_4_.setAccessible(true);
                                        method_5_.setAccessible(true);
                                        try {
                                            method_5_.invoke(object);
                                            field_4_.set(object, new Integer(0));
                                            hashtable.remove(string);
                                        } catch (Throwable throwable) {
                                            if (Loader.trace) {
                                                throwable.printStackTrace();
                                            }
                                            /* empty */
                                        }
                                        method_5_.setAccessible(false);
                                        field_4_.setAccessible(false);
                                    }
                                } catch (Throwable throwable) {
                                    if (Loader.trace) {
                                        throwable.printStackTrace();
                                    }
                                    /* empty */
                                }
                                field_2_.setAccessible(false);
                            } catch (Throwable throwable) {
                                if (Loader.trace) {
                                    throwable.printStackTrace();
                                }
                                /* empty */
                            }
                        }
                    } catch (Throwable throwable) {
                        if (Loader.trace) {
                            throwable.printStackTrace();
                        }
                        /* empty */
                    }
                }
            } catch (Throwable throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace();
                }
                /* empty */
            }
            field.setAccessible(false);
        } catch (Throwable throwable) {
            if (Loader.trace) {
                throwable.printStackTrace();
            }
            /* empty */
        }
        Player.aHashtable10565 = hashtable;
        return Player.aHashtable10565.isEmpty();
    }

    static final void method1630(int i, int i_6_, int i_7_) {
        if (Class75.aFloat1249 > Class75.aFloat1247) {
            Class75.aFloat1247 += (double) Class75.aFloat1247 / 30.0;
            if (Class75.aFloat1249 < Class75.aFloat1247) Class75.aFloat1247 = Class75.aFloat1249;
            Class348_Sub15.method2811(false);
            Class75.anInt1255 = (int) Class75.aFloat1247 >> 1;
            Class75.aByteArrayArrayArray1251 = Class325.method2596(Class75.anInt1255, 12871);
        } else if (Class75.aFloat1247 > Class75.aFloat1249) {
            Class75.aFloat1247 -= (double) Class75.aFloat1247 / 30.0;
            if (Class75.aFloat1249 > Class75.aFloat1247) Class75.aFloat1247 = Class75.aFloat1249;
            Class348_Sub15.method2811(false);
            Class75.anInt1255 = (int) Class75.aFloat1247 >> 1;
            Class75.aByteArrayArrayArray1251 = Class325.method2596(Class75.anInt1255, i + 12871);
        }
        anInt2971++;
        if (i != (~Class244.anInt4609) && Class48.anInt859 != -1) {
            int i_8_ = Class244.anInt4609 - Class348_Sub36.anInt6992;
            if (i_8_ < 2 || i_8_ > 2) i_8_ /= 8;
            int i_9_ = -Class245.anInt3170 + Class48.anInt859;
            Class348_Sub36.anInt6992 = i_8_ + Class348_Sub36.anInt6992;
            if (i_9_ < 2 || i_9_ > 2) i_9_ /= 8;
            Class245.anInt3170 -= -i_9_;
            if (i_8_ == 0 && i_9_ == 0) {
                Class244.anInt4609 = -1;
                Class48.anInt859 = -1;
            }
            Class348_Sub15.method2811(false);
        }
        if (Class367_Sub9.anInt7379 > 0) {
            Class164.anInt2173--;
            if (Class164.anInt2173 == 0) {
                Class367_Sub9.anInt7379--;
                Class164.anInt2173 = 100;
            }
        } else {
            Class34.anInt481 = -1;
            Class348_Sub40_Sub30.anInt9399 = -1;
        }
        if (Class246.aBoolean3174 && Class289.aClass262_3705 != null) {
            for (Class348_Sub12 class348_sub12 = (Class348_Sub12) Class289.aClass262_3705.method1995(4); class348_sub12 != null; class348_sub12 = ((Class348_Sub12) Class289.aClass262_3705.method1990((byte) 116))) {
                Class42 class42 = (Class75.aClass153_1238.method1225(class348_sub12.aClass348_Sub21_6751.anInt6847, (byte) 125));
                if (class348_sub12.method2799(i_6_, i_7_, 95)) {
                    if (class42.aStringArray577 != null) {
                        if (class42.aStringArray577[4] != null) Class50_Sub3.method466(false, class42.aString565, 0, (byte) -100, false, class42.anInt596, -1, true, 1006, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[4], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                        if (class42.aStringArray577[3] != null) Class50_Sub3.method466(false, class42.aString565, 0, (byte) -127, false, class42.anInt596, -1, true, 1003, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[3], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                        if (class42.aStringArray577[2] != null) Class50_Sub3.method466(false, class42.aString565, 0, (byte) -108, false, class42.anInt596, -1, true, 1002, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[2], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                        if (class42.aStringArray577[1] != null) Class50_Sub3.method466(false, class42.aString565, 0, (byte) -69, false, class42.anInt596, -1, true, 1012, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[1], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                        if (class42.aStringArray577[0] != null) Class50_Sub3.method466(false, class42.aString565, 0, (byte) -92, false, class42.anInt596, -1, true, 1009, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.aStringArray577[0], class348_sub12.aClass348_Sub21_6751.anInt6847, -1);
                    }
                    if (!class348_sub12.aClass348_Sub21_6751.aBoolean6848) {
                        class348_sub12.aClass348_Sub21_6751.aBoolean6848 = true;
                        Class66.method701(Class90.aClass273_1512, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.anInt596);
                    }
                    if (class348_sub12.aClass348_Sub21_6751.aBoolean6848) Class66.method701(Class59_Sub1_Sub2.aClass273_8664, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.anInt596);
                } else if (class348_sub12.aClass348_Sub21_6751.aBoolean6848) {
                    class348_sub12.aClass348_Sub21_6751.aBoolean6848 = false;
                    Class66.method701(Class77.aClass273_1298, class348_sub12.aClass348_Sub21_6751.anInt6847, class42.anInt596);
                }
            }
        }
    }
}
