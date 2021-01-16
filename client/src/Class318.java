/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class318 {
    Class318 aClass318_3970;
    static int anInt3971;
    static int anInt3972;
    static int anInt3973;
    static Class243[] aClass243Array3974 = new Class243[5];
    static int anInt3975;
    Class318 aClass318_3976;
    static Class304 aClass304_3977;

    final void method2373(boolean bool) {
        anInt3975++;
        if (((Class318) this).aClass318_3976 != null) {
            ((Class318) ((Class318) this).aClass318_3976).aClass318_3970
                    = ((Class318) this).aClass318_3970;
            ((Class318) ((Class318) this).aClass318_3970).aClass318_3976
                    = ((Class318) this).aClass318_3976;
            ((Class318) this).aClass318_3970 = null;
            if (bool == false)
                ((Class318) this).aClass318_3976 = null;
        }
    }

    public static void method2374(byte i) {
        aClass304_3977 = null;
        int i_0_ = 108 / ((i - -83) / 41);
        aClass243Array3974 = null;
    }

    static final void method2375(int i) {
        anInt3972++;
        Class202.aClass60_2671.method590(0);
        if (i != 16127)
            anInt3971 = -113;
    }

    public Class318() {
        /* empty */
    }

    static {
        for (int i = 0;
             (i ^ 0xffffffff) > (aClass243Array3974.length ^ 0xffffffff); i++)
            aClass243Array3974[i] = new Class243();
        aClass304_3977 = new Class304(1);
    }
}
