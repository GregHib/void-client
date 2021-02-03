/* Class253 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class253 {
    int anInt3244;
    int anInt3245 = 0;
    static int anInt3246 = 0;
    static int anInt3247;
    static int anInt3248;
    int anInt3249;
    static int anInt3250;
    int anInt3251;
    static int anInt3252;
    static int anInt3253;
    static int anInt3254;
    static int anInt3255;

    static final void method1919(int i, float f, byte[] is, float f_0_, int i_1_, float f_2_, Class186 class186, float f_3_, int i_4_, byte i_5_, int i_6_, float f_7_, int i_8_) {
        try {
            int i_9_ = 0;
            if (i_5_ < 11) method1919(97, -1.4756906F, null, 0.7518226F, 93, -0.33127537F, null, -0.6670833F, 25, (byte) -96, 123, -1.8054857F, 43);
            for (/**/; i_9_ < i_6_; i_9_++) {
                Class318_Sub1_Sub3_Sub3_Sub2.method2460(f, i_1_, f_0_, i_4_, i, f_7_, class186, i_9_, (byte) 30, i_8_, f_3_, is, i_6_, f_2_);
                i_1_ += i * i_8_;
            }
            anInt3250++;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("u.B(" + i + ',' + f + ',' + (is != null ? "{...}" : "null") + ',' + f_0_ + ',' + i_1_ + ',' + f_2_ + ',' + (class186 != null ? "{...}" : "null") + ',' + f_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + i_8_ + ')'));
        }
    }

    static final int method1920(int i, int i_10_) {
        if (i != 127) return -32;
        anInt3252++;
        return 0x7f & i_10_;
    }

    final void method1921(byte i, Class348_Sub49 class348_sub49) {
        if (i != -69) method1923(-117, -120, null);
        anInt3255++;
        for (; ; ) {
            int i_11_ = class348_sub49.readUnsignedByte(255);
            if (i_11_ == 0) break;
            method1923(i_11_, 4, class348_sub49);
        }
    }

    static final void method1922(String string, int i, String string_12_, boolean bool) {
        try {
            if (bool == true) {
                anInt3247++;
                RuntimeException_Sub1.anInt4596 = i;
                Class239_Sub12.anInt5969 = 2;
                Class132.method1138(string_12_, false, string, (byte) -45);
            }
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("u.E(" + (string != null ? "{...}" : "null") + ',' + i + ',' + (string_12_ != null ? "{...}" : "null") + ',' + bool + ')'));
        }
    }

    private final void method1923(int i, int i_13_, Class348_Sub49 class348_sub49) {
        anInt3254++;
        if (i_13_ == 4) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) this.anInt3244 = class348_sub49.readUnsignedShort(i_13_ ^ 0x3235f8fc);
                    else if (i == 4) this.anInt3251 = class348_sub49.readShort(13638);
                } else this.anInt3249 = class348_sub49.readUnsignedShort(i_13_ + 842397940);
            } else this.anInt3245 = class348_sub49.readUnsignedByte(255);
        }
    }

    public Class253() {
        this.anInt3244 = 2048;
        this.anInt3249 = 2048;
        this.anInt3251 = 0;
    }
}
