/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class317 {
    private int anInt3967;
    private int anInt3968;
    private final Class80[] aClass80Array3969;

    final Class348_Sub19_Sub1 method2369() {
        byte[] is = method2371();
        return new Class348_Sub19_Sub1(22050, is, 22050 * anInt3967 / 1000, 22050 * anInt3968 / 1000);
    }

    final int method2370() {
        int i = 9999999;
        for (int i_0_ = 0; i_0_ < 10; i_0_++) {
            if (aClass80Array3969[i_0_] != null && aClass80Array3969[i_0_].anInt1407 / 20 < i) i = aClass80Array3969[i_0_].anInt1407 / 20;
        }
        if (anInt3967 < anInt3968 && anInt3967 / 20 < i) i = anInt3967 / 20;
        if (i == 9999999 || i == 0) return 0;
        for (int i_1_ = 0; i_1_ < 10; i_1_++) {
            if (aClass80Array3969[i_1_] != null) aClass80Array3969[i_1_].anInt1407 -= i * 20;
        }
        if (anInt3967 < anInt3968) {
            anInt3967 -= i * 20;
            anInt3968 -= i * 20;
        }
        return i;
    }

    private final byte[] method2371() {
        int i = 0;
        for (int i_2_ = 0; i_2_ < 10; i_2_++) {
            if (aClass80Array3969[i_2_] != null && (aClass80Array3969[i_2_].anInt1421 + aClass80Array3969[i_2_].anInt1407) > i) i = (aClass80Array3969[i_2_].anInt1421 + aClass80Array3969[i_2_].anInt1407);
        }
        if (i == 0) return new byte[0];
        int i_3_ = 22050 * i / 1000;
        byte[] is = new byte[i_3_];
        for (int i_4_ = 0; i_4_ < 10; i_4_++) {
            if (aClass80Array3969[i_4_] != null) {
                int i_5_ = (aClass80Array3969[i_4_].anInt1421 * 22050 / 1000);
                int i_6_ = (aClass80Array3969[i_4_].anInt1407 * 22050 / 1000);
                int[] is_7_ = (aClass80Array3969[i_4_].method809(i_5_, aClass80Array3969[i_4_].anInt1421));
                for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
                    int i_9_ = is[i_8_ + i_6_] + (is_7_[i_8_] >> 8);
                    if ((i_9_ + 128 & ~0xff) != 0) i_9_ = i_9_ >> 31 ^ 0x7f;
                    is[i_8_ + i_6_] = (byte) i_9_;
                }
            }
        }
        return is;
    }

    private Class317(Class348_Sub49 class348_sub49) {
        aClass80Array3969 = new Class80[10];
        for (int i = 0; i < 10; i++) {
            int i_10_ = class348_sub49.readUnsignedByte(255);
            if (i_10_ != 0) {
                class348_sub49.anInt7197--;
                aClass80Array3969[i] = new Class80();
                aClass80Array3969[i].method807(class348_sub49);
            }
        }
        anInt3967 = class348_sub49.readUnsignedShort(842397944);
        anInt3968 = class348_sub49.readUnsignedShort(842397944);
    }

    private Class317() {
        aClass80Array3969 = new Class80[10];
    }

    static final Class317 method2372(Class45 class45, int i, int i_11_) {
        byte[] is = class45.method410(-1860, i, i_11_);
        if (is == null) return null;
        return new Class317(new Class348_Sub49(is));
    }
}
