/* Class311 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class311 implements Runnable {
    static int anInt3897;
    static Class351 aClass351_3898 = new Class351(11, 8);
    static int anInt3899;
    static int anInt3900;
    static int anInt3901;
    static int anInt3902;
    static int anInt3903;
    static int anInt3904;
    static int anInt3905;
    static int anInt3906;
    private Interface16 anInterface16_3907 = new Class294();
    private boolean aBoolean3908;
    static int anInt3909;
    private volatile boolean aBoolean3910;
    static int anInt3911;
    static int anInt3912;
    static Class46 aClass46_3913;
    private long aLong3914;
    private int anInt3915;
    private Class56 aClass56_3916;
    private long aLong3917;
    static int anInt3918 = 1;
    private Interface16 anInterface16_3919 = null;
    private int anInt3920;
    private String aString3921;

    final int method2315(byte i) {
        anInt3909++;
        if (aClass56_3916 == null) return 0;
        if (i < 103) aLong3917 = -58L;
        int i_0_ = aClass56_3916.method525(-118);
        if (aClass56_3916.aBoolean1016 && (anInt3915 < aClass56_3916.anInt1021)) return 1 + anInt3915;
        if (i_0_ < 0 || -1 + Class328_Sub2.aClass56Array6515.length <= i_0_) return 100;
        if (aClass56_3916.anInt1025 == anInt3915) return aClass56_3916.anInt1021;
        return aClass56_3916.anInt1025;
    }

    final synchronized void method2316(Class56 class56, String string, int i, long l, boolean bool) {
        try {
            if (bool != false) method2318(9);
            aString3921 = string;
            anInt3915 = i;
            anInt3897++;
            aLong3917 = l;
            aClass56_3916 = class56;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("ae.J(" + (class56 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ',' + i + ',' + l + ',' + bool + ')'));
        }
    }

    public final void run() {
        anInt3902++;
        while (!aBoolean3910) {
            long l = Class62.method599(-61);
            synchronized (this) {
                try {
                    anInt3920++;
                    if (anInterface16_3907 instanceof Class294) anInterface16_3907.method58(aBoolean3908, -104);
                    else {
                        long l_1_ = Class62.method599(-104);
                        if (Class348_Sub8.aHa6654 != null && anInterface16_3919 != null && anInterface16_3919.method55((byte) -58) != 0 && (aLong3914 >= l_1_ - (long) anInterface16_3919.method55((byte) -58))) {
                            int i = (int) ((l_1_ + -aLong3914) * 255L / (long) anInterface16_3919.method55((byte) -58));
                            int i_2_ = -i + 255;
                            i_2_ = 0xffffff | i_2_ << 24;
                            i = 0xffffff | i << 24;
                            Class140.method1170((byte) -121);
                            Class348_Sub8.aHa6654.GA(0);
                            Sprite sprite = (Class348_Sub8.aHa6654.method3629(Class321.anInt4017, Class348_Sub42_Sub8_Sub2.anInt10432, true));
                            Class348_Sub8.aHa6654.method3681(sprite, 0);
                            anInterface16_3919.method58(true, -126);
                            Class348_Sub8.aHa6654.method3672();
                            sprite.method964(0, 0, 0, i_2_, 1);
                            Class348_Sub8.aHa6654.method3681(sprite, 0);
                            Class348_Sub8.aHa6654.GA(0);
                            anInterface16_3907.method58(true, -114);
                            Class348_Sub8.aHa6654.method3672();
                            sprite.method964(0, 0, 0, i, 1);
                        } else {
                            if (anInterface16_3919 != null) {
                                aBoolean3908 = true;
                                anInterface16_3919.method59(-9719);
                                anInterface16_3919 = null;
                            }
                            if (aBoolean3908) {
                                Class140.method1170((byte) -64);
                                if (Class348_Sub8.aHa6654 != null) Class348_Sub8.aHa6654.GA(0);
                            }
                            anInterface16_3907.method58((aBoolean3908 || (Class348_Sub8.aHa6654 != null && Class348_Sub8.aHa6654.method3655())), -90);
                        }
                        try {
                            if (Class348_Sub8.aHa6654 != null && !(anInterface16_3907 instanceof Class294)) Class348_Sub8.aHa6654.method3689((byte) 57);
                        } catch (Exception_Sub1 exception_sub1) {
                            Class156.method1242((exception_sub1.getMessage() + " (Recovered) " + Class79.aClient1367.method81((byte) 80)), exception_sub1, 15004);
                            Class367_Sub10.method3553(true, (byte) 114, 0);
                        }
                    }
                    java.awt.Container container;
                    if (Class52.aFrame4904 != null) container = Class52.aFrame4904;
                    else if (Class93.anApplet1530 != null) container = Class93.anApplet1530;
                    else container = Class348_Sub40_Sub9.anApplet_Sub1_9169;
                    container.getSize();
                    container.getSize();
                    if (Class52.aFrame4904 == container) Class52.aFrame4904.getInsets();
                    aBoolean3908 = false;
                    if (Class348_Sub8.aHa6654 != null && !(anInterface16_3907 instanceof Class294) && (aClass56_3916.method525(-112) < Class56.aClass56_1041.method525(-127))) Class367_Sub11.method3556(false);
                } catch (Exception exception) {
                    continue;
                }
            }
            long l_3_ = Class62.method599(-73);
            int i = (int) (-l_3_ - -l + 20L);
            if (i > 0) Class286_Sub5.method2161((byte) -3, i);
        }
    }

    public static void method2317(byte i) {
        if (i > 50) {
            aClass351_3898 = null;
            aClass46_3913 = null;
        }
    }

    final String method2318(int i) {
        if (i != -9324) method2320((byte) -47);
        anInt3903++;
        return aString3921;
    }

    final void method2319(byte i) {
        aBoolean3910 = true;
        if (i >= -37) aLong3914 = -36L;
        anInt3906++;
    }

    final int method2320(byte i) {
        anInt3901++;
        int i_4_ = -127 / ((29 - i) / 45);
        return anInt3915;
    }

    final synchronized void method2321(int i, Interface16 interface16) {
        anInt3911++;
        if (i != 10559) aClass46_3913 = null;
        anInterface16_3919 = anInterface16_3907;
        anInterface16_3907 = interface16;
        aLong3914 = Class62.method599(-67);
    }

    final synchronized boolean method2322(int i) {
        anInt3900++;
        if (i != 0) return false;
        return anInterface16_3907.method56((byte) 125, aLong3914);
    }

    final long method2323(int i) {
        anInt3912++;
        if (i != 0) method2318(14);
        return aLong3917;
    }

    final Class56 method2324(int i) {
        anInt3904++;
        if (i <= 45) return null;
        return aClass56_3916;
    }

    final int method2325(byte i) {
        int i_5_ = 32 / ((i - -41) / 47);
        anInt3899++;
        return anInt3920;
    }

    final synchronized void method2326(int i) {
        if (i <= 39) method2315((byte) 28);
        anInt3905++;
        aBoolean3908 = true;
    }

    public Class311() {
        /* empty */
    }
}
