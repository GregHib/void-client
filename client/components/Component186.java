/* Component186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Component186
/**
 * RENAMED from `Class357` (JODE-obfuscated).
 * Evidence: root class; no distinctive extends/strings
 */ {
    static int anInt4392;
    static int anInt4393;
    static StringCache aClass351_4394 = new StringCache(6, -1);
    Component203 aClass318_Sub1_Sub5_4395;
    Component3 aClass148_4396;
    short aShort4397;
    short aShort4398;
    byte aByte4399;
    Component186 aClass357_4400;
    short aShort4401;
    DisplayModeManagerContainer28 aClass318_Sub1_Sub1_4402;
    Component269 aClass318_Sub1_Sub4_4403;
    static double aDouble4404;
    static StringCache aClass351_4405 = new StringCache(64, -1);
    Component269 aClass318_Sub1_Sub4_4406;
    Component203 aClass318_Sub1_Sub5_4407;
    DisplayModeManagerContainer343 aClass318_Sub1_Sub2_4408;
    short aShort4409;
    static long[] aLongArray4410 = new long[100];

    final void method3485(boolean bool) {
        Component3 class148;
        for (/**/; this.aClass148_4396 != null; this.aClass148_4396 = class148) {
            class148 = this.aClass148_4396.aClass148_2038;
            this.aClass148_4396.method1199((byte) -106);
        }
        anInt4393++;
        if (bool != true) method3486(41, false, -64, 33L, -50);
    }

    static final String method3486(int i, boolean bool, int i_0_, long l, int i_1_) {
        try {
            anInt4392++;
            char c = ',';
            char c_2_ = '.';
            if (i_0_ == 0) {
                c = '.';
                c_2_ = ',';
            }
            if (i_0_ == 2) c_2_ = '\u00a0';
            boolean bool_3_ = false;
            if (l < 0) {
                l = -l;
                bool_3_ = true;
            }
            StringBuffer stringbuffer = new StringBuffer(26);
            if (i > 0) {
                for (int i_4_ = 0; i > i_4_; i_4_++) {
                    int i_5_ = (int) l;
                    l /= 10L;
                    stringbuffer.append((char) (i_5_ + (48 + -((int) l * 10))));
                }
                stringbuffer.append(c);
            }
            int i_6_ = 0;
            for (; ; ) {
                int i_7_ = (int) l;
                l /= 10L;
                stringbuffer.append((char) (i_7_ + (48 - (int) l * 10)));
                if (l == 0) break;
                if (bool && ++i_6_ % 3 == 0) stringbuffer.append(c_2_);
            }
            if (bool_3_) stringbuffer.append('-');
            if (i_1_ != 16980) aLongArray4410 = null;
            return stringbuffer.reverse().toString();
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("es.C(" + i + ',' + bool + ',' + i_0_ + ',' + l + ',' + i_1_ + ')'));
        }
    }

    Component186(int i) {
        this.aByte4399 = (byte) i;
    }

    public static void method3487(int i) {
        aLongArray4410 = null;
        aClass351_4394 = null;
        if (i >= -45) aClass351_4405 = null;
        aClass351_4405 = null;
    }
}
