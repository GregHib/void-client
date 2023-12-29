/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import jaggl.OpenGL;

final class Class188 {
    private final ha_Sub2 aHa_Sub2_2511;
    static Class351 aClass351_2512;
    private Class337 aClass337_2513;
    static boolean aBoolean2514 = false;
    static int anInt2515;
    static int anInt2516;
    static int anInt2517;
    static int anInt2518;
    static int anInt2519;
    static int anInt2520;

    public static void method1411(boolean bool) {
        if (bool != true) method1416(121);
        aClass351_2512 = null;
    }

    static final boolean method1412(byte i, int i_0_, int i_1_) {
        if (i != -35) method1411(true);
        anInt2519++;
        return (i_1_ & 0x800) != 0 && (0x37 & i_0_) != 0;
    }

    final boolean method1413(Class258_Sub1 class258_sub1, Class258_Sub1 class258_sub1_2_, int i, float f) {
        try {
            anInt2517++;
            if (!method1414(35632)) return false;
            Class206 class206 = aHa_Sub2_2511.aClass206_7778;
            int i_3_ = 30 % ((-55 - i) / 59);
            Class348_Sub42_Sub2 class348_sub42_sub2 = new Class348_Sub42_Sub2(aHa_Sub2_2511, 6408, (class258_sub1.anInt8523), (class258_sub1.anInt8529));
            aHa_Sub2_2511.method3773(-1, class206);
            boolean bool = false;
            class206.method1508(0, class348_sub42_sub2, -12);
            if (class206.method1507(117)) {
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5889);
                OpenGL.glPushMatrix();
                OpenGL.glLoadIdentity();
                OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                OpenGL.glPushAttrib(2048);
                OpenGL.glViewport(0, 0, class258_sub1.anInt8523, class258_sub1.anInt8529);
                OpenGL.glUseProgramObjectARB(aClass337_2513.aLong4178);
                OpenGL.glUniform1iARB((OpenGL.glGetUniformLocationARB(aClass337_2513.aLong4178, "heightMap")), 0);
                OpenGL.glUniform1fARB((OpenGL.glGetUniformLocationARB(aClass337_2513.aLong4178, "rcpRelief")), 1.0F / f);
                OpenGL.glUniform2fARB(OpenGL.glGetUniformLocationARB(aClass337_2513.aLong4178, "sampleSize"), (1.0F / (float) class258_sub1_2_.anInt8523), (1.0F / (float) class258_sub1_2_.anInt8529));
                for (int i_4_ = 0; i_4_ < class258_sub1.anInt8522; i_4_++) {
                    float f_5_ = ((float) i_4_ / (float) (class258_sub1.anInt8522));
                    aHa_Sub2_2511.method3771((byte) -118, class258_sub1_2_);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord3f(0.0F, 0.0F, f_5_);
                    OpenGL.glVertex2f(0.0F, 0.0F);
                    OpenGL.glTexCoord3f(1.0F, 0.0F, f_5_);
                    OpenGL.glVertex2f(1.0F, 0.0F);
                    OpenGL.glTexCoord3f(1.0F, 1.0F, f_5_);
                    OpenGL.glVertex2f(1.0F, 1.0F);
                    OpenGL.glTexCoord3f(0.0F, 1.0F, f_5_);
                    OpenGL.glVertex2f(0.0F, 1.0F);
                    OpenGL.glEnd();
                    class258_sub1.method1958(-26823, 0, class258_sub1.anInt8523, 0, 0, i_4_, class258_sub1.anInt8529, 0);
                }
                OpenGL.glUseProgramObjectARB(0L);
                OpenGL.glPopAttrib();
                OpenGL.glPopMatrix();
                OpenGL.glMatrixMode(5888);
                OpenGL.glPopMatrix();
                bool = true;
            }
            class206.method1500(2983, 0);
            aHa_Sub2_2511.method3770(-422613672, class206);
            return bool;
        } catch (RuntimeException runtimeexception) {
            throw Class348_Sub17.method2929(runtimeexception, ("qi.D(" + (class258_sub1 != null ? "{...}" : "null") + ',' + (class258_sub1_2_ != null ? "{...}" : "null") + ',' + i + ',' + f + ')'));
        }
    }

    final boolean method1414(int i) {
        if (aHa_Sub2_2511.aBoolean7820 && aHa_Sub2_2511.aBoolean7783 && aClass337_2513 == null) {
            Class242 class242 = (Class348_Sub42_Sub15.method3249(35632, 121, aHa_Sub2_2511, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"));
            if (class242 != null) aClass337_2513 = Class318_Sub1_Sub5_Sub2.method2493(aHa_Sub2_2511, i + -35633, (new Class242[]{class242}));
        }
        anInt2518++;
        if (i != 35632) method1413(null, null, 102, 0.17865802F);
        return aClass337_2513 != null;
    }

    static final void method1415(int i, int i_6_) {
        anInt2520++;
        Class348_Sub42_Sub15 class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, (byte) 105, 17);
        if (i_6_ < 106) method1417(-62, null, -125);
        class348_sub42_sub15.method3251(-16058);
    }

    static final void method1416(int i) {
        Class229.aClass268_2979.method2032(5, -101);
        anInt2515++;
        Class362.aClass183_4460.method1383(i ^ 0x804c, 5);
        Class348_Sub40_Sub25.aClass150_9342.method1207(-17452, 5);
        Class348_Sub40_Sub12.aClass263_9195.method2010(5, i + -6);
        Class189.aClass278_2529.method2076(5, true);
        Exception_Sub1.aClass255_112.method1937(5, false);
        Class10.aClass87_191.method836(5, 93);
        Class348_Sub40_Sub18.aClass319_9245.method2544(5, (byte) -41);
        Class229.aClass194_2981.method1442(5, (byte) 1);
        Class269.aClass217_3453.method1587(5, i ^ 0xeab);
        Class64_Sub3.aClass261_5558.method1984((byte) 119, 5);
        Class348_Sub23_Sub2.aClass153_9031.method1224(5, (byte) -98);
        Class2.aClass141_117.method1176(5, (byte) 52);
        Class101_Sub3.aClass326_5764.method2603(5, 11);
        Class348_Sub23_Sub2.aClass187_9036.method1409(5, -20721);
        Class30.aClass84_413.method819((byte) 74, 5);
        Class123.aClass25_1813.method299(5, 16);
        Class348_Sub1.aClass185_6559.method1392(88, 5);
        Class239.aClass166_3147.method1285(i, 8);
        Class136.aClass65_4787.method697(5, 26);
        Class73.aClass219_4782.method1603(5, -66);
        Class97.method876(5, 0);
        Class59.method545(50, -1);
        Class2.method174(50, -30742);
        Class94.method865(-8186, 5);
        Class171.method1323(5, 26603);
        Class353.aClass60_4346.method578(i + -3, 5);
        Class328_Sub2.aClass60_6517.method578(2, 5);
        Class348_Sub1_Sub1.aClass60_8807.method578(i ^ 0x7, 5);
        Class34.aClass60_463.method578(2, 5);
        Class66.aClass60_1174.method578(2, 5);
    }

    static final Class348_Sub17 method1417(int i, Index index, int i_7_) {
        anInt2516++;
        if (i != 0) aBoolean2514 = true;
        byte[] is = index.method415((byte) 73, i_7_);
        if (is == null) return null;
        return new Class348_Sub17(is);
    }

    Class188(ha_Sub2 var_ha_Sub2) {
        aHa_Sub2_2511 = var_ha_Sub2;
    }

    static {
        aClass351_2512 = new Class351(16, 7);
    }
}
