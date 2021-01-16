/* Class328 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

class Class328 {
    static int anInt4099;
    static int anInt4100;
    static int anInt4101;

    static final Class39 method2608(Class377 class377, byte[] is, int i,
                                    int i_0_) {
        try {
            anInt4099++;
            if (is == null || (is.length ^ 0xffffffff) == -1)
                return null;
            long l = OpenGL.glCreateShaderObjectARB(i_0_);
            OpenGL.glShaderSourceRawARB(l, is);
            OpenGL.glCompileShaderARB(l);
            if (i > -95)
                method2608(null, null, -27, 75);
            OpenGL.glGetObjectParameterivARB(l, 35713, (Class348_Sub40_Sub2
                    .anIntArray9096), 0);
            if ((Class348_Sub40_Sub2.anIntArray9096[0] ^ 0xffffffff) == -1) {
                if (Class348_Sub40_Sub2.anIntArray9096[0] == 0)
                    System.out.println("Shader compile failed:");
                OpenGL.glGetObjectParameterivARB(l, 35716,
                        (Class348_Sub40_Sub2
                                .anIntArray9096),
                        1);
                if (Class348_Sub40_Sub2.anIntArray9096[1] > 1) {
                    byte[] is_1_
                            = new byte[Class348_Sub40_Sub2.anIntArray9096[1]];
                    OpenGL.glGetInfoLogARB(l,
                            (Class348_Sub40_Sub2.anIntArray9096
                                    [1]),
                            Class348_Sub40_Sub2.anIntArray9096,
                            0, is_1_, 0);
                    System.out.println(new String(is_1_));
                }
                if ((Class348_Sub40_Sub2.anIntArray9096[0] ^ 0xffffffff)
                        == -1) {
                    OpenGL.glDeleteObjectARB(l);
                    return null;
                }
            }
            return new Class39(class377, l, i_0_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("dea.E("
                            + (class377 != null ? "{...}"
                            : "null")
                            + ','
                            + (is != null ? "{...}" : "null")
                            + ',' + i + ',' + i_0_ + ')'));
        }
    }

    static final Class348_Sub42_Sub19 method2609(int i, int i_2_) {
        anInt4101++;
        Class348_Sub42_Sub19 class348_sub42_sub19
                = ((Class348_Sub42_Sub19)
                Class322.aClass308_4036.method2302((long) i_2_, (byte) -68));
        if (class348_sub42_sub19 != null)
            return class348_sub42_sub19;
        byte[] is = Class113.aClass45_1743.method410(-1860, i_2_, 0);
        if (is == null || is.length <= 1)
            return null;
        try {
            class348_sub42_sub19 = Class318_Sub4.method2502(is, -104);
        } catch (Exception exception) {
            throw new RuntimeException(exception.getMessage() + " S: " + i_2_);
        }
        if (i > -103)
            return null;
        Class322.aClass308_4036.method2305((long) i_2_, class348_sub42_sub19,
                -1);
        return class348_sub42_sub19;
    }
}
