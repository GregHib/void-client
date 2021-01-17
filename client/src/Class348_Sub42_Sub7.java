/* Class348_Sub42_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class348_Sub42_Sub7 extends Class348_Sub42 {
    static int anInt9540;
    static int anInt9541 = -1;
    int anInt9542 = 0;
    static int anInt9543;
    static int anInt9544;

    private final void method3191(int i, Class348_Sub49 class348_sub49, byte i_0_) {
        if (i == 2) this.anInt9542 = class348_sub49.readShort(842397944);
        anInt9544++;
        int i_1_ = -60 / ((i_0_ - -26) / 51);
    }

    public Class348_Sub42_Sub7() {
        /* empty */
    }

    final void method3192(byte i, Class348_Sub49 class348_sub49) {
        for (; ; ) {
            int i_2_ = class348_sub49.readUnsignedByte(i + 239);
            if (i_2_ == 0) break;
            method3191(i_2_, class348_sub49, (byte) 70);
        }
        if (i != 16) anInt9541 = -83;
        anInt9543++;
    }
}
