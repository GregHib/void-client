/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

abstract class Class50 {
    static int anInt861;
    int anInt862;
    static String aString863 = null;
    int anInt864;
    int anInt865;

    abstract void method455(int i, int i_0_, int i_1_);

    abstract void method456(int i, int i_2_, int i_3_);

    abstract void method457(int i, int i_4_, int i_5_);

    public static void method458(int i) {
        if (i != -14487)
            method459(-97, null, null, true);
        aString863 = null;
    }

    static final Class171 method459(int i, ha_Sub2 var_ha_Sub2, String string,
                                    boolean bool) {
        try {
            anInt861++;
            int i_6_ = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(i, i_6_);
            if (bool != false)
                return null;
            OpenGL.glProgramStringARB(i, 34933, string);
            OpenGL.glGetIntegerv(34379, Class348_Sub31_Sub2.anIntArray9069, 0);
            if ((Class348_Sub31_Sub2.anIntArray9069[0] ^ 0xffffffff) != 0) {
                OpenGL.glBindProgramARB(i, 0);
                return null;
            }
            OpenGL.glBindProgramARB(i, 0);
            return new Class171(var_ha_Sub2, i, i_6_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("iu.I(" + i + ','
                            + (var_ha_Sub2 != null ? "{...}"
                            : "null")
                            + ','
                            + (string != null ? "{...}"
                            : "null")
                            + ',' + bool + ')'));
        }
    }

    Class50(int i, int i_7_, int i_8_) {
        this.anInt862 = i_8_;
        this.anInt864 = i;
        this.anInt865 = i_7_;
    }
}
