/* RSARequest - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class348_Sub42_Sub15` (JODE-obfuscated).
 * HashNode carrying the file-server RSA modulus (Loader.FILE_SERVER_RSA_MODULUS). Used for RSA-encrypted handshake/login requests.
 */

import jaggl.OpenGL;

import java.math.BigInteger;

final class RSARequest extends HashNode {
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
    static Component24 aClass105_9658;
    static Component24 aClass105_9659;
    /** Current boot/loading stage driven by {@link LoadingManager#pulseLoading}. */
    static LoadingState currentLoadingState;

    final int method3245(boolean bool) {
        anInt9646++;
        if (bool != true) method3248(-60);
        return (int) (this.key >>> 32 & 0xffL);
    }

    final void method3246(int i) {
        this.accessAge |= ~0x7fffffffffffffffL;
        anInt9653++;
        if (method3250((byte) -89) == 0L) AbstractShaderSub4.aClass107_7325.add(true, this);
        if (i != -25490) aClass105_9659 = null;
    }

    public static void method3247(int i) {
        if (i > -49) method3247(49);
        currentLoadingState = null;
        aClass105_9658 = null;
        aClass105_9659 = null;
        aBigInteger9657 = null;
    }

    final int method3248(int i) {
        if (i != 1) return -110;
        anInt9647++;
        return (int) this.key;
    }

    static final Component359 method3249(int i, int i_0_, GlToolkitSub2 var_ha_Sub2, String string) {
        try {
            anInt9656++;
            int i_1_ = -89 / ((29 - i_0_) / 47);
            long l = OpenGL.glCreateShaderObjectARB(i);
            OpenGL.glShaderSourceARB(l, string);
            OpenGL.glCompileShaderARB(l);
            OpenGL.glGetObjectParameterivARB(l, 35713, (HashNodeSub4.anIntArray9519), 0);
            if (HashNodeSub4.anIntArray9519[0] == 0) {
                if (HashNodeSub4.anIntArray9519[0] == 0) System.out.println("aa compile failed:");
                OpenGL.glGetObjectParameterivARB(l, 35716, (HashNodeSub4.anIntArray9519), 1);
                if (HashNodeSub4.anIntArray9519[1] > 1) {
                    byte[] is = new byte[HashNodeSub4.anIntArray9519[1]];
                    OpenGL.glGetInfoLogARB(l, (HashNodeSub4.anIntArray9519[1]), HashNodeSub4.anIntArray9519, 0, is, 0);
                    System.out.println(new String(is));
                }
                if (HashNodeSub4.anIntArray9519[0] == 0) {
                    OpenGL.glDeleteObjectARB(l);
                    return null;
                }
            }
            return new Component359(var_ha_Sub2, l, i);
        } catch (RuntimeException runtimeexception) {
            throw NpcDefinition.wrapThrowable(runtimeexception, ("et.G(" + i + ',' + i_0_ + ',' + (var_ha_Sub2 != null ? "{...}" : "null") + ',' + (string != null ? "{...}" : "null") + ')'));
        }
    }

    final long method3250(byte i) {
        anInt9649++;
        if (i >= -37) method3250((byte) 79);
        return this.accessAge & 0x7fffffffffffffffL;
    }

    RSARequest(int i, int i_2_) {
        this.key = (long) i << 32 | (long) i_2_;
    }

    final void method3251(int i) {
        anInt9648++;
        this.accessAge = (~0x7fffffffffffffffL & this.accessAge | Component240.currentTimeMillis(-120) + 500L);
        BufferCacheSub2.aClass107_8241.add(true, this);
        if (i != -16058) aClass105_9658 = null;
    }
}
