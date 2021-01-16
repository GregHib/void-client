/* Class348_Sub42_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class348_Sub42_Sub9 extends Class348_Sub42 {
    int anInt9556;
    static int anInt9557;
    static int[] anIntArray9558 = {3, 7, 15};
    Interface14 anInterface14_9559;

    static final boolean method3203(int i, byte i_0_, int i_1_) {
        anInt9557++;
        if (i_0_ < 109)
            return false;
        if ((i_1_ & 0x10000) == 0)
            return false;
        return true;
    }

    public static void method3204(int i) {
        if (i > -64)
            method3203(-45, (byte) 72, -104);
        anIntArray9558 = null;
    }

    abstract Object method3205(int i);

    Class348_Sub42_Sub9(Interface14 interface14, int i) {
        ((Class348_Sub42_Sub9) this).anInterface14_9559 = interface14;
        ((Class348_Sub42_Sub9) this).anInt9556 = i;
    }

    abstract boolean method3206(byte i);
}
