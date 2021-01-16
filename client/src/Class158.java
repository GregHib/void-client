/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.File;
import java.lang.reflect.Method;

final class Class158 implements Interface12 {
    int anInt4931;
    int anInt4932;
    static int anInt4933;
    static Class356 aClass356_4934 = new Class356(8);
    int anInt4935;
    int anInt4936;
    int anInt4937;
    static Class299 aClass299_4938;
    static int anInt4939;
    int anInt4940;
    static int anInt4941;
    String aString4942;
    int anInt4943;
    int anInt4944;
    Class341 aClass341_4945;
    int anInt4946;
    int anInt4947;
    Class221 aClass221_4948;
    /*synthetic*/ static Class aClass4949;

    static final void method1247(File file, boolean bool, boolean bool_0_) {
        if (Class168.anObject2256 == null) Class133.method1142((byte) 26);
        anInt4939++;
        if (bool_0_ != false) aClass299_4938 = null;
        try {
            Class var_class = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method method = (var_class.getDeclaredMethod("dumpHeap", (aClass4949 != null ? aClass4949 : (aClass4949 = method1250("java.lang.String"))), Boolean.TYPE));
            method.invoke(Class168.anObject2256, file.getAbsolutePath(), new Boolean(bool));
        } catch (Exception exception) {
            System.out.println("HeapDump error:");
            exception.printStackTrace();
        }
    }

    public final Class223 method51(byte i) {
        anInt4941++;
        if (i <= 116) aClass299_4938 = null;
        return Class174.aClass223_2307;
    }

    static final Class221[] method1248(int i) {
        anInt4933++;
        if (i < 11) aClass299_4938 = null;
        return (new Class221[]{Class5_Sub1.aClass221_8344, Class104.aClass221_1620, Class223.aClass221_2893});
    }

    public static void method1249(boolean bool) {
        if (bool != true) method1248(-21);
        aClass356_4934 = null;
        aClass299_4938 = null;
    }

    Class158(String string, Class221 class221, Class341 class341, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
        try {
            this.anInt4946 = i_3_;
            this.anInt4932 = i_1_;
            this.anInt4943 = i_2_;
            this.anInt4944 = i_7_;
            this.aString4942 = string;
            this.aClass221_4948 = class221;
            this.anInt4931 = i_5_;
            this.anInt4940 = i_9_;
            this.anInt4947 = i;
            this.aClass341_4945 = class341;
            this.anInt4936 = i_6_;
            this.anInt4935 = i_8_;
            this.anInt4937 = i_4_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ot.<init>(" + (string != null ? "{...}" : "null") + ',' + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
        }
    }

    /*synthetic*/
    static Class method1250(String string) {
        try {
            return Class.forName(string);
        } catch (ClassNotFoundException classnotfoundexception) {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }
}
