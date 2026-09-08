/* HeapDumpHelper - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class158` (JODE-obfuscated).
 * Heap-dump trigger helper. implements Interface12; dumpHeapToFile(File,boolean,boolean) obtains a HotSpotDiagnosticMXBean and calls dumpHeap (delegating to HeapDumper.ensureHotSpotDiagnostic); logs 'HeapDump error:'.
 */

import com.sun.management.HotSpotDiagnosticMXBean;

import java.io.File;
import java.lang.reflect.Method;

final class HeapDumpHelper implements Interface12 {
    int anInt4931;
    int anInt4932;
    static int anInt4933;
    static LruCache aClass356_4934 = new LruCache(8);
    int anInt4935;
    int anInt4936;
    int anInt4937;
    static Component80 aClass299_4938;
    static int anInt4939;
    int anInt4940;
    static int anInt4941;
    String aString4942;
    int anInt4943;
    int anInt4944;
    DisplayModeManagerContainer196 aClass341_4945;
    int anInt4946;
    int anInt4947;
    Component85 aClass221_4948;
    /*synthetic*/ static Class aClass4949;

    static final void dumpHeapToFile(File file, boolean bool, boolean bool_0_) {
        if (Component39.anObject2256 == null) HeapDumper.ensureHotSpotDiagnostic((byte) 26);
        anInt4939++;
        if (bool_0_ != false) aClass299_4938 = null;
        try {
            Method method = (HotSpotDiagnosticMXBean.class.getDeclaredMethod("dumpHeap", (aClass4949 != null ? aClass4949 : (aClass4949 = String.class)), Boolean.TYPE));
            method.invoke(Component39.anObject2256, file.getAbsolutePath(), new Boolean(bool));
        } catch (Exception exception) {
            System.out.println("HeapDump error:");
            exception.printStackTrace();
        }
    }

    public final DisplayModeManagerContainer369 method51(byte i) {
        anInt4941++;
        if (i <= 116) aClass299_4938 = null;
        return RadixParser.aClass223_2307;
    }

    static final Component85[] method1248(int i) {
        anInt4933++;
        if (i < 11) aClass299_4938 = null;
        return (new Component85[]{Component364.aClass221_8344, Component65.aClass221_1620, DisplayModeManagerContainer369.aClass221_2893});
    }

    public static void method1249(boolean bool) {
        if (bool != true) method1248(-21);
        aClass356_4934 = null;
        aClass299_4938 = null;
    }

    HeapDumpHelper(String string, Component85 class221, DisplayModeManagerContainer196 class341, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
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
            throw NpcDefinition.wrapThrowable(runtimeexception, ("ot.<init>(" + (string != null ? "{...}" : "null") + ',' + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'));
        }
    }

}
