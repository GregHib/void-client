/* Component40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.io.FileOutputStream;

abstract class Component40
/**
 * RENAMED from `Class299_Sub1` (JODE-obfuscated).
 * Evidence: subclass of Component80 (hierarchy)
 */ extends Component80 {
    static int anInt6320;
    static Component161 aClass138_6321 = new Component161(1, 2, 2, 0);
    static int anInt6322;
    /** Optional tee of console lines (opened by "output" command). */
    static FileOutputStream consoleLogStream;

    abstract GlFramebufferTexture method2256(byte i);

    static final int method2257(int i, int i_0_, byte i_1_) {
        anInt6322++;
        double d = Math.log(i) / Math.log(2.0);
        double d_2_ = Math.log(i_0_) / Math.log(2.0);
        int i_3_ = -43 % ((i_1_ - 11) / 59);
        double d_4_ = (d - d_2_) * Math.random() + d_2_;
        return (int) (0.5 + Math.pow(2.0, d_4_));
    }

    public static void method2258(byte i) {
        aClass138_6321 = null;
        if (i < -119) consoleLogStream = null;
    }

    static final boolean method2259(int i, int i_5_, int i_6_) {
        anInt6320++;
        if (i != 0) aClass138_6321 = null;
        return (0x34 & i_6_) != 0;
    }
}
