/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class277 {
    int anInt3558 = 64;
    int anInt3559;
    boolean aBoolean3560;
    boolean aBoolean3561 = true;
    Class268 aClass268_3562;
    int anInt3563;
    int anInt3564 = 8;
    static int anInt3565;
    boolean aBoolean3566;
    static int anInt3567;
    static Class137 aClass137_3568;
    int anInt3569;
    int anInt3570;
    static int anInt3571;
    static Class21 aClass21_3572 = new Class21();
    int anInt3573;
    int anInt3574;
    int anInt3575;

    final void method2067(int i) {
        this.anInt3564 = (this.anInt3564 << 8 | this.anInt3573);
        if (i != -4860) method2067(-102);
        anInt3571++;
    }

    static long method2068(long l, long l_0_) {
        try {
            return l | l_0_;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, "vd.D(" + l + ',' + l_0_ + ')');
        }
    }

    private final void method2069(int i, Class348_Sub49 class348_sub49, int i_1_) {
        anInt3567++;
        if (i == -1) {
            if (i_1_ != 1) {
                if (i_1_ == 2) this.anInt3575 = class348_sub49.readUnsignedByte(255);
                else if (i_1_ == 3) {
                    this.anInt3575 = class348_sub49.readShort(842397944);
                    if (this.anInt3575 == 65535) this.anInt3575 = -1;
                } else if (i_1_ != 5) {
                    if (i_1_ != 7) {
                        if (i_1_ == 8) this.aClass268_3562.anInt3447 = this.anInt3573;
                        else if (i_1_ == 9) this.anInt3570 = (class348_sub49.readShort(842397944) << 2);
                        else if (i_1_ == 10) this.aBoolean3566 = false;
                        else if (i_1_ == 11) this.anInt3564 = class348_sub49.readUnsignedByte(255);
                        else if (i_1_ != 12) {
                            if (i_1_ != 13) {
                                if (i_1_ != 14) {
                                    if (i_1_ == 16) this.anInt3574 = class348_sub49.readUnsignedByte(255);
                                } else this.anInt3558 = (class348_sub49.readUnsignedByte(255) << 2);
                            } else this.anInt3559 = class348_sub49.method3351(-1);
                        } else this.aBoolean3560 = true;
                    } else this.anInt3569 = (Class348_Sub40_Sub34.method3140(-67, class348_sub49.method3351(-1)));
                } else this.aBoolean3561 = false;
            } else this.anInt3563 = Class348_Sub40_Sub34.method3140(-57, class348_sub49.method3351(-1));
        }
    }

    final void method2070(boolean bool, Class348_Sub49 class348_sub49) {
        if (bool != true) this.aBoolean3561 = false;
        for (; ; ) {
            int i = class348_sub49.readUnsignedByte(255);
            if (i == 0) break;
            method2069(-1, class348_sub49, i);
        }
        anInt3565++;
    }

    public static void method2071(int i) {
        aClass21_3572 = null;
        aClass137_3568 = null;
        if (i > -126) aClass21_3572 = null;
    }

    public Class277() {
        this.anInt3563 = 0;
        this.aBoolean3566 = true;
        this.aBoolean3560 = false;
        this.anInt3569 = -1;
        this.anInt3570 = 512;
        this.anInt3559 = 1190717;
        this.anInt3575 = -1;
        this.anInt3574 = 127;
    }
}
