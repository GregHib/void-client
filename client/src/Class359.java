/* Class359 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class359 {
    static int anInt4419;
    int anInt4420;
    static Class114 aClass114_4421 = new Class114(13, -2);
    static int anInt4422;
    int anInt4423;
    static int anInt4424;
    int anInt4425;
    boolean aBoolean4426;

    static final boolean method3490(boolean bool) {
        anInt4419++;
        boolean bool_0_ = bool;
        if (Class348_Sub40_Sub1.aClass207_9090 == null) {
            if (!Class21.SPRITES.method421(false, OutputStream_Sub1.anInt98)) bool_0_ = false;
            else Class348_Sub40_Sub1.aClass207_9090 = Class207.method1512(Class21.SPRITES, OutputStream_Sub1.anInt98);
        }
        if (Class348_Sub7.aClass207_6643 == null) {
            if (Class21.SPRITES.method421(!bool, Class348_Sub32.anInt6938)) Class348_Sub7.aClass207_6643 = Class207.method1512(Class21.SPRITES, Class348_Sub32.anInt6938);
            else bool_0_ = false;
        }
        if (Class112.aClass207_1727 == null) {
            if (!Class21.SPRITES.method421(false, Class295.anInt3762)) bool_0_ = false;
            else Class112.aClass207_1727 = Class207.method1512(Class21.SPRITES, Class295.anInt3762);
        }
        if (Class281.aFontMetrics_3649 == null) {
            if (Class104.FONT_INDEX.method421(false, Class20.anInt317)) Class281.aFontMetrics_3649 = Class239_Sub10.getFontMetrics((byte) -89, Class20.anInt317, Class104.FONT_INDEX);
            else bool_0_ = false;
        }
        if (Class5_Sub1_Sub1.aClass207Array9929 == null) {
            if (Class21.SPRITES.method421(false, Class20.anInt317)) Class5_Sub1_Sub1.aClass207Array9929 = Class207.method1523(Class21.SPRITES, Class20.anInt317);
            else bool_0_ = false;
        }
        return bool_0_;
    }

    public static void method3491(int i) {
        aClass114_4421 = null;
        if (i != 1) method3491(-30);
    }

    static final int method3492(int i, int i_1_) {
        anInt4422++;
        int i_2_ = 0x3f & i;
        int i_3_ = (i_1_ & i) >> 6;
        if (i_2_ == 18) {
            if (i_3_ == 0) return 1;
            if (i_3_ == 1) return 2;
            if (i_3_ == 2) return 4;
            if (i_3_ == 3) return 8;
        } else if (i_2_ == 19 || i_2_ == 21) {
            if (i_3_ == 0) return 16;
            if (i_3_ == 1) return 32;
            if (i_3_ == 2) return 64;
            if (i_3_ == 3) return 128;
        }
        return 0;
    }

    public Class359() {
        /* empty */
    }
}
