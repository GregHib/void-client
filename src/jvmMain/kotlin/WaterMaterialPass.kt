import TwoStateOptionStateStatics.method1847
import MinimapShapeDrawerStatics.method459
import jaggl.OpenGLStatics.glBindProgramARB
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glLoadMatrixf
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glProgramLocalParameter4fARB
import jaggl.OpenGLStatics.glProgramLocalParameter4fvARB
import java.util.*
import WaterMaterialPassStatics.anInt6215
import WaterMaterialPassStatics.anInt6216
import WaterMaterialPassStatics.anInt6217
import WaterMaterialPassStatics.anInt6224
import WaterMaterialPassStatics.anInt6229
import WaterMaterialPassStatics.anInt6231
import WaterMaterialPassStatics.anInt6232

class WaterMaterialPass internal constructor(var_ha_Sub2: OpenGlRenderer, waterTextureSet: WaterTextureSet?) : MaterialPass(var_ha_Sub2) {
    private var aFloatArray6218: FloatArray? = null
    private var anInt6219 = 0
    private var aRefCountedHandle_6220: RefCountedHandle? = null
    private var aGlDisplayListFont_6222: GlDisplayListFont? = null
    private var aFloat6225 = 0f
    private val aWaterTextureSet_6227: WaterTextureSet?
    override fun method2136(i: Int, i_0_: Int, i_1_: Byte) {
        anInt6224++
        if (aGlDisplayListFont_6222 != null) {
            if (i_1_ >= -42) method2149(-65)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            if ((i and 0x80) != 0) this.aHa_Sub2_3684.method3771((-122).toByte(), null)
            else if ((0x1 and i_0_) != 1) {
                if (!aWaterTextureSet_6227!!.aBoolean1442) this.aHa_Sub2_3684.method3771((-84).toByte(), aWaterTextureSet_6227.aClass258_Sub3Array1444!![0])
                else this.aHa_Sub2_3684.method3771((-97).toByte(), aWaterTextureSet_6227.aClass258_Sub1_1440)
                glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f)
            } else if (aWaterTextureSet_6227!!.aBoolean1442) {
                this.aHa_Sub2_3684.method3771((-83).toByte(), aWaterTextureSet_6227.aClass258_Sub1_1440)
                glProgramLocalParameter4fARB(34336, 65, aFloat6225, 0.0f, 0.0f, 1.0f)
            } else {
                val i_2_ = (this.aHa_Sub2_3684.anInt7735 % 4000 * 16 / 4000)
                this.aHa_Sub2_3684.method3771((-88).toByte(), aWaterTextureSet_6227.aClass258_Sub3Array1444!![i_2_])
                glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f)
            }
            this.aHa_Sub2_3684.method3738(-15039, 0)
            if ((0x40 and i) == 0) {
                ParamMapStatics.aFloatArray9491!![2] = (this.aHa_Sub2_3684.aFloat7823 * (this.aHa_Sub2_3684.aFloat7768))
                ParamMapStatics.aFloatArray9491!![0] = (this.aHa_Sub2_3684.aFloat7781 * (this.aHa_Sub2_3684.aFloat7768))
                ParamMapStatics.aFloatArray9491!![1] = (this.aHa_Sub2_3684.aFloat7768 * (this.aHa_Sub2_3684.aFloat7816))
                glProgramLocalParameter4fvARB(34336, 66, (ParamMapStatics.aFloatArray9491), 0)
            } else glProgramLocalParameter4fARB(34336, 66, 1.0f, 1.0f, 1.0f, 1.0f)
            val i_3_ = i and 0x3
            if (i_3_ == 2) glProgramLocalParameter4fARB(34336, 64, 0.05f, 1.0f, 1.0f, 1.0f)
            else if (i_3_ == 3) glProgramLocalParameter4fARB(34336, 64, 0.1f, 1.0f, 1.0f, 1.0f)
            else glProgramLocalParameter4fARB(34336, 64, 0.025f, 1.0f, 1.0f, 1.0f)
        }
    }

    override fun method2140(glTexture: GlTexture?, i: Byte, i_4_: Int) {
        if (i <= -89) {
            anInt6216++
            this.aHa_Sub2_3684.method3771((-115).toByte(), glTexture)
            this.aHa_Sub2_3684.method3761(0, i_4_)
        }
    }

    init {
        do {
            try {
                aWaterTextureSet_6227 = waterTextureSet
                if (!this.aHa_Sub2_3684.aBoolean7841 || (this.aHa_Sub2_3684.anInt7795 < 2)) break
                aRefCountedHandle_6220 = (method459(
                    34336,
                    this.aHa_Sub2_3684,
                    "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND",
                    false
                ))
                if (aRefCountedHandle_6220 != null) {
                    val `is` = CipheredPacketBufferStatics.method3413(4, 3, 64, 4, 256, true, 0, 0.4f, false)
                    val is_5_ = CipheredPacketBufferStatics.method3413(4, 3, 64, 4, 256, true, 8, 0.4f, false)
                    aFloatArray6218 = FloatArray(32768)
                    var i = 0
                    for (i_6_ in 0..255) {
                        val is_7_ = `is`[i_6_]!!
                        val is_8_ = is_5_[i_6_]!!
                        for (i_9_ in 0..63) {
                            aFloatArray6218!![i++] = is_7_[i_9_].toFloat() / 4096.0f
                            aFloatArray6218!![i++] = is_8_[i_9_].toFloat() / 4096.0f
                        }
                    }
                    method2149(-25)
                }
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("em.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (waterTextureSet != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    private fun method2149(i: Int) {
        anInt6217++
        aGlDisplayListFont_6222 = GlDisplayListFont(this.aHa_Sub2_3684, 2)
        aGlDisplayListFont_6222!!.method595(103.toByte(), 0)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        this.aHa_Sub2_3684.method3808(-16777216, 118)
        this.aHa_Sub2_3684.method3729(260, 114.toByte(), 7681)
        this.aHa_Sub2_3684.method3775(false, 0, 770, 34166)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        glBindProgramARB(34336, aRefCountedHandle_6220!!.anInt2270)
        glEnable(34336)
        aGlDisplayListFont_6222!!.method591(-1)
        aGlDisplayListFont_6222!!.method595(127.toByte(), 1)
        val i_10_ = 65 / ((i - 62) / 49)
        this.aHa_Sub2_3684.method3738(-15039, 1)
        glMatrixMode(5890)
        glLoadIdentity()
        glMatrixMode(5888)
        this.aHa_Sub2_3684.method3761(0, 0)
        this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        glBindProgramARB(34336, 0)
        glDisable(34336)
        glDisable(34820)
        aGlDisplayListFont_6222!!.method591(-1)
    }

    override fun method2137(i: Int): Boolean {
        if (i >= -5) return true
        anInt6215++
        return true
    }

    override fun method2133(i: Int) {
        anInt6231++
        if (aGlDisplayListFont_6222 != null) {
            if (i >= -75) method2134(true, false)
            aGlDisplayListFont_6222!!.method594('\u0001', 28666)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            this.aHa_Sub2_3684.method3771((-103).toByte(), null)
            this.aHa_Sub2_3684.method3738(-15039, 0)
        }
    }

    override fun method2134(bool: Boolean, bool_11_: Boolean) {
        anInt6232++
        if (aGlDisplayListFont_6222 != null) {
            aGlDisplayListFont_6222!!.method594('\u0000', 28666)
            this.aHa_Sub2_3684.method3738(-15039, 1)
            glMatrixMode(5890)
            if (bool_11_ == false) {
                glLoadMatrixf(this.aHa_Sub2_3684.aClass101_Sub3_7767.method940(1), 0)
                glMatrixMode(5888)
                this.aHa_Sub2_3684.method3738(-15039, 0)
                if (this.aHa_Sub2_3684.anInt7735 != anInt6219) {
                    var i = ((this.aHa_Sub2_3684.anInt7735) % 5000 * 128 / 5000)
                    for (i_12_ in 0..63) {
                        glProgramLocalParameter4fvARB(34336, i_12_, aFloatArray6218, i)
                        i += 2
                    }
                    if (aWaterTextureSet_6227!!.aBoolean1442) aFloat6225 = (this.aHa_Sub2_3684.anInt7735 % 4000).toFloat() / 4000.0f
                    else glProgramLocalParameter4fARB(34336, 65, 0.0f, 0.0f, 0.0f, 1.0f)
                    anInt6219 = (this.aHa_Sub2_3684.anInt7735)
                }
            }
        }
    }

    override fun method2139(bool: Boolean, i: Byte) {
        val i_13_ = 22 % ((-60 - i) / 38)
        anInt6229++
    }
}
