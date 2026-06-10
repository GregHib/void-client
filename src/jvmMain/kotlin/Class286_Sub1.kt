import Class50.Companion.method459
import jaggl.OpenGL.Companion.glBindProgramARB
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glProgramLocalParameter4fARB

class Class286_Sub1 internal constructor(var_ha_Sub2: ha_Sub2) : Class286(var_ha_Sub2) {
    private var aBoolean6183 = false
    private var aClass171_6187: Class171? = null
    private var aClass171_6188: Class171? = null
    private var aBoolean6193 = false
    private var aClass258_Sub3_6194: Class258_Sub3? = null
    private var aClass171_6196: Class171? = null
    private var aBoolean6197 = false
    private val aBoolean6198: Boolean
    private var aClass171_6199: Class171? = null
    fun method2141(bool: Boolean) {
        if (bool == false) {
            anInt6192++
            val class101_sub3 = (this.aHa_Sub2_3684.aClass101_Sub3_7766)
            if (!aBoolean6197) glBindProgramARB(34336, (if (this.aHa_Sub2_3684.anInt7788 == 2147483647) aClass171_6188!!.anInt2270 else aClass171_6199!!.anInt2270))
            else glBindProgramARB(34336, (if (this.aHa_Sub2_3684.anInt7788 != 2147483647) aClass171_6187!!.anInt2270 else aClass171_6196!!.anInt2270))
            class101_sub3.method937(true, 0.0f, 0.0f, -1.0f, (this.aHa_Sub2_3684.anInt7788).toFloat(), Class92.aFloatArray1528!!)
            glProgramLocalParameter4fARB(34336, 1, Class92.aFloatArray1528!![0], Class92.aFloatArray1528!![1], Class92.aFloatArray1528!![2], Class92.aFloatArray1528!![3])
            glEnable(34336)
            aBoolean6193 = true
            method2143(34336)
        }
    }

    override fun method2139(bool: Boolean, i: Byte) {
        val i_0_ = -82 / ((i - -60) / 38)
        anInt6190++
    }

    override fun method2137(i: Int): Boolean {
        anInt6202++
        if (i >= -5) return false
        return aBoolean6198
    }

    override fun method2134(bool: Boolean, bool_2_: Boolean) {
        aBoolean6197 = bool
        anInt6191++
        this.aHa_Sub2_3684.method3738(-15039, 1)
        this.aHa_Sub2_3684.method3771((-97).toByte(), aClass258_Sub3_6194)
        this.aHa_Sub2_3684.method3729(34165, 101.toByte(), 7681)
        this.aHa_Sub2_3684.method3762(34166, 768, (-87).toByte(), 0)
        this.aHa_Sub2_3684.method3762(5890, 770, (-87).toByte(), 2)
        this.aHa_Sub2_3684.method3775(bool_2_, 0, 770, 34168)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        method2141(false)
    }

    fun method2143(i: Int) {
        if (i == 34336) {
            if (aBoolean6193) {
                val i_3_ = this.aHa_Sub2_3684.XA()
                val i_4_ = this.aHa_Sub2_3684.i()
                val f = i_3_.toFloat() - 0.125f * (-i_4_ + i_3_).toFloat()
                val f_5_ = i_3_.toFloat() - 0.25f * (i_3_ - i_4_).toFloat()
                glProgramLocalParameter4fARB(34336, 0, f_5_, f, 1.0f / this.aHa_Sub2_3684.anInt7848.toFloat(), (this.aHa_Sub2_3684.anInt7809).toFloat() / 255.0f)
                this.aHa_Sub2_3684.method3738(-15039, 1)
                this.aHa_Sub2_3684.method3808(this.aHa_Sub2_3684.anInt7806, 122)
                this.aHa_Sub2_3684.method3738(-15039, 0)
            }
            anInt6184++
        }
    }

    init {
        if (this.aHa_Sub2_3684.aBoolean7841) {
            aClass171_6188 = (method459(
                34336,
                this.aHa_Sub2_3684,
                "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n",
                false
            ))
            aClass171_6196 = (method459(
                34336,
                this.aHa_Sub2_3684,
                "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n",
                false
            ))
            aClass171_6199 = (method459(
                34336,
                this.aHa_Sub2_3684,
                "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n",
                false
            ))
            aClass171_6187 = (method459(
                34336,
                this.aHa_Sub2_3684,
                "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n",
                false
            ))
            if ((aClass171_6187 != null) and ((aClass171_6188 != null) and (aClass171_6196 != null) and (aClass171_6199 != null))) {
                aClass258_Sub3_6194 = Class258_Sub3(var_ha_Sub2, 3553, 6406, 2, 1, false, byteArrayOf(0, -1), 6406, false)
                aClass258_Sub3_6194!!.method1965(false, false, 10243)
                aBoolean6198 = true
            } else aBoolean6198 = false
        } else aBoolean6198 = false
    }

    override fun method2133(i: Int) {
        if (i > -75) method2141(true)
        anInt6186++
        if (aBoolean6193) {
            glBindProgramARB(34336, 0)
            glDisable(34820)
            glDisable(34336)
            aBoolean6193 = false
        }
        this.aHa_Sub2_3684.method3738(-15039, 1)
        this.aHa_Sub2_3684.method3771((-97).toByte(), null)
        this.aHa_Sub2_3684.method3729(8448, (-61).toByte(), 8448)
        this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
        this.aHa_Sub2_3684.method3762(34166, 770, (-87).toByte(), 2)
        this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
        this.aHa_Sub2_3684.method3738(-15039, 0)
        if (aBoolean6183) {
            this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
            this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
            aBoolean6183 = false
        }
    }

    override fun method2136(i: Int, i_6_: Int, i_7_: Byte) {
        anInt6195++
        if (i_7_ > -42) method2139(true, (-81).toByte())
    }

    override fun method2140(class258: Class258?, i: Byte, i_8_: Int) {
        if (class258 == null) {
            if (!aBoolean6183) {
                this.aHa_Sub2_3684.method3771((-114).toByte(), (this.aHa_Sub2_3684.aClass258_Sub3_7827))
                this.aHa_Sub2_3684.method3761(0, 1)
                this.aHa_Sub2_3684.method3762(34168, 768, (-87).toByte(), 0)
                this.aHa_Sub2_3684.method3775(false, 0, 770, 34168)
                aBoolean6183 = true
            }
        } else {
            if (aBoolean6183) {
                this.aHa_Sub2_3684.method3762(5890, 768, (-87).toByte(), 0)
                this.aHa_Sub2_3684.method3775(false, 0, 770, 5890)
                aBoolean6183 = false
            }
            this.aHa_Sub2_3684.method3771((-105).toByte(), class258)
            this.aHa_Sub2_3684.method3761(0, i_8_)
        }
        if (i < -89) anInt6185++
    }

    companion object {
        @JvmField
        var anInt6184: Int = 0
        @JvmField
        var anInt6185: Int = 0
        @JvmField
        var anInt6186: Int = 0
        var anIntArray6189: IntArray? = IntArray(1)
        @JvmField
        var anInt6190: Int = 0
        @JvmField
        var anInt6191: Int = 0
        @JvmField
        var anInt6192: Int = 0
        @JvmField
        var anInt6195: Int = 0
        @JvmField
        var aStringArray6200: Array<String?>? = null
        @JvmField
        var aClass74_6201: Class74? = Class74(9, 19)
        @JvmField
        var anInt6202: Int = 0

        @JvmStatic
        fun method2142(i: Byte) {
            aStringArray6200 = null
            val i_1_ = 19 % ((i - -67) / 59)
            aClass74_6201 = null
            anIntArray6189 = null
        }
    }
}
