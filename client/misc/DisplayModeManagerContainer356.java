/* DisplayModeManagerContainer356 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class DisplayModeManagerContainer356
/**
 * RENAMED from `Class299_Sub2` (JODE-obfuscated).
 * Evidence: subclass of Component80 (hierarchy)
 */ extends Component80 {
    static int anInt6324;
    static int anInt6325;
    static int anInt6326;
    static boolean aBoolean6327 = false;
    static SeekableFile aClass78_6328;

    abstract Interface18_Impl2 method2266(boolean bool);

    static final void method2267(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
        anInt6324++;
        if (i != 10499) method2267(55, -44, 14, -122, 70, 0, 127, 112);
        if (i_6_ == i_0_) Npc.method2441(i_2_, i_6_, i_4_, -22728, i_5_, i_3_, i_1_);
        else if (Component27.anInt4960 > -i_6_ + i_1_ || i_6_ + i_1_ > Component22.anInt1745 || -i_0_ + i_5_ < Component72.anInt1910 || i_0_ + i_5_ > PauseTimer.anInt513) Definition.method3041(i_6_, i_1_, i_5_, i ^ ~0x2903, i_0_, i_3_, i_2_, i_4_);
        else Sprite.method3012(i_0_, i_3_, i_6_, i_2_, i_1_, (byte) -117, i_5_, i_4_);
    }

    public static void method2268(int i) {
        if (i == -24054) aClass78_6328 = null;
    }

    static final void method2269(boolean bool) {
        if (bool != true) anInt6325 = -78;
        DisplayModeManagerContainer365.method739();
        anInt6326++;
    }
}
