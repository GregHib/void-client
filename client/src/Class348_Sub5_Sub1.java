/* Class348_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

import java.io.*;

final class Class348_Sub5_Sub1 extends Class348_Sub5 {
    private Class337 aClass337_8822;
    static int anInt8823;
    private Class337 aClass337_8824;
    private Class206 aClass206_8825;
    private int anInt8826;
    static int anInt8827;
    static int anInt8828;
    static int anInt8829;
    private Class258_Sub3 aClass258_Sub3_8830;
    static int anInt8831;
    static Class21 aClass21_8832 = new Class21();
    private int anInt8833;
    static int anInt8834;
    private Class258_Sub3 aClass258_Sub3_8835;
    private Class337 aClass337_8836;
    private Class258_Sub3[] aClass258_Sub3Array8837;
    private int anInt8838;
    static int anInt8839;
    static int anInt8840;
    private int anInt8841;
    private Class337 aClass337_8842;
    static int anInt8843;
    private Class206 aClass206_8844;

    final void method2756(byte i, int i_0_) {
        anInt8831++;
        OpenGL.glUseProgramObjectARB(0L);
        this.aHa_Sub2_6618.method3738(-15039, 1);
        int i_1_ = -98 / ((i - 44) / 38);
        this.aHa_Sub2_6618.method3771((byte) -86, null);
        this.aHa_Sub2_6618.method3738(-15039, 0);
    }

    final void method2750(Class258_Sub3 class258_sub3,
                          Class258_Sub3 class258_sub3_2_, int i, byte i_3_) {
        try {
            anInt8828++;
            OpenGL.glPushAttrib(2048);
            OpenGL.glMatrixMode(5889);
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
            if (aClass258_Sub3Array8837 != null) {
                this.aHa_Sub2_6618
                        .method3773(-1, aClass206_8844);
                int i_4_ = Class348_Sub40_Sub1.method3051(anInt8841, 4096);
                int i_5_ = Class348_Sub40_Sub1.method3051(anInt8833, 4096);
                int i_6_ = 0;
                while (i_4_ > 256
                        || i_5_ > 256) {
                    OpenGL.glViewport(0, 0, i_4_, i_5_);
                    aClass206_8844.method1509(aClass258_Sub3Array8837[i_6_], 0,
                            0);
                    if (i_6_ == 0) {
                        this.aHa_Sub2_6618
                                .method3771((byte) -115, class258_sub3_2_);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f((float) anInt8841, 0.0F);
                        OpenGL.glVertex2i(1, 0);
                        OpenGL.glTexCoord2f((float) anInt8841,
                                (float) anInt8833);
                        OpenGL.glVertex2i(1, 1);
                        OpenGL.glTexCoord2f(0.0F, (float) anInt8833);
                        OpenGL.glVertex2i(0, 1);
                        OpenGL.glEnd();
                    } else {
                        this.aHa_Sub2_6618.method3771
                                ((byte) -82, aClass258_Sub3Array8837[i_6_ - 1]);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(1.0F, 0.0F);
                        OpenGL.glVertex2i(1, 0);
                        OpenGL.glTexCoord2f(1.0F, 1.0F);
                        OpenGL.glVertex2i(1, 1);
                        OpenGL.glTexCoord2f(0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 1);
                        OpenGL.glEnd();
                    }
                    if (i_5_ > 256)
                        i_5_ >>= 1;
                    if (i_4_ > 256)
                        i_4_ >>= 1;
                    i_6_++;
                }
                this.aHa_Sub2_6618
                        .method3770(-422613672, aClass206_8844);
                this.aHa_Sub2_6618.method3771
                        ((byte) -100, aClass258_Sub3Array8837[i_6_ + -1]);
                this.aHa_Sub2_6618
                        .method3773(-1, aClass206_8825);
                aClass206_8825.method1503(0, (byte) 3);
                OpenGL.glViewport(0, 0, 256, 256);
                long l = aClass337_8824.aLong4178;
                OpenGL.glUseProgramObjectARB(l);
                OpenGL.glUniform1iARB
                        (OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l,
                        "params"),
                        Class75_Sub1.aFloat5654, 0.0F, 0.0F);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(0, 0);
                OpenGL.glTexCoord2f(1.0F, 0.0F);
                OpenGL.glVertex2i(1, 0);
                OpenGL.glTexCoord2f(1.0F, 1.0F);
                OpenGL.glVertex2i(1, 1);
                OpenGL.glTexCoord2f(0.0F, 1.0F);
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();
            } else {
                this.aHa_Sub2_6618
                        .method3771((byte) -90, class258_sub3_2_);
                this.aHa_Sub2_6618
                        .method3773(-1, aClass206_8825);
                aClass206_8825.method1503(0, (byte) 3);
                OpenGL.glViewport(0, 0, 256, 256);
                long l = aClass337_8842.aLong4178;
                OpenGL.glUseProgramObjectARB(l);
                OpenGL.glUniform1iARB
                        (OpenGL.glGetUniformLocationARB(l, "sceneTex"), 0);
                OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l,
                        "params"),
                        Class75_Sub1.aFloat5654, 0.0F, 0.0F);
                OpenGL.glBegin(7);
                OpenGL.glTexCoord2f(0.0F, 0.0F);
                OpenGL.glVertex2i(0, 0);
                OpenGL.glTexCoord2f((float) anInt8841, 0.0F);
                OpenGL.glVertex2i(1, 0);
                OpenGL.glTexCoord2f((float) anInt8841, (float) anInt8833);
                OpenGL.glVertex2i(1, 1);
                OpenGL.glTexCoord2f(0.0F, (float) anInt8833);
                OpenGL.glVertex2i(0, 1);
                OpenGL.glEnd();
            }
            aClass206_8825.method1503(1, (byte) 3);
            this.aHa_Sub2_6618
                    .method3771((byte) -100, aClass258_Sub3_8835);
            long l = aClass337_8822.aLong4178;
            OpenGL.glUseProgramObjectARB(l);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l, "baseTex"),
                    0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"),
                    0.00390625F, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            aClass206_8825.method1503(0, (byte) 3);
            this.aHa_Sub2_6618
                    .method3771((byte) -114, aClass258_Sub3_8830);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l, "step"),
                    0.0F, 0.00390625F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            if (i_3_ <= 98)
                aClass258_Sub3_8835 = null;
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
            OpenGL.glPopAttrib();
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
            this.aHa_Sub2_6618.method3770(-422613672,
                    aClass206_8825);
            long l_7_ = aClass337_8836.aLong4178;
            OpenGL.glUseProgramObjectARB(l_7_);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_7_,
                    "sceneTex"),
                    0);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(l_7_,
                    "bloomTex"),
                    1);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(l_7_,
                    "params"),
                    Class348_Sub40_Sub13.aFloat9204,
                    Class239_Sub26.aFloat6120, 0.0F);
            this.aHa_Sub2_6618.method3738(-15039, 1);
            this.aHa_Sub2_6618
                    .method3771((byte) -99, aClass258_Sub3_8835);
            this.aHa_Sub2_6618.method3738(-15039, 0);
            this.aHa_Sub2_6618.method3771((byte) -82,
                    class258_sub3_2_);
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception,
                    ("rda.H("
                            + (class258_sub3 != null ? "{...}"
                            : "null")
                            + ','
                            + (class258_sub3_2_ != null
                            ? "{...}" : "null")
                            + ',' + i + ',' + i_3_ + ')'));
        }
    }

    public static void method2765(int i) {
        aClass21_8832 = null;
        if (i != 2048)
            method2765(52);
    }

    static final String method2766(boolean bool, Throwable throwable)
            throws IOException {
        anInt8823++;
        String string;
        if (throwable instanceof RuntimeException_Sub1) {
            RuntimeException_Sub1 runtimeexception_sub1
                    = (RuntimeException_Sub1) throwable;
            string
                    = (runtimeexception_sub1.aString4594
                    + " | ");
            throwable = (runtimeexception_sub1
                    .aThrowable4595);
        } else
            string = "";
        StringWriter stringwriter = new StringWriter();
        PrintWriter printwriter = new PrintWriter(stringwriter);
        throwable.printStackTrace(printwriter);
        printwriter.close();
        String string_8_ = stringwriter.toString();
        BufferedReader bufferedreader
                = new BufferedReader(new StringReader(string_8_));
        if (bool != false)
            method2765(-61);
        String string_9_ = bufferedreader.readLine();
        for (; ; ) {
            String string_10_ = bufferedreader.readLine();
            if (string_10_ == null)
                break;
            int i = string_10_.indexOf('(');
            int i_11_ = string_10_.indexOf(')', 1 + i);
            String string_12_;
            if (i == -1)
                string_12_ = string_10_;
            else
                string_12_ = string_10_.substring(0, i);
            string_12_ = string_12_.trim();
            string_12_ = string_12_.substring(1 + string_12_.lastIndexOf(' '));
            string_12_
                    = string_12_.substring(1 + string_12_.lastIndexOf('\t'));
            string += string_12_;
            if (i != -1 && i_11_ != -1) {
                int i_13_ = string_10_.indexOf(".java:", i);
                if (i_13_ >= 0)
                    string += string_10_.substring(i_13_ - -5, i_11_);
            }
            string += ' ';
        }
        string += "| " + string_9_;
        return string;
    }

    final void method2754(int i, byte i_14_, int i_15_) {
        anInt8833 = i;
        if (i_14_ >= 7) {
            anInt8843++;
            anInt8841 = i_15_;
            int i_16_ = Class348_Sub40_Sub1.method3051(anInt8841, 4096);
            int i_17_ = Class348_Sub40_Sub1.method3051(anInt8833, 4096);
            if (anInt8826 != i_16_
                    || anInt8838 != i_17_) {
                if (aClass258_Sub3Array8837 != null) {
                    for (int i_18_ = 0;
                         (i_18_ < aClass258_Sub3Array8837.length);
                         i_18_++)
                        aClass258_Sub3Array8837[i_18_].method1952(-19948);
                    aClass258_Sub3Array8837 = null;
                }
                if (i_16_ > 256 || i_17_ > 256) {
                    int i_19_ = i_16_;
                    int i_20_ = i_17_;
                    int i_21_ = 0;
                    while (i_19_ > 256 || i_20_ > 256) {
                        if (i_20_ > 256)
                            i_20_ >>= 1;
                        if (i_19_ > 256)
                            i_19_ >>= 1;
                        i_21_++;
                    }
                    if (aClass206_8844 == null)
                        aClass206_8844 = new Class206(this
                                .aHa_Sub2_6618);
                    i_19_ = i_16_;
                    aClass258_Sub3Array8837 = new Class258_Sub3[i_21_];
                    i_20_ = i_17_;
                    i_21_ = 0;
                    while (i_19_ > 256
                            || i_20_ > 256) {
                        aClass258_Sub3Array8837[i_21_++]
                                = new Class258_Sub3((this
                                .aHa_Sub2_6618),
                                3553, 34842, i_19_, i_20_);
                        if (i_20_ > 256)
                            i_20_ >>= 1;
                        if (i_19_ > 256)
                            i_19_ >>= 1;
                    }
                } else
                    aClass206_8844 = null;
                anInt8826 = i_16_;
                anInt8838 = i_17_;
            }
        }
    }

    final void method2763(byte i) {
        aClass337_8822 = null;
        aClass258_Sub3_8835 = null;
        aClass206_8844 = null;
        aClass206_8825 = null;
        aClass337_8842 = null;
        anInt8839++;
        aClass258_Sub3Array8837 = null;
        aClass337_8824 = null;
        aClass337_8836 = null;
        if (i > -123)
            method2756((byte) -56, -105);
        aClass258_Sub3_8830 = null;
    }

    final boolean method2751(boolean bool) {
        if (bool != true)
            method2751(true);
        anInt8829++;
        return aClass206_8825 != null;
    }

    final boolean method2767(byte i) {
        if (i != 104)
            return false;
        anInt8840++;
        return this.aHa_Sub2_6618.aBoolean7820
                && this.aHa_Sub2_6618.aBoolean7783
                && this.aHa_Sub2_6618.aBoolean7818;
    }

    final int method2761(boolean bool) {
        anInt8827++;
        if (bool != true)
            anInt8833 = -77;
        return 1;
    }

    final boolean method2758(int i) {
        if (i < 84)
            aClass206_8844 = null;
        anInt8834++;
        if (this.aHa_Sub2_6618.aBoolean7820
                && this.aHa_Sub2_6618.aBoolean7783
                && this.aHa_Sub2_6618.aBoolean7818) {
            aClass206_8825
                    = new Class206(this.aHa_Sub2_6618);
            aClass258_Sub3_8835
                    = new Class258_Sub3(this.aHa_Sub2_6618, 3553,
                    34842, 256, 256);
            aClass258_Sub3_8835.method1965(false, false, 10243);
            aClass258_Sub3_8830
                    = new Class258_Sub3(this.aHa_Sub2_6618, 3553,
                    34842, 256, 256);
            aClass258_Sub3_8830.method1965(false, false, 10243);
            this.aHa_Sub2_6618.method3773(-1,
                    aClass206_8825);
            aClass206_8825.method1509(aClass258_Sub3_8835, 0, 0);
            aClass206_8825.method1509(aClass258_Sub3_8830, 0, 1);
            aClass206_8825.method1503(0, (byte) 3);
            if (!aClass206_8825.method1507(124)) {
                this.aHa_Sub2_6618
                        .method3770(-422613672, aClass206_8825);
                return false;
            }
            this.aHa_Sub2_6618.method3770(-422613672,
                    aClass206_8825);
            aClass337_8842
                    = (Class318_Sub1_Sub5_Sub2.method2493
                    (this.aHa_Sub2_6618, -1,
                            (new Class242[]
                                    {Class348_Sub42_Sub15.method3249
                                            (35632, 80, this.aHa_Sub2_6618,
                                                    "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")})));
            aClass337_8824
                    = (Class318_Sub1_Sub5_Sub2.method2493
                    (this.aHa_Sub2_6618, -1,
                            (new Class242[]
                                    {Class348_Sub42_Sub15.method3249
                                            (35632, -45, this.aHa_Sub2_6618,
                                                    "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n")})));
            aClass337_8836
                    = (Class318_Sub1_Sub5_Sub2.method2493
                    (this.aHa_Sub2_6618, -1,
                            (new Class242[]
                                    {Class348_Sub42_Sub15.method3249
                                            (35632, -108, this.aHa_Sub2_6618,
                                                    "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = sceneCol*(postLum/preLum)+bloomCol*params.x;\n}\n")})));
            aClass337_8822
                    = (Class318_Sub1_Sub5_Sub2.method2493
                    (this.aHa_Sub2_6618, -1,
                            (new Class242[]
                                    {Class348_Sub42_Sub15.method3249
                                            (35632, -31, this.aHa_Sub2_6618,
                                                    "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n")})));
            return aClass337_8824 != null && aClass337_8842 != null
                    && aClass337_8836 != null && aClass337_8822 != null;
        }
        return false;
    }

    Class348_Sub5_Sub1(ha_Sub2 var_ha_Sub2) {
        super(var_ha_Sub2);
    }
}
