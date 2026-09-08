/* DefinitionSub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DefinitionSub15
/**
 * RENAMED from `Class348_Sub40_Sub15` (JODE-obfuscated).
 * Evidence: subclass of Definition (hierarchy)
 */ extends Definition {
    static Component183 aClass114_9216 = new Component183(91, 2);
    static int anInt9217;
    static int anInt9218;
    static int anInt9219;
    private int anInt9220 = 4096;
    static int anInt9221;

    final void method3049(Buffer class348_sub49, int i, int i_0_) {
        int i_1_ = i;
        if (i_1_ == 0) anInt9220 = (class348_sub49.readUnsignedByte(255) << 12) / 255;
        if (i_0_ == 31015) anInt9217++;
    }

    static final void method3084(int i, byte i_2_, int i_3_) {
        anInt9218++;
        RSARequest class348_sub42_sub15 = FriendLoginMessage.method2516(i_3_, (byte) 105, 17);
        class348_sub42_sub15.method3246(-25490);
        class348_sub42_sub15.anInt9652 = i;
        int i_4_ = 59 / ((i_2_ - -7) / 49);
    }

    public static void method3085(int i) {
        aClass114_9216 = null;
        if (i != 0) aClass114_9216 = null;
    }

    DefinitionSub15(int i) {
        super(0, true);
        anInt9220 = i;
    }

    static final void method3086(int i, BrowserUrlOpener class348_sub16_sub3, int i_5_, CacheStore class45, boolean bool, int i_6_, int i_7_) {
        try {
            anInt9219++;
            if (i != 2) aClass114_9216 = null;
            NodeSub1Sub3.method2732(i_6_, i_7_, bool, 96, class45, i_5_);
            DebugPanic.aClass348_Sub16_Sub3_4743 = class348_sub16_sub3;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("pba.D(" + i + ',' + (class348_sub16_sub3 != null ? "{...}" : "null") + ',' + i_5_ + ',' + (class45 != null ? "{...}" : "null") + ',' + bool + ',' + i_6_ + ',' + i_7_ + ')'));
        }
    }

    final int[] getMonochromeOutput(int i, int i_8_) {
        anInt9221++;
        int[] is = this.imageCache.getPixels(0, i);
        if (this.imageCache.cacheMiss) Component313.method1579(is, 0, DefinitionSub6.anInt9139, anInt9220);
        if (i_8_ != 255) method3085(63);
        return is;
    }

    public DefinitionSub15() {
        this(4096);
    }
}
