/* ShaderCompilerSub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class ShaderCompilerSub2
/**
 * RENAMED from `Class328_Sub2` (JODE-obfuscated).
 * Evidence: subclass of ShaderCompiler (hierarchy)
 */ extends ShaderCompiler {
    static LoadingState[] aClass56Array6515;
    static int anInt6516;
    static NodeCache aClass60_6517 = new NodeCache(4);
    static int anInt6518;

    static final Component247 method2612(Buffer class348_sub49, boolean bool) {
        anInt6518++;
        int i = class348_sub49.readUnsignedShort(842397944);
        if (bool != true) method2613(-27);
        return new Component247(i);
    }

    public static void method2613(int i) {
        aClass56Array6515 = null;
        aClass60_6517 = null;
        if (i != -1) method2613(58);
    }
}
