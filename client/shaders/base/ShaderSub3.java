/* ShaderSub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.lang.reflect.Method;

final class ShaderSub3
/**
 * RENAMED from `ShaderSub3` (JODE-obfuscated).
 * Evidence: extends Shader (Shader)
 */ extends Shader {
    static StringCache aClass351_5200 = new StringCache(13, 2);
    int[] anIntArray5201;
    int[] anIntArray5202;
    static int anInt5203;
    static StringCache aClass351_5204 = new StringCache(15, 8);
    static int anInt5205;
    static NodederUtil aClass348_Sub6_5206 = new NodederUtil(0, 0);
    static CacheStore aClass45_5207;
    /*synthetic*/ static Class aClass5208;

    static final boolean method166(byte i, int i_0_, int i_1_) {
        if (i < 5) method166((byte) -119, -93, 73);
        anInt5203++;
        return (i_1_ & 0x800) != 0 && (i_0_ & 0x37) != 0;
    }

    public static void method167(int i) {
        if (i != 19612) method167(-70);
        aClass351_5200 = null;
        aClass351_5204 = null;
        aClass348_Sub6_5206 = null;
        aClass45_5207 = null;
    }

    static final void method168(byte i) {
        do {
            if (!OggUrlStream.aClass297_8992.useDirectDraw) {
                try {
                    try {
                        Runtime runtime = Runtime.getRuntime();
                        Long var_long = runtime.maxMemory();
                        Component127.anInt2964 = 1 + (int) (var_long.longValue() / 1048576L);
                    } catch (Throwable throwable) {
                        /* empty */
                    }
                    break;
                } catch (Exception exception) {
                    break;
                }
            }
            Component127.anInt2964 = 96;
        } while (false);
        int i_2_ = 15 % (i / 51);
        anInt5205++;
    }

    ShaderSub3(int i, int i_3_, int[] is, int[] is_4_) {
        try {
            this.anIntArray5201 = is;
            this.anIntArray5202 = is_4_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("nba.<init>(" + i + ',' + i_3_ + ',' + (is != null ? "{...}" : "null") + ',' + (is_4_ != null ? "{...}" : "null") + ')'));
        }
    }

}
