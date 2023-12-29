/* Class348_Sub42_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.math.BigInteger;

final class Class348_Sub42_Sub15 extends Class348_Sub42 {
    static int anInt9646;
    static int anInt9647;
    static int anInt9648;
    static int anInt9649;
    int anInt9650;
    int anInt9651;
    int anInt9652;
    static int anInt9653;
    String aString9654;
    static int anInt9655;
    static int anInt9656;
    static BigInteger aBigInteger9657 = Loader.FILE_SERVER_RSA_MODULUS;
    static Sprite aSprite_9658;
    static Sprite aSprite_9659;
    static Class56 aClass56_9660;

    final int method3245(boolean bool) {
        anInt9646++;
        if (bool != true) method3248(-60);
        return (int) (this.aLong4291 >>> 32 & 0xffL);
    }

    final void method3246(int i) {
        this.aLong7057 |= ~0x7fffffffffffffffL;
        anInt9653++;
        if (method3250((byte) -89) == 0L) Class367_Sub4.aClass107_7325.method1005(true, this);
        if (i != -25490) aSprite_9659 = null;
    }

    public static void method3247(int i) {
        if (i > -49) method3247(49);
        aClass56_9660 = null;
        aSprite_9658 = null;
        aSprite_9659 = null;
        aBigInteger9657 = null;
    }

    final int method3248(int i) {
        if (i != 1) return -110;
        anInt9647++;
        return (int) this.aLong4291;
    }

    static final Class242 method3249(int i, int i_0_, ha_Sub2 var_ha_Sub2, String string) {
        try {
            anInt9656++;
            int i_1_ = -89 / ((29 - i_0_) / 47);
            long l = OpenGL.glCreateShaderObjectARB(i);
            OpenGL.glShaderSourceARB(l, string);
            OpenGL.glCompileShaderARB(l);
            OpenGL.glGetObjectParameterivARB(l, 35713, (Class348_Sub42_Sub4.anIntArray9519), 0);
            if (Class348_Sub42_Sub4.anIntArray9519[0] == 0) {
                if (Class348_Sub42_Sub4.anIntArray9519[0] == 0) System.out.println("Shader compile failed:");
                OpenGL.glGetObjectParameterivARB(l, 35716, (Class348_Sub42_Sub4.anIntArray9519), 1);
                if (Class348_Sub42_Sub4.anIntArray9519[1] > 1) {
                    byte[] is = new byte[Class348_Sub42_Sub4.anIntArray9519[1]];
                    OpenGL.glGetInfoLogARB(l, (Class348_Sub42_Sub4.anIntArray9519[1]), Class348_Sub42_Sub4.anIntArray9519, 0, is, 0);
                    System.out.println(new String(is));
                }
                if (Class348_Sub42_Sub4.anIntArray9519[0] == 0) {
                    OpenGL.glDeleteObjectARB(l);
                    return null;
                }
            }
            return new Class242(var_ha_Sub2, l, i);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("et.G(" + i + ',' + i_0_ + ',' + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    final long method3250(byte i) {
        anInt9649++;
        if (i >= -37) method3250((byte) 79);
        return this.aLong7057 & 0x7fffffffffffffffL;
    }

    Class348_Sub42_Sub15(int i, int i_2_) {
        this.aLong4291 = (long) i << 32 | (long) i_2_;
    }

    final void method3251(int i) {
        anInt9648++;
        this.aLong7057 = (~0x7fffffffffffffffL & this.aLong7057 | Class62.method599(-120) + 500L);
        s_Sub2.aClass107_8241.method1005(true, this);
        if (i != -16058) aSprite_9658 = null;
    }
}
