/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class19 {
    static Class114 aClass114_304;
    static int anInt305;
    String aString306;
    static int anInt307;
    int anInt308;
    static int anInt309;
    byte aByte310;
    static Class174[] aClass174Array311 = new Class174[16];
    String aString312;
    String aString313;
    String aString314;
    static Class114 aClass114_315;

    static final void method283(int i, int i_0_, int i_1_, int i_2_, int i_3_,
                                int i_4_, int i_5_) {
        for (Class318_Sub5 class318_sub5
             = (Class318_Sub5) Class225.aClass243_2957.method1872(8);
             class318_sub5 != null;
             class318_sub5 = ((Class318_Sub5)
                     Class225.aClass243_2957.method1878((byte) 0))) {
            if (class318_sub5.anInt6421
                    <= Class367_Sub11.anInt7396)
                class318_sub5.method2373(false);
            else {
                Class318_Sub5.method2505
                        (i_0_ >> 882522209,
                                class318_sub5.anInt6420 * 2, 0, i_5_,
                                i_2_ >> 742898945,
                                class318_sub5.anInt6418,
                                256 + (class318_sub5.anInt6422
                                        << 2139317545),
                                i_1_,
                                (class318_sub5.anInt6419
                                        << -1529290903) + 256);
                Class262.aClass324_3326.method2575
                        ((byte) 122, i_3_ - -Class239_Sub21.anIntArray6062[0],
                                ~0xffffff | class318_sub5.anInt6415,
                                class318_sub5.aString6416, 0,
                                i_4_ - -Class239_Sub21.anIntArray6062[1]);
            }
        }
        anInt305++;
        if (i >= -108)
            aClass114_304 = null;
    }

    public static void method284(byte i) {
        aClass114_315 = null;
        aClass114_304 = null;
        if (i == 51)
            aClass174Array311 = null;
    }

    static final Class223[] method285(int i) {
        anInt309++;
        if (i > -62)
            method286((byte) 66, null);
        return (new Class223[]
                {Class219.aClass223_2868, Class348_Sub49.aClass223_7175,
                        Class313.aClass223_3934, Class185.aClass223_2489,
                        Class101_Sub1.aClass223_5689,
                        Class348_Sub40_Sub21.aClass223_9274, Class28.aClass223_4997,
                        Class174.aClass223_2307, Class149.aClass223_2045,
                        Class187.aClass223_2507});
    }

    static final Class57[] method286(byte i, Class297 class297) {
        anInt307++;
        if (!class297.method2247(-4))
            return new Class57[0];
        int i_6_ = 52 / ((39 - i) / 61);
        Class144 class144 = class297.method2240(972476528);
        while (class144.anInt1997 == 0)
            Class286_Sub5.method2161((byte) -97, 10L);
        if (class144.anInt1997 == 2)
            return new Class57[0];
        int[] is = (int[]) class144.anObject1998;
        Class57[] class57s = new Class57[is.length >> -119668702];
        for (int i_7_ = 0;
             class57s.length > i_7_; i_7_++) {
            Class57 class57 = new Class57();
            class57s[i_7_] = class57;
            class57.anInt1047 = is[i_7_ << 1515882146];
            class57.anInt1054 = is[1 + (i_7_ << -43437246)];
            class57.anInt1046 = is[2 + (i_7_ << 1424706306)];
            class57.anInt1052 = is[(i_7_ << 1542845858) + 3];
        }
        return class57s;
    }

    public Class19() {
        /* empty */
    }

    static {
        aClass114_304 = new Class114(70, -2);
        aClass114_315 = new Class114(15, 16);
    }
}
