import jaggl.OpenGL.Companion.glGetUniformLocationARB
import jaggl.OpenGL.Companion.glUniform1fARB
import jaggl.OpenGL.Companion.glUniform1iARB
import jaggl.OpenGL.Companion.glUniform3fARB
import jaggl.OpenGL.Companion.glUniform4fARB
import jaggl.OpenGL.Companion.glUseProgramObjectARB
import kotlin.math.abs
import kotlin.math.min

class Class286_Sub6 internal constructor(var_ha_Sub2: ha_Sub2, class83: Class83?) : Class286(var_ha_Sub2) {
    private var aBoolean6266 = false
    private val aClass83_6268: Class83?
    private var aBoolean6272 = false
    private var aClass337_6274: Class337? = null
    override fun method2140(class258: Class258?, i: Byte, i_0_: Int) {
        if (!aBoolean6266) {
            this.aHa_Sub2_3684.method3771((-128).toByte(), class258)
            this.aHa_Sub2_3684.method3761(0, i_0_)
        }
        anInt6269++
        if (i >= -89) method2140(null, (-85).toByte(), 27)
    }

    override fun method2139(bool: Boolean, i: Byte) {
        val i_1_ = -57 / ((-60 - i) / 38)
        anInt6263++
    }

    override fun method2137(i: Int): Boolean {
        if (i >= -5) return true
        anInt6267++
        return false
    }

    override fun method2134(bool: Boolean, bool_3_: Boolean) {
        if (bool_3_ == false) {
            anInt6264++
            val class258_sub2 = this.aHa_Sub2_3684.method3741(444720536)
            if (aBoolean6272 && class258_sub2 != null) {
                this.aHa_Sub2_3684.method3738(-15039, 1)
                this.aHa_Sub2_3684.method3771((-126).toByte(), class258_sub2)
                this.aHa_Sub2_3684.method3738(-15039, 0)
                this.aHa_Sub2_3684.method3771((-75).toByte(), aClass83_6268!!.aClass258_Sub1_1443)
                val l = aClass337_6274!!.aLong4178
                glUseProgramObjectARB(l)
                glUniform1iARB(glGetUniformLocationARB(l, "normalSampler"), 0)
                glUniform1iARB(glGetUniformLocationARB(l, "envMapSampler"), 1)
                glUniform3fARB(glGetUniformLocationARB(l, "sunDir"), -(this.aHa_Sub2_3684.aFloatArray7825[0]), -(this.aHa_Sub2_3684.aFloatArray7825[1]), -(this.aHa_Sub2_3684.aFloatArray7825[2]))
                glUniform4fARB(glGetUniformLocationARB(l, "sunColour"), this.aHa_Sub2_3684.aFloat7781, this.aHa_Sub2_3684.aFloat7816, this.aHa_Sub2_3684.aFloat7823, 1.0f)
                glUniform1fARB(glGetUniformLocationARB(l, "sunExponent"), (96.0f + abs(this.aHa_Sub2_3684.aFloatArray7825[1]) * 928.0f))
                aBoolean6266 = true
            }
        }
    }

    override fun method2133(i: Int) {
        if (i <= -75) {
            anInt6265++
            if (aBoolean6266) {
                this.aHa_Sub2_3684.method3738(-15039, 1)
                this.aHa_Sub2_3684.method3771((-108).toByte(), null)
                this.aHa_Sub2_3684.method3738(-15039, 0)
                this.aHa_Sub2_3684.method3771((-121).toByte(), null)
                glUseProgramObjectARB(0L)
                aBoolean6266 = false
            }
        }
    }

    init {
        do {
            try {
                aClass83_6268 = class83
                if (aClass83_6268!!.aClass258_Sub1_1443 == null || !(this.aHa_Sub2_3684.aBoolean7791) || !(this.aHa_Sub2_3684.aBoolean7783)) break
                val class242 = (Class348_Sub42_Sub15.method3249(
                    35633,
                    -110,
                    this.aHa_Sub2_3684,
                    "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = 1.0-clamp((gl_Fog.end+ecVertex.z)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n"
                ))
                val class242_4_ = (Class348_Sub42_Sub15.method3249(
                    35632,
                    -38,
                    this.aHa_Sub2_3684,
                    "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n"
                ))
                aClass337_6274 = Class318_Sub1_Sub5_Sub2.method2493((this.aHa_Sub2_3684), -1, (arrayOf<Class242?>(class242, class242_4_)))
                aBoolean6272 = aClass337_6274 != null
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("tia.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (class83 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    override fun method2136(i: Int, i_5_: Int, i_6_: Byte) {
        if (aBoolean6266) {
            val i_7_ = 1 shl (0x3 and i)
            val f = (1 shl ((i and 0x3d) shr 3)).toFloat() / 32.0f
            val i_8_ = i_5_ and 0xffff
            val f_9_ = (0x3 and (i_5_ shr 16)).toFloat() / 8.0f
            val l = aClass337_6274!!.aLong4178
            glUniform1fARB(glGetUniformLocationARB(l, "time"), (i_7_ * (this.aHa_Sub2_3684.anInt7735) % 40000).toFloat() / 40000.0f)
            glUniform1fARB(glGetUniformLocationARB(l, "scale"), f)
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterDepth"), i_8_.toFloat())
            glUniform1fARB(glGetUniformLocationARB(l, "breakWaterOffset"), f_9_)
        }
        if (i_6_ >= -42) method2163(false)
        anInt6275++
    }

    companion object {
        @JvmField
        var aClass230_6262: Class230? = Class230("game3", 2)
        @JvmField
        var anInt6263: Int = 0
        @JvmField
        var anInt6264: Int = 0
        @JvmField
        var anInt6265: Int = 0
        @JvmField
        var anInt6267: Int = 0
        @JvmField
        var anInt6269: Int = 0
        @JvmField
        var aBooleanArray6270: BooleanArray? = null
        @JvmField
        var anInt6271: Int = 0
        @JvmField
        var anInt6273: Int = 0
        @JvmField
        var anInt6275: Int = 0
        @JvmField
        var aLong6276: Long = 0

        @JvmStatic
        fun method2162(bool: Boolean): String {
            if (bool != false) aLong6276 = -88L
            anInt6271++
            var string = "www"
            if (Class367_Sub8.aClass364_7361 != Class8.aClass364_165) {
                if (Class8.aClass364_165 != Class26.aClass364_382) {
                    if (Class8.aClass364_165 == Class108.aClass364_1657) string = "www-wtwip"
                } else string = "www-wtqa"
            } else string = "www-wtrc"
            var string_2_ = ""
            if (Class239_Sub12.aString5966 != null) string_2_ = "/p=" + Class239_Sub12.aString5966
            return ("http://" + string + "." + (Class348_Sub42_Sub8_Sub2.aClass230_10434?.aString2985) + ".com/l=" + Class348_Sub33.anInt6967 + "/a=" + Class202.anInt2670 + string_2_ + "/")
        }

        @JvmStatic
        fun method2163(bool: Boolean): Boolean {
            anInt6273++
            try {
                if (Class348_Sub43.anInt7068 == 2) {
                    if (Class286.Companion.aClass348_Sub2_3683 == null) {
                        Class286.Companion.aClass348_Sub2_3683 = Class348_Sub2.method2734(Class124.aClass45_1848!!, (Class318_Sub1_Sub4_Sub1.anInt10074), Class318.anInt3971)
                        if (Class286.Companion.aClass348_Sub2_3683 == null) return false
                    }
                    if (Class141.aClass26_1977 == null) Class141.aClass26_1977 = Class26(Class43.aClass45_611, Class333.aClass45_4147)
                    var class348_sub16_sub3 = Class98.aClass348_Sub16_Sub3_1564!!
                    if (Class285.aClass348_Sub16_Sub3_4743 != null) class348_sub16_sub3 = Class285.aClass348_Sub16_Sub3_4743!!
                    if (class348_sub16_sub3.method2866((Class286.Companion.aClass348_Sub2_3683), 22050, Class141.aClass26_1977, Class367_Sub9.aClass45_7371, -35)) {
                        Class98.aClass348_Sub16_Sub3_1564 = class348_sub16_sub3
                        Class98.aClass348_Sub16_Sub3_1564!!.method2864(52.toByte())
                        if (Class348_Sub40_Sub35.anInt9444 <= 0) {
                            Class348_Sub43.anInt7068 = 0
                            Class98.aClass348_Sub16_Sub3_1564!!.method2861(0, Class58.anInt1059)
                            for (i in Class367_Sub3.anIntArray7299!!.indices) {
                                Class98.aClass348_Sub16_Sub3_1564!!.method2843(Class367_Sub3.anIntArray7299!![i], i, -7836)
                                Class367_Sub3.anIntArray7299!![i] = 255
                            }
                        } else {
                            Class348_Sub43.anInt7068 = 3
                            Class98.aClass348_Sub16_Sub3_1564!!.method2861(0, (min(Class58.anInt1059, Class348_Sub40_Sub35.anInt9444)))
                            var i = 0
                            while ((Class367_Sub3.anIntArray7299!!.size > i)) {
                                Class98.aClass348_Sub16_Sub3_1564!!.method2843(Class367_Sub3.anIntArray7299!![i], i, -7836)
                                Class367_Sub3.anIntArray7299!![i] = 255
                                i++
                            }
                        }
                        if (Class285.aClass348_Sub16_Sub3_4743 == null) {
                            if (Class239_Sub12.aLong5971 <= 0) Class98.aClass348_Sub16_Sub3_1564!!.method2869(Class286.Companion.aClass348_Sub2_3683, Class346.aBoolean4275, false)
                            else Class98.aClass348_Sub16_Sub3_1564!!.method2870(Class286.Companion.aClass348_Sub2_3683, Class239_Sub12.aLong5971, Class346.aBoolean4275, true, 24.toByte())
                        }
                        if (Class318_Sub1_Sub4.aClass279_8764 != null) Class318_Sub1_Sub4.aClass279_8764!!.method2088(bool, Class98.aClass348_Sub16_Sub3_1564)
                        Class124.aClass45_1848 = null
                        Class286.Companion.aClass348_Sub2_3683 = null
                        Class239_Sub12.aLong5971 = 0L
                        Class141.aClass26_1977 = null
                        Class285.aClass348_Sub16_Sub3_4743 = null
                        return true
                    }
                }
                if (bool != false) aBooleanArray6270 = null
            } catch (exception: Exception) {
                exception.printStackTrace()
                Class98.aClass348_Sub16_Sub3_1564!!.method2877(-128)
                Class285.aClass348_Sub16_Sub3_4743 = null
                Class141.aClass26_1977 = null
                Class286.Companion.aClass348_Sub2_3683 = null
                Class124.aClass45_1848 = null
                Class348_Sub43.anInt7068 = 0
            }
            return false
        }

        @JvmStatic
        fun method2164(bool: Boolean) {
            if (bool == true) {
                aClass230_6262 = null
                aBooleanArray6270 = null
            }
        }
    }
}
