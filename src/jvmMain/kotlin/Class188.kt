import Class171.Companion.method1323
import Class2.Companion.method174
import Class59.Companion.method545
import Class94.method865
import Class97.Companion.method876
import jaggl.OpenGL.Companion.glBegin
import jaggl.OpenGL.Companion.glEnd
import jaggl.OpenGL.Companion.glGetUniformLocationARB
import jaggl.OpenGL.Companion.glLoadIdentity
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glOrtho
import jaggl.OpenGL.Companion.glPopAttrib
import jaggl.OpenGL.Companion.glPopMatrix
import jaggl.OpenGL.Companion.glPushAttrib
import jaggl.OpenGL.Companion.glPushMatrix
import jaggl.OpenGL.Companion.glTexCoord3f
import jaggl.OpenGL.Companion.glUniform1fARB
import jaggl.OpenGL.Companion.glUniform1iARB
import jaggl.OpenGL.Companion.glUniform2fARB
import jaggl.OpenGL.Companion.glUseProgramObjectARB
import jaggl.OpenGL.Companion.glVertex2f
import jaggl.OpenGL.Companion.glViewport

class Class188 internal constructor(private val aHa_Sub2_2511: ha_Sub2) {
    private var aClass337_2513: Class337? = null
    fun method1413(class258_sub1: Class258_Sub1?, class258_sub1_2_: Class258_Sub1?, i: Int, f: Float): Boolean {
        try {
            anInt2517++
            if (!method1414(35632)) return false
            val class206 = aHa_Sub2_2511.aClass206_7778
            val i_3_ = 30 % ((-55 - i) / 59)
            val class348_sub42_sub2 = Class348_Sub42_Sub2(aHa_Sub2_2511, 6408, (class258_sub1!!.anInt8523), (class258_sub1.anInt8529))
            aHa_Sub2_2511.method3773(-1, class206)
            var bool = false
            class206!!.method1508(0, class348_sub42_sub2, -12)
            if (class206.method1507(117)) {
                glPushMatrix()
                glLoadIdentity()
                glMatrixMode(5889)
                glPushMatrix()
                glLoadIdentity()
                glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0)
                glPushAttrib(2048)
                glViewport(0, 0, class258_sub1.anInt8523, class258_sub1.anInt8529)
                glUseProgramObjectARB(aClass337_2513!!.aLong4178)
                glUniform1iARB((glGetUniformLocationARB(aClass337_2513!!.aLong4178, "heightMap")), 0)
                glUniform1fARB((glGetUniformLocationARB(aClass337_2513!!.aLong4178, "rcpRelief")), 1.0f / f)
                glUniform2fARB(glGetUniformLocationARB(aClass337_2513!!.aLong4178, "sampleSize"), (1.0f / class258_sub1_2_!!.anInt8523.toFloat()), (1.0f / class258_sub1_2_.anInt8529.toFloat()))
                for (i_4_ in 0..<class258_sub1.anInt8522) {
                    val f_5_ = (i_4_.toFloat() / (class258_sub1.anInt8522).toFloat())
                    aHa_Sub2_2511.method3771((-118).toByte(), class258_sub1_2_)
                    glBegin(7)
                    glTexCoord3f(0.0f, 0.0f, f_5_)
                    glVertex2f(0.0f, 0.0f)
                    glTexCoord3f(1.0f, 0.0f, f_5_)
                    glVertex2f(1.0f, 0.0f)
                    glTexCoord3f(1.0f, 1.0f, f_5_)
                    glVertex2f(1.0f, 1.0f)
                    glTexCoord3f(0.0f, 1.0f, f_5_)
                    glVertex2f(0.0f, 1.0f)
                    glEnd()
                    class258_sub1.method1958(-26823, 0, class258_sub1.anInt8523, 0, 0, i_4_, class258_sub1.anInt8529, 0)
                }
                glUseProgramObjectARB(0L)
                glPopAttrib()
                glPopMatrix()
                glMatrixMode(5888)
                glPopMatrix()
                bool = true
            }
            class206.method1500(2983, 0)
            aHa_Sub2_2511.method3770(-422613672, class206)
            return bool
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qi.D(" + (if (class258_sub1 != null) "{...}" else "null") + ',' + (if (class258_sub1_2_ != null) "{...}" else "null") + ',' + i + ',' + f + ')'))
        }
    }

    fun method1414(i: Int): Boolean {
        if (aHa_Sub2_2511.aBoolean7820 && aHa_Sub2_2511.aBoolean7783 && aClass337_2513 == null) {
            val class242 = (Class348_Sub42_Sub15.method3249(
                35632,
                121,
                aHa_Sub2_2511,
                "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n"
            ))
            if (class242 != null) aClass337_2513 = Class318_Sub1_Sub5_Sub2.method2493(aHa_Sub2_2511, i + -35633, (arrayOf<Class242?>(class242)))
        }
        anInt2518++
        if (i != 35632) method1413(null, null, 102, 0.17865802f)
        return aClass337_2513 != null
    }

    companion object {
        @JvmField
        var aClass351_2512: Class351?
        var aBoolean2514: Boolean = false
        var anInt2515: Int = 0
        var anInt2516: Int = 0
        var anInt2517: Int = 0
        var anInt2518: Int = 0
        var anInt2519: Int = 0
        var anInt2520: Int = 0

        @JvmStatic
        fun method1411(bool: Boolean) {
            if (bool != true) method1416(121)
            aClass351_2512 = null
        }

        fun method1412(i: Byte, i_0_: Int, i_1_: Int): Boolean {
            if (i.toInt() != -35) method1411(true)
            anInt2519++
            return (i_1_ and 0x800) != 0 && (0x37 and i_0_) != 0
        }

        fun method1415(i: Int, i_6_: Int) {
            anInt2520++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i, 105.toByte(), 17)
            class348_sub42_sub15.method3251(-16058)
        }

        @JvmStatic
        fun method1416(i: Int) {
            Class229.aClass268_2979!!.method2032(5, -101)
            anInt2515++
            Class362.aClass183_4460!!.method1383(i xor 0x804c, 5)
            Class348_Sub40_Sub25.aClass150_9342!!.method1207(-17452, 5)
            Class348_Sub40_Sub12.aClass263_9195!!.method2010(5, i + -6)
            Class189.Companion.aClass278_2529!!.method2076(5, true)
            Exception_Sub1.aClass255_112!!.method1937(5, false)
            Class10.aClass87_191!!.method836(5, 93)
            Class348_Sub40_Sub18.aClass319_9245!!.method2544(5, (-41).toByte())
            Class229.aClass194_2981!!.method1442(5, 1.toByte())
            Class269.aClass217_3453!!.method1587(5, i xor 0xeab)
            Class64_Sub3.aClass261_5558!!.method1984(119.toByte(), 5)
            Class348_Sub23_Sub2.aClass153_9031!!.method1224(5, (-98).toByte())
            Class2.aClass141_117!!.method1176(5, 52.toByte())
            Class101_Sub3.aClass326_5764!!.method2603(5, 11)
            Class348_Sub23_Sub2.aClass187_9036!!.method1409(5, -20721)
            Class30.aClass84_413!!.method819(74.toByte(), 5)
            Class123.aClass25_1813!!.method299(5, 16)
            Class348_Sub1.aClass185_6559!!.method1392(88, 5)
            Class239.aClass166_3147!!.method1285(i, 8)
            Class136.aClass65_4787!!.method697(5, 26)
            Class73.aClass219_4782!!.method1603(5, -66)
            method876(5, 0)
            method545(50, -1)
            method174(50, -30742)
            method865(-8186, 5)
            method1323(5, 26603)
            Class353.aClass60_4346!!.method578(i + -3, 5)
            Class328_Sub2.aClass60_6517!!.method578(2, 5)
            Class348_Sub1_Sub1.aClass60_8807!!.method578(i xor 0x7, 5)
            Class34.aClass60_463!!.method578(2, 5)
            Class66.aClass60_1174!!.method578(2, 5)
        }

        fun method1417(i: Int, class45: Class45, i_7_: Int): Class348_Sub17? {
            anInt2516++
            if (i != 0) aBoolean2514 = true
            val `is` = class45.method415(73.toByte(), i_7_)
            if (`is` == null) return null
            return Class348_Sub17(`is`)
        }

        init {
            aClass351_2512 = Class351(16, 7)
        }
    }
}
