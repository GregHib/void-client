/* Class300 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class300 {
    static int anInt3815;
    static int anInt3816;
    int anInt3817;
    static int anInt3818;
    static boolean aBoolean3819 = false;
    static int anInt3820;
    int[] anIntArray3821;
    static int anInt3822;
    int anInt3823 = -1;
    static int anInt3824;

    static final Class348_Sub47 method2273(byte i) {
        anInt3824++;
        if (i != -103) return null;
        if (Class239_Sub13.anInt5980 == 0) return new Class348_Sub47();
        return Class176.aClass348_Sub47Array2334[--Class239_Sub13.anInt5980];
    }

    static final int method2274(String string, int i) {
        anInt3816++;
        if (string == null) return -1;
        if (i >= -41) return 97;
        for (int i_0_ = 0; (i_0_ < Class348_Sub40_Sub30.anInt9383); i_0_++) {
            if (string.equalsIgnoreCase(Class83.aStringArray1441[i_0_])) return i_0_;
        }
        return -1;
    }

    final void method2275(Class348_Sub49 class348_sub49, byte i) {
        anInt3818++;
        for (; ; ) {
            int i_1_ = class348_sub49.readUnsignedByte(255);
            if (i_1_ == 0) break;
            method2276(0, class348_sub49, i_1_);
        }
        int i_2_ = -63 / ((72 - i) / 37);
    }

    private final void method2276(int i, Class348_Sub49 class348_sub49, int i_3_) {
        if (i_3_ == 1) this.anInt3817 = class348_sub49.readUnsignedShort(842397944);
        else if (i_3_ == 2) {
            this.anIntArray3821 = new int[class348_sub49.readUnsignedByte(255)];
            for (int i_4_ = 0; (i_4_ < this.anIntArray3821.length); i_4_++)
                this.anIntArray3821[i_4_] = class348_sub49.readUnsignedShort(842397944);
        } else if (i_3_ == 3) this.anInt3823 = class348_sub49.readUnsignedByte(255);
        if (i != 0) aBoolean3819 = true;
        anInt3822++;
    }

    static final Class124 method2277(int i, Class45 class45, int i_5_, int i_6_) {
        if (i_6_ != -1) aBoolean3819 = true;
        anInt3815++;
        byte[] is = class45.method410(-1860, i_5_, i);
        if (is == null) return null;
        return new Class124(is);
    }

    public Class300() {
        this.anInt3817 = -1;
    }
}
