/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class32 {
    static int anInt447;
    private final int anInt448;
    static int anInt449;
    static int anInt450;
    static int anInt451 = -1;
    private final Class348_Sub42[] aClass348_Sub42Array452;
    private long aLong453;
    private Class348_Sub42 aClass348_Sub42_454;
    static int anInt455;

    final Class348_Sub42 method334(long l, byte i) {
        try {
            aLong453 = l;
            anInt449++;
            Class348_Sub42 class348_sub42
                    = aClass348_Sub42Array452[(int) ((long) (anInt448 - 1) & l)];
            for (aClass348_Sub42_454
                         = class348_sub42.aClass348_Sub42_7063;
                 class348_sub42 != aClass348_Sub42_454;
                 aClass348_Sub42_454 = (aClass348_Sub42_454
                         .aClass348_Sub42_7063)) {
                if (aClass348_Sub42_454.aLong7057 == l) {
                    Class348_Sub42 class348_sub42_0_ = aClass348_Sub42_454;
                    aClass348_Sub42_454
                            = (aClass348_Sub42_454
                            .aClass348_Sub42_7063);
                    return class348_sub42_0_;
                }
            }
            if (i <= 0)
                aClass348_Sub42_454 = null;
            aClass348_Sub42_454 = null;
            return null;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    "ib.C(" + l + ',' + i + ')');
        }
    }

    final void method335(Class348_Sub42 class348_sub42, int i, long l) {
        try {
            anInt447++;
            if (i != -8098)
                aClass348_Sub42_454 = null;
            if (class348_sub42.aClass348_Sub42_7060 != null)
                class348_sub42.method3162(true);
            Class348_Sub42 class348_sub42_1_
                    = aClass348_Sub42Array452[(int) (l & (long) (anInt448 - 1))];
            class348_sub42.aClass348_Sub42_7060
                    = class348_sub42_1_.aClass348_Sub42_7060;
            class348_sub42.aClass348_Sub42_7063
                    = class348_sub42_1_;
            class348_sub42
                    .aClass348_Sub42_7060.aClass348_Sub42_7063
                    = class348_sub42;
            class348_sub42
                    .aClass348_Sub42_7063.aClass348_Sub42_7060
                    = class348_sub42;
            class348_sub42.aLong7057 = l;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("ib.A("
                            + (class348_sub42 != null
                            ? "{...}" : "null")
                            + ',' + i + ',' + l + ')'));
        }
    }

    Class32(int i) {
        aClass348_Sub42Array452 = new Class348_Sub42[i];
        anInt448 = i;
        for (int i_2_ = 0; i_2_ < i; i_2_++) {
            Class348_Sub42 class348_sub42
                    = aClass348_Sub42Array452[i_2_] = new Class348_Sub42();
            class348_sub42.aClass348_Sub42_7063
                    = class348_sub42;
            class348_sub42.aClass348_Sub42_7060
                    = class348_sub42;
        }
    }

    final Class348_Sub42 method336(boolean bool) {
        anInt455++;
        if (aClass348_Sub42_454 == null)
            return null;
        if (bool != true)
            return null;
        for (Class348_Sub42 class348_sub42
             = aClass348_Sub42Array452[(int) (aLong453
                & (long) (-1 + anInt448))];
             class348_sub42 != aClass348_Sub42_454;
             aClass348_Sub42_454 = (aClass348_Sub42_454
                     .aClass348_Sub42_7063)) {
            if (aLong453 == aClass348_Sub42_454.aLong7057) {
                Class348_Sub42 class348_sub42_3_ = aClass348_Sub42_454;
                aClass348_Sub42_454 = (aClass348_Sub42_454
                        .aClass348_Sub42_7063);
                return class348_sub42_3_;
            }
        }
        aClass348_Sub42_454 = null;
        return null;
    }
}
