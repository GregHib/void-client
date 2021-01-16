/* Class5_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class5_Sub1_Sub1 extends Class5_Sub1 {
    static int anInt9928;
    static Class207[] aClass207Array9929;
    static int anInt9930;
    static Class262 aClass262_9931 = new Class262();
    static int[] anIntArray9932 = new int[1000];

    public static void method190(byte i) {
        if (i < 23)
            anIntArray9932 = null;
        aClass207Array9929 = null;
        aClass262_9931 = null;
        anIntArray9932 = null;
    }

    Class5_Sub1_Sub1(Class45 class45, Class45 class45_0_,
                     Class369_Sub3_Sub1 class369_sub3_sub1) {
        super(class45, class45_0_, class369_sub3_sub1);
    }

    final void method186(int i, int i_1_, byte i_2_, int i_3_, int i_4_) {
        if (i_2_ <= 21)
            aClass207Array9929 = null;
        anInt9928++;
        int i_5_ = this.aClass105_8350.method966();
        int i_6_ = (((Class369_Sub3_Sub1) this.aClass369_4635).anInt10177
                * aa_Sub2.method163(512) / 10 % i_5_);
        this.aClass105_8350
                .method972(i_3_ - (i_5_ - i_6_), i, -i_6_ + (i_4_ - -i_5_), i_1_);
    }
}
