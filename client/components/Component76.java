/* Component76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Component76
/**
 * RENAMED from `Class369_Sub3` (JODE-obfuscated).
 * Evidence: subclass of Component27 (hierarchy)
 */ extends Component27 {
    static int anInt8594;
    int anInt8595;
    static boolean[][] aBooleanArrayArray8596;
    int anInt8597;
    static int anInt8598;
    int anInt8599;
    int anInt8600;
    static CacheStore aClass45_8601;
    int anInt8602;
    int anInt8603;

    public DisplayModeManagerContainer369 method51(byte i) {
        anInt8594++;
        if (i <= 116) return null;
        return Component316.aClass223_2489;
    }

    static final void method3573(int i) {
        synchronized (DisplayModeManagerContainer310.aClass60_355) {
            DisplayModeManagerContainer310.aClass60_355.clear(0);
        }
        anInt8598++;
        synchronized (Component387.aClass60_1894) {
            Component387.aClass60_1894.clear(0);
        }
        if (i != -15326) method3573(-67);
    }

    Component76(Component85 class221, DisplayModeManagerContainer196 class341, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
        super(class221, class341, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_);
        try {
            this.anInt8600 = i_10_;
            this.anInt8602 = i_9_;
            this.anInt8603 = i_8_;
            this.anInt8599 = i_6_;
            this.anInt8597 = i_11_;
            this.anInt8595 = i_7_;
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("um.<init>(" + (class221 != null ? "{...}" : "null") + ',' + (class341 != null ? "{...}" : "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'));
        }
    }

    public static void method3574(int i) {
        if (i == 19499) {
            aBooleanArrayArray8596 = null;
            aClass45_8601 = null;
        }
    }
}
